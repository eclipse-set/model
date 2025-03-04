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

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.PlanPro.Adresse_PLZ_Ort_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Adresse_Strasse_Nr_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.E_Mail_Adresse_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Name_Organisation_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Organisation;
import org.eclipse.set.model.planpro.PlanPro.Organisationseinheit_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Telefonnummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getAdressePLZOrt <em>Adresse PLZ Ort</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getAdresseStrasseNr <em>Adresse Strasse Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getEMailAdresse <em>EMail Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getNameOrganisation <em>Name Organisation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getOrganisationseinheit <em>Organisationseinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.OrganisationImpl#getTelefonnummer <em>Telefonnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends Ur_ObjektImpl implements Organisation {
	/**
	 * The cached value of the '{@link #getAdressePLZOrt() <em>Adresse PLZ Ort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressePLZOrt()
	 * @generated
	 * @ordered
	 */
	protected Adresse_PLZ_Ort_TypeClass adressePLZOrt;

	/**
	 * The cached value of the '{@link #getAdresseStrasseNr() <em>Adresse Strasse Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseStrasseNr()
	 * @generated
	 * @ordered
	 */
	protected Adresse_Strasse_Nr_TypeClass adresseStrasseNr;

	/**
	 * The cached value of the '{@link #getEMailAdresse() <em>EMail Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMailAdresse()
	 * @generated
	 * @ordered
	 */
	protected E_Mail_Adresse_TypeClass eMailAdresse;

	/**
	 * The cached value of the '{@link #getNameOrganisation() <em>Name Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Name_Organisation_TypeClass nameOrganisation;

	/**
	 * The cached value of the '{@link #getOrganisationseinheit() <em>Organisationseinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationseinheit()
	 * @generated
	 * @ordered
	 */
	protected Organisationseinheit_TypeClass organisationseinheit;

	/**
	 * The cached value of the '{@link #getTelefonnummer() <em>Telefonnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonnummer()
	 * @generated
	 * @ordered
	 */
	protected Telefonnummer_TypeClass telefonnummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getOrganisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adresse_PLZ_Ort_TypeClass getAdressePLZOrt() {
		return adressePLZOrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressePLZOrt(Adresse_PLZ_Ort_TypeClass newAdressePLZOrt, NotificationChain msgs) {
		Adresse_PLZ_Ort_TypeClass oldAdressePLZOrt = adressePLZOrt;
		adressePLZOrt = newAdressePLZOrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT, oldAdressePLZOrt, newAdressePLZOrt);
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
	public void setAdressePLZOrt(Adresse_PLZ_Ort_TypeClass newAdressePLZOrt) {
		if (newAdressePLZOrt != adressePLZOrt) {
			NotificationChain msgs = null;
			if (adressePLZOrt != null)
				msgs = ((InternalEObject)adressePLZOrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT, null, msgs);
			if (newAdressePLZOrt != null)
				msgs = ((InternalEObject)newAdressePLZOrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT, null, msgs);
			msgs = basicSetAdressePLZOrt(newAdressePLZOrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT, newAdressePLZOrt, newAdressePLZOrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adresse_Strasse_Nr_TypeClass getAdresseStrasseNr() {
		return adresseStrasseNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresseStrasseNr(Adresse_Strasse_Nr_TypeClass newAdresseStrasseNr, NotificationChain msgs) {
		Adresse_Strasse_Nr_TypeClass oldAdresseStrasseNr = adresseStrasseNr;
		adresseStrasseNr = newAdresseStrasseNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR, oldAdresseStrasseNr, newAdresseStrasseNr);
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
	public void setAdresseStrasseNr(Adresse_Strasse_Nr_TypeClass newAdresseStrasseNr) {
		if (newAdresseStrasseNr != adresseStrasseNr) {
			NotificationChain msgs = null;
			if (adresseStrasseNr != null)
				msgs = ((InternalEObject)adresseStrasseNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR, null, msgs);
			if (newAdresseStrasseNr != null)
				msgs = ((InternalEObject)newAdresseStrasseNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR, null, msgs);
			msgs = basicSetAdresseStrasseNr(newAdresseStrasseNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR, newAdresseStrasseNr, newAdresseStrasseNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E_Mail_Adresse_TypeClass getEMailAdresse() {
		return eMailAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEMailAdresse(E_Mail_Adresse_TypeClass newEMailAdresse, NotificationChain msgs) {
		E_Mail_Adresse_TypeClass oldEMailAdresse = eMailAdresse;
		eMailAdresse = newEMailAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__EMAIL_ADRESSE, oldEMailAdresse, newEMailAdresse);
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
	public void setEMailAdresse(E_Mail_Adresse_TypeClass newEMailAdresse) {
		if (newEMailAdresse != eMailAdresse) {
			NotificationChain msgs = null;
			if (eMailAdresse != null)
				msgs = ((InternalEObject)eMailAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__EMAIL_ADRESSE, null, msgs);
			if (newEMailAdresse != null)
				msgs = ((InternalEObject)newEMailAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__EMAIL_ADRESSE, null, msgs);
			msgs = basicSetEMailAdresse(newEMailAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__EMAIL_ADRESSE, newEMailAdresse, newEMailAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Organisation_TypeClass getNameOrganisation() {
		return nameOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameOrganisation(Name_Organisation_TypeClass newNameOrganisation, NotificationChain msgs) {
		Name_Organisation_TypeClass oldNameOrganisation = nameOrganisation;
		nameOrganisation = newNameOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__NAME_ORGANISATION, oldNameOrganisation, newNameOrganisation);
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
	public void setNameOrganisation(Name_Organisation_TypeClass newNameOrganisation) {
		if (newNameOrganisation != nameOrganisation) {
			NotificationChain msgs = null;
			if (nameOrganisation != null)
				msgs = ((InternalEObject)nameOrganisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__NAME_ORGANISATION, null, msgs);
			if (newNameOrganisation != null)
				msgs = ((InternalEObject)newNameOrganisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__NAME_ORGANISATION, null, msgs);
			msgs = basicSetNameOrganisation(newNameOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__NAME_ORGANISATION, newNameOrganisation, newNameOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisationseinheit_TypeClass getOrganisationseinheit() {
		return organisationseinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisationseinheit(Organisationseinheit_TypeClass newOrganisationseinheit, NotificationChain msgs) {
		Organisationseinheit_TypeClass oldOrganisationseinheit = organisationseinheit;
		organisationseinheit = newOrganisationseinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT, oldOrganisationseinheit, newOrganisationseinheit);
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
	public void setOrganisationseinheit(Organisationseinheit_TypeClass newOrganisationseinheit) {
		if (newOrganisationseinheit != organisationseinheit) {
			NotificationChain msgs = null;
			if (organisationseinheit != null)
				msgs = ((InternalEObject)organisationseinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT, null, msgs);
			if (newOrganisationseinheit != null)
				msgs = ((InternalEObject)newOrganisationseinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT, null, msgs);
			msgs = basicSetOrganisationseinheit(newOrganisationseinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT, newOrganisationseinheit, newOrganisationseinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telefonnummer_TypeClass getTelefonnummer() {
		return telefonnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelefonnummer(Telefonnummer_TypeClass newTelefonnummer, NotificationChain msgs) {
		Telefonnummer_TypeClass oldTelefonnummer = telefonnummer;
		telefonnummer = newTelefonnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__TELEFONNUMMER, oldTelefonnummer, newTelefonnummer);
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
	public void setTelefonnummer(Telefonnummer_TypeClass newTelefonnummer) {
		if (newTelefonnummer != telefonnummer) {
			NotificationChain msgs = null;
			if (telefonnummer != null)
				msgs = ((InternalEObject)telefonnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__TELEFONNUMMER, null, msgs);
			if (newTelefonnummer != null)
				msgs = ((InternalEObject)newTelefonnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.ORGANISATION__TELEFONNUMMER, null, msgs);
			msgs = basicSetTelefonnummer(newTelefonnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.ORGANISATION__TELEFONNUMMER, newTelefonnummer, newTelefonnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT:
				return basicSetAdressePLZOrt(null, msgs);
			case PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR:
				return basicSetAdresseStrasseNr(null, msgs);
			case PlanProPackage.ORGANISATION__EMAIL_ADRESSE:
				return basicSetEMailAdresse(null, msgs);
			case PlanProPackage.ORGANISATION__NAME_ORGANISATION:
				return basicSetNameOrganisation(null, msgs);
			case PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT:
				return basicSetOrganisationseinheit(null, msgs);
			case PlanProPackage.ORGANISATION__TELEFONNUMMER:
				return basicSetTelefonnummer(null, msgs);
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
			case PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT:
				return getAdressePLZOrt();
			case PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR:
				return getAdresseStrasseNr();
			case PlanProPackage.ORGANISATION__EMAIL_ADRESSE:
				return getEMailAdresse();
			case PlanProPackage.ORGANISATION__NAME_ORGANISATION:
				return getNameOrganisation();
			case PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT:
				return getOrganisationseinheit();
			case PlanProPackage.ORGANISATION__TELEFONNUMMER:
				return getTelefonnummer();
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
			case PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT:
				setAdressePLZOrt((Adresse_PLZ_Ort_TypeClass)newValue);
				return;
			case PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR:
				setAdresseStrasseNr((Adresse_Strasse_Nr_TypeClass)newValue);
				return;
			case PlanProPackage.ORGANISATION__EMAIL_ADRESSE:
				setEMailAdresse((E_Mail_Adresse_TypeClass)newValue);
				return;
			case PlanProPackage.ORGANISATION__NAME_ORGANISATION:
				setNameOrganisation((Name_Organisation_TypeClass)newValue);
				return;
			case PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT:
				setOrganisationseinheit((Organisationseinheit_TypeClass)newValue);
				return;
			case PlanProPackage.ORGANISATION__TELEFONNUMMER:
				setTelefonnummer((Telefonnummer_TypeClass)newValue);
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
			case PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT:
				setAdressePLZOrt((Adresse_PLZ_Ort_TypeClass)null);
				return;
			case PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR:
				setAdresseStrasseNr((Adresse_Strasse_Nr_TypeClass)null);
				return;
			case PlanProPackage.ORGANISATION__EMAIL_ADRESSE:
				setEMailAdresse((E_Mail_Adresse_TypeClass)null);
				return;
			case PlanProPackage.ORGANISATION__NAME_ORGANISATION:
				setNameOrganisation((Name_Organisation_TypeClass)null);
				return;
			case PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT:
				setOrganisationseinheit((Organisationseinheit_TypeClass)null);
				return;
			case PlanProPackage.ORGANISATION__TELEFONNUMMER:
				setTelefonnummer((Telefonnummer_TypeClass)null);
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
			case PlanProPackage.ORGANISATION__ADRESSE_PLZ_ORT:
				return adressePLZOrt != null;
			case PlanProPackage.ORGANISATION__ADRESSE_STRASSE_NR:
				return adresseStrasseNr != null;
			case PlanProPackage.ORGANISATION__EMAIL_ADRESSE:
				return eMailAdresse != null;
			case PlanProPackage.ORGANISATION__NAME_ORGANISATION:
				return nameOrganisation != null;
			case PlanProPackage.ORGANISATION__ORGANISATIONSEINHEIT:
				return organisationseinheit != null;
			case PlanProPackage.ORGANISATION__TELEFONNUMMER:
				return telefonnummer != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //OrganisationImpl
