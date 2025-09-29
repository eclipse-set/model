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

import org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT Fahrweg Teile Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIstBefahren <em>Ist Befahren</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup()
 * @model extendedMetaData="name='CFT_Fahrweg_Teile' kind='elementOnly'"
 * @generated
 */
public interface FT_Fahrweg_Teile_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDFT Fahrweg Teil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Fahrwegteil, auf den sich das Fachtelegramm bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Fahrweg Teil</em>' containment reference.
	 * @see #setIDFTFahrwegTeil(ID_FT_Fahrweg_Teil_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup_IDFTFahrwegTeil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FT_Fahrweg_Teil'"
	 * @generated
	 */
	ID_FT_Fahrweg_Teil_TypeClass getIDFTFahrwegTeil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFT Fahrweg Teil</em>' containment reference.
	 * @see #getIDFTFahrwegTeil()
	 * @generated
	 */
	void setIDFTFahrwegTeil(ID_FT_Fahrweg_Teil_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ist Befahren</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Fahrwegteil befahren wird (true) oder nicht (false). Nicht befahrene Fahrwegteile werden auch als „nicht relevante Anteile“ des Fahrwegs bezeichnet und in der DP-Tabelle 3 außerhalb der Grundverkettung in eckigen Klammern angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ist Befahren</em>' containment reference.
	 * @see #setIstBefahren(Ist_Befahren_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup_IstBefahren()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ist_Befahren'"
	 * @generated
	 */
	Ist_Befahren_TypeClass getIstBefahren();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIstBefahren <em>Ist Befahren</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist Befahren</em>' containment reference.
	 * @see #getIstBefahren()
	 * @generated
	 */
	void setIstBefahren(Ist_Befahren_TypeClass value);

} // FT_Fahrweg_Teile_AttributeGroup
