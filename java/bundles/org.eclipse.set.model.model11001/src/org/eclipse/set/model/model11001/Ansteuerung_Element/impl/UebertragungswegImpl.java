/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Uebertragungsweg;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Uebertragungsweg_Art_TypeClass;
import org.eclipse.set.model.model11001.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Uebertragungsweg_Nach_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Uebertragungsweg_Von_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uebertragungsweg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getIDAnhangUeWegNach <em>ID Anhang Ue Weg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getIDAnhangUeWegVon <em>ID Anhang Ue Weg Von</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getIDUebertragungswegNach <em>ID Uebertragungsweg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getIDUebertragungswegVon <em>ID Uebertragungsweg Von</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getUebertragungswegArt <em>Uebertragungsweg Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.impl.UebertragungswegImpl#getUebertragungswegTechnik <em>Uebertragungsweg Technik</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UebertragungswegImpl extends Basis_ObjektImpl implements Uebertragungsweg {
	/**
	 * The cached value of the '{@link #getIDAnhangUeWegNach() <em>ID Anhang Ue Weg Nach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangUeWegNach()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Anhang_TypeClass> iDAnhangUeWegNach;

	/**
	 * The cached value of the '{@link #getIDAnhangUeWegVon() <em>ID Anhang Ue Weg Von</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangUeWegVon()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Anhang_TypeClass> iDAnhangUeWegVon;

	/**
	 * The cached value of the '{@link #getIDUebertragungswegNach() <em>ID Uebertragungsweg Nach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUebertragungswegNach()
	 * @generated
	 * @ordered
	 */
	protected ID_Uebertragungsweg_Nach_TypeClass iDUebertragungswegNach;

	/**
	 * The cached value of the '{@link #getIDUebertragungswegVon() <em>ID Uebertragungsweg Von</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUebertragungswegVon()
	 * @generated
	 * @ordered
	 */
	protected ID_Uebertragungsweg_Von_TypeClass iDUebertragungswegVon;

	/**
	 * The cached value of the '{@link #getUebertragungswegArt() <em>Uebertragungsweg Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungswegArt()
	 * @generated
	 * @ordered
	 */
	protected Uebertragungsweg_Art_TypeClass uebertragungswegArt;

	/**
	 * The cached value of the '{@link #getUebertragungswegTechnik() <em>Uebertragungsweg Technik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungswegTechnik()
	 * @generated
	 * @ordered
	 */
	protected Uebertragungsweg_Technik_AttributeGroup uebertragungswegTechnik;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UebertragungswegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Anhang_TypeClass> getIDAnhangUeWegNach() {
		if (iDAnhangUeWegNach == null) {
			iDAnhangUeWegNach = new EObjectContainmentEList<ID_Anhang_TypeClass>(ID_Anhang_TypeClass.class, this, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH);
		}
		return iDAnhangUeWegNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Anhang_TypeClass> getIDAnhangUeWegVon() {
		if (iDAnhangUeWegVon == null) {
			iDAnhangUeWegVon = new EObjectContainmentEList<ID_Anhang_TypeClass>(ID_Anhang_TypeClass.class, this, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON);
		}
		return iDAnhangUeWegVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Uebertragungsweg_Nach_TypeClass getIDUebertragungswegNach() {
		return iDUebertragungswegNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUebertragungswegNach(ID_Uebertragungsweg_Nach_TypeClass newIDUebertragungswegNach, NotificationChain msgs) {
		ID_Uebertragungsweg_Nach_TypeClass oldIDUebertragungswegNach = iDUebertragungswegNach;
		iDUebertragungswegNach = newIDUebertragungswegNach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, oldIDUebertragungswegNach, newIDUebertragungswegNach);
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
	public void setIDUebertragungswegNach(ID_Uebertragungsweg_Nach_TypeClass newIDUebertragungswegNach) {
		if (newIDUebertragungswegNach != iDUebertragungswegNach) {
			NotificationChain msgs = null;
			if (iDUebertragungswegNach != null)
				msgs = ((InternalEObject)iDUebertragungswegNach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, null, msgs);
			if (newIDUebertragungswegNach != null)
				msgs = ((InternalEObject)newIDUebertragungswegNach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, null, msgs);
			msgs = basicSetIDUebertragungswegNach(newIDUebertragungswegNach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, newIDUebertragungswegNach, newIDUebertragungswegNach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Uebertragungsweg_Von_TypeClass getIDUebertragungswegVon() {
		return iDUebertragungswegVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUebertragungswegVon(ID_Uebertragungsweg_Von_TypeClass newIDUebertragungswegVon, NotificationChain msgs) {
		ID_Uebertragungsweg_Von_TypeClass oldIDUebertragungswegVon = iDUebertragungswegVon;
		iDUebertragungswegVon = newIDUebertragungswegVon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, oldIDUebertragungswegVon, newIDUebertragungswegVon);
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
	public void setIDUebertragungswegVon(ID_Uebertragungsweg_Von_TypeClass newIDUebertragungswegVon) {
		if (newIDUebertragungswegVon != iDUebertragungswegVon) {
			NotificationChain msgs = null;
			if (iDUebertragungswegVon != null)
				msgs = ((InternalEObject)iDUebertragungswegVon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, null, msgs);
			if (newIDUebertragungswegVon != null)
				msgs = ((InternalEObject)newIDUebertragungswegVon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, null, msgs);
			msgs = basicSetIDUebertragungswegVon(newIDUebertragungswegVon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, newIDUebertragungswegVon, newIDUebertragungswegVon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Art_TypeClass getUebertragungswegArt() {
		return uebertragungswegArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungswegArt(Uebertragungsweg_Art_TypeClass newUebertragungswegArt, NotificationChain msgs) {
		Uebertragungsweg_Art_TypeClass oldUebertragungswegArt = uebertragungswegArt;
		uebertragungswegArt = newUebertragungswegArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, oldUebertragungswegArt, newUebertragungswegArt);
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
	public void setUebertragungswegArt(Uebertragungsweg_Art_TypeClass newUebertragungswegArt) {
		if (newUebertragungswegArt != uebertragungswegArt) {
			NotificationChain msgs = null;
			if (uebertragungswegArt != null)
				msgs = ((InternalEObject)uebertragungswegArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, null, msgs);
			if (newUebertragungswegArt != null)
				msgs = ((InternalEObject)newUebertragungswegArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, null, msgs);
			msgs = basicSetUebertragungswegArt(newUebertragungswegArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, newUebertragungswegArt, newUebertragungswegArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Technik_AttributeGroup getUebertragungswegTechnik() {
		return uebertragungswegTechnik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup newUebertragungswegTechnik, NotificationChain msgs) {
		Uebertragungsweg_Technik_AttributeGroup oldUebertragungswegTechnik = uebertragungswegTechnik;
		uebertragungswegTechnik = newUebertragungswegTechnik;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, oldUebertragungswegTechnik, newUebertragungswegTechnik);
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
	public void setUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup newUebertragungswegTechnik) {
		if (newUebertragungswegTechnik != uebertragungswegTechnik) {
			NotificationChain msgs = null;
			if (uebertragungswegTechnik != null)
				msgs = ((InternalEObject)uebertragungswegTechnik).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, null, msgs);
			if (newUebertragungswegTechnik != null)
				msgs = ((InternalEObject)newUebertragungswegTechnik).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, null, msgs);
			msgs = basicSetUebertragungswegTechnik(newUebertragungswegTechnik, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, newUebertragungswegTechnik, newUebertragungswegTechnik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				return ((InternalEList<?>)getIDAnhangUeWegNach()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				return ((InternalEList<?>)getIDAnhangUeWegVon()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				return basicSetIDUebertragungswegNach(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				return basicSetIDUebertragungswegVon(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return basicSetUebertragungswegArt(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return basicSetUebertragungswegTechnik(null, msgs);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				return getIDAnhangUeWegNach();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				return getIDAnhangUeWegVon();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				return getIDUebertragungswegNach();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				return getIDUebertragungswegVon();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return getUebertragungswegArt();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return getUebertragungswegTechnik();
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				getIDAnhangUeWegNach().clear();
				getIDAnhangUeWegNach().addAll((Collection<? extends ID_Anhang_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				getIDAnhangUeWegVon().clear();
				getIDAnhangUeWegVon().addAll((Collection<? extends ID_Anhang_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				setIDUebertragungswegNach((ID_Uebertragungsweg_Nach_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				setIDUebertragungswegVon((ID_Uebertragungsweg_Von_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				setUebertragungswegArt((Uebertragungsweg_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				setUebertragungswegTechnik((Uebertragungsweg_Technik_AttributeGroup)newValue);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				getIDAnhangUeWegNach().clear();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				getIDAnhangUeWegVon().clear();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				setIDUebertragungswegNach((ID_Uebertragungsweg_Nach_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				setIDUebertragungswegVon((ID_Uebertragungsweg_Von_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				setUebertragungswegArt((Uebertragungsweg_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				setUebertragungswegTechnik((Uebertragungsweg_Technik_AttributeGroup)null);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				return iDAnhangUeWegNach != null && !iDAnhangUeWegNach.isEmpty();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				return iDAnhangUeWegVon != null && !iDAnhangUeWegVon.isEmpty();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				return iDUebertragungswegNach != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				return iDUebertragungswegVon != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return uebertragungswegArt != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return uebertragungswegTechnik != null;
		}
		return super.eIsSet(featureID);
	}

} //UebertragungswegImpl
