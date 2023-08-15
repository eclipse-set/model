/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Zuglenkung.GKZSS_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Vmax_Annaeherung_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr Anstoss Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl#getGKZSS <em>GKZSS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl#getVmaxAnnaeherung <em>Vmax Annaeherung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_Allg_AttributeGroupImpl#getZLFstrZuschlag <em>ZL Fstr Zuschlag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Fstr_Anstoss_Allg_AttributeGroupImpl extends EObjectImpl implements ZL_Fstr_Anstoss_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGKZSS() <em>GKZSS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGKZSS()
	 * @generated
	 * @ordered
	 */
	protected GKZSS_TypeClass gKZSS;

	/**
	 * The cached value of the '{@link #getVmaxAnnaeherung() <em>Vmax Annaeherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmaxAnnaeherung()
	 * @generated
	 * @ordered
	 */
	protected Vmax_Annaeherung_TypeClass vmaxAnnaeherung;

	/**
	 * The cached value of the '{@link #getZLFstrZuschlag() <em>ZL Fstr Zuschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrZuschlag()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr_Zuschlag_TypeClass zLFstrZuschlag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Fstr_Anstoss_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GKZSS_TypeClass getGKZSS() {
		return gKZSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGKZSS(GKZSS_TypeClass newGKZSS, NotificationChain msgs) {
		GKZSS_TypeClass oldGKZSS = gKZSS;
		gKZSS = newGKZSS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS, oldGKZSS, newGKZSS);
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
	public void setGKZSS(GKZSS_TypeClass newGKZSS) {
		if (newGKZSS != gKZSS) {
			NotificationChain msgs = null;
			if (gKZSS != null)
				msgs = ((InternalEObject)gKZSS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS, null, msgs);
			if (newGKZSS != null)
				msgs = ((InternalEObject)newGKZSS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS, null, msgs);
			msgs = basicSetGKZSS(newGKZSS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS, newGKZSS, newGKZSS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vmax_Annaeherung_TypeClass getVmaxAnnaeherung() {
		return vmaxAnnaeherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmaxAnnaeherung(Vmax_Annaeherung_TypeClass newVmaxAnnaeherung, NotificationChain msgs) {
		Vmax_Annaeherung_TypeClass oldVmaxAnnaeherung = vmaxAnnaeherung;
		vmaxAnnaeherung = newVmaxAnnaeherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG, oldVmaxAnnaeherung, newVmaxAnnaeherung);
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
	public void setVmaxAnnaeherung(Vmax_Annaeherung_TypeClass newVmaxAnnaeherung) {
		if (newVmaxAnnaeherung != vmaxAnnaeherung) {
			NotificationChain msgs = null;
			if (vmaxAnnaeherung != null)
				msgs = ((InternalEObject)vmaxAnnaeherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG, null, msgs);
			if (newVmaxAnnaeherung != null)
				msgs = ((InternalEObject)newVmaxAnnaeherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG, null, msgs);
			msgs = basicSetVmaxAnnaeherung(newVmaxAnnaeherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG, newVmaxAnnaeherung, newVmaxAnnaeherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Zuschlag_TypeClass getZLFstrZuschlag() {
		return zLFstrZuschlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLFstrZuschlag(ZL_Fstr_Zuschlag_TypeClass newZLFstrZuschlag, NotificationChain msgs) {
		ZL_Fstr_Zuschlag_TypeClass oldZLFstrZuschlag = zLFstrZuschlag;
		zLFstrZuschlag = newZLFstrZuschlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG, oldZLFstrZuschlag, newZLFstrZuschlag);
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
	public void setZLFstrZuschlag(ZL_Fstr_Zuschlag_TypeClass newZLFstrZuschlag) {
		if (newZLFstrZuschlag != zLFstrZuschlag) {
			NotificationChain msgs = null;
			if (zLFstrZuschlag != null)
				msgs = ((InternalEObject)zLFstrZuschlag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG, null, msgs);
			if (newZLFstrZuschlag != null)
				msgs = ((InternalEObject)newZLFstrZuschlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG, null, msgs);
			msgs = basicSetZLFstrZuschlag(newZLFstrZuschlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG, newZLFstrZuschlag, newZLFstrZuschlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS:
				return basicSetGKZSS(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG:
				return basicSetVmaxAnnaeherung(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG:
				return basicSetZLFstrZuschlag(null, msgs);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS:
				return getGKZSS();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG:
				return getVmaxAnnaeherung();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG:
				return getZLFstrZuschlag();
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS:
				setGKZSS((GKZSS_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG:
				setVmaxAnnaeherung((Vmax_Annaeherung_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG:
				setZLFstrZuschlag((ZL_Fstr_Zuschlag_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS:
				setGKZSS((GKZSS_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG:
				setVmaxAnnaeherung((Vmax_Annaeherung_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG:
				setZLFstrZuschlag((ZL_Fstr_Zuschlag_TypeClass)null);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS:
				return gKZSS != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG:
				return vmaxAnnaeherung != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG:
				return zLFstrZuschlag != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Fstr_Anstoss_Allg_AttributeGroupImpl
