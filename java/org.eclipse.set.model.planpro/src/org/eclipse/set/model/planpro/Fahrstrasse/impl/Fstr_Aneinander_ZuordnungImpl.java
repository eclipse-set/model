/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Aneinander Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl#getIDFstrAneinander <em>ID Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Aneinander_ZuordnungImpl extends Basis_ObjektImpl implements Fstr_Aneinander_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFstrAneinander() <em>ID Fstr Aneinander</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrAneinander()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Aneinander_TypeClass iDFstrAneinander;

	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Aneinander_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ANEINANDER_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Aneinander_TypeClass getIDFstrAneinander() {
		return iDFstrAneinander;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrAneinander(ID_Fstr_Aneinander_TypeClass newIDFstrAneinander, NotificationChain msgs) {
		ID_Fstr_Aneinander_TypeClass oldIDFstrAneinander = iDFstrAneinander;
		iDFstrAneinander = newIDFstrAneinander;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, oldIDFstrAneinander, newIDFstrAneinander);
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
	public void setIDFstrAneinander(ID_Fstr_Aneinander_TypeClass newIDFstrAneinander) {
		if (newIDFstrAneinander != iDFstrAneinander) {
			NotificationChain msgs = null;
			if (iDFstrAneinander != null)
				msgs = ((InternalEObject)iDFstrAneinander).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, null, msgs);
			if (newIDFstrAneinander != null)
				msgs = ((InternalEObject)newIDFstrAneinander).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, null, msgs);
			msgs = basicSetIDFstrAneinander(newIDFstrAneinander, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, newIDFstrAneinander, newIDFstrAneinander));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				return basicSetIDFstrAneinander(null, msgs);
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				return getIDFstrAneinander();
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				setIDFstrAneinander((ID_Fstr_Aneinander_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				setIDFstrAneinander((ID_Fstr_Aneinander_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				return iDFstrAneinander != null;
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Aneinander_ZuordnungImpl
