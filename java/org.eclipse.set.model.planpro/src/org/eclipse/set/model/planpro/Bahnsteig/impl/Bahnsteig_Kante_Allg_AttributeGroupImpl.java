/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnsteig.Lage_Zum_Gleis_TypeClass;
import org.eclipse.set.model.planpro.Bahnsteig.Systemhoehe_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl#getLageZumGleis <em>Lage Zum Gleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Kante_Allg_AttributeGroupImpl#getSystemhoehe <em>Systemhoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_Kante_Allg_AttributeGroupImpl extends EObjectImpl implements Bahnsteig_Kante_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLageZumGleis() <em>Lage Zum Gleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLageZumGleis()
	 * @generated
	 * @ordered
	 */
	protected Lage_Zum_Gleis_TypeClass lageZumGleis;

	/**
	 * The cached value of the '{@link #getSystemhoehe() <em>Systemhoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemhoehe()
	 * @generated
	 * @ordered
	 */
	protected Systemhoehe_TypeClass systemhoehe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_Kante_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lage_Zum_Gleis_TypeClass getLageZumGleis() {
		return lageZumGleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLageZumGleis(Lage_Zum_Gleis_TypeClass newLageZumGleis, NotificationChain msgs) {
		Lage_Zum_Gleis_TypeClass oldLageZumGleis = lageZumGleis;
		lageZumGleis = newLageZumGleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS, oldLageZumGleis, newLageZumGleis);
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
	public void setLageZumGleis(Lage_Zum_Gleis_TypeClass newLageZumGleis) {
		if (newLageZumGleis != lageZumGleis) {
			NotificationChain msgs = null;
			if (lageZumGleis != null)
				msgs = ((InternalEObject)lageZumGleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS, null, msgs);
			if (newLageZumGleis != null)
				msgs = ((InternalEObject)newLageZumGleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS, null, msgs);
			msgs = basicSetLageZumGleis(newLageZumGleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS, newLageZumGleis, newLageZumGleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Systemhoehe_TypeClass getSystemhoehe() {
		return systemhoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemhoehe(Systemhoehe_TypeClass newSystemhoehe, NotificationChain msgs) {
		Systemhoehe_TypeClass oldSystemhoehe = systemhoehe;
		systemhoehe = newSystemhoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE, oldSystemhoehe, newSystemhoehe);
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
	public void setSystemhoehe(Systemhoehe_TypeClass newSystemhoehe) {
		if (newSystemhoehe != systemhoehe) {
			NotificationChain msgs = null;
			if (systemhoehe != null)
				msgs = ((InternalEObject)systemhoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE, null, msgs);
			if (newSystemhoehe != null)
				msgs = ((InternalEObject)newSystemhoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE, null, msgs);
			msgs = basicSetSystemhoehe(newSystemhoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE, newSystemhoehe, newSystemhoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS:
				return basicSetLageZumGleis(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE:
				return basicSetSystemhoehe(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS:
				return getLageZumGleis();
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE:
				return getSystemhoehe();
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS:
				setLageZumGleis((Lage_Zum_Gleis_TypeClass)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE:
				setSystemhoehe((Systemhoehe_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS:
				setLageZumGleis((Lage_Zum_Gleis_TypeClass)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE:
				setSystemhoehe((Systemhoehe_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS:
				return lageZumGleis != null;
			case BahnsteigPackage.BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE:
				return systemhoehe != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bahnsteig_Kante_Allg_AttributeGroupImpl
