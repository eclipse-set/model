/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBC Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Bezeichnung_AttributeGroup#getBezeichnungRBC <em>Bezeichnung RBC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CRBC_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface RBC_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung RBC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des RBC, die sich in den meisten Fällen aus der Bezeichnung der ESTW-Zentraleinheit ableitet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung RBC</em>' containment reference.
	 * @see #setBezeichnungRBC(Bezeichnung_RBC_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_Bezeichnung_AttributeGroup_BezeichnungRBC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_RBC'"
	 * @generated
	 */
	Bezeichnung_RBC_TypeClass getBezeichnungRBC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Bezeichnung_AttributeGroup#getBezeichnungRBC <em>Bezeichnung RBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung RBC</em>' containment reference.
	 * @see #getBezeichnungRBC()
	 * @generated
	 */
	void setBezeichnungRBC(Bezeichnung_RBC_TypeClass value);

} // RBC_Bezeichnung_AttributeGroup
