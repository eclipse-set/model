/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;
import org.eclipse.set.model.model1902.PZB.PZB_Art_TypeClass;
import org.eclipse.set.model.model1902.PZB.PZB_Element;
import org.eclipse.set.model.model1902.PZB.PZB_Element_GM_AttributeGroup;
import org.eclipse.set.model.model1902.PZB.PZB_Element_GUE_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Zuordnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getPZBArt <em>PZB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getPZBElementGM <em>PZB Element GM</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_ElementImpl#getPZBElementGUE <em>PZB Element GUE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_ElementImpl extends Punkt_ObjektImpl implements PZB_Element {
	/**
	 * The cached value of the '{@link #getIDPZBElementZuordnung() <em>IDPZB Element Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_Zuordnung_TypeClass iDPZBElementZuordnung;

	/**
	 * The cached value of the '{@link #getPZBArt() <em>PZB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBArt()
	 * @generated
	 * @ordered
	 */
	protected PZB_Art_TypeClass pZBArt;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected ID_Stellelement_TypeClass iDStellelement;

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
	 * The cached value of the '{@link #getPZBElementGM() <em>PZB Element GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementGM()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_GM_AttributeGroup pZBElementGM;

	/**
	 * The cached value of the '{@link #getPZBElementGUE() <em>PZB Element GUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementGUE()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_GUE_AttributeGroup pZBElementGUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Zuordnung_TypeClass getIDPZBElementZuordnung() {
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass newIDPZBElementZuordnung, NotificationChain msgs) {
		ID_PZB_Element_Zuordnung_TypeClass oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		iDPZBElementZuordnung = newIDPZBElementZuordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, newIDPZBElementZuordnung);
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
	public void setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass newIDPZBElementZuordnung) {
		if (newIDPZBElementZuordnung != iDPZBElementZuordnung) {
			NotificationChain msgs = null;
			if (iDPZBElementZuordnung != null)
				msgs = ((InternalEObject)iDPZBElementZuordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, null, msgs);
			if (newIDPZBElementZuordnung != null)
				msgs = ((InternalEObject)newIDPZBElementZuordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, null, msgs);
			msgs = basicSetIDPZBElementZuordnung(newIDPZBElementZuordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, newIDPZBElementZuordnung, newIDPZBElementZuordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Art_TypeClass getPZBArt() {
		return pZBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBArt(PZB_Art_TypeClass newPZBArt, NotificationChain msgs) {
		PZB_Art_TypeClass oldPZBArt = pZBArt;
		pZBArt = newPZBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ART, oldPZBArt, newPZBArt);
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
	public void setPZBArt(PZB_Art_TypeClass newPZBArt) {
		if (newPZBArt != pZBArt) {
			NotificationChain msgs = null;
			if (pZBArt != null)
				msgs = ((InternalEObject)pZBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ART, null, msgs);
			if (newPZBArt != null)
				msgs = ((InternalEObject)newPZBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ART, null, msgs);
			msgs = basicSetPZBArt(newPZBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ART, newPZBArt, newPZBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellelement_TypeClass getIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStellelement(ID_Stellelement_TypeClass newIDStellelement, NotificationChain msgs) {
		ID_Stellelement_TypeClass oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, oldIDStellelement, newIDStellelement);
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
	public void setIDStellelement(ID_Stellelement_TypeClass newIDStellelement) {
		if (newIDStellelement != iDStellelement) {
			NotificationChain msgs = null;
			if (iDStellelement != null)
				msgs = ((InternalEObject)iDStellelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, null, msgs);
			if (newIDStellelement != null)
				msgs = ((InternalEObject)newIDStellelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, null, msgs);
			msgs = basicSetIDStellelement(newIDStellelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, newIDStellelement, newIDStellelement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_GM_AttributeGroup getPZBElementGM() {
		return pZBElementGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementGM(PZB_Element_GM_AttributeGroup newPZBElementGM, NotificationChain msgs) {
		PZB_Element_GM_AttributeGroup oldPZBElementGM = pZBElementGM;
		pZBElementGM = newPZBElementGM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, oldPZBElementGM, newPZBElementGM);
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
	public void setPZBElementGM(PZB_Element_GM_AttributeGroup newPZBElementGM) {
		if (newPZBElementGM != pZBElementGM) {
			NotificationChain msgs = null;
			if (pZBElementGM != null)
				msgs = ((InternalEObject)pZBElementGM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, null, msgs);
			if (newPZBElementGM != null)
				msgs = ((InternalEObject)newPZBElementGM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, null, msgs);
			msgs = basicSetPZBElementGM(newPZBElementGM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, newPZBElementGM, newPZBElementGM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_GUE_AttributeGroup getPZBElementGUE() {
		return pZBElementGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementGUE(PZB_Element_GUE_AttributeGroup newPZBElementGUE, NotificationChain msgs) {
		PZB_Element_GUE_AttributeGroup oldPZBElementGUE = pZBElementGUE;
		pZBElementGUE = newPZBElementGUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, oldPZBElementGUE, newPZBElementGUE);
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
	public void setPZBElementGUE(PZB_Element_GUE_AttributeGroup newPZBElementGUE) {
		if (newPZBElementGUE != pZBElementGUE) {
			NotificationChain msgs = null;
			if (pZBElementGUE != null)
				msgs = ((InternalEObject)pZBElementGUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, null, msgs);
			if (newPZBElementGUE != null)
				msgs = ((InternalEObject)newPZBElementGUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, null, msgs);
			msgs = basicSetPZBElementGUE(newPZBElementGUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, newPZBElementGUE, newPZBElementGUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				return basicSetIDPZBElementZuordnung(null, msgs);
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return basicSetPZBArt(null, msgs);
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				return basicSetIDStellelement(null, msgs);
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return basicSetPZBElementGM(null, msgs);
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return basicSetPZBElementGUE(null, msgs);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				return getIDPZBElementZuordnung();
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return getPZBArt();
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				return getIDStellelement();
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return getPZBElementGM();
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return getPZBElementGUE();
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((ID_PZB_Element_Zuordnung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				setPZBArt((PZB_Art_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				setPZBElementGM((PZB_Element_GM_AttributeGroup)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				setPZBElementGUE((PZB_Element_GUE_AttributeGroup)newValue);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((ID_PZB_Element_Zuordnung_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				setPZBArt((PZB_Art_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((ID_Stellelement_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				setPZBElementGM((PZB_Element_GM_AttributeGroup)null);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				setPZBElementGUE((PZB_Element_GUE_AttributeGroup)null);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				return iDPZBElementZuordnung != null;
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return pZBArt != null;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				return iDStellelement != null;
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return pZBElementGM != null;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return pZBElementGUE != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_ElementImpl
