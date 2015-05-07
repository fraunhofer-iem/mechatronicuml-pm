/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPortResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPortResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWPortResourceItemProvider extends HWPortItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortResourceItemProvider(AdapterFactory adapterFactory) {
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

			addPortKindPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addMultiHWPortPropertyDescriptor(object);
			addParentResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationResource_portKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationResource_portKind_feature", "_UI_CommunicationResource_type"),
				 HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PORT_KIND,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationResource_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationResource_protocol_feature", "_UI_CommunicationResource_type"),
				 HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PROTOCOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationResource_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationResource_cardinality_feature", "_UI_CommunicationResource_type"),
				 HwresourcePackage.Literals.COMMUNICATION_RESOURCE__CARDINALITY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi HW Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiHWPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationResource_multiHWPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationResource_multiHWPort_feature", "_UI_CommunicationResource_type"),
				 HwresourcePackage.Literals.COMMUNICATION_RESOURCE__MULTI_HW_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommunicationResource_parentResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommunicationResource_parentResource_feature", "_UI_CommunicationResource_type"),
				 HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PARENT_RESOURCE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HwresourcePackage.Literals.COMMUNICATION_RESOURCE__CARDINALITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HWPortResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWPortResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HWPortResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HWPortResource_type") :
			getString("_UI_HWPortResource_type") + " " + label;
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

		switch (notification.getFeatureID(HWPortResource.class)) {
			case HwresourceinstancePackage.HW_PORT_RESOURCE__PORT_KIND:
			case HwresourceinstancePackage.HW_PORT_RESOURCE__MULTI_HW_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwresourceinstancePackage.HW_PORT_RESOURCE__CARDINALITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.COMMUNICATION_RESOURCE__CARDINALITY,
				 ValuetypeFactory.eINSTANCE.createCardinality()));
	}

}
