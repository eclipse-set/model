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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bgrenze RBC Wechsel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getBgrenzeRBCWechselBTSKette <em>Bgrenze RBC Wechsel BTS Kette</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bgrenze_RBC_Wechsel' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bgrenze_RBC_Wechsel_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze RBC Wechsel BTS Kette</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den drei angrenzenden GSM-R-Sendemasten (BTS). Die Angabe erfolgt für jede Fahrtrichtung und Fahrtmöglichkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bgrenze RBC Wechsel BTS Kette</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_BgrenzeRBCWechselBTSKette()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_RBC_Wechsel_BTS_Kette'"
	 * @generated
	 */
	EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> getBgrenzeRBCWechselBTSKette();

	/**
	 * Returns the value of the '<em><b>IDRBC Nach Grenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das nach der Bereichsgrenze zuständige RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC Nach Grenze</em>' containment reference.
	 * @see #setIDRBCNachGrenze(ID_RBC_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_IDRBCNachGrenze()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC_Nach_Grenze'"
	 * @generated
	 */
	ID_RBC_TypeClass getIDRBCNachGrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDRBC Nach Grenze</em>' containment reference.
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 */
	void setIDRBCNachGrenze(ID_RBC_TypeClass value);

} // ZUB_Bgrenze_RBC_Wechsel_AttributeGroup
