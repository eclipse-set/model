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

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Bezirk_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Unterbringung_Technik_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESTW Zentraleinheit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zentrale Komponente eines ESTW. Die ESTW-Zentraleinheit (ZE) steuert alle untergeordneten Aussenelementansteuerungen, stellt die Verbindung zu den Bedienbezirken (Notbedienplatz, Steuerbezirk/Zentralbedienung) und zu Nachbar-ESTW-Zentraleinheiten, zur Zuglenkung und zur Zugnummernmeldeanlage her. Die ZE kann ein ESTW-Z oder eine ESTW-UZ sein. Die geografische Grenze einer ZE liegt immer an einem Haupt- oder Sperrsignal (Signal_Real_Aktiv) oder einem Bedienpunkt (Signal_Fiktiv), in der Regel an einem Einfahrsignal. Die von einer Unterzentrale benötigten Adressformeln nach Richtlinie 819.0705 werden über die Verknüpfung zu Bedien Bezirk bereitgestellt. DB-Regelwerk Darstellung des ESTW-Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002, Beschreibung im Erläuterungsbericht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZEEnergieversorgung <em>ESTWZE Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit()
 * @model extendedMetaData="name='CESTW_Zentraleinheit' kind='elementOnly'"
 * @generated
 */
public interface ESTW_Zentraleinheit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ESTW_Zentraleinheit_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ESTWZE Energieversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESTWZE Energieversorgung</em>' containment reference.
	 * @see #setESTWZEEnergieversorgung(ESTW_ZE_Energieversorgung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_ESTWZEEnergieversorgung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESTW_ZE_Energieversorgung'"
	 * @generated
	 */
	ESTW_ZE_Energieversorgung_AttributeGroup getESTWZEEnergieversorgung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZEEnergieversorgung <em>ESTWZE Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESTWZE Energieversorgung</em>' containment reference.
	 * @see #getESTWZEEnergieversorgung()
	 * @generated
	 */
	void setESTWZEEnergieversorgung(ESTW_ZE_Energieversorgung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ESTW Zentraleinheit Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESTW Zentraleinheit Allg</em>' containment reference.
	 * @see #setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_ESTWZentraleinheitAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESTW_Zentraleinheit_Allg'"
	 * @generated
	 */
	ESTW_Zentraleinheit_Allg_AttributeGroup getESTWZentraleinheitAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESTW Zentraleinheit Allg</em>' containment reference.
	 * @see #getESTWZentraleinheitAllg()
	 * @generated
	 */
	void setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Namensgebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die für die ESTW-Zentraleinheit namensgebend ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Namensgebend</em>' containment reference.
	 * @see #setIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDOertlichkeitNamensgebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Namensgebend'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitNamensgebend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit Namensgebend</em>' containment reference.
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 */
	void setIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_Technik_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_Technik_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_Technik_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk Virtuell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Virtuelle bzw. vorbereitende Zuordnung der ESTW Zentraleinheit zu einem Bedien Bezirk. Der Verweis wird gefüllt, sofern ein Stellwerk (noch) nicht in ESTW-Technik realisiert ist bzw. die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist. Die Zuordnung erfolgt, um jegliche spätere Realisierungsform zu ermöglichen und auch die Kennzahlenvergabe sicher zu gestalten. Die Befüllung ist alternativ zu ID Bedien Bezirk Zentral. DB-Regelwerk Diverse Listen und Erläuterungsbericht des BZ-PT 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk Virtuell</em>' containment reference.
	 * @see #setIDBedienBezirkVirtuell(ID_Bedien_Bezirk_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDBedienBezirkVirtuell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk_Virtuell'"
	 * @generated
	 */
	ID_Bedien_Bezirk_TypeClass getIDBedienBezirkVirtuell();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk Virtuell</em>' containment reference.
	 * @see #getIDBedienBezirkVirtuell()
	 * @generated
	 */
	void setIDBedienBezirkVirtuell(ID_Bedien_Bezirk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk Zentral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Bedien Bezirk, sofern eine zentrale Bedienung in einer Bedien Zentrale, Regio-BZ oder einem sonstigen Technikstandort stattfindet. Die Befüllung ist alternativ zum Verweis ID Bedien Bezirk Virtuell. DB-Regelwerk Diverse Listen und Erläuterungsbericht des BZ-PT 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk Zentral</em>' containment reference.
	 * @see #setIDBedienBezirkZentral(ID_Bedien_Bezirk_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDBedienBezirkZentral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk_Zentral'"
	 * @generated
	 */
	ID_Bedien_Bezirk_TypeClass getIDBedienBezirkZentral();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk Zentral</em>' containment reference.
	 * @see #getIDBedienBezirkZentral()
	 * @generated
	 */
	void setIDBedienBezirkZentral(ID_Bedien_Bezirk_TypeClass value);

} // ESTW_Zentraleinheit
