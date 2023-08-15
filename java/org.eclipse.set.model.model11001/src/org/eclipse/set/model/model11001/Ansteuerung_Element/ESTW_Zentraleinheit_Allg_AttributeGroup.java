/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element;

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
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getBauart <em>Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup()
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
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauart'"
	 * @generated
	 */
	Bauart_TypeClass getBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getBauart <em>Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauart</em>' containment reference.
	 * @see #getBauart()
	 * @generated
	 */
	void setBauart(Bauart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

} // ESTW_Zentraleinheit_Allg_AttributeGroup
