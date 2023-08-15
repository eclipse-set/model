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
import org.eclipse.set.model.model11001.Block.Block_Element;
import org.eclipse.set.model.model11001.Block.Block_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Block.Block_Element_Erlaubnis_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Block_Strecke_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getBlockElementAllg <em>Block Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getIDBlockStrecke <em>ID Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.impl.Block_ElementImpl#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_ElementImpl extends Basis_ObjektImpl implements Block_Element {
	/**
	 * The cached value of the '{@link #getBlockElementAllg() <em>Block Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Element_Allg_AttributeGroup blockElementAllg;

	/**
	 * The cached value of the '{@link #getBlockElementErlaubnis() <em>Block Element Erlaubnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementErlaubnis()
	 * @generated
	 * @ordered
	 */
	protected Block_Element_Erlaubnis_AttributeGroup blockElementErlaubnis;

	/**
	 * The cached value of the '{@link #getIDBlockStrecke() <em>ID Block Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockStrecke()
	 * @generated
	 * @ordered
	 */
	protected ID_Block_Strecke_TypeClass iDBlockStrecke;

	/**
	 * The cached value of the '{@link #getIDRaeumungspruefung() <em>ID Raeumungspruefung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRaeumungspruefung()
	 * @generated
	 * @ordered
	 */
	protected ID_Schaltmittel_Zuordnung_TypeClass iDRaeumungspruefung;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignal;

	/**
	 * The cached value of the '{@link #getIDZugschlussmeldung() <em>ID Zugschlussmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZugschlussmeldung()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Anzeige_Element_TypeClass iDZugschlussmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Allg_AttributeGroup getBlockElementAllg() {
		return blockElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockElementAllg(Block_Element_Allg_AttributeGroup newBlockElementAllg, NotificationChain msgs) {
		Block_Element_Allg_AttributeGroup oldBlockElementAllg = blockElementAllg;
		blockElementAllg = newBlockElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, oldBlockElementAllg, newBlockElementAllg);
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
	public void setBlockElementAllg(Block_Element_Allg_AttributeGroup newBlockElementAllg) {
		if (newBlockElementAllg != blockElementAllg) {
			NotificationChain msgs = null;
			if (blockElementAllg != null)
				msgs = ((InternalEObject)blockElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, null, msgs);
			if (newBlockElementAllg != null)
				msgs = ((InternalEObject)newBlockElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, null, msgs);
			msgs = basicSetBlockElementAllg(newBlockElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, newBlockElementAllg, newBlockElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Erlaubnis_AttributeGroup getBlockElementErlaubnis() {
		return blockElementErlaubnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup newBlockElementErlaubnis, NotificationChain msgs) {
		Block_Element_Erlaubnis_AttributeGroup oldBlockElementErlaubnis = blockElementErlaubnis;
		blockElementErlaubnis = newBlockElementErlaubnis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, oldBlockElementErlaubnis, newBlockElementErlaubnis);
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
	public void setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup newBlockElementErlaubnis) {
		if (newBlockElementErlaubnis != blockElementErlaubnis) {
			NotificationChain msgs = null;
			if (blockElementErlaubnis != null)
				msgs = ((InternalEObject)blockElementErlaubnis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, null, msgs);
			if (newBlockElementErlaubnis != null)
				msgs = ((InternalEObject)newBlockElementErlaubnis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, null, msgs);
			msgs = basicSetBlockElementErlaubnis(newBlockElementErlaubnis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, newBlockElementErlaubnis, newBlockElementErlaubnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Strecke_TypeClass getIDBlockStrecke() {
		return iDBlockStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBlockStrecke(ID_Block_Strecke_TypeClass newIDBlockStrecke, NotificationChain msgs) {
		ID_Block_Strecke_TypeClass oldIDBlockStrecke = iDBlockStrecke;
		iDBlockStrecke = newIDBlockStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, oldIDBlockStrecke, newIDBlockStrecke);
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
	public void setIDBlockStrecke(ID_Block_Strecke_TypeClass newIDBlockStrecke) {
		if (newIDBlockStrecke != iDBlockStrecke) {
			NotificationChain msgs = null;
			if (iDBlockStrecke != null)
				msgs = ((InternalEObject)iDBlockStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, null, msgs);
			if (newIDBlockStrecke != null)
				msgs = ((InternalEObject)newIDBlockStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, null, msgs);
			msgs = basicSetIDBlockStrecke(newIDBlockStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, newIDBlockStrecke, newIDBlockStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schaltmittel_Zuordnung_TypeClass getIDRaeumungspruefung() {
		return iDRaeumungspruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRaeumungspruefung(ID_Schaltmittel_Zuordnung_TypeClass newIDRaeumungspruefung, NotificationChain msgs) {
		ID_Schaltmittel_Zuordnung_TypeClass oldIDRaeumungspruefung = iDRaeumungspruefung;
		iDRaeumungspruefung = newIDRaeumungspruefung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, oldIDRaeumungspruefung, newIDRaeumungspruefung);
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
	public void setIDRaeumungspruefung(ID_Schaltmittel_Zuordnung_TypeClass newIDRaeumungspruefung) {
		if (newIDRaeumungspruefung != iDRaeumungspruefung) {
			NotificationChain msgs = null;
			if (iDRaeumungspruefung != null)
				msgs = ((InternalEObject)iDRaeumungspruefung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, null, msgs);
			if (newIDRaeumungspruefung != null)
				msgs = ((InternalEObject)newIDRaeumungspruefung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, null, msgs);
			msgs = basicSetIDRaeumungspruefung(newIDRaeumungspruefung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, newIDRaeumungspruefung, newIDRaeumungspruefung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Anzeige_Element_TypeClass getIDZugschlussmeldung() {
		return iDZugschlussmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZugschlussmeldung(ID_Bedien_Anzeige_Element_TypeClass newIDZugschlussmeldung, NotificationChain msgs) {
		ID_Bedien_Anzeige_Element_TypeClass oldIDZugschlussmeldung = iDZugschlussmeldung;
		iDZugschlussmeldung = newIDZugschlussmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, oldIDZugschlussmeldung, newIDZugschlussmeldung);
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
	public void setIDZugschlussmeldung(ID_Bedien_Anzeige_Element_TypeClass newIDZugschlussmeldung) {
		if (newIDZugschlussmeldung != iDZugschlussmeldung) {
			NotificationChain msgs = null;
			if (iDZugschlussmeldung != null)
				msgs = ((InternalEObject)iDZugschlussmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, null, msgs);
			if (newIDZugschlussmeldung != null)
				msgs = ((InternalEObject)newIDZugschlussmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, null, msgs);
			msgs = basicSetIDZugschlussmeldung(newIDZugschlussmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, newIDZugschlussmeldung, newIDZugschlussmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return basicSetBlockElementAllg(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return basicSetBlockElementErlaubnis(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				return basicSetIDBlockStrecke(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				return basicSetIDRaeumungspruefung(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				return basicSetIDZugschlussmeldung(null, msgs);
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return getBlockElementAllg();
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return getBlockElementErlaubnis();
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				return getIDBlockStrecke();
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				return getIDRaeumungspruefung();
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				return getIDSignal();
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				return getIDZugschlussmeldung();
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				setBlockElementAllg((Block_Element_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				setBlockElementErlaubnis((Block_Element_Erlaubnis_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				setIDBlockStrecke((ID_Block_Strecke_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				setIDRaeumungspruefung((ID_Schaltmittel_Zuordnung_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				setIDZugschlussmeldung((ID_Bedien_Anzeige_Element_TypeClass)newValue);
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				setBlockElementAllg((Block_Element_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				setBlockElementErlaubnis((Block_Element_Erlaubnis_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				setIDBlockStrecke((ID_Block_Strecke_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				setIDRaeumungspruefung((ID_Schaltmittel_Zuordnung_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				setIDZugschlussmeldung((ID_Bedien_Anzeige_Element_TypeClass)null);
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return blockElementAllg != null;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return blockElementErlaubnis != null;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				return iDBlockStrecke != null;
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				return iDRaeumungspruefung != null;
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				return iDSignal != null;
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				return iDZugschlussmeldung != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_ElementImpl
