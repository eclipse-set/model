/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Stell_Bereich;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Stellelement;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage;
import org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach;
import org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel;
import org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung;
import org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Link;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Kante;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.EV_Modul;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Anschaltbedingung;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Fahrweg_Teil;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Gruppe;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Streckeneigenschaft;

import org.eclipse.set.model.model1902.Basisobjekte.Anhang;
import org.eclipse.set.model.model1902.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt;
import org.eclipse.set.model.model1902.Basisobjekte.Proxy_Objekt;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.model.model1902.Bedienung.Bedien_GBT;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Bild;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Oertlichkeit;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Platz;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Standort;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Zentrale;

import org.eclipse.set.model.model1902.Block.Block_Anlage;
import org.eclipse.set.model.model1902.Block.Block_Element;
import org.eclipse.set.model.model1902.Block.Block_Strecke;

import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Zuordnung;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Nichthaltfall;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.model.model1902.Fahrstrasse.Sonstiger_Punkt;

import org.eclipse.set.model.model1902.Flankenschutz.Fla_Freimelde_Zuordnung;
import org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz;
import org.eclipse.set.model.model1902.Flankenschutz.Fla_Zwieschutz;

import org.eclipse.set.model.model1902.Geodaten.GEO_Kante;
import org.eclipse.set.model.model1902.Geodaten.GEO_Knoten;
import org.eclipse.set.model.model1902.Geodaten.GEO_Punkt;
import org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil;
import org.eclipse.set.model.model1902.Geodaten.Hoehenlinie;
import org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt;
import org.eclipse.set.model.model1902.Geodaten.Oertlichkeit;
import org.eclipse.set.model.model1902.Geodaten.Strecke;
import org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt;
import org.eclipse.set.model.model1902.Geodaten.TOP_Kante;
import org.eclipse.set.model.model1902.Geodaten.TOP_Knoten;
import org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich;
import org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt;
import org.eclipse.set.model.model1902.Geodaten.Ueberhoehung;
import org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie;

import org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt;
import org.eclipse.set.model.model1902.Gleis.Gleis_Art;
import org.eclipse.set.model.model1902.Gleis.Gleis_Baubereich;
import org.eclipse.set.model.model1902.Gleis.Gleis_Bezeichnung;
import org.eclipse.set.model.model1902.Gleis.Gleis_Fahrbahn;
import org.eclipse.set.model.model1902.Gleis.Gleis_Lichtraum;
import org.eclipse.set.model.model1902.Gleis.Gleis_Schaltgruppe;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Kante;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Knoten;

import org.eclipse.set.model.model1902.Nahbedienbereich.NB;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Element;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Grenze;

import org.eclipse.set.model.model1902.Ortung.FMA_Anlage;
import org.eclipse.set.model.model1902.Ortung.FMA_Element;
import org.eclipse.set.model.model1902.Ortung.FMA_Komponente;
import org.eclipse.set.model.model1902.Ortung.Schaltmittel_Zuordnung;
import org.eclipse.set.model.model1902.Ortung.Zugeinwirkung;

import org.eclipse.set.model.model1902.PZB.PZB_Element;
import org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal;

import org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung;
import org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss;
import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination;
import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel;
import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluesselsperre;

import org.eclipse.set.model.model1902.Signale.Signal;
import org.eclipse.set.model.model1902.Signale.Signal_Befestigung;
import org.eclipse.set.model.model1902.Signale.Signal_Fank_Zuordnung;
import org.eclipse.set.model.model1902.Signale.Signal_Rahmen;
import org.eclipse.set.model.model1902.Signale.Signal_Signalbegriff;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Gleis_Abschluss;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichenlaufkette;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung;

import org.eclipse.set.model.model1902.Zuglenkung.ZL;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Akustik;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getAnhang <em>Anhang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getAussenelementansteuerung <em>Aussenelementansteuerung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBahnsteigAnlage <em>Bahnsteig Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBahnsteigDach <em>Bahnsteig Dach</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBahnsteigKante <em>Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBahnsteigZugang <em>Bahnsteig Zugang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBalise <em>Balise</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBearbeitungsvermerk <em>Bearbeitungsvermerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienAnrueckabschnitt <em>Bedien Anrueckabschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienAnzeigeElement <em>Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienBezirk <em>Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienEinrichtungOertlich <em>Bedien Einrichtung Oertlich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienGBT <em>Bedien GBT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienOberflaeche <em>Bedien Oberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienOberflaecheBild <em>Bedien Oberflaeche Bild</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienOertlichkeit <em>Bedien Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienPlatz <em>Bedien Platz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienStandort <em>Bedien Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBedienZentrale <em>Bedien Zentrale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBinaerdatei <em>Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBlockAnlage <em>Block Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBlockElement <em>Block Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBlockStrecke <em>Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEAnlage <em>BUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEAnlageStrasse <em>BUE Anlage Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEAnlageV <em>BUE Anlage V</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEAusschaltung <em>BUE Ausschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEBedienAnzeigeElement <em>BUE Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEDeckendesSignalZuordnung <em>BUE Deckendes Signal Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEEinschaltung <em>BUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEEinschaltungZuordnung <em>BUE Einschaltung Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEGefahrraumEckpunkt <em>BUE Gefahrraum Eckpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEGleisbezogenerGefahrraum <em>BUE Gleisbezogener Gefahrraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEKante <em>BUE Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEKreuzungsplan <em>BUE Kreuzungsplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUESchnittstelle <em>BUE Schnittstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUESpezifischesSignal <em>BUE Spezifisches Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getBUEWSFstrZuordnung <em>BUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getDatenpunkt <em>Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getDatenpunktLink <em>Datenpunkt Link</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getESTWZentraleinheit <em>ESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getETCSKante <em>ETCS Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getETCSKnoten <em>ETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getETCSSignal <em>ETCS Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getETCSWKr <em>ETCSW Kr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getEVModul <em>EV Modul</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFachtelegramm <em>Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFlaFreimeldeZuordnung <em>Fla Freimelde Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFlaSchutz <em>Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFlaZwieschutz <em>Fla Zwieschutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFMAAnlage <em>FMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFMAElement <em>FMA Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFMAKomponente <em>FMA Komponente</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrAbhaengigkeit <em>Fstr Abhaengigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrAneinander <em>Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrAneinanderZuordnung <em>Fstr Aneinander Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrDWeg <em>Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrDWegWKr <em>Fstr DWeg WKr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrFahrweg <em>Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrNichthaltfall <em>Fstr Nichthaltfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrRangierFlaZuordnung <em>Fstr Rangier Fla Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrSignalisierung <em>Fstr Signalisierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrUmfahrpunkt <em>Fstr Umfahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFstrZugRangier <em>Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFTAnschaltbedingung <em>FT Anschaltbedingung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getFTFahrwegTeil <em>FT Fahrweg Teil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGEOKante <em>GEO Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGEOKnoten <em>GEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGEOPunkt <em>GEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGeschwindigkeitsprofil <em>Geschwindigkeitsprofil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGFRAnlage <em>GFR Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGFRElement <em>GFR Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGFRTripelspiegel <em>GFR Tripelspiegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisAbschluss <em>Gleis Abschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisAbschnitt <em>Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisArt <em>Gleis Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisBaubereich <em>Gleis Baubereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisBezeichnung <em>Gleis Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisFahrbahn <em>Gleis Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisLichtraum <em>Gleis Lichtraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getGleisSchaltgruppe <em>Gleis Schaltgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getHoehenlinie <em>Hoehenlinie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getHoehenpunkt <em>Hoehenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getKabel <em>Kabel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getKabelVerteilpunkt <em>Kabel Verteilpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getLEUAnlage <em>LEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getLEUModul <em>LEU Modul</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getLEUSchaltkasten <em>LEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getLieferobjekt <em>Lieferobjekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getLuftTelegramm <em>Luft Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getMarkanterPunkt <em>Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getNB <em>NB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getNBBedienAnzeigeElement <em>NB Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getNBZone <em>NB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getNBZoneElement <em>NB Zone Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getNBZoneGrenze <em>NB Zone Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getOertlichkeit <em>Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getProgDateiGruppe <em>Prog Datei Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getProxyObjekt <em>Proxy Objekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getPZBElement <em>PZB Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getPZBElementZuordnung <em>PZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getPZBZuordnungSignal <em>PZB Zuordnung Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getRBC <em>RBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getRegelzeichnung <em>Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getRegelzeichnungParameter <em>Regelzeichnung Parameter</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchaltmittelFstrZuordnung <em>Schaltmittel Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchaltmittelZuordnung <em>Schaltmittel Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchloss <em>Schloss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchlosskombination <em>Schlosskombination</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchluessel <em>Schluessel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchluesselsperre <em>Schluesselsperre</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSchrankenantrieb <em>Schrankenantrieb</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSignalBefestigung <em>Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSignalFankZuordnung <em>Signal Fank Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSignalRahmen <em>Signal Rahmen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSignalSignalbegriff <em>Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getSonstigerPunkt <em>Sonstiger Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getStellBereich <em>Stell Bereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getStellelement <em>Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getStrecke <em>Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getStreckePunkt <em>Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTechnikStandort <em>Technik Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTechnischerBereich <em>Technischer Bereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTechnischerPunkt <em>Technischer Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTOPKante <em>TOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTOPKnoten <em>TOP Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTrasseKante <em>Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getTrasseKnoten <em>Trasse Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getUeberhoehung <em>Ueberhoehung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getUeberhoehungslinie <em>Ueberhoehungslinie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getUebertragungsweg <em>Uebertragungsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getUnterbringung <em>Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getVerkehrszeichen <em>Verkehrszeichen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getWKrAnlage <em>WKr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getWKrGspElement <em>WKr Gsp Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getWKrGspKomponente <em>WKr Gsp Komponente</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getWeichenlaufkette <em>Weichenlaufkette</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getWeichenlaufketteZuordnung <em>Weichenlaufkette Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZL <em>ZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLDLPAbschnitt <em>ZLDLP Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLDLPFstr <em>ZLDLP Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLFstr <em>ZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLFstrAnstoss <em>ZL Fstr Anstoss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLSignalgruppe <em>ZL Signalgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLSignalgruppeZuordnung <em>ZL Signalgruppe Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLVBus <em>ZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZLVBusUSZuordnung <em>ZLV Bus US Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZN <em>ZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNAkustik <em>ZN Akustik</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNAnzeigefeld <em>ZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNFortschaltKriterium <em>ZN Fortschalt Kriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNTelegramm84Zuordnung <em>ZN Telegramm84 Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNTelegramm85Zuordnung <em>ZN Telegramm85 Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNUnterstation <em>ZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZNZBS <em>ZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZUBBereichsgrenze <em>ZUB Bereichsgrenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZUBStreckeneigenschaft <em>ZUB Streckeneigenschaft</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup#getZugeinwirkung <em>Zugeinwirkung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup()
 * @model extendedMetaData="name='CContainer' kind='elementOnly'"
 * @generated
 */
public interface Container_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anhang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ermöglicht die Aufnahme von Anhangsdokumenten in das Modell. Das Objekt Anhang erlaubt es, im PlanPro Datenmodell Informationen aus bestehenden Dateien vorzuhalten, die nicht durch ein eigenes Objekt im Modell abgebildet sind. Diese Informationen entsprechen den im bisherigen papiergebundenen Prozess beigefügten Anlagen, eben den Anhängen. Die erlaubten Typen von Anhängen sind im Attribut „Anhang Art“ definiert. Der Dateiname der Ursprungsdatei wird im Attribut „Dateiname“ ohne die Endung abgelegt. Die erlaubte Endung wird im Attribut „Dateityp“ definiert. Der eigentliche Inhalt der Ursprungsdatei wird im Attribut „Daten“ als base64-codierte Binärdaten abgelegt. Ein Anhang wird im Datenmodell auf zwei Arten verwendet. Zum einen kann ein Anhang über das Objekt Bearbeitungsvermerk mit jedem Objekt oder Attribut verbunden werden. Dies ist in der Beschreibung des Objekts Bearbeitungsvermerk näher erläutert. Spezielle Anhänge, die direkt in einem Objekt bei der Planung enthalten sein müssen, z.B. INA-Berechnung, werden direkt durch Attribute im jeweiligen Objekt definiert und so ohne den Umweg des Bearbeitungsvermerkes eingebunden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Anhang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang'"
	 * @generated
	 */
	EList<Anhang> getAnhang();

	/**
	 * Returns the value of the '<em><b>Aussenelementansteuerung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technisches Objekt, von dem aus die Ansteuerung der ESTW-Elemente der Außenanlage erfolgt. Außenelementansteuerungen (AEA) können hierarchich angeordnet sein. Über dem höchsten Element der Hierarchie steht immer die ESTW Zentraleinheit. Von allen AEA können ein oder mehrere Elemente der Außenanlage angesteuert sowie deren Zustände eingelesen werden. In der Verkettung zeigt die Verweisrichtung immer auf das in der Hierarchie höhere Element. Die Übertragung von Daten und Energie wird durch getrennte Verweise modelliert. In der konventionellen ESTW-Technik entspricht die AEA dem ESTW-A. Eine Kaskadierung von AEA ist erst in neuerer ESTW-Technik üblich. Gehört ein Schaltkasten zu einem Signal, muss dieser nicht als AEA geplant werden, in dem Fall wird der Schaltkasten als Bestandteil des Signals betrachtet. Kann ein Schaltkasten mehrere Signale steuern, ist er als AEA zu betrachten. Je nach Detaillierungsgrad der Planung kann die primäre und sekundäre Energieversorgung nur in der grundsätzlichen Art oder sogar der tatsächliche Lieferant über einen Verweis auf diesen angegeben werden. Als AEA werden nur Bestandteile des ESTW modelliert. Schnittstellen zu anderen Untergewerken (z. B. PZB, BÜ, ETCS) werden über das Stellelement dargestellt. DB-Regelwerk Darstellung und Beschriftung des ESTW-Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussenelementansteuerung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Aussenelementansteuerung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aussenelementansteuerung'"
	 * @generated
	 */
	EList<Aussenelementansteuerung> getAussenelementansteuerung();

	/**
	 * Returns the value of the '<em><b>Bahnsteig Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parallel zum Gleis gelegenes Element des Tiefbaus mit befestigter Oberfläche zum Zwecke des Zugangs der Reisenden von bzw. zu den Zügen. Ein Bahnsteig kann eine oder mehrere Bahnsteigkanten besitzen. Mehr als zwei Bahnsteigkanten können dazugehören, wenn z. B. an einen Mittelbahnsteig noch ein Zungenbahnsteig anschließt. DB-Regelwerk Ril 813.0201 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bahnsteig Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BahnsteigAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Anlage'"
	 * @generated
	 */
	EList<Bahnsteig_Anlage> getBahnsteigAnlage();

	/**
	 * Returns the value of the '<em><b>Bahnsteig Dach</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Dach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahnsteigkanten-bezogene Abbildung der Bahnsteig-Überdachung. Die Angabe ist im INA-Erhebungsbogen erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bahnsteig Dach</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BahnsteigDach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Dach'"
	 * @generated
	 */
	EList<Bahnsteig_Dach> getBahnsteigDach();

	/**
	 * Returns the value of the '<em><b>Bahnsteig Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parallel zum Gleis verlaufende Kante eines Bahnsteigs, die für den Fahrgastwechsel nutzbar ist. Für die LST-Planung sind Beginn und Ende der genutzten Bahnsteigkante z. B. für die Zugbeeinflussung (PZB 90) sowie die Festlegung von Signalstandorten und Gefahrpunkten maßgebend. Die Baulänge der Bahnsteigkante wird im Datenmodell durch die Länge des Bereichsobjekts Bahnsteig_Kante abgebildet. Eventuell daran anschließende Tiefbauobjekte (auch stillgelegte Bahnsteigbereiche) können als Ingenieurbauwerke (momentan noch nicht modelliert) abgebildet werden. DB-Regelwerk Darstellung einer Doppellinie im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bahnsteig Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BahnsteigKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Kante'"
	 * @generated
	 */
	EList<Bahnsteig_Kante> getBahnsteigKante();

	/**
	 * Returns the value of the '<em><b>Bahnsteig Zugang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnsteig.Bahnsteig_Zugang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zugangspunkt der Reisenden zum Bahnsteig. Es wird jeweils die Mitte der Linie angegeben, auf der der Zugangsweg auf den Bahnsteig stößt. Für die Verwendung im Sicherungstechnischen Lageplan während der Bearbeitung wurde ein neues Symbol erschaffen. Dieses soll im endgültigen Lageplan nicht erscheinen. Der Zugang ist in der LST-Planung für die INA-Berechnung relevant. Hierbei wird der Punkt auf der Bahnsteigkante benötigt, an der der Zustrom der Reisenden erfolgt. Dieser Punkt wird im Datenmodell nicht abgespeichert, er kann aus Bahnsteig_Zugang hergeleitet werden. DB-Regelwerk Nennung des Zugangs im INA-Erhebungsbogen, Verortung erfolgt bisher nicht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bahnsteig Zugang</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BahnsteigZugang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Zugang'"
	 * @generated
	 */
	EList<Bahnsteig_Zugang> getBahnsteigZugang();

	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauelement zur Übertragung von Telegrammen an ETCS-Fahrzeugeinrichtungen. Gesteuerte Balisen sind anhand des Verweises LEU_Ausgang.ID_Balise auf diese Balise zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Balise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Balise'"
	 * @generated
	 */
	EList<Balise> getBalise();

	/**
	 * Returns the value of the '<em><b>Bearbeitungsvermerk</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Bearbeitungsvermerk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang in Form von Datei oder Text zu einem Objekt oder Attribut. Jeder zugelassene Projektbeteiligte kann zu einem Objekt oder Attribut einen Bearbeitungsvermerk anfügen, sofern er die entsprechend notwendige Berechtigung besitzt. Dies gilt für fachliche wie organisatorische Objekte und Attribute. Für ENUM-Attribute ist bei Auswahl des Werts \"sonstige\" zwingend ein Bearbeitungsvermerk anzufügen. Eine Dokumentenbeigabe ist dabei optional. Zu einem Objekt oder Attribut können mehrere Bearbeitungsvermerke erstellt werden. Der Bearbeitungsvermerk enthält vorläufig eine GUID zur Identifikation des Bearbeiters sowie eine GUID für die Signatur. Im Attribut „Bearbeitungsvermerk Rolle“ kann die fachliche Rolle des Bearbeiters abgelegt werden. Kommentare des Bearbeiters werden als Freitext im Attribut „Kommentar“ hinterlegt. Der Bearbeitungsvermerk kann einen Anhang aufnehmen. Um mehrere Anhänge zu einem Objekt zuzuordnen, müssen mehrere Bearbeitungsvermerke erstellt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeitungsvermerk</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Bearbeitungsvermerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bearbeitungsvermerk'"
	 * @generated
	 */
	EList<Bearbeitungsvermerk> getBearbeitungsvermerk();

	/**
	 * Returns the value of the '<em><b>Bedien Anrueckabschnitt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Anrueckabschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Darstellung der Anrückmeldung Auf der Bedienoberfläche wird bei in den Steuerbereich einfahrenden Zügen die Zugnummer oder, wenn diese nicht vorhanden ist, der vom anrückenden Zug belegte Gleisabschnitt angezeigt. Die Anrückmeldung wird aus der ZL generiert. Es wird festgelegt, in der Nähe welchen Gleisabschnittes auf der Bedienoberfläche die Zugnummer bzw. der Gleisabschnitt angezeigt werden soll. Der Gleisabschnitt kann außerhalb des Planungsbereiches liegen. Es muss nicht der direkte Nachbarabschnitt sein, denn z.B. bei Strecken mit hoher Geschwindigkeit wird als Anrückabschnitt auch ein weiter entfernter Gleisabschnitt des Nachbarstellwerks genommen. DB-Regelwerk 819.0603 A2, Tabelle 3, Seite 208 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Anrueckabschnitt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienAnrueckabschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Anrueckabschnitt'"
	 * @generated
	 */
	EList<Bedien_Anrueckabschnitt> getBedienAnrueckabschnitt();

	/**
	 * Returns the value of the '<em><b>Bedien Anzeige Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Stellelementen zu einer örtlichen Bedieneinrichtung und Abbildung von Meldern, Tasten und Schaltern einer örtlichen Bedieneinrichtung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Anzeige Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienAnzeigeElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Anzeige_Element'"
	 * @generated
	 */
	EList<Bedien_Anzeige_Element> getBedienAnzeigeElement();

	/**
	 * Returns the value of the '<em><b>Bedien Bezirk</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bedienung von mehreren ESTW-Zentraleinheiten. Das Objekt Bedien_Bezirk ermöglicht den Anschluss mehrerer ESTW-Zentraleinheiten an einen Bedien_Bezirk z. B. in einer Bedien_Zentrale. Für einen Bedien_Bezirk gibt es zwei Modellierungen / Ausprägungen. 1.) Reell in einer Bedien_Zentrale, Regio-BZ oder sonstigem Technikstandort errichteter Bedien_Bezirk mit angeschalteten ESTW_Zentraleinheiten (mindestens einer) ==\u0026gt; zentraler Bedien_Bezirk 2.) Geplante, auf die Streckeninfrastruktur bezogene, logische Zusammenfassung von betrieblich und geographisch zusammenhängenden Strecken. ==\u0026gt; virtueller Bedien_Bezirk Beispiele: Siehe auch Anlage Media:Bedien Bezirk Typ.pdf 1.) Zentraler Bedien_Bezirk Das Konzept der zentralen Betriebsführung sieht vor, die Bedienung hochwertiger Strecken von ESTW, durch Bedien_Zentralen (Betriebszentralen) zu bündeln. Besonderheit dabei ist, dass in den Bedien_Zentralen selbst keine ESTW_Zentraleinheiten aus Verfügbarkeitsgründen aufgebaut werden dürfen. Das heißt, in den Betriebszentralen sind keine ESTW_Zentraleinheiten sondern nur Bedien_Plätze und Bedien_Bezirke errichtet. Diese Bedien_Bezirke, die die Bedienung hochwertiger Strecken bündeln, sind „zentrale Bedien_Bezirke“. Die Einschränkung, ESTW_Zentraleinheiten nicht im selben Gebäude wie ESTW_Bedien_Bezirke aufzubauen, gilt nicht für eine Regio-BZ oder sonstige Technikstandorte. Auch im Regionalnetz werden ESTW_Zentraleinheiten errichtet. Bisher sind diese örtlich besetzt. Unter anderem ist geplant bzw. in Realisierung, die Gebäude in denen bereits eine Regio-ESTW_Zentraleinheit errichtet ist, eine weitere Regio-ESTW_Zentraleinheit einzubauen. Um auch hier Redundanzen und Synergien nutzen zu können, ist geplant auch hier einen Bedien_Bezirk über die ESTW_Zentraleinheiten zu installieren. Der entscheidende Unterschied zur Bedienzentrale ist hier, dass Bedien_Bezirk und ESTW_Zentraleinheit in einem Gebäude untergebracht sind. Da Strecken sowohl das Regionalnetz und das Fern- und Ballungsnetz durchlaufen können, müssen die Kennzahlenplanungen ebenfalls Netzartübergreifend sein. Siehe auch Attribut „Kennzahl“. 2.) Virtueller Bedienbezirk Als Zweites ist die Option des virtuellen Bedien_Bezirks zu modellieren. Da ein Bedien_Bezirk ja nicht von Heute auf Morgen in ESTW-Technik da steht, müssen Übergangsregelungen geschaffen werden. Auch wenn Stellwerke in einem Bedien_Bezirk (noch) nicht in ESTW-Technik realisiert sind oder die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist gilt: Die Stw sind einem Bedien_Bezirk zuzuordnen um jegliche spätere Realisierungsform zu ermöglichen und so auch die Kennzahlenvergabe sicher zu gestalten. Siehe auch Attribut „Kennzahl“. Am Beispiel der Bedien_Bezirke 08 und 11 in der BZ Hannover sieht man, dass auch Stellwerke, die (noch) nicht an einen Bedien_Bezirk angebunden sind, eine Zuordnung erfahren müssen. Alle Stellwerke (HORX, HK, Sarstedt und Barnten) liegen in einem betrieblich zusammenhängenden Bezirk. Nämlich auf den Nord-Süd Strecken von Hannover Richtung Göttingen. Die Stellwerke HK, Sarstedt und Barnten sogar auf derselben Strecke 1732. Aktuell sind die Stellwerke Sarstedt und Barnten noch nicht an einen Bedien_Bezirk angebunden. In den Planungen und betrieblichen Vorgaben des Regionalbereichs aber für eine Zuordnung zum Bedien_Bezirk 11 vorgesehen. Daher muss schon jetzt der Bedienbezirk den Stw zugeordnet werden können, auch wenn sie ggf. trotz ESTW-Aufbau, örtlich besetzt werden. Durch die Darstellung in dem Verweis „zentral“ oder „virtuell“ lässt sich die aktuelle und geplante Anbindung darstellen. Im Verständnis der Betriebszentralen entspricht das Objekt Bedien_Bezirk dem Steuerbezirk. Das Objekt kann im LST-Datenmodell jedoch auch als virtueller Bedien_Bezirk vorkommen. Jeder ESTW-Zentraleinheit wird auch ein Bedien_Bezirk zugeordnet. In der Regel der, der in der Kennzahlenplanung vorgesehen ist. Also auch dann, wenn physisch kein Bedienbezirk (Steuerbezirk) oder eine vergleichbare Einheit vorhanden ist (z. B. Regionale Bedienzentrale mit nur einer ESTW-Zentraleinheit), aber bestimmte Eigenschaften mehrerer gemeinsam gesteuerter ESTW-Zentraleinheiten übergreifend geplant werden müssen (z.B. Richtungssinn und Kennzahlen). Gemäß Richtlinie 819.0603 müssen Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht über das Modell abgebildet werden, sondern muss in der Plausibilitäts- und Zulässigkeitsprüfung (PlaZ) abgefangen werden. Die Vorgabe für den Richtungssinn bezieht sich immer auf einen kompletten Steuerbezirk. Sie ist jedoch als Eigenschaft der Bedienoberfläche modelliert. Gegebenenfalls müssen hier Zulässigkeitsprüfungen ablaufen. Im Bedienbezirk werden außerdem die Angaben für die Datenkommunikation mit den zugeordneten ESTW-Zentraleinheiten geplant. Die Werte A, B und C werden nach Ril 819.0705A01 von der DB Netz festgelegt. Der Ansprechpartner findet sich in der Ril. Alle weiteren Werte lassen sich anhand dieser Unterlage bestimmen. Siehe Anlage Media:ipadr namensv ib1.pdf DB-Regelwerk 819.0603 819.0705A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Bezirk</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienBezirk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Bezirk'"
	 * @generated
	 */
	EList<Bedien_Bezirk> getBedienBezirk();

	/**
	 * Returns the value of the '<em><b>Bedien Einrichtung Oertlich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung einer örtlichen Bedieneinrichtung (Stelltafel, Bedienpult etc.) als physisches Element der Außenanlage. Bedienbare Elemente, die nicht von einer ESTW-Bedienoberfläche bedient werden, sind durch eine entsprechende Bedieneinrichtung umstellbar. Weiterhin sind in der Bedieneinrichtung Tasten für die Kommunikation zwischen özF und Bediener untergebracht. Im Objekt Bedien_Einrichtung_Oertlich wird die physische Ausbildung der Bedieneinrichtung abgebildet. Die dazugehörigen Melder, Schalter und Taster sind im Objekt Bedien Anzeige Element modelliert. Die logischen Funktionen einer Bedieneinrichtung für Nahbedienbereiche und Bahnübergänge befinden sich in den Objekten „BUE Bedien Anzeige Element“ oder „NB Bedien Anzeige Element“. Die Bedien_Einrichtung_Oertlich kommt zur Anwendung bei: Nahbedienbereichen Bahnübergängen (HET, UT, etc.) Gefahrschaltern (Berliner S-Bahn) (noch nicht abschließend modelliert) Schlüsselschaltern- und Tastern (Zustimmung, Gleisfreimeldung, Zugschlussmeldung, etc.) ZP 10/9 –Bediensäulen örtliche Abgabe von Zugschlussmeldungen und Bedieneinrichtungen an Schnittstellen zum Zugleitbetrieb. Bedieneinrichtungen von elektrisch ortsgestellten Weichen (EOW) werden mit diesem Objekt nicht modelliert. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Einrichtung Oertlich</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienEinrichtungOertlich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Einrichtung_Oertlich'"
	 * @generated
	 */
	EList<Bedien_Einrichtung_Oertlich> getBedienEinrichtungOertlich();

	/**
	 * Returns the value of the '<em><b>Bedien GBT</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_GBT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planung aller Parameter, die für die Darstellung der Gleisbenutzungstabelle (GBT) auf dem Bedienplatz für den Nutzer erforderlich sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien GBT</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienGBT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_GBT'"
	 * @generated
	 */
	EList<Bedien_GBT> getBedienGBT();

	/**
	 * Returns the value of the '<em><b>Bedien Oberflaeche</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topologisches Abbild der für die Bedienung und Anzeige eines ESTW relevanten sicherungstechnischen Anlagen. Dies wird in Form von Meldebildern mit unterschiedlicher Informationstiefe dargestellt. Darüber hinaus gibt es weitere zum Bedienplatzsystem gehörende Meldebilder. Folgende Meldebildtypen stehen an einem Bedienplatzsystem (BPS) zur Verfügung: Bereichsübersicht (Berü), Bereichsübergreifende Berü, Lupe, Gleisbenutzungstabelle (GBT), Kommunikationsanzeige (KA), KA-Bild 1 (PSI-Spiegel), KA-Bild 2 (ESTW-Störungsmeldungen), Betriebsstatus (Rechnerstörungen), Sammelmelderbild (SM-Bild), Dokumentation (Doku), Integrierte Bedienerführung. An anderen Bedienplatzsystemen können andere Meldebildtypen möglich sein. Die Eigenschaften eines Bildes sind unter dem Objekt Bedien Oberflaeche Bild zusammengefasst. Mehrere Bilder verweisen auf das Objekt Bedien_Oberflaeche. Die Möglichkeiten der Aufschaltung der jeweiligen Bedienoberflächen auf den Bedienplätzen sind implizite Stellwerksfunktion. Die dazu notwendigen Berechtigungen sind Betriebsdaten der Instandhaltung. Diese Parameter werden im PT I nicht geplant und im Datenmodell nicht abgebildet. Sondern von der örtlichen Instandhaltung in die Systeme eingegeben. Die Bildbezeichnung des jeweiligen Oberflächenbildes nach der signifikanten (also der bedeutenstenten) Betriebsstelle entsprechend Richtlinie 819.0603 in der Form \"(Bildart)_(Ril 100 Abk)\" wird über die Attribute Oberflaeche Bildart und ID Oertlichkeit gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Oberflaeche</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienOberflaeche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oberflaeche'"
	 * @generated
	 */
	EList<Bedien_Oberflaeche> getBedienOberflaeche();

	/**
	 * Returns the value of the '<em><b>Bedien Oberflaeche Bild</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Bild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusammenfassung der Eigenschaften, die sich jeweils nur auf ein Bild der Bedienoberfläche beziehen. Eigenschaften, die alle Bilder betreffen, sind unter Bedien Oberflaeche eingebunden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Oberflaeche Bild</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienOberflaecheBild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oberflaeche_Bild'"
	 * @generated
	 */
	EList<Bedien_Oberflaeche_Bild> getBedienOberflaecheBild();

	/**
	 * Returns the value of the '<em><b>Bedien Oertlichkeit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oertlichkeit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung einer Oertlichkeit zum Bedien Bezirk, aus dem sie bedient wird. Dabei werden in diesem Zuordnungsobjekt die vorhandenen Angaben aus dem Objekt Örtlichkeit der jeweiligen Betriebsstelle um weitere Angaben wie beispielsweise die ESTW-Kennzahl oder den Betriebsstellenbezeichner (Streckenziel) planerisch angereichert. Gemäß Richtlinie 819.0603 müssen die ESTW-Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht über das Modell abgebildet werden, sondern muss in der Plausibilitäts- und Zulässigkeitsprüfung (PlaZ) abgefangen werden. Siehe Beispiel Media:Lupen HBS1.pdf \"Bf Braunschweig Hbf (HBS) 30\": Betriebsstellenbezeichner ==\u0026gt; \"Bf Braunschweig Hbf\", Oertlichkeit ==\u0026gt; \"HBS\", Kennzahl ==\u0026gt; \"30\". DB-Regelwerk 819.0603 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Oertlichkeit</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienOertlichkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oertlichkeit'"
	 * @generated
	 */
	EList<Bedien_Oertlichkeit> getBedienOertlichkeit();

	/**
	 * Returns the value of the '<em><b>Bedien Platz</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtliche Anordnung der Bedien- und Meldeeinrichtungen zur betrieblichen Nutzung eines elektronischen Stellwerks. Der Bedien_Platz kann sowohl an einem Bedien_Bezirk wie auch an einer ESTW_Zentraleinheit angeschaltet sein. Der Aufstellungsort muss aber nicht zwingend der Anschalteort sein. Der Bedien_Platz kann auch als abgesetzter Bedien_Platz an abweichenden Orten untergebracht sein. Z.B. wenn im Modulgebäude der ESTW_Zentraleinheit nicht ausreichend Platz ist und der Bedien_Platz im benachbartem alten Stellwerksgebäude untergebracht werden soll. Um dem Lieferanten die allgemeine Ausprägung des Bedien_Platzes im PT 1 zu beschreiben, ist noch der Hinweis zu erbringen, ob es sich um einen Not-Bedien_Platz oder einen Standard-Bedien_Platz handelt. Da es verschiedne Kombinationen und mehere Instanzen von Bedien_Platz geben kann, hier noch mal Beispielhafte Varianten: ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit örtlichem Notbedienplatz im Modulgebäude und Standardbedienplätzen in der Bedien_Zentrale (z.B. ESTW Orxhausen/Siemens) ESTW_Zentraleinheit mit abgesetzten Standardbedienplätzen und mit örtlichem Notbedienplatz im Modulgebäude (z.B. ESTW Kreiensen/Bombardier) ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit abgesetztem Notbedienplatz im Altstellwerk und Standardbedienplätzen in der Bedien_Zentrale (z.B. ESTW Oldenburg Nord/Siemens) Aus diesem Zusammenhang entstehen vier Typen von Bedienplätzen. Standard-Bedienplatz-System (Standard_BPS) Standard-Bedienplatz-System abgesetzt (Standard_BPS_Abgesetzt) Not-Bedienplatz Not-BPS-System (Not_BPS) Not-Bedienplatz Not-BPS-System abgesetzt (Not_BPS_Abgesetzt) Im PT 1 BZ werden für den Bedienplatz die Aufstellung im Raum, die Ausstattung und Ausrüstung sowie die Versorgung mit elektrischer Energie und Daten geplant. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Schematischer Plan der Strom- und Datenversorgung am Bedienplatz: Media:Plan Stromversorgung BPL BZH.pdf. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Platz</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienPlatz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Platz'"
	 * @generated
	 */
	EList<Bedien_Platz> getBedienPlatz();

	/**
	 * Returns the value of the '<em><b>Bedien Standort</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Standort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei DSTW: Standort, von dem die Bedienung der DSTW erfolgt. Von einem Bedienstandort können mehrere Technikstandorte bedient werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Standort</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienStandort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Standort'"
	 * @generated
	 */
	EList<Bedien_Standort> getBedienStandort();

	/**
	 * Returns the value of the '<em><b>Bedien Zentrale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bedienung.Bedien_Zentrale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Betriebsleitstelle eines EIU, aus der die Leit- und Sicherungstechnik von zentral gesteuerten ESTW planmäßig bedient wird. Die Betriebsleitstelle kann eine Betriebszentrale (BZ) der DB Netz oder auch eine zentrale Bedienstelle der Regionalnetze sein. Da die Bedien_Zentrale nicht notwendigerweise in der Nähe von Gleisen liegt, wird kein unmittelbarer Bezug zu einer Strecke hergestellt. Eine Örtlichkeit wird jedoch nach Ril 100 für den Standort festgelegt. In der Bedien_Zentrale sind die spezifischen Anhänge dargestellt. Weitere Pläne aus dem PT I BZ, wie beispielsweise Belegungspläne für Bodentanks, Kabelübersichtspläne, Verteilerbelegungspläne, Schrankpläne, Höheneinheiten und Patchfeldbelegungen in den Schränken für die BZ, werden als allgemeiner Anhang für die vererbten Eigenschaften aus dem Basisobjekt (Attribut Anhang) im Objekt Bedien_Zentrale angehängt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Zentrale</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BedienZentrale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedien_Zentrale'"
	 * @generated
	 */
	EList<Bedien_Zentrale> getBedienZentrale();

	/**
	 * Returns the value of the '<em><b>Binaerdatei</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binärdatei mit betriebssystemnahen Metadaten (z. B. Dateiname, Dateityp).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binaerdatei</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Binaerdatei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binaerdatei'"
	 * @generated
	 */
	EList<Binaerdatei> getBinaerdatei();

	/**
	 * Returns the value of the '<em><b>Block Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Block.Block_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Einrichtungen für die blocktechnische Sicherung von Zugfahrten auf Streckengleisen. Die zugehörige Bezeichnung des Streckengleises wird über das Objekt Gleis Bezeichnung ermittelt. Die Klammern der Gleisbezeichnung für Streckengleise sind Bestandteil der Gleisbezeichnung. Für die Darstellung der Streckendaten für eine Blockstrecke wird über das Objekt Block Element das Objekt Block Strecke verwendet. Ist Streckenblock geplant, wird einem Streckengleis eine Block_Anlage zugeordnet. Bei einer zweigleisigen Strecke, bei der beide Streckengleise mit Streckenblock ausgerüstet sind, wird den beiden Streckengleisen jeweils eine eigene Block_Anlage zugeordnet. Eine Block_Anlage verfügt über zwei Block_Elemente A und B (Blockendstellen), die entsprechend der Regelfahrrichtung zugewiesen werden. Bei eingleisigen Strecken ergibt sich der Richtungssinn A - B aus der Streckenkilometrierung. Eine Ausnahme bildet der Stichstreckenblock, dem nur ein Block Element zugeordnet wird. Als Zusammenfassung aller Objekte wird auch die Bezeichnung Block verwendet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BlockAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Anlage'"
	 * @generated
	 */
	EList<Block_Anlage> getBlockAnlage();

	/**
	 * Returns the value of the '<em><b>Block Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Block.Block_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element am Ende einer Blockstrecke/Blockanlage. Ein Streckengleis, welches mit einer Block Anlage ausgerüstet ist, besitzt zwei korrespondierende Blockelemente in den benachbarten Betriebsstellen. Eine Ausnahme bildet der Stichstreckenblock, der nur ein Block_Element besitzt. Das Block_Element verweist auch auf die zugehörige Blockstrecke, die die relevanten blocktechnischen und betrieblichen Daten der Strecke enthält. Bei zweigleisigen Strecken verweisen zwei Blockelemente auf die Blockstrecke. Das Block_Element verweist auf ein Signal in Form des Streckenziels (A-Feld) und auf ein Schaltmittel zur Räumungsprüfung (E-Feld). Wenn eine gesonderte Zugschlussmeldung verwendet wird, wird mit ID_Zugschlussmeldung auf eine entsprechende Bedieneinrichtung verwiesen. Aus der Blockbauform der jeweiligen Endstelle kann die Art der technischen Realisierung erkannt werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BlockElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Element'"
	 * @generated
	 */
	EList<Block_Element> getBlockElement();

	/**
	 * Returns the value of the '<em><b>Block Strecke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Block.Block_Strecke}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speicherung der betrieblich relevanter Streckendaten einer Blockstrecke. Das Objekt enthält die zwischen zwei Zugmeldestellen typischen betrieblichen Informationen (Streckendaten) zur Information. Es wird dem Blockelement der zugehörigen Blockstelle zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Strecke</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BlockStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Strecke'"
	 * @generated
	 */
	EList<Block_Strecke> getBlockStrecke();

	/**
	 * Returns the value of the '<em><b>BUE Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der baulichen Anlage des Bahnübergangs (BÜ) einschließlich der technischen Sicherung, sofern vorhanden. Zurzeit beschränken sich die Angaben auf den im Lageplan darzustellenden Teil des BÜ. Zu einem späteren Zeitpunkt werden die spezifischen BÜ-Sicherungsanlagen wie Lichtzeichen, Andreaskreuze, Schrankenantriebe, Belag im BÜ-Bereich etc. in das Modell aufgenommen. Gleiches gilt für die Einschaltstreckenberechnung sowie die Beeinflussungsberechnung. Das Objekt wird auf den Kreuzungspunkt (in der Mitte der kreuzenden Straße) verortet; damit ergibt sich die sogenannte BÜ-Mitte gemäß Einschaltstreckenberechnung. DB-Regelwerk Für die Planung von Bahnübergängen gelten folgende Regelwerke: 815 819.12xx Die konkreten Bezüge zum Regelwerk werden in den einzelnen Attributen angegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage'"
	 * @generated
	 */
	EList<BUE_Anlage> getBUEAnlage();

	/**
	 * Returns the value of the '<em><b>BUE Anlage Strasse</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Straßenbezogene Angaben zur BUE_Anlage, die im Wesentlichen im Rahmen der bautechnischen Planung benötigt werden. Die Themen Längsneigung und Ausrundungshalbmesser werden aufgrund der Vielzahl notwendiger Angaben nicht im Modell abgebildet (separate Betrachtung erforderlich).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Anlage Strasse</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEAnlageStrasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_Strasse'"
	 * @generated
	 */
	EList<BUE_Anlage_Strasse> getBUEAnlageStrasse();

	/**
	 * Returns the value of the '<em><b>BUE Anlage V</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu gleis- und straßenseitigen Mindest- und Höchstgeschwindigkeiten für die Einschaltstreckenberechnung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Anlage V</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEAnlageV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Anlage_V'"
	 * @generated
	 */
	EList<BUE_Anlage_V> getBUEAnlageV();

	/**
	 * Returns the value of the '<em><b>BUE Ausschaltung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Ausschaltung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt, das alle Informationen zur Ausschaltung eines Bahnübergangs enthält. Über den Verweis auf BUE Gleisbezogener Gefahrraum findet eine Verortung am zugehörigen Gleis statt, für das der Ausschaltkontakt angeordnet wird. Der Ausschaltkontakt selbst ist über das Objekt Schaltmittel Zuordnung abgebildet. Für die BUE_Ausschaltung ist, in Fahrtrichtung Ausschaltkontakt weg vom BÜ gesehen, die RÜCKGELEGENE Grenze von BUE Gleisbezogener Gefahrraum für die Verortung maßgebend. Die Gefahrraum-Grenze liegt damit in Fahrtrichtung VOR dem Ausschaltkontakt. DB-Regelwerk 815.0032 4 (3) Die Planung der Ausschaltung erfolgt entsprechend der Projektierungshinweise der konkreten BÜ-Technik. Seitens der Ril 815 gibt es dazu keine konkreten Vorgaben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Ausschaltung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEAusschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Ausschaltung'"
	 * @generated
	 */
	EList<BUE_Ausschaltung> getBUEAusschaltung();

	/**
	 * Returns the value of the '<em><b>BUE Bedien Anzeige Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Definition der logischen Bedienfunktionen, die über Taster auf den BÜ einwirken. Es dient der Zuordnung der ausgewählten Bedienfunktionen zum BÜ bzw. zu den Ein-/Ausschaltungen des zugehörigen Gleises. Die Zuordnung zur physischen Unterbringung erfolgt über den Verweis auf Bedien Anzeige Element. DB-Regelwerk 819.1204 8 TM 2012 - 001 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Bedien Anzeige Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEBedienAnzeigeElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Bedien_Anzeige_Element'"
	 * @generated
	 */
	EList<BUE_Bedien_Anzeige_Element> getBUEBedienAnzeigeElement();

	/**
	 * Returns the value of the '<em><b>BUE Deckendes Signal Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Zuordnungsobjekt BUE_Deckendes_Signal bildet die diesbezügliche Angabe in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung ab. Die Angaben in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung beziehen sich auf das deckende Signal (Haupt-/LS-Signal) und nicht auf die den BÜ-Schließvorgang anstoßende Fahrstraße. DB-Regelwerk Signaltabelle 1, Zeile 33 und 34 Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Deckendes Signal Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEDeckendesSignalZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Deckendes_Signal_Zuordnung'"
	 * @generated
	 */
	EList<BUE_Deckendes_Signal_Zuordnung> getBUEDeckendesSignalZuordnung();

	/**
	 * Returns the value of the '<em><b>BUE Einschaltung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt, das alle Informationen zur Einschaltung eines Bahnübergangs (BÜ) enthält. Über den Verweis auf BUE Gleisbezogener Gefahrraum findet eine Verortung am zugehörigen Gleis statt, für das der Einschaltkontakt angeordnet wird. Der Einschaltkontakt selbst ist über das Objekt Schaltmittel Zuordnung abgebildet. Für die BUE Einschaltung ist die in Fahrtrichtung von Anrückmelder / Einschaltkontakt in Richtung BÜ die VOR der BÜ-Mitte liegende Grenze von BUE Gleisbezogener Gefahrraum maßgebend, auf dem das Objekt verortet wird. Die Gefahrraum-Grenze liegt damit in Fahrtrichtung HINTER dem Anrückmelder / Einschaltkontakt. Bei Ausbildung des Einschaltpunktes als Doppelschleife gelten hinsichtlich des maßgebenden Einschaltpunktes gemäß Einschaltstreckenberechnung folgende Unterschiede: Hersteller PintschBamag: maßgebend ist die Mitte der in Fahrtrichtung BÜ liegenden ERSTEN Schleife Hersteller Scheidt\u0026amp;Bachmann: maßgebend ist die Mitte der in Fahrtrichtung BÜ liegenden ZWEITE Schleife DB-Regelwerk 815.0033 in Verbindung mit Einschaltstreckenberechnung Die Angaben zur BÜ-Einschaltung beschränken sich gegenwärtig auf die Planungswerte mit Auswirkungen auf das Stellwerk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Einschaltung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEEinschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Einschaltung'"
	 * @generated
	 */
	EList<BUE_Einschaltung> getBUEEinschaltung();

	/**
	 * Returns the value of the '<em><b>BUE Einschaltung Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Einschaltung_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt zur Zuordnung zwischen BUE Einschaltung und zugehörigem BUE Gleisbezogener Gefahrraum. Im Regelfall wirkt eine BUE_Einschaltung direkt auf einen gleisbezogenen Gefahrraum; das Zuordnungsobjekt wäre nicht erforderlich. Liegt jedoch zwischen BUE_Einschaltung und dem BÜ eine Weichenverbindung, wird eine Zuordnung der BUE_Einschaltung auf mehrere gleisbezogene Gefahrräume notwendig. Diese Verbindung stellt das Zuordnungsobjekt her. Zur Vereinheitlichung wurde auf eine Choice zwischen direktem Verweis von BUE_Einschaltung auf BUE_Gleisbezogener_Gefahrraum und den Verweisen durch das Zuordnungsobjekt verzichtet. DB-Regelwerk Dieser Anwendungsfall ist im Regelwerk der DB AG nicht explizit beschrieben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Einschaltung Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEEinschaltungZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Einschaltung_Zuordnung'"
	 * @generated
	 */
	EList<BUE_Einschaltung_Zuordnung> getBUEEinschaltungZuordnung();

	/**
	 * Returns the value of the '<em><b>BUE Gefahrraum Eckpunkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eckpunkt des BÜ-Gefahrraums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Gefahrraum Eckpunkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEGefahrraumEckpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Gefahrraum_Eckpunkt'"
	 * @generated
	 */
	EList<BUE_Gefahrraum_Eckpunkt> getBUEGefahrraumEckpunkt();

	/**
	 * Returns the value of the '<em><b>BUE Gleisbezogener Gefahrraum</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bereichsobjekt, das den Gefahrraum eines BÜ für ein Gleis abbildet. Die Grenzen des Bereichsobjektes liegen jeweils auf dem Schnittpunkt zwischen Gefahrraumkante und zugehörigem Gleis. Die zugehörigen Ein- und Ausschaltelemente verweisen auf die jeweilige Grenze des Bereichsobjektes. Für jedes Gleis am BÜ ist ein solches Objekt vorzusehen. Somit hat ein BÜ bzw. eine BUE Anlage immer genauso viele Instanzen von BUE_Gleisbezogener_Gefahrraum wie BÜ-Gleise. Zu einem späteren Zeitpunkt werden ggf. weitere, Gefahrraum-spezifische Angaben ergänzt. DB-Regelwerk 819.1210 7 (1)-(3) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Gleisbezogener Gefahrraum</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEGleisbezogenerGefahrraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Gleisbezogener_Gefahrraum'"
	 * @generated
	 */
	EList<BUE_Gleisbezogener_Gefahrraum> getBUEGleisbezogenerGefahrraum();

	/**
	 * Returns the value of the '<em><b>BUE Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gleisbezogene Abbildung der BÜ-Kante zur Berechnung des Sicherheitsabstands bei Hp-gedeckten Bahnübergängen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Kante'"
	 * @generated
	 */
	EList<BUE_Kante> getBUEKante();

	/**
	 * Returns the value of the '<em><b>BUE Kreuzungsplan</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verortungspunkte des für die BÜ-Planung verwendeten bautechnischen BÜ-Kreuzungsplans. Sofern der Anhang nicht als GeoTiff vorliegt, sind mindestens 2 Verortungspunkte anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Kreuzungsplan</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEKreuzungsplan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Kreuzungsplan'"
	 * @generated
	 */
	EList<BUE_Kreuzungsplan> getBUEKreuzungsplan();

	/**
	 * Returns the value of the '<em><b>BUE Schnittstelle</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Schnittstelle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schnittstelle zwischen dem Planer des ESTW und dem Planer der technischen Sicherung des Bahnübergangs. Im ESTW wird eine technische Schnittstelle für Hp-Abhängigkeiten zwischen ESTW und BÜ und/oder Fernüberwachung (FÜ) durch den özF vorgesehen. Bau-BÜ, die über eine Schlüsselsperre gesichert werden, sowie nichttechnisch gesicherte BÜ erhalten keine BUE_Schnittstelle. DB-Regelwerk Die betreffenden Angaben finden sich im \"Datenblatt für die Abhängigkeiten BÜ - Stw\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Schnittstelle</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUESchnittstelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Schnittstelle'"
	 * @generated
	 */
	EList<BUE_Schnittstelle> getBUESchnittstelle();

	/**
	 * Returns the value of the '<em><b>BUE Spezifisches Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Spezifisches_Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Zuordnung von Signalen, die ausschließlich im Zusammenhang mit einem Bahnübergang (BÜ) angeordnet werden. Dazu gehören zum Beispiel Pfeiftafeln, Lf-Signale mit und ohne Zusatz \"BÜ\" oder Überwachungssignale für BÜ, Merktafeln oder Merkpfähle u.a. Die Anwendung von Pfeiftafeln und Lf-Signalen erfolgt zumeist bei nichttechnisch gesicherten BÜ; die Anwendung der Überwachungssignale bei Bahnübergängen der Funktionsüberwachung \"ÜS\". Für die vorgenannten Fälle ist der Verweis auf BUE Anlage zu befüllen. Wird zum Beispiel ein Merkpfahl zur Kennzeichnung eines Einschaltpunktes (Anwendung in besonderen Planungsfällen) vorgesehen, ist der Verweis auf BUE Einschaltung zu befüllen. Für die Bezeichnung von BÜ-spezifischen Signalen, insbesondere Überwachungssignale, sind Ausführungen auf der Seite Bezeichnung Signal vorhanden. DB-Regelwerk Formblatt zur Ermittlung der Sichtflächen für nichttechnisch gesicherte BÜ 819.1204 9 für ÜS SPU 24 für Merktafel /-pfahl BÜ-Kabellage- und -übersichtsplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Spezifisches Signal</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUESpezifischesSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Spezifisches_Signal'"
	 * @generated
	 */
	EList<BUE_Spezifisches_Signal> getBUESpezifischesSignal();

	/**
	 * Returns the value of the '<em><b>BUEWS Fstr Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_WS_Fstr_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zwischen BUE-Einschaltung und zugehörigen Fahrstraßen, für die die Wirksamkeitskontakte wirken sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUEWS Fstr Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_BUEWSFstrZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_WS_Fstr_Zuordnung'"
	 * @generated
	 */
	EList<BUE_WS_Fstr_Zuordnung> getBUEWSFstrZuordnung();

	/**
	 * Returns the value of the '<em><b>Datenpunkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beeinflussungspunkt bestehend aus einer Einzelbalise oder Balisengruppe und ggf. einer LEU. In europäischen Spezifikationen wird der Begriff \"Balisengruppe\" auch synonym für \"Datenpunkt\" verwendet. Ein ungesteuerter Datenpunkt besteht ausschließlich aus ungesteuerten Balisen (Festdatenbalisen). Die Attributgruppe darf nur ausgewählt werden, wenn ausschließlich ESG-Telegramme enthalten sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenpunkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Datenpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt'"
	 * @generated
	 */
	EList<Datenpunkt> getDatenpunkt();

	/**
	 * Returns the value of the '<em><b>Datenpunkt Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linking-Information zu einem nachfolgenden Datenpunkt. Die Information kann in mehreren Fachtelegrammen verwendet werden. Die Festlegung erfolgt nur bei ZBS und GNT im Rahmen des PT 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenpunkt Link</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_DatenpunktLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Link'"
	 * @generated
	 */
	EList<Datenpunkt_Link> getDatenpunktLink();

	/**
	 * Returns the value of the '<em><b>ESTW Zentraleinheit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zentrale Komponente eines ESTW. Die ESTW-Zentraleinheit (ZE) steuert alle untergeordneten Aussenelementansteuerungen, stellt die Verbindung zu den Bedienbezirken (Notbedienplatz, Steuerbezirk/Zentralbedienung) und zu Nachbar-ESTW-Zentraleinheiten, zur Zuglenkung und zur Zugnummernmeldeanlage her. Die ZE kann ein ESTW-Z oder eine ESTW-UZ sein. Die geografische Grenze einer ZE liegt immer an einem Haupt- oder Sperrsignal (Signal_Real_Aktiv) oder einem Bedienpunkt (Signal_Fiktiv), in der Regel an einem Einfahrsignal. Die von einer Unterzentrale benötigten Adressformeln nach Richtlinie 819.0705 werden über die Verknüpfung zu Bedien Bezirk bereitgestellt. DB-Regelwerk Darstellung des ESTW-Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002, Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESTW Zentraleinheit</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ESTWZentraleinheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESTW_Zentraleinheit'"
	 * @generated
	 */
	EList<ESTW_Zentraleinheit> getESTWZentraleinheit();

	/**
	 * Returns the value of the '<em><b>ETCS Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung der Kante des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ETCSKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Kante'"
	 * @generated
	 */
	EList<ETCS_Kante> getETCSKante();

	/**
	 * Returns the value of the '<em><b>ETCS Knoten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung des Knotens des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell. Bei Kreuzungsweichen erfolgt die Verortung zweifach, sonst einfach.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Knoten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ETCSKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Knoten'"
	 * @generated
	 */
	EList<ETCS_Knoten> getETCSKnoten();

	/**
	 * Returns the value of the '<em><b>ETCS Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzangaben für Signale im Zusammenhang mit ETCS L2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Signal</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ETCSSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal'"
	 * @generated
	 */
	EList<ETCS_Signal> getETCSSignal();

	/**
	 * Returns the value of the '<em><b>ETCSW Kr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzangaben für Weichen und Kreuzungen im Zusammenhang mit ETCS L2. Ortsgestellte Weichen sind gemäß der Vorgaben in Ril 819.1344 zu berücksichtigen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCSW Kr</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ETCSWKr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_W_Kr'"
	 * @generated
	 */
	EList<ETCS_W_Kr> getETCSWKr();

	/**
	 * Returns the value of the '<em><b>EV Modul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.EV_Modul}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Energieversorgungsmodul. Einheit, die die Energieversorgung aller Ihr zugeordneten Elemente sicherstellt. Das EV-Modul kann physisch (eigenes Element) oder virtuell (Energie-Abgriff von bestehendem Element) sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EV Modul</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_EVModul()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EV_Modul'"
	 * @generated
	 */
	EList<EV_Modul> getEVModul();

	/**
	 * Returns the value of the '<em><b>Fachtelegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informationen auf Planungsebene, die einem Datenpunkt in Abhängkeit eines Signalbegriffs oder anderer Eingangsinformationen zugeordnet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fachtelegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Fachtelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fachtelegramm'"
	 * @generated
	 */
	EList<Fachtelegramm> getFachtelegramm();

	/**
	 * Returns the value of the '<em><b>Fla Freimelde Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Freimelde_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung der freizuprüfenden Freimeldeabschnitte zur jeweiligen Flankenschutzmaßnahme. DB-Regelwerk Flankenschutztabelle, Spalte 10 \"überwachter Schutzraum\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Freimelde Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FlaFreimeldeZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Freimelde_Zuordnung'"
	 * @generated
	 */
	EList<Fla_Freimelde_Zuordnung> getFlaFreimeldeZuordnung();

	/**
	 * Returns the value of the '<em><b>Fla Schutz</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Darstellung der technischen Maßnahmen, um Flankenschutz zu gewährleisten. DB-Regelwerk 819.0505 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Schutz</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FlaSchutz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Schutz'"
	 * @generated
	 */
	EList<Fla_Schutz> getFlaSchutz();

	/**
	 * Returns the value of the '<em><b>Fla Zwieschutz</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Zwieschutz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Verhaltensweise einer Zwieschutzweiche, wenn sie gleichzeitig in beiden Stellungen für den Flankenschutz angefordert wird. DB-Regelwerk Zwieschutzweichentabelle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Zwieschutz</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FlaZwieschutz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Zwieschutz'"
	 * @generated
	 */
	EList<Fla_Zwieschutz> getFlaZwieschutz();

	/**
	 * Returns the value of the '<em><b>FMA Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Anlage, die einen Gleisabschnitt auf Freisein von Schienenfahrzeugen überwacht; entspricht im gewöhnlichen Sprachgebrauch dem Freimeldeabschnitt. Eine FMA_Anlage wird alleinstehend zur Fahrwegfreiprüfung bzw. zur Freiprüfung des Flankenschutzraumes genutzt sowie in Auswertung der Reihenfolge von Belegung und Wieder-Frei-Werden zur Erfassung einer Fahrt und damit zur Auflösung von Teilfahrstraßen. Auch andere Schaltvorgänge können durch eine FMA_Anlage ausgelöst werden. Die FMA_Anlage hat mindestens eine Außenanlage (z. B. Drosselspule, Achszählpunkt) und beansprucht Anteile an einer Gleisfreimelde-Innenanlage (z. B. Motorrelaisgruppe, Achszählrechner). DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan; Gleisfreimeldepläne (Achszählübersichtsplan, Gleisisolierplan); Freimeldetabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FMAAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Anlage'"
	 * @generated
	 */
	EList<FMA_Anlage> getFMAAnlage();

	/**
	 * Returns the value of the '<em><b>FMA Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ortung.FMA_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzung einer FMA Komponente bei Gleisstromkreisen um die Bauelemente zur Ein- und Ausspeisung. FMA_Elemente werden rechts und/oder links der FMA_Komponente direkt den angrenzenden FMA_Anlagen zugewiesen. Das Objekt ist bei Achszählpunkten nicht erforderlich. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisisolierplan, Freimeldetabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FMAElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Element'"
	 * @generated
	 */
	EList<FMA_Element> getFMAElement();

	/**
	 * Returns the value of the '<em><b>FMA Komponente</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ortung.FMA_Komponente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freimeldeabschnittsgrenze (Isolierstoß, elektrischer Stoß, Achszählpunkt). Die FMA_Komponente wird dem Punkt im Gleis zugeordnet, bis zu dem die Erkennung einer Belegung gemäß Anwendungsrichtlinien als gesichert gilt. Die zu den zugehörigen Gleisabschnitten gehörenden Bereichsobjekte Gleis Abschnitt müssen deshalb exakt an diesem Punktobjekt enden. Zur Ermittlung der seitlichen Lage einer FMA_Komponente siehe Modellierung Gleisfreimeldung. Eine FMA_Komponente kann nur an einer Seite mindestens einen Freimeldeabschnitt oder beidseitig jeweils mindestens einen Freimeldeabschnitt begrenzen. Bei überlappenden Freimeldeabschnittsgrenzen (z.B. am Übergang von FTGS- zu Achszähl- Gleisfreimeldeanlagen) ist jede Freimeldeabschnittsgrenze für sich als FMA_Komponente zu erfassen. Direkt auf Höhe, rechts und/oder links der Freimeldeabschnittsgrenze können sich technische Anlagen für die Gleisfreimeldung befinden, siehe dazu FMA Element. Das Befahren einer FMA_Komponente kann auch weitere Schaltvorgänge auslösen, siehe dazu Schaltmittel Zuordnung. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan; Achszählübersichtsplan; Freimeldetabelle; Achszähltabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Komponente</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FMAKomponente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente'"
	 * @generated
	 */
	EList<FMA_Komponente> getFMAKomponente();

	/**
	 * Returns the value of the '<em><b>Fstr Abhaengigkeit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung aller für einen Fstr Fahrweg zu sichernden und nicht durch die Topologie auffindbaren Objekte. Nicht durch die Topologie findbar sind insbesondere: Schluesselsperre, Zustimmungsschalter/-taster. Spezialfall: Für eine Rangierstraße kann richtungsabhängig geplant werden, dass eine Schlüsselsperre im Zielgleis nicht überwacht wird. In dem (sehr seltenen) Fall müssen für eine Zug- und eine Rangierstraße mit identischem Fahrweg zwei Instanzen Fstr Fahrweg angelegt werden. DB-Regelwerk Schlüsselsperre: Zugstraßentabelle, Spalte 5: \"Ssp in der Fahrstraße verschlossen und überwacht\"; Rangierstraßentabelle, Spalte 15: \"Ssp in der Rangierstraße verschlossen und überwacht\". Zustimmungsschalter/-taster: Bemerkung/Fußnote. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Abhaengigkeit</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrAbhaengigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Abhaengigkeit'"
	 * @generated
	 */
	EList<Fstr_Abhaengigkeit> getFstrAbhaengigkeit();

	/**
	 * Returns the value of the '<em><b>Fstr Aneinander</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aneinandergereihte Zug- oder Rangierstraße. Die Reihenfolge der aneinandergereihten Fahrstraßen wird nicht mit abgespeichert, da diese aus Start und Ziel erkennbar ist. Durch die Auswahl der letzten Fahrstraße (bei Zugstraßen) wird der Durchrutschweg festgelegt. Sollen für die aneinandergereihte Zugstraße mehrere Durchrutschwege möglich sein, so sind entsprechend viele aneinandergereihte Zugstraßen zu planen (Ausnahmefall). Für die erste bis vorletzte Fahrstraße muss jeweils ein Durchrutschweg gewählt werden, dessen Weg Bestandteil der folgenden Fahrstraße ist; sollten hiervon mehrere existieren, wird der mit den geringsten betrieblichen Einschränkungen (i. d. R. der längste) verwendet. DB-Regelwerk Aneinandergereihte Zugstraßentabelle Aneinandergereihte Rangierstraßentabelle 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Aneinander</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrAneinander()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Aneinander'"
	 * @generated
	 */
	EList<Fstr_Aneinander> getFstrAneinander();

	/**
	 * Returns the value of the '<em><b>Fstr Aneinander Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung der aneinandergereihten Zug- oder Rangierstraße zu den Fahrstraßen Fstr Zug Rangier (\"Elementarfahrstraßen\"), aus denen sie besteht. DB-Regelwerk Tabelle der aneinandergereihten Zugstraßen Tabelle der aneinandergereihten Rangierstraßen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Aneinander Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrAneinanderZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Aneinander_Zuordnung'"
	 * @generated
	 */
	EList<Fstr_Aneinander_Zuordnung> getFstrAneinanderZuordnung();

	/**
	 * Returns the value of the '<em><b>Fstr DWeg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durchrutschweg oder Gefahrpunktabstand. Die Ausdehnung des Durchrutschwegs bzw. Gefahrpunktabstands wird mit dem Bereich Objekt Fstr Fahrweg festgelegt. Ein Durchrutschweg kann von mehreren Fahrstraßen genutzt werden. Ist die Attributgruppe Fstr_DWeg_Spezifisch nicht gefüllt, so handelt es sich um einen Gefahrpunktabstand. Ein Durchrutschweg der Länge Null wird ebenfalls als Instanz von Fstr_DWeg abgebildet. In dem Fall wird mit Fstr Fahrweg ein Bereichsobjekt der Länge Null mit Start und Ziel am Zielsignal der Fahrstraße verwendet. Derartige Durchrutschwege sind zu planen: am realen Zielsignal, hinter denen ein (Wahl-)Durchrutschweg der Länge Null vorgesehen ist, am fiktiven Zielsignal bei Stumpfgleiseinfahrt, am Zugdeckungssignal. Siehe hierzu auch Aufloesung Verzoegerung. DB-Regelwerk Durchrutschwegtabelle (eine Zeile)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr DWeg</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrDWeg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_DWeg'"
	 * @generated
	 */
	EList<Fstr_DWeg> getFstrDWeg();

	/**
	 * Returns the value of the '<em><b>Fstr DWeg WKr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Weichen und Kreuzungen zum in Fstr DWeg geplanten Durchrutschweg. Eine Zuordnung von Weichen und Kreuzungen über den zugrunde liegenden Fstr Fahrweg ist nicht möglich, da das Ende des Durchrutschweges in einer Weiche liegen kann, deren Sicherung explizit geplant werden muss. Außerdem muss für Weichen im Durchrutschweg angegeben werden, ob sie verschlossen werden und ob sie Flankenschutz anfordern sollen. Eine Angabe der Lage der Weiche ist nicht notwendig, da sich diese über Fstr Fahrweg (Bereich Objekt) ergibt. Obwohl die Spaltenüberschrift in der Durchrutschwegtabelle auch von Gleissperren spricht, werden Gleissperren nicht vorgesehen. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \"Weichen, Kreuzungen, Gleissperren\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr DWeg WKr</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrDWegWKr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_DWeg_W_Kr'"
	 * @generated
	 */
	EList<Fstr_DWeg_W_Kr> getFstrDWegWKr();

	/**
	 * Returns the value of the '<em><b>Fstr Fahrweg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Fahrweg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unverzweigter Bereich auf dem Gleisnetz, der als Grundlage für den befahrenen Teil bzw. den Durchrutschweg einer Fahrstraße dient. Der Start befindet sich immer an einem Signal, das Ziel beim befahrenen Teil an einem Signal, beim Durchrutschweg (bzw. Gefahrpunktabstand) an einem markanten Punkt. Für Zug- und Rangierstraßen mit gleichem Fahrweg kann die gleiche Instanz von Fstr_Fahrweg verwendet werden; Ausnahmen siehe Fstr Abhaengigkeit. Hinweis zur Modellierung beim Durchrutschweg, wenn der Markante Punkt eine Weichenspitze ist: Läuft ein Durchrutschweg spitz auf eine Weiche zu und die Spitze dieser Weiche ist das Ende des Durchrutschwegs, dann endet das Bereichsobjekt Fstr_Fahrweg am Ende der Kante vor der Spitze der Weiche, ist der markante Punkt das Punktobjekt W_Kr_Gsp_Komponente, was auf anschließenden Kanten verweist. Damit liegen das Ende des Bereichsobjekts und der markante Punkt auf verschiedenen Kanten (jeweils mit Abstand 0 zum Knoten), dennoch beschreiben sie geografisch den gleichen Punkt. DB-Regelwerk Im heutigen Planungswerk findet sich der Weg nur implizit durch die Angabe für den befahrenen Teil von Start, Ziel und Entscheidungsweichen in der Zug- bzw. Rangierstraßentabelle, für den Durchrutschweg und Gefahrpunktabstand von Start und Ziel und allen Weichen in der Durchrutschweg- bzw. Gefahrpunkttabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Fahrweg</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrFahrweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Fahrweg'"
	 * @generated
	 */
	EList<Fstr_Fahrweg> getFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>Fstr Nichthaltfall</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Nichthaltfall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nichthaltfallabschnitt (auch: Haltfallverhinderungsabschnitt). Im Gegensatz zur bisherigen Praxis der LST-Planung, den Haltfallabschnitt zu planen, werden im Datenmodell nur die Nichthaltfallabschnitte für jede Zugstraße geplant. In der Regel ist es einer, selten mehrere. DB-Regelwerk Haltfallabschnitt bisher: Zugstraßentabelle, Spalte 6: Signalhaltfall
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Nichthaltfall</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrNichthaltfall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Nichthaltfall'"
	 * @generated
	 */
	EList<Fstr_Nichthaltfall> getFstrNichthaltfall();

	/**
	 * Returns the value of the '<em><b>Fstr Rangier Fla Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von zu gewährleistenden Flankenschutzmaßnahmen zur Rangierstraße. Nur in Ausnahmefällen wird Flankenschutz für Rangierstraßen realisiert. Dann kann für jede Weiche einzeln bestimmt werden, ob sie Flankenschutz bekommt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Rangier Fla Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrRangierFlaZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Rangier_Fla_Zuordnung'"
	 * @generated
	 */
	EList<Fstr_Rangier_Fla_Zuordnung> getFstrRangierFlaZuordnung();

	/**
	 * Returns the value of the '<em><b>Fstr Signalisierung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Je Fahrstraße zu zeigende Signalisierung, die sich nicht eindeutig aus den Stellwerksfunktionen ergibt. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, jedoch sind hier alle Signalisierungen angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Signalisierung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrSignalisierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Signalisierung'"
	 * @generated
	 */
	EList<Fstr_Signalisierung> getFstrSignalisierung();

	/**
	 * Returns the value of the '<em><b>Fstr Umfahrpunkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichner des Umfahrpunkts durch eine Weiche oder einen Gleisabschnitt. Der Bezeichner dient nur dazu, den Umfahrweg zu benennen, nicht dazu, den Fahrweg zu beschreiben; die Beschreibung erfolgt in Fstr Fahrweg (Bereich Objekt). Die Festlegung des Umfahrpunkts gilt je Fahrweg und damit für alle Zug- und Rangierstraßen, die diesen Fahrweg nutzen. Das Objekt ist Bestandteil des Untergewerks \"Bedienung Fdl\". DB-Regelwerk Bestandteil des Bezeichners der Umfahrstraße in der Zug-/Rangierstraßentabelle, Spalte 1 \"Start/Ziel\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Umfahrpunkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrUmfahrpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Umfahrpunkt'"
	 * @generated
	 */
	EList<Fstr_Umfahrpunkt> getFstrUmfahrpunkt();

	/**
	 * Returns the value of the '<em><b>Fstr Zug Rangier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zug- oder Rangierstraße. Jeder Zugstraße ist ein Durchrutschweg (modelliert in Fstr DWeg) zugeordnet. Gibt es Fahrstraßen mit mehreren Durchrutschwegen, so werden dafür mehrere Zugstraßen angelegt, die auf dem gleichen befahrenen Teil (modelliert in Fstr Fahrweg) basieren. Mit dem Datenmodell werden auch Zentralblockfahrstraßen geplant. Der hiermit verknüpfte Gefahrpunktabstand wird in Fstr DWeg abgebildet. Eine Zentralblockfahrstraße (Fstr_Art==ZB) über die ESTW-Zentraleinheit-Grenze wird in zwei Teilblockfahrstraßen (Fstr_Art==ZB) im Bereich der jeweiligen ESTW-Zentraleinheit geplant. Dabei kann ein befahrener Teil der Länge Null entstehen, wenn die zweite Teilblockfahrstraße nur aus dem Durchrutschweg besteht. Zielsignal der ersten ist Startsignal der zweiten Teilblockfahrstraße. Fahrstraßen über eine ESTW-Zentraleinheit-Grenze (FAP) werden als zwei Teilfahrstraßen (Fstr_Art==ZT/ZTU/RT/RTU) geplant. Kann die erste Teilfahrstraße mit mehreren weiteren Teilfahrstraßen fortgesetzt werden, so muss für jede geplante Kombination eine eigene Instanz der ersten Teilfahrstraße angelegt werden (analog der Zuordnung mehrerer Durchrutschwege). Die Verknüpfung zur zweiten Teilfahrstraße geschieht über Fstr_Zug_Rangier.ID Fstr Folgeabhaengigkeit. Eine Mittelweichenteilfahrstraße besitzt keinen Durchrutschweg. Eine explizite Verknüpfung von Mittelweichenteilfahrstraßen untereinander und mit der Zugstraße erfolgt nicht, da sich diese über die Topologie und insbesondere über Start und Ziel ergeben. Eine Rangierstraße besitzt ebenfalls keinen Durchrutschweg. Die speziellen Attribute von Zug-/Rangier-/Mittelweichenteilfahrstraße werden in eigenen Attributgruppen gespeichert, die sich gegenseitig ausschließen. Gruppenausfahrten werden als Zugstraßen ohne besondere Eigenschaft abgebildet. Das Gruppenausfahrsignal wird unter ID Signal Gruppenausfahrt explizit angegeben, die Gruppenausfahrstraße ist somit eindeutig erkennbar. DB-Regelwerk Zugstraßentabelle (eine Zeile), Rangierstraßentabelle (eine Zeile), Mittelweichenteilfahrstraßentabelle (eine Zeile). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Zug Rangier</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FstrZugRangier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug_Rangier'"
	 * @generated
	 */
	EList<Fstr_Zug_Rangier> getFstrZugRangier();

	/**
	 * Returns the value of the '<em><b>FT Anschaltbedingung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Anschaltbedingung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Bedingungen, die zur Auswahl eines Fachtelegramms erfüllt sein müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FT Anschaltbedingung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FTAnschaltbedingung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_Anschaltbedingung'"
	 * @generated
	 */
	EList<FT_Anschaltbedingung> getFTAnschaltbedingung();

	/**
	 * Returns the value of the '<em><b>FT Fahrweg Teil</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Fahrweg_Teil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Teil des Fahrwegs, auf den sich die Informationen des Fachtelegramms beziehen. Die Fahrwegteile können außerhalb der betroffenen Fahrstraße liegen. Im Unterschied zum Fahrweg der Fahrstraße wird der Fahrwegteil nicht als Bereichsobjekt abgebildet, da in einigen Fällen kein Zielelement existiert (z. B. Übergang in Rangierbereich) oder das exakte Ende des Fahrwegteils nicht bestimmt wird (Kreuzungsweichen). Fahrwegteile mit mehreren Zielpunkten sind durch mehrere Instanzen von FT_Fahrweg_Teil abzubilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FT Fahrweg Teil</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_FTFahrwegTeil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_Fahrweg_Teil'"
	 * @generated
	 */
	EList<FT_Fahrweg_Teil> getFTFahrwegTeil();

	/**
	 * Returns the value of the '<em><b>GEO Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.GEO_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kante des topografischen Knoten-Kanten-Modells. Die GEO_Kante ist vom GEO_Knoten A zum GEO_Knoten B gerichtet (GEO Richtungswinkel) und muss immer an zwei GEO_Knoten enden. Die Länge einer GEO_Kante zwischen den GEO_Knoten A und B entspricht der realen Gleislänge zwischen diesen Knoten und wird im Attribut GEO Laenge gespeichert. Mit Bezug auf die Regeln zu den Gleisnetzdaten (GND) ist die Länge einer GEO_Kante stets kleiner 10 km. Eine GEO_Kante besitzt eine geometrische Form, die durch GEO Form beschrieben wird. GEO_Kanten werden für die Abbildung der Gleislinie und der Kilometrierungslinie verwendet. Eine Unterscheidung dieser Anwendung erfolgt durch den Verweis ID GEO Art. Der GEO_Radius (GEO Radius A und GEO Radius B) ist negativ, wenn die GEO_Kante vom GEO_Knoten_A in einem Linksbogen führt und ist positiv, wenn diese in einen Rechtsbogen führt. Die beiden Radien sind jeweils der Radius an der A- bzw. B-Seite der GEO_Kante. Bei einem Kreisbogen wird nur der GEO Radius A angegeben. Für eine Gerade wird dieser Radius mit 0.000 definiert. Ein Algorithmus zur Darstellung eines Punktes auf einem Übergangsbogen kann der folgenden Literaturquelle entnommen werden: Media:Literatur Uebergangsbogen.pdf. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GEOKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Kante'"
	 * @generated
	 */
	EList<GEO_Kante> getGEOKante();

	/**
	 * Returns the value of the '<em><b>GEO Knoten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.GEO_Knoten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Knoten des topografischen Knoten-Kanten-Modells. Die Anzahl der anschließenden topografischen Kanten (Gleislinie oder Kilometrierungslinie) ist je nach Art des GEO Knoten bzw. Art des zugehörigen TOP Knoten unterschiedlich: Für die Gleislinie gilt: Eine GEO-Kante: Der GEO_Knoten ist gleichzeitig auch ein TOP Knoten, an dem die Topografie und Topologie endet (z. B. Gleisende, Betrachtungsende oder Digitalisierungsende). Zwei GEO-Kanten: Der GEO_Knoten verweist nicht auf einen TOP Knoten: Änderung der Geometrie des Gleises oder Vermessungspunkt. Drei GEO-Kanten: Der GEO_Knoten ist gleichzeitig auch ein Knoten, an dem eine Verzweigung der Gleis- oder Kilometrierungslinie vorhanden ist. Über einen Verweis von GEO Punkt zu GEO_Knoten werden die realen Koordinaten (ggf. auch von mehreren Koordinatensystemen) dieses Knotens zugeordnet. Weitere Fälle mit 0..1 anschließenden GEO-Kanten treten an GEO_Knoten auf, an deren Stelle sich auch ein TOP Knoten der Art Verbindungsknoten befindet (siehe Beschreibung Verbindungsknoten). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Knoten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GEOKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Knoten'"
	 * @generated
	 */
	EList<GEO_Knoten> getGEOKnoten();

	/**
	 * Returns the value of the '<em><b>GEO Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topographischer Punkt im Koordinatensystem zur eindeutige Zuordnung im realen Gelände. Alle Objekte, die einen entsprechenden Bezug erfordern, werden über andere Objekte (z.B Verortung an der Topologie) oder auch direkt auf dieses Objekt abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GEOPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Punkt'"
	 * @generated
	 */
	EList<GEO_Punkt> getGEOPunkt();

	/**
	 * Returns the value of the '<em><b>Geschwindigkeitsprofil</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit der Strecke, bei ETCS auch außerhalb der durchgehenden Hauptgleise. Das Geschwindigkeitsprofil wird zusammengesetzt aus Bereichen mit konstanten Geschwindigkeiten. Es kann in unterschiedlichen Arten (z. B. NeiTec, ETCS) ausgeprägt sein. Für jede Art wird ein separates Geschwindigkeitsprofil angelegt. \"Geschwindigkeitsband\" ist ein Synonym für Geschwindigkeitsprofil. Unabhängig vom Geschwindigkeitsprofil können in Elementen (Weiche, Gleisabschnitt) eigene Geschwindigkeiten hinterlegt sein. Je nach Anwendung wird über die Gültigkeit der in den Elementen hinterlegten Geschwindigkeit oder der des Geschwindigkeitsprofils entschieden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeitsprofil</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Geschwindigkeitsprofil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeitsprofil'"
	 * @generated
	 */
	EList<Geschwindigkeitsprofil> getGeschwindigkeitsprofil();

	/**
	 * Returns the value of the '<em><b>GFR Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gerfahrraumfreimeldeanlage. Folgende Rahmenbedingungen sind für den Einsatz einer GFR zu beachten: max. Höhe der Bodenwellen des BÜ: 15 cm; max. Neigung des BÜ: 2°.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GFRAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GFR_Anlage'"
	 * @generated
	 */
	EList<GFR_Anlage> getGFRAnlage();

	/**
	 * Returns the value of the '<em><b>GFR Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detektor der GFR-Anlage (z. B. Radar). Elemente für eine Kamera-Überwachung sind  Bestandteil TK-Ausrüstung und werden daher nicht abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GFRElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GFR_Element'"
	 * @generated
	 */
	EList<GFR_Element> getGFRElement();

	/**
	 * Returns the value of the '<em><b>GFR Tripelspiegel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Tripelspiegel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ortungshilfe für GFR-Anlagen der Firma Honeywell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Tripelspiegel</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GFRTripelspiegel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GFR_Tripelspiegel'"
	 * @generated
	 */
	EList<GFR_Tripelspiegel> getGFRTripelspiegel();

	/**
	 * Returns the value of the '<em><b>Gleis Abschluss</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Gleis_Abschluss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ständig vorhandenes Ende eines betrieblich nutzbaren Gleises (z. B. Prellbock oder Schwellenkreuz). Der Gleisabschluss ist ein Punkt Objekt. Die TOP Kante kann hinter dem Gleisabschluss bis zum baulichen Ende des Gleises weitergeführt sein. Er wird auf den Punkt verortet, der die Grenze der möglichen Fahrzeugbewegung darstellt. Da das bauliche Ende konstruktiv hinter diesem Punkt liegt, fällt der Gleisabschluss in der Regel nicht mit einem TOP Knoten zusammen. Der Gleisabschluss ist vom klappbaren Prellbock (und anderen beweglichen Elementen) zu unterscheiden. Diese besonderen beweglichen Fahrwegelemente sind als Gleissperre mit einem ergänzenden Bearbeitungsvermerk zu planen. Der Gleisabschluss ist in der Regel auch Grenze eines Gleisabschnittes. Die Wirkrichtung entspricht der Richtung der möglichen Fahrzeugbewegung auf den Gleisabschluss. Der Gleisabschluss ist mittig angeordnet wodurch der seitliche Abschand immer 0.000 sein muss. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Abschluss</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisAbschluss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Abschluss'"
	 * @generated
	 */
	EList<Gleis_Abschluss> getGleisAbschluss();

	/**
	 * Returns the value of the '<em><b>Gleis Abschnitt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abschnitt eines Gleises, welcher als kleinste Einheit betrieblich und technisch verwendet wird. Der Gleisabschnitt wird im Allgemeinen durch zwei Enden begrenzt. Wenn in diesem Gleisabschnitt Weichen, Kreuzungen oder Kreuzungsweichen enthalten sind, entstehen weitere Enden. Diese werden in der Regel nur dann definiert, wenn technische Anlagen zur Gleisfreimeldung vorhanden sind. Der Begriff Weichenabschnitt wird wegen Mehrdeutigkeit im Modell nicht verwendet. Ein Gleisabschnitt kann mittels technischer Anlagen (abgebildet im Objekt FMA Anlage) auf Freisein überwacht werden. Der Gleisabschnitt als Bereich_Objekt muss an seinen Grenzen genau mit dem Punkt_Objekt FMA Element übereinstimmen. Rundungsfehler bei der Berechnung sind zu beachten! 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Abschnitt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisAbschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Abschnitt'"
	 * @generated
	 */
	EList<Gleis_Abschnitt> getGleisAbschnitt();

	/**
	 * Returns the value of the '<em><b>Gleis Art</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Art}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Klassifizierung des Gleises aus betrieblicher Sicht. Es erfolgt die Unterscheidung in Haupt- und Nebengleise in einem Bahnhof, sowie die Abgrenzung von Strecken und Anschlussgleisen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Art</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Art'"
	 * @generated
	 */
	EList<Gleis_Art> getGleisArt();

	/**
	 * Returns the value of the '<em><b>Gleis Baubereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Baubereich}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markierung eines Gleisbereiches als Baubereich. Mit diesem Objekt wird der Bereich markiert, der während einer Planung als Baubereich verwendet wird. Die Topologie des Baubereiches und die verorteten Objekte bleiben erhalten. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Baubereich</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisBaubereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Baubereich'"
	 * @generated
	 */
	EList<Gleis_Baubereich> getGleisBaubereich();

	/**
	 * Returns the value of the '<em><b>Gleis Bezeichnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Bezeichnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Träger der betrieblichen Bezeichnung eines Gleises. Ein Gleis erhält dann eine Bezeichnung, wenn es für die betriebliche Nutzung benötigt wird. Topologische Knoten (z. B. Weichen) unterbrechen nicht die Gleisbezeichnung. Für die durchgehenden Hauptgleise in einem Bahnhof wird das Bereichsobjekt für das Gleis in der Regel von einem Einfahrsignal bis zum Einfahrsignal der Gegenrichtung modelliert. Wenn das Gleis hinsichtlich der betrieblichen Bezeichnung geteilt ist (z.B. Gleis 1 und Gleis 21) sind getrennte Bereichsobjekte für diese Gleise anzulegen. Weitere Bezeichnungen von Bahnhofsgleisen werden in der Regel zwischen topologischen Knoten gebildet, wobei auch weitere Knoten enthalten sein können. Gleise, die aus betrieblicher Sicht keine Bezeichnung benötigen (z. B. Gleisverbindungen), erhalten keine Gleisbezeichnung. Streckengleise werden in der Regel zwischen den Bahnhofsgrenzen (ggf. auch andere Zugmeldestellen) durchgehend bezeichnet. Die Klammersetzung der Bezeichung von Streckengleisen ist Bestandteil der Bezeichung das Steckengleises. Die Attributgruppe Gleis_Bezeichnung_Allg soll nach Version 1.8.0 entfernt und daher nicht mehr verwendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Bezeichnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisBezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Bezeichnung'"
	 * @generated
	 */
	EList<Gleis_Bezeichnung> getGleisBezeichnung();

	/**
	 * Returns the value of the '<em><b>Gleis Fahrbahn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Fahrbahn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bereich, in dem eine besondere Fahrbahnkonstruktion vorhanden ist, die für die Leit- und Sicherungstechnik relevant ist (z. B. Feste Fahrbahn). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Fahrbahn</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisFahrbahn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Fahrbahn'"
	 * @generated
	 */
	EList<Gleis_Fahrbahn> getGleisFahrbahn();

	/**
	 * Returns the value of the '<em><b>Gleis Lichtraum</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Lichtraum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bereich, in dem besondere Lichtraumbedingungen vorhanden sind. Es werden nur die Bereiche angegeben, in denen von der EBO abweichende und LST-relevante Lichtraumbedingungen vorhanden oder zu beachten sind. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Lichtraum</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisLichtraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Lichtraum'"
	 * @generated
	 */
	EList<Gleis_Lichtraum> getGleisLichtraum();

	/**
	 * Returns the value of the '<em><b>Gleis Schaltgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Gleis.Gleis_Schaltgruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einzeln schaltbarer Abschnitt einer Fahrleitungsanlage, der mit Fahrstrom versorgt wird. Das Objekt wird vom Grundsatz dem Übersichtsplan mit Schaltanweisung (Ebsü) des elektrotechnischen Dienstes entnommen. Zur Beschreibung von Fahrleitungsschaltgruppen in der ESTW-Logik zum Zwecke der Merkhinweiseingabe für Befahrbarkeitssperren sind die betroffenen Gleisabschnitte zu beachten. Die Grenzen einer Schaltgruppe müssen nicht mit den Grenzen der Gleisabschnitte übereinstimmen. Wenn ein angeschnittener Gleisabschnitt vorhanden ist, wird dieser in der Befahrbarkeitssperre berücksichtigt. Die Schaltgruppen können sich dann auch überlagern. In der Regel sollten Überlagerungen von Schaltgruppen vermieden werden, indem ein Gleisabschnitt nur einer Schaltgruppe zugeordnet wird. Zwischen Bereichen verschiedener Schaltgruppen können aus vorgenanntem Grund auch Lücken sein. Für Schaltgruppen, die verschiedenen Fahrstromsystemen zugeordnet werden können (Systemwechselstellen), ist für jedes Fahrstromsystem je eine Instanz mit gleichem Elementnamen und gleichen Bereichsgrenzen anzulegen. Die Zuordnung der Schaltgruppen zu den Gleisabschnitten erfolgt über die topologischen Kanten als ein Bereichsobjekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Schaltgruppe</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_GleisSchaltgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleis_Schaltgruppe'"
	 * @generated
	 */
	EList<Gleis_Schaltgruppe> getGleisSchaltgruppe();

	/**
	 * Returns the value of the '<em><b>Hoehenlinie</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Hoehenlinie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhenverlauf zwischen zwei Höhenpunkten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenlinie</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Hoehenlinie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hoehenlinie'"
	 * @generated
	 */
	EList<Hoehenlinie> getHoehenlinie();

	/**
	 * Returns the value of the '<em><b>Hoehenpunkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Hoehenpunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtliche Höhe des Bezugspunkts gemäß des Höhensystems. Liegt der Höhenpunkt innerhalb des zugehörigen Gleises, wird dieser mit einem Seitlichen Abstand im Punkt_Objekt von 0.000 angegeben und gibt die Höhe des Gleises in Meter gemäß Höhensystem an. Wird eine seitlicher Abstand ungleich 0.000 angegeben, so handelt es sich um einen sonstigen Höhenpunkt, der nicht die Höhenlage des Gleises angibt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenpunkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Hoehenpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hoehenpunkt'"
	 * @generated
	 */
	EList<Hoehenpunkt> getHoehenpunkt();

	/**
	 * Returns the value of the '<em><b>Kabel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medium zur Übermittlung von Energie und/oder Information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Kabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kabel'"
	 * @generated
	 */
	EList<Kabel> getKabel();

	/**
	 * Returns the value of the '<em><b>Kabel Verteilpunkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Verteilpunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punktförmige Installation zur Aufteilung bzw. Verschaltung von Kabeln (ohne Intelligenz).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Verteilpunkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_KabelVerteilpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kabel_Verteilpunkt'"
	 * @generated
	 */
	EList<Kabel_Verteilpunkt> getKabelVerteilpunkt();

	/**
	 * Returns the value of the '<em><b>LEU Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektronische Einheit zur Ansteuerung der Eurobalisen mit Balisentelegrammen in Abhängigkeit von Eingangsinformationen (Signalbegriffe, Weichenlagen etc.). Die LEU-Anlage besteht ggf. aus mehreren Schaltkästen, die mehrere LEU-Module enthalten können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_LEUAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Anlage'"
	 * @generated
	 */
	EList<LEU_Anlage> getLEUAnlage();

	/**
	 * Returns the value of the '<em><b>LEU Modul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektronische Baugruppe zur Ansteuerung von Balisen in Abhängigkeit von Eingangsinformationen. Ein LEU-Modul ist in einem LEU-Schaltkasten untergebracht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_LEUModul()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul'"
	 * @generated
	 */
	EList<LEU_Modul> getLEUModul();

	/**
	 * Returns the value of the '<em><b>LEU Schaltkasten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schaltkasten als Element der LEU-Anlage zur Unterbringung eines oder mehrerer LEU-Module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Schaltkasten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_LEUSchaltkasten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Schaltkasten'"
	 * @generated
	 */
	EList<LEU_Schaltkasten> getLEUSchaltkasten();

	/**
	 * Returns the value of the '<em><b>Lieferobjekt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von der SBI geliefertes Objekt. Hier werden alle relevanten Daten des gelieferten Teils der LST-Anlage eingetragen. Das Lieferobjekt muss einen Bezug zu einem bestehenden bzw. geplanten LST-Objekt haben, das es näher beschreibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lieferobjekt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Lieferobjekt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lieferobjekt'"
	 * @generated
	 */
	EList<Lieferobjekt> getLieferobjekt();

	/**
	 * Returns the value of the '<em><b>Luft Telegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Telegramms (Binaerdatei) zur Balise, von der das Telegramm an das Fahrzeug übertragen wird. Das Telegramm kann dabei in der Balise gespeichert sein oder von der LEU an die Balise gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luft Telegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_LuftTelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Luft_Telegramm'"
	 * @generated
	 */
	EList<Luft_Telegramm> getLuftTelegramm();

	/**
	 * Returns the value of the '<em><b>Markanter Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punkt in der Örtlichkeit, der eindeutig aufzufinden und beschreibbar ist. Hauptsächlicher Anwendungsfall ist die Definition des Gefahrpunktes oder des Endes eines Durchrutschweges. Auch der PZB-Gefahrpunkt wird damit verortet. Die eindeutige Auffindbarkeit dient der Freimeldung durch Hinsehen in der Rückfallebene. Wegen schlechter Erkennbarkeit soll eine Gleisfreimeldegrenze nur ausnahmsweise als markanter Punkt genutzt werden, wenn sich in vertretbarer Entfernung kein anderer Punkt finden lässt. Antennen von Zugbeeinflussungen (z. B. PZB-Gleismagnet) gelten nicht als markanter Punkt. Das Ende des Durchrutschweges muss nicht mit einer Freimeldegrenze zusammenfallen. Ein weiterer Anwendungsfall ist die Verortung von Freimeldegrenzen als Hilfestellung für deren Montage. Markante Punkte sind: Signal (insbesondere Haupt- und Sperrsignal, Grenzzeichen, Schutzhaltsignal), Weichenspitze (W Kr Gsp Komponente), Gleissperre (W Kr Gsp Komponente), Kante des Gefahrraums an BÜ (Sonstiger Punkt), Besondere Objekte, z. B. an Deckungsstellen (derzeit noch nicht modelliert), Gleisfreimeldegrenze (nur ausnahmsweise), Beginn eines Bahnsteigs (Sonstiger Punkt), Zugschluss bzw. -spitze (Sonstiger Punkt), Sonstige Punkte (Sonstiger Punkt). DB-Regelwerk Ende Durchrutschweg: Durchrutschwegtabelle, Spalte 2: \"bis\"; Gefahrpunkt: Gefahrpunkttabelle, Spalte 2: \"maßgebender Gefahrpunkt\"; Verortung Gleisfreimeldegrenze: Bemaßungsangabe im sicherungstechnischen Lageplan und Achszählpunkttabelle, Spalte 17: \"Bezugspunkt\". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markanter Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_MarkanterPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Markanter_Punkt'"
	 * @generated
	 */
	EList<Markanter_Punkt> getMarkanterPunkt();

	/**
	 * Returns the value of the '<em><b>NB</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Nahbedienbereich.NB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nahbedienbereich. Teilbereich innerhalb eines ESTW-Stellbereichs, für den zeitweise die Zuständigkeit vom Fahrdienstleiter an einen örtlichen Bediener zur Durchführung von Rangierbewegungen abgegeben werden kann. Die Kommunikation zwischen Fahrdienstleiter und Bediener erfolgt über entsprechende Bedieneinrichtung(en). Mit Abgabe der Nahbedienung hat der Fahrdienstleiter auf diesen Bereich keinen Zugriff; die Verantwortung liegt beim örtlichen Bediener. Mit Rückgabe der Nahbedienung geht die Verantwortung vom Bediener wieder an den Fahrdienstleiter. Für die Rückgabe der Nahbedienung können bestimmte Voraussetzungen erforderlich sein. Für die Abgabe bzw. Rückgabe der Nahbedienung werden in der Literatur auch die Begriffe \"Einschalten\" und \"Ausschalten\" verwendet. Der Nahbedienbereich muss vom übrigen Stellwerksbereich durch Flankenschutzmaßnahmen abgegrenzt werden. Jeder Nahbedienbereich hat immer mindestens eine NB Zone. DB-Regelwerk Für die Planung von Nahbedienbereichen exisitert bei der DB AG kein Regelwerk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_NB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB'"
	 * @generated
	 */
	EList<NB> getNB();

	/**
	 * Returns the value of the '<em><b>NB Bedien Anzeige Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bedien_Anzeige_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Bedienfunktionen zur Bedieneinrichtung einer oder mehrerer NB_Zonen, über die Fahrdienstleiter und örtlichen Bediener miteinander kommunizieren. Falls sich bedienbare Elemente innerhalb der NB_Zone befinden, sind diese durch eine entsprechende Bedieneinrichtung (um)stellbar, sofern eine (Um-)Stellbarkeit vorgesehen wurde. Der Umfang hängt von der gewählten NB Art ab. Weiterhin sind in der Bedieneinrichtung Elemente für die Kommunikation zwischen Fahrdienstleiter und Bediener untergebracht. In diesem Objekt wird die Logik der Bedieneinrichtung abgebildet. Falls eine Bedieneinrichtung Elemente aus mindestens zwei verschiedenen NB_Zonen enthält, ist eine Zuordnung der Bedieneinrichtung zu den betreffenden NB_Zonen erforderlich. Der Verweis auf Bedien Anzeige Element führt zur Zuordnung der physischen Unterbringung. DB-Regelwerk Für die Planung exisitert bei der DB AG kein Regelwerk. Die Angaben finden sich meist im Erläuterungsbericht zum PT1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Bedien Anzeige Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_NBBedienAnzeigeElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Bedien_Anzeige_Element'"
	 * @generated
	 */
	EList<NB_Bedien_Anzeige_Element> getNBBedienAnzeigeElement();

	/**
	 * Returns the value of the '<em><b>NB Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nahbedienbereichszone. Jeder Nahbedienbereich hat mindestens eine Zone; es sind auch mehrere Zonen möglich. Die Zonen können voneinander unabhängig nebeneinander liegen, sich überlappen oder eine Zone kann eine kleinere \"Teilmenge\" einer größeren Zone sein. Als spezieller Fall ist auch die Vereinigung von zwei nebeneinander liegenden Zonen möglich. Für jede Zone werden eigene Grenzen zum angrenzenden Bereich (ESTW, NB, Ortstellbereich) festgelegt. DB-Regelwerk Für die Planung von Nahbedienzonen exisitert bei der DB AG kein Regelwerk. Die Angabe findet sich in der Nahbedienungstabelle, Spalte 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Zone</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_NBZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone'"
	 * @generated
	 */
	EList<NB_Zone> getNBZone();

	/**
	 * Returns the value of the '<em><b>NB Zone Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung der ESTW-Elemente (Signale, Weichen, Gleissperren, Schlüsselsperren) zur NB_Zone, in der sie sich befinden. Für diese Elemente sind in Abhängigkeit der vorgesehenen NB Art Eigenschaften zur Stellbarkeit und Rückgabevoraussetzung festzulegen. DB-Regelwerk Die Angaben finden sich in der Nahbedienungstabelle, Spalten 5, 8 und 9.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Zone Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_NBZoneElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Element'"
	 * @generated
	 */
	EList<NB_Zone_Element> getNBZoneElement();

	/**
	 * Returns the value of the '<em><b>NB Zone Grenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Grenze}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grenze der NB Zone gegenüber dem der Zone angrenzenden Bereich. Die NB Zone wird mittels (technischem) Flankenschutz gegenüber dem benachbarten Bereich (ESTW oder einer weiteren Zone) abgegrenzt. Grenzelemente bilden Signale, Weichen oder Gleissperren, welche in jeweiliger Flankenschutzlage verschlossen werden. Auch die Angabe eines Achzählpunkts ist möglich. Bei an die NB Zone angrenzendem Ortstellbereich ist die TM 2010-388 I.NVT 3 \"Planungsregeln Bedienbereiche - Schnittstellen Stellwerksbereiche\" zu beachten. DB-Regelwerk TM 2010-388 I.NVT 3 Die Angabe von Grenzelementen außerhalb der NB-Zone finden sich in der Nahbedienungstabelle, Spalte 7.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Zone Grenze</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_NBZoneGrenze()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Grenze'"
	 * @generated
	 */
	EList<NB_Zone_Grenze> getNBZoneGrenze();

	/**
	 * Returns the value of the '<em><b>Oertlichkeit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Oertlichkeit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahnanlagen und Betriebsstellen des Netzes. Die Örtlichkeit muss eine gültige Bezeichnung nach Ril 100 beinhalten und kann mittels ID Strecke Punkt mehreren Strecken mit Bezugskilometer zugeordnet sein. DB-Regelwerk Richtlinie 100.0001 Abschnitt 1 (1) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oertlichkeit</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Oertlichkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit'"
	 * @generated
	 */
	EList<Oertlichkeit> getOertlichkeit();

	/**
	 * Returns the value of the '<em><b>Prog Datei Gruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Gruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gruppe von Dateien, die zum Programmieren der Balise oder LEU benötigt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prog Datei Gruppe</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ProgDateiGruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Prog_Datei_Gruppe'"
	 * @generated
	 */
	EList<Prog_Datei_Gruppe> getProgDateiGruppe();

	/**
	 * Returns the value of the '<em><b>Proxy Objekt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Proxy_Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hilfsobjekt zur Sättigung von Verweisen an der äußeren Grenze des Betrachtungsbereichs einer Einzelplanung. Die Validierung einer XML-Datei ist nur gesamthaft möglich. Somit müssen Planungs- und Betrachtungsbereich gleichermaßen valide sein. An der äußeren Grenze des Betrachtungsbereichs sind jedoch u. U. nicht mehr alle Zielobjekte von Verweisen vorhanden, da der Betrachtungsbereich nicht beliebig ausgeweitet werden kann und soll. Unter der Maßgabe einer validen XML besteht jedoch ein Zwang zur Sättigung von Verweisen. Das Proxy_Objekt schafft diesbezüglich eine Lösung für alle Objekte des LST-Datenmodells. In den Bestandsdaten der LST-Datenbank dürfen keine Proxyobjekte vorhanden sein. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proxy Objekt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ProxyObjekt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Proxy_Objekt'"
	 * @generated
	 */
	EList<Proxy_Objekt> getProxyObjekt();

	/**
	 * Returns the value of the '<em><b>PZB Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.PZB.PZB_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Bau)Art, Umfang und Funktionen der punktförmigen Zugbeeinflussung. Unter dem PZB_Element werden sowohl einzelne Gleismagneten als auch die Geschwindigkeitsüberwachungseinrichtungen (GÜ - in der Literatur auch als Geschwindigkeitsprüfeinrichtungen - GPE bezeichnet) sowie dazugehörige Eigenschaften und Parameter zusammenfassend dargestellt. DB-Regelwerk 819.1310 8 für Gleismagnete 819.1310 9 für GÜ In der Gleismagenttabelle finden sich die Angaben in den Zeilen 16 und 17 sowie 33 bis 35 für GÜ und 29 bis 32 für Gleismagnete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_PZBElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element'"
	 * @generated
	 */
	EList<PZB_Element> getPZBElement();

	/**
	 * Returns the value of the '<em><b>PZB Element Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von PZB Element zu einem Signal, einer Fahrstraße oder auch anderen Objekten, die im Bezug zum PZB_Element stehen. Der Verweis von einem PZB Element über das Zuordnungsobjekt auf ein Signal ist dabei immer gefüllt. Die Verknüpfung mit einer Fahrstraße (nur Zugstraßen sind relevant) oder weiteren Objekten (INA-Berechnungsrelevante Objekte) ist fallbezogen notwendig. Beispiele für die Zuordnung sind unter ID Fstr Zug Rangier zu finden. DB-Regelwerk Eintrag in der Gleismagnettabelle; die Zuordnung zu einzelnen Fahrstraßen wird heute über Fußnoten gelöst. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Element Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_PZBElementZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_Zuordnung'"
	 * @generated
	 */
	EList<PZB_Element_Zuordnung> getPZBElementZuordnung();

	/**
	 * Returns the value of the '<em><b>PZB Zuordnung Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.PZB.PZB_Zuordnung_Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Objekt dient der Zuordnung der Signale (Vorsignal, Vorsignalwiederholer, H-Tafel) zum maßgebenden Gleismagneten (GM) 2000 Hz des Hauptsignals. Die Unterscheidung zwischen den verschiedenen Signalen wird über die GUID des Signals hergestellt. Der angegebene Abstand bezieht sich beim Vorsignal auf den Abstand des GM 1000 Hz, bei Vorsignalwiederholer und H-Tafel auf den Abstand des Signals zum maßgebenden GM 2000 Hz des Hauptsignals. Es werden in der Regel bis zu vier H-Tafeln pro Hauptsignal geplant. DB-Regelwerk Gleismagnettabelle, Zeilen 19 sowie 21 bis 25 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Zuordnung Signal</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_PZBZuordnungSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Zuordnung_Signal'"
	 * @generated
	 */
	EList<PZB_Zuordnung_Signal> getPZBZuordnungSignal();

	/**
	 * Returns the value of the '<em><b>RBC</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.RBC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Radio Block Centre (ETCS-Streckenzentrale).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RBC</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_RBC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RBC'"
	 * @generated
	 */
	EList<RBC> getRBC();

	/**
	 * Returns the value of the '<em><b>Regelzeichnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regelzeichnungen werden verwendet, um einheitliche Bauausführungen für bestimmte Objekte sicherzustellen. Die für die LST-Anwendungen im Datenmodell benötigten Regelzeichnungen werden in einer Regelzeichnungstabelle aufgelistet. Regelzeichnungen können neben dem Bild eine beliebige Anzahl von Parametern haben, die die Bausausführung für einen konkreten Anwendungsfall genauer spezifizieren. Die Gültigkeit der Parameter für eine konkrete Anwendung in einer Regelzeichnung kann nur mit dem Prüf- und Testtool bestimmt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regelzeichnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Regelzeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Regelzeichnung'"
	 * @generated
	 */
	EList<Regelzeichnung> getRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>Regelzeichnung Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einer Regelzeichnung werden durch dieses Objekt weitere Parameter zugeordnet. Für eine Regelzeichnung können beliebig viele Parameter entsprechend der konkreten Anwendung angegeben werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regelzeichnung Parameter</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_RegelzeichnungParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Regelzeichnung_Parameter'"
	 * @generated
	 */
	EList<Regelzeichnung_Parameter> getRegelzeichnungParameter();

	/**
	 * Returns the value of the '<em><b>Schaltmittel Fstr Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.Schaltmittel_Fstr_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verknüpft bei einem Bahnübergang mit der Funktionsüberwachung Fü die möglichen Fahrstraßen mit den Elementen für die Wirksamschaltung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltmittel Fstr Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SchaltmittelFstrZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schaltmittel_Fstr_Zuordnung'"
	 * @generated
	 */
	EList<Schaltmittel_Fstr_Zuordnung> getSchaltmittelFstrZuordnung();

	/**
	 * Returns the value of the '<em><b>Schaltmittel Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ortung.Schaltmittel_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnungsobjekt für die punktuelle Auslösung von Schaltvorgängen. Beispiel: BÜSA, Rangier- und Ablaufanlagen. Schaltmittel sind oftmals separate Zugeinwirkungen (z. B. Radsensoren), es können aber auch Freimeldeabschnitte (FMA_Anlagen) oder Achszählpunkte (FMA_Komponenten) für den Zweck eines Schaltmittels mitverwendet werden (Doppelausnutzung). Ein Schaltmittel wiederum kann für unterschiedliche Funktionen vorgesehen sein. Das Zuordnungsobjekt Schaltmittel erfasst jeweils eine konkrete Anforderung (Verweis, der auf das anfordernde Objekt gerichtet ist, z.B. Bahnübergang EIN, Bahnübergang AUS, Fahrstraße verschließen und ordnet diese Funktion dann einer konkreten Anlage (Zugeinwirkung, Freimeldeabschnitt oder Achszählpunkt) sowie eine Beschriftung dieser Anlage im sicherungstechnischen Lageplan zu. Die Funktion \"Fahrstraße verschließen (ID_Anforderung = Fstr_Fahrweg)\" ist vorgesehen für den Anrückverschluss von Zugstraßen. Weitere Anwendungen sind aktuell nicht im Modell verankert. Der Verweis auf die Anforderung ist nicht erforderlich, wenn sich die Zuordnung eindeutig aus der Topologie ergibt (Beispiel: separates Schaltmittel für die Funktion \"Zweites Haltfallkriterium\"). In diesem Fall wird nur der Verweis auf die Anlage sowie die Beschriftung im Lageplan angegeben. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltmittel Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SchaltmittelZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schaltmittel_Zuordnung'"
	 * @generated
	 */
	EList<Schaltmittel_Zuordnung> getSchaltmittelZuordnung();

	/**
	 * Returns the value of the '<em><b>Schloss</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mechanisches Bauelement, das durch das Ein- oder Ausschließen eines Schlüssels einen Riegel aus- oder einfahren lässt bzw. einen elektrischen Kontakt schließt oder öffnet. Je nach verschlossenem Element wird die entsprechende Attributgruppe ausgewählt: Bahnübergang, Gleissperre, Schlosskombination, Sonderanlage (z. B. bewegliche Brücke), Schlüsselsperre, Weiche. DB-Regelwerk Auf dem Lageplan werden nach 819.9002 3 dargestellt: Schlösser durch ein Symbol (z. B. Schlüsselsperre) oder zusätzliche Angaben zu anderen Symbolen (z. B. Weiche); Abhängigkeiten durch eine Zeichnung mit wiederholter Darstellung der Schlossstellungen als gefülltes oder leeres Schlüsselloch. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schloss</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Schloss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss'"
	 * @generated
	 */
	EList<Schloss> getSchloss();

	/**
	 * Returns the value of the '<em><b>Schlosskombination</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schlosskombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mechanische Einrichtung zur Freigabe mehrerer (abhängiger) Schlüssel durch einen (Haupt-) Schlüssel. Der Hauptschlüssel wird so lange festgehalten, wie mindestens ein Riegel der abhängigen Schlösser ausgefahren ist. In der Regel besteht die Grundstellung darin, dass der Hauptschlüssel entfernt und die abhängigen Schlüssel eingeschlossen sind. DB-Regelwerk Darstellung durch Zeichnung im Lageplan. Eine aktuelle Ril dazu existiert nicht, es werden alte Zeichnungsstandards verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schlosskombination</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Schlosskombination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schlosskombination'"
	 * @generated
	 */
	EList<Schlosskombination> getSchlosskombination();

	/**
	 * Returns the value of the '<em><b>Schluessel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sicherungstechnisches Element zur Herstellung von Schlüsselabhängigkeiten über Schlösser an Elementen. Der Schlüssel im sicherungstechnischen Sinn ist ein repräsentativer und innerhalb einer Örtlichkeit einmaliger Gegenstand. Durch den Besitz des Schlüssels kann sicher und eindeutig auf einen bestimmten Anlagenzustand geschlossen werden. Somit können durch Verknüpfung mit weiteren Fahrwegelementen oder einer informationsverarbeitenden Einheit sichere Abhängigkeiten geschaffen werden. In der Regel gibt es örtlich immer zwei gleich schließende Schlösser, selten mehr. Wird eine Schlüsselsperre nur als Schalter benutzt (z. B. um Fahrstraßen zu sperren), gibt es zu einem Schlüssel nur ein Schloss. Um die örtliche Einmaligkeit herzustellen, darf eine Schlüsselform nur einmal innerhalb einer Betriebsstelle oder besser noch eines Streckenabschnitts verwendet werden. Dazu sind 24 verschiedene Schlüsselbartformen vorhanden, die mit sechs Schlüsselgruppen kombiniert werden können. Nicht jede Bartform wird mit jeder Gruppe kombiniert. So stehen insgesamt 92 verschiedene Schlüsselformen zur Verfügung. DB-Regelwerk Die Planung der Schlüsselformen ist bisher nicht Bestandteil des PT1. Für die Formen existieren Regelzeichnungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schluessel</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Schluessel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schluessel'"
	 * @generated
	 */
	EList<Schluessel> getSchluessel();

	/**
	 * Returns the value of the '<em><b>Schluesselsperre</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluesselsperre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektromechanisches Bauelement, das die Anwesenheit eines Schlüssels prüft, ihn festhält und eine Abhängigkeit zur Stellwerkslogik besitzt. Schlüsselsperren dienen der Festhaltung bzw. Freigabe von Schlüsseln, mit denen in der Regel weitere Elemente bedienbar gemacht werden. In Einzelfällen dienen Schlüsselsperren nur als Schlüsselschalter. Die Darstellung im Lageplan erfolgt am Ort der Bedienung (z. B. Stellwerk, sonstiges Gebäude), der durch die Unterbringung beschrieben wird. Eine Darstellung am oder auf dem Gleis erfolgt nicht! DB-Regelwerk Darstellung durch Zeichnung im Lageplan nach 819.9002 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schluesselsperre</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Schluesselsperre()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schluesselsperre'"
	 * @generated
	 */
	EList<Schluesselsperre> getSchluesselsperre();

	/**
	 * Returns the value of the '<em><b>Schrankenantrieb</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung von Schrankenantrieben für Bahnübergänge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schrankenantrieb</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Schrankenantrieb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schrankenantrieb'"
	 * @generated
	 */
	EList<Schrankenantrieb> getSchrankenantrieb();

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Signale.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische, punktförmig verortete Einrichtung der Eisenbahninfrastruktur, die als Teil der Außenanlage einer Außenelement-Ansteuerung mit statischen oder dynamischen Signalbildern Anweisungen zur Fahrweise oder andere Verhaltensvorschriften an den Triebfahrzeugführer übermittelt oder als Teil der Innenanlage einer Außenelement-Ansteuerung mittels eines Bedienpunkts zur Behandlung von Fahrwegen als Start- oder Zielsignal dient. Steht ein Signal an einer Grenze zweier Bereiche, so ist es dem Bereich zuzuordnen, dem der vom Signal gedeckte Gleisabschnitt angehört. Das Objekt Signal beinhaltet zentrale Eigenschaften, die bei Signalen der Außenanlage in Signal-Befestigungen bzgl. der Konstruktion und in Signal-Rahmen bzgl. der zugeordneten Signalbegriffe ergänzt werden. Je nach Ausführung eines Signals der Außenanlage können dafür mehrere Signal-Befestigungen erforderlich sein (z.B. \u0027Fundament\u0027 und \u0027Signalanordnung\u0027), dafür mehrere Signal-Rahmen erforderlich sein (z.B. \u0027Schirm\u0027, 2x\u0027Zusatzanzeiger\u0027 und \u0027Bezeichnungsschild\u0027) und / oder zeitgleich mehrere Signalbegriffe angezeigt werden, die zu diesem Zeitpunkt für ein Gleis - meist nur in einer Fahrtrichtung - an einem Punkt gültig sind und deren logische Überlagerung zur Handlungsanweisung für den Triebfahrzeugführer wird. Signalbilder, die zwar einem gemeinsamen Punkt zugeordnet sind, aber keiner gemeinsamen logischen Interpretation bedürfen, werden unterschiedlichen Signalen zugeordnet. Kann ein Signal mehrere Signalbilder anzeigen, so werden diese in Gruppen (analog zur Konstruktion) zusammengefasst, jede dieser Gruppen bildet einen Signal-Rahmen. Zur ausführliche Beschreibung der Modellierung eines Signals s. Modellierung Signal. Besonderheiten zur Verortung von Signalen sind unter Punkt Objekt beschrieben. DB-Regelwerk 301, 819.02, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2, vereinzelt sind einzelne Angaben auch anderen Fundorten zugeordnet, dies ist den jeweiligen Einzelbeiträgen zu entnehmen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Signal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal'"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Signal Befestigung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Konstruktionselement, das der baulichen Aufnahme eines oder mehrerer Signalrahmen dient. Die konkreten konstruktiven Merkmale sind in einer (oder im Bedarfsfall mehreren) Regelzeichnung(en) enthalten, auf die jeweils ein GUID-Verweis zeigt. Bei Sonderkonstruktionen wird die Regelzeichnung durch die zugehörigen Zulassungsdokumente ersetzt. Diese sind als Anhang mittels eines Bearbeitungsvermerks beizufügen. Signalbefestigungen können auch weitere Signalbefestigungen aufnehmen (z.B. trägt ein Signalausleger eine Arbeitsbühne). Einer Signalbefestigung ist mindestens ein Objekt Signal Rahmen oder Signal Befestigung zugeordnet. Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Regelzeichnungen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Befestigung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SignalBefestigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigung'"
	 * @generated
	 */
	EList<Signal_Befestigung> getSignalBefestigung();

	/**
	 * Returns the value of the '<em><b>Signal Fank Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Signale.Signal_Fank_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung des Fahrtankünders (Weißes Dreieck) sowie Zuordnung der Startsignale, für die eine Fahrtankündigung erfolgen soll. Ein physischer Fahrtankünder (Anzeiger) wird als Signal abgebildet, wobei hierbei nur die Attributgruppen Bezeichnung sowie Signal_Real zu nutzen sind (nicht: Signal_Real_Aktiv, da kein Anschluss mittels ID_Stellelement an ein Stellwerk). Erfolgt die Fahrtankündigung ausschließlich auf mobilen Endgeräten, so entfällt das Anlegen des Signals für den Fahrtankünder. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Fank Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SignalFankZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Fank_Zuordnung'"
	 * @generated
	 */
	EList<Signal_Fank_Zuordnung> getSignalFankZuordnung();

	/**
	 * Returns the value of the '<em><b>Signal Rahmen</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Signale.Signal_Rahmen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fiktive Signale haben keinen Signalrahmen, da sie keinen Signalbegriff zeigen können. Ein oder mehrere Signalrahmen bilden ein Signal. Die Gruppierung von Signalbegriffen innerhalb eines Signals zu Signalrahmen wird anhand der konstruktiven Gestaltung vorgenommen, z.B. werden alle Signalbegriffe des Hauptsignalschirms oder alle Signalbegriffe eines Zusatzanzeigers jeweils zu einem Signalrahmen zusammengefasst. Kann die Anzahl oder Art der Signalbegriffe eines Signalrahmens in Abhängigkeit vom betrieblichen Zustand geändert werden, so wird dieser als schaltbar bezeichnet, andernfalls als fest. Im LST-Datenmodell ist diese Eigenschaft als Attribut zu den Signalbegriffen definiert; ein Signalrahmen ist danach genau dann schaltbar, wenn mindestens eines der enthaltenen Signalbegriffe schaltbar ist. Typische schaltbare Signalrahmen sind der Signalschirm eines Mehrabschnittssignals, das Lichtsignal eines Zusatzanzeigers und das Form- oder Lichtsignal eines Weichensignals. Typische feste Signalrahmen sind das Mastschild eines Hauptsignals, das Formsignal eines Zusatzanzeigers und die Haltetafel. Über den Signalrahmen erfolgt, sofern dies geplant ist, die Zuordnung von Signalbegriffen eines nachgeordneten Signals zu einem anderen Signal ohne Bezug zur Fahrstraße, siehe dazu ID Signal Nachordnung Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung. In der Regel aus den Angaben in der Signaltabelle 1 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Rahmen</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SignalRahmen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Rahmen'"
	 * @generated
	 */
	EList<Signal_Rahmen> getSignalRahmen();

	/**
	 * Returns the value of the '<em><b>Signal Signalbegriff</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Signale.Signal_Signalbegriff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stellt eine Information optisch dar, die das Signal dem Triebfahrzeugführer übermitteln soll. Signalbegriffe werden im Signalbuch (Ril 301) durch eine Kurzbezeichnung (z. B. \"Zs 1\") und / oder durch eine Langbezeichnung (z. B. \"Ersatzsignal\") beschrieben. Diese und weitere feste Eigenschaften wie der Wertevorrat der anzeigbaren Symbole eines Signalbegriffs sind im Objekt Signalbegriff definiert, das mittels des Attributes Signalbegriff ID eingebunden wird. Anschaltdauer, Beleuchtung und Schaltbarkeit sind nicht fest, sondern wählbar an den Signalbegriff nach Signalbuch gekoppelt und so Eigenschaft des Objekts Signal_Signalbegriff. Ein Signal_Signalbegriff befindet sich immer in einem Signal Rahmen. Ausführliche Beschreibung s. Modellierung Signal DB-Regelwerk Ril 301, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Signalbegriff</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SignalSignalbegriff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Signalbegriff'"
	 * @generated
	 */
	EList<Signal_Signalbegriff> getSignalSignalbegriff();

	/**
	 * Returns the value of the '<em><b>Sonstiger Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Fahrstrasse.Sonstiger_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nicht durch ein anderes Punkt Objekt festgelegter Markanter Punkt. Das Objekt Sonstiger_Punkt wird durch den LST-Planer angelegt, wenn kein bereits existierendes Punkt Objekt für die Beschreibung des Markanten Punktes zur Verfügung steht. Insbesondere handelt es sich dabei um: Beginn eines Bahnsteigs, Kante eines Gefahrraums am BÜ, Zugschluss bzw. -spitze, Beginn des zu deckenden Bereichs einer Deckungsstelle (z. B. bewegliche Brücke), sonstige Punkte (z. B. Merkpfahl, Laternenmast). DB-Regelwerk Siehe Markanter Punkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstiger Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_SonstigerPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sonstiger_Punkt'"
	 * @generated
	 */
	EList<Sonstiger_Punkt> getSonstigerPunkt();

	/**
	 * Returns the value of the '<em><b>Stell Bereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Stell_Bereich}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bereich_Objekt, mit dem ein Stellbereich beschrieben wird. Ein Stellbereich wird immer von einer AEA (Top) gesteuert. Grenzen des Stellbereichs sind Haupt-, Sperr- oder virtuelle Signale oder Gleisabschlüsse. Jedes Hauptgleis muss einem Stellbereich zugeordnet sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stell Bereich</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_StellBereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stell_Bereich'"
	 * @generated
	 */
	EList<Stell_Bereich> getStellBereich();

	/**
	 * Returns the value of the '<em><b>Stellelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Stellelement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusammenfassung der gemeinsamen Eigenschaften aller elektrisch bedienbaren Elemente der Außenanlage sowie der BÜ-Schnittstelle. Folgende Elemente sind Stellelemente: BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Die Übertragung von Information (Daten) und Energie ist in getrennten Verweisen modelliert. Erfolgt die Übertragung von Information und Energie gemeinsam, so sind beide Verweise mit dem gleichen Verweisziel anzugeben. DB-Regelwerk Die Zusammenfassung der Stellelemente dient der Vereinheitlichung der Modellierung und wird heute nicht explizit geplant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stellelement</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Stellelement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stellelement'"
	 * @generated
	 */
	EList<Stellelement> getStellelement();

	/**
	 * Returns the value of the '<em><b>Strecke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Strecke}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topologische Darstellung der Kilometrierungsachse. Die topologische Kilometrierungsachse wird durch fortlaufende Aneinanderreihung von GEO-Kanten gebildet, die mittels ID GEO Art auf diese Strecke verweisen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Strecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Strecke'"
	 * @generated
	 */
	EList<Strecke> getStrecke();

	/**
	 * Returns the value of the '<em><b>Strecke Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topologischer Punkt auf der zugehörigen Streckenlinie mit dem Wert der Streckenkilometrierung in Meterschreibweise. Der Streckenpunkt kann auf einen GEO Knoten verweisen, der über einen (oder mehrere) GEO_Punkte geografisch referenziert wird. Ohne diesen Verweis wird der Streckenpunkt nur auf eine Strecke mit Streckenkilometer referenziert. Die GEO Knoten sind über GEO_Kanten untereinander verbunden und beschreiben in ihrer Gesamtheit eine Streckenlinie. Jede Strecke hat mindestens zwei Streckenpunkte als Anfang und Ende der Strecke. Der GEO Knoten am Anfang bzw. am Ende einer Streckenlinie hat nur eine GEO Kante, ansonsten sind es zwei. An einem Kilometersprung werden zwei Streckenpunkte (ggf. mit identischen GEO-Koordinaten) gebildet. Die Länge der verbindende GEO_Kante (- oder +) beinhaltet den Wert des Kilometersprunges. Eine Überlänge ist negativ, eine Fehllänge ist positiv.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_StreckePunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Strecke_Punkt'"
	 * @generated
	 */
	EList<Strecke_Punkt> getStreckePunkt();

	/**
	 * Returns the value of the '<em><b>Technik Standort</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei DSTW: Bündelung der technischen Anlagen für ESTW_Zentraleinheit, Telekommunikation, Prozessdaten- und Diagnoseschnittstellen sowie die zugehörige technische Gebäudeausrüstung. Je Netzbezirk ist ein Technikstandort vorgesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technik Standort</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TechnikStandort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technik_Standort'"
	 * @generated
	 */
	EList<Technik_Standort> getTechnikStandort();

	/**
	 * Returns the value of the '<em><b>Technischer Bereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Technischer_Bereich}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung sonstiger bereichsförmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder während einer Planung manuell ergänzt. Sie dienen nur zur Information für planerische Entscheidungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technischer Bereich</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TechnischerBereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technischer_Bereich'"
	 * @generated
	 */
	EList<Technischer_Bereich> getTechnischerBereich();

	/**
	 * Returns the value of the '<em><b>Technischer Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung sonstiger punktförmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder während einer Planung manuell ergänzt. Sie dienen nur zur Information für planerische Entscheidungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technischer Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TechnischerPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technischer_Punkt'"
	 * @generated
	 */
	EList<Technischer_Punkt> getTechnischerPunkt();

	/**
	 * Returns the value of the '<em><b>TOP Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kante des topologischen Knoten-Kanten-Modells zur Darstellung der Gleislinien. Die TOP_Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei TOP Knoten enden. Eine TOP_Kante kann mehrere topographische Kanten (GEO_Kanten) beinhalten, die über GEO Knoten fortlaufend miteinander verbunden sind. Ein TOP Knoten ist immer auch ein GEO Knoten. Die Länge einer TOP Kante zwischen den Knoten A und B entspricht der Summe der GEO_Kanten zwischen A und B (reale Gleislänge) und wird auf Millimetergenauigkeit gerundet. Die maximale Länge einer TOP_Kante ist im Modell auf 99999,999 m (\u0026lt;100 km) begrenzt. Um ein eindeutiges Routing im topologischen Modell zu ermöglichen, sind die Anschlussarten der Kante an den beiden Knoten A und B anzugeben (siehe Attribute TOP_Anschluss_A bzw. TOP_Anschluss_B). Hierbei ist zu beachten, dass ein Routing über die Verbindung Anschluss Links - Rechts ausgeschlossen ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TOP Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TOPKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TOP_Kante'"
	 * @generated
	 */
	EList<TOP_Kante> getTOPKante();

	/**
	 * Returns the value of the '<em><b>TOP Knoten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.TOP_Knoten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Knoten des topologischen Knoten-Kanten-Modells. Der TOP_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den TOP_Knoten anschließenden topologischen Kanten ist je nach Art des TOP_Knoten unterschiedlich und muss mit der Anzahl der an den zugehörigen GEO Knoten anschließenden GEO_Kanten übereinstimmen: eine TOP-Kante: Gleisende, Digitalisierungsende, Betrachtungsende; drei TOP-Kanten: verzweigendes Fahrwegelement (siehe Modellierung Weichen). Weitere Fälle mit 0..2 anschließenden TOP-Kanten treten am Verbindungsknoten auf (siehe entsprechende Beschreibung). (E) Das die Attributgruppe Art Besonders zum Entfall vorgesehen ist, wird nach der Version 1.8.0 auch die Attributgruppe TOP_Knoten_Allg aufgelöst. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TOP Knoten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TOPKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TOP_Knoten'"
	 * @generated
	 */
	EList<TOP_Knoten> getTOPKnoten();

	/**
	 * Returns the value of the '<em><b>Trasse Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kante des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgefäßsystems (Kabeltrasse) oder gleichartiger Medientrassen. Die Trasse Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei Trasse Knoten enden. Der geometrische Verlauf einer Trasse_Kante kann durch eine oder mehrere GEO_Kanten beschrieben werden (siehe auch TOP_Kante).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trasse Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TrasseKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trasse_Kante'"
	 * @generated
	 */
	EList<Trasse_Kante> getTrasseKante();

	/**
	 * Returns the value of the '<em><b>Trasse Knoten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Medien_und_Trassen.Trasse_Knoten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Knoten des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgefäßsystems (Kabeltrasse) oder gleichartiger Medientrassen. Der Trasse_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den Trasse_Knoten anschließenden topologischen Kanten ist je nach Art des Trasse_Knoten unterschiedlich und muss mit der Anzahl der an den zugehörigen GEO Knoten anschließenden GEO_Kanten übereinstimmen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trasse Knoten</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_TrasseKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Trasse_Knoten'"
	 * @generated
	 */
	EList<Trasse_Knoten> getTrasseKnoten();

	/**
	 * Returns the value of the '<em><b>Ueberhoehung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlicher Höhenunterschied beider Schienen eines Gleises in Querrichtung. Die Überhöhung ist eine Querneigung eines Gleises in einem Bogen an einem Punkt im Gleis. Durch die seitliche Lage (als Attribut des Punkt_Objektes - links oder rechts) wird die höhere Seite der beiden Schienen beschrieben. Hinweis: Die Angabe erfolgt derzeit noch in mm! Es ist zur Vereinheitlichung im Modell vorgesehen, diesen Wert künftig (nach der Version 1.7.0) in Meter anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Ueberhoehung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehung'"
	 * @generated
	 */
	EList<Ueberhoehung> getUeberhoehung();

	/**
	 * Returns the value of the '<em><b>Ueberhoehungslinie</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Überhöhungsverlauf zwischen zwei Überhöhungspunkten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehungslinie</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Ueberhoehungslinie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehungslinie'"
	 * @generated
	 */
	EList<Ueberhoehungslinie> getUeberhoehungslinie();

	/**
	 * Returns the value of the '<em><b>Uebertragungsweg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physikalischer/logischer Übertragungsweg zwischen zwei Objekten für eine erforderliche Informationsübertragung. Die Angabe erfolgt, wenn der Übertragungsweg vom Betreiber beigestellt wird oder die Informationsübertragung vom Lieferanten zusätzlich zu schalten ist. Es geht um die Erfassung der physikalischen/logischen Verbindung zweier Objekte, die entweder einer funktionalen Verbindung zwischen den Objekten des Modells selbst dient, z.B. der ESTW-Bus zwischen zwei Aussenelementansteuerungen; einer funktionalen Verbindung eines Objektes des Modells zu einer nicht im Modell befindlichen Komponente dient, z.B. der Anbindung der KUS über die ZN_ZBS an die Leittechnik der BZ; einer funktionalen Verbindung zwischen zwei Komponenten, die nicht im Modell abgebildet sind, aber über diese angebunden werden und darum für die SBI dokumentiert werden müssen, z.B. die Verbindung von der LZB-Zentrale in der ESTW Zentraleinheit zum LZB-Bedienplatz in der Bedien Zentrale. Je nach Art und Anwendungsfall kann ein Objekt nur eine oder auch mehrere Verbindungen zu einem oder mehreren anderen Objekten haben. Der Anschluss von stellwerkstypischen Elementen an das Stellwerk (Kabelanlage) wird nicht mit diesem Objekt abgebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uebertragungsweg</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Uebertragungsweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Uebertragungsweg'"
	 * @generated
	 */
	EList<Uebertragungsweg> getUebertragungsweg();

	/**
	 * Returns the value of the '<em><b>Unterbringung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ort der Anordnung von nicht an das Gleis gebundenen Komponenten. Die Verortung der U. erfolgt entweder analog zum Punkt Objekt, mit einem GEO Punkt oder durch einen beschreibenden Text. Eine U. beschreibt in der Regel die Umhausung der Komponente. Ist sie nicht eingehaust, wird als Unterbringung Art \"keine\" angegeben. In diesen Fällen hat die Komponente dennoch eine Unterbringung Befestigung. Das ist z. B. der Fall, wenn eine wetterfeste Komponente (z. B. Schlüsselschalter) ohne Einhausung direkt an einem Pfosten befestigt ist. In einer U. können mehrere LST-Objekte untergebracht sein. Eine U. ist z. B. ein Betonschalthaus oder ein Schaltkasten. DB-Regelwerk Darstellung des Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterbringung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Unterbringung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unterbringung'"
	 * @generated
	 */
	EList<Unterbringung> getUnterbringung();

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung von Lichtzeichen und Andreaskreuzen im Rahmen der BÜ-Planung. Die Attributgruppe Verkehrszeichen_Lz entfällt bei nichttechnisch gesicherten BÜ oder beschrankten BÜ mit Läutewerk. Die Attributgruppe Verkehrszeichen_Andreaskreuz entfällt bei vorgeschalteten Lichtzeichen. Mehrere Andreaskreuze bei einmündenden Straßen sind möglich (i. d. R. max 3). Die Attributgruppe Vz_Sperrstrecke entfällt bei vorgeschalteten Lichtzeichen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verkehrszeichen</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Verkehrszeichen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen'"
	 * @generated
	 */
	EList<Verkehrszeichen> getVerkehrszeichen();

	/**
	 * Returns the value of the '<em><b>WKr Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauliche Gesamtheit des Objektes Weiche oder Kreuzung einschließlich der für seine Funktion unmittelbar und in der Nähe vorhandenen Stell-, Steuer- und Überwachungseinrichtungen. Typische Grundformen der Weichenanlagen sind: einfache Weiche (EW), einfache Kreuzungsweiche (EKW), doppelte Kreuzungsweiche (DKW), starre Kreuzung (KR) und Flachkreuzungen mit doppelten Herzstücken und beweglichen Spitzen (KR). Grundlage der Bezeichnungen ist die Ril 800.0120 in Verbindung mit den zugehörigen Anlagen. Weichenanlagen werden unterteilt in die einzelnen Elemente (Weichenelement). Die Elemente besitzen eine oder mehrere Komponenten (Weichenkomponente). Diese Objekte beschreiben in Verbindung mit Regelzeichnungen weitere Eigenschaften (z.B. Antriebe und Endlagenprüfer) der Weichenanlage. Siehe auch Modellierung Weichen. DB-Regelwerk Ril 800.0120 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Anlage</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_WKrAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Anlage'"
	 * @generated
	 */
	EList<W_Kr_Anlage> getWKrAnlage();

	/**
	 * Returns the value of the '<em><b>WKr Gsp Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einzeln stellbarer Teil einer Weichenanlage oder einer Gleissperre, der höchstens zwei Stellungen (Fahrrichtung rechts oder links bzw. Entgleisungsschuh aufgelegt oder abgelegt) annehmen kann. Weichenanlagen bekommen 1 bzw. 2 Weichenelemente zugeordnet. Jedes Weichenelement besteht aus mindestens einer (ggf. mehreren) Komponenten (Zungenpaare), die die technische Sicht darstellen. Eine Kreuzung hat zwei Weichenelemente (A- und B-Seite). Im Fall beweglicher doppelter Herzstückspitzen hat die Kreuzung auch zwei Endlagen. Eine starre Kreuzung hat keine Regelzeichnung, da diese keinen Antrieb besitzt. Gleissperren haben kein Objekt im Sinn einer Anlage. Die Attributgruppen GZ_Freimeldung_R bzw. GZ_Freimeldung_L werden nur angegeben, wenn der rechte bzw. linke Schenkel einer Weiche nicht grenzzeichenfrei freigemeldet ist. Wenn das Element weder für eine Weiche oder Gleissperre genutzt wird (z.B. Verrrieglung einer beweglichen Brücke oder eines Tors), werden die Attributgruppen Gleissperre_Element und Weiche_Element nicht verwendet (optionale Choice). Siehe auch Modellierung Weichen. DB-Regelwerk Weichen werden gemäß Richtlinie 800.0120 gebaut. Für die Anordnung der Bauteile (einschließlich Antriebe) an einer Weiche und der Gleissperren existieren Regelzeichnungen der Gruppe S 73xx. Für die Planung von Weichen ist das Regelwerk 819.0401 zu beachten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Gsp Element</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_WKrGspElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Gsp_Element'"
	 * @generated
	 */
	EList<W_Kr_Gsp_Element> getWKrGspElement();

	/**
	 * Returns the value of the '<em><b>WKr Gsp Komponente</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einzelner Teil der Weichenanlage (Zungenpaar) oder konstruktiver Mittelpunkt einer Kreuzung in Form von 2 Kreuzungsseiten. Mit Hilfe der W_Kr_Gsp_Komponente als punktförmiges Objekt wird die Verknüpfung mit dem Knoten im Topologischen Modell hergestellt. Als Zuordnungspunkte für die Topologie und die Topographie werden Weichenknoten definiert. Die Verortung der Weichenkomponente ist in für die typischen Anwendungsfälle in der Modellierung Weichen dargestellt. Bei einfachen Weichen entspricht der Weichenknoten dem Weichenanfang. Bei EKW und DKW entspricht der Weichenknoten dem Anfang der entsprechenden Zungenpaare (auch hier einheitlich als Weichenanfang bezeichnet). Bei einer Kreuzung wird der Mittelpunkt der Kreuzung als Weichenknoten verwendet. Beide Kreuzungsseiten werden jeweils auf die beiden sich kreuzenden TOP-Kanten verortet. Der Mittelpunkt einer Kreuzung ist kein TOP-Knoten und kein GEO-Knoten. Bei Gleissperren wird die Lage des Entgleisungsschuhs verortet. Über die Seitliche Lage im Punkt Objekt wird die Schiene bestimmt, an der der Entgleisungsschuh angebracht ist. Die seitliche Lage wird im Bezug auf die Richtung der TOP_Kante angegeben und stellt nicht die Entgleisungsrichtung dar! Wenn die Weichenkomponente mit einem nicht mechanisch mit der Weiche verbundenen (Weichen-)Signal (z. B. Rückfallweichensignal, Weichenlagemelder) ausgerüstet werden soll, erfolgt die Modellierung dieses Signals als ein gesondertes Objekt Signal. Auf dieses Signal wird von W Kr Anlage (wenn die Anlage ein Signal hat) bzw. W Kr Gsp Element (wenn mehrere Elemete vorhanden sind und diese unterschiedliche Signale haben) verwiesen. Der Weichelagemelder einer DKW wird von den beiden W_Kr_Gsp_Element gesteuert, aber in einem Signal angezeigt. Er wird deshalb nur als ein Signal in der Weichenanlage modelliert. Ein mit der Weichenkomponente mechanisch verbundenes Weichensignal wird gemäß Regelzeichnung errichtet, wenn das Attribut Weichensignal gesetzt ist. Es wird dann kein gesondertes Signal modelliert. Siehe auch Modellierung Weichen. Die im Glossar mit (E) gekennzeichneten Attribute Radius_L und Radius_R sollen nicht mehr befüllt werden, da ein künftiger Entfall vorgesehen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Gsp Komponente</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_WKrGspKomponente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Gsp_Komponente'"
	 * @generated
	 */
	EList<W_Kr_Gsp_Komponente> getWKrGspKomponente();

	/**
	 * Returns the value of the '<em><b>Weichenlaufkette</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichenlaufkette}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt von mehreren durch Antriebe stellbaren Fahrwegelementen (Weichen, Gleissperren, sonstigen stellbaren Elementen), deren Umlauf automatisch bei einer entsprechenden Anforderung (z.B. Fahrstraße) erfolgt. Diese stellbaren Elemente können nur dann automatisch gestellt werden, wenn sie auch einer Weichenlaufkette (WLK) zugeordnet sind. Jedes stellbare Element wird genau einer WLK zugeordnet. Durch Sperren der WLK kann dieser automatische Umlauf verhindert werden. Innerhalb von Weichenlaufketten sind dabei folgende Elemente zulässig: Weichen, Gleissperren und Sonderelemente, die automatisch umlaufen sollen. Für die Bedienung von Ersatzaufträgen des Typs 2 (EE2, VE2, LE2) an Hauptsignalen müssen eine oder mehrere Weichenlaufketten gesperrt werden. Zur Reduzierung betrieblicher Behinderungen werden oftmals mehrere Weichenlaufketten in einer Betriebsstelle eingerichtet. DB-Regelwerk Die Bezeichnung der Weichenlaufkette wird gemäß Ril 819.0603 in der Form LKn (n = laufende Nummer) gebildet und in der Attributgruppe Bezeichnung abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weichenlaufkette</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Weichenlaufkette()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weichenlaufkette'"
	 * @generated
	 */
	EList<Weichenlaufkette> getWeichenlaufkette();

	/**
	 * Returns the value of the '<em><b>Weichenlaufkette Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt für die Zuordnung zwischen Weichenlaufketten und Signalen. Das Objekt ist in der Realität des Stellwerkes nicht vorhanden. Die Weichenlaufkette_Zuordnung hat keine Attributgruppe \"..._Allgemeine_Merkmale\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weichenlaufkette Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_WeichenlaufketteZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weichenlaufkette_Zuordnung'"
	 * @generated
	 */
	EList<Weichenlaufkette_Zuordnung> getWeichenlaufketteZuordnung();

	/**
	 * Returns the value of the '<em><b>ZL</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anlage zur automatischen Einstellung von Fahrstraßen aufgrund von Zuglaufinformationen. Die Zuglenkung ist eine Anlage, die der Unterstützung des Betriebsablaufes dient. Aufgabe der Zuglenkung ist es, auf der Basis von Zuglaufinformationen und zugbezogenen Vorgaben für die Benutzung von Strecken- und Bahnhofsgleisen ohne unmittelbare Mitwirkung des Bedieners Stellkommandos an das zuständige Stellwerk auszugeben, ihre Ausführung zu überwachen und sich aus Meldungen des Stellwerkes ergebenden Handlungsbedarf an den Bediener weiterzugeben. Zuglaufinformationen erhält die Zuglenkung von der Zuglaufverfolgung (ZLV), die vorgesehene Benutzung der Strecken- und Bahnhofsgleise sowie Wartebedingungen einschließlich besonderer Bedingungen für die Regelung der Reihenfolge der Züge aus einem sogenannten Lenkplan, der in Form einer Gleisbenutzungstabelle (GBT) darstellbar ist. Alle Signale und Fahrstraßen, die mit der Zuglenkung behandelt werden, werden in dem Objekt Zuglenkung_Element aufgenommen und bekommen dort zusätzliche Eigenschaften für die Nutzung in der ZL. Angaben zur Verwendung der Signale und zugehörigen Gleisabschnitte für die Lenkplanerstellung erfolgen in der Gleisbenutzungstabelle. DB-Regelwerk 819.0732 Gleisbenutzungstabelle Weitere Angaben finden sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL'"
	 * @generated
	 */
	EList<ZL> getZL();

	/**
	 * Returns the value of the '<em><b>ZLDLP Abschnitt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sammlung der Gleisabschnitte, die in ZL DLP Fstr eingebunden werden und für die eine Prüfung auf Deadlock erfolgen muss. DB-Regelwerk TM 2011-024 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLDLP Abschnitt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLDLPAbschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_DLP_Abschnitt'"
	 * @generated
	 */
	EList<ZL_DLP_Abschnitt> getZLDLPAbschnitt();

	/**
	 * Returns the value of the '<em><b>ZLDLP Fstr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Fstr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von ZL-DLP-Abschnitten zur ZL-Fahrstraße. DB-Regelwerk TM 2011-024 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLDLP Fstr</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLDLPFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_DLP_Fstr'"
	 * @generated
	 */
	EList<ZL_DLP_Fstr> getZLDLPFstr();

	/**
	 * Returns the value of the '<em><b>ZL Fstr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt zur Aufnahme verschiedener Anstosspunkte (mittels ZL Fstr Anstoss) abhängig von den zugehörigen Vorsignalen und den Geschwindigkeitsklassen für die ZL. Über den Verweis zur Fstr Zug Rangier ist die Verbindung zur Fstr des ESTW hergestellt. Für eine Fstr des ESTW kann es mehrere ZL_Fstr geben, umgekehrt gilt dies nicht. DB-Regelwerk 819.0732 6 (1)b In der Tabelle der Zuglenkanstöße entspricht eine Zeile einer ZL-Fahrstraße. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL Fstr</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr'"
	 * @generated
	 */
	EList<ZL_Fstr> getZLFstr();

	/**
	 * Returns the value of the '<em><b>ZL Fstr Anstoss</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit ZL_Fstr_Anstoss wird für eine Fahrstrasse der Zuglenkung der Anstosspunkt gebildet. Die für diese ZL-Fahrstraße relevante(n) Geschwindigkeitsklasse(n) (GK) wird/werden über die entsprechende Attributgruppe zugeordnet. DB-Regelwerk 819.0732 11 In der Tabelle der Zuglenkanstöße findet sich die Angabe in der Spalte \"EP-MO\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL Fstr Anstoss</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLFstrAnstoss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Anstoss'"
	 * @generated
	 */
	EList<ZL_Fstr_Anstoss> getZLFstrAnstoss();

	/**
	 * Returns the value of the '<em><b>ZL Signalgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gruppe von Signalen (Haupt-, Sperrsignale), die von der Zug- bzw. Rangierlenkung für die Vorzugregelung benötigt wird. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL Signalgruppe</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLSignalgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Signalgruppe'"
	 * @generated
	 */
	EList<ZL_Signalgruppe> getZLSignalgruppe();

	/**
	 * Returns the value of the '<em><b>ZL Signalgruppe Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Signalen zur ZL Signalgruppe. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL Signalgruppe Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLSignalgruppeZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Signalgruppe_Zuordnung'"
	 * @generated
	 */
	EList<ZL_Signalgruppe_Zuordnung> getZLSignalgruppeZuordnung();

	/**
	 * Returns the value of the '<em><b>ZLV Bus</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuglaufverfolgungsbus. Verbindung zwischen den ZN-Unterstationen zum Transport der Zugnummernmeldetelegramme. ZLV-Busse können BZ-übergreifend geplant werden. In diesem Fall gelten für die Vergabe der ZLV Bus Nr besondere Bedingungen. DB-Regelwerk 819.0731 8 (2) Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLV Bus</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLVBus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus'"
	 * @generated
	 */
	EList<ZLV_Bus> getZLVBus();

	/**
	 * Returns the value of the '<em><b>ZLV Bus US Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von ZLV-Bussen zur ZN Unterstation und Angabe durchzureichender Telegramme. Logisches Objekt, falls eine ZN Unterstation an mehrere ZLV-Busse angebunden wird. DB-Regelwerk 819.0731 5 (4) ff Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLV Bus US Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZLVBusUSZuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_US_Zuordnung'"
	 * @generated
	 */
	EList<ZLV_Bus_US_Zuordnung> getZLVBusUSZuordnung();

	/**
	 * Returns the value of the '<em><b>ZN</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zugnummernmeldeanlage. Wird die ZN-Anlage zusammen mit dem ESTW geplant, gibt es keinen Verweis auf die Anhänge, da die ZN bereits in der ESTW-Konfiguration berücksichtigt ist. Wird die ZN nachgerüstet, sind die Verweise auf ESTW_Zentraleinheit und Anhänge vorhanden. Kann eine ESTW-Bauform keine ZN berücksichtigen, dann gibt es keinen Verweis auf ESTW_Zentraleinheit. DB-Regelwerk 819.0731 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN'"
	 * @generated
	 */
	EList<ZN> getZN();

	/**
	 * Returns the value of the '<em><b>ZN Akustik</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Akustik}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Akustisches Signal bei Befüllung eines ZN-Anzeigefeldes mit einer Zugnummer Bei der Planung der ZN-Akustik sind herstellerspezifische Besonderheiten zu beachten. Akustiken im Anbiete-/Annahmefeld sind Standard und nicht gesondert zu planen. Das Objekt bzw. die Attributgruppe wird bei Anbiete/Annahme- sowie Voranzeigefeldern IMMER angelegt, um die Dauer der Akustik festzulegen. Für die weiteren ZN-Anzeigefelder wird das Objekt nur dann angelegt, wenn das betreffene ZN Anzeigefeld mit einer Akustik ausgestatteet wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht vorhanden. Es findet sich im Lastenheft sowie in den firmenspezifischen Projektierungsunterlagen, die dem LST-Fachplaner nicht zur Verfügung stehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Akustik</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNAkustik()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Akustik'"
	 * @generated
	 */
	EList<ZN_Akustik> getZNAkustik();

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Anzeigefeld}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt, welches die Funktionalitäten der ZN auf der Bedienoberfläche abbildet. Für jedes Gleis, in denen die ZN-Anlage Zugnummern verwalten und/oder anzeigen soll, ist mindestens ein ZN-Anzeigefeld zu definieren. Hinsichtlich der Besonderheiten bei der Bezeichnug wird auf die Ausführungen auf der Seite Bezeichnung ZN-Anzeigefeld verwiesen. DB-Regelwerk 819.0731 6 (1) bis (15) sowie (19) ff 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNAnzeigefeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld'"
	 * @generated
	 */
	EList<ZN_Anzeigefeld> getZNAnzeigefeld();

	/**
	 * Returns the value of the '<em><b>ZN Fortschalt Kriterium</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekt, welches die funktionellen ZN-Fortschaltkriterien beschreibt. Die Attributgruppe ZN_Fortschalt_Krit_Druck wird nur angelegt, wenn aus dem Fortschaltkriterium ein Druck erzeugt wird. DB-Regelwerk 819.0731 6 (16) und (17) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Fortschalt Kriterium</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNFortschaltKriterium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Fortschalt_Kriterium'"
	 * @generated
	 */
	EList<ZN_Fortschalt_Kriterium> getZNFortschaltKriterium();

	/**
	 * Returns the value of the '<em><b>ZN Telegramm84 Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt, welches die Verbindung zwischen ZN und ggf. der einzelnen Fahrstraße herstellt, für die das Telegramm 84 gesendet werden soll. Herstellerbezogen kann die Sendung des Telegramms 84 für jede einzelne Fahrstraße oder nur für alle Fahrstraßen programmiert werden. DB-Regelwerk 819.0731A02 1 (5) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Telegramm84 Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNTelegramm84Zuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Telegramm_84_Zuordnung'"
	 * @generated
	 */
	EList<ZN_Telegramm_84_Zuordnung> getZNTelegramm84Zuordnung();

	/**
	 * Returns the value of the '<em><b>ZN Telegramm85 Zuordnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logisches Objekt, welches die Verbindung zwischen ZN und ggf. der einzelnen Fahrstraße herstellt, für die das Telegramm 85 gesendet werden soll. Herstellerbezogen kann die Sendung des Telegramms 85 für jede einzelne Fahrstraße oder nur für alle Fahrstraßen programmiert werden. DB-Regelwerk 819.0731A02 1 (5) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Telegramm85 Zuordnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNTelegramm85Zuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Telegramm_85_Zuordnung'"
	 * @generated
	 */
	EList<ZN_Telegramm_85_Zuordnung> getZNTelegramm85Zuordnung();

	/**
	 * Returns the value of the '<em><b>ZN Unterstation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbindung zwischen ZN und ZLV Bus und/oder ZN ZBS. Über Modems wird die ZN an einen oder mehrere ZLV-Busse und ggf. an eine ZBS (Verbindung zu einer Bedien Zentrale) angebunden. Die Attributgruppe ZN_Unterstation_Bf_Nr kann mehrfach eingebunden werden. Damit werden alle Betriebsstellen, die ZN-seitig über diese Unterstation verwaltet bzw \"angesprochen\" werden, beschrieben. Der ZN-seitigen Bahnhofsnummer wird eine Örtlichkeit (Ril-100-Bezeichner der zugewiesenen Betriebsstelle) und ggf. eine Priorität zugeordnet. Letztere wird nur für diejenige Bahnhosnummer angegeben, die für die Kommunikation der ZN_Unterstation mit dem ZLV-Bus maßgebend ist. In allen anderen Fällen wird das Attribut nicht befüllt. Die Darstellung erfolgt auf dem ZLV-Bus-Übersichtsplan als tabellarischer Block mit den Zeilen \u0026lt;Bf-Nr\u0026gt; \u0026lt;Oertlichkeit_Abkuerzung\u0026gt; in dem Symbol für die ZN_Unterstation. Die Bahnhofsnummer mit Priorität wird direkt neben dem ZLV-Bus-Anschluss angeordnet. DB-Regelwerk 819.0731 5 Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Unterstation</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNUnterstation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Unterstation'"
	 * @generated
	 */
	EList<ZN_Unterstation> getZNUnterstation();

	/**
	 * Returns the value of the '<em><b>ZNZBS</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung der Parameter für die Anbindung einer ZN an die BZ. Der Verweis auf ID ESTW Zentraleinheit beschreibt den Ort der räumlichen Unterbringung der Koppelunterstation. Bei der Bearbeitung im Planungstool kann es notwendig sein, bereits bei Bearbeitung im Dialogfeld ZN-ZBS den Verweis auf die ESTW_Zentraleinheit zu befüllen. DB-Regelwerk 819.0731 6 (16) Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZNZBS</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZNZBS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_ZBS'"
	 * @generated
	 */
	EList<ZN_ZBS> getZNZBS();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grenze des Ausrüstungsbereichs eines Zugbeeinflussungssystems oder RBC-Grenze bei L2. Auch im Lastenheft bzw. Planungsregelwerk als Ausstieg definierte Bereichsgrenzen werden im Datenmodell generell als Einstieg abgebildet. Später Einstieg wird nicht abgebildet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZUBBereichsgrenze()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze> getZUBBereichsgrenze();

	/**
	 * Returns the value of the '<em><b>ZUB Streckeneigenschaft</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Streckeneigenschaft}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bereich mit einheitlicher Ausrüstung von Zugbeeinflussungssystem(en) oder Kennzeichnung eines besonderen Bereichs (z. B. großes Metallteil), der im Rahmen einer Balisen-Planung zu berücksichtigen ist.\nSofern in einem Bereich richtungsbezogen unterschiedliche Zugbeeinflussungssysteme genutzt werden (Grenzbereich), sind dafür richtungsbezogene Bereichsobjekte anzulegen.\nHinweis für Planungswerkzeuge: Die Definition des Bereichsobjekts ZUB_Streckeneigenschaft richtet sich nach dem Punktobjekt ZUB_Bereichsgrenze.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZUB Streckeneigenschaft</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_ZUBStreckeneigenschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Streckeneigenschaft'"
	 * @generated
	 */
	EList<ZUB_Streckeneigenschaft> getZUBStreckeneigenschaft();

	/**
	 * Returns the value of the '<em><b>Zugeinwirkung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Ortung.Zugeinwirkung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Anlage, die durch die punktuelle Einwirkung eines Zuges einen Schaltvorgang auslösen kann. Bei BÜSA werden Ein- und Ausschaltpunkte sowie Kontakte für die Wirksamkeitsschaltung in Abhängigkeit vom Hersteller auf verschiedene Art ausgebildet: Die Hersteller Scheidt\u0026amp;Bachmann sowie PintschBamag verwenden als Zugeinwirkung Fahrzeugsensoren in Form von 8-förmig verlegten Schleifen im Gleis. Einschaltpunkte und Kontakte für die Wirksamkeitsschaltung werden im Regelfall aus zwei Schleifen, Ausschaltpunkte aus einer Schleife gebildet. Nur im Ausnahmefall werden beim Hersteller PintschBamag Einschaltpunkte mit drei Schleifen errichtet. Der Hersteller Siemens AG verwendet dagegen Achszählern vergleichbare sogenannte Doppelsensoren. Für das Modell werden, unabhängig von der herstellerspezifischen Ausbildung, Ein-und Ausschaltpunkte sowie Kontakte der Wirksamkeitsschaltung grundsätzlich als EINE Zugeinwirkung betrachtet. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugeinwirkung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getContainer_AttributeGroup_Zugeinwirkung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zugeinwirkung'"
	 * @generated
	 */
	EList<Zugeinwirkung> getZugeinwirkung();

} // Container_AttributeGroup
