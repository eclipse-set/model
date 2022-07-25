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

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;
import org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;
import org.eclipse.set.model.model1902.PZB.Wirksamkeit_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_ZuordnungImpl#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_ZuordnungImpl#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_ZuordnungImpl#getWirksamkeit <em>Wirksamkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_ZuordnungImpl extends Basis_ObjektImpl implements PZB_Element_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * The cached value of the '{@link #getIDPZBElementBezugspunkt() <em>IDPZB Element Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_Bezugspunkt_TypeClass iDPZBElementBezugspunkt;

	/**
	 * The cached value of the '{@link #getPZBElementZuordnungINA() <em>PZB Element Zuordnung INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnungINA()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroup pZBElementZuordnungINA;

	/**
	 * The cached value of the '{@link #getWirksamkeit() <em>Wirksamkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksamkeit()
	 * @generated
	 * @ordered
	 */
	protected Wirksamkeit_TypeClass wirksamkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Bezugspunkt_TypeClass getIDPZBElementBezugspunkt() {
		return iDPZBElementBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass newIDPZBElementBezugspunkt, NotificationChain msgs) {
		ID_PZB_Element_Bezugspunkt_TypeClass oldIDPZBElementBezugspunkt = iDPZBElementBezugspunkt;
		iDPZBElementBezugspunkt = newIDPZBElementBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, oldIDPZBElementBezugspunkt, newIDPZBElementBezugspunkt);
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
	public void setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass newIDPZBElementBezugspunkt) {
		if (newIDPZBElementBezugspunkt != iDPZBElementBezugspunkt) {
			NotificationChain msgs = null;
			if (iDPZBElementBezugspunkt != null)
				msgs = ((InternalEObject)iDPZBElementBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, null, msgs);
			if (newIDPZBElementBezugspunkt != null)
				msgs = ((InternalEObject)newIDPZBElementBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, null, msgs);
			msgs = basicSetIDPZBElementBezugspunkt(newIDPZBElementBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, newIDPZBElementBezugspunkt, newIDPZBElementBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_INA_AttributeGroup getPZBElementZuordnungINA() {
		return pZBElementZuordnungINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA, NotificationChain msgs) {
		PZB_Element_Zuordnung_INA_AttributeGroup oldPZBElementZuordnungINA = pZBElementZuordnungINA;
		pZBElementZuordnungINA = newPZBElementZuordnungINA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, oldPZBElementZuordnungINA, newPZBElementZuordnungINA);
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
	public void setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA) {
		if (newPZBElementZuordnungINA != pZBElementZuordnungINA) {
			NotificationChain msgs = null;
			if (pZBElementZuordnungINA != null)
				msgs = ((InternalEObject)pZBElementZuordnungINA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			if (newPZBElementZuordnungINA != null)
				msgs = ((InternalEObject)newPZBElementZuordnungINA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			msgs = basicSetPZBElementZuordnungINA(newPZBElementZuordnungINA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, newPZBElementZuordnungINA, newPZBElementZuordnungINA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_TypeClass getWirksamkeit() {
		return wirksamkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit, NotificationChain msgs) {
		Wirksamkeit_TypeClass oldWirksamkeit = wirksamkeit;
		wirksamkeit = newWirksamkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, oldWirksamkeit, newWirksamkeit);
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
	public void setWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit) {
		if (newWirksamkeit != wirksamkeit) {
			NotificationChain msgs = null;
			if (wirksamkeit != null)
				msgs = ((InternalEObject)wirksamkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, null, msgs);
			if (newWirksamkeit != null)
				msgs = ((InternalEObject)newWirksamkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, null, msgs);
			msgs = basicSetWirksamkeit(newWirksamkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, newWirksamkeit, newWirksamkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				return basicSetIDPZBElementBezugspunkt(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return basicSetPZBElementZuordnungINA(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return basicSetWirksamkeit(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				return getIDPZBElementBezugspunkt();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return getPZBElementZuordnungINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return getWirksamkeit();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				setIDPZBElementBezugspunkt((ID_PZB_Element_Bezugspunkt_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				setIDPZBElementBezugspunkt((ID_PZB_Element_Bezugspunkt_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				return iDPZBElementBezugspunkt != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return pZBElementZuordnungINA != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return wirksamkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_ZuordnungImpl
