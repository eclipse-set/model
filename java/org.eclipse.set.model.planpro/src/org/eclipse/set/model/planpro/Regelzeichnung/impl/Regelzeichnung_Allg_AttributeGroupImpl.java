/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Regelzeichnung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.Bild_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Nummer_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Regelzeichnung.Titel_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.Untertitel_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regelzeichnung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Allg_AttributeGroupImpl#getBild <em>Bild</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Allg_AttributeGroupImpl#getRZNummer <em>RZ Nummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Allg_AttributeGroupImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Allg_AttributeGroupImpl#getUntertitel <em>Untertitel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Regelzeichnung_Allg_AttributeGroupImpl extends EObjectImpl implements Regelzeichnung_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBild() <em>Bild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBild()
	 * @generated
	 * @ordered
	 */
	protected Bild_TypeClass bild;

	/**
	 * The cached value of the '{@link #getRZNummer() <em>RZ Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRZNummer()
	 * @generated
	 * @ordered
	 */
	protected RZ_Nummer_TypeClass rZNummer;

	/**
	 * The cached value of the '{@link #getTitel() <em>Titel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected Titel_TypeClass titel;

	/**
	 * The cached value of the '{@link #getUntertitel() <em>Untertitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntertitel()
	 * @generated
	 * @ordered
	 */
	protected Untertitel_TypeClass untertitel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Regelzeichnung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegelzeichnungPackage.Literals.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bild_TypeClass getBild() {
		return bild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBild(Bild_TypeClass newBild, NotificationChain msgs) {
		Bild_TypeClass oldBild = bild;
		bild = newBild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD, oldBild, newBild);
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
	public void setBild(Bild_TypeClass newBild) {
		if (newBild != bild) {
			NotificationChain msgs = null;
			if (bild != null)
				msgs = ((InternalEObject)bild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD, null, msgs);
			if (newBild != null)
				msgs = ((InternalEObject)newBild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD, null, msgs);
			msgs = basicSetBild(newBild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD, newBild, newBild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Nummer_TypeClass getRZNummer() {
		return rZNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRZNummer(RZ_Nummer_TypeClass newRZNummer, NotificationChain msgs) {
		RZ_Nummer_TypeClass oldRZNummer = rZNummer;
		rZNummer = newRZNummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER, oldRZNummer, newRZNummer);
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
	public void setRZNummer(RZ_Nummer_TypeClass newRZNummer) {
		if (newRZNummer != rZNummer) {
			NotificationChain msgs = null;
			if (rZNummer != null)
				msgs = ((InternalEObject)rZNummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER, null, msgs);
			if (newRZNummer != null)
				msgs = ((InternalEObject)newRZNummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER, null, msgs);
			msgs = basicSetRZNummer(newRZNummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER, newRZNummer, newRZNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Titel_TypeClass getTitel() {
		return titel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitel(Titel_TypeClass newTitel, NotificationChain msgs) {
		Titel_TypeClass oldTitel = titel;
		titel = newTitel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL, oldTitel, newTitel);
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
	public void setTitel(Titel_TypeClass newTitel) {
		if (newTitel != titel) {
			NotificationChain msgs = null;
			if (titel != null)
				msgs = ((InternalEObject)titel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL, null, msgs);
			if (newTitel != null)
				msgs = ((InternalEObject)newTitel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL, null, msgs);
			msgs = basicSetTitel(newTitel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL, newTitel, newTitel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untertitel_TypeClass getUntertitel() {
		return untertitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntertitel(Untertitel_TypeClass newUntertitel, NotificationChain msgs) {
		Untertitel_TypeClass oldUntertitel = untertitel;
		untertitel = newUntertitel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL, oldUntertitel, newUntertitel);
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
	public void setUntertitel(Untertitel_TypeClass newUntertitel) {
		if (newUntertitel != untertitel) {
			NotificationChain msgs = null;
			if (untertitel != null)
				msgs = ((InternalEObject)untertitel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL, null, msgs);
			if (newUntertitel != null)
				msgs = ((InternalEObject)newUntertitel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL, null, msgs);
			msgs = basicSetUntertitel(newUntertitel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL, newUntertitel, newUntertitel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD:
				return basicSetBild(null, msgs);
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER:
				return basicSetRZNummer(null, msgs);
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL:
				return basicSetTitel(null, msgs);
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL:
				return basicSetUntertitel(null, msgs);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD:
				return getBild();
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER:
				return getRZNummer();
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL:
				return getTitel();
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL:
				return getUntertitel();
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
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD:
				setBild((Bild_TypeClass)newValue);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER:
				setRZNummer((RZ_Nummer_TypeClass)newValue);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL:
				setTitel((Titel_TypeClass)newValue);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL:
				setUntertitel((Untertitel_TypeClass)newValue);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD:
				setBild((Bild_TypeClass)null);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER:
				setRZNummer((RZ_Nummer_TypeClass)null);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL:
				setTitel((Titel_TypeClass)null);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL:
				setUntertitel((Untertitel_TypeClass)null);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD:
				return bild != null;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER:
				return rZNummer != null;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL:
				return titel != null;
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL:
				return untertitel != null;
		}
		return super.eIsSet(featureID);
	}

} //Regelzeichnung_Allg_AttributeGroupImpl
