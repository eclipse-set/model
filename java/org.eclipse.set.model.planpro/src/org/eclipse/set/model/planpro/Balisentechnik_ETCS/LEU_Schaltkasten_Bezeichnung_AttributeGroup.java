/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Schaltkasten Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup#getNummerSchaltkasten <em>Nummer Schaltkasten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Schaltkasten_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface LEU_Schaltkasten_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Nummer Schaltkasten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des Schaltkastens, die der Bezeichnung der LEU-Anlage für die Bezeichnung des LEU-Schaltkastens angefügt wird. Wenn sich in einem LEU-Schaltkasten Module mehrerer LEU-Anlagen befinden, wird die Bezeichnung des LEU-Schaltkastens aus den Bezeichnungen gemäß vorheriger Regel für alle enthaltenen LEU-Anlagen  zusammengesetzt. 
	 * Beispiel:
	 * Bez. LEU-Anlage 1: A1
	 * Bez. LEU-Anlage 2: A2
	 * Nummer_Schaltkasten: 1
	 * Bezeichnung Schaltkasten: A1.1, A2.1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer Schaltkasten</em>' containment reference.
	 * @see #setNummerSchaltkasten(Nummer_Schaltkasten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Bezeichnung_AttributeGroup_NummerSchaltkasten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Nummer_Schaltkasten'"
	 * @generated
	 */
	Nummer_Schaltkasten_TypeClass getNummerSchaltkasten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup#getNummerSchaltkasten <em>Nummer Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Schaltkasten</em>' containment reference.
	 * @see #getNummerSchaltkasten()
	 * @generated
	 */
	void setNummerSchaltkasten(Nummer_Schaltkasten_TypeClass value);

} // LEU_Schaltkasten_Bezeichnung_AttributeGroup
