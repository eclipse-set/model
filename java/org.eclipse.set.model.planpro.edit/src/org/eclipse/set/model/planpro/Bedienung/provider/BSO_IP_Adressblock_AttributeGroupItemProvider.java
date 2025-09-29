/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.provider;


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

import org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungFactory;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Bedienung.BSO_IP_Adressblock_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BSO_IP_Adressblock_AttributeGroupItemProvider 
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
	public BSO_IP_Adressblock_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM);
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4);
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6);
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4);
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6);
			childrenFeatures.add(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH);
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
	 * This returns BSO_IP_Adressblock_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BSO_IP_Adressblock_AttributeGroup"));
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
		return getString("_UI_BSO_IP_Adressblock_AttributeGroup_type");
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

		switch (notification.getFeatureID(BSO_IP_Adressblock_AttributeGroup.class)) {
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM:
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4:
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6:
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4:
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6:
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH:
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
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__BSOIPAB_TEILSYSTEM,
				 BedienungFactory.eINSTANCE.createBSO_IP_AB_Teilsystem_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4,
				 BedienungFactory.eINSTANCE.createIP_Adressblock_Blau_V4_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6,
				 BedienungFactory.eINSTANCE.createIP_Adressblock_Blau_V6_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4,
				 BedienungFactory.eINSTANCE.createIP_Adressblock_Grau_V4_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6,
				 BedienungFactory.eINSTANCE.createIP_Adressblock_Grau_V6_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH,
				 BedienungFactory.eINSTANCE.createRegionalbereich_TypeClass()));
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
