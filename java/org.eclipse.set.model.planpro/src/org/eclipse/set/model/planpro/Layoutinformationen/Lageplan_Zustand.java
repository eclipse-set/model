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

import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Abbildung der zustandsbezogenen Layoutinformationen zu einem Lageplan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getReferenzLSTZustand <em>Referenz LST Zustand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand()
 * @model extendedMetaData="name='CLageplan_Zustand' kind='elementOnly'"
 * @generated
 */
public interface Lageplan_Zustand extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Lageplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Lageplan, zu dem der Lageplan-Zustand definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Lageplan</em>' containment reference.
	 * @see #setIDLageplan(ID_Lageplan_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand_IDLageplan()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Lageplan'"
	 * @generated
	 */
	ID_Lageplan_TypeClass getIDLageplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Lageplan</em>' containment reference.
	 * @see #getIDLageplan()
	 * @generated
	 */
	void setIDLageplan(ID_Lageplan_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Referenz LST Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GUID des LST-Zustand, der für die Erstellung des Lageplans ausgewertet wird. Werden LST-Zustände einer Planung referenziert, müssen Sie einheitlich entweder den Start- oder den Zielzustand beschreiben. Eine Mischung von Start- und Zielzuständen ist nicht zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenz LST Zustand</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand_ReferenzLSTZustand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Referenz_LST_Zustand'"
	 * @generated
	 */
	EList<Referenz_LST_Zustand_TypeClass> getReferenzLSTZustand();

} // Lageplan_Zustand
