/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Signale.Anschaltdauer_TypeClass;
import org.eclipse.set.model.model1902.Signale.Beleuchtet_TypeClass;
import org.eclipse.set.model.model1902.Signale.Geschaltet_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Signalbegriff_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;
import org.eclipse.set.model.model1902.Signale.Zs2_Ueberwacht_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Signalbegriff Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl#getAnschaltdauer <em>Anschaltdauer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl#getBeleuchtet <em>Beleuchtet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl#getGeschaltet <em>Geschaltet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Signalbegriff_Allg_AttributeGroupImpl#getZs2Ueberwacht <em>Zs2 Ueberwacht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Signalbegriff_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Signalbegriff_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnschaltdauer() <em>Anschaltdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschaltdauer()
	 * @generated
	 * @ordered
	 */
	protected Anschaltdauer_TypeClass anschaltdauer;

	/**
	 * The cached value of the '{@link #getBeleuchtet() <em>Beleuchtet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeleuchtet()
	 * @generated
	 * @ordered
	 */
	protected Beleuchtet_TypeClass beleuchtet;

	/**
	 * The cached value of the '{@link #getGeschaltet() <em>Geschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschaltet()
	 * @generated
	 * @ordered
	 */
	protected Geschaltet_TypeClass geschaltet;

	/**
	 * The cached value of the '{@link #getZs2Ueberwacht() <em>Zs2 Ueberwacht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZs2Ueberwacht()
	 * @generated
	 * @ordered
	 */
	protected Zs2_Ueberwacht_TypeClass zs2Ueberwacht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Signalbegriff_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anschaltdauer_TypeClass getAnschaltdauer() {
		return anschaltdauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschaltdauer(Anschaltdauer_TypeClass newAnschaltdauer, NotificationChain msgs) {
		Anschaltdauer_TypeClass oldAnschaltdauer = anschaltdauer;
		anschaltdauer = newAnschaltdauer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER, oldAnschaltdauer, newAnschaltdauer);
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
	public void setAnschaltdauer(Anschaltdauer_TypeClass newAnschaltdauer) {
		if (newAnschaltdauer != anschaltdauer) {
			NotificationChain msgs = null;
			if (anschaltdauer != null)
				msgs = ((InternalEObject)anschaltdauer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER, null, msgs);
			if (newAnschaltdauer != null)
				msgs = ((InternalEObject)newAnschaltdauer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER, null, msgs);
			msgs = basicSetAnschaltdauer(newAnschaltdauer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER, newAnschaltdauer, newAnschaltdauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beleuchtet_TypeClass getBeleuchtet() {
		return beleuchtet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeleuchtet(Beleuchtet_TypeClass newBeleuchtet, NotificationChain msgs) {
		Beleuchtet_TypeClass oldBeleuchtet = beleuchtet;
		beleuchtet = newBeleuchtet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET, oldBeleuchtet, newBeleuchtet);
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
	public void setBeleuchtet(Beleuchtet_TypeClass newBeleuchtet) {
		if (newBeleuchtet != beleuchtet) {
			NotificationChain msgs = null;
			if (beleuchtet != null)
				msgs = ((InternalEObject)beleuchtet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET, null, msgs);
			if (newBeleuchtet != null)
				msgs = ((InternalEObject)newBeleuchtet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET, null, msgs);
			msgs = basicSetBeleuchtet(newBeleuchtet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET, newBeleuchtet, newBeleuchtet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschaltet_TypeClass getGeschaltet() {
		return geschaltet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschaltet(Geschaltet_TypeClass newGeschaltet, NotificationChain msgs) {
		Geschaltet_TypeClass oldGeschaltet = geschaltet;
		geschaltet = newGeschaltet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET, oldGeschaltet, newGeschaltet);
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
	public void setGeschaltet(Geschaltet_TypeClass newGeschaltet) {
		if (newGeschaltet != geschaltet) {
			NotificationChain msgs = null;
			if (geschaltet != null)
				msgs = ((InternalEObject)geschaltet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET, null, msgs);
			if (newGeschaltet != null)
				msgs = ((InternalEObject)newGeschaltet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET, null, msgs);
			msgs = basicSetGeschaltet(newGeschaltet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET, newGeschaltet, newGeschaltet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs2_Ueberwacht_TypeClass getZs2Ueberwacht() {
		return zs2Ueberwacht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZs2Ueberwacht(Zs2_Ueberwacht_TypeClass newZs2Ueberwacht, NotificationChain msgs) {
		Zs2_Ueberwacht_TypeClass oldZs2Ueberwacht = zs2Ueberwacht;
		zs2Ueberwacht = newZs2Ueberwacht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT, oldZs2Ueberwacht, newZs2Ueberwacht);
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
	public void setZs2Ueberwacht(Zs2_Ueberwacht_TypeClass newZs2Ueberwacht) {
		if (newZs2Ueberwacht != zs2Ueberwacht) {
			NotificationChain msgs = null;
			if (zs2Ueberwacht != null)
				msgs = ((InternalEObject)zs2Ueberwacht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT, null, msgs);
			if (newZs2Ueberwacht != null)
				msgs = ((InternalEObject)newZs2Ueberwacht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT, null, msgs);
			msgs = basicSetZs2Ueberwacht(newZs2Ueberwacht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT, newZs2Ueberwacht, newZs2Ueberwacht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER:
				return basicSetAnschaltdauer(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET:
				return basicSetBeleuchtet(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET:
				return basicSetGeschaltet(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT:
				return basicSetZs2Ueberwacht(null, msgs);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER:
				return getAnschaltdauer();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET:
				return getBeleuchtet();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET:
				return getGeschaltet();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT:
				return getZs2Ueberwacht();
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER:
				setAnschaltdauer((Anschaltdauer_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET:
				setBeleuchtet((Beleuchtet_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET:
				setGeschaltet((Geschaltet_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT:
				setZs2Ueberwacht((Zs2_Ueberwacht_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER:
				setAnschaltdauer((Anschaltdauer_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET:
				setBeleuchtet((Beleuchtet_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET:
				setGeschaltet((Geschaltet_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT:
				setZs2Ueberwacht((Zs2_Ueberwacht_TypeClass)null);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ANSCHALTDAUER:
				return anschaltdauer != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__BELEUCHTET:
				return beleuchtet != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__GESCHALTET:
				return geschaltet != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP__ZS2_UEBERWACHT:
				return zs2Ueberwacht != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Signalbegriff_Allg_AttributeGroupImpl
