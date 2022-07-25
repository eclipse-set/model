/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bezeichnung_ZUB_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Laenge_Ausfuehrungsbereich_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach Sonstige Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl#getBezeichnungZUB <em>Bezeichnung ZUB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl#getLaengeAusfuehrungsbereich <em>Laenge Ausfuehrungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungZUB() <em>Bezeichnung ZUB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungZUB()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_ZUB_TypeClass bezeichnungZUB;

	/**
	 * The cached value of the '{@link #getLaengeAusfuehrungsbereich() <em>Laenge Ausfuehrungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeAusfuehrungsbereich()
	 * @generated
	 * @ordered
	 */
	protected Laenge_Ausfuehrungsbereich_TypeClass laengeAusfuehrungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ZUB_TypeClass getBezeichnungZUB() {
		return bezeichnungZUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungZUB(Bezeichnung_ZUB_TypeClass newBezeichnungZUB, NotificationChain msgs) {
		Bezeichnung_ZUB_TypeClass oldBezeichnungZUB = bezeichnungZUB;
		bezeichnungZUB = newBezeichnungZUB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB, oldBezeichnungZUB, newBezeichnungZUB);
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
	public void setBezeichnungZUB(Bezeichnung_ZUB_TypeClass newBezeichnungZUB) {
		if (newBezeichnungZUB != bezeichnungZUB) {
			NotificationChain msgs = null;
			if (bezeichnungZUB != null)
				msgs = ((InternalEObject)bezeichnungZUB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB, null, msgs);
			if (newBezeichnungZUB != null)
				msgs = ((InternalEObject)newBezeichnungZUB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB, null, msgs);
			msgs = basicSetBezeichnungZUB(newBezeichnungZUB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB, newBezeichnungZUB, newBezeichnungZUB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Ausfuehrungsbereich_TypeClass getLaengeAusfuehrungsbereich() {
		return laengeAusfuehrungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaengeAusfuehrungsbereich(Laenge_Ausfuehrungsbereich_TypeClass newLaengeAusfuehrungsbereich, NotificationChain msgs) {
		Laenge_Ausfuehrungsbereich_TypeClass oldLaengeAusfuehrungsbereich = laengeAusfuehrungsbereich;
		laengeAusfuehrungsbereich = newLaengeAusfuehrungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH, oldLaengeAusfuehrungsbereich, newLaengeAusfuehrungsbereich);
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
	public void setLaengeAusfuehrungsbereich(Laenge_Ausfuehrungsbereich_TypeClass newLaengeAusfuehrungsbereich) {
		if (newLaengeAusfuehrungsbereich != laengeAusfuehrungsbereich) {
			NotificationChain msgs = null;
			if (laengeAusfuehrungsbereich != null)
				msgs = ((InternalEObject)laengeAusfuehrungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH, null, msgs);
			if (newLaengeAusfuehrungsbereich != null)
				msgs = ((InternalEObject)newLaengeAusfuehrungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH, null, msgs);
			msgs = basicSetLaengeAusfuehrungsbereich(newLaengeAusfuehrungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH, newLaengeAusfuehrungsbereich, newLaengeAusfuehrungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB:
				return basicSetBezeichnungZUB(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH:
				return basicSetLaengeAusfuehrungsbereich(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB:
				return getBezeichnungZUB();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH:
				return getLaengeAusfuehrungsbereich();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB:
				setBezeichnungZUB((Bezeichnung_ZUB_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH:
				setLaengeAusfuehrungsbereich((Laenge_Ausfuehrungsbereich_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB:
				setBezeichnungZUB((Bezeichnung_ZUB_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH:
				setLaengeAusfuehrungsbereich((Laenge_Ausfuehrungsbereich_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUB:
				return bezeichnungZUB != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP__LAENGE_AUSFUEHRUNGSBEREICH:
				return laengeAusfuehrungsbereich != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl
