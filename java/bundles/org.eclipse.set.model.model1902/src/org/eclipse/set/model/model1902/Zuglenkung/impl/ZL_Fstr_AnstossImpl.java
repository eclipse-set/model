/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Einschaltpunkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_Fstr_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass;

import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr Anstoss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDVorsignal <em>ID Vorsignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getZLFstrAnstossGK <em>ZL Fstr Anstoss GK</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Fstr_AnstossImpl extends Basis_ObjektImpl implements ZL_Fstr_Anstoss {
	/**
	 * The cached value of the '{@link #getIDEinschaltpunkt() <em>ID Einschaltpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEinschaltpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Einschaltpunkt_TypeClass iDEinschaltpunkt;

	/**
	 * The cached value of the '{@link #getIDVorsignal() <em>ID Vorsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDVorsignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDVorsignal;

	/**
	 * The cached value of the '{@link #getIDZLFstr() <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLFstr()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_Fstr_TypeClass iDZLFstr;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeldAnstoss() <em>IDZN Anzeigefeld Anstoss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Anzeigefeld_Anstoss_TypeClass iDZNAnzeigefeldAnstoss;

	/**
	 * The cached value of the '{@link #getZLFstrAnstossAllg() <em>ZL Fstr Anstoss Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAnstossAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr_Anstoss_Allg_AttributeGroup zLFstrAnstossAllg;

	/**
	 * The cached value of the '{@link #getZLFstrAnstossGK() <em>ZL Fstr Anstoss GK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAnstossGK()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Fstr_Anstoss_GK_AttributeGroup> zLFstrAnstossGK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Fstr_AnstossImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Einschaltpunkt_TypeClass getIDEinschaltpunkt() {
		return iDEinschaltpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEinschaltpunkt(ID_Einschaltpunkt_TypeClass newIDEinschaltpunkt, NotificationChain msgs) {
		ID_Einschaltpunkt_TypeClass oldIDEinschaltpunkt = iDEinschaltpunkt;
		iDEinschaltpunkt = newIDEinschaltpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, oldIDEinschaltpunkt, newIDEinschaltpunkt);
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
	public void setIDEinschaltpunkt(ID_Einschaltpunkt_TypeClass newIDEinschaltpunkt) {
		if (newIDEinschaltpunkt != iDEinschaltpunkt) {
			NotificationChain msgs = null;
			if (iDEinschaltpunkt != null)
				msgs = ((InternalEObject)iDEinschaltpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, null, msgs);
			if (newIDEinschaltpunkt != null)
				msgs = ((InternalEObject)newIDEinschaltpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, null, msgs);
			msgs = basicSetIDEinschaltpunkt(newIDEinschaltpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, newIDEinschaltpunkt, newIDEinschaltpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDVorsignal() {
		return iDVorsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDVorsignal(ID_Signal_TypeClass newIDVorsignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDVorsignal = iDVorsignal;
		iDVorsignal = newIDVorsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, oldIDVorsignal, newIDVorsignal);
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
	public void setIDVorsignal(ID_Signal_TypeClass newIDVorsignal) {
		if (newIDVorsignal != iDVorsignal) {
			NotificationChain msgs = null;
			if (iDVorsignal != null)
				msgs = ((InternalEObject)iDVorsignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, null, msgs);
			if (newIDVorsignal != null)
				msgs = ((InternalEObject)newIDVorsignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, null, msgs);
			msgs = basicSetIDVorsignal(newIDVorsignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, newIDVorsignal, newIDVorsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Fstr_TypeClass getIDZLFstr() {
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr, NotificationChain msgs) {
		ID_ZL_Fstr_TypeClass oldIDZLFstr = iDZLFstr;
		iDZLFstr = newIDZLFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, oldIDZLFstr, newIDZLFstr);
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
	public void setIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr) {
		if (newIDZLFstr != iDZLFstr) {
			NotificationChain msgs = null;
			if (iDZLFstr != null)
				msgs = ((InternalEObject)iDZLFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, null, msgs);
			if (newIDZLFstr != null)
				msgs = ((InternalEObject)newIDZLFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, null, msgs);
			msgs = basicSetIDZLFstr(newIDZLFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, newIDZLFstr, newIDZLFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_Anstoss_TypeClass getIDZNAnzeigefeldAnstoss() {
		return iDZNAnzeigefeldAnstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNAnzeigefeldAnstoss(ID_ZN_Anzeigefeld_Anstoss_TypeClass newIDZNAnzeigefeldAnstoss, NotificationChain msgs) {
		ID_ZN_Anzeigefeld_Anstoss_TypeClass oldIDZNAnzeigefeldAnstoss = iDZNAnzeigefeldAnstoss;
		iDZNAnzeigefeldAnstoss = newIDZNAnzeigefeldAnstoss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, oldIDZNAnzeigefeldAnstoss, newIDZNAnzeigefeldAnstoss);
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
	public void setIDZNAnzeigefeldAnstoss(ID_ZN_Anzeigefeld_Anstoss_TypeClass newIDZNAnzeigefeldAnstoss) {
		if (newIDZNAnzeigefeldAnstoss != iDZNAnzeigefeldAnstoss) {
			NotificationChain msgs = null;
			if (iDZNAnzeigefeldAnstoss != null)
				msgs = ((InternalEObject)iDZNAnzeigefeldAnstoss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, null, msgs);
			if (newIDZNAnzeigefeldAnstoss != null)
				msgs = ((InternalEObject)newIDZNAnzeigefeldAnstoss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, null, msgs);
			msgs = basicSetIDZNAnzeigefeldAnstoss(newIDZNAnzeigefeldAnstoss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, newIDZNAnzeigefeldAnstoss, newIDZNAnzeigefeldAnstoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Anstoss_Allg_AttributeGroup getZLFstrAnstossAllg() {
		return zLFstrAnstossAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup newZLFstrAnstossAllg, NotificationChain msgs) {
		ZL_Fstr_Anstoss_Allg_AttributeGroup oldZLFstrAnstossAllg = zLFstrAnstossAllg;
		zLFstrAnstossAllg = newZLFstrAnstossAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, oldZLFstrAnstossAllg, newZLFstrAnstossAllg);
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
	public void setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup newZLFstrAnstossAllg) {
		if (newZLFstrAnstossAllg != zLFstrAnstossAllg) {
			NotificationChain msgs = null;
			if (zLFstrAnstossAllg != null)
				msgs = ((InternalEObject)zLFstrAnstossAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, null, msgs);
			if (newZLFstrAnstossAllg != null)
				msgs = ((InternalEObject)newZLFstrAnstossAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, null, msgs);
			msgs = basicSetZLFstrAnstossAllg(newZLFstrAnstossAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, newZLFstrAnstossAllg, newZLFstrAnstossAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Fstr_Anstoss_GK_AttributeGroup> getZLFstrAnstossGK() {
		if (zLFstrAnstossGK == null) {
			zLFstrAnstossGK = new EObjectContainmentEList<ZL_Fstr_Anstoss_GK_AttributeGroup>(ZL_Fstr_Anstoss_GK_AttributeGroup.class, this, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK);
		}
		return zLFstrAnstossGK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				return basicSetIDEinschaltpunkt(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				return basicSetIDVorsignal(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				return basicSetIDZLFstr(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				return basicSetIDZNAnzeigefeldAnstoss(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return basicSetZLFstrAnstossAllg(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return ((InternalEList<?>)getZLFstrAnstossGK()).basicRemove(otherEnd, msgs);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				return getIDEinschaltpunkt();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				return getIDVorsignal();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				return getIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				return getIDZNAnzeigefeldAnstoss();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return getZLFstrAnstossAllg();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return getZLFstrAnstossGK();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				setIDEinschaltpunkt((ID_Einschaltpunkt_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				setIDVorsignal((ID_Signal_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				setIDZNAnzeigefeldAnstoss((ID_ZN_Anzeigefeld_Anstoss_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				setZLFstrAnstossAllg((ZL_Fstr_Anstoss_Allg_AttributeGroup)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				getZLFstrAnstossGK().clear();
				getZLFstrAnstossGK().addAll((Collection<? extends ZL_Fstr_Anstoss_GK_AttributeGroup>)newValue);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				setIDEinschaltpunkt((ID_Einschaltpunkt_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				setIDVorsignal((ID_Signal_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				setIDZNAnzeigefeldAnstoss((ID_ZN_Anzeigefeld_Anstoss_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				setZLFstrAnstossAllg((ZL_Fstr_Anstoss_Allg_AttributeGroup)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				getZLFstrAnstossGK().clear();
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				return iDEinschaltpunkt != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				return iDVorsignal != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				return iDZLFstr != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				return iDZNAnzeigefeldAnstoss != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return zLFstrAnstossAllg != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return zLFstrAnstossGK != null && !zLFstrAnstossGK.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZL_Fstr_AnstossImpl
