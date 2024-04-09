/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterbringung Befestigung Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Befestigung_TypeClass()
 * @model extendedMetaData="name='TCUnterbringung_Befestigung' kind='elementOnly'"
 * @generated
 */
public interface Unterbringung_Befestigung_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMUnterbringungBefestigung)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Befestigung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.Ansteuerung_Element.ENUMUnterbringungBefestigungObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMUnterbringungBefestigung getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMUnterbringungBefestigung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMUnterbringungBefestigung)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMUnterbringungBefestigung)
	 * @generated
	 */
	boolean isSetWert();

} // Unterbringung_Befestigung_TypeClass
