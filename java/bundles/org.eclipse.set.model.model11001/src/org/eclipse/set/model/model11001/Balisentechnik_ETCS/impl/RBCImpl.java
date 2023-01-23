/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.RBC_Allg_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_ESTW_Zentraleinheit_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.RBCImpl#getETCSAdresse <em>ETCS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.RBCImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.RBCImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.RBCImpl#getRBCAllg <em>RBC Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBCImpl extends Basis_ObjektImpl implements RBC {
	/**
	 * The cached value of the '{@link #getETCSAdresse() <em>ETCS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSAdresse()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Adresse_AttributeGroup eTCSAdresse;

	/**
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_ESTW_Zentraleinheit_TypeClass> iDESTWZentraleinheit;

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
	 * The cached value of the '{@link #getRBCAllg() <em>RBC Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBCAllg()
	 * @generated
	 * @ordered
	 */
	protected RBC_Allg_AttributeGroup rBCAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getRBC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Adresse_AttributeGroup getETCSAdresse() {
		return eTCSAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSAdresse(ETCS_Adresse_AttributeGroup newETCSAdresse, NotificationChain msgs) {
		ETCS_Adresse_AttributeGroup oldETCSAdresse = eTCSAdresse;
		eTCSAdresse = newETCSAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE, oldETCSAdresse, newETCSAdresse);
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
	public void setETCSAdresse(ETCS_Adresse_AttributeGroup newETCSAdresse) {
		if (newETCSAdresse != eTCSAdresse) {
			NotificationChain msgs = null;
			if (eTCSAdresse != null)
				msgs = ((InternalEObject)eTCSAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE, null, msgs);
			if (newETCSAdresse != null)
				msgs = ((InternalEObject)newETCSAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE, null, msgs);
			msgs = basicSetETCSAdresse(newETCSAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE, newETCSAdresse, newETCSAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_ESTW_Zentraleinheit_TypeClass> getIDESTWZentraleinheit() {
		if (iDESTWZentraleinheit == null) {
			iDESTWZentraleinheit = new EObjectContainmentEList<ID_ESTW_Zentraleinheit_TypeClass>(ID_ESTW_Zentraleinheit_TypeClass.class, this, Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT);
		}
		return iDESTWZentraleinheit;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_Allg_AttributeGroup getRBCAllg() {
		return rBCAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRBCAllg(RBC_Allg_AttributeGroup newRBCAllg, NotificationChain msgs) {
		RBC_Allg_AttributeGroup oldRBCAllg = rBCAllg;
		rBCAllg = newRBCAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__RBC_ALLG, oldRBCAllg, newRBCAllg);
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
	public void setRBCAllg(RBC_Allg_AttributeGroup newRBCAllg) {
		if (newRBCAllg != rBCAllg) {
			NotificationChain msgs = null;
			if (rBCAllg != null)
				msgs = ((InternalEObject)rBCAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__RBC_ALLG, null, msgs);
			if (newRBCAllg != null)
				msgs = ((InternalEObject)newRBCAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC__RBC_ALLG, null, msgs);
			msgs = basicSetRBCAllg(newRBCAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC__RBC_ALLG, newRBCAllg, newRBCAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE:
				return basicSetETCSAdresse(null, msgs);
			case Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT:
				return ((InternalEList<?>)getIDESTWZentraleinheit()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case Balisentechnik_ETCSPackage.RBC__RBC_ALLG:
				return basicSetRBCAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE:
				return getETCSAdresse();
			case Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT:
				return getIDESTWZentraleinheit();
			case Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case Balisentechnik_ETCSPackage.RBC__RBC_ALLG:
				return getRBCAllg();
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
			case Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE:
				setETCSAdresse((ETCS_Adresse_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT:
				getIDESTWZentraleinheit().clear();
				getIDESTWZentraleinheit().addAll((Collection<? extends ID_ESTW_Zentraleinheit_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.RBC__RBC_ALLG:
				setRBCAllg((RBC_Allg_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE:
				setETCSAdresse((ETCS_Adresse_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT:
				getIDESTWZentraleinheit().clear();
				return;
			case Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.RBC__RBC_ALLG:
				setRBCAllg((RBC_Allg_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.RBC__ETCS_ADRESSE:
				return eTCSAdresse != null;
			case Balisentechnik_ETCSPackage.RBC__IDESTW_ZENTRALEINHEIT:
				return iDESTWZentraleinheit != null && !iDESTWZentraleinheit.isEmpty();
			case Balisentechnik_ETCSPackage.RBC__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case Balisentechnik_ETCSPackage.RBC__RBC_ALLG:
				return rBCAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //RBCImpl
