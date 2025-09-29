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

import org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Bezug Funktional Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getDPBezugFunktionalArt <em>DP Bezug Funktional Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup()
 * @model extendedMetaData="name='CDP_Bezug_Funktional' kind='elementOnly'"
 * @generated
 */
public interface DP_Bezug_Funktional_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Bezug Funktional Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei ZBS: Angabe, ob die Zuordnung zum Signal mittelbar (z. B. Aufwerte-Datenpunkte) oder unmittelbar (z. B. Hauptsignal-DP) erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Bezug Funktional Art</em>' containment reference.
	 * @see #setDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup_DPBezugFunktionalArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Funktional_Art'"
	 * @generated
	 */
	DP_Bezug_Funktional_Art_TypeClass getDPBezugFunktionalArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getDPBezugFunktionalArt <em>DP Bezug Funktional Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Funktional Art</em>' containment reference.
	 * @see #getDPBezugFunktionalArt()
	 * @generated
	 */
	void setDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDDP Bezug Funktional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element, auf das sich der fachliche Inhalt des Datenpunkts bezieht. Der fachliche Bezug kann Vorgaben für die Positionierung des Datenpunkts beinhalten. Die Angabe ist nur erforderlich, sofern sich dieser Punkt nicht über eine zugehörige LEU-Anlage ermittelt werden kann bzw. soll. Große Metallteile werden über ZUB_Streckeneigenschaft abgebildet. Bei ETCS L2 erfolgt die Angabe des Bezugspunkts im Zuammenhang mit dem DP-Typ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Bezug Funktional</em>' containment reference.
	 * @see #setIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup_IDDPBezugFunktional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Bezug_Funktional'"
	 * @generated
	 */
	ID_DP_Bezug_Funktional_TypeClass getIDDPBezugFunktional();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Bezug Funktional</em>' containment reference.
	 * @see #getIDDPBezugFunktional()
	 * @generated
	 */
	void setIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass value);

} // DP_Bezug_Funktional_AttributeGroup
