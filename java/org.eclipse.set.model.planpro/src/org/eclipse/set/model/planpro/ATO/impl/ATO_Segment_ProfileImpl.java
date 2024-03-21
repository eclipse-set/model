/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.ATO.ATOPackage;
import org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile;
import org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Segment Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getAbstandATOHaltVorEoA <em>Abstand ATO Halt Vor Eo A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getIDATOTSInstanz <em>IDATOTS Instanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getIDATOTSInstanzNachbar <em>IDATOTS Instanz Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getIDETCSKante <em>IDETCS Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Segment_ProfileImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Segment_ProfileImpl extends Basis_ObjektImpl implements ATO_Segment_Profile {
	/**
	 * The cached value of the '{@link #getAbstandATOHaltVorEoA() <em>Abstand ATO Halt Vor Eo A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandATOHaltVorEoA()
	 * @generated
	 * @ordered
	 */
	protected Abstand_ATO_Halt_Vor_EoA_TypeClass abstandATOHaltVorEoA;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ATO_Segment_Profile_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDATOTSInstanz() <em>IDATOTS Instanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDATOTSInstanz()
	 * @generated
	 * @ordered
	 */
	protected ID_ATO_TS_Instanz_ohne_Proxy_TypeClass iDATOTSInstanz;

	/**
	 * The cached value of the '{@link #getIDATOTSInstanzNachbar() <em>IDATOTS Instanz Nachbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDATOTSInstanzNachbar()
	 * @generated
	 * @ordered
	 */
	protected ID_ATO_TS_Instanz_TypeClass iDATOTSInstanzNachbar;

	/**
	 * The cached value of the '{@link #getIDETCSKante() <em>IDETCS Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKante()
	 * @generated
	 * @ordered
	 */
	protected ID_ETCS_Kante_TypeClass iDETCSKante;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Oertlichkeit_Proxy_TypeClass> iDOertlichkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Segment_ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_SEGMENT_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_ATO_Halt_Vor_EoA_TypeClass getAbstandATOHaltVorEoA() {
		return abstandATOHaltVorEoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass newAbstandATOHaltVorEoA, NotificationChain msgs) {
		Abstand_ATO_Halt_Vor_EoA_TypeClass oldAbstandATOHaltVorEoA = abstandATOHaltVorEoA;
		abstandATOHaltVorEoA = newAbstandATOHaltVorEoA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, oldAbstandATOHaltVorEoA, newAbstandATOHaltVorEoA);
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
	public void setAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass newAbstandATOHaltVorEoA) {
		if (newAbstandATOHaltVorEoA != abstandATOHaltVorEoA) {
			NotificationChain msgs = null;
			if (abstandATOHaltVorEoA != null)
				msgs = ((InternalEObject)abstandATOHaltVorEoA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, null, msgs);
			if (newAbstandATOHaltVorEoA != null)
				msgs = ((InternalEObject)newAbstandATOHaltVorEoA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, null, msgs);
			msgs = basicSetAbstandATOHaltVorEoA(newAbstandATOHaltVorEoA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, newAbstandATOHaltVorEoA, newAbstandATOHaltVorEoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Segment_Profile_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ATO_Segment_Profile_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ATO_TS_Instanz_ohne_Proxy_TypeClass getIDATOTSInstanz() {
		return iDATOTSInstanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDATOTSInstanz(ID_ATO_TS_Instanz_ohne_Proxy_TypeClass newIDATOTSInstanz, NotificationChain msgs) {
		ID_ATO_TS_Instanz_ohne_Proxy_TypeClass oldIDATOTSInstanz = iDATOTSInstanz;
		iDATOTSInstanz = newIDATOTSInstanz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, oldIDATOTSInstanz, newIDATOTSInstanz);
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
	public void setIDATOTSInstanz(ID_ATO_TS_Instanz_ohne_Proxy_TypeClass newIDATOTSInstanz) {
		if (newIDATOTSInstanz != iDATOTSInstanz) {
			NotificationChain msgs = null;
			if (iDATOTSInstanz != null)
				msgs = ((InternalEObject)iDATOTSInstanz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, null, msgs);
			if (newIDATOTSInstanz != null)
				msgs = ((InternalEObject)newIDATOTSInstanz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, null, msgs);
			msgs = basicSetIDATOTSInstanz(newIDATOTSInstanz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, newIDATOTSInstanz, newIDATOTSInstanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ATO_TS_Instanz_TypeClass getIDATOTSInstanzNachbar() {
		return iDATOTSInstanzNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDATOTSInstanzNachbar(ID_ATO_TS_Instanz_TypeClass newIDATOTSInstanzNachbar, NotificationChain msgs) {
		ID_ATO_TS_Instanz_TypeClass oldIDATOTSInstanzNachbar = iDATOTSInstanzNachbar;
		iDATOTSInstanzNachbar = newIDATOTSInstanzNachbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, oldIDATOTSInstanzNachbar, newIDATOTSInstanzNachbar);
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
	public void setIDATOTSInstanzNachbar(ID_ATO_TS_Instanz_TypeClass newIDATOTSInstanzNachbar) {
		if (newIDATOTSInstanzNachbar != iDATOTSInstanzNachbar) {
			NotificationChain msgs = null;
			if (iDATOTSInstanzNachbar != null)
				msgs = ((InternalEObject)iDATOTSInstanzNachbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, null, msgs);
			if (newIDATOTSInstanzNachbar != null)
				msgs = ((InternalEObject)newIDATOTSInstanzNachbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, null, msgs);
			msgs = basicSetIDATOTSInstanzNachbar(newIDATOTSInstanzNachbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, newIDATOTSInstanzNachbar, newIDATOTSInstanzNachbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Kante_TypeClass getIDETCSKante() {
		return iDETCSKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSKante(ID_ETCS_Kante_TypeClass newIDETCSKante, NotificationChain msgs) {
		ID_ETCS_Kante_TypeClass oldIDETCSKante = iDETCSKante;
		iDETCSKante = newIDETCSKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, oldIDETCSKante, newIDETCSKante);
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
	public void setIDETCSKante(ID_ETCS_Kante_TypeClass newIDETCSKante) {
		if (newIDETCSKante != iDETCSKante) {
			NotificationChain msgs = null;
			if (iDETCSKante != null)
				msgs = ((InternalEObject)iDETCSKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, null, msgs);
			if (newIDETCSKante != null)
				msgs = ((InternalEObject)newIDETCSKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, null, msgs);
			msgs = basicSetIDETCSKante(newIDETCSKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, newIDETCSKante, newIDETCSKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Oertlichkeit_Proxy_TypeClass> getIDOertlichkeit() {
		if (iDOertlichkeit == null) {
			iDOertlichkeit = new EObjectContainmentEList<ID_Oertlichkeit_Proxy_TypeClass>(ID_Oertlichkeit_Proxy_TypeClass.class, this, ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT);
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return basicSetAbstandATOHaltVorEoA(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				return basicSetIDATOTSInstanz(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				return basicSetIDATOTSInstanzNachbar(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				return basicSetIDETCSKante(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				return ((InternalEList<?>)getIDOertlichkeit()).basicRemove(otherEnd, msgs);
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return getAbstandATOHaltVorEoA();
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				return getBezeichnung();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				return getIDATOTSInstanz();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				return getIDATOTSInstanzNachbar();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				return getIDETCSKante();
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				setAbstandATOHaltVorEoA((Abstand_ATO_Halt_Vor_EoA_TypeClass)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				setBezeichnung((ATO_Segment_Profile_Bezeichnung_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				setIDATOTSInstanz((ID_ATO_TS_Instanz_ohne_Proxy_TypeClass)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				setIDATOTSInstanzNachbar((ID_ATO_TS_Instanz_TypeClass)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				setIDETCSKante((ID_ETCS_Kante_TypeClass)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				getIDOertlichkeit().clear();
				getIDOertlichkeit().addAll((Collection<? extends ID_Oertlichkeit_Proxy_TypeClass>)newValue);
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				setAbstandATOHaltVorEoA((Abstand_ATO_Halt_Vor_EoA_TypeClass)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				setBezeichnung((ATO_Segment_Profile_Bezeichnung_AttributeGroup)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				setIDATOTSInstanz((ID_ATO_TS_Instanz_ohne_Proxy_TypeClass)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				setIDATOTSInstanzNachbar((ID_ATO_TS_Instanz_TypeClass)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				setIDETCSKante((ID_ETCS_Kante_TypeClass)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				getIDOertlichkeit().clear();
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return abstandATOHaltVorEoA != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				return bezeichnung != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				return iDATOTSInstanz != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				return iDATOTSInstanzNachbar != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				return iDETCSKante != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				return iDOertlichkeit != null && !iDOertlichkeit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ATO_Segment_ProfileImpl
