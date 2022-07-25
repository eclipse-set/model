/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Zuordnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Bau)Art, Umfang und Funktionen der punktförmigen Zugbeeinflussung. Unter dem PZB_Element werden sowohl einzelne Gleismagneten als auch die Geschwindigkeitsüberwachungseinrichtungen (GÜ - in der Literatur auch als Geschwindigkeitsprüfeinrichtungen - GPE bezeichnet) sowie dazugehörige Eigenschaften und Parameter zusammenfassend dargestellt. DB-Regelwerk 819.1310 8 für Gleismagnete 819.1310 9 für GÜ In der Gleismagenttabelle finden sich die Angaben in den Zeilen 16 und 17 sowie 33 bis 35 für GÜ und 29 bis 32 für Gleismagnete.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBArt <em>PZB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBElementGM <em>PZB Element GM</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBElementGUE <em>PZB Element GUE</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element()
 * @model extendedMetaData="name='CPZB_Element' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>IDPZB Element Zuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt PZB_Element_Zuordnung, zur Angabe des zugehörigen Signals. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Zuordnung</em>' containment reference.
	 * @see #setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_IDPZBElementZuordnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Zuordnung'"
	 * @generated
	 */
	ID_PZB_Element_Zuordnung_TypeClass getIDPZBElementZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Zuordnung</em>' containment reference.
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 */
	void setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>PZB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des PZB-Elementes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Art</em>' containment reference.
	 * @see #setPZBArt(PZB_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_PZBArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PZB_Art'"
	 * @generated
	 */
	PZB_Art_TypeClass getPZBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBArt <em>PZB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Art</em>' containment reference.
	 * @see #getPZBArt()
	 * @generated
	 */
	void setPZBArt(PZB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nicht zu füllen, wenn damit eine GÜ oder ein ständig wirksamer Gleismagnet abgebildet wird. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' containment reference.
	 * @see #setIDStellelement(ID_Stellelement_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_IDStellelement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	ID_Stellelement_TypeClass getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellelement</em>' containment reference.
	 * @see #getIDStellelement()
	 * @generated
	 */
	void setIDStellelement(ID_Stellelement_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_IDUnterbringung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>PZB Element GM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element GM</em>' containment reference.
	 * @see #setPZBElementGM(PZB_Element_GM_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_PZBElementGM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_GM'"
	 * @generated
	 */
	PZB_Element_GM_AttributeGroup getPZBElementGM();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBElementGM <em>PZB Element GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Element GM</em>' containment reference.
	 * @see #getPZBElementGM()
	 * @generated
	 */
	void setPZBElementGM(PZB_Element_GM_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>PZB Element GUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element GUE</em>' containment reference.
	 * @see #setPZBElementGUE(PZB_Element_GUE_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_PZBElementGUE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_GUE'"
	 * @generated
	 */
	PZB_Element_GUE_AttributeGroup getPZBElementGUE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element#getPZBElementGUE <em>PZB Element GUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Element GUE</em>' containment reference.
	 * @see #getPZBElementGUE()
	 * @generated
	 */
	void setPZBElementGUE(PZB_Element_GUE_AttributeGroup value);

} // PZB_Element
