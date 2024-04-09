/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fue Schaltfall Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getFue_Schaltfall_TypeClass()
 * @model extendedMetaData="name='TCFue_Schaltfall' kind='elementOnly'"
 * @generated
 */
public interface Fue_Schaltfall_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMFueSchaltfall)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getFue_Schaltfall_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.Bahnuebergang.ENUMFueSchaltfallObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMFueSchaltfall getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMFueSchaltfall value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFueSchaltfall)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFueSchaltfall)
	 * @generated
	 */
	boolean isSetWert();

} // Fue_Schaltfall_TypeClass
