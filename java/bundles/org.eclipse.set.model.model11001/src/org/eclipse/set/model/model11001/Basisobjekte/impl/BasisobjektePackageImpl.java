/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte.impl;

import java.math.BigDecimal;

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
import org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung;

import org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model11001.Basisobjekte.Abstand_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Anhang;
import org.eclipse.set.model.model11001.Basisobjekte.Anhang_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Anhang_Art_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.BV_Darstellung_In_Plan_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.BV_Kategorie_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.BasisobjekteFactory;
import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Rolle_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Begrenzung_A_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Begrenzung_B_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Beschreibung_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Bestandsrelevanz_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Bestandsschutz_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.DB_GDI_Referenz_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Dateiname_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Dateityp_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Datum_Regelwerk_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMAnhangArt;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMBVDarstellungInPlan;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMBestandsrelevanz;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMDateityp;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMLSTObjektArt;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMObjektzustandBesonders;
import org.eclipse.set.model.model11001.Basisobjekte.ENUMRolle;
import org.eclipse.set.model.model11001.Basisobjekte.Identitaet_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Km_Massgebend_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Kommentar_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Kurztext_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Ausgabestand_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_DB_Freigabe_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Datum_Herstellung_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_EMA_Nr_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Ersatz_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Firmensachnummer_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Material_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.LO_Seriennummer_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.LST_Objekt_Art_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Lieferobjekt;
import org.eclipse.set.model.model11001.Basisobjekte.Objektreferenzen_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Objektzustand_Besonders_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Proxy_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Richtungsbezug_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Seitliche_Lage_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Seitlicher_Abstand_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Strecke_Km_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Technischer_Platz_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Wirkrichtung_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Zeit_Bearbeitungsvermerk_TypeClass;

import org.eclipse.set.model.model11001.Basisobjekte.util.BasisobjekteValidator;

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
public class BasisobjektePackageImpl extends EPackageImpl implements BasisobjektePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anhangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anhang_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anhang_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basis_ObjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basis_Objekt_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearbeitungsvermerkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearbeitungsvermerk_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearbeitungsvermerk_Rolle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass begrenzung_A_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass begrenzung_B_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bereich_ObjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bereich_Objekt_Teilbereich_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bestandsrelevanz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bestandsschutz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bV_Darstellung_In_Plan_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bV_Kategorie_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateiname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateityp_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Regelwerk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dB_GDI_Referenz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identitaet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass km_Massgebend_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommentar_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kurztext_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lieferobjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Ausgabestand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Datum_Herstellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_DB_Freigabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_EMA_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Ersatz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Firmensachnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Material_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lO_Seriennummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lsT_Objekt_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objektreferenzen_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objektzustand_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxy_ObjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punkt_ObjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punkt_Objekt_Strecke_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punkt_Objekt_TOP_Kante_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richtungsbezug_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seitliche_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seitlicher_Abstand_TypeClassEClass = null;

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
	private EClass technischer_Platz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ur_ObjektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirkrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeit_Bearbeitungsvermerk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAnhangArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBestandsrelevanzEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbvDarstellungInPlanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDateitypEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumlstObjektArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumObjektzustandBesondersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRolleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstand_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType begrenzung_A_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType begrenzung_B_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType beschreibung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bV_Kategorie_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dB_GDI_Referenz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAnhangArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBestandsrelevanzObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbvDarstellungInPlanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumDateitypObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumlstObjektArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumObjektzustandBesondersObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumRolleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identitaet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kommentar_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kurztext_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lO_Ausgabestand_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lO_DB_Freigabe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lO_EMA_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lO_Firmensachnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lO_Seriennummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType richtungsbezug_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seitliche_Lage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seitlicher_Abstand_TypeEDataType = null;

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
	private EDataType technischer_Platz_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisobjektePackageImpl() {
		super(eNS_URI, BasisobjekteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisobjektePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisobjektePackage init() {
		if (isInited) return (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisobjektePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = registeredBasisobjektePackage instanceof BasisobjektePackageImpl ? (BasisobjektePackageImpl)registeredBasisobjektePackage : new BasisobjektePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
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
			(theBasisobjektePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BasisobjekteValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasisobjektePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisobjektePackage.eNS_URI, theBasisobjektePackage);
		return theBasisobjektePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstand_TypeClass() {
		return abstand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstand_TypeClass_Wert() {
		return (EAttribute)abstand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnhang() {
		return anhangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnhang_AnhangAllg() {
		return (EReference)anhangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnhang_Allg_AttributeGroup() {
		return anhang_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnhang_Allg_AttributeGroup_AnhangArt() {
		return (EReference)anhang_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnhang_Allg_AttributeGroup_Dateiname() {
		return (EReference)anhang_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnhang_Allg_AttributeGroup_Dateityp() {
		return (EReference)anhang_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnhang_Art_TypeClass() {
		return anhang_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnhang_Art_TypeClass_Wert() {
		return (EAttribute)anhang_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasis_Objekt() {
		return basis_ObjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_BasisObjektAllg() {
		return (EReference)basis_ObjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_IDBearbeitungsvermerk() {
		return (EReference)basis_ObjektEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_IDOertlichkeitAusgabe() {
		return (EReference)basis_ObjektEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_Objektreferenzen() {
		return (EReference)basis_ObjektEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasis_Objekt_Allg_AttributeGroup() {
		return basis_Objekt_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz() {
		return (EReference)basis_Objekt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders() {
		return (EReference)basis_Objekt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk() {
		return (EReference)basis_Objekt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders() {
		return (EReference)basis_Objekt_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBearbeitungsvermerk() {
		return bearbeitungsvermerkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_BearbeitungsvermerkAllg() {
		return (EReference)bearbeitungsvermerkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_IDAnhang() {
		return (EReference)bearbeitungsvermerkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBearbeitungsvermerk_Allg_AttributeGroup() {
		return bearbeitungsvermerk_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk() {
		return (EReference)bearbeitungsvermerk_Allg_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBearbeitungsvermerk_Rolle_TypeClass() {
		return bearbeitungsvermerk_Rolle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearbeitungsvermerk_Rolle_TypeClass_Wert() {
		return (EAttribute)bearbeitungsvermerk_Rolle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBegrenzung_A_TypeClass() {
		return begrenzung_A_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegrenzung_A_TypeClass_Wert() {
		return (EAttribute)begrenzung_A_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBegrenzung_B_TypeClass() {
		return begrenzung_B_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegrenzung_B_TypeClass_Wert() {
		return (EAttribute)begrenzung_B_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBereich_Objekt() {
		return bereich_ObjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBereich_Objekt_BereichObjektTeilbereich() {
		return (EReference)bereich_ObjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBereich_Objekt_Teilbereich_AttributeGroup() {
		return bereich_Objekt_Teilbereich_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA() {
		return (EReference)bereich_Objekt_Teilbereich_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB() {
		return (EReference)bereich_Objekt_Teilbereich_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante() {
		return (EReference)bereich_Objekt_Teilbereich_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug() {
		return (EReference)bereich_Objekt_Teilbereich_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeschreibung_TypeClass() {
		return beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeschreibung_TypeClass_Wert() {
		return (EAttribute)beschreibung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBestandsrelevanz_TypeClass() {
		return bestandsrelevanz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBestandsrelevanz_TypeClass_Wert() {
		return (EAttribute)bestandsrelevanz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBestandsschutz_TypeClass() {
		return bestandsschutz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBestandsschutz_TypeClass_Wert() {
		return (EAttribute)bestandsschutz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBV_Darstellung_In_Plan_TypeClass() {
		return bV_Darstellung_In_Plan_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBV_Darstellung_In_Plan_TypeClass_Wert() {
		return (EAttribute)bV_Darstellung_In_Plan_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBV_Kategorie_TypeClass() {
		return bV_Kategorie_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBV_Kategorie_TypeClass_Wert() {
		return (EAttribute)bV_Kategorie_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateiname_TypeClass() {
		return dateiname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateiname_TypeClass_Wert() {
		return (EAttribute)dateiname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateityp_TypeClass() {
		return dateityp_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateityp_TypeClass_Wert() {
		return (EAttribute)dateityp_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Regelwerk_TypeClass() {
		return datum_Regelwerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Regelwerk_TypeClass_Wert() {
		return (EAttribute)datum_Regelwerk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDB_GDI_Referenz_TypeClass() {
		return dB_GDI_Referenz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDB_GDI_Referenz_TypeClass_Wert() {
		return (EAttribute)dB_GDI_Referenz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentitaet_TypeClass() {
		return identitaet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentitaet_TypeClass_Wert() {
		return (EAttribute)identitaet_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKm_Massgebend_TypeClass() {
		return km_Massgebend_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKm_Massgebend_TypeClass_Wert() {
		return (EAttribute)km_Massgebend_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommentar_TypeClass() {
		return kommentar_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommentar_TypeClass_Wert() {
		return (EAttribute)kommentar_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKurztext_TypeClass() {
		return kurztext_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKurztext_TypeClass_Wert() {
		return (EAttribute)kurztext_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLieferobjekt() {
		return lieferobjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieferobjekt_Beschreibung() {
		return (EReference)lieferobjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieferobjekt_IDGEOPunkt() {
		return (EReference)lieferobjektEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieferobjekt_IDLOEinbau() {
		return (EReference)lieferobjektEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieferobjekt_LOErsatz() {
		return (EReference)lieferobjektEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieferobjekt_LOMaterial() {
		return (EReference)lieferobjektEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Ausgabestand_TypeClass() {
		return lO_Ausgabestand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_Ausgabestand_TypeClass_Wert() {
		return (EAttribute)lO_Ausgabestand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Datum_Herstellung_TypeClass() {
		return lO_Datum_Herstellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_Datum_Herstellung_TypeClass_Wert() {
		return (EAttribute)lO_Datum_Herstellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_DB_Freigabe_TypeClass() {
		return lO_DB_Freigabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_DB_Freigabe_TypeClass_Wert() {
		return (EAttribute)lO_DB_Freigabe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_EMA_Nr_TypeClass() {
		return lO_EMA_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_EMA_Nr_TypeClass_Wert() {
		return (EAttribute)lO_EMA_Nr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Ersatz_TypeClass() {
		return lO_Ersatz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_Ersatz_TypeClass_Wert() {
		return (EAttribute)lO_Ersatz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Firmensachnummer_TypeClass() {
		return lO_Firmensachnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_Firmensachnummer_TypeClass_Wert() {
		return (EAttribute)lO_Firmensachnummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Material_AttributeGroup() {
		return lO_Material_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LOAusgabestand() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LODatumHerstellung() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LODBFreigabe() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LOEMANr() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LOFirmensachnummer() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLO_Material_AttributeGroup_LOSeriennummer() {
		return (EReference)lO_Material_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLO_Seriennummer_TypeClass() {
		return lO_Seriennummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLO_Seriennummer_TypeClass_Wert() {
		return (EAttribute)lO_Seriennummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLST_Objekt_Art_TypeClass() {
		return lsT_Objekt_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLST_Objekt_Art_TypeClass_Wert() {
		return (EAttribute)lsT_Objekt_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjektreferenzen_AttributeGroup() {
		return objektreferenzen_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjektreferenzen_AttributeGroup_DBGDIReferenz() {
		return (EReference)objektreferenzen_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjektreferenzen_AttributeGroup_TechnischerPlatz() {
		return (EReference)objektreferenzen_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjektzustand_Besonders_TypeClass() {
		return objektzustand_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjektzustand_Besonders_TypeClass_Wert() {
		return (EAttribute)objektzustand_Besonders_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxy_Objekt() {
		return proxy_ObjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxy_Objekt_LSTObjektArt() {
		return (EReference)proxy_ObjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPunkt_Objekt() {
		return punkt_ObjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_PunktObjektStrecke() {
		return (EReference)punkt_ObjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_PunktObjektTOPKante() {
		return (EReference)punkt_ObjektEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPunkt_Objekt_Strecke_AttributeGroup() {
		return punkt_Objekt_Strecke_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke() {
		return (EReference)punkt_Objekt_Strecke_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend() {
		return (EReference)punkt_Objekt_Strecke_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm() {
		return (EReference)punkt_Objekt_Strecke_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPunkt_Objekt_TOP_Kante_AttributeGroup() {
		return punkt_Objekt_TOP_Kante_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand() {
		return (EReference)punkt_Objekt_TOP_Kante_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichtungsbezug_TypeClass() {
		return richtungsbezug_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRichtungsbezug_TypeClass_Wert() {
		return (EAttribute)richtungsbezug_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeitliche_Lage_TypeClass() {
		return seitliche_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeitliche_Lage_TypeClass_Wert() {
		return (EAttribute)seitliche_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeitlicher_Abstand_TypeClass() {
		return seitlicher_Abstand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeitlicher_Abstand_TypeClass_Wert() {
		return (EAttribute)seitlicher_Abstand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Km_TypeClass() {
		return strecke_Km_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Km_TypeClass_Wert() {
		return (EAttribute)strecke_Km_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnischer_Platz_TypeClass() {
		return technischer_Platz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnischer_Platz_TypeClass_Wert() {
		return (EAttribute)technischer_Platz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUr_Objekt() {
		return ur_ObjektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUr_Objekt_Identitaet() {
		return (EReference)ur_ObjektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWirkrichtung_TypeClass() {
		return wirkrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWirkrichtung_TypeClass_Wert() {
		return (EAttribute)wirkrichtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeit_Bearbeitungsvermerk_TypeClass() {
		return zeit_Bearbeitungsvermerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeit_Bearbeitungsvermerk_TypeClass_Wert() {
		return (EAttribute)zeit_Bearbeitungsvermerk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAnhangArt() {
		return enumAnhangArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBestandsrelevanz() {
		return enumBestandsrelevanzEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBVDarstellungInPlan() {
		return enumbvDarstellungInPlanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDateityp() {
		return enumDateitypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLSTObjektArt() {
		return enumlstObjektArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMObjektzustandBesonders() {
		return enumObjektzustandBesondersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMRolle() {
		return enumRolleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbstand_Type() {
		return abstand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBegrenzung_A_Type() {
		return begrenzung_A_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBegrenzung_B_Type() {
		return begrenzung_B_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBeschreibung_Type() {
		return beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBV_Kategorie_Type() {
		return bV_Kategorie_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDB_GDI_Referenz_Type() {
		return dB_GDI_Referenz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAnhangArtObject() {
		return enumAnhangArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBestandsrelevanzObject() {
		return enumBestandsrelevanzObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBVDarstellungInPlanObject() {
		return enumbvDarstellungInPlanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDateitypObject() {
		return enumDateitypObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLSTObjektArtObject() {
		return enumlstObjektArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMObjektzustandBesondersObject() {
		return enumObjektzustandBesondersObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMRolleObject() {
		return enumRolleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentitaet_Type() {
		return identitaet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKommentar_Type() {
		return kommentar_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKurztext_Type() {
		return kurztext_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLO_Ausgabestand_Type() {
		return lO_Ausgabestand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLO_DB_Freigabe_Type() {
		return lO_DB_Freigabe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLO_EMA_Nr_Type() {
		return lO_EMA_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLO_Firmensachnummer_Type() {
		return lO_Firmensachnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLO_Seriennummer_Type() {
		return lO_Seriennummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRichtungsbezug_Type() {
		return richtungsbezug_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeitliche_Lage_Type() {
		return seitliche_Lage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeitlicher_Abstand_Type() {
		return seitlicher_Abstand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStrecke_Km_Type() {
		return strecke_Km_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTechnischer_Platz_Type() {
		return technischer_Platz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisobjekteFactory getBasisobjekteFactory() {
		return (BasisobjekteFactory)getEFactoryInstance();
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
		abstand_TypeClassEClass = createEClass(ABSTAND_TYPE_CLASS);
		createEAttribute(abstand_TypeClassEClass, ABSTAND_TYPE_CLASS__WERT);

		anhangEClass = createEClass(ANHANG);
		createEReference(anhangEClass, ANHANG__ANHANG_ALLG);

		anhang_Allg_AttributeGroupEClass = createEClass(ANHANG_ALLG_ATTRIBUTE_GROUP);
		createEReference(anhang_Allg_AttributeGroupEClass, ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART);
		createEReference(anhang_Allg_AttributeGroupEClass, ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME);
		createEReference(anhang_Allg_AttributeGroupEClass, ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP);

		anhang_Art_TypeClassEClass = createEClass(ANHANG_ART_TYPE_CLASS);
		createEAttribute(anhang_Art_TypeClassEClass, ANHANG_ART_TYPE_CLASS__WERT);

		basis_ObjektEClass = createEClass(BASIS_OBJEKT);
		createEReference(basis_ObjektEClass, BASIS_OBJEKT__BASIS_OBJEKT_ALLG);
		createEReference(basis_ObjektEClass, BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK);
		createEReference(basis_ObjektEClass, BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE);
		createEReference(basis_ObjektEClass, BASIS_OBJEKT__OBJEKTREFERENZEN);

		basis_Objekt_Allg_AttributeGroupEClass = createEClass(BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP);
		createEReference(basis_Objekt_Allg_AttributeGroupEClass, BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ);
		createEReference(basis_Objekt_Allg_AttributeGroupEClass, BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS);
		createEReference(basis_Objekt_Allg_AttributeGroupEClass, BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK);
		createEReference(basis_Objekt_Allg_AttributeGroupEClass, BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS);

		bearbeitungsvermerkEClass = createEClass(BEARBEITUNGSVERMERK);
		createEReference(bearbeitungsvermerkEClass, BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG);
		createEReference(bearbeitungsvermerkEClass, BEARBEITUNGSVERMERK__ID_ANHANG);

		bearbeitungsvermerk_Allg_AttributeGroupEClass = createEClass(BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK_ROLLE);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BESTANDSRELEVANZ);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_DARSTELLUNG_IN_PLAN);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__BV_KATEGORIE);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KOMMENTAR);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__KURZTEXT);
		createEReference(bearbeitungsvermerk_Allg_AttributeGroupEClass, BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP__ZEIT_BEARBEITUNGSVERMERK);

		bearbeitungsvermerk_Rolle_TypeClassEClass = createEClass(BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS);
		createEAttribute(bearbeitungsvermerk_Rolle_TypeClassEClass, BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS__WERT);

		begrenzung_A_TypeClassEClass = createEClass(BEGRENZUNG_ATYPE_CLASS);
		createEAttribute(begrenzung_A_TypeClassEClass, BEGRENZUNG_ATYPE_CLASS__WERT);

		begrenzung_B_TypeClassEClass = createEClass(BEGRENZUNG_BTYPE_CLASS);
		createEAttribute(begrenzung_B_TypeClassEClass, BEGRENZUNG_BTYPE_CLASS__WERT);

		bereich_ObjektEClass = createEClass(BEREICH_OBJEKT);
		createEReference(bereich_ObjektEClass, BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH);

		bereich_Objekt_Teilbereich_AttributeGroupEClass = createEClass(BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP);
		createEReference(bereich_Objekt_Teilbereich_AttributeGroupEClass, BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A);
		createEReference(bereich_Objekt_Teilbereich_AttributeGroupEClass, BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B);
		createEReference(bereich_Objekt_Teilbereich_AttributeGroupEClass, BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE);
		createEReference(bereich_Objekt_Teilbereich_AttributeGroupEClass, BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG);

		beschreibung_TypeClassEClass = createEClass(BESCHREIBUNG_TYPE_CLASS);
		createEAttribute(beschreibung_TypeClassEClass, BESCHREIBUNG_TYPE_CLASS__WERT);

		bestandsrelevanz_TypeClassEClass = createEClass(BESTANDSRELEVANZ_TYPE_CLASS);
		createEAttribute(bestandsrelevanz_TypeClassEClass, BESTANDSRELEVANZ_TYPE_CLASS__WERT);

		bestandsschutz_TypeClassEClass = createEClass(BESTANDSSCHUTZ_TYPE_CLASS);
		createEAttribute(bestandsschutz_TypeClassEClass, BESTANDSSCHUTZ_TYPE_CLASS__WERT);

		bV_Darstellung_In_Plan_TypeClassEClass = createEClass(BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS);
		createEAttribute(bV_Darstellung_In_Plan_TypeClassEClass, BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS__WERT);

		bV_Kategorie_TypeClassEClass = createEClass(BV_KATEGORIE_TYPE_CLASS);
		createEAttribute(bV_Kategorie_TypeClassEClass, BV_KATEGORIE_TYPE_CLASS__WERT);

		dateiname_TypeClassEClass = createEClass(DATEINAME_TYPE_CLASS);
		createEAttribute(dateiname_TypeClassEClass, DATEINAME_TYPE_CLASS__WERT);

		dateityp_TypeClassEClass = createEClass(DATEITYP_TYPE_CLASS);
		createEAttribute(dateityp_TypeClassEClass, DATEITYP_TYPE_CLASS__WERT);

		datum_Regelwerk_TypeClassEClass = createEClass(DATUM_REGELWERK_TYPE_CLASS);
		createEAttribute(datum_Regelwerk_TypeClassEClass, DATUM_REGELWERK_TYPE_CLASS__WERT);

		dB_GDI_Referenz_TypeClassEClass = createEClass(DB_GDI_REFERENZ_TYPE_CLASS);
		createEAttribute(dB_GDI_Referenz_TypeClassEClass, DB_GDI_REFERENZ_TYPE_CLASS__WERT);

		identitaet_TypeClassEClass = createEClass(IDENTITAET_TYPE_CLASS);
		createEAttribute(identitaet_TypeClassEClass, IDENTITAET_TYPE_CLASS__WERT);

		km_Massgebend_TypeClassEClass = createEClass(KM_MASSGEBEND_TYPE_CLASS);
		createEAttribute(km_Massgebend_TypeClassEClass, KM_MASSGEBEND_TYPE_CLASS__WERT);

		kommentar_TypeClassEClass = createEClass(KOMMENTAR_TYPE_CLASS);
		createEAttribute(kommentar_TypeClassEClass, KOMMENTAR_TYPE_CLASS__WERT);

		kurztext_TypeClassEClass = createEClass(KURZTEXT_TYPE_CLASS);
		createEAttribute(kurztext_TypeClassEClass, KURZTEXT_TYPE_CLASS__WERT);

		lieferobjektEClass = createEClass(LIEFEROBJEKT);
		createEReference(lieferobjektEClass, LIEFEROBJEKT__BESCHREIBUNG);
		createEReference(lieferobjektEClass, LIEFEROBJEKT__IDGEO_PUNKT);
		createEReference(lieferobjektEClass, LIEFEROBJEKT__IDLO_EINBAU);
		createEReference(lieferobjektEClass, LIEFEROBJEKT__LO_ERSATZ);
		createEReference(lieferobjektEClass, LIEFEROBJEKT__LO_MATERIAL);

		lO_Ausgabestand_TypeClassEClass = createEClass(LO_AUSGABESTAND_TYPE_CLASS);
		createEAttribute(lO_Ausgabestand_TypeClassEClass, LO_AUSGABESTAND_TYPE_CLASS__WERT);

		lO_Datum_Herstellung_TypeClassEClass = createEClass(LO_DATUM_HERSTELLUNG_TYPE_CLASS);
		createEAttribute(lO_Datum_Herstellung_TypeClassEClass, LO_DATUM_HERSTELLUNG_TYPE_CLASS__WERT);

		lO_DB_Freigabe_TypeClassEClass = createEClass(LO_DB_FREIGABE_TYPE_CLASS);
		createEAttribute(lO_DB_Freigabe_TypeClassEClass, LO_DB_FREIGABE_TYPE_CLASS__WERT);

		lO_EMA_Nr_TypeClassEClass = createEClass(LO_EMA_NR_TYPE_CLASS);
		createEAttribute(lO_EMA_Nr_TypeClassEClass, LO_EMA_NR_TYPE_CLASS__WERT);

		lO_Ersatz_TypeClassEClass = createEClass(LO_ERSATZ_TYPE_CLASS);
		createEAttribute(lO_Ersatz_TypeClassEClass, LO_ERSATZ_TYPE_CLASS__WERT);

		lO_Firmensachnummer_TypeClassEClass = createEClass(LO_FIRMENSACHNUMMER_TYPE_CLASS);
		createEAttribute(lO_Firmensachnummer_TypeClassEClass, LO_FIRMENSACHNUMMER_TYPE_CLASS__WERT);

		lO_Material_AttributeGroupEClass = createEClass(LO_MATERIAL_ATTRIBUTE_GROUP);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LO_AUSGABESTAND);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LO_DATUM_HERSTELLUNG);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LODB_FREIGABE);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LOEMA_NR);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LO_FIRMENSACHNUMMER);
		createEReference(lO_Material_AttributeGroupEClass, LO_MATERIAL_ATTRIBUTE_GROUP__LO_SERIENNUMMER);

		lO_Seriennummer_TypeClassEClass = createEClass(LO_SERIENNUMMER_TYPE_CLASS);
		createEAttribute(lO_Seriennummer_TypeClassEClass, LO_SERIENNUMMER_TYPE_CLASS__WERT);

		lsT_Objekt_Art_TypeClassEClass = createEClass(LST_OBJEKT_ART_TYPE_CLASS);
		createEAttribute(lsT_Objekt_Art_TypeClassEClass, LST_OBJEKT_ART_TYPE_CLASS__WERT);

		objektreferenzen_AttributeGroupEClass = createEClass(OBJEKTREFERENZEN_ATTRIBUTE_GROUP);
		createEReference(objektreferenzen_AttributeGroupEClass, OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ);
		createEReference(objektreferenzen_AttributeGroupEClass, OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ);

		objektzustand_Besonders_TypeClassEClass = createEClass(OBJEKTZUSTAND_BESONDERS_TYPE_CLASS);
		createEAttribute(objektzustand_Besonders_TypeClassEClass, OBJEKTZUSTAND_BESONDERS_TYPE_CLASS__WERT);

		proxy_ObjektEClass = createEClass(PROXY_OBJEKT);
		createEReference(proxy_ObjektEClass, PROXY_OBJEKT__LST_OBJEKT_ART);

		punkt_ObjektEClass = createEClass(PUNKT_OBJEKT);
		createEReference(punkt_ObjektEClass, PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE);
		createEReference(punkt_ObjektEClass, PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE);

		punkt_Objekt_Strecke_AttributeGroupEClass = createEClass(PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP);
		createEReference(punkt_Objekt_Strecke_AttributeGroupEClass, PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE);
		createEReference(punkt_Objekt_Strecke_AttributeGroupEClass, PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND);
		createEReference(punkt_Objekt_Strecke_AttributeGroupEClass, PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM);

		punkt_Objekt_TOP_Kante_AttributeGroupEClass = createEClass(PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE);
		createEReference(punkt_Objekt_TOP_Kante_AttributeGroupEClass, PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND);

		richtungsbezug_TypeClassEClass = createEClass(RICHTUNGSBEZUG_TYPE_CLASS);
		createEAttribute(richtungsbezug_TypeClassEClass, RICHTUNGSBEZUG_TYPE_CLASS__WERT);

		seitliche_Lage_TypeClassEClass = createEClass(SEITLICHE_LAGE_TYPE_CLASS);
		createEAttribute(seitliche_Lage_TypeClassEClass, SEITLICHE_LAGE_TYPE_CLASS__WERT);

		seitlicher_Abstand_TypeClassEClass = createEClass(SEITLICHER_ABSTAND_TYPE_CLASS);
		createEAttribute(seitlicher_Abstand_TypeClassEClass, SEITLICHER_ABSTAND_TYPE_CLASS__WERT);

		strecke_Km_TypeClassEClass = createEClass(STRECKE_KM_TYPE_CLASS);
		createEAttribute(strecke_Km_TypeClassEClass, STRECKE_KM_TYPE_CLASS__WERT);

		technischer_Platz_TypeClassEClass = createEClass(TECHNISCHER_PLATZ_TYPE_CLASS);
		createEAttribute(technischer_Platz_TypeClassEClass, TECHNISCHER_PLATZ_TYPE_CLASS__WERT);

		ur_ObjektEClass = createEClass(UR_OBJEKT);
		createEReference(ur_ObjektEClass, UR_OBJEKT__IDENTITAET);

		wirkrichtung_TypeClassEClass = createEClass(WIRKRICHTUNG_TYPE_CLASS);
		createEAttribute(wirkrichtung_TypeClassEClass, WIRKRICHTUNG_TYPE_CLASS__WERT);

		zeit_Bearbeitungsvermerk_TypeClassEClass = createEClass(ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS);
		createEAttribute(zeit_Bearbeitungsvermerk_TypeClassEClass, ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT);

		// Create enums
		enumAnhangArtEEnum = createEEnum(ENUM_ANHANG_ART);
		enumBestandsrelevanzEEnum = createEEnum(ENUM_BESTANDSRELEVANZ);
		enumbvDarstellungInPlanEEnum = createEEnum(ENUMBV_DARSTELLUNG_IN_PLAN);
		enumDateitypEEnum = createEEnum(ENUM_DATEITYP);
		enumlstObjektArtEEnum = createEEnum(ENUMLST_OBJEKT_ART);
		enumObjektzustandBesondersEEnum = createEEnum(ENUM_OBJEKTZUSTAND_BESONDERS);
		enumRolleEEnum = createEEnum(ENUM_ROLLE);

		// Create data types
		abstand_TypeEDataType = createEDataType(ABSTAND_TYPE);
		begrenzung_A_TypeEDataType = createEDataType(BEGRENZUNG_ATYPE);
		begrenzung_B_TypeEDataType = createEDataType(BEGRENZUNG_BTYPE);
		beschreibung_TypeEDataType = createEDataType(BESCHREIBUNG_TYPE);
		bV_Kategorie_TypeEDataType = createEDataType(BV_KATEGORIE_TYPE);
		dB_GDI_Referenz_TypeEDataType = createEDataType(DB_GDI_REFERENZ_TYPE);
		enumAnhangArtObjectEDataType = createEDataType(ENUM_ANHANG_ART_OBJECT);
		enumBestandsrelevanzObjectEDataType = createEDataType(ENUM_BESTANDSRELEVANZ_OBJECT);
		enumbvDarstellungInPlanObjectEDataType = createEDataType(ENUMBV_DARSTELLUNG_IN_PLAN_OBJECT);
		enumDateitypObjectEDataType = createEDataType(ENUM_DATEITYP_OBJECT);
		enumlstObjektArtObjectEDataType = createEDataType(ENUMLST_OBJEKT_ART_OBJECT);
		enumObjektzustandBesondersObjectEDataType = createEDataType(ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT);
		enumRolleObjectEDataType = createEDataType(ENUM_ROLLE_OBJECT);
		identitaet_TypeEDataType = createEDataType(IDENTITAET_TYPE);
		kommentar_TypeEDataType = createEDataType(KOMMENTAR_TYPE);
		kurztext_TypeEDataType = createEDataType(KURZTEXT_TYPE);
		lO_Ausgabestand_TypeEDataType = createEDataType(LO_AUSGABESTAND_TYPE);
		lO_DB_Freigabe_TypeEDataType = createEDataType(LO_DB_FREIGABE_TYPE);
		lO_EMA_Nr_TypeEDataType = createEDataType(LO_EMA_NR_TYPE);
		lO_Firmensachnummer_TypeEDataType = createEDataType(LO_FIRMENSACHNUMMER_TYPE);
		lO_Seriennummer_TypeEDataType = createEDataType(LO_SERIENNUMMER_TYPE);
		richtungsbezug_TypeEDataType = createEDataType(RICHTUNGSBEZUG_TYPE);
		seitliche_Lage_TypeEDataType = createEDataType(SEITLICHE_LAGE_TYPE);
		seitlicher_Abstand_TypeEDataType = createEDataType(SEITLICHER_ABSTAND_TYPE);
		strecke_Km_TypeEDataType = createEDataType(STRECKE_KM_TYPE);
		technischer_Platz_TypeEDataType = createEDataType(TECHNISCHER_PLATZ_TYPE);
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
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anhangEClass.getESuperTypes().add(this.getUr_Objekt());
		anhang_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		basis_ObjektEClass.getESuperTypes().add(this.getUr_Objekt());
		bearbeitungsvermerkEClass.getESuperTypes().add(this.getUr_Objekt());
		bearbeitungsvermerk_Rolle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		begrenzung_A_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		begrenzung_B_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bereich_ObjektEClass.getESuperTypes().add(this.getBasis_Objekt());
		beschreibung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bestandsrelevanz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bestandsschutz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bV_Darstellung_In_Plan_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bV_Kategorie_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dateiname_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dateityp_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		datum_Regelwerk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dB_GDI_Referenz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		identitaet_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		km_Massgebend_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kommentar_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kurztext_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lieferobjektEClass.getESuperTypes().add(this.getBasis_Objekt());
		lO_Ausgabestand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_Datum_Herstellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_DB_Freigabe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_EMA_Nr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_Ersatz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_Firmensachnummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lO_Seriennummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lsT_Objekt_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		objektzustand_Besonders_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		proxy_ObjektEClass.getESuperTypes().add(this.getUr_Objekt());
		punkt_ObjektEClass.getESuperTypes().add(this.getBasis_Objekt());
		richtungsbezug_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		seitliche_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		seitlicher_Abstand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		strecke_Km_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		technischer_Platz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		wirkrichtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zeit_Bearbeitungsvermerk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(abstand_TypeClassEClass, Abstand_TypeClass.class, "Abstand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstand_TypeClass_Wert(), this.getAbstand_Type(), "wert", null, 1, 1, Abstand_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anhangEClass, Anhang.class, "Anhang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnhang_AnhangAllg(), this.getAnhang_Allg_AttributeGroup(), null, "anhangAllg", null, 1, 1, Anhang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anhang_Allg_AttributeGroupEClass, Anhang_Allg_AttributeGroup.class, "Anhang_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnhang_Allg_AttributeGroup_AnhangArt(), this.getAnhang_Art_TypeClass(), null, "anhangArt", null, 1, 1, Anhang_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnhang_Allg_AttributeGroup_Dateiname(), this.getDateiname_TypeClass(), null, "dateiname", null, 1, 1, Anhang_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnhang_Allg_AttributeGroup_Dateityp(), this.getDateityp_TypeClass(), null, "dateityp", null, 1, 1, Anhang_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anhang_Art_TypeClassEClass, Anhang_Art_TypeClass.class, "Anhang_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnhang_Art_TypeClass_Wert(), this.getENUMAnhangArtObject(), "wert", null, 1, 1, Anhang_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basis_ObjektEClass, Basis_Objekt.class, "Basis_Objekt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasis_Objekt_BasisObjektAllg(), this.getBasis_Objekt_Allg_AttributeGroup(), null, "basisObjektAllg", null, 1, 1, Basis_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_IDBearbeitungsvermerk(), theBasisTypenPackage.getID_Bearbeitungsvermerk_TypeClass(), null, "iDBearbeitungsvermerk", null, 0, -1, Basis_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_IDOertlichkeitAusgabe(), theVerweisePackage.getID_Oertlichkeit_Ausgabe_TypeClass(), null, "iDOertlichkeitAusgabe", null, 0, 1, Basis_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_Objektreferenzen(), this.getObjektreferenzen_AttributeGroup(), null, "objektreferenzen", null, 0, 1, Basis_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basis_Objekt_Allg_AttributeGroupEClass, Basis_Objekt_Allg_AttributeGroup.class, "Basis_Objekt_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz(), this.getBestandsschutz_TypeClass(), null, "bestandsschutz", null, 0, 1, Basis_Objekt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders(), this.getObjektzustand_Besonders_TypeClass(), null, "objektzustandBesonders", null, 0, 1, Basis_Objekt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk(), this.getDatum_Regelwerk_TypeClass(), null, "datumRegelwerk", null, 0, 1, Basis_Objekt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangRegelwerkBesonders", null, 0, 1, Basis_Objekt_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearbeitungsvermerkEClass, Bearbeitungsvermerk.class, "Bearbeitungsvermerk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBearbeitungsvermerk_BearbeitungsvermerkAllg(), this.getBearbeitungsvermerk_Allg_AttributeGroup(), null, "bearbeitungsvermerkAllg", null, 1, 1, Bearbeitungsvermerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_IDAnhang(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhang", null, 0, -1, Bearbeitungsvermerk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearbeitungsvermerk_Allg_AttributeGroupEClass, Bearbeitungsvermerk_Allg_AttributeGroup.class, "Bearbeitungsvermerk_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle(), this.getBearbeitungsvermerk_Rolle_TypeClass(), null, "bearbeitungsvermerkRolle", null, 1, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz(), this.getBestandsrelevanz_TypeClass(), null, "bestandsrelevanz", null, 0, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan(), this.getBV_Darstellung_In_Plan_TypeClass(), null, "bVDarstellungInPlan", null, 0, -1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie(), this.getBV_Kategorie_TypeClass(), null, "bVKategorie", null, 0, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar(), this.getKommentar_TypeClass(), null, "kommentar", null, 1, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext(), this.getKurztext_TypeClass(), null, "kurztext", null, 0, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk(), this.getZeit_Bearbeitungsvermerk_TypeClass(), null, "zeitBearbeitungsvermerk", null, 1, 1, Bearbeitungsvermerk_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearbeitungsvermerk_Rolle_TypeClassEClass, Bearbeitungsvermerk_Rolle_TypeClass.class, "Bearbeitungsvermerk_Rolle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBearbeitungsvermerk_Rolle_TypeClass_Wert(), this.getENUMRolleObject(), "wert", null, 1, 1, Bearbeitungsvermerk_Rolle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(begrenzung_A_TypeClassEClass, Begrenzung_A_TypeClass.class, "Begrenzung_A_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBegrenzung_A_TypeClass_Wert(), this.getBegrenzung_A_Type(), "wert", null, 1, 1, Begrenzung_A_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(begrenzung_B_TypeClassEClass, Begrenzung_B_TypeClass.class, "Begrenzung_B_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBegrenzung_B_TypeClass_Wert(), this.getBegrenzung_B_Type(), "wert", null, 1, 1, Begrenzung_B_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bereich_ObjektEClass, Bereich_Objekt.class, "Bereich_Objekt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBereich_Objekt_BereichObjektTeilbereich(), this.getBereich_Objekt_Teilbereich_AttributeGroup(), null, "bereichObjektTeilbereich", null, 1, -1, Bereich_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bereich_Objekt_Teilbereich_AttributeGroupEClass, Bereich_Objekt_Teilbereich_AttributeGroup.class, "Bereich_Objekt_Teilbereich_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA(), this.getBegrenzung_A_TypeClass(), null, "begrenzungA", null, 1, 1, Bereich_Objekt_Teilbereich_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB(), this.getBegrenzung_B_TypeClass(), null, "begrenzungB", null, 1, 1, Bereich_Objekt_Teilbereich_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante(), theVerweisePackage.getID_TOP_Kante_TypeClass(), null, "iDTOPKante", null, 1, 1, Bereich_Objekt_Teilbereich_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug(), this.getRichtungsbezug_TypeClass(), null, "richtungsbezug", null, 0, 1, Bereich_Objekt_Teilbereich_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beschreibung_TypeClassEClass, Beschreibung_TypeClass.class, "Beschreibung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeschreibung_TypeClass_Wert(), this.getBeschreibung_Type(), "wert", null, 1, 1, Beschreibung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bestandsrelevanz_TypeClassEClass, Bestandsrelevanz_TypeClass.class, "Bestandsrelevanz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBestandsrelevanz_TypeClass_Wert(), this.getENUMBestandsrelevanzObject(), "wert", null, 1, 1, Bestandsrelevanz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bestandsschutz_TypeClassEClass, Bestandsschutz_TypeClass.class, "Bestandsschutz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBestandsschutz_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Bestandsschutz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bV_Darstellung_In_Plan_TypeClassEClass, BV_Darstellung_In_Plan_TypeClass.class, "BV_Darstellung_In_Plan_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBV_Darstellung_In_Plan_TypeClass_Wert(), this.getENUMBVDarstellungInPlanObject(), "wert", null, 1, 1, BV_Darstellung_In_Plan_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bV_Kategorie_TypeClassEClass, BV_Kategorie_TypeClass.class, "BV_Kategorie_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBV_Kategorie_TypeClass_Wert(), this.getBV_Kategorie_Type(), "wert", null, 1, 1, BV_Kategorie_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateiname_TypeClassEClass, Dateiname_TypeClass.class, "Dateiname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateiname_TypeClass_Wert(), theBasisTypenPackage.getDateiname_Type(), "wert", null, 1, 1, Dateiname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateityp_TypeClassEClass, Dateityp_TypeClass.class, "Dateityp_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateityp_TypeClass_Wert(), this.getENUMDateitypObject(), "wert", null, 1, 1, Dateityp_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datum_Regelwerk_TypeClassEClass, Datum_Regelwerk_TypeClass.class, "Datum_Regelwerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatum_Regelwerk_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, Datum_Regelwerk_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dB_GDI_Referenz_TypeClassEClass, DB_GDI_Referenz_TypeClass.class, "DB_GDI_Referenz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDB_GDI_Referenz_TypeClass_Wert(), this.getDB_GDI_Referenz_Type(), "wert", null, 1, 1, DB_GDI_Referenz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identitaet_TypeClassEClass, Identitaet_TypeClass.class, "Identitaet_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentitaet_TypeClass_Wert(), this.getIdentitaet_Type(), "wert", null, 1, 1, Identitaet_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(km_Massgebend_TypeClassEClass, Km_Massgebend_TypeClass.class, "Km_Massgebend_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKm_Massgebend_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Km_Massgebend_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommentar_TypeClassEClass, Kommentar_TypeClass.class, "Kommentar_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKommentar_TypeClass_Wert(), this.getKommentar_Type(), "wert", null, 1, 1, Kommentar_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kurztext_TypeClassEClass, Kurztext_TypeClass.class, "Kurztext_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKurztext_TypeClass_Wert(), this.getKurztext_Type(), "wert", null, 1, 1, Kurztext_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lieferobjektEClass, Lieferobjekt.class, "Lieferobjekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLieferobjekt_Beschreibung(), this.getBeschreibung_TypeClass(), null, "beschreibung", null, 0, 1, Lieferobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLieferobjekt_IDGEOPunkt(), theVerweisePackage.getID_GEO_Punkt_ohne_Proxy_TypeClass(), null, "iDGEOPunkt", null, 0, -1, Lieferobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLieferobjekt_IDLOEinbau(), theVerweisePackage.getID_LO_Einbau_TypeClass(), null, "iDLOEinbau", null, 1, -1, Lieferobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLieferobjekt_LOErsatz(), this.getLO_Ersatz_TypeClass(), null, "lOErsatz", null, 0, 1, Lieferobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLieferobjekt_LOMaterial(), this.getLO_Material_AttributeGroup(), null, "lOMaterial", null, 0, 1, Lieferobjekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Ausgabestand_TypeClassEClass, LO_Ausgabestand_TypeClass.class, "LO_Ausgabestand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_Ausgabestand_TypeClass_Wert(), this.getLO_Ausgabestand_Type(), "wert", null, 1, 1, LO_Ausgabestand_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Datum_Herstellung_TypeClassEClass, LO_Datum_Herstellung_TypeClass.class, "LO_Datum_Herstellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_Datum_Herstellung_TypeClass_Wert(), theXMLTypePackage.getDate(), "wert", null, 1, 1, LO_Datum_Herstellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_DB_Freigabe_TypeClassEClass, LO_DB_Freigabe_TypeClass.class, "LO_DB_Freigabe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_DB_Freigabe_TypeClass_Wert(), this.getLO_DB_Freigabe_Type(), "wert", null, 1, 1, LO_DB_Freigabe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_EMA_Nr_TypeClassEClass, LO_EMA_Nr_TypeClass.class, "LO_EMA_Nr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_EMA_Nr_TypeClass_Wert(), this.getLO_EMA_Nr_Type(), "wert", null, 1, 1, LO_EMA_Nr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Ersatz_TypeClassEClass, LO_Ersatz_TypeClass.class, "LO_Ersatz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_Ersatz_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, LO_Ersatz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Firmensachnummer_TypeClassEClass, LO_Firmensachnummer_TypeClass.class, "LO_Firmensachnummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_Firmensachnummer_TypeClass_Wert(), this.getLO_Firmensachnummer_Type(), "wert", null, 1, 1, LO_Firmensachnummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Material_AttributeGroupEClass, LO_Material_AttributeGroup.class, "LO_Material_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLO_Material_AttributeGroup_LOAusgabestand(), this.getLO_Ausgabestand_TypeClass(), null, "lOAusgabestand", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLO_Material_AttributeGroup_LODatumHerstellung(), this.getLO_Datum_Herstellung_TypeClass(), null, "lODatumHerstellung", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLO_Material_AttributeGroup_LODBFreigabe(), this.getLO_DB_Freigabe_TypeClass(), null, "lODBFreigabe", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLO_Material_AttributeGroup_LOEMANr(), this.getLO_EMA_Nr_TypeClass(), null, "lOEMANr", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLO_Material_AttributeGroup_LOFirmensachnummer(), this.getLO_Firmensachnummer_TypeClass(), null, "lOFirmensachnummer", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLO_Material_AttributeGroup_LOSeriennummer(), this.getLO_Seriennummer_TypeClass(), null, "lOSeriennummer", null, 1, 1, LO_Material_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lO_Seriennummer_TypeClassEClass, LO_Seriennummer_TypeClass.class, "LO_Seriennummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLO_Seriennummer_TypeClass_Wert(), this.getLO_Seriennummer_Type(), "wert", null, 1, 1, LO_Seriennummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lsT_Objekt_Art_TypeClassEClass, LST_Objekt_Art_TypeClass.class, "LST_Objekt_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLST_Objekt_Art_TypeClass_Wert(), this.getENUMLSTObjektArtObject(), "wert", null, 1, 1, LST_Objekt_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objektreferenzen_AttributeGroupEClass, Objektreferenzen_AttributeGroup.class, "Objektreferenzen_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjektreferenzen_AttributeGroup_DBGDIReferenz(), this.getDB_GDI_Referenz_TypeClass(), null, "dBGDIReferenz", null, 0, 1, Objektreferenzen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjektreferenzen_AttributeGroup_TechnischerPlatz(), this.getTechnischer_Platz_TypeClass(), null, "technischerPlatz", null, 0, 1, Objektreferenzen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objektzustand_Besonders_TypeClassEClass, Objektzustand_Besonders_TypeClass.class, "Objektzustand_Besonders_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjektzustand_Besonders_TypeClass_Wert(), this.getENUMObjektzustandBesondersObject(), "wert", null, 1, 1, Objektzustand_Besonders_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxy_ObjektEClass, Proxy_Objekt.class, "Proxy_Objekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxy_Objekt_LSTObjektArt(), this.getLST_Objekt_Art_TypeClass(), null, "lSTObjektArt", null, 1, 1, Proxy_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punkt_ObjektEClass, Punkt_Objekt.class, "Punkt_Objekt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPunkt_Objekt_PunktObjektStrecke(), this.getPunkt_Objekt_Strecke_AttributeGroup(), null, "punktObjektStrecke", null, 0, -1, Punkt_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_PunktObjektTOPKante(), this.getPunkt_Objekt_TOP_Kante_AttributeGroup(), null, "punktObjektTOPKante", null, 1, -1, Punkt_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punkt_Objekt_Strecke_AttributeGroupEClass, Punkt_Objekt_Strecke_AttributeGroup.class, "Punkt_Objekt_Strecke_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke(), theVerweisePackage.getID_Strecke_TypeClass(), null, "iDStrecke", null, 1, 1, Punkt_Objekt_Strecke_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend(), this.getKm_Massgebend_TypeClass(), null, "kmMassgebend", null, 0, 1, Punkt_Objekt_Strecke_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm(), this.getStrecke_Km_TypeClass(), null, "streckeKm", null, 1, 1, Punkt_Objekt_Strecke_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punkt_Objekt_TOP_Kante_AttributeGroupEClass, Punkt_Objekt_TOP_Kante_AttributeGroup.class, "Punkt_Objekt_TOP_Kante_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand(), this.getAbstand_TypeClass(), null, "abstand", null, 1, 1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet(), theVerweisePackage.getID_GEO_Punkt_ohne_Proxy_TypeClass(), null, "iDGEOPunktBerechnet", null, 0, -1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante(), theVerweisePackage.getID_TOP_Kante_TypeClass(), null, "iDTOPKante", null, 1, 1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung(), this.getWirkrichtung_TypeClass(), null, "wirkrichtung", null, 0, 1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage(), this.getSeitliche_Lage_TypeClass(), null, "seitlicheLage", null, 0, 1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand(), this.getSeitlicher_Abstand_TypeClass(), null, "seitlicherAbstand", null, 0, 1, Punkt_Objekt_TOP_Kante_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richtungsbezug_TypeClassEClass, Richtungsbezug_TypeClass.class, "Richtungsbezug_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichtungsbezug_TypeClass_Wert(), this.getRichtungsbezug_Type(), "wert", null, 1, 1, Richtungsbezug_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seitliche_Lage_TypeClassEClass, Seitliche_Lage_TypeClass.class, "Seitliche_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeitliche_Lage_TypeClass_Wert(), this.getSeitliche_Lage_Type(), "wert", null, 1, 1, Seitliche_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seitlicher_Abstand_TypeClassEClass, Seitlicher_Abstand_TypeClass.class, "Seitlicher_Abstand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeitlicher_Abstand_TypeClass_Wert(), this.getSeitlicher_Abstand_Type(), "wert", null, 1, 1, Seitlicher_Abstand_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_Km_TypeClassEClass, Strecke_Km_TypeClass.class, "Strecke_Km_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrecke_Km_TypeClass_Wert(), this.getStrecke_Km_Type(), "wert", null, 1, 1, Strecke_Km_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technischer_Platz_TypeClassEClass, Technischer_Platz_TypeClass.class, "Technischer_Platz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnischer_Platz_TypeClass_Wert(), this.getTechnischer_Platz_Type(), "wert", null, 1, 1, Technischer_Platz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ur_ObjektEClass, Ur_Objekt.class, "Ur_Objekt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUr_Objekt_Identitaet(), this.getIdentitaet_TypeClass(), null, "identitaet", null, 1, 1, Ur_Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wirkrichtung_TypeClassEClass, Wirkrichtung_TypeClass.class, "Wirkrichtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWirkrichtung_TypeClass_Wert(), theBasisTypenPackage.getWirkrichtung_Type(), "wert", null, 1, 1, Wirkrichtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeit_Bearbeitungsvermerk_TypeClassEClass, Zeit_Bearbeitungsvermerk_TypeClass.class, "Zeit_Bearbeitungsvermerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeit_Bearbeitungsvermerk_TypeClass_Wert(), theXMLTypePackage.getDateTime(), "wert", null, 1, 1, Zeit_Bearbeitungsvermerk_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAnhangArtEEnum, ENUMAnhangArt.class, "ENUMAnhangArt");
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ABNAHMENIEDERSCHRIFT);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ANBINDUNG_IB2);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ANBINDUNG_IB3);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BAST);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BELU);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BENUTZEROBERFLAECHE);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BESTAETIG_GLEICHSTELLUNG);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BESTAETIG_QUALITAETSPRUEFUNG);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_BESTAETIG_UEBERNAHME);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_FREIGABE_BVB);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_GENEHMIGUNG_AG_BH_BHV);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_MATERIAL_BESONDERS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_UEBERTRAGUNGSWEGEPLAN);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_DWS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ERLAEUTERUNGSBERICHT);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_GEO);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_INA);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_MOEBELAUFSTELLPLAN_AUFRISS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_MOEBELAUFSTELLPLAN_GRUNDRISS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_MONITORAUFTEILUNG);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_PLANVERZEICHNIS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_PRUEFBERICHT);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_RAUMPLAN_BEDIENRAEUME);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_RAUMPLAN_RECHNERRAEUME);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_REGELWERKSSTAND_BESONDERS);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_RICHTUNGSSINN);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_SONSTIGE);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_STEUERBEZIRKSUEBERSICHT);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_UI_G);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_VORGABE);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_VORGABE_GBT);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_VZ_G);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ZI_E);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ZN_RAUMPLAN_BEDIENRAUM);
		addEEnumLiteral(enumAnhangArtEEnum, ENUMAnhangArt.ENUM_ANHANG_ART_ZN_RAUMPLAN_RECHNERRAUM);

		initEEnum(enumBestandsrelevanzEEnum, ENUMBestandsrelevanz.class, "ENUMBestandsrelevanz");
		addEEnumLiteral(enumBestandsrelevanzEEnum, ENUMBestandsrelevanz.ENUM_BESTANDSRELEVANZ_BESTANDSDATEN);
		addEEnumLiteral(enumBestandsrelevanzEEnum, ENUMBestandsrelevanz.ENUM_BESTANDSRELEVANZ_BESTANDSDOKUMENTATION);
		addEEnumLiteral(enumBestandsrelevanzEEnum, ENUMBestandsrelevanz.ENUM_BESTANDSRELEVANZ_DAUERHAFT);
		addEEnumLiteral(enumBestandsrelevanzEEnum, ENUMBestandsrelevanz.ENUM_BESTANDSRELEVANZ_NEIN);

		initEEnum(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.class, "ENUMBVDarstellungInPlan");
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ANLAGENTABELLE_TRANSITION);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BALISENPRÜFPROTOKOLL);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BEDIENEINRICHTUNGSTABELLE_BU);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BEDIENEINRICHTUNGSTABELLE_STW);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BU_ABHÄNGIGKEITSTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BU_KABELLAGE_UND_UBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BU_KABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_BU_LAGEPLAN_NTG);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_DEADLOCK_TABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_DURCHRUTSCHWEG_UND_GEFAHRPUNKTTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ELEMENTANSTEUERTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ESG_DATENPUNKTTABELLE_1);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ESG_DATENPUNKTTABELLE_2);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ESG_DATENPUNKTTABELLE_3);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ETCS_MELDE_UND_KOMMANDOANSCHALTUNG_SIGNALE_MUKA_SIGNALE_);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ETCS_MELDE_UND_KOMMANDOANSCHALTUNG_WEICHEN_MUKA_WEICHEN_);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ETCS_DATENPUNKTTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_FLANKENSCHUTZTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_FREIMELDETABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_GFR_PLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_GLEISMAGNETTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_GLEISSCHALTMITTELTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_INSELGLEISTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_KABELLAGEPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_KABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_LEU_TABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_MELDEDRUCKTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_NAHBEDIENUNGSTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_RANGIERSTRASSENTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SCHLOSSTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SICHERUNGSTECHNISCHER_KREUZUNGSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SICHERUNGSTECHNISCHER_LAGEPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN_BU);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SIGNAL_UND_SCHUTZSTRECKENTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SIGNALTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_SONSTIGE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_STAMMKABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_STATISCHE_STRECKENEIGENSCHAFTEN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_STRECKENBLOCKTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_ANEINANDERGEREIHTEN_FAHRSTRASSEN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_ATO_SEGMENT_PROFILES);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_ATO_TIMING_POINTS);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_ATO_TS_INSTANZEN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_EIN_UND_AUSSTIEGE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_TABELLE_DER_TECHNIK_UND_BEDIENSTANDORTE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_UBERTRAGUNGSWEGTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_WEICHENLAUFKETTENTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_WEICHENTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZBS_DATENPUNKTTABELLE_1);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZBS_DATENPUNKTTABELLE_2);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZBS_DATENPUNKTTABELLE_3);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZL_ANSTOSSTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZLV_BUS_UBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZN_TABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZN_UBERSICHTSPLAN);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZUGSTRASSENTABELLE);
		addEEnumLiteral(enumbvDarstellungInPlanEEnum, ENUMBVDarstellungInPlan.ENUMBV_DARSTELLUNG_IN_PLAN_ZWIESCHUTZWEICHENTABELLE);

		initEEnum(enumDateitypEEnum, ENUMDateityp.class, "ENUMDateityp");
		addEEnumLiteral(enumDateitypEEnum, ENUMDateityp.ENUM_DATEITYP_JPG);
		addEEnumLiteral(enumDateitypEEnum, ENUMDateityp.ENUM_DATEITYP_MPEG);
		addEEnumLiteral(enumDateitypEEnum, ENUMDateityp.ENUM_DATEITYP_PDF);
		addEEnumLiteral(enumDateitypEEnum, ENUMDateityp.ENUM_DATEITYP_PNG);
		addEEnumLiteral(enumDateitypEEnum, ENUMDateityp.ENUM_DATEITYP_TIF);

		initEEnum(enumlstObjektArtEEnum, ENUMLSTObjektArt.class, "ENUMLSTObjektArt");
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ANHANG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ATO_SEGMENT_PROFILE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ATO_TIMING_POINT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ATO_TS_INSTANZ);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_AUSSENELEMENTANSTEUERUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BAHNSTEIG_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BAHNSTEIG_DACH);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BAHNSTEIG_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BAHNSTEIG_ZUGANG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BALISE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEARBEITUNGSVERMERK);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_ANRUECKABSCHNITT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_ANZEIGE_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_BEZIRK);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_EINRICHTUNG_OERTLICH);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_GBT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_OBERFLAECHE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_OBERFLAECHE_BILD);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_OERTLICHKEIT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_PLATZ);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_STANDORT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BEDIEN_ZENTRALE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BINAERDATEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BLOCK_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BLOCK_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BLOCK_STRECKE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_ANLAGE_STRASSE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_ANLAGE_V);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_AUSSCHALTUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_BEDIEN_ANZEIGE_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_DECKENDES_SIGNAL_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_EINSCHALTUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_EINSCHALTUNG_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_GEFAHRRAUM_ECKPUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_GLEISBEZOGENER_GEFAHRRAUM);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_KREUZUNGSPLAN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_SCHNITTSTELLE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_SPEZIFISCHES_SIGNAL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_BUE_WS_FSTR_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_DATENPUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_DATENPUNKT_LINK);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ESTW_ZENTRALEINHEIT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ETCS_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ETCS_KNOTEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ETCS_RICHTUNGSANZEIGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ETCS_SIGNAL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ETCS_WKR);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_EV_MODUL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FACHTELEGRAMM);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FLA_FREIMELDE_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FLA_SCHUTZ);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FLA_ZWIESCHUTZ);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FMA_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FMA_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FMA_KOMPONENTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_ABHAENGIGKEIT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_ANEINANDER);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_ANEINANDER_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_DWEG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_DWEG_WKR);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_FAHRWEG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_NICHTHALTFALL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_RANGIER_FLA_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_SIGNALISIERUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_UMFAHRPUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FSTR_ZUG_RANGIER);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FT_ANSCHALTBEDINGUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_FT_FAHRWEG_TEIL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GEO_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GEO_KNOTEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GEO_PUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GESCHWINDIGKEITSPROFIL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GFR_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GFR_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GFR_TRIPELSPIEGEL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_ABSCHLUSS);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_ABSCHNITT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_ART);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_BAUBEREICH);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_BEZEICHNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_FAHRBAHN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_LICHTRAUM);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_GLEIS_SCHALTGRUPPE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_HOEHENLINIE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_HOEHENPUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_KABEL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_KABEL_VERTEILPUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_LEU_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_LEU_MODUL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_LEU_SCHALTKASTEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_LIEFEROBJEKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_LUFT_TELEGRAMM);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_MARKANTER_PUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_NB);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_NB_BEDIEN_ANZEIGE_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_NB_ZONE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_NB_ZONE_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_NB_ZONE_GRENZE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_OERTLICHKEIT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_PROG_DATEI_GRUPPE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_PZB_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_PZB_ELEMENT_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_PZB_ZUORDNUNG_SIGNAL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_RBC);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_REGELZEICHNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_REGELZEICHNUNG_PARAMETER);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHALTMITTEL_FSTR_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHALTMITTEL_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHLOSS);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHLOSSKOMBINATION);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHLUESSEL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHLUESSELSPERRE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SCHRANKENANTRIEB);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SIGNAL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SIGNAL_BEFESTIGUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SIGNAL_FANK_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SIGNAL_RAHMEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SIGNAL_SIGNALBEGRIFF);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_SONSTIGER_PUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_STELL_BEREICH);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_STELLELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_STRECKE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_STRECKE_BREMSWEG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_STRECKE_PUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TECHNIK_STANDORT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TECHNISCHER_BEREICH);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TECHNISCHER_PUNKT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TOP_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TOP_KNOTEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TRASSE_KANTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_TRASSE_KNOTEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_UEBERHOEHUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_UEBERHOEHUNGSLINIE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_UEBERTRAGUNGSWEG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_UNTERBRINGUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_VERKEHRSZEICHEN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_WKR_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_WKR_GSP_ELEMENT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_WKR_GSP_KOMPONENTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_WEICHENLAUFKETTE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_WEICHENLAUFKETTE_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZBS_SCHUTZSTRECKE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZBS_SIGNAL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_DLP_ABSCHNITT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_DLP_FSTR);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_FSTR);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_FSTR_ANSTOSS);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_SIGNALGRUPPE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZL_SIGNALGRUPPE_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZLV_BUS);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZLV_BUS_BESONDERE_ANLAGE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZLV_BUS_US_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_AKUSTIK);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_ANZEIGEFELD);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_FORTSCHALT_KRITERIUM);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_TELEGRAMM_84_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_TELEGRAMM_85_ZUORDNUNG);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_UNTERSTATION);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZN_ZBS);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZUB_BEREICHSGRENZE);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZUB_STRECKENEIGENSCHAFT);
		addEEnumLiteral(enumlstObjektArtEEnum, ENUMLSTObjektArt.ENUMLST_OBJEKT_ART_ZUGEINWIRKUNG);

		initEEnum(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.class, "ENUMObjektzustandBesonders");
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_AM_STANDORT_ANGESTEUERT_NICHT_GUELTIG);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_AM_STANDORT_ANGESTEUERT_UNGUELTIG_ABGEDECKT);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_AM_STANDORT_NICHT_ANGESTEUERT_UNGUELTIG);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_AM_STANDORT_NICHT_ANGESTEUERT_VORBEREITEND);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_SONSTIGE);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_STANDORTFERN_ANGESTEUERT_UNGUELTIG);
		addEEnumLiteral(enumObjektzustandBesondersEEnum, ENUMObjektzustandBesonders.ENUM_OBJEKTZUSTAND_BESONDERS_STANDORTFERN_NICHT_ANGESTEUERT_UNGUELTIG);

		initEEnum(enumRolleEEnum, ENUMRolle.class, "ENUMRolle");
		addEEnumLiteral(enumRolleEEnum, ENUMRolle.ENUM_ROLLE_GEO_PLANER);
		addEEnumLiteral(enumRolleEEnum, ENUMRolle.ENUM_ROLLE_GIS_DATEN);
		addEEnumLiteral(enumRolleEEnum, ENUMRolle.ENUM_ROLLE_LST_FACHPLANER);
		addEEnumLiteral(enumRolleEEnum, ENUMRolle.ENUM_ROLLE_SONSTIGE);

		// Initialize data types
		initEDataType(abstand_TypeEDataType, BigDecimal.class, "Abstand_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(begrenzung_A_TypeEDataType, BigDecimal.class, "Begrenzung_A_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(begrenzung_B_TypeEDataType, BigDecimal.class, "Begrenzung_B_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(beschreibung_TypeEDataType, String.class, "Beschreibung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bV_Kategorie_TypeEDataType, String.class, "BV_Kategorie_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dB_GDI_Referenz_TypeEDataType, String.class, "DB_GDI_Referenz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAnhangArtObjectEDataType, ENUMAnhangArt.class, "ENUMAnhangArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBestandsrelevanzObjectEDataType, ENUMBestandsrelevanz.class, "ENUMBestandsrelevanzObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumbvDarstellungInPlanObjectEDataType, ENUMBVDarstellungInPlan.class, "ENUMBVDarstellungInPlanObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumDateitypObjectEDataType, ENUMDateityp.class, "ENUMDateitypObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumlstObjektArtObjectEDataType, ENUMLSTObjektArt.class, "ENUMLSTObjektArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumObjektzustandBesondersObjectEDataType, ENUMObjektzustandBesonders.class, "ENUMObjektzustandBesondersObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumRolleObjectEDataType, ENUMRolle.class, "ENUMRolleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identitaet_TypeEDataType, String.class, "Identitaet_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kommentar_TypeEDataType, String.class, "Kommentar_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kurztext_TypeEDataType, String.class, "Kurztext_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lO_Ausgabestand_TypeEDataType, String.class, "LO_Ausgabestand_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lO_DB_Freigabe_TypeEDataType, String.class, "LO_DB_Freigabe_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lO_EMA_Nr_TypeEDataType, String.class, "LO_EMA_Nr_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lO_Firmensachnummer_TypeEDataType, String.class, "LO_Firmensachnummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lO_Seriennummer_TypeEDataType, String.class, "LO_Seriennummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(richtungsbezug_TypeEDataType, ENUMWirkrichtung.class, "Richtungsbezug_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seitliche_Lage_TypeEDataType, ENUMLinksRechts.class, "Seitliche_Lage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seitlicher_Abstand_TypeEDataType, BigDecimal.class, "Seitlicher_Abstand_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strecke_Km_TypeEDataType, String.class, "Strecke_Km_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(technischer_Platz_TypeEDataType, String.class, "Technischer_Platz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (anhangEClass,
		   source,
		   new String[] {
			   "documentation", "Erm\u00f6glicht die Aufnahme von Anhangsdokumenten in das Modell. Das Objekt Anhang erlaubt es, im PlanPro Datenmodell Informationen aus bestehenden Dateien vorzuhalten, die nicht durch ein eigenes Objekt im Modell abgebildet sind. Diese Informationen entsprechen den im bisherigen papiergebundenen Prozess beigef\u00fcgten Anlagen, eben den Anh\u00e4ngen. Die erlaubten Typen von Anh\u00e4ngen sind im Attribut \u201eAnhang Art\u201c definiert. Der Dateiname der Ursprungsdatei wird im Attribut \u201eDateiname\u201c ohne die Endung abgelegt. Die erlaubte Endung wird im Attribut \u201eDateityp\u201c definiert. Der eigentliche Inhalt der Ursprungsdatei wird im Attribut \u201eDaten\u201c als base64-codierte Bin\u00e4rdaten abgelegt. Ein Anhang wird im Datenmodell auf zwei Arten verwendet. Zum einen kann ein Anhang \u00fcber das Objekt Bearbeitungsvermerk mit jedem Objekt oder Attribut verbunden werden. Dies ist in der Beschreibung des Objekts Bearbeitungsvermerk n\u00e4her erl\u00e4utert. Spezielle Anh\u00e4nge, die direkt in einem Objekt bei der Planung enthalten sein m\u00fcssen, z.B. INA-Berechnung, werden direkt durch Attribute im jeweiligen Objekt definiert und so ohne den Umweg des Bearbeitungsvermerkes eingebunden."
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_AnhangArt(),
		   source,
		   new String[] {
			   "documentation", "Beinhaltet die Information \u00fcber den fachlichen Inhalt des Anhangs. Bei Auswahl von \\\"sonstige\\\" ist der Anhang im dazugeh\u00f6rigen Bearbeitungsvermerk zu erl\u00e4utern. Ggf. ist ein weiterer Bearbeitungsvermerk zur Kommentierung anzuf\u00fcgen. Das LST-Datenmodell enth\u00e4lt sowohl fachliche Anh\u00e4nge (zu LST-Fachdaten) sowie Anh\u00e4nge des Objektmanagements. Zu den Anh\u00e4ngen des Objektmanagements f\u00fcr eine Einzelplanung geh\u00f6ren: Abnahmeniederschrift Anh\u00e4nge zu einem LST Zustand Information BAST Best\u00e4tigung der Gleichstellung Best\u00e4tigung der Qualit\u00e4tspr\u00fcfung Best\u00e4tigung der \u00dcbernahme Erl\u00e4uterungsbericht Best\u00e4tigung der Freigabe des Bvb Best\u00e4tigung der Genehmigung des AG/Bh/Bhv besondere Materialisierung (v. a. projektbezogene Wiederverwendung von LST-Reststoffen) Planverzeichnis Planpr\u00fcfberichtbericht sonstige VzG "
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_Dateiname(),
		   source,
		   new String[] {
			   "documentation", "Urspr\u00fcnglicher Name der angeh\u00e4ngten Datei ohne Dateiformat bzw. -typ."
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_Dateityp(),
		   source,
		   new String[] {
			   "documentation", "Format des Anhangs. Nur die im ENUM dargestellten Dateiarten k\u00f6nnen einer Planung angehangen werden. Andere Dateiarten sind aus Gr\u00fcnden der Nachpr\u00fcfbarkeit und der Transparenz nicht zul\u00e4ssig. "
		   });
		addAnnotation
		  (basis_ObjektEClass,
		   source,
		   new String[] {
			   "documentation", "Allen Modell-Objekten zugrundeliegendes Objekt, welches gemeinsame Eigenschaften definiert. In den Basisobjekten werden grunds\u00e4tzliche Eigenschaften definiert, die allen Objekten gemein sind. Alle im Datenmodell definierten LST-Objekte erben diese Eigenschaften unmittelbar, wie z.B. die Regelzeichnung, oder mittelbar, z.B. \u00fcber das Punkt Objekt."
		   });
		addAnnotation
		  (getBasis_Objekt_IDBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "documentation", "Verweist auf einen oder mehrere Bearbeitungsvermerke. Ein Anhang wird \u00fcber einen Bearbeitungsvermerk zugeordnet. "
		   });
		addAnnotation
		  (getBasis_Objekt_IDOertlichkeitAusgabe(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Oertlichkeit (Betriebsstelle), der das Element zugeordnet wird. Die Angabe ist beispielsweise relevant f\u00fcr die Erzeugung der Ausgabeformate (Lagepl\u00e4ne, Tabellen)."
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das betroffene Objekt wurde Bestandsschutz festgelegt (true). Die Angabe entf\u00e4llt, wenn kein Bestandsschutz vorhanden ist."
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders(),
		   source,
		   new String[] {
			   "documentation", "Besonderer Zustand eines Objekts im Planungsbereich. Ist dieses Attribut nicht vorhanden, so ist das Objekt am geplanten/vorgesehenen Standort und angesteuert. \\\"Nicht g\u00fcltig\\\" sind gem\u00e4\u00df Betra als nicht g\u00fcltig erkl\u00e4rte Signale im Baugleis [gem. Ril 819.1701 (11)]. \\\"Ung\u00fcltig\\\" sind betrieblich au\u00dfer Betrieb befindliche Signale, die mit einem Ung\u00fcltigkeitskreuz [gem. Ril 819.1701 (10)] versehen sind. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Bisher keine eindeutige Abbildung, besonderer Objektzustand meist Fu\u00dfnoteneintrag in Planungsunterlagen."
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk(),
		   source,
		   new String[] {
			   "documentation", "Datum des letzten Planungsstandes eines Objekts, Hinweis auf den Regelwerksstand zum Planungszeitpunkt. Erg\u00e4nzende Beschreibung zum Umgang im PlanPro-Planungsprozess Anhand des Regelwerksstandes lassen sich die jeweils g\u00fcltigen St\u00e4nde der verwendeten Regelwerke herleiten (wichtig f\u00fcr Bestandsschutz). Abweichungen werden auf Objektebene (Basis Objekt) \u00fcber das Attribut ID Anhang Regelwerk Besonders beigef\u00fcgt. Im Rahmen der Erstellung einer Planung_Einzel werden alle neuen und ge\u00e4nderten Objekte standardm\u00e4\u00dfig mit dem zentral einzugebenden Wert des Attributs \u201eDatum Regelwerksstand\u201c der Planung_Einzel bef\u00fcllt. Durch die Bef\u00fcllung d\u00fcrfen bereits vorhandene Angaben \u201eID_Anhang_Regelwerk_Besonders\u201c nicht \u00fcberschrieben werden. Bei Abweichungen kann der LST-Fachplaner objekt- oder objektgruppenbezogen \u201eID_Anhang_Regelwerk_Besonders\u201c f\u00fcllen. DB-Regelwerk Bisher ohne eindeutige Abbildung im Schriftfeld gem\u00e4\u00df Ril 886.0102. "
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das Objekt abweichend geltendes Regelwerk. Verweis auf einen Anhang, aus dem der besondere Regelwerksstand eines LST-Objektes hervorgeht. Dieser gilt abweichend von dem f\u00fcr die Planung_Einzel festgelegten Datum Regelwerksstand. Erg\u00e4nzende Beschreibung zum Umgang im PlanPro-Planungsprozess Im Schriftfeld gem\u00e4\u00df Ril 886.0102 dient Feld 30 \\\"Zus\u00e4tzliche Vermerke\\\" \u00fcblicherweise zur Angabe von Regelwerksabweichungen. DB-Regelwerk Bisher eine eindeutige Abbildung als Schriftfeldeintrag gem\u00e4\u00df Ril 886.0102. Meist Angabe im Erl\u00e4uterungsbericht. "
		   });
		addAnnotation
		  (bearbeitungsvermerkEClass,
		   source,
		   new String[] {
			   "documentation", "Anhang in Form von Datei oder Text zu einem Objekt oder Attribut. Jeder zugelassene Projektbeteiligte kann zu einem Objekt oder Attribut einen Bearbeitungsvermerk anf\u00fcgen, sofern er die entsprechend notwendige Berechtigung besitzt. Dies gilt f\u00fcr fachliche wie organisatorische Objekte und Attribute. F\u00fcr ENUM-Attribute ist bei Auswahl des Werts \\\"sonstige\\\" zwingend ein Bearbeitungsvermerk anzuf\u00fcgen. Eine Dokumentenbeigabe ist dabei optional. Zu einem Objekt oder Attribut k\u00f6nnen mehrere Bearbeitungsvermerke erstellt werden. Der Bearbeitungsvermerk enth\u00e4lt vorl\u00e4ufig eine GUID zur Identifikation des Bearbeiters sowie eine GUID f\u00fcr die Signatur. Im Attribut \u201eBearbeitungsvermerk Rolle\u201c kann die fachliche Rolle des Bearbeiters abgelegt werden. Kommentare des Bearbeiters werden als Freitext im Attribut \u201eKommentar\u201c hinterlegt. Der Bearbeitungsvermerk kann einen Anhang aufnehmen. Um mehrere Anh\u00e4nge zu einem Objekt zuzuordnen, m\u00fcssen mehrere Bearbeitungsvermerke erstellt werden."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_IDAnhang(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den durch diesen Bearbeitungsvermerk referenzierten Anhang."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle(),
		   source,
		   new String[] {
			   "documentation", "Fachliche Rolle des Bearbeiters, der den Bearbeitungsvermerk verfasst hat. In der ersten Umsetzungsstufe PlanPro ist dabei nur die Rolle \\\"LST_Fachplaner\\\" (Ingenieurb\u00fcro) vorgesehen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. "
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz(),
		   source,
		   new String[] {
			   "documentation", "Relevanz eines Bearbeitungsvermerks f\u00fcr die \u00dcbernahme in den Bestand (Bestandsdaten bzw. Bestandspl\u00e4ne).\nnein - Nur g\u00fcltig innerhalb einer Planungsgruppe. Der BV ist vor Erstellen der Bestandsdaten einer Planungsgruppe zu l\u00f6schen.\nBestandsdaten - G\u00fcltig innerhalb eines Planungsprojekts bis vor Erstellen einer Bestandsdokumentation, d. h. der BV kann in den Bestandsdaten enthalten bleiben, ist jedoch vor Erstellen einer Bestandsdokumentation zu l\u00f6schen.\nBestandsdokumentation - G\u00fcltig innerhalb eines Planungsprojekts bis vor Erstellen der letzten Bestandsdokumentation, d. h. der BV kann \u00fcber mehrere Planungsgruppen hinaus enthalten bleiben, ist jedoch vor Projektabschluss zu l\u00f6schen.\ndauerhaft - G\u00fcltig \u00fcber das Gesamtprojekt hinaus auch nach Erstellen der letzten Bestandsdokumentation.\nDer BV ist dauerhaft relevant und kann erst mit einem neuen Planungsprojekt  ge\u00e4ndert/gel\u00f6scht werden."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan(),
		   source,
		   new String[] {
			   "documentation", "Angabe des Plans, in dem der Bearbeitungsvermerk dargestellt werden soll."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie(),
		   source,
		   new String[] {
			   "documentation", "Kategorisierung des Bearbeitungsvermerks zur Sortierung und Filterung (z. B. zur Ablage von Zusatzinformationen f\u00fcr besondere Anwendungsf\u00e4lle)"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar(),
		   source,
		   new String[] {
			   "documentation", "Kommentare des Bearbeiters als Freitext."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext(),
		   source,
		   new String[] {
			   "documentation", "Kurzform des Kommentars des Bearbeitungsvermerks f\u00fcr Anzeige bzw. Druck in den Ausgabeformaten."
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "documentation", "Zeitpunkt, zu dem der Bearbeitungsvermerk ge\u00e4ndert wurde."
		   });
		addAnnotation
		  (bereich_ObjektEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt, das einen Bereich \u00fcber eine oder mehrere Gleiskanten ganz oder teilweise umfasst. Ein Bereich Objekt repr\u00e4sentiert einen Bereich der Topologie, der sowohl zusammenh\u00e4ngend als auch nicht zusammenh\u00e4ngend sein kann. Ein Bereich Objekt wird \u00fcber ein oder mehrere Teilbereiche (Bereich_Objekt_Teilbereich) beschrieben, die jeweils einen Abschnitt auf einer topologischen Kante darstellen. Ein Teilbereich definiert sich \u00fcber die Referenz auf eine TOP Kante sowie den Abstand der beiden Teilbereichsgrenzen A und B zum Anfang der TOP Kante. Das Bereich Objekt kann in drei Arten eingeteilt werden: unverzweigt (z. B. Bahnsteig Kante, Fstr Fahrweg, BUE Gleisbezogener Gefahrraum) verzweigt (z. B. Gleis Schaltgruppe) verteilt (z. B. Gleis Baubereich) Unverzweigte und verzweigte Bereichsobjekte sind immer zusammenh\u00e4ngend. Verteilte Bereichsobjekte k\u00f6nnen in ihren Teilen verzweigt oder unverzweigt sein; hier gibt es keine Notwendigkeit der Unterscheidung. Zus\u00e4tzlich kann ein Bereich Objekt gerichtet sein. Dies wird durch die Ausrichtung der Teilbereiche in Bezug auf die jeweilige TOP Kante erreicht. Die Konsistenz der Richtung des Bereich Objekt wird nicht durch das Modell sichergestellt. Die Teilbereiche m\u00fcssen \u00fcberschneidungsfrei definiert sein. Es ist m\u00f6glich Teilbereiche der L\u00e4nge 0 anzugeben. Ist es f\u00fcr ein Objekt notwendig, direkt auf eine Bereichsgrenze zu verweisen, dann muss dieses Problem im jeweiligen Arbeitspaket gel\u00f6st werden, in dem in diesem Arbeitspaket ein eigenes Punktobjekt erzeugt wird. Der Teilbereich endet dann unmittelbar vor dem TOP_Knoten. Speziell bei Weichenanf\u00e4ngen auf die Weichenspitze gesehen endet der Teilbereich am TOP Anschluss A = Spitze oder TOP Anschluss B = Spitze. Die Weiche selbst ist nicht Bestandteil des Bereichsobjektes. In den Bereichsobjekten sind Objekte zusammengefasst, die eine Quer- und/oder L\u00e4ngsausdehnung haben k\u00f6nnen."
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA(),
		   source,
		   new String[] {
			   "documentation", "Abstand der Begrenzung A zum Anfang der TOP Kante. Die Begrenzung A darf nicht weiter als die Begrenzung B vom Anfang der TOP Kante entfernt sein. "
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB(),
		   source,
		   new String[] {
			   "documentation", "Abstand der Begrenzung B zum Anfang der TOP Kante. Die Begrenzung B ist gleich weit oder weiter als die Begrenzung A vom Anfang der TOP Kante entfernt. "
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis, auf welche TOP Kante sich der Teilbereich bezieht. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan "
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug(),
		   source,
		   new String[] {
			   "documentation", "Richtung des Teilbereichs bezogen auf die Topologierichtung der \u00fcber ID TOP Kante referenzierten Topologiekante. Zur vererbungsspezifischen Bef\u00fcllung siehe Modellierung Basisobjekte."
		   });
		addAnnotation
		  (lieferobjektEClass,
		   source,
		   new String[] {
			   "documentation", "Von der SBI geliefertes Objekt. Hier werden alle relevanten Daten des gelieferten Teils der LST-Anlage eingetragen. Das Lieferobjekt muss einen Bezug zu einem bestehenden bzw. geplanten LST-Objekt haben, das es n\u00e4her beschreibt."
		   });
		addAnnotation
		  (getLieferobjekt_Beschreibung(),
		   source,
		   new String[] {
			   "documentation", "Verbale Beschreibung des LO. \nDie Angabe soll als Beschreibung des Technischen Platzes in SAP R/3 Netz \u00fcbernommen werden.\nDie Bereitstellung der Bildungsvorschrift erfolgt gesondert."
		   });
		addAnnotation
		  (getLieferobjekt_IDGEOPunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen GEO_Punkt zur Topologie-unabh\u00e4ngigen Lokalisierung des Lieferobjekts. Eine Mehrfachangabe ist bei Verortung in unterschiedlichen Koordinatensystemen notwendig."
		   });
		addAnnotation
		  (getLieferobjekt_IDLOEinbau(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein geplantes oder existierendes Objekt bzw. mehrere Objekte, zu dem bzw. denen das LO logisch geh\u00f6rt. LO k\u00f6nnen auch hierarchisch gegliedert sein.\nF\u00fcr Ersatzteile ist der Ort der Lagerung anzugeben, d.h. in der Regel die Unterbringung direkt.\nDer Verweis ist prinzipiell auf alle Objekttypen m\u00f6glich einschlie\u00dflich des LO selbst f\u00fcr eine rekursive Darstellung der herstellerspezifischen Anlagenstruktur."
		   });
		addAnnotation
		  (getLieferobjekt_LOErsatz(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob es sich um eine Ersatzteil (true) oder ein eingebautes und genutztes Teil handelt (false)."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOAusgabestand(),
		   source,
		   new String[] {
			   "documentation", "Ausgabe- bzw. Ger\u00e4testand."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LODatumHerstellung(),
		   source,
		   new String[] {
			   "documentation", "Produktionszeitpunkt des LO."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LODBFreigabe(),
		   source,
		   new String[] {
			   "documentation", "Art der von der DB Netz AG erteilten Freigabe (Erprobung oder Serienfreigabe)."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOEMANr(),
		   source,
		   new String[] {
			   "documentation", "EMA-Nummer der DB (zur Nachbestellbarkeit des Ersatzeils \u00fcber die DB-internen Beschaffungswege).\nF\u00fcr LO ohne EMA-Nummer ist \\\"ohne EMA-Nummer\\\" anzugeben."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOFirmensachnummer(),
		   source,
		   new String[] {
			   "documentation", "Firmensachnummer."
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOSeriennummer(),
		   source,
		   new String[] {
			   "documentation", "Seriennummer des Bauteils. Falls keine existiert, ist \\\"ohne Seriennummer\\\" einzutragen."
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_DBGDIReferenz(),
		   source,
		   new String[] {
			   "documentation", "IPID-Kennung des Objektes im DB-GIS Systems. Das Attribut ist optional. Die Kennung ist eindeutig einem konkreten Objekt im DB-GDI zugeordnet. Das Attribut ist dann zu bef\u00fcllen, wenn Daten \u00fcber Objekte aus dem DB-GIS verarbeitet werden."
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_TechnischerPlatz(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des zugeh\u00f6rigen Technischen Platzes im SAP-System. Das Attribut ist optional und enth\u00e4lt die Bezeichnung des zugeh\u00f6rigen technischen Platzes im SAP-System. Die Kennung ist eindeutig einem konkreten Objekt im SAP zugeordnet. Mehrere PlanPro-Objekte k\u00f6nnen auf den gleichen technischen Platz verweisen. Das Attribut ist dann zu bef\u00fcllen, wenn Daten \u00fcber Objekte aus einem Fremdsystem der DB AG mit Verweis auf einen Technischen Platz verarbeitet werden oder im Rahmen der Bestandserstellung die technischen Pl\u00e4tze zugewiesen werden. Es ist noch gesondert festzulegen, f\u00fcr welche PlanPro-Objekte technische Pl\u00e4tze zugewiesen werden."
		   });
		addAnnotation
		  (proxy_ObjektEClass,
		   source,
		   new String[] {
			   "documentation", "Hilfsobjekt zur S\u00e4ttigung von Verweisen an der \u00e4u\u00dferen Grenze des Betrachtungsbereichs einer Einzelplanung. Die Validierung einer XML-Datei ist nur gesamthaft m\u00f6glich. Somit m\u00fcssen Planungs- und Betrachtungsbereich gleicherma\u00dfen valide sein. An der \u00e4u\u00dferen Grenze des Betrachtungsbereichs sind jedoch u. U. nicht mehr alle Zielobjekte von Verweisen vorhanden, da der Betrachtungsbereich nicht beliebig ausgeweitet werden kann und soll. Unter der Ma\u00dfgabe einer validen XML besteht jedoch ein Zwang zur S\u00e4ttigung von Verweisen. Das Proxy_Objekt schafft diesbez\u00fcglich eine L\u00f6sung f\u00fcr alle Objekte des LST-Datenmodells. In den Bestandsdaten der LST-Datenbank d\u00fcrfen keine Proxyobjekte vorhanden sein."
		   });
		addAnnotation
		  (getProxy_Objekt_LSTObjektArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Objekts, das durch das Proxyobjekt vertreten wird. Mit Ausnahme von Ur Objekt, Basis Objekt, Bereich Objekt, Punkt Objekt und dem Proxy Objekt selbst k\u00f6nnen alle Objekte des LST-Datenmodells ausgew\u00e4hlt werden."
		   });
		addAnnotation
		  (punkt_ObjektEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt der Au\u00dfenanlage, das bezogen auf seine Funktion keine Ausdehnung entlang der Gleise aufweist. Punktf\u00f6rmige Objekte sind diejenigen real vorhandenen Objekte, die mindestens einer TOP Kante mit je genau einem Punkt zugeordnet werden k\u00f6nnen. Durch die Verwendung der TOP Kante und des Abstands zum Knoten A der TOP Kante kann die physische Lage eines punktf\u00f6rmigen Objektes eindeutig beschrieben werden. Beispiele f\u00fcr punktf\u00f6rmige Objekte sind Signal, Signal Befestigung und W Kr Gsp Komponente. Durch die m\u00f6gliche Mehrfacheinbindung der Attributgruppe Punkt Objekt TOP Kante ist es m\u00f6glich, Punktobjekte mehreren TOP-Kanten zuzuordnen, z.B: Grenzzeichen (Zuordnung zu zwei TOP_Kanten), Signal zwischen Weichenanfang und Herzst\u00fcckspitze (Zuordnung zu zwei TOP_Kanten), Kreuzung als Kreuzungseite - Weichenkomponente (Zuordnung zu zwei sich schneidende oder am gleichen TOP-Knoten endende TOP-Kanten), Weichensignal (Zuordnung zu zwei (W), drei (EKW) oder vier (DKW) TOP_Kanten). Die Verortung des Punktobjekts erfolgt \u00fcber die Angabe einer TOP Kante und des Abstands zum Knoten A der Kante. Zus\u00e4tzlich kann f\u00fcr ein Punkt_Objekt eine Strecke und ein Streckenkilometer angegeben werden. Diese km-Angabe ist dabei nur nachrichtlich zu verstehen. "
		   });
		addAnnotation
		  (getPunkt_Objekt_PunktObjektStrecke(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Zuordnung eines Objektes zu einer Strecke. Zur vererbungsspezifischen Bef\u00fcllung der Attributgruppe siehe Modellierung Basisobjekte."
		   });
		addAnnotation
		  (getPunkt_Objekt_PunktObjektTOPKante(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Verortung eines Objektes an der Topologie. Die vererbungsspezifische Bef\u00fcllung der zugeh\u00f6rigen Attribute wird auf der Seite Modellierung Basisobjekte beschrieben. Durch die m\u00f6gliche Mehrfacheinbindung der Attributgruppe ist es m\u00f6glich, ein Objekt (z. B. Grenzzeichen) mehreren topologischen Kanten zuzuordnen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung eines Punktobjektes zu einer Streckennummer."
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend(),
		   source,
		   new String[] {
			   "documentation", "Kennzeichnung der ma\u00dfgebenden Kilometrierung (\\\"true\\\") bei Referenz zu mehreren Strecken."
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm(),
		   source,
		   new String[] {
			   "documentation", "Kilometer des Punktobjekts an der Strecke."
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand(),
		   source,
		   new String[] {
			   "documentation", "Abstand des Objekts vom Knoten A bezogen auf TOP_Kante in Metern. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen GEO_Punkt zur Angabe von berechneten Objekt-Koordinaten. Diese werden auf Basis der Soll-Gleislage und der im Punktobjekt vorgegebenen Abst\u00e4nde ermittelt und sind f\u00fcr Bau und Abnahme ma\u00dfgebend. Eine Mehrfachangabe ist bei Verortung in unterschiedlichen Koordinatensystemen notwendig."
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis, an welcher Kante das Objekt verortet ist. Eine n-fache Einbindung der Attributgruppe erfolgt zum Verweis, an welcher Kante das Objekt noch verortet sein kann (sogenanntes Doppelpunkt-Objekt). Notwendig z. B. f\u00fcr: Grenzzeichen, W_Kr_Gsp_Komponente, Signale im Zungenbereich von Weichen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan "
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung(),
		   source,
		   new String[] {
			   "documentation", "(Fahrt-)Richtung, in die ein verortetes Objekt wirkt. Die Angabe \\\"in\\\", \\\"gegen\\\" bzw. \\\"beide\\\" bezieht sich auf die Topologierichtung der TOP Kante. Weitere Erl\u00e4uterungen zu den verwendeten Richtungsbegriffen siehe Modellierung Richtung. Zur vererbungsspezifischen Bef\u00fcllung siehe Modellierung Basisobjekte. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob sich das Punkt Objekt bezogen auf die Topologierichtung links oder rechts von der TOP Kante bzw. Gleisachse befindet. Das Attribut wird verwendet, wenn keine Vorgabe des Abstands von der Gleisachse notwendig ist (z. B. bei Anbringung an der linken oder rechten Fahrschiene) und soll als Alternative zum seitlichen Abstand verwendet werden. Es kann die Werte links, rechts annehmen. Zur vererbungsspezifischen Bef\u00fcllung siehe Modellierung Basisobjekte."
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand(),
		   source,
		   new String[] {
			   "documentation", "Gibt den orthogonalen seitlichen Abstand eines Elementes zur Gleisachse bezogen auf die Topologierichtung A - B der TOP Kante an: Anordnung des Elementes in Topologierichtung rechts: seitlicher Abstand ist ein positiver Wert. Anordnung des Elementes in Topologierichtung links: seitlicher Abstand ist ein negativer Wert. Die Wirkrichtung des verorteten Elements bleibt bei der Ermittlung des seitlichen Abstands unber\u00fccksichtigt. Weitere Erl\u00e4uterungen zu den verwendeten Richtungsbegriffen siehe Modellierung Richtung. Im Datenmodell wird (teilweise abweichend von der bisherigen Praxis) der seitliche Abstand immer als Abstand Achse zu Achse (z. B. Gleisachse zu Achse des Signalfundaments bzw. Signalmastes) verstanden. Zur vererbungsspezifischen Bef\u00fcllung siehe Modellierung Basisobjekte. Besonderheiten: F\u00fcr Elemente, die an einer Fahrschiene angebracht sind (z.B. Entgleissungsschuhe, PZB-Magnete) ist das Attribut Seitliche Lage zu verwenden F\u00fcr Elemente, die in der Gleismitte angeordnet werden sollen (z. B. Gleis Abschluss) bzw. die keinen realen Abstand haben (z. B. NB_Zone_Grenze), ist der Wert 0.000 zu verwenden. Fiktive Signale erhalten keinen seitlichen Abstand. Punkt_Objekte, die mehreren TOP_Kanten zugeordnet sind, erhalten nur zur n\u00e4chstliegenden TOP_Kante einen seitlichen Abstand, wenn alle zugeordneten TOP_Kanten auf der selben Seite liegen (z. B. Weichensignal) bzw. nur zu der jeweils rechts und links n\u00e4chstliegenden TOP_Kante einen seitlichen Abstand, wenn das Punkt_Objekt zwischen den zugeordneten TOP-Kanten liegt (z. B. Grenzzeichen). DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (ur_ObjektEClass,
		   source,
		   new String[] {
			   "documentation", "Allen Objekten zugrundeliegender Objekttyp, durch die jede Instanz eines Objektes einen eindeutigen Identifikator in Form einer GUID erh\u00e4lt."
		   });
		addAnnotation
		  (getUr_Objekt_Identitaet(),
		   source,
		   new String[] {
			   "documentation", "Eindeutige Identifizierung des Objektes mit Hilfe der GUID. Bei Verlinkungen auf ein Objekt wird eine entsprechende Referenz angegeben. Verlinkungsattribute setzen sich aus dem Pr\u00e4fix \u201eID_\u201c und in der Regel dem entsprechenden Objektnamen zusammen (\u201eID_[Objekt]\u201c). Die Eindeutigkeit der Verlinkung ergibt sich aus der Spezifikation der GUID, siehe hierf\u00fcr RFC 4122: http://tools.ietf.org/html/rfc4122. Zu weiteren Vorgaben und Empfehlungen f\u00fcr die GUID-Erzeugung siehe Goldene Regeln Schnittstelle. "
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
		  (abstand_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAbstand",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (abstand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAbstand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAbstand_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anhangEClass,
		   source,
		   new String[] {
			   "name", "CAnhang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnhang_AnhangAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anhang_Allg"
		   });
		addAnnotation
		  (anhang_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CAnhang_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_AnhangArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anhang_Art"
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_Dateiname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dateiname"
		   });
		addAnnotation
		  (getAnhang_Allg_AttributeGroup_Dateityp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dateityp"
		   });
		addAnnotation
		  (anhang_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnhang_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnhang_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (basis_ObjektEClass,
		   source,
		   new String[] {
			   "name", "CBasis_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBasis_Objekt_BasisObjektAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Basis_Objekt_Allg"
		   });
		addAnnotation
		  (getBasis_Objekt_IDBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bearbeitungsvermerk"
		   });
		addAnnotation
		  (getBasis_Objekt_IDOertlichkeitAusgabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit_Ausgabe"
		   });
		addAnnotation
		  (getBasis_Objekt_Objektreferenzen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Objektreferenzen"
		   });
		addAnnotation
		  (basis_Objekt_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBasis_Objekt_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bestandsschutz"
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Objektzustand_Besonders"
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datum_Regelwerk"
		   });
		addAnnotation
		  (getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_Regelwerk_Besonders"
		   });
		addAnnotation
		  (bearbeitungsvermerkEClass,
		   source,
		   new String[] {
			   "name", "CBearbeitungsvermerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_BearbeitungsvermerkAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bearbeitungsvermerk_Allg"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_IDAnhang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang"
		   });
		addAnnotation
		  (bearbeitungsvermerk_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBearbeitungsvermerk_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bearbeitungsvermerk_Rolle"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bestandsrelevanz"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BV_Darstellung_In_Plan"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BV_Kategorie"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kommentar"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kurztext"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeit_Bearbeitungsvermerk"
		   });
		addAnnotation
		  (bearbeitungsvermerk_Rolle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBearbeitungsvermerk_Rolle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Rolle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (begrenzung_A_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBegrenzung_A",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (begrenzung_A_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBegrenzung_A",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBegrenzung_A_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (begrenzung_B_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBegrenzung_B",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(0|[1-9][0-9]{0,4})\\.[0-9]{3}"
		   });
		addAnnotation
		  (begrenzung_B_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBegrenzung_B",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBegrenzung_B_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bereich_ObjektEClass,
		   source,
		   new String[] {
			   "name", "CBereich_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBereich_Objekt_BereichObjektTeilbereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bereich_Objekt_Teilbereich"
		   });
		addAnnotation
		  (bereich_Objekt_Teilbereich_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBereich_Objekt_Teilbereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Begrenzung_A"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Begrenzung_B"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_TOP_Kante"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Richtungsbezug"
		   });
		addAnnotation
		  (beschreibung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBeschreibung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (beschreibung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBeschreibung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeschreibung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bestandsrelevanz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBestandsrelevanz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBestandsrelevanz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bestandsschutz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBestandsschutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBestandsschutz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bV_Darstellung_In_Plan_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBV_Darstellung_In_Plan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBV_Darstellung_In_Plan_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bV_Kategorie_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBV_Kategorie",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bV_Kategorie_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBV_Kategorie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBV_Kategorie_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dateiname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDateiname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDateiname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dateityp_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDateityp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDateityp_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (datum_Regelwerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDatum_Regelwerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatum_Regelwerk_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dB_GDI_Referenz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDB_GDI_Referenz",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (dB_GDI_Referenz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDB_GDI_Referenz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDB_GDI_Referenz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAnhangArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAnhang_Art"
		   });
		addAnnotation
		  (enumAnhangArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAnhang_Art:Object",
			   "baseType", "ENUMAnhang_Art"
		   });
		addAnnotation
		  (enumBestandsrelevanzEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBestandsrelevanz"
		   });
		addAnnotation
		  (enumBestandsrelevanzObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBestandsrelevanz:Object",
			   "baseType", "ENUMBestandsrelevanz"
		   });
		addAnnotation
		  (enumbvDarstellungInPlanEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBV_Darstellung_In_Plan"
		   });
		addAnnotation
		  (enumbvDarstellungInPlanObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBV_Darstellung_In_Plan:Object",
			   "baseType", "ENUMBV_Darstellung_In_Plan"
		   });
		addAnnotation
		  (enumDateitypEEnum,
		   source,
		   new String[] {
			   "name", "ENUMDateityp"
		   });
		addAnnotation
		  (enumDateitypObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMDateityp:Object",
			   "baseType", "ENUMDateityp"
		   });
		addAnnotation
		  (enumlstObjektArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLST_Objekt_Art"
		   });
		addAnnotation
		  (enumlstObjektArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLST_Objekt_Art:Object",
			   "baseType", "ENUMLST_Objekt_Art"
		   });
		addAnnotation
		  (enumObjektzustandBesondersEEnum,
		   source,
		   new String[] {
			   "name", "ENUMObjektzustand_Besonders"
		   });
		addAnnotation
		  (enumObjektzustandBesondersObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMObjektzustand_Besonders:Object",
			   "baseType", "ENUMObjektzustand_Besonders"
		   });
		addAnnotation
		  (enumRolleEEnum,
		   source,
		   new String[] {
			   "name", "ENUMRolle"
		   });
		addAnnotation
		  (enumRolleObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMRolle:Object",
			   "baseType", "ENUMRolle"
		   });
		addAnnotation
		  (identitaet_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIdentitaet",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID"
		   });
		addAnnotation
		  (identitaet_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIdentitaet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentitaet_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (km_Massgebend_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKm_Massgebend",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKm_Massgebend_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kommentar_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKommentar",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText"
		   });
		addAnnotation
		  (kommentar_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKommentar",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKommentar_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kurztext_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKurztext",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,100}"
		   });
		addAnnotation
		  (kurztext_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKurztext",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKurztext_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lieferobjektEClass,
		   source,
		   new String[] {
			   "name", "CLieferobjekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLieferobjekt_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beschreibung"
		   });
		addAnnotation
		  (getLieferobjekt_IDGEOPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Punkt"
		   });
		addAnnotation
		  (getLieferobjekt_IDLOEinbau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_LO_Einbau"
		   });
		addAnnotation
		  (getLieferobjekt_LOErsatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Ersatz"
		   });
		addAnnotation
		  (getLieferobjekt_LOMaterial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Material"
		   });
		addAnnotation
		  (lO_Ausgabestand_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLO_Ausgabestand",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (lO_Ausgabestand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_Ausgabestand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Ausgabestand_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_Datum_Herstellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_Datum_Herstellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Datum_Herstellung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_DB_Freigabe_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLO_DB_Freigabe",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (lO_DB_Freigabe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_DB_Freigabe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_DB_Freigabe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_EMA_Nr_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLO_EMA_Nr",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (lO_EMA_Nr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_EMA_Nr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_EMA_Nr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_Ersatz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_Ersatz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Ersatz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_Firmensachnummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLO_Firmensachnummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (lO_Firmensachnummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_Firmensachnummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Firmensachnummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lO_Material_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CLO_Material",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOAusgabestand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Ausgabestand"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LODatumHerstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Datum_Herstellung"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LODBFreigabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_DB_Freigabe"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOEMANr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_EMA_Nr"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOFirmensachnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Firmensachnummer"
		   });
		addAnnotation
		  (getLO_Material_AttributeGroup_LOSeriennummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LO_Seriennummer"
		   });
		addAnnotation
		  (lO_Seriennummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLO_Seriennummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (lO_Seriennummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLO_Seriennummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLO_Seriennummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lsT_Objekt_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLST_Objekt_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLST_Objekt_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (objektreferenzen_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CObjektreferenzen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_DBGDIReferenz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DB_GDI_Referenz"
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_TechnischerPlatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Technischer_Platz"
		   });
		addAnnotation
		  (objektzustand_Besonders_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCObjektzustand_Besonders",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getObjektzustand_Besonders_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (proxy_ObjektEClass,
		   source,
		   new String[] {
			   "name", "CProxy_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProxy_Objekt_LSTObjektArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LST_Objekt_Art"
		   });
		addAnnotation
		  (punkt_ObjektEClass,
		   source,
		   new String[] {
			   "name", "CPunkt_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPunkt_Objekt_PunktObjektStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Punkt_Objekt_Strecke"
		   });
		addAnnotation
		  (getPunkt_Objekt_PunktObjektTOPKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Punkt_Objekt_TOP_Kante"
		   });
		addAnnotation
		  (punkt_Objekt_Strecke_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPunkt_Objekt_Strecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Strecke"
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Km_Massgebend"
		   });
		addAnnotation
		  (getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strecke_Km"
		   });
		addAnnotation
		  (punkt_Objekt_TOP_Kante_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPunkt_Objekt_TOP_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstand"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Punkt_Berechnet"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_TOP_Kante"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wirkrichtung"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Seitliche_Lage"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Seitlicher_Abstand"
		   });
		addAnnotation
		  (richtungsbezug_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRichtungsbezug",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TWirkrichtung"
		   });
		addAnnotation
		  (richtungsbezug_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRichtungsbezug",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRichtungsbezug_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (seitliche_Lage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSeitliche_Lage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (seitliche_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSeitliche_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSeitliche_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (seitlicher_Abstand_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSeitlicher_Abstand",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(-?[1-9][0-9]{0,4}\\.[0-9]{3})|(-?0\\.[89][0-9]{2})|0.000"
		   });
		addAnnotation
		  (seitlicher_Abstand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSeitlicher_Abstand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSeitlicher_Abstand_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (strecke_Km_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TStrecke_Km",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TKilometrierung"
		   });
		addAnnotation
		  (strecke_Km_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStrecke_Km",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Km_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (technischer_Platz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTechnischer_Platz",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[A-Z0-9\\-]{30}"
		   });
		addAnnotation
		  (technischer_Platz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTechnischer_Platz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnischer_Platz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ur_ObjektEClass,
		   source,
		   new String[] {
			   "name", "CUr_Objekt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUr_Objekt_Identitaet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identitaet"
		   });
		addAnnotation
		  (wirkrichtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWirkrichtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWirkrichtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zeit_Bearbeitungsvermerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZeit_Bearbeitungsvermerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZeit_Bearbeitungsvermerk_TypeClass_Wert(),
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
		  (anhangEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO|Bedienung ETCS|Bedienung Fdl BZ|Bedienung Fdl ESTW-ZE|B\u00dc|ESTW|ETCS|Geo|sonstige|ZL|ZLV-Bus|ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (basis_ObjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (bearbeitungsvermerkEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO|Bedienung ETCS|Bedienung Fdl BZ|Bedienung Fdl ESTW-ZE|B\u00dc|ESTW|ETCS|Geo|sonstige|ZL|ZLV-Bus|ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..100]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (bereich_ObjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (lieferobjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO|Bedienung ETCS|Bedienung Fdl BZ|Bedienung Fdl ESTW-ZE|B\u00dc|ESTW|ETCS|Geo|sonstige|ZL|ZLV-Bus|ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_DBGDIReferenz(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getObjektreferenzen_AttributeGroup_TechnischerPlatz(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[30], nur Gro\u00dfbuchstaben, die Zahlen 0-9 und Bindestrich</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (proxy_ObjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO|Bedienung ETCS|Bedienung Fdl BZ|Bedienung Fdl ESTW-ZE|B\u00dc|ESTW|ETCS|Geo|sonstige|ZL|ZLV-Bus|ZN</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (punkt_ObjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\n                         \n    <ppi:Patternbeschreibung>[0.000..99999.999]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand(),
		   source,
		   new String[] {
			   "appinfo", "\n                       \n  <ppi:WorkflowInformation>\n                            \n    <ppi:Patternbeschreibung>[-99999.999 bis -0.800, 0.000, 0.800 bis 99999.999]</ppi:Patternbeschreibung>\n                         \n  </ppi:WorkflowInformation>\n                    \n"
		   });
		addAnnotation
		  (ur_ObjektEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
	}

} //BasisobjektePackageImpl
