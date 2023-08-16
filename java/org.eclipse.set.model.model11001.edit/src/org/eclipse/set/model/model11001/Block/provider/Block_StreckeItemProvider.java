/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Block.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model11001.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model11001.Block.BlockFactory;
import org.eclipse.set.model.model11001.Block.BlockPackage;
import org.eclipse.set.model.model11001.Block.Block_Strecke;

import org.eclipse.set.model.model11001.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model11001.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model11001.Block.Block_Strecke} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Block_StreckeItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_StreckeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BlockPackage.Literals.BLOCK_STRECKE__BLOCK_STRECKE_ALLG);
			childrenFeatures.add(BlockPackage.Literals.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR);
			childrenFeatures.add(BlockPackage.Literals.BLOCK_STRECKE__ID_KNOTENBAHNHOF);
			childrenFeatures.add(BlockPackage.Literals.BLOCK_STRECKE__ID_STRECKE);
			childrenFeatures.add(BlockPackage.Literals.BLOCK_STRECKE__ID_STRECKE_BREMSWEG);
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
	 * This returns Block_Strecke.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block_Strecke"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Block_Strecke_type");
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

		switch (notification.getFeatureID(Block_Strecke.class)) {
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
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
				(BlockPackage.Literals.BLOCK_STRECKE__BLOCK_STRECKE_ALLG,
				 BlockFactory.eINSTANCE.createBlock_Strecke_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BlockPackage.Literals.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BlockPackage.Literals.BLOCK_STRECKE__ID_KNOTENBAHNHOF,
				 VerweiseFactory.eINSTANCE.createID_Oertlichkeit_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BlockPackage.Literals.BLOCK_STRECKE__ID_STRECKE,
				 VerweiseFactory.eINSTANCE.createID_Strecke_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BlockPackage.Literals.BLOCK_STRECKE__ID_STRECKE_BREMSWEG,
				 VerweiseFactory.eINSTANCE.createID_Strecke_Bremsweg_ohne_Proxy_TypeClass()));
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
			childFeature == BlockPackage.Literals.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR ||
			childFeature == BlockPackage.Literals.BLOCK_STRECKE__ID_KNOTENBAHNHOF;

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
