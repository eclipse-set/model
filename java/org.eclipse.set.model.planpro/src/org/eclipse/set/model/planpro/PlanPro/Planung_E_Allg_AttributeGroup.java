/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung EAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauphase <em>Bauphase</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauzustandKurzbezeichnung <em>Bauzustand Kurzbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauzustandLangbezeichnung <em>Bauzustand Langbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getDatumAbschlussEinzel <em>Datum Abschluss Einzel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getDatumRegelwerksstand <em>Datum Regelwerksstand</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getIndexAusgabe <em>Index Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getInformativ <em>Informativ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getLaufendeNummerAusgabe <em>Laufende Nummer Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getPlanungEArt <em>Planung EArt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getPlanungPhase <em>Planung Phase</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_E_Allg' kind='elementOnly'"
 * @generated
 */
public interface Planung_E_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bauphase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung für die zeitlich-logische Abgrenzung einer Maßnahme nach bautechnologischen Gesichtspunkten, z. B. Durcharbeitung Gleis x.
	 * Die Bezeichnung der ~ kann für mehrere Einzelplanungen einer definierten Planungsgruppe identisch sein.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Darstellung.
	 * Eintrag außerhalb des in Ril 886.0102 definierten Schriftfeldes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauphase</em>' containment reference.
	 * @see #setBauphase(Bauphase_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_Bauphase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauphase'"
	 * @generated
	 */
	Bauphase_TypeClass getBauphase();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauphase <em>Bauphase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauphase</em>' containment reference.
	 * @see #getBauphase()
	 * @generated
	 */
	void setBauphase(Bauphase_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bauzustand Kurzbezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzbezeichnung des Bauzustandes.
	 * DB-Regelwerk
	 * Bestandteil Schriftfeldeintrag Feld 23.1 \"Änderung (Bezeichnung der Baumaßnahme)\" [Erläuterungen zur Ril 886.0102 Schriftfeld]).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauzustand Kurzbezeichnung</em>' containment reference.
	 * @see #setBauzustandKurzbezeichnung(Bauzustand_Kurzbezeichnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_BauzustandKurzbezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bauzustand_Kurzbezeichnung'"
	 * @generated
	 */
	Bauzustand_Kurzbezeichnung_TypeClass getBauzustandKurzbezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauzustandKurzbezeichnung <em>Bauzustand Kurzbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauzustand Kurzbezeichnung</em>' containment reference.
	 * @see #getBauzustandKurzbezeichnung()
	 * @generated
	 */
	void setBauzustandKurzbezeichnung(Bauzustand_Kurzbezeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bauzustand Langbezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Langbezeichnung des Bauzustands.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * Bestandteil der organisatorischen Projektdaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauzustand Langbezeichnung</em>' containment reference.
	 * @see #setBauzustandLangbezeichnung(Bauzustand_Langbezeichnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_BauzustandLangbezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauzustand_Langbezeichnung'"
	 * @generated
	 */
	Bauzustand_Langbezeichnung_TypeClass getBauzustandLangbezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getBauzustandLangbezeichnung <em>Bauzustand Langbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauzustand Langbezeichnung</em>' containment reference.
	 * @see #getBauzustandLangbezeichnung()
	 * @generated
	 */
	void setBauzustandLangbezeichnung(Bauzustand_Langbezeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datum Abschluss Einzel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Abschlusses der Einzelplanung.
	 * Bis zum tatsächlichen Abschluss handelt es sich dabei um ein geplantes Datum, das iterativ nachzupflegen ist.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Abschluss Einzel</em>' containment reference.
	 * @see #setDatumAbschlussEinzel(Datum_Abschluss_Einzel_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_DatumAbschlussEinzel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum_Abschluss_Einzel'"
	 * @generated
	 */
	Datum_Abschluss_Einzel_TypeClass getDatumAbschlussEinzel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getDatumAbschlussEinzel <em>Datum Abschluss Einzel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Abschluss Einzel</em>' containment reference.
	 * @see #getDatumAbschlussEinzel()
	 * @generated
	 */
	void setDatumAbschlussEinzel(Datum_Abschluss_Einzel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datum Regelwerksstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regelwerksstand der Einzelplanung, auf dessen Basis die Objekte geändert bzw. neu geplant wurden.
	 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
	 * Es entspricht im Regelfall dem Datum der Auftragsvergabe oder im besonderen Fall einem festgelegten Datum, wenn bspw. ein zukünftig gültiges Regelwerk bereits bei der Erstellung des PT 1 berücksichtigt werden soll. Anhand des Regelwerksstandes lassen sich die jeweils gültigen Stände der verwendeten Regelwerke herleiten. Abweichungen werden auf Objektebene (Basis_Objekt) über das Attribut ID_Anhang_Regelwerk_Besonders beigefügt.
	 * Die Historie der Bearbeitung von Objekten ergibt sich nur aus der Rückverfolgung von Planungen (Planungsarchiv), indem identifizierbar ist, welche Objekte sich zuletzt (jeweils) im Pb/Bb einer Planung befanden.
	 * Das Datum_Regelwerksstand der Einzelplanung wird auf Objektebene in das Attribut Datum_Regelwerk der geänderten bzw. neu geplanten Objekte übernommen. Bestandsobjekte behalten ihren alten Regelwerksstand. Wenn durch Beziehungen zwischen diesen Objekten technisch nicht lösbare Situationen entstehen, muss eine Umplanung erfolgen.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 886.0102.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Regelwerksstand</em>' containment reference.
	 * @see #setDatumRegelwerksstand(Datum_Regelwerksstand_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_DatumRegelwerksstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum_Regelwerksstand'"
	 * @generated
	 */
	Datum_Regelwerksstand_TypeClass getDatumRegelwerksstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getDatumRegelwerksstand <em>Datum Regelwerksstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Regelwerksstand</em>' containment reference.
	 * @see #getDatumRegelwerksstand()
	 * @generated
	 */
	void setDatumRegelwerksstand(Datum_Regelwerksstand_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Index Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter zur Systematisierung der Reihenfolge von Bauzuständen.
	 * Bei der Neuerstellung von Planungsdaten für eine Einzelplanung (Bauzustand) erhält der Index_Ausgabe den Startwert \"01\". Dieser wird bei jedem weiteren Bauzustand um \"01\" erhöht. Für eine Projektinitialisierung ist der Eintrag \"00\" zu verwenden. Der ~ wird außerdem zur Generierung der Ausgabenummer benötigt.
	 * DB-Regelwerk
	 * Entspricht dem 2ziffrigen Schriftfeldeintrag, Feld 3.1, gemäß Ril 886.0102 sowie bei Bestand dem Eintrag in Feld 3.2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Ausgabe</em>' containment reference.
	 * @see #setIndexAusgabe(Index_Ausgabe_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_IndexAusgabe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Index_Ausgabe'"
	 * @generated
	 */
	Index_Ausgabe_TypeClass getIndexAusgabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getIndexAusgabe <em>Index Ausgabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Ausgabe</em>' containment reference.
	 * @see #getIndexAusgabe()
	 * @generated
	 */
	void setIndexAusgabe(Index_Ausgabe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Informativ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Planungsdaten dienen nur zur Information und geben keinen offiziellen Planungsstand wieder. Das Ausgabedatum im Attribut Datum wird zusätzlich angegeben.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Angabe.
	 * Das Verfahren der Auslieferung von Planungen zur Information wird nicht beschrieben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Informativ</em>' containment reference.
	 * @see #setInformativ(Informativ_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_Informativ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Informativ'"
	 * @generated
	 */
	Informativ_TypeClass getInformativ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getInformativ <em>Informativ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informativ</em>' containment reference.
	 * @see #getInformativ()
	 * @generated
	 */
	void setInformativ(Informativ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Laufende Nummer Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestandteil des Ausgabestandes.
	 * DB-Regelwerk
	 * Zweiter Bestandteil des 2ziffrig.2ziffrigen Schriftfeldeintrags im Feld 20 gemäß Ril 886.0102.
	 * Gemäß Erläuterungen zur Ril 886.0102 zusätzlich im Feld 3.2 eingetragen, sofern es sich um eine laufende Planung handelt (bei Bestand wird im Feld 3.2 nur der Index eingetragen).
	 * Die laufende Nummer der Ausgabe beginnt bei 01 und wird mit jeder Änderung um 01 erhöht. Bei einer Projektinitialisierung ist abweichend der Wert \"00\" zu verwenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laufende Nummer Ausgabe</em>' containment reference.
	 * @see #setLaufendeNummerAusgabe(Laufende_Nummer_Ausgabe_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_LaufendeNummerAusgabe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Laufende_Nummer_Ausgabe'"
	 * @generated
	 */
	Laufende_Nummer_Ausgabe_TypeClass getLaufendeNummerAusgabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getLaufendeNummerAusgabe <em>Laufende Nummer Ausgabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laufende Nummer Ausgabe</em>' containment reference.
	 * @see #getLaufendeNummerAusgabe()
	 * @generated
	 */
	void setLaufendeNummerAusgabe(Laufende_Nummer_Ausgabe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Planung EArt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Einzelplanung.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * Meist Bestandteil Schriftfeldeintrag gemäß Ril 886.0102 der Kurzbezeichnung des Bauzustandes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EArt</em>' containment reference.
	 * @see #setPlanungEArt(Planung_E_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_PlanungEArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Art'"
	 * @generated
	 */
	Planung_E_Art_TypeClass getPlanungEArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getPlanungEArt <em>Planung EArt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung EArt</em>' containment reference.
	 * @see #getPlanungEArt()
	 * @generated
	 */
	void setPlanungEArt(Planung_E_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Planung Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, innerhalb welcher Planungsphase die Planung erstellt wurde.
	 * DB-Regelwerk
	 * Ril 809.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung Phase</em>' containment reference.
	 * @see #setPlanungPhase(Planung_Phase_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Allg_AttributeGroup_PlanungPhase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_Phase'"
	 * @generated
	 */
	Planung_Phase_TypeClass getPlanungPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Allg_AttributeGroup#getPlanungPhase <em>Planung Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung Phase</em>' containment reference.
	 * @see #getPlanungPhase()
	 * @generated
	 */
	void setPlanungPhase(Planung_Phase_TypeClass value);

} // Planung_E_Allg_AttributeGroup
