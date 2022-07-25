/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Information_Eingang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDInformationEingang <em>ID Information Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getLEUModulAllg <em>LEU Modul Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_ModulImpl#getLEUModulAusgang <em>LEU Modul Ausgang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_ModulImpl extends Basis_ObjektImpl implements LEU_Modul {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDInformationEingang() <em>ID Information Eingang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationEingang()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Information_Eingang_TypeClass> iDInformationEingang;

	/**
	 * The cached value of the '{@link #getIDLEUAnlage() <em>IDLEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_LEU_Anlage_ohne_Proxy_TypeClass iDLEUAnlage;

	/**
	 * The cached value of the '{@link #getIDLEUSchaltkasten() <em>IDLEU Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUSchaltkasten()
	 * @generated
	 * @ordered
	 */
	protected ID_LEU_Schaltkasten_ohne_Proxy_TypeClass iDLEUSchaltkasten;

	/**
	 * The cached value of the '{@link #getLEUModulAllg() <em>LEU Modul Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulAllg()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Allg_AttributeGroup lEUModulAllg;

	/**
	 * The cached value of the '{@link #getLEUModulAusgang() <em>LEU Modul Ausgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulAusgang()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Modul_Ausgang_AttributeGroup> lEUModulAusgang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_ModulImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		LEU_Modul_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Information_Eingang_TypeClass> getIDInformationEingang() {
		if (iDInformationEingang == null) {
			iDInformationEingang = new EObjectContainmentEList<ID_Information_Eingang_TypeClass>(ID_Information_Eingang_TypeClass.class, this, Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG);
		}
		return iDInformationEingang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Anlage_ohne_Proxy_TypeClass getIDLEUAnlage() {
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDLEUAnlage(ID_LEU_Anlage_ohne_Proxy_TypeClass newIDLEUAnlage, NotificationChain msgs) {
		ID_LEU_Anlage_ohne_Proxy_TypeClass oldIDLEUAnlage = iDLEUAnlage;
		iDLEUAnlage = newIDLEUAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, oldIDLEUAnlage, newIDLEUAnlage);
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
	public void setIDLEUAnlage(ID_LEU_Anlage_ohne_Proxy_TypeClass newIDLEUAnlage) {
		if (newIDLEUAnlage != iDLEUAnlage) {
			NotificationChain msgs = null;
			if (iDLEUAnlage != null)
				msgs = ((InternalEObject)iDLEUAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, null, msgs);
			if (newIDLEUAnlage != null)
				msgs = ((InternalEObject)newIDLEUAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, null, msgs);
			msgs = basicSetIDLEUAnlage(newIDLEUAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, newIDLEUAnlage, newIDLEUAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Schaltkasten_ohne_Proxy_TypeClass getIDLEUSchaltkasten() {
		return iDLEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDLEUSchaltkasten(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass newIDLEUSchaltkasten, NotificationChain msgs) {
		ID_LEU_Schaltkasten_ohne_Proxy_TypeClass oldIDLEUSchaltkasten = iDLEUSchaltkasten;
		iDLEUSchaltkasten = newIDLEUSchaltkasten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, oldIDLEUSchaltkasten, newIDLEUSchaltkasten);
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
	public void setIDLEUSchaltkasten(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass newIDLEUSchaltkasten) {
		if (newIDLEUSchaltkasten != iDLEUSchaltkasten) {
			NotificationChain msgs = null;
			if (iDLEUSchaltkasten != null)
				msgs = ((InternalEObject)iDLEUSchaltkasten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, null, msgs);
			if (newIDLEUSchaltkasten != null)
				msgs = ((InternalEObject)newIDLEUSchaltkasten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, null, msgs);
			msgs = basicSetIDLEUSchaltkasten(newIDLEUSchaltkasten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, newIDLEUSchaltkasten, newIDLEUSchaltkasten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Allg_AttributeGroup getLEUModulAllg() {
		return lEUModulAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUModulAllg(LEU_Modul_Allg_AttributeGroup newLEUModulAllg, NotificationChain msgs) {
		LEU_Modul_Allg_AttributeGroup oldLEUModulAllg = lEUModulAllg;
		lEUModulAllg = newLEUModulAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, oldLEUModulAllg, newLEUModulAllg);
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
	public void setLEUModulAllg(LEU_Modul_Allg_AttributeGroup newLEUModulAllg) {
		if (newLEUModulAllg != lEUModulAllg) {
			NotificationChain msgs = null;
			if (lEUModulAllg != null)
				msgs = ((InternalEObject)lEUModulAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, null, msgs);
			if (newLEUModulAllg != null)
				msgs = ((InternalEObject)newLEUModulAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, null, msgs);
			msgs = basicSetLEUModulAllg(newLEUModulAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, newLEUModulAllg, newLEUModulAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Modul_Ausgang_AttributeGroup> getLEUModulAusgang() {
		if (lEUModulAusgang == null) {
			lEUModulAusgang = new EObjectContainmentEList<LEU_Modul_Ausgang_AttributeGroup>(LEU_Modul_Ausgang_AttributeGroup.class, this, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG);
		}
		return lEUModulAusgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				return ((InternalEList<?>)getIDInformationEingang()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				return basicSetIDLEUAnlage(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				return basicSetIDLEUSchaltkasten(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return basicSetLEUModulAllg(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return ((InternalEList<?>)getLEUModulAusgang()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				return getIDInformationEingang();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				return getIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				return getIDLEUSchaltkasten();
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return getLEUModulAllg();
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return getLEUModulAusgang();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				setBezeichnung((LEU_Modul_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				getIDInformationEingang().clear();
				getIDInformationEingang().addAll((Collection<? extends ID_Information_Eingang_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				setIDLEUAnlage((ID_LEU_Anlage_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				setIDLEUSchaltkasten((ID_LEU_Schaltkasten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				setLEUModulAllg((LEU_Modul_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				getLEUModulAusgang().clear();
				getLEUModulAusgang().addAll((Collection<? extends LEU_Modul_Ausgang_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				setBezeichnung((LEU_Modul_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				getIDInformationEingang().clear();
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				setIDLEUAnlage((ID_LEU_Anlage_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				setIDLEUSchaltkasten((ID_LEU_Schaltkasten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				setLEUModulAllg((LEU_Modul_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				getLEUModulAusgang().clear();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				return iDInformationEingang != null && !iDInformationEingang.isEmpty();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				return iDLEUAnlage != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				return iDLEUSchaltkasten != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return lEUModulAllg != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return lEUModulAusgang != null && !lEUModulAusgang.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LEU_ModulImpl
