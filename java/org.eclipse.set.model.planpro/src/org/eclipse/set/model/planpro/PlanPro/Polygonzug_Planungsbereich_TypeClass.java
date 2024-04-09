/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygonzug Planungsbereich Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Polygonzug_Planungsbereich_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPolygonzug_Planungsbereich_TypeClass()
 * @model extendedMetaData="name='TCPolygonzug_Planungsbereich' kind='elementOnly'"
 * @generated
 */
public interface Polygonzug_Planungsbereich_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPolygonzug_Planungsbereich_TypeClass_Wert()
	 * @model dataType="org.eclipse.set.model.planpro.PlanPro.Polygonzug_Planungsbereich_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Polygonzug_Planungsbereich_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // Polygonzug_Planungsbereich_TypeClass
