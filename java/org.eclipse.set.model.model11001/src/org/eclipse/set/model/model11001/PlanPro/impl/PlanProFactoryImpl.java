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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.PlanPro.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanProFactoryImpl extends EFactoryImpl implements PlanProFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlanProFactory init() {
		try {
			PlanProFactory thePlanProFactory = (PlanProFactory)EPackage.Registry.INSTANCE.getEFactory(PlanProPackage.eNS_URI);
			if (thePlanProFactory != null) {
				return thePlanProFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlanProFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanProFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE_CLASS: return createAdresse_PLZ_Ort_TypeClass();
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE_CLASS: return createAdresse_Strasse_Nr_TypeClass();
			case PlanProPackage.AKTEUR: return createAkteur();
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP: return createAkteur_Allg_AttributeGroup();
			case PlanProPackage.AKTEUR_ZUORDNUNG: return createAkteur_Zuordnung();
			case PlanProPackage.AUSGABE_FACHDATEN: return createAusgabe_Fachdaten();
			case PlanProPackage.BAUABSCHNITT_TYPE_CLASS: return createBauabschnitt_TypeClass();
			case PlanProPackage.BAUPHASE_TYPE_CLASS: return createBauphase_TypeClass();
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE_CLASS: return createBauzustand_Kurzbezeichnung_TypeClass();
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE_CLASS: return createBauzustand_Langbezeichnung_TypeClass();
			case PlanProPackage.BEMERKUNG_TYPE_CLASS: return createBemerkung_TypeClass();
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE_CLASS: return createBezeichnung_Anlage_TypeClass();
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE_CLASS: return createBezeichnung_Planung_Gruppe_TypeClass();
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE_CLASS: return createBezeichnung_Planung_Projekt_TypeClass();
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE_CLASS: return createBezeichnung_Unteranlage_TypeClass();
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP: return createContainer_AttributeGroup();
			case PlanProPackage.DATUM_ABSCHLUSS_EINZEL_TYPE_CLASS: return createDatum_Abschluss_Einzel_TypeClass();
			case PlanProPackage.DATUM_ABSCHLUSS_GRUPPE_TYPE_CLASS: return createDatum_Abschluss_Gruppe_TypeClass();
			case PlanProPackage.DATUM_ABSCHLUSS_PROJEKT_TYPE_CLASS: return createDatum_Abschluss_Projekt_TypeClass();
			case PlanProPackage.DATUM_REGELWERKSSTAND_TYPE_CLASS: return createDatum_Regelwerksstand_TypeClass();
			case PlanProPackage.DATUM_TYPE_CLASS: return createDatum_TypeClass();
			case PlanProPackage.DATUM_UEBERNAHME_TYPE_CLASS: return createDatum_Uebernahme_TypeClass();
			case PlanProPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PlanProPackage.EMAIL_ADRESSE_TYPE_CLASS: return createE_Mail_Adresse_TypeClass();
			case PlanProPackage.ERZEUGUNG_ZEITSTEMPEL_TYPE_CLASS: return createErzeugung_Zeitstempel_TypeClass();
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP: return createFachdaten_AttributeGroup();
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE_CLASS: return createFuehrende_Oertlichkeit_TypeClass();
			case PlanProPackage.IDENT_ROLLE_TYPE_CLASS: return createIdent_Rolle_TypeClass();
			case PlanProPackage.INDEX_AUSGABE_TYPE_CLASS: return createIndex_Ausgabe_TypeClass();
			case PlanProPackage.INFORMATIV_TYPE_CLASS: return createInformativ_TypeClass();
			case PlanProPackage.KOORDINATENSYSTEM_BB_TYPE_CLASS: return createKoordinatensystem_BB_TypeClass();
			case PlanProPackage.KOORDINATENSYSTEM_PB_TYPE_CLASS: return createKoordinatensystem_PB_TypeClass();
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE_CLASS: return createLaufende_Nummer_Ausgabe_TypeClass();
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP: return createLST_Objekte_Planungsbereich_AttributeGroup();
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP: return createLST_Planung_AttributeGroup();
			case PlanProPackage.LST_ZUSTAND: return createLST_Zustand();
			case PlanProPackage.NAME_AKTEUR_10_TYPE_CLASS: return createName_Akteur_10_TypeClass();
			case PlanProPackage.NAME_AKTEUR_5TYPE_CLASS: return createName_Akteur_5_TypeClass();
			case PlanProPackage.NAME_AKTEUR_TYPE_CLASS: return createName_Akteur_TypeClass();
			case PlanProPackage.NAME_ORGANISATION_TYPE_CLASS: return createName_Organisation_TypeClass();
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP: return createObjektmanagement_AttributeGroup();
			case PlanProPackage.ORGANISATION: return createOrganisation();
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE_CLASS: return createOrganisationseinheit_TypeClass();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE: return createPlanPro_Schnittstelle();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP: return createPlanPro_Schnittstelle_Allg_AttributeGroup();
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE_CLASS: return createPlanPro_XSD_Version_TypeClass();
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP: return createPlanung_E_Allg_AttributeGroup();
			case PlanProPackage.PLANUNG_EART_TYPE_CLASS: return createPlanung_E_Art_TypeClass();
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP: return createPlanung_E_Ausgabe_Besonders_AttributeGroup();
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP: return createPlanung_E_Handlung_AttributeGroup();
			case PlanProPackage.PLANUNG_EINZEL: return createPlanung_Einzel();
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP: return createPlanung_G_Allg_AttributeGroup();
			case PlanProPackage.PLANUNG_GART_BESONDERS_TYPE_CLASS: return createPlanung_G_Art_Besonders_TypeClass();
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP: return createPlanung_G_Fuehrende_Strecke_AttributeGroup();
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP: return createPlanung_G_Schriftfeld_AttributeGroup();
			case PlanProPackage.PLANUNG_GRUPPE: return createPlanung_Gruppe();
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP: return createPlanung_P_Allg_AttributeGroup();
			case PlanProPackage.PLANUNG_PHASE_TYPE_CLASS: return createPlanung_Phase_TypeClass();
			case PlanProPackage.PLANUNG_PROJEKT: return createPlanung_Projekt();
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP: return createPolygone_Betrachtungsbereich_AttributeGroup();
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP: return createPolygone_Planungsbereich_AttributeGroup();
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS: return createPolygonzug_Betrachtungsbereich_TypeClass();
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE_CLASS: return createPolygonzug_Planungsbereich_TypeClass();
			case PlanProPackage.PROJEKT_NUMMER_TYPE_CLASS: return createProjekt_Nummer_TypeClass();
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE_CLASS: return createReferenz_Planung_Basis_TypeClass();
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE_CLASS: return createReferenz_Vergleich_Besonders_TypeClass();
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE_CLASS: return createStrecke_Abschnitt_TypeClass();
			case PlanProPackage.STRECKE_KM_TYPE_CLASS: return createStrecke_Km_TypeClass();
			case PlanProPackage.STRECKE_NUMMER_TYPE_CLASS: return createStrecke_Nummer_TypeClass();
			case PlanProPackage.TELEFONNUMMER_TYPE_CLASS: return createTelefonnummer_TypeClass();
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS: return createUntergewerk_Art_TypeClass();
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE_CLASS: return createVerantwortliche_Stelle_DB_TypeClass();
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE_CLASS: return createVergleich_Ausgabestand_Basis_TypeClass();
			case PlanProPackage.VERGLEICHSTYP_BESONDERS_TYPE_CLASS: return createVergleichstyp_Besonders_TypeClass();
			case PlanProPackage.WERKZEUG_NAME_TYPE_CLASS: return createWerkzeug_Name_TypeClass();
			case PlanProPackage.WERKZEUG_VERSION_TYPE_CLASS: return createWerkzeug_Version_TypeClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlanProPackage.ENUM_KOORDINATENSYSTEM:
				return createENUMKoordinatensystemFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_EART:
				return createENUMPlanungEArtFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS:
				return createENUMPlanungGArtBesondersFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_PHASE:
				return createENUMPlanungPhaseFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_UNTERGEWERK_ART:
				return createENUMUntergewerkArtFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS:
				return createENUMVergleichstypBesondersFromString(eDataType, initialValue);
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE:
				return createAdresse_PLZ_Ort_TypeFromString(eDataType, initialValue);
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE:
				return createAdresse_Strasse_Nr_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BAUABSCHNITT_TYPE:
				return createBauabschnitt_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BAUPHASE_TYPE:
				return createBauphase_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE:
				return createBauzustand_Kurzbezeichnung_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE:
				return createBauzustand_Langbezeichnung_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BEMERKUNG_TYPE:
				return createBemerkung_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE:
				return createBezeichnung_Anlage_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE:
				return createBezeichnung_Planung_Gruppe_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE:
				return createBezeichnung_Planung_Projekt_TypeFromString(eDataType, initialValue);
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE:
				return createBezeichnung_Unteranlage_TypeFromString(eDataType, initialValue);
			case PlanProPackage.EMAIL_ADRESSE_TYPE:
				return createE_Mail_Adresse_TypeFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_KOORDINATENSYSTEM_OBJECT:
				return createENUMKoordinatensystemObjectFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_EART_OBJECT:
				return createENUMPlanungEArtObjectFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS_OBJECT:
				return createENUMPlanungGArtBesondersObjectFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_PLANUNG_PHASE_OBJECT:
				return createENUMPlanungPhaseObjectFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_UNTERGEWERK_ART_OBJECT:
				return createENUMUntergewerkArtObjectFromString(eDataType, initialValue);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS_OBJECT:
				return createENUMVergleichstypBesondersObjectFromString(eDataType, initialValue);
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE:
				return createFuehrende_Oertlichkeit_TypeFromString(eDataType, initialValue);
			case PlanProPackage.IDENT_ROLLE_TYPE:
				return createIdent_Rolle_TypeFromString(eDataType, initialValue);
			case PlanProPackage.INDEX_AUSGABE_TYPE:
				return createIndex_Ausgabe_TypeFromString(eDataType, initialValue);
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE:
				return createLaufende_Nummer_Ausgabe_TypeFromString(eDataType, initialValue);
			case PlanProPackage.NAME_AKTEUR_10_TYPE:
				return createName_Akteur_10_TypeFromString(eDataType, initialValue);
			case PlanProPackage.NAME_AKTEUR_5TYPE:
				return createName_Akteur_5_TypeFromString(eDataType, initialValue);
			case PlanProPackage.NAME_AKTEUR_TYPE:
				return createName_Akteur_TypeFromString(eDataType, initialValue);
			case PlanProPackage.NAME_ORGANISATION_TYPE:
				return createName_Organisation_TypeFromString(eDataType, initialValue);
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE:
				return createOrganisationseinheit_TypeFromString(eDataType, initialValue);
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE:
				return createPlanPro_XSD_Version_TypeFromString(eDataType, initialValue);
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE:
				return createPolygonzug_Betrachtungsbereich_TypeFromString(eDataType, initialValue);
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE:
				return createPolygonzug_Planungsbereich_TypeFromString(eDataType, initialValue);
			case PlanProPackage.PROJEKT_NUMMER_TYPE:
				return createProjekt_Nummer_TypeFromString(eDataType, initialValue);
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE:
				return createReferenz_Planung_Basis_TypeFromString(eDataType, initialValue);
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE:
				return createReferenz_Vergleich_Besonders_TypeFromString(eDataType, initialValue);
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE:
				return createStrecke_Abschnitt_TypeFromString(eDataType, initialValue);
			case PlanProPackage.STRECKE_KM_TYPE:
				return createStrecke_Km_TypeFromString(eDataType, initialValue);
			case PlanProPackage.STRECKE_NUMMER_TYPE:
				return createStrecke_Nummer_TypeFromString(eDataType, initialValue);
			case PlanProPackage.TELEFONNUMMER_TYPE:
				return createTelefonnummer_TypeFromString(eDataType, initialValue);
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE:
				return createVerantwortliche_Stelle_DB_TypeFromString(eDataType, initialValue);
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE:
				return createVergleich_Ausgabestand_Basis_TypeFromString(eDataType, initialValue);
			case PlanProPackage.WERKZEUG_NAME_TYPE:
				return createWerkzeug_Name_TypeFromString(eDataType, initialValue);
			case PlanProPackage.WERKZEUG_VERSION_TYPE:
				return createWerkzeug_Version_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlanProPackage.ENUM_KOORDINATENSYSTEM:
				return convertENUMKoordinatensystemToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_EART:
				return convertENUMPlanungEArtToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS:
				return convertENUMPlanungGArtBesondersToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_PHASE:
				return convertENUMPlanungPhaseToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_UNTERGEWERK_ART:
				return convertENUMUntergewerkArtToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS:
				return convertENUMVergleichstypBesondersToString(eDataType, instanceValue);
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE:
				return convertAdresse_PLZ_Ort_TypeToString(eDataType, instanceValue);
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE:
				return convertAdresse_Strasse_Nr_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BAUABSCHNITT_TYPE:
				return convertBauabschnitt_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BAUPHASE_TYPE:
				return convertBauphase_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE:
				return convertBauzustand_Kurzbezeichnung_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE:
				return convertBauzustand_Langbezeichnung_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BEMERKUNG_TYPE:
				return convertBemerkung_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE:
				return convertBezeichnung_Anlage_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE:
				return convertBezeichnung_Planung_Gruppe_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE:
				return convertBezeichnung_Planung_Projekt_TypeToString(eDataType, instanceValue);
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE:
				return convertBezeichnung_Unteranlage_TypeToString(eDataType, instanceValue);
			case PlanProPackage.EMAIL_ADRESSE_TYPE:
				return convertE_Mail_Adresse_TypeToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_KOORDINATENSYSTEM_OBJECT:
				return convertENUMKoordinatensystemObjectToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_EART_OBJECT:
				return convertENUMPlanungEArtObjectToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_GART_BESONDERS_OBJECT:
				return convertENUMPlanungGArtBesondersObjectToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_PLANUNG_PHASE_OBJECT:
				return convertENUMPlanungPhaseObjectToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_UNTERGEWERK_ART_OBJECT:
				return convertENUMUntergewerkArtObjectToString(eDataType, instanceValue);
			case PlanProPackage.ENUM_VERGLEICHSTYP_BESONDERS_OBJECT:
				return convertENUMVergleichstypBesondersObjectToString(eDataType, instanceValue);
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE:
				return convertFuehrende_Oertlichkeit_TypeToString(eDataType, instanceValue);
			case PlanProPackage.IDENT_ROLLE_TYPE:
				return convertIdent_Rolle_TypeToString(eDataType, instanceValue);
			case PlanProPackage.INDEX_AUSGABE_TYPE:
				return convertIndex_Ausgabe_TypeToString(eDataType, instanceValue);
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE:
				return convertLaufende_Nummer_Ausgabe_TypeToString(eDataType, instanceValue);
			case PlanProPackage.NAME_AKTEUR_10_TYPE:
				return convertName_Akteur_10_TypeToString(eDataType, instanceValue);
			case PlanProPackage.NAME_AKTEUR_5TYPE:
				return convertName_Akteur_5_TypeToString(eDataType, instanceValue);
			case PlanProPackage.NAME_AKTEUR_TYPE:
				return convertName_Akteur_TypeToString(eDataType, instanceValue);
			case PlanProPackage.NAME_ORGANISATION_TYPE:
				return convertName_Organisation_TypeToString(eDataType, instanceValue);
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE:
				return convertOrganisationseinheit_TypeToString(eDataType, instanceValue);
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE:
				return convertPlanPro_XSD_Version_TypeToString(eDataType, instanceValue);
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE:
				return convertPolygonzug_Betrachtungsbereich_TypeToString(eDataType, instanceValue);
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE:
				return convertPolygonzug_Planungsbereich_TypeToString(eDataType, instanceValue);
			case PlanProPackage.PROJEKT_NUMMER_TYPE:
				return convertProjekt_Nummer_TypeToString(eDataType, instanceValue);
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE:
				return convertReferenz_Planung_Basis_TypeToString(eDataType, instanceValue);
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE:
				return convertReferenz_Vergleich_Besonders_TypeToString(eDataType, instanceValue);
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE:
				return convertStrecke_Abschnitt_TypeToString(eDataType, instanceValue);
			case PlanProPackage.STRECKE_KM_TYPE:
				return convertStrecke_Km_TypeToString(eDataType, instanceValue);
			case PlanProPackage.STRECKE_NUMMER_TYPE:
				return convertStrecke_Nummer_TypeToString(eDataType, instanceValue);
			case PlanProPackage.TELEFONNUMMER_TYPE:
				return convertTelefonnummer_TypeToString(eDataType, instanceValue);
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE:
				return convertVerantwortliche_Stelle_DB_TypeToString(eDataType, instanceValue);
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE:
				return convertVergleich_Ausgabestand_Basis_TypeToString(eDataType, instanceValue);
			case PlanProPackage.WERKZEUG_NAME_TYPE:
				return convertWerkzeug_Name_TypeToString(eDataType, instanceValue);
			case PlanProPackage.WERKZEUG_VERSION_TYPE:
				return convertWerkzeug_Version_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adresse_PLZ_Ort_TypeClass createAdresse_PLZ_Ort_TypeClass() {
		Adresse_PLZ_Ort_TypeClassImpl adresse_PLZ_Ort_TypeClass = new Adresse_PLZ_Ort_TypeClassImpl();
		return adresse_PLZ_Ort_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adresse_Strasse_Nr_TypeClass createAdresse_Strasse_Nr_TypeClass() {
		Adresse_Strasse_Nr_TypeClassImpl adresse_Strasse_Nr_TypeClass = new Adresse_Strasse_Nr_TypeClassImpl();
		return adresse_Strasse_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur createAkteur() {
		AkteurImpl akteur = new AkteurImpl();
		return akteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur_Allg_AttributeGroup createAkteur_Allg_AttributeGroup() {
		Akteur_Allg_AttributeGroupImpl akteur_Allg_AttributeGroup = new Akteur_Allg_AttributeGroupImpl();
		return akteur_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur_Zuordnung createAkteur_Zuordnung() {
		Akteur_ZuordnungImpl akteur_Zuordnung = new Akteur_ZuordnungImpl();
		return akteur_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausgabe_Fachdaten createAusgabe_Fachdaten() {
		Ausgabe_FachdatenImpl ausgabe_Fachdaten = new Ausgabe_FachdatenImpl();
		return ausgabe_Fachdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauabschnitt_TypeClass createBauabschnitt_TypeClass() {
		Bauabschnitt_TypeClassImpl bauabschnitt_TypeClass = new Bauabschnitt_TypeClassImpl();
		return bauabschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauphase_TypeClass createBauphase_TypeClass() {
		Bauphase_TypeClassImpl bauphase_TypeClass = new Bauphase_TypeClassImpl();
		return bauphase_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauzustand_Kurzbezeichnung_TypeClass createBauzustand_Kurzbezeichnung_TypeClass() {
		Bauzustand_Kurzbezeichnung_TypeClassImpl bauzustand_Kurzbezeichnung_TypeClass = new Bauzustand_Kurzbezeichnung_TypeClassImpl();
		return bauzustand_Kurzbezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauzustand_Langbezeichnung_TypeClass createBauzustand_Langbezeichnung_TypeClass() {
		Bauzustand_Langbezeichnung_TypeClassImpl bauzustand_Langbezeichnung_TypeClass = new Bauzustand_Langbezeichnung_TypeClassImpl();
		return bauzustand_Langbezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bemerkung_TypeClass createBemerkung_TypeClass() {
		Bemerkung_TypeClassImpl bemerkung_TypeClass = new Bemerkung_TypeClassImpl();
		return bemerkung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Anlage_TypeClass createBezeichnung_Anlage_TypeClass() {
		Bezeichnung_Anlage_TypeClassImpl bezeichnung_Anlage_TypeClass = new Bezeichnung_Anlage_TypeClassImpl();
		return bezeichnung_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Planung_Gruppe_TypeClass createBezeichnung_Planung_Gruppe_TypeClass() {
		Bezeichnung_Planung_Gruppe_TypeClassImpl bezeichnung_Planung_Gruppe_TypeClass = new Bezeichnung_Planung_Gruppe_TypeClassImpl();
		return bezeichnung_Planung_Gruppe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Planung_Projekt_TypeClass createBezeichnung_Planung_Projekt_TypeClass() {
		Bezeichnung_Planung_Projekt_TypeClassImpl bezeichnung_Planung_Projekt_TypeClass = new Bezeichnung_Planung_Projekt_TypeClassImpl();
		return bezeichnung_Planung_Projekt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Unteranlage_TypeClass createBezeichnung_Unteranlage_TypeClass() {
		Bezeichnung_Unteranlage_TypeClassImpl bezeichnung_Unteranlage_TypeClass = new Bezeichnung_Unteranlage_TypeClassImpl();
		return bezeichnung_Unteranlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Container_AttributeGroup createContainer_AttributeGroup() {
		Container_AttributeGroupImpl container_AttributeGroup = new Container_AttributeGroupImpl();
		return container_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Einzel_TypeClass createDatum_Abschluss_Einzel_TypeClass() {
		Datum_Abschluss_Einzel_TypeClassImpl datum_Abschluss_Einzel_TypeClass = new Datum_Abschluss_Einzel_TypeClassImpl();
		return datum_Abschluss_Einzel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Gruppe_TypeClass createDatum_Abschluss_Gruppe_TypeClass() {
		Datum_Abschluss_Gruppe_TypeClassImpl datum_Abschluss_Gruppe_TypeClass = new Datum_Abschluss_Gruppe_TypeClassImpl();
		return datum_Abschluss_Gruppe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Abschluss_Projekt_TypeClass createDatum_Abschluss_Projekt_TypeClass() {
		Datum_Abschluss_Projekt_TypeClassImpl datum_Abschluss_Projekt_TypeClass = new Datum_Abschluss_Projekt_TypeClassImpl();
		return datum_Abschluss_Projekt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Regelwerksstand_TypeClass createDatum_Regelwerksstand_TypeClass() {
		Datum_Regelwerksstand_TypeClassImpl datum_Regelwerksstand_TypeClass = new Datum_Regelwerksstand_TypeClassImpl();
		return datum_Regelwerksstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_TypeClass createDatum_TypeClass() {
		Datum_TypeClassImpl datum_TypeClass = new Datum_TypeClassImpl();
		return datum_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Uebernahme_TypeClass createDatum_Uebernahme_TypeClass() {
		Datum_Uebernahme_TypeClassImpl datum_Uebernahme_TypeClass = new Datum_Uebernahme_TypeClassImpl();
		return datum_Uebernahme_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E_Mail_Adresse_TypeClass createE_Mail_Adresse_TypeClass() {
		E_Mail_Adresse_TypeClassImpl e_Mail_Adresse_TypeClass = new E_Mail_Adresse_TypeClassImpl();
		return e_Mail_Adresse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Erzeugung_Zeitstempel_TypeClass createErzeugung_Zeitstempel_TypeClass() {
		Erzeugung_Zeitstempel_TypeClassImpl erzeugung_Zeitstempel_TypeClass = new Erzeugung_Zeitstempel_TypeClassImpl();
		return erzeugung_Zeitstempel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fachdaten_AttributeGroup createFachdaten_AttributeGroup() {
		Fachdaten_AttributeGroupImpl fachdaten_AttributeGroup = new Fachdaten_AttributeGroupImpl();
		return fachdaten_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuehrende_Oertlichkeit_TypeClass createFuehrende_Oertlichkeit_TypeClass() {
		Fuehrende_Oertlichkeit_TypeClassImpl fuehrende_Oertlichkeit_TypeClass = new Fuehrende_Oertlichkeit_TypeClassImpl();
		return fuehrende_Oertlichkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ident_Rolle_TypeClass createIdent_Rolle_TypeClass() {
		Ident_Rolle_TypeClassImpl ident_Rolle_TypeClass = new Ident_Rolle_TypeClassImpl();
		return ident_Rolle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index_Ausgabe_TypeClass createIndex_Ausgabe_TypeClass() {
		Index_Ausgabe_TypeClassImpl index_Ausgabe_TypeClass = new Index_Ausgabe_TypeClassImpl();
		return index_Ausgabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Informativ_TypeClass createInformativ_TypeClass() {
		Informativ_TypeClassImpl informativ_TypeClass = new Informativ_TypeClassImpl();
		return informativ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koordinatensystem_BB_TypeClass createKoordinatensystem_BB_TypeClass() {
		Koordinatensystem_BB_TypeClassImpl koordinatensystem_BB_TypeClass = new Koordinatensystem_BB_TypeClassImpl();
		return koordinatensystem_BB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koordinatensystem_PB_TypeClass createKoordinatensystem_PB_TypeClass() {
		Koordinatensystem_PB_TypeClassImpl koordinatensystem_PB_TypeClass = new Koordinatensystem_PB_TypeClassImpl();
		return koordinatensystem_PB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laufende_Nummer_Ausgabe_TypeClass createLaufende_Nummer_Ausgabe_TypeClass() {
		Laufende_Nummer_Ausgabe_TypeClassImpl laufende_Nummer_Ausgabe_TypeClass = new Laufende_Nummer_Ausgabe_TypeClassImpl();
		return laufende_Nummer_Ausgabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Objekte_Planungsbereich_AttributeGroup createLST_Objekte_Planungsbereich_AttributeGroup() {
		LST_Objekte_Planungsbereich_AttributeGroupImpl lsT_Objekte_Planungsbereich_AttributeGroup = new LST_Objekte_Planungsbereich_AttributeGroupImpl();
		return lsT_Objekte_Planungsbereich_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Planung_AttributeGroup createLST_Planung_AttributeGroup() {
		LST_Planung_AttributeGroupImpl lsT_Planung_AttributeGroup = new LST_Planung_AttributeGroupImpl();
		return lsT_Planung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Zustand createLST_Zustand() {
		LST_ZustandImpl lsT_Zustand = new LST_ZustandImpl();
		return lsT_Zustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_10_TypeClass createName_Akteur_10_TypeClass() {
		Name_Akteur_10_TypeClassImpl name_Akteur_10_TypeClass = new Name_Akteur_10_TypeClassImpl();
		return name_Akteur_10_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_5_TypeClass createName_Akteur_5_TypeClass() {
		Name_Akteur_5_TypeClassImpl name_Akteur_5_TypeClass = new Name_Akteur_5_TypeClassImpl();
		return name_Akteur_5_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_TypeClass createName_Akteur_TypeClass() {
		Name_Akteur_TypeClassImpl name_Akteur_TypeClass = new Name_Akteur_TypeClassImpl();
		return name_Akteur_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Organisation_TypeClass createName_Organisation_TypeClass() {
		Name_Organisation_TypeClassImpl name_Organisation_TypeClass = new Name_Organisation_TypeClassImpl();
		return name_Organisation_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektmanagement_AttributeGroup createObjektmanagement_AttributeGroup() {
		Objektmanagement_AttributeGroupImpl objektmanagement_AttributeGroup = new Objektmanagement_AttributeGroupImpl();
		return objektmanagement_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisationseinheit_TypeClass createOrganisationseinheit_TypeClass() {
		Organisationseinheit_TypeClassImpl organisationseinheit_TypeClass = new Organisationseinheit_TypeClassImpl();
		return organisationseinheit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Schnittstelle createPlanPro_Schnittstelle() {
		PlanPro_SchnittstelleImpl planPro_Schnittstelle = new PlanPro_SchnittstelleImpl();
		return planPro_Schnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Schnittstelle_Allg_AttributeGroup createPlanPro_Schnittstelle_Allg_AttributeGroup() {
		PlanPro_Schnittstelle_Allg_AttributeGroupImpl planPro_Schnittstelle_Allg_AttributeGroup = new PlanPro_Schnittstelle_Allg_AttributeGroupImpl();
		return planPro_Schnittstelle_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_XSD_Version_TypeClass createPlanPro_XSD_Version_TypeClass() {
		PlanPro_XSD_Version_TypeClassImpl planPro_XSD_Version_TypeClass = new PlanPro_XSD_Version_TypeClassImpl();
		return planPro_XSD_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Allg_AttributeGroup createPlanung_E_Allg_AttributeGroup() {
		Planung_E_Allg_AttributeGroupImpl planung_E_Allg_AttributeGroup = new Planung_E_Allg_AttributeGroupImpl();
		return planung_E_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Art_TypeClass createPlanung_E_Art_TypeClass() {
		Planung_E_Art_TypeClassImpl planung_E_Art_TypeClass = new Planung_E_Art_TypeClassImpl();
		return planung_E_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Ausgabe_Besonders_AttributeGroup createPlanung_E_Ausgabe_Besonders_AttributeGroup() {
		Planung_E_Ausgabe_Besonders_AttributeGroupImpl planung_E_Ausgabe_Besonders_AttributeGroup = new Planung_E_Ausgabe_Besonders_AttributeGroupImpl();
		return planung_E_Ausgabe_Besonders_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Handlung_AttributeGroup createPlanung_E_Handlung_AttributeGroup() {
		Planung_E_Handlung_AttributeGroupImpl planung_E_Handlung_AttributeGroup = new Planung_E_Handlung_AttributeGroupImpl();
		return planung_E_Handlung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Einzel createPlanung_Einzel() {
		Planung_EinzelImpl planung_Einzel = new Planung_EinzelImpl();
		return planung_Einzel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Allg_AttributeGroup createPlanung_G_Allg_AttributeGroup() {
		Planung_G_Allg_AttributeGroupImpl planung_G_Allg_AttributeGroup = new Planung_G_Allg_AttributeGroupImpl();
		return planung_G_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Art_Besonders_TypeClass createPlanung_G_Art_Besonders_TypeClass() {
		Planung_G_Art_Besonders_TypeClassImpl planung_G_Art_Besonders_TypeClass = new Planung_G_Art_Besonders_TypeClassImpl();
		return planung_G_Art_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Fuehrende_Strecke_AttributeGroup createPlanung_G_Fuehrende_Strecke_AttributeGroup() {
		Planung_G_Fuehrende_Strecke_AttributeGroupImpl planung_G_Fuehrende_Strecke_AttributeGroup = new Planung_G_Fuehrende_Strecke_AttributeGroupImpl();
		return planung_G_Fuehrende_Strecke_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Schriftfeld_AttributeGroup createPlanung_G_Schriftfeld_AttributeGroup() {
		Planung_G_Schriftfeld_AttributeGroupImpl planung_G_Schriftfeld_AttributeGroup = new Planung_G_Schriftfeld_AttributeGroupImpl();
		return planung_G_Schriftfeld_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Gruppe createPlanung_Gruppe() {
		Planung_GruppeImpl planung_Gruppe = new Planung_GruppeImpl();
		return planung_Gruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_P_Allg_AttributeGroup createPlanung_P_Allg_AttributeGroup() {
		Planung_P_Allg_AttributeGroupImpl planung_P_Allg_AttributeGroup = new Planung_P_Allg_AttributeGroupImpl();
		return planung_P_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Phase_TypeClass createPlanung_Phase_TypeClass() {
		Planung_Phase_TypeClassImpl planung_Phase_TypeClass = new Planung_Phase_TypeClassImpl();
		return planung_Phase_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Projekt createPlanung_Projekt() {
		Planung_ProjektImpl planung_Projekt = new Planung_ProjektImpl();
		return planung_Projekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygone_Betrachtungsbereich_AttributeGroup createPolygone_Betrachtungsbereich_AttributeGroup() {
		Polygone_Betrachtungsbereich_AttributeGroupImpl polygone_Betrachtungsbereich_AttributeGroup = new Polygone_Betrachtungsbereich_AttributeGroupImpl();
		return polygone_Betrachtungsbereich_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygone_Planungsbereich_AttributeGroup createPolygone_Planungsbereich_AttributeGroup() {
		Polygone_Planungsbereich_AttributeGroupImpl polygone_Planungsbereich_AttributeGroup = new Polygone_Planungsbereich_AttributeGroupImpl();
		return polygone_Planungsbereich_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Betrachtungsbereich_TypeClass createPolygonzug_Betrachtungsbereich_TypeClass() {
		Polygonzug_Betrachtungsbereich_TypeClassImpl polygonzug_Betrachtungsbereich_TypeClass = new Polygonzug_Betrachtungsbereich_TypeClassImpl();
		return polygonzug_Betrachtungsbereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygonzug_Planungsbereich_TypeClass createPolygonzug_Planungsbereich_TypeClass() {
		Polygonzug_Planungsbereich_TypeClassImpl polygonzug_Planungsbereich_TypeClass = new Polygonzug_Planungsbereich_TypeClassImpl();
		return polygonzug_Planungsbereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Projekt_Nummer_TypeClass createProjekt_Nummer_TypeClass() {
		Projekt_Nummer_TypeClassImpl projekt_Nummer_TypeClass = new Projekt_Nummer_TypeClassImpl();
		return projekt_Nummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Planung_Basis_TypeClass createReferenz_Planung_Basis_TypeClass() {
		Referenz_Planung_Basis_TypeClassImpl referenz_Planung_Basis_TypeClass = new Referenz_Planung_Basis_TypeClassImpl();
		return referenz_Planung_Basis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Vergleich_Besonders_TypeClass createReferenz_Vergleich_Besonders_TypeClass() {
		Referenz_Vergleich_Besonders_TypeClassImpl referenz_Vergleich_Besonders_TypeClass = new Referenz_Vergleich_Besonders_TypeClassImpl();
		return referenz_Vergleich_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Abschnitt_TypeClass createStrecke_Abschnitt_TypeClass() {
		Strecke_Abschnitt_TypeClassImpl strecke_Abschnitt_TypeClass = new Strecke_Abschnitt_TypeClassImpl();
		return strecke_Abschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Km_TypeClass createStrecke_Km_TypeClass() {
		Strecke_Km_TypeClassImpl strecke_Km_TypeClass = new Strecke_Km_TypeClassImpl();
		return strecke_Km_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Nummer_TypeClass createStrecke_Nummer_TypeClass() {
		Strecke_Nummer_TypeClassImpl strecke_Nummer_TypeClass = new Strecke_Nummer_TypeClassImpl();
		return strecke_Nummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telefonnummer_TypeClass createTelefonnummer_TypeClass() {
		Telefonnummer_TypeClassImpl telefonnummer_TypeClass = new Telefonnummer_TypeClassImpl();
		return telefonnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergewerk_Art_TypeClass createUntergewerk_Art_TypeClass() {
		Untergewerk_Art_TypeClassImpl untergewerk_Art_TypeClass = new Untergewerk_Art_TypeClassImpl();
		return untergewerk_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verantwortliche_Stelle_DB_TypeClass createVerantwortliche_Stelle_DB_TypeClass() {
		Verantwortliche_Stelle_DB_TypeClassImpl verantwortliche_Stelle_DB_TypeClass = new Verantwortliche_Stelle_DB_TypeClassImpl();
		return verantwortliche_Stelle_DB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vergleich_Ausgabestand_Basis_TypeClass createVergleich_Ausgabestand_Basis_TypeClass() {
		Vergleich_Ausgabestand_Basis_TypeClassImpl vergleich_Ausgabestand_Basis_TypeClass = new Vergleich_Ausgabestand_Basis_TypeClassImpl();
		return vergleich_Ausgabestand_Basis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vergleichstyp_Besonders_TypeClass createVergleichstyp_Besonders_TypeClass() {
		Vergleichstyp_Besonders_TypeClassImpl vergleichstyp_Besonders_TypeClass = new Vergleichstyp_Besonders_TypeClassImpl();
		return vergleichstyp_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Werkzeug_Name_TypeClass createWerkzeug_Name_TypeClass() {
		Werkzeug_Name_TypeClassImpl werkzeug_Name_TypeClass = new Werkzeug_Name_TypeClassImpl();
		return werkzeug_Name_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Werkzeug_Version_TypeClass createWerkzeug_Version_TypeClass() {
		Werkzeug_Version_TypeClassImpl werkzeug_Version_TypeClass = new Werkzeug_Version_TypeClassImpl();
		return werkzeug_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKoordinatensystem createENUMKoordinatensystemFromString(EDataType eDataType, String initialValue) {
		ENUMKoordinatensystem result = ENUMKoordinatensystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKoordinatensystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungEArt createENUMPlanungEArtFromString(EDataType eDataType, String initialValue) {
		ENUMPlanungEArt result = ENUMPlanungEArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungEArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungGArtBesonders createENUMPlanungGArtBesondersFromString(EDataType eDataType, String initialValue) {
		ENUMPlanungGArtBesonders result = ENUMPlanungGArtBesonders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungGArtBesondersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungPhase createENUMPlanungPhaseFromString(EDataType eDataType, String initialValue) {
		ENUMPlanungPhase result = ENUMPlanungPhase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungPhaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUntergewerkArt createENUMUntergewerkArtFromString(EDataType eDataType, String initialValue) {
		ENUMUntergewerkArt result = ENUMUntergewerkArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUntergewerkArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVergleichstypBesonders createENUMVergleichstypBesondersFromString(EDataType eDataType, String initialValue) {
		ENUMVergleichstypBesonders result = ENUMVergleichstypBesonders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVergleichstypBesondersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAdresse_PLZ_Ort_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdresse_PLZ_Ort_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAdresse_Strasse_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdresse_Strasse_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBauabschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBauabschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBauphase_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBauphase_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBauzustand_Kurzbezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBauzustand_Kurzbezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBauzustand_Langbezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBauzustand_Langbezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBemerkung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBemerkung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Anlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Anlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Planung_Gruppe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Planung_Gruppe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Planung_Projekt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Planung_Projekt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Unteranlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Unteranlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createE_Mail_Adresse_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertE_Mail_Adresse_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKoordinatensystem createENUMKoordinatensystemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMKoordinatensystemFromString(PlanProPackage.eINSTANCE.getENUMKoordinatensystem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKoordinatensystemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMKoordinatensystemToString(PlanProPackage.eINSTANCE.getENUMKoordinatensystem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungEArt createENUMPlanungEArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPlanungEArtFromString(PlanProPackage.eINSTANCE.getENUMPlanungEArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungEArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPlanungEArtToString(PlanProPackage.eINSTANCE.getENUMPlanungEArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungGArtBesonders createENUMPlanungGArtBesondersObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPlanungGArtBesondersFromString(PlanProPackage.eINSTANCE.getENUMPlanungGArtBesonders(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungGArtBesondersObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPlanungGArtBesondersToString(PlanProPackage.eINSTANCE.getENUMPlanungGArtBesonders(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPlanungPhase createENUMPlanungPhaseObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPlanungPhaseFromString(PlanProPackage.eINSTANCE.getENUMPlanungPhase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPlanungPhaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPlanungPhaseToString(PlanProPackage.eINSTANCE.getENUMPlanungPhase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUntergewerkArt createENUMUntergewerkArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUntergewerkArtFromString(PlanProPackage.eINSTANCE.getENUMUntergewerkArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUntergewerkArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUntergewerkArtToString(PlanProPackage.eINSTANCE.getENUMUntergewerkArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVergleichstypBesonders createENUMVergleichstypBesondersObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMVergleichstypBesondersFromString(PlanProPackage.eINSTANCE.getENUMVergleichstypBesonders(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVergleichstypBesondersObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMVergleichstypBesondersToString(PlanProPackage.eINSTANCE.getENUMVergleichstypBesonders(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFuehrende_Oertlichkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFuehrende_Oertlichkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdent_Rolle_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdent_Rolle_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIndex_Ausgabe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndex_Ausgabe_TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLaufende_Nummer_Ausgabe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaufende_Nummer_Ausgabe_TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createName_Akteur_10_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertName_Akteur_10_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createName_Akteur_5_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertName_Akteur_5_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createName_Akteur_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertName_Akteur_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createName_Organisation_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertName_Organisation_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOrganisationseinheit_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrganisationseinheit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlanPro_XSD_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanPro_XSD_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPolygonzug_Betrachtungsbereich_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonzug_Betrachtungsbereich_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPolygonzug_Planungsbereich_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonzug_Planungsbereich_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.FREI_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProjekt_Nummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjekt_Nummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReferenz_Planung_Basis_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenz_Planung_Basis_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReferenz_Vergleich_Besonders_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenz_Vergleich_Besonders_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStrecke_Abschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrecke_Abschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStrecke_Km_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrecke_Km_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStrecke_Nummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrecke_Nummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTelefonnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelefonnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerantwortliche_Stelle_DB_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerantwortliche_Stelle_DB_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVergleich_Ausgabestand_Basis_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVergleich_Ausgabestand_Basis_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWerkzeug_Name_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWerkzeug_Name_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWerkzeug_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWerkzeug_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanProPackage getPlanProPackage() {
		return (PlanProPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlanProPackage getPackage() {
		return PlanProPackage.eINSTANCE;
	}

} //PlanProFactoryImpl
