/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Struktur.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;
import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Signalbegriff_ID_TypeClassItemProvider 
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
	public Signalbegriff_ID_TypeClassItemProvider(AdapterFactory adapterFactory) {
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

			addSymbolPropertyDescriptor(object);
			addAnmerkungenPropertyDescriptor(object);
			addBeleuchtbarPropertyDescriptor(object);
			addBeschreibungPropertyDescriptor(object);
			addGeltungsbereichDSPropertyDescriptor(object);
			addGeltungsbereichDVPropertyDescriptor(object);
			addGeltungsbereichSBahnBPropertyDescriptor(object);
			addGeltungsbereichSBahnHHPropertyDescriptor(object);
			addGueltigAbPropertyDescriptor(object);
			addGueltigBisPropertyDescriptor(object);
			addKurzbezeichnungDSPropertyDescriptor(object);
			addKurzbezeichnungDVPropertyDescriptor(object);
			addLangbezeichnungPropertyDescriptor(object);
			addSchaltbarPropertyDescriptor(object);
			addZusatzMoeglichPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_symbol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_symbol_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anmerkungen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnmerkungenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_anmerkungen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_anmerkungen_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beleuchtbar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeleuchtbarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_beleuchtbar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_beleuchtbar_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beschreibung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeschreibungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_beschreibung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_beschreibung_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geltungsbereich DS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeltungsbereichDSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_geltungsbereichDS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_geltungsbereichDS_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geltungsbereich DV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeltungsbereichDVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_geltungsbereichDV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_geltungsbereichDV_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geltungsbereich SBahn B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeltungsbereichSBahnBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_geltungsbereichSBahnB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_geltungsbereichSBahnB_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geltungsbereich SBahn HH feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeltungsbereichSBahnHHPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_geltungsbereichSBahnHH_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_geltungsbereichSBahnHH_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gueltig Ab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGueltigAbPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_gueltigAb_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_gueltigAb_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gueltig Bis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGueltigBisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_gueltigBis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_gueltigBis_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kurzbezeichnung DS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKurzbezeichnungDSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_kurzbezeichnungDS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_kurzbezeichnungDS_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kurzbezeichnung DV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKurzbezeichnungDVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_kurzbezeichnungDV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_kurzbezeichnungDV_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Langbezeichnung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangbezeichnungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_langbezeichnung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_langbezeichnung_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schaltbar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchaltbarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_schaltbar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_schaltbar_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zusatz Moeglich feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZusatzMoeglichPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Signalbegriff_ID_TypeClass_zusatzMoeglich_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Signalbegriff_ID_TypeClass_zusatzMoeglich_feature", "_UI_Signalbegriff_ID_TypeClass_type"),
				 Signalbegriffe_StrukturPackage.Literals.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
		String label = ((Signalbegriff_ID_TypeClass)object).getSymbol();
		return label == null || label.length() == 0 ?
			getString("_UI_Signalbegriff_ID_TypeClass_type") :
			getString("_UI_Signalbegriff_ID_TypeClass_type") + " " + label;
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

		switch (notification.getFeatureID(Signalbegriff_ID_TypeClass.class)) {
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR:
			case Signalbegriffe_StrukturPackage.SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
