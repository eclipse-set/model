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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Block.Betriebsfuehrung_TypeClass;
import org.eclipse.set.model.model1902.Block.BlockPackage;
import org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Bremsweg_TypeClass;
import org.eclipse.set.model.model1902.Block.Entwurfsgeschwindigkeit_TypeClass;
import org.eclipse.set.model.model1902.Block.Strecke_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Traktion_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Zugbeeinflussung_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Zusatzinformation_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Strecke Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getBetriebsfuehrung <em>Betriebsfuehrung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getEntwurfsgeschwindigkeit <em>Entwurfsgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getStreckeArt <em>Strecke Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getTraktionArt <em>Traktion Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getZusatzinformation <em>Zusatzinformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_Strecke_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Block_Strecke_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBetriebsfuehrung() <em>Betriebsfuehrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetriebsfuehrung()
	 * @generated
	 * @ordered
	 */
	protected Betriebsfuehrung_TypeClass betriebsfuehrung;

	/**
	 * The cached value of the '{@link #getBremsweg() <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBremsweg()
	 * @generated
	 * @ordered
	 */
	protected Bremsweg_TypeClass bremsweg;

	/**
	 * The cached value of the '{@link #getEntwurfsgeschwindigkeit() <em>Entwurfsgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntwurfsgeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Entwurfsgeschwindigkeit_TypeClass entwurfsgeschwindigkeit;

	/**
	 * The cached value of the '{@link #getStreckeArt() <em>Strecke Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeArt()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Art_TypeClass streckeArt;

	/**
	 * The cached value of the '{@link #getTraktionArt() <em>Traktion Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraktionArt()
	 * @generated
	 * @ordered
	 */
	protected Traktion_Art_TypeClass traktionArt;

	/**
	 * The cached value of the '{@link #getZugbeeinflussungArt() <em>Zugbeeinflussung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugbeeinflussungArt()
	 * @generated
	 * @ordered
	 */
	protected Zugbeeinflussung_Art_TypeClass zugbeeinflussungArt;

	/**
	 * The cached value of the '{@link #getZusatzinformation() <em>Zusatzinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzinformation()
	 * @generated
	 * @ordered
	 */
	protected Zusatzinformation_TypeClass zusatzinformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_Strecke_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betriebsfuehrung_TypeClass getBetriebsfuehrung() {
		return betriebsfuehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetriebsfuehrung(Betriebsfuehrung_TypeClass newBetriebsfuehrung, NotificationChain msgs) {
		Betriebsfuehrung_TypeClass oldBetriebsfuehrung = betriebsfuehrung;
		betriebsfuehrung = newBetriebsfuehrung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG, oldBetriebsfuehrung, newBetriebsfuehrung);
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
	public void setBetriebsfuehrung(Betriebsfuehrung_TypeClass newBetriebsfuehrung) {
		if (newBetriebsfuehrung != betriebsfuehrung) {
			NotificationChain msgs = null;
			if (betriebsfuehrung != null)
				msgs = ((InternalEObject)betriebsfuehrung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG, null, msgs);
			if (newBetriebsfuehrung != null)
				msgs = ((InternalEObject)newBetriebsfuehrung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG, null, msgs);
			msgs = basicSetBetriebsfuehrung(newBetriebsfuehrung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG, newBetriebsfuehrung, newBetriebsfuehrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass getBremsweg() {
		return bremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBremsweg(Bremsweg_TypeClass newBremsweg, NotificationChain msgs) {
		Bremsweg_TypeClass oldBremsweg = bremsweg;
		bremsweg = newBremsweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG, oldBremsweg, newBremsweg);
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
	public void setBremsweg(Bremsweg_TypeClass newBremsweg) {
		if (newBremsweg != bremsweg) {
			NotificationChain msgs = null;
			if (bremsweg != null)
				msgs = ((InternalEObject)bremsweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			if (newBremsweg != null)
				msgs = ((InternalEObject)newBremsweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG, null, msgs);
			msgs = basicSetBremsweg(newBremsweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG, newBremsweg, newBremsweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entwurfsgeschwindigkeit_TypeClass getEntwurfsgeschwindigkeit() {
		return entwurfsgeschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntwurfsgeschwindigkeit(Entwurfsgeschwindigkeit_TypeClass newEntwurfsgeschwindigkeit, NotificationChain msgs) {
		Entwurfsgeschwindigkeit_TypeClass oldEntwurfsgeschwindigkeit = entwurfsgeschwindigkeit;
		entwurfsgeschwindigkeit = newEntwurfsgeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT, oldEntwurfsgeschwindigkeit, newEntwurfsgeschwindigkeit);
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
	public void setEntwurfsgeschwindigkeit(Entwurfsgeschwindigkeit_TypeClass newEntwurfsgeschwindigkeit) {
		if (newEntwurfsgeschwindigkeit != entwurfsgeschwindigkeit) {
			NotificationChain msgs = null;
			if (entwurfsgeschwindigkeit != null)
				msgs = ((InternalEObject)entwurfsgeschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT, null, msgs);
			if (newEntwurfsgeschwindigkeit != null)
				msgs = ((InternalEObject)newEntwurfsgeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT, null, msgs);
			msgs = basicSetEntwurfsgeschwindigkeit(newEntwurfsgeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT, newEntwurfsgeschwindigkeit, newEntwurfsgeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Art_TypeClass getStreckeArt() {
		return streckeArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeArt(Strecke_Art_TypeClass newStreckeArt, NotificationChain msgs) {
		Strecke_Art_TypeClass oldStreckeArt = streckeArt;
		streckeArt = newStreckeArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART, oldStreckeArt, newStreckeArt);
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
	public void setStreckeArt(Strecke_Art_TypeClass newStreckeArt) {
		if (newStreckeArt != streckeArt) {
			NotificationChain msgs = null;
			if (streckeArt != null)
				msgs = ((InternalEObject)streckeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART, null, msgs);
			if (newStreckeArt != null)
				msgs = ((InternalEObject)newStreckeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART, null, msgs);
			msgs = basicSetStreckeArt(newStreckeArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART, newStreckeArt, newStreckeArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Traktion_Art_TypeClass getTraktionArt() {
		return traktionArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraktionArt(Traktion_Art_TypeClass newTraktionArt, NotificationChain msgs) {
		Traktion_Art_TypeClass oldTraktionArt = traktionArt;
		traktionArt = newTraktionArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART, oldTraktionArt, newTraktionArt);
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
	public void setTraktionArt(Traktion_Art_TypeClass newTraktionArt) {
		if (newTraktionArt != traktionArt) {
			NotificationChain msgs = null;
			if (traktionArt != null)
				msgs = ((InternalEObject)traktionArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART, null, msgs);
			if (newTraktionArt != null)
				msgs = ((InternalEObject)newTraktionArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART, null, msgs);
			msgs = basicSetTraktionArt(newTraktionArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART, newTraktionArt, newTraktionArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugbeeinflussung_Art_TypeClass getZugbeeinflussungArt() {
		return zugbeeinflussungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZugbeeinflussungArt(Zugbeeinflussung_Art_TypeClass newZugbeeinflussungArt, NotificationChain msgs) {
		Zugbeeinflussung_Art_TypeClass oldZugbeeinflussungArt = zugbeeinflussungArt;
		zugbeeinflussungArt = newZugbeeinflussungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART, oldZugbeeinflussungArt, newZugbeeinflussungArt);
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
	public void setZugbeeinflussungArt(Zugbeeinflussung_Art_TypeClass newZugbeeinflussungArt) {
		if (newZugbeeinflussungArt != zugbeeinflussungArt) {
			NotificationChain msgs = null;
			if (zugbeeinflussungArt != null)
				msgs = ((InternalEObject)zugbeeinflussungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART, null, msgs);
			if (newZugbeeinflussungArt != null)
				msgs = ((InternalEObject)newZugbeeinflussungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART, null, msgs);
			msgs = basicSetZugbeeinflussungArt(newZugbeeinflussungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART, newZugbeeinflussungArt, newZugbeeinflussungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzinformation_TypeClass getZusatzinformation() {
		return zusatzinformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusatzinformation(Zusatzinformation_TypeClass newZusatzinformation, NotificationChain msgs) {
		Zusatzinformation_TypeClass oldZusatzinformation = zusatzinformation;
		zusatzinformation = newZusatzinformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION, oldZusatzinformation, newZusatzinformation);
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
	public void setZusatzinformation(Zusatzinformation_TypeClass newZusatzinformation) {
		if (newZusatzinformation != zusatzinformation) {
			NotificationChain msgs = null;
			if (zusatzinformation != null)
				msgs = ((InternalEObject)zusatzinformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION, null, msgs);
			if (newZusatzinformation != null)
				msgs = ((InternalEObject)newZusatzinformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION, null, msgs);
			msgs = basicSetZusatzinformation(newZusatzinformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION, newZusatzinformation, newZusatzinformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				return basicSetBetriebsfuehrung(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				return basicSetBremsweg(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT:
				return basicSetEntwurfsgeschwindigkeit(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return basicSetStreckeArt(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART:
				return basicSetTraktionArt(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return basicSetZugbeeinflussungArt(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return basicSetZusatzinformation(null, msgs);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				return getBetriebsfuehrung();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				return getBremsweg();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT:
				return getEntwurfsgeschwindigkeit();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return getStreckeArt();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART:
				return getTraktionArt();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return getZugbeeinflussungArt();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return getZusatzinformation();
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				setBetriebsfuehrung((Betriebsfuehrung_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT:
				setEntwurfsgeschwindigkeit((Entwurfsgeschwindigkeit_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				setStreckeArt((Strecke_Art_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART:
				setTraktionArt((Traktion_Art_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				setZugbeeinflussungArt((Zugbeeinflussung_Art_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				setZusatzinformation((Zusatzinformation_TypeClass)newValue);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				setBetriebsfuehrung((Betriebsfuehrung_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT:
				setEntwurfsgeschwindigkeit((Entwurfsgeschwindigkeit_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				setStreckeArt((Strecke_Art_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART:
				setTraktionArt((Traktion_Art_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				setZugbeeinflussungArt((Zugbeeinflussung_Art_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				setZusatzinformation((Zusatzinformation_TypeClass)null);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				return betriebsfuehrung != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				return bremsweg != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT:
				return entwurfsgeschwindigkeit != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return streckeArt != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART:
				return traktionArt != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return zugbeeinflussungArt != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return zusatzinformation != null;
		}
		return super.eIsSet(featureID);
	}

} //Block_Strecke_Allg_AttributeGroupImpl
