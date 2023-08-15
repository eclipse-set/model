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
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_AttributeGroupItemProvider 
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
	public ZUB_Bereichsgrenze_Nach_L2_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_AbstandGrenzeBereichC());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BaselineSystemVersion());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BgrenzeNachL2BedEinstieg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_EinstiegOhneRueckwSig());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDRBCNachGrenze());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDSignalZufahrtsicherungL2oS());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_Prioritaet());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_ZUBBereichsgrenzeNachL2VonESG());
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
	 * This returns ZUB_Bereichsgrenze_Nach_L2_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZUB_Bereichsgrenze_Nach_L2_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZUB_Bereichsgrenze_Nach_L2_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZUB_Bereichsgrenze_Nach_L2_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_AbstandGrenzeBereichC(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Grenze_Bereich_C_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BaselineSystemVersion(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBaseline_System_Version_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BgrenzeNachL2BedEinstieg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_EinstiegOhneRueckwSig(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createEinstieg_Ohne_Rueckw_Sig_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDRBCNachGrenze(),
				 VerweiseFactory.eINSTANCE.createID_RBC_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDSignalZufahrtsicherungL2oS(),
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_Prioritaet(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createPrioritaet_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_ZUBBereichsgrenzeNachL2VonESG(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup()));
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
