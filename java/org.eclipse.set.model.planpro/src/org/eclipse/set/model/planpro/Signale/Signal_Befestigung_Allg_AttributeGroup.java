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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Befestigung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getBefestigungArt <em>Befestigung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getFundamentArt <em>Fundament Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getHoeheFundamentoberkante <em>Hoehe Fundamentoberkante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getObereLichtpunkthoehe <em>Obere Lichtpunkthoehe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Befestigung_Allg' kind='elementOnly'"
 * @generated
 */
public interface Signal_Befestigung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Befestigung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Signalbefestigung, um auch ohne Regelzeichnung die grundsätzliche Art erkennen zu können.
	 * Die Werte \"Regelanordnung_Mast_...\" bilden Regel-Signalanordnungen am Mast ab. Mit den Werten \"Regelanordnung_Sonstige_...\" wird eine sonstige Regel-Anordnung beschrieben, z. B. am Pfosten (Lf). Sofern eine Sonderkonstruktion notwendig ist, sind die Werte \"Sonderanordnung_Mast_...\" und \"Pfosten_...\" zu nutzen. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, in der Regel aus den Einträgen in der Signaltabelle 1 zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Befestigung Art</em>' containment reference.
	 * @see #setBefestigungArt(Befestigung_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_Allg_AttributeGroup_BefestigungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Befestigung_Art'"
	 * @generated
	 */
	Befestigung_Art_TypeClass getBefestigungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getBefestigungArt <em>Befestigung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befestigung Art</em>' containment reference.
	 * @see #getBefestigungArt()
	 * @generated
	 */
	void setBefestigungArt(Befestigung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fundament Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Fundament: Angabe der Fundamentart, da bei herstellerneutraler Planung noch keine Regelzeichnungsnummer bzw. kein Bild gewählt werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fundament Art</em>' containment reference.
	 * @see #setFundamentArt(Fundament_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_Allg_AttributeGroup_FundamentArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fundament_Art'"
	 * @generated
	 */
	Fundament_Art_TypeClass getFundamentArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getFundamentArt <em>Fundament Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fundament Art</em>' containment reference.
	 * @see #getFundamentArt()
	 * @generated
	 */
	void setFundamentArt(Fundament_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hoehe Fundamentoberkante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tatsächliche Höhe der Fundamentoberkante in Bezug zur Schienenoberkante (SO). Die Höhe der Fundamentoberkante ist die Differenz der absoluten Höhen von der Schienenoberkante der nichtüberhöhten Schiene an dem Punkt, der von der Senkrechten auf die Gleisachse durch den Fundamentmittelpunkt bestimmt wird und der Fundamentoberkante (ohne Signalaufbau). Bei positiven Werten befindet sich die Fundamentoberkante unterhalb der Schienenoberkante (Standardanordnung). Übliche Werte sind 100 mm und 700 mm. Das Attribut ist für Fundamente immer anzugeben, für andere Befestigungstypen ist es gegenstandslos. Die hier angegebene Höhe kann von der der Regelzeichnung abweichen, in diesem Fall gilt die Regelzeichnung nur für die anderen konstruktiven Merkmale. Die Angabe erfolgt im Modell in Meter mit drei Nachkommastellen. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, in der Regel aus den Einträgen in der Signaltabelle1, Zeilen 4-6 zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Fundamentoberkante</em>' containment reference.
	 * @see #setHoeheFundamentoberkante(Hoehe_Fundamentoberkante_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_Allg_AttributeGroup_HoeheFundamentoberkante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hoehe_Fundamentoberkante'"
	 * @generated
	 */
	Hoehe_Fundamentoberkante_TypeClass getHoeheFundamentoberkante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getHoeheFundamentoberkante <em>Hoehe Fundamentoberkante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Fundamentoberkante</em>' containment reference.
	 * @see #getHoeheFundamentoberkante()
	 * @generated
	 */
	void setHoeheFundamentoberkante(Hoehe_Fundamentoberkante_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Obere Lichtpunkthoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezugshöhe des maßgebenden Lichtpunktes über Schienenoberkante (SO). DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 3; wird jedoch im Modell in Meter (mit drei Nachkommastellen) angegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obere Lichtpunkthoehe</em>' containment reference.
	 * @see #setObereLichtpunkthoehe(Obere_Lichtpunkthoehe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_Allg_AttributeGroup_ObereLichtpunkthoehe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Obere_Lichtpunkthoehe'"
	 * @generated
	 */
	Obere_Lichtpunkthoehe_TypeClass getObereLichtpunkthoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung_Allg_AttributeGroup#getObereLichtpunkthoehe <em>Obere Lichtpunkthoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obere Lichtpunkthoehe</em>' containment reference.
	 * @see #getObereLichtpunkthoehe()
	 * @generated
	 */
	void setObereLichtpunkthoehe(Obere_Lichtpunkthoehe_TypeClass value);

} // Signal_Befestigung_Allg_AttributeGroup
