/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Anlage Uebertragung FMinfo Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getIDUebertragungFMinfo <em>ID Uebertragung FMinfo</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoRichtung <em>Uebertragung FMinfo Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoTyp <em>Uebertragung FMinfo Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Anlage_Uebertragung_FMinfo' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage_Uebertragung_FMinfo_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Uebertragung FMinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine benachbarte Aussenelementansteuerung, mit der die Freimeldeinformation dieser FMA Anlage ausgetauscht wird. Voraussetzung für die Verwendung dieses Zeigers ist, dass die Freimeldeinformation in zwei Außenelementansteuerungen verwertet wird, die unterschiedlichen Unterbringungen zugeordnet sind, weshalb eine Datenübertragung erfolgen muss. Der Zeiger wird ergänzt mit den Attributen Uebertragung FMinfo Richtung und Uebertragung FMinfo Typ. DB-Regelwerk Attribut ist im bisherigen PT 1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Uebertragung FMinfo</em>' containment reference.
	 * @see #setIDUebertragungFMinfo(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Uebertragung_FMinfo'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDUebertragungFMinfo();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getIDUebertragungFMinfo <em>ID Uebertragung FMinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Uebertragung FMinfo</em>' containment reference.
	 * @see #getIDUebertragungFMinfo()
	 * @generated
	 */
	void setIDUebertragungFMinfo(ID_Aussenelementansteuerung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Uebertragung FMinfo Richtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Richtung des Informationsflusses mit einer benachbarten Außenelementansteuerung. Ist nur in Verbindung mit ID Uebertragung FMinfo erforderlich. Wertzuordnung: gehend: Freimeldeabschnitt übergibt Information an andere Außenelementansteuerung, kommend: Freimeldeabschnitt erhält Information von anderer Außenelementansteuerung. DB-Regelwerk Ist im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uebertragung FMinfo Richtung</em>' containment reference.
	 * @see #setUebertragungFMinfoRichtung(Uebertragung_FMinfo_Richtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Uebertragung_FMinfo_Richtung'"
	 * @generated
	 */
	Uebertragung_FMinfo_Richtung_TypeClass getUebertragungFMinfoRichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoRichtung <em>Uebertragung FMinfo Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uebertragung FMinfo Richtung</em>' containment reference.
	 * @see #getUebertragungFMinfoRichtung()
	 * @generated
	 */
	void setUebertragungFMinfoRichtung(Uebertragung_FMinfo_Richtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Uebertragung FMinfo Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnet das technische System der Informationsübertragung. Ist nur in Verbindung mit ID Uebertragung FMinfo erforderlich. Beispiele: EF 180, FMX 2, Simis DTS, TF 460, Vital 21. DB-Regelwerk Ist im bisherigen PT 1 ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uebertragung FMinfo Typ</em>' containment reference.
	 * @see #setUebertragungFMinfoTyp(Uebertragung_FMinfo_Typ_TypeClass)
	 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage#getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Uebertragung_FMinfo_Typ'"
	 * @generated
	 */
	Uebertragung_FMinfo_Typ_TypeClass getUebertragungFMinfoTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup#getUebertragungFMinfoTyp <em>Uebertragung FMinfo Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uebertragung FMinfo Typ</em>' containment reference.
	 * @see #getUebertragungFMinfoTyp()
	 * @generated
	 */
	void setUebertragungFMinfoTyp(Uebertragung_FMinfo_Typ_TypeClass value);

} // FMA_Anlage_Uebertragung_FMinfo_AttributeGroup
