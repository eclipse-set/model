/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Block.Auto_Erlaubnisholen_TypeClass;
import org.eclipse.set.model.planpro.Block.Auto_Erlaubnisruecklauf_TypeClass;
import org.eclipse.set.model.planpro.Block.BlockPackage;
import org.eclipse.set.model.planpro.Block.Block_Element_Erlaubnis_AttributeGroup;
import org.eclipse.set.model.planpro.Block.Erlaubnis_Staendig_Vorhanden_TypeClass;
import org.eclipse.set.model.planpro.Block.Erlaubnisabgabespeicherung_TypeClass;
import org.eclipse.set.model.planpro.Block.Erlaubnisholen_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Element Erlaubnis Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl#getAutoErlaubnisholen <em>Auto Erlaubnisholen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl#getAutoErlaubnisruecklauf <em>Auto Erlaubnisruecklauf</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl#getErlaubnisStaendigVorhanden <em>Erlaubnis Staendig Vorhanden</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl#getErlaubnisabgabespeicherung <em>Erlaubnisabgabespeicherung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Element_Erlaubnis_AttributeGroupImpl#getErlaubnisholen <em>Erlaubnisholen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_Element_Erlaubnis_AttributeGroupImpl extends EObjectImpl implements Block_Element_Erlaubnis_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutoErlaubnisholen() <em>Auto Erlaubnisholen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoErlaubnisholen()
	 * @generated
	 * @ordered
	 */
	protected Auto_Erlaubnisholen_TypeClass autoErlaubnisholen;

	/**
	 * The cached value of the '{@link #getAutoErlaubnisruecklauf() <em>Auto Erlaubnisruecklauf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoErlaubnisruecklauf()
	 * @generated
	 * @ordered
	 */
	protected Auto_Erlaubnisruecklauf_TypeClass autoErlaubnisruecklauf;

	/**
	 * The cached value of the '{@link #getErlaubnisStaendigVorhanden() <em>Erlaubnis Staendig Vorhanden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErlaubnisStaendigVorhanden()
	 * @generated
	 * @ordered
	 */
	protected Erlaubnis_Staendig_Vorhanden_TypeClass erlaubnisStaendigVorhanden;

	/**
	 * The cached value of the '{@link #getErlaubnisabgabespeicherung() <em>Erlaubnisabgabespeicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErlaubnisabgabespeicherung()
	 * @generated
	 * @ordered
	 */
	protected Erlaubnisabgabespeicherung_TypeClass erlaubnisabgabespeicherung;

	/**
	 * The cached value of the '{@link #getErlaubnisholen() <em>Erlaubnisholen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErlaubnisholen()
	 * @generated
	 * @ordered
	 */
	protected Erlaubnisholen_TypeClass erlaubnisholen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_Element_Erlaubnis_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Erlaubnisholen_TypeClass getAutoErlaubnisholen() {
		return autoErlaubnisholen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoErlaubnisholen(Auto_Erlaubnisholen_TypeClass newAutoErlaubnisholen, NotificationChain msgs) {
		Auto_Erlaubnisholen_TypeClass oldAutoErlaubnisholen = autoErlaubnisholen;
		autoErlaubnisholen = newAutoErlaubnisholen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN, oldAutoErlaubnisholen, newAutoErlaubnisholen);
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
	public void setAutoErlaubnisholen(Auto_Erlaubnisholen_TypeClass newAutoErlaubnisholen) {
		if (newAutoErlaubnisholen != autoErlaubnisholen) {
			NotificationChain msgs = null;
			if (autoErlaubnisholen != null)
				msgs = ((InternalEObject)autoErlaubnisholen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN, null, msgs);
			if (newAutoErlaubnisholen != null)
				msgs = ((InternalEObject)newAutoErlaubnisholen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN, null, msgs);
			msgs = basicSetAutoErlaubnisholen(newAutoErlaubnisholen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN, newAutoErlaubnisholen, newAutoErlaubnisholen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Erlaubnisruecklauf_TypeClass getAutoErlaubnisruecklauf() {
		return autoErlaubnisruecklauf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoErlaubnisruecklauf(Auto_Erlaubnisruecklauf_TypeClass newAutoErlaubnisruecklauf, NotificationChain msgs) {
		Auto_Erlaubnisruecklauf_TypeClass oldAutoErlaubnisruecklauf = autoErlaubnisruecklauf;
		autoErlaubnisruecklauf = newAutoErlaubnisruecklauf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF, oldAutoErlaubnisruecklauf, newAutoErlaubnisruecklauf);
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
	public void setAutoErlaubnisruecklauf(Auto_Erlaubnisruecklauf_TypeClass newAutoErlaubnisruecklauf) {
		if (newAutoErlaubnisruecklauf != autoErlaubnisruecklauf) {
			NotificationChain msgs = null;
			if (autoErlaubnisruecklauf != null)
				msgs = ((InternalEObject)autoErlaubnisruecklauf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF, null, msgs);
			if (newAutoErlaubnisruecklauf != null)
				msgs = ((InternalEObject)newAutoErlaubnisruecklauf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF, null, msgs);
			msgs = basicSetAutoErlaubnisruecklauf(newAutoErlaubnisruecklauf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF, newAutoErlaubnisruecklauf, newAutoErlaubnisruecklauf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnis_Staendig_Vorhanden_TypeClass getErlaubnisStaendigVorhanden() {
		return erlaubnisStaendigVorhanden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErlaubnisStaendigVorhanden(Erlaubnis_Staendig_Vorhanden_TypeClass newErlaubnisStaendigVorhanden, NotificationChain msgs) {
		Erlaubnis_Staendig_Vorhanden_TypeClass oldErlaubnisStaendigVorhanden = erlaubnisStaendigVorhanden;
		erlaubnisStaendigVorhanden = newErlaubnisStaendigVorhanden;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN, oldErlaubnisStaendigVorhanden, newErlaubnisStaendigVorhanden);
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
	public void setErlaubnisStaendigVorhanden(Erlaubnis_Staendig_Vorhanden_TypeClass newErlaubnisStaendigVorhanden) {
		if (newErlaubnisStaendigVorhanden != erlaubnisStaendigVorhanden) {
			NotificationChain msgs = null;
			if (erlaubnisStaendigVorhanden != null)
				msgs = ((InternalEObject)erlaubnisStaendigVorhanden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN, null, msgs);
			if (newErlaubnisStaendigVorhanden != null)
				msgs = ((InternalEObject)newErlaubnisStaendigVorhanden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN, null, msgs);
			msgs = basicSetErlaubnisStaendigVorhanden(newErlaubnisStaendigVorhanden, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN, newErlaubnisStaendigVorhanden, newErlaubnisStaendigVorhanden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnisabgabespeicherung_TypeClass getErlaubnisabgabespeicherung() {
		return erlaubnisabgabespeicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErlaubnisabgabespeicherung(Erlaubnisabgabespeicherung_TypeClass newErlaubnisabgabespeicherung, NotificationChain msgs) {
		Erlaubnisabgabespeicherung_TypeClass oldErlaubnisabgabespeicherung = erlaubnisabgabespeicherung;
		erlaubnisabgabespeicherung = newErlaubnisabgabespeicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG, oldErlaubnisabgabespeicherung, newErlaubnisabgabespeicherung);
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
	public void setErlaubnisabgabespeicherung(Erlaubnisabgabespeicherung_TypeClass newErlaubnisabgabespeicherung) {
		if (newErlaubnisabgabespeicherung != erlaubnisabgabespeicherung) {
			NotificationChain msgs = null;
			if (erlaubnisabgabespeicherung != null)
				msgs = ((InternalEObject)erlaubnisabgabespeicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG, null, msgs);
			if (newErlaubnisabgabespeicherung != null)
				msgs = ((InternalEObject)newErlaubnisabgabespeicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG, null, msgs);
			msgs = basicSetErlaubnisabgabespeicherung(newErlaubnisabgabespeicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG, newErlaubnisabgabespeicherung, newErlaubnisabgabespeicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erlaubnisholen_TypeClass getErlaubnisholen() {
		return erlaubnisholen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErlaubnisholen(Erlaubnisholen_TypeClass newErlaubnisholen, NotificationChain msgs) {
		Erlaubnisholen_TypeClass oldErlaubnisholen = erlaubnisholen;
		erlaubnisholen = newErlaubnisholen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN, oldErlaubnisholen, newErlaubnisholen);
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
	public void setErlaubnisholen(Erlaubnisholen_TypeClass newErlaubnisholen) {
		if (newErlaubnisholen != erlaubnisholen) {
			NotificationChain msgs = null;
			if (erlaubnisholen != null)
				msgs = ((InternalEObject)erlaubnisholen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN, null, msgs);
			if (newErlaubnisholen != null)
				msgs = ((InternalEObject)newErlaubnisholen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN, null, msgs);
			msgs = basicSetErlaubnisholen(newErlaubnisholen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN, newErlaubnisholen, newErlaubnisholen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN:
				return basicSetAutoErlaubnisholen(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF:
				return basicSetAutoErlaubnisruecklauf(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN:
				return basicSetErlaubnisStaendigVorhanden(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG:
				return basicSetErlaubnisabgabespeicherung(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN:
				return basicSetErlaubnisholen(null, msgs);
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
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN:
				return getAutoErlaubnisholen();
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF:
				return getAutoErlaubnisruecklauf();
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN:
				return getErlaubnisStaendigVorhanden();
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG:
				return getErlaubnisabgabespeicherung();
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN:
				return getErlaubnisholen();
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
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN:
				setAutoErlaubnisholen((Auto_Erlaubnisholen_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF:
				setAutoErlaubnisruecklauf((Auto_Erlaubnisruecklauf_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN:
				setErlaubnisStaendigVorhanden((Erlaubnis_Staendig_Vorhanden_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG:
				setErlaubnisabgabespeicherung((Erlaubnisabgabespeicherung_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN:
				setErlaubnisholen((Erlaubnisholen_TypeClass)newValue);
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
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN:
				setAutoErlaubnisholen((Auto_Erlaubnisholen_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF:
				setAutoErlaubnisruecklauf((Auto_Erlaubnisruecklauf_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN:
				setErlaubnisStaendigVorhanden((Erlaubnis_Staendig_Vorhanden_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG:
				setErlaubnisabgabespeicherung((Erlaubnisabgabespeicherung_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN:
				setErlaubnisholen((Erlaubnisholen_TypeClass)null);
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
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN:
				return autoErlaubnisholen != null;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF:
				return autoErlaubnisruecklauf != null;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN:
				return erlaubnisStaendigVorhanden != null;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG:
				return erlaubnisabgabespeicherung != null;
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN:
				return erlaubnisholen != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Block_Element_Erlaubnis_AttributeGroupImpl
