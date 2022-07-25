/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Regelzeichnung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage;
import org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter;
import org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regelzeichnung Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Regelzeichnung.impl.Regelzeichnung_ParameterImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Regelzeichnung.impl.Regelzeichnung_ParameterImpl#getRegelzeichnungParameterAllg <em>Regelzeichnung Parameter Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Regelzeichnung_ParameterImpl extends Basis_ObjektImpl implements Regelzeichnung_Parameter {
	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected ID_Regelzeichnung_TypeClass iDRegelzeichnung;

	/**
	 * The cached value of the '{@link #getRegelzeichnungParameterAllg() <em>Regelzeichnung Parameter Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelzeichnungParameterAllg()
	 * @generated
	 * @ordered
	 */
	protected Regelzeichnung_Parameter_Allg_AttributeGroup regelzeichnungParameterAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Regelzeichnung_ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegelzeichnungPackage.Literals.REGELZEICHNUNG_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Regelzeichnung_TypeClass getIDRegelzeichnung() {
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRegelzeichnung(ID_Regelzeichnung_TypeClass newIDRegelzeichnung, NotificationChain msgs) {
		ID_Regelzeichnung_TypeClass oldIDRegelzeichnung = iDRegelzeichnung;
		iDRegelzeichnung = newIDRegelzeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG, oldIDRegelzeichnung, newIDRegelzeichnung);
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
	public void setIDRegelzeichnung(ID_Regelzeichnung_TypeClass newIDRegelzeichnung) {
		if (newIDRegelzeichnung != iDRegelzeichnung) {
			NotificationChain msgs = null;
			if (iDRegelzeichnung != null)
				msgs = ((InternalEObject)iDRegelzeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG, null, msgs);
			if (newIDRegelzeichnung != null)
				msgs = ((InternalEObject)newIDRegelzeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG, null, msgs);
			msgs = basicSetIDRegelzeichnung(newIDRegelzeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG, newIDRegelzeichnung, newIDRegelzeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung_Parameter_Allg_AttributeGroup getRegelzeichnungParameterAllg() {
		return regelzeichnungParameterAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup newRegelzeichnungParameterAllg, NotificationChain msgs) {
		Regelzeichnung_Parameter_Allg_AttributeGroup oldRegelzeichnungParameterAllg = regelzeichnungParameterAllg;
		regelzeichnungParameterAllg = newRegelzeichnungParameterAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG, oldRegelzeichnungParameterAllg, newRegelzeichnungParameterAllg);
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
	public void setRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup newRegelzeichnungParameterAllg) {
		if (newRegelzeichnungParameterAllg != regelzeichnungParameterAllg) {
			NotificationChain msgs = null;
			if (regelzeichnungParameterAllg != null)
				msgs = ((InternalEObject)regelzeichnungParameterAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG, null, msgs);
			if (newRegelzeichnungParameterAllg != null)
				msgs = ((InternalEObject)newRegelzeichnungParameterAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG, null, msgs);
			msgs = basicSetRegelzeichnungParameterAllg(newRegelzeichnungParameterAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG, newRegelzeichnungParameterAllg, newRegelzeichnungParameterAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG:
				return basicSetIDRegelzeichnung(null, msgs);
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG:
				return basicSetRegelzeichnungParameterAllg(null, msgs);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG:
				return getIDRegelzeichnung();
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG:
				return getRegelzeichnungParameterAllg();
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((ID_Regelzeichnung_TypeClass)newValue);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG:
				setRegelzeichnungParameterAllg((Regelzeichnung_Parameter_Allg_AttributeGroup)newValue);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((ID_Regelzeichnung_TypeClass)null);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG:
				setRegelzeichnungParameterAllg((Regelzeichnung_Parameter_Allg_AttributeGroup)null);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG:
				return iDRegelzeichnung != null;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG:
				return regelzeichnungParameterAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //Regelzeichnung_ParameterImpl
