/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup;

import org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Binaerdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getIDBinaerdaten <em>ID Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LT_Binaerdaten_AttributeGroupImpl extends EObjectImpl implements LT_Binaerdaten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangEADoku() <em>ID Anhang EA Doku</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangEADoku()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangEADoku;

	/**
	 * The cached value of the '{@link #getIDBinaerdaten() <em>ID Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected ID_Binaerdaten_ohne_Proxy_TypeClass iDBinaerdaten;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleBinaerdaten() <em>Pruefmerkmale Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected Pruefmerkmale_Daten_AttributeGroup pruefmerkmaleBinaerdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LT_Binaerdaten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLT_Binaerdaten_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangEADoku() {
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangEADoku(ID_Anhang_TypeClass newIDAnhangEADoku, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangEADoku = iDAnhangEADoku;
		iDAnhangEADoku = newIDAnhangEADoku;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, newIDAnhangEADoku);
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
	public void setIDAnhangEADoku(ID_Anhang_TypeClass newIDAnhangEADoku) {
		if (newIDAnhangEADoku != iDAnhangEADoku) {
			NotificationChain msgs = null;
			if (iDAnhangEADoku != null)
				msgs = ((InternalEObject)iDAnhangEADoku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, null, msgs);
			if (newIDAnhangEADoku != null)
				msgs = ((InternalEObject)newIDAnhangEADoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, null, msgs);
			msgs = basicSetIDAnhangEADoku(newIDAnhangEADoku, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, newIDAnhangEADoku, newIDAnhangEADoku));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdaten_ohne_Proxy_TypeClass getIDBinaerdaten() {
		return iDBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBinaerdaten(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdaten, NotificationChain msgs) {
		ID_Binaerdaten_ohne_Proxy_TypeClass oldIDBinaerdaten = iDBinaerdaten;
		iDBinaerdaten = newIDBinaerdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, oldIDBinaerdaten, newIDBinaerdaten);
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
	public void setIDBinaerdaten(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdaten) {
		if (newIDBinaerdaten != iDBinaerdaten) {
			NotificationChain msgs = null;
			if (iDBinaerdaten != null)
				msgs = ((InternalEObject)iDBinaerdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, null, msgs);
			if (newIDBinaerdaten != null)
				msgs = ((InternalEObject)newIDBinaerdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, null, msgs);
			msgs = basicSetIDBinaerdaten(newIDBinaerdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, newIDBinaerdaten, newIDBinaerdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdaten() {
		return pruefmerkmaleBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdaten, NotificationChain msgs) {
		Pruefmerkmale_Daten_AttributeGroup oldPruefmerkmaleBinaerdaten = pruefmerkmaleBinaerdaten;
		pruefmerkmaleBinaerdaten = newPruefmerkmaleBinaerdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, oldPruefmerkmaleBinaerdaten, newPruefmerkmaleBinaerdaten);
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
	public void setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdaten) {
		if (newPruefmerkmaleBinaerdaten != pruefmerkmaleBinaerdaten) {
			NotificationChain msgs = null;
			if (pruefmerkmaleBinaerdaten != null)
				msgs = ((InternalEObject)pruefmerkmaleBinaerdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, null, msgs);
			if (newPruefmerkmaleBinaerdaten != null)
				msgs = ((InternalEObject)newPruefmerkmaleBinaerdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, null, msgs);
			msgs = basicSetPruefmerkmaleBinaerdaten(newPruefmerkmaleBinaerdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, newPruefmerkmaleBinaerdaten, newPruefmerkmaleBinaerdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				return basicSetIDAnhangEADoku(null, msgs);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				return basicSetIDBinaerdaten(null, msgs);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return basicSetPruefmerkmaleBinaerdaten(null, msgs);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				return getIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				return getIDBinaerdaten();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return getPruefmerkmaleBinaerdaten();
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((ID_Anhang_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				setIDBinaerdaten((ID_Binaerdaten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				setPruefmerkmaleBinaerdaten((Pruefmerkmale_Daten_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((ID_Anhang_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				setIDBinaerdaten((ID_Binaerdaten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				setPruefmerkmaleBinaerdaten((Pruefmerkmale_Daten_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				return iDAnhangEADoku != null;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				return iDBinaerdaten != null;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return pruefmerkmaleBinaerdaten != null;
		}
		return super.eIsSet(featureID);
	}

} //LT_Binaerdaten_AttributeGroupImpl
