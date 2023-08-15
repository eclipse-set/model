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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Daten_TypeClass;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaerdaten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.BinaerdatenImpl#getBinaerdatenDatei <em>Binaerdaten Datei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.BinaerdatenImpl#getDaten <em>Daten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaerdatenImpl extends Basis_ObjektImpl implements Binaerdaten {
	/**
	 * The cached value of the '{@link #getBinaerdatenDatei() <em>Binaerdaten Datei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaerdatenDatei()
	 * @generated
	 * @ordered
	 */
	protected Binaerdaten_Datei_AttributeGroup binaerdatenDatei;

	/**
	 * The cached value of the '{@link #getDaten() <em>Daten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaten()
	 * @generated
	 * @ordered
	 */
	protected Daten_TypeClass daten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaerdatenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBinaerdaten();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdaten_Datei_AttributeGroup getBinaerdatenDatei() {
		return binaerdatenDatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaerdatenDatei(Binaerdaten_Datei_AttributeGroup newBinaerdatenDatei, NotificationChain msgs) {
		Binaerdaten_Datei_AttributeGroup oldBinaerdatenDatei = binaerdatenDatei;
		binaerdatenDatei = newBinaerdatenDatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI, oldBinaerdatenDatei, newBinaerdatenDatei);
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
	public void setBinaerdatenDatei(Binaerdaten_Datei_AttributeGroup newBinaerdatenDatei) {
		if (newBinaerdatenDatei != binaerdatenDatei) {
			NotificationChain msgs = null;
			if (binaerdatenDatei != null)
				msgs = ((InternalEObject)binaerdatenDatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI, null, msgs);
			if (newBinaerdatenDatei != null)
				msgs = ((InternalEObject)newBinaerdatenDatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI, null, msgs);
			msgs = basicSetBinaerdatenDatei(newBinaerdatenDatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI, newBinaerdatenDatei, newBinaerdatenDatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Daten_TypeClass getDaten() {
		return daten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaten(Daten_TypeClass newDaten, NotificationChain msgs) {
		Daten_TypeClass oldDaten = daten;
		daten = newDaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN__DATEN, oldDaten, newDaten);
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
	public void setDaten(Daten_TypeClass newDaten) {
		if (newDaten != daten) {
			NotificationChain msgs = null;
			if (daten != null)
				msgs = ((InternalEObject)daten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN__DATEN, null, msgs);
			if (newDaten != null)
				msgs = ((InternalEObject)newDaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN__DATEN, null, msgs);
			msgs = basicSetDaten(newDaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN__DATEN, newDaten, newDaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI:
				return basicSetBinaerdatenDatei(null, msgs);
			case Balisentechnik_ETCSPackage.BINAERDATEN__DATEN:
				return basicSetDaten(null, msgs);
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
			case Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI:
				return getBinaerdatenDatei();
			case Balisentechnik_ETCSPackage.BINAERDATEN__DATEN:
				return getDaten();
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
			case Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI:
				setBinaerdatenDatei((Binaerdaten_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEN__DATEN:
				setDaten((Daten_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI:
				setBinaerdatenDatei((Binaerdaten_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEN__DATEN:
				setDaten((Daten_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BINAERDATEN__BINAERDATEN_DATEI:
				return binaerdatenDatei != null;
			case Balisentechnik_ETCSPackage.BINAERDATEN__DATEN:
				return daten != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaerdatenImpl
