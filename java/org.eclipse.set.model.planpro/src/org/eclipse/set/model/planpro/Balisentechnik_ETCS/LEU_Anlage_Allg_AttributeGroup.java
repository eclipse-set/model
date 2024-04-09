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
 * A representation of the model object '<em><b>LEU Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup#getLeistungsbedarf <em>Leistungsbedarf</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup#getLEUAnlageArt <em>LEU Anlage Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Leistungsbedarf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximaler Leistungsbedarf der LEU-Anlage. Der Leistungsbedarf soll (ggf. durch das Planungswerkzeug) über LEU_Anlage_Art und die Anzahl der zugehörigen Datenpunkte bestimmt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leistungsbedarf</em>' containment reference.
	 * @see #setLeistungsbedarf(Leistungsbedarf_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Allg_AttributeGroup_Leistungsbedarf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Leistungsbedarf'"
	 * @generated
	 */
	Leistungsbedarf_TypeClass getLeistungsbedarf();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup#getLeistungsbedarf <em>Leistungsbedarf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leistungsbedarf</em>' containment reference.
	 * @see #getLeistungsbedarf()
	 * @generated
	 */
	void setLeistungsbedarf(Leistungsbedarf_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Anlage Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der in der LEU-Anlage enthaltenen LEU-Module (Voll-LEU, LEU-P). Die dazugehörigen LEU-Module werden üblicherweise erst im PT 2 festgelegt. Pflichtangabe bei ESG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Anlage Art</em>' containment reference.
	 * @see #setLEUAnlageArt(LEU_Anlage_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Allg_AttributeGroup_LEUAnlageArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Anlage_Art'"
	 * @generated
	 */
	LEU_Anlage_Art_TypeClass getLEUAnlageArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup#getLEUAnlageArt <em>LEU Anlage Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Anlage Art</em>' containment reference.
	 * @see #getLEUAnlageArt()
	 * @generated
	 */
	void setLEUAnlageArt(LEU_Anlage_Art_TypeClass value);

} // LEU_Anlage_Allg_AttributeGroup
