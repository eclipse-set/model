/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.Strecke_Abschnitt_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Strecke_Km_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Strecke_Nummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung GFuehrende Strecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Fuehrende_Strecke_AttributeGroupImpl#getStreckeAbschnitt <em>Strecke Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Fuehrende_Strecke_AttributeGroupImpl#getStreckeKm <em>Strecke Km</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_G_Fuehrende_Strecke_AttributeGroupImpl#getStreckeNummer <em>Strecke Nummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_G_Fuehrende_Strecke_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Planung_G_Fuehrende_Strecke_AttributeGroup {
	/**
	 * The cached value of the '{@link #getStreckeAbschnitt() <em>Strecke Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Abschnitt_TypeClass streckeAbschnitt;

	/**
	 * The cached value of the '{@link #getStreckeKm() <em>Strecke Km</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeKm()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Km_TypeClass streckeKm;

	/**
	 * The cached value of the '{@link #getStreckeNummer() <em>Strecke Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeNummer()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Nummer_TypeClass streckeNummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_G_Fuehrende_Strecke_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_G_Fuehrende_Strecke_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Abschnitt_TypeClass getStreckeAbschnitt() {
		return streckeAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeAbschnitt(Strecke_Abschnitt_TypeClass newStreckeAbschnitt, NotificationChain msgs) {
		Strecke_Abschnitt_TypeClass oldStreckeAbschnitt = streckeAbschnitt;
		streckeAbschnitt = newStreckeAbschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT, oldStreckeAbschnitt, newStreckeAbschnitt);
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
	public void setStreckeAbschnitt(Strecke_Abschnitt_TypeClass newStreckeAbschnitt) {
		if (newStreckeAbschnitt != streckeAbschnitt) {
			NotificationChain msgs = null;
			if (streckeAbschnitt != null)
				msgs = ((InternalEObject)streckeAbschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT, null, msgs);
			if (newStreckeAbschnitt != null)
				msgs = ((InternalEObject)newStreckeAbschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT, null, msgs);
			msgs = basicSetStreckeAbschnitt(newStreckeAbschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT, newStreckeAbschnitt, newStreckeAbschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Km_TypeClass getStreckeKm() {
		return streckeKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeKm(Strecke_Km_TypeClass newStreckeKm, NotificationChain msgs) {
		Strecke_Km_TypeClass oldStreckeKm = streckeKm;
		streckeKm = newStreckeKm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, oldStreckeKm, newStreckeKm);
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
	public void setStreckeKm(Strecke_Km_TypeClass newStreckeKm) {
		if (newStreckeKm != streckeKm) {
			NotificationChain msgs = null;
			if (streckeKm != null)
				msgs = ((InternalEObject)streckeKm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, null, msgs);
			if (newStreckeKm != null)
				msgs = ((InternalEObject)newStreckeKm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, null, msgs);
			msgs = basicSetStreckeKm(newStreckeKm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, newStreckeKm, newStreckeKm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Nummer_TypeClass getStreckeNummer() {
		return streckeNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeNummer(Strecke_Nummer_TypeClass newStreckeNummer, NotificationChain msgs) {
		Strecke_Nummer_TypeClass oldStreckeNummer = streckeNummer;
		streckeNummer = newStreckeNummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER, oldStreckeNummer, newStreckeNummer);
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
	public void setStreckeNummer(Strecke_Nummer_TypeClass newStreckeNummer) {
		if (newStreckeNummer != streckeNummer) {
			NotificationChain msgs = null;
			if (streckeNummer != null)
				msgs = ((InternalEObject)streckeNummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER, null, msgs);
			if (newStreckeNummer != null)
				msgs = ((InternalEObject)newStreckeNummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER, null, msgs);
			msgs = basicSetStreckeNummer(newStreckeNummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER, newStreckeNummer, newStreckeNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT:
				return basicSetStreckeAbschnitt(null, msgs);
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return basicSetStreckeKm(null, msgs);
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER:
				return basicSetStreckeNummer(null, msgs);
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
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT:
				return getStreckeAbschnitt();
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return getStreckeKm();
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER:
				return getStreckeNummer();
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
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT:
				setStreckeAbschnitt((Strecke_Abschnitt_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				setStreckeKm((Strecke_Km_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER:
				setStreckeNummer((Strecke_Nummer_TypeClass)newValue);
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
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT:
				setStreckeAbschnitt((Strecke_Abschnitt_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				setStreckeKm((Strecke_Km_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER:
				setStreckeNummer((Strecke_Nummer_TypeClass)null);
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
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_ABSCHNITT:
				return streckeAbschnitt != null;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return streckeKm != null;
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP__STRECKE_NUMMER:
				return streckeNummer != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_G_Fuehrende_Strecke_AttributeGroupImpl
