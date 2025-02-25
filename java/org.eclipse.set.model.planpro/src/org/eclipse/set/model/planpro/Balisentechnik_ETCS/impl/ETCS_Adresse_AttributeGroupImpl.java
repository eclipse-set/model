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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_C_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Adresse_AttributeGroupImpl#getNIDC <em>NIDC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ETCS_Adresse_AttributeGroupImpl#getNIDRBC <em>NIDRBC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_Adresse_AttributeGroupImpl extends EObjectImpl implements ETCS_Adresse_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNIDC() <em>NIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDC()
	 * @generated
	 * @ordered
	 */
	protected NID_C_TypeClass nIDC;

	/**
	 * The cached value of the '{@link #getNIDRBC() <em>NIDRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDRBC()
	 * @generated
	 * @ordered
	 */
	protected NID_RBC_TypeClass nIDRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_Adresse_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Adresse_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_C_TypeClass getNIDC() {
		return nIDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDC(NID_C_TypeClass newNIDC, NotificationChain msgs) {
		NID_C_TypeClass oldNIDC = nIDC;
		nIDC = newNIDC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC, oldNIDC, newNIDC);
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
	public void setNIDC(NID_C_TypeClass newNIDC) {
		if (newNIDC != nIDC) {
			NotificationChain msgs = null;
			if (nIDC != null)
				msgs = ((InternalEObject)nIDC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC, null, msgs);
			if (newNIDC != null)
				msgs = ((InternalEObject)newNIDC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC, null, msgs);
			msgs = basicSetNIDC(newNIDC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC, newNIDC, newNIDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_RBC_TypeClass getNIDRBC() {
		return nIDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDRBC(NID_RBC_TypeClass newNIDRBC, NotificationChain msgs) {
		NID_RBC_TypeClass oldNIDRBC = nIDRBC;
		nIDRBC = newNIDRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC, oldNIDRBC, newNIDRBC);
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
	public void setNIDRBC(NID_RBC_TypeClass newNIDRBC) {
		if (newNIDRBC != nIDRBC) {
			NotificationChain msgs = null;
			if (nIDRBC != null)
				msgs = ((InternalEObject)nIDRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC, null, msgs);
			if (newNIDRBC != null)
				msgs = ((InternalEObject)newNIDRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC, null, msgs);
			msgs = basicSetNIDRBC(newNIDRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC, newNIDRBC, newNIDRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC:
				return basicSetNIDC(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC:
				return basicSetNIDRBC(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC:
				return getNIDC();
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC:
				return getNIDRBC();
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
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC:
				setNIDC((NID_C_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC:
				setNIDRBC((NID_RBC_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC:
				setNIDC((NID_C_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC:
				setNIDRBC((NID_RBC_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDC:
				return nIDC != null;
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP__NIDRBC:
				return nIDRBC != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_Adresse_AttributeGroupImpl
