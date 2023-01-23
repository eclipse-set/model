/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.provider;


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

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZN_Fortschalt_Krit_Druck_AttributeGroupItemProvider 
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
	public ZN_Fortschalt_Krit_Druck_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK);
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
	 * This returns ZN_Fortschalt_Krit_Druck_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZN_Fortschalt_Krit_Druck_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZN_Fortschalt_Krit_Druck_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZN_Fortschalt_Krit_Druck_AttributeGroup.class)) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
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
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createAusfahrdruck_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createAusfahrdruck_Gegengleis_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createDurchfahrdruck_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createEinfahrdruck_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createEinfahrdruck_Gegengleis_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createMeldedruck_TypeClass()));
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
