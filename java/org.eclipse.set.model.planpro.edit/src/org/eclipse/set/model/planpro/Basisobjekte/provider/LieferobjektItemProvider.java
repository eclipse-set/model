/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjekteFactory;
import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LieferobjektItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LieferobjektItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BasisobjektePackage.Literals.LIEFEROBJEKT__BESCHREIBUNG);
			childrenFeatures.add(BasisobjektePackage.Literals.LIEFEROBJEKT__IDGEO_PUNKT);
			childrenFeatures.add(BasisobjektePackage.Literals.LIEFEROBJEKT__IDLO_EINBAU);
			childrenFeatures.add(BasisobjektePackage.Literals.LIEFEROBJEKT__LO_ERSATZ);
			childrenFeatures.add(BasisobjektePackage.Literals.LIEFEROBJEKT__LO_MATERIAL);
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
	 * This returns Lieferobjekt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lieferobjekt"));
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
		return getString("_UI_Lieferobjekt_type");
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

		switch (notification.getFeatureID(Lieferobjekt.class)) {
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
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
				(BasisobjektePackage.Literals.LIEFEROBJEKT__BESCHREIBUNG,
				 BasisobjekteFactory.eINSTANCE.createBeschreibung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LIEFEROBJEKT__IDGEO_PUNKT,
				 VerweiseFactory.eINSTANCE.createID_GEO_Punkt_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LIEFEROBJEKT__IDLO_EINBAU,
				 VerweiseFactory.eINSTANCE.createID_LO_Einbau_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LIEFEROBJEKT__LO_ERSATZ,
				 BasisobjekteFactory.eINSTANCE.createLO_Ersatz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LIEFEROBJEKT__LO_MATERIAL,
				 BasisobjekteFactory.eINSTANCE.createLO_Material_AttributeGroup()));
	}

}
