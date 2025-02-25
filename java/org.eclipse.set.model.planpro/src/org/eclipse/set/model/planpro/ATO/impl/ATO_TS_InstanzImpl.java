/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.ATO.ATOPackage;
import org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz;
import org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz_Adresse_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO TS Instanz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl#getATOTSInstanzAdresse <em>ATOTS Instanz Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_TS_InstanzImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_TS_InstanzImpl extends Basis_ObjektImpl implements ATO_TS_Instanz {
	/**
	 * The cached value of the '{@link #getATOTSInstanzAdresse() <em>ATOTS Instanz Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTSInstanzAdresse()
	 * @generated
	 * @ordered
	 */
	protected ATO_TS_Instanz_Adresse_AttributeGroup aTOTSInstanzAdresse;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_TypeClass iDUnterbringung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_TS_InstanzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TS_INSTANZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz_Adresse_AttributeGroup getATOTSInstanzAdresse() {
		return aTOTSInstanzAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup newATOTSInstanzAdresse, NotificationChain msgs) {
		ATO_TS_Instanz_Adresse_AttributeGroup oldATOTSInstanzAdresse = aTOTSInstanzAdresse;
		aTOTSInstanzAdresse = newATOTSInstanzAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, oldATOTSInstanzAdresse, newATOTSInstanzAdresse);
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
	public void setATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup newATOTSInstanzAdresse) {
		if (newATOTSInstanzAdresse != aTOTSInstanzAdresse) {
			NotificationChain msgs = null;
			if (aTOTSInstanzAdresse != null)
				msgs = ((InternalEObject)aTOTSInstanzAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, null, msgs);
			if (newATOTSInstanzAdresse != null)
				msgs = ((InternalEObject)newATOTSInstanzAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, null, msgs);
			msgs = basicSetATOTSInstanzAdresse(newATOTSInstanzAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, newATOTSInstanzAdresse, newATOTSInstanzAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return basicSetATOTSInstanzAdresse(null, msgs);
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return getATOTSInstanzAdresse();
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				setATOTSInstanzAdresse((ATO_TS_Instanz_Adresse_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				setATOTSInstanzAdresse((ATO_TS_Instanz_Adresse_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return aTOTSInstanzAdresse != null;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ATO_TS_InstanzImpl
