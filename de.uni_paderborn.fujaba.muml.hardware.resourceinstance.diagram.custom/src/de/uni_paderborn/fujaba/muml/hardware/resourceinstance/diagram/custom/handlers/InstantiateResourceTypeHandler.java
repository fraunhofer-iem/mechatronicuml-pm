package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.part.Activator;

public class InstantiateResourceTypeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<Resource> objects = new ArrayList<Resource>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
		for (Object selectedElement : ((IStructuredSelection) selection)
				.toArray()) {
			EObject object = null;
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null
					&& HwresourcePackage.Literals.RESOURCE.isSuperTypeOf(object
							.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((Resource) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(objects.get(0));
			instantiateResources(objects, null, editingDomain);
		}

		return null;
	}

	private void instantiateResources(final List<Resource> resources,
			final Shell shell, final EditingDomain editingDomain) {
		EObject container = resources.get(0);
		while (!(container instanceof RootNode)) {
			container = container.eContainer();
		}
		Activator
				.createInstance(editingDomain, resources, (RootNode) container);
	}
}
