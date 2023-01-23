/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.Bahnuebergang.*;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

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
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage
 * @generated
 */
public class BahnuebergangSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BahnuebergangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnuebergangSwitch() {
		if (modelPackage == null) {
			modelPackage = BahnuebergangPackage.eINSTANCE;
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
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS: {
				Abstand_Gehweg_Fahrbahn_TypeClass abstand_Gehweg_Fahrbahn_TypeClass = (Abstand_Gehweg_Fahrbahn_TypeClass)theEObject;
				T result = caseAbstand_Gehweg_Fahrbahn_TypeClass(abstand_Gehweg_Fahrbahn_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(abstand_Gehweg_Fahrbahn_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_CLASS: {
				Akustik_Fussgaenger_TypeClass akustik_Fussgaenger_TypeClass = (Akustik_Fussgaenger_TypeClass)theEObject;
				T result = caseAkustik_Fussgaenger_TypeClass(akustik_Fussgaenger_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(akustik_Fussgaenger_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.AUSRICHTUNG_TYPE_CLASS: {
				Ausrichtung_TypeClass ausrichtung_TypeClass = (Ausrichtung_TypeClass)theEObject;
				T result = caseAusrichtung_TypeClass(ausrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE_CLASS: {
				Ausrichtung_Winkel_TypeClass ausrichtung_Winkel_TypeClass = (Ausrichtung_Winkel_TypeClass)theEObject;
				T result = caseAusrichtung_Winkel_TypeClass(ausrichtung_Winkel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausrichtung_Winkel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.AUTO_HET_TYPE_CLASS: {
				Auto_Het_TypeClass auto_Het_TypeClass = (Auto_Het_TypeClass)theEObject;
				T result = caseAuto_Het_TypeClass(auto_Het_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auto_Het_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BAULAST_TYPE_CLASS: {
				Baulast_TypeClass baulast_TypeClass = (Baulast_TypeClass)theEObject;
				T result = caseBaulast_TypeClass(baulast_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(baulast_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BAUMPROFIL_TYPE_CLASS: {
				Baumprofil_TypeClass baumprofil_TypeClass = (Baumprofil_TypeClass)theEObject;
				T result = caseBaumprofil_TypeClass(baumprofil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(baumprofil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS: {
				Beeinflussung_Strassenverkehr_TypeClass beeinflussung_Strassenverkehr_TypeClass = (Beeinflussung_Strassenverkehr_TypeClass)theEObject;
				T result = caseBeeinflussung_Strassenverkehr_TypeClass(beeinflussung_Strassenverkehr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(beeinflussung_Strassenverkehr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE_CLASS: {
				Bez_Schrankenantrieb_TypeClass bez_Schrankenantrieb_TypeClass = (Bez_Schrankenantrieb_TypeClass)theEObject;
				T result = caseBez_Schrankenantrieb_TypeClass(bez_Schrankenantrieb_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Schrankenantrieb_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS: {
				Bezeichnung_BUE_GFR_Eckpunkt_TypeClass bezeichnung_BUE_GFR_Eckpunkt_TypeClass = (Bezeichnung_BUE_GFR_Eckpunkt_TypeClass)theEObject;
				T result = caseBezeichnung_BUE_GFR_Eckpunkt_TypeClass(bezeichnung_BUE_GFR_Eckpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_BUE_GFR_Eckpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS: {
				Bezeichnung_GFR_Element_TypeClass bezeichnung_GFR_Element_TypeClass = (Bezeichnung_GFR_Element_TypeClass)theEObject;
				T result = caseBezeichnung_GFR_Element_TypeClass(bezeichnung_GFR_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_GFR_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS: {
				Bezeichnung_GFR_Tripelspiegel_TypeClass bezeichnung_GFR_Tripelspiegel_TypeClass = (Bezeichnung_GFR_Tripelspiegel_TypeClass)theEObject;
				T result = caseBezeichnung_GFR_Tripelspiegel_TypeClass(bezeichnung_GFR_Tripelspiegel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_GFR_Tripelspiegel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS: {
				Bezeichnung_Verkehrszeichen_TypeClass bezeichnung_Verkehrszeichen_TypeClass = (Bezeichnung_Verkehrszeichen_TypeClass)theEObject;
				T result = caseBezeichnung_Verkehrszeichen_TypeClass(bezeichnung_Verkehrszeichen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Verkehrszeichen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BLITZPFEIL_TYPE_CLASS: {
				Blitzpfeil_TypeClass blitzpfeil_TypeClass = (Blitzpfeil_TypeClass)theEObject;
				T result = caseBlitzpfeil_TypeClass(blitzpfeil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(blitzpfeil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP: {
				BUE_Abhaengigkeit_Fue_AttributeGroup buE_Abhaengigkeit_Fue_AttributeGroup = (BUE_Abhaengigkeit_Fue_AttributeGroup)theEObject;
				T result = caseBUE_Abhaengigkeit_Fue_AttributeGroup(buE_Abhaengigkeit_Fue_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE: {
				BUE_Anlage buE_Anlage = (BUE_Anlage)theEObject;
				T result = caseBUE_Anlage(buE_Anlage);
				if (result == null) result = casePunkt_Objekt(buE_Anlage);
				if (result == null) result = caseBasis_Objekt(buE_Anlage);
				if (result == null) result = caseUr_Objekt(buE_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP: {
				BUE_Anlage_Allg_AttributeGroup buE_Anlage_Allg_AttributeGroup = (BUE_Anlage_Allg_AttributeGroup)theEObject;
				T result = caseBUE_Anlage_Allg_AttributeGroup(buE_Anlage_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP: {
				BUE_Anlage_Fuss_Rad_AttributeGroup buE_Anlage_Fuss_Rad_AttributeGroup = (BUE_Anlage_Fuss_Rad_AttributeGroup)theEObject;
				T result = caseBUE_Anlage_Fuss_Rad_AttributeGroup(buE_Anlage_Fuss_Rad_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE: {
				BUE_Anlage_Strasse buE_Anlage_Strasse = (BUE_Anlage_Strasse)theEObject;
				T result = caseBUE_Anlage_Strasse(buE_Anlage_Strasse);
				if (result == null) result = caseBasis_Objekt(buE_Anlage_Strasse);
				if (result == null) result = caseUr_Objekt(buE_Anlage_Strasse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP: {
				BUE_Anlage_Strasse_Allg_AttributeGroup buE_Anlage_Strasse_Allg_AttributeGroup = (BUE_Anlage_Strasse_Allg_AttributeGroup)theEObject;
				T result = caseBUE_Anlage_Strasse_Allg_AttributeGroup(buE_Anlage_Strasse_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_V: {
				BUE_Anlage_V buE_Anlage_V = (BUE_Anlage_V)theEObject;
				T result = caseBUE_Anlage_V(buE_Anlage_V);
				if (result == null) result = caseBasis_Objekt(buE_Anlage_V);
				if (result == null) result = caseUr_Objekt(buE_Anlage_V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP: {
				BUE_Anlage_V_Allg_AttributeGroup buE_Anlage_V_Allg_AttributeGroup = (BUE_Anlage_V_Allg_AttributeGroup)theEObject;
				T result = caseBUE_Anlage_V_Allg_AttributeGroup(buE_Anlage_V_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_AUSSCHALTUNG: {
				BUE_Ausschaltung buE_Ausschaltung = (BUE_Ausschaltung)theEObject;
				T result = caseBUE_Ausschaltung(buE_Ausschaltung);
				if (result == null) result = caseBasis_Objekt(buE_Ausschaltung);
				if (result == null) result = caseUr_Objekt(buE_Ausschaltung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_BAUART_TYPE_CLASS: {
				BUE_Bauart_TypeClass buE_Bauart_TypeClass = (BUE_Bauart_TypeClass)theEObject;
				T result = caseBUE_Bauart_TypeClass(buE_Bauart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Bauart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				BUE_Bedien_Anz_Element_Allg_AttributeGroup buE_Bedien_Anz_Element_Allg_AttributeGroup = (BUE_Bedien_Anz_Element_Allg_AttributeGroup)theEObject;
				T result = caseBUE_Bedien_Anz_Element_Allg_AttributeGroup(buE_Bedien_Anz_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT: {
				BUE_Bedien_Anzeige_Element buE_Bedien_Anzeige_Element = (BUE_Bedien_Anzeige_Element)theEObject;
				T result = caseBUE_Bedien_Anzeige_Element(buE_Bedien_Anzeige_Element);
				if (result == null) result = caseBasis_Objekt(buE_Bedien_Anzeige_Element);
				if (result == null) result = caseUr_Objekt(buE_Bedien_Anzeige_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_BUESTRA_TYPE_CLASS: {
				BUE_Buestra_TypeClass buE_Buestra_TypeClass = (BUE_Buestra_TypeClass)theEObject;
				T result = caseBUE_Buestra_TypeClass(buE_Buestra_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Buestra_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG: {
				BUE_Deckendes_Signal_Zuordnung buE_Deckendes_Signal_Zuordnung = (BUE_Deckendes_Signal_Zuordnung)theEObject;
				T result = caseBUE_Deckendes_Signal_Zuordnung(buE_Deckendes_Signal_Zuordnung);
				if (result == null) result = caseBasis_Objekt(buE_Deckendes_Signal_Zuordnung);
				if (result == null) result = caseUr_Objekt(buE_Deckendes_Signal_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_EINSCHALTUNG: {
				BUE_Einschaltung buE_Einschaltung = (BUE_Einschaltung)theEObject;
				T result = caseBUE_Einschaltung(buE_Einschaltung);
				if (result == null) result = caseBasis_Objekt(buE_Einschaltung);
				if (result == null) result = caseUr_Objekt(buE_Einschaltung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP: {
				BUE_Einschaltung_Hp_AttributeGroup buE_Einschaltung_Hp_AttributeGroup = (BUE_Einschaltung_Hp_AttributeGroup)theEObject;
				T result = caseBUE_Einschaltung_Hp_AttributeGroup(buE_Einschaltung_Hp_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG: {
				BUE_Einschaltung_Zuordnung buE_Einschaltung_Zuordnung = (BUE_Einschaltung_Zuordnung)theEObject;
				T result = caseBUE_Einschaltung_Zuordnung(buE_Einschaltung_Zuordnung);
				if (result == null) result = caseBasis_Objekt(buE_Einschaltung_Zuordnung);
				if (result == null) result = caseUr_Objekt(buE_Einschaltung_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS: {
				BUE_Funktionsueberwachung_TypeClass buE_Funktionsueberwachung_TypeClass = (BUE_Funktionsueberwachung_TypeClass)theEObject;
				T result = caseBUE_Funktionsueberwachung_TypeClass(buE_Funktionsueberwachung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Funktionsueberwachung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT: {
				BUE_Gefahrraum_Eckpunkt buE_Gefahrraum_Eckpunkt = (BUE_Gefahrraum_Eckpunkt)theEObject;
				T result = caseBUE_Gefahrraum_Eckpunkt(buE_Gefahrraum_Eckpunkt);
				if (result == null) result = casePunkt_Objekt(buE_Gefahrraum_Eckpunkt);
				if (result == null) result = caseBasis_Objekt(buE_Gefahrraum_Eckpunkt);
				if (result == null) result = caseUr_Objekt(buE_Gefahrraum_Eckpunkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup = (BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup(buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM: {
				BUE_Gleisbezogener_Gefahrraum buE_Gleisbezogener_Gefahrraum = (BUE_Gleisbezogener_Gefahrraum)theEObject;
				T result = caseBUE_Gleisbezogener_Gefahrraum(buE_Gleisbezogener_Gefahrraum);
				if (result == null) result = caseBereich_Objekt(buE_Gleisbezogener_Gefahrraum);
				if (result == null) result = caseBasis_Objekt(buE_Gleisbezogener_Gefahrraum);
				if (result == null) result = caseUr_Objekt(buE_Gleisbezogener_Gefahrraum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS: {
				BUE_Handschalteinrichtung_TypeClass buE_Handschalteinrichtung_TypeClass = (BUE_Handschalteinrichtung_TypeClass)theEObject;
				T result = caseBUE_Handschalteinrichtung_TypeClass(buE_Handschalteinrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Handschalteinrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_KANTE: {
				BUE_Kante buE_Kante = (BUE_Kante)theEObject;
				T result = caseBUE_Kante(buE_Kante);
				if (result == null) result = casePunkt_Objekt(buE_Kante);
				if (result == null) result = caseBasis_Objekt(buE_Kante);
				if (result == null) result = caseUr_Objekt(buE_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN: {
				BUE_Kreuzungsplan buE_Kreuzungsplan = (BUE_Kreuzungsplan)theEObject;
				T result = caseBUE_Kreuzungsplan(buE_Kreuzungsplan);
				if (result == null) result = caseBasis_Objekt(buE_Kreuzungsplan);
				if (result == null) result = caseUr_Objekt(buE_Kreuzungsplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP: {
				BUE_Kreuzungsplan_Koordinaten_AttributeGroup buE_Kreuzungsplan_Koordinaten_AttributeGroup = (BUE_Kreuzungsplan_Koordinaten_AttributeGroup)theEObject;
				T result = caseBUE_Kreuzungsplan_Koordinaten_AttributeGroup(buE_Kreuzungsplan_Koordinaten_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_MIT_GFR_TYPE_CLASS: {
				BUE_Mit_GFR_TypeClass buE_Mit_GFR_TypeClass = (BUE_Mit_GFR_TypeClass)theEObject;
				T result = caseBUE_Mit_GFR_TypeClass(buE_Mit_GFR_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Mit_GFR_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE_CLASS: {
				BUE_Nachlaufzeit_TypeClass buE_Nachlaufzeit_TypeClass = (BUE_Nachlaufzeit_TypeClass)theEObject;
				T result = caseBUE_Nachlaufzeit_TypeClass(buE_Nachlaufzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Nachlaufzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE_CLASS: {
				BUE_Neigung_TypeClass buE_Neigung_TypeClass = (BUE_Neigung_TypeClass)theEObject;
				T result = caseBUE_Neigung_TypeClass(buE_Neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_SCHNITTSTELLE: {
				BUE_Schnittstelle buE_Schnittstelle = (BUE_Schnittstelle)theEObject;
				T result = caseBUE_Schnittstelle(buE_Schnittstelle);
				if (result == null) result = caseBasis_Objekt(buE_Schnittstelle);
				if (result == null) result = caseUr_Objekt(buE_Schnittstelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP: {
				BUE_Schnittstelle_Allg_AttributeGroup buE_Schnittstelle_Allg_AttributeGroup = (BUE_Schnittstelle_Allg_AttributeGroup)theEObject;
				T result = caseBUE_Schnittstelle_Allg_AttributeGroup(buE_Schnittstelle_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_SICHERUNGSART_TYPE_CLASS: {
				BUE_Sicherungsart_TypeClass buE_Sicherungsart_TypeClass = (BUE_Sicherungsart_TypeClass)theEObject;
				T result = caseBUE_Sicherungsart_TypeClass(buE_Sicherungsart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Sicherungsart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE_CLASS: {
				BUE_Sicherungszeit_TypeClass buE_Sicherungszeit_TypeClass = (BUE_Sicherungszeit_TypeClass)theEObject;
				T result = caseBUE_Sicherungszeit_TypeClass(buE_Sicherungszeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Sicherungszeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL: {
				BUE_Spezifisches_Signal buE_Spezifisches_Signal = (BUE_Spezifisches_Signal)theEObject;
				T result = caseBUE_Spezifisches_Signal(buE_Spezifisches_Signal);
				if (result == null) result = caseBasis_Objekt(buE_Spezifisches_Signal);
				if (result == null) result = caseUr_Objekt(buE_Spezifisches_Signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_STRASSE_TYPE_CLASS: {
				BUE_Strasse_TypeClass buE_Strasse_TypeClass = (BUE_Strasse_TypeClass)theEObject;
				T result = caseBUE_Strasse_TypeClass(buE_Strasse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Strasse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_TECHNIK_TYPE_CLASS: {
				BUE_Technik_TypeClass buE_Technik_TypeClass = (BUE_Technik_TypeClass)theEObject;
				T result = caseBUE_Technik_TypeClass(buE_Technik_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Technik_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE_CLASS: {
				BUE_Vorlaufzeit_TypeClass buE_Vorlaufzeit_TypeClass = (BUE_Vorlaufzeit_TypeClass)theEObject;
				T result = caseBUE_Vorlaufzeit_TypeClass(buE_Vorlaufzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(buE_Vorlaufzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG: {
				BUE_WS_Fstr_Zuordnung buE_WS_Fstr_Zuordnung = (BUE_WS_Fstr_Zuordnung)theEObject;
				T result = caseBUE_WS_Fstr_Zuordnung(buE_WS_Fstr_Zuordnung);
				if (result == null) result = caseBasis_Objekt(buE_WS_Fstr_Zuordnung);
				if (result == null) result = caseUr_Objekt(buE_WS_Fstr_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE_CLASS: {
				Einschaltverz_Errechnet_TypeClass einschaltverz_Errechnet_TypeClass = (Einschaltverz_Errechnet_TypeClass)theEObject;
				T result = caseEinschaltverz_Errechnet_TypeClass(einschaltverz_Errechnet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einschaltverz_Errechnet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS: {
				Einschaltverz_Gewaehlt_TypeClass einschaltverz_Gewaehlt_TypeClass = (Einschaltverz_Gewaehlt_TypeClass)theEObject;
				T result = caseEinschaltverz_Gewaehlt_TypeClass(einschaltverz_Gewaehlt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einschaltverz_Gewaehlt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS: {
				Ersatzstecker_Gleisbezogen_TypeClass ersatzstecker_Gleisbezogen_TypeClass = (Ersatzstecker_Gleisbezogen_TypeClass)theEObject;
				T result = caseErsatzstecker_Gleisbezogen_TypeClass(ersatzstecker_Gleisbezogen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ersatzstecker_Gleisbezogen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS: {
				Fahrbahn_Befestigung_Gleis_TypeClass fahrbahn_Befestigung_Gleis_TypeClass = (Fahrbahn_Befestigung_Gleis_TypeClass)theEObject;
				T result = caseFahrbahn_Befestigung_Gleis_TypeClass(fahrbahn_Befestigung_Gleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fahrbahn_Befestigung_Gleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE_CLASS: {
				Fahrbahn_Befestigung_TypeClass fahrbahn_Befestigung_TypeClass = (Fahrbahn_Befestigung_TypeClass)theEObject;
				T result = caseFahrbahn_Befestigung_TypeClass(fahrbahn_Befestigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fahrbahn_Befestigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE_CLASS: {
				Fahrbahn_Breite_TypeClass fahrbahn_Breite_TypeClass = (Fahrbahn_Breite_TypeClass)theEObject;
				T result = caseFahrbahn_Breite_TypeClass(fahrbahn_Breite_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fahrbahn_Breite_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FUE_SCHALTFALL_TYPE_CLASS: {
				Fue_Schaltfall_TypeClass fue_Schaltfall_TypeClass = (Fue_Schaltfall_TypeClass)theEObject;
				T result = caseFue_Schaltfall_TypeClass(fue_Schaltfall_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fue_Schaltfall_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FUSS_RADWEG_ART_TYPE_CLASS: {
				Fuss_Radweg_Art_TypeClass fuss_Radweg_Art_TypeClass = (Fuss_Radweg_Art_TypeClass)theEObject;
				T result = caseFuss_Radweg_Art_TypeClass(fuss_Radweg_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fuss_Radweg_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.FUSS_RADWEG_SEITE_TYPE_CLASS: {
				Fuss_Radweg_Seite_TypeClass fuss_Radweg_Seite_TypeClass = (Fuss_Radweg_Seite_TypeClass)theEObject;
				T result = caseFuss_Radweg_Seite_TypeClass(fuss_Radweg_Seite_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fuss_Radweg_Seite_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_ANLAGE: {
				GFR_Anlage gfR_Anlage = (GFR_Anlage)theEObject;
				T result = caseGFR_Anlage(gfR_Anlage);
				if (result == null) result = caseBasis_Objekt(gfR_Anlage);
				if (result == null) result = caseUr_Objekt(gfR_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP: {
				GFR_Anlage_Allg_AttributeGroup gfR_Anlage_Allg_AttributeGroup = (GFR_Anlage_Allg_AttributeGroup)theEObject;
				T result = caseGFR_Anlage_Allg_AttributeGroup(gfR_Anlage_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_ART_TYPE_CLASS: {
				GFR_Art_TypeClass gfR_Art_TypeClass = (GFR_Art_TypeClass)theEObject;
				T result = caseGFR_Art_TypeClass(gfR_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gfR_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_ELEMENT: {
				GFR_Element gfR_Element = (GFR_Element)theEObject;
				T result = caseGFR_Element(gfR_Element);
				if (result == null) result = caseBasis_Objekt(gfR_Element);
				if (result == null) result = caseUr_Objekt(gfR_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				GFR_Element_Bezeichnung_AttributeGroup gfR_Element_Bezeichnung_AttributeGroup = (GFR_Element_Bezeichnung_AttributeGroup)theEObject;
				T result = caseGFR_Element_Bezeichnung_AttributeGroup(gfR_Element_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE_CLASS: {
				GFR_Neigung_TypeClass gfR_Neigung_TypeClass = (GFR_Neigung_TypeClass)theEObject;
				T result = caseGFR_Neigung_TypeClass(gfR_Neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gfR_Neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL: {
				GFR_Tripelspiegel gfR_Tripelspiegel = (GFR_Tripelspiegel)theEObject;
				T result = caseGFR_Tripelspiegel(gfR_Tripelspiegel);
				if (result == null) result = casePunkt_Objekt(gfR_Tripelspiegel);
				if (result == null) result = caseBasis_Objekt(gfR_Tripelspiegel);
				if (result == null) result = caseUr_Objekt(gfR_Tripelspiegel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP: {
				GFR_Tripelspiegel_Allg_AttributeGroup gfR_Tripelspiegel_Allg_AttributeGroup = (GFR_Tripelspiegel_Allg_AttributeGroup)theEObject;
				T result = caseGFR_Tripelspiegel_Allg_AttributeGroup(gfR_Tripelspiegel_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				GFR_Tripelspiegel_Bezeichnung_AttributeGroup gfR_Tripelspiegel_Bezeichnung_AttributeGroup = (GFR_Tripelspiegel_Bezeichnung_AttributeGroup)theEObject;
				T result = caseGFR_Tripelspiegel_Bezeichnung_AttributeGroup(gfR_Tripelspiegel_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GFR_TYP_TYPE_CLASS: {
				GFR_Typ_TypeClass gfR_Typ_TypeClass = (GFR_Typ_TypeClass)theEObject;
				T result = caseGFR_Typ_TypeClass(gfR_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gfR_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GITTERBEHANG_TYPE_CLASS: {
				Gitterbehang_TypeClass gitterbehang_TypeClass = (Gitterbehang_TypeClass)theEObject;
				T result = caseGitterbehang_TypeClass(gitterbehang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gitterbehang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE_CLASS: {
				Gleis_Am_Bue_TypeClass gleis_Am_Bue_TypeClass = (Gleis_Am_Bue_TypeClass)theEObject;
				T result = caseGleis_Am_Bue_TypeClass(gleis_Am_Bue_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gleis_Am_Bue_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.HALTEZEIT_TYPE_CLASS: {
				Haltezeit_TypeClass haltezeit_TypeClass = (Haltezeit_TypeClass)theEObject;
				T result = caseHaltezeit_TypeClass(haltezeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(haltezeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.HERSTELLER_TYPE_CLASS: {
				Hersteller_TypeClass hersteller_TypeClass = (Hersteller_TypeClass)theEObject;
				T result = caseHersteller_TypeClass(hersteller_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hersteller_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.HP_ERSATZSTECKER_TYPE_CLASS: {
				Hp_Ersatzstecker_TypeClass hp_Ersatzstecker_TypeClass = (Hp_Ersatzstecker_TypeClass)theEObject;
				T result = caseHp_Ersatzstecker_TypeClass(hp_Ersatzstecker_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hp_Ersatzstecker_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.KLASSIFIZIERUNG_TYPE_CLASS: {
				Klassifizierung_TypeClass klassifizierung_TypeClass = (Klassifizierung_TypeClass)theEObject;
				T result = caseKlassifizierung_TypeClass(klassifizierung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(klassifizierung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_CLASS: {
				Kontrastblende_TypeClass kontrastblende_TypeClass = (Kontrastblende_TypeClass)theEObject;
				T result = caseKontrastblende_TypeClass(kontrastblende_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kontrastblende_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE_CLASS: {
				Kreuzungswinkel_TypeClass kreuzungswinkel_TypeClass = (Kreuzungswinkel_TypeClass)theEObject;
				T result = caseKreuzungswinkel_TypeClass(kreuzungswinkel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kreuzungswinkel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.KURZZUGSCHALTUNG_TYPE_CLASS: {
				Kurzzugschaltung_TypeClass kurzzugschaltung_TypeClass = (Kurzzugschaltung_TypeClass)theEObject;
				T result = caseKurzzugschaltung_TypeClass(kurzzugschaltung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kurzzugschaltung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.LAGERUNG_ART_TYPE_CLASS: {
				Lagerung_Art_TypeClass lagerung_Art_TypeClass = (Lagerung_Art_TypeClass)theEObject;
				T result = caseLagerung_Art_TypeClass(lagerung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lagerung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.LFUE_IMPULS_TYPE_CLASS: {
				LFUE_Impuls_TypeClass lfuE_Impuls_TypeClass = (LFUE_Impuls_TypeClass)theEObject;
				T result = caseLFUE_Impuls_TypeClass(lfuE_Impuls_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lfuE_Impuls_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.LIEFERLAENGE_TYPE_CLASS: {
				Lieferlaenge_TypeClass lieferlaenge_TypeClass = (Lieferlaenge_TypeClass)theEObject;
				T result = caseLieferlaenge_TypeClass(lieferlaenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lieferlaenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS: {
				Montage_Ausgleichsgewichte_TypeClass montage_Ausgleichsgewichte_TypeClass = (Montage_Ausgleichsgewichte_TypeClass)theEObject;
				T result = caseMontage_Ausgleichsgewichte_TypeClass(montage_Ausgleichsgewichte_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(montage_Ausgleichsgewichte_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE_CLASS: {
				Montage_Besonders_TypeClass montage_Besonders_TypeClass = (Montage_Besonders_TypeClass)theEObject;
				T result = caseMontage_Besonders_TypeClass(montage_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(montage_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE_CLASS: {
				Montagehoehe_TypeClass montagehoehe_TypeClass = (Montagehoehe_TypeClass)theEObject;
				T result = caseMontagehoehe_TypeClass(montagehoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(montagehoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE_CLASS: {
				Optik_Durchmesser_TypeClass optik_Durchmesser_TypeClass = (Optik_Durchmesser_TypeClass)theEObject;
				T result = caseOptik_Durchmesser_TypeClass(optik_Durchmesser_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(optik_Durchmesser_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.OPTIK_SYMBOLMASKE_TYPE_CLASS: {
				Optik_Symbolmaske_TypeClass optik_Symbolmaske_TypeClass = (Optik_Symbolmaske_TypeClass)theEObject;
				T result = caseOptik_Symbolmaske_TypeClass(optik_Symbolmaske_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(optik_Symbolmaske_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.PEGEL_TYPE_CLASS: {
				Pegel_TypeClass pegel_TypeClass = (Pegel_TypeClass)theEObject;
				T result = casePegel_TypeClass(pegel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pegel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE_CLASS: {
				Pixel_Koordinate_X_TypeClass pixel_Koordinate_X_TypeClass = (Pixel_Koordinate_X_TypeClass)theEObject;
				T result = casePixel_Koordinate_X_TypeClass(pixel_Koordinate_X_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pixel_Koordinate_X_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE_CLASS: {
				Pixel_Koordinate_Y_TypeClass pixel_Koordinate_Y_TypeClass = (Pixel_Koordinate_Y_TypeClass)theEObject;
				T result = casePixel_Koordinate_Y_TypeClass(pixel_Koordinate_Y_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pixel_Koordinate_Y_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE_CLASS: {
				Raeumstrecke_DAB_TypeClass raeumstrecke_DAB_TypeClass = (Raeumstrecke_DAB_TypeClass)theEObject;
				T result = caseRaeumstrecke_DAB_TypeClass(raeumstrecke_DAB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(raeumstrecke_DAB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE_CLASS: {
				Raeumstrecke_DBK_TypeClass raeumstrecke_DBK_TypeClass = (Raeumstrecke_DBK_TypeClass)theEObject;
				T result = caseRaeumstrecke_DBK_TypeClass(raeumstrecke_DBK_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(raeumstrecke_DBK_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE_CLASS: {
				Raeumstrecke_DCK_TypeClass raeumstrecke_DCK_TypeClass = (Raeumstrecke_DCK_TypeClass)theEObject;
				T result = caseRaeumstrecke_DCK_TypeClass(raeumstrecke_DCK_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(raeumstrecke_DCK_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS: {
				Raeumstrecke_DSK_Strich_TypeClass raeumstrecke_DSK_Strich_TypeClass = (Raeumstrecke_DSK_Strich_TypeClass)theEObject;
				T result = caseRaeumstrecke_DSK_Strich_TypeClass(raeumstrecke_DSK_Strich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(raeumstrecke_DSK_Strich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE_CLASS: {
				Raeumstrecke_TypeClass raeumstrecke_TypeClass = (Raeumstrecke_TypeClass)theEObject;
				T result = caseRaeumstrecke_TypeClass(raeumstrecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(raeumstrecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.RICHTUNGSPFEIL_TYPE_CLASS: {
				Richtungspfeil_TypeClass richtungspfeil_TypeClass = (Richtungspfeil_TypeClass)theEObject;
				T result = caseRichtungspfeil_TypeClass(richtungspfeil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(richtungspfeil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP: {
				SA_Schrankenbaum_AttributeGroup sA_Schrankenbaum_AttributeGroup = (SA_Schrankenbaum_AttributeGroup)theEObject;
				T result = caseSA_Schrankenbaum_AttributeGroup(sA_Schrankenbaum_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE_CLASS: {
				Schaltgruppe_TypeClass schaltgruppe_TypeClass = (Schaltgruppe_TypeClass)theEObject;
				T result = caseSchaltgruppe_TypeClass(schaltgruppe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schaltgruppe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG: {
				Schaltmittel_Fstr_Zuordnung schaltmittel_Fstr_Zuordnung = (Schaltmittel_Fstr_Zuordnung)theEObject;
				T result = caseSchaltmittel_Fstr_Zuordnung(schaltmittel_Fstr_Zuordnung);
				if (result == null) result = caseBasis_Objekt(schaltmittel_Fstr_Zuordnung);
				if (result == null) result = caseUr_Objekt(schaltmittel_Fstr_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHRANKENANTRIEB: {
				Schrankenantrieb schrankenantrieb = (Schrankenantrieb)theEObject;
				T result = caseSchrankenantrieb(schrankenantrieb);
				if (result == null) result = casePunkt_Objekt(schrankenantrieb);
				if (result == null) result = caseBasis_Objekt(schrankenantrieb);
				if (result == null) result = caseUr_Objekt(schrankenantrieb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP: {
				Schrankenantrieb_Allg_AttributeGroup schrankenantrieb_Allg_AttributeGroup = (Schrankenantrieb_Allg_AttributeGroup)theEObject;
				T result = caseSchrankenantrieb_Allg_AttributeGroup(schrankenantrieb_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Schrankenantrieb_Bezeichnung_AttributeGroup schrankenantrieb_Bezeichnung_AttributeGroup = (Schrankenantrieb_Bezeichnung_AttributeGroup)theEObject;
				T result = caseSchrankenantrieb_Bezeichnung_AttributeGroup(schrankenantrieb_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_CLASS: {
				Schutzbuegel_TypeClass schutzbuegel_TypeClass = (Schutzbuegel_TypeClass)theEObject;
				T result = caseSchutzbuegel_TypeClass(schutzbuegel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schutzbuegel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE_CLASS: {
				Sicherheitsabstand_TypeClass sicherheitsabstand_TypeClass = (Sicherheitsabstand_TypeClass)theEObject;
				T result = caseSicherheitsabstand_TypeClass(sicherheitsabstand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sicherheitsabstand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE_CLASS: {
				Signalverz_Errechnet_TypeClass signalverz_Errechnet_TypeClass = (Signalverz_Errechnet_TypeClass)theEObject;
				T result = caseSignalverz_Errechnet_TypeClass(signalverz_Errechnet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalverz_Errechnet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE_CLASS: {
				Signalverz_Gewaehlt_TypeClass signalverz_Gewaehlt_TypeClass = (Signalverz_Gewaehlt_TypeClass)theEObject;
				T result = caseSignalverz_Gewaehlt_TypeClass(signalverz_Gewaehlt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalverz_Gewaehlt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SPERRLAENGE_TYPE_CLASS: {
				Sperrlaenge_TypeClass sperrlaenge_TypeClass = (Sperrlaenge_TypeClass)theEObject;
				T result = caseSperrlaenge_TypeClass(sperrlaenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sperrlaenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS: {
				Sperrstrecke_Fussgaenger_TypeClass sperrstrecke_Fussgaenger_TypeClass = (Sperrstrecke_Fussgaenger_TypeClass)theEObject;
				T result = caseSperrstrecke_Fussgaenger_TypeClass(sperrstrecke_Fussgaenger_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sperrstrecke_Fussgaenger_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.SPERRSTRECKE_TYPE_CLASS: {
				Sperrstrecke_TypeClass sperrstrecke_TypeClass = (Sperrstrecke_TypeClass)theEObject;
				T result = caseSperrstrecke_TypeClass(sperrstrecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sperrstrecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.STOERHALT_HALTFALL_TYPE_CLASS: {
				Stoerhalt_Haltfall_TypeClass stoerhalt_Haltfall_TypeClass = (Stoerhalt_Haltfall_TypeClass)theEObject;
				T result = caseStoerhalt_Haltfall_TypeClass(stoerhalt_Haltfall_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(stoerhalt_Haltfall_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.STOERHALT_MERKHINWEIS_TYPE_CLASS: {
				Stoerhalt_Merkhinweis_TypeClass stoerhalt_Merkhinweis_TypeClass = (Stoerhalt_Merkhinweis_TypeClass)theEObject;
				T result = caseStoerhalt_Merkhinweis_TypeClass(stoerhalt_Merkhinweis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(stoerhalt_Merkhinweis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE_CLASS: {
				Teilsperrstrecke_TypeClass teilsperrstrecke_TypeClass = (Teilsperrstrecke_TypeClass)theEObject;
				T result = caseTeilsperrstrecke_TypeClass(teilsperrstrecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(teilsperrstrecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE_CLASS: {
				Teilvorgabezeit_TypeClass teilvorgabezeit_TypeClass = (Teilvorgabezeit_TypeClass)theEObject;
				T result = caseTeilvorgabezeit_TypeClass(teilvorgabezeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(teilvorgabezeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_CLASS: {
				Tragkopf_Verstellbar_TypeClass tragkopf_Verstellbar_TypeClass = (Tragkopf_Verstellbar_TypeClass)theEObject;
				T result = caseTragkopf_Verstellbar_TypeClass(tragkopf_Verstellbar_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tragkopf_Verstellbar_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE_CLASS: {
				V_Max_Schiene_TypeClass v_Max_Schiene_TypeClass = (V_Max_Schiene_TypeClass)theEObject;
				T result = caseV_Max_Schiene_TypeClass(v_Max_Schiene_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Max_Schiene_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VMAX_STRASSE_TYPE_CLASS: {
				V_Max_Strasse_TypeClass v_Max_Strasse_TypeClass = (V_Max_Strasse_TypeClass)theEObject;
				T result = caseV_Max_Strasse_TypeClass(v_Max_Strasse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Max_Strasse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE_CLASS: {
				V_Min_Fussweg_TypeClass v_Min_Fussweg_TypeClass = (V_Min_Fussweg_TypeClass)theEObject;
				T result = caseV_Min_Fussweg_TypeClass(v_Min_Fussweg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Min_Fussweg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE_CLASS: {
				V_Min_Schiene_TypeClass v_Min_Schiene_TypeClass = (V_Min_Schiene_TypeClass)theEObject;
				T result = caseV_Min_Schiene_TypeClass(v_Min_Schiene_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Min_Schiene_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VMIN_STRASSE_TYPE_CLASS: {
				V_Min_Strasse_TypeClass v_Min_Strasse_TypeClass = (V_Min_Strasse_TypeClass)theEObject;
				T result = caseV_Min_Strasse_TypeClass(v_Min_Strasse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Min_Strasse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VERKEHRSZEICHEN: {
				Verkehrszeichen verkehrszeichen = (Verkehrszeichen)theEObject;
				T result = caseVerkehrszeichen(verkehrszeichen);
				if (result == null) result = caseBasis_Objekt(verkehrszeichen);
				if (result == null) result = caseUr_Objekt(verkehrszeichen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP: {
				Verkehrszeichen_Allg_AttributeGroup verkehrszeichen_Allg_AttributeGroup = (Verkehrszeichen_Allg_AttributeGroup)theEObject;
				T result = caseVerkehrszeichen_Allg_AttributeGroup(verkehrszeichen_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP: {
				Verkehrszeichen_Andreaskreuz_AttributeGroup verkehrszeichen_Andreaskreuz_AttributeGroup = (Verkehrszeichen_Andreaskreuz_AttributeGroup)theEObject;
				T result = caseVerkehrszeichen_Andreaskreuz_AttributeGroup(verkehrszeichen_Andreaskreuz_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Verkehrszeichen_Bezeichnung_AttributeGroup verkehrszeichen_Bezeichnung_AttributeGroup = (Verkehrszeichen_Bezeichnung_AttributeGroup)theEObject;
				T result = caseVerkehrszeichen_Bezeichnung_AttributeGroup(verkehrszeichen_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP: {
				Verkehrszeichen_Lz_AttributeGroup verkehrszeichen_Lz_AttributeGroup = (Verkehrszeichen_Lz_AttributeGroup)theEObject;
				T result = caseVerkehrszeichen_Lz_AttributeGroup(verkehrszeichen_Lz_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VORGESCHALTET_TYPE_CLASS: {
				Vorgeschaltet_TypeClass vorgeschaltet_TypeClass = (Vorgeschaltet_TypeClass)theEObject;
				T result = caseVorgeschaltet_TypeClass(vorgeschaltet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vorgeschaltet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP: {
				Vz_Sperrstrecke_AttributeGroup vz_Sperrstrecke_AttributeGroup = (Vz_Sperrstrecke_AttributeGroup)theEObject;
				T result = caseVz_Sperrstrecke_AttributeGroup(vz_Sperrstrecke_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP: {
				Vz_Sperrstrecke_Schranke_AttributeGroup vz_Sperrstrecke_Schranke_AttributeGroup = (Vz_Sperrstrecke_Schranke_AttributeGroup)theEObject;
				T result = caseVz_Sperrstrecke_Schranke_AttributeGroup(vz_Sperrstrecke_Schranke_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP: {
				Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup vz_Sperrstrecke_Vorgeschaltet_AttributeGroup = (Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup)theEObject;
				T result = caseVz_Sperrstrecke_Vorgeschaltet_AttributeGroup(vz_Sperrstrecke_Vorgeschaltet_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE_CLASS: {
				Winkel_Alpha_TypeClass winkel_Alpha_TypeClass = (Winkel_Alpha_TypeClass)theEObject;
				T result = caseWinkel_Alpha_TypeClass(winkel_Alpha_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(winkel_Alpha_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS: {
				Zeitueberschreitungsmeldung_TypeClass zeitueberschreitungsmeldung_TypeClass = (Zeitueberschreitungsmeldung_TypeClass)theEObject;
				T result = caseZeitueberschreitungsmeldung_TypeClass(zeitueberschreitungsmeldung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zeitueberschreitungsmeldung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE_CLASS: {
				Zusatzschild_TypeClass zusatzschild_TypeClass = (Zusatzschild_TypeClass)theEObject;
				T result = caseZusatzschild_TypeClass(zusatzschild_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zusatzschild_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstand Gehweg Fahrbahn Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstand Gehweg Fahrbahn Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstand_Gehweg_Fahrbahn_TypeClass(Abstand_Gehweg_Fahrbahn_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akustik Fussgaenger Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akustik Fussgaenger Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkustik_Fussgaenger_TypeClass(Akustik_Fussgaenger_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusrichtung_TypeClass(Ausrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausrichtung Winkel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausrichtung Winkel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusrichtung_Winkel_TypeClass(Ausrichtung_Winkel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Het Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Het Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_Het_TypeClass(Auto_Het_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baulast Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baulast Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaulast_TypeClass(Baulast_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baumprofil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baumprofil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaumprofil_TypeClass(Baumprofil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beeinflussung Strassenverkehr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beeinflussung Strassenverkehr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeeinflussung_Strassenverkehr_TypeClass(Beeinflussung_Strassenverkehr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Schrankenantrieb Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Schrankenantrieb Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Schrankenantrieb_TypeClass(Bez_Schrankenantrieb_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung BUE GFR Eckpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung BUE GFR Eckpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_BUE_GFR_Eckpunkt_TypeClass(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung GFR Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung GFR Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_GFR_Element_TypeClass(Bezeichnung_GFR_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung GFR Tripelspiegel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung GFR Tripelspiegel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_GFR_Tripelspiegel_TypeClass(Bezeichnung_GFR_Tripelspiegel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Verkehrszeichen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Verkehrszeichen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Verkehrszeichen_TypeClass(Bezeichnung_Verkehrszeichen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blitzpfeil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blitzpfeil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlitzpfeil_TypeClass(Blitzpfeil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Abhaengigkeit Fue Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Abhaengigkeit Fue Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Abhaengigkeit_Fue_AttributeGroup(BUE_Abhaengigkeit_Fue_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage(BUE_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_Allg_AttributeGroup(BUE_Anlage_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage Fuss Rad Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage Fuss Rad Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_Fuss_Rad_AttributeGroup(BUE_Anlage_Fuss_Rad_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage Strasse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage Strasse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_Strasse(BUE_Anlage_Strasse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage Strasse Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage Strasse Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_Strasse_Allg_AttributeGroup(BUE_Anlage_Strasse_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_V(BUE_Anlage_V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Anlage VAllg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Anlage VAllg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Anlage_V_Allg_AttributeGroup(BUE_Anlage_V_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Ausschaltung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Ausschaltung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Ausschaltung(BUE_Ausschaltung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Bauart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Bauart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Bauart_TypeClass(BUE_Bauart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Bedien Anz Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Bedien Anz Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Bedien_Anz_Element_Allg_AttributeGroup(BUE_Bedien_Anz_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Bedien Anzeige Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Bedien Anzeige Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Bedien_Anzeige_Element(BUE_Bedien_Anzeige_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Buestra Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Buestra Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Buestra_TypeClass(BUE_Buestra_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Deckendes Signal Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Deckendes Signal Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Deckendes_Signal_Zuordnung(BUE_Deckendes_Signal_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Einschaltung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Einschaltung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Einschaltung(BUE_Einschaltung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Einschaltung Hp Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Einschaltung Hp Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Einschaltung_Hp_AttributeGroup(BUE_Einschaltung_Hp_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Einschaltung Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Einschaltung Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Einschaltung_Zuordnung(BUE_Einschaltung_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Funktionsueberwachung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Funktionsueberwachung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Funktionsueberwachung_TypeClass(BUE_Funktionsueberwachung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Gefahrraum Eckpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Gefahrraum Eckpunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Gefahrraum_Eckpunkt(BUE_Gefahrraum_Eckpunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup(BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Gleisbezogener Gefahrraum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Gleisbezogener Gefahrraum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Gleisbezogener_Gefahrraum(BUE_Gleisbezogener_Gefahrraum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Handschalteinrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Handschalteinrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Handschalteinrichtung_TypeClass(BUE_Handschalteinrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Kante(BUE_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Kreuzungsplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Kreuzungsplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Kreuzungsplan(BUE_Kreuzungsplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Kreuzungsplan Koordinaten Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Kreuzungsplan Koordinaten Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Kreuzungsplan_Koordinaten_AttributeGroup(BUE_Kreuzungsplan_Koordinaten_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Mit GFR Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Mit GFR Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Mit_GFR_TypeClass(BUE_Mit_GFR_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Nachlaufzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Nachlaufzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Nachlaufzeit_TypeClass(BUE_Nachlaufzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Neigung_TypeClass(BUE_Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Schnittstelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Schnittstelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Schnittstelle(BUE_Schnittstelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Schnittstelle Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Schnittstelle Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Schnittstelle_Allg_AttributeGroup(BUE_Schnittstelle_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Sicherungsart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Sicherungsart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Sicherungsart_TypeClass(BUE_Sicherungsart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Sicherungszeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Sicherungszeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Sicherungszeit_TypeClass(BUE_Sicherungszeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Spezifisches Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Spezifisches Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Spezifisches_Signal(BUE_Spezifisches_Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Strasse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Strasse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Strasse_TypeClass(BUE_Strasse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Technik Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Technik Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Technik_TypeClass(BUE_Technik_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE Vorlaufzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE Vorlaufzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_Vorlaufzeit_TypeClass(BUE_Vorlaufzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUE WS Fstr Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUE WS Fstr Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUE_WS_Fstr_Zuordnung(BUE_WS_Fstr_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einschaltverz Errechnet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einschaltverz Errechnet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinschaltverz_Errechnet_TypeClass(Einschaltverz_Errechnet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einschaltverz Gewaehlt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einschaltverz Gewaehlt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinschaltverz_Gewaehlt_TypeClass(Einschaltverz_Gewaehlt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ersatzstecker Gleisbezogen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ersatzstecker Gleisbezogen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErsatzstecker_Gleisbezogen_TypeClass(Ersatzstecker_Gleisbezogen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrbahn Befestigung Gleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrbahn Befestigung Gleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrbahn_Befestigung_Gleis_TypeClass(Fahrbahn_Befestigung_Gleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrbahn Befestigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrbahn Befestigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrbahn_Befestigung_TypeClass(Fahrbahn_Befestigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrbahn Breite Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrbahn Breite Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrbahn_Breite_TypeClass(Fahrbahn_Breite_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fue Schaltfall Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fue Schaltfall Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFue_Schaltfall_TypeClass(Fue_Schaltfall_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuss Radweg Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuss Radweg Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuss_Radweg_Art_TypeClass(Fuss_Radweg_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuss Radweg Seite Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuss Radweg Seite Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuss_Radweg_Seite_TypeClass(Fuss_Radweg_Seite_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Anlage(GFR_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Anlage Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Anlage Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Anlage_Allg_AttributeGroup(GFR_Anlage_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Art_TypeClass(GFR_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Element(GFR_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Element Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Element Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Element_Bezeichnung_AttributeGroup(GFR_Element_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Neigung_TypeClass(GFR_Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Tripelspiegel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Tripelspiegel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Tripelspiegel(GFR_Tripelspiegel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Tripelspiegel Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Tripelspiegel Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Tripelspiegel_Allg_AttributeGroup(GFR_Tripelspiegel_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Tripelspiegel Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Tripelspiegel Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Tripelspiegel_Bezeichnung_AttributeGroup(GFR_Tripelspiegel_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFR Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFR Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFR_Typ_TypeClass(GFR_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gitterbehang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gitterbehang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitterbehang_TypeClass(Gitterbehang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gleis Am Bue Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gleis Am Bue Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGleis_Am_Bue_TypeClass(Gleis_Am_Bue_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Haltezeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Haltezeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaltezeit_TypeClass(Haltezeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hersteller Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hersteller Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHersteller_TypeClass(Hersteller_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp Ersatzstecker Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp Ersatzstecker Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHp_Ersatzstecker_TypeClass(Hp_Ersatzstecker_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Klassifizierung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Klassifizierung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKlassifizierung_TypeClass(Klassifizierung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kontrastblende Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kontrastblende Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKontrastblende_TypeClass(Kontrastblende_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kreuzungswinkel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kreuzungswinkel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKreuzungswinkel_TypeClass(Kreuzungswinkel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kurzzugschaltung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kurzzugschaltung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKurzzugschaltung_TypeClass(Kurzzugschaltung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lagerung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lagerung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLagerung_Art_TypeClass(Lagerung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LFUE Impuls Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LFUE Impuls Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLFUE_Impuls_TypeClass(LFUE_Impuls_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lieferlaenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lieferlaenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLieferlaenge_TypeClass(Lieferlaenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Montage Ausgleichsgewichte Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Montage Ausgleichsgewichte Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMontage_Ausgleichsgewichte_TypeClass(Montage_Ausgleichsgewichte_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Montage Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Montage Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMontage_Besonders_TypeClass(Montage_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Montagehoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Montagehoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMontagehoehe_TypeClass(Montagehoehe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optik Durchmesser Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optik Durchmesser Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptik_Durchmesser_TypeClass(Optik_Durchmesser_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optik Symbolmaske Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optik Symbolmaske Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptik_Symbolmaske_TypeClass(Optik_Symbolmaske_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pegel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pegel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePegel_TypeClass(Pegel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pixel Koordinate XType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pixel Koordinate XType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePixel_Koordinate_X_TypeClass(Pixel_Koordinate_X_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pixel Koordinate YType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pixel Koordinate YType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePixel_Koordinate_Y_TypeClass(Pixel_Koordinate_Y_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raeumstrecke DAB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raeumstrecke DAB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaeumstrecke_DAB_TypeClass(Raeumstrecke_DAB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raeumstrecke DBK Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raeumstrecke DBK Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaeumstrecke_DBK_TypeClass(Raeumstrecke_DBK_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raeumstrecke DCK Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raeumstrecke DCK Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaeumstrecke_DCK_TypeClass(Raeumstrecke_DCK_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raeumstrecke DSK Strich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raeumstrecke DSK Strich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaeumstrecke_DSK_Strich_TypeClass(Raeumstrecke_DSK_Strich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raeumstrecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raeumstrecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaeumstrecke_TypeClass(Raeumstrecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Richtungspfeil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Richtungspfeil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichtungspfeil_TypeClass(Richtungspfeil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SA Schrankenbaum Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SA Schrankenbaum Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSA_Schrankenbaum_AttributeGroup(SA_Schrankenbaum_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schaltgruppe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schaltgruppe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchaltgruppe_TypeClass(Schaltgruppe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schaltmittel Fstr Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schaltmittel Fstr Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchaltmittel_Fstr_Zuordnung(Schaltmittel_Fstr_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schrankenantrieb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schrankenantrieb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchrankenantrieb(Schrankenantrieb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schrankenantrieb Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schrankenantrieb Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchrankenantrieb_Allg_AttributeGroup(Schrankenantrieb_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schrankenantrieb Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schrankenantrieb Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchrankenantrieb_Bezeichnung_AttributeGroup(Schrankenantrieb_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schutzbuegel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schutzbuegel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchutzbuegel_TypeClass(Schutzbuegel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sicherheitsabstand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sicherheitsabstand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSicherheitsabstand_TypeClass(Sicherheitsabstand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalverz Errechnet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalverz Errechnet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalverz_Errechnet_TypeClass(Signalverz_Errechnet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalverz Gewaehlt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalverz Gewaehlt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalverz_Gewaehlt_TypeClass(Signalverz_Gewaehlt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sperrlaenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sperrlaenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSperrlaenge_TypeClass(Sperrlaenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sperrstrecke Fussgaenger Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sperrstrecke Fussgaenger Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSperrstrecke_Fussgaenger_TypeClass(Sperrstrecke_Fussgaenger_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sperrstrecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sperrstrecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSperrstrecke_TypeClass(Sperrstrecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stoerhalt Haltfall Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stoerhalt Haltfall Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoerhalt_Haltfall_TypeClass(Stoerhalt_Haltfall_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stoerhalt Merkhinweis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stoerhalt Merkhinweis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoerhalt_Merkhinweis_TypeClass(Stoerhalt_Merkhinweis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teilsperrstrecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teilsperrstrecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeilsperrstrecke_TypeClass(Teilsperrstrecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teilvorgabezeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teilvorgabezeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeilvorgabezeit_TypeClass(Teilvorgabezeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tragkopf Verstellbar Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tragkopf Verstellbar Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTragkopf_Verstellbar_TypeClass(Tragkopf_Verstellbar_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMax Schiene Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMax Schiene Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Max_Schiene_TypeClass(V_Max_Schiene_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMax Strasse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMax Strasse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Max_Strasse_TypeClass(V_Max_Strasse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMin Fussweg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMin Fussweg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Min_Fussweg_TypeClass(V_Min_Fussweg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMin Schiene Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMin Schiene Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Min_Schiene_TypeClass(V_Min_Schiene_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMin Strasse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMin Strasse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Min_Strasse_TypeClass(V_Min_Strasse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkehrszeichen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkehrszeichen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkehrszeichen(Verkehrszeichen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkehrszeichen Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkehrszeichen Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkehrszeichen_Allg_AttributeGroup(Verkehrszeichen_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkehrszeichen Andreaskreuz Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkehrszeichen Andreaskreuz Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkehrszeichen_Andreaskreuz_AttributeGroup(Verkehrszeichen_Andreaskreuz_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkehrszeichen Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkehrszeichen Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkehrszeichen_Bezeichnung_AttributeGroup(Verkehrszeichen_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verkehrszeichen Lz Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verkehrszeichen Lz Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerkehrszeichen_Lz_AttributeGroup(Verkehrszeichen_Lz_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorgeschaltet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorgeschaltet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorgeschaltet_TypeClass(Vorgeschaltet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVz_Sperrstrecke_AttributeGroup(Vz_Sperrstrecke_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Schranke Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Schranke Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVz_Sperrstrecke_Schranke_AttributeGroup(Vz_Sperrstrecke_Schranke_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vz Sperrstrecke Vorgeschaltet Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVz_Sperrstrecke_Vorgeschaltet_AttributeGroup(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winkel Alpha Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winkel Alpha Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWinkel_Alpha_TypeClass(Winkel_Alpha_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zeitueberschreitungsmeldung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeitueberschreitungsmeldung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeitueberschreitungsmeldung_TypeClass(Zeitueberschreitungsmeldung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zusatzschild Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zusatzschild Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZusatzschild_TypeClass(Zusatzschild_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis_Objekt(Basis_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt(Punkt_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBereich_Objekt(Bereich_Objekt object) {
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

} //BahnuebergangSwitch
