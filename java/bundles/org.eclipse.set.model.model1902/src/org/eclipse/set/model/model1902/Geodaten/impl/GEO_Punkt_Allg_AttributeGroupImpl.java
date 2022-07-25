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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_LSys_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GEO_KoordinatenSystem_Sonstige_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.GK_X_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GK_Y_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GK_Z_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Punkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKX <em>GKX</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKY <em>GKY</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGKZ <em>GKZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGEOKoordinatenSystemLSys <em>GEO Koordinaten System LSys</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_Punkt_Allg_AttributeGroupImpl#getGEOKoordinatenSystemSonstige <em>GEO Koordinaten System Sonstige</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_Punkt_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements GEO_Punkt_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getGEOKoordinatenSystemLSys() <em>GEO Koordinaten System LSys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKoordinatenSystemLSys()
	 * @generated
	 * @ordered
	 */
	protected GEO_KoordinatenSystem_LSys_TypeClass gEOKoordinatenSystemLSys;

	/**
	 * The cached value of the '{@link #getGEOKoordinatenSystemSonstige() <em>GEO Koordinaten System Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKoordinatenSystemSonstige()
	 * @generated
	 * @ordered
	 */
	protected GEO_KoordinatenSystem_Sonstige_TypeClass gEOKoordinatenSystemSonstige;

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
	public GEO_KoordinatenSystem_LSys_TypeClass getGEOKoordinatenSystemLSys() {
		return gEOKoordinatenSystemLSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKoordinatenSystemLSys(GEO_KoordinatenSystem_LSys_TypeClass newGEOKoordinatenSystemLSys, NotificationChain msgs) {
		GEO_KoordinatenSystem_LSys_TypeClass oldGEOKoordinatenSystemLSys = gEOKoordinatenSystemLSys;
		gEOKoordinatenSystemLSys = newGEOKoordinatenSystemLSys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS, oldGEOKoordinatenSystemLSys, newGEOKoordinatenSystemLSys);
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
	public void setGEOKoordinatenSystemLSys(GEO_KoordinatenSystem_LSys_TypeClass newGEOKoordinatenSystemLSys) {
		if (newGEOKoordinatenSystemLSys != gEOKoordinatenSystemLSys) {
			NotificationChain msgs = null;
			if (gEOKoordinatenSystemLSys != null)
				msgs = ((InternalEObject)gEOKoordinatenSystemLSys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS, null, msgs);
			if (newGEOKoordinatenSystemLSys != null)
				msgs = ((InternalEObject)newGEOKoordinatenSystemLSys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS, null, msgs);
			msgs = basicSetGEOKoordinatenSystemLSys(newGEOKoordinatenSystemLSys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS, newGEOKoordinatenSystemLSys, newGEOKoordinatenSystemLSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_KoordinatenSystem_Sonstige_TypeClass getGEOKoordinatenSystemSonstige() {
		return gEOKoordinatenSystemSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKoordinatenSystemSonstige(GEO_KoordinatenSystem_Sonstige_TypeClass newGEOKoordinatenSystemSonstige, NotificationChain msgs) {
		GEO_KoordinatenSystem_Sonstige_TypeClass oldGEOKoordinatenSystemSonstige = gEOKoordinatenSystemSonstige;
		gEOKoordinatenSystemSonstige = newGEOKoordinatenSystemSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE, oldGEOKoordinatenSystemSonstige, newGEOKoordinatenSystemSonstige);
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
	public void setGEOKoordinatenSystemSonstige(GEO_KoordinatenSystem_Sonstige_TypeClass newGEOKoordinatenSystemSonstige) {
		if (newGEOKoordinatenSystemSonstige != gEOKoordinatenSystemSonstige) {
			NotificationChain msgs = null;
			if (gEOKoordinatenSystemSonstige != null)
				msgs = ((InternalEObject)gEOKoordinatenSystemSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE, null, msgs);
			if (newGEOKoordinatenSystemSonstige != null)
				msgs = ((InternalEObject)newGEOKoordinatenSystemSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE, null, msgs);
			msgs = basicSetGEOKoordinatenSystemSonstige(newGEOKoordinatenSystemSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE, newGEOKoordinatenSystemSonstige, newGEOKoordinatenSystemSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return basicSetGKX(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return basicSetGKY(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return basicSetGKZ(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS:
				return basicSetGEOKoordinatenSystemLSys(null, msgs);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE:
				return basicSetGEOKoordinatenSystemSonstige(null, msgs);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return getGKX();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return getGKY();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return getGKZ();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS:
				return getGEOKoordinatenSystemLSys();
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE:
				return getGEOKoordinatenSystemSonstige();
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS:
				setGEOKoordinatenSystemLSys((GEO_KoordinatenSystem_LSys_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE:
				setGEOKoordinatenSystemSonstige((GEO_KoordinatenSystem_Sonstige_TypeClass)newValue);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS:
				setGEOKoordinatenSystemLSys((GEO_KoordinatenSystem_LSys_TypeClass)null);
				return;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE:
				setGEOKoordinatenSystemSonstige((GEO_KoordinatenSystem_Sonstige_TypeClass)null);
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
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX:
				return gKX != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY:
				return gKY != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ:
				return gKZ != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_LSYS:
				return gEOKoordinatenSystemLSys != null;
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATEN_SYSTEM_SONSTIGE:
				return gEOKoordinatenSystemSonstige != null;
		}
		return super.eIsSet(featureID);
	}

} //GEO_Punkt_Allg_AttributeGroupImpl
