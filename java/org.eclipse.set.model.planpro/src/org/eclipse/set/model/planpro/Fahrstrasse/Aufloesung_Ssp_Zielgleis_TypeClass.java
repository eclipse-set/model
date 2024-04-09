/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufloesung Ssp Zielgleis Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getAufloesung_Ssp_Zielgleis_TypeClass()
 * @model extendedMetaData="name='TCAufloesung_Ssp_Zielgleis' kind='elementOnly'"
 * @generated
 */
public interface Aufloesung_Ssp_Zielgleis_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMAufloesungSspZielgleis)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getAufloesung_Ssp_Zielgleis_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.Fahrstrasse.ENUMAufloesungSspZielgleisObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMAufloesungSspZielgleis getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMAufloesungSspZielgleis value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAufloesungSspZielgleis)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAufloesungSspZielgleis)
	 * @generated
	 */
	boolean isSetWert();

} // Aufloesung_Ssp_Zielgleis_TypeClass
