/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.ATO.ATO_Segment_Profile;
import org.eclipse.set.model.planpro.ATO.ATO_TS_Instanz;
import org.eclipse.set.model.planpro.ATO.ATO_Timing_Point;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Stell_Bereich;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Stellelement;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Technik_Standort;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Uebertragungsweg;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Dach;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Strasse;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_V;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anzeige_Element;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Spezifisches_Signal;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_WS_Fstr_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel;
import org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb;
import org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Link;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Knoten;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_W_Kr;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Gruppe;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft;

import org.eclipse.set.model.planpro.Basisobjekte.Anhang;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt;
import org.eclipse.set.model.planpro.Basisobjekte.Proxy_Objekt;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Bezirk;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.model.planpro.Bedienung.Bedien_GBT;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Platz;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Standort;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale;

import org.eclipse.set.model.planpro.Block.Block_Anlage;
import org.eclipse.set.model.planpro.Block.Block_Element;
import org.eclipse.set.model.planpro.Block.Block_Strecke;

import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Zuordnung;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_W_Kr;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt;

import org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz;

import org.eclipse.set.model.planpro.Geodaten.GEO_Kante;
import org.eclipse.set.model.planpro.Geodaten.GEO_Knoten;
import org.eclipse.set.model.planpro.Geodaten.GEO_Punkt;
import org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil;
import org.eclipse.set.model.planpro.Geodaten.Hoehenlinie;
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt;
import org.eclipse.set.model.planpro.Geodaten.Oertlichkeit;
import org.eclipse.set.model.planpro.Geodaten.Strecke;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Punkt;
import org.eclipse.set.model.planpro.Geodaten.TOP_Kante;
import org.eclipse.set.model.planpro.Geodaten.TOP_Knoten;
import org.eclipse.set.model.planpro.Geodaten.Technischer_Bereich;
import org.eclipse.set.model.planpro.Geodaten.Technischer_Punkt;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie;

import org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt;
import org.eclipse.set.model.planpro.Gleis.Gleis_Art;
import org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich;
import org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung;
import org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn;
import org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum;
import org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Verteilpunkt;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Trasse_Kante;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Trasse_Knoten;

import org.eclipse.set.model.planpro.Nahbedienung.NB;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Grenze;

import org.eclipse.set.model.planpro.Ortung.FMA_Anlage;
import org.eclipse.set.model.planpro.Ortung.FMA_Element;
import org.eclipse.set.model.planpro.Ortung.FMA_Komponente;
import org.eclipse.set.model.planpro.Ortung.Schaltmittel_Zuordnung;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung;

import org.eclipse.set.model.planpro.PZB.PZB_Element;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal;

import org.eclipse.set.model.planpro.PlanPro.Container_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Parameter;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluesselsperre;

import org.eclipse.set.model.planpro.Signale.Signal;
import org.eclipse.set.model.planpro.Signale.Signal_Befestigung;
import org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung;
import org.eclipse.set.model.planpro.Signale.Signal_Rahmen;
import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleis_Abschluss;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichenlaufkette;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung;

import org.eclipse.set.model.planpro.Zuglenkung.ZL;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe_Zuordnung;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getAnhang <em>Anhang</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getATOSegmentProfile <em>ATO Segment Profile</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getATOTimingPoint <em>ATO Timing Point</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getATOTSInstanz <em>ATOTS Instanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getAussenelementansteuerung <em>Aussenelementansteuerung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBahnsteigAnlage <em>Bahnsteig Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBahnsteigDach <em>Bahnsteig Dach</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBahnsteigKante <em>Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBahnsteigZugang <em>Bahnsteig Zugang</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBalise <em>Balise</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBearbeitungsvermerk <em>Bearbeitungsvermerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienAnrueckabschnitt <em>Bedien Anrueckabschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienAnzeigeElement <em>Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienBezirk <em>Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienEinrichtungOertlich <em>Bedien Einrichtung Oertlich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienGBT <em>Bedien GBT</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienOberflaeche <em>Bedien Oberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienOberflaecheBild <em>Bedien Oberflaeche Bild</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienOertlichkeit <em>Bedien Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienPlatz <em>Bedien Platz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienStandort <em>Bedien Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBedienZentrale <em>Bedien Zentrale</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBinaerdaten <em>Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBlockAnlage <em>Block Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBlockElement <em>Block Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBlockStrecke <em>Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEAnlage <em>BUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEAnlageStrasse <em>BUE Anlage Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEAnlageV <em>BUE Anlage V</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEAusschaltung <em>BUE Ausschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEBedienAnzeigeElement <em>BUE Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEDeckendesSignalZuordnung <em>BUE Deckendes Signal Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEEinschaltung <em>BUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEEinschaltungZuordnung <em>BUE Einschaltung Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEGefahrraumEckpunkt <em>BUE Gefahrraum Eckpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEGleisbezogenerGefahrraum <em>BUE Gleisbezogener Gefahrraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEKante <em>BUE Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEKreuzungsplan <em>BUE Kreuzungsplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUESchnittstelle <em>BUE Schnittstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUESpezifischesSignal <em>BUE Spezifisches Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getBUEWSFstrZuordnung <em>BUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getDatenpunkt <em>Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getDatenpunktLink <em>Datenpunkt Link</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getESTWZentraleinheit <em>ESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getETCSKante <em>ETCS Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getETCSKnoten <em>ETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getETCSRichtungsanzeige <em>ETCS Richtungsanzeige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getETCSSignal <em>ETCS Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getETCSWKr <em>ETCSW Kr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getEVModul <em>EV Modul</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFachtelegramm <em>Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFlaFreimeldeZuordnung <em>Fla Freimelde Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFlaSchutz <em>Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFlaZwieschutz <em>Fla Zwieschutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFMAAnlage <em>FMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFMAElement <em>FMA Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFMAKomponente <em>FMA Komponente</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrAbhaengigkeit <em>Fstr Abhaengigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrAneinander <em>Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrAneinanderZuordnung <em>Fstr Aneinander Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrDWeg <em>Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrDWegWKr <em>Fstr DWeg WKr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrFahrweg <em>Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrNichthaltfall <em>Fstr Nichthaltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrRangierFlaZuordnung <em>Fstr Rangier Fla Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrSignalisierung <em>Fstr Signalisierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrUmfahrpunkt <em>Fstr Umfahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFstrZugRangier <em>Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFTAnschaltbedingung <em>FT Anschaltbedingung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getFTFahrwegTeil <em>FT Fahrweg Teil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGEOKante <em>GEO Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGEOKnoten <em>GEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGEOPunkt <em>GEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGeschwindigkeitsprofil <em>Geschwindigkeitsprofil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGFRAnlage <em>GFR Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGFRElement <em>GFR Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGFRTripelspiegel <em>GFR Tripelspiegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisAbschluss <em>Gleis Abschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisAbschnitt <em>Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisArt <em>Gleis Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisBaubereich <em>Gleis Baubereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisBezeichnung <em>Gleis Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisFahrbahn <em>Gleis Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisLichtraum <em>Gleis Lichtraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getGleisSchaltgruppe <em>Gleis Schaltgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getHoehenlinie <em>Hoehenlinie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getHoehenpunkt <em>Hoehenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getKabel <em>Kabel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getKabelVerteilpunkt <em>Kabel Verteilpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getLEUAnlage <em>LEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getLEUModul <em>LEU Modul</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getLEUSchaltkasten <em>LEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getLieferobjekt <em>Lieferobjekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getLuftTelegramm <em>Luft Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getMarkanterPunkt <em>Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getNB <em>NB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getNBBedienAnzeigeElement <em>NB Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getNBZone <em>NB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getNBZoneElement <em>NB Zone Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getNBZoneGrenze <em>NB Zone Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getOertlichkeit <em>Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getProgDateiGruppe <em>Prog Datei Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getProxyObjekt <em>Proxy Objekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getPZBElement <em>PZB Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getPZBElementZuordnung <em>PZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getPZBZuordnungSignal <em>PZB Zuordnung Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getRBC <em>RBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getRegelzeichnung <em>Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getRegelzeichnungParameter <em>Regelzeichnung Parameter</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchaltmittelFstrZuordnung <em>Schaltmittel Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchaltmittelZuordnung <em>Schaltmittel Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchloss <em>Schloss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchlosskombination <em>Schlosskombination</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchluessel <em>Schluessel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchluesselsperre <em>Schluesselsperre</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSchrankenantrieb <em>Schrankenantrieb</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSignalBefestigung <em>Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSignalFankZuordnung <em>Signal Fank Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSignalRahmen <em>Signal Rahmen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSignalSignalbegriff <em>Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getSonstigerPunkt <em>Sonstiger Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getStellBereich <em>Stell Bereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getStellelement <em>Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getStrecke <em>Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getStreckeBremsweg <em>Strecke Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getStreckePunkt <em>Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTechnikStandort <em>Technik Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTechnischerBereich <em>Technischer Bereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTechnischerPunkt <em>Technischer Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTOPKante <em>TOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTOPKnoten <em>TOP Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTrasseKante <em>Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getTrasseKnoten <em>Trasse Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getUeberhoehung <em>Ueberhoehung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getUeberhoehungslinie <em>Ueberhoehungslinie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getUebertragungsweg <em>Uebertragungsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getUnterbringung <em>Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getVerkehrszeichen <em>Verkehrszeichen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getWKrAnlage <em>WKr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getWKrGspElement <em>WKr Gsp Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getWKrGspKomponente <em>WKr Gsp Komponente</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getWeichenlaufkette <em>Weichenlaufkette</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getWeichenlaufketteZuordnung <em>Weichenlaufkette Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZBSSchutzstrecke <em>ZBS Schutzstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZBSSignal <em>ZBS Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZL <em>ZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLDLPAbschnitt <em>ZLDLP Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLDLPFstr <em>ZLDLP Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLFstr <em>ZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLFstrAnstoss <em>ZL Fstr Anstoss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLSignalgruppe <em>ZL Signalgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLSignalgruppeZuordnung <em>ZL Signalgruppe Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLVBus <em>ZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLVBusBesondereAnlage <em>ZLV Bus Besondere Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZLVBusUSZuordnung <em>ZLV Bus US Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZN <em>ZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNAkustik <em>ZN Akustik</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNAnzeigefeld <em>ZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNFortschaltKriterium <em>ZN Fortschalt Kriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNTelegramm84Zuordnung <em>ZN Telegramm84 Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNTelegramm85Zuordnung <em>ZN Telegramm85 Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNUnterstation <em>ZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZNZBS <em>ZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZUBBereichsgrenze <em>ZUB Bereichsgrenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZUBStreckeneigenschaft <em>ZUB Streckeneigenschaft</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Container_AttributeGroupImpl#getZugeinwirkung <em>Zugeinwirkung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Container_AttributeGroupImpl extends EObjectImpl implements Container_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnhang() <em>Anhang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhang()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhang;

	/**
	 * The cached value of the '{@link #getATOSegmentProfile() <em>ATO Segment Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOSegmentProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ATO_Segment_Profile> aTOSegmentProfile;

	/**
	 * The cached value of the '{@link #getATOTimingPoint() <em>ATO Timing Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTimingPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ATO_Timing_Point> aTOTimingPoint;

	/**
	 * The cached value of the '{@link #getATOTSInstanz() <em>ATOTS Instanz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTSInstanz()
	 * @generated
	 * @ordered
	 */
	protected EList<ATO_TS_Instanz> aTOTSInstanz;

	/**
	 * The cached value of the '{@link #getAussenelementansteuerung() <em>Aussenelementansteuerung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected EList<Aussenelementansteuerung> aussenelementansteuerung;

	/**
	 * The cached value of the '{@link #getBahnsteigAnlage() <em>Bahnsteig Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<Bahnsteig_Anlage> bahnsteigAnlage;

	/**
	 * The cached value of the '{@link #getBahnsteigDach() <em>Bahnsteig Dach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigDach()
	 * @generated
	 * @ordered
	 */
	protected EList<Bahnsteig_Dach> bahnsteigDach;

	/**
	 * The cached value of the '{@link #getBahnsteigKante() <em>Bahnsteig Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected EList<Bahnsteig_Kante> bahnsteigKante;

	/**
	 * The cached value of the '{@link #getBahnsteigZugang() <em>Bahnsteig Zugang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigZugang()
	 * @generated
	 * @ordered
	 */
	protected EList<Bahnsteig_Zugang> bahnsteigZugang;

	/**
	 * The cached value of the '{@link #getBalise() <em>Balise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalise()
	 * @generated
	 * @ordered
	 */
	protected EList<Balise> balise;

	/**
	 * The cached value of the '{@link #getBearbeitungsvermerk() <em>Bearbeitungsvermerk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bearbeitungsvermerk> bearbeitungsvermerk;

	/**
	 * The cached value of the '{@link #getBedienAnrueckabschnitt() <em>Bedien Anrueckabschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienAnrueckabschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Anrueckabschnitt> bedienAnrueckabschnitt;

	/**
	 * The cached value of the '{@link #getBedienAnzeigeElement() <em>Bedien Anzeige Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Anzeige_Element> bedienAnzeigeElement;

	/**
	 * The cached value of the '{@link #getBedienBezirk() <em>Bedien Bezirk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Bezirk> bedienBezirk;

	/**
	 * The cached value of the '{@link #getBedienEinrichtungOertlich() <em>Bedien Einrichtung Oertlich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienEinrichtungOertlich()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Einrichtung_Oertlich> bedienEinrichtungOertlich;

	/**
	 * The cached value of the '{@link #getBedienGBT() <em>Bedien GBT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienGBT()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_GBT> bedienGBT;

	/**
	 * The cached value of the '{@link #getBedienOberflaeche() <em>Bedien Oberflaeche</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaeche()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Oberflaeche> bedienOberflaeche;

	/**
	 * The cached value of the '{@link #getBedienOberflaecheBild() <em>Bedien Oberflaeche Bild</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaecheBild()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Oberflaeche_Bild> bedienOberflaecheBild;

	/**
	 * The cached value of the '{@link #getBedienOertlichkeit() <em>Bedien Oertlichkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Oertlichkeit> bedienOertlichkeit;

	/**
	 * The cached value of the '{@link #getBedienPlatz() <em>Bedien Platz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienPlatz()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Platz> bedienPlatz;

	/**
	 * The cached value of the '{@link #getBedienStandort() <em>Bedien Standort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienStandort()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Standort> bedienStandort;

	/**
	 * The cached value of the '{@link #getBedienZentrale() <em>Bedien Zentrale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienZentrale()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Zentrale> bedienZentrale;

	/**
	 * The cached value of the '{@link #getBinaerdaten() <em>Binaerdaten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected EList<Binaerdaten> binaerdaten;

	/**
	 * The cached value of the '{@link #getBlockAnlage() <em>Block Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<Block_Anlage> blockAnlage;

	/**
	 * The cached value of the '{@link #getBlockElement() <em>Block Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Block_Element> blockElement;

	/**
	 * The cached value of the '{@link #getBlockStrecke() <em>Block Strecke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockStrecke()
	 * @generated
	 * @ordered
	 */
	protected EList<Block_Strecke> blockStrecke;

	/**
	 * The cached value of the '{@link #getBUEAnlage() <em>BUE Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Anlage> bUEAnlage;

	/**
	 * The cached value of the '{@link #getBUEAnlageStrasse() <em>BUE Anlage Strasse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageStrasse()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Anlage_Strasse> bUEAnlageStrasse;

	/**
	 * The cached value of the '{@link #getBUEAnlageV() <em>BUE Anlage V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageV()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Anlage_V> bUEAnlageV;

	/**
	 * The cached value of the '{@link #getBUEAusschaltung() <em>BUE Ausschaltung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAusschaltung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Ausschaltung> bUEAusschaltung;

	/**
	 * The cached value of the '{@link #getBUEBedienAnzeigeElement() <em>BUE Bedien Anzeige Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Bedien_Anzeige_Element> bUEBedienAnzeigeElement;

	/**
	 * The cached value of the '{@link #getBUEDeckendesSignalZuordnung() <em>BUE Deckendes Signal Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEDeckendesSignalZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Deckendes_Signal_Zuordnung> bUEDeckendesSignalZuordnung;

	/**
	 * The cached value of the '{@link #getBUEEinschaltung() <em>BUE Einschaltung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Einschaltung> bUEEinschaltung;

	/**
	 * The cached value of the '{@link #getBUEEinschaltungZuordnung() <em>BUE Einschaltung Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEEinschaltungZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Einschaltung_Zuordnung> bUEEinschaltungZuordnung;

	/**
	 * The cached value of the '{@link #getBUEGefahrraumEckpunkt() <em>BUE Gefahrraum Eckpunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEGefahrraumEckpunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Gefahrraum_Eckpunkt> bUEGefahrraumEckpunkt;

	/**
	 * The cached value of the '{@link #getBUEGleisbezogenerGefahrraum() <em>BUE Gleisbezogener Gefahrraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEGleisbezogenerGefahrraum()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Gleisbezogener_Gefahrraum> bUEGleisbezogenerGefahrraum;

	/**
	 * The cached value of the '{@link #getBUEKante() <em>BUE Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEKante()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Kante> bUEKante;

	/**
	 * The cached value of the '{@link #getBUEKreuzungsplan() <em>BUE Kreuzungsplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEKreuzungsplan()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Kreuzungsplan> bUEKreuzungsplan;

	/**
	 * The cached value of the '{@link #getBUESchnittstelle() <em>BUE Schnittstelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUESchnittstelle()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Schnittstelle> bUESchnittstelle;

	/**
	 * The cached value of the '{@link #getBUESpezifischesSignal() <em>BUE Spezifisches Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUESpezifischesSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Spezifisches_Signal> bUESpezifischesSignal;

	/**
	 * The cached value of the '{@link #getBUEWSFstrZuordnung() <em>BUEWS Fstr Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEWSFstrZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_WS_Fstr_Zuordnung> bUEWSFstrZuordnung;

	/**
	 * The cached value of the '{@link #getDatenpunkt() <em>Datenpunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenpunkt> datenpunkt;

	/**
	 * The cached value of the '{@link #getDatenpunktLink() <em>Datenpunkt Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunktLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Datenpunkt_Link> datenpunktLink;

	/**
	 * The cached value of the '{@link #getESTWZentraleinheit() <em>ESTW Zentraleinheit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected EList<ESTW_Zentraleinheit> eSTWZentraleinheit;

	/**
	 * The cached value of the '{@link #getETCSKante() <em>ETCS Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSKante()
	 * @generated
	 * @ordered
	 */
	protected EList<ETCS_Kante> eTCSKante;

	/**
	 * The cached value of the '{@link #getETCSKnoten() <em>ETCS Knoten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSKnoten()
	 * @generated
	 * @ordered
	 */
	protected EList<ETCS_Knoten> eTCSKnoten;

	/**
	 * The cached value of the '{@link #getETCSRichtungsanzeige() <em>ETCS Richtungsanzeige</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSRichtungsanzeige()
	 * @generated
	 * @ordered
	 */
	protected EList<ETCS_Richtungsanzeige> eTCSRichtungsanzeige;

	/**
	 * The cached value of the '{@link #getETCSSignal() <em>ETCS Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<ETCS_Signal> eTCSSignal;

	/**
	 * The cached value of the '{@link #getETCSWKr() <em>ETCSW Kr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSWKr()
	 * @generated
	 * @ordered
	 */
	protected EList<ETCS_W_Kr> eTCSWKr;

	/**
	 * The cached value of the '{@link #getEVModul() <em>EV Modul</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModul()
	 * @generated
	 * @ordered
	 */
	protected EList<EV_Modul> eVModul;

	/**
	 * The cached value of the '{@link #getFachtelegramm() <em>Fachtelegramm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<Fachtelegramm> fachtelegramm;

	/**
	 * The cached value of the '{@link #getFlaFreimeldeZuordnung() <em>Fla Freimelde Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaFreimeldeZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Fla_Freimelde_Zuordnung> flaFreimeldeZuordnung;

	/**
	 * The cached value of the '{@link #getFlaSchutz() <em>Fla Schutz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSchutz()
	 * @generated
	 * @ordered
	 */
	protected EList<Fla_Schutz> flaSchutz;

	/**
	 * The cached value of the '{@link #getFlaZwieschutz() <em>Fla Zwieschutz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaZwieschutz()
	 * @generated
	 * @ordered
	 */
	protected EList<Fla_Zwieschutz> flaZwieschutz;

	/**
	 * The cached value of the '{@link #getFMAAnlage() <em>FMA Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<FMA_Anlage> fMAAnlage;

	/**
	 * The cached value of the '{@link #getFMAElement() <em>FMA Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElement()
	 * @generated
	 * @ordered
	 */
	protected EList<FMA_Element> fMAElement;

	/**
	 * The cached value of the '{@link #getFMAKomponente() <em>FMA Komponente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponente()
	 * @generated
	 * @ordered
	 */
	protected EList<FMA_Komponente> fMAKomponente;

	/**
	 * The cached value of the '{@link #getFstrAbhaengigkeit() <em>Fstr Abhaengigkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAbhaengigkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Abhaengigkeit> fstrAbhaengigkeit;

	/**
	 * The cached value of the '{@link #getFstrAneinander() <em>Fstr Aneinander</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAneinander()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Aneinander> fstrAneinander;

	/**
	 * The cached value of the '{@link #getFstrAneinanderZuordnung() <em>Fstr Aneinander Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAneinanderZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Aneinander_Zuordnung> fstrAneinanderZuordnung;

	/**
	 * The cached value of the '{@link #getFstrDWeg() <em>Fstr DWeg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_DWeg> fstrDWeg;

	/**
	 * The cached value of the '{@link #getFstrDWegWKr() <em>Fstr DWeg WKr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegWKr()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_DWeg_W_Kr> fstrDWegWKr;

	/**
	 * The cached value of the '{@link #getFstrFahrweg() <em>Fstr Fahrweg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Fahrweg> fstrFahrweg;

	/**
	 * The cached value of the '{@link #getFstrNichthaltfall() <em>Fstr Nichthaltfall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrNichthaltfall()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Nichthaltfall> fstrNichthaltfall;

	/**
	 * The cached value of the '{@link #getFstrRangierFlaZuordnung() <em>Fstr Rangier Fla Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrRangierFlaZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Rangier_Fla_Zuordnung> fstrRangierFlaZuordnung;

	/**
	 * The cached value of the '{@link #getFstrSignalisierung() <em>Fstr Signalisierung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrSignalisierung()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Signalisierung> fstrSignalisierung;

	/**
	 * The cached value of the '{@link #getFstrUmfahrpunkt() <em>Fstr Umfahrpunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrUmfahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Umfahrpunkt> fstrUmfahrpunkt;

	/**
	 * The cached value of the '{@link #getFstrZugRangier() <em>Fstr Zug Rangier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Zug_Rangier> fstrZugRangier;

	/**
	 * The cached value of the '{@link #getFTAnschaltbedingung() <em>FT Anschaltbedingung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTAnschaltbedingung()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_Anschaltbedingung> fTAnschaltbedingung;

	/**
	 * The cached value of the '{@link #getFTFahrwegTeil() <em>FT Fahrweg Teil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTFahrwegTeil()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_Fahrweg_Teil> fTFahrwegTeil;

	/**
	 * The cached value of the '{@link #getGEOKante() <em>GEO Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKante()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Kante> gEOKante;

	/**
	 * The cached value of the '{@link #getGEOKnoten() <em>GEO Knoten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKnoten()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Knoten> gEOKnoten;

	/**
	 * The cached value of the '{@link #getGEOPunkt() <em>GEO Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Punkt> gEOPunkt;

	/**
	 * The cached value of the '{@link #getGeschwindigkeitsprofil() <em>Geschwindigkeitsprofil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeitsprofil()
	 * @generated
	 * @ordered
	 */
	protected EList<Geschwindigkeitsprofil> geschwindigkeitsprofil;

	/**
	 * The cached value of the '{@link #getGFRAnlage() <em>GFR Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<GFR_Anlage> gFRAnlage;

	/**
	 * The cached value of the '{@link #getGFRElement() <em>GFR Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GFR_Element> gFRElement;

	/**
	 * The cached value of the '{@link #getGFRTripelspiegel() <em>GFR Tripelspiegel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRTripelspiegel()
	 * @generated
	 * @ordered
	 */
	protected EList<GFR_Tripelspiegel> gFRTripelspiegel;

	/**
	 * The cached value of the '{@link #getGleisAbschluss() <em>Gleis Abschluss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisAbschluss()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Abschluss> gleisAbschluss;

	/**
	 * The cached value of the '{@link #getGleisAbschnitt() <em>Gleis Abschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Abschnitt> gleisAbschnitt;

	/**
	 * The cached value of the '{@link #getGleisArt() <em>Gleis Art</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisArt()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Art> gleisArt;

	/**
	 * The cached value of the '{@link #getGleisBaubereich() <em>Gleis Baubereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisBaubereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Baubereich> gleisBaubereich;

	/**
	 * The cached value of the '{@link #getGleisBezeichnung() <em>Gleis Bezeichnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Bezeichnung> gleisBezeichnung;

	/**
	 * The cached value of the '{@link #getGleisFahrbahn() <em>Gleis Fahrbahn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisFahrbahn()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Fahrbahn> gleisFahrbahn;

	/**
	 * The cached value of the '{@link #getGleisLichtraum() <em>Gleis Lichtraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisLichtraum()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Lichtraum> gleisLichtraum;

	/**
	 * The cached value of the '{@link #getGleisSchaltgruppe() <em>Gleis Schaltgruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisSchaltgruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Schaltgruppe> gleisSchaltgruppe;

	/**
	 * The cached value of the '{@link #getHoehenlinie() <em>Hoehenlinie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenlinie()
	 * @generated
	 * @ordered
	 */
	protected EList<Hoehenlinie> hoehenlinie;

	/**
	 * The cached value of the '{@link #getHoehenpunkt() <em>Hoehenpunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenpunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Hoehenpunkt> hoehenpunkt;

	/**
	 * The cached value of the '{@link #getKabel() <em>Kabel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Kabel> kabel;

	/**
	 * The cached value of the '{@link #getKabelVerteilpunkt() <em>Kabel Verteilpunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelVerteilpunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Kabel_Verteilpunkt> kabelVerteilpunkt;

	/**
	 * The cached value of the '{@link #getLEUAnlage() <em>LEU Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Anlage> lEUAnlage;

	/**
	 * The cached value of the '{@link #getLEUModul() <em>LEU Modul</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModul()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Modul> lEUModul;

	/**
	 * The cached value of the '{@link #getLEUSchaltkasten() <em>LEU Schaltkasten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUSchaltkasten()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Schaltkasten> lEUSchaltkasten;

	/**
	 * The cached value of the '{@link #getLieferobjekt() <em>Lieferobjekt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieferobjekt()
	 * @generated
	 * @ordered
	 */
	protected EList<Lieferobjekt> lieferobjekt;

	/**
	 * The cached value of the '{@link #getLuftTelegramm() <em>Luft Telegramm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuftTelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<Luft_Telegramm> luftTelegramm;

	/**
	 * The cached value of the '{@link #getMarkanterPunkt() <em>Markanter Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Markanter_Punkt> markanterPunkt;

	/**
	 * The cached value of the '{@link #getNB() <em>NB</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNB()
	 * @generated
	 * @ordered
	 */
	protected EList<NB> nB;

	/**
	 * The cached value of the '{@link #getNBBedienAnzeigeElement() <em>NB Bedien Anzeige Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NB_Bedien_Anzeige_Element> nBBedienAnzeigeElement;

	/**
	 * The cached value of the '{@link #getNBZone() <em>NB Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZone()
	 * @generated
	 * @ordered
	 */
	protected EList<NB_Zone> nBZone;

	/**
	 * The cached value of the '{@link #getNBZoneElement() <em>NB Zone Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NB_Zone_Element> nBZoneElement;

	/**
	 * The cached value of the '{@link #getNBZoneGrenze() <em>NB Zone Grenze</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneGrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<NB_Zone_Grenze> nBZoneGrenze;

	/**
	 * The cached value of the '{@link #getOertlichkeit() <em>Oertlichkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<Oertlichkeit> oertlichkeit;

	/**
	 * The cached value of the '{@link #getProgDateiGruppe() <em>Prog Datei Gruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgDateiGruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<Prog_Datei_Gruppe> progDateiGruppe;

	/**
	 * The cached value of the '{@link #getProxyObjekt() <em>Proxy Objekt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyObjekt()
	 * @generated
	 * @ordered
	 */
	protected EList<Proxy_Objekt> proxyObjekt;

	/**
	 * The cached value of the '{@link #getPZBElement() <em>PZB Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PZB_Element> pZBElement;

	/**
	 * The cached value of the '{@link #getPZBElementZuordnung() <em>PZB Element Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<PZB_Element_Zuordnung> pZBElementZuordnung;

	/**
	 * The cached value of the '{@link #getPZBZuordnungSignal() <em>PZB Zuordnung Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBZuordnungSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<PZB_Zuordnung_Signal> pZBZuordnungSignal;

	/**
	 * The cached value of the '{@link #getRBC() <em>RBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<RBC> rBC;

	/**
	 * The cached value of the '{@link #getRegelzeichnung() <em>Regelzeichnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Regelzeichnung> regelzeichnung;

	/**
	 * The cached value of the '{@link #getRegelzeichnungParameter() <em>Regelzeichnung Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelzeichnungParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Regelzeichnung_Parameter> regelzeichnungParameter;

	/**
	 * The cached value of the '{@link #getSchaltmittelFstrZuordnung() <em>Schaltmittel Fstr Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltmittelFstrZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Schaltmittel_Fstr_Zuordnung> schaltmittelFstrZuordnung;

	/**
	 * The cached value of the '{@link #getSchaltmittelZuordnung() <em>Schaltmittel Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltmittelZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Schaltmittel_Zuordnung> schaltmittelZuordnung;

	/**
	 * The cached value of the '{@link #getSchloss() <em>Schloss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchloss()
	 * @generated
	 * @ordered
	 */
	protected EList<Schloss> schloss;

	/**
	 * The cached value of the '{@link #getSchlosskombination() <em>Schlosskombination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlosskombination()
	 * @generated
	 * @ordered
	 */
	protected EList<Schlosskombination> schlosskombination;

	/**
	 * The cached value of the '{@link #getSchluessel() <em>Schluessel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluessel()
	 * @generated
	 * @ordered
	 */
	protected EList<Schluessel> schluessel;

	/**
	 * The cached value of the '{@link #getSchluesselsperre() <em>Schluesselsperre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselsperre()
	 * @generated
	 * @ordered
	 */
	protected EList<Schluesselsperre> schluesselsperre;

	/**
	 * The cached value of the '{@link #getSchrankenantrieb() <em>Schrankenantrieb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchrankenantrieb()
	 * @generated
	 * @ordered
	 */
	protected EList<Schrankenantrieb> schrankenantrieb;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signal;

	/**
	 * The cached value of the '{@link #getSignalBefestigung() <em>Signal Befestigung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalBefestigung()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal_Befestigung> signalBefestigung;

	/**
	 * The cached value of the '{@link #getSignalFankZuordnung() <em>Signal Fank Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFankZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal_Fank_Zuordnung> signalFankZuordnung;

	/**
	 * The cached value of the '{@link #getSignalRahmen() <em>Signal Rahmen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRahmen()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal_Rahmen> signalRahmen;

	/**
	 * The cached value of the '{@link #getSignalSignalbegriff() <em>Signal Signalbegriff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalSignalbegriff()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal_Signalbegriff> signalSignalbegriff;

	/**
	 * The cached value of the '{@link #getSonstigerPunkt() <em>Sonstiger Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigerPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Sonstiger_Punkt> sonstigerPunkt;

	/**
	 * The cached value of the '{@link #getStellBereich() <em>Stell Bereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStellBereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Stell_Bereich> stellBereich;

	/**
	 * The cached value of the '{@link #getStellelement() <em>Stellelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStellelement()
	 * @generated
	 * @ordered
	 */
	protected EList<Stellelement> stellelement;

	/**
	 * The cached value of the '{@link #getStrecke() <em>Strecke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrecke()
	 * @generated
	 * @ordered
	 */
	protected EList<Strecke> strecke;

	/**
	 * The cached value of the '{@link #getStreckeBremsweg() <em>Strecke Bremsweg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeBremsweg()
	 * @generated
	 * @ordered
	 */
	protected EList<Strecke_Bremsweg> streckeBremsweg;

	/**
	 * The cached value of the '{@link #getStreckePunkt() <em>Strecke Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckePunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Strecke_Punkt> streckePunkt;

	/**
	 * The cached value of the '{@link #getTechnikStandort() <em>Technik Standort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnikStandort()
	 * @generated
	 * @ordered
	 */
	protected EList<Technik_Standort> technikStandort;

	/**
	 * The cached value of the '{@link #getTechnischerBereich() <em>Technischer Bereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnischerBereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Technischer_Bereich> technischerBereich;

	/**
	 * The cached value of the '{@link #getTechnischerPunkt() <em>Technischer Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnischerPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Technischer_Punkt> technischerPunkt;

	/**
	 * The cached value of the '{@link #getTOPKante() <em>TOP Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPKante()
	 * @generated
	 * @ordered
	 */
	protected EList<TOP_Kante> tOPKante;

	/**
	 * The cached value of the '{@link #getTOPKnoten() <em>TOP Knoten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPKnoten()
	 * @generated
	 * @ordered
	 */
	protected EList<TOP_Knoten> tOPKnoten;

	/**
	 * The cached value of the '{@link #getTrasseKante() <em>Trasse Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseKante()
	 * @generated
	 * @ordered
	 */
	protected EList<Trasse_Kante> trasseKante;

	/**
	 * The cached value of the '{@link #getTrasseKnoten() <em>Trasse Knoten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseKnoten()
	 * @generated
	 * @ordered
	 */
	protected EList<Trasse_Knoten> trasseKnoten;

	/**
	 * The cached value of the '{@link #getUeberhoehung() <em>Ueberhoehung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehung()
	 * @generated
	 * @ordered
	 */
	protected EList<Ueberhoehung> ueberhoehung;

	/**
	 * The cached value of the '{@link #getUeberhoehungslinie() <em>Ueberhoehungslinie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungslinie()
	 * @generated
	 * @ordered
	 */
	protected EList<Ueberhoehungslinie> ueberhoehungslinie;

	/**
	 * The cached value of the '{@link #getUebertragungsweg() <em>Uebertragungsweg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungsweg()
	 * @generated
	 * @ordered
	 */
	protected EList<Uebertragungsweg> uebertragungsweg;

	/**
	 * The cached value of the '{@link #getUnterbringung() <em>Unterbringung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected EList<Unterbringung> unterbringung;

	/**
	 * The cached value of the '{@link #getVerkehrszeichen() <em>Verkehrszeichen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichen()
	 * @generated
	 * @ordered
	 */
	protected EList<Verkehrszeichen> verkehrszeichen;

	/**
	 * The cached value of the '{@link #getWKrAnlage() <em>WKr Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<W_Kr_Anlage> wKrAnlage;

	/**
	 * The cached value of the '{@link #getWKrGspElement() <em>WKr Gsp Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGspElement()
	 * @generated
	 * @ordered
	 */
	protected EList<W_Kr_Gsp_Element> wKrGspElement;

	/**
	 * The cached value of the '{@link #getWKrGspKomponente() <em>WKr Gsp Komponente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGspKomponente()
	 * @generated
	 * @ordered
	 */
	protected EList<W_Kr_Gsp_Komponente> wKrGspKomponente;

	/**
	 * The cached value of the '{@link #getWeichenlaufkette() <em>Weichenlaufkette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeichenlaufkette()
	 * @generated
	 * @ordered
	 */
	protected EList<Weichenlaufkette> weichenlaufkette;

	/**
	 * The cached value of the '{@link #getWeichenlaufketteZuordnung() <em>Weichenlaufkette Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeichenlaufketteZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Weichenlaufkette_Zuordnung> weichenlaufketteZuordnung;

	/**
	 * The cached value of the '{@link #getZBSSchutzstrecke() <em>ZBS Schutzstrecke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSchutzstrecke()
	 * @generated
	 * @ordered
	 */
	protected EList<ZBS_Schutzstrecke> zBSSchutzstrecke;

	/**
	 * The cached value of the '{@link #getZBSSignal() <em>ZBS Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<ZBS_Signal> zBSSignal;

	/**
	 * The cached value of the '{@link #getZL() <em>ZL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZL()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL> zL;

	/**
	 * The cached value of the '{@link #getZLDLPAbschnitt() <em>ZLDLP Abschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLDLPAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_DLP_Abschnitt> zLDLPAbschnitt;

	/**
	 * The cached value of the '{@link #getZLDLPFstr() <em>ZLDLP Fstr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLDLPFstr()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_DLP_Fstr> zLDLPFstr;

	/**
	 * The cached value of the '{@link #getZLFstr() <em>ZL Fstr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstr()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Fstr> zLFstr;

	/**
	 * The cached value of the '{@link #getZLFstrAnstoss() <em>ZL Fstr Anstoss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAnstoss()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Fstr_Anstoss> zLFstrAnstoss;

	/**
	 * The cached value of the '{@link #getZLSignalgruppe() <em>ZL Signalgruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLSignalgruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Signalgruppe> zLSignalgruppe;

	/**
	 * The cached value of the '{@link #getZLSignalgruppeZuordnung() <em>ZL Signalgruppe Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLSignalgruppeZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Signalgruppe_Zuordnung> zLSignalgruppeZuordnung;

	/**
	 * The cached value of the '{@link #getZLVBus() <em>ZLV Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBus()
	 * @generated
	 * @ordered
	 */
	protected EList<ZLV_Bus> zLVBus;

	/**
	 * The cached value of the '{@link #getZLVBusBesondereAnlage() <em>ZLV Bus Besondere Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusBesondereAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<ZLV_Bus_Besondere_Anlage> zLVBusBesondereAnlage;

	/**
	 * The cached value of the '{@link #getZLVBusUSZuordnung() <em>ZLV Bus US Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusUSZuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<ZLV_Bus_US_Zuordnung> zLVBusUSZuordnung;

	/**
	 * The cached value of the '{@link #getZN() <em>ZN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZN()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN> zN;

	/**
	 * The cached value of the '{@link #getZNAkustik() <em>ZN Akustik</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAkustik()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Akustik> zNAkustik;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeld() <em>ZN Anzeigefeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Anzeigefeld> zNAnzeigefeld;

	/**
	 * The cached value of the '{@link #getZNFortschaltKriterium() <em>ZN Fortschalt Kriterium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFortschaltKriterium()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Fortschalt_Kriterium> zNFortschaltKriterium;

	/**
	 * The cached value of the '{@link #getZNTelegramm84Zuordnung() <em>ZN Telegramm84 Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNTelegramm84Zuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Telegramm_84_Zuordnung> zNTelegramm84Zuordnung;

	/**
	 * The cached value of the '{@link #getZNTelegramm85Zuordnung() <em>ZN Telegramm85 Zuordnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNTelegramm85Zuordnung()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Telegramm_85_Zuordnung> zNTelegramm85Zuordnung;

	/**
	 * The cached value of the '{@link #getZNUnterstation() <em>ZN Unterstation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNUnterstation()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Unterstation> zNUnterstation;

	/**
	 * The cached value of the '{@link #getZNZBS() <em>ZNZBS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNZBS()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_ZBS> zNZBS;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenze() <em>ZUB Bereichsgrenze</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze> zUBBereichsgrenze;

	/**
	 * The cached value of the '{@link #getZUBStreckeneigenschaft() <em>ZUB Streckeneigenschaft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBStreckeneigenschaft()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Streckeneigenschaft> zUBStreckeneigenschaft;

	/**
	 * The cached value of the '{@link #getZugeinwirkung() <em>Zugeinwirkung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugeinwirkung()
	 * @generated
	 * @ordered
	 */
	protected EList<Zugeinwirkung> zugeinwirkung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getContainer_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhang() {
		if (anhang == null) {
			anhang = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG);
		}
		return anhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATO_Segment_Profile> getATOSegmentProfile() {
		if (aTOSegmentProfile == null) {
			aTOSegmentProfile = new EObjectContainmentEList<ATO_Segment_Profile>(ATO_Segment_Profile.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE);
		}
		return aTOSegmentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATO_Timing_Point> getATOTimingPoint() {
		if (aTOTimingPoint == null) {
			aTOTimingPoint = new EObjectContainmentEList<ATO_Timing_Point>(ATO_Timing_Point.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT);
		}
		return aTOTimingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATO_TS_Instanz> getATOTSInstanz() {
		if (aTOTSInstanz == null) {
			aTOTSInstanz = new EObjectContainmentEList<ATO_TS_Instanz>(ATO_TS_Instanz.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ);
		}
		return aTOTSInstanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aussenelementansteuerung> getAussenelementansteuerung() {
		if (aussenelementansteuerung == null) {
			aussenelementansteuerung = new EObjectContainmentEList<Aussenelementansteuerung>(Aussenelementansteuerung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG);
		}
		return aussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bahnsteig_Anlage> getBahnsteigAnlage() {
		if (bahnsteigAnlage == null) {
			bahnsteigAnlage = new EObjectContainmentEList<Bahnsteig_Anlage>(Bahnsteig_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE);
		}
		return bahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bahnsteig_Dach> getBahnsteigDach() {
		if (bahnsteigDach == null) {
			bahnsteigDach = new EObjectContainmentEList<Bahnsteig_Dach>(Bahnsteig_Dach.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH);
		}
		return bahnsteigDach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bahnsteig_Kante> getBahnsteigKante() {
		if (bahnsteigKante == null) {
			bahnsteigKante = new EObjectContainmentEList<Bahnsteig_Kante>(Bahnsteig_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE);
		}
		return bahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bahnsteig_Zugang> getBahnsteigZugang() {
		if (bahnsteigZugang == null) {
			bahnsteigZugang = new EObjectContainmentEList<Bahnsteig_Zugang>(Bahnsteig_Zugang.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG);
		}
		return bahnsteigZugang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Balise> getBalise() {
		if (balise == null) {
			balise = new EObjectContainmentEList<Balise>(Balise.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE);
		}
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bearbeitungsvermerk> getBearbeitungsvermerk() {
		if (bearbeitungsvermerk == null) {
			bearbeitungsvermerk = new EObjectContainmentEList<Bearbeitungsvermerk>(Bearbeitungsvermerk.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK);
		}
		return bearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Anrueckabschnitt> getBedienAnrueckabschnitt() {
		if (bedienAnrueckabschnitt == null) {
			bedienAnrueckabschnitt = new EObjectContainmentEList<Bedien_Anrueckabschnitt>(Bedien_Anrueckabschnitt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT);
		}
		return bedienAnrueckabschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Anzeige_Element> getBedienAnzeigeElement() {
		if (bedienAnzeigeElement == null) {
			bedienAnzeigeElement = new EObjectContainmentEList<Bedien_Anzeige_Element>(Bedien_Anzeige_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT);
		}
		return bedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Bezirk> getBedienBezirk() {
		if (bedienBezirk == null) {
			bedienBezirk = new EObjectContainmentEList<Bedien_Bezirk>(Bedien_Bezirk.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK);
		}
		return bedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Einrichtung_Oertlich> getBedienEinrichtungOertlich() {
		if (bedienEinrichtungOertlich == null) {
			bedienEinrichtungOertlich = new EObjectContainmentEList<Bedien_Einrichtung_Oertlich>(Bedien_Einrichtung_Oertlich.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH);
		}
		return bedienEinrichtungOertlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_GBT> getBedienGBT() {
		if (bedienGBT == null) {
			bedienGBT = new EObjectContainmentEList<Bedien_GBT>(Bedien_GBT.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT);
		}
		return bedienGBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Oberflaeche> getBedienOberflaeche() {
		if (bedienOberflaeche == null) {
			bedienOberflaeche = new EObjectContainmentEList<Bedien_Oberflaeche>(Bedien_Oberflaeche.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE);
		}
		return bedienOberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Oberflaeche_Bild> getBedienOberflaecheBild() {
		if (bedienOberflaecheBild == null) {
			bedienOberflaecheBild = new EObjectContainmentEList<Bedien_Oberflaeche_Bild>(Bedien_Oberflaeche_Bild.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD);
		}
		return bedienOberflaecheBild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Oertlichkeit> getBedienOertlichkeit() {
		if (bedienOertlichkeit == null) {
			bedienOertlichkeit = new EObjectContainmentEList<Bedien_Oertlichkeit>(Bedien_Oertlichkeit.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT);
		}
		return bedienOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Platz> getBedienPlatz() {
		if (bedienPlatz == null) {
			bedienPlatz = new EObjectContainmentEList<Bedien_Platz>(Bedien_Platz.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ);
		}
		return bedienPlatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Standort> getBedienStandort() {
		if (bedienStandort == null) {
			bedienStandort = new EObjectContainmentEList<Bedien_Standort>(Bedien_Standort.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT);
		}
		return bedienStandort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Zentrale> getBedienZentrale() {
		if (bedienZentrale == null) {
			bedienZentrale = new EObjectContainmentEList<Bedien_Zentrale>(Bedien_Zentrale.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE);
		}
		return bedienZentrale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binaerdaten> getBinaerdaten() {
		if (binaerdaten == null) {
			binaerdaten = new EObjectContainmentEList<Binaerdaten>(Binaerdaten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN);
		}
		return binaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block_Anlage> getBlockAnlage() {
		if (blockAnlage == null) {
			blockAnlage = new EObjectContainmentEList<Block_Anlage>(Block_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE);
		}
		return blockAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block_Element> getBlockElement() {
		if (blockElement == null) {
			blockElement = new EObjectContainmentEList<Block_Element>(Block_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT);
		}
		return blockElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block_Strecke> getBlockStrecke() {
		if (blockStrecke == null) {
			blockStrecke = new EObjectContainmentEList<Block_Strecke>(Block_Strecke.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE);
		}
		return blockStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Anlage> getBUEAnlage() {
		if (bUEAnlage == null) {
			bUEAnlage = new EObjectContainmentEList<BUE_Anlage>(BUE_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE);
		}
		return bUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Anlage_Strasse> getBUEAnlageStrasse() {
		if (bUEAnlageStrasse == null) {
			bUEAnlageStrasse = new EObjectContainmentEList<BUE_Anlage_Strasse>(BUE_Anlage_Strasse.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE);
		}
		return bUEAnlageStrasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Anlage_V> getBUEAnlageV() {
		if (bUEAnlageV == null) {
			bUEAnlageV = new EObjectContainmentEList<BUE_Anlage_V>(BUE_Anlage_V.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V);
		}
		return bUEAnlageV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Ausschaltung> getBUEAusschaltung() {
		if (bUEAusschaltung == null) {
			bUEAusschaltung = new EObjectContainmentEList<BUE_Ausschaltung>(BUE_Ausschaltung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG);
		}
		return bUEAusschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Bedien_Anzeige_Element> getBUEBedienAnzeigeElement() {
		if (bUEBedienAnzeigeElement == null) {
			bUEBedienAnzeigeElement = new EObjectContainmentEList<BUE_Bedien_Anzeige_Element>(BUE_Bedien_Anzeige_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT);
		}
		return bUEBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Deckendes_Signal_Zuordnung> getBUEDeckendesSignalZuordnung() {
		if (bUEDeckendesSignalZuordnung == null) {
			bUEDeckendesSignalZuordnung = new EObjectContainmentEList<BUE_Deckendes_Signal_Zuordnung>(BUE_Deckendes_Signal_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG);
		}
		return bUEDeckendesSignalZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Einschaltung> getBUEEinschaltung() {
		if (bUEEinschaltung == null) {
			bUEEinschaltung = new EObjectContainmentEList<BUE_Einschaltung>(BUE_Einschaltung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG);
		}
		return bUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Einschaltung_Zuordnung> getBUEEinschaltungZuordnung() {
		if (bUEEinschaltungZuordnung == null) {
			bUEEinschaltungZuordnung = new EObjectContainmentEList<BUE_Einschaltung_Zuordnung>(BUE_Einschaltung_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG);
		}
		return bUEEinschaltungZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Gefahrraum_Eckpunkt> getBUEGefahrraumEckpunkt() {
		if (bUEGefahrraumEckpunkt == null) {
			bUEGefahrraumEckpunkt = new EObjectContainmentEList<BUE_Gefahrraum_Eckpunkt>(BUE_Gefahrraum_Eckpunkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT);
		}
		return bUEGefahrraumEckpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Gleisbezogener_Gefahrraum> getBUEGleisbezogenerGefahrraum() {
		if (bUEGleisbezogenerGefahrraum == null) {
			bUEGleisbezogenerGefahrraum = new EObjectContainmentEList<BUE_Gleisbezogener_Gefahrraum>(BUE_Gleisbezogener_Gefahrraum.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM);
		}
		return bUEGleisbezogenerGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Kante> getBUEKante() {
		if (bUEKante == null) {
			bUEKante = new EObjectContainmentEList<BUE_Kante>(BUE_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE);
		}
		return bUEKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Kreuzungsplan> getBUEKreuzungsplan() {
		if (bUEKreuzungsplan == null) {
			bUEKreuzungsplan = new EObjectContainmentEList<BUE_Kreuzungsplan>(BUE_Kreuzungsplan.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN);
		}
		return bUEKreuzungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Schnittstelle> getBUESchnittstelle() {
		if (bUESchnittstelle == null) {
			bUESchnittstelle = new EObjectContainmentEList<BUE_Schnittstelle>(BUE_Schnittstelle.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE);
		}
		return bUESchnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Spezifisches_Signal> getBUESpezifischesSignal() {
		if (bUESpezifischesSignal == null) {
			bUESpezifischesSignal = new EObjectContainmentEList<BUE_Spezifisches_Signal>(BUE_Spezifisches_Signal.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL);
		}
		return bUESpezifischesSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_WS_Fstr_Zuordnung> getBUEWSFstrZuordnung() {
		if (bUEWSFstrZuordnung == null) {
			bUEWSFstrZuordnung = new EObjectContainmentEList<BUE_WS_Fstr_Zuordnung>(BUE_WS_Fstr_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG);
		}
		return bUEWSFstrZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Datenpunkt> getDatenpunkt() {
		if (datenpunkt == null) {
			datenpunkt = new EObjectContainmentEList<Datenpunkt>(Datenpunkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT);
		}
		return datenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Datenpunkt_Link> getDatenpunktLink() {
		if (datenpunktLink == null) {
			datenpunktLink = new EObjectContainmentEList<Datenpunkt_Link>(Datenpunkt_Link.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK);
		}
		return datenpunktLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESTW_Zentraleinheit> getESTWZentraleinheit() {
		if (eSTWZentraleinheit == null) {
			eSTWZentraleinheit = new EObjectContainmentEList<ESTW_Zentraleinheit>(ESTW_Zentraleinheit.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT);
		}
		return eSTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETCS_Kante> getETCSKante() {
		if (eTCSKante == null) {
			eTCSKante = new EObjectContainmentEList<ETCS_Kante>(ETCS_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE);
		}
		return eTCSKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETCS_Knoten> getETCSKnoten() {
		if (eTCSKnoten == null) {
			eTCSKnoten = new EObjectContainmentEList<ETCS_Knoten>(ETCS_Knoten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN);
		}
		return eTCSKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETCS_Richtungsanzeige> getETCSRichtungsanzeige() {
		if (eTCSRichtungsanzeige == null) {
			eTCSRichtungsanzeige = new EObjectContainmentEList<ETCS_Richtungsanzeige>(ETCS_Richtungsanzeige.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE);
		}
		return eTCSRichtungsanzeige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETCS_Signal> getETCSSignal() {
		if (eTCSSignal == null) {
			eTCSSignal = new EObjectContainmentEList<ETCS_Signal>(ETCS_Signal.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL);
		}
		return eTCSSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETCS_W_Kr> getETCSWKr() {
		if (eTCSWKr == null) {
			eTCSWKr = new EObjectContainmentEList<ETCS_W_Kr>(ETCS_W_Kr.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR);
		}
		return eTCSWKr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EV_Modul> getEVModul() {
		if (eVModul == null) {
			eVModul = new EObjectContainmentEList<EV_Modul>(EV_Modul.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL);
		}
		return eVModul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fachtelegramm> getFachtelegramm() {
		if (fachtelegramm == null) {
			fachtelegramm = new EObjectContainmentEList<Fachtelegramm>(Fachtelegramm.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM);
		}
		return fachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fla_Freimelde_Zuordnung> getFlaFreimeldeZuordnung() {
		if (flaFreimeldeZuordnung == null) {
			flaFreimeldeZuordnung = new EObjectContainmentEList<Fla_Freimelde_Zuordnung>(Fla_Freimelde_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG);
		}
		return flaFreimeldeZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fla_Schutz> getFlaSchutz() {
		if (flaSchutz == null) {
			flaSchutz = new EObjectContainmentEList<Fla_Schutz>(Fla_Schutz.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ);
		}
		return flaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fla_Zwieschutz> getFlaZwieschutz() {
		if (flaZwieschutz == null) {
			flaZwieschutz = new EObjectContainmentEList<Fla_Zwieschutz>(Fla_Zwieschutz.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ);
		}
		return flaZwieschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMA_Anlage> getFMAAnlage() {
		if (fMAAnlage == null) {
			fMAAnlage = new EObjectContainmentEList<FMA_Anlage>(FMA_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE);
		}
		return fMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMA_Element> getFMAElement() {
		if (fMAElement == null) {
			fMAElement = new EObjectContainmentEList<FMA_Element>(FMA_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT);
		}
		return fMAElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMA_Komponente> getFMAKomponente() {
		if (fMAKomponente == null) {
			fMAKomponente = new EObjectContainmentEList<FMA_Komponente>(FMA_Komponente.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE);
		}
		return fMAKomponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Abhaengigkeit> getFstrAbhaengigkeit() {
		if (fstrAbhaengigkeit == null) {
			fstrAbhaengigkeit = new EObjectContainmentEList<Fstr_Abhaengigkeit>(Fstr_Abhaengigkeit.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT);
		}
		return fstrAbhaengigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Aneinander> getFstrAneinander() {
		if (fstrAneinander == null) {
			fstrAneinander = new EObjectContainmentEList<Fstr_Aneinander>(Fstr_Aneinander.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER);
		}
		return fstrAneinander;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Aneinander_Zuordnung> getFstrAneinanderZuordnung() {
		if (fstrAneinanderZuordnung == null) {
			fstrAneinanderZuordnung = new EObjectContainmentEList<Fstr_Aneinander_Zuordnung>(Fstr_Aneinander_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG);
		}
		return fstrAneinanderZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_DWeg> getFstrDWeg() {
		if (fstrDWeg == null) {
			fstrDWeg = new EObjectContainmentEList<Fstr_DWeg>(Fstr_DWeg.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG);
		}
		return fstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_DWeg_W_Kr> getFstrDWegWKr() {
		if (fstrDWegWKr == null) {
			fstrDWegWKr = new EObjectContainmentEList<Fstr_DWeg_W_Kr>(Fstr_DWeg_W_Kr.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR);
		}
		return fstrDWegWKr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Fahrweg> getFstrFahrweg() {
		if (fstrFahrweg == null) {
			fstrFahrweg = new EObjectContainmentEList<Fstr_Fahrweg>(Fstr_Fahrweg.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG);
		}
		return fstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Nichthaltfall> getFstrNichthaltfall() {
		if (fstrNichthaltfall == null) {
			fstrNichthaltfall = new EObjectContainmentEList<Fstr_Nichthaltfall>(Fstr_Nichthaltfall.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL);
		}
		return fstrNichthaltfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Rangier_Fla_Zuordnung> getFstrRangierFlaZuordnung() {
		if (fstrRangierFlaZuordnung == null) {
			fstrRangierFlaZuordnung = new EObjectContainmentEList<Fstr_Rangier_Fla_Zuordnung>(Fstr_Rangier_Fla_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG);
		}
		return fstrRangierFlaZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Signalisierung> getFstrSignalisierung() {
		if (fstrSignalisierung == null) {
			fstrSignalisierung = new EObjectContainmentEList<Fstr_Signalisierung>(Fstr_Signalisierung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG);
		}
		return fstrSignalisierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Umfahrpunkt> getFstrUmfahrpunkt() {
		if (fstrUmfahrpunkt == null) {
			fstrUmfahrpunkt = new EObjectContainmentEList<Fstr_Umfahrpunkt>(Fstr_Umfahrpunkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT);
		}
		return fstrUmfahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Zug_Rangier> getFstrZugRangier() {
		if (fstrZugRangier == null) {
			fstrZugRangier = new EObjectContainmentEList<Fstr_Zug_Rangier>(Fstr_Zug_Rangier.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER);
		}
		return fstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_Anschaltbedingung> getFTAnschaltbedingung() {
		if (fTAnschaltbedingung == null) {
			fTAnschaltbedingung = new EObjectContainmentEList<FT_Anschaltbedingung>(FT_Anschaltbedingung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG);
		}
		return fTAnschaltbedingung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_Fahrweg_Teil> getFTFahrwegTeil() {
		if (fTFahrwegTeil == null) {
			fTFahrwegTeil = new EObjectContainmentEList<FT_Fahrweg_Teil>(FT_Fahrweg_Teil.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL);
		}
		return fTFahrwegTeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Kante> getGEOKante() {
		if (gEOKante == null) {
			gEOKante = new EObjectContainmentEList<GEO_Kante>(GEO_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE);
		}
		return gEOKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Knoten> getGEOKnoten() {
		if (gEOKnoten == null) {
			gEOKnoten = new EObjectContainmentEList<GEO_Knoten>(GEO_Knoten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN);
		}
		return gEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Punkt> getGEOPunkt() {
		if (gEOPunkt == null) {
			gEOPunkt = new EObjectContainmentEList<GEO_Punkt>(GEO_Punkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT);
		}
		return gEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Geschwindigkeitsprofil> getGeschwindigkeitsprofil() {
		if (geschwindigkeitsprofil == null) {
			geschwindigkeitsprofil = new EObjectContainmentEList<Geschwindigkeitsprofil>(Geschwindigkeitsprofil.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL);
		}
		return geschwindigkeitsprofil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GFR_Anlage> getGFRAnlage() {
		if (gFRAnlage == null) {
			gFRAnlage = new EObjectContainmentEList<GFR_Anlage>(GFR_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE);
		}
		return gFRAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GFR_Element> getGFRElement() {
		if (gFRElement == null) {
			gFRElement = new EObjectContainmentEList<GFR_Element>(GFR_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT);
		}
		return gFRElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GFR_Tripelspiegel> getGFRTripelspiegel() {
		if (gFRTripelspiegel == null) {
			gFRTripelspiegel = new EObjectContainmentEList<GFR_Tripelspiegel>(GFR_Tripelspiegel.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL);
		}
		return gFRTripelspiegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Abschluss> getGleisAbschluss() {
		if (gleisAbschluss == null) {
			gleisAbschluss = new EObjectContainmentEList<Gleis_Abschluss>(Gleis_Abschluss.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS);
		}
		return gleisAbschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Abschnitt> getGleisAbschnitt() {
		if (gleisAbschnitt == null) {
			gleisAbschnitt = new EObjectContainmentEList<Gleis_Abschnitt>(Gleis_Abschnitt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT);
		}
		return gleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Art> getGleisArt() {
		if (gleisArt == null) {
			gleisArt = new EObjectContainmentEList<Gleis_Art>(Gleis_Art.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART);
		}
		return gleisArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Baubereich> getGleisBaubereich() {
		if (gleisBaubereich == null) {
			gleisBaubereich = new EObjectContainmentEList<Gleis_Baubereich>(Gleis_Baubereich.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH);
		}
		return gleisBaubereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Bezeichnung> getGleisBezeichnung() {
		if (gleisBezeichnung == null) {
			gleisBezeichnung = new EObjectContainmentEList<Gleis_Bezeichnung>(Gleis_Bezeichnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG);
		}
		return gleisBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Fahrbahn> getGleisFahrbahn() {
		if (gleisFahrbahn == null) {
			gleisFahrbahn = new EObjectContainmentEList<Gleis_Fahrbahn>(Gleis_Fahrbahn.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN);
		}
		return gleisFahrbahn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Lichtraum> getGleisLichtraum() {
		if (gleisLichtraum == null) {
			gleisLichtraum = new EObjectContainmentEList<Gleis_Lichtraum>(Gleis_Lichtraum.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM);
		}
		return gleisLichtraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Schaltgruppe> getGleisSchaltgruppe() {
		if (gleisSchaltgruppe == null) {
			gleisSchaltgruppe = new EObjectContainmentEList<Gleis_Schaltgruppe>(Gleis_Schaltgruppe.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE);
		}
		return gleisSchaltgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hoehenlinie> getHoehenlinie() {
		if (hoehenlinie == null) {
			hoehenlinie = new EObjectContainmentEList<Hoehenlinie>(Hoehenlinie.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE);
		}
		return hoehenlinie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hoehenpunkt> getHoehenpunkt() {
		if (hoehenpunkt == null) {
			hoehenpunkt = new EObjectContainmentEList<Hoehenpunkt>(Hoehenpunkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT);
		}
		return hoehenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kabel> getKabel() {
		if (kabel == null) {
			kabel = new EObjectContainmentEList<Kabel>(Kabel.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL);
		}
		return kabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kabel_Verteilpunkt> getKabelVerteilpunkt() {
		if (kabelVerteilpunkt == null) {
			kabelVerteilpunkt = new EObjectContainmentEList<Kabel_Verteilpunkt>(Kabel_Verteilpunkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT);
		}
		return kabelVerteilpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Anlage> getLEUAnlage() {
		if (lEUAnlage == null) {
			lEUAnlage = new EObjectContainmentEList<LEU_Anlage>(LEU_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE);
		}
		return lEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Modul> getLEUModul() {
		if (lEUModul == null) {
			lEUModul = new EObjectContainmentEList<LEU_Modul>(LEU_Modul.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL);
		}
		return lEUModul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Schaltkasten> getLEUSchaltkasten() {
		if (lEUSchaltkasten == null) {
			lEUSchaltkasten = new EObjectContainmentEList<LEU_Schaltkasten>(LEU_Schaltkasten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN);
		}
		return lEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lieferobjekt> getLieferobjekt() {
		if (lieferobjekt == null) {
			lieferobjekt = new EObjectContainmentEList<Lieferobjekt>(Lieferobjekt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT);
		}
		return lieferobjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Luft_Telegramm> getLuftTelegramm() {
		if (luftTelegramm == null) {
			luftTelegramm = new EObjectContainmentEList<Luft_Telegramm>(Luft_Telegramm.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM);
		}
		return luftTelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Markanter_Punkt> getMarkanterPunkt() {
		if (markanterPunkt == null) {
			markanterPunkt = new EObjectContainmentEList<Markanter_Punkt>(Markanter_Punkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT);
		}
		return markanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NB> getNB() {
		if (nB == null) {
			nB = new EObjectContainmentEList<NB>(NB.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB);
		}
		return nB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NB_Bedien_Anzeige_Element> getNBBedienAnzeigeElement() {
		if (nBBedienAnzeigeElement == null) {
			nBBedienAnzeigeElement = new EObjectContainmentEList<NB_Bedien_Anzeige_Element>(NB_Bedien_Anzeige_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT);
		}
		return nBBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NB_Zone> getNBZone() {
		if (nBZone == null) {
			nBZone = new EObjectContainmentEList<NB_Zone>(NB_Zone.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE);
		}
		return nBZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NB_Zone_Element> getNBZoneElement() {
		if (nBZoneElement == null) {
			nBZoneElement = new EObjectContainmentEList<NB_Zone_Element>(NB_Zone_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT);
		}
		return nBZoneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NB_Zone_Grenze> getNBZoneGrenze() {
		if (nBZoneGrenze == null) {
			nBZoneGrenze = new EObjectContainmentEList<NB_Zone_Grenze>(NB_Zone_Grenze.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE);
		}
		return nBZoneGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Oertlichkeit> getOertlichkeit() {
		if (oertlichkeit == null) {
			oertlichkeit = new EObjectContainmentEList<Oertlichkeit>(Oertlichkeit.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT);
		}
		return oertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Prog_Datei_Gruppe> getProgDateiGruppe() {
		if (progDateiGruppe == null) {
			progDateiGruppe = new EObjectContainmentEList<Prog_Datei_Gruppe>(Prog_Datei_Gruppe.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE);
		}
		return progDateiGruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Proxy_Objekt> getProxyObjekt() {
		if (proxyObjekt == null) {
			proxyObjekt = new EObjectContainmentEList<Proxy_Objekt>(Proxy_Objekt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT);
		}
		return proxyObjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PZB_Element> getPZBElement() {
		if (pZBElement == null) {
			pZBElement = new EObjectContainmentEList<PZB_Element>(PZB_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT);
		}
		return pZBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PZB_Element_Zuordnung> getPZBElementZuordnung() {
		if (pZBElementZuordnung == null) {
			pZBElementZuordnung = new EObjectContainmentEList<PZB_Element_Zuordnung>(PZB_Element_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG);
		}
		return pZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PZB_Zuordnung_Signal> getPZBZuordnungSignal() {
		if (pZBZuordnungSignal == null) {
			pZBZuordnungSignal = new EObjectContainmentEList<PZB_Zuordnung_Signal>(PZB_Zuordnung_Signal.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL);
		}
		return pZBZuordnungSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RBC> getRBC() {
		if (rBC == null) {
			rBC = new EObjectContainmentEList<RBC>(RBC.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC);
		}
		return rBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regelzeichnung> getRegelzeichnung() {
		if (regelzeichnung == null) {
			regelzeichnung = new EObjectContainmentEList<Regelzeichnung>(Regelzeichnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG);
		}
		return regelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regelzeichnung_Parameter> getRegelzeichnungParameter() {
		if (regelzeichnungParameter == null) {
			regelzeichnungParameter = new EObjectContainmentEList<Regelzeichnung_Parameter>(Regelzeichnung_Parameter.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER);
		}
		return regelzeichnungParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schaltmittel_Fstr_Zuordnung> getSchaltmittelFstrZuordnung() {
		if (schaltmittelFstrZuordnung == null) {
			schaltmittelFstrZuordnung = new EObjectContainmentEList<Schaltmittel_Fstr_Zuordnung>(Schaltmittel_Fstr_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG);
		}
		return schaltmittelFstrZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schaltmittel_Zuordnung> getSchaltmittelZuordnung() {
		if (schaltmittelZuordnung == null) {
			schaltmittelZuordnung = new EObjectContainmentEList<Schaltmittel_Zuordnung>(Schaltmittel_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG);
		}
		return schaltmittelZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schloss> getSchloss() {
		if (schloss == null) {
			schloss = new EObjectContainmentEList<Schloss>(Schloss.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS);
		}
		return schloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schlosskombination> getSchlosskombination() {
		if (schlosskombination == null) {
			schlosskombination = new EObjectContainmentEList<Schlosskombination>(Schlosskombination.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION);
		}
		return schlosskombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schluessel> getSchluessel() {
		if (schluessel == null) {
			schluessel = new EObjectContainmentEList<Schluessel>(Schluessel.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL);
		}
		return schluessel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schluesselsperre> getSchluesselsperre() {
		if (schluesselsperre == null) {
			schluesselsperre = new EObjectContainmentEList<Schluesselsperre>(Schluesselsperre.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE);
		}
		return schluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schrankenantrieb> getSchrankenantrieb() {
		if (schrankenantrieb == null) {
			schrankenantrieb = new EObjectContainmentEList<Schrankenantrieb>(Schrankenantrieb.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB);
		}
		return schrankenantrieb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectContainmentEList<Signal>(Signal.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL);
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal_Befestigung> getSignalBefestigung() {
		if (signalBefestigung == null) {
			signalBefestigung = new EObjectContainmentEList<Signal_Befestigung>(Signal_Befestigung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG);
		}
		return signalBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal_Fank_Zuordnung> getSignalFankZuordnung() {
		if (signalFankZuordnung == null) {
			signalFankZuordnung = new EObjectContainmentEList<Signal_Fank_Zuordnung>(Signal_Fank_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG);
		}
		return signalFankZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal_Rahmen> getSignalRahmen() {
		if (signalRahmen == null) {
			signalRahmen = new EObjectContainmentEList<Signal_Rahmen>(Signal_Rahmen.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN);
		}
		return signalRahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal_Signalbegriff> getSignalSignalbegriff() {
		if (signalSignalbegriff == null) {
			signalSignalbegriff = new EObjectContainmentEList<Signal_Signalbegriff>(Signal_Signalbegriff.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF);
		}
		return signalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sonstiger_Punkt> getSonstigerPunkt() {
		if (sonstigerPunkt == null) {
			sonstigerPunkt = new EObjectContainmentEList<Sonstiger_Punkt>(Sonstiger_Punkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT);
		}
		return sonstigerPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stell_Bereich> getStellBereich() {
		if (stellBereich == null) {
			stellBereich = new EObjectContainmentEList<Stell_Bereich>(Stell_Bereich.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH);
		}
		return stellBereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stellelement> getStellelement() {
		if (stellelement == null) {
			stellelement = new EObjectContainmentEList<Stellelement>(Stellelement.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT);
		}
		return stellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Strecke> getStrecke() {
		if (strecke == null) {
			strecke = new EObjectContainmentEList<Strecke>(Strecke.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE);
		}
		return strecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Strecke_Bremsweg> getStreckeBremsweg() {
		if (streckeBremsweg == null) {
			streckeBremsweg = new EObjectContainmentEList<Strecke_Bremsweg>(Strecke_Bremsweg.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG);
		}
		return streckeBremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Strecke_Punkt> getStreckePunkt() {
		if (streckePunkt == null) {
			streckePunkt = new EObjectContainmentEList<Strecke_Punkt>(Strecke_Punkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT);
		}
		return streckePunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Technik_Standort> getTechnikStandort() {
		if (technikStandort == null) {
			technikStandort = new EObjectContainmentEList<Technik_Standort>(Technik_Standort.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT);
		}
		return technikStandort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Technischer_Bereich> getTechnischerBereich() {
		if (technischerBereich == null) {
			technischerBereich = new EObjectContainmentEList<Technischer_Bereich>(Technischer_Bereich.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH);
		}
		return technischerBereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Technischer_Punkt> getTechnischerPunkt() {
		if (technischerPunkt == null) {
			technischerPunkt = new EObjectContainmentEList<Technischer_Punkt>(Technischer_Punkt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT);
		}
		return technischerPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOP_Kante> getTOPKante() {
		if (tOPKante == null) {
			tOPKante = new EObjectContainmentEList<TOP_Kante>(TOP_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE);
		}
		return tOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOP_Knoten> getTOPKnoten() {
		if (tOPKnoten == null) {
			tOPKnoten = new EObjectContainmentEList<TOP_Knoten>(TOP_Knoten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN);
		}
		return tOPKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trasse_Kante> getTrasseKante() {
		if (trasseKante == null) {
			trasseKante = new EObjectContainmentEList<Trasse_Kante>(Trasse_Kante.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE);
		}
		return trasseKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trasse_Knoten> getTrasseKnoten() {
		if (trasseKnoten == null) {
			trasseKnoten = new EObjectContainmentEList<Trasse_Knoten>(Trasse_Knoten.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN);
		}
		return trasseKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ueberhoehung> getUeberhoehung() {
		if (ueberhoehung == null) {
			ueberhoehung = new EObjectContainmentEList<Ueberhoehung>(Ueberhoehung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG);
		}
		return ueberhoehung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ueberhoehungslinie> getUeberhoehungslinie() {
		if (ueberhoehungslinie == null) {
			ueberhoehungslinie = new EObjectContainmentEList<Ueberhoehungslinie>(Ueberhoehungslinie.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE);
		}
		return ueberhoehungslinie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uebertragungsweg> getUebertragungsweg() {
		if (uebertragungsweg == null) {
			uebertragungsweg = new EObjectContainmentEList<Uebertragungsweg>(Uebertragungsweg.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG);
		}
		return uebertragungsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Unterbringung> getUnterbringung() {
		if (unterbringung == null) {
			unterbringung = new EObjectContainmentEList<Unterbringung>(Unterbringung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG);
		}
		return unterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verkehrszeichen> getVerkehrszeichen() {
		if (verkehrszeichen == null) {
			verkehrszeichen = new EObjectContainmentEList<Verkehrszeichen>(Verkehrszeichen.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN);
		}
		return verkehrszeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<W_Kr_Anlage> getWKrAnlage() {
		if (wKrAnlage == null) {
			wKrAnlage = new EObjectContainmentEList<W_Kr_Anlage>(W_Kr_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE);
		}
		return wKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<W_Kr_Gsp_Element> getWKrGspElement() {
		if (wKrGspElement == null) {
			wKrGspElement = new EObjectContainmentEList<W_Kr_Gsp_Element>(W_Kr_Gsp_Element.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT);
		}
		return wKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<W_Kr_Gsp_Komponente> getWKrGspKomponente() {
		if (wKrGspKomponente == null) {
			wKrGspKomponente = new EObjectContainmentEList<W_Kr_Gsp_Komponente>(W_Kr_Gsp_Komponente.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE);
		}
		return wKrGspKomponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weichenlaufkette> getWeichenlaufkette() {
		if (weichenlaufkette == null) {
			weichenlaufkette = new EObjectContainmentEList<Weichenlaufkette>(Weichenlaufkette.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE);
		}
		return weichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Weichenlaufkette_Zuordnung> getWeichenlaufketteZuordnung() {
		if (weichenlaufketteZuordnung == null) {
			weichenlaufketteZuordnung = new EObjectContainmentEList<Weichenlaufkette_Zuordnung>(Weichenlaufkette_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG);
		}
		return weichenlaufketteZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZBS_Schutzstrecke> getZBSSchutzstrecke() {
		if (zBSSchutzstrecke == null) {
			zBSSchutzstrecke = new EObjectContainmentEList<ZBS_Schutzstrecke>(ZBS_Schutzstrecke.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE);
		}
		return zBSSchutzstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZBS_Signal> getZBSSignal() {
		if (zBSSignal == null) {
			zBSSignal = new EObjectContainmentEList<ZBS_Signal>(ZBS_Signal.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL);
		}
		return zBSSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL> getZL() {
		if (zL == null) {
			zL = new EObjectContainmentEList<ZL>(ZL.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL);
		}
		return zL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_DLP_Abschnitt> getZLDLPAbschnitt() {
		if (zLDLPAbschnitt == null) {
			zLDLPAbschnitt = new EObjectContainmentEList<ZL_DLP_Abschnitt>(ZL_DLP_Abschnitt.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT);
		}
		return zLDLPAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_DLP_Fstr> getZLDLPFstr() {
		if (zLDLPFstr == null) {
			zLDLPFstr = new EObjectContainmentEList<ZL_DLP_Fstr>(ZL_DLP_Fstr.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR);
		}
		return zLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Fstr> getZLFstr() {
		if (zLFstr == null) {
			zLFstr = new EObjectContainmentEList<ZL_Fstr>(ZL_Fstr.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR);
		}
		return zLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Fstr_Anstoss> getZLFstrAnstoss() {
		if (zLFstrAnstoss == null) {
			zLFstrAnstoss = new EObjectContainmentEList<ZL_Fstr_Anstoss>(ZL_Fstr_Anstoss.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS);
		}
		return zLFstrAnstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Signalgruppe> getZLSignalgruppe() {
		if (zLSignalgruppe == null) {
			zLSignalgruppe = new EObjectContainmentEList<ZL_Signalgruppe>(ZL_Signalgruppe.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE);
		}
		return zLSignalgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Signalgruppe_Zuordnung> getZLSignalgruppeZuordnung() {
		if (zLSignalgruppeZuordnung == null) {
			zLSignalgruppeZuordnung = new EObjectContainmentEList<ZL_Signalgruppe_Zuordnung>(ZL_Signalgruppe_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG);
		}
		return zLSignalgruppeZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZLV_Bus> getZLVBus() {
		if (zLVBus == null) {
			zLVBus = new EObjectContainmentEList<ZLV_Bus>(ZLV_Bus.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS);
		}
		return zLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZLV_Bus_Besondere_Anlage> getZLVBusBesondereAnlage() {
		if (zLVBusBesondereAnlage == null) {
			zLVBusBesondereAnlage = new EObjectContainmentEList<ZLV_Bus_Besondere_Anlage>(ZLV_Bus_Besondere_Anlage.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE);
		}
		return zLVBusBesondereAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZLV_Bus_US_Zuordnung> getZLVBusUSZuordnung() {
		if (zLVBusUSZuordnung == null) {
			zLVBusUSZuordnung = new EObjectContainmentEList<ZLV_Bus_US_Zuordnung>(ZLV_Bus_US_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG);
		}
		return zLVBusUSZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN> getZN() {
		if (zN == null) {
			zN = new EObjectContainmentEList<ZN>(ZN.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN);
		}
		return zN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Akustik> getZNAkustik() {
		if (zNAkustik == null) {
			zNAkustik = new EObjectContainmentEList<ZN_Akustik>(ZN_Akustik.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK);
		}
		return zNAkustik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Anzeigefeld> getZNAnzeigefeld() {
		if (zNAnzeigefeld == null) {
			zNAnzeigefeld = new EObjectContainmentEList<ZN_Anzeigefeld>(ZN_Anzeigefeld.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD);
		}
		return zNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Fortschalt_Kriterium> getZNFortschaltKriterium() {
		if (zNFortschaltKriterium == null) {
			zNFortschaltKriterium = new EObjectContainmentEList<ZN_Fortschalt_Kriterium>(ZN_Fortschalt_Kriterium.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM);
		}
		return zNFortschaltKriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Telegramm_84_Zuordnung> getZNTelegramm84Zuordnung() {
		if (zNTelegramm84Zuordnung == null) {
			zNTelegramm84Zuordnung = new EObjectContainmentEList<ZN_Telegramm_84_Zuordnung>(ZN_Telegramm_84_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG);
		}
		return zNTelegramm84Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Telegramm_85_Zuordnung> getZNTelegramm85Zuordnung() {
		if (zNTelegramm85Zuordnung == null) {
			zNTelegramm85Zuordnung = new EObjectContainmentEList<ZN_Telegramm_85_Zuordnung>(ZN_Telegramm_85_Zuordnung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG);
		}
		return zNTelegramm85Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Unterstation> getZNUnterstation() {
		if (zNUnterstation == null) {
			zNUnterstation = new EObjectContainmentEList<ZN_Unterstation>(ZN_Unterstation.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION);
		}
		return zNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_ZBS> getZNZBS() {
		if (zNZBS == null) {
			zNZBS = new EObjectContainmentEList<ZN_ZBS>(ZN_ZBS.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS);
		}
		return zNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze> getZUBBereichsgrenze() {
		if (zUBBereichsgrenze == null) {
			zUBBereichsgrenze = new EObjectContainmentEList<ZUB_Bereichsgrenze>(ZUB_Bereichsgrenze.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE);
		}
		return zUBBereichsgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Streckeneigenschaft> getZUBStreckeneigenschaft() {
		if (zUBStreckeneigenschaft == null) {
			zUBStreckeneigenschaft = new EObjectContainmentEList<ZUB_Streckeneigenschaft>(ZUB_Streckeneigenschaft.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT);
		}
		return zUBStreckeneigenschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Zugeinwirkung> getZugeinwirkung() {
		if (zugeinwirkung == null) {
			zugeinwirkung = new EObjectContainmentEList<Zugeinwirkung>(Zugeinwirkung.class, this, PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG);
		}
		return zugeinwirkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
				return ((InternalEList<?>)getAnhang()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
				return ((InternalEList<?>)getATOSegmentProfile()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
				return ((InternalEList<?>)getATOTimingPoint()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
				return ((InternalEList<?>)getATOTSInstanz()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
				return ((InternalEList<?>)getAussenelementansteuerung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
				return ((InternalEList<?>)getBahnsteigAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
				return ((InternalEList<?>)getBahnsteigDach()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
				return ((InternalEList<?>)getBahnsteigKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
				return ((InternalEList<?>)getBahnsteigZugang()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
				return ((InternalEList<?>)getBalise()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
				return ((InternalEList<?>)getBearbeitungsvermerk()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
				return ((InternalEList<?>)getBedienAnrueckabschnitt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
				return ((InternalEList<?>)getBedienAnzeigeElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
				return ((InternalEList<?>)getBedienBezirk()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
				return ((InternalEList<?>)getBedienEinrichtungOertlich()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
				return ((InternalEList<?>)getBedienGBT()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
				return ((InternalEList<?>)getBedienOberflaeche()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
				return ((InternalEList<?>)getBedienOberflaecheBild()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
				return ((InternalEList<?>)getBedienOertlichkeit()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
				return ((InternalEList<?>)getBedienPlatz()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
				return ((InternalEList<?>)getBedienStandort()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
				return ((InternalEList<?>)getBedienZentrale()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
				return ((InternalEList<?>)getBinaerdaten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
				return ((InternalEList<?>)getBlockAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
				return ((InternalEList<?>)getBlockElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
				return ((InternalEList<?>)getBlockStrecke()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
				return ((InternalEList<?>)getBUEAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
				return ((InternalEList<?>)getBUEAnlageStrasse()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
				return ((InternalEList<?>)getBUEAnlageV()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
				return ((InternalEList<?>)getBUEAusschaltung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
				return ((InternalEList<?>)getBUEBedienAnzeigeElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				return ((InternalEList<?>)getBUEDeckendesSignalZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
				return ((InternalEList<?>)getBUEEinschaltung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
				return ((InternalEList<?>)getBUEEinschaltungZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
				return ((InternalEList<?>)getBUEGefahrraumEckpunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
				return ((InternalEList<?>)getBUEGleisbezogenerGefahrraum()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
				return ((InternalEList<?>)getBUEKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
				return ((InternalEList<?>)getBUEKreuzungsplan()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
				return ((InternalEList<?>)getBUESchnittstelle()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
				return ((InternalEList<?>)getBUESpezifischesSignal()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
				return ((InternalEList<?>)getBUEWSFstrZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
				return ((InternalEList<?>)getDatenpunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
				return ((InternalEList<?>)getDatenpunktLink()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
				return ((InternalEList<?>)getESTWZentraleinheit()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
				return ((InternalEList<?>)getETCSKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
				return ((InternalEList<?>)getETCSKnoten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
				return ((InternalEList<?>)getETCSRichtungsanzeige()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
				return ((InternalEList<?>)getETCSSignal()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
				return ((InternalEList<?>)getETCSWKr()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
				return ((InternalEList<?>)getEVModul()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
				return ((InternalEList<?>)getFachtelegramm()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
				return ((InternalEList<?>)getFlaFreimeldeZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
				return ((InternalEList<?>)getFlaSchutz()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
				return ((InternalEList<?>)getFlaZwieschutz()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
				return ((InternalEList<?>)getFMAAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
				return ((InternalEList<?>)getFMAElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
				return ((InternalEList<?>)getFMAKomponente()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
				return ((InternalEList<?>)getFstrAbhaengigkeit()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
				return ((InternalEList<?>)getFstrAneinander()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
				return ((InternalEList<?>)getFstrAneinanderZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
				return ((InternalEList<?>)getFstrDWeg()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return ((InternalEList<?>)getFstrDWegWKr()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
				return ((InternalEList<?>)getFstrFahrweg()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
				return ((InternalEList<?>)getFstrNichthaltfall()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
				return ((InternalEList<?>)getFstrRangierFlaZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
				return ((InternalEList<?>)getFstrSignalisierung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
				return ((InternalEList<?>)getFstrUmfahrpunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
				return ((InternalEList<?>)getFstrZugRangier()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
				return ((InternalEList<?>)getFTAnschaltbedingung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
				return ((InternalEList<?>)getFTFahrwegTeil()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
				return ((InternalEList<?>)getGEOKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
				return ((InternalEList<?>)getGEOKnoten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
				return ((InternalEList<?>)getGEOPunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
				return ((InternalEList<?>)getGeschwindigkeitsprofil()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
				return ((InternalEList<?>)getGFRAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
				return ((InternalEList<?>)getGFRElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
				return ((InternalEList<?>)getGFRTripelspiegel()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
				return ((InternalEList<?>)getGleisAbschluss()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
				return ((InternalEList<?>)getGleisAbschnitt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
				return ((InternalEList<?>)getGleisArt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
				return ((InternalEList<?>)getGleisBaubereich()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
				return ((InternalEList<?>)getGleisBezeichnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
				return ((InternalEList<?>)getGleisFahrbahn()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
				return ((InternalEList<?>)getGleisLichtraum()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
				return ((InternalEList<?>)getGleisSchaltgruppe()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
				return ((InternalEList<?>)getHoehenlinie()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
				return ((InternalEList<?>)getHoehenpunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
				return ((InternalEList<?>)getKabel()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
				return ((InternalEList<?>)getKabelVerteilpunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
				return ((InternalEList<?>)getLEUAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
				return ((InternalEList<?>)getLEUModul()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
				return ((InternalEList<?>)getLEUSchaltkasten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
				return ((InternalEList<?>)getLieferobjekt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
				return ((InternalEList<?>)getLuftTelegramm()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
				return ((InternalEList<?>)getMarkanterPunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
				return ((InternalEList<?>)getNB()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
				return ((InternalEList<?>)getNBBedienAnzeigeElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
				return ((InternalEList<?>)getNBZone()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
				return ((InternalEList<?>)getNBZoneElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
				return ((InternalEList<?>)getNBZoneGrenze()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
				return ((InternalEList<?>)getOertlichkeit()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
				return ((InternalEList<?>)getProgDateiGruppe()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
				return ((InternalEList<?>)getProxyObjekt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
				return ((InternalEList<?>)getPZBElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
				return ((InternalEList<?>)getPZBElementZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
				return ((InternalEList<?>)getPZBZuordnungSignal()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
				return ((InternalEList<?>)getRBC()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
				return ((InternalEList<?>)getRegelzeichnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
				return ((InternalEList<?>)getRegelzeichnungParameter()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
				return ((InternalEList<?>)getSchaltmittelFstrZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
				return ((InternalEList<?>)getSchaltmittelZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
				return ((InternalEList<?>)getSchloss()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
				return ((InternalEList<?>)getSchlosskombination()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
				return ((InternalEList<?>)getSchluessel()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
				return ((InternalEList<?>)getSchluesselsperre()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
				return ((InternalEList<?>)getSchrankenantrieb()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
				return ((InternalEList<?>)getSignal()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
				return ((InternalEList<?>)getSignalBefestigung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
				return ((InternalEList<?>)getSignalFankZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
				return ((InternalEList<?>)getSignalRahmen()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
				return ((InternalEList<?>)getSignalSignalbegriff()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
				return ((InternalEList<?>)getSonstigerPunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
				return ((InternalEList<?>)getStellBereich()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
				return ((InternalEList<?>)getStellelement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
				return ((InternalEList<?>)getStrecke()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
				return ((InternalEList<?>)getStreckeBremsweg()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
				return ((InternalEList<?>)getStreckePunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
				return ((InternalEList<?>)getTechnikStandort()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
				return ((InternalEList<?>)getTechnischerBereich()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
				return ((InternalEList<?>)getTechnischerPunkt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
				return ((InternalEList<?>)getTOPKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
				return ((InternalEList<?>)getTOPKnoten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
				return ((InternalEList<?>)getTrasseKante()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
				return ((InternalEList<?>)getTrasseKnoten()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
				return ((InternalEList<?>)getUeberhoehung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
				return ((InternalEList<?>)getUeberhoehungslinie()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
				return ((InternalEList<?>)getUebertragungsweg()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
				return ((InternalEList<?>)getUnterbringung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
				return ((InternalEList<?>)getVerkehrszeichen()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
				return ((InternalEList<?>)getWKrAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
				return ((InternalEList<?>)getWKrGspElement()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
				return ((InternalEList<?>)getWKrGspKomponente()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
				return ((InternalEList<?>)getWeichenlaufkette()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
				return ((InternalEList<?>)getWeichenlaufketteZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
				return ((InternalEList<?>)getZBSSchutzstrecke()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
				return ((InternalEList<?>)getZBSSignal()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
				return ((InternalEList<?>)getZL()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
				return ((InternalEList<?>)getZLDLPAbschnitt()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
				return ((InternalEList<?>)getZLDLPFstr()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
				return ((InternalEList<?>)getZLFstr()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
				return ((InternalEList<?>)getZLFstrAnstoss()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
				return ((InternalEList<?>)getZLSignalgruppe()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
				return ((InternalEList<?>)getZLSignalgruppeZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
				return ((InternalEList<?>)getZLVBus()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
				return ((InternalEList<?>)getZLVBusBesondereAnlage()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
				return ((InternalEList<?>)getZLVBusUSZuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
				return ((InternalEList<?>)getZN()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
				return ((InternalEList<?>)getZNAkustik()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
				return ((InternalEList<?>)getZNAnzeigefeld()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
				return ((InternalEList<?>)getZNFortschaltKriterium()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
				return ((InternalEList<?>)getZNTelegramm84Zuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
				return ((InternalEList<?>)getZNTelegramm85Zuordnung()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
				return ((InternalEList<?>)getZNUnterstation()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
				return ((InternalEList<?>)getZNZBS()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
				return ((InternalEList<?>)getZUBBereichsgrenze()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
				return ((InternalEList<?>)getZUBStreckeneigenschaft()).basicRemove(otherEnd, msgs);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				return ((InternalEList<?>)getZugeinwirkung()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
				return getAnhang();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
				return getATOSegmentProfile();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
				return getATOTimingPoint();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
				return getATOTSInstanz();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
				return getAussenelementansteuerung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
				return getBahnsteigAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
				return getBahnsteigDach();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
				return getBahnsteigKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
				return getBahnsteigZugang();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
				return getBalise();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
				return getBearbeitungsvermerk();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
				return getBedienAnrueckabschnitt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
				return getBedienAnzeigeElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
				return getBedienBezirk();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
				return getBedienEinrichtungOertlich();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
				return getBedienGBT();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
				return getBedienOberflaeche();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
				return getBedienOberflaecheBild();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
				return getBedienOertlichkeit();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
				return getBedienPlatz();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
				return getBedienStandort();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
				return getBedienZentrale();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
				return getBinaerdaten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
				return getBlockAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
				return getBlockElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
				return getBlockStrecke();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
				return getBUEAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
				return getBUEAnlageStrasse();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
				return getBUEAnlageV();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
				return getBUEAusschaltung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
				return getBUEBedienAnzeigeElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				return getBUEDeckendesSignalZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
				return getBUEEinschaltung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
				return getBUEEinschaltungZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
				return getBUEGefahrraumEckpunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
				return getBUEGleisbezogenerGefahrraum();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
				return getBUEKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
				return getBUEKreuzungsplan();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
				return getBUESchnittstelle();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
				return getBUESpezifischesSignal();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
				return getBUEWSFstrZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
				return getDatenpunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
				return getDatenpunktLink();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
				return getESTWZentraleinheit();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
				return getETCSKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
				return getETCSKnoten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
				return getETCSRichtungsanzeige();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
				return getETCSSignal();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
				return getETCSWKr();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
				return getEVModul();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
				return getFachtelegramm();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
				return getFlaFreimeldeZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
				return getFlaSchutz();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
				return getFlaZwieschutz();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
				return getFMAAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
				return getFMAElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
				return getFMAKomponente();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
				return getFstrAbhaengigkeit();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
				return getFstrAneinander();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
				return getFstrAneinanderZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
				return getFstrDWeg();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return getFstrDWegWKr();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
				return getFstrFahrweg();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
				return getFstrNichthaltfall();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
				return getFstrRangierFlaZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
				return getFstrSignalisierung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
				return getFstrUmfahrpunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
				return getFstrZugRangier();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
				return getFTAnschaltbedingung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
				return getFTFahrwegTeil();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
				return getGEOKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
				return getGEOKnoten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
				return getGEOPunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
				return getGeschwindigkeitsprofil();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
				return getGFRAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
				return getGFRElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
				return getGFRTripelspiegel();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
				return getGleisAbschluss();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
				return getGleisAbschnitt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
				return getGleisArt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
				return getGleisBaubereich();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
				return getGleisBezeichnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
				return getGleisFahrbahn();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
				return getGleisLichtraum();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
				return getGleisSchaltgruppe();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
				return getHoehenlinie();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
				return getHoehenpunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
				return getKabel();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
				return getKabelVerteilpunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
				return getLEUAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
				return getLEUModul();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
				return getLEUSchaltkasten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
				return getLieferobjekt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
				return getLuftTelegramm();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
				return getMarkanterPunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
				return getNB();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
				return getNBBedienAnzeigeElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
				return getNBZone();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
				return getNBZoneElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
				return getNBZoneGrenze();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
				return getOertlichkeit();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
				return getProgDateiGruppe();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
				return getProxyObjekt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
				return getPZBElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
				return getPZBElementZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
				return getPZBZuordnungSignal();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
				return getRBC();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
				return getRegelzeichnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
				return getRegelzeichnungParameter();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
				return getSchaltmittelFstrZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
				return getSchaltmittelZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
				return getSchloss();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
				return getSchlosskombination();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
				return getSchluessel();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
				return getSchluesselsperre();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
				return getSchrankenantrieb();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
				return getSignal();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
				return getSignalBefestigung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
				return getSignalFankZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
				return getSignalRahmen();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
				return getSignalSignalbegriff();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
				return getSonstigerPunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
				return getStellBereich();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
				return getStellelement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
				return getStrecke();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
				return getStreckeBremsweg();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
				return getStreckePunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
				return getTechnikStandort();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
				return getTechnischerBereich();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
				return getTechnischerPunkt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
				return getTOPKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
				return getTOPKnoten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
				return getTrasseKante();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
				return getTrasseKnoten();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
				return getUeberhoehung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
				return getUeberhoehungslinie();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
				return getUebertragungsweg();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
				return getUnterbringung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
				return getVerkehrszeichen();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
				return getWKrAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
				return getWKrGspElement();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
				return getWKrGspKomponente();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
				return getWeichenlaufkette();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
				return getWeichenlaufketteZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
				return getZBSSchutzstrecke();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
				return getZBSSignal();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
				return getZL();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
				return getZLDLPAbschnitt();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
				return getZLDLPFstr();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
				return getZLFstr();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
				return getZLFstrAnstoss();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
				return getZLSignalgruppe();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
				return getZLSignalgruppeZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
				return getZLVBus();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
				return getZLVBusBesondereAnlage();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
				return getZLVBusUSZuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
				return getZN();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
				return getZNAkustik();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
				return getZNAnzeigefeld();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
				return getZNFortschaltKriterium();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
				return getZNTelegramm84Zuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
				return getZNTelegramm85Zuordnung();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
				return getZNUnterstation();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
				return getZNZBS();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
				return getZUBBereichsgrenze();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
				return getZUBStreckeneigenschaft();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				return getZugeinwirkung();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
				getAnhang().clear();
				getAnhang().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
				getATOSegmentProfile().clear();
				getATOSegmentProfile().addAll((Collection<? extends ATO_Segment_Profile>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
				getATOTimingPoint().clear();
				getATOTimingPoint().addAll((Collection<? extends ATO_Timing_Point>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
				getATOTSInstanz().clear();
				getATOTSInstanz().addAll((Collection<? extends ATO_TS_Instanz>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
				getAussenelementansteuerung().clear();
				getAussenelementansteuerung().addAll((Collection<? extends Aussenelementansteuerung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
				getBahnsteigAnlage().clear();
				getBahnsteigAnlage().addAll((Collection<? extends Bahnsteig_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
				getBahnsteigDach().clear();
				getBahnsteigDach().addAll((Collection<? extends Bahnsteig_Dach>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
				getBahnsteigKante().clear();
				getBahnsteigKante().addAll((Collection<? extends Bahnsteig_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
				getBahnsteigZugang().clear();
				getBahnsteigZugang().addAll((Collection<? extends Bahnsteig_Zugang>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
				getBalise().clear();
				getBalise().addAll((Collection<? extends Balise>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
				getBearbeitungsvermerk().clear();
				getBearbeitungsvermerk().addAll((Collection<? extends Bearbeitungsvermerk>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
				getBedienAnrueckabschnitt().clear();
				getBedienAnrueckabschnitt().addAll((Collection<? extends Bedien_Anrueckabschnitt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
				getBedienAnzeigeElement().clear();
				getBedienAnzeigeElement().addAll((Collection<? extends Bedien_Anzeige_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
				getBedienBezirk().clear();
				getBedienBezirk().addAll((Collection<? extends Bedien_Bezirk>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
				getBedienEinrichtungOertlich().clear();
				getBedienEinrichtungOertlich().addAll((Collection<? extends Bedien_Einrichtung_Oertlich>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
				getBedienGBT().clear();
				getBedienGBT().addAll((Collection<? extends Bedien_GBT>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
				getBedienOberflaeche().clear();
				getBedienOberflaeche().addAll((Collection<? extends Bedien_Oberflaeche>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
				getBedienOberflaecheBild().clear();
				getBedienOberflaecheBild().addAll((Collection<? extends Bedien_Oberflaeche_Bild>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
				getBedienOertlichkeit().clear();
				getBedienOertlichkeit().addAll((Collection<? extends Bedien_Oertlichkeit>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
				getBedienPlatz().clear();
				getBedienPlatz().addAll((Collection<? extends Bedien_Platz>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
				getBedienStandort().clear();
				getBedienStandort().addAll((Collection<? extends Bedien_Standort>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
				getBedienZentrale().clear();
				getBedienZentrale().addAll((Collection<? extends Bedien_Zentrale>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
				getBinaerdaten().clear();
				getBinaerdaten().addAll((Collection<? extends Binaerdaten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
				getBlockAnlage().clear();
				getBlockAnlage().addAll((Collection<? extends Block_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
				getBlockElement().clear();
				getBlockElement().addAll((Collection<? extends Block_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
				getBlockStrecke().clear();
				getBlockStrecke().addAll((Collection<? extends Block_Strecke>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
				getBUEAnlage().clear();
				getBUEAnlage().addAll((Collection<? extends BUE_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
				getBUEAnlageStrasse().clear();
				getBUEAnlageStrasse().addAll((Collection<? extends BUE_Anlage_Strasse>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
				getBUEAnlageV().clear();
				getBUEAnlageV().addAll((Collection<? extends BUE_Anlage_V>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
				getBUEAusschaltung().clear();
				getBUEAusschaltung().addAll((Collection<? extends BUE_Ausschaltung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
				getBUEBedienAnzeigeElement().clear();
				getBUEBedienAnzeigeElement().addAll((Collection<? extends BUE_Bedien_Anzeige_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				getBUEDeckendesSignalZuordnung().clear();
				getBUEDeckendesSignalZuordnung().addAll((Collection<? extends BUE_Deckendes_Signal_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
				getBUEEinschaltung().clear();
				getBUEEinschaltung().addAll((Collection<? extends BUE_Einschaltung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
				getBUEEinschaltungZuordnung().clear();
				getBUEEinschaltungZuordnung().addAll((Collection<? extends BUE_Einschaltung_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
				getBUEGefahrraumEckpunkt().clear();
				getBUEGefahrraumEckpunkt().addAll((Collection<? extends BUE_Gefahrraum_Eckpunkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
				getBUEGleisbezogenerGefahrraum().clear();
				getBUEGleisbezogenerGefahrraum().addAll((Collection<? extends BUE_Gleisbezogener_Gefahrraum>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
				getBUEKante().clear();
				getBUEKante().addAll((Collection<? extends BUE_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
				getBUEKreuzungsplan().clear();
				getBUEKreuzungsplan().addAll((Collection<? extends BUE_Kreuzungsplan>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
				getBUESchnittstelle().clear();
				getBUESchnittstelle().addAll((Collection<? extends BUE_Schnittstelle>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
				getBUESpezifischesSignal().clear();
				getBUESpezifischesSignal().addAll((Collection<? extends BUE_Spezifisches_Signal>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
				getBUEWSFstrZuordnung().clear();
				getBUEWSFstrZuordnung().addAll((Collection<? extends BUE_WS_Fstr_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
				getDatenpunkt().clear();
				getDatenpunkt().addAll((Collection<? extends Datenpunkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
				getDatenpunktLink().clear();
				getDatenpunktLink().addAll((Collection<? extends Datenpunkt_Link>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
				getESTWZentraleinheit().clear();
				getESTWZentraleinheit().addAll((Collection<? extends ESTW_Zentraleinheit>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
				getETCSKante().clear();
				getETCSKante().addAll((Collection<? extends ETCS_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
				getETCSKnoten().clear();
				getETCSKnoten().addAll((Collection<? extends ETCS_Knoten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
				getETCSRichtungsanzeige().clear();
				getETCSRichtungsanzeige().addAll((Collection<? extends ETCS_Richtungsanzeige>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
				getETCSSignal().clear();
				getETCSSignal().addAll((Collection<? extends ETCS_Signal>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
				getETCSWKr().clear();
				getETCSWKr().addAll((Collection<? extends ETCS_W_Kr>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
				getEVModul().clear();
				getEVModul().addAll((Collection<? extends EV_Modul>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
				getFachtelegramm().clear();
				getFachtelegramm().addAll((Collection<? extends Fachtelegramm>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
				getFlaFreimeldeZuordnung().clear();
				getFlaFreimeldeZuordnung().addAll((Collection<? extends Fla_Freimelde_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
				getFlaSchutz().clear();
				getFlaSchutz().addAll((Collection<? extends Fla_Schutz>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
				getFlaZwieschutz().clear();
				getFlaZwieschutz().addAll((Collection<? extends Fla_Zwieschutz>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
				getFMAAnlage().clear();
				getFMAAnlage().addAll((Collection<? extends FMA_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
				getFMAElement().clear();
				getFMAElement().addAll((Collection<? extends FMA_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
				getFMAKomponente().clear();
				getFMAKomponente().addAll((Collection<? extends FMA_Komponente>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
				getFstrAbhaengigkeit().clear();
				getFstrAbhaengigkeit().addAll((Collection<? extends Fstr_Abhaengigkeit>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
				getFstrAneinander().clear();
				getFstrAneinander().addAll((Collection<? extends Fstr_Aneinander>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
				getFstrAneinanderZuordnung().clear();
				getFstrAneinanderZuordnung().addAll((Collection<? extends Fstr_Aneinander_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
				getFstrDWeg().clear();
				getFstrDWeg().addAll((Collection<? extends Fstr_DWeg>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				getFstrDWegWKr().clear();
				getFstrDWegWKr().addAll((Collection<? extends Fstr_DWeg_W_Kr>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
				getFstrFahrweg().clear();
				getFstrFahrweg().addAll((Collection<? extends Fstr_Fahrweg>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
				getFstrNichthaltfall().clear();
				getFstrNichthaltfall().addAll((Collection<? extends Fstr_Nichthaltfall>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
				getFstrRangierFlaZuordnung().clear();
				getFstrRangierFlaZuordnung().addAll((Collection<? extends Fstr_Rangier_Fla_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
				getFstrSignalisierung().clear();
				getFstrSignalisierung().addAll((Collection<? extends Fstr_Signalisierung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
				getFstrUmfahrpunkt().clear();
				getFstrUmfahrpunkt().addAll((Collection<? extends Fstr_Umfahrpunkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
				getFstrZugRangier().clear();
				getFstrZugRangier().addAll((Collection<? extends Fstr_Zug_Rangier>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
				getFTAnschaltbedingung().clear();
				getFTAnschaltbedingung().addAll((Collection<? extends FT_Anschaltbedingung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
				getFTFahrwegTeil().clear();
				getFTFahrwegTeil().addAll((Collection<? extends FT_Fahrweg_Teil>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
				getGEOKante().clear();
				getGEOKante().addAll((Collection<? extends GEO_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
				getGEOKnoten().clear();
				getGEOKnoten().addAll((Collection<? extends GEO_Knoten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
				getGEOPunkt().clear();
				getGEOPunkt().addAll((Collection<? extends GEO_Punkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
				getGeschwindigkeitsprofil().clear();
				getGeschwindigkeitsprofil().addAll((Collection<? extends Geschwindigkeitsprofil>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
				getGFRAnlage().clear();
				getGFRAnlage().addAll((Collection<? extends GFR_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
				getGFRElement().clear();
				getGFRElement().addAll((Collection<? extends GFR_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
				getGFRTripelspiegel().clear();
				getGFRTripelspiegel().addAll((Collection<? extends GFR_Tripelspiegel>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
				getGleisAbschluss().clear();
				getGleisAbschluss().addAll((Collection<? extends Gleis_Abschluss>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
				getGleisAbschnitt().clear();
				getGleisAbschnitt().addAll((Collection<? extends Gleis_Abschnitt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
				getGleisArt().clear();
				getGleisArt().addAll((Collection<? extends Gleis_Art>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
				getGleisBaubereich().clear();
				getGleisBaubereich().addAll((Collection<? extends Gleis_Baubereich>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
				getGleisBezeichnung().clear();
				getGleisBezeichnung().addAll((Collection<? extends Gleis_Bezeichnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
				getGleisFahrbahn().clear();
				getGleisFahrbahn().addAll((Collection<? extends Gleis_Fahrbahn>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
				getGleisLichtraum().clear();
				getGleisLichtraum().addAll((Collection<? extends Gleis_Lichtraum>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
				getGleisSchaltgruppe().clear();
				getGleisSchaltgruppe().addAll((Collection<? extends Gleis_Schaltgruppe>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
				getHoehenlinie().clear();
				getHoehenlinie().addAll((Collection<? extends Hoehenlinie>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
				getHoehenpunkt().clear();
				getHoehenpunkt().addAll((Collection<? extends Hoehenpunkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
				getKabel().clear();
				getKabel().addAll((Collection<? extends Kabel>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
				getKabelVerteilpunkt().clear();
				getKabelVerteilpunkt().addAll((Collection<? extends Kabel_Verteilpunkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
				getLEUAnlage().clear();
				getLEUAnlage().addAll((Collection<? extends LEU_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
				getLEUModul().clear();
				getLEUModul().addAll((Collection<? extends LEU_Modul>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
				getLEUSchaltkasten().clear();
				getLEUSchaltkasten().addAll((Collection<? extends LEU_Schaltkasten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
				getLieferobjekt().clear();
				getLieferobjekt().addAll((Collection<? extends Lieferobjekt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
				getLuftTelegramm().clear();
				getLuftTelegramm().addAll((Collection<? extends Luft_Telegramm>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
				getMarkanterPunkt().clear();
				getMarkanterPunkt().addAll((Collection<? extends Markanter_Punkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
				getNB().clear();
				getNB().addAll((Collection<? extends NB>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
				getNBBedienAnzeigeElement().clear();
				getNBBedienAnzeigeElement().addAll((Collection<? extends NB_Bedien_Anzeige_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
				getNBZone().clear();
				getNBZone().addAll((Collection<? extends NB_Zone>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
				getNBZoneElement().clear();
				getNBZoneElement().addAll((Collection<? extends NB_Zone_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
				getNBZoneGrenze().clear();
				getNBZoneGrenze().addAll((Collection<? extends NB_Zone_Grenze>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
				getOertlichkeit().clear();
				getOertlichkeit().addAll((Collection<? extends Oertlichkeit>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
				getProgDateiGruppe().clear();
				getProgDateiGruppe().addAll((Collection<? extends Prog_Datei_Gruppe>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
				getProxyObjekt().clear();
				getProxyObjekt().addAll((Collection<? extends Proxy_Objekt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
				getPZBElement().clear();
				getPZBElement().addAll((Collection<? extends PZB_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
				getPZBElementZuordnung().clear();
				getPZBElementZuordnung().addAll((Collection<? extends PZB_Element_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
				getPZBZuordnungSignal().clear();
				getPZBZuordnungSignal().addAll((Collection<? extends PZB_Zuordnung_Signal>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
				getRBC().clear();
				getRBC().addAll((Collection<? extends RBC>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
				getRegelzeichnung().clear();
				getRegelzeichnung().addAll((Collection<? extends Regelzeichnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
				getRegelzeichnungParameter().clear();
				getRegelzeichnungParameter().addAll((Collection<? extends Regelzeichnung_Parameter>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
				getSchaltmittelFstrZuordnung().clear();
				getSchaltmittelFstrZuordnung().addAll((Collection<? extends Schaltmittel_Fstr_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
				getSchaltmittelZuordnung().clear();
				getSchaltmittelZuordnung().addAll((Collection<? extends Schaltmittel_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
				getSchloss().clear();
				getSchloss().addAll((Collection<? extends Schloss>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
				getSchlosskombination().clear();
				getSchlosskombination().addAll((Collection<? extends Schlosskombination>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
				getSchluessel().clear();
				getSchluessel().addAll((Collection<? extends Schluessel>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
				getSchluesselsperre().clear();
				getSchluesselsperre().addAll((Collection<? extends Schluesselsperre>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
				getSchrankenantrieb().clear();
				getSchrankenantrieb().addAll((Collection<? extends Schrankenantrieb>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
				getSignal().clear();
				getSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
				getSignalBefestigung().clear();
				getSignalBefestigung().addAll((Collection<? extends Signal_Befestigung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
				getSignalFankZuordnung().clear();
				getSignalFankZuordnung().addAll((Collection<? extends Signal_Fank_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
				getSignalRahmen().clear();
				getSignalRahmen().addAll((Collection<? extends Signal_Rahmen>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
				getSignalSignalbegriff().clear();
				getSignalSignalbegriff().addAll((Collection<? extends Signal_Signalbegriff>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
				getSonstigerPunkt().clear();
				getSonstigerPunkt().addAll((Collection<? extends Sonstiger_Punkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
				getStellBereich().clear();
				getStellBereich().addAll((Collection<? extends Stell_Bereich>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
				getStellelement().clear();
				getStellelement().addAll((Collection<? extends Stellelement>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
				getStrecke().clear();
				getStrecke().addAll((Collection<? extends Strecke>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
				getStreckeBremsweg().clear();
				getStreckeBremsweg().addAll((Collection<? extends Strecke_Bremsweg>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
				getStreckePunkt().clear();
				getStreckePunkt().addAll((Collection<? extends Strecke_Punkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
				getTechnikStandort().clear();
				getTechnikStandort().addAll((Collection<? extends Technik_Standort>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
				getTechnischerBereich().clear();
				getTechnischerBereich().addAll((Collection<? extends Technischer_Bereich>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
				getTechnischerPunkt().clear();
				getTechnischerPunkt().addAll((Collection<? extends Technischer_Punkt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
				getTOPKante().clear();
				getTOPKante().addAll((Collection<? extends TOP_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
				getTOPKnoten().clear();
				getTOPKnoten().addAll((Collection<? extends TOP_Knoten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
				getTrasseKante().clear();
				getTrasseKante().addAll((Collection<? extends Trasse_Kante>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
				getTrasseKnoten().clear();
				getTrasseKnoten().addAll((Collection<? extends Trasse_Knoten>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
				getUeberhoehung().clear();
				getUeberhoehung().addAll((Collection<? extends Ueberhoehung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
				getUeberhoehungslinie().clear();
				getUeberhoehungslinie().addAll((Collection<? extends Ueberhoehungslinie>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
				getUebertragungsweg().clear();
				getUebertragungsweg().addAll((Collection<? extends Uebertragungsweg>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
				getUnterbringung().clear();
				getUnterbringung().addAll((Collection<? extends Unterbringung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
				getVerkehrszeichen().clear();
				getVerkehrszeichen().addAll((Collection<? extends Verkehrszeichen>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
				getWKrAnlage().clear();
				getWKrAnlage().addAll((Collection<? extends W_Kr_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
				getWKrGspElement().clear();
				getWKrGspElement().addAll((Collection<? extends W_Kr_Gsp_Element>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
				getWKrGspKomponente().clear();
				getWKrGspKomponente().addAll((Collection<? extends W_Kr_Gsp_Komponente>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
				getWeichenlaufkette().clear();
				getWeichenlaufkette().addAll((Collection<? extends Weichenlaufkette>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
				getWeichenlaufketteZuordnung().clear();
				getWeichenlaufketteZuordnung().addAll((Collection<? extends Weichenlaufkette_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
				getZBSSchutzstrecke().clear();
				getZBSSchutzstrecke().addAll((Collection<? extends ZBS_Schutzstrecke>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
				getZBSSignal().clear();
				getZBSSignal().addAll((Collection<? extends ZBS_Signal>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
				getZL().clear();
				getZL().addAll((Collection<? extends ZL>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
				getZLDLPAbschnitt().clear();
				getZLDLPAbschnitt().addAll((Collection<? extends ZL_DLP_Abschnitt>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
				getZLDLPFstr().clear();
				getZLDLPFstr().addAll((Collection<? extends ZL_DLP_Fstr>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
				getZLFstr().clear();
				getZLFstr().addAll((Collection<? extends ZL_Fstr>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
				getZLFstrAnstoss().clear();
				getZLFstrAnstoss().addAll((Collection<? extends ZL_Fstr_Anstoss>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
				getZLSignalgruppe().clear();
				getZLSignalgruppe().addAll((Collection<? extends ZL_Signalgruppe>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
				getZLSignalgruppeZuordnung().clear();
				getZLSignalgruppeZuordnung().addAll((Collection<? extends ZL_Signalgruppe_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
				getZLVBus().clear();
				getZLVBus().addAll((Collection<? extends ZLV_Bus>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
				getZLVBusBesondereAnlage().clear();
				getZLVBusBesondereAnlage().addAll((Collection<? extends ZLV_Bus_Besondere_Anlage>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
				getZLVBusUSZuordnung().clear();
				getZLVBusUSZuordnung().addAll((Collection<? extends ZLV_Bus_US_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
				getZN().clear();
				getZN().addAll((Collection<? extends ZN>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
				getZNAkustik().clear();
				getZNAkustik().addAll((Collection<? extends ZN_Akustik>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
				getZNAnzeigefeld().clear();
				getZNAnzeigefeld().addAll((Collection<? extends ZN_Anzeigefeld>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
				getZNFortschaltKriterium().clear();
				getZNFortschaltKriterium().addAll((Collection<? extends ZN_Fortschalt_Kriterium>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
				getZNTelegramm84Zuordnung().clear();
				getZNTelegramm84Zuordnung().addAll((Collection<? extends ZN_Telegramm_84_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
				getZNTelegramm85Zuordnung().clear();
				getZNTelegramm85Zuordnung().addAll((Collection<? extends ZN_Telegramm_85_Zuordnung>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
				getZNUnterstation().clear();
				getZNUnterstation().addAll((Collection<? extends ZN_Unterstation>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
				getZNZBS().clear();
				getZNZBS().addAll((Collection<? extends ZN_ZBS>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
				getZUBBereichsgrenze().clear();
				getZUBBereichsgrenze().addAll((Collection<? extends ZUB_Bereichsgrenze>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
				getZUBStreckeneigenschaft().clear();
				getZUBStreckeneigenschaft().addAll((Collection<? extends ZUB_Streckeneigenschaft>)newValue);
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				getZugeinwirkung().clear();
				getZugeinwirkung().addAll((Collection<? extends Zugeinwirkung>)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
				getAnhang().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
				getATOSegmentProfile().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
				getATOTimingPoint().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
				getATOTSInstanz().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
				getAussenelementansteuerung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
				getBahnsteigAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
				getBahnsteigDach().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
				getBahnsteigKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
				getBahnsteigZugang().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
				getBalise().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
				getBearbeitungsvermerk().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
				getBedienAnrueckabschnitt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
				getBedienAnzeigeElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
				getBedienBezirk().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
				getBedienEinrichtungOertlich().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
				getBedienGBT().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
				getBedienOberflaeche().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
				getBedienOberflaecheBild().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
				getBedienOertlichkeit().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
				getBedienPlatz().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
				getBedienStandort().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
				getBedienZentrale().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
				getBinaerdaten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
				getBlockAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
				getBlockElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
				getBlockStrecke().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
				getBUEAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
				getBUEAnlageStrasse().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
				getBUEAnlageV().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
				getBUEAusschaltung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
				getBUEBedienAnzeigeElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				getBUEDeckendesSignalZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
				getBUEEinschaltung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
				getBUEEinschaltungZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
				getBUEGefahrraumEckpunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
				getBUEGleisbezogenerGefahrraum().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
				getBUEKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
				getBUEKreuzungsplan().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
				getBUESchnittstelle().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
				getBUESpezifischesSignal().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
				getBUEWSFstrZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
				getDatenpunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
				getDatenpunktLink().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
				getESTWZentraleinheit().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
				getETCSKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
				getETCSKnoten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
				getETCSRichtungsanzeige().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
				getETCSSignal().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
				getETCSWKr().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
				getEVModul().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
				getFachtelegramm().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
				getFlaFreimeldeZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
				getFlaSchutz().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
				getFlaZwieschutz().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
				getFMAAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
				getFMAElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
				getFMAKomponente().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
				getFstrAbhaengigkeit().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
				getFstrAneinander().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
				getFstrAneinanderZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
				getFstrDWeg().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				getFstrDWegWKr().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
				getFstrFahrweg().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
				getFstrNichthaltfall().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
				getFstrRangierFlaZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
				getFstrSignalisierung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
				getFstrUmfahrpunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
				getFstrZugRangier().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
				getFTAnschaltbedingung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
				getFTFahrwegTeil().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
				getGEOKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
				getGEOKnoten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
				getGEOPunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
				getGeschwindigkeitsprofil().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
				getGFRAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
				getGFRElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
				getGFRTripelspiegel().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
				getGleisAbschluss().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
				getGleisAbschnitt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
				getGleisArt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
				getGleisBaubereich().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
				getGleisBezeichnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
				getGleisFahrbahn().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
				getGleisLichtraum().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
				getGleisSchaltgruppe().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
				getHoehenlinie().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
				getHoehenpunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
				getKabel().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
				getKabelVerteilpunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
				getLEUAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
				getLEUModul().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
				getLEUSchaltkasten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
				getLieferobjekt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
				getLuftTelegramm().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
				getMarkanterPunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
				getNB().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
				getNBBedienAnzeigeElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
				getNBZone().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
				getNBZoneElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
				getNBZoneGrenze().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
				getOertlichkeit().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
				getProgDateiGruppe().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
				getProxyObjekt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
				getPZBElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
				getPZBElementZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
				getPZBZuordnungSignal().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
				getRBC().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
				getRegelzeichnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
				getRegelzeichnungParameter().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
				getSchaltmittelFstrZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
				getSchaltmittelZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
				getSchloss().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
				getSchlosskombination().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
				getSchluessel().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
				getSchluesselsperre().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
				getSchrankenantrieb().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
				getSignal().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
				getSignalBefestigung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
				getSignalFankZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
				getSignalRahmen().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
				getSignalSignalbegriff().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
				getSonstigerPunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
				getStellBereich().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
				getStellelement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
				getStrecke().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
				getStreckeBremsweg().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
				getStreckePunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
				getTechnikStandort().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
				getTechnischerBereich().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
				getTechnischerPunkt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
				getTOPKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
				getTOPKnoten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
				getTrasseKante().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
				getTrasseKnoten().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
				getUeberhoehung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
				getUeberhoehungslinie().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
				getUebertragungsweg().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
				getUnterbringung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
				getVerkehrszeichen().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
				getWKrAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
				getWKrGspElement().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
				getWKrGspKomponente().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
				getWeichenlaufkette().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
				getWeichenlaufketteZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
				getZBSSchutzstrecke().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
				getZBSSignal().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
				getZL().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
				getZLDLPAbschnitt().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
				getZLDLPFstr().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
				getZLFstr().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
				getZLFstrAnstoss().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
				getZLSignalgruppe().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
				getZLSignalgruppeZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
				getZLVBus().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
				getZLVBusBesondereAnlage().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
				getZLVBusUSZuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
				getZN().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
				getZNAkustik().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
				getZNAnzeigefeld().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
				getZNFortschaltKriterium().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
				getZNTelegramm84Zuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
				getZNTelegramm85Zuordnung().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
				getZNUnterstation().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
				getZNZBS().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
				getZUBBereichsgrenze().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
				getZUBStreckeneigenschaft().clear();
				return;
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				getZugeinwirkung().clear();
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
				return anhang != null && !anhang.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
				return aTOSegmentProfile != null && !aTOSegmentProfile.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
				return aTOTimingPoint != null && !aTOTimingPoint.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
				return aTOTSInstanz != null && !aTOTSInstanz.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
				return aussenelementansteuerung != null && !aussenelementansteuerung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
				return bahnsteigAnlage != null && !bahnsteigAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
				return bahnsteigDach != null && !bahnsteigDach.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
				return bahnsteigKante != null && !bahnsteigKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
				return bahnsteigZugang != null && !bahnsteigZugang.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
				return balise != null && !balise.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
				return bearbeitungsvermerk != null && !bearbeitungsvermerk.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
				return bedienAnrueckabschnitt != null && !bedienAnrueckabschnitt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
				return bedienAnzeigeElement != null && !bedienAnzeigeElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
				return bedienBezirk != null && !bedienBezirk.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
				return bedienEinrichtungOertlich != null && !bedienEinrichtungOertlich.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
				return bedienGBT != null && !bedienGBT.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
				return bedienOberflaeche != null && !bedienOberflaeche.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
				return bedienOberflaecheBild != null && !bedienOberflaecheBild.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
				return bedienOertlichkeit != null && !bedienOertlichkeit.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
				return bedienPlatz != null && !bedienPlatz.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
				return bedienStandort != null && !bedienStandort.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
				return bedienZentrale != null && !bedienZentrale.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
				return binaerdaten != null && !binaerdaten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
				return blockAnlage != null && !blockAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
				return blockElement != null && !blockElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
				return blockStrecke != null && !blockStrecke.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
				return bUEAnlage != null && !bUEAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
				return bUEAnlageStrasse != null && !bUEAnlageStrasse.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
				return bUEAnlageV != null && !bUEAnlageV.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
				return bUEAusschaltung != null && !bUEAusschaltung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
				return bUEBedienAnzeigeElement != null && !bUEBedienAnzeigeElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				return bUEDeckendesSignalZuordnung != null && !bUEDeckendesSignalZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
				return bUEEinschaltung != null && !bUEEinschaltung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
				return bUEEinschaltungZuordnung != null && !bUEEinschaltungZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
				return bUEGefahrraumEckpunkt != null && !bUEGefahrraumEckpunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
				return bUEGleisbezogenerGefahrraum != null && !bUEGleisbezogenerGefahrraum.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
				return bUEKante != null && !bUEKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
				return bUEKreuzungsplan != null && !bUEKreuzungsplan.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
				return bUESchnittstelle != null && !bUESchnittstelle.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
				return bUESpezifischesSignal != null && !bUESpezifischesSignal.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
				return bUEWSFstrZuordnung != null && !bUEWSFstrZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
				return datenpunkt != null && !datenpunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
				return datenpunktLink != null && !datenpunktLink.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
				return eSTWZentraleinheit != null && !eSTWZentraleinheit.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
				return eTCSKante != null && !eTCSKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
				return eTCSKnoten != null && !eTCSKnoten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
				return eTCSRichtungsanzeige != null && !eTCSRichtungsanzeige.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
				return eTCSSignal != null && !eTCSSignal.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
				return eTCSWKr != null && !eTCSWKr.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
				return eVModul != null && !eVModul.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
				return fachtelegramm != null && !fachtelegramm.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
				return flaFreimeldeZuordnung != null && !flaFreimeldeZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
				return flaSchutz != null && !flaSchutz.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
				return flaZwieschutz != null && !flaZwieschutz.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
				return fMAAnlage != null && !fMAAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
				return fMAElement != null && !fMAElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
				return fMAKomponente != null && !fMAKomponente.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
				return fstrAbhaengigkeit != null && !fstrAbhaengigkeit.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
				return fstrAneinander != null && !fstrAneinander.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
				return fstrAneinanderZuordnung != null && !fstrAneinanderZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
				return fstrDWeg != null && !fstrDWeg.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return fstrDWegWKr != null && !fstrDWegWKr.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
				return fstrFahrweg != null && !fstrFahrweg.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
				return fstrNichthaltfall != null && !fstrNichthaltfall.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
				return fstrRangierFlaZuordnung != null && !fstrRangierFlaZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
				return fstrSignalisierung != null && !fstrSignalisierung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
				return fstrUmfahrpunkt != null && !fstrUmfahrpunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
				return fstrZugRangier != null && !fstrZugRangier.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
				return fTAnschaltbedingung != null && !fTAnschaltbedingung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
				return fTFahrwegTeil != null && !fTFahrwegTeil.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
				return gEOKante != null && !gEOKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
				return gEOKnoten != null && !gEOKnoten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
				return gEOPunkt != null && !gEOPunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
				return geschwindigkeitsprofil != null && !geschwindigkeitsprofil.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
				return gFRAnlage != null && !gFRAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
				return gFRElement != null && !gFRElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
				return gFRTripelspiegel != null && !gFRTripelspiegel.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
				return gleisAbschluss != null && !gleisAbschluss.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
				return gleisAbschnitt != null && !gleisAbschnitt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
				return gleisArt != null && !gleisArt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
				return gleisBaubereich != null && !gleisBaubereich.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
				return gleisBezeichnung != null && !gleisBezeichnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
				return gleisFahrbahn != null && !gleisFahrbahn.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
				return gleisLichtraum != null && !gleisLichtraum.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
				return gleisSchaltgruppe != null && !gleisSchaltgruppe.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
				return hoehenlinie != null && !hoehenlinie.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
				return hoehenpunkt != null && !hoehenpunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
				return kabel != null && !kabel.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
				return kabelVerteilpunkt != null && !kabelVerteilpunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
				return lEUAnlage != null && !lEUAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
				return lEUModul != null && !lEUModul.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
				return lEUSchaltkasten != null && !lEUSchaltkasten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
				return lieferobjekt != null && !lieferobjekt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
				return luftTelegramm != null && !luftTelegramm.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
				return markanterPunkt != null && !markanterPunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
				return nB != null && !nB.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
				return nBBedienAnzeigeElement != null && !nBBedienAnzeigeElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
				return nBZone != null && !nBZone.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
				return nBZoneElement != null && !nBZoneElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
				return nBZoneGrenze != null && !nBZoneGrenze.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
				return oertlichkeit != null && !oertlichkeit.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
				return progDateiGruppe != null && !progDateiGruppe.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
				return proxyObjekt != null && !proxyObjekt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
				return pZBElement != null && !pZBElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
				return pZBElementZuordnung != null && !pZBElementZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
				return pZBZuordnungSignal != null && !pZBZuordnungSignal.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
				return rBC != null && !rBC.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
				return regelzeichnung != null && !regelzeichnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
				return regelzeichnungParameter != null && !regelzeichnungParameter.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
				return schaltmittelFstrZuordnung != null && !schaltmittelFstrZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
				return schaltmittelZuordnung != null && !schaltmittelZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
				return schloss != null && !schloss.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
				return schlosskombination != null && !schlosskombination.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
				return schluessel != null && !schluessel.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
				return schluesselsperre != null && !schluesselsperre.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
				return schrankenantrieb != null && !schrankenantrieb.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
				return signal != null && !signal.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
				return signalBefestigung != null && !signalBefestigung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
				return signalFankZuordnung != null && !signalFankZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
				return signalRahmen != null && !signalRahmen.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
				return signalSignalbegriff != null && !signalSignalbegriff.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
				return sonstigerPunkt != null && !sonstigerPunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
				return stellBereich != null && !stellBereich.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
				return stellelement != null && !stellelement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
				return strecke != null && !strecke.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
				return streckeBremsweg != null && !streckeBremsweg.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
				return streckePunkt != null && !streckePunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
				return technikStandort != null && !technikStandort.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
				return technischerBereich != null && !technischerBereich.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
				return technischerPunkt != null && !technischerPunkt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
				return tOPKante != null && !tOPKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
				return tOPKnoten != null && !tOPKnoten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
				return trasseKante != null && !trasseKante.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
				return trasseKnoten != null && !trasseKnoten.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
				return ueberhoehung != null && !ueberhoehung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
				return ueberhoehungslinie != null && !ueberhoehungslinie.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
				return uebertragungsweg != null && !uebertragungsweg.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
				return unterbringung != null && !unterbringung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
				return verkehrszeichen != null && !verkehrszeichen.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
				return wKrAnlage != null && !wKrAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
				return wKrGspElement != null && !wKrGspElement.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
				return wKrGspKomponente != null && !wKrGspKomponente.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
				return weichenlaufkette != null && !weichenlaufkette.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
				return weichenlaufketteZuordnung != null && !weichenlaufketteZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
				return zBSSchutzstrecke != null && !zBSSchutzstrecke.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
				return zBSSignal != null && !zBSSignal.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
				return zL != null && !zL.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
				return zLDLPAbschnitt != null && !zLDLPAbschnitt.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
				return zLDLPFstr != null && !zLDLPFstr.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
				return zLFstr != null && !zLFstr.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
				return zLFstrAnstoss != null && !zLFstrAnstoss.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
				return zLSignalgruppe != null && !zLSignalgruppe.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
				return zLSignalgruppeZuordnung != null && !zLSignalgruppeZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
				return zLVBus != null && !zLVBus.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
				return zLVBusBesondereAnlage != null && !zLVBusBesondereAnlage.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
				return zLVBusUSZuordnung != null && !zLVBusUSZuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
				return zN != null && !zN.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
				return zNAkustik != null && !zNAkustik.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
				return zNAnzeigefeld != null && !zNAnzeigefeld.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
				return zNFortschaltKriterium != null && !zNFortschaltKriterium.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
				return zNTelegramm84Zuordnung != null && !zNTelegramm84Zuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
				return zNTelegramm85Zuordnung != null && !zNTelegramm85Zuordnung.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
				return zNUnterstation != null && !zNUnterstation.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
				return zNZBS != null && !zNZBS.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
				return zUBBereichsgrenze != null && !zUBBereichsgrenze.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
				return zUBStreckeneigenschaft != null && !zUBStreckeneigenschaft.isEmpty();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				return zugeinwirkung != null && !zugeinwirkung.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Container_AttributeGroupImpl
