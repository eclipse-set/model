/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.F_Bedienung_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Bedienstring_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Reihenfolge_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_V_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Zug Rangier Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl#getFBedienung <em>FBedienung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl#getFstrBedienstring <em>Fstr Bedienstring</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl#getFstrReihenfolge <em>Fstr Reihenfolge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Zug_Rangier_Allg_AttributeGroupImpl#getFstrV <em>Fstr V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Zug_Rangier_Allg_AttributeGroupImpl extends EObjectImpl implements Fstr_Zug_Rangier_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFBedienung() <em>FBedienung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBedienung()
	 * @generated
	 * @ordered
	 */
	protected F_Bedienung_TypeClass fBedienung;

	/**
	 * The cached value of the '{@link #getFstrBedienstring() <em>Fstr Bedienstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrBedienstring()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Bedienstring_TypeClass fstrBedienstring;

	/**
	 * The cached value of the '{@link #getFstrReihenfolge() <em>Fstr Reihenfolge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrReihenfolge()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Reihenfolge_TypeClass fstrReihenfolge;

	/**
	 * The cached value of the '{@link #getFstrV() <em>Fstr V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrV()
	 * @generated
	 * @ordered
	 */
	protected Fstr_V_TypeClass fstrV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Zug_Rangier_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public F_Bedienung_TypeClass getFBedienung() {
		return fBedienung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFBedienung(F_Bedienung_TypeClass newFBedienung, NotificationChain msgs) {
		F_Bedienung_TypeClass oldFBedienung = fBedienung;
		fBedienung = newFBedienung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG, oldFBedienung, newFBedienung);
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
	public void setFBedienung(F_Bedienung_TypeClass newFBedienung) {
		if (newFBedienung != fBedienung) {
			NotificationChain msgs = null;
			if (fBedienung != null)
				msgs = ((InternalEObject)fBedienung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG, null, msgs);
			if (newFBedienung != null)
				msgs = ((InternalEObject)newFBedienung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG, null, msgs);
			msgs = basicSetFBedienung(newFBedienung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG, newFBedienung, newFBedienung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Bedienstring_TypeClass getFstrBedienstring() {
		return fstrBedienstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrBedienstring(Fstr_Bedienstring_TypeClass newFstrBedienstring, NotificationChain msgs) {
		Fstr_Bedienstring_TypeClass oldFstrBedienstring = fstrBedienstring;
		fstrBedienstring = newFstrBedienstring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING, oldFstrBedienstring, newFstrBedienstring);
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
	public void setFstrBedienstring(Fstr_Bedienstring_TypeClass newFstrBedienstring) {
		if (newFstrBedienstring != fstrBedienstring) {
			NotificationChain msgs = null;
			if (fstrBedienstring != null)
				msgs = ((InternalEObject)fstrBedienstring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING, null, msgs);
			if (newFstrBedienstring != null)
				msgs = ((InternalEObject)newFstrBedienstring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING, null, msgs);
			msgs = basicSetFstrBedienstring(newFstrBedienstring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING, newFstrBedienstring, newFstrBedienstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Reihenfolge_TypeClass getFstrReihenfolge() {
		return fstrReihenfolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrReihenfolge(Fstr_Reihenfolge_TypeClass newFstrReihenfolge, NotificationChain msgs) {
		Fstr_Reihenfolge_TypeClass oldFstrReihenfolge = fstrReihenfolge;
		fstrReihenfolge = newFstrReihenfolge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE, oldFstrReihenfolge, newFstrReihenfolge);
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
	public void setFstrReihenfolge(Fstr_Reihenfolge_TypeClass newFstrReihenfolge) {
		if (newFstrReihenfolge != fstrReihenfolge) {
			NotificationChain msgs = null;
			if (fstrReihenfolge != null)
				msgs = ((InternalEObject)fstrReihenfolge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE, null, msgs);
			if (newFstrReihenfolge != null)
				msgs = ((InternalEObject)newFstrReihenfolge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE, null, msgs);
			msgs = basicSetFstrReihenfolge(newFstrReihenfolge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE, newFstrReihenfolge, newFstrReihenfolge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_V_TypeClass getFstrV() {
		return fstrV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrV(Fstr_V_TypeClass newFstrV, NotificationChain msgs) {
		Fstr_V_TypeClass oldFstrV = fstrV;
		fstrV = newFstrV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V, oldFstrV, newFstrV);
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
	public void setFstrV(Fstr_V_TypeClass newFstrV) {
		if (newFstrV != fstrV) {
			NotificationChain msgs = null;
			if (fstrV != null)
				msgs = ((InternalEObject)fstrV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V, null, msgs);
			if (newFstrV != null)
				msgs = ((InternalEObject)newFstrV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V, null, msgs);
			msgs = basicSetFstrV(newFstrV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V, newFstrV, newFstrV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG:
				return basicSetFBedienung(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING:
				return basicSetFstrBedienstring(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE:
				return basicSetFstrReihenfolge(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V:
				return basicSetFstrV(null, msgs);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG:
				return getFBedienung();
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING:
				return getFstrBedienstring();
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE:
				return getFstrReihenfolge();
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V:
				return getFstrV();
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG:
				setFBedienung((F_Bedienung_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING:
				setFstrBedienstring((Fstr_Bedienstring_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE:
				setFstrReihenfolge((Fstr_Reihenfolge_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V:
				setFstrV((Fstr_V_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG:
				setFBedienung((F_Bedienung_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING:
				setFstrBedienstring((Fstr_Bedienstring_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE:
				setFstrReihenfolge((Fstr_Reihenfolge_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V:
				setFstrV((Fstr_V_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG:
				return fBedienung != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING:
				return fstrBedienstring != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE:
				return fstrReihenfolge != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V:
				return fstrV != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Zug_Rangier_Allg_AttributeGroupImpl
