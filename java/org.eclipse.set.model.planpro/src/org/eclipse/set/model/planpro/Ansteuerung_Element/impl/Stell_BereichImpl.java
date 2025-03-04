/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_Stellwerk_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Zusatzinformation_Stellwerk_TypeClass;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stell Bereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Stell_BereichImpl#getZusatzinformationStellwerk <em>Zusatzinformation Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Stell_BereichImpl#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Stell_BereichImpl#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Stell_BereichImpl extends Bereich_ObjektImpl implements Stell_Bereich {
	/**
	 * The cached value of the '{@link #getZusatzinformationStellwerk() <em>Zusatzinformation Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzinformationStellwerk()
	 * @generated
	 * @ordered
	 */
	protected Zusatzinformation_Stellwerk_TypeClass zusatzinformationStellwerk;

	/**
	 * The cached value of the '{@link #getBezeichnungStellwerk() <em>Bezeichnung Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungStellwerk()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Stellwerk_TypeClass bezeichnungStellwerk;

	/**
	 * The cached value of the '{@link #getIDAussenelementansteuerung() <em>ID Aussenelementansteuerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_TypeClass iDAussenelementansteuerung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stell_BereichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.STELL_BEREICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzinformation_Stellwerk_TypeClass getZusatzinformationStellwerk() {
		return zusatzinformationStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass newZusatzinformationStellwerk, NotificationChain msgs) {
		Zusatzinformation_Stellwerk_TypeClass oldZusatzinformationStellwerk = zusatzinformationStellwerk;
		zusatzinformationStellwerk = newZusatzinformationStellwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, oldZusatzinformationStellwerk, newZusatzinformationStellwerk);
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
	public void setZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass newZusatzinformationStellwerk) {
		if (newZusatzinformationStellwerk != zusatzinformationStellwerk) {
			NotificationChain msgs = null;
			if (zusatzinformationStellwerk != null)
				msgs = ((InternalEObject)zusatzinformationStellwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, null, msgs);
			if (newZusatzinformationStellwerk != null)
				msgs = ((InternalEObject)newZusatzinformationStellwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, null, msgs);
			msgs = basicSetZusatzinformationStellwerk(newZusatzinformationStellwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, newZusatzinformationStellwerk, newZusatzinformationStellwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Stellwerk_TypeClass getBezeichnungStellwerk() {
		return bezeichnungStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass newBezeichnungStellwerk, NotificationChain msgs) {
		Bezeichnung_Stellwerk_TypeClass oldBezeichnungStellwerk = bezeichnungStellwerk;
		bezeichnungStellwerk = newBezeichnungStellwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, oldBezeichnungStellwerk, newBezeichnungStellwerk);
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
	public void setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass newBezeichnungStellwerk) {
		if (newBezeichnungStellwerk != bezeichnungStellwerk) {
			NotificationChain msgs = null;
			if (bezeichnungStellwerk != null)
				msgs = ((InternalEObject)bezeichnungStellwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, null, msgs);
			if (newBezeichnungStellwerk != null)
				msgs = ((InternalEObject)newBezeichnungStellwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, null, msgs);
			msgs = basicSetBezeichnungStellwerk(newBezeichnungStellwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, newBezeichnungStellwerk, newBezeichnungStellwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass getIDAussenelementansteuerung() {
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass newIDAussenelementansteuerung, NotificationChain msgs) {
		ID_Aussenelementansteuerung_TypeClass oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		iDAussenelementansteuerung = newIDAussenelementansteuerung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, newIDAussenelementansteuerung);
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
	public void setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass newIDAussenelementansteuerung) {
		if (newIDAussenelementansteuerung != iDAussenelementansteuerung) {
			NotificationChain msgs = null;
			if (iDAussenelementansteuerung != null)
				msgs = ((InternalEObject)iDAussenelementansteuerung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, null, msgs);
			if (newIDAussenelementansteuerung != null)
				msgs = ((InternalEObject)newIDAussenelementansteuerung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, null, msgs);
			msgs = basicSetIDAussenelementansteuerung(newIDAussenelementansteuerung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, newIDAussenelementansteuerung, newIDAussenelementansteuerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return basicSetZusatzinformationStellwerk(null, msgs);
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return basicSetBezeichnungStellwerk(null, msgs);
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				return basicSetIDAussenelementansteuerung(null, msgs);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return getZusatzinformationStellwerk();
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return getBezeichnungStellwerk();
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				return getIDAussenelementansteuerung();
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				setZusatzinformationStellwerk((Zusatzinformation_Stellwerk_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				setBezeichnungStellwerk((Bezeichnung_Stellwerk_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((ID_Aussenelementansteuerung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				setZusatzinformationStellwerk((Zusatzinformation_Stellwerk_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				setBezeichnungStellwerk((Bezeichnung_Stellwerk_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((ID_Aussenelementansteuerung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return zusatzinformationStellwerk != null;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return bezeichnungStellwerk != null;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				return iDAussenelementansteuerung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Stell_BereichImpl
