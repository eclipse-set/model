/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ESG Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getAbstandBesLangerEinfahrweg <em>Abstand Bes Langer Einfahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getDPTypVLa <em>DP Typ VLa</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getESGIndividuelleMerkmale <em>ESG Individuelle Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getESGSpezifischeMerkmale <em>ESG Spezifische Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getIDMassgebendesZielsignal <em>ID Massgebendes Zielsignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getIndividualisierungWeitere <em>Individualisierung Weitere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getLaengeGestufteVSignalisierung <em>Laenge Gestufte VSignalisierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getNIDTSR <em>NIDTSR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getProjektierungsfall <em>Projektierungsfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getTelegrammnummer <em>Telegrammnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getUeberwachungLaenge <em>Ueberwachung Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVStart <em>VStart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVZiel <em>VZiel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVorsignalabstand <em>Vorsignalabstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ESG_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ESG_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Bes Langer Einfahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand vom Datenpunkt bis zur ersten im abzweigenden Strang befahrenen Weiche. Die explizite Angabe erfolgt, sofern keine topologische Ermittlung möglich ist. DB-Regelwerk ESG-Datenpunkttabelle 1, Spalte 24.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Bes Langer Einfahrweg</em>' containment reference.
	 * @see #setAbstandBesLangerEinfahrweg(Abstand_Bes_Langer_Einfahrweg_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_AbstandBesLangerEinfahrweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstand_Bes_Langer_Einfahrweg'"
	 * @generated
	 */
	Abstand_Bes_Langer_Einfahrweg_TypeClass getAbstandBesLangerEinfahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getAbstandBesLangerEinfahrweg <em>Abstand Bes Langer Einfahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Bes Langer Einfahrweg</em>' containment reference.
	 * @see #getAbstandBesLangerEinfahrweg()
	 * @generated
	 */
	void setAbstandBesLangerEinfahrweg(Abstand_Bes_Langer_Einfahrweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ VLa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeitsbeschränkung (ständige oder vorübergehende Langsamfahrstelle bzw. Vorsignalisierung), die durch den Datenpunkt angekündigt wird (Parameter -y).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ VLa</em>' containment reference.
	 * @see #setDPTypVLa(DP_Typ_V_La_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_DPTypVLa()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_V_La'"
	 * @generated
	 */
	DP_Typ_V_La_TypeClass getDPTypVLa();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getDPTypVLa <em>DP Typ VLa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ VLa</em>' containment reference.
	 * @see #getDPTypVLa()
	 * @generated
	 */
	void setDPTypVLa(DP_Typ_V_La_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ESG Individuelle Merkmale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe von angepassten Parametern bei individueller Projektierung, z. B. Datenpunkttyp BM mit Parameter für Länge der Metallmasse in Metern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Individuelle Merkmale</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_ESGIndividuelleMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Individuelle_Merkmale'"
	 * @generated
	 */
	EList<ESG_Individuelle_Merkmale_AttributeGroup> getESGIndividuelleMerkmale();

	/**
	 * Returns the value of the '<em><b>ESG Spezifische Merkmale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe von frei definierten Parametern bei spezifischer Projektierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Spezifische Merkmale</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_ESGSpezifischeMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Spezifische_Merkmale'"
	 * @generated
	 */
	EList<ESG_Spezifische_Merkmale_AttributeGroup> getESGSpezifischeMerkmale();

	/**
	 * Returns the value of the '<em><b>ID Massgebendes Zielsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signalbezeichnung des restriktivsten Falls \"Länge Vorsignalüberwachung je Signalisierung\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Massgebendes Zielsignal</em>' containment reference.
	 * @see #setIDMassgebendesZielsignal(ID_Signal_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_IDMassgebendesZielsignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Massgebendes_Zielsignal'"
	 * @generated
	 */
	ID_Signal_ohne_Proxy_TypeClass getIDMassgebendesZielsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getIDMassgebendesZielsignal <em>ID Massgebendes Zielsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Massgebendes Zielsignal</em>' containment reference.
	 * @see #getIDMassgebendesZielsignal()
	 * @generated
	 */
	void setIDMassgebendesZielsignal(ID_Signal_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Individualisierung Weitere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der  
	 * weitergehenden Individualisierung, die nicht formal in den Parametern der Datenpunkttabelle 1 (Attributgruppe ESG_Individuelle_Merkmale)  abgebildet werden kann. DB-Regelwerk Ril 819.1348, 4 (36) - Erläuterungen zur Bemerkungsspalte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individualisierung Weitere</em>' containment reference.
	 * @see #setIndividualisierungWeitere(Individualisierung_Weitere_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_IndividualisierungWeitere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Individualisierung_Weitere'"
	 * @generated
	 */
	Individualisierung_Weitere_TypeClass getIndividualisierungWeitere();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getIndividualisierungWeitere <em>Individualisierung Weitere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individualisierung Weitere</em>' containment reference.
	 * @see #getIndividualisierungWeitere()
	 * @generated
	 */
	void setIndividualisierungWeitere(Individualisierung_Weitere_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Laenge Gestufte VSignalisierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand vom Datenpunkt bis zum alleinstehenden Zs 3. Die explizite Angabe erfolgt, sofern keine topologische Ermittlung möglich ist. DB-Regelwerk ESG-Datenpunkttabelle 1, Spalte 24.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laenge Gestufte VSignalisierung</em>' containment reference.
	 * @see #setLaengeGestufteVSignalisierung(Laenge_Gestufte_V_Signalisierung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_LaengeGestufteVSignalisierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Laenge_Gestufte_V_Signalisierung'"
	 * @generated
	 */
	Laenge_Gestufte_V_Signalisierung_TypeClass getLaengeGestufteVSignalisierung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getLaengeGestufteVSignalisierung <em>Laenge Gestufte VSignalisierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge Gestufte VSignalisierung</em>' containment reference.
	 * @see #getLaengeGestufteVSignalisierung()
	 * @generated
	 */
	void setLaengeGestufteVSignalisierung(Laenge_Gestufte_V_Signalisierung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NIDTSR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer der Langsamfahrstelle (La). Bei Geschwindigkeitssignalisierung mittels Zs 3 erfolgt der Eintrag \"0\". DB-Regelwerk ESG-Datenpunkttabelle 1, Spalte 21.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NIDTSR</em>' containment reference.
	 * @see #setNIDTSR(NID_TSR_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_NIDTSR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NID_TSR'"
	 * @generated
	 */
	NID_TSR_TypeClass getNIDTSR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getNIDTSR <em>NIDTSR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NIDTSR</em>' containment reference.
	 * @see #getNIDTSR()
	 * @generated
	 */
	void setNIDTSR(NID_TSR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Projektierungsfall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Projektierungsfall gemäß Ril 819.1348, 7.2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projektierungsfall</em>' containment reference.
	 * @see #setProjektierungsfall(Projektierungsfall_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_Projektierungsfall()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Projektierungsfall'"
	 * @generated
	 */
	Projektierungsfall_TypeClass getProjektierungsfall();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getProjektierungsfall <em>Projektierungsfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projektierungsfall</em>' containment reference.
	 * @see #getProjektierungsfall()
	 * @generated
	 */
	void setProjektierungsfall(Projektierungsfall_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegrammnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des Fachtelegramms als Referenz für das Linking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegrammnummer</em>' containment reference.
	 * @see #setTelegrammnummer(Telegrammnummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_Telegrammnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Telegrammnummer'"
	 * @generated
	 */
	Telegrammnummer_TypeClass getTelegrammnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getTelegrammnummer <em>Telegrammnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegrammnummer</em>' containment reference.
	 * @see #getTelegrammnummer()
	 * @generated
	 */
	void setTelegrammnummer(Telegrammnummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberwachung Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Vorsignalüberwachungsabschnitts, auf den sich das Fachtelegramm bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberwachung Laenge</em>' containment reference.
	 * @see #setUeberwachungLaenge(Ueberwachung_Laenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_UeberwachungLaenge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ueberwachung_Laenge'"
	 * @generated
	 */
	Ueberwachung_Laenge_TypeClass getUeberwachungLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getUeberwachungLaenge <em>Ueberwachung Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberwachung Laenge</em>' containment reference.
	 * @see #getUeberwachungLaenge()
	 * @generated
	 */
	void setUeberwachungLaenge(Ueberwachung_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VStart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Startgeschwindigkeit am Datenpunkt (bzw. Bezugspunkt) in km/h. DB-Regelwerk ESG-Datenpunkttabelle 1, Spalte 19.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VStart</em>' containment reference.
	 * @see #setVStart(V_Start_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_VStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Start'"
	 * @generated
	 */
	V_Start_TypeClass getVStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVStart <em>VStart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VStart</em>' containment reference.
	 * @see #getVStart()
	 * @generated
	 */
	void setVStart(V_Start_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VZiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Überwachte Geschwindigkeit (Zielgeschwindigkeit) in km/h. DB-Regelwerk ESG-Datenpunkttabelle 1, Spalte 20.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VZiel</em>' containment reference.
	 * @see #setVZiel(V_Ziel_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_VZiel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Ziel'"
	 * @generated
	 */
	V_Ziel_TypeClass getVZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVZiel <em>VZiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VZiel</em>' containment reference.
	 * @see #getVZiel()
	 * @generated
	 */
	void setVZiel(V_Ziel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vorsignalabstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand vom Datenpunkt der Vorsignalüberwachung zum maßgebenden Zielsignal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorsignalabstand</em>' containment reference.
	 * @see #setVorsignalabstand(Vorsignalabstand_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_Vorsignalabstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorsignalabstand'"
	 * @generated
	 */
	Vorsignalabstand_TypeClass getVorsignalabstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getVorsignalabstand <em>Vorsignalabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorsignalabstand</em>' containment reference.
	 * @see #getVorsignalabstand()
	 * @generated
	 */
	void setVorsignalabstand(Vorsignalabstand_TypeClass value);

} // FT_ESG_Merkmale_AttributeGroup
