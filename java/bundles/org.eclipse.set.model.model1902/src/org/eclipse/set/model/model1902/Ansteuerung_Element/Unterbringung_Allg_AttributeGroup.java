/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterbringung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getUnterbringungArt <em>Unterbringung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getUnterbringungBefestigung <em>Unterbringung Befestigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CUnterbringung_Allg' kind='elementOnly'"
 * @generated
 */
public interface Unterbringung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Unterbringung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Unterbringung. Die Arten werden nach eingehaust und nicht eingehaust unterschieden, was z. B. für das Symbol der Schlüsselsperre von Bedeutung ist: Eingehaust (Symbol auf dem Lageplan): Schalthaus, Gebaeude. Nicht eingehaust (kein Symbol auf dem Lageplan): Antrieb Schaltkasten/-schrank, Tafel, sonstige, keine. Schaltkasten/-schrank: Zur Vereinfachung und zur Reduktion von Interpretationsspielräumen wird zwischen Schaltschrank und Schaltkasten nicht unterschieden. Antrieb: Die Elemente sind in einem Schranken- oder Weichenantrieb untergebracht. Tafel: Quaderförmiger, flacher Körper (z. B. Brett oder Blech), der lediglich zur mechanischen Aufnahme der eigenständigen Elemente (z. B. Schloss) dient. Sie ist von der Bedientafel als Bauart einer Bedien Einrichtung Oertlich zu unterscheiden. sonstige: Es ist ein Bearbeitungsvermerk anzugeben. keine: Es gibt keine Unterbringung, z. B. wenn eine Komponente direkt an der Befestigung \"Pfosten\" angebracht ist. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterbringung Art</em>' containment reference.
	 * @see #setUnterbringungArt(Unterbringung_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Allg_AttributeGroup_UnterbringungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterbringung_Art'"
	 * @generated
	 */
	Unterbringung_Art_TypeClass getUnterbringungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getUnterbringungArt <em>Unterbringung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterbringung Art</em>' containment reference.
	 * @see #getUnterbringungArt()
	 * @generated
	 */
	void setUnterbringungArt(Unterbringung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Unterbringung Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Befestigung der Unterbringung. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk anzugeben. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterbringung Befestigung</em>' containment reference.
	 * @see #setUnterbringungBefestigung(Unterbringung_Befestigung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_Allg_AttributeGroup_UnterbringungBefestigung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterbringung_Befestigung'"
	 * @generated
	 */
	Unterbringung_Befestigung_TypeClass getUnterbringungBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup#getUnterbringungBefestigung <em>Unterbringung Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterbringung Befestigung</em>' containment reference.
	 * @see #getUnterbringungBefestigung()
	 * @generated
	 */
	void setUnterbringungBefestigung(Unterbringung_Befestigung_TypeClass value);

} // Unterbringung_Allg_AttributeGroup
