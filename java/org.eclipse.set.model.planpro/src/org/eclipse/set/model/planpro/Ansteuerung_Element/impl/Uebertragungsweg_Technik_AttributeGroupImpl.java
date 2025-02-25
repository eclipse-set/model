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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Bandbreite_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Medium_Art_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Netz_Art_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Art_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Beschreibung_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uebertragungsweg Technik Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Uebertragungsweg_Technik_AttributeGroupImpl#getBandbreite <em>Bandbreite</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Uebertragungsweg_Technik_AttributeGroupImpl#getMediumArt <em>Medium Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Uebertragungsweg_Technik_AttributeGroupImpl#getNetzArt <em>Netz Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Uebertragungsweg_Technik_AttributeGroupImpl#getTechnikArt <em>Technik Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Uebertragungsweg_Technik_AttributeGroupImpl#getTechnikBeschreibung <em>Technik Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Uebertragungsweg_Technik_AttributeGroupImpl extends EObjectImpl implements Uebertragungsweg_Technik_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBandbreite() <em>Bandbreite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandbreite()
	 * @generated
	 * @ordered
	 */
	protected Bandbreite_TypeClass bandbreite;

	/**
	 * The cached value of the '{@link #getMediumArt() <em>Medium Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumArt()
	 * @generated
	 * @ordered
	 */
	protected Medium_Art_TypeClass mediumArt;

	/**
	 * The cached value of the '{@link #getNetzArt() <em>Netz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetzArt()
	 * @generated
	 * @ordered
	 */
	protected Netz_Art_TypeClass netzArt;

	/**
	 * The cached value of the '{@link #getTechnikArt() <em>Technik Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnikArt()
	 * @generated
	 * @ordered
	 */
	protected Technik_Art_TypeClass technikArt;

	/**
	 * The cached value of the '{@link #getTechnikBeschreibung() <em>Technik Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnikBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected Technik_Beschreibung_TypeClass technikBeschreibung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Uebertragungsweg_Technik_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandbreite_TypeClass getBandbreite() {
		return bandbreite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandbreite(Bandbreite_TypeClass newBandbreite, NotificationChain msgs) {
		Bandbreite_TypeClass oldBandbreite = bandbreite;
		bandbreite = newBandbreite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE, oldBandbreite, newBandbreite);
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
	public void setBandbreite(Bandbreite_TypeClass newBandbreite) {
		if (newBandbreite != bandbreite) {
			NotificationChain msgs = null;
			if (bandbreite != null)
				msgs = ((InternalEObject)bandbreite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE, null, msgs);
			if (newBandbreite != null)
				msgs = ((InternalEObject)newBandbreite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE, null, msgs);
			msgs = basicSetBandbreite(newBandbreite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE, newBandbreite, newBandbreite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medium_Art_TypeClass getMediumArt() {
		return mediumArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediumArt(Medium_Art_TypeClass newMediumArt, NotificationChain msgs) {
		Medium_Art_TypeClass oldMediumArt = mediumArt;
		mediumArt = newMediumArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART, oldMediumArt, newMediumArt);
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
	public void setMediumArt(Medium_Art_TypeClass newMediumArt) {
		if (newMediumArt != mediumArt) {
			NotificationChain msgs = null;
			if (mediumArt != null)
				msgs = ((InternalEObject)mediumArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART, null, msgs);
			if (newMediumArt != null)
				msgs = ((InternalEObject)newMediumArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART, null, msgs);
			msgs = basicSetMediumArt(newMediumArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART, newMediumArt, newMediumArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netz_Art_TypeClass getNetzArt() {
		return netzArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetzArt(Netz_Art_TypeClass newNetzArt, NotificationChain msgs) {
		Netz_Art_TypeClass oldNetzArt = netzArt;
		netzArt = newNetzArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART, oldNetzArt, newNetzArt);
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
	public void setNetzArt(Netz_Art_TypeClass newNetzArt) {
		if (newNetzArt != netzArt) {
			NotificationChain msgs = null;
			if (netzArt != null)
				msgs = ((InternalEObject)netzArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART, null, msgs);
			if (newNetzArt != null)
				msgs = ((InternalEObject)newNetzArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART, null, msgs);
			msgs = basicSetNetzArt(newNetzArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART, newNetzArt, newNetzArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Art_TypeClass getTechnikArt() {
		return technikArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnikArt(Technik_Art_TypeClass newTechnikArt, NotificationChain msgs) {
		Technik_Art_TypeClass oldTechnikArt = technikArt;
		technikArt = newTechnikArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART, oldTechnikArt, newTechnikArt);
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
	public void setTechnikArt(Technik_Art_TypeClass newTechnikArt) {
		if (newTechnikArt != technikArt) {
			NotificationChain msgs = null;
			if (technikArt != null)
				msgs = ((InternalEObject)technikArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART, null, msgs);
			if (newTechnikArt != null)
				msgs = ((InternalEObject)newTechnikArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART, null, msgs);
			msgs = basicSetTechnikArt(newTechnikArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART, newTechnikArt, newTechnikArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Beschreibung_TypeClass getTechnikBeschreibung() {
		return technikBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnikBeschreibung(Technik_Beschreibung_TypeClass newTechnikBeschreibung, NotificationChain msgs) {
		Technik_Beschreibung_TypeClass oldTechnikBeschreibung = technikBeschreibung;
		technikBeschreibung = newTechnikBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG, oldTechnikBeschreibung, newTechnikBeschreibung);
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
	public void setTechnikBeschreibung(Technik_Beschreibung_TypeClass newTechnikBeschreibung) {
		if (newTechnikBeschreibung != technikBeschreibung) {
			NotificationChain msgs = null;
			if (technikBeschreibung != null)
				msgs = ((InternalEObject)technikBeschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG, null, msgs);
			if (newTechnikBeschreibung != null)
				msgs = ((InternalEObject)newTechnikBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG, null, msgs);
			msgs = basicSetTechnikBeschreibung(newTechnikBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG, newTechnikBeschreibung, newTechnikBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE:
				return basicSetBandbreite(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART:
				return basicSetMediumArt(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART:
				return basicSetNetzArt(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART:
				return basicSetTechnikArt(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG:
				return basicSetTechnikBeschreibung(null, msgs);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE:
				return getBandbreite();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART:
				return getMediumArt();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART:
				return getNetzArt();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART:
				return getTechnikArt();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG:
				return getTechnikBeschreibung();
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE:
				setBandbreite((Bandbreite_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART:
				setMediumArt((Medium_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART:
				setNetzArt((Netz_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART:
				setTechnikArt((Technik_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG:
				setTechnikBeschreibung((Technik_Beschreibung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE:
				setBandbreite((Bandbreite_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART:
				setMediumArt((Medium_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART:
				setNetzArt((Netz_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART:
				setTechnikArt((Technik_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG:
				setTechnikBeschreibung((Technik_Beschreibung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE:
				return bandbreite != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART:
				return mediumArt != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART:
				return netzArt != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART:
				return technikArt != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG:
				return technikBeschreibung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Uebertragungsweg_Technik_AttributeGroupImpl
