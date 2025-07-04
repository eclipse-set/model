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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.set.model.planpro.ATO.ATOPackage;

import org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.planpro.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.planpro.Block.BlockPackage;

import org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;

import org.eclipse.set.model.planpro.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.planpro.Gleis.GleisPackage;

import org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl;

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

import org.eclipse.set.model.planpro.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.planpro.PZB.PZBPackage;

import org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

import org.eclipse.set.model.planpro.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.planpro.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass;
import org.eclipse.set.model.planpro.Verweise.VerweiseFactory;
import org.eclipse.set.model.planpro.Verweise.VerweisePackage;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.planpro.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerweisePackageImpl extends EPackageImpl implements VerweisePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Anforderer_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Anforderung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Anhang_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Anhang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_AnhangBearbeitungsvermerk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Anschluss_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ATO_TS_Instanz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Aussenelementansteuerung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bahnsteig_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bahnsteig_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Balise_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Balise_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Basis_Objekt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Anzeige_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Bezirk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Einrichtung_Oertlich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Oberflaeche_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Standort_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bedien_Zentrale_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Befestigung_Bauwerk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Beginn_Bereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bezugspunkt_Positionierung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Binaerdaten_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Block_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Block_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Block_Strecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Anlage_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Bedien_Anzeige_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Einschaltung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_Schnittstelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Datenpunkt_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Datenpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_DP_Bezug_Funktional_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Einschaltpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Element_Grenze_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Element_Unterbringung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Energie_Eingang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Energie_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ESTW_Zentraleinheit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ETCS_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ETCS_Knoten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_EV_Modul_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fachtelegramm_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fachtelegramm_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fla_Schutz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FMA_Anlage_Rangier_Frei_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FMA_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FMA_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FMA_Komponente_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fortschaltung_Start_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_Aneinander_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_Ausschluss_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_DWeg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_Fahrweg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Fstr_Zug_Rangier_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FT_Anschaltbedingung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_FT_Fahrweg_Teil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GEO_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GEO_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GEO_Knoten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GEO_Punkt_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GEO_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_GFR_Anlage_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Gleis_Abschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Gleis_Bezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Grenzzeichen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Handschalt_Wirkfunktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Hoehenpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Information_Eingang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Information_Primaer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Komponente_Programmiert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Lageplan_Blattschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Lageplan_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Lageplan_Zustand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_LEU_Anlage_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_LEU_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_LEU_Bezug_Funktional_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_LO_Einbau_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Markante_Stelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Markanter_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_NB_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_NB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_NB_Zone_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Oertlichkeit_Ausgabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Oertlichkeit_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Oertlichkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_PlanPro_Schnittstelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Planung_Einzel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Planungsgrundlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_PZB_Element_Bezugspunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_PZB_Element_Mitnutzung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_PZB_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_PZB_Element_Zuordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Quellelement_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_RBC_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Regelzeichnung_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Regelzeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Schalter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Schaltmittel_Zuordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Schlosskombination_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Schluessel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Schluesselsperre_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Befestigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Fank_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Gleisbezechnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Rahmen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Signalbegriff_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_Start_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Signal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Sonderanlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Stellelement_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Stellwerk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Strecke_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Strecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Technischer_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_TOP_Kante_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_TOP_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_TOP_Knoten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Trasse_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Trasse_Knoten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Ueberhoehung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Uebertragungsweg_Nach_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Uebertragungsweg_Von_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Umfahrpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Unterbringung_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Unterbringung_Technik_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Unterbringung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Ur_Objekt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Verknuepftes_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_W_Kr_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_W_Kr_Gsp_Element_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_W_Kr_Gsp_Komponente_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Weichenlaufkette_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Ziel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZL_DLP_Fstr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZL_Fstr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZL_Signalgruppe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZL_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZLV_Bus_ohne_Proxy_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZLV_Bus_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_Anzeigefeld_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_Fortschalt_Kriterium_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_Unterstation_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_ZN_ZBS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Zugeinwirkung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Zweites_Haltfallkriterium_TypeClassEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.set.model.planpro.Verweise.VerweisePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerweisePackageImpl() {
		super(eNS_URI, VerweiseFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VerweisePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerweisePackage init() {
		if (isInited) return (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVerweisePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VerweisePackageImpl theVerweisePackage = registeredVerweisePackage instanceof VerweisePackageImpl ? (VerweisePackageImpl)registeredVerweisePackage : new VerweisePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ATOPackage.eNS_URI);
		ATOPackageImpl theATOPackage = (ATOPackageImpl)(registeredPackage instanceof ATOPackageImpl ? registeredPackage : ATOPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackageImpl)(registeredPackage instanceof Ansteuerung_ElementPackageImpl ? registeredPackage : Ansteuerung_ElementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = (BahnsteigPackageImpl)(registeredPackage instanceof BahnsteigPackageImpl ? registeredPackage : BahnsteigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);
		Balisentechnik_ETCSPackageImpl theBalisentechnik_ETCSPackage = (Balisentechnik_ETCSPackageImpl)(registeredPackage instanceof Balisentechnik_ETCSPackageImpl ? registeredPackage : Balisentechnik_ETCSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);
		BedienungPackageImpl theBedienungPackage = (BedienungPackageImpl)(registeredPackage instanceof BedienungPackageImpl ? registeredPackage : BedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BlockPackageImpl theBlockPackage = (BlockPackageImpl)(registeredPackage instanceof BlockPackageImpl ? registeredPackage : BlockPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);
		BahnuebergangPackageImpl theBahnuebergangPackage = (BahnuebergangPackageImpl)(registeredPackage instanceof BahnuebergangPackageImpl ? registeredPackage : BahnuebergangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);
		FlankenschutzPackageImpl theFlankenschutzPackage = (FlankenschutzPackageImpl)(registeredPackage instanceof FlankenschutzPackageImpl ? registeredPackage : FlankenschutzPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);
		OrtungPackageImpl theOrtungPackage = (OrtungPackageImpl)(registeredPackage instanceof OrtungPackageImpl ? registeredPackage : OrtungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);
		FahrstrassePackageImpl theFahrstrassePackage = (FahrstrassePackageImpl)(registeredPackage instanceof FahrstrassePackageImpl ? registeredPackage : FahrstrassePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);
		GeodatenPackageImpl theGeodatenPackage = (GeodatenPackageImpl)(registeredPackage instanceof GeodatenPackageImpl ? registeredPackage : GeodatenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);
		Weichen_und_GleissperrenPackageImpl theWeichen_und_GleissperrenPackage = (Weichen_und_GleissperrenPackageImpl)(registeredPackage instanceof Weichen_und_GleissperrenPackageImpl ? registeredPackage : Weichen_und_GleissperrenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);
		GleisPackageImpl theGleisPackage = (GleisPackageImpl)(registeredPackage instanceof GleisPackageImpl ? registeredPackage : GleisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);
		Medien_und_TrassenPackageImpl theMedien_und_TrassenPackage = (Medien_und_TrassenPackageImpl)(registeredPackage instanceof Medien_und_TrassenPackageImpl ? registeredPackage : Medien_und_TrassenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);
		NahbedienungPackageImpl theNahbedienungPackage = (NahbedienungPackageImpl)(registeredPackage instanceof NahbedienungPackageImpl ? registeredPackage : NahbedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		PZBPackageImpl thePZBPackage = (PZBPackageImpl)(registeredPackage instanceof PZBPackageImpl ? registeredPackage : PZBPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);
		RegelzeichnungPackageImpl theRegelzeichnungPackage = (RegelzeichnungPackageImpl)(registeredPackage instanceof RegelzeichnungPackageImpl ? registeredPackage : RegelzeichnungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);
		SchluesselabhaengigkeitenPackageImpl theSchluesselabhaengigkeitenPackage = (SchluesselabhaengigkeitenPackageImpl)(registeredPackage instanceof SchluesselabhaengigkeitenPackageImpl ? registeredPackage : SchluesselabhaengigkeitenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);
		SignalePackageImpl theSignalePackage = (SignalePackageImpl)(registeredPackage instanceof SignalePackageImpl ? registeredPackage : SignalePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);
		Signalbegriffe_StrukturPackageImpl theSignalbegriffe_StrukturPackage = (Signalbegriffe_StrukturPackageImpl)(registeredPackage instanceof Signalbegriffe_StrukturPackageImpl ? registeredPackage : Signalbegriffe_StrukturPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);
		ZuglenkungPackageImpl theZuglenkungPackage = (ZuglenkungPackageImpl)(registeredPackage instanceof ZuglenkungPackageImpl ? registeredPackage : ZuglenkungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_Ril_301Package.eNS_URI);
		Signalbegriffe_Ril_301PackageImpl theSignalbegriffe_Ril_301Package = (Signalbegriffe_Ril_301PackageImpl)(registeredPackage instanceof Signalbegriffe_Ril_301PackageImpl ? registeredPackage : Signalbegriffe_Ril_301Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LayoutinformationenPackage.eNS_URI);
		LayoutinformationenPackageImpl theLayoutinformationenPackage = (LayoutinformationenPackageImpl)(registeredPackage instanceof LayoutinformationenPackageImpl ? registeredPackage : LayoutinformationenPackage.eINSTANCE);

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
		theVerweisePackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		theNahbedienungPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theVerweisePackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		theNahbedienungPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();
		theLayoutinformationenPackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerweisePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerweisePackage.eNS_URI, theVerweisePackage);
		return theVerweisePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Anforderer_Element_TypeClass() {
		return iD_Anforderer_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Anforderer_Element_TypeClass_Value() {
		return (EReference)iD_Anforderer_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Anforderer_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Anforderer_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Anforderung_TypeClass() {
		return iD_Anforderung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Anforderung_TypeClass_Value() {
		return (EReference)iD_Anforderung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Anforderung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Anforderung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Anhang_ohne_Proxy_TypeClass() {
		return iD_Anhang_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Anhang_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Anhang_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Anhang_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Anhang_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Anhang_TypeClass() {
		return iD_Anhang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Anhang_TypeClass_Value() {
		return (EReference)iD_Anhang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Anhang_TypeClass_InvalidReference() {
		return (EAttribute)iD_Anhang_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_AnhangBearbeitungsvermerk_TypeClass() {
		return iD_AnhangBearbeitungsvermerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_AnhangBearbeitungsvermerk_TypeClass_Value() {
		return (EReference)iD_AnhangBearbeitungsvermerk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_AnhangBearbeitungsvermerk_TypeClass_InvalidReference() {
		return (EAttribute)iD_AnhangBearbeitungsvermerk_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Anschluss_Element_TypeClass() {
		return iD_Anschluss_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Anschluss_Element_TypeClass_Value() {
		return (EReference)iD_Anschluss_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Anschluss_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Anschluss_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ATO_TS_Instanz_ohne_Proxy_TypeClass() {
		return iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ATO_TS_Instanz_TypeClass() {
		return iD_ATO_TS_Instanz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ATO_TS_Instanz_TypeClass_Value() {
		return (EReference)iD_ATO_TS_Instanz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ATO_TS_Instanz_TypeClass_InvalidReference() {
		return (EAttribute)iD_ATO_TS_Instanz_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass() {
		return iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Aussenelementansteuerung_ohne_Proxy_TypeClass() {
		return iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Aussenelementansteuerung_TypeClass() {
		return iD_Aussenelementansteuerung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Aussenelementansteuerung_TypeClass_Value() {
		return (EReference)iD_Aussenelementansteuerung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Aussenelementansteuerung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Aussenelementansteuerung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bahnsteig_Anlage_TypeClass() {
		return iD_Bahnsteig_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bahnsteig_Anlage_TypeClass_Value() {
		return (EReference)iD_Bahnsteig_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bahnsteig_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bahnsteig_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bahnsteig_Kante_ohne_Proxy_TypeClass() {
		return iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bahnsteig_Kante_TypeClass() {
		return iD_Bahnsteig_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bahnsteig_Kante_TypeClass_Value() {
		return (EReference)iD_Bahnsteig_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bahnsteig_Kante_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bahnsteig_Kante_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Balise_ohne_Proxy_TypeClass() {
		return iD_Balise_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Balise_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Balise_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Balise_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Balise_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Balise_TypeClass() {
		return iD_Balise_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Balise_TypeClass_Value() {
		return (EReference)iD_Balise_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Balise_TypeClass_InvalidReference() {
		return (EAttribute)iD_Balise_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Basis_Objekt_TypeClass() {
		return iD_Basis_Objekt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Basis_Objekt_TypeClass_Value() {
		return (EReference)iD_Basis_Objekt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Basis_Objekt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Basis_Objekt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Anzeige_Element_TypeClass() {
		return iD_Bedien_Anzeige_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Anzeige_Element_TypeClass_Value() {
		return (EReference)iD_Bedien_Anzeige_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Anzeige_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Anzeige_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Bezirk_TypeClass() {
		return iD_Bedien_Bezirk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Bezirk_TypeClass_Value() {
		return (EReference)iD_Bedien_Bezirk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Bezirk_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Bezirk_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Einrichtung_Oertlich_TypeClass() {
		return iD_Bedien_Einrichtung_Oertlich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Einrichtung_Oertlich_TypeClass_Value() {
		return (EReference)iD_Bedien_Einrichtung_Oertlich_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Einrichtung_Oertlich_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Einrichtung_Oertlich_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Oberflaeche_TypeClass() {
		return iD_Bedien_Oberflaeche_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Oberflaeche_TypeClass_Value() {
		return (EReference)iD_Bedien_Oberflaeche_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Oberflaeche_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Oberflaeche_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Standort_TypeClass() {
		return iD_Bedien_Standort_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Standort_TypeClass_Value() {
		return (EReference)iD_Bedien_Standort_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Standort_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Standort_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bedien_Zentrale_TypeClass() {
		return iD_Bedien_Zentrale_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bedien_Zentrale_TypeClass_Value() {
		return (EReference)iD_Bedien_Zentrale_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bedien_Zentrale_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bedien_Zentrale_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Befestigung_Bauwerk_TypeClass() {
		return iD_Befestigung_Bauwerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Befestigung_Bauwerk_TypeClass_Value() {
		return (EReference)iD_Befestigung_Bauwerk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Befestigung_Bauwerk_TypeClass_InvalidReference() {
		return (EAttribute)iD_Befestigung_Bauwerk_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Beginn_Bereich_TypeClass() {
		return iD_Beginn_Bereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Beginn_Bereich_TypeClass_Value() {
		return (EReference)iD_Beginn_Bereich_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Beginn_Bereich_TypeClass_InvalidReference() {
		return (EAttribute)iD_Beginn_Bereich_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bezugspunkt_Positionierung_TypeClass() {
		return iD_Bezugspunkt_Positionierung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Bezugspunkt_Positionierung_TypeClass_Value() {
		return (EReference)iD_Bezugspunkt_Positionierung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bezugspunkt_Positionierung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Bezugspunkt_Positionierung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Binaerdaten_ohne_Proxy_TypeClass() {
		return iD_Binaerdaten_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Binaerdaten_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Binaerdaten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Binaerdaten_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Binaerdaten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Block_Anlage_TypeClass() {
		return iD_Block_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Block_Anlage_TypeClass_Value() {
		return (EReference)iD_Block_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Block_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_Block_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Block_Element_TypeClass() {
		return iD_Block_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Block_Element_TypeClass_Value() {
		return (EReference)iD_Block_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Block_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Block_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Block_Strecke_TypeClass() {
		return iD_Block_Strecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Block_Strecke_TypeClass_Value() {
		return (EReference)iD_Block_Strecke_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Block_Strecke_TypeClass_InvalidReference() {
		return (EAttribute)iD_Block_Strecke_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Anlage_ohne_Proxy_TypeClass() {
		return iD_BUE_Anlage_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Anlage_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_BUE_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Anlage_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Anlage_TypeClass() {
		return iD_BUE_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Anlage_TypeClass_Value() {
		return (EReference)iD_BUE_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Bedien_Anzeige_Element_TypeClass() {
		return iD_BUE_Bedien_Anzeige_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Bedien_Anzeige_Element_TypeClass_Value() {
		return (EReference)iD_BUE_Bedien_Anzeige_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Bedien_Anzeige_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Bedien_Anzeige_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Einschaltung_TypeClass() {
		return iD_BUE_Einschaltung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Einschaltung_TypeClass_Value() {
		return (EReference)iD_BUE_Einschaltung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Einschaltung_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Einschaltung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Gleisbezogener_Gefahrraum_TypeClass() {
		return iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_Value() {
		return (EReference)iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_Schnittstelle_TypeClass() {
		return iD_BUE_Schnittstelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_Schnittstelle_TypeClass_Value() {
		return (EReference)iD_BUE_Schnittstelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_Schnittstelle_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_Schnittstelle_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_BUE_WS_Fstr_Zuordnung_TypeClass() {
		return iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_BUE_WS_Fstr_Zuordnung_TypeClass_Value() {
		return (EReference)iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_BUE_WS_Fstr_Zuordnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Datenpunkt_ohne_Proxy_TypeClass() {
		return iD_Datenpunkt_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Datenpunkt_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Datenpunkt_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Datenpunkt_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Datenpunkt_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Datenpunkt_TypeClass() {
		return iD_Datenpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Datenpunkt_TypeClass_Value() {
		return (EReference)iD_Datenpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Datenpunkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Datenpunkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_DP_Bezug_Funktional_TypeClass() {
		return iD_DP_Bezug_Funktional_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_DP_Bezug_Funktional_TypeClass_Value() {
		return (EReference)iD_DP_Bezug_Funktional_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_DP_Bezug_Funktional_TypeClass_InvalidReference() {
		return (EAttribute)iD_DP_Bezug_Funktional_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Einschaltpunkt_TypeClass() {
		return iD_Einschaltpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Einschaltpunkt_TypeClass_Value() {
		return (EReference)iD_Einschaltpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Einschaltpunkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Einschaltpunkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Element_Grenze_TypeClass() {
		return iD_Element_Grenze_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Element_Grenze_TypeClass_Value() {
		return (EReference)iD_Element_Grenze_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Element_Grenze_TypeClass_InvalidReference() {
		return (EAttribute)iD_Element_Grenze_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Element_TypeClass() {
		return iD_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Element_TypeClass_Value() {
		return (EReference)iD_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Element_Unterbringung_TypeClass() {
		return iD_Element_Unterbringung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Element_Unterbringung_TypeClass_Value() {
		return (EReference)iD_Element_Unterbringung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Element_Unterbringung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Element_Unterbringung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Energie_Eingang_TypeClass() {
		return iD_Energie_Eingang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Energie_Eingang_TypeClass_Value() {
		return (EReference)iD_Energie_Eingang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Energie_Eingang_TypeClass_InvalidReference() {
		return (EAttribute)iD_Energie_Eingang_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Energie_TypeClass() {
		return iD_Energie_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Energie_TypeClass_Value() {
		return (EReference)iD_Energie_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Energie_TypeClass_InvalidReference() {
		return (EAttribute)iD_Energie_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ESTW_Zentraleinheit_TypeClass() {
		return iD_ESTW_Zentraleinheit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ESTW_Zentraleinheit_TypeClass_Value() {
		return (EReference)iD_ESTW_Zentraleinheit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ESTW_Zentraleinheit_TypeClass_InvalidReference() {
		return (EAttribute)iD_ESTW_Zentraleinheit_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ETCS_Kante_TypeClass() {
		return iD_ETCS_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ETCS_Kante_TypeClass_Value() {
		return (EReference)iD_ETCS_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ETCS_Kante_TypeClass_InvalidReference() {
		return (EAttribute)iD_ETCS_Kante_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ETCS_Knoten_ohne_Proxy_TypeClass() {
		return iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ETCS_Knoten_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ETCS_Knoten_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ETCS_Knoten_TypeClass() {
		return iD_ETCS_Knoten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ETCS_Knoten_TypeClass_Value() {
		return (EReference)iD_ETCS_Knoten_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ETCS_Knoten_TypeClass_InvalidReference() {
		return (EAttribute)iD_ETCS_Knoten_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_EV_Modul_TypeClass() {
		return iD_EV_Modul_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_EV_Modul_TypeClass_Value() {
		return (EReference)iD_EV_Modul_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_EV_Modul_TypeClass_InvalidReference() {
		return (EAttribute)iD_EV_Modul_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fachtelegramm_ohne_Proxy_TypeClass() {
		return iD_Fachtelegramm_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fachtelegramm_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Fachtelegramm_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fachtelegramm_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fachtelegramm_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fachtelegramm_TypeClass() {
		return iD_Fachtelegramm_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fachtelegramm_TypeClass_Value() {
		return (EReference)iD_Fachtelegramm_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fachtelegramm_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fachtelegramm_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fla_Schutz_TypeClass() {
		return iD_Fla_Schutz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fla_Schutz_TypeClass_Value() {
		return (EReference)iD_Fla_Schutz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fla_Schutz_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fla_Schutz_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FMA_Anlage_Rangier_Frei_TypeClass() {
		return iD_FMA_Anlage_Rangier_Frei_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FMA_Anlage_Rangier_Frei_TypeClass_Value() {
		return (EReference)iD_FMA_Anlage_Rangier_Frei_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FMA_Anlage_Rangier_Frei_TypeClass_InvalidReference() {
		return (EAttribute)iD_FMA_Anlage_Rangier_Frei_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FMA_Anlage_TypeClass() {
		return iD_FMA_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FMA_Anlage_TypeClass_Value() {
		return (EReference)iD_FMA_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FMA_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_FMA_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FMA_Element_TypeClass() {
		return iD_FMA_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FMA_Element_TypeClass_Value() {
		return (EReference)iD_FMA_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FMA_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_FMA_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FMA_Komponente_TypeClass() {
		return iD_FMA_Komponente_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FMA_Komponente_TypeClass_Value() {
		return (EReference)iD_FMA_Komponente_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FMA_Komponente_TypeClass_InvalidReference() {
		return (EAttribute)iD_FMA_Komponente_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fortschaltung_Start_TypeClass() {
		return iD_Fortschaltung_Start_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fortschaltung_Start_TypeClass_Value() {
		return (EReference)iD_Fortschaltung_Start_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fortschaltung_Start_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fortschaltung_Start_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_Aneinander_TypeClass() {
		return iD_Fstr_Aneinander_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_Aneinander_TypeClass_Value() {
		return (EReference)iD_Fstr_Aneinander_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_Aneinander_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_Aneinander_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_Ausschluss_Besonders_TypeClass() {
		return iD_Fstr_Ausschluss_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_Ausschluss_Besonders_TypeClass_Value() {
		return (EReference)iD_Fstr_Ausschluss_Besonders_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_Ausschluss_Besonders_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_Ausschluss_Besonders_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_DWeg_ohne_Proxy_TypeClass() {
		return iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_DWeg_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_DWeg_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_DWeg_TypeClass() {
		return iD_Fstr_DWeg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_DWeg_TypeClass_Value() {
		return (EReference)iD_Fstr_DWeg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_DWeg_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_DWeg_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_Fahrweg_ohne_Proxy_TypeClass() {
		return iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_Fahrweg_TypeClass() {
		return iD_Fstr_Fahrweg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_Fahrweg_TypeClass_Value() {
		return (EReference)iD_Fstr_Fahrweg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_Fahrweg_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_Fahrweg_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Fstr_Zug_Rangier_TypeClass() {
		return iD_Fstr_Zug_Rangier_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Fstr_Zug_Rangier_TypeClass_Value() {
		return (EReference)iD_Fstr_Zug_Rangier_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Fstr_Zug_Rangier_TypeClass_InvalidReference() {
		return (EAttribute)iD_Fstr_Zug_Rangier_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FT_Anschaltbedingung_TypeClass() {
		return iD_FT_Anschaltbedingung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FT_Anschaltbedingung_TypeClass_Value() {
		return (EReference)iD_FT_Anschaltbedingung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FT_Anschaltbedingung_TypeClass_InvalidReference() {
		return (EAttribute)iD_FT_Anschaltbedingung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_FT_Fahrweg_Teil_TypeClass() {
		return iD_FT_Fahrweg_Teil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_FT_Fahrweg_Teil_TypeClass_Value() {
		return (EReference)iD_FT_Fahrweg_Teil_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_FT_Fahrweg_Teil_TypeClass_InvalidReference() {
		return (EAttribute)iD_FT_Fahrweg_Teil_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GEO_Art_TypeClass() {
		return iD_GEO_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GEO_Art_TypeClass_Value() {
		return (EReference)iD_GEO_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GEO_Art_TypeClass_InvalidReference() {
		return (EAttribute)iD_GEO_Art_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GEO_Kante_TypeClass() {
		return iD_GEO_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GEO_Kante_TypeClass_Value() {
		return (EReference)iD_GEO_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GEO_Kante_TypeClass_InvalidReference() {
		return (EAttribute)iD_GEO_Kante_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GEO_Knoten_TypeClass() {
		return iD_GEO_Knoten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GEO_Knoten_TypeClass_Value() {
		return (EReference)iD_GEO_Knoten_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GEO_Knoten_TypeClass_InvalidReference() {
		return (EAttribute)iD_GEO_Knoten_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GEO_Punkt_ohne_Proxy_TypeClass() {
		return iD_GEO_Punkt_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GEO_Punkt_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_GEO_Punkt_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GEO_Punkt_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_GEO_Punkt_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GEO_Punkt_TypeClass() {
		return iD_GEO_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GEO_Punkt_TypeClass_Value() {
		return (EReference)iD_GEO_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GEO_Punkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_GEO_Punkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_GFR_Anlage_ohne_Proxy_TypeClass() {
		return iD_GFR_Anlage_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_GFR_Anlage_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_GFR_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_GFR_Anlage_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_GFR_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Gleis_Abschnitt_TypeClass() {
		return iD_Gleis_Abschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Gleis_Abschnitt_TypeClass_Value() {
		return (EReference)iD_Gleis_Abschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Gleis_Abschnitt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Gleis_Abschnitt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Gleis_Bezeichnung_TypeClass() {
		return iD_Gleis_Bezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Gleis_Bezeichnung_TypeClass_Value() {
		return (EReference)iD_Gleis_Bezeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Gleis_Bezeichnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Gleis_Bezeichnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Grenzzeichen_TypeClass() {
		return iD_Grenzzeichen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Grenzzeichen_TypeClass_Value() {
		return (EReference)iD_Grenzzeichen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Grenzzeichen_TypeClass_InvalidReference() {
		return (EAttribute)iD_Grenzzeichen_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Handschalt_Wirkfunktion_TypeClass() {
		return iD_Handschalt_Wirkfunktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Handschalt_Wirkfunktion_TypeClass_Value() {
		return (EReference)iD_Handschalt_Wirkfunktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Handschalt_Wirkfunktion_TypeClass_InvalidReference() {
		return (EAttribute)iD_Handschalt_Wirkfunktion_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Hoehenpunkt_TypeClass() {
		return iD_Hoehenpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Hoehenpunkt_TypeClass_Value() {
		return (EReference)iD_Hoehenpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Hoehenpunkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Hoehenpunkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Information_Eingang_TypeClass() {
		return iD_Information_Eingang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Information_Eingang_TypeClass_Value() {
		return (EReference)iD_Information_Eingang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Information_Eingang_TypeClass_InvalidReference() {
		return (EAttribute)iD_Information_Eingang_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Information_Primaer_TypeClass() {
		return iD_Information_Primaer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Information_Primaer_TypeClass_Value() {
		return (EReference)iD_Information_Primaer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Information_Primaer_TypeClass_InvalidReference() {
		return (EAttribute)iD_Information_Primaer_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Komponente_Programmiert_TypeClass() {
		return iD_Komponente_Programmiert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Komponente_Programmiert_TypeClass_Value() {
		return (EReference)iD_Komponente_Programmiert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Komponente_Programmiert_TypeClass_InvalidReference() {
		return (EAttribute)iD_Komponente_Programmiert_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Lageplan_Blattschnitt_TypeClass() {
		return iD_Lageplan_Blattschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Lageplan_Blattschnitt_TypeClass_Value() {
		return (EReference)iD_Lageplan_Blattschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Lageplan_Blattschnitt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Lageplan_Blattschnitt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Lageplan_TypeClass() {
		return iD_Lageplan_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Lageplan_TypeClass_Value() {
		return (EReference)iD_Lageplan_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Lageplan_TypeClass_InvalidReference() {
		return (EAttribute)iD_Lageplan_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Lageplan_Zustand_TypeClass() {
		return iD_Lageplan_Zustand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Lageplan_Zustand_TypeClass_Value() {
		return (EReference)iD_Lageplan_Zustand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Lageplan_Zustand_TypeClass_InvalidReference() {
		return (EAttribute)iD_Lageplan_Zustand_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_LEU_Anlage_ohne_Proxy_TypeClass() {
		return iD_LEU_Anlage_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_LEU_Anlage_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_LEU_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_LEU_Anlage_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_LEU_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_LEU_Anlage_TypeClass() {
		return iD_LEU_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_LEU_Anlage_TypeClass_Value() {
		return (EReference)iD_LEU_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_LEU_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_LEU_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_LEU_Bezug_Funktional_TypeClass() {
		return iD_LEU_Bezug_Funktional_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_LEU_Bezug_Funktional_TypeClass_Value() {
		return (EReference)iD_LEU_Bezug_Funktional_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_LEU_Bezug_Funktional_TypeClass_InvalidReference() {
		return (EAttribute)iD_LEU_Bezug_Funktional_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_LEU_Schaltkasten_ohne_Proxy_TypeClass() {
		return iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_LO_Einbau_TypeClass() {
		return iD_LO_Einbau_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_LO_Einbau_TypeClass_Value() {
		return (EReference)iD_LO_Einbau_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_LO_Einbau_TypeClass_InvalidReference() {
		return (EAttribute)iD_LO_Einbau_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Markante_Stelle_TypeClass() {
		return iD_Markante_Stelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Markante_Stelle_TypeClass_Value() {
		return (EReference)iD_Markante_Stelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Markante_Stelle_TypeClass_InvalidReference() {
		return (EAttribute)iD_Markante_Stelle_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Markanter_Punkt_Gleis_Abschluss_TypeClass() {
		return iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_Value() {
		return (EReference)iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_InvalidReference() {
		return (EAttribute)iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Markanter_Punkt_TypeClass() {
		return iD_Markanter_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Markanter_Punkt_TypeClass_Value() {
		return (EReference)iD_Markanter_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Markanter_Punkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Markanter_Punkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_NB_Element_TypeClass() {
		return iD_NB_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_NB_Element_TypeClass_Value() {
		return (EReference)iD_NB_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_NB_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_NB_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_NB_TypeClass() {
		return iD_NB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_NB_TypeClass_Value() {
		return (EReference)iD_NB_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_NB_TypeClass_InvalidReference() {
		return (EAttribute)iD_NB_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_NB_Zone_TypeClass() {
		return iD_NB_Zone_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_NB_Zone_TypeClass_Value() {
		return (EReference)iD_NB_Zone_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_NB_Zone_TypeClass_InvalidReference() {
		return (EAttribute)iD_NB_Zone_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Oertlichkeit_Ausgabe_TypeClass() {
		return iD_Oertlichkeit_Ausgabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Oertlichkeit_Ausgabe_TypeClass_Value() {
		return (EReference)iD_Oertlichkeit_Ausgabe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Oertlichkeit_Ausgabe_TypeClass_InvalidReference() {
		return (EAttribute)iD_Oertlichkeit_Ausgabe_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Oertlichkeit_Proxy_TypeClass() {
		return iD_Oertlichkeit_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Oertlichkeit_Proxy_TypeClass_Value() {
		return (EReference)iD_Oertlichkeit_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Oertlichkeit_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Oertlichkeit_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Oertlichkeit_TypeClass() {
		return iD_Oertlichkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Oertlichkeit_TypeClass_Value() {
		return (EReference)iD_Oertlichkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Oertlichkeit_TypeClass_InvalidReference() {
		return (EAttribute)iD_Oertlichkeit_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_PlanPro_Schnittstelle_TypeClass() {
		return iD_PlanPro_Schnittstelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_PlanPro_Schnittstelle_TypeClass_Value() {
		return (EReference)iD_PlanPro_Schnittstelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_PlanPro_Schnittstelle_TypeClass_InvalidReference() {
		return (EAttribute)iD_PlanPro_Schnittstelle_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Planung_Einzel_TypeClass() {
		return iD_Planung_Einzel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Planung_Einzel_TypeClass_Value() {
		return (EReference)iD_Planung_Einzel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Planung_Einzel_TypeClass_InvalidReference() {
		return (EAttribute)iD_Planung_Einzel_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Planungsgrundlage_TypeClass() {
		return iD_Planungsgrundlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Planungsgrundlage_TypeClass_Value() {
		return (EReference)iD_Planungsgrundlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Planungsgrundlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_Planungsgrundlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_PZB_Element_Bezugspunkt_TypeClass() {
		return iD_PZB_Element_Bezugspunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_PZB_Element_Bezugspunkt_TypeClass_Value() {
		return (EReference)iD_PZB_Element_Bezugspunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_PZB_Element_Bezugspunkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_PZB_Element_Bezugspunkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_PZB_Element_Mitnutzung_TypeClass() {
		return iD_PZB_Element_Mitnutzung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_PZB_Element_Mitnutzung_TypeClass_Value() {
		return (EReference)iD_PZB_Element_Mitnutzung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_PZB_Element_Mitnutzung_TypeClass_InvalidReference() {
		return (EAttribute)iD_PZB_Element_Mitnutzung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_PZB_Element_TypeClass() {
		return iD_PZB_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_PZB_Element_TypeClass_Value() {
		return (EReference)iD_PZB_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_PZB_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_PZB_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_PZB_Element_Zuordnung_TypeClass() {
		return iD_PZB_Element_Zuordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_PZB_Element_Zuordnung_TypeClass_Value() {
		return (EReference)iD_PZB_Element_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_PZB_Element_Zuordnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_PZB_Element_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Quellelement_TypeClass() {
		return iD_Quellelement_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Quellelement_TypeClass_Value() {
		return (EReference)iD_Quellelement_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Quellelement_TypeClass_InvalidReference() {
		return (EAttribute)iD_Quellelement_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_RBC_TypeClass() {
		return iD_RBC_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_RBC_TypeClass_Value() {
		return (EReference)iD_RBC_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_RBC_TypeClass_InvalidReference() {
		return (EAttribute)iD_RBC_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Regelzeichnung_ohne_Proxy_TypeClass() {
		return iD_Regelzeichnung_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Regelzeichnung_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Regelzeichnung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Regelzeichnung_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Regelzeichnung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Regelzeichnung_TypeClass() {
		return iD_Regelzeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Regelzeichnung_TypeClass_Value() {
		return (EReference)iD_Regelzeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Regelzeichnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Regelzeichnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Schalter_TypeClass() {
		return iD_Schalter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Schalter_TypeClass_Value() {
		return (EReference)iD_Schalter_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Schalter_TypeClass_InvalidReference() {
		return (EAttribute)iD_Schalter_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Schaltmittel_Zuordnung_TypeClass() {
		return iD_Schaltmittel_Zuordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Schaltmittel_Zuordnung_TypeClass_Value() {
		return (EReference)iD_Schaltmittel_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Schaltmittel_Zuordnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Schaltmittel_Zuordnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Schlosskombination_TypeClass() {
		return iD_Schlosskombination_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Schlosskombination_TypeClass_Value() {
		return (EReference)iD_Schlosskombination_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Schlosskombination_TypeClass_InvalidReference() {
		return (EAttribute)iD_Schlosskombination_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Schluessel_TypeClass() {
		return iD_Schluessel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Schluessel_TypeClass_Value() {
		return (EReference)iD_Schluessel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Schluessel_TypeClass_InvalidReference() {
		return (EAttribute)iD_Schluessel_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Schluesselsperre_TypeClass() {
		return iD_Schluesselsperre_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Schluesselsperre_TypeClass_Value() {
		return (EReference)iD_Schluesselsperre_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Schluesselsperre_TypeClass_InvalidReference() {
		return (EAttribute)iD_Schluesselsperre_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Befestigung_TypeClass() {
		return iD_Signal_Befestigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Befestigung_TypeClass_Value() {
		return (EReference)iD_Signal_Befestigung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Befestigung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Befestigung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Fank_TypeClass() {
		return iD_Signal_Fank_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Fank_TypeClass_Value() {
		return (EReference)iD_Signal_Fank_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Fank_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Fank_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Gleisbezechnung_TypeClass() {
		return iD_Signal_Gleisbezechnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Gleisbezechnung_TypeClass_Value() {
		return (EReference)iD_Signal_Gleisbezechnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Gleisbezechnung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Gleisbezechnung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_ohne_Proxy_TypeClass() {
		return iD_Signal_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Signal_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Rahmen_TypeClass() {
		return iD_Signal_Rahmen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Rahmen_TypeClass_Value() {
		return (EReference)iD_Signal_Rahmen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Rahmen_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Rahmen_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Signalbegriff_TypeClass() {
		return iD_Signal_Signalbegriff_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Signalbegriff_TypeClass_Value() {
		return (EReference)iD_Signal_Signalbegriff_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Signalbegriff_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Signalbegriff_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_Start_TypeClass() {
		return iD_Signal_Start_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_Start_TypeClass_Value() {
		return (EReference)iD_Signal_Start_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_Start_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_Start_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Signal_TypeClass() {
		return iD_Signal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Signal_TypeClass_Value() {
		return (EReference)iD_Signal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Signal_TypeClass_InvalidReference() {
		return (EAttribute)iD_Signal_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Sonderanlage_TypeClass() {
		return iD_Sonderanlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Sonderanlage_TypeClass_Value() {
		return (EReference)iD_Sonderanlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Sonderanlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_Sonderanlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Stellelement_TypeClass() {
		return iD_Stellelement_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Stellelement_TypeClass_Value() {
		return (EReference)iD_Stellelement_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Stellelement_TypeClass_InvalidReference() {
		return (EAttribute)iD_Stellelement_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Stellwerk_TypeClass() {
		return iD_Stellwerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Stellwerk_TypeClass_Value() {
		return (EReference)iD_Stellwerk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Stellwerk_TypeClass_InvalidReference() {
		return (EAttribute)iD_Stellwerk_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Strecke_Bremsweg_ohne_Proxy_TypeClass() {
		return iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Strecke_Punkt_TypeClass() {
		return iD_Strecke_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Strecke_Punkt_TypeClass_Value() {
		return (EReference)iD_Strecke_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Strecke_Punkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Strecke_Punkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Strecke_TypeClass() {
		return iD_Strecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Strecke_TypeClass_Value() {
		return (EReference)iD_Strecke_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Strecke_TypeClass_InvalidReference() {
		return (EAttribute)iD_Strecke_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Technischer_Punkt_TypeClass() {
		return iD_Technischer_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Technischer_Punkt_TypeClass_Value() {
		return (EReference)iD_Technischer_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Technischer_Punkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Technischer_Punkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_TOP_Kante_ohne_Proxy_TypeClass() {
		return iD_TOP_Kante_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_TOP_Kante_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_TOP_Kante_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_TOP_Kante_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_TOP_Kante_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_TOP_Kante_TypeClass() {
		return iD_TOP_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_TOP_Kante_TypeClass_Value() {
		return (EReference)iD_TOP_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_TOP_Kante_TypeClass_InvalidReference() {
		return (EAttribute)iD_TOP_Kante_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_TOP_Knoten_TypeClass() {
		return iD_TOP_Knoten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_TOP_Knoten_TypeClass_Value() {
		return (EReference)iD_TOP_Knoten_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_TOP_Knoten_TypeClass_InvalidReference() {
		return (EAttribute)iD_TOP_Knoten_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Trasse_Kante_TypeClass() {
		return iD_Trasse_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Trasse_Kante_TypeClass_Value() {
		return (EReference)iD_Trasse_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Trasse_Kante_TypeClass_InvalidReference() {
		return (EAttribute)iD_Trasse_Kante_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Trasse_Knoten_TypeClass() {
		return iD_Trasse_Knoten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Trasse_Knoten_TypeClass_Value() {
		return (EReference)iD_Trasse_Knoten_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Trasse_Knoten_TypeClass_InvalidReference() {
		return (EAttribute)iD_Trasse_Knoten_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Ueberhoehung_TypeClass() {
		return iD_Ueberhoehung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Ueberhoehung_TypeClass_Value() {
		return (EReference)iD_Ueberhoehung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Ueberhoehung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Ueberhoehung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Uebertragungsweg_Nach_TypeClass() {
		return iD_Uebertragungsweg_Nach_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Uebertragungsweg_Nach_TypeClass_Value() {
		return (EReference)iD_Uebertragungsweg_Nach_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Uebertragungsweg_Nach_TypeClass_InvalidReference() {
		return (EAttribute)iD_Uebertragungsweg_Nach_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Uebertragungsweg_Von_TypeClass() {
		return iD_Uebertragungsweg_Von_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Uebertragungsweg_Von_TypeClass_Value() {
		return (EReference)iD_Uebertragungsweg_Von_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Uebertragungsweg_Von_TypeClass_InvalidReference() {
		return (EAttribute)iD_Uebertragungsweg_Von_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Umfahrpunkt_TypeClass() {
		return iD_Umfahrpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Umfahrpunkt_TypeClass_Value() {
		return (EReference)iD_Umfahrpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Umfahrpunkt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Umfahrpunkt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Unterbringung_ohne_Proxy_TypeClass() {
		return iD_Unterbringung_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Unterbringung_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_Unterbringung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Unterbringung_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_Unterbringung_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Unterbringung_Technik_TypeClass() {
		return iD_Unterbringung_Technik_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Unterbringung_Technik_TypeClass_Value() {
		return (EReference)iD_Unterbringung_Technik_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Unterbringung_Technik_TypeClass_InvalidReference() {
		return (EAttribute)iD_Unterbringung_Technik_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Unterbringung_TypeClass() {
		return iD_Unterbringung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Unterbringung_TypeClass_Value() {
		return (EReference)iD_Unterbringung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Unterbringung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Unterbringung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Ur_Objekt_TypeClass() {
		return iD_Ur_Objekt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Ur_Objekt_TypeClass_Value() {
		return (EReference)iD_Ur_Objekt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Ur_Objekt_TypeClass_InvalidReference() {
		return (EAttribute)iD_Ur_Objekt_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Verknuepftes_Element_TypeClass() {
		return iD_Verknuepftes_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Verknuepftes_Element_TypeClass_Value() {
		return (EReference)iD_Verknuepftes_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Verknuepftes_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_Verknuepftes_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_W_Kr_Anlage_ohne_Proxy_TypeClass() {
		return iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_W_Kr_Anlage_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_W_Kr_Anlage_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_W_Kr_Anlage_TypeClass() {
		return iD_W_Kr_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_W_Kr_Anlage_TypeClass_Value() {
		return (EReference)iD_W_Kr_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_W_Kr_Anlage_TypeClass_InvalidReference() {
		return (EAttribute)iD_W_Kr_Anlage_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_W_Kr_Gsp_Element_TypeClass() {
		return iD_W_Kr_Gsp_Element_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_W_Kr_Gsp_Element_TypeClass_Value() {
		return (EReference)iD_W_Kr_Gsp_Element_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_W_Kr_Gsp_Element_TypeClass_InvalidReference() {
		return (EAttribute)iD_W_Kr_Gsp_Element_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_W_Kr_Gsp_Komponente_TypeClass() {
		return iD_W_Kr_Gsp_Komponente_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_W_Kr_Gsp_Komponente_TypeClass_Value() {
		return (EReference)iD_W_Kr_Gsp_Komponente_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_W_Kr_Gsp_Komponente_TypeClass_InvalidReference() {
		return (EAttribute)iD_W_Kr_Gsp_Komponente_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Weichenlaufkette_TypeClass() {
		return iD_Weichenlaufkette_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Weichenlaufkette_TypeClass_Value() {
		return (EReference)iD_Weichenlaufkette_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Weichenlaufkette_TypeClass_InvalidReference() {
		return (EAttribute)iD_Weichenlaufkette_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Ziel_TypeClass() {
		return iD_Ziel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Ziel_TypeClass_Value() {
		return (EReference)iD_Ziel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Ziel_TypeClass_InvalidReference() {
		return (EAttribute)iD_Ziel_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZL_DLP_Fstr_TypeClass() {
		return iD_ZL_DLP_Fstr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZL_DLP_Fstr_TypeClass_Value() {
		return (EReference)iD_ZL_DLP_Fstr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZL_DLP_Fstr_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZL_DLP_Fstr_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZL_Fstr_TypeClass() {
		return iD_ZL_Fstr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZL_Fstr_TypeClass_Value() {
		return (EReference)iD_ZL_Fstr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZL_Fstr_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZL_Fstr_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZL_Signalgruppe_TypeClass() {
		return iD_ZL_Signalgruppe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZL_Signalgruppe_TypeClass_Value() {
		return (EReference)iD_ZL_Signalgruppe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZL_Signalgruppe_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZL_Signalgruppe_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZL_TypeClass() {
		return iD_ZL_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZL_TypeClass_Value() {
		return (EReference)iD_ZL_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZL_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZL_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZLV_Bus_ohne_Proxy_TypeClass() {
		return iD_ZLV_Bus_ohne_Proxy_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZLV_Bus_ohne_Proxy_TypeClass_Value() {
		return (EReference)iD_ZLV_Bus_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZLV_Bus_ohne_Proxy_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZLV_Bus_ohne_Proxy_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZLV_Bus_TypeClass() {
		return iD_ZLV_Bus_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZLV_Bus_TypeClass_Value() {
		return (EReference)iD_ZLV_Bus_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZLV_Bus_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZLV_Bus_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_Anzeigefeld_Anstoss_TypeClass() {
		return iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_Anzeigefeld_Anstoss_TypeClass_Value() {
		return (EReference)iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_Anzeigefeld_Anstoss_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_Anzeigefeld_TypeClass() {
		return iD_ZN_Anzeigefeld_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_Anzeigefeld_TypeClass_Value() {
		return (EReference)iD_ZN_Anzeigefeld_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_Anzeigefeld_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_Anzeigefeld_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_Fortschalt_Kriterium_TypeClass() {
		return iD_ZN_Fortschalt_Kriterium_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_Fortschalt_Kriterium_TypeClass_Value() {
		return (EReference)iD_ZN_Fortschalt_Kriterium_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_Fortschalt_Kriterium_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_Fortschalt_Kriterium_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_TypeClass() {
		return iD_ZN_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_TypeClass_Value() {
		return (EReference)iD_ZN_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_Unterstation_TypeClass() {
		return iD_ZN_Unterstation_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_Unterstation_TypeClass_Value() {
		return (EReference)iD_ZN_Unterstation_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_Unterstation_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_Unterstation_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_ZN_ZBS_TypeClass() {
		return iD_ZN_ZBS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_ZN_ZBS_TypeClass_Value() {
		return (EReference)iD_ZN_ZBS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_ZN_ZBS_TypeClass_InvalidReference() {
		return (EAttribute)iD_ZN_ZBS_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Zugeinwirkung_TypeClass() {
		return iD_Zugeinwirkung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Zugeinwirkung_TypeClass_Value() {
		return (EReference)iD_Zugeinwirkung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Zugeinwirkung_TypeClass_InvalidReference() {
		return (EAttribute)iD_Zugeinwirkung_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Zweites_Haltfallkriterium_TypeClass() {
		return iD_Zweites_Haltfallkriterium_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getID_Zweites_Haltfallkriterium_TypeClass_Value() {
		return (EReference)iD_Zweites_Haltfallkriterium_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Zweites_Haltfallkriterium_TypeClass_InvalidReference() {
		return (EAttribute)iD_Zweites_Haltfallkriterium_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerweiseFactory getVerweiseFactory() {
		return (VerweiseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iD_Anforderer_Element_TypeClassEClass = createEClass(ID_ANFORDERER_ELEMENT_TYPE_CLASS);
		createEReference(iD_Anforderer_Element_TypeClassEClass, ID_ANFORDERER_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Anforderer_Element_TypeClassEClass, ID_ANFORDERER_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Anforderung_TypeClassEClass = createEClass(ID_ANFORDERUNG_TYPE_CLASS);
		createEReference(iD_Anforderung_TypeClassEClass, ID_ANFORDERUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Anforderung_TypeClassEClass, ID_ANFORDERUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Anhang_ohne_Proxy_TypeClassEClass = createEClass(ID_ANHANG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Anhang_ohne_Proxy_TypeClassEClass, ID_ANHANG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Anhang_ohne_Proxy_TypeClassEClass, ID_ANHANG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Anhang_TypeClassEClass = createEClass(ID_ANHANG_TYPE_CLASS);
		createEReference(iD_Anhang_TypeClassEClass, ID_ANHANG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Anhang_TypeClassEClass, ID_ANHANG_TYPE_CLASS__INVALID_REFERENCE);

		iD_AnhangBearbeitungsvermerk_TypeClassEClass = createEClass(ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS);
		createEReference(iD_AnhangBearbeitungsvermerk_TypeClassEClass, ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__VALUE);
		createEAttribute(iD_AnhangBearbeitungsvermerk_TypeClassEClass, ID_ANHANG_BEARBEITUNGSVERMERK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Anschluss_Element_TypeClassEClass = createEClass(ID_ANSCHLUSS_ELEMENT_TYPE_CLASS);
		createEReference(iD_Anschluss_Element_TypeClassEClass, ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Anschluss_Element_TypeClassEClass, ID_ANSCHLUSS_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass = createEClass(ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass, ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass, ID_ATO_TS_INSTANZ_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_ATO_TS_Instanz_TypeClassEClass = createEClass(ID_ATO_TS_INSTANZ_TYPE_CLASS);
		createEReference(iD_ATO_TS_Instanz_TypeClassEClass, ID_ATO_TS_INSTANZ_TYPE_CLASS__VALUE);
		createEAttribute(iD_ATO_TS_Instanz_TypeClassEClass, ID_ATO_TS_INSTANZ_TYPE_CLASS__INVALID_REFERENCE);

		iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass = createEClass(ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass, ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass, ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass = createEClass(ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass, ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass, ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Aussenelementansteuerung_TypeClassEClass = createEClass(ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS);
		createEReference(iD_Aussenelementansteuerung_TypeClassEClass, ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Aussenelementansteuerung_TypeClassEClass, ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bahnsteig_Anlage_TypeClassEClass = createEClass(ID_BAHNSTEIG_ANLAGE_TYPE_CLASS);
		createEReference(iD_Bahnsteig_Anlage_TypeClassEClass, ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bahnsteig_Anlage_TypeClassEClass, ID_BAHNSTEIG_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass = createEClass(ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass, ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass, ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bahnsteig_Kante_TypeClassEClass = createEClass(ID_BAHNSTEIG_KANTE_TYPE_CLASS);
		createEReference(iD_Bahnsteig_Kante_TypeClassEClass, ID_BAHNSTEIG_KANTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bahnsteig_Kante_TypeClassEClass, ID_BAHNSTEIG_KANTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Balise_ohne_Proxy_TypeClassEClass = createEClass(ID_BALISE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Balise_ohne_Proxy_TypeClassEClass, ID_BALISE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Balise_ohne_Proxy_TypeClassEClass, ID_BALISE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Balise_TypeClassEClass = createEClass(ID_BALISE_TYPE_CLASS);
		createEReference(iD_Balise_TypeClassEClass, ID_BALISE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Balise_TypeClassEClass, ID_BALISE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Basis_Objekt_TypeClassEClass = createEClass(ID_BASIS_OBJEKT_TYPE_CLASS);
		createEReference(iD_Basis_Objekt_TypeClassEClass, ID_BASIS_OBJEKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Basis_Objekt_TypeClassEClass, ID_BASIS_OBJEKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Anzeige_Element_TypeClassEClass = createEClass(ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS);
		createEReference(iD_Bedien_Anzeige_Element_TypeClassEClass, ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Anzeige_Element_TypeClassEClass, ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Bezirk_TypeClassEClass = createEClass(ID_BEDIEN_BEZIRK_TYPE_CLASS);
		createEReference(iD_Bedien_Bezirk_TypeClassEClass, ID_BEDIEN_BEZIRK_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Bezirk_TypeClassEClass, ID_BEDIEN_BEZIRK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Einrichtung_Oertlich_TypeClassEClass = createEClass(ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS);
		createEReference(iD_Bedien_Einrichtung_Oertlich_TypeClassEClass, ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Einrichtung_Oertlich_TypeClassEClass, ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Oberflaeche_TypeClassEClass = createEClass(ID_BEDIEN_OBERFLAECHE_TYPE_CLASS);
		createEReference(iD_Bedien_Oberflaeche_TypeClassEClass, ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Oberflaeche_TypeClassEClass, ID_BEDIEN_OBERFLAECHE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Standort_TypeClassEClass = createEClass(ID_BEDIEN_STANDORT_TYPE_CLASS);
		createEReference(iD_Bedien_Standort_TypeClassEClass, ID_BEDIEN_STANDORT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Standort_TypeClassEClass, ID_BEDIEN_STANDORT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bedien_Zentrale_TypeClassEClass = createEClass(ID_BEDIEN_ZENTRALE_TYPE_CLASS);
		createEReference(iD_Bedien_Zentrale_TypeClassEClass, ID_BEDIEN_ZENTRALE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bedien_Zentrale_TypeClassEClass, ID_BEDIEN_ZENTRALE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Befestigung_Bauwerk_TypeClassEClass = createEClass(ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS);
		createEReference(iD_Befestigung_Bauwerk_TypeClassEClass, ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__VALUE);
		createEAttribute(iD_Befestigung_Bauwerk_TypeClassEClass, ID_BEFESTIGUNG_BAUWERK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Beginn_Bereich_TypeClassEClass = createEClass(ID_BEGINN_BEREICH_TYPE_CLASS);
		createEReference(iD_Beginn_Bereich_TypeClassEClass, ID_BEGINN_BEREICH_TYPE_CLASS__VALUE);
		createEAttribute(iD_Beginn_Bereich_TypeClassEClass, ID_BEGINN_BEREICH_TYPE_CLASS__INVALID_REFERENCE);

		iD_Bezugspunkt_Positionierung_TypeClassEClass = createEClass(ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS);
		createEReference(iD_Bezugspunkt_Positionierung_TypeClassEClass, ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Bezugspunkt_Positionierung_TypeClassEClass, ID_BEZUGSPUNKT_POSITIONIERUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Binaerdaten_ohne_Proxy_TypeClassEClass = createEClass(ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Binaerdaten_ohne_Proxy_TypeClassEClass, ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Binaerdaten_ohne_Proxy_TypeClassEClass, ID_BINAERDATEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Block_Anlage_TypeClassEClass = createEClass(ID_BLOCK_ANLAGE_TYPE_CLASS);
		createEReference(iD_Block_Anlage_TypeClassEClass, ID_BLOCK_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Block_Anlage_TypeClassEClass, ID_BLOCK_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Block_Element_TypeClassEClass = createEClass(ID_BLOCK_ELEMENT_TYPE_CLASS);
		createEReference(iD_Block_Element_TypeClassEClass, ID_BLOCK_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Block_Element_TypeClassEClass, ID_BLOCK_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Block_Strecke_TypeClassEClass = createEClass(ID_BLOCK_STRECKE_TYPE_CLASS);
		createEReference(iD_Block_Strecke_TypeClassEClass, ID_BLOCK_STRECKE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Block_Strecke_TypeClassEClass, ID_BLOCK_STRECKE_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Anlage_ohne_Proxy_TypeClassEClass = createEClass(ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_BUE_Anlage_ohne_Proxy_TypeClassEClass, ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Anlage_ohne_Proxy_TypeClassEClass, ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Anlage_TypeClassEClass = createEClass(ID_BUE_ANLAGE_TYPE_CLASS);
		createEReference(iD_BUE_Anlage_TypeClassEClass, ID_BUE_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Anlage_TypeClassEClass, ID_BUE_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Bedien_Anzeige_Element_TypeClassEClass = createEClass(ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS);
		createEReference(iD_BUE_Bedien_Anzeige_Element_TypeClassEClass, ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Bedien_Anzeige_Element_TypeClassEClass, ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Einschaltung_TypeClassEClass = createEClass(ID_BUE_EINSCHALTUNG_TYPE_CLASS);
		createEReference(iD_BUE_Einschaltung_TypeClassEClass, ID_BUE_EINSCHALTUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Einschaltung_TypeClassEClass, ID_BUE_EINSCHALTUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass = createEClass(ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS);
		createEReference(iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass, ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass, ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_Schnittstelle_TypeClassEClass = createEClass(ID_BUE_SCHNITTSTELLE_TYPE_CLASS);
		createEReference(iD_BUE_Schnittstelle_TypeClassEClass, ID_BUE_SCHNITTSTELLE_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_Schnittstelle_TypeClassEClass, ID_BUE_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE);

		iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass = createEClass(ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS);
		createEReference(iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass, ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass, ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Datenpunkt_ohne_Proxy_TypeClassEClass = createEClass(ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Datenpunkt_ohne_Proxy_TypeClassEClass, ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Datenpunkt_ohne_Proxy_TypeClassEClass, ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Datenpunkt_TypeClassEClass = createEClass(ID_DATENPUNKT_TYPE_CLASS);
		createEReference(iD_Datenpunkt_TypeClassEClass, ID_DATENPUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Datenpunkt_TypeClassEClass, ID_DATENPUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_DP_Bezug_Funktional_TypeClassEClass = createEClass(ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS);
		createEReference(iD_DP_Bezug_Funktional_TypeClassEClass, ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE);
		createEAttribute(iD_DP_Bezug_Funktional_TypeClassEClass, ID_DP_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE);

		iD_Einschaltpunkt_TypeClassEClass = createEClass(ID_EINSCHALTPUNKT_TYPE_CLASS);
		createEReference(iD_Einschaltpunkt_TypeClassEClass, ID_EINSCHALTPUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Einschaltpunkt_TypeClassEClass, ID_EINSCHALTPUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Element_Grenze_TypeClassEClass = createEClass(ID_ELEMENT_GRENZE_TYPE_CLASS);
		createEReference(iD_Element_Grenze_TypeClassEClass, ID_ELEMENT_GRENZE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Element_Grenze_TypeClassEClass, ID_ELEMENT_GRENZE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Element_TypeClassEClass = createEClass(ID_ELEMENT_TYPE_CLASS);
		createEReference(iD_Element_TypeClassEClass, ID_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Element_TypeClassEClass, ID_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Element_Unterbringung_TypeClassEClass = createEClass(ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS);
		createEReference(iD_Element_Unterbringung_TypeClassEClass, ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Element_Unterbringung_TypeClassEClass, ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Energie_Eingang_TypeClassEClass = createEClass(ID_ENERGIE_EINGANG_TYPE_CLASS);
		createEReference(iD_Energie_Eingang_TypeClassEClass, ID_ENERGIE_EINGANG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Energie_Eingang_TypeClassEClass, ID_ENERGIE_EINGANG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Energie_TypeClassEClass = createEClass(ID_ENERGIE_TYPE_CLASS);
		createEReference(iD_Energie_TypeClassEClass, ID_ENERGIE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Energie_TypeClassEClass, ID_ENERGIE_TYPE_CLASS__INVALID_REFERENCE);

		iD_ESTW_Zentraleinheit_TypeClassEClass = createEClass(ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS);
		createEReference(iD_ESTW_Zentraleinheit_TypeClassEClass, ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__VALUE);
		createEAttribute(iD_ESTW_Zentraleinheit_TypeClassEClass, ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS__INVALID_REFERENCE);

		iD_ETCS_Kante_TypeClassEClass = createEClass(ID_ETCS_KANTE_TYPE_CLASS);
		createEReference(iD_ETCS_Kante_TypeClassEClass, ID_ETCS_KANTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_ETCS_Kante_TypeClassEClass, ID_ETCS_KANTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass = createEClass(ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass, ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass, ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_ETCS_Knoten_TypeClassEClass = createEClass(ID_ETCS_KNOTEN_TYPE_CLASS);
		createEReference(iD_ETCS_Knoten_TypeClassEClass, ID_ETCS_KNOTEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_ETCS_Knoten_TypeClassEClass, ID_ETCS_KNOTEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_EV_Modul_TypeClassEClass = createEClass(ID_EV_MODUL_TYPE_CLASS);
		createEReference(iD_EV_Modul_TypeClassEClass, ID_EV_MODUL_TYPE_CLASS__VALUE);
		createEAttribute(iD_EV_Modul_TypeClassEClass, ID_EV_MODUL_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fachtelegramm_ohne_Proxy_TypeClassEClass = createEClass(ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Fachtelegramm_ohne_Proxy_TypeClassEClass, ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fachtelegramm_ohne_Proxy_TypeClassEClass, ID_FACHTELEGRAMM_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fachtelegramm_TypeClassEClass = createEClass(ID_FACHTELEGRAMM_TYPE_CLASS);
		createEReference(iD_Fachtelegramm_TypeClassEClass, ID_FACHTELEGRAMM_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fachtelegramm_TypeClassEClass, ID_FACHTELEGRAMM_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fla_Schutz_TypeClassEClass = createEClass(ID_FLA_SCHUTZ_TYPE_CLASS);
		createEReference(iD_Fla_Schutz_TypeClassEClass, ID_FLA_SCHUTZ_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fla_Schutz_TypeClassEClass, ID_FLA_SCHUTZ_TYPE_CLASS__INVALID_REFERENCE);

		iD_FMA_Anlage_Rangier_Frei_TypeClassEClass = createEClass(ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS);
		createEReference(iD_FMA_Anlage_Rangier_Frei_TypeClassEClass, ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__VALUE);
		createEAttribute(iD_FMA_Anlage_Rangier_Frei_TypeClassEClass, ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS__INVALID_REFERENCE);

		iD_FMA_Anlage_TypeClassEClass = createEClass(ID_FMA_ANLAGE_TYPE_CLASS);
		createEReference(iD_FMA_Anlage_TypeClassEClass, ID_FMA_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_FMA_Anlage_TypeClassEClass, ID_FMA_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_FMA_Element_TypeClassEClass = createEClass(ID_FMA_ELEMENT_TYPE_CLASS);
		createEReference(iD_FMA_Element_TypeClassEClass, ID_FMA_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_FMA_Element_TypeClassEClass, ID_FMA_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_FMA_Komponente_TypeClassEClass = createEClass(ID_FMA_KOMPONENTE_TYPE_CLASS);
		createEReference(iD_FMA_Komponente_TypeClassEClass, ID_FMA_KOMPONENTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_FMA_Komponente_TypeClassEClass, ID_FMA_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fortschaltung_Start_TypeClassEClass = createEClass(ID_FORTSCHALTUNG_START_TYPE_CLASS);
		createEReference(iD_Fortschaltung_Start_TypeClassEClass, ID_FORTSCHALTUNG_START_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fortschaltung_Start_TypeClassEClass, ID_FORTSCHALTUNG_START_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_Aneinander_TypeClassEClass = createEClass(ID_FSTR_ANEINANDER_TYPE_CLASS);
		createEReference(iD_Fstr_Aneinander_TypeClassEClass, ID_FSTR_ANEINANDER_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_Aneinander_TypeClassEClass, ID_FSTR_ANEINANDER_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_Ausschluss_Besonders_TypeClassEClass = createEClass(ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS);
		createEReference(iD_Fstr_Ausschluss_Besonders_TypeClassEClass, ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_Ausschluss_Besonders_TypeClassEClass, ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass = createEClass(ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass, ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass, ID_FSTR_DWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_DWeg_TypeClassEClass = createEClass(ID_FSTR_DWEG_TYPE_CLASS);
		createEReference(iD_Fstr_DWeg_TypeClassEClass, ID_FSTR_DWEG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_DWeg_TypeClassEClass, ID_FSTR_DWEG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass = createEClass(ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass, ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass, ID_FSTR_FAHRWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_Fahrweg_TypeClassEClass = createEClass(ID_FSTR_FAHRWEG_TYPE_CLASS);
		createEReference(iD_Fstr_Fahrweg_TypeClassEClass, ID_FSTR_FAHRWEG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_Fahrweg_TypeClassEClass, ID_FSTR_FAHRWEG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Fstr_Zug_Rangier_TypeClassEClass = createEClass(ID_FSTR_ZUG_RANGIER_TYPE_CLASS);
		createEReference(iD_Fstr_Zug_Rangier_TypeClassEClass, ID_FSTR_ZUG_RANGIER_TYPE_CLASS__VALUE);
		createEAttribute(iD_Fstr_Zug_Rangier_TypeClassEClass, ID_FSTR_ZUG_RANGIER_TYPE_CLASS__INVALID_REFERENCE);

		iD_FT_Anschaltbedingung_TypeClassEClass = createEClass(ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS);
		createEReference(iD_FT_Anschaltbedingung_TypeClassEClass, ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_FT_Anschaltbedingung_TypeClassEClass, ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_FT_Fahrweg_Teil_TypeClassEClass = createEClass(ID_FT_FAHRWEG_TEIL_TYPE_CLASS);
		createEReference(iD_FT_Fahrweg_Teil_TypeClassEClass, ID_FT_FAHRWEG_TEIL_TYPE_CLASS__VALUE);
		createEAttribute(iD_FT_Fahrweg_Teil_TypeClassEClass, ID_FT_FAHRWEG_TEIL_TYPE_CLASS__INVALID_REFERENCE);

		iD_GEO_Art_TypeClassEClass = createEClass(ID_GEO_ART_TYPE_CLASS);
		createEReference(iD_GEO_Art_TypeClassEClass, ID_GEO_ART_TYPE_CLASS__VALUE);
		createEAttribute(iD_GEO_Art_TypeClassEClass, ID_GEO_ART_TYPE_CLASS__INVALID_REFERENCE);

		iD_GEO_Kante_TypeClassEClass = createEClass(ID_GEO_KANTE_TYPE_CLASS);
		createEReference(iD_GEO_Kante_TypeClassEClass, ID_GEO_KANTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_GEO_Kante_TypeClassEClass, ID_GEO_KANTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_GEO_Knoten_TypeClassEClass = createEClass(ID_GEO_KNOTEN_TYPE_CLASS);
		createEReference(iD_GEO_Knoten_TypeClassEClass, ID_GEO_KNOTEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_GEO_Knoten_TypeClassEClass, ID_GEO_KNOTEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_GEO_Punkt_ohne_Proxy_TypeClassEClass = createEClass(ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_GEO_Punkt_ohne_Proxy_TypeClassEClass, ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_GEO_Punkt_ohne_Proxy_TypeClassEClass, ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_GEO_Punkt_TypeClassEClass = createEClass(ID_GEO_PUNKT_TYPE_CLASS);
		createEReference(iD_GEO_Punkt_TypeClassEClass, ID_GEO_PUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_GEO_Punkt_TypeClassEClass, ID_GEO_PUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_GFR_Anlage_ohne_Proxy_TypeClassEClass = createEClass(ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_GFR_Anlage_ohne_Proxy_TypeClassEClass, ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_GFR_Anlage_ohne_Proxy_TypeClassEClass, ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Gleis_Abschnitt_TypeClassEClass = createEClass(ID_GLEIS_ABSCHNITT_TYPE_CLASS);
		createEReference(iD_Gleis_Abschnitt_TypeClassEClass, ID_GLEIS_ABSCHNITT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Gleis_Abschnitt_TypeClassEClass, ID_GLEIS_ABSCHNITT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Gleis_Bezeichnung_TypeClassEClass = createEClass(ID_GLEIS_BEZEICHNUNG_TYPE_CLASS);
		createEReference(iD_Gleis_Bezeichnung_TypeClassEClass, ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Gleis_Bezeichnung_TypeClassEClass, ID_GLEIS_BEZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Grenzzeichen_TypeClassEClass = createEClass(ID_GRENZZEICHEN_TYPE_CLASS);
		createEReference(iD_Grenzzeichen_TypeClassEClass, ID_GRENZZEICHEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_Grenzzeichen_TypeClassEClass, ID_GRENZZEICHEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_Handschalt_Wirkfunktion_TypeClassEClass = createEClass(ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS);
		createEReference(iD_Handschalt_Wirkfunktion_TypeClassEClass, ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__VALUE);
		createEAttribute(iD_Handschalt_Wirkfunktion_TypeClassEClass, ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS__INVALID_REFERENCE);

		iD_Hoehenpunkt_TypeClassEClass = createEClass(ID_HOEHENPUNKT_TYPE_CLASS);
		createEReference(iD_Hoehenpunkt_TypeClassEClass, ID_HOEHENPUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Hoehenpunkt_TypeClassEClass, ID_HOEHENPUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Information_Eingang_TypeClassEClass = createEClass(ID_INFORMATION_EINGANG_TYPE_CLASS);
		createEReference(iD_Information_Eingang_TypeClassEClass, ID_INFORMATION_EINGANG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Information_Eingang_TypeClassEClass, ID_INFORMATION_EINGANG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Information_Primaer_TypeClassEClass = createEClass(ID_INFORMATION_PRIMAER_TYPE_CLASS);
		createEReference(iD_Information_Primaer_TypeClassEClass, ID_INFORMATION_PRIMAER_TYPE_CLASS__VALUE);
		createEAttribute(iD_Information_Primaer_TypeClassEClass, ID_INFORMATION_PRIMAER_TYPE_CLASS__INVALID_REFERENCE);

		iD_Komponente_Programmiert_TypeClassEClass = createEClass(ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS);
		createEReference(iD_Komponente_Programmiert_TypeClassEClass, ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Komponente_Programmiert_TypeClassEClass, ID_KOMPONENTE_PROGRAMMIERT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Lageplan_Blattschnitt_TypeClassEClass = createEClass(ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS);
		createEReference(iD_Lageplan_Blattschnitt_TypeClassEClass, ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Lageplan_Blattschnitt_TypeClassEClass, ID_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Lageplan_TypeClassEClass = createEClass(ID_LAGEPLAN_TYPE_CLASS);
		createEReference(iD_Lageplan_TypeClassEClass, ID_LAGEPLAN_TYPE_CLASS__VALUE);
		createEAttribute(iD_Lageplan_TypeClassEClass, ID_LAGEPLAN_TYPE_CLASS__INVALID_REFERENCE);

		iD_Lageplan_Zustand_TypeClassEClass = createEClass(ID_LAGEPLAN_ZUSTAND_TYPE_CLASS);
		createEReference(iD_Lageplan_Zustand_TypeClassEClass, ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__VALUE);
		createEAttribute(iD_Lageplan_Zustand_TypeClassEClass, ID_LAGEPLAN_ZUSTAND_TYPE_CLASS__INVALID_REFERENCE);

		iD_LEU_Anlage_ohne_Proxy_TypeClassEClass = createEClass(ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_LEU_Anlage_ohne_Proxy_TypeClassEClass, ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_LEU_Anlage_ohne_Proxy_TypeClassEClass, ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_LEU_Anlage_TypeClassEClass = createEClass(ID_LEU_ANLAGE_TYPE_CLASS);
		createEReference(iD_LEU_Anlage_TypeClassEClass, ID_LEU_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_LEU_Anlage_TypeClassEClass, ID_LEU_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_LEU_Bezug_Funktional_TypeClassEClass = createEClass(ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS);
		createEReference(iD_LEU_Bezug_Funktional_TypeClassEClass, ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__VALUE);
		createEAttribute(iD_LEU_Bezug_Funktional_TypeClassEClass, ID_LEU_BEZUG_FUNKTIONAL_TYPE_CLASS__INVALID_REFERENCE);

		iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass = createEClass(ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass, ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass, ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_LO_Einbau_TypeClassEClass = createEClass(ID_LO_EINBAU_TYPE_CLASS);
		createEReference(iD_LO_Einbau_TypeClassEClass, ID_LO_EINBAU_TYPE_CLASS__VALUE);
		createEAttribute(iD_LO_Einbau_TypeClassEClass, ID_LO_EINBAU_TYPE_CLASS__INVALID_REFERENCE);

		iD_Markante_Stelle_TypeClassEClass = createEClass(ID_MARKANTE_STELLE_TYPE_CLASS);
		createEReference(iD_Markante_Stelle_TypeClassEClass, ID_MARKANTE_STELLE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Markante_Stelle_TypeClassEClass, ID_MARKANTE_STELLE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass = createEClass(ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS);
		createEReference(iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass, ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__VALUE);
		createEAttribute(iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass, ID_MARKANTER_PUNKT_GLEIS_ABSCHLUSS_TYPE_CLASS__INVALID_REFERENCE);

		iD_Markanter_Punkt_TypeClassEClass = createEClass(ID_MARKANTER_PUNKT_TYPE_CLASS);
		createEReference(iD_Markanter_Punkt_TypeClassEClass, ID_MARKANTER_PUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Markanter_Punkt_TypeClassEClass, ID_MARKANTER_PUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_NB_Element_TypeClassEClass = createEClass(ID_NB_ELEMENT_TYPE_CLASS);
		createEReference(iD_NB_Element_TypeClassEClass, ID_NB_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_NB_Element_TypeClassEClass, ID_NB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_NB_TypeClassEClass = createEClass(ID_NB_TYPE_CLASS);
		createEReference(iD_NB_TypeClassEClass, ID_NB_TYPE_CLASS__VALUE);
		createEAttribute(iD_NB_TypeClassEClass, ID_NB_TYPE_CLASS__INVALID_REFERENCE);

		iD_NB_Zone_TypeClassEClass = createEClass(ID_NB_ZONE_TYPE_CLASS);
		createEReference(iD_NB_Zone_TypeClassEClass, ID_NB_ZONE_TYPE_CLASS__VALUE);
		createEAttribute(iD_NB_Zone_TypeClassEClass, ID_NB_ZONE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Oertlichkeit_Ausgabe_TypeClassEClass = createEClass(ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS);
		createEReference(iD_Oertlichkeit_Ausgabe_TypeClassEClass, ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Oertlichkeit_Ausgabe_TypeClassEClass, ID_OERTLICHKEIT_AUSGABE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Oertlichkeit_Proxy_TypeClassEClass = createEClass(ID_OERTLICHKEIT_PROXY_TYPE_CLASS);
		createEReference(iD_Oertlichkeit_Proxy_TypeClassEClass, ID_OERTLICHKEIT_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Oertlichkeit_Proxy_TypeClassEClass, ID_OERTLICHKEIT_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Oertlichkeit_TypeClassEClass = createEClass(ID_OERTLICHKEIT_TYPE_CLASS);
		createEReference(iD_Oertlichkeit_TypeClassEClass, ID_OERTLICHKEIT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Oertlichkeit_TypeClassEClass, ID_OERTLICHKEIT_TYPE_CLASS__INVALID_REFERENCE);

		iD_PlanPro_Schnittstelle_TypeClassEClass = createEClass(ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS);
		createEReference(iD_PlanPro_Schnittstelle_TypeClassEClass, ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__VALUE);
		createEAttribute(iD_PlanPro_Schnittstelle_TypeClassEClass, ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Planung_Einzel_TypeClassEClass = createEClass(ID_PLANUNG_EINZEL_TYPE_CLASS);
		createEReference(iD_Planung_Einzel_TypeClassEClass, ID_PLANUNG_EINZEL_TYPE_CLASS__VALUE);
		createEAttribute(iD_Planung_Einzel_TypeClassEClass, ID_PLANUNG_EINZEL_TYPE_CLASS__INVALID_REFERENCE);

		iD_Planungsgrundlage_TypeClassEClass = createEClass(ID_PLANUNGSGRUNDLAGE_TYPE_CLASS);
		createEReference(iD_Planungsgrundlage_TypeClassEClass, ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Planungsgrundlage_TypeClassEClass, ID_PLANUNGSGRUNDLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_PZB_Element_Bezugspunkt_TypeClassEClass = createEClass(ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS);
		createEReference(iD_PZB_Element_Bezugspunkt_TypeClassEClass, ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_PZB_Element_Bezugspunkt_TypeClassEClass, ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_PZB_Element_Mitnutzung_TypeClassEClass = createEClass(ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS);
		createEReference(iD_PZB_Element_Mitnutzung_TypeClassEClass, ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_PZB_Element_Mitnutzung_TypeClassEClass, ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_PZB_Element_TypeClassEClass = createEClass(ID_PZB_ELEMENT_TYPE_CLASS);
		createEReference(iD_PZB_Element_TypeClassEClass, ID_PZB_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_PZB_Element_TypeClassEClass, ID_PZB_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_PZB_Element_Zuordnung_TypeClassEClass = createEClass(ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS);
		createEReference(iD_PZB_Element_Zuordnung_TypeClassEClass, ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_PZB_Element_Zuordnung_TypeClassEClass, ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Quellelement_TypeClassEClass = createEClass(ID_QUELLELEMENT_TYPE_CLASS);
		createEReference(iD_Quellelement_TypeClassEClass, ID_QUELLELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Quellelement_TypeClassEClass, ID_QUELLELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_RBC_TypeClassEClass = createEClass(ID_RBC_TYPE_CLASS);
		createEReference(iD_RBC_TypeClassEClass, ID_RBC_TYPE_CLASS__VALUE);
		createEAttribute(iD_RBC_TypeClassEClass, ID_RBC_TYPE_CLASS__INVALID_REFERENCE);

		iD_Regelzeichnung_ohne_Proxy_TypeClassEClass = createEClass(ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Regelzeichnung_ohne_Proxy_TypeClassEClass, ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Regelzeichnung_ohne_Proxy_TypeClassEClass, ID_REGELZEICHNUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Regelzeichnung_TypeClassEClass = createEClass(ID_REGELZEICHNUNG_TYPE_CLASS);
		createEReference(iD_Regelzeichnung_TypeClassEClass, ID_REGELZEICHNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Regelzeichnung_TypeClassEClass, ID_REGELZEICHNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Schalter_TypeClassEClass = createEClass(ID_SCHALTER_TYPE_CLASS);
		createEReference(iD_Schalter_TypeClassEClass, ID_SCHALTER_TYPE_CLASS__VALUE);
		createEAttribute(iD_Schalter_TypeClassEClass, ID_SCHALTER_TYPE_CLASS__INVALID_REFERENCE);

		iD_Schaltmittel_Zuordnung_TypeClassEClass = createEClass(ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS);
		createEReference(iD_Schaltmittel_Zuordnung_TypeClassEClass, ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Schaltmittel_Zuordnung_TypeClassEClass, ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Schlosskombination_TypeClassEClass = createEClass(ID_SCHLOSSKOMBINATION_TYPE_CLASS);
		createEReference(iD_Schlosskombination_TypeClassEClass, ID_SCHLOSSKOMBINATION_TYPE_CLASS__VALUE);
		createEAttribute(iD_Schlosskombination_TypeClassEClass, ID_SCHLOSSKOMBINATION_TYPE_CLASS__INVALID_REFERENCE);

		iD_Schluessel_TypeClassEClass = createEClass(ID_SCHLUESSEL_TYPE_CLASS);
		createEReference(iD_Schluessel_TypeClassEClass, ID_SCHLUESSEL_TYPE_CLASS__VALUE);
		createEAttribute(iD_Schluessel_TypeClassEClass, ID_SCHLUESSEL_TYPE_CLASS__INVALID_REFERENCE);

		iD_Schluesselsperre_TypeClassEClass = createEClass(ID_SCHLUESSELSPERRE_TYPE_CLASS);
		createEReference(iD_Schluesselsperre_TypeClassEClass, ID_SCHLUESSELSPERRE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Schluesselsperre_TypeClassEClass, ID_SCHLUESSELSPERRE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Befestigung_TypeClassEClass = createEClass(ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS);
		createEReference(iD_Signal_Befestigung_TypeClassEClass, ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Befestigung_TypeClassEClass, ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Fank_TypeClassEClass = createEClass(ID_SIGNAL_FANK_TYPE_CLASS);
		createEReference(iD_Signal_Fank_TypeClassEClass, ID_SIGNAL_FANK_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Fank_TypeClassEClass, ID_SIGNAL_FANK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Gleisbezechnung_TypeClassEClass = createEClass(ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS);
		createEReference(iD_Signal_Gleisbezechnung_TypeClassEClass, ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Gleisbezechnung_TypeClassEClass, ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_ohne_Proxy_TypeClassEClass = createEClass(ID_SIGNAL_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Signal_ohne_Proxy_TypeClassEClass, ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_ohne_Proxy_TypeClassEClass, ID_SIGNAL_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Rahmen_TypeClassEClass = createEClass(ID_SIGNAL_RAHMEN_TYPE_CLASS);
		createEReference(iD_Signal_Rahmen_TypeClassEClass, ID_SIGNAL_RAHMEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Rahmen_TypeClassEClass, ID_SIGNAL_RAHMEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Signalbegriff_TypeClassEClass = createEClass(ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS);
		createEReference(iD_Signal_Signalbegriff_TypeClassEClass, ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Signalbegriff_TypeClassEClass, ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_Start_TypeClassEClass = createEClass(ID_SIGNAL_START_TYPE_CLASS);
		createEReference(iD_Signal_Start_TypeClassEClass, ID_SIGNAL_START_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_Start_TypeClassEClass, ID_SIGNAL_START_TYPE_CLASS__INVALID_REFERENCE);

		iD_Signal_TypeClassEClass = createEClass(ID_SIGNAL_TYPE_CLASS);
		createEReference(iD_Signal_TypeClassEClass, ID_SIGNAL_TYPE_CLASS__VALUE);
		createEAttribute(iD_Signal_TypeClassEClass, ID_SIGNAL_TYPE_CLASS__INVALID_REFERENCE);

		iD_Sonderanlage_TypeClassEClass = createEClass(ID_SONDERANLAGE_TYPE_CLASS);
		createEReference(iD_Sonderanlage_TypeClassEClass, ID_SONDERANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Sonderanlage_TypeClassEClass, ID_SONDERANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Stellelement_TypeClassEClass = createEClass(ID_STELLELEMENT_TYPE_CLASS);
		createEReference(iD_Stellelement_TypeClassEClass, ID_STELLELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Stellelement_TypeClassEClass, ID_STELLELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Stellwerk_TypeClassEClass = createEClass(ID_STELLWERK_TYPE_CLASS);
		createEReference(iD_Stellwerk_TypeClassEClass, ID_STELLWERK_TYPE_CLASS__VALUE);
		createEAttribute(iD_Stellwerk_TypeClassEClass, ID_STELLWERK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass = createEClass(ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass, ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass, ID_STRECKE_BREMSWEG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Strecke_Punkt_TypeClassEClass = createEClass(ID_STRECKE_PUNKT_TYPE_CLASS);
		createEReference(iD_Strecke_Punkt_TypeClassEClass, ID_STRECKE_PUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Strecke_Punkt_TypeClassEClass, ID_STRECKE_PUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Strecke_TypeClassEClass = createEClass(ID_STRECKE_TYPE_CLASS);
		createEReference(iD_Strecke_TypeClassEClass, ID_STRECKE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Strecke_TypeClassEClass, ID_STRECKE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Technischer_Punkt_TypeClassEClass = createEClass(ID_TECHNISCHER_PUNKT_TYPE_CLASS);
		createEReference(iD_Technischer_Punkt_TypeClassEClass, ID_TECHNISCHER_PUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Technischer_Punkt_TypeClassEClass, ID_TECHNISCHER_PUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_TOP_Kante_ohne_Proxy_TypeClassEClass = createEClass(ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_TOP_Kante_ohne_Proxy_TypeClassEClass, ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_TOP_Kante_ohne_Proxy_TypeClassEClass, ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_TOP_Kante_TypeClassEClass = createEClass(ID_TOP_KANTE_TYPE_CLASS);
		createEReference(iD_TOP_Kante_TypeClassEClass, ID_TOP_KANTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_TOP_Kante_TypeClassEClass, ID_TOP_KANTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_TOP_Knoten_TypeClassEClass = createEClass(ID_TOP_KNOTEN_TYPE_CLASS);
		createEReference(iD_TOP_Knoten_TypeClassEClass, ID_TOP_KNOTEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_TOP_Knoten_TypeClassEClass, ID_TOP_KNOTEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_Trasse_Kante_TypeClassEClass = createEClass(ID_TRASSE_KANTE_TYPE_CLASS);
		createEReference(iD_Trasse_Kante_TypeClassEClass, ID_TRASSE_KANTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Trasse_Kante_TypeClassEClass, ID_TRASSE_KANTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Trasse_Knoten_TypeClassEClass = createEClass(ID_TRASSE_KNOTEN_TYPE_CLASS);
		createEReference(iD_Trasse_Knoten_TypeClassEClass, ID_TRASSE_KNOTEN_TYPE_CLASS__VALUE);
		createEAttribute(iD_Trasse_Knoten_TypeClassEClass, ID_TRASSE_KNOTEN_TYPE_CLASS__INVALID_REFERENCE);

		iD_Ueberhoehung_TypeClassEClass = createEClass(ID_UEBERHOEHUNG_TYPE_CLASS);
		createEReference(iD_Ueberhoehung_TypeClassEClass, ID_UEBERHOEHUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Ueberhoehung_TypeClassEClass, ID_UEBERHOEHUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Uebertragungsweg_Nach_TypeClassEClass = createEClass(ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS);
		createEReference(iD_Uebertragungsweg_Nach_TypeClassEClass, ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__VALUE);
		createEAttribute(iD_Uebertragungsweg_Nach_TypeClassEClass, ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS__INVALID_REFERENCE);

		iD_Uebertragungsweg_Von_TypeClassEClass = createEClass(ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS);
		createEReference(iD_Uebertragungsweg_Von_TypeClassEClass, ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__VALUE);
		createEAttribute(iD_Uebertragungsweg_Von_TypeClassEClass, ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS__INVALID_REFERENCE);

		iD_Umfahrpunkt_TypeClassEClass = createEClass(ID_UMFAHRPUNKT_TYPE_CLASS);
		createEReference(iD_Umfahrpunkt_TypeClassEClass, ID_UMFAHRPUNKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Umfahrpunkt_TypeClassEClass, ID_UMFAHRPUNKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Unterbringung_ohne_Proxy_TypeClassEClass = createEClass(ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_Unterbringung_ohne_Proxy_TypeClassEClass, ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_Unterbringung_ohne_Proxy_TypeClassEClass, ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_Unterbringung_Technik_TypeClassEClass = createEClass(ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS);
		createEReference(iD_Unterbringung_Technik_TypeClassEClass, ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__VALUE);
		createEAttribute(iD_Unterbringung_Technik_TypeClassEClass, ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS__INVALID_REFERENCE);

		iD_Unterbringung_TypeClassEClass = createEClass(ID_UNTERBRINGUNG_TYPE_CLASS);
		createEReference(iD_Unterbringung_TypeClassEClass, ID_UNTERBRINGUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Unterbringung_TypeClassEClass, ID_UNTERBRINGUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Ur_Objekt_TypeClassEClass = createEClass(ID_UR_OBJEKT_TYPE_CLASS);
		createEReference(iD_Ur_Objekt_TypeClassEClass, ID_UR_OBJEKT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Ur_Objekt_TypeClassEClass, ID_UR_OBJEKT_TYPE_CLASS__INVALID_REFERENCE);

		iD_Verknuepftes_Element_TypeClassEClass = createEClass(ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS);
		createEReference(iD_Verknuepftes_Element_TypeClassEClass, ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_Verknuepftes_Element_TypeClassEClass, ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass = createEClass(ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass, ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass, ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_W_Kr_Anlage_TypeClassEClass = createEClass(ID_WKR_ANLAGE_TYPE_CLASS);
		createEReference(iD_W_Kr_Anlage_TypeClassEClass, ID_WKR_ANLAGE_TYPE_CLASS__VALUE);
		createEAttribute(iD_W_Kr_Anlage_TypeClassEClass, ID_WKR_ANLAGE_TYPE_CLASS__INVALID_REFERENCE);

		iD_W_Kr_Gsp_Element_TypeClassEClass = createEClass(ID_WKR_GSP_ELEMENT_TYPE_CLASS);
		createEReference(iD_W_Kr_Gsp_Element_TypeClassEClass, ID_WKR_GSP_ELEMENT_TYPE_CLASS__VALUE);
		createEAttribute(iD_W_Kr_Gsp_Element_TypeClassEClass, ID_WKR_GSP_ELEMENT_TYPE_CLASS__INVALID_REFERENCE);

		iD_W_Kr_Gsp_Komponente_TypeClassEClass = createEClass(ID_WKR_GSP_KOMPONENTE_TYPE_CLASS);
		createEReference(iD_W_Kr_Gsp_Komponente_TypeClassEClass, ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_W_Kr_Gsp_Komponente_TypeClassEClass, ID_WKR_GSP_KOMPONENTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Weichenlaufkette_TypeClassEClass = createEClass(ID_WEICHENLAUFKETTE_TYPE_CLASS);
		createEReference(iD_Weichenlaufkette_TypeClassEClass, ID_WEICHENLAUFKETTE_TYPE_CLASS__VALUE);
		createEAttribute(iD_Weichenlaufkette_TypeClassEClass, ID_WEICHENLAUFKETTE_TYPE_CLASS__INVALID_REFERENCE);

		iD_Ziel_TypeClassEClass = createEClass(ID_ZIEL_TYPE_CLASS);
		createEReference(iD_Ziel_TypeClassEClass, ID_ZIEL_TYPE_CLASS__VALUE);
		createEAttribute(iD_Ziel_TypeClassEClass, ID_ZIEL_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZL_DLP_Fstr_TypeClassEClass = createEClass(ID_ZL_DLP_FSTR_TYPE_CLASS);
		createEReference(iD_ZL_DLP_Fstr_TypeClassEClass, ID_ZL_DLP_FSTR_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZL_DLP_Fstr_TypeClassEClass, ID_ZL_DLP_FSTR_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZL_Fstr_TypeClassEClass = createEClass(ID_ZL_FSTR_TYPE_CLASS);
		createEReference(iD_ZL_Fstr_TypeClassEClass, ID_ZL_FSTR_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZL_Fstr_TypeClassEClass, ID_ZL_FSTR_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZL_Signalgruppe_TypeClassEClass = createEClass(ID_ZL_SIGNALGRUPPE_TYPE_CLASS);
		createEReference(iD_ZL_Signalgruppe_TypeClassEClass, ID_ZL_SIGNALGRUPPE_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZL_Signalgruppe_TypeClassEClass, ID_ZL_SIGNALGRUPPE_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZL_TypeClassEClass = createEClass(ID_ZL_TYPE_CLASS);
		createEReference(iD_ZL_TypeClassEClass, ID_ZL_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZL_TypeClassEClass, ID_ZL_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZLV_Bus_ohne_Proxy_TypeClassEClass = createEClass(ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS);
		createEReference(iD_ZLV_Bus_ohne_Proxy_TypeClassEClass, ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZLV_Bus_ohne_Proxy_TypeClassEClass, ID_ZLV_BUS_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZLV_Bus_TypeClassEClass = createEClass(ID_ZLV_BUS_TYPE_CLASS);
		createEReference(iD_ZLV_Bus_TypeClassEClass, ID_ZLV_BUS_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZLV_Bus_TypeClassEClass, ID_ZLV_BUS_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass = createEClass(ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS);
		createEReference(iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass, ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass, ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_Anzeigefeld_TypeClassEClass = createEClass(ID_ZN_ANZEIGEFELD_TYPE_CLASS);
		createEReference(iD_ZN_Anzeigefeld_TypeClassEClass, ID_ZN_ANZEIGEFELD_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_Anzeigefeld_TypeClassEClass, ID_ZN_ANZEIGEFELD_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_Fortschalt_Kriterium_TypeClassEClass = createEClass(ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS);
		createEReference(iD_ZN_Fortschalt_Kriterium_TypeClassEClass, ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_Fortschalt_Kriterium_TypeClassEClass, ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_TypeClassEClass = createEClass(ID_ZN_TYPE_CLASS);
		createEReference(iD_ZN_TypeClassEClass, ID_ZN_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_TypeClassEClass, ID_ZN_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_Unterstation_TypeClassEClass = createEClass(ID_ZN_UNTERSTATION_TYPE_CLASS);
		createEReference(iD_ZN_Unterstation_TypeClassEClass, ID_ZN_UNTERSTATION_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_Unterstation_TypeClassEClass, ID_ZN_UNTERSTATION_TYPE_CLASS__INVALID_REFERENCE);

		iD_ZN_ZBS_TypeClassEClass = createEClass(ID_ZN_ZBS_TYPE_CLASS);
		createEReference(iD_ZN_ZBS_TypeClassEClass, ID_ZN_ZBS_TYPE_CLASS__VALUE);
		createEAttribute(iD_ZN_ZBS_TypeClassEClass, ID_ZN_ZBS_TYPE_CLASS__INVALID_REFERENCE);

		iD_Zugeinwirkung_TypeClassEClass = createEClass(ID_ZUGEINWIRKUNG_TYPE_CLASS);
		createEReference(iD_Zugeinwirkung_TypeClassEClass, ID_ZUGEINWIRKUNG_TYPE_CLASS__VALUE);
		createEAttribute(iD_Zugeinwirkung_TypeClassEClass, ID_ZUGEINWIRKUNG_TYPE_CLASS__INVALID_REFERENCE);

		iD_Zweites_Haltfallkriterium_TypeClassEClass = createEClass(ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS);
		createEReference(iD_Zweites_Haltfallkriterium_TypeClassEClass, ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__VALUE);
		createEAttribute(iD_Zweites_Haltfallkriterium_TypeClassEClass, ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS__INVALID_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasisTypenPackage theBasisTypenPackage = (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ATOPackage theATOPackage = (ATOPackage)EPackage.Registry.INSTANCE.getEPackage(ATOPackage.eNS_URI);
		PlanProPackage thePlanProPackage = (PlanProPackage)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		Ansteuerung_ElementPackage theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackage)EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		BahnsteigPackage theBahnsteigPackage = (BahnsteigPackage)EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		Balisentechnik_ETCSPackage theBalisentechnik_ETCSPackage = (Balisentechnik_ETCSPackage)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);
		BedienungPackage theBedienungPackage = (BedienungPackage)EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);
		BlockPackage theBlockPackage = (BlockPackage)EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BahnuebergangPackage theBahnuebergangPackage = (BahnuebergangPackage)EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);
		OrtungPackage theOrtungPackage = (OrtungPackage)EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);
		FlankenschutzPackage theFlankenschutzPackage = (FlankenschutzPackage)EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);
		FahrstrassePackage theFahrstrassePackage = (FahrstrassePackage)EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);
		GeodatenPackage theGeodatenPackage = (GeodatenPackage)EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);
		GleisPackage theGleisPackage = (GleisPackage)EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);
		SignalePackage theSignalePackage = (SignalePackage)EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);
		LayoutinformationenPackage theLayoutinformationenPackage = (LayoutinformationenPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutinformationenPackage.eNS_URI);
		NahbedienungPackage theNahbedienungPackage = (NahbedienungPackage)EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);
		PZBPackage thePZBPackage = (PZBPackage)EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		RegelzeichnungPackage theRegelzeichnungPackage = (RegelzeichnungPackage)EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);
		SchluesselabhaengigkeitenPackage theSchluesselabhaengigkeitenPackage = (SchluesselabhaengigkeitenPackage)EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);
		Weichen_und_GleissperrenPackage theWeichen_und_GleissperrenPackage = (Weichen_und_GleissperrenPackage)EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);
		Medien_und_TrassenPackage theMedien_und_TrassenPackage = (Medien_und_TrassenPackage)EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);
		ZuglenkungPackage theZuglenkungPackage = (ZuglenkungPackage)EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);
		ZugnummernmeldeanlagePackage theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackage)EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iD_Anforderer_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Anforderung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Anhang_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Anhang_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_AnhangBearbeitungsvermerk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Anschluss_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ATO_TS_Instanz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Aussenelementansteuerung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bahnsteig_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bahnsteig_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Balise_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Balise_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Basis_Objekt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Anzeige_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Bezirk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Einrichtung_Oertlich_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Oberflaeche_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Standort_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bedien_Zentrale_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Befestigung_Bauwerk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Beginn_Bereich_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Bezugspunkt_Positionierung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Binaerdaten_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Block_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Block_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Block_Strecke_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Anlage_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Bedien_Anzeige_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Einschaltung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_Schnittstelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Datenpunkt_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Datenpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_DP_Bezug_Funktional_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Einschaltpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Element_Grenze_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Element_Unterbringung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Energie_Eingang_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Energie_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ESTW_Zentraleinheit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ETCS_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ETCS_Knoten_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_EV_Modul_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fachtelegramm_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fachtelegramm_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fla_Schutz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FMA_Anlage_Rangier_Frei_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FMA_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FMA_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FMA_Komponente_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fortschaltung_Start_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_Aneinander_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_Ausschluss_Besonders_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_DWeg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_Fahrweg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Fstr_Zug_Rangier_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FT_Anschaltbedingung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_FT_Fahrweg_Teil_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GEO_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GEO_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GEO_Knoten_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GEO_Punkt_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GEO_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_GFR_Anlage_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Gleis_Abschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Gleis_Bezeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Grenzzeichen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Handschalt_Wirkfunktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Hoehenpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Information_Eingang_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Information_Primaer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Komponente_Programmiert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Lageplan_Blattschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Lageplan_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Lageplan_Zustand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_LEU_Anlage_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_LEU_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_LEU_Bezug_Funktional_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_LO_Einbau_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Markante_Stelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Markanter_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_NB_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_NB_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_NB_Zone_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Oertlichkeit_Ausgabe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Oertlichkeit_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Oertlichkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_PlanPro_Schnittstelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Planung_Einzel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Planungsgrundlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_PZB_Element_Bezugspunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_PZB_Element_Mitnutzung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_PZB_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_PZB_Element_Zuordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Quellelement_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_RBC_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Regelzeichnung_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Regelzeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Schalter_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Schaltmittel_Zuordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Schlosskombination_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Schluessel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Schluesselsperre_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Befestigung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Fank_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Gleisbezechnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Rahmen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Signalbegriff_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_Start_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Signal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Sonderanlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Stellelement_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Stellwerk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Strecke_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Strecke_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Technischer_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_TOP_Kante_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_TOP_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_TOP_Knoten_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Trasse_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Trasse_Knoten_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Ueberhoehung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Uebertragungsweg_Nach_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Uebertragungsweg_Von_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Umfahrpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Unterbringung_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Unterbringung_Technik_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Unterbringung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Ur_Objekt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Verknuepftes_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_W_Kr_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_W_Kr_Gsp_Element_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_W_Kr_Gsp_Komponente_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Weichenlaufkette_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Ziel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZL_DLP_Fstr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZL_Fstr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZL_Signalgruppe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZL_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZLV_Bus_ohne_Proxy_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZLV_Bus_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_Anzeigefeld_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_Fortschalt_Kriterium_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_Unterstation_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_ZN_ZBS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Zugeinwirkung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());
		iD_Zweites_Haltfallkriterium_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getZeiger_TypeClass());

		// Initialize classes and features; add operations and parameters
		initEClass(iD_Anforderer_Element_TypeClassEClass, ID_Anforderer_Element_TypeClass.class, "ID_Anforderer_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Anforderer_Element_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Anforderer_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Anforderer_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Anforderer_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Anforderung_TypeClassEClass, ID_Anforderung_TypeClass.class, "ID_Anforderung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Anforderung_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Anforderung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Anforderung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Anforderung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Anhang_ohne_Proxy_TypeClassEClass, ID_Anhang_ohne_Proxy_TypeClass.class, "ID_Anhang_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Anhang_ohne_Proxy_TypeClass_Value(), theBasisobjektePackage.getAnhang(), null, "value", null, 0, 1, ID_Anhang_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Anhang_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Anhang_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Anhang_TypeClassEClass, ID_Anhang_TypeClass.class, "ID_Anhang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Anhang_TypeClass_Value(), theBasisobjektePackage.getAnhang(), null, "value", null, 0, 1, ID_Anhang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Anhang_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Anhang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_AnhangBearbeitungsvermerk_TypeClassEClass, ID_AnhangBearbeitungsvermerk_TypeClass.class, "ID_AnhangBearbeitungsvermerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_AnhangBearbeitungsvermerk_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_AnhangBearbeitungsvermerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_AnhangBearbeitungsvermerk_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_AnhangBearbeitungsvermerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Anschluss_Element_TypeClassEClass, ID_Anschluss_Element_TypeClass.class, "ID_Anschluss_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Anschluss_Element_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Anschluss_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Anschluss_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Anschluss_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass, ID_ATO_TS_Instanz_ohne_Proxy_TypeClass.class, "ID_ATO_TS_Instanz_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_Value(), theATOPackage.getATO_TS_Instanz(), null, "value", null, 0, 1, ID_ATO_TS_Instanz_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ATO_TS_Instanz_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ATO_TS_Instanz_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ATO_TS_Instanz_TypeClassEClass, ID_ATO_TS_Instanz_TypeClass.class, "ID_ATO_TS_Instanz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ATO_TS_Instanz_TypeClass_Value(), theATOPackage.getATO_TS_Instanz(), null, "value", null, 0, 1, ID_ATO_TS_Instanz_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ATO_TS_Instanz_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ATO_TS_Instanz_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass, ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass.class, "ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_Value(), thePlanProPackage.getAusgabe_Fachdaten(), null, "value", null, 0, 1, ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass, ID_Aussenelementansteuerung_ohne_Proxy_TypeClass.class, "ID_Aussenelementansteuerung_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_Value(), theAnsteuerung_ElementPackage.getAussenelementansteuerung(), null, "value", null, 0, 1, ID_Aussenelementansteuerung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Aussenelementansteuerung_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Aussenelementansteuerung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Aussenelementansteuerung_TypeClassEClass, ID_Aussenelementansteuerung_TypeClass.class, "ID_Aussenelementansteuerung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Aussenelementansteuerung_TypeClass_Value(), theAnsteuerung_ElementPackage.getAussenelementansteuerung(), null, "value", null, 0, 1, ID_Aussenelementansteuerung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Aussenelementansteuerung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Aussenelementansteuerung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bahnsteig_Anlage_TypeClassEClass, ID_Bahnsteig_Anlage_TypeClass.class, "ID_Bahnsteig_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bahnsteig_Anlage_TypeClass_Value(), theBahnsteigPackage.getBahnsteig_Anlage(), null, "value", null, 0, 1, ID_Bahnsteig_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bahnsteig_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bahnsteig_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass, ID_Bahnsteig_Kante_ohne_Proxy_TypeClass.class, "ID_Bahnsteig_Kante_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_Value(), theBahnsteigPackage.getBahnsteig_Kante(), null, "value", null, 0, 1, ID_Bahnsteig_Kante_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bahnsteig_Kante_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bahnsteig_Kante_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bahnsteig_Kante_TypeClassEClass, ID_Bahnsteig_Kante_TypeClass.class, "ID_Bahnsteig_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bahnsteig_Kante_TypeClass_Value(), theBahnsteigPackage.getBahnsteig_Kante(), null, "value", null, 0, 1, ID_Bahnsteig_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bahnsteig_Kante_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bahnsteig_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Balise_ohne_Proxy_TypeClassEClass, ID_Balise_ohne_Proxy_TypeClass.class, "ID_Balise_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Balise_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getBalise(), null, "value", null, 0, 1, ID_Balise_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Balise_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Balise_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Balise_TypeClassEClass, ID_Balise_TypeClass.class, "ID_Balise_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Balise_TypeClass_Value(), theBalisentechnik_ETCSPackage.getBalise(), null, "value", null, 0, 1, ID_Balise_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Balise_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Balise_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Basis_Objekt_TypeClassEClass, ID_Basis_Objekt_TypeClass.class, "ID_Basis_Objekt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Basis_Objekt_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Basis_Objekt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Basis_Objekt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Basis_Objekt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Anzeige_Element_TypeClassEClass, ID_Bedien_Anzeige_Element_TypeClass.class, "ID_Bedien_Anzeige_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Anzeige_Element_TypeClass_Value(), theBedienungPackage.getBedien_Anzeige_Element(), null, "value", null, 0, 1, ID_Bedien_Anzeige_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Anzeige_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Anzeige_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Bezirk_TypeClassEClass, ID_Bedien_Bezirk_TypeClass.class, "ID_Bedien_Bezirk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Bezirk_TypeClass_Value(), theBedienungPackage.getBedien_Bezirk(), null, "value", null, 0, 1, ID_Bedien_Bezirk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Bezirk_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Bezirk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Einrichtung_Oertlich_TypeClassEClass, ID_Bedien_Einrichtung_Oertlich_TypeClass.class, "ID_Bedien_Einrichtung_Oertlich_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Einrichtung_Oertlich_TypeClass_Value(), theBedienungPackage.getBedien_Einrichtung_Oertlich(), null, "value", null, 0, 1, ID_Bedien_Einrichtung_Oertlich_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Einrichtung_Oertlich_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Einrichtung_Oertlich_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Oberflaeche_TypeClassEClass, ID_Bedien_Oberflaeche_TypeClass.class, "ID_Bedien_Oberflaeche_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Oberflaeche_TypeClass_Value(), theBedienungPackage.getBedien_Oberflaeche(), null, "value", null, 0, 1, ID_Bedien_Oberflaeche_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Oberflaeche_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Oberflaeche_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Standort_TypeClassEClass, ID_Bedien_Standort_TypeClass.class, "ID_Bedien_Standort_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Standort_TypeClass_Value(), theBedienungPackage.getBedien_Standort(), null, "value", null, 0, 1, ID_Bedien_Standort_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Standort_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Standort_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bedien_Zentrale_TypeClassEClass, ID_Bedien_Zentrale_TypeClass.class, "ID_Bedien_Zentrale_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bedien_Zentrale_TypeClass_Value(), theBedienungPackage.getBedien_Zentrale(), null, "value", null, 0, 1, ID_Bedien_Zentrale_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bedien_Zentrale_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bedien_Zentrale_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Befestigung_Bauwerk_TypeClassEClass, ID_Befestigung_Bauwerk_TypeClass.class, "ID_Befestigung_Bauwerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Befestigung_Bauwerk_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Befestigung_Bauwerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Befestigung_Bauwerk_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Befestigung_Bauwerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Beginn_Bereich_TypeClassEClass, ID_Beginn_Bereich_TypeClass.class, "ID_Beginn_Bereich_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Beginn_Bereich_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Beginn_Bereich_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Beginn_Bereich_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Beginn_Bereich_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bezugspunkt_Positionierung_TypeClassEClass, ID_Bezugspunkt_Positionierung_TypeClass.class, "ID_Bezugspunkt_Positionierung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Bezugspunkt_Positionierung_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Bezugspunkt_Positionierung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Bezugspunkt_Positionierung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Bezugspunkt_Positionierung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Binaerdaten_ohne_Proxy_TypeClassEClass, ID_Binaerdaten_ohne_Proxy_TypeClass.class, "ID_Binaerdaten_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Binaerdaten_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getBinaerdaten(), null, "value", null, 0, 1, ID_Binaerdaten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Binaerdaten_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Binaerdaten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Block_Anlage_TypeClassEClass, ID_Block_Anlage_TypeClass.class, "ID_Block_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Block_Anlage_TypeClass_Value(), theBlockPackage.getBlock_Anlage(), null, "value", null, 0, 1, ID_Block_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Block_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Block_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Block_Element_TypeClassEClass, ID_Block_Element_TypeClass.class, "ID_Block_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Block_Element_TypeClass_Value(), theBlockPackage.getBlock_Element(), null, "value", null, 0, 1, ID_Block_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Block_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Block_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Block_Strecke_TypeClassEClass, ID_Block_Strecke_TypeClass.class, "ID_Block_Strecke_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Block_Strecke_TypeClass_Value(), theBlockPackage.getBlock_Strecke(), null, "value", null, 0, 1, ID_Block_Strecke_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Block_Strecke_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Block_Strecke_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Anlage_ohne_Proxy_TypeClassEClass, ID_BUE_Anlage_ohne_Proxy_TypeClass.class, "ID_BUE_Anlage_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Anlage_ohne_Proxy_TypeClass_Value(), theBahnuebergangPackage.getBUE_Anlage(), null, "value", null, 0, 1, ID_BUE_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Anlage_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Anlage_TypeClassEClass, ID_BUE_Anlage_TypeClass.class, "ID_BUE_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Anlage_TypeClass_Value(), theBahnuebergangPackage.getBUE_Anlage(), null, "value", null, 0, 1, ID_BUE_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Bedien_Anzeige_Element_TypeClassEClass, ID_BUE_Bedien_Anzeige_Element_TypeClass.class, "ID_BUE_Bedien_Anzeige_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Bedien_Anzeige_Element_TypeClass_Value(), theBahnuebergangPackage.getBUE_Bedien_Anzeige_Element(), null, "value", null, 0, 1, ID_BUE_Bedien_Anzeige_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Bedien_Anzeige_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Bedien_Anzeige_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Einschaltung_TypeClassEClass, ID_BUE_Einschaltung_TypeClass.class, "ID_BUE_Einschaltung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Einschaltung_TypeClass_Value(), theBahnuebergangPackage.getBUE_Einschaltung(), null, "value", null, 0, 1, ID_BUE_Einschaltung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Einschaltung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Einschaltung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass, ID_BUE_Gleisbezogener_Gefahrraum_TypeClass.class, "ID_BUE_Gleisbezogener_Gefahrraum_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_Value(), theBahnuebergangPackage.getBUE_Gleisbezogener_Gefahrraum(), null, "value", null, 0, 1, ID_BUE_Gleisbezogener_Gefahrraum_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Gleisbezogener_Gefahrraum_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Gleisbezogener_Gefahrraum_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_Schnittstelle_TypeClassEClass, ID_BUE_Schnittstelle_TypeClass.class, "ID_BUE_Schnittstelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_Schnittstelle_TypeClass_Value(), theBahnuebergangPackage.getBUE_Schnittstelle(), null, "value", null, 0, 1, ID_BUE_Schnittstelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_Schnittstelle_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_Schnittstelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass, ID_BUE_WS_Fstr_Zuordnung_TypeClass.class, "ID_BUE_WS_Fstr_Zuordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_BUE_WS_Fstr_Zuordnung_TypeClass_Value(), theBahnuebergangPackage.getBUE_WS_Fstr_Zuordnung(), null, "value", null, 0, 1, ID_BUE_WS_Fstr_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_BUE_WS_Fstr_Zuordnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_BUE_WS_Fstr_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Datenpunkt_ohne_Proxy_TypeClassEClass, ID_Datenpunkt_ohne_Proxy_TypeClass.class, "ID_Datenpunkt_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Datenpunkt_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getDatenpunkt(), null, "value", null, 0, 1, ID_Datenpunkt_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Datenpunkt_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Datenpunkt_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Datenpunkt_TypeClassEClass, ID_Datenpunkt_TypeClass.class, "ID_Datenpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Datenpunkt_TypeClass_Value(), theBalisentechnik_ETCSPackage.getDatenpunkt(), null, "value", null, 0, 1, ID_Datenpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Datenpunkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Datenpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_DP_Bezug_Funktional_TypeClassEClass, ID_DP_Bezug_Funktional_TypeClass.class, "ID_DP_Bezug_Funktional_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_DP_Bezug_Funktional_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_DP_Bezug_Funktional_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_DP_Bezug_Funktional_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_DP_Bezug_Funktional_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Einschaltpunkt_TypeClassEClass, ID_Einschaltpunkt_TypeClass.class, "ID_Einschaltpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Einschaltpunkt_TypeClass_Value(), theOrtungPackage.getSchaltmittel_Zuordnung(), null, "value", null, 0, 1, ID_Einschaltpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Einschaltpunkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Einschaltpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Element_Grenze_TypeClassEClass, ID_Element_Grenze_TypeClass.class, "ID_Element_Grenze_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Element_Grenze_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Element_Grenze_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Element_Grenze_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Element_Grenze_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Element_TypeClassEClass, ID_Element_TypeClass.class, "ID_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Element_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Element_Unterbringung_TypeClassEClass, ID_Element_Unterbringung_TypeClass.class, "ID_Element_Unterbringung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Element_Unterbringung_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Element_Unterbringung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Element_Unterbringung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Element_Unterbringung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Energie_Eingang_TypeClassEClass, ID_Energie_Eingang_TypeClass.class, "ID_Energie_Eingang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Energie_Eingang_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Energie_Eingang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Energie_Eingang_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Energie_Eingang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Energie_TypeClassEClass, ID_Energie_TypeClass.class, "ID_Energie_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Energie_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Energie_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Energie_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Energie_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ESTW_Zentraleinheit_TypeClassEClass, ID_ESTW_Zentraleinheit_TypeClass.class, "ID_ESTW_Zentraleinheit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ESTW_Zentraleinheit_TypeClass_Value(), theAnsteuerung_ElementPackage.getESTW_Zentraleinheit(), null, "value", null, 0, 1, ID_ESTW_Zentraleinheit_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ESTW_Zentraleinheit_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ESTW_Zentraleinheit_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ETCS_Kante_TypeClassEClass, ID_ETCS_Kante_TypeClass.class, "ID_ETCS_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ETCS_Kante_TypeClass_Value(), theBalisentechnik_ETCSPackage.getETCS_Kante(), null, "value", null, 0, 1, ID_ETCS_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ETCS_Kante_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ETCS_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass, ID_ETCS_Knoten_ohne_Proxy_TypeClass.class, "ID_ETCS_Knoten_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ETCS_Knoten_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getETCS_Knoten(), null, "value", null, 0, 1, ID_ETCS_Knoten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ETCS_Knoten_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ETCS_Knoten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ETCS_Knoten_TypeClassEClass, ID_ETCS_Knoten_TypeClass.class, "ID_ETCS_Knoten_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ETCS_Knoten_TypeClass_Value(), theBalisentechnik_ETCSPackage.getETCS_Knoten(), null, "value", null, 0, 1, ID_ETCS_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ETCS_Knoten_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ETCS_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_EV_Modul_TypeClassEClass, ID_EV_Modul_TypeClass.class, "ID_EV_Modul_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_EV_Modul_TypeClass_Value(), theBalisentechnik_ETCSPackage.getEV_Modul(), null, "value", null, 0, 1, ID_EV_Modul_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_EV_Modul_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_EV_Modul_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fachtelegramm_ohne_Proxy_TypeClassEClass, ID_Fachtelegramm_ohne_Proxy_TypeClass.class, "ID_Fachtelegramm_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fachtelegramm_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getFachtelegramm(), null, "value", null, 0, 1, ID_Fachtelegramm_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fachtelegramm_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fachtelegramm_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fachtelegramm_TypeClassEClass, ID_Fachtelegramm_TypeClass.class, "ID_Fachtelegramm_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fachtelegramm_TypeClass_Value(), theBalisentechnik_ETCSPackage.getFachtelegramm(), null, "value", null, 0, 1, ID_Fachtelegramm_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fachtelegramm_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fachtelegramm_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fla_Schutz_TypeClassEClass, ID_Fla_Schutz_TypeClass.class, "ID_Fla_Schutz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fla_Schutz_TypeClass_Value(), theFlankenschutzPackage.getFla_Schutz(), null, "value", null, 0, 1, ID_Fla_Schutz_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fla_Schutz_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fla_Schutz_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FMA_Anlage_Rangier_Frei_TypeClassEClass, ID_FMA_Anlage_Rangier_Frei_TypeClass.class, "ID_FMA_Anlage_Rangier_Frei_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FMA_Anlage_Rangier_Frei_TypeClass_Value(), theOrtungPackage.getFMA_Anlage(), null, "value", null, 0, 1, ID_FMA_Anlage_Rangier_Frei_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FMA_Anlage_Rangier_Frei_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FMA_Anlage_Rangier_Frei_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FMA_Anlage_TypeClassEClass, ID_FMA_Anlage_TypeClass.class, "ID_FMA_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FMA_Anlage_TypeClass_Value(), theOrtungPackage.getFMA_Anlage(), null, "value", null, 0, 1, ID_FMA_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FMA_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FMA_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FMA_Element_TypeClassEClass, ID_FMA_Element_TypeClass.class, "ID_FMA_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FMA_Element_TypeClass_Value(), theOrtungPackage.getFMA_Element(), null, "value", null, 0, 1, ID_FMA_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FMA_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FMA_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FMA_Komponente_TypeClassEClass, ID_FMA_Komponente_TypeClass.class, "ID_FMA_Komponente_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FMA_Komponente_TypeClass_Value(), theOrtungPackage.getFMA_Komponente(), null, "value", null, 0, 1, ID_FMA_Komponente_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FMA_Komponente_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FMA_Komponente_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fortschaltung_Start_TypeClassEClass, ID_Fortschaltung_Start_TypeClass.class, "ID_Fortschaltung_Start_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fortschaltung_Start_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Fortschaltung_Start_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fortschaltung_Start_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fortschaltung_Start_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_Aneinander_TypeClassEClass, ID_Fstr_Aneinander_TypeClass.class, "ID_Fstr_Aneinander_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_Aneinander_TypeClass_Value(), theFahrstrassePackage.getFstr_Aneinander(), null, "value", null, 0, 1, ID_Fstr_Aneinander_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_Aneinander_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_Aneinander_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_Ausschluss_Besonders_TypeClassEClass, ID_Fstr_Ausschluss_Besonders_TypeClass.class, "ID_Fstr_Ausschluss_Besonders_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_Ausschluss_Besonders_TypeClass_Value(), theFahrstrassePackage.getFstr_Zug_Rangier(), null, "value", null, 0, 1, ID_Fstr_Ausschluss_Besonders_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_Ausschluss_Besonders_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_Ausschluss_Besonders_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass, ID_Fstr_DWeg_ohne_Proxy_TypeClass.class, "ID_Fstr_DWeg_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_DWeg_ohne_Proxy_TypeClass_Value(), theFahrstrassePackage.getFstr_DWeg(), null, "value", null, 0, 1, ID_Fstr_DWeg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_DWeg_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_DWeg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_DWeg_TypeClassEClass, ID_Fstr_DWeg_TypeClass.class, "ID_Fstr_DWeg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_DWeg_TypeClass_Value(), theFahrstrassePackage.getFstr_DWeg(), null, "value", null, 0, 1, ID_Fstr_DWeg_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_DWeg_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_DWeg_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass, ID_Fstr_Fahrweg_ohne_Proxy_TypeClass.class, "ID_Fstr_Fahrweg_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_Value(), theFahrstrassePackage.getFstr_Fahrweg(), null, "value", null, 0, 1, ID_Fstr_Fahrweg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_Fahrweg_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_Fahrweg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_Fahrweg_TypeClassEClass, ID_Fstr_Fahrweg_TypeClass.class, "ID_Fstr_Fahrweg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_Fahrweg_TypeClass_Value(), theFahrstrassePackage.getFstr_Fahrweg(), null, "value", null, 0, 1, ID_Fstr_Fahrweg_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_Fahrweg_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_Fahrweg_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Fstr_Zug_Rangier_TypeClassEClass, ID_Fstr_Zug_Rangier_TypeClass.class, "ID_Fstr_Zug_Rangier_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Fstr_Zug_Rangier_TypeClass_Value(), theFahrstrassePackage.getFstr_Zug_Rangier(), null, "value", null, 0, 1, ID_Fstr_Zug_Rangier_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Fstr_Zug_Rangier_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Fstr_Zug_Rangier_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FT_Anschaltbedingung_TypeClassEClass, ID_FT_Anschaltbedingung_TypeClass.class, "ID_FT_Anschaltbedingung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FT_Anschaltbedingung_TypeClass_Value(), theBalisentechnik_ETCSPackage.getFT_Anschaltbedingung(), null, "value", null, 0, 1, ID_FT_Anschaltbedingung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FT_Anschaltbedingung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FT_Anschaltbedingung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_FT_Fahrweg_Teil_TypeClassEClass, ID_FT_Fahrweg_Teil_TypeClass.class, "ID_FT_Fahrweg_Teil_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_FT_Fahrweg_Teil_TypeClass_Value(), theBalisentechnik_ETCSPackage.getFT_Fahrweg_Teil(), null, "value", null, 0, 1, ID_FT_Fahrweg_Teil_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_FT_Fahrweg_Teil_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_FT_Fahrweg_Teil_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GEO_Art_TypeClassEClass, ID_GEO_Art_TypeClass.class, "ID_GEO_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GEO_Art_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_GEO_Art_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GEO_Art_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GEO_Art_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GEO_Kante_TypeClassEClass, ID_GEO_Kante_TypeClass.class, "ID_GEO_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GEO_Kante_TypeClass_Value(), theGeodatenPackage.getGEO_Kante(), null, "value", null, 0, 1, ID_GEO_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GEO_Kante_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GEO_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GEO_Knoten_TypeClassEClass, ID_GEO_Knoten_TypeClass.class, "ID_GEO_Knoten_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GEO_Knoten_TypeClass_Value(), theGeodatenPackage.getGEO_Knoten(), null, "value", null, 0, 1, ID_GEO_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GEO_Knoten_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GEO_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GEO_Punkt_ohne_Proxy_TypeClassEClass, ID_GEO_Punkt_ohne_Proxy_TypeClass.class, "ID_GEO_Punkt_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GEO_Punkt_ohne_Proxy_TypeClass_Value(), theGeodatenPackage.getGEO_Punkt(), null, "value", null, 0, 1, ID_GEO_Punkt_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GEO_Punkt_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GEO_Punkt_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GEO_Punkt_TypeClassEClass, ID_GEO_Punkt_TypeClass.class, "ID_GEO_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GEO_Punkt_TypeClass_Value(), theGeodatenPackage.getGEO_Punkt(), null, "value", null, 0, 1, ID_GEO_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GEO_Punkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GEO_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_GFR_Anlage_ohne_Proxy_TypeClassEClass, ID_GFR_Anlage_ohne_Proxy_TypeClass.class, "ID_GFR_Anlage_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_GFR_Anlage_ohne_Proxy_TypeClass_Value(), theBahnuebergangPackage.getGFR_Anlage(), null, "value", null, 0, 1, ID_GFR_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_GFR_Anlage_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_GFR_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Gleis_Abschnitt_TypeClassEClass, ID_Gleis_Abschnitt_TypeClass.class, "ID_Gleis_Abschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Gleis_Abschnitt_TypeClass_Value(), theGleisPackage.getGleis_Abschnitt(), null, "value", null, 0, 1, ID_Gleis_Abschnitt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Gleis_Abschnitt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Gleis_Abschnitt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Gleis_Bezeichnung_TypeClassEClass, ID_Gleis_Bezeichnung_TypeClass.class, "ID_Gleis_Bezeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Gleis_Bezeichnung_TypeClass_Value(), theGleisPackage.getGleis_Bezeichnung(), null, "value", null, 0, 1, ID_Gleis_Bezeichnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Gleis_Bezeichnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Gleis_Bezeichnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Grenzzeichen_TypeClassEClass, ID_Grenzzeichen_TypeClass.class, "ID_Grenzzeichen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Grenzzeichen_TypeClass_Value(), theSignalePackage.getSignal(), null, "value", null, 0, 1, ID_Grenzzeichen_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Grenzzeichen_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Grenzzeichen_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Handschalt_Wirkfunktion_TypeClassEClass, ID_Handschalt_Wirkfunktion_TypeClass.class, "ID_Handschalt_Wirkfunktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Handschalt_Wirkfunktion_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Handschalt_Wirkfunktion_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Handschalt_Wirkfunktion_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Handschalt_Wirkfunktion_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Hoehenpunkt_TypeClassEClass, ID_Hoehenpunkt_TypeClass.class, "ID_Hoehenpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Hoehenpunkt_TypeClass_Value(), theGeodatenPackage.getHoehenpunkt(), null, "value", null, 0, 1, ID_Hoehenpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Hoehenpunkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Hoehenpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Information_Eingang_TypeClassEClass, ID_Information_Eingang_TypeClass.class, "ID_Information_Eingang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Information_Eingang_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Information_Eingang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Information_Eingang_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Information_Eingang_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Information_Primaer_TypeClassEClass, ID_Information_Primaer_TypeClass.class, "ID_Information_Primaer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Information_Primaer_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Information_Primaer_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Information_Primaer_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Information_Primaer_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Komponente_Programmiert_TypeClassEClass, ID_Komponente_Programmiert_TypeClass.class, "ID_Komponente_Programmiert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Komponente_Programmiert_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Komponente_Programmiert_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Komponente_Programmiert_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Komponente_Programmiert_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Lageplan_Blattschnitt_TypeClassEClass, ID_Lageplan_Blattschnitt_TypeClass.class, "ID_Lageplan_Blattschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Lageplan_Blattschnitt_TypeClass_Value(), theLayoutinformationenPackage.getLageplan_Blattschnitt(), null, "value", null, 0, 1, ID_Lageplan_Blattschnitt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Lageplan_Blattschnitt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Lageplan_Blattschnitt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Lageplan_TypeClassEClass, ID_Lageplan_TypeClass.class, "ID_Lageplan_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Lageplan_TypeClass_Value(), theLayoutinformationenPackage.getLageplan(), null, "value", null, 0, 1, ID_Lageplan_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Lageplan_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Lageplan_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Lageplan_Zustand_TypeClassEClass, ID_Lageplan_Zustand_TypeClass.class, "ID_Lageplan_Zustand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Lageplan_Zustand_TypeClass_Value(), theLayoutinformationenPackage.getLageplan_Zustand(), null, "value", null, 0, 1, ID_Lageplan_Zustand_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Lageplan_Zustand_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Lageplan_Zustand_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_LEU_Anlage_ohne_Proxy_TypeClassEClass, ID_LEU_Anlage_ohne_Proxy_TypeClass.class, "ID_LEU_Anlage_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_LEU_Anlage_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getLEU_Anlage(), null, "value", null, 0, 1, ID_LEU_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_LEU_Anlage_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_LEU_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_LEU_Anlage_TypeClassEClass, ID_LEU_Anlage_TypeClass.class, "ID_LEU_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_LEU_Anlage_TypeClass_Value(), theBalisentechnik_ETCSPackage.getLEU_Anlage(), null, "value", null, 0, 1, ID_LEU_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_LEU_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_LEU_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_LEU_Bezug_Funktional_TypeClassEClass, ID_LEU_Bezug_Funktional_TypeClass.class, "ID_LEU_Bezug_Funktional_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_LEU_Bezug_Funktional_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_LEU_Bezug_Funktional_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_LEU_Bezug_Funktional_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_LEU_Bezug_Funktional_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass, ID_LEU_Schaltkasten_ohne_Proxy_TypeClass.class, "ID_LEU_Schaltkasten_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_Value(), theBalisentechnik_ETCSPackage.getLEU_Schaltkasten(), null, "value", null, 0, 1, ID_LEU_Schaltkasten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_LEU_Schaltkasten_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_LEU_Schaltkasten_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_LO_Einbau_TypeClassEClass, ID_LO_Einbau_TypeClass.class, "ID_LO_Einbau_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_LO_Einbau_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_LO_Einbau_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_LO_Einbau_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_LO_Einbau_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Markante_Stelle_TypeClassEClass, ID_Markante_Stelle_TypeClass.class, "ID_Markante_Stelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Markante_Stelle_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Markante_Stelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Markante_Stelle_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Markante_Stelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass, ID_Markanter_Punkt_Gleis_Abschluss_TypeClass.class, "ID_Markanter_Punkt_Gleis_Abschluss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Markanter_Punkt_Gleis_Abschluss_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Markanter_Punkt_Gleis_Abschluss_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Markanter_Punkt_Gleis_Abschluss_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Markanter_Punkt_TypeClassEClass, ID_Markanter_Punkt_TypeClass.class, "ID_Markanter_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Markanter_Punkt_TypeClass_Value(), theFahrstrassePackage.getMarkanter_Punkt(), null, "value", null, 0, 1, ID_Markanter_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Markanter_Punkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Markanter_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_NB_Element_TypeClassEClass, ID_NB_Element_TypeClass.class, "ID_NB_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_NB_Element_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_NB_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_NB_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_NB_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_NB_TypeClassEClass, ID_NB_TypeClass.class, "ID_NB_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_NB_TypeClass_Value(), theNahbedienungPackage.getNB(), null, "value", null, 0, 1, ID_NB_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_NB_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_NB_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_NB_Zone_TypeClassEClass, ID_NB_Zone_TypeClass.class, "ID_NB_Zone_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_NB_Zone_TypeClass_Value(), theNahbedienungPackage.getNB_Zone(), null, "value", null, 0, 1, ID_NB_Zone_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_NB_Zone_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_NB_Zone_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Oertlichkeit_Ausgabe_TypeClassEClass, ID_Oertlichkeit_Ausgabe_TypeClass.class, "ID_Oertlichkeit_Ausgabe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Oertlichkeit_Ausgabe_TypeClass_Value(), theGeodatenPackage.getOertlichkeit(), null, "value", null, 0, 1, ID_Oertlichkeit_Ausgabe_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Oertlichkeit_Ausgabe_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Oertlichkeit_Ausgabe_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Oertlichkeit_Proxy_TypeClassEClass, ID_Oertlichkeit_Proxy_TypeClass.class, "ID_Oertlichkeit_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Oertlichkeit_Proxy_TypeClass_Value(), theGeodatenPackage.getOertlichkeit(), null, "value", null, 0, 1, ID_Oertlichkeit_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Oertlichkeit_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Oertlichkeit_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Oertlichkeit_TypeClassEClass, ID_Oertlichkeit_TypeClass.class, "ID_Oertlichkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Oertlichkeit_TypeClass_Value(), theGeodatenPackage.getOertlichkeit(), null, "value", null, 0, 1, ID_Oertlichkeit_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Oertlichkeit_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Oertlichkeit_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_PlanPro_Schnittstelle_TypeClassEClass, ID_PlanPro_Schnittstelle_TypeClass.class, "ID_PlanPro_Schnittstelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_PlanPro_Schnittstelle_TypeClass_Value(), thePlanProPackage.getPlanPro_Schnittstelle(), null, "value", null, 0, 1, ID_PlanPro_Schnittstelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_PlanPro_Schnittstelle_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_PlanPro_Schnittstelle_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Planung_Einzel_TypeClassEClass, ID_Planung_Einzel_TypeClass.class, "ID_Planung_Einzel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Planung_Einzel_TypeClass_Value(), thePlanProPackage.getPlanung_Einzel(), null, "value", null, 0, 1, ID_Planung_Einzel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Planung_Einzel_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Planung_Einzel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Planungsgrundlage_TypeClassEClass, ID_Planungsgrundlage_TypeClass.class, "ID_Planungsgrundlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Planungsgrundlage_TypeClass_Value(), theBasisobjektePackage.getUr_Objekt(), null, "value", null, 0, 1, ID_Planungsgrundlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Planungsgrundlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Planungsgrundlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_PZB_Element_Bezugspunkt_TypeClassEClass, ID_PZB_Element_Bezugspunkt_TypeClass.class, "ID_PZB_Element_Bezugspunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_PZB_Element_Bezugspunkt_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_PZB_Element_Bezugspunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_PZB_Element_Bezugspunkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_PZB_Element_Bezugspunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_PZB_Element_Mitnutzung_TypeClassEClass, ID_PZB_Element_Mitnutzung_TypeClass.class, "ID_PZB_Element_Mitnutzung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_PZB_Element_Mitnutzung_TypeClass_Value(), thePZBPackage.getPZB_Element(), null, "value", null, 0, 1, ID_PZB_Element_Mitnutzung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_PZB_Element_Mitnutzung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_PZB_Element_Mitnutzung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_PZB_Element_TypeClassEClass, ID_PZB_Element_TypeClass.class, "ID_PZB_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_PZB_Element_TypeClass_Value(), thePZBPackage.getPZB_Element(), null, "value", null, 0, 1, ID_PZB_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_PZB_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_PZB_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_PZB_Element_Zuordnung_TypeClassEClass, ID_PZB_Element_Zuordnung_TypeClass.class, "ID_PZB_Element_Zuordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_PZB_Element_Zuordnung_TypeClass_Value(), thePZBPackage.getPZB_Element_Zuordnung(), null, "value", null, 0, 1, ID_PZB_Element_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_PZB_Element_Zuordnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_PZB_Element_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Quellelement_TypeClassEClass, ID_Quellelement_TypeClass.class, "ID_Quellelement_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Quellelement_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Quellelement_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Quellelement_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Quellelement_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_RBC_TypeClassEClass, ID_RBC_TypeClass.class, "ID_RBC_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_RBC_TypeClass_Value(), theBalisentechnik_ETCSPackage.getRBC(), null, "value", null, 0, 1, ID_RBC_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_RBC_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_RBC_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Regelzeichnung_ohne_Proxy_TypeClassEClass, ID_Regelzeichnung_ohne_Proxy_TypeClass.class, "ID_Regelzeichnung_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Regelzeichnung_ohne_Proxy_TypeClass_Value(), theRegelzeichnungPackage.getRegelzeichnung(), null, "value", null, 0, 1, ID_Regelzeichnung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Regelzeichnung_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Regelzeichnung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Regelzeichnung_TypeClassEClass, ID_Regelzeichnung_TypeClass.class, "ID_Regelzeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Regelzeichnung_TypeClass_Value(), theRegelzeichnungPackage.getRegelzeichnung(), null, "value", null, 0, 1, ID_Regelzeichnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Regelzeichnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Regelzeichnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Schalter_TypeClassEClass, ID_Schalter_TypeClass.class, "ID_Schalter_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Schalter_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Schalter_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Schalter_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Schalter_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Schaltmittel_Zuordnung_TypeClassEClass, ID_Schaltmittel_Zuordnung_TypeClass.class, "ID_Schaltmittel_Zuordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Schaltmittel_Zuordnung_TypeClass_Value(), theOrtungPackage.getSchaltmittel_Zuordnung(), null, "value", null, 0, 1, ID_Schaltmittel_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Schaltmittel_Zuordnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Schaltmittel_Zuordnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Schlosskombination_TypeClassEClass, ID_Schlosskombination_TypeClass.class, "ID_Schlosskombination_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Schlosskombination_TypeClass_Value(), theSchluesselabhaengigkeitenPackage.getSchlosskombination(), null, "value", null, 0, 1, ID_Schlosskombination_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Schlosskombination_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Schlosskombination_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Schluessel_TypeClassEClass, ID_Schluessel_TypeClass.class, "ID_Schluessel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Schluessel_TypeClass_Value(), theSchluesselabhaengigkeitenPackage.getSchluessel(), null, "value", null, 0, 1, ID_Schluessel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Schluessel_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Schluessel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Schluesselsperre_TypeClassEClass, ID_Schluesselsperre_TypeClass.class, "ID_Schluesselsperre_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Schluesselsperre_TypeClass_Value(), theSchluesselabhaengigkeitenPackage.getSchluesselsperre(), null, "value", null, 0, 1, ID_Schluesselsperre_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Schluesselsperre_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Schluesselsperre_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Befestigung_TypeClassEClass, ID_Signal_Befestigung_TypeClass.class, "ID_Signal_Befestigung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Befestigung_TypeClass_Value(), theSignalePackage.getSignal_Befestigung(), null, "value", null, 0, 1, ID_Signal_Befestigung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Befestigung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Befestigung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Fank_TypeClassEClass, ID_Signal_Fank_TypeClass.class, "ID_Signal_Fank_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Fank_TypeClass_Value(), theSignalePackage.getSignal(), null, "value", null, 0, 1, ID_Signal_Fank_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Fank_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Fank_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Gleisbezechnung_TypeClassEClass, ID_Signal_Gleisbezechnung_TypeClass.class, "ID_Signal_Gleisbezechnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Gleisbezechnung_TypeClass_Value(), theGleisPackage.getGleis_Bezeichnung(), null, "value", null, 0, 1, ID_Signal_Gleisbezechnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Gleisbezechnung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Gleisbezechnung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_ohne_Proxy_TypeClassEClass, ID_Signal_ohne_Proxy_TypeClass.class, "ID_Signal_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_ohne_Proxy_TypeClass_Value(), theSignalePackage.getSignal(), null, "value", null, 0, 1, ID_Signal_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Rahmen_TypeClassEClass, ID_Signal_Rahmen_TypeClass.class, "ID_Signal_Rahmen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Rahmen_TypeClass_Value(), theSignalePackage.getSignal_Rahmen(), null, "value", null, 0, 1, ID_Signal_Rahmen_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Rahmen_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Rahmen_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Signalbegriff_TypeClassEClass, ID_Signal_Signalbegriff_TypeClass.class, "ID_Signal_Signalbegriff_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Signalbegriff_TypeClass_Value(), theSignalePackage.getSignal_Signalbegriff(), null, "value", null, 0, 1, ID_Signal_Signalbegriff_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Signalbegriff_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Signalbegriff_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_Start_TypeClassEClass, ID_Signal_Start_TypeClass.class, "ID_Signal_Start_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_Start_TypeClass_Value(), theSignalePackage.getSignal(), null, "value", null, 0, 1, ID_Signal_Start_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_Start_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_Start_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Signal_TypeClassEClass, ID_Signal_TypeClass.class, "ID_Signal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Signal_TypeClass_Value(), theSignalePackage.getSignal(), null, "value", null, 0, 1, ID_Signal_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Signal_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Signal_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Sonderanlage_TypeClassEClass, ID_Sonderanlage_TypeClass.class, "ID_Sonderanlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Sonderanlage_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getW_Kr_Gsp_Element(), null, "value", null, 0, 1, ID_Sonderanlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Sonderanlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Sonderanlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Stellelement_TypeClassEClass, ID_Stellelement_TypeClass.class, "ID_Stellelement_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Stellelement_TypeClass_Value(), theAnsteuerung_ElementPackage.getStellelement(), null, "value", null, 0, 1, ID_Stellelement_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Stellelement_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Stellelement_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Stellwerk_TypeClassEClass, ID_Stellwerk_TypeClass.class, "ID_Stellwerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Stellwerk_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Stellwerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Stellwerk_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Stellwerk_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass, ID_Strecke_Bremsweg_ohne_Proxy_TypeClass.class, "ID_Strecke_Bremsweg_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_Value(), theGeodatenPackage.getStrecke_Bremsweg(), null, "value", null, 0, 1, ID_Strecke_Bremsweg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Strecke_Bremsweg_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Strecke_Bremsweg_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Strecke_Punkt_TypeClassEClass, ID_Strecke_Punkt_TypeClass.class, "ID_Strecke_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Strecke_Punkt_TypeClass_Value(), theGeodatenPackage.getStrecke_Punkt(), null, "value", null, 0, 1, ID_Strecke_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Strecke_Punkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Strecke_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Strecke_TypeClassEClass, ID_Strecke_TypeClass.class, "ID_Strecke_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Strecke_TypeClass_Value(), theGeodatenPackage.getStrecke(), null, "value", null, 0, 1, ID_Strecke_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Strecke_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Strecke_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Technischer_Punkt_TypeClassEClass, ID_Technischer_Punkt_TypeClass.class, "ID_Technischer_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Technischer_Punkt_TypeClass_Value(), theGeodatenPackage.getTechnischer_Punkt(), null, "value", null, 0, 1, ID_Technischer_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Technischer_Punkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Technischer_Punkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_TOP_Kante_ohne_Proxy_TypeClassEClass, ID_TOP_Kante_ohne_Proxy_TypeClass.class, "ID_TOP_Kante_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_TOP_Kante_ohne_Proxy_TypeClass_Value(), theGeodatenPackage.getTOP_Kante(), null, "value", null, 0, 1, ID_TOP_Kante_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_TOP_Kante_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_TOP_Kante_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_TOP_Kante_TypeClassEClass, ID_TOP_Kante_TypeClass.class, "ID_TOP_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_TOP_Kante_TypeClass_Value(), theGeodatenPackage.getTOP_Kante(), null, "value", null, 0, 1, ID_TOP_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_TOP_Kante_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_TOP_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_TOP_Knoten_TypeClassEClass, ID_TOP_Knoten_TypeClass.class, "ID_TOP_Knoten_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_TOP_Knoten_TypeClass_Value(), theGeodatenPackage.getTOP_Knoten(), null, "value", null, 0, 1, ID_TOP_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_TOP_Knoten_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_TOP_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Trasse_Kante_TypeClassEClass, ID_Trasse_Kante_TypeClass.class, "ID_Trasse_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Trasse_Kante_TypeClass_Value(), theMedien_und_TrassenPackage.getTrasse_Kante(), null, "value", null, 0, 1, ID_Trasse_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Trasse_Kante_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Trasse_Kante_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Trasse_Knoten_TypeClassEClass, ID_Trasse_Knoten_TypeClass.class, "ID_Trasse_Knoten_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Trasse_Knoten_TypeClass_Value(), theMedien_und_TrassenPackage.getTrasse_Knoten(), null, "value", null, 0, 1, ID_Trasse_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Trasse_Knoten_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Trasse_Knoten_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Ueberhoehung_TypeClassEClass, ID_Ueberhoehung_TypeClass.class, "ID_Ueberhoehung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Ueberhoehung_TypeClass_Value(), theGeodatenPackage.getUeberhoehung(), null, "value", null, 0, 1, ID_Ueberhoehung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Ueberhoehung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Ueberhoehung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Uebertragungsweg_Nach_TypeClassEClass, ID_Uebertragungsweg_Nach_TypeClass.class, "ID_Uebertragungsweg_Nach_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Uebertragungsweg_Nach_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Uebertragungsweg_Nach_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Uebertragungsweg_Nach_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Uebertragungsweg_Nach_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Uebertragungsweg_Von_TypeClassEClass, ID_Uebertragungsweg_Von_TypeClass.class, "ID_Uebertragungsweg_Von_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Uebertragungsweg_Von_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Uebertragungsweg_Von_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Uebertragungsweg_Von_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Uebertragungsweg_Von_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Umfahrpunkt_TypeClassEClass, ID_Umfahrpunkt_TypeClass.class, "ID_Umfahrpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Umfahrpunkt_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Umfahrpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Umfahrpunkt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Umfahrpunkt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Unterbringung_ohne_Proxy_TypeClassEClass, ID_Unterbringung_ohne_Proxy_TypeClass.class, "ID_Unterbringung_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Unterbringung_ohne_Proxy_TypeClass_Value(), theAnsteuerung_ElementPackage.getUnterbringung(), null, "value", null, 0, 1, ID_Unterbringung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Unterbringung_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Unterbringung_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Unterbringung_Technik_TypeClassEClass, ID_Unterbringung_Technik_TypeClass.class, "ID_Unterbringung_Technik_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Unterbringung_Technik_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Unterbringung_Technik_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Unterbringung_Technik_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Unterbringung_Technik_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Unterbringung_TypeClassEClass, ID_Unterbringung_TypeClass.class, "ID_Unterbringung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Unterbringung_TypeClass_Value(), theAnsteuerung_ElementPackage.getUnterbringung(), null, "value", null, 0, 1, ID_Unterbringung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Unterbringung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Unterbringung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Ur_Objekt_TypeClassEClass, ID_Ur_Objekt_TypeClass.class, "ID_Ur_Objekt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Ur_Objekt_TypeClass_Value(), theBasisobjektePackage.getUr_Objekt(), null, "value", null, 0, 1, ID_Ur_Objekt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Ur_Objekt_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Ur_Objekt_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Verknuepftes_Element_TypeClassEClass, ID_Verknuepftes_Element_TypeClass.class, "ID_Verknuepftes_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Verknuepftes_Element_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Verknuepftes_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Verknuepftes_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Verknuepftes_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass, ID_W_Kr_Anlage_ohne_Proxy_TypeClass.class, "ID_W_Kr_Anlage_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_W_Kr_Anlage_ohne_Proxy_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getW_Kr_Anlage(), null, "value", null, 0, 1, ID_W_Kr_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_W_Kr_Anlage_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_W_Kr_Anlage_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_W_Kr_Anlage_TypeClassEClass, ID_W_Kr_Anlage_TypeClass.class, "ID_W_Kr_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_W_Kr_Anlage_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getW_Kr_Anlage(), null, "value", null, 0, 1, ID_W_Kr_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_W_Kr_Anlage_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_W_Kr_Anlage_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_W_Kr_Gsp_Element_TypeClassEClass, ID_W_Kr_Gsp_Element_TypeClass.class, "ID_W_Kr_Gsp_Element_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_W_Kr_Gsp_Element_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getW_Kr_Gsp_Element(), null, "value", null, 0, 1, ID_W_Kr_Gsp_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_W_Kr_Gsp_Element_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_W_Kr_Gsp_Element_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_W_Kr_Gsp_Komponente_TypeClassEClass, ID_W_Kr_Gsp_Komponente_TypeClass.class, "ID_W_Kr_Gsp_Komponente_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_W_Kr_Gsp_Komponente_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getW_Kr_Gsp_Komponente(), null, "value", null, 0, 1, ID_W_Kr_Gsp_Komponente_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_W_Kr_Gsp_Komponente_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_W_Kr_Gsp_Komponente_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Weichenlaufkette_TypeClassEClass, ID_Weichenlaufkette_TypeClass.class, "ID_Weichenlaufkette_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Weichenlaufkette_TypeClass_Value(), theWeichen_und_GleissperrenPackage.getWeichenlaufkette(), null, "value", null, 0, 1, ID_Weichenlaufkette_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Weichenlaufkette_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Weichenlaufkette_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Ziel_TypeClassEClass, ID_Ziel_TypeClass.class, "ID_Ziel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Ziel_TypeClass_Value(), theBasisobjektePackage.getBasis_Objekt(), null, "value", null, 0, 1, ID_Ziel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Ziel_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Ziel_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZL_DLP_Fstr_TypeClassEClass, ID_ZL_DLP_Fstr_TypeClass.class, "ID_ZL_DLP_Fstr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZL_DLP_Fstr_TypeClass_Value(), theZuglenkungPackage.getZL_DLP_Fstr(), null, "value", null, 0, 1, ID_ZL_DLP_Fstr_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZL_DLP_Fstr_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZL_DLP_Fstr_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZL_Fstr_TypeClassEClass, ID_ZL_Fstr_TypeClass.class, "ID_ZL_Fstr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZL_Fstr_TypeClass_Value(), theZuglenkungPackage.getZL_Fstr(), null, "value", null, 0, 1, ID_ZL_Fstr_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZL_Fstr_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZL_Fstr_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZL_Signalgruppe_TypeClassEClass, ID_ZL_Signalgruppe_TypeClass.class, "ID_ZL_Signalgruppe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZL_Signalgruppe_TypeClass_Value(), theZuglenkungPackage.getZL_Signalgruppe(), null, "value", null, 0, 1, ID_ZL_Signalgruppe_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZL_Signalgruppe_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZL_Signalgruppe_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZL_TypeClassEClass, ID_ZL_TypeClass.class, "ID_ZL_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZL_TypeClass_Value(), theZuglenkungPackage.getZL(), null, "value", null, 0, 1, ID_ZL_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZL_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZL_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZLV_Bus_ohne_Proxy_TypeClassEClass, ID_ZLV_Bus_ohne_Proxy_TypeClass.class, "ID_ZLV_Bus_ohne_Proxy_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZLV_Bus_ohne_Proxy_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZLV_Bus(), null, "value", null, 0, 1, ID_ZLV_Bus_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZLV_Bus_ohne_Proxy_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZLV_Bus_ohne_Proxy_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZLV_Bus_TypeClassEClass, ID_ZLV_Bus_TypeClass.class, "ID_ZLV_Bus_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZLV_Bus_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZLV_Bus(), null, "value", null, 0, 1, ID_ZLV_Bus_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZLV_Bus_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZLV_Bus_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass, ID_ZN_Anzeigefeld_Anstoss_TypeClass.class, "ID_ZN_Anzeigefeld_Anstoss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_Anzeigefeld_Anstoss_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN_Anzeigefeld(), null, "value", null, 0, 1, ID_ZN_Anzeigefeld_Anstoss_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_Anzeigefeld_Anstoss_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_Anzeigefeld_Anstoss_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_Anzeigefeld_TypeClassEClass, ID_ZN_Anzeigefeld_TypeClass.class, "ID_ZN_Anzeigefeld_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_Anzeigefeld_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN_Anzeigefeld(), null, "value", null, 0, 1, ID_ZN_Anzeigefeld_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_Anzeigefeld_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_Anzeigefeld_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_Fortschalt_Kriterium_TypeClassEClass, ID_ZN_Fortschalt_Kriterium_TypeClass.class, "ID_ZN_Fortschalt_Kriterium_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_Fortschalt_Kriterium_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN_Fortschalt_Kriterium(), null, "value", null, 0, 1, ID_ZN_Fortschalt_Kriterium_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_Fortschalt_Kriterium_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_Fortschalt_Kriterium_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_TypeClassEClass, ID_ZN_TypeClass.class, "ID_ZN_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN(), null, "value", null, 0, 1, ID_ZN_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_Unterstation_TypeClassEClass, ID_ZN_Unterstation_TypeClass.class, "ID_ZN_Unterstation_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_Unterstation_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN_Unterstation(), null, "value", null, 0, 1, ID_ZN_Unterstation_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_Unterstation_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_Unterstation_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_ZN_ZBS_TypeClassEClass, ID_ZN_ZBS_TypeClass.class, "ID_ZN_ZBS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_ZN_ZBS_TypeClass_Value(), theZugnummernmeldeanlagePackage.getZN_ZBS(), null, "value", null, 0, 1, ID_ZN_ZBS_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_ZN_ZBS_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_ZN_ZBS_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Zugeinwirkung_TypeClassEClass, ID_Zugeinwirkung_TypeClass.class, "ID_Zugeinwirkung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Zugeinwirkung_TypeClass_Value(), theOrtungPackage.getZugeinwirkung(), null, "value", null, 0, 1, ID_Zugeinwirkung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Zugeinwirkung_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Zugeinwirkung_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Zweites_Haltfallkriterium_TypeClassEClass, ID_Zweites_Haltfallkriterium_TypeClass.class, "ID_Zweites_Haltfallkriterium_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getID_Zweites_Haltfallkriterium_TypeClass_Value(), theOrtungPackage.getSchaltmittel_Zuordnung(), null, "value", null, 0, 1, ID_Zweites_Haltfallkriterium_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getID_Zweites_Haltfallkriterium_TypeClass_InvalidReference(), theXMLTypePackage.getBoolean(), "invalidReference", "false", 0, 1, ID_Zweites_Haltfallkriterium_TypeClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// planpro/id_reference
		createId_referenceAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (iD_Anforderer_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Anforderer_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Anforderung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Anforderung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Anhang_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Anhang_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Anhang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Anhang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_AnhangBearbeitungsvermerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_AnhangBearbeitungsvermerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Anschluss_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Anschluss_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ATO_TS_Instanz_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ATO_TS_Instanz_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ATO_TS_Instanz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ATO_TS_Instanz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Ausgabe_Fachdaten_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Aussenelementansteuerung_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Aussenelementansteuerung_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Aussenelementansteuerung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Aussenelementansteuerung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bahnsteig_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bahnsteig_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bahnsteig_Kante_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bahnsteig_Kante_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bahnsteig_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bahnsteig_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Balise_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Balise_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Balise_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Balise",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Basis_Objekt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Basis_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Anzeige_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Anzeige_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Bezirk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Bezirk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Einrichtung_Oertlich_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Einrichtung_Oertlich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Oberflaeche_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Oberflaeche",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Standort_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Standort",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bedien_Zentrale_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bedien_Zentrale",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Befestigung_Bauwerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Befestigung_Bauwerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Beginn_Bereich_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Beginn_Bereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Bezugspunkt_Positionierung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bezugspunkt_Positionierung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Binaerdaten_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Binaerdaten_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Block_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Block_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Block_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Block_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Block_Strecke_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Block_Strecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Anlage_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Anlage_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Bedien_Anzeige_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Bedien_Anzeige_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Einschaltung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Einschaltung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Gleisbezogener_Gefahrraum_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Gleisbezogener_Gefahrraum",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_Schnittstelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_Schnittstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_BUE_WS_Fstr_Zuordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_BUE_WS_Fstr_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Datenpunkt_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Datenpunkt_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Datenpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Datenpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_DP_Bezug_Funktional_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_DP_Bezug_Funktional",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Einschaltpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Einschaltpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Element_Grenze_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Element_Grenze",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Element_Unterbringung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Element_Unterbringung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Energie_Eingang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Energie_Eingang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Energie_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Energie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ESTW_Zentraleinheit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ESTW_Zentraleinheit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ETCS_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ETCS_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ETCS_Knoten_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ETCS_Knoten_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ETCS_Knoten_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ETCS_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_EV_Modul_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_EV_Modul",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fachtelegramm_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fachtelegramm_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fachtelegramm_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fachtelegramm",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fla_Schutz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fla_Schutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FMA_Anlage_Rangier_Frei_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FMA_Anlage_Rangier_Frei",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FMA_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FMA_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FMA_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FMA_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FMA_Komponente_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FMA_Komponente",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fortschaltung_Start_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fortschaltung_Start",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_Aneinander_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_Aneinander",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_Ausschluss_Besonders_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_Ausschluss_Besonders",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_DWeg_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_DWeg_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_DWeg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_DWeg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_Fahrweg_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_Fahrweg_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_Fahrweg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_Fahrweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Fstr_Zug_Rangier_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Fstr_Zug_Rangier",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FT_Anschaltbedingung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FT_Anschaltbedingung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_FT_Fahrweg_Teil_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_FT_Fahrweg_Teil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GEO_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GEO_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GEO_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GEO_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GEO_Knoten_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GEO_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GEO_Punkt_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GEO_Punkt_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GEO_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GEO_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_GFR_Anlage_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_GFR_Anlage_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Gleis_Abschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Gleis_Abschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Gleis_Bezeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Gleis_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Grenzzeichen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Grenzzeichen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Handschalt_Wirkfunktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Handschalt_Wirkfunktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Hoehenpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Hoehenpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Information_Eingang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Information_Eingang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Information_Primaer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Information_Primaer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Komponente_Programmiert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Komponente_Programmiert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Lageplan_Blattschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Lageplan_Blattschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Lageplan_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Lageplan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Lageplan_Zustand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Lageplan_Zustand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_LEU_Anlage_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_LEU_Anlage_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_LEU_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_LEU_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_LEU_Bezug_Funktional_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_LEU_Bezug_Funktional",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_LEU_Schaltkasten_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_LEU_Schaltkasten_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_LO_Einbau_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_LO_Einbau",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Markante_Stelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Markante_Stelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Markanter_Punkt_Gleis_Abschluss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Markanter_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Markanter_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_NB_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_NB_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_NB_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_NB",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_NB_Zone_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_NB_Zone",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Oertlichkeit_Ausgabe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Oertlichkeit_Ausgabe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Oertlichkeit_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Oertlichkeit_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Oertlichkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Oertlichkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_PlanPro_Schnittstelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_PlanPro_Schnittstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Planung_Einzel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Planung_Einzel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Planungsgrundlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Planungsgrundlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_PZB_Element_Bezugspunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_PZB_Element_Bezugspunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_PZB_Element_Mitnutzung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_PZB_Element_Mitnutzung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_PZB_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_PZB_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_PZB_Element_Zuordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_PZB_Element_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Quellelement_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Quellelement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_RBC_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_RBC",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Regelzeichnung_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Regelzeichnung_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Regelzeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Regelzeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Schalter_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Schalter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Schaltmittel_Zuordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Schaltmittel_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Schlosskombination_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Schlosskombination",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Schluessel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Schluessel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Schluesselsperre_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Schluesselsperre",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Befestigung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Befestigung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Fank_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Fank",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Gleisbezechnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Gleisbezechnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Rahmen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Rahmen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Signalbegriff_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Signalbegriff",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_Start_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal_Start",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Signal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Signal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Sonderanlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Sonderanlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Stellelement_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Stellelement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Stellwerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Stellwerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Strecke_Bremsweg_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Strecke_Bremsweg_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Strecke_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Strecke_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Strecke_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Strecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Technischer_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Technischer_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_TOP_Kante_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_TOP_Kante_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_TOP_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_TOP_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_TOP_Knoten_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_TOP_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Trasse_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Trasse_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Trasse_Knoten_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Trasse_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Ueberhoehung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Ueberhoehung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Uebertragungsweg_Nach_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Uebertragungsweg_Nach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Uebertragungsweg_Von_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Uebertragungsweg_Von",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Umfahrpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Umfahrpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Unterbringung_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Unterbringung_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Unterbringung_Technik_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Unterbringung_Technik",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Unterbringung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Unterbringung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Ur_Objekt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Ur_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Verknuepftes_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Verknuepftes_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_W_Kr_Anlage_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_W_Kr_Anlage_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_W_Kr_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_W_Kr_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_W_Kr_Gsp_Element_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_W_Kr_Gsp_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_W_Kr_Gsp_Komponente_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_W_Kr_Gsp_Komponente",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Weichenlaufkette_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Weichenlaufkette",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Ziel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Ziel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZL_DLP_Fstr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZL_DLP_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZL_Fstr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZL_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZL_Signalgruppe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZL_Signalgruppe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZL_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZL",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZLV_Bus_ohne_Proxy_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZLV_Bus_ohne_Proxy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZLV_Bus_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZLV_Bus",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_Anzeigefeld_Anstoss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN_Anzeigefeld_Anstoss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_Anzeigefeld_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_Fortschalt_Kriterium_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN_Fortschalt_Kriterium",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_Unterstation_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN_Unterstation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_ZN_ZBS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_ZN_ZBS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Zugeinwirkung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Zugeinwirkung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (iD_Zweites_Haltfallkriterium_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Zweites_Haltfallkriterium",
			   "kind", "elementOnly"
		   });
	}

	/**
	 * Initializes the annotations for <b>planpro/id_reference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createId_referenceAnnotations() {
		String source = "planpro/id_reference";
		addAnnotation
		  (iD_Anforderer_Element_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element"),
			 URI.createURI(NahbedienungPackage.eNS_URI).appendFragment("//NB_Zone_Grenze")
		   });
		addAnnotation
		  (iD_Anforderung_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BlockPackage.eNS_URI).appendFragment("//Block_Element"),
			 URI.createURI(FahrstrassePackage.eNS_URI).appendFragment("//Fstr_Fahrweg"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Einschaltung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Ausschaltung")
		   });
		addAnnotation
		  (iD_AnhangBearbeitungsvermerk_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BasisobjektePackage.eNS_URI).appendFragment("//Anhang"),
			 URI.createURI(BasisobjektePackage.eNS_URI).appendFragment("//Bearbeitungsvermerk")
		   });
		addAnnotation
		  (iD_Anschluss_Element_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BedienungPackage.eNS_URI).appendFragment("//Bedien_Standort"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//Datenpunkt"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//FMA_Komponente"),
			 URI.createURI(Medien_und_TrassenPackage.eNS_URI).appendFragment("//Kabel_Verteilpunkt"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//LEU_Anlage"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Stellelement"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Technik_Standort")
		   });
		addAnnotation
		  (iD_Befestigung_Bauwerk_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(GeodatenPackage.eNS_URI).appendFragment("//Technischer_Punkt"),
			 URI.createURI(GeodatenPackage.eNS_URI).appendFragment("//Technischer_Bereich")
		   });
		addAnnotation
		  (iD_Beginn_Bereich_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BahnsteigPackage.eNS_URI).appendFragment("//Bahnsteig_Kante"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Gleisbezogener_Gefahrraum"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//ZUB_Streckeneigenschaft")
		   });
		addAnnotation
		  (iD_Bezugspunkt_Positionierung_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(GeodatenPackage.eNS_URI).appendFragment("//Technischer_Punkt")
		   });
		addAnnotation
		  (iD_DP_Bezug_Funktional_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Einschaltung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Kante"),
			 URI.createURI(FahrstrassePackage.eNS_URI).appendFragment("//Markanter_Punkt"),
			 URI.createURI(PZBPackage.eNS_URI).appendFragment("//PZB_Element"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//ZUB_Streckeneigenschaft")
		   });
		addAnnotation
		  (iD_Element_Grenze_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//Datenpunkt")
		   });
		addAnnotation
		  (iD_Element_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element"),
			 URI.createURI(GleisPackage.eNS_URI).appendFragment("//Gleis_Abschnitt")
		   });
		addAnnotation
		  (iD_Element_Unterbringung_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//LEU_Schaltkasten"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Unterbringung")
		   });
		addAnnotation
		  (iD_Energie_Eingang_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//EV_Modul"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(PZBPackage.eNS_URI).appendFragment("//PZB_Element")
		   });
		addAnnotation
		  (iD_Energie_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//EV_Modul")
		   });
		addAnnotation
		  (iD_Fortschaltung_Start_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//FMA_Anlage"),
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal")
		   });
		addAnnotation
		  (iD_GEO_Art_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(GeodatenPackage.eNS_URI).appendFragment("//TOP_Kante"),
			 URI.createURI(GeodatenPackage.eNS_URI).appendFragment("//Strecke")
		   });
		addAnnotation
		  (iD_Handschalt_Wirkfunktion_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Einschaltung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Ausschaltung")
		   });
		addAnnotation
		  (iD_Information_Eingang_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//LEU_Anlage"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//LEU_Modul"),
			 URI.createURI(PZBPackage.eNS_URI).appendFragment("//PZB_Element"),
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Anlage")
		   });
		addAnnotation
		  (iD_Information_Primaer_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit")
		   });
		addAnnotation
		  (iD_Komponente_Programmiert_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//Balise"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//LEU_Modul")
		   });
		addAnnotation
		  (iD_LEU_Bezug_Funktional_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element")
		   });
		addAnnotation
		  (iD_Markante_Stelle_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//Datenpunkt"),
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Komponente"),
			 URI.createURI(FahrstrassePackage.eNS_URI).appendFragment("//Sonstiger_Punkt"),
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//FMA_Komponente")
		   });
		addAnnotation
		  (iD_Markanter_Punkt_Gleis_Abschluss_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(FahrstrassePackage.eNS_URI).appendFragment("//Markanter_Punkt"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//Gleis_Abschluss")
		   });
		addAnnotation
		  (iD_NB_Element_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element"),
			 URI.createURI(SchluesselabhaengigkeitenPackage.eNS_URI).appendFragment("//Schluesselsperre")
		   });
		addAnnotation
		  (iD_PZB_Element_Bezugspunkt_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element")
		   });
		addAnnotation
		  (iD_Quellelement_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BahnuebergangPackage.eNS_URI).appendFragment("//BUE_Anlage"),
			 URI.createURI(Balisentechnik_ETCSPackage.eNS_URI).appendFragment("//EV_Modul"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(PZBPackage.eNS_URI).appendFragment("//PZB_Element")
		   });
		addAnnotation
		  (iD_Schalter_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//FMA_Anlage"),
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//FMA_Komponente"),
			 URI.createURI(OrtungPackage.eNS_URI).appendFragment("//Zugeinwirkung")
		   });
		addAnnotation
		  (iD_Stellwerk_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung")
		   });
		addAnnotation
		  (iD_Uebertragungsweg_Nach_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BedienungPackage.eNS_URI).appendFragment("//Bedien_Bezirk"),
			 URI.createURI(BedienungPackage.eNS_URI).appendFragment("//Bedien_Zentrale"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Stellelement"),
			 URI.createURI(ZugnummernmeldeanlagePackage.eNS_URI).appendFragment("//ZN_ZBS")
		   });
		addAnnotation
		  (iD_Uebertragungsweg_Von_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Aussenelementansteuerung"),
			 URI.createURI(BedienungPackage.eNS_URI).appendFragment("//Bedien_Bezirk"),
			 URI.createURI(BedienungPackage.eNS_URI).appendFragment("//Bedien_Zentrale"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//ESTW_Zentraleinheit"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Stellelement"),
			 URI.createURI(ZugnummernmeldeanlagePackage.eNS_URI).appendFragment("//ZN_ZBS")
		   });
		addAnnotation
		  (iD_Umfahrpunkt_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element"),
			 URI.createURI(GleisPackage.eNS_URI).appendFragment("//Gleis_Abschnitt")
		   });
		addAnnotation
		  (iD_Unterbringung_Technik_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Technik_Standort"),
			 URI.createURI(Ansteuerung_ElementPackage.eNS_URI).appendFragment("//Unterbringung")
		   });
		addAnnotation
		  (iD_Verknuepftes_Element_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(Weichen_und_GleissperrenPackage.eNS_URI).appendFragment("//W_Kr_Gsp_Element")
		   });
		addAnnotation
		  (iD_Ziel_TypeClassEClass,
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SignalePackage.eNS_URI).appendFragment("//Signal"),
			 URI.createURI(FahrstrassePackage.eNS_URI).appendFragment("//Markanter_Punkt")
		   });
	}

} //VerweisePackageImpl
