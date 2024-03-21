/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.provider;


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

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrasseFactory;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Fstr_Zug_AttributeGroupItemProvider 
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
	public Fstr_Zug_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG);
			childrenFeatures.add(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT);
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
	 * This returns Fstr_Zug_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Fstr_Zug_AttributeGroup"));
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
		return getString("_UI_Fstr_Zug_AttributeGroup_type");
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

		switch (notification.getFeatureID(Fstr_Zug_AttributeGroup.class)) {
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART:
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
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
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG,
				 FahrstrasseFactory.eINSTANCE.createAutomatische_Einstellung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT,
				 FahrstrasseFactory.eINSTANCE.createFstr_Vsigabstand_Verkuerzt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART,
				 FahrstrasseFactory.eINSTANCE.createFstr_Zug_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG,
				 FahrstrasseFactory.eINSTANCE.createFstr_Zug_DWeg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG,
				 VerweiseFactory.eINSTANCE.createID_BUE_Einschaltung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT,
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));
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
