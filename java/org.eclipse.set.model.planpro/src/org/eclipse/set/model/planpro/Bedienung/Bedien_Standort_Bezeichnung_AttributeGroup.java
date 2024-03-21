/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Standort Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup#getBezeichnungBSO <em>Bezeichnung BSO</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Standort_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Standort_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Standort_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung BSO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Bedien-Standorts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung BSO</em>' containment reference.
	 * @see #setBezeichnungBSO(Bezeichnung_BSO_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Standort_Bezeichnung_AttributeGroup_BezeichnungBSO()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_BSO'"
	 * @generated
	 */
	Bezeichnung_BSO_TypeClass getBezeichnungBSO();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup#getBezeichnungBSO <em>Bezeichnung BSO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung BSO</em>' containment reference.
	 * @see #getBezeichnungBSO()
	 * @generated
	 */
	void setBezeichnungBSO(Bezeichnung_BSO_TypeClass value);

} // Bedien_Standort_Bezeichnung_AttributeGroup
