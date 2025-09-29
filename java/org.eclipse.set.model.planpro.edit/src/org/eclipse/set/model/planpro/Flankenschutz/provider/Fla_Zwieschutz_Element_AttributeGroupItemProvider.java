/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz.provider;


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

import org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzFactory;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Fla_Zwieschutz_Element_AttributeGroupItemProvider 
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
	public Fla_Zwieschutz_Element_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L);
			childrenFeatures.add(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R);
			childrenFeatures.add(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L);
			childrenFeatures.add(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R);
			childrenFeatures.add(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG);
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
	 * This returns Fla_Zwieschutz_Element_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Fla_Zwieschutz_Element_AttributeGroup"));
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
		return getString("_UI_Fla_Zwieschutz_Element_AttributeGroup_type");
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

		switch (notification.getFeatureID(Fla_Zwieschutz_Element_AttributeGroup.class)) {
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L:
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R:
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
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
				(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L,
				 VerweiseFactory.eINSTANCE.createID_Fla_Schutz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R,
				 VerweiseFactory.eINSTANCE.createID_Fla_Schutz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L,
				 FlankenschutzFactory.eINSTANCE.createMassnahme_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R,
				 FlankenschutzFactory.eINSTANCE.createMassnahme_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG,
				 FlankenschutzFactory.eINSTANCE.createNachlaufverhinderung_TypeClass()));
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
			childFeature == FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L ||
			childFeature == FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R ||
			childFeature == FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L ||
			childFeature == FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R;

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
