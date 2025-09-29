/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Harter_Ausstieg_Aus_L2_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prioritaet_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach PZB Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl#getBgrenzeNachPZBBedEinstieg <em>Bgrenze Nach PZB Bed Einstieg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl#getHarterAusstiegAusL2 <em>Harter Ausstieg Aus L2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl extends EObjectImpl implements ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBgrenzeNachPZBBedEinstieg() <em>Bgrenze Nach PZB Bed Einstieg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeNachPZBBedEinstieg()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup> bgrenzeNachPZBBedEinstieg;

	/**
	 * The cached value of the '{@link #getHarterAusstiegAusL2() <em>Harter Ausstieg Aus L2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarterAusstiegAusL2()
	 * @generated
	 * @ordered
	 */
	protected Harter_Ausstieg_Aus_L2_TypeClass harterAusstiegAusL2;

	/**
	 * The cached value of the '{@link #getPrioritaet() <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaet()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_TypeClass prioritaet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup> getBgrenzeNachPZBBedEinstieg() {
		if (bgrenzeNachPZBBedEinstieg == null) {
			bgrenzeNachPZBBedEinstieg = new EObjectContainmentEList<Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup>(Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG);
		}
		return bgrenzeNachPZBBedEinstieg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Harter_Ausstieg_Aus_L2_TypeClass getHarterAusstiegAusL2() {
		return harterAusstiegAusL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHarterAusstiegAusL2(Harter_Ausstieg_Aus_L2_TypeClass newHarterAusstiegAusL2, NotificationChain msgs) {
		Harter_Ausstieg_Aus_L2_TypeClass oldHarterAusstiegAusL2 = harterAusstiegAusL2;
		harterAusstiegAusL2 = newHarterAusstiegAusL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2, oldHarterAusstiegAusL2, newHarterAusstiegAusL2);
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
	public void setHarterAusstiegAusL2(Harter_Ausstieg_Aus_L2_TypeClass newHarterAusstiegAusL2) {
		if (newHarterAusstiegAusL2 != harterAusstiegAusL2) {
			NotificationChain msgs = null;
			if (harterAusstiegAusL2 != null)
				msgs = ((InternalEObject)harterAusstiegAusL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2, null, msgs);
			if (newHarterAusstiegAusL2 != null)
				msgs = ((InternalEObject)newHarterAusstiegAusL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2, null, msgs);
			msgs = basicSetHarterAusstiegAusL2(newHarterAusstiegAusL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2, newHarterAusstiegAusL2, newHarterAusstiegAusL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_TypeClass getPrioritaet() {
		return prioritaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaet(Prioritaet_TypeClass newPrioritaet, NotificationChain msgs) {
		Prioritaet_TypeClass oldPrioritaet = prioritaet;
		prioritaet = newPrioritaet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET, oldPrioritaet, newPrioritaet);
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
	public void setPrioritaet(Prioritaet_TypeClass newPrioritaet) {
		if (newPrioritaet != prioritaet) {
			NotificationChain msgs = null;
			if (prioritaet != null)
				msgs = ((InternalEObject)prioritaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			if (newPrioritaet != null)
				msgs = ((InternalEObject)newPrioritaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			msgs = basicSetPrioritaet(newPrioritaet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET, newPrioritaet, newPrioritaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG:
				return ((InternalEList<?>)getBgrenzeNachPZBBedEinstieg()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2:
				return basicSetHarterAusstiegAusL2(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET:
				return basicSetPrioritaet(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG:
				return getBgrenzeNachPZBBedEinstieg();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2:
				return getHarterAusstiegAusL2();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET:
				return getPrioritaet();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG:
				getBgrenzeNachPZBBedEinstieg().clear();
				getBgrenzeNachPZBBedEinstieg().addAll((Collection<? extends Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2:
				setHarterAusstiegAusL2((Harter_Ausstieg_Aus_L2_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG:
				getBgrenzeNachPZBBedEinstieg().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2:
				setHarterAusstiegAusL2((Harter_Ausstieg_Aus_L2_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__BGRENZE_NACH_PZB_BED_EINSTIEG:
				return bgrenzeNachPZBBedEinstieg != null && !bgrenzeNachPZBBedEinstieg.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__HARTER_AUSSTIEG_AUS_L2:
				return harterAusstiegAusL2 != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP__PRIORITAET:
				return prioritaet != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl
