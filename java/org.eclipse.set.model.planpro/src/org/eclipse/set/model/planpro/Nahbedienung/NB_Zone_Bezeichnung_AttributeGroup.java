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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup#getBezeichnungNBZone <em>Bezeichnung NB Zone</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Zone_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CNB_Zone_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung NB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerische Ordnungsnummer der NB_Zone innerhalb des Nahstellbereiches. Aus der Bezeichnung des NB und diesem Attribut wird die Angabe gemäß Ril 819.9001 (z. B. 99NB1/2 bzw. 99NB12) zusammengesetzt - auf dem Lageplan getrennt durch einen Schrägstrich. DB-Regelwerk 819.9001 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung NB Zone</em>' containment reference.
	 * @see #setBezeichnungNBZone(Bezeichnung_NB_Zone_TypeClass)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_NB_Zone'"
	 * @generated
	 */
	Bezeichnung_NB_Zone_TypeClass getBezeichnungNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup#getBezeichnungNBZone <em>Bezeichnung NB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung NB Zone</em>' containment reference.
	 * @see #getBezeichnungNBZone()
	 * @generated
	 */
	void setBezeichnungNBZone(Bezeichnung_NB_Zone_TypeClass value);

} // NB_Zone_Bezeichnung_AttributeGroup
