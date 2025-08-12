/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Ur_ObjektItemProvider;

import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenFactory;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Lageplan_BlattschnittItemProvider extends Ur_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lageplan_BlattschnittItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG);
			childrenFeatures.add(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG);
			childrenFeatures.add(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT);
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
	 * This returns Lageplan_Blattschnitt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lageplan_Blattschnitt"));
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
		return getString("_UI_Lageplan_Blattschnitt_type");
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

		switch (notification.getFeatureID(Lageplan_Blattschnitt.class)) {
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
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
				(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG,
				 LayoutinformationenFactory.eINSTANCE.createLageplan_Blattschnitt_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG,
				 LayoutinformationenFactory.eINSTANCE.createPolygonzug_Ausrichtung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT,
				 LayoutinformationenFactory.eINSTANCE.createPolygonzug_Blattschnitt_TypeClass()));
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
