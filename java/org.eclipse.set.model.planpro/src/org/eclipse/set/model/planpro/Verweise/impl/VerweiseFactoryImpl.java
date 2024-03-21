/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Verweise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.planpro.Verweise.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerweiseFactoryImpl extends EFactoryImpl implements VerweiseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerweiseFactory init() {
		try {
			VerweiseFactory theVerweiseFactory = (VerweiseFactory)EPackage.Registry.INSTANCE.getEFactory(VerweisePackage.eNS_URI);
			if (theVerweiseFactory != null) {
				return theVerweiseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VerweiseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerweiseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VerweisePackage.ID_ANFORDERER_ELEMENT_TYPE_CLASS: return createID_Anforderer_Element_TypeClass();
			case VerweisePackage.ID_ANFORDERUNG_TYPE_CLASS: return createID_Anforderung_TypeClass();
			case VerweisePackage.ID_ANHANG_OHNE_PROXY_TYPE_CLASS: return createID_Anhang_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_ANHANG_TYPE_CLASS: return createID_Anhang_TypeClass();
			case VerweisePackage.ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS: return createID_AnhangBearbeitungsvermerk_TypeClass();
			case VerweisePackage.ID_ANSCHLUSS_ELEMENT_TYPE_CLASS: return createID_Anschluss_Element_TypeClass();
			case VerweisePackage.ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS: return createID_ATO_TS_Instanz_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_ATO_TS_INSTANZ_TYPE_CLASS: return createID_ATO_TS_Instanz_TypeClass();
			case VerweisePackage.ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS: return createID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS: return createID_Aussenelementansteuerung_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS: return createID_Aussenelementansteuerung_TypeClass();
			case VerweisePackage.ID_BAHNSTEIG_ANLAGE_TYPE_CLASS: return createID_Bahnsteig_Anlage_TypeClass();
			case VerweisePackage.ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS: return createID_Bahnsteig_Kante_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_BAHNSTEIG_KANTE_TYPE_CLASS: return createID_Bahnsteig_Kante_TypeClass();
			case VerweisePackage.ID_BALISE_OHNE_PROXY_TYPE_CLASS: return createID_Balise_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_BALISE_TYPE_CLASS: return createID_Balise_TypeClass();
			case VerweisePackage.ID_BASIS_OBJEKT_TYPE_CLASS: return createID_Basis_Objekt_TypeClass();
			case VerweisePackage.ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS: return createID_Bedien_Anzeige_Element_TypeClass();
			case VerweisePackage.ID_BEDIEN_BEZIRK_TYPE_CLASS: return createID_Bedien_Bezirk_TypeClass();
			case VerweisePackage.ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS: return createID_Bedien_Einrichtung_Oertlich_TypeClass();
			case VerweisePackage.ID_BEDIEN_OBERFLAECHE_TYPE_CLASS: return createID_Bedien_Oberflaeche_TypeClass();
			case VerweisePackage.ID_BEDIEN_STANDORT_TYPE_CLASS: return createID_Bedien_Standort_TypeClass();
			case VerweisePackage.ID_BEDIEN_ZENTRALE_TYPE_CLASS: return createID_Bedien_Zentrale_TypeClass();
			case VerweisePackage.ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS: return createID_Befestigung_Bauwerk_TypeClass();
			case VerweisePackage.ID_BEGINN_BEREICH_TYPE_CLASS: return createID_Beginn_Bereich_TypeClass();
			case VerweisePackage.ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS: return createID_Bezugspunkt_Positionierung_TypeClass();
			case VerweisePackage.ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS: return createID_Binaerdaten_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_BLOCK_ANLAGE_TYPE_CLASS: return createID_Block_Anlage_TypeClass();
			case VerweisePackage.ID_BLOCK_ELEMENT_TYPE_CLASS: return createID_Block_Element_TypeClass();
			case VerweisePackage.ID_BLOCK_STRECKE_TYPE_CLASS: return createID_Block_Strecke_TypeClass();
			case VerweisePackage.ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS: return createID_BUE_Anlage_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_BUE_ANLAGE_TYPE_CLASS: return createID_BUE_Anlage_TypeClass();
			case VerweisePackage.ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS: return createID_BUE_Bedien_Anzeige_Element_TypeClass();
			case VerweisePackage.ID_BUE_EINSCHALTUNG_TYPE_CLASS: return createID_BUE_Einschaltung_TypeClass();
			case VerweisePackage.ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS: return createID_BUE_Gleisbezogener_Gefahrraum_TypeClass();
			case VerweisePackage.ID_BUE_SCHNITTSTELLE_TYPE_CLASS: return createID_BUE_Schnittstelle_TypeClass();
			case VerweisePackage.ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS: return createID_BUE_WS_Fstr_Zuordnung_TypeClass();
			case VerweisePackage.ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS: return createID_Datenpunkt_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_DATENPUNKT_TYPE_CLASS: return createID_Datenpunkt_TypeClass();
			case VerweisePackage.ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS: return createID_DP_Bezug_Funktional_TypeClass();
			case VerweisePackage.ID_EINSCHALTPUNKT_TYPE_CLASS: return createID_Einschaltpunkt_TypeClass();
			case VerweisePackage.ID_ELEMENT_GRENZE_TYPE_CLASS: return createID_Element_Grenze_TypeClass();
			case VerweisePackage.ID_ELEMENT_TYPE_CLASS: return createID_Element_TypeClass();
			case VerweisePackage.ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS: return createID_Element_Unterbringung_TypeClass();
			case VerweisePackage.ID_ENERGIE_EINGANG_TYPE_CLASS: return createID_Energie_Eingang_TypeClass();
			case VerweisePackage.ID_ENERGIE_TYPE_CLASS: return createID_Energie_TypeClass();
			case VerweisePackage.ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS: return createID_ESTW_Zentraleinheit_TypeClass();
			case VerweisePackage.ID_ETCS_KANTE_TYPE_CLASS: return createID_ETCS_Kante_TypeClass();
			case VerweisePackage.ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS: return createID_ETCS_Knoten_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_ETCS_KNOTEN_TYPE_CLASS: return createID_ETCS_Knoten_TypeClass();
			case VerweisePackage.ID_EV_MODUL_TYPE_CLASS: return createID_EV_Modul_TypeClass();
			case VerweisePackage.ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS: return createID_Fachtelegramm_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_FACHTELEGRAMM_TYPE_CLASS: return createID_Fachtelegramm_TypeClass();
			case VerweisePackage.ID_FLA_SCHUTZ_TYPE_CLASS: return createID_Fla_Schutz_TypeClass();
			case VerweisePackage.ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS: return createID_FMA_Anlage_Rangier_Frei_TypeClass();
			case VerweisePackage.ID_FMA_ANLAGE_TYPE_CLASS: return createID_FMA_Anlage_TypeClass();
			case VerweisePackage.ID_FMA_ELEMENT_TYPE_CLASS: return createID_FMA_Element_TypeClass();
			case VerweisePackage.ID_FMA_KOMPONENTE_TYPE_CLASS: return createID_FMA_Komponente_TypeClass();
			case VerweisePackage.ID_FORTSCHALTUNG_START_TYPE_CLASS: return createID_Fortschaltung_Start_TypeClass();
			case VerweisePackage.ID_FSTR_ANEINANDER_TYPE_CLASS: return createID_Fstr_Aneinander_TypeClass();
			case VerweisePackage.ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS: return createID_Fstr_Ausschluss_Besonders_TypeClass();
			case VerweisePackage.ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS: return createID_Fstr_DWeg_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_FSTR_DWEG_TYPE_CLASS: return createID_Fstr_DWeg_TypeClass();
			case VerweisePackage.ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS: return createID_Fstr_Fahrweg_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_FSTR_FAHRWEG_TYPE_CLASS: return createID_Fstr_Fahrweg_TypeClass();
			case VerweisePackage.ID_FSTR_ZUG_RANGIER_TYPE_CLASS: return createID_Fstr_Zug_Rangier_TypeClass();
			case VerweisePackage.ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS: return createID_FT_Anschaltbedingung_TypeClass();
			case VerweisePackage.ID_FT_FAHRWEG_TEIL_TYPE_CLASS: return createID_FT_Fahrweg_Teil_TypeClass();
			case VerweisePackage.ID_GEO_ART_TYPE_CLASS: return createID_GEO_Art_TypeClass();
			case VerweisePackage.ID_GEO_KANTE_TYPE_CLASS: return createID_GEO_Kante_TypeClass();
			case VerweisePackage.ID_GEO_KNOTEN_TYPE_CLASS: return createID_GEO_Knoten_TypeClass();
			case VerweisePackage.ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS: return createID_GEO_Punkt_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_GEO_PUNKT_TYPE_CLASS: return createID_GEO_Punkt_TypeClass();
			case VerweisePackage.ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS: return createID_GFR_Anlage_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_GLEIS_ABSCHNITT_TYPE_CLASS: return createID_Gleis_Abschnitt_TypeClass();
			case VerweisePackage.ID_GLEIS_BEZEICHNUNG_TYPE_CLASS: return createID_Gleis_Bezeichnung_TypeClass();
			case VerweisePackage.ID_GRENZZEICHEN_TYPE_CLASS: return createID_Grenzzeichen_TypeClass();
			case VerweisePackage.ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS: return createID_Handschalt_Wirkfunktion_TypeClass();
			case VerweisePackage.ID_HOEHENPUNKT_TYPE_CLASS: return createID_Hoehenpunkt_TypeClass();
			case VerweisePackage.ID_INFORMATION_EINGANG_TYPE_CLASS: return createID_Information_Eingang_TypeClass();
			case VerweisePackage.ID_INFORMATION_PRIMAER_TYPE_CLASS: return createID_Information_Primaer_TypeClass();
			case VerweisePackage.ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS: return createID_Komponente_Programmiert_TypeClass();
			case VerweisePackage.ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS: return createID_Lageplan_Blattschnitt_TypeClass();
			case VerweisePackage.ID_LAGEPLAN_TYPE_CLASS: return createID_Lageplan_TypeClass();
			case VerweisePackage.ID_LAGEPLAN_ZUSTAND_TYPE_CLASS: return createID_Lageplan_Zustand_TypeClass();
			case VerweisePackage.ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS: return createID_LEU_Anlage_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_LEU_ANLAGE_TYPE_CLASS: return createID_LEU_Anlage_TypeClass();
			case VerweisePackage.ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS: return createID_LEU_Bezug_Funktional_TypeClass();
			case VerweisePackage.ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS: return createID_LEU_Schaltkasten_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_LO_EINBAU_TYPE_CLASS: return createID_LO_Einbau_TypeClass();
			case VerweisePackage.ID_MARKANTE_STELLE_TYPE_CLASS: return createID_Markante_Stelle_TypeClass();
			case VerweisePackage.ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS: return createID_Markanter_Punkt_Gleis_Abschluss_TypeClass();
			case VerweisePackage.ID_MARKANTER_PUNKT_TYPE_CLASS: return createID_Markanter_Punkt_TypeClass();
			case VerweisePackage.ID_NB_ELEMENT_TYPE_CLASS: return createID_NB_Element_TypeClass();
			case VerweisePackage.ID_NB_TYPE_CLASS: return createID_NB_TypeClass();
			case VerweisePackage.ID_NB_ZONE_TYPE_CLASS: return createID_NB_Zone_TypeClass();
			case VerweisePackage.ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS: return createID_Oertlichkeit_Ausgabe_TypeClass();
			case VerweisePackage.ID_OERTLICHKEIT_PROXY_TYPE_CLASS: return createID_Oertlichkeit_Proxy_TypeClass();
			case VerweisePackage.ID_OERTLICHKEIT_TYPE_CLASS: return createID_Oertlichkeit_TypeClass();
			case VerweisePackage.ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS: return createID_PlanPro_Schnittstelle_TypeClass();
			case VerweisePackage.ID_PLANUNG_EINZEL_TYPE_CLASS: return createID_Planung_Einzel_TypeClass();
			case VerweisePackage.ID_PLANUNGSGRUNDLAGE_TYPE_CLASS: return createID_Planungsgrundlage_TypeClass();
			case VerweisePackage.ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS: return createID_PZB_Element_Bezugspunkt_TypeClass();
			case VerweisePackage.ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS: return createID_PZB_Element_Mitnutzung_TypeClass();
			case VerweisePackage.ID_PZB_ELEMENT_TYPE_CLASS: return createID_PZB_Element_TypeClass();
			case VerweisePackage.ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS: return createID_PZB_Element_Zuordnung_TypeClass();
			case VerweisePackage.ID_QUELLELEMENT_TYPE_CLASS: return createID_Quellelement_TypeClass();
			case VerweisePackage.ID_RBC_TYPE_CLASS: return createID_RBC_TypeClass();
			case VerweisePackage.ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS: return createID_Regelzeichnung_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_REGELZEICHNUNG_TYPE_CLASS: return createID_Regelzeichnung_TypeClass();
			case VerweisePackage.ID_SCHALTER_TYPE_CLASS: return createID_Schalter_TypeClass();
			case VerweisePackage.ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS: return createID_Schaltmittel_Zuordnung_TypeClass();
			case VerweisePackage.ID_SCHLOSSKOMBINATION_TYPE_CLASS: return createID_Schlosskombination_TypeClass();
			case VerweisePackage.ID_SCHLUESSEL_TYPE_CLASS: return createID_Schluessel_TypeClass();
			case VerweisePackage.ID_SCHLUESSELSPERRE_TYPE_CLASS: return createID_Schluesselsperre_TypeClass();
			case VerweisePackage.ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS: return createID_Signal_Befestigung_TypeClass();
			case VerweisePackage.ID_SIGNAL_FANK_TYPE_CLASS: return createID_Signal_Fank_TypeClass();
			case VerweisePackage.ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS: return createID_Signal_Gleisbezechnung_TypeClass();
			case VerweisePackage.ID_SIGNAL_OHNE_PROXY_TYPE_CLASS: return createID_Signal_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_SIGNAL_RAHMEN_TYPE_CLASS: return createID_Signal_Rahmen_TypeClass();
			case VerweisePackage.ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS: return createID_Signal_Signalbegriff_TypeClass();
			case VerweisePackage.ID_SIGNAL_START_TYPE_CLASS: return createID_Signal_Start_TypeClass();
			case VerweisePackage.ID_SIGNAL_TYPE_CLASS: return createID_Signal_TypeClass();
			case VerweisePackage.ID_SONDERANLAGE_TYPE_CLASS: return createID_Sonderanlage_TypeClass();
			case VerweisePackage.ID_STELLELEMENT_TYPE_CLASS: return createID_Stellelement_TypeClass();
			case VerweisePackage.ID_STELLWERK_TYPE_CLASS: return createID_Stellwerk_TypeClass();
			case VerweisePackage.ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS: return createID_Strecke_Bremsweg_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_STRECKE_PUNKT_TYPE_CLASS: return createID_Strecke_Punkt_TypeClass();
			case VerweisePackage.ID_STRECKE_TYPE_CLASS: return createID_Strecke_TypeClass();
			case VerweisePackage.ID_TECHNISCHER_PUNKT_TYPE_CLASS: return createID_Technischer_Punkt_TypeClass();
			case VerweisePackage.ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS: return createID_TOP_Kante_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_TOP_KANTE_TYPE_CLASS: return createID_TOP_Kante_TypeClass();
			case VerweisePackage.ID_TOP_KNOTEN_TYPE_CLASS: return createID_TOP_Knoten_TypeClass();
			case VerweisePackage.ID_TRASSE_KANTE_TYPE_CLASS: return createID_Trasse_Kante_TypeClass();
			case VerweisePackage.ID_TRASSE_KNOTEN_TYPE_CLASS: return createID_Trasse_Knoten_TypeClass();
			case VerweisePackage.ID_UEBERHOEHUNG_TYPE_CLASS: return createID_Ueberhoehung_TypeClass();
			case VerweisePackage.ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS: return createID_Uebertragungsweg_Nach_TypeClass();
			case VerweisePackage.ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS: return createID_Uebertragungsweg_Von_TypeClass();
			case VerweisePackage.ID_UMFAHRPUNKT_TYPE_CLASS: return createID_Umfahrpunkt_TypeClass();
			case VerweisePackage.ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS: return createID_Unterbringung_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS: return createID_Unterbringung_Technik_TypeClass();
			case VerweisePackage.ID_UNTERBRINGUNG_TYPE_CLASS: return createID_Unterbringung_TypeClass();
			case VerweisePackage.ID_UR_OBJEKT_TYPE_CLASS: return createID_Ur_Objekt_TypeClass();
			case VerweisePackage.ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS: return createID_Verknuepftes_Element_TypeClass();
			case VerweisePackage.ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS: return createID_W_Kr_Anlage_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_WKR_ANLAGE_TYPE_CLASS: return createID_W_Kr_Anlage_TypeClass();
			case VerweisePackage.ID_WKR_GSP_ELEMENT_TYPE_CLASS: return createID_W_Kr_Gsp_Element_TypeClass();
			case VerweisePackage.ID_WKR_GSP_KOMPONENTE_TYPE_CLASS: return createID_W_Kr_Gsp_Komponente_TypeClass();
			case VerweisePackage.ID_WEICHENLAUFKETTE_TYPE_CLASS: return createID_Weichenlaufkette_TypeClass();
			case VerweisePackage.ID_ZIEL_TYPE_CLASS: return createID_Ziel_TypeClass();
			case VerweisePackage.ID_ZL_DLP_FSTR_TYPE_CLASS: return createID_ZL_DLP_Fstr_TypeClass();
			case VerweisePackage.ID_ZL_FSTR_TYPE_CLASS: return createID_ZL_Fstr_TypeClass();
			case VerweisePackage.ID_ZL_SIGNALGRUPPE_TYPE_CLASS: return createID_ZL_Signalgruppe_TypeClass();
			case VerweisePackage.ID_ZL_TYPE_CLASS: return createID_ZL_TypeClass();
			case VerweisePackage.ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS: return createID_ZLV_Bus_ohne_Proxy_TypeClass();
			case VerweisePackage.ID_ZLV_BUS_TYPE_CLASS: return createID_ZLV_Bus_TypeClass();
			case VerweisePackage.ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS: return createID_ZN_Anzeigefeld_Anstoss_TypeClass();
			case VerweisePackage.ID_ZN_ANZEIGEFELD_TYPE_CLASS: return createID_ZN_Anzeigefeld_TypeClass();
			case VerweisePackage.ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS: return createID_ZN_Fortschalt_Kriterium_TypeClass();
			case VerweisePackage.ID_ZN_TYPE_CLASS: return createID_ZN_TypeClass();
			case VerweisePackage.ID_ZN_UNTERSTATION_TYPE_CLASS: return createID_ZN_Unterstation_TypeClass();
			case VerweisePackage.ID_ZN_ZBS_TYPE_CLASS: return createID_ZN_ZBS_TypeClass();
			case VerweisePackage.ID_ZUGEINWIRKUNG_TYPE_CLASS: return createID_Zugeinwirkung_TypeClass();
			case VerweisePackage.ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS: return createID_Zweites_Haltfallkriterium_TypeClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anforderer_Element_TypeClass createID_Anforderer_Element_TypeClass() {
		ID_Anforderer_Element_TypeClassImpl iD_Anforderer_Element_TypeClass = new ID_Anforderer_Element_TypeClassImpl();
		return iD_Anforderer_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anforderung_TypeClass createID_Anforderung_TypeClass() {
		ID_Anforderung_TypeClassImpl iD_Anforderung_TypeClass = new ID_Anforderung_TypeClassImpl();
		return iD_Anforderung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_ohne_Proxy_TypeClass createID_Anhang_ohne_Proxy_TypeClass() {
		ID_Anhang_ohne_Proxy_TypeClassImpl iD_Anhang_ohne_Proxy_TypeClass = new ID_Anhang_ohne_Proxy_TypeClassImpl();
		return iD_Anhang_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass createID_Anhang_TypeClass() {
		ID_Anhang_TypeClassImpl iD_Anhang_TypeClass = new ID_Anhang_TypeClassImpl();
		return iD_Anhang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_AnhangBearbeitungsvermerk_TypeClass createID_AnhangBearbeitungsvermerk_TypeClass() {
		ID_AnhangBearbeitungsvermerk_TypeClassImpl iD_AnhangBearbeitungsvermerk_TypeClass = new ID_AnhangBearbeitungsvermerk_TypeClassImpl();
		return iD_AnhangBearbeitungsvermerk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anschluss_Element_TypeClass createID_Anschluss_Element_TypeClass() {
		ID_Anschluss_Element_TypeClassImpl iD_Anschluss_Element_TypeClass = new ID_Anschluss_Element_TypeClassImpl();
		return iD_Anschluss_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ATO_TS_Instanz_ohne_Proxy_TypeClass createID_ATO_TS_Instanz_ohne_Proxy_TypeClass() {
		ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl iD_ATO_TS_Instanz_ohne_Proxy_TypeClass = new ID_ATO_TS_Instanz_ohne_Proxy_TypeClassImpl();
		return iD_ATO_TS_Instanz_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ATO_TS_Instanz_TypeClass createID_ATO_TS_Instanz_TypeClass() {
		ID_ATO_TS_Instanz_TypeClassImpl iD_ATO_TS_Instanz_TypeClass = new ID_ATO_TS_Instanz_TypeClassImpl();
		return iD_ATO_TS_Instanz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass createID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass() {
		ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass = new ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassImpl();
		return iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_ohne_Proxy_TypeClass createID_Aussenelementansteuerung_ohne_Proxy_TypeClass() {
		ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl iD_Aussenelementansteuerung_ohne_Proxy_TypeClass = new ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl();
		return iD_Aussenelementansteuerung_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass createID_Aussenelementansteuerung_TypeClass() {
		ID_Aussenelementansteuerung_TypeClassImpl iD_Aussenelementansteuerung_TypeClass = new ID_Aussenelementansteuerung_TypeClassImpl();
		return iD_Aussenelementansteuerung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Anlage_TypeClass createID_Bahnsteig_Anlage_TypeClass() {
		ID_Bahnsteig_Anlage_TypeClassImpl iD_Bahnsteig_Anlage_TypeClass = new ID_Bahnsteig_Anlage_TypeClassImpl();
		return iD_Bahnsteig_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Kante_ohne_Proxy_TypeClass createID_Bahnsteig_Kante_ohne_Proxy_TypeClass() {
		ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl iD_Bahnsteig_Kante_ohne_Proxy_TypeClass = new ID_Bahnsteig_Kante_ohne_Proxy_TypeClassImpl();
		return iD_Bahnsteig_Kante_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Kante_TypeClass createID_Bahnsteig_Kante_TypeClass() {
		ID_Bahnsteig_Kante_TypeClassImpl iD_Bahnsteig_Kante_TypeClass = new ID_Bahnsteig_Kante_TypeClassImpl();
		return iD_Bahnsteig_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Balise_ohne_Proxy_TypeClass createID_Balise_ohne_Proxy_TypeClass() {
		ID_Balise_ohne_Proxy_TypeClassImpl iD_Balise_ohne_Proxy_TypeClass = new ID_Balise_ohne_Proxy_TypeClassImpl();
		return iD_Balise_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Balise_TypeClass createID_Balise_TypeClass() {
		ID_Balise_TypeClassImpl iD_Balise_TypeClass = new ID_Balise_TypeClassImpl();
		return iD_Balise_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Basis_Objekt_TypeClass createID_Basis_Objekt_TypeClass() {
		ID_Basis_Objekt_TypeClassImpl iD_Basis_Objekt_TypeClass = new ID_Basis_Objekt_TypeClassImpl();
		return iD_Basis_Objekt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Anzeige_Element_TypeClass createID_Bedien_Anzeige_Element_TypeClass() {
		ID_Bedien_Anzeige_Element_TypeClassImpl iD_Bedien_Anzeige_Element_TypeClass = new ID_Bedien_Anzeige_Element_TypeClassImpl();
		return iD_Bedien_Anzeige_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass createID_Bedien_Bezirk_TypeClass() {
		ID_Bedien_Bezirk_TypeClassImpl iD_Bedien_Bezirk_TypeClass = new ID_Bedien_Bezirk_TypeClassImpl();
		return iD_Bedien_Bezirk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Einrichtung_Oertlich_TypeClass createID_Bedien_Einrichtung_Oertlich_TypeClass() {
		ID_Bedien_Einrichtung_Oertlich_TypeClassImpl iD_Bedien_Einrichtung_Oertlich_TypeClass = new ID_Bedien_Einrichtung_Oertlich_TypeClassImpl();
		return iD_Bedien_Einrichtung_Oertlich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Oberflaeche_TypeClass createID_Bedien_Oberflaeche_TypeClass() {
		ID_Bedien_Oberflaeche_TypeClassImpl iD_Bedien_Oberflaeche_TypeClass = new ID_Bedien_Oberflaeche_TypeClassImpl();
		return iD_Bedien_Oberflaeche_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Standort_TypeClass createID_Bedien_Standort_TypeClass() {
		ID_Bedien_Standort_TypeClassImpl iD_Bedien_Standort_TypeClass = new ID_Bedien_Standort_TypeClassImpl();
		return iD_Bedien_Standort_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Zentrale_TypeClass createID_Bedien_Zentrale_TypeClass() {
		ID_Bedien_Zentrale_TypeClassImpl iD_Bedien_Zentrale_TypeClass = new ID_Bedien_Zentrale_TypeClassImpl();
		return iD_Bedien_Zentrale_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Befestigung_Bauwerk_TypeClass createID_Befestigung_Bauwerk_TypeClass() {
		ID_Befestigung_Bauwerk_TypeClassImpl iD_Befestigung_Bauwerk_TypeClass = new ID_Befestigung_Bauwerk_TypeClassImpl();
		return iD_Befestigung_Bauwerk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Beginn_Bereich_TypeClass createID_Beginn_Bereich_TypeClass() {
		ID_Beginn_Bereich_TypeClassImpl iD_Beginn_Bereich_TypeClass = new ID_Beginn_Bereich_TypeClassImpl();
		return iD_Beginn_Bereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bezugspunkt_Positionierung_TypeClass createID_Bezugspunkt_Positionierung_TypeClass() {
		ID_Bezugspunkt_Positionierung_TypeClassImpl iD_Bezugspunkt_Positionierung_TypeClass = new ID_Bezugspunkt_Positionierung_TypeClassImpl();
		return iD_Bezugspunkt_Positionierung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdaten_ohne_Proxy_TypeClass createID_Binaerdaten_ohne_Proxy_TypeClass() {
		ID_Binaerdaten_ohne_Proxy_TypeClassImpl iD_Binaerdaten_ohne_Proxy_TypeClass = new ID_Binaerdaten_ohne_Proxy_TypeClassImpl();
		return iD_Binaerdaten_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Anlage_TypeClass createID_Block_Anlage_TypeClass() {
		ID_Block_Anlage_TypeClassImpl iD_Block_Anlage_TypeClass = new ID_Block_Anlage_TypeClassImpl();
		return iD_Block_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Element_TypeClass createID_Block_Element_TypeClass() {
		ID_Block_Element_TypeClassImpl iD_Block_Element_TypeClass = new ID_Block_Element_TypeClassImpl();
		return iD_Block_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Block_Strecke_TypeClass createID_Block_Strecke_TypeClass() {
		ID_Block_Strecke_TypeClassImpl iD_Block_Strecke_TypeClass = new ID_Block_Strecke_TypeClassImpl();
		return iD_Block_Strecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Anlage_ohne_Proxy_TypeClass createID_BUE_Anlage_ohne_Proxy_TypeClass() {
		ID_BUE_Anlage_ohne_Proxy_TypeClassImpl iD_BUE_Anlage_ohne_Proxy_TypeClass = new ID_BUE_Anlage_ohne_Proxy_TypeClassImpl();
		return iD_BUE_Anlage_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Anlage_TypeClass createID_BUE_Anlage_TypeClass() {
		ID_BUE_Anlage_TypeClassImpl iD_BUE_Anlage_TypeClass = new ID_BUE_Anlage_TypeClassImpl();
		return iD_BUE_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Bedien_Anzeige_Element_TypeClass createID_BUE_Bedien_Anzeige_Element_TypeClass() {
		ID_BUE_Bedien_Anzeige_Element_TypeClassImpl iD_BUE_Bedien_Anzeige_Element_TypeClass = new ID_BUE_Bedien_Anzeige_Element_TypeClassImpl();
		return iD_BUE_Bedien_Anzeige_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Einschaltung_TypeClass createID_BUE_Einschaltung_TypeClass() {
		ID_BUE_Einschaltung_TypeClassImpl iD_BUE_Einschaltung_TypeClass = new ID_BUE_Einschaltung_TypeClassImpl();
		return iD_BUE_Einschaltung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Gleisbezogener_Gefahrraum_TypeClass createID_BUE_Gleisbezogener_Gefahrraum_TypeClass() {
		ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl iD_BUE_Gleisbezogener_Gefahrraum_TypeClass = new ID_BUE_Gleisbezogener_Gefahrraum_TypeClassImpl();
		return iD_BUE_Gleisbezogener_Gefahrraum_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Schnittstelle_TypeClass createID_BUE_Schnittstelle_TypeClass() {
		ID_BUE_Schnittstelle_TypeClassImpl iD_BUE_Schnittstelle_TypeClass = new ID_BUE_Schnittstelle_TypeClassImpl();
		return iD_BUE_Schnittstelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_WS_Fstr_Zuordnung_TypeClass createID_BUE_WS_Fstr_Zuordnung_TypeClass() {
		ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl iD_BUE_WS_Fstr_Zuordnung_TypeClass = new ID_BUE_WS_Fstr_Zuordnung_TypeClassImpl();
		return iD_BUE_WS_Fstr_Zuordnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_ohne_Proxy_TypeClass createID_Datenpunkt_ohne_Proxy_TypeClass() {
		ID_Datenpunkt_ohne_Proxy_TypeClassImpl iD_Datenpunkt_ohne_Proxy_TypeClass = new ID_Datenpunkt_ohne_Proxy_TypeClassImpl();
		return iD_Datenpunkt_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Datenpunkt_TypeClass createID_Datenpunkt_TypeClass() {
		ID_Datenpunkt_TypeClassImpl iD_Datenpunkt_TypeClass = new ID_Datenpunkt_TypeClassImpl();
		return iD_Datenpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_DP_Bezug_Funktional_TypeClass createID_DP_Bezug_Funktional_TypeClass() {
		ID_DP_Bezug_Funktional_TypeClassImpl iD_DP_Bezug_Funktional_TypeClass = new ID_DP_Bezug_Funktional_TypeClassImpl();
		return iD_DP_Bezug_Funktional_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Einschaltpunkt_TypeClass createID_Einschaltpunkt_TypeClass() {
		ID_Einschaltpunkt_TypeClassImpl iD_Einschaltpunkt_TypeClass = new ID_Einschaltpunkt_TypeClassImpl();
		return iD_Einschaltpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Element_Grenze_TypeClass createID_Element_Grenze_TypeClass() {
		ID_Element_Grenze_TypeClassImpl iD_Element_Grenze_TypeClass = new ID_Element_Grenze_TypeClassImpl();
		return iD_Element_Grenze_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Element_TypeClass createID_Element_TypeClass() {
		ID_Element_TypeClassImpl iD_Element_TypeClass = new ID_Element_TypeClassImpl();
		return iD_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Element_Unterbringung_TypeClass createID_Element_Unterbringung_TypeClass() {
		ID_Element_Unterbringung_TypeClassImpl iD_Element_Unterbringung_TypeClass = new ID_Element_Unterbringung_TypeClassImpl();
		return iD_Element_Unterbringung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Energie_Eingang_TypeClass createID_Energie_Eingang_TypeClass() {
		ID_Energie_Eingang_TypeClassImpl iD_Energie_Eingang_TypeClass = new ID_Energie_Eingang_TypeClassImpl();
		return iD_Energie_Eingang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Energie_TypeClass createID_Energie_TypeClass() {
		ID_Energie_TypeClassImpl iD_Energie_TypeClass = new ID_Energie_TypeClassImpl();
		return iD_Energie_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ESTW_Zentraleinheit_TypeClass createID_ESTW_Zentraleinheit_TypeClass() {
		ID_ESTW_Zentraleinheit_TypeClassImpl iD_ESTW_Zentraleinheit_TypeClass = new ID_ESTW_Zentraleinheit_TypeClassImpl();
		return iD_ESTW_Zentraleinheit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Kante_TypeClass createID_ETCS_Kante_TypeClass() {
		ID_ETCS_Kante_TypeClassImpl iD_ETCS_Kante_TypeClass = new ID_ETCS_Kante_TypeClassImpl();
		return iD_ETCS_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Knoten_ohne_Proxy_TypeClass createID_ETCS_Knoten_ohne_Proxy_TypeClass() {
		ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl iD_ETCS_Knoten_ohne_Proxy_TypeClass = new ID_ETCS_Knoten_ohne_Proxy_TypeClassImpl();
		return iD_ETCS_Knoten_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Knoten_TypeClass createID_ETCS_Knoten_TypeClass() {
		ID_ETCS_Knoten_TypeClassImpl iD_ETCS_Knoten_TypeClass = new ID_ETCS_Knoten_TypeClassImpl();
		return iD_ETCS_Knoten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_EV_Modul_TypeClass createID_EV_Modul_TypeClass() {
		ID_EV_Modul_TypeClassImpl iD_EV_Modul_TypeClass = new ID_EV_Modul_TypeClassImpl();
		return iD_EV_Modul_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fachtelegramm_ohne_Proxy_TypeClass createID_Fachtelegramm_ohne_Proxy_TypeClass() {
		ID_Fachtelegramm_ohne_Proxy_TypeClassImpl iD_Fachtelegramm_ohne_Proxy_TypeClass = new ID_Fachtelegramm_ohne_Proxy_TypeClassImpl();
		return iD_Fachtelegramm_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fachtelegramm_TypeClass createID_Fachtelegramm_TypeClass() {
		ID_Fachtelegramm_TypeClassImpl iD_Fachtelegramm_TypeClass = new ID_Fachtelegramm_TypeClassImpl();
		return iD_Fachtelegramm_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fla_Schutz_TypeClass createID_Fla_Schutz_TypeClass() {
		ID_Fla_Schutz_TypeClassImpl iD_Fla_Schutz_TypeClass = new ID_Fla_Schutz_TypeClassImpl();
		return iD_Fla_Schutz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Anlage_Rangier_Frei_TypeClass createID_FMA_Anlage_Rangier_Frei_TypeClass() {
		ID_FMA_Anlage_Rangier_Frei_TypeClassImpl iD_FMA_Anlage_Rangier_Frei_TypeClass = new ID_FMA_Anlage_Rangier_Frei_TypeClassImpl();
		return iD_FMA_Anlage_Rangier_Frei_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Anlage_TypeClass createID_FMA_Anlage_TypeClass() {
		ID_FMA_Anlage_TypeClassImpl iD_FMA_Anlage_TypeClass = new ID_FMA_Anlage_TypeClassImpl();
		return iD_FMA_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Element_TypeClass createID_FMA_Element_TypeClass() {
		ID_FMA_Element_TypeClassImpl iD_FMA_Element_TypeClass = new ID_FMA_Element_TypeClassImpl();
		return iD_FMA_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Komponente_TypeClass createID_FMA_Komponente_TypeClass() {
		ID_FMA_Komponente_TypeClassImpl iD_FMA_Komponente_TypeClass = new ID_FMA_Komponente_TypeClassImpl();
		return iD_FMA_Komponente_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fortschaltung_Start_TypeClass createID_Fortschaltung_Start_TypeClass() {
		ID_Fortschaltung_Start_TypeClassImpl iD_Fortschaltung_Start_TypeClass = new ID_Fortschaltung_Start_TypeClassImpl();
		return iD_Fortschaltung_Start_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Aneinander_TypeClass createID_Fstr_Aneinander_TypeClass() {
		ID_Fstr_Aneinander_TypeClassImpl iD_Fstr_Aneinander_TypeClass = new ID_Fstr_Aneinander_TypeClassImpl();
		return iD_Fstr_Aneinander_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Ausschluss_Besonders_TypeClass createID_Fstr_Ausschluss_Besonders_TypeClass() {
		ID_Fstr_Ausschluss_Besonders_TypeClassImpl iD_Fstr_Ausschluss_Besonders_TypeClass = new ID_Fstr_Ausschluss_Besonders_TypeClassImpl();
		return iD_Fstr_Ausschluss_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_DWeg_ohne_Proxy_TypeClass createID_Fstr_DWeg_ohne_Proxy_TypeClass() {
		ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl iD_Fstr_DWeg_ohne_Proxy_TypeClass = new ID_Fstr_DWeg_ohne_Proxy_TypeClassImpl();
		return iD_Fstr_DWeg_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_DWeg_TypeClass createID_Fstr_DWeg_TypeClass() {
		ID_Fstr_DWeg_TypeClassImpl iD_Fstr_DWeg_TypeClass = new ID_Fstr_DWeg_TypeClassImpl();
		return iD_Fstr_DWeg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Fahrweg_ohne_Proxy_TypeClass createID_Fstr_Fahrweg_ohne_Proxy_TypeClass() {
		ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl iD_Fstr_Fahrweg_ohne_Proxy_TypeClass = new ID_Fstr_Fahrweg_ohne_Proxy_TypeClassImpl();
		return iD_Fstr_Fahrweg_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Fahrweg_TypeClass createID_Fstr_Fahrweg_TypeClass() {
		ID_Fstr_Fahrweg_TypeClassImpl iD_Fstr_Fahrweg_TypeClass = new ID_Fstr_Fahrweg_TypeClassImpl();
		return iD_Fstr_Fahrweg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass createID_Fstr_Zug_Rangier_TypeClass() {
		ID_Fstr_Zug_Rangier_TypeClassImpl iD_Fstr_Zug_Rangier_TypeClass = new ID_Fstr_Zug_Rangier_TypeClassImpl();
		return iD_Fstr_Zug_Rangier_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FT_Anschaltbedingung_TypeClass createID_FT_Anschaltbedingung_TypeClass() {
		ID_FT_Anschaltbedingung_TypeClassImpl iD_FT_Anschaltbedingung_TypeClass = new ID_FT_Anschaltbedingung_TypeClassImpl();
		return iD_FT_Anschaltbedingung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FT_Fahrweg_Teil_TypeClass createID_FT_Fahrweg_Teil_TypeClass() {
		ID_FT_Fahrweg_Teil_TypeClassImpl iD_FT_Fahrweg_Teil_TypeClass = new ID_FT_Fahrweg_Teil_TypeClassImpl();
		return iD_FT_Fahrweg_Teil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Art_TypeClass createID_GEO_Art_TypeClass() {
		ID_GEO_Art_TypeClassImpl iD_GEO_Art_TypeClass = new ID_GEO_Art_TypeClassImpl();
		return iD_GEO_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Kante_TypeClass createID_GEO_Kante_TypeClass() {
		ID_GEO_Kante_TypeClassImpl iD_GEO_Kante_TypeClass = new ID_GEO_Kante_TypeClassImpl();
		return iD_GEO_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Knoten_TypeClass createID_GEO_Knoten_TypeClass() {
		ID_GEO_Knoten_TypeClassImpl iD_GEO_Knoten_TypeClass = new ID_GEO_Knoten_TypeClassImpl();
		return iD_GEO_Knoten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Punkt_ohne_Proxy_TypeClass createID_GEO_Punkt_ohne_Proxy_TypeClass() {
		ID_GEO_Punkt_ohne_Proxy_TypeClassImpl iD_GEO_Punkt_ohne_Proxy_TypeClass = new ID_GEO_Punkt_ohne_Proxy_TypeClassImpl();
		return iD_GEO_Punkt_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Punkt_TypeClass createID_GEO_Punkt_TypeClass() {
		ID_GEO_Punkt_TypeClassImpl iD_GEO_Punkt_TypeClass = new ID_GEO_Punkt_TypeClassImpl();
		return iD_GEO_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GFR_Anlage_ohne_Proxy_TypeClass createID_GFR_Anlage_ohne_Proxy_TypeClass() {
		ID_GFR_Anlage_ohne_Proxy_TypeClassImpl iD_GFR_Anlage_ohne_Proxy_TypeClass = new ID_GFR_Anlage_ohne_Proxy_TypeClassImpl();
		return iD_GFR_Anlage_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass createID_Gleis_Abschnitt_TypeClass() {
		ID_Gleis_Abschnitt_TypeClassImpl iD_Gleis_Abschnitt_TypeClass = new ID_Gleis_Abschnitt_TypeClassImpl();
		return iD_Gleis_Abschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Bezeichnung_TypeClass createID_Gleis_Bezeichnung_TypeClass() {
		ID_Gleis_Bezeichnung_TypeClassImpl iD_Gleis_Bezeichnung_TypeClass = new ID_Gleis_Bezeichnung_TypeClassImpl();
		return iD_Gleis_Bezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Grenzzeichen_TypeClass createID_Grenzzeichen_TypeClass() {
		ID_Grenzzeichen_TypeClassImpl iD_Grenzzeichen_TypeClass = new ID_Grenzzeichen_TypeClassImpl();
		return iD_Grenzzeichen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Handschalt_Wirkfunktion_TypeClass createID_Handschalt_Wirkfunktion_TypeClass() {
		ID_Handschalt_Wirkfunktion_TypeClassImpl iD_Handschalt_Wirkfunktion_TypeClass = new ID_Handschalt_Wirkfunktion_TypeClassImpl();
		return iD_Handschalt_Wirkfunktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Hoehenpunkt_TypeClass createID_Hoehenpunkt_TypeClass() {
		ID_Hoehenpunkt_TypeClassImpl iD_Hoehenpunkt_TypeClass = new ID_Hoehenpunkt_TypeClassImpl();
		return iD_Hoehenpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Information_Eingang_TypeClass createID_Information_Eingang_TypeClass() {
		ID_Information_Eingang_TypeClassImpl iD_Information_Eingang_TypeClass = new ID_Information_Eingang_TypeClassImpl();
		return iD_Information_Eingang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Information_Primaer_TypeClass createID_Information_Primaer_TypeClass() {
		ID_Information_Primaer_TypeClassImpl iD_Information_Primaer_TypeClass = new ID_Information_Primaer_TypeClassImpl();
		return iD_Information_Primaer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Komponente_Programmiert_TypeClass createID_Komponente_Programmiert_TypeClass() {
		ID_Komponente_Programmiert_TypeClassImpl iD_Komponente_Programmiert_TypeClass = new ID_Komponente_Programmiert_TypeClassImpl();
		return iD_Komponente_Programmiert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Lageplan_Blattschnitt_TypeClass createID_Lageplan_Blattschnitt_TypeClass() {
		ID_Lageplan_Blattschnitt_TypeClassImpl iD_Lageplan_Blattschnitt_TypeClass = new ID_Lageplan_Blattschnitt_TypeClassImpl();
		return iD_Lageplan_Blattschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Lageplan_TypeClass createID_Lageplan_TypeClass() {
		ID_Lageplan_TypeClassImpl iD_Lageplan_TypeClass = new ID_Lageplan_TypeClassImpl();
		return iD_Lageplan_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Lageplan_Zustand_TypeClass createID_Lageplan_Zustand_TypeClass() {
		ID_Lageplan_Zustand_TypeClassImpl iD_Lageplan_Zustand_TypeClass = new ID_Lageplan_Zustand_TypeClassImpl();
		return iD_Lageplan_Zustand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Anlage_ohne_Proxy_TypeClass createID_LEU_Anlage_ohne_Proxy_TypeClass() {
		ID_LEU_Anlage_ohne_Proxy_TypeClassImpl iD_LEU_Anlage_ohne_Proxy_TypeClass = new ID_LEU_Anlage_ohne_Proxy_TypeClassImpl();
		return iD_LEU_Anlage_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Anlage_TypeClass createID_LEU_Anlage_TypeClass() {
		ID_LEU_Anlage_TypeClassImpl iD_LEU_Anlage_TypeClass = new ID_LEU_Anlage_TypeClassImpl();
		return iD_LEU_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Bezug_Funktional_TypeClass createID_LEU_Bezug_Funktional_TypeClass() {
		ID_LEU_Bezug_Funktional_TypeClassImpl iD_LEU_Bezug_Funktional_TypeClass = new ID_LEU_Bezug_Funktional_TypeClassImpl();
		return iD_LEU_Bezug_Funktional_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Schaltkasten_ohne_Proxy_TypeClass createID_LEU_Schaltkasten_ohne_Proxy_TypeClass() {
		ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl iD_LEU_Schaltkasten_ohne_Proxy_TypeClass = new ID_LEU_Schaltkasten_ohne_Proxy_TypeClassImpl();
		return iD_LEU_Schaltkasten_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LO_Einbau_TypeClass createID_LO_Einbau_TypeClass() {
		ID_LO_Einbau_TypeClassImpl iD_LO_Einbau_TypeClass = new ID_LO_Einbau_TypeClassImpl();
		return iD_LO_Einbau_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markante_Stelle_TypeClass createID_Markante_Stelle_TypeClass() {
		ID_Markante_Stelle_TypeClassImpl iD_Markante_Stelle_TypeClass = new ID_Markante_Stelle_TypeClassImpl();
		return iD_Markante_Stelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_Gleis_Abschluss_TypeClass createID_Markanter_Punkt_Gleis_Abschluss_TypeClass() {
		ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl iD_Markanter_Punkt_Gleis_Abschluss_TypeClass = new ID_Markanter_Punkt_Gleis_Abschluss_TypeClassImpl();
		return iD_Markanter_Punkt_Gleis_Abschluss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass createID_Markanter_Punkt_TypeClass() {
		ID_Markanter_Punkt_TypeClassImpl iD_Markanter_Punkt_TypeClass = new ID_Markanter_Punkt_TypeClassImpl();
		return iD_Markanter_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_Element_TypeClass createID_NB_Element_TypeClass() {
		ID_NB_Element_TypeClassImpl iD_NB_Element_TypeClass = new ID_NB_Element_TypeClassImpl();
		return iD_NB_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_TypeClass createID_NB_TypeClass() {
		ID_NB_TypeClassImpl iD_NB_TypeClass = new ID_NB_TypeClassImpl();
		return iD_NB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_Zone_TypeClass createID_NB_Zone_TypeClass() {
		ID_NB_Zone_TypeClassImpl iD_NB_Zone_TypeClass = new ID_NB_Zone_TypeClassImpl();
		return iD_NB_Zone_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Ausgabe_TypeClass createID_Oertlichkeit_Ausgabe_TypeClass() {
		ID_Oertlichkeit_Ausgabe_TypeClassImpl iD_Oertlichkeit_Ausgabe_TypeClass = new ID_Oertlichkeit_Ausgabe_TypeClassImpl();
		return iD_Oertlichkeit_Ausgabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass createID_Oertlichkeit_Proxy_TypeClass() {
		ID_Oertlichkeit_Proxy_TypeClassImpl iD_Oertlichkeit_Proxy_TypeClass = new ID_Oertlichkeit_Proxy_TypeClassImpl();
		return iD_Oertlichkeit_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_TypeClass createID_Oertlichkeit_TypeClass() {
		ID_Oertlichkeit_TypeClassImpl iD_Oertlichkeit_TypeClass = new ID_Oertlichkeit_TypeClassImpl();
		return iD_Oertlichkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PlanPro_Schnittstelle_TypeClass createID_PlanPro_Schnittstelle_TypeClass() {
		ID_PlanPro_Schnittstelle_TypeClassImpl iD_PlanPro_Schnittstelle_TypeClass = new ID_PlanPro_Schnittstelle_TypeClassImpl();
		return iD_PlanPro_Schnittstelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Planung_Einzel_TypeClass createID_Planung_Einzel_TypeClass() {
		ID_Planung_Einzel_TypeClassImpl iD_Planung_Einzel_TypeClass = new ID_Planung_Einzel_TypeClassImpl();
		return iD_Planung_Einzel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Planungsgrundlage_TypeClass createID_Planungsgrundlage_TypeClass() {
		ID_Planungsgrundlage_TypeClassImpl iD_Planungsgrundlage_TypeClass = new ID_Planungsgrundlage_TypeClassImpl();
		return iD_Planungsgrundlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Bezugspunkt_TypeClass createID_PZB_Element_Bezugspunkt_TypeClass() {
		ID_PZB_Element_Bezugspunkt_TypeClassImpl iD_PZB_Element_Bezugspunkt_TypeClass = new ID_PZB_Element_Bezugspunkt_TypeClassImpl();
		return iD_PZB_Element_Bezugspunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Mitnutzung_TypeClass createID_PZB_Element_Mitnutzung_TypeClass() {
		ID_PZB_Element_Mitnutzung_TypeClassImpl iD_PZB_Element_Mitnutzung_TypeClass = new ID_PZB_Element_Mitnutzung_TypeClassImpl();
		return iD_PZB_Element_Mitnutzung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_TypeClass createID_PZB_Element_TypeClass() {
		ID_PZB_Element_TypeClassImpl iD_PZB_Element_TypeClass = new ID_PZB_Element_TypeClassImpl();
		return iD_PZB_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Zuordnung_TypeClass createID_PZB_Element_Zuordnung_TypeClass() {
		ID_PZB_Element_Zuordnung_TypeClassImpl iD_PZB_Element_Zuordnung_TypeClass = new ID_PZB_Element_Zuordnung_TypeClassImpl();
		return iD_PZB_Element_Zuordnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Quellelement_TypeClass createID_Quellelement_TypeClass() {
		ID_Quellelement_TypeClassImpl iD_Quellelement_TypeClass = new ID_Quellelement_TypeClassImpl();
		return iD_Quellelement_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_RBC_TypeClass createID_RBC_TypeClass() {
		ID_RBC_TypeClassImpl iD_RBC_TypeClass = new ID_RBC_TypeClassImpl();
		return iD_RBC_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Regelzeichnung_ohne_Proxy_TypeClass createID_Regelzeichnung_ohne_Proxy_TypeClass() {
		ID_Regelzeichnung_ohne_Proxy_TypeClassImpl iD_Regelzeichnung_ohne_Proxy_TypeClass = new ID_Regelzeichnung_ohne_Proxy_TypeClassImpl();
		return iD_Regelzeichnung_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Regelzeichnung_TypeClass createID_Regelzeichnung_TypeClass() {
		ID_Regelzeichnung_TypeClassImpl iD_Regelzeichnung_TypeClass = new ID_Regelzeichnung_TypeClassImpl();
		return iD_Regelzeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schalter_TypeClass createID_Schalter_TypeClass() {
		ID_Schalter_TypeClassImpl iD_Schalter_TypeClass = new ID_Schalter_TypeClassImpl();
		return iD_Schalter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schaltmittel_Zuordnung_TypeClass createID_Schaltmittel_Zuordnung_TypeClass() {
		ID_Schaltmittel_Zuordnung_TypeClassImpl iD_Schaltmittel_Zuordnung_TypeClass = new ID_Schaltmittel_Zuordnung_TypeClassImpl();
		return iD_Schaltmittel_Zuordnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schlosskombination_TypeClass createID_Schlosskombination_TypeClass() {
		ID_Schlosskombination_TypeClassImpl iD_Schlosskombination_TypeClass = new ID_Schlosskombination_TypeClassImpl();
		return iD_Schlosskombination_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schluessel_TypeClass createID_Schluessel_TypeClass() {
		ID_Schluessel_TypeClassImpl iD_Schluessel_TypeClass = new ID_Schluessel_TypeClassImpl();
		return iD_Schluessel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schluesselsperre_TypeClass createID_Schluesselsperre_TypeClass() {
		ID_Schluesselsperre_TypeClassImpl iD_Schluesselsperre_TypeClass = new ID_Schluesselsperre_TypeClassImpl();
		return iD_Schluesselsperre_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Befestigung_TypeClass createID_Signal_Befestigung_TypeClass() {
		ID_Signal_Befestigung_TypeClassImpl iD_Signal_Befestigung_TypeClass = new ID_Signal_Befestigung_TypeClassImpl();
		return iD_Signal_Befestigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Fank_TypeClass createID_Signal_Fank_TypeClass() {
		ID_Signal_Fank_TypeClassImpl iD_Signal_Fank_TypeClass = new ID_Signal_Fank_TypeClassImpl();
		return iD_Signal_Fank_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Gleisbezechnung_TypeClass createID_Signal_Gleisbezechnung_TypeClass() {
		ID_Signal_Gleisbezechnung_TypeClassImpl iD_Signal_Gleisbezechnung_TypeClass = new ID_Signal_Gleisbezechnung_TypeClassImpl();
		return iD_Signal_Gleisbezechnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_ohne_Proxy_TypeClass createID_Signal_ohne_Proxy_TypeClass() {
		ID_Signal_ohne_Proxy_TypeClassImpl iD_Signal_ohne_Proxy_TypeClass = new ID_Signal_ohne_Proxy_TypeClassImpl();
		return iD_Signal_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Rahmen_TypeClass createID_Signal_Rahmen_TypeClass() {
		ID_Signal_Rahmen_TypeClassImpl iD_Signal_Rahmen_TypeClass = new ID_Signal_Rahmen_TypeClassImpl();
		return iD_Signal_Rahmen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Signalbegriff_TypeClass createID_Signal_Signalbegriff_TypeClass() {
		ID_Signal_Signalbegriff_TypeClassImpl iD_Signal_Signalbegriff_TypeClass = new ID_Signal_Signalbegriff_TypeClassImpl();
		return iD_Signal_Signalbegriff_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Start_TypeClass createID_Signal_Start_TypeClass() {
		ID_Signal_Start_TypeClassImpl iD_Signal_Start_TypeClass = new ID_Signal_Start_TypeClassImpl();
		return iD_Signal_Start_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass createID_Signal_TypeClass() {
		ID_Signal_TypeClassImpl iD_Signal_TypeClass = new ID_Signal_TypeClassImpl();
		return iD_Signal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Sonderanlage_TypeClass createID_Sonderanlage_TypeClass() {
		ID_Sonderanlage_TypeClassImpl iD_Sonderanlage_TypeClass = new ID_Sonderanlage_TypeClassImpl();
		return iD_Sonderanlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellelement_TypeClass createID_Stellelement_TypeClass() {
		ID_Stellelement_TypeClassImpl iD_Stellelement_TypeClass = new ID_Stellelement_TypeClassImpl();
		return iD_Stellelement_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellwerk_TypeClass createID_Stellwerk_TypeClass() {
		ID_Stellwerk_TypeClassImpl iD_Stellwerk_TypeClass = new ID_Stellwerk_TypeClassImpl();
		return iD_Stellwerk_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_Bremsweg_ohne_Proxy_TypeClass createID_Strecke_Bremsweg_ohne_Proxy_TypeClass() {
		ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl iD_Strecke_Bremsweg_ohne_Proxy_TypeClass = new ID_Strecke_Bremsweg_ohne_Proxy_TypeClassImpl();
		return iD_Strecke_Bremsweg_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_Punkt_TypeClass createID_Strecke_Punkt_TypeClass() {
		ID_Strecke_Punkt_TypeClassImpl iD_Strecke_Punkt_TypeClass = new ID_Strecke_Punkt_TypeClassImpl();
		return iD_Strecke_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_TypeClass createID_Strecke_TypeClass() {
		ID_Strecke_TypeClassImpl iD_Strecke_TypeClass = new ID_Strecke_TypeClassImpl();
		return iD_Strecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Technischer_Punkt_TypeClass createID_Technischer_Punkt_TypeClass() {
		ID_Technischer_Punkt_TypeClassImpl iD_Technischer_Punkt_TypeClass = new ID_Technischer_Punkt_TypeClassImpl();
		return iD_Technischer_Punkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_TOP_Kante_ohne_Proxy_TypeClass createID_TOP_Kante_ohne_Proxy_TypeClass() {
		ID_TOP_Kante_ohne_Proxy_TypeClassImpl iD_TOP_Kante_ohne_Proxy_TypeClass = new ID_TOP_Kante_ohne_Proxy_TypeClassImpl();
		return iD_TOP_Kante_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_TOP_Kante_TypeClass createID_TOP_Kante_TypeClass() {
		ID_TOP_Kante_TypeClassImpl iD_TOP_Kante_TypeClass = new ID_TOP_Kante_TypeClassImpl();
		return iD_TOP_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_TOP_Knoten_TypeClass createID_TOP_Knoten_TypeClass() {
		ID_TOP_Knoten_TypeClassImpl iD_TOP_Knoten_TypeClass = new ID_TOP_Knoten_TypeClassImpl();
		return iD_TOP_Knoten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Trasse_Kante_TypeClass createID_Trasse_Kante_TypeClass() {
		ID_Trasse_Kante_TypeClassImpl iD_Trasse_Kante_TypeClass = new ID_Trasse_Kante_TypeClassImpl();
		return iD_Trasse_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Trasse_Knoten_TypeClass createID_Trasse_Knoten_TypeClass() {
		ID_Trasse_Knoten_TypeClassImpl iD_Trasse_Knoten_TypeClass = new ID_Trasse_Knoten_TypeClassImpl();
		return iD_Trasse_Knoten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ueberhoehung_TypeClass createID_Ueberhoehung_TypeClass() {
		ID_Ueberhoehung_TypeClassImpl iD_Ueberhoehung_TypeClass = new ID_Ueberhoehung_TypeClassImpl();
		return iD_Ueberhoehung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Uebertragungsweg_Nach_TypeClass createID_Uebertragungsweg_Nach_TypeClass() {
		ID_Uebertragungsweg_Nach_TypeClassImpl iD_Uebertragungsweg_Nach_TypeClass = new ID_Uebertragungsweg_Nach_TypeClassImpl();
		return iD_Uebertragungsweg_Nach_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Uebertragungsweg_Von_TypeClass createID_Uebertragungsweg_Von_TypeClass() {
		ID_Uebertragungsweg_Von_TypeClassImpl iD_Uebertragungsweg_Von_TypeClass = new ID_Uebertragungsweg_Von_TypeClassImpl();
		return iD_Uebertragungsweg_Von_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Umfahrpunkt_TypeClass createID_Umfahrpunkt_TypeClass() {
		ID_Umfahrpunkt_TypeClassImpl iD_Umfahrpunkt_TypeClass = new ID_Umfahrpunkt_TypeClassImpl();
		return iD_Umfahrpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_ohne_Proxy_TypeClass createID_Unterbringung_ohne_Proxy_TypeClass() {
		ID_Unterbringung_ohne_Proxy_TypeClassImpl iD_Unterbringung_ohne_Proxy_TypeClass = new ID_Unterbringung_ohne_Proxy_TypeClassImpl();
		return iD_Unterbringung_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_Technik_TypeClass createID_Unterbringung_Technik_TypeClass() {
		ID_Unterbringung_Technik_TypeClassImpl iD_Unterbringung_Technik_TypeClass = new ID_Unterbringung_Technik_TypeClassImpl();
		return iD_Unterbringung_Technik_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_TypeClass createID_Unterbringung_TypeClass() {
		ID_Unterbringung_TypeClassImpl iD_Unterbringung_TypeClass = new ID_Unterbringung_TypeClassImpl();
		return iD_Unterbringung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ur_Objekt_TypeClass createID_Ur_Objekt_TypeClass() {
		ID_Ur_Objekt_TypeClassImpl iD_Ur_Objekt_TypeClass = new ID_Ur_Objekt_TypeClassImpl();
		return iD_Ur_Objekt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Verknuepftes_Element_TypeClass createID_Verknuepftes_Element_TypeClass() {
		ID_Verknuepftes_Element_TypeClassImpl iD_Verknuepftes_Element_TypeClass = new ID_Verknuepftes_Element_TypeClassImpl();
		return iD_Verknuepftes_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Anlage_ohne_Proxy_TypeClass createID_W_Kr_Anlage_ohne_Proxy_TypeClass() {
		ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl iD_W_Kr_Anlage_ohne_Proxy_TypeClass = new ID_W_Kr_Anlage_ohne_Proxy_TypeClassImpl();
		return iD_W_Kr_Anlage_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Anlage_TypeClass createID_W_Kr_Anlage_TypeClass() {
		ID_W_Kr_Anlage_TypeClassImpl iD_W_Kr_Anlage_TypeClass = new ID_W_Kr_Anlage_TypeClassImpl();
		return iD_W_Kr_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass createID_W_Kr_Gsp_Element_TypeClass() {
		ID_W_Kr_Gsp_Element_TypeClassImpl iD_W_Kr_Gsp_Element_TypeClass = new ID_W_Kr_Gsp_Element_TypeClassImpl();
		return iD_W_Kr_Gsp_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Komponente_TypeClass createID_W_Kr_Gsp_Komponente_TypeClass() {
		ID_W_Kr_Gsp_Komponente_TypeClassImpl iD_W_Kr_Gsp_Komponente_TypeClass = new ID_W_Kr_Gsp_Komponente_TypeClassImpl();
		return iD_W_Kr_Gsp_Komponente_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Weichenlaufkette_TypeClass createID_Weichenlaufkette_TypeClass() {
		ID_Weichenlaufkette_TypeClassImpl iD_Weichenlaufkette_TypeClass = new ID_Weichenlaufkette_TypeClassImpl();
		return iD_Weichenlaufkette_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ziel_TypeClass createID_Ziel_TypeClass() {
		ID_Ziel_TypeClassImpl iD_Ziel_TypeClass = new ID_Ziel_TypeClassImpl();
		return iD_Ziel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_DLP_Fstr_TypeClass createID_ZL_DLP_Fstr_TypeClass() {
		ID_ZL_DLP_Fstr_TypeClassImpl iD_ZL_DLP_Fstr_TypeClass = new ID_ZL_DLP_Fstr_TypeClassImpl();
		return iD_ZL_DLP_Fstr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Fstr_TypeClass createID_ZL_Fstr_TypeClass() {
		ID_ZL_Fstr_TypeClassImpl iD_ZL_Fstr_TypeClass = new ID_ZL_Fstr_TypeClassImpl();
		return iD_ZL_Fstr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Signalgruppe_TypeClass createID_ZL_Signalgruppe_TypeClass() {
		ID_ZL_Signalgruppe_TypeClassImpl iD_ZL_Signalgruppe_TypeClass = new ID_ZL_Signalgruppe_TypeClassImpl();
		return iD_ZL_Signalgruppe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_TypeClass createID_ZL_TypeClass() {
		ID_ZL_TypeClassImpl iD_ZL_TypeClass = new ID_ZL_TypeClassImpl();
		return iD_ZL_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZLV_Bus_ohne_Proxy_TypeClass createID_ZLV_Bus_ohne_Proxy_TypeClass() {
		ID_ZLV_Bus_ohne_Proxy_TypeClassImpl iD_ZLV_Bus_ohne_Proxy_TypeClass = new ID_ZLV_Bus_ohne_Proxy_TypeClassImpl();
		return iD_ZLV_Bus_ohne_Proxy_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZLV_Bus_TypeClass createID_ZLV_Bus_TypeClass() {
		ID_ZLV_Bus_TypeClassImpl iD_ZLV_Bus_TypeClass = new ID_ZLV_Bus_TypeClassImpl();
		return iD_ZLV_Bus_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_Anstoss_TypeClass createID_ZN_Anzeigefeld_Anstoss_TypeClass() {
		ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl iD_ZN_Anzeigefeld_Anstoss_TypeClass = new ID_ZN_Anzeigefeld_Anstoss_TypeClassImpl();
		return iD_ZN_Anzeigefeld_Anstoss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_TypeClass createID_ZN_Anzeigefeld_TypeClass() {
		ID_ZN_Anzeigefeld_TypeClassImpl iD_ZN_Anzeigefeld_TypeClass = new ID_ZN_Anzeigefeld_TypeClassImpl();
		return iD_ZN_Anzeigefeld_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Fortschalt_Kriterium_TypeClass createID_ZN_Fortschalt_Kriterium_TypeClass() {
		ID_ZN_Fortschalt_Kriterium_TypeClassImpl iD_ZN_Fortschalt_Kriterium_TypeClass = new ID_ZN_Fortschalt_Kriterium_TypeClassImpl();
		return iD_ZN_Fortschalt_Kriterium_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_TypeClass createID_ZN_TypeClass() {
		ID_ZN_TypeClassImpl iD_ZN_TypeClass = new ID_ZN_TypeClassImpl();
		return iD_ZN_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Unterstation_TypeClass createID_ZN_Unterstation_TypeClass() {
		ID_ZN_Unterstation_TypeClassImpl iD_ZN_Unterstation_TypeClass = new ID_ZN_Unterstation_TypeClassImpl();
		return iD_ZN_Unterstation_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_ZBS_TypeClass createID_ZN_ZBS_TypeClass() {
		ID_ZN_ZBS_TypeClassImpl iD_ZN_ZBS_TypeClass = new ID_ZN_ZBS_TypeClassImpl();
		return iD_ZN_ZBS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Zugeinwirkung_TypeClass createID_Zugeinwirkung_TypeClass() {
		ID_Zugeinwirkung_TypeClassImpl iD_Zugeinwirkung_TypeClass = new ID_Zugeinwirkung_TypeClassImpl();
		return iD_Zugeinwirkung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Zweites_Haltfallkriterium_TypeClass createID_Zweites_Haltfallkriterium_TypeClass() {
		ID_Zweites_Haltfallkriterium_TypeClassImpl iD_Zweites_Haltfallkriterium_TypeClass = new ID_Zweites_Haltfallkriterium_TypeClassImpl();
		return iD_Zweites_Haltfallkriterium_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerweisePackage getVerweisePackage() {
		return (VerweisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VerweisePackage getPackage() {
		return VerweisePackage.eINSTANCE;
	}

} //VerweiseFactoryImpl
