/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.PlanPro.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage
 * @generated
 */
public class PlanProSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlanProPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanProSwitch() {
		if (modelPackage == null) {
			modelPackage = PlanProPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlanProPackage.ADRESSE_PLZ_ORT_TYPE_CLASS: {
				Adresse_PLZ_Ort_TypeClass adresse_PLZ_Ort_TypeClass = (Adresse_PLZ_Ort_TypeClass)theEObject;
				T result = caseAdresse_PLZ_Ort_TypeClass(adresse_PLZ_Ort_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(adresse_PLZ_Ort_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.ADRESSE_STRASSE_NR_TYPE_CLASS: {
				Adresse_Strasse_Nr_TypeClass adresse_Strasse_Nr_TypeClass = (Adresse_Strasse_Nr_TypeClass)theEObject;
				T result = caseAdresse_Strasse_Nr_TypeClass(adresse_Strasse_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(adresse_Strasse_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.AKTEUR: {
				Akteur akteur = (Akteur)theEObject;
				T result = caseAkteur(akteur);
				if (result == null) result = caseUr_Objekt(akteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP: {
				Akteur_Allg_AttributeGroup akteur_Allg_AttributeGroup = (Akteur_Allg_AttributeGroup)theEObject;
				T result = caseAkteur_Allg_AttributeGroup(akteur_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.AKTEUR_ZUORDNUNG: {
				Akteur_Zuordnung akteur_Zuordnung = (Akteur_Zuordnung)theEObject;
				T result = caseAkteur_Zuordnung(akteur_Zuordnung);
				if (result == null) result = caseUr_Objekt(akteur_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.AUSGABE_FACHDATEN: {
				Ausgabe_Fachdaten ausgabe_Fachdaten = (Ausgabe_Fachdaten)theEObject;
				T result = caseAusgabe_Fachdaten(ausgabe_Fachdaten);
				if (result == null) result = caseUr_Objekt(ausgabe_Fachdaten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BAUABSCHNITT_TYPE_CLASS: {
				Bauabschnitt_TypeClass bauabschnitt_TypeClass = (Bauabschnitt_TypeClass)theEObject;
				T result = caseBauabschnitt_TypeClass(bauabschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bauabschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BAUPHASE_TYPE_CLASS: {
				Bauphase_TypeClass bauphase_TypeClass = (Bauphase_TypeClass)theEObject;
				T result = caseBauphase_TypeClass(bauphase_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bauphase_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BAUZUSTAND_KURZBEZEICHNUNG_TYPE_CLASS: {
				Bauzustand_Kurzbezeichnung_TypeClass bauzustand_Kurzbezeichnung_TypeClass = (Bauzustand_Kurzbezeichnung_TypeClass)theEObject;
				T result = caseBauzustand_Kurzbezeichnung_TypeClass(bauzustand_Kurzbezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bauzustand_Kurzbezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BAUZUSTAND_LANGBEZEICHNUNG_TYPE_CLASS: {
				Bauzustand_Langbezeichnung_TypeClass bauzustand_Langbezeichnung_TypeClass = (Bauzustand_Langbezeichnung_TypeClass)theEObject;
				T result = caseBauzustand_Langbezeichnung_TypeClass(bauzustand_Langbezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bauzustand_Langbezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BEMERKUNG_TYPE_CLASS: {
				Bemerkung_TypeClass bemerkung_TypeClass = (Bemerkung_TypeClass)theEObject;
				T result = caseBemerkung_TypeClass(bemerkung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bemerkung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BEZEICHNUNG_ANLAGE_TYPE_CLASS: {
				Bezeichnung_Anlage_TypeClass bezeichnung_Anlage_TypeClass = (Bezeichnung_Anlage_TypeClass)theEObject;
				T result = caseBezeichnung_Anlage_TypeClass(bezeichnung_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BEZEICHNUNG_PLANUNG_GRUPPE_TYPE_CLASS: {
				Bezeichnung_Planung_Gruppe_TypeClass bezeichnung_Planung_Gruppe_TypeClass = (Bezeichnung_Planung_Gruppe_TypeClass)theEObject;
				T result = caseBezeichnung_Planung_Gruppe_TypeClass(bezeichnung_Planung_Gruppe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Planung_Gruppe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BEZEICHNUNG_PLANUNG_PROJEKT_TYPE_CLASS: {
				Bezeichnung_Planung_Projekt_TypeClass bezeichnung_Planung_Projekt_TypeClass = (Bezeichnung_Planung_Projekt_TypeClass)theEObject;
				T result = caseBezeichnung_Planung_Projekt_TypeClass(bezeichnung_Planung_Projekt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Planung_Projekt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.BEZEICHNUNG_UNTERANLAGE_TYPE_CLASS: {
				Bezeichnung_Unteranlage_TypeClass bezeichnung_Unteranlage_TypeClass = (Bezeichnung_Unteranlage_TypeClass)theEObject;
				T result = caseBezeichnung_Unteranlage_TypeClass(bezeichnung_Unteranlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Unteranlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP: {
				Container_AttributeGroup container_AttributeGroup = (Container_AttributeGroup)theEObject;
				T result = caseContainer_AttributeGroup(container_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_ABSCHLUSS_EINZEL_TYPE_CLASS: {
				Datum_Abschluss_Einzel_TypeClass datum_Abschluss_Einzel_TypeClass = (Datum_Abschluss_Einzel_TypeClass)theEObject;
				T result = caseDatum_Abschluss_Einzel_TypeClass(datum_Abschluss_Einzel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Abschluss_Einzel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_ABSCHLUSS_GRUPPE_TYPE_CLASS: {
				Datum_Abschluss_Gruppe_TypeClass datum_Abschluss_Gruppe_TypeClass = (Datum_Abschluss_Gruppe_TypeClass)theEObject;
				T result = caseDatum_Abschluss_Gruppe_TypeClass(datum_Abschluss_Gruppe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Abschluss_Gruppe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_ABSCHLUSS_PROJEKT_TYPE_CLASS: {
				Datum_Abschluss_Projekt_TypeClass datum_Abschluss_Projekt_TypeClass = (Datum_Abschluss_Projekt_TypeClass)theEObject;
				T result = caseDatum_Abschluss_Projekt_TypeClass(datum_Abschluss_Projekt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Abschluss_Projekt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_REGELWERKSSTAND_TYPE_CLASS: {
				Datum_Regelwerksstand_TypeClass datum_Regelwerksstand_TypeClass = (Datum_Regelwerksstand_TypeClass)theEObject;
				T result = caseDatum_Regelwerksstand_TypeClass(datum_Regelwerksstand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Regelwerksstand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_TYPE_CLASS: {
				Datum_TypeClass datum_TypeClass = (Datum_TypeClass)theEObject;
				T result = caseDatum_TypeClass(datum_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DATUM_UEBERNAHME_TYPE_CLASS: {
				Datum_Uebernahme_TypeClass datum_Uebernahme_TypeClass = (Datum_Uebernahme_TypeClass)theEObject;
				T result = caseDatum_Uebernahme_TypeClass(datum_Uebernahme_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datum_Uebernahme_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.EMAIL_ADRESSE_TYPE_CLASS: {
				E_Mail_Adresse_TypeClass e_Mail_Adresse_TypeClass = (E_Mail_Adresse_TypeClass)theEObject;
				T result = caseE_Mail_Adresse_TypeClass(e_Mail_Adresse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(e_Mail_Adresse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.ERZEUGUNG_ZEITSTEMPEL_TYPE_CLASS: {
				Erzeugung_Zeitstempel_TypeClass erzeugung_Zeitstempel_TypeClass = (Erzeugung_Zeitstempel_TypeClass)theEObject;
				T result = caseErzeugung_Zeitstempel_TypeClass(erzeugung_Zeitstempel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(erzeugung_Zeitstempel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP: {
				Fachdaten_AttributeGroup fachdaten_AttributeGroup = (Fachdaten_AttributeGroup)theEObject;
				T result = caseFachdaten_AttributeGroup(fachdaten_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.FUEHRENDE_OERTLICHKEIT_TYPE_CLASS: {
				Fuehrende_Oertlichkeit_TypeClass fuehrende_Oertlichkeit_TypeClass = (Fuehrende_Oertlichkeit_TypeClass)theEObject;
				T result = caseFuehrende_Oertlichkeit_TypeClass(fuehrende_Oertlichkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fuehrende_Oertlichkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.IDENT_ROLLE_TYPE_CLASS: {
				Ident_Rolle_TypeClass ident_Rolle_TypeClass = (Ident_Rolle_TypeClass)theEObject;
				T result = caseIdent_Rolle_TypeClass(ident_Rolle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ident_Rolle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.INDEX_AUSGABE_TYPE_CLASS: {
				Index_Ausgabe_TypeClass index_Ausgabe_TypeClass = (Index_Ausgabe_TypeClass)theEObject;
				T result = caseIndex_Ausgabe_TypeClass(index_Ausgabe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(index_Ausgabe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.INFORMATIV_TYPE_CLASS: {
				Informativ_TypeClass informativ_TypeClass = (Informativ_TypeClass)theEObject;
				T result = caseInformativ_TypeClass(informativ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(informativ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.KOORDINATENSYSTEM_BB_TYPE_CLASS: {
				Koordinatensystem_BB_TypeClass koordinatensystem_BB_TypeClass = (Koordinatensystem_BB_TypeClass)theEObject;
				T result = caseKoordinatensystem_BB_TypeClass(koordinatensystem_BB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(koordinatensystem_BB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.KOORDINATENSYSTEM_PB_TYPE_CLASS: {
				Koordinatensystem_PB_TypeClass koordinatensystem_PB_TypeClass = (Koordinatensystem_PB_TypeClass)theEObject;
				T result = caseKoordinatensystem_PB_TypeClass(koordinatensystem_PB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(koordinatensystem_PB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.LAUFENDE_NUMMER_AUSGABE_TYPE_CLASS: {
				Laufende_Nummer_Ausgabe_TypeClass laufende_Nummer_Ausgabe_TypeClass = (Laufende_Nummer_Ausgabe_TypeClass)theEObject;
				T result = caseLaufende_Nummer_Ausgabe_TypeClass(laufende_Nummer_Ausgabe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(laufende_Nummer_Ausgabe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP: {
				LST_Objekte_Planungsbereich_AttributeGroup lsT_Objekte_Planungsbereich_AttributeGroup = (LST_Objekte_Planungsbereich_AttributeGroup)theEObject;
				T result = caseLST_Objekte_Planungsbereich_AttributeGroup(lsT_Objekte_Planungsbereich_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP: {
				LST_Planung_AttributeGroup lsT_Planung_AttributeGroup = (LST_Planung_AttributeGroup)theEObject;
				T result = caseLST_Planung_AttributeGroup(lsT_Planung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.LST_ZUSTAND: {
				LST_Zustand lsT_Zustand = (LST_Zustand)theEObject;
				T result = caseLST_Zustand(lsT_Zustand);
				if (result == null) result = caseUr_Objekt(lsT_Zustand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.NAME_AKTEUR_10_TYPE_CLASS: {
				Name_Akteur_10_TypeClass name_Akteur_10_TypeClass = (Name_Akteur_10_TypeClass)theEObject;
				T result = caseName_Akteur_10_TypeClass(name_Akteur_10_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(name_Akteur_10_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.NAME_AKTEUR_5TYPE_CLASS: {
				Name_Akteur_5_TypeClass name_Akteur_5_TypeClass = (Name_Akteur_5_TypeClass)theEObject;
				T result = caseName_Akteur_5_TypeClass(name_Akteur_5_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(name_Akteur_5_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.NAME_AKTEUR_TYPE_CLASS: {
				Name_Akteur_TypeClass name_Akteur_TypeClass = (Name_Akteur_TypeClass)theEObject;
				T result = caseName_Akteur_TypeClass(name_Akteur_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(name_Akteur_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.NAME_ORGANISATION_TYPE_CLASS: {
				Name_Organisation_TypeClass name_Organisation_TypeClass = (Name_Organisation_TypeClass)theEObject;
				T result = caseName_Organisation_TypeClass(name_Organisation_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(name_Organisation_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP: {
				Objektmanagement_AttributeGroup objektmanagement_AttributeGroup = (Objektmanagement_AttributeGroup)theEObject;
				T result = caseObjektmanagement_AttributeGroup(objektmanagement_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.ORGANISATION: {
				Organisation organisation = (Organisation)theEObject;
				T result = caseOrganisation(organisation);
				if (result == null) result = caseUr_Objekt(organisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.ORGANISATIONSEINHEIT_TYPE_CLASS: {
				Organisationseinheit_TypeClass organisationseinheit_TypeClass = (Organisationseinheit_TypeClass)theEObject;
				T result = caseOrganisationseinheit_TypeClass(organisationseinheit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(organisationseinheit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE: {
				PlanPro_Schnittstelle planPro_Schnittstelle = (PlanPro_Schnittstelle)theEObject;
				T result = casePlanPro_Schnittstelle(planPro_Schnittstelle);
				if (result == null) result = caseUr_Objekt(planPro_Schnittstelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP: {
				PlanPro_Schnittstelle_Allg_AttributeGroup planPro_Schnittstelle_Allg_AttributeGroup = (PlanPro_Schnittstelle_Allg_AttributeGroup)theEObject;
				T result = casePlanPro_Schnittstelle_Allg_AttributeGroup(planPro_Schnittstelle_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLAN_PRO_XSD_VERSION_TYPE_CLASS: {
				PlanPro_XSD_Version_TypeClass planPro_XSD_Version_TypeClass = (PlanPro_XSD_Version_TypeClass)theEObject;
				T result = casePlanPro_XSD_Version_TypeClass(planPro_XSD_Version_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(planPro_XSD_Version_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_EALLG_ATTRIBUTE_GROUP: {
				Planung_E_Allg_AttributeGroup planung_E_Allg_AttributeGroup = (Planung_E_Allg_AttributeGroup)theEObject;
				T result = casePlanung_E_Allg_AttributeGroup(planung_E_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_EART_TYPE_CLASS: {
				Planung_E_Art_TypeClass planung_E_Art_TypeClass = (Planung_E_Art_TypeClass)theEObject;
				T result = casePlanung_E_Art_TypeClass(planung_E_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(planung_E_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_EAUSGABE_BESONDERS_ATTRIBUTE_GROUP: {
				Planung_E_Ausgabe_Besonders_AttributeGroup planung_E_Ausgabe_Besonders_AttributeGroup = (Planung_E_Ausgabe_Besonders_AttributeGroup)theEObject;
				T result = casePlanung_E_Ausgabe_Besonders_AttributeGroup(planung_E_Ausgabe_Besonders_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_EHANDLUNG_ATTRIBUTE_GROUP: {
				Planung_E_Handlung_AttributeGroup planung_E_Handlung_AttributeGroup = (Planung_E_Handlung_AttributeGroup)theEObject;
				T result = casePlanung_E_Handlung_AttributeGroup(planung_E_Handlung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_EINZEL: {
				Planung_Einzel planung_Einzel = (Planung_Einzel)theEObject;
				T result = casePlanung_Einzel(planung_Einzel);
				if (result == null) result = caseUr_Objekt(planung_Einzel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_GALLG_ATTRIBUTE_GROUP: {
				Planung_G_Allg_AttributeGroup planung_G_Allg_AttributeGroup = (Planung_G_Allg_AttributeGroup)theEObject;
				T result = casePlanung_G_Allg_AttributeGroup(planung_G_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_GART_BESONDERS_TYPE_CLASS: {
				Planung_G_Art_Besonders_TypeClass planung_G_Art_Besonders_TypeClass = (Planung_G_Art_Besonders_TypeClass)theEObject;
				T result = casePlanung_G_Art_Besonders_TypeClass(planung_G_Art_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(planung_G_Art_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_GFUEHRENDE_STRECKE_ATTRIBUTE_GROUP: {
				Planung_G_Fuehrende_Strecke_AttributeGroup planung_G_Fuehrende_Strecke_AttributeGroup = (Planung_G_Fuehrende_Strecke_AttributeGroup)theEObject;
				T result = casePlanung_G_Fuehrende_Strecke_AttributeGroup(planung_G_Fuehrende_Strecke_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_GSCHRIFTFELD_ATTRIBUTE_GROUP: {
				Planung_G_Schriftfeld_AttributeGroup planung_G_Schriftfeld_AttributeGroup = (Planung_G_Schriftfeld_AttributeGroup)theEObject;
				T result = casePlanung_G_Schriftfeld_AttributeGroup(planung_G_Schriftfeld_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_GRUPPE: {
				Planung_Gruppe planung_Gruppe = (Planung_Gruppe)theEObject;
				T result = casePlanung_Gruppe(planung_Gruppe);
				if (result == null) result = caseUr_Objekt(planung_Gruppe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_PALLG_ATTRIBUTE_GROUP: {
				Planung_P_Allg_AttributeGroup planung_P_Allg_AttributeGroup = (Planung_P_Allg_AttributeGroup)theEObject;
				T result = casePlanung_P_Allg_AttributeGroup(planung_P_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_PHASE_TYPE_CLASS: {
				Planung_Phase_TypeClass planung_Phase_TypeClass = (Planung_Phase_TypeClass)theEObject;
				T result = casePlanung_Phase_TypeClass(planung_Phase_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(planung_Phase_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PLANUNG_PROJEKT: {
				Planung_Projekt planung_Projekt = (Planung_Projekt)theEObject;
				T result = casePlanung_Projekt(planung_Projekt);
				if (result == null) result = caseUr_Objekt(planung_Projekt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP: {
				Polygone_Betrachtungsbereich_AttributeGroup polygone_Betrachtungsbereich_AttributeGroup = (Polygone_Betrachtungsbereich_AttributeGroup)theEObject;
				T result = casePolygone_Betrachtungsbereich_AttributeGroup(polygone_Betrachtungsbereich_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP: {
				Polygone_Planungsbereich_AttributeGroup polygone_Planungsbereich_AttributeGroup = (Polygone_Planungsbereich_AttributeGroup)theEObject;
				T result = casePolygone_Planungsbereich_AttributeGroup(polygone_Planungsbereich_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS: {
				Polygonzug_Betrachtungsbereich_TypeClass polygonzug_Betrachtungsbereich_TypeClass = (Polygonzug_Betrachtungsbereich_TypeClass)theEObject;
				T result = casePolygonzug_Betrachtungsbereich_TypeClass(polygonzug_Betrachtungsbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(polygonzug_Betrachtungsbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.POLYGONZUG_PLANUNGSBEREICH_TYPE_CLASS: {
				Polygonzug_Planungsbereich_TypeClass polygonzug_Planungsbereich_TypeClass = (Polygonzug_Planungsbereich_TypeClass)theEObject;
				T result = casePolygonzug_Planungsbereich_TypeClass(polygonzug_Planungsbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(polygonzug_Planungsbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.PROJEKT_NUMMER_TYPE_CLASS: {
				Projekt_Nummer_TypeClass projekt_Nummer_TypeClass = (Projekt_Nummer_TypeClass)theEObject;
				T result = caseProjekt_Nummer_TypeClass(projekt_Nummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(projekt_Nummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.REFERENZ_PLANUNG_BASIS_TYPE_CLASS: {
				Referenz_Planung_Basis_TypeClass referenz_Planung_Basis_TypeClass = (Referenz_Planung_Basis_TypeClass)theEObject;
				T result = caseReferenz_Planung_Basis_TypeClass(referenz_Planung_Basis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(referenz_Planung_Basis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.REFERENZ_VERGLEICH_BESONDERS_TYPE_CLASS: {
				Referenz_Vergleich_Besonders_TypeClass referenz_Vergleich_Besonders_TypeClass = (Referenz_Vergleich_Besonders_TypeClass)theEObject;
				T result = caseReferenz_Vergleich_Besonders_TypeClass(referenz_Vergleich_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(referenz_Vergleich_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.STRECKE_ABSCHNITT_TYPE_CLASS: {
				Strecke_Abschnitt_TypeClass strecke_Abschnitt_TypeClass = (Strecke_Abschnitt_TypeClass)theEObject;
				T result = caseStrecke_Abschnitt_TypeClass(strecke_Abschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Abschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.STRECKE_KM_TYPE_CLASS: {
				Strecke_Km_TypeClass strecke_Km_TypeClass = (Strecke_Km_TypeClass)theEObject;
				T result = caseStrecke_Km_TypeClass(strecke_Km_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Km_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.STRECKE_NUMMER_TYPE_CLASS: {
				Strecke_Nummer_TypeClass strecke_Nummer_TypeClass = (Strecke_Nummer_TypeClass)theEObject;
				T result = caseStrecke_Nummer_TypeClass(strecke_Nummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Nummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.TELEFONNUMMER_TYPE_CLASS: {
				Telefonnummer_TypeClass telefonnummer_TypeClass = (Telefonnummer_TypeClass)theEObject;
				T result = caseTelefonnummer_TypeClass(telefonnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telefonnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS: {
				Untergewerk_Art_TypeClass untergewerk_Art_TypeClass = (Untergewerk_Art_TypeClass)theEObject;
				T result = caseUntergewerk_Art_TypeClass(untergewerk_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(untergewerk_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.VERANTWORTLICHE_STELLE_DB_TYPE_CLASS: {
				Verantwortliche_Stelle_DB_TypeClass verantwortliche_Stelle_DB_TypeClass = (Verantwortliche_Stelle_DB_TypeClass)theEObject;
				T result = caseVerantwortliche_Stelle_DB_TypeClass(verantwortliche_Stelle_DB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verantwortliche_Stelle_DB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.VERGLEICH_AUSGABESTAND_BASIS_TYPE_CLASS: {
				Vergleich_Ausgabestand_Basis_TypeClass vergleich_Ausgabestand_Basis_TypeClass = (Vergleich_Ausgabestand_Basis_TypeClass)theEObject;
				T result = caseVergleich_Ausgabestand_Basis_TypeClass(vergleich_Ausgabestand_Basis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vergleich_Ausgabestand_Basis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.VERGLEICHSTYP_BESONDERS_TYPE_CLASS: {
				Vergleichstyp_Besonders_TypeClass vergleichstyp_Besonders_TypeClass = (Vergleichstyp_Besonders_TypeClass)theEObject;
				T result = caseVergleichstyp_Besonders_TypeClass(vergleichstyp_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vergleichstyp_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.WERKZEUG_NAME_TYPE_CLASS: {
				Werkzeug_Name_TypeClass werkzeug_Name_TypeClass = (Werkzeug_Name_TypeClass)theEObject;
				T result = caseWerkzeug_Name_TypeClass(werkzeug_Name_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(werkzeug_Name_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanProPackage.WERKZEUG_VERSION_TYPE_CLASS: {
				Werkzeug_Version_TypeClass werkzeug_Version_TypeClass = (Werkzeug_Version_TypeClass)theEObject;
				T result = caseWerkzeug_Version_TypeClass(werkzeug_Version_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(werkzeug_Version_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adresse PLZ Ort Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adresse PLZ Ort Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdresse_PLZ_Ort_TypeClass(Adresse_PLZ_Ort_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adresse Strasse Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adresse Strasse Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdresse_Strasse_Nr_TypeClass(Adresse_Strasse_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkteur(Akteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akteur Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akteur Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkteur_Allg_AttributeGroup(Akteur_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akteur Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akteur Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkteur_Zuordnung(Akteur_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausgabe Fachdaten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausgabe Fachdaten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusgabe_Fachdaten(Ausgabe_Fachdaten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bauabschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bauabschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBauabschnitt_TypeClass(Bauabschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bauphase Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bauphase Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBauphase_TypeClass(Bauphase_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bauzustand Kurzbezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bauzustand Kurzbezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBauzustand_Kurzbezeichnung_TypeClass(Bauzustand_Kurzbezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bauzustand Langbezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bauzustand Langbezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBauzustand_Langbezeichnung_TypeClass(Bauzustand_Langbezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bemerkung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bemerkung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBemerkung_TypeClass(Bemerkung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Anlage_TypeClass(Bezeichnung_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Planung Gruppe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Planung Gruppe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Planung_Gruppe_TypeClass(Bezeichnung_Planung_Gruppe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Planung Projekt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Planung Projekt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Planung_Projekt_TypeClass(Bezeichnung_Planung_Projekt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Unteranlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Unteranlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Unteranlage_TypeClass(Bezeichnung_Unteranlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer_AttributeGroup(Container_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Abschluss Einzel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Abschluss Einzel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Abschluss_Einzel_TypeClass(Datum_Abschluss_Einzel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Abschluss Gruppe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Abschluss Gruppe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Abschluss_Gruppe_TypeClass(Datum_Abschluss_Gruppe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Abschluss Projekt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Abschluss Projekt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Abschluss_Projekt_TypeClass(Datum_Abschluss_Projekt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Regelwerksstand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Regelwerksstand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Regelwerksstand_TypeClass(Datum_Regelwerksstand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_TypeClass(Datum_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Uebernahme Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Uebernahme Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatum_Uebernahme_TypeClass(Datum_Uebernahme_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMail Adresse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMail Adresse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE_Mail_Adresse_TypeClass(E_Mail_Adresse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erzeugung Zeitstempel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erzeugung Zeitstempel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErzeugung_Zeitstempel_TypeClass(Erzeugung_Zeitstempel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fachdaten Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fachdaten Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFachdaten_AttributeGroup(Fachdaten_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuehrende Oertlichkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuehrende Oertlichkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuehrende_Oertlichkeit_TypeClass(Fuehrende_Oertlichkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ident Rolle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ident Rolle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdent_Rolle_TypeClass(Ident_Rolle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Ausgabe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Ausgabe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex_Ausgabe_TypeClass(Index_Ausgabe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informativ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informativ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformativ_TypeClass(Informativ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Koordinatensystem BB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Koordinatensystem BB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKoordinatensystem_BB_TypeClass(Koordinatensystem_BB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Koordinatensystem PB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Koordinatensystem PB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKoordinatensystem_PB_TypeClass(Koordinatensystem_PB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laufende Nummer Ausgabe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laufende Nummer Ausgabe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaufende_Nummer_Ausgabe_TypeClass(Laufende_Nummer_Ausgabe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LST Objekte Planungsbereich Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LST Objekte Planungsbereich Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLST_Objekte_Planungsbereich_AttributeGroup(LST_Objekte_Planungsbereich_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LST Planung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LST Planung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLST_Planung_AttributeGroup(LST_Planung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LST Zustand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LST Zustand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLST_Zustand(LST_Zustand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Akteur 10 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Akteur 10 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName_Akteur_10_TypeClass(Name_Akteur_10_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Akteur 5Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Akteur 5Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName_Akteur_5_TypeClass(Name_Akteur_5_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Akteur Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Akteur Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName_Akteur_TypeClass(Name_Akteur_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Organisation Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Organisation Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName_Organisation_TypeClass(Name_Organisation_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objektmanagement Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objektmanagement Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjektmanagement_AttributeGroup(Objektmanagement_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisationseinheit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisationseinheit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationseinheit_TypeClass(Organisationseinheit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Pro Schnittstelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Pro Schnittstelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanPro_Schnittstelle(PlanPro_Schnittstelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Pro Schnittstelle Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Pro Schnittstelle Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanPro_Schnittstelle_Allg_AttributeGroup(PlanPro_Schnittstelle_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Pro XSD Version Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Pro XSD Version Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanPro_XSD_Version_TypeClass(PlanPro_XSD_Version_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung EAllg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung EAllg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_E_Allg_AttributeGroup(Planung_E_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung EArt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung EArt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_E_Art_TypeClass(Planung_E_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung EAusgabe Besonders Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung EAusgabe Besonders Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_E_Ausgabe_Besonders_AttributeGroup(Planung_E_Ausgabe_Besonders_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung EHandlung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung EHandlung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_E_Handlung_AttributeGroup(Planung_E_Handlung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung Einzel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung Einzel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_Einzel(Planung_Einzel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung GAllg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung GAllg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_G_Allg_AttributeGroup(Planung_G_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung GArt Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung GArt Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_G_Art_Besonders_TypeClass(Planung_G_Art_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung GFuehrende Strecke Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung GFuehrende Strecke Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_G_Fuehrende_Strecke_AttributeGroup(Planung_G_Fuehrende_Strecke_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung GSchriftfeld Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung GSchriftfeld Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_G_Schriftfeld_AttributeGroup(Planung_G_Schriftfeld_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung Gruppe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung Gruppe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_Gruppe(Planung_Gruppe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung PAllg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung PAllg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_P_Allg_AttributeGroup(Planung_P_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung Phase Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung Phase Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_Phase_TypeClass(Planung_Phase_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planung Projekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planung Projekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanung_Projekt(Planung_Projekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygone Betrachtungsbereich Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygone Betrachtungsbereich Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygone_Betrachtungsbereich_AttributeGroup(Polygone_Betrachtungsbereich_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygone Planungsbereich Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygone Planungsbereich Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygone_Planungsbereich_AttributeGroup(Polygone_Planungsbereich_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygonzug Betrachtungsbereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygonzug Betrachtungsbereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonzug_Betrachtungsbereich_TypeClass(Polygonzug_Betrachtungsbereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygonzug Planungsbereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygonzug Planungsbereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonzug_Planungsbereich_TypeClass(Polygonzug_Planungsbereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projekt Nummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projekt Nummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjekt_Nummer_TypeClass(Projekt_Nummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenz Planung Basis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenz Planung Basis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenz_Planung_Basis_TypeClass(Referenz_Planung_Basis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenz Vergleich Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenz Vergleich Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenz_Vergleich_Besonders_TypeClass(Referenz_Vergleich_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Abschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Abschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Abschnitt_TypeClass(Strecke_Abschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Km Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Km Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Km_TypeClass(Strecke_Km_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Nummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Nummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Nummer_TypeClass(Strecke_Nummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telefonnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telefonnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelefonnummer_TypeClass(Telefonnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Untergewerk Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Untergewerk Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntergewerk_Art_TypeClass(Untergewerk_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verantwortliche Stelle DB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verantwortliche Stelle DB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerantwortliche_Stelle_DB_TypeClass(Verantwortliche_Stelle_DB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vergleich Ausgabestand Basis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vergleich Ausgabestand Basis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVergleich_Ausgabestand_Basis_TypeClass(Vergleich_Ausgabestand_Basis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vergleichstyp Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vergleichstyp Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVergleichstyp_Besonders_TypeClass(Vergleichstyp_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Werkzeug Name Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Werkzeug Name Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWerkzeug_Name_TypeClass(Werkzeug_Name_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Werkzeug Version Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Werkzeug Version Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWerkzeug_Version_TypeClass(Werkzeug_Version_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUr_Objekt(Ur_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlanProSwitch
