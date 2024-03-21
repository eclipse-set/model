/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Element Anschluss Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussBezeichnung <em>FMA Anschluss Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussSpeiserichtung <em>FMA Anschluss Speiserichtung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Element_Anschluss_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Element_Anschluss' kind='elementOnly'"
 * @generated
 */
public interface FMA_Element_Anschluss_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FMA Anschluss Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Anschlusses einer Ein- / Ausspeisung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Anschluss Bezeichnung</em>' containment reference.
	 * @see #setFMAAnschlussBezeichnung(FMA_Anschluss_Bezeichnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Anschluss_Bezeichnung'"
	 * @generated
	 */
	FMA_Anschluss_Bezeichnung_TypeClass getFMAAnschlussBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussBezeichnung <em>FMA Anschluss Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anschluss Bezeichnung</em>' containment reference.
	 * @see #getFMAAnschlussBezeichnung()
	 * @generated
	 */
	void setFMAAnschlussBezeichnung(FMA_Anschluss_Bezeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Anschluss Speiserichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestimmt die Speiserichtung bei Gleisstromkreisen. DB-Regelwerk Sicherungstechnischer Lageplan, BÜ-Lageplan; Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Anschluss Speiserichtung</em>' containment reference.
	 * @see #setFMAAnschlussSpeiserichtung(FMA_Anschluss_Speiserichtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Anschluss_Speiserichtung'"
	 * @generated
	 */
	FMA_Anschluss_Speiserichtung_TypeClass getFMAAnschlussSpeiserichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Element_Anschluss_AttributeGroup#getFMAAnschlussSpeiserichtung <em>FMA Anschluss Speiserichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anschluss Speiserichtung</em>' containment reference.
	 * @see #getFMAAnschlussSpeiserichtung()
	 * @generated
	 */
	void setFMAAnschlussSpeiserichtung(FMA_Anschluss_Speiserichtung_TypeClass value);

} // FMA_Element_Anschluss_AttributeGroup
