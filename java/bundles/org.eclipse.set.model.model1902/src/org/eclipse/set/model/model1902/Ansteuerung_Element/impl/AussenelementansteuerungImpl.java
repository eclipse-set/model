/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_GFK_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Information_Primaer_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aussenelementansteuerung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAAllg <em>AEA Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAEnergieversorgung <em>AEA Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAGFKIPAdressblock <em>AEAGFKIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDInformationPrimaer <em>ID Information Primaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDInformationSekundaer <em>ID Information Sekundaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDOertlichkeitGesteuert <em>ID Oertlichkeit Gesteuert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AussenelementansteuerungImpl extends Basis_ObjektImpl implements Aussenelementansteuerung {
	/**
	 * The cached value of the '{@link #getAEAAllg() <em>AEA Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAAllg()
	 * @generated
	 * @ordered
	 */
	protected AEA_Allg_AttributeGroup aEAAllg;

	/**
	 * The cached value of the '{@link #getAEAEnergieversorgung() <em>AEA Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAEnergieversorgung()
	 * @generated
	 * @ordered
	 */
	protected AEA_Energieversorgung_AttributeGroup aEAEnergieversorgung;

	/**
	 * The cached value of the '{@link #getAEAGFKIPAdressblock() <em>AEAGFKIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAGFKIPAdressblock()
	 * @generated
	 * @ordered
	 */
	protected AEA_GFK_IP_Adressblock_AttributeGroup aEAGFKIPAdressblock;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDInformationPrimaer() <em>ID Information Primaer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationPrimaer()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Information_Primaer_TypeClass> iDInformationPrimaer;

	/**
	 * The cached value of the '{@link #getIDInformationSekundaer() <em>ID Information Sekundaer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationSekundaer()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Aussenelementansteuerung_TypeClass> iDInformationSekundaer;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitGesteuert() <em>ID Oertlichkeit Gesteuert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitGesteuert()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Oertlichkeit_TypeClass> iDOertlichkeitGesteuert;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitNamensgebend() <em>ID Oertlichkeit Namensgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeitNamensgebend;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_TypeClass iDUnterbringung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AussenelementansteuerungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_Allg_AttributeGroup getAEAAllg() {
		return aEAAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAAllg(AEA_Allg_AttributeGroup newAEAAllg, NotificationChain msgs) {
		AEA_Allg_AttributeGroup oldAEAAllg = aEAAllg;
		aEAAllg = newAEAAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, oldAEAAllg, newAEAAllg);
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
	public void setAEAAllg(AEA_Allg_AttributeGroup newAEAAllg) {
		if (newAEAAllg != aEAAllg) {
			NotificationChain msgs = null;
			if (aEAAllg != null)
				msgs = ((InternalEObject)aEAAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, null, msgs);
			if (newAEAAllg != null)
				msgs = ((InternalEObject)newAEAAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, null, msgs);
			msgs = basicSetAEAAllg(newAEAAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, newAEAAllg, newAEAAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_Energieversorgung_AttributeGroup getAEAEnergieversorgung() {
		return aEAEnergieversorgung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup newAEAEnergieversorgung, NotificationChain msgs) {
		AEA_Energieversorgung_AttributeGroup oldAEAEnergieversorgung = aEAEnergieversorgung;
		aEAEnergieversorgung = newAEAEnergieversorgung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, oldAEAEnergieversorgung, newAEAEnergieversorgung);
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
	public void setAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup newAEAEnergieversorgung) {
		if (newAEAEnergieversorgung != aEAEnergieversorgung) {
			NotificationChain msgs = null;
			if (aEAEnergieversorgung != null)
				msgs = ((InternalEObject)aEAEnergieversorgung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, null, msgs);
			if (newAEAEnergieversorgung != null)
				msgs = ((InternalEObject)newAEAEnergieversorgung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, null, msgs);
			msgs = basicSetAEAEnergieversorgung(newAEAEnergieversorgung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, newAEAEnergieversorgung, newAEAEnergieversorgung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_GFK_IP_Adressblock_AttributeGroup getAEAGFKIPAdressblock() {
		return aEAGFKIPAdressblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup newAEAGFKIPAdressblock, NotificationChain msgs) {
		AEA_GFK_IP_Adressblock_AttributeGroup oldAEAGFKIPAdressblock = aEAGFKIPAdressblock;
		aEAGFKIPAdressblock = newAEAGFKIPAdressblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, oldAEAGFKIPAdressblock, newAEAGFKIPAdressblock);
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
	public void setAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup newAEAGFKIPAdressblock) {
		if (newAEAGFKIPAdressblock != aEAGFKIPAdressblock) {
			NotificationChain msgs = null;
			if (aEAGFKIPAdressblock != null)
				msgs = ((InternalEObject)aEAGFKIPAdressblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, null, msgs);
			if (newAEAGFKIPAdressblock != null)
				msgs = ((InternalEObject)newAEAGFKIPAdressblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, null, msgs);
			msgs = basicSetAEAGFKIPAdressblock(newAEAGFKIPAdressblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, newAEAGFKIPAdressblock, newAEAGFKIPAdressblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Aussenelementansteuerung_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Information_Primaer_TypeClass> getIDInformationPrimaer() {
		if (iDInformationPrimaer == null) {
			iDInformationPrimaer = new EObjectContainmentEList<ID_Information_Primaer_TypeClass>(ID_Information_Primaer_TypeClass.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER);
		}
		return iDInformationPrimaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Aussenelementansteuerung_TypeClass> getIDInformationSekundaer() {
		if (iDInformationSekundaer == null) {
			iDInformationSekundaer = new EObjectContainmentEList<ID_Aussenelementansteuerung_TypeClass>(ID_Aussenelementansteuerung_TypeClass.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER);
		}
		return iDInformationSekundaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Oertlichkeit_TypeClass> getIDOertlichkeitGesteuert() {
		if (iDOertlichkeitGesteuert == null) {
			iDOertlichkeitGesteuert = new EObjectContainmentEList<ID_Oertlichkeit_TypeClass>(ID_Oertlichkeit_TypeClass.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT);
		}
		return iDOertlichkeitGesteuert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitNamensgebend, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		iDOertlichkeitNamensgebend = newIDOertlichkeitNamensgebend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, newIDOertlichkeitNamensgebend);
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
	public void setIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeitNamensgebend) {
		if (newIDOertlichkeitNamensgebend != iDOertlichkeitNamensgebend) {
			NotificationChain msgs = null;
			if (iDOertlichkeitNamensgebend != null)
				msgs = ((InternalEObject)iDOertlichkeitNamensgebend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, null, msgs);
			if (newIDOertlichkeitNamensgebend != null)
				msgs = ((InternalEObject)newIDOertlichkeitNamensgebend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, null, msgs);
			msgs = basicSetIDOertlichkeitNamensgebend(newIDOertlichkeitNamensgebend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, newIDOertlichkeitNamensgebend, newIDOertlichkeitNamensgebend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return basicSetAEAAllg(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return basicSetAEAEnergieversorgung(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return basicSetAEAGFKIPAdressblock(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				return ((InternalEList<?>)getIDInformationPrimaer()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				return ((InternalEList<?>)getIDInformationSekundaer()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				return ((InternalEList<?>)getIDOertlichkeitGesteuert()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				return basicSetIDOertlichkeitNamensgebend(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return getAEAAllg();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return getAEAEnergieversorgung();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return getAEAGFKIPAdressblock();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				return getIDInformationPrimaer();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				return getIDInformationSekundaer();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				return getIDOertlichkeitGesteuert();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				return getIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				setAEAAllg((AEA_Allg_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				setAEAEnergieversorgung((AEA_Energieversorgung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				setAEAGFKIPAdressblock((AEA_GFK_IP_Adressblock_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				setBezeichnung((Aussenelementansteuerung_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				getIDInformationPrimaer().clear();
				getIDInformationPrimaer().addAll((Collection<? extends ID_Information_Primaer_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				getIDInformationSekundaer().clear();
				getIDInformationSekundaer().addAll((Collection<? extends ID_Aussenelementansteuerung_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				getIDOertlichkeitGesteuert().clear();
				getIDOertlichkeitGesteuert().addAll((Collection<? extends ID_Oertlichkeit_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((ID_Oertlichkeit_Proxy_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				setAEAAllg((AEA_Allg_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				setAEAEnergieversorgung((AEA_Energieversorgung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				setAEAGFKIPAdressblock((AEA_GFK_IP_Adressblock_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				setBezeichnung((Aussenelementansteuerung_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				getIDInformationPrimaer().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				getIDInformationSekundaer().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				getIDOertlichkeitGesteuert().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((ID_Oertlichkeit_Proxy_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return aEAAllg != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return aEAEnergieversorgung != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return aEAGFKIPAdressblock != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				return iDInformationPrimaer != null && !iDInformationPrimaer.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				return iDInformationSekundaer != null && !iDInformationSekundaer.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				return iDOertlichkeitGesteuert != null && !iDOertlichkeitGesteuert.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				return iDOertlichkeitNamensgebend != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
		}
		return super.eIsSet(featureID);
	}

} //AussenelementansteuerungImpl
