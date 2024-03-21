/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz WGsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage <em>Fla WLage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_W_Gsp' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_W_Gsp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fla WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der Flankenschutz bietenden Weiche. DB-Regelwerk Flankenschutztabelle, Spalte 3 \"Weiche Gs\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla WLage</em>' containment reference.
	 * @see #setFlaWLage(Fla_W_Lage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_W_Lage'"
	 * @generated
	 */
	Fla_W_Lage_TypeClass getFlaWLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage <em>Fla WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla WLage</em>' containment reference.
	 * @see #getFlaWLage()
	 * @generated
	 */
	void setFlaWLage(Fla_W_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla WGsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutz bietende Weiche oder Gleissperre. DB-Regelwerk Flankenschutztabelle, Spalte 3 \"Weiche Gs\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla WGsp Element</em>' containment reference.
	 * @see #setIDFlaWGspElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_W_Gsp_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDFlaWGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla WGsp Element</em>' containment reference.
	 * @see #getIDFlaWGspElement()
	 * @generated
	 */
	void setIDFlaWGspElement(ID_W_Kr_Gsp_Element_TypeClass value);

} // Fla_Schutz_W_Gsp_AttributeGroup
