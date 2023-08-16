/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Uebertragungsweg;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Ansteuerung_Element.Uebertragungsweg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UebertragungswegItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UebertragungswegItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK);
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
	 * This returns Uebertragungsweg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Uebertragungsweg"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Uebertragungsweg_type");
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

		switch (notification.getFeatureID(Uebertragungsweg.class)) {
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
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
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON,
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH,
				 VerweiseFactory.eINSTANCE.createID_Uebertragungsweg_Nach_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON,
				 VerweiseFactory.eINSTANCE.createID_Uebertragungsweg_Von_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART,
				 Ansteuerung_ElementFactory.eINSTANCE.createUebertragungsweg_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK,
				 Ansteuerung_ElementFactory.eINSTANCE.createUebertragungsweg_Technik_AttributeGroup()));
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
			childFeature == Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH ||
			childFeature == Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON;

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
