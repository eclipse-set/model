/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Schnittstelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung der baulichen Anlage des Bahnübergangs (BÜ) einschließlich der technischen Sicherung, sofern vorhanden. Zurzeit beschränken sich die Angaben auf den im Lageplan darzustellenden Teil des BÜ. Zu einem späteren Zeitpunkt werden die spezifischen BÜ-Sicherungsanlagen wie Lichtzeichen, Andreaskreuze, Schrankenantriebe, Belag im BÜ-Bereich etc. in das Modell aufgenommen. Gleiches gilt für die Einschaltstreckenberechnung sowie die Beeinflussungsberechnung. Das Objekt wird auf den Kreuzungspunkt (in der Mitte der kreuzenden Straße) verortet; damit ergibt sich die sogenannte BÜ-Mitte gemäß Einschaltstreckenberechnung. DB-Regelwerk Für die Planung von Bahnübergängen gelten folgende Regelwerke: 815 819.12xx Die konkreten Bezüge zum Regelwerk werden in den einzelnen Attributen angegeben. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg <em>BUE Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage()
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
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_BUEAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_Allg'"
	 * @generated
	 */
	BUE_Anlage_Allg_AttributeGroup getBUEAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getBUEAnlageAllg <em>BUE Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Anlage Allg</em>' containment reference.
	 * @see #getBUEAnlageAllg()
	 * @generated
	 */
	void setBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Schnittstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schnittstelle zwischen BÜ und ESTW, die für diese BÜ-Anlage erforderlich ist. Der Verweis wird nur für technisch gesicherte Bahnübergänge mit Abhängigkeit zu einem Stellwerk befültt (Hp, Fü sowie Kombinationen aus beiden).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Schnittstelle</em>' containment reference.
	 * @see #setIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_IDBUESchnittstelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Schnittstelle'"
	 * @generated
	 */
	ID_BUE_Schnittstelle_TypeClass getIDBUESchnittstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Schnittstelle</em>' containment reference.
	 * @see #getIDBUESchnittstelle()
	 * @generated
	 */
	void setIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass value);

} // BUE_Anlage
