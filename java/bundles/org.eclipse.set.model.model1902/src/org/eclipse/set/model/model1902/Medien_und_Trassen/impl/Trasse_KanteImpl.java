/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Kante;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Kante_Art_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Nutzer_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_Trasse_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trasse Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Trasse_KanteImpl#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Trasse_KanteImpl#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Trasse_KanteImpl#getTrasseKanteArt <em>Trasse Kante Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Trasse_KanteImpl#getTrasseNutzer <em>Trasse Nutzer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trasse_KanteImpl extends Basis_ObjektImpl implements Trasse_Kante {
	/**
	 * The cached value of the '{@link #getIDTrasseKnotenA() <em>ID Trasse Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTrasseKnotenA()
	 * @generated
	 * @ordered
	 */
	protected ID_Trasse_Knoten_TypeClass iDTrasseKnotenA;

	/**
	 * The cached value of the '{@link #getIDTrasseKnotenB() <em>ID Trasse Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTrasseKnotenB()
	 * @generated
	 * @ordered
	 */
	protected ID_Trasse_Knoten_TypeClass iDTrasseKnotenB;

	/**
	 * The cached value of the '{@link #getTrasseKanteArt() <em>Trasse Kante Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseKanteArt()
	 * @generated
	 * @ordered
	 */
	protected Trasse_Kante_Art_TypeClass trasseKanteArt;

	/**
	 * The cached value of the '{@link #getTrasseNutzer() <em>Trasse Nutzer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseNutzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Trasse_Nutzer_TypeClass> trasseNutzer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trasse_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.TRASSE_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Trasse_Knoten_TypeClass getIDTrasseKnotenA() {
		return iDTrasseKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDTrasseKnotenA(ID_Trasse_Knoten_TypeClass newIDTrasseKnotenA, NotificationChain msgs) {
		ID_Trasse_Knoten_TypeClass oldIDTrasseKnotenA = iDTrasseKnotenA;
		iDTrasseKnotenA = newIDTrasseKnotenA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A, oldIDTrasseKnotenA, newIDTrasseKnotenA);
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
	public void setIDTrasseKnotenA(ID_Trasse_Knoten_TypeClass newIDTrasseKnotenA) {
		if (newIDTrasseKnotenA != iDTrasseKnotenA) {
			NotificationChain msgs = null;
			if (iDTrasseKnotenA != null)
				msgs = ((InternalEObject)iDTrasseKnotenA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A, null, msgs);
			if (newIDTrasseKnotenA != null)
				msgs = ((InternalEObject)newIDTrasseKnotenA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A, null, msgs);
			msgs = basicSetIDTrasseKnotenA(newIDTrasseKnotenA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A, newIDTrasseKnotenA, newIDTrasseKnotenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Trasse_Knoten_TypeClass getIDTrasseKnotenB() {
		return iDTrasseKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDTrasseKnotenB(ID_Trasse_Knoten_TypeClass newIDTrasseKnotenB, NotificationChain msgs) {
		ID_Trasse_Knoten_TypeClass oldIDTrasseKnotenB = iDTrasseKnotenB;
		iDTrasseKnotenB = newIDTrasseKnotenB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B, oldIDTrasseKnotenB, newIDTrasseKnotenB);
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
	public void setIDTrasseKnotenB(ID_Trasse_Knoten_TypeClass newIDTrasseKnotenB) {
		if (newIDTrasseKnotenB != iDTrasseKnotenB) {
			NotificationChain msgs = null;
			if (iDTrasseKnotenB != null)
				msgs = ((InternalEObject)iDTrasseKnotenB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B, null, msgs);
			if (newIDTrasseKnotenB != null)
				msgs = ((InternalEObject)newIDTrasseKnotenB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B, null, msgs);
			msgs = basicSetIDTrasseKnotenB(newIDTrasseKnotenB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B, newIDTrasseKnotenB, newIDTrasseKnotenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Kante_Art_TypeClass getTrasseKanteArt() {
		return trasseKanteArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrasseKanteArt(Trasse_Kante_Art_TypeClass newTrasseKanteArt, NotificationChain msgs) {
		Trasse_Kante_Art_TypeClass oldTrasseKanteArt = trasseKanteArt;
		trasseKanteArt = newTrasseKanteArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART, oldTrasseKanteArt, newTrasseKanteArt);
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
	public void setTrasseKanteArt(Trasse_Kante_Art_TypeClass newTrasseKanteArt) {
		if (newTrasseKanteArt != trasseKanteArt) {
			NotificationChain msgs = null;
			if (trasseKanteArt != null)
				msgs = ((InternalEObject)trasseKanteArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART, null, msgs);
			if (newTrasseKanteArt != null)
				msgs = ((InternalEObject)newTrasseKanteArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART, null, msgs);
			msgs = basicSetTrasseKanteArt(newTrasseKanteArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART, newTrasseKanteArt, newTrasseKanteArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trasse_Nutzer_TypeClass> getTrasseNutzer() {
		if (trasseNutzer == null) {
			trasseNutzer = new EObjectContainmentEList<Trasse_Nutzer_TypeClass>(Trasse_Nutzer_TypeClass.class, this, Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER);
		}
		return trasseNutzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A:
				return basicSetIDTrasseKnotenA(null, msgs);
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B:
				return basicSetIDTrasseKnotenB(null, msgs);
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART:
				return basicSetTrasseKanteArt(null, msgs);
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER:
				return ((InternalEList<?>)getTrasseNutzer()).basicRemove(otherEnd, msgs);
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
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A:
				return getIDTrasseKnotenA();
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B:
				return getIDTrasseKnotenB();
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART:
				return getTrasseKanteArt();
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER:
				return getTrasseNutzer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A:
				setIDTrasseKnotenA((ID_Trasse_Knoten_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B:
				setIDTrasseKnotenB((ID_Trasse_Knoten_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART:
				setTrasseKanteArt((Trasse_Kante_Art_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER:
				getTrasseNutzer().clear();
				getTrasseNutzer().addAll((Collection<? extends Trasse_Nutzer_TypeClass>)newValue);
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
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A:
				setIDTrasseKnotenA((ID_Trasse_Knoten_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B:
				setIDTrasseKnotenB((ID_Trasse_Knoten_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART:
				setTrasseKanteArt((Trasse_Kante_Art_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER:
				getTrasseNutzer().clear();
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
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_A:
				return iDTrasseKnotenA != null;
			case Medien_und_TrassenPackage.TRASSE_KANTE__ID_TRASSE_KNOTEN_B:
				return iDTrasseKnotenB != null;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_KANTE_ART:
				return trasseKanteArt != null;
			case Medien_und_TrassenPackage.TRASSE_KANTE__TRASSE_NUTZER:
				return trasseNutzer != null && !trasseNutzer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Trasse_KanteImpl
