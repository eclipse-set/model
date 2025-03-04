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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Link;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Link} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Datenpunkt_LinkItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenpunkt_LinkItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkStart());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkZiel());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDFachtelegramm());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_LinkDistanz());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_ZielDPAusrichtung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_AnwendungESG());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_AnwendungGNT());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_ZBSMerkmale());
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
	 * This returns Datenpunkt_Link.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Datenpunkt_Link"));
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
		return getString("_UI_Datenpunkt_Link_type");
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

		switch (notification.getFeatureID(Datenpunkt_Link.class)) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_START:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__IDDP_LINK_ZIEL:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ID_FACHTELEGRAMM:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__LINK_DISTANZ:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZIEL_DP_AUSRICHTUNG:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ANWENDUNG_ESG:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ANWENDUNG_GNT:
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK__ZBS_MERKMALE:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkStart(),
				 VerweiseFactory.eINSTANCE.createID_Datenpunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkZiel(),
				 VerweiseFactory.eINSTANCE.createID_Datenpunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDFachtelegramm(),
				 VerweiseFactory.eINSTANCE.createID_Fachtelegramm_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_LinkDistanz(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLink_Distanz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_ZielDPAusrichtung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZiel_DP_Ausrichtung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_AnwendungESG(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAnwendung_ESG_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_AnwendungGNT(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAnwendung_GNT_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_ZBSMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZBS_Merkmale_AttributeGroup()));
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
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkStart() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Link_IDDPLinkZiel();

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
