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
 * A representation of the model object '<em><b>LEU Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup#getBezeichnungLEUAnlage <em>Bezeichnung LEU Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Anlage_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung LEU Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der LEU-Anlage. Im Regelfall ist die Bezeichnung des Bezugspunkts zu übernehmen (Planungsunterstützung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung LEU Anlage</em>' containment reference.
	 * @see #setBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung_AttributeGroup_BezeichnungLEUAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_LEU_Anlage'"
	 * @generated
	 */
	Bezeichnung_LEU_Anlage_TypeClass getBezeichnungLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup#getBezeichnungLEUAnlage <em>Bezeichnung LEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung LEU Anlage</em>' containment reference.
	 * @see #getBezeichnungLEUAnlage()
	 * @generated
	 */
	void setBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass value);

} // LEU_Anlage_Bezeichnung_AttributeGroup
