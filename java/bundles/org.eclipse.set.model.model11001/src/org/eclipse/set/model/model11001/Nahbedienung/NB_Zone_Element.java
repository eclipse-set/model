/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_NB_Element_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der ESTW-Elemente (Signale, Weichen, Gleissperren, Schlüsselsperren) zur NB_Zone, in der sie sich befinden. Für diese Elemente sind in Abhängigkeit der vorgesehenen NB Art Eigenschaften zur Stellbarkeit und Rückgabevoraussetzung festzulegen. DB-Regelwerk Die Angaben finden sich in der Nahbedienungstabelle, Spalten 5, 8 und 9.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg <em>NB Zone Element Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element()
 * @model extendedMetaData="name='CNB_Zone_Element' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDNB Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Elementes, welches innerhalb der NB Zone angeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Element</em>' containment reference.
	 * @see #setIDNBElement(ID_NB_Element_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_IDNBElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Element'"
	 * @generated
	 */
	ID_NB_Element_TypeClass getIDNBElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Element</em>' containment reference.
	 * @see #getIDNBElement()
	 * @generated
	 */
	void setIDNBElement(ID_NB_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die NB_Zone, zu der das NB_Zone_Element gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #setIDNBZone(ID_NB_Zone_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_IDNBZone()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	ID_NB_Zone_TypeClass getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(ID_NB_Zone_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Zone Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Zone Element Allg</em>' containment reference.
	 * @see #setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_NBZoneElementAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Element_Allg'"
	 * @generated
	 */
	NB_Zone_Element_Allg_AttributeGroup getNBZoneElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg <em>NB Zone Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Zone Element Allg</em>' containment reference.
	 * @see #getNBZoneElementAllg()
	 * @generated
	 */
	void setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup value);

} // NB_Zone_Element
