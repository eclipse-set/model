/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.PlanPro.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage
 * @generated
 */
public class PlanProAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlanProPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanProAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlanProPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanProSwitch<Adapter> modelSwitch =
		new PlanProSwitch<Adapter>() {
			@Override
			public Adapter caseAdresse_PLZ_Ort_TypeClass(Adresse_PLZ_Ort_TypeClass object) {
				return createAdresse_PLZ_Ort_TypeClassAdapter();
			}
			@Override
			public Adapter caseAdresse_Strasse_Nr_TypeClass(Adresse_Strasse_Nr_TypeClass object) {
				return createAdresse_Strasse_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseAkteur(Akteur object) {
				return createAkteurAdapter();
			}
			@Override
			public Adapter caseAkteur_Allg_AttributeGroup(Akteur_Allg_AttributeGroup object) {
				return createAkteur_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseAkteur_Zuordnung(Akteur_Zuordnung object) {
				return createAkteur_ZuordnungAdapter();
			}
			@Override
			public Adapter caseAusgabe_Fachdaten(Ausgabe_Fachdaten object) {
				return createAusgabe_FachdatenAdapter();
			}
			@Override
			public Adapter caseBauabschnitt_TypeClass(Bauabschnitt_TypeClass object) {
				return createBauabschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseBauphase_TypeClass(Bauphase_TypeClass object) {
				return createBauphase_TypeClassAdapter();
			}
			@Override
			public Adapter caseBauzustand_Kurzbezeichnung_TypeClass(Bauzustand_Kurzbezeichnung_TypeClass object) {
				return createBauzustand_Kurzbezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBauzustand_Langbezeichnung_TypeClass(Bauzustand_Langbezeichnung_TypeClass object) {
				return createBauzustand_Langbezeichnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBemerkung_TypeClass(Bemerkung_TypeClass object) {
				return createBemerkung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Anlage_TypeClass(Bezeichnung_Anlage_TypeClass object) {
				return createBezeichnung_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Planung_Gruppe_TypeClass(Bezeichnung_Planung_Gruppe_TypeClass object) {
				return createBezeichnung_Planung_Gruppe_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Planung_Projekt_TypeClass(Bezeichnung_Planung_Projekt_TypeClass object) {
				return createBezeichnung_Planung_Projekt_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Unteranlage_TypeClass(Bezeichnung_Unteranlage_TypeClass object) {
				return createBezeichnung_Unteranlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseContainer_AttributeGroup(Container_AttributeGroup object) {
				return createContainer_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDatum_Abschluss_Einzel_TypeClass(Datum_Abschluss_Einzel_TypeClass object) {
				return createDatum_Abschluss_Einzel_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Abschluss_Gruppe_TypeClass(Datum_Abschluss_Gruppe_TypeClass object) {
				return createDatum_Abschluss_Gruppe_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Abschluss_Projekt_TypeClass(Datum_Abschluss_Projekt_TypeClass object) {
				return createDatum_Abschluss_Projekt_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Regelwerksstand_TypeClass(Datum_Regelwerksstand_TypeClass object) {
				return createDatum_Regelwerksstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_TypeClass(Datum_TypeClass object) {
				return createDatum_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatum_Uebernahme_TypeClass(Datum_Uebernahme_TypeClass object) {
				return createDatum_Uebernahme_TypeClassAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseE_Mail_Adresse_TypeClass(E_Mail_Adresse_TypeClass object) {
				return createE_Mail_Adresse_TypeClassAdapter();
			}
			@Override
			public Adapter caseErzeugung_Zeitstempel_TypeClass(Erzeugung_Zeitstempel_TypeClass object) {
				return createErzeugung_Zeitstempel_TypeClassAdapter();
			}
			@Override
			public Adapter caseFachdaten_AttributeGroup(Fachdaten_AttributeGroup object) {
				return createFachdaten_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFuehrende_Oertlichkeit_TypeClass(Fuehrende_Oertlichkeit_TypeClass object) {
				return createFuehrende_Oertlichkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseIdent_Rolle_TypeClass(Ident_Rolle_TypeClass object) {
				return createIdent_Rolle_TypeClassAdapter();
			}
			@Override
			public Adapter caseIndex_Ausgabe_TypeClass(Index_Ausgabe_TypeClass object) {
				return createIndex_Ausgabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseInformativ_TypeClass(Informativ_TypeClass object) {
				return createInformativ_TypeClassAdapter();
			}
			@Override
			public Adapter caseKoordinatensystem_BB_TypeClass(Koordinatensystem_BB_TypeClass object) {
				return createKoordinatensystem_BB_TypeClassAdapter();
			}
			@Override
			public Adapter caseKoordinatensystem_PB_TypeClass(Koordinatensystem_PB_TypeClass object) {
				return createKoordinatensystem_PB_TypeClassAdapter();
			}
			@Override
			public Adapter caseLaufende_Nummer_Ausgabe_TypeClass(Laufende_Nummer_Ausgabe_TypeClass object) {
				return createLaufende_Nummer_Ausgabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseLST_Objekte_Planungsbereich_AttributeGroup(LST_Objekte_Planungsbereich_AttributeGroup object) {
				return createLST_Objekte_Planungsbereich_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLST_Planung_AttributeGroup(LST_Planung_AttributeGroup object) {
				return createLST_Planung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLST_Zustand(LST_Zustand object) {
				return createLST_ZustandAdapter();
			}
			@Override
			public Adapter caseName_Akteur_10_TypeClass(Name_Akteur_10_TypeClass object) {
				return createName_Akteur_10_TypeClassAdapter();
			}
			@Override
			public Adapter caseName_Akteur_5_TypeClass(Name_Akteur_5_TypeClass object) {
				return createName_Akteur_5_TypeClassAdapter();
			}
			@Override
			public Adapter caseName_Akteur_TypeClass(Name_Akteur_TypeClass object) {
				return createName_Akteur_TypeClassAdapter();
			}
			@Override
			public Adapter caseName_Organisation_TypeClass(Name_Organisation_TypeClass object) {
				return createName_Organisation_TypeClassAdapter();
			}
			@Override
			public Adapter caseObjektmanagement_AttributeGroup(Objektmanagement_AttributeGroup object) {
				return createObjektmanagement_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseOrganisationseinheit_TypeClass(Organisationseinheit_TypeClass object) {
				return createOrganisationseinheit_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanPro_Schnittstelle(PlanPro_Schnittstelle object) {
				return createPlanPro_SchnittstelleAdapter();
			}
			@Override
			public Adapter casePlanPro_Schnittstelle_Allg_AttributeGroup(PlanPro_Schnittstelle_Allg_AttributeGroup object) {
				return createPlanPro_Schnittstelle_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanPro_XSD_Version_TypeClass(PlanPro_XSD_Version_TypeClass object) {
				return createPlanPro_XSD_Version_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanung_E_Allg_AttributeGroup(Planung_E_Allg_AttributeGroup object) {
				return createPlanung_E_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_E_Art_TypeClass(Planung_E_Art_TypeClass object) {
				return createPlanung_E_Art_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanung_E_Ausgabe_Besonders_AttributeGroup(Planung_E_Ausgabe_Besonders_AttributeGroup object) {
				return createPlanung_E_Ausgabe_Besonders_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_E_Handlung_AttributeGroup(Planung_E_Handlung_AttributeGroup object) {
				return createPlanung_E_Handlung_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_Einzel(Planung_Einzel object) {
				return createPlanung_EinzelAdapter();
			}
			@Override
			public Adapter casePlanung_G_Allg_AttributeGroup(Planung_G_Allg_AttributeGroup object) {
				return createPlanung_G_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_G_Art_Besonders_TypeClass(Planung_G_Art_Besonders_TypeClass object) {
				return createPlanung_G_Art_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanung_G_Fuehrende_Strecke_AttributeGroup(Planung_G_Fuehrende_Strecke_AttributeGroup object) {
				return createPlanung_G_Fuehrende_Strecke_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_G_Schriftfeld_AttributeGroup(Planung_G_Schriftfeld_AttributeGroup object) {
				return createPlanung_G_Schriftfeld_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_Gruppe(Planung_Gruppe object) {
				return createPlanung_GruppeAdapter();
			}
			@Override
			public Adapter casePlanung_P_Allg_AttributeGroup(Planung_P_Allg_AttributeGroup object) {
				return createPlanung_P_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePlanung_Phase_TypeClass(Planung_Phase_TypeClass object) {
				return createPlanung_Phase_TypeClassAdapter();
			}
			@Override
			public Adapter casePlanung_Projekt(Planung_Projekt object) {
				return createPlanung_ProjektAdapter();
			}
			@Override
			public Adapter casePolygone_Betrachtungsbereich_AttributeGroup(Polygone_Betrachtungsbereich_AttributeGroup object) {
				return createPolygone_Betrachtungsbereich_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePolygone_Planungsbereich_AttributeGroup(Polygone_Planungsbereich_AttributeGroup object) {
				return createPolygone_Planungsbereich_AttributeGroupAdapter();
			}
			@Override
			public Adapter casePolygonzug_Betrachtungsbereich_TypeClass(Polygonzug_Betrachtungsbereich_TypeClass object) {
				return createPolygonzug_Betrachtungsbereich_TypeClassAdapter();
			}
			@Override
			public Adapter casePolygonzug_Planungsbereich_TypeClass(Polygonzug_Planungsbereich_TypeClass object) {
				return createPolygonzug_Planungsbereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseProjekt_Nummer_TypeClass(Projekt_Nummer_TypeClass object) {
				return createProjekt_Nummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseReferenz_Planung_Basis_TypeClass(Referenz_Planung_Basis_TypeClass object) {
				return createReferenz_Planung_Basis_TypeClassAdapter();
			}
			@Override
			public Adapter caseReferenz_Vergleich_Besonders_TypeClass(Referenz_Vergleich_Besonders_TypeClass object) {
				return createReferenz_Vergleich_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Abschnitt_TypeClass(Strecke_Abschnitt_TypeClass object) {
				return createStrecke_Abschnitt_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Km_TypeClass(Strecke_Km_TypeClass object) {
				return createStrecke_Km_TypeClassAdapter();
			}
			@Override
			public Adapter caseStrecke_Nummer_TypeClass(Strecke_Nummer_TypeClass object) {
				return createStrecke_Nummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelefonnummer_TypeClass(Telefonnummer_TypeClass object) {
				return createTelefonnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseUntergewerk_Art_TypeClass(Untergewerk_Art_TypeClass object) {
				return createUntergewerk_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerantwortliche_Stelle_DB_TypeClass(Verantwortliche_Stelle_DB_TypeClass object) {
				return createVerantwortliche_Stelle_DB_TypeClassAdapter();
			}
			@Override
			public Adapter caseVergleich_Ausgabestand_Basis_TypeClass(Vergleich_Ausgabestand_Basis_TypeClass object) {
				return createVergleich_Ausgabestand_Basis_TypeClassAdapter();
			}
			@Override
			public Adapter caseVergleichstyp_Besonders_TypeClass(Vergleichstyp_Besonders_TypeClass object) {
				return createVergleichstyp_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseWerkzeug_Name_TypeClass(Werkzeug_Name_TypeClass object) {
				return createWerkzeug_Name_TypeClassAdapter();
			}
			@Override
			public Adapter caseWerkzeug_Version_TypeClass(Werkzeug_Version_TypeClass object) {
				return createWerkzeug_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Adresse_PLZ_Ort_TypeClass <em>Adresse PLZ Ort Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Adresse_PLZ_Ort_TypeClass
	 * @generated
	 */
	public Adapter createAdresse_PLZ_Ort_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Adresse_Strasse_Nr_TypeClass <em>Adresse Strasse Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Adresse_Strasse_Nr_TypeClass
	 * @generated
	 */
	public Adapter createAdresse_Strasse_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Akteur <em>Akteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Akteur
	 * @generated
	 */
	public Adapter createAkteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Allg_AttributeGroup <em>Akteur Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Akteur_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createAkteur_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung <em>Akteur Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung
	 * @generated
	 */
	public Adapter createAkteur_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Ausgabe_Fachdaten <em>Ausgabe Fachdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Ausgabe_Fachdaten
	 * @generated
	 */
	public Adapter createAusgabe_FachdatenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bauabschnitt_TypeClass <em>Bauabschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bauabschnitt_TypeClass
	 * @generated
	 */
	public Adapter createBauabschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bauphase_TypeClass <em>Bauphase Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bauphase_TypeClass
	 * @generated
	 */
	public Adapter createBauphase_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bauzustand_Kurzbezeichnung_TypeClass <em>Bauzustand Kurzbezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bauzustand_Kurzbezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createBauzustand_Kurzbezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bauzustand_Langbezeichnung_TypeClass <em>Bauzustand Langbezeichnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bauzustand_Langbezeichnung_TypeClass
	 * @generated
	 */
	public Adapter createBauzustand_Langbezeichnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bemerkung_TypeClass <em>Bemerkung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bemerkung_TypeClass
	 * @generated
	 */
	public Adapter createBemerkung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Anlage_TypeClass <em>Bezeichnung Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Planung_Gruppe_TypeClass <em>Bezeichnung Planung Gruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Planung_Gruppe_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Planung_Gruppe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Planung_Projekt_TypeClass <em>Bezeichnung Planung Projekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Planung_Projekt_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Planung_Projekt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Unteranlage_TypeClass <em>Bezeichnung Unteranlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Bezeichnung_Unteranlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Unteranlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup <em>Container Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Container_AttributeGroup
	 * @generated
	 */
	public Adapter createContainer_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Einzel_TypeClass <em>Datum Abschluss Einzel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Einzel_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Abschluss_Einzel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Gruppe_TypeClass <em>Datum Abschluss Gruppe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Gruppe_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Abschluss_Gruppe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Projekt_TypeClass <em>Datum Abschluss Projekt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_Abschluss_Projekt_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Abschluss_Projekt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_Regelwerksstand_TypeClass <em>Datum Regelwerksstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_Regelwerksstand_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Regelwerksstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_TypeClass <em>Datum Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_TypeClass
	 * @generated
	 */
	public Adapter createDatum_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Datum_Uebernahme_TypeClass <em>Datum Uebernahme Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Datum_Uebernahme_TypeClass
	 * @generated
	 */
	public Adapter createDatum_Uebernahme_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.E_Mail_Adresse_TypeClass <em>EMail Adresse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.E_Mail_Adresse_TypeClass
	 * @generated
	 */
	public Adapter createE_Mail_Adresse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Erzeugung_Zeitstempel_TypeClass <em>Erzeugung Zeitstempel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Erzeugung_Zeitstempel_TypeClass
	 * @generated
	 */
	public Adapter createErzeugung_Zeitstempel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Fachdaten_AttributeGroup <em>Fachdaten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Fachdaten_AttributeGroup
	 * @generated
	 */
	public Adapter createFachdaten_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Fuehrende_Oertlichkeit_TypeClass <em>Fuehrende Oertlichkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Fuehrende_Oertlichkeit_TypeClass
	 * @generated
	 */
	public Adapter createFuehrende_Oertlichkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Ident_Rolle_TypeClass <em>Ident Rolle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Ident_Rolle_TypeClass
	 * @generated
	 */
	public Adapter createIdent_Rolle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Index_Ausgabe_TypeClass <em>Index Ausgabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Index_Ausgabe_TypeClass
	 * @generated
	 */
	public Adapter createIndex_Ausgabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Informativ_TypeClass <em>Informativ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Informativ_TypeClass
	 * @generated
	 */
	public Adapter createInformativ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Koordinatensystem_BB_TypeClass <em>Koordinatensystem BB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Koordinatensystem_BB_TypeClass
	 * @generated
	 */
	public Adapter createKoordinatensystem_BB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Koordinatensystem_PB_TypeClass <em>Koordinatensystem PB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Koordinatensystem_PB_TypeClass
	 * @generated
	 */
	public Adapter createKoordinatensystem_PB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Laufende_Nummer_Ausgabe_TypeClass <em>Laufende Nummer Ausgabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Laufende_Nummer_Ausgabe_TypeClass
	 * @generated
	 */
	public Adapter createLaufende_Nummer_Ausgabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup <em>LST Objekte Planungsbereich Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup
	 * @generated
	 */
	public Adapter createLST_Objekte_Planungsbereich_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.LST_Planung_AttributeGroup <em>LST Planung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.LST_Planung_AttributeGroup
	 * @generated
	 */
	public Adapter createLST_Planung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.LST_Zustand <em>LST Zustand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.LST_Zustand
	 * @generated
	 */
	public Adapter createLST_ZustandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Name_Akteur_10_TypeClass <em>Name Akteur 10 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Name_Akteur_10_TypeClass
	 * @generated
	 */
	public Adapter createName_Akteur_10_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Name_Akteur_5_TypeClass <em>Name Akteur 5Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Name_Akteur_5_TypeClass
	 * @generated
	 */
	public Adapter createName_Akteur_5_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Name_Akteur_TypeClass <em>Name Akteur Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Name_Akteur_TypeClass
	 * @generated
	 */
	public Adapter createName_Akteur_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Name_Organisation_TypeClass <em>Name Organisation Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Name_Organisation_TypeClass
	 * @generated
	 */
	public Adapter createName_Organisation_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Objektmanagement_AttributeGroup <em>Objektmanagement Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Objektmanagement_AttributeGroup
	 * @generated
	 */
	public Adapter createObjektmanagement_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Organisationseinheit_TypeClass <em>Organisationseinheit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Organisationseinheit_TypeClass
	 * @generated
	 */
	public Adapter createOrganisationseinheit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle <em>Plan Pro Schnittstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle
	 * @generated
	 */
	public Adapter createPlanPro_SchnittstelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup <em>Plan Pro Schnittstelle Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanPro_Schnittstelle_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_XSD_Version_TypeClass <em>Plan Pro XSD Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanPro_XSD_Version_TypeClass
	 * @generated
	 */
	public Adapter createPlanPro_XSD_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Allg_AttributeGroup <em>Planung EAllg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_E_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_E_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Art_TypeClass <em>Planung EArt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_E_Art_TypeClass
	 * @generated
	 */
	public Adapter createPlanung_E_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup <em>Planung EAusgabe Besonders Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_E_Ausgabe_Besonders_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_E_Handlung_AttributeGroup <em>Planung EHandlung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_E_Handlung_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_E_Handlung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_Einzel <em>Planung Einzel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_Einzel
	 * @generated
	 */
	public Adapter createPlanung_EinzelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Allg_AttributeGroup <em>Planung GAllg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_G_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_G_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Art_Besonders_TypeClass <em>Planung GArt Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_G_Art_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createPlanung_G_Art_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup <em>Planung GFuehrende Strecke Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_G_Fuehrende_Strecke_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup <em>Planung GSchriftfeld Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_G_Schriftfeld_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_Gruppe <em>Planung Gruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_Gruppe
	 * @generated
	 */
	public Adapter createPlanung_GruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup <em>Planung PAllg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createPlanung_P_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_Phase_TypeClass <em>Planung Phase Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_Phase_TypeClass
	 * @generated
	 */
	public Adapter createPlanung_Phase_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Planung_Projekt <em>Planung Projekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Planung_Projekt
	 * @generated
	 */
	public Adapter createPlanung_ProjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup <em>Polygone Betrachtungsbereich Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup
	 * @generated
	 */
	public Adapter createPolygone_Betrachtungsbereich_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Polygone_Planungsbereich_AttributeGroup <em>Polygone Planungsbereich Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Polygone_Planungsbereich_AttributeGroup
	 * @generated
	 */
	public Adapter createPolygone_Planungsbereich_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass <em>Polygonzug Betrachtungsbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass
	 * @generated
	 */
	public Adapter createPolygonzug_Betrachtungsbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Polygonzug_Planungsbereich_TypeClass <em>Polygonzug Planungsbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Polygonzug_Planungsbereich_TypeClass
	 * @generated
	 */
	public Adapter createPolygonzug_Planungsbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Projekt_Nummer_TypeClass <em>Projekt Nummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Projekt_Nummer_TypeClass
	 * @generated
	 */
	public Adapter createProjekt_Nummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Referenz_Planung_Basis_TypeClass <em>Referenz Planung Basis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Referenz_Planung_Basis_TypeClass
	 * @generated
	 */
	public Adapter createReferenz_Planung_Basis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Referenz_Vergleich_Besonders_TypeClass <em>Referenz Vergleich Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Referenz_Vergleich_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createReferenz_Vergleich_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Strecke_Abschnitt_TypeClass <em>Strecke Abschnitt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Strecke_Abschnitt_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Abschnitt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Strecke_Km_TypeClass <em>Strecke Km Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Strecke_Km_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Km_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Strecke_Nummer_TypeClass <em>Strecke Nummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Strecke_Nummer_TypeClass
	 * @generated
	 */
	public Adapter createStrecke_Nummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Telefonnummer_TypeClass <em>Telefonnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Telefonnummer_TypeClass
	 * @generated
	 */
	public Adapter createTelefonnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Untergewerk_Art_TypeClass <em>Untergewerk Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Untergewerk_Art_TypeClass
	 * @generated
	 */
	public Adapter createUntergewerk_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Verantwortliche_Stelle_DB_TypeClass <em>Verantwortliche Stelle DB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Verantwortliche_Stelle_DB_TypeClass
	 * @generated
	 */
	public Adapter createVerantwortliche_Stelle_DB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Vergleich_Ausgabestand_Basis_TypeClass <em>Vergleich Ausgabestand Basis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Vergleich_Ausgabestand_Basis_TypeClass
	 * @generated
	 */
	public Adapter createVergleich_Ausgabestand_Basis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Vergleichstyp_Besonders_TypeClass <em>Vergleichstyp Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Vergleichstyp_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createVergleichstyp_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Werkzeug_Name_TypeClass <em>Werkzeug Name Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Werkzeug_Name_TypeClass
	 * @generated
	 */
	public Adapter createWerkzeug_Name_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.PlanPro.Werkzeug_Version_TypeClass <em>Werkzeug Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.PlanPro.Werkzeug_Version_TypeClass
	 * @generated
	 */
	public Adapter createWerkzeug_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlanProAdapterFactory
