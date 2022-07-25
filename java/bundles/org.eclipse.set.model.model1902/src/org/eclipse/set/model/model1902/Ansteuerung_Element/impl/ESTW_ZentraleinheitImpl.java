/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Bedien_Bezirk_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_Technik_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW Zentraleinheit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_ZentraleinheitImpl extends Basis_ObjektImpl implements ESTW_Zentraleinheit {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getESTWZentraleinheitAllg() <em>ESTW Zentraleinheit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTWZentraleinheitAllg()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit_Allg_AttributeGroup eSTWZentraleinheitAllg;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitNamensgebend() <em>ID Oertlichkeit Namensgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeitNamensgebend;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_Technik_TypeClass iDUnterbringung;

	/**
	 * The cached value of the '{@link #getIDBedienBezirkVirtuell() <em>ID Bedien Bezirk Virtuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirkVirtuell()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirkVirtuell;

	/**
	 * The cached value of the '{@link #getIDBedienBezirkZentral() <em>ID Bedien Bezirk Zentral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirkZentral()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirkZentral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_ZentraleinheitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ESTW_Zentraleinheit_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Allg_AttributeGroup getESTWZentraleinheitAllg() {
		return eSTWZentraleinheitAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup newESTWZentraleinheitAllg, NotificationChain msgs) {
		ESTW_Zentraleinheit_Allg_AttributeGroup oldESTWZentraleinheitAllg = eSTWZentraleinheitAllg;
		eSTWZentraleinheitAllg = newESTWZentraleinheitAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, oldESTWZentraleinheitAllg, newESTWZentraleinheitAllg);
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
	public void setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup newESTWZentraleinheitAllg) {
		if (newESTWZentraleinheitAllg != eSTWZentraleinheitAllg) {
			NotificationChain msgs = null;
			if (eSTWZentraleinheitAllg != null)
				msgs = ((InternalEObject)eSTWZentraleinheitAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, null, msgs);
			if (newESTWZentraleinheitAllg != null)
				msgs = ((InternalEObject)newESTWZentraleinheitAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, null, msgs);
			msgs = basicSetESTWZentraleinheitAllg(newESTWZentraleinheitAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, newESTWZentraleinheitAllg, newESTWZentraleinheitAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitNamensgebend, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		iDOertlichkeitNamensgebend = newIDOertlichkeitNamensgebend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, newIDOertlichkeitNamensgebend);
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
	public void setIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitNamensgebend) {
		if (newIDOertlichkeitNamensgebend != iDOertlichkeitNamensgebend) {
			NotificationChain msgs = null;
			if (iDOertlichkeitNamensgebend != null)
				msgs = ((InternalEObject)iDOertlichkeitNamensgebend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, null, msgs);
			if (newIDOertlichkeitNamensgebend != null)
				msgs = ((InternalEObject)newIDOertlichkeitNamensgebend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, null, msgs);
			msgs = basicSetIDOertlichkeitNamensgebend(newIDOertlichkeitNamensgebend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, newIDOertlichkeitNamensgebend, newIDOertlichkeitNamensgebend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_Technik_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_Technik_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_Technik_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_Technik_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirkVirtuell() {
		return iDBedienBezirkVirtuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirkVirtuell(ID_Bedien_Bezirk_TypeClass newIDBedienBezirkVirtuell, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirkVirtuell = iDBedienBezirkVirtuell;
		iDBedienBezirkVirtuell = newIDBedienBezirkVirtuell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, oldIDBedienBezirkVirtuell, newIDBedienBezirkVirtuell);
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
	public void setIDBedienBezirkVirtuell(ID_Bedien_Bezirk_TypeClass newIDBedienBezirkVirtuell) {
		if (newIDBedienBezirkVirtuell != iDBedienBezirkVirtuell) {
			NotificationChain msgs = null;
			if (iDBedienBezirkVirtuell != null)
				msgs = ((InternalEObject)iDBedienBezirkVirtuell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, null, msgs);
			if (newIDBedienBezirkVirtuell != null)
				msgs = ((InternalEObject)newIDBedienBezirkVirtuell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, null, msgs);
			msgs = basicSetIDBedienBezirkVirtuell(newIDBedienBezirkVirtuell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, newIDBedienBezirkVirtuell, newIDBedienBezirkVirtuell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirkZentral() {
		return iDBedienBezirkZentral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirkZentral(ID_Bedien_Bezirk_TypeClass newIDBedienBezirkZentral, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirkZentral = iDBedienBezirkZentral;
		iDBedienBezirkZentral = newIDBedienBezirkZentral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, oldIDBedienBezirkZentral, newIDBedienBezirkZentral);
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
	public void setIDBedienBezirkZentral(ID_Bedien_Bezirk_TypeClass newIDBedienBezirkZentral) {
		if (newIDBedienBezirkZentral != iDBedienBezirkZentral) {
			NotificationChain msgs = null;
			if (iDBedienBezirkZentral != null)
				msgs = ((InternalEObject)iDBedienBezirkZentral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, null, msgs);
			if (newIDBedienBezirkZentral != null)
				msgs = ((InternalEObject)newIDBedienBezirkZentral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, null, msgs);
			msgs = basicSetIDBedienBezirkZentral(newIDBedienBezirkZentral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, newIDBedienBezirkZentral, newIDBedienBezirkZentral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return basicSetESTWZentraleinheitAllg(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				return basicSetIDOertlichkeitNamensgebend(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				return basicSetIDBedienBezirkVirtuell(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				return basicSetIDBedienBezirkZentral(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return getESTWZentraleinheitAllg();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				return getIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				return getIDBedienBezirkVirtuell();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				return getIDBedienBezirkZentral();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				setBezeichnung((ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				setESTWZentraleinheitAllg((ESTW_Zentraleinheit_Allg_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_Technik_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				setIDBedienBezirkVirtuell((ID_Bedien_Bezirk_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				setIDBedienBezirkZentral((ID_Bedien_Bezirk_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				setBezeichnung((ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				setESTWZentraleinheitAllg((ESTW_Zentraleinheit_Allg_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_Technik_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				setIDBedienBezirkVirtuell((ID_Bedien_Bezirk_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				setIDBedienBezirkZentral((ID_Bedien_Bezirk_TypeClass)null);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return eSTWZentraleinheitAllg != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				return iDOertlichkeitNamensgebend != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				return iDBedienBezirkVirtuell != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				return iDBedienBezirkZentral != null;
		}
		return super.eIsSet(featureID);
	}

} //ESTW_ZentraleinheitImpl
