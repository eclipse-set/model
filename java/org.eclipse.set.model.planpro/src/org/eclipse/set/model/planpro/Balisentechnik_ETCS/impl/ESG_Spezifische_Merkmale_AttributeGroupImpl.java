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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Paketnummer_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Par_Erlaeuterung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parametername_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parameterwert_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_2_Nr_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_Nr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESG Spezifische Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getETCSPaketnummer <em>ETCS Paketnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getETCSParErlaeuterung <em>ETCS Par Erlaeuterung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getETCSParametername <em>ETCS Parametername</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getETCSParameterwert <em>ETCS Parameterwert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getRekursion2Nr <em>Rekursion2 Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ESG_Spezifische_Merkmale_AttributeGroupImpl#getRekursionNr <em>Rekursion Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESG_Spezifische_Merkmale_AttributeGroupImpl extends EObjectImpl implements ESG_Spezifische_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getETCSPaketnummer() <em>ETCS Paketnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSPaketnummer()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Paketnummer_TypeClass eTCSPaketnummer;

	/**
	 * The cached value of the '{@link #getETCSParErlaeuterung() <em>ETCS Par Erlaeuterung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSParErlaeuterung()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Par_Erlaeuterung_TypeClass eTCSParErlaeuterung;

	/**
	 * The cached value of the '{@link #getETCSParametername() <em>ETCS Parametername</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSParametername()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Parametername_TypeClass eTCSParametername;

	/**
	 * The cached value of the '{@link #getETCSParameterwert() <em>ETCS Parameterwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSParameterwert()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Parameterwert_TypeClass eTCSParameterwert;

	/**
	 * The cached value of the '{@link #getRekursion2Nr() <em>Rekursion2 Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRekursion2Nr()
	 * @generated
	 * @ordered
	 */
	protected Rekursion_2_Nr_TypeClass rekursion2Nr;

	/**
	 * The cached value of the '{@link #getRekursionNr() <em>Rekursion Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRekursionNr()
	 * @generated
	 * @ordered
	 */
	protected Rekursion_Nr_TypeClass rekursionNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESG_Spezifische_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Paketnummer_TypeClass getETCSPaketnummer() {
		return eTCSPaketnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSPaketnummer(ETCS_Paketnummer_TypeClass newETCSPaketnummer, NotificationChain msgs) {
		ETCS_Paketnummer_TypeClass oldETCSPaketnummer = eTCSPaketnummer;
		eTCSPaketnummer = newETCSPaketnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER, oldETCSPaketnummer, newETCSPaketnummer);
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
	public void setETCSPaketnummer(ETCS_Paketnummer_TypeClass newETCSPaketnummer) {
		if (newETCSPaketnummer != eTCSPaketnummer) {
			NotificationChain msgs = null;
			if (eTCSPaketnummer != null)
				msgs = ((InternalEObject)eTCSPaketnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER, null, msgs);
			if (newETCSPaketnummer != null)
				msgs = ((InternalEObject)newETCSPaketnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER, null, msgs);
			msgs = basicSetETCSPaketnummer(newETCSPaketnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER, newETCSPaketnummer, newETCSPaketnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Par_Erlaeuterung_TypeClass getETCSParErlaeuterung() {
		return eTCSParErlaeuterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSParErlaeuterung(ETCS_Par_Erlaeuterung_TypeClass newETCSParErlaeuterung, NotificationChain msgs) {
		ETCS_Par_Erlaeuterung_TypeClass oldETCSParErlaeuterung = eTCSParErlaeuterung;
		eTCSParErlaeuterung = newETCSParErlaeuterung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG, oldETCSParErlaeuterung, newETCSParErlaeuterung);
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
	public void setETCSParErlaeuterung(ETCS_Par_Erlaeuterung_TypeClass newETCSParErlaeuterung) {
		if (newETCSParErlaeuterung != eTCSParErlaeuterung) {
			NotificationChain msgs = null;
			if (eTCSParErlaeuterung != null)
				msgs = ((InternalEObject)eTCSParErlaeuterung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG, null, msgs);
			if (newETCSParErlaeuterung != null)
				msgs = ((InternalEObject)newETCSParErlaeuterung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG, null, msgs);
			msgs = basicSetETCSParErlaeuterung(newETCSParErlaeuterung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG, newETCSParErlaeuterung, newETCSParErlaeuterung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Parametername_TypeClass getETCSParametername() {
		return eTCSParametername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSParametername(ETCS_Parametername_TypeClass newETCSParametername, NotificationChain msgs) {
		ETCS_Parametername_TypeClass oldETCSParametername = eTCSParametername;
		eTCSParametername = newETCSParametername;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME, oldETCSParametername, newETCSParametername);
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
	public void setETCSParametername(ETCS_Parametername_TypeClass newETCSParametername) {
		if (newETCSParametername != eTCSParametername) {
			NotificationChain msgs = null;
			if (eTCSParametername != null)
				msgs = ((InternalEObject)eTCSParametername).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME, null, msgs);
			if (newETCSParametername != null)
				msgs = ((InternalEObject)newETCSParametername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME, null, msgs);
			msgs = basicSetETCSParametername(newETCSParametername, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME, newETCSParametername, newETCSParametername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Parameterwert_TypeClass getETCSParameterwert() {
		return eTCSParameterwert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSParameterwert(ETCS_Parameterwert_TypeClass newETCSParameterwert, NotificationChain msgs) {
		ETCS_Parameterwert_TypeClass oldETCSParameterwert = eTCSParameterwert;
		eTCSParameterwert = newETCSParameterwert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT, oldETCSParameterwert, newETCSParameterwert);
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
	public void setETCSParameterwert(ETCS_Parameterwert_TypeClass newETCSParameterwert) {
		if (newETCSParameterwert != eTCSParameterwert) {
			NotificationChain msgs = null;
			if (eTCSParameterwert != null)
				msgs = ((InternalEObject)eTCSParameterwert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT, null, msgs);
			if (newETCSParameterwert != null)
				msgs = ((InternalEObject)newETCSParameterwert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT, null, msgs);
			msgs = basicSetETCSParameterwert(newETCSParameterwert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT, newETCSParameterwert, newETCSParameterwert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rekursion_2_Nr_TypeClass getRekursion2Nr() {
		return rekursion2Nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRekursion2Nr(Rekursion_2_Nr_TypeClass newRekursion2Nr, NotificationChain msgs) {
		Rekursion_2_Nr_TypeClass oldRekursion2Nr = rekursion2Nr;
		rekursion2Nr = newRekursion2Nr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR, oldRekursion2Nr, newRekursion2Nr);
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
	public void setRekursion2Nr(Rekursion_2_Nr_TypeClass newRekursion2Nr) {
		if (newRekursion2Nr != rekursion2Nr) {
			NotificationChain msgs = null;
			if (rekursion2Nr != null)
				msgs = ((InternalEObject)rekursion2Nr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR, null, msgs);
			if (newRekursion2Nr != null)
				msgs = ((InternalEObject)newRekursion2Nr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR, null, msgs);
			msgs = basicSetRekursion2Nr(newRekursion2Nr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR, newRekursion2Nr, newRekursion2Nr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rekursion_Nr_TypeClass getRekursionNr() {
		return rekursionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRekursionNr(Rekursion_Nr_TypeClass newRekursionNr, NotificationChain msgs) {
		Rekursion_Nr_TypeClass oldRekursionNr = rekursionNr;
		rekursionNr = newRekursionNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR, oldRekursionNr, newRekursionNr);
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
	public void setRekursionNr(Rekursion_Nr_TypeClass newRekursionNr) {
		if (newRekursionNr != rekursionNr) {
			NotificationChain msgs = null;
			if (rekursionNr != null)
				msgs = ((InternalEObject)rekursionNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR, null, msgs);
			if (newRekursionNr != null)
				msgs = ((InternalEObject)newRekursionNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR, null, msgs);
			msgs = basicSetRekursionNr(newRekursionNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR, newRekursionNr, newRekursionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
				return basicSetETCSPaketnummer(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
				return basicSetETCSParErlaeuterung(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
				return basicSetETCSParametername(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
				return basicSetETCSParameterwert(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
				return basicSetRekursion2Nr(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
				return basicSetRekursionNr(null, msgs);
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
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
				return getETCSPaketnummer();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
				return getETCSParErlaeuterung();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
				return getETCSParametername();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
				return getETCSParameterwert();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
				return getRekursion2Nr();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
				return getRekursionNr();
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
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
				setETCSPaketnummer((ETCS_Paketnummer_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
				setETCSParErlaeuterung((ETCS_Par_Erlaeuterung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
				setETCSParametername((ETCS_Parametername_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
				setETCSParameterwert((ETCS_Parameterwert_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
				setRekursion2Nr((Rekursion_2_Nr_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
				setRekursionNr((Rekursion_Nr_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
				setETCSPaketnummer((ETCS_Paketnummer_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
				setETCSParErlaeuterung((ETCS_Par_Erlaeuterung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
				setETCSParametername((ETCS_Parametername_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
				setETCSParameterwert((ETCS_Parameterwert_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
				setRekursion2Nr((Rekursion_2_Nr_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
				setRekursionNr((Rekursion_Nr_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
				return eTCSPaketnummer != null;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
				return eTCSParErlaeuterung != null;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
				return eTCSParametername != null;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
				return eTCSParameterwert != null;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
				return rekursion2Nr != null;
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
				return rekursionNr != null;
		}
		return super.eIsSet(featureID);
	}

} //ESG_Spezifische_Merkmale_AttributeGroupImpl
