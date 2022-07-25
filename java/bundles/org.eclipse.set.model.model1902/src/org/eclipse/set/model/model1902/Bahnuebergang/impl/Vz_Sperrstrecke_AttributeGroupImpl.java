/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Sperrstrecke_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vz Sperrstrecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl#getVzSperrstreckeVorgeschaltet <em>Vz Sperrstrecke Vorgeschaltet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl#getSperrstrecke <em>Sperrstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl#getSperrstreckeFussgaenger <em>Sperrstrecke Fussgaenger</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Vz_Sperrstrecke_AttributeGroupImpl#getVzSperrstreckeSchranke <em>Vz Sperrstrecke Schranke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vz_Sperrstrecke_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Vz_Sperrstrecke_AttributeGroup {
	/**
	 * The cached value of the '{@link #getVzSperrstreckeVorgeschaltet() <em>Vz Sperrstrecke Vorgeschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVzSperrstreckeVorgeschaltet()
	 * @generated
	 * @ordered
	 */
	protected Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup vzSperrstreckeVorgeschaltet;

	/**
	 * The cached value of the '{@link #getSperrstrecke() <em>Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSperrstrecke()
	 * @generated
	 * @ordered
	 */
	protected Sperrstrecke_TypeClass sperrstrecke;

	/**
	 * The cached value of the '{@link #getSperrstreckeFussgaenger() <em>Sperrstrecke Fussgaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSperrstreckeFussgaenger()
	 * @generated
	 * @ordered
	 */
	protected Sperrstrecke_Fussgaenger_TypeClass sperrstreckeFussgaenger;

	/**
	 * The cached value of the '{@link #getVzSperrstreckeSchranke() <em>Vz Sperrstrecke Schranke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVzSperrstreckeSchranke()
	 * @generated
	 * @ordered
	 */
	protected Vz_Sperrstrecke_Schranke_AttributeGroup vzSperrstreckeSchranke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vz_Sperrstrecke_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup getVzSperrstreckeVorgeschaltet() {
		return vzSperrstreckeVorgeschaltet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVzSperrstreckeVorgeschaltet(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup newVzSperrstreckeVorgeschaltet, NotificationChain msgs) {
		Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup oldVzSperrstreckeVorgeschaltet = vzSperrstreckeVorgeschaltet;
		vzSperrstreckeVorgeschaltet = newVzSperrstreckeVorgeschaltet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET, oldVzSperrstreckeVorgeschaltet, newVzSperrstreckeVorgeschaltet);
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
	public void setVzSperrstreckeVorgeschaltet(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup newVzSperrstreckeVorgeschaltet) {
		if (newVzSperrstreckeVorgeschaltet != vzSperrstreckeVorgeschaltet) {
			NotificationChain msgs = null;
			if (vzSperrstreckeVorgeschaltet != null)
				msgs = ((InternalEObject)vzSperrstreckeVorgeschaltet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET, null, msgs);
			if (newVzSperrstreckeVorgeschaltet != null)
				msgs = ((InternalEObject)newVzSperrstreckeVorgeschaltet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET, null, msgs);
			msgs = basicSetVzSperrstreckeVorgeschaltet(newVzSperrstreckeVorgeschaltet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET, newVzSperrstreckeVorgeschaltet, newVzSperrstreckeVorgeschaltet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrstrecke_TypeClass getSperrstrecke() {
		return sperrstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSperrstrecke(Sperrstrecke_TypeClass newSperrstrecke, NotificationChain msgs) {
		Sperrstrecke_TypeClass oldSperrstrecke = sperrstrecke;
		sperrstrecke = newSperrstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE, oldSperrstrecke, newSperrstrecke);
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
	public void setSperrstrecke(Sperrstrecke_TypeClass newSperrstrecke) {
		if (newSperrstrecke != sperrstrecke) {
			NotificationChain msgs = null;
			if (sperrstrecke != null)
				msgs = ((InternalEObject)sperrstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE, null, msgs);
			if (newSperrstrecke != null)
				msgs = ((InternalEObject)newSperrstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE, null, msgs);
			msgs = basicSetSperrstrecke(newSperrstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE, newSperrstrecke, newSperrstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrstrecke_Fussgaenger_TypeClass getSperrstreckeFussgaenger() {
		return sperrstreckeFussgaenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSperrstreckeFussgaenger(Sperrstrecke_Fussgaenger_TypeClass newSperrstreckeFussgaenger, NotificationChain msgs) {
		Sperrstrecke_Fussgaenger_TypeClass oldSperrstreckeFussgaenger = sperrstreckeFussgaenger;
		sperrstreckeFussgaenger = newSperrstreckeFussgaenger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER, oldSperrstreckeFussgaenger, newSperrstreckeFussgaenger);
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
	public void setSperrstreckeFussgaenger(Sperrstrecke_Fussgaenger_TypeClass newSperrstreckeFussgaenger) {
		if (newSperrstreckeFussgaenger != sperrstreckeFussgaenger) {
			NotificationChain msgs = null;
			if (sperrstreckeFussgaenger != null)
				msgs = ((InternalEObject)sperrstreckeFussgaenger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER, null, msgs);
			if (newSperrstreckeFussgaenger != null)
				msgs = ((InternalEObject)newSperrstreckeFussgaenger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER, null, msgs);
			msgs = basicSetSperrstreckeFussgaenger(newSperrstreckeFussgaenger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER, newSperrstreckeFussgaenger, newSperrstreckeFussgaenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_Schranke_AttributeGroup getVzSperrstreckeSchranke() {
		return vzSperrstreckeSchranke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVzSperrstreckeSchranke(Vz_Sperrstrecke_Schranke_AttributeGroup newVzSperrstreckeSchranke, NotificationChain msgs) {
		Vz_Sperrstrecke_Schranke_AttributeGroup oldVzSperrstreckeSchranke = vzSperrstreckeSchranke;
		vzSperrstreckeSchranke = newVzSperrstreckeSchranke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE, oldVzSperrstreckeSchranke, newVzSperrstreckeSchranke);
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
	public void setVzSperrstreckeSchranke(Vz_Sperrstrecke_Schranke_AttributeGroup newVzSperrstreckeSchranke) {
		if (newVzSperrstreckeSchranke != vzSperrstreckeSchranke) {
			NotificationChain msgs = null;
			if (vzSperrstreckeSchranke != null)
				msgs = ((InternalEObject)vzSperrstreckeSchranke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE, null, msgs);
			if (newVzSperrstreckeSchranke != null)
				msgs = ((InternalEObject)newVzSperrstreckeSchranke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE, null, msgs);
			msgs = basicSetVzSperrstreckeSchranke(newVzSperrstreckeSchranke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE, newVzSperrstreckeSchranke, newVzSperrstreckeSchranke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET:
				return basicSetVzSperrstreckeVorgeschaltet(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE:
				return basicSetSperrstrecke(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER:
				return basicSetSperrstreckeFussgaenger(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE:
				return basicSetVzSperrstreckeSchranke(null, msgs);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET:
				return getVzSperrstreckeVorgeschaltet();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE:
				return getSperrstrecke();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER:
				return getSperrstreckeFussgaenger();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE:
				return getVzSperrstreckeSchranke();
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET:
				setVzSperrstreckeVorgeschaltet((Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE:
				setSperrstrecke((Sperrstrecke_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER:
				setSperrstreckeFussgaenger((Sperrstrecke_Fussgaenger_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE:
				setVzSperrstreckeSchranke((Vz_Sperrstrecke_Schranke_AttributeGroup)newValue);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET:
				setVzSperrstreckeVorgeschaltet((Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE:
				setSperrstrecke((Sperrstrecke_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER:
				setSperrstreckeFussgaenger((Sperrstrecke_Fussgaenger_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE:
				setVzSperrstreckeSchranke((Vz_Sperrstrecke_Schranke_AttributeGroup)null);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_VORGESCHALTET:
				return vzSperrstreckeVorgeschaltet != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE:
				return sperrstrecke != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__SPERRSTRECKE_FUSSGAENGER:
				return sperrstreckeFussgaenger != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP__VZ_SPERRSTRECKE_SCHRANKE:
				return vzSperrstreckeSchranke != null;
		}
		return super.eIsSet(featureID);
	}

} //Vz_Sperrstrecke_AttributeGroupImpl
