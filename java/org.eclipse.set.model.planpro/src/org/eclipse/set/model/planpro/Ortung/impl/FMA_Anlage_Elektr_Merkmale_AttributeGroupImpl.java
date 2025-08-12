/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ortung.Bettungswiderstand_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_Beeinflusst_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_E1_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_E2_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_E3_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_S_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Laenge_TypeClass;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage Elektr Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getBettungswiderstand <em>Bettungswiderstand</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaenge <em>FMA Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaengeBeeinflusst <em>FMA Laenge Beeinflusst</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaengeE1 <em>FMA Laenge E1</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaengeE2 <em>FMA Laenge E2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaengeE3 <em>FMA Laenge E3</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl#getFMALaengeS <em>FMA Laenge S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl extends EObjectImpl implements FMA_Anlage_Elektr_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBettungswiderstand() <em>Bettungswiderstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBettungswiderstand()
	 * @generated
	 * @ordered
	 */
	protected Bettungswiderstand_TypeClass bettungswiderstand;

	/**
	 * The cached value of the '{@link #getFMALaenge() <em>FMA Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaenge()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_TypeClass fMALaenge;

	/**
	 * The cached value of the '{@link #getFMALaengeBeeinflusst() <em>FMA Laenge Beeinflusst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaengeBeeinflusst()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_Beeinflusst_TypeClass fMALaengeBeeinflusst;

	/**
	 * The cached value of the '{@link #getFMALaengeE1() <em>FMA Laenge E1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaengeE1()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_E1_TypeClass fMALaengeE1;

	/**
	 * The cached value of the '{@link #getFMALaengeE2() <em>FMA Laenge E2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaengeE2()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_E2_TypeClass fMALaengeE2;

	/**
	 * The cached value of the '{@link #getFMALaengeE3() <em>FMA Laenge E3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaengeE3()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_E3_TypeClass fMALaengeE3;

	/**
	 * The cached value of the '{@link #getFMALaengeS() <em>FMA Laenge S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMALaengeS()
	 * @generated
	 * @ordered
	 */
	protected FMA_Laenge_S_TypeClass fMALaengeS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bettungswiderstand_TypeClass getBettungswiderstand() {
		return bettungswiderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBettungswiderstand(Bettungswiderstand_TypeClass newBettungswiderstand, NotificationChain msgs) {
		Bettungswiderstand_TypeClass oldBettungswiderstand = bettungswiderstand;
		bettungswiderstand = newBettungswiderstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND, oldBettungswiderstand, newBettungswiderstand);
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
	public void setBettungswiderstand(Bettungswiderstand_TypeClass newBettungswiderstand) {
		if (newBettungswiderstand != bettungswiderstand) {
			NotificationChain msgs = null;
			if (bettungswiderstand != null)
				msgs = ((InternalEObject)bettungswiderstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND, null, msgs);
			if (newBettungswiderstand != null)
				msgs = ((InternalEObject)newBettungswiderstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND, null, msgs);
			msgs = basicSetBettungswiderstand(newBettungswiderstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND, newBettungswiderstand, newBettungswiderstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_TypeClass getFMALaenge() {
		return fMALaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaenge(FMA_Laenge_TypeClass newFMALaenge, NotificationChain msgs) {
		FMA_Laenge_TypeClass oldFMALaenge = fMALaenge;
		fMALaenge = newFMALaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE, oldFMALaenge, newFMALaenge);
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
	public void setFMALaenge(FMA_Laenge_TypeClass newFMALaenge) {
		if (newFMALaenge != fMALaenge) {
			NotificationChain msgs = null;
			if (fMALaenge != null)
				msgs = ((InternalEObject)fMALaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE, null, msgs);
			if (newFMALaenge != null)
				msgs = ((InternalEObject)newFMALaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE, null, msgs);
			msgs = basicSetFMALaenge(newFMALaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE, newFMALaenge, newFMALaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_Beeinflusst_TypeClass getFMALaengeBeeinflusst() {
		return fMALaengeBeeinflusst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaengeBeeinflusst(FMA_Laenge_Beeinflusst_TypeClass newFMALaengeBeeinflusst, NotificationChain msgs) {
		FMA_Laenge_Beeinflusst_TypeClass oldFMALaengeBeeinflusst = fMALaengeBeeinflusst;
		fMALaengeBeeinflusst = newFMALaengeBeeinflusst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST, oldFMALaengeBeeinflusst, newFMALaengeBeeinflusst);
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
	public void setFMALaengeBeeinflusst(FMA_Laenge_Beeinflusst_TypeClass newFMALaengeBeeinflusst) {
		if (newFMALaengeBeeinflusst != fMALaengeBeeinflusst) {
			NotificationChain msgs = null;
			if (fMALaengeBeeinflusst != null)
				msgs = ((InternalEObject)fMALaengeBeeinflusst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST, null, msgs);
			if (newFMALaengeBeeinflusst != null)
				msgs = ((InternalEObject)newFMALaengeBeeinflusst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST, null, msgs);
			msgs = basicSetFMALaengeBeeinflusst(newFMALaengeBeeinflusst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST, newFMALaengeBeeinflusst, newFMALaengeBeeinflusst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E1_TypeClass getFMALaengeE1() {
		return fMALaengeE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaengeE1(FMA_Laenge_E1_TypeClass newFMALaengeE1, NotificationChain msgs) {
		FMA_Laenge_E1_TypeClass oldFMALaengeE1 = fMALaengeE1;
		fMALaengeE1 = newFMALaengeE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1, oldFMALaengeE1, newFMALaengeE1);
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
	public void setFMALaengeE1(FMA_Laenge_E1_TypeClass newFMALaengeE1) {
		if (newFMALaengeE1 != fMALaengeE1) {
			NotificationChain msgs = null;
			if (fMALaengeE1 != null)
				msgs = ((InternalEObject)fMALaengeE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1, null, msgs);
			if (newFMALaengeE1 != null)
				msgs = ((InternalEObject)newFMALaengeE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1, null, msgs);
			msgs = basicSetFMALaengeE1(newFMALaengeE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1, newFMALaengeE1, newFMALaengeE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E2_TypeClass getFMALaengeE2() {
		return fMALaengeE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaengeE2(FMA_Laenge_E2_TypeClass newFMALaengeE2, NotificationChain msgs) {
		FMA_Laenge_E2_TypeClass oldFMALaengeE2 = fMALaengeE2;
		fMALaengeE2 = newFMALaengeE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2, oldFMALaengeE2, newFMALaengeE2);
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
	public void setFMALaengeE2(FMA_Laenge_E2_TypeClass newFMALaengeE2) {
		if (newFMALaengeE2 != fMALaengeE2) {
			NotificationChain msgs = null;
			if (fMALaengeE2 != null)
				msgs = ((InternalEObject)fMALaengeE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2, null, msgs);
			if (newFMALaengeE2 != null)
				msgs = ((InternalEObject)newFMALaengeE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2, null, msgs);
			msgs = basicSetFMALaengeE2(newFMALaengeE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2, newFMALaengeE2, newFMALaengeE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_E3_TypeClass getFMALaengeE3() {
		return fMALaengeE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaengeE3(FMA_Laenge_E3_TypeClass newFMALaengeE3, NotificationChain msgs) {
		FMA_Laenge_E3_TypeClass oldFMALaengeE3 = fMALaengeE3;
		fMALaengeE3 = newFMALaengeE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3, oldFMALaengeE3, newFMALaengeE3);
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
	public void setFMALaengeE3(FMA_Laenge_E3_TypeClass newFMALaengeE3) {
		if (newFMALaengeE3 != fMALaengeE3) {
			NotificationChain msgs = null;
			if (fMALaengeE3 != null)
				msgs = ((InternalEObject)fMALaengeE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3, null, msgs);
			if (newFMALaengeE3 != null)
				msgs = ((InternalEObject)newFMALaengeE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3, null, msgs);
			msgs = basicSetFMALaengeE3(newFMALaengeE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3, newFMALaengeE3, newFMALaengeE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Laenge_S_TypeClass getFMALaengeS() {
		return fMALaengeS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMALaengeS(FMA_Laenge_S_TypeClass newFMALaengeS, NotificationChain msgs) {
		FMA_Laenge_S_TypeClass oldFMALaengeS = fMALaengeS;
		fMALaengeS = newFMALaengeS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S, oldFMALaengeS, newFMALaengeS);
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
	public void setFMALaengeS(FMA_Laenge_S_TypeClass newFMALaengeS) {
		if (newFMALaengeS != fMALaengeS) {
			NotificationChain msgs = null;
			if (fMALaengeS != null)
				msgs = ((InternalEObject)fMALaengeS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S, null, msgs);
			if (newFMALaengeS != null)
				msgs = ((InternalEObject)newFMALaengeS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S, null, msgs);
			msgs = basicSetFMALaengeS(newFMALaengeS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S, newFMALaengeS, newFMALaengeS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
				return basicSetBettungswiderstand(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
				return basicSetFMALaenge(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
				return basicSetFMALaengeBeeinflusst(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
				return basicSetFMALaengeE1(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
				return basicSetFMALaengeE2(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
				return basicSetFMALaengeE3(null, msgs);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
				return basicSetFMALaengeS(null, msgs);
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
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
				return getBettungswiderstand();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
				return getFMALaenge();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
				return getFMALaengeBeeinflusst();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
				return getFMALaengeE1();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
				return getFMALaengeE2();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
				return getFMALaengeE3();
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
				return getFMALaengeS();
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
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
				setBettungswiderstand((Bettungswiderstand_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
				setFMALaenge((FMA_Laenge_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
				setFMALaengeBeeinflusst((FMA_Laenge_Beeinflusst_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
				setFMALaengeE1((FMA_Laenge_E1_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
				setFMALaengeE2((FMA_Laenge_E2_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
				setFMALaengeE3((FMA_Laenge_E3_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
				setFMALaengeS((FMA_Laenge_S_TypeClass)newValue);
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
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
				setBettungswiderstand((Bettungswiderstand_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
				setFMALaenge((FMA_Laenge_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
				setFMALaengeBeeinflusst((FMA_Laenge_Beeinflusst_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
				setFMALaengeE1((FMA_Laenge_E1_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
				setFMALaengeE2((FMA_Laenge_E2_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
				setFMALaengeE3((FMA_Laenge_E3_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
				setFMALaengeS((FMA_Laenge_S_TypeClass)null);
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
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND:
				return bettungswiderstand != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE:
				return fMALaenge != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST:
				return fMALaengeBeeinflusst != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1:
				return fMALaengeE1 != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2:
				return fMALaengeE2 != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3:
				return fMALaengeE3 != null;
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S:
				return fMALaengeS != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_Anlage_Elektr_Merkmale_AttributeGroupImpl
