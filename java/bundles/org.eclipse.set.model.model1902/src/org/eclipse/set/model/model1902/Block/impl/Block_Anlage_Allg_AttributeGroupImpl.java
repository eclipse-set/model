/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Block.BlockPackage;
import org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Schaltung_TypeClass;
import org.eclipse.set.model.model1902.Block.Schutzuebertrager_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Anlage_Allg_AttributeGroupImpl#getSchaltung <em>Schaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Anlage_Allg_AttributeGroupImpl#getSchutzuebertrager <em>Schutzuebertrager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_Anlage_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Block_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getSchaltung() <em>Schaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltung()
	 * @generated
	 * @ordered
	 */
	protected Schaltung_TypeClass schaltung;

	/**
	 * The cached value of the '{@link #getSchutzuebertrager() <em>Schutzuebertrager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchutzuebertrager()
	 * @generated
	 * @ordered
	 */
	protected Schutzuebertrager_TypeClass schutzuebertrager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltung_TypeClass getSchaltung() {
		return schaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchaltung(Schaltung_TypeClass newSchaltung, NotificationChain msgs) {
		Schaltung_TypeClass oldSchaltung = schaltung;
		schaltung = newSchaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG, oldSchaltung, newSchaltung);
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
	public void setSchaltung(Schaltung_TypeClass newSchaltung) {
		if (newSchaltung != schaltung) {
			NotificationChain msgs = null;
			if (schaltung != null)
				msgs = ((InternalEObject)schaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG, null, msgs);
			if (newSchaltung != null)
				msgs = ((InternalEObject)newSchaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG, null, msgs);
			msgs = basicSetSchaltung(newSchaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG, newSchaltung, newSchaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzuebertrager_TypeClass getSchutzuebertrager() {
		return schutzuebertrager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchutzuebertrager(Schutzuebertrager_TypeClass newSchutzuebertrager, NotificationChain msgs) {
		Schutzuebertrager_TypeClass oldSchutzuebertrager = schutzuebertrager;
		schutzuebertrager = newSchutzuebertrager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER, oldSchutzuebertrager, newSchutzuebertrager);
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
	public void setSchutzuebertrager(Schutzuebertrager_TypeClass newSchutzuebertrager) {
		if (newSchutzuebertrager != schutzuebertrager) {
			NotificationChain msgs = null;
			if (schutzuebertrager != null)
				msgs = ((InternalEObject)schutzuebertrager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER, null, msgs);
			if (newSchutzuebertrager != null)
				msgs = ((InternalEObject)newSchutzuebertrager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER, null, msgs);
			msgs = basicSetSchutzuebertrager(newSchutzuebertrager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER, newSchutzuebertrager, newSchutzuebertrager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG:
				return basicSetSchaltung(null, msgs);
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER:
				return basicSetSchutzuebertrager(null, msgs);
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
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG:
				return getSchaltung();
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER:
				return getSchutzuebertrager();
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
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG:
				setSchaltung((Schaltung_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER:
				setSchutzuebertrager((Schutzuebertrager_TypeClass)newValue);
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
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG:
				setSchaltung((Schaltung_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER:
				setSchutzuebertrager((Schutzuebertrager_TypeClass)null);
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
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG:
				return schaltung != null;
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER:
				return schutzuebertrager != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_Anlage_Allg_AttributeGroupImpl
