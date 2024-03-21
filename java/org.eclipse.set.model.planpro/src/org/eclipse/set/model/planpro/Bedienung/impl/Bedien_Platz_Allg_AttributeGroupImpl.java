/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Platz_Art_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Bedienplatzbezeichnung_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Bedienplatznummer_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Bedienraumnummer_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Platz Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl#getBedienPlatzArt <em>Bedien Platz Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl#getBedienplatzbezeichnung <em>Bedienplatzbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl#getBedienplatznummer <em>Bedienplatznummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Platz_Allg_AttributeGroupImpl#getBedienraumnummer <em>Bedienraumnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Platz_Allg_AttributeGroupImpl extends EObjectImpl implements Bedien_Platz_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedienPlatzArt() <em>Bedien Platz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienPlatzArt()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Platz_Art_TypeClass bedienPlatzArt;

	/**
	 * The cached value of the '{@link #getBedienplatzbezeichnung() <em>Bedienplatzbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienplatzbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedienplatzbezeichnung_TypeClass bedienplatzbezeichnung;

	/**
	 * The cached value of the '{@link #getBedienplatznummer() <em>Bedienplatznummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienplatznummer()
	 * @generated
	 * @ordered
	 */
	protected Bedienplatznummer_TypeClass bedienplatznummer;

	/**
	 * The cached value of the '{@link #getBedienraumnummer() <em>Bedienraumnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienraumnummer()
	 * @generated
	 * @ordered
	 */
	protected Bedienraumnummer_TypeClass bedienraumnummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Platz_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz_Art_TypeClass getBedienPlatzArt() {
		return bedienPlatzArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienPlatzArt(Bedien_Platz_Art_TypeClass newBedienPlatzArt, NotificationChain msgs) {
		Bedien_Platz_Art_TypeClass oldBedienPlatzArt = bedienPlatzArt;
		bedienPlatzArt = newBedienPlatzArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART, oldBedienPlatzArt, newBedienPlatzArt);
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
	public void setBedienPlatzArt(Bedien_Platz_Art_TypeClass newBedienPlatzArt) {
		if (newBedienPlatzArt != bedienPlatzArt) {
			NotificationChain msgs = null;
			if (bedienPlatzArt != null)
				msgs = ((InternalEObject)bedienPlatzArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART, null, msgs);
			if (newBedienPlatzArt != null)
				msgs = ((InternalEObject)newBedienPlatzArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART, null, msgs);
			msgs = basicSetBedienPlatzArt(newBedienPlatzArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART, newBedienPlatzArt, newBedienPlatzArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienplatzbezeichnung_TypeClass getBedienplatzbezeichnung() {
		return bedienplatzbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienplatzbezeichnung(Bedienplatzbezeichnung_TypeClass newBedienplatzbezeichnung, NotificationChain msgs) {
		Bedienplatzbezeichnung_TypeClass oldBedienplatzbezeichnung = bedienplatzbezeichnung;
		bedienplatzbezeichnung = newBedienplatzbezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG, oldBedienplatzbezeichnung, newBedienplatzbezeichnung);
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
	public void setBedienplatzbezeichnung(Bedienplatzbezeichnung_TypeClass newBedienplatzbezeichnung) {
		if (newBedienplatzbezeichnung != bedienplatzbezeichnung) {
			NotificationChain msgs = null;
			if (bedienplatzbezeichnung != null)
				msgs = ((InternalEObject)bedienplatzbezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG, null, msgs);
			if (newBedienplatzbezeichnung != null)
				msgs = ((InternalEObject)newBedienplatzbezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG, null, msgs);
			msgs = basicSetBedienplatzbezeichnung(newBedienplatzbezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG, newBedienplatzbezeichnung, newBedienplatzbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienplatznummer_TypeClass getBedienplatznummer() {
		return bedienplatznummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienplatznummer(Bedienplatznummer_TypeClass newBedienplatznummer, NotificationChain msgs) {
		Bedienplatznummer_TypeClass oldBedienplatznummer = bedienplatznummer;
		bedienplatznummer = newBedienplatznummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER, oldBedienplatznummer, newBedienplatznummer);
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
	public void setBedienplatznummer(Bedienplatznummer_TypeClass newBedienplatznummer) {
		if (newBedienplatznummer != bedienplatznummer) {
			NotificationChain msgs = null;
			if (bedienplatznummer != null)
				msgs = ((InternalEObject)bedienplatznummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER, null, msgs);
			if (newBedienplatznummer != null)
				msgs = ((InternalEObject)newBedienplatznummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER, null, msgs);
			msgs = basicSetBedienplatznummer(newBedienplatznummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER, newBedienplatznummer, newBedienplatznummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienraumnummer_TypeClass getBedienraumnummer() {
		return bedienraumnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienraumnummer(Bedienraumnummer_TypeClass newBedienraumnummer, NotificationChain msgs) {
		Bedienraumnummer_TypeClass oldBedienraumnummer = bedienraumnummer;
		bedienraumnummer = newBedienraumnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER, oldBedienraumnummer, newBedienraumnummer);
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
	public void setBedienraumnummer(Bedienraumnummer_TypeClass newBedienraumnummer) {
		if (newBedienraumnummer != bedienraumnummer) {
			NotificationChain msgs = null;
			if (bedienraumnummer != null)
				msgs = ((InternalEObject)bedienraumnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER, null, msgs);
			if (newBedienraumnummer != null)
				msgs = ((InternalEObject)newBedienraumnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER, null, msgs);
			msgs = basicSetBedienraumnummer(newBedienraumnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER, newBedienraumnummer, newBedienraumnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART:
				return basicSetBedienPlatzArt(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG:
				return basicSetBedienplatzbezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER:
				return basicSetBedienplatznummer(null, msgs);
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER:
				return basicSetBedienraumnummer(null, msgs);
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
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART:
				return getBedienPlatzArt();
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG:
				return getBedienplatzbezeichnung();
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER:
				return getBedienplatznummer();
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER:
				return getBedienraumnummer();
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
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART:
				setBedienPlatzArt((Bedien_Platz_Art_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG:
				setBedienplatzbezeichnung((Bedienplatzbezeichnung_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER:
				setBedienplatznummer((Bedienplatznummer_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER:
				setBedienraumnummer((Bedienraumnummer_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART:
				setBedienPlatzArt((Bedien_Platz_Art_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG:
				setBedienplatzbezeichnung((Bedienplatzbezeichnung_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER:
				setBedienplatznummer((Bedienplatznummer_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER:
				setBedienraumnummer((Bedienraumnummer_TypeClass)null);
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
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIEN_PLATZ_ART:
				return bedienPlatzArt != null;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZBEZEICHNUNG:
				return bedienplatzbezeichnung != null;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENPLATZNUMMER:
				return bedienplatznummer != null;
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP__BEDIENRAUMNUMMER:
				return bedienraumnummer != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Platz_Allg_AttributeGroupImpl
