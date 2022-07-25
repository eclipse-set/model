/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model1902.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.model.model1902.Bedienung.BedienungFactory;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model1902.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bedien_Einrichtung_OertlichItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Einrichtung_OertlichItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG);
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
	 * This returns Bedien_Einrichtung_Oertlich.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bedien_Einrichtung_Oertlich"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Bedien_Einrichtung_Oertlich_type");
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

		switch (notification.getFeatureID(Bedien_Einrichtung_Oertlich.class)) {
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
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
				(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG,
				 BedienungFactory.eINSTANCE.createBedien_Einricht_Oertlich_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG,
				 BedienungFactory.eINSTANCE.createBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG,
				 VerweiseFactory.eINSTANCE.createID_Aussenelementansteuerung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG,
				 VerweiseFactory.eINSTANCE.createID_Unterbringung_TypeClass()));
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
