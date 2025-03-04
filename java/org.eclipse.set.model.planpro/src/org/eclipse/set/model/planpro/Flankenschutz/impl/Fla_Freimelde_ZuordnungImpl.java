/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Freimelde Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Freimelde_ZuordnungImpl extends Basis_ObjektImpl implements Fla_Freimelde_Zuordnung {
	/**
	 * The cached value of the '{@link #getFlaRaumFreimeldung() <em>Fla Raum Freimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaRaumFreimeldung()
	 * @generated
	 * @ordered
	 */
	protected Fla_Raum_Freimeldung_TypeClass flaRaumFreimeldung;

	/**
	 * The cached value of the '{@link #getIDFlaSchutz() <em>ID Fla Schutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutz()
	 * @generated
	 * @ordered
	 */
	protected ID_Fla_Schutz_TypeClass iDFlaSchutz;

	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_FMA_Anlage_TypeClass iDFMAAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Freimelde_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_FREIMELDE_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Raum_Freimeldung_TypeClass getFlaRaumFreimeldung() {
		return flaRaumFreimeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass newFlaRaumFreimeldung, NotificationChain msgs) {
		Fla_Raum_Freimeldung_TypeClass oldFlaRaumFreimeldung = flaRaumFreimeldung;
		flaRaumFreimeldung = newFlaRaumFreimeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, oldFlaRaumFreimeldung, newFlaRaumFreimeldung);
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
	public void setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass newFlaRaumFreimeldung) {
		if (newFlaRaumFreimeldung != flaRaumFreimeldung) {
			NotificationChain msgs = null;
			if (flaRaumFreimeldung != null)
				msgs = ((InternalEObject)flaRaumFreimeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, null, msgs);
			if (newFlaRaumFreimeldung != null)
				msgs = ((InternalEObject)newFlaRaumFreimeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, null, msgs);
			msgs = basicSetFlaRaumFreimeldung(newFlaRaumFreimeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, newFlaRaumFreimeldung, newFlaRaumFreimeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fla_Schutz_TypeClass getIDFlaSchutz() {
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaSchutz(ID_Fla_Schutz_TypeClass newIDFlaSchutz, NotificationChain msgs) {
		ID_Fla_Schutz_TypeClass oldIDFlaSchutz = iDFlaSchutz;
		iDFlaSchutz = newIDFlaSchutz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, newIDFlaSchutz);
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
	public void setIDFlaSchutz(ID_Fla_Schutz_TypeClass newIDFlaSchutz) {
		if (newIDFlaSchutz != iDFlaSchutz) {
			NotificationChain msgs = null;
			if (iDFlaSchutz != null)
				msgs = ((InternalEObject)iDFlaSchutz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, null, msgs);
			if (newIDFlaSchutz != null)
				msgs = ((InternalEObject)newIDFlaSchutz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, null, msgs);
			msgs = basicSetIDFlaSchutz(newIDFlaSchutz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, newIDFlaSchutz, newIDFlaSchutz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Anlage_TypeClass getIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage, NotificationChain msgs) {
		ID_FMA_Anlage_TypeClass oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, oldIDFMAAnlage, newIDFMAAnlage);
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
	public void setIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage) {
		if (newIDFMAAnlage != iDFMAAnlage) {
			NotificationChain msgs = null;
			if (iDFMAAnlage != null)
				msgs = ((InternalEObject)iDFMAAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, null, msgs);
			if (newIDFMAAnlage != null)
				msgs = ((InternalEObject)newIDFMAAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, null, msgs);
			msgs = basicSetIDFMAAnlage(newIDFMAAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, newIDFMAAnlage, newIDFMAAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return basicSetFlaRaumFreimeldung(null, msgs);
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				return basicSetIDFlaSchutz(null, msgs);
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				return basicSetIDFMAAnlage(null, msgs);
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return getFlaRaumFreimeldung();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				return getIDFlaSchutz();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				return getIDFMAAnlage();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				setFlaRaumFreimeldung((Fla_Raum_Freimeldung_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((ID_Fla_Schutz_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				setFlaRaumFreimeldung((Fla_Raum_Freimeldung_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((ID_Fla_Schutz_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)null);
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return flaRaumFreimeldung != null;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				return iDFlaSchutz != null;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				return iDFMAAnlage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Freimelde_ZuordnungImpl
