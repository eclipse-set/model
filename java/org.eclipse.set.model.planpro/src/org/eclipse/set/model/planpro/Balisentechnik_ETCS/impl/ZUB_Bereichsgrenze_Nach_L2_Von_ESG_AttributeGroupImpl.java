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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EP_TPI_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_TPI_Folgesignal_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Von ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktEHEMFolgesignal <em>Abstand Datenpunkt EHEM Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktEPTPI <em>Abstand Datenpunkt EPTPI</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktTPIFolgesignal <em>Abstand Datenpunkt TPI Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getIDFolgesignal <em>ID Folgesignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl extends EObjectImpl implements ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandDatenpunktEHEMFolgesignal() <em>Abstand Datenpunkt EHEM Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktEHEMFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass abstandDatenpunktEHEMFolgesignal;

	/**
	 * The cached value of the '{@link #getAbstandDatenpunktEPTPI() <em>Abstand Datenpunkt EPTPI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktEPTPI()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_EP_TPI_TypeClass abstandDatenpunktEPTPI;

	/**
	 * The cached value of the '{@link #getAbstandDatenpunktTPIFolgesignal() <em>Abstand Datenpunkt TPI Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktTPIFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_TPI_Folgesignal_TypeClass abstandDatenpunktTPIFolgesignal;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Fachtelegramm_ohne_Proxy_TypeClass> iDFachtelegramm;

	/**
	 * The cached value of the '{@link #getIDFolgesignal() <em>ID Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDFolgesignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass getAbstandDatenpunktEHEMFolgesignal() {
		return abstandDatenpunktEHEMFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass newAbstandDatenpunktEHEMFolgesignal, NotificationChain msgs) {
		Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass oldAbstandDatenpunktEHEMFolgesignal = abstandDatenpunktEHEMFolgesignal;
		abstandDatenpunktEHEMFolgesignal = newAbstandDatenpunktEHEMFolgesignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, oldAbstandDatenpunktEHEMFolgesignal, newAbstandDatenpunktEHEMFolgesignal);
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
	public void setAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass newAbstandDatenpunktEHEMFolgesignal) {
		if (newAbstandDatenpunktEHEMFolgesignal != abstandDatenpunktEHEMFolgesignal) {
			NotificationChain msgs = null;
			if (abstandDatenpunktEHEMFolgesignal != null)
				msgs = ((InternalEObject)abstandDatenpunktEHEMFolgesignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, null, msgs);
			if (newAbstandDatenpunktEHEMFolgesignal != null)
				msgs = ((InternalEObject)newAbstandDatenpunktEHEMFolgesignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, null, msgs);
			msgs = basicSetAbstandDatenpunktEHEMFolgesignal(newAbstandDatenpunktEHEMFolgesignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, newAbstandDatenpunktEHEMFolgesignal, newAbstandDatenpunktEHEMFolgesignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EP_TPI_TypeClass getAbstandDatenpunktEPTPI() {
		return abstandDatenpunktEPTPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass newAbstandDatenpunktEPTPI, NotificationChain msgs) {
		Abstand_Datenpunkt_EP_TPI_TypeClass oldAbstandDatenpunktEPTPI = abstandDatenpunktEPTPI;
		abstandDatenpunktEPTPI = newAbstandDatenpunktEPTPI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, oldAbstandDatenpunktEPTPI, newAbstandDatenpunktEPTPI);
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
	public void setAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass newAbstandDatenpunktEPTPI) {
		if (newAbstandDatenpunktEPTPI != abstandDatenpunktEPTPI) {
			NotificationChain msgs = null;
			if (abstandDatenpunktEPTPI != null)
				msgs = ((InternalEObject)abstandDatenpunktEPTPI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, null, msgs);
			if (newAbstandDatenpunktEPTPI != null)
				msgs = ((InternalEObject)newAbstandDatenpunktEPTPI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, null, msgs);
			msgs = basicSetAbstandDatenpunktEPTPI(newAbstandDatenpunktEPTPI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, newAbstandDatenpunktEPTPI, newAbstandDatenpunktEPTPI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_TPI_Folgesignal_TypeClass getAbstandDatenpunktTPIFolgesignal() {
		return abstandDatenpunktTPIFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass newAbstandDatenpunktTPIFolgesignal, NotificationChain msgs) {
		Abstand_Datenpunkt_TPI_Folgesignal_TypeClass oldAbstandDatenpunktTPIFolgesignal = abstandDatenpunktTPIFolgesignal;
		abstandDatenpunktTPIFolgesignal = newAbstandDatenpunktTPIFolgesignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, oldAbstandDatenpunktTPIFolgesignal, newAbstandDatenpunktTPIFolgesignal);
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
	public void setAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass newAbstandDatenpunktTPIFolgesignal) {
		if (newAbstandDatenpunktTPIFolgesignal != abstandDatenpunktTPIFolgesignal) {
			NotificationChain msgs = null;
			if (abstandDatenpunktTPIFolgesignal != null)
				msgs = ((InternalEObject)abstandDatenpunktTPIFolgesignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, null, msgs);
			if (newAbstandDatenpunktTPIFolgesignal != null)
				msgs = ((InternalEObject)newAbstandDatenpunktTPIFolgesignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, null, msgs);
			msgs = basicSetAbstandDatenpunktTPIFolgesignal(newAbstandDatenpunktTPIFolgesignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, newAbstandDatenpunktTPIFolgesignal, newAbstandDatenpunktTPIFolgesignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Fachtelegramm_ohne_Proxy_TypeClass> getIDFachtelegramm() {
		if (iDFachtelegramm == null) {
			iDFachtelegramm = new EObjectContainmentEList<ID_Fachtelegramm_ohne_Proxy_TypeClass>(ID_Fachtelegramm_ohne_Proxy_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM);
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDFolgesignal() {
		return iDFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFolgesignal(ID_Signal_TypeClass newIDFolgesignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDFolgesignal = iDFolgesignal;
		iDFolgesignal = newIDFolgesignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, oldIDFolgesignal, newIDFolgesignal);
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
	public void setIDFolgesignal(ID_Signal_TypeClass newIDFolgesignal) {
		if (newIDFolgesignal != iDFolgesignal) {
			NotificationChain msgs = null;
			if (iDFolgesignal != null)
				msgs = ((InternalEObject)iDFolgesignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, null, msgs);
			if (newIDFolgesignal != null)
				msgs = ((InternalEObject)newIDFolgesignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, null, msgs);
			msgs = basicSetIDFolgesignal(newIDFolgesignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, newIDFolgesignal, newIDFolgesignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return basicSetAbstandDatenpunktEHEMFolgesignal(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return basicSetAbstandDatenpunktEPTPI(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return basicSetAbstandDatenpunktTPIFolgesignal(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return ((InternalEList<?>)getIDFachtelegramm()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				return basicSetIDFolgesignal(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return getAbstandDatenpunktEHEMFolgesignal();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return getAbstandDatenpunktEPTPI();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return getAbstandDatenpunktTPIFolgesignal();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				return getIDFolgesignal();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				setAbstandDatenpunktEHEMFolgesignal((Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				setAbstandDatenpunktEPTPI((Abstand_Datenpunkt_EP_TPI_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				setAbstandDatenpunktTPIFolgesignal((Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				getIDFachtelegramm().addAll((Collection<? extends ID_Fachtelegramm_ohne_Proxy_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				setIDFolgesignal((ID_Signal_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				setAbstandDatenpunktEHEMFolgesignal((Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				setAbstandDatenpunktEPTPI((Abstand_Datenpunkt_EP_TPI_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				setAbstandDatenpunktTPIFolgesignal((Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				setIDFolgesignal((ID_Signal_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return abstandDatenpunktEHEMFolgesignal != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return abstandDatenpunktEPTPI != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return abstandDatenpunktTPIFolgesignal != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null && !iDFachtelegramm.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				return iDFolgesignal != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl
