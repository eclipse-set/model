/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.DWeg_Prio_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.FUEM_Auswertung_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Sichtzeit_Vorsignal_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl#getAnnaeherungsgeschwindigkeit <em>Annaeherungsgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl#getDWegPrio <em>DWeg Prio</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl#getFUEMAuswertung <em>FUEM Auswertung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Fstr_Allg_AttributeGroupImpl#getSichtzeitVorsignal <em>Sichtzeit Vorsignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Fstr_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZL_Fstr_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnnaeherungsgeschwindigkeit() <em>Annaeherungsgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnaeherungsgeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Annaeherungsgeschwindigkeit_TypeClass annaeherungsgeschwindigkeit;

	/**
	 * The cached value of the '{@link #getDWegPrio() <em>DWeg Prio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegPrio()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Prio_TypeClass dWegPrio;

	/**
	 * The cached value of the '{@link #getFUEMAuswertung() <em>FUEM Auswertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFUEMAuswertung()
	 * @generated
	 * @ordered
	 */
	protected FUEM_Auswertung_TypeClass fUEMAuswertung;

	/**
	 * The cached value of the '{@link #getSichtzeitVorsignal() <em>Sichtzeit Vorsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSichtzeitVorsignal()
	 * @generated
	 * @ordered
	 */
	protected Sichtzeit_Vorsignal_TypeClass sichtzeitVorsignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Fstr_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annaeherungsgeschwindigkeit_TypeClass getAnnaeherungsgeschwindigkeit() {
		return annaeherungsgeschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnaeherungsgeschwindigkeit(Annaeherungsgeschwindigkeit_TypeClass newAnnaeherungsgeschwindigkeit, NotificationChain msgs) {
		Annaeherungsgeschwindigkeit_TypeClass oldAnnaeherungsgeschwindigkeit = annaeherungsgeschwindigkeit;
		annaeherungsgeschwindigkeit = newAnnaeherungsgeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT, oldAnnaeherungsgeschwindigkeit, newAnnaeherungsgeschwindigkeit);
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
	public void setAnnaeherungsgeschwindigkeit(Annaeherungsgeschwindigkeit_TypeClass newAnnaeherungsgeschwindigkeit) {
		if (newAnnaeherungsgeschwindigkeit != annaeherungsgeschwindigkeit) {
			NotificationChain msgs = null;
			if (annaeherungsgeschwindigkeit != null)
				msgs = ((InternalEObject)annaeherungsgeschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT, null, msgs);
			if (newAnnaeherungsgeschwindigkeit != null)
				msgs = ((InternalEObject)newAnnaeherungsgeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT, null, msgs);
			msgs = basicSetAnnaeherungsgeschwindigkeit(newAnnaeherungsgeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT, newAnnaeherungsgeschwindigkeit, newAnnaeherungsgeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Prio_TypeClass getDWegPrio() {
		return dWegPrio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegPrio(DWeg_Prio_TypeClass newDWegPrio, NotificationChain msgs) {
		DWeg_Prio_TypeClass oldDWegPrio = dWegPrio;
		dWegPrio = newDWegPrio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO, oldDWegPrio, newDWegPrio);
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
	public void setDWegPrio(DWeg_Prio_TypeClass newDWegPrio) {
		if (newDWegPrio != dWegPrio) {
			NotificationChain msgs = null;
			if (dWegPrio != null)
				msgs = ((InternalEObject)dWegPrio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO, null, msgs);
			if (newDWegPrio != null)
				msgs = ((InternalEObject)newDWegPrio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO, null, msgs);
			msgs = basicSetDWegPrio(newDWegPrio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO, newDWegPrio, newDWegPrio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FUEM_Auswertung_TypeClass getFUEMAuswertung() {
		return fUEMAuswertung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFUEMAuswertung(FUEM_Auswertung_TypeClass newFUEMAuswertung, NotificationChain msgs) {
		FUEM_Auswertung_TypeClass oldFUEMAuswertung = fUEMAuswertung;
		fUEMAuswertung = newFUEMAuswertung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG, oldFUEMAuswertung, newFUEMAuswertung);
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
	public void setFUEMAuswertung(FUEM_Auswertung_TypeClass newFUEMAuswertung) {
		if (newFUEMAuswertung != fUEMAuswertung) {
			NotificationChain msgs = null;
			if (fUEMAuswertung != null)
				msgs = ((InternalEObject)fUEMAuswertung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG, null, msgs);
			if (newFUEMAuswertung != null)
				msgs = ((InternalEObject)newFUEMAuswertung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG, null, msgs);
			msgs = basicSetFUEMAuswertung(newFUEMAuswertung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG, newFUEMAuswertung, newFUEMAuswertung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sichtzeit_Vorsignal_TypeClass getSichtzeitVorsignal() {
		return sichtzeitVorsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSichtzeitVorsignal(Sichtzeit_Vorsignal_TypeClass newSichtzeitVorsignal, NotificationChain msgs) {
		Sichtzeit_Vorsignal_TypeClass oldSichtzeitVorsignal = sichtzeitVorsignal;
		sichtzeitVorsignal = newSichtzeitVorsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL, oldSichtzeitVorsignal, newSichtzeitVorsignal);
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
	public void setSichtzeitVorsignal(Sichtzeit_Vorsignal_TypeClass newSichtzeitVorsignal) {
		if (newSichtzeitVorsignal != sichtzeitVorsignal) {
			NotificationChain msgs = null;
			if (sichtzeitVorsignal != null)
				msgs = ((InternalEObject)sichtzeitVorsignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL, null, msgs);
			if (newSichtzeitVorsignal != null)
				msgs = ((InternalEObject)newSichtzeitVorsignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL, null, msgs);
			msgs = basicSetSichtzeitVorsignal(newSichtzeitVorsignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL, newSichtzeitVorsignal, newSichtzeitVorsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT:
				return basicSetAnnaeherungsgeschwindigkeit(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO:
				return basicSetDWegPrio(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG:
				return basicSetFUEMAuswertung(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL:
				return basicSetSichtzeitVorsignal(null, msgs);
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
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT:
				return getAnnaeherungsgeschwindigkeit();
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO:
				return getDWegPrio();
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG:
				return getFUEMAuswertung();
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL:
				return getSichtzeitVorsignal();
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
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT:
				setAnnaeherungsgeschwindigkeit((Annaeherungsgeschwindigkeit_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO:
				setDWegPrio((DWeg_Prio_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG:
				setFUEMAuswertung((FUEM_Auswertung_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL:
				setSichtzeitVorsignal((Sichtzeit_Vorsignal_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT:
				setAnnaeherungsgeschwindigkeit((Annaeherungsgeschwindigkeit_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO:
				setDWegPrio((DWeg_Prio_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG:
				setFUEMAuswertung((FUEM_Auswertung_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL:
				setSichtzeitVorsignal((Sichtzeit_Vorsignal_TypeClass)null);
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
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT:
				return annaeherungsgeschwindigkeit != null;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO:
				return dWegPrio != null;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG:
				return fUEMAuswertung != null;
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL:
				return sichtzeitVorsignal != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Fstr_Allg_AttributeGroupImpl
