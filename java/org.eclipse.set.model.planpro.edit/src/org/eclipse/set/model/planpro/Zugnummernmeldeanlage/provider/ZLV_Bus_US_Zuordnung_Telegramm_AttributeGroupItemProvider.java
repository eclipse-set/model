/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30);
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
	 * This returns ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class)) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
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
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_02_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_03_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_04_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_10_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_21_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createTelegramm_30_TypeClass()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlanProEditPlugin.INSTANCE;
	}

}
