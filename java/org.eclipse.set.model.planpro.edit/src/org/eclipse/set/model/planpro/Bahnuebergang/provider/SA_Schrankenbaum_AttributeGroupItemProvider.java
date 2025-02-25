/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.provider;


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

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangFactory;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SA_Schrankenbaum_AttributeGroupItemProvider 
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
	public SA_Schrankenbaum_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Ausrichtung());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_AusrichtungWinkel());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Baumprofil());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Gitterbehang());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_LagerungArt());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Lieferlaenge());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_MontageAusgleichsgewichte());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Sperrlaenge());
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
	 * This returns SA_Schrankenbaum_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SA_Schrankenbaum_AttributeGroup"));
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
		return getString("_UI_SA_Schrankenbaum_AttributeGroup_type");
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

		switch (notification.getFeatureID(SA_Schrankenbaum_AttributeGroup.class)) {
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
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
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Ausrichtung(),
				 BahnuebergangFactory.eINSTANCE.createAusrichtung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_AusrichtungWinkel(),
				 BahnuebergangFactory.eINSTANCE.createAusrichtung_Winkel_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Baumprofil(),
				 BahnuebergangFactory.eINSTANCE.createBaumprofil_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Gitterbehang(),
				 BahnuebergangFactory.eINSTANCE.createGitterbehang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_LagerungArt(),
				 BahnuebergangFactory.eINSTANCE.createLagerung_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Lieferlaenge(),
				 BahnuebergangFactory.eINSTANCE.createLieferlaenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_MontageAusgleichsgewichte(),
				 BahnuebergangFactory.eINSTANCE.createMontage_Ausgleichsgewichte_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup_Sperrlaenge(),
				 BahnuebergangFactory.eINSTANCE.createSperrlaenge_TypeClass()));
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
