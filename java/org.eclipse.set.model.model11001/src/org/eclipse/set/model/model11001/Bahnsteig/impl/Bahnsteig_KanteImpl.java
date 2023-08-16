/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Bahnsteig_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.impl.Bahnsteig_KanteImpl#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.impl.Bahnsteig_KanteImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.impl.Bahnsteig_KanteImpl#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_KanteImpl extends Bereich_ObjektImpl implements Bahnsteig_Kante {
	/**
	 * The cached value of the '{@link #getBahnsteigKanteAllg() <em>Bahnsteig Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante_Allg_AttributeGroup bahnsteigKanteAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBahnsteigAnlage() <em>ID Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_Bahnsteig_Anlage_TypeClass iDBahnsteigAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Allg_AttributeGroup getBahnsteigKanteAllg() {
		return bahnsteigKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup newBahnsteigKanteAllg, NotificationChain msgs) {
		Bahnsteig_Kante_Allg_AttributeGroup oldBahnsteigKanteAllg = bahnsteigKanteAllg;
		bahnsteigKanteAllg = newBahnsteigKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, oldBahnsteigKanteAllg, newBahnsteigKanteAllg);
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
	public void setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup newBahnsteigKanteAllg) {
		if (newBahnsteigKanteAllg != bahnsteigKanteAllg) {
			NotificationChain msgs = null;
			if (bahnsteigKanteAllg != null)
				msgs = ((InternalEObject)bahnsteigKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, null, msgs);
			if (newBahnsteigKanteAllg != null)
				msgs = ((InternalEObject)newBahnsteigKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, null, msgs);
			msgs = basicSetBahnsteigKanteAllg(newBahnsteigKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, newBahnsteigKanteAllg, newBahnsteigKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bahnsteig_Kante_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Anlage_TypeClass getIDBahnsteigAnlage() {
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass newIDBahnsteigAnlage, NotificationChain msgs) {
		ID_Bahnsteig_Anlage_TypeClass oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		iDBahnsteigAnlage = newIDBahnsteigAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, newIDBahnsteigAnlage);
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
	public void setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass newIDBahnsteigAnlage) {
		if (newIDBahnsteigAnlage != iDBahnsteigAnlage) {
			NotificationChain msgs = null;
			if (iDBahnsteigAnlage != null)
				msgs = ((InternalEObject)iDBahnsteigAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, null, msgs);
			if (newIDBahnsteigAnlage != null)
				msgs = ((InternalEObject)newIDBahnsteigAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, null, msgs);
			msgs = basicSetIDBahnsteigAnlage(newIDBahnsteigAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, newIDBahnsteigAnlage, newIDBahnsteigAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return basicSetBahnsteigKanteAllg(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				return basicSetIDBahnsteigAnlage(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return getBahnsteigKanteAllg();
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				return getBezeichnung();
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				return getIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				setBahnsteigKanteAllg((Bahnsteig_Kante_Allg_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				setBezeichnung((Bahnsteig_Kante_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((ID_Bahnsteig_Anlage_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				setBahnsteigKanteAllg((Bahnsteig_Kante_Allg_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				setBezeichnung((Bahnsteig_Kante_Bezeichnung_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((ID_Bahnsteig_Anlage_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return bahnsteigKanteAllg != null;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				return iDBahnsteigAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //Bahnsteig_KanteImpl
