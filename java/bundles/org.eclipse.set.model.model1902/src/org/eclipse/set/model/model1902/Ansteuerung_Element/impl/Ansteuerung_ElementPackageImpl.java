/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.AEA_GFK_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bandbreite_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bauart_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bezeichnung_AEA_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bezeichnung_ESTW_ZE_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bezeichnung_TSO_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMAussenelementansteuerungArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMBandbreite;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMEVArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMGFKKategorie;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMMediumArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMNetzArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMTSOTeilsystemArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMTechnikArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMUebertragungswegArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMUnterbringungArt;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ENUMUnterbringungBefestigung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Energieversorgung_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.GFK_Kategorie_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Hersteller_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Blau_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Blau_V4_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Blau_V6_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Grau_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Grau_V4_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.IP_Adressblock_Grau_V6_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Medium_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Netz_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Regionalbereich_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Standort_Beschreibung_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Stell_Bereich;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Stellelement;
import org.eclipse.set.model.model1902.Ansteuerung_Element.TSO_IP_AB_Teilsystem_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.TSO_Teilsystem_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Beschreibung_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Art_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Unterbringung_Befestigung_TypeClass;

import org.eclipse.set.model.model1902.Ansteuerung_Element.util.Ansteuerung_ElementValidator;

import org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.model1902.Block.BlockPackage;

import org.eclipse.set.model.model1902.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model1902.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model1902.Gleis.GleisPackage;

import org.eclipse.set.model.model1902.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

import org.eclipse.set.model.model1902.Nahbedienbereich.impl.NahbedienbereichPackageImpl;

import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

import org.eclipse.set.model.model1902.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;

import org.eclipse.set.model.model1902.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

import org.eclipse.set.model.model1902.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model1902.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model1902.Verweise.VerweisePackage;

import org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model1902.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ansteuerung_ElementPackageImpl extends EPackageImpl implements Ansteuerung_ElementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aeA_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aeA_Energieversorgung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aeA_GFK_IP_Adressblock_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussenelementansteuerungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussenelementansteuerung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussenelementansteuerung_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandbreite_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_AEA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_ESTW_ZE_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_TSO_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energieversorgung_Art_Ersatz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energieversorgung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estW_ZentraleinheitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estW_Zentraleinheit_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfK_Kategorie_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hersteller_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_V4_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Blau_V6_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_V4_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iP_Adressblock_Grau_V6_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medium_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netz_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standort_Beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stell_BereichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stellelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technik_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technik_Beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technik_StandortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technik_Standort_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsO_IP_AB_Teilsystem_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsO_IP_Adressblock_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsO_Teilsystem_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uebertragungswegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uebertragungsweg_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uebertragungsweg_Technik_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterbringungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterbringung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterbringung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterbringung_Befestigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAussenelementansteuerungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBandbreiteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumevArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgfkKategorieEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMediumArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNetzArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTechnikArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumtsoTeilsystemArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUebertragungswegArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUnterbringungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUnterbringungBefestigungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bauart_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_AEA_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_ESTW_ZE_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_TSO_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAussenelementansteuerungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBandbreiteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumevArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgfkKategorieObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumMediumArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumNetzArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTechnikArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumtsoTeilsystemArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUebertragungswegArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUnterbringungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumUnterbringungBefestigungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_V4_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Blau_V6_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_V4_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iP_Adressblock_Grau_V6_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType standort_Beschreibung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType technik_Beschreibung_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ansteuerung_ElementPackageImpl() {
		super(eNS_URI, Ansteuerung_ElementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ansteuerung_ElementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ansteuerung_ElementPackage init() {
		if (isInited) return (Ansteuerung_ElementPackage)EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnsteuerung_ElementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = registeredAnsteuerung_ElementPackage instanceof Ansteuerung_ElementPackageImpl ? (Ansteuerung_ElementPackageImpl)registeredAnsteuerung_ElementPackage : new Ansteuerung_ElementPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienbereichPackage.eNS_URI);
		NahbedienbereichPackageImpl theNahbedienbereichPackage = (NahbedienbereichPackageImpl)(registeredPackage instanceof NahbedienbereichPackageImpl ? registeredPackage : NahbedienbereichPackage.eINSTANCE);
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

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();

		// Create package meta-data objects
		theAnsteuerung_ElementPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
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
		theNahbedienbereichPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
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
		theNahbedienbereichPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAnsteuerung_ElementPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Ansteuerung_ElementValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAnsteuerung_ElementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ansteuerung_ElementPackage.eNS_URI, theAnsteuerung_ElementPackage);
		return theAnsteuerung_ElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAEA_Allg_AttributeGroup() {
		return aeA_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Allg_AttributeGroup_AussenelementansteuerungArt() {
		return (EReference)aeA_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Allg_AttributeGroup_Bauart() {
		return (EReference)aeA_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAEA_Energieversorgung_AttributeGroup() {
		return aeA_Energieversorgung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz() {
		return (EReference)aeA_Energieversorgung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Energieversorgung_AttributeGroup_IDEnergieSekundaer() {
		return (EReference)aeA_Energieversorgung_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArt() {
		return (EReference)aeA_Energieversorgung_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_Energieversorgung_AttributeGroup_IDEnergiePrimaer() {
		return (EReference)aeA_Energieversorgung_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAEA_GFK_IP_Adressblock_AttributeGroup() {
		return aeA_GFK_IP_Adressblock_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_GFKKategorie() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAEA_GFK_IP_Adressblock_AttributeGroup_Regionalbereich() {
		return (EReference)aeA_GFK_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussenelementansteuerung() {
		return aussenelementansteuerungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_AEAAllg() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_AEAEnergieversorgung() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_AEAGFKIPAdressblock() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_Bezeichnung() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_IDInformationPrimaer() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_IDInformationSekundaer() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_IDOertlichkeitGesteuert() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_IDOertlichkeitNamensgebend() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_IDUnterbringung() {
		return (EReference)aussenelementansteuerungEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussenelementansteuerung_Art_TypeClass() {
		return aussenelementansteuerung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussenelementansteuerung_Art_TypeClass_Wert() {
		return (EAttribute)aussenelementansteuerung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussenelementansteuerung_Bezeichnung_AttributeGroup() {
		return aussenelementansteuerung_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA() {
		return (EReference)aussenelementansteuerung_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandbreite_TypeClass() {
		return bandbreite_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandbreite_TypeClass_Wert() {
		return (EAttribute)bandbreite_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBauart_TypeClass() {
		return bauart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBauart_TypeClass_Wert() {
		return (EAttribute)bauart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_AEA_TypeClass() {
		return bezeichnung_AEA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_AEA_TypeClass_Wert() {
		return (EAttribute)bezeichnung_AEA_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_ESTW_ZE_TypeClass() {
		return bezeichnung_ESTW_ZE_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_ESTW_ZE_TypeClass_Wert() {
		return (EAttribute)bezeichnung_ESTW_ZE_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_TSO_TypeClass() {
		return bezeichnung_TSO_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_TSO_TypeClass_Wert() {
		return (EAttribute)bezeichnung_TSO_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergieversorgung_Art_Ersatz_TypeClass() {
		return energieversorgung_Art_Ersatz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergieversorgung_Art_Ersatz_TypeClass_Wert() {
		return (EAttribute)energieversorgung_Art_Ersatz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergieversorgung_Art_TypeClass() {
		return energieversorgung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergieversorgung_Art_TypeClass_Wert() {
		return (EAttribute)energieversorgung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESTW_Zentraleinheit() {
		return estW_ZentraleinheitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Bezeichnung() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_ESTWZentraleinheitAllg() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_IDOertlichkeitNamensgebend() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_IDUnterbringung() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_IDBedienBezirkVirtuell() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_IDBedienBezirkZentral() {
		return (EReference)estW_ZentraleinheitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESTW_Zentraleinheit_Allg_AttributeGroup() {
		return estW_Zentraleinheit_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart() {
		return (EReference)estW_Zentraleinheit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArt() {
		return (EReference)estW_Zentraleinheit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz() {
		return (EReference)estW_Zentraleinheit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz2() {
		return (EReference)estW_Zentraleinheit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller() {
		return (EReference)estW_Zentraleinheit_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESTW_Zentraleinheit_Bezeichnung_AttributeGroup() {
		return estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESTW_Zentraleinheit_Bezeichnung_AttributeGroup_BezeichnungESTWZE() {
		return (EReference)estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGFK_Kategorie_TypeClass() {
		return gfK_Kategorie_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGFK_Kategorie_TypeClass_Wert() {
		return (EAttribute)gfK_Kategorie_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHersteller_TypeClass() {
		return hersteller_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHersteller_TypeClass_Wert() {
		return (EAttribute)hersteller_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_TypeClass() {
		return iP_Adressblock_Blau_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_V4_TypeClass() {
		return iP_Adressblock_Blau_V4_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_V4_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_V4_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Blau_V6_TypeClass() {
		return iP_Adressblock_Blau_V6_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Blau_V6_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Blau_V6_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_TypeClass() {
		return iP_Adressblock_Grau_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_V4_TypeClass() {
		return iP_Adressblock_Grau_V4_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_V4_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_V4_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIP_Adressblock_Grau_V6_TypeClass() {
		return iP_Adressblock_Grau_V6_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIP_Adressblock_Grau_V6_TypeClass_Wert() {
		return (EAttribute)iP_Adressblock_Grau_V6_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedium_Art_TypeClass() {
		return medium_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedium_Art_TypeClass_Wert() {
		return (EAttribute)medium_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetz_Art_TypeClass() {
		return netz_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetz_Art_TypeClass_Wert() {
		return (EAttribute)netz_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionalbereich_TypeClass() {
		return regionalbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionalbereich_TypeClass_Wert() {
		return (EAttribute)regionalbereich_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandort_Beschreibung_TypeClass() {
		return standort_Beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandort_Beschreibung_TypeClass_Wert() {
		return (EAttribute)standort_Beschreibung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStell_Bereich() {
		return stell_BereichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStell_Bereich_IDAussenelementansteuerung() {
		return (EReference)stell_BereichEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStellelement() {
		return stellelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStellelement_IDEnergie() {
		return (EReference)stellelementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStellelement_IDInformation() {
		return (EReference)stellelementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnik_Art_TypeClass() {
		return technik_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnik_Art_TypeClass_Wert() {
		return (EAttribute)technik_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnik_Beschreibung_TypeClass() {
		return technik_Beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnik_Beschreibung_TypeClass_Wert() {
		return (EAttribute)technik_Beschreibung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnik_Standort() {
		return technik_StandortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnik_Standort_Bezeichnung() {
		return (EReference)technik_StandortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnik_Standort_IDBedienStandort() {
		return (EReference)technik_StandortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnik_Standort_IDUnterbringung() {
		return (EReference)technik_StandortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnik_Standort_TSOIPAdressblock() {
		return (EReference)technik_StandortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnik_Standort_Bezeichnung_AttributeGroup() {
		return technik_Standort_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnik_Standort_Bezeichnung_AttributeGroup_BezeichnungTSO() {
		return (EReference)technik_Standort_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSO_IP_AB_Teilsystem_AttributeGroup() {
		return tsO_IP_AB_Teilsystem_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau() {
		return (EReference)tsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau() {
		return (EReference)tsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_AB_Teilsystem_AttributeGroup_TSOTeilsystemArt() {
		return (EReference)tsO_IP_AB_Teilsystem_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSO_IP_Adressblock_AttributeGroup() {
		return tsO_IP_Adressblock_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_Regionalbereich() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSO_IP_Adressblock_AttributeGroup_TSOIPABTeilsystem() {
		return (EReference)tsO_IP_Adressblock_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSO_Teilsystem_Art_TypeClass() {
		return tsO_Teilsystem_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSO_Teilsystem_Art_TypeClass_Wert() {
		return (EAttribute)tsO_Teilsystem_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUebertragungsweg() {
		return uebertragungswegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_IDAnhangUeWegNach() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_IDAnhangUeWegVon() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_IDUebertragungswegNach() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_IDUebertragungswegVon() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_UebertragungswegArt() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_UebertragungswegTechnik() {
		return (EReference)uebertragungswegEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUebertragungsweg_Art_TypeClass() {
		return uebertragungsweg_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUebertragungsweg_Art_TypeClass_Wert() {
		return (EAttribute)uebertragungsweg_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUebertragungsweg_Technik_AttributeGroup() {
		return uebertragungsweg_Technik_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_Technik_AttributeGroup_Bandbreite() {
		return (EReference)uebertragungsweg_Technik_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_Technik_AttributeGroup_MediumArt() {
		return (EReference)uebertragungsweg_Technik_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_Technik_AttributeGroup_NetzArt() {
		return (EReference)uebertragungsweg_Technik_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_Technik_AttributeGroup_TechnikArt() {
		return (EReference)uebertragungsweg_Technik_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUebertragungsweg_Technik_AttributeGroup_TechnikBeschreibung() {
		return (EReference)uebertragungsweg_Technik_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterbringung() {
		return unterbringungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_PunktObjektStrecke() {
		return (EReference)unterbringungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_UnterbringungAllg() {
		return (EReference)unterbringungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_IDGEOPunkt() {
		return (EReference)unterbringungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_PunktObjektTOPKante() {
		return (EReference)unterbringungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_StandortBeschreibung() {
		return (EReference)unterbringungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterbringung_Allg_AttributeGroup() {
		return unterbringung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_Allg_AttributeGroup_Hersteller() {
		return (EReference)unterbringung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_Allg_AttributeGroup_UnterbringungArt() {
		return (EReference)unterbringung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterbringung_Allg_AttributeGroup_UnterbringungBefestigung() {
		return (EReference)unterbringung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterbringung_Art_TypeClass() {
		return unterbringung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterbringung_Art_TypeClass_Wert() {
		return (EAttribute)unterbringung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterbringung_Befestigung_TypeClass() {
		return unterbringung_Befestigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterbringung_Befestigung_TypeClass_Wert() {
		return (EAttribute)unterbringung_Befestigung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAussenelementansteuerungArt() {
		return enumAussenelementansteuerungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBandbreite() {
		return enumBandbreiteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMEVArt() {
		return enumevArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGFKKategorie() {
		return enumgfkKategorieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMediumArt() {
		return enumMediumArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNetzArt() {
		return enumNetzArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTechnikArt() {
		return enumTechnikArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTSOTeilsystemArt() {
		return enumtsoTeilsystemArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUebertragungswegArt() {
		return enumUebertragungswegArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUnterbringungArt() {
		return enumUnterbringungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMUnterbringungBefestigung() {
		return enumUnterbringungBefestigungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBauart_Type() {
		return bauart_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_AEA_Type() {
		return bezeichnung_AEA_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_ESTW_ZE_Type() {
		return bezeichnung_ESTW_ZE_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_TSO_Type() {
		return bezeichnung_TSO_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAussenelementansteuerungArtObject() {
		return enumAussenelementansteuerungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBandbreiteObject() {
		return enumBandbreiteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMEVArtObject() {
		return enumevArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGFKKategorieObject() {
		return enumgfkKategorieObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMediumArtObject() {
		return enumMediumArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNetzArtObject() {
		return enumNetzArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTechnikArtObject() {
		return enumTechnikArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTSOTeilsystemArtObject() {
		return enumtsoTeilsystemArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUebertragungswegArtObject() {
		return enumUebertragungswegArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUnterbringungArtObject() {
		return enumUnterbringungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMUnterbringungBefestigungObject() {
		return enumUnterbringungBefestigungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_Type() {
		return iP_Adressblock_Blau_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_V4_Type() {
		return iP_Adressblock_Blau_V4_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Blau_V6_Type() {
		return iP_Adressblock_Blau_V6_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_Type() {
		return iP_Adressblock_Grau_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_V4_Type() {
		return iP_Adressblock_Grau_V4_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIP_Adressblock_Grau_V6_Type() {
		return iP_Adressblock_Grau_V6_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStandort_Beschreibung_Type() {
		return standort_Beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTechnik_Beschreibung_Type() {
		return technik_Beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ansteuerung_ElementFactory getAnsteuerung_ElementFactory() {
		return (Ansteuerung_ElementFactory)getEFactoryInstance();
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
		aeA_Allg_AttributeGroupEClass = createEClass(AEA_ALLG_ATTRIBUTE_GROUP);
		createEReference(aeA_Allg_AttributeGroupEClass, AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART);
		createEReference(aeA_Allg_AttributeGroupEClass, AEA_ALLG_ATTRIBUTE_GROUP__BAUART);

		aeA_Energieversorgung_AttributeGroupEClass = createEClass(AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP);
		createEReference(aeA_Energieversorgung_AttributeGroupEClass, AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ);
		createEReference(aeA_Energieversorgung_AttributeGroupEClass, AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER);
		createEReference(aeA_Energieversorgung_AttributeGroupEClass, AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART);
		createEReference(aeA_Energieversorgung_AttributeGroupEClass, AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER);

		aeA_GFK_IP_Adressblock_AttributeGroupEClass = createEClass(AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__GFK_KATEGORIE);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6);
		createEReference(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH);

		aussenelementansteuerungEClass = createEClass(AUSSENELEMENTANSTEUERUNG);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__AEA_ALLG);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND);
		createEReference(aussenelementansteuerungEClass, AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG);

		aussenelementansteuerung_Art_TypeClassEClass = createEClass(AUSSENELEMENTANSTEUERUNG_ART_TYPE_CLASS);
		createEAttribute(aussenelementansteuerung_Art_TypeClassEClass, AUSSENELEMENTANSTEUERUNG_ART_TYPE_CLASS__WERT);

		aussenelementansteuerung_Bezeichnung_AttributeGroupEClass = createEClass(AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(aussenelementansteuerung_Bezeichnung_AttributeGroupEClass, AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA);

		bandbreite_TypeClassEClass = createEClass(BANDBREITE_TYPE_CLASS);
		createEAttribute(bandbreite_TypeClassEClass, BANDBREITE_TYPE_CLASS__WERT);

		bauart_TypeClassEClass = createEClass(BAUART_TYPE_CLASS);
		createEAttribute(bauart_TypeClassEClass, BAUART_TYPE_CLASS__WERT);

		bezeichnung_AEA_TypeClassEClass = createEClass(BEZEICHNUNG_AEA_TYPE_CLASS);
		createEAttribute(bezeichnung_AEA_TypeClassEClass, BEZEICHNUNG_AEA_TYPE_CLASS__WERT);

		bezeichnung_ESTW_ZE_TypeClassEClass = createEClass(BEZEICHNUNG_ESTW_ZE_TYPE_CLASS);
		createEAttribute(bezeichnung_ESTW_ZE_TypeClassEClass, BEZEICHNUNG_ESTW_ZE_TYPE_CLASS__WERT);

		bezeichnung_TSO_TypeClassEClass = createEClass(BEZEICHNUNG_TSO_TYPE_CLASS);
		createEAttribute(bezeichnung_TSO_TypeClassEClass, BEZEICHNUNG_TSO_TYPE_CLASS__WERT);

		energieversorgung_Art_Ersatz_TypeClassEClass = createEClass(ENERGIEVERSORGUNG_ART_ERSATZ_TYPE_CLASS);
		createEAttribute(energieversorgung_Art_Ersatz_TypeClassEClass, ENERGIEVERSORGUNG_ART_ERSATZ_TYPE_CLASS__WERT);

		energieversorgung_Art_TypeClassEClass = createEClass(ENERGIEVERSORGUNG_ART_TYPE_CLASS);
		createEAttribute(energieversorgung_Art_TypeClassEClass, ENERGIEVERSORGUNG_ART_TYPE_CLASS__WERT);

		estW_ZentraleinheitEClass = createEClass(ESTW_ZENTRALEINHEIT);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__BEZEICHNUNG);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL);
		createEReference(estW_ZentraleinheitEClass, ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL);

		estW_Zentraleinheit_Allg_AttributeGroupEClass = createEClass(ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP);
		createEReference(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART);
		createEReference(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART);
		createEReference(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ);
		createEReference(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2);
		createEReference(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER);

		estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass = createEClass(ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass, ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE);

		gfK_Kategorie_TypeClassEClass = createEClass(GFK_KATEGORIE_TYPE_CLASS);
		createEAttribute(gfK_Kategorie_TypeClassEClass, GFK_KATEGORIE_TYPE_CLASS__WERT);

		hersteller_TypeClassEClass = createEClass(HERSTELLER_TYPE_CLASS);
		createEAttribute(hersteller_TypeClassEClass, HERSTELLER_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_TypeClassEClass, IP_ADRESSBLOCK_BLAU_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_V4_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_V4_TypeClassEClass, IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS__WERT);

		iP_Adressblock_Blau_V6_TypeClassEClass = createEClass(IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Blau_V6_TypeClassEClass, IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_TypeClassEClass, IP_ADRESSBLOCK_GRAU_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_V4_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_V4_TypeClassEClass, IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS__WERT);

		iP_Adressblock_Grau_V6_TypeClassEClass = createEClass(IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS);
		createEAttribute(iP_Adressblock_Grau_V6_TypeClassEClass, IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS__WERT);

		medium_Art_TypeClassEClass = createEClass(MEDIUM_ART_TYPE_CLASS);
		createEAttribute(medium_Art_TypeClassEClass, MEDIUM_ART_TYPE_CLASS__WERT);

		netz_Art_TypeClassEClass = createEClass(NETZ_ART_TYPE_CLASS);
		createEAttribute(netz_Art_TypeClassEClass, NETZ_ART_TYPE_CLASS__WERT);

		regionalbereich_TypeClassEClass = createEClass(REGIONALBEREICH_TYPE_CLASS);
		createEAttribute(regionalbereich_TypeClassEClass, REGIONALBEREICH_TYPE_CLASS__WERT);

		standort_Beschreibung_TypeClassEClass = createEClass(STANDORT_BESCHREIBUNG_TYPE_CLASS);
		createEAttribute(standort_Beschreibung_TypeClassEClass, STANDORT_BESCHREIBUNG_TYPE_CLASS__WERT);

		stell_BereichEClass = createEClass(STELL_BEREICH);
		createEReference(stell_BereichEClass, STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG);

		stellelementEClass = createEClass(STELLELEMENT);
		createEReference(stellelementEClass, STELLELEMENT__ID_ENERGIE);
		createEReference(stellelementEClass, STELLELEMENT__ID_INFORMATION);

		technik_Art_TypeClassEClass = createEClass(TECHNIK_ART_TYPE_CLASS);
		createEAttribute(technik_Art_TypeClassEClass, TECHNIK_ART_TYPE_CLASS__WERT);

		technik_Beschreibung_TypeClassEClass = createEClass(TECHNIK_BESCHREIBUNG_TYPE_CLASS);
		createEAttribute(technik_Beschreibung_TypeClassEClass, TECHNIK_BESCHREIBUNG_TYPE_CLASS__WERT);

		technik_StandortEClass = createEClass(TECHNIK_STANDORT);
		createEReference(technik_StandortEClass, TECHNIK_STANDORT__BEZEICHNUNG);
		createEReference(technik_StandortEClass, TECHNIK_STANDORT__ID_BEDIEN_STANDORT);
		createEReference(technik_StandortEClass, TECHNIK_STANDORT__ID_UNTERBRINGUNG);
		createEReference(technik_StandortEClass, TECHNIK_STANDORT__TSOIP_ADRESSBLOCK);

		technik_Standort_Bezeichnung_AttributeGroupEClass = createEClass(TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(technik_Standort_Bezeichnung_AttributeGroupEClass, TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO);

		tsO_IP_AB_Teilsystem_AttributeGroupEClass = createEClass(TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP);
		createEReference(tsO_IP_AB_Teilsystem_AttributeGroupEClass, TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU);
		createEReference(tsO_IP_AB_Teilsystem_AttributeGroupEClass, TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU);
		createEReference(tsO_IP_AB_Teilsystem_AttributeGroupEClass, TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP__TSO_TEILSYSTEM_ART);

		tsO_IP_Adressblock_AttributeGroupEClass = createEClass(TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V4);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_BLAU_V6);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V4);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__IP_ADRESSBLOCK_GRAU_V6);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__REGIONALBEREICH);
		createEReference(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP__TSOIPAB_TEILSYSTEM);

		tsO_Teilsystem_Art_TypeClassEClass = createEClass(TSO_TEILSYSTEM_ART_TYPE_CLASS);
		createEAttribute(tsO_Teilsystem_Art_TypeClassEClass, TSO_TEILSYSTEM_ART_TYPE_CLASS__WERT);

		uebertragungswegEClass = createEClass(UEBERTRAGUNGSWEG);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART);
		createEReference(uebertragungswegEClass, UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK);

		uebertragungsweg_Art_TypeClassEClass = createEClass(UEBERTRAGUNGSWEG_ART_TYPE_CLASS);
		createEAttribute(uebertragungsweg_Art_TypeClassEClass, UEBERTRAGUNGSWEG_ART_TYPE_CLASS__WERT);

		uebertragungsweg_Technik_AttributeGroupEClass = createEClass(UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP);
		createEReference(uebertragungsweg_Technik_AttributeGroupEClass, UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__BANDBREITE);
		createEReference(uebertragungsweg_Technik_AttributeGroupEClass, UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__MEDIUM_ART);
		createEReference(uebertragungsweg_Technik_AttributeGroupEClass, UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__NETZ_ART);
		createEReference(uebertragungsweg_Technik_AttributeGroupEClass, UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_ART);
		createEReference(uebertragungsweg_Technik_AttributeGroupEClass, UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP__TECHNIK_BESCHREIBUNG);

		unterbringungEClass = createEClass(UNTERBRINGUNG);
		createEReference(unterbringungEClass, UNTERBRINGUNG__PUNKT_OBJEKT_STRECKE);
		createEReference(unterbringungEClass, UNTERBRINGUNG__UNTERBRINGUNG_ALLG);
		createEReference(unterbringungEClass, UNTERBRINGUNG__IDGEO_PUNKT);
		createEReference(unterbringungEClass, UNTERBRINGUNG__PUNKT_OBJEKT_TOP_KANTE);
		createEReference(unterbringungEClass, UNTERBRINGUNG__STANDORT_BESCHREIBUNG);

		unterbringung_Allg_AttributeGroupEClass = createEClass(UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(unterbringung_Allg_AttributeGroupEClass, UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__HERSTELLER);
		createEReference(unterbringung_Allg_AttributeGroupEClass, UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_ART);
		createEReference(unterbringung_Allg_AttributeGroupEClass, UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP__UNTERBRINGUNG_BEFESTIGUNG);

		unterbringung_Art_TypeClassEClass = createEClass(UNTERBRINGUNG_ART_TYPE_CLASS);
		createEAttribute(unterbringung_Art_TypeClassEClass, UNTERBRINGUNG_ART_TYPE_CLASS__WERT);

		unterbringung_Befestigung_TypeClassEClass = createEClass(UNTERBRINGUNG_BEFESTIGUNG_TYPE_CLASS);
		createEAttribute(unterbringung_Befestigung_TypeClassEClass, UNTERBRINGUNG_BEFESTIGUNG_TYPE_CLASS__WERT);

		// Create enums
		enumAussenelementansteuerungArtEEnum = createEEnum(ENUM_AUSSENELEMENTANSTEUERUNG_ART);
		enumBandbreiteEEnum = createEEnum(ENUM_BANDBREITE);
		enumevArtEEnum = createEEnum(ENUMEV_ART);
		enumgfkKategorieEEnum = createEEnum(ENUMGFK_KATEGORIE);
		enumMediumArtEEnum = createEEnum(ENUM_MEDIUM_ART);
		enumNetzArtEEnum = createEEnum(ENUM_NETZ_ART);
		enumTechnikArtEEnum = createEEnum(ENUM_TECHNIK_ART);
		enumtsoTeilsystemArtEEnum = createEEnum(ENUMTSO_TEILSYSTEM_ART);
		enumUebertragungswegArtEEnum = createEEnum(ENUM_UEBERTRAGUNGSWEG_ART);
		enumUnterbringungArtEEnum = createEEnum(ENUM_UNTERBRINGUNG_ART);
		enumUnterbringungBefestigungEEnum = createEEnum(ENUM_UNTERBRINGUNG_BEFESTIGUNG);

		// Create data types
		bauart_TypeEDataType = createEDataType(BAUART_TYPE);
		bezeichnung_AEA_TypeEDataType = createEDataType(BEZEICHNUNG_AEA_TYPE);
		bezeichnung_ESTW_ZE_TypeEDataType = createEDataType(BEZEICHNUNG_ESTW_ZE_TYPE);
		bezeichnung_TSO_TypeEDataType = createEDataType(BEZEICHNUNG_TSO_TYPE);
		enumAussenelementansteuerungArtObjectEDataType = createEDataType(ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJECT);
		enumBandbreiteObjectEDataType = createEDataType(ENUM_BANDBREITE_OBJECT);
		enumevArtObjectEDataType = createEDataType(ENUMEV_ART_OBJECT);
		enumgfkKategorieObjectEDataType = createEDataType(ENUMGFK_KATEGORIE_OBJECT);
		enumMediumArtObjectEDataType = createEDataType(ENUM_MEDIUM_ART_OBJECT);
		enumNetzArtObjectEDataType = createEDataType(ENUM_NETZ_ART_OBJECT);
		enumTechnikArtObjectEDataType = createEDataType(ENUM_TECHNIK_ART_OBJECT);
		enumtsoTeilsystemArtObjectEDataType = createEDataType(ENUMTSO_TEILSYSTEM_ART_OBJECT);
		enumUebertragungswegArtObjectEDataType = createEDataType(ENUM_UEBERTRAGUNGSWEG_ART_OBJECT);
		enumUnterbringungArtObjectEDataType = createEDataType(ENUM_UNTERBRINGUNG_ART_OBJECT);
		enumUnterbringungBefestigungObjectEDataType = createEDataType(ENUM_UNTERBRINGUNG_BEFESTIGUNG_OBJECT);
		iP_Adressblock_Blau_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_TYPE);
		iP_Adressblock_Blau_V4_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_V4_TYPE);
		iP_Adressblock_Blau_V6_TypeEDataType = createEDataType(IP_ADRESSBLOCK_BLAU_V6_TYPE);
		iP_Adressblock_Grau_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_TYPE);
		iP_Adressblock_Grau_V4_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_V4_TYPE);
		iP_Adressblock_Grau_V6_TypeEDataType = createEDataType(IP_ADRESSBLOCK_GRAU_V6_TYPE);
		standort_Beschreibung_TypeEDataType = createEDataType(STANDORT_BESCHREIBUNG_TYPE);
		technik_Beschreibung_TypeEDataType = createEDataType(TECHNIK_BESCHREIBUNG_TYPE);
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
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisTypenPackage theBasisTypenPackage = (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aussenelementansteuerungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		aussenelementansteuerung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bandbreite_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bauart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_AEA_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_ESTW_ZE_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_TSO_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		energieversorgung_Art_Ersatz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		energieversorgung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		estW_ZentraleinheitEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		gfK_Kategorie_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hersteller_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_V4_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Blau_V6_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_V4_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		iP_Adressblock_Grau_V6_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		medium_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		netz_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		regionalbereich_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		standort_Beschreibung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		stell_BereichEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		stellelementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		technik_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		technik_Beschreibung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		technik_StandortEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		tsO_Teilsystem_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		uebertragungswegEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		uebertragungsweg_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		unterbringungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		unterbringung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		unterbringung_Befestigung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(aeA_Allg_AttributeGroupEClass, AEA_Allg_AttributeGroup.class, "AEA_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAEA_Allg_AttributeGroup_AussenelementansteuerungArt(), this.getAussenelementansteuerung_Art_TypeClass(), null, "aussenelementansteuerungArt", null, 1, 1, AEA_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_Allg_AttributeGroup_Bauart(), this.getBauart_TypeClass(), null, "bauart", null, 0, 1, AEA_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aeA_Energieversorgung_AttributeGroupEClass, AEA_Energieversorgung_AttributeGroup.class, "AEA_Energieversorgung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz(), this.getEnergieversorgung_Art_Ersatz_TypeClass(), null, "energieversorgungArtErsatz", null, 0, 1, AEA_Energieversorgung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_Energieversorgung_AttributeGroup_IDEnergieSekundaer(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDEnergieSekundaer", null, 0, 1, AEA_Energieversorgung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArt(), this.getEnergieversorgung_Art_TypeClass(), null, "energieversorgungArt", null, 0, 1, AEA_Energieversorgung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_Energieversorgung_AttributeGroup_IDEnergiePrimaer(), theVerweisePackage.getID_Energie_Primaer_TypeClass(), null, "iDEnergiePrimaer", null, 0, 1, AEA_Energieversorgung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aeA_GFK_IP_Adressblock_AttributeGroupEClass, AEA_GFK_IP_Adressblock_AttributeGroup.class, "AEA_GFK_IP_Adressblock_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_GFKKategorie(), this.getGFK_Kategorie_TypeClass(), null, "gFKKategorie", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(), this.getIP_Adressblock_Blau_V4_TypeClass(), null, "iPAdressblockBlauV4", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(), this.getIP_Adressblock_Blau_V6_TypeClass(), null, "iPAdressblockBlauV6", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(), this.getIP_Adressblock_Grau_V4_TypeClass(), null, "iPAdressblockGrauV4", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(), this.getIP_Adressblock_Grau_V6_TypeClass(), null, "iPAdressblockGrauV6", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEA_GFK_IP_Adressblock_AttributeGroup_Regionalbereich(), this.getRegionalbereich_TypeClass(), null, "regionalbereich", null, 1, 1, AEA_GFK_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussenelementansteuerungEClass, Aussenelementansteuerung.class, "Aussenelementansteuerung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAussenelementansteuerung_AEAAllg(), this.getAEA_Allg_AttributeGroup(), null, "aEAAllg", null, 1, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_AEAEnergieversorgung(), this.getAEA_Energieversorgung_AttributeGroup(), null, "aEAEnergieversorgung", null, 0, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_AEAGFKIPAdressblock(), this.getAEA_GFK_IP_Adressblock_AttributeGroup(), null, "aEAGFKIPAdressblock", null, 0, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_Bezeichnung(), this.getAussenelementansteuerung_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_IDInformationPrimaer(), theVerweisePackage.getID_Information_Primaer_TypeClass(), null, "iDInformationPrimaer", null, 0, 5, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_IDInformationSekundaer(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDInformationSekundaer", null, 0, 5, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_IDOertlichkeitGesteuert(), theVerweisePackage.getID_Oertlichkeit_TypeClass(), null, "iDOertlichkeitGesteuert", null, 0, -1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_IDOertlichkeitNamensgebend(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeitNamensgebend", null, 0, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussenelementansteuerung_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 0, 1, Aussenelementansteuerung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussenelementansteuerung_Art_TypeClassEClass, Aussenelementansteuerung_Art_TypeClass.class, "Aussenelementansteuerung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAussenelementansteuerung_Art_TypeClass_Wert(), this.getENUMAussenelementansteuerungArtObject(), "wert", null, 1, 1, Aussenelementansteuerung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussenelementansteuerung_Bezeichnung_AttributeGroupEClass, Aussenelementansteuerung_Bezeichnung_AttributeGroup.class, "Aussenelementansteuerung_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA(), this.getBezeichnung_AEA_TypeClass(), null, "bezeichnungAEA", null, 1, 1, Aussenelementansteuerung_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bandbreite_TypeClassEClass, Bandbreite_TypeClass.class, "Bandbreite_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandbreite_TypeClass_Wert(), this.getENUMBandbreiteObject(), "wert", null, 1, 1, Bandbreite_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bauart_TypeClassEClass, Bauart_TypeClass.class, "Bauart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBauart_TypeClass_Wert(), this.getBauart_Type(), "wert", null, 1, 1, Bauart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_AEA_TypeClassEClass, Bezeichnung_AEA_TypeClass.class, "Bezeichnung_AEA_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_AEA_TypeClass_Wert(), this.getBezeichnung_AEA_Type(), "wert", null, 1, 1, Bezeichnung_AEA_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_ESTW_ZE_TypeClassEClass, Bezeichnung_ESTW_ZE_TypeClass.class, "Bezeichnung_ESTW_ZE_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_ESTW_ZE_TypeClass_Wert(), this.getBezeichnung_ESTW_ZE_Type(), "wert", null, 1, 1, Bezeichnung_ESTW_ZE_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_TSO_TypeClassEClass, Bezeichnung_TSO_TypeClass.class, "Bezeichnung_TSO_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_TSO_TypeClass_Wert(), this.getBezeichnung_TSO_Type(), "wert", null, 1, 1, Bezeichnung_TSO_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energieversorgung_Art_Ersatz_TypeClassEClass, Energieversorgung_Art_Ersatz_TypeClass.class, "Energieversorgung_Art_Ersatz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergieversorgung_Art_Ersatz_TypeClass_Wert(), this.getENUMEVArtObject(), "wert", null, 1, 1, Energieversorgung_Art_Ersatz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energieversorgung_Art_TypeClassEClass, Energieversorgung_Art_TypeClass.class, "Energieversorgung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergieversorgung_Art_TypeClass_Wert(), this.getENUMEVArtObject(), "wert", null, 1, 1, Energieversorgung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estW_ZentraleinheitEClass, ESTW_Zentraleinheit.class, "ESTW_Zentraleinheit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESTW_Zentraleinheit_Bezeichnung(), this.getESTW_Zentraleinheit_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_ESTWZentraleinheitAllg(), this.getESTW_Zentraleinheit_Allg_AttributeGroup(), null, "eSTWZentraleinheitAllg", null, 1, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_IDOertlichkeitNamensgebend(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeitNamensgebend", null, 0, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_Technik_TypeClass(), null, "iDUnterbringung", null, 1, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_IDBedienBezirkVirtuell(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirkVirtuell", null, 0, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_IDBedienBezirkZentral(), theVerweisePackage.getID_Bedien_Bezirk_TypeClass(), null, "iDBedienBezirkZentral", null, 0, 1, ESTW_Zentraleinheit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estW_Zentraleinheit_Allg_AttributeGroupEClass, ESTW_Zentraleinheit_Allg_AttributeGroup.class, "ESTW_Zentraleinheit_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart(), this.getBauart_TypeClass(), null, "bauart", null, 0, 1, ESTW_Zentraleinheit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArt(), this.getEnergieversorgung_Art_TypeClass(), null, "energieversorgungArt", null, 1, 1, ESTW_Zentraleinheit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz(), this.getEnergieversorgung_Art_Ersatz_TypeClass(), null, "energieversorgungArtErsatz", null, 0, 1, ESTW_Zentraleinheit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz2(), this.getEnergieversorgung_Art_Ersatz_TypeClass(), null, "energieversorgungArtErsatz2", null, 0, 1, ESTW_Zentraleinheit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller(), this.getHersteller_TypeClass(), null, "hersteller", null, 0, 1, ESTW_Zentraleinheit_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass, ESTW_Zentraleinheit_Bezeichnung_AttributeGroup.class, "ESTW_Zentraleinheit_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESTW_Zentraleinheit_Bezeichnung_AttributeGroup_BezeichnungESTWZE(), this.getBezeichnung_ESTW_ZE_TypeClass(), null, "bezeichnungESTWZE", null, 1, 1, ESTW_Zentraleinheit_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gfK_Kategorie_TypeClassEClass, GFK_Kategorie_TypeClass.class, "GFK_Kategorie_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGFK_Kategorie_TypeClass_Wert(), this.getENUMGFKKategorieObject(), "wert", null, 1, 1, GFK_Kategorie_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hersteller_TypeClassEClass, Hersteller_TypeClass.class, "Hersteller_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHersteller_TypeClass_Wert(), theBasisTypenPackage.getHersteller_Type(), "wert", null, 1, 1, Hersteller_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_TypeClassEClass, IP_Adressblock_Blau_TypeClass.class, "IP_Adressblock_Blau_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_TypeClass_Wert(), this.getIP_Adressblock_Blau_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_V4_TypeClassEClass, IP_Adressblock_Blau_V4_TypeClass.class, "IP_Adressblock_Blau_V4_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_V4_TypeClass_Wert(), this.getIP_Adressblock_Blau_V4_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_V4_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Blau_V6_TypeClassEClass, IP_Adressblock_Blau_V6_TypeClass.class, "IP_Adressblock_Blau_V6_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Blau_V6_TypeClass_Wert(), this.getIP_Adressblock_Blau_V6_Type(), "wert", null, 1, 1, IP_Adressblock_Blau_V6_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_TypeClassEClass, IP_Adressblock_Grau_TypeClass.class, "IP_Adressblock_Grau_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_TypeClass_Wert(), this.getIP_Adressblock_Grau_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_V4_TypeClassEClass, IP_Adressblock_Grau_V4_TypeClass.class, "IP_Adressblock_Grau_V4_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_V4_TypeClass_Wert(), this.getIP_Adressblock_Grau_V4_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_V4_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iP_Adressblock_Grau_V6_TypeClassEClass, IP_Adressblock_Grau_V6_TypeClass.class, "IP_Adressblock_Grau_V6_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIP_Adressblock_Grau_V6_TypeClass_Wert(), this.getIP_Adressblock_Grau_V6_Type(), "wert", null, 1, 1, IP_Adressblock_Grau_V6_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medium_Art_TypeClassEClass, Medium_Art_TypeClass.class, "Medium_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedium_Art_TypeClass_Wert(), this.getENUMMediumArtObject(), "wert", null, 1, 1, Medium_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netz_Art_TypeClassEClass, Netz_Art_TypeClass.class, "Netz_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetz_Art_TypeClass_Wert(), this.getENUMNetzArtObject(), "wert", null, 1, 1, Netz_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalbereich_TypeClassEClass, Regionalbereich_TypeClass.class, "Regionalbereich_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionalbereich_TypeClass_Wert(), theBasisTypenPackage.getRegionalbereich_Type(), "wert", null, 1, 1, Regionalbereich_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standort_Beschreibung_TypeClassEClass, Standort_Beschreibung_TypeClass.class, "Standort_Beschreibung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandort_Beschreibung_TypeClass_Wert(), this.getStandort_Beschreibung_Type(), "wert", null, 1, 1, Standort_Beschreibung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stell_BereichEClass, Stell_Bereich.class, "Stell_Bereich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStell_Bereich_IDAussenelementansteuerung(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDAussenelementansteuerung", null, 1, 1, Stell_Bereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stellelementEClass, Stellelement.class, "Stellelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStellelement_IDEnergie(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDEnergie", null, 1, 1, Stellelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStellelement_IDInformation(), theVerweisePackage.getID_Aussenelementansteuerung_TypeClass(), null, "iDInformation", null, 1, 1, Stellelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technik_Art_TypeClassEClass, Technik_Art_TypeClass.class, "Technik_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnik_Art_TypeClass_Wert(), this.getENUMTechnikArtObject(), "wert", null, 1, 1, Technik_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technik_Beschreibung_TypeClassEClass, Technik_Beschreibung_TypeClass.class, "Technik_Beschreibung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnik_Beschreibung_TypeClass_Wert(), this.getTechnik_Beschreibung_Type(), "wert", null, 1, 1, Technik_Beschreibung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technik_StandortEClass, Technik_Standort.class, "Technik_Standort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnik_Standort_Bezeichnung(), this.getTechnik_Standort_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Technik_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnik_Standort_IDBedienStandort(), theVerweisePackage.getID_Bedien_Standort_TypeClass(), null, "iDBedienStandort", null, 0, -1, Technik_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnik_Standort_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Technik_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnik_Standort_TSOIPAdressblock(), this.getTSO_IP_Adressblock_AttributeGroup(), null, "tSOIPAdressblock", null, 0, 1, Technik_Standort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technik_Standort_Bezeichnung_AttributeGroupEClass, Technik_Standort_Bezeichnung_AttributeGroup.class, "Technik_Standort_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnik_Standort_Bezeichnung_AttributeGroup_BezeichnungTSO(), this.getBezeichnung_TSO_TypeClass(), null, "bezeichnungTSO", null, 1, 1, Technik_Standort_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsO_IP_AB_Teilsystem_AttributeGroupEClass, TSO_IP_AB_Teilsystem_AttributeGroup.class, "TSO_IP_AB_Teilsystem_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(), this.getIP_Adressblock_Blau_TypeClass(), null, "iPAdressblockBlau", null, 1, 1, TSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(), this.getIP_Adressblock_Grau_TypeClass(), null, "iPAdressblockGrau", null, 1, 1, TSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_AB_Teilsystem_AttributeGroup_TSOTeilsystemArt(), this.getTSO_Teilsystem_Art_TypeClass(), null, "tSOTeilsystemArt", null, 1, 1, TSO_IP_AB_Teilsystem_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsO_IP_Adressblock_AttributeGroupEClass, TSO_IP_Adressblock_AttributeGroup.class, "TSO_IP_Adressblock_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(), this.getIP_Adressblock_Blau_V4_TypeClass(), null, "iPAdressblockBlauV4", null, 1, 1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(), this.getIP_Adressblock_Blau_V6_TypeClass(), null, "iPAdressblockBlauV6", null, 1, 1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(), this.getIP_Adressblock_Grau_V4_TypeClass(), null, "iPAdressblockGrauV4", null, 1, 1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(), this.getIP_Adressblock_Grau_V6_TypeClass(), null, "iPAdressblockGrauV6", null, 1, 1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_Regionalbereich(), this.getRegionalbereich_TypeClass(), null, "regionalbereich", null, 1, 1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSO_IP_Adressblock_AttributeGroup_TSOIPABTeilsystem(), this.getTSO_IP_AB_Teilsystem_AttributeGroup(), null, "tSOIPABTeilsystem", null, 0, -1, TSO_IP_Adressblock_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsO_Teilsystem_Art_TypeClassEClass, TSO_Teilsystem_Art_TypeClass.class, "TSO_Teilsystem_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTSO_Teilsystem_Art_TypeClass_Wert(), this.getENUMTSOTeilsystemArtObject(), "wert", null, 1, 1, TSO_Teilsystem_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uebertragungswegEClass, Uebertragungsweg.class, "Uebertragungsweg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUebertragungsweg_IDAnhangUeWegNach(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangUeWegNach", null, 0, -1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_IDAnhangUeWegVon(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangUeWegVon", null, 0, -1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_IDUebertragungswegNach(), theVerweisePackage.getID_Uebertragungsweg_Nach_TypeClass(), null, "iDUebertragungswegNach", null, 1, 1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_IDUebertragungswegVon(), theVerweisePackage.getID_Uebertragungsweg_Von_TypeClass(), null, "iDUebertragungswegVon", null, 1, 1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_UebertragungswegArt(), this.getUebertragungsweg_Art_TypeClass(), null, "uebertragungswegArt", null, 1, 1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_UebertragungswegTechnik(), this.getUebertragungsweg_Technik_AttributeGroup(), null, "uebertragungswegTechnik", null, 1, 1, Uebertragungsweg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uebertragungsweg_Art_TypeClassEClass, Uebertragungsweg_Art_TypeClass.class, "Uebertragungsweg_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUebertragungsweg_Art_TypeClass_Wert(), this.getENUMUebertragungswegArtObject(), "wert", null, 1, 1, Uebertragungsweg_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uebertragungsweg_Technik_AttributeGroupEClass, Uebertragungsweg_Technik_AttributeGroup.class, "Uebertragungsweg_Technik_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUebertragungsweg_Technik_AttributeGroup_Bandbreite(), this.getBandbreite_TypeClass(), null, "bandbreite", null, 0, 1, Uebertragungsweg_Technik_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_Technik_AttributeGroup_MediumArt(), this.getMedium_Art_TypeClass(), null, "mediumArt", null, 0, 1, Uebertragungsweg_Technik_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_Technik_AttributeGroup_NetzArt(), this.getNetz_Art_TypeClass(), null, "netzArt", null, 0, 1, Uebertragungsweg_Technik_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_Technik_AttributeGroup_TechnikArt(), this.getTechnik_Art_TypeClass(), null, "technikArt", null, 1, 1, Uebertragungsweg_Technik_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUebertragungsweg_Technik_AttributeGroup_TechnikBeschreibung(), this.getTechnik_Beschreibung_TypeClass(), null, "technikBeschreibung", null, 0, 1, Uebertragungsweg_Technik_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterbringungEClass, Unterbringung.class, "Unterbringung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnterbringung_PunktObjektStrecke(), theBasisobjektePackage.getPunkt_Objekt_Strecke_AttributeGroup(), null, "punktObjektStrecke", null, 0, -1, Unterbringung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_UnterbringungAllg(), this.getUnterbringung_Allg_AttributeGroup(), null, "unterbringungAllg", null, 1, 1, Unterbringung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_IDGEOPunkt(), theVerweisePackage.getID_GEO_Punkt_TypeClass(), null, "iDGEOPunkt", null, 0, 1, Unterbringung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_PunktObjektTOPKante(), theBasisobjektePackage.getPunkt_Objekt_TOP_Kante_AttributeGroup(), null, "punktObjektTOPKante", null, 0, 1, Unterbringung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_StandortBeschreibung(), this.getStandort_Beschreibung_TypeClass(), null, "standortBeschreibung", null, 0, 1, Unterbringung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterbringung_Allg_AttributeGroupEClass, Unterbringung_Allg_AttributeGroup.class, "Unterbringung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnterbringung_Allg_AttributeGroup_Hersteller(), this.getHersteller_TypeClass(), null, "hersteller", null, 0, 1, Unterbringung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_Allg_AttributeGroup_UnterbringungArt(), this.getUnterbringung_Art_TypeClass(), null, "unterbringungArt", null, 1, 1, Unterbringung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnterbringung_Allg_AttributeGroup_UnterbringungBefestigung(), this.getUnterbringung_Befestigung_TypeClass(), null, "unterbringungBefestigung", null, 1, 1, Unterbringung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterbringung_Art_TypeClassEClass, Unterbringung_Art_TypeClass.class, "Unterbringung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnterbringung_Art_TypeClass_Wert(), this.getENUMUnterbringungArtObject(), "wert", null, 1, 1, Unterbringung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unterbringung_Befestigung_TypeClassEClass, Unterbringung_Befestigung_TypeClass.class, "Unterbringung_Befestigung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnterbringung_Befestigung_TypeClass_Wert(), this.getENUMUnterbringungBefestigungObject(), "wert", null, 1, 1, Unterbringung_Befestigung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.class, "ENUMAussenelementansteuerungArt");
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_FE_AK);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_GFK);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_ESTW_A);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_GLEISFREIMELDE_INNENANLAGE);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJEKTCONTROLLER);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_RELAISSTELLWERK);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_SONSTIGE);
		addEEnumLiteral(enumAussenelementansteuerungArtEEnum, ENUMAussenelementansteuerungArt.ENUM_AUSSENELEMENTANSTEUERUNG_ART_VIRTUELLE_AUSSENELEMENTANSTEUERUNG);

		initEEnum(enumBandbreiteEEnum, ENUMBandbreite.class, "ENUMBandbreite");
		addEEnumLiteral(enumBandbreiteEEnum, ENUMBandbreite.ENUM_BANDBREITE_100_MBIT_S);
		addEEnumLiteral(enumBandbreiteEEnum, ENUMBandbreite.ENUM_BANDBREITE_10_MBIT_S);
		addEEnumLiteral(enumBandbreiteEEnum, ENUMBandbreite.ENUM_BANDBREITE_2MBIT_S);
		addEEnumLiteral(enumBandbreiteEEnum, ENUMBandbreite.ENUM_BANDBREITE_64KBIT_S);
		addEEnumLiteral(enumBandbreiteEEnum, ENUMBandbreite.ENUM_BANDBREITE_SONSTIGE);

		initEEnum(enumevArtEEnum, ENUMEVArt.class, "ENUMEVArt");
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_ANDERE_AUSSENELEMENTANSTEUERUNG);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_FE_AK_400V_DC_DIREKT);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_FE_AK_750V_DC_ENERGIEBUS);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_LANDESNETZ_VNB);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_NOTSTROMAGGREGAT_NEA_MOBIL);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_NOTSTROMAGGREGAT_NEA_STATIONAER);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_SOLAR);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_BATTERIE);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_SONSTIGE);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_BUE);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_ESTW_ZENTRALEINHEIT);
		addEEnumLiteral(enumevArtEEnum, ENUMEVArt.ENUMEV_ART_FAHRLEITUNG);

		initEEnum(enumgfkKategorieEEnum, ENUMGFKKategorie.class, "ENUMGFKKategorie");
		addEEnumLiteral(enumgfkKategorieEEnum, ENUMGFKKategorie.ENUMGFK_KATEGORIE_GROSS);
		addEEnumLiteral(enumgfkKategorieEEnum, ENUMGFKKategorie.ENUMGFK_KATEGORIE_KLEIN);
		addEEnumLiteral(enumgfkKategorieEEnum, ENUMGFKKategorie.ENUMGFK_KATEGORIE_MITTEL);

		initEEnum(enumMediumArtEEnum, ENUMMediumArt.class, "ENUMMediumArt");
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_KUPFER_ADO8);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_KUPFER_KAG);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_KUPFER_LSA_PLUS);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_KUPFER_RJ45);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_LWL_DIN);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_LWL_E2000);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_LWL_SC_LC);
		addEEnumLiteral(enumMediumArtEEnum, ENUMMediumArt.ENUM_MEDIUM_ART_SONSTIGE);

		initEEnum(enumNetzArtEEnum, ENUMNetzArt.class, "ENUMNetzArt");
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_GESCHLOSSEN);
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_KISA);
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_OFFEN);
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_SBI_INTERN);
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_SG);
		addEEnumLiteral(enumNetzArtEEnum, ENUMNetzArt.ENUM_NETZ_ART_SONSTIGE);

		initEEnum(enumTechnikArtEEnum, ENUMTechnikArt.class, "ENUMTechnikArt");
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_ANALOG_FSK);
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_ETHERNET);
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_G703);
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_SBI_INTERN_KUPFERKABEL);
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_SBI_INTERN_LWL_FASER);
		addEEnumLiteral(enumTechnikArtEEnum, ENUMTechnikArt.ENUM_TECHNIK_ART_SONSTIGE);

		initEEnum(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.class, "ENUMTSOTeilsystemArt");
		addEEnumLiteral(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.ENUMTSO_TEILSYSTEM_ART_DOKU_ZMA_ZL);
		addEEnumLiteral(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.ENUMTSO_TEILSYSTEM_ART_MDM);
		addEEnumLiteral(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.ENUMTSO_TEILSYSTEM_ART_RBC);
		addEEnumLiteral(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.ENUMTSO_TEILSYSTEM_ART_TRANSFERNETZ_MIT_SI_LST);
		addEEnumLiteral(enumtsoTeilsystemArtEEnum, ENUMTSOTeilsystemArt.ENUMTSO_TEILSYSTEM_ART_ZE);

		initEEnum(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.class, "ENUMUebertragungswegArt");
		addEEnumLiteral(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.ENUM_UEBERTRAGUNGSWEG_ART_BAHNUEBERGANG);
		addEEnumLiteral(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.ENUM_UEBERTRAGUNGSWEG_ART_DIAGNOSE);
		addEEnumLiteral(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.ENUM_UEBERTRAGUNGSWEG_ART_ESTW);
		addEEnumLiteral(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.ENUM_UEBERTRAGUNGSWEG_ART_SONSTIGE);
		addEEnumLiteral(enumUebertragungswegArtEEnum, ENUMUebertragungswegArt.ENUM_UEBERTRAGUNGSWEG_ART_ZBS);

		initEEnum(enumUnterbringungArtEEnum, ENUMUnterbringungArt.class, "ENUMUnterbringungArt");
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_ANTRIEB);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_KEINE);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_SCHALTSCHRANK_SCHALTKASTEN);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_SONSTIGE);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_TAFEL);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_GEBAEUDE);
		addEEnumLiteral(enumUnterbringungArtEEnum, ENUMUnterbringungArt.ENUM_UNTERBRINGUNG_ART_SCHALTHAUS);

		initEEnum(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.class, "ENUMUnterbringungBefestigung");
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_FUNDAMENT);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_GEBAEUDE);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_MAUER);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_PFOSTEN);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_SIGNALAUSLEGER);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_SIGNALBRUECKE);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_SIGNALMAST);
		addEEnumLiteral(enumUnterbringungBefestigungEEnum, ENUMUnterbringungBefestigung.ENUM_UNTERBRINGUNG_BEFESTIGUNG_SONSTIGE);

		// Initialize data types
		initEDataType(bauart_TypeEDataType, String.class, "Bauart_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_AEA_TypeEDataType, String.class, "Bezeichnung_AEA_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_ESTW_ZE_TypeEDataType, String.class, "Bezeichnung_ESTW_ZE_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_TSO_TypeEDataType, String.class, "Bezeichnung_TSO_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAussenelementansteuerungArtObjectEDataType, ENUMAussenelementansteuerungArt.class, "ENUMAussenelementansteuerungArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBandbreiteObjectEDataType, ENUMBandbreite.class, "ENUMBandbreiteObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumevArtObjectEDataType, ENUMEVArt.class, "ENUMEVArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumgfkKategorieObjectEDataType, ENUMGFKKategorie.class, "ENUMGFKKategorieObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumMediumArtObjectEDataType, ENUMMediumArt.class, "ENUMMediumArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumNetzArtObjectEDataType, ENUMNetzArt.class, "ENUMNetzArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTechnikArtObjectEDataType, ENUMTechnikArt.class, "ENUMTechnikArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumtsoTeilsystemArtObjectEDataType, ENUMTSOTeilsystemArt.class, "ENUMTSOTeilsystemArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumUebertragungswegArtObjectEDataType, ENUMUebertragungswegArt.class, "ENUMUebertragungswegArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumUnterbringungArtObjectEDataType, ENUMUnterbringungArt.class, "ENUMUnterbringungArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumUnterbringungBefestigungObjectEDataType, ENUMUnterbringungBefestigung.class, "ENUMUnterbringungBefestigungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_TypeEDataType, String.class, "IP_Adressblock_Blau_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_V4_TypeEDataType, String.class, "IP_Adressblock_Blau_V4_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Blau_V6_TypeEDataType, String.class, "IP_Adressblock_Blau_V6_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_TypeEDataType, String.class, "IP_Adressblock_Grau_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_V4_TypeEDataType, String.class, "IP_Adressblock_Grau_V4_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iP_Adressblock_Grau_V6_TypeEDataType, String.class, "IP_Adressblock_Grau_V6_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(standort_Beschreibung_TypeEDataType, String.class, "Standort_Beschreibung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(technik_Beschreibung_TypeEDataType, String.class, "Technik_Beschreibung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (getAEA_Allg_AttributeGroup_AussenelementansteuerungArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Aussenelementansteuerung (herstellerneutral). ESTW_A: F\u00fcr konventionelle ESTW-Strukturen ist die AEA in der Regel das ESTW-A (mit Ausnahme des Schaltkastens am Signal in bestimmten F\u00e4llen als Objektcontroller, siehe Aussenelementansteuerung). Objektcontroller: In neuerer ESTW-Technik wird zunehmend der Objektcontroller (auch kaskadiert) verwendet. Gleisfreimelde_Innenanlage: Einheit, die die logische Aufbereitung der Informationen der Freimeldeanlage \u00fcbernimmt (z. B. Achsz\u00e4hlrechner) und nicht direkt einem ESTW-A zugeordnet ist. Relaisstellwerk: Die AEA besteht aus einem (\u00fcber die ESTW-ZE ferngesteuerten) Relaisstellwerk. virtuelle_Aussenelementansteuerung: Die virtuelle Aussenelementansteuerung wird verwendet, wenn die Struktur der Aussenelementansteuerungen (zwischen ESTW Zentraleinheit und Stellelement w\u00e4hrend der PT 1-Planung noch nicht klar ist. Eine virtuelle Aussenelementansteuerung soll den Bereich einer ma\u00dfgebenden \u00d6rtlichkeit (z. B. ein Bf) umfassen. Im nicht firmenneutralen Teil der Planung (u. a. Kabelplanung) muss dann die virtuelle AEA durch die tats\u00e4chliche Struktur der AEA ersetzt werden. sonstige: Alle mit den \u00fcbrigen ENUM nicht beschreibbare Arten. Ein Bearbeitungsvermerk muss angegeben werden. Siehe auch Bauart. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_Allg_AttributeGroup_Bauart(),
		   source,
		   new String[] {
			   "documentation", "Herstellerbezogene Bauart der Steuerung. Das Attribut beschreibt im Gegensatz zu Aussenelementansteuerung Art bzw. Hersteller die herstellerbezogene Bauart der Steuerung. Es ist ein R\u00fccklaufdatum der AP PT 2 und dient der Bestandsdatenverwaltung. Beispiel: Aussenelementansteuerung_Art == ESTW_A, Bauart == \\\"J\u00fcdel E8001\\\". DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz(),
		   source,
		   new String[] {
			   "documentation", "Grunds\u00e4tzliche Art der Ersatz-Energieversorgung. Wird f\u00fcr die Ersatz-Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein B\u00dc verwendet, so kann dies in fr\u00fchen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In sp\u00e4teren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Sekundaer angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_IDEnergieSekundaer(),
		   source,
		   new String[] {
			   "documentation", "Objekt der sekund\u00e4ren Energiequelle (sofern vorhanden). DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArt(),
		   source,
		   new String[] {
			   "documentation", "Grunds\u00e4tzliche Art der Energieversorgung. Wird f\u00fcr die Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein B\u00dc verwendet, so kann dies in fr\u00fchen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In sp\u00e4teren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Primaer angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_IDEnergiePrimaer(),
		   source,
		   new String[] {
			   "documentation", "Objekt der prim\u00e4ren Energiequelle. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_GFKKategorie(),
		   source,
		   new String[] {
			   "documentation", "Kategorie des GFK gem\u00e4\u00df NeuPro.85."
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "documentation", "Regionalbereich, dem der GFK zugewiesen ist."
		   });
		addAnnotation
		  (aussenelementansteuerungEClass,
		   source,
		   new String[] {
			   "documentation", "Technisches Objekt, von dem aus die Ansteuerung der ESTW-Elemente der Au\u00dfenanlage erfolgt. Au\u00dfenelementansteuerungen (AEA) k\u00f6nnen hierarchich angeordnet sein. \u00dcber dem h\u00f6chsten Element der Hierarchie steht immer die ESTW Zentraleinheit. Von allen AEA k\u00f6nnen ein oder mehrere Elemente der Au\u00dfenanlage angesteuert sowie deren Zust\u00e4nde eingelesen werden. In der Verkettung zeigt die Verweisrichtung immer auf das in der Hierarchie h\u00f6here Element. Die \u00dcbertragung von Daten und Energie wird durch getrennte Verweise modelliert. In der konventionellen ESTW-Technik entspricht die AEA dem ESTW-A. Eine Kaskadierung von AEA ist erst in neuerer ESTW-Technik \u00fcblich. Geh\u00f6rt ein Schaltkasten zu einem Signal, muss dieser nicht als AEA geplant werden, in dem Fall wird der Schaltkasten als Bestandteil des Signals betrachtet. Kann ein Schaltkasten mehrere Signale steuern, ist er als AEA zu betrachten. Je nach Detaillierungsgrad der Planung kann die prim\u00e4re und sekund\u00e4re Energieversorgung nur in der grunds\u00e4tzlichen Art oder sogar der tats\u00e4chliche Lieferant \u00fcber einen Verweis auf diesen angegeben werden. Als AEA werden nur Bestandteile des ESTW modelliert. Schnittstellen zu anderen Untergewerken (z. B. PZB, B\u00dc, ETCS) werden \u00fcber das Stellelement dargestellt. DB-Regelwerk Darstellung und Beschriftung des ESTW-Geb\u00e4udes im sicherungstechnischen Lageplan nach Ril 819.9002"
		   });
		addAnnotation
		  (getAussenelementansteuerung_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDInformationPrimaer(),
		   source,
		   new String[] {
			   "documentation", "\u00dcbergeordnetes, prim\u00e4res Objekt der Informationsversorgung. Bei DSTW ist der Zugriff durch 4 (Reserve: 5) verschiedene TSO m\u00f6glich, z. B. bei Einbindung eines B\u00dc in Fahrstra\u00dfen mehrerer ESTW-Zentraleinheiten. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDInformationSekundaer(),
		   source,
		   new String[] {
			   "documentation", "\u00dcbergeordnetes, sekund\u00e4res Objekt der Informationsversorgung (wenn vorhanden). Bei DSTW ist der Zugriff durch 4 (Reserve: 5) verschiedene TSO m\u00f6glich, z. B. bei Einbindung eines B\u00dc in Fahrstra\u00dfen mehrerer ESTW-Zentraleinheiten. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDOertlichkeitGesteuert(),
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlichkeiten, die von der Au\u00dfenelementansteuerung gesteuert werden. Das Attribut muss nur f\u00fcr AEA (Top) gef\u00fcllt werden."
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDOertlichkeitNamensgebend(),
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlichkeit, die f\u00fcr die Au\u00dfenelementansteuerung namensgebend ist. Das Attribut ist nur f\u00fcr \u00fcbergeordnete Aussenelementansteuerungen (AEA (Top)) relevant, z. B. ESTW-A."
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Aussenelementansteuerung. Beispiel: \\\"ESTW-A Lummerland\\\". Bei Aussenelementansteuerungen der Art \\\"FeAk\\\" ist die Angabe nicht erforderlich, da eine 1:1-Beziehung zur Bezeichnung des Feldelements besteht."
		   });
		addAnnotation
		  (enumAussenelementansteuerungArtEEnum,
		   source,
		   new String[] {
			   "documentation", "GFK=Gleisfeldkonzentrator; FeAk=Feldelement-Anschlusskasten; enth\u00e4lt ebenfalls Objektcontroller; dieser ist mit dem ENUM-Wert "
		   });
		addAnnotation
		  (enumevArtEEnum,
		   source,
		   new String[] {
			   "documentation", "VNB: Versorgungsnetzbetreiber; NEA: Netzersatzaggregat"
		   });
		addAnnotation
		  (estW_ZentraleinheitEClass,
		   source,
		   new String[] {
			   "documentation", "Zentrale Komponente eines ESTW. Die ESTW-Zentraleinheit (ZE) steuert alle untergeordneten Aussenelementansteuerungen, stellt die Verbindung zu den Bedienbezirken (Notbedienplatz, Steuerbezirk/Zentralbedienung) und zu Nachbar-ESTW-Zentraleinheiten, zur Zuglenkung und zur Zugnummernmeldeanlage her. Die ZE kann ein ESTW-Z oder eine ESTW-UZ sein. Die geografische Grenze einer ZE liegt immer an einem Haupt- oder Sperrsignal (Signal_Real_Aktiv) oder einem Bedienpunkt (Signal_Fiktiv), in der Regel an einem Einfahrsignal. Die von einer Unterzentrale ben\u00f6tigten Adressformeln nach Richtlinie 819.0705 werden \u00fcber die Verkn\u00fcpfung zu Bedien Bezirk bereitgestellt. DB-Regelwerk Darstellung des ESTW-Geb\u00e4udes im sicherungstechnischen Lageplan nach Ril 819.9002, Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDOertlichkeitNamensgebend(),
		   source,
		   new String[] {
			   "documentation", "\u00d6rtlichkeit, die f\u00fcr die ESTW-Zentraleinheit namensgebend ist."
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDBedienBezirkVirtuell(),
		   source,
		   new String[] {
			   "documentation", "Virtuelle bzw. vorbereitende Zuordnung der ESTW Zentraleinheit zu einem Bedien Bezirk. Der Verweis wird gef\u00fcllt, sofern ein Stellwerk (noch) nicht in ESTW-Technik realisiert ist bzw. die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist. Die Zuordnung erfolgt, um jegliche sp\u00e4tere Realisierungsform zu erm\u00f6glichen und auch die Kennzahlenvergabe sicher zu gestalten. Die Bef\u00fcllung ist alternativ zu ID Bedien Bezirk Zentral. DB-Regelwerk Diverse Listen und Erl\u00e4uterungsbericht des BZ-PT 1"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDBedienBezirkZentral(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Bedien Bezirk, sofern eine zentrale Bedienung in einer Bedien Zentrale, Regio-BZ oder einem sonstigen Technikstandort stattfindet. Die Bef\u00fcllung ist alternativ zum Verweis ID Bedien Bezirk Virtuell. DB-Regelwerk Diverse Listen und Erl\u00e4uterungsbericht des BZ-PT 1"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart(),
		   source,
		   new String[] {
			   "documentation", "Herstellerbezogene Bauart der Steuerung. Das Attribut beschreibt im Gegensatz zu Aussenelementansteuerung Art bzw. Hersteller die herstellerbezogene Bauart der Steuerung. Es ist ein R\u00fccklaufdatum der AP PT 2 und dient der Bestandsdatenverwaltung. Beispiel: Aussenelementansteuerung_Art == ESTW_A, Bauart == \\\"J\u00fcdel E8001\\\". DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArt(),
		   source,
		   new String[] {
			   "documentation", "Grunds\u00e4tzliche Art der Energieversorgung. Wird f\u00fcr die Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein B\u00dc verwendet, so kann dies in fr\u00fchen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In sp\u00e4teren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Primaer angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz(),
		   source,
		   new String[] {
			   "documentation", "Grunds\u00e4tzliche Art der Ersatz-Energieversorgung. Wird f\u00fcr die Ersatz-Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein B\u00dc verwendet, so kann dies in fr\u00fchen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In sp\u00e4teren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Sekundaer angegeben. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz2(),
		   source,
		   new String[] {
			   "documentation", "Angabe der zweiten Ersatz-Energieversorgung (bei DSTW: 1. Ersatz Fahrleitung, 2. Ersatz NEA)."
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "documentation", "Unternehmen, das die Funktionsf\u00e4higkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im R\u00fccklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme g\u00fcltige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Bezeichnung_AttributeGroup_BezeichnungESTWZE(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der ESTW Zentraleinheit. Beispiel: \\\"ESTW-UZ Waldhof\\\", \\\"ESTW-Z Zellwald\\\"."
		   });
		addAnnotation
		  (stell_BereichEClass,
		   source,
		   new String[] {
			   "documentation", "Bereich_Objekt, mit dem ein Stellbereich beschrieben wird. Ein Stellbereich wird immer von einer AEA (Top) gesteuert. Grenzen des Stellbereichs sind Haupt-, Sperr- oder virtuelle Signale oder Gleisabschl\u00fcsse. Jedes Hauptgleis muss einem Stellbereich zugeordnet sein."
		   });
		addAnnotation
		  (getStell_Bereich_IDAussenelementansteuerung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Top-Au\u00dfenelementansteuerung (Au\u00dfenelementansteuerung, die mit einer ESTW Zentraleinheit verbunden ist)."
		   });
		addAnnotation
		  (stellelementEClass,
		   source,
		   new String[] {
			   "documentation", "Zusammenfassung der gemeinsamen Eigenschaften aller elektrisch bedienbaren Elemente der Au\u00dfenanlage sowie der B\u00dc-Schnittstelle. Folgende Elemente sind Stellelemente: BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Die \u00dcbertragung von Information (Daten) und Energie ist in getrennten Verweisen modelliert. Erfolgt die \u00dcbertragung von Information und Energie gemeinsam, so sind beide Verweise mit dem gleichen Verweisziel anzugeben. DB-Regelwerk Die Zusammenfassung der Stellelemente dient der Vereinheitlichung der Modellierung und wird heute nicht explizit geplant."
		   });
		addAnnotation
		  (getStellelement_IDEnergie(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Aussenelementansteuerung, von der die Energieversorgung des Stellelements oder der FMA Komponente erfolgt. Objekte, die Stellelemente\\\" href=\\\"//Stellelement\\\"\\u003eStellelemente sind, enthalten keine eigenen Attribute ID_Energie und ID Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enth\u00e4lt. Nicht-Stellelemente (z. B. der Achsz\u00e4hlpunkt als FMA Komponente) hingegen m\u00fcssen diese Attribute selbst enthalten. DB-Regelwerk bei Achsz\u00e4hlpunkten: Achsz\u00e4hlpunkttabelle, Spalte 4 (und redundant dazu: Freimeldetabelle, Spalte 4); bei anderen Typen von Freimeldeanlagen: im bisherigen PT1 ohne eindeutige Darstellung, in der Regel mittelbar aus dem Sicherungstechnischen Lageplan/B\u00dc-Lageplan ermittelbar. "
		   });
		addAnnotation
		  (getStellelement_IDInformation(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Aussenelementansteuerung, von der die Informationsversorgung des Stellelements bzw. die Informationsverarbeitung der FMA Komponente erfolgt. Objekte, die Stellelemente\\\" href=\\\"//Stellelement\\\"\\u003eStellelemente sind, enthalten keine eigenen Attribute ID Energie und ID_Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enth\u00e4lt. Nicht-Stellelemente (z.B. der Achsz\u00e4hlpunkt als FMA Komponente) hingegen m\u00fcssen diese Attribute selbst enthalten. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. "
		   });
		addAnnotation
		  (technik_StandortEClass,
		   source,
		   new String[] {
			   "documentation", "Bei DSTW: B\u00fcndelung der technischen Anlagen f\u00fcr ESTW_Zentraleinheit, Telekommunikation, Prozessdaten- und Diagnoseschnittstellen sowie die zugeh\u00f6rige technische Geb\u00e4udeausr\u00fcstung. Je Netzbezirk ist ein Technikstandort vorgesehen."
		   });
		addAnnotation
		  (getTechnik_Standort_IDBedienStandort(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Bedien-Standort, von dem aus der Technik-Standort bedient wird. Der Verweis dient der Abbildung der vorgesehenen n zu m-Zuordnung zwischen TSO und BSO. Die Angabe erfolgt im Rahmen der Planung des Untergewerks Bedienung Fdl."
		   });
		addAnnotation
		  (getTechnik_Standort_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Unterbringung (Geb\u00e4ude), in der der Technik-Standort untergebracht ist."
		   });
		addAnnotation
		  (technik_Standort_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Technikstandorts"
		   });
		addAnnotation
		  (getTechnik_Standort_Bezeichnung_AttributeGroup_BezeichnungTSO(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Technik-Standorts."
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das Teilsystem reservierter Adressblock im blauen Weg des bbIP-Netzes. "
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr das Teilsystem reservierter Adressblock im grauen Weg des bbIP-Netzes. "
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_TSOTeilsystemArt(),
		   source,
		   new String[] {
			   "documentation", "Art des TSO-Teilsystems, z. B. ZE (ESTW-Zentraleinheit), MDM (Maintenance Data Management), Doku ZMA ZL (Doku Zugnummernmeldeanlage Zuglenkung), Transfernetz mit SI LST (SI = Service-Interface)."
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den blauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv4-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "documentation", "Reservierter IPv6-Adressblock f\u00fcr den grauen Weg des bbIP-Netzes."
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "documentation", "Regionalbereich, dem der Technik-Standort zugewiesen ist."
		   });
		addAnnotation
		  (uebertragungswegEClass,
		   source,
		   new String[] {
			   "documentation", "Physikalischer/logischer \u00dcbertragungsweg zwischen zwei Objekten f\u00fcr eine erforderliche Informations\u00fcbertragung. Die Angabe erfolgt, wenn der \u00dcbertragungsweg vom Betreiber beigestellt wird oder die Informations\u00fcbertragung vom Lieferanten zus\u00e4tzlich zu schalten ist. Es geht um die Erfassung der physikalischen/logischen Verbindung zweier Objekte, die entweder einer funktionalen Verbindung zwischen den Objekten des Modells selbst dient, z.B. der ESTW-Bus zwischen zwei Aussenelementansteuerungen; einer funktionalen Verbindung eines Objektes des Modells zu einer nicht im Modell befindlichen Komponente dient, z.B. der Anbindung der KUS \u00fcber die ZN_ZBS an die Leittechnik der BZ; einer funktionalen Verbindung zwischen zwei Komponenten, die nicht im Modell abgebildet sind, aber \u00fcber diese angebunden werden und darum f\u00fcr die SBI dokumentiert werden m\u00fcssen, z.B. die Verbindung von der LZB-Zentrale in der ESTW Zentraleinheit zum LZB-Bedienplatz in der Bedien Zentrale. Je nach Art und Anwendungsfall kann ein Objekt nur eine oder auch mehrere Verbindungen zu einem oder mehreren anderen Objekten haben. Der Anschluss von stellwerkstypischen Elementen an das Stellwerk (Kabelanlage) wird nicht mit diesem Objekt abgebildet. "
		   });
		addAnnotation
		  (getUebertragungsweg_IDAnhangUeWegNach(),
		   source,
		   new String[] {
			   "documentation", "Entsprechender (Lage)Plan oder Beschreibung als Anhang."
		   });
		addAnnotation
		  (getUebertragungsweg_IDAnhangUeWegVon(),
		   source,
		   new String[] {
			   "documentation", "Entsprechender (Lage)Plan oder Beschreibung als Anhang."
		   });
		addAnnotation
		  (getUebertragungsweg_IDUebertragungswegNach(),
		   source,
		   new String[] {
			   "documentation", "Information, nach wo die Verbindung hergestellt werden soll. Beispiel: Bedien_Bezirk."
		   });
		addAnnotation
		  (getUebertragungsweg_IDUebertragungswegVon(),
		   source,
		   new String[] {
			   "documentation", "Information, von wo die Verbindung hergestellt werden soll. Beispiel: ESTW_Zentraleinheit."
		   });
		addAnnotation
		  (getUebertragungsweg_UebertragungswegArt(),
		   source,
		   new String[] {
			   "documentation", "Verwendung des \u00dcbertragungsweges. Beispiel: UZ-BZ-Verbindung."
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_Bandbreite(),
		   source,
		   new String[] {
			   "documentation", "Beschreibt die n\u00f6tige Bandbreite des \u00dcbertragungsweges. Beispiel: 2Mbit_s bei UZ-BZ-Verbindung."
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_MediumArt(),
		   source,
		   new String[] {
			   "documentation", "Beschreibt den \u00dcbergabepunkt des \u00dcbertragungsweges in dessen physikalischer Auspr\u00e4gung. Beispiel: ADO8-Dose bei ZBS-Verbindung, RJ45-Port bei UZ-BZ-Verbindung."
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_NetzArt(),
		   source,
		   new String[] {
			   "documentation", "Beschreibt die Art des \u00dcbertragungsnetzes, ggf. auch die Anforderungen. Beispiel: geschlossenes Netz oder offenes Netz bei der ZBS-Verbindung."
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_TechnikArt(),
		   source,
		   new String[] {
			   "documentation", "Technische Auspr\u00e4gung der physikalischen Schnittstelle. Beispiel: G.703, Ethernet oder LWL_Faser."
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_TechnikBeschreibung(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung der technischen Realisierung des \u00dcbertragungsweges in Textform."
		   });
		addAnnotation
		  (unterbringungEClass,
		   source,
		   new String[] {
			   "documentation", "Ort der Anordnung von nicht an das Gleis gebundenen Komponenten. Die Verortung der U. erfolgt entweder analog zum Punkt Objekt, mit einem GEO Punkt oder durch einen beschreibenden Text. Eine U. beschreibt in der Regel die Umhausung der Komponente. Ist sie nicht eingehaust, wird als Unterbringung Art \\\"keine\\\" angegeben. In diesen F\u00e4llen hat die Komponente dennoch eine Unterbringung Befestigung. Das ist z. B. der Fall, wenn eine wetterfeste Komponente (z. B. Schl\u00fcsselschalter) ohne Einhausung direkt an einem Pfosten befestigt ist. In einer U. k\u00f6nnen mehrere LST-Objekte untergebracht sein. Eine U. ist z. B. ein Betonschalthaus oder ein Schaltkasten. DB-Regelwerk Darstellung des Geb\u00e4udes im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getUnterbringung_PunktObjektStrecke(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Zuordnung eines Objektes zu einer Strecke. Zur vererbungsspezifischen Bef\u00fcllung der Attributgruppe siehe Modellierung Basisobjekte."
		   });
		addAnnotation
		  (getUnterbringung_IDGEOPunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen GEO Punkt, der eine Verortung \u00fcber x- und y-Koordinate erm\u00f6glicht. DB-Regelwerk ESTW: Darstellung im sicherungstechnischen Lageplan. "
		   });
		addAnnotation
		  (getUnterbringung_PunktObjektTOPKante(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Verortung eines Objektes an der Topologie. Die vererbungsspezifische Bef\u00fcllung der zugeh\u00f6rigen Attribute wird auf der Seite Modellierung Basisobjekte beschrieben. Durch die m\u00f6gliche Mehrfacheinbindung der Attributgruppe ist es m\u00f6glich, ein Objekt (z. B. Grenzzeichen) mehreren topologischen Kanten zuzuordnen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (getUnterbringung_StandortBeschreibung(),
		   source,
		   new String[] {
			   "documentation", "Textuelle Beschreibung des Standorts der Unterbringung. Das Attribut wird genutzt, wenn eine punktf\u00f6rmige Verortung nicht m\u00f6glich ist, z. B. aufgrund der gro\u00dfen Entfernung des Standorts und der somit bedingten Lage au\u00dferhalb des Planungs- oder Betrachtungsbereichs."
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "documentation", "Unternehmen, das die Funktionsf\u00e4higkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im R\u00fccklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme g\u00fcltige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_UnterbringungArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Unterbringung. Die Arten werden nach eingehaust und nicht eingehaust unterschieden, was z. B. f\u00fcr das Symbol der Schl\u00fcsselsperre von Bedeutung ist: Eingehaust (Symbol auf dem Lageplan): Schalthaus, Gebaeude. Nicht eingehaust (kein Symbol auf dem Lageplan): Antrieb Schaltkasten/-schrank, Tafel, sonstige, keine. Schaltkasten/-schrank: Zur Vereinfachung und zur Reduktion von Interpretationsspielr\u00e4umen wird zwischen Schaltschrank und Schaltkasten nicht unterschieden. Antrieb: Die Elemente sind in einem Schranken- oder Weichenantrieb untergebracht. Tafel: Quaderf\u00f6rmiger, flacher K\u00f6rper (z. B. Brett oder Blech), der lediglich zur mechanischen Aufnahme der eigenst\u00e4ndigen Elemente (z. B. Schloss) dient. Sie ist von der Bedientafel als Bauart einer Bedien Einrichtung Oertlich zu unterscheiden. sonstige: Es ist ein Bearbeitungsvermerk anzugeben. keine: Es gibt keine Unterbringung, z. B. wenn eine Komponente direkt an der Befestigung \\\"Pfosten\\\" angebracht ist. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_UnterbringungBefestigung(),
		   source,
		   new String[] {
			   "documentation", "Art der Befestigung der Unterbringung. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk anzugeben. DB-Regelwerk Beschreibung im Erl\u00e4uterungsbericht"
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
		  (aeA_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CAEA_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAEA_Allg_AttributeGroup_AussenelementansteuerungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussenelementansteuerung_Art"
		   });
		addAnnotation
		  (getAEA_Allg_AttributeGroup_Bauart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bauart"
		   });
		addAnnotation
		  (aeA_Energieversorgung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CAEA_Energieversorgung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Energieversorgung_Art_Ersatz"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_IDEnergieSekundaer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Energie_Sekundaer"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_EnergieversorgungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Energieversorgung_Art"
		   });
		addAnnotation
		  (getAEA_Energieversorgung_AttributeGroup_IDEnergiePrimaer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Energie_Primaer"
		   });
		addAnnotation
		  (aeA_GFK_IP_Adressblock_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CAEA_GFK_IP_Adressblock",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_GFKKategorie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GFK_Kategorie"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V4"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V6"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V4"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V6"
		   });
		addAnnotation
		  (getAEA_GFK_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Regionalbereich"
		   });
		addAnnotation
		  (aussenelementansteuerungEClass,
		   source,
		   new String[] {
			   "name", "CAussenelementansteuerung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAussenelementansteuerung_AEAAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AEA_Allg"
		   });
		addAnnotation
		  (getAussenelementansteuerung_AEAEnergieversorgung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AEA_Energieversorgung"
		   });
		addAnnotation
		  (getAussenelementansteuerung_AEAGFKIPAdressblock(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AEA_GFK_IP_Adressblock"
		   });
		addAnnotation
		  (getAussenelementansteuerung_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDInformationPrimaer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Information_Primaer"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDInformationSekundaer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Information_Sekundaer"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDOertlichkeitGesteuert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit_Gesteuert"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDOertlichkeitNamensgebend(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit_Namensgebend"
		   });
		addAnnotation
		  (getAussenelementansteuerung_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (aussenelementansteuerung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAussenelementansteuerung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAussenelementansteuerung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (aussenelementansteuerung_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CAussenelementansteuerung_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_AEA"
		   });
		addAnnotation
		  (bandbreite_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBandbreite",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBandbreite_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bauart_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBauart",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bauart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBauart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBauart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_AEA_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_AEA",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText",
			   "pattern", ".{1,30}"
		   });
		addAnnotation
		  (bezeichnung_AEA_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_AEA",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_AEA_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_ESTW_ZE_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_ESTW_ZE",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bezeichnung_ESTW_ZE_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_ESTW_ZE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_ESTW_ZE_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_TSO_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_TSO",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (bezeichnung_TSO_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_TSO",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_TSO_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (energieversorgung_Art_Ersatz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEnergieversorgung_Art_Ersatz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEnergieversorgung_Art_Ersatz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (energieversorgung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEnergieversorgung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEnergieversorgung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAussenelementansteuerungArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAussenelementansteuerung_Art"
		   });
		addAnnotation
		  (enumAussenelementansteuerungArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAussenelementansteuerung_Art:Object",
			   "baseType", "ENUMAussenelementansteuerung_Art"
		   });
		addAnnotation
		  (enumBandbreiteEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBandbreite"
		   });
		addAnnotation
		  (enumBandbreiteObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBandbreite:Object",
			   "baseType", "ENUMBandbreite"
		   });
		addAnnotation
		  (enumevArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMEV_Art"
		   });
		addAnnotation
		  (enumevArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMEV_Art:Object",
			   "baseType", "ENUMEV_Art"
		   });
		addAnnotation
		  (enumgfkKategorieEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGFK_Kategorie"
		   });
		addAnnotation
		  (enumgfkKategorieObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGFK_Kategorie:Object",
			   "baseType", "ENUMGFK_Kategorie"
		   });
		addAnnotation
		  (enumMediumArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMMedium_Art"
		   });
		addAnnotation
		  (enumMediumArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMMedium_Art:Object",
			   "baseType", "ENUMMedium_Art"
		   });
		addAnnotation
		  (enumNetzArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMNetz_Art"
		   });
		addAnnotation
		  (enumNetzArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMNetz_Art:Object",
			   "baseType", "ENUMNetz_Art"
		   });
		addAnnotation
		  (enumTechnikArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTechnik_Art"
		   });
		addAnnotation
		  (enumTechnikArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTechnik_Art:Object",
			   "baseType", "ENUMTechnik_Art"
		   });
		addAnnotation
		  (enumtsoTeilsystemArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTSO_Teilsystem_Art"
		   });
		addAnnotation
		  (enumtsoTeilsystemArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTSO_Teilsystem_Art:Object",
			   "baseType", "ENUMTSO_Teilsystem_Art"
		   });
		addAnnotation
		  (enumUebertragungswegArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMUebertragungsweg_Art"
		   });
		addAnnotation
		  (enumUebertragungswegArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMUebertragungsweg_Art:Object",
			   "baseType", "ENUMUebertragungsweg_Art"
		   });
		addAnnotation
		  (enumUnterbringungArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMUnterbringung_Art"
		   });
		addAnnotation
		  (enumUnterbringungArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMUnterbringung_Art:Object",
			   "baseType", "ENUMUnterbringung_Art"
		   });
		addAnnotation
		  (enumUnterbringungBefestigungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMUnterbringung_Befestigung"
		   });
		addAnnotation
		  (enumUnterbringungBefestigungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMUnterbringung_Befestigung:Object",
			   "baseType", "ENUMUnterbringung_Befestigung"
		   });
		addAnnotation
		  (estW_ZentraleinheitEClass,
		   source,
		   new String[] {
			   "name", "CESTW_Zentraleinheit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_ESTWZentraleinheitAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ESTW_Zentraleinheit_Allg"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDOertlichkeitNamensgebend(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit_Namensgebend"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDBedienBezirkVirtuell(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk_Virtuell"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_IDBedienBezirkZentral(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Bezirk_Zentral"
		   });
		addAnnotation
		  (estW_Zentraleinheit_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CESTW_Zentraleinheit_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_Bauart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bauart"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Energieversorgung_Art"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Energieversorgung_Art_Ersatz"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_EnergieversorgungArtErsatz2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Energieversorgung_Art_Ersatz_2"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hersteller"
		   });
		addAnnotation
		  (estW_Zentraleinheit_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CESTW_Zentraleinheit_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getESTW_Zentraleinheit_Bezeichnung_AttributeGroup_BezeichnungESTWZE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_ESTW_ZE"
		   });
		addAnnotation
		  (gfK_Kategorie_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGFK_Kategorie",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGFK_Kategorie_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hersteller_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHersteller",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHersteller_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V4_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau_V4",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V4_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau_V4",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_V4_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V6_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Blau_V6",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Blau_V6_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Blau_V6",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Blau_V6_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V4_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau_V4",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V4_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau_V4",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_V4_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V6_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TIP_Adressblock_Grau_V6",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (iP_Adressblock_Grau_V6_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCIP_Adressblock_Grau_V6",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIP_Adressblock_Grau_V6_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (medium_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMedium_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMedium_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (netz_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNetz_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNetz_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (regionalbereich_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRegionalbereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegionalbereich_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (standort_Beschreibung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TStandort_Beschreibung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (standort_Beschreibung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStandort_Beschreibung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStandort_Beschreibung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (stell_BereichEClass,
		   source,
		   new String[] {
			   "name", "CStell_Bereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStell_Bereich_IDAussenelementansteuerung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Aussenelementansteuerung"
		   });
		addAnnotation
		  (stellelementEClass,
		   source,
		   new String[] {
			   "name", "CStellelement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStellelement_IDEnergie(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Energie"
		   });
		addAnnotation
		  (getStellelement_IDInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Information"
		   });
		addAnnotation
		  (technik_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTechnik_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnik_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (technik_Beschreibung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTechnik_Beschreibung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText"
		   });
		addAnnotation
		  (technik_Beschreibung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTechnik_Beschreibung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnik_Beschreibung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (technik_StandortEClass,
		   source,
		   new String[] {
			   "name", "CTechnik_Standort",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnik_Standort_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getTechnik_Standort_IDBedienStandort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Standort"
		   });
		addAnnotation
		  (getTechnik_Standort_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getTechnik_Standort_TSOIPAdressblock(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSO_IP_Adressblock"
		   });
		addAnnotation
		  (technik_Standort_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTechnik_Standort_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnik_Standort_Bezeichnung_AttributeGroup_BezeichnungTSO(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_TSO"
		   });
		addAnnotation
		  (tsO_IP_AB_Teilsystem_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTSO_IP_AB_Teilsystem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockBlau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau"
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_IPAdressblockGrau(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau"
		   });
		addAnnotation
		  (getTSO_IP_AB_Teilsystem_AttributeGroup_TSOTeilsystemArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSO_Teilsystem_Art"
		   });
		addAnnotation
		  (tsO_IP_Adressblock_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CTSO_IP_Adressblock",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V4"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockBlauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Blau_V6"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V4"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_IPAdressblockGrauV6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IP_Adressblock_Grau_V6"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_Regionalbereich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Regionalbereich"
		   });
		addAnnotation
		  (getTSO_IP_Adressblock_AttributeGroup_TSOIPABTeilsystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TSO_IP_AB_Teilsystem"
		   });
		addAnnotation
		  (tsO_Teilsystem_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTSO_Teilsystem_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSO_Teilsystem_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (uebertragungswegEClass,
		   source,
		   new String[] {
			   "name", "CUebertragungsweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUebertragungsweg_IDAnhangUeWegNach(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_UeWeg_Nach"
		   });
		addAnnotation
		  (getUebertragungsweg_IDAnhangUeWegVon(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_UeWeg_Von"
		   });
		addAnnotation
		  (getUebertragungsweg_IDUebertragungswegNach(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Uebertragungsweg_Nach"
		   });
		addAnnotation
		  (getUebertragungsweg_IDUebertragungswegVon(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Uebertragungsweg_Von"
		   });
		addAnnotation
		  (getUebertragungsweg_UebertragungswegArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uebertragungsweg_Art"
		   });
		addAnnotation
		  (getUebertragungsweg_UebertragungswegTechnik(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uebertragungsweg_Technik"
		   });
		addAnnotation
		  (uebertragungsweg_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUebertragungsweg_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUebertragungsweg_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (uebertragungsweg_Technik_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CUebertragungsweg_Technik",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_Bandbreite(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bandbreite"
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_MediumArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Medium_Art"
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_NetzArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Netz_Art"
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_TechnikArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Technik_Art"
		   });
		addAnnotation
		  (getUebertragungsweg_Technik_AttributeGroup_TechnikBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Technik_Beschreibung"
		   });
		addAnnotation
		  (unterbringungEClass,
		   source,
		   new String[] {
			   "name", "CUnterbringung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterbringung_PunktObjektStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Punkt_Objekt_Strecke"
		   });
		addAnnotation
		  (getUnterbringung_UnterbringungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterbringung_Allg"
		   });
		addAnnotation
		  (getUnterbringung_IDGEOPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Punkt"
		   });
		addAnnotation
		  (getUnterbringung_PunktObjektTOPKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Punkt_Objekt_TOP_Kante"
		   });
		addAnnotation
		  (getUnterbringung_StandortBeschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Standort_Beschreibung"
		   });
		addAnnotation
		  (unterbringung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CUnterbringung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_Hersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hersteller"
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_UnterbringungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterbringung_Art"
		   });
		addAnnotation
		  (getUnterbringung_Allg_AttributeGroup_UnterbringungBefestigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterbringung_Befestigung"
		   });
		addAnnotation
		  (unterbringung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUnterbringung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterbringung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (unterbringung_Befestigung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUnterbringung_Befestigung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnterbringung_Befestigung_TypeClass_Wert(),
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
		  (aussenelementansteuerungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getAussenelementansteuerung_Bezeichnung_AttributeGroup_BezeichnungAEA(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..30]</ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (estW_ZentraleinheitEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (stell_BereichEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (stellelementEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (technik_StandortEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (uebertragungswegEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (unterbringungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
	}

} //Ansteuerung_ElementPackageImpl
