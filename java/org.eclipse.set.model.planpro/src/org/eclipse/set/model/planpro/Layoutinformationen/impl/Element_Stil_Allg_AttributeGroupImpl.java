/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Stil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl#getFuellung <em>Fuellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl#getLinieArt <em>Linie Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl#getLinieFarbwert <em>Linie Farbwert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Element_Stil_Allg_AttributeGroupImpl#getLinieSubart <em>Linie Subart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Element_Stil_Allg_AttributeGroupImpl extends EObjectImpl implements Element_Stil_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFuellung() <em>Fuellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuellung()
	 * @generated
	 * @ordered
	 */
	protected Fuellung_TypeClass fuellung;

	/**
	 * The cached value of the '{@link #getLinieArt() <em>Linie Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinieArt()
	 * @generated
	 * @ordered
	 */
	protected Linie_Art_TypeClass linieArt;

	/**
	 * The cached value of the '{@link #getLinieFarbwert() <em>Linie Farbwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinieFarbwert()
	 * @generated
	 * @ordered
	 */
	protected Linie_Farbwert_TypeClass linieFarbwert;

	/**
	 * The cached value of the '{@link #getLinieSubart() <em>Linie Subart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinieSubart()
	 * @generated
	 * @ordered
	 */
	protected Linie_Subart_TypeClass linieSubart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_Stil_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuellung_TypeClass getFuellung() {
		return fuellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuellung(Fuellung_TypeClass newFuellung, NotificationChain msgs) {
		Fuellung_TypeClass oldFuellung = fuellung;
		fuellung = newFuellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG, oldFuellung, newFuellung);
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
	public void setFuellung(Fuellung_TypeClass newFuellung) {
		if (newFuellung != fuellung) {
			NotificationChain msgs = null;
			if (fuellung != null)
				msgs = ((InternalEObject)fuellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG, null, msgs);
			if (newFuellung != null)
				msgs = ((InternalEObject)newFuellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG, null, msgs);
			msgs = basicSetFuellung(newFuellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG, newFuellung, newFuellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Art_TypeClass getLinieArt() {
		return linieArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinieArt(Linie_Art_TypeClass newLinieArt, NotificationChain msgs) {
		Linie_Art_TypeClass oldLinieArt = linieArt;
		linieArt = newLinieArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART, oldLinieArt, newLinieArt);
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
	public void setLinieArt(Linie_Art_TypeClass newLinieArt) {
		if (newLinieArt != linieArt) {
			NotificationChain msgs = null;
			if (linieArt != null)
				msgs = ((InternalEObject)linieArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART, null, msgs);
			if (newLinieArt != null)
				msgs = ((InternalEObject)newLinieArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART, null, msgs);
			msgs = basicSetLinieArt(newLinieArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART, newLinieArt, newLinieArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Farbwert_TypeClass getLinieFarbwert() {
		return linieFarbwert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinieFarbwert(Linie_Farbwert_TypeClass newLinieFarbwert, NotificationChain msgs) {
		Linie_Farbwert_TypeClass oldLinieFarbwert = linieFarbwert;
		linieFarbwert = newLinieFarbwert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT, oldLinieFarbwert, newLinieFarbwert);
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
	public void setLinieFarbwert(Linie_Farbwert_TypeClass newLinieFarbwert) {
		if (newLinieFarbwert != linieFarbwert) {
			NotificationChain msgs = null;
			if (linieFarbwert != null)
				msgs = ((InternalEObject)linieFarbwert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT, null, msgs);
			if (newLinieFarbwert != null)
				msgs = ((InternalEObject)newLinieFarbwert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT, null, msgs);
			msgs = basicSetLinieFarbwert(newLinieFarbwert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT, newLinieFarbwert, newLinieFarbwert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linie_Subart_TypeClass getLinieSubart() {
		return linieSubart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinieSubart(Linie_Subart_TypeClass newLinieSubart, NotificationChain msgs) {
		Linie_Subart_TypeClass oldLinieSubart = linieSubart;
		linieSubart = newLinieSubart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART, oldLinieSubart, newLinieSubart);
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
	public void setLinieSubart(Linie_Subart_TypeClass newLinieSubart) {
		if (newLinieSubart != linieSubart) {
			NotificationChain msgs = null;
			if (linieSubart != null)
				msgs = ((InternalEObject)linieSubart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART, null, msgs);
			if (newLinieSubart != null)
				msgs = ((InternalEObject)newLinieSubart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART, null, msgs);
			msgs = basicSetLinieSubart(newLinieSubart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART, newLinieSubart, newLinieSubart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG:
				return basicSetFuellung(null, msgs);
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART:
				return basicSetLinieArt(null, msgs);
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT:
				return basicSetLinieFarbwert(null, msgs);
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART:
				return basicSetLinieSubart(null, msgs);
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
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG:
				return getFuellung();
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART:
				return getLinieArt();
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT:
				return getLinieFarbwert();
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART:
				return getLinieSubart();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG:
				setFuellung((Fuellung_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART:
				setLinieArt((Linie_Art_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT:
				setLinieFarbwert((Linie_Farbwert_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART:
				setLinieSubart((Linie_Subart_TypeClass)newValue);
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
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG:
				setFuellung((Fuellung_TypeClass)null);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART:
				setLinieArt((Linie_Art_TypeClass)null);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT:
				setLinieFarbwert((Linie_Farbwert_TypeClass)null);
				return;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART:
				setLinieSubart((Linie_Subart_TypeClass)null);
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
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG:
				return fuellung != null;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART:
				return linieArt != null;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT:
				return linieFarbwert != null;
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART:
				return linieSubart != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Element_Stil_Allg_AttributeGroupImpl
