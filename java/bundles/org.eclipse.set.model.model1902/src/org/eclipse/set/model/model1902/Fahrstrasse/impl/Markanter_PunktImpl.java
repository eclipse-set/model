/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Block_Element_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Markante_Stelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markanter Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Markanter_PunktImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Markanter_PunktImpl#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Markanter_PunktImpl#getIDMarkanteStelle <em>ID Markante Stelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Markanter_PunktImpl extends Basis_ObjektImpl implements Markanter_Punkt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDDWegErlaubnisabhaengig() <em>IDD Weg Erlaubnisabhaengig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @generated
	 * @ordered
	 */
	protected ID_Block_Element_TypeClass iDDWegErlaubnisabhaengig;

	/**
	 * The cached value of the '{@link #getIDMarkanteStelle() <em>ID Markante Stelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanteStelle()
	 * @generated
	 * @ordered
	 */
	protected ID_Markante_Stelle_TypeClass iDMarkanteStelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Markanter_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.MARKANTER_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Markanter_Punkt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Element_TypeClass getIDDWegErlaubnisabhaengig() {
		return iDDWegErlaubnisabhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDWegErlaubnisabhaengig(ID_Block_Element_TypeClass newIDDWegErlaubnisabhaengig, NotificationChain msgs) {
		ID_Block_Element_TypeClass oldIDDWegErlaubnisabhaengig = iDDWegErlaubnisabhaengig;
		iDDWegErlaubnisabhaengig = newIDDWegErlaubnisabhaengig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, oldIDDWegErlaubnisabhaengig, newIDDWegErlaubnisabhaengig);
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
	public void setIDDWegErlaubnisabhaengig(ID_Block_Element_TypeClass newIDDWegErlaubnisabhaengig) {
		if (newIDDWegErlaubnisabhaengig != iDDWegErlaubnisabhaengig) {
			NotificationChain msgs = null;
			if (iDDWegErlaubnisabhaengig != null)
				msgs = ((InternalEObject)iDDWegErlaubnisabhaengig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, null, msgs);
			if (newIDDWegErlaubnisabhaengig != null)
				msgs = ((InternalEObject)newIDDWegErlaubnisabhaengig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, null, msgs);
			msgs = basicSetIDDWegErlaubnisabhaengig(newIDDWegErlaubnisabhaengig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, newIDDWegErlaubnisabhaengig, newIDDWegErlaubnisabhaengig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markante_Stelle_TypeClass getIDMarkanteStelle() {
		return iDMarkanteStelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDMarkanteStelle(ID_Markante_Stelle_TypeClass newIDMarkanteStelle, NotificationChain msgs) {
		ID_Markante_Stelle_TypeClass oldIDMarkanteStelle = iDMarkanteStelle;
		iDMarkanteStelle = newIDMarkanteStelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, oldIDMarkanteStelle, newIDMarkanteStelle);
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
	public void setIDMarkanteStelle(ID_Markante_Stelle_TypeClass newIDMarkanteStelle) {
		if (newIDMarkanteStelle != iDMarkanteStelle) {
			NotificationChain msgs = null;
			if (iDMarkanteStelle != null)
				msgs = ((InternalEObject)iDMarkanteStelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, null, msgs);
			if (newIDMarkanteStelle != null)
				msgs = ((InternalEObject)newIDMarkanteStelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, null, msgs);
			msgs = basicSetIDMarkanteStelle(newIDMarkanteStelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, newIDMarkanteStelle, newIDMarkanteStelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				return basicSetIDDWegErlaubnisabhaengig(null, msgs);
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				return basicSetIDMarkanteStelle(null, msgs);
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return getBezeichnung();
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				return getIDDWegErlaubnisabhaengig();
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				return getIDMarkanteStelle();
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				setBezeichnung((Markanter_Punkt_Bezeichnung_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				setIDDWegErlaubnisabhaengig((ID_Block_Element_TypeClass)newValue);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				setIDMarkanteStelle((ID_Markante_Stelle_TypeClass)newValue);
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				setBezeichnung((Markanter_Punkt_Bezeichnung_AttributeGroup)null);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				setIDDWegErlaubnisabhaengig((ID_Block_Element_TypeClass)null);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				setIDMarkanteStelle((ID_Markante_Stelle_TypeClass)null);
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return bezeichnung != null;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				return iDDWegErlaubnisabhaengig != null;
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				return iDMarkanteStelle != null;
		}
		return super.eIsSet(featureID);
	}

} //Markanter_PunktImpl
