/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung.impl;

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

import org.eclipse.set.model.model11001.Ortung.Bettungswiderstand_TypeClass;
import org.eclipse.set.model.model11001.Ortung.Bezeichnung_Kennbuchstabe_TypeClass;
import org.eclipse.set.model.model11001.Ortung.ENUMBezeichnungKennbuchstabe;
import org.eclipse.set.model.model11001.Ortung.ENUMFMAAnschlussSpeiserichtung;
import org.eclipse.set.model.model11001.Ortung.ENUMFMAArt;
import org.eclipse.set.model.model11001.Ortung.ENUMFMAElementArt;
import org.eclipse.set.model.model11001.Ortung.ENUMFMAElementSeilanzahl;
import org.eclipse.set.model.model11001.Ortung.ENUMFMAKomponenteArt;
import org.eclipse.set.model.model11001.Ortung.ENUMIsolierung;
import org.eclipse.set.model.model11001.Ortung.ENUMSchaltmittelFunktion;
import org.eclipse.set.model.model11001.Ortung.ENUMSchienenprofil;
import org.eclipse.set.model.model11001.Ortung.ENUMUebertragungFMinfoRichtung;
import org.eclipse.set.model.model11001.Ortung.ENUMZugeinwirkungArt;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Kaskade_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Bezeichnung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Anschluss_Speiserichtung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Art_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Element;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Anschluss_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Art_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Seilanzahl_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Element_Seiltyp_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Hilffreimeldung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Isolierung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Bezeichnung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Art_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Schienenprofil_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Stromversorgung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Typ_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_Beeinflusst_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E1_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E2_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_E3_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_S_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Ortung.FMA_Typ_TypeClass;
import org.eclipse.set.model.model11001.Ortung.OrtungFactory;
import org.eclipse.set.model.model11001.Ortung.OrtungPackage;
import org.eclipse.set.model.model11001.Ortung.Schaltmittel_Funktion_TypeClass;
import org.eclipse.set.model.model11001.Ortung.Schaltmittel_Zuordnung;
import org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Richtung_TypeClass;
import org.eclipse.set.model.model11001.Ortung.Uebertragung_FMinfo_Typ_TypeClass;
import org.eclipse.set.model.model11001.Ortung.Zugeinwirkung;
import org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Art_TypeClass;
import org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Typ_TypeClass;

import org.eclipse.set.model.model11001.Ortung.util.OrtungValidator;

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
public class OrtungPackageImpl extends EPackageImpl implements OrtungPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bettungswiderstand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Kennbuchstabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anlage_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anlage_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anlage_Kaskade_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anschluss_Bezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Anschluss_Speiserichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Element_Anschluss_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Element_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Element_Seilanzahl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Element_Seiltyp_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Hilffreimeldung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Isolierung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Kaskade_Bezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Kaskade_Einzelauswertung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_KomponenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Komponente_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Komponente_Schienenprofil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Komponente_Stromversorgung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Komponente_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_Beeinflusst_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_E1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_E2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_E3_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_S_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmA_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schaltmittel_Funktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schaltmittel_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uebertragung_FMinfo_Richtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uebertragung_FMinfo_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugeinwirkungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugeinwirkung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugeinwirkung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugeinwirkung_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBezeichnungKennbuchstabeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumfmaAnschlussSpeiserichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumfmaArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumfmaElementArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumfmaElementSeilanzahlEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumfmaKomponenteArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsolierungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchaltmittelFunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchienenprofilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUebertragungFMinfoRichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumZugeinwirkungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bettungswiderstand_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBezeichnungKennbuchstabeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumfmaAnschlussSpeiserichtungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumfmaArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumfmaElementArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumfmaElementSeilanzahlObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumfmaKomponenteArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumIsolierungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchaltmittelFunktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchienenprofilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUebertragungFMinfoRichtungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumZugeinwirkungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Anschluss_Bezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Element_Seiltyp_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Kaskade_Bezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Komponente_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_Beeinflusst_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_E1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_E2_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_E3_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_S_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmA_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uebertragung_FMinfo_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zugeinwirkung_Typ_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrtungPackageImpl() {
		super(eNS_URI, OrtungFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrtungPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrtungPackage init() {
		if (isInited) return (OrtungPackage)EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrtungPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OrtungPackageImpl theOrtungPackage = registeredOrtungPackage instanceof OrtungPackageImpl ? (OrtungPackageImpl)registeredOrtungPackage : new OrtungPackageImpl();

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
		theOrtungPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
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
		theOrtungPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
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
			(theOrtungPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OrtungValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOrtungPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrtungPackage.eNS_URI, theOrtungPackage);
		return theOrtungPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBettungswiderstand_TypeClass() {
		return bettungswiderstand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBettungswiderstand_TypeClass_Wert() {
		return (EAttribute)bettungswiderstand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Kennbuchstabe_TypeClass() {
		return bezeichnung_Kennbuchstabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Kennbuchstabe_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Kennbuchstabe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage() {
		return fmA_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Bezeichnung() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_FMAAnlageAllg() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_FMAAnlageElektrMerkmale() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_FMAAnlageKaskade() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_FMAAnlageUebertragungFMinfo() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_IDGleisAbschnitt() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_IDGleisfreimeldeInnenanlage() {
		return (EReference)fmA_AnlageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage_Allg_AttributeGroup() {
		return fmA_Anlage_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Allg_AttributeGroup_FMAArt() {
		return (EReference)fmA_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung() {
		return (EReference)fmA_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung() {
		return (EReference)fmA_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Allg_AttributeGroup_FMATyp() {
		return (EReference)fmA_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage_Bezeichnung_AttributeGroup() {
		return fmA_Anlage_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe() {
		return (EReference)fmA_Anlage_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage_Elektr_Merkmale_AttributeGroup() {
		return fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS() {
		return (EReference)fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage_Kaskade_AttributeGroup() {
		return fmA_Anlage_Kaskade_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung() {
		return (EReference)fmA_Anlage_Kaskade_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung() {
		return (EReference)fmA_Anlage_Kaskade_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup() {
		return fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo() {
		return (EReference)fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung() {
		return (EReference)fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp() {
		return (EReference)fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anschluss_Bezeichnung_TypeClass() {
		return fmA_Anschluss_Bezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Anschluss_Bezeichnung_TypeClass_Wert() {
		return (EAttribute)fmA_Anschluss_Bezeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Anschluss_Speiserichtung_TypeClass() {
		return fmA_Anschluss_Speiserichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Anschluss_Speiserichtung_TypeClass_Wert() {
		return (EAttribute)fmA_Anschluss_Speiserichtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Art_TypeClass() {
		return fmA_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Art_TypeClass_Wert() {
		return (EAttribute)fmA_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element() {
		return fmA_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_FMAElementAllg() {
		return (EReference)fmA_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_FMAElementAnschluss() {
		return (EReference)fmA_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_IDFMAAnlage() {
		return (EReference)fmA_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element_Allg_AttributeGroup() {
		return fmA_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_Allg_AttributeGroup_FMAElementArt() {
		return (EReference)fmA_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl() {
		return (EReference)fmA_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp() {
		return (EReference)fmA_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element_Anschluss_AttributeGroup() {
		return fmA_Element_Anschluss_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung() {
		return (EReference)fmA_Element_Anschluss_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung() {
		return (EReference)fmA_Element_Anschluss_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element_Art_TypeClass() {
		return fmA_Element_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Element_Art_TypeClass_Wert() {
		return (EAttribute)fmA_Element_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element_Seilanzahl_TypeClass() {
		return fmA_Element_Seilanzahl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Element_Seilanzahl_TypeClass_Wert() {
		return (EAttribute)fmA_Element_Seilanzahl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Element_Seiltyp_TypeClass() {
		return fmA_Element_Seiltyp_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Element_Seiltyp_TypeClass_Wert() {
		return (EAttribute)fmA_Element_Seiltyp_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Hilffreimeldung_TypeClass() {
		return fmA_Hilffreimeldung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Hilffreimeldung_TypeClass_Wert() {
		return (EAttribute)fmA_Hilffreimeldung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Isolierung_TypeClass() {
		return fmA_Isolierung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Isolierung_TypeClass_Wert() {
		return (EAttribute)fmA_Isolierung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Kaskade_Bezeichnung_TypeClass() {
		return fmA_Kaskade_Bezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Kaskade_Bezeichnung_TypeClass_Wert() {
		return (EAttribute)fmA_Kaskade_Bezeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Kaskade_Einzelauswertung_TypeClass() {
		return fmA_Kaskade_Einzelauswertung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Kaskade_Einzelauswertung_TypeClass_Wert() {
		return (EAttribute)fmA_Kaskade_Einzelauswertung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente() {
		return fmA_KomponenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Bezeichnung() {
		return (EReference)fmA_KomponenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_IDBezugspunkt() {
		return (EReference)fmA_KomponenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_IDFMAgrenze() {
		return (EReference)fmA_KomponenteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_FMAKomponenteAchszaehlpunkt() {
		return (EReference)fmA_KomponenteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_FMAKomponenteArt() {
		return (EReference)fmA_KomponenteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente_Achszaehlpunkt_AttributeGroup() {
		return fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil() {
		return (EReference)fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung() {
		return (EReference)fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp() {
		return (EReference)fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie() {
		return (EReference)fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation() {
		return (EReference)fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente_Art_TypeClass() {
		return fmA_Komponente_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Komponente_Art_TypeClass_Wert() {
		return (EAttribute)fmA_Komponente_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente_Schienenprofil_TypeClass() {
		return fmA_Komponente_Schienenprofil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Komponente_Schienenprofil_TypeClass_Wert() {
		return (EAttribute)fmA_Komponente_Schienenprofil_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente_Stromversorgung_TypeClass() {
		return fmA_Komponente_Stromversorgung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Komponente_Stromversorgung_TypeClass_Wert() {
		return (EAttribute)fmA_Komponente_Stromversorgung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Komponente_Typ_TypeClass() {
		return fmA_Komponente_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Komponente_Typ_TypeClass_Wert() {
		return (EAttribute)fmA_Komponente_Typ_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_Beeinflusst_TypeClass() {
		return fmA_Laenge_Beeinflusst_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_Beeinflusst_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_Beeinflusst_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_E1_TypeClass() {
		return fmA_Laenge_E1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_E1_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_E1_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_E2_TypeClass() {
		return fmA_Laenge_E2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_E2_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_E2_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_E3_TypeClass() {
		return fmA_Laenge_E3_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_E3_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_E3_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_S_TypeClass() {
		return fmA_Laenge_S_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_S_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_S_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Laenge_TypeClass() {
		return fmA_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Laenge_TypeClass_Wert() {
		return (EAttribute)fmA_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMA_Typ_TypeClass() {
		return fmA_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMA_Typ_TypeClass_Wert() {
		return (EAttribute)fmA_Typ_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchaltmittel_Funktion_TypeClass() {
		return schaltmittel_Funktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchaltmittel_Funktion_TypeClass_Wert() {
		return (EAttribute)schaltmittel_Funktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchaltmittel_Zuordnung() {
		return schaltmittel_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchaltmittel_Zuordnung_IDAnforderung() {
		return (EReference)schaltmittel_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchaltmittel_Zuordnung_IDSchalter() {
		return (EReference)schaltmittel_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchaltmittel_Zuordnung_SchaltmittelFunktion() {
		return (EReference)schaltmittel_ZuordnungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUebertragung_FMinfo_Richtung_TypeClass() {
		return uebertragung_FMinfo_Richtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUebertragung_FMinfo_Richtung_TypeClass_Wert() {
		return (EAttribute)uebertragung_FMinfo_Richtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUebertragung_FMinfo_Typ_TypeClass() {
		return uebertragung_FMinfo_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUebertragung_FMinfo_Typ_TypeClass_Wert() {
		return (EAttribute)uebertragung_FMinfo_Typ_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugeinwirkung() {
		return zugeinwirkungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZugeinwirkung_Bezeichnung() {
		return (EReference)zugeinwirkungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZugeinwirkung_IDBezugspunkt() {
		return (EReference)zugeinwirkungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZugeinwirkung_ZugeinwirkungAllg() {
		return (EReference)zugeinwirkungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugeinwirkung_Allg_AttributeGroup() {
		return zugeinwirkung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt() {
		return (EReference)zugeinwirkung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp() {
		return (EReference)zugeinwirkung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugeinwirkung_Art_TypeClass() {
		return zugeinwirkung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZugeinwirkung_Art_TypeClass_Wert() {
		return (EAttribute)zugeinwirkung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugeinwirkung_Typ_TypeClass() {
		return zugeinwirkung_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZugeinwirkung_Typ_TypeClass_Wert() {
		return (EAttribute)zugeinwirkung_Typ_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBezeichnungKennbuchstabe() {
		return enumBezeichnungKennbuchstabeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFMAAnschlussSpeiserichtung() {
		return enumfmaAnschlussSpeiserichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFMAArt() {
		return enumfmaArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFMAElementArt() {
		return enumfmaElementArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFMAElementSeilanzahl() {
		return enumfmaElementSeilanzahlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFMAKomponenteArt() {
		return enumfmaKomponenteArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMIsolierung() {
		return enumIsolierungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchaltmittelFunktion() {
		return enumSchaltmittelFunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchienenprofil() {
		return enumSchienenprofilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUebertragungFMinfoRichtung() {
		return enumUebertragungFMinfoRichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZugeinwirkungArt() {
		return enumZugeinwirkungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBettungswiderstand_Type() {
		return bettungswiderstand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBezeichnungKennbuchstabeObject() {
		return enumBezeichnungKennbuchstabeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFMAAnschlussSpeiserichtungObject() {
		return enumfmaAnschlussSpeiserichtungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFMAArtObject() {
		return enumfmaArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFMAElementArtObject() {
		return enumfmaElementArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFMAElementSeilanzahlObject() {
		return enumfmaElementSeilanzahlObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFMAKomponenteArtObject() {
		return enumfmaKomponenteArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMIsolierungObject() {
		return enumIsolierungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchaltmittelFunktionObject() {
		return enumSchaltmittelFunktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchienenprofilObject() {
		return enumSchienenprofilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUebertragungFMinfoRichtungObject() {
		return enumUebertragungFMinfoRichtungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZugeinwirkungArtObject() {
		return enumZugeinwirkungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Anschluss_Bezeichnung_Type() {
		return fmA_Anschluss_Bezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Element_Seiltyp_Type() {
		return fmA_Element_Seiltyp_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Kaskade_Bezeichnung_Type() {
		return fmA_Kaskade_Bezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Komponente_Typ_Type() {
		return fmA_Komponente_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_Beeinflusst_Type() {
		return fmA_Laenge_Beeinflusst_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_E1_Type() {
		return fmA_Laenge_E1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_E2_Type() {
		return fmA_Laenge_E2_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_E3_Type() {
		return fmA_Laenge_E3_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_S_Type() {
		return fmA_Laenge_S_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Laenge_Type() {
		return fmA_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFMA_Typ_Type() {
		return fmA_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUebertragung_FMinfo_Typ_Type() {
		return uebertragung_FMinfo_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZugeinwirkung_Typ_Type() {
		return zugeinwirkung_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrtungFactory getOrtungFactory() {
		return (OrtungFactory)getEFactoryInstance();
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
		bettungswiderstand_TypeClassEClass = createEClass(BETTUNGSWIDERSTAND_TYPE_CLASS);
		createEAttribute(bettungswiderstand_TypeClassEClass, BETTUNGSWIDERSTAND_TYPE_CLASS__WERT);

		bezeichnung_Kennbuchstabe_TypeClassEClass = createEClass(BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS);
		createEAttribute(bezeichnung_Kennbuchstabe_TypeClassEClass, BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS__WERT);

		fmA_AnlageEClass = createEClass(FMA_ANLAGE);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__BEZEICHNUNG);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__FMA_ANLAGE_ALLG);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__FMA_ANLAGE_ELEKTR_MERKMALE);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__FMA_ANLAGE_KASKADE);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__FMA_ANLAGE_UEBERTRAGUNG_FMINFO);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__ID_GLEIS_ABSCHNITT);
		createEReference(fmA_AnlageEClass, FMA_ANLAGE__ID_GLEISFREIMELDE_INNENANLAGE);

		fmA_Anlage_Allg_AttributeGroupEClass = createEClass(FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP);
		createEReference(fmA_Anlage_Allg_AttributeGroupEClass, FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ART);
		createEReference(fmA_Anlage_Allg_AttributeGroupEClass, FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_HILFFREIMELDUNG);
		createEReference(fmA_Anlage_Allg_AttributeGroupEClass, FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_ISOLIERUNG);
		createEReference(fmA_Anlage_Allg_AttributeGroupEClass, FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP__FMA_TYP);

		fmA_Anlage_Bezeichnung_AttributeGroupEClass = createEClass(FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(fmA_Anlage_Bezeichnung_AttributeGroupEClass, FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE);

		fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass = createEClass(FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__BETTUNGSWIDERSTAND);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_BEEINFLUSST);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E1);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E2);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_E3);
		createEReference(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP__FMA_LAENGE_S);

		fmA_Anlage_Kaskade_AttributeGroupEClass = createEClass(FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP);
		createEReference(fmA_Anlage_Kaskade_AttributeGroupEClass, FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG);
		createEReference(fmA_Anlage_Kaskade_AttributeGroupEClass, FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG);

		fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass = createEClass(FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP);
		createEReference(fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass, FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO);
		createEReference(fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass, FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG);
		createEReference(fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass, FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP);

		fmA_Anschluss_Bezeichnung_TypeClassEClass = createEClass(FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS);
		createEAttribute(fmA_Anschluss_Bezeichnung_TypeClassEClass, FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS__WERT);

		fmA_Anschluss_Speiserichtung_TypeClassEClass = createEClass(FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS);
		createEAttribute(fmA_Anschluss_Speiserichtung_TypeClassEClass, FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS__WERT);

		fmA_Art_TypeClassEClass = createEClass(FMA_ART_TYPE_CLASS);
		createEAttribute(fmA_Art_TypeClassEClass, FMA_ART_TYPE_CLASS__WERT);

		fmA_ElementEClass = createEClass(FMA_ELEMENT);
		createEReference(fmA_ElementEClass, FMA_ELEMENT__FMA_ELEMENT_ALLG);
		createEReference(fmA_ElementEClass, FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS);
		createEReference(fmA_ElementEClass, FMA_ELEMENT__IDFMA_ANLAGE);

		fmA_Element_Allg_AttributeGroupEClass = createEClass(FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP);
		createEReference(fmA_Element_Allg_AttributeGroupEClass, FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART);
		createEReference(fmA_Element_Allg_AttributeGroupEClass, FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL);
		createEReference(fmA_Element_Allg_AttributeGroupEClass, FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP);

		fmA_Element_Anschluss_AttributeGroupEClass = createEClass(FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP);
		createEReference(fmA_Element_Anschluss_AttributeGroupEClass, FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG);
		createEReference(fmA_Element_Anschluss_AttributeGroupEClass, FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG);

		fmA_Element_Art_TypeClassEClass = createEClass(FMA_ELEMENT_ART_TYPE_CLASS);
		createEAttribute(fmA_Element_Art_TypeClassEClass, FMA_ELEMENT_ART_TYPE_CLASS__WERT);

		fmA_Element_Seilanzahl_TypeClassEClass = createEClass(FMA_ELEMENT_SEILANZAHL_TYPE_CLASS);
		createEAttribute(fmA_Element_Seilanzahl_TypeClassEClass, FMA_ELEMENT_SEILANZAHL_TYPE_CLASS__WERT);

		fmA_Element_Seiltyp_TypeClassEClass = createEClass(FMA_ELEMENT_SEILTYP_TYPE_CLASS);
		createEAttribute(fmA_Element_Seiltyp_TypeClassEClass, FMA_ELEMENT_SEILTYP_TYPE_CLASS__WERT);

		fmA_Hilffreimeldung_TypeClassEClass = createEClass(FMA_HILFFREIMELDUNG_TYPE_CLASS);
		createEAttribute(fmA_Hilffreimeldung_TypeClassEClass, FMA_HILFFREIMELDUNG_TYPE_CLASS__WERT);

		fmA_Isolierung_TypeClassEClass = createEClass(FMA_ISOLIERUNG_TYPE_CLASS);
		createEAttribute(fmA_Isolierung_TypeClassEClass, FMA_ISOLIERUNG_TYPE_CLASS__WERT);

		fmA_Kaskade_Bezeichnung_TypeClassEClass = createEClass(FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS);
		createEAttribute(fmA_Kaskade_Bezeichnung_TypeClassEClass, FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS__WERT);

		fmA_Kaskade_Einzelauswertung_TypeClassEClass = createEClass(FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS);
		createEAttribute(fmA_Kaskade_Einzelauswertung_TypeClassEClass, FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS__WERT);

		fmA_KomponenteEClass = createEClass(FMA_KOMPONENTE);
		createEReference(fmA_KomponenteEClass, FMA_KOMPONENTE__BEZEICHNUNG);
		createEReference(fmA_KomponenteEClass, FMA_KOMPONENTE__ID_BEZUGSPUNKT);
		createEReference(fmA_KomponenteEClass, FMA_KOMPONENTE__IDFM_AGRENZE);
		createEReference(fmA_KomponenteEClass, FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT);
		createEReference(fmA_KomponenteEClass, FMA_KOMPONENTE__FMA_KOMPONENTE_ART);

		fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass = createEClass(FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP);
		createEReference(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL);
		createEReference(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG);
		createEReference(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP);
		createEReference(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE);
		createEReference(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION);

		fmA_Komponente_Art_TypeClassEClass = createEClass(FMA_KOMPONENTE_ART_TYPE_CLASS);
		createEAttribute(fmA_Komponente_Art_TypeClassEClass, FMA_KOMPONENTE_ART_TYPE_CLASS__WERT);

		fmA_Komponente_Schienenprofil_TypeClassEClass = createEClass(FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS);
		createEAttribute(fmA_Komponente_Schienenprofil_TypeClassEClass, FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS__WERT);

		fmA_Komponente_Stromversorgung_TypeClassEClass = createEClass(FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS);
		createEAttribute(fmA_Komponente_Stromversorgung_TypeClassEClass, FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS__WERT);

		fmA_Komponente_Typ_TypeClassEClass = createEClass(FMA_KOMPONENTE_TYP_TYPE_CLASS);
		createEAttribute(fmA_Komponente_Typ_TypeClassEClass, FMA_KOMPONENTE_TYP_TYPE_CLASS__WERT);

		fmA_Laenge_Beeinflusst_TypeClassEClass = createEClass(FMA_LAENGE_BEEINFLUSST_TYPE_CLASS);
		createEAttribute(fmA_Laenge_Beeinflusst_TypeClassEClass, FMA_LAENGE_BEEINFLUSST_TYPE_CLASS__WERT);

		fmA_Laenge_E1_TypeClassEClass = createEClass(FMA_LAENGE_E1_TYPE_CLASS);
		createEAttribute(fmA_Laenge_E1_TypeClassEClass, FMA_LAENGE_E1_TYPE_CLASS__WERT);

		fmA_Laenge_E2_TypeClassEClass = createEClass(FMA_LAENGE_E2_TYPE_CLASS);
		createEAttribute(fmA_Laenge_E2_TypeClassEClass, FMA_LAENGE_E2_TYPE_CLASS__WERT);

		fmA_Laenge_E3_TypeClassEClass = createEClass(FMA_LAENGE_E3_TYPE_CLASS);
		createEAttribute(fmA_Laenge_E3_TypeClassEClass, FMA_LAENGE_E3_TYPE_CLASS__WERT);

		fmA_Laenge_S_TypeClassEClass = createEClass(FMA_LAENGE_STYPE_CLASS);
		createEAttribute(fmA_Laenge_S_TypeClassEClass, FMA_LAENGE_STYPE_CLASS__WERT);

		fmA_Laenge_TypeClassEClass = createEClass(FMA_LAENGE_TYPE_CLASS);
		createEAttribute(fmA_Laenge_TypeClassEClass, FMA_LAENGE_TYPE_CLASS__WERT);

		fmA_Typ_TypeClassEClass = createEClass(FMA_TYP_TYPE_CLASS);
		createEAttribute(fmA_Typ_TypeClassEClass, FMA_TYP_TYPE_CLASS__WERT);

		schaltmittel_Funktion_TypeClassEClass = createEClass(SCHALTMITTEL_FUNKTION_TYPE_CLASS);
		createEAttribute(schaltmittel_Funktion_TypeClassEClass, SCHALTMITTEL_FUNKTION_TYPE_CLASS__WERT);

		schaltmittel_ZuordnungEClass = createEClass(SCHALTMITTEL_ZUORDNUNG);
		createEReference(schaltmittel_ZuordnungEClass, SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG);
		createEReference(schaltmittel_ZuordnungEClass, SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER);
		createEReference(schaltmittel_ZuordnungEClass, SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION);

		uebertragung_FMinfo_Richtung_TypeClassEClass = createEClass(UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS);
		createEAttribute(uebertragung_FMinfo_Richtung_TypeClassEClass, UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS__WERT);

		uebertragung_FMinfo_Typ_TypeClassEClass = createEClass(UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS);
		createEAttribute(uebertragung_FMinfo_Typ_TypeClassEClass, UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS__WERT);

		zugeinwirkungEClass = createEClass(ZUGEINWIRKUNG);
		createEReference(zugeinwirkungEClass, ZUGEINWIRKUNG__BEZEICHNUNG);
		createEReference(zugeinwirkungEClass, ZUGEINWIRKUNG__ID_BEZUGSPUNKT);
		createEReference(zugeinwirkungEClass, ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG);

		zugeinwirkung_Allg_AttributeGroupEClass = createEClass(ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(zugeinwirkung_Allg_AttributeGroupEClass, ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART);
		createEReference(zugeinwirkung_Allg_AttributeGroupEClass, ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP);

		zugeinwirkung_Art_TypeClassEClass = createEClass(ZUGEINWIRKUNG_ART_TYPE_CLASS);
		createEAttribute(zugeinwirkung_Art_TypeClassEClass, ZUGEINWIRKUNG_ART_TYPE_CLASS__WERT);

		zugeinwirkung_Typ_TypeClassEClass = createEClass(ZUGEINWIRKUNG_TYP_TYPE_CLASS);
		createEAttribute(zugeinwirkung_Typ_TypeClassEClass, ZUGEINWIRKUNG_TYP_TYPE_CLASS__WERT);

		// Create enums
		enumBezeichnungKennbuchstabeEEnum = createEEnum(ENUM_BEZEICHNUNG_KENNBUCHSTABE);
		enumfmaAnschlussSpeiserichtungEEnum = createEEnum(ENUMFMA_ANSCHLUSS_SPEISERICHTUNG);
		enumfmaArtEEnum = createEEnum(ENUMFMA_ART);
		enumfmaElementArtEEnum = createEEnum(ENUMFMA_ELEMENT_ART);
		enumfmaElementSeilanzahlEEnum = createEEnum(ENUMFMA_ELEMENT_SEILANZAHL);
		enumfmaKomponenteArtEEnum = createEEnum(ENUMFMA_KOMPONENTE_ART);
		enumIsolierungEEnum = createEEnum(ENUM_ISOLIERUNG);
		enumSchaltmittelFunktionEEnum = createEEnum(ENUM_SCHALTMITTEL_FUNKTION);
		enumSchienenprofilEEnum = createEEnum(ENUM_SCHIENENPROFIL);
		enumUebertragungFMinfoRichtungEEnum = createEEnum(ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG);
		enumZugeinwirkungArtEEnum = createEEnum(ENUM_ZUGEINWIRKUNG_ART);

		// Create data types
		bettungswiderstand_TypeEDataType = createEDataType(BETTUNGSWIDERSTAND_TYPE);
		enumBezeichnungKennbuchstabeObjectEDataType = createEDataType(ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT);
		enumfmaAnschlussSpeiserichtungObjectEDataType = createEDataType(ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT);
		enumfmaArtObjectEDataType = createEDataType(ENUMFMA_ART_OBJECT);
		enumfmaElementArtObjectEDataType = createEDataType(ENUMFMA_ELEMENT_ART_OBJECT);
		enumfmaElementSeilanzahlObjectEDataType = createEDataType(ENUMFMA_ELEMENT_SEILANZAHL_OBJECT);
		enumfmaKomponenteArtObjectEDataType = createEDataType(ENUMFMA_KOMPONENTE_ART_OBJECT);
		enumIsolierungObjectEDataType = createEDataType(ENUM_ISOLIERUNG_OBJECT);
		enumSchaltmittelFunktionObjectEDataType = createEDataType(ENUM_SCHALTMITTEL_FUNKTION_OBJECT);
		enumSchienenprofilObjectEDataType = createEDataType(ENUM_SCHIENENPROFIL_OBJECT);
		enumUebertragungFMinfoRichtungObjectEDataType = createEDataType(ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT);
		enumZugeinwirkungArtObjectEDataType = createEDataType(ENUM_ZUGEINWIRKUNG_ART_OBJECT);
		fmA_Anschluss_Bezeichnung_TypeEDataType = createEDataType(FMA_ANSCHLUSS_BEZEICHNUNG_TYPE);
		fmA_Element_Seiltyp_TypeEDataType = createEDataType(FMA_ELEMENT_SEILTYP_TYPE);
		fmA_Kaskade_Bezeichnung_TypeEDataType = createEDataType(FMA_KASKADE_BEZEICHNUNG_TYPE);
		fmA_Komponente_Typ_TypeEDataType = createEDataType(FMA_KOMPONENTE_TYP_TYPE);
		fmA_Laenge_Beeinflusst_TypeEDataType = createEDataType(FMA_LAENGE_BEEINFLUSST_TYPE);
		fmA_Laenge_E1_TypeEDataType = createEDataType(FMA_LAENGE_E1_TYPE);
		fmA_Laenge_E2_TypeEDataType = createEDataType(FMA_LAENGE_E2_TYPE);
		fmA_Laenge_E3_TypeEDataType = createEDataType(FMA_LAENGE_E3_TYPE);
		fmA_Laenge_S_TypeEDataType = createEDataType(FMA_LAENGE_STYPE);
		fmA_Laenge_TypeEDataType = createEDataType(FMA_LAENGE_TYPE);
		fmA_Typ_TypeEDataType = createEDataType(FMA_TYP_TYPE);
		uebertragung_FMinfo_Typ_TypeEDataType = createEDataType(UEBERTRAGUNG_FMINFO_TYP_TYPE);
		zugeinwirkung_Typ_TypeEDataType = createEDataType(ZUGEINWIRKUNG_TYP_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bettungswiderstand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Kennbuchstabe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_AnlageEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fmA_Anschluss_Bezeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Anschluss_Speiserichtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		fmA_Element_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Element_Seilanzahl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Element_Seiltyp_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Hilffreimeldung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Isolierung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Kaskade_Bezeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Kaskade_Einzelauswertung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_KomponenteEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		fmA_Komponente_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Komponente_Schienenprofil_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Komponente_Stromversorgung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Komponente_Typ_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_Beeinflusst_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_E1_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_E2_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_E3_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_S_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fmA_Typ_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schaltmittel_Funktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schaltmittel_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		uebertragung_FMinfo_Richtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		uebertragung_FMinfo_Typ_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zugeinwirkungEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		zugeinwirkung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zugeinwirkung_Typ_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(bettungswiderstand_TypeClassEClass, Bettungswiderstand_TypeClass.class, "Bettungswiderstand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBettungswiderstand_TypeClass_Wert(), this.getBettungswiderstand_Type(), "wert", null, 1, 1, Bettungswiderstand_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Kennbuchstabe_TypeClassEClass, Bezeichnung_Kennbuchstabe_TypeClass.class, "Bezeichnung_Kennbuchstabe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Kennbuchstabe_TypeClass_Wert(), this.getENUMBezeichnungKennbuchstabeObject(), "wert", null, 1, 1, Bezeichnung_Kennbuchstabe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_AnlageEClass, FMA_Anlage.class, "FMA_Anlage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Bezeichnung(), this.getFMA_Anlage_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_FMAAnlageAllg(), this.getFMA_Anlage_Allg_AttributeGroup(), null, "fMAAnlageAllg", null, 1, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_FMAAnlageElektrMerkmale(), this.getFMA_Anlage_Elektr_Merkmale_AttributeGroup(), null, "fMAAnlageElektrMerkmale", null, 0, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_FMAAnlageKaskade(), this.getFMA_Anlage_Kaskade_AttributeGroup(), null, "fMAAnlageKaskade", null, 0, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_FMAAnlageUebertragungFMinfo(), this.getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup(), null, "fMAAnlageUebertragungFMinfo", null, 0, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_IDGleisAbschnitt(), theVerweisePackage.getID_Gleis_Abschnitt_TypeClass(), null, "iDGleisAbschnitt", null, 1, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_IDGleisfreimeldeInnenanlage(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDGleisfreimeldeInnenanlage", null, 1, 1, FMA_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anlage_Allg_AttributeGroupEClass, FMA_Anlage_Allg_AttributeGroup.class, "FMA_Anlage_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Allg_AttributeGroup_FMAArt(), this.getFMA_Art_TypeClass(), null, "fMAArt", null, 1, 1, FMA_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung(), this.getFMA_Hilffreimeldung_TypeClass(), null, "fMAHilffreimeldung", null, 1, 1, FMA_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung(), this.getFMA_Isolierung_TypeClass(), null, "fMAIsolierung", null, 0, 1, FMA_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Allg_AttributeGroup_FMATyp(), this.getFMA_Typ_TypeClass(), null, "fMATyp", null, 0, 1, FMA_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anlage_Bezeichnung_AttributeGroupEClass, FMA_Anlage_Bezeichnung_AttributeGroup.class, "FMA_Anlage_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe(), this.getBezeichnung_Kennbuchstabe_TypeClass(), null, "bezeichnungKennbuchstabe", null, 1, 1, FMA_Anlage_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, "FMA_Anlage_Elektr_Merkmale_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand(), this.getBettungswiderstand_TypeClass(), null, "bettungswiderstand", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge(), this.getFMA_Laenge_TypeClass(), null, "fMALaenge", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst(), this.getFMA_Laenge_Beeinflusst_TypeClass(), null, "fMALaengeBeeinflusst", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1(), this.getFMA_Laenge_E1_TypeClass(), null, "fMALaengeE1", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2(), this.getFMA_Laenge_E2_TypeClass(), null, "fMALaengeE2", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3(), this.getFMA_Laenge_E3_TypeClass(), null, "fMALaengeE3", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS(), this.getFMA_Laenge_S_TypeClass(), null, "fMALaengeS", null, 0, 1, FMA_Anlage_Elektr_Merkmale_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anlage_Kaskade_AttributeGroupEClass, FMA_Anlage_Kaskade_AttributeGroup.class, "FMA_Anlage_Kaskade_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung(), this.getFMA_Kaskade_Bezeichnung_TypeClass(), null, "fMAKaskadeBezeichnung", null, 1, 1, FMA_Anlage_Kaskade_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung(), this.getFMA_Kaskade_Einzelauswertung_TypeClass(), null, "fMAKaskadeEinzelauswertung", null, 1, 1, FMA_Anlage_Kaskade_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass, FMA_Anlage_Uebertragung_FMinfo_AttributeGroup.class, "FMA_Anlage_Uebertragung_FMinfo_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDUebertragungFMinfo", null, 1, 1, FMA_Anlage_Uebertragung_FMinfo_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung(), this.getUebertragung_FMinfo_Richtung_TypeClass(), null, "uebertragungFMinfoRichtung", null, 1, 1, FMA_Anlage_Uebertragung_FMinfo_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp(), this.getUebertragung_FMinfo_Typ_TypeClass(), null, "uebertragungFMinfoTyp", null, 0, 1, FMA_Anlage_Uebertragung_FMinfo_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anschluss_Bezeichnung_TypeClassEClass, FMA_Anschluss_Bezeichnung_TypeClass.class, "FMA_Anschluss_Bezeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Anschluss_Bezeichnung_TypeClass_Wert(), this.getFMA_Anschluss_Bezeichnung_Type(), "wert", null, 1, 1, FMA_Anschluss_Bezeichnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Anschluss_Speiserichtung_TypeClassEClass, FMA_Anschluss_Speiserichtung_TypeClass.class, "FMA_Anschluss_Speiserichtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Anschluss_Speiserichtung_TypeClass_Wert(), this.getENUMFMAAnschlussSpeiserichtungObject(), "wert", null, 1, 1, FMA_Anschluss_Speiserichtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Art_TypeClassEClass, FMA_Art_TypeClass.class, "FMA_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Art_TypeClass_Wert(), this.getENUMFMAArtObject(), "wert", null, 1, 1, FMA_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_ElementEClass, FMA_Element.class, "FMA_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Element_FMAElementAllg(), this.getFMA_Element_Allg_AttributeGroup(), null, "fMAElementAllg", null, 1, 1, FMA_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Element_FMAElementAnschluss(), this.getFMA_Element_Anschluss_AttributeGroup(), null, "fMAElementAnschluss", null, 0, 1, FMA_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Element_IDFMAAnlage(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAAnlage", null, 1, 1, FMA_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Element_Allg_AttributeGroupEClass, FMA_Element_Allg_AttributeGroup.class, "FMA_Element_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Element_Allg_AttributeGroup_FMAElementArt(), this.getFMA_Element_Art_TypeClass(), null, "fMAElementArt", null, 1, 1, FMA_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl(), this.getFMA_Element_Seilanzahl_TypeClass(), null, "fMAElementSeilanzahl", null, 1, 1, FMA_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp(), this.getFMA_Element_Seiltyp_TypeClass(), null, "fMAElementSeiltyp", null, 1, 1, FMA_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Element_Anschluss_AttributeGroupEClass, FMA_Element_Anschluss_AttributeGroup.class, "FMA_Element_Anschluss_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung(), this.getFMA_Anschluss_Bezeichnung_TypeClass(), null, "fMAAnschlussBezeichnung", null, 1, 1, FMA_Element_Anschluss_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung(), this.getFMA_Anschluss_Speiserichtung_TypeClass(), null, "fMAAnschlussSpeiserichtung", null, 1, 1, FMA_Element_Anschluss_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Element_Art_TypeClassEClass, FMA_Element_Art_TypeClass.class, "FMA_Element_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Element_Art_TypeClass_Wert(), this.getENUMFMAElementArtObject(), "wert", null, 1, 1, FMA_Element_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Element_Seilanzahl_TypeClassEClass, FMA_Element_Seilanzahl_TypeClass.class, "FMA_Element_Seilanzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Element_Seilanzahl_TypeClass_Wert(), this.getENUMFMAElementSeilanzahlObject(), "wert", null, 1, 1, FMA_Element_Seilanzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Element_Seiltyp_TypeClassEClass, FMA_Element_Seiltyp_TypeClass.class, "FMA_Element_Seiltyp_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Element_Seiltyp_TypeClass_Wert(), this.getFMA_Element_Seiltyp_Type(), "wert", null, 1, 1, FMA_Element_Seiltyp_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Hilffreimeldung_TypeClassEClass, FMA_Hilffreimeldung_TypeClass.class, "FMA_Hilffreimeldung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Hilffreimeldung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, FMA_Hilffreimeldung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Isolierung_TypeClassEClass, FMA_Isolierung_TypeClass.class, "FMA_Isolierung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Isolierung_TypeClass_Wert(), this.getENUMIsolierungObject(), "wert", null, 1, 1, FMA_Isolierung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Kaskade_Bezeichnung_TypeClassEClass, FMA_Kaskade_Bezeichnung_TypeClass.class, "FMA_Kaskade_Bezeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Kaskade_Bezeichnung_TypeClass_Wert(), this.getFMA_Kaskade_Bezeichnung_Type(), "wert", null, 1, 1, FMA_Kaskade_Bezeichnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Kaskade_Einzelauswertung_TypeClassEClass, FMA_Kaskade_Einzelauswertung_TypeClass.class, "FMA_Kaskade_Einzelauswertung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Kaskade_Einzelauswertung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, FMA_Kaskade_Einzelauswertung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_KomponenteEClass, FMA_Komponente.class, "FMA_Komponente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Komponente_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 0, 1, FMA_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_IDBezugspunkt(), theVerweisePackage.getID_Markanter_Punkt_TypeClass(), null, "iDBezugspunkt", null, 0, 1, FMA_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_IDFMAgrenze(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAgrenze", null, 1, 4, FMA_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_FMAKomponenteAchszaehlpunkt(), this.getFMA_Komponente_Achszaehlpunkt_AttributeGroup(), null, "fMAKomponenteAchszaehlpunkt", null, 0, 1, FMA_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_FMAKomponenteArt(), this.getFMA_Komponente_Art_TypeClass(), null, "fMAKomponenteArt", null, 0, 1, FMA_Komponente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, "FMA_Komponente_Achszaehlpunkt_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil(), this.getFMA_Komponente_Schienenprofil_TypeClass(), null, "fMAKomponenteSchienenprofil", null, 0, 1, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung(), this.getFMA_Komponente_Stromversorgung_TypeClass(), null, "fMAKomponenteStromversorgung", null, 1, 1, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp(), this.getFMA_Komponente_Typ_TypeClass(), null, "fMAKomponenteTyp", null, 0, 1, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDEnergie", null, 1, 1, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDInformation", null, 1, 2, FMA_Komponente_Achszaehlpunkt_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Komponente_Art_TypeClassEClass, FMA_Komponente_Art_TypeClass.class, "FMA_Komponente_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Komponente_Art_TypeClass_Wert(), this.getENUMFMAKomponenteArtObject(), "wert", null, 1, 1, FMA_Komponente_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Komponente_Schienenprofil_TypeClassEClass, FMA_Komponente_Schienenprofil_TypeClass.class, "FMA_Komponente_Schienenprofil_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Komponente_Schienenprofil_TypeClass_Wert(), this.getENUMSchienenprofilObject(), "wert", null, 1, 1, FMA_Komponente_Schienenprofil_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Komponente_Stromversorgung_TypeClassEClass, FMA_Komponente_Stromversorgung_TypeClass.class, "FMA_Komponente_Stromversorgung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Komponente_Stromversorgung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, FMA_Komponente_Stromversorgung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Komponente_Typ_TypeClassEClass, FMA_Komponente_Typ_TypeClass.class, "FMA_Komponente_Typ_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Komponente_Typ_TypeClass_Wert(), this.getFMA_Komponente_Typ_Type(), "wert", null, 1, 1, FMA_Komponente_Typ_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_Beeinflusst_TypeClassEClass, FMA_Laenge_Beeinflusst_TypeClass.class, "FMA_Laenge_Beeinflusst_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_Beeinflusst_TypeClass_Wert(), this.getFMA_Laenge_Beeinflusst_Type(), "wert", null, 1, 1, FMA_Laenge_Beeinflusst_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_E1_TypeClassEClass, FMA_Laenge_E1_TypeClass.class, "FMA_Laenge_E1_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_E1_TypeClass_Wert(), this.getFMA_Laenge_E1_Type(), "wert", null, 1, 1, FMA_Laenge_E1_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_E2_TypeClassEClass, FMA_Laenge_E2_TypeClass.class, "FMA_Laenge_E2_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_E2_TypeClass_Wert(), this.getFMA_Laenge_E2_Type(), "wert", null, 1, 1, FMA_Laenge_E2_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_E3_TypeClassEClass, FMA_Laenge_E3_TypeClass.class, "FMA_Laenge_E3_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_E3_TypeClass_Wert(), this.getFMA_Laenge_E3_Type(), "wert", null, 1, 1, FMA_Laenge_E3_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_S_TypeClassEClass, FMA_Laenge_S_TypeClass.class, "FMA_Laenge_S_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_S_TypeClass_Wert(), this.getFMA_Laenge_S_Type(), "wert", null, 1, 1, FMA_Laenge_S_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Laenge_TypeClassEClass, FMA_Laenge_TypeClass.class, "FMA_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Laenge_TypeClass_Wert(), this.getFMA_Laenge_Type(), "wert", null, 1, 1, FMA_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmA_Typ_TypeClassEClass, FMA_Typ_TypeClass.class, "FMA_Typ_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMA_Typ_TypeClass_Wert(), this.getFMA_Typ_Type(), "wert", null, 1, 1, FMA_Typ_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schaltmittel_Funktion_TypeClassEClass, Schaltmittel_Funktion_TypeClass.class, "Schaltmittel_Funktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchaltmittel_Funktion_TypeClass_Wert(), this.getENUMSchaltmittelFunktionObject(), "wert", null, 1, 1, Schaltmittel_Funktion_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schaltmittel_ZuordnungEClass, Schaltmittel_Zuordnung.class, "Schaltmittel_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchaltmittel_Zuordnung_IDAnforderung(), theVerweisePackage.getID_Anforderung_TypeClass(), null, "iDAnforderung", null, 0, 1, Schaltmittel_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchaltmittel_Zuordnung_IDSchalter(), theVerweisePackage.getID_Schalter_TypeClass(), null, "iDSchalter", null, 1, 1, Schaltmittel_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchaltmittel_Zuordnung_SchaltmittelFunktion(), this.getSchaltmittel_Funktion_TypeClass(), null, "schaltmittelFunktion", null, 1, 1, Schaltmittel_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uebertragung_FMinfo_Richtung_TypeClassEClass, Uebertragung_FMinfo_Richtung_TypeClass.class, "Uebertragung_FMinfo_Richtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUebertragung_FMinfo_Richtung_TypeClass_Wert(), this.getENUMUebertragungFMinfoRichtungObject(), "wert", null, 1, 1, Uebertragung_FMinfo_Richtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uebertragung_FMinfo_Typ_TypeClassEClass, Uebertragung_FMinfo_Typ_TypeClass.class, "Uebertragung_FMinfo_Typ_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUebertragung_FMinfo_Typ_TypeClass_Wert(), this.getUebertragung_FMinfo_Typ_Type(), "wert", null, 1, 1, Uebertragung_FMinfo_Typ_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugeinwirkungEClass, Zugeinwirkung.class, "Zugeinwirkung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZugeinwirkung_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, Zugeinwirkung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZugeinwirkung_IDBezugspunkt(), theVerweisePackage.getID_Markanter_Punkt_TypeClass(), null, "iDBezugspunkt", null, 1, 1, Zugeinwirkung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZugeinwirkung_ZugeinwirkungAllg(), this.getZugeinwirkung_Allg_AttributeGroup(), null, "zugeinwirkungAllg", null, 1, 1, Zugeinwirkung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugeinwirkung_Allg_AttributeGroupEClass, Zugeinwirkung_Allg_AttributeGroup.class, "Zugeinwirkung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt(), this.getZugeinwirkung_Art_TypeClass(), null, "zugeinwirkungArt", null, 1, 1, Zugeinwirkung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp(), this.getZugeinwirkung_Typ_TypeClass(), null, "zugeinwirkungTyp", null, 0, 1, Zugeinwirkung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugeinwirkung_Art_TypeClassEClass, Zugeinwirkung_Art_TypeClass.class, "Zugeinwirkung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZugeinwirkung_Art_TypeClass_Wert(), this.getENUMZugeinwirkungArtObject(), "wert", null, 1, 1, Zugeinwirkung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugeinwirkung_Typ_TypeClassEClass, Zugeinwirkung_Typ_TypeClass.class, "Zugeinwirkung_Typ_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZugeinwirkung_Typ_TypeClass_Wert(), this.getZugeinwirkung_Typ_Type(), "wert", null, 1, 1, Zugeinwirkung_Typ_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBezeichnungKennbuchstabeEEnum, ENUMBezeichnungKennbuchstabe.class, "ENUMBezeichnungKennbuchstabe");
		addEEnumLiteral(enumBezeichnungKennbuchstabeEEnum, ENUMBezeichnungKennbuchstabe.ENUM_BEZEICHNUNG_KENNBUCHSTABE_B);
		addEEnumLiteral(enumBezeichnungKennbuchstabeEEnum, ENUMBezeichnungKennbuchstabe.ENUM_BEZEICHNUNG_KENNBUCHSTABE_G);
		addEEnumLiteral(enumBezeichnungKennbuchstabeEEnum, ENUMBezeichnungKennbuchstabe.ENUM_BEZEICHNUNG_KENNBUCHSTABE_K);
		addEEnumLiteral(enumBezeichnungKennbuchstabeEEnum, ENUMBezeichnungKennbuchstabe.ENUM_BEZEICHNUNG_KENNBUCHSTABE_W);

		initEEnum(enumfmaAnschlussSpeiserichtungEEnum, ENUMFMAAnschlussSpeiserichtung.class, "ENUMFMAAnschlussSpeiserichtung");
		addEEnumLiteral(enumfmaAnschlussSpeiserichtungEEnum, ENUMFMAAnschlussSpeiserichtung.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_AUSSPEISUNG);
		addEEnumLiteral(enumfmaAnschlussSpeiserichtungEEnum, ENUMFMAAnschlussSpeiserichtung.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_EINSPEISUNG);

		initEEnum(enumfmaArtEEnum, ENUMFMAArt.class, "ENUMFMAArt");
		addEEnumLiteral(enumfmaArtEEnum, ENUMFMAArt.ENUMFMA_ART_ACHSZAEHLANLAGE);
		addEEnumLiteral(enumfmaArtEEnum, ENUMFMAArt.ENUMFMA_ART_FTGS);
		addEEnumLiteral(enumfmaArtEEnum, ENUMFMAArt.ENUMFMA_ART_NF_GLEISSTROMKREIS);
		addEEnumLiteral(enumfmaArtEEnum, ENUMFMAArt.ENUMFMA_ART_SONSTIGE);
		addEEnumLiteral(enumfmaArtEEnum, ENUMFMAArt.ENUMFMA_ART_TF_GLEISSTROMKREIS);

		initEEnum(enumfmaElementArtEEnum, ENUMFMAElementArt.class, "ENUMFMAElementArt");
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_ANSCHLUSSSEILE);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_DROSSELSPULE);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_ENDVERBINDER);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_ENDVERBINDER_MODIFIZIERT);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_KURZSCHLUSSVERBINDER);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_POTENTIALAUSGLEICHSVERBINDER);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_SONSTIGE);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_SVERBINDER);
		addEEnumLiteral(enumfmaElementArtEEnum, ENUMFMAElementArt.ENUMFMA_ELEMENT_ART_UEBERLAGERUNGSVERBINDER);

		initEEnum(enumfmaElementSeilanzahlEEnum, ENUMFMAElementSeilanzahl.class, "ENUMFMAElementSeilanzahl");
		addEEnumLiteral(enumfmaElementSeilanzahlEEnum, ENUMFMAElementSeilanzahl.ENUMFMA_ELEMENT_SEILANZAHL_1);
		addEEnumLiteral(enumfmaElementSeilanzahlEEnum, ENUMFMAElementSeilanzahl.ENUMFMA_ELEMENT_SEILANZAHL_2);
		addEEnumLiteral(enumfmaElementSeilanzahlEEnum, ENUMFMAElementSeilanzahl.ENUMFMA_ELEMENT_SEILANZAHL_4);
		addEEnumLiteral(enumfmaElementSeilanzahlEEnum, ENUMFMAElementSeilanzahl.ENUMFMA_ELEMENT_SEILANZAHL_SONSTIGE);

		initEEnum(enumfmaKomponenteArtEEnum, ENUMFMAKomponenteArt.class, "ENUMFMAKomponenteArt");
		addEEnumLiteral(enumfmaKomponenteArtEEnum, ENUMFMAKomponenteArt.ENUMFMA_KOMPONENTE_ART_ELEKTRISCHER_TRENNSTOSS);
		addEEnumLiteral(enumfmaKomponenteArtEEnum, ENUMFMAKomponenteArt.ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_EINSCHIENIG);
		addEEnumLiteral(enumfmaKomponenteArtEEnum, ENUMFMAKomponenteArt.ENUMFMA_KOMPONENTE_ART_ISOLIERSTOSS_ZWEISCHIENIG);

		initEEnum(enumIsolierungEEnum, ENUMIsolierung.class, "ENUMIsolierung");
		addEEnumLiteral(enumIsolierungEEnum, ENUMIsolierung.ENUM_ISOLIERUNG_EINSCHIENIG_L);
		addEEnumLiteral(enumIsolierungEEnum, ENUMIsolierung.ENUM_ISOLIERUNG_EINSCHIENIG_R);
		addEEnumLiteral(enumIsolierungEEnum, ENUMIsolierung.ENUM_ISOLIERUNG_SONSTIGE);
		addEEnumLiteral(enumIsolierungEEnum, ENUMIsolierung.ENUM_ISOLIERUNG_ZWEISCHIENIG);

		initEEnum(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.class, "ENUMSchaltmittelFunktion");
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_ARM);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_AUS_BUE);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_AWANST);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_EIN_BUE);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_HALTFALL);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_RAEUMUNGSPRUEFUNG);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_SONSTIGE);
		addEEnumLiteral(enumSchaltmittelFunktionEEnum, ENUMSchaltmittelFunktion.ENUM_SCHALTMITTEL_FUNKTION_ZL_ANSTOSS);

		initEEnum(enumSchienenprofilEEnum, ENUMSchienenprofil.class, "ENUMSchienenprofil");
		addEEnumLiteral(enumSchienenprofilEEnum, ENUMSchienenprofil.ENUM_SCHIENENPROFIL_R65);
		addEEnumLiteral(enumSchienenprofilEEnum, ENUMSchienenprofil.ENUM_SCHIENENPROFIL_S49);
		addEEnumLiteral(enumSchienenprofilEEnum, ENUMSchienenprofil.ENUM_SCHIENENPROFIL_S54);
		addEEnumLiteral(enumSchienenprofilEEnum, ENUMSchienenprofil.ENUM_SCHIENENPROFIL_SONSTIGE);
		addEEnumLiteral(enumSchienenprofilEEnum, ENUMSchienenprofil.ENUM_SCHIENENPROFIL_UIC60);

		initEEnum(enumUebertragungFMinfoRichtungEEnum, ENUMUebertragungFMinfoRichtung.class, "ENUMUebertragungFMinfoRichtung");
		addEEnumLiteral(enumUebertragungFMinfoRichtungEEnum, ENUMUebertragungFMinfoRichtung.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_GEHEND);
		addEEnumLiteral(enumUebertragungFMinfoRichtungEEnum, ENUMUebertragungFMinfoRichtung.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_KOMMEND);

		initEEnum(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.class, "ENUMZugeinwirkungArt");
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_DOPPEL_SCHLEIFE);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_DOPPEL_SENSOR);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_DREIFACH_SCHLEIFE);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_EINFACH_SCHLEIFE);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_EINFACH_SENSOR);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_EINFACH_SENSOR_RICHTUNGSABHAENGIG);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_ISOLIERTE_SCHIENE_ALLEINSTEHEND);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_ISOLIERTE_SCHIENE_FMA_ANLAGE_MITBENUTZT);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_SCHIENENKONTAKT);
		addEEnumLiteral(enumZugeinwirkungArtEEnum, ENUMZugeinwirkungArt.ENUM_ZUGEINWIRKUNG_ART_SONSTIGE);

		// Initialize data types
		initEDataType(bettungswiderstand_TypeEDataType, BigDecimal.class, "Bettungswiderstand_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBezeichnungKennbuchstabeObjectEDataType, ENUMBezeichnungKennbuchstabe.class, "ENUMBezeichnungKennbuchstabeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumfmaAnschlussSpeiserichtungObjectEDataType, ENUMFMAAnschlussSpeiserichtung.class, "ENUMFMAAnschlussSpeiserichtungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumfmaArtObjectEDataType, ENUMFMAArt.class, "ENUMFMAArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumfmaElementArtObjectEDataType, ENUMFMAElementArt.class, "ENUMFMAElementArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumfmaElementSeilanzahlObjectEDataType, ENUMFMAElementSeilanzahl.class, "ENUMFMAElementSeilanzahlObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumfmaKomponenteArtObjectEDataType, ENUMFMAKomponenteArt.class, "ENUMFMAKomponenteArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumIsolierungObjectEDataType, ENUMIsolierung.class, "ENUMIsolierungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchaltmittelFunktionObjectEDataType, ENUMSchaltmittelFunktion.class, "ENUMSchaltmittelFunktionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchienenprofilObjectEDataType, ENUMSchienenprofil.class, "ENUMSchienenprofilObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumUebertragungFMinfoRichtungObjectEDataType, ENUMUebertragungFMinfoRichtung.class, "ENUMUebertragungFMinfoRichtungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumZugeinwirkungArtObjectEDataType, ENUMZugeinwirkungArt.class, "ENUMZugeinwirkungArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Anschluss_Bezeichnung_TypeEDataType, String.class, "FMA_Anschluss_Bezeichnung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Element_Seiltyp_TypeEDataType, String.class, "FMA_Element_Seiltyp_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Kaskade_Bezeichnung_TypeEDataType, String.class, "FMA_Kaskade_Bezeichnung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Komponente_Typ_TypeEDataType, String.class, "FMA_Komponente_Typ_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_Beeinflusst_TypeEDataType, BigDecimal.class, "FMA_Laenge_Beeinflusst_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_E1_TypeEDataType, BigDecimal.class, "FMA_Laenge_E1_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_E2_TypeEDataType, BigDecimal.class, "FMA_Laenge_E2_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_E3_TypeEDataType, BigDecimal.class, "FMA_Laenge_E3_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_S_TypeEDataType, BigDecimal.class, "FMA_Laenge_S_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Laenge_TypeEDataType, BigDecimal.class, "FMA_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmA_Typ_TypeEDataType, String.class, "FMA_Typ_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uebertragung_FMinfo_Typ_TypeEDataType, String.class, "Uebertragung_FMinfo_Typ_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zugeinwirkung_Typ_TypeEDataType, String.class, "Zugeinwirkung_Typ_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (fmA_AnlageEClass,
		   source,
		   new String[] {
			   "documentation", "Technische Anlage, die einen Gleisabschnitt auf Freisein von Schienenfahrzeugen \u00fcberwacht; entspricht im gew\u00f6hnlichen Sprachgebrauch dem Freimeldeabschnitt. Eine FMA_Anlage wird alleinstehend zur Fahrwegfreipr\u00fcfung bzw. zur Freipr\u00fcfung des Flankenschutzraumes genutzt sowie in Auswertung der Reihenfolge von Belegung und Wieder-Frei-Werden zur Erfassung einer Fahrt und damit zur Aufl\u00f6sung von Teilfahrstra\u00dfen. Auch andere Schaltvorg\u00e4nge k\u00f6nnen durch eine FMA_Anlage ausgel\u00f6st werden. Die FMA_Anlage hat mindestens eine Au\u00dfenanlage (z. B. Drosselspule, Achsz\u00e4hlpunkt) und beansprucht Anteile an einer Gleisfreimelde-Innenanlage (z. B. Motorrelaisgruppe, Achsz\u00e4hlrechner). DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan; Gleisfreimeldepl\u00e4ne (Achsz\u00e4hl\u00fcbersichtsplan, Gleisisolierplan); Freimeldetabelle."
		   });
		addAnnotation
		  (getFMA_Anlage_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getFMA_Anlage_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "documentation", "Gleis_Abschnitt, der auf Freisein von Schienenfahrzeugen \u00fcberwacht wird. DB-Regelwerk Sicherungstechnischer Lageplan, B\u00dc-Lageplan "
		   });
		addAnnotation
		  (getFMA_Anlage_IDGleisfreimeldeInnenanlage(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf eine Aussenelementansteuerung, die die logische Aufbereitung der Daten der FMA Anlage (prim\u00e4r zur Information frei/belegt) \u00fcbernimmt. Im Fall, dass der Achsz\u00e4hlrechner direkt einem ESTW-A zugeordnet ist, wird auf eine Aussenelementansteuerung der Art \\\"ESTW_A\\\" verwiesen. Sofern ein separat stehender Achsz\u00e4hlrechner vorgesehen ist, erfolgt der Verweis auf eine Aussenelementansteuerung der Art \\\"Gleisfreimelde_Innennanlage\\\". Die Unterbringung dieser Au\u00dfenelementansteuerung muss nicht zwingend identisch mit der Unterbringung der Au\u00dfenelementansteuerung sein, die die Ergebnisse der Gleisfreimelde-Innenanlage verwertet. Bei Achsz\u00e4hlanlagen gilt speziell: Zus\u00e4tzlich muss auch noch die Au\u00dfenelementansteuerung bekannt sein, an die die zugeh\u00f6rigen Achsz\u00e4hler angeschlossen sind, siehe dazu die Attribute des Objekts FMA Komponente. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Gleisfreimeldeanlage. DB-Regelwerk Im bisherigen PT1 ist dies nur mittelbar durch die vorgenommenen Eintragungen in den jeweiligen Bereichen der Freimeldetabelle erkennbar. "
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung(),
		   source,
		   new String[] {
			   "documentation", "Gibt an, ob eine Hilfsfreimeldung eingerichtet ist. Wertzuordnung: true - Hilfsfreimeldung eingerichtet, false - Hilfsfreimeldung nicht eingerichtet. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 18 "
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung(),
		   source,
		   new String[] {
			   "documentation", "Art der Isolierung bei Gleisstromkreisen."
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMATyp(),
		   source,
		   new String[] {
			   "documentation", "Vollst\u00e4ndige Bezeichnung des technischen Typs der Gleisfreimeldeanlage. Beispiele: AZ SM[E], FTG S 917 W, GF 100 zu WM 74. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 3, 7 oder 12 "
		   });
		addAnnotation
		  (getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe(),
		   source,
		   new String[] {
			   "documentation", "Bestandteil der vollst\u00e4ndigen Bezeichnung einer FMA Anlage. Die Bezeichnung eines Freimeldeabschnittes besteht aus Kennzahl, Kennbuchstaben und \u00d6rtlichem Elementbezeichner des Gleisabschnitts. Kennzahl und Bezeichnung des Gleisabschnitts k\u00f6nnen \u00fcber ID Gleis Abschnitt ermittelt werden, die Attribute der Gruppe \\\"Bezeichnung\\\" werden f\u00fcr FMA_Anlagen nicht bef\u00fcllt. Die Herleitung des Kennbuchstabens aus Attributen des Gleises und des Gleisabschnitts ist schwierig und in einigen F\u00e4llen unsicher, daher erfolgt im Unterschied zu anderen Objekten eine direkte Abspeicherung als Erg\u00e4nzung innerhalb der Attributgruppe \\\"Bezeichnung\\\". Ein Beispiel ist unter Modellierung Gleisfreimeldung zu finden. DB-Regelwerk Planungsdaten: Freimeldetabelle, Spalte 1 "
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand(),
		   source,
		   new String[] {
			   "documentation", "Spezifischer elektrischer Bettungswiderstand eines Gleisabschnitts (in Ohm/km), wenn dieser als Gleisstromkreis ausgebildet ist. "
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge(),
		   source,
		   new String[] {
			   "documentation", "Elektrische L\u00e4nge des Freimeldeabschnitts. Berechneter Wert entsprechend den Planungsrichtlinien und den \u00f6rtlichen Gegebenheiten. Die Berechnung wird, sofern sie nicht trivial ist, als Dokument an das Attribut angehangen (s. dazu: BasisAttribut). DB-Regelwerk Freimeldetabelle, bei NF-Gleisstromkreisen: Spalte 9; bei FTGS: Angabe ist nicht enthalten, wird allerdings h\u00e4ufig in einer zus\u00e4tzlichen Spalte im Bereich FTGS eingetragen. "
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst(),
		   source,
		   new String[] {
			   "documentation", "Beeinflusste L\u00e4nge des Freimeldeabschnitts. Ein Eintrag ist nur bei NF-Gleisstromkreisen erforderlich. Die Ermittlung erfolgt entsprechend den Anwendungsrichtlinien und den \u00f6rtlichen Gegebenheiten. Die Berechnung wird als Dokument an das Attribut angehangen (s. dazu: BasisAttribut). DB-Regelwerk Freimeldetabelle, Spalte 10"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1(),
		   source,
		   new String[] {
			   "documentation", "Elektrische L\u00e4nge des Teilabschnitts E1. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens zwei Teill\u00e4ngen existieren, sonst ist die Angabe des Attributs FMA Laenge hinreichend. DB-Regelwerk Freimeldetabelle, Spalte 14"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2(),
		   source,
		   new String[] {
			   "documentation", "Elektrische L\u00e4nge des Teilabschnitts E2. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens drei Teill\u00e4ngen existieren. DB-Regelwerk Freimeldetabelle, Spalte 15"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3(),
		   source,
		   new String[] {
			   "documentation", "Elektrische L\u00e4nge des Teilabschnitts E3. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn vier Teill\u00e4ngen existieren. DB-Regelwerk Freimeldetabelle, Spalte 16"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS(),
		   source,
		   new String[] {
			   "documentation", "Elektrische L\u00e4nge des Teilabschnitts S. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens zwei Teill\u00e4ngen existieren, sonst ist die Angabe des Attributs FMA Laenge hinreichend. DB-Regelwerk Freimeldetabelle, Spalte 13"
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Erg\u00e4nzt bei technisch notwendiger Unterteilung eines Gleisabschnitts in mehr als einen Freimeldeabschnitt die Bezeichnung. Die Erg\u00e4nzung (i. d. R. .1, .2, .3, \u2026; aber auch a, b, c, \u2026 oder I, II, III, \u2026 ist m\u00f6glich) wird der Bezeichnung des zugeordneten Objekts Gleis Abschnitt nachgestellt. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan, Gleisfreimeldeplan, Freimeldetabelle, Spalte 1. "
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung(),
		   source,
		   new String[] {
			   "documentation", "Legt fest, ob bei Kaskadierung mehrerer Freimeldeabschnitte zu einem Gleisabschnitt zus\u00e4tzlich zur Gesamtauswertung des Gleisabschnitts eine Einzelauswertung der einzelnen Freimeldeabschnitte vorgesehen ist. Dies ist u.A. sinnvoll, wenn ein Gleisabschnitt bei unterschiedlichen Fahrtrichtungen zwar in unterschiedlicher L\u00e4nge ben\u00f6tigt wird, jedoch in beiden Richtungen eine gemeinsame Grenze m\u00f6glich ist. Wertzuordnung: true - Einzelauswertung vorgesehen, false - Einzelauswertung nicht vorgesehen. DB-Regelwerk Attribut ist im bisherigen PT1 ohne eindeutige Darstellung. Die Angabe kann mittelbar den Eintr\u00e4gen in der Freimeldetabelle entnommen werden (eine zus\u00e4tzliche Zeile f\u00fcr den gesamten Gleisabschnitt zus\u00e4tzlich zu den Zeilen f\u00fcr jeden Teil-Freimeldeabschnitt. "
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf eine benachbarte Aussenelementansteuerung, mit der die Freimeldeinformation dieser FMA Anlage ausgetauscht wird. Voraussetzung f\u00fcr die Verwendung dieses Zeigers ist, dass die Freimeldeinformation in zwei Au\u00dfenelementansteuerungen verwertet wird, die unterschiedlichen Unterbringungen zugeordnet sind, weshalb eine Daten\u00fcbertragung erfolgen muss. Der Zeiger wird erg\u00e4nzt mit den Attributen Uebertragung FMinfo Richtung und Uebertragung FMinfo Typ. DB-Regelwerk Attribut ist im bisherigen PT 1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung der Richtung des Informationsflusses mit einer benachbarten Au\u00dfenelementansteuerung. Ist nur in Verbindung mit ID Uebertragung FMinfo erforderlich. Wertzuordnung: gehend: Freimeldeabschnitt \u00fcbergibt Information an andere Au\u00dfenelementansteuerung, kommend: Freimeldeabschnitt erh\u00e4lt Information von anderer Au\u00dfenelementansteuerung. DB-Regelwerk Ist im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnet das technische System der Informations\u00fcbertragung. Ist nur in Verbindung mit ID Uebertragung FMinfo erforderlich. Beispiele: EF 180, FMX 2, Simis DTS, TF 460, Vital 21. DB-Regelwerk Ist im bisherigen PT 1 ohne eindeutige Darstellung."
		   });
		addAnnotation
		  (fmA_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Erg\u00e4nzung einer FMA Komponente bei Gleisstromkreisen um die Bauelemente zur Ein- und Ausspeisung. FMA_Elemente werden rechts und/oder links der FMA_Komponente direkt den angrenzenden FMA_Anlagen zugewiesen. Das Objekt ist bei Achsz\u00e4hlpunkten nicht erforderlich. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan, Gleisisolierplan, Freimeldetabelle."
		   });
		addAnnotation
		  (getFMA_Element_IDFMAAnlage(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die zugeh\u00f6rige Freimeldeabschnitts-Anlage (FMA_Anlage). Einer FMA_Anlage k\u00f6nnen maximal vier Freimeldeabschnittelemente, davon genau eine Einspeisung und maximal drei Ausspeisungen zugeordnet werden. DB-Regelwerk Sicherungstechnischer Lageplan, B\u00dc-Lageplan, Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementArt(),
		   source,
		   new String[] {
			   "documentation", "Art, mit der die Ein- bzw. Ausspeisung in den Freimeldeabschnitt vorgenommen wird. Hinweis: Beim Wert \\\"S_Verbinder\\\" handelt es sich streng genommen nur um einen halben S-Verbinder, die jeweils andere H\u00e4lfte ist dem angrenzenden Freimeldeabschnitt zugeordnet. Bei der Ermittlung der Anzahl der S-Verbinder in einem Pool muss also die Anzahl der Instanzen FMA_Element mit FMA_Element_Art==S_Verbinder halbiert werden. DB-Regelwerk Bei allen Typen von FMA_Elementen: Sicherungstechnischer Lageplan, B\u00dc-Lageplan; Gleisfreimeldeplan. Bei FTGS: zus\u00e4tzlich in der Freimeldetabelle, Spalte 17 links, dabei wird die Zuordnung (z.B. links/rechts) uneinheitlich gehandhabt. "
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der Seile der Schienenverbinder entsprechend der Anwendungsrichtlinien. Die zugeh\u00f6rigen Baul\u00e4ngen ergeben sich aus den Anwendungsrichtlinien und dem Typ der angrenzenden FMA Anlage und werden nicht separat angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk bei FTGS: Freimeldetabelle, Spalte 17 rechts; bei anderen Arten von Gleisstromkreisen: Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp(),
		   source,
		   new String[] {
			   "documentation", "Querschnitt und Material der Seile der Schienenverbinder entsprechend den Anwendungsrichtlinien. Die Angabe erfolgt in mm\u00b2. Beispiele: 120 Cu, 240 Al. DB-Regelwerk bei FTGS: Freimeldetabelle, Spalte 17 rechts; bei anderen Arten von Gleisstromkreisen: Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Anschlusses einer Ein- / Ausspeisung."
		   });
		addAnnotation
		  (getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung(),
		   source,
		   new String[] {
			   "documentation", "Bestimmt die Speiserichtung bei Gleisstromkreisen. DB-Regelwerk Sicherungstechnischer Lageplan, B\u00dc-Lageplan; Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (fmA_KomponenteEClass,
		   source,
		   new String[] {
			   "documentation", "Freimeldeabschnittsgrenze (Isoliersto\u00df, elektrischer Sto\u00df, Achsz\u00e4hlpunkt). Die FMA_Komponente wird dem Punkt im Gleis zugeordnet, bis zu dem die Erkennung einer Belegung gem\u00e4\u00df Anwendungsrichtlinien als gesichert gilt. Die zu den zugeh\u00f6rigen Gleisabschnitten geh\u00f6renden Bereichsobjekte Gleis Abschnitt m\u00fcssen deshalb exakt an diesem Punktobjekt enden. Zur Ermittlung der seitlichen Lage einer FMA_Komponente siehe Modellierung Gleisfreimeldung. Eine FMA_Komponente kann nur an einer Seite mindestens einen Freimeldeabschnitt oder beidseitig jeweils mindestens einen Freimeldeabschnitt begrenzen. Bei \u00fcberlappenden Freimeldeabschnittsgrenzen (z.B. am \u00dcbergang von FTGS- zu Achsz\u00e4hl- Gleisfreimeldeanlagen) ist jede Freimeldeabschnittsgrenze f\u00fcr sich als FMA_Komponente zu erfassen. Direkt auf H\u00f6he, rechts und/oder links der Freimeldeabschnittsgrenze k\u00f6nnen sich technische Anlagen f\u00fcr die Gleisfreimeldung befinden, siehe dazu FMA Element. Das Befahren einer FMA_Komponente kann auch weitere Schaltvorg\u00e4nge ausl\u00f6sen, siehe dazu Schaltmittel Zuordnung. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan; Achsz\u00e4hl\u00fcbersichtsplan; Freimeldetabelle; Achsz\u00e4hltabelle."
		   });
		addAnnotation
		  (getFMA_Komponente_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getFMA_Komponente_IDBezugspunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Punkt Objekt, dass f\u00fcr die Positionierung der Freimeldeabschnittsgrenze (FMA_Komponente) bzw. der Zugeinwirkung ma\u00dfgebend ist. F\u00fcr alle Arten von Freimeldeabschnittsgrenzen bzw. Zugeinwirkungen anzugeben, f\u00fcr die ein Bezugspunkt existiert, zu dem ein vorgeschriebener Abstand erforderlich ist. Typische Bezugspunkte sind Signal, Weichen-Komponente und Gleissperren-Komponente. DB-Regelwerk bei Achsz\u00e4hlpunkten: Achsz\u00e4hltabelle, Spalte 17; bei anderen Freimeldeabschnittsgrenzen und Zugeinwirkungen: h\u00e4ufig aus einer Abstandsangabe im Sicherungstechnischen Lageplan / B\u00dc-Lageplan erkennbar. "
		   });
		addAnnotation
		  (getFMA_Komponente_IDFMAgrenze(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Freimeldeabschnitt, der durch diese Freimeldeabschnittsgrenze begrenzt wird. Der Verweis kann mehrfach verwendet werden, wenn mehrere Freimeldeabschnitte durch eine Freimeldeabschnittsgrenze begrenzt werden. DB-Regelwerk Planungsdaten: Angabe nur bei Achsz\u00e4hlern \u00fcblich, dort in der Achsz\u00e4hltabelle. "
		   });
		addAnnotation
		  (getFMA_Komponente_FMAKomponenteArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Freimeldeabschnittsgrenze. Dieses Attribut wird mit Ausnahme der Achsz\u00e4hltechnik f\u00fcr alle Arten von Gleisfreimeldungen eingetragen. Je nach Art der Freimeldeanlage und \u00f6rtlicher Lage ist die Angabe dieses Attributs ausreichend oder es m\u00fcssen zur weiteren Detaillierung Objekte FMA Element hinzugef\u00fcgt werden. Grunds\u00e4tzlich sind alle FMA_Komponenten zentrale Anlagenteile. Inwieweit sie beidseitig genutzt werden, ergibt sich aus der Art und Lage der angrenzenden FMA_Anlagen. Das Attribut wird im bisherigen PT 1 im Gleisisolierplan (oder bei einfachen Verh\u00e4ltnissen im Signallageplan) dargestellt. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan, Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil(),
		   source,
		   new String[] {
			   "documentation", "Hinsichtlich der Befestigung zu ber\u00fccksichtigendes Schienenprofil. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung(),
		   source,
		   new String[] {
			   "documentation", "Kennzeichnet den Weg der Stromversorgung im Vergleich mit dem Weg der Informations\u00fcbertragung. Die Angabe ist nur bei Achsz\u00e4hlpunkten erforderlich. Wertezuordnung: true - entspricht dem Eintrag \\\"fern\\\" im bisherigen PT 1 (Stromversorgung in separaten Adern), hierbei m\u00fcssen ID Energie und ID Information auf unterschiedliche Au\u00dfenelementansteuerungen verweisen, false - entspricht den Eintr\u00e4gen \\\"eigen\\\" und \\\"fremd\\\" im bisherigen PT 1 (Stromversorgung und Informations\u00fcbertragung \u00fcber die selben Adern), die weitere Unterscheidung zwischen \\\"eigen\\\" und \\\"fremd\\\" geht aus dem Vergleich von ID Energie und ID Information hervor. DB-Regelwerk Achsz\u00e4hltabelle, Spalte 3 "
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp(),
		   source,
		   new String[] {
			   "documentation", "Technische Typbezeichnung. Ist nur bei Achsz\u00e4hlpunkten erforderlich. Beispiele: RSR 122, ZP 30H, ZP 43. DB-Regelwerk Achsz\u00e4hltabelle, Spalte 2"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Aussenelementansteuerung, von der die Energieversorgung des Stellelements oder der FMA Komponente erfolgt. Objekte, die Stellelemente\\\" href=\\\"//Stellelement\\\"\\u003eStellelemente sind, enthalten keine eigenen Attribute ID_Energie und ID Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enth\u00e4lt. Nicht-Stellelemente (z. B. der Achsz\u00e4hlpunkt als FMA Komponente) hingegen m\u00fcssen diese Attribute selbst enthalten. DB-Regelwerk bei Achsz\u00e4hlpunkten: Achsz\u00e4hlpunkttabelle, Spalte 4 (und redundant dazu: Freimeldetabelle, Spalte 4); bei anderen Typen von Freimeldeanlagen: im bisherigen PT1 ohne eindeutige Darstellung, in der Regel mittelbar aus dem Sicherungstechnischen Lageplan/B\u00dc-Lageplan ermittelbar. "
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Aussenelementansteuerung, von der die Informationsversorgung des Stellelements bzw. die Informationsverarbeitung der FMA Komponente erfolgt. Objekte, die Stellelemente\\\" href=\\\"//Stellelement\\\"\\u003eStellelemente sind, enthalten keine eigenen Attribute ID Energie und ID_Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enth\u00e4lt. Nicht-Stellelemente (z.B. der Achsz\u00e4hlpunkt als FMA Komponente) hingegen m\u00fcssen diese Attribute selbst enthalten. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (schaltmittel_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnungsobjekt f\u00fcr die punktuelle Ausl\u00f6sung von Schaltvorg\u00e4ngen. Beispiel: B\u00dcSA, Rangier- und Ablaufanlagen. Schaltmittel sind oftmals separate Zugeinwirkungen (z. B. Radsensoren), es k\u00f6nnen aber auch Freimeldeabschnitte (FMA_Anlagen) oder Achsz\u00e4hlpunkte (FMA_Komponenten) f\u00fcr den Zweck eines Schaltmittels mitverwendet werden (Doppelausnutzung). Ein Schaltmittel wiederum kann f\u00fcr unterschiedliche Funktionen vorgesehen sein. Das Zuordnungsobjekt Schaltmittel erfasst jeweils eine konkrete Anforderung (Verweis, der auf das anfordernde Objekt gerichtet ist, z.B. Bahn\u00fcbergang EIN, Bahn\u00fcbergang AUS, Fahrstra\u00dfe verschlie\u00dfen und ordnet diese Funktion dann einer konkreten Anlage (Zugeinwirkung, Freimeldeabschnitt oder Achsz\u00e4hlpunkt) sowie eine Beschriftung dieser Anlage im sicherungstechnischen Lageplan zu. Die Funktion \\\"Fahrstra\u00dfe verschlie\u00dfen (ID_Anforderung = Fstr_Fahrweg)\\\" ist vorgesehen f\u00fcr den Anr\u00fcckverschluss von Zugstra\u00dfen. Weitere Anwendungen sind aktuell nicht im Modell verankert. Der Verweis auf die Anforderung ist nicht erforderlich, wenn sich die Zuordnung eindeutig aus der Topologie ergibt (Beispiel: separates Schaltmittel f\u00fcr die Funktion \\\"Zweites Haltfallkriterium\\\"). In diesem Fall wird nur der Verweis auf die Anlage sowie die Beschriftung im Lageplan angegeben. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan, Gleisfreimeldeplan."
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_IDAnforderung(),
		   source,
		   new String[] {
			   "documentation", "Verweist auf das Objekt, das eine Schaltanforderung stellt. Die Schaltanforderung erfolgt unabh\u00e4ngig von der konkreten Realisierung, diese Zuordnung wird \u00fcber ID Schalter vorgenommen. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung, mittelbar aus Eintr\u00e4gen im Sicherungstechnischen Lageplan / B\u00dc-Lageplan zu erkennen. "
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_IDSchalter(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt, das eine Schaltanforderung bedient. Die Zuordnung des Schalters (Freimeldeabschnitt, Achsz\u00e4hlpunkt oder Zugeinwirkung) erfolgt unabh\u00e4ngig von der konkreten Anforderung, diese Zuordnung wird \u00fcber ID Anforderung vorgenommen. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung, mittelbar aus Eintr\u00e4gen im Sicherungstechnischen Lageplan / B\u00dc-Lageplan zu erkennen. "
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_SchaltmittelFunktion(),
		   source,
		   new String[] {
			   "documentation", "Funktion des Schaltmittels. Beispiele (und Erl\u00e4uterung dazu): ARM (Anr\u00fcckmeldung f\u00fcr B\u00dcSA), Ein_BUE (Einschaltung von B\u00dcSA), ZL_Ansto\u00df (Zuglenk-Ansto\u00df), Haltfall (zweites Haltfall-Kriterium bei Signalen). Zur Auswertung muss die Funktion noch mit dem unter ID Anforderung angegebenen Objekt vervollst\u00e4ndigt werden. DB-Regelwerk Sicherungstechnischer Lageplan, B\u00dc-Lageplan"
		   });
		addAnnotation
		  (zugeinwirkungEClass,
		   source,
		   new String[] {
			   "documentation", "Technische Anlage, die durch die punktuelle Einwirkung eines Zuges einen Schaltvorgang ausl\u00f6sen kann. Bei B\u00dcSA werden Ein- und Ausschaltpunkte sowie Kontakte f\u00fcr die Wirksamkeitsschaltung in Abh\u00e4ngigkeit vom Hersteller auf verschiedene Art ausgebildet: Die Hersteller Scheidt\\u0026amp;Bachmann sowie PintschBamag verwenden als Zugeinwirkung Fahrzeugsensoren in Form von 8-f\u00f6rmig verlegten Schleifen im Gleis. Einschaltpunkte und Kontakte f\u00fcr die Wirksamkeitsschaltung werden im Regelfall aus zwei Schleifen, Ausschaltpunkte aus einer Schleife gebildet. Nur im Ausnahmefall werden beim Hersteller PintschBamag Einschaltpunkte mit drei Schleifen errichtet. Der Hersteller Siemens AG verwendet dagegen Achsz\u00e4hlern vergleichbare sogenannte Doppelsensoren. F\u00fcr das Modell werden, unabh\u00e4ngig von der herstellerspezifischen Ausbildung, Ein-und Ausschaltpunkte sowie Kontakte der Wirksamkeitsschaltung grunds\u00e4tzlich als EINE Zugeinwirkung betrachtet. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, B\u00dc-Lageplan, Gleisfreimeldeplan."
		   });
		addAnnotation
		  (getZugeinwirkung_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getZugeinwirkung_IDBezugspunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Punkt Objekt, dass f\u00fcr die Positionierung der Freimeldeabschnittsgrenze (FMA_Komponente) bzw. der Zugeinwirkung ma\u00dfgebend ist. F\u00fcr alle Arten von Freimeldeabschnittsgrenzen bzw. Zugeinwirkungen anzugeben, f\u00fcr die ein Bezugspunkt existiert, zu dem ein vorgeschriebener Abstand erforderlich ist. Typische Bezugspunkte sind Signal, Weichen-Komponente und Gleissperren-Komponente. DB-Regelwerk bei Achsz\u00e4hlpunkten: Achsz\u00e4hltabelle, Spalte 17; bei anderen Freimeldeabschnittsgrenzen und Zugeinwirkungen: h\u00e4ufig aus einer Abstandsangabe im Sicherungstechnischen Lageplan / B\u00dc-Lageplan erkennbar. "
		   });
		addAnnotation
		  (getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt(),
		   source,
		   new String[] {
			   "documentation", "Art einer Zugeinwirkung. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Planungsdaten: Lageplan, Kreuzungsplan, Gleisfreimeldeplan. "
		   });
		addAnnotation
		  (getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp(),
		   source,
		   new String[] {
			   "documentation", "Vollst\u00e4ndige Bezeichnung des technischen Typs der Zugeinwirkung. DB-Regelwerk Planungsdaten: Im bisherigen PT1 nicht angegeben. "
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
		  (bettungswiderstand_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBettungswiderstand",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "([0-4]\\.[0-9]{2})|(5\\.00)"
		   });
		addAnnotation
		  (bettungswiderstand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBettungswiderstand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBettungswiderstand_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Kennbuchstabe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Kennbuchstabe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Kennbuchstabe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumBezeichnungKennbuchstabeEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBezeichnung_Kennbuchstabe"
		   });
		addAnnotation
		  (enumBezeichnungKennbuchstabeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBezeichnung_Kennbuchstabe:Object",
			   "baseType", "ENUMBezeichnung_Kennbuchstabe"
		   });
		addAnnotation
		  (enumfmaAnschlussSpeiserichtungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Anschluss_Speiserichtung"
		   });
		addAnnotation
		  (enumfmaAnschlussSpeiserichtungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Anschluss_Speiserichtung:Object",
			   "baseType", "ENUMFMA_Anschluss_Speiserichtung"
		   });
		addAnnotation
		  (enumfmaArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Art"
		   });
		addAnnotation
		  (enumfmaArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Art:Object",
			   "baseType", "ENUMFMA_Art"
		   });
		addAnnotation
		  (enumfmaElementArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Element_Art"
		   });
		addAnnotation
		  (enumfmaElementArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Element_Art:Object",
			   "baseType", "ENUMFMA_Element_Art"
		   });
		addAnnotation
		  (enumfmaElementSeilanzahlEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Element_Seilanzahl"
		   });
		addAnnotation
		  (enumfmaElementSeilanzahlObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Element_Seilanzahl:Object",
			   "baseType", "ENUMFMA_Element_Seilanzahl"
		   });
		addAnnotation
		  (enumfmaKomponenteArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Komponente_Art"
		   });
		addAnnotation
		  (enumfmaKomponenteArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFMA_Komponente_Art:Object",
			   "baseType", "ENUMFMA_Komponente_Art"
		   });
		addAnnotation
		  (enumIsolierungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMIsolierung"
		   });
		addAnnotation
		  (enumIsolierungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMIsolierung:Object",
			   "baseType", "ENUMIsolierung"
		   });
		addAnnotation
		  (enumSchaltmittelFunktionEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchaltmittel_Funktion"
		   });
		addAnnotation
		  (enumSchaltmittelFunktionObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchaltmittel_Funktion:Object",
			   "baseType", "ENUMSchaltmittel_Funktion"
		   });
		addAnnotation
		  (enumSchienenprofilEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchienenprofil"
		   });
		addAnnotation
		  (enumSchienenprofilObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchienenprofil:Object",
			   "baseType", "ENUMSchienenprofil"
		   });
		addAnnotation
		  (enumUebertragungFMinfoRichtungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMUebertragung_FMinfo_Richtung"
		   });
		addAnnotation
		  (enumUebertragungFMinfoRichtungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMUebertragung_FMinfo_Richtung:Object",
			   "baseType", "ENUMUebertragung_FMinfo_Richtung"
		   });
		addAnnotation
		  (enumZugeinwirkungArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZugeinwirkung_Art"
		   });
		addAnnotation
		  (enumZugeinwirkungArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZugeinwirkung_Art:Object",
			   "baseType", "ENUMZugeinwirkung_Art"
		   });
		addAnnotation
		  (fmA_AnlageEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getFMA_Anlage_FMAAnlageAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anlage_Allg"
		   });
		addAnnotation
		  (getFMA_Anlage_FMAAnlageElektrMerkmale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anlage_Elektr_Merkmale"
		   });
		addAnnotation
		  (getFMA_Anlage_FMAAnlageKaskade(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anlage_Kaskade"
		   });
		addAnnotation
		  (getFMA_Anlage_FMAAnlageUebertragungFMinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anlage_Uebertragung_FMinfo"
		   });
		addAnnotation
		  (getFMA_Anlage_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Abschnitt"
		   });
		addAnnotation
		  (getFMA_Anlage_IDGleisfreimeldeInnenanlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleisfreimelde_Innenanlage"
		   });
		addAnnotation
		  (fmA_Anlage_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Art"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Hilffreimeldung"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAIsolierung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Isolierung"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMATyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Typ"
		   });
		addAnnotation
		  (fmA_Anlage_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Bezeichnung_AttributeGroup_BezeichnungKennbuchstabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Kennbuchstabe"
		   });
		addAnnotation
		  (fmA_Anlage_Elektr_Merkmale_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage_Elektr_Merkmale",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bettungswiderstand"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge_Beeinflusst"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge_E1"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge_E2"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge_E3"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Laenge_S"
		   });
		addAnnotation
		  (fmA_Anlage_Kaskade_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage_Kaskade",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Kaskade_Bezeichnung"
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Kaskade_Einzelauswertung"
		   });
		addAnnotation
		  (fmA_Anlage_Uebertragung_FMinfo_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Anlage_Uebertragung_FMinfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_IDUebertragungFMinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Uebertragung_FMinfo"
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoRichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uebertragung_FMinfo_Richtung"
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uebertragung_FMinfo_Typ"
		   });
		addAnnotation
		  (fmA_Anschluss_Bezeichnung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Anschluss_Bezeichnung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{2,8}"
		   });
		addAnnotation
		  (fmA_Anschluss_Bezeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Anschluss_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anschluss_Bezeichnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Anschluss_Speiserichtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Anschluss_Speiserichtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Anschluss_Speiserichtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_ElementEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_FMAElementAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Element_Allg"
		   });
		addAnnotation
		  (getFMA_Element_FMAElementAnschluss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Element_Anschluss"
		   });
		addAnnotation
		  (getFMA_Element_IDFMAAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage"
		   });
		addAnnotation
		  (fmA_Element_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Element_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Element_Art"
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Element_Seilanzahl"
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Element_Seiltyp"
		   });
		addAnnotation
		  (fmA_Element_Anschluss_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Element_Anschluss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anschluss_Bezeichnung"
		   });
		addAnnotation
		  (getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussSpeiserichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Anschluss_Speiserichtung"
		   });
		addAnnotation
		  (fmA_Element_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Element_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Element_Seilanzahl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Element_Seilanzahl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_Seilanzahl_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Element_Seiltyp_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Element_Seiltyp",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{2,6}"
		   });
		addAnnotation
		  (fmA_Element_Seiltyp_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Element_Seiltyp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Element_Seiltyp_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Hilffreimeldung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Hilffreimeldung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Hilffreimeldung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Isolierung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Isolierung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Isolierung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Kaskade_Bezeichnung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Kaskade_Bezeichnung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[a-z]|[A-Z]|(I)|(II)|(III)|(IV)|(V)|(VI)|(VII)|(VIII)|(IX)|(X)|(XI)|(XII)|(\\.[1-9])"
		   });
		addAnnotation
		  (fmA_Kaskade_Bezeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Kaskade_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Kaskade_Bezeichnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Kaskade_Einzelauswertung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Kaskade_Einzelauswertung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Kaskade_Einzelauswertung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_KomponenteEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Komponente",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getFMA_Komponente_IDBezugspunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bezugspunkt"
		   });
		addAnnotation
		  (getFMA_Komponente_IDFMAgrenze(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMAgrenze"
		   });
		addAnnotation
		  (getFMA_Komponente_FMAKomponenteAchszaehlpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Komponente_Achszaehlpunkt"
		   });
		addAnnotation
		  (getFMA_Komponente_FMAKomponenteArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Komponente_Art"
		   });
		addAnnotation
		  (fmA_Komponente_Achszaehlpunkt_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFMA_Komponente_Achszaehlpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Komponente_Schienenprofil"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Komponente_Stromversorgung"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FMA_Komponente_Typ"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Energie"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Information"
		   });
		addAnnotation
		  (fmA_Komponente_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Komponente_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Komponente_Schienenprofil_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Komponente_Schienenprofil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Schienenprofil_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Komponente_Stromversorgung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Komponente_Stromversorgung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Stromversorgung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Komponente_Typ_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Komponente_Typ",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (fmA_Komponente_Typ_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Komponente_Typ",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Komponente_Typ_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_Beeinflusst_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge_Beeinflusst",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500"
		   });
		addAnnotation
		  (fmA_Laenge_Beeinflusst_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge_Beeinflusst",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_Beeinflusst_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_E1_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge_E1",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}"
		   });
		addAnnotation
		  (fmA_Laenge_E1_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge_E1",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_E1_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_E2_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge_E2",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}"
		   });
		addAnnotation
		  (fmA_Laenge_E2_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge_E2",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_E2_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_E3_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge_E3",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}"
		   });
		addAnnotation
		  (fmA_Laenge_E3_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge_E3",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_E3_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_S_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge_S",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}"
		   });
		addAnnotation
		  (fmA_Laenge_S_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge_S",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_S_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500"
		   });
		addAnnotation
		  (fmA_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fmA_Typ_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFMA_Typ",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (fmA_Typ_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFMA_Typ",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFMA_Typ_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schaltmittel_Funktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchaltmittel_Funktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchaltmittel_Funktion_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schaltmittel_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CSchaltmittel_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_IDAnforderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anforderung"
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_IDSchalter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Schalter"
		   });
		addAnnotation
		  (getSchaltmittel_Zuordnung_SchaltmittelFunktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schaltmittel_Funktion"
		   });
		addAnnotation
		  (uebertragung_FMinfo_Richtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUebertragung_FMinfo_Richtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUebertragung_FMinfo_Richtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (uebertragung_FMinfo_Typ_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUebertragung_FMinfo_Typ",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (uebertragung_FMinfo_Typ_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUebertragung_FMinfo_Typ",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUebertragung_FMinfo_Typ_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zugeinwirkungEClass,
		   source,
		   new String[] {
			   "name", "CZugeinwirkung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugeinwirkung_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getZugeinwirkung_IDBezugspunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bezugspunkt"
		   });
		addAnnotation
		  (getZugeinwirkung_ZugeinwirkungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zugeinwirkung_Allg"
		   });
		addAnnotation
		  (zugeinwirkung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZugeinwirkung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zugeinwirkung_Art"
		   });
		addAnnotation
		  (getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zugeinwirkung_Typ"
		   });
		addAnnotation
		  (zugeinwirkung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZugeinwirkung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugeinwirkung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zugeinwirkung_Typ_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZugeinwirkung_Typ",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", ".{1,16}"
		   });
		addAnnotation
		  (zugeinwirkung_Typ_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZugeinwirkung_Typ",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugeinwirkung_Typ_TypeClass_Wert(),
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
		  (fmA_AnlageEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMAHilffreimeldung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Allg_AttributeGroup_FMATyp(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [0.00..5.00], 2 Nachkommastellen </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1500] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1500] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1499] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1499] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1499] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..1499] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeBezeichnung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[a-z]|[A-Z]|[I-XII]| [.1-.9]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Kaskade_AttributeGroup_FMAKaskadeEinzelauswertung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Anlage_Uebertragung_FMinfo_AttributeGroup_UebertragungFMinfoTyp(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fmA_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1|2|4] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [2..6] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Element_Anschluss_AttributeGroup_FMAAnschlussBezeichnung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[2..8]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fmA_KomponenteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..16] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (schaltmittel_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (zugeinwirkungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //OrtungPackageImpl
