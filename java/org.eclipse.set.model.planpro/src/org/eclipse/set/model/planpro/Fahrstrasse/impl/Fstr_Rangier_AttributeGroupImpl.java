/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

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

import org.eclipse.set.model.planpro.Fahrstrasse.Automatische_Einstellung_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Art_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_AttributeGroup;
import org.eclipse.set.model.planpro.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Rangier Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl#getAutomatischeEinstellung <em>Automatische Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl#getFstrRangierArt <em>Fstr Rangier Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl#getIDFMAAnlageRangierFrei <em>IDFMA Anlage Rangier Frei</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Rangier_AttributeGroupImpl#getRangierGegenfahrtausschluss <em>Rangier Gegenfahrtausschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Rangier_AttributeGroupImpl extends EObjectImpl implements Fstr_Rangier_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutomatischeEinstellung() <em>Automatische Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomatischeEinstellung()
	 * @generated
	 * @ordered
	 */
	protected Automatische_Einstellung_TypeClass automatischeEinstellung;

	/**
	 * The cached value of the '{@link #getFstrRangierArt() <em>Fstr Rangier Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrRangierArt()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Rangier_Art_TypeClass fstrRangierArt;

	/**
	 * The cached value of the '{@link #getIDFMAAnlageRangierFrei() <em>IDFMA Anlage Rangier Frei</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlageRangierFrei()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_FMA_Anlage_Rangier_Frei_TypeClass> iDFMAAnlageRangierFrei;

	/**
	 * The cached value of the '{@link #getRangierGegenfahrtausschluss() <em>Rangier Gegenfahrtausschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangierGegenfahrtausschluss()
	 * @generated
	 * @ordered
	 */
	protected Rangier_Gegenfahrtausschluss_TypeClass rangierGegenfahrtausschluss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Rangier_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_RANGIER_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Automatische_Einstellung_TypeClass getAutomatischeEinstellung() {
		return automatischeEinstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung, NotificationChain msgs) {
		Automatische_Einstellung_TypeClass oldAutomatischeEinstellung = automatischeEinstellung;
		automatischeEinstellung = newAutomatischeEinstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, oldAutomatischeEinstellung, newAutomatischeEinstellung);
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
	public void setAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung) {
		if (newAutomatischeEinstellung != automatischeEinstellung) {
			NotificationChain msgs = null;
			if (automatischeEinstellung != null)
				msgs = ((InternalEObject)automatischeEinstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			if (newAutomatischeEinstellung != null)
				msgs = ((InternalEObject)newAutomatischeEinstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			msgs = basicSetAutomatischeEinstellung(newAutomatischeEinstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, newAutomatischeEinstellung, newAutomatischeEinstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Rangier_Art_TypeClass getFstrRangierArt() {
		return fstrRangierArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrRangierArt(Fstr_Rangier_Art_TypeClass newFstrRangierArt, NotificationChain msgs) {
		Fstr_Rangier_Art_TypeClass oldFstrRangierArt = fstrRangierArt;
		fstrRangierArt = newFstrRangierArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART, oldFstrRangierArt, newFstrRangierArt);
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
	public void setFstrRangierArt(Fstr_Rangier_Art_TypeClass newFstrRangierArt) {
		if (newFstrRangierArt != fstrRangierArt) {
			NotificationChain msgs = null;
			if (fstrRangierArt != null)
				msgs = ((InternalEObject)fstrRangierArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART, null, msgs);
			if (newFstrRangierArt != null)
				msgs = ((InternalEObject)newFstrRangierArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART, null, msgs);
			msgs = basicSetFstrRangierArt(newFstrRangierArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART, newFstrRangierArt, newFstrRangierArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_FMA_Anlage_Rangier_Frei_TypeClass> getIDFMAAnlageRangierFrei() {
		if (iDFMAAnlageRangierFrei == null) {
			iDFMAAnlageRangierFrei = new EObjectContainmentEList<ID_FMA_Anlage_Rangier_Frei_TypeClass>(ID_FMA_Anlage_Rangier_Frei_TypeClass.class, this, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI);
		}
		return iDFMAAnlageRangierFrei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rangier_Gegenfahrtausschluss_TypeClass getRangierGegenfahrtausschluss() {
		return rangierGegenfahrtausschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangierGegenfahrtausschluss(Rangier_Gegenfahrtausschluss_TypeClass newRangierGegenfahrtausschluss, NotificationChain msgs) {
		Rangier_Gegenfahrtausschluss_TypeClass oldRangierGegenfahrtausschluss = rangierGegenfahrtausschluss;
		rangierGegenfahrtausschluss = newRangierGegenfahrtausschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS, oldRangierGegenfahrtausschluss, newRangierGegenfahrtausschluss);
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
	public void setRangierGegenfahrtausschluss(Rangier_Gegenfahrtausschluss_TypeClass newRangierGegenfahrtausschluss) {
		if (newRangierGegenfahrtausschluss != rangierGegenfahrtausschluss) {
			NotificationChain msgs = null;
			if (rangierGegenfahrtausschluss != null)
				msgs = ((InternalEObject)rangierGegenfahrtausschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS, null, msgs);
			if (newRangierGegenfahrtausschluss != null)
				msgs = ((InternalEObject)newRangierGegenfahrtausschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS, null, msgs);
			msgs = basicSetRangierGegenfahrtausschluss(newRangierGegenfahrtausschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS, newRangierGegenfahrtausschluss, newRangierGegenfahrtausschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return basicSetAutomatischeEinstellung(null, msgs);
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART:
				return basicSetFstrRangierArt(null, msgs);
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI:
				return ((InternalEList<?>)getIDFMAAnlageRangierFrei()).basicRemove(otherEnd, msgs);
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS:
				return basicSetRangierGegenfahrtausschluss(null, msgs);
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
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return getAutomatischeEinstellung();
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART:
				return getFstrRangierArt();
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI:
				return getIDFMAAnlageRangierFrei();
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS:
				return getRangierGegenfahrtausschluss();
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
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART:
				setFstrRangierArt((Fstr_Rangier_Art_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI:
				getIDFMAAnlageRangierFrei().clear();
				getIDFMAAnlageRangierFrei().addAll((Collection<? extends ID_FMA_Anlage_Rangier_Frei_TypeClass>)newValue);
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS:
				setRangierGegenfahrtausschluss((Rangier_Gegenfahrtausschluss_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART:
				setFstrRangierArt((Fstr_Rangier_Art_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI:
				getIDFMAAnlageRangierFrei().clear();
				return;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS:
				setRangierGegenfahrtausschluss((Rangier_Gegenfahrtausschluss_TypeClass)null);
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
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return automatischeEinstellung != null;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART:
				return fstrRangierArt != null;
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI:
				return iDFMAAnlageRangierFrei != null && !iDFMAAnlageRangierFrei.isEmpty();
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS:
				return rangierGegenfahrtausschluss != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Rangier_AttributeGroupImpl
