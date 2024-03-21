/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Anzeige Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getMelder <em>Melder</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getSchalter <em>Schalter</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getTaste <em>Taste</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Anzeige_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Anzeige_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Melder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Melders für eine örtliche Bedieneinrichtung. Anwendungsbeispiele: Melder an Abfertigungssäulen, Zustimmungseinrichtungen für den Zugleitbetrieb, Bedieneinrichtungen von (temporär) örtlich bedienten stellwerksgesteuerten Stellelementen. Für Bedieneinrichtungen von Nahstellbereichen und Bahnübergängen werden die Melder im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Melder</em>' containment reference.
	 * @see #setMelder(Melder_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Allg_AttributeGroup_Melder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Melder'"
	 * @generated
	 */
	Melder_TypeClass getMelder();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getMelder <em>Melder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Melder</em>' containment reference.
	 * @see #getMelder()
	 * @generated
	 */
	void setMelder(Melder_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schalter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Schalters für eine örtliche Bedieneinrichtung. Anwendungsbeispiele: Schalter an Abfertigungssäulen, Zustimmungseinrichtungen für den Zugleitbetrieb, Bedieneinrichtungen von (temporär) örtlich bedienten stellwerksgesteuerten Stellelementen. Für Bedieneinrichtungen von Nahstellbereichen und Bahnübergängen werden die Schalter im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schalter</em>' containment reference.
	 * @see #setSchalter(Schalter_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Allg_AttributeGroup_Schalter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schalter'"
	 * @generated
	 */
	Schalter_TypeClass getSchalter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getSchalter <em>Schalter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schalter</em>' containment reference.
	 * @see #getSchalter()
	 * @generated
	 */
	void setSchalter(Schalter_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Taste</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Taste für eine örtliche Bedieneinrichtung, außer solchen mit BÜ- und NB-Funktionen. Für Bedieneinrichtungen von Bahnübergängen und Nahstellbereichen werden die Tasten im Objekt BUE Bedien Anzeige Element bzw. NB Bedien Anzeige Element geplant. Anwendungsbeispiele: Tasten an Abfertigungssäulen, Zustimmungseinrichtungen für den Zugleitbetrieb, Bedieneinrichtungen von (temporär) örtlich bedienten stellwerksgesteuerten Stellelementen. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taste</em>' containment reference.
	 * @see #setTaste(Taste_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Allg_AttributeGroup_Taste()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Taste'"
	 * @generated
	 */
	Taste_TypeClass getTaste();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup#getTaste <em>Taste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste</em>' containment reference.
	 * @see #getTaste()
	 * @generated
	 */
	void setTaste(Taste_TypeClass value);

} // Bedien_Anzeige_Element_Allg_AttributeGroup
