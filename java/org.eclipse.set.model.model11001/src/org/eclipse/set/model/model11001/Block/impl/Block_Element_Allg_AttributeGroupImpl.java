/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Block.BlockPackage;
import org.eclipse.set.model.model11001.Block.Block_Bauform_TypeClass;
import org.eclipse.set.model.model11001.Block.Block_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Block.Rueckblockwecker_TypeClass;
import org.eclipse.set.model.model11001.Block.Vorblockwecker_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_Element_Allg_AttributeGroupImpl#getBlockBauform <em>Block Bauform</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_Element_Allg_AttributeGroupImpl#getRueckblockwecker <em>Rueckblockwecker</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_Element_Allg_AttributeGroupImpl#getVorblockwecker <em>Vorblockwecker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_Element_Allg_AttributeGroupImpl extends EObjectImpl implements Block_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBlockBauform() <em>Block Bauform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockBauform()
	 * @generated
	 * @ordered
	 */
	protected Block_Bauform_TypeClass blockBauform;

	/**
	 * The cached value of the '{@link #getRueckblockwecker() <em>Rueckblockwecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckblockwecker()
	 * @generated
	 * @ordered
	 */
	protected Rueckblockwecker_TypeClass rueckblockwecker;

	/**
	 * The cached value of the '{@link #getVorblockwecker() <em>Vorblockwecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorblockwecker()
	 * @generated
	 * @ordered
	 */
	protected Vorblockwecker_TypeClass vorblockwecker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Bauform_TypeClass getBlockBauform() {
		return blockBauform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockBauform(Block_Bauform_TypeClass newBlockBauform, NotificationChain msgs) {
		Block_Bauform_TypeClass oldBlockBauform = blockBauform;
		blockBauform = newBlockBauform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM, oldBlockBauform, newBlockBauform);
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
	public void setBlockBauform(Block_Bauform_TypeClass newBlockBauform) {
		if (newBlockBauform != blockBauform) {
			NotificationChain msgs = null;
			if (blockBauform != null)
				msgs = ((InternalEObject)blockBauform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM, null, msgs);
			if (newBlockBauform != null)
				msgs = ((InternalEObject)newBlockBauform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM, null, msgs);
			msgs = basicSetBlockBauform(newBlockBauform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM, newBlockBauform, newBlockBauform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rueckblockwecker_TypeClass getRueckblockwecker() {
		return rueckblockwecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRueckblockwecker(Rueckblockwecker_TypeClass newRueckblockwecker, NotificationChain msgs) {
		Rueckblockwecker_TypeClass oldRueckblockwecker = rueckblockwecker;
		rueckblockwecker = newRueckblockwecker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER, oldRueckblockwecker, newRueckblockwecker);
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
	public void setRueckblockwecker(Rueckblockwecker_TypeClass newRueckblockwecker) {
		if (newRueckblockwecker != rueckblockwecker) {
			NotificationChain msgs = null;
			if (rueckblockwecker != null)
				msgs = ((InternalEObject)rueckblockwecker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER, null, msgs);
			if (newRueckblockwecker != null)
				msgs = ((InternalEObject)newRueckblockwecker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER, null, msgs);
			msgs = basicSetRueckblockwecker(newRueckblockwecker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER, newRueckblockwecker, newRueckblockwecker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorblockwecker_TypeClass getVorblockwecker() {
		return vorblockwecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorblockwecker(Vorblockwecker_TypeClass newVorblockwecker, NotificationChain msgs) {
		Vorblockwecker_TypeClass oldVorblockwecker = vorblockwecker;
		vorblockwecker = newVorblockwecker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER, oldVorblockwecker, newVorblockwecker);
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
	public void setVorblockwecker(Vorblockwecker_TypeClass newVorblockwecker) {
		if (newVorblockwecker != vorblockwecker) {
			NotificationChain msgs = null;
			if (vorblockwecker != null)
				msgs = ((InternalEObject)vorblockwecker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER, null, msgs);
			if (newVorblockwecker != null)
				msgs = ((InternalEObject)newVorblockwecker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER, null, msgs);
			msgs = basicSetVorblockwecker(newVorblockwecker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER, newVorblockwecker, newVorblockwecker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM:
				return basicSetBlockBauform(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER:
				return basicSetRueckblockwecker(null, msgs);
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER:
				return basicSetVorblockwecker(null, msgs);
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
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM:
				return getBlockBauform();
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER:
				return getRueckblockwecker();
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER:
				return getVorblockwecker();
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
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM:
				setBlockBauform((Block_Bauform_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER:
				setRueckblockwecker((Rueckblockwecker_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER:
				setVorblockwecker((Vorblockwecker_TypeClass)newValue);
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
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM:
				setBlockBauform((Block_Bauform_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER:
				setRueckblockwecker((Rueckblockwecker_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER:
				setVorblockwecker((Vorblockwecker_TypeClass)null);
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
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM:
				return blockBauform != null;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER:
				return rueckblockwecker != null;
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER:
				return vorblockwecker != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_Element_Allg_AttributeGroupImpl
