/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.ATO.ATOPackage;
import org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.NID_ATOTS_TypeClass;
import org.eclipse.set.model.model11001.ATO.NID_C_ATOTS_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO TS Instanz Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl#getNIDATOTS <em>NIDATOTS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_TS_Instanz_Adresse_AttributeGroupImpl#getNIDCATOTS <em>NIDCATOTS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_TS_Instanz_Adresse_AttributeGroupImpl extends EObjectImpl implements ATO_TS_Instanz_Adresse_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNIDATOTS() <em>NIDATOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDATOTS()
	 * @generated
	 * @ordered
	 */
	protected NID_ATOTS_TypeClass nIDATOTS;

	/**
	 * The cached value of the '{@link #getNIDCATOTS() <em>NIDCATOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDCATOTS()
	 * @generated
	 * @ordered
	 */
	protected NID_C_ATOTS_TypeClass nIDCATOTS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_TS_Instanz_Adresse_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_ATOTS_TypeClass getNIDATOTS() {
		return nIDATOTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDATOTS(NID_ATOTS_TypeClass newNIDATOTS, NotificationChain msgs) {
		NID_ATOTS_TypeClass oldNIDATOTS = nIDATOTS;
		nIDATOTS = newNIDATOTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS, oldNIDATOTS, newNIDATOTS);
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
	public void setNIDATOTS(NID_ATOTS_TypeClass newNIDATOTS) {
		if (newNIDATOTS != nIDATOTS) {
			NotificationChain msgs = null;
			if (nIDATOTS != null)
				msgs = ((InternalEObject)nIDATOTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS, null, msgs);
			if (newNIDATOTS != null)
				msgs = ((InternalEObject)newNIDATOTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS, null, msgs);
			msgs = basicSetNIDATOTS(newNIDATOTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS, newNIDATOTS, newNIDATOTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_C_ATOTS_TypeClass getNIDCATOTS() {
		return nIDCATOTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDCATOTS(NID_C_ATOTS_TypeClass newNIDCATOTS, NotificationChain msgs) {
		NID_C_ATOTS_TypeClass oldNIDCATOTS = nIDCATOTS;
		nIDCATOTS = newNIDCATOTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS, oldNIDCATOTS, newNIDCATOTS);
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
	public void setNIDCATOTS(NID_C_ATOTS_TypeClass newNIDCATOTS) {
		if (newNIDCATOTS != nIDCATOTS) {
			NotificationChain msgs = null;
			if (nIDCATOTS != null)
				msgs = ((InternalEObject)nIDCATOTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS, null, msgs);
			if (newNIDCATOTS != null)
				msgs = ((InternalEObject)newNIDCATOTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS, null, msgs);
			msgs = basicSetNIDCATOTS(newNIDCATOTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS, newNIDCATOTS, newNIDCATOTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS:
				return basicSetNIDATOTS(null, msgs);
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS:
				return basicSetNIDCATOTS(null, msgs);
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
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS:
				return getNIDATOTS();
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS:
				return getNIDCATOTS();
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
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS:
				setNIDATOTS((NID_ATOTS_TypeClass)newValue);
				return;
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS:
				setNIDCATOTS((NID_C_ATOTS_TypeClass)newValue);
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
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS:
				setNIDATOTS((NID_ATOTS_TypeClass)null);
				return;
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS:
				setNIDCATOTS((NID_C_ATOTS_TypeClass)null);
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
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS:
				return nIDATOTS != null;
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS:
				return nIDCATOTS != null;
		}
		return super.eIsSet(featureID);
	}

} //ATO_TS_Instanz_Adresse_AttributeGroupImpl
