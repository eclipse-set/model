/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_ESTW_Zentraleinheit_TypeClass;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.IP_Adresse_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZBS_Schnittstelle_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_ZBS;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN ZBS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getIPAdresse <em>IP Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_ZBSImpl extends Basis_ObjektImpl implements ZN_ZBS {
	/**
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected ID_ESTW_Zentraleinheit_TypeClass iDESTWZentraleinheit;

	/**
	 * The cached value of the '{@link #getIPAdresse() <em>IP Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAdresse()
	 * @generated
	 * @ordered
	 */
	protected IP_Adresse_TypeClass iPAdresse;

	/**
	 * The cached value of the '{@link #getZBSSchnittstelle() <em>ZBS Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSchnittstelle()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Schnittstelle_TypeClass zBSSchnittstelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_ZBSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ESTW_Zentraleinheit_TypeClass getIDESTWZentraleinheit() {
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit, NotificationChain msgs) {
		ID_ESTW_Zentraleinheit_TypeClass oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		iDESTWZentraleinheit = newIDESTWZentraleinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, newIDESTWZentraleinheit);
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
	public void setIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit) {
		if (newIDESTWZentraleinheit != iDESTWZentraleinheit) {
			NotificationChain msgs = null;
			if (iDESTWZentraleinheit != null)
				msgs = ((InternalEObject)iDESTWZentraleinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, null, msgs);
			if (newIDESTWZentraleinheit != null)
				msgs = ((InternalEObject)newIDESTWZentraleinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, null, msgs);
			msgs = basicSetIDESTWZentraleinheit(newIDESTWZentraleinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, newIDESTWZentraleinheit, newIDESTWZentraleinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adresse_TypeClass getIPAdresse() {
		return iPAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAdresse(IP_Adresse_TypeClass newIPAdresse, NotificationChain msgs) {
		IP_Adresse_TypeClass oldIPAdresse = iPAdresse;
		iPAdresse = newIPAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE, oldIPAdresse, newIPAdresse);
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
	public void setIPAdresse(IP_Adresse_TypeClass newIPAdresse) {
		if (newIPAdresse != iPAdresse) {
			NotificationChain msgs = null;
			if (iPAdresse != null)
				msgs = ((InternalEObject)iPAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE, null, msgs);
			if (newIPAdresse != null)
				msgs = ((InternalEObject)newIPAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE, null, msgs);
			msgs = basicSetIPAdresse(newIPAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE, newIPAdresse, newIPAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schnittstelle_TypeClass getZBSSchnittstelle() {
		return zBSSchnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSSchnittstelle(ZBS_Schnittstelle_TypeClass newZBSSchnittstelle, NotificationChain msgs) {
		ZBS_Schnittstelle_TypeClass oldZBSSchnittstelle = zBSSchnittstelle;
		zBSSchnittstelle = newZBSSchnittstelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE, oldZBSSchnittstelle, newZBSSchnittstelle);
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
	public void setZBSSchnittstelle(ZBS_Schnittstelle_TypeClass newZBSSchnittstelle) {
		if (newZBSSchnittstelle != zBSSchnittstelle) {
			NotificationChain msgs = null;
			if (zBSSchnittstelle != null)
				msgs = ((InternalEObject)zBSSchnittstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE, null, msgs);
			if (newZBSSchnittstelle != null)
				msgs = ((InternalEObject)newZBSSchnittstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE, null, msgs);
			msgs = basicSetZBSSchnittstelle(newZBSSchnittstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE, newZBSSchnittstelle, newZBSSchnittstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return basicSetIDESTWZentraleinheit(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE:
				return basicSetIPAdresse(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE:
				return basicSetZBSSchnittstelle(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return getIDESTWZentraleinheit();
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE:
				return getIPAdresse();
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE:
				return getZBSSchnittstelle();
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE:
				setIPAdresse((IP_Adresse_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE:
				setZBSSchnittstelle((ZBS_Schnittstelle_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE:
				setIPAdresse((IP_Adresse_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE:
				setZBSSchnittstelle((ZBS_Schnittstelle_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return iDESTWZentraleinheit != null;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IP_ADRESSE:
				return iPAdresse != null;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZBS_SCHNITTSTELLE:
				return zBSSchnittstelle != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_ZBSImpl
