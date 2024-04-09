/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrasseFactory;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Fstr_DWegItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_DWegItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__BEZEICHNUNG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__FSTR_DWEG_ALLG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__ID_FSTR_FAHRWEG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_DWEG__IDPZB_GEFAHRPUNKT);
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
	 * This returns Fstr_DWeg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Fstr_DWeg"));
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
		return getString("_UI_Fstr_DWeg_type");
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

		switch (notification.getFeatureID(Fstr_DWeg.class)) {
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
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
				(FahrstrassePackage.Literals.FSTR_DWEG__BEZEICHNUNG,
				 FahrstrasseFactory.eINSTANCE.createFstr_DWeg_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_DWEG__FSTR_DWEG_ALLG,
				 FahrstrasseFactory.eINSTANCE.createFstr_DWeg_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH,
				 FahrstrasseFactory.eINSTANCE.createFstr_DWeg_Spezifisch_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG,
				 VerweiseFactory.eINSTANCE.createID_FMA_Anlage_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_DWEG__ID_FSTR_FAHRWEG,
				 VerweiseFactory.eINSTANCE.createID_Fstr_Fahrweg_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_DWEG__IDPZB_GEFAHRPUNKT,
				 VerweiseFactory.eINSTANCE.createID_Markanter_Punkt_TypeClass()));
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