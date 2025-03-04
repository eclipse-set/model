/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;
import org.eclipse.set.model.planpro.Ortung.Schaltmittel_Funktion_TypeClass;
import org.eclipse.set.model.planpro.Ortung.Schaltmittel_Zuordnung;

import org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schaltmittel Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.Schaltmittel_ZuordnungImpl#getIDAnforderung <em>ID Anforderung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.Schaltmittel_ZuordnungImpl#getIDSchalter <em>ID Schalter</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.Schaltmittel_ZuordnungImpl#getSchaltmittelFunktion <em>Schaltmittel Funktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schaltmittel_ZuordnungImpl extends Basis_ObjektImpl implements Schaltmittel_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDAnforderung() <em>ID Anforderung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnforderung()
	 * @generated
	 * @ordered
	 */
	protected ID_Anforderung_TypeClass iDAnforderung;

	/**
	 * The cached value of the '{@link #getIDSchalter() <em>ID Schalter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchalter()
	 * @generated
	 * @ordered
	 */
	protected ID_Schalter_TypeClass iDSchalter;

	/**
	 * The cached value of the '{@link #getSchaltmittelFunktion() <em>Schaltmittel Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltmittelFunktion()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Funktion_TypeClass schaltmittelFunktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schaltmittel_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.SCHALTMITTEL_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anforderung_TypeClass getIDAnforderung() {
		return iDAnforderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnforderung(ID_Anforderung_TypeClass newIDAnforderung, NotificationChain msgs) {
		ID_Anforderung_TypeClass oldIDAnforderung = iDAnforderung;
		iDAnforderung = newIDAnforderung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, oldIDAnforderung, newIDAnforderung);
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
	public void setIDAnforderung(ID_Anforderung_TypeClass newIDAnforderung) {
		if (newIDAnforderung != iDAnforderung) {
			NotificationChain msgs = null;
			if (iDAnforderung != null)
				msgs = ((InternalEObject)iDAnforderung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, null, msgs);
			if (newIDAnforderung != null)
				msgs = ((InternalEObject)newIDAnforderung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, null, msgs);
			msgs = basicSetIDAnforderung(newIDAnforderung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, newIDAnforderung, newIDAnforderung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schalter_TypeClass getIDSchalter() {
		return iDSchalter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSchalter(ID_Schalter_TypeClass newIDSchalter, NotificationChain msgs) {
		ID_Schalter_TypeClass oldIDSchalter = iDSchalter;
		iDSchalter = newIDSchalter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, oldIDSchalter, newIDSchalter);
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
	public void setIDSchalter(ID_Schalter_TypeClass newIDSchalter) {
		if (newIDSchalter != iDSchalter) {
			NotificationChain msgs = null;
			if (iDSchalter != null)
				msgs = ((InternalEObject)iDSchalter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, null, msgs);
			if (newIDSchalter != null)
				msgs = ((InternalEObject)newIDSchalter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, null, msgs);
			msgs = basicSetIDSchalter(newIDSchalter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, newIDSchalter, newIDSchalter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Funktion_TypeClass getSchaltmittelFunktion() {
		return schaltmittelFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass newSchaltmittelFunktion, NotificationChain msgs) {
		Schaltmittel_Funktion_TypeClass oldSchaltmittelFunktion = schaltmittelFunktion;
		schaltmittelFunktion = newSchaltmittelFunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, oldSchaltmittelFunktion, newSchaltmittelFunktion);
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
	public void setSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass newSchaltmittelFunktion) {
		if (newSchaltmittelFunktion != schaltmittelFunktion) {
			NotificationChain msgs = null;
			if (schaltmittelFunktion != null)
				msgs = ((InternalEObject)schaltmittelFunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, null, msgs);
			if (newSchaltmittelFunktion != null)
				msgs = ((InternalEObject)newSchaltmittelFunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, null, msgs);
			msgs = basicSetSchaltmittelFunktion(newSchaltmittelFunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, newSchaltmittelFunktion, newSchaltmittelFunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				return basicSetIDAnforderung(null, msgs);
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				return basicSetIDSchalter(null, msgs);
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return basicSetSchaltmittelFunktion(null, msgs);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				return getIDAnforderung();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				return getIDSchalter();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return getSchaltmittelFunktion();
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				setIDAnforderung((ID_Anforderung_TypeClass)newValue);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				setIDSchalter((ID_Schalter_TypeClass)newValue);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				setSchaltmittelFunktion((Schaltmittel_Funktion_TypeClass)newValue);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				setIDAnforderung((ID_Anforderung_TypeClass)null);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				setIDSchalter((ID_Schalter_TypeClass)null);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				setSchaltmittelFunktion((Schaltmittel_Funktion_TypeClass)null);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				return iDAnforderung != null;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				return iDSchalter != null;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return schaltmittelFunktion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schaltmittel_ZuordnungImpl
