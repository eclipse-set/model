/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung.provider;


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

import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.OrtungFactory;
import org.eclipse.set.model.model11001.Ortung.OrtungPackage;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FMA_Anlage_Elektr_Merkmale_AttributeGroupItemProvider 
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
	public FMA_Anlage_Elektr_Merkmale_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S);
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
	 * This returns FMA_Anlage_Elektr_Merkmale_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FMA_Anlage_Elektr_Merkmale_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FMA_Anlage_Elektr_Merkmale_AttributeGroup_type");
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

		switch (notification.getFeatureID(FMA_Anlage_Elektr_Merkmale_AttributeGroup.class)) {
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
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
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND,
				 OrtungFactory.eINSTANCE.createBettungswiderstand_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_Beeinflusst_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_E1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_E2_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_E3_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S,
				 OrtungFactory.eINSTANCE.createFMA_Laenge_S_TypeClass()));
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
