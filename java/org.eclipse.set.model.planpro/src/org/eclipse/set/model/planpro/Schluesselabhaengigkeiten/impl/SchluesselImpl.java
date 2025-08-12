/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluessel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselImpl#getSchluesselAllg <em>Schluessel Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchluesselImpl extends Basis_ObjektImpl implements Schluessel {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Schluessel_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getSchluesselAllg() <em>Schluessel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselAllg()
	 * @generated
	 * @ordered
	 */
	protected Schluessel_Allg_AttributeGroup schluesselAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLUESSEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Schluessel_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Schluessel_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Schluessel_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluessel_Allg_AttributeGroup getSchluesselAllg() {
		return schluesselAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchluesselAllg(Schluessel_Allg_AttributeGroup newSchluesselAllg, NotificationChain msgs) {
		Schluessel_Allg_AttributeGroup oldSchluesselAllg = schluesselAllg;
		schluesselAllg = newSchluesselAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG, oldSchluesselAllg, newSchluesselAllg);
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
	public void setSchluesselAllg(Schluessel_Allg_AttributeGroup newSchluesselAllg) {
		if (newSchluesselAllg != schluesselAllg) {
			NotificationChain msgs = null;
			if (schluesselAllg != null)
				msgs = ((InternalEObject)schluesselAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG, null, msgs);
			if (newSchluesselAllg != null)
				msgs = ((InternalEObject)newSchluesselAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG, null, msgs);
			msgs = basicSetSchluesselAllg(newSchluesselAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG, newSchluesselAllg, newSchluesselAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG:
				return basicSetSchluesselAllg(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG:
				return getBezeichnung();
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG:
				return getSchluesselAllg();
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG:
				setBezeichnung((Schluessel_Bezeichnung_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG:
				setSchluesselAllg((Schluessel_Allg_AttributeGroup)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG:
				setBezeichnung((Schluessel_Bezeichnung_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG:
				setSchluesselAllg((Schluessel_Allg_AttributeGroup)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__BEZEICHNUNG:
				return bezeichnung != null;
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL__SCHLUESSEL_ALLG:
				return schluesselAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //SchluesselImpl
