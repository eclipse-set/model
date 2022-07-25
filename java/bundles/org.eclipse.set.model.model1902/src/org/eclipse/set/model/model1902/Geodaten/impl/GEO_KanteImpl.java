/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Geodaten.GEO_Kante;
import org.eclipse.set.model.model1902.Geodaten.GEO_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Art_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl#getGEOKanteAllg <em>GEO Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl#getIDGEOArt <em>IDGEO Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl#getIDGEOKnotenA <em>IDGEO Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_KanteImpl#getIDGEOKnotenB <em>IDGEO Knoten B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_KanteImpl extends Basis_ObjektImpl implements GEO_Kante {
	/**
	 * The cached value of the '{@link #getGEOKanteAllg() <em>GEO Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected GEO_Kante_Allg_AttributeGroup gEOKanteAllg;

	/**
	 * The cached value of the '{@link #getIDGEOArt() <em>IDGEO Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOArt()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Art_TypeClass iDGEOArt;

	/**
	 * The cached value of the '{@link #getIDGEOKnotenA() <em>IDGEO Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnotenA()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Knoten_TypeClass iDGEOKnotenA;

	/**
	 * The cached value of the '{@link #getIDGEOKnotenB() <em>IDGEO Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnotenB()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Knoten_TypeClass iDGEOKnotenB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Kante_Allg_AttributeGroup getGEOKanteAllg() {
		return gEOKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKanteAllg(GEO_Kante_Allg_AttributeGroup newGEOKanteAllg, NotificationChain msgs) {
		GEO_Kante_Allg_AttributeGroup oldGEOKanteAllg = gEOKanteAllg;
		gEOKanteAllg = newGEOKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, oldGEOKanteAllg, newGEOKanteAllg);
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
	public void setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup newGEOKanteAllg) {
		if (newGEOKanteAllg != gEOKanteAllg) {
			NotificationChain msgs = null;
			if (gEOKanteAllg != null)
				msgs = ((InternalEObject)gEOKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, null, msgs);
			if (newGEOKanteAllg != null)
				msgs = ((InternalEObject)newGEOKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, null, msgs);
			msgs = basicSetGEOKanteAllg(newGEOKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, newGEOKanteAllg, newGEOKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Art_TypeClass getIDGEOArt() {
		return iDGEOArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOArt(ID_GEO_Art_TypeClass newIDGEOArt, NotificationChain msgs) {
		ID_GEO_Art_TypeClass oldIDGEOArt = iDGEOArt;
		iDGEOArt = newIDGEOArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_ART, oldIDGEOArt, newIDGEOArt);
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
	public void setIDGEOArt(ID_GEO_Art_TypeClass newIDGEOArt) {
		if (newIDGEOArt != iDGEOArt) {
			NotificationChain msgs = null;
			if (iDGEOArt != null)
				msgs = ((InternalEObject)iDGEOArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_ART, null, msgs);
			if (newIDGEOArt != null)
				msgs = ((InternalEObject)newIDGEOArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_ART, null, msgs);
			msgs = basicSetIDGEOArt(newIDGEOArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_ART, newIDGEOArt, newIDGEOArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Knoten_TypeClass getIDGEOKnotenA() {
		return iDGEOKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOKnotenA(ID_GEO_Knoten_TypeClass newIDGEOKnotenA, NotificationChain msgs) {
		ID_GEO_Knoten_TypeClass oldIDGEOKnotenA = iDGEOKnotenA;
		iDGEOKnotenA = newIDGEOKnotenA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, oldIDGEOKnotenA, newIDGEOKnotenA);
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
	public void setIDGEOKnotenA(ID_GEO_Knoten_TypeClass newIDGEOKnotenA) {
		if (newIDGEOKnotenA != iDGEOKnotenA) {
			NotificationChain msgs = null;
			if (iDGEOKnotenA != null)
				msgs = ((InternalEObject)iDGEOKnotenA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, null, msgs);
			if (newIDGEOKnotenA != null)
				msgs = ((InternalEObject)newIDGEOKnotenA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, null, msgs);
			msgs = basicSetIDGEOKnotenA(newIDGEOKnotenA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, newIDGEOKnotenA, newIDGEOKnotenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Knoten_TypeClass getIDGEOKnotenB() {
		return iDGEOKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOKnotenB(ID_GEO_Knoten_TypeClass newIDGEOKnotenB, NotificationChain msgs) {
		ID_GEO_Knoten_TypeClass oldIDGEOKnotenB = iDGEOKnotenB;
		iDGEOKnotenB = newIDGEOKnotenB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, oldIDGEOKnotenB, newIDGEOKnotenB);
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
	public void setIDGEOKnotenB(ID_GEO_Knoten_TypeClass newIDGEOKnotenB) {
		if (newIDGEOKnotenB != iDGEOKnotenB) {
			NotificationChain msgs = null;
			if (iDGEOKnotenB != null)
				msgs = ((InternalEObject)iDGEOKnotenB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, null, msgs);
			if (newIDGEOKnotenB != null)
				msgs = ((InternalEObject)newIDGEOKnotenB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, null, msgs);
			msgs = basicSetIDGEOKnotenB(newIDGEOKnotenB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, newIDGEOKnotenB, newIDGEOKnotenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return basicSetGEOKanteAllg(null, msgs);
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				return basicSetIDGEOArt(null, msgs);
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				return basicSetIDGEOKnotenA(null, msgs);
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				return basicSetIDGEOKnotenB(null, msgs);
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return getGEOKanteAllg();
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				return getIDGEOArt();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				return getIDGEOKnotenA();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				return getIDGEOKnotenB();
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				setGEOKanteAllg((GEO_Kante_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				setIDGEOArt((ID_GEO_Art_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				setIDGEOKnotenA((ID_GEO_Knoten_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				setIDGEOKnotenB((ID_GEO_Knoten_TypeClass)newValue);
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				setGEOKanteAllg((GEO_Kante_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				setIDGEOArt((ID_GEO_Art_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				setIDGEOKnotenA((ID_GEO_Knoten_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				setIDGEOKnotenB((ID_GEO_Knoten_TypeClass)null);
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return gEOKanteAllg != null;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				return iDGEOArt != null;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				return iDGEOKnotenA != null;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				return iDGEOKnotenB != null;
		}
		return super.eIsSet(featureID);
	}

} //GEO_KanteImpl
