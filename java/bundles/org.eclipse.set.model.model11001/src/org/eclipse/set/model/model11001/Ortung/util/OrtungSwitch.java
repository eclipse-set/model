/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Ortung.*;

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
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage
 * @generated
 */
public class OrtungSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrtungPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrtungSwitch() {
		if (modelPackage == null) {
			modelPackage = OrtungPackage.eINSTANCE;
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
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE_CLASS: {
				Bettungswiderstand_TypeClass bettungswiderstand_TypeClass = (Bettungswiderstand_TypeClass)theEObject;
				T result = caseBettungswiderstand_TypeClass(bettungswiderstand_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bettungswiderstand_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS: {
				Bezeichnung_Kennbuchstabe_TypeClass bezeichnung_Kennbuchstabe_TypeClass = (Bezeichnung_Kennbuchstabe_TypeClass)theEObject;
				T result = caseBezeichnung_Kennbuchstabe_TypeClass(bezeichnung_Kennbuchstabe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Kennbuchstabe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE: {
				FMA_Anlage fmA_Anlage = (FMA_Anlage)theEObject;
				T result = caseFMA_Anlage(fmA_Anlage);
				if (result == null) result = caseBasis_Objekt(fmA_Anlage);
				if (result == null) result = caseUr_Objekt(fmA_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP: {
				FMA_Anlage_Allg_AttributeGroup fmA_Anlage_Allg_AttributeGroup = (FMA_Anlage_Allg_AttributeGroup)theEObject;
				T result = caseFMA_Anlage_Allg_AttributeGroup(fmA_Anlage_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				FMA_Anlage_Bezeichnung_AttributeGroup fmA_Anlage_Bezeichnung_AttributeGroup = (FMA_Anlage_Bezeichnung_AttributeGroup)theEObject;
				T result = caseFMA_Anlage_Bezeichnung_AttributeGroup(fmA_Anlage_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP: {
				FMA_Anlage_Elektr_Merkmale_AttributeGroup fmA_Anlage_Elektr_Merkmale_AttributeGroup = (FMA_Anlage_Elektr_Merkmale_AttributeGroup)theEObject;
				T result = caseFMA_Anlage_Elektr_Merkmale_AttributeGroup(fmA_Anlage_Elektr_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP: {
				FMA_Anlage_Kaskade_AttributeGroup fmA_Anlage_Kaskade_AttributeGroup = (FMA_Anlage_Kaskade_AttributeGroup)theEObject;
				T result = caseFMA_Anlage_Kaskade_AttributeGroup(fmA_Anlage_Kaskade_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP: {
				FMA_Anlage_Uebertragung_FMinfo_AttributeGroup fmA_Anlage_Uebertragung_FMinfo_AttributeGroup = (FMA_Anlage_Uebertragung_FMinfo_AttributeGroup)theEObject;
				T result = caseFMA_Anlage_Uebertragung_FMinfo_AttributeGroup(fmA_Anlage_Uebertragung_FMinfo_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS: {
				FMA_Anschluss_Bezeichnung_TypeClass fmA_Anschluss_Bezeichnung_TypeClass = (FMA_Anschluss_Bezeichnung_TypeClass)theEObject;
				T result = caseFMA_Anschluss_Bezeichnung_TypeClass(fmA_Anschluss_Bezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Anschluss_Bezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS: {
				FMA_Anschluss_Speiserichtung_TypeClass fmA_Anschluss_Speiserichtung_TypeClass = (FMA_Anschluss_Speiserichtung_TypeClass)theEObject;
				T result = caseFMA_Anschluss_Speiserichtung_TypeClass(fmA_Anschluss_Speiserichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Anschluss_Speiserichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ART_TYPE_CLASS: {
				FMA_Art_TypeClass fmA_Art_TypeClass = (FMA_Art_TypeClass)theEObject;
				T result = caseFMA_Art_TypeClass(fmA_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT: {
				FMA_Element fmA_Element = (FMA_Element)theEObject;
				T result = caseFMA_Element(fmA_Element);
				if (result == null) result = casePunkt_Objekt(fmA_Element);
				if (result == null) result = caseBasis_Objekt(fmA_Element);
				if (result == null) result = caseUr_Objekt(fmA_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				FMA_Element_Allg_AttributeGroup fmA_Element_Allg_AttributeGroup = (FMA_Element_Allg_AttributeGroup)theEObject;
				T result = caseFMA_Element_Allg_AttributeGroup(fmA_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP: {
				FMA_Element_Anschluss_AttributeGroup fmA_Element_Anschluss_AttributeGroup = (FMA_Element_Anschluss_AttributeGroup)theEObject;
				T result = caseFMA_Element_Anschluss_AttributeGroup(fmA_Element_Anschluss_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT_ART_TYPE_CLASS: {
				FMA_Element_Art_TypeClass fmA_Element_Art_TypeClass = (FMA_Element_Art_TypeClass)theEObject;
				T result = caseFMA_Element_Art_TypeClass(fmA_Element_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Element_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT_SEILANZAHL_TYPE_CLASS: {
				FMA_Element_Seilanzahl_TypeClass fmA_Element_Seilanzahl_TypeClass = (FMA_Element_Seilanzahl_TypeClass)theEObject;
				T result = caseFMA_Element_Seilanzahl_TypeClass(fmA_Element_Seilanzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Element_Seilanzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE_CLASS: {
				FMA_Element_Seiltyp_TypeClass fmA_Element_Seiltyp_TypeClass = (FMA_Element_Seiltyp_TypeClass)theEObject;
				T result = caseFMA_Element_Seiltyp_TypeClass(fmA_Element_Seiltyp_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Element_Seiltyp_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_HILFFREIMELDUNG_TYPE_CLASS: {
				FMA_Hilffreimeldung_TypeClass fmA_Hilffreimeldung_TypeClass = (FMA_Hilffreimeldung_TypeClass)theEObject;
				T result = caseFMA_Hilffreimeldung_TypeClass(fmA_Hilffreimeldung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Hilffreimeldung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_ISOLIERUNG_TYPE_CLASS: {
				FMA_Isolierung_TypeClass fmA_Isolierung_TypeClass = (FMA_Isolierung_TypeClass)theEObject;
				T result = caseFMA_Isolierung_TypeClass(fmA_Isolierung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Isolierung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS: {
				FMA_Kaskade_Bezeichnung_TypeClass fmA_Kaskade_Bezeichnung_TypeClass = (FMA_Kaskade_Bezeichnung_TypeClass)theEObject;
				T result = caseFMA_Kaskade_Bezeichnung_TypeClass(fmA_Kaskade_Bezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Kaskade_Bezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS: {
				FMA_Kaskade_Einzelauswertung_TypeClass fmA_Kaskade_Einzelauswertung_TypeClass = (FMA_Kaskade_Einzelauswertung_TypeClass)theEObject;
				T result = caseFMA_Kaskade_Einzelauswertung_TypeClass(fmA_Kaskade_Einzelauswertung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Kaskade_Einzelauswertung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE: {
				FMA_Komponente fmA_Komponente = (FMA_Komponente)theEObject;
				T result = caseFMA_Komponente(fmA_Komponente);
				if (result == null) result = casePunkt_Objekt(fmA_Komponente);
				if (result == null) result = caseBasis_Objekt(fmA_Komponente);
				if (result == null) result = caseUr_Objekt(fmA_Komponente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP: {
				FMA_Komponente_Achszaehlpunkt_AttributeGroup fmA_Komponente_Achszaehlpunkt_AttributeGroup = (FMA_Komponente_Achszaehlpunkt_AttributeGroup)theEObject;
				T result = caseFMA_Komponente_Achszaehlpunkt_AttributeGroup(fmA_Komponente_Achszaehlpunkt_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE_ART_TYPE_CLASS: {
				FMA_Komponente_Art_TypeClass fmA_Komponente_Art_TypeClass = (FMA_Komponente_Art_TypeClass)theEObject;
				T result = caseFMA_Komponente_Art_TypeClass(fmA_Komponente_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Komponente_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS: {
				FMA_Komponente_Schienenprofil_TypeClass fmA_Komponente_Schienenprofil_TypeClass = (FMA_Komponente_Schienenprofil_TypeClass)theEObject;
				T result = caseFMA_Komponente_Schienenprofil_TypeClass(fmA_Komponente_Schienenprofil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Komponente_Schienenprofil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS: {
				FMA_Komponente_Stromversorgung_TypeClass fmA_Komponente_Stromversorgung_TypeClass = (FMA_Komponente_Stromversorgung_TypeClass)theEObject;
				T result = caseFMA_Komponente_Stromversorgung_TypeClass(fmA_Komponente_Stromversorgung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Komponente_Stromversorgung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE_CLASS: {
				FMA_Komponente_Typ_TypeClass fmA_Komponente_Typ_TypeClass = (FMA_Komponente_Typ_TypeClass)theEObject;
				T result = caseFMA_Komponente_Typ_TypeClass(fmA_Komponente_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Komponente_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE_CLASS: {
				FMA_Laenge_Beeinflusst_TypeClass fmA_Laenge_Beeinflusst_TypeClass = (FMA_Laenge_Beeinflusst_TypeClass)theEObject;
				T result = caseFMA_Laenge_Beeinflusst_TypeClass(fmA_Laenge_Beeinflusst_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_Beeinflusst_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_E1_TYPE_CLASS: {
				FMA_Laenge_E1_TypeClass fmA_Laenge_E1_TypeClass = (FMA_Laenge_E1_TypeClass)theEObject;
				T result = caseFMA_Laenge_E1_TypeClass(fmA_Laenge_E1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_E1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_E2_TYPE_CLASS: {
				FMA_Laenge_E2_TypeClass fmA_Laenge_E2_TypeClass = (FMA_Laenge_E2_TypeClass)theEObject;
				T result = caseFMA_Laenge_E2_TypeClass(fmA_Laenge_E2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_E2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_E3_TYPE_CLASS: {
				FMA_Laenge_E3_TypeClass fmA_Laenge_E3_TypeClass = (FMA_Laenge_E3_TypeClass)theEObject;
				T result = caseFMA_Laenge_E3_TypeClass(fmA_Laenge_E3_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_E3_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_STYPE_CLASS: {
				FMA_Laenge_S_TypeClass fmA_Laenge_S_TypeClass = (FMA_Laenge_S_TypeClass)theEObject;
				T result = caseFMA_Laenge_S_TypeClass(fmA_Laenge_S_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_S_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_LAENGE_TYPE_CLASS: {
				FMA_Laenge_TypeClass fmA_Laenge_TypeClass = (FMA_Laenge_TypeClass)theEObject;
				T result = caseFMA_Laenge_TypeClass(fmA_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.FMA_TYP_TYPE_CLASS: {
				FMA_Typ_TypeClass fmA_Typ_TypeClass = (FMA_Typ_TypeClass)theEObject;
				T result = caseFMA_Typ_TypeClass(fmA_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fmA_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.SCHALTMITTEL_FUNKTION_TYPE_CLASS: {
				Schaltmittel_Funktion_TypeClass schaltmittel_Funktion_TypeClass = (Schaltmittel_Funktion_TypeClass)theEObject;
				T result = caseSchaltmittel_Funktion_TypeClass(schaltmittel_Funktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schaltmittel_Funktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG: {
				Schaltmittel_Zuordnung schaltmittel_Zuordnung = (Schaltmittel_Zuordnung)theEObject;
				T result = caseSchaltmittel_Zuordnung(schaltmittel_Zuordnung);
				if (result == null) result = caseBasis_Objekt(schaltmittel_Zuordnung);
				if (result == null) result = caseUr_Objekt(schaltmittel_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS: {
				Uebertragung_FMinfo_Richtung_TypeClass uebertragung_FMinfo_Richtung_TypeClass = (Uebertragung_FMinfo_Richtung_TypeClass)theEObject;
				T result = caseUebertragung_FMinfo_Richtung_TypeClass(uebertragung_FMinfo_Richtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(uebertragung_FMinfo_Richtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS: {
				Uebertragung_FMinfo_Typ_TypeClass uebertragung_FMinfo_Typ_TypeClass = (Uebertragung_FMinfo_Typ_TypeClass)theEObject;
				T result = caseUebertragung_FMinfo_Typ_TypeClass(uebertragung_FMinfo_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(uebertragung_FMinfo_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.ZUGEINWIRKUNG: {
				Zugeinwirkung zugeinwirkung = (Zugeinwirkung)theEObject;
				T result = caseZugeinwirkung(zugeinwirkung);
				if (result == null) result = casePunkt_Objekt(zugeinwirkung);
				if (result == null) result = caseBasis_Objekt(zugeinwirkung);
				if (result == null) result = caseUr_Objekt(zugeinwirkung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP: {
				Zugeinwirkung_Allg_AttributeGroup zugeinwirkung_Allg_AttributeGroup = (Zugeinwirkung_Allg_AttributeGroup)theEObject;
				T result = caseZugeinwirkung_Allg_AttributeGroup(zugeinwirkung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.ZUGEINWIRKUNG_ART_TYPE_CLASS: {
				Zugeinwirkung_Art_TypeClass zugeinwirkung_Art_TypeClass = (Zugeinwirkung_Art_TypeClass)theEObject;
				T result = caseZugeinwirkung_Art_TypeClass(zugeinwirkung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zugeinwirkung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE_CLASS: {
				Zugeinwirkung_Typ_TypeClass zugeinwirkung_Typ_TypeClass = (Zugeinwirkung_Typ_TypeClass)theEObject;
				T result = caseZugeinwirkung_Typ_TypeClass(zugeinwirkung_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zugeinwirkung_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bettungswiderstand Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bettungswiderstand Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBettungswiderstand_TypeClass(Bettungswiderstand_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Kennbuchstabe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Kennbuchstabe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Kennbuchstabe_TypeClass(Bezeichnung_Kennbuchstabe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage(FMA_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage_Allg_AttributeGroup(FMA_Anlage_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage_Bezeichnung_AttributeGroup(FMA_Anlage_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage Elektr Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage Elektr Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage_Elektr_Merkmale_AttributeGroup(FMA_Anlage_Elektr_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage Kaskade Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage Kaskade Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage_Kaskade_AttributeGroup(FMA_Anlage_Kaskade_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anlage Uebertragung FMinfo Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anlage Uebertragung FMinfo Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anlage_Uebertragung_FMinfo_AttributeGroup(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anschluss Bezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anschluss Bezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anschluss_Bezeichnung_TypeClass(FMA_Anschluss_Bezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Anschluss Speiserichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Anschluss Speiserichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Anschluss_Speiserichtung_TypeClass(FMA_Anschluss_Speiserichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Art_TypeClass(FMA_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element(FMA_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element_Allg_AttributeGroup(FMA_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element Anschluss Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element Anschluss Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element_Anschluss_AttributeGroup(FMA_Element_Anschluss_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element_Art_TypeClass(FMA_Element_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element Seilanzahl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element Seilanzahl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element_Seilanzahl_TypeClass(FMA_Element_Seilanzahl_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Element Seiltyp Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Element Seiltyp Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Element_Seiltyp_TypeClass(FMA_Element_Seiltyp_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Hilffreimeldung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Hilffreimeldung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Hilffreimeldung_TypeClass(FMA_Hilffreimeldung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Isolierung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Isolierung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Isolierung_TypeClass(FMA_Isolierung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Kaskade Bezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Kaskade Bezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Kaskade_Bezeichnung_TypeClass(FMA_Kaskade_Bezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Kaskade Einzelauswertung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Kaskade Einzelauswertung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Kaskade_Einzelauswertung_TypeClass(FMA_Kaskade_Einzelauswertung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente(FMA_Komponente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente Achszaehlpunkt Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente Achszaehlpunkt Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente_Achszaehlpunkt_AttributeGroup(FMA_Komponente_Achszaehlpunkt_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente_Art_TypeClass(FMA_Komponente_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente Schienenprofil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente Schienenprofil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente_Schienenprofil_TypeClass(FMA_Komponente_Schienenprofil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente Stromversorgung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente Stromversorgung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente_Stromversorgung_TypeClass(FMA_Komponente_Stromversorgung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Komponente Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Komponente Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Komponente_Typ_TypeClass(FMA_Komponente_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge Beeinflusst Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge Beeinflusst Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_Beeinflusst_TypeClass(FMA_Laenge_Beeinflusst_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge E1 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge E1 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_E1_TypeClass(FMA_Laenge_E1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge E2 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge E2 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_E2_TypeClass(FMA_Laenge_E2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge E3 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge E3 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_E3_TypeClass(FMA_Laenge_E3_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge SType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge SType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_S_TypeClass(FMA_Laenge_S_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Laenge_TypeClass(FMA_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMA Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMA Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMA_Typ_TypeClass(FMA_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schaltmittel Funktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schaltmittel Funktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchaltmittel_Funktion_TypeClass(Schaltmittel_Funktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schaltmittel Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schaltmittel Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchaltmittel_Zuordnung(Schaltmittel_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uebertragung FMinfo Richtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uebertragung FMinfo Richtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUebertragung_FMinfo_Richtung_TypeClass(Uebertragung_FMinfo_Richtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uebertragung FMinfo Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uebertragung FMinfo Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUebertragung_FMinfo_Typ_TypeClass(Uebertragung_FMinfo_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugeinwirkung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugeinwirkung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugeinwirkung(Zugeinwirkung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugeinwirkung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugeinwirkung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugeinwirkung_Allg_AttributeGroup(Zugeinwirkung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugeinwirkung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugeinwirkung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugeinwirkung_Art_TypeClass(Zugeinwirkung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugeinwirkung Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugeinwirkung Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugeinwirkung_Typ_TypeClass(Zugeinwirkung_Typ_TypeClass object) {
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

} //OrtungSwitch
