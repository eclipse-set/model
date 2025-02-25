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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ETCS_SignalItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_SignalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSGefahrpunktabstandAbweichend());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalAllg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalDWeg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalTBV());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt2());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDHOAFBOA());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDRBC());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDSignal());
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
	 * This returns ETCS_Signal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ETCS_Signal"));
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
		return getString("_UI_ETCS_Signal_type");
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

		switch (notification.getFeatureID(ETCS_Signal.class)) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT2:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSGefahrpunktabstandAbweichend(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Gefahrpunktabstand_Abweichend_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalAllg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalDWeg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_DWeg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalTBV(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_TBV_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt(),
				 VerweiseFactory.eINSTANCE.createID_Markanter_Punkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt2(),
				 VerweiseFactory.eINSTANCE.createID_Markanter_Punkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDHOAFBOA(),
				 VerweiseFactory.eINSTANCE.createID_Technischer_Punkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDRBC(),
				 VerweiseFactory.eINSTANCE.createID_RBC_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDSignal(),
				 VerweiseFactory.eINSTANCE.createID_Signal_ohne_Proxy_TypeClass()));
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
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt2();

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
