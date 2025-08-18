/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.Element_Position;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Pro Layoutinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getBearbeitungsvermerk <em>Bearbeitungsvermerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getElementPosition <em>Element Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getElementStil <em>Element Stil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getLageplan <em>Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getLageplanBlattschnitt <em>Lageplan Blattschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.PlanPro_LayoutinfoImpl#getLageplanZustand <em>Lageplan Zustand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanPro_LayoutinfoImpl extends Ur_ObjektImpl implements PlanPro_Layoutinfo {
	/**
	 * The cached value of the '{@link #getBearbeitungsvermerk() <em>Bearbeitungsvermerk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bearbeitungsvermerk> bearbeitungsvermerk;

	/**
	 * The cached value of the '{@link #getElementPosition() <em>Element Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Element_Position> elementPosition;

	/**
	 * The cached value of the '{@link #getElementStil() <em>Element Stil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStil()
	 * @generated
	 * @ordered
	 */
	protected EList<Element_Stil> elementStil;

	/**
	 * The cached value of the '{@link #getLageplan() <em>Lageplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLageplan()
	 * @generated
	 * @ordered
	 */
	protected EList<Lageplan> lageplan;

	/**
	 * The cached value of the '{@link #getLageplanBlattschnitt() <em>Lageplan Blattschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLageplanBlattschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<Lageplan_Blattschnitt> lageplanBlattschnitt;

	/**
	 * The cached value of the '{@link #getLageplanZustand() <em>Lageplan Zustand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLageplanZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Lageplan_Zustand> lageplanZustand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanPro_LayoutinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.PLAN_PRO_LAYOUTINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bearbeitungsvermerk> getBearbeitungsvermerk() {
		if (bearbeitungsvermerk == null) {
			bearbeitungsvermerk = new EObjectContainmentEList<Bearbeitungsvermerk>(Bearbeitungsvermerk.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK);
		}
		return bearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element_Position> getElementPosition() {
		if (elementPosition == null) {
			elementPosition = new EObjectContainmentEList<Element_Position>(Element_Position.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION);
		}
		return elementPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element_Stil> getElementStil() {
		if (elementStil == null) {
			elementStil = new EObjectContainmentEList<Element_Stil>(Element_Stil.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL);
		}
		return elementStil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lageplan> getLageplan() {
		if (lageplan == null) {
			lageplan = new EObjectContainmentEList<Lageplan>(Lageplan.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN);
		}
		return lageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lageplan_Blattschnitt> getLageplanBlattschnitt() {
		if (lageplanBlattschnitt == null) {
			lageplanBlattschnitt = new EObjectContainmentEList<Lageplan_Blattschnitt>(Lageplan_Blattschnitt.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT);
		}
		return lageplanBlattschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lageplan_Zustand> getLageplanZustand() {
		if (lageplanZustand == null) {
			lageplanZustand = new EObjectContainmentEList<Lageplan_Zustand>(Lageplan_Zustand.class, this, LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND);
		}
		return lageplanZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK:
				return ((InternalEList<?>)getBearbeitungsvermerk()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
				return ((InternalEList<?>)getElementPosition()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
				return ((InternalEList<?>)getElementStil()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
				return ((InternalEList<?>)getLageplan()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
				return ((InternalEList<?>)getLageplanBlattschnitt()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
				return ((InternalEList<?>)getLageplanZustand()).basicRemove(otherEnd, msgs);
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
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK:
				return getBearbeitungsvermerk();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
				return getElementPosition();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
				return getElementStil();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
				return getLageplan();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
				return getLageplanBlattschnitt();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
				return getLageplanZustand();
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
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK:
				getBearbeitungsvermerk().clear();
				getBearbeitungsvermerk().addAll((Collection<? extends Bearbeitungsvermerk>)newValue);
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
				getElementPosition().clear();
				getElementPosition().addAll((Collection<? extends Element_Position>)newValue);
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
				getElementStil().clear();
				getElementStil().addAll((Collection<? extends Element_Stil>)newValue);
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
				getLageplan().clear();
				getLageplan().addAll((Collection<? extends Lageplan>)newValue);
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
				getLageplanBlattschnitt().clear();
				getLageplanBlattschnitt().addAll((Collection<? extends Lageplan_Blattschnitt>)newValue);
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
				getLageplanZustand().clear();
				getLageplanZustand().addAll((Collection<? extends Lageplan_Zustand>)newValue);
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
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK:
				getBearbeitungsvermerk().clear();
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
				getElementPosition().clear();
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
				getElementStil().clear();
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
				getLageplan().clear();
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
				getLageplanBlattschnitt().clear();
				return;
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
				getLageplanZustand().clear();
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
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__BEARBEITUNGSVERMERK:
				return bearbeitungsvermerk != null && !bearbeitungsvermerk.isEmpty();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION:
				return elementPosition != null && !elementPosition.isEmpty();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__ELEMENT_STIL:
				return elementStil != null && !elementStil.isEmpty();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN:
				return lageplan != null && !lageplan.isEmpty();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT:
				return lageplanBlattschnitt != null && !lageplanBlattschnitt.isEmpty();
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND:
				return lageplanZustand != null && !lageplanZustand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanPro_LayoutinfoImpl
