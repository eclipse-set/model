/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.Geodaten.GeodatenFactory;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Oertlichkeit;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Geodaten.Oertlichkeit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OertlichkeitItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OertlichkeitItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT__BEZEICHNUNG);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT__ID_STRECKE_PUNKT);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT__OERTLICHKEIT_ALLG);
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
	 * This returns Oertlichkeit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Oertlichkeit"));
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
		return getString("_UI_Oertlichkeit_type");
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

		switch (notification.getFeatureID(Oertlichkeit.class)) {
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
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
				(GeodatenPackage.Literals.OERTLICHKEIT__BEZEICHNUNG,
				 GeodatenFactory.eINSTANCE.createOertlichkeit_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT__ID_STRECKE_PUNKT,
				 VerweiseFactory.eINSTANCE.createID_Strecke_Punkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT__OERTLICHKEIT_ALLG,
				 GeodatenFactory.eINSTANCE.createOertlichkeit_Allg_AttributeGroup()));
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
			childFeature == GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT ||
			childFeature == GeodatenPackage.Literals.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT;

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
