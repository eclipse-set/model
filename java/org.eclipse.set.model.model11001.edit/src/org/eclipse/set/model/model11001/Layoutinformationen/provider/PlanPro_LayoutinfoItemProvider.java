/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Ur_ObjektItemProvider;

import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenFactory;
import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanPro_LayoutinfoItemProvider extends Ur_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanPro_LayoutinfoItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION);
			childrenFeatures.add(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL);
			childrenFeatures.add(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN);
			childrenFeatures.add(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT);
			childrenFeatures.add(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND);
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
	 * This returns PlanPro_Layoutinfo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlanPro_Layoutinfo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PlanPro_Layoutinfo_type");
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

		switch (notification.getFeatureID(PlanPro_Layoutinfo.class)) {
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
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
				(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION,
				 LayoutinformationenFactory.eINSTANCE.createElement_Position()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL,
				 LayoutinformationenFactory.eINSTANCE.createElement_Stil()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN,
				 LayoutinformationenFactory.eINSTANCE.createLageplan()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT,
				 LayoutinformationenFactory.eINSTANCE.createLageplan_Blattschnitt()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND,
				 LayoutinformationenFactory.eINSTANCE.createLageplan_Zustand()));
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
