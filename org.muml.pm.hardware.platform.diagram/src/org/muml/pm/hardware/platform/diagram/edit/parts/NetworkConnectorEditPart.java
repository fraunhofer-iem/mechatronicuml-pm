package org.muml.pm.hardware.platform.diagram.edit.parts;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.muml.pm.hardware.platform.diagram.edit.policies.NetworkConnectorItemSemanticEditPolicy;

/**
 * @generated
 */
public class NetworkConnectorEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4032;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	 * @generated
	 */
	public NetworkConnectorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new NetworkConnectorItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ToBusFigure();
	}

	/**
	 * @generated
	 */
	public ToBusFigure getPrimaryShape() {
		return (ToBusFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ToBusFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ToBusFigure() {
			this.setLineWidth(2);

		}

	}

	/**
	 * Handles the property changed event.
	 * It additionally tests, if the source/target feature was changed and updates
	 * the Connection's visualization accordingly.
	 * @param notification The property changed event.
	 * @generated
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {

		// Fix for MechatronicUML BUG #17:
		// Connection does not refresh, after changing its source or target via
		// Properties View.
		EObject sourceElement = null;
		if (getSource() instanceof GraphicalEditPart) {
			sourceElement = ((GraphicalEditPart) getSource()).getNotationView().getElement();
		}
		EObject targetElement = null;
		if (getTarget() instanceof GraphicalEditPart) {
			targetElement = ((GraphicalEditPart) getTarget()).getNotationView().getElement();
		}
		if (notification.getOldValue() == sourceElement || notification.getOldValue() == targetElement) {
			Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					doCanonicalRefresh();
				}
			});
		}

		super.handleNotificationEvent(notification);
	}

	protected void doCanonicalRefresh() {
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(getDiagramView().getElement());
		for (CanonicalEditPolicy editPolicy : editPolicies) {
			editPolicy.refresh();
		}
	}

}
