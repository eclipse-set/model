/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AEA Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup#getAussenelementansteuerungArt <em>Aussenelementansteuerung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup#getBauart <em>Bauart</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getAEA_Allg_AttributeGroup()
 * @model extendedMetaData="name='CAEA_Allg' kind='elementOnly'"
 * @generated
 */
public interface AEA_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Aussenelementansteuerung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Aussenelementansteuerung (herstellerneutral). ESTW_A: Für konventionelle ESTW-Strukturen ist die AEA in der Regel das ESTW-A (mit Ausnahme des Schaltkastens am Signal in bestimmten Fällen als Objektcontroller, siehe Aussenelementansteuerung). Objektcontroller: In neuerer ESTW-Technik wird zunehmend der Objektcontroller (auch kaskadiert) verwendet. Gleisfreimelde_Innenanlage: Einheit, die die logische Aufbereitung der Informationen der Freimeldeanlage übernimmt (z. B. Achszählrechner) und nicht direkt einem ESTW-A zugeordnet ist. Relaisstellwerk: Die AEA besteht aus einem (über die ESTW-ZE ferngesteuerten) Relaisstellwerk. virtuelle_Aussenelementansteuerung: Die virtuelle Aussenelementansteuerung wird verwendet, wenn die Struktur der Aussenelementansteuerungen (zwischen ESTW Zentraleinheit und Stellelement während der PT 1-Planung noch nicht klar ist. Eine virtuelle Aussenelementansteuerung soll den Bereich einer maßgebenden Örtlichkeit (z. B. ein Bf) umfassen. Im nicht firmenneutralen Teil der Planung (u. a. Kabelplanung) muss dann die virtuelle AEA durch die tatsächliche Struktur der AEA ersetzt werden. sonstige: Alle mit den übrigen ENUM nicht beschreibbare Arten. Ein Bearbeitungsvermerk muss angegeben werden. Siehe auch Bauart. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussenelementansteuerung Art</em>' containment reference.
	 * @see #setAussenelementansteuerungArt(Aussenelementansteuerung_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getAEA_Allg_AttributeGroup_AussenelementansteuerungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Aussenelementansteuerung_Art'"
	 * @generated
	 */
	Aussenelementansteuerung_Art_TypeClass getAussenelementansteuerungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup#getAussenelementansteuerungArt <em>Aussenelementansteuerung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussenelementansteuerung Art</em>' containment reference.
	 * @see #getAussenelementansteuerungArt()
	 * @generated
	 */
	void setAussenelementansteuerungArt(Aussenelementansteuerung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerbezogene Bauart der Steuerung. Das Attribut beschreibt im Gegensatz zu Aussenelementansteuerung Art bzw. Hersteller die herstellerbezogene Bauart der Steuerung. Es ist ein Rücklaufdatum der AP PT 2 und dient der Bestandsdatenverwaltung. Beispiel: Aussenelementansteuerung_Art == ESTW_A, Bauart == \"Jüdel E8001\". DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauart</em>' containment reference.
	 * @see #setBauart(Bauart_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage#getAEA_Allg_AttributeGroup_Bauart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauart'"
	 * @generated
	 */
	Bauart_TypeClass getBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup#getBauart <em>Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauart</em>' containment reference.
	 * @see #getBauart()
	 * @generated
	 */
	void setBauart(Bauart_TypeClass value);

} // AEA_Allg_AttributeGroup
