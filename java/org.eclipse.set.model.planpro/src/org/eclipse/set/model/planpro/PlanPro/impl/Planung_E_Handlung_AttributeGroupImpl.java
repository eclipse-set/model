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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung EHandlung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEAbnahme <em>Planung EAbnahme</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEErstellung <em>Planung EErstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEFreigabe <em>Planung EFreigabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEGenehmigung <em>Planung EGenehmigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEGleichstellung <em>Planung EGleichstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEPruefung <em>Planung EPruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEQualitaetspruefung <em>Planung EQualitaetspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungESonstige <em>Planung ESonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_E_Handlung_AttributeGroupImpl#getPlanungEUebernahme <em>Planung EUebernahme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_E_Handlung_AttributeGroupImpl extends EObjectImpl implements Planung_E_Handlung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getPlanungEAbnahme() <em>Planung EAbnahme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEAbnahme()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEAbnahme;

	/**
	 * The cached value of the '{@link #getPlanungEErstellung() <em>Planung EErstellung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEErstellung()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEErstellung;

	/**
	 * The cached value of the '{@link #getPlanungEFreigabe() <em>Planung EFreigabe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEFreigabe()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEFreigabe;

	/**
	 * The cached value of the '{@link #getPlanungEGenehmigung() <em>Planung EGenehmigung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEGenehmigung()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEGenehmigung;

	/**
	 * The cached value of the '{@link #getPlanungEGleichstellung() <em>Planung EGleichstellung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEGleichstellung()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEGleichstellung;

	/**
	 * The cached value of the '{@link #getPlanungEPruefung() <em>Planung EPruefung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEPruefung()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEPruefung;

	/**
	 * The cached value of the '{@link #getPlanungEQualitaetspruefung() <em>Planung EQualitaetspruefung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEQualitaetspruefung()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEQualitaetspruefung;

	/**
	 * The cached value of the '{@link #getPlanungESonstige() <em>Planung ESonstige</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungESonstige()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungESonstige;

	/**
	 * The cached value of the '{@link #getPlanungEUebernahme() <em>Planung EUebernahme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEUebernahme()
	 * @generated
	 * @ordered
	 */
	protected EList<Akteur_Zuordnung> planungEUebernahme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_E_Handlung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_E_Handlung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEAbnahme() {
		if (planungEAbnahme == null) {
			planungEAbnahme = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME);
		}
		return planungEAbnahme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEErstellung() {
		if (planungEErstellung == null) {
			planungEErstellung = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG);
		}
		return planungEErstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEFreigabe() {
		if (planungEFreigabe == null) {
			planungEFreigabe = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE);
		}
		return planungEFreigabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEGenehmigung() {
		if (planungEGenehmigung == null) {
			planungEGenehmigung = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG);
		}
		return planungEGenehmigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEGleichstellung() {
		if (planungEGleichstellung == null) {
			planungEGleichstellung = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG);
		}
		return planungEGleichstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEPruefung() {
		if (planungEPruefung == null) {
			planungEPruefung = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG);
		}
		return planungEPruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEQualitaetspruefung() {
		if (planungEQualitaetspruefung == null) {
			planungEQualitaetspruefung = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG);
		}
		return planungEQualitaetspruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungESonstige() {
		if (planungESonstige == null) {
			planungESonstige = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE);
		}
		return planungESonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Akteur_Zuordnung> getPlanungEUebernahme() {
		if (planungEUebernahme == null) {
			planungEUebernahme = new EObjectContainmentEList<Akteur_Zuordnung>(Akteur_Zuordnung.class, this, PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME);
		}
		return planungEUebernahme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
				return ((InternalEList<?>)getPlanungEAbnahme()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
				return ((InternalEList<?>)getPlanungEErstellung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
				return ((InternalEList<?>)getPlanungEFreigabe()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
				return ((InternalEList<?>)getPlanungEGenehmigung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
				return ((InternalEList<?>)getPlanungEGleichstellung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
				return ((InternalEList<?>)getPlanungEPruefung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
				return ((InternalEList<?>)getPlanungEQualitaetspruefung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
				return ((InternalEList<?>)getPlanungESonstige()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
				return ((InternalEList<?>)getPlanungEUebernahme()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
				return getPlanungEAbnahme();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
				return getPlanungEErstellung();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
				return getPlanungEFreigabe();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
				return getPlanungEGenehmigung();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
				return getPlanungEGleichstellung();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
				return getPlanungEPruefung();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
				return getPlanungEQualitaetspruefung();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
				return getPlanungESonstige();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
				return getPlanungEUebernahme();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
				getPlanungEAbnahme().clear();
				getPlanungEAbnahme().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
				getPlanungEErstellung().clear();
				getPlanungEErstellung().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
				getPlanungEFreigabe().clear();
				getPlanungEFreigabe().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
				getPlanungEGenehmigung().clear();
				getPlanungEGenehmigung().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
				getPlanungEGleichstellung().clear();
				getPlanungEGleichstellung().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
				getPlanungEPruefung().clear();
				getPlanungEPruefung().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
				getPlanungEQualitaetspruefung().clear();
				getPlanungEQualitaetspruefung().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
				getPlanungESonstige().clear();
				getPlanungESonstige().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
				getPlanungEUebernahme().clear();
				getPlanungEUebernahme().addAll((Collection<? extends Akteur_Zuordnung>)newValue);
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
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
				getPlanungEAbnahme().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
				getPlanungEErstellung().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
				getPlanungEFreigabe().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
				getPlanungEGenehmigung().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
				getPlanungEGleichstellung().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
				getPlanungEPruefung().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
				getPlanungEQualitaetspruefung().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
				getPlanungESonstige().clear();
				return;
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
				getPlanungEUebernahme().clear();
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
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EABNAHME:
				return planungEAbnahme != null && !planungEAbnahme.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EERSTELLUNG:
				return planungEErstellung != null && !planungEErstellung.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EFREIGABE:
				return planungEFreigabe != null && !planungEFreigabe.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGENEHMIGUNG:
				return planungEGenehmigung != null && !planungEGenehmigung.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EGLEICHSTELLUNG:
				return planungEGleichstellung != null && !planungEGleichstellung.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EPRUEFUNG:
				return planungEPruefung != null && !planungEPruefung.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EQUALITAETSPRUEFUNG:
				return planungEQualitaetspruefung != null && !planungEQualitaetspruefung.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_ESONSTIGE:
				return planungESonstige != null && !planungESonstige.isEmpty();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP__PLANUNG_EUEBERNAHME:
				return planungEUebernahme != null && !planungEUebernahme.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Planung_E_Handlung_AttributeGroupImpl
