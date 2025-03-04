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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZBS_Signal_Signalabstand_AttributeGroupItemProvider 
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
	public ZBS_Signal_Signalabstand_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_AbstandReduziert());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig150());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig150());
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
	 * This returns ZBS_Signal_Signalabstand_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZBS_Signal_Signalabstand_AttributeGroup"));
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
		return getString("_UI_ZBS_Signal_Signalabstand_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZBS_Signal_Signalabstand_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__ABSTAND_REDUZIERT:
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG:
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND_SIG150:
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG:
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP__SOLLLAENGE_MIND_SIG150:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_AbstandReduziert(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Reduziert_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMassgebende_Neigung_Mind_Sig_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig150(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMassgebende_Neigung_Mind_Sig_150_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSolllaenge_Mind_Sig_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig150(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createSolllaenge_Mind_Sig_150_TypeClass()));
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
