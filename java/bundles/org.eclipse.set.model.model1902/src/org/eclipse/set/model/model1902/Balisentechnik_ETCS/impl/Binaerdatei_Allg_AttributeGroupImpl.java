/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Dateiname_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Dateityp_Binaerdatei_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Daten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaerdatei Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Binaerdatei_Allg_AttributeGroupImpl#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Binaerdatei_Allg_AttributeGroupImpl#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Binaerdatei_Allg_AttributeGroupImpl#getDaten <em>Daten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Binaerdatei_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Binaerdatei_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDateiname() <em>Dateiname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateiname()
	 * @generated
	 * @ordered
	 */
	protected Dateiname_TypeClass dateiname;

	/**
	 * The cached value of the '{@link #getDateitypBinaerdatei() <em>Dateityp Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateitypBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected Dateityp_Binaerdatei_TypeClass dateitypBinaerdatei;

	/**
	 * The cached value of the '{@link #getDaten() <em>Daten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaten()
	 * @generated
	 * @ordered
	 */
	protected Daten_TypeClass daten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binaerdatei_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBinaerdatei_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateiname_TypeClass getDateiname() {
		return dateiname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateiname(Dateiname_TypeClass newDateiname, NotificationChain msgs) {
		Dateiname_TypeClass oldDateiname = dateiname;
		dateiname = newDateiname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME, oldDateiname, newDateiname);
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
	public void setDateiname(Dateiname_TypeClass newDateiname) {
		if (newDateiname != dateiname) {
			NotificationChain msgs = null;
			if (dateiname != null)
				msgs = ((InternalEObject)dateiname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			if (newDateiname != null)
				msgs = ((InternalEObject)newDateiname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			msgs = basicSetDateiname(newDateiname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME, newDateiname, newDateiname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateityp_Binaerdatei_TypeClass getDateitypBinaerdatei() {
		return dateitypBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateitypBinaerdatei(Dateityp_Binaerdatei_TypeClass newDateitypBinaerdatei, NotificationChain msgs) {
		Dateityp_Binaerdatei_TypeClass oldDateitypBinaerdatei = dateitypBinaerdatei;
		dateitypBinaerdatei = newDateitypBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, oldDateitypBinaerdatei, newDateitypBinaerdatei);
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
	public void setDateitypBinaerdatei(Dateityp_Binaerdatei_TypeClass newDateitypBinaerdatei) {
		if (newDateitypBinaerdatei != dateitypBinaerdatei) {
			NotificationChain msgs = null;
			if (dateitypBinaerdatei != null)
				msgs = ((InternalEObject)dateitypBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, null, msgs);
			if (newDateitypBinaerdatei != null)
				msgs = ((InternalEObject)newDateitypBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, null, msgs);
			msgs = basicSetDateitypBinaerdatei(newDateitypBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, newDateitypBinaerdatei, newDateitypBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Daten_TypeClass getDaten() {
		return daten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaten(Daten_TypeClass newDaten, NotificationChain msgs) {
		Daten_TypeClass oldDaten = daten;
		daten = newDaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN, oldDaten, newDaten);
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
	public void setDaten(Daten_TypeClass newDaten) {
		if (newDaten != daten) {
			NotificationChain msgs = null;
			if (daten != null)
				msgs = ((InternalEObject)daten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN, null, msgs);
			if (newDaten != null)
				msgs = ((InternalEObject)newDaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN, null, msgs);
			msgs = basicSetDaten(newDaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN, newDaten, newDaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return basicSetDateiname(null, msgs);
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return basicSetDateitypBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN:
				return basicSetDaten(null, msgs);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return getDateiname();
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return getDateitypBinaerdatei();
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN:
				return getDaten();
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
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				setDateitypBinaerdatei((Dateityp_Binaerdatei_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN:
				setDaten((Daten_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				setDateitypBinaerdatei((Dateityp_Binaerdatei_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN:
				setDaten((Daten_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return dateiname != null;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return dateitypBinaerdatei != null;
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP__DATEN:
				return daten != null;
		}
		return super.eIsSet(featureID);
	}

} //Binaerdatei_Allg_AttributeGroupImpl
