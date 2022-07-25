/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Schiene_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.V_Max_Strasse_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Fussweg_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Schiene_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.V_Min_Strasse_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage VAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl#getVMaxSchiene <em>VMax Schiene</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl#getVMaxStrasse <em>VMax Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl#getVMinFussweg <em>VMin Fussweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl#getVMinSchiene <em>VMin Schiene</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_V_Allg_AttributeGroupImpl#getVMinStrasse <em>VMin Strasse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_V_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Anlage_V_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getVMaxSchiene() <em>VMax Schiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMaxSchiene()
	 * @generated
	 * @ordered
	 */
	protected V_Max_Schiene_TypeClass vMaxSchiene;

	/**
	 * The cached value of the '{@link #getVMaxStrasse() <em>VMax Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMaxStrasse()
	 * @generated
	 * @ordered
	 */
	protected V_Max_Strasse_TypeClass vMaxStrasse;

	/**
	 * The cached value of the '{@link #getVMinFussweg() <em>VMin Fussweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMinFussweg()
	 * @generated
	 * @ordered
	 */
	protected V_Min_Fussweg_TypeClass vMinFussweg;

	/**
	 * The cached value of the '{@link #getVMinSchiene() <em>VMin Schiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMinSchiene()
	 * @generated
	 * @ordered
	 */
	protected V_Min_Schiene_TypeClass vMinSchiene;

	/**
	 * The cached value of the '{@link #getVMinStrasse() <em>VMin Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMinStrasse()
	 * @generated
	 * @ordered
	 */
	protected V_Min_Strasse_TypeClass vMinStrasse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Anlage_V_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_V_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Max_Schiene_TypeClass getVMaxSchiene() {
		return vMaxSchiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMaxSchiene(V_Max_Schiene_TypeClass newVMaxSchiene, NotificationChain msgs) {
		V_Max_Schiene_TypeClass oldVMaxSchiene = vMaxSchiene;
		vMaxSchiene = newVMaxSchiene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE, oldVMaxSchiene, newVMaxSchiene);
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
	public void setVMaxSchiene(V_Max_Schiene_TypeClass newVMaxSchiene) {
		if (newVMaxSchiene != vMaxSchiene) {
			NotificationChain msgs = null;
			if (vMaxSchiene != null)
				msgs = ((InternalEObject)vMaxSchiene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE, null, msgs);
			if (newVMaxSchiene != null)
				msgs = ((InternalEObject)newVMaxSchiene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE, null, msgs);
			msgs = basicSetVMaxSchiene(newVMaxSchiene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE, newVMaxSchiene, newVMaxSchiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Max_Strasse_TypeClass getVMaxStrasse() {
		return vMaxStrasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMaxStrasse(V_Max_Strasse_TypeClass newVMaxStrasse, NotificationChain msgs) {
		V_Max_Strasse_TypeClass oldVMaxStrasse = vMaxStrasse;
		vMaxStrasse = newVMaxStrasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE, oldVMaxStrasse, newVMaxStrasse);
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
	public void setVMaxStrasse(V_Max_Strasse_TypeClass newVMaxStrasse) {
		if (newVMaxStrasse != vMaxStrasse) {
			NotificationChain msgs = null;
			if (vMaxStrasse != null)
				msgs = ((InternalEObject)vMaxStrasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE, null, msgs);
			if (newVMaxStrasse != null)
				msgs = ((InternalEObject)newVMaxStrasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE, null, msgs);
			msgs = basicSetVMaxStrasse(newVMaxStrasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE, newVMaxStrasse, newVMaxStrasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Fussweg_TypeClass getVMinFussweg() {
		return vMinFussweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMinFussweg(V_Min_Fussweg_TypeClass newVMinFussweg, NotificationChain msgs) {
		V_Min_Fussweg_TypeClass oldVMinFussweg = vMinFussweg;
		vMinFussweg = newVMinFussweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG, oldVMinFussweg, newVMinFussweg);
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
	public void setVMinFussweg(V_Min_Fussweg_TypeClass newVMinFussweg) {
		if (newVMinFussweg != vMinFussweg) {
			NotificationChain msgs = null;
			if (vMinFussweg != null)
				msgs = ((InternalEObject)vMinFussweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG, null, msgs);
			if (newVMinFussweg != null)
				msgs = ((InternalEObject)newVMinFussweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG, null, msgs);
			msgs = basicSetVMinFussweg(newVMinFussweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG, newVMinFussweg, newVMinFussweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Schiene_TypeClass getVMinSchiene() {
		return vMinSchiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMinSchiene(V_Min_Schiene_TypeClass newVMinSchiene, NotificationChain msgs) {
		V_Min_Schiene_TypeClass oldVMinSchiene = vMinSchiene;
		vMinSchiene = newVMinSchiene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE, oldVMinSchiene, newVMinSchiene);
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
	public void setVMinSchiene(V_Min_Schiene_TypeClass newVMinSchiene) {
		if (newVMinSchiene != vMinSchiene) {
			NotificationChain msgs = null;
			if (vMinSchiene != null)
				msgs = ((InternalEObject)vMinSchiene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE, null, msgs);
			if (newVMinSchiene != null)
				msgs = ((InternalEObject)newVMinSchiene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE, null, msgs);
			msgs = basicSetVMinSchiene(newVMinSchiene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE, newVMinSchiene, newVMinSchiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Strasse_TypeClass getVMinStrasse() {
		return vMinStrasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMinStrasse(V_Min_Strasse_TypeClass newVMinStrasse, NotificationChain msgs) {
		V_Min_Strasse_TypeClass oldVMinStrasse = vMinStrasse;
		vMinStrasse = newVMinStrasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE, oldVMinStrasse, newVMinStrasse);
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
	public void setVMinStrasse(V_Min_Strasse_TypeClass newVMinStrasse) {
		if (newVMinStrasse != vMinStrasse) {
			NotificationChain msgs = null;
			if (vMinStrasse != null)
				msgs = ((InternalEObject)vMinStrasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE, null, msgs);
			if (newVMinStrasse != null)
				msgs = ((InternalEObject)newVMinStrasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE, null, msgs);
			msgs = basicSetVMinStrasse(newVMinStrasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE, newVMinStrasse, newVMinStrasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE:
				return basicSetVMaxSchiene(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE:
				return basicSetVMaxStrasse(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG:
				return basicSetVMinFussweg(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE:
				return basicSetVMinSchiene(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE:
				return basicSetVMinStrasse(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE:
				return getVMaxSchiene();
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE:
				return getVMaxStrasse();
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG:
				return getVMinFussweg();
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE:
				return getVMinSchiene();
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE:
				return getVMinStrasse();
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
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE:
				setVMaxSchiene((V_Max_Schiene_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE:
				setVMaxStrasse((V_Max_Strasse_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG:
				setVMinFussweg((V_Min_Fussweg_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE:
				setVMinSchiene((V_Min_Schiene_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE:
				setVMinStrasse((V_Min_Strasse_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE:
				setVMaxSchiene((V_Max_Schiene_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE:
				setVMaxStrasse((V_Max_Strasse_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG:
				setVMinFussweg((V_Min_Fussweg_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE:
				setVMinSchiene((V_Min_Schiene_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE:
				setVMinStrasse((V_Min_Strasse_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_SCHIENE:
				return vMaxSchiene != null;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMAX_STRASSE:
				return vMaxStrasse != null;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_FUSSWEG:
				return vMinFussweg != null;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_SCHIENE:
				return vMinSchiene != null;
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP__VMIN_STRASSE:
				return vMinStrasse != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Anlage_V_Allg_AttributeGroupImpl
