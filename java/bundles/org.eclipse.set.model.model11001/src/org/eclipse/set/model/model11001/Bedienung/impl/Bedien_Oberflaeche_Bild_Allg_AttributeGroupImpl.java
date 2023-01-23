/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;
import org.eclipse.set.model.model11001.Bedienung.Oberflaeche_Bildart_TypeClass;
import org.eclipse.set.model.model11001.Bedienung.Oberflaeche_Zustaendigkeit_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche Bild Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl#getOberflaecheBildart <em>Oberflaeche Bildart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl#getOberflaecheZustaendigkeit <em>Oberflaeche Zustaendigkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl extends EObjectImpl implements Bedien_Oberflaeche_Bild_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getOberflaecheBildart() <em>Oberflaeche Bildart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberflaecheBildart()
	 * @generated
	 * @ordered
	 */
	protected Oberflaeche_Bildart_TypeClass oberflaecheBildart;

	/**
	 * The cached value of the '{@link #getOberflaecheZustaendigkeit() <em>Oberflaeche Zustaendigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberflaecheZustaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected Oberflaeche_Zustaendigkeit_TypeClass oberflaecheZustaendigkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberflaeche_Bildart_TypeClass getOberflaecheBildart() {
		return oberflaecheBildart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOberflaecheBildart(Oberflaeche_Bildart_TypeClass newOberflaecheBildart, NotificationChain msgs) {
		Oberflaeche_Bildart_TypeClass oldOberflaecheBildart = oberflaecheBildart;
		oberflaecheBildart = newOberflaecheBildart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART, oldOberflaecheBildart, newOberflaecheBildart);
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
	public void setOberflaecheBildart(Oberflaeche_Bildart_TypeClass newOberflaecheBildart) {
		if (newOberflaecheBildart != oberflaecheBildart) {
			NotificationChain msgs = null;
			if (oberflaecheBildart != null)
				msgs = ((InternalEObject)oberflaecheBildart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART, null, msgs);
			if (newOberflaecheBildart != null)
				msgs = ((InternalEObject)newOberflaecheBildart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART, null, msgs);
			msgs = basicSetOberflaecheBildart(newOberflaecheBildart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART, newOberflaecheBildart, newOberflaecheBildart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberflaeche_Zustaendigkeit_TypeClass getOberflaecheZustaendigkeit() {
		return oberflaecheZustaendigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOberflaecheZustaendigkeit(Oberflaeche_Zustaendigkeit_TypeClass newOberflaecheZustaendigkeit, NotificationChain msgs) {
		Oberflaeche_Zustaendigkeit_TypeClass oldOberflaecheZustaendigkeit = oberflaecheZustaendigkeit;
		oberflaecheZustaendigkeit = newOberflaecheZustaendigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT, oldOberflaecheZustaendigkeit, newOberflaecheZustaendigkeit);
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
	public void setOberflaecheZustaendigkeit(Oberflaeche_Zustaendigkeit_TypeClass newOberflaecheZustaendigkeit) {
		if (newOberflaecheZustaendigkeit != oberflaecheZustaendigkeit) {
			NotificationChain msgs = null;
			if (oberflaecheZustaendigkeit != null)
				msgs = ((InternalEObject)oberflaecheZustaendigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT, null, msgs);
			if (newOberflaecheZustaendigkeit != null)
				msgs = ((InternalEObject)newOberflaecheZustaendigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT, null, msgs);
			msgs = basicSetOberflaecheZustaendigkeit(newOberflaecheZustaendigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT, newOberflaecheZustaendigkeit, newOberflaecheZustaendigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART:
				return basicSetOberflaecheBildart(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT:
				return basicSetOberflaecheZustaendigkeit(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART:
				return getOberflaecheBildart();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT:
				return getOberflaecheZustaendigkeit();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART:
				setOberflaecheBildart((Oberflaeche_Bildart_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT:
				setOberflaecheZustaendigkeit((Oberflaeche_Zustaendigkeit_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART:
				setOberflaecheBildart((Oberflaeche_Bildart_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT:
				setOberflaecheZustaendigkeit((Oberflaeche_Zustaendigkeit_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_BILDART:
				return oberflaecheBildart != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP__OBERFLAECHE_ZUSTAENDIGKEIT:
				return oberflaecheZustaendigkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl
