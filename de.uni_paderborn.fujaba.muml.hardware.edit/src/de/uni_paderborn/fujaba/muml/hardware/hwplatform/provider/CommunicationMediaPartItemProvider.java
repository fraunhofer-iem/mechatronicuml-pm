/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationMediaPartItemProvider
	extends NetworkingHardwarePartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMediaPartItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCommunicationMediaPropertyDescriptor(object);
			addBandwidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Communication Media feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationMediaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMediaPart_communicationMedia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMediaPart_communicationMedia_feature", "_UI_CommunicationMediaPart_type"),
				 HwplatformPackage.Literals.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationMediaPart_bandwidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationMediaPart_bandwidth_feature", "_UI_CommunicationMediaPart_type"),
				 HwplatformPackage.Literals.COMMUNICATION_MEDIA_PART__BANDWIDTH,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CommunicationMediaPart_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CommunicationMediaPart.class)) {
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__PROTOCOL:
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
