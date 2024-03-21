/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.provider;


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

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESTW_ZE_Energieversorgung_AttributeGroupItemProvider 
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
	public ESTW_ZE_Energieversorgung_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER);
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
	 * This returns ESTW_ZE_Energieversorgung_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESTW_ZE_Energieversorgung_AttributeGroup"));
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
		return getString("_UI_ESTW_ZE_Energieversorgung_AttributeGroup_type");
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

		switch (notification.getFeatureID(ESTW_ZE_Energieversorgung_AttributeGroup.class)) {
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
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
				(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_Ersatz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER,
				 VerweiseFactory.eINSTANCE.createID_Energie_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_Ersatz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER,
				 VerweiseFactory.eINSTANCE.createID_Energie_TypeClass()));
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
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2 ||
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ ||
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER ||
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER;

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
