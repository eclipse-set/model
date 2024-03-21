/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Schutzstrecke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_SchutzstreckeImpl#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_SchutzstreckeImpl#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_SchutzstreckeImpl extends Basis_ObjektImpl implements ZBS_Schutzstrecke {
	/**
	 * The cached value of the '{@link #getIDFstrDWeg() <em>ID Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_DWeg_ohne_Proxy_TypeClass iDFstrDWeg;

	/**
	 * The cached value of the '{@link #getZBSSchutzstreckeAllg() <em>ZBS Schutzstrecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSchutzstreckeAllg()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Schutzstrecke_Allg_AttributeGroup zBSSchutzstreckeAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_SchutzstreckeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Schutzstrecke();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_DWeg_ohne_Proxy_TypeClass getIDFstrDWeg() {
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrDWeg(ID_Fstr_DWeg_ohne_Proxy_TypeClass newIDFstrDWeg, NotificationChain msgs) {
		ID_Fstr_DWeg_ohne_Proxy_TypeClass oldIDFstrDWeg = iDFstrDWeg;
		iDFstrDWeg = newIDFstrDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, oldIDFstrDWeg, newIDFstrDWeg);
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
	public void setIDFstrDWeg(ID_Fstr_DWeg_ohne_Proxy_TypeClass newIDFstrDWeg) {
		if (newIDFstrDWeg != iDFstrDWeg) {
			NotificationChain msgs = null;
			if (iDFstrDWeg != null)
				msgs = ((InternalEObject)iDFstrDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, null, msgs);
			if (newIDFstrDWeg != null)
				msgs = ((InternalEObject)newIDFstrDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, null, msgs);
			msgs = basicSetIDFstrDWeg(newIDFstrDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, newIDFstrDWeg, newIDFstrDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schutzstrecke_Allg_AttributeGroup getZBSSchutzstreckeAllg() {
		return zBSSchutzstreckeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup newZBSSchutzstreckeAllg, NotificationChain msgs) {
		ZBS_Schutzstrecke_Allg_AttributeGroup oldZBSSchutzstreckeAllg = zBSSchutzstreckeAllg;
		zBSSchutzstreckeAllg = newZBSSchutzstreckeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, oldZBSSchutzstreckeAllg, newZBSSchutzstreckeAllg);
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
	public void setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup newZBSSchutzstreckeAllg) {
		if (newZBSSchutzstreckeAllg != zBSSchutzstreckeAllg) {
			NotificationChain msgs = null;
			if (zBSSchutzstreckeAllg != null)
				msgs = ((InternalEObject)zBSSchutzstreckeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, null, msgs);
			if (newZBSSchutzstreckeAllg != null)
				msgs = ((InternalEObject)newZBSSchutzstreckeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, null, msgs);
			msgs = basicSetZBSSchutzstreckeAllg(newZBSSchutzstreckeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, newZBSSchutzstreckeAllg, newZBSSchutzstreckeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				return basicSetIDFstrDWeg(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return basicSetZBSSchutzstreckeAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				return getIDFstrDWeg();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return getZBSSchutzstreckeAllg();
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				setZBSSchutzstreckeAllg((ZBS_Schutzstrecke_Allg_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				setZBSSchutzstreckeAllg((ZBS_Schutzstrecke_Allg_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				return iDFstrDWeg != null;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return zBSSchutzstreckeAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZBS_SchutzstreckeImpl
