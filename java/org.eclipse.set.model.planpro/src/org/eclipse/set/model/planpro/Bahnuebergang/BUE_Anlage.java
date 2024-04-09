/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung der baulichen Anlage des Bahnübergangs (BÜ) einschließlich der technischen Sicherung, sofern vorhanden. Das Objekt wird auf den Kreuzungspunkt gem. Ril 815.2000 verortet, wobei die punktförmige Verortung auf alle zum BÜ gehörigen Gleisachsen erfolgen soll. Damit ergibt sich die sogenannte BÜ-Mitte gemäß Einschaltstreckenberechnung. DB-Regelwerk Für die Planung von Bahnübergängen gelten folgende Regelwerke: 815, 819.12xx. Die konkreten Bezüge zum Regelwerk werden für die einzelnen Attributen angegeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg <em>BUE Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getIDAEABUEAnschaltung <em>IDAEABUE Anschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage()
 * @model extendedMetaData="name='CBUE_Anlage' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>BUE Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Anlage Allg</em>' containment reference.
	 * @see #setBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_BUEAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_Allg'"
	 * @generated
	 */
	BUE_Anlage_Allg_AttributeGroup getBUEAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg <em>BUE Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Anlage Allg</em>' containment reference.
	 * @see #getBUEAnlageAllg()
	 * @generated
	 */
	void setBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDAEABUE Anschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Aussenelementansteuerung, von der die BÜ-Anlage gesteuert/geschaltet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDAEABUE Anschaltung</em>' containment reference.
	 * @see #setIDAEABUEAnschaltung(ID_Aussenelementansteuerung_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_IDAEABUEAnschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_AEA_BUE_Anschaltung'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_ohne_Proxy_TypeClass getIDAEABUEAnschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getIDAEABUEAnschaltung <em>IDAEABUE Anschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDAEABUE Anschaltung</em>' containment reference.
	 * @see #getIDAEABUEAnschaltung()
	 * @generated
	 */
	void setIDAEABUEAnschaltung(ID_Aussenelementansteuerung_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Schnittstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schnittstelle zwischen BÜ und ESTW, die für diese BÜ-Anlage erforderlich ist. Der Verweis wird nur für technisch gesicherte Bahnübergänge mit Abhängigkeit zu einem Stellwerk befültt (Hp, Fü sowie Kombinationen aus beiden).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Schnittstelle</em>' containment reference.
	 * @see #setIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_IDBUESchnittstelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Schnittstelle'"
	 * @generated
	 */
	ID_BUE_Schnittstelle_TypeClass getIDBUESchnittstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Schnittstelle</em>' containment reference.
	 * @see #getIDBUESchnittstelle()
	 * @generated
	 */
	void setIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass value);

} // BUE_Anlage
