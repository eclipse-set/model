/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Blitzpfeil_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Montage_Besonders_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Richtungspfeil_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Schutzbuegel_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.Zusatzschild_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen Andreaskreuz Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl#getBlitzpfeil <em>Blitzpfeil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl#getMontageBesonders <em>Montage Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl#getRichtungspfeil <em>Richtungspfeil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl#getSchutzbuegel <em>Schutzbuegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Andreaskreuz_AttributeGroupImpl#getZusatzschild <em>Zusatzschild</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Verkehrszeichen_Andreaskreuz_AttributeGroupImpl extends EObjectImpl implements Verkehrszeichen_Andreaskreuz_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBlitzpfeil() <em>Blitzpfeil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlitzpfeil()
	 * @generated
	 * @ordered
	 */
	protected Blitzpfeil_TypeClass blitzpfeil;

	/**
	 * The cached value of the '{@link #getMontageBesonders() <em>Montage Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontageBesonders()
	 * @generated
	 * @ordered
	 */
	protected Montage_Besonders_TypeClass montageBesonders;

	/**
	 * The cached value of the '{@link #getRichtungspfeil() <em>Richtungspfeil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtungspfeil()
	 * @generated
	 * @ordered
	 */
	protected Richtungspfeil_TypeClass richtungspfeil;

	/**
	 * The cached value of the '{@link #getSchutzbuegel() <em>Schutzbuegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchutzbuegel()
	 * @generated
	 * @ordered
	 */
	protected Schutzbuegel_TypeClass schutzbuegel;

	/**
	 * The cached value of the '{@link #getZusatzschild() <em>Zusatzschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzschild()
	 * @generated
	 * @ordered
	 */
	protected Zusatzschild_TypeClass zusatzschild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verkehrszeichen_Andreaskreuz_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Andreaskreuz_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blitzpfeil_TypeClass getBlitzpfeil() {
		return blitzpfeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlitzpfeil(Blitzpfeil_TypeClass newBlitzpfeil, NotificationChain msgs) {
		Blitzpfeil_TypeClass oldBlitzpfeil = blitzpfeil;
		blitzpfeil = newBlitzpfeil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL, oldBlitzpfeil, newBlitzpfeil);
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
	public void setBlitzpfeil(Blitzpfeil_TypeClass newBlitzpfeil) {
		if (newBlitzpfeil != blitzpfeil) {
			NotificationChain msgs = null;
			if (blitzpfeil != null)
				msgs = ((InternalEObject)blitzpfeil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL, null, msgs);
			if (newBlitzpfeil != null)
				msgs = ((InternalEObject)newBlitzpfeil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL, null, msgs);
			msgs = basicSetBlitzpfeil(newBlitzpfeil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL, newBlitzpfeil, newBlitzpfeil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montage_Besonders_TypeClass getMontageBesonders() {
		return montageBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMontageBesonders(Montage_Besonders_TypeClass newMontageBesonders, NotificationChain msgs) {
		Montage_Besonders_TypeClass oldMontageBesonders = montageBesonders;
		montageBesonders = newMontageBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS, oldMontageBesonders, newMontageBesonders);
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
	public void setMontageBesonders(Montage_Besonders_TypeClass newMontageBesonders) {
		if (newMontageBesonders != montageBesonders) {
			NotificationChain msgs = null;
			if (montageBesonders != null)
				msgs = ((InternalEObject)montageBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS, null, msgs);
			if (newMontageBesonders != null)
				msgs = ((InternalEObject)newMontageBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS, null, msgs);
			msgs = basicSetMontageBesonders(newMontageBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS, newMontageBesonders, newMontageBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtungspfeil_TypeClass getRichtungspfeil() {
		return richtungspfeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRichtungspfeil(Richtungspfeil_TypeClass newRichtungspfeil, NotificationChain msgs) {
		Richtungspfeil_TypeClass oldRichtungspfeil = richtungspfeil;
		richtungspfeil = newRichtungspfeil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL, oldRichtungspfeil, newRichtungspfeil);
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
	public void setRichtungspfeil(Richtungspfeil_TypeClass newRichtungspfeil) {
		if (newRichtungspfeil != richtungspfeil) {
			NotificationChain msgs = null;
			if (richtungspfeil != null)
				msgs = ((InternalEObject)richtungspfeil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL, null, msgs);
			if (newRichtungspfeil != null)
				msgs = ((InternalEObject)newRichtungspfeil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL, null, msgs);
			msgs = basicSetRichtungspfeil(newRichtungspfeil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL, newRichtungspfeil, newRichtungspfeil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzbuegel_TypeClass getSchutzbuegel() {
		return schutzbuegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchutzbuegel(Schutzbuegel_TypeClass newSchutzbuegel, NotificationChain msgs) {
		Schutzbuegel_TypeClass oldSchutzbuegel = schutzbuegel;
		schutzbuegel = newSchutzbuegel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL, oldSchutzbuegel, newSchutzbuegel);
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
	public void setSchutzbuegel(Schutzbuegel_TypeClass newSchutzbuegel) {
		if (newSchutzbuegel != schutzbuegel) {
			NotificationChain msgs = null;
			if (schutzbuegel != null)
				msgs = ((InternalEObject)schutzbuegel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL, null, msgs);
			if (newSchutzbuegel != null)
				msgs = ((InternalEObject)newSchutzbuegel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL, null, msgs);
			msgs = basicSetSchutzbuegel(newSchutzbuegel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL, newSchutzbuegel, newSchutzbuegel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzschild_TypeClass getZusatzschild() {
		return zusatzschild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusatzschild(Zusatzschild_TypeClass newZusatzschild, NotificationChain msgs) {
		Zusatzschild_TypeClass oldZusatzschild = zusatzschild;
		zusatzschild = newZusatzschild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD, oldZusatzschild, newZusatzschild);
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
	public void setZusatzschild(Zusatzschild_TypeClass newZusatzschild) {
		if (newZusatzschild != zusatzschild) {
			NotificationChain msgs = null;
			if (zusatzschild != null)
				msgs = ((InternalEObject)zusatzschild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD, null, msgs);
			if (newZusatzschild != null)
				msgs = ((InternalEObject)newZusatzschild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD, null, msgs);
			msgs = basicSetZusatzschild(newZusatzschild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD, newZusatzschild, newZusatzschild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL:
				return basicSetBlitzpfeil(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS:
				return basicSetMontageBesonders(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL:
				return basicSetRichtungspfeil(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL:
				return basicSetSchutzbuegel(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD:
				return basicSetZusatzschild(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL:
				return getBlitzpfeil();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS:
				return getMontageBesonders();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL:
				return getRichtungspfeil();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL:
				return getSchutzbuegel();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD:
				return getZusatzschild();
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL:
				setBlitzpfeil((Blitzpfeil_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS:
				setMontageBesonders((Montage_Besonders_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL:
				setRichtungspfeil((Richtungspfeil_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL:
				setSchutzbuegel((Schutzbuegel_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD:
				setZusatzschild((Zusatzschild_TypeClass)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL:
				setBlitzpfeil((Blitzpfeil_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS:
				setMontageBesonders((Montage_Besonders_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL:
				setRichtungspfeil((Richtungspfeil_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL:
				setSchutzbuegel((Schutzbuegel_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD:
				setZusatzschild((Zusatzschild_TypeClass)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__BLITZPFEIL:
				return blitzpfeil != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__MONTAGE_BESONDERS:
				return montageBesonders != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__RICHTUNGSPFEIL:
				return richtungspfeil != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__SCHUTZBUEGEL:
				return schutzbuegel != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP__ZUSATZSCHILD:
				return zusatzschild != null;
		}
		return super.eIsSet(featureID);
	}

} //Verkehrszeichen_Andreaskreuz_AttributeGroupImpl
