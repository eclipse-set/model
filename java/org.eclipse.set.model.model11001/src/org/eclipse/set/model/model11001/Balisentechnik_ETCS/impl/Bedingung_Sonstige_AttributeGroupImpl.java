/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Anlagenteil_Sonstige_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Text_Bedingung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Sonstige Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Bedingung_Sonstige_AttributeGroupImpl#getAnlagenteilSonstige <em>Anlagenteil Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Bedingung_Sonstige_AttributeGroupImpl#getTextBedingung <em>Text Bedingung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Sonstige_AttributeGroupImpl extends EObjectImpl implements Bedingung_Sonstige_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnlagenteilSonstige() <em>Anlagenteil Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenteilSonstige()
	 * @generated
	 * @ordered
	 */
	protected Anlagenteil_Sonstige_TypeClass anlagenteilSonstige;

	/**
	 * The cached value of the '{@link #getTextBedingung() <em>Text Bedingung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBedingung()
	 * @generated
	 * @ordered
	 */
	protected Text_Bedingung_TypeClass textBedingung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Sonstige_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Sonstige_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anlagenteil_Sonstige_TypeClass getAnlagenteilSonstige() {
		return anlagenteilSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnlagenteilSonstige(Anlagenteil_Sonstige_TypeClass newAnlagenteilSonstige, NotificationChain msgs) {
		Anlagenteil_Sonstige_TypeClass oldAnlagenteilSonstige = anlagenteilSonstige;
		anlagenteilSonstige = newAnlagenteilSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE, oldAnlagenteilSonstige, newAnlagenteilSonstige);
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
	public void setAnlagenteilSonstige(Anlagenteil_Sonstige_TypeClass newAnlagenteilSonstige) {
		if (newAnlagenteilSonstige != anlagenteilSonstige) {
			NotificationChain msgs = null;
			if (anlagenteilSonstige != null)
				msgs = ((InternalEObject)anlagenteilSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE, null, msgs);
			if (newAnlagenteilSonstige != null)
				msgs = ((InternalEObject)newAnlagenteilSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE, null, msgs);
			msgs = basicSetAnlagenteilSonstige(newAnlagenteilSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE, newAnlagenteilSonstige, newAnlagenteilSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text_Bedingung_TypeClass getTextBedingung() {
		return textBedingung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextBedingung(Text_Bedingung_TypeClass newTextBedingung, NotificationChain msgs) {
		Text_Bedingung_TypeClass oldTextBedingung = textBedingung;
		textBedingung = newTextBedingung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG, oldTextBedingung, newTextBedingung);
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
	public void setTextBedingung(Text_Bedingung_TypeClass newTextBedingung) {
		if (newTextBedingung != textBedingung) {
			NotificationChain msgs = null;
			if (textBedingung != null)
				msgs = ((InternalEObject)textBedingung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG, null, msgs);
			if (newTextBedingung != null)
				msgs = ((InternalEObject)newTextBedingung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG, null, msgs);
			msgs = basicSetTextBedingung(newTextBedingung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG, newTextBedingung, newTextBedingung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE:
				return basicSetAnlagenteilSonstige(null, msgs);
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG:
				return basicSetTextBedingung(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE:
				return getAnlagenteilSonstige();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG:
				return getTextBedingung();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE:
				setAnlagenteilSonstige((Anlagenteil_Sonstige_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG:
				setTextBedingung((Text_Bedingung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE:
				setAnlagenteilSonstige((Anlagenteil_Sonstige_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG:
				setTextBedingung((Text_Bedingung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__ANLAGENTEIL_SONSTIGE:
				return anlagenteilSonstige != null;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP__TEXT_BEDINGUNG:
				return textBedingung != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedingung_Sonstige_AttributeGroupImpl
