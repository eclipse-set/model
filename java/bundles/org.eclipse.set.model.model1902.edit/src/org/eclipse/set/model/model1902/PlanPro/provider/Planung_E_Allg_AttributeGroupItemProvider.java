/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.provider;


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

import org.eclipse.set.model.model1902.PlanPro.PlanProFactory;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.Planung_E_Allg_AttributeGroup;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Planung_E_Allg_AttributeGroupItemProvider 
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
	public Planung_E_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_Bauphase());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_BauzustandKurzbezeichnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_BauzustandLangbezeichnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_DatumAbschlussEinzel());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_DatumRegelwerksstand());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_IndexAusgabe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_Informativ());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_LaufendeNummerAusgabe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_PlanungEArt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_PlanungPhase());
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
	 * This returns Planung_E_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planung_E_Allg_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Planung_E_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(Planung_E_Allg_AttributeGroup.class)) {
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUPHASE:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_KURZBEZEICHNUNG:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__BAUZUSTAND_LANGBEZEICHNUNG:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_EINZEL:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__DATUM_REGELWERKSSTAND:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INDEX_AUSGABE:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__INFORMATIV:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__LAUFENDE_NUMMER_AUSGABE:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_EART:
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP__PLANUNG_PHASE:
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
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_Bauphase(),
				 PlanProFactory.eINSTANCE.createBauphase_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_BauzustandKurzbezeichnung(),
				 PlanProFactory.eINSTANCE.createBauzustand_Kurzbezeichnung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_BauzustandLangbezeichnung(),
				 PlanProFactory.eINSTANCE.createBauzustand_Langbezeichnung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_DatumAbschlussEinzel(),
				 PlanProFactory.eINSTANCE.createDatum_Abschluss_Einzel_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_DatumRegelwerksstand(),
				 PlanProFactory.eINSTANCE.createDatum_Regelwerksstand_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_IndexAusgabe(),
				 PlanProFactory.eINSTANCE.createIndex_Ausgabe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_Informativ(),
				 PlanProFactory.eINSTANCE.createInformativ_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_LaufendeNummerAusgabe(),
				 PlanProFactory.eINSTANCE.createLaufende_Nummer_Ausgabe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_PlanungEArt(),
				 PlanProFactory.eINSTANCE.createPlanung_E_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Allg_AttributeGroup_PlanungPhase(),
				 PlanProFactory.eINSTANCE.createPlanung_Phase_TypeClass()));
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
