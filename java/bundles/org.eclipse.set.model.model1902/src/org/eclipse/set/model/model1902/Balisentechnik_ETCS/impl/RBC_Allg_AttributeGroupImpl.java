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
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_SRS_Unterversion_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC_SRS_Version_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Rufnummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBC Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.RBC_Allg_AttributeGroupImpl#getRBCSRSUnterversion <em>RBCSRS Unterversion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.RBC_Allg_AttributeGroupImpl#getRBCSRSVersion <em>RBCSRS Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.RBC_Allg_AttributeGroupImpl#getRufnummer <em>Rufnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBC_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements RBC_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getRBCSRSUnterversion() <em>RBCSRS Unterversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBCSRSUnterversion()
	 * @generated
	 * @ordered
	 */
	protected RBC_SRS_Unterversion_TypeClass rBCSRSUnterversion;

	/**
	 * The cached value of the '{@link #getRBCSRSVersion() <em>RBCSRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBCSRSVersion()
	 * @generated
	 * @ordered
	 */
	protected RBC_SRS_Version_TypeClass rBCSRSVersion;

	/**
	 * The cached value of the '{@link #getRufnummer() <em>Rufnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRufnummer()
	 * @generated
	 * @ordered
	 */
	protected Rufnummer_TypeClass rufnummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBC_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getRBC_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_SRS_Unterversion_TypeClass getRBCSRSUnterversion() {
		return rBCSRSUnterversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRBCSRSUnterversion(RBC_SRS_Unterversion_TypeClass newRBCSRSUnterversion, NotificationChain msgs) {
		RBC_SRS_Unterversion_TypeClass oldRBCSRSUnterversion = rBCSRSUnterversion;
		rBCSRSUnterversion = newRBCSRSUnterversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION, oldRBCSRSUnterversion, newRBCSRSUnterversion);
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
	public void setRBCSRSUnterversion(RBC_SRS_Unterversion_TypeClass newRBCSRSUnterversion) {
		if (newRBCSRSUnterversion != rBCSRSUnterversion) {
			NotificationChain msgs = null;
			if (rBCSRSUnterversion != null)
				msgs = ((InternalEObject)rBCSRSUnterversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION, null, msgs);
			if (newRBCSRSUnterversion != null)
				msgs = ((InternalEObject)newRBCSRSUnterversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION, null, msgs);
			msgs = basicSetRBCSRSUnterversion(newRBCSRSUnterversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION, newRBCSRSUnterversion, newRBCSRSUnterversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_SRS_Version_TypeClass getRBCSRSVersion() {
		return rBCSRSVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRBCSRSVersion(RBC_SRS_Version_TypeClass newRBCSRSVersion, NotificationChain msgs) {
		RBC_SRS_Version_TypeClass oldRBCSRSVersion = rBCSRSVersion;
		rBCSRSVersion = newRBCSRSVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION, oldRBCSRSVersion, newRBCSRSVersion);
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
	public void setRBCSRSVersion(RBC_SRS_Version_TypeClass newRBCSRSVersion) {
		if (newRBCSRSVersion != rBCSRSVersion) {
			NotificationChain msgs = null;
			if (rBCSRSVersion != null)
				msgs = ((InternalEObject)rBCSRSVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION, null, msgs);
			if (newRBCSRSVersion != null)
				msgs = ((InternalEObject)newRBCSRSVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION, null, msgs);
			msgs = basicSetRBCSRSVersion(newRBCSRSVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION, newRBCSRSVersion, newRBCSRSVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rufnummer_TypeClass getRufnummer() {
		return rufnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRufnummer(Rufnummer_TypeClass newRufnummer, NotificationChain msgs) {
		Rufnummer_TypeClass oldRufnummer = rufnummer;
		rufnummer = newRufnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER, oldRufnummer, newRufnummer);
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
	public void setRufnummer(Rufnummer_TypeClass newRufnummer) {
		if (newRufnummer != rufnummer) {
			NotificationChain msgs = null;
			if (rufnummer != null)
				msgs = ((InternalEObject)rufnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER, null, msgs);
			if (newRufnummer != null)
				msgs = ((InternalEObject)newRufnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER, null, msgs);
			msgs = basicSetRufnummer(newRufnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER, newRufnummer, newRufnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION:
				return basicSetRBCSRSUnterversion(null, msgs);
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION:
				return basicSetRBCSRSVersion(null, msgs);
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER:
				return basicSetRufnummer(null, msgs);
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
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION:
				return getRBCSRSUnterversion();
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION:
				return getRBCSRSVersion();
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER:
				return getRufnummer();
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
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION:
				setRBCSRSUnterversion((RBC_SRS_Unterversion_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION:
				setRBCSRSVersion((RBC_SRS_Version_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER:
				setRufnummer((Rufnummer_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION:
				setRBCSRSUnterversion((RBC_SRS_Unterversion_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION:
				setRBCSRSVersion((RBC_SRS_Version_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER:
				setRufnummer((Rufnummer_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_UNTERVERSION:
				return rBCSRSUnterversion != null;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RBCSRS_VERSION:
				return rBCSRSVersion != null;
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP__RUFNUMMER:
				return rufnummer != null;
		}
		return super.eIsSet(featureID);
	}

} //RBC_Allg_AttributeGroupImpl
