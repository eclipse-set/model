/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

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

import org.eclipse.set.model.planpro.Verweise.VerweisePackage;

import org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.planpro.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Anb_Ann_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Sonst_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Anschlussnummer_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_Gegengleis_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Ausfahrdruck_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bedienbarkeit_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Besonderes_Schaltkriterium_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bezeichnung_Besondere_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Kennung_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ANB_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Bf_Nr_ZN_A_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Durchfahrdruck_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMAkustikAnbAnn;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMAkustikSonst;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMBfKennung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMFunktionalitaetAnzeigefeld;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMZBSSchnittstelle;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMZNAnlagentyp;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMZNAnzeigefeldLoeschkriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMZNModem;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ENUMZNSchaltkriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_Gegengleis_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einfahrdruck_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Einwahlstelle_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Funktionalitaet_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.HOA_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.IP_Adresse_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.KUs_Zeittelegramm_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Koppelunterstation_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Meldedruck_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Prioritaet_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Reaktivierungsfunktion_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Sichtbarkeit_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_02_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_03_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_04_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_10_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_21_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_30_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Alle_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Fuer_Alle_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_84_Verzicht_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Fuer_Alle_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegrammwiederholung_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Max_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Nr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Verzoegerung_Manuell_Loeschung_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Vormeldestart_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Adresse_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Anbindung_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZBS_Schnittstelle_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Nr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bedienbezeichner_Frei_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bezeichner_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anlagentyp_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Loeschkriterium_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Feld_Ohne_Anzeige_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Modem_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Schaltkriterium_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zeitsynchronisation_Funkuhr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Zugvorbereitungsmeldung_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.util.ZugnummernmeldeanlageValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZugnummernmeldeanlagePackageImpl extends EPackageImpl implements ZugnummernmeldeanlagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akustikdauer_Anb_Ann_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akustikdauer_Sonst_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akustikdauer_Voranz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschlussnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausfahrdruck_Gegengleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausfahrdruck_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedienbarkeit_Anzeigefeld_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besonderes_Schaltkriterium_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Besondere_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bf_Kennung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bf_Nr_ANB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bf_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bf_Nr_ZN_A_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durchfahrdruck_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einfahrdruck_Gegengleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einfahrdruck_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einwahlstelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funktionalitaet_Anzeigefeld_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adresse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass koppelunterstation_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kUs_Zeittelegramm_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meldedruck_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritaet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaktivierungsfunktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sichtbarkeit_Anzeigefeld_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_02_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_03_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_04_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_10_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_21_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_30_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_84_Alle_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_84_Einzelne_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_84_Fuer_Alle_Fstr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_84_Verzicht_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_85_Alle_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_85_Einzelne_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegramm_85_Fuer_Alle_Fstr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegrammwiederholung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterstation_Max_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterstation_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verzoegerung_Manuell_Loeschung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vormeldestart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_Adresse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_Anbindung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_Schnittstelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeitsynchronisation_Funkuhr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_BusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Besondere_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_US_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlV_Bus_Zuordnung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass znEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_A_Bedienbezeichner_Frei_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_A_Bezeichner_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_AkustikEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Akustik_Anzeigefeld_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Anlagentyp_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_AnzeigefeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Anzeigefeld_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Anzeigefeld_Loeschkriterium_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Feld_Ohne_Anzeige_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Fortschalt_Krit_Druck_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Fortschalt_Krit_Schalt_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Fortschalt_KriteriumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Modem_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Schaltkriterium_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Telegramm_84_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Telegramm_85_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_UnterstationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Unterstation_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Unterstation_Bf_Nr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_ZBSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugvorbereitungsmeldung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAkustikAnbAnnEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAkustikSonstEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBfKennungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFunktionalitaetAnzeigefeldEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumzbsSchnittstelleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumznAnlagentypEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumznAnzeigefeldLoeschkriteriumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumznModemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumznSchaltkriteriumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anschlussnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType besonderes_Schaltkriterium_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Besondere_Anlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bf_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAkustikAnbAnnObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAkustikSonstObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBfKennungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFunktionalitaetAnzeigefeldObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumzbsSchnittstelleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumznAnlagentypObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumznAnzeigefeldLoeschkriteriumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumznModemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumznSchaltkriteriumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adresse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prioritaet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unterstation_Max_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unterstation_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verzoegerung_Manuell_Loeschung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zbS_Adresse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zlV_Bus_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zN_A_Bedienbezeichner_Frei_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zN_A_Bezeichner_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZugnummernmeldeanlagePackageImpl() {
		super(eNS_URI, ZugnummernmeldeanlageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ZugnummernmeldeanlagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZugnummernmeldeanlagePackage init() {
		if (isInited) return (ZugnummernmeldeanlagePackage)EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredZugnummernmeldeanlagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = registeredZugnummernmeldeanlagePackage instanceof ZugnummernmeldeanlagePackageImpl ? (ZugnummernmeldeanlagePackageImpl)registeredZugnummernmeldeanlagePackage : new ZugnummernmeldeanlagePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
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
		theZugnummernmeldeanlagePackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
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
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theZugnummernmeldeanlagePackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
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
		theLayoutinformationenPackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theZugnummernmeldeanlagePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ZugnummernmeldeanlageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theZugnummernmeldeanlagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZugnummernmeldeanlagePackage.eNS_URI, theZugnummernmeldeanlagePackage);
		return theZugnummernmeldeanlagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkustikdauer_Anb_Ann_TypeClass() {
		return akustikdauer_Anb_Ann_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkustikdauer_Anb_Ann_TypeClass_Wert() {
		return (EAttribute)akustikdauer_Anb_Ann_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkustikdauer_Sonst_TypeClass() {
		return akustikdauer_Sonst_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkustikdauer_Sonst_TypeClass_Wert() {
		return (EAttribute)akustikdauer_Sonst_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkustikdauer_Voranz_TypeClass() {
		return akustikdauer_Voranz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkustikdauer_Voranz_TypeClass_Wert() {
		return (EAttribute)akustikdauer_Voranz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschlussnummer_TypeClass() {
		return anschlussnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschlussnummer_TypeClass_Wert() {
		return (EAttribute)anschlussnummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusfahrdruck_Gegengleis_TypeClass() {
		return ausfahrdruck_Gegengleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusfahrdruck_Gegengleis_TypeClass_Wert() {
		return (EAttribute)ausfahrdruck_Gegengleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusfahrdruck_TypeClass() {
		return ausfahrdruck_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusfahrdruck_TypeClass_Wert() {
		return (EAttribute)ausfahrdruck_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedienbarkeit_Anzeigefeld_TypeClass() {
		return bedienbarkeit_Anzeigefeld_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedienbarkeit_Anzeigefeld_TypeClass_Wert() {
		return (EAttribute)bedienbarkeit_Anzeigefeld_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBesonderes_Schaltkriterium_TypeClass() {
		return besonderes_Schaltkriterium_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBesonderes_Schaltkriterium_TypeClass_Wert() {
		return (EAttribute)besonderes_Schaltkriterium_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Besondere_Anlage_TypeClass() {
		return bezeichnung_Besondere_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Besondere_Anlage_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Besondere_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBf_Kennung_TypeClass() {
		return bf_Kennung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBf_Kennung_TypeClass_Wert() {
		return (EAttribute)bf_Kennung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBf_Nr_ANB_TypeClass() {
		return bf_Nr_ANB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBf_Nr_ANB_TypeClass_Wert() {
		return (EAttribute)bf_Nr_ANB_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBf_Nr_TypeClass() {
		return bf_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBf_Nr_TypeClass_Wert() {
		return (EAttribute)bf_Nr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBf_Nr_ZN_A_TypeClass() {
		return bf_Nr_ZN_A_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBf_Nr_ZN_A_TypeClass_Wert() {
		return (EAttribute)bf_Nr_ZN_A_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDurchfahrdruck_TypeClass() {
		return durchfahrdruck_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurchfahrdruck_TypeClass_Wert() {
		return (EAttribute)durchfahrdruck_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinfahrdruck_Gegengleis_TypeClass() {
		return einfahrdruck_Gegengleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinfahrdruck_Gegengleis_TypeClass_Wert() {
		return (EAttribute)einfahrdruck_Gegengleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinfahrdruck_TypeClass() {
		return einfahrdruck_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinfahrdruck_TypeClass_Wert() {
		return (EAttribute)einfahrdruck_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinwahlstelle_TypeClass() {
		return einwahlstelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinwahlstelle_TypeClass_Wert() {
		return (EAttribute)einwahlstelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunktionalitaet_Anzeigefeld_TypeClass() {
		return funktionalitaet_Anzeigefeld_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunktionalitaet_Anzeigefeld_TypeClass_Wert() {
		return (EAttribute)funktionalitaet_Anzeigefeld_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHOA_TypeClass() {
		return hoA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHOA_TypeClass_Wert() {
		return (EAttribute)hoA_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adresse_TypeClass() {
		return iP_Adresse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adresse_TypeClass_Wert() {
		return (EAttribute)iP_Adresse_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKoppelunterstation_TypeClass() {
		return koppelunterstation_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKoppelunterstation_TypeClass_Wert() {
		return (EAttribute)koppelunterstation_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKUs_Zeittelegramm_TypeClass() {
		return kUs_Zeittelegramm_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKUs_Zeittelegramm_TypeClass_Wert() {
		return (EAttribute)kUs_Zeittelegramm_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeldedruck_TypeClass() {
		return meldedruck_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeldedruck_TypeClass_Wert() {
		return (EAttribute)meldedruck_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrioritaet_TypeClass() {
		return prioritaet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrioritaet_TypeClass_Wert() {
		return (EAttribute)prioritaet_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReaktivierungsfunktion_TypeClass() {
		return reaktivierungsfunktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReaktivierungsfunktion_TypeClass_Wert() {
		return (EAttribute)reaktivierungsfunktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSichtbarkeit_Anzeigefeld_TypeClass() {
		return sichtbarkeit_Anzeigefeld_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSichtbarkeit_Anzeigefeld_TypeClass_Wert() {
		return (EAttribute)sichtbarkeit_Anzeigefeld_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_02_TypeClass() {
		return telegramm_02_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_02_TypeClass_Wert() {
		return (EAttribute)telegramm_02_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_03_TypeClass() {
		return telegramm_03_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_03_TypeClass_Wert() {
		return (EAttribute)telegramm_03_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_04_TypeClass() {
		return telegramm_04_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_04_TypeClass_Wert() {
		return (EAttribute)telegramm_04_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_10_TypeClass() {
		return telegramm_10_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_10_TypeClass_Wert() {
		return (EAttribute)telegramm_10_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_21_TypeClass() {
		return telegramm_21_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_21_TypeClass_Wert() {
		return (EAttribute)telegramm_21_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_30_TypeClass() {
		return telegramm_30_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_30_TypeClass_Wert() {
		return (EAttribute)telegramm_30_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_84_Alle_Fstr_AttributeGroup() {
		return telegramm_84_Alle_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_84_Alle_Fstr_AttributeGroup_IDZLVBus() {
		return (EReference)telegramm_84_Alle_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_84_Alle_Fstr_AttributeGroup_Telegramm84FuerAlleFstr() {
		return (EReference)telegramm_84_Alle_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_84_Einzelne_Fstr_AttributeGroup() {
		return telegramm_84_Einzelne_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier() {
		return (EReference)telegramm_84_Einzelne_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDZLVBus() {
		return (EReference)telegramm_84_Einzelne_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_84_Fuer_Alle_Fstr_TypeClass() {
		return telegramm_84_Fuer_Alle_Fstr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_84_Fuer_Alle_Fstr_TypeClass_Wert() {
		return (EAttribute)telegramm_84_Fuer_Alle_Fstr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_84_Verzicht_TypeClass() {
		return telegramm_84_Verzicht_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_84_Verzicht_TypeClass_Wert() {
		return (EAttribute)telegramm_84_Verzicht_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_85_Alle_Fstr_AttributeGroup() {
		return telegramm_85_Alle_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_85_Alle_Fstr_AttributeGroup_IDZLVBus() {
		return (EReference)telegramm_85_Alle_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_85_Alle_Fstr_AttributeGroup_Telegramm85FuerAlleFstr() {
		return (EReference)telegramm_85_Alle_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_85_Einzelne_Fstr_AttributeGroup() {
		return telegramm_85_Einzelne_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier() {
		return (EReference)telegramm_85_Einzelne_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDZLVBus() {
		return (EReference)telegramm_85_Einzelne_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegramm_85_Fuer_Alle_Fstr_TypeClass() {
		return telegramm_85_Fuer_Alle_Fstr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegramm_85_Fuer_Alle_Fstr_TypeClass_Wert() {
		return (EAttribute)telegramm_85_Fuer_Alle_Fstr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegrammwiederholung_TypeClass() {
		return telegrammwiederholung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegrammwiederholung_TypeClass_Wert() {
		return (EAttribute)telegrammwiederholung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterstation_Max_TypeClass() {
		return unterstation_Max_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterstation_Max_TypeClass_Wert() {
		return (EAttribute)unterstation_Max_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterstation_Nr_TypeClass() {
		return unterstation_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterstation_Nr_TypeClass_Wert() {
		return (EAttribute)unterstation_Nr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerzoegerung_Manuell_Loeschung_TypeClass() {
		return verzoegerung_Manuell_Loeschung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerzoegerung_Manuell_Loeschung_TypeClass_Wert() {
		return (EAttribute)verzoegerung_Manuell_Loeschung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVormeldestart_TypeClass() {
		return vormeldestart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVormeldestart_TypeClass_Wert() {
		return (EAttribute)vormeldestart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_Adresse_TypeClass() {
		return zbS_Adresse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_Adresse_TypeClass_Wert() {
		return (EAttribute)zbS_Adresse_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_Anbindung_TypeClass() {
		return zbS_Anbindung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_Anbindung_TypeClass_Wert() {
		return (EAttribute)zbS_Anbindung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_Schnittstelle_TypeClass() {
		return zbS_Schnittstelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_Schnittstelle_TypeClass_Wert() {
		return (EAttribute)zbS_Schnittstelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeitsynchronisation_Funkuhr_TypeClass() {
		return zeitsynchronisation_Funkuhr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitsynchronisation_Funkuhr_TypeClass_Wert() {
		return (EAttribute)zeitsynchronisation_Funkuhr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus() {
		return zlV_BusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Bezeichnung() {
		return (EReference)zlV_BusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_ZLVBusAllg() {
		return (EReference)zlV_BusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Allg_AttributeGroup() {
		return zlV_Bus_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Allg_AttributeGroup_UnterstationMax() {
		return (EReference)zlV_Bus_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Allg_AttributeGroup_ZNModem() {
		return (EReference)zlV_Bus_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Besondere_Anlage() {
		return zlV_Bus_Besondere_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Besondere_Anlage_Bezeichnung() {
		return (EReference)zlV_Bus_Besondere_AnlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Besondere_Anlage_IDZLVBus() {
		return (EReference)zlV_Bus_Besondere_AnlageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup() {
		return zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup_BezeichnungBesondereAnlage() {
		return (EReference)zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Bezeichnung_AttributeGroup() {
		return zlV_Bus_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr() {
		return (EReference)zlV_Bus_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Nr_TypeClass() {
		return zlV_Bus_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZLV_Bus_Nr_TypeClass_Wert() {
		return (EAttribute)zlV_Bus_Nr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_US_Zuordnung() {
		return zlV_Bus_US_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_IDZLVBus() {
		return (EReference)zlV_Bus_US_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_IDZNUnterstation() {
		return (EReference)zlV_Bus_US_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_ZLVBusUSZuordnungTelegramm() {
		return (EReference)zlV_Bus_US_ZuordnungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_ZLVBusZuordnungAllg() {
		return (EReference)zlV_Bus_US_ZuordnungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup() {
		return zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm02() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm03() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm04() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm10() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm21() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm30() {
		return (EReference)zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLV_Bus_Zuordnung_Allg_AttributeGroup() {
		return zlV_Bus_Zuordnung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Zuordnung_Allg_AttributeGroup_Anschlussnummer() {
		return (EReference)zlV_Bus_Zuordnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr() {
		return (EReference)zlV_Bus_Zuordnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN() {
		return znEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDAnhangZNPlanBedienraum() {
		return (EReference)znEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDAnhangZNPlanRechnerraum() {
		return (EReference)znEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDOertlichkeit() {
		return (EReference)znEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDStellwerk() {
		return (EReference)znEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDUnterbringung() {
		return (EReference)znEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_IDZNUnterstation() {
		return (EReference)znEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_ZNAllg() {
		return (EReference)znEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_A_Bedienbezeichner_Frei_TypeClass() {
		return zN_A_Bedienbezeichner_Frei_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_A_Bedienbezeichner_Frei_TypeClass_Wert() {
		return (EAttribute)zN_A_Bedienbezeichner_Frei_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_A_Bezeichner_TypeClass() {
		return zN_A_Bezeichner_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_A_Bezeichner_TypeClass_Wert() {
		return (EAttribute)zN_A_Bezeichner_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Akustik() {
		return zN_AkustikEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_ZNAkustikAnzeigefeld() {
		return (EReference)zN_AkustikEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_IDZN() {
		return (EReference)zN_AkustikEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_IDZNAnzeigefeld() {
		return (EReference)zN_AkustikEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Akustik_Anzeigefeld_AttributeGroup() {
		return zN_Akustik_Anzeigefeld_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerAnbAnn() {
		return (EReference)zN_Akustik_Anzeigefeld_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerSonst() {
		return (EReference)zN_Akustik_Anzeigefeld_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerVoranz() {
		return (EReference)zN_Akustik_Anzeigefeld_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Allg_AttributeGroup() {
		return zN_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Allg_AttributeGroup_Einwahlstelle() {
		return (EReference)zN_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Allg_AttributeGroup_Reaktivierungsfunktion() {
		return (EReference)zN_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Allg_AttributeGroup_ZNAnlagentyp() {
		return (EReference)zN_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Anlagentyp_TypeClass() {
		return zN_Anlagentyp_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Anlagentyp_TypeClass_Wert() {
		return (EAttribute)zN_Anlagentyp_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Anzeigefeld() {
		return zN_AnzeigefeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_IDGleisAbschnitt() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_IDZLVBus() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_IDZN() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_IDZNAnzeigefeld() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_ZNAnzeigefeldAllg() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_ZNAnzeigefeldBezeichnung() {
		return (EReference)zN_AnzeigefeldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Anzeigefeld_Allg_AttributeGroup() {
		return zN_Anzeigefeld_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_BfNrANB() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_BfNrZNA() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_FunktionalitaetAnzeigefeld() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_HOA() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_Vormeldestart() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_ZNAnzeigefeldLoeschkriterium() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung() {
		return (EReference)zN_Anzeigefeld_Allg_AttributeGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Anzeigefeld_Bezeichnung_AttributeGroup() {
		return zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei() {
		return (EReference)zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABezeichner() {
		return (EReference)zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Anzeigefeld_Loeschkriterium_TypeClass() {
		return zN_Anzeigefeld_Loeschkriterium_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Anzeigefeld_Loeschkriterium_TypeClass_Wert() {
		return (EAttribute)zN_Anzeigefeld_Loeschkriterium_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Feld_Ohne_Anzeige_TypeClass() {
		return zN_Feld_Ohne_Anzeige_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Feld_Ohne_Anzeige_TypeClass_Wert() {
		return (EAttribute)zN_Feld_Ohne_Anzeige_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Fortschalt_Krit_Druck_AttributeGroup() {
		return zN_Fortschalt_Krit_Druck_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_Ausfahrdruck() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_AusfahrdruckGegengleis() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_Durchfahrdruck() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_Einfahrdruck() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_EinfahrdruckGegengleis() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Druck_AttributeGroup_Meldedruck() {
		return (EReference)zN_Fortschalt_Krit_Druck_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Fortschalt_Krit_Schalt_AttributeGroup() {
		return zN_Fortschalt_Krit_Schalt_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Schalt_AttributeGroup_BesonderesSchaltkriterium() {
		return (EReference)zN_Fortschalt_Krit_Schalt_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Schalt_AttributeGroup_IDFortschaltungStart() {
		return (EReference)zN_Fortschalt_Krit_Schalt_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung() {
		return (EReference)zN_Fortschalt_Krit_Schalt_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Krit_Schalt_AttributeGroup_ZNSchaltkriterium() {
		return (EReference)zN_Fortschalt_Krit_Schalt_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Fortschalt_Kriterium() {
		return zN_Fortschalt_KriteriumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Kriterium_IDZN() {
		return (EReference)zN_Fortschalt_KriteriumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Kriterium_IDZNFortschaltKritStart() {
		return (EReference)zN_Fortschalt_KriteriumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Kriterium_IDZNFortschaltKritZiel() {
		return (EReference)zN_Fortschalt_KriteriumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Kriterium_ZNFortschaltKritDruck() {
		return (EReference)zN_Fortschalt_KriteriumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Fortschalt_Kriterium_ZNFortschaltKritSchalt() {
		return (EReference)zN_Fortschalt_KriteriumEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Modem_TypeClass() {
		return zN_Modem_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Modem_TypeClass_Wert() {
		return (EAttribute)zN_Modem_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Schaltkriterium_TypeClass() {
		return zN_Schaltkriterium_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Schaltkriterium_TypeClass_Wert() {
		return (EAttribute)zN_Schaltkriterium_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Telegramm_84_Zuordnung() {
		return zN_Telegramm_84_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_84_Zuordnung_IDZN() {
		return (EReference)zN_Telegramm_84_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_84_Zuordnung_Telegramm84AlleFstr() {
		return (EReference)zN_Telegramm_84_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_84_Zuordnung_Telegramm84EinzelneFstr() {
		return (EReference)zN_Telegramm_84_ZuordnungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_84_Zuordnung_Telegramm84Verzicht() {
		return (EReference)zN_Telegramm_84_ZuordnungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Telegramm_85_Zuordnung() {
		return zN_Telegramm_85_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_85_Zuordnung_IDZN() {
		return (EReference)zN_Telegramm_85_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_85_Zuordnung_Telegramm85AlleFstr() {
		return (EReference)zN_Telegramm_85_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Telegramm_85_Zuordnung_Telegramm85EinzelneFstr() {
		return (EReference)zN_Telegramm_85_ZuordnungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Unterstation() {
		return zN_UnterstationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_IDZNZBS() {
		return (EReference)zN_UnterstationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_ZNUnterstationAllg() {
		return (EReference)zN_UnterstationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Unterstation_Allg_AttributeGroup() {
		return zN_Unterstation_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_BfKennung() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_Koppelunterstation() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_KUsZeittelegramm() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_ZBSAnbindung() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Allg_AttributeGroup_ZNUnterstationBfNr() {
		return (EReference)zN_Unterstation_Allg_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Unterstation_Bf_Nr_AttributeGroup() {
		return zN_Unterstation_Bf_Nr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr() {
		return (EReference)zN_Unterstation_Bf_Nr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Bf_Nr_AttributeGroup_IDOertlichkeit() {
		return (EReference)zN_Unterstation_Bf_Nr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_Unterstation_Bf_Nr_AttributeGroup_Prioritaet() {
		return (EReference)zN_Unterstation_Bf_Nr_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_ZBS() {
		return zN_ZBSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_ZBS_IDESTWZentraleinheit() {
		return (EReference)zN_ZBSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_ZBS_IPAdresse() {
		return (EReference)zN_ZBSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZN_ZBS_ZBSSchnittstelle() {
		return (EReference)zN_ZBSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugvorbereitungsmeldung_TypeClass() {
		return zugvorbereitungsmeldung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZugvorbereitungsmeldung_TypeClass_Wert() {
		return (EAttribute)zugvorbereitungsmeldung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAkustikAnbAnn() {
		return enumAkustikAnbAnnEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAkustikSonst() {
		return enumAkustikSonstEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBfKennung() {
		return enumBfKennungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFunktionalitaetAnzeigefeld() {
		return enumFunktionalitaetAnzeigefeldEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZBSSchnittstelle() {
		return enumzbsSchnittstelleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZNAnlagentyp() {
		return enumznAnlagentypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZNAnzeigefeldLoeschkriterium() {
		return enumznAnzeigefeldLoeschkriteriumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZNModem() {
		return enumznModemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZNSchaltkriterium() {
		return enumznSchaltkriteriumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnschlussnummer_Type() {
		return anschlussnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBesonderes_Schaltkriterium_Type() {
		return besonderes_Schaltkriterium_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Besondere_Anlage_Type() {
		return bezeichnung_Besondere_Anlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBf_Nr_Type() {
		return bf_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAkustikAnbAnnObject() {
		return enumAkustikAnbAnnObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAkustikSonstObject() {
		return enumAkustikSonstObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBfKennungObject() {
		return enumBfKennungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFunktionalitaetAnzeigefeldObject() {
		return enumFunktionalitaetAnzeigefeldObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZBSSchnittstelleObject() {
		return enumzbsSchnittstelleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZNAnlagentypObject() {
		return enumznAnlagentypObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZNAnzeigefeldLoeschkriteriumObject() {
		return enumznAnzeigefeldLoeschkriteriumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZNModemObject() {
		return enumznModemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZNSchaltkriteriumObject() {
		return enumznSchaltkriteriumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adresse_Type() {
		return iP_Adresse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrioritaet_Type() {
		return prioritaet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnterstation_Max_Type() {
		return unterstation_Max_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnterstation_Nr_Type() {
		return unterstation_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerzoegerung_Manuell_Loeschung_Type() {
		return verzoegerung_Manuell_Loeschung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZBS_Adresse_Type() {
		return zbS_Adresse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZLV_Bus_Nr_Type() {
		return zlV_Bus_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZN_A_Bedienbezeichner_Frei_Type() {
		return zN_A_Bedienbezeichner_Frei_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZN_A_Bezeichner_Type() {
		return zN_A_Bezeichner_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZugnummernmeldeanlageFactory getZugnummernmeldeanlageFactory() {
		return (ZugnummernmeldeanlageFactory)getEFactoryInstance();
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
		akustikdauer_Anb_Ann_TypeClassEClass = createEClass(AKUSTIKDAUER_ANB_ANN_TYPE_CLASS);
		createEAttribute(akustikdauer_Anb_Ann_TypeClassEClass, AKUSTIKDAUER_ANB_ANN_TYPE_CLASS__WERT);

		akustikdauer_Sonst_TypeClassEClass = createEClass(AKUSTIKDAUER_SONST_TYPE_CLASS);
		createEAttribute(akustikdauer_Sonst_TypeClassEClass, AKUSTIKDAUER_SONST_TYPE_CLASS__WERT);

		akustikdauer_Voranz_TypeClassEClass = createEClass(AKUSTIKDAUER_VORANZ_TYPE_CLASS);
		createEAttribute(akustikdauer_Voranz_TypeClassEClass, AKUSTIKDAUER_VORANZ_TYPE_CLASS__WERT);

		anschlussnummer_TypeClassEClass = createEClass(ANSCHLUSSNUMMER_TYPE_CLASS);
		createEAttribute(anschlussnummer_TypeClassEClass, ANSCHLUSSNUMMER_TYPE_CLASS__WERT);

		ausfahrdruck_Gegengleis_TypeClassEClass = createEClass(AUSFAHRDRUCK_GEGENGLEIS_TYPE_CLASS);
		createEAttribute(ausfahrdruck_Gegengleis_TypeClassEClass, AUSFAHRDRUCK_GEGENGLEIS_TYPE_CLASS__WERT);

		ausfahrdruck_TypeClassEClass = createEClass(AUSFAHRDRUCK_TYPE_CLASS);
		createEAttribute(ausfahrdruck_TypeClassEClass, AUSFAHRDRUCK_TYPE_CLASS__WERT);

		bedienbarkeit_Anzeigefeld_TypeClassEClass = createEClass(BEDIENBARKEIT_ANZEIGEFELD_TYPE_CLASS);
		createEAttribute(bedienbarkeit_Anzeigefeld_TypeClassEClass, BEDIENBARKEIT_ANZEIGEFELD_TYPE_CLASS__WERT);

		besonderes_Schaltkriterium_TypeClassEClass = createEClass(BESONDERES_SCHALTKRITERIUM_TYPE_CLASS);
		createEAttribute(besonderes_Schaltkriterium_TypeClassEClass, BESONDERES_SCHALTKRITERIUM_TYPE_CLASS__WERT);

		bezeichnung_Besondere_Anlage_TypeClassEClass = createEClass(BEZEICHNUNG_BESONDERE_ANLAGE_TYPE_CLASS);
		createEAttribute(bezeichnung_Besondere_Anlage_TypeClassEClass, BEZEICHNUNG_BESONDERE_ANLAGE_TYPE_CLASS__WERT);

		bf_Kennung_TypeClassEClass = createEClass(BF_KENNUNG_TYPE_CLASS);
		createEAttribute(bf_Kennung_TypeClassEClass, BF_KENNUNG_TYPE_CLASS__WERT);

		bf_Nr_ANB_TypeClassEClass = createEClass(BF_NR_ANB_TYPE_CLASS);
		createEAttribute(bf_Nr_ANB_TypeClassEClass, BF_NR_ANB_TYPE_CLASS__WERT);

		bf_Nr_TypeClassEClass = createEClass(BF_NR_TYPE_CLASS);
		createEAttribute(bf_Nr_TypeClassEClass, BF_NR_TYPE_CLASS__WERT);

		bf_Nr_ZN_A_TypeClassEClass = createEClass(BF_NR_ZN_ATYPE_CLASS);
		createEAttribute(bf_Nr_ZN_A_TypeClassEClass, BF_NR_ZN_ATYPE_CLASS__WERT);

		durchfahrdruck_TypeClassEClass = createEClass(DURCHFAHRDRUCK_TYPE_CLASS);
		createEAttribute(durchfahrdruck_TypeClassEClass, DURCHFAHRDRUCK_TYPE_CLASS__WERT);

		einfahrdruck_Gegengleis_TypeClassEClass = createEClass(EINFAHRDRUCK_GEGENGLEIS_TYPE_CLASS);
		createEAttribute(einfahrdruck_Gegengleis_TypeClassEClass, EINFAHRDRUCK_GEGENGLEIS_TYPE_CLASS__WERT);

		einfahrdruck_TypeClassEClass = createEClass(EINFAHRDRUCK_TYPE_CLASS);
		createEAttribute(einfahrdruck_TypeClassEClass, EINFAHRDRUCK_TYPE_CLASS__WERT);

		einwahlstelle_TypeClassEClass = createEClass(EINWAHLSTELLE_TYPE_CLASS);
		createEAttribute(einwahlstelle_TypeClassEClass, EINWAHLSTELLE_TYPE_CLASS__WERT);

		funktionalitaet_Anzeigefeld_TypeClassEClass = createEClass(FUNKTIONALITAET_ANZEIGEFELD_TYPE_CLASS);
		createEAttribute(funktionalitaet_Anzeigefeld_TypeClassEClass, FUNKTIONALITAET_ANZEIGEFELD_TYPE_CLASS__WERT);

		hoA_TypeClassEClass = createEClass(HOA_TYPE_CLASS);
		createEAttribute(hoA_TypeClassEClass, HOA_TYPE_CLASS__WERT);

		iP_Adresse_TypeClassEClass = createEClass(IP_ADRESSE_TYPE_CLASS);
		createEAttribute(iP_Adresse_TypeClassEClass, IP_ADRESSE_TYPE_CLASS__WERT);

		koppelunterstation_TypeClassEClass = createEClass(KOPPELUNTERSTATION_TYPE_CLASS);
		createEAttribute(koppelunterstation_TypeClassEClass, KOPPELUNTERSTATION_TYPE_CLASS__WERT);

		kUs_Zeittelegramm_TypeClassEClass = createEClass(KUS_ZEITTELEGRAMM_TYPE_CLASS);
		createEAttribute(kUs_Zeittelegramm_TypeClassEClass, KUS_ZEITTELEGRAMM_TYPE_CLASS__WERT);

		meldedruck_TypeClassEClass = createEClass(MELDEDRUCK_TYPE_CLASS);
		createEAttribute(meldedruck_TypeClassEClass, MELDEDRUCK_TYPE_CLASS__WERT);

		prioritaet_TypeClassEClass = createEClass(PRIORITAET_TYPE_CLASS);
		createEAttribute(prioritaet_TypeClassEClass, PRIORITAET_TYPE_CLASS__WERT);

		reaktivierungsfunktion_TypeClassEClass = createEClass(REAKTIVIERUNGSFUNKTION_TYPE_CLASS);
		createEAttribute(reaktivierungsfunktion_TypeClassEClass, REAKTIVIERUNGSFUNKTION_TYPE_CLASS__WERT);

		sichtbarkeit_Anzeigefeld_TypeClassEClass = createEClass(SICHTBARKEIT_ANZEIGEFELD_TYPE_CLASS);
		createEAttribute(sichtbarkeit_Anzeigefeld_TypeClassEClass, SICHTBARKEIT_ANZEIGEFELD_TYPE_CLASS__WERT);

		telegramm_02_TypeClassEClass = createEClass(TELEGRAMM_02_TYPE_CLASS);
		createEAttribute(telegramm_02_TypeClassEClass, TELEGRAMM_02_TYPE_CLASS__WERT);

		telegramm_03_TypeClassEClass = createEClass(TELEGRAMM_03_TYPE_CLASS);
		createEAttribute(telegramm_03_TypeClassEClass, TELEGRAMM_03_TYPE_CLASS__WERT);

		telegramm_04_TypeClassEClass = createEClass(TELEGRAMM_04_TYPE_CLASS);
		createEAttribute(telegramm_04_TypeClassEClass, TELEGRAMM_04_TYPE_CLASS__WERT);

		telegramm_10_TypeClassEClass = createEClass(TELEGRAMM_10_TYPE_CLASS);
		createEAttribute(telegramm_10_TypeClassEClass, TELEGRAMM_10_TYPE_CLASS__WERT);

		telegramm_21_TypeClassEClass = createEClass(TELEGRAMM_21_TYPE_CLASS);
		createEAttribute(telegramm_21_TypeClassEClass, TELEGRAMM_21_TYPE_CLASS__WERT);

		telegramm_30_TypeClassEClass = createEClass(TELEGRAMM_30_TYPE_CLASS);
		createEAttribute(telegramm_30_TypeClassEClass, TELEGRAMM_30_TYPE_CLASS__WERT);

		telegramm_84_Alle_Fstr_AttributeGroupEClass = createEClass(TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP);
		createEReference(telegramm_84_Alle_Fstr_AttributeGroupEClass, TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS);
		createEReference(telegramm_84_Alle_Fstr_AttributeGroupEClass, TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR);

		telegramm_84_Einzelne_Fstr_AttributeGroupEClass = createEClass(TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP);
		createEReference(telegramm_84_Einzelne_Fstr_AttributeGroupEClass, TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER);
		createEReference(telegramm_84_Einzelne_Fstr_AttributeGroupEClass, TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS);

		telegramm_84_Fuer_Alle_Fstr_TypeClassEClass = createEClass(TELEGRAMM_84_FUER_ALLE_FSTR_TYPE_CLASS);
		createEAttribute(telegramm_84_Fuer_Alle_Fstr_TypeClassEClass, TELEGRAMM_84_FUER_ALLE_FSTR_TYPE_CLASS__WERT);

		telegramm_84_Verzicht_TypeClassEClass = createEClass(TELEGRAMM_84_VERZICHT_TYPE_CLASS);
		createEAttribute(telegramm_84_Verzicht_TypeClassEClass, TELEGRAMM_84_VERZICHT_TYPE_CLASS__WERT);

		telegramm_85_Alle_Fstr_AttributeGroupEClass = createEClass(TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP);
		createEReference(telegramm_85_Alle_Fstr_AttributeGroupEClass, TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS);
		createEReference(telegramm_85_Alle_Fstr_AttributeGroupEClass, TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR);

		telegramm_85_Einzelne_Fstr_AttributeGroupEClass = createEClass(TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP);
		createEReference(telegramm_85_Einzelne_Fstr_AttributeGroupEClass, TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER);
		createEReference(telegramm_85_Einzelne_Fstr_AttributeGroupEClass, TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS);

		telegramm_85_Fuer_Alle_Fstr_TypeClassEClass = createEClass(TELEGRAMM_85_FUER_ALLE_FSTR_TYPE_CLASS);
		createEAttribute(telegramm_85_Fuer_Alle_Fstr_TypeClassEClass, TELEGRAMM_85_FUER_ALLE_FSTR_TYPE_CLASS__WERT);

		telegrammwiederholung_TypeClassEClass = createEClass(TELEGRAMMWIEDERHOLUNG_TYPE_CLASS);
		createEAttribute(telegrammwiederholung_TypeClassEClass, TELEGRAMMWIEDERHOLUNG_TYPE_CLASS__WERT);

		unterstation_Max_TypeClassEClass = createEClass(UNTERSTATION_MAX_TYPE_CLASS);
		createEAttribute(unterstation_Max_TypeClassEClass, UNTERSTATION_MAX_TYPE_CLASS__WERT);

		unterstation_Nr_TypeClassEClass = createEClass(UNTERSTATION_NR_TYPE_CLASS);
		createEAttribute(unterstation_Nr_TypeClassEClass, UNTERSTATION_NR_TYPE_CLASS__WERT);

		verzoegerung_Manuell_Loeschung_TypeClassEClass = createEClass(VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE_CLASS);
		createEAttribute(verzoegerung_Manuell_Loeschung_TypeClassEClass, VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE_CLASS__WERT);

		vormeldestart_TypeClassEClass = createEClass(VORMELDESTART_TYPE_CLASS);
		createEAttribute(vormeldestart_TypeClassEClass, VORMELDESTART_TYPE_CLASS__WERT);

		zbS_Adresse_TypeClassEClass = createEClass(ZBS_ADRESSE_TYPE_CLASS);
		createEAttribute(zbS_Adresse_TypeClassEClass, ZBS_ADRESSE_TYPE_CLASS__WERT);

		zbS_Anbindung_TypeClassEClass = createEClass(ZBS_ANBINDUNG_TYPE_CLASS);
		createEAttribute(zbS_Anbindung_TypeClassEClass, ZBS_ANBINDUNG_TYPE_CLASS__WERT);

		zbS_Schnittstelle_TypeClassEClass = createEClass(ZBS_SCHNITTSTELLE_TYPE_CLASS);
		createEAttribute(zbS_Schnittstelle_TypeClassEClass, ZBS_SCHNITTSTELLE_TYPE_CLASS__WERT);

		zeitsynchronisation_Funkuhr_TypeClassEClass = createEClass(ZEITSYNCHRONISATION_FUNKUHR_TYPE_CLASS);
		createEAttribute(zeitsynchronisation_Funkuhr_TypeClassEClass, ZEITSYNCHRONISATION_FUNKUHR_TYPE_CLASS__WERT);

		zlV_BusEClass = createEClass(ZLV_BUS);
		createEReference(zlV_BusEClass, ZLV_BUS__BEZEICHNUNG);
		createEReference(zlV_BusEClass, ZLV_BUS__ZLV_BUS_ALLG);

		zlV_Bus_Allg_AttributeGroupEClass = createEClass(ZLV_BUS_ALLG_ATTRIBUTE_GROUP);
		createEReference(zlV_Bus_Allg_AttributeGroupEClass, ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX);
		createEReference(zlV_Bus_Allg_AttributeGroupEClass, ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM);

		zlV_Bus_Besondere_AnlageEClass = createEClass(ZLV_BUS_BESONDERE_ANLAGE);
		createEReference(zlV_Bus_Besondere_AnlageEClass, ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG);
		createEReference(zlV_Bus_Besondere_AnlageEClass, ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS);

		zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass = createEClass(ZLV_BUS_BESONDERE_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass, ZLV_BUS_BESONDERE_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BESONDERE_ANLAGE);

		zlV_Bus_Bezeichnung_AttributeGroupEClass = createEClass(ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(zlV_Bus_Bezeichnung_AttributeGroupEClass, ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR);

		zlV_Bus_Nr_TypeClassEClass = createEClass(ZLV_BUS_NR_TYPE_CLASS);
		createEAttribute(zlV_Bus_Nr_TypeClassEClass, ZLV_BUS_NR_TYPE_CLASS__WERT);

		zlV_Bus_US_ZuordnungEClass = createEClass(ZLV_BUS_US_ZUORDNUNG);
		createEReference(zlV_Bus_US_ZuordnungEClass, ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS);
		createEReference(zlV_Bus_US_ZuordnungEClass, ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION);
		createEReference(zlV_Bus_US_ZuordnungEClass, ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM);
		createEReference(zlV_Bus_US_ZuordnungEClass, ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG);

		zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass = createEClass(ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21);
		createEReference(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30);

		zlV_Bus_Zuordnung_Allg_AttributeGroupEClass = createEClass(ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(zlV_Bus_Zuordnung_Allg_AttributeGroupEClass, ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER);
		createEReference(zlV_Bus_Zuordnung_Allg_AttributeGroupEClass, ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR);

		znEClass = createEClass(ZN);
		createEReference(znEClass, ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM);
		createEReference(znEClass, ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM);
		createEReference(znEClass, ZN__ID_OERTLICHKEIT);
		createEReference(znEClass, ZN__ID_STELLWERK);
		createEReference(znEClass, ZN__ID_UNTERBRINGUNG);
		createEReference(znEClass, ZN__IDZN_UNTERSTATION);
		createEReference(znEClass, ZN__ZN_ALLG);

		zN_A_Bedienbezeichner_Frei_TypeClassEClass = createEClass(ZN_ABEDIENBEZEICHNER_FREI_TYPE_CLASS);
		createEAttribute(zN_A_Bedienbezeichner_Frei_TypeClassEClass, ZN_ABEDIENBEZEICHNER_FREI_TYPE_CLASS__WERT);

		zN_A_Bezeichner_TypeClassEClass = createEClass(ZN_ABEZEICHNER_TYPE_CLASS);
		createEAttribute(zN_A_Bezeichner_TypeClassEClass, ZN_ABEZEICHNER_TYPE_CLASS__WERT);

		zN_AkustikEClass = createEClass(ZN_AKUSTIK);
		createEReference(zN_AkustikEClass, ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD);
		createEReference(zN_AkustikEClass, ZN_AKUSTIK__IDZN);
		createEReference(zN_AkustikEClass, ZN_AKUSTIK__IDZN_ANZEIGEFELD);

		zN_Akustik_Anzeigefeld_AttributeGroupEClass = createEClass(ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP);
		createEReference(zN_Akustik_Anzeigefeld_AttributeGroupEClass, ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN);
		createEReference(zN_Akustik_Anzeigefeld_AttributeGroupEClass, ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST);
		createEReference(zN_Akustik_Anzeigefeld_AttributeGroupEClass, ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ);

		zN_Allg_AttributeGroupEClass = createEClass(ZN_ALLG_ATTRIBUTE_GROUP);
		createEReference(zN_Allg_AttributeGroupEClass, ZN_ALLG_ATTRIBUTE_GROUP__EINWAHLSTELLE);
		createEReference(zN_Allg_AttributeGroupEClass, ZN_ALLG_ATTRIBUTE_GROUP__REAKTIVIERUNGSFUNKTION);
		createEReference(zN_Allg_AttributeGroupEClass, ZN_ALLG_ATTRIBUTE_GROUP__ZN_ANLAGENTYP);

		zN_Anlagentyp_TypeClassEClass = createEClass(ZN_ANLAGENTYP_TYPE_CLASS);
		createEAttribute(zN_Anlagentyp_TypeClassEClass, ZN_ANLAGENTYP_TYPE_CLASS__WERT);

		zN_AnzeigefeldEClass = createEClass(ZN_ANZEIGEFELD);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__IDZLV_BUS);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__IDZN);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG);
		createEReference(zN_AnzeigefeldEClass, ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG);

		zN_Anzeigefeld_Allg_AttributeGroupEClass = createEClass(ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE);
		createEReference(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG);

		zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass = createEClass(ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass, ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI);
		createEReference(zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass, ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER);

		zN_Anzeigefeld_Loeschkriterium_TypeClassEClass = createEClass(ZN_ANZEIGEFELD_LOESCHKRITERIUM_TYPE_CLASS);
		createEAttribute(zN_Anzeigefeld_Loeschkriterium_TypeClassEClass, ZN_ANZEIGEFELD_LOESCHKRITERIUM_TYPE_CLASS__WERT);

		zN_Feld_Ohne_Anzeige_TypeClassEClass = createEClass(ZN_FELD_OHNE_ANZEIGE_TYPE_CLASS);
		createEAttribute(zN_Feld_Ohne_Anzeige_TypeClassEClass, ZN_FELD_OHNE_ANZEIGE_TYPE_CLASS__WERT);

		zN_Fortschalt_Krit_Druck_AttributeGroupEClass = createEClass(ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS);
		createEReference(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK);

		zN_Fortschalt_Krit_Schalt_AttributeGroupEClass = createEClass(ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP);
		createEReference(zN_Fortschalt_Krit_Schalt_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM);
		createEReference(zN_Fortschalt_Krit_Schalt_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START);
		createEReference(zN_Fortschalt_Krit_Schalt_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG);
		createEReference(zN_Fortschalt_Krit_Schalt_AttributeGroupEClass, ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM);

		zN_Fortschalt_KriteriumEClass = createEClass(ZN_FORTSCHALT_KRITERIUM);
		createEReference(zN_Fortschalt_KriteriumEClass, ZN_FORTSCHALT_KRITERIUM__IDZN);
		createEReference(zN_Fortschalt_KriteriumEClass, ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START);
		createEReference(zN_Fortschalt_KriteriumEClass, ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL);
		createEReference(zN_Fortschalt_KriteriumEClass, ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK);
		createEReference(zN_Fortschalt_KriteriumEClass, ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT);

		zN_Modem_TypeClassEClass = createEClass(ZN_MODEM_TYPE_CLASS);
		createEAttribute(zN_Modem_TypeClassEClass, ZN_MODEM_TYPE_CLASS__WERT);

		zN_Schaltkriterium_TypeClassEClass = createEClass(ZN_SCHALTKRITERIUM_TYPE_CLASS);
		createEAttribute(zN_Schaltkriterium_TypeClassEClass, ZN_SCHALTKRITERIUM_TYPE_CLASS__WERT);

		zN_Telegramm_84_ZuordnungEClass = createEClass(ZN_TELEGRAMM_84_ZUORDNUNG);
		createEReference(zN_Telegramm_84_ZuordnungEClass, ZN_TELEGRAMM_84_ZUORDNUNG__IDZN);
		createEReference(zN_Telegramm_84_ZuordnungEClass, ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR);
		createEReference(zN_Telegramm_84_ZuordnungEClass, ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR);
		createEReference(zN_Telegramm_84_ZuordnungEClass, ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT);

		zN_Telegramm_85_ZuordnungEClass = createEClass(ZN_TELEGRAMM_85_ZUORDNUNG);
		createEReference(zN_Telegramm_85_ZuordnungEClass, ZN_TELEGRAMM_85_ZUORDNUNG__IDZN);
		createEReference(zN_Telegramm_85_ZuordnungEClass, ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR);
		createEReference(zN_Telegramm_85_ZuordnungEClass, ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR);

		zN_UnterstationEClass = createEClass(ZN_UNTERSTATION);
		createEReference(zN_UnterstationEClass, ZN_UNTERSTATION__IDZNZBS);
		createEReference(zN_UnterstationEClass, ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG);

		zN_Unterstation_Allg_AttributeGroupEClass = createEClass(ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__BF_KENNUNG);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KOPPELUNTERSTATION);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__KUS_ZEITTELEGRAMM);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ADRESSE);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZBS_ANBINDUNG);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZEITSYNCHRONISATION_FUNKUHR);
		createEReference(zN_Unterstation_Allg_AttributeGroupEClass, ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP__ZN_UNTERSTATION_BF_NR);

		zN_Unterstation_Bf_Nr_AttributeGroupEClass = createEClass(ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP);
		createEReference(zN_Unterstation_Bf_Nr_AttributeGroupEClass, ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR);
		createEReference(zN_Unterstation_Bf_Nr_AttributeGroupEClass, ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT);
		createEReference(zN_Unterstation_Bf_Nr_AttributeGroupEClass, ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET);

		zN_ZBSEClass = createEClass(ZN_ZBS);
		createEReference(zN_ZBSEClass, ZN_ZBS__IDESTW_ZENTRALEINHEIT);
		createEReference(zN_ZBSEClass, ZN_ZBS__IP_ADRESSE);
		createEReference(zN_ZBSEClass, ZN_ZBS__ZBS_SCHNITTSTELLE);

		zugvorbereitungsmeldung_TypeClassEClass = createEClass(ZUGVORBEREITUNGSMELDUNG_TYPE_CLASS);
		createEAttribute(zugvorbereitungsmeldung_TypeClassEClass, ZUGVORBEREITUNGSMELDUNG_TYPE_CLASS__WERT);

		// Create enums
		enumAkustikAnbAnnEEnum = createEEnum(ENUM_AKUSTIK_ANB_ANN);
		enumAkustikSonstEEnum = createEEnum(ENUM_AKUSTIK_SONST);
		enumBfKennungEEnum = createEEnum(ENUM_BF_KENNUNG);
		enumFunktionalitaetAnzeigefeldEEnum = createEEnum(ENUM_FUNKTIONALITAET_ANZEIGEFELD);
		enumzbsSchnittstelleEEnum = createEEnum(ENUMZBS_SCHNITTSTELLE);
		enumznAnlagentypEEnum = createEEnum(ENUMZN_ANLAGENTYP);
		enumznAnzeigefeldLoeschkriteriumEEnum = createEEnum(ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM);
		enumznModemEEnum = createEEnum(ENUMZN_MODEM);
		enumznSchaltkriteriumEEnum = createEEnum(ENUMZN_SCHALTKRITERIUM);

		// Create data types
		anschlussnummer_TypeEDataType = createEDataType(ANSCHLUSSNUMMER_TYPE);
		besonderes_Schaltkriterium_TypeEDataType = createEDataType(BESONDERES_SCHALTKRITERIUM_TYPE);
		bezeichnung_Besondere_Anlage_TypeEDataType = createEDataType(BEZEICHNUNG_BESONDERE_ANLAGE_TYPE);
		bf_Nr_TypeEDataType = createEDataType(BF_NR_TYPE);
		enumAkustikAnbAnnObjectEDataType = createEDataType(ENUM_AKUSTIK_ANB_ANN_OBJECT);
		enumAkustikSonstObjectEDataType = createEDataType(ENUM_AKUSTIK_SONST_OBJECT);
		enumBfKennungObjectEDataType = createEDataType(ENUM_BF_KENNUNG_OBJECT);
		enumFunktionalitaetAnzeigefeldObjectEDataType = createEDataType(ENUM_FUNKTIONALITAET_ANZEIGEFELD_OBJECT);
		enumzbsSchnittstelleObjectEDataType = createEDataType(ENUMZBS_SCHNITTSTELLE_OBJECT);
		enumznAnlagentypObjectEDataType = createEDataType(ENUMZN_ANLAGENTYP_OBJECT);
		enumznAnzeigefeldLoeschkriteriumObjectEDataType = createEDataType(ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_OBJECT);
		enumznModemObjectEDataType = createEDataType(ENUMZN_MODEM_OBJECT);
		enumznSchaltkriteriumObjectEDataType = createEDataType(ENUMZN_SCHALTKRITERIUM_OBJECT);
		iP_Adresse_TypeEDataType = createEDataType(IP_ADRESSE_TYPE);
		prioritaet_TypeEDataType = createEDataType(PRIORITAET_TYPE);
		unterstation_Max_TypeEDataType = createEDataType(UNTERSTATION_MAX_TYPE);
		unterstation_Nr_TypeEDataType = createEDataType(UNTERSTATION_NR_TYPE);
		verzoegerung_Manuell_Loeschung_TypeEDataType = createEDataType(VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE);
		zbS_Adresse_TypeEDataType = createEDataType(ZBS_ADRESSE_TYPE);
		zlV_Bus_Nr_TypeEDataType = createEDataType(ZLV_BUS_NR_TYPE);
		zN_A_Bedienbezeichner_Frei_TypeEDataType = createEDataType(ZN_ABEDIENBEZEICHNER_FREI_TYPE);
		zN_A_Bezeichner_TypeEDataType = createEDataType(ZN_ABEZEICHNER_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		akustikdauer_Anb_Ann_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		akustikdauer_Sonst_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		akustikdauer_Voranz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anschlussnummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ausfahrdruck_Gegengleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ausfahrdruck_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bedienbarkeit_Anzeigefeld_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		besonderes_Schaltkriterium_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Besondere_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bf_Kennung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bf_Nr_ANB_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bf_Nr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bf_Nr_ZN_A_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		durchfahrdruck_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		einfahrdruck_Gegengleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		einfahrdruck_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		einwahlstelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		funktionalitaet_Anzeigefeld_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoA_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adresse_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		koppelunterstation_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kUs_Zeittelegramm_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		meldedruck_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		prioritaet_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		reaktivierungsfunktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		sichtbarkeit_Anzeigefeld_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_02_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_03_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_04_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_10_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_21_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_30_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_84_Fuer_Alle_Fstr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_84_Verzicht_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegramm_85_Fuer_Alle_Fstr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		telegrammwiederholung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		unterstation_Max_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		unterstation_Nr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		verzoegerung_Manuell_Loeschung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		vormeldestart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zbS_Adresse_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zbS_Anbindung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zbS_Schnittstelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zeitsynchronisation_Funkuhr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zlV_BusEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zlV_Bus_Besondere_AnlageEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zlV_Bus_Nr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zlV_Bus_US_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		znEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_A_Bedienbezeichner_Frei_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_A_Bezeichner_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_AkustikEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_Anlagentyp_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_AnzeigefeldEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_Anzeigefeld_Loeschkriterium_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_Feld_Ohne_Anzeige_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_Fortschalt_KriteriumEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_Modem_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_Schaltkriterium_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zN_Telegramm_84_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_Telegramm_85_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_UnterstationEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_ZBSEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zugvorbereitungsmeldung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(akustikdauer_Anb_Ann_TypeClassEClass, Akustikdauer_Anb_Ann_TypeClass.class, "Akustikdauer_Anb_Ann_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAkustikdauer_Anb_Ann_TypeClass_Wert(), this.getENUMAkustikAnbAnnObject(), "wert", null, 1, 1, Akustikdauer_Anb_Ann_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(akustikdauer_Sonst_TypeClassEClass, Akustikdauer_Sonst_TypeClass.class, "Akustikdauer_Sonst_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAkustikdauer_Sonst_TypeClass_Wert(), this.getENUMAkustikSonstObject(), "wert", null, 1, 1, Akustikdauer_Sonst_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(akustikdauer_Voranz_TypeClassEClass, Akustikdauer_Voranz_TypeClass.class, "Akustikdauer_Voranz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAkustikdauer_Voranz_TypeClass_Wert(), this.getENUMAkustikSonstObject(), "wert", null, 1, 1, Akustikdauer_Voranz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anschlussnummer_TypeClassEClass, Anschlussnummer_TypeClass.class, "Anschlussnummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnschlussnummer_TypeClass_Wert(), this.getAnschlussnummer_Type(), "wert", null, 1, 1, Anschlussnummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ausfahrdruck_Gegengleis_TypeClassEClass, Ausfahrdruck_Gegengleis_TypeClass.class, "Ausfahrdruck_Gegengleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAusfahrdruck_Gegengleis_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Ausfahrdruck_Gegengleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ausfahrdruck_TypeClassEClass, Ausfahrdruck_TypeClass.class, "Ausfahrdruck_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAusfahrdruck_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Ausfahrdruck_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedienbarkeit_Anzeigefeld_TypeClassEClass, Bedienbarkeit_Anzeigefeld_TypeClass.class, "Bedienbarkeit_Anzeigefeld_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedienbarkeit_Anzeigefeld_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Bedienbarkeit_Anzeigefeld_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(besonderes_Schaltkriterium_TypeClassEClass, Besonderes_Schaltkriterium_TypeClass.class, "Besonderes_Schaltkriterium_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBesonderes_Schaltkriterium_TypeClass_Wert(), this.getBesonderes_Schaltkriterium_Type(), "wert", null, 1, 1, Besonderes_Schaltkriterium_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Besondere_Anlage_TypeClassEClass, Bezeichnung_Besondere_Anlage_TypeClass.class, "Bezeichnung_Besondere_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Besondere_Anlage_TypeClass_Wert(), this.getBezeichnung_Besondere_Anlage_Type(), "wert", null, 1, 1, Bezeichnung_Besondere_Anlage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bf_Kennung_TypeClassEClass, Bf_Kennung_TypeClass.class, "Bf_Kennung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBf_Kennung_TypeClass_Wert(), this.getENUMBfKennungObject(), "wert", null, 1, 1, Bf_Kennung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bf_Nr_ANB_TypeClassEClass, Bf_Nr_ANB_TypeClass.class, "Bf_Nr_ANB_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBf_Nr_ANB_TypeClass_Wert(), theXMLTypePackage.getInteger(), "wert", null, 1, 1, Bf_Nr_ANB_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bf_Nr_TypeClassEClass, Bf_Nr_TypeClass.class, "Bf_Nr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBf_Nr_TypeClass_Wert(), this.getBf_Nr_Type(), "wert", null, 1, 1, Bf_Nr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bf_Nr_ZN_A_TypeClassEClass, Bf_Nr_ZN_A_TypeClass.class, "Bf_Nr_ZN_A_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBf_Nr_ZN_A_TypeClass_Wert(), theXMLTypePackage.getInteger(), "wert", null, 1, 1, Bf_Nr_ZN_A_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durchfahrdruck_TypeClassEClass, Durchfahrdruck_TypeClass.class, "Durchfahrdruck_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurchfahrdruck_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Durchfahrdruck_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einfahrdruck_Gegengleis_TypeClassEClass, Einfahrdruck_Gegengleis_TypeClass.class, "Einfahrdruck_Gegengleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinfahrdruck_Gegengleis_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Einfahrdruck_Gegengleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einfahrdruck_TypeClassEClass, Einfahrdruck_TypeClass.class, "Einfahrdruck_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinfahrdruck_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Einfahrdruck_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einwahlstelle_TypeClassEClass, Einwahlstelle_TypeClass.class, "Einwahlstelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinwahlstelle_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Einwahlstelle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funktionalitaet_Anzeigefeld_TypeClassEClass, Funktionalitaet_Anzeigefeld_TypeClass.class, "Funktionalitaet_Anzeigefeld_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunktionalitaet_Anzeigefeld_TypeClass_Wert(), this.getENUMFunktionalitaetAnzeigefeldObject(), "wert", null, 1, 1, Funktionalitaet_Anzeigefeld_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoA_TypeClassEClass, HOA_TypeClass.class, "HOA_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHOA_TypeClass_Wert(), theXMLTypePackage.getInteger(), "wert", null, 1, 1, HOA_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adresse_TypeClassEClass, IP_Adresse_TypeClass.class, "IP_Adresse_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adresse_TypeClass_Wert(), this.getIP_Adresse_Type(), "wert", null, 1, 1, IP_Adresse_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(koppelunterstation_TypeClassEClass, Koppelunterstation_TypeClass.class, "Koppelunterstation_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKoppelunterstation_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Koppelunterstation_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kUs_Zeittelegramm_TypeClassEClass, KUs_Zeittelegramm_TypeClass.class, "KUs_Zeittelegramm_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKUs_Zeittelegramm_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, KUs_Zeittelegramm_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meldedruck_TypeClassEClass, Meldedruck_TypeClass.class, "Meldedruck_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeldedruck_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Meldedruck_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritaet_TypeClassEClass, Prioritaet_TypeClass.class, "Prioritaet_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritaet_TypeClass_Wert(), this.getPrioritaet_Type(), "wert", null, 1, 1, Prioritaet_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reaktivierungsfunktion_TypeClassEClass, Reaktivierungsfunktion_TypeClass.class, "Reaktivierungsfunktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReaktivierungsfunktion_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Reaktivierungsfunktion_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sichtbarkeit_Anzeigefeld_TypeClassEClass, Sichtbarkeit_Anzeigefeld_TypeClass.class, "Sichtbarkeit_Anzeigefeld_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSichtbarkeit_Anzeigefeld_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Sichtbarkeit_Anzeigefeld_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_02_TypeClassEClass, Telegramm_02_TypeClass.class, "Telegramm_02_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_02_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_02_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_03_TypeClassEClass, Telegramm_03_TypeClass.class, "Telegramm_03_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_03_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_03_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_04_TypeClassEClass, Telegramm_04_TypeClass.class, "Telegramm_04_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_04_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_04_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_10_TypeClassEClass, Telegramm_10_TypeClass.class, "Telegramm_10_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_10_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_10_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_21_TypeClassEClass, Telegramm_21_TypeClass.class, "Telegramm_21_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_21_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_21_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_30_TypeClassEClass, Telegramm_30_TypeClass.class, "Telegramm_30_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_30_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_30_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_84_Alle_Fstr_AttributeGroupEClass, Telegramm_84_Alle_Fstr_AttributeGroup.class, "Telegramm_84_Alle_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelegramm_84_Alle_Fstr_AttributeGroup_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 0, 1, Telegramm_84_Alle_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelegramm_84_Alle_Fstr_AttributeGroup_Telegramm84FuerAlleFstr(), this.getTelegramm_84_Fuer_Alle_Fstr_TypeClass(), null, "telegramm84FuerAlleFstr", null, 1, 1, Telegramm_84_Alle_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_84_Einzelne_Fstr_AttributeGroupEClass, Telegramm_84_Einzelne_Fstr_AttributeGroup.class, "Telegramm_84_Einzelne_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 1, 1, Telegramm_84_Einzelne_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 0, 1, Telegramm_84_Einzelne_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_84_Fuer_Alle_Fstr_TypeClassEClass, Telegramm_84_Fuer_Alle_Fstr_TypeClass.class, "Telegramm_84_Fuer_Alle_Fstr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_84_Fuer_Alle_Fstr_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_84_Fuer_Alle_Fstr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_84_Verzicht_TypeClassEClass, Telegramm_84_Verzicht_TypeClass.class, "Telegramm_84_Verzicht_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_84_Verzicht_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_84_Verzicht_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_85_Alle_Fstr_AttributeGroupEClass, Telegramm_85_Alle_Fstr_AttributeGroup.class, "Telegramm_85_Alle_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelegramm_85_Alle_Fstr_AttributeGroup_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 0, 1, Telegramm_85_Alle_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelegramm_85_Alle_Fstr_AttributeGroup_Telegramm85FuerAlleFstr(), this.getTelegramm_85_Fuer_Alle_Fstr_TypeClass(), null, "telegramm85FuerAlleFstr", null, 1, 1, Telegramm_85_Alle_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_85_Einzelne_Fstr_AttributeGroupEClass, Telegramm_85_Einzelne_Fstr_AttributeGroup.class, "Telegramm_85_Einzelne_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 1, 1, Telegramm_85_Einzelne_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 0, 1, Telegramm_85_Einzelne_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegramm_85_Fuer_Alle_Fstr_TypeClassEClass, Telegramm_85_Fuer_Alle_Fstr_TypeClass.class, "Telegramm_85_Fuer_Alle_Fstr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegramm_85_Fuer_Alle_Fstr_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegramm_85_Fuer_Alle_Fstr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telegrammwiederholung_TypeClassEClass, Telegrammwiederholung_TypeClass.class, "Telegrammwiederholung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelegrammwiederholung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Telegrammwiederholung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterstation_Max_TypeClassEClass, Unterstation_Max_TypeClass.class, "Unterstation_Max_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnterstation_Max_TypeClass_Wert(), this.getUnterstation_Max_Type(), "wert", null, 1, 1, Unterstation_Max_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterstation_Nr_TypeClassEClass, Unterstation_Nr_TypeClass.class, "Unterstation_Nr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnterstation_Nr_TypeClass_Wert(), this.getUnterstation_Nr_Type(), "wert", null, 1, 1, Unterstation_Nr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verzoegerung_Manuell_Loeschung_TypeClassEClass, Verzoegerung_Manuell_Loeschung_TypeClass.class, "Verzoegerung_Manuell_Loeschung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerzoegerung_Manuell_Loeschung_TypeClass_Wert(), this.getVerzoegerung_Manuell_Loeschung_Type(), "wert", null, 1, 1, Verzoegerung_Manuell_Loeschung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vormeldestart_TypeClassEClass, Vormeldestart_TypeClass.class, "Vormeldestart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVormeldestart_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Vormeldestart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zbS_Adresse_TypeClassEClass, ZBS_Adresse_TypeClass.class, "ZBS_Adresse_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZBS_Adresse_TypeClass_Wert(), this.getZBS_Adresse_Type(), "wert", null, 1, 1, ZBS_Adresse_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zbS_Anbindung_TypeClassEClass, ZBS_Anbindung_TypeClass.class, "ZBS_Anbindung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZBS_Anbindung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, ZBS_Anbindung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zbS_Schnittstelle_TypeClassEClass, ZBS_Schnittstelle_TypeClass.class, "ZBS_Schnittstelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZBS_Schnittstelle_TypeClass_Wert(), this.getENUMZBSSchnittstelleObject(), "wert", null, 1, 1, ZBS_Schnittstelle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeitsynchronisation_Funkuhr_TypeClassEClass, Zeitsynchronisation_Funkuhr_TypeClass.class, "Zeitsynchronisation_Funkuhr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeitsynchronisation_Funkuhr_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Zeitsynchronisation_Funkuhr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_BusEClass, ZLV_Bus.class, "ZLV_Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Bezeichnung(), this.getZLV_Bus_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, ZLV_Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_ZLVBusAllg(), this.getZLV_Bus_Allg_AttributeGroup(), null, "zLVBusAllg", null, 1, 1, ZLV_Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Allg_AttributeGroupEClass, ZLV_Bus_Allg_AttributeGroup.class, "ZLV_Bus_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Allg_AttributeGroup_UnterstationMax(), this.getUnterstation_Max_TypeClass(), null, "unterstationMax", null, 1, 1, ZLV_Bus_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_Allg_AttributeGroup_ZNModem(), this.getZN_Modem_TypeClass(), null, "zNModem", null, 1, 1, ZLV_Bus_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Besondere_AnlageEClass, ZLV_Bus_Besondere_Anlage.class, "ZLV_Bus_Besondere_Anlage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Besondere_Anlage_Bezeichnung(), this.getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, ZLV_Bus_Besondere_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_Besondere_Anlage_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_ohne_Proxy_TypeClass(), null, "iDZLVBus", null, 1, 1, ZLV_Bus_Besondere_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass, ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup.class, "ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup_BezeichnungBesondereAnlage(), this.getBezeichnung_Besondere_Anlage_TypeClass(), null, "bezeichnungBesondereAnlage", null, 1, 1, ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Bezeichnung_AttributeGroupEClass, ZLV_Bus_Bezeichnung_AttributeGroup.class, "ZLV_Bus_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr(), this.getZLV_Bus_Nr_TypeClass(), null, "zLVBusNr", null, 1, 1, ZLV_Bus_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Nr_TypeClassEClass, ZLV_Bus_Nr_TypeClass.class, "ZLV_Bus_Nr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZLV_Bus_Nr_TypeClass_Wert(), this.getZLV_Bus_Nr_Type(), "wert", null, 1, 1, ZLV_Bus_Nr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_US_ZuordnungEClass, ZLV_Bus_US_Zuordnung.class, "ZLV_Bus_US_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_US_Zuordnung_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 1, 1, ZLV_Bus_US_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_IDZNUnterstation(), theVerweisePackage.getID_ZN_Unterstation_TypeClass(), null, "iDZNUnterstation", null, 1, 1, ZLV_Bus_US_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_ZLVBusUSZuordnungTelegramm(), this.getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup(), null, "zLVBusUSZuordnungTelegramm", null, 0, 1, ZLV_Bus_US_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_ZLVBusZuordnungAllg(), this.getZLV_Bus_Zuordnung_Allg_AttributeGroup(), null, "zLVBusZuordnungAllg", null, 1, 1, ZLV_Bus_US_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, "ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm02(), this.getTelegramm_02_TypeClass(), null, "telegramm02", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm03(), this.getTelegramm_03_TypeClass(), null, "telegramm03", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm04(), this.getTelegramm_04_TypeClass(), null, "telegramm04", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm10(), this.getTelegramm_10_TypeClass(), null, "telegramm10", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm21(), this.getTelegramm_21_TypeClass(), null, "telegramm21", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm30(), this.getTelegramm_30_TypeClass(), null, "telegramm30", null, 0, 1, ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlV_Bus_Zuordnung_Allg_AttributeGroupEClass, ZLV_Bus_Zuordnung_Allg_AttributeGroup.class, "ZLV_Bus_Zuordnung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLV_Bus_Zuordnung_Allg_AttributeGroup_Anschlussnummer(), this.getAnschlussnummer_TypeClass(), null, "anschlussnummer", null, 0, 1, ZLV_Bus_Zuordnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr(), this.getUnterstation_Nr_TypeClass(), null, "unterstationNr", null, 1, 1, ZLV_Bus_Zuordnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(znEClass, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, "ZN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_IDAnhangZNPlanBedienraum(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangZNPlanBedienraum", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_IDAnhangZNPlanRechnerraum(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangZNPlanRechnerraum", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_TypeClass(), null, "iDOertlichkeit", null, 1, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_IDStellwerk(), theVerweisePackage.getID_Stellwerk_TypeClass(), null, "iDStellwerk", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_IDZNUnterstation(), theVerweisePackage.getID_ZN_Unterstation_TypeClass(), null, "iDZNUnterstation", null, 1, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_ZNAllg(), this.getZN_Allg_AttributeGroup(), null, "zNAllg", null, 1, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_A_Bedienbezeichner_Frei_TypeClassEClass, ZN_A_Bedienbezeichner_Frei_TypeClass.class, "ZN_A_Bedienbezeichner_Frei_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_A_Bedienbezeichner_Frei_TypeClass_Wert(), this.getZN_A_Bedienbezeichner_Frei_Type(), "wert", null, 1, 1, ZN_A_Bedienbezeichner_Frei_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_A_Bezeichner_TypeClassEClass, ZN_A_Bezeichner_TypeClass.class, "ZN_A_Bezeichner_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_A_Bezeichner_TypeClass_Wert(), this.getZN_A_Bezeichner_Type(), "wert", null, 1, 1, ZN_A_Bezeichner_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_AkustikEClass, ZN_Akustik.class, "ZN_Akustik", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Akustik_ZNAkustikAnzeigefeld(), this.getZN_Akustik_Anzeigefeld_AttributeGroup(), null, "zNAkustikAnzeigefeld", null, 0, 1, ZN_Akustik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Akustik_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 0, 1, ZN_Akustik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Akustik_IDZNAnzeigefeld(), theVerweisePackage.getID_ZN_Anzeigefeld_TypeClass(), null, "iDZNAnzeigefeld", null, 0, 1, ZN_Akustik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Akustik_Anzeigefeld_AttributeGroupEClass, ZN_Akustik_Anzeigefeld_AttributeGroup.class, "ZN_Akustik_Anzeigefeld_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerAnbAnn(), this.getAkustikdauer_Anb_Ann_TypeClass(), null, "akustikdauerAnbAnn", null, 0, 1, ZN_Akustik_Anzeigefeld_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerSonst(), this.getAkustikdauer_Sonst_TypeClass(), null, "akustikdauerSonst", null, 0, 1, ZN_Akustik_Anzeigefeld_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerVoranz(), this.getAkustikdauer_Voranz_TypeClass(), null, "akustikdauerVoranz", null, 0, 1, ZN_Akustik_Anzeigefeld_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Allg_AttributeGroupEClass, ZN_Allg_AttributeGroup.class, "ZN_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Allg_AttributeGroup_Einwahlstelle(), this.getEinwahlstelle_TypeClass(), null, "einwahlstelle", null, 1, 1, ZN_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Allg_AttributeGroup_Reaktivierungsfunktion(), this.getReaktivierungsfunktion_TypeClass(), null, "reaktivierungsfunktion", null, 1, 1, ZN_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Allg_AttributeGroup_ZNAnlagentyp(), this.getZN_Anlagentyp_TypeClass(), null, "zNAnlagentyp", null, 1, 1, ZN_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Anlagentyp_TypeClassEClass, ZN_Anlagentyp_TypeClass.class, "ZN_Anlagentyp_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Anlagentyp_TypeClass_Wert(), this.getENUMZNAnlagentypObject(), "wert", null, 1, 1, ZN_Anlagentyp_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_AnzeigefeldEClass, ZN_Anzeigefeld.class, "ZN_Anzeigefeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Anzeigefeld_IDGleisAbschnitt(), theVerweisePackage.getID_Gleis_Abschnitt_TypeClass(), null, "iDGleisAbschnitt", null, 0, 1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_IDZLVBus(), theVerweisePackage.getID_ZLV_Bus_TypeClass(), null, "iDZLVBus", null, 0, -1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 1, 1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_IDZNAnzeigefeld(), theVerweisePackage.getID_ZN_Anzeigefeld_TypeClass(), null, "iDZNAnzeigefeld", null, 0, 1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_ZNAnzeigefeldAllg(), this.getZN_Anzeigefeld_Allg_AttributeGroup(), null, "zNAnzeigefeldAllg", null, 0, 1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_ZNAnzeigefeldBezeichnung(), this.getZN_Anzeigefeld_Bezeichnung_AttributeGroup(), null, "zNAnzeigefeldBezeichnung", null, 1, 1, ZN_Anzeigefeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Anzeigefeld_Allg_AttributeGroupEClass, ZN_Anzeigefeld_Allg_AttributeGroup.class, "ZN_Anzeigefeld_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld(), this.getBedienbarkeit_Anzeigefeld_TypeClass(), null, "bedienbarkeitAnzeigefeld", null, 1, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_BfNrANB(), this.getBf_Nr_ANB_TypeClass(), null, "bfNrANB", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_BfNrZNA(), this.getBf_Nr_ZN_A_TypeClass(), null, "bfNrZNA", null, 1, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_FunktionalitaetAnzeigefeld(), this.getFunktionalitaet_Anzeigefeld_TypeClass(), null, "funktionalitaetAnzeigefeld", null, 1, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_HOA(), this.getHOA_TypeClass(), null, "hOA", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld(), this.getSichtbarkeit_Anzeigefeld_TypeClass(), null, "sichtbarkeitAnzeigefeld", null, 1, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung(), this.getVerzoegerung_Manuell_Loeschung_TypeClass(), null, "verzoegerungManuellLoeschung", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_Vormeldestart(), this.getVormeldestart_TypeClass(), null, "vormeldestart", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_ZNAnzeigefeldLoeschkriterium(), this.getZN_Anzeigefeld_Loeschkriterium_TypeClass(), null, "zNAnzeigefeldLoeschkriterium", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige(), this.getZN_Feld_Ohne_Anzeige_TypeClass(), null, "zNFeldOhneAnzeige", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung(), this.getZugvorbereitungsmeldung_TypeClass(), null, "zugvorbereitungsmeldung", null, 0, 1, ZN_Anzeigefeld_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass, ZN_Anzeigefeld_Bezeichnung_AttributeGroup.class, "ZN_Anzeigefeld_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei(), this.getZN_A_Bedienbezeichner_Frei_TypeClass(), null, "zNABedienbezeichnerFrei", null, 0, 1, ZN_Anzeigefeld_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABezeichner(), this.getZN_A_Bezeichner_TypeClass(), null, "zNABezeichner", null, 1, 1, ZN_Anzeigefeld_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Anzeigefeld_Loeschkriterium_TypeClassEClass, ZN_Anzeigefeld_Loeschkriterium_TypeClass.class, "ZN_Anzeigefeld_Loeschkriterium_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Anzeigefeld_Loeschkriterium_TypeClass_Wert(), this.getENUMZNAnzeigefeldLoeschkriteriumObject(), "wert", null, 1, 1, ZN_Anzeigefeld_Loeschkriterium_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Feld_Ohne_Anzeige_TypeClassEClass, ZN_Feld_Ohne_Anzeige_TypeClass.class, "ZN_Feld_Ohne_Anzeige_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Feld_Ohne_Anzeige_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, ZN_Feld_Ohne_Anzeige_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Fortschalt_Krit_Druck_AttributeGroupEClass, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, "ZN_Fortschalt_Krit_Druck_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_Ausfahrdruck(), this.getAusfahrdruck_TypeClass(), null, "ausfahrdruck", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_AusfahrdruckGegengleis(), this.getAusfahrdruck_Gegengleis_TypeClass(), null, "ausfahrdruckGegengleis", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_Durchfahrdruck(), this.getDurchfahrdruck_TypeClass(), null, "durchfahrdruck", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_Einfahrdruck(), this.getEinfahrdruck_TypeClass(), null, "einfahrdruck", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_EinfahrdruckGegengleis(), this.getEinfahrdruck_Gegengleis_TypeClass(), null, "einfahrdruckGegengleis", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Druck_AttributeGroup_Meldedruck(), this.getMeldedruck_TypeClass(), null, "meldedruck", null, 0, 1, ZN_Fortschalt_Krit_Druck_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Fortschalt_Krit_Schalt_AttributeGroupEClass, ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, "ZN_Fortschalt_Krit_Schalt_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Fortschalt_Krit_Schalt_AttributeGroup_BesonderesSchaltkriterium(), this.getBesonderes_Schaltkriterium_TypeClass(), null, "besonderesSchaltkriterium", null, 0, 1, ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Schalt_AttributeGroup_IDFortschaltungStart(), theVerweisePackage.getID_Fortschaltung_Start_TypeClass(), null, "iDFortschaltungStart", null, 1, 1, ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung(), this.getTelegrammwiederholung_TypeClass(), null, "telegrammwiederholung", null, 0, 1, ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Krit_Schalt_AttributeGroup_ZNSchaltkriterium(), this.getZN_Schaltkriterium_TypeClass(), null, "zNSchaltkriterium", null, 1, 1, ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Fortschalt_KriteriumEClass, ZN_Fortschalt_Kriterium.class, "ZN_Fortschalt_Kriterium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Fortschalt_Kriterium_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 1, 1, ZN_Fortschalt_Kriterium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Kriterium_IDZNFortschaltKritStart(), theVerweisePackage.getID_ZN_Anzeigefeld_TypeClass(), null, "iDZNFortschaltKritStart", null, 1, 1, ZN_Fortschalt_Kriterium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Kriterium_IDZNFortschaltKritZiel(), theVerweisePackage.getID_ZN_Anzeigefeld_TypeClass(), null, "iDZNFortschaltKritZiel", null, 0, -1, ZN_Fortschalt_Kriterium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Kriterium_ZNFortschaltKritDruck(), this.getZN_Fortschalt_Krit_Druck_AttributeGroup(), null, "zNFortschaltKritDruck", null, 0, 1, ZN_Fortschalt_Kriterium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Fortschalt_Kriterium_ZNFortschaltKritSchalt(), this.getZN_Fortschalt_Krit_Schalt_AttributeGroup(), null, "zNFortschaltKritSchalt", null, 0, -1, ZN_Fortschalt_Kriterium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Modem_TypeClassEClass, ZN_Modem_TypeClass.class, "ZN_Modem_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Modem_TypeClass_Wert(), this.getENUMZNModemObject(), "wert", null, 1, 1, ZN_Modem_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Schaltkriterium_TypeClassEClass, ZN_Schaltkriterium_TypeClass.class, "ZN_Schaltkriterium_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Schaltkriterium_TypeClass_Wert(), this.getENUMZNSchaltkriteriumObject(), "wert", null, 1, 1, ZN_Schaltkriterium_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Telegramm_84_ZuordnungEClass, ZN_Telegramm_84_Zuordnung.class, "ZN_Telegramm_84_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Telegramm_84_Zuordnung_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 1, 1, ZN_Telegramm_84_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Telegramm_84_Zuordnung_Telegramm84AlleFstr(), this.getTelegramm_84_Alle_Fstr_AttributeGroup(), null, "telegramm84AlleFstr", null, 0, 1, ZN_Telegramm_84_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Telegramm_84_Zuordnung_Telegramm84EinzelneFstr(), this.getTelegramm_84_Einzelne_Fstr_AttributeGroup(), null, "telegramm84EinzelneFstr", null, 0, 1, ZN_Telegramm_84_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Telegramm_84_Zuordnung_Telegramm84Verzicht(), this.getTelegramm_84_Verzicht_TypeClass(), null, "telegramm84Verzicht", null, 0, 1, ZN_Telegramm_84_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Telegramm_85_ZuordnungEClass, ZN_Telegramm_85_Zuordnung.class, "ZN_Telegramm_85_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Telegramm_85_Zuordnung_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 1, 1, ZN_Telegramm_85_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Telegramm_85_Zuordnung_Telegramm85AlleFstr(), this.getTelegramm_85_Alle_Fstr_AttributeGroup(), null, "telegramm85AlleFstr", null, 0, 1, ZN_Telegramm_85_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Telegramm_85_Zuordnung_Telegramm85EinzelneFstr(), this.getTelegramm_85_Einzelne_Fstr_AttributeGroup(), null, "telegramm85EinzelneFstr", null, 0, 1, ZN_Telegramm_85_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_UnterstationEClass, ZN_Unterstation.class, "ZN_Unterstation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Unterstation_IDZNZBS(), theVerweisePackage.getID_ZN_ZBS_TypeClass(), null, "iDZNZBS", null, 0, 1, ZN_Unterstation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_ZNUnterstationAllg(), this.getZN_Unterstation_Allg_AttributeGroup(), null, "zNUnterstationAllg", null, 1, 1, ZN_Unterstation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Unterstation_Allg_AttributeGroupEClass, ZN_Unterstation_Allg_AttributeGroup.class, "ZN_Unterstation_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_BfKennung(), this.getBf_Kennung_TypeClass(), null, "bfKennung", null, 1, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_Koppelunterstation(), this.getKoppelunterstation_TypeClass(), null, "koppelunterstation", null, 1, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_KUsZeittelegramm(), this.getKUs_Zeittelegramm_TypeClass(), null, "kUsZeittelegramm", null, 0, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse(), this.getZBS_Adresse_TypeClass(), null, "zBSAdresse", null, 0, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_ZBSAnbindung(), this.getZBS_Anbindung_TypeClass(), null, "zBSAnbindung", null, 1, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr(), this.getZeitsynchronisation_Funkuhr_TypeClass(), null, "zeitsynchronisationFunkuhr", null, 0, 1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Allg_AttributeGroup_ZNUnterstationBfNr(), this.getZN_Unterstation_Bf_Nr_AttributeGroup(), null, "zNUnterstationBfNr", null, 1, -1, ZN_Unterstation_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Unterstation_Bf_Nr_AttributeGroupEClass, ZN_Unterstation_Bf_Nr_AttributeGroup.class, "ZN_Unterstation_Bf_Nr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr(), this.getBf_Nr_TypeClass(), null, "bfNr", null, 1, 1, ZN_Unterstation_Bf_Nr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Bf_Nr_AttributeGroup_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeit", null, 1, 1, ZN_Unterstation_Bf_Nr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_Unterstation_Bf_Nr_AttributeGroup_Prioritaet(), this.getPrioritaet_TypeClass(), null, "prioritaet", null, 0, 1, ZN_Unterstation_Bf_Nr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_ZBSEClass, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS.class, "ZN_ZBS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZN_ZBS_IDESTWZentraleinheit(), theVerweisePackage.getID_ESTW_Zentraleinheit_TypeClass(), null, "iDESTWZentraleinheit", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_ZBS_IPAdresse(), this.getIP_Adresse_TypeClass(), null, "iPAdresse", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZN_ZBS_ZBSSchnittstelle(), this.getZBS_Schnittstelle_TypeClass(), null, "zBSSchnittstelle", null, 0, 1, org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_ZBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugvorbereitungsmeldung_TypeClassEClass, Zugvorbereitungsmeldung_TypeClass.class, "Zugvorbereitungsmeldung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZugvorbereitungsmeldung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Zugvorbereitungsmeldung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAkustikAnbAnnEEnum, ENUMAkustikAnbAnn.class, "ENUMAkustikAnbAnn");
		addEEnumLiteral(enumAkustikAnbAnnEEnum, ENUMAkustikAnbAnn.ENUM_AKUSTIK_ANB_ANN_5S);
		addEEnumLiteral(enumAkustikAnbAnnEEnum, ENUMAkustikAnbAnn.ENUM_AKUSTIK_ANB_ANN_BIS_ANKUNFT_ZUG);

		initEEnum(enumAkustikSonstEEnum, ENUMAkustikSonst.class, "ENUMAkustikSonst");
		addEEnumLiteral(enumAkustikSonstEEnum, ENUMAkustikSonst.ENUM_AKUSTIK_SONST_5S);
		addEEnumLiteral(enumAkustikSonstEEnum, ENUMAkustikSonst.ENUM_AKUSTIK_SONST_KEINE);

		initEEnum(enumBfKennungEEnum, ENUMBfKennung.class, "ENUMBfKennung");
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_20);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_21);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_22);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_23);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_24);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_50);
		addEEnumLiteral(enumBfKennungEEnum, ENUMBfKennung.ENUM_BF_KENNUNG_51);

		initEEnum(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.class, "ENUMFunktionalitaetAnzeigefeld");
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_ANBIETE_ANNAHMEFELD);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_MELDEORT);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_SONSTIGE);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_SPIEGELFELD);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_STAPELFELD);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_VORANZEIGEFELD);
		addEEnumLiteral(enumFunktionalitaetAnzeigefeldEEnum, ENUMFunktionalitaetAnzeigefeld.ENUM_FUNKTIONALITAET_ANZEIGEFELD_WANDELFELD);

		initEEnum(enumzbsSchnittstelleEEnum, ENUMZBSSchnittstelle.class, "ENUMZBSSchnittstelle");
		addEEnumLiteral(enumzbsSchnittstelleEEnum, ENUMZBSSchnittstelle.ENUMZBS_SCHNITTSTELLE_LOGEM_LGM_28_8D1);
		addEEnumLiteral(enumzbsSchnittstelleEEnum, ENUMZBSSchnittstelle.ENUMZBS_SCHNITTSTELLE_NOKIA_ECM_FAST_14400);
		addEEnumLiteral(enumzbsSchnittstelleEEnum, ENUMZBSSchnittstelle.ENUMZBS_SCHNITTSTELLE_NOKIA_ECM_FAST_19200);
		addEEnumLiteral(enumzbsSchnittstelleEEnum, ENUMZBSSchnittstelle.ENUMZBS_SCHNITTSTELLE_SONSTIGE);

		initEEnum(enumznAnlagentypEEnum, ENUMZNAnlagentyp.class, "ENUMZNAnlagentyp");
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_SONSTIGE);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZN_B950);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZN_SU_B);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNE_L2000);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNL_2000);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNL_800);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNP_801);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNS_801);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNS_901);
		addEEnumLiteral(enumznAnlagentypEEnum, ENUMZNAnlagentyp.ENUMZN_ANLAGENTYP_ZNS_901R);

		initEEnum(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.class, "ENUMZNAnzeigefeldLoeschkriterium");
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_AUTOMATISCH_NACH_30_S);
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_FAHRSTRASSE_AUFGELOEST);
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_FORTSCHALTUNG_BEIM_NACHBARN);
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_HAENDISCH);
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_RUECKBLOCK_EINGEGANGEN);
		addEEnumLiteral(enumznAnzeigefeldLoeschkriteriumEEnum, ENUMZNAnzeigefeldLoeschkriterium.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_SONSTIGE);

		initEEnum(enumznModemEEnum, ENUMZNModem.class, "ENUMZNModem");
		addEEnumLiteral(enumznModemEEnum, ENUMZNModem.ENUMZN_MODEM_LOGEM_1200_MD);
		addEEnumLiteral(enumznModemEEnum, ENUMZNModem.ENUMZN_MODEM_NOKIA_1200_SE);
		addEEnumLiteral(enumznModemEEnum, ENUMZNModem.ENUMZN_MODEM_SCADA_NG);
		addEEnumLiteral(enumznModemEEnum, ENUMZNModem.ENUMZN_MODEM_SONSTIGE);

		initEEnum(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.class, "ENUMZNSchaltkriterium");
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_GLEIS_BELEGEN);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_GLEIS_BELEGEN_UND_DAVOR_FREIFAHREN);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_GLEIS_FREIFAHREN);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_KEIN);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_MANUELL);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_SIGNALHALTFALL_HAUPTSIGNAL);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_SIGNALHALTFALL_RANGIERSIGNAL);
		addEEnumLiteral(enumznSchaltkriteriumEEnum, ENUMZNSchaltkriterium.ENUMZN_SCHALTKRITERIUM_SONSTIGE);

		// Initialize data types
		initEDataType(anschlussnummer_TypeEDataType, BigInteger.class, "Anschlussnummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(besonderes_Schaltkriterium_TypeEDataType, String.class, "Besonderes_Schaltkriterium_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Besondere_Anlage_TypeEDataType, String.class, "Bezeichnung_Besondere_Anlage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bf_Nr_TypeEDataType, BigInteger.class, "Bf_Nr_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAkustikAnbAnnObjectEDataType, ENUMAkustikAnbAnn.class, "ENUMAkustikAnbAnnObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAkustikSonstObjectEDataType, ENUMAkustikSonst.class, "ENUMAkustikSonstObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBfKennungObjectEDataType, ENUMBfKennung.class, "ENUMBfKennungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFunktionalitaetAnzeigefeldObjectEDataType, ENUMFunktionalitaetAnzeigefeld.class, "ENUMFunktionalitaetAnzeigefeldObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumzbsSchnittstelleObjectEDataType, ENUMZBSSchnittstelle.class, "ENUMZBSSchnittstelleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumznAnlagentypObjectEDataType, ENUMZNAnlagentyp.class, "ENUMZNAnlagentypObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumznAnzeigefeldLoeschkriteriumObjectEDataType, ENUMZNAnzeigefeldLoeschkriterium.class, "ENUMZNAnzeigefeldLoeschkriteriumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumznModemObjectEDataType, ENUMZNModem.class, "ENUMZNModemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumznSchaltkriteriumObjectEDataType, ENUMZNSchaltkriterium.class, "ENUMZNSchaltkriteriumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adresse_TypeEDataType, String.class, "IP_Adresse_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prioritaet_TypeEDataType, BigInteger.class, "Prioritaet_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unterstation_Max_TypeEDataType, BigInteger.class, "Unterstation_Max_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unterstation_Nr_TypeEDataType, String.class, "Unterstation_Nr_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verzoegerung_Manuell_Loeschung_TypeEDataType, BigDecimal.class, "Verzoegerung_Manuell_Loeschung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zbS_Adresse_TypeEDataType, String.class, "ZBS_Adresse_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zlV_Bus_Nr_TypeEDataType, BigInteger.class, "ZLV_Bus_Nr_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zN_A_Bedienbezeichner_Frei_TypeEDataType, String.class, "ZN_A_Bedienbezeichner_Frei_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zN_A_Bezeichner_TypeEDataType, BigInteger.class, "ZN_A_Bezeichner_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (getTelegramm_84_Alle_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Der Verweis wird gef\u00fcllt, wenn das Telegramm 84 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. "
		   });
		addAnnotation
		  (getTelegramm_84_Alle_Fstr_AttributeGroup_Telegramm84FuerAlleFstr(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 84 (Fahrstra\u00dfe aufgel\u00f6st). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Herstellerspezifisch ist anzugeben, ob dieses Telegramm f\u00fcr einzelne Fahrstra\u00dfen oder f\u00fcr alle Fahrstra\u00dfen gesendet werden soll. Zudem sind herstellerspezifischen Abh\u00e4ngigkeiten beim Senden von Telegramm 84 und 85 zu beachten. Kann die ZN das Telegramm 84 nur f\u00fcr alle oder keine Fahrstra\u00dfen senden, ist dieser Boolean auszuw\u00e4hlen. DB-Regelwerk 819.0731A02 1 (5) "
		   });
		addAnnotation
		  (getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die betreffende Fahrstra\u00dfe, f\u00fcr die das Telegramm 84 von der ZN gesendet wird. DB-Regelwerk 819.0731 1 sowie detaillierte Abstimmungen mit dem Betreiber "
		   });
		addAnnotation
		  (getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Der Verweis wird gef\u00fcllt, wenn das Telegramm 84 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. "
		   });
		addAnnotation
		  (getTelegramm_85_Alle_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Der Verweis wird gef\u00fcllt, wenn das Telegramm 85 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. "
		   });
		addAnnotation
		  (getTelegramm_85_Alle_Fstr_AttributeGroup_Telegramm85FuerAlleFstr(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 85 (Fahrstra\u00dfe eingestellt). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Herstellerspezifisch ist anzugeben, ob das Telegramm f\u00fcr einzelne oder f\u00fcr alle Fahrstra\u00dfen gesendet werden soll. Zudem sind herstellerspezifische Abh\u00e4ngigkeiten beim Senden von Telegramm 84 und 85 zu beachten. Kann die ZN das Telegramm 85 nur f\u00fcr alle oder keine Fahrstra\u00dfen senden, ist dieser Boolean auszuw\u00e4hlen. DB-Regelwerk 819.0731A02 1 (5) "
		   });
		addAnnotation
		  (getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die betreffende Fahrstra\u00dfe, f\u00fcr die das Telegramm 85 von der ZN gesendet wird. DB-Regelwerk 819.0731 1 sowie detaillierte Abstimmungen mit dem Betreiber "
		   });
		addAnnotation
		  (getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Der Verweis wird gef\u00fcllt, wenn das Telegramm 85 durchzureichen ist. Verweis auf den ZLV-Bus, auf den das Telegramm durchgereicht wird. "
		   });
		addAnnotation
		  (zlV_BusEClass,
		   source,
		   new String[] {
			   "documentation", "Zuglaufverfolgungsbus. Verbindung zwischen den ZN-Unterstationen zum Transport der Zugnummernmeldetelegramme. ZLV-Busse k\u00f6nnen BZ-\u00fcbergreifend geplant werden. In diesem Fall gelten f\u00fcr die Vergabe der ZLV Bus Nr besondere Bedingungen. DB-Regelwerk 819.0731 8 (2) Die Darstellung der Angaben erfolgt im ZLV-Bus-\u00dcbersichtsplan nach 819.0731 A01 "
		   });
		addAnnotation
		  (getZLV_Bus_Allg_AttributeGroup_UnterstationMax(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der maximal auf einen ZLV-Bus anschlie\u00dfbaren Unterstationen. Die Anzahl h\u00e4ngt von der L\u00e4nge, der Qualit\u00e4t und des Umfangs der Telegramme ab. Nach Ril sind in der Regel maximal 10 Unterstationen pro ZLV-Bus zu planen. DB-Regelwerk 819.0731 5 (12) 819.0731 5 (13) "
		   });
		addAnnotation
		  (getZLV_Bus_Allg_AttributeGroup_ZNModem(),
		   source,
		   new String[] {
			   "documentation", "Modem, welches die Verbindung zwischen ZN Unterstation und ZLV-Bus f\u00fcr die Datenkommunikation herstellt. Je ZLV-Bus ist nur eine Modembauart zul\u00e4ssig. F\u00fcr Neuanlagen ist das Modem der Bauart LOGEM 1200 MD oder LineRunner SCADA NG zu verwenden. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk 819.0731A04 1 "
		   });
		addAnnotation
		  (zlV_Bus_Besondere_AnlageEClass,
		   source,
		   new String[] {
			   "documentation", "Besondere Anlage, die an einen ZLV-Bus angeschlossen ist."
		   });
		addAnnotation
		  (getZLV_Bus_Besondere_Anlage_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den ZLV-Bus, an den die Besondere Anlage angeschlossen ist."
		   });
		addAnnotation
		  (getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup_BezeichnungBesondereAnlage(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der besonderen Anlage, die Informationen \u00fcber den ZLV-Bus empf\u00e4ngt bzw. sendet."
		   });
		addAnnotation
		  (getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr(),
		   source,
		   new String[] {
			   "documentation", "Nummer des ZLV-Busses. Jeder ZLV-Bus hat eine ihn identifizierende Nummer, die zentral festgelegt wird. Zuk\u00fcnftig wird die Nummer vierstellig angegeben; die ersten beiden Ziffern geben die Region an. Damit ist jeder ZLV-Bus bereits anhand seiner Nummer eindeutig in der Region identifizierbar. Bei BZ-\u00fcbergreifenden ZLV-Bussen wird der BZ-Code nach Ril 100.0001A01 der ZLV-Bus-Nummer vorangestellt, getrennt durch einen Schr\u00e4gstrich. Der BZ-Code wird aus dem Verweis auf die Bedien Zentrale generiert. DB-Regelwerk 100.0001A01 819.0731 5 (14) "
		   });
		addAnnotation
		  (zlV_Bus_US_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von ZLV-Bussen zur ZN Unterstation und Angabe durchzureichender Telegramme. Logisches Objekt, falls eine ZN Unterstation an mehrere ZLV-Busse angebunden wird. DB-Regelwerk 819.0731 5 (4) ff Die Darstellung der Angaben erfolgt im ZLV-Bus-\u00dcbersichtsplan nach 819.0731 A01 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID des ZLV-Busses, an den die Unterstation angebunden wird. "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_IDZNUnterstation(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID der ZLV-Bus-Unterstation, die an den ZLV-Bus angeschlossen wird. "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_ZLVBusUSZuordnungTelegramm(),
		   source,
		   new String[] {
			   "documentation", "Darstellung von durchzureichenden Telegrammen gem\u00e4\u00df Tabelle 2 in der Ril 819.0731 A02. Die Attributgruppe dient der Zuordnung zur Quell-Unterstation, von der ZN-Anzeigefelder und/oder Telegramme durchgereicht werden. Firmenspezifische Telegrammarten werden nicht durchgereicht. DB-Regelwerk 819.0731 A02. Die Darstellung im PT1 erfolgt, wenn \u00fcberhaupt, im Erl\u00e4uterungsbericht. "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm02(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 02 (ZN/FN Meldung ohne erfolgte \u00dcberschreibung, jedoch auch bei \u00dcberspeicherung) ist durchzureichen. Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm03(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 03 (Erste FN-Meldung) ist durchzureichen. Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm04(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 04 (ZN/FN mit erfolgter \u00dcberschreibung von ZN/FN). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm10(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 10 (Einwahl von ZN und Verf\u00fcgbarkeitshinweisen und Wiederkehr von Verf\u00fcgbarkeitshinweisen). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm21(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 21 (L\u00f6schen von ZN/FN). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Bei ZN-Anlagen der Bauformen Thales (einschlie\u00dflich Bauformen Alcatel SEL) und Bombardier wird das Telegramm 21 unabh\u00e4ngig von einer Filterung IMMER durchgereicht. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm30(),
		   source,
		   new String[] {
			   "documentation", "Telegramm 30 (Ersetzen von ZN/FN). Die Angabe von Telegrammen ist f\u00fcr die Durchreichfunktion erforderlich. Eine Aufstellung aller verf\u00fcgbaren Telegramme steht dem LST-Fachplaner nicht zur Verf\u00fcgung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Bei ZN-Anlagen der Bauformen Thales (einschlie\u00dflich Bauformen Alcatel SEL) und Bombardier wird das Telegramm 30 unabh\u00e4ngig von einer Filterung IMMER durchgereicht. DB-Regelwerk 819.0731A02 "
		   });
		addAnnotation
		  (getZLV_Bus_Zuordnung_Allg_AttributeGroup_Anschlussnummer(),
		   source,
		   new String[] {
			   "documentation", "Anschlussnummer der (K/M)Unterstation auf dem ZLV-Bus. Jede Unterstation einer Kus hat f\u00fcr jeden angeschlossenen ZLV-Bus eine eigene und einmalige Anschlussnummer. Das Attribut wird nur gef\u00fcllt, wenn die Unterstation an mehr als einem ZLV-Bus angeschlossen wird. DB-Regelwerk Allgemeine Angaben finden sich in Ril 819.0731 5 (12)."
		   });
		addAnnotation
		  (getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Unterstationsnummer auf diesem ZLV-Bus. Es wird empfohlen, auf einem ZLV-Bus nur gerade Nummern im Bereich 02..20 oder ungerade Nummern im Bereich 01..19 zu verwenden. DB-Regelwerk 819.0731 5 (12)"
		   });
		addAnnotation
		  (znEClass,
		   source,
		   new String[] {
			   "documentation", "Zugnummernmeldeanlage. Wird die ZN-Anlage zusammen mit dem ESTW geplant, gibt es keinen Verweis auf die Anh\u00e4nge, da die ZN bereits in der ESTW-Konfiguration ber\u00fccksichtigt ist. Wird die ZN nachger\u00fcstet, sind die Verweise auf ESTW_Zentraleinheit und Anh\u00e4nge vorhanden. Kann eine ESTW-Bauform keine ZN ber\u00fccksichtigen, dann gibt es keinen Verweis auf ESTW_Zentraleinheit. DB-Regelwerk 819.0731 "
		   });
		addAnnotation
		  (getZN_IDAnhangZNPlanBedienraum(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID des Raumplans Bedienraum, der als Anhang im Format PDF beigef\u00fcgt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von M\u00f6beln mit Unterbringung der ZN-Komponenten f\u00fcr den Bedienraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigef\u00fcgt. Wird die ZN zusammen mit dem zugeh\u00f6rigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 "
		   });
		addAnnotation
		  (getZN_IDAnhangZNPlanRechnerraum(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID des Raumplans Rechnerraum, der als Anhang im Format PDF beigef\u00fcgt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von ZN-Komponenten im Rechnerraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigef\u00fcgt. Wird die ZN zusammen mit dem zugeh\u00f6rigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 "
		   });
		addAnnotation
		  (getZN_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlichkeit, die f\u00fcr die ZN-Anlage namensgebend ist. Es ist der Wert \u201eOertlichkeit_Langname\u201c zu verwenden. "
		   });
		addAnnotation
		  (getZN_IDStellwerk(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ESTW-Zentraleinheit oder ein Relaisstellwerk, zu der diese ZN oder f\u00fcr die eine ZN-Einwahlstelle geplant wurde. Der Verweis ist optional, da im Plaungswerkzeug ZN/ZL keine Bef\u00fcllung aller f\u00fcr die ESTW-ZE vorgesehenen Attribute m\u00f6glich ist."
		   });
		addAnnotation
		  (getZN_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getZN_IDZNUnterstation(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ID der zugeh\u00f6rigen ZLV-Bus-Unterstation. "
		   });
		addAnnotation
		  (zN_AkustikEClass,
		   source,
		   new String[] {
			   "documentation", "Akustisches Signal bei Bef\u00fcllung eines ZN-Anzeigefeldes mit einer Zugnummer Bei der Planung der ZN-Akustik sind herstellerspezifische Besonderheiten zu beachten. Akustiken im Anbiete-/Annahmefeld sind Standard und nicht gesondert zu planen. Das Objekt bzw. die Attributgruppe wird bei Anbiete/Annahme- sowie Voranzeigefeldern IMMER angelegt, um die Dauer der Akustik festzulegen. F\u00fcr die weiteren ZN-Anzeigefelder wird das Objekt nur dann angelegt, wenn das betreffene ZN Anzeigefeld mit einer Akustik ausgestatteet wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht vorhanden. Es findet sich im Lastenheft sowie in den firmenspezifischen Projektierungsunterlagen, die dem LST-Fachplaner nicht zur Verf\u00fcgung stehen."
		   });
		addAnnotation
		  (getZN_Akustik_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, f\u00fcr die eine Akustik geplant wird, sofern keine ZN-Anzeigefeld-spezifische Planung m\u00f6glich ist (herstellerabh\u00e4ngig). "
		   });
		addAnnotation
		  (getZN_Akustik_IDZNAnzeigefeld(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das ZN-Anzeigefeld, f\u00fcr das eine Akustik geplant wird (herstellerabh\u00e4ngig). "
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerAnbAnn(),
		   source,
		   new String[] {
			   "documentation", "Dauer der akustischen Meldung im Anbiete-/Annahmefeld Eine akustische Meldung im Anbiete-/Annahmefeld (mit Anzeige der Zugnummer) ist Standard und daher nicht gesondert zu planen. Es kann nur zwischen der Akustikdauer von 5s oder bis zur Annahme des Zuges unterschieden werden. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerSonst(),
		   source,
		   new String[] {
			   "documentation", "Dauer einer akustischen Meldung im ZN Anzeigefeld. Herstellerspezifisch ist es m\u00f6glich, jedes ZN Anzeigefeld, welches nicht Anbiet-/Annahme- oder Voranzeigefeld ist, mit einer akustischen Meldung bei Bef\u00fcllung mit einer Zugnummer zu belegen. Dieses Attribut wird nur bef\u00fcllt, wenn die ZN-Anlage dieses herstellerseitig zul\u00e4sst. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und dem Hersteller. "
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerVoranz(),
		   source,
		   new String[] {
			   "documentation", "Dauer einer akustischen Meldung im Voranzeigefeld. Es ist anzugeben, ob bei Bef\u00fcllen der Voranzeige durch eine Zugnummer eine akustische Meldung erfolgt. Bei den Bauarten der Hersteller Siemens und Thales muss die Angabe f\u00fcr alle Voranzeigefelder einheitlich sein, da eine Unterscheidung je Voranzeigefeld systembedingt z. Zt. nicht realisiert ist. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und Hersteller."
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_Einwahlstelle(),
		   source,
		   new String[] {
			   "documentation", "Anlage zur Einwahl von Zugnummern. Eine ZN-Einwahlstelle wird im Allgemeinen an benachbarten Stellwerken zu neu errichteten ESTW vorgesehen, sofern diese noch nicht mit einer ZN-Anlage ausger\u00fcstet sind. Hinsichtlich der eigentlichen Planungsdaten einer Einwahlstelle gibt es keine Unterschiede zur Planung einer \\\"normalen\\\" ZN-Anlage. Bei der Planung der Einwahlstelle werden die Anh\u00e4nge f\u00fcr die Einr\u00e4umung von Rechner- und Bedienraum beigef\u00fcgt. In der Regel hat die Einwahlstelle keine Anschaltung an die Stellwerkstechnik. Eine Einwahlstelle der Bauform ZNP801 unterscheidet dieses Merkmal hinsichtlich der Anbindung nicht. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der umfangreichen Abstimmungen zwischen LST-Fachplaner und Betreiber."
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_Reaktivierungsfunktion(),
		   source,
		   new String[] {
			   "documentation", "Im Fall der St\u00f6rung eines ZLV-Busses sendet die ZN-Anlage ein Reaktivierungstelegramm. In Abh\u00e4ngigkeit zum Hersteller muss die Reaktivierungsfunktion geplant werden. DB-Regelwerk 819.0731 5 (19) "
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_ZNAnlagentyp(),
		   source,
		   new String[] {
			   "documentation", "Herstellerspezifischer Typ der ZN-Anlage. Aufgrund firmenspezifischer Projektierungsunterschiede muss der Hersteller vor Beginn der Planung bekannt sein. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Aufgrund firmenspezifischer Projektierungsunterschiede muss der Hersteller vor Beginn der Planung bekannt sein. Siehe dazu Ril 819.0731 A0x. Die Anlagentypen ZNL_800, ZNS_800 und ZNS_801 sind f\u00fcr Neuanlagen nicht mehr zu verwenden."
		   });
		addAnnotation
		  (zN_AnzeigefeldEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt, welches die Funktionalit\u00e4ten der ZN auf der Bedienoberfl\u00e4che abbildet. F\u00fcr jedes Gleis, in denen die ZN-Anlage Zugnummern verwalten und/oder anzeigen soll, ist mindestens ein ZN-Anzeigefeld zu definieren. Hinsichtlich der Besonderheiten bei der Bezeichnug wird auf die Ausf\u00fchrungen auf der Seite Bezeichnung ZN-Anzeigefeld verwiesen. DB-Regelwerk 819.0731 6 (1) bis (15) sowie (19) ff "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den zugeh\u00f6rigen Gleisabschnitt, in dem das ZN-Anzeigefeld auf der Bedienoberfl\u00e4che angeordnet wird. "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZLVBus(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den oder die ZLV_Bus(se), auf den/die das Anzeigefeld durchgereicht wird. Der Verweis wird nur im Falle einer Durchreichung gef\u00fcllt. "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, zu der das ZN-Anzeigefeld geh\u00f6rt. "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZNAnzeigefeld(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein zugeh\u00f6riges ZN-Anzeigefeld, z. B. bei der Anordnung von Voranzeige- oder Anbiete-/Annahmefeldern. "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "documentation", "Das Anzeigefeld ist auf der Bedienoberfl\u00e4che bedienbar. DB-Regelwerk 819.0731 6 (20) "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BfNrANB(),
		   source,
		   new String[] {
			   "documentation", "Bahnhofsnummer aus der ZN-Anlage des Nachbarn. Die Angabe wird nur f\u00fcr die ZN-Anzeigefelder mit der Funktionalit\u00e4t ANB/ANN ben\u00f6tigt."
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BfNrZNA(),
		   source,
		   new String[] {
			   "documentation", "Bahnhofsnummer, in deren Bereich das ZN-Anzeigefeld angeordnet wird. Es kann dieselbe Bahnhofsnummer sein wie die der gesamten ZN-Anlage, muss es aber nicht. Es ist m\u00f6glich, dass f\u00fcr jede Betriebsstelle im Erfassungsbereich der ZN-Anlage je eine Bahnhofsnummer geplant werden kann."
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_FunktionalitaetAnzeigefeld(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Funktionalit\u00e4t des Anzeigefeldes, aus dem der Buchstabe in der Anzeigefeldbezeichnung abgeleitet wird. Anbiete_Annahmefeld: A, Meldeort: M, Spiegelfeld: S Stapelfeld: N, Voranzeigefeld: V, Wandelfeld: W. Die Anzeigefelder sind auf dem ZN-\u00dcbersichtsplan darzustellen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk 819.0731 6 "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_HOA(),
		   source,
		   new String[] {
			   "documentation", "Angabe der in dem betreffenden ZN Anzeigefeld auszuwertenden HOA (Hei\u00dfl\u00e4ufer-Ortungs-Anlage). Im Datenmodell wird nicht die Anlage selber ber\u00fccksichtigt, sondern nur deren Auswertung im ZN Anzeigefeld. Es wird auf dem ZN-\u00dcbersichtsplan an dem betreffenden ZN Anzeigefeld die Nummer der auszuwertenden HOA mit dem Zusatz \u201eNur zur Information\u201c vermerkt. DB-Regelwerk 819.0731 8 (4) "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "documentation", "Das ZN Anzeigefeld ist auf der Bedienoberfl\u00e4che sichtbar. DB-Regelwerk 819.0731 6 (19) "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung(),
		   source,
		   new String[] {
			   "documentation", "Verz\u00f6gerungszeit, bis die L\u00f6schung der Zugnummer erfolgt. Die Angabe ist bei manueller Zugnummernl\u00f6schung notwendig. Standard lt. LH sind ca. 5 min. DB-Regelwerk Das Planungsdatum ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht. "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_Vormeldestart(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob aus diesem ZN Anzeigefeld eine Vormeldung generiert wird Sofern aus dem ZN_Anzeigefeld eine Vormeldung generiert wird, ist die entsprechende Richtung anzugeben. Wird keine Vormelduing generiert, erfolgt in dem Attribut keine Angabe. DB-Regelwerk In der Ril 819.0731 sind zur Vormeldung keine Aussagen getroffen. Bisher erfolgen die notwendigen Angaben regionalbereichsspezifisch als Symbol und/oder Text mit/ohne Beschreibung konkreter Vormeldebedingungen."
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_ZNAnzeigefeldLoeschkriterium(),
		   source,
		   new String[] {
			   "documentation", "Angabe des Kriteriums, mit dem die Zugnummer aus dem ZN Anzeigefeld gel\u00f6scht wird. Das Kriterium wird vorrangig f\u00fcr ZN-Anzeigefelder an der Grenze der eigenen zur benachbarten ZN-Anlage angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk 819.0731 7 (4) enth\u00e4lt nur eine allgemeine Aussage. Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der Abstimmung zwischen LST-Fachplaner und Betreiber."
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige(),
		   source,
		   new String[] {
			   "documentation", "Im ZN Anzeigefeld erfolgt keine Anzeige einer Zugnummer. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung(),
		   source,
		   new String[] {
			   "documentation", "In diesem ZN-Anzeigefeld ist eine Zugvorbereitungsmeldung im ZN-\u00dcbersichtsplan zu kennzeichnen; die ZN-Anlage enth\u00e4lt keine ZFM-Funktionalit\u00e4t. Im Regelwerk wird dieses Planungsdatum historisch bedingt als \\\"Zugfertigmeldung\\\" bezeichnet. DB-Regelwerk 819.0731 6 (23) "
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei(),
		   source,
		   new String[] {
			   "documentation", "Angabe des ESTW-Bedienbezeichners als Texteingabe, Im Regelfall entspricht der Bedienbezeichner des ZN_Anzeigefeldes dem des zugeh\u00f6rigen Gleisfreimeldeabschnitts, in dem das ZN_Anzeigefeld angeordnet wird. Falls abweichend vom Regelfall nicht die Bezeichnung des Gleisfreimeldeabschnitts angewendet werden kann oder wird, ist eine Bezeichnung als Freitext festzulegen. DB-Regelwerk 819.0731"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABezeichner(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Anzeigefeldbezeichnung als numerischer Wert. Als Bezeichnung ist eine ZN-Gleisnummer festzulegen, die f\u00fcr den Bereich der ZN-Anlage eindeutig sein muss. Die Bezeichnung (ZN-Gleisnummer) sollte aus der Gleisbezeichnung des ESTW hergeleitet werden. Spiegelfelder werden wie das gespiegelte Anzeigefeld bezeichnet. Anbiete-/Annahme sowie Voranzeigefelder erhalten eine Bezeichnung, die eine Zuordnung zum ZN Anzeigefeld im zugeh\u00f6rigen Gleisabschnitt erkennen l\u00e4sst. Das Attribut dient der eindeutigen Erkennung des ZN-Anzeigefeldes auf dem ZLV-Bus und wird daher auch \u201eZLV-Bus-Bezeichner\u201c genannt. DB-Regelwerk 819.0731 6 (14) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Ausfahrdruck(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Ausfahrt eines Zuges. Im ZN Anzeigefeld wird ein Druck nach Ausfahrt des Zuges generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_AusfahrdruckGegengleis(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Ausfahrt des Zuges ins Gegengleis. Im ZN Anzeigefeld wird ein Druck nach Ausfahrt des Zuges ins Gegengleis generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Durchfahrdruck(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Durchfahrt des Zuges. Im ZN Anzeigefeld wird ein Druck nach Durchfahrt des Zuges (z. B. nach Passieren eines Bahnhofsteils) generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Einfahrdruck(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Einfahrt des Zuges. Im ZN Anzeigefeld wird ein Druck nach Einfahrt des Zuges in den Bahnhof generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_EinfahrdruckGegengleis(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Einfahrt des Zuges aus dem Gegengleis. Im ZN Anzeigefeld wird ein Druck nach Einfahrt des Zuges aus dem Gegengleis in den Bahnhof generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Meldedruck(),
		   source,
		   new String[] {
			   "documentation", "Druck nach Fortschaltung der Zugnummer. Im ZN Anzeigefeld wird ein Druck nach Fortschaltung der Zugnummer generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enth\u00e4lt keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und sp\u00e4terem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_BesonderesSchaltkriterium(),
		   source,
		   new String[] {
			   "documentation", "Angabe von besonderen Fortschaltkriterien f\u00fcr die Zugnummernfortschaltung als Kommentar. Die Angabe kann auch in Verbindung mit dem Attribut ZN Schaltkriterium erfolgen; z. B. \\\"positive Stellbarkeitspr\u00fcfung Signal xy\\\". DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf dazu der Abstimmung zwischen LST-Fachplaner und Betreiber."
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_IDFortschaltungStart(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Startelement, von dem fortgeschaltet wird. Aus Start und Ziel l\u00e4sst sich eine Fortschaltrichtung ableiten. DB-Regelwerk 819.0731 6 (15) 819.0731 6 (16) 819.0731 6 (17) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung(),
		   source,
		   new String[] {
			   "documentation", "Bei Fortschaltung wird die Sendung des Telegramms wiederholt. Falls keine Telegrammwiederholung erfolgt, wird das Attribut nicht bef\u00fcllt. DB-Regelwerk 819.0731 6 (21) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_ZNSchaltkriterium(),
		   source,
		   new String[] {
			   "documentation", "Kriterium zur Fortschaltung der Zugnummer. Die Angabe eines ZN-Fortschaltkriteriums erfolgt, sofern es nicht Funktionalit\u00e4t der Anlage ist (ENUM-Wert \u201ekein\u201c). Firmenspezifische Besonderheiten nach Ril 819.0731A03 sind zu beachten. Das Kriterium \\\"Signalhaltfall\\\" beinhaltet neben Haltstellung von Hauptsignalen auch das Erl\u00f6schen von Kennlicht, Sh1, Ersatz- bzw. Vorsichtssignalen. Diese sind im ESTW Stellwerksfunktionalit\u00e4t und werden nicht explizit geplant. Das Kriterium der Haltstellung von virtuellen Signalen (Anwendung bei ETCS) wird zu einem sp\u00e4teren Zeitpunkt im Modell ber\u00fccksichtigt. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Ril 819.0731A03 "
		   });
		addAnnotation
		  (zN_Fortschalt_KriteriumEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt, welches die funktionellen ZN-Fortschaltkriterien beschreibt. Die Attributgruppe ZN_Fortschalt_Krit_Druck wird nur angelegt, wenn aus dem Fortschaltkriterium ein Druck erzeugt wird. DB-Regelwerk 819.0731 6 (16) und (17) "
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, zu der das Fortschaltkriterium geh\u00f6rt. "
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZNFortschaltKritStart(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das ZN Anzeigefeld in der Bedienoberfl\u00e4che, von dem aus die Zugnummer fortgeschaltet wird. "
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZNFortschaltKritZiel(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das ZN Anzeigefeld in der Bedienoberfl\u00e4che, in das die Zugnummer fortgeschaltet wird. Die Angabe erfolgt nur bei besonderen Schaltkriterien. Eine Fortschaltung ist in mehrere Richtungen m\u00f6glich."
		   });
		addAnnotation
		  (zN_Telegramm_84_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Logisches Objekt, welches die Verbindung zwischen ZN und ggf. der einzelnen Fahrstra\u00dfe herstellt, f\u00fcr die das Telegramm 84 gesendet werden soll. Herstellerbezogen kann die Sendung des Telegramms 84 f\u00fcr jede einzelne Fahrstra\u00dfe oder nur f\u00fcr alle Fahrstra\u00dfen programmiert werden. DB-Regelwerk 819.0731A02 1 (5) "
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, von der das Telegramm 84 generiert und auf den ZLV-Bus gesandt wird. "
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_Telegramm84Verzicht(),
		   source,
		   new String[] {
			   "documentation", "Verzicht auf Sendung des Telegramms 84. Bei Bedienung der HaGT wird das Telegramm unabh\u00e4ngig von der Projektierung des Verzichts gesendet."
		   });
		addAnnotation
		  (zN_Telegramm_85_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Logisches Objekt, welches die Verbindung zwischen ZN und ggf. der einzelnen Fahrstra\u00dfe herstellt, f\u00fcr die das Telegramm 85 gesendet werden soll. Herstellerbezogen kann die Sendung des Telegramms 85 f\u00fcr jede einzelne Fahrstra\u00dfe oder nur f\u00fcr alle Fahrstra\u00dfen programmiert werden. DB-Regelwerk 819.0731A02 1 (5) "
		   });
		addAnnotation
		  (getZN_Telegramm_85_Zuordnung_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, von der das Telegramm 85 generiert und auf den ZLV-Bus gesandt wird. "
		   });
		addAnnotation
		  (zN_UnterstationEClass,
		   source,
		   new String[] {
			   "documentation", "Verbindung zwischen ZN und ZLV Bus und/oder ZN ZBS. \u00dcber Modems wird die ZN an einen oder mehrere ZLV-Busse und ggf. an eine ZBS (Verbindung zu einer Bedien Zentrale) angebunden. Die Attributgruppe ZN_Unterstation_Bf_Nr kann mehrfach eingebunden werden. Damit werden alle Betriebsstellen, die ZN-seitig \u00fcber diese Unterstation verwaltet bzw \\\"angesprochen\\\" werden, beschrieben. Der ZN-seitigen Bahnhofsnummer wird eine \u00d6rtlichkeit (Ril-100-Bezeichner der zugewiesenen Betriebsstelle) und ggf. eine Priorit\u00e4t zugeordnet. Letztere wird nur f\u00fcr diejenige Bahnhosnummer angegeben, die f\u00fcr die Kommunikation der ZN_Unterstation mit dem ZLV-Bus ma\u00dfgebend ist. In allen anderen F\u00e4llen wird das Attribut nicht bef\u00fcllt. Die Darstellung erfolgt auf dem ZLV-Bus-\u00dcbersichtsplan als tabellarischer Block mit den Zeilen \\u0026lt;Bf-Nr\\u0026gt; \\u0026lt;Oertlichkeit_Abkuerzung\\u0026gt; in dem Symbol f\u00fcr die ZN_Unterstation. Die Bahnhofsnummer mit Priorit\u00e4t wird direkt neben dem ZLV-Bus-Anschluss angeordnet. DB-Regelwerk 819.0731 5 Die Darstellung der Angaben erfolgt im ZLV-Bus-\u00dcbersichtsplan nach 819.0731 A01 "
		   });
		addAnnotation
		  (getZN_Unterstation_IDZNZBS(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID der zugeh\u00f6rigen ZLV-Bus-Sammelleitung (ZBS), sofern diese vorhanden ist. "
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_BfKennung(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Bahnhofskennung. Die erste Ziffer gibt die Basis f\u00fcr die Bestimmung der Fehlnummernbereiche an (2 = 20, 5 = 50). In BZ-Bereichen kann die Vergabe von gleichen Bahnhofsadressen nicht ausgeschlossen werden. Es sind daher Bereiche mit eindeutiger Bahnhofsadresse festzulegen und zur Unterscheidung von Nachbarbereichen mit einer Bahnhofskennung zu markieren. Die Fehlnummernbereiche werden automatisch in Abh\u00e4ngigkeit der Bahnhofskennung gebildet (siehe Ril 819.0731A03 (3)). Dies gilt f\u00fcr alle Bauarten der ZN. DB-Regelwerk 819.0731A03 (3) "
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_Koppelunterstation(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob es sich um eine Koppelunterstation handelt. Bei einer Koppelunterstation treffen ein oder mehrere ZLV-Bus-Leitungen sowie eine ZBS zusammen. Eine Koppelunterstation hat somit immer eine Anbindung an die Betriebszentrale (BZ). Eine Unterstation hat eine oder mehrere Anbindung(en) an einen ZLV-Bus. DB-Regelwerk F\u00fcr das Planungsdatum gibt es im Regelwerk der DB AG keine konkrete Vorgabe. Die Art der Unterstation ergibt sich aus dem ZLV-Bus-Konzept, welches die DB AG erstellt. 819.0731 5 (17). Koppelunterstationen erhalten eine ZBS-Anbindung. 819.0731 8 (1), 819.0731 8 (2), 819.0731 9 (7), 819.0731 A05. "
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_KUsZeittelegramm(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob die Koppelunterstation (KUs) zur Zeitsynchronisation ein Zeittelegramm auf den ZLV-Bus sendet (true) oder nicht (false). Sind zwei\nKUs an einem ZLV-Bus angeschlossen, so darf jeweils nur eine KUs ein Zeittelegramm auf den ZLV-Bus senden. DB-Regelwerk 819.0731 5 (22)"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse(),
		   source,
		   new String[] {
			   "documentation", "Angabe der ZBS-Adresse (KUs-Kennung) f\u00fcr die Koppelunterstation. Bei einer MUs (Mehrfachunterstation) bzw. Us (Unterstation) wird das Attribut nicht gef\u00fcllt. Die Angabe erfolgt hexadezimal. DB-Regelwerk 819.0731 5 (16) "
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZBSAnbindung(),
		   source,
		   new String[] {
			   "documentation", "Die Unterstation erh\u00e4lt eine ZBS-Anbindung. DB-Regelwerk 819.0731 8 (1) 819.0731 8 (2) 819.0731 9 (7) 819.0731A05 "
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob eine Zeitsynchronisation \u00fcber Funkuhr zu projektieren is (true). Bei Benutzung der Funkuhr darf keine Zeitsynchronisation \u00fcber den ZLV-Bus (Telegramm 80) oder \u00fcber Network-Time-Protocol (ntp) erfolgen. Der Wert \\\"false\\\" wird nicht verwendet. DB-Regelwerk Ril 819.0731 2 (4)"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Bahnhofsnummer zur eindeutigen Identifikation einer Betriebsstelle auf dem ZLV-Bus. Die Bahnhofsnummer muss im Bereich der angrenzenden ZLV-Busse eindeutig sein. Bei der Verwendung von Bahnhosnummern in Bereichen mit (Koppel-/Mehrfach-)Unterstation (siehe ZN Unterstation Art) sind besondere Randbedingungen zu beachten. DB-Regelwerk 819.0731 5 (3) 819.0731 5 (4) Bei Bereichen mit (K/M)-Unterstationen: 819.0731 5 (5) - (7)"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlichkeit, die einer Bahnhofsnummer zugeordnet ist, welche zus\u00e4tzlich von der ZN_Unterstation verwaltet wird. Es ist der Wert \\\"Oertlichkeit_Abkuerzung\\\" zu verwenden. "
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_Prioritaet(),
		   source,
		   new String[] {
			   "documentation", "Angabe der ma\u00dfgebenden Bahnhofsnummer der ZN Unterstation Das Attribut wird nur f\u00fcr diejenige Bahnhofsnummer mit \\\"1\\\" bef\u00fcllt, welche f\u00fcr die Kommunikation der ZN_Unterstation mit dem ZLV Bus ma\u00dfgebend ist. In allen \u00fcbrigen F\u00e4llen wird das Attribut nicht bef\u00fcllt. DB-Regelwerk Das Planungsdatum hat keine Entsprechung im Regelwerk. Es findet zeichnerisch Anwendung auf dem ZLV-Bus-\u00dcbersichtsplan einzelner Regionen."
		   });
		addAnnotation
		  (zN_ZBSEClass,
		   source,
		   new String[] {
			   "documentation", "Abbildung der Parameter f\u00fcr die Anbindung einer ZN an die BZ. Der Verweis auf ID ESTW Zentraleinheit beschreibt den Ort der r\u00e4umlichen Unterbringung der Koppelunterstation. Bei der Bearbeitung im Planungstool kann es notwendig sein, bereits bei Bearbeitung im Dialogfeld ZN-ZBS den Verweis auf die ESTW_Zentraleinheit zu bef\u00fcllen. DB-Regelwerk 819.0731 6 (16) Die Darstellung der Angaben erfolgt im ZLV-Bus-\u00dcbersichtsplan nach 819.0731 A01 "
		   });
		addAnnotation
		  (getZN_ZBS_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Ort der r\u00e4umlichen Unterbringung der Koppelunterstation "
		   });
		addAnnotation
		  (getZN_ZBS_IPAdresse(),
		   source,
		   new String[] {
			   "documentation", "IP_Adresse des COM-Servers gem\u00e4\u00df Ril 819.0705. Der Planungsfall tritt ein, wenn eine ZBS-Verbindung zwischen ZN Unterstation und BZ zu planen ist. DB-Regelwerk 819.0731A05 819.0705 "
		   });
		addAnnotation
		  (getZN_ZBS_ZBSSchnittstelle(),
		   source,
		   new String[] {
			   "documentation", "Modem, welches die Verbindung zwischen ZN Unterstation und ZBS f\u00fcr die Datenkommunikation herstellt. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk 819.0731A04 2 "
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
		  (akustikdauer_Anb_Ann_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAkustikdauer_Anb_Ann",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAkustikdauer_Anb_Ann_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (akustikdauer_Sonst_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAkustikdauer_Sonst",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAkustikdauer_Sonst_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (akustikdauer_Voranz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAkustikdauer_Voranz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAkustikdauer_Voranz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anschlussnummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnschlussnummer",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (anschlussnummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnschlussnummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnschlussnummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ausfahrdruck_Gegengleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAusfahrdruck_Gegengleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAusfahrdruck_Gegengleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ausfahrdruck_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAusfahrdruck",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAusfahrdruck_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bedienbarkeit_Anzeigefeld_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedienbarkeit_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedienbarkeit_Anzeigefeld_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (besonderes_Schaltkriterium_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBesonderes_Schaltkriterium",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (besonderes_Schaltkriterium_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBesonderes_Schaltkriterium",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBesonderes_Schaltkriterium_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Besondere_Anlage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Besondere_Anlage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bezeichnung_Besondere_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Besondere_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Besondere_Anlage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bf_Kennung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBf_Kennung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBf_Kennung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bf_Nr_ANB_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBf_Nr_ANB",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBf_Nr_ANB_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bf_Nr_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBf_Nr",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "0[1-9]|[1-9][0-9]"
		   });
		addAnnotation
		  (bf_Nr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBf_Nr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBf_Nr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bf_Nr_ZN_A_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBf_Nr_ZN_A",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBf_Nr_ZN_A_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (durchfahrdruck_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDurchfahrdruck",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDurchfahrdruck_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (einfahrdruck_Gegengleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEinfahrdruck_Gegengleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinfahrdruck_Gegengleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (einfahrdruck_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEinfahrdruck",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinfahrdruck_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (einwahlstelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEinwahlstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinwahlstelle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAkustikAnbAnnEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAkustik_Anb_Ann"
		   });
		addAnnotation
		  (enumAkustikAnbAnnObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAkustik_Anb_Ann:Object",
			   "baseType", "ENUMAkustik_Anb_Ann"
		   });
		addAnnotation
		  (enumAkustikSonstEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAkustik_Sonst"
		   });
		addAnnotation
		  (enumAkustikSonstObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAkustik_Sonst:Object",
			   "baseType", "ENUMAkustik_Sonst"
		   });
		addAnnotation
		  (enumBfKennungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBf_Kennung"
		   });
		addAnnotation
		  (enumBfKennungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBf_Kennung:Object",
			   "baseType", "ENUMBf_Kennung"
		   });
		addAnnotation
		  (enumFunktionalitaetAnzeigefeldEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFunktionalitaet_Anzeigefeld"
		   });
		addAnnotation
		  (enumFunktionalitaetAnzeigefeldObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFunktionalitaet_Anzeigefeld:Object",
			   "baseType", "ENUMFunktionalitaet_Anzeigefeld"
		   });
		addAnnotation
		  (enumzbsSchnittstelleEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZBS_Schnittstelle"
		   });
		addAnnotation
		  (enumzbsSchnittstelleObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZBS_Schnittstelle:Object",
			   "baseType", "ENUMZBS_Schnittstelle"
		   });
		addAnnotation
		  (enumznAnlagentypEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZN_Anlagentyp"
		   });
		addAnnotation
		  (enumznAnlagentypObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZN_Anlagentyp:Object",
			   "baseType", "ENUMZN_Anlagentyp"
		   });
		addAnnotation
		  (enumznAnzeigefeldLoeschkriteriumEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZN_Anzeigefeld_Loeschkriterium"
		   });
		addAnnotation
		  (enumznAnzeigefeldLoeschkriteriumObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZN_Anzeigefeld_Loeschkriterium:Object",
			   "baseType", "ENUMZN_Anzeigefeld_Loeschkriterium"
		   });
		addAnnotation
		  (enumznModemEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZN_Modem"
		   });
		addAnnotation
		  (enumznModemObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZN_Modem:Object",
			   "baseType", "ENUMZN_Modem"
		   });
		addAnnotation
		  (enumznSchaltkriteriumEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZN_Schaltkriterium"
		   });
		addAnnotation
		  (enumznSchaltkriteriumObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZN_Schaltkriterium:Object",
			   "baseType", "ENUMZN_Schaltkriterium"
		   });
		addAnnotation
		  (funktionalitaet_Anzeigefeld_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFunktionalitaet_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunktionalitaet_Anzeigefeld_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoA_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHOA",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHOA_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adresse_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adresse",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "([0-9]{1,3}\\.){3}[0-9]{1,3}"
		   });
		addAnnotation
		  (iP_Adresse_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adresse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adresse_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (koppelunterstation_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKoppelunterstation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKoppelunterstation_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kUs_Zeittelegramm_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKUs_Zeittelegramm",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKUs_Zeittelegramm_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (meldedruck_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMeldedruck",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeldedruck_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (prioritaet_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPrioritaet",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (prioritaet_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPrioritaet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPrioritaet_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (reaktivierungsfunktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCReaktivierungsfunktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReaktivierungsfunktion_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (sichtbarkeit_Anzeigefeld_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSichtbarkeit_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSichtbarkeit_Anzeigefeld_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_02_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_02",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_02_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_03_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_03",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_03_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_04_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_04",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_04_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_10_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_10",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_10_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_21_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_21",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_21_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_30_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_30",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_30_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_84_Alle_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTelegramm_84_Alle_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_84_Alle_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (getTelegramm_84_Alle_Fstr_AttributeGroup_Telegramm84FuerAlleFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_84_Fuer_Alle_Fstr"
		   });
		addAnnotation
		  (telegramm_84_Einzelne_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTelegramm_84_Einzelne_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (getTelegramm_84_Einzelne_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (telegramm_84_Fuer_Alle_Fstr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_84_Fuer_Alle_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_84_Fuer_Alle_Fstr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_84_Verzicht_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_84_Verzicht",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_84_Verzicht_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegramm_85_Alle_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTelegramm_85_Alle_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_85_Alle_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (getTelegramm_85_Alle_Fstr_AttributeGroup_Telegramm85FuerAlleFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_85_Fuer_Alle_Fstr"
		   });
		addAnnotation
		  (telegramm_85_Einzelne_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTelegramm_85_Einzelne_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (getTelegramm_85_Einzelne_Fstr_AttributeGroup_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (telegramm_85_Fuer_Alle_Fstr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegramm_85_Fuer_Alle_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegramm_85_Fuer_Alle_Fstr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (telegrammwiederholung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTelegrammwiederholung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelegrammwiederholung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (unterstation_Max_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUnterstation_Max",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|[1-3][0-9]|40"
		   });
		addAnnotation
		  (unterstation_Max_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUnterstation_Max",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterstation_Max_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (unterstation_Nr_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUnterstation_Nr",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TZeichenkette",
			   "pattern", "0[1-9]|[1-3][0-9]|40"
		   });
		addAnnotation
		  (unterstation_Nr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUnterstation_Nr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterstation_Nr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (verzoegerung_Manuell_Loeschung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TVerzoegerung_Manuell_Loeschung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde"
		   });
		addAnnotation
		  (verzoegerung_Manuell_Loeschung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVerzoegerung_Manuell_Loeschung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerzoegerung_Manuell_Loeschung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (vormeldestart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVormeldestart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVormeldestart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zbS_Adresse_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZBS_Adresse",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[A-F][0-9]|[C-F][A-F]|[AB][C-F]|AB|BA"
		   });
		addAnnotation
		  (zbS_Adresse_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZBS_Adresse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZBS_Adresse_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zbS_Anbindung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZBS_Anbindung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZBS_Anbindung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zbS_Schnittstelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZBS_Schnittstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZBS_Schnittstelle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zeitsynchronisation_Funkuhr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZeitsynchronisation_Funkuhr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZeitsynchronisation_Funkuhr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zlV_BusEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getZLV_Bus_ZLVBusAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZLV_Bus_Allg"
		   });
		addAnnotation
		  (zlV_Bus_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Allg_AttributeGroup_UnterstationMax(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterstation_Max"
		   });
		addAnnotation
		  (getZLV_Bus_Allg_AttributeGroup_ZNModem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Modem"
		   });
		addAnnotation
		  (zlV_Bus_Besondere_AnlageEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_Besondere_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Besondere_Anlage_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getZLV_Bus_Besondere_Anlage_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_Besondere_Anlage_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup_BezeichnungBesondereAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Besondere_Anlage"
		   });
		addAnnotation
		  (zlV_Bus_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZLV_Bus_Nr"
		   });
		addAnnotation
		  (zlV_Bus_Nr_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZLV_Bus_Nr",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]{0,3}"
		   });
		addAnnotation
		  (zlV_Bus_Nr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZLV_Bus_Nr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Nr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zlV_Bus_US_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_US_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_IDZNUnterstation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Unterstation"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_ZLVBusUSZuordnungTelegramm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZLV_Bus_US_Zuordnung_Telegramm"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_ZLVBusZuordnungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZLV_Bus_Zuordnung_Allg"
		   });
		addAnnotation
		  (zlV_Bus_US_Zuordnung_Telegramm_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_US_Zuordnung_Telegramm",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm02(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_02"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm03(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_03"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm04(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_04"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm10(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_10"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm21(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_21"
		   });
		addAnnotation
		  (getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm30(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_30"
		   });
		addAnnotation
		  (zlV_Bus_Zuordnung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZLV_Bus_Zuordnung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZLV_Bus_Zuordnung_Allg_AttributeGroup_Anschlussnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anschlussnummer"
		   });
		addAnnotation
		  (getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterstation_Nr"
		   });
		addAnnotation
		  (znEClass,
		   source,
		   new String[] {
			   "name", "CZN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_IDAnhangZNPlanBedienraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_ZN_Plan_Bedienraum"
		   });
		addAnnotation
		  (getZN_IDAnhangZNPlanRechnerraum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_ZN_Plan_Rechnerraum"
		   });
		addAnnotation
		  (getZN_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (getZN_IDStellwerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Stellwerk"
		   });
		addAnnotation
		  (getZN_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getZN_IDZNUnterstation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Unterstation"
		   });
		addAnnotation
		  (getZN_ZNAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Allg"
		   });
		addAnnotation
		  (zN_A_Bedienbezeichner_Frei_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZN_A_Bedienbezeichner_Frei",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{4,7}"
		   });
		addAnnotation
		  (zN_A_Bedienbezeichner_Frei_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_A_Bedienbezeichner_Frei",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_A_Bedienbezeichner_Frei_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_A_Bezeichner_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZN_A_Bezeichner",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (zN_A_Bezeichner_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_A_Bezeichner",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_A_Bezeichner_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_AkustikEClass,
		   source,
		   new String[] {
			   "name", "CZN_Akustik",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Akustik_ZNAkustikAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Akustik_Anzeigefeld"
		   });
		addAnnotation
		  (getZN_Akustik_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZN_Akustik_IDZNAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Anzeigefeld"
		   });
		addAnnotation
		  (zN_Akustik_Anzeigefeld_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Akustik_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerAnbAnn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Akustikdauer_Anb_Ann"
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerSonst(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Akustikdauer_Sonst"
		   });
		addAnnotation
		  (getZN_Akustik_Anzeigefeld_AttributeGroup_AkustikdauerVoranz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Akustikdauer_Voranz"
		   });
		addAnnotation
		  (zN_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_Einwahlstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einwahlstelle"
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_Reaktivierungsfunktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Reaktivierungsfunktion"
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_ZNAnlagentyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Anlagentyp"
		   });
		addAnnotation
		  (zN_Anlagentyp_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Anlagentyp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Anlagentyp_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_AnzeigefeldEClass,
		   source,
		   new String[] {
			   "name", "CZN_Anzeigefeld",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Abschnitt"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZLVBus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZLV_Bus"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_IDZNAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Anzeigefeld"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_ZNAnzeigefeldAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Anzeigefeld_Allg"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_ZNAnzeigefeldBezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Anzeigefeld_Bezeichnung"
		   });
		addAnnotation
		  (zN_Anzeigefeld_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Anzeigefeld_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedienbarkeit_Anzeigefeld"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BfNrANB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bf_Nr_ANB"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BfNrZNA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bf_Nr_ZN_A"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_FunktionalitaetAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Funktionalitaet_Anzeigefeld"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_HOA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HOA"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sichtbarkeit_Anzeigefeld"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verzoegerung_Manuell_Loeschung"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_Vormeldestart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vormeldestart"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_ZNAnzeigefeldLoeschkriterium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Anzeigefeld_Loeschkriterium"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Feld_Ohne_Anzeige"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zugvorbereitungsmeldung"
		   });
		addAnnotation
		  (zN_Anzeigefeld_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Anzeigefeld_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_A_Bedienbezeichner_Frei"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABezeichner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_A_Bezeichner"
		   });
		addAnnotation
		  (zN_Anzeigefeld_Loeschkriterium_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Anzeigefeld_Loeschkriterium",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Loeschkriterium_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_Feld_Ohne_Anzeige_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Feld_Ohne_Anzeige",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Feld_Ohne_Anzeige_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_Fortschalt_Krit_Druck_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Fortschalt_Krit_Druck",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Ausfahrdruck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ausfahrdruck"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_AusfahrdruckGegengleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ausfahrdruck_Gegengleis"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Durchfahrdruck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Durchfahrdruck"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Einfahrdruck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einfahrdruck"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_EinfahrdruckGegengleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einfahrdruck_Gegengleis"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Druck_AttributeGroup_Meldedruck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Meldedruck"
		   });
		addAnnotation
		  (zN_Fortschalt_Krit_Schalt_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Fortschalt_Krit_Schalt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_BesonderesSchaltkriterium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Besonderes_Schaltkriterium"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_IDFortschaltungStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fortschaltung_Start"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegrammwiederholung"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_ZNSchaltkriterium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Schaltkriterium"
		   });
		addAnnotation
		  (zN_Fortschalt_KriteriumEClass,
		   source,
		   new String[] {
			   "name", "CZN_Fortschalt_Kriterium",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZNFortschaltKritStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Fortschalt_Krit_Start"
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_IDZNFortschaltKritZiel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Fortschalt_Krit_Ziel"
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_ZNFortschaltKritDruck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Fortschalt_Krit_Druck"
		   });
		addAnnotation
		  (getZN_Fortschalt_Kriterium_ZNFortschaltKritSchalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Fortschalt_Krit_Schalt"
		   });
		addAnnotation
		  (zN_Modem_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Modem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Modem_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_Schaltkriterium_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Schaltkriterium",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Schaltkriterium_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zN_Telegramm_84_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CZN_Telegramm_84_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_Telegramm84AlleFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_84_Alle_Fstr"
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_Telegramm84EinzelneFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_84_Einzelne_Fstr"
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_Telegramm84Verzicht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_84_Verzicht"
		   });
		addAnnotation
		  (zN_Telegramm_85_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CZN_Telegramm_85_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Telegramm_85_Zuordnung_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZN_Telegramm_85_Zuordnung_Telegramm85AlleFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_85_Alle_Fstr"
		   });
		addAnnotation
		  (getZN_Telegramm_85_Zuordnung_Telegramm85EinzelneFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Telegramm_85_Einzelne_Fstr"
		   });
		addAnnotation
		  (zN_UnterstationEClass,
		   source,
		   new String[] {
			   "name", "CZN_Unterstation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Unterstation_IDZNZBS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_ZBS"
		   });
		addAnnotation
		  (getZN_Unterstation_ZNUnterstationAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Unterstation_Allg"
		   });
		addAnnotation
		  (zN_Unterstation_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Unterstation_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_BfKennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bf_Kennung"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_Koppelunterstation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Koppelunterstation"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_KUsZeittelegramm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "KUs_Zeittelegramm"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZBS_Adresse"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZBSAnbindung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZBS_Anbindung"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeitsynchronisation_Funkuhr"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZNUnterstationBfNr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Unterstation_Bf_Nr"
		   });
		addAnnotation
		  (zN_Unterstation_Bf_Nr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZN_Unterstation_Bf_Nr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bf_Nr"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_Prioritaet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Prioritaet"
		   });
		addAnnotation
		  (zN_ZBSEClass,
		   source,
		   new String[] {
			   "name", "CZN_ZBS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_ZBS_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ESTW_Zentraleinheit"
		   });
		addAnnotation
		  (getZN_ZBS_IPAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adresse"
		   });
		addAnnotation
		  (getZN_ZBS_ZBSSchnittstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZBS_Schnittstelle"
		   });
		addAnnotation
		  (zugvorbereitungsmeldung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZugvorbereitungsmeldung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugvorbereitungsmeldung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (zlV_BusEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZLV_Bus_Allg_AttributeGroup_UnterstationMax(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..40] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (zlV_Bus_Besondere_AnlageEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZLV_Bus_Bezeichnung_AttributeGroup_ZLVBusNr(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..9999] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (zlV_Bus_US_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [01..40] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (znEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (zN_AkustikEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZN|ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZN_Allg_AttributeGroup_Einwahlstelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (zN_AnzeigefeldEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_BedienbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_SichtbarkeitAnzeigefeld(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_VerzoegerungManuellLoeschung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>300</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_ZNFeldOhneAnzeige(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Allg_AttributeGroup_Zugvorbereitungsmeldung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[4..7]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (zN_Fortschalt_KriteriumEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (zN_Telegramm_84_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZN_Telegramm_84_Zuordnung_Telegramm84Verzicht(),
		   source,
		   new String[] {
			   "appinfo", "\n                             \n  <ppi:WorkflowInformation>\n                                  \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                               \n  </ppi:WorkflowInformation>\n                          \n"
		   });
		addAnnotation
		  (zN_Telegramm_85_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (zN_UnterstationEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_BfKennung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0..4] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [A0..FF] hexadezimal, ohne AA und BB </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[01..99]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (zN_ZBSEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ZLV-Bus</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZN_ZBS_IPAdresse(),
		   source,
		   new String[] {
			   "appinfo", "\n                             \n  <ppi:WorkflowInformation>\n                                  \n    <ppi:Patternbeschreibung> [7..15] gebildet aus vier maximal dreistelligen Zahlen, getrennt durch Punkte </ppi:Patternbeschreibung>\n                               \n  </ppi:WorkflowInformation>\n                          \n"
		   });
	}

} //ZugnummernmeldeanlagePackageImpl
