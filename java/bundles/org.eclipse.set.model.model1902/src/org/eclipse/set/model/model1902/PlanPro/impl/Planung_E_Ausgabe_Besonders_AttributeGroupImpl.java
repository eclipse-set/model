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
import org.eclipse.set.model.model1902.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.Referenz_Vergleich_Besonders_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Vergleich_Ausgabestand_Basis_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Vergleichstyp_Besonders_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung EAusgabe Besonders Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Ausgabe_Besonders_AttributeGroupImpl#getReferenzVergleichBesonders <em>Referenz Vergleich Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Ausgabe_Besonders_AttributeGroupImpl#getVergleichAusgabestandBasis <em>Vergleich Ausgabestand Basis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Planung_E_Ausgabe_Besonders_AttributeGroupImpl#getVergleichstypBesonders <em>Vergleichstyp Besonders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_E_Ausgabe_Besonders_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Planung_E_Ausgabe_Besonders_AttributeGroup {
	/**
	 * The cached value of the '{@link #getReferenzVergleichBesonders() <em>Referenz Vergleich Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenzVergleichBesonders()
	 * @generated
	 * @ordered
	 */
	protected Referenz_Vergleich_Besonders_TypeClass referenzVergleichBesonders;

	/**
	 * The cached value of the '{@link #getVergleichAusgabestandBasis() <em>Vergleich Ausgabestand Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVergleichAusgabestandBasis()
	 * @generated
	 * @ordered
	 */
	protected Vergleich_Ausgabestand_Basis_TypeClass vergleichAusgabestandBasis;

	/**
	 * The cached value of the '{@link #getVergleichstypBesonders() <em>Vergleichstyp Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVergleichstypBesonders()
	 * @generated
	 * @ordered
	 */
	protected Vergleichstyp_Besonders_TypeClass vergleichstypBesonders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_E_Ausgabe_Besonders_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_E_Ausgabe_Besonders_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Vergleich_Besonders_TypeClass getReferenzVergleichBesonders() {
		return referenzVergleichBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenzVergleichBesonders(Referenz_Vergleich_Besonders_TypeClass newReferenzVergleichBesonders, NotificationChain msgs) {
		Referenz_Vergleich_Besonders_TypeClass oldReferenzVergleichBesonders = referenzVergleichBesonders;
		referenzVergleichBesonders = newReferenzVergleichBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS, oldReferenzVergleichBesonders, newReferenzVergleichBesonders);
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
	public void setReferenzVergleichBesonders(Referenz_Vergleich_Besonders_TypeClass newReferenzVergleichBesonders) {
		if (newReferenzVergleichBesonders != referenzVergleichBesonders) {
			NotificationChain msgs = null;
			if (referenzVergleichBesonders != null)
				msgs = ((InternalEObject)referenzVergleichBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS, null, msgs);
			if (newReferenzVergleichBesonders != null)
				msgs = ((InternalEObject)newReferenzVergleichBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS, null, msgs);
			msgs = basicSetReferenzVergleichBesonders(newReferenzVergleichBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS, newReferenzVergleichBesonders, newReferenzVergleichBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vergleich_Ausgabestand_Basis_TypeClass getVergleichAusgabestandBasis() {
		return vergleichAusgabestandBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVergleichAusgabestandBasis(Vergleich_Ausgabestand_Basis_TypeClass newVergleichAusgabestandBasis, NotificationChain msgs) {
		Vergleich_Ausgabestand_Basis_TypeClass oldVergleichAusgabestandBasis = vergleichAusgabestandBasis;
		vergleichAusgabestandBasis = newVergleichAusgabestandBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS, oldVergleichAusgabestandBasis, newVergleichAusgabestandBasis);
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
	public void setVergleichAusgabestandBasis(Vergleich_Ausgabestand_Basis_TypeClass newVergleichAusgabestandBasis) {
		if (newVergleichAusgabestandBasis != vergleichAusgabestandBasis) {
			NotificationChain msgs = null;
			if (vergleichAusgabestandBasis != null)
				msgs = ((InternalEObject)vergleichAusgabestandBasis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS, null, msgs);
			if (newVergleichAusgabestandBasis != null)
				msgs = ((InternalEObject)newVergleichAusgabestandBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS, null, msgs);
			msgs = basicSetVergleichAusgabestandBasis(newVergleichAusgabestandBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS, newVergleichAusgabestandBasis, newVergleichAusgabestandBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vergleichstyp_Besonders_TypeClass getVergleichstypBesonders() {
		return vergleichstypBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVergleichstypBesonders(Vergleichstyp_Besonders_TypeClass newVergleichstypBesonders, NotificationChain msgs) {
		Vergleichstyp_Besonders_TypeClass oldVergleichstypBesonders = vergleichstypBesonders;
		vergleichstypBesonders = newVergleichstypBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS, oldVergleichstypBesonders, newVergleichstypBesonders);
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
	public void setVergleichstypBesonders(Vergleichstyp_Besonders_TypeClass newVergleichstypBesonders) {
		if (newVergleichstypBesonders != vergleichstypBesonders) {
			NotificationChain msgs = null;
			if (vergleichstypBesonders != null)
				msgs = ((InternalEObject)vergleichstypBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS, null, msgs);
			if (newVergleichstypBesonders != null)
				msgs = ((InternalEObject)newVergleichstypBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS, null, msgs);
			msgs = basicSetVergleichstypBesonders(newVergleichstypBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS, newVergleichstypBesonders, newVergleichstypBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS:
				return basicSetReferenzVergleichBesonders(null, msgs);
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS:
				return basicSetVergleichAusgabestandBasis(null, msgs);
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS:
				return basicSetVergleichstypBesonders(null, msgs);
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
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS:
				return getReferenzVergleichBesonders();
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS:
				return getVergleichAusgabestandBasis();
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS:
				return getVergleichstypBesonders();
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
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS:
				setReferenzVergleichBesonders((Referenz_Vergleich_Besonders_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS:
				setVergleichAusgabestandBasis((Vergleich_Ausgabestand_Basis_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS:
				setVergleichstypBesonders((Vergleichstyp_Besonders_TypeClass)newValue);
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
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS:
				setReferenzVergleichBesonders((Referenz_Vergleich_Besonders_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS:
				setVergleichAusgabestandBasis((Vergleich_Ausgabestand_Basis_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS:
				setVergleichstypBesonders((Vergleichstyp_Besonders_TypeClass)null);
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
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__REFERENZ_VERGLEICH_BESONDERS:
				return referenzVergleichBesonders != null;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICH_AUSGABESTAND_BASIS:
				return vergleichAusgabestandBasis != null;
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP__VERGLEICHSTYP_BESONDERS:
				return vergleichstypBesonders != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_E_Ausgabe_Besonders_AttributeGroupImpl
