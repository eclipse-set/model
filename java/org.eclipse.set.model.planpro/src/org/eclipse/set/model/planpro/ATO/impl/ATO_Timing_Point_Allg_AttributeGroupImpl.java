/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.ATO.ATOPackage;
import org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.ATO.Erreichungstoleranz_TypeClass;
import org.eclipse.set.model.planpro.ATO.Haltetoleranz_TypeClass;
import org.eclipse.set.model.planpro.ATO.NID_TP_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Timing Point Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl#getErreichungstoleranz <em>Erreichungstoleranz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl#getHaltetoleranz <em>Haltetoleranz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Allg_AttributeGroupImpl#getNIDTP <em>NIDTP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Timing_Point_Allg_AttributeGroupImpl extends EObjectImpl implements ATO_Timing_Point_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getErreichungstoleranz() <em>Erreichungstoleranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichungstoleranz()
	 * @generated
	 * @ordered
	 */
	protected Erreichungstoleranz_TypeClass erreichungstoleranz;

	/**
	 * The cached value of the '{@link #getHaltetoleranz() <em>Haltetoleranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltetoleranz()
	 * @generated
	 * @ordered
	 */
	protected Haltetoleranz_TypeClass haltetoleranz;

	/**
	 * The cached value of the '{@link #getNIDTP() <em>NIDTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDTP()
	 * @generated
	 * @ordered
	 */
	protected NID_TP_TypeClass nIDTP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Timing_Point_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erreichungstoleranz_TypeClass getErreichungstoleranz() {
		return erreichungstoleranz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErreichungstoleranz(Erreichungstoleranz_TypeClass newErreichungstoleranz, NotificationChain msgs) {
		Erreichungstoleranz_TypeClass oldErreichungstoleranz = erreichungstoleranz;
		erreichungstoleranz = newErreichungstoleranz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ, oldErreichungstoleranz, newErreichungstoleranz);
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
	public void setErreichungstoleranz(Erreichungstoleranz_TypeClass newErreichungstoleranz) {
		if (newErreichungstoleranz != erreichungstoleranz) {
			NotificationChain msgs = null;
			if (erreichungstoleranz != null)
				msgs = ((InternalEObject)erreichungstoleranz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ, null, msgs);
			if (newErreichungstoleranz != null)
				msgs = ((InternalEObject)newErreichungstoleranz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ, null, msgs);
			msgs = basicSetErreichungstoleranz(newErreichungstoleranz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ, newErreichungstoleranz, newErreichungstoleranz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Haltetoleranz_TypeClass getHaltetoleranz() {
		return haltetoleranz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaltetoleranz(Haltetoleranz_TypeClass newHaltetoleranz, NotificationChain msgs) {
		Haltetoleranz_TypeClass oldHaltetoleranz = haltetoleranz;
		haltetoleranz = newHaltetoleranz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ, oldHaltetoleranz, newHaltetoleranz);
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
	public void setHaltetoleranz(Haltetoleranz_TypeClass newHaltetoleranz) {
		if (newHaltetoleranz != haltetoleranz) {
			NotificationChain msgs = null;
			if (haltetoleranz != null)
				msgs = ((InternalEObject)haltetoleranz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ, null, msgs);
			if (newHaltetoleranz != null)
				msgs = ((InternalEObject)newHaltetoleranz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ, null, msgs);
			msgs = basicSetHaltetoleranz(newHaltetoleranz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ, newHaltetoleranz, newHaltetoleranz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_TP_TypeClass getNIDTP() {
		return nIDTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDTP(NID_TP_TypeClass newNIDTP, NotificationChain msgs) {
		NID_TP_TypeClass oldNIDTP = nIDTP;
		nIDTP = newNIDTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP, oldNIDTP, newNIDTP);
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
	public void setNIDTP(NID_TP_TypeClass newNIDTP) {
		if (newNIDTP != nIDTP) {
			NotificationChain msgs = null;
			if (nIDTP != null)
				msgs = ((InternalEObject)nIDTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP, null, msgs);
			if (newNIDTP != null)
				msgs = ((InternalEObject)newNIDTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP, null, msgs);
			msgs = basicSetNIDTP(newNIDTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP, newNIDTP, newNIDTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ:
				return basicSetErreichungstoleranz(null, msgs);
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ:
				return basicSetHaltetoleranz(null, msgs);
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP:
				return basicSetNIDTP(null, msgs);
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
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ:
				return getErreichungstoleranz();
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ:
				return getHaltetoleranz();
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP:
				return getNIDTP();
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
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ:
				setErreichungstoleranz((Erreichungstoleranz_TypeClass)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ:
				setHaltetoleranz((Haltetoleranz_TypeClass)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP:
				setNIDTP((NID_TP_TypeClass)newValue);
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
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ:
				setErreichungstoleranz((Erreichungstoleranz_TypeClass)null);
				return;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ:
				setHaltetoleranz((Haltetoleranz_TypeClass)null);
				return;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP:
				setNIDTP((NID_TP_TypeClass)null);
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
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ:
				return erreichungstoleranz != null;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ:
				return haltetoleranz != null;
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP:
				return nIDTP != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ATO_Timing_Point_Allg_AttributeGroupImpl
