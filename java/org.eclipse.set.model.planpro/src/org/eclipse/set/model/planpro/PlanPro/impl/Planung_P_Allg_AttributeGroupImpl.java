/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.PlanPro.Akteur;
import org.eclipse.set.model.planpro.PlanPro.Bezeichnung_Planung_Projekt_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Datum_Abschluss_Projekt_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_P_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Projekt_Nummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung PAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_P_Allg_AttributeGroupImpl#getBezeichnungPlanungProjekt <em>Bezeichnung Planung Projekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_P_Allg_AttributeGroupImpl#getDatumAbschlussProjekt <em>Datum Abschluss Projekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_P_Allg_AttributeGroupImpl#getProjektNummer <em>Projekt Nummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_P_Allg_AttributeGroupImpl#getProjektleiter <em>Projektleiter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_P_Allg_AttributeGroupImpl extends EObjectImpl implements Planung_P_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungPlanungProjekt() <em>Bezeichnung Planung Projekt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungPlanungProjekt()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Planung_Projekt_TypeClass bezeichnungPlanungProjekt;

	/**
	 * The cached value of the '{@link #getDatumAbschlussProjekt() <em>Datum Abschluss Projekt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumAbschlussProjekt()
	 * @generated
	 * @ordered
	 */
	protected Datum_Abschluss_Projekt_TypeClass datumAbschlussProjekt;

	/**
	 * The cached value of the '{@link #getProjektNummer() <em>Projekt Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjektNummer()
	 * @generated
	 * @ordered
	 */
	protected Projekt_Nummer_TypeClass projektNummer;

	/**
	 * The cached value of the '{@link #getProjektleiter() <em>Projektleiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjektleiter()
	 * @generated
	 * @ordered
	 */
	protected Akteur projektleiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_P_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_P_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Planung_Projekt_TypeClass getBezeichnungPlanungProjekt() {
		return bezeichnungPlanungProjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungPlanungProjekt(Bezeichnung_Planung_Projekt_TypeClass newBezeichnungPlanungProjekt, NotificationChain msgs) {
		Bezeichnung_Planung_Projekt_TypeClass oldBezeichnungPlanungProjekt = bezeichnungPlanungProjekt;
		bezeichnungPlanungProjekt = newBezeichnungPlanungProjekt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT, oldBezeichnungPlanungProjekt, newBezeichnungPlanungProjekt);
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
	public void setBezeichnungPlanungProjekt(Bezeichnung_Planung_Projekt_TypeClass newBezeichnungPlanungProjekt) {
		if (newBezeichnungPlanungProjekt != bezeichnungPlanungProjekt) {
			NotificationChain msgs = null;
			if (bezeichnungPlanungProjekt != null)
				msgs = ((InternalEObject)bezeichnungPlanungProjekt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT, null, msgs);
			if (newBezeichnungPlanungProjekt != null)
				msgs = ((InternalEObject)newBezeichnungPlanungProjekt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT, null, msgs);
			msgs = basicSetBezeichnungPlanungProjekt(newBezeichnungPlanungProjekt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT, newBezeichnungPlanungProjekt, newBezeichnungPlanungProjekt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Projekt_TypeClass getDatumAbschlussProjekt() {
		return datumAbschlussProjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumAbschlussProjekt(Datum_Abschluss_Projekt_TypeClass newDatumAbschlussProjekt, NotificationChain msgs) {
		Datum_Abschluss_Projekt_TypeClass oldDatumAbschlussProjekt = datumAbschlussProjekt;
		datumAbschlussProjekt = newDatumAbschlussProjekt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT, oldDatumAbschlussProjekt, newDatumAbschlussProjekt);
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
	public void setDatumAbschlussProjekt(Datum_Abschluss_Projekt_TypeClass newDatumAbschlussProjekt) {
		if (newDatumAbschlussProjekt != datumAbschlussProjekt) {
			NotificationChain msgs = null;
			if (datumAbschlussProjekt != null)
				msgs = ((InternalEObject)datumAbschlussProjekt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT, null, msgs);
			if (newDatumAbschlussProjekt != null)
				msgs = ((InternalEObject)newDatumAbschlussProjekt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT, null, msgs);
			msgs = basicSetDatumAbschlussProjekt(newDatumAbschlussProjekt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT, newDatumAbschlussProjekt, newDatumAbschlussProjekt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Projekt_Nummer_TypeClass getProjektNummer() {
		return projektNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjektNummer(Projekt_Nummer_TypeClass newProjektNummer, NotificationChain msgs) {
		Projekt_Nummer_TypeClass oldProjektNummer = projektNummer;
		projektNummer = newProjektNummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER, oldProjektNummer, newProjektNummer);
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
	public void setProjektNummer(Projekt_Nummer_TypeClass newProjektNummer) {
		if (newProjektNummer != projektNummer) {
			NotificationChain msgs = null;
			if (projektNummer != null)
				msgs = ((InternalEObject)projektNummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER, null, msgs);
			if (newProjektNummer != null)
				msgs = ((InternalEObject)newProjektNummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER, null, msgs);
			msgs = basicSetProjektNummer(newProjektNummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER, newProjektNummer, newProjektNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur getProjektleiter() {
		return projektleiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjektleiter(Akteur newProjektleiter, NotificationChain msgs) {
		Akteur oldProjektleiter = projektleiter;
		projektleiter = newProjektleiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER, oldProjektleiter, newProjektleiter);
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
	public void setProjektleiter(Akteur newProjektleiter) {
		if (newProjektleiter != projektleiter) {
			NotificationChain msgs = null;
			if (projektleiter != null)
				msgs = ((InternalEObject)projektleiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER, null, msgs);
			if (newProjektleiter != null)
				msgs = ((InternalEObject)newProjektleiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER, null, msgs);
			msgs = basicSetProjektleiter(newProjektleiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER, newProjektleiter, newProjektleiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT:
				return basicSetBezeichnungPlanungProjekt(null, msgs);
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT:
				return basicSetDatumAbschlussProjekt(null, msgs);
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER:
				return basicSetProjektNummer(null, msgs);
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER:
				return basicSetProjektleiter(null, msgs);
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
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT:
				return getBezeichnungPlanungProjekt();
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT:
				return getDatumAbschlussProjekt();
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER:
				return getProjektNummer();
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER:
				return getProjektleiter();
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
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT:
				setBezeichnungPlanungProjekt((Bezeichnung_Planung_Projekt_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT:
				setDatumAbschlussProjekt((Datum_Abschluss_Projekt_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER:
				setProjektNummer((Projekt_Nummer_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER:
				setProjektleiter((Akteur)newValue);
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
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT:
				setBezeichnungPlanungProjekt((Bezeichnung_Planung_Projekt_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT:
				setDatumAbschlussProjekt((Datum_Abschluss_Projekt_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER:
				setProjektNummer((Projekt_Nummer_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER:
				setProjektleiter((Akteur)null);
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
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__BEZEICHNUNG_PLANUNG_PROJEKT:
				return bezeichnungPlanungProjekt != null;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_PROJEKT:
				return datumAbschlussProjekt != null;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKT_NUMMER:
				return projektNummer != null;
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP__PROJEKTLEITER:
				return projektleiter != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Planung_P_Allg_AttributeGroupImpl
