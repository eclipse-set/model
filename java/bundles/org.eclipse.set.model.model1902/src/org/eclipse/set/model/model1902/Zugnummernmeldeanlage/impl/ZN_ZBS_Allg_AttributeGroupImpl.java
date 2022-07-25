/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.IP_Adresse_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZBS_Schnittstelle_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN ZBS Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_ZBS_Allg_AttributeGroupImpl#getIPAdresse <em>IP Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_ZBS_Allg_AttributeGroupImpl#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_ZBS_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_ZBS_Allg_AttributeGroup {
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
	protected ZN_ZBS_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ZBS_ALLG_ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE, oldIPAdresse, newIPAdresse);
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
				msgs = ((InternalEObject)iPAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE, null, msgs);
			if (newIPAdresse != null)
				msgs = ((InternalEObject)newIPAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE, null, msgs);
			msgs = basicSetIPAdresse(newIPAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE, newIPAdresse, newIPAdresse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE, oldZBSSchnittstelle, newZBSSchnittstelle);
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
				msgs = ((InternalEObject)zBSSchnittstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE, null, msgs);
			if (newZBSSchnittstelle != null)
				msgs = ((InternalEObject)newZBSSchnittstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE, null, msgs);
			msgs = basicSetZBSSchnittstelle(newZBSSchnittstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE, newZBSSchnittstelle, newZBSSchnittstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE:
				return basicSetIPAdresse(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE:
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE:
				return getIPAdresse();
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE:
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE:
				setIPAdresse((IP_Adresse_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE:
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE:
				setIPAdresse((IP_Adresse_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE:
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__IP_ADRESSE:
				return iPAdresse != null;
			case ZugnummernmeldeanlagePackage.ZN_ZBS_ALLG_ATTRIBUTE_GROUP__ZBS_SCHNITTSTELLE:
				return zBSSchnittstelle != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_ZBS_Allg_AttributeGroupImpl
