/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Anbindung_IB2_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Anbindung_IB3_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Hersteller_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Schrankreihe_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Steuerbezirksname_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Steuerbezirksnummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Bezirk Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getAnbindungIB2 <em>Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getAnbindungIB3 <em>Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getSchrankreihe <em>Schrankreihe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getSteuerbezirksname <em>Steuerbezirksname</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Bezirk_Allg_AttributeGroupImpl#getSteuerbezirksnummer <em>Steuerbezirksnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Bezirk_Allg_AttributeGroupImpl extends EObjectImpl implements Bedien_Bezirk_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnbindungIB2() <em>Anbindung IB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnbindungIB2()
	 * @generated
	 * @ordered
	 */
	protected Anbindung_IB2_TypeClass anbindungIB2;

	/**
	 * The cached value of the '{@link #getAnbindungIB3() <em>Anbindung IB3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnbindungIB3()
	 * @generated
	 * @ordered
	 */
	protected Anbindung_IB3_TypeClass anbindungIB3;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getSchrankreihe() <em>Schrankreihe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchrankreihe()
	 * @generated
	 * @ordered
	 */
	protected Schrankreihe_TypeClass schrankreihe;

	/**
	 * The cached value of the '{@link #getSteuerbezirksname() <em>Steuerbezirksname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerbezirksname()
	 * @generated
	 * @ordered
	 */
	protected Steuerbezirksname_TypeClass steuerbezirksname;

	/**
	 * The cached value of the '{@link #getSteuerbezirksnummer() <em>Steuerbezirksnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerbezirksnummer()
	 * @generated
	 * @ordered
	 */
	protected Steuerbezirksnummer_TypeClass steuerbezirksnummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Bezirk_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anbindung_IB2_TypeClass getAnbindungIB2() {
		return anbindungIB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnbindungIB2(Anbindung_IB2_TypeClass newAnbindungIB2, NotificationChain msgs) {
		Anbindung_IB2_TypeClass oldAnbindungIB2 = anbindungIB2;
		anbindungIB2 = newAnbindungIB2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2, oldAnbindungIB2, newAnbindungIB2);
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
	public void setAnbindungIB2(Anbindung_IB2_TypeClass newAnbindungIB2) {
		if (newAnbindungIB2 != anbindungIB2) {
			NotificationChain msgs = null;
			if (anbindungIB2 != null)
				msgs = ((InternalEObject)anbindungIB2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2, null, msgs);
			if (newAnbindungIB2 != null)
				msgs = ((InternalEObject)newAnbindungIB2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2, null, msgs);
			msgs = basicSetAnbindungIB2(newAnbindungIB2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2, newAnbindungIB2, newAnbindungIB2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anbindung_IB3_TypeClass getAnbindungIB3() {
		return anbindungIB3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnbindungIB3(Anbindung_IB3_TypeClass newAnbindungIB3, NotificationChain msgs) {
		Anbindung_IB3_TypeClass oldAnbindungIB3 = anbindungIB3;
		anbindungIB3 = newAnbindungIB3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3, oldAnbindungIB3, newAnbindungIB3);
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
	public void setAnbindungIB3(Anbindung_IB3_TypeClass newAnbindungIB3) {
		if (newAnbindungIB3 != anbindungIB3) {
			NotificationChain msgs = null;
			if (anbindungIB3 != null)
				msgs = ((InternalEObject)anbindungIB3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3, null, msgs);
			if (newAnbindungIB3 != null)
				msgs = ((InternalEObject)newAnbindungIB3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3, null, msgs);
			msgs = basicSetAnbindungIB3(newAnbindungIB3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3, newAnbindungIB3, newAnbindungIB3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankreihe_TypeClass getSchrankreihe() {
		return schrankreihe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchrankreihe(Schrankreihe_TypeClass newSchrankreihe, NotificationChain msgs) {
		Schrankreihe_TypeClass oldSchrankreihe = schrankreihe;
		schrankreihe = newSchrankreihe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE, oldSchrankreihe, newSchrankreihe);
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
	public void setSchrankreihe(Schrankreihe_TypeClass newSchrankreihe) {
		if (newSchrankreihe != schrankreihe) {
			NotificationChain msgs = null;
			if (schrankreihe != null)
				msgs = ((InternalEObject)schrankreihe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE, null, msgs);
			if (newSchrankreihe != null)
				msgs = ((InternalEObject)newSchrankreihe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE, null, msgs);
			msgs = basicSetSchrankreihe(newSchrankreihe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE, newSchrankreihe, newSchrankreihe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Steuerbezirksname_TypeClass getSteuerbezirksname() {
		return steuerbezirksname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteuerbezirksname(Steuerbezirksname_TypeClass newSteuerbezirksname, NotificationChain msgs) {
		Steuerbezirksname_TypeClass oldSteuerbezirksname = steuerbezirksname;
		steuerbezirksname = newSteuerbezirksname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME, oldSteuerbezirksname, newSteuerbezirksname);
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
	public void setSteuerbezirksname(Steuerbezirksname_TypeClass newSteuerbezirksname) {
		if (newSteuerbezirksname != steuerbezirksname) {
			NotificationChain msgs = null;
			if (steuerbezirksname != null)
				msgs = ((InternalEObject)steuerbezirksname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME, null, msgs);
			if (newSteuerbezirksname != null)
				msgs = ((InternalEObject)newSteuerbezirksname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME, null, msgs);
			msgs = basicSetSteuerbezirksname(newSteuerbezirksname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME, newSteuerbezirksname, newSteuerbezirksname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Steuerbezirksnummer_TypeClass getSteuerbezirksnummer() {
		return steuerbezirksnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteuerbezirksnummer(Steuerbezirksnummer_TypeClass newSteuerbezirksnummer, NotificationChain msgs) {
		Steuerbezirksnummer_TypeClass oldSteuerbezirksnummer = steuerbezirksnummer;
		steuerbezirksnummer = newSteuerbezirksnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER, oldSteuerbezirksnummer, newSteuerbezirksnummer);
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
	public void setSteuerbezirksnummer(Steuerbezirksnummer_TypeClass newSteuerbezirksnummer) {
		if (newSteuerbezirksnummer != steuerbezirksnummer) {
			NotificationChain msgs = null;
			if (steuerbezirksnummer != null)
				msgs = ((InternalEObject)steuerbezirksnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER, null, msgs);
			if (newSteuerbezirksnummer != null)
				msgs = ((InternalEObject)newSteuerbezirksnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER, null, msgs);
			msgs = basicSetSteuerbezirksnummer(newSteuerbezirksnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER, newSteuerbezirksnummer, newSteuerbezirksnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2:
				return basicSetAnbindungIB2(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3:
				return basicSetAnbindungIB3(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE:
				return basicSetSchrankreihe(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME:
				return basicSetSteuerbezirksname(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER:
				return basicSetSteuerbezirksnummer(null, msgs);
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
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2:
				return getAnbindungIB2();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3:
				return getAnbindungIB3();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE:
				return getSchrankreihe();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME:
				return getSteuerbezirksname();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER:
				return getSteuerbezirksnummer();
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
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2:
				setAnbindungIB2((Anbindung_IB2_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3:
				setAnbindungIB3((Anbindung_IB3_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE:
				setSchrankreihe((Schrankreihe_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME:
				setSteuerbezirksname((Steuerbezirksname_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER:
				setSteuerbezirksnummer((Steuerbezirksnummer_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2:
				setAnbindungIB2((Anbindung_IB2_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3:
				setAnbindungIB3((Anbindung_IB3_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE:
				setSchrankreihe((Schrankreihe_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME:
				setSteuerbezirksname((Steuerbezirksname_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER:
				setSteuerbezirksnummer((Steuerbezirksnummer_TypeClass)null);
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
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB2:
				return anbindungIB2 != null;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__ANBINDUNG_IB3:
				return anbindungIB3 != null;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__SCHRANKREIHE:
				return schrankreihe != null;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNAME:
				return steuerbezirksname != null;
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP__STEUERBEZIRKSNUMMER:
				return steuerbezirksnummer != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Bezirk_Allg_AttributeGroupImpl
