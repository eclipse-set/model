/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Bahnuebergang.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage
 * @generated
 */
public class BahnuebergangAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BahnuebergangPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnuebergangAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BahnuebergangPackage.eINSTANCE;
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
	protected BahnuebergangSwitch<Adapter> modelSwitch =
		new BahnuebergangSwitch<Adapter>() {
			@Override
			public Adapter caseAbstand_Gehweg_Fahrbahn_TypeClass(Abstand_Gehweg_Fahrbahn_TypeClass object) {
				return createAbstand_Gehweg_Fahrbahn_TypeClassAdapter();
			}
			@Override
			public Adapter caseAkustik_Fussgaenger_TypeClass(Akustik_Fussgaenger_TypeClass object) {
				return createAkustik_Fussgaenger_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusrichtung_TypeClass(Ausrichtung_TypeClass object) {
				return createAusrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusrichtung_Winkel_TypeClass(Ausrichtung_Winkel_TypeClass object) {
				return createAusrichtung_Winkel_TypeClassAdapter();
			}
			@Override
			public Adapter caseAuto_Het_TypeClass(Auto_Het_TypeClass object) {
				return createAuto_Het_TypeClassAdapter();
			}
			@Override
			public Adapter caseBaulast_TypeClass(Baulast_TypeClass object) {
				return createBaulast_TypeClassAdapter();
			}
			@Override
			public Adapter caseBaumprofil_TypeClass(Baumprofil_TypeClass object) {
				return createBaumprofil_TypeClassAdapter();
			}
			@Override
			public Adapter caseBeeinflussung_Strassenverkehr_TypeClass(Beeinflussung_Strassenverkehr_TypeClass object) {
				return createBeeinflussung_Strassenverkehr_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Schrankenantrieb_TypeClass(Bez_Schrankenantrieb_TypeClass object) {
				return createBez_Schrankenantrieb_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_BUE_GFR_Eckpunkt_TypeClass(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass object) {
				return createBezeichnung_BUE_GFR_Eckpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_GFR_Element_TypeClass(Bezeichnung_GFR_Element_TypeClass object) {
				return createBezeichnung_GFR_Element_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_GFR_Tripelspiegel_TypeClass(Bezeichnung_GFR_Tripelspiegel_TypeClass object) {
				return createBezeichnung_GFR_Tripelspiegel_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Verkehrszeichen_TypeClass(Bezeichnung_Verkehrszeichen_TypeClass object) {
				return createBezeichnung_Verkehrszeichen_TypeClassAdapter();
			}
			@Override
			public Adapter caseBlitzpfeil_TypeClass(Blitzpfeil_TypeClass object) {
				return createBlitzpfeil_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Abhaengigkeit_Fue_AttributeGroup(BUE_Abhaengigkeit_Fue_AttributeGroup object) {
				return createBUE_Abhaengigkeit_Fue_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage(BUE_Anlage object) {
				return createBUE_AnlageAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_Allg_AttributeGroup(BUE_Anlage_Allg_AttributeGroup object) {
				return createBUE_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_Fuss_Rad_AttributeGroup(BUE_Anlage_Fuss_Rad_AttributeGroup object) {
				return createBUE_Anlage_Fuss_Rad_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_Strasse(BUE_Anlage_Strasse object) {
				return createBUE_Anlage_StrasseAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_Strasse_Allg_AttributeGroup(BUE_Anlage_Strasse_Allg_AttributeGroup object) {
				return createBUE_Anlage_Strasse_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_V(BUE_Anlage_V object) {
				return createBUE_Anlage_VAdapter();
			}
			@Override
			public Adapter caseBUE_Anlage_V_Allg_AttributeGroup(BUE_Anlage_V_Allg_AttributeGroup object) {
				return createBUE_Anlage_V_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Ausschaltung(BUE_Ausschaltung object) {
				return createBUE_AusschaltungAdapter();
			}
			@Override
			public Adapter caseBUE_Bauart_TypeClass(BUE_Bauart_TypeClass object) {
				return createBUE_Bauart_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Bedien_Anz_Element_Allg_AttributeGroup(BUE_Bedien_Anz_Element_Allg_AttributeGroup object) {
				return createBUE_Bedien_Anz_Element_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Bedien_Anzeige_Element(BUE_Bedien_Anzeige_Element object) {
				return createBUE_Bedien_Anzeige_ElementAdapter();
			}
			@Override
			public Adapter caseBUE_Buestra_TypeClass(BUE_Buestra_TypeClass object) {
				return createBUE_Buestra_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Deckendes_Signal_Zuordnung(BUE_Deckendes_Signal_Zuordnung object) {
				return createBUE_Deckendes_Signal_ZuordnungAdapter();
			}
			@Override
			public Adapter caseBUE_Einschaltung(BUE_Einschaltung object) {
				return createBUE_EinschaltungAdapter();
			}
			@Override
			public Adapter caseBUE_Einschaltung_Hp_AttributeGroup(BUE_Einschaltung_Hp_AttributeGroup object) {
				return createBUE_Einschaltung_Hp_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Einschaltung_Zuordnung(BUE_Einschaltung_Zuordnung object) {
				return createBUE_Einschaltung_ZuordnungAdapter();
			}
			@Override
			public Adapter caseBUE_Funktionsueberwachung_TypeClass(BUE_Funktionsueberwachung_TypeClass object) {
				return createBUE_Funktionsueberwachung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Gefahrraum_Eckpunkt(BUE_Gefahrraum_Eckpunkt object) {
				return createBUE_Gefahrraum_EckpunktAdapter();
			}
			@Override
			public Adapter caseBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup(BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup object) {
				return createBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Gleisbezogener_Gefahrraum(BUE_Gleisbezogener_Gefahrraum object) {
				return createBUE_Gleisbezogener_GefahrraumAdapter();
			}
			@Override
			public Adapter caseBUE_Handschalteinrichtung_TypeClass(BUE_Handschalteinrichtung_TypeClass object) {
				return createBUE_Handschalteinrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Kante(BUE_Kante object) {
				return createBUE_KanteAdapter();
			}
			@Override
			public Adapter caseBUE_Kreuzungsplan(BUE_Kreuzungsplan object) {
				return createBUE_KreuzungsplanAdapter();
			}
			@Override
			public Adapter caseBUE_Kreuzungsplan_Koordinaten_AttributeGroup(BUE_Kreuzungsplan_Koordinaten_AttributeGroup object) {
				return createBUE_Kreuzungsplan_Koordinaten_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Mit_GFR_TypeClass(BUE_Mit_GFR_TypeClass object) {
				return createBUE_Mit_GFR_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Nachlaufzeit_TypeClass(BUE_Nachlaufzeit_TypeClass object) {
				return createBUE_Nachlaufzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Neigung_TypeClass(BUE_Neigung_TypeClass object) {
				return createBUE_Neigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Schnittstelle(BUE_Schnittstelle object) {
				return createBUE_SchnittstelleAdapter();
			}
			@Override
			public Adapter caseBUE_Schnittstelle_Allg_AttributeGroup(BUE_Schnittstelle_Allg_AttributeGroup object) {
				return createBUE_Schnittstelle_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBUE_Sicherungsart_TypeClass(BUE_Sicherungsart_TypeClass object) {
				return createBUE_Sicherungsart_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Sicherungszeit_TypeClass(BUE_Sicherungszeit_TypeClass object) {
				return createBUE_Sicherungszeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Spezifisches_Signal(BUE_Spezifisches_Signal object) {
				return createBUE_Spezifisches_SignalAdapter();
			}
			@Override
			public Adapter caseBUE_Strasse_TypeClass(BUE_Strasse_TypeClass object) {
				return createBUE_Strasse_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Technik_TypeClass(BUE_Technik_TypeClass object) {
				return createBUE_Technik_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_Vorlaufzeit_TypeClass(BUE_Vorlaufzeit_TypeClass object) {
				return createBUE_Vorlaufzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseBUE_WS_Fstr_Zuordnung(BUE_WS_Fstr_Zuordnung object) {
				return createBUE_WS_Fstr_ZuordnungAdapter();
			}
			@Override
			public Adapter caseEinschaltverz_Errechnet_TypeClass(Einschaltverz_Errechnet_TypeClass object) {
				return createEinschaltverz_Errechnet_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinschaltverz_Gewaehlt_TypeClass(Einschaltverz_Gewaehlt_TypeClass object) {
				return createEinschaltverz_Gewaehlt_TypeClassAdapter();
			}
			@Override
			public Adapter caseErsatzstecker_Gleisbezogen_TypeClass(Ersatzstecker_Gleisbezogen_TypeClass object) {
				return createErsatzstecker_Gleisbezogen_TypeClassAdapter();
			}
			@Override
			public Adapter caseFahrbahn_Befestigung_Gleis_TypeClass(Fahrbahn_Befestigung_Gleis_TypeClass object) {
				return createFahrbahn_Befestigung_Gleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseFahrbahn_Befestigung_TypeClass(Fahrbahn_Befestigung_TypeClass object) {
				return createFahrbahn_Befestigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFahrbahn_Breite_TypeClass(Fahrbahn_Breite_TypeClass object) {
				return createFahrbahn_Breite_TypeClassAdapter();
			}
			@Override
			public Adapter caseFue_Schaltfall_TypeClass(Fue_Schaltfall_TypeClass object) {
				return createFue_Schaltfall_TypeClassAdapter();
			}
			@Override
			public Adapter caseFuss_Radweg_Art_TypeClass(Fuss_Radweg_Art_TypeClass object) {
				return createFuss_Radweg_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFuss_Radweg_Seite_TypeClass(Fuss_Radweg_Seite_TypeClass object) {
				return createFuss_Radweg_Seite_TypeClassAdapter();
			}
			@Override
			public Adapter caseGFR_Anlage(GFR_Anlage object) {
				return createGFR_AnlageAdapter();
			}
			@Override
			public Adapter caseGFR_Anlage_Allg_AttributeGroup(GFR_Anlage_Allg_AttributeGroup object) {
				return createGFR_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGFR_Art_TypeClass(GFR_Art_TypeClass object) {
				return createGFR_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseGFR_Element(GFR_Element object) {
				return createGFR_ElementAdapter();
			}
			@Override
			public Adapter caseGFR_Element_Bezeichnung_AttributeGroup(GFR_Element_Bezeichnung_AttributeGroup object) {
				return createGFR_Element_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGFR_Neigung_TypeClass(GFR_Neigung_TypeClass object) {
				return createGFR_Neigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseGFR_Tripelspiegel(GFR_Tripelspiegel object) {
				return createGFR_TripelspiegelAdapter();
			}
			@Override
			public Adapter caseGFR_Tripelspiegel_Allg_AttributeGroup(GFR_Tripelspiegel_Allg_AttributeGroup object) {
				return createGFR_Tripelspiegel_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGFR_Tripelspiegel_Bezeichnung_AttributeGroup(GFR_Tripelspiegel_Bezeichnung_AttributeGroup object) {
				return createGFR_Tripelspiegel_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseGFR_Typ_TypeClass(GFR_Typ_TypeClass object) {
				return createGFR_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseGitterbehang_TypeClass(Gitterbehang_TypeClass object) {
				return createGitterbehang_TypeClassAdapter();
			}
			@Override
			public Adapter caseGleis_Am_Bue_TypeClass(Gleis_Am_Bue_TypeClass object) {
				return createGleis_Am_Bue_TypeClassAdapter();
			}
			@Override
			public Adapter caseHaltezeit_TypeClass(Haltezeit_TypeClass object) {
				return createHaltezeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseHersteller_TypeClass(Hersteller_TypeClass object) {
				return createHersteller_TypeClassAdapter();
			}
			@Override
			public Adapter caseHp_Ersatzstecker_TypeClass(Hp_Ersatzstecker_TypeClass object) {
				return createHp_Ersatzstecker_TypeClassAdapter();
			}
			@Override
			public Adapter caseKlassifizierung_TypeClass(Klassifizierung_TypeClass object) {
				return createKlassifizierung_TypeClassAdapter();
			}
			@Override
			public Adapter caseKontrastblende_TypeClass(Kontrastblende_TypeClass object) {
				return createKontrastblende_TypeClassAdapter();
			}
			@Override
			public Adapter caseKreuzungswinkel_TypeClass(Kreuzungswinkel_TypeClass object) {
				return createKreuzungswinkel_TypeClassAdapter();
			}
			@Override
			public Adapter caseKurzzugschaltung_TypeClass(Kurzzugschaltung_TypeClass object) {
				return createKurzzugschaltung_TypeClassAdapter();
			}
			@Override
			public Adapter caseLagerung_Art_TypeClass(Lagerung_Art_TypeClass object) {
				return createLagerung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseLFUE_Impuls_TypeClass(LFUE_Impuls_TypeClass object) {
				return createLFUE_Impuls_TypeClassAdapter();
			}
			@Override
			public Adapter caseLieferlaenge_TypeClass(Lieferlaenge_TypeClass object) {
				return createLieferlaenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseMontage_Ausgleichsgewichte_TypeClass(Montage_Ausgleichsgewichte_TypeClass object) {
				return createMontage_Ausgleichsgewichte_TypeClassAdapter();
			}
			@Override
			public Adapter caseMontage_Besonders_TypeClass(Montage_Besonders_TypeClass object) {
				return createMontage_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseMontagehoehe_TypeClass(Montagehoehe_TypeClass object) {
				return createMontagehoehe_TypeClassAdapter();
			}
			@Override
			public Adapter caseOptik_Durchmesser_TypeClass(Optik_Durchmesser_TypeClass object) {
				return createOptik_Durchmesser_TypeClassAdapter();
			}
			@Override
			public Adapter caseOptik_Symbolmaske_TypeClass(Optik_Symbolmaske_TypeClass object) {
				return createOptik_Symbolmaske_TypeClassAdapter();
			}
			@Override
			public Adapter casePegel_TypeClass(Pegel_TypeClass object) {
				return createPegel_TypeClassAdapter();
			}
			@Override
			public Adapter casePixel_Koordinate_X_TypeClass(Pixel_Koordinate_X_TypeClass object) {
				return createPixel_Koordinate_X_TypeClassAdapter();
			}
			@Override
			public Adapter casePixel_Koordinate_Y_TypeClass(Pixel_Koordinate_Y_TypeClass object) {
				return createPixel_Koordinate_Y_TypeClassAdapter();
			}
			@Override
			public Adapter caseRaeumstrecke_DAB_TypeClass(Raeumstrecke_DAB_TypeClass object) {
				return createRaeumstrecke_DAB_TypeClassAdapter();
			}
			@Override
			public Adapter caseRaeumstrecke_DBK_TypeClass(Raeumstrecke_DBK_TypeClass object) {
				return createRaeumstrecke_DBK_TypeClassAdapter();
			}
			@Override
			public Adapter caseRaeumstrecke_DCK_TypeClass(Raeumstrecke_DCK_TypeClass object) {
				return createRaeumstrecke_DCK_TypeClassAdapter();
			}
			@Override
			public Adapter caseRaeumstrecke_DSK_Strich_TypeClass(Raeumstrecke_DSK_Strich_TypeClass object) {
				return createRaeumstrecke_DSK_Strich_TypeClassAdapter();
			}
			@Override
			public Adapter caseRaeumstrecke_TypeClass(Raeumstrecke_TypeClass object) {
				return createRaeumstrecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseRichtungspfeil_TypeClass(Richtungspfeil_TypeClass object) {
				return createRichtungspfeil_TypeClassAdapter();
			}
			@Override
			public Adapter caseSA_Schrankenbaum_AttributeGroup(SA_Schrankenbaum_AttributeGroup object) {
				return createSA_Schrankenbaum_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchaltgruppe_TypeClass(Schaltgruppe_TypeClass object) {
				return createSchaltgruppe_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchaltmittel_Fstr_Zuordnung(Schaltmittel_Fstr_Zuordnung object) {
				return createSchaltmittel_Fstr_ZuordnungAdapter();
			}
			@Override
			public Adapter caseSchrankenantrieb(Schrankenantrieb object) {
				return createSchrankenantriebAdapter();
			}
			@Override
			public Adapter caseSchrankenantrieb_Allg_AttributeGroup(Schrankenantrieb_Allg_AttributeGroup object) {
				return createSchrankenantrieb_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchrankenantrieb_Bezeichnung_AttributeGroup(Schrankenantrieb_Bezeichnung_AttributeGroup object) {
				return createSchrankenantrieb_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSchutzbuegel_TypeClass(Schutzbuegel_TypeClass object) {
				return createSchutzbuegel_TypeClassAdapter();
			}
			@Override
			public Adapter caseSicherheitsabstand_TypeClass(Sicherheitsabstand_TypeClass object) {
				return createSicherheitsabstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalverz_Errechnet_TypeClass(Signalverz_Errechnet_TypeClass object) {
				return createSignalverz_Errechnet_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalverz_Gewaehlt_TypeClass(Signalverz_Gewaehlt_TypeClass object) {
				return createSignalverz_Gewaehlt_TypeClassAdapter();
			}
			@Override
			public Adapter caseSperrlaenge_TypeClass(Sperrlaenge_TypeClass object) {
				return createSperrlaenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseSperrstrecke_Fussgaenger_TypeClass(Sperrstrecke_Fussgaenger_TypeClass object) {
				return createSperrstrecke_Fussgaenger_TypeClassAdapter();
			}
			@Override
			public Adapter caseSperrstrecke_TypeClass(Sperrstrecke_TypeClass object) {
				return createSperrstrecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseStoerhalt_Haltfall_TypeClass(Stoerhalt_Haltfall_TypeClass object) {
				return createStoerhalt_Haltfall_TypeClassAdapter();
			}
			@Override
			public Adapter caseStoerhalt_Merkhinweis_TypeClass(Stoerhalt_Merkhinweis_TypeClass object) {
				return createStoerhalt_Merkhinweis_TypeClassAdapter();
			}
			@Override
			public Adapter caseTeilsperrstrecke_TypeClass(Teilsperrstrecke_TypeClass object) {
				return createTeilsperrstrecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseTeilvorgabezeit_TypeClass(Teilvorgabezeit_TypeClass object) {
				return createTeilvorgabezeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseTragkopf_Verstellbar_TypeClass(Tragkopf_Verstellbar_TypeClass object) {
				return createTragkopf_Verstellbar_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Max_Schiene_TypeClass(V_Max_Schiene_TypeClass object) {
				return createV_Max_Schiene_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Max_Strasse_TypeClass(V_Max_Strasse_TypeClass object) {
				return createV_Max_Strasse_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Min_Fussweg_TypeClass(V_Min_Fussweg_TypeClass object) {
				return createV_Min_Fussweg_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Min_Schiene_TypeClass(V_Min_Schiene_TypeClass object) {
				return createV_Min_Schiene_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Min_Strasse_TypeClass(V_Min_Strasse_TypeClass object) {
				return createV_Min_Strasse_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerkehrszeichen(Verkehrszeichen object) {
				return createVerkehrszeichenAdapter();
			}
			@Override
			public Adapter caseVerkehrszeichen_Allg_AttributeGroup(Verkehrszeichen_Allg_AttributeGroup object) {
				return createVerkehrszeichen_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVerkehrszeichen_Andreaskreuz_AttributeGroup(Verkehrszeichen_Andreaskreuz_AttributeGroup object) {
				return createVerkehrszeichen_Andreaskreuz_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVerkehrszeichen_Bezeichnung_AttributeGroup(Verkehrszeichen_Bezeichnung_AttributeGroup object) {
				return createVerkehrszeichen_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVerkehrszeichen_Lz_AttributeGroup(Verkehrszeichen_Lz_AttributeGroup object) {
				return createVerkehrszeichen_Lz_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVorgeschaltet_TypeClass(Vorgeschaltet_TypeClass object) {
				return createVorgeschaltet_TypeClassAdapter();
			}
			@Override
			public Adapter caseVz_Sperrstrecke_AttributeGroup(Vz_Sperrstrecke_AttributeGroup object) {
				return createVz_Sperrstrecke_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVz_Sperrstrecke_Schranke_AttributeGroup(Vz_Sperrstrecke_Schranke_AttributeGroup object) {
				return createVz_Sperrstrecke_Schranke_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseVz_Sperrstrecke_Vorgeschaltet_AttributeGroup(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup object) {
				return createVz_Sperrstrecke_Vorgeschaltet_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseWinkel_Alpha_TypeClass(Winkel_Alpha_TypeClass object) {
				return createWinkel_Alpha_TypeClassAdapter();
			}
			@Override
			public Adapter caseZeitueberschreitungsmeldung_TypeClass(Zeitueberschreitungsmeldung_TypeClass object) {
				return createZeitueberschreitungsmeldung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZusatzschild_TypeClass(Zusatzschild_TypeClass object) {
				return createZusatzschild_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt(Basis_Objekt object) {
				return createBasis_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
			}
			@Override
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass <em>Abstand Gehweg Fahrbahn Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Gehweg_Fahrbahn_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Akustik_Fussgaenger_TypeClass <em>Akustik Fussgaenger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Akustik_Fussgaenger_TypeClass
	 * @generated
	 */
	public Adapter createAkustik_Fussgaenger_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_TypeClass <em>Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_TypeClass
	 * @generated
	 */
	public Adapter createAusrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_Winkel_TypeClass <em>Ausrichtung Winkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_Winkel_TypeClass
	 * @generated
	 */
	public Adapter createAusrichtung_Winkel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Auto_Het_TypeClass <em>Auto Het Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Auto_Het_TypeClass
	 * @generated
	 */
	public Adapter createAuto_Het_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Baulast_TypeClass <em>Baulast Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Baulast_TypeClass
	 * @generated
	 */
	public Adapter createBaulast_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Baumprofil_TypeClass <em>Baumprofil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Baumprofil_TypeClass
	 * @generated
	 */
	public Adapter createBaumprofil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass <em>Beeinflussung Strassenverkehr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass
	 * @generated
	 */
	public Adapter createBeeinflussung_Strassenverkehr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Bez_Schrankenantrieb_TypeClass <em>Bez Schrankenantrieb Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Bez_Schrankenantrieb_TypeClass
	 * @generated
	 */
	public Adapter createBez_Schrankenantrieb_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass <em>Bezeichnung BUE GFR Eckpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_BUE_GFR_Eckpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass <em>Bezeichnung GFR Element Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_GFR_Element_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass <em>Bezeichnung GFR Tripelspiegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_GFR_Tripelspiegel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass <em>Bezeichnung Verkehrszeichen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Verkehrszeichen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Blitzpfeil_TypeClass <em>Blitzpfeil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Blitzpfeil_TypeClass
	 * @generated
	 */
	public Adapter createBlitzpfeil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup <em>BUE Abhaengigkeit Fue Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Abhaengigkeit_Fue_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage <em>BUE Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage
	 * @generated
	 */
	public Adapter createBUE_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup <em>BUE Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup <em>BUE Anlage Fuss Rad Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Anlage_Fuss_Rad_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse <em>BUE Anlage Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse
	 * @generated
	 */
	public Adapter createBUE_Anlage_StrasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup <em>BUE Anlage Strasse Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Anlage_Strasse_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V <em>BUE Anlage V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V
	 * @generated
	 */
	public Adapter createBUE_Anlage_VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup <em>BUE Anlage VAllg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Anlage_V_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung <em>BUE Ausschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung
	 * @generated
	 */
	public Adapter createBUE_AusschaltungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bauart_TypeClass <em>BUE Bauart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bauart_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Bauart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup <em>BUE Bedien Anz Element Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Bedien_Anz_Element_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anzeige_Element <em>BUE Bedien Anzeige Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anzeige_Element
	 * @generated
	 */
	public Adapter createBUE_Bedien_Anzeige_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Buestra_TypeClass <em>BUE Buestra Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Buestra_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Buestra_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung <em>BUE Deckendes Signal Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung
	 * @generated
	 */
	public Adapter createBUE_Deckendes_Signal_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung <em>BUE Einschaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung
	 * @generated
	 */
	public Adapter createBUE_EinschaltungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup <em>BUE Einschaltung Hp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Einschaltung_Hp_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung <em>BUE Einschaltung Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung
	 * @generated
	 */
	public Adapter createBUE_Einschaltung_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass <em>BUE Funktionsueberwachung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Funktionsueberwachung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt <em>BUE Gefahrraum Eckpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt
	 * @generated
	 */
	public Adapter createBUE_Gefahrraum_EckpunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup <em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum <em>BUE Gleisbezogener Gefahrraum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum
	 * @generated
	 */
	public Adapter createBUE_Gleisbezogener_GefahrraumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass <em>BUE Handschalteinrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Handschalteinrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante <em>BUE Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante
	 * @generated
	 */
	public Adapter createBUE_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan <em>BUE Kreuzungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan
	 * @generated
	 */
	public Adapter createBUE_KreuzungsplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup <em>BUE Kreuzungsplan Koordinaten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Kreuzungsplan_Koordinaten_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Mit_GFR_TypeClass <em>BUE Mit GFR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Mit_GFR_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Mit_GFR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Nachlaufzeit_TypeClass <em>BUE Nachlaufzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Nachlaufzeit_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Nachlaufzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Neigung_TypeClass <em>BUE Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Neigung_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Neigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle <em>BUE Schnittstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle
	 * @generated
	 */
	public Adapter createBUE_SchnittstelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup <em>BUE Schnittstelle Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBUE_Schnittstelle_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungsart_TypeClass <em>BUE Sicherungsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungsart_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Sicherungsart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungszeit_TypeClass <em>BUE Sicherungszeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungszeit_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Sicherungszeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Spezifisches_Signal <em>BUE Spezifisches Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Spezifisches_Signal
	 * @generated
	 */
	public Adapter createBUE_Spezifisches_SignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Strasse_TypeClass <em>BUE Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Strasse_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Strasse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Technik_TypeClass <em>BUE Technik Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Technik_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Technik_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Vorlaufzeit_TypeClass <em>BUE Vorlaufzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_Vorlaufzeit_TypeClass
	 * @generated
	 */
	public Adapter createBUE_Vorlaufzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_WS_Fstr_Zuordnung <em>BUE WS Fstr Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BUE_WS_Fstr_Zuordnung
	 * @generated
	 */
	public Adapter createBUE_WS_Fstr_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Errechnet_TypeClass <em>Einschaltverz Errechnet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Errechnet_TypeClass
	 * @generated
	 */
	public Adapter createEinschaltverz_Errechnet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass <em>Einschaltverz Gewaehlt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass
	 * @generated
	 */
	public Adapter createEinschaltverz_Gewaehlt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass <em>Ersatzstecker Gleisbezogen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass
	 * @generated
	 */
	public Adapter createErsatzstecker_Gleisbezogen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass <em>Fahrbahn Befestigung Gleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_Gleis_TypeClass
	 * @generated
	 */
	public Adapter createFahrbahn_Befestigung_Gleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_TypeClass <em>Fahrbahn Befestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Befestigung_TypeClass
	 * @generated
	 */
	public Adapter createFahrbahn_Befestigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Breite_TypeClass <em>Fahrbahn Breite Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fahrbahn_Breite_TypeClass
	 * @generated
	 */
	public Adapter createFahrbahn_Breite_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass <em>Fue Schaltfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fue_Schaltfall_TypeClass
	 * @generated
	 */
	public Adapter createFue_Schaltfall_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Art_TypeClass <em>Fuss Radweg Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Art_TypeClass
	 * @generated
	 */
	public Adapter createFuss_Radweg_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Seite_TypeClass <em>Fuss Radweg Seite Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Seite_TypeClass
	 * @generated
	 */
	public Adapter createFuss_Radweg_Seite_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage <em>GFR Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage
	 * @generated
	 */
	public Adapter createGFR_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup <em>GFR Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createGFR_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Art_TypeClass <em>GFR Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Art_TypeClass
	 * @generated
	 */
	public Adapter createGFR_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element <em>GFR Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element
	 * @generated
	 */
	public Adapter createGFR_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup <em>GFR Element Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createGFR_Element_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Neigung_TypeClass <em>GFR Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Neigung_TypeClass
	 * @generated
	 */
	public Adapter createGFR_Neigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel <em>GFR Tripelspiegel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel
	 * @generated
	 */
	public Adapter createGFR_TripelspiegelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup <em>GFR Tripelspiegel Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createGFR_Tripelspiegel_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup <em>GFR Tripelspiegel Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createGFR_Tripelspiegel_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.GFR_Typ_TypeClass <em>GFR Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.GFR_Typ_TypeClass
	 * @generated
	 */
	public Adapter createGFR_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Gitterbehang_TypeClass <em>Gitterbehang Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Gitterbehang_TypeClass
	 * @generated
	 */
	public Adapter createGitterbehang_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Gleis_Am_Bue_TypeClass <em>Gleis Am Bue Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Gleis_Am_Bue_TypeClass
	 * @generated
	 */
	public Adapter createGleis_Am_Bue_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Haltezeit_TypeClass <em>Haltezeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Haltezeit_TypeClass
	 * @generated
	 */
	public Adapter createHaltezeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Hersteller_TypeClass
	 * @generated
	 */
	public Adapter createHersteller_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Hp_Ersatzstecker_TypeClass <em>Hp Ersatzstecker Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Hp_Ersatzstecker_TypeClass
	 * @generated
	 */
	public Adapter createHp_Ersatzstecker_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Klassifizierung_TypeClass <em>Klassifizierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Klassifizierung_TypeClass
	 * @generated
	 */
	public Adapter createKlassifizierung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Kontrastblende_TypeClass <em>Kontrastblende Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Kontrastblende_TypeClass
	 * @generated
	 */
	public Adapter createKontrastblende_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Kreuzungswinkel_TypeClass <em>Kreuzungswinkel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Kreuzungswinkel_TypeClass
	 * @generated
	 */
	public Adapter createKreuzungswinkel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Kurzzugschaltung_TypeClass <em>Kurzzugschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Kurzzugschaltung_TypeClass
	 * @generated
	 */
	public Adapter createKurzzugschaltung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Lagerung_Art_TypeClass <em>Lagerung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Lagerung_Art_TypeClass
	 * @generated
	 */
	public Adapter createLagerung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.LFUE_Impuls_TypeClass <em>LFUE Impuls Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.LFUE_Impuls_TypeClass
	 * @generated
	 */
	public Adapter createLFUE_Impuls_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Lieferlaenge_TypeClass <em>Lieferlaenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Lieferlaenge_TypeClass
	 * @generated
	 */
	public Adapter createLieferlaenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass <em>Montage Ausgleichsgewichte Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass
	 * @generated
	 */
	public Adapter createMontage_Ausgleichsgewichte_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Montage_Besonders_TypeClass <em>Montage Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Montage_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createMontage_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Montagehoehe_TypeClass <em>Montagehoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Montagehoehe_TypeClass
	 * @generated
	 */
	public Adapter createMontagehoehe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Optik_Durchmesser_TypeClass <em>Optik Durchmesser Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Optik_Durchmesser_TypeClass
	 * @generated
	 */
	public Adapter createOptik_Durchmesser_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Optik_Symbolmaske_TypeClass <em>Optik Symbolmaske Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Optik_Symbolmaske_TypeClass
	 * @generated
	 */
	public Adapter createOptik_Symbolmaske_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Pegel_TypeClass <em>Pegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Pegel_TypeClass
	 * @generated
	 */
	public Adapter createPegel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Pixel_Koordinate_X_TypeClass <em>Pixel Koordinate XType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Pixel_Koordinate_X_TypeClass
	 * @generated
	 */
	public Adapter createPixel_Koordinate_X_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Pixel_Koordinate_Y_TypeClass <em>Pixel Koordinate YType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Pixel_Koordinate_Y_TypeClass
	 * @generated
	 */
	public Adapter createPixel_Koordinate_Y_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DAB_TypeClass <em>Raeumstrecke DAB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DAB_TypeClass
	 * @generated
	 */
	public Adapter createRaeumstrecke_DAB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DBK_TypeClass <em>Raeumstrecke DBK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DBK_TypeClass
	 * @generated
	 */
	public Adapter createRaeumstrecke_DBK_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DCK_TypeClass <em>Raeumstrecke DCK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DCK_TypeClass
	 * @generated
	 */
	public Adapter createRaeumstrecke_DCK_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass <em>Raeumstrecke DSK Strich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass
	 * @generated
	 */
	public Adapter createRaeumstrecke_DSK_Strich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_TypeClass <em>Raeumstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_TypeClass
	 * @generated
	 */
	public Adapter createRaeumstrecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Richtungspfeil_TypeClass <em>Richtungspfeil Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Richtungspfeil_TypeClass
	 * @generated
	 */
	public Adapter createRichtungspfeil_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup <em>SA Schrankenbaum Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup
	 * @generated
	 */
	public Adapter createSA_Schrankenbaum_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltgruppe_TypeClass <em>Schaltgruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schaltgruppe_TypeClass
	 * @generated
	 */
	public Adapter createSchaltgruppe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung <em>Schaltmittel Fstr Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung
	 * @generated
	 */
	public Adapter createSchaltmittel_Fstr_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb <em>Schrankenantrieb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb
	 * @generated
	 */
	public Adapter createSchrankenantriebAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup <em>Schrankenantrieb Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createSchrankenantrieb_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup <em>Schrankenantrieb Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createSchrankenantrieb_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Schutzbuegel_TypeClass <em>Schutzbuegel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Schutzbuegel_TypeClass
	 * @generated
	 */
	public Adapter createSchutzbuegel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Sicherheitsabstand_TypeClass <em>Sicherheitsabstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Sicherheitsabstand_TypeClass
	 * @generated
	 */
	public Adapter createSicherheitsabstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Errechnet_TypeClass <em>Signalverz Errechnet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Errechnet_TypeClass
	 * @generated
	 */
	public Adapter createSignalverz_Errechnet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Gewaehlt_TypeClass <em>Signalverz Gewaehlt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Gewaehlt_TypeClass
	 * @generated
	 */
	public Adapter createSignalverz_Gewaehlt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Sperrlaenge_TypeClass <em>Sperrlaenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Sperrlaenge_TypeClass
	 * @generated
	 */
	public Adapter createSperrlaenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass <em>Sperrstrecke Fussgaenger Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Sperrstrecke_Fussgaenger_TypeClass
	 * @generated
	 */
	public Adapter createSperrstrecke_Fussgaenger_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Sperrstrecke_TypeClass <em>Sperrstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Sperrstrecke_TypeClass
	 * @generated
	 */
	public Adapter createSperrstrecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Stoerhalt_Haltfall_TypeClass <em>Stoerhalt Haltfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Stoerhalt_Haltfall_TypeClass
	 * @generated
	 */
	public Adapter createStoerhalt_Haltfall_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass <em>Stoerhalt Merkhinweis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Stoerhalt_Merkhinweis_TypeClass
	 * @generated
	 */
	public Adapter createStoerhalt_Merkhinweis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Teilsperrstrecke_TypeClass <em>Teilsperrstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Teilsperrstrecke_TypeClass
	 * @generated
	 */
	public Adapter createTeilsperrstrecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Teilvorgabezeit_TypeClass <em>Teilvorgabezeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Teilvorgabezeit_TypeClass
	 * @generated
	 */
	public Adapter createTeilvorgabezeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Tragkopf_Verstellbar_TypeClass <em>Tragkopf Verstellbar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Tragkopf_Verstellbar_TypeClass
	 * @generated
	 */
	public Adapter createTragkopf_Verstellbar_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.V_Max_Schiene_TypeClass <em>VMax Schiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.V_Max_Schiene_TypeClass
	 * @generated
	 */
	public Adapter createV_Max_Schiene_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.V_Max_Strasse_TypeClass <em>VMax Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.V_Max_Strasse_TypeClass
	 * @generated
	 */
	public Adapter createV_Max_Strasse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Fussweg_TypeClass <em>VMin Fussweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Fussweg_TypeClass
	 * @generated
	 */
	public Adapter createV_Min_Fussweg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Schiene_TypeClass <em>VMin Schiene Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Schiene_TypeClass
	 * @generated
	 */
	public Adapter createV_Min_Schiene_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Strasse_TypeClass <em>VMin Strasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.V_Min_Strasse_TypeClass
	 * @generated
	 */
	public Adapter createV_Min_Strasse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen <em>Verkehrszeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen
	 * @generated
	 */
	public Adapter createVerkehrszeichenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup <em>Verkehrszeichen Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createVerkehrszeichen_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup <em>Verkehrszeichen Andreaskreuz Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup
	 * @generated
	 */
	public Adapter createVerkehrszeichen_Andreaskreuz_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup <em>Verkehrszeichen Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createVerkehrszeichen_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup <em>Verkehrszeichen Lz Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup
	 * @generated
	 */
	public Adapter createVerkehrszeichen_Lz_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vorgeschaltet_TypeClass <em>Vorgeschaltet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Vorgeschaltet_TypeClass
	 * @generated
	 */
	public Adapter createVorgeschaltet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup <em>Vz Sperrstrecke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup
	 * @generated
	 */
	public Adapter createVz_Sperrstrecke_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup <em>Vz Sperrstrecke Schranke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup
	 * @generated
	 */
	public Adapter createVz_Sperrstrecke_Schranke_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup <em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup
	 * @generated
	 */
	public Adapter createVz_Sperrstrecke_Vorgeschaltet_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Winkel_Alpha_TypeClass <em>Winkel Alpha Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Winkel_Alpha_TypeClass
	 * @generated
	 */
	public Adapter createWinkel_Alpha_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass <em>Zeitueberschreitungsmeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Zeitueberschreitungsmeldung_TypeClass
	 * @generated
	 */
	public Adapter createZeitueberschreitungsmeldung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Bahnuebergang.Zusatzschild_TypeClass <em>Zusatzschild Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.Zusatzschild_TypeClass
	 * @generated
	 */
	public Adapter createZusatzschild_TypeClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
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

} //BahnuebergangAdapterFactory
