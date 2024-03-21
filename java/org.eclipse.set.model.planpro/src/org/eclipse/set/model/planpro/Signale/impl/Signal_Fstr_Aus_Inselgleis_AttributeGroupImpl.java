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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fstr Aus Inselgleis Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl#getIDRaFahrtGleichzeitigVerbot <em>ID Ra Fahrt Gleichzeitig Verbot</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl#getIDZgFahrtGleichzeitigVerbot <em>ID Zg Fahrt Gleichzeitig Verbot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl extends EObjectImpl implements Signal_Fstr_Aus_Inselgleis_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDRaFahrtGleichzeitigVerbot() <em>ID Ra Fahrt Gleichzeitig Verbot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRaFahrtGleichzeitigVerbot()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_Gleisbezechnung_TypeClass> iDRaFahrtGleichzeitigVerbot;

	/**
	 * The cached value of the '{@link #getIDZgFahrtGleichzeitigVerbot() <em>ID Zg Fahrt Gleichzeitig Verbot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZgFahrtGleichzeitigVerbot()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_Gleisbezechnung_TypeClass> iDZgFahrtGleichzeitigVerbot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_Gleisbezechnung_TypeClass> getIDRaFahrtGleichzeitigVerbot() {
		if (iDRaFahrtGleichzeitigVerbot == null) {
			iDRaFahrtGleichzeitigVerbot = new EObjectContainmentEList<ID_Signal_Gleisbezechnung_TypeClass>(ID_Signal_Gleisbezechnung_TypeClass.class, this, SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT);
		}
		return iDRaFahrtGleichzeitigVerbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_Gleisbezechnung_TypeClass> getIDZgFahrtGleichzeitigVerbot() {
		if (iDZgFahrtGleichzeitigVerbot == null) {
			iDZgFahrtGleichzeitigVerbot = new EObjectContainmentEList<ID_Signal_Gleisbezechnung_TypeClass>(ID_Signal_Gleisbezechnung_TypeClass.class, this, SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT);
		}
		return iDZgFahrtGleichzeitigVerbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				return ((InternalEList<?>)getIDRaFahrtGleichzeitigVerbot()).basicRemove(otherEnd, msgs);
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				return ((InternalEList<?>)getIDZgFahrtGleichzeitigVerbot()).basicRemove(otherEnd, msgs);
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				return getIDRaFahrtGleichzeitigVerbot();
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				return getIDZgFahrtGleichzeitigVerbot();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				getIDRaFahrtGleichzeitigVerbot().clear();
				getIDRaFahrtGleichzeitigVerbot().addAll((Collection<? extends ID_Signal_Gleisbezechnung_TypeClass>)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				getIDZgFahrtGleichzeitigVerbot().clear();
				getIDZgFahrtGleichzeitigVerbot().addAll((Collection<? extends ID_Signal_Gleisbezechnung_TypeClass>)newValue);
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				getIDRaFahrtGleichzeitigVerbot().clear();
				return;
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				getIDZgFahrtGleichzeitigVerbot().clear();
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				return iDRaFahrtGleichzeitigVerbot != null && !iDRaFahrtGleichzeitigVerbot.isEmpty();
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				return iDZgFahrtGleichzeitigVerbot != null && !iDZgFahrtGleichzeitigVerbot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl
