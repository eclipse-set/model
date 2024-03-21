/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Anzeige Element Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup#getBezBedAnzeigeElement <em>Bez Bed Anzeige Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Anzeige_Element_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Anzeige_Element_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Bed Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschriftung des Melders, der Taste oder des Schalters auf der Bedien Einrichtung Oertlich (Bezeichnungsschild).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Bed Anzeige Element</em>' containment reference.
	 * @see #setBezBedAnzeigeElement(Bez_Bed_Anzeige_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Bezeichnung_AttributeGroup_BezBedAnzeigeElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Bed_Anzeige_Element'"
	 * @generated
	 */
	Bez_Bed_Anzeige_Element_TypeClass getBezBedAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup#getBezBedAnzeigeElement <em>Bez Bed Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Bed Anzeige Element</em>' containment reference.
	 * @see #getBezBedAnzeigeElement()
	 * @generated
	 */
	void setBezBedAnzeigeElement(Bez_Bed_Anzeige_Element_TypeClass value);

} // Bedien_Anzeige_Element_Bezeichnung_AttributeGroup
