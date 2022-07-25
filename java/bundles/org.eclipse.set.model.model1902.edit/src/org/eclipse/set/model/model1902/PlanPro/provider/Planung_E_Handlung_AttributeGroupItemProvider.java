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
import org.eclipse.set.model.model1902.PlanPro.Planung_E_Handlung_AttributeGroup;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Handlung_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Planung_E_Handlung_AttributeGroupItemProvider 
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
	public Planung_E_Handlung_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEAbnahme());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEErstellung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEFreigabe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGenehmigung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGleichstellung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEPruefung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEQualitaetspruefung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungESonstige());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEUebernahme());
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
	 * This returns Planung_E_Handlung_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planung_E_Handlung_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Planung_E_Handlung_AttributeGroup_type");
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

		switch (notification.getFeatureID(Planung_E_Handlung_AttributeGroup.class)) {
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
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
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEAbnahme(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEErstellung(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEFreigabe(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGenehmigung(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGleichstellung(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEPruefung(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEQualitaetspruefung(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungESonstige(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEUebernahme(),
				 PlanProFactory.eINSTANCE.createAkteur_Zuordnung()));
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
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEAbnahme() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEErstellung() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEFreigabe() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGenehmigung() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEGleichstellung() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEPruefung() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEQualitaetspruefung() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungESonstige() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup_PlanungEUebernahme();

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
