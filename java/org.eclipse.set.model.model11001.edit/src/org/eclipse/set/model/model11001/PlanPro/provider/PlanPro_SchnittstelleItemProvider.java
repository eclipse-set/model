/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Ur_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.PlanProFactory;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;
import org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanPro_SchnittstelleItemProvider extends Ur_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanPro_SchnittstelleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_PlanProSchnittstelleAllg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_LSTPlanung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_LSTZustand());
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
	 * This returns PlanPro_Schnittstelle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlanPro_Schnittstelle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PlanPro_Schnittstelle_type");
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

		switch (notification.getFeatureID(PlanPro_Schnittstelle.class)) {
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
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
				(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_PlanProSchnittstelleAllg(),
				 PlanProFactory.eINSTANCE.createPlanPro_Schnittstelle_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_LSTPlanung(),
				 PlanProFactory.eINSTANCE.createLST_Planung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_LSTZustand(),
				 PlanProFactory.eINSTANCE.createLST_Zustand()));
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
