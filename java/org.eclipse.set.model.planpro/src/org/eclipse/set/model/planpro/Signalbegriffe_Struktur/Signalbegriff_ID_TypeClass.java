/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Struktur;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signalbegriff ID Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Signalbegriff gemäß Ril 301 (Signalbuch).
 * 
 * Für jeden Signalbegriff wird eine eigene Instanz des Objektes angelegt. Die Attribute \"Kurzbezeichnung_DS\", \"Kurzbezeichnung_DV\", \"Langbezeichnung\", \"Beschreibung\", \"Geltungsbereich_DS\", \"Geltungsbereich_DV\",\"Geltungsbereich_SBahn_Berlin\", \"Geltungsbereich_SBahn_Hamburg\" sowie \"Gueltig_Ab\", \"Gueltig_Bis\", \"Beleuchtbar\", \"Schaltbar\", \"Zusatz_Moeglich\" und \"Anmerkungen\" sind dabei modellseitig fixierte Eigenschaften. Mittels des Attributs \"Symbol\" können planungsseitig in einigen Fällen Wertangaben erfolgen.
 * 
 * Sonstige wählbare Eigenschaften des Signals sind im Objekt Signal Signalbegriff enthalten.
 * 
 * Die Struktur der Signalbegriffsmodellierung (Anzahl und Ausprägung der Attribute) und die Inhalte (konkrete Signalbegriffe) sind in zwei getrennten XSD-Dateien enthalten, um später eine separate Bearbeitung zu ermöglichen: 
 * • Signalbegriffe_Struktur.xsd, 
 * • Signalbegriffe_Ril_301.xsd. 
 * 
 * Weitere Erläuterungen hierzu siehe Media:2013-10-08 Einfuehrung Komponenten XSD.pdf.
 * 
 * Das nachfolgende Beispiel zeigt auszugsweise die Abbildung des Signalbegriffs \"Zs 3\" mit Symbol \"6\". Der Bezug zur Signalbegriffsinhalts-XSD wird durch die erweiterte Angabe der Signalbegriff ID hergestellt.
 * <Signal_Signalbegriff>
 *   <Signalbegriff_ID xsi:type=\"ril301:Zs_3\">
 *    <Symbol>6</Symbol> 
 *   </Signalbegriff_ID>
 * </Signal_Signalbegriff>
 * 
 * Ein vollständige XML-Datei mit drei verschiedenen Signalbegriffen finden Sie hier: Media:adorf.xml.
 * 
 * Innerhalb einer ESTW Zentraleinheit gilt immer nur eine Version des Signalbuchs und somit der Signalbegriffsinhalts-XSD. 
 * 
 * DB-Regelwerk
 * • Ril 301 (Signalbuch)
 * 
 * DB-Regelwerk
 * • Ril 301 (Signalbuch) 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getAnmerkungen <em>Anmerkungen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar <em>Beleuchtbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS <em>Geltungsbereich DS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV <em>Geltungsbereich DV</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigAb <em>Gueltig Ab</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigBis <em>Gueltig Bis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDS <em>Kurzbezeichnung DS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDV <em>Kurzbezeichnung DV</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getLangbezeichnung <em>Langbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar <em>Schaltbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich <em>Zusatz Moeglich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass()
 * @model abstract="true"
 *        extendedMetaData="name='TCSignalbegriff_ID' kind='elementOnly'"
 * @generated
 */
public interface Signalbegriff_ID_TypeClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bedeutung 1: Anzuzeigendes Symbol des Signalbegriffs. 
	 * 
	 * Das Signalbuch (Ril 301) schränkt nicht in allen Fällen den Wertevorrat ausreichend ein, sodass direkt ENUM-Werte abgeleitet werden können. Eine Angabe als Text ist jedoch ebenfalls nicht zielführend. Die ENUM-Werte wurden daher unter Berücksichtigung der Vorgaben der Ril 301 nach ingenieurmäßigem Ermessen festgelegt, sodass alle denkbaren Konstellationen abbildbar sind.
	 * 
	 * Bedeutung 2: Zusatzangabe bzw. Aufschrift eines Zusatzschildes.
	 * 
	 * Im Fall des Signalbegriffs 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Symbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Symbol'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung von Besonderheiten des Signalbegriffs gemäß Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer veränderbar.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anmerkungen</em>' attribute.
	 * @see #setAnmerkungen(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Anmerkungen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Anmerkungen'"
	 * @generated
	 */
	String getAnmerkungen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getAnmerkungen <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anmerkungen</em>' attribute.
	 * @see #getAnmerkungen()
	 * @generated
	 */
	void setAnmerkungen(String value);

	/**
	 * Returns the value of the '<em><b>Beleuchtbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) prinzipiell beleuchtbar ist. 
	 * 
	 * Ein positiver Eintrag erfolgt auch dann, wenn ein Signalbegriff nur in einer Ausführungsform (Lichtsignal, Formsignal etc.) die entsprechende Eigenschaft besitzt. Ob der Signalbegriff tatsächlich beleuchtet werden soll, ist im Objekt Signal Signalbegriff im Attribut Beleuchtet hinterlegt. 
	 * 
	 * Wertzuordnung: 
	 * • true - Signalbegriff ist beleuchtbar, 
	 * • false - Signalbegriff ist nicht beleuchtbar. 
	 * 
	 * Das Attribut ist nicht durch den Planer veränderbar.
	 * 
	 * Besonderheiten:
	 * 
	 * Lf 1: Das Nachtzeichen wird im LST-Datenmodell nicht berücksichtigt, da es kein Bestandteil der AP PT 1 ist.
	 * 
	 * Sh 1: Beleuchtete Formsignale Sh 1 werden aufgrund der geringen Auftrittswahrscheinlichkeit im Vergleich zum Lichtsignal nicht berücksichtigt. Die Planung muss ggf. über einen Bearbeitungsvermerk erfolgen.
	 * 
	 * Sh 2 (Sh_2): Beleuchtbar == 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beleuchtbar</em>' attribute.
	 * @see #isSetBeleuchtbar()
	 * @see #unsetBeleuchtbar()
	 * @see #setBeleuchtbar(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Beleuchtbar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Beleuchtbar'"
	 * @generated
	 */
	boolean isBeleuchtbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar <em>Beleuchtbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beleuchtbar</em>' attribute.
	 * @see #isSetBeleuchtbar()
	 * @see #unsetBeleuchtbar()
	 * @see #isBeleuchtbar()
	 * @generated
	 */
	void setBeleuchtbar(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar <em>Beleuchtbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeleuchtbar()
	 * @see #isBeleuchtbar()
	 * @see #setBeleuchtbar(boolean)
	 * @generated
	 */
	void unsetBeleuchtbar();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isBeleuchtbar <em>Beleuchtbar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beleuchtbar</em>' attribute is set.
	 * @see #unsetBeleuchtbar()
	 * @see #isBeleuchtbar()
	 * @see #setBeleuchtbar(boolean)
	 * @generated
	 */
	boolean isSetBeleuchtbar();

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erscheinungsbild des Signalbegriffs gemäß Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Beschreibung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Beschreibung'"
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Geltungsbereich DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) im Geltungsbereich DS gültig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich DS</em>' attribute.
	 * @see #isSetGeltungsbereichDS()
	 * @see #unsetGeltungsbereichDS()
	 * @see #setGeltungsbereichDS(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GeltungsbereichDS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Geltungsbereich_DS'"
	 * @generated
	 */
	boolean isGeltungsbereichDS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS <em>Geltungsbereich DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich DS</em>' attribute.
	 * @see #isSetGeltungsbereichDS()
	 * @see #unsetGeltungsbereichDS()
	 * @see #isGeltungsbereichDS()
	 * @generated
	 */
	void setGeltungsbereichDS(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS <em>Geltungsbereich DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeltungsbereichDS()
	 * @see #isGeltungsbereichDS()
	 * @see #setGeltungsbereichDS(boolean)
	 * @generated
	 */
	void unsetGeltungsbereichDS();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDS <em>Geltungsbereich DS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geltungsbereich DS</em>' attribute is set.
	 * @see #unsetGeltungsbereichDS()
	 * @see #isGeltungsbereichDS()
	 * @see #setGeltungsbereichDS(boolean)
	 * @generated
	 */
	boolean isSetGeltungsbereichDS();

	/**
	 * Returns the value of the '<em><b>Geltungsbereich DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) im Geltungsbereich DV gültig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich DV</em>' attribute.
	 * @see #isSetGeltungsbereichDV()
	 * @see #unsetGeltungsbereichDV()
	 * @see #setGeltungsbereichDV(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GeltungsbereichDV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Geltungsbereich_DV'"
	 * @generated
	 */
	boolean isGeltungsbereichDV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV <em>Geltungsbereich DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich DV</em>' attribute.
	 * @see #isSetGeltungsbereichDV()
	 * @see #unsetGeltungsbereichDV()
	 * @see #isGeltungsbereichDV()
	 * @generated
	 */
	void setGeltungsbereichDV(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV <em>Geltungsbereich DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeltungsbereichDV()
	 * @see #isGeltungsbereichDV()
	 * @see #setGeltungsbereichDV(boolean)
	 * @generated
	 */
	void unsetGeltungsbereichDV();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichDV <em>Geltungsbereich DV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geltungsbereich DV</em>' attribute is set.
	 * @see #unsetGeltungsbereichDV()
	 * @see #isGeltungsbereichDV()
	 * @see #setGeltungsbereichDV(boolean)
	 * @generated
	 */
	boolean isSetGeltungsbereichDV();

	/**
	 * Returns the value of the '<em><b>Geltungsbereich SBahn B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) im Geltungsbereich der S-Bahn Berlin gültig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich SBahn B</em>' attribute.
	 * @see #isSetGeltungsbereichSBahnB()
	 * @see #unsetGeltungsbereichSBahnB()
	 * @see #setGeltungsbereichSBahnB(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Geltungsbereich_SBahn_B'"
	 * @generated
	 */
	boolean isGeltungsbereichSBahnB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich SBahn B</em>' attribute.
	 * @see #isSetGeltungsbereichSBahnB()
	 * @see #unsetGeltungsbereichSBahnB()
	 * @see #isGeltungsbereichSBahnB()
	 * @generated
	 */
	void setGeltungsbereichSBahnB(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeltungsbereichSBahnB()
	 * @see #isGeltungsbereichSBahnB()
	 * @see #setGeltungsbereichSBahnB(boolean)
	 * @generated
	 */
	void unsetGeltungsbereichSBahnB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnB <em>Geltungsbereich SBahn B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geltungsbereich SBahn B</em>' attribute is set.
	 * @see #unsetGeltungsbereichSBahnB()
	 * @see #isGeltungsbereichSBahnB()
	 * @see #setGeltungsbereichSBahnB(boolean)
	 * @generated
	 */
	boolean isSetGeltungsbereichSBahnB();

	/**
	 * Returns the value of the '<em><b>Geltungsbereich SBahn HH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) im Geltungsbereich der S-Bahn Hamburg gültig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich SBahn HH</em>' attribute.
	 * @see #isSetGeltungsbereichSBahnHH()
	 * @see #unsetGeltungsbereichSBahnHH()
	 * @see #setGeltungsbereichSBahnHH(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Geltungsbereich_SBahn_HH'"
	 * @generated
	 */
	boolean isGeltungsbereichSBahnHH();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich SBahn HH</em>' attribute.
	 * @see #isSetGeltungsbereichSBahnHH()
	 * @see #unsetGeltungsbereichSBahnHH()
	 * @see #isGeltungsbereichSBahnHH()
	 * @generated
	 */
	void setGeltungsbereichSBahnHH(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeltungsbereichSBahnHH()
	 * @see #isGeltungsbereichSBahnHH()
	 * @see #setGeltungsbereichSBahnHH(boolean)
	 * @generated
	 */
	void unsetGeltungsbereichSBahnHH();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isGeltungsbereichSBahnHH <em>Geltungsbereich SBahn HH</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geltungsbereich SBahn HH</em>' attribute is set.
	 * @see #unsetGeltungsbereichSBahnHH()
	 * @see #isGeltungsbereichSBahnHH()
	 * @see #setGeltungsbereichSBahnHH(boolean)
	 * @generated
	 */
	boolean isSetGeltungsbereichSBahnHH();

	/**
	 * Returns the value of the '<em><b>Gueltig Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitlicher Beginn der Gültigkeit eines Signalbegriffs gemäß Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueltig Ab</em>' attribute.
	 * @see #setGueltigAb(XMLGregorianCalendar)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GueltigAb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='Gueltig_Ab'"
	 * @generated
	 */
	XMLGregorianCalendar getGueltigAb();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigAb <em>Gueltig Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueltig Ab</em>' attribute.
	 * @see #getGueltigAb()
	 * @generated
	 */
	void setGueltigAb(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gueltig Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitliches Ende der Gültigkeit eines Signalbegriffs gemäß Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueltig Bis</em>' attribute.
	 * @see #setGueltigBis(XMLGregorianCalendar)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_GueltigBis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='Gueltig_Bis'"
	 * @generated
	 */
	XMLGregorianCalendar getGueltigBis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getGueltigBis <em>Gueltig Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueltig Bis</em>' attribute.
	 * @see #getGueltigBis()
	 * @generated
	 */
	void setGueltigBis(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Kurzbezeichnung DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzbezeichnung des Signalbegriffs gemäß Ril 301 (Signalbuch) im Geltungsbereich DS. Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kurzbezeichnung DS</em>' attribute.
	 * @see #setKurzbezeichnungDS(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_KurzbezeichnungDS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Kurzbezeichnung_DS'"
	 * @generated
	 */
	String getKurzbezeichnungDS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDS <em>Kurzbezeichnung DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurzbezeichnung DS</em>' attribute.
	 * @see #getKurzbezeichnungDS()
	 * @generated
	 */
	void setKurzbezeichnungDS(String value);

	/**
	 * Returns the value of the '<em><b>Kurzbezeichnung DV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzbezeichnung des Signalbegriffs gemäß Ril 301 (Signalbuch) im Geltungsbereich DV. Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kurzbezeichnung DV</em>' attribute.
	 * @see #setKurzbezeichnungDV(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_KurzbezeichnungDV()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Kurzbezeichnung_DV'"
	 * @generated
	 */
	String getKurzbezeichnungDV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getKurzbezeichnungDV <em>Kurzbezeichnung DV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurzbezeichnung DV</em>' attribute.
	 * @see #getKurzbezeichnungDV()
	 * @generated
	 */
	void setKurzbezeichnungDV(String value);

	/**
	 * Returns the value of the '<em><b>Langbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Langbezeichnung des Signalbegriffs gemäß Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Langbezeichnung</em>' attribute.
	 * @see #setLangbezeichnung(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Langbezeichnung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Langbezeichnung'"
	 * @generated
	 */
	String getLangbezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#getLangbezeichnung <em>Langbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langbezeichnung</em>' attribute.
	 * @see #getLangbezeichnung()
	 * @generated
	 */
	void setLangbezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Schaltbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Signalbegriff gemäß Ril 301 (Signalbuch) prinzipiell schaltbar ist.
	 * 
	 * Ein positiver Eintrag erfolgt auch dann, wenn ein Signalbegriff nur in einer Ausführungsform (Lichtsignal, Formsignal etc.) die entsprechende Eigenschaft besitzt. 
	 * 
	 * Nicht schaltbar sind demnach z. B. 
	 * • Mastschilder oder 
	 * • Zs 3-Formsignale (auch wenn sie in bestimmten Kombinationen nicht gelten - hier fehlt die aktive Handlung). 
	 * 
	 * Ob der Signalbegriff tatsächlich geschaltet werden soll, ist im Objekt Signal Signalbegriff im Attribut Geschaltet hinterlegt. 
	 * 
	 * Wertzuordnung: 
	 * • true - Signalbegriff ist schaltbar, 
	 * • false - Signalbegriff ist nicht schaltbar. 
	 * 
	 * Das Attribut ist nicht durch den Planer veränderbar.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltbar</em>' attribute.
	 * @see #isSetSchaltbar()
	 * @see #unsetSchaltbar()
	 * @see #setSchaltbar(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_Schaltbar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Schaltbar'"
	 * @generated
	 */
	boolean isSchaltbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar <em>Schaltbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schaltbar</em>' attribute.
	 * @see #isSetSchaltbar()
	 * @see #unsetSchaltbar()
	 * @see #isSchaltbar()
	 * @generated
	 */
	void setSchaltbar(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar <em>Schaltbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchaltbar()
	 * @see #isSchaltbar()
	 * @see #setSchaltbar(boolean)
	 * @generated
	 */
	void unsetSchaltbar();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isSchaltbar <em>Schaltbar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schaltbar</em>' attribute is set.
	 * @see #unsetSchaltbar()
	 * @see #isSchaltbar()
	 * @see #setSchaltbar(boolean)
	 * @generated
	 */
	boolean isSetSchaltbar();

	/**
	 * Returns the value of the '<em><b>Zusatz Moeglich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob für den Signalbegriff gemäß Ril 301 (Signalbuch) eine Zusatzinformation bzw. ein Zusatzschild möglich ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer veränderbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz Moeglich</em>' attribute.
	 * @see #isSetZusatzMoeglich()
	 * @see #unsetZusatzMoeglich()
	 * @see #setZusatzMoeglich(boolean)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#getSignalbegriff_ID_TypeClass_ZusatzMoeglich()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Zusatz_Moeglich'"
	 * @generated
	 */
	boolean isZusatzMoeglich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich <em>Zusatz Moeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz Moeglich</em>' attribute.
	 * @see #isSetZusatzMoeglich()
	 * @see #unsetZusatzMoeglich()
	 * @see #isZusatzMoeglich()
	 * @generated
	 */
	void setZusatzMoeglich(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich <em>Zusatz Moeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZusatzMoeglich()
	 * @see #isZusatzMoeglich()
	 * @see #setZusatzMoeglich(boolean)
	 * @generated
	 */
	void unsetZusatzMoeglich();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass#isZusatzMoeglich <em>Zusatz Moeglich</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zusatz Moeglich</em>' attribute is set.
	 * @see #unsetZusatzMoeglich()
	 * @see #isZusatzMoeglich()
	 * @see #setZusatzMoeglich(boolean)
	 * @generated
	 */
	boolean isSetZusatzMoeglich();

} // Signalbegriff_ID_TypeClass
