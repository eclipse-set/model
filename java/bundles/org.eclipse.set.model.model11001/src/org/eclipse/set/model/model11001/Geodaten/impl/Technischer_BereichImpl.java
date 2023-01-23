/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model11001.Geodaten.TB_Art_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TB_Beschreibung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technischer Bereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Technischer_BereichImpl#getTBArt <em>TB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Technischer_BereichImpl#getTBBeschreibung <em>TB Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Technischer_BereichImpl extends Bereich_ObjektImpl implements Technischer_Bereich {
	/**
	 * The cached value of the '{@link #getTBArt() <em>TB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBArt()
	 * @generated
	 * @ordered
	 */
	protected TB_Art_TypeClass tBArt;

	/**
	 * The cached value of the '{@link #getTBBeschreibung() <em>TB Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTBBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected TB_Beschreibung_TypeClass tBBeschreibung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technischer_BereichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TECHNISCHER_BEREICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TB_Art_TypeClass getTBArt() {
		return tBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTBArt(TB_Art_TypeClass newTBArt, NotificationChain msgs) {
		TB_Art_TypeClass oldTBArt = tBArt;
		tBArt = newTBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_BEREICH__TB_ART, oldTBArt, newTBArt);
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
	public void setTBArt(TB_Art_TypeClass newTBArt) {
		if (newTBArt != tBArt) {
			NotificationChain msgs = null;
			if (tBArt != null)
				msgs = ((InternalEObject)tBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_BEREICH__TB_ART, null, msgs);
			if (newTBArt != null)
				msgs = ((InternalEObject)newTBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_BEREICH__TB_ART, null, msgs);
			msgs = basicSetTBArt(newTBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_BEREICH__TB_ART, newTBArt, newTBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TB_Beschreibung_TypeClass getTBBeschreibung() {
		return tBBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTBBeschreibung(TB_Beschreibung_TypeClass newTBBeschreibung, NotificationChain msgs) {
		TB_Beschreibung_TypeClass oldTBBeschreibung = tBBeschreibung;
		tBBeschreibung = newTBBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG, oldTBBeschreibung, newTBBeschreibung);
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
	public void setTBBeschreibung(TB_Beschreibung_TypeClass newTBBeschreibung) {
		if (newTBBeschreibung != tBBeschreibung) {
			NotificationChain msgs = null;
			if (tBBeschreibung != null)
				msgs = ((InternalEObject)tBBeschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG, null, msgs);
			if (newTBBeschreibung != null)
				msgs = ((InternalEObject)newTBBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG, null, msgs);
			msgs = basicSetTBBeschreibung(newTBBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG, newTBBeschreibung, newTBBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_ART:
				return basicSetTBArt(null, msgs);
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG:
				return basicSetTBBeschreibung(null, msgs);
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
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_ART:
				return getTBArt();
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG:
				return getTBBeschreibung();
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
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_ART:
				setTBArt((TB_Art_TypeClass)newValue);
				return;
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG:
				setTBBeschreibung((TB_Beschreibung_TypeClass)newValue);
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
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_ART:
				setTBArt((TB_Art_TypeClass)null);
				return;
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG:
				setTBBeschreibung((TB_Beschreibung_TypeClass)null);
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
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_ART:
				return tBArt != null;
			case GeodatenPackage.TECHNISCHER_BEREICH__TB_BESCHREIBUNG:
				return tBBeschreibung != null;
		}
		return super.eIsSet(featureID);
	}

} //Technischer_BereichImpl
