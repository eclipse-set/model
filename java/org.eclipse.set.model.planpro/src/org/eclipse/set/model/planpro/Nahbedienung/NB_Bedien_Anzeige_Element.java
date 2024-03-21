/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Bedienfunktionen zur Bedieneinrichtung einer oder mehrerer NB_Zonen, über die Fahrdienstleiter und örtlichen Bediener miteinander kommunizieren. Falls sich bedienbare Elemente innerhalb der NB_Zone befinden, sind diese durch eine entsprechende Bedieneinrichtung (um)stellbar, sofern eine (Um-)Stellbarkeit vorgesehen wurde. Der Umfang hängt von der gewählten NB Art ab. Weiterhin sind in der Bedieneinrichtung Elemente für die Kommunikation zwischen Fahrdienstleiter und Bediener untergebracht. In diesem Objekt wird die Logik der Bedieneinrichtung abgebildet. Falls eine Bedieneinrichtung Elemente aus mindestens zwei verschiedenen NB_Zonen enthält, ist eine Zuordnung der Bedieneinrichtung zu den betreffenden NB_Zonen erforderlich. Der Verweis auf Bedien Anzeige Element führt zur Zuordnung der physischen Unterbringung. DB-Regelwerk Für die Planung exisitert bei der DB AG kein Regelwerk. Die Angaben finden sich meist im Erläuterungsbericht zum PT1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element()
 * @model extendedMetaData="name='CNB_Bedien_Anzeige_Element' kind='elementOnly'"
 * @generated
 */
public interface NB_Bedien_Anzeige_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bedien Anzeige Element, welches die Zuordnung zur Bedien Einrichtung Oertlich und damit zur physischen Unterbringung der Tasten herstellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Anzeige Element</em>' containment reference.
	 * @see #setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Anzeige_Element'"
	 * @generated
	 */
	ID_Bedien_Anzeige_Element_TypeClass getIDBedienAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Anzeige Element</em>' containment reference.
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 */
	void setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die NB_Zone, der das geplante Bedien_Anzeige_Element zugeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #setIDNBZone(ID_NB_Zone_TypeClass)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_IDNBZone()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	ID_NB_Zone_TypeClass getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(ID_NB_Zone_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Bedien Anzeige Funktionen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Bedien Anzeige Funktionen</em>' containment reference.
	 * @see #setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Bedien_Anzeige_Funktionen'"
	 * @generated
	 */
	NB_Bedien_Anzeige_Funktionen_AttributeGroup getNBBedienAnzeigeFunktionen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Bedien Anzeige Funktionen</em>' containment reference.
	 * @see #getNBBedienAnzeigeFunktionen()
	 * @generated
	 */
	void setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup value);

} // NB_Bedien_Anzeige_Element
