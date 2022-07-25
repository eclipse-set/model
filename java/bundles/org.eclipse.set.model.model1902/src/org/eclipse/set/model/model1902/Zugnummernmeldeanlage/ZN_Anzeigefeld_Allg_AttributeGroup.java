/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Anzeigefeld Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBedienbarkeitAnzeigefeld <em>Bedienbarkeit Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBfNrANB <em>Bf Nr ANB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBfNrZNA <em>Bf Nr ZNA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getFunktionalitaetAnzeigefeld <em>Funktionalitaet Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getHOA <em>HOA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getSichtbarkeitAnzeigefeld <em>Sichtbarkeit Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getVerzoegerungManuellLoeschung <em>Verzoegerung Manuell Loeschung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getVormeldestart <em>Vormeldestart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZNAnzeigefeldLoeschkriterium <em>ZN Anzeigefeld Loeschkriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZNFeldOhneAnzeige <em>ZN Feld Ohne Anzeige</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZugvorbereitungsmeldung <em>Zugvorbereitungsmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZN_Anzeigefeld_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZN_Anzeigefeld_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedienbarkeit Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Anzeigefeld ist auf der Bedienoberfläche bedienbar. DB-Regelwerk 819.0731 6 (20) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedienbarkeit Anzeigefeld</em>' containment reference.
	 * @see #setBedienbarkeitAnzeigefeld(Bedienbarkeit_Anzeigefeld_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedienbarkeit_Anzeigefeld'"
	 * @generated
	 */
	Bedienbarkeit_Anzeigefeld_TypeClass getBedienbarkeitAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBedienbarkeitAnzeigefeld <em>Bedienbarkeit Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedienbarkeit Anzeigefeld</em>' containment reference.
	 * @see #getBedienbarkeitAnzeigefeld()
	 * @generated
	 */
	void setBedienbarkeitAnzeigefeld(Bedienbarkeit_Anzeigefeld_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bf Nr ANB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahnhofsnummer aus der ZN-Anlage des Nachbarn. Die Angabe wird nur für die ZN-Anzeigefelder mit der Funktionalität ANB/ANN benötigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bf Nr ANB</em>' containment reference.
	 * @see #setBfNrANB(Bf_Nr_ANB_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_BfNrANB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bf_Nr_ANB'"
	 * @generated
	 */
	Bf_Nr_ANB_TypeClass getBfNrANB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBfNrANB <em>Bf Nr ANB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bf Nr ANB</em>' containment reference.
	 * @see #getBfNrANB()
	 * @generated
	 */
	void setBfNrANB(Bf_Nr_ANB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bf Nr ZNA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahnhofsnummer, in deren Bereich das ZN-Anzeigefeld angeordnet wird. Es kann dieselbe Bahnhofsnummer sein wie die der gesamten ZN-Anlage, muss es aber nicht. Es ist möglich, dass für jede Betriebsstelle im Erfassungsbereich der ZN-Anlage je eine Bahnhofsnummer geplant werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bf Nr ZNA</em>' containment reference.
	 * @see #setBfNrZNA(Bf_Nr_ZN_A_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_BfNrZNA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bf_Nr_ZN_A'"
	 * @generated
	 */
	Bf_Nr_ZN_A_TypeClass getBfNrZNA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getBfNrZNA <em>Bf Nr ZNA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bf Nr ZNA</em>' containment reference.
	 * @see #getBfNrZNA()
	 * @generated
	 */
	void setBfNrZNA(Bf_Nr_ZN_A_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Funktionalitaet Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Funktionalität des Anzeigefeldes, aus dem der Buchstabe in der Anzeigefeldbezeichnung abgeleitet wird. Anbiete_Annahmefeld: A, Meldeort: M, Spiegelfeld: S Stapelfeld: N, Voranzeigefeld: V, Wandelfeld: W. Die Anzeigefelder sind auf dem ZN-Übersichtsplan darzustellen. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 819.0731 6 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funktionalitaet Anzeigefeld</em>' containment reference.
	 * @see #setFunktionalitaetAnzeigefeld(Funktionalitaet_Anzeigefeld_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_FunktionalitaetAnzeigefeld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Funktionalitaet_Anzeigefeld'"
	 * @generated
	 */
	Funktionalitaet_Anzeigefeld_TypeClass getFunktionalitaetAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getFunktionalitaetAnzeigefeld <em>Funktionalitaet Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktionalitaet Anzeigefeld</em>' containment reference.
	 * @see #getFunktionalitaetAnzeigefeld()
	 * @generated
	 */
	void setFunktionalitaetAnzeigefeld(Funktionalitaet_Anzeigefeld_TypeClass value);

	/**
	 * Returns the value of the '<em><b>HOA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der in dem betreffenden ZN Anzeigefeld auszuwertenden HOA (Heißläufer-Ortungs-Anlage). Im Datenmodell wird nicht die Anlage selber berücksichtigt, sondern nur deren Auswertung im ZN Anzeigefeld. Es wird auf dem ZN-Übersichtsplan an dem betreffenden ZN Anzeigefeld die Nummer der auszuwertenden HOA mit dem Zusatz „Nur zur Information“ vermerkt. DB-Regelwerk 819.0731 8 (4) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HOA</em>' containment reference.
	 * @see #setHOA(HOA_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_HOA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HOA'"
	 * @generated
	 */
	HOA_TypeClass getHOA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getHOA <em>HOA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HOA</em>' containment reference.
	 * @see #getHOA()
	 * @generated
	 */
	void setHOA(HOA_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sichtbarkeit Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das ZN Anzeigefeld ist auf der Bedienoberfläche sichtbar. DB-Regelwerk 819.0731 6 (19) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sichtbarkeit Anzeigefeld</em>' containment reference.
	 * @see #setSichtbarkeitAnzeigefeld(Sichtbarkeit_Anzeigefeld_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sichtbarkeit_Anzeigefeld'"
	 * @generated
	 */
	Sichtbarkeit_Anzeigefeld_TypeClass getSichtbarkeitAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getSichtbarkeitAnzeigefeld <em>Sichtbarkeit Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sichtbarkeit Anzeigefeld</em>' containment reference.
	 * @see #getSichtbarkeitAnzeigefeld()
	 * @generated
	 */
	void setSichtbarkeitAnzeigefeld(Sichtbarkeit_Anzeigefeld_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verzoegerung Manuell Loeschung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verzögerungszeit, bis die Löschung der Zugnummer erfolgt. Die Angabe ist bei manueller Zugnummernlöschung notwendig. Standard lt. LH sind ca. 5 min. DB-Regelwerk Das Planungsdatum ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verzoegerung Manuell Loeschung</em>' containment reference.
	 * @see #setVerzoegerungManuellLoeschung(Verzoegerung_Manuell_Loeschung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verzoegerung_Manuell_Loeschung'"
	 * @generated
	 */
	Verzoegerung_Manuell_Loeschung_TypeClass getVerzoegerungManuellLoeschung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getVerzoegerungManuellLoeschung <em>Verzoegerung Manuell Loeschung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verzoegerung Manuell Loeschung</em>' containment reference.
	 * @see #getVerzoegerungManuellLoeschung()
	 * @generated
	 */
	void setVerzoegerungManuellLoeschung(Verzoegerung_Manuell_Loeschung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vormeldestart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob aus diesem ZN Anzeigefeld eine Vormeldung generiert wird Sofern aus dem ZN_Anzeigefeld eine Vormeldung generiert wird, ist die entsprechende Richtung anzugeben. Wird keine Vormelduing generiert, erfolgt in dem Attribut keine Angabe. DB-Regelwerk In der Ril 819.0731 sind zur Vormeldung keine Aussagen getroffen. Bisher erfolgen die notwendigen Angaben regionalbereichsspezifisch als Symbol und/oder Text mit/ohne Beschreibung konkreter Vormeldebedingungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vormeldestart</em>' containment reference.
	 * @see #setVormeldestart(Vormeldestart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_Vormeldestart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vormeldestart'"
	 * @generated
	 */
	Vormeldestart_TypeClass getVormeldestart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getVormeldestart <em>Vormeldestart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vormeldestart</em>' containment reference.
	 * @see #getVormeldestart()
	 * @generated
	 */
	void setVormeldestart(Vormeldestart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld Loeschkriterium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Kriteriums, mit dem die Zugnummer aus dem ZN Anzeigefeld gelöscht wird. Das Kriterium wird vorrangig für ZN-Anzeigefelder an der Grenze der eigenen zur benachbarten ZN-Anlage angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 819.0731 7 (4) enthält nur eine allgemeine Aussage. Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und Betreiber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld Loeschkriterium</em>' containment reference.
	 * @see #setZNAnzeigefeldLoeschkriterium(ZN_Anzeigefeld_Loeschkriterium_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_ZNAnzeigefeldLoeschkriterium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld_Loeschkriterium'"
	 * @generated
	 */
	ZN_Anzeigefeld_Loeschkriterium_TypeClass getZNAnzeigefeldLoeschkriterium();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZNAnzeigefeldLoeschkriterium <em>ZN Anzeigefeld Loeschkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anzeigefeld Loeschkriterium</em>' containment reference.
	 * @see #getZNAnzeigefeldLoeschkriterium()
	 * @generated
	 */
	void setZNAnzeigefeldLoeschkriterium(ZN_Anzeigefeld_Loeschkriterium_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Feld Ohne Anzeige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im ZN Anzeigefeld erfolgt keine Anzeige einer Zugnummer. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Feld Ohne Anzeige</em>' containment reference.
	 * @see #setZNFeldOhneAnzeige(ZN_Feld_Ohne_Anzeige_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Feld_Ohne_Anzeige'"
	 * @generated
	 */
	ZN_Feld_Ohne_Anzeige_TypeClass getZNFeldOhneAnzeige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZNFeldOhneAnzeige <em>ZN Feld Ohne Anzeige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Feld Ohne Anzeige</em>' containment reference.
	 * @see #getZNFeldOhneAnzeige()
	 * @generated
	 */
	void setZNFeldOhneAnzeige(ZN_Feld_Ohne_Anzeige_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zugvorbereitungsmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem ZN-Anzeigefeld ist eine Zugvorbereitungsmeldung im ZN-Übersichtsplan zu kennzeichnen; die ZN-Anlage enthält keine ZFM-Funktionalität. Im Regelwerk wird dieses Planungsdatum historisch bedingt als \"Zugfertigmeldung\" bezeichnet. DB-Regelwerk 819.0731 6 (23) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugvorbereitungsmeldung</em>' containment reference.
	 * @see #setZugvorbereitungsmeldung(Zugvorbereitungsmeldung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zugvorbereitungsmeldung'"
	 * @generated
	 */
	Zugvorbereitungsmeldung_TypeClass getZugvorbereitungsmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup#getZugvorbereitungsmeldung <em>Zugvorbereitungsmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugvorbereitungsmeldung</em>' containment reference.
	 * @see #getZugvorbereitungsmeldung()
	 * @generated
	 */
	void setZugvorbereitungsmeldung(Zugvorbereitungsmeldung_TypeClass value);

} // ZN_Anzeigefeld_Allg_AttributeGroup
