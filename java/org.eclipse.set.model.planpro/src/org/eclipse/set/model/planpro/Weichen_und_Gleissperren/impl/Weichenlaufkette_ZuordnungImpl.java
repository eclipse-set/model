/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weichenlaufkette Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Weichenlaufkette_ZuordnungImpl extends Basis_ObjektImpl implements Weichenlaufkette_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignal;

	/**
	 * The cached value of the '{@link #getIDWeichenlaufkette() <em>ID Weichenlaufkette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 * @ordered
	 */
	protected ID_Weichenlaufkette_TypeClass iDWeichenlaufkette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weichenlaufkette_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WEICHENLAUFKETTE_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Weichenlaufkette_TypeClass getIDWeichenlaufkette() {
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass newIDWeichenlaufkette, NotificationChain msgs) {
		ID_Weichenlaufkette_TypeClass oldIDWeichenlaufkette = iDWeichenlaufkette;
		iDWeichenlaufkette = newIDWeichenlaufkette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, newIDWeichenlaufkette);
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
	public void setIDWeichenlaufkette(ID_Weichenlaufkette_TypeClass newIDWeichenlaufkette) {
		if (newIDWeichenlaufkette != iDWeichenlaufkette) {
			NotificationChain msgs = null;
			if (iDWeichenlaufkette != null)
				msgs = ((InternalEObject)iDWeichenlaufkette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, null, msgs);
			if (newIDWeichenlaufkette != null)
				msgs = ((InternalEObject)newIDWeichenlaufkette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, null, msgs);
			msgs = basicSetIDWeichenlaufkette(newIDWeichenlaufkette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, newIDWeichenlaufkette, newIDWeichenlaufkette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				return basicSetIDWeichenlaufkette(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				return getIDSignal();
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				return getIDWeichenlaufkette();
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((ID_Weichenlaufkette_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((ID_Weichenlaufkette_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				return iDSignal != null;
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				return iDWeichenlaufkette != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Weichenlaufkette_ZuordnungImpl
