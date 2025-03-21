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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FT_Fahrweg_TeilItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT_Fahrweg_TeilItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_FTFahrwegTeilAllg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielDatenpunkt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielSignal());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_ZielWElement());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartDatenpunkt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartSignal());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_StartWElement());
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
	 * This returns FT_Fahrweg_Teil.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FT_Fahrweg_Teil"));
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
		return getString("_UI_FT_Fahrweg_Teil_type");
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

		switch (notification.getFeatureID(FT_Fahrweg_Teil.class)) {
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_FTFahrwegTeilAllg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_Fahrweg_Teil_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielDatenpunkt(),
				 VerweiseFactory.eINSTANCE.createID_Datenpunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielSignal(),
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_ZielWElement(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZiel_W_Element_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartDatenpunkt(),
				 VerweiseFactory.eINSTANCE.createID_Datenpunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartSignal(),
				 VerweiseFactory.eINSTANCE.createID_Signal_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_StartWElement(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createStart_W_Element_AttributeGroup()));
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
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielDatenpunkt() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartDatenpunkt() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDZielSignal() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_IDStartSignal();

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
