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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Eingang_Gepuffert_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Energie_Eingang_Art_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Primaerquelle_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Energie_Eingang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul Eingang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_Modul_Eingang_AttributeGroupImpl#getEingangGepuffert <em>Eingang Gepuffert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_Modul_Eingang_AttributeGroupImpl#getPrimaerquelle <em>Primaerquelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_Modul_Eingang_AttributeGroupImpl#getEnergieEingangArt <em>Energie Eingang Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_Modul_Eingang_AttributeGroupImpl#getIDEnergieEingang <em>ID Energie Eingang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_Modul_Eingang_AttributeGroupImpl extends EObjectImpl implements EV_Modul_Eingang_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEingangGepuffert() <em>Eingang Gepuffert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEingangGepuffert()
	 * @generated
	 * @ordered
	 */
	protected Eingang_Gepuffert_TypeClass eingangGepuffert;

	/**
	 * The cached value of the '{@link #getPrimaerquelle() <em>Primaerquelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerquelle()
	 * @generated
	 * @ordered
	 */
	protected Primaerquelle_TypeClass primaerquelle;

	/**
	 * The cached value of the '{@link #getEnergieEingangArt() <em>Energie Eingang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieEingangArt()
	 * @generated
	 * @ordered
	 */
	protected Energie_Eingang_Art_TypeClass energieEingangArt;

	/**
	 * The cached value of the '{@link #getIDEnergieEingang() <em>ID Energie Eingang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergieEingang()
	 * @generated
	 * @ordered
	 */
	protected ID_Energie_Eingang_TypeClass iDEnergieEingang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_Modul_Eingang_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Eingang_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eingang_Gepuffert_TypeClass getEingangGepuffert() {
		return eingangGepuffert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEingangGepuffert(Eingang_Gepuffert_TypeClass newEingangGepuffert, NotificationChain msgs) {
		Eingang_Gepuffert_TypeClass oldEingangGepuffert = eingangGepuffert;
		eingangGepuffert = newEingangGepuffert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT, oldEingangGepuffert, newEingangGepuffert);
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
	public void setEingangGepuffert(Eingang_Gepuffert_TypeClass newEingangGepuffert) {
		if (newEingangGepuffert != eingangGepuffert) {
			NotificationChain msgs = null;
			if (eingangGepuffert != null)
				msgs = ((InternalEObject)eingangGepuffert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT, null, msgs);
			if (newEingangGepuffert != null)
				msgs = ((InternalEObject)newEingangGepuffert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT, null, msgs);
			msgs = basicSetEingangGepuffert(newEingangGepuffert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT, newEingangGepuffert, newEingangGepuffert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primaerquelle_TypeClass getPrimaerquelle() {
		return primaerquelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaerquelle(Primaerquelle_TypeClass newPrimaerquelle, NotificationChain msgs) {
		Primaerquelle_TypeClass oldPrimaerquelle = primaerquelle;
		primaerquelle = newPrimaerquelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE, oldPrimaerquelle, newPrimaerquelle);
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
	public void setPrimaerquelle(Primaerquelle_TypeClass newPrimaerquelle) {
		if (newPrimaerquelle != primaerquelle) {
			NotificationChain msgs = null;
			if (primaerquelle != null)
				msgs = ((InternalEObject)primaerquelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE, null, msgs);
			if (newPrimaerquelle != null)
				msgs = ((InternalEObject)newPrimaerquelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE, null, msgs);
			msgs = basicSetPrimaerquelle(newPrimaerquelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE, newPrimaerquelle, newPrimaerquelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energie_Eingang_Art_TypeClass getEnergieEingangArt() {
		return energieEingangArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieEingangArt(Energie_Eingang_Art_TypeClass newEnergieEingangArt, NotificationChain msgs) {
		Energie_Eingang_Art_TypeClass oldEnergieEingangArt = energieEingangArt;
		energieEingangArt = newEnergieEingangArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART, oldEnergieEingangArt, newEnergieEingangArt);
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
	public void setEnergieEingangArt(Energie_Eingang_Art_TypeClass newEnergieEingangArt) {
		if (newEnergieEingangArt != energieEingangArt) {
			NotificationChain msgs = null;
			if (energieEingangArt != null)
				msgs = ((InternalEObject)energieEingangArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART, null, msgs);
			if (newEnergieEingangArt != null)
				msgs = ((InternalEObject)newEnergieEingangArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART, null, msgs);
			msgs = basicSetEnergieEingangArt(newEnergieEingangArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART, newEnergieEingangArt, newEnergieEingangArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Energie_Eingang_TypeClass getIDEnergieEingang() {
		return iDEnergieEingang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEnergieEingang(ID_Energie_Eingang_TypeClass newIDEnergieEingang, NotificationChain msgs) {
		ID_Energie_Eingang_TypeClass oldIDEnergieEingang = iDEnergieEingang;
		iDEnergieEingang = newIDEnergieEingang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG, oldIDEnergieEingang, newIDEnergieEingang);
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
	public void setIDEnergieEingang(ID_Energie_Eingang_TypeClass newIDEnergieEingang) {
		if (newIDEnergieEingang != iDEnergieEingang) {
			NotificationChain msgs = null;
			if (iDEnergieEingang != null)
				msgs = ((InternalEObject)iDEnergieEingang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG, null, msgs);
			if (newIDEnergieEingang != null)
				msgs = ((InternalEObject)newIDEnergieEingang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG, null, msgs);
			msgs = basicSetIDEnergieEingang(newIDEnergieEingang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG, newIDEnergieEingang, newIDEnergieEingang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT:
				return basicSetEingangGepuffert(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE:
				return basicSetPrimaerquelle(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART:
				return basicSetEnergieEingangArt(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG:
				return basicSetIDEnergieEingang(null, msgs);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT:
				return getEingangGepuffert();
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE:
				return getPrimaerquelle();
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART:
				return getEnergieEingangArt();
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG:
				return getIDEnergieEingang();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT:
				setEingangGepuffert((Eingang_Gepuffert_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE:
				setPrimaerquelle((Primaerquelle_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART:
				setEnergieEingangArt((Energie_Eingang_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG:
				setIDEnergieEingang((ID_Energie_Eingang_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT:
				setEingangGepuffert((Eingang_Gepuffert_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE:
				setPrimaerquelle((Primaerquelle_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART:
				setEnergieEingangArt((Energie_Eingang_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG:
				setIDEnergieEingang((ID_Energie_Eingang_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__EINGANG_GEPUFFERT:
				return eingangGepuffert != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__PRIMAERQUELLE:
				return primaerquelle != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ENERGIE_EINGANG_ART:
				return energieEingangArt != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP__ID_ENERGIE_EINGANG:
				return iDEnergieEingang != null;
		}
		return super.eIsSet(featureID);
	}

} //EV_Modul_Eingang_AttributeGroupImpl
