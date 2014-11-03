package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.hwport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomHWPortFigure.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

/**
 * Base edit policy for all {@link HWPortPart}s that uses the
 * CustomHWPortFigure. Provides handling model notifications and updating the
 * hwport figure accordingly.
 * 
 * @author adann
 * 
 */
public class HWPortPartEditPolicy extends HWPortBaseEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		/**
		 * 
		 */
		if (feature == HwplatformPackage.Literals.HW_PORT_PART__COMMUNICATION_RESOURCE) {
			refreshHWPortFigure();

		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Returns whether its HWPortInstance is a delegation port.
	 * 
	 */
	@Override
	protected boolean isDelegationPort() {

		return false;
	}

	@Override
	protected boolean isMultiHWPort() {
		EObject element = getSemanticElement();

		HWPortPart hwPortPart = null;

		if (element != null) {
			if (HwplatformPackage.Literals.HW_PORT_PART.isSuperTypeOf(element
					.eClass())) {
				hwPortPart = (HWPortPart) element;
			}
		}
		if (hwPortPart == null) {
			return false;
		}
		return hwPortPart.isMultiHWPort();
	}

	@Override
	protected HWPortKind getHWPortKind() {
		EObject element = getSemanticElement();
		HWPortKind kind = HWPortKind.BUS;
		de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind modelPortKind = de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS;
		HWPortPart hwPortPart = null;
		if (element != null) {
			if (HwplatformPackage.Literals.HW_PORT_PART.isSuperTypeOf(element
					.eClass())) {
				hwPortPart = (HWPortPart) element;
			}
		}

		if (hwPortPart != null) {
			modelPortKind = hwPortPart.getPortKind();
		}
		switch (modelPortKind.getValue()) {
		case (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.BUS_VALUE):
			kind = HWPortKind.BUS;
			break;
		case (de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind.LINK_VALUE):
			kind = HWPortKind.LINK;
			break;

		}
		return kind;
	}

	@Override
	protected boolean isOptionalPort() {
		EObject element = getSemanticElement();
		HWPortPart portPart = (HWPortPart) element;

		return portPart.getCardinality().getLowerBound().getValue() == 0;
	}
}
