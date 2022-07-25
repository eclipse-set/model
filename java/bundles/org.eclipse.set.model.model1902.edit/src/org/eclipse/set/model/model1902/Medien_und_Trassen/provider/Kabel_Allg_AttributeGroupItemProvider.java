/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen.provider;


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

import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenFactory;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Kabel_Allg_AttributeGroupItemProvider 
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
	public Kabel_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER);
			childrenFeatures.add(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT);
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
	 * This returns Kabel_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Kabel_Allg_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Kabel_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(Kabel_Allg_AttributeGroup.class)) {
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
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
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE,
				 Medien_und_TrassenFactory.eINSTANCE.createAder_Reserve_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE,
				 Medien_und_TrassenFactory.eINSTANCE.createAnzahl_Verseilelemente_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART,
				 Medien_und_TrassenFactory.eINSTANCE.createKabel_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE,
				 Medien_und_TrassenFactory.eINSTANCE.createKabel_Laenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP,
				 Medien_und_TrassenFactory.eINSTANCE.createKabel_Typ_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART,
				 Medien_und_TrassenFactory.eINSTANCE.createVerseilart_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER,
				 Medien_und_TrassenFactory.eINSTANCE.createAder_Durchmesser_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT,
				 Medien_und_TrassenFactory.eINSTANCE.createAder_Querschnitt_TypeClass()));
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
