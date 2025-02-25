/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.provider;


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

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjekteFactory;

import org.eclipse.set.model.planpro.PlanPro.PlanProFactory;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Planung_G_Allg_AttributeGroupItemProvider 
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
	public Planung_G_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_AnhangBAST());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_DatumAbschlussGruppe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_PlanProXSDVersion());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_PlanungGArtBesonders());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_UntergewerkArt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_VerantwortlicheStelleDB());
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
	 * This returns Planung_G_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planung_G_Allg_AttributeGroup"));
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
		return getString("_UI_Planung_G_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(Planung_G_Allg_AttributeGroup.class)) {
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
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
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_AnhangBAST(),
				 BasisobjekteFactory.eINSTANCE.createAnhang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_DatumAbschlussGruppe(),
				 PlanProFactory.eINSTANCE.createDatum_Abschluss_Gruppe_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_PlanProXSDVersion(),
				 PlanProFactory.eINSTANCE.createPlanPro_XSD_Version_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_PlanungGArtBesonders(),
				 PlanProFactory.eINSTANCE.createPlanung_G_Art_Besonders_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_UntergewerkArt(),
				 PlanProFactory.eINSTANCE.createUntergewerk_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup_VerantwortlicheStelleDB(),
				 PlanProFactory.eINSTANCE.createVerantwortliche_Stelle_DB_TypeClass()));
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
