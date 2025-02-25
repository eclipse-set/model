/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.ATO.ATOFactory;
import org.eclipse.set.model.planpro.ATO.ATOPackage;
import org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ATO_Segment_ProfileItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATO_Segment_ProfileItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A);
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__BEZEICHNUNG);
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ);
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR);
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDETCS_KANTE);
			childrenFeatures.add(ATOPackage.Literals.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT);
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
	 * This returns ATO_Segment_Profile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ATO_Segment_Profile"));
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
		return getString("_UI_ATO_Segment_Profile_type");
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

		switch (notification.getFeatureID(ATO_Segment_Profile.class)) {
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
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
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A,
				 ATOFactory.eINSTANCE.createAbstand_ATO_Halt_Vor_EoA_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__BEZEICHNUNG,
				 ATOFactory.eINSTANCE.createATO_Segment_Profile_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ,
				 VerweiseFactory.eINSTANCE.createID_ATO_TS_Instanz_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR,
				 VerweiseFactory.eINSTANCE.createID_ATO_TS_Instanz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__IDETCS_KANTE,
				 VerweiseFactory.eINSTANCE.createID_ETCS_Kante_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ATOPackage.Literals.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_Proxy_TypeClass()));
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
