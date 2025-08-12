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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_Hilfe_TypeClass;

import org.eclipse.set.model.planpro.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Binaerdatei Hilfe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getPruefmerkmaleBinaerdateiHilfe <em>Pruefmerkmale Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getVerwendungHilfe <em>Verwendung Hilfe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LT_Binaerdatei_Hilfe_AttributeGroupImpl extends EObjectImpl implements LT_Binaerdatei_Hilfe_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBinaerdateiHilfe() <em>ID Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected ID_Binaerdaten_ohne_Proxy_TypeClass iDBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleBinaerdateiHilfe() <em>Pruefmerkmale Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Pruefmerkmale_Daten_AttributeGroup pruefmerkmaleBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getVerwendungHilfe() <em>Verwendung Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendungHilfe()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_Hilfe_TypeClass verwendungHilfe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LT_Binaerdatei_Hilfe_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLT_Binaerdatei_Hilfe_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdaten_ohne_Proxy_TypeClass getIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBinaerdateiHilfe(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdateiHilfe, NotificationChain msgs) {
		ID_Binaerdaten_ohne_Proxy_TypeClass oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		iDBinaerdateiHilfe = newIDBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, newIDBinaerdateiHilfe);
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
	public void setIDBinaerdateiHilfe(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdateiHilfe) {
		if (newIDBinaerdateiHilfe != iDBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (iDBinaerdateiHilfe != null)
				msgs = ((InternalEObject)iDBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, null, msgs);
			if (newIDBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newIDBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetIDBinaerdateiHilfe(newIDBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, newIDBinaerdateiHilfe, newIDBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdateiHilfe() {
		return pruefmerkmaleBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdateiHilfe, NotificationChain msgs) {
		Pruefmerkmale_Daten_AttributeGroup oldPruefmerkmaleBinaerdateiHilfe = pruefmerkmaleBinaerdateiHilfe;
		pruefmerkmaleBinaerdateiHilfe = newPruefmerkmaleBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, oldPruefmerkmaleBinaerdateiHilfe, newPruefmerkmaleBinaerdateiHilfe);
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
	public void setPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdateiHilfe) {
		if (newPruefmerkmaleBinaerdateiHilfe != pruefmerkmaleBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (pruefmerkmaleBinaerdateiHilfe != null)
				msgs = ((InternalEObject)pruefmerkmaleBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, null, msgs);
			if (newPruefmerkmaleBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newPruefmerkmaleBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetPruefmerkmaleBinaerdateiHilfe(newPruefmerkmaleBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, newPruefmerkmaleBinaerdateiHilfe, newPruefmerkmaleBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Hilfe_TypeClass getVerwendungHilfe() {
		return verwendungHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendungHilfe(Verwendung_Hilfe_TypeClass newVerwendungHilfe, NotificationChain msgs) {
		Verwendung_Hilfe_TypeClass oldVerwendungHilfe = verwendungHilfe;
		verwendungHilfe = newVerwendungHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, oldVerwendungHilfe, newVerwendungHilfe);
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
	public void setVerwendungHilfe(Verwendung_Hilfe_TypeClass newVerwendungHilfe) {
		if (newVerwendungHilfe != verwendungHilfe) {
			NotificationChain msgs = null;
			if (verwendungHilfe != null)
				msgs = ((InternalEObject)verwendungHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, null, msgs);
			if (newVerwendungHilfe != null)
				msgs = ((InternalEObject)newVerwendungHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, null, msgs);
			msgs = basicSetVerwendungHilfe(newVerwendungHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, newVerwendungHilfe, newVerwendungHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				return basicSetIDBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return basicSetPruefmerkmaleBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return basicSetVerwendungHilfe(null, msgs);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				return getIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return getPruefmerkmaleBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return getVerwendungHilfe();
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((ID_Binaerdaten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				setPruefmerkmaleBinaerdateiHilfe((Pruefmerkmale_Daten_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				setVerwendungHilfe((Verwendung_Hilfe_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((ID_Binaerdaten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				setPruefmerkmaleBinaerdateiHilfe((Pruefmerkmale_Daten_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				setVerwendungHilfe((Verwendung_Hilfe_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				return iDBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return pruefmerkmaleBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return verwendungHilfe != null;
		}
		return super.eIsSet(featureID);
	}

} //LT_Binaerdatei_Hilfe_AttributeGroupImpl
