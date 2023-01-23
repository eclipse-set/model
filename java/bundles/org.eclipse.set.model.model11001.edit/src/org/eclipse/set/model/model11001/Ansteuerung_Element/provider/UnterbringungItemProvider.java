/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjekteFactory;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnterbringungItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnterbringungItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__UNTERBRINGUNG_ALLG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__IDGEO_PUNKT);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__STANDORT_BESCHREIBUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__UNTERBRINGUNG_POLYGONZUG);
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
	 * This returns Unterbringung.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Unterbringung"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Unterbringung_type");
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

		switch (notification.getFeatureID(Unterbringung.class)) {
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_POLYGONZUG:
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
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE,
				 BasisobjekteFactory.eINSTANCE.createPunkt_Objekt_Strecke_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__UNTERBRINGUNG_ALLG,
				 Ansteuerung_ElementFactory.eINSTANCE.createUnterbringung_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__IDGEO_PUNKT,
				 VerweiseFactory.eINSTANCE.createID_GEO_Punkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE,
				 BasisobjekteFactory.eINSTANCE.createPunkt_Objekt_TOP_Kante_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__STANDORT_BESCHREIBUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createStandort_Beschreibung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG__UNTERBRINGUNG_POLYGONZUG,
				 Ansteuerung_ElementFactory.eINSTANCE.createUnterbringung_Polygonzug_TypeClass()));
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
