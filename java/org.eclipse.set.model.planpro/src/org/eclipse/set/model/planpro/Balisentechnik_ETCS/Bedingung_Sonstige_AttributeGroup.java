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
 * A representation of the model object '<em><b>Bedingung Sonstige Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup#getAnlagenteilSonstige <em>Anlagenteil Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup#getTextBedingung <em>Text Bedingung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Sonstige_AttributeGroup()
 * @model extendedMetaData="name='CBedingung_Sonstige' kind='elementOnly'"
 * @generated
 */
public interface Bedingung_Sonstige_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anlagenteil Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung eines Elements, das die Anschaltbedingung liefert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anlagenteil Sonstige</em>' containment reference.
	 * @see #setAnlagenteilSonstige(Anlagenteil_Sonstige_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Sonstige_AttributeGroup_AnlagenteilSonstige()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anlagenteil_Sonstige'"
	 * @generated
	 */
	Anlagenteil_Sonstige_TypeClass getAnlagenteilSonstige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup#getAnlagenteilSonstige <em>Anlagenteil Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagenteil Sonstige</em>' containment reference.
	 * @see #getAnlagenteilSonstige()
	 * @generated
	 */
	void setAnlagenteilSonstige(Anlagenteil_Sonstige_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Text Bedingung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Bedingung, die für die Auswahl des Fachtelegramms erfüllt sein muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Bedingung</em>' containment reference.
	 * @see #setTextBedingung(Text_Bedingung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Sonstige_AttributeGroup_TextBedingung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Text_Bedingung'"
	 * @generated
	 */
	Text_Bedingung_TypeClass getTextBedingung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup#getTextBedingung <em>Text Bedingung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Bedingung</em>' containment reference.
	 * @see #getTextBedingung()
	 * @generated
	 */
	void setTextBedingung(Text_Bedingung_TypeClass value);

} // Bedingung_Sonstige_AttributeGroup
