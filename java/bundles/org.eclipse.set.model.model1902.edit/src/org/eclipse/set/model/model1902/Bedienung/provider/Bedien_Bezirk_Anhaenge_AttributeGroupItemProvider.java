/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.provider;


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

import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model1902.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bedien_Bezirk_Anhaenge_AttributeGroupItemProvider 
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
	public Bedien_Bezirk_Anhaenge_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3);
			childrenFeatures.add(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT);
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
	 * This returns Bedien_Bezirk_Anhaenge_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bedien_Bezirk_Anhaenge_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Bedien_Bezirk_Anhaenge_AttributeGroup_type");
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

		switch (notification.getFeatureID(Bedien_Bezirk_Anhaenge_AttributeGroup.class)) {
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
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
				(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2 ||
			childFeature == BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3 ||
			childFeature == BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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