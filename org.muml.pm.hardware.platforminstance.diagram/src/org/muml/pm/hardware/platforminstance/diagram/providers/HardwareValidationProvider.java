package org.muml.pm.hardware.platforminstance.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;

/**
 * @generated
 */
public class HardwareValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				PlatformInstanceDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive && HWPlatformInstanceConfigurationEditPart.MODEL_ID
					.equals(HardwareVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
