/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.PlanPro.Bemerkung_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Erzeugung_Zeitstempel_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Werkzeug_Name_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Werkzeug_Version_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Pro Schnittstelle Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.PlanPro_Schnittstelle_Allg_AttributeGroupImpl#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.PlanPro_Schnittstelle_Allg_AttributeGroupImpl#getErzeugungZeitstempel <em>Erzeugung Zeitstempel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.PlanPro_Schnittstelle_Allg_AttributeGroupImpl#getWerkzeugName <em>Werkzeug Name</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.PlanPro_Schnittstelle_Allg_AttributeGroupImpl#getWerkzeugVersion <em>Werkzeug Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanPro_Schnittstelle_Allg_AttributeGroupImpl extends EObjectImpl implements PlanPro_Schnittstelle_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected Bemerkung_TypeClass bemerkung;

	/**
	 * The cached value of the '{@link #getErzeugungZeitstempel() <em>Erzeugung Zeitstempel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErzeugungZeitstempel()
	 * @generated
	 * @ordered
	 */
	protected Erzeugung_Zeitstempel_TypeClass erzeugungZeitstempel;

	/**
	 * The cached value of the '{@link #getWerkzeugName() <em>Werkzeug Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWerkzeugName()
	 * @generated
	 * @ordered
	 */
	protected Werkzeug_Name_TypeClass werkzeugName;

	/**
	 * The cached value of the '{@link #getWerkzeugVersion() <em>Werkzeug Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWerkzeugVersion()
	 * @generated
	 * @ordered
	 */
	protected Werkzeug_Version_TypeClass werkzeugVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanPro_Schnittstelle_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bemerkung_TypeClass getBemerkung() {
		return bemerkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBemerkung(Bemerkung_TypeClass newBemerkung, NotificationChain msgs) {
		Bemerkung_TypeClass oldBemerkung = bemerkung;
		bemerkung = newBemerkung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG, oldBemerkung, newBemerkung);
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
	public void setBemerkung(Bemerkung_TypeClass newBemerkung) {
		if (newBemerkung != bemerkung) {
			NotificationChain msgs = null;
			if (bemerkung != null)
				msgs = ((InternalEObject)bemerkung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG, null, msgs);
			if (newBemerkung != null)
				msgs = ((InternalEObject)newBemerkung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG, null, msgs);
			msgs = basicSetBemerkung(newBemerkung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG, newBemerkung, newBemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erzeugung_Zeitstempel_TypeClass getErzeugungZeitstempel() {
		return erzeugungZeitstempel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErzeugungZeitstempel(Erzeugung_Zeitstempel_TypeClass newErzeugungZeitstempel, NotificationChain msgs) {
		Erzeugung_Zeitstempel_TypeClass oldErzeugungZeitstempel = erzeugungZeitstempel;
		erzeugungZeitstempel = newErzeugungZeitstempel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL, oldErzeugungZeitstempel, newErzeugungZeitstempel);
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
	public void setErzeugungZeitstempel(Erzeugung_Zeitstempel_TypeClass newErzeugungZeitstempel) {
		if (newErzeugungZeitstempel != erzeugungZeitstempel) {
			NotificationChain msgs = null;
			if (erzeugungZeitstempel != null)
				msgs = ((InternalEObject)erzeugungZeitstempel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL, null, msgs);
			if (newErzeugungZeitstempel != null)
				msgs = ((InternalEObject)newErzeugungZeitstempel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL, null, msgs);
			msgs = basicSetErzeugungZeitstempel(newErzeugungZeitstempel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL, newErzeugungZeitstempel, newErzeugungZeitstempel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Werkzeug_Name_TypeClass getWerkzeugName() {
		return werkzeugName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWerkzeugName(Werkzeug_Name_TypeClass newWerkzeugName, NotificationChain msgs) {
		Werkzeug_Name_TypeClass oldWerkzeugName = werkzeugName;
		werkzeugName = newWerkzeugName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME, oldWerkzeugName, newWerkzeugName);
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
	public void setWerkzeugName(Werkzeug_Name_TypeClass newWerkzeugName) {
		if (newWerkzeugName != werkzeugName) {
			NotificationChain msgs = null;
			if (werkzeugName != null)
				msgs = ((InternalEObject)werkzeugName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME, null, msgs);
			if (newWerkzeugName != null)
				msgs = ((InternalEObject)newWerkzeugName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME, null, msgs);
			msgs = basicSetWerkzeugName(newWerkzeugName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME, newWerkzeugName, newWerkzeugName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Werkzeug_Version_TypeClass getWerkzeugVersion() {
		return werkzeugVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWerkzeugVersion(Werkzeug_Version_TypeClass newWerkzeugVersion, NotificationChain msgs) {
		Werkzeug_Version_TypeClass oldWerkzeugVersion = werkzeugVersion;
		werkzeugVersion = newWerkzeugVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION, oldWerkzeugVersion, newWerkzeugVersion);
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
	public void setWerkzeugVersion(Werkzeug_Version_TypeClass newWerkzeugVersion) {
		if (newWerkzeugVersion != werkzeugVersion) {
			NotificationChain msgs = null;
			if (werkzeugVersion != null)
				msgs = ((InternalEObject)werkzeugVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION, null, msgs);
			if (newWerkzeugVersion != null)
				msgs = ((InternalEObject)newWerkzeugVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION, null, msgs);
			msgs = basicSetWerkzeugVersion(newWerkzeugVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION, newWerkzeugVersion, newWerkzeugVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG:
				return basicSetBemerkung(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL:
				return basicSetErzeugungZeitstempel(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME:
				return basicSetWerkzeugName(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION:
				return basicSetWerkzeugVersion(null, msgs);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG:
				return getBemerkung();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL:
				return getErzeugungZeitstempel();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME:
				return getWerkzeugName();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION:
				return getWerkzeugVersion();
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG:
				setBemerkung((Bemerkung_TypeClass)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL:
				setErzeugungZeitstempel((Erzeugung_Zeitstempel_TypeClass)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME:
				setWerkzeugName((Werkzeug_Name_TypeClass)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION:
				setWerkzeugVersion((Werkzeug_Version_TypeClass)newValue);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG:
				setBemerkung((Bemerkung_TypeClass)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL:
				setErzeugungZeitstempel((Erzeugung_Zeitstempel_TypeClass)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME:
				setWerkzeugName((Werkzeug_Name_TypeClass)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION:
				setWerkzeugVersion((Werkzeug_Version_TypeClass)null);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BEMERKUNG:
				return bemerkung != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__ERZEUGUNG_ZEITSTEMPEL:
				return erzeugungZeitstempel != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_NAME:
				return werkzeugName != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__WERKZEUG_VERSION:
				return werkzeugVersion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PlanPro_Schnittstelle_Allg_AttributeGroupImpl
