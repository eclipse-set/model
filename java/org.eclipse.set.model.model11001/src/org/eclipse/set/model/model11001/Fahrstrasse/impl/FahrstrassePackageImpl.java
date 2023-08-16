/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse.impl;

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

import org.eclipse.set.model.model11001.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Automatische_Einstellung_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.DWeg_Reihenfolge_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.DWeg_V_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.DWeg_Vorzug_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMAufloesungSspZielgleis;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMAutomatischeEinstellung;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMFstrMittelArt;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMFstrRangierArt;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMFstrZugArt;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMRangierGegenfahrtausschluss;
import org.eclipse.set.model.model11001.Fahrstrasse.ENUMStartSignalCharakter;
import org.eclipse.set.model.model11001.Fahrstrasse.Element_Verschluss_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.F_Bedienung_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrasseFactory;
import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Abhaengigkeit;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Aneinander;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Aneinander_Zuordnung;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Bedienstring_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_W_Kr;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_Art_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Nichthaltfall;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Art_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Reihenfolge_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Signalisierung;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Umfahrpunkt;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_V_Hg_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_V_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Art_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Laenge_Soll_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.model.model11001.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Massgebende_Neigung_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Sonstiger_Punkt;
import org.eclipse.set.model.model11001.Fahrstrasse.Start_Signal_Charakter_TypeClass;

import org.eclipse.set.model.model11001.Fahrstrasse.util.FahrstrasseValidator;

import org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model11001.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model11001.Geodaten.impl.GeodatenPackageImpl;

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
public class FahrstrassePackageImpl extends EPackageImpl implements FahrstrassePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufloesung_Ssp_Zielgleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufloesung_Verzoegerung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automatische_Einstellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Fstr_DWeg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Markanter_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Reihenfolge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_V_Aufwertung_Verzicht_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_V_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Vorzug_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_Verschluss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass f_Bedienung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_AbhaengigkeitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Abhaengigkeit_Ssp_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_AneinanderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Aneinander_Bedienstring_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Aneinander_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Bedienstring_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_DWegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_DWeg_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_DWeg_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_DWeg_Spezifisch_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_DWeg_W_KrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_FahrwegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Mittel_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Mittel_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Mittel_V_Aufwertung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_NichthaltfallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Rangier_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Rangier_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Rangier_Fla_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Reihenfolge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_SignalisierungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_UmfahrpunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_V_Hg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_V_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Vsigabstand_Verkuerzt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Zug_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Zug_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Zug_DWeg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Zug_RangierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fstr_Zug_Rangier_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laenge_Soll_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markanter_PunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markanter_Punkt_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massgebende_Neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangier_Gegenfahrtausschluss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstiger_PunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass start_Signal_Charakter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAufloesungSspZielgleisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAutomatischeEinstellungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFstrMittelArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFstrRangierArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFstrZugArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRangierGegenfahrtausschlussEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStartSignalCharakterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aufloesung_Verzoegerung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Fstr_DWeg_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Markanter_Punkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_Reihenfolge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_V_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAufloesungSspZielgleisObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAutomatischeEinstellungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFstrMittelArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFstrRangierArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFstrZugArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumRangierGegenfahrtausschlussObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStartSignalCharakterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fstr_Aneinander_Bedienstring_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fstr_Bedienstring_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fstr_Reihenfolge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fstr_V_Hg_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fstr_V_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType laenge_Soll_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType massgebende_Neigung_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FahrstrassePackageImpl() {
		super(eNS_URI, FahrstrasseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FahrstrassePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FahrstrassePackage init() {
		if (isInited) return (FahrstrassePackage)EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFahrstrassePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FahrstrassePackageImpl theFahrstrassePackage = registeredFahrstrassePackage instanceof FahrstrassePackageImpl ? (FahrstrassePackageImpl)registeredFahrstrassePackage : new FahrstrassePackageImpl();

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
		theFahrstrassePackage.createPackageContents();
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
		theFahrstrassePackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFahrstrassePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return FahrstrasseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFahrstrassePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FahrstrassePackage.eNS_URI, theFahrstrassePackage);
		return theFahrstrassePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufloesung_Ssp_Zielgleis_TypeClass() {
		return aufloesung_Ssp_Zielgleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufloesung_Ssp_Zielgleis_TypeClass_Wert() {
		return (EAttribute)aufloesung_Ssp_Zielgleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufloesung_Verzoegerung_TypeClass() {
		return aufloesung_Verzoegerung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufloesung_Verzoegerung_TypeClass_Wert() {
		return (EAttribute)aufloesung_Verzoegerung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomatische_Einstellung_TypeClass() {
		return automatische_Einstellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomatische_Einstellung_TypeClass_Wert() {
		return (EAttribute)automatische_Einstellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Fstr_DWeg_TypeClass() {
		return bezeichnung_Fstr_DWeg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Fstr_DWeg_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Fstr_DWeg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Markanter_Punkt_TypeClass() {
		return bezeichnung_Markanter_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Markanter_Punkt_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Markanter_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Reihenfolge_TypeClass() {
		return dWeg_Reihenfolge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Reihenfolge_TypeClass_Wert() {
		return (EAttribute)dWeg_Reihenfolge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_V_Aufwertung_Verzicht_TypeClass() {
		return dWeg_V_Aufwertung_Verzicht_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_V_Aufwertung_Verzicht_TypeClass_Wert() {
		return (EAttribute)dWeg_V_Aufwertung_Verzicht_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_V_TypeClass() {
		return dWeg_V_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_V_TypeClass_Wert() {
		return (EAttribute)dWeg_V_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Vorzug_TypeClass() {
		return dWeg_Vorzug_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Vorzug_TypeClass_Wert() {
		return (EAttribute)dWeg_Vorzug_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Verschluss_TypeClass() {
		return element_Verschluss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Verschluss_TypeClass_Wert() {
		return (EAttribute)element_Verschluss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getF_Bedienung_TypeClass() {
		return f_Bedienung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getF_Bedienung_TypeClass_Wert() {
		return (EAttribute)f_Bedienung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Abhaengigkeit() {
		return fstr_AbhaengigkeitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Abhaengigkeit_IDFstrFahrweg() {
		return (EReference)fstr_AbhaengigkeitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp() {
		return (EReference)fstr_AbhaengigkeitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Abhaengigkeit_IDBedienAnzeigeElement() {
		return (EReference)fstr_AbhaengigkeitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Abhaengigkeit_Ssp_AttributeGroup() {
		return fstr_Abhaengigkeit_Ssp_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis() {
		return (EReference)fstr_Abhaengigkeit_Ssp_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre() {
		return (EReference)fstr_Abhaengigkeit_Ssp_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Aneinander() {
		return fstr_AneinanderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Aneinander_FstrAneinanderBedienstring() {
		return (EReference)fstr_AneinanderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Aneinander_Bedienstring_TypeClass() {
		return fstr_Aneinander_Bedienstring_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Aneinander_Bedienstring_TypeClass_Wert() {
		return (EAttribute)fstr_Aneinander_Bedienstring_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Aneinander_Zuordnung() {
		return fstr_Aneinander_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Aneinander_Zuordnung_IDFstrAneinander() {
		return (EReference)fstr_Aneinander_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Aneinander_Zuordnung_IDFstrZugRangier() {
		return (EReference)fstr_Aneinander_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Bedienstring_TypeClass() {
		return fstr_Bedienstring_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Bedienstring_TypeClass_Wert() {
		return (EAttribute)fstr_Bedienstring_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_DWeg() {
		return fstr_DWegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Bezeichnung() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_FstrDWegAllg() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_FstrDWegSpezifisch() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_IDFMAAnlageFreimeldung() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_IDFstrFahrweg() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_IDPZBGefahrpunkt() {
		return (EReference)fstr_DWegEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_DWeg_Allg_AttributeGroup() {
		return fstr_DWeg_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Allg_AttributeGroup_LaengeSoll() {
		return (EReference)fstr_DWeg_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung() {
		return (EReference)fstr_DWeg_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_DWeg_Bezeichnung_AttributeGroup() {
		return fstr_DWeg_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg() {
		return (EReference)fstr_DWeg_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_DWeg_Spezifisch_AttributeGroup() {
		return fstr_DWeg_Spezifisch_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung() {
		return (EReference)fstr_DWeg_Spezifisch_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge() {
		return (EReference)fstr_DWeg_Spezifisch_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegV() {
		return (EReference)fstr_DWeg_Spezifisch_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht() {
		return (EReference)fstr_DWeg_Spezifisch_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis() {
		return (EReference)fstr_DWeg_Spezifisch_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_DWeg_W_Kr() {
		return fstr_DWeg_W_KrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_W_Kr_ElementVerschluss() {
		return (EReference)fstr_DWeg_W_KrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_W_Kr_IDFstrDWeg() {
		return (EReference)fstr_DWeg_W_KrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_DWeg_W_Kr_IDWKrGspElement() {
		return (EReference)fstr_DWeg_W_KrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Fahrweg() {
		return fstr_FahrwegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Fahrweg_FstrVHg() {
		return (EReference)fstr_FahrwegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Fahrweg_IDStart() {
		return (EReference)fstr_FahrwegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Fahrweg_IDZiel() {
		return (EReference)fstr_FahrwegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Fahrweg_StartSignalCharakter() {
		return (EReference)fstr_FahrwegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Mittel_Art_TypeClass() {
		return fstr_Mittel_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Mittel_Art_TypeClass_Wert() {
		return (EAttribute)fstr_Mittel_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Mittel_AttributeGroup() {
		return fstr_Mittel_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Mittel_AttributeGroup_FstrMittelArt() {
		return (EReference)fstr_Mittel_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung() {
		return (EReference)fstr_Mittel_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Mittel_V_Aufwertung_TypeClass() {
		return fstr_Mittel_V_Aufwertung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Mittel_V_Aufwertung_TypeClass_Wert() {
		return (EAttribute)fstr_Mittel_V_Aufwertung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Nichthaltfall() {
		return fstr_NichthaltfallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Nichthaltfall_IDFMAAnlage() {
		return (EReference)fstr_NichthaltfallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Nichthaltfall_IDFstrFahrweg() {
		return (EReference)fstr_NichthaltfallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Rangier_Art_TypeClass() {
		return fstr_Rangier_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Rangier_Art_TypeClass_Wert() {
		return (EAttribute)fstr_Rangier_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Rangier_AttributeGroup() {
		return fstr_Rangier_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_AttributeGroup_AutomatischeEinstellung() {
		return (EReference)fstr_Rangier_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_AttributeGroup_FstrRangierArt() {
		return (EReference)fstr_Rangier_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei() {
		return (EReference)fstr_Rangier_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss() {
		return (EReference)fstr_Rangier_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Rangier_Fla_Zuordnung() {
		return fstr_Rangier_Fla_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz() {
		return (EReference)fstr_Rangier_Fla_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Rangier_Fla_Zuordnung_IDFstrRangier() {
		return (EReference)fstr_Rangier_Fla_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Reihenfolge_TypeClass() {
		return fstr_Reihenfolge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Reihenfolge_TypeClass_Wert() {
		return (EAttribute)fstr_Reihenfolge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Signalisierung() {
		return fstr_SignalisierungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Signalisierung_IDFstrZugRangier() {
		return (EReference)fstr_SignalisierungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Signalisierung_IDSignalSignalbegriff() {
		return (EReference)fstr_SignalisierungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Signalisierung_IDSignalSignalbegriffZiel() {
		return (EReference)fstr_SignalisierungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Umfahrpunkt() {
		return fstr_UmfahrpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Umfahrpunkt_IDFstrFahrweg() {
		return (EReference)fstr_UmfahrpunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Umfahrpunkt_IDUmfahrpunkt() {
		return (EReference)fstr_UmfahrpunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_V_Hg_TypeClass() {
		return fstr_V_Hg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_V_Hg_TypeClass_Wert() {
		return (EAttribute)fstr_V_Hg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_V_TypeClass() {
		return fstr_V_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_V_TypeClass_Wert() {
		return (EAttribute)fstr_V_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Vsigabstand_Verkuerzt_TypeClass() {
		return fstr_Vsigabstand_Verkuerzt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Vsigabstand_Verkuerzt_TypeClass_Wert() {
		return (EAttribute)fstr_Vsigabstand_Verkuerzt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Zug_Art_TypeClass() {
		return fstr_Zug_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFstr_Zug_Art_TypeClass_Wert() {
		return (EAttribute)fstr_Zug_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Zug_AttributeGroup() {
		return fstr_Zug_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_AutomatischeEinstellung() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_FstrZugArt() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_FstrZugDWeg() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_IDBUEEinschaltung() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt() {
		return (EReference)fstr_Zug_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Zug_DWeg_AttributeGroup() {
		return fstr_Zug_DWeg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_DWeg_AttributeGroup_DWegVorzug() {
		return (EReference)fstr_Zug_DWeg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg() {
		return (EReference)fstr_Zug_DWeg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Zug_Rangier() {
		return fstr_Zug_RangierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_FstrZugRangierAllg() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_IDFstrAusschlussBesonders() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_IDFstrFahrweg() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_FstrMittel() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_FstrRangier() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_FstrZug() {
		return (EReference)fstr_Zug_RangierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFstr_Zug_Rangier_Allg_AttributeGroup() {
		return fstr_Zug_Rangier_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung() {
		return (EReference)fstr_Zug_Rangier_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring() {
		return (EReference)fstr_Zug_Rangier_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge() {
		return (EReference)fstr_Zug_Rangier_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV() {
		return (EReference)fstr_Zug_Rangier_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaenge_Soll_TypeClass() {
		return laenge_Soll_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaenge_Soll_TypeClass_Wert() {
		return (EAttribute)laenge_Soll_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkanter_Punkt() {
		return markanter_PunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkanter_Punkt_Bezeichnung() {
		return (EReference)markanter_PunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkanter_Punkt_IDDWegErlaubnisabhaengig() {
		return (EReference)markanter_PunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkanter_Punkt_IDMarkanteStelle() {
		return (EReference)markanter_PunktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkanter_Punkt_Bezeichnung_AttributeGroup() {
		return markanter_Punkt_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt() {
		return (EReference)markanter_Punkt_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMassgebende_Neigung_TypeClass() {
		return massgebende_Neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMassgebende_Neigung_TypeClass_Wert() {
		return (EAttribute)massgebende_Neigung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangier_Gegenfahrtausschluss_TypeClass() {
		return rangier_Gegenfahrtausschluss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangier_Gegenfahrtausschluss_TypeClass_Wert() {
		return (EAttribute)rangier_Gegenfahrtausschluss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstiger_Punkt() {
		return sonstiger_PunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstiger_Punkt_IDBeginnBereich() {
		return (EReference)sonstiger_PunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart_Signal_Charakter_TypeClass() {
		return start_Signal_Charakter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStart_Signal_Charakter_TypeClass_Wert() {
		return (EAttribute)start_Signal_Charakter_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAufloesungSspZielgleis() {
		return enumAufloesungSspZielgleisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAutomatischeEinstellung() {
		return enumAutomatischeEinstellungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFstrMittelArt() {
		return enumFstrMittelArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFstrRangierArt() {
		return enumFstrRangierArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFstrZugArt() {
		return enumFstrZugArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMRangierGegenfahrtausschluss() {
		return enumRangierGegenfahrtausschlussEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStartSignalCharakter() {
		return enumStartSignalCharakterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAufloesung_Verzoegerung_Type() {
		return aufloesung_Verzoegerung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Fstr_DWeg_Type() {
		return bezeichnung_Fstr_DWeg_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Markanter_Punkt_Type() {
		return bezeichnung_Markanter_Punkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_Reihenfolge_Type() {
		return dWeg_Reihenfolge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_V_Type() {
		return dWeg_V_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAufloesungSspZielgleisObject() {
		return enumAufloesungSspZielgleisObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAutomatischeEinstellungObject() {
		return enumAutomatischeEinstellungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFstrMittelArtObject() {
		return enumFstrMittelArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFstrRangierArtObject() {
		return enumFstrRangierArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFstrZugArtObject() {
		return enumFstrZugArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMRangierGegenfahrtausschlussObject() {
		return enumRangierGegenfahrtausschlussObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStartSignalCharakterObject() {
		return enumStartSignalCharakterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFstr_Aneinander_Bedienstring_Type() {
		return fstr_Aneinander_Bedienstring_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFstr_Bedienstring_Type() {
		return fstr_Bedienstring_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFstr_Reihenfolge_Type() {
		return fstr_Reihenfolge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFstr_V_Hg_Type() {
		return fstr_V_Hg_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFstr_V_Type() {
		return fstr_V_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaenge_Soll_Type() {
		return laenge_Soll_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMassgebende_Neigung_Type() {
		return massgebende_Neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FahrstrasseFactory getFahrstrasseFactory() {
		return (FahrstrasseFactory)getEFactoryInstance();
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
		aufloesung_Ssp_Zielgleis_TypeClassEClass = createEClass(AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS);
		createEAttribute(aufloesung_Ssp_Zielgleis_TypeClassEClass, AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS__WERT);

		aufloesung_Verzoegerung_TypeClassEClass = createEClass(AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS);
		createEAttribute(aufloesung_Verzoegerung_TypeClassEClass, AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS__WERT);

		automatische_Einstellung_TypeClassEClass = createEClass(AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS);
		createEAttribute(automatische_Einstellung_TypeClassEClass, AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS__WERT);

		bezeichnung_Fstr_DWeg_TypeClassEClass = createEClass(BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS);
		createEAttribute(bezeichnung_Fstr_DWeg_TypeClassEClass, BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS__WERT);

		bezeichnung_Markanter_Punkt_TypeClassEClass = createEClass(BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS);
		createEAttribute(bezeichnung_Markanter_Punkt_TypeClassEClass, BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS__WERT);

		dWeg_Reihenfolge_TypeClassEClass = createEClass(DWEG_REIHENFOLGE_TYPE_CLASS);
		createEAttribute(dWeg_Reihenfolge_TypeClassEClass, DWEG_REIHENFOLGE_TYPE_CLASS__WERT);

		dWeg_V_Aufwertung_Verzicht_TypeClassEClass = createEClass(DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS);
		createEAttribute(dWeg_V_Aufwertung_Verzicht_TypeClassEClass, DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS__WERT);

		dWeg_V_TypeClassEClass = createEClass(DWEG_VTYPE_CLASS);
		createEAttribute(dWeg_V_TypeClassEClass, DWEG_VTYPE_CLASS__WERT);

		dWeg_Vorzug_TypeClassEClass = createEClass(DWEG_VORZUG_TYPE_CLASS);
		createEAttribute(dWeg_Vorzug_TypeClassEClass, DWEG_VORZUG_TYPE_CLASS__WERT);

		element_Verschluss_TypeClassEClass = createEClass(ELEMENT_VERSCHLUSS_TYPE_CLASS);
		createEAttribute(element_Verschluss_TypeClassEClass, ELEMENT_VERSCHLUSS_TYPE_CLASS__WERT);

		f_Bedienung_TypeClassEClass = createEClass(FBEDIENUNG_TYPE_CLASS);
		createEAttribute(f_Bedienung_TypeClassEClass, FBEDIENUNG_TYPE_CLASS__WERT);

		fstr_AbhaengigkeitEClass = createEClass(FSTR_ABHAENGIGKEIT);
		createEReference(fstr_AbhaengigkeitEClass, FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG);
		createEReference(fstr_AbhaengigkeitEClass, FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP);
		createEReference(fstr_AbhaengigkeitEClass, FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT);

		fstr_Abhaengigkeit_Ssp_AttributeGroupEClass = createEClass(FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP);
		createEReference(fstr_Abhaengigkeit_Ssp_AttributeGroupEClass, FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS);
		createEReference(fstr_Abhaengigkeit_Ssp_AttributeGroupEClass, FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE);

		fstr_AneinanderEClass = createEClass(FSTR_ANEINANDER);
		createEReference(fstr_AneinanderEClass, FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING);

		fstr_Aneinander_Bedienstring_TypeClassEClass = createEClass(FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS);
		createEAttribute(fstr_Aneinander_Bedienstring_TypeClassEClass, FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS__WERT);

		fstr_Aneinander_ZuordnungEClass = createEClass(FSTR_ANEINANDER_ZUORDNUNG);
		createEReference(fstr_Aneinander_ZuordnungEClass, FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER);
		createEReference(fstr_Aneinander_ZuordnungEClass, FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER);

		fstr_Bedienstring_TypeClassEClass = createEClass(FSTR_BEDIENSTRING_TYPE_CLASS);
		createEAttribute(fstr_Bedienstring_TypeClassEClass, FSTR_BEDIENSTRING_TYPE_CLASS__WERT);

		fstr_DWegEClass = createEClass(FSTR_DWEG);
		createEReference(fstr_DWegEClass, FSTR_DWEG__BEZEICHNUNG);
		createEReference(fstr_DWegEClass, FSTR_DWEG__FSTR_DWEG_ALLG);
		createEReference(fstr_DWegEClass, FSTR_DWEG__FSTR_DWEG_SPEZIFISCH);
		createEReference(fstr_DWegEClass, FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG);
		createEReference(fstr_DWegEClass, FSTR_DWEG__ID_FSTR_FAHRWEG);
		createEReference(fstr_DWegEClass, FSTR_DWEG__IDPZB_GEFAHRPUNKT);

		fstr_DWeg_Allg_AttributeGroupEClass = createEClass(FSTR_DWEG_ALLG_ATTRIBUTE_GROUP);
		createEReference(fstr_DWeg_Allg_AttributeGroupEClass, FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL);
		createEReference(fstr_DWeg_Allg_AttributeGroupEClass, FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG);

		fstr_DWeg_Bezeichnung_AttributeGroupEClass = createEClass(FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(fstr_DWeg_Bezeichnung_AttributeGroupEClass, FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG);

		fstr_DWeg_Spezifisch_AttributeGroupEClass = createEClass(FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP);
		createEReference(fstr_DWeg_Spezifisch_AttributeGroupEClass, FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG);
		createEReference(fstr_DWeg_Spezifisch_AttributeGroupEClass, FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE);
		createEReference(fstr_DWeg_Spezifisch_AttributeGroupEClass, FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V);
		createEReference(fstr_DWeg_Spezifisch_AttributeGroupEClass, FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT);
		createEReference(fstr_DWeg_Spezifisch_AttributeGroupEClass, FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS);

		fstr_DWeg_W_KrEClass = createEClass(FSTR_DWEG_WKR);
		createEReference(fstr_DWeg_W_KrEClass, FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS);
		createEReference(fstr_DWeg_W_KrEClass, FSTR_DWEG_WKR__ID_FSTR_DWEG);
		createEReference(fstr_DWeg_W_KrEClass, FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT);

		fstr_FahrwegEClass = createEClass(FSTR_FAHRWEG);
		createEReference(fstr_FahrwegEClass, FSTR_FAHRWEG__FSTR_VHG);
		createEReference(fstr_FahrwegEClass, FSTR_FAHRWEG__ID_START);
		createEReference(fstr_FahrwegEClass, FSTR_FAHRWEG__ID_ZIEL);
		createEReference(fstr_FahrwegEClass, FSTR_FAHRWEG__START_SIGNAL_CHARAKTER);

		fstr_Mittel_Art_TypeClassEClass = createEClass(FSTR_MITTEL_ART_TYPE_CLASS);
		createEAttribute(fstr_Mittel_Art_TypeClassEClass, FSTR_MITTEL_ART_TYPE_CLASS__WERT);

		fstr_Mittel_AttributeGroupEClass = createEClass(FSTR_MITTEL_ATTRIBUTE_GROUP);
		createEReference(fstr_Mittel_AttributeGroupEClass, FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART);
		createEReference(fstr_Mittel_AttributeGroupEClass, FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG);

		fstr_Mittel_V_Aufwertung_TypeClassEClass = createEClass(FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS);
		createEAttribute(fstr_Mittel_V_Aufwertung_TypeClassEClass, FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS__WERT);

		fstr_NichthaltfallEClass = createEClass(FSTR_NICHTHALTFALL);
		createEReference(fstr_NichthaltfallEClass, FSTR_NICHTHALTFALL__IDFMA_ANLAGE);
		createEReference(fstr_NichthaltfallEClass, FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG);

		fstr_Rangier_Art_TypeClassEClass = createEClass(FSTR_RANGIER_ART_TYPE_CLASS);
		createEAttribute(fstr_Rangier_Art_TypeClassEClass, FSTR_RANGIER_ART_TYPE_CLASS__WERT);

		fstr_Rangier_AttributeGroupEClass = createEClass(FSTR_RANGIER_ATTRIBUTE_GROUP);
		createEReference(fstr_Rangier_AttributeGroupEClass, FSTR_RANGIER_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG);
		createEReference(fstr_Rangier_AttributeGroupEClass, FSTR_RANGIER_ATTRIBUTE_GROUP__FSTR_RANGIER_ART);
		createEReference(fstr_Rangier_AttributeGroupEClass, FSTR_RANGIER_ATTRIBUTE_GROUP__IDFMA_ANLAGE_RANGIER_FREI);
		createEReference(fstr_Rangier_AttributeGroupEClass, FSTR_RANGIER_ATTRIBUTE_GROUP__RANGIER_GEGENFAHRTAUSSCHLUSS);

		fstr_Rangier_Fla_ZuordnungEClass = createEClass(FSTR_RANGIER_FLA_ZUORDNUNG);
		createEReference(fstr_Rangier_Fla_ZuordnungEClass, FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ);
		createEReference(fstr_Rangier_Fla_ZuordnungEClass, FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER);

		fstr_Reihenfolge_TypeClassEClass = createEClass(FSTR_REIHENFOLGE_TYPE_CLASS);
		createEAttribute(fstr_Reihenfolge_TypeClassEClass, FSTR_REIHENFOLGE_TYPE_CLASS__WERT);

		fstr_SignalisierungEClass = createEClass(FSTR_SIGNALISIERUNG);
		createEReference(fstr_SignalisierungEClass, FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER);
		createEReference(fstr_SignalisierungEClass, FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF);
		createEReference(fstr_SignalisierungEClass, FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL);

		fstr_UmfahrpunktEClass = createEClass(FSTR_UMFAHRPUNKT);
		createEReference(fstr_UmfahrpunktEClass, FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG);
		createEReference(fstr_UmfahrpunktEClass, FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT);

		fstr_V_Hg_TypeClassEClass = createEClass(FSTR_VHG_TYPE_CLASS);
		createEAttribute(fstr_V_Hg_TypeClassEClass, FSTR_VHG_TYPE_CLASS__WERT);

		fstr_V_TypeClassEClass = createEClass(FSTR_VTYPE_CLASS);
		createEAttribute(fstr_V_TypeClassEClass, FSTR_VTYPE_CLASS__WERT);

		fstr_Vsigabstand_Verkuerzt_TypeClassEClass = createEClass(FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS);
		createEAttribute(fstr_Vsigabstand_Verkuerzt_TypeClassEClass, FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS__WERT);

		fstr_Zug_Art_TypeClassEClass = createEClass(FSTR_ZUG_ART_TYPE_CLASS);
		createEAttribute(fstr_Zug_Art_TypeClassEClass, FSTR_ZUG_ART_TYPE_CLASS__WERT);

		fstr_Zug_AttributeGroupEClass = createEClass(FSTR_ZUG_ATTRIBUTE_GROUP);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_ART);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG);
		createEReference(fstr_Zug_AttributeGroupEClass, FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT);

		fstr_Zug_DWeg_AttributeGroupEClass = createEClass(FSTR_ZUG_DWEG_ATTRIBUTE_GROUP);
		createEReference(fstr_Zug_DWeg_AttributeGroupEClass, FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG);
		createEReference(fstr_Zug_DWeg_AttributeGroupEClass, FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG);

		fstr_Zug_RangierEClass = createEClass(FSTR_ZUG_RANGIER);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__FSTR_MITTEL);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__FSTR_RANGIER);
		createEReference(fstr_Zug_RangierEClass, FSTR_ZUG_RANGIER__FSTR_ZUG);

		fstr_Zug_Rangier_Allg_AttributeGroupEClass = createEClass(FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP);
		createEReference(fstr_Zug_Rangier_Allg_AttributeGroupEClass, FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FBEDIENUNG);
		createEReference(fstr_Zug_Rangier_Allg_AttributeGroupEClass, FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_BEDIENSTRING);
		createEReference(fstr_Zug_Rangier_Allg_AttributeGroupEClass, FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_REIHENFOLGE);
		createEReference(fstr_Zug_Rangier_Allg_AttributeGroupEClass, FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP__FSTR_V);

		laenge_Soll_TypeClassEClass = createEClass(LAENGE_SOLL_TYPE_CLASS);
		createEAttribute(laenge_Soll_TypeClassEClass, LAENGE_SOLL_TYPE_CLASS__WERT);

		markanter_PunktEClass = createEClass(MARKANTER_PUNKT);
		createEReference(markanter_PunktEClass, MARKANTER_PUNKT__BEZEICHNUNG);
		createEReference(markanter_PunktEClass, MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG);
		createEReference(markanter_PunktEClass, MARKANTER_PUNKT__ID_MARKANTE_STELLE);

		markanter_Punkt_Bezeichnung_AttributeGroupEClass = createEClass(MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(markanter_Punkt_Bezeichnung_AttributeGroupEClass, MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT);

		massgebende_Neigung_TypeClassEClass = createEClass(MASSGEBENDE_NEIGUNG_TYPE_CLASS);
		createEAttribute(massgebende_Neigung_TypeClassEClass, MASSGEBENDE_NEIGUNG_TYPE_CLASS__WERT);

		rangier_Gegenfahrtausschluss_TypeClassEClass = createEClass(RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS);
		createEAttribute(rangier_Gegenfahrtausschluss_TypeClassEClass, RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT);

		sonstiger_PunktEClass = createEClass(SONSTIGER_PUNKT);
		createEReference(sonstiger_PunktEClass, SONSTIGER_PUNKT__ID_BEGINN_BEREICH);

		start_Signal_Charakter_TypeClassEClass = createEClass(START_SIGNAL_CHARAKTER_TYPE_CLASS);
		createEAttribute(start_Signal_Charakter_TypeClassEClass, START_SIGNAL_CHARAKTER_TYPE_CLASS__WERT);

		// Create enums
		enumAufloesungSspZielgleisEEnum = createEEnum(ENUM_AUFLOESUNG_SSP_ZIELGLEIS);
		enumAutomatischeEinstellungEEnum = createEEnum(ENUM_AUTOMATISCHE_EINSTELLUNG);
		enumFstrMittelArtEEnum = createEEnum(ENUM_FSTR_MITTEL_ART);
		enumFstrRangierArtEEnum = createEEnum(ENUM_FSTR_RANGIER_ART);
		enumFstrZugArtEEnum = createEEnum(ENUM_FSTR_ZUG_ART);
		enumRangierGegenfahrtausschlussEEnum = createEEnum(ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS);
		enumStartSignalCharakterEEnum = createEEnum(ENUM_START_SIGNAL_CHARAKTER);

		// Create data types
		aufloesung_Verzoegerung_TypeEDataType = createEDataType(AUFLOESUNG_VERZOEGERUNG_TYPE);
		bezeichnung_Fstr_DWeg_TypeEDataType = createEDataType(BEZEICHNUNG_FSTR_DWEG_TYPE);
		bezeichnung_Markanter_Punkt_TypeEDataType = createEDataType(BEZEICHNUNG_MARKANTER_PUNKT_TYPE);
		dWeg_Reihenfolge_TypeEDataType = createEDataType(DWEG_REIHENFOLGE_TYPE);
		dWeg_V_TypeEDataType = createEDataType(DWEG_VTYPE);
		enumAufloesungSspZielgleisObjectEDataType = createEDataType(ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT);
		enumAutomatischeEinstellungObjectEDataType = createEDataType(ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT);
		enumFstrMittelArtObjectEDataType = createEDataType(ENUM_FSTR_MITTEL_ART_OBJECT);
		enumFstrRangierArtObjectEDataType = createEDataType(ENUM_FSTR_RANGIER_ART_OBJECT);
		enumFstrZugArtObjectEDataType = createEDataType(ENUM_FSTR_ZUG_ART_OBJECT);
		enumRangierGegenfahrtausschlussObjectEDataType = createEDataType(ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT);
		enumStartSignalCharakterObjectEDataType = createEDataType(ENUM_START_SIGNAL_CHARAKTER_OBJECT);
		fstr_Aneinander_Bedienstring_TypeEDataType = createEDataType(FSTR_ANEINANDER_BEDIENSTRING_TYPE);
		fstr_Bedienstring_TypeEDataType = createEDataType(FSTR_BEDIENSTRING_TYPE);
		fstr_Reihenfolge_TypeEDataType = createEDataType(FSTR_REIHENFOLGE_TYPE);
		fstr_V_Hg_TypeEDataType = createEDataType(FSTR_VHG_TYPE);
		fstr_V_TypeEDataType = createEDataType(FSTR_VTYPE);
		laenge_Soll_TypeEDataType = createEDataType(LAENGE_SOLL_TYPE);
		massgebende_Neigung_TypeEDataType = createEDataType(MASSGEBENDE_NEIGUNG_TYPE);
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
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aufloesung_Ssp_Zielgleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		aufloesung_Verzoegerung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		automatische_Einstellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Fstr_DWeg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Markanter_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dWeg_Reihenfolge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dWeg_V_Aufwertung_Verzicht_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dWeg_V_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dWeg_Vorzug_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		element_Verschluss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		f_Bedienung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_AbhaengigkeitEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_AneinanderEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_Aneinander_Bedienstring_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Aneinander_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_Bedienstring_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_DWegEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_DWeg_W_KrEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_FahrwegEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		fstr_Mittel_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Mittel_V_Aufwertung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_NichthaltfallEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_Rangier_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Rangier_Fla_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_Reihenfolge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_SignalisierungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_UmfahrpunktEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fstr_V_Hg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_V_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Vsigabstand_Verkuerzt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Zug_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fstr_Zug_RangierEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		laenge_Soll_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		markanter_PunktEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		massgebende_Neigung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rangier_Gegenfahrtausschluss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		sonstiger_PunktEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		start_Signal_Charakter_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(aufloesung_Ssp_Zielgleis_TypeClassEClass, Aufloesung_Ssp_Zielgleis_TypeClass.class, "Aufloesung_Ssp_Zielgleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAufloesung_Ssp_Zielgleis_TypeClass_Wert(), this.getENUMAufloesungSspZielgleisObject(), "wert", null, 1, 1, Aufloesung_Ssp_Zielgleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aufloesung_Verzoegerung_TypeClassEClass, Aufloesung_Verzoegerung_TypeClass.class, "Aufloesung_Verzoegerung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAufloesung_Verzoegerung_TypeClass_Wert(), this.getAufloesung_Verzoegerung_Type(), "wert", null, 1, 1, Aufloesung_Verzoegerung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automatische_Einstellung_TypeClassEClass, Automatische_Einstellung_TypeClass.class, "Automatische_Einstellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomatische_Einstellung_TypeClass_Wert(), this.getENUMAutomatischeEinstellungObject(), "wert", null, 1, 1, Automatische_Einstellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Fstr_DWeg_TypeClassEClass, Bezeichnung_Fstr_DWeg_TypeClass.class, "Bezeichnung_Fstr_DWeg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Fstr_DWeg_TypeClass_Wert(), this.getBezeichnung_Fstr_DWeg_Type(), "wert", null, 1, 1, Bezeichnung_Fstr_DWeg_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Markanter_Punkt_TypeClassEClass, Bezeichnung_Markanter_Punkt_TypeClass.class, "Bezeichnung_Markanter_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Markanter_Punkt_TypeClass_Wert(), this.getBezeichnung_Markanter_Punkt_Type(), "wert", null, 1, 1, Bezeichnung_Markanter_Punkt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dWeg_Reihenfolge_TypeClassEClass, DWeg_Reihenfolge_TypeClass.class, "DWeg_Reihenfolge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWeg_Reihenfolge_TypeClass_Wert(), this.getDWeg_Reihenfolge_Type(), "wert", null, 1, 1, DWeg_Reihenfolge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dWeg_V_Aufwertung_Verzicht_TypeClassEClass, DWeg_V_Aufwertung_Verzicht_TypeClass.class, "DWeg_V_Aufwertung_Verzicht_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWeg_V_Aufwertung_Verzicht_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, DWeg_V_Aufwertung_Verzicht_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dWeg_V_TypeClassEClass, DWeg_V_TypeClass.class, "DWeg_V_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWeg_V_TypeClass_Wert(), this.getDWeg_V_Type(), "wert", null, 1, 1, DWeg_V_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dWeg_Vorzug_TypeClassEClass, DWeg_Vorzug_TypeClass.class, "DWeg_Vorzug_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWeg_Vorzug_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, DWeg_Vorzug_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element_Verschluss_TypeClassEClass, Element_Verschluss_TypeClass.class, "Element_Verschluss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Verschluss_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Element_Verschluss_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(f_Bedienung_TypeClassEClass, F_Bedienung_TypeClass.class, "F_Bedienung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getF_Bedienung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, F_Bedienung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_AbhaengigkeitEClass, Fstr_Abhaengigkeit.class, "Fstr_Abhaengigkeit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Abhaengigkeit_IDFstrFahrweg(), theVerweisePackage.getID_Fstr_Fahrweg_TypeClass(), null, "iDFstrFahrweg", null, 1, 1, Fstr_Abhaengigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp(), this.getFstr_Abhaengigkeit_Ssp_AttributeGroup(), null, "fstrAbhaengigkeitSsp", null, 0, 1, Fstr_Abhaengigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Abhaengigkeit_IDBedienAnzeigeElement(), theVerweisePackage.getID_Bedien_Anzeige_Element_TypeClass(), null, "iDBedienAnzeigeElement", null, 0, 1, Fstr_Abhaengigkeit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Abhaengigkeit_Ssp_AttributeGroupEClass, Fstr_Abhaengigkeit_Ssp_AttributeGroup.class, "Fstr_Abhaengigkeit_Ssp_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis(), this.getAufloesung_Ssp_Zielgleis_TypeClass(), null, "aufloesungSspZielgleis", null, 0, 1, Fstr_Abhaengigkeit_Ssp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre(), theVerweisePackage.getID_Schluesselsperre_TypeClass(), null, "iDSchluesselsperre", null, 1, 1, Fstr_Abhaengigkeit_Ssp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_AneinanderEClass, Fstr_Aneinander.class, "Fstr_Aneinander", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Aneinander_FstrAneinanderBedienstring(), this.getFstr_Aneinander_Bedienstring_TypeClass(), null, "fstrAneinanderBedienstring", null, 0, 1, Fstr_Aneinander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Aneinander_Bedienstring_TypeClassEClass, Fstr_Aneinander_Bedienstring_TypeClass.class, "Fstr_Aneinander_Bedienstring_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Aneinander_Bedienstring_TypeClass_Wert(), this.getFstr_Aneinander_Bedienstring_Type(), "wert", null, 1, 1, Fstr_Aneinander_Bedienstring_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Aneinander_ZuordnungEClass, Fstr_Aneinander_Zuordnung.class, "Fstr_Aneinander_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Aneinander_Zuordnung_IDFstrAneinander(), theVerweisePackage.getID_Fstr_Aneinander_TypeClass(), null, "iDFstrAneinander", null, 1, 1, Fstr_Aneinander_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Aneinander_Zuordnung_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 1, 1, Fstr_Aneinander_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Bedienstring_TypeClassEClass, Fstr_Bedienstring_TypeClass.class, "Fstr_Bedienstring_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Bedienstring_TypeClass_Wert(), this.getFstr_Bedienstring_Type(), "wert", null, 1, 1, Fstr_Bedienstring_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_DWegEClass, Fstr_DWeg.class, "Fstr_DWeg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_DWeg_Bezeichnung(), this.getFstr_DWeg_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_FstrDWegAllg(), this.getFstr_DWeg_Allg_AttributeGroup(), null, "fstrDWegAllg", null, 1, 1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_FstrDWegSpezifisch(), this.getFstr_DWeg_Spezifisch_AttributeGroup(), null, "fstrDWegSpezifisch", null, 0, 1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_IDFMAAnlageFreimeldung(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAAnlageFreimeldung", null, 0, -1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_IDFstrFahrweg(), theVerweisePackage.getID_Fstr_Fahrweg_TypeClass(), null, "iDFstrFahrweg", null, 1, 1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_IDPZBGefahrpunkt(), theVerweisePackage.getID_Markanter_Punkt_TypeClass(), null, "iDPZBGefahrpunkt", null, 0, 1, Fstr_DWeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_DWeg_Allg_AttributeGroupEClass, Fstr_DWeg_Allg_AttributeGroup.class, "Fstr_DWeg_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_DWeg_Allg_AttributeGroup_LaengeSoll(), this.getLaenge_Soll_TypeClass(), null, "laengeSoll", null, 1, 1, Fstr_DWeg_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung(), this.getMassgebende_Neigung_TypeClass(), null, "massgebendeNeigung", null, 1, 1, Fstr_DWeg_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_DWeg_Bezeichnung_AttributeGroupEClass, Fstr_DWeg_Bezeichnung_AttributeGroup.class, "Fstr_DWeg_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg(), this.getBezeichnung_Fstr_DWeg_TypeClass(), null, "bezeichnungFstrDWeg", null, 1, 1, Fstr_DWeg_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_DWeg_Spezifisch_AttributeGroupEClass, Fstr_DWeg_Spezifisch_AttributeGroup.class, "Fstr_DWeg_Spezifisch_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung(), this.getAufloesung_Verzoegerung_TypeClass(), null, "aufloesungVerzoegerung", null, 0, 1, Fstr_DWeg_Spezifisch_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge(), this.getDWeg_Reihenfolge_TypeClass(), null, "dWegReihenfolge", null, 0, 1, Fstr_DWeg_Spezifisch_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_Spezifisch_AttributeGroup_DWegV(), this.getDWeg_V_TypeClass(), null, "dWegV", null, 0, 1, Fstr_DWeg_Spezifisch_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht(), this.getDWeg_V_Aufwertung_Verzicht_TypeClass(), null, "dWegVAufwertungVerzicht", null, 0, 1, Fstr_DWeg_Spezifisch_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAAnlageZielgleis", null, 1, 1, Fstr_DWeg_Spezifisch_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_DWeg_W_KrEClass, Fstr_DWeg_W_Kr.class, "Fstr_DWeg_W_Kr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_DWeg_W_Kr_ElementVerschluss(), this.getElement_Verschluss_TypeClass(), null, "elementVerschluss", null, 1, 1, Fstr_DWeg_W_Kr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_W_Kr_IDFstrDWeg(), theVerweisePackage.getID_Fstr_DWeg_TypeClass(), null, "iDFstrDWeg", null, 1, 1, Fstr_DWeg_W_Kr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_DWeg_W_Kr_IDWKrGspElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDWKrGspElement", null, 1, 1, Fstr_DWeg_W_Kr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_FahrwegEClass, Fstr_Fahrweg.class, "Fstr_Fahrweg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Fahrweg_FstrVHg(), this.getFstr_V_Hg_TypeClass(), null, "fstrVHg", null, 0, 1, Fstr_Fahrweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Fahrweg_IDStart(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDStart", null, 1, 1, Fstr_Fahrweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Fahrweg_IDZiel(), theVerweisePackage.getID_Ziel_TypeClass(), null, "iDZiel", null, 1, 1, Fstr_Fahrweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Fahrweg_StartSignalCharakter(), this.getStart_Signal_Charakter_TypeClass(), null, "startSignalCharakter", null, 0, 1, Fstr_Fahrweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Mittel_Art_TypeClassEClass, Fstr_Mittel_Art_TypeClass.class, "Fstr_Mittel_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Mittel_Art_TypeClass_Wert(), this.getENUMFstrMittelArtObject(), "wert", null, 1, 1, Fstr_Mittel_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Mittel_AttributeGroupEClass, Fstr_Mittel_AttributeGroup.class, "Fstr_Mittel_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Mittel_AttributeGroup_FstrMittelArt(), this.getFstr_Mittel_Art_TypeClass(), null, "fstrMittelArt", null, 1, 1, Fstr_Mittel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung(), this.getFstr_Mittel_V_Aufwertung_TypeClass(), null, "fstrMittelVAufwertung", null, 1, 1, Fstr_Mittel_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Mittel_V_Aufwertung_TypeClassEClass, Fstr_Mittel_V_Aufwertung_TypeClass.class, "Fstr_Mittel_V_Aufwertung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Mittel_V_Aufwertung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Fstr_Mittel_V_Aufwertung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_NichthaltfallEClass, Fstr_Nichthaltfall.class, "Fstr_Nichthaltfall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Nichthaltfall_IDFMAAnlage(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAAnlage", null, 1, 1, Fstr_Nichthaltfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Nichthaltfall_IDFstrFahrweg(), theVerweisePackage.getID_Fstr_Fahrweg_TypeClass(), null, "iDFstrFahrweg", null, 1, 1, Fstr_Nichthaltfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Rangier_Art_TypeClassEClass, Fstr_Rangier_Art_TypeClass.class, "Fstr_Rangier_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Rangier_Art_TypeClass_Wert(), this.getENUMFstrRangierArtObject(), "wert", null, 1, 1, Fstr_Rangier_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Rangier_AttributeGroupEClass, Fstr_Rangier_AttributeGroup.class, "Fstr_Rangier_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Rangier_AttributeGroup_AutomatischeEinstellung(), this.getAutomatische_Einstellung_TypeClass(), null, "automatischeEinstellung", null, 0, 1, Fstr_Rangier_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Rangier_AttributeGroup_FstrRangierArt(), this.getFstr_Rangier_Art_TypeClass(), null, "fstrRangierArt", null, 1, 1, Fstr_Rangier_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei(), theVerweisePackage.getID_FMA_Anlage_Rangier_Frei_TypeClass(), null, "iDFMAAnlageRangierFrei", null, 0, -1, Fstr_Rangier_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss(), this.getRangier_Gegenfahrtausschluss_TypeClass(), null, "rangierGegenfahrtausschluss", null, 0, 1, Fstr_Rangier_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Rangier_Fla_ZuordnungEClass, Fstr_Rangier_Fla_Zuordnung.class, "Fstr_Rangier_Fla_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaSchutz", null, 1, 1, Fstr_Rangier_Fla_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Rangier_Fla_Zuordnung_IDFstrRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrRangier", null, 1, 1, Fstr_Rangier_Fla_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Reihenfolge_TypeClassEClass, Fstr_Reihenfolge_TypeClass.class, "Fstr_Reihenfolge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Reihenfolge_TypeClass_Wert(), this.getFstr_Reihenfolge_Type(), "wert", null, 1, 1, Fstr_Reihenfolge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_SignalisierungEClass, Fstr_Signalisierung.class, "Fstr_Signalisierung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Signalisierung_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 1, 1, Fstr_Signalisierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Signalisierung_IDSignalSignalbegriff(), theVerweisePackage.getID_Signal_Signalbegriff_TypeClass(), null, "iDSignalSignalbegriff", null, 1, 1, Fstr_Signalisierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Signalisierung_IDSignalSignalbegriffZiel(), theVerweisePackage.getID_Signal_Signalbegriff_TypeClass(), null, "iDSignalSignalbegriffZiel", null, 0, 1, Fstr_Signalisierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_UmfahrpunktEClass, Fstr_Umfahrpunkt.class, "Fstr_Umfahrpunkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Umfahrpunkt_IDFstrFahrweg(), theVerweisePackage.getID_Fstr_Fahrweg_TypeClass(), null, "iDFstrFahrweg", null, 1, 1, Fstr_Umfahrpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Umfahrpunkt_IDUmfahrpunkt(), theVerweisePackage.getID_Umfahrpunkt_TypeClass(), null, "iDUmfahrpunkt", null, 1, 1, Fstr_Umfahrpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_V_Hg_TypeClassEClass, Fstr_V_Hg_TypeClass.class, "Fstr_V_Hg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_V_Hg_TypeClass_Wert(), this.getFstr_V_Hg_Type(), "wert", null, 1, 1, Fstr_V_Hg_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_V_TypeClassEClass, Fstr_V_TypeClass.class, "Fstr_V_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_V_TypeClass_Wert(), this.getFstr_V_Type(), "wert", null, 1, 1, Fstr_V_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Vsigabstand_Verkuerzt_TypeClassEClass, Fstr_Vsigabstand_Verkuerzt_TypeClass.class, "Fstr_Vsigabstand_Verkuerzt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Vsigabstand_Verkuerzt_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Fstr_Vsigabstand_Verkuerzt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Zug_Art_TypeClassEClass, Fstr_Zug_Art_TypeClass.class, "Fstr_Zug_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFstr_Zug_Art_TypeClass_Wert(), this.getENUMFstrZugArtObject(), "wert", null, 1, 1, Fstr_Zug_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Zug_AttributeGroupEClass, Fstr_Zug_AttributeGroup.class, "Fstr_Zug_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Zug_AttributeGroup_AutomatischeEinstellung(), this.getAutomatische_Einstellung_TypeClass(), null, "automatischeEinstellung", null, 0, 1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt(), this.getFstr_Vsigabstand_Verkuerzt_TypeClass(), null, "fstrVsigabstandVerkuerzt", null, 1, 1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_AttributeGroup_FstrZugArt(), this.getFstr_Zug_Art_TypeClass(), null, "fstrZugArt", null, 1, 1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_AttributeGroup_FstrZugDWeg(), this.getFstr_Zug_DWeg_AttributeGroup(), null, "fstrZugDWeg", null, 0, 1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_AttributeGroup_IDBUEEinschaltung(), theVerweisePackage.getID_BUE_Einschaltung_TypeClass(), null, "iDBUEEinschaltung", null, 0, -1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignalGruppenausfahrt", null, 0, 1, Fstr_Zug_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Zug_DWeg_AttributeGroupEClass, Fstr_Zug_DWeg_AttributeGroup.class, "Fstr_Zug_DWeg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Zug_DWeg_AttributeGroup_DWegVorzug(), this.getDWeg_Vorzug_TypeClass(), null, "dWegVorzug", null, 1, 1, Fstr_Zug_DWeg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg(), theVerweisePackage.getID_Fstr_DWeg_TypeClass(), null, "iDFstrDWeg", null, 1, 1, Fstr_Zug_DWeg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Zug_RangierEClass, Fstr_Zug_Rangier.class, "Fstr_Zug_Rangier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Zug_Rangier_FstrZugRangierAllg(), this.getFstr_Zug_Rangier_Allg_AttributeGroup(), null, "fstrZugRangierAllg", null, 1, 1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_IDFstrAusschlussBesonders(), theVerweisePackage.getID_Fstr_Ausschluss_Besonders_TypeClass(), null, "iDFstrAusschlussBesonders", null, 0, -1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_IDFstrFahrweg(), theVerweisePackage.getID_Fstr_Fahrweg_TypeClass(), null, "iDFstrFahrweg", null, 1, 1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_FstrMittel(), this.getFstr_Mittel_AttributeGroup(), null, "fstrMittel", null, 0, 1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_FstrRangier(), this.getFstr_Rangier_AttributeGroup(), null, "fstrRangier", null, 0, 1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_FstrZug(), this.getFstr_Zug_AttributeGroup(), null, "fstrZug", null, 0, 1, Fstr_Zug_Rangier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fstr_Zug_Rangier_Allg_AttributeGroupEClass, Fstr_Zug_Rangier_Allg_AttributeGroup.class, "Fstr_Zug_Rangier_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung(), this.getF_Bedienung_TypeClass(), null, "fBedienung", null, 0, 1, Fstr_Zug_Rangier_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring(), this.getFstr_Bedienstring_TypeClass(), null, "fstrBedienstring", null, 0, 1, Fstr_Zug_Rangier_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge(), this.getFstr_Reihenfolge_TypeClass(), null, "fstrReihenfolge", null, 1, 1, Fstr_Zug_Rangier_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV(), this.getFstr_V_TypeClass(), null, "fstrV", null, 0, 1, Fstr_Zug_Rangier_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laenge_Soll_TypeClassEClass, Laenge_Soll_TypeClass.class, "Laenge_Soll_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaenge_Soll_TypeClass_Wert(), this.getLaenge_Soll_Type(), "wert", null, 1, 1, Laenge_Soll_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markanter_PunktEClass, Markanter_Punkt.class, "Markanter_Punkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkanter_Punkt_Bezeichnung(), this.getMarkanter_Punkt_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Markanter_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkanter_Punkt_IDDWegErlaubnisabhaengig(), theVerweisePackage.getID_Block_Element_TypeClass(), null, "iDDWegErlaubnisabhaengig", null, 0, 1, Markanter_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkanter_Punkt_IDMarkanteStelle(), theVerweisePackage.getID_Markante_Stelle_TypeClass(), null, "iDMarkanteStelle", null, 1, 1, Markanter_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markanter_Punkt_Bezeichnung_AttributeGroupEClass, Markanter_Punkt_Bezeichnung_AttributeGroup.class, "Markanter_Punkt_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt(), this.getBezeichnung_Markanter_Punkt_TypeClass(), null, "bezeichnungMarkanterPunkt", null, 1, 1, Markanter_Punkt_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(massgebende_Neigung_TypeClassEClass, Massgebende_Neigung_TypeClass.class, "Massgebende_Neigung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMassgebende_Neigung_TypeClass_Wert(), this.getMassgebende_Neigung_Type(), "wert", null, 1, 1, Massgebende_Neigung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangier_Gegenfahrtausschluss_TypeClassEClass, Rangier_Gegenfahrtausschluss_TypeClass.class, "Rangier_Gegenfahrtausschluss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangier_Gegenfahrtausschluss_TypeClass_Wert(), this.getENUMRangierGegenfahrtausschlussObject(), "wert", null, 1, 1, Rangier_Gegenfahrtausschluss_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sonstiger_PunktEClass, Sonstiger_Punkt.class, "Sonstiger_Punkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSonstiger_Punkt_IDBeginnBereich(), theVerweisePackage.getID_Beginn_Bereich_TypeClass(), null, "iDBeginnBereich", null, 0, 1, Sonstiger_Punkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(start_Signal_Charakter_TypeClassEClass, Start_Signal_Charakter_TypeClass.class, "Start_Signal_Charakter_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStart_Signal_Charakter_TypeClass_Wert(), this.getENUMStartSignalCharakterObject(), "wert", null, 1, 1, Start_Signal_Charakter_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAufloesungSspZielgleisEEnum, ENUMAufloesungSspZielgleis.class, "ENUMAufloesungSspZielgleis");
		addEEnumLiteral(enumAufloesungSspZielgleisEEnum, ENUMAufloesungSspZielgleis.ENUM_AUFLOESUNG_SSP_ZIELGLEIS_BESETZT);
		addEEnumLiteral(enumAufloesungSspZielgleisEEnum, ENUMAufloesungSspZielgleis.ENUM_AUFLOESUNG_SSP_ZIELGLEIS_FREI);

		initEEnum(enumAutomatischeEinstellungEEnum, ENUMAutomatischeEinstellung.class, "ENUMAutomatischeEinstellung");
		addEEnumLiteral(enumAutomatischeEinstellungEEnum, ENUMAutomatischeEinstellung.ENUM_AUTOMATISCHE_EINSTELLUNG_SB);
		addEEnumLiteral(enumAutomatischeEinstellungEEnum, ENUMAutomatischeEinstellung.ENUM_AUTOMATISCHE_EINSTELLUNG_ZL);

		initEEnum(enumFstrMittelArtEEnum, ENUMFstrMittelArt.class, "ENUMFstrMittelArt");
		addEEnumLiteral(enumFstrMittelArtEEnum, ENUMFstrMittelArt.ENUM_FSTR_MITTEL_ART_ZM);
		addEEnumLiteral(enumFstrMittelArtEEnum, ENUMFstrMittelArt.ENUM_FSTR_MITTEL_ART_ZUM);

		initEEnum(enumFstrRangierArtEEnum, ENUMFstrRangierArt.class, "ENUMFstrRangierArt");
		addEEnumLiteral(enumFstrRangierArtEEnum, ENUMFstrRangierArt.ENUM_FSTR_RANGIER_ART_RR);
		addEEnumLiteral(enumFstrRangierArtEEnum, ENUMFstrRangierArt.ENUM_FSTR_RANGIER_ART_RT);
		addEEnumLiteral(enumFstrRangierArtEEnum, ENUMFstrRangierArt.ENUM_FSTR_RANGIER_ART_RTU);
		addEEnumLiteral(enumFstrRangierArtEEnum, ENUMFstrRangierArt.ENUM_FSTR_RANGIER_ART_RU);

		initEEnum(enumFstrZugArtEEnum, ENUMFstrZugArt.class, "ENUMFstrZugArt");
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_B);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZH);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZR);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZT);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZTU);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZU);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZUH);
		addEEnumLiteral(enumFstrZugArtEEnum, ENUMFstrZugArt.ENUM_FSTR_ZUG_ART_ZZ);

		initEEnum(enumRangierGegenfahrtausschlussEEnum, ENUMRangierGegenfahrtausschluss.class, "ENUMRangierGegenfahrtausschluss");
		addEEnumLiteral(enumRangierGegenfahrtausschlussEEnum, ENUMRangierGegenfahrtausschluss.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_INSELGLEIS_FREI);
		addEEnumLiteral(enumRangierGegenfahrtausschlussEEnum, ENUMRangierGegenfahrtausschluss.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_JA);
		addEEnumLiteral(enumRangierGegenfahrtausschlussEEnum, ENUMRangierGegenfahrtausschluss.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_NEIN);

		initEEnum(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.class, "ENUMStartSignalCharakter");
		addEEnumLiteral(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL);
		addEEnumLiteral(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.ENUM_START_SIGNAL_CHARAKTER_AUSFAHR_SIGNAL_NACHGELAGERT);
		addEEnumLiteral(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.ENUM_START_SIGNAL_CHARAKTER_BLOCK_SIGNAL);
		addEEnumLiteral(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.ENUM_START_SIGNAL_CHARAKTER_EINFAHR_SIGNAL);
		addEEnumLiteral(enumStartSignalCharakterEEnum, ENUMStartSignalCharakter.ENUM_START_SIGNAL_CHARAKTER_NACHRUECK_SIGNAL);

		// Initialize data types
		initEDataType(aufloesung_Verzoegerung_TypeEDataType, BigDecimal.class, "Aufloesung_Verzoegerung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Fstr_DWeg_TypeEDataType, String.class, "Bezeichnung_Fstr_DWeg_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Markanter_Punkt_TypeEDataType, String.class, "Bezeichnung_Markanter_Punkt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dWeg_Reihenfolge_TypeEDataType, BigInteger.class, "DWeg_Reihenfolge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dWeg_V_TypeEDataType, BigInteger.class, "DWeg_V_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAufloesungSspZielgleisObjectEDataType, ENUMAufloesungSspZielgleis.class, "ENUMAufloesungSspZielgleisObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAutomatischeEinstellungObjectEDataType, ENUMAutomatischeEinstellung.class, "ENUMAutomatischeEinstellungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFstrMittelArtObjectEDataType, ENUMFstrMittelArt.class, "ENUMFstrMittelArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFstrRangierArtObjectEDataType, ENUMFstrRangierArt.class, "ENUMFstrRangierArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFstrZugArtObjectEDataType, ENUMFstrZugArt.class, "ENUMFstrZugArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumRangierGegenfahrtausschlussObjectEDataType, ENUMRangierGegenfahrtausschluss.class, "ENUMRangierGegenfahrtausschlussObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumStartSignalCharakterObjectEDataType, ENUMStartSignalCharakter.class, "ENUMStartSignalCharakterObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fstr_Aneinander_Bedienstring_TypeEDataType, String.class, "Fstr_Aneinander_Bedienstring_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fstr_Bedienstring_TypeEDataType, String.class, "Fstr_Bedienstring_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fstr_Reihenfolge_TypeEDataType, BigInteger.class, "Fstr_Reihenfolge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fstr_V_Hg_TypeEDataType, BigInteger.class, "Fstr_V_Hg_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fstr_V_TypeEDataType, BigInteger.class, "Fstr_V_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(laenge_Soll_TypeEDataType, BigDecimal.class, "Laenge_Soll_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(massgebende_Neigung_TypeEDataType, BigDecimal.class, "Massgebende_Neigung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (fstr_AbhaengigkeitEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung aller f\u00fcr einen Fstr Fahrweg zu sichernden und nicht durch die Topologie auffindbaren Objekte. Nicht durch die Topologie findbar sind insbesondere: Schluesselsperre, Zustimmungsschalter/-taster. Spezialfall: F\u00fcr eine Rangierstra\u00dfe kann richtungsabh\u00e4ngig geplant werden, dass eine Schl\u00fcsselsperre im Zielgleis nicht \u00fcberwacht wird. In dem (sehr seltenen) Fall m\u00fcssen f\u00fcr eine Zug- und eine Rangierstra\u00dfe mit identischem Fahrweg zwei Instanzen Fstr Fahrweg angelegt werden. DB-Regelwerk Schl\u00fcsselsperre: Zugstra\u00dfentabelle, Spalte 5: \\\"Ssp in der Fahrstra\u00dfe verschlossen und \u00fcberwacht\\\"; Rangierstra\u00dfentabelle, Spalte 15: \\\"Ssp in der Rangierstra\u00dfe verschlossen und \u00fcberwacht\\\". Zustimmungsschalter/-taster: Bemerkung/Fu\u00dfnote. "
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des abh\u00e4ngigen Elements zu Fstr Fahrweg. DB-Regelwerk Zugstra\u00dfentabelle, Zeile "
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_IDBedienAnzeigeElement(),
		   source,
		   new String[] {
			   "documentation", "Bedien_Anzeige_Element, das wirksam sein muss, damit die Fstr gesichert ist. DB-Regelwerk Mittelweichenteilfahrstra\u00dfentabelle: Bemerkung oder Fu\u00dfnote. Schalter/Taster: Zugstra\u00dfentabelle: Bemerkung oder Fu\u00dfnote; Rangierstra\u00dfentabelle: Bemerkung oder Fu\u00dfnote; Mittelweichenteilfahrstra\u00dfentabelle: Bemerkung oder Fu\u00dfnote. "
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis(),
		   source,
		   new String[] {
			   "documentation", "Kriterium f\u00fcr die Aufl\u00f6sung von \u00fcberwachten Schl\u00fcsselsperren im Zielgleis von Rangierstra\u00dfen. DB-Regelwerk Lastenheft ESTW F1, Abschnitt 6.5 (Rangierstra\u00dfenaufl\u00f6sung)"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre(),
		   source,
		   new String[] {
			   "documentation", "Schl\u00fcsselsperre, die \u00fcberwacht sein muss, damit die Fstr gesichert ist. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 5: \\\"Ssp in der Fahrstra\u00dfe verschlossen und \u00fcberwacht\\\"; Rangierstra\u00dfentabelle, Spalte 15: \\\"Ssp in der Rangierstra\u00dfe verschlossen und \u00fcberwacht\\\""
		   });
		addAnnotation
		  (fstr_AneinanderEClass,
		   source,
		   new String[] {
			   "documentation", "Aneinandergereihte Zug- oder Rangierstra\u00dfe. Die Reihenfolge der aneinandergereihten Fahrstra\u00dfen wird nicht mit abgespeichert, da diese aus Start und Ziel erkennbar ist. Durch die Auswahl der letzten Fahrstra\u00dfe (bei Zugstra\u00dfen) wird der Durchrutschweg festgelegt. Sollen f\u00fcr die aneinandergereihte Zugstra\u00dfe mehrere Durchrutschwege m\u00f6glich sein, so sind entsprechend viele aneinandergereihte Zugstra\u00dfen zu planen (Ausnahmefall). F\u00fcr die erste bis vorletzte Fahrstra\u00dfe muss jeweils ein Durchrutschweg gew\u00e4hlt werden, dessen Weg Bestandteil der folgenden Fahrstra\u00dfe ist; sollten hiervon mehrere existieren, wird der mit den geringsten betrieblichen Einschr\u00e4nkungen (i. d. R. der l\u00e4ngste) verwendet. DB-Regelwerk Aneinandergereihte Zugstra\u00dfentabelle Aneinandergereihte Rangierstra\u00dfentabelle "
		   });
		addAnnotation
		  (getFstr_Aneinander_FstrAneinanderBedienstring(),
		   source,
		   new String[] {
			   "documentation", "Bedienstring der aneinandergereihten Zug- oder Rangierstra\u00dfe. Der Bedienstring ergibt sich in der Regel aus dem Start und dem Ziel der aneinandergereihten Fahrstra\u00dfe, kann aber auch davon abweichen. DB-Regelwerk Aneinandergereihte Zugstra\u00dfen-/Rangierstra\u00dfentabelle, Spalten 1 und 2"
		   });
		addAnnotation
		  (fstr_Aneinander_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung der aneinandergereihten Zug- oder Rangierstra\u00dfe zu den Fahrstra\u00dfen Fstr Zug Rangier (\\\"Elementarfahrstra\u00dfen\\\"), aus denen sie besteht. DB-Regelwerk Tabelle der aneinandergereihten Zugstra\u00dfen Tabelle der aneinandergereihten Rangierstra\u00dfen "
		   });
		addAnnotation
		  (getFstr_Aneinander_Zuordnung_IDFstrAneinander(),
		   source,
		   new String[] {
			   "documentation", "Zeiger auf Fstr Aneinander des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstra\u00dfentabelle: Eintragungen einer Zeile"
		   });
		addAnnotation
		  (getFstr_Aneinander_Zuordnung_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Zeiger auf die jeweilige Fahrstra\u00dfe des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstra\u00dfentabelle: Eintragungen einer Zeile "
		   });
		addAnnotation
		  (fstr_DWegEClass,
		   source,
		   new String[] {
			   "documentation", "Durchrutschweg oder Gefahrpunktabstand. Die Ausdehnung des Durchrutschwegs bzw. Gefahrpunktabstands wird mit dem Bereich Objekt Fstr Fahrweg festgelegt. Ein Durchrutschweg kann von mehreren Fahrstra\u00dfen genutzt werden. Ist die Attributgruppe Fstr_DWeg_Spezifisch nicht gef\u00fcllt, so handelt es sich um einen Gefahrpunktabstand. Ein Durchrutschweg der L\u00e4nge Null wird ebenfalls als Instanz von Fstr_DWeg abgebildet. In dem Fall wird mit Fstr Fahrweg ein Bereichsobjekt der L\u00e4nge Null mit Start und Ziel am Zielsignal der Fahrstra\u00dfe verwendet. Derartige Durchrutschwege sind zu planen: am realen Zielsignal, hinter denen ein (Wahl-)Durchrutschweg der L\u00e4nge Null vorgesehen ist, am fiktiven Zielsignal bei Stumpfgleiseinfahrt, am Zugdeckungssignal. Siehe hierzu auch Aufloesung Verzoegerung. DB-Regelwerk Durchrutschwegtabelle (eine Zeile)"
		   });
		addAnnotation
		  (getFstr_DWeg_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getFstr_DWeg_IDFMAAnlageFreimeldung(),
		   source,
		   new String[] {
			   "documentation", "Freimeldeabschnitt(e) des Durchrutschwegs bzw. Gefahrpunktabstands, der/die freigepr\u00fcft wird/werden. Es werden alle zu ber\u00fccksichtigenden Freimeldeabschnitte angegeben. Die Notwendigkeit, insbesondere den letzten freizupr\u00fcfenden Abschnitt zu definieren, ergibt sich aus der Tatsache, dass das Ende des Durchrutschweges (Markanter Punkt) bzw. der Gefahrpunkt nicht unbedingt deckungsgleich mit einer Gleisfreimeldegrenze sein muss. Die Angabe ist optional, da ein Durchrutschweg auch keinen Freimeldeabsschnitt haben kann (z. B. bei sehr kurzen Durchrutschwegen bis einschlie\u00dflich \\\"Null\\\") und der Gefahrpunktabstand bei Freimeldung mit Achsz\u00e4hlern heute in der Regel zusammen mit dem Blockabschnitt freigemeldet wird. Nur bei separater Freimeldung des Gefahrpunktabstands ist die Angabe erforderlich. DB-Regelwerk Durchrutschwegtabelle, Spalte 13: \\\"technisch freizupr\u00fcfende Freimeldeabschnitte\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Fstr Fahrweg zur Angabe der Lage des DWegs. DB-Regelwerk Durchrutschwegtabelle, Spalten \\\"von Signal\\\" und \\\"bis\\\"  "
		   });
		addAnnotation
		  (getFstr_DWeg_IDPZBGefahrpunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Objekt Markanter Punkt, das den PZB-Gefahrpunkt hinter dem Signal, zu dem der Durchrutschweg geh\u00f6rt, repr\u00e4sentiert. Der Durchrutschweg hat keinen PZB-Gefahrpunkt am fiktiven Zielsignal bei Stumpfgleiseinfahrt und am Zugdeckungssignal. PZB-Gefahrpunkt kann sein: ein Grenzzeichen, die Zugspitze/der Zugschluss eines am gew\u00f6hnlichen Halteplatz stehenden Zuges, eine Rangierhalttafel sowie ein ortsfestes Rangier- und Schutzhaltsignal in Gegenrichtung, eine durch Schutzsignal zu sch\u00fctzende Gefahrstelle, ein Bahnsteigende oder der Zugschluss einer Bedienfahrt in einer Awanst. Der PZB-Gefahrpunkt ist vom Gefahrpunkt f\u00fcr Hauptsignale nach Ril 819.02 zu unterscheiden, was sich schon aus den abweichenden Auflistungen ergibt. Der PZB-Gefahrpunkt dient zur Bemessung der Ausr\u00fcstung der Signale mit Anlagen der PZB. W\u00e4hrend der Gefahrpunkt auch betriebliche Aufgaben hat und sowohl vom \u00f6rtlichen als auch vom fahrenden Personal jederzeit erkennbar sein muss, stellt der PZB-Gefahrpunkt die rein technische Sicht auf einen m\u00f6glichen Konfliktpunkt eines mittels PZB zwangsgebremsten Zuges mit einem anderen Zug dar. Zur Ermittlung dieses Konfliktpunktes werden die Ma\u00dfnahmen der Fahrwegsicherung - z. B. Flankenschutz - mitbetrachtet. Konfliktpunkte mit Rangierfahrten werden nur in wenigen F\u00e4llen (besonderes Gefahrenpotential) ber\u00fccksichtigt. DB-Regelwerk 819.1310 6 Gleismagnettabelle, Zeile 15 "
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_LaengeSoll(),
		   source,
		   new String[] {
			   "documentation", "Solll\u00e4nge des DWeges. Bei Stumpfgleiseinfahrten betr\u00e4gt die Solll\u00e4nge = 0. Bei DWegen \\u0026gt; 0 und \\u0026lt; 50 m ist die Solll\u00e4nge = 50 m. Die Verk\u00fcrzung ist explizit zu begr\u00fcnden. Eine Neuplanung ist allerdings nicht mehr erlaubt und kann deshalb nur in alten Planungen auftauchen. DB-Regelwerk Durchrutschwegtabelle, Spalte 7: \\\"L\u00e4nge Soll\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung(),
		   source,
		   new String[] {
			   "documentation", "Ma\u00dfgebende Neigung des DWeges in Promille. Die Neigung ist f\u00fcr die Berechnung der Soll-L\u00e4nge des DWeges relevant. DB-Regelwerk Durchrutschwegtabelle, Spalte 8: \\\"ma\u00dfgebende Neigung\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Durchrutschwegs. Der erste Durchrutschweg hinter jedem Zugziel wird mit \\\"D1\\\" bezeichnet, alle weiteren Durchrutschwege erhalten eine fortlaufende Nummerierung (D2, D3, ...). Von der Bezeichnung unabh\u00e4ngig ist der Vorzugs-DWeg. H-Fahrstra\u00dfen werden \u00fcber Fahrstra\u00dfen mit D-Wegen abgebildet, deren Bezeichnung um den Zusatz \u201eH\u201c erweitert wird (z. B. D1H). DB-Regelwerk Durchrutschwegtabelle, Spalte 3: \\\"Bezeichnung\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung(),
		   source,
		   new String[] {
			   "documentation", "Verz\u00f6gerungszeit der Durchrutschwegaufl\u00f6sung bei zeitgesteuerter Aufl\u00f6sung. Bef\u00fcllung bei Durchrutschwegen der L\u00e4nge \\\"Null\\\": Ziel ist ein Zugdeckungssignal: Kennlichtverz\u00f6gerungszeit, In allen anderen F\u00e4llen: 0 (Null). DB-Regelwerk Durchrutschwegtabelle, Spalte 17: \\\"verz\u00f6gert\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge(),
		   source,
		   new String[] {
			   "documentation", "Reihenfolge des Erscheinens von DWegen auf der Bedienoberfl\u00e4che. Die Angabe wird ausschlie\u00dflich im Untergewerk \\\"Bedienung Fdl\\\" ben\u00f6tigt und ist f\u00fcr das Untergewerk \\\"ESTW\\\" nicht relevant. Die Auflistung von D-Wegen in der D-Weg-Tabelle erfolgt rein auf Basis alphanumerischer Sortierung. DB-Regelwerk Durchrutschwegtabelle: Reihenfolge des Eintrags von Durchrutschwegen eines Signals"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegV(),
		   source,
		   new String[] {
			   "documentation", "Geschwindigkeitseinschr\u00e4nkung, die sich allein aufgrund der L\u00e4nge des DWeges ergibt. Die tats\u00e4chlich gefahrene Geschwindigkeit kann aus anderen Gr\u00fcnden (Weichen, Gleislage etc.) geringer sein. Die Geschwindigkeitsrestriktion gilt nur f\u00fcr signalgef\u00fchrte Z\u00fcge, bei ETCS L2oS erfolgt keine Angabe. DB-Regelwerk Durchrutschwegtabelle, Spalte 4: \\\"[Geschwindigkeit] m\u00f6glich\\\" (au\u00dfer v max)"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht(),
		   source,
		   new String[] {
			   "documentation", "Bei \u00dcberstellung des DWeges durch die anschlie\u00dfende Fahrstra\u00dfe wird auf eine Aufwertung der Geschwindigkeitseinschr\u00e4nkung aufgrund des DWeges verzichtet. In der Regel f\u00fchrt die \u00dcberstellung eines DWeges zum Wegfall der durch den DWeg verursachten Geschwindigkeitsrestriktion. War die DWeg-Geschwindigkeit ma\u00dfgebend, so kann die erste Fahrstra\u00dfe mit einer entsprechend h\u00f6heren Geschwindigkeit signalisiert werden (Geschwindigkeitsaufwertung). In Ausnahmef\u00e4llen soll die Aufwertung nicht stattfinden, insbesondere dann, wenn die folgende Fahrstra\u00dfe k\u00fcrzer ist, als der aufgewertete DWeg. Damit wird auf die \\\"Aufwertung verzichtet\\\". Das Attribut ist nur bei folgenden DWegen sinnvoll f\u00fcllbar: am Beginn des DWeges beginnt eine Zugstra\u00dfe UND es handelt sich um einen verk\u00fcrzten DWeg, aufgrund dessen die Einfahrgeschwindigkeit vermindert wird. DB-Regelwerk Durchrutschwegtabelle, Spalte 14: \\\"zul\u00e4ssige D-Weg Expansion\\\", allerdings in negierter Bedeutung zum jetzigen Attribut"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis(),
		   source,
		   new String[] {
			   "documentation", "Freimeldeabschnitt, bei dessen Belegung die zeitgesteuerte Durchrutschwegaufl\u00f6sung beginnt. DB-Regelwerk Durchrutschwegtabelle, Spalte 16: \\\"Zielgleisabschnitt\\\""
		   });
		addAnnotation
		  (fstr_DWeg_W_KrEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Weichen und Kreuzungen zum in Fstr DWeg geplanten Durchrutschweg. Eine Zuordnung von Weichen und Kreuzungen \u00fcber den zugrunde liegenden Fstr Fahrweg ist nicht m\u00f6glich, da das Ende des Durchrutschweges in einer Weiche liegen kann, deren Sicherung explizit geplant werden muss. Au\u00dferdem muss f\u00fcr Weichen im Durchrutschweg angegeben werden, ob sie verschlossen werden sollen. Eine Angabe der Lage der Weiche ist nicht notwendig, da sich diese \u00fcber Fstr Fahrweg (Bereich Objekt) ergibt. Obwohl die Spalten\u00fcberschrift in der Durchrutschwegtabelle auch von Gleissperren spricht, werden Gleissperren nicht vorgesehen. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \\\"Weichen, Kreuzungen, Gleissperren\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_ElementVerschluss(),
		   source,
		   new String[] {
			   "documentation", "Verschluss der Weiche im Durchrutschweg. Stumpf berutschte, auffahrbare Weichen im Durchrutschweg k\u00f6nnen unverschlossen bleiben.\nDas Attribut ist herstellerneutralit\u00e4tskritisch.\nDB-Regelwerk \nDurchrutschwegtabelle, Spalten 9 - 12: \\\"Weichen, Kreuzungen, Gleissperren\\\""
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_IDFstrDWeg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle (gleiche Zeile) "
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_IDWKrGspElement(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \\\"Weichen, Kreuzungen, Gleissperren - verschlie\u00dfen/nicht verschlie\u00dfen\\\" "
		   });
		addAnnotation
		  (fstr_FahrwegEClass,
		   source,
		   new String[] {
			   "documentation", "Unverzweigter Bereich auf dem Gleisnetz, der als Grundlage f\u00fcr den befahrenen Teil bzw. den Durchrutschweg einer Fahrstra\u00dfe dient. Der Start befindet sich immer an einem Signal, das Ziel beim befahrenen Teil an einem Signal, beim Durchrutschweg (bzw. Gefahrpunktabstand) an einem markanten Punkt. F\u00fcr Zug- und Rangierstra\u00dfen mit gleichem Fahrweg kann die gleiche Instanz von Fstr_Fahrweg verwendet werden; Ausnahmen siehe Fstr Abhaengigkeit. Hinweis zur Modellierung beim Durchrutschweg, wenn der Markante Punkt eine Weichenspitze ist: L\u00e4uft ein Durchrutschweg spitz auf eine Weiche zu und die Spitze dieser Weiche ist das Ende des Durchrutschwegs, dann endet das Bereichsobjekt Fstr_Fahrweg am Ende der Kante vor der Spitze der Weiche, ist der markante Punkt das Punktobjekt W_Kr_Gsp_Komponente, was auf anschlie\u00dfenden Kanten verweist. Damit liegen das Ende des Bereichsobjekts und der markante Punkt auf verschiedenen Kanten (jeweils mit Abstand 0 zum Knoten), dennoch beschreiben sie geografisch den gleichen Punkt. DB-Regelwerk Im heutigen Planungswerk findet sich der Weg nur implizit durch die Angabe f\u00fcr den befahrenen Teil von Start, Ziel und Entscheidungsweichen in der Zug- bzw. Rangierstra\u00dfentabelle, f\u00fcr den Durchrutschweg und Gefahrpunktabstand von Start und Ziel und allen Weichen in der Durchrutschweg- bzw. Gefahrpunkttabelle. "
		   });
		addAnnotation
		  (getFstr_Fahrweg_FstrVHg(),
		   source,
		   new String[] {
			   "documentation", "Geschwindigkeit, die bei Zugstra\u00dfen mit diesem befahrenen Teil ohne Einschr\u00e4nkung durch Zs 3 gefahren w\u00fcrde (Geschwindigkeit der Strecke). Das Attribut ist nur sinnvoll f\u00fcllbar, wenn auf dem zugeh\u00f6rigen Fahrweg eine Zugstra\u00dfe existiert, deren Befahrung mit Fahrtstellung eines Hauptsignals zugelassen wird. Es ist also nicht sinnvoll f\u00fcllbar bei Instanzen von Fstr_Fahrweg, die nur von Rangierstra\u00dfen, Gefahrpunktabst\u00e4nden, Durchrutschwegen oder Hilfszugstra\u00dfen verwendet werden. Siehe auch Bildung der Signalbegriffe."
		   });
		addAnnotation
		  (getFstr_Fahrweg_IDStart(),
		   source,
		   new String[] {
			   "documentation", "Startpunkt von Fstr Fahrweg. Das Signal muss ein Haupt-, Sperrsignal oder ein Bedienpunkt sein. DB-Regelwerk Zugstra\u00dfentabelle: erster Bestandteil der Bezeichnung der Fstr; Durchrutschwegtabelle, Spalte 1: \\\"von Signal\\\". "
		   });
		addAnnotation
		  (getFstr_Fahrweg_IDZiel(),
		   source,
		   new String[] {
			   "documentation", "Zielpunkt von Fstr Fahrweg. Der Zielpunkt besteht beim befahrenen Teil aus einem Signal mit der Auspr\u00e4gung Hauptsignal, Sperrsignal oder Bedienpunkt, beim Durchrutschweg aus einem markanten Punkt. DB-Regelwerk Befahrener Teil: In der Fahrstra\u00dfentabelle genanntes Ziel der Fahrstra\u00dfe; Durchrutschweg: Durchrutschwegtabelle, Spalte 2 \\\"bis\\\". "
		   });
		addAnnotation
		  (getFstr_Fahrweg_StartSignalCharakter(),
		   source,
		   new String[] {
			   "documentation", "Fahrwegbezogener Charakter des Start-Signals, sofern abweichend von der im Signal definierten Signal_Funktion. DB-Regelwerk Ril 819.1361, Tabelle der Signalabst\u00e4nde und Schutzstrecken"
		   });
		addAnnotation
		  (getFstr_Mittel_AttributeGroup_FstrMittelArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Mittelweichenteil-Fahrstra\u00dfe. ZM \u2013 ZugMittelweichenteil-, ZUM \u2013 ZugUmfahrMittelweichenteil-. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 2 \\\"Art\\\""
		   });
		addAnnotation
		  (getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung(),
		   source,
		   new String[] {
			   "documentation", "Die Aufwertung des Signals aus einer Einschr\u00e4nkung aufgrund von Mittelweichen ist m\u00f6glich. Ist eine Mittelweiche f\u00fcr eine Geschwindigkeitseinschr\u00e4nkung verantwortlich, so f\u00e4llt nach Freifahren dieser die Restriktion weg und das Signalbild kann aufgewertet werden. DB-Regelwerk Mittelweichenteilfahrstra\u00dfentabelle, Spalte 6 \\\"Geschwindigkeit - Aufwertung\\\""
		   });
		addAnnotation
		  (fstr_NichthaltfallEClass,
		   source,
		   new String[] {
			   "documentation", "Nichthaltfallabschnitt (auch: Haltfallverhinderungsabschnitt). Im Gegensatz zur bisherigen Praxis der LST-Planung, den Haltfallabschnitt zu planen, werden im Datenmodell nur die Nichthaltfallabschnitte f\u00fcr jeden Fahrweg geplant. In der Regel ist es einer, selten mehrere. DB-Regelwerk Haltfallabschnitt bisher: Zugstra\u00dfentabelle, Spalte 6: Signalhaltfall"
		   });
		addAnnotation
		  (getFstr_Nichthaltfall_IDFMAAnlage(),
		   source,
		   new String[] {
			   "documentation", "Freimeldeabschnitt, der als Nichthaltfallabschnitt genutzt wird. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstra\u00dfentabelle, Spalte 6: Signalhaltfall."
		   });
		addAnnotation
		  (getFstr_Nichthaltfall_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Nichthaltfallabschnitts zu Fstr Fahrweg. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstra\u00dfentabelle, Spalte 6: Signalhaltfall "
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_AutomatischeEinstellung(),
		   source,
		   new String[] {
			   "documentation", "M\u00f6glichkeit des Fahrstra\u00dfenansto\u00dfes \u00fcber die manuelle Bedienung hinaus. Die Angabe f\u00fcr eine Zugstra\u00dfe gilt auch f\u00fcr eventuell zugeh\u00f6rige (davorliegende) Mittelweichenteilfahrstra\u00dfen. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 9 \\\"Selbststellbetrieb/Zuglenkung\\\" "
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_FstrRangierArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Rangierstra\u00dfe. RR \u2013 RangierRegel-, RT - RangierTeil-, RTU - RangierTeilUmfahr-, RU \u2013 RangierUmfahr-. DB-Regelwerk Rangierstra\u00dfentabelle, Spalte 2 \\\"Art\\\""
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den/die Freimeldeabschnitt(e), f\u00fcr die eine positive Gleisfreimeldung vor Sh 1/Ra 12-Stellung f\u00fcr die Rangierstra\u00dfe notwendig ist. DB-Regelwerk Rangierstra\u00dfentabelle, Spalte 10 \\\"Punktf\u00f6rmige Gleisfreimeldepr\u00fcfung erforderlich\\\" und Spalte 13 \\\"Verzicht auf Zielgleisfreipr\u00fcfung\\\""
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss(),
		   source,
		   new String[] {
			   "documentation", "Gegenfahrtausschluss von Rangierstra\u00dfen in ein Inselgleis. Die Funktion entspricht Lastenheft ESTW R2.2.14. ja: Gegenfahrtausschluss besteht (Standardfunktion); Inselgleis_frei: Gegenfahrtausschluss besteht, wenn die Gegenrangierfahrt das Inselgleis noch nicht belegt hat;\nnein: Gegenfahrtausschluss besteht nicht. Gibt es keine Gegenrangierstra\u00dfe (das Ziel der Rangierstra\u00dfe liegt nicht in einem Inselgleis), ist das Attribut nicht sinnvoll f\u00fcllbar und somit im XML-Export nicht enthalten. DB-Regelwerk Rangierstra\u00dfentabelle, Spalte 9 \\\"Ausschluss von Gegenfahrten\\\""
		   });
		addAnnotation
		  (fstr_Rangier_Fla_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von zu gew\u00e4hrleistenden Flankenschutzma\u00dfnahmen zur Rangierstra\u00dfe. Nur in Ausnahmef\u00e4llen wird Flankenschutz f\u00fcr Rangierstra\u00dfen realisiert. Dann kann f\u00fcr jede Weiche einzeln bestimmt werden, ob sie Flankenschutz bekommt."
		   });
		addAnnotation
		  (getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Fahrwegelement, f\u00fcr das Flankenschutz angefordert werden soll, wenn es durch die angegebene Rangierstra\u00dfe beansprucht wird."
		   });
		addAnnotation
		  (getFstr_Rangier_Fla_Zuordnung_IDFstrRangier(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Rangierstra\u00dfe, f\u00fcr die das unter ID Fla Schutz angegebene Fahrwegelement Flankenschutz anfordern soll. "
		   });
		addAnnotation
		  (fstr_SignalisierungEClass,
		   source,
		   new String[] {
			   "documentation", "Je Fahrstra\u00dfe zu zeigende Signalisierung, die sich nicht eindeutig aus den Stellwerksfunktionen ergibt. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, jedoch sind hier alle Signalisierungen angegeben."
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Signalbildes zur jeweiligen Fahrstra\u00dfe. DB-Regelwerk Signaltabelle 2, Spalte 1: \\\"Signalisierungsabschnitt/Zugstra\u00dfe\\\" "
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDSignalSignalbegriff(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Signalbegriffs zur jeweiligen Fahrstra\u00dfe, u. U. in Abh\u00e4ngigkeit von ID Signal Signalbegriff Ziel. DB-Regelwerk Signaltabelle 2: Eintrag der jeweiligen Signalbegriffe"
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDSignalSignalbegriffZiel(),
		   source,
		   new String[] {
			   "documentation", "Optionale Bedingung f\u00fcr die Anzeige von Fstr_Signalisierung.ID Signal Signalbegriff. Das Zielsignal ist meist das Signal am Fahrstra\u00dfenziel, kann aber auch davor (z. B. gestufte Geschwindigkeitssignalisierung) oder dahinter (z. B. nach dem Ende des Weichenbereiches bei Ausfahrten) liegen."
		   });
		addAnnotation
		  (fstr_UmfahrpunktEClass,
		   source,
		   new String[] {
			   "documentation", "Bezeichner des Umfahrpunkts durch eine Weiche oder einen Gleisabschnitt. Der Bezeichner dient nur dazu, den Umfahrweg zu benennen, nicht dazu, den Fahrweg zu beschreiben; die Beschreibung erfolgt in Fstr Fahrweg (Bereich Objekt). Die Festlegung des Umfahrpunkts gilt je Fahrweg und damit f\u00fcr alle Zug- und Rangierstra\u00dfen, die diesen Fahrweg nutzen. Das Objekt ist Bestandteil des Untergewerks \\\"Bedienung Fdl\\\". DB-Regelwerk Bestandteil des Bezeichners der Umfahrstra\u00dfe in der Zug-/Rangierstra\u00dfentabelle, Spalte 1 \\\"Start/Ziel\\\""
		   });
		addAnnotation
		  (getFstr_Umfahrpunkt_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Fahrwegs zum Umfahrpunkt. DB-Regelwerk Zugstra\u00dfentabelle, Bezeichnung der Fstr (inkl. Umfahrpunkt) "
		   });
		addAnnotation
		  (getFstr_Umfahrpunkt_IDUmfahrpunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Element (Gleisabschnitt oder Weiche), das f\u00fcr den Umfahrpunkt namensgebend ist. DB-Regelwerk Zugstra\u00dfentabelle, Bezeichnung des Umfahrpunktes in der Fahrstra\u00dfenbezeichnung"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_AutomatischeEinstellung(),
		   source,
		   new String[] {
			   "documentation", "M\u00f6glichkeit des Fahrstra\u00dfenansto\u00dfes \u00fcber die manuelle Bedienung hinaus. Die Angabe f\u00fcr eine Zugstra\u00dfe gilt auch f\u00fcr eventuell zugeh\u00f6rige (davorliegende) Mittelweichenteilfahrstra\u00dfen. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 9 \\\"Selbststellbetrieb/Zuglenkung\\\" "
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt(),
		   source,
		   new String[] {
			   "documentation", "Der Abstand vom Start zum Ziel der Fahrstra\u00dfe ist k\u00fcrzer als der zul\u00e4ssige Vorsignalabstand. DB-Regelwerk Ein expliziter Vermerk dazu kann als Fu\u00dfnote in der Signaltabelle 2 oder Beschreibung im Erl\u00e4uterungsbericht erscheinen. Ansonsten ist ein Zusatzlicht am Startsignal und die Geschwindigkeitseinschr\u00e4nkung bei Fahrt auf Halt oder eine eingeschr\u00e4nkte Geschwindigkeit ein Indiz."
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrZugArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Zugstra\u00dfe. ZH \u2013 ZugHilfs-, ZR \u2013 ZugRegel-, ZU \u2013 ZugUmfahr-, ZUH \u2013 ZugUmfahrhilfs-, ZZ \u2013 ZugZentralblock-, ZT - ZugTeil-, ZTU - ZugTeilUmfahr-. ZZ: Anwendung im Zentralblock oder an Schnittstellen zu anderen Stellwerkstechniken bei Mehrabschnittssignalisierung, Signalabh\u00e4ngigkeiten von Fahrwegelementen auf der freien Strecke oder bei Bedienung einer Awanst. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 2 \\\"Art\\\""
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_IDBUEEinschaltung(),
		   source,
		   new String[] {
			   "documentation", "B\u00dc im Durchrutschweg, der im Sicherheitsabstand liegt und daher f\u00fcr die Fahrstra\u00dfe zu sichern ist oder B\u00dc auf der freien Strecke, dessen Sicherung durch die Ausfahrzugstra\u00dfe angesto\u00dfen werden muss. DB-Regelwerk Zugstra\u00dfentabelle: Fu\u00dfnote. "
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Gruppenausfahr- oder -zwischensignal einer Fahrstra\u00dfe. Ist das Attribut gef\u00fcllt, handelt es sich um eine Fahrstra\u00dfe mit Gruppensignal. Start der Fahrstra\u00dfe und damit Beginn des Bereichsobjektes Fstr Fahrweg f\u00fcr den befahrenen Teil ist nicht das Gruppensignal, sondern das Signal am tats\u00e4chlichen Beginn der Fahrstra\u00dfe (meist Sperrsignal). DB-Regelwerk Sicherungstechnischer Lageplan: Darstellung des Gruppensignals nach dem Fahrstra\u00dfenstart; Zugstra\u00dfentabelle, Spalte 1 \\\"Start/Ziel\\\": Besondere Bezeichnung des Signals. "
		   });
		addAnnotation
		  (getFstr_Zug_DWeg_AttributeGroup_DWegVorzug(),
		   source,
		   new String[] {
			   "documentation", "Vorzugs-Durchrutschweg. Der DWeg ist der Standard-Durchrutschweg, der verwendet wird, wenn in der Bedienung kein spezieller DWeg ausgew\u00e4hlt wird. DB-Regelwerk Durchrutschwegtabelle: Je Signal als erster eingetragener DWeg."
		   });
		addAnnotation
		  (getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des DWeges zur Zugstra\u00dfe. DB-Regelwerk Zugstra\u00dfentabelle: Nennung des D-Weges im Namen der Fahrstra\u00dfe "
		   });
		addAnnotation
		  (fstr_Zug_RangierEClass,
		   source,
		   new String[] {
			   "documentation", "Zug- oder Rangierstra\u00dfe. Jeder Zugstra\u00dfe ist ein Durchrutschweg (modelliert in Fstr DWeg) zugeordnet. Gibt es Fahrstra\u00dfen mit mehreren Durchrutschwegen, so werden daf\u00fcr mehrere Zugstra\u00dfen angelegt, die auf dem gleichen befahrenen Teil (modelliert in Fstr Fahrweg) basieren. Mit dem Datenmodell werden auch Zentralblockfahrstra\u00dfen geplant. Der hiermit verkn\u00fcpfte Gefahrpunktabstand wird in Fstr DWeg abgebildet. Eine Zentralblockfahrstra\u00dfe (Fstr_Zug_Art==ZB) \u00fcber die ESTW-Zentraleinheit-Grenze wird in zwei Teilblockfahrstra\u00dfen (Fstr_Zug_Art==ZB) im Bereich der jeweiligen ESTW-Zentraleinheit geplant. Dabei kann ein befahrener Teil der L\u00e4nge Null entstehen, wenn die zweite Teilblockfahrstra\u00dfe nur aus dem Durchrutschweg besteht. Zielsignal der ersten ist Startsignal der zweiten Teilblockfahrstra\u00dfe. Fahrstra\u00dfen \u00fcber eine ESTW-Zentraleinheit-Grenze (FAP) werden als zwei Teilfahrstra\u00dfen (Fstr_Zug_Art==ZT/ZTU; Fstr_Rangier_Art==RT/RTU) geplant. Kann die erste Teilfahrstra\u00dfe mit mehreren weiteren Teilfahrstra\u00dfen fortgesetzt werden, so muss f\u00fcr jede geplante Kombination eine eigene Instanz der ersten Teilfahrstra\u00dfe angelegt werden (analog der Zuordnung mehrerer Durchrutschwege). Eine Mittelweichenteilfahrstra\u00dfe besitzt keinen Durchrutschweg. Eine explizite Verkn\u00fcpfung von Mittelweichenteilfahrstra\u00dfen untereinander und mit der Zugstra\u00dfe erfolgt nicht, da sich diese \u00fcber die Topologie und insbesondere \u00fcber Start und Ziel ergeben. Eine Rangierstra\u00dfe besitzt ebenfalls keinen Durchrutschweg. Die speziellen Attribute von Zug-/Rangier-/Mittelweichenteilfahrstra\u00dfe werden in eigenen Attributgruppen gespeichert, die sich gegenseitig ausschlie\u00dfen. Gruppenausfahrten werden als Zugstra\u00dfen ohne besondere Eigenschaft abgebildet. Das Gruppenausfahrsignal wird unter ID Signal Gruppenausfahrt explizit angegeben, die Gruppenausfahrstra\u00dfe ist somit eindeutig erkennbar. DB-Regelwerk Zugstra\u00dfentabelle (eine Zeile), Rangierstra\u00dfentabelle (eine Zeile), Mittelweichenteilfahrstra\u00dfentabelle (eine Zeile)."
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_IDFstrAusschlussBesonders(),
		   source,
		   new String[] {
			   "documentation", "Besonderer Fahrstra\u00dfenausschluss, der in Sonderf\u00e4llen geplant werden muss, z. B. Rangierstra\u00dfe mit paralleler Gruppenausfahrt. Der Ausschluss von Durchfahrten ist hier nicht anzugeben (siehe Signal)."
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Fahrwegs zur Fahrstra\u00dfe als befahrener Teil. DB-Regelwerk Zugstra\u00dfentabelle, Bezeichnung der Fstr (Start und Ziel) "
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung(),
		   source,
		   new String[] {
			   "documentation", "W\u00e4hrend das Gleis vor dem Startsignal mit Fahrleitung ausger\u00fcstet ist, ist der befahrene Teil der Fahrstra\u00dfe nicht oder nur teilweise damit ausger\u00fcstet. Der Durchrutschweg bleibt in der Regel unber\u00fccksichtigt. Die Angabe erfolgt nur, sofern eine F-Bedienung erforderlich ist (true). Bei Rangierstra\u00dfen kann auf das Setzen des Attributs verzichtet werden, wenn das Ziel der \u00fcblicherweise durchgef\u00fchrten Rangierfahrten noch im mit Fahrleitung ausger\u00fcsteten Bereich liegt. DB-Regelwerk Zugstra\u00dfentabelle, Spalte 7 \\\"Zugstra\u00dfe in nicht\u00fcberspannte Bereiche\\\""
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring(),
		   source,
		   new String[] {
			   "documentation", "Bedienstring der Fahrstra\u00dfe. Der Bedienstring wird automatisch aus Start, Ziel und ggf. Umfahrpunkt(en) gef\u00fcllt, kann aber bei Besonderheiten auch abweichend geplant werden. Das Attribut ist Bestandteil des Untergewerks \\\"Bedienung Fdl\\\". DB-Regelwerk Zug-/Rangierstra\u00dfentabelle, Spalte 1 \\\"Start/Ziel\\\""
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge(),
		   source,
		   new String[] {
			   "documentation", "Nummerierung des Umfahrwegs, wenn mehrere Fahrstra\u00dfen mit gleichem Start- und Zielpunkt existieren. Beim Regelweg wird das Attribut mit \\\"0\\\" bef\u00fcllt. Das Datum wird zur Kennzeichnung des Fahrwegs in der Fahrstra\u00dfenbezeichnung genutzt und f\u00fcr die Reihenfolge des Erscheinens von Fahrstra\u00dfen in der Tabelle. Es kann auch f\u00fcr die Reihenfolge im Bedienmen\u00fc genutzt werden. DB-Regelwerk Die Reihenfolge wurde bisher geplant durch die Reihenfolge des Erscheinens in der Zug-/Rangierstra\u00dfentabelle (implizit) oder die Bezeichnung der Fahrstra\u00dfenart (z. B. U1, U2, ...) oder eine Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV(),
		   source,
		   new String[] {
			   "documentation", "Ausnahmsweise geplante Geschwindigkeit der Fahrstra\u00dfe am Start, die sich nicht aus den Elementen der Fahrstra\u00dfe ergibt. In der Regel wird die Geschwindigkeit aus den Daten der Fahrstra\u00dfe errechnet und deshalb hier nicht angegeben. Im Ausnahmefall (z. B. bei Resi) kann der Planer eine geringere Geschwindigkeit vorgeben. Ausgeschlossen von diesem Ausnahmefall ist eine geringere Geschwindigkeitssignalisierung aufgrund eines verk\u00fcrzten Bremswegs oder nicht vorhandener Kennzahlen am Zs 3-Anzeiger. Dies wird in Fstr Signalisierung geplant. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, hier wird jedoch schon das Ergebnis als Zs 3 am Startsignal gespeichert."
		   });
		addAnnotation
		  (markanter_PunktEClass,
		   source,
		   new String[] {
			   "documentation", "Punkt in der \u00d6rtlichkeit, der eindeutig aufzufinden und beschreibbar ist. Haupts\u00e4chlicher Anwendungsfall ist die Definition des Gefahrpunktes oder des Endes eines Durchrutschweges. Auch der PZB-Gefahrpunkt wird damit verortet. Die eindeutige Auffindbarkeit dient der Freimeldung durch Hinsehen in der R\u00fcckfallebene. Wegen schlechter Erkennbarkeit soll eine Gleisfreimeldegrenze nur ausnahmsweise als markanter Punkt genutzt werden, wenn sich in vertretbarer Entfernung kein anderer Punkt finden l\u00e4sst. Antennen von Zugbeeinflussungen (z. B. PZB-Gleismagnet) gelten nicht als markanter Punkt. Das Ende des Durchrutschweges muss nicht mit einer Freimeldegrenze zusammenfallen. Ein weiterer Anwendungsfall ist die Verortung von Freimeldegrenzen als Hilfestellung f\u00fcr deren Montage. Markante Punkte sind: Signal (insbesondere Haupt- und Sperrsignal, Grenzzeichen, Schutzhaltsignal), Weichenspitze (W Kr Gsp Komponente), Gleissperre (W Kr Gsp Komponente), Kante des Gefahrraums an B\u00dc (Sonstiger Punkt), Besondere Objekte, z. B. an Deckungsstellen (derzeit noch nicht modelliert), Gleisfreimeldegrenze (nur ausnahmsweise), Beginn eines Bahnsteigs (Sonstiger Punkt), Zugschluss bzw. -spitze (Sonstiger Punkt), Sonstige Punkte (Sonstiger Punkt). DB-Regelwerk Ende Durchrutschweg: Durchrutschwegtabelle, Spalte 2: \\\"bis\\\"; Gefahrpunkt: Gefahrpunkttabelle, Spalte 2: \\\"ma\u00dfgebender Gefahrpunkt\\\"; Verortung Gleisfreimeldegrenze: Bema\u00dfungsangabe im sicherungstechnischen Lageplan und Achsz\u00e4hlpunkttabelle, Spalte 17: \\\"Bezugspunkt\\\". "
		   });
		addAnnotation
		  (getMarkanter_Punkt_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getMarkanter_Punkt_IDDWegErlaubnisabhaengig(),
		   source,
		   new String[] {
			   "documentation", "Abh\u00e4ngigkeit aller DWege - mit diesem Markanten Punkt als Ziel - von der Stellung der Erlaubnis der Block Anlage, an dessen Ende sich das verlinkte Block Element befindet. Der DWeg ist nur einstellbar, wenn die Erlaubnis vom Block Element Richtung Strecke zeigt. DB-Regelwerk Streckenblocktabelle, Spalte 11: \\\"D-Weg erlaubnisabh\u00e4ngig\\\""
		   });
		addAnnotation
		  (getMarkanter_Punkt_IDMarkanteStelle(),
		   source,
		   new String[] {
			   "documentation", "Punkt Objekt, das als Markanter Punkt dient. DB-Regelwerk siehe Markanter Punkt"
		   });
		addAnnotation
		  (getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des markanten Punktes. Die Bezeichnung ergibt sich ganz oder teilweise aus dem verlinkten Objekt (in der Regel Bezeichnung Tabelle), kann aber vom Planer ge\u00e4ndert werden. Als Abk\u00fcrzung f\u00fcr das Grenzzeichen wird einheitlich \\\"Gz\\\" verwendet. DB-Regelwerk Durchrutschwegtabelle, Spalte 2: \\\"Durchrutschweg - bis\\\""
		   });
		addAnnotation
		  (sonstiger_PunktEClass,
		   source,
		   new String[] {
			   "documentation", "Nicht durch ein anderes Punkt Objekt festgelegter Markanter Punkt. Das Objekt Sonstiger_Punkt wird durch den LST-Planer angelegt, wenn kein bereits existierendes Punkt Objekt f\u00fcr die Beschreibung des Markanten Punktes zur Verf\u00fcgung steht. Insbesondere handelt es sich dabei um: Beginn eines Bahnsteigs, Kante eines Gefahrraums am B\u00dc, Zugschluss bzw. -spitze, Beginn des zu deckenden Bereichs einer Deckungsstelle (z. B. bewegliche Br\u00fccke), sonstige Punkte (z. B. Merkpfahl, Laternenmast). DB-Regelwerk Siehe Markanter Punkt."
		   });
		addAnnotation
		  (getSonstiger_Punkt_IDBeginnBereich(),
		   source,
		   new String[] {
			   "documentation", "Zeiger auf das Bereich Objekt Bahnsteig Kante, BUE Gleisbezogener Gefahrraum oder ZUB Streckeneigenschaft, dessen Beginn bzw. Ende das Punkt Objekt Sonstiger Punkt abbildet. DB-Regelwerk Durchrutschwegtabelle, Spalte 2: \\\"Durchrutschweg - bis\\\""
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
		  (aufloesung_Ssp_Zielgleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAufloesung_Ssp_Zielgleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAufloesung_Ssp_Zielgleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (aufloesung_Verzoegerung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAufloesung_Verzoegerung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde",
			   "pattern", "0|[1-9][0-9]{0,1}|1[0-1][0-9]|120"
		   });
		addAnnotation
		  (aufloesung_Verzoegerung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAufloesung_Verzoegerung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAufloesung_Verzoegerung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (automatische_Einstellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAutomatische_Einstellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAutomatische_Einstellung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Fstr_DWeg_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Fstr_DWeg",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TZeichenkette",
			   "pattern", "[a-zA-Z0-9_]{1,3}"
		   });
		addAnnotation
		  (bezeichnung_Fstr_DWeg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Fstr_DWeg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Fstr_DWeg_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Markanter_Punkt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Markanter_Punkt",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,30}"
		   });
		addAnnotation
		  (bezeichnung_Markanter_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Markanter_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Markanter_Punkt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dWeg_Reihenfolge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDWeg_Reihenfolge",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|1[0-5]"
		   });
		addAnnotation
		  (dWeg_Reihenfolge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDWeg_Reihenfolge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDWeg_Reihenfolge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dWeg_V_Aufwertung_Verzicht_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDWeg_V_Aufwertung_Verzicht",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDWeg_V_Aufwertung_Verzicht_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dWeg_V_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDWeg_V",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "20|30|40|60|100|160"
		   });
		addAnnotation
		  (dWeg_V_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDWeg_V",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDWeg_V_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dWeg_Vorzug_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDWeg_Vorzug",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDWeg_Vorzug_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (element_Verschluss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCElement_Verschluss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Verschluss_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAufloesungSspZielgleisEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAufloesung_Ssp_Zielgleis"
		   });
		addAnnotation
		  (enumAufloesungSspZielgleisObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAufloesung_Ssp_Zielgleis:Object",
			   "baseType", "ENUMAufloesung_Ssp_Zielgleis"
		   });
		addAnnotation
		  (enumAutomatischeEinstellungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAutomatische_Einstellung"
		   });
		addAnnotation
		  (enumAutomatischeEinstellungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAutomatische_Einstellung:Object",
			   "baseType", "ENUMAutomatische_Einstellung"
		   });
		addAnnotation
		  (enumFstrMittelArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Mittel_Art"
		   });
		addAnnotation
		  (enumFstrMittelArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Mittel_Art:Object",
			   "baseType", "ENUMFstr_Mittel_Art"
		   });
		addAnnotation
		  (enumFstrRangierArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Rangier_Art"
		   });
		addAnnotation
		  (enumFstrRangierArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Rangier_Art:Object",
			   "baseType", "ENUMFstr_Rangier_Art"
		   });
		addAnnotation
		  (enumFstrZugArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Zug_Art"
		   });
		addAnnotation
		  (enumFstrZugArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFstr_Zug_Art:Object",
			   "baseType", "ENUMFstr_Zug_Art"
		   });
		addAnnotation
		  (enumRangierGegenfahrtausschlussEEnum,
		   source,
		   new String[] {
			   "name", "ENUMRangier_Gegenfahrtausschluss"
		   });
		addAnnotation
		  (enumRangierGegenfahrtausschlussObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMRangier_Gegenfahrtausschluss:Object",
			   "baseType", "ENUMRangier_Gegenfahrtausschluss"
		   });
		addAnnotation
		  (enumStartSignalCharakterEEnum,
		   source,
		   new String[] {
			   "name", "ENUMStart_Signal_Charakter"
		   });
		addAnnotation
		  (enumStartSignalCharakterObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMStart_Signal_Charakter:Object",
			   "baseType", "ENUMStart_Signal_Charakter"
		   });
		addAnnotation
		  (f_Bedienung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCF_Bedienung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getF_Bedienung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_AbhaengigkeitEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Abhaengigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Fahrweg"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Abhaengigkeit_Ssp"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_IDBedienAnzeigeElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Anzeige_Element"
		   });
		addAnnotation
		  (fstr_Abhaengigkeit_Ssp_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Abhaengigkeit_Ssp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aufloesung_Ssp_Zielgleis"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Schluesselsperre"
		   });
		addAnnotation
		  (fstr_AneinanderEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Aneinander",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Aneinander_FstrAneinanderBedienstring(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Aneinander_Bedienstring"
		   });
		addAnnotation
		  (fstr_Aneinander_Bedienstring_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFstr_Aneinander_Bedienstring",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{3,20}"
		   });
		addAnnotation
		  (fstr_Aneinander_Bedienstring_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Aneinander_Bedienstring",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Aneinander_Bedienstring_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Aneinander_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Aneinander_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Aneinander_Zuordnung_IDFstrAneinander(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Aneinander"
		   });
		addAnnotation
		  (getFstr_Aneinander_Zuordnung_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (fstr_Bedienstring_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFstr_Bedienstring",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{3,26}"
		   });
		addAnnotation
		  (fstr_Bedienstring_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Bedienstring",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Bedienstring_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_DWegEClass,
		   source,
		   new String[] {
			   "name", "CFstr_DWeg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_DWeg_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getFstr_DWeg_FstrDWegAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_DWeg_Allg"
		   });
		addAnnotation
		  (getFstr_DWeg_FstrDWegSpezifisch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_DWeg_Spezifisch"
		   });
		addAnnotation
		  (getFstr_DWeg_IDFMAAnlageFreimeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage_Freimeldung"
		   });
		addAnnotation
		  (getFstr_DWeg_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Fahrweg"
		   });
		addAnnotation
		  (getFstr_DWeg_IDPZBGefahrpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_PZB_Gefahrpunkt"
		   });
		addAnnotation
		  (fstr_DWeg_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_DWeg_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_LaengeSoll(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Laenge_Soll"
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Massgebende_Neigung"
		   });
		addAnnotation
		  (fstr_DWeg_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_DWeg_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Fstr_DWeg"
		   });
		addAnnotation
		  (fstr_DWeg_Spezifisch_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_DWeg_Spezifisch",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aufloesung_Verzoegerung"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWeg_Reihenfolge"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWeg_V"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWeg_V_Aufwertung_Verzicht"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage_Zielgleis"
		   });
		addAnnotation
		  (fstr_DWeg_W_KrEClass,
		   source,
		   new String[] {
			   "name", "CFstr_DWeg_W_Kr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_ElementVerschluss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Verschluss"
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_IDFstrDWeg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_DWeg"
		   });
		addAnnotation
		  (getFstr_DWeg_W_Kr_IDWKrGspElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_W_Kr_Gsp_Element"
		   });
		addAnnotation
		  (fstr_FahrwegEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Fahrweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Fahrweg_FstrVHg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_V_Hg"
		   });
		addAnnotation
		  (getFstr_Fahrweg_IDStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Start"
		   });
		addAnnotation
		  (getFstr_Fahrweg_IDZiel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Ziel"
		   });
		addAnnotation
		  (getFstr_Fahrweg_StartSignalCharakter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Start_Signal_Charakter"
		   });
		addAnnotation
		  (fstr_Mittel_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Mittel_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Mittel_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Mittel_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Mittel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Mittel_AttributeGroup_FstrMittelArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Mittel_Art"
		   });
		addAnnotation
		  (getFstr_Mittel_AttributeGroup_FstrMittelVAufwertung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Mittel_V_Aufwertung"
		   });
		addAnnotation
		  (fstr_Mittel_V_Aufwertung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Mittel_V_Aufwertung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Mittel_V_Aufwertung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_NichthaltfallEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Nichthaltfall",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Nichthaltfall_IDFMAAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage"
		   });
		addAnnotation
		  (getFstr_Nichthaltfall_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Fahrweg"
		   });
		addAnnotation
		  (fstr_Rangier_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Rangier_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Rangier_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Rangier_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Rangier",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_AutomatischeEinstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Automatische_Einstellung"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_FstrRangierArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Rangier_Art"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage_Rangier_Frei"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rangier_Gegenfahrtausschluss"
		   });
		addAnnotation
		  (fstr_Rangier_Fla_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Rangier_Fla_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Schutz"
		   });
		addAnnotation
		  (getFstr_Rangier_Fla_Zuordnung_IDFstrRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Rangier"
		   });
		addAnnotation
		  (fstr_Reihenfolge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFstr_Reihenfolge",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-9]|[12][0-9]|30"
		   });
		addAnnotation
		  (fstr_Reihenfolge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Reihenfolge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Reihenfolge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_SignalisierungEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Signalisierung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDSignalSignalbegriff(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Signalbegriff"
		   });
		addAnnotation
		  (getFstr_Signalisierung_IDSignalSignalbegriffZiel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Signalbegriff_Ziel"
		   });
		addAnnotation
		  (fstr_UmfahrpunktEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Umfahrpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Umfahrpunkt_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Fahrweg"
		   });
		addAnnotation
		  (getFstr_Umfahrpunkt_IDUmfahrpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Umfahrpunkt"
		   });
		addAnnotation
		  (fstr_V_Hg_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFstr_V_Hg",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit"
		   });
		addAnnotation
		  (fstr_V_Hg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_V_Hg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_V_Hg_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_V_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFstr_V",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit",
			   "pattern", "20|30|40|50|60|70|80|90|100|110|120|130|140|150"
		   });
		addAnnotation
		  (fstr_V_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_V",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_V_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Vsigabstand_Verkuerzt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Vsigabstand_Verkuerzt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Vsigabstand_Verkuerzt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Zug_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFstr_Zug_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Zug_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fstr_Zug_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Zug",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_AutomatischeEinstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Automatische_Einstellung"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Vsigabstand_Verkuerzt"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrZugArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Zug_Art"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrZugDWeg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Zug_DWeg"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_IDBUEEinschaltung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_BUE_Einschaltung"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal_Gruppenausfahrt"
		   });
		addAnnotation
		  (fstr_Zug_DWeg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Zug_DWeg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Zug_DWeg_AttributeGroup_DWegVorzug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWeg_Vorzug"
		   });
		addAnnotation
		  (getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_DWeg"
		   });
		addAnnotation
		  (fstr_Zug_RangierEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Zug_Rangier",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_FstrZugRangierAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Zug_Rangier_Allg"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_IDFstrAusschlussBesonders(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Ausschluss_Besonders"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_IDFstrFahrweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Fahrweg"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_FstrMittel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Mittel"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_FstrRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Rangier"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_FstrZug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Zug"
		   });
		addAnnotation
		  (fstr_Zug_Rangier_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFstr_Zug_Rangier_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "F_Bedienung"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Bedienstring"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_Reihenfolge"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fstr_V"
		   });
		addAnnotation
		  (laenge_Soll_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLaenge_Soll",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300"
		   });
		addAnnotation
		  (laenge_Soll_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLaenge_Soll",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLaenge_Soll_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (markanter_PunktEClass,
		   source,
		   new String[] {
			   "name", "CMarkanter_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMarkanter_Punkt_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getMarkanter_Punkt_IDDWegErlaubnisabhaengig(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_DWeg_Erlaubnisabhaengig"
		   });
		addAnnotation
		  (getMarkanter_Punkt_IDMarkanteStelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Markante_Stelle"
		   });
		addAnnotation
		  (markanter_Punkt_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CMarkanter_Punkt_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Markanter_Punkt"
		   });
		addAnnotation
		  (massgebende_Neigung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TMassgebende_Neigung",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00"
		   });
		addAnnotation
		  (massgebende_Neigung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMassgebende_Neigung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMassgebende_Neigung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rangier_Gegenfahrtausschluss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRangier_Gegenfahrtausschluss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRangier_Gegenfahrtausschluss_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (sonstiger_PunktEClass,
		   source,
		   new String[] {
			   "name", "CSonstiger_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSonstiger_Punkt_IDBeginnBereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Beginn_Bereich"
		   });
		addAnnotation
		  (start_Signal_Charakter_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStart_Signal_Charakter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStart_Signal_Charakter_TypeClass_Wert(),
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
		  (fstr_AbhaengigkeitEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>besetzt</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fstr_AneinanderEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:Patternbeschreibung>[3..20]</ppi:Patternbeschreibung>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Aneinander_FstrAneinanderBedienstring(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:Patternbeschreibung>[3..20]</ppi:Patternbeschreibung>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (fstr_Aneinander_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (fstr_DWegEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_LaengeSoll(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0..300]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-80.00..80.00]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>  [1..3] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0..120] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..15] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegV(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [20|30|40|60|100|160]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fstr_DWeg_W_KrEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (fstr_FahrwegEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Mittel_AttributeGroup_FstrMittelArt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>ZM</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fstr_NichthaltfallEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_FstrRangierArt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>RR</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>nein</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>ja</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fstr_Rangier_Fla_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (fstr_SignalisierungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (fstr_UmfahrpunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>Bedienung Fdl ESTW-ZE</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_AutomatischeEinstellung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>keine</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Zug_AttributeGroup_FstrZugArt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>ZR</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fstr_Zug_RangierEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[3..26] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0..30]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[20|30|40|50|60|70|80|90|100|110|120|130|140|150]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (markanter_PunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..30] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (sonstiger_PunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
	}

} //FahrstrassePackageImpl
