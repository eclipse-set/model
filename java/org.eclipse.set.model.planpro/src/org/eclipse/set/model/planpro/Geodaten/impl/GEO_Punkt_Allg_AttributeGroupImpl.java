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

import org.eclipse.set.model.planpro.Geodaten.GEO_Koordinatensystem_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GEO_Punkt_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Geodaten.GK_X_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GK_Y_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GK_Z_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Plan_Quelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Punkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGEOKoordinatensystem <em>GEO Koordinatensystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKX <em>GKX</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKY <em>GKY</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKZ <em>GKZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_Punkt_Allg_AttributeGroupImpl extends EObjectImpl implements GEO_Punkt_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGEOKoordinatensystem() <em>GEO Koordinatensystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKoordinatensystem()
	 * @generated
	 * @ordered
	 */
	protected GEO_Koordinatensystem_TypeClass gEOKoordinatensystem;

	/**
	 * The cached value of the '{@link #getGKX() <em>GKX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGKX()
	 * @generated
	 * @ordered
	 */
	protected GK_X_TypeClass gKX;

	/**
	 * The cached value of the '{@link #getGKY() <em>GKY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGKY()
	 * @generated
	 * @ordered
	 */
	protected GK_Y_TypeClass gKY;

	/**
	 * The cached value of the '{@link #getGKZ() <em>GKZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGKZ()
	 * @generated
	 * @ordered
	 */
	protected GK_Z_TypeClass gKZ;

	/**
	 * The cached value of the '{@link #getPlanQuelle() <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanQuelle()
	 * @generated
	 * @ordered
	 */
	protected Plan_Quelle_TypeClass planQuelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_Punkt_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Koordinatensystem_TypeClass getGEOKoordinatensystem() {
		return gEOKoordinatensystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKoordinatensystem(GEO_Koordinatensystem_TypeClass newGEOKoordinatensystem, NotificationChain msgs) {
		GEO_Koordinatensystem_TypeClass oldGEOKoordinatensystem = gEOKoordinatensystem;
		gEOKoordinatensystem = newGEOKoordinatensystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM, oldGEOKoordinatensystem, newGEOKoordinatensystem);
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
	public void setGEOKoordinatensystem(GEO_Koordinatensystem_TypeClass newGEOKoordinatensystem) {
		if (newGEOKoordinatensystem != gEOKoordinatensystem) {
			NotificationChain msgs = null;
			if (gEOKoordinatensystem != null)
				msgs = ((InternalEObject)gEOKoordinatensystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM, null, msgs);
			if (newGEOKoordinatensystem != null)
				msgs = ((InternalEObject)newGEOKoordinatensystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM, null, msgs);
			msgs = basicSetGEOKoordinatensystem(newGEOKoordinatensystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM, newGEOKoordinatensystem, newGEOKoordinatensystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_X_TypeClass getGKX() {
		return gKX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGKX(GK_X_TypeClass newGKX, NotificationChain msgs) {
		GK_X_TypeClass oldGKX = gKX;
		gKX = newGKX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX, oldGKX, newGKX);
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
	public void setGKX(GK_X_TypeClass newGKX) {
		if (newGKX != gKX) {
			NotificationChain msgs = null;
			if (gKX != null)
				msgs = ((InternalEObject)gKX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX, null, msgs);
			if (newGKX != null)
				msgs = ((InternalEObject)newGKX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX, null, msgs);
			msgs = basicSetGKX(newGKX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX, newGKX, newGKX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_Y_TypeClass getGKY() {
		return gKY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGKY(GK_Y_TypeClass newGKY, NotificationChain msgs) {
		GK_Y_TypeClass oldGKY = gKY;
		gKY = newGKY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY, oldGKY, newGKY);
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
	public void setGKY(GK_Y_TypeClass newGKY) {
		if (newGKY != gKY) {
			NotificationChain msgs = null;
			if (gKY != null)
				msgs = ((InternalEObject)gKY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY, null, msgs);
			if (newGKY != null)
				msgs = ((InternalEObject)newGKY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY, null, msgs);
			msgs = basicSetGKY(newGKY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY, newGKY, newGKY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_Z_TypeClass getGKZ() {
		return gKZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGKZ(GK_Z_TypeClass newGKZ, NotificationChain msgs) {
		GK_Z_TypeClass oldGKZ = gKZ;
		gKZ = newGKZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ, oldGKZ, newGKZ);
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
	public void setGKZ(GK_Z_TypeClass newGKZ) {
		if (newGKZ != gKZ) {
			NotificationChain msgs = null;
			if (gKZ != null)
				msgs = ((InternalEObject)gKZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ, null, msgs);
			if (newGKZ != null)
				msgs = ((InternalEObject)newGKZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ, null, msgs);
			msgs = basicSetGKZ(newGKZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ, newGKZ, newGKZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plan_Quelle_TypeClass getPlanQuelle() {
		return planQuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle, NotificationChain msgs) {
		Plan_Quelle_TypeClass oldPlanQuelle = planQuelle;
		planQuelle = newPlanQuelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
	public void setPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle) {
		if (newPlanQuelle != planQuelle) {
			NotificationChain msgs = null;
			if (planQuelle != null)
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM:
				return basicSetGEOKoordinatensystem(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return basicSetGKX(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return basicSetGKY(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return basicSetGKZ(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM:
				return getGEOKoordinatensystem();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return getGKX();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return getGKY();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return getGKZ();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM:
				setGEOKoordinatensystem((GEO_Koordinatensystem_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				setGKX((GK_X_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				setGKY((GK_Y_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				setGKZ((GK_Z_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)newValue);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM:
				setGEOKoordinatensystem((GEO_Koordinatensystem_TypeClass)null);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				setGKX((GK_X_TypeClass)null);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				setGKY((GK_Y_TypeClass)null);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				setGKZ((GK_Z_TypeClass)null);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)null);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM:
				return gEOKoordinatensystem != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return gKX != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return gKY != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return gKZ != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
		}
		return super.eIsSet(featureID);
	}

} //GEO_Punkt_Allg_AttributeGroupImpl
