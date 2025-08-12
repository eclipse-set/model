/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_Sonstige_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Schaltkasten Position Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getIDBezugspunktPositionierung <em>ID Bezugspunkt Positionierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getPositionSonstige <em>Position Sonstige</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Schaltkasten_Position_AttributeGroupImpl extends EObjectImpl implements LEU_Schaltkasten_Position_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBezugspunktPositionierung() <em>ID Bezugspunkt Positionierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBezugspunktPositionierung()
	 * @generated
	 * @ordered
	 */
	protected ID_Bezugspunkt_Positionierung_TypeClass iDBezugspunktPositionierung;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position_TypeClass position;

	/**
	 * The cached value of the '{@link #getPositionSonstige() <em>Position Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionSonstige()
	 * @generated
	 * @ordered
	 */
	protected Position_Sonstige_TypeClass positionSonstige;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Schaltkasten_Position_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Schaltkasten_Position_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bezugspunkt_Positionierung_TypeClass getIDBezugspunktPositionierung() {
		return iDBezugspunktPositionierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBezugspunktPositionierung(ID_Bezugspunkt_Positionierung_TypeClass newIDBezugspunktPositionierung, NotificationChain msgs) {
		ID_Bezugspunkt_Positionierung_TypeClass oldIDBezugspunktPositionierung = iDBezugspunktPositionierung;
		iDBezugspunktPositionierung = newIDBezugspunktPositionierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, oldIDBezugspunktPositionierung, newIDBezugspunktPositionierung);
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
	public void setIDBezugspunktPositionierung(ID_Bezugspunkt_Positionierung_TypeClass newIDBezugspunktPositionierung) {
		if (newIDBezugspunktPositionierung != iDBezugspunktPositionierung) {
			NotificationChain msgs = null;
			if (iDBezugspunktPositionierung != null)
				msgs = ((InternalEObject)iDBezugspunktPositionierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, null, msgs);
			if (newIDBezugspunktPositionierung != null)
				msgs = ((InternalEObject)newIDBezugspunktPositionierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, null, msgs);
			msgs = basicSetIDBezugspunktPositionierung(newIDBezugspunktPositionierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, newIDBezugspunktPositionierung, newIDBezugspunktPositionierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_TypeClass getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position_TypeClass newPosition, NotificationChain msgs) {
		Position_TypeClass oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, oldPosition, newPosition);
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
	public void setPosition(Position_TypeClass newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_Sonstige_TypeClass getPositionSonstige() {
		return positionSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionSonstige(Position_Sonstige_TypeClass newPositionSonstige, NotificationChain msgs) {
		Position_Sonstige_TypeClass oldPositionSonstige = positionSonstige;
		positionSonstige = newPositionSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, oldPositionSonstige, newPositionSonstige);
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
	public void setPositionSonstige(Position_Sonstige_TypeClass newPositionSonstige) {
		if (newPositionSonstige != positionSonstige) {
			NotificationChain msgs = null;
			if (positionSonstige != null)
				msgs = ((InternalEObject)positionSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, null, msgs);
			if (newPositionSonstige != null)
				msgs = ((InternalEObject)newPositionSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, null, msgs);
			msgs = basicSetPositionSonstige(newPositionSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, newPositionSonstige, newPositionSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				return basicSetIDBezugspunktPositionierung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return basicSetPosition(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return basicSetPositionSonstige(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				return getIDBezugspunktPositionierung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return getPosition();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return getPositionSonstige();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				setIDBezugspunktPositionierung((ID_Bezugspunkt_Positionierung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				setPosition((Position_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				setPositionSonstige((Position_Sonstige_TypeClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				setIDBezugspunktPositionierung((ID_Bezugspunkt_Positionierung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				setPosition((Position_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				setPositionSonstige((Position_Sonstige_TypeClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				return iDBezugspunktPositionierung != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return position != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return positionSonstige != null;
		}
		return super.eIsSet(featureID);
	}

} //LEU_Schaltkasten_Position_AttributeGroupImpl
