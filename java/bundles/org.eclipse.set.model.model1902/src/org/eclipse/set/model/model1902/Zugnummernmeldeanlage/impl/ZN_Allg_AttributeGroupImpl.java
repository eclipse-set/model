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

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Einwahlstelle_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Reaktivierungsfunktion_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anlagentyp_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Allg_AttributeGroupImpl#getEinwahlstelle <em>Einwahlstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Allg_AttributeGroupImpl#getReaktivierungsfunktion <em>Reaktivierungsfunktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Allg_AttributeGroupImpl#getZNAnlagentyp <em>ZN Anlagentyp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEinwahlstelle() <em>Einwahlstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinwahlstelle()
	 * @generated
	 * @ordered
	 */
	protected Einwahlstelle_TypeClass einwahlstelle;

	/**
	 * The cached value of the '{@link #getReaktivierungsfunktion() <em>Reaktivierungsfunktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaktivierungsfunktion()
	 * @generated
	 * @ordered
	 */
	protected Reaktivierungsfunktion_TypeClass reaktivierungsfunktion;

	/**
	 * The cached value of the '{@link #getZNAnlagentyp() <em>ZN Anlagentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnlagentyp()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anlagentyp_TypeClass zNAnlagentyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einwahlstelle_TypeClass getEinwahlstelle() {
		return einwahlstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinwahlstelle(Einwahlstelle_TypeClass newEinwahlstelle, NotificationChain msgs) {
		Einwahlstelle_TypeClass oldEinwahlstelle = einwahlstelle;
		einwahlstelle = newEinwahlstelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE, oldEinwahlstelle, newEinwahlstelle);
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
	public void setEinwahlstelle(Einwahlstelle_TypeClass newEinwahlstelle) {
		if (newEinwahlstelle != einwahlstelle) {
			NotificationChain msgs = null;
			if (einwahlstelle != null)
				msgs = ((InternalEObject)einwahlstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE, null, msgs);
			if (newEinwahlstelle != null)
				msgs = ((InternalEObject)newEinwahlstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE, null, msgs);
			msgs = basicSetEinwahlstelle(newEinwahlstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE, newEinwahlstelle, newEinwahlstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reaktivierungsfunktion_TypeClass getReaktivierungsfunktion() {
		return reaktivierungsfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaktivierungsfunktion(Reaktivierungsfunktion_TypeClass newReaktivierungsfunktion, NotificationChain msgs) {
		Reaktivierungsfunktion_TypeClass oldReaktivierungsfunktion = reaktivierungsfunktion;
		reaktivierungsfunktion = newReaktivierungsfunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION, oldReaktivierungsfunktion, newReaktivierungsfunktion);
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
	public void setReaktivierungsfunktion(Reaktivierungsfunktion_TypeClass newReaktivierungsfunktion) {
		if (newReaktivierungsfunktion != reaktivierungsfunktion) {
			NotificationChain msgs = null;
			if (reaktivierungsfunktion != null)
				msgs = ((InternalEObject)reaktivierungsfunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION, null, msgs);
			if (newReaktivierungsfunktion != null)
				msgs = ((InternalEObject)newReaktivierungsfunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION, null, msgs);
			msgs = basicSetReaktivierungsfunktion(newReaktivierungsfunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION, newReaktivierungsfunktion, newReaktivierungsfunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anlagentyp_TypeClass getZNAnlagentyp() {
		return zNAnlagentyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnlagentyp(ZN_Anlagentyp_TypeClass newZNAnlagentyp, NotificationChain msgs) {
		ZN_Anlagentyp_TypeClass oldZNAnlagentyp = zNAnlagentyp;
		zNAnlagentyp = newZNAnlagentyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP, oldZNAnlagentyp, newZNAnlagentyp);
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
	public void setZNAnlagentyp(ZN_Anlagentyp_TypeClass newZNAnlagentyp) {
		if (newZNAnlagentyp != zNAnlagentyp) {
			NotificationChain msgs = null;
			if (zNAnlagentyp != null)
				msgs = ((InternalEObject)zNAnlagentyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP, null, msgs);
			if (newZNAnlagentyp != null)
				msgs = ((InternalEObject)newZNAnlagentyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP, null, msgs);
			msgs = basicSetZNAnlagentyp(newZNAnlagentyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP, newZNAnlagentyp, newZNAnlagentyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE:
				return basicSetEinwahlstelle(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION:
				return basicSetReaktivierungsfunktion(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP:
				return basicSetZNAnlagentyp(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE:
				return getEinwahlstelle();
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION:
				return getReaktivierungsfunktion();
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP:
				return getZNAnlagentyp();
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
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE:
				setEinwahlstelle((Einwahlstelle_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION:
				setReaktivierungsfunktion((Reaktivierungsfunktion_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP:
				setZNAnlagentyp((ZN_Anlagentyp_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE:
				setEinwahlstelle((Einwahlstelle_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION:
				setReaktivierungsfunktion((Reaktivierungsfunktion_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP:
				setZNAnlagentyp((ZN_Anlagentyp_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE:
				return einwahlstelle != null;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION:
				return reaktivierungsfunktion != null;
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP:
				return zNAnlagentyp != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Allg_AttributeGroupImpl
