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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Textmeldung_TypeClass;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Richtungsanzeige</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getTextmeldung <em>Textmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_RichtungsanzeigeImpl extends Basis_ObjektImpl implements ETCS_Richtungsanzeige {
	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Fahrweg_ohne_Proxy_TypeClass iDFstrFahrweg;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitInRichtung() <em>ID Oertlichkeit In Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitInRichtung()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeitInRichtung;

	/**
	 * The cached value of the '{@link #getTextmeldung() <em>Textmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextmeldung()
	 * @generated
	 * @ordered
	 */
	protected Textmeldung_TypeClass textmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_RichtungsanzeigeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Richtungsanzeige();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Fahrweg_ohne_Proxy_TypeClass getIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrFahrweg(ID_Fstr_Fahrweg_ohne_Proxy_TypeClass newIDFstrFahrweg, NotificationChain msgs) {
		ID_Fstr_Fahrweg_ohne_Proxy_TypeClass oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, newIDFstrFahrweg);
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
	public void setIDFstrFahrweg(ID_Fstr_Fahrweg_ohne_Proxy_TypeClass newIDFstrFahrweg) {
		if (newIDFstrFahrweg != iDFstrFahrweg) {
			NotificationChain msgs = null;
			if (iDFstrFahrweg != null)
				msgs = ((InternalEObject)iDFstrFahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, null, msgs);
			if (newIDFstrFahrweg != null)
				msgs = ((InternalEObject)newIDFstrFahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, null, msgs);
			msgs = basicSetIDFstrFahrweg(newIDFstrFahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, newIDFstrFahrweg, newIDFstrFahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitInRichtung() {
		return iDOertlichkeitInRichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeitInRichtung(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitInRichtung, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeitInRichtung = iDOertlichkeitInRichtung;
		iDOertlichkeitInRichtung = newIDOertlichkeitInRichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, oldIDOertlichkeitInRichtung, newIDOertlichkeitInRichtung);
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
	public void setIDOertlichkeitInRichtung(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitInRichtung) {
		if (newIDOertlichkeitInRichtung != iDOertlichkeitInRichtung) {
			NotificationChain msgs = null;
			if (iDOertlichkeitInRichtung != null)
				msgs = ((InternalEObject)iDOertlichkeitInRichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, null, msgs);
			if (newIDOertlichkeitInRichtung != null)
				msgs = ((InternalEObject)newIDOertlichkeitInRichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, null, msgs);
			msgs = basicSetIDOertlichkeitInRichtung(newIDOertlichkeitInRichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, newIDOertlichkeitInRichtung, newIDOertlichkeitInRichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textmeldung_TypeClass getTextmeldung() {
		return textmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextmeldung(Textmeldung_TypeClass newTextmeldung, NotificationChain msgs) {
		Textmeldung_TypeClass oldTextmeldung = textmeldung;
		textmeldung = newTextmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, oldTextmeldung, newTextmeldung);
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
	public void setTextmeldung(Textmeldung_TypeClass newTextmeldung) {
		if (newTextmeldung != textmeldung) {
			NotificationChain msgs = null;
			if (textmeldung != null)
				msgs = ((InternalEObject)textmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, null, msgs);
			if (newTextmeldung != null)
				msgs = ((InternalEObject)newTextmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, null, msgs);
			msgs = basicSetTextmeldung(newTextmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, newTextmeldung, newTextmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				return basicSetIDFstrFahrweg(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				return basicSetIDOertlichkeitInRichtung(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return basicSetTextmeldung(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				return getIDFstrFahrweg();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				return getIDOertlichkeitInRichtung();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return getTextmeldung();
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				setIDOertlichkeitInRichtung((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				setTextmeldung((Textmeldung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				setIDOertlichkeitInRichtung((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				setTextmeldung((Textmeldung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				return iDFstrFahrweg != null;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				return iDOertlichkeitInRichtung != null;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return textmeldung != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_RichtungsanzeigeImpl
