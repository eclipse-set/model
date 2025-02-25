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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft;

import org.eclipse.set.model.planpro.Basisobjekte.provider.Bereich_ObjektItemProvider;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZUB_StreckeneigenschaftItemProvider extends Bereich_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZUB_StreckeneigenschaftItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_Bezeichnung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_Metallteil());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_OberstrombegrenzungGueterzug());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_OberstrombegrenzungReisezug());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotAnhalten());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotRegenerativeBremse());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotWBArt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_ZUBSEAusruestung());
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
	 * This returns ZUB_Streckeneigenschaft.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZUB_Streckeneigenschaft"));
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
		return getString("_UI_ZUB_Streckeneigenschaft_type");
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

		switch (notification.getFeatureID(ZUB_Streckeneigenschaft.class)) {
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__BEZEICHNUNG:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__METALLTEIL:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_GUETERZUG:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__OBERSTROMBEGRENZUNG_REISEZUG:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_ANHALTEN:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_REGENERATIVE_BREMSE:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__VERBOT_WB_ART:
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT__ZUBSE_AUSRUESTUNG:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_Bezeichnung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_Metallteil(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createMetallteil_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_OberstrombegrenzungGueterzug(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createOberstrombegrenzung_Gueterzug_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_OberstrombegrenzungReisezug(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createOberstrombegrenzung_Reisezug_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotAnhalten(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVerbot_Anhalten_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotRegenerativeBremse(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVerbot_Regenerative_Bremse_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_VerbotWBArt(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVerbot_WB_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_ZUBSEAusruestung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_SE_Ausruestung_AttributeGroup()));
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
