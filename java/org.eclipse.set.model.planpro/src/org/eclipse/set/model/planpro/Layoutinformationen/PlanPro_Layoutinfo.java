/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Pro Layoutinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Oberstes Objekt der Layout-XML. Bei jeder Erzeugung einer XML-Ausgabe für eine Planung muss eine neue GUID (Identitaet) erzeugt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementPosition <em>Element Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getElementStil <em>Element Stil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplan <em>Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanBlattschnitt <em>Lageplan Blattschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo#getLageplanZustand <em>Lageplan Zustand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo()
 * @model extendedMetaData="name='CPlanPro_Layoutinfo' kind='elementOnly'"
 * @generated
 */
public interface PlanPro_Layoutinfo extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Element Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Angabe von Positionsinformationen für ein LST-Objekt bezogen auf einen Lageplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Position</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo_ElementPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Element_Position'"
	 * @generated
	 */
	EList<Element_Position> getElementPosition();

	/**
	 * Returns the value of the '<em><b>Element Stil</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Angabe von Darstellungsvorgaben (z. B. Linienart) für ein LST-Objekt bezogen auf einen Lageplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Stil</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo_ElementStil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Element_Stil'"
	 * @generated
	 */
	EList<Element_Stil> getElementStil();

	/**
	 * Returns the value of the '<em><b>Lageplan</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan, der maßstäblich oder unmaßstäblich die Lage von LST-Objekten zeigt. Beispiel: Sicherungstechnischer Lageplan. Bei Planungen wird für Start- und Zielzustand je eine Instanz von Lageplan erzeugt. Zu einem Lageplan ist mindestens ein Blattschnitt zu definieren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lageplan</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo_Lageplan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lageplan'"
	 * @generated
	 */
	EList<Lageplan> getLageplan();

	/**
	 * Returns the value of the '<em><b>Lageplan Blattschnitt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Teil des Lageplans, der auf einem Blatt dargestellt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lageplan Blattschnitt</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo_LageplanBlattschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lageplan_Blattschnitt'"
	 * @generated
	 */
	EList<Lageplan_Blattschnitt> getLageplanBlattschnitt();

	/**
	 * Returns the value of the '<em><b>Lageplan Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Abbildung der zustandsbezogenen Layoutinformationen zu einem Lageplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lageplan Zustand</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getPlanPro_Layoutinfo_LageplanZustand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lageplan_Zustand'"
	 * @generated
	 */
	EList<Lageplan_Zustand> getLageplanZustand();

} // PlanPro_Layoutinfo
