/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;
import org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pruefmerkmale Daten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl#getDatumAuslieferung <em>Datum Auslieferung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl#getPruefsumme <em>Pruefsumme</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl#getPruefsummeArt <em>Pruefsumme Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.impl.Pruefmerkmale_Daten_AttributeGroupImpl#getVersionAuslieferung <em>Version Auslieferung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pruefmerkmale_Daten_AttributeGroupImpl extends EObjectImpl implements Pruefmerkmale_Daten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDatumAuslieferung() <em>Datum Auslieferung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumAuslieferung()
	 * @generated
	 * @ordered
	 */
	protected Datum_Auslieferung_TypeClass datumAuslieferung;

	/**
	 * The cached value of the '{@link #getPruefsumme() <em>Pruefsumme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefsumme()
	 * @generated
	 * @ordered
	 */
	protected Pruefsumme_TypeClass pruefsumme;

	/**
	 * The cached value of the '{@link #getPruefsummeArt() <em>Pruefsumme Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefsummeArt()
	 * @generated
	 * @ordered
	 */
	protected Pruefsumme_Art_TypeClass pruefsummeArt;

	/**
	 * The cached value of the '{@link #getVersionAuslieferung() <em>Version Auslieferung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAuslieferung()
	 * @generated
	 * @ordered
	 */
	protected Version_Auslieferung_TypeClass versionAuslieferung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pruefmerkmale_Daten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisTypenPackage.Literals.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Auslieferung_TypeClass getDatumAuslieferung() {
		return datumAuslieferung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumAuslieferung(Datum_Auslieferung_TypeClass newDatumAuslieferung, NotificationChain msgs) {
		Datum_Auslieferung_TypeClass oldDatumAuslieferung = datumAuslieferung;
		datumAuslieferung = newDatumAuslieferung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG, oldDatumAuslieferung, newDatumAuslieferung);
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
	public void setDatumAuslieferung(Datum_Auslieferung_TypeClass newDatumAuslieferung) {
		if (newDatumAuslieferung != datumAuslieferung) {
			NotificationChain msgs = null;
			if (datumAuslieferung != null)
				msgs = ((InternalEObject)datumAuslieferung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG, null, msgs);
			if (newDatumAuslieferung != null)
				msgs = ((InternalEObject)newDatumAuslieferung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG, null, msgs);
			msgs = basicSetDatumAuslieferung(newDatumAuslieferung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG, newDatumAuslieferung, newDatumAuslieferung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefsumme_TypeClass getPruefsumme() {
		return pruefsumme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefsumme(Pruefsumme_TypeClass newPruefsumme, NotificationChain msgs) {
		Pruefsumme_TypeClass oldPruefsumme = pruefsumme;
		pruefsumme = newPruefsumme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME, oldPruefsumme, newPruefsumme);
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
	public void setPruefsumme(Pruefsumme_TypeClass newPruefsumme) {
		if (newPruefsumme != pruefsumme) {
			NotificationChain msgs = null;
			if (pruefsumme != null)
				msgs = ((InternalEObject)pruefsumme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME, null, msgs);
			if (newPruefsumme != null)
				msgs = ((InternalEObject)newPruefsumme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME, null, msgs);
			msgs = basicSetPruefsumme(newPruefsumme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME, newPruefsumme, newPruefsumme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefsumme_Art_TypeClass getPruefsummeArt() {
		return pruefsummeArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefsummeArt(Pruefsumme_Art_TypeClass newPruefsummeArt, NotificationChain msgs) {
		Pruefsumme_Art_TypeClass oldPruefsummeArt = pruefsummeArt;
		pruefsummeArt = newPruefsummeArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART, oldPruefsummeArt, newPruefsummeArt);
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
	public void setPruefsummeArt(Pruefsumme_Art_TypeClass newPruefsummeArt) {
		if (newPruefsummeArt != pruefsummeArt) {
			NotificationChain msgs = null;
			if (pruefsummeArt != null)
				msgs = ((InternalEObject)pruefsummeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART, null, msgs);
			if (newPruefsummeArt != null)
				msgs = ((InternalEObject)newPruefsummeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART, null, msgs);
			msgs = basicSetPruefsummeArt(newPruefsummeArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART, newPruefsummeArt, newPruefsummeArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version_Auslieferung_TypeClass getVersionAuslieferung() {
		return versionAuslieferung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionAuslieferung(Version_Auslieferung_TypeClass newVersionAuslieferung, NotificationChain msgs) {
		Version_Auslieferung_TypeClass oldVersionAuslieferung = versionAuslieferung;
		versionAuslieferung = newVersionAuslieferung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG, oldVersionAuslieferung, newVersionAuslieferung);
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
	public void setVersionAuslieferung(Version_Auslieferung_TypeClass newVersionAuslieferung) {
		if (newVersionAuslieferung != versionAuslieferung) {
			NotificationChain msgs = null;
			if (versionAuslieferung != null)
				msgs = ((InternalEObject)versionAuslieferung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG, null, msgs);
			if (newVersionAuslieferung != null)
				msgs = ((InternalEObject)newVersionAuslieferung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG, null, msgs);
			msgs = basicSetVersionAuslieferung(newVersionAuslieferung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG, newVersionAuslieferung, newVersionAuslieferung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG:
				return basicSetDatumAuslieferung(null, msgs);
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME:
				return basicSetPruefsumme(null, msgs);
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART:
				return basicSetPruefsummeArt(null, msgs);
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG:
				return basicSetVersionAuslieferung(null, msgs);
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
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG:
				return getDatumAuslieferung();
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME:
				return getPruefsumme();
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART:
				return getPruefsummeArt();
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG:
				return getVersionAuslieferung();
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
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG:
				setDatumAuslieferung((Datum_Auslieferung_TypeClass)newValue);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME:
				setPruefsumme((Pruefsumme_TypeClass)newValue);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART:
				setPruefsummeArt((Pruefsumme_Art_TypeClass)newValue);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG:
				setVersionAuslieferung((Version_Auslieferung_TypeClass)newValue);
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
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG:
				setDatumAuslieferung((Datum_Auslieferung_TypeClass)null);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME:
				setPruefsumme((Pruefsumme_TypeClass)null);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART:
				setPruefsummeArt((Pruefsumme_Art_TypeClass)null);
				return;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG:
				setVersionAuslieferung((Version_Auslieferung_TypeClass)null);
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
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG:
				return datumAuslieferung != null;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME:
				return pruefsumme != null;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART:
				return pruefsummeArt != null;
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG:
				return versionAuslieferung != null;
		}
		return super.eIsSet(featureID);
	}

} //Pruefmerkmale_Daten_AttributeGroupImpl
