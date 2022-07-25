/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Block.BlockPackage;
import org.eclipse.set.model.model1902.Block.Block_Anlage;
import org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Block_Element_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Gleis_Bezeichnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_AnlageImpl#getBlockAnlageAllg <em>Block Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_AnlageImpl#getIDBlockElementA <em>ID Block Element A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_AnlageImpl#getIDBlockElementB <em>ID Block Element B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_AnlageImpl#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_AnlageImpl extends Basis_ObjektImpl implements Block_Anlage {
	/**
	 * The cached value of the '{@link #getBlockAnlageAllg() <em>Block Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Anlage_Allg_AttributeGroup blockAnlageAllg;

	/**
	 * The cached value of the '{@link #getIDBlockElementA() <em>ID Block Element A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockElementA()
	 * @generated
	 * @ordered
	 */
	protected ID_Block_Element_TypeClass iDBlockElementA;

	/**
	 * The cached value of the '{@link #getIDBlockElementB() <em>ID Block Element B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockElementB()
	 * @generated
	 * @ordered
	 */
	protected ID_Block_Element_TypeClass iDBlockElementB;

	/**
	 * The cached value of the '{@link #getIDGleisBezeichnung() <em>ID Gleis Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Bezeichnung_TypeClass iDGleisBezeichnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Anlage_Allg_AttributeGroup getBlockAnlageAllg() {
		return blockAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup newBlockAnlageAllg, NotificationChain msgs) {
		Block_Anlage_Allg_AttributeGroup oldBlockAnlageAllg = blockAnlageAllg;
		blockAnlageAllg = newBlockAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, oldBlockAnlageAllg, newBlockAnlageAllg);
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
	public void setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup newBlockAnlageAllg) {
		if (newBlockAnlageAllg != blockAnlageAllg) {
			NotificationChain msgs = null;
			if (blockAnlageAllg != null)
				msgs = ((InternalEObject)blockAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, null, msgs);
			if (newBlockAnlageAllg != null)
				msgs = ((InternalEObject)newBlockAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, null, msgs);
			msgs = basicSetBlockAnlageAllg(newBlockAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, newBlockAnlageAllg, newBlockAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Element_TypeClass getIDBlockElementA() {
		return iDBlockElementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBlockElementA(ID_Block_Element_TypeClass newIDBlockElementA, NotificationChain msgs) {
		ID_Block_Element_TypeClass oldIDBlockElementA = iDBlockElementA;
		iDBlockElementA = newIDBlockElementA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, oldIDBlockElementA, newIDBlockElementA);
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
	public void setIDBlockElementA(ID_Block_Element_TypeClass newIDBlockElementA) {
		if (newIDBlockElementA != iDBlockElementA) {
			NotificationChain msgs = null;
			if (iDBlockElementA != null)
				msgs = ((InternalEObject)iDBlockElementA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, null, msgs);
			if (newIDBlockElementA != null)
				msgs = ((InternalEObject)newIDBlockElementA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, null, msgs);
			msgs = basicSetIDBlockElementA(newIDBlockElementA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, newIDBlockElementA, newIDBlockElementA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Element_TypeClass getIDBlockElementB() {
		return iDBlockElementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBlockElementB(ID_Block_Element_TypeClass newIDBlockElementB, NotificationChain msgs) {
		ID_Block_Element_TypeClass oldIDBlockElementB = iDBlockElementB;
		iDBlockElementB = newIDBlockElementB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, oldIDBlockElementB, newIDBlockElementB);
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
	public void setIDBlockElementB(ID_Block_Element_TypeClass newIDBlockElementB) {
		if (newIDBlockElementB != iDBlockElementB) {
			NotificationChain msgs = null;
			if (iDBlockElementB != null)
				msgs = ((InternalEObject)iDBlockElementB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, null, msgs);
			if (newIDBlockElementB != null)
				msgs = ((InternalEObject)newIDBlockElementB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, null, msgs);
			msgs = basicSetIDBlockElementB(newIDBlockElementB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, newIDBlockElementB, newIDBlockElementB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Bezeichnung_TypeClass getIDGleisBezeichnung() {
		return iDGleisBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisBezeichnung(ID_Gleis_Bezeichnung_TypeClass newIDGleisBezeichnung, NotificationChain msgs) {
		ID_Gleis_Bezeichnung_TypeClass oldIDGleisBezeichnung = iDGleisBezeichnung;
		iDGleisBezeichnung = newIDGleisBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, oldIDGleisBezeichnung, newIDGleisBezeichnung);
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
	public void setIDGleisBezeichnung(ID_Gleis_Bezeichnung_TypeClass newIDGleisBezeichnung) {
		if (newIDGleisBezeichnung != iDGleisBezeichnung) {
			NotificationChain msgs = null;
			if (iDGleisBezeichnung != null)
				msgs = ((InternalEObject)iDGleisBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, null, msgs);
			if (newIDGleisBezeichnung != null)
				msgs = ((InternalEObject)newIDGleisBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, null, msgs);
			msgs = basicSetIDGleisBezeichnung(newIDGleisBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, newIDGleisBezeichnung, newIDGleisBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return basicSetBlockAnlageAllg(null, msgs);
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				return basicSetIDBlockElementA(null, msgs);
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				return basicSetIDBlockElementB(null, msgs);
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				return basicSetIDGleisBezeichnung(null, msgs);
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return getBlockAnlageAllg();
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				return getIDBlockElementA();
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				return getIDBlockElementB();
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				return getIDGleisBezeichnung();
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				setBlockAnlageAllg((Block_Anlage_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				setIDBlockElementA((ID_Block_Element_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				setIDBlockElementB((ID_Block_Element_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				setIDGleisBezeichnung((ID_Gleis_Bezeichnung_TypeClass)newValue);
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				setBlockAnlageAllg((Block_Anlage_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				setIDBlockElementA((ID_Block_Element_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				setIDBlockElementB((ID_Block_Element_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				setIDGleisBezeichnung((ID_Gleis_Bezeichnung_TypeClass)null);
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return blockAnlageAllg != null;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				return iDBlockElementA != null;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				return iDBlockElementB != null;
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				return iDGleisBezeichnung != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_AnlageImpl
