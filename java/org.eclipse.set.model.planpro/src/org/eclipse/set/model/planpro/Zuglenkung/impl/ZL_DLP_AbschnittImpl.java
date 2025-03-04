/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass;

import org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_AbschnittImpl extends Basis_ObjektImpl implements ZL_DLP_Abschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Gleis_Abschnitt_TypeClass> iDGleisAbschnitt;

	/**
	 * The cached value of the '{@link #getIDZLDLPFstr() <em>IDZLDLP Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLDLPFstr()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_DLP_Fstr_TypeClass iDZLDLPFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_AbschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_ABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Gleis_Abschnitt_TypeClass> getIDGleisAbschnitt() {
		if (iDGleisAbschnitt == null) {
			iDGleisAbschnitt = new EObjectContainmentEList<ID_Gleis_Abschnitt_TypeClass>(ID_Gleis_Abschnitt_TypeClass.class, this, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT);
		}
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_DLP_Fstr_TypeClass getIDZLDLPFstr() {
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass newIDZLDLPFstr, NotificationChain msgs) {
		ID_ZL_DLP_Fstr_TypeClass oldIDZLDLPFstr = iDZLDLPFstr;
		iDZLDLPFstr = newIDZLDLPFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, newIDZLDLPFstr);
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
	public void setIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass newIDZLDLPFstr) {
		if (newIDZLDLPFstr != iDZLDLPFstr) {
			NotificationChain msgs = null;
			if (iDZLDLPFstr != null)
				msgs = ((InternalEObject)iDZLDLPFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, null, msgs);
			if (newIDZLDLPFstr != null)
				msgs = ((InternalEObject)newIDZLDLPFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, null, msgs);
			msgs = basicSetIDZLDLPFstr(newIDZLDLPFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, newIDZLDLPFstr, newIDZLDLPFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return ((InternalEList<?>)getIDGleisAbschnitt()).basicRemove(otherEnd, msgs);
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return basicSetIDZLDLPFstr(null, msgs);
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return getIDGleisAbschnitt();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return getIDZLDLPFstr();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				getIDGleisAbschnitt().clear();
				getIDGleisAbschnitt().addAll((Collection<? extends ID_Gleis_Abschnitt_TypeClass>)newValue);
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ID_ZL_DLP_Fstr_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				getIDGleisAbschnitt().clear();
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ID_ZL_DLP_Fstr_TypeClass)null);
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return iDGleisAbschnitt != null && !iDGleisAbschnitt.isEmpty();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return iDZLDLPFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_DLP_AbschnittImpl
