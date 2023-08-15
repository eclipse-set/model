/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte.provider;


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

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjekteFactory;
import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Material_AttributeGroup;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Basisobjekte.LO_Material_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LO_Material_AttributeGroupItemProvider 
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
	public LO_Material_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND);
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG);
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE);
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR);
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER);
			childrenFeatures.add(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER);
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
	 * This returns LO_Material_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LO_Material_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LO_Material_AttributeGroup_type");
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

		switch (notification.getFeatureID(LO_Material_AttributeGroup.class)) {
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND:
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG:
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE:
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR:
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER:
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER:
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
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND,
				 BasisobjekteFactory.eINSTANCE.createLO_Ausgabestand_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG,
				 BasisobjekteFactory.eINSTANCE.createLO_Datum_Herstellung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE,
				 BasisobjekteFactory.eINSTANCE.createLO_DB_Freigabe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR,
				 BasisobjekteFactory.eINSTANCE.createLO_EMA_Nr_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER,
				 BasisobjekteFactory.eINSTANCE.createLO_Firmensachnummer_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER,
				 BasisobjekteFactory.eINSTANCE.createLO_Seriennummer_TypeClass()));
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
