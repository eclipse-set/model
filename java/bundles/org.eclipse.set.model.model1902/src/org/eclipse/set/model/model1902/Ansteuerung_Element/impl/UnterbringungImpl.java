/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Standort_Beschreibung_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterbringung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.UnterbringungImpl#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.UnterbringungImpl#getUnterbringungAllg <em>Unterbringung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.UnterbringungImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.UnterbringungImpl#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.UnterbringungImpl#getStandortBeschreibung <em>Standort Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterbringungImpl extends Basis_ObjektImpl implements Unterbringung {
	/**
	 * The cached value of the '{@link #getPunktObjektStrecke() <em>Punkt Objekt Strecke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunktObjektStrecke()
	 * @generated
	 * @ordered
	 */
	protected EList<Punkt_Objekt_Strecke_AttributeGroup> punktObjektStrecke;

	/**
	 * The cached value of the '{@link #getUnterbringungAllg() <em>Unterbringung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterbringungAllg()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung_Allg_AttributeGroup unterbringungAllg;

	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Punkt_TypeClass iDGEOPunkt;

	/**
	 * The cached value of the '{@link #getPunktObjektTOPKante() <em>Punkt Objekt TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunktObjektTOPKante()
	 * @generated
	 * @ordered
	 */
	protected Punkt_Objekt_TOP_Kante_AttributeGroup punktObjektTOPKante;

	/**
	 * The cached value of the '{@link #getStandortBeschreibung() <em>Standort Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandortBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected Standort_Beschreibung_TypeClass standortBeschreibung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterbringungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.UNTERBRINGUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Punkt_Objekt_Strecke_AttributeGroup> getPunktObjektStrecke() {
		if (punktObjektStrecke == null) {
			punktObjektStrecke = new EObjectContainmentEList<Punkt_Objekt_Strecke_AttributeGroup>(Punkt_Objekt_Strecke_AttributeGroup.class, this, Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE);
		}
		return punktObjektStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Allg_AttributeGroup getUnterbringungAllg() {
		return unterbringungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterbringungAllg(Unterbringung_Allg_AttributeGroup newUnterbringungAllg, NotificationChain msgs) {
		Unterbringung_Allg_AttributeGroup oldUnterbringungAllg = unterbringungAllg;
		unterbringungAllg = newUnterbringungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG, oldUnterbringungAllg, newUnterbringungAllg);
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
	public void setUnterbringungAllg(Unterbringung_Allg_AttributeGroup newUnterbringungAllg) {
		if (newUnterbringungAllg != unterbringungAllg) {
			NotificationChain msgs = null;
			if (unterbringungAllg != null)
				msgs = ((InternalEObject)unterbringungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG, null, msgs);
			if (newUnterbringungAllg != null)
				msgs = ((InternalEObject)newUnterbringungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG, null, msgs);
			msgs = basicSetUnterbringungAllg(newUnterbringungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG, newUnterbringungAllg, newUnterbringungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Punkt_TypeClass getIDGEOPunkt() {
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOPunkt(ID_GEO_Punkt_TypeClass newIDGEOPunkt, NotificationChain msgs) {
		ID_GEO_Punkt_TypeClass oldIDGEOPunkt = iDGEOPunkt;
		iDGEOPunkt = newIDGEOPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT, oldIDGEOPunkt, newIDGEOPunkt);
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
	public void setIDGEOPunkt(ID_GEO_Punkt_TypeClass newIDGEOPunkt) {
		if (newIDGEOPunkt != iDGEOPunkt) {
			NotificationChain msgs = null;
			if (iDGEOPunkt != null)
				msgs = ((InternalEObject)iDGEOPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT, null, msgs);
			if (newIDGEOPunkt != null)
				msgs = ((InternalEObject)newIDGEOPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT, null, msgs);
			msgs = basicSetIDGEOPunkt(newIDGEOPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT, newIDGEOPunkt, newIDGEOPunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Punkt_Objekt_TOP_Kante_AttributeGroup getPunktObjektTOPKante() {
		return punktObjektTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup newPunktObjektTOPKante, NotificationChain msgs) {
		Punkt_Objekt_TOP_Kante_AttributeGroup oldPunktObjektTOPKante = punktObjektTOPKante;
		punktObjektTOPKante = newPunktObjektTOPKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE, oldPunktObjektTOPKante, newPunktObjektTOPKante);
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
	public void setPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup newPunktObjektTOPKante) {
		if (newPunktObjektTOPKante != punktObjektTOPKante) {
			NotificationChain msgs = null;
			if (punktObjektTOPKante != null)
				msgs = ((InternalEObject)punktObjektTOPKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE, null, msgs);
			if (newPunktObjektTOPKante != null)
				msgs = ((InternalEObject)newPunktObjektTOPKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE, null, msgs);
			msgs = basicSetPunktObjektTOPKante(newPunktObjektTOPKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE, newPunktObjektTOPKante, newPunktObjektTOPKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standort_Beschreibung_TypeClass getStandortBeschreibung() {
		return standortBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandortBeschreibung(Standort_Beschreibung_TypeClass newStandortBeschreibung, NotificationChain msgs) {
		Standort_Beschreibung_TypeClass oldStandortBeschreibung = standortBeschreibung;
		standortBeschreibung = newStandortBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG, oldStandortBeschreibung, newStandortBeschreibung);
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
	public void setStandortBeschreibung(Standort_Beschreibung_TypeClass newStandortBeschreibung) {
		if (newStandortBeschreibung != standortBeschreibung) {
			NotificationChain msgs = null;
			if (standortBeschreibung != null)
				msgs = ((InternalEObject)standortBeschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG, null, msgs);
			if (newStandortBeschreibung != null)
				msgs = ((InternalEObject)newStandortBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG, null, msgs);
			msgs = basicSetStandortBeschreibung(newStandortBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG, newStandortBeschreibung, newStandortBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
				return ((InternalEList<?>)getPunktObjektStrecke()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
				return basicSetUnterbringungAllg(null, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
				return basicSetIDGEOPunkt(null, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
				return basicSetPunktObjektTOPKante(null, msgs);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
				return basicSetStandortBeschreibung(null, msgs);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
				return getPunktObjektStrecke();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
				return getUnterbringungAllg();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
				return getIDGEOPunkt();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
				return getPunktObjektTOPKante();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
				return getStandortBeschreibung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
				getPunktObjektStrecke().clear();
				getPunktObjektStrecke().addAll((Collection<? extends Punkt_Objekt_Strecke_AttributeGroup>)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
				setUnterbringungAllg((Unterbringung_Allg_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
				setPunktObjektTOPKante((Punkt_Objekt_TOP_Kante_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
				setStandortBeschreibung((Standort_Beschreibung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
				getPunktObjektStrecke().clear();
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
				setUnterbringungAllg((Unterbringung_Allg_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
				setPunktObjektTOPKante((Punkt_Objekt_TOP_Kante_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
				setStandortBeschreibung((Standort_Beschreibung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE:
				return punktObjektStrecke != null && !punktObjektStrecke.isEmpty();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__UNTERBRINGUNG_ALLG:
				return unterbringungAllg != null;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__IDGEO_PUNKT:
				return iDGEOPunkt != null;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE:
				return punktObjektTOPKante != null;
			case Ansteuerung_ElementPackage.UNTERBRINGUNG__STANDORT_BESCHREIBUNG:
				return standortBeschreibung != null;
		}
		return super.eIsSet(featureID);
	}

} //UnterbringungImpl
