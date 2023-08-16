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

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Block.BlockPackage;
import org.eclipse.set.model.model11001.Block.Block_Strecke;
import org.eclipse.set.model.model11001.Block.Block_Strecke_Allg_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Strecke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_StreckeImpl#getBlockStreckeAllg <em>Block Strecke Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_StreckeImpl#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_StreckeImpl#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_StreckeImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_StreckeImpl#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_StreckeImpl extends Basis_ObjektImpl implements Block_Strecke {
	/**
	 * The cached value of the '{@link #getBlockStreckeAllg() <em>Block Strecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockStreckeAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Strecke_Allg_AttributeGroup blockStreckeAllg;

	/**
	 * The cached value of the '{@link #getIDBetriebsstelleNachbar() <em>ID Betriebsstelle Nachbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBetriebsstelleNachbar()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDBetriebsstelleNachbar;

	/**
	 * The cached value of the '{@link #getIDKnotenbahnhof() <em>ID Knotenbahnhof</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDKnotenbahnhof()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDKnotenbahnhof;

	/**
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected ID_Strecke_TypeClass iDStrecke;

	/**
	 * The cached value of the '{@link #getIDStreckeBremsweg() <em>ID Strecke Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckeBremsweg()
	 * @generated
	 * @ordered
	 */
	protected ID_Strecke_Bremsweg_ohne_Proxy_TypeClass iDStreckeBremsweg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_StreckeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_STRECKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Strecke_Allg_AttributeGroup getBlockStreckeAllg() {
		return blockStreckeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup newBlockStreckeAllg, NotificationChain msgs) {
		Block_Strecke_Allg_AttributeGroup oldBlockStreckeAllg = blockStreckeAllg;
		blockStreckeAllg = newBlockStreckeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, oldBlockStreckeAllg, newBlockStreckeAllg);
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
	public void setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup newBlockStreckeAllg) {
		if (newBlockStreckeAllg != blockStreckeAllg) {
			NotificationChain msgs = null;
			if (blockStreckeAllg != null)
				msgs = ((InternalEObject)blockStreckeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, null, msgs);
			if (newBlockStreckeAllg != null)
				msgs = ((InternalEObject)newBlockStreckeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, null, msgs);
			msgs = basicSetBlockStreckeAllg(newBlockStreckeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, newBlockStreckeAllg, newBlockStreckeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDBetriebsstelleNachbar() {
		return iDBetriebsstelleNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBetriebsstelleNachbar(ID_Oertlichkeit_Proxy_TypeClass newIDBetriebsstelleNachbar, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDBetriebsstelleNachbar = iDBetriebsstelleNachbar;
		iDBetriebsstelleNachbar = newIDBetriebsstelleNachbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, oldIDBetriebsstelleNachbar, newIDBetriebsstelleNachbar);
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
	public void setIDBetriebsstelleNachbar(ID_Oertlichkeit_Proxy_TypeClass newIDBetriebsstelleNachbar) {
		if (newIDBetriebsstelleNachbar != iDBetriebsstelleNachbar) {
			NotificationChain msgs = null;
			if (iDBetriebsstelleNachbar != null)
				msgs = ((InternalEObject)iDBetriebsstelleNachbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, null, msgs);
			if (newIDBetriebsstelleNachbar != null)
				msgs = ((InternalEObject)newIDBetriebsstelleNachbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, null, msgs);
			msgs = basicSetIDBetriebsstelleNachbar(newIDBetriebsstelleNachbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, newIDBetriebsstelleNachbar, newIDBetriebsstelleNachbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDKnotenbahnhof() {
		return iDKnotenbahnhof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDKnotenbahnhof(ID_Oertlichkeit_Proxy_TypeClass newIDKnotenbahnhof, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDKnotenbahnhof = iDKnotenbahnhof;
		iDKnotenbahnhof = newIDKnotenbahnhof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, oldIDKnotenbahnhof, newIDKnotenbahnhof);
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
	public void setIDKnotenbahnhof(ID_Oertlichkeit_Proxy_TypeClass newIDKnotenbahnhof) {
		if (newIDKnotenbahnhof != iDKnotenbahnhof) {
			NotificationChain msgs = null;
			if (iDKnotenbahnhof != null)
				msgs = ((InternalEObject)iDKnotenbahnhof).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, null, msgs);
			if (newIDKnotenbahnhof != null)
				msgs = ((InternalEObject)newIDKnotenbahnhof).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, null, msgs);
			msgs = basicSetIDKnotenbahnhof(newIDKnotenbahnhof, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, newIDKnotenbahnhof, newIDKnotenbahnhof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_TypeClass getIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStrecke(ID_Strecke_TypeClass newIDStrecke, NotificationChain msgs) {
		ID_Strecke_TypeClass oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE, oldIDStrecke, newIDStrecke);
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
	public void setIDStrecke(ID_Strecke_TypeClass newIDStrecke) {
		if (newIDStrecke != iDStrecke) {
			NotificationChain msgs = null;
			if (iDStrecke != null)
				msgs = ((InternalEObject)iDStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_STRECKE, null, msgs);
			if (newIDStrecke != null)
				msgs = ((InternalEObject)newIDStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_STRECKE, null, msgs);
			msgs = basicSetIDStrecke(newIDStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE, newIDStrecke, newIDStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_Bremsweg_ohne_Proxy_TypeClass getIDStreckeBremsweg() {
		return iDStreckeBremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStreckeBremsweg(ID_Strecke_Bremsweg_ohne_Proxy_TypeClass newIDStreckeBremsweg, NotificationChain msgs) {
		ID_Strecke_Bremsweg_ohne_Proxy_TypeClass oldIDStreckeBremsweg = iDStreckeBremsweg;
		iDStreckeBremsweg = newIDStreckeBremsweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, oldIDStreckeBremsweg, newIDStreckeBremsweg);
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
	public void setIDStreckeBremsweg(ID_Strecke_Bremsweg_ohne_Proxy_TypeClass newIDStreckeBremsweg) {
		if (newIDStreckeBremsweg != iDStreckeBremsweg) {
			NotificationChain msgs = null;
			if (iDStreckeBremsweg != null)
				msgs = ((InternalEObject)iDStreckeBremsweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, null, msgs);
			if (newIDStreckeBremsweg != null)
				msgs = ((InternalEObject)newIDStreckeBremsweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, null, msgs);
			msgs = basicSetIDStreckeBremsweg(newIDStreckeBremsweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, newIDStreckeBremsweg, newIDStreckeBremsweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return basicSetBlockStreckeAllg(null, msgs);
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				return basicSetIDBetriebsstelleNachbar(null, msgs);
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				return basicSetIDKnotenbahnhof(null, msgs);
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				return basicSetIDStrecke(null, msgs);
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				return basicSetIDStreckeBremsweg(null, msgs);
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return getBlockStreckeAllg();
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				return getIDBetriebsstelleNachbar();
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				return getIDKnotenbahnhof();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				return getIDStrecke();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				return getIDStreckeBremsweg();
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				setBlockStreckeAllg((Block_Strecke_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				setIDBetriebsstelleNachbar((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				setIDKnotenbahnhof((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				setIDStreckeBremsweg((ID_Strecke_Bremsweg_ohne_Proxy_TypeClass)newValue);
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				setBlockStreckeAllg((Block_Strecke_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				setIDBetriebsstelleNachbar((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				setIDKnotenbahnhof((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				setIDStreckeBremsweg((ID_Strecke_Bremsweg_ohne_Proxy_TypeClass)null);
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return blockStreckeAllg != null;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				return iDBetriebsstelleNachbar != null;
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				return iDKnotenbahnhof != null;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				return iDStrecke != null;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				return iDStreckeBremsweg != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_StreckeImpl
