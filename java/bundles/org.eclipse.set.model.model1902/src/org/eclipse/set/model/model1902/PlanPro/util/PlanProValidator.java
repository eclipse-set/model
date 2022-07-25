/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model1902.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.model1902.PlanPro.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage
 * @generated
 */
public class PlanProValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlanProValidator INSTANCE = new PlanProValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model1902.PlanPro";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisTypenValidator basisTypenValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanProValidator() {
		super();
		basisTypenValidator = BasisTypenValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlanProPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE_CLASS:
				return validateAdresse_PLZ_Ort_TypeClass((Adresse_PLZ_Ort_TypeClass)value, diagnostics, context);
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE_CLASS:
				return validateAdresse_Strasse_Nr_TypeClass((Adresse_Strasse_Nr_TypeClass)value, diagnostics, context);
			case PlanProPackage.AKTEUR:
				return validateAkteur((Akteur)value, diagnostics, context);
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP:
				return validateAkteur_Allg_AttributeGroup((Akteur_Allg_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.AKTEUR_ZUORDNUNG:
				return validateAkteur_Zuordnung((Akteur_Zuordnung)value, diagnostics, context);
			case PlanProPackage.AUSGABE_FACHDATEN:
				return validateAusgabe_Fachdaten((Ausgabe_Fachdaten)value, diagnostics, context);
			case PlanProPackage.BAUABSCHNITT_TYPE_CLASS:
				return validateBauabschnitt_TypeClass((Bauabschnitt_TypeClass)value, diagnostics, context);
			case PlanProPackage.BAUPHASE_TYPE_CLASS:
				return validateBauphase_TypeClass((Bauphase_TypeClass)value, diagnostics, context);
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE_CLASS:
				return validateBauzustand_Kurzbezeichnung_TypeClass((Bauzustand_Kurzbezeichnung_TypeClass)value, diagnostics, context);
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE_CLASS:
				return validateBauzustand_Langbezeichnung_TypeClass((Bauzustand_Langbezeichnung_TypeClass)value, diagnostics, context);
			case PlanProPackage.BEMERKUNG_TYPE_CLASS:
				return validateBemerkung_TypeClass((Bemerkung_TypeClass)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE_CLASS:
				return validateBezeichnung_Anlage_TypeClass((Bezeichnung_Anlage_TypeClass)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE_CLASS:
				return validateBezeichnung_Planung_Gruppe_TypeClass((Bezeichnung_Planung_Gruppe_TypeClass)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE_CLASS:
				return validateBezeichnung_Planung_Projekt_TypeClass((Bezeichnung_Planung_Projekt_TypeClass)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE_CLASS:
				return validateBezeichnung_Unteranlage_TypeClass((Bezeichnung_Unteranlage_TypeClass)value, diagnostics, context);
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP:
				return validateContainer_AttributeGroup((Container_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.DATUM_ABSCHLUSS_EINZEL_TYPE_CLASS:
				return validateDatum_Abschluss_Einzel_TypeClass((Datum_Abschluss_Einzel_TypeClass)value, diagnostics, context);
			case PlanProPackage.DATUM_ABSCHLUSS_GRUPPE_TYPE_CLASS:
				return validateDatum_Abschluss_Gruppe_TypeClass((Datum_Abschluss_Gruppe_TypeClass)value, diagnostics, context);
			case PlanProPackage.DATUM_ABSCHLUSS_PROJEKT_TYPE_CLASS:
				return validateDatum_Abschluss_Projekt_TypeClass((Datum_Abschluss_Projekt_TypeClass)value, diagnostics, context);
			case PlanProPackage.DATUM_REGELWERKSSTAND_TYPE_CLASS:
				return validateDatum_Regelwerksstand_TypeClass((Datum_Regelwerksstand_TypeClass)value, diagnostics, context);
			case PlanProPackage.DATUM_TYPE_CLASS:
				return validateDatum_TypeClass((Datum_TypeClass)value, diagnostics, context);
			case PlanProPackage.DATUM_UEBERNAHME_TYPE_CLASS:
				return validateDatum_Uebernahme_TypeClass((Datum_Uebernahme_TypeClass)value, diagnostics, context);
			case PlanProPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PlanProPackage.EMAIL_ADRESSE_TYPE_CLASS:
				return validateE_Mail_Adresse_TypeClass((E_Mail_Adresse_TypeClass)value, diagnostics, context);
			case PlanProPackage.ERZEUGUNG_ZEITSTEMPEL_TYPE_CLASS:
				return validateErzeugung_Zeitstempel_TypeClass((Erzeugung_Zeitstempel_TypeClass)value, diagnostics, context);
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP:
				return validateFachdaten_AttributeGroup((Fachdaten_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE_CLASS:
				return validateFuehrende_Oertlichkeit_TypeClass((Fuehrende_Oertlichkeit_TypeClass)value, diagnostics, context);
			case PlanProPackage.IDENT_ROLLE_TYPE_CLASS:
				return validateIdent_Rolle_TypeClass((Ident_Rolle_TypeClass)value, diagnostics, context);
			case PlanProPackage.INDEX_AUSGABE_TYPE_CLASS:
				return validateIndex_Ausgabe_TypeClass((Index_Ausgabe_TypeClass)value, diagnostics, context);
			case PlanProPackage.INFORMATIV_TYPE_CLASS:
				return validateInformativ_TypeClass((Informativ_TypeClass)value, diagnostics, context);
			case PlanProPackage.KOORDINATENSYSTEM_BB_TYPE_CLASS:
				return validateKoordinatensystem_BB_TypeClass((Koordinatensystem_BB_TypeClass)value, diagnostics, context);
			case PlanProPackage.KOORDINATENSYSTEM_PB_TYPE_CLASS:
				return validateKoordinatensystem_PB_TypeClass((Koordinatensystem_PB_TypeClass)value, diagnostics, context);
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE_CLASS:
				return validateLaufende_Nummer_Ausgabe_TypeClass((Laufende_Nummer_Ausgabe_TypeClass)value, diagnostics, context);
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP:
				return validateLST_Objekte_Planungsbereich_AttributeGroup((LST_Objekte_Planungsbereich_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP:
				return validateLST_Planung_AttributeGroup((LST_Planung_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.LST_ZUSTAND:
				return validateLST_Zustand((LST_Zustand)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_10_TYPE_CLASS:
				return validateName_Akteur_10_TypeClass((Name_Akteur_10_TypeClass)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_5TYPE_CLASS:
				return validateName_Akteur_5_TypeClass((Name_Akteur_5_TypeClass)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_TYPE_CLASS:
				return validateName_Akteur_TypeClass((Name_Akteur_TypeClass)value, diagnostics, context);
			case PlanProPackage.NAME_ORGANISATION_TYPE_CLASS:
				return validateName_Organisation_TypeClass((Name_Organisation_TypeClass)value, diagnostics, context);
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP:
				return validateObjektmanagement_AttributeGroup((Objektmanagement_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.ORGANISATION:
				return validateOrganisation((Organisation)value, diagnostics, context);
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE_CLASS:
				return validateOrganisationseinheit_TypeClass((Organisationseinheit_TypeClass)value, diagnostics, context);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE:
				return validatePlanPro_Schnittstelle((PlanPro_Schnittstelle)value, diagnostics, context);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP:
				return validatePlanPro_Schnittstelle_Allg_AttributeGroup((PlanPro_Schnittstelle_Allg_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE_CLASS:
				return validatePlanPro_XSD_Version_TypeClass((PlanPro_XSD_Version_TypeClass)value, diagnostics, context);
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP:
				return validatePlanung_E_Allg_AttributeGroup((Planung_E_Allg_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_EART_TYPE_CLASS:
				return validatePlanung_E_Art_TypeClass((Planung_E_Art_TypeClass)value, diagnostics, context);
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP:
				return validatePlanung_E_Ausgabe_Besonders_AttributeGroup((Planung_E_Ausgabe_Besonders_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP:
				return validatePlanung_E_Handlung_AttributeGroup((Planung_E_Handlung_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_EINZEL:
				return validatePlanung_Einzel((Planung_Einzel)value, diagnostics, context);
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP:
				return validatePlanung_G_Allg_AttributeGroup((Planung_G_Allg_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_GART_BESONDERS_TYPE_CLASS:
				return validatePlanung_G_Art_Besonders_TypeClass((Planung_G_Art_Besonders_TypeClass)value, diagnostics, context);
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP:
				return validatePlanung_G_Fuehrende_Strecke_AttributeGroup((Planung_G_Fuehrende_Strecke_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP:
				return validatePlanung_G_Schriftfeld_AttributeGroup((Planung_G_Schriftfeld_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_GRUPPE:
				return validatePlanung_Gruppe((Planung_Gruppe)value, diagnostics, context);
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP:
				return validatePlanung_P_Allg_AttributeGroup((Planung_P_Allg_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.PLANUNG_PHASE_TYPE_CLASS:
				return validatePlanung_Phase_TypeClass((Planung_Phase_TypeClass)value, diagnostics, context);
			case PlanProPackage.PLANUNG_PROJEKT:
				return validatePlanung_Projekt((Planung_Projekt)value, diagnostics, context);
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP:
				return validatePolygone_Betrachtungsbereich_AttributeGroup((Polygone_Betrachtungsbereich_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP:
				return validatePolygone_Planungsbereich_AttributeGroup((Polygone_Planungsbereich_AttributeGroup)value, diagnostics, context);
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS:
				return validatePolygonzug_Betrachtungsbereich_TypeClass((Polygonzug_Betrachtungsbereich_TypeClass)value, diagnostics, context);
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE_CLASS:
				return validatePolygonzug_Planungsbereich_TypeClass((Polygonzug_Planungsbereich_TypeClass)value, diagnostics, context);
			case PlanProPackage.PROJEKT_NUMMER_TYPE_CLASS:
				return validateProjekt_Nummer_TypeClass((Projekt_Nummer_TypeClass)value, diagnostics, context);
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE_CLASS:
				return validateReferenz_Planung_Basis_TypeClass((Referenz_Planung_Basis_TypeClass)value, diagnostics, context);
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE_CLASS:
				return validateReferenz_Vergleich_Besonders_TypeClass((Referenz_Vergleich_Besonders_TypeClass)value, diagnostics, context);
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE_CLASS:
				return validateStrecke_Abschnitt_TypeClass((Strecke_Abschnitt_TypeClass)value, diagnostics, context);
			case PlanProPackage.STRECKE_KM_TYPE_CLASS:
				return validateStrecke_Km_TypeClass((Strecke_Km_TypeClass)value, diagnostics, context);
			case PlanProPackage.STRECKE_NUMMER_TYPE_CLASS:
				return validateStrecke_Nummer_TypeClass((Strecke_Nummer_TypeClass)value, diagnostics, context);
			case PlanProPackage.TELEFONNUMMER_TYPE_CLASS:
				return validateTelefonnummer_TypeClass((Telefonnummer_TypeClass)value, diagnostics, context);
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS:
				return validateUntergewerk_Art_TypeClass((Untergewerk_Art_TypeClass)value, diagnostics, context);
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE_CLASS:
				return validateVerantwortliche_Stelle_DB_TypeClass((Verantwortliche_Stelle_DB_TypeClass)value, diagnostics, context);
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE_CLASS:
				return validateVergleich_Ausgabestand_Basis_TypeClass((Vergleich_Ausgabestand_Basis_TypeClass)value, diagnostics, context);
			case PlanProPackage.VERGLEICHSTYP_BESONDERS_TYPE_CLASS:
				return validateVergleichstyp_Besonders_TypeClass((Vergleichstyp_Besonders_TypeClass)value, diagnostics, context);
			case PlanProPackage.WERKZEUG_NAME_TYPE_CLASS:
				return validateWerkzeug_Name_TypeClass((Werkzeug_Name_TypeClass)value, diagnostics, context);
			case PlanProPackage.WERKZEUG_VERSION_TYPE_CLASS:
				return validateWerkzeug_Version_TypeClass((Werkzeug_Version_TypeClass)value, diagnostics, context);
			case PlanProPackage.ENUM_KOORDINATENSYSTEM:
				return validateENUMKoordinatensystem((ENUMKoordinatensystem)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_EART:
				return validateENUMPlanungEArt((ENUMPlanungEArt)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS:
				return validateENUMPlanungGArtBesonders((ENUMPlanungGArtBesonders)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_PHASE:
				return validateENUMPlanungPhase((ENUMPlanungPhase)value, diagnostics, context);
			case PlanProPackage.ENUM_UNTERGEWERK_ART:
				return validateENUMUntergewerkArt((ENUMUntergewerkArt)value, diagnostics, context);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS:
				return validateENUMVergleichstypBesonders((ENUMVergleichstypBesonders)value, diagnostics, context);
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE:
				return validateAdresse_PLZ_Ort_Type((String)value, diagnostics, context);
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE:
				return validateAdresse_Strasse_Nr_Type((String)value, diagnostics, context);
			case PlanProPackage.BAUABSCHNITT_TYPE:
				return validateBauabschnitt_Type((String)value, diagnostics, context);
			case PlanProPackage.BAUPHASE_TYPE:
				return validateBauphase_Type((String)value, diagnostics, context);
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE:
				return validateBauzustand_Kurzbezeichnung_Type((String)value, diagnostics, context);
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE:
				return validateBauzustand_Langbezeichnung_Type((String)value, diagnostics, context);
			case PlanProPackage.BEMERKUNG_TYPE:
				return validateBemerkung_Type((String)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE:
				return validateBezeichnung_Anlage_Type((String)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE:
				return validateBezeichnung_Planung_Gruppe_Type((String)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE:
				return validateBezeichnung_Planung_Projekt_Type((String)value, diagnostics, context);
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE:
				return validateBezeichnung_Unteranlage_Type((String)value, diagnostics, context);
			case PlanProPackage.EMAIL_ADRESSE_TYPE:
				return validateE_Mail_Adresse_Type((String)value, diagnostics, context);
			case PlanProPackage.ENUM_KOORDINATENSYSTEM_OBJECT:
				return validateENUMKoordinatensystemObject((ENUMKoordinatensystem)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_EART_OBJECT:
				return validateENUMPlanungEArtObject((ENUMPlanungEArt)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS_OBJECT:
				return validateENUMPlanungGArtBesondersObject((ENUMPlanungGArtBesonders)value, diagnostics, context);
			case PlanProPackage.ENUM_PLANUNG_PHASE_OBJECT:
				return validateENUMPlanungPhaseObject((ENUMPlanungPhase)value, diagnostics, context);
			case PlanProPackage.ENUM_UNTERGEWERK_ART_OBJECT:
				return validateENUMUntergewerkArtObject((ENUMUntergewerkArt)value, diagnostics, context);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS_OBJECT:
				return validateENUMVergleichstypBesondersObject((ENUMVergleichstypBesonders)value, diagnostics, context);
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE:
				return validateFuehrende_Oertlichkeit_Type((String)value, diagnostics, context);
			case PlanProPackage.IDENT_ROLLE_TYPE:
				return validateIdent_Rolle_Type((String)value, diagnostics, context);
			case PlanProPackage.INDEX_AUSGABE_TYPE:
				return validateIndex_Ausgabe_Type((String)value, diagnostics, context);
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE:
				return validateLaufende_Nummer_Ausgabe_Type((String)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_10_TYPE:
				return validateName_Akteur_10_Type((String)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_5TYPE:
				return validateName_Akteur_5_Type((String)value, diagnostics, context);
			case PlanProPackage.NAME_AKTEUR_TYPE:
				return validateName_Akteur_Type((String)value, diagnostics, context);
			case PlanProPackage.NAME_ORGANISATION_TYPE:
				return validateName_Organisation_Type((String)value, diagnostics, context);
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE:
				return validateOrganisationseinheit_Type((String)value, diagnostics, context);
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE:
				return validatePlanPro_XSD_Version_Type((String)value, diagnostics, context);
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE:
				return validatePolygonzug_Betrachtungsbereich_Type((String)value, diagnostics, context);
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE:
				return validatePolygonzug_Planungsbereich_Type((String)value, diagnostics, context);
			case PlanProPackage.PROJEKT_NUMMER_TYPE:
				return validateProjekt_Nummer_Type((String)value, diagnostics, context);
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE:
				return validateReferenz_Planung_Basis_Type((String)value, diagnostics, context);
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE:
				return validateReferenz_Vergleich_Besonders_Type((String)value, diagnostics, context);
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE:
				return validateStrecke_Abschnitt_Type((String)value, diagnostics, context);
			case PlanProPackage.STRECKE_KM_TYPE:
				return validateStrecke_Km_Type((String)value, diagnostics, context);
			case PlanProPackage.STRECKE_NUMMER_TYPE:
				return validateStrecke_Nummer_Type((String)value, diagnostics, context);
			case PlanProPackage.TELEFONNUMMER_TYPE:
				return validateTelefonnummer_Type((String)value, diagnostics, context);
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE:
				return validateVerantwortliche_Stelle_DB_Type((String)value, diagnostics, context);
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE:
				return validateVergleich_Ausgabestand_Basis_Type((String)value, diagnostics, context);
			case PlanProPackage.WERKZEUG_NAME_TYPE:
				return validateWerkzeug_Name_Type((String)value, diagnostics, context);
			case PlanProPackage.WERKZEUG_VERSION_TYPE:
				return validateWerkzeug_Version_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_PLZ_Ort_TypeClass(Adresse_PLZ_Ort_TypeClass adresse_PLZ_Ort_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adresse_PLZ_Ort_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_Strasse_Nr_TypeClass(Adresse_Strasse_Nr_TypeClass adresse_Strasse_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adresse_Strasse_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkteur(Akteur akteur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akteur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkteur_Allg_AttributeGroup(Akteur_Allg_AttributeGroup akteur_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akteur_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkteur_Zuordnung(Akteur_Zuordnung akteur_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akteur_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusgabe_Fachdaten(Ausgabe_Fachdaten ausgabe_Fachdaten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausgabe_Fachdaten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauabschnitt_TypeClass(Bauabschnitt_TypeClass bauabschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bauabschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauphase_TypeClass(Bauphase_TypeClass bauphase_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bauphase_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Kurzbezeichnung_TypeClass(Bauzustand_Kurzbezeichnung_TypeClass bauzustand_Kurzbezeichnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bauzustand_Kurzbezeichnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Langbezeichnung_TypeClass(Bauzustand_Langbezeichnung_TypeClass bauzustand_Langbezeichnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bauzustand_Langbezeichnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBemerkung_TypeClass(Bemerkung_TypeClass bemerkung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bemerkung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Anlage_TypeClass(Bezeichnung_Anlage_TypeClass bezeichnung_Anlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Anlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Gruppe_TypeClass(Bezeichnung_Planung_Gruppe_TypeClass bezeichnung_Planung_Gruppe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Planung_Gruppe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Projekt_TypeClass(Bezeichnung_Planung_Projekt_TypeClass bezeichnung_Planung_Projekt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Planung_Projekt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Unteranlage_TypeClass(Bezeichnung_Unteranlage_TypeClass bezeichnung_Unteranlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Unteranlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_AttributeGroup(Container_AttributeGroup container_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Abschluss_Einzel_TypeClass(Datum_Abschluss_Einzel_TypeClass datum_Abschluss_Einzel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Abschluss_Einzel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Abschluss_Gruppe_TypeClass(Datum_Abschluss_Gruppe_TypeClass datum_Abschluss_Gruppe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Abschluss_Gruppe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Abschluss_Projekt_TypeClass(Datum_Abschluss_Projekt_TypeClass datum_Abschluss_Projekt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Abschluss_Projekt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Regelwerksstand_TypeClass(Datum_Regelwerksstand_TypeClass datum_Regelwerksstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Regelwerksstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_TypeClass(Datum_TypeClass datum_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Uebernahme_TypeClass(Datum_Uebernahme_TypeClass datum_Uebernahme_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Uebernahme_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateE_Mail_Adresse_TypeClass(E_Mail_Adresse_TypeClass e_Mail_Adresse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(e_Mail_Adresse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErzeugung_Zeitstempel_TypeClass(Erzeugung_Zeitstempel_TypeClass erzeugung_Zeitstempel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erzeugung_Zeitstempel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFachdaten_AttributeGroup(Fachdaten_AttributeGroup fachdaten_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fachdaten_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuehrende_Oertlichkeit_TypeClass(Fuehrende_Oertlichkeit_TypeClass fuehrende_Oertlichkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuehrende_Oertlichkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdent_Rolle_TypeClass(Ident_Rolle_TypeClass ident_Rolle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ident_Rolle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex_Ausgabe_TypeClass(Index_Ausgabe_TypeClass index_Ausgabe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(index_Ausgabe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformativ_TypeClass(Informativ_TypeClass informativ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informativ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKoordinatensystem_BB_TypeClass(Koordinatensystem_BB_TypeClass koordinatensystem_BB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(koordinatensystem_BB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKoordinatensystem_PB_TypeClass(Koordinatensystem_PB_TypeClass koordinatensystem_PB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(koordinatensystem_PB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaufende_Nummer_Ausgabe_TypeClass(Laufende_Nummer_Ausgabe_TypeClass laufende_Nummer_Ausgabe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laufende_Nummer_Ausgabe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLST_Objekte_Planungsbereich_AttributeGroup(LST_Objekte_Planungsbereich_AttributeGroup lsT_Objekte_Planungsbereich_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lsT_Objekte_Planungsbereich_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLST_Planung_AttributeGroup(LST_Planung_AttributeGroup lsT_Planung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lsT_Planung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLST_Zustand(LST_Zustand lsT_Zustand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lsT_Zustand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_10_TypeClass(Name_Akteur_10_TypeClass name_Akteur_10_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(name_Akteur_10_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_5_TypeClass(Name_Akteur_5_TypeClass name_Akteur_5_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(name_Akteur_5_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_TypeClass(Name_Akteur_TypeClass name_Akteur_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(name_Akteur_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Organisation_TypeClass(Name_Organisation_TypeClass name_Organisation_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(name_Organisation_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjektmanagement_AttributeGroup(Objektmanagement_AttributeGroup objektmanagement_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objektmanagement_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisation(Organisation organisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationseinheit_TypeClass(Organisationseinheit_TypeClass organisationseinheit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organisationseinheit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_Schnittstelle(PlanPro_Schnittstelle planPro_Schnittstelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planPro_Schnittstelle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_Schnittstelle_Allg_AttributeGroup(PlanPro_Schnittstelle_Allg_AttributeGroup planPro_Schnittstelle_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planPro_Schnittstelle_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_XSD_Version_TypeClass(PlanPro_XSD_Version_TypeClass planPro_XSD_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planPro_XSD_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_E_Allg_AttributeGroup(Planung_E_Allg_AttributeGroup planung_E_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_E_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_E_Art_TypeClass(Planung_E_Art_TypeClass planung_E_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_E_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_E_Ausgabe_Besonders_AttributeGroup(Planung_E_Ausgabe_Besonders_AttributeGroup planung_E_Ausgabe_Besonders_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_E_Ausgabe_Besonders_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_E_Handlung_AttributeGroup(Planung_E_Handlung_AttributeGroup planung_E_Handlung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_E_Handlung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_Einzel(Planung_Einzel planung_Einzel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_Einzel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_G_Allg_AttributeGroup(Planung_G_Allg_AttributeGroup planung_G_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_G_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_G_Art_Besonders_TypeClass(Planung_G_Art_Besonders_TypeClass planung_G_Art_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_G_Art_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_G_Fuehrende_Strecke_AttributeGroup(Planung_G_Fuehrende_Strecke_AttributeGroup planung_G_Fuehrende_Strecke_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_G_Fuehrende_Strecke_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_G_Schriftfeld_AttributeGroup(Planung_G_Schriftfeld_AttributeGroup planung_G_Schriftfeld_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_G_Schriftfeld_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_Gruppe(Planung_Gruppe planung_Gruppe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_Gruppe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_P_Allg_AttributeGroup(Planung_P_Allg_AttributeGroup planung_P_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_P_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_Phase_TypeClass(Planung_Phase_TypeClass planung_Phase_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_Phase_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanung_Projekt(Planung_Projekt planung_Projekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planung_Projekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone_Betrachtungsbereich_AttributeGroup(Polygone_Betrachtungsbereich_AttributeGroup polygone_Betrachtungsbereich_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygone_Betrachtungsbereich_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone_Planungsbereich_AttributeGroup(Polygone_Planungsbereich_AttributeGroup polygone_Planungsbereich_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygone_Planungsbereich_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Betrachtungsbereich_TypeClass(Polygonzug_Betrachtungsbereich_TypeClass polygonzug_Betrachtungsbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonzug_Betrachtungsbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Planungsbereich_TypeClass(Polygonzug_Planungsbereich_TypeClass polygonzug_Planungsbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonzug_Planungsbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjekt_Nummer_TypeClass(Projekt_Nummer_TypeClass projekt_Nummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projekt_Nummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Planung_Basis_TypeClass(Referenz_Planung_Basis_TypeClass referenz_Planung_Basis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenz_Planung_Basis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Vergleich_Besonders_TypeClass(Referenz_Vergleich_Besonders_TypeClass referenz_Vergleich_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenz_Vergleich_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Abschnitt_TypeClass(Strecke_Abschnitt_TypeClass strecke_Abschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Abschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Km_TypeClass(Strecke_Km_TypeClass strecke_Km_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Km_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Nummer_TypeClass(Strecke_Nummer_TypeClass strecke_Nummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Nummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelefonnummer_TypeClass(Telefonnummer_TypeClass telefonnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telefonnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntergewerk_Art_TypeClass(Untergewerk_Art_TypeClass untergewerk_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(untergewerk_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerantwortliche_Stelle_DB_TypeClass(Verantwortliche_Stelle_DB_TypeClass verantwortliche_Stelle_DB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verantwortliche_Stelle_DB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVergleich_Ausgabestand_Basis_TypeClass(Vergleich_Ausgabestand_Basis_TypeClass vergleich_Ausgabestand_Basis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vergleich_Ausgabestand_Basis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVergleichstyp_Besonders_TypeClass(Vergleichstyp_Besonders_TypeClass vergleichstyp_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vergleichstyp_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Name_TypeClass(Werkzeug_Name_TypeClass werkzeug_Name_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(werkzeug_Name_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Version_TypeClass(Werkzeug_Version_TypeClass werkzeug_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(werkzeug_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKoordinatensystem(ENUMKoordinatensystem enumKoordinatensystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungEArt(ENUMPlanungEArt enumPlanungEArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungGArtBesonders(ENUMPlanungGArtBesonders enumPlanungGArtBesonders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungPhase(ENUMPlanungPhase enumPlanungPhase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUntergewerkArt(ENUMUntergewerkArt enumUntergewerkArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVergleichstypBesonders(ENUMVergleichstypBesonders enumVergleichstypBesonders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_PLZ_Ort_Type(String adresse_PLZ_Ort_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdresse_PLZ_Ort_Type_Pattern(adresse_PLZ_Ort_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAdresse_PLZ_Ort_Type_Pattern
	 */
	public static final  PatternMatcher [][] ADRESSE_PLZ_ORT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Adresse PLZ Ort Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_PLZ_Ort_Type_Pattern(String adresse_PLZ_Ort_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getAdresse_PLZ_Ort_Type(), adresse_PLZ_Ort_Type, ADRESSE_PLZ_ORT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_Strasse_Nr_Type(String adresse_Strasse_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAdresse_Strasse_Nr_Type_Pattern(adresse_Strasse_Nr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAdresse_Strasse_Nr_Type_Pattern
	 */
	public static final  PatternMatcher [][] ADRESSE_STRASSE_NR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Adresse Strasse Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdresse_Strasse_Nr_Type_Pattern(String adresse_Strasse_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getAdresse_Strasse_Nr_Type(), adresse_Strasse_Nr_Type, ADRESSE_STRASSE_NR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauabschnitt_Type(String bauabschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBauabschnitt_Type_Pattern(bauabschnitt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBauabschnitt_Type_Pattern
	 */
	public static final  PatternMatcher [][] BAUABSCHNITT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bauabschnitt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauabschnitt_Type_Pattern(String bauabschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBauabschnitt_Type(), bauabschnitt_Type, BAUABSCHNITT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauphase_Type(String bauphase_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBauphase_Type_Pattern(bauphase_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBauphase_Type_Pattern
	 */
	public static final  PatternMatcher [][] BAUPHASE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bauphase Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauphase_Type_Pattern(String bauphase_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBauphase_Type(), bauphase_Type, BAUPHASE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Kurzbezeichnung_Type(String bauzustand_Kurzbezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBauzustand_Kurzbezeichnung_Type_Pattern(bauzustand_Kurzbezeichnung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBauzustand_Kurzbezeichnung_Type_Pattern
	 */
	public static final  PatternMatcher [][] BAUZUSTAND_KURZBEZEICHNUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,15}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bauzustand Kurzbezeichnung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Kurzbezeichnung_Type_Pattern(String bauzustand_Kurzbezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBauzustand_Kurzbezeichnung_Type(), bauzustand_Kurzbezeichnung_Type, BAUZUSTAND_KURZBEZEICHNUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Langbezeichnung_Type(String bauzustand_Langbezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBauzustand_Langbezeichnung_Type_Pattern(bauzustand_Langbezeichnung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBauzustand_Langbezeichnung_Type_Pattern
	 */
	public static final  PatternMatcher [][] BAUZUSTAND_LANGBEZEICHNUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bauzustand Langbezeichnung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauzustand_Langbezeichnung_Type_Pattern(String bauzustand_Langbezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBauzustand_Langbezeichnung_Type(), bauzustand_Langbezeichnung_Type, BAUZUSTAND_LANGBEZEICHNUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBemerkung_Type(String bemerkung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Anlage_Type(String bezeichnung_Anlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Anlage_Type_Pattern(bezeichnung_Anlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Anlage_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_ANLAGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,35}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Anlage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Anlage_Type_Pattern(String bezeichnung_Anlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBezeichnung_Anlage_Type(), bezeichnung_Anlage_Type, BEZEICHNUNG_ANLAGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Gruppe_Type(String bezeichnung_Planung_Gruppe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Planung_Gruppe_Type_Pattern(bezeichnung_Planung_Gruppe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Planung_Gruppe_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_PLANUNG_GRUPPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Planung Gruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Gruppe_Type_Pattern(String bezeichnung_Planung_Gruppe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBezeichnung_Planung_Gruppe_Type(), bezeichnung_Planung_Gruppe_Type, BEZEICHNUNG_PLANUNG_GRUPPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Projekt_Type(String bezeichnung_Planung_Projekt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Planung_Projekt_Type_Pattern(bezeichnung_Planung_Projekt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Planung_Projekt_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_PLANUNG_PROJEKT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,150}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Planung Projekt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Planung_Projekt_Type_Pattern(String bezeichnung_Planung_Projekt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBezeichnung_Planung_Projekt_Type(), bezeichnung_Planung_Projekt_Type, BEZEICHNUNG_PLANUNG_PROJEKT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Unteranlage_Type(String bezeichnung_Unteranlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Unteranlage_Type_Pattern(bezeichnung_Unteranlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Unteranlage_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_UNTERANLAGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,35}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Unteranlage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Unteranlage_Type_Pattern(String bezeichnung_Unteranlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getBezeichnung_Unteranlage_Type(), bezeichnung_Unteranlage_Type, BEZEICHNUNG_UNTERANLAGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateE_Mail_Adresse_Type(String e_Mail_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateE_Mail_Adresse_Type_Pattern(e_Mail_Adresse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateE_Mail_Adresse_Type_Pattern
	 */
	public static final  PatternMatcher [][] EMAIL_ADRESSE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}@.{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>EMail Adresse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateE_Mail_Adresse_Type_Pattern(String e_Mail_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getE_Mail_Adresse_Type(), e_Mail_Adresse_Type, EMAIL_ADRESSE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKoordinatensystemObject(ENUMKoordinatensystem enumKoordinatensystemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungEArtObject(ENUMPlanungEArt enumPlanungEArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungGArtBesondersObject(ENUMPlanungGArtBesonders enumPlanungGArtBesondersObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanungPhaseObject(ENUMPlanungPhase enumPlanungPhaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUntergewerkArtObject(ENUMUntergewerkArt enumUntergewerkArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVergleichstypBesondersObject(ENUMVergleichstypBesonders enumVergleichstypBesondersObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuehrende_Oertlichkeit_Type(String fuehrende_Oertlichkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFuehrende_Oertlichkeit_Type_Pattern(fuehrende_Oertlichkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFuehrende_Oertlichkeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] FUEHRENDE_OERTLICHKEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z][A-Z0-9 ]{1,4}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fuehrende Oertlichkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuehrende_Oertlichkeit_Type_Pattern(String fuehrende_Oertlichkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getFuehrende_Oertlichkeit_Type(), fuehrende_Oertlichkeit_Type, FUEHRENDE_OERTLICHKEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdent_Rolle_Type(String ident_Rolle_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdent_Rolle_Type_Pattern(ident_Rolle_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdent_Rolle_Type_Pattern
	 */
	public static final  PatternMatcher [][] IDENT_ROLLE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ident Rolle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdent_Rolle_Type_Pattern(String ident_Rolle_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getIdent_Rolle_Type(), ident_Rolle_Type, IDENT_ROLLE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex_Ausgabe_Type(String index_Ausgabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIndex_Ausgabe_Type_Pattern(index_Ausgabe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIndex_Ausgabe_Type_Pattern
	 */
	public static final  PatternMatcher [][] INDEX_AUSGABE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Index Ausgabe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex_Ausgabe_Type_Pattern(String index_Ausgabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getIndex_Ausgabe_Type(), index_Ausgabe_Type, INDEX_AUSGABE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaufende_Nummer_Ausgabe_Type(String laufende_Nummer_Ausgabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLaufende_Nummer_Ausgabe_Type_Pattern(laufende_Nummer_Ausgabe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLaufende_Nummer_Ausgabe_Type_Pattern
	 */
	public static final  PatternMatcher [][] LAUFENDE_NUMMER_AUSGABE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Laufende Nummer Ausgabe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaufende_Nummer_Ausgabe_Type_Pattern(String laufende_Nummer_Ausgabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getLaufende_Nummer_Ausgabe_Type(), laufende_Nummer_Ausgabe_Type, LAUFENDE_NUMMER_AUSGABE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_10_Type(String name_Akteur_10_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_Akteur_10_Type_Pattern(name_Akteur_10_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateName_Akteur_10_Type_Pattern
	 */
	public static final  PatternMatcher [][] NAME_AKTEUR_10_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,10}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Akteur 10 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_10_Type_Pattern(String name_Akteur_10_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getName_Akteur_10_Type(), name_Akteur_10_Type, NAME_AKTEUR_10_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_5_Type(String name_Akteur_5_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_Akteur_5_Type_Pattern(name_Akteur_5_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateName_Akteur_5_Type_Pattern
	 */
	public static final  PatternMatcher [][] NAME_AKTEUR_5TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,5}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Akteur 5Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_5_Type_Pattern(String name_Akteur_5_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getName_Akteur_5_Type(), name_Akteur_5_Type, NAME_AKTEUR_5TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_Type(String name_Akteur_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_Akteur_Type_Pattern(name_Akteur_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateName_Akteur_Type_Pattern
	 */
	public static final  PatternMatcher [][] NAME_AKTEUR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Akteur Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Akteur_Type_Pattern(String name_Akteur_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getName_Akteur_Type(), name_Akteur_Type, NAME_AKTEUR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Organisation_Type(String name_Organisation_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_Organisation_Type_Pattern(name_Organisation_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateName_Organisation_Type_Pattern
	 */
	public static final  PatternMatcher [][] NAME_ORGANISATION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Organisation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Organisation_Type_Pattern(String name_Organisation_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getName_Organisation_Type(), name_Organisation_Type, NAME_ORGANISATION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationseinheit_Type(String organisationseinheit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrganisationseinheit_Type_Pattern(organisationseinheit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOrganisationseinheit_Type_Pattern
	 */
	public static final  PatternMatcher [][] ORGANISATIONSEINHEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Organisationseinheit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationseinheit_Type_Pattern(String organisationseinheit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getOrganisationseinheit_Type(), organisationseinheit_Type, ORGANISATIONSEINHEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_XSD_Version_Type(String planPro_XSD_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePlanPro_XSD_Version_Type_Pattern(planPro_XSD_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePlanPro_XSD_Version_Type_Pattern
	 */
	public static final  PatternMatcher [][] PLAN_PRO_XSD_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|([1-9][0-9]{0,}))\\.(0|([1-9][0-9]{0,}))\\.(0|([1-9][0-9]{0,}))(\\.(0|([1-9][0-9]{0,})))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Plan Pro XSD Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_XSD_Version_Type_Pattern(String planPro_XSD_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getPlanPro_XSD_Version_Type(), planPro_XSD_Version_Type, PLAN_PRO_XSD_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Betrachtungsbereich_Type(String polygonzug_Betrachtungsbereich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Planungsbereich_Type(String polygonzug_Planungsbereich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjekt_Nummer_Type(String projekt_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProjekt_Nummer_Type_Pattern(projekt_Nummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProjekt_Nummer_Type_Pattern
	 */
	public static final  PatternMatcher [][] PROJEKT_NUMMER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Projekt Nummer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjekt_Nummer_Type_Pattern(String projekt_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getProjekt_Nummer_Type(), projekt_Nummer_Type, PROJEKT_NUMMER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Planung_Basis_Type(String referenz_Planung_Basis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(referenz_Planung_Basis_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Vergleich_Besonders_Type(String referenz_Vergleich_Besonders_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(referenz_Vergleich_Besonders_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Abschnitt_Type(String strecke_Abschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrecke_Abschnitt_Type_Pattern(strecke_Abschnitt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStrecke_Abschnitt_Type_Pattern
	 */
	public static final  PatternMatcher [][] STRECKE_ABSCHNITT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Strecke Abschnitt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Abschnitt_Type_Pattern(String strecke_Abschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getStrecke_Abschnitt_Type(), strecke_Abschnitt_Type, STRECKE_ABSCHNITT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Km_Type(String strecke_Km_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateKilometrierung_Type_Pattern(strecke_Km_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Nummer_Type(String strecke_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrecke_Nummer_Type_Pattern(strecke_Nummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStrecke_Nummer_Type_Pattern
	 */
	public static final  PatternMatcher [][] STRECKE_NUMMER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Strecke Nummer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Nummer_Type_Pattern(String strecke_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getStrecke_Nummer_Type(), strecke_Nummer_Type, STRECKE_NUMMER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelefonnummer_Type(String telefonnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTelefonnummer_Type_Pattern(telefonnummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTelefonnummer_Type_Pattern
	 */
	public static final  PatternMatcher [][] TELEFONNUMMER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Telefonnummer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelefonnummer_Type_Pattern(String telefonnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getTelefonnummer_Type(), telefonnummer_Type, TELEFONNUMMER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerantwortliche_Stelle_DB_Type(String verantwortliche_Stelle_DB_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(verantwortliche_Stelle_DB_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVergleich_Ausgabestand_Basis_Type(String vergleich_Ausgabestand_Basis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVergleich_Ausgabestand_Basis_Type_Pattern(vergleich_Ausgabestand_Basis_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVergleich_Ausgabestand_Basis_Type_Pattern
	 */
	public static final  PatternMatcher [][] VERGLEICH_AUSGABESTAND_BASIS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Vergleich Ausgabestand Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVergleich_Ausgabestand_Basis_Type_Pattern(String vergleich_Ausgabestand_Basis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getVergleich_Ausgabestand_Basis_Type(), vergleich_Ausgabestand_Basis_Type, VERGLEICH_AUSGABESTAND_BASIS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Name_Type(String werkzeug_Name_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWerkzeug_Name_Type_Pattern(werkzeug_Name_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateWerkzeug_Name_Type_Pattern
	 */
	public static final  PatternMatcher [][] WERKZEUG_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Werkzeug Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Name_Type_Pattern(String werkzeug_Name_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getWerkzeug_Name_Type(), werkzeug_Name_Type, WERKZEUG_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Version_Type(String werkzeug_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWerkzeug_Version_Type_Pattern(werkzeug_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateWerkzeug_Version_Type_Pattern
	 */
	public static final  PatternMatcher [][] WERKZEUG_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Werkzeug Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWerkzeug_Version_Type_Pattern(String werkzeug_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PlanProPackage.eINSTANCE.getWerkzeug_Version_Type(), werkzeug_Version_Type, WERKZEUG_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PlanProValidator
