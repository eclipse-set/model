/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.Ortung.FMA_Anlage;
import org.eclipse.set.model.planpro.Ortung.OrtungFactory;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FMA_AnlageItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_AnlageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__BEZEICHNUNG);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_ALLG);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_KASKADE);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__ID_GLEIS_ABSCHNITT);
			childrenFeatures.add(OrtungPackage.Literals.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE);
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
	 * This returns FMA_Anlage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FMA_Anlage"));
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
		return getString("_UI_FMA_Anlage_type");
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

		switch (notification.getFeatureID(FMA_Anlage.class)) {
			case OrtungPackage.FMA_ANLAGE__BEZEICHNUNG:
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ALLG:
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE:
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_KASKADE:
			case OrtungPackage.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO:
			case OrtungPackage.FMA_ANLAGE__ID_GLEIS_ABSCHNITT:
			case OrtungPackage.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE:
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
				(OrtungPackage.Literals.FMA_ANLAGE__BEZEICHNUNG,
				 OrtungFactory.eINSTANCE.createFMA_Anlage_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_ALLG,
				 OrtungFactory.eINSTANCE.createFMA_Anlage_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE,
				 OrtungFactory.eINSTANCE.createFMA_Anlage_Elektr_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_KASKADE,
				 OrtungFactory.eINSTANCE.createFMA_Anlage_Kaskade_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO,
				 OrtungFactory.eINSTANCE.createFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__ID_GLEIS_ABSCHNITT,
				 VerweiseFactory.eINSTANCE.createID_Gleis_Abschnitt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE,
				 VerweiseFactory.eINSTANCE.createID_Aussenelementansteuerung_TypeClass()));
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
