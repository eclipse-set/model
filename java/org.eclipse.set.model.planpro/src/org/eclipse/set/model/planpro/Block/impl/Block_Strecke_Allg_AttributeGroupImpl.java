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

import org.eclipse.set.model.planpro.Block.Betriebsfuehrung_TypeClass;
import org.eclipse.set.model.planpro.Block.BlockPackage;
import org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Block.Bremsweg_TypeClass;
import org.eclipse.set.model.planpro.Block.Strecke_Art_TypeClass;
import org.eclipse.set.model.planpro.Block.Streckengeschwindigkeit_TypeClass;
import org.eclipse.set.model.planpro.Block.Traktion_Art_Elektrisch_TypeClass;
import org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass;
import org.eclipse.set.model.planpro.Block.Zusatzinformation_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Strecke Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getBetriebsfuehrung <em>Betriebsfuehrung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getStreckeArt <em>Strecke Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getStreckengeschwindigkeit <em>Streckengeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getTraktionArtElektrisch <em>Traktion Art Elektrisch</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.impl.Block_Strecke_Allg_AttributeGroupImpl#getZusatzinformation <em>Zusatzinformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_Strecke_Allg_AttributeGroupImpl extends EObjectImpl implements Block_Strecke_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getStreckeArt() <em>Strecke Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeArt()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Art_TypeClass streckeArt;

	/**
	 * The cached value of the '{@link #getStreckengeschwindigkeit() <em>Streckengeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckengeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Streckengeschwindigkeit_TypeClass streckengeschwindigkeit;

	/**
	 * The cached value of the '{@link #getTraktionArtElektrisch() <em>Traktion Art Elektrisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraktionArtElektrisch()
	 * @generated
	 * @ordered
	 */
	protected Traktion_Art_Elektrisch_TypeClass traktionArtElektrisch;

	/**
	 * The cached value of the '{@link #getZugbeeinflussungArt() <em>Zugbeeinflussung Art</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugbeeinflussungArt()
	 * @generated
	 * @ordered
	 */
	protected EList<Zugbeeinflussung_Art_TypeClass> zugbeeinflussungArt;

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
	public Streckengeschwindigkeit_TypeClass getStreckengeschwindigkeit() {
		return streckengeschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckengeschwindigkeit(Streckengeschwindigkeit_TypeClass newStreckengeschwindigkeit, NotificationChain msgs) {
		Streckengeschwindigkeit_TypeClass oldStreckengeschwindigkeit = streckengeschwindigkeit;
		streckengeschwindigkeit = newStreckengeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT, oldStreckengeschwindigkeit, newStreckengeschwindigkeit);
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
	public void setStreckengeschwindigkeit(Streckengeschwindigkeit_TypeClass newStreckengeschwindigkeit) {
		if (newStreckengeschwindigkeit != streckengeschwindigkeit) {
			NotificationChain msgs = null;
			if (streckengeschwindigkeit != null)
				msgs = ((InternalEObject)streckengeschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT, null, msgs);
			if (newStreckengeschwindigkeit != null)
				msgs = ((InternalEObject)newStreckengeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT, null, msgs);
			msgs = basicSetStreckengeschwindigkeit(newStreckengeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT, newStreckengeschwindigkeit, newStreckengeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Traktion_Art_Elektrisch_TypeClass getTraktionArtElektrisch() {
		return traktionArtElektrisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraktionArtElektrisch(Traktion_Art_Elektrisch_TypeClass newTraktionArtElektrisch, NotificationChain msgs) {
		Traktion_Art_Elektrisch_TypeClass oldTraktionArtElektrisch = traktionArtElektrisch;
		traktionArtElektrisch = newTraktionArtElektrisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH, oldTraktionArtElektrisch, newTraktionArtElektrisch);
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
	public void setTraktionArtElektrisch(Traktion_Art_Elektrisch_TypeClass newTraktionArtElektrisch) {
		if (newTraktionArtElektrisch != traktionArtElektrisch) {
			NotificationChain msgs = null;
			if (traktionArtElektrisch != null)
				msgs = ((InternalEObject)traktionArtElektrisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH, null, msgs);
			if (newTraktionArtElektrisch != null)
				msgs = ((InternalEObject)newTraktionArtElektrisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH, null, msgs);
			msgs = basicSetTraktionArtElektrisch(newTraktionArtElektrisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH, newTraktionArtElektrisch, newTraktionArtElektrisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Zugbeeinflussung_Art_TypeClass> getZugbeeinflussungArt() {
		if (zugbeeinflussungArt == null) {
			zugbeeinflussungArt = new EObjectContainmentEList<Zugbeeinflussung_Art_TypeClass>(Zugbeeinflussung_Art_TypeClass.class, this, BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART);
		}
		return zugbeeinflussungArt;
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return basicSetStreckeArt(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT:
				return basicSetStreckengeschwindigkeit(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH:
				return basicSetTraktionArtElektrisch(null, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return ((InternalEList<?>)getZugbeeinflussungArt()).basicRemove(otherEnd, msgs);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return basicSetZusatzinformation(null, msgs);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				return getBetriebsfuehrung();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				return getBremsweg();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return getStreckeArt();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT:
				return getStreckengeschwindigkeit();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH:
				return getTraktionArtElektrisch();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return getZugbeeinflussungArt();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return getZusatzinformation();
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				setBetriebsfuehrung((Betriebsfuehrung_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				setStreckeArt((Strecke_Art_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT:
				setStreckengeschwindigkeit((Streckengeschwindigkeit_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH:
				setTraktionArtElektrisch((Traktion_Art_Elektrisch_TypeClass)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				getZugbeeinflussungArt().clear();
				getZugbeeinflussungArt().addAll((Collection<? extends Zugbeeinflussung_Art_TypeClass>)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				setZusatzinformation((Zusatzinformation_TypeClass)newValue);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				setBetriebsfuehrung((Betriebsfuehrung_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				setStreckeArt((Strecke_Art_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT:
				setStreckengeschwindigkeit((Streckengeschwindigkeit_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH:
				setTraktionArtElektrisch((Traktion_Art_Elektrisch_TypeClass)null);
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				getZugbeeinflussungArt().clear();
				return;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				setZusatzinformation((Zusatzinformation_TypeClass)null);
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
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG:
				return betriebsfuehrung != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG:
				return bremsweg != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART:
				return streckeArt != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKENGESCHWINDIGKEIT:
				return streckengeschwindigkeit != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART_ELEKTRISCH:
				return traktionArtElektrisch != null;
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART:
				return zugbeeinflussungArt != null && !zugbeeinflussungArt.isEmpty();
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION:
				return zusatzinformation != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Block_Strecke_Allg_AttributeGroupImpl
