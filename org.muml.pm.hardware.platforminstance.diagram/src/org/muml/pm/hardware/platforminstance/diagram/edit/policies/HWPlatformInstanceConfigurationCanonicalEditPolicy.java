package org.muml.pm.hardware.platforminstance.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;
import org.muml.core.common.edit.policies.IDiagramCanonicalEditPolicy;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareDiagramUpdater;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareLinkDescriptor;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareNodeDescriptor;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;

/**
 * @generated
 */
public class HWPlatformInstanceConfigurationCanonicalEditPolicy extends CanonicalEditPolicy
		implements IDiagramCanonicalEditPolicy {

	private boolean canonicalNodes = true;

	public HWPlatformInstanceConfigurationCanonicalEditPolicy() {
	}

	public HWPlatformInstanceConfigurationCanonicalEditPolicy(boolean canonicalNodes) {
		this.canonicalNodes = canonicalNodes;
	}

	/**
	 * @generated
	 */
	private List<String> noConnectionViews = new ArrayList<String>();

	/**
	 * @generated
	 */
	public void addNoConnectionView(String type) {
		noConnectionViews.add(type);
	}

	/**
	 * @generated
	 */
	public void removeNoConnectionView(String type) {
		noConnectionViews.remove(type);
	}

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return HwplatforminstancePackage.eINSTANCE.getHWPlatformInstanceConfiguration_HwplatformInstances();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		List<HardwareNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<EObject> result = new LinkedList<EObject>();
		for (HardwareNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */

	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenViewDescriptors() {
		// Begin added to switch off toplevel canonical behavior:
		if (!canonicalNodes) {
			View containerView = (View) getHost().getModel();
			List<View> childViews = containerView.getChildren();
			List<HardwareNodeDescriptor> result = new LinkedList<HardwareNodeDescriptor>();

			for (View childView : childViews) {
				EObject childElement = childView.getElement();
				int visualID = HardwareVisualIDRegistry.getVisualID(childView);
				List<Integer> visualIDs = Arrays.asList(new Integer[] { HWPlatformInstanceEditPart.VISUAL_ID });

				// Note: childElement can be null, for diagram annotations!
				if (childElement == null
						|| childElement.eContainer() == containerView.getElement() && visualIDs.contains(visualID)) {
					result.add(new HardwareNodeDescriptor(childElement, visualID));
					continue;
				}
			}
			return result;
		}
		// End added

		View viewObject = (View) getHost().getModel();
		return HardwareDiagramUpdater.getHWPlatformInstanceConfiguration_1000SemanticChildren(viewObject);

	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		return HWPlatformInstanceEditPart.VISUAL_ID == HardwareVisualIDRegistry.getVisualID(view);
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<HardwareNodeDescriptor> childDescriptors = getSemanticChildrenViewDescriptors();
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<HardwareNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator
				.hasNext();) {
			HardwareNodeDescriptor next = descriptorsIterator.next();
			String hint = HardwareVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();

				// Note: semanticElement can be null, for diagram annotations!
				if (semanticElement != null && semanticElement.equals(next.getModelElement())) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (HardwareNodeDescriptor next : childDescriptors) {
			String hint = HardwareVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection<HardwareLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = HardwareVisualIDRegistry.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
				for (Iterator<HardwareLinkDescriptor> linkDescriptorsIterator = linkDescriptors
						.iterator(); linkDescriptorsIterator.hasNext();) {
					HardwareLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
					if (diagramLinkObject == nextLinkDescriptor.getModelElement()
							&& diagramLinkSrc == nextLinkDescriptor.getSource()
							&& diagramLinkDst == nextLinkDescriptor.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
						linksIterator.remove();
						linkDescriptorsIterator.remove();
						break;
					}
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection<HardwareLinkDescriptor> collectAllLinks(View view, Domain2Notation domain2NotationMap) {
		if (!HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<HardwareLinkDescriptor> result = new LinkedList<HardwareLinkDescriptor>();
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getHWPlatformInstanceConfiguration_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HWPlatformInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getHWPlatformInstance_2005ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getHWPlatformInstanceConfiguration_3039ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HWPlatformInstance2EditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getHWPlatformInstance_3040ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case DelegationHWPortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getDelegationHWPortInstance_3041ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case StructuredResourceInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getStructuredResourceInstance_3042ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case HWPortInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getHWPortInstance_3043ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActuatorInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getActuatorInstance_3044ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case SensorInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getSensorInstance_3045ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case BusInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getBusInstance_3046ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NetworkBridgeInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getNetworkBridgeInstance_3047ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case NetworkConnectorInstanceEditPart.VISUAL_ID: {
			if (noConnectionViews.contains(view.getType())) {
				// MUML TICKET #1247
				break;
			}
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(HardwareDiagramUpdater.getNetworkConnectorInstance_4012ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(Collection<HardwareLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (HardwareLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					HardwareVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	protected EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected final EditPart getHintedEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap,
			int hintVisualId) {
		View view = (View) domain2NotationMap.getHinted(domainModelElement,
				HardwareVisualIDRegistry.getType(hintVisualId));
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap<EObject, View> {
		/**
		 * @generated
		 */
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		/**
		 * @generated
		 */
		public View getHinted(EObject domainEObject, String hint) {
			return this.get(domainEObject);
		}

		/**
		 * @generated
		 */
		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement())) {
				this.put(domainElement, view);
			}
		}

	}
}
