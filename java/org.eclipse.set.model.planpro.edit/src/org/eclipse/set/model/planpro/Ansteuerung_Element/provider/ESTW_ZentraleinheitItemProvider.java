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

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESTW_ZentraleinheitItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESTW_ZentraleinheitItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__BEZEICHNUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL);
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
	 * This returns ESTW_Zentraleinheit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESTW_Zentraleinheit"));
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
		return getString("_UI_ESTW_Zentraleinheit_type");
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

		switch (notification.getFeatureID(ESTW_Zentraleinheit.class)) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
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
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__BEZEICHNUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_Zentraleinheit_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_ZE_Energieversorgung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_Zentraleinheit_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG,
				 VerweiseFactory.eINSTANCE.createID_Unterbringung_Technik_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL,
				 VerweiseFactory.eINSTANCE.createID_Bedien_Bezirk_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL,
				 VerweiseFactory.eINSTANCE.createID_Bedien_Bezirk_TypeClass()));
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
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL ||
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL;

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
