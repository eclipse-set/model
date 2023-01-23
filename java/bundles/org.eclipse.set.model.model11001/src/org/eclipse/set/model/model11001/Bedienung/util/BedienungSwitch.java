/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Bedienung.*;

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
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage
 * @generated
 */
public class BedienungSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BedienungPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedienungSwitch() {
		if (modelPackage == null) {
			modelPackage = BedienungPackage.eINSTANCE;
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
			case BedienungPackage.AWERT_TYPE_CLASS: {
				A_Wert_TypeClass a_Wert_TypeClass = (A_Wert_TypeClass)theEObject;
				T result = caseA_Wert_TypeClass(a_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(a_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.ANBINDUNG_IB2_TYPE_CLASS: {
				Anbindung_IB2_TypeClass anbindung_IB2_TypeClass = (Anbindung_IB2_TypeClass)theEObject;
				T result = caseAnbindung_IB2_TypeClass(anbindung_IB2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anbindung_IB2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.ANBINDUNG_IB3_TYPE_CLASS: {
				Anbindung_IB3_TypeClass anbindung_IB3_TypeClass = (Anbindung_IB3_TypeClass)theEObject;
				T result = caseAnbindung_IB3_TypeClass(anbindung_IB3_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anbindung_IB3_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BWERT_TYPE_CLASS: {
				B_Wert_TypeClass b_Wert_TypeClass = (B_Wert_TypeClass)theEObject;
				T result = caseB_Wert_TypeClass(b_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(b_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT: {
				Bedien_Anrueckabschnitt bedien_Anrueckabschnitt = (Bedien_Anrueckabschnitt)theEObject;
				T result = caseBedien_Anrueckabschnitt(bedien_Anrueckabschnitt);
				if (result == null) result = caseBasis_Objekt(bedien_Anrueckabschnitt);
				if (result == null) result = caseUr_Objekt(bedien_Anrueckabschnitt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup = (Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup(bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT: {
				Bedien_Anzeige_Element bedien_Anzeige_Element = (Bedien_Anzeige_Element)theEObject;
				T result = caseBedien_Anzeige_Element(bedien_Anzeige_Element);
				if (result == null) result = caseBasis_Objekt(bedien_Anzeige_Element);
				if (result == null) result = caseUr_Objekt(bedien_Anzeige_Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP: {
				Bedien_Anzeige_Element_Allg_AttributeGroup bedien_Anzeige_Element_Allg_AttributeGroup = (Bedien_Anzeige_Element_Allg_AttributeGroup)theEObject;
				T result = caseBedien_Anzeige_Element_Allg_AttributeGroup(bedien_Anzeige_Element_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bedien_Anzeige_Element_Bezeichnung_AttributeGroup bedien_Anzeige_Element_Bezeichnung_AttributeGroup = (Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBedien_Anzeige_Element_Bezeichnung_AttributeGroup(bedien_Anzeige_Element_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_BEZIRK: {
				Bedien_Bezirk bedien_Bezirk = (Bedien_Bezirk)theEObject;
				T result = caseBedien_Bezirk(bedien_Bezirk);
				if (result == null) result = caseBasis_Objekt(bedien_Bezirk);
				if (result == null) result = caseUr_Objekt(bedien_Bezirk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP: {
				Bedien_Bezirk_Adressformel_AttributeGroup bedien_Bezirk_Adressformel_AttributeGroup = (Bedien_Bezirk_Adressformel_AttributeGroup)theEObject;
				T result = caseBedien_Bezirk_Adressformel_AttributeGroup(bedien_Bezirk_Adressformel_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP: {
				Bedien_Bezirk_Allg_AttributeGroup bedien_Bezirk_Allg_AttributeGroup = (Bedien_Bezirk_Allg_AttributeGroup)theEObject;
				T result = caseBedien_Bezirk_Allg_AttributeGroup(bedien_Bezirk_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP: {
				Bedien_Bezirk_Anhaenge_AttributeGroup bedien_Bezirk_Anhaenge_AttributeGroup = (Bedien_Bezirk_Anhaenge_AttributeGroup)theEObject;
				T result = caseBedien_Bezirk_Anhaenge_AttributeGroup(bedien_Bezirk_Anhaenge_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_EINRICHT_BAUART_TYPE_CLASS: {
				Bedien_Einricht_Bauart_TypeClass bedien_Einricht_Bauart_TypeClass = (Bedien_Einricht_Bauart_TypeClass)theEObject;
				T result = caseBedien_Einricht_Bauart_TypeClass(bedien_Einricht_Bauart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedien_Einricht_Bauart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS: {
				Bedien_Einricht_Oertl_Bez_TypeClass bedien_Einricht_Oertl_Bez_TypeClass = (Bedien_Einricht_Oertl_Bez_TypeClass)theEObject;
				T result = caseBedien_Einricht_Oertl_Bez_TypeClass(bedien_Einricht_Oertl_Bez_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedien_Einricht_Oertl_Bez_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP: {
				Bedien_Einricht_Oertlich_Allg_AttributeGroup bedien_Einricht_Oertlich_Allg_AttributeGroup = (Bedien_Einricht_Oertlich_Allg_AttributeGroup)theEObject;
				T result = caseBedien_Einricht_Oertlich_Allg_AttributeGroup(bedien_Einricht_Oertlich_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH: {
				Bedien_Einrichtung_Oertlich bedien_Einrichtung_Oertlich = (Bedien_Einrichtung_Oertlich)theEObject;
				T result = caseBedien_Einrichtung_Oertlich(bedien_Einrichtung_Oertlich);
				if (result == null) result = caseBasis_Objekt(bedien_Einrichtung_Oertlich);
				if (result == null) result = caseUr_Objekt(bedien_Einrichtung_Oertlich);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup = (Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup(bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_GBT: {
				Bedien_GBT bedien_GBT = (Bedien_GBT)theEObject;
				T result = caseBedien_GBT(bedien_GBT);
				if (result == null) result = caseBasis_Objekt(bedien_GBT);
				if (result == null) result = caseUr_Objekt(bedien_GBT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP: {
				Bedien_GBT_Allg_AttributeGroup bedien_GBT_Allg_AttributeGroup = (Bedien_GBT_Allg_AttributeGroup)theEObject;
				T result = caseBedien_GBT_Allg_AttributeGroup(bedien_GBT_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OBERFLAECHE: {
				Bedien_Oberflaeche bedien_Oberflaeche = (Bedien_Oberflaeche)theEObject;
				T result = caseBedien_Oberflaeche(bedien_Oberflaeche);
				if (result == null) result = caseBasis_Objekt(bedien_Oberflaeche);
				if (result == null) result = caseUr_Objekt(bedien_Oberflaeche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP: {
				Bedien_Oberflaeche_Anhaenge_AttributeGroup bedien_Oberflaeche_Anhaenge_AttributeGroup = (Bedien_Oberflaeche_Anhaenge_AttributeGroup)theEObject;
				T result = caseBedien_Oberflaeche_Anhaenge_AttributeGroup(bedien_Oberflaeche_Anhaenge_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD: {
				Bedien_Oberflaeche_Bild bedien_Oberflaeche_Bild = (Bedien_Oberflaeche_Bild)theEObject;
				T result = caseBedien_Oberflaeche_Bild(bedien_Oberflaeche_Bild);
				if (result == null) result = caseBasis_Objekt(bedien_Oberflaeche_Bild);
				if (result == null) result = caseUr_Objekt(bedien_Oberflaeche_Bild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP: {
				Bedien_Oberflaeche_Bild_Allg_AttributeGroup bedien_Oberflaeche_Bild_Allg_AttributeGroup = (Bedien_Oberflaeche_Bild_Allg_AttributeGroup)theEObject;
				T result = caseBedien_Oberflaeche_Bild_Allg_AttributeGroup(bedien_Oberflaeche_Bild_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OERTLICHKEIT: {
				Bedien_Oertlichkeit bedien_Oertlichkeit = (Bedien_Oertlichkeit)theEObject;
				T result = caseBedien_Oertlichkeit(bedien_Oertlichkeit);
				if (result == null) result = caseBasis_Objekt(bedien_Oertlichkeit);
				if (result == null) result = caseUr_Objekt(bedien_Oertlichkeit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP: {
				Bedien_Oertlichkeit_Kennzahlen_AttributeGroup bedien_Oertlichkeit_Kennzahlen_AttributeGroup = (Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)theEObject;
				T result = caseBedien_Oertlichkeit_Kennzahlen_AttributeGroup(bedien_Oertlichkeit_Kennzahlen_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_PLATZ: {
				Bedien_Platz bedien_Platz = (Bedien_Platz)theEObject;
				T result = caseBedien_Platz(bedien_Platz);
				if (result == null) result = caseBasis_Objekt(bedien_Platz);
				if (result == null) result = caseUr_Objekt(bedien_Platz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP: {
				Bedien_Platz_Allg_AttributeGroup bedien_Platz_Allg_AttributeGroup = (Bedien_Platz_Allg_AttributeGroup)theEObject;
				T result = caseBedien_Platz_Allg_AttributeGroup(bedien_Platz_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_PLATZ_ART_TYPE_CLASS: {
				Bedien_Platz_Art_TypeClass bedien_Platz_Art_TypeClass = (Bedien_Platz_Art_TypeClass)theEObject;
				T result = caseBedien_Platz_Art_TypeClass(bedien_Platz_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedien_Platz_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_STANDORT: {
				Bedien_Standort bedien_Standort = (Bedien_Standort)theEObject;
				T result = caseBedien_Standort(bedien_Standort);
				if (result == null) result = caseBasis_Objekt(bedien_Standort);
				if (result == null) result = caseUr_Objekt(bedien_Standort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bedien_Standort_Bezeichnung_AttributeGroup bedien_Standort_Bezeichnung_AttributeGroup = (Bedien_Standort_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBedien_Standort_Bezeichnung_AttributeGroup(bedien_Standort_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ZENTRALE: {
				Bedien_Zentrale bedien_Zentrale = (Bedien_Zentrale)theEObject;
				T result = caseBedien_Zentrale(bedien_Zentrale);
				if (result == null) result = caseBasis_Objekt(bedien_Zentrale);
				if (result == null) result = caseUr_Objekt(bedien_Zentrale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Bedien_Zentrale_Bezeichnung_AttributeGroup bedien_Zentrale_Bezeichnung_AttributeGroup = (Bedien_Zentrale_Bezeichnung_AttributeGroup)theEObject;
				T result = caseBedien_Zentrale_Bezeichnung_AttributeGroup(bedien_Zentrale_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE_CLASS: {
				Bedienplatzbezeichnung_TypeClass bedienplatzbezeichnung_TypeClass = (Bedienplatzbezeichnung_TypeClass)theEObject;
				T result = caseBedienplatzbezeichnung_TypeClass(bedienplatzbezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedienplatzbezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE_CLASS: {
				Bedienplatznummer_TypeClass bedienplatznummer_TypeClass = (Bedienplatznummer_TypeClass)theEObject;
				T result = caseBedienplatznummer_TypeClass(bedienplatznummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedienplatznummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE_CLASS: {
				Bedienraumnummer_TypeClass bedienraumnummer_TypeClass = (Bedienraumnummer_TypeClass)theEObject;
				T result = caseBedienraumnummer_TypeClass(bedienraumnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedienraumnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS: {
				Betriebsstellenbezeichner_TypeClass betriebsstellenbezeichner_TypeClass = (Betriebsstellenbezeichner_TypeClass)theEObject;
				T result = caseBetriebsstellenbezeichner_TypeClass(betriebsstellenbezeichner_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(betriebsstellenbezeichner_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS: {
				Bez_Bed_Anrueckabschnitt_TypeClass bez_Bed_Anrueckabschnitt_TypeClass = (Bez_Bed_Anrueckabschnitt_TypeClass)theEObject;
				T result = caseBez_Bed_Anrueckabschnitt_TypeClass(bez_Bed_Anrueckabschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Bed_Anrueckabschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS: {
				Bez_Bed_Anzeige_Element_TypeClass bez_Bed_Anzeige_Element_TypeClass = (Bez_Bed_Anzeige_Element_TypeClass)theEObject;
				T result = caseBez_Bed_Anzeige_Element_TypeClass(bez_Bed_Anzeige_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Bed_Anzeige_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE_CLASS: {
				Bez_Bed_Zentrale_TypeClass bez_Bed_Zentrale_TypeClass = (Bez_Bed_Zentrale_TypeClass)theEObject;
				T result = caseBez_Bed_Zentrale_TypeClass(bez_Bed_Zentrale_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Bed_Zentrale_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE_CLASS: {
				Bezeichnung_BSO_TypeClass bezeichnung_BSO_TypeClass = (Bezeichnung_BSO_TypeClass)theEObject;
				T result = caseBezeichnung_BSO_TypeClass(bezeichnung_BSO_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_BSO_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP: {
				BSO_IP_AB_Teilsystem_AttributeGroup bsO_IP_AB_Teilsystem_AttributeGroup = (BSO_IP_AB_Teilsystem_AttributeGroup)theEObject;
				T result = caseBSO_IP_AB_Teilsystem_AttributeGroup(bsO_IP_AB_Teilsystem_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: {
				BSO_IP_Adressblock_AttributeGroup bsO_IP_Adressblock_AttributeGroup = (BSO_IP_Adressblock_AttributeGroup)theEObject;
				T result = caseBSO_IP_Adressblock_AttributeGroup(bsO_IP_Adressblock_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.BSO_TEILSYSTEM_ART_TYPE_CLASS: {
				BSO_Teilsystem_Art_TypeClass bsO_Teilsystem_Art_TypeClass = (BSO_Teilsystem_Art_TypeClass)theEObject;
				T result = caseBSO_Teilsystem_Art_TypeClass(bsO_Teilsystem_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bsO_Teilsystem_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.CWERT_TYPE_CLASS: {
				C_Wert_TypeClass c_Wert_TypeClass = (C_Wert_TypeClass)theEObject;
				T result = caseC_Wert_TypeClass(c_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(c_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.DD_WERT_TYPE_CLASS: {
				DD_Wert_TypeClass dD_Wert_TypeClass = (DD_Wert_TypeClass)theEObject;
				T result = caseDD_Wert_TypeClass(dD_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dD_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.HERSTELLER_TYPE_CLASS: {
				Hersteller_TypeClass hersteller_TypeClass = (Hersteller_TypeClass)theEObject;
				T result = caseHersteller_TypeClass(hersteller_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hersteller_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE_CLASS: {
				Hupe_Anschaltzeit_TypeClass hupe_Anschaltzeit_TypeClass = (Hupe_Anschaltzeit_TypeClass)theEObject;
				T result = caseHupe_Anschaltzeit_TypeClass(hupe_Anschaltzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hupe_Anschaltzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS: {
				IP_Adressblock_Blau_TypeClass iP_Adressblock_Blau_TypeClass = (IP_Adressblock_Blau_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_TypeClass(iP_Adressblock_Blau_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS: {
				IP_Adressblock_Blau_V4_TypeClass iP_Adressblock_Blau_V4_TypeClass = (IP_Adressblock_Blau_V4_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_V4_TypeClass(iP_Adressblock_Blau_V4_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_V4_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS: {
				IP_Adressblock_Blau_V6_TypeClass iP_Adressblock_Blau_V6_TypeClass = (IP_Adressblock_Blau_V6_TypeClass)theEObject;
				T result = caseIP_Adressblock_Blau_V6_TypeClass(iP_Adressblock_Blau_V6_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Blau_V6_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS: {
				IP_Adressblock_Grau_TypeClass iP_Adressblock_Grau_TypeClass = (IP_Adressblock_Grau_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_TypeClass(iP_Adressblock_Grau_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS: {
				IP_Adressblock_Grau_V4_TypeClass iP_Adressblock_Grau_V4_TypeClass = (IP_Adressblock_Grau_V4_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_V4_TypeClass(iP_Adressblock_Grau_V4_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_V4_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS: {
				IP_Adressblock_Grau_V6_TypeClass iP_Adressblock_Grau_V6_TypeClass = (IP_Adressblock_Grau_V6_TypeClass)theEObject;
				T result = caseIP_Adressblock_Grau_V6_TypeClass(iP_Adressblock_Grau_V6_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adressblock_Grau_V6_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.KENNZAHL_TYPE_CLASS: {
				Kennzahl_TypeClass kennzahl_TypeClass = (Kennzahl_TypeClass)theEObject;
				T result = caseKennzahl_TypeClass(kennzahl_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kennzahl_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.MELDER_TYPE_CLASS: {
				Melder_TypeClass melder_TypeClass = (Melder_TypeClass)theEObject;
				T result = caseMelder_TypeClass(melder_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(melder_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.OBERFLAECHE_BILDART_TYPE_CLASS: {
				Oberflaeche_Bildart_TypeClass oberflaeche_Bildart_TypeClass = (Oberflaeche_Bildart_TypeClass)theEObject;
				T result = caseOberflaeche_Bildart_TypeClass(oberflaeche_Bildart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oberflaeche_Bildart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS: {
				Oberflaeche_Zustaendigkeit_TypeClass oberflaeche_Zustaendigkeit_TypeClass = (Oberflaeche_Zustaendigkeit_TypeClass)theEObject;
				T result = caseOberflaeche_Zustaendigkeit_TypeClass(oberflaeche_Zustaendigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oberflaeche_Zustaendigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.REGIONALBEREICH_TYPE_CLASS: {
				Regionalbereich_TypeClass regionalbereich_TypeClass = (Regionalbereich_TypeClass)theEObject;
				T result = caseRegionalbereich_TypeClass(regionalbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(regionalbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.RUECKSCHAUZEIT_TYPE_CLASS: {
				Rueckschauzeit_TypeClass rueckschauzeit_TypeClass = (Rueckschauzeit_TypeClass)theEObject;
				T result = caseRueckschauzeit_TypeClass(rueckschauzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rueckschauzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.SCHALTER_TYPE_CLASS: {
				Schalter_TypeClass schalter_TypeClass = (Schalter_TypeClass)theEObject;
				T result = caseSchalter_TypeClass(schalter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schalter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.SCHRANKREIHE_TYPE_CLASS: {
				Schrankreihe_TypeClass schrankreihe_TypeClass = (Schrankreihe_TypeClass)theEObject;
				T result = caseSchrankreihe_TypeClass(schrankreihe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schrankreihe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE_CLASS: {
				Steuerbezirksname_TypeClass steuerbezirksname_TypeClass = (Steuerbezirksname_TypeClass)theEObject;
				T result = caseSteuerbezirksname_TypeClass(steuerbezirksname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(steuerbezirksname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE_CLASS: {
				Steuerbezirksnummer_TypeClass steuerbezirksnummer_TypeClass = (Steuerbezirksnummer_TypeClass)theEObject;
				T result = caseSteuerbezirksnummer_TypeClass(steuerbezirksnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(steuerbezirksnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.TASTE_TYPE_CLASS: {
				Taste_TypeClass taste_TypeClass = (Taste_TypeClass)theEObject;
				T result = caseTaste_TypeClass(taste_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(taste_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.VORSCHAUZEIT_TYPE_CLASS: {
				Vorschauzeit_TypeClass vorschauzeit_TypeClass = (Vorschauzeit_TypeClass)theEObject;
				T result = caseVorschauzeit_TypeClass(vorschauzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vorschauzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.XWERT_TYPE_CLASS: {
				X_Wert_TypeClass x_Wert_TypeClass = (X_Wert_TypeClass)theEObject;
				T result = caseX_Wert_TypeClass(x_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(x_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.YWERT_TYPE_CLASS: {
				Y_Wert_TypeClass y_Wert_TypeClass = (Y_Wert_TypeClass)theEObject;
				T result = caseY_Wert_TypeClass(y_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(y_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BedienungPackage.YY_WERT_TYPE_CLASS: {
				YY_Wert_TypeClass yY_Wert_TypeClass = (YY_Wert_TypeClass)theEObject;
				T result = caseYY_Wert_TypeClass(yY_Wert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(yY_Wert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA_Wert_TypeClass(A_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anbindung IB2 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anbindung IB2 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnbindung_IB2_TypeClass(Anbindung_IB2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anbindung IB3 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anbindung IB3 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnbindung_IB3_TypeClass(Anbindung_IB3_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB_Wert_TypeClass(B_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Anrueckabschnitt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Anrueckabschnitt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Anrueckabschnitt(Bedien_Anrueckabschnitt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Anrueckabschnitt Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Anzeige Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Anzeige Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Anzeige_Element(Bedien_Anzeige_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Anzeige Element Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Anzeige Element Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Anzeige_Element_Allg_AttributeGroup(Bedien_Anzeige_Element_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Anzeige Element Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Anzeige Element Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Anzeige_Element_Bezeichnung_AttributeGroup(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Bezirk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Bezirk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Bezirk(Bedien_Bezirk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Bezirk Adressformel Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Bezirk Adressformel Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Bezirk_Adressformel_AttributeGroup(Bedien_Bezirk_Adressformel_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Bezirk Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Bezirk Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Bezirk_Allg_AttributeGroup(Bedien_Bezirk_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Bezirk Anhaenge Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Bezirk Anhaenge Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Bezirk_Anhaenge_AttributeGroup(Bedien_Bezirk_Anhaenge_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Einricht Bauart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Einricht Bauart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Einricht_Bauart_TypeClass(Bedien_Einricht_Bauart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Einricht Oertl Bez Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Einricht Oertl Bez Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Einricht_Oertl_Bez_TypeClass(Bedien_Einricht_Oertl_Bez_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Einricht Oertlich Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Einricht Oertlich Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Einricht_Oertlich_Allg_AttributeGroup(Bedien_Einricht_Oertlich_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Einrichtung Oertlich</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Einrichtung Oertlich</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Einrichtung_Oertlich(Bedien_Einrichtung_Oertlich object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien GBT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien GBT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_GBT(Bedien_GBT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien GBT Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien GBT Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_GBT_Allg_AttributeGroup(Bedien_GBT_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oberflaeche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oberflaeche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oberflaeche(Bedien_Oberflaeche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Anhaenge Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Anhaenge Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oberflaeche_Anhaenge_AttributeGroup(Bedien_Oberflaeche_Anhaenge_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Bild</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Bild</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oberflaeche_Bild(Bedien_Oberflaeche_Bild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Bild Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oberflaeche Bild Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oberflaeche_Bild_Allg_AttributeGroup(Bedien_Oberflaeche_Bild_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oertlichkeit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oertlichkeit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oertlichkeit(Bedien_Oertlichkeit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Oertlichkeit Kennzahlen Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Oertlichkeit_Kennzahlen_AttributeGroup(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Platz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Platz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Platz(Bedien_Platz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Platz Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Platz Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Platz_Allg_AttributeGroup(Bedien_Platz_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Platz Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Platz Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Platz_Art_TypeClass(Bedien_Platz_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Standort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Standort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Standort(Bedien_Standort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Standort Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Standort Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Standort_Bezeichnung_AttributeGroup(Bedien_Standort_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Zentrale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Zentrale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Zentrale(Bedien_Zentrale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedien Zentrale Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedien Zentrale Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedien_Zentrale_Bezeichnung_AttributeGroup(Bedien_Zentrale_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedienplatzbezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedienplatzbezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedienplatzbezeichnung_TypeClass(Bedienplatzbezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedienplatznummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedienplatznummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedienplatznummer_TypeClass(Bedienplatznummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedienraumnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedienraumnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedienraumnummer_TypeClass(Bedienraumnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Betriebsstellenbezeichner Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Betriebsstellenbezeichner Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetriebsstellenbezeichner_TypeClass(Betriebsstellenbezeichner_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Bed Anrueckabschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Bed Anrueckabschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Bed_Anrueckabschnitt_TypeClass(Bez_Bed_Anrueckabschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Bed Anzeige Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Bed Anzeige Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Bed_Anzeige_Element_TypeClass(Bez_Bed_Anzeige_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Bed Zentrale Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Bed Zentrale Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Bed_Zentrale_TypeClass(Bez_Bed_Zentrale_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung BSO Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung BSO Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_BSO_TypeClass(Bezeichnung_BSO_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSO IP AB Teilsystem Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSO IP AB Teilsystem Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSO_IP_AB_Teilsystem_AttributeGroup(BSO_IP_AB_Teilsystem_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSO IP Adressblock Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSO IP Adressblock Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSO_IP_Adressblock_AttributeGroup(BSO_IP_Adressblock_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSO Teilsystem Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSO Teilsystem Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSO_Teilsystem_Art_TypeClass(BSO_Teilsystem_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CWert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CWert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC_Wert_TypeClass(C_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DD Wert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DD Wert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDD_Wert_TypeClass(DD_Wert_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hupe Anschaltzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hupe Anschaltzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHupe_Anschaltzeit_TypeClass(Hupe_Anschaltzeit_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Kennzahl Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kennzahl Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKennzahl_TypeClass(Kennzahl_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Melder Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Melder Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMelder_TypeClass(Melder_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oberflaeche Bildart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oberflaeche Bildart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOberflaeche_Bildart_TypeClass(Oberflaeche_Bildart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oberflaeche Zustaendigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oberflaeche Zustaendigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOberflaeche_Zustaendigkeit_TypeClass(Oberflaeche_Zustaendigkeit_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rueckschauzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rueckschauzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRueckschauzeit_TypeClass(Rueckschauzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schalter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schalter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchalter_TypeClass(Schalter_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schrankreihe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schrankreihe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchrankreihe_TypeClass(Schrankreihe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steuerbezirksname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steuerbezirksname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteuerbezirksname_TypeClass(Steuerbezirksname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steuerbezirksnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steuerbezirksnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteuerbezirksnummer_TypeClass(Steuerbezirksnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taste Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taste Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaste_TypeClass(Taste_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vorschauzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vorschauzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVorschauzeit_TypeClass(Vorschauzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XWert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XWert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX_Wert_TypeClass(X_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YWert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YWert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseY_Wert_TypeClass(Y_Wert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YY Wert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YY Wert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYY_Wert_TypeClass(YY_Wert_TypeClass object) {
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

} //BedienungSwitch
