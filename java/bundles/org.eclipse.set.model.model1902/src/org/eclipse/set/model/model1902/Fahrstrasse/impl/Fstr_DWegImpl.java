/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Fahrweg_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getFstrDWegAllg <em>Fstr DWeg Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getFstrDWegSpezifisch <em>Fstr DWeg Spezifisch</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getIDFMAAnlageFreimeldung <em>IDFMA Anlage Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWegImpl#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWegImpl extends Basis_ObjektImpl implements Fstr_DWeg {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getFstrDWegAllg() <em>Fstr DWeg Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegAllg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Allg_AttributeGroup fstrDWegAllg;

	/**
	 * The cached value of the '{@link #getFstrDWegSpezifisch() <em>Fstr DWeg Spezifisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegSpezifisch()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Spezifisch_AttributeGroup fstrDWegSpezifisch;

	/**
	 * The cached value of the '{@link #getIDFMAAnlageFreimeldung() <em>IDFMA Anlage Freimeldung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlageFreimeldung()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_FMA_Anlage_TypeClass> iDFMAAnlageFreimeldung;

	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Fahrweg_TypeClass iDFstrFahrweg;

	/**
	 * The cached value of the '{@link #getIDPZBGefahrpunkt() <em>IDPZB Gefahrpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBGefahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDPZBGefahrpunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Fstr_DWeg_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Allg_AttributeGroup getFstrDWegAllg() {
		return fstrDWegAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup newFstrDWegAllg, NotificationChain msgs) {
		Fstr_DWeg_Allg_AttributeGroup oldFstrDWegAllg = fstrDWegAllg;
		fstrDWegAllg = newFstrDWegAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, oldFstrDWegAllg, newFstrDWegAllg);
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
	public void setFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup newFstrDWegAllg) {
		if (newFstrDWegAllg != fstrDWegAllg) {
			NotificationChain msgs = null;
			if (fstrDWegAllg != null)
				msgs = ((InternalEObject)fstrDWegAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, null, msgs);
			if (newFstrDWegAllg != null)
				msgs = ((InternalEObject)newFstrDWegAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, null, msgs);
			msgs = basicSetFstrDWegAllg(newFstrDWegAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, newFstrDWegAllg, newFstrDWegAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Spezifisch_AttributeGroup getFstrDWegSpezifisch() {
		return fstrDWegSpezifisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup newFstrDWegSpezifisch, NotificationChain msgs) {
		Fstr_DWeg_Spezifisch_AttributeGroup oldFstrDWegSpezifisch = fstrDWegSpezifisch;
		fstrDWegSpezifisch = newFstrDWegSpezifisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, oldFstrDWegSpezifisch, newFstrDWegSpezifisch);
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
	public void setFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup newFstrDWegSpezifisch) {
		if (newFstrDWegSpezifisch != fstrDWegSpezifisch) {
			NotificationChain msgs = null;
			if (fstrDWegSpezifisch != null)
				msgs = ((InternalEObject)fstrDWegSpezifisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, null, msgs);
			if (newFstrDWegSpezifisch != null)
				msgs = ((InternalEObject)newFstrDWegSpezifisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, null, msgs);
			msgs = basicSetFstrDWegSpezifisch(newFstrDWegSpezifisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, newFstrDWegSpezifisch, newFstrDWegSpezifisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_FMA_Anlage_TypeClass> getIDFMAAnlageFreimeldung() {
		if (iDFMAAnlageFreimeldung == null) {
			iDFMAAnlageFreimeldung = new EObjectContainmentEList<ID_FMA_Anlage_TypeClass>(ID_FMA_Anlage_TypeClass.class, this, FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG);
		}
		return iDFMAAnlageFreimeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Fahrweg_TypeClass getIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass newIDFstrFahrweg, NotificationChain msgs) {
		ID_Fstr_Fahrweg_TypeClass oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, newIDFstrFahrweg);
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
	public void setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass newIDFstrFahrweg) {
		if (newIDFstrFahrweg != iDFstrFahrweg) {
			NotificationChain msgs = null;
			if (iDFstrFahrweg != null)
				msgs = ((InternalEObject)iDFstrFahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, null, msgs);
			if (newIDFstrFahrweg != null)
				msgs = ((InternalEObject)newIDFstrFahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, null, msgs);
			msgs = basicSetIDFstrFahrweg(newIDFstrFahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, newIDFstrFahrweg, newIDFstrFahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDPZBGefahrpunkt() {
		return iDPZBGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBGefahrpunkt(ID_Markanter_Punkt_TypeClass newIDPZBGefahrpunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDPZBGefahrpunkt = iDPZBGefahrpunkt;
		iDPZBGefahrpunkt = newIDPZBGefahrpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, oldIDPZBGefahrpunkt, newIDPZBGefahrpunkt);
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
	public void setIDPZBGefahrpunkt(ID_Markanter_Punkt_TypeClass newIDPZBGefahrpunkt) {
		if (newIDPZBGefahrpunkt != iDPZBGefahrpunkt) {
			NotificationChain msgs = null;
			if (iDPZBGefahrpunkt != null)
				msgs = ((InternalEObject)iDPZBGefahrpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, null, msgs);
			if (newIDPZBGefahrpunkt != null)
				msgs = ((InternalEObject)newIDPZBGefahrpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, null, msgs);
			msgs = basicSetIDPZBGefahrpunkt(newIDPZBGefahrpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, newIDPZBGefahrpunkt, newIDPZBGefahrpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return basicSetFstrDWegAllg(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return basicSetFstrDWegSpezifisch(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				return ((InternalEList<?>)getIDFMAAnlageFreimeldung()).basicRemove(otherEnd, msgs);
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				return basicSetIDFstrFahrweg(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				return basicSetIDPZBGefahrpunkt(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return getBezeichnung();
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return getFstrDWegAllg();
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return getFstrDWegSpezifisch();
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				return getIDFMAAnlageFreimeldung();
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				return getIDFstrFahrweg();
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				return getIDPZBGefahrpunkt();
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				setBezeichnung((Fstr_DWeg_Bezeichnung_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				setFstrDWegAllg((Fstr_DWeg_Allg_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				setFstrDWegSpezifisch((Fstr_DWeg_Spezifisch_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				getIDFMAAnlageFreimeldung().clear();
				getIDFMAAnlageFreimeldung().addAll((Collection<? extends ID_FMA_Anlage_TypeClass>)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				setIDPZBGefahrpunkt((ID_Markanter_Punkt_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				setBezeichnung((Fstr_DWeg_Bezeichnung_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				setFstrDWegAllg((Fstr_DWeg_Allg_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				setFstrDWegSpezifisch((Fstr_DWeg_Spezifisch_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				getIDFMAAnlageFreimeldung().clear();
				return;
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				setIDPZBGefahrpunkt((ID_Markanter_Punkt_TypeClass)null);
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return bezeichnung != null;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return fstrDWegAllg != null;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return fstrDWegSpezifisch != null;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				return iDFMAAnlageFreimeldung != null && !iDFMAAnlageFreimeldung.isEmpty();
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				return iDFstrFahrweg != null;
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				return iDPZBGefahrpunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_DWegImpl
