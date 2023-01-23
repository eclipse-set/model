/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Handschalt_Wirkfunktion_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Bedien Anz Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Bedien_Anz_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Bedien_Anz_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BUE Handschalteinrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Handschalteinrichtungen des technisch gesicherten BÜ, die direkt auf die BÜ-Ein-/Ausschaltung wirken. AT: Ausschalttaste; ET: Einschalttaste; HAT: Hilfsausschalttaste; HET: Hilfseinschalttaste; RS: Rangierschalter; RT_ein_aus: 1. Tastendruck=EIN, 2. Tastendruck=AUS; RT_ein_RT_aus: jeweils ein Taster für EIN und AUS; UT: Unwirksamkeitstaste. AT, ET, HET und UT können gleisbezogen angeordnet werden; HAT, RS und RT (beide Ausführungen) wirken auf die gesamte BÜ-Anlage. DB-Regelwerk 819.1204 8 TM 2012.001 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Handschalteinrichtung</em>' containment reference.
	 * @see #setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_BUEHandschalteinrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Handschalteinrichtung'"
	 * @generated
	 */
	BUE_Handschalteinrichtung_TypeClass getBUEHandschalteinrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Handschalteinrichtung</em>' containment reference.
	 * @see #getBUEHandschalteinrichtung()
	 * @generated
	 */
	void setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Anzeige Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bedien Anzeige Element, welches die Zuordnung zur Bedien Einrichtung Oertlich und damit zur physischen Unterbringung der Tasten herstellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Anzeige Element</em>' containment reference.
	 * @see #setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDBedienAnzeigeElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Anzeige_Element'"
	 * @generated
	 */
	ID_Bedien_Anzeige_Element_TypeClass getIDBedienAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Anzeige Element</em>' containment reference.
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 */
	void setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Handschalt Wirkfunktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BUE Anlage (bei BÜ-bezogenen Funktionen) bzw. auf die zugehörige BUE Einschaltung / BUE Ausschaltung (bei gleisbezogenen Funktionen). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Handschalt Wirkfunktion</em>' containment reference.
	 * @see #setIDHandschaltWirkfunktion(ID_Handschalt_Wirkfunktion_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDHandschaltWirkfunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Handschalt_Wirkfunktion'"
	 * @generated
	 */
	ID_Handschalt_Wirkfunktion_TypeClass getIDHandschaltWirkfunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Handschalt Wirkfunktion</em>' containment reference.
	 * @see #getIDHandschaltWirkfunktion()
	 * @generated
	 */
	void setIDHandschaltWirkfunktion(ID_Handschalt_Wirkfunktion_TypeClass value);

} // BUE_Bedien_Anz_Element_Allg_AttributeGroup
