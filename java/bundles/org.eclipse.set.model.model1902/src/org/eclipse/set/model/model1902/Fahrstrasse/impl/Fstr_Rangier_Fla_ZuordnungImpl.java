/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung;

import org.eclipse.set.model.model1902.Verweise.ID_Fla_Schutz_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Rangier Fla Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl#getIDFstrRangier <em>ID Fstr Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Rangier_Fla_ZuordnungImpl extends Basis_ObjektImpl implements Fstr_Rangier_Fla_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFlaSchutz() <em>ID Fla Schutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutz()
	 * @generated
	 * @ordered
	 */
	protected ID_Fla_Schutz_TypeClass iDFlaSchutz;

	/**
	 * The cached value of the '{@link #getIDFstrRangier() <em>ID Fstr Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrRangier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Rangier_Fla_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_RANGIER_FLA_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fla_Schutz_TypeClass getIDFlaSchutz() {
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaSchutz(ID_Fla_Schutz_TypeClass newIDFlaSchutz, NotificationChain msgs) {
		ID_Fla_Schutz_TypeClass oldIDFlaSchutz = iDFlaSchutz;
		iDFlaSchutz = newIDFlaSchutz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, newIDFlaSchutz);
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
	public void setIDFlaSchutz(ID_Fla_Schutz_TypeClass newIDFlaSchutz) {
		if (newIDFlaSchutz != iDFlaSchutz) {
			NotificationChain msgs = null;
			if (iDFlaSchutz != null)
				msgs = ((InternalEObject)iDFlaSchutz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, null, msgs);
			if (newIDFlaSchutz != null)
				msgs = ((InternalEObject)newIDFlaSchutz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, null, msgs);
			msgs = basicSetIDFlaSchutz(newIDFlaSchutz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, newIDFlaSchutz, newIDFlaSchutz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrRangier() {
		return iDFstrRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrRangier = iDFstrRangier;
		iDFstrRangier = newIDFstrRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, oldIDFstrRangier, newIDFstrRangier);
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
	public void setIDFstrRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrRangier) {
		if (newIDFstrRangier != iDFstrRangier) {
			NotificationChain msgs = null;
			if (iDFstrRangier != null)
				msgs = ((InternalEObject)iDFstrRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, null, msgs);
			if (newIDFstrRangier != null)
				msgs = ((InternalEObject)newIDFstrRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, null, msgs);
			msgs = basicSetIDFstrRangier(newIDFstrRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, newIDFstrRangier, newIDFstrRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				return basicSetIDFlaSchutz(null, msgs);
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				return basicSetIDFstrRangier(null, msgs);
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				return getIDFlaSchutz();
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				return getIDFstrRangier();
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((ID_Fla_Schutz_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				setIDFstrRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((ID_Fla_Schutz_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				setIDFstrRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				return iDFlaSchutz != null;
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				return iDFstrRangier != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Rangier_Fla_ZuordnungImpl
