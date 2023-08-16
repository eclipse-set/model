/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Signal_Signalbegriff_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedingung Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup#getIDSignalbegriffWeiterer <em>ID Signalbegriff Weiterer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup#getVerwendungAlsRueckfall <em>Verwendung Als Rueckfall</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Signal_AttributeGroup()
 * @model extendedMetaData="name='CBedingung_Signal' kind='elementOnly'"
 * @generated
 */
public interface Bedingung_Signal_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Signal Signalbegriff</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Signal_Signalbegriff_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Signalbegriff, der als Bedingung für die Auswahl des Fachtelegramms angeschaltet sein muss. Das vollständige Signalbild wird durch die Angabe mehrerer Signalbegriffe zusammengesetzt. Die Abhängigkeit zum BÜ wird unabhängig von der technischen Realisierung ebenfalls über die Auswahl der zugehörigen Signalbegriffe Bü 0/Bü 1 hergestellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Signalbegriff</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Signal_AttributeGroup_IDSignalSignalbegriff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Signalbegriff'"
	 * @generated
	 */
	EList<ID_Signal_Signalbegriff_TypeClass> getIDSignalSignalbegriff();

	/**
	 * Returns the value of the '<em><b>ID Signalbegriff Weiterer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Signal_Signalbegriff_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen weiteren Signalbegriff, der für die Auswahl des Fachtelegramms angeschaltet sein muss, jedoch für dessen Inhalt nicht relevant ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signalbegriff Weiterer</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Signal_AttributeGroup_IDSignalbegriffWeiterer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signalbegriff_Weiterer'"
	 * @generated
	 */
	EList<ID_Signal_Signalbegriff_TypeClass> getIDSignalbegriffWeiterer();

	/**
	 * Returns the value of the '<em><b>Verwendung Als Rueckfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob die Signalbegriffe (bzw. das Signalbild) eine Rückfallebene der Signal-Anschaltung darstellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verwendung Als Rueckfall</em>' containment reference.
	 * @see #setVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Signal_AttributeGroup_VerwendungAlsRueckfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verwendung_Als_Rueckfall'"
	 * @generated
	 */
	Verwendung_Als_Rueckfall_TypeClass getVerwendungAlsRueckfall();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup#getVerwendungAlsRueckfall <em>Verwendung Als Rueckfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verwendung Als Rueckfall</em>' containment reference.
	 * @see #getVerwendungAlsRueckfall()
	 * @generated
	 */
	void setVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass value);

} // Bedingung_Signal_AttributeGroup
