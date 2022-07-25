/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Port_Nr_Ausg_Physisch_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_Balise_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul Ausgang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getIDBalise <em>ID Balise</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getPortNrAusgPhysisch <em>Port Nr Ausg Physisch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Modul_Ausgang_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Modul_Ausgang_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBalise() <em>ID Balise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBalise()
	 * @generated
	 * @ordered
	 */
	protected ID_Balise_TypeClass iDBalise;

	/**
	 * The cached value of the '{@link #getLEUAusgangNr() <em>LEU Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected LEU_Ausgang_Nr_TypeClass lEUAusgangNr;

	/**
	 * The cached value of the '{@link #getPortNrAusgPhysisch() <em>Port Nr Ausg Physisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNrAusgPhysisch()
	 * @generated
	 * @ordered
	 */
	protected Port_Nr_Ausg_Physisch_TypeClass portNrAusgPhysisch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Modul_Ausgang_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul_Ausgang_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Balise_TypeClass getIDBalise() {
		return iDBalise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBalise(ID_Balise_TypeClass newIDBalise, NotificationChain msgs) {
		ID_Balise_TypeClass oldIDBalise = iDBalise;
		iDBalise = newIDBalise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, oldIDBalise, newIDBalise);
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
	public void setIDBalise(ID_Balise_TypeClass newIDBalise) {
		if (newIDBalise != iDBalise) {
			NotificationChain msgs = null;
			if (iDBalise != null)
				msgs = ((InternalEObject)iDBalise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, null, msgs);
			if (newIDBalise != null)
				msgs = ((InternalEObject)newIDBalise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, null, msgs);
			msgs = basicSetIDBalise(newIDBalise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, newIDBalise, newIDBalise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Ausgang_Nr_TypeClass getLEUAusgangNr() {
		return lEUAusgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr, NotificationChain msgs) {
		LEU_Ausgang_Nr_TypeClass oldLEUAusgangNr = lEUAusgangNr;
		lEUAusgangNr = newLEUAusgangNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, oldLEUAusgangNr, newLEUAusgangNr);
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
	public void setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr) {
		if (newLEUAusgangNr != lEUAusgangNr) {
			NotificationChain msgs = null;
			if (lEUAusgangNr != null)
				msgs = ((InternalEObject)lEUAusgangNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			if (newLEUAusgangNr != null)
				msgs = ((InternalEObject)newLEUAusgangNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			msgs = basicSetLEUAusgangNr(newLEUAusgangNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, newLEUAusgangNr, newLEUAusgangNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port_Nr_Ausg_Physisch_TypeClass getPortNrAusgPhysisch() {
		return portNrAusgPhysisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass newPortNrAusgPhysisch, NotificationChain msgs) {
		Port_Nr_Ausg_Physisch_TypeClass oldPortNrAusgPhysisch = portNrAusgPhysisch;
		portNrAusgPhysisch = newPortNrAusgPhysisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, oldPortNrAusgPhysisch, newPortNrAusgPhysisch);
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
	public void setPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass newPortNrAusgPhysisch) {
		if (newPortNrAusgPhysisch != portNrAusgPhysisch) {
			NotificationChain msgs = null;
			if (portNrAusgPhysisch != null)
				msgs = ((InternalEObject)portNrAusgPhysisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, null, msgs);
			if (newPortNrAusgPhysisch != null)
				msgs = ((InternalEObject)newPortNrAusgPhysisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, null, msgs);
			msgs = basicSetPortNrAusgPhysisch(newPortNrAusgPhysisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, newPortNrAusgPhysisch, newPortNrAusgPhysisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				return basicSetIDBalise(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return basicSetLEUAusgangNr(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return basicSetPortNrAusgPhysisch(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				return getIDBalise();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return getLEUAusgangNr();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return getPortNrAusgPhysisch();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				setIDBalise((ID_Balise_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				setPortNrAusgPhysisch((Port_Nr_Ausg_Physisch_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				setIDBalise((ID_Balise_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				setPortNrAusgPhysisch((Port_Nr_Ausg_Physisch_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				return iDBalise != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return lEUAusgangNr != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return portNrAusgPhysisch != null;
		}
		return super.eIsSet(featureID);
	}

} //LEU_Modul_Ausgang_AttributeGroupImpl
