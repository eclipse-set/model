/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bauart_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Energieversorgung_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Hersteller_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW Zentraleinheit Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getBauart <em>Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getEnergieversorgungArt <em>Energieversorgung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_Zentraleinheit_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ESTW_Zentraleinheit_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBauart() <em>Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauart()
	 * @generated
	 * @ordered
	 */
	protected Bauart_TypeClass bauart;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArt() <em>Energieversorgung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArt()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_TypeClass energieversorgungArt;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArtErsatz() <em>Energieversorgung Art Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArtErsatz()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_Ersatz_TypeClass energieversorgungArtErsatz;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArtErsatz2() <em>Energieversorgung Art Ersatz2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArtErsatz2()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_Ersatz_TypeClass energieversorgungArtErsatz2;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_Zentraleinheit_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauart_TypeClass getBauart() {
		return bauart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauart(Bauart_TypeClass newBauart, NotificationChain msgs) {
		Bauart_TypeClass oldBauart = bauart;
		bauart = newBauart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, oldBauart, newBauart);
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
	public void setBauart(Bauart_TypeClass newBauart) {
		if (newBauart != bauart) {
			NotificationChain msgs = null;
			if (bauart != null)
				msgs = ((InternalEObject)bauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			if (newBauart != null)
				msgs = ((InternalEObject)newBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			msgs = basicSetBauart(newBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, newBauart, newBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_TypeClass getEnergieversorgungArt() {
		return energieversorgungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt, NotificationChain msgs) {
		Energieversorgung_Art_TypeClass oldEnergieversorgungArt = energieversorgungArt;
		energieversorgungArt = newEnergieversorgungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, oldEnergieversorgungArt, newEnergieversorgungArt);
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
	public void setEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt) {
		if (newEnergieversorgungArt != energieversorgungArt) {
			NotificationChain msgs = null;
			if (energieversorgungArt != null)
				msgs = ((InternalEObject)energieversorgungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			if (newEnergieversorgungArt != null)
				msgs = ((InternalEObject)newEnergieversorgungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			msgs = basicSetEnergieversorgungArt(newEnergieversorgungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, newEnergieversorgungArt, newEnergieversorgungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz() {
		return energieversorgungArtErsatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz, NotificationChain msgs) {
		Energieversorgung_Art_Ersatz_TypeClass oldEnergieversorgungArtErsatz = energieversorgungArtErsatz;
		energieversorgungArtErsatz = newEnergieversorgungArtErsatz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, oldEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz);
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
	public void setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz) {
		if (newEnergieversorgungArtErsatz != energieversorgungArtErsatz) {
			NotificationChain msgs = null;
			if (energieversorgungArtErsatz != null)
				msgs = ((InternalEObject)energieversorgungArtErsatz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			if (newEnergieversorgungArtErsatz != null)
				msgs = ((InternalEObject)newEnergieversorgungArtErsatz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			msgs = basicSetEnergieversorgungArtErsatz(newEnergieversorgungArtErsatz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, newEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz2() {
		return energieversorgungArtErsatz2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz2, NotificationChain msgs) {
		Energieversorgung_Art_Ersatz_TypeClass oldEnergieversorgungArtErsatz2 = energieversorgungArtErsatz2;
		energieversorgungArtErsatz2 = newEnergieversorgungArtErsatz2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, oldEnergieversorgungArtErsatz2, newEnergieversorgungArtErsatz2);
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
	public void setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz2) {
		if (newEnergieversorgungArtErsatz2 != energieversorgungArtErsatz2) {
			NotificationChain msgs = null;
			if (energieversorgungArtErsatz2 != null)
				msgs = ((InternalEObject)energieversorgungArtErsatz2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, null, msgs);
			if (newEnergieversorgungArtErsatz2 != null)
				msgs = ((InternalEObject)newEnergieversorgungArtErsatz2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, null, msgs);
			msgs = basicSetEnergieversorgungArtErsatz2(newEnergieversorgungArtErsatz2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, newEnergieversorgungArtErsatz2, newEnergieversorgungArtErsatz2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return basicSetBauart(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return basicSetEnergieversorgungArt(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return basicSetEnergieversorgungArtErsatz(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return basicSetEnergieversorgungArtErsatz2(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return getBauart();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return getEnergieversorgungArt();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return getEnergieversorgungArtErsatz();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return getEnergieversorgungArtErsatz2();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				setEnergieversorgungArtErsatz2((Energieversorgung_Art_Ersatz_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				setEnergieversorgungArtErsatz2((Energieversorgung_Art_Ersatz_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return bauart != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return energieversorgungArt != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return energieversorgungArtErsatz != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return energieversorgungArtErsatz2 != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
		}
		return super.eIsSet(featureID);
	}

} //ESTW_Zentraleinheit_Allg_AttributeGroupImpl
