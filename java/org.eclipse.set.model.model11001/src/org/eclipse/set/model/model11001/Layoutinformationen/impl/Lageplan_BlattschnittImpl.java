/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt;
import org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass;
import org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan Blattschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.impl.Lageplan_BlattschnittImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.impl.Lageplan_BlattschnittImpl#getPolygonzugAusrichtung <em>Polygonzug Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Layoutinformationen.impl.Lageplan_BlattschnittImpl#getPolygonzugBlattschnitt <em>Polygonzug Blattschnitt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lageplan_BlattschnittImpl extends Ur_ObjektImpl implements Lageplan_Blattschnitt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Lageplan_Blattschnitt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getPolygonzugAusrichtung() <em>Polygonzug Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonzugAusrichtung()
	 * @generated
	 * @ordered
	 */
	protected Polygonzug_Ausrichtung_TypeClass polygonzugAusrichtung;

	/**
	 * The cached value of the '{@link #getPolygonzugBlattschnitt() <em>Polygonzug Blattschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonzugBlattschnitt()
	 * @generated
	 * @ordered
	 */
	protected Polygonzug_Blattschnitt_TypeClass polygonzugBlattschnitt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_BlattschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Blattschnitt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Lageplan_Blattschnitt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Ausrichtung_TypeClass getPolygonzugAusrichtung() {
		return polygonzugAusrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonzugAusrichtung(Polygonzug_Ausrichtung_TypeClass newPolygonzugAusrichtung, NotificationChain msgs) {
		Polygonzug_Ausrichtung_TypeClass oldPolygonzugAusrichtung = polygonzugAusrichtung;
		polygonzugAusrichtung = newPolygonzugAusrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG, oldPolygonzugAusrichtung, newPolygonzugAusrichtung);
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
	public void setPolygonzugAusrichtung(Polygonzug_Ausrichtung_TypeClass newPolygonzugAusrichtung) {
		if (newPolygonzugAusrichtung != polygonzugAusrichtung) {
			NotificationChain msgs = null;
			if (polygonzugAusrichtung != null)
				msgs = ((InternalEObject)polygonzugAusrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG, null, msgs);
			if (newPolygonzugAusrichtung != null)
				msgs = ((InternalEObject)newPolygonzugAusrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG, null, msgs);
			msgs = basicSetPolygonzugAusrichtung(newPolygonzugAusrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG, newPolygonzugAusrichtung, newPolygonzugAusrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Blattschnitt_TypeClass getPolygonzugBlattschnitt() {
		return polygonzugBlattschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonzugBlattschnitt(Polygonzug_Blattschnitt_TypeClass newPolygonzugBlattschnitt, NotificationChain msgs) {
		Polygonzug_Blattschnitt_TypeClass oldPolygonzugBlattschnitt = polygonzugBlattschnitt;
		polygonzugBlattschnitt = newPolygonzugBlattschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT, oldPolygonzugBlattschnitt, newPolygonzugBlattschnitt);
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
	public void setPolygonzugBlattschnitt(Polygonzug_Blattschnitt_TypeClass newPolygonzugBlattschnitt) {
		if (newPolygonzugBlattschnitt != polygonzugBlattschnitt) {
			NotificationChain msgs = null;
			if (polygonzugBlattschnitt != null)
				msgs = ((InternalEObject)polygonzugBlattschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT, null, msgs);
			if (newPolygonzugBlattschnitt != null)
				msgs = ((InternalEObject)newPolygonzugBlattschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT, null, msgs);
			msgs = basicSetPolygonzugBlattschnitt(newPolygonzugBlattschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT, newPolygonzugBlattschnitt, newPolygonzugBlattschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
				return basicSetPolygonzugAusrichtung(null, msgs);
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
				return basicSetPolygonzugBlattschnitt(null, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
				return getBezeichnung();
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
				return getPolygonzugAusrichtung();
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
				return getPolygonzugBlattschnitt();
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
				setBezeichnung((Lageplan_Blattschnitt_Bezeichnung_AttributeGroup)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
				setPolygonzugAusrichtung((Polygonzug_Ausrichtung_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
				setPolygonzugBlattschnitt((Polygonzug_Blattschnitt_TypeClass)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
				setBezeichnung((Lageplan_Blattschnitt_Bezeichnung_AttributeGroup)null);
				return;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
				setPolygonzugAusrichtung((Polygonzug_Ausrichtung_TypeClass)null);
				return;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
				setPolygonzugBlattschnitt((Polygonzug_Blattschnitt_TypeClass)null);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG:
				return bezeichnung != null;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG:
				return polygonzugAusrichtung != null;
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT:
				return polygonzugBlattschnitt != null;
		}
		return super.eIsSet(featureID);
	}

} //Lageplan_BlattschnittImpl
