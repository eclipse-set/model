/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

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

import org.eclipse.set.model.model11001.ATO.ATOPackage;

import org.eclipse.set.model.model11001.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model11001.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model11001.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model11001.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

import org.eclipse.set.model.model11001.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.model11001.Block.BlockPackage;

import org.eclipse.set.model.model11001.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model11001.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model11001.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model11001.Geodaten.Anzeigegefuehrt_ES_Kategorie_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Bezeichnung_Strecke_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Bremsweg_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.ENUMGEOForm;
import org.eclipse.set.model.model11001.Geodaten.ENUMGEOKoordinatensystem;
import org.eclipse.set.model.model11001.Geodaten.ENUMHSystem;
import org.eclipse.set.model.model11001.Geodaten.ENUMHoehenlinieForm;
import org.eclipse.set.model.model11001.Geodaten.ENUMOertlichkeitArt;
import org.eclipse.set.model.model11001.Geodaten.ENUMPlanQuelle;
import org.eclipse.set.model.model11001.Geodaten.ENUMStreckeRichtung;
import org.eclipse.set.model.model11001.Geodaten.ENUMTBArt;
import org.eclipse.set.model.model11001.Geodaten.ENUMTOPAnschluss;
import org.eclipse.set.model.model11001.Geodaten.ENUMTPArt;
import org.eclipse.set.model.model11001.Geodaten.ENUMUeberhoehungslinieForm;
import org.eclipse.set.model.model11001.Geodaten.ENUMVProfilArt;
import org.eclipse.set.model.model11001.Geodaten.GEO_Form_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_KAD_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Kante;
import org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.GEO_Knoten;
import org.eclipse.set.model.model11001.Geodaten.GEO_Koordinatensystem_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_PAD_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Punkt;
import org.eclipse.set.model.model11001.Geodaten.GEO_Punkt_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.GEO_Radius_A_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Radius_B_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Richtungswinkel_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GK_X_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GK_Y_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GK_Z_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GeodatenFactory;
import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model11001.Geodaten.Geschwindigkeit_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Geschwindigkeitsprofil;
import org.eclipse.set.model.model11001.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.HSystem_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Hoehenlinie;
import org.eclipse.set.model.model11001.Geodaten.Hoehenlinie_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Hoehenlinie_Form_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Hoehenlinie_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt;
import org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt_Datum_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Hoehenpunkt_Hoehe_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Kantenname_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Knotenname_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Neigung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Abkuerzung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Art_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Gueltig_Ab_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Gueltig_Bis_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Kurzname_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Oertlichkeit_Langname_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Plan_Quelle_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Strecke;
import org.eclipse.set.model.model11001.Geodaten.Strecke_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Strecke_Bremsweg;
import org.eclipse.set.model.model11001.Geodaten.Strecke_Meter_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Strecke_Punkt;
import org.eclipse.set.model.model11001.Geodaten.Strecke_Richtung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TB_Art_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TB_Beschreibung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TOP_Anschluss_A_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TOP_Anschluss_B_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TOP_Kante;
import org.eclipse.set.model.model11001.Geodaten.TOP_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.TOP_Knoten;
import org.eclipse.set.model.model11001.Geodaten.TOP_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TP_Art_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.TP_Beschreibung_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Technischer_Bereich;
import org.eclipse.set.model.model11001.Geodaten.Technischer_Punkt;
import org.eclipse.set.model.model11001.Geodaten.Trasse_Kante_child_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehung;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehung_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehung_Datum_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehung_Hoehe_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Form_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Ueberhoehungslinie_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.V_Profil_Art_TypeClass;

import org.eclipse.set.model.model11001.Geodaten.util.GeodatenValidator;

import org.eclipse.set.model.model11001.Gleis.GleisPackage;

import org.eclipse.set.model.model11001.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.model11001.Layoutinformationen.impl.LayoutinformationenPackageImpl;

import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.model11001.Nahbedienung.impl.NahbedienungPackageImpl;

import org.eclipse.set.model.model11001.Ortung.OrtungPackage;

import org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model11001.PZB.PZBPackage;

import org.eclipse.set.model.model11001.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;

import org.eclipse.set.model.model11001.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model11001.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model11001.Signale.SignalePackage;

import org.eclipse.set.model.model11001.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model11001.Verweise.VerweisePackage;

import org.eclipse.set.model.model11001.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeodatenPackageImpl extends EPackageImpl implements GeodatenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anzeigegefuehrt_ES_Kategorie_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Strecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bremsweg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Form_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_KAD_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Kante_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_KnotenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Koordinatensystem_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_PAD_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_PunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Punkt_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Radius_A_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Radius_B_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geO_Richtungswinkel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeitsprofilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeitsprofil_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gK_X_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gK_Y_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gK_Z_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenlinieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenlinie_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenlinie_Form_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenlinie_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenpunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenpunkt_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenpunkt_Datum_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoehenpunkt_Hoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSystem_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kantenname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knotenname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Abkuerzung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Gueltig_Ab_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Gueltig_Bis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Kurzname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oertlichkeit_Langname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plan_Quelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streckeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_BremswegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Meter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_PunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Richtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tB_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tB_Beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technischer_BereichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technischer_PunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_Anschluss_A_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_Anschluss_B_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_Kante_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_KnotenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toP_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tP_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tP_Beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_Kante_child_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehung_Datum_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehung_Hoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehungslinieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehungslinie_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehungslinie_Form_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberhoehungslinie_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Profil_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgeoFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgeoKoordinatensystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumHoehenlinieFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumhSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOertlichkeitArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlanQuelleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStreckeRichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumtbArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumtopAnschlussEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumtpArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUeberhoehungslinieFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumvProfilArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anzeigegefuehrt_ES_Kategorie_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Strecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumeration1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgeoFormObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgeoKoordinatensystemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumHoehenlinieFormObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumhSystemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumOertlichkeitArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPlanQuelleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStreckeRichtungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumtbArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumtopAnschlussObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumtpArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUeberhoehungslinieFormObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumvProfilArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_KAD_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_PAD_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_Radius_A_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_Radius_B_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geO_Richtungswinkel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gK_X_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gK_Y_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gK_Z_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hoehenlinie_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hoehenpunkt_Hoehe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kantenname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType knotenname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType neigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oertlichkeit_Abkuerzung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oertlichkeit_Kurzname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oertlichkeit_Langname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strecke_Meter_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tB_Beschreibung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType toP_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tP_Beschreibung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ueberhoehung_Hoehe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ueberhoehungslinie_Laenge_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeodatenPackageImpl() {
		super(eNS_URI, GeodatenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeodatenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeodatenPackage init() {
		if (isInited) return (GeodatenPackage)EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeodatenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeodatenPackageImpl theGeodatenPackage = registeredGeodatenPackage instanceof GeodatenPackageImpl ? (GeodatenPackageImpl)registeredGeodatenPackage : new GeodatenPackageImpl();

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
		theGeodatenPackage.createPackageContents();
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
		theGeodatenPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGeodatenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return GeodatenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGeodatenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeodatenPackage.eNS_URI, theGeodatenPackage);
		return theGeodatenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnzeigegefuehrt_ES_Kategorie_TypeClass() {
		return anzeigegefuehrt_ES_Kategorie_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnzeigegefuehrt_ES_Kategorie_TypeClass_Wert() {
		return (EAttribute)anzeigegefuehrt_ES_Kategorie_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Strecke_TypeClass() {
		return bezeichnung_Strecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Strecke_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Strecke_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBremsweg_TypeClass() {
		return bremsweg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBremsweg_TypeClass_Wert() {
		return (EAttribute)bremsweg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Form_TypeClass() {
		return geO_Form_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Form_TypeClass_Wert() {
		return (EAttribute)geO_Form_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_KAD_TypeClass() {
		return geO_KAD_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_KAD_TypeClass_Wert() {
		return (EAttribute)geO_KAD_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Kante() {
		return geO_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_GEOKanteAllg() {
		return (EReference)geO_KanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_IDGEOArt() {
		return (EReference)geO_KanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_IDGEOKnotenA() {
		return (EReference)geO_KanteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_IDGEOKnotenB() {
		return (EReference)geO_KanteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Kante_Allg_AttributeGroup() {
		return geO_Kante_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEOForm() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEOKAD() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEOLaenge() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEORadiusA() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEORadiusB() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Kante_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)geO_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Knoten() {
		return geO_KnotenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Knoten_GEOPAD() {
		return (EReference)geO_KnotenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Koordinatensystem_TypeClass() {
		return geO_Koordinatensystem_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Koordinatensystem_TypeClass_Wert() {
		return (EAttribute)geO_Koordinatensystem_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Laenge_TypeClass() {
		return geO_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Laenge_TypeClass_Wert() {
		return (EAttribute)geO_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_PAD_TypeClass() {
		return geO_PAD_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_PAD_TypeClass_Wert() {
		return (EAttribute)geO_PAD_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Punkt() {
		return geO_PunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_GEOPunktAllg() {
		return (EReference)geO_PunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_IDGEOKante() {
		return (EReference)geO_PunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_IDGEOKnoten() {
		return (EReference)geO_PunktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Punkt_Allg_AttributeGroup() {
		return geO_Punkt_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatensystem() {
		return (EReference)geO_Punkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_Allg_AttributeGroup_GKX() {
		return (EReference)geO_Punkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_Allg_AttributeGroup_GKY() {
		return (EReference)geO_Punkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_Allg_AttributeGroup_GKZ() {
		return (EReference)geO_Punkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEO_Punkt_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)geO_Punkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Radius_A_TypeClass() {
		return geO_Radius_A_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Radius_A_TypeClass_Wert() {
		return (EAttribute)geO_Radius_A_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Radius_B_TypeClass() {
		return geO_Radius_B_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Radius_B_TypeClass_Wert() {
		return (EAttribute)geO_Radius_B_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEO_Richtungswinkel_TypeClass() {
		return geO_Richtungswinkel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGEO_Richtungswinkel_TypeClass_Wert() {
		return (EAttribute)geO_Richtungswinkel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeit_TypeClass() {
		return geschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschwindigkeit_TypeClass_Wert() {
		return (EAttribute)geschwindigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeitsprofil() {
		return geschwindigkeitsprofilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg() {
		return (EReference)geschwindigkeitsprofilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeitsprofil_Allg_AttributeGroup() {
		return geschwindigkeitsprofil_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_AnzeigegefuehrtESKategorie() {
		return (EReference)geschwindigkeitsprofil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit() {
		return (EReference)geschwindigkeitsprofil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt() {
		return (EReference)geschwindigkeitsprofil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGK_X_TypeClass() {
		return gK_X_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGK_X_TypeClass_Wert() {
		return (EAttribute)gK_X_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGK_Y_TypeClass() {
		return gK_Y_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGK_Y_TypeClass_Wert() {
		return (EAttribute)gK_Y_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGK_Z_TypeClass() {
		return gK_Z_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGK_Z_TypeClass_Wert() {
		return (EAttribute)gK_Z_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenlinie() {
		return hoehenlinieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_HoehenlinieAllg() {
		return (EReference)hoehenlinieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_IDHoehenpunktA() {
		return (EReference)hoehenlinieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_IDHoehenpunktB() {
		return (EReference)hoehenlinieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenlinie_Allg_AttributeGroup() {
		return hoehenlinie_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm() {
		return (EReference)hoehenlinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge() {
		return (EReference)hoehenlinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenlinie_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)hoehenlinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenlinie_Form_TypeClass() {
		return hoehenlinie_Form_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHoehenlinie_Form_TypeClass_Wert() {
		return (EAttribute)hoehenlinie_Form_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenlinie_Laenge_TypeClass() {
		return hoehenlinie_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHoehenlinie_Laenge_TypeClass_Wert() {
		return (EAttribute)hoehenlinie_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenpunkt() {
		return hoehenpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_HoehenpunktAllg() {
		return (EReference)hoehenpunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenpunkt_Allg_AttributeGroup() {
		return hoehenpunkt_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_GEOPAD() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_HSystem() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_Neigung() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHoehenpunkt_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)hoehenpunkt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenpunkt_Datum_TypeClass() {
		return hoehenpunkt_Datum_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHoehenpunkt_Datum_TypeClass_Wert() {
		return (EAttribute)hoehenpunkt_Datum_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHoehenpunkt_Hoehe_TypeClass() {
		return hoehenpunkt_Hoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHoehenpunkt_Hoehe_TypeClass_Wert() {
		return (EAttribute)hoehenpunkt_Hoehe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSystem_TypeClass() {
		return hSystem_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHSystem_TypeClass_Wert() {
		return (EAttribute)hSystem_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKantenname_TypeClass() {
		return kantenname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKantenname_TypeClass_Wert() {
		return (EAttribute)kantenname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnotenname_TypeClass() {
		return knotenname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKnotenname_TypeClass_Wert() {
		return (EAttribute)knotenname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeigung_TypeClass() {
		return neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeigung_TypeClass_Wert() {
		return (EAttribute)neigung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit() {
		return oertlichkeitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Bezeichnung() {
		return (EReference)oertlichkeitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_IDOertlichkeit() {
		return (EReference)oertlichkeitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_IDOertlichkeitAwanstBedient() {
		return (EReference)oertlichkeitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_IDStreckePunkt() {
		return (EReference)oertlichkeitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_OertlichkeitAllg() {
		return (EReference)oertlichkeitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Abkuerzung_TypeClass() {
		return oertlichkeit_Abkuerzung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Abkuerzung_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Abkuerzung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Allg_AttributeGroup() {
		return oertlichkeit_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt() {
		return (EReference)oertlichkeit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb() {
		return (EReference)oertlichkeit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis() {
		return (EReference)oertlichkeit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Art_TypeClass() {
		return oertlichkeit_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Art_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Bezeichnung_AttributeGroup() {
		return oertlichkeit_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung() {
		return (EReference)oertlichkeit_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname() {
		return (EReference)oertlichkeit_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname() {
		return (EReference)oertlichkeit_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Gueltig_Ab_TypeClass() {
		return oertlichkeit_Gueltig_Ab_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Gueltig_Ab_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Gueltig_Ab_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Gueltig_Bis_TypeClass() {
		return oertlichkeit_Gueltig_Bis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Gueltig_Bis_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Gueltig_Bis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Kurzname_TypeClass() {
		return oertlichkeit_Kurzname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Kurzname_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Kurzname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOertlichkeit_Langname_TypeClass() {
		return oertlichkeit_Langname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlichkeit_Langname_TypeClass_Wert() {
		return (EAttribute)oertlichkeit_Langname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlan_Quelle_TypeClass() {
		return plan_Quelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlan_Quelle_TypeClass_Wert() {
		return (EAttribute)plan_Quelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke() {
		return streckeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Bezeichnung() {
		return (EReference)streckeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Bezeichnung_AttributeGroup() {
		return strecke_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke() {
		return (EReference)strecke_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Bremsweg() {
		return strecke_BremswegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Bremsweg_Bremsweg() {
		return (EReference)strecke_BremswegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Bremsweg_StreckeRichtung() {
		return (EReference)strecke_BremswegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Meter_TypeClass() {
		return strecke_Meter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Meter_TypeClass_Wert() {
		return (EAttribute)strecke_Meter_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Punkt() {
		return strecke_PunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Punkt_IDGEOKnoten() {
		return (EReference)strecke_PunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Punkt_IDStrecke() {
		return (EReference)strecke_PunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrecke_Punkt_StreckeMeter() {
		return (EReference)strecke_PunktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Richtung_TypeClass() {
		return strecke_Richtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Richtung_TypeClass_Wert() {
		return (EAttribute)strecke_Richtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTB_Art_TypeClass() {
		return tB_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTB_Art_TypeClass_Wert() {
		return (EAttribute)tB_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTB_Beschreibung_TypeClass() {
		return tB_Beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTB_Beschreibung_TypeClass_Wert() {
		return (EAttribute)tB_Beschreibung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnischer_Bereich() {
		return technischer_BereichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnischer_Bereich_TBArt() {
		return (EReference)technischer_BereichEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnischer_Bereich_TBBeschreibung() {
		return (EReference)technischer_BereichEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnischer_Punkt() {
		return technischer_PunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnischer_Punkt_TPArt() {
		return (EReference)technischer_PunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnischer_Punkt_TPBeschreibung() {
		return (EReference)technischer_PunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Anschluss_A_TypeClass() {
		return toP_Anschluss_A_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOP_Anschluss_A_TypeClass_Wert() {
		return (EAttribute)toP_Anschluss_A_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Anschluss_B_TypeClass() {
		return toP_Anschluss_B_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOP_Anschluss_B_TypeClass_Wert() {
		return (EAttribute)toP_Anschluss_B_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Kante() {
		return toP_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_IDTOPKnotenA() {
		return (EReference)toP_KanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_IDTOPKnotenB() {
		return (EReference)toP_KanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_TOPKanteAllg() {
		return (EReference)toP_KanteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Kante_Allg_AttributeGroup() {
		return toP_Kante_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_Allg_AttributeGroup_Kantenname() {
		return (EReference)toP_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA() {
		return (EReference)toP_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB() {
		return (EReference)toP_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Kante_Allg_AttributeGroup_TOPLaenge() {
		return (EReference)toP_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Knoten() {
		return toP_KnotenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Knoten_IDGEOKnoten() {
		return (EReference)toP_KnotenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOP_Knoten_Knotenname() {
		return (EReference)toP_KnotenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOP_Laenge_TypeClass() {
		return toP_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOP_Laenge_TypeClass_Wert() {
		return (EAttribute)toP_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTP_Art_TypeClass() {
		return tP_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTP_Art_TypeClass_Wert() {
		return (EAttribute)tP_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTP_Beschreibung_TypeClass() {
		return tP_Beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTP_Beschreibung_TypeClass_Wert() {
		return (EAttribute)tP_Beschreibung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Kante_child_AttributeGroup() {
		return trasse_Kante_child_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehung() {
		return ueberhoehungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehung_UeberhoehungAllg() {
		return (EReference)ueberhoehungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehung_Allg_AttributeGroup() {
		return ueberhoehung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehung_Allg_AttributeGroup_GEOPAD() {
		return (EReference)ueberhoehung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehung_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)ueberhoehung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum() {
		return (EReference)ueberhoehung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe() {
		return (EReference)ueberhoehung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehung_Datum_TypeClass() {
		return ueberhoehung_Datum_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUeberhoehung_Datum_TypeClass_Wert() {
		return (EAttribute)ueberhoehung_Datum_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehung_Hoehe_TypeClass() {
		return ueberhoehung_Hoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUeberhoehung_Hoehe_TypeClass_Wert() {
		return (EAttribute)ueberhoehung_Hoehe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehungslinie() {
		return ueberhoehungslinieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_IDUeberhoehungA() {
		return (EReference)ueberhoehungslinieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_IDUeberhoehungB() {
		return (EReference)ueberhoehungslinieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_UeberhoehungslinieAllg() {
		return (EReference)ueberhoehungslinieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehungslinie_Allg_AttributeGroup() {
		return ueberhoehungslinie_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle() {
		return (EReference)ueberhoehungslinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm() {
		return (EReference)ueberhoehungslinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge() {
		return (EReference)ueberhoehungslinie_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehungslinie_Form_TypeClass() {
		return ueberhoehungslinie_Form_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUeberhoehungslinie_Form_TypeClass_Wert() {
		return (EAttribute)ueberhoehungslinie_Form_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberhoehungslinie_Laenge_TypeClass() {
		return ueberhoehungslinie_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUeberhoehungslinie_Laenge_TypeClass_Wert() {
		return (EAttribute)ueberhoehungslinie_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Profil_Art_TypeClass() {
		return v_Profil_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Profil_Art_TypeClass_Wert() {
		return (EAttribute)v_Profil_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGEOForm() {
		return enumgeoFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGEOKoordinatensystem() {
		return enumgeoKoordinatensystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMHoehenlinieForm() {
		return enumHoehenlinieFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMHSystem() {
		return enumhSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMOertlichkeitArt() {
		return enumOertlichkeitArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPlanQuelle() {
		return enumPlanQuelleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStreckeRichtung() {
		return enumStreckeRichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTBArt() {
		return enumtbArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTOPAnschluss() {
		return enumtopAnschlussEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTPArt() {
		return enumtpArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUeberhoehungslinieForm() {
		return enumUeberhoehungslinieFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMVProfilArt() {
		return enumvProfilArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnzeigegefuehrt_ES_Kategorie_Type() {
		return anzeigegefuehrt_ES_Kategorie_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Strecke_Type() {
		return bezeichnung_Strecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEnumeration1() {
		return enumeration1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGEOFormObject() {
		return enumgeoFormObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGEOKoordinatensystemObject() {
		return enumgeoKoordinatensystemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMHoehenlinieFormObject() {
		return enumHoehenlinieFormObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMHSystemObject() {
		return enumhSystemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMOertlichkeitArtObject() {
		return enumOertlichkeitArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPlanQuelleObject() {
		return enumPlanQuelleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStreckeRichtungObject() {
		return enumStreckeRichtungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTBArtObject() {
		return enumtbArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTOPAnschlussObject() {
		return enumtopAnschlussObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTPArtObject() {
		return enumtpArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUeberhoehungslinieFormObject() {
		return enumUeberhoehungslinieFormObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMVProfilArtObject() {
		return enumvProfilArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_KAD_Type() {
		return geO_KAD_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_Laenge_Type() {
		return geO_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_PAD_Type() {
		return geO_PAD_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_Radius_A_Type() {
		return geO_Radius_A_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_Radius_B_Type() {
		return geO_Radius_B_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGEO_Richtungswinkel_Type() {
		return geO_Richtungswinkel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeschwindigkeit_Type() {
		return geschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGK_X_Type() {
		return gK_X_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGK_Y_Type() {
		return gK_Y_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGK_Z_Type() {
		return gK_Z_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHoehenlinie_Laenge_Type() {
		return hoehenlinie_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHoehenpunkt_Hoehe_Type() {
		return hoehenpunkt_Hoehe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKantenname_Type() {
		return kantenname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKnotenname_Type() {
		return knotenname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNeigung_Type() {
		return neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOertlichkeit_Abkuerzung_Type() {
		return oertlichkeit_Abkuerzung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOertlichkeit_Kurzname_Type() {
		return oertlichkeit_Kurzname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOertlichkeit_Langname_Type() {
		return oertlichkeit_Langname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStrecke_Meter_Type() {
		return strecke_Meter_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTB_Beschreibung_Type() {
		return tB_Beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTOP_Laenge_Type() {
		return toP_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTP_Beschreibung_Type() {
		return tP_Beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUeberhoehung_Hoehe_Type() {
		return ueberhoehung_Hoehe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUeberhoehungslinie_Laenge_Type() {
		return ueberhoehungslinie_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodatenFactory getGeodatenFactory() {
		return (GeodatenFactory)getEFactoryInstance();
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
		anzeigegefuehrt_ES_Kategorie_TypeClassEClass = createEClass(ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE_CLASS);
		createEAttribute(anzeigegefuehrt_ES_Kategorie_TypeClassEClass, ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE_CLASS__WERT);

		bezeichnung_Strecke_TypeClassEClass = createEClass(BEZEICHNUNG_STRECKE_TYPE_CLASS);
		createEAttribute(bezeichnung_Strecke_TypeClassEClass, BEZEICHNUNG_STRECKE_TYPE_CLASS__WERT);

		bremsweg_TypeClassEClass = createEClass(BREMSWEG_TYPE_CLASS);
		createEAttribute(bremsweg_TypeClassEClass, BREMSWEG_TYPE_CLASS__WERT);

		geO_Form_TypeClassEClass = createEClass(GEO_FORM_TYPE_CLASS);
		createEAttribute(geO_Form_TypeClassEClass, GEO_FORM_TYPE_CLASS__WERT);

		geO_KAD_TypeClassEClass = createEClass(GEO_KAD_TYPE_CLASS);
		createEAttribute(geO_KAD_TypeClassEClass, GEO_KAD_TYPE_CLASS__WERT);

		geO_KanteEClass = createEClass(GEO_KANTE);
		createEReference(geO_KanteEClass, GEO_KANTE__GEO_KANTE_ALLG);
		createEReference(geO_KanteEClass, GEO_KANTE__IDGEO_ART);
		createEReference(geO_KanteEClass, GEO_KANTE__IDGEO_KNOTEN_A);
		createEReference(geO_KanteEClass, GEO_KANTE__IDGEO_KNOTEN_B);

		geO_Kante_Allg_AttributeGroupEClass = createEClass(GEO_KANTE_ALLG_ATTRIBUTE_GROUP);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL);
		createEReference(geO_Kante_Allg_AttributeGroupEClass, GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);

		geO_KnotenEClass = createEClass(GEO_KNOTEN);
		createEReference(geO_KnotenEClass, GEO_KNOTEN__GEOPAD);

		geO_Koordinatensystem_TypeClassEClass = createEClass(GEO_KOORDINATENSYSTEM_TYPE_CLASS);
		createEAttribute(geO_Koordinatensystem_TypeClassEClass, GEO_KOORDINATENSYSTEM_TYPE_CLASS__WERT);

		geO_Laenge_TypeClassEClass = createEClass(GEO_LAENGE_TYPE_CLASS);
		createEAttribute(geO_Laenge_TypeClassEClass, GEO_LAENGE_TYPE_CLASS__WERT);

		geO_PAD_TypeClassEClass = createEClass(GEO_PAD_TYPE_CLASS);
		createEAttribute(geO_PAD_TypeClassEClass, GEO_PAD_TYPE_CLASS__WERT);

		geO_PunktEClass = createEClass(GEO_PUNKT);
		createEReference(geO_PunktEClass, GEO_PUNKT__GEO_PUNKT_ALLG);
		createEReference(geO_PunktEClass, GEO_PUNKT__IDGEO_KANTE);
		createEReference(geO_PunktEClass, GEO_PUNKT__IDGEO_KNOTEN);

		geO_Punkt_Allg_AttributeGroupEClass = createEClass(GEO_PUNKT_ALLG_ATTRIBUTE_GROUP);
		createEReference(geO_Punkt_Allg_AttributeGroupEClass, GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GEO_KOORDINATENSYSTEM);
		createEReference(geO_Punkt_Allg_AttributeGroupEClass, GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKX);
		createEReference(geO_Punkt_Allg_AttributeGroupEClass, GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKY);
		createEReference(geO_Punkt_Allg_AttributeGroupEClass, GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__GKZ);
		createEReference(geO_Punkt_Allg_AttributeGroupEClass, GEO_PUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);

		geO_Radius_A_TypeClassEClass = createEClass(GEO_RADIUS_ATYPE_CLASS);
		createEAttribute(geO_Radius_A_TypeClassEClass, GEO_RADIUS_ATYPE_CLASS__WERT);

		geO_Radius_B_TypeClassEClass = createEClass(GEO_RADIUS_BTYPE_CLASS);
		createEAttribute(geO_Radius_B_TypeClassEClass, GEO_RADIUS_BTYPE_CLASS__WERT);

		geO_Richtungswinkel_TypeClassEClass = createEClass(GEO_RICHTUNGSWINKEL_TYPE_CLASS);
		createEAttribute(geO_Richtungswinkel_TypeClassEClass, GEO_RICHTUNGSWINKEL_TYPE_CLASS__WERT);

		geschwindigkeit_TypeClassEClass = createEClass(GESCHWINDIGKEIT_TYPE_CLASS);
		createEAttribute(geschwindigkeit_TypeClassEClass, GESCHWINDIGKEIT_TYPE_CLASS__WERT);

		geschwindigkeitsprofilEClass = createEClass(GESCHWINDIGKEITSPROFIL);
		createEReference(geschwindigkeitsprofilEClass, GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG);

		geschwindigkeitsprofil_Allg_AttributeGroupEClass = createEClass(GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP);
		createEReference(geschwindigkeitsprofil_Allg_AttributeGroupEClass, GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE);
		createEReference(geschwindigkeitsprofil_Allg_AttributeGroupEClass, GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT);
		createEReference(geschwindigkeitsprofil_Allg_AttributeGroupEClass, GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART);

		gK_X_TypeClassEClass = createEClass(GK_XTYPE_CLASS);
		createEAttribute(gK_X_TypeClassEClass, GK_XTYPE_CLASS__WERT);

		gK_Y_TypeClassEClass = createEClass(GK_YTYPE_CLASS);
		createEAttribute(gK_Y_TypeClassEClass, GK_YTYPE_CLASS__WERT);

		gK_Z_TypeClassEClass = createEClass(GK_ZTYPE_CLASS);
		createEAttribute(gK_Z_TypeClassEClass, GK_ZTYPE_CLASS__WERT);

		hoehenlinieEClass = createEClass(HOEHENLINIE);
		createEReference(hoehenlinieEClass, HOEHENLINIE__HOEHENLINIE_ALLG);
		createEReference(hoehenlinieEClass, HOEHENLINIE__ID_HOEHENPUNKT_A);
		createEReference(hoehenlinieEClass, HOEHENLINIE__ID_HOEHENPUNKT_B);

		hoehenlinie_Allg_AttributeGroupEClass = createEClass(HOEHENLINIE_ALLG_ATTRIBUTE_GROUP);
		createEReference(hoehenlinie_Allg_AttributeGroupEClass, HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM);
		createEReference(hoehenlinie_Allg_AttributeGroupEClass, HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE);
		createEReference(hoehenlinie_Allg_AttributeGroupEClass, HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);

		hoehenlinie_Form_TypeClassEClass = createEClass(HOEHENLINIE_FORM_TYPE_CLASS);
		createEAttribute(hoehenlinie_Form_TypeClassEClass, HOEHENLINIE_FORM_TYPE_CLASS__WERT);

		hoehenlinie_Laenge_TypeClassEClass = createEClass(HOEHENLINIE_LAENGE_TYPE_CLASS);
		createEAttribute(hoehenlinie_Laenge_TypeClassEClass, HOEHENLINIE_LAENGE_TYPE_CLASS__WERT);

		hoehenpunktEClass = createEClass(HOEHENPUNKT);
		createEReference(hoehenpunktEClass, HOEHENPUNKT__HOEHENPUNKT_ALLG);

		hoehenpunkt_Allg_AttributeGroupEClass = createEClass(HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG);
		createEReference(hoehenpunkt_Allg_AttributeGroupEClass, HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);

		hoehenpunkt_Datum_TypeClassEClass = createEClass(HOEHENPUNKT_DATUM_TYPE_CLASS);
		createEAttribute(hoehenpunkt_Datum_TypeClassEClass, HOEHENPUNKT_DATUM_TYPE_CLASS__WERT);

		hoehenpunkt_Hoehe_TypeClassEClass = createEClass(HOEHENPUNKT_HOEHE_TYPE_CLASS);
		createEAttribute(hoehenpunkt_Hoehe_TypeClassEClass, HOEHENPUNKT_HOEHE_TYPE_CLASS__WERT);

		hSystem_TypeClassEClass = createEClass(HSYSTEM_TYPE_CLASS);
		createEAttribute(hSystem_TypeClassEClass, HSYSTEM_TYPE_CLASS__WERT);

		kantenname_TypeClassEClass = createEClass(KANTENNAME_TYPE_CLASS);
		createEAttribute(kantenname_TypeClassEClass, KANTENNAME_TYPE_CLASS__WERT);

		knotenname_TypeClassEClass = createEClass(KNOTENNAME_TYPE_CLASS);
		createEAttribute(knotenname_TypeClassEClass, KNOTENNAME_TYPE_CLASS__WERT);

		neigung_TypeClassEClass = createEClass(NEIGUNG_TYPE_CLASS);
		createEAttribute(neigung_TypeClassEClass, NEIGUNG_TYPE_CLASS__WERT);

		oertlichkeitEClass = createEClass(OERTLICHKEIT);
		createEReference(oertlichkeitEClass, OERTLICHKEIT__BEZEICHNUNG);
		createEReference(oertlichkeitEClass, OERTLICHKEIT__ID_OERTLICHKEIT);
		createEReference(oertlichkeitEClass, OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT);
		createEReference(oertlichkeitEClass, OERTLICHKEIT__ID_STRECKE_PUNKT);
		createEReference(oertlichkeitEClass, OERTLICHKEIT__OERTLICHKEIT_ALLG);

		oertlichkeit_Abkuerzung_TypeClassEClass = createEClass(OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS);
		createEAttribute(oertlichkeit_Abkuerzung_TypeClassEClass, OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS__WERT);

		oertlichkeit_Allg_AttributeGroupEClass = createEClass(OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP);
		createEReference(oertlichkeit_Allg_AttributeGroupEClass, OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_ART);
		createEReference(oertlichkeit_Allg_AttributeGroupEClass, OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_AB);
		createEReference(oertlichkeit_Allg_AttributeGroupEClass, OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP__OERTLICHKEIT_GUELTIG_BIS);

		oertlichkeit_Art_TypeClassEClass = createEClass(OERTLICHKEIT_ART_TYPE_CLASS);
		createEAttribute(oertlichkeit_Art_TypeClassEClass, OERTLICHKEIT_ART_TYPE_CLASS__WERT);

		oertlichkeit_Bezeichnung_AttributeGroupEClass = createEClass(OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(oertlichkeit_Bezeichnung_AttributeGroupEClass, OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG);
		createEReference(oertlichkeit_Bezeichnung_AttributeGroupEClass, OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME);
		createEReference(oertlichkeit_Bezeichnung_AttributeGroupEClass, OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME);

		oertlichkeit_Gueltig_Ab_TypeClassEClass = createEClass(OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS);
		createEAttribute(oertlichkeit_Gueltig_Ab_TypeClassEClass, OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS__WERT);

		oertlichkeit_Gueltig_Bis_TypeClassEClass = createEClass(OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS);
		createEAttribute(oertlichkeit_Gueltig_Bis_TypeClassEClass, OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS__WERT);

		oertlichkeit_Kurzname_TypeClassEClass = createEClass(OERTLICHKEIT_KURZNAME_TYPE_CLASS);
		createEAttribute(oertlichkeit_Kurzname_TypeClassEClass, OERTLICHKEIT_KURZNAME_TYPE_CLASS__WERT);

		oertlichkeit_Langname_TypeClassEClass = createEClass(OERTLICHKEIT_LANGNAME_TYPE_CLASS);
		createEAttribute(oertlichkeit_Langname_TypeClassEClass, OERTLICHKEIT_LANGNAME_TYPE_CLASS__WERT);

		plan_Quelle_TypeClassEClass = createEClass(PLAN_QUELLE_TYPE_CLASS);
		createEAttribute(plan_Quelle_TypeClassEClass, PLAN_QUELLE_TYPE_CLASS__WERT);

		streckeEClass = createEClass(STRECKE);
		createEReference(streckeEClass, STRECKE__BEZEICHNUNG);

		strecke_Bezeichnung_AttributeGroupEClass = createEClass(STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(strecke_Bezeichnung_AttributeGroupEClass, STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE);

		strecke_BremswegEClass = createEClass(STRECKE_BREMSWEG);
		createEReference(strecke_BremswegEClass, STRECKE_BREMSWEG__BREMSWEG);
		createEReference(strecke_BremswegEClass, STRECKE_BREMSWEG__STRECKE_RICHTUNG);

		strecke_Meter_TypeClassEClass = createEClass(STRECKE_METER_TYPE_CLASS);
		createEAttribute(strecke_Meter_TypeClassEClass, STRECKE_METER_TYPE_CLASS__WERT);

		strecke_PunktEClass = createEClass(STRECKE_PUNKT);
		createEReference(strecke_PunktEClass, STRECKE_PUNKT__IDGEO_KNOTEN);
		createEReference(strecke_PunktEClass, STRECKE_PUNKT__ID_STRECKE);
		createEReference(strecke_PunktEClass, STRECKE_PUNKT__STRECKE_METER);

		strecke_Richtung_TypeClassEClass = createEClass(STRECKE_RICHTUNG_TYPE_CLASS);
		createEAttribute(strecke_Richtung_TypeClassEClass, STRECKE_RICHTUNG_TYPE_CLASS__WERT);

		tB_Art_TypeClassEClass = createEClass(TB_ART_TYPE_CLASS);
		createEAttribute(tB_Art_TypeClassEClass, TB_ART_TYPE_CLASS__WERT);

		tB_Beschreibung_TypeClassEClass = createEClass(TB_BESCHREIBUNG_TYPE_CLASS);
		createEAttribute(tB_Beschreibung_TypeClassEClass, TB_BESCHREIBUNG_TYPE_CLASS__WERT);

		technischer_BereichEClass = createEClass(TECHNISCHER_BEREICH);
		createEReference(technischer_BereichEClass, TECHNISCHER_BEREICH__TB_ART);
		createEReference(technischer_BereichEClass, TECHNISCHER_BEREICH__TB_BESCHREIBUNG);

		technischer_PunktEClass = createEClass(TECHNISCHER_PUNKT);
		createEReference(technischer_PunktEClass, TECHNISCHER_PUNKT__TP_ART);
		createEReference(technischer_PunktEClass, TECHNISCHER_PUNKT__TP_BESCHREIBUNG);

		toP_Anschluss_A_TypeClassEClass = createEClass(TOP_ANSCHLUSS_ATYPE_CLASS);
		createEAttribute(toP_Anschluss_A_TypeClassEClass, TOP_ANSCHLUSS_ATYPE_CLASS__WERT);

		toP_Anschluss_B_TypeClassEClass = createEClass(TOP_ANSCHLUSS_BTYPE_CLASS);
		createEAttribute(toP_Anschluss_B_TypeClassEClass, TOP_ANSCHLUSS_BTYPE_CLASS__WERT);

		toP_KanteEClass = createEClass(TOP_KANTE);
		createEReference(toP_KanteEClass, TOP_KANTE__IDTOP_KNOTEN_A);
		createEReference(toP_KanteEClass, TOP_KANTE__IDTOP_KNOTEN_B);
		createEReference(toP_KanteEClass, TOP_KANTE__TOP_KANTE_ALLG);

		toP_Kante_Allg_AttributeGroupEClass = createEClass(TOP_KANTE_ALLG_ATTRIBUTE_GROUP);
		createEReference(toP_Kante_Allg_AttributeGroupEClass, TOP_KANTE_ALLG_ATTRIBUTE_GROUP__KANTENNAME);
		createEReference(toP_Kante_Allg_AttributeGroupEClass, TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_A);
		createEReference(toP_Kante_Allg_AttributeGroupEClass, TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_ANSCHLUSS_B);
		createEReference(toP_Kante_Allg_AttributeGroupEClass, TOP_KANTE_ALLG_ATTRIBUTE_GROUP__TOP_LAENGE);

		toP_KnotenEClass = createEClass(TOP_KNOTEN);
		createEReference(toP_KnotenEClass, TOP_KNOTEN__IDGEO_KNOTEN);
		createEReference(toP_KnotenEClass, TOP_KNOTEN__KNOTENNAME);

		toP_Laenge_TypeClassEClass = createEClass(TOP_LAENGE_TYPE_CLASS);
		createEAttribute(toP_Laenge_TypeClassEClass, TOP_LAENGE_TYPE_CLASS__WERT);

		tP_Art_TypeClassEClass = createEClass(TP_ART_TYPE_CLASS);
		createEAttribute(tP_Art_TypeClassEClass, TP_ART_TYPE_CLASS__WERT);

		tP_Beschreibung_TypeClassEClass = createEClass(TP_BESCHREIBUNG_TYPE_CLASS);
		createEAttribute(tP_Beschreibung_TypeClassEClass, TP_BESCHREIBUNG_TYPE_CLASS__WERT);

		trasse_Kante_child_AttributeGroupEClass = createEClass(TRASSE_KANTE_CHILD_ATTRIBUTE_GROUP);

		ueberhoehungEClass = createEClass(UEBERHOEHUNG);
		createEReference(ueberhoehungEClass, UEBERHOEHUNG__UEBERHOEHUNG_ALLG);

		ueberhoehung_Allg_AttributeGroupEClass = createEClass(UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(ueberhoehung_Allg_AttributeGroupEClass, UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD);
		createEReference(ueberhoehung_Allg_AttributeGroupEClass, UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);
		createEReference(ueberhoehung_Allg_AttributeGroupEClass, UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM);
		createEReference(ueberhoehung_Allg_AttributeGroupEClass, UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE);

		ueberhoehung_Datum_TypeClassEClass = createEClass(UEBERHOEHUNG_DATUM_TYPE_CLASS);
		createEAttribute(ueberhoehung_Datum_TypeClassEClass, UEBERHOEHUNG_DATUM_TYPE_CLASS__WERT);

		ueberhoehung_Hoehe_TypeClassEClass = createEClass(UEBERHOEHUNG_HOEHE_TYPE_CLASS);
		createEAttribute(ueberhoehung_Hoehe_TypeClassEClass, UEBERHOEHUNG_HOEHE_TYPE_CLASS__WERT);

		ueberhoehungslinieEClass = createEClass(UEBERHOEHUNGSLINIE);
		createEReference(ueberhoehungslinieEClass, UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A);
		createEReference(ueberhoehungslinieEClass, UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B);
		createEReference(ueberhoehungslinieEClass, UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG);

		ueberhoehungslinie_Allg_AttributeGroupEClass = createEClass(UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP);
		createEReference(ueberhoehungslinie_Allg_AttributeGroupEClass, UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE);
		createEReference(ueberhoehungslinie_Allg_AttributeGroupEClass, UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM);
		createEReference(ueberhoehungslinie_Allg_AttributeGroupEClass, UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE);

		ueberhoehungslinie_Form_TypeClassEClass = createEClass(UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS);
		createEAttribute(ueberhoehungslinie_Form_TypeClassEClass, UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS__WERT);

		ueberhoehungslinie_Laenge_TypeClassEClass = createEClass(UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS);
		createEAttribute(ueberhoehungslinie_Laenge_TypeClassEClass, UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS__WERT);

		v_Profil_Art_TypeClassEClass = createEClass(VPROFIL_ART_TYPE_CLASS);
		createEAttribute(v_Profil_Art_TypeClassEClass, VPROFIL_ART_TYPE_CLASS__WERT);

		// Create enums
		enumgeoFormEEnum = createEEnum(ENUMGEO_FORM);
		enumgeoKoordinatensystemEEnum = createEEnum(ENUMGEO_KOORDINATENSYSTEM);
		enumHoehenlinieFormEEnum = createEEnum(ENUM_HOEHENLINIE_FORM);
		enumhSystemEEnum = createEEnum(ENUMH_SYSTEM);
		enumOertlichkeitArtEEnum = createEEnum(ENUM_OERTLICHKEIT_ART);
		enumPlanQuelleEEnum = createEEnum(ENUM_PLAN_QUELLE);
		enumStreckeRichtungEEnum = createEEnum(ENUM_STRECKE_RICHTUNG);
		enumtbArtEEnum = createEEnum(ENUMTB_ART);
		enumtopAnschlussEEnum = createEEnum(ENUMTOP_ANSCHLUSS);
		enumtpArtEEnum = createEEnum(ENUMTP_ART);
		enumUeberhoehungslinieFormEEnum = createEEnum(ENUM_UEBERHOEHUNGSLINIE_FORM);
		enumvProfilArtEEnum = createEEnum(ENUMV_PROFIL_ART);

		// Create data types
		anzeigegefuehrt_ES_Kategorie_TypeEDataType = createEDataType(ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE);
		bezeichnung_Strecke_TypeEDataType = createEDataType(BEZEICHNUNG_STRECKE_TYPE);
		enumeration1EDataType = createEDataType(ENUMERATION1);
		enumgeoFormObjectEDataType = createEDataType(ENUMGEO_FORM_OBJECT);
		enumgeoKoordinatensystemObjectEDataType = createEDataType(ENUMGEO_KOORDINATENSYSTEM_OBJECT);
		enumHoehenlinieFormObjectEDataType = createEDataType(ENUM_HOEHENLINIE_FORM_OBJECT);
		enumhSystemObjectEDataType = createEDataType(ENUMH_SYSTEM_OBJECT);
		enumOertlichkeitArtObjectEDataType = createEDataType(ENUM_OERTLICHKEIT_ART_OBJECT);
		enumPlanQuelleObjectEDataType = createEDataType(ENUM_PLAN_QUELLE_OBJECT);
		enumStreckeRichtungObjectEDataType = createEDataType(ENUM_STRECKE_RICHTUNG_OBJECT);
		enumtbArtObjectEDataType = createEDataType(ENUMTB_ART_OBJECT);
		enumtopAnschlussObjectEDataType = createEDataType(ENUMTOP_ANSCHLUSS_OBJECT);
		enumtpArtObjectEDataType = createEDataType(ENUMTP_ART_OBJECT);
		enumUeberhoehungslinieFormObjectEDataType = createEDataType(ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT);
		enumvProfilArtObjectEDataType = createEDataType(ENUMV_PROFIL_ART_OBJECT);
		geO_KAD_TypeEDataType = createEDataType(GEO_KAD_TYPE);
		geO_Laenge_TypeEDataType = createEDataType(GEO_LAENGE_TYPE);
		geO_PAD_TypeEDataType = createEDataType(GEO_PAD_TYPE);
		geO_Radius_A_TypeEDataType = createEDataType(GEO_RADIUS_ATYPE);
		geO_Radius_B_TypeEDataType = createEDataType(GEO_RADIUS_BTYPE);
		geO_Richtungswinkel_TypeEDataType = createEDataType(GEO_RICHTUNGSWINKEL_TYPE);
		geschwindigkeit_TypeEDataType = createEDataType(GESCHWINDIGKEIT_TYPE);
		gK_X_TypeEDataType = createEDataType(GK_XTYPE);
		gK_Y_TypeEDataType = createEDataType(GK_YTYPE);
		gK_Z_TypeEDataType = createEDataType(GK_ZTYPE);
		hoehenlinie_Laenge_TypeEDataType = createEDataType(HOEHENLINIE_LAENGE_TYPE);
		hoehenpunkt_Hoehe_TypeEDataType = createEDataType(HOEHENPUNKT_HOEHE_TYPE);
		kantenname_TypeEDataType = createEDataType(KANTENNAME_TYPE);
		knotenname_TypeEDataType = createEDataType(KNOTENNAME_TYPE);
		neigung_TypeEDataType = createEDataType(NEIGUNG_TYPE);
		oertlichkeit_Abkuerzung_TypeEDataType = createEDataType(OERTLICHKEIT_ABKUERZUNG_TYPE);
		oertlichkeit_Kurzname_TypeEDataType = createEDataType(OERTLICHKEIT_KURZNAME_TYPE);
		oertlichkeit_Langname_TypeEDataType = createEDataType(OERTLICHKEIT_LANGNAME_TYPE);
		strecke_Meter_TypeEDataType = createEDataType(STRECKE_METER_TYPE);
		tB_Beschreibung_TypeEDataType = createEDataType(TB_BESCHREIBUNG_TYPE);
		toP_Laenge_TypeEDataType = createEDataType(TOP_LAENGE_TYPE);
		tP_Beschreibung_TypeEDataType = createEDataType(TP_BESCHREIBUNG_TYPE);
		ueberhoehung_Hoehe_TypeEDataType = createEDataType(UEBERHOEHUNG_HOEHE_TYPE);
		ueberhoehungslinie_Laenge_TypeEDataType = createEDataType(UEBERHOEHUNGSLINIE_LAENGE_TYPE);
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
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Medien_und_TrassenPackage theMedien_und_TrassenPackage = (Medien_und_TrassenPackage)EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anzeigegefuehrt_ES_Kategorie_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Strecke_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bremsweg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_Form_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_KAD_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_KanteEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		geO_KnotenEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		geO_Koordinatensystem_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_PAD_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_PunktEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		geO_Radius_A_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_Radius_B_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geO_Richtungswinkel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschwindigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschwindigkeitsprofilEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gK_X_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gK_Y_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gK_Z_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoehenlinieEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		hoehenlinie_Form_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoehenlinie_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoehenpunktEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		hoehenpunkt_Datum_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hoehenpunkt_Hoehe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hSystem_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kantenname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		knotenname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		neigung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeitEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		oertlichkeit_Abkuerzung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeit_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeit_Gueltig_Ab_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeit_Gueltig_Bis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeit_Kurzname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		oertlichkeit_Langname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		plan_Quelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		streckeEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		strecke_BremswegEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		strecke_Meter_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		strecke_PunktEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		strecke_Richtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tB_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tB_Beschreibung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		technischer_BereichEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		technischer_PunktEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		toP_Anschluss_A_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		toP_Anschluss_B_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		toP_KanteEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		toP_KnotenEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		toP_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tP_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tP_Beschreibung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		trasse_Kante_child_AttributeGroupEClass.getESuperTypes().add(theMedien_und_TrassenPackage.getTrasse_Kante());
		ueberhoehungEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		ueberhoehung_Datum_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ueberhoehung_Hoehe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ueberhoehungslinieEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		ueberhoehungslinie_Form_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ueberhoehungslinie_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		v_Profil_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(anzeigegefuehrt_ES_Kategorie_TypeClassEClass, Anzeigegefuehrt_ES_Kategorie_TypeClass.class, "Anzeigegefuehrt_ES_Kategorie_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnzeigegefuehrt_ES_Kategorie_TypeClass_Wert(), this.getAnzeigegefuehrt_ES_Kategorie_Type(), "wert", null, 1, 1, Anzeigegefuehrt_ES_Kategorie_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Strecke_TypeClassEClass, Bezeichnung_Strecke_TypeClass.class, "Bezeichnung_Strecke_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Strecke_TypeClass_Wert(), this.getBezeichnung_Strecke_Type(), "wert", null, 1, 1, Bezeichnung_Strecke_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bremsweg_TypeClassEClass, Bremsweg_TypeClass.class, "Bremsweg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBremsweg_TypeClass_Wert(), theBasisTypenPackage.getBremsweg_Type(), "wert", null, 1, 1, Bremsweg_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Form_TypeClassEClass, GEO_Form_TypeClass.class, "GEO_Form_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Form_TypeClass_Wert(), this.getENUMGEOFormObject(), "wert", null, 1, 1, GEO_Form_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_KAD_TypeClassEClass, GEO_KAD_TypeClass.class, "GEO_KAD_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_KAD_TypeClass_Wert(), this.getGEO_KAD_Type(), "wert", null, 1, 1, GEO_KAD_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_KanteEClass, GEO_Kante.class, "GEO_Kante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEO_Kante_GEOKanteAllg(), this.getGEO_Kante_Allg_AttributeGroup(), null, "gEOKanteAllg", null, 1, 1, GEO_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_IDGEOArt(), theVerweisePackage.getID_GEO_Art_TypeClass(), null, "iDGEOArt", null, 1, 1, GEO_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_IDGEOKnotenA(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnotenA", null, 1, 1, GEO_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_IDGEOKnotenB(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnotenB", null, 1, 1, GEO_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Kante_Allg_AttributeGroupEClass, GEO_Kante_Allg_AttributeGroup.class, "GEO_Kante_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEOForm(), this.getGEO_Form_TypeClass(), null, "gEOForm", null, 1, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEOKAD(), this.getGEO_KAD_TypeClass(), null, "gEOKAD", null, 0, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEOLaenge(), this.getGEO_Laenge_TypeClass(), null, "gEOLaenge", null, 1, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEORadiusA(), this.getGEO_Radius_A_TypeClass(), null, "gEORadiusA", null, 0, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEORadiusB(), this.getGEO_Radius_B_TypeClass(), null, "gEORadiusB", null, 0, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel(), this.getGEO_Richtungswinkel_TypeClass(), null, "gEORichtungswinkel", null, 0, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Kante_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 1, 1, GEO_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_KnotenEClass, GEO_Knoten.class, "GEO_Knoten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEO_Knoten_GEOPAD(), this.getGEO_PAD_TypeClass(), null, "gEOPAD", null, 0, 1, GEO_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Koordinatensystem_TypeClassEClass, GEO_Koordinatensystem_TypeClass.class, "GEO_Koordinatensystem_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Koordinatensystem_TypeClass_Wert(), this.getENUMGEOKoordinatensystemObject(), "wert", null, 1, 1, GEO_Koordinatensystem_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Laenge_TypeClassEClass, GEO_Laenge_TypeClass.class, "GEO_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Laenge_TypeClass_Wert(), this.getGEO_Laenge_Type(), "wert", null, 1, 1, GEO_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_PAD_TypeClassEClass, GEO_PAD_TypeClass.class, "GEO_PAD_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_PAD_TypeClass_Wert(), this.getGEO_PAD_Type(), "wert", null, 1, 1, GEO_PAD_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_PunktEClass, GEO_Punkt.class, "GEO_Punkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEO_Punkt_GEOPunktAllg(), this.getGEO_Punkt_Allg_AttributeGroup(), null, "gEOPunktAllg", null, 1, 1, GEO_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_IDGEOKante(), theVerweisePackage.getID_GEO_Kante_TypeClass(), null, "iDGEOKante", null, 0, 1, GEO_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_IDGEOKnoten(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnoten", null, 0, 1, GEO_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Punkt_Allg_AttributeGroupEClass, GEO_Punkt_Allg_AttributeGroup.class, "GEO_Punkt_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatensystem(), this.getGEO_Koordinatensystem_TypeClass(), null, "gEOKoordinatensystem", null, 1, 1, GEO_Punkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_Allg_AttributeGroup_GKX(), this.getGK_X_TypeClass(), null, "gKX", null, 1, 1, GEO_Punkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_Allg_AttributeGroup_GKY(), this.getGK_Y_TypeClass(), null, "gKY", null, 1, 1, GEO_Punkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_Allg_AttributeGroup_GKZ(), this.getGK_Z_TypeClass(), null, "gKZ", null, 0, 1, GEO_Punkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGEO_Punkt_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 1, 1, GEO_Punkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Radius_A_TypeClassEClass, GEO_Radius_A_TypeClass.class, "GEO_Radius_A_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Radius_A_TypeClass_Wert(), this.getGEO_Radius_A_Type(), "wert", null, 1, 1, GEO_Radius_A_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Radius_B_TypeClassEClass, GEO_Radius_B_TypeClass.class, "GEO_Radius_B_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Radius_B_TypeClass_Wert(), this.getGEO_Radius_B_Type(), "wert", null, 1, 1, GEO_Radius_B_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geO_Richtungswinkel_TypeClassEClass, GEO_Richtungswinkel_TypeClass.class, "GEO_Richtungswinkel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEO_Richtungswinkel_TypeClass_Wert(), this.getGEO_Richtungswinkel_Type(), "wert", null, 1, 1, GEO_Richtungswinkel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeit_TypeClassEClass, Geschwindigkeit_TypeClass.class, "Geschwindigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeschwindigkeit_TypeClass_Wert(), this.getGeschwindigkeit_Type(), "wert", null, 1, 1, Geschwindigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeitsprofilEClass, Geschwindigkeitsprofil.class, "Geschwindigkeitsprofil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg(), this.getGeschwindigkeitsprofil_Allg_AttributeGroup(), null, "geschwindigkeitsprofilAllg", null, 1, 1, Geschwindigkeitsprofil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeitsprofil_Allg_AttributeGroupEClass, Geschwindigkeitsprofil_Allg_AttributeGroup.class, "Geschwindigkeitsprofil_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeschwindigkeitsprofil_Allg_AttributeGroup_AnzeigegefuehrtESKategorie(), this.getAnzeigegefuehrt_ES_Kategorie_TypeClass(), null, "anzeigegefuehrtESKategorie", null, 0, 1, Geschwindigkeitsprofil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit(), this.getGeschwindigkeit_TypeClass(), null, "geschwindigkeit", null, 1, 1, Geschwindigkeitsprofil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt(), this.getV_Profil_Art_TypeClass(), null, "vProfilArt", null, 1, 1, Geschwindigkeitsprofil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gK_X_TypeClassEClass, GK_X_TypeClass.class, "GK_X_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGK_X_TypeClass_Wert(), this.getGK_X_Type(), "wert", null, 1, 1, GK_X_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gK_Y_TypeClassEClass, GK_Y_TypeClass.class, "GK_Y_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGK_Y_TypeClass_Wert(), this.getGK_Y_Type(), "wert", null, 1, 1, GK_Y_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gK_Z_TypeClassEClass, GK_Z_TypeClass.class, "GK_Z_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGK_Z_TypeClass_Wert(), this.getGK_Z_Type(), "wert", null, 1, 1, GK_Z_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenlinieEClass, Hoehenlinie.class, "Hoehenlinie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHoehenlinie_HoehenlinieAllg(), this.getHoehenlinie_Allg_AttributeGroup(), null, "hoehenlinieAllg", null, 1, 1, Hoehenlinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenlinie_IDHoehenpunktA(), theVerweisePackage.getID_Hoehenpunkt_TypeClass(), null, "iDHoehenpunktA", null, 1, 1, Hoehenlinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenlinie_IDHoehenpunktB(), theVerweisePackage.getID_Hoehenpunkt_TypeClass(), null, "iDHoehenpunktB", null, 1, 1, Hoehenlinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenlinie_Allg_AttributeGroupEClass, Hoehenlinie_Allg_AttributeGroup.class, "Hoehenlinie_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm(), this.getHoehenlinie_Form_TypeClass(), null, "hoehenlinieForm", null, 1, 1, Hoehenlinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge(), this.getHoehenlinie_Laenge_TypeClass(), null, "hoehenlinieLaenge", null, 1, 1, Hoehenlinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenlinie_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 1, 1, Hoehenlinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenlinie_Form_TypeClassEClass, Hoehenlinie_Form_TypeClass.class, "Hoehenlinie_Form_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoehenlinie_Form_TypeClass_Wert(), this.getENUMHoehenlinieFormObject(), "wert", null, 1, 1, Hoehenlinie_Form_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenlinie_Laenge_TypeClassEClass, Hoehenlinie_Laenge_TypeClass.class, "Hoehenlinie_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoehenlinie_Laenge_TypeClass_Wert(), this.getHoehenlinie_Laenge_Type(), "wert", null, 1, 1, Hoehenlinie_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenpunktEClass, Hoehenpunkt.class, "Hoehenpunkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHoehenpunkt_HoehenpunktAllg(), this.getHoehenpunkt_Allg_AttributeGroup(), null, "hoehenpunktAllg", null, 1, 1, Hoehenpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenpunkt_Allg_AttributeGroupEClass, Hoehenpunkt_Allg_AttributeGroup.class, "Hoehenpunkt_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_GEOPAD(), this.getGEO_PAD_TypeClass(), null, "gEOPAD", null, 0, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum(), this.getHoehenpunkt_Datum_TypeClass(), null, "hoehenpunktDatum", null, 0, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe(), this.getHoehenpunkt_Hoehe_TypeClass(), null, "hoehenpunktHoehe", null, 1, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_HSystem(), this.getHSystem_TypeClass(), null, "hSystem", null, 0, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_Neigung(), this.getNeigung_TypeClass(), null, "neigung", null, 0, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHoehenpunkt_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 0, 1, Hoehenpunkt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenpunkt_Datum_TypeClassEClass, Hoehenpunkt_Datum_TypeClass.class, "Hoehenpunkt_Datum_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoehenpunkt_Datum_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, Hoehenpunkt_Datum_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoehenpunkt_Hoehe_TypeClassEClass, Hoehenpunkt_Hoehe_TypeClass.class, "Hoehenpunkt_Hoehe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoehenpunkt_Hoehe_TypeClass_Wert(), this.getHoehenpunkt_Hoehe_Type(), "wert", null, 1, 1, Hoehenpunkt_Hoehe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hSystem_TypeClassEClass, HSystem_TypeClass.class, "HSystem_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHSystem_TypeClass_Wert(), this.getENUMHSystemObject(), "wert", null, 1, 1, HSystem_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kantenname_TypeClassEClass, Kantenname_TypeClass.class, "Kantenname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKantenname_TypeClass_Wert(), this.getKantenname_Type(), "wert", null, 1, 1, Kantenname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knotenname_TypeClassEClass, Knotenname_TypeClass.class, "Knotenname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnotenname_TypeClass_Wert(), this.getKnotenname_Type(), "wert", null, 1, 1, Knotenname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neigung_TypeClassEClass, Neigung_TypeClass.class, "Neigung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeigung_TypeClass_Wert(), this.getNeigung_Type(), "wert", null, 1, 1, Neigung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeitEClass, Oertlichkeit.class, "Oertlichkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOertlichkeit_Bezeichnung(), this.getOertlichkeit_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_TypeClass(), null, "iDOertlichkeit", null, 0, 1, Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_IDOertlichkeitAwanstBedient(), theVerweisePackage.getID_Oertlichkeit_TypeClass(), null, "iDOertlichkeitAwanstBedient", null, 0, 1, Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_IDStreckePunkt(), theVerweisePackage.getID_Strecke_Punkt_TypeClass(), null, "iDStreckePunkt", null, 0, -1, Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_OertlichkeitAllg(), this.getOertlichkeit_Allg_AttributeGroup(), null, "oertlichkeitAllg", null, 1, 1, Oertlichkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Abkuerzung_TypeClassEClass, Oertlichkeit_Abkuerzung_TypeClass.class, "Oertlichkeit_Abkuerzung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Abkuerzung_TypeClass_Wert(), this.getOertlichkeit_Abkuerzung_Type(), "wert", null, 1, 1, Oertlichkeit_Abkuerzung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Allg_AttributeGroupEClass, Oertlichkeit_Allg_AttributeGroup.class, "Oertlichkeit_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt(), this.getOertlichkeit_Art_TypeClass(), null, "oertlichkeitArt", null, 1, 1, Oertlichkeit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb(), this.getOertlichkeit_Gueltig_Ab_TypeClass(), null, "oertlichkeitGueltigAb", null, 0, 1, Oertlichkeit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis(), this.getOertlichkeit_Gueltig_Bis_TypeClass(), null, "oertlichkeitGueltigBis", null, 0, 1, Oertlichkeit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Art_TypeClassEClass, Oertlichkeit_Art_TypeClass.class, "Oertlichkeit_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Art_TypeClass_Wert(), this.getENUMOertlichkeitArtObject(), "wert", null, 1, 1, Oertlichkeit_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Bezeichnung_AttributeGroupEClass, Oertlichkeit_Bezeichnung_AttributeGroup.class, "Oertlichkeit_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung(), this.getOertlichkeit_Abkuerzung_TypeClass(), null, "oertlichkeitAbkuerzung", null, 1, 1, Oertlichkeit_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname(), this.getOertlichkeit_Kurzname_TypeClass(), null, "oertlichkeitKurzname", null, 0, 1, Oertlichkeit_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname(), this.getOertlichkeit_Langname_TypeClass(), null, "oertlichkeitLangname", null, 1, 1, Oertlichkeit_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Gueltig_Ab_TypeClassEClass, Oertlichkeit_Gueltig_Ab_TypeClass.class, "Oertlichkeit_Gueltig_Ab_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Gueltig_Ab_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, Oertlichkeit_Gueltig_Ab_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Gueltig_Bis_TypeClassEClass, Oertlichkeit_Gueltig_Bis_TypeClass.class, "Oertlichkeit_Gueltig_Bis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Gueltig_Bis_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, Oertlichkeit_Gueltig_Bis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Kurzname_TypeClassEClass, Oertlichkeit_Kurzname_TypeClass.class, "Oertlichkeit_Kurzname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Kurzname_TypeClass_Wert(), this.getOertlichkeit_Kurzname_Type(), "wert", null, 1, 1, Oertlichkeit_Kurzname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlichkeit_Langname_TypeClassEClass, Oertlichkeit_Langname_TypeClass.class, "Oertlichkeit_Langname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlichkeit_Langname_TypeClass_Wert(), this.getOertlichkeit_Langname_Type(), "wert", null, 1, 1, Oertlichkeit_Langname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plan_Quelle_TypeClassEClass, Plan_Quelle_TypeClass.class, "Plan_Quelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_Quelle_TypeClass_Wert(), this.getENUMPlanQuelleObject(), "wert", null, 1, 1, Plan_Quelle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streckeEClass, Strecke.class, "Strecke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrecke_Bezeichnung(), this.getStrecke_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Strecke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_Bezeichnung_AttributeGroupEClass, Strecke_Bezeichnung_AttributeGroup.class, "Strecke_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke(), this.getBezeichnung_Strecke_TypeClass(), null, "bezeichnungStrecke", null, 1, 1, Strecke_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_BremswegEClass, Strecke_Bremsweg.class, "Strecke_Bremsweg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrecke_Bremsweg_Bremsweg(), this.getBremsweg_TypeClass(), null, "bremsweg", null, 1, 1, Strecke_Bremsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrecke_Bremsweg_StreckeRichtung(), this.getStrecke_Richtung_TypeClass(), null, "streckeRichtung", null, 1, 1, Strecke_Bremsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_Meter_TypeClassEClass, Strecke_Meter_TypeClass.class, "Strecke_Meter_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrecke_Meter_TypeClass_Wert(), this.getStrecke_Meter_Type(), "wert", null, 1, 1, Strecke_Meter_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_PunktEClass, Strecke_Punkt.class, "Strecke_Punkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrecke_Punkt_IDGEOKnoten(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnoten", null, 0, 1, Strecke_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrecke_Punkt_IDStrecke(), theVerweisePackage.getID_Strecke_TypeClass(), null, "iDStrecke", null, 1, 1, Strecke_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrecke_Punkt_StreckeMeter(), this.getStrecke_Meter_TypeClass(), null, "streckeMeter", null, 1, 1, Strecke_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_Richtung_TypeClassEClass, Strecke_Richtung_TypeClass.class, "Strecke_Richtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrecke_Richtung_TypeClass_Wert(), this.getENUMStreckeRichtungObject(), "wert", null, 1, 1, Strecke_Richtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tB_Art_TypeClassEClass, TB_Art_TypeClass.class, "TB_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTB_Art_TypeClass_Wert(), this.getENUMTBArtObject(), "wert", null, 1, 1, TB_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tB_Beschreibung_TypeClassEClass, TB_Beschreibung_TypeClass.class, "TB_Beschreibung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTB_Beschreibung_TypeClass_Wert(), this.getTB_Beschreibung_Type(), "wert", null, 1, 1, TB_Beschreibung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technischer_BereichEClass, Technischer_Bereich.class, "Technischer_Bereich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnischer_Bereich_TBArt(), this.getTB_Art_TypeClass(), null, "tBArt", null, 0, 1, Technischer_Bereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnischer_Bereich_TBBeschreibung(), this.getTB_Beschreibung_TypeClass(), null, "tBBeschreibung", null, 1, 1, Technischer_Bereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technischer_PunktEClass, Technischer_Punkt.class, "Technischer_Punkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnischer_Punkt_TPArt(), this.getTP_Art_TypeClass(), null, "tPArt", null, 0, 1, Technischer_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnischer_Punkt_TPBeschreibung(), this.getTP_Beschreibung_TypeClass(), null, "tPBeschreibung", null, 1, 1, Technischer_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_Anschluss_A_TypeClassEClass, TOP_Anschluss_A_TypeClass.class, "TOP_Anschluss_A_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTOP_Anschluss_A_TypeClass_Wert(), this.getENUMTOPAnschlussObject(), "wert", null, 1, 1, TOP_Anschluss_A_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_Anschluss_B_TypeClassEClass, TOP_Anschluss_B_TypeClass.class, "TOP_Anschluss_B_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTOP_Anschluss_B_TypeClass_Wert(), this.getENUMTOPAnschlussObject(), "wert", null, 1, 1, TOP_Anschluss_B_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_KanteEClass, TOP_Kante.class, "TOP_Kante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_Kante_IDTOPKnotenA(), theVerweisePackage.getID_TOP_Knoten_TypeClass(), null, "iDTOPKnotenA", null, 1, 1, TOP_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Kante_IDTOPKnotenB(), theVerweisePackage.getID_TOP_Knoten_TypeClass(), null, "iDTOPKnotenB", null, 1, 1, TOP_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Kante_TOPKanteAllg(), this.getTOP_Kante_Allg_AttributeGroup(), null, "tOPKanteAllg", null, 1, 1, TOP_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_Kante_Allg_AttributeGroupEClass, TOP_Kante_Allg_AttributeGroup.class, "TOP_Kante_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_Kante_Allg_AttributeGroup_Kantenname(), this.getKantenname_TypeClass(), null, "kantenname", null, 0, 1, TOP_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA(), this.getTOP_Anschluss_A_TypeClass(), null, "tOPAnschlussA", null, 1, 1, TOP_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB(), this.getTOP_Anschluss_B_TypeClass(), null, "tOPAnschlussB", null, 1, 1, TOP_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Kante_Allg_AttributeGroup_TOPLaenge(), this.getTOP_Laenge_TypeClass(), null, "tOPLaenge", null, 1, 1, TOP_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_KnotenEClass, TOP_Knoten.class, "TOP_Knoten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_Knoten_IDGEOKnoten(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnoten", null, 1, 1, TOP_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOP_Knoten_Knotenname(), this.getKnotenname_TypeClass(), null, "knotenname", null, 0, 1, TOP_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toP_Laenge_TypeClassEClass, TOP_Laenge_TypeClass.class, "TOP_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTOP_Laenge_TypeClass_Wert(), this.getTOP_Laenge_Type(), "wert", null, 1, 1, TOP_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tP_Art_TypeClassEClass, TP_Art_TypeClass.class, "TP_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTP_Art_TypeClass_Wert(), this.getENUMTPArtObject(), "wert", null, 1, 1, TP_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tP_Beschreibung_TypeClassEClass, TP_Beschreibung_TypeClass.class, "TP_Beschreibung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTP_Beschreibung_TypeClass_Wert(), this.getTP_Beschreibung_Type(), "wert", null, 1, 1, TP_Beschreibung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_Kante_child_AttributeGroupEClass, Trasse_Kante_child_AttributeGroup.class, "Trasse_Kante_child_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ueberhoehungEClass, Ueberhoehung.class, "Ueberhoehung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUeberhoehung_UeberhoehungAllg(), this.getUeberhoehung_Allg_AttributeGroup(), null, "ueberhoehungAllg", null, 1, 1, Ueberhoehung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehung_Allg_AttributeGroupEClass, Ueberhoehung_Allg_AttributeGroup.class, "Ueberhoehung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUeberhoehung_Allg_AttributeGroup_GEOPAD(), this.getGEO_PAD_TypeClass(), null, "gEOPAD", null, 0, 1, Ueberhoehung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehung_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 0, 1, Ueberhoehung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum(), this.getUeberhoehung_Datum_TypeClass(), null, "ueberhoehungDatum", null, 0, 1, Ueberhoehung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe(), this.getUeberhoehung_Hoehe_TypeClass(), null, "ueberhoehungHoehe", null, 1, 1, Ueberhoehung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehung_Datum_TypeClassEClass, Ueberhoehung_Datum_TypeClass.class, "Ueberhoehung_Datum_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUeberhoehung_Datum_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, Ueberhoehung_Datum_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehung_Hoehe_TypeClassEClass, Ueberhoehung_Hoehe_TypeClass.class, "Ueberhoehung_Hoehe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUeberhoehung_Hoehe_TypeClass_Wert(), this.getUeberhoehung_Hoehe_Type(), "wert", null, 1, 1, Ueberhoehung_Hoehe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehungslinieEClass, Ueberhoehungslinie.class, "Ueberhoehungslinie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUeberhoehungslinie_IDUeberhoehungA(), theVerweisePackage.getID_Ueberhoehung_TypeClass(), null, "iDUeberhoehungA", null, 1, 1, Ueberhoehungslinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehungslinie_IDUeberhoehungB(), theVerweisePackage.getID_Ueberhoehung_TypeClass(), null, "iDUeberhoehungB", null, 1, 1, Ueberhoehungslinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehungslinie_UeberhoehungslinieAllg(), this.getUeberhoehungslinie_Allg_AttributeGroup(), null, "ueberhoehungslinieAllg", null, 1, 1, Ueberhoehungslinie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehungslinie_Allg_AttributeGroupEClass, Ueberhoehungslinie_Allg_AttributeGroup.class, "Ueberhoehungslinie_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle(), this.getPlan_Quelle_TypeClass(), null, "planQuelle", null, 1, 1, Ueberhoehungslinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm(), this.getUeberhoehungslinie_Form_TypeClass(), null, "ueberhoehungslinieForm", null, 1, 1, Ueberhoehungslinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge(), this.getUeberhoehungslinie_Laenge_TypeClass(), null, "ueberhoehungslinieLaenge", null, 1, 1, Ueberhoehungslinie_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehungslinie_Form_TypeClassEClass, Ueberhoehungslinie_Form_TypeClass.class, "Ueberhoehungslinie_Form_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUeberhoehungslinie_Form_TypeClass_Wert(), this.getENUMUeberhoehungslinieFormObject(), "wert", null, 1, 1, Ueberhoehungslinie_Form_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueberhoehungslinie_Laenge_TypeClassEClass, Ueberhoehungslinie_Laenge_TypeClass.class, "Ueberhoehungslinie_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUeberhoehungslinie_Laenge_TypeClass_Wert(), this.getUeberhoehungslinie_Laenge_Type(), "wert", null, 1, 1, Ueberhoehungslinie_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(v_Profil_Art_TypeClassEClass, V_Profil_Art_TypeClass.class, "V_Profil_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getV_Profil_Art_TypeClass_Wert(), this.getENUMVProfilArtObject(), "wert", null, 1, 1, V_Profil_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumgeoFormEEnum, ENUMGEOForm.class, "ENUMGEOForm");
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_BOGEN);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_BLOSSKURVE);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_BLOSS_EINFACH_GESCHWUNGEN);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_GERADE);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_KLOTHOIDE);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_KM_SPRUNG);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_POLYLINIE);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_RICHTGERADE_KNICK_AM_ENDE_200_GON);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_SONSTIGE);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_SFORM_EINFACH_GESCHWUNGEN);
		addEEnumLiteral(enumgeoFormEEnum, ENUMGEOForm.ENUMGEO_FORM_UEBERGANGSBOGEN_SFORM);

		initEEnum(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.class, "ENUMGEOKoordinatensystem");
		addEEnumLiteral(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.ENUMGEO_KOORDINATENSYSTEM_CR0);
		addEEnumLiteral(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.ENUMGEO_KOORDINATENSYSTEM_DR0);
		addEEnumLiteral(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.ENUMGEO_KOORDINATENSYSTEM_ER0);
		addEEnumLiteral(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.ENUMGEO_KOORDINATENSYSTEM_FR0);
		addEEnumLiteral(enumgeoKoordinatensystemEEnum, ENUMGEOKoordinatensystem.ENUMGEO_KOORDINATENSYSTEM_SONSTIGE);

		initEEnum(enumHoehenlinieFormEEnum, ENUMHoehenlinieForm.class, "ENUMHoehenlinieForm");
		addEEnumLiteral(enumHoehenlinieFormEEnum, ENUMHoehenlinieForm.ENUM_HOEHENLINIE_FORM_GERADE);
		addEEnumLiteral(enumHoehenlinieFormEEnum, ENUMHoehenlinieForm.ENUM_HOEHENLINIE_FORM_PARABEL);
		addEEnumLiteral(enumHoehenlinieFormEEnum, ENUMHoehenlinieForm.ENUM_HOEHENLINIE_FORM_WEICHENABZWEIG);

		initEEnum(enumhSystemEEnum, ENUMHSystem.class, "ENUMHSystem");
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DBRH_2003);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DBRH_2016);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DHHN_12);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DHHN_2016);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DHHN_85);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_DHHN_92);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_HN_56);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_HN_76);
		addEEnumLiteral(enumhSystemEEnum, ENUMHSystem.ENUMH_SYSTEM_SONSTIGE);

		initEEnum(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.class, "ENUMOertlichkeitArt");
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_ABZW_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_ABZW_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_ANST_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_AWANST_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BF);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BF_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BFT);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BFT_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BSO);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_BZ);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_DKST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_GP);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_ABZW_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_ABZW_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_ANST_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_AWANST_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_BFT);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_DKST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_UST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_UST_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_HP_UST_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_LGR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_BF);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_BFT);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_BFT_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_GP);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_HP);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_HP_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_HP_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_HP_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_HP_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_LGR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_RB_GR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_NE_UST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_PD_GR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_RB_GR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_SBK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_SONSTIGE);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_STRW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_UST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_UST_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_UST_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_BF);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_BFT);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_HP);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_HP_ABZW);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_HP_ANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_HP_ANST_BK);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_HP_AWANST);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_LGR);
		addEEnumLiteral(enumOertlichkeitArtEEnum, ENUMOertlichkeitArt.ENUM_OERTLICHKEIT_ART_VP_RB_GR);

		initEEnum(enumPlanQuelleEEnum, ENUMPlanQuelle.class, "ENUMPlanQuelle");
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_ERSATZTRASSIERUNG);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_GIS);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_GND);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_GND_AUTOKORR);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_GND_MANKORR);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_IVL);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_IVMG);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_KOPIE);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_NEUTRASSIERUNG);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_PLANUNG);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_PT_2);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_SONSTIGE);
		addEEnumLiteral(enumPlanQuelleEEnum, ENUMPlanQuelle.ENUM_PLAN_QUELLE_VERMESSUNG);

		initEEnum(enumStreckeRichtungEEnum, ENUMStreckeRichtung.class, "ENUMStreckeRichtung");
		addEEnumLiteral(enumStreckeRichtungEEnum, ENUMStreckeRichtung.ENUM_STRECKE_RICHTUNG_A);
		addEEnumLiteral(enumStreckeRichtungEEnum, ENUMStreckeRichtung.ENUM_STRECKE_RICHTUNG_B);
		addEEnumLiteral(enumStreckeRichtungEEnum, ENUMStreckeRichtung.ENUM_STRECKE_RICHTUNG_SONSTIGE);

		initEEnum(enumtbArtEEnum, ENUMTBArt.class, "ENUMTBArt");
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_BAHNSTEIG_UNGENUTZT);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_PERSONENUNTERFUEHRUNG);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_BAHNSTEIGABSENKUNG);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_DURCHLASS);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_OBEN);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_EISENBAHNKREUZUNGSBAUWERK_UNTEN);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_EISENBAHNUEBERFUEHRUNG);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_SCHUTZWAND_LINKS);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_SCHUTZWAND_RECHTS);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_SONSTIGE);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_TUNNEL);
		addEEnumLiteral(enumtbArtEEnum, ENUMTBArt.ENUMTB_ART_UEBERFUEHRUNG_UEBER_EISENBAHN);

		initEEnum(enumtopAnschlussEEnum, ENUMTOPAnschluss.class, "ENUMTOPAnschluss");
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_ENDE);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_ENDE_BESTDIG);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_LINKS);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_MERIDIANSPRUNG);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_RB_GRENZE);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_RECHTS);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_SCHNITT);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_SONSTIGE);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_SPITZE);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_STRECKENWECHSEL);
		addEEnumLiteral(enumtopAnschlussEEnum, ENUMTOPAnschluss.ENUMTOP_ANSCHLUSS_VERBINDUNG);

		initEEnum(enumtpArtEEnum, ENUMTPArt.class, "ENUMTPArt");
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_BAHNSTEIGMONITOR);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_FBOA);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_BAHNSTEIGSPIEGEL);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_GEBAEUDE);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_HOA);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_SONSTIGE);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_MAST);
		addEEnumLiteral(enumtpArtEEnum, ENUMTPArt.ENUMTP_ART_ZUGHALTESENSOR);

		initEEnum(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.class, "ENUMUeberhoehungslinieForm");
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_GLEICHBLEIBEND);
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_RAMPE_BLOSS);
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_RAMPE_GERADE);
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_RAMPE_S);
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_SCHERE_BLOSS);
		addEEnumLiteral(enumUeberhoehungslinieFormEEnum, ENUMUeberhoehungslinieForm.ENUM_UEBERHOEHUNGSLINIE_FORM_SCHERE_S);

		initEEnum(enumvProfilArtEEnum, ENUMVProfilArt.class, "ENUMVProfilArt");
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_ANZEIGEGEFÜHRT);
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_ANZEIGEGEFÜHRT_ES);
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_SIGNALGEFÜHRT);
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_SIGNALGEFÜHRT_ES);
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_SONSTIGE);
		addEEnumLiteral(enumvProfilArtEEnum, ENUMVProfilArt.ENUMV_PROFIL_ART_WINDABHÄNGIG);

		// Initialize data types
		initEDataType(anzeigegefuehrt_ES_Kategorie_TypeEDataType, String.class, "Anzeigegefuehrt_ES_Kategorie_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Strecke_TypeEDataType, String.class, "Bezeichnung_Strecke_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumeration1EDataType, String.class, "Enumeration1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumgeoFormObjectEDataType, ENUMGEOForm.class, "ENUMGEOFormObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumgeoKoordinatensystemObjectEDataType, ENUMGEOKoordinatensystem.class, "ENUMGEOKoordinatensystemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumHoehenlinieFormObjectEDataType, ENUMHoehenlinieForm.class, "ENUMHoehenlinieFormObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumhSystemObjectEDataType, ENUMHSystem.class, "ENUMHSystemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumOertlichkeitArtObjectEDataType, ENUMOertlichkeitArt.class, "ENUMOertlichkeitArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumPlanQuelleObjectEDataType, ENUMPlanQuelle.class, "ENUMPlanQuelleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumStreckeRichtungObjectEDataType, ENUMStreckeRichtung.class, "ENUMStreckeRichtungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumtbArtObjectEDataType, ENUMTBArt.class, "ENUMTBArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumtopAnschlussObjectEDataType, ENUMTOPAnschluss.class, "ENUMTOPAnschlussObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumtpArtObjectEDataType, ENUMTPArt.class, "ENUMTPArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumUeberhoehungslinieFormObjectEDataType, ENUMUeberhoehungslinieForm.class, "ENUMUeberhoehungslinieFormObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumvProfilArtObjectEDataType, ENUMVProfilArt.class, "ENUMVProfilArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_KAD_TypeEDataType, String.class, "GEO_KAD_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_Laenge_TypeEDataType, BigDecimal.class, "GEO_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_PAD_TypeEDataType, String.class, "GEO_PAD_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_Radius_A_TypeEDataType, BigDecimal.class, "GEO_Radius_A_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_Radius_B_TypeEDataType, BigDecimal.class, "GEO_Radius_B_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geO_Richtungswinkel_TypeEDataType, BigDecimal.class, "GEO_Richtungswinkel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschwindigkeit_TypeEDataType, BigInteger.class, "Geschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gK_X_TypeEDataType, BigDecimal.class, "GK_X_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gK_Y_TypeEDataType, BigDecimal.class, "GK_Y_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gK_Z_TypeEDataType, BigDecimal.class, "GK_Z_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hoehenlinie_Laenge_TypeEDataType, BigDecimal.class, "Hoehenlinie_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hoehenpunkt_Hoehe_TypeEDataType, BigDecimal.class, "Hoehenpunkt_Hoehe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kantenname_TypeEDataType, String.class, "Kantenname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(knotenname_TypeEDataType, String.class, "Knotenname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(neigung_TypeEDataType, BigDecimal.class, "Neigung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oertlichkeit_Abkuerzung_TypeEDataType, String.class, "Oertlichkeit_Abkuerzung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oertlichkeit_Kurzname_TypeEDataType, String.class, "Oertlichkeit_Kurzname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oertlichkeit_Langname_TypeEDataType, String.class, "Oertlichkeit_Langname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strecke_Meter_TypeEDataType, BigDecimal.class, "Strecke_Meter_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tB_Beschreibung_TypeEDataType, String.class, "TB_Beschreibung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(toP_Laenge_TypeEDataType, BigDecimal.class, "TOP_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tP_Beschreibung_TypeEDataType, String.class, "TP_Beschreibung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ueberhoehung_Hoehe_TypeEDataType, BigDecimal.class, "Ueberhoehung_Hoehe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ueberhoehungslinie_Laenge_TypeEDataType, BigDecimal.class, "Ueberhoehungslinie_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (enumHoehenlinieFormEEnum,
		   source,
		   new String[] {
			   "documentation", "spa/WS 31.07.2018"
		   });
		addAnnotation
		  (enumvProfilArtEEnum,
		   source,
		   new String[] {
			   "documentation", "ES: Erh\u00f6hte Seitenbeschleunigung"
		   });
		addAnnotation
		  (geO_KanteEClass,
		   source,
		   new String[] {
			   "documentation", "Kante des topografischen Knoten-Kanten-Modells. Die GEO_Kante ist vom GEO_Knoten A zum GEO_Knoten B gerichtet (GEO Richtungswinkel) und muss immer an zwei GEO_Knoten enden. Die L\u00e4nge einer GEO_Kante zwischen den GEO_Knoten A und B entspricht der realen Gleisl\u00e4nge zwischen diesen Knoten und wird im Attribut GEO Laenge gespeichert. Mit Bezug auf die Regeln zu den Gleisnetzdaten (GND) ist die L\u00e4nge einer GEO_Kante stets kleiner 10 km. Eine GEO_Kante besitzt eine geometrische Form, die durch GEO Form beschrieben wird. GEO_Kanten werden f\u00fcr die Abbildung der Gleislinie und der Kilometrierungslinie verwendet. Eine Unterscheidung dieser Anwendung erfolgt durch den Verweis ID GEO Art. Der GEO_Radius (GEO Radius A und GEO Radius B) ist negativ, wenn die GEO_Kante vom GEO_Knoten_A in einem Linksbogen f\u00fchrt und ist positiv, wenn diese in einen Rechtsbogen f\u00fchrt. Die beiden Radien sind jeweils der Radius an der A- bzw. B-Seite der GEO_Kante. Bei einem Kreisbogen wird nur der GEO Radius A angegeben. F\u00fcr eine Gerade wird dieser Radius mit 0.000 definiert. Ein Algorithmus zur Darstellung eines Punktes auf einem \u00dcbergangsbogen kann der folgenden Literaturquelle entnommen werden: Media:Literatur Uebergangsbogen.pdf. "
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOArt(),
		   source,
		   new String[] {
			   "documentation", "Durch den Verweis auf eine TOP_Kante wird die GEO_Kante als Gleislinie, beim Verweis auf eine Strecke als Kilometrierungslinie und beim Verweis auf eine Trasse_Kante als Kabel- bzw. Medientrassenlinie definiert. Der Startpunkt einer TOP-Kante ist \u00fcber die Verweise auf einen TOP-Knoten A und anschlie\u00dfend auf einen GEO-Knoten A oder GEO-Knoten B identifizierbar. Wenn der Verweis auf GEO-Knoten A f\u00e4llt, liegt der Verlauf der GEO-Kante in Richtung der TOP-Kante, andernfalls in Gegenrichtung. Weitere GEO-Kanten werden mit End- und Anfangs-Knoten verbunden, bis auf den End-Knoten einer GEO-Kante wiederum von einem TOP-Knoten B verwiesen wird. DIe Verfahrensweise ist bei Trassen-Kanten analog."
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOKnotenA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den GEO Knoten am Anfang der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert."
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOKnotenB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den GEO Knoten am Ende der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert."
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOForm(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung der geometrischen Form der Gleis-Kante. In Abh\u00e4ngigkeit von der Geo_Form werden die Attribute GEO Radius A und GEO Radius B mit entsprechenden Werten bef\u00fcllt oder bleiben LEER. Beispiel: GEO_Form: Gerade GEO_Radius_A = LEER GEO_Radius_B = LEER GEO_Form: BOGEN GEO_Radius_A = Radius GEO_Radius_B = LEER "
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOKAD(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der topografischen Kantenadresse. Aktuell ist eine Verwendung bei der \u00dcbernahme von Trassierungsdaten (ASCIBAHN) vorgesehen."
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOLaenge(),
		   source,
		   new String[] {
			   "documentation", "L\u00e4nge der GEO Kante. Die L\u00e4nge wird aus den DB-GIS-Daten oder einem Trassierungsentwurf mit der dort vorhandenen Genauigkeit entnommen."
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusA(),
		   source,
		   new String[] {
			   "documentation", "Zugeh\u00f6rige Parameter f\u00fcr die GEO_Form Gerade: kein zus\u00e4tzlicher Parameter erforderlich oder 0.00000 angeben; Bogen: GEO_Radius_A enth\u00e4lt den Radius (Anfangsradius = Endradius) in [m]; Richtgerade Knick am Ende: GEO_Radius_A enth\u00e4lt den Brechungswinkel am Ende in [gon]; Alle anderen Kanten: GEO_Radius_A enth\u00e4lt den Anfangsradius in [m]. In Abh\u00e4ngigkeit der Bogenrichtung am GEO_Knoten_A wird der Radius bei einem Linksbogen negativ und bei einem Rechtsbogen positiv angegeben. "
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusB(),
		   source,
		   new String[] {
			   "documentation", "Zugeh\u00f6rige Parameter f\u00fcr die GEO_Form Gerade: kein zus\u00e4tzlicher Parameter; Bogen: kein zus\u00e4tzlicher Parameter; Richtgerade Knick am Ende: kein zus\u00e4tzlicher Parameter; Alle anderen Kanten: GEO_Bogen_B enth\u00e4lt den Endradius in [m]. In Abh\u00e4ngigkeit der Bogenrichtung am GEO_Knoten_A wird der Radius bei einem Linksbogen negativ und bei einem Rechtsbogen positiv angegeben. Die Bogenrichtung ist immer identisch zum GEO_Radius_A. "
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel(),
		   source,
		   new String[] {
			   "documentation", "Parameter f\u00fcr eine GEO Kante, der den Bezugswinkel (Tangente) am Anfang einer GEO_Kante darstellt. Das Attribut GEO_Richtungswinkel enth\u00e4lt den Richtungswinkel der Geo-Kante am Anfang in [gon]. Es gilt nachfolgende Zuordnung der Richtung: Nord = 0,0 gon Ost = 100,0 gon S\u00fcd = 200,0 gon West = 300,0 gon originale negative Werte werden durch Addition von 400.0 gon normalisiert. "
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (geO_KnotenEClass,
		   source,
		   new String[] {
			   "documentation", "Knoten des topografischen Knoten-Kanten-Modells. Die Anzahl der anschlie\u00dfenden topografischen Kanten (Gleislinie oder Kilometrierungslinie) ist je nach Art des GEO Knoten bzw. Art des zugeh\u00f6rigen TOP Knoten unterschiedlich: F\u00fcr die Gleislinie gilt: Eine GEO-Kante: Der GEO_Knoten ist gleichzeitig auch ein TOP Knoten, an dem die Topografie und Topologie endet (z. B. Gleisende, Betrachtungsende oder Digitalisierungsende). Zwei GEO-Kanten: Der GEO_Knoten verweist nicht auf einen TOP Knoten: \u00c4nderung der Geometrie des Gleises oder Vermessungspunkt. Drei GEO-Kanten: Der GEO_Knoten ist gleichzeitig auch ein Knoten, an dem eine Verzweigung der Gleis- oder Kilometrierungslinie vorhanden ist. \u00dcber einen Verweis von GEO Punkt zu GEO_Knoten werden die realen Koordinaten (ggf. auch von mehreren Koordinatensystemen) dieses Knotens zugeordnet. Weitere F\u00e4lle mit 0..1 anschlie\u00dfenden GEO-Kanten treten an GEO_Knoten auf, an deren Stelle sich auch ein TOP Knoten der Art Verbindungsknoten befindet (siehe Beschreibung Verbindungsknoten). "
		   });
		addAnnotation
		  (getGEO_Knoten_GEOPAD(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus dem DB-GIS f\u00fcr jeden Vermessungspunkt bereitgestellt. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB Netz AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten h\u00e4ndisch (z.B. von Ivl-Pl\u00e4nen nachgezeichnet) erstellt wurden, wird das Attribut nicht bef\u00fcllt. "
		   });
		addAnnotation
		  (geO_PunktEClass,
		   source,
		   new String[] {
			   "documentation", "Topographischer Punkt im Koordinatensystem zur eindeutige Zuordnung im realen Gel\u00e4nde. Alle Objekte, die einen entsprechenden Bezug erfordern, werden \u00fcber andere Objekte (z.B Verortung an der Topologie) oder auch direkt auf dieses Objekt abgebildet."
		   });
		addAnnotation
		  (getGEO_Punkt_IDGEOKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf eine GEO_Kante, wenn der GEO_Punkt als St\u00fctzpunkt einer Polylinie fungiert. Eine Polylinie kann durch bis zu 999\nGEO_Punkte beschrieben werden. Es ist jedoch auch zul\u00e4ssig, eine virtuelle Polylinie ohne GEO_Punkte\ndarzustellen."
		   });
		addAnnotation
		  (getGEO_Punkt_IDGEOKnoten(),
		   source,
		   new String[] {
			   "documentation", "ID des GEO_Knoten, auf den dieser GEO Punkt verweist. Einem GEO Knoten k\u00f6nnen \u00fcber diesen Verweis mehrere GEO_Punkte zugewiesen werden. Das ist erforderlich, wenn ein GEO_Knoten in unterschiedlichen Koordinatensystemen zugeordnet ist. "
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatensystem(),
		   source,
		   new String[] {
			   "documentation", "Angabe der topographischen Koordinaten des Geo-Punkts, in der Regel in LSys-Koordinaten. Neben den eigentlichen Koordinaten (x, y, z) wird auch das konkrete Koordinatensystem in der Bezeichnung dargestellt. Bei \u00fcbergreifenden Koordinaten in Grenzbereichen, die nicht mit LSys darstellbar sind, ist der Wert \\\"sonstige\\\" zu verwenden und das Koordinatensystem mittels Bearbeitungsvermerk anzugeben. Folgende Wertigkeiten (3 Zeichen) liefert das Attribut LSys (s. a. Spezifikation Gleisnetzdaten der DB): 1. Zeichen: C Meridianstreifen 6\u00b0 \u00f6stliche L\u00e4nge; D Meridianstreifen 9\u00b0 \u00f6stliche L\u00e4nge; E Meridianstreifen 12\u00b0 \u00f6stliche L\u00e4nge; F Meridianstreifen 15\u00b0 \u00f6stliche L\u00e4nge. 2. Zeichen: A System RD/83 - Bessel-Ellipsoid, Datumspunkt Rauenberg (westliche Bundesl\u00e4nder, Sachsen); B System PD/83 - Bessel-Ellipsoid, Datumspunkt Potsdam (Th\u00fcringen); C System 42/83 - Krassowski-Ellipsoid, Datumspunkt Pulkowo (Brandenburg, Mecklenburg, Sachsen-Anhalt); R DB-Referenzsystem (Kartesische Koordinaten); S System Soldner - Netz 88, Datumspunkt M\u00fcggelberg (Berlin). 3. Zeichen: 0 DB-GIS Bezugsystem; A..9 Sonstige kartesische Koordinaten."
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKX(),
		   source,
		   new String[] {
			   "documentation", "Ost-Wert, Rechtswert oder Latitude des definierten Koordinatensystems."
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKY(),
		   source,
		   new String[] {
			   "documentation", "Nord-Wert, Hochwert oder Longitude des definierten Koordinatensystems."
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKZ(),
		   source,
		   new String[] {
			   "documentation", "H\u00f6hen-Wert oder Altitude des definierten Koordinatensystems. Aktuell steht die z-Koordinate dem System nicht zur Verf\u00fcgung. Die z-Koordinate f\u00fcr den GEO_Punkt k\u00f6nnte durch Interpolation vorhandener H\u00f6henpunkte Links und Rechts generiert werden. Wenn zu einem sp\u00e4teren Zeitpunkt die z-Koordinaten mitgeliefert werden, k\u00f6nnten die H\u00f6henpunkte durch die z-Koordinaten ersetzt werden."
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (geschwindigkeitsprofilEClass,
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit der Strecke, bei ETCS auch au\u00dferhalb der durchgehenden Hauptgleise. Das Geschwindigkeitsprofil wird zusammengesetzt aus Bereichen mit konstanten Geschwindigkeiten. Es kann in unterschiedlichen Arten (z. B. NeiTec, ETCS) ausgepr\u00e4gt sein. F\u00fcr jede Art wird ein separates Geschwindigkeitsprofil angelegt. \\\"Geschwindigkeitsband\\\" ist ein Synonym f\u00fcr Geschwindigkeitsprofil. Unabh\u00e4ngig vom Geschwindigkeitsprofil k\u00f6nnen in Elementen (Weiche, Gleisabschnitt) eigene Geschwindigkeiten hinterlegt sein. Je nach Anwendung wird \u00fcber die G\u00fcltigkeit der in den Elementen hinterlegten Geschwindigkeit oder der des Geschwindigkeitsprofils entschieden."
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_AnzeigegefuehrtESKategorie(),
		   source,
		   new String[] {
			   "documentation", "Kategorie f\u00fcr Geschwindigkeitsprofile der Art \\\"anzeigefef\u00fchrt ES\\\", z. B. G\u00fcltigkeit f\u00fcr Reise- oder G\u00fcterz\u00fcge."
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige Geschwindigkeit nach jeweiligem Geschwindigkeitsprofil. "
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Geschwindigkeitsprofils."
		   });
		addAnnotation
		  (hoehenlinieEClass,
		   source,
		   new String[] {
			   "documentation", "H\u00f6henverlauf zwischen zwei H\u00f6henpunkten."
		   });
		addAnnotation
		  (getHoehenlinie_IDHoehenpunktA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Hoehenpunkt am Anfang der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert."
		   });
		addAnnotation
		  (getHoehenlinie_IDHoehenpunktB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Hoehenpunkt am Ende der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert."
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm(),
		   source,
		   new String[] {
			   "documentation", "Form der Hoehenlinie, z. B. Gerade."
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge(),
		   source,
		   new String[] {
			   "documentation", "L\u00e4nge der Hoehenlinie. Genauigkeit: Tausendstel m = 1 mm."
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (hoehenpunktEClass,
		   source,
		   new String[] {
			   "documentation", "\u00d6rtliche H\u00f6he des Bezugspunkts in Metern gem\u00e4\u00df H\u00f6hensystem. Liegt der H\u00f6henpunkt innerhalb des zugeh\u00f6rigen Gleises, entf\u00e4llt die Angabe eines seitlichen Abstands bzw. einer seitlichen Lage. Wird ein seitlicher Abstand ungleich 0.000 angegeben, so handelt es sich um einen sonstigen H\u00f6henpunkt, der nicht die H\u00f6henlage des Gleises angibt. Ein H\u00f6henpunkt, der unmittelbar auf einem Anfang oder Ende eines Weichenschenkels liegt (TOP_Kante, mit Anschluss_A oder Anschluss_B als Links oder Rechts) ist auf die TOP_Kante der Spitze dieser Weiche zu verorten."
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus dem DB-GIS f\u00fcr jeden Vermessungspunkt bereitgestellt. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB Netz AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten h\u00e4ndisch (z.B. von Ivl-Pl\u00e4nen nachgezeichnet) erstellt wurden, wird das Attribut nicht bef\u00fcllt. "
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum(),
		   source,
		   new String[] {
			   "documentation", "Aufnahmedatum der H\u00f6henwerte des Hoehenpunktes. GND: Punktdatum; Ivl und Ivmg: Datum der letzten Bearbeitung; Kopie: Datum aus kopierter H\u00f6he; Neutrassierung: Freigabedatum; sonstige: Datum der letzten Bearbeitung.\nDie Information wird zuk\u00fcnftig \u00fcber das Attribut Datum_Regelwerk abgebildet. Das Attribut soll daher langfristig entfallen."
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe(),
		   source,
		   new String[] {
			   "documentation", "Angabe der H\u00f6he bezogen auf das H\u00f6hensystem in Meter. Genauigkeit: Tausendstel m = 1 mm."
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HSystem(),
		   source,
		   new String[] {
			   "documentation", "Angabe, auf welchem H\u00f6hensystem die Angabe der H\u00f6he beruht. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_Neigung(),
		   source,
		   new String[] {
			   "documentation", "Neigung des Gleises bzw. der Hoehenlinie am Ort des Hoehenpunkts. Die Art der Neigung (Steigung/Gef\u00e4lle) muss durch Auswertung der Wirkrichtung ermittelt werden. Die Angabe ist nur bei Vorhandensein einer H\u00f6henlinie sinnvoll."
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (oertlichkeitEClass,
		   source,
		   new String[] {
			   "documentation", "Bahnanlagen und Betriebsstellen des Netzes. Die \u00d6rtlichkeit muss eine g\u00fcltige Bezeichnung nach Ril 100 beinhalten und kann mittels ID Strecke Punkt mehreren Strecken mit Bezugskilometer zugeordnet sein. DB-Regelwerk Richtlinie 100.0001 Abschnitt 1 (1) "
		   });
		addAnnotation
		  (getOertlichkeit_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "Verweis zur (betrieblichen) Zuordnung von Bahnhofsteilen zu Bahnh\u00f6fen und von Betriebsstellen untereinander. "
		   });
		addAnnotation
		  (getOertlichkeit_IDOertlichkeitAwanstBedient(),
		   source,
		   new String[] {
			   "documentation", "Bei Awanst: Angabe der \u00d6rtlichkeit, von der die Awanst bedient wird."
		   });
		addAnnotation
		  (getOertlichkeit_IDStreckePunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen bzw. mehrere Streckenpunkt(e) zur Lokalisierung der \u00d6rtlichkeit im Netz. Die Information wird f\u00fcr die Erstellung der Ausgabeformate ben\u00f6tigt."
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt(),
		   source,
		   new String[] {
			   "documentation", "Art der \u00d6rtlichkeit. Die Bef\u00fcllungen sind der ENUM-Liste von Bahnanlagen und Betriebsstellen des Netzes, weiterer \u00d6rtlichkeiten mit Fahrplanzeiten sowie sonstiger Punkte zu entnehmen und m\u00fcssen in der Regel mit der Angabe in der Ril 100 \u00fcbereinstimmen. Ab der Version 1.8.0 wird die Schreibweise der ENUM-Werte identisch zur Ril 100 \u00fcbernommen, indem Umlaute und Leezeichen verwendet werden. Die im Glossar mit (E) gekennzeichneten Werte entfallen zuk\u00fcnftig und sollen daher nicht mehr f\u00fcr Neuanwendungen genutzt werden. DB-Regelwerk Die verwendeten Codierungen sind im Anhang 1 Abschnitt 3 der Richtlinie 100.0001 zusammengestellt und in ihrer Bedeutung erkl\u00e4rt. "
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb(),
		   source,
		   new String[] {
			   "documentation", "G\u00fcltig ab ist eine Angabe zum ersten G\u00fcltigkeitstag der Abk\u00fcrzung oder eine andere Angabe gem\u00e4\u00df Regelwerk. DB-Regelwerk Die Angaben zur G\u00fcltigkeit sind in Richtlinie 100.0001 Abschnitt 4 (2) geregelt."
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis(),
		   source,
		   new String[] {
			   "documentation", "G\u00fcltig bis ist eine Angabe zum letzten G\u00fcltigkeitstag der Abk\u00fcrzung oder eine andere Angabe gem\u00e4\u00df Regelwerk. DB-Regelwerk Die Angaben zur G\u00fcltigkeit sind in Richtlinie 100.0001 Abschnitt 4 (2) geregelt."
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung(),
		   source,
		   new String[] {
			   "documentation", "2- bis 5-stellige Abk\u00fcrzung der \u00d6rtlichkeit gem\u00e4\u00df Ril 100.0001. Beispiel P-Hausen: PPHN."
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname(),
		   source,
		   new String[] {
			   "documentation", "16-stelliger Name der \u00d6rtlichkeit. Der Kurzname wird der Ril 100 entnommen und muss in der Schreibweise mit dieser \u00fcbereinstimmen. DB-Regelwerk Die Bildung des Kurznamens ist in Richtlinie 100.0001 Abschnitt 3 (6) beschrieben."
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname(),
		   source,
		   new String[] {
			   "documentation", "40-stelliger Name der \u00d6rtlichkeit Der Langname einer \u00d6rtlichkeit wird i. d. R nur dann abweichend zum Kurznamen gebildet, wenn die 16 Zeichen des Kurznamens nicht ausreichend sind. Anderenfalls sind Kurzname und Langname identisch. DB-Regelwerk Die Bildung des Langnamens ist in Richtlinie 100.0001 Abschnitt 3 (6) beschrieben."
		   });
		addAnnotation
		  (streckeEClass,
		   source,
		   new String[] {
			   "documentation", "Topologische Darstellung der Kilometrierungsachse. Die topologische Kilometrierungsachse wird durch fortlaufende Aneinanderreihung von GEO-Kanten gebildet, die mittels ID GEO Art auf diese Strecke verweisen. "
		   });
		addAnnotation
		  (getStrecke_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke(),
		   source,
		   new String[] {
			   "documentation", "Streckenbezeichnung der DB AG. Streckenbezeichnungen sind i. d. R vierstellig. Ist aber z. B. der Verlauf der beiden Gleise einer zweigleisigen Strecke so unterschiedlich, dass eine getrennte Kilometrierung notwendig ist, wird der vierstelligen Bezeichnung noch eine Kennung (-1) angeh\u00e4ngt. Beispiel: Stecke 6240 ist zweigleisig. Bedingt durch einen anderen Verlauf der linken und rechten Gleislage, bekommt z. B. das linke Gleis eine andere Kilometrierung. Strecke 6240 (Rechts); Strecke 6240-1 (Links). DB-Regelwerk 885.6002A03"
		   });
		addAnnotation
		  (strecke_BremswegEClass,
		   source,
		   new String[] {
			   "documentation", "Bremswegabstand der Strecke als Eingangsgr\u00f6\u00dfe f\u00fcr die LST-Planung. Die Vorgabe erfolgt in der BAst."
		   });
		addAnnotation
		  (getStrecke_Bremsweg_Bremsweg(),
		   source,
		   new String[] {
			   "documentation", "Bremsweg als Grundlage f\u00fcr die Dimesionierung der zugeh\u00f6rigen Strecke. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getStrecke_Bremsweg_StreckeRichtung(),
		   source,
		   new String[] {
			   "documentation", "Richtung der Strecke, f\u00fcr die der Bremsweg vorgegeben ist. Die Richtung wird topologisch \u00fcber das Attribut Richtungsbezug (Bereich_Objekt) abgetragen."
		   });
		addAnnotation
		  (strecke_PunktEClass,
		   source,
		   new String[] {
			   "documentation", "Topologischer Punkt auf der zugeh\u00f6rigen Streckenlinie mit dem Wert der Streckenkilometrierung in Meterschreibweise. Der Streckenpunkt kann auf einen GEO Knoten verweisen, der \u00fcber einen (oder mehrere) GEO_Punkte geografisch referenziert wird. Ohne diesen Verweis wird der Streckenpunkt nur auf eine Strecke mit Streckenkilometer referenziert. Die GEO Knoten sind \u00fcber GEO_Kanten untereinander verbunden und beschreiben in ihrer Gesamtheit eine Streckenlinie. Jede Strecke hat mindestens zwei Streckenpunkte als Anfang und Ende der Strecke. Der GEO Knoten am Anfang bzw. am Ende einer Streckenlinie hat nur eine GEO Kante, ansonsten sind es zwei. An einem Kilometersprung werden zwei Streckenpunkte (ggf. mit identischen GEO-Koordinaten) gebildet. Die L\u00e4nge der verbindende GEO_Kante (- oder +) beinhaltet den Wert des Kilometersprunges. Eine \u00dcberl\u00e4nge ist negativ, eine Fehll\u00e4nge ist positiv."
		   });
		addAnnotation
		  (getStrecke_Punkt_IDGEOKnoten(),
		   source,
		   new String[] {
			   "documentation", "ID des GEO_Knoten, auf den der Strecke_Punkt verweist. Der Verweis ist nur zu bef\u00fcllen, wenn auch eine Streckenlinie mit GEO-Daten vorhanden ist. F\u00fcr jeden GEO_Knoten der Streckenachse wird dabei ein Strecke_Punkt erstellt."
		   });
		addAnnotation
		  (getStrecke_Punkt_IDStrecke(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung eines Streckenpunktes zu einer Streckennummer."
		   });
		addAnnotation
		  (getStrecke_Punkt_StreckeMeter(),
		   source,
		   new String[] {
			   "documentation", "Kilometer an einem Knoten der Streckenlinie in Meterschreibweise. Dieses Attribut ist f\u00fcr jeden Streckenpunkt zu bef\u00fcllen. Im Datenmodell sind die Werte als TMeter mit 3 Nachkommastellen abgespeichert (Genauigkeit f\u00fcr Darstellung in CAD-Systemen: Tausendstel m = 1 mm)."
		   });
		addAnnotation
		  (technischer_BereichEClass,
		   source,
		   new String[] {
			   "documentation", "Beschreibung sonstiger bereichsf\u00f6rmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder w\u00e4hrend einer Planung manuell erg\u00e4nzt. Sie dienen nur zur Information f\u00fcr planerische Entscheidungen."
		   });
		addAnnotation
		  (getTechnischer_Bereich_TBArt(),
		   source,
		   new String[] {
			   "documentation", "Art des technischen Bereichs. Anhand der in der Planung entstehenden Erfahrungen wird die ENUM-Liste erweitert. \nSchutzwand: bauliches Element in unmittelbarer N\u00e4he des Gleises, das bei der Platzierung von Elementen zu ber\u00fccksichtigen ist (z. B. St\u00fctzmauer, Schallschutzwand)."
		   });
		addAnnotation
		  (getTechnischer_Bereich_TBBeschreibung(),
		   source,
		   new String[] {
			   "documentation", "Verbale Beschreibung oder Bezeichnung des technischen Bereichs."
		   });
		addAnnotation
		  (technischer_PunktEClass,
		   source,
		   new String[] {
			   "documentation", "Beschreibung sonstiger punktf\u00f6rmiger Objekte im Datenmodell. Diese werde durch Fremdsysteme bereitgestellt oder w\u00e4hrend einer Planung manuell erg\u00e4nzt. Sie dienen nur zur Information f\u00fcr planerische Entscheidungen."
		   });
		addAnnotation
		  (getTechnischer_Punkt_TPArt(),
		   source,
		   new String[] {
			   "documentation", "Art des technischen Punktes. Anhand der in der Planung entstehenden Erfahrungen wird die ENUM-Liste erweitert."
		   });
		addAnnotation
		  (getTechnischer_Punkt_TPBeschreibung(),
		   source,
		   new String[] {
			   "documentation", "Verbale Beschreibung oder Bezeichnung des technischen Punktes."
		   });
		addAnnotation
		  (toP_KanteEClass,
		   source,
		   new String[] {
			   "documentation", "Kante des topologischen Knoten-Kanten-Modells zur Darstellung der Gleislinien. Die TOP_Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei TOP Knoten enden. Eine TOP_Kante kann mehrere topographische Kanten (GEO_Kanten) beinhalten, die \u00fcber GEO Knoten fortlaufend miteinander verbunden sind. Ein TOP Knoten ist immer auch ein GEO Knoten. Die L\u00e4nge einer TOP Kante zwischen den Knoten A und B entspricht der Summe der GEO_Kanten zwischen A und B (reale Gleisl\u00e4nge) und wird auf Millimetergenauigkeit gerundet. Die maximale L\u00e4nge einer TOP_Kante ist im Modell auf 99999,999 m (\\u0026lt;100 km) begrenzt. Um ein eindeutiges Routing im topologischen Modell zu erm\u00f6glichen, sind die Anschlussarten der Kante an den beiden Knoten A und B anzugeben (siehe Attribute TOP_Anschluss_A bzw. TOP_Anschluss_B). Hierbei ist zu beachten, dass ein Routing \u00fcber die Verbindung Anschluss Links - Rechts ausgeschlossen ist. "
		   });
		addAnnotation
		  (getTOP_Kante_IDTOPKnotenA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den TOP Knoten am Anfang der Kante. Beginn der laufenden L\u00e4nge, d. h. laufende L\u00e4nge == 0."
		   });
		addAnnotation
		  (getTOP_Kante_IDTOPKnotenB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den TOP Knoten am Ende der Kante. Ende der laufenden L\u00e4nge, d. h. laufende L\u00e4nge = TOP Laenge."
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_Kantenname(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung f\u00fcr die Kante. Die Bezeichnung wird beispielsweise bei Neutrassierungen (ASCIBAHN) \u00fcbernommen um eine Verkn\u00fcpfung der gelieferten Trassierungsdaten mit den an den LST-Fachplaner \u00fcbegebenen PlanPro-Geodaten sicherzustellen."
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA(),
		   source,
		   new String[] {
			   "documentation", "Art des Anschlusses am Ende A der TOP_Kante. Eine TOP_Kante muss sowohl am Ende A als auch am Ende B auf einem TOP_Knoten verweisen. In der Regel schlie\u00dfen an einen TOP_Knoten weitere TOP_Kanten an. Wenn an einem TOP_Knoten nur eine TOP_Kante anschlie\u00dft, endet an diesem Knoten die Topologie des Gleisnetzes. Nachfolgende Arten des Endes einer Topologie sind vorgesehen: Ende - reales Ende einer Gleislinie (z.B. Prellbock, F\u00e4hranleger, ...). Ende_Bestdig - tempor\u00e4res Ende einer Gleislinie, die real weiterf\u00fchrt, aber deren Weiterf\u00fchrung noch nicht im Modell hinterlegt ist. Schnitt - Anschlusspunkt einer Neutrassierung an einen vorhandenen Bestand der Gleislinie. Im Bestand muss dieser Knoten nur ein GEO Punkt sein. Nach dem Einbinden der Neutrassierung in die Bestandsgleislage entf\u00e4llt dieser TOP_Knoten durch eine neue durchlaufende TOP_Kante. Hinweis f\u00fcr die Fahrwegfindung (Routing): Endet ein Routing auf LINKS oder RECHTS, darf nur ein Fahrweg (Routing) vom gleichen Knoten \u00fcber die SPITZE gesucht werden. Endet ein Routing auf SPITZE, findet eine Fahrwegverzweigung statt, d.h. vom gleichen Knoten werden zwei getrennte Fahrwege (Routings) \u00fcber LINKS und RECHTS gesucht. Bei einer Kante mit dem Anschluss VERBINDUNG ist die nachfolgende Infrastruktur aufgrund des Zuschnitts des Planungsbereichs nicht verf\u00fcgbar. Folgende Werte-Kombinationen entstehen daher f\u00fcr TOP_Knoten.Art Besonders (E) und TOP_Kante.TOP_Anschluss_A bzw. ..._B: Art des TOP_Knoten TOP_Knoten.Art Besonders TOP_Kante.TOP_Anschluss_... Verbindungsknoten Verbindung (E) Verbindung Weichenknoten - Links, Rechts, Spitze Infrastrukturende (Gleisabschluss) - Ende Digitalisierungsende Ende_Bestdig (E) Ende_Bestdig "
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB(),
		   source,
		   new String[] {
			   "documentation", "Art des Anschlusses am Ende B der TOP_Kante. Eine TOP_Kante muss sowohl am Ende A als auch am Ende B auf einem TOP_Knoten verweisen. In der Regel schlie\u00dfen an einen TOP_Knoten weitere TOP_Kanten an. Wenn an einem TOP_Knoten nur eine TOP_Kante anschlie\u00dft, endet an diesem Knoten die Topologie des Gleisnetzes. Nachfolgende Arten des Endes einer Topologie sind vorgesehen: Ende - reales Ende einer Gleislinie (z.B. Prellbock, F\u00e4hranleger, ...). Ende_Bestdig - tempor\u00e4res Ende einer Gleislinie, die real weiterf\u00fchrt, aber deren Weiterf\u00fchrung noch nicht im Modell hinterlegt ist. Schnitt - Anschlusspunkt einer Neutrassierung an einen vorhandenen Bestand der Gleislinie. Im Bestand muss dieser Knoten nur ein GEO Punkt sein. Nach dem Einbinden der Neutrassierung in die Bestandsgleislage entf\u00e4llt dieser TOP_Knoten durch eine neue durchlaufende TOP_Kante. Hinweis f\u00fcr die Fahrwegfindung (Routing): Endet ein Routing auf LINKS oder RECHTS, darf nur ein Fahrweg (Routing) vom gleichen Knoten \u00fcber die SPITZE gesucht werden. Endet ein Routing auf SPITZE, findet eine Fahrwegverzweigung statt, d.h. vom gleichen Knoten werden zwei getrennte Fahrwege (Routings) \u00fcber LINKS und RECHTS gesucht. Bei einer Kante mit dem Anschluss VERBINDUNG ist die nachfolgende Infrastruktur aufgrund des Zuschnitts des Planungsbereichs nicht verf\u00fcgbar. Folgende Werte-Kombinationen entstehen daher f\u00fcr TOP_Knoten.Art Besonders (E) und TOP_Kante.TOP_Anschluss_A bzw. ..._B: Art des TOP_Knoten TOP_Knoten.Art Besonders TOP_Kante.TOP_Anschluss_... Verbindungsknoten Verbindung (E) Verbindung Weichenknoten - Links, Rechts, Spitze Infrastrukturende (Gleisabschluss) - Ende Digitalisierungsende Ende_Bestdig (E) Ende_Bestdig "
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPLaenge(),
		   source,
		   new String[] {
			   "documentation", "L\u00e4nge der TOP-Kante. Genauigkeit: Tausendstel m = 1 mm."
		   });
		addAnnotation
		  (toP_KnotenEClass,
		   source,
		   new String[] {
			   "documentation", "Knoten des topologischen Knoten-Kanten-Modells. Der TOP_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den TOP_Knoten anschlie\u00dfenden topologischen Kanten ist je nach Art des TOP_Knoten unterschiedlich und muss mit der Anzahl der an den zugeh\u00f6rigen GEO Knoten anschlie\u00dfenden GEO_Kanten \u00fcbereinstimmen: eine TOP-Kante: Gleisende, Digitalisierungsende, Betrachtungsende; drei TOP-Kanten: verzweigendes Fahrwegelement (siehe Modellierung Weichen). Weitere F\u00e4lle mit 0..2 anschlie\u00dfenden TOP-Kanten treten am Verbindungsknoten auf (siehe entsprechende Beschreibung). Im Fall eines Meridiansprungs werden zwei TOP_Knoten angelegt, die mit einer TOP_Kante der L\u00e4nge Null verbunden werden. an die beiden TOP_Knoten schlie\u00dfen also genau zwei TOP_Kanten an."
		   });
		addAnnotation
		  (getTOP_Knoten_IDGEOKnoten(),
		   source,
		   new String[] {
			   "documentation", "Ein TOP_Knoten f\u00e4llt immer mit einem GEO_Knoten der Gleislinie zusammen. "
		   });
		addAnnotation
		  (getTOP_Knoten_Knotenname(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung f\u00fcr den Knoten. Die Bezeichnung wird aus dem DB-GIS System \u00fcbernommen um die Referenz sicherzustellen. Bei Neutrassierung kann diese Bezeichnung leer bleiben. "
		   });
		addAnnotation
		  (ueberhoehungEClass,
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlicher H\u00f6henunterschied beider Schienen eines Gleises in Querrichtung. Die \u00dcberh\u00f6hung ist eine Querneigung eines Gleises in einem Bogen an einem Punkt im Gleis. Es wird immer die bogen\u00e4u\u00dfere Schiene \u00fcberh\u00f6ht. Ein H\u00f6henpunkt, der unmittelbar auf einem Anfang oder Ende eines Weichenschenkels liegt (TOP_Kante, mit Anschluss_A oder Anschluss_B als Links oder Rechts) ist auf die TOP_Kante der Spitze dieser Weiche zu verorten."
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus dem DB-GIS f\u00fcr jeden Vermessungspunkt bereitgestellt. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB Netz AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten h\u00e4ndisch (z.B. von Ivl-Pl\u00e4nen nachgezeichnet) erstellt wurden, wird das Attribut nicht bef\u00fcllt. "
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum(),
		   source,
		   new String[] {
			   "documentation", "Aufnahmedatum der Koordinaten der \u00dcberh\u00f6hung. GND: Punktdatum; Ivl und Ivmg: Datum der letzten Bearbeitung; Kopie: Datum aus kopierter H\u00f6he; Neutrassierung: Freigabedatum; sonstige: Datum der letzten Bearbeitung.  Die Information wird zuk\u00fcnftig \u00fcber das Attribut Datum_Regelwerk abgebildet. Das Attribut soll daher langfristig entfallen."
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe(),
		   source,
		   new String[] {
			   "documentation", "H\u00f6hendifferenz in Querrichtung eines Gleises zwischen beiden Schienen. Genauigkeit: Tausendstel m = 1 mm."
		   });
		addAnnotation
		  (ueberhoehungslinieEClass,
		   source,
		   new String[] {
			   "documentation", "\u00dcberh\u00f6hungsverlauf zwischen zwei \u00dcberh\u00f6hungspunkten."
		   });
		addAnnotation
		  (getUeberhoehungslinie_IDUeberhoehungA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Ueberhoehung am Anfang der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert."
		   });
		addAnnotation
		  (getUeberhoehungslinie_IDUeberhoehungB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Ueberhoehung am Ende der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert."
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "documentation", "Quelle der Geo-Kante, des Geo-Knotens, des H\u00f6henpunkts, der H\u00f6henlinie, der \u00dcberh\u00f6hung bzw. der \u00dcberh\u00f6hungslinie. Bei Auswahl von \u201esonstige\u201c ist zwingend ein Bearbeitungsvermerk anzugeben. "
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm(),
		   source,
		   new String[] {
			   "documentation", "Form der Ueberhoehungslinie, z. B. gleichbleibend oder gerade Rampe. "
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge(),
		   source,
		   new String[] {
			   "documentation", "L\u00e4nge der Ueberhoehungslinie. Genauigkeit: Tausendstel m = 1 mm."
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
		  (anzeigegefuehrt_ES_Kategorie_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnzeigegefuehrt_ES_Kategorie",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (anzeigegefuehrt_ES_Kategorie_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnzeigegefuehrt_ES_Kategorie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnzeigegefuehrt_ES_Kategorie_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Strecke_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Strecke",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[0-9]{4}(\\-[a-zA-Z0-9])?"
		   });
		addAnnotation
		  (bezeichnung_Strecke_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Strecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Strecke_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bremsweg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBremsweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBremsweg_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumeration1EDataType,
		   source,
		   new String[] {
			   "name", "Enumeration1",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (enumgeoFormEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGEO_Form"
		   });
		addAnnotation
		  (enumgeoFormObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGEO_Form:Object",
			   "baseType", "ENUMGEO_Form"
		   });
		addAnnotation
		  (enumgeoKoordinatensystemEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGEO_Koordinatensystem"
		   });
		addAnnotation
		  (enumgeoKoordinatensystemObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGEO_Koordinatensystem:Object",
			   "baseType", "ENUMGEO_Koordinatensystem"
		   });
		addAnnotation
		  (enumHoehenlinieFormEEnum,
		   source,
		   new String[] {
			   "name", "ENUMHoehenlinie_Form"
		   });
		addAnnotation
		  (enumHoehenlinieFormObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMHoehenlinie_Form:Object",
			   "baseType", "ENUMHoehenlinie_Form"
		   });
		addAnnotation
		  (enumhSystemEEnum,
		   source,
		   new String[] {
			   "name", "ENUMHSystem"
		   });
		addAnnotation
		  (enumhSystemObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMHSystem:Object",
			   "baseType", "ENUMHSystem"
		   });
		addAnnotation
		  (enumOertlichkeitArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMOertlichkeit_Art"
		   });
		addAnnotation
		  (enumOertlichkeitArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMOertlichkeit_Art:Object",
			   "baseType", "ENUMOertlichkeit_Art"
		   });
		addAnnotation
		  (enumPlanQuelleEEnum,
		   source,
		   new String[] {
			   "name", "ENUMPlan_Quelle"
		   });
		addAnnotation
		  (enumPlanQuelleObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMPlan_Quelle:Object",
			   "baseType", "ENUMPlan_Quelle"
		   });
		addAnnotation
		  (enumStreckeRichtungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMStrecke_Richtung"
		   });
		addAnnotation
		  (enumStreckeRichtungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMStrecke_Richtung:Object",
			   "baseType", "ENUMStrecke_Richtung"
		   });
		addAnnotation
		  (enumtbArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTB_Art"
		   });
		addAnnotation
		  (enumtbArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTB_Art:Object",
			   "baseType", "ENUMTB_Art"
		   });
		addAnnotation
		  (enumtopAnschlussEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTOP_Anschluss"
		   });
		addAnnotation
		  (enumtopAnschlussObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTOP_Anschluss:Object",
			   "baseType", "ENUMTOP_Anschluss"
		   });
		addAnnotation
		  (enumtpArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTP_Art"
		   });
		addAnnotation
		  (enumtpArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTP_Art:Object",
			   "baseType", "ENUMTP_Art"
		   });
		addAnnotation
		  (enumUeberhoehungslinieFormEEnum,
		   source,
		   new String[] {
			   "name", "ENUMUeberhoehungslinie_Form"
		   });
		addAnnotation
		  (enumUeberhoehungslinieFormObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMUeberhoehungslinie_Form:Object",
			   "baseType", "ENUMUeberhoehungslinie_Form"
		   });
		addAnnotation
		  (enumvProfilArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMV_Profil_Art"
		   });
		addAnnotation
		  (enumvProfilArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMV_Profil_Art:Object",
			   "baseType", "ENUMV_Profil_Art"
		   });
		addAnnotation
		  (geO_Form_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Form",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Form_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_KAD_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_KAD",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (geO_KAD_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_KAD",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_KAD_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_KanteEClass,
		   source,
		   new String[] {
			   "name", "CGEO_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Kante_GEOKanteAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Kante_Allg"
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Art"
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOKnotenA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten_A"
		   });
		addAnnotation
		  (getGEO_Kante_IDGEOKnotenB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten_B"
		   });
		addAnnotation
		  (geO_Kante_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGEO_Kante_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOForm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Form"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOKAD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_KAD"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOLaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Laenge"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Radius_A"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Radius_B"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Richtungswinkel"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (geO_KnotenEClass,
		   source,
		   new String[] {
			   "name", "CGEO_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Knoten_GEOPAD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_PAD"
		   });
		addAnnotation
		  (geO_Koordinatensystem_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Koordinatensystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Koordinatensystem_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "-?(0|[1-9][0-9]{0,3})\\.[0-9]{5}"
		   });
		addAnnotation
		  (geO_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_PAD_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_PAD",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (geO_PAD_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_PAD",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_PAD_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_PunktEClass,
		   source,
		   new String[] {
			   "name", "CGEO_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Punkt_GEOPunktAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Punkt_Allg"
		   });
		addAnnotation
		  (getGEO_Punkt_IDGEOKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Kante"
		   });
		addAnnotation
		  (getGEO_Punkt_IDGEOKnoten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten"
		   });
		addAnnotation
		  (geO_Punkt_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGEO_Punkt_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GEOKoordinatensystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_Koordinatensystem"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKX(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GK_X"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKY(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GK_Y"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKZ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GK_Z"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (geO_Radius_A_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_Radius_A",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})"
		   });
		addAnnotation
		  (geO_Radius_A_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Radius_A",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Radius_A_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_Radius_B_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_Radius_B",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})"
		   });
		addAnnotation
		  (geO_Radius_B_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Radius_B",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Radius_B_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geO_Richtungswinkel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGEO_Richtungswinkel",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "(0|[1-9][0-9]{0,1}|[1-3][0-9]{2})\\.[0-9]{5}"
		   });
		addAnnotation
		  (geO_Richtungswinkel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGEO_Richtungswinkel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGEO_Richtungswinkel_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGeschwindigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit"
		   });
		addAnnotation
		  (geschwindigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeschwindigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geschwindigkeitsprofilEClass,
		   source,
		   new String[] {
			   "name", "CGeschwindigkeitsprofil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeitsprofil_Allg"
		   });
		addAnnotation
		  (geschwindigkeitsprofil_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGeschwindigkeitsprofil_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_AnzeigegefuehrtESKategorie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anzeigegefuehrt_ES_Kategorie"
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_Geschwindigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit"
		   });
		addAnnotation
		  (getGeschwindigkeitsprofil_Allg_AttributeGroup_VProfilArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "V_Profil_Art"
		   });
		addAnnotation
		  (gK_X_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGK_X",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))"
		   });
		addAnnotation
		  (gK_X_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGK_X",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGK_X_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gK_Y_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGK_Y",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))"
		   });
		addAnnotation
		  (gK_Y_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGK_Y",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGK_Y_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gK_Z_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGK_Z",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))"
		   });
		addAnnotation
		  (gK_Z_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGK_Z",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGK_Z_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoehenlinieEClass,
		   source,
		   new String[] {
			   "name", "CHoehenlinie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenlinie_HoehenlinieAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenlinie_Allg"
		   });
		addAnnotation
		  (getHoehenlinie_IDHoehenpunktA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Hoehenpunkt_A"
		   });
		addAnnotation
		  (getHoehenlinie_IDHoehenpunktB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Hoehenpunkt_B"
		   });
		addAnnotation
		  (hoehenlinie_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CHoehenlinie_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_HoehenlinieForm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenlinie_Form"
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenlinie_Laenge"
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (hoehenlinie_Form_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHoehenlinie_Form",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenlinie_Form_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoehenlinie_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THoehenlinie_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (hoehenlinie_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHoehenlinie_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenlinie_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoehenpunktEClass,
		   source,
		   new String[] {
			   "name", "CHoehenpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenpunkt_HoehenpunktAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenpunkt_Allg"
		   });
		addAnnotation
		  (hoehenpunkt_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CHoehenpunkt_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_PAD"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenpunkt_Datum"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hoehenpunkt_Hoehe"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HSystem"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_Neigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Neigung"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (hoehenpunkt_Datum_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHoehenpunkt_Datum",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenpunkt_Datum_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hoehenpunkt_Hoehe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THoehenpunkt_Hoehe",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "-100\\.000|-([1-9][0-9]{0,1}\\.[0-9]{3})|(-0\\.[1-9][0-9]{2}|-0\\.0[1-9][0-9]|-0\\.0[0-9][1-9])|((0|[1-9][0-9]{0,2}|[1-2][0-9]{3})\\.[0-9]{3})|3000\\.000"
		   });
		addAnnotation
		  (hoehenpunkt_Hoehe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHoehenpunkt_Hoehe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHoehenpunkt_Hoehe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hSystem_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHSystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHSystem_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kantenname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKantenname",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (kantenname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKantenname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKantenname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (knotenname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKnotenname",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (knotenname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKnotenname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKnotenname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (neigung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNeigung",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "0\\.000|([1-9][0-9]{0,1}\\.[0-9]{3})|(0\\.[1-9][0-9]{2}|0\\.0[1-9][0-9]|0\\.0[0-9][1-9])|((0|[1-9][0-9]{0,1})\\.[0-9]{3})|100\\.000"
		   });
		addAnnotation
		  (neigung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNeigung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNeigung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeitEClass,
		   source,
		   new String[] {
			   "name", "COertlichkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getOertlichkeit_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (getOertlichkeit_IDOertlichkeitAwanstBedient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit_Awanst_Bedient"
		   });
		addAnnotation
		  (getOertlichkeit_IDStreckePunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Strecke_Punkt"
		   });
		addAnnotation
		  (getOertlichkeit_OertlichkeitAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Allg"
		   });
		addAnnotation
		  (oertlichkeit_Abkuerzung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TOertlichkeit_Abkuerzung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[A-Z][A-Z0-9%20]{1,4}"
		   });
		addAnnotation
		  (oertlichkeit_Abkuerzung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Abkuerzung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Abkuerzung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeit_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "COertlichkeit_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Art"
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigAb(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Gueltig_Ab"
		   });
		addAnnotation
		  (getOertlichkeit_Allg_AttributeGroup_OertlichkeitGueltigBis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Gueltig_Bis"
		   });
		addAnnotation
		  (oertlichkeit_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeit_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "COertlichkeit_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Abkuerzung"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Kurzname"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlichkeit_Langname"
		   });
		addAnnotation
		  (oertlichkeit_Gueltig_Ab_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Gueltig_Ab",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Gueltig_Ab_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeit_Gueltig_Bis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Gueltig_Bis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Gueltig_Bis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeit_Kurzname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TOertlichkeit_Kurzname",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (oertlichkeit_Kurzname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Kurzname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Kurzname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (oertlichkeit_Langname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TOertlichkeit_Langname",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,40}"
		   });
		addAnnotation
		  (oertlichkeit_Langname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlichkeit_Langname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlichkeit_Langname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (plan_Quelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPlan_Quelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlan_Quelle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (streckeEClass,
		   source,
		   new String[] {
			   "name", "CStrecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (strecke_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CStrecke_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Strecke"
		   });
		addAnnotation
		  (strecke_BremswegEClass,
		   source,
		   new String[] {
			   "name", "CStrecke_Bremsweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Bremsweg_Bremsweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bremsweg"
		   });
		addAnnotation
		  (getStrecke_Bremsweg_StreckeRichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strecke_Richtung"
		   });
		addAnnotation
		  (strecke_Meter_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TStrecke_Meter",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "-?(0|[1-9][0-9]{0,5})\\.[0-9]{3}"
		   });
		addAnnotation
		  (strecke_Meter_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStrecke_Meter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Meter_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (strecke_PunktEClass,
		   source,
		   new String[] {
			   "name", "CStrecke_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Punkt_IDGEOKnoten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten"
		   });
		addAnnotation
		  (getStrecke_Punkt_IDStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Strecke"
		   });
		addAnnotation
		  (getStrecke_Punkt_StreckeMeter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strecke_Meter"
		   });
		addAnnotation
		  (strecke_Richtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStrecke_Richtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Richtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tB_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTB_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTB_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tB_Beschreibung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTB_Beschreibung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (tB_Beschreibung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTB_Beschreibung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTB_Beschreibung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (technischer_BereichEClass,
		   source,
		   new String[] {
			   "name", "CTechnischer_Bereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnischer_Bereich_TBArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TB_Art"
		   });
		addAnnotation
		  (getTechnischer_Bereich_TBBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TB_Beschreibung"
		   });
		addAnnotation
		  (technischer_PunktEClass,
		   source,
		   new String[] {
			   "name", "CTechnischer_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnischer_Punkt_TPArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TP_Art"
		   });
		addAnnotation
		  (getTechnischer_Punkt_TPBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TP_Beschreibung"
		   });
		addAnnotation
		  (toP_Anschluss_A_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTOP_Anschluss_A",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Anschluss_A_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (toP_Anschluss_B_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTOP_Anschluss_B",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Anschluss_B_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (toP_KanteEClass,
		   source,
		   new String[] {
			   "name", "CTOP_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Kante_IDTOPKnotenA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_TOP_Knoten_A"
		   });
		addAnnotation
		  (getTOP_Kante_IDTOPKnotenB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_TOP_Knoten_B"
		   });
		addAnnotation
		  (getTOP_Kante_TOPKanteAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TOP_Kante_Allg"
		   });
		addAnnotation
		  (toP_Kante_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTOP_Kante_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_Kantenname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kantenname"
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TOP_Anschluss_A"
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TOP_Anschluss_B"
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPLaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TOP_Laenge"
		   });
		addAnnotation
		  (toP_KnotenEClass,
		   source,
		   new String[] {
			   "name", "CTOP_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Knoten_IDGEOKnoten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten"
		   });
		addAnnotation
		  (getTOP_Knoten_Knotenname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Knotenname"
		   });
		addAnnotation
		  (toP_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTOP_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (toP_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTOP_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOP_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tP_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTP_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTP_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tP_Beschreibung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTP_Beschreibung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (tP_Beschreibung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTP_Beschreibung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTP_Beschreibung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (trasse_Kante_child_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTrasse_Kante_child",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (ueberhoehungEClass,
		   source,
		   new String[] {
			   "name", "CUeberhoehung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehung_UeberhoehungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehung_Allg"
		   });
		addAnnotation
		  (ueberhoehung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CUeberhoehung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GEO_PAD"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehung_Datum"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehung_Hoehe"
		   });
		addAnnotation
		  (ueberhoehung_Datum_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUeberhoehung_Datum",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehung_Datum_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ueberhoehung_Hoehe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUeberhoehung_Hoehe",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "-?(0\\.[01][0-9][0-9]|0\\.200)"
		   });
		addAnnotation
		  (ueberhoehung_Hoehe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUeberhoehung_Hoehe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehung_Hoehe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ueberhoehungslinieEClass,
		   source,
		   new String[] {
			   "name", "CUeberhoehungslinie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehungslinie_IDUeberhoehungA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Ueberhoehung_A"
		   });
		addAnnotation
		  (getUeberhoehungslinie_IDUeberhoehungB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Ueberhoehung_B"
		   });
		addAnnotation
		  (getUeberhoehungslinie_UeberhoehungslinieAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehungslinie_Allg"
		   });
		addAnnotation
		  (ueberhoehungslinie_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CUeberhoehungslinie_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plan_Quelle"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieForm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehungslinie_Form"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ueberhoehungslinie_Laenge"
		   });
		addAnnotation
		  (ueberhoehungslinie_Form_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUeberhoehungslinie_Form",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Form_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ueberhoehungslinie_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUeberhoehungslinie_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (ueberhoehungslinie_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUeberhoehungslinie_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (v_Profil_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCV_Profil_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getV_Profil_Art_TypeClass_Wert(),
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
		  (geO_KanteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEOLaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>+/-[0.00000..9999.99999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusA(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-99999.99999..-10.00000|0.00000|10.00000..99999.99999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORadiusB(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-99999.99999..-10.00000|0.00000|10.00000..99999.99999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0.00000...399.99999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Kante_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>GND</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (geO_KnotenEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getGEO_Knoten_GEOPAD(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:Patternbeschreibung>[1..20</ppi:Patternbeschreibung>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (geO_PunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKX(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>Positive und negative Werte mit genau 5 Nachkommastellen, beliebige Vorkommastellen</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKY(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>Positive und negative Werte mit genau 5 Nachkommastellen, beliebige Vorkommastellen</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_GKZ(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>Positive und negative Werte mit genau 5 Nachkommastellen, beliebige Vorkommastellen</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getGEO_Punkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>GND</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (geschwindigkeitsprofilEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (hoehenlinieEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_HoehenlinieLaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getHoehenlinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>GND</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (hoehenpunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [7..11] Alphanumerische Zeichenkette, die ersten vier Zeichen sind Ziffern [0..9], die 5. und 6. Stelle sind Gro\u00dfbuchstaben [A..Z] und die letzten f\u00fcnf Zeichen sind Zahlen [1 .. 99999] ohne f\u00fchrende Nullen. </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-100.000..3000.000]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_Neigung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0.000..100.000]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getHoehenpunkt_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>GND</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (oertlichkeitEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitAbkuerzung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [2..5] Gro\u00dfbuchstaben, Zahlen und Leerzeichen ohne Umlaute, f\u00fchrende Zahlen sowie f\u00fchrende Leerzeichen</ppi:Patternbeschreibung>\n                         \n    <ppi:Patternbeschreibung_Abweichend>[2..5] Gro\u00dfbuchstaben ohne Umlaute</ppi:Patternbeschreibung_Abweichend>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitKurzname(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getOertlichkeit_Bezeichnung_AttributeGroup_OertlichkeitLangname(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..40] darf sich innerhalb eines Datenbestandes nicht wiederholen beinhaltet rechtsb\u00fcndig einzutragende Erg\u00e4nzungen zur Unterscheidung gleichnamiger \u00d6rtlichkeiten muss mit Orts- bzw. Ortsteilnamen beginnen </ppi:Patternbeschreibung>\n                         \n    <ppi:Patternbeschreibung_Abweichend>[1..40]</ppi:Patternbeschreibung_Abweichend>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (streckeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>  [4..6]; Die ersten vier Zeichen sind verpflichtend und bestehen aus Ziffern [0..9]. Zur zus\u00e4tzlichen Kennung bei stark auseinander triftenden Kilometierungsachsen einer zweigleisigen Strecke wird ein [-] als f\u00fcnftes Zeichen und ein alphanumerisches Zeichen [A..Z|a..z|0..9] als sechstes Zeichen verwendet. </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (strecke_BremswegEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo|ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getStrecke_Bremsweg_Bremsweg(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>1000</ppi:ProposedValue>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (strecke_PunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getStrecke_Punkt_StreckeMeter(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:Patternbeschreibung>[-999999.999..0.000..999999.999]</ppi:Patternbeschreibung>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (technischer_BereichEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW|ETCS|Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (technischer_PunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW|ETCS|Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (toP_KanteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getTOP_Kante_Allg_AttributeGroup_TOPLaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (toP_KnotenEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getTOP_Knoten_Knotenname(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (ueberhoehungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_GEOPAD(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-0.200..0.200]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (ueberhoehungslinieEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Geo</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_PlanQuelle(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>GND</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getUeberhoehungslinie_Allg_AttributeGroup_UeberhoehungslinieLaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //GeodatenPackageImpl
