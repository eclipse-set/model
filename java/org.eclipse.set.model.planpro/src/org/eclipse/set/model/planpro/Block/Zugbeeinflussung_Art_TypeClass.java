/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.model.planpro.BasisTypen.ENUMAnwendungssystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zugbeeinflussung Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getZugbeeinflussung_Art_TypeClass()
 * @model extendedMetaData="name='TCZugbeeinflussung_Art' kind='elementOnly'"
 * @generated
 */
public interface Zugbeeinflussung_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getZugbeeinflussung_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.BasisTypen.Anwendungssystem_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMAnwendungssystem getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMAnwendungssystem value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @generated
	 */
	boolean isSetWert();

} // Zugbeeinflussung_Art_TypeClass