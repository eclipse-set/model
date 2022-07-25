/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.Ansteuerung_Element.*;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

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
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage
 * @generated
 */
public class Ansteuerung_ElementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ansteuerung_ElementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansteuerung_ElementSwitch() {
		if (modelPackage == null) {
			modelPackage = Ansteuerung_ElementPackage.eINSTANCE;
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
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP: {
				AEA_Allg_AttributeGroup aeA_Allg_AttributeGroup = (AEA_Allg_AttributeGroup)theEObject;
				T result = caseAEA_Allg_AttributeGroup(aeA_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP: {
				AEA_Energieversorgung_AttributeGroup aeA_Energieversorgung_AttributeGroup = (AEA_Energieversorgung_AttributeGroup)theEObject;
				T result = caseAEA_Energieversorgung_AttributeGroup(aeA_Energieversorgung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: {
				AEA_GFK_IP_Adressblock_AttributeGroup aeA_GFK_IP_Adressblock_AttributeGroup = (AEA_GFK_IP_Adressblock_AttributeGroup)theEObject;
				T result = caseAEA_GFK_IP_Adressblock_AttributeGroup(aeA_GFK_IP_Adressblock_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG: {
				Aussenelementansteuerung aussenelementansteuerung = (Aussenelementansteuerung)theEObject;
				T result = caseAussenelementansteuerung(aussenelementansteuerung);
				if (result == null) result = caseBasis_Objekt(aussenelementansteuerung);
				if (result == null) result = caseUr_Objekt(aussenelementansteuerung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_ART_TYPE_CLASS: {
				Aussenelementansteuerung_Art_TypeClass aussenelementansteuerung_Art_TypeClass = (Aussenelementansteuerung_Art_TypeClass)theEObject;
				T result = caseAussenelementansteuerung_Art_TypeClass(aussenelementansteuerung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(aussenelementansteuerung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Aussenelementansteuerung_Bezeichnung_AttributeGroup aussenelementansteuerung_Bezeichnung_AttributeGroup = (Aussenelementansteuerung_Bezeichnung_AttributeGroup)theEObject;
				T result = caseAussenelementansteuerung_Bezeichnung_AttributeGroup(aussenelementansteuerung_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.BANDBREITE_TYPE_CLASS: {
				Bandbreite_TypeClass bandbreite_TypeClass = (Bandbreite_TypeClass)theEObject;
				T result = caseBandbreite_TypeClass(bandbreite_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bandbreite_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS: {
				Bauart_TypeClass bauart_TypeClass = (Bauart_TypeClass)theEObject;
				T result = caseBauart_TypeClass(bauart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bauart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE_CLASS: {
				Bezeichnung_AEA_TypeClass bezeichnung_AEA_TypeClass = (Bezeichnung_AEA_TypeClass)theEObject;
				T result = caseBezeichnung_AEA_TypeClass(bezeichnung_AEA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_AEA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE_CLASS: {
				Bezeichnung_ESTW_ZE_TypeClass bezeichnung_ESTW_ZE_TypeClass = (Bezeichnung_ESTW_ZE_TypeClass)theEObject;
				T result = caseBezeichnung_ESTW_ZE_TypeClass(bezeichnung_ESTW_ZE_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_ESTW_ZE_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE_CLASS: {
				Bezeichnung_TSO_TypeClass bezeichnung_TSO_TypeClass = (Bezeichnung_TSO_TypeClass)theEObject;
				T result = caseBezeichnung_TSO_TypeClass(bezeichnung_TSO_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_TSO_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_ERSATZ_TYPE_CLASS: {
				Energieversorgung_Art_Ersatz_TypeClass energieversorgung_Art_Ersatz_TypeClass = (Energieversorgung_Art_Ersatz_TypeClass)theEObject;
				T result = caseEnergieversorgung_Art_Ersatz_TypeClass(energieversorgung_Art_Ersatz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(energieversorgung_Art_Ersatz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_TYPE_CLASS: {
				Energieversorgung_Art_TypeClass energieversorgung_Art_TypeClass = (Energieversorgung_Art_TypeClass)theEObject;
				T result = caseEnergieversorgung_Art_TypeClass(energieversorgung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(energieversorgung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT: {
				ESTW_Zentraleinheit estW_Zentraleinheit = (ESTW_Zentraleinheit)theEObject;
				T result = caseESTW_Zentraleinheit(estW_Zentraleinheit);
				if (result == null) result = caseBasis_Objekt(estW_Zentraleinheit);
				if (result == null) result = caseUr_Objekt(estW_Zentraleinheit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP: {
				ESTW_Zentraleinheit_Allg_AttributeGroup estW_Zentraleinheit_Allg_AttributeGroup = (ESTW_Zentraleinheit_Allg_AttributeGroup)theEObject;
				T result = caseESTW_Zentraleinheit_Allg_AttributeGroup(estW_Zentraleinheit_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ESTW_Zentraleinheit_Bezeichnung_AttributeGroup estW_Zentraleinheit_Bezeichnung_AttributeGroup = (ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)theEObject;
				T result = caseESTW_Zentraleinheit_Bezeichnung_AttributeGroup(estW_Zentraleinheit_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.GFK_KATEGORIE_TYPE_CLASS: {
				GFK_Kategorie_TypeClass gfK_Kategorie_TypeClass = (GFK_Kategorie_TypeClass)theEObject;
				T result = caseGFK_Kategorie_TypeClass(gfK_Kategorie_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gfK_Kategorie_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.HERSTELLER_TYPE_CLASS: {
				Hersteller_TypeClass hersteller_TypeClass = (Hersteller_TypeClass)theEObject;
				T result = caseHersteller_TypeClass(hersteller_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hersteller_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS: {
				IP_Adressblock_Blau_TypeClass iP_Adressblock_Blau_TypeClass = (IP_Adressblock_Blau_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_TypeClass(iP_Adressblock_Blau_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS: {
				IP_Adressblock_Blau_V4_TypeClass iP_Adressblock_Blau_V4_TypeClass = (IP_Adressblock_Blau_V4_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_V4_TypeClass(iP_Adressblock_Blau_V4_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_V4_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS: {
				IP_Adressblock_Blau_V6_TypeClass iP_Adressblock_Blau_V6_TypeClass = (IP_Adressblock_Blau_V6_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_V6_TypeClass(iP_Adressblock_Blau_V6_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_V6_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS: {
				IP_Adressblock_Grau_TypeClass iP_Adressblock_Grau_TypeClass = (IP_Adressblock_Grau_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_TypeClass(iP_Adressblock_Grau_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS: {
				IP_Adressblock_Grau_V4_TypeClass iP_Adressblock_Grau_V4_TypeClass = (IP_Adressblock_Grau_V4_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_V4_TypeClass(iP_Adressblock_Grau_V4_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_V4_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS: {
				IP_Adressblock_Grau_V6_TypeClass iP_Adressblock_Grau_V6_TypeClass = (IP_Adressblock_Grau_V6_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_V6_TypeClass(iP_Adressblock_Grau_V6_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_V6_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.MEDIUM_ART_TYPE_CLASS: {
				Medium_Art_TypeClass medium_Art_TypeClass = (Medium_Art_TypeClass)theEObject;
				T result = caseMedium_Art_TypeClass(medium_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(medium_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.NETZ_ART_TYPE_CLASS: {
				Netz_Art_TypeClass netz_Art_TypeClass = (Netz_Art_TypeClass)theEObject;
				T result = caseNetz_Art_TypeClass(netz_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(netz_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.REGIONALBEREICH_TYPE_CLASS: {
				Regionalbereich_TypeClass regionalbereich_TypeClass = (Regionalbereich_TypeClass)theEObject;
				T result = caseRegionalbereich_TypeClass(regionalbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(regionalbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE_CLASS: {
				Standort_Beschreibung_TypeClass standort_Beschreibung_TypeClass = (Standort_Beschreibung_TypeClass)theEObject;
				T result = caseStandort_Beschreibung_TypeClass(standort_Beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(standort_Beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.STELL_BEREICH: {
				Stell_Bereich stell_Bereich = (Stell_Bereich)theEObject;
				T result = caseStell_Bereich(stell_Bereich);
				if (result == null) result = caseBereich_Objekt(stell_Bereich);
				if (result == null) result = caseBasis_Objekt(stell_Bereich);
				if (result == null) result = caseUr_Objekt(stell_Bereich);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.STELLELEMENT: {
				Stellelement stellelement = (Stellelement)theEObject;
				T result = caseStellelement(stellelement);
				if (result == null) result = caseBasis_Objekt(stellelement);
				if (result == null) result = caseUr_Objekt(stellelement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TECHNIK_ART_TYPE_CLASS: {
				Technik_Art_TypeClass technik_Art_TypeClass = (Technik_Art_TypeClass)theEObject;
				T result = caseTechnik_Art_TypeClass(technik_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(technik_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE_CLASS: {
				Technik_Beschreibung_TypeClass technik_Beschreibung_TypeClass = (Technik_Beschreibung_TypeClass)theEObject;
				T result = caseTechnik_Beschreibung_TypeClass(technik_Beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(technik_Beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT: {
				Technik_Standort technik_Standort = (Technik_Standort)theEObject;
				T result = caseTechnik_Standort(technik_Standort);
				if (result == null) result = caseBasis_Objekt(technik_Standort);
				if (result == null) result = caseUr_Objekt(technik_Standort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Technik_Standort_Bezeichnung_AttributeGroup technik_Standort_Bezeichnung_AttributeGroup = (Technik_Standort_Bezeichnung_AttributeGroup)theEObject;
				T result = caseTechnik_Standort_Bezeichnung_AttributeGroup(technik_Standort_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP: {
				TSO_IP_AB_Teilsystem_AttributeGroup tsO_IP_AB_Teilsystem_AttributeGroup = (TSO_IP_AB_Teilsystem_AttributeGroup)theEObject;
				T result = caseTSO_IP_AB_Teilsystem_AttributeGroup(tsO_IP_AB_Teilsystem_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: {
				TSO_IP_Adressblock_AttributeGroup tsO_IP_Adressblock_AttributeGroup = (TSO_IP_Adressblock_AttributeGroup)theEObject;
				T result = caseTSO_IP_Adressblock_AttributeGroup(tsO_IP_Adressblock_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.TSO_TEILSYSTEM_ART_TYPE_CLASS: {
				TSO_Teilsystem_Art_TypeClass tsO_Teilsystem_Art_TypeClass = (TSO_Teilsystem_Art_TypeClass)theEObject;
				T result = caseTSO_Teilsystem_Art_TypeClass(tsO_Teilsystem_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tsO_Teilsystem_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG: {
				Uebertragungsweg uebertragungsweg = (Uebertragungsweg)theEObject;
				T result = caseUebertragungsweg(uebertragungsweg);
				if (result == null) result = caseBasis_Objekt(uebertragungsweg);
				if (result == null) result = caseUr_Objekt(uebertragungsweg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_ART_TYPE_CLASS: {
				Uebertragungsweg_Art_TypeClass uebertragungsweg_Art_TypeClass = (Uebertragungsweg_Art_TypeClass)theEObject;
				T result = caseUebertragungsweg_Art_TypeClass(uebertragungsweg_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(uebertragungsweg_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP: {
				Uebertragungsweg_Technik_AttributeGroup uebertragungsweg_Technik_AttributeGroup = (Uebertragungsweg_Technik_AttributeGroup)theEObject;
				T result = caseUebertragungsweg_Technik_AttributeGroup(uebertragungsweg_Technik_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UNTERBRINGUNG: {
				Unterbringung unterbringung = (Unterbringung)theEObject;
				T result = caseUnterbringung(unterbringung);
				if (result == null) result = caseBasis_Objekt(unterbringung);
				if (result == null) result = caseUr_Objekt(unterbringung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP: {
				Unterbringung_Allg_AttributeGroup unterbringung_Allg_AttributeGroup = (Unterbringung_Allg_AttributeGroup)theEObject;
				T result = caseUnterbringung_Allg_AttributeGroup(unterbringung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ART_TYPE_CLASS: {
				Unterbringung_Art_TypeClass unterbringung_Art_TypeClass = (Unterbringung_Art_TypeClass)theEObject;
				T result = caseUnterbringung_Art_TypeClass(unterbringung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(unterbringung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_BEFESTIGUNG_TYPE_CLASS: {
				Unterbringung_Befestigung_TypeClass unterbringung_Befestigung_TypeClass = (Unterbringung_Befestigung_TypeClass)theEObject;
				T result = caseUnterbringung_Befestigung_TypeClass(unterbringung_Befestigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(unterbringung_Befestigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEA Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEA Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEA_Allg_AttributeGroup(AEA_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEA Energieversorgung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEA Energieversorgung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEA_Energieversorgung_AttributeGroup(AEA_Energieversorgung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEA GFK IP Adressblock Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEA GFK IP Adressblock Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEA_GFK_IP_Adressblock_AttributeGroup(AEA_GFK_IP_Adressblock_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussenelementansteuerung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussenelementansteuerung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussenelementansteuerung(Aussenelementansteuerung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussenelementansteuerung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussenelementansteuerung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussenelementansteuerung_Art_TypeClass(Aussenelementansteuerung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aussenelementansteuerung Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aussenelementansteuerung Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAussenelementansteuerung_Bezeichnung_AttributeGroup(Aussenelementansteuerung_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bandbreite Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bandbreite Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandbreite_TypeClass(Bandbreite_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bauart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bauart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBauart_TypeClass(Bauart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung AEA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung AEA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_AEA_TypeClass(Bezeichnung_AEA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung ESTW ZE Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung ESTW ZE Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_ESTW_ZE_TypeClass(Bezeichnung_ESTW_ZE_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung TSO Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung TSO Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_TSO_TypeClass(Bezeichnung_TSO_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energieversorgung Art Ersatz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energieversorgung Art Ersatz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergieversorgung_Art_Ersatz_TypeClass(Energieversorgung_Art_Ersatz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energieversorgung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energieversorgung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergieversorgung_Art_TypeClass(Energieversorgung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESTW_Zentraleinheit(ESTW_Zentraleinheit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESTW_Zentraleinheit_Allg_AttributeGroup(ESTW_Zentraleinheit_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESTW Zentraleinheit Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESTW_Zentraleinheit_Bezeichnung_AttributeGroup(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GFK Kategorie Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GFK Kategorie Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGFK_Kategorie_TypeClass(GFK_Kategorie_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Blau Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Blau Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Blau_TypeClass(IP_Adressblock_Blau_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Blau V4 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Blau V4 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Blau_V4_TypeClass(IP_Adressblock_Blau_V4_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Blau V6 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Blau V6 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Blau_V6_TypeClass(IP_Adressblock_Blau_V6_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Grau Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Grau Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Grau_TypeClass(IP_Adressblock_Grau_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Grau V4 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Grau V4 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Grau_V4_TypeClass(IP_Adressblock_Grau_V4_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adressblock Grau V6 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adressblock Grau V6 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adressblock_Grau_V6_TypeClass(IP_Adressblock_Grau_V6_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedium_Art_TypeClass(Medium_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Netz Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Netz Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetz_Art_TypeClass(Netz_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regionalbereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regionalbereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalbereich_TypeClass(Regionalbereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standort Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standort Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandort_Beschreibung_TypeClass(Standort_Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stell Bereich</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stell Bereich</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStell_Bereich(Stell_Bereich object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stellelement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stellelement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStellelement(Stellelement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technik Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technik Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnik_Art_TypeClass(Technik_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technik Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technik Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnik_Beschreibung_TypeClass(Technik_Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technik Standort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technik Standort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnik_Standort(Technik_Standort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technik Standort Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technik Standort Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnik_Standort_Bezeichnung_AttributeGroup(Technik_Standort_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSO IP AB Teilsystem Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSO IP AB Teilsystem Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSO_IP_AB_Teilsystem_AttributeGroup(TSO_IP_AB_Teilsystem_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSO IP Adressblock Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSO IP Adressblock Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSO_IP_Adressblock_AttributeGroup(TSO_IP_Adressblock_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSO Teilsystem Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSO Teilsystem Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSO_Teilsystem_Art_TypeClass(TSO_Teilsystem_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uebertragungsweg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uebertragungsweg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUebertragungsweg(Uebertragungsweg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uebertragungsweg Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uebertragungsweg Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUebertragungsweg_Art_TypeClass(Uebertragungsweg_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uebertragungsweg Technik Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uebertragungsweg Technik Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUebertragungsweg_Technik_AttributeGroup(Uebertragungsweg_Technik_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterbringung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterbringung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterbringung(Unterbringung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterbringung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterbringung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterbringung_Allg_AttributeGroup(Unterbringung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterbringung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterbringung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterbringung_Art_TypeClass(Unterbringung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterbringung Befestigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterbringung Befestigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterbringung_Befestigung_TypeClass(Unterbringung_Befestigung_TypeClass object) {
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

} //Ansteuerung_ElementSwitch
