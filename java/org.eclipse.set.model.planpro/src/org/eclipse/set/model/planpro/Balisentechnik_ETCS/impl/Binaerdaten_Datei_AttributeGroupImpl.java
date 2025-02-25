/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateiname_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateityp_Binaerdatei_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaerdaten Datei Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Binaerdaten_Datei_AttributeGroupImpl#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Binaerdaten_Datei_AttributeGroupImpl#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Binaerdaten_Datei_AttributeGroupImpl extends EObjectImpl implements Binaerdaten_Datei_AttributeGroup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binaerdaten_Datei_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBinaerdaten_Datei_AttributeGroup();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME, oldDateiname, newDateiname);
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
				msgs = ((InternalEObject)dateiname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			if (newDateiname != null)
				msgs = ((InternalEObject)newDateiname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			msgs = basicSetDateiname(newDateiname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME, newDateiname, newDateiname));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, oldDateitypBinaerdatei, newDateitypBinaerdatei);
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
				msgs = ((InternalEObject)dateitypBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, null, msgs);
			if (newDateitypBinaerdatei != null)
				msgs = ((InternalEObject)newDateitypBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, null, msgs);
			msgs = basicSetDateitypBinaerdatei(newDateitypBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI, newDateitypBinaerdatei, newDateitypBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME:
				return basicSetDateiname(null, msgs);
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return basicSetDateitypBinaerdatei(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME:
				return getDateiname();
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return getDateitypBinaerdatei();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				setDateitypBinaerdatei((Dateityp_Binaerdatei_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				setDateitypBinaerdatei((Dateityp_Binaerdatei_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEINAME:
				return dateiname != null;
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP__DATEITYP_BINAERDATEI:
				return dateitypBinaerdatei != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Binaerdaten_Datei_AttributeGroupImpl
