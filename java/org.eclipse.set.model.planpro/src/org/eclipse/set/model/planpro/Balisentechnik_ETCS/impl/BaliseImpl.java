/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.BaliseImpl#getBaliseAllg <em>Balise Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.BaliseImpl#getIDDatenpunkt <em>ID Datenpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaliseImpl extends Basis_ObjektImpl implements Balise {
	/**
	 * The cached value of the '{@link #getBaliseAllg() <em>Balise Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaliseAllg()
	 * @generated
	 * @ordered
	 */
	protected Balise_Allg_AttributeGroup baliseAllg;

	/**
	 * The cached value of the '{@link #getIDDatenpunkt() <em>ID Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Datenpunkt_ohne_Proxy_TypeClass iDDatenpunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaliseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBalise();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise_Allg_AttributeGroup getBaliseAllg() {
		return baliseAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaliseAllg(Balise_Allg_AttributeGroup newBaliseAllg, NotificationChain msgs) {
		Balise_Allg_AttributeGroup oldBaliseAllg = baliseAllg;
		baliseAllg = newBaliseAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, oldBaliseAllg, newBaliseAllg);
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
	public void setBaliseAllg(Balise_Allg_AttributeGroup newBaliseAllg) {
		if (newBaliseAllg != baliseAllg) {
			NotificationChain msgs = null;
			if (baliseAllg != null)
				msgs = ((InternalEObject)baliseAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, null, msgs);
			if (newBaliseAllg != null)
				msgs = ((InternalEObject)newBaliseAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, null, msgs);
			msgs = basicSetBaliseAllg(newBaliseAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, newBaliseAllg, newBaliseAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_ohne_Proxy_TypeClass getIDDatenpunkt() {
		return iDDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDatenpunkt(ID_Datenpunkt_ohne_Proxy_TypeClass newIDDatenpunkt, NotificationChain msgs) {
		ID_Datenpunkt_ohne_Proxy_TypeClass oldIDDatenpunkt = iDDatenpunkt;
		iDDatenpunkt = newIDDatenpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, oldIDDatenpunkt, newIDDatenpunkt);
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
	public void setIDDatenpunkt(ID_Datenpunkt_ohne_Proxy_TypeClass newIDDatenpunkt) {
		if (newIDDatenpunkt != iDDatenpunkt) {
			NotificationChain msgs = null;
			if (iDDatenpunkt != null)
				msgs = ((InternalEObject)iDDatenpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, null, msgs);
			if (newIDDatenpunkt != null)
				msgs = ((InternalEObject)newIDDatenpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, null, msgs);
			msgs = basicSetIDDatenpunkt(newIDDatenpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, newIDDatenpunkt, newIDDatenpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return basicSetBaliseAllg(null, msgs);
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				return basicSetIDDatenpunkt(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return getBaliseAllg();
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				return getIDDatenpunkt();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				setBaliseAllg((Balise_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				setIDDatenpunkt((ID_Datenpunkt_ohne_Proxy_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				setBaliseAllg((Balise_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				setIDDatenpunkt((ID_Datenpunkt_ohne_Proxy_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return baliseAllg != null;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				return iDDatenpunkt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BaliseImpl
