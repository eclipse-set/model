/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren.provider;


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

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenFactory;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Weiche_Element_AttributeGroupItemProvider 
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
	public Weiche_Element_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE);
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
	 * This returns Weiche_Element_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Weiche_Element_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Weiche_Element_AttributeGroup_type");
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

		switch (notification.getFeatureID(Weiche_Element_AttributeGroup.class)) {
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
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
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createAuffahrortung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createGZ_Freimeldung_L_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createGZ_Freimeldung_R_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN,
				 VerweiseFactory.eINSTANCE.createID_Grenzzeichen_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL,
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createWeiche_Betriebsart_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createWeiche_Vorzugslage_TypeClass()));
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
