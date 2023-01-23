/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.PZB.PZBFactory;
import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PZB_Element_Zuordnung_BP_AttributeGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZB_Element_Zuordnung_BP_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT);
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
	 * This returns PZB_Element_Zuordnung_BP_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PZB_Element_Zuordnung_BP_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PZB_Element_Zuordnung_BP_AttributeGroup_type");
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

		switch (notification.getFeatureID(PZB_Element_Zuordnung_BP_AttributeGroup.class)) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
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
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT,
				 VerweiseFactory.eINSTANCE.createID_PZB_Element_Bezugspunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE,
				 PZBFactory.eINSTANCE.createINA_Gefahrstelle_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA,
				 PZBFactory.eINSTANCE.createPZB_Element_Zuordnung_INA_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT,
				 PZBFactory.eINSTANCE.createWirksamkeit_TypeClass()));
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
