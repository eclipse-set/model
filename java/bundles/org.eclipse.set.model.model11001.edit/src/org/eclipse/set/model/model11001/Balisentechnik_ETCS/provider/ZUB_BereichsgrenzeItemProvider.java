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

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZUB_BereichsgrenzeItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZUB_BereichsgrenzeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Bezeichnung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_IDOertlichkeit());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeAllg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachESG());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachGNT());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachL2());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachLZB());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachOhne());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachPZB());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachSonstige());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachZBS());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBgrenzeRBCWechsel());
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
	 * This returns ZUB_Bereichsgrenze.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZUB_Bereichsgrenze"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZUB_Bereichsgrenze_type");
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

		switch (notification.getFeatureID(ZUB_Bereichsgrenze.class)) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__BEZEICHNUNG:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ID_OERTLICHKEIT:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_ALLG:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ESG:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_GNT:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_L2:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_LZB:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_OHNE:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_PZB:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_SONSTIGE:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BEREICHSGRENZE_NACH_ZBS:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE__ZUB_BGRENZE_RBC_WECHSEL:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Bezeichnung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_IDOertlichkeit(),
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeAllg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachESG(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_ESG_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachGNT(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_GNT_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachL2(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_L2_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachLZB(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_LZB_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachOhne(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachPZB(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_PZB_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachSonstige(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachZBS(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_ZUBBgrenzeRBCWechsel(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bgrenze_RBC_Wechsel_AttributeGroup()));
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
