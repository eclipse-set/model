/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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

import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model11001.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model11001.Gleis.GleisPackage;

import org.eclipse.set.model.model11001.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.model11001.Nahbedienung.impl.NahbedienungPackageImpl;

import org.eclipse.set.model.model11001.Ortung.OrtungPackage;

import org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model11001.PZB.PZBPackage;

import org.eclipse.set.model.model11001.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model11001.PlanPro.PlanProFactory;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;

import org.eclipse.set.model.model11001.PlanPro.util.PlanProValidator;

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
public class PlanProPackageImpl extends EPackageImpl implements PlanProPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "PlanPro.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adresse_PLZ_Ort_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adresse_Strasse_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akteur_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akteur_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausgabe_FachdatenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauabschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauphase_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauzustand_Kurzbezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauzustand_Langbezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bemerkung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Planung_Gruppe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Planung_Projekt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Unteranlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass container_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Abschluss_Einzel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Abschluss_Gruppe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Abschluss_Projekt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Regelwerksstand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Uebernahme_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e_Mail_Adresse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erzeugung_Zeitstempel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fachdaten_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuehrende_Oertlichkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ident_Rolle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass index_Ausgabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informativ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass koordinatensystem_BB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass koordinatensystem_PB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laufende_Nummer_Ausgabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lsT_Objekte_Planungsbereich_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lsT_Planung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lsT_ZustandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass name_Akteur_10_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass name_Akteur_5_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass name_Akteur_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass name_Organisation_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objektmanagement_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationseinheit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planPro_SchnittstelleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planPro_Schnittstelle_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planPro_XSD_Version_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_E_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_E_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_E_Ausgabe_Besonders_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_E_Handlung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_EinzelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_G_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_G_Art_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_G_Fuehrende_Strecke_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_G_Schriftfeld_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_GruppeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_P_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_Phase_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planung_ProjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygone_Betrachtungsbereich_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygone_Planungsbereich_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonzug_Betrachtungsbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonzug_Planungsbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projekt_Nummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenz_Planung_Basis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenz_Vergleich_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Abschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Km_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Nummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telefonnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untergewerk_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verantwortliche_Stelle_DB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vergleich_Ausgabestand_Basis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vergleichstyp_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass werkzeug_Name_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass werkzeug_Version_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumKoordinatensystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlanungEArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlanungGArtBesondersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlanungPhaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUntergewerkArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumVergleichstypBesondersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adresse_PLZ_Ort_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adresse_Strasse_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bauabschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bauphase_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bauzustand_Kurzbezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bauzustand_Langbezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bemerkung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Anlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Planung_Gruppe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Planung_Projekt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Unteranlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType e_Mail_Adresse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumKoordinatensystemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPlanungEArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPlanungGArtBesondersObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPlanungPhaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUntergewerkArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumVergleichstypBesondersObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fuehrende_Oertlichkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ident_Rolle_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType index_Ausgabe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType laufende_Nummer_Ausgabe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType name_Akteur_10_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType name_Akteur_5_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType name_Akteur_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType name_Organisation_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType organisationseinheit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType planPro_XSD_Version_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polygonzug_Betrachtungsbereich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polygonzug_Planungsbereich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType projekt_Nummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenz_Planung_Basis_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenz_Vergleich_Besonders_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strecke_Abschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strecke_Km_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strecke_Nummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telefonnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verantwortliche_Stelle_DB_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vergleich_Ausgabestand_Basis_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType werkzeug_Name_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType werkzeug_Version_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.PlanPro.PlanProPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlanProPackageImpl() {
		super(eNS_URI, PlanProFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlanProPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PlanProPackage init() {
		if (isInited) return (PlanProPackage)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlanProPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlanProPackageImpl thePlanProPackage = registeredPlanProPackage instanceof PlanProPackageImpl ? (PlanProPackageImpl)registeredPlanProPackage : new PlanProPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_Ril_301Package.eNS_URI);
		Signalbegriffe_Ril_301PackageImpl theSignalbegriffe_Ril_301Package = (Signalbegriffe_Ril_301PackageImpl)(registeredPackage instanceof Signalbegriffe_Ril_301PackageImpl ? registeredPackage : Signalbegriffe_Ril_301Package.eINSTANCE);

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
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
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
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
		theZugnummernmeldeanlagePackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlanProPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PlanProValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlanProPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlanProPackage.eNS_URI, thePlanProPackage);
		return thePlanProPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdresse_PLZ_Ort_TypeClass() {
		if (adresse_PLZ_Ort_TypeClassEClass == null) {
			adresse_PLZ_Ort_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(1);
		}
		return adresse_PLZ_Ort_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdresse_PLZ_Ort_TypeClass_Wert() {
        return (EAttribute)getAdresse_PLZ_Ort_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdresse_Strasse_Nr_TypeClass() {
		if (adresse_Strasse_Nr_TypeClassEClass == null) {
			adresse_Strasse_Nr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(3);
		}
		return adresse_Strasse_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdresse_Strasse_Nr_TypeClass_Wert() {
        return (EAttribute)getAdresse_Strasse_Nr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkteur() {
		if (akteurEClass == null) {
			akteurEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(4);
		}
		return akteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_AkteurAllg() {
        return (EReference)getAkteur().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Kontaktdaten() {
        return (EReference)getAkteur().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkteur_Allg_AttributeGroup() {
		if (akteur_Allg_AttributeGroupEClass == null) {
			akteur_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(5);
		}
		return akteur_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Allg_AttributeGroup_NameAkteur() {
        return (EReference)getAkteur_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Allg_AttributeGroup_NameAkteur10() {
        return (EReference)getAkteur_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Allg_AttributeGroup_NameAkteur5() {
        return (EReference)getAkteur_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkteur_Zuordnung() {
		if (akteur_ZuordnungEClass == null) {
			akteur_ZuordnungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(6);
		}
		return akteur_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Zuordnung_AnhangDokumentation() {
        return (EReference)getAkteur_Zuordnung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Zuordnung_Datum() {
        return (EReference)getAkteur_Zuordnung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Zuordnung_Handelnder() {
        return (EReference)getAkteur_Zuordnung().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteur_Zuordnung_IdentRolle() {
        return (EReference)getAkteur_Zuordnung().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusgabe_Fachdaten() {
		if (ausgabe_FachdatenEClass == null) {
			ausgabe_FachdatenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(7);
		}
		return ausgabe_FachdatenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAusgabe_Fachdaten_LSTZustandStart() {
        return (EReference)getAusgabe_Fachdaten().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAusgabe_Fachdaten_LSTZustandZiel() {
        return (EReference)getAusgabe_Fachdaten().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAusgabe_Fachdaten_UntergewerkArt() {
        return (EReference)getAusgabe_Fachdaten().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBauabschnitt_TypeClass() {
		if (bauabschnitt_TypeClassEClass == null) {
			bauabschnitt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(9);
		}
		return bauabschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBauabschnitt_TypeClass_Wert() {
        return (EAttribute)getBauabschnitt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBauphase_TypeClass() {
		if (bauphase_TypeClassEClass == null) {
			bauphase_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(11);
		}
		return bauphase_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBauphase_TypeClass_Wert() {
        return (EAttribute)getBauphase_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBauzustand_Kurzbezeichnung_TypeClass() {
		if (bauzustand_Kurzbezeichnung_TypeClassEClass == null) {
			bauzustand_Kurzbezeichnung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(13);
		}
		return bauzustand_Kurzbezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBauzustand_Kurzbezeichnung_TypeClass_Wert() {
        return (EAttribute)getBauzustand_Kurzbezeichnung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBauzustand_Langbezeichnung_TypeClass() {
		if (bauzustand_Langbezeichnung_TypeClassEClass == null) {
			bauzustand_Langbezeichnung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bauzustand_Langbezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBauzustand_Langbezeichnung_TypeClass_Wert() {
        return (EAttribute)getBauzustand_Langbezeichnung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBemerkung_TypeClass() {
		if (bemerkung_TypeClassEClass == null) {
			bemerkung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bemerkung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBemerkung_TypeClass_Wert() {
        return (EAttribute)getBemerkung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Anlage_TypeClass() {
		if (bezeichnung_Anlage_TypeClassEClass == null) {
			bezeichnung_Anlage_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(19);
		}
		return bezeichnung_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Anlage_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_Anlage_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Planung_Gruppe_TypeClass() {
		if (bezeichnung_Planung_Gruppe_TypeClassEClass == null) {
			bezeichnung_Planung_Gruppe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(21);
		}
		return bezeichnung_Planung_Gruppe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Planung_Gruppe_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_Planung_Gruppe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Planung_Projekt_TypeClass() {
		if (bezeichnung_Planung_Projekt_TypeClassEClass == null) {
			bezeichnung_Planung_Projekt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(23);
		}
		return bezeichnung_Planung_Projekt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Planung_Projekt_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_Planung_Projekt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Unteranlage_TypeClass() {
		if (bezeichnung_Unteranlage_TypeClassEClass == null) {
			bezeichnung_Unteranlage_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(25);
		}
		return bezeichnung_Unteranlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Unteranlage_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_Unteranlage_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer_AttributeGroup() {
		if (container_AttributeGroupEClass == null) {
			container_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(26);
		}
		return container_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Anhang() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ATOSegmentProfile() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ATOTimingPoint() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ATOTSInstanz() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Aussenelementansteuerung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BahnsteigAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BahnsteigDach() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BahnsteigKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BahnsteigZugang() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Balise() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Bearbeitungsvermerk() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienAnrueckabschnitt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienAnzeigeElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienBezirk() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienEinrichtungOertlich() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienGBT() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienOberflaeche() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienOberflaecheBild() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienOertlichkeit() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienPlatz() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienStandort() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BedienZentrale() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Binaerdaten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BlockAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BlockElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BlockStrecke() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEAnlageStrasse() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEAnlageV() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEAusschaltung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEBedienAnzeigeElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEDeckendesSignalZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEEinschaltung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEEinschaltungZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEGefahrraumEckpunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEGleisbezogenerGefahrraum() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEKreuzungsplan() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUESchnittstelle() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUESpezifischesSignal() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_BUEWSFstrZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Datenpunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_DatenpunktLink() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ESTWZentraleinheit() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ETCSKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ETCSKnoten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ETCSRichtungsanzeige() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ETCSSignal() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ETCSWKr() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_EVModul() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Fachtelegramm() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FlaFreimeldeZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FlaSchutz() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FlaZwieschutz() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FMAAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FMAElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FMAKomponente() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrAbhaengigkeit() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrAneinander() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrAneinanderZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrDWeg() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrDWegWKr() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrFahrweg() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrNichthaltfall() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrRangierFlaZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrSignalisierung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrUmfahrpunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FstrZugRangier() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FTAnschaltbedingung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_FTFahrwegTeil() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GEOKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GEOKnoten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GEOPunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Geschwindigkeitsprofil() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GFRAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GFRElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GFRTripelspiegel() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisAbschluss() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisAbschnitt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisArt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisBaubereich() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisBezeichnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisFahrbahn() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisLichtraum() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_GleisSchaltgruppe() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Hoehenlinie() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Hoehenpunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Kabel() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_KabelVerteilpunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_LEUAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_LEUModul() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_LEUSchaltkasten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Lieferobjekt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_LuftTelegramm() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_MarkanterPunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_NB() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_NBBedienAnzeigeElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_NBZone() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_NBZoneElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_NBZoneGrenze() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Oertlichkeit() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ProgDateiGruppe() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ProxyObjekt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_PZBElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_PZBElementZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_PZBZuordnungSignal() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_RBC() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Regelzeichnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_RegelzeichnungParameter() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SchaltmittelFstrZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SchaltmittelZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Schloss() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Schlosskombination() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Schluessel() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Schluesselsperre() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Schrankenantrieb() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Signal() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SignalBefestigung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SignalFankZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SignalRahmen() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SignalSignalbegriff() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_SonstigerPunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_StellBereich() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Stellelement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Strecke() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_StreckeBremsweg() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_StreckePunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TechnikStandort() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TechnischerBereich() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TechnischerPunkt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TOPKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TOPKnoten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TrasseKante() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_TrasseKnoten() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Ueberhoehung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Ueberhoehungslinie() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Uebertragungsweg() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Unterbringung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Verkehrszeichen() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_WKrAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_WKrGspElement() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_WKrGspKomponente() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Weichenlaufkette() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_WeichenlaufketteZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZBSSchutzstrecke() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZBSSignal() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZL() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLDLPAbschnitt() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLDLPFstr() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLFstr() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLFstrAnstoss() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLSignalgruppe() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLSignalgruppeZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLVBus() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLVBusBesondereAnlage() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZLVBusUSZuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZN() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNAkustik() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNAnzeigefeld() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNFortschaltKriterium() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNTelegramm84Zuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNTelegramm85Zuordnung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNUnterstation() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZNZBS() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZUBBereichsgrenze() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_ZUBStreckeneigenschaft() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_AttributeGroup_Zugeinwirkung() {
        return (EReference)getContainer_AttributeGroup().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Abschluss_Einzel_TypeClass() {
		if (datum_Abschluss_Einzel_TypeClassEClass == null) {
			datum_Abschluss_Einzel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(27);
		}
		return datum_Abschluss_Einzel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Abschluss_Einzel_TypeClass_Wert() {
        return (EAttribute)getDatum_Abschluss_Einzel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Abschluss_Gruppe_TypeClass() {
		if (datum_Abschluss_Gruppe_TypeClassEClass == null) {
			datum_Abschluss_Gruppe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(28);
		}
		return datum_Abschluss_Gruppe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Abschluss_Gruppe_TypeClass_Wert() {
        return (EAttribute)getDatum_Abschluss_Gruppe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Abschluss_Projekt_TypeClass() {
		if (datum_Abschluss_Projekt_TypeClassEClass == null) {
			datum_Abschluss_Projekt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(29);
		}
		return datum_Abschluss_Projekt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Abschluss_Projekt_TypeClass_Wert() {
        return (EAttribute)getDatum_Abschluss_Projekt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Regelwerksstand_TypeClass() {
		if (datum_Regelwerksstand_TypeClassEClass == null) {
			datum_Regelwerksstand_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(30);
		}
		return datum_Regelwerksstand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Regelwerksstand_TypeClass_Wert() {
        return (EAttribute)getDatum_Regelwerksstand_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_TypeClass() {
		if (datum_TypeClassEClass == null) {
			datum_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(31);
		}
		return datum_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_TypeClass_Wert() {
        return (EAttribute)getDatum_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Uebernahme_TypeClass() {
		if (datum_Uebernahme_TypeClassEClass == null) {
			datum_Uebernahme_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(32);
		}
		return datum_Uebernahme_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Uebernahme_TypeClass_Wert() {
        return (EAttribute)getDatum_Uebernahme_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(33);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PlanProSchnittstelle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE_Mail_Adresse_TypeClass() {
		if (e_Mail_Adresse_TypeClassEClass == null) {
			e_Mail_Adresse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(35);
		}
		return e_Mail_Adresse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getE_Mail_Adresse_TypeClass_Wert() {
        return (EAttribute)getE_Mail_Adresse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErzeugung_Zeitstempel_TypeClass() {
		if (erzeugung_Zeitstempel_TypeClassEClass == null) {
			erzeugung_Zeitstempel_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(48);
		}
		return erzeugung_Zeitstempel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErzeugung_Zeitstempel_TypeClass_Wert() {
        return (EAttribute)getErzeugung_Zeitstempel_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFachdaten_AttributeGroup() {
		if (fachdaten_AttributeGroupEClass == null) {
			fachdaten_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(49);
		}
		return fachdaten_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachdaten_AttributeGroup_AusgabeFachdaten() {
        return (EReference)getFachdaten_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFuehrende_Oertlichkeit_TypeClass() {
		if (fuehrende_Oertlichkeit_TypeClassEClass == null) {
			fuehrende_Oertlichkeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(51);
		}
		return fuehrende_Oertlichkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFuehrende_Oertlichkeit_TypeClass_Wert() {
        return (EAttribute)getFuehrende_Oertlichkeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdent_Rolle_TypeClass() {
		if (ident_Rolle_TypeClassEClass == null) {
			ident_Rolle_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(53);
		}
		return ident_Rolle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdent_Rolle_TypeClass_Wert() {
        return (EAttribute)getIdent_Rolle_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndex_Ausgabe_TypeClass() {
		if (index_Ausgabe_TypeClassEClass == null) {
			index_Ausgabe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(55);
		}
		return index_Ausgabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndex_Ausgabe_TypeClass_Wert() {
        return (EAttribute)getIndex_Ausgabe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformativ_TypeClass() {
		if (informativ_TypeClassEClass == null) {
			informativ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(56);
		}
		return informativ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformativ_TypeClass_Wert() {
        return (EAttribute)getInformativ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKoordinatensystem_BB_TypeClass() {
		if (koordinatensystem_BB_TypeClassEClass == null) {
			koordinatensystem_BB_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(57);
		}
		return koordinatensystem_BB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKoordinatensystem_BB_TypeClass_Wert() {
        return (EAttribute)getKoordinatensystem_BB_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKoordinatensystem_PB_TypeClass() {
		if (koordinatensystem_PB_TypeClassEClass == null) {
			koordinatensystem_PB_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(58);
		}
		return koordinatensystem_PB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKoordinatensystem_PB_TypeClass_Wert() {
        return (EAttribute)getKoordinatensystem_PB_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaufende_Nummer_Ausgabe_TypeClass() {
		if (laufende_Nummer_Ausgabe_TypeClassEClass == null) {
			laufende_Nummer_Ausgabe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(60);
		}
		return laufende_Nummer_Ausgabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaufende_Nummer_Ausgabe_TypeClass_Wert() {
        return (EAttribute)getLaufende_Nummer_Ausgabe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLST_Objekte_Planungsbereich_AttributeGroup() {
		if (lsT_Objekte_Planungsbereich_AttributeGroupEClass == null) {
			lsT_Objekte_Planungsbereich_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(61);
		}
		return lsT_Objekte_Planungsbereich_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLST_Objekte_Planungsbereich_AttributeGroup_IDLSTObjektPlanungsbereich() {
        return (EReference)getLST_Objekte_Planungsbereich_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLST_Planung_AttributeGroup() {
		if (lsT_Planung_AttributeGroupEClass == null) {
			lsT_Planung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(62);
		}
		return lsT_Planung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLST_Planung_AttributeGroup_Fachdaten() {
        return (EReference)getLST_Planung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLST_Planung_AttributeGroup_Objektmanagement() {
        return (EReference)getLST_Planung_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLST_Zustand() {
		if (lsT_ZustandEClass == null) {
			lsT_ZustandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(63);
		}
		return lsT_ZustandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLST_Zustand_AnhangLSTZustand() {
        return (EReference)getLST_Zustand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLST_Zustand_Container() {
        return (EReference)getLST_Zustand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_Akteur_10_TypeClass() {
		if (name_Akteur_10_TypeClassEClass == null) {
			name_Akteur_10_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(65);
		}
		return name_Akteur_10_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Akteur_10_TypeClass_Wert() {
        return (EAttribute)getName_Akteur_10_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_Akteur_5_TypeClass() {
		if (name_Akteur_5_TypeClassEClass == null) {
			name_Akteur_5_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(67);
		}
		return name_Akteur_5_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Akteur_5_TypeClass_Wert() {
        return (EAttribute)getName_Akteur_5_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_Akteur_TypeClass() {
		if (name_Akteur_TypeClassEClass == null) {
			name_Akteur_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(69);
		}
		return name_Akteur_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Akteur_TypeClass_Wert() {
        return (EAttribute)getName_Akteur_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_Organisation_TypeClass() {
		if (name_Organisation_TypeClassEClass == null) {
			name_Organisation_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(71);
		}
		return name_Organisation_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Organisation_TypeClass_Wert() {
        return (EAttribute)getName_Organisation_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjektmanagement_AttributeGroup() {
		if (objektmanagement_AttributeGroupEClass == null) {
			objektmanagement_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(72);
		}
		return objektmanagement_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjektmanagement_AttributeGroup_LSTPlanungProjekt() {
        return (EReference)getObjektmanagement_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisation() {
		if (organisationEClass == null) {
			organisationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(73);
		}
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_AdressePLZOrt() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_AdresseStrasseNr() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_EMailAdresse() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_NameOrganisation() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_Organisationseinheit() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_Telefonnummer() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisationseinheit_TypeClass() {
		if (organisationseinheit_TypeClassEClass == null) {
			organisationseinheit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(75);
		}
		return organisationseinheit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganisationseinheit_TypeClass_Wert() {
        return (EAttribute)getOrganisationseinheit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanPro_Schnittstelle() {
		if (planPro_SchnittstelleEClass == null) {
			planPro_SchnittstelleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(76);
		}
		return planPro_SchnittstelleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_PlanProSchnittstelleAllg() {
        return (EReference)getPlanPro_Schnittstelle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_LSTPlanung() {
        return (EReference)getPlanPro_Schnittstelle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_LSTZustand() {
        return (EReference)getPlanPro_Schnittstelle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanPro_Schnittstelle_Allg_AttributeGroup() {
		if (planPro_Schnittstelle_Allg_AttributeGroupEClass == null) {
			planPro_Schnittstelle_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(77);
		}
		return planPro_Schnittstelle_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_Allg_AttributeGroup_Bemerkung() {
        return (EReference)getPlanPro_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_Allg_AttributeGroup_ErzeugungZeitstempel() {
        return (EReference)getPlanPro_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_Allg_AttributeGroup_WerkzeugName() {
        return (EReference)getPlanPro_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Schnittstelle_Allg_AttributeGroup_WerkzeugVersion() {
        return (EReference)getPlanPro_Schnittstelle_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanPro_XSD_Version_TypeClass() {
		if (planPro_XSD_Version_TypeClassEClass == null) {
			planPro_XSD_Version_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(79);
		}
		return planPro_XSD_Version_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanPro_XSD_Version_TypeClass_Wert() {
        return (EAttribute)getPlanPro_XSD_Version_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_E_Allg_AttributeGroup() {
		if (planung_E_Allg_AttributeGroupEClass == null) {
			planung_E_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(80);
		}
		return planung_E_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_Bauphase() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_BauzustandKurzbezeichnung() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_BauzustandLangbezeichnung() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_DatumAbschlussEinzel() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_DatumRegelwerksstand() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_IndexAusgabe() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_Informativ() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_LaufendeNummerAusgabe() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_PlanungEArt() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Allg_AttributeGroup_PlanungPhase() {
        return (EReference)getPlanung_E_Allg_AttributeGroup().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_E_Art_TypeClass() {
		if (planung_E_Art_TypeClassEClass == null) {
			planung_E_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(81);
		}
		return planung_E_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanung_E_Art_TypeClass_Wert() {
        return (EAttribute)getPlanung_E_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_E_Ausgabe_Besonders_AttributeGroup() {
		if (planung_E_Ausgabe_Besonders_AttributeGroupEClass == null) {
			planung_E_Ausgabe_Besonders_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(82);
		}
		return planung_E_Ausgabe_Besonders_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Ausgabe_Besonders_AttributeGroup_ReferenzVergleichBesonders() {
        return (EReference)getPlanung_E_Ausgabe_Besonders_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Ausgabe_Besonders_AttributeGroup_VergleichAusgabestandBasis() {
        return (EReference)getPlanung_E_Ausgabe_Besonders_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Ausgabe_Besonders_AttributeGroup_VergleichstypBesonders() {
        return (EReference)getPlanung_E_Ausgabe_Besonders_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_E_Handlung_AttributeGroup() {
		if (planung_E_Handlung_AttributeGroupEClass == null) {
			planung_E_Handlung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(83);
		}
		return planung_E_Handlung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEAbnahme() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEErstellung() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEFreigabe() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEGenehmigung() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEGleichstellung() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEPruefung() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEQualitaetspruefung() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungESonstige() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_E_Handlung_AttributeGroup_PlanungEUebernahme() {
        return (EReference)getPlanung_E_Handlung_AttributeGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_Einzel() {
		if (planung_EinzelEClass == null) {
			planung_EinzelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(84);
		}
		return planung_EinzelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_AnhangErlaeuterungsbericht() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_AnhangMaterialBesonders() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_AnhangVzG() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_IDAusgabeFachdaten() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_LSTObjektePlanungsbereich() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_PlanungEAllg() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_PlanungEAusgabeBesonders() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_PlanungEHandlung() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Einzel_ReferenzPlanungBasis() {
        return (EReference)getPlanung_Einzel().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_G_Allg_AttributeGroup() {
		if (planung_G_Allg_AttributeGroupEClass == null) {
			planung_G_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(85);
		}
		return planung_G_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_AnhangBAST() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_DatumAbschlussGruppe() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_PlanProXSDVersion() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_PlanungGArtBesonders() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_UntergewerkArt() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Allg_AttributeGroup_VerantwortlicheStelleDB() {
        return (EReference)getPlanung_G_Allg_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_G_Art_Besonders_TypeClass() {
		if (planung_G_Art_Besonders_TypeClassEClass == null) {
			planung_G_Art_Besonders_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(86);
		}
		return planung_G_Art_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanung_G_Art_Besonders_TypeClass_Wert() {
        return (EAttribute)getPlanung_G_Art_Besonders_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_G_Fuehrende_Strecke_AttributeGroup() {
		if (planung_G_Fuehrende_Strecke_AttributeGroupEClass == null) {
			planung_G_Fuehrende_Strecke_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(87);
		}
		return planung_G_Fuehrende_Strecke_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeAbschnitt() {
        return (EReference)getPlanung_G_Fuehrende_Strecke_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeKm() {
        return (EReference)getPlanung_G_Fuehrende_Strecke_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeNummer() {
        return (EReference)getPlanung_G_Fuehrende_Strecke_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_G_Schriftfeld_AttributeGroup() {
		if (planung_G_Schriftfeld_AttributeGroupEClass == null) {
			planung_G_Schriftfeld_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(88);
		}
		return planung_G_Schriftfeld_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_Bauabschnitt() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungAnlage() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungPlanungGruppe() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungUnteranlage() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_Planungsbuero() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_G_Schriftfeld_AttributeGroup_PlanungsbueroLogo() {
        return (EReference)getPlanung_G_Schriftfeld_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_Gruppe() {
		if (planung_GruppeEClass == null) {
			planung_GruppeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(89);
		}
		return planung_GruppeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_FuehrendeOertlichkeit() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_LSTPlanungEinzel() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_PlanungGAllg() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_PlanungGFuehrendeStrecke() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_PlanungGSchriftfeld() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_PolygoneBetrachtungsbereich() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Gruppe_PolygonePlanungsbereich() {
        return (EReference)getPlanung_Gruppe().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_P_Allg_AttributeGroup() {
		if (planung_P_Allg_AttributeGroupEClass == null) {
			planung_P_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(90);
		}
		return planung_P_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_P_Allg_AttributeGroup_BezeichnungPlanungProjekt() {
        return (EReference)getPlanung_P_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_P_Allg_AttributeGroup_DatumAbschlussProjekt() {
        return (EReference)getPlanung_P_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_P_Allg_AttributeGroup_ProjektNummer() {
        return (EReference)getPlanung_P_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_P_Allg_AttributeGroup_Projektleiter() {
        return (EReference)getPlanung_P_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_Phase_TypeClass() {
		if (planung_Phase_TypeClassEClass == null) {
			planung_Phase_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(91);
		}
		return planung_Phase_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanung_Phase_TypeClass_Wert() {
        return (EAttribute)getPlanung_Phase_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanung_Projekt() {
		if (planung_ProjektEClass == null) {
			planung_ProjektEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(92);
		}
		return planung_ProjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Projekt_LSTPlanungGruppe() {
        return (EReference)getPlanung_Projekt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanung_Projekt_PlanungPAllg() {
        return (EReference)getPlanung_Projekt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygone_Betrachtungsbereich_AttributeGroup() {
		if (polygone_Betrachtungsbereich_AttributeGroupEClass == null) {
			polygone_Betrachtungsbereich_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(93);
		}
		return polygone_Betrachtungsbereich_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygone_Betrachtungsbereich_AttributeGroup_KoordinatensystemBB() {
        return (EReference)getPolygone_Betrachtungsbereich_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygone_Betrachtungsbereich_AttributeGroup_PolygonzugBetrachtungsbereich() {
        return (EReference)getPolygone_Betrachtungsbereich_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygone_Planungsbereich_AttributeGroup() {
		if (polygone_Planungsbereich_AttributeGroupEClass == null) {
			polygone_Planungsbereich_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(94);
		}
		return polygone_Planungsbereich_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygone_Planungsbereich_AttributeGroup_KoordinatensystemPB() {
        return (EReference)getPolygone_Planungsbereich_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygone_Planungsbereich_AttributeGroup_PolygonzugPlanungsbereich() {
        return (EReference)getPolygone_Planungsbereich_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonzug_Betrachtungsbereich_TypeClass() {
		if (polygonzug_Betrachtungsbereich_TypeClassEClass == null) {
			polygonzug_Betrachtungsbereich_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(96);
		}
		return polygonzug_Betrachtungsbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygonzug_Betrachtungsbereich_TypeClass_Wert() {
        return (EAttribute)getPolygonzug_Betrachtungsbereich_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonzug_Planungsbereich_TypeClass() {
		if (polygonzug_Planungsbereich_TypeClassEClass == null) {
			polygonzug_Planungsbereich_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(98);
		}
		return polygonzug_Planungsbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygonzug_Planungsbereich_TypeClass_Wert() {
        return (EAttribute)getPolygonzug_Planungsbereich_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjekt_Nummer_TypeClass() {
		if (projekt_Nummer_TypeClassEClass == null) {
			projekt_Nummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(100);
		}
		return projekt_Nummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjekt_Nummer_TypeClass_Wert() {
        return (EAttribute)getProjekt_Nummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenz_Planung_Basis_TypeClass() {
		if (referenz_Planung_Basis_TypeClassEClass == null) {
			referenz_Planung_Basis_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(102);
		}
		return referenz_Planung_Basis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenz_Planung_Basis_TypeClass_Wert() {
        return (EAttribute)getReferenz_Planung_Basis_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenz_Vergleich_Besonders_TypeClass() {
		if (referenz_Vergleich_Besonders_TypeClassEClass == null) {
			referenz_Vergleich_Besonders_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(104);
		}
		return referenz_Vergleich_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenz_Vergleich_Besonders_TypeClass_Wert() {
        return (EAttribute)getReferenz_Vergleich_Besonders_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Abschnitt_TypeClass() {
		if (strecke_Abschnitt_TypeClassEClass == null) {
			strecke_Abschnitt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(106);
		}
		return strecke_Abschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Abschnitt_TypeClass_Wert() {
        return (EAttribute)getStrecke_Abschnitt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Km_TypeClass() {
		if (strecke_Km_TypeClassEClass == null) {
			strecke_Km_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(108);
		}
		return strecke_Km_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Km_TypeClass_Wert() {
        return (EAttribute)getStrecke_Km_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Nummer_TypeClass() {
		if (strecke_Nummer_TypeClassEClass == null) {
			strecke_Nummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(110);
		}
		return strecke_Nummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Nummer_TypeClass_Wert() {
        return (EAttribute)getStrecke_Nummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelefonnummer_TypeClass() {
		if (telefonnummer_TypeClassEClass == null) {
			telefonnummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(112);
		}
		return telefonnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelefonnummer_TypeClass_Wert() {
        return (EAttribute)getTelefonnummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUntergewerk_Art_TypeClass() {
		if (untergewerk_Art_TypeClassEClass == null) {
			untergewerk_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(113);
		}
		return untergewerk_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUntergewerk_Art_TypeClass_Wert() {
        return (EAttribute)getUntergewerk_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerantwortliche_Stelle_DB_TypeClass() {
		if (verantwortliche_Stelle_DB_TypeClassEClass == null) {
			verantwortliche_Stelle_DB_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(115);
		}
		return verantwortliche_Stelle_DB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerantwortliche_Stelle_DB_TypeClass_Wert() {
        return (EAttribute)getVerantwortliche_Stelle_DB_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVergleich_Ausgabestand_Basis_TypeClass() {
		if (vergleich_Ausgabestand_Basis_TypeClassEClass == null) {
			vergleich_Ausgabestand_Basis_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(117);
		}
		return vergleich_Ausgabestand_Basis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVergleich_Ausgabestand_Basis_TypeClass_Wert() {
        return (EAttribute)getVergleich_Ausgabestand_Basis_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVergleichstyp_Besonders_TypeClass() {
		if (vergleichstyp_Besonders_TypeClassEClass == null) {
			vergleichstyp_Besonders_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(118);
		}
		return vergleichstyp_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVergleichstyp_Besonders_TypeClass_Wert() {
        return (EAttribute)getVergleichstyp_Besonders_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWerkzeug_Name_TypeClass() {
		if (werkzeug_Name_TypeClassEClass == null) {
			werkzeug_Name_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(120);
		}
		return werkzeug_Name_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWerkzeug_Name_TypeClass_Wert() {
        return (EAttribute)getWerkzeug_Name_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWerkzeug_Version_TypeClass() {
		if (werkzeug_Version_TypeClassEClass == null) {
			werkzeug_Version_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(122);
		}
		return werkzeug_Version_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWerkzeug_Version_TypeClass_Wert() {
        return (EAttribute)getWerkzeug_Version_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMKoordinatensystem() {
		if (enumKoordinatensystemEEnum == null) {
			enumKoordinatensystemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(36);
		}
		return enumKoordinatensystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPlanungEArt() {
		if (enumPlanungEArtEEnum == null) {
			enumPlanungEArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(38);
		}
		return enumPlanungEArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPlanungGArtBesonders() {
		if (enumPlanungGArtBesondersEEnum == null) {
			enumPlanungGArtBesondersEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(40);
		}
		return enumPlanungGArtBesondersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPlanungPhase() {
		if (enumPlanungPhaseEEnum == null) {
			enumPlanungPhaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(42);
		}
		return enumPlanungPhaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUntergewerkArt() {
		if (enumUntergewerkArtEEnum == null) {
			enumUntergewerkArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(44);
		}
		return enumUntergewerkArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMVergleichstypBesonders() {
		if (enumVergleichstypBesondersEEnum == null) {
			enumVergleichstypBesondersEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(46);
		}
		return enumVergleichstypBesondersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdresse_PLZ_Ort_Type() {
		if (adresse_PLZ_Ort_TypeEDataType == null) {
			adresse_PLZ_Ort_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(0);
		}
		return adresse_PLZ_Ort_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdresse_Strasse_Nr_Type() {
		if (adresse_Strasse_Nr_TypeEDataType == null) {
			adresse_Strasse_Nr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(2);
		}
		return adresse_Strasse_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBauabschnitt_Type() {
		if (bauabschnitt_TypeEDataType == null) {
			bauabschnitt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(8);
		}
		return bauabschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBauphase_Type() {
		if (bauphase_TypeEDataType == null) {
			bauphase_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(10);
		}
		return bauphase_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBauzustand_Kurzbezeichnung_Type() {
		if (bauzustand_Kurzbezeichnung_TypeEDataType == null) {
			bauzustand_Kurzbezeichnung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(12);
		}
		return bauzustand_Kurzbezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBauzustand_Langbezeichnung_Type() {
		if (bauzustand_Langbezeichnung_TypeEDataType == null) {
			bauzustand_Langbezeichnung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(14);
		}
		return bauzustand_Langbezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBemerkung_Type() {
		if (bemerkung_TypeEDataType == null) {
			bemerkung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bemerkung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Anlage_Type() {
		if (bezeichnung_Anlage_TypeEDataType == null) {
			bezeichnung_Anlage_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(18);
		}
		return bezeichnung_Anlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Planung_Gruppe_Type() {
		if (bezeichnung_Planung_Gruppe_TypeEDataType == null) {
			bezeichnung_Planung_Gruppe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bezeichnung_Planung_Gruppe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Planung_Projekt_Type() {
		if (bezeichnung_Planung_Projekt_TypeEDataType == null) {
			bezeichnung_Planung_Projekt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(22);
		}
		return bezeichnung_Planung_Projekt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Unteranlage_Type() {
		if (bezeichnung_Unteranlage_TypeEDataType == null) {
			bezeichnung_Unteranlage_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(24);
		}
		return bezeichnung_Unteranlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getE_Mail_Adresse_Type() {
		if (e_Mail_Adresse_TypeEDataType == null) {
			e_Mail_Adresse_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(34);
		}
		return e_Mail_Adresse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMKoordinatensystemObject() {
		if (enumKoordinatensystemObjectEDataType == null) {
			enumKoordinatensystemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(37);
		}
		return enumKoordinatensystemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPlanungEArtObject() {
		if (enumPlanungEArtObjectEDataType == null) {
			enumPlanungEArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(39);
		}
		return enumPlanungEArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPlanungGArtBesondersObject() {
		if (enumPlanungGArtBesondersObjectEDataType == null) {
			enumPlanungGArtBesondersObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(41);
		}
		return enumPlanungGArtBesondersObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPlanungPhaseObject() {
		if (enumPlanungPhaseObjectEDataType == null) {
			enumPlanungPhaseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(43);
		}
		return enumPlanungPhaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUntergewerkArtObject() {
		if (enumUntergewerkArtObjectEDataType == null) {
			enumUntergewerkArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(45);
		}
		return enumUntergewerkArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMVergleichstypBesondersObject() {
		if (enumVergleichstypBesondersObjectEDataType == null) {
			enumVergleichstypBesondersObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(47);
		}
		return enumVergleichstypBesondersObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFuehrende_Oertlichkeit_Type() {
		if (fuehrende_Oertlichkeit_TypeEDataType == null) {
			fuehrende_Oertlichkeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(50);
		}
		return fuehrende_Oertlichkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdent_Rolle_Type() {
		if (ident_Rolle_TypeEDataType == null) {
			ident_Rolle_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(52);
		}
		return ident_Rolle_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIndex_Ausgabe_Type() {
		if (index_Ausgabe_TypeEDataType == null) {
			index_Ausgabe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(54);
		}
		return index_Ausgabe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaufende_Nummer_Ausgabe_Type() {
		if (laufende_Nummer_Ausgabe_TypeEDataType == null) {
			laufende_Nummer_Ausgabe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(59);
		}
		return laufende_Nummer_Ausgabe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getName_Akteur_10_Type() {
		if (name_Akteur_10_TypeEDataType == null) {
			name_Akteur_10_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(64);
		}
		return name_Akteur_10_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getName_Akteur_5_Type() {
		if (name_Akteur_5_TypeEDataType == null) {
			name_Akteur_5_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(66);
		}
		return name_Akteur_5_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getName_Akteur_Type() {
		if (name_Akteur_TypeEDataType == null) {
			name_Akteur_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(68);
		}
		return name_Akteur_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getName_Organisation_Type() {
		if (name_Organisation_TypeEDataType == null) {
			name_Organisation_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(70);
		}
		return name_Organisation_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOrganisationseinheit_Type() {
		if (organisationseinheit_TypeEDataType == null) {
			organisationseinheit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(74);
		}
		return organisationseinheit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlanPro_XSD_Version_Type() {
		if (planPro_XSD_Version_TypeEDataType == null) {
			planPro_XSD_Version_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(78);
		}
		return planPro_XSD_Version_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPolygonzug_Betrachtungsbereich_Type() {
		if (polygonzug_Betrachtungsbereich_TypeEDataType == null) {
			polygonzug_Betrachtungsbereich_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(95);
		}
		return polygonzug_Betrachtungsbereich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPolygonzug_Planungsbereich_Type() {
		if (polygonzug_Planungsbereich_TypeEDataType == null) {
			polygonzug_Planungsbereich_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(97);
		}
		return polygonzug_Planungsbereich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProjekt_Nummer_Type() {
		if (projekt_Nummer_TypeEDataType == null) {
			projekt_Nummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(99);
		}
		return projekt_Nummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferenz_Planung_Basis_Type() {
		if (referenz_Planung_Basis_TypeEDataType == null) {
			referenz_Planung_Basis_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(101);
		}
		return referenz_Planung_Basis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferenz_Vergleich_Besonders_Type() {
		if (referenz_Vergleich_Besonders_TypeEDataType == null) {
			referenz_Vergleich_Besonders_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(103);
		}
		return referenz_Vergleich_Besonders_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStrecke_Abschnitt_Type() {
		if (strecke_Abschnitt_TypeEDataType == null) {
			strecke_Abschnitt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(105);
		}
		return strecke_Abschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStrecke_Km_Type() {
		if (strecke_Km_TypeEDataType == null) {
			strecke_Km_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(107);
		}
		return strecke_Km_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStrecke_Nummer_Type() {
		if (strecke_Nummer_TypeEDataType == null) {
			strecke_Nummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(109);
		}
		return strecke_Nummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTelefonnummer_Type() {
		if (telefonnummer_TypeEDataType == null) {
			telefonnummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(111);
		}
		return telefonnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerantwortliche_Stelle_DB_Type() {
		if (verantwortliche_Stelle_DB_TypeEDataType == null) {
			verantwortliche_Stelle_DB_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(114);
		}
		return verantwortliche_Stelle_DB_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVergleich_Ausgabestand_Basis_Type() {
		if (vergleich_Ausgabestand_Basis_TypeEDataType == null) {
			vergleich_Ausgabestand_Basis_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(116);
		}
		return vergleich_Ausgabestand_Basis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWerkzeug_Name_Type() {
		if (werkzeug_Name_TypeEDataType == null) {
			werkzeug_Name_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(119);
		}
		return werkzeug_Name_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWerkzeug_Version_Type() {
		if (werkzeug_Version_TypeEDataType == null) {
			werkzeug_Version_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI).getEClassifiers().get(121);
		}
		return werkzeug_Version_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanProFactory getPlanProFactory() {
		return (PlanProFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.set.model.model11001.PlanPro." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PlanProPackageImpl
