/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ZLV_Bus_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Anzeigefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_AnzeigefeldImpl extends Basis_ObjektImpl implements ZN_Anzeigefeld {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Abschnitt_TypeClass iDGleisAbschnitt;

	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_ZLV_Bus_TypeClass> iDZLVBus;

	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_TypeClass iDZN;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeld() <em>IDZN Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Anzeigefeld_TypeClass iDZNAnzeigefeld;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeldAllg() <em>ZN Anzeigefeld Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeldAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld_Allg_AttributeGroup zNAnzeigefeldAllg;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeldBezeichnung() <em>ZN Anzeigefeld Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeldBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld_Bezeichnung_AttributeGroup zNAnzeigefeldBezeichnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_AnzeigefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt() {
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt, NotificationChain msgs) {
		ID_Gleis_Abschnitt_TypeClass oldIDGleisAbschnitt = iDGleisAbschnitt;
		iDGleisAbschnitt = newIDGleisAbschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, newIDGleisAbschnitt);
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
	public void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt) {
		if (newIDGleisAbschnitt != iDGleisAbschnitt) {
			NotificationChain msgs = null;
			if (iDGleisAbschnitt != null)
				msgs = ((InternalEObject)iDGleisAbschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, null, msgs);
			if (newIDGleisAbschnitt != null)
				msgs = ((InternalEObject)newIDGleisAbschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, null, msgs);
			msgs = basicSetIDGleisAbschnitt(newIDGleisAbschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, newIDGleisAbschnitt, newIDGleisAbschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_ZLV_Bus_TypeClass> getIDZLVBus() {
		if (iDZLVBus == null) {
			iDZLVBus = new EObjectContainmentEList<ID_ZLV_Bus_TypeClass>(ID_ZLV_Bus_TypeClass.class, this, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS);
		}
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_TypeClass getIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZN(ID_ZN_TypeClass newIDZN, NotificationChain msgs) {
		ID_ZN_TypeClass oldIDZN = iDZN;
		iDZN = newIDZN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, oldIDZN, newIDZN);
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
	public void setIDZN(ID_ZN_TypeClass newIDZN) {
		if (newIDZN != iDZN) {
			NotificationChain msgs = null;
			if (iDZN != null)
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_TypeClass getIDZNAnzeigefeld() {
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass newIDZNAnzeigefeld, NotificationChain msgs) {
		ID_ZN_Anzeigefeld_TypeClass oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		iDZNAnzeigefeld = newIDZNAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, newIDZNAnzeigefeld);
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
	public void setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass newIDZNAnzeigefeld) {
		if (newIDZNAnzeigefeld != iDZNAnzeigefeld) {
			NotificationChain msgs = null;
			if (iDZNAnzeigefeld != null)
				msgs = ((InternalEObject)iDZNAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, null, msgs);
			if (newIDZNAnzeigefeld != null)
				msgs = ((InternalEObject)newIDZNAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, null, msgs);
			msgs = basicSetIDZNAnzeigefeld(newIDZNAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, newIDZNAnzeigefeld, newIDZNAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Allg_AttributeGroup getZNAnzeigefeldAllg() {
		return zNAnzeigefeldAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup newZNAnzeigefeldAllg, NotificationChain msgs) {
		ZN_Anzeigefeld_Allg_AttributeGroup oldZNAnzeigefeldAllg = zNAnzeigefeldAllg;
		zNAnzeigefeldAllg = newZNAnzeigefeldAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, oldZNAnzeigefeldAllg, newZNAnzeigefeldAllg);
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
	public void setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup newZNAnzeigefeldAllg) {
		if (newZNAnzeigefeldAllg != zNAnzeigefeldAllg) {
			NotificationChain msgs = null;
			if (zNAnzeigefeldAllg != null)
				msgs = ((InternalEObject)zNAnzeigefeldAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, null, msgs);
			if (newZNAnzeigefeldAllg != null)
				msgs = ((InternalEObject)newZNAnzeigefeldAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, null, msgs);
			msgs = basicSetZNAnzeigefeldAllg(newZNAnzeigefeldAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, newZNAnzeigefeldAllg, newZNAnzeigefeldAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Bezeichnung_AttributeGroup getZNAnzeigefeldBezeichnung() {
		return zNAnzeigefeldBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup newZNAnzeigefeldBezeichnung, NotificationChain msgs) {
		ZN_Anzeigefeld_Bezeichnung_AttributeGroup oldZNAnzeigefeldBezeichnung = zNAnzeigefeldBezeichnung;
		zNAnzeigefeldBezeichnung = newZNAnzeigefeldBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, oldZNAnzeigefeldBezeichnung, newZNAnzeigefeldBezeichnung);
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
	public void setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup newZNAnzeigefeldBezeichnung) {
		if (newZNAnzeigefeldBezeichnung != zNAnzeigefeldBezeichnung) {
			NotificationChain msgs = null;
			if (zNAnzeigefeldBezeichnung != null)
				msgs = ((InternalEObject)zNAnzeigefeldBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, null, msgs);
			if (newZNAnzeigefeldBezeichnung != null)
				msgs = ((InternalEObject)newZNAnzeigefeldBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, null, msgs);
			msgs = basicSetZNAnzeigefeldBezeichnung(newZNAnzeigefeldBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, newZNAnzeigefeldBezeichnung, newZNAnzeigefeldBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				return basicSetIDGleisAbschnitt(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				return ((InternalEList<?>)getIDZLVBus()).basicRemove(otherEnd, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				return basicSetIDZN(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				return basicSetIDZNAnzeigefeld(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return basicSetZNAnzeigefeldAllg(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return basicSetZNAnzeigefeldBezeichnung(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				return getIDGleisAbschnitt();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				return getIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				return getIDZN();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				return getIDZNAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return getZNAnzeigefeldAllg();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return getZNAnzeigefeldBezeichnung();
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				getIDZLVBus().clear();
				getIDZLVBus().addAll((Collection<? extends ID_ZLV_Bus_TypeClass>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ID_ZN_Anzeigefeld_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				setZNAnzeigefeldAllg((ZN_Anzeigefeld_Allg_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				setZNAnzeigefeldBezeichnung((ZN_Anzeigefeld_Bezeichnung_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				getIDZLVBus().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ID_ZN_Anzeigefeld_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				setZNAnzeigefeldAllg((ZN_Anzeigefeld_Allg_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				setZNAnzeigefeldBezeichnung((ZN_Anzeigefeld_Bezeichnung_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				return iDGleisAbschnitt != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				return iDZLVBus != null && !iDZLVBus.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				return iDZN != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				return iDZNAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return zNAnzeigefeldAllg != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return zNAnzeigefeldBezeichnung != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_AnzeigefeldImpl
