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
 * A representation of the model object '<em><b>FT Fahrweg Teil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getFWTeilNummer <em>FW Teil Nummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getUmfahrstrasse <em>Umfahrstrasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getZielIstFahrwegende <em>Ziel Ist Fahrwegende</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFT_Fahrweg_Teil_Allg' kind='elementOnly'"
 * @generated
 */
public interface FT_Fahrweg_Teil_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FW Teil Nummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummerierung des Fahrwegteils, wenn mehrere Fahrwegteile mit gleichem Start-Element existieren. Das Datum wird für die Reihenfolge des Erscheinens in der Tabelle verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FW Teil Nummer</em>' containment reference.
	 * @see #setFWTeilNummer(FW_Teil_Nummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_Allg_AttributeGroup_FWTeilNummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FW_Teil_Nummer'"
	 * @generated
	 */
	FW_Teil_Nummer_TypeClass getFWTeilNummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getFWTeilNummer <em>FW Teil Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FW Teil Nummer</em>' containment reference.
	 * @see #getFWTeilNummer()
	 * @generated
	 */
	void setFWTeilNummer(FW_Teil_Nummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Umfahrstrasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der beschriebene Fahrwegteil liegt in einer Umfahrstraße.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umfahrstrasse</em>' containment reference.
	 * @see #setUmfahrstrasse(Umfahrstrasse_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_Allg_AttributeGroup_Umfahrstrasse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Umfahrstrasse'"
	 * @generated
	 */
	Umfahrstrasse_TypeClass getUmfahrstrasse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getUmfahrstrasse <em>Umfahrstrasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umfahrstrasse</em>' containment reference.
	 * @see #getUmfahrstrasse()
	 * @generated
	 */
	void setUmfahrstrasse(Umfahrstrasse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ziel Ist Fahrwegende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das verlinkte Zielelement des Fahrwegteils gleichzeitig auch Ende des Fahrwegs ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ziel Ist Fahrwegende</em>' containment reference.
	 * @see #setZielIstFahrwegende(Ziel_Ist_Fahrwegende_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_Allg_AttributeGroup_ZielIstFahrwegende()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ziel_Ist_Fahrwegende'"
	 * @generated
	 */
	Ziel_Ist_Fahrwegende_TypeClass getZielIstFahrwegende();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup#getZielIstFahrwegende <em>Ziel Ist Fahrwegende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel Ist Fahrwegende</em>' containment reference.
	 * @see #getZielIstFahrwegende()
	 * @generated
	 */
	void setZielIstFahrwegende(Ziel_Ist_Fahrwegende_TypeClass value);

} // FT_Fahrweg_Teil_Allg_AttributeGroup
