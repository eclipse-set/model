/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupItemProvider 
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
	public Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS1());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS2());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS3());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS1());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS2());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS3());
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
	 * This returns Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_type");
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

		switch (notification.getFeatureID(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS1(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBez_Strecke_BTS_1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS2(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBez_Strecke_BTS_2_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS3(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBez_Strecke_BTS_3_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS1(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createKm_BTS_1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS2(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createKm_BTS_2_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS3(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createKm_BTS_3_TypeClass()));
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
