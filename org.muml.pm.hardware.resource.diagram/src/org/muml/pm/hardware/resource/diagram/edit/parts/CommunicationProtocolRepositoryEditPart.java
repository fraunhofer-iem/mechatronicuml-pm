package org.muml.pm.hardware.resource.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy;
import org.muml.core.common.edit.policies.IBackgroundColorEditPolicy;
import org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy;
import org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy;
import org.muml.pm.hardware.resource.diagram.edit.policies.CommunicationProtocolRepositoryItemSemanticEditPolicy;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class CommunicationProtocolRepositoryEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	* MUML FIX: Adapt background color if IBackgroundColorEditPolicy is registered.
	* 
	* @generated
	*/
	@Override
	protected void refreshBackgroundColor() {
		EditPolicy backgroundColorPolicy = getEditPolicy(
				org.muml.core.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof IBackgroundColorEditPolicy) {
			setBackgroundColor(((IBackgroundColorEditPolicy) backgroundColorPolicy).getCurrentBackgroundColor());
		} else {
			super.refreshBackgroundColor();
		}
	}

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CommunicationProtocolRepositoryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(HardwareVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CommunicationProtocolRepositoryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(org.muml.core.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ProtocolRepositoryFigure();
	}

	/**
	 * @generated
	 */
	public ProtocolRepositoryFigure getPrimaryShape() {
		return (ProtocolRepositoryFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CommunicationProtocolRepositoryNameEditPart) {
			((CommunicationProtocolRepositoryNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureProtocolRepositoryNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureProtocolRepositoryCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CommunicationProtocolRepositoryNameEditPart) {
			return true;
		}
		if (childEditPart instanceof CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureProtocolRepositoryCompartmentFigure();
			pane.remove(
					((CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart) {
			return getPrimaryShape().getFigureProtocolRepositoryCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 90) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (IConnectionAnchorCreationEditPolicy) getEditPolicy(
						org.muml.core.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
				if (connectionAnchorCreationEditPolicy != null) {
					return connectionAnchorCreationEditPolicy.createDefaultAnchor();
				}
				return super.createDefaultAnchor();
			}
		};

		// Ensures that the element can be shrinked (Muml Bug #62).
		result.setMinimumSize(new Dimension(0, 0));

		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(
				HardwareVisualIDRegistry.getType(CommunicationProtocolRepositoryNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == HardwareElementTypes.BusProtocol_3017) {
				return getChildBySemanticHint(HardwareVisualIDRegistry
						.getType(CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID));
			}
			if (type == HardwareElementTypes.LinkProtocol_3018) {
				return getChildBySemanticHint(HardwareVisualIDRegistry
						.getType(CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ProtocolRepositoryFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProtocolRepositoryNameLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureProtocolRepositoryCompartmentFigure;

		/**
		 * @generated
		 */
		public ProtocolRepositoryFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.marginWidth = 1;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProtocolRepositoryNameLabelFigure = new WrappingLabel();

			fFigureProtocolRepositoryNameLabelFigure.setText("");

			fFigureProtocolRepositoryNameLabelFigure.setFont(FFIGUREPROTOCOLREPOSITORYNAMELABELFIGURE_FONT);

			GridData constraintFFigureProtocolRepositoryNameLabelFigure = new GridData();
			constraintFFigureProtocolRepositoryNameLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProtocolRepositoryNameLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureProtocolRepositoryNameLabelFigure.horizontalIndent = 0;
			constraintFFigureProtocolRepositoryNameLabelFigure.horizontalSpan = 1;
			constraintFFigureProtocolRepositoryNameLabelFigure.verticalSpan = 1;
			constraintFFigureProtocolRepositoryNameLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProtocolRepositoryNameLabelFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProtocolRepositoryNameLabelFigure, constraintFFigureProtocolRepositoryNameLabelFigure);

			fFigureProtocolRepositoryCompartmentFigure = new RectangleFigure();

			fFigureProtocolRepositoryCompartmentFigure.setOutline(false);

			GridData constraintFFigureProtocolRepositoryCompartmentFigure = new GridData();
			constraintFFigureProtocolRepositoryCompartmentFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProtocolRepositoryCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureProtocolRepositoryCompartmentFigure.horizontalIndent = 0;
			constraintFFigureProtocolRepositoryCompartmentFigure.horizontalSpan = 1;
			constraintFFigureProtocolRepositoryCompartmentFigure.verticalSpan = 1;
			constraintFFigureProtocolRepositoryCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProtocolRepositoryCompartmentFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProtocolRepositoryCompartmentFigure, constraintFFigureProtocolRepositoryCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProtocolRepositoryNameLabelFigure() {
			return fFigureProtocolRepositoryNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureProtocolRepositoryCompartmentFigure() {
			return fFigureProtocolRepositoryCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPROTOCOLREPOSITORYNAMELABELFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.BOLD);

}
