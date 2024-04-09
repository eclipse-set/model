/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Factory;

import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff;
import org.eclipse.set.model.planpro.Signale.SignaleFactory;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Signal_SignalbegriffItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal_SignalbegriffItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID);
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
	 * This returns Signal_Signalbegriff.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Signal_Signalbegriff"));
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
		return getString("_UI_Signal_Signalbegriff_type");
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

		switch (notification.getFeatureID(Signal_Signalbegriff.class)) {
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
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
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN,
				 VerweiseFactory.eINSTANCE.createID_Signal_Rahmen_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG,
				 SignaleFactory.eINSTANCE.createSignal_Signalbegriff_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBSVAUES()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBSVRVA()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBSWdh()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBSZBSBer()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBSZusatz()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue00Lp()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue01Lp()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue01S()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue02Lp()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue02S()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue10LpBli()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue11LpBli()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue11SBli()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue12LpSt()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue12SSt()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue21R()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue22R()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue23R()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBue5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBueAT()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createBueKT()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl1v()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createEl6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElPfB()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElPfL()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElPfO()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElPfR()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElTAC()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createElTDC()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl10()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl11()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl12a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl12b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl3a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl3b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl6a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl6b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl7()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl8()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl9a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHl9b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHp0()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHp02Lp()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHp1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createHp2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createKl()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createKs1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createKs2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf12()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf1Wdh()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf4DS()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf4DV()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf5DS()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf5DV()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLf7()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLfPfL()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createLfPfR()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsGeD()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsRt()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsSkGe()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsSkRt()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsUESWdh()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsVw()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsWs2swP()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsWsGeWs()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsWsRtWs()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createMsWsSwWs()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe12()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe13a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe13b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe14()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe2VRVA()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe31str()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe32str()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe33str()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe34str()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe35str()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe7a()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createNe7b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzAutoET()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzAutoHET()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzBk()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzET()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzFa()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzGSMR()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzHET()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzHM()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzICE()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzLZBBer()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzOBGrenze()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzPZBBUE()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createOzZf()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createPf2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createRa10()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createRa11()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createRa11b()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createRa12()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createRa13()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSh0()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSh1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSh2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSk1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSk2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo106()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo14()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo15()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo191P()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo192P()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo193P()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSo20()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv0()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSv6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createSvWPf()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createTs1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createTs2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createTs3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createUkr()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createVr0()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createVr1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createVr2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn4()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn5()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWn7()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createWvs()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZlO()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZlU()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp10()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp10Ls()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp7()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp8()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp9()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZp9Ls()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs1()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs10()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs103()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs12()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs13()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs1A()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs2()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs2v()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs3()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs3v()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs6()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs7()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs8()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs8A()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID,
				 Signalbegriffe_Ril_301Factory.eINSTANCE.createZs9()));
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
