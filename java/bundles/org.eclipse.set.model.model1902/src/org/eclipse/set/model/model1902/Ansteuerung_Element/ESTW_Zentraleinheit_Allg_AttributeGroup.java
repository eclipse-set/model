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
 * A representation of the model object '<em><b>ESTW Zentraleinheit Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getBauart <em>Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArt <em>Energieversorgung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup()
 * @model extendedMetaData="name='CESTW_Zentraleinheit_Allg' kind='elementOnly'"
 * @generated
 */
public interface ESTW_Zentraleinheit_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerbezogene Bauart der Steuerung. Das Attribut beschreibt im Gegensatz zu Aussenelementansteuerung Art bzw. Hersteller die herstellerbezogene Bauart der Steuerung. Es ist ein Rücklaufdatum der AP PT 2 und dient der Bestandsdatenverwaltung. Beispiel: Aussenelementansteuerung_Art == ESTW_A, Bauart == \"Jüdel E8001\". DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauart</em>' containment reference.
	 * @see #setBauart(Bauart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauart'"
	 * @generated
	 */
	Bauart_TypeClass getBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getBauart <em>Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauart</em>' containment reference.
	 * @see #getBauart()
	 * @generated
	 */
	void setBauart(Bauart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energieversorgung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Energieversorgung. Wird für die Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein BÜ verwendet, so kann dies in frühen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In späteren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Primaer angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art</em>' containment reference.
	 * @see #setEnergieversorgungArt(Energieversorgung_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art'"
	 * @generated
	 */
	Energieversorgung_Art_TypeClass getEnergieversorgungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArt <em>Energieversorgung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art</em>' containment reference.
	 * @see #getEnergieversorgungArt()
	 * @generated
	 */
	void setEnergieversorgungArt(Energieversorgung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energieversorgung Art Ersatz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Ersatz-Energieversorgung. Wird für die Ersatz-Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein BÜ verwendet, so kann dies in frühen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In späteren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Sekundaer angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art Ersatz</em>' containment reference.
	 * @see #setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art_Ersatz'"
	 * @generated
	 */
	Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art Ersatz</em>' containment reference.
	 * @see #getEnergieversorgungArtErsatz()
	 * @generated
	 */
	void setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energieversorgung Art Ersatz2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der zweiten Ersatz-Energieversorgung (bei DSTW: 1. Ersatz Fahrleitung, 2. Ersatz NEA).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art Ersatz2</em>' containment reference.
	 * @see #setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art_Ersatz_2'"
	 * @generated
	 */
	Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art Ersatz2</em>' containment reference.
	 * @see #getEnergieversorgungArtErsatz2()
	 * @generated
	 */
	void setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

} // ESTW_Zentraleinheit_Allg_AttributeGroup
