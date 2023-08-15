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

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenFactory;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class W_Kr_Gsp_KomponenteItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_KomponenteItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__KREUZUNG);
			childrenFeatures.add(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ZUNGENPAAR);
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
	 * This returns W_Kr_Gsp_Komponente.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/W_Kr_Gsp_Komponente"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_W_Kr_Gsp_Komponente_type");
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

		switch (notification.getFeatureID(W_Kr_Gsp_Komponente.class)) {
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
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
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__AUSTAUSCH_ANTRIEBE,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createAustausch_Antriebe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG,
				 VerweiseFactory.eINSTANCE.createID_Regelzeichnung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT,
				 VerweiseFactory.eINSTANCE.createID_W_Kr_Gsp_Element_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createBesonderes_Fahrwegelement_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createEntgleisungsschuh_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__KREUZUNG,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createKreuzung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE__ZUNGENPAAR,
				 Weichen_und_GleissperrenFactory.eINSTANCE.createZungenpaar_AttributeGroup()));
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
