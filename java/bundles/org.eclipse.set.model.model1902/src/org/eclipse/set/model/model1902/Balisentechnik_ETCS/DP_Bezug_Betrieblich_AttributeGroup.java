/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_DP_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Bezug Betrieblich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup()
 * @model extendedMetaData="name='CDP_Bezug_Betrieblich' kind='elementOnly'"
 * @generated
 */
public interface DP_Bezug_Betrieblich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Bezug Betrieblich Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Zuordnung zum Signal mittelbar (z. B. Aufwerte-Datenpunkte) oder unmittelbar (z. B. Hauptsignal-DP) erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Bezug Betrieblich Art</em>' containment reference.
	 * @see #setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup_DPBezugBetrieblichArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Betrieblich_Art'"
	 * @generated
	 */
	DP_Bezug_Betrieblich_Art_TypeClass getDPBezugBetrieblichArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Betrieblich Art</em>' containment reference.
	 * @see #getDPBezugBetrieblichArt()
	 * @generated
	 */
	void setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDDP Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezugspunkt, auf den sich der Datenpunkt bezieht. Die Angabe ist nur erforderlich, sofern der Bezugspunkt nicht über eine zugehörige LEU-Anlage ermittelt werden kann bzw. soll. Große Metallteile werden über ZUB_Streckeneigenschaft abgebildet.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Bezugspunkt</em>' containment reference.
	 * @see #setIDDPBezugspunkt(ID_DP_Bezugspunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup_IDDPBezugspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Bezugspunkt'"
	 * @generated
	 */
	ID_DP_Bezugspunkt_TypeClass getIDDPBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Bezugspunkt</em>' containment reference.
	 * @see #getIDDPBezugspunkt()
	 * @generated
	 */
	void setIDDPBezugspunkt(ID_DP_Bezugspunkt_TypeClass value);

} // DP_Bezug_Betrieblich_AttributeGroup
