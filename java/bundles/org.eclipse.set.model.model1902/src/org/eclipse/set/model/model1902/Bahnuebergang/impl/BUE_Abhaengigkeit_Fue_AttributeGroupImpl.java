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

import org.eclipse.set.model.model1902.Bahnuebergang.Auto_Het_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Fue_Schaltfall_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Haltfall_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Abhaengigkeit Fue Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl#getAutoHet <em>Auto Het</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl#getFueSchaltfall <em>Fue Schaltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl#getStoerhaltHaltfall <em>Stoerhalt Haltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl#getStoerhaltMerkhinweis <em>Stoerhalt Merkhinweis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Abhaengigkeit_Fue_AttributeGroupImpl#getZeitueberschreitungsmeldung <em>Zeitueberschreitungsmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Abhaengigkeit_Fue_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Abhaengigkeit_Fue_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutoHet() <em>Auto Het</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoHet()
	 * @generated
	 * @ordered
	 */
	protected Auto_Het_TypeClass autoHet;

	/**
	 * The cached value of the '{@link #getFueSchaltfall() <em>Fue Schaltfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFueSchaltfall()
	 * @generated
	 * @ordered
	 */
	protected Fue_Schaltfall_TypeClass fueSchaltfall;

	/**
	 * The cached value of the '{@link #getStoerhaltHaltfall() <em>Stoerhalt Haltfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoerhaltHaltfall()
	 * @generated
	 * @ordered
	 */
	protected Stoerhalt_Haltfall_TypeClass stoerhaltHaltfall;

	/**
	 * The cached value of the '{@link #getStoerhaltMerkhinweis() <em>Stoerhalt Merkhinweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoerhaltMerkhinweis()
	 * @generated
	 * @ordered
	 */
	protected Stoerhalt_Merkhinweis_TypeClass stoerhaltMerkhinweis;

	/**
	 * The cached value of the '{@link #getZeitueberschreitungsmeldung() <em>Zeitueberschreitungsmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitueberschreitungsmeldung()
	 * @generated
	 * @ordered
	 */
	protected Zeitueberschreitungsmeldung_TypeClass zeitueberschreitungsmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Abhaengigkeit_Fue_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Abhaengigkeit_Fue_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Het_TypeClass getAutoHet() {
		return autoHet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoHet(Auto_Het_TypeClass newAutoHet, NotificationChain msgs) {
		Auto_Het_TypeClass oldAutoHet = autoHet;
		autoHet = newAutoHet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET, oldAutoHet, newAutoHet);
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
	public void setAutoHet(Auto_Het_TypeClass newAutoHet) {
		if (newAutoHet != autoHet) {
			NotificationChain msgs = null;
			if (autoHet != null)
				msgs = ((InternalEObject)autoHet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET, null, msgs);
			if (newAutoHet != null)
				msgs = ((InternalEObject)newAutoHet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET, null, msgs);
			msgs = basicSetAutoHet(newAutoHet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET, newAutoHet, newAutoHet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fue_Schaltfall_TypeClass getFueSchaltfall() {
		return fueSchaltfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFueSchaltfall(Fue_Schaltfall_TypeClass newFueSchaltfall, NotificationChain msgs) {
		Fue_Schaltfall_TypeClass oldFueSchaltfall = fueSchaltfall;
		fueSchaltfall = newFueSchaltfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL, oldFueSchaltfall, newFueSchaltfall);
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
	public void setFueSchaltfall(Fue_Schaltfall_TypeClass newFueSchaltfall) {
		if (newFueSchaltfall != fueSchaltfall) {
			NotificationChain msgs = null;
			if (fueSchaltfall != null)
				msgs = ((InternalEObject)fueSchaltfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL, null, msgs);
			if (newFueSchaltfall != null)
				msgs = ((InternalEObject)newFueSchaltfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL, null, msgs);
			msgs = basicSetFueSchaltfall(newFueSchaltfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL, newFueSchaltfall, newFueSchaltfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stoerhalt_Haltfall_TypeClass getStoerhaltHaltfall() {
		return stoerhaltHaltfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoerhaltHaltfall(Stoerhalt_Haltfall_TypeClass newStoerhaltHaltfall, NotificationChain msgs) {
		Stoerhalt_Haltfall_TypeClass oldStoerhaltHaltfall = stoerhaltHaltfall;
		stoerhaltHaltfall = newStoerhaltHaltfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL, oldStoerhaltHaltfall, newStoerhaltHaltfall);
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
	public void setStoerhaltHaltfall(Stoerhalt_Haltfall_TypeClass newStoerhaltHaltfall) {
		if (newStoerhaltHaltfall != stoerhaltHaltfall) {
			NotificationChain msgs = null;
			if (stoerhaltHaltfall != null)
				msgs = ((InternalEObject)stoerhaltHaltfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL, null, msgs);
			if (newStoerhaltHaltfall != null)
				msgs = ((InternalEObject)newStoerhaltHaltfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL, null, msgs);
			msgs = basicSetStoerhaltHaltfall(newStoerhaltHaltfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL, newStoerhaltHaltfall, newStoerhaltHaltfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stoerhalt_Merkhinweis_TypeClass getStoerhaltMerkhinweis() {
		return stoerhaltMerkhinweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoerhaltMerkhinweis(Stoerhalt_Merkhinweis_TypeClass newStoerhaltMerkhinweis, NotificationChain msgs) {
		Stoerhalt_Merkhinweis_TypeClass oldStoerhaltMerkhinweis = stoerhaltMerkhinweis;
		stoerhaltMerkhinweis = newStoerhaltMerkhinweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS, oldStoerhaltMerkhinweis, newStoerhaltMerkhinweis);
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
	public void setStoerhaltMerkhinweis(Stoerhalt_Merkhinweis_TypeClass newStoerhaltMerkhinweis) {
		if (newStoerhaltMerkhinweis != stoerhaltMerkhinweis) {
			NotificationChain msgs = null;
			if (stoerhaltMerkhinweis != null)
				msgs = ((InternalEObject)stoerhaltMerkhinweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS, null, msgs);
			if (newStoerhaltMerkhinweis != null)
				msgs = ((InternalEObject)newStoerhaltMerkhinweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS, null, msgs);
			msgs = basicSetStoerhaltMerkhinweis(newStoerhaltMerkhinweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS, newStoerhaltMerkhinweis, newStoerhaltMerkhinweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeitueberschreitungsmeldung_TypeClass getZeitueberschreitungsmeldung() {
		return zeitueberschreitungsmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitueberschreitungsmeldung(Zeitueberschreitungsmeldung_TypeClass newZeitueberschreitungsmeldung, NotificationChain msgs) {
		Zeitueberschreitungsmeldung_TypeClass oldZeitueberschreitungsmeldung = zeitueberschreitungsmeldung;
		zeitueberschreitungsmeldung = newZeitueberschreitungsmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG, oldZeitueberschreitungsmeldung, newZeitueberschreitungsmeldung);
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
	public void setZeitueberschreitungsmeldung(Zeitueberschreitungsmeldung_TypeClass newZeitueberschreitungsmeldung) {
		if (newZeitueberschreitungsmeldung != zeitueberschreitungsmeldung) {
			NotificationChain msgs = null;
			if (zeitueberschreitungsmeldung != null)
				msgs = ((InternalEObject)zeitueberschreitungsmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG, null, msgs);
			if (newZeitueberschreitungsmeldung != null)
				msgs = ((InternalEObject)newZeitueberschreitungsmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG, null, msgs);
			msgs = basicSetZeitueberschreitungsmeldung(newZeitueberschreitungsmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG, newZeitueberschreitungsmeldung, newZeitueberschreitungsmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET:
				return basicSetAutoHet(null, msgs);
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL:
				return basicSetFueSchaltfall(null, msgs);
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL:
				return basicSetStoerhaltHaltfall(null, msgs);
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS:
				return basicSetStoerhaltMerkhinweis(null, msgs);
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG:
				return basicSetZeitueberschreitungsmeldung(null, msgs);
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
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET:
				return getAutoHet();
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL:
				return getFueSchaltfall();
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL:
				return getStoerhaltHaltfall();
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS:
				return getStoerhaltMerkhinweis();
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG:
				return getZeitueberschreitungsmeldung();
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
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET:
				setAutoHet((Auto_Het_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL:
				setFueSchaltfall((Fue_Schaltfall_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL:
				setStoerhaltHaltfall((Stoerhalt_Haltfall_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS:
				setStoerhaltMerkhinweis((Stoerhalt_Merkhinweis_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG:
				setZeitueberschreitungsmeldung((Zeitueberschreitungsmeldung_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET:
				setAutoHet((Auto_Het_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL:
				setFueSchaltfall((Fue_Schaltfall_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL:
				setStoerhaltHaltfall((Stoerhalt_Haltfall_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS:
				setStoerhaltMerkhinweis((Stoerhalt_Merkhinweis_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG:
				setZeitueberschreitungsmeldung((Zeitueberschreitungsmeldung_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__AUTO_HET:
				return autoHet != null;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__FUE_SCHALTFALL:
				return fueSchaltfall != null;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_HALTFALL:
				return stoerhaltHaltfall != null;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__STOERHALT_MERKHINWEIS:
				return stoerhaltMerkhinweis != null;
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP__ZEITUEBERSCHREITUNGSMELDUNG:
				return zeitueberschreitungsmeldung != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Abhaengigkeit_Fue_AttributeGroupImpl
