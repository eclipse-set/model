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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup#getBezeichnungLageplan <em>Bezeichnung Lageplan</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLageplan_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Lageplan_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Lageplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Lageplans, sofern eine Differenzierung über Stellbereiche nicht möglich bzw. ausreichend ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Lageplan</em>' containment reference.
	 * @see #setBezeichnungLageplan(Bezeichnung_Lageplan_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Lageplan'"
	 * @generated
	 */
	Bezeichnung_Lageplan_TypeClass getBezeichnungLageplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup#getBezeichnungLageplan <em>Bezeichnung Lageplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Lageplan</em>' containment reference.
	 * @see #getBezeichnungLageplan()
	 * @generated
	 */
	void setBezeichnungLageplan(Bezeichnung_Lageplan_TypeClass value);

} // Lageplan_Bezeichnung_AttributeGroup
