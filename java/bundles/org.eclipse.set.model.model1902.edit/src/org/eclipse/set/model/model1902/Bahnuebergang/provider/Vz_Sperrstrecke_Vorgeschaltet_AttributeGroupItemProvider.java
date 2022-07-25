/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.provider;


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

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangFactory;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupItemProvider 
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
	public Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_BeeinflussungStrassenverkehr());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDAB());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDBK());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDCK());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDSKStrich());
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
	 * This returns Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup_type");
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

		switch (notification.getFeatureID(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup.class)) {
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
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
				(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_BeeinflussungStrassenverkehr(),
				 BahnuebergangFactory.eINSTANCE.createBeeinflussung_Strassenverkehr_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDAB(),
				 BahnuebergangFactory.eINSTANCE.createRaeumstrecke_DAB_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDBK(),
				 BahnuebergangFactory.eINSTANCE.createRaeumstrecke_DBK_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDCK(),
				 BahnuebergangFactory.eINSTANCE.createRaeumstrecke_DCK_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup_RaeumstreckeDSKStrich(),
				 BahnuebergangFactory.eINSTANCE.createRaeumstrecke_DSK_Strich_TypeClass()));
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
