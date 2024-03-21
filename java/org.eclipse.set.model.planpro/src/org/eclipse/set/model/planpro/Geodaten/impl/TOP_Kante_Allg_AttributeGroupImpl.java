/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Kantenname_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.TOP_Anschluss_A_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.TOP_Anschluss_B_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.TOP_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Geodaten.TOP_Laenge_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl#getKantenname <em>Kantenname</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl#getTOPAnschlussA <em>TOP Anschluss A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl#getTOPAnschlussB <em>TOP Anschluss B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_Kante_Allg_AttributeGroupImpl#getTOPLaenge <em>TOP Laenge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOP_Kante_Allg_AttributeGroupImpl extends EObjectImpl implements TOP_Kante_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getKantenname() <em>Kantenname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKantenname()
	 * @generated
	 * @ordered
	 */
	protected Kantenname_TypeClass kantenname;

	/**
	 * The cached value of the '{@link #getTOPAnschlussA() <em>TOP Anschluss A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPAnschlussA()
	 * @generated
	 * @ordered
	 */
	protected TOP_Anschluss_A_TypeClass tOPAnschlussA;

	/**
	 * The cached value of the '{@link #getTOPAnschlussB() <em>TOP Anschluss B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPAnschlussB()
	 * @generated
	 * @ordered
	 */
	protected TOP_Anschluss_B_TypeClass tOPAnschlussB;

	/**
	 * The cached value of the '{@link #getTOPLaenge() <em>TOP Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPLaenge()
	 * @generated
	 * @ordered
	 */
	protected TOP_Laenge_TypeClass tOPLaenge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOP_Kante_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TOP_KANTE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kantenname_TypeClass getKantenname() {
		return kantenname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKantenname(Kantenname_TypeClass newKantenname, NotificationChain msgs) {
		Kantenname_TypeClass oldKantenname = kantenname;
		kantenname = newKantenname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME, oldKantenname, newKantenname);
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
	public void setKantenname(Kantenname_TypeClass newKantenname) {
		if (newKantenname != kantenname) {
			NotificationChain msgs = null;
			if (kantenname != null)
				msgs = ((InternalEObject)kantenname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME, null, msgs);
			if (newKantenname != null)
				msgs = ((InternalEObject)newKantenname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME, null, msgs);
			msgs = basicSetKantenname(newKantenname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME, newKantenname, newKantenname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Anschluss_A_TypeClass getTOPAnschlussA() {
		return tOPAnschlussA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOPAnschlussA(TOP_Anschluss_A_TypeClass newTOPAnschlussA, NotificationChain msgs) {
		TOP_Anschluss_A_TypeClass oldTOPAnschlussA = tOPAnschlussA;
		tOPAnschlussA = newTOPAnschlussA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A, oldTOPAnschlussA, newTOPAnschlussA);
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
	public void setTOPAnschlussA(TOP_Anschluss_A_TypeClass newTOPAnschlussA) {
		if (newTOPAnschlussA != tOPAnschlussA) {
			NotificationChain msgs = null;
			if (tOPAnschlussA != null)
				msgs = ((InternalEObject)tOPAnschlussA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A, null, msgs);
			if (newTOPAnschlussA != null)
				msgs = ((InternalEObject)newTOPAnschlussA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A, null, msgs);
			msgs = basicSetTOPAnschlussA(newTOPAnschlussA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A, newTOPAnschlussA, newTOPAnschlussA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Anschluss_B_TypeClass getTOPAnschlussB() {
		return tOPAnschlussB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOPAnschlussB(TOP_Anschluss_B_TypeClass newTOPAnschlussB, NotificationChain msgs) {
		TOP_Anschluss_B_TypeClass oldTOPAnschlussB = tOPAnschlussB;
		tOPAnschlussB = newTOPAnschlussB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B, oldTOPAnschlussB, newTOPAnschlussB);
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
	public void setTOPAnschlussB(TOP_Anschluss_B_TypeClass newTOPAnschlussB) {
		if (newTOPAnschlussB != tOPAnschlussB) {
			NotificationChain msgs = null;
			if (tOPAnschlussB != null)
				msgs = ((InternalEObject)tOPAnschlussB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B, null, msgs);
			if (newTOPAnschlussB != null)
				msgs = ((InternalEObject)newTOPAnschlussB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B, null, msgs);
			msgs = basicSetTOPAnschlussB(newTOPAnschlussB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B, newTOPAnschlussB, newTOPAnschlussB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Laenge_TypeClass getTOPLaenge() {
		return tOPLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOPLaenge(TOP_Laenge_TypeClass newTOPLaenge, NotificationChain msgs) {
		TOP_Laenge_TypeClass oldTOPLaenge = tOPLaenge;
		tOPLaenge = newTOPLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE, oldTOPLaenge, newTOPLaenge);
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
	public void setTOPLaenge(TOP_Laenge_TypeClass newTOPLaenge) {
		if (newTOPLaenge != tOPLaenge) {
			NotificationChain msgs = null;
			if (tOPLaenge != null)
				msgs = ((InternalEObject)tOPLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE, null, msgs);
			if (newTOPLaenge != null)
				msgs = ((InternalEObject)newTOPLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE, null, msgs);
			msgs = basicSetTOPLaenge(newTOPLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE, newTOPLaenge, newTOPLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME:
				return basicSetKantenname(null, msgs);
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A:
				return basicSetTOPAnschlussA(null, msgs);
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B:
				return basicSetTOPAnschlussB(null, msgs);
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE:
				return basicSetTOPLaenge(null, msgs);
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
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME:
				return getKantenname();
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A:
				return getTOPAnschlussA();
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B:
				return getTOPAnschlussB();
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE:
				return getTOPLaenge();
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
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME:
				setKantenname((Kantenname_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A:
				setTOPAnschlussA((TOP_Anschluss_A_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B:
				setTOPAnschlussB((TOP_Anschluss_B_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE:
				setTOPLaenge((TOP_Laenge_TypeClass)newValue);
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
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME:
				setKantenname((Kantenname_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A:
				setTOPAnschlussA((TOP_Anschluss_A_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B:
				setTOPAnschlussB((TOP_Anschluss_B_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE:
				setTOPLaenge((TOP_Laenge_TypeClass)null);
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
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME:
				return kantenname != null;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A:
				return tOPAnschlussA != null;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B:
				return tOPAnschlussB != null;
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE:
				return tOPLaenge != null;
		}
		return super.eIsSet(featureID);
	}

} //TOP_Kante_Allg_AttributeGroupImpl
