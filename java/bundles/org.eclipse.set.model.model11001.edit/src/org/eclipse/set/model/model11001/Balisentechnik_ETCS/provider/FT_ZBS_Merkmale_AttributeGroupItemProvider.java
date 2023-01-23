/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FT_ZBS_Merkmale_AttributeGroupItemProvider 
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
	public FT_ZBS_Merkmale_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTHinweisFunktion());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTZBSMerkmaleLa());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTZBSTyp());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Laenge1());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_LMG());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeig1());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeigSchutzstrecke());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Mastschild());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeErforderlich());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeVorhanden());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Telegrammnummer());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_UeberwachungLaenge());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VBefehlR());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VBefehlZ());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VFrei());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VZulStrecke());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VGR1());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VGR2());
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
	 * This returns FT_ZBS_Merkmale_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FT_ZBS_Merkmale_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FT_ZBS_Merkmale_AttributeGroup_type");
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

		switch (notification.getFeatureID(FT_ZBS_Merkmale_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FT_HINWEIS_FUNKTION:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_MERKMALE_LA:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__FTZBS_TYP:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LAENGE1:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__LMG:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG1:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASSGEBENDE_NEIG_SCHUTZSTRECKE:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__MASTSCHILD:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_ERFORDERLICH:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__SCHUTZSTRECKE_VORHANDEN:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_R:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VBEFEHL_Z:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VFREI:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VZUL_STRECKE:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR1:
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP__VGR2:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTHinweisFunktion(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_Hinweis_Funktion_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTZBSMerkmaleLa(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ZBS_Merkmale_La_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_FTZBSTyp(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ZBS_Typ_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Laenge1(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLaenge_1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_LMG(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLM_G_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeig1(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMassgebende_Neig_1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeigSchutzstrecke(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMassgebende_Neig_Schutzstrecke_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Mastschild(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMastschild_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeErforderlich(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSchutzstrecke_Erforderlich_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeVorhanden(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSchutzstrecke_Vorhanden_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_Telegrammnummer(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createTelegrammnummer_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_UeberwachungLaenge(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createUeberwachung_Laenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VBefehlR(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Befehl_R_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VBefehlZ(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Befehl_Z_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VFrei(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Frei_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VZulStrecke(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Zul_Strecke_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VGR1(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVGR_1_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_AttributeGroup_VGR2(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVGR_2_TypeClass()));
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
