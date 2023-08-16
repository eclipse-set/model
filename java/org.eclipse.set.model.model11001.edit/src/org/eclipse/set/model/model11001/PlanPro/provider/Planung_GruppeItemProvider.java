/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Ur_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.PlanProFactory;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;
import org.eclipse.set.model.model11001.PlanPro.Planung_Gruppe;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.PlanPro.Planung_Gruppe} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Planung_GruppeItemProvider extends Ur_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planung_GruppeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_FuehrendeOertlichkeit());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_LSTPlanungEinzel());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGAllg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGFuehrendeStrecke());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGSchriftfeld());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PolygoneBetrachtungsbereich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PolygonePlanungsbereich());
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
	 * This returns Planung_Gruppe.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planung_Gruppe"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Planung_Gruppe_type");
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

		switch (notification.getFeatureID(Planung_Gruppe.class)) {
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
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
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_FuehrendeOertlichkeit(),
				 PlanProFactory.eINSTANCE.createFuehrende_Oertlichkeit_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_LSTPlanungEinzel(),
				 PlanProFactory.eINSTANCE.createPlanung_Einzel()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGAllg(),
				 PlanProFactory.eINSTANCE.createPlanung_G_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGFuehrendeStrecke(),
				 PlanProFactory.eINSTANCE.createPlanung_G_Fuehrende_Strecke_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PlanungGSchriftfeld(),
				 PlanProFactory.eINSTANCE.createPlanung_G_Schriftfeld_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PolygoneBetrachtungsbereich(),
				 PlanProFactory.eINSTANCE.createPolygone_Betrachtungsbereich_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Gruppe_PolygonePlanungsbereich(),
				 PlanProFactory.eINSTANCE.createPolygone_Planungsbereich_AttributeGroup()));
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
