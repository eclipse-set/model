/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Fiktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getFiktivesSignalFunktion <em>Fiktives Signal Funktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fiktiv_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Fiktiv' kind='elementOnly'"
 * @generated
 */
public interface Signal_Fiktiv_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der automatischen Einstellung.
	 * DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung; bei realen, aktiven Signalen mittelbar aus Angaben in der Zugstraßentabelle zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #setAutoEinstellung(Auto_Einstellung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fiktiv_AttributeGroup_AutoEinstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Einstellung'"
	 * @generated
	 */
	Auto_Einstellung_TypeClass getAutoEinstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fiktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #getAutoEinstellung()
	 * @generated
	 */
	void setAutoEinstellung(Auto_Einstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fiktives Signal Funktion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Signale.Fiktives_Signal_Funktion_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Funktion (Verwendungsmöglichkeit) eines fiktiven Signals. Sollen an einem Punkt mehrere Funktionen realisiert werden, ist das Attribut mehrfach einzubinden. DB-Regelwerk Fiktive Signale sind als Start- oder Zielpunkte in den Zug- oder Rangierstraßentabellen erkennbar. Ihre Funktion ist nicht unmittelbar dargestellt, sie ergibt sich aus der Verwendung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fiktives Signal Funktion</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fiktiv_AttributeGroup_FiktivesSignalFunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fiktives_Signal_Funktion'"
	 * @generated
	 */
	EList<Fiktives_Signal_Funktion_TypeClass> getFiktivesSignalFunktion();

} // Signal_Fiktiv_AttributeGroup
