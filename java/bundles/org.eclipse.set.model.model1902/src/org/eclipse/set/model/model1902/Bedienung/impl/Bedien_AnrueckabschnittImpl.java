/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Gleis_Abschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anrueckabschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_AnrueckabschnittImpl#getIDGleisAbschnittPosition <em>ID Gleis Abschnitt Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_AnrueckabschnittImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_AnrueckabschnittImpl#getIDGleisAbschnittDarstellen <em>ID Gleis Abschnitt Darstellen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_AnrueckabschnittImpl extends Basis_ObjektImpl implements Bedien_Anrueckabschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnittPosition() <em>ID Gleis Abschnitt Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnittPosition()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Abschnitt_TypeClass iDGleisAbschnittPosition;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDGleisAbschnittDarstellen() <em>ID Gleis Abschnitt Darstellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnittDarstellen()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Abschnitt_TypeClass iDGleisAbschnittDarstellen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_AnrueckabschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANRUECKABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnittPosition() {
		return iDGleisAbschnittPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisAbschnittPosition(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnittPosition, NotificationChain msgs) {
		ID_Gleis_Abschnitt_TypeClass oldIDGleisAbschnittPosition = iDGleisAbschnittPosition;
		iDGleisAbschnittPosition = newIDGleisAbschnittPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, oldIDGleisAbschnittPosition, newIDGleisAbschnittPosition);
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
	public void setIDGleisAbschnittPosition(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnittPosition) {
		if (newIDGleisAbschnittPosition != iDGleisAbschnittPosition) {
			NotificationChain msgs = null;
			if (iDGleisAbschnittPosition != null)
				msgs = ((InternalEObject)iDGleisAbschnittPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, null, msgs);
			if (newIDGleisAbschnittPosition != null)
				msgs = ((InternalEObject)newIDGleisAbschnittPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, null, msgs);
			msgs = basicSetIDGleisAbschnittPosition(newIDGleisAbschnittPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, newIDGleisAbschnittPosition, newIDGleisAbschnittPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnittDarstellen() {
		return iDGleisAbschnittDarstellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisAbschnittDarstellen(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnittDarstellen, NotificationChain msgs) {
		ID_Gleis_Abschnitt_TypeClass oldIDGleisAbschnittDarstellen = iDGleisAbschnittDarstellen;
		iDGleisAbschnittDarstellen = newIDGleisAbschnittDarstellen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, oldIDGleisAbschnittDarstellen, newIDGleisAbschnittDarstellen);
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
	public void setIDGleisAbschnittDarstellen(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnittDarstellen) {
		if (newIDGleisAbschnittDarstellen != iDGleisAbschnittDarstellen) {
			NotificationChain msgs = null;
			if (iDGleisAbschnittDarstellen != null)
				msgs = ((InternalEObject)iDGleisAbschnittDarstellen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, null, msgs);
			if (newIDGleisAbschnittDarstellen != null)
				msgs = ((InternalEObject)newIDGleisAbschnittDarstellen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, null, msgs);
			msgs = basicSetIDGleisAbschnittDarstellen(newIDGleisAbschnittDarstellen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, newIDGleisAbschnittDarstellen, newIDGleisAbschnittDarstellen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				return basicSetIDGleisAbschnittPosition(null, msgs);
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				return basicSetIDGleisAbschnittDarstellen(null, msgs);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				return getIDGleisAbschnittPosition();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				return getIDGleisAbschnittDarstellen();
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				setIDGleisAbschnittPosition((ID_Gleis_Abschnitt_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				setIDGleisAbschnittDarstellen((ID_Gleis_Abschnitt_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				setIDGleisAbschnittPosition((ID_Gleis_Abschnitt_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				setIDGleisAbschnittDarstellen((ID_Gleis_Abschnitt_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				return iDGleisAbschnittPosition != null;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				return iDGleisAbschnittDarstellen != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_AnrueckabschnittImpl
