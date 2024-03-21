/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Energieversorgung_Art_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AEA Energieversorgung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Energieversorgung_AttributeGroupImpl#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Energieversorgung_AttributeGroupImpl#getIDEnergieSekundaer <em>ID Energie Sekundaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Energieversorgung_AttributeGroupImpl#getEnergieversorgungArt <em>Energieversorgung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Energieversorgung_AttributeGroupImpl#getIDEnergiePrimaer <em>ID Energie Primaer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AEA_Energieversorgung_AttributeGroupImpl extends EObjectImpl implements AEA_Energieversorgung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEnergieversorgungArtErsatz() <em>Energieversorgung Art Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArtErsatz()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_Ersatz_TypeClass energieversorgungArtErsatz;

	/**
	 * The cached value of the '{@link #getIDEnergieSekundaer() <em>ID Energie Sekundaer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergieSekundaer()
	 * @generated
	 * @ordered
	 */
	protected ID_Energie_TypeClass iDEnergieSekundaer;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArt() <em>Energieversorgung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArt()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_TypeClass energieversorgungArt;

	/**
	 * The cached value of the '{@link #getIDEnergiePrimaer() <em>ID Energie Primaer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergiePrimaer()
	 * @generated
	 * @ordered
	 */
	protected ID_Energie_TypeClass iDEnergiePrimaer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEA_Energieversorgung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz() {
		return energieversorgungArtErsatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz, NotificationChain msgs) {
		Energieversorgung_Art_Ersatz_TypeClass oldEnergieversorgungArtErsatz = energieversorgungArtErsatz;
		energieversorgungArtErsatz = newEnergieversorgungArtErsatz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, oldEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz);
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
	public void setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz) {
		if (newEnergieversorgungArtErsatz != energieversorgungArtErsatz) {
			NotificationChain msgs = null;
			if (energieversorgungArtErsatz != null)
				msgs = ((InternalEObject)energieversorgungArtErsatz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			if (newEnergieversorgungArtErsatz != null)
				msgs = ((InternalEObject)newEnergieversorgungArtErsatz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			msgs = basicSetEnergieversorgungArtErsatz(newEnergieversorgungArtErsatz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, newEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Energie_TypeClass getIDEnergieSekundaer() {
		return iDEnergieSekundaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEnergieSekundaer(ID_Energie_TypeClass newIDEnergieSekundaer, NotificationChain msgs) {
		ID_Energie_TypeClass oldIDEnergieSekundaer = iDEnergieSekundaer;
		iDEnergieSekundaer = newIDEnergieSekundaer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, oldIDEnergieSekundaer, newIDEnergieSekundaer);
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
	public void setIDEnergieSekundaer(ID_Energie_TypeClass newIDEnergieSekundaer) {
		if (newIDEnergieSekundaer != iDEnergieSekundaer) {
			NotificationChain msgs = null;
			if (iDEnergieSekundaer != null)
				msgs = ((InternalEObject)iDEnergieSekundaer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, null, msgs);
			if (newIDEnergieSekundaer != null)
				msgs = ((InternalEObject)newIDEnergieSekundaer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, null, msgs);
			msgs = basicSetIDEnergieSekundaer(newIDEnergieSekundaer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, newIDEnergieSekundaer, newIDEnergieSekundaer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_TypeClass getEnergieversorgungArt() {
		return energieversorgungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt, NotificationChain msgs) {
		Energieversorgung_Art_TypeClass oldEnergieversorgungArt = energieversorgungArt;
		energieversorgungArt = newEnergieversorgungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, oldEnergieversorgungArt, newEnergieversorgungArt);
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
	public void setEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt) {
		if (newEnergieversorgungArt != energieversorgungArt) {
			NotificationChain msgs = null;
			if (energieversorgungArt != null)
				msgs = ((InternalEObject)energieversorgungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			if (newEnergieversorgungArt != null)
				msgs = ((InternalEObject)newEnergieversorgungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			msgs = basicSetEnergieversorgungArt(newEnergieversorgungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, newEnergieversorgungArt, newEnergieversorgungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Energie_TypeClass getIDEnergiePrimaer() {
		return iDEnergiePrimaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEnergiePrimaer(ID_Energie_TypeClass newIDEnergiePrimaer, NotificationChain msgs) {
		ID_Energie_TypeClass oldIDEnergiePrimaer = iDEnergiePrimaer;
		iDEnergiePrimaer = newIDEnergiePrimaer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, oldIDEnergiePrimaer, newIDEnergiePrimaer);
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
	public void setIDEnergiePrimaer(ID_Energie_TypeClass newIDEnergiePrimaer) {
		if (newIDEnergiePrimaer != iDEnergiePrimaer) {
			NotificationChain msgs = null;
			if (iDEnergiePrimaer != null)
				msgs = ((InternalEObject)iDEnergiePrimaer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, null, msgs);
			if (newIDEnergiePrimaer != null)
				msgs = ((InternalEObject)newIDEnergiePrimaer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, null, msgs);
			msgs = basicSetIDEnergiePrimaer(newIDEnergiePrimaer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, newIDEnergiePrimaer, newIDEnergiePrimaer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return basicSetEnergieversorgungArtErsatz(null, msgs);
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				return basicSetIDEnergieSekundaer(null, msgs);
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return basicSetEnergieversorgungArt(null, msgs);
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				return basicSetIDEnergiePrimaer(null, msgs);
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
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return getEnergieversorgungArtErsatz();
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				return getIDEnergieSekundaer();
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return getEnergieversorgungArt();
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				return getIDEnergiePrimaer();
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
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				setIDEnergieSekundaer((ID_Energie_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				setIDEnergiePrimaer((ID_Energie_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				setIDEnergieSekundaer((ID_Energie_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				setIDEnergiePrimaer((ID_Energie_TypeClass)null);
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
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return energieversorgungArtErsatz != null;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				return iDEnergieSekundaer != null;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return energieversorgungArt != null;
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				return iDEnergiePrimaer != null;
		}
		return super.eIsSet(featureID);
	}

} //AEA_Energieversorgung_AttributeGroupImpl
