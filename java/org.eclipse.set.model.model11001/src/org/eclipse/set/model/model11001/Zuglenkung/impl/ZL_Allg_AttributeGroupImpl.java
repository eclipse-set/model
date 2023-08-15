/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Deadlockpruefung_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Einstellkontrollzeit_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Lenkabbruchzeit_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Personal_Reaktionszeit_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl#getAnzahlWiederholZLAnstoesse <em>Anzahl Wiederhol ZL Anstoesse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl#getDeadlockpruefung <em>Deadlockpruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl#getEinstellkontrollzeit <em>Einstellkontrollzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl#getLenkabbruchzeit <em>Lenkabbruchzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Allg_AttributeGroupImpl#getPersonalReaktionszeit <em>Personal Reaktionszeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Allg_AttributeGroupImpl extends EObjectImpl implements ZL_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnzahlWiederholZLAnstoesse() <em>Anzahl Wiederhol ZL Anstoesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlWiederholZLAnstoesse()
	 * @generated
	 * @ordered
	 */
	protected Anzahl_Wiederhol_ZL_Anstoesse_TypeClass anzahlWiederholZLAnstoesse;

	/**
	 * The cached value of the '{@link #getDeadlockpruefung() <em>Deadlockpruefung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlockpruefung()
	 * @generated
	 * @ordered
	 */
	protected Deadlockpruefung_TypeClass deadlockpruefung;

	/**
	 * The cached value of the '{@link #getEinstellkontrollzeit() <em>Einstellkontrollzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstellkontrollzeit()
	 * @generated
	 * @ordered
	 */
	protected Einstellkontrollzeit_TypeClass einstellkontrollzeit;

	/**
	 * The cached value of the '{@link #getLenkabbruchzeit() <em>Lenkabbruchzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenkabbruchzeit()
	 * @generated
	 * @ordered
	 */
	protected Lenkabbruchzeit_TypeClass lenkabbruchzeit;

	/**
	 * The cached value of the '{@link #getPersonalReaktionszeit() <em>Personal Reaktionszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalReaktionszeit()
	 * @generated
	 * @ordered
	 */
	protected Personal_Reaktionszeit_TypeClass personalReaktionszeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Wiederhol_ZL_Anstoesse_TypeClass getAnzahlWiederholZLAnstoesse() {
		return anzahlWiederholZLAnstoesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzahlWiederholZLAnstoesse(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass newAnzahlWiederholZLAnstoesse, NotificationChain msgs) {
		Anzahl_Wiederhol_ZL_Anstoesse_TypeClass oldAnzahlWiederholZLAnstoesse = anzahlWiederholZLAnstoesse;
		anzahlWiederholZLAnstoesse = newAnzahlWiederholZLAnstoesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE, oldAnzahlWiederholZLAnstoesse, newAnzahlWiederholZLAnstoesse);
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
	public void setAnzahlWiederholZLAnstoesse(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass newAnzahlWiederholZLAnstoesse) {
		if (newAnzahlWiederholZLAnstoesse != anzahlWiederholZLAnstoesse) {
			NotificationChain msgs = null;
			if (anzahlWiederholZLAnstoesse != null)
				msgs = ((InternalEObject)anzahlWiederholZLAnstoesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE, null, msgs);
			if (newAnzahlWiederholZLAnstoesse != null)
				msgs = ((InternalEObject)newAnzahlWiederholZLAnstoesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE, null, msgs);
			msgs = basicSetAnzahlWiederholZLAnstoesse(newAnzahlWiederholZLAnstoesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE, newAnzahlWiederholZLAnstoesse, newAnzahlWiederholZLAnstoesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deadlockpruefung_TypeClass getDeadlockpruefung() {
		return deadlockpruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadlockpruefung(Deadlockpruefung_TypeClass newDeadlockpruefung, NotificationChain msgs) {
		Deadlockpruefung_TypeClass oldDeadlockpruefung = deadlockpruefung;
		deadlockpruefung = newDeadlockpruefung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG, oldDeadlockpruefung, newDeadlockpruefung);
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
	public void setDeadlockpruefung(Deadlockpruefung_TypeClass newDeadlockpruefung) {
		if (newDeadlockpruefung != deadlockpruefung) {
			NotificationChain msgs = null;
			if (deadlockpruefung != null)
				msgs = ((InternalEObject)deadlockpruefung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG, null, msgs);
			if (newDeadlockpruefung != null)
				msgs = ((InternalEObject)newDeadlockpruefung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG, null, msgs);
			msgs = basicSetDeadlockpruefung(newDeadlockpruefung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG, newDeadlockpruefung, newDeadlockpruefung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstellkontrollzeit_TypeClass getEinstellkontrollzeit() {
		return einstellkontrollzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinstellkontrollzeit(Einstellkontrollzeit_TypeClass newEinstellkontrollzeit, NotificationChain msgs) {
		Einstellkontrollzeit_TypeClass oldEinstellkontrollzeit = einstellkontrollzeit;
		einstellkontrollzeit = newEinstellkontrollzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT, oldEinstellkontrollzeit, newEinstellkontrollzeit);
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
	public void setEinstellkontrollzeit(Einstellkontrollzeit_TypeClass newEinstellkontrollzeit) {
		if (newEinstellkontrollzeit != einstellkontrollzeit) {
			NotificationChain msgs = null;
			if (einstellkontrollzeit != null)
				msgs = ((InternalEObject)einstellkontrollzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT, null, msgs);
			if (newEinstellkontrollzeit != null)
				msgs = ((InternalEObject)newEinstellkontrollzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT, null, msgs);
			msgs = basicSetEinstellkontrollzeit(newEinstellkontrollzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT, newEinstellkontrollzeit, newEinstellkontrollzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lenkabbruchzeit_TypeClass getLenkabbruchzeit() {
		return lenkabbruchzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLenkabbruchzeit(Lenkabbruchzeit_TypeClass newLenkabbruchzeit, NotificationChain msgs) {
		Lenkabbruchzeit_TypeClass oldLenkabbruchzeit = lenkabbruchzeit;
		lenkabbruchzeit = newLenkabbruchzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT, oldLenkabbruchzeit, newLenkabbruchzeit);
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
	public void setLenkabbruchzeit(Lenkabbruchzeit_TypeClass newLenkabbruchzeit) {
		if (newLenkabbruchzeit != lenkabbruchzeit) {
			NotificationChain msgs = null;
			if (lenkabbruchzeit != null)
				msgs = ((InternalEObject)lenkabbruchzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT, null, msgs);
			if (newLenkabbruchzeit != null)
				msgs = ((InternalEObject)newLenkabbruchzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT, null, msgs);
			msgs = basicSetLenkabbruchzeit(newLenkabbruchzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT, newLenkabbruchzeit, newLenkabbruchzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Personal_Reaktionszeit_TypeClass getPersonalReaktionszeit() {
		return personalReaktionszeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonalReaktionszeit(Personal_Reaktionszeit_TypeClass newPersonalReaktionszeit, NotificationChain msgs) {
		Personal_Reaktionszeit_TypeClass oldPersonalReaktionszeit = personalReaktionszeit;
		personalReaktionszeit = newPersonalReaktionszeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT, oldPersonalReaktionszeit, newPersonalReaktionszeit);
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
	public void setPersonalReaktionszeit(Personal_Reaktionszeit_TypeClass newPersonalReaktionszeit) {
		if (newPersonalReaktionszeit != personalReaktionszeit) {
			NotificationChain msgs = null;
			if (personalReaktionszeit != null)
				msgs = ((InternalEObject)personalReaktionszeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT, null, msgs);
			if (newPersonalReaktionszeit != null)
				msgs = ((InternalEObject)newPersonalReaktionszeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT, null, msgs);
			msgs = basicSetPersonalReaktionszeit(newPersonalReaktionszeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT, newPersonalReaktionszeit, newPersonalReaktionszeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE:
				return basicSetAnzahlWiederholZLAnstoesse(null, msgs);
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG:
				return basicSetDeadlockpruefung(null, msgs);
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT:
				return basicSetEinstellkontrollzeit(null, msgs);
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT:
				return basicSetLenkabbruchzeit(null, msgs);
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT:
				return basicSetPersonalReaktionszeit(null, msgs);
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
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE:
				return getAnzahlWiederholZLAnstoesse();
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG:
				return getDeadlockpruefung();
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT:
				return getEinstellkontrollzeit();
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT:
				return getLenkabbruchzeit();
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT:
				return getPersonalReaktionszeit();
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
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE:
				setAnzahlWiederholZLAnstoesse((Anzahl_Wiederhol_ZL_Anstoesse_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG:
				setDeadlockpruefung((Deadlockpruefung_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT:
				setEinstellkontrollzeit((Einstellkontrollzeit_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT:
				setLenkabbruchzeit((Lenkabbruchzeit_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT:
				setPersonalReaktionszeit((Personal_Reaktionszeit_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE:
				setAnzahlWiederholZLAnstoesse((Anzahl_Wiederhol_ZL_Anstoesse_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG:
				setDeadlockpruefung((Deadlockpruefung_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT:
				setEinstellkontrollzeit((Einstellkontrollzeit_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT:
				setLenkabbruchzeit((Lenkabbruchzeit_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT:
				setPersonalReaktionszeit((Personal_Reaktionszeit_TypeClass)null);
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
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE:
				return anzahlWiederholZLAnstoesse != null;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG:
				return deadlockpruefung != null;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT:
				return einstellkontrollzeit != null;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT:
				return lenkabbruchzeit != null;
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT:
				return personalReaktionszeit != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Allg_AttributeGroupImpl
