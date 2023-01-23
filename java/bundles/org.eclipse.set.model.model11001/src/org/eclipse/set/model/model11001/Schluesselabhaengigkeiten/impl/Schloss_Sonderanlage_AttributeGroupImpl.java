/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Sonderanlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Sonderanlage Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl#getSonderanlageLage <em>Sonderanlage Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl#getIDSonderanlage <em>ID Sonderanlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Sonderanlage_AttributeGroupImpl extends EObjectImpl implements Schloss_Sonderanlage_AttributeGroup {
	/**
	 * The cached value of the '{@link #getSonderanlageLage() <em>Sonderanlage Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonderanlageLage()
	 * @generated
	 * @ordered
	 */
	protected Sonderanlage_Lage_TypeClass sonderanlageLage;

	/**
	 * The cached value of the '{@link #getBeschreibungSonderanlage() <em>Beschreibung Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibungSonderanlage()
	 * @generated
	 * @ordered
	 */
	protected Beschreibung_Sonderanlage_TypeClass beschreibungSonderanlage;

	/**
	 * The cached value of the '{@link #getIDSonderanlage() <em>ID Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSonderanlage()
	 * @generated
	 * @ordered
	 */
	protected ID_Sonderanlage_TypeClass iDSonderanlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sonderanlage_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonderanlage_Lage_TypeClass getSonderanlageLage() {
		return sonderanlageLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSonderanlageLage(Sonderanlage_Lage_TypeClass newSonderanlageLage, NotificationChain msgs) {
		Sonderanlage_Lage_TypeClass oldSonderanlageLage = sonderanlageLage;
		sonderanlageLage = newSonderanlageLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE, oldSonderanlageLage, newSonderanlageLage);
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
	public void setSonderanlageLage(Sonderanlage_Lage_TypeClass newSonderanlageLage) {
		if (newSonderanlageLage != sonderanlageLage) {
			NotificationChain msgs = null;
			if (sonderanlageLage != null)
				msgs = ((InternalEObject)sonderanlageLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE, null, msgs);
			if (newSonderanlageLage != null)
				msgs = ((InternalEObject)newSonderanlageLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE, null, msgs);
			msgs = basicSetSonderanlageLage(newSonderanlageLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE, newSonderanlageLage, newSonderanlageLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beschreibung_Sonderanlage_TypeClass getBeschreibungSonderanlage() {
		return beschreibungSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass newBeschreibungSonderanlage, NotificationChain msgs) {
		Beschreibung_Sonderanlage_TypeClass oldBeschreibungSonderanlage = beschreibungSonderanlage;
		beschreibungSonderanlage = newBeschreibungSonderanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, oldBeschreibungSonderanlage, newBeschreibungSonderanlage);
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
	public void setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass newBeschreibungSonderanlage) {
		if (newBeschreibungSonderanlage != beschreibungSonderanlage) {
			NotificationChain msgs = null;
			if (beschreibungSonderanlage != null)
				msgs = ((InternalEObject)beschreibungSonderanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, null, msgs);
			if (newBeschreibungSonderanlage != null)
				msgs = ((InternalEObject)newBeschreibungSonderanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, null, msgs);
			msgs = basicSetBeschreibungSonderanlage(newBeschreibungSonderanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, newBeschreibungSonderanlage, newBeschreibungSonderanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Sonderanlage_TypeClass getIDSonderanlage() {
		return iDSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSonderanlage(ID_Sonderanlage_TypeClass newIDSonderanlage, NotificationChain msgs) {
		ID_Sonderanlage_TypeClass oldIDSonderanlage = iDSonderanlage;
		iDSonderanlage = newIDSonderanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, oldIDSonderanlage, newIDSonderanlage);
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
	public void setIDSonderanlage(ID_Sonderanlage_TypeClass newIDSonderanlage) {
		if (newIDSonderanlage != iDSonderanlage) {
			NotificationChain msgs = null;
			if (iDSonderanlage != null)
				msgs = ((InternalEObject)iDSonderanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, null, msgs);
			if (newIDSonderanlage != null)
				msgs = ((InternalEObject)newIDSonderanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, null, msgs);
			msgs = basicSetIDSonderanlage(newIDSonderanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, newIDSonderanlage, newIDSonderanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE:
				return basicSetSonderanlageLage(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return basicSetBeschreibungSonderanlage(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				return basicSetIDSonderanlage(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE:
				return getSonderanlageLage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return getBeschreibungSonderanlage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				return getIDSonderanlage();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE:
				setSonderanlageLage((Sonderanlage_Lage_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				setBeschreibungSonderanlage((Beschreibung_Sonderanlage_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				setIDSonderanlage((ID_Sonderanlage_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE:
				setSonderanlageLage((Sonderanlage_Lage_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				setBeschreibungSonderanlage((Beschreibung_Sonderanlage_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				setIDSonderanlage((ID_Sonderanlage_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE:
				return sonderanlageLage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return beschreibungSonderanlage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				return iDSonderanlage != null;
		}
		return super.eIsSet(featureID);
	}

} //Schloss_Sonderanlage_AttributeGroupImpl
