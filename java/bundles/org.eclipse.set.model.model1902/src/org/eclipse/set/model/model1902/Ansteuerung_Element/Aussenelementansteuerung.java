/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Information_Primaer_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aussenelementansteuerung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technisches Objekt, von dem aus die Ansteuerung der ESTW-Elemente der Außenanlage erfolgt. Außenelementansteuerungen (AEA) können hierarchich angeordnet sein. Über dem höchsten Element der Hierarchie steht immer die ESTW Zentraleinheit. Von allen AEA können ein oder mehrere Elemente der Außenanlage angesteuert sowie deren Zustände eingelesen werden. In der Verkettung zeigt die Verweisrichtung immer auf das in der Hierarchie höhere Element. Die Übertragung von Daten und Energie wird durch getrennte Verweise modelliert. In der konventionellen ESTW-Technik entspricht die AEA dem ESTW-A. Eine Kaskadierung von AEA ist erst in neuerer ESTW-Technik üblich. Gehört ein Schaltkasten zu einem Signal, muss dieser nicht als AEA geplant werden, in dem Fall wird der Schaltkasten als Bestandteil des Signals betrachtet. Kann ein Schaltkasten mehrere Signale steuern, ist er als AEA zu betrachten. Je nach Detaillierungsgrad der Planung kann die primäre und sekundäre Energieversorgung nur in der grundsätzlichen Art oder sogar der tatsächliche Lieferant über einen Verweis auf diesen angegeben werden. Als AEA werden nur Bestandteile des ESTW modelliert. Schnittstellen zu anderen Untergewerken (z. B. PZB, BÜ, ETCS) werden über das Stellelement dargestellt. DB-Regelwerk Darstellung und Beschriftung des ESTW-Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAAllg <em>AEA Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAEnergieversorgung <em>AEA Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAGFKIPAdressblock <em>AEAGFKIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDInformationPrimaer <em>ID Information Primaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDInformationSekundaer <em>ID Information Sekundaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDOertlichkeitGesteuert <em>ID Oertlichkeit Gesteuert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung()
 * @model extendedMetaData="name='CAussenelementansteuerung' kind='elementOnly'"
 * @generated
 */
public interface Aussenelementansteuerung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>AEA Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEA Allg</em>' containment reference.
	 * @see #setAEAAllg(AEA_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_AEAAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AEA_Allg'"
	 * @generated
	 */
	AEA_Allg_AttributeGroup getAEAAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAAllg <em>AEA Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEA Allg</em>' containment reference.
	 * @see #getAEAAllg()
	 * @generated
	 */
	void setAEAAllg(AEA_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>AEA Energieversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEA Energieversorgung</em>' containment reference.
	 * @see #setAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_AEAEnergieversorgung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AEA_Energieversorgung'"
	 * @generated
	 */
	AEA_Energieversorgung_AttributeGroup getAEAEnergieversorgung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAEnergieversorgung <em>AEA Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEA Energieversorgung</em>' containment reference.
	 * @see #getAEAEnergieversorgung()
	 * @generated
	 */
	void setAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>AEAGFKIP Adressblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEAGFKIP Adressblock</em>' containment reference.
	 * @see #setAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_AEAGFKIPAdressblock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AEA_GFK_IP_Adressblock'"
	 * @generated
	 */
	AEA_GFK_IP_Adressblock_AttributeGroup getAEAGFKIPAdressblock();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getAEAGFKIPAdressblock <em>AEAGFKIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEAGFKIP Adressblock</em>' containment reference.
	 * @see #getAEAGFKIPAdressblock()
	 * @generated
	 */
	void setAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Aussenelementansteuerung_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Information Primaer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Information_Primaer_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Übergeordnetes, primäres Objekt der Informationsversorgung. Bei DSTW ist der Zugriff durch 4 (Reserve: 5) verschiedene TSO möglich, z. B. bei Einbindung eines BÜ in Fahrstraßen mehrerer ESTW-Zentraleinheiten. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information Primaer</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_IDInformationPrimaer()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='ID_Information_Primaer'"
	 * @generated
	 */
	EList<ID_Information_Primaer_TypeClass> getIDInformationPrimaer();

	/**
	 * Returns the value of the '<em><b>ID Information Sekundaer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Übergeordnetes, sekundäres Objekt der Informationsversorgung (wenn vorhanden). Bei DSTW ist der Zugriff durch 4 (Reserve: 5) verschiedene TSO möglich, z. B. bei Einbindung eines BÜ in Fahrstraßen mehrerer ESTW-Zentraleinheiten. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information Sekundaer</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_IDInformationSekundaer()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='ID_Information_Sekundaer'"
	 * @generated
	 */
	EList<ID_Aussenelementansteuerung_TypeClass> getIDInformationSekundaer();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Gesteuert</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeiten, die von der Außenelementansteuerung gesteuert werden. Das Attribut muss nur für AEA (Top) gefüllt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Gesteuert</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_IDOertlichkeitGesteuert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Gesteuert'"
	 * @generated
	 */
	EList<ID_Oertlichkeit_TypeClass> getIDOertlichkeitGesteuert();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Namensgebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die für die Außenelementansteuerung namensgebend ist. Das Attribut ist nur für übergeordnete Aussenelementansteuerungen (AEA (Top)) relevant, z. B. ESTW-A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Namensgebend</em>' containment reference.
	 * @see #setIDOertlichkeitNamensgebend(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_IDOertlichkeitNamensgebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Namensgebend'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitNamensgebend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}' containment reference.
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
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_IDUnterbringung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

} // Aussenelementansteuerung
