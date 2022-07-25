/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Bedien_Bezirk_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ESTW_Zentraleinheit_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Platz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getBedienPlatzAllg <em>Bedien Platz Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_PlatzImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_PlatzImpl extends Basis_ObjektImpl implements Bedien_Platz {
	/**
	 * The cached value of the '{@link #getBedienPlatzAllg() <em>Bedien Platz Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienPlatzAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Platz_Allg_AttributeGroup bedienPlatzAllg;

	/**
	 * The cached value of the '{@link #getIDAnhangMoebelplanAufriss() <em>ID Anhang Moebelplan Aufriss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMoebelplanAufriss()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangMoebelplanAufriss;

	/**
	 * The cached value of the '{@link #getIDAnhangMoebelplanGrundriss() <em>ID Anhang Moebelplan Grundriss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMoebelplanGrundriss()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangMoebelplanGrundriss;

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
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirk;

	/**
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected ID_ESTW_Zentraleinheit_TypeClass iDESTWZentraleinheit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_PlatzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_PLATZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz_Allg_AttributeGroup getBedienPlatzAllg() {
		return bedienPlatzAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup newBedienPlatzAllg, NotificationChain msgs) {
		Bedien_Platz_Allg_AttributeGroup oldBedienPlatzAllg = bedienPlatzAllg;
		bedienPlatzAllg = newBedienPlatzAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, oldBedienPlatzAllg, newBedienPlatzAllg);
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
	public void setBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup newBedienPlatzAllg) {
		if (newBedienPlatzAllg != bedienPlatzAllg) {
			NotificationChain msgs = null;
			if (bedienPlatzAllg != null)
				msgs = ((InternalEObject)bedienPlatzAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, null, msgs);
			if (newBedienPlatzAllg != null)
				msgs = ((InternalEObject)newBedienPlatzAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, null, msgs);
			msgs = basicSetBedienPlatzAllg(newBedienPlatzAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, newBedienPlatzAllg, newBedienPlatzAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangMoebelplanAufriss() {
		return iDAnhangMoebelplanAufriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangMoebelplanAufriss(ID_Anhang_TypeClass newIDAnhangMoebelplanAufriss, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangMoebelplanAufriss = iDAnhangMoebelplanAufriss;
		iDAnhangMoebelplanAufriss = newIDAnhangMoebelplanAufriss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, oldIDAnhangMoebelplanAufriss, newIDAnhangMoebelplanAufriss);
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
	public void setIDAnhangMoebelplanAufriss(ID_Anhang_TypeClass newIDAnhangMoebelplanAufriss) {
		if (newIDAnhangMoebelplanAufriss != iDAnhangMoebelplanAufriss) {
			NotificationChain msgs = null;
			if (iDAnhangMoebelplanAufriss != null)
				msgs = ((InternalEObject)iDAnhangMoebelplanAufriss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, null, msgs);
			if (newIDAnhangMoebelplanAufriss != null)
				msgs = ((InternalEObject)newIDAnhangMoebelplanAufriss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, null, msgs);
			msgs = basicSetIDAnhangMoebelplanAufriss(newIDAnhangMoebelplanAufriss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, newIDAnhangMoebelplanAufriss, newIDAnhangMoebelplanAufriss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangMoebelplanGrundriss() {
		return iDAnhangMoebelplanGrundriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangMoebelplanGrundriss(ID_Anhang_TypeClass newIDAnhangMoebelplanGrundriss, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangMoebelplanGrundriss = iDAnhangMoebelplanGrundriss;
		iDAnhangMoebelplanGrundriss = newIDAnhangMoebelplanGrundriss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, oldIDAnhangMoebelplanGrundriss, newIDAnhangMoebelplanGrundriss);
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
	public void setIDAnhangMoebelplanGrundriss(ID_Anhang_TypeClass newIDAnhangMoebelplanGrundriss) {
		if (newIDAnhangMoebelplanGrundriss != iDAnhangMoebelplanGrundriss) {
			NotificationChain msgs = null;
			if (iDAnhangMoebelplanGrundriss != null)
				msgs = ((InternalEObject)iDAnhangMoebelplanGrundriss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, null, msgs);
			if (newIDAnhangMoebelplanGrundriss != null)
				msgs = ((InternalEObject)newIDAnhangMoebelplanGrundriss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, null, msgs);
			msgs = basicSetIDAnhangMoebelplanGrundriss(newIDAnhangMoebelplanGrundriss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, newIDAnhangMoebelplanGrundriss, newIDAnhangMoebelplanGrundriss));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, newIDBedienBezirk);
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
	public void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk) {
		if (newIDBedienBezirk != iDBedienBezirk) {
			NotificationChain msgs = null;
			if (iDBedienBezirk != null)
				msgs = ((InternalEObject)iDBedienBezirk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, null, msgs);
			if (newIDBedienBezirk != null)
				msgs = ((InternalEObject)newIDBedienBezirk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, null, msgs);
			msgs = basicSetIDBedienBezirk(newIDBedienBezirk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, newIDBedienBezirk, newIDBedienBezirk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ESTW_Zentraleinheit_TypeClass getIDESTWZentraleinheit() {
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit, NotificationChain msgs) {
		ID_ESTW_Zentraleinheit_TypeClass oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		iDESTWZentraleinheit = newIDESTWZentraleinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, newIDESTWZentraleinheit);
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
	public void setIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit) {
		if (newIDESTWZentraleinheit != iDESTWZentraleinheit) {
			NotificationChain msgs = null;
			if (iDESTWZentraleinheit != null)
				msgs = ((InternalEObject)iDESTWZentraleinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, null, msgs);
			if (newIDESTWZentraleinheit != null)
				msgs = ((InternalEObject)newIDESTWZentraleinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, null, msgs);
			msgs = basicSetIDESTWZentraleinheit(newIDESTWZentraleinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, newIDESTWZentraleinheit, newIDESTWZentraleinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return basicSetBedienPlatzAllg(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				return basicSetIDAnhangMoebelplanAufriss(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				return basicSetIDAnhangMoebelplanGrundriss(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				return basicSetIDBedienBezirk(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				return basicSetIDESTWZentraleinheit(null, msgs);
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return getBedienPlatzAllg();
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				return getIDAnhangMoebelplanAufriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				return getIDAnhangMoebelplanGrundriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				return getIDBedienBezirk();
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				return getIDESTWZentraleinheit();
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				setBedienPlatzAllg((Bedien_Platz_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				setIDAnhangMoebelplanAufriss((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				setIDAnhangMoebelplanGrundriss((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				setBedienPlatzAllg((Bedien_Platz_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				setIDAnhangMoebelplanAufriss((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				setIDAnhangMoebelplanGrundriss((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)null);
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return bedienPlatzAllg != null;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				return iDAnhangMoebelplanAufriss != null;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				return iDAnhangMoebelplanGrundriss != null;
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				return iDBedienBezirk != null;
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				return iDESTWZentraleinheit != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_PlatzImpl
