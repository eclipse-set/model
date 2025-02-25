/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Bauart_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Hupe_Anschaltzeit_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Einricht Oertlich Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl#getBedienEinrichtBauart <em>Bedien Einricht Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl#getHupeAnschaltzeit <em>Hupe Anschaltzeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl extends EObjectImpl implements Bedien_Einricht_Oertlich_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedienEinrichtBauart() <em>Bedien Einricht Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienEinrichtBauart()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einricht_Bauart_TypeClass bedienEinrichtBauart;

	/**
	 * The cached value of the '{@link #getHupeAnschaltzeit() <em>Hupe Anschaltzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHupeAnschaltzeit()
	 * @generated
	 * @ordered
	 */
	protected Hupe_Anschaltzeit_TypeClass hupeAnschaltzeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Bauart_TypeClass getBedienEinrichtBauart() {
		return bedienEinrichtBauart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienEinrichtBauart(Bedien_Einricht_Bauart_TypeClass newBedienEinrichtBauart, NotificationChain msgs) {
		Bedien_Einricht_Bauart_TypeClass oldBedienEinrichtBauart = bedienEinrichtBauart;
		bedienEinrichtBauart = newBedienEinrichtBauart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART, oldBedienEinrichtBauart, newBedienEinrichtBauart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBedienEinrichtBauart(Bedien_Einricht_Bauart_TypeClass newBedienEinrichtBauart) {
		if (newBedienEinrichtBauart != bedienEinrichtBauart) {
			NotificationChain msgs = null;
			if (bedienEinrichtBauart != null)
				msgs = ((InternalEObject)bedienEinrichtBauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART, null, msgs);
			if (newBedienEinrichtBauart != null)
				msgs = ((InternalEObject)newBedienEinrichtBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART, null, msgs);
			msgs = basicSetBedienEinrichtBauart(newBedienEinrichtBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART, newBedienEinrichtBauart, newBedienEinrichtBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hupe_Anschaltzeit_TypeClass getHupeAnschaltzeit() {
		return hupeAnschaltzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHupeAnschaltzeit(Hupe_Anschaltzeit_TypeClass newHupeAnschaltzeit, NotificationChain msgs) {
		Hupe_Anschaltzeit_TypeClass oldHupeAnschaltzeit = hupeAnschaltzeit;
		hupeAnschaltzeit = newHupeAnschaltzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT, oldHupeAnschaltzeit, newHupeAnschaltzeit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHupeAnschaltzeit(Hupe_Anschaltzeit_TypeClass newHupeAnschaltzeit) {
		if (newHupeAnschaltzeit != hupeAnschaltzeit) {
			NotificationChain msgs = null;
			if (hupeAnschaltzeit != null)
				msgs = ((InternalEObject)hupeAnschaltzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT, null, msgs);
			if (newHupeAnschaltzeit != null)
				msgs = ((InternalEObject)newHupeAnschaltzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT, null, msgs);
			msgs = basicSetHupeAnschaltzeit(newHupeAnschaltzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT, newHupeAnschaltzeit, newHupeAnschaltzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART:
				return basicSetBedienEinrichtBauart(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT:
				return basicSetHupeAnschaltzeit(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART:
				return getBedienEinrichtBauart();
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT:
				return getHupeAnschaltzeit();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART:
				setBedienEinrichtBauart((Bedien_Einricht_Bauart_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT:
				setHupeAnschaltzeit((Hupe_Anschaltzeit_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART:
				setBedienEinrichtBauart((Bedien_Einricht_Bauart_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT:
				setHupeAnschaltzeit((Hupe_Anschaltzeit_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_BAUART:
				return bedienEinrichtBauart != null;
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP__HUPE_ANSCHALTZEIT:
				return hupeAnschaltzeit != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl
