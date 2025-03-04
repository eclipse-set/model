/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Luft_TelegrammItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Luft_TelegrammItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBaliseUebertragung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDFachtelegramm());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_LTBinaerdateiHilfe());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_LTBinaerdaten());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_TelegrammIndex());
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
	 * This returns Luft_Telegramm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Luft_Telegramm"));
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
		return getString("_UI_Luft_Telegramm_type");
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

		switch (notification.getFeatureID(Luft_Telegramm.class)) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBaliseUebertragung(),
				 VerweiseFactory.eINSTANCE.createID_Balise_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDFachtelegramm(),
				 VerweiseFactory.eINSTANCE.createID_Fachtelegramm_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_LTBinaerdateiHilfe(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLT_Binaerdatei_Hilfe_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_LTBinaerdaten(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLT_Binaerdaten_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_TelegrammIndex(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createTelegramm_Index_TypeClass()));
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
