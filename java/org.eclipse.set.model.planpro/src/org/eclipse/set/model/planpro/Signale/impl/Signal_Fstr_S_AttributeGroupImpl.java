/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Signale.Gegengleis_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Fstr_S_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fstr SAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getGegengleis <em>Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getIDAnrueckverschluss <em>ID Anrueckverschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getIDZweitesHaltfallkriterium <em>ID Zweites Haltfallkriterium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fstr_S_AttributeGroupImpl extends EObjectImpl implements Signal_Fstr_S_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGegengleis() <em>Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGegengleis()
	 * @generated
	 * @ordered
	 */
	protected Gegengleis_TypeClass gegengleis;

	/**
	 * The cached value of the '{@link #getIDAnrueckverschluss() <em>ID Anrueckverschluss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnrueckverschluss()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Schaltmittel_Zuordnung_TypeClass> iDAnrueckverschluss;

	/**
	 * The cached value of the '{@link #getIDZweitesHaltfallkriterium() <em>ID Zweites Haltfallkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZweitesHaltfallkriterium()
	 * @generated
	 * @ordered
	 */
	protected ID_Zweites_Haltfallkriterium_TypeClass iDZweitesHaltfallkriterium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fstr_S_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FSTR_SATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gegengleis_TypeClass getGegengleis() {
		return gegengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGegengleis(Gegengleis_TypeClass newGegengleis, NotificationChain msgs) {
		Gegengleis_TypeClass oldGegengleis = gegengleis;
		gegengleis = newGegengleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, oldGegengleis, newGegengleis);
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
	public void setGegengleis(Gegengleis_TypeClass newGegengleis) {
		if (newGegengleis != gegengleis) {
			NotificationChain msgs = null;
			if (gegengleis != null)
				msgs = ((InternalEObject)gegengleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, null, msgs);
			if (newGegengleis != null)
				msgs = ((InternalEObject)newGegengleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, null, msgs);
			msgs = basicSetGegengleis(newGegengleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, newGegengleis, newGegengleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Schaltmittel_Zuordnung_TypeClass> getIDAnrueckverschluss() {
		if (iDAnrueckverschluss == null) {
			iDAnrueckverschluss = new EObjectContainmentEList<ID_Schaltmittel_Zuordnung_TypeClass>(ID_Schaltmittel_Zuordnung_TypeClass.class, this, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS);
		}
		return iDAnrueckverschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Zweites_Haltfallkriterium_TypeClass getIDZweitesHaltfallkriterium() {
		return iDZweitesHaltfallkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZweitesHaltfallkriterium(ID_Zweites_Haltfallkriterium_TypeClass newIDZweitesHaltfallkriterium, NotificationChain msgs) {
		ID_Zweites_Haltfallkriterium_TypeClass oldIDZweitesHaltfallkriterium = iDZweitesHaltfallkriterium;
		iDZweitesHaltfallkriterium = newIDZweitesHaltfallkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, oldIDZweitesHaltfallkriterium, newIDZweitesHaltfallkriterium);
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
	public void setIDZweitesHaltfallkriterium(ID_Zweites_Haltfallkriterium_TypeClass newIDZweitesHaltfallkriterium) {
		if (newIDZweitesHaltfallkriterium != iDZweitesHaltfallkriterium) {
			NotificationChain msgs = null;
			if (iDZweitesHaltfallkriterium != null)
				msgs = ((InternalEObject)iDZweitesHaltfallkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, null, msgs);
			if (newIDZweitesHaltfallkriterium != null)
				msgs = ((InternalEObject)newIDZweitesHaltfallkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, null, msgs);
			msgs = basicSetIDZweitesHaltfallkriterium(newIDZweitesHaltfallkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, newIDZweitesHaltfallkriterium, newIDZweitesHaltfallkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return basicSetGegengleis(null, msgs);
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				return ((InternalEList<?>)getIDAnrueckverschluss()).basicRemove(otherEnd, msgs);
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				return basicSetIDZweitesHaltfallkriterium(null, msgs);
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return getGegengleis();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				return getIDAnrueckverschluss();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				return getIDZweitesHaltfallkriterium();
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				setGegengleis((Gegengleis_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				getIDAnrueckverschluss().clear();
				getIDAnrueckverschluss().addAll((Collection<? extends ID_Schaltmittel_Zuordnung_TypeClass>)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				setIDZweitesHaltfallkriterium((ID_Zweites_Haltfallkriterium_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				setGegengleis((Gegengleis_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				getIDAnrueckverschluss().clear();
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				setIDZweitesHaltfallkriterium((ID_Zweites_Haltfallkriterium_TypeClass)null);
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return gegengleis != null;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				return iDAnrueckverschluss != null && !iDAnrueckverschluss.isEmpty();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				return iDZweitesHaltfallkriterium != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Fstr_S_AttributeGroupImpl
