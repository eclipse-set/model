/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZN_Fortschalt_KriteriumItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Fortschalt_KriteriumItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT);
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
	 * This returns ZN_Fortschalt_Kriterium.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZN_Fortschalt_Kriterium"));
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
		return getString("_UI_ZN_Fortschalt_Kriterium_type");
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

		switch (notification.getFeatureID(ZN_Fortschalt_Kriterium.class)) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
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
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN,
				 VerweiseFactory.eINSTANCE.createID_ZN_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START,
				 VerweiseFactory.eINSTANCE.createID_ZN_Anzeigefeld_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL,
				 VerweiseFactory.eINSTANCE.createID_ZN_Anzeigefeld_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Fortschalt_Krit_Druck_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Fortschalt_Krit_Schalt_AttributeGroup()));
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
			childFeature == ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START ||
			childFeature == ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL;

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
