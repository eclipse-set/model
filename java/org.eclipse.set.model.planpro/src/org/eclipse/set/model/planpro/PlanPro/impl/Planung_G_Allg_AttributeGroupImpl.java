/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

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

import org.eclipse.set.model.planpro.Basisobjekte.Anhang;

import org.eclipse.set.model.planpro.PlanPro.Datum_Abschluss_Gruppe_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.PlanPro_XSD_Version_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Art_Besonders_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Untergewerk_Art_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.Verantwortliche_Stelle_DB_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung GAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getAnhangBAST <em>Anhang BAST</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getDatumAbschlussGruppe <em>Datum Abschluss Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getPlanProXSDVersion <em>Plan Pro XSD Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getPlanungGArtBesonders <em>Planung GArt Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getUntergewerkArt <em>Untergewerk Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_G_Allg_AttributeGroupImpl#getVerantwortlicheStelleDB <em>Verantwortliche Stelle DB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_G_Allg_AttributeGroupImpl extends EObjectImpl implements Planung_G_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnhangBAST() <em>Anhang BAST</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangBAST()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangBAST;

	/**
	 * The cached value of the '{@link #getDatumAbschlussGruppe() <em>Datum Abschluss Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumAbschlussGruppe()
	 * @generated
	 * @ordered
	 */
	protected Datum_Abschluss_Gruppe_TypeClass datumAbschlussGruppe;

	/**
	 * The cached value of the '{@link #getPlanProXSDVersion() <em>Plan Pro XSD Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanProXSDVersion()
	 * @generated
	 * @ordered
	 */
	protected PlanPro_XSD_Version_TypeClass planProXSDVersion;

	/**
	 * The cached value of the '{@link #getPlanungGArtBesonders() <em>Planung GArt Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungGArtBesonders()
	 * @generated
	 * @ordered
	 */
	protected Planung_G_Art_Besonders_TypeClass planungGArtBesonders;

	/**
	 * The cached value of the '{@link #getUntergewerkArt() <em>Untergewerk Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntergewerkArt()
	 * @generated
	 * @ordered
	 */
	protected Untergewerk_Art_TypeClass untergewerkArt;

	/**
	 * The cached value of the '{@link #getVerantwortlicheStelleDB() <em>Verantwortliche Stelle DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerantwortlicheStelleDB()
	 * @generated
	 * @ordered
	 */
	protected Verantwortliche_Stelle_DB_TypeClass verantwortlicheStelleDB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_G_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_G_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangBAST() {
		if (anhangBAST == null) {
			anhangBAST = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST);
		}
		return anhangBAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Gruppe_TypeClass getDatumAbschlussGruppe() {
		return datumAbschlussGruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumAbschlussGruppe(Datum_Abschluss_Gruppe_TypeClass newDatumAbschlussGruppe, NotificationChain msgs) {
		Datum_Abschluss_Gruppe_TypeClass oldDatumAbschlussGruppe = datumAbschlussGruppe;
		datumAbschlussGruppe = newDatumAbschlussGruppe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE, oldDatumAbschlussGruppe, newDatumAbschlussGruppe);
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
	public void setDatumAbschlussGruppe(Datum_Abschluss_Gruppe_TypeClass newDatumAbschlussGruppe) {
		if (newDatumAbschlussGruppe != datumAbschlussGruppe) {
			NotificationChain msgs = null;
			if (datumAbschlussGruppe != null)
				msgs = ((InternalEObject)datumAbschlussGruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE, null, msgs);
			if (newDatumAbschlussGruppe != null)
				msgs = ((InternalEObject)newDatumAbschlussGruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE, null, msgs);
			msgs = basicSetDatumAbschlussGruppe(newDatumAbschlussGruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE, newDatumAbschlussGruppe, newDatumAbschlussGruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_XSD_Version_TypeClass getPlanProXSDVersion() {
		return planProXSDVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanProXSDVersion(PlanPro_XSD_Version_TypeClass newPlanProXSDVersion, NotificationChain msgs) {
		PlanPro_XSD_Version_TypeClass oldPlanProXSDVersion = planProXSDVersion;
		planProXSDVersion = newPlanProXSDVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION, oldPlanProXSDVersion, newPlanProXSDVersion);
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
	public void setPlanProXSDVersion(PlanPro_XSD_Version_TypeClass newPlanProXSDVersion) {
		if (newPlanProXSDVersion != planProXSDVersion) {
			NotificationChain msgs = null;
			if (planProXSDVersion != null)
				msgs = ((InternalEObject)planProXSDVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION, null, msgs);
			if (newPlanProXSDVersion != null)
				msgs = ((InternalEObject)newPlanProXSDVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION, null, msgs);
			msgs = basicSetPlanProXSDVersion(newPlanProXSDVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION, newPlanProXSDVersion, newPlanProXSDVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Art_Besonders_TypeClass getPlanungGArtBesonders() {
		return planungGArtBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungGArtBesonders(Planung_G_Art_Besonders_TypeClass newPlanungGArtBesonders, NotificationChain msgs) {
		Planung_G_Art_Besonders_TypeClass oldPlanungGArtBesonders = planungGArtBesonders;
		planungGArtBesonders = newPlanungGArtBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS, oldPlanungGArtBesonders, newPlanungGArtBesonders);
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
	public void setPlanungGArtBesonders(Planung_G_Art_Besonders_TypeClass newPlanungGArtBesonders) {
		if (newPlanungGArtBesonders != planungGArtBesonders) {
			NotificationChain msgs = null;
			if (planungGArtBesonders != null)
				msgs = ((InternalEObject)planungGArtBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS, null, msgs);
			if (newPlanungGArtBesonders != null)
				msgs = ((InternalEObject)newPlanungGArtBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS, null, msgs);
			msgs = basicSetPlanungGArtBesonders(newPlanungGArtBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS, newPlanungGArtBesonders, newPlanungGArtBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergewerk_Art_TypeClass getUntergewerkArt() {
		return untergewerkArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntergewerkArt(Untergewerk_Art_TypeClass newUntergewerkArt, NotificationChain msgs) {
		Untergewerk_Art_TypeClass oldUntergewerkArt = untergewerkArt;
		untergewerkArt = newUntergewerkArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART, oldUntergewerkArt, newUntergewerkArt);
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
	public void setUntergewerkArt(Untergewerk_Art_TypeClass newUntergewerkArt) {
		if (newUntergewerkArt != untergewerkArt) {
			NotificationChain msgs = null;
			if (untergewerkArt != null)
				msgs = ((InternalEObject)untergewerkArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART, null, msgs);
			if (newUntergewerkArt != null)
				msgs = ((InternalEObject)newUntergewerkArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART, null, msgs);
			msgs = basicSetUntergewerkArt(newUntergewerkArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART, newUntergewerkArt, newUntergewerkArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verantwortliche_Stelle_DB_TypeClass getVerantwortlicheStelleDB() {
		return verantwortlicheStelleDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerantwortlicheStelleDB(Verantwortliche_Stelle_DB_TypeClass newVerantwortlicheStelleDB, NotificationChain msgs) {
		Verantwortliche_Stelle_DB_TypeClass oldVerantwortlicheStelleDB = verantwortlicheStelleDB;
		verantwortlicheStelleDB = newVerantwortlicheStelleDB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB, oldVerantwortlicheStelleDB, newVerantwortlicheStelleDB);
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
	public void setVerantwortlicheStelleDB(Verantwortliche_Stelle_DB_TypeClass newVerantwortlicheStelleDB) {
		if (newVerantwortlicheStelleDB != verantwortlicheStelleDB) {
			NotificationChain msgs = null;
			if (verantwortlicheStelleDB != null)
				msgs = ((InternalEObject)verantwortlicheStelleDB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB, null, msgs);
			if (newVerantwortlicheStelleDB != null)
				msgs = ((InternalEObject)newVerantwortlicheStelleDB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB, null, msgs);
			msgs = basicSetVerantwortlicheStelleDB(newVerantwortlicheStelleDB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB, newVerantwortlicheStelleDB, newVerantwortlicheStelleDB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
				return ((InternalEList<?>)getAnhangBAST()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
				return basicSetDatumAbschlussGruppe(null, msgs);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
				return basicSetPlanProXSDVersion(null, msgs);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
				return basicSetPlanungGArtBesonders(null, msgs);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
				return basicSetUntergewerkArt(null, msgs);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
				return basicSetVerantwortlicheStelleDB(null, msgs);
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
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
				return getAnhangBAST();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
				return getDatumAbschlussGruppe();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
				return getPlanProXSDVersion();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
				return getPlanungGArtBesonders();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
				return getUntergewerkArt();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
				return getVerantwortlicheStelleDB();
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
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
				getAnhangBAST().clear();
				getAnhangBAST().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
				setDatumAbschlussGruppe((Datum_Abschluss_Gruppe_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
				setPlanProXSDVersion((PlanPro_XSD_Version_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
				setPlanungGArtBesonders((Planung_G_Art_Besonders_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
				setUntergewerkArt((Untergewerk_Art_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
				setVerantwortlicheStelleDB((Verantwortliche_Stelle_DB_TypeClass)newValue);
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
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
				getAnhangBAST().clear();
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
				setDatumAbschlussGruppe((Datum_Abschluss_Gruppe_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
				setPlanProXSDVersion((PlanPro_XSD_Version_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
				setPlanungGArtBesonders((Planung_G_Art_Besonders_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
				setUntergewerkArt((Untergewerk_Art_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
				setVerantwortlicheStelleDB((Verantwortliche_Stelle_DB_TypeClass)null);
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
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__ANHANG_BAST:
				return anhangBAST != null && !anhangBAST.isEmpty();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__DATUM_ABSCHLUSS_GRUPPE:
				return datumAbschlussGruppe != null;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLAN_PRO_XSD_VERSION:
				return planProXSDVersion != null;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__PLANUNG_GART_BESONDERS:
				return planungGArtBesonders != null;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__UNTERGEWERK_ART:
				return untergewerkArt != null;
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP__VERANTWORTLICHE_STELLE_DB:
				return verantwortlicheStelleDB != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_G_Allg_AttributeGroupImpl
