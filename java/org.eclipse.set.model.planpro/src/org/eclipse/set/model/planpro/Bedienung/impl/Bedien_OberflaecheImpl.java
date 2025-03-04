/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl#getBedienOberflaecheAnhaenge <em>Bedien Oberflaeche Anhaenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OberflaecheImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_OberflaecheImpl extends Basis_ObjektImpl implements Bedien_Oberflaeche {
	/**
	 * The cached value of the '{@link #getBedienOberflaecheAnhaenge() <em>Bedien Oberflaeche Anhaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaecheAnhaenge()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oberflaeche_Anhaenge_AttributeGroup bedienOberflaecheAnhaenge;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_OberflaecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Anhaenge_AttributeGroup getBedienOberflaecheAnhaenge() {
		return bedienOberflaecheAnhaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup newBedienOberflaecheAnhaenge, NotificationChain msgs) {
		Bedien_Oberflaeche_Anhaenge_AttributeGroup oldBedienOberflaecheAnhaenge = bedienOberflaecheAnhaenge;
		bedienOberflaecheAnhaenge = newBedienOberflaecheAnhaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, oldBedienOberflaecheAnhaenge, newBedienOberflaecheAnhaenge);
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
	public void setBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup newBedienOberflaecheAnhaenge) {
		if (newBedienOberflaecheAnhaenge != bedienOberflaecheAnhaenge) {
			NotificationChain msgs = null;
			if (bedienOberflaecheAnhaenge != null)
				msgs = ((InternalEObject)bedienOberflaecheAnhaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, null, msgs);
			if (newBedienOberflaecheAnhaenge != null)
				msgs = ((InternalEObject)newBedienOberflaecheAnhaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, null, msgs);
			msgs = basicSetBedienOberflaecheAnhaenge(newBedienOberflaecheAnhaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, newBedienOberflaecheAnhaenge, newBedienOberflaecheAnhaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, newIDBedienBezirk);
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
	public void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk) {
		if (newIDBedienBezirk != iDBedienBezirk) {
			NotificationChain msgs = null;
			if (iDBedienBezirk != null)
				msgs = ((InternalEObject)iDBedienBezirk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, null, msgs);
			if (newIDBedienBezirk != null)
				msgs = ((InternalEObject)newIDBedienBezirk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, null, msgs);
			msgs = basicSetIDBedienBezirk(newIDBedienBezirk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, newIDBedienBezirk, newIDBedienBezirk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return basicSetBedienOberflaecheAnhaenge(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				return basicSetIDBedienBezirk(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return getBedienOberflaecheAnhaenge();
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				return getIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				setBedienOberflaecheAnhaenge((Bedien_Oberflaeche_Anhaenge_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				setBedienOberflaecheAnhaenge((Bedien_Oberflaeche_Anhaenge_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return bedienOberflaecheAnhaenge != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				return iDBedienBezirk != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_OberflaecheImpl
