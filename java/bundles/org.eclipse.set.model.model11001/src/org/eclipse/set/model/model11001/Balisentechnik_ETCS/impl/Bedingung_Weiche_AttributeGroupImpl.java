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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Weichenlage_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Weiche Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Bedingung_Weiche_AttributeGroupImpl#getBedingungWeichenlage <em>Bedingung Weichenlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Bedingung_Weiche_AttributeGroupImpl#getIDWElement <em>IDW Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Weiche_AttributeGroupImpl extends EObjectImpl implements Bedingung_Weiche_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedingungWeichenlage() <em>Bedingung Weichenlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungWeichenlage()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Weichenlage_TypeClass bedingungWeichenlage;

	/**
	 * The cached value of the '{@link #getIDWElement() <em>IDW Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDWElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Weiche_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Weiche_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Weichenlage_TypeClass getBedingungWeichenlage() {
		return bedingungWeichenlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungWeichenlage(Bedingung_Weichenlage_TypeClass newBedingungWeichenlage, NotificationChain msgs) {
		Bedingung_Weichenlage_TypeClass oldBedingungWeichenlage = bedingungWeichenlage;
		bedingungWeichenlage = newBedingungWeichenlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, oldBedingungWeichenlage, newBedingungWeichenlage);
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
	public void setBedingungWeichenlage(Bedingung_Weichenlage_TypeClass newBedingungWeichenlage) {
		if (newBedingungWeichenlage != bedingungWeichenlage) {
			NotificationChain msgs = null;
			if (bedingungWeichenlage != null)
				msgs = ((InternalEObject)bedingungWeichenlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, null, msgs);
			if (newBedingungWeichenlage != null)
				msgs = ((InternalEObject)newBedingungWeichenlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, null, msgs);
			msgs = basicSetBedingungWeichenlage(newBedingungWeichenlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, newBedingungWeichenlage, newBedingungWeichenlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDWElement() {
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDWElement = iDWElement;
		iDWElement = newIDWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, newIDWElement);
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
	public void setIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement) {
		if (newIDWElement != iDWElement) {
			NotificationChain msgs = null;
			if (iDWElement != null)
				msgs = ((InternalEObject)iDWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, null, msgs);
			if (newIDWElement != null)
				msgs = ((InternalEObject)newIDWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, null, msgs);
			msgs = basicSetIDWElement(newIDWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, newIDWElement, newIDWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return basicSetBedingungWeichenlage(null, msgs);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return basicSetIDWElement(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return getBedingungWeichenlage();
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return getIDWElement();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				setBedingungWeichenlage((Bedingung_Weichenlage_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				setBedingungWeichenlage((Bedingung_Weichenlage_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return bedingungWeichenlage != null;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return iDWElement != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedingung_Weiche_AttributeGroupImpl
