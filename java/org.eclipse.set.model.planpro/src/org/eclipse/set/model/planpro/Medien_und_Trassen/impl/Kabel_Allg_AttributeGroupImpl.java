/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Induktionsschutz_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Art_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Laenge_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Typ_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Nagetierschutz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getInduktionsschutz <em>Induktionsschutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelArt <em>Kabel Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelLaenge <em>Kabel Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelTyp <em>Kabel Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getNagetierschutz <em>Nagetierschutz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_Allg_AttributeGroupImpl extends EObjectImpl implements Kabel_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getInduktionsschutz() <em>Induktionsschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInduktionsschutz()
	 * @generated
	 * @ordered
	 */
	protected Induktionsschutz_TypeClass induktionsschutz;

	/**
	 * The cached value of the '{@link #getKabelArt() <em>Kabel Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelArt()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Art_TypeClass kabelArt;

	/**
	 * The cached value of the '{@link #getKabelLaenge() <em>Kabel Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelLaenge()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Laenge_TypeClass kabelLaenge;

	/**
	 * The cached value of the '{@link #getKabelTyp() <em>Kabel Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelTyp()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Typ_TypeClass kabelTyp;

	/**
	 * The cached value of the '{@link #getNagetierschutz() <em>Nagetierschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNagetierschutz()
	 * @generated
	 * @ordered
	 */
	protected Nagetierschutz_TypeClass nagetierschutz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kabel_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Induktionsschutz_TypeClass getInduktionsschutz() {
		return induktionsschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInduktionsschutz(Induktionsschutz_TypeClass newInduktionsschutz, NotificationChain msgs) {
		Induktionsschutz_TypeClass oldInduktionsschutz = induktionsschutz;
		induktionsschutz = newInduktionsschutz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ, oldInduktionsschutz, newInduktionsschutz);
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
	public void setInduktionsschutz(Induktionsschutz_TypeClass newInduktionsschutz) {
		if (newInduktionsschutz != induktionsschutz) {
			NotificationChain msgs = null;
			if (induktionsschutz != null)
				msgs = ((InternalEObject)induktionsschutz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ, null, msgs);
			if (newInduktionsschutz != null)
				msgs = ((InternalEObject)newInduktionsschutz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ, null, msgs);
			msgs = basicSetInduktionsschutz(newInduktionsschutz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ, newInduktionsschutz, newInduktionsschutz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Art_TypeClass getKabelArt() {
		return kabelArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelArt(Kabel_Art_TypeClass newKabelArt, NotificationChain msgs) {
		Kabel_Art_TypeClass oldKabelArt = kabelArt;
		kabelArt = newKabelArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, oldKabelArt, newKabelArt);
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
	public void setKabelArt(Kabel_Art_TypeClass newKabelArt) {
		if (newKabelArt != kabelArt) {
			NotificationChain msgs = null;
			if (kabelArt != null)
				msgs = ((InternalEObject)kabelArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, null, msgs);
			if (newKabelArt != null)
				msgs = ((InternalEObject)newKabelArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, null, msgs);
			msgs = basicSetKabelArt(newKabelArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, newKabelArt, newKabelArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Laenge_TypeClass getKabelLaenge() {
		return kabelLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelLaenge(Kabel_Laenge_TypeClass newKabelLaenge, NotificationChain msgs) {
		Kabel_Laenge_TypeClass oldKabelLaenge = kabelLaenge;
		kabelLaenge = newKabelLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, oldKabelLaenge, newKabelLaenge);
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
	public void setKabelLaenge(Kabel_Laenge_TypeClass newKabelLaenge) {
		if (newKabelLaenge != kabelLaenge) {
			NotificationChain msgs = null;
			if (kabelLaenge != null)
				msgs = ((InternalEObject)kabelLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, null, msgs);
			if (newKabelLaenge != null)
				msgs = ((InternalEObject)newKabelLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, null, msgs);
			msgs = basicSetKabelLaenge(newKabelLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, newKabelLaenge, newKabelLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Typ_TypeClass getKabelTyp() {
		return kabelTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelTyp(Kabel_Typ_TypeClass newKabelTyp, NotificationChain msgs) {
		Kabel_Typ_TypeClass oldKabelTyp = kabelTyp;
		kabelTyp = newKabelTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, oldKabelTyp, newKabelTyp);
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
	public void setKabelTyp(Kabel_Typ_TypeClass newKabelTyp) {
		if (newKabelTyp != kabelTyp) {
			NotificationChain msgs = null;
			if (kabelTyp != null)
				msgs = ((InternalEObject)kabelTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, null, msgs);
			if (newKabelTyp != null)
				msgs = ((InternalEObject)newKabelTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, null, msgs);
			msgs = basicSetKabelTyp(newKabelTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, newKabelTyp, newKabelTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nagetierschutz_TypeClass getNagetierschutz() {
		return nagetierschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNagetierschutz(Nagetierschutz_TypeClass newNagetierschutz, NotificationChain msgs) {
		Nagetierschutz_TypeClass oldNagetierschutz = nagetierschutz;
		nagetierschutz = newNagetierschutz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ, oldNagetierschutz, newNagetierschutz);
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
	public void setNagetierschutz(Nagetierschutz_TypeClass newNagetierschutz) {
		if (newNagetierschutz != nagetierschutz) {
			NotificationChain msgs = null;
			if (nagetierschutz != null)
				msgs = ((InternalEObject)nagetierschutz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ, null, msgs);
			if (newNagetierschutz != null)
				msgs = ((InternalEObject)newNagetierschutz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ, null, msgs);
			msgs = basicSetNagetierschutz(newNagetierschutz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ, newNagetierschutz, newNagetierschutz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ:
				return basicSetInduktionsschutz(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return basicSetKabelArt(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return basicSetKabelLaenge(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return basicSetKabelTyp(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ:
				return basicSetNagetierschutz(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ:
				return getInduktionsschutz();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return getKabelArt();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return getKabelLaenge();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return getKabelTyp();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ:
				return getNagetierschutz();
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ:
				setInduktionsschutz((Induktionsschutz_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				setKabelArt((Kabel_Art_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				setKabelLaenge((Kabel_Laenge_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				setKabelTyp((Kabel_Typ_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ:
				setNagetierschutz((Nagetierschutz_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ:
				setInduktionsschutz((Induktionsschutz_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				setKabelArt((Kabel_Art_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				setKabelLaenge((Kabel_Laenge_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				setKabelTyp((Kabel_Typ_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ:
				setNagetierschutz((Nagetierschutz_TypeClass)null);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ:
				return induktionsschutz != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return kabelArt != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return kabelLaenge != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return kabelTyp != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ:
				return nagetierschutz != null;
		}
		return super.eIsSet(featureID);
	}

} //Kabel_Allg_AttributeGroupImpl
