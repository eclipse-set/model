/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bedienung.A_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.B_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;
import org.eclipse.set.model.model1902.Bedienung.C_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.DD_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.X_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.YY_Wert_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Y_Wert_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Bezirk Adressformel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getAWert <em>AWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getBWert <em>BWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getCWert <em>CWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getDDWert <em>DD Wert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getXWert <em>XWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getYWert <em>YWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Adressformel_AttributeGroupImpl#getYYWert <em>YY Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Bezirk_Adressformel_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Bezirk_Adressformel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAWert() <em>AWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAWert()
	 * @generated
	 * @ordered
	 */
	protected A_Wert_TypeClass aWert;

	/**
	 * The cached value of the '{@link #getBWert() <em>BWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBWert()
	 * @generated
	 * @ordered
	 */
	protected B_Wert_TypeClass bWert;

	/**
	 * The cached value of the '{@link #getCWert() <em>CWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWert()
	 * @generated
	 * @ordered
	 */
	protected C_Wert_TypeClass cWert;

	/**
	 * The cached value of the '{@link #getDDWert() <em>DD Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDWert()
	 * @generated
	 * @ordered
	 */
	protected DD_Wert_TypeClass dDWert;

	/**
	 * The cached value of the '{@link #getXWert() <em>XWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXWert()
	 * @generated
	 * @ordered
	 */
	protected X_Wert_TypeClass xWert;

	/**
	 * The cached value of the '{@link #getYWert() <em>YWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYWert()
	 * @generated
	 * @ordered
	 */
	protected Y_Wert_TypeClass yWert;

	/**
	 * The cached value of the '{@link #getYYWert() <em>YY Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYYWert()
	 * @generated
	 * @ordered
	 */
	protected YY_Wert_TypeClass yYWert;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Bezirk_Adressformel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A_Wert_TypeClass getAWert() {
		return aWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAWert(A_Wert_TypeClass newAWert, NotificationChain msgs) {
		A_Wert_TypeClass oldAWert = aWert;
		aWert = newAWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT, oldAWert, newAWert);
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
	public void setAWert(A_Wert_TypeClass newAWert) {
		if (newAWert != aWert) {
			NotificationChain msgs = null;
			if (aWert != null)
				msgs = ((InternalEObject)aWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT, null, msgs);
			if (newAWert != null)
				msgs = ((InternalEObject)newAWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT, null, msgs);
			msgs = basicSetAWert(newAWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT, newAWert, newAWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public B_Wert_TypeClass getBWert() {
		return bWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBWert(B_Wert_TypeClass newBWert, NotificationChain msgs) {
		B_Wert_TypeClass oldBWert = bWert;
		bWert = newBWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT, oldBWert, newBWert);
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
	public void setBWert(B_Wert_TypeClass newBWert) {
		if (newBWert != bWert) {
			NotificationChain msgs = null;
			if (bWert != null)
				msgs = ((InternalEObject)bWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT, null, msgs);
			if (newBWert != null)
				msgs = ((InternalEObject)newBWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT, null, msgs);
			msgs = basicSetBWert(newBWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT, newBWert, newBWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C_Wert_TypeClass getCWert() {
		return cWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWert(C_Wert_TypeClass newCWert, NotificationChain msgs) {
		C_Wert_TypeClass oldCWert = cWert;
		cWert = newCWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT, oldCWert, newCWert);
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
	public void setCWert(C_Wert_TypeClass newCWert) {
		if (newCWert != cWert) {
			NotificationChain msgs = null;
			if (cWert != null)
				msgs = ((InternalEObject)cWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT, null, msgs);
			if (newCWert != null)
				msgs = ((InternalEObject)newCWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT, null, msgs);
			msgs = basicSetCWert(newCWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT, newCWert, newCWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DD_Wert_TypeClass getDDWert() {
		return dDWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDDWert(DD_Wert_TypeClass newDDWert, NotificationChain msgs) {
		DD_Wert_TypeClass oldDDWert = dDWert;
		dDWert = newDDWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT, oldDDWert, newDDWert);
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
	public void setDDWert(DD_Wert_TypeClass newDDWert) {
		if (newDDWert != dDWert) {
			NotificationChain msgs = null;
			if (dDWert != null)
				msgs = ((InternalEObject)dDWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT, null, msgs);
			if (newDDWert != null)
				msgs = ((InternalEObject)newDDWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT, null, msgs);
			msgs = basicSetDDWert(newDDWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT, newDDWert, newDDWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X_Wert_TypeClass getXWert() {
		return xWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXWert(X_Wert_TypeClass newXWert, NotificationChain msgs) {
		X_Wert_TypeClass oldXWert = xWert;
		xWert = newXWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT, oldXWert, newXWert);
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
	public void setXWert(X_Wert_TypeClass newXWert) {
		if (newXWert != xWert) {
			NotificationChain msgs = null;
			if (xWert != null)
				msgs = ((InternalEObject)xWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT, null, msgs);
			if (newXWert != null)
				msgs = ((InternalEObject)newXWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT, null, msgs);
			msgs = basicSetXWert(newXWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT, newXWert, newXWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Y_Wert_TypeClass getYWert() {
		return yWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYWert(Y_Wert_TypeClass newYWert, NotificationChain msgs) {
		Y_Wert_TypeClass oldYWert = yWert;
		yWert = newYWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT, oldYWert, newYWert);
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
	public void setYWert(Y_Wert_TypeClass newYWert) {
		if (newYWert != yWert) {
			NotificationChain msgs = null;
			if (yWert != null)
				msgs = ((InternalEObject)yWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT, null, msgs);
			if (newYWert != null)
				msgs = ((InternalEObject)newYWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT, null, msgs);
			msgs = basicSetYWert(newYWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT, newYWert, newYWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YY_Wert_TypeClass getYYWert() {
		return yYWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYYWert(YY_Wert_TypeClass newYYWert, NotificationChain msgs) {
		YY_Wert_TypeClass oldYYWert = yYWert;
		yYWert = newYYWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT, oldYYWert, newYYWert);
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
	public void setYYWert(YY_Wert_TypeClass newYYWert) {
		if (newYYWert != yYWert) {
			NotificationChain msgs = null;
			if (yYWert != null)
				msgs = ((InternalEObject)yYWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT, null, msgs);
			if (newYYWert != null)
				msgs = ((InternalEObject)newYYWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT, null, msgs);
			msgs = basicSetYYWert(newYYWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT, newYYWert, newYYWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT:
				return basicSetAWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT:
				return basicSetBWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT:
				return basicSetCWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT:
				return basicSetDDWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT:
				return basicSetXWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT:
				return basicSetYWert(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT:
				return basicSetYYWert(null, msgs);
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
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT:
				return getAWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT:
				return getBWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT:
				return getCWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT:
				return getDDWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT:
				return getXWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT:
				return getYWert();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT:
				return getYYWert();
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
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT:
				setAWert((A_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT:
				setBWert((B_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT:
				setCWert((C_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT:
				setDDWert((DD_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT:
				setXWert((X_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT:
				setYWert((Y_Wert_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT:
				setYYWert((YY_Wert_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT:
				setAWert((A_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT:
				setBWert((B_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT:
				setCWert((C_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT:
				setDDWert((DD_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT:
				setXWert((X_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT:
				setYWert((Y_Wert_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT:
				setYYWert((YY_Wert_TypeClass)null);
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
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__AWERT:
				return aWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__BWERT:
				return bWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__CWERT:
				return cWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__DD_WERT:
				return dDWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__XWERT:
				return xWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YWERT:
				return yWert != null;
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP__YY_WERT:
				return yYWert != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Bezirk_Adressformel_AttributeGroupImpl
