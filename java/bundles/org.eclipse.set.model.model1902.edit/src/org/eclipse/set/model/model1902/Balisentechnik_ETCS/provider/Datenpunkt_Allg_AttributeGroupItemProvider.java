/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Datenpunkt_Allg_AttributeGroupItemProvider 
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
	public Datenpunkt_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_Anwendungssystem());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_Ausrichtung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_DatenpunktBeschreibung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_DatenpunktLaenge());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_SonstigeStandortangabe());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_StandortangabeBalisenschild());
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
	 * This returns Datenpunkt_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Datenpunkt_Allg_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Datenpunkt_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(Datenpunkt_Allg_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_Anwendungssystem(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAnwendungssystem_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_Ausrichtung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAusrichtung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_DatenpunktBeschreibung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt_Beschreibung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_DatenpunktLaenge(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt_Laenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_SonstigeStandortangabe(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSonstige_Standortangabe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup_StandortangabeBalisenschild(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createStandortangabe_Balisenschild_TypeClass()));
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
