/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Verweise.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass;

import org.eclipse.set.model.planpro.Verweise.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Verweise.VerweisePackage
 * @generated
 */
public class VerweiseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerweisePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerweiseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VerweisePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerweiseSwitch<Adapter> modelSwitch =
		new VerweiseSwitch<Adapter>() {
			@Override
			public Adapter caseID_Anforderer_Element_TypeClass(ID_Anforderer_Element_TypeClass object) {
				return createID_Anforderer_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Anforderung_TypeClass(ID_Anforderung_TypeClass object) {
				return createID_Anforderung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Anhang_ohne_Proxy_TypeClass(ID_Anhang_ohne_Proxy_TypeClass object) {
				return createID_Anhang_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Anhang_TypeClass(ID_Anhang_TypeClass object) {
				return createID_Anhang_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_AnhangBearbeitungsvermerk_TypeClass(ID_AnhangBearbeitungsvermerk_TypeClass object) {
				return createID_AnhangBearbeitungsvermerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Anschluss_Element_TypeClass(ID_Anschluss_Element_TypeClass object) {
				return createID_Anschluss_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ATO_TS_Instanz_ohne_Proxy_TypeClass(ID_ATO_TS_Instanz_ohne_Proxy_TypeClass object) {
				return createID_ATO_TS_Instanz_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ATO_TS_Instanz_TypeClass(ID_ATO_TS_Instanz_TypeClass object) {
				return createID_ATO_TS_Instanz_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass(ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass object) {
				return createID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Aussenelementansteuerung_ohne_Proxy_TypeClass(ID_Aussenelementansteuerung_ohne_Proxy_TypeClass object) {
				return createID_Aussenelementansteuerung_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Aussenelementansteuerung_TypeClass(ID_Aussenelementansteuerung_TypeClass object) {
				return createID_Aussenelementansteuerung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bahnsteig_Anlage_TypeClass(ID_Bahnsteig_Anlage_TypeClass object) {
				return createID_Bahnsteig_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bahnsteig_Kante_ohne_Proxy_TypeClass(ID_Bahnsteig_Kante_ohne_Proxy_TypeClass object) {
				return createID_Bahnsteig_Kante_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bahnsteig_Kante_TypeClass(ID_Bahnsteig_Kante_TypeClass object) {
				return createID_Bahnsteig_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Balise_ohne_Proxy_TypeClass(ID_Balise_ohne_Proxy_TypeClass object) {
				return createID_Balise_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Balise_TypeClass(ID_Balise_TypeClass object) {
				return createID_Balise_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Basis_Objekt_TypeClass(ID_Basis_Objekt_TypeClass object) {
				return createID_Basis_Objekt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Anzeige_Element_TypeClass(ID_Bedien_Anzeige_Element_TypeClass object) {
				return createID_Bedien_Anzeige_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Bezirk_TypeClass(ID_Bedien_Bezirk_TypeClass object) {
				return createID_Bedien_Bezirk_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Einrichtung_Oertlich_TypeClass(ID_Bedien_Einrichtung_Oertlich_TypeClass object) {
				return createID_Bedien_Einrichtung_Oertlich_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Oberflaeche_TypeClass(ID_Bedien_Oberflaeche_TypeClass object) {
				return createID_Bedien_Oberflaeche_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Standort_TypeClass(ID_Bedien_Standort_TypeClass object) {
				return createID_Bedien_Standort_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bedien_Zentrale_TypeClass(ID_Bedien_Zentrale_TypeClass object) {
				return createID_Bedien_Zentrale_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Befestigung_Bauwerk_TypeClass(ID_Befestigung_Bauwerk_TypeClass object) {
				return createID_Befestigung_Bauwerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Beginn_Bereich_TypeClass(ID_Beginn_Bereich_TypeClass object) {
				return createID_Beginn_Bereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bezugspunkt_Positionierung_TypeClass(ID_Bezugspunkt_Positionierung_TypeClass object) {
				return createID_Bezugspunkt_Positionierung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Bezugspunkt_TypeClass(ID_Bezugspunkt_TypeClass object) {
				return createID_Bezugspunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Binaerdaten_ohne_Proxy_TypeClass(ID_Binaerdaten_ohne_Proxy_TypeClass object) {
				return createID_Binaerdaten_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Block_Anlage_TypeClass(ID_Block_Anlage_TypeClass object) {
				return createID_Block_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Block_Element_TypeClass(ID_Block_Element_TypeClass object) {
				return createID_Block_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Block_Strecke_TypeClass(ID_Block_Strecke_TypeClass object) {
				return createID_Block_Strecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Anlage_ohne_Proxy_TypeClass(ID_BUE_Anlage_ohne_Proxy_TypeClass object) {
				return createID_BUE_Anlage_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Anlage_TypeClass(ID_BUE_Anlage_TypeClass object) {
				return createID_BUE_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Bedien_Anzeige_Element_TypeClass(ID_BUE_Bedien_Anzeige_Element_TypeClass object) {
				return createID_BUE_Bedien_Anzeige_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Einschaltung_TypeClass(ID_BUE_Einschaltung_TypeClass object) {
				return createID_BUE_Einschaltung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Gleisbezogener_Gefahrraum_TypeClass(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass object) {
				return createID_BUE_Gleisbezogener_Gefahrraum_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_Schnittstelle_TypeClass(ID_BUE_Schnittstelle_TypeClass object) {
				return createID_BUE_Schnittstelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_BUE_WS_Fstr_Zuordnung_TypeClass(ID_BUE_WS_Fstr_Zuordnung_TypeClass object) {
				return createID_BUE_WS_Fstr_Zuordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Datenpunkt_ohne_Proxy_TypeClass(ID_Datenpunkt_ohne_Proxy_TypeClass object) {
				return createID_Datenpunkt_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Datenpunkt_TypeClass(ID_Datenpunkt_TypeClass object) {
				return createID_Datenpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_DP_Bezug_Funktional_TypeClass(ID_DP_Bezug_Funktional_TypeClass object) {
				return createID_DP_Bezug_Funktional_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Einschaltpunkt_TypeClass(ID_Einschaltpunkt_TypeClass object) {
				return createID_Einschaltpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Element_Grenze_TypeClass(ID_Element_Grenze_TypeClass object) {
				return createID_Element_Grenze_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Element_TypeClass(ID_Element_TypeClass object) {
				return createID_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Element_Unterbringung_TypeClass(ID_Element_Unterbringung_TypeClass object) {
				return createID_Element_Unterbringung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Energie_Eingang_TypeClass(ID_Energie_Eingang_TypeClass object) {
				return createID_Energie_Eingang_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Energie_TypeClass(ID_Energie_TypeClass object) {
				return createID_Energie_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ESTW_Zentraleinheit_TypeClass(ID_ESTW_Zentraleinheit_TypeClass object) {
				return createID_ESTW_Zentraleinheit_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ETCS_Kante_TypeClass(ID_ETCS_Kante_TypeClass object) {
				return createID_ETCS_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ETCS_Knoten_ohne_Proxy_TypeClass(ID_ETCS_Knoten_ohne_Proxy_TypeClass object) {
				return createID_ETCS_Knoten_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ETCS_Knoten_TypeClass(ID_ETCS_Knoten_TypeClass object) {
				return createID_ETCS_Knoten_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_EV_Modul_TypeClass(ID_EV_Modul_TypeClass object) {
				return createID_EV_Modul_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fachtelegramm_ohne_Proxy_TypeClass(ID_Fachtelegramm_ohne_Proxy_TypeClass object) {
				return createID_Fachtelegramm_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fachtelegramm_TypeClass(ID_Fachtelegramm_TypeClass object) {
				return createID_Fachtelegramm_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fla_Schutz_TypeClass(ID_Fla_Schutz_TypeClass object) {
				return createID_Fla_Schutz_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FMA_Anlage_Rangier_Frei_TypeClass(ID_FMA_Anlage_Rangier_Frei_TypeClass object) {
				return createID_FMA_Anlage_Rangier_Frei_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FMA_Anlage_TypeClass(ID_FMA_Anlage_TypeClass object) {
				return createID_FMA_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FMA_Element_TypeClass(ID_FMA_Element_TypeClass object) {
				return createID_FMA_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FMA_Komponente_TypeClass(ID_FMA_Komponente_TypeClass object) {
				return createID_FMA_Komponente_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fortschaltung_Start_TypeClass(ID_Fortschaltung_Start_TypeClass object) {
				return createID_Fortschaltung_Start_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_Aneinander_TypeClass(ID_Fstr_Aneinander_TypeClass object) {
				return createID_Fstr_Aneinander_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_Ausschluss_Besonders_TypeClass(ID_Fstr_Ausschluss_Besonders_TypeClass object) {
				return createID_Fstr_Ausschluss_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_DWeg_ohne_Proxy_TypeClass(ID_Fstr_DWeg_ohne_Proxy_TypeClass object) {
				return createID_Fstr_DWeg_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_DWeg_TypeClass(ID_Fstr_DWeg_TypeClass object) {
				return createID_Fstr_DWeg_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_Fahrweg_ohne_Proxy_TypeClass(ID_Fstr_Fahrweg_ohne_Proxy_TypeClass object) {
				return createID_Fstr_Fahrweg_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_Fahrweg_TypeClass(ID_Fstr_Fahrweg_TypeClass object) {
				return createID_Fstr_Fahrweg_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Fstr_Zug_Rangier_TypeClass(ID_Fstr_Zug_Rangier_TypeClass object) {
				return createID_Fstr_Zug_Rangier_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FT_Anschaltbedingung_TypeClass(ID_FT_Anschaltbedingung_TypeClass object) {
				return createID_FT_Anschaltbedingung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_FT_Fahrweg_Teil_TypeClass(ID_FT_Fahrweg_Teil_TypeClass object) {
				return createID_FT_Fahrweg_Teil_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GEO_Art_TypeClass(ID_GEO_Art_TypeClass object) {
				return createID_GEO_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GEO_Kante_TypeClass(ID_GEO_Kante_TypeClass object) {
				return createID_GEO_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GEO_Knoten_TypeClass(ID_GEO_Knoten_TypeClass object) {
				return createID_GEO_Knoten_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GEO_Punkt_ohne_Proxy_TypeClass(ID_GEO_Punkt_ohne_Proxy_TypeClass object) {
				return createID_GEO_Punkt_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GEO_Punkt_TypeClass(ID_GEO_Punkt_TypeClass object) {
				return createID_GEO_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_GFR_Anlage_ohne_Proxy_TypeClass(ID_GFR_Anlage_ohne_Proxy_TypeClass object) {
				return createID_GFR_Anlage_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Gleis_Abschnitt_TypeClass(ID_Gleis_Abschnitt_TypeClass object) {
				return createID_Gleis_Abschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Gleis_Bezeichnung_TypeClass(ID_Gleis_Bezeichnung_TypeClass object) {
				return createID_Gleis_Bezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Grenzzeichen_TypeClass(ID_Grenzzeichen_TypeClass object) {
				return createID_Grenzzeichen_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Handschalt_Wirkfunktion_TypeClass(ID_Handschalt_Wirkfunktion_TypeClass object) {
				return createID_Handschalt_Wirkfunktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Hoehenpunkt_TypeClass(ID_Hoehenpunkt_TypeClass object) {
				return createID_Hoehenpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Information_Eingang_TypeClass(ID_Information_Eingang_TypeClass object) {
				return createID_Information_Eingang_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Information_Primaer_TypeClass(ID_Information_Primaer_TypeClass object) {
				return createID_Information_Primaer_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Komponente_Programmiert_TypeClass(ID_Komponente_Programmiert_TypeClass object) {
				return createID_Komponente_Programmiert_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Lageplan_Blattschnitt_TypeClass(ID_Lageplan_Blattschnitt_TypeClass object) {
				return createID_Lageplan_Blattschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Lageplan_TypeClass(ID_Lageplan_TypeClass object) {
				return createID_Lageplan_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Lageplan_Zustand_TypeClass(ID_Lageplan_Zustand_TypeClass object) {
				return createID_Lageplan_Zustand_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_LEU_Anlage_ohne_Proxy_TypeClass(ID_LEU_Anlage_ohne_Proxy_TypeClass object) {
				return createID_LEU_Anlage_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_LEU_Anlage_TypeClass(ID_LEU_Anlage_TypeClass object) {
				return createID_LEU_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_LEU_Bezug_Funktional_TypeClass(ID_LEU_Bezug_Funktional_TypeClass object) {
				return createID_LEU_Bezug_Funktional_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_LEU_Schaltkasten_ohne_Proxy_TypeClass(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass object) {
				return createID_LEU_Schaltkasten_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_LO_Einbau_TypeClass(ID_LO_Einbau_TypeClass object) {
				return createID_LO_Einbau_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Markante_Stelle_TypeClass(ID_Markante_Stelle_TypeClass object) {
				return createID_Markante_Stelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Markanter_Punkt_Gleis_Abschluss_TypeClass(ID_Markanter_Punkt_Gleis_Abschluss_TypeClass object) {
				return createID_Markanter_Punkt_Gleis_Abschluss_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Markanter_Punkt_TypeClass(ID_Markanter_Punkt_TypeClass object) {
				return createID_Markanter_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_NB_Element_TypeClass(ID_NB_Element_TypeClass object) {
				return createID_NB_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_NB_TypeClass(ID_NB_TypeClass object) {
				return createID_NB_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_NB_Zone_TypeClass(ID_NB_Zone_TypeClass object) {
				return createID_NB_Zone_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Oertlichkeit_Ausgabe_TypeClass(ID_Oertlichkeit_Ausgabe_TypeClass object) {
				return createID_Oertlichkeit_Ausgabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Oertlichkeit_Proxy_TypeClass(ID_Oertlichkeit_Proxy_TypeClass object) {
				return createID_Oertlichkeit_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Oertlichkeit_TypeClass(ID_Oertlichkeit_TypeClass object) {
				return createID_Oertlichkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_PlanPro_Schnittstelle_TypeClass(ID_PlanPro_Schnittstelle_TypeClass object) {
				return createID_PlanPro_Schnittstelle_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Planung_Einzel_TypeClass(ID_Planung_Einzel_TypeClass object) {
				return createID_Planung_Einzel_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Planungsgrundlage_TypeClass(ID_Planungsgrundlage_TypeClass object) {
				return createID_Planungsgrundlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_PZB_Element_Bezugspunkt_TypeClass(ID_PZB_Element_Bezugspunkt_TypeClass object) {
				return createID_PZB_Element_Bezugspunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_PZB_Element_Mitnutzung_TypeClass(ID_PZB_Element_Mitnutzung_TypeClass object) {
				return createID_PZB_Element_Mitnutzung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_PZB_Element_TypeClass(ID_PZB_Element_TypeClass object) {
				return createID_PZB_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_PZB_Element_Zuordnung_TypeClass(ID_PZB_Element_Zuordnung_TypeClass object) {
				return createID_PZB_Element_Zuordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Quellelement_TypeClass(ID_Quellelement_TypeClass object) {
				return createID_Quellelement_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_RBC_TypeClass(ID_RBC_TypeClass object) {
				return createID_RBC_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Regelzeichnung_ohne_Proxy_TypeClass(ID_Regelzeichnung_ohne_Proxy_TypeClass object) {
				return createID_Regelzeichnung_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Regelzeichnung_TypeClass(ID_Regelzeichnung_TypeClass object) {
				return createID_Regelzeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Schalter_TypeClass(ID_Schalter_TypeClass object) {
				return createID_Schalter_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Schaltmittel_Zuordnung_TypeClass(ID_Schaltmittel_Zuordnung_TypeClass object) {
				return createID_Schaltmittel_Zuordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Schlosskombination_TypeClass(ID_Schlosskombination_TypeClass object) {
				return createID_Schlosskombination_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Schluessel_TypeClass(ID_Schluessel_TypeClass object) {
				return createID_Schluessel_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Schluesselsperre_TypeClass(ID_Schluesselsperre_TypeClass object) {
				return createID_Schluesselsperre_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Befestigung_TypeClass(ID_Signal_Befestigung_TypeClass object) {
				return createID_Signal_Befestigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Fank_TypeClass(ID_Signal_Fank_TypeClass object) {
				return createID_Signal_Fank_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Gleisbezechnung_TypeClass(ID_Signal_Gleisbezechnung_TypeClass object) {
				return createID_Signal_Gleisbezechnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_ohne_Proxy_TypeClass(ID_Signal_ohne_Proxy_TypeClass object) {
				return createID_Signal_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Rahmen_TypeClass(ID_Signal_Rahmen_TypeClass object) {
				return createID_Signal_Rahmen_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Signalbegriff_TypeClass(ID_Signal_Signalbegriff_TypeClass object) {
				return createID_Signal_Signalbegriff_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_Start_TypeClass(ID_Signal_Start_TypeClass object) {
				return createID_Signal_Start_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Signal_TypeClass(ID_Signal_TypeClass object) {
				return createID_Signal_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Sonderanlage_TypeClass(ID_Sonderanlage_TypeClass object) {
				return createID_Sonderanlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Stellelement_TypeClass(ID_Stellelement_TypeClass object) {
				return createID_Stellelement_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Stellwerk_TypeClass(ID_Stellwerk_TypeClass object) {
				return createID_Stellwerk_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Strecke_Bremsweg_ohne_Proxy_TypeClass(ID_Strecke_Bremsweg_ohne_Proxy_TypeClass object) {
				return createID_Strecke_Bremsweg_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Strecke_Punkt_TypeClass(ID_Strecke_Punkt_TypeClass object) {
				return createID_Strecke_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Strecke_TypeClass(ID_Strecke_TypeClass object) {
				return createID_Strecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Technischer_Punkt_TypeClass(ID_Technischer_Punkt_TypeClass object) {
				return createID_Technischer_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_TOP_Kante_ohne_Proxy_TypeClass(ID_TOP_Kante_ohne_Proxy_TypeClass object) {
				return createID_TOP_Kante_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_TOP_Kante_TypeClass(ID_TOP_Kante_TypeClass object) {
				return createID_TOP_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_TOP_Knoten_TypeClass(ID_TOP_Knoten_TypeClass object) {
				return createID_TOP_Knoten_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Trasse_Kante_TypeClass(ID_Trasse_Kante_TypeClass object) {
				return createID_Trasse_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Trasse_Knoten_TypeClass(ID_Trasse_Knoten_TypeClass object) {
				return createID_Trasse_Knoten_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Ueberhoehung_TypeClass(ID_Ueberhoehung_TypeClass object) {
				return createID_Ueberhoehung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Uebertragungsweg_Nach_TypeClass(ID_Uebertragungsweg_Nach_TypeClass object) {
				return createID_Uebertragungsweg_Nach_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Uebertragungsweg_Von_TypeClass(ID_Uebertragungsweg_Von_TypeClass object) {
				return createID_Uebertragungsweg_Von_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Umfahrpunkt_TypeClass(ID_Umfahrpunkt_TypeClass object) {
				return createID_Umfahrpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Unterbringung_ohne_Proxy_TypeClass(ID_Unterbringung_ohne_Proxy_TypeClass object) {
				return createID_Unterbringung_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Unterbringung_Technik_TypeClass(ID_Unterbringung_Technik_TypeClass object) {
				return createID_Unterbringung_Technik_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Unterbringung_TypeClass(ID_Unterbringung_TypeClass object) {
				return createID_Unterbringung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Ur_Objekt_TypeClass(ID_Ur_Objekt_TypeClass object) {
				return createID_Ur_Objekt_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Verknuepftes_Element_TypeClass(ID_Verknuepftes_Element_TypeClass object) {
				return createID_Verknuepftes_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_W_Kr_Anlage_ohne_Proxy_TypeClass(ID_W_Kr_Anlage_ohne_Proxy_TypeClass object) {
				return createID_W_Kr_Anlage_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_W_Kr_Anlage_TypeClass(ID_W_Kr_Anlage_TypeClass object) {
				return createID_W_Kr_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_W_Kr_Gsp_Element_TypeClass(ID_W_Kr_Gsp_Element_TypeClass object) {
				return createID_W_Kr_Gsp_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_W_Kr_Gsp_Komponente_TypeClass(ID_W_Kr_Gsp_Komponente_TypeClass object) {
				return createID_W_Kr_Gsp_Komponente_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Weichenlaufkette_TypeClass(ID_Weichenlaufkette_TypeClass object) {
				return createID_Weichenlaufkette_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Ziel_TypeClass(ID_Ziel_TypeClass object) {
				return createID_Ziel_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZL_DLP_Fstr_TypeClass(ID_ZL_DLP_Fstr_TypeClass object) {
				return createID_ZL_DLP_Fstr_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZL_Fstr_TypeClass(ID_ZL_Fstr_TypeClass object) {
				return createID_ZL_Fstr_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZL_Signalgruppe_TypeClass(ID_ZL_Signalgruppe_TypeClass object) {
				return createID_ZL_Signalgruppe_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZL_TypeClass(ID_ZL_TypeClass object) {
				return createID_ZL_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZLV_Bus_ohne_Proxy_TypeClass(ID_ZLV_Bus_ohne_Proxy_TypeClass object) {
				return createID_ZLV_Bus_ohne_Proxy_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZLV_Bus_TypeClass(ID_ZLV_Bus_TypeClass object) {
				return createID_ZLV_Bus_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_Anzeigefeld_Anstoss_TypeClass(ID_ZN_Anzeigefeld_Anstoss_TypeClass object) {
				return createID_ZN_Anzeigefeld_Anstoss_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_Anzeigefeld_TypeClass(ID_ZN_Anzeigefeld_TypeClass object) {
				return createID_ZN_Anzeigefeld_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_Fortschalt_Kriterium_TypeClass(ID_ZN_Fortschalt_Kriterium_TypeClass object) {
				return createID_ZN_Fortschalt_Kriterium_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_TypeClass(ID_ZN_TypeClass object) {
				return createID_ZN_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_Unterstation_TypeClass(ID_ZN_Unterstation_TypeClass object) {
				return createID_ZN_Unterstation_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_ZN_ZBS_TypeClass(ID_ZN_ZBS_TypeClass object) {
				return createID_ZN_ZBS_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Zugeinwirkung_TypeClass(ID_Zugeinwirkung_TypeClass object) {
				return createID_Zugeinwirkung_TypeClassAdapter();
			}
			@Override
			public Adapter caseID_Zweites_Haltfallkriterium_TypeClass(ID_Zweites_Haltfallkriterium_TypeClass object) {
				return createID_Zweites_Haltfallkriterium_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZeiger_TypeClass(Zeiger_TypeClass object) {
				return createZeiger_TypeClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass <em>ID Anforderer Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderer_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Anforderer_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass <em>ID Anforderung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anforderung_TypeClass
	 * @generated
	 */
	public Adapter createID_Anforderung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass <em>ID Anhang ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Anhang_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass <em>ID Anhang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass
	 * @generated
	 */
	public Adapter createID_Anhang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass <em>ID Anhang Bearbeitungsvermerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_AnhangBearbeitungsvermerk_TypeClass
	 * @generated
	 */
	public Adapter createID_AnhangBearbeitungsvermerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass <em>ID Anschluss Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Anschluss_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Anschluss_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass <em>ID ATO TS Instanz ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_ATO_TS_Instanz_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass <em>ID ATO TS Instanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ATO_TS_Instanz_TypeClass
	 * @generated
	 */
	public Adapter createID_ATO_TS_Instanz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass <em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Ausgabe_Fachdaten_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass <em>ID Aussenelementansteuerung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Aussenelementansteuerung_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass <em>ID Aussenelementansteuerung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass
	 * @generated
	 */
	public Adapter createID_Aussenelementansteuerung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass <em>ID Bahnsteig Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_Bahnsteig_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass <em>ID Bahnsteig Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Bahnsteig_Kante_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass <em>ID Bahnsteig Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_TypeClass
	 * @generated
	 */
	public Adapter createID_Bahnsteig_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass <em>ID Balise ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Balise_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass <em>ID Balise Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Balise_TypeClass
	 * @generated
	 */
	public Adapter createID_Balise_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass <em>ID Basis Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Basis_Objekt_TypeClass
	 * @generated
	 */
	public Adapter createID_Basis_Objekt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass <em>ID Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Anzeige_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass <em>ID Bedien Bezirk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Bezirk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass <em>ID Bedien Einrichtung Oertlich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Einrichtung_Oertlich_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Einrichtung_Oertlich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass <em>ID Bedien Oberflaeche Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Oberflaeche_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass <em>ID Bedien Standort Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Standort_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Standort_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass <em>ID Bedien Zentrale Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bedien_Zentrale_TypeClass
	 * @generated
	 */
	public Adapter createID_Bedien_Zentrale_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass <em>ID Befestigung Bauwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass
	 * @generated
	 */
	public Adapter createID_Befestigung_Bauwerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass <em>ID Beginn Bereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass
	 * @generated
	 */
	public Adapter createID_Beginn_Bereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass <em>ID Bezugspunkt Positionierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_Positionierung_TypeClass
	 * @generated
	 */
	public Adapter createID_Bezugspunkt_Positionierung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_TypeClass <em>ID Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Bezugspunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Bezugspunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass <em>ID Binaerdaten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Binaerdaten_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass <em>ID Block Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_Block_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass <em>ID Block Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Block_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass <em>ID Block Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Block_Strecke_TypeClass
	 * @generated
	 */
	public Adapter createID_Block_Strecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass <em>ID BUE Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Anlage_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass <em>ID BUE Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass <em>ID BUE Bedien Anzeige Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Bedien_Anzeige_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Bedien_Anzeige_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass <em>ID BUE Einschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Einschaltung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass <em>ID BUE Gleisbezogener Gefahrraum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Gleisbezogener_Gefahrraum_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass <em>ID BUE Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_Schnittstelle_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_Schnittstelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass <em>ID BUE WS Fstr Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass
	 * @generated
	 */
	public Adapter createID_BUE_WS_Fstr_Zuordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass <em>ID Datenpunkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Datenpunkt_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass <em>ID Datenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Datenpunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Datenpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass <em>ID DP Bezug Funktional Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass
	 * @generated
	 */
	public Adapter createID_DP_Bezug_Funktional_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass <em>ID Einschaltpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Einschaltpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass <em>ID Element Grenze Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Grenze_TypeClass
	 * @generated
	 */
	public Adapter createID_Element_Grenze_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass <em>ID Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass <em>ID Element Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Element_Unterbringung_TypeClass
	 * @generated
	 */
	public Adapter createID_Element_Unterbringung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass <em>ID Energie Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_Eingang_TypeClass
	 * @generated
	 */
	public Adapter createID_Energie_Eingang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass <em>ID Energie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Energie_TypeClass
	 * @generated
	 */
	public Adapter createID_Energie_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass <em>ID ESTW Zentraleinheit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass
	 * @generated
	 */
	public Adapter createID_ESTW_Zentraleinheit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass <em>ID ETCS Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Kante_TypeClass
	 * @generated
	 */
	public Adapter createID_ETCS_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass <em>ID ETCS Knoten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_ETCS_Knoten_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass <em>ID ETCS Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ETCS_Knoten_TypeClass
	 * @generated
	 */
	public Adapter createID_ETCS_Knoten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass <em>ID EV Modul Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_EV_Modul_TypeClass
	 * @generated
	 */
	public Adapter createID_EV_Modul_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass <em>ID Fachtelegramm ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Fachtelegramm_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass <em>ID Fachtelegramm Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fachtelegramm_TypeClass
	 * @generated
	 */
	public Adapter createID_Fachtelegramm_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass <em>ID Fla Schutz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass
	 * @generated
	 */
	public Adapter createID_Fla_Schutz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass <em>ID FMA Anlage Rangier Frei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass
	 * @generated
	 */
	public Adapter createID_FMA_Anlage_Rangier_Frei_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass <em>ID FMA Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_FMA_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass <em>ID FMA Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_FMA_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass <em>ID FMA Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FMA_Komponente_TypeClass
	 * @generated
	 */
	public Adapter createID_FMA_Komponente_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass <em>ID Fortschaltung Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fortschaltung_Start_TypeClass
	 * @generated
	 */
	public Adapter createID_Fortschaltung_Start_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass <em>ID Fstr Aneinander Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Aneinander_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_Aneinander_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass <em>ID Fstr Ausschluss Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_Ausschluss_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass <em>ID Fstr DWeg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_DWeg_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass <em>ID Fstr DWeg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_DWeg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass <em>ID Fstr Fahrweg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_Fahrweg_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass <em>ID Fstr Fahrweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_Fahrweg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass <em>ID Fstr Zug Rangier Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass
	 * @generated
	 */
	public Adapter createID_Fstr_Zug_Rangier_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass <em>ID FT Anschaltbedingung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Anschaltbedingung_TypeClass
	 * @generated
	 */
	public Adapter createID_FT_Anschaltbedingung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass <em>ID FT Fahrweg Teil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_FT_Fahrweg_Teil_TypeClass
	 * @generated
	 */
	public Adapter createID_FT_Fahrweg_Teil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass <em>ID GEO Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass
	 * @generated
	 */
	public Adapter createID_GEO_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass <em>ID GEO Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass
	 * @generated
	 */
	public Adapter createID_GEO_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass <em>ID GEO Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass
	 * @generated
	 */
	public Adapter createID_GEO_Knoten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass <em>ID GEO Punkt ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_GEO_Punkt_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass <em>ID GEO Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createID_GEO_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass <em>ID GFR Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_GFR_Anlage_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass <em>ID Gleis Abschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass
	 * @generated
	 */
	public Adapter createID_Gleis_Abschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass <em>ID Gleis Bezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Gleis_Bezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createID_Gleis_Bezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass <em>ID Grenzzeichen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Grenzzeichen_TypeClass
	 * @generated
	 */
	public Adapter createID_Grenzzeichen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass <em>ID Handschalt Wirkfunktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass
	 * @generated
	 */
	public Adapter createID_Handschalt_Wirkfunktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass <em>ID Hoehenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Hoehenpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass <em>ID Information Eingang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Eingang_TypeClass
	 * @generated
	 */
	public Adapter createID_Information_Eingang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass <em>ID Information Primaer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Information_Primaer_TypeClass
	 * @generated
	 */
	public Adapter createID_Information_Primaer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass <em>ID Komponente Programmiert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Komponente_Programmiert_TypeClass
	 * @generated
	 */
	public Adapter createID_Komponente_Programmiert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass <em>ID Lageplan Blattschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass
	 * @generated
	 */
	public Adapter createID_Lageplan_Blattschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass <em>ID Lageplan Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass
	 * @generated
	 */
	public Adapter createID_Lageplan_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass <em>ID Lageplan Zustand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Zustand_TypeClass
	 * @generated
	 */
	public Adapter createID_Lageplan_Zustand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass <em>ID LEU Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_LEU_Anlage_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass <em>ID LEU Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_LEU_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass <em>ID LEU Bezug Funktional Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass
	 * @generated
	 */
	public Adapter createID_LEU_Bezug_Funktional_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass <em>ID LEU Schaltkasten ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_LEU_Schaltkasten_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass <em>ID LO Einbau Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass
	 * @generated
	 */
	public Adapter createID_LO_Einbau_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass <em>ID Markante Stelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markante_Stelle_TypeClass
	 * @generated
	 */
	public Adapter createID_Markante_Stelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass <em>ID Markanter Punkt Gleis Abschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass
	 * @generated
	 */
	public Adapter createID_Markanter_Punkt_Gleis_Abschluss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass <em>ID Markanter Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Markanter_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass <em>ID NB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_NB_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass <em>ID NB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_TypeClass
	 * @generated
	 */
	public Adapter createID_NB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass <em>ID NB Zone Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass
	 * @generated
	 */
	public Adapter createID_NB_Zone_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass <em>ID Oertlichkeit Ausgabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass
	 * @generated
	 */
	public Adapter createID_Oertlichkeit_Ausgabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass <em>ID Oertlichkeit Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Oertlichkeit_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass <em>ID Oertlichkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass
	 * @generated
	 */
	public Adapter createID_Oertlichkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass <em>ID Plan Pro Schnittstelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PlanPro_Schnittstelle_TypeClass
	 * @generated
	 */
	public Adapter createID_PlanPro_Schnittstelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass <em>ID Planung Einzel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planung_Einzel_TypeClass
	 * @generated
	 */
	public Adapter createID_Planung_Einzel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass <em>ID Planungsgrundlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Planungsgrundlage_TypeClass
	 * @generated
	 */
	public Adapter createID_Planungsgrundlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass <em>ID PZB Element Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_PZB_Element_Bezugspunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass <em>ID PZB Element Mitnutzung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass
	 * @generated
	 */
	public Adapter createID_PZB_Element_Mitnutzung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass <em>ID PZB Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_PZB_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass <em>ID PZB Element Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Zuordnung_TypeClass
	 * @generated
	 */
	public Adapter createID_PZB_Element_Zuordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass <em>ID Quellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass
	 * @generated
	 */
	public Adapter createID_Quellelement_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass <em>ID RBC Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass
	 * @generated
	 */
	public Adapter createID_RBC_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass <em>ID Regelzeichnung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Regelzeichnung_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass <em>ID Regelzeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass
	 * @generated
	 */
	public Adapter createID_Regelzeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass <em>ID Schalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schalter_TypeClass
	 * @generated
	 */
	public Adapter createID_Schalter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass <em>ID Schaltmittel Zuordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass
	 * @generated
	 */
	public Adapter createID_Schaltmittel_Zuordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass <em>ID Schlosskombination Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass
	 * @generated
	 */
	public Adapter createID_Schlosskombination_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass <em>ID Schluessel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluessel_TypeClass
	 * @generated
	 */
	public Adapter createID_Schluessel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass <em>ID Schluesselsperre Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass
	 * @generated
	 */
	public Adapter createID_Schluesselsperre_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass <em>ID Signal Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Befestigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass <em>ID Signal Fank Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Fank_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass <em>ID Signal Gleisbezechnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Gleisbezechnung_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Gleisbezechnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass <em>ID Signal ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass <em>ID Signal Rahmen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Rahmen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass <em>ID Signal Signalbegriff Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Signalbegriff_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass <em>ID Signal Start Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_Start_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass <em>ID Signal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass
	 * @generated
	 */
	public Adapter createID_Signal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass <em>ID Sonderanlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Sonderanlage_TypeClass
	 * @generated
	 */
	public Adapter createID_Sonderanlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass <em>ID Stellelement Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellelement_TypeClass
	 * @generated
	 */
	public Adapter createID_Stellelement_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass <em>ID Stellwerk Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass
	 * @generated
	 */
	public Adapter createID_Stellwerk_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass <em>ID Strecke Bremsweg ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Strecke_Bremsweg_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass <em>ID Strecke Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Strecke_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass <em>ID Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass
	 * @generated
	 */
	public Adapter createID_Strecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass <em>ID Technischer Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Technischer_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Technischer_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass <em>ID TOP Kante ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_TOP_Kante_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass <em>ID TOP Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_TypeClass
	 * @generated
	 */
	public Adapter createID_TOP_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass <em>ID TOP Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass
	 * @generated
	 */
	public Adapter createID_TOP_Knoten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass <em>ID Trasse Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Kante_TypeClass
	 * @generated
	 */
	public Adapter createID_Trasse_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass <em>ID Trasse Knoten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Trasse_Knoten_TypeClass
	 * @generated
	 */
	public Adapter createID_Trasse_Knoten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass <em>ID Ueberhoehung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass
	 * @generated
	 */
	public Adapter createID_Ueberhoehung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass <em>ID Uebertragungsweg Nach Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Nach_TypeClass
	 * @generated
	 */
	public Adapter createID_Uebertragungsweg_Nach_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass <em>ID Uebertragungsweg Von Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Uebertragungsweg_Von_TypeClass
	 * @generated
	 */
	public Adapter createID_Uebertragungsweg_Von_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass <em>ID Umfahrpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass
	 * @generated
	 */
	public Adapter createID_Umfahrpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass <em>ID Unterbringung ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_Unterbringung_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass <em>ID Unterbringung Technik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_Technik_TypeClass
	 * @generated
	 */
	public Adapter createID_Unterbringung_Technik_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass <em>ID Unterbringung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass
	 * @generated
	 */
	public Adapter createID_Unterbringung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass <em>ID Ur Objekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ur_Objekt_TypeClass
	 * @generated
	 */
	public Adapter createID_Ur_Objekt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass <em>ID Verknuepftes Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Verknuepftes_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_Verknuepftes_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass <em>ID WKr Anlage ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_W_Kr_Anlage_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass <em>ID WKr Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createID_W_Kr_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass <em>ID WKr Gsp Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass
	 * @generated
	 */
	public Adapter createID_W_Kr_Gsp_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass <em>ID WKr Gsp Komponente Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Komponente_TypeClass
	 * @generated
	 */
	public Adapter createID_W_Kr_Gsp_Komponente_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass <em>ID Weichenlaufkette Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Weichenlaufkette_TypeClass
	 * @generated
	 */
	public Adapter createID_Weichenlaufkette_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass <em>ID Ziel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Ziel_TypeClass
	 * @generated
	 */
	public Adapter createID_Ziel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass <em>ID ZL DLP Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass
	 * @generated
	 */
	public Adapter createID_ZL_DLP_Fstr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass <em>ID ZL Fstr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass
	 * @generated
	 */
	public Adapter createID_ZL_Fstr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass <em>ID ZL Signalgruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass
	 * @generated
	 */
	public Adapter createID_ZL_Signalgruppe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass <em>ID ZL Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass
	 * @generated
	 */
	public Adapter createID_ZL_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass <em>ID ZLV Bus ohne Proxy Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass
	 * @generated
	 */
	public Adapter createID_ZLV_Bus_ohne_Proxy_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass <em>ID ZLV Bus Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass
	 * @generated
	 */
	public Adapter createID_ZLV_Bus_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass <em>ID ZN Anzeigefeld Anstoss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_Anzeigefeld_Anstoss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass <em>ID ZN Anzeigefeld Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_Anzeigefeld_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass <em>ID ZN Fortschalt Kriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Fortschalt_Kriterium_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_Fortschalt_Kriterium_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass <em>ID ZN Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass <em>ID ZN Unterstation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_Unterstation_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass <em>ID ZN ZBS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_ZN_ZBS_TypeClass
	 * @generated
	 */
	public Adapter createID_ZN_ZBS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass <em>ID Zugeinwirkung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zugeinwirkung_TypeClass
	 * @generated
	 */
	public Adapter createID_Zugeinwirkung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass <em>ID Zweites Haltfallkriterium Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Verweise.ID_Zweites_Haltfallkriterium_TypeClass
	 * @generated
	 */
	public Adapter createID_Zweites_Haltfallkriterium_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass <em>Zeiger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass
	 * @generated
	 */
	public Adapter createZeiger_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VerweiseAdapterFactory
