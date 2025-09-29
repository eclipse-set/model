/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bedienbarkeit_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ANB_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ZN_A_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Funktionalitaet_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.HOA_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Sichtbarkeit_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Verzoegerung_Manuell_Loeschung_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Vormeldestart_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Loeschkriterium_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Feld_Ohne_Anzeige_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zugvorbereitungsmeldung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Anzeigefeld Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getBedienbarkeitAnzeigefeld <em>Bedienbarkeit Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getBfNrANB <em>Bf Nr ANB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getBfNrZNA <em>Bf Nr ZNA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getFunktionalitaetAnzeigefeld <em>Funktionalitaet Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getHOA <em>HOA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getSichtbarkeitAnzeigefeld <em>Sichtbarkeit Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getVerzoegerungManuellLoeschung <em>Verzoegerung Manuell Loeschung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getVormeldestart <em>Vormeldestart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getZNAnzeigefeldLoeschkriterium <em>ZN Anzeigefeld Loeschkriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getZNFeldOhneAnzeige <em>ZN Feld Ohne Anzeige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Allg_AttributeGroupImpl#getZugvorbereitungsmeldung <em>Zugvorbereitungsmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Anzeigefeld_Allg_AttributeGroupImpl extends EObjectImpl implements ZN_Anzeigefeld_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedienbarkeitAnzeigefeld() <em>Bedienbarkeit Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienbarkeitAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected Bedienbarkeit_Anzeigefeld_TypeClass bedienbarkeitAnzeigefeld;

	/**
	 * The cached value of the '{@link #getBfNrANB() <em>Bf Nr ANB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBfNrANB()
	 * @generated
	 * @ordered
	 */
	protected Bf_Nr_ANB_TypeClass bfNrANB;

	/**
	 * The cached value of the '{@link #getBfNrZNA() <em>Bf Nr ZNA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBfNrZNA()
	 * @generated
	 * @ordered
	 */
	protected Bf_Nr_ZN_A_TypeClass bfNrZNA;

	/**
	 * The cached value of the '{@link #getFunktionalitaetAnzeigefeld() <em>Funktionalitaet Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionalitaetAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected Funktionalitaet_Anzeigefeld_TypeClass funktionalitaetAnzeigefeld;

	/**
	 * The cached value of the '{@link #getHOA() <em>HOA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHOA()
	 * @generated
	 * @ordered
	 */
	protected HOA_TypeClass hOA;

	/**
	 * The cached value of the '{@link #getSichtbarkeitAnzeigefeld() <em>Sichtbarkeit Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSichtbarkeitAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected Sichtbarkeit_Anzeigefeld_TypeClass sichtbarkeitAnzeigefeld;

	/**
	 * The cached value of the '{@link #getVerzoegerungManuellLoeschung() <em>Verzoegerung Manuell Loeschung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerzoegerungManuellLoeschung()
	 * @generated
	 * @ordered
	 */
	protected Verzoegerung_Manuell_Loeschung_TypeClass verzoegerungManuellLoeschung;

	/**
	 * The cached value of the '{@link #getVormeldestart() <em>Vormeldestart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVormeldestart()
	 * @generated
	 * @ordered
	 */
	protected Vormeldestart_TypeClass vormeldestart;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeldLoeschkriterium() <em>ZN Anzeigefeld Loeschkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeldLoeschkriterium()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld_Loeschkriterium_TypeClass zNAnzeigefeldLoeschkriterium;

	/**
	 * The cached value of the '{@link #getZNFeldOhneAnzeige() <em>ZN Feld Ohne Anzeige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFeldOhneAnzeige()
	 * @generated
	 * @ordered
	 */
	protected ZN_Feld_Ohne_Anzeige_TypeClass zNFeldOhneAnzeige;

	/**
	 * The cached value of the '{@link #getZugvorbereitungsmeldung() <em>Zugvorbereitungsmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugvorbereitungsmeldung()
	 * @generated
	 * @ordered
	 */
	protected Zugvorbereitungsmeldung_TypeClass zugvorbereitungsmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Anzeigefeld_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienbarkeit_Anzeigefeld_TypeClass getBedienbarkeitAnzeigefeld() {
		return bedienbarkeitAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienbarkeitAnzeigefeld(Bedienbarkeit_Anzeigefeld_TypeClass newBedienbarkeitAnzeigefeld, NotificationChain msgs) {
		Bedienbarkeit_Anzeigefeld_TypeClass oldBedienbarkeitAnzeigefeld = bedienbarkeitAnzeigefeld;
		bedienbarkeitAnzeigefeld = newBedienbarkeitAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD, oldBedienbarkeitAnzeigefeld, newBedienbarkeitAnzeigefeld);
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
	public void setBedienbarkeitAnzeigefeld(Bedienbarkeit_Anzeigefeld_TypeClass newBedienbarkeitAnzeigefeld) {
		if (newBedienbarkeitAnzeigefeld != bedienbarkeitAnzeigefeld) {
			NotificationChain msgs = null;
			if (bedienbarkeitAnzeigefeld != null)
				msgs = ((InternalEObject)bedienbarkeitAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD, null, msgs);
			if (newBedienbarkeitAnzeigefeld != null)
				msgs = ((InternalEObject)newBedienbarkeitAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD, null, msgs);
			msgs = basicSetBedienbarkeitAnzeigefeld(newBedienbarkeitAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD, newBedienbarkeitAnzeigefeld, newBedienbarkeitAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_ANB_TypeClass getBfNrANB() {
		return bfNrANB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBfNrANB(Bf_Nr_ANB_TypeClass newBfNrANB, NotificationChain msgs) {
		Bf_Nr_ANB_TypeClass oldBfNrANB = bfNrANB;
		bfNrANB = newBfNrANB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB, oldBfNrANB, newBfNrANB);
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
	public void setBfNrANB(Bf_Nr_ANB_TypeClass newBfNrANB) {
		if (newBfNrANB != bfNrANB) {
			NotificationChain msgs = null;
			if (bfNrANB != null)
				msgs = ((InternalEObject)bfNrANB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB, null, msgs);
			if (newBfNrANB != null)
				msgs = ((InternalEObject)newBfNrANB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB, null, msgs);
			msgs = basicSetBfNrANB(newBfNrANB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB, newBfNrANB, newBfNrANB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_ZN_A_TypeClass getBfNrZNA() {
		return bfNrZNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBfNrZNA(Bf_Nr_ZN_A_TypeClass newBfNrZNA, NotificationChain msgs) {
		Bf_Nr_ZN_A_TypeClass oldBfNrZNA = bfNrZNA;
		bfNrZNA = newBfNrZNA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA, oldBfNrZNA, newBfNrZNA);
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
	public void setBfNrZNA(Bf_Nr_ZN_A_TypeClass newBfNrZNA) {
		if (newBfNrZNA != bfNrZNA) {
			NotificationChain msgs = null;
			if (bfNrZNA != null)
				msgs = ((InternalEObject)bfNrZNA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA, null, msgs);
			if (newBfNrZNA != null)
				msgs = ((InternalEObject)newBfNrZNA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA, null, msgs);
			msgs = basicSetBfNrZNA(newBfNrZNA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA, newBfNrZNA, newBfNrZNA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Funktionalitaet_Anzeigefeld_TypeClass getFunktionalitaetAnzeigefeld() {
		return funktionalitaetAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunktionalitaetAnzeigefeld(Funktionalitaet_Anzeigefeld_TypeClass newFunktionalitaetAnzeigefeld, NotificationChain msgs) {
		Funktionalitaet_Anzeigefeld_TypeClass oldFunktionalitaetAnzeigefeld = funktionalitaetAnzeigefeld;
		funktionalitaetAnzeigefeld = newFunktionalitaetAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD, oldFunktionalitaetAnzeigefeld, newFunktionalitaetAnzeigefeld);
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
	public void setFunktionalitaetAnzeigefeld(Funktionalitaet_Anzeigefeld_TypeClass newFunktionalitaetAnzeigefeld) {
		if (newFunktionalitaetAnzeigefeld != funktionalitaetAnzeigefeld) {
			NotificationChain msgs = null;
			if (funktionalitaetAnzeigefeld != null)
				msgs = ((InternalEObject)funktionalitaetAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD, null, msgs);
			if (newFunktionalitaetAnzeigefeld != null)
				msgs = ((InternalEObject)newFunktionalitaetAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD, null, msgs);
			msgs = basicSetFunktionalitaetAnzeigefeld(newFunktionalitaetAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD, newFunktionalitaetAnzeigefeld, newFunktionalitaetAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HOA_TypeClass getHOA() {
		return hOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHOA(HOA_TypeClass newHOA, NotificationChain msgs) {
		HOA_TypeClass oldHOA = hOA;
		hOA = newHOA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA, oldHOA, newHOA);
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
	public void setHOA(HOA_TypeClass newHOA) {
		if (newHOA != hOA) {
			NotificationChain msgs = null;
			if (hOA != null)
				msgs = ((InternalEObject)hOA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA, null, msgs);
			if (newHOA != null)
				msgs = ((InternalEObject)newHOA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA, null, msgs);
			msgs = basicSetHOA(newHOA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA, newHOA, newHOA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sichtbarkeit_Anzeigefeld_TypeClass getSichtbarkeitAnzeigefeld() {
		return sichtbarkeitAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSichtbarkeitAnzeigefeld(Sichtbarkeit_Anzeigefeld_TypeClass newSichtbarkeitAnzeigefeld, NotificationChain msgs) {
		Sichtbarkeit_Anzeigefeld_TypeClass oldSichtbarkeitAnzeigefeld = sichtbarkeitAnzeigefeld;
		sichtbarkeitAnzeigefeld = newSichtbarkeitAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD, oldSichtbarkeitAnzeigefeld, newSichtbarkeitAnzeigefeld);
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
	public void setSichtbarkeitAnzeigefeld(Sichtbarkeit_Anzeigefeld_TypeClass newSichtbarkeitAnzeigefeld) {
		if (newSichtbarkeitAnzeigefeld != sichtbarkeitAnzeigefeld) {
			NotificationChain msgs = null;
			if (sichtbarkeitAnzeigefeld != null)
				msgs = ((InternalEObject)sichtbarkeitAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD, null, msgs);
			if (newSichtbarkeitAnzeigefeld != null)
				msgs = ((InternalEObject)newSichtbarkeitAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD, null, msgs);
			msgs = basicSetSichtbarkeitAnzeigefeld(newSichtbarkeitAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD, newSichtbarkeitAnzeigefeld, newSichtbarkeitAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verzoegerung_Manuell_Loeschung_TypeClass getVerzoegerungManuellLoeschung() {
		return verzoegerungManuellLoeschung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerzoegerungManuellLoeschung(Verzoegerung_Manuell_Loeschung_TypeClass newVerzoegerungManuellLoeschung, NotificationChain msgs) {
		Verzoegerung_Manuell_Loeschung_TypeClass oldVerzoegerungManuellLoeschung = verzoegerungManuellLoeschung;
		verzoegerungManuellLoeschung = newVerzoegerungManuellLoeschung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG, oldVerzoegerungManuellLoeschung, newVerzoegerungManuellLoeschung);
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
	public void setVerzoegerungManuellLoeschung(Verzoegerung_Manuell_Loeschung_TypeClass newVerzoegerungManuellLoeschung) {
		if (newVerzoegerungManuellLoeschung != verzoegerungManuellLoeschung) {
			NotificationChain msgs = null;
			if (verzoegerungManuellLoeschung != null)
				msgs = ((InternalEObject)verzoegerungManuellLoeschung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG, null, msgs);
			if (newVerzoegerungManuellLoeschung != null)
				msgs = ((InternalEObject)newVerzoegerungManuellLoeschung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG, null, msgs);
			msgs = basicSetVerzoegerungManuellLoeschung(newVerzoegerungManuellLoeschung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG, newVerzoegerungManuellLoeschung, newVerzoegerungManuellLoeschung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vormeldestart_TypeClass getVormeldestart() {
		return vormeldestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVormeldestart(Vormeldestart_TypeClass newVormeldestart, NotificationChain msgs) {
		Vormeldestart_TypeClass oldVormeldestart = vormeldestart;
		vormeldestart = newVormeldestart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART, oldVormeldestart, newVormeldestart);
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
	public void setVormeldestart(Vormeldestart_TypeClass newVormeldestart) {
		if (newVormeldestart != vormeldestart) {
			NotificationChain msgs = null;
			if (vormeldestart != null)
				msgs = ((InternalEObject)vormeldestart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART, null, msgs);
			if (newVormeldestart != null)
				msgs = ((InternalEObject)newVormeldestart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART, null, msgs);
			msgs = basicSetVormeldestart(newVormeldestart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART, newVormeldestart, newVormeldestart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Loeschkriterium_TypeClass getZNAnzeigefeldLoeschkriterium() {
		return zNAnzeigefeldLoeschkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnzeigefeldLoeschkriterium(ZN_Anzeigefeld_Loeschkriterium_TypeClass newZNAnzeigefeldLoeschkriterium, NotificationChain msgs) {
		ZN_Anzeigefeld_Loeschkriterium_TypeClass oldZNAnzeigefeldLoeschkriterium = zNAnzeigefeldLoeschkriterium;
		zNAnzeigefeldLoeschkriterium = newZNAnzeigefeldLoeschkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM, oldZNAnzeigefeldLoeschkriterium, newZNAnzeigefeldLoeschkriterium);
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
	public void setZNAnzeigefeldLoeschkriterium(ZN_Anzeigefeld_Loeschkriterium_TypeClass newZNAnzeigefeldLoeschkriterium) {
		if (newZNAnzeigefeldLoeschkriterium != zNAnzeigefeldLoeschkriterium) {
			NotificationChain msgs = null;
			if (zNAnzeigefeldLoeschkriterium != null)
				msgs = ((InternalEObject)zNAnzeigefeldLoeschkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM, null, msgs);
			if (newZNAnzeigefeldLoeschkriterium != null)
				msgs = ((InternalEObject)newZNAnzeigefeldLoeschkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM, null, msgs);
			msgs = basicSetZNAnzeigefeldLoeschkriterium(newZNAnzeigefeldLoeschkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM, newZNAnzeigefeldLoeschkriterium, newZNAnzeigefeldLoeschkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Feld_Ohne_Anzeige_TypeClass getZNFeldOhneAnzeige() {
		return zNFeldOhneAnzeige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNFeldOhneAnzeige(ZN_Feld_Ohne_Anzeige_TypeClass newZNFeldOhneAnzeige, NotificationChain msgs) {
		ZN_Feld_Ohne_Anzeige_TypeClass oldZNFeldOhneAnzeige = zNFeldOhneAnzeige;
		zNFeldOhneAnzeige = newZNFeldOhneAnzeige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE, oldZNFeldOhneAnzeige, newZNFeldOhneAnzeige);
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
	public void setZNFeldOhneAnzeige(ZN_Feld_Ohne_Anzeige_TypeClass newZNFeldOhneAnzeige) {
		if (newZNFeldOhneAnzeige != zNFeldOhneAnzeige) {
			NotificationChain msgs = null;
			if (zNFeldOhneAnzeige != null)
				msgs = ((InternalEObject)zNFeldOhneAnzeige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE, null, msgs);
			if (newZNFeldOhneAnzeige != null)
				msgs = ((InternalEObject)newZNFeldOhneAnzeige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE, null, msgs);
			msgs = basicSetZNFeldOhneAnzeige(newZNFeldOhneAnzeige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE, newZNFeldOhneAnzeige, newZNFeldOhneAnzeige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugvorbereitungsmeldung_TypeClass getZugvorbereitungsmeldung() {
		return zugvorbereitungsmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZugvorbereitungsmeldung(Zugvorbereitungsmeldung_TypeClass newZugvorbereitungsmeldung, NotificationChain msgs) {
		Zugvorbereitungsmeldung_TypeClass oldZugvorbereitungsmeldung = zugvorbereitungsmeldung;
		zugvorbereitungsmeldung = newZugvorbereitungsmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG, oldZugvorbereitungsmeldung, newZugvorbereitungsmeldung);
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
	public void setZugvorbereitungsmeldung(Zugvorbereitungsmeldung_TypeClass newZugvorbereitungsmeldung) {
		if (newZugvorbereitungsmeldung != zugvorbereitungsmeldung) {
			NotificationChain msgs = null;
			if (zugvorbereitungsmeldung != null)
				msgs = ((InternalEObject)zugvorbereitungsmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG, null, msgs);
			if (newZugvorbereitungsmeldung != null)
				msgs = ((InternalEObject)newZugvorbereitungsmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG, null, msgs);
			msgs = basicSetZugvorbereitungsmeldung(newZugvorbereitungsmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG, newZugvorbereitungsmeldung, newZugvorbereitungsmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
				return basicSetBedienbarkeitAnzeigefeld(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
				return basicSetBfNrANB(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
				return basicSetBfNrZNA(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
				return basicSetFunktionalitaetAnzeigefeld(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
				return basicSetHOA(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
				return basicSetSichtbarkeitAnzeigefeld(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
				return basicSetVerzoegerungManuellLoeschung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
				return basicSetVormeldestart(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return basicSetZNAnzeigefeldLoeschkriterium(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
				return basicSetZNFeldOhneAnzeige(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
				return basicSetZugvorbereitungsmeldung(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
				return getBedienbarkeitAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
				return getBfNrANB();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
				return getBfNrZNA();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
				return getFunktionalitaetAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
				return getHOA();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
				return getSichtbarkeitAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
				return getVerzoegerungManuellLoeschung();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
				return getVormeldestart();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return getZNAnzeigefeldLoeschkriterium();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
				return getZNFeldOhneAnzeige();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
				return getZugvorbereitungsmeldung();
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
				setBedienbarkeitAnzeigefeld((Bedienbarkeit_Anzeigefeld_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
				setBfNrANB((Bf_Nr_ANB_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
				setBfNrZNA((Bf_Nr_ZN_A_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
				setFunktionalitaetAnzeigefeld((Funktionalitaet_Anzeigefeld_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
				setHOA((HOA_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
				setSichtbarkeitAnzeigefeld((Sichtbarkeit_Anzeigefeld_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
				setVerzoegerungManuellLoeschung((Verzoegerung_Manuell_Loeschung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
				setVormeldestart((Vormeldestart_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
				setZNAnzeigefeldLoeschkriterium((ZN_Anzeigefeld_Loeschkriterium_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
				setZNFeldOhneAnzeige((ZN_Feld_Ohne_Anzeige_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
				setZugvorbereitungsmeldung((Zugvorbereitungsmeldung_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
				setBedienbarkeitAnzeigefeld((Bedienbarkeit_Anzeigefeld_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
				setBfNrANB((Bf_Nr_ANB_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
				setBfNrZNA((Bf_Nr_ZN_A_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
				setFunktionalitaetAnzeigefeld((Funktionalitaet_Anzeigefeld_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
				setHOA((HOA_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
				setSichtbarkeitAnzeigefeld((Sichtbarkeit_Anzeigefeld_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
				setVerzoegerungManuellLoeschung((Verzoegerung_Manuell_Loeschung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
				setVormeldestart((Vormeldestart_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
				setZNAnzeigefeldLoeschkriterium((ZN_Anzeigefeld_Loeschkriterium_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
				setZNFeldOhneAnzeige((ZN_Feld_Ohne_Anzeige_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
				setZugvorbereitungsmeldung((Zugvorbereitungsmeldung_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
				return bedienbarkeitAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
				return bfNrANB != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
				return bfNrZNA != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
				return funktionalitaetAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
				return hOA != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
				return sichtbarkeitAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
				return verzoegerungManuellLoeschung != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
				return vormeldestart != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return zNAnzeigefeldLoeschkriterium != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
				return zNFeldOhneAnzeige != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
				return zugvorbereitungsmeldung != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Anzeigefeld_Allg_AttributeGroupImpl
