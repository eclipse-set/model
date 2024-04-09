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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug DWeg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug <em>DWeg Vorzug</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Zug_DWeg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_DWeg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DWeg Vorzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorzugs-Durchrutschweg. Der DWeg ist der Standard-Durchrutschweg, der verwendet wird, wenn in der Bedienung kein spezieller DWeg ausgewählt wird. DB-Regelwerk Durchrutschwegtabelle: Je Signal als erster eingetragener DWeg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Vorzug</em>' containment reference.
	 * @see #setDWegVorzug(DWeg_Vorzug_TypeClass)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup_DWegVorzug()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DWeg_Vorzug'"
	 * @generated
	 */
	DWeg_Vorzug_TypeClass getDWegVorzug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug <em>DWeg Vorzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Vorzug</em>' containment reference.
	 * @see #getDWegVorzug()
	 * @generated
	 */
	void setDWegVorzug(DWeg_Vorzug_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des DWeges zur Zugstraße. DB-Regelwerk Zugstraßentabelle: Nennung des D-Weges im Namen der Fahrstraße 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #setIDFstrDWeg(ID_Fstr_DWeg_TypeClass)
	 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	ID_Fstr_DWeg_TypeClass getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(ID_Fstr_DWeg_TypeClass value);

} // Fstr_Zug_DWeg_AttributeGroup
