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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausstieg_ETCS_Sperre_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dunkelschaltanstoss_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einstieg_Erlaubt_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Gruppen_ID_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Untergruppen_ID_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Signal Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Signal_Allg_AttributeGroupImpl#getAusstiegETCSSperre <em>Ausstieg ETCS Sperre</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Signal_Allg_AttributeGroupImpl#getDunkelschaltanstoss <em>Dunkelschaltanstoss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Signal_Allg_AttributeGroupImpl#getEinstiegErlaubt <em>Einstieg Erlaubt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Signal_Allg_AttributeGroupImpl#getGruppenID <em>Gruppen ID</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Signal_Allg_AttributeGroupImpl#getUntergruppenID <em>Untergruppen ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_Signal_Allg_AttributeGroupImpl extends EObjectImpl implements ETCS_Signal_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAusstiegETCSSperre() <em>Ausstieg ETCS Sperre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusstiegETCSSperre()
	 * @generated
	 * @ordered
	 */
	protected Ausstieg_ETCS_Sperre_TypeClass ausstiegETCSSperre;

	/**
	 * The cached value of the '{@link #getDunkelschaltanstoss() <em>Dunkelschaltanstoss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDunkelschaltanstoss()
	 * @generated
	 * @ordered
	 */
	protected Dunkelschaltanstoss_TypeClass dunkelschaltanstoss;

	/**
	 * The cached value of the '{@link #getEinstiegErlaubt() <em>Einstieg Erlaubt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstiegErlaubt()
	 * @generated
	 * @ordered
	 */
	protected Einstieg_Erlaubt_TypeClass einstiegErlaubt;

	/**
	 * The cached value of the '{@link #getGruppenID() <em>Gruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruppenID()
	 * @generated
	 * @ordered
	 */
	protected Gruppen_ID_TypeClass gruppenID;

	/**
	 * The cached value of the '{@link #getUntergruppenID() <em>Untergruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntergruppenID()
	 * @generated
	 * @ordered
	 */
	protected Untergruppen_ID_TypeClass untergruppenID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_Signal_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausstieg_ETCS_Sperre_TypeClass getAusstiegETCSSperre() {
		return ausstiegETCSSperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusstiegETCSSperre(Ausstieg_ETCS_Sperre_TypeClass newAusstiegETCSSperre, NotificationChain msgs) {
		Ausstieg_ETCS_Sperre_TypeClass oldAusstiegETCSSperre = ausstiegETCSSperre;
		ausstiegETCSSperre = newAusstiegETCSSperre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE, oldAusstiegETCSSperre, newAusstiegETCSSperre);
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
	public void setAusstiegETCSSperre(Ausstieg_ETCS_Sperre_TypeClass newAusstiegETCSSperre) {
		if (newAusstiegETCSSperre != ausstiegETCSSperre) {
			NotificationChain msgs = null;
			if (ausstiegETCSSperre != null)
				msgs = ((InternalEObject)ausstiegETCSSperre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE, null, msgs);
			if (newAusstiegETCSSperre != null)
				msgs = ((InternalEObject)newAusstiegETCSSperre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE, null, msgs);
			msgs = basicSetAusstiegETCSSperre(newAusstiegETCSSperre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE, newAusstiegETCSSperre, newAusstiegETCSSperre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dunkelschaltanstoss_TypeClass getDunkelschaltanstoss() {
		return dunkelschaltanstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDunkelschaltanstoss(Dunkelschaltanstoss_TypeClass newDunkelschaltanstoss, NotificationChain msgs) {
		Dunkelschaltanstoss_TypeClass oldDunkelschaltanstoss = dunkelschaltanstoss;
		dunkelschaltanstoss = newDunkelschaltanstoss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS, oldDunkelschaltanstoss, newDunkelschaltanstoss);
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
	public void setDunkelschaltanstoss(Dunkelschaltanstoss_TypeClass newDunkelschaltanstoss) {
		if (newDunkelschaltanstoss != dunkelschaltanstoss) {
			NotificationChain msgs = null;
			if (dunkelschaltanstoss != null)
				msgs = ((InternalEObject)dunkelschaltanstoss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS, null, msgs);
			if (newDunkelschaltanstoss != null)
				msgs = ((InternalEObject)newDunkelschaltanstoss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS, null, msgs);
			msgs = basicSetDunkelschaltanstoss(newDunkelschaltanstoss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS, newDunkelschaltanstoss, newDunkelschaltanstoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstieg_Erlaubt_TypeClass getEinstiegErlaubt() {
		return einstiegErlaubt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinstiegErlaubt(Einstieg_Erlaubt_TypeClass newEinstiegErlaubt, NotificationChain msgs) {
		Einstieg_Erlaubt_TypeClass oldEinstiegErlaubt = einstiegErlaubt;
		einstiegErlaubt = newEinstiegErlaubt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT, oldEinstiegErlaubt, newEinstiegErlaubt);
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
	public void setEinstiegErlaubt(Einstieg_Erlaubt_TypeClass newEinstiegErlaubt) {
		if (newEinstiegErlaubt != einstiegErlaubt) {
			NotificationChain msgs = null;
			if (einstiegErlaubt != null)
				msgs = ((InternalEObject)einstiegErlaubt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT, null, msgs);
			if (newEinstiegErlaubt != null)
				msgs = ((InternalEObject)newEinstiegErlaubt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT, null, msgs);
			msgs = basicSetEinstiegErlaubt(newEinstiegErlaubt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT, newEinstiegErlaubt, newEinstiegErlaubt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gruppen_ID_TypeClass getGruppenID() {
		return gruppenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGruppenID(Gruppen_ID_TypeClass newGruppenID, NotificationChain msgs) {
		Gruppen_ID_TypeClass oldGruppenID = gruppenID;
		gruppenID = newGruppenID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID, oldGruppenID, newGruppenID);
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
	public void setGruppenID(Gruppen_ID_TypeClass newGruppenID) {
		if (newGruppenID != gruppenID) {
			NotificationChain msgs = null;
			if (gruppenID != null)
				msgs = ((InternalEObject)gruppenID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID, null, msgs);
			if (newGruppenID != null)
				msgs = ((InternalEObject)newGruppenID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID, null, msgs);
			msgs = basicSetGruppenID(newGruppenID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID, newGruppenID, newGruppenID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergruppen_ID_TypeClass getUntergruppenID() {
		return untergruppenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntergruppenID(Untergruppen_ID_TypeClass newUntergruppenID, NotificationChain msgs) {
		Untergruppen_ID_TypeClass oldUntergruppenID = untergruppenID;
		untergruppenID = newUntergruppenID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, oldUntergruppenID, newUntergruppenID);
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
	public void setUntergruppenID(Untergruppen_ID_TypeClass newUntergruppenID) {
		if (newUntergruppenID != untergruppenID) {
			NotificationChain msgs = null;
			if (untergruppenID != null)
				msgs = ((InternalEObject)untergruppenID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, null, msgs);
			if (newUntergruppenID != null)
				msgs = ((InternalEObject)newUntergruppenID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, null, msgs);
			msgs = basicSetUntergruppenID(newUntergruppenID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, newUntergruppenID, newUntergruppenID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE:
				return basicSetAusstiegETCSSperre(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS:
				return basicSetDunkelschaltanstoss(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT:
				return basicSetEinstiegErlaubt(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return basicSetGruppenID(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return basicSetUntergruppenID(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE:
				return getAusstiegETCSSperre();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS:
				return getDunkelschaltanstoss();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT:
				return getEinstiegErlaubt();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return getGruppenID();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return getUntergruppenID();
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE:
				setAusstiegETCSSperre((Ausstieg_ETCS_Sperre_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS:
				setDunkelschaltanstoss((Dunkelschaltanstoss_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT:
				setEinstiegErlaubt((Einstieg_Erlaubt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID:
				setGruppenID((Gruppen_ID_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				setUntergruppenID((Untergruppen_ID_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE:
				setAusstiegETCSSperre((Ausstieg_ETCS_Sperre_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS:
				setDunkelschaltanstoss((Dunkelschaltanstoss_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT:
				setEinstiegErlaubt((Einstieg_Erlaubt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID:
				setGruppenID((Gruppen_ID_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				setUntergruppenID((Untergruppen_ID_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__AUSSTIEG_ETCS_SPERRE:
				return ausstiegETCSSperre != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__DUNKELSCHALTANSTOSS:
				return dunkelschaltanstoss != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__EINSTIEG_ERLAUBT:
				return einstiegErlaubt != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return gruppenID != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return untergruppenID != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_Signal_Allg_AttributeGroupImpl
