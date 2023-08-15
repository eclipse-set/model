/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_V_Hg_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Start_Signal_Charakter_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Ziel_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Fahrweg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_FahrwegImpl#getFstrVHg <em>Fstr VHg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_FahrwegImpl#getIDStart <em>ID Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_FahrwegImpl#getIDZiel <em>ID Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_FahrwegImpl#getStartSignalCharakter <em>Start Signal Charakter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_FahrwegImpl extends Bereich_ObjektImpl implements Fstr_Fahrweg {
	/**
	 * The cached value of the '{@link #getFstrVHg() <em>Fstr VHg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrVHg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_V_Hg_TypeClass fstrVHg;

	/**
	 * The cached value of the '{@link #getIDStart() <em>ID Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStart()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDStart;

	/**
	 * The cached value of the '{@link #getIDZiel() <em>ID Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZiel()
	 * @generated
	 * @ordered
	 */
	protected ID_Ziel_TypeClass iDZiel;

	/**
	 * The cached value of the '{@link #getStartSignalCharakter() <em>Start Signal Charakter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSignalCharakter()
	 * @generated
	 * @ordered
	 */
	protected Start_Signal_Charakter_TypeClass startSignalCharakter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_FahrwegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_FAHRWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_V_Hg_TypeClass getFstrVHg() {
		return fstrVHg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrVHg(Fstr_V_Hg_TypeClass newFstrVHg, NotificationChain msgs) {
		Fstr_V_Hg_TypeClass oldFstrVHg = fstrVHg;
		fstrVHg = newFstrVHg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, oldFstrVHg, newFstrVHg);
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
	public void setFstrVHg(Fstr_V_Hg_TypeClass newFstrVHg) {
		if (newFstrVHg != fstrVHg) {
			NotificationChain msgs = null;
			if (fstrVHg != null)
				msgs = ((InternalEObject)fstrVHg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, null, msgs);
			if (newFstrVHg != null)
				msgs = ((InternalEObject)newFstrVHg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, null, msgs);
			msgs = basicSetFstrVHg(newFstrVHg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, newFstrVHg, newFstrVHg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDStart() {
		return iDStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStart(ID_Signal_TypeClass newIDStart, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDStart = iDStart;
		iDStart = newIDStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_START, oldIDStart, newIDStart);
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
	public void setIDStart(ID_Signal_TypeClass newIDStart) {
		if (newIDStart != iDStart) {
			NotificationChain msgs = null;
			if (iDStart != null)
				msgs = ((InternalEObject)iDStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__ID_START, null, msgs);
			if (newIDStart != null)
				msgs = ((InternalEObject)newIDStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__ID_START, null, msgs);
			msgs = basicSetIDStart(newIDStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_START, newIDStart, newIDStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ziel_TypeClass getIDZiel() {
		return iDZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZiel(ID_Ziel_TypeClass newIDZiel, NotificationChain msgs) {
		ID_Ziel_TypeClass oldIDZiel = iDZiel;
		iDZiel = newIDZiel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, oldIDZiel, newIDZiel);
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
	public void setIDZiel(ID_Ziel_TypeClass newIDZiel) {
		if (newIDZiel != iDZiel) {
			NotificationChain msgs = null;
			if (iDZiel != null)
				msgs = ((InternalEObject)iDZiel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, null, msgs);
			if (newIDZiel != null)
				msgs = ((InternalEObject)newIDZiel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, null, msgs);
			msgs = basicSetIDZiel(newIDZiel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, newIDZiel, newIDZiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_Signal_Charakter_TypeClass getStartSignalCharakter() {
		return startSignalCharakter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSignalCharakter(Start_Signal_Charakter_TypeClass newStartSignalCharakter, NotificationChain msgs) {
		Start_Signal_Charakter_TypeClass oldStartSignalCharakter = startSignalCharakter;
		startSignalCharakter = newStartSignalCharakter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, oldStartSignalCharakter, newStartSignalCharakter);
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
	public void setStartSignalCharakter(Start_Signal_Charakter_TypeClass newStartSignalCharakter) {
		if (newStartSignalCharakter != startSignalCharakter) {
			NotificationChain msgs = null;
			if (startSignalCharakter != null)
				msgs = ((InternalEObject)startSignalCharakter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, null, msgs);
			if (newStartSignalCharakter != null)
				msgs = ((InternalEObject)newStartSignalCharakter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, null, msgs);
			msgs = basicSetStartSignalCharakter(newStartSignalCharakter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, newStartSignalCharakter, newStartSignalCharakter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return basicSetFstrVHg(null, msgs);
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				return basicSetIDStart(null, msgs);
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				return basicSetIDZiel(null, msgs);
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return basicSetStartSignalCharakter(null, msgs);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return getFstrVHg();
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				return getIDStart();
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				return getIDZiel();
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return getStartSignalCharakter();
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				setFstrVHg((Fstr_V_Hg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				setIDStart((ID_Signal_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				setIDZiel((ID_Ziel_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				setStartSignalCharakter((Start_Signal_Charakter_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				setFstrVHg((Fstr_V_Hg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				setIDStart((ID_Signal_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				setIDZiel((ID_Ziel_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				setStartSignalCharakter((Start_Signal_Charakter_TypeClass)null);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return fstrVHg != null;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				return iDStart != null;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				return iDZiel != null;
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return startSignalCharakter != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_FahrwegImpl
