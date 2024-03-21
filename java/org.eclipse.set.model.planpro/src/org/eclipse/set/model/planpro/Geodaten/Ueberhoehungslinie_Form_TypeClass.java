/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ueberhoehungslinie Form Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie_Form_TypeClass()
 * @model extendedMetaData="name='TCUeberhoehungslinie_Form' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehungslinie_Form_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMUeberhoehungslinieForm)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getUeberhoehungslinie_Form_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.Geodaten.ENUMUeberhoehungslinieFormObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMUeberhoehungslinieForm getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMUeberhoehungslinieForm value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMUeberhoehungslinieForm)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie_Form_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMUeberhoehungslinieForm)
	 * @generated
	 */
	boolean isSetWert();

} // Ueberhoehungslinie_Form_TypeClass
