/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bezeichnung Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basisattributgruppe zur einheitlichen Modellierung der Bezeichnung von Stell- und weiteren Elementen. Die Bildung der resultierenden Bezeichnung eines Elements in den verschiedenen Ausprägungen ist in Bildung der Bezeichnungen beschrieben. DB-Regelwerk Ril 819.9001 (Symbolbezeichnungen sicherungstechnischer Pläne)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungAussenanlage <em>Bezeichnung Aussenanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanKurz <em>Bezeichnung Lageplan Kurz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanLang <em>Bezeichnung Lageplan Lang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungTabelle <em>Bezeichnung Tabelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getKennzahl <em>Kennzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getOertlicherElementname <em>Oertlicher Elementname</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup()
 * @model extendedMetaData="name='CBezeichnung_Element' kind='elementOnly'"
 * @generated
 */
public interface Bezeichnung_Element_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Aussenanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschriftung des Elements oder der Komponente der LST-Anlage. 
	 * 
	 * Die Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen). Komponenten, die nicht bedienbar sind (z.B. Achszählpunkte) können durch Zusammenfügen von Elementnamen oder modifizierten Elementnamen bezeichnet werden. 
	 * 
	 * Bei Elementen der LST-Anlage, die in der Außenanlage kein Bezeichnungsschild und im sicherungstechnischen Plan- und Tabellenwerk keinen spezifischen Bezeichner haben, kann dieses Attribut entfallen.
	 * 
	 * Beispiele: 
	 * • ein Hauptsignal hat in der Außenanlage ein Bezeichnungsschild und auf dem sicherungstechnischen Lageplan einen spezifischen Bezeichner, das Attribut wird befüllt; 
	 * • ein Vorsignal hat in der Außenanlage kein Bezeichnungsschild, aber auf dem sicherungstechnischen Lageplan einen spezifischen Bezeichner, das Attribut wird befüllt; 
	 * • ein Bedienpunkt (fiktives Signal) existiert gar nicht in der Außenanlage, hat aber mindestens im Tabellenwerk einen spezifischen Bezeichner, das Attribut wird befüllt; 
	 * • ein Lf 7 hat in der Außenanlage kein Bezeichnungsschild und auf dem sicherungstechnischen Lageplan keinen spezifischen Bezeichner, das Attribut entfällt (Hinweis: Auch wenn im Lageplan der Bezeichner \"LF7\" eingetragen wird, so ist das dennoch kein spezifischer Bezeichner, sondern ein allgemeiner Bezeichner für alle Signale Lf 7). 
	 * 
	 * DB-Regelwerk
	 * • 819.9001
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Aussenanlage</em>' containment reference.
	 * @see #setBezeichnungAussenanlage(Bezeichnung_Aussenanlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Aussenanlage'"
	 * @generated
	 */
	Bezeichnung_Aussenanlage_TypeClass getBezeichnungAussenanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungAussenanlage <em>Bezeichnung Aussenanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Aussenanlage</em>' containment reference.
	 * @see #getBezeichnungAussenanlage()
	 * @generated
	 */
	void setBezeichnungAussenanlage(Bezeichnung_Aussenanlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Lageplan Kurz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurze Bezeichnung eines bedienbaren Elements im Lageplan. Die Bezeichnung besteht i. d. R. ausschließlich aus dem Oertlichen Elementnamen (siehe Bildung der Bezeichnungen).
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Lageplan Kurz</em>' containment reference.
	 * @see #setBezeichnungLageplanKurz(Bezeichnung_Lageplan_Kurz_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Lageplan_Kurz'"
	 * @generated
	 */
	Bezeichnung_Lageplan_Kurz_TypeClass getBezeichnungLageplanKurz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanKurz <em>Bezeichnung Lageplan Kurz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Lageplan Kurz</em>' containment reference.
	 * @see #getBezeichnungLageplanKurz()
	 * @generated
	 */
	void setBezeichnungLageplanKurz(Bezeichnung_Lageplan_Kurz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Lageplan Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lange Bezeichnung eines bedienbaren Elements im Lageplan. Die Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Lageplan Lang</em>' containment reference.
	 * @see #setBezeichnungLageplanLang(Bezeichnung_Lageplan_Lang_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Lageplan_Lang'"
	 * @generated
	 */
	Bezeichnung_Lageplan_Lang_TypeClass getBezeichnungLageplanLang();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungLageplanLang <em>Bezeichnung Lageplan Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Lageplan Lang</em>' containment reference.
	 * @see #getBezeichnungLageplanLang()
	 * @generated
	 */
	void setBezeichnungLageplanLang(Bezeichnung_Lageplan_Lang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Tabelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung eines bedienbaren Elements in den Tabellen der AP PT 1. Die Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Tabelle</em>' containment reference.
	 * @see #setBezeichnungTabelle(Bezeichnung_Tabelle_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_BezeichnungTabelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Tabelle'"
	 * @generated
	 */
	Bezeichnung_Tabelle_TypeClass getBezeichnungTabelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getBezeichnungTabelle <em>Bezeichnung Tabelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Tabelle</em>' containment reference.
	 * @see #getBezeichnungTabelle()
	 * @generated
	 */
	void setBezeichnungTabelle(Bezeichnung_Tabelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks für eine Betriebsstelle.
	 * 
	 * Die ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!
	 * 
	 * Eine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Gebäude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten \"HH Kennzahl 06\" und \"HHZX Kennzahl 30\").
	 * 
	 * Eine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei Überleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \"Üst Giften HGIF\" und \"Üst Ritterkamp HRIT\".
	 * 
	 * In Stellbereichen von Bedienbezirken werden für Betriebsstellen (z. B. Bahnhöfe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.
	 * 
	 * Eindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:
	 * 
	 * Innerhalb eines Bedienbezirks und für benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf
	 * 
	 * Für alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausführlichen Elementbezeichnung. Hierdurch erübrigt sich in einem größeren Bereich der Infrastruktur die Mitführung eines Ortsbezeichners.
	 * 
	 * Zentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:
	 * 
	 * Unabnhängig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur örtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer möglichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. 
	 * 
	 * DB-Regelwerk
	 * • Kennzahltabelle oder Kennzahelnübersichtsplan im PT 1, 
	 * • 819.0603 2, 
	 * • 819.9001 1 (5).
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzahl</em>' containment reference.
	 * @see #setKennzahl(Kennzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_Kennzahl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kennzahl'"
	 * @generated
	 */
	Kennzahl_TypeClass getKennzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getKennzahl <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzahl</em>' containment reference.
	 * @see #getKennzahl()
	 * @generated
	 */
	void setKennzahl(Kennzahl_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oertlicher Elementname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzbezeichnung eines Elements. Der örtliche Elementname ist Bestandteil des Elementnamens und wird elementspezifisch gebildet. Bei Lichtsperrsignalen und anderen Elementen mit Richtungsbuchstaben (X, Y) kann dieser nicht immer eindeutig und automatisch aus einem Richtungsattribut abgeleitet werden. Er ist in jedem Fall vom Planer zu bestimmen und als Bestandteil des örtlichen Elementnamens abzuspeichern. Der örtliche Elementname wird üblicherweise im Lageplan verwendet. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk 819.0603 (Stellwerkseinrichtungen - Bedienoberflächen), 819.9001 (Symbolbezeichnungen sicherungstechnischer Pläne).
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlicher Elementname</em>' containment reference.
	 * @see #setOertlicherElementname(Oertlicher_Elementname_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getBezeichnung_Element_AttributeGroup_OertlicherElementname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oertlicher_Elementname'"
	 * @generated
	 */
	Oertlicher_Elementname_TypeClass getOertlicherElementname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup#getOertlicherElementname <em>Oertlicher Elementname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlicher Elementname</em>' containment reference.
	 * @see #getOertlicherElementname()
	 * @generated
	 */
	void setOertlicherElementname(Oertlicher_Elementname_TypeClass value);

} // Bezeichnung_Element_AttributeGroup
