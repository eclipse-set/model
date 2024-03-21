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
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup#getBezZUBBereichsgrenze <em>Bez ZUB Bereichsgrenze</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez ZUB Bereichsgrenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Bereichsgrenze (Ein-/Ausstiegspunkt), z. B. \"Einstieg in Richtung Gleise 7-14\". Die Angabe ist bei Ein-/Ausstieg L2 Pflicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez ZUB Bereichsgrenze</em>' containment reference.
	 * @see #setBezZUBBereichsgrenze(Bez_ZUB_Bereichsgrenze_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup_BezZUBBereichsgrenze()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_ZUB_Bereichsgrenze'"
	 * @generated
	 */
	Bez_ZUB_Bereichsgrenze_TypeClass getBezZUBBereichsgrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup#getBezZUBBereichsgrenze <em>Bez ZUB Bereichsgrenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez ZUB Bereichsgrenze</em>' containment reference.
	 * @see #getBezZUBBereichsgrenze()
	 * @generated
	 */
	void setBezZUBBereichsgrenze(Bez_ZUB_Bereichsgrenze_TypeClass value);

} // ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup
