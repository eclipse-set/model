/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Verweise.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.model.model1902.BasisTypen.Zeiger_TypeClass;

import org.eclipse.set.model.model1902.Verweise.*;

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
 * @see org.eclipse.set.model.model1902.Verweise.VerweisePackage
 * @generated
 */
public class VerweiseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerweisePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerweiseSwitch() {
		if (modelPackage == null) {
			modelPackage = VerweisePackage.eINSTANCE;
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
			case VerweisePackage.ID_ANFORDERER_ELEMENT_TYPE_CLASS: {
				ID_Anforderer_Element_TypeClass iD_Anforderer_Element_TypeClass = (ID_Anforderer_Element_TypeClass)theEObject;
				T result = caseID_Anforderer_Element_TypeClass(iD_Anforderer_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Anforderer_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Anforderer_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ANFORDERUNG_TYPE_CLASS: {
				ID_Anforderung_TypeClass iD_Anforderung_TypeClass = (ID_Anforderung_TypeClass)theEObject;
				T result = caseID_Anforderung_TypeClass(iD_Anforderung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Anforderung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Anforderung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ANHANG_OHNE_PROXY_TYPE_CLASS: {
				ID_Anhang_ohne_Proxy_TypeClass iD_Anhang_ohne_Proxy_TypeClass = (ID_Anhang_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Anhang_ohne_Proxy_TypeClass(iD_Anhang_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Anhang_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Anhang_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ANHANG_TYPE_CLASS: {
				ID_Anhang_TypeClass iD_Anhang_TypeClass = (ID_Anhang_TypeClass)theEObject;
				T result = caseID_Anhang_TypeClass(iD_Anhang_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Anhang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Anhang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ANSCHLUSS_ELEMENT_TYPE_CLASS: {
				ID_Anschluss_Element_TypeClass iD_Anschluss_Element_TypeClass = (ID_Anschluss_Element_TypeClass)theEObject;
				T result = caseID_Anschluss_Element_TypeClass(iD_Anschluss_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Anschluss_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Anschluss_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_AUSGABE_FACHDATEN_OHNE_PROXY_TYPE_CLASS: {
				ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass = (ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Ausgabe_Fachdaten_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_TYPE_CLASS: {
				ID_Aussenelementansteuerung_TypeClass iD_Aussenelementansteuerung_TypeClass = (ID_Aussenelementansteuerung_TypeClass)theEObject;
				T result = caseID_Aussenelementansteuerung_TypeClass(iD_Aussenelementansteuerung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Aussenelementansteuerung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Aussenelementansteuerung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BAHNSTEIG_ANLAGE_TYPE_CLASS: {
				ID_Bahnsteig_Anlage_TypeClass iD_Bahnsteig_Anlage_TypeClass = (ID_Bahnsteig_Anlage_TypeClass)theEObject;
				T result = caseID_Bahnsteig_Anlage_TypeClass(iD_Bahnsteig_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bahnsteig_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bahnsteig_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BAHNSTEIG_KANTE_OHNE_PROXY_TYPE_CLASS: {
				ID_Bahnsteig_Kante_ohne_Proxy_TypeClass iD_Bahnsteig_Kante_ohne_Proxy_TypeClass = (ID_Bahnsteig_Kante_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Bahnsteig_Kante_ohne_Proxy_TypeClass(iD_Bahnsteig_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bahnsteig_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bahnsteig_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BAHNSTEIG_KANTE_TYPE_CLASS: {
				ID_Bahnsteig_Kante_TypeClass iD_Bahnsteig_Kante_TypeClass = (ID_Bahnsteig_Kante_TypeClass)theEObject;
				T result = caseID_Bahnsteig_Kante_TypeClass(iD_Bahnsteig_Kante_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bahnsteig_Kante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bahnsteig_Kante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BALISE_OHNE_PROXY_TYPE_CLASS: {
				ID_Balise_ohne_Proxy_TypeClass iD_Balise_ohne_Proxy_TypeClass = (ID_Balise_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Balise_ohne_Proxy_TypeClass(iD_Balise_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Balise_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Balise_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BALISE_TYPE_CLASS: {
				ID_Balise_TypeClass iD_Balise_TypeClass = (ID_Balise_TypeClass)theEObject;
				T result = caseID_Balise_TypeClass(iD_Balise_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Balise_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Balise_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BASIS_OBJEKT_TYPE_CLASS: {
				ID_Basis_Objekt_TypeClass iD_Basis_Objekt_TypeClass = (ID_Basis_Objekt_TypeClass)theEObject;
				T result = caseID_Basis_Objekt_TypeClass(iD_Basis_Objekt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Basis_Objekt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Basis_Objekt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEARBEITUNGSVERMERK_TYPE_CLASS: {
				ID_Bearbeitungsvermerk_TypeClass iD_Bearbeitungsvermerk_TypeClass = (ID_Bearbeitungsvermerk_TypeClass)theEObject;
				T result = caseID_Bearbeitungsvermerk_TypeClass(iD_Bearbeitungsvermerk_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bearbeitungsvermerk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bearbeitungsvermerk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS: {
				ID_Bedien_Anzeige_Element_TypeClass iD_Bedien_Anzeige_Element_TypeClass = (ID_Bedien_Anzeige_Element_TypeClass)theEObject;
				T result = caseID_Bedien_Anzeige_Element_TypeClass(iD_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_BEZIRK_TYPE_CLASS: {
				ID_Bedien_Bezirk_TypeClass iD_Bedien_Bezirk_TypeClass = (ID_Bedien_Bezirk_TypeClass)theEObject;
				T result = caseID_Bedien_Bezirk_TypeClass(iD_Bedien_Bezirk_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Bezirk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Bezirk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_EINRICHTUNG_OERTLICH_TYPE_CLASS: {
				ID_Bedien_Einrichtung_Oertlich_TypeClass iD_Bedien_Einrichtung_Oertlich_TypeClass = (ID_Bedien_Einrichtung_Oertlich_TypeClass)theEObject;
				T result = caseID_Bedien_Einrichtung_Oertlich_TypeClass(iD_Bedien_Einrichtung_Oertlich_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Einrichtung_Oertlich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Einrichtung_Oertlich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_OBERFLAECHE_TYPE_CLASS: {
				ID_Bedien_Oberflaeche_TypeClass iD_Bedien_Oberflaeche_TypeClass = (ID_Bedien_Oberflaeche_TypeClass)theEObject;
				T result = caseID_Bedien_Oberflaeche_TypeClass(iD_Bedien_Oberflaeche_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Oberflaeche_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Oberflaeche_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_STANDORT_TYPE_CLASS: {
				ID_Bedien_Standort_TypeClass iD_Bedien_Standort_TypeClass = (ID_Bedien_Standort_TypeClass)theEObject;
				T result = caseID_Bedien_Standort_TypeClass(iD_Bedien_Standort_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Standort_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Standort_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEDIEN_ZENTRALE_TYPE_CLASS: {
				ID_Bedien_Zentrale_TypeClass iD_Bedien_Zentrale_TypeClass = (ID_Bedien_Zentrale_TypeClass)theEObject;
				T result = caseID_Bedien_Zentrale_TypeClass(iD_Bedien_Zentrale_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Bedien_Zentrale_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Bedien_Zentrale_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BEGINN_BEREICH_TYPE_CLASS: {
				ID_Beginn_Bereich_TypeClass iD_Beginn_Bereich_TypeClass = (ID_Beginn_Bereich_TypeClass)theEObject;
				T result = caseID_Beginn_Bereich_TypeClass(iD_Beginn_Bereich_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Beginn_Bereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Beginn_Bereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BINAERDATEI_OHNE_PROXY_TYPE_CLASS: {
				ID_Binaerdatei_ohne_Proxy_TypeClass iD_Binaerdatei_ohne_Proxy_TypeClass = (ID_Binaerdatei_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Binaerdatei_ohne_Proxy_TypeClass(iD_Binaerdatei_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Binaerdatei_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Binaerdatei_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BLOCK_ANLAGE_TYPE_CLASS: {
				ID_Block_Anlage_TypeClass iD_Block_Anlage_TypeClass = (ID_Block_Anlage_TypeClass)theEObject;
				T result = caseID_Block_Anlage_TypeClass(iD_Block_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Block_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Block_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BLOCK_ELEMENT_TYPE_CLASS: {
				ID_Block_Element_TypeClass iD_Block_Element_TypeClass = (ID_Block_Element_TypeClass)theEObject;
				T result = caseID_Block_Element_TypeClass(iD_Block_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Block_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Block_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BLOCK_STRECKE_TYPE_CLASS: {
				ID_Block_Strecke_TypeClass iD_Block_Strecke_TypeClass = (ID_Block_Strecke_TypeClass)theEObject;
				T result = caseID_Block_Strecke_TypeClass(iD_Block_Strecke_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Block_Strecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Block_Strecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_ANLAGE_OHNE_PROXY_TYPE_CLASS: {
				ID_BUE_Anlage_ohne_Proxy_TypeClass iD_BUE_Anlage_ohne_Proxy_TypeClass = (ID_BUE_Anlage_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_BUE_Anlage_ohne_Proxy_TypeClass(iD_BUE_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_ANLAGE_TYPE_CLASS: {
				ID_BUE_Anlage_TypeClass iD_BUE_Anlage_TypeClass = (ID_BUE_Anlage_TypeClass)theEObject;
				T result = caseID_BUE_Anlage_TypeClass(iD_BUE_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_BEDIEN_ANZEIGE_ELEMENT_TYPE_CLASS: {
				ID_BUE_Bedien_Anzeige_Element_TypeClass iD_BUE_Bedien_Anzeige_Element_TypeClass = (ID_BUE_Bedien_Anzeige_Element_TypeClass)theEObject;
				T result = caseID_BUE_Bedien_Anzeige_Element_TypeClass(iD_BUE_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Bedien_Anzeige_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_EINSCHALTUNG_TYPE_CLASS: {
				ID_BUE_Einschaltung_TypeClass iD_BUE_Einschaltung_TypeClass = (ID_BUE_Einschaltung_TypeClass)theEObject;
				T result = caseID_BUE_Einschaltung_TypeClass(iD_BUE_Einschaltung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Einschaltung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Einschaltung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_GLEISBEZOGENER_GEFAHRRAUM_TYPE_CLASS: {
				ID_BUE_Gleisbezogener_Gefahrraum_TypeClass iD_BUE_Gleisbezogener_Gefahrraum_TypeClass = (ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)theEObject;
				T result = caseID_BUE_Gleisbezogener_Gefahrraum_TypeClass(iD_BUE_Gleisbezogener_Gefahrraum_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Gleisbezogener_Gefahrraum_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Gleisbezogener_Gefahrraum_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_SCHNITTSTELLE_TYPE_CLASS: {
				ID_BUE_Schnittstelle_TypeClass iD_BUE_Schnittstelle_TypeClass = (ID_BUE_Schnittstelle_TypeClass)theEObject;
				T result = caseID_BUE_Schnittstelle_TypeClass(iD_BUE_Schnittstelle_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_Schnittstelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_Schnittstelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_BUE_WS_FSTR_ZUORDNUNG_TYPE_CLASS: {
				ID_BUE_WS_Fstr_Zuordnung_TypeClass iD_BUE_WS_Fstr_Zuordnung_TypeClass = (ID_BUE_WS_Fstr_Zuordnung_TypeClass)theEObject;
				T result = caseID_BUE_WS_Fstr_Zuordnung_TypeClass(iD_BUE_WS_Fstr_Zuordnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_BUE_WS_Fstr_Zuordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_BUE_WS_Fstr_Zuordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_DATENPUNKT_OHNE_PROXY_TYPE_CLASS: {
				ID_Datenpunkt_ohne_Proxy_TypeClass iD_Datenpunkt_ohne_Proxy_TypeClass = (ID_Datenpunkt_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Datenpunkt_ohne_Proxy_TypeClass(iD_Datenpunkt_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Datenpunkt_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Datenpunkt_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_DATENPUNKT_TYPE_CLASS: {
				ID_Datenpunkt_TypeClass iD_Datenpunkt_TypeClass = (ID_Datenpunkt_TypeClass)theEObject;
				T result = caseID_Datenpunkt_TypeClass(iD_Datenpunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Datenpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Datenpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_DP_BEZUGSPUNKT_TYPE_CLASS: {
				ID_DP_Bezugspunkt_TypeClass iD_DP_Bezugspunkt_TypeClass = (ID_DP_Bezugspunkt_TypeClass)theEObject;
				T result = caseID_DP_Bezugspunkt_TypeClass(iD_DP_Bezugspunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_DP_Bezugspunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_DP_Bezugspunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_EINSCHALTPUNKT_TYPE_CLASS: {
				ID_Einschaltpunkt_TypeClass iD_Einschaltpunkt_TypeClass = (ID_Einschaltpunkt_TypeClass)theEObject;
				T result = caseID_Einschaltpunkt_TypeClass(iD_Einschaltpunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Einschaltpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Einschaltpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ELEMENT_GRENZE_TYPE_CLASS: {
				ID_Element_Grenze_TypeClass iD_Element_Grenze_TypeClass = (ID_Element_Grenze_TypeClass)theEObject;
				T result = caseID_Element_Grenze_TypeClass(iD_Element_Grenze_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Element_Grenze_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Element_Grenze_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ELEMENT_TYPE_CLASS: {
				ID_Element_TypeClass iD_Element_TypeClass = (ID_Element_TypeClass)theEObject;
				T result = caseID_Element_TypeClass(iD_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ELEMENT_UNTERBRINGUNG_TYPE_CLASS: {
				ID_Element_Unterbringung_TypeClass iD_Element_Unterbringung_TypeClass = (ID_Element_Unterbringung_TypeClass)theEObject;
				T result = caseID_Element_Unterbringung_TypeClass(iD_Element_Unterbringung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Element_Unterbringung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Element_Unterbringung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ENERGIE_EINGANG_TYPE_CLASS: {
				ID_Energie_Eingang_TypeClass iD_Energie_Eingang_TypeClass = (ID_Energie_Eingang_TypeClass)theEObject;
				T result = caseID_Energie_Eingang_TypeClass(iD_Energie_Eingang_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Energie_Eingang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Energie_Eingang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ENERGIE_PRIMAER_TYPE_CLASS: {
				ID_Energie_Primaer_TypeClass iD_Energie_Primaer_TypeClass = (ID_Energie_Primaer_TypeClass)theEObject;
				T result = caseID_Energie_Primaer_TypeClass(iD_Energie_Primaer_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Energie_Primaer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Energie_Primaer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ESTW_ZENTRALEINHEIT_TYPE_CLASS: {
				ID_ESTW_Zentraleinheit_TypeClass iD_ESTW_Zentraleinheit_TypeClass = (ID_ESTW_Zentraleinheit_TypeClass)theEObject;
				T result = caseID_ESTW_Zentraleinheit_TypeClass(iD_ESTW_Zentraleinheit_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ESTW_Zentraleinheit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ESTW_Zentraleinheit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ETCS_KNOTEN_OHNE_PROXY_TYPE_CLASS: {
				ID_ETCS_Knoten_ohne_Proxy_TypeClass iD_ETCS_Knoten_ohne_Proxy_TypeClass = (ID_ETCS_Knoten_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_ETCS_Knoten_ohne_Proxy_TypeClass(iD_ETCS_Knoten_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ETCS_Knoten_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ETCS_Knoten_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ETCS_KNOTEN_TYPE_CLASS: {
				ID_ETCS_Knoten_TypeClass iD_ETCS_Knoten_TypeClass = (ID_ETCS_Knoten_TypeClass)theEObject;
				T result = caseID_ETCS_Knoten_TypeClass(iD_ETCS_Knoten_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ETCS_Knoten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ETCS_Knoten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_EV_MODUL_TYPE_CLASS: {
				ID_EV_Modul_TypeClass iD_EV_Modul_TypeClass = (ID_EV_Modul_TypeClass)theEObject;
				T result = caseID_EV_Modul_TypeClass(iD_EV_Modul_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_EV_Modul_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_EV_Modul_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FACHTELEGRAMM_TYPE_CLASS: {
				ID_Fachtelegramm_TypeClass iD_Fachtelegramm_TypeClass = (ID_Fachtelegramm_TypeClass)theEObject;
				T result = caseID_Fachtelegramm_TypeClass(iD_Fachtelegramm_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fachtelegramm_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fachtelegramm_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FLA_SCHUTZ_TYPE_CLASS: {
				ID_Fla_Schutz_TypeClass iD_Fla_Schutz_TypeClass = (ID_Fla_Schutz_TypeClass)theEObject;
				T result = caseID_Fla_Schutz_TypeClass(iD_Fla_Schutz_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fla_Schutz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fla_Schutz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FMA_ANLAGE_RANGIER_FREI_TYPE_CLASS: {
				ID_FMA_Anlage_Rangier_Frei_TypeClass iD_FMA_Anlage_Rangier_Frei_TypeClass = (ID_FMA_Anlage_Rangier_Frei_TypeClass)theEObject;
				T result = caseID_FMA_Anlage_Rangier_Frei_TypeClass(iD_FMA_Anlage_Rangier_Frei_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FMA_Anlage_Rangier_Frei_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FMA_Anlage_Rangier_Frei_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FMA_ANLAGE_TYPE_CLASS: {
				ID_FMA_Anlage_TypeClass iD_FMA_Anlage_TypeClass = (ID_FMA_Anlage_TypeClass)theEObject;
				T result = caseID_FMA_Anlage_TypeClass(iD_FMA_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FMA_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FMA_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FMA_ELEMENT_TYPE_CLASS: {
				ID_FMA_Element_TypeClass iD_FMA_Element_TypeClass = (ID_FMA_Element_TypeClass)theEObject;
				T result = caseID_FMA_Element_TypeClass(iD_FMA_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FMA_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FMA_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FMA_KOMPONENTE_TYPE_CLASS: {
				ID_FMA_Komponente_TypeClass iD_FMA_Komponente_TypeClass = (ID_FMA_Komponente_TypeClass)theEObject;
				T result = caseID_FMA_Komponente_TypeClass(iD_FMA_Komponente_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FMA_Komponente_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FMA_Komponente_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FORTSCHALTUNG_START_TYPE_CLASS: {
				ID_Fortschaltung_Start_TypeClass iD_Fortschaltung_Start_TypeClass = (ID_Fortschaltung_Start_TypeClass)theEObject;
				T result = caseID_Fortschaltung_Start_TypeClass(iD_Fortschaltung_Start_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fortschaltung_Start_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fortschaltung_Start_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FSTR_ANEINANDER_TYPE_CLASS: {
				ID_Fstr_Aneinander_TypeClass iD_Fstr_Aneinander_TypeClass = (ID_Fstr_Aneinander_TypeClass)theEObject;
				T result = caseID_Fstr_Aneinander_TypeClass(iD_Fstr_Aneinander_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fstr_Aneinander_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fstr_Aneinander_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FSTR_AUSSCHLUSS_BESONDERS_TYPE_CLASS: {
				ID_Fstr_Ausschluss_Besonders_TypeClass iD_Fstr_Ausschluss_Besonders_TypeClass = (ID_Fstr_Ausschluss_Besonders_TypeClass)theEObject;
				T result = caseID_Fstr_Ausschluss_Besonders_TypeClass(iD_Fstr_Ausschluss_Besonders_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fstr_Ausschluss_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fstr_Ausschluss_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FSTR_DWEG_TYPE_CLASS: {
				ID_Fstr_DWeg_TypeClass iD_Fstr_DWeg_TypeClass = (ID_Fstr_DWeg_TypeClass)theEObject;
				T result = caseID_Fstr_DWeg_TypeClass(iD_Fstr_DWeg_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fstr_DWeg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fstr_DWeg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FSTR_FAHRWEG_TYPE_CLASS: {
				ID_Fstr_Fahrweg_TypeClass iD_Fstr_Fahrweg_TypeClass = (ID_Fstr_Fahrweg_TypeClass)theEObject;
				T result = caseID_Fstr_Fahrweg_TypeClass(iD_Fstr_Fahrweg_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fstr_Fahrweg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fstr_Fahrweg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FSTR_ZUG_RANGIER_TYPE_CLASS: {
				ID_Fstr_Zug_Rangier_TypeClass iD_Fstr_Zug_Rangier_TypeClass = (ID_Fstr_Zug_Rangier_TypeClass)theEObject;
				T result = caseID_Fstr_Zug_Rangier_TypeClass(iD_Fstr_Zug_Rangier_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Fstr_Zug_Rangier_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Fstr_Zug_Rangier_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FT_ANSCHALTBEDINGUNG_TYPE_CLASS: {
				ID_FT_Anschaltbedingung_TypeClass iD_FT_Anschaltbedingung_TypeClass = (ID_FT_Anschaltbedingung_TypeClass)theEObject;
				T result = caseID_FT_Anschaltbedingung_TypeClass(iD_FT_Anschaltbedingung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FT_Anschaltbedingung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FT_Anschaltbedingung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_FT_FAHRWEG_TEIL_TYPE_CLASS: {
				ID_FT_Fahrweg_Teil_TypeClass iD_FT_Fahrweg_Teil_TypeClass = (ID_FT_Fahrweg_Teil_TypeClass)theEObject;
				T result = caseID_FT_Fahrweg_Teil_TypeClass(iD_FT_Fahrweg_Teil_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_FT_Fahrweg_Teil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_FT_Fahrweg_Teil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GEO_ART_TYPE_CLASS: {
				ID_GEO_Art_TypeClass iD_GEO_Art_TypeClass = (ID_GEO_Art_TypeClass)theEObject;
				T result = caseID_GEO_Art_TypeClass(iD_GEO_Art_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_GEO_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_GEO_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GEO_KNOTEN_TYPE_CLASS: {
				ID_GEO_Knoten_TypeClass iD_GEO_Knoten_TypeClass = (ID_GEO_Knoten_TypeClass)theEObject;
				T result = caseID_GEO_Knoten_TypeClass(iD_GEO_Knoten_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_GEO_Knoten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_GEO_Knoten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GEO_PUNKT_OHNE_PROXY_TYPE_CLASS: {
				ID_GEO_Punkt_ohne_Proxy_TypeClass iD_GEO_Punkt_ohne_Proxy_TypeClass = (ID_GEO_Punkt_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_GEO_Punkt_ohne_Proxy_TypeClass(iD_GEO_Punkt_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_GEO_Punkt_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_GEO_Punkt_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GEO_PUNKT_TYPE_CLASS: {
				ID_GEO_Punkt_TypeClass iD_GEO_Punkt_TypeClass = (ID_GEO_Punkt_TypeClass)theEObject;
				T result = caseID_GEO_Punkt_TypeClass(iD_GEO_Punkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_GEO_Punkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_GEO_Punkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GERAET_PROGRAMMIERT_TYPE_CLASS: {
				ID_Geraet_Programmiert_TypeClass iD_Geraet_Programmiert_TypeClass = (ID_Geraet_Programmiert_TypeClass)theEObject;
				T result = caseID_Geraet_Programmiert_TypeClass(iD_Geraet_Programmiert_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Geraet_Programmiert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Geraet_Programmiert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GFR_ANLAGE_OHNE_PROXY_TYPE_CLASS: {
				ID_GFR_Anlage_ohne_Proxy_TypeClass iD_GFR_Anlage_ohne_Proxy_TypeClass = (ID_GFR_Anlage_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_GFR_Anlage_ohne_Proxy_TypeClass(iD_GFR_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_GFR_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_GFR_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GLEIS_ABSCHNITT_TYPE_CLASS: {
				ID_Gleis_Abschnitt_TypeClass iD_Gleis_Abschnitt_TypeClass = (ID_Gleis_Abschnitt_TypeClass)theEObject;
				T result = caseID_Gleis_Abschnitt_TypeClass(iD_Gleis_Abschnitt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Gleis_Abschnitt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Gleis_Abschnitt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GLEIS_BEZEICHNUNG_TYPE_CLASS: {
				ID_Gleis_Bezeichnung_TypeClass iD_Gleis_Bezeichnung_TypeClass = (ID_Gleis_Bezeichnung_TypeClass)theEObject;
				T result = caseID_Gleis_Bezeichnung_TypeClass(iD_Gleis_Bezeichnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Gleis_Bezeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Gleis_Bezeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_GRENZZEICHEN_TYPE_CLASS: {
				ID_Grenzzeichen_TypeClass iD_Grenzzeichen_TypeClass = (ID_Grenzzeichen_TypeClass)theEObject;
				T result = caseID_Grenzzeichen_TypeClass(iD_Grenzzeichen_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Grenzzeichen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Grenzzeichen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_HANDSCHALT_WIRKFUNKTION_TYPE_CLASS: {
				ID_Handschalt_Wirkfunktion_TypeClass iD_Handschalt_Wirkfunktion_TypeClass = (ID_Handschalt_Wirkfunktion_TypeClass)theEObject;
				T result = caseID_Handschalt_Wirkfunktion_TypeClass(iD_Handschalt_Wirkfunktion_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Handschalt_Wirkfunktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Handschalt_Wirkfunktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_HOEHENPUNKT_TYPE_CLASS: {
				ID_Hoehenpunkt_TypeClass iD_Hoehenpunkt_TypeClass = (ID_Hoehenpunkt_TypeClass)theEObject;
				T result = caseID_Hoehenpunkt_TypeClass(iD_Hoehenpunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Hoehenpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Hoehenpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_INFORMATION_EINGANG_TYPE_CLASS: {
				ID_Information_Eingang_TypeClass iD_Information_Eingang_TypeClass = (ID_Information_Eingang_TypeClass)theEObject;
				T result = caseID_Information_Eingang_TypeClass(iD_Information_Eingang_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Information_Eingang_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Information_Eingang_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_INFORMATION_PRIMAER_TYPE_CLASS: {
				ID_Information_Primaer_TypeClass iD_Information_Primaer_TypeClass = (ID_Information_Primaer_TypeClass)theEObject;
				T result = caseID_Information_Primaer_TypeClass(iD_Information_Primaer_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Information_Primaer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Information_Primaer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_LEU_ANLAGE_OHNE_PROXY_TYPE_CLASS: {
				ID_LEU_Anlage_ohne_Proxy_TypeClass iD_LEU_Anlage_ohne_Proxy_TypeClass = (ID_LEU_Anlage_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_LEU_Anlage_ohne_Proxy_TypeClass(iD_LEU_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_LEU_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_LEU_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_LEU_ANLAGE_TYPE_CLASS: {
				ID_LEU_Anlage_TypeClass iD_LEU_Anlage_TypeClass = (ID_LEU_Anlage_TypeClass)theEObject;
				T result = caseID_LEU_Anlage_TypeClass(iD_LEU_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_LEU_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_LEU_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_LEU_BEZUGSPUNKT_TYPE_CLASS: {
				ID_LEU_Bezugspunkt_TypeClass iD_LEU_Bezugspunkt_TypeClass = (ID_LEU_Bezugspunkt_TypeClass)theEObject;
				T result = caseID_LEU_Bezugspunkt_TypeClass(iD_LEU_Bezugspunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_LEU_Bezugspunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_LEU_Bezugspunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_LEU_SCHALTKASTEN_OHNE_PROXY_TYPE_CLASS: {
				ID_LEU_Schaltkasten_ohne_Proxy_TypeClass iD_LEU_Schaltkasten_ohne_Proxy_TypeClass = (ID_LEU_Schaltkasten_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_LEU_Schaltkasten_ohne_Proxy_TypeClass(iD_LEU_Schaltkasten_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_LEU_Schaltkasten_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_LEU_Schaltkasten_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_LO_EINBAU_TYPE_CLASS: {
				ID_LO_Einbau_TypeClass iD_LO_Einbau_TypeClass = (ID_LO_Einbau_TypeClass)theEObject;
				T result = caseID_LO_Einbau_TypeClass(iD_LO_Einbau_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_LO_Einbau_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_LO_Einbau_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_MARKANTE_STELLE_TYPE_CLASS: {
				ID_Markante_Stelle_TypeClass iD_Markante_Stelle_TypeClass = (ID_Markante_Stelle_TypeClass)theEObject;
				T result = caseID_Markante_Stelle_TypeClass(iD_Markante_Stelle_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Markante_Stelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Markante_Stelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_MARKANTER_PUNKT_TYPE_CLASS: {
				ID_Markanter_Punkt_TypeClass iD_Markanter_Punkt_TypeClass = (ID_Markanter_Punkt_TypeClass)theEObject;
				T result = caseID_Markanter_Punkt_TypeClass(iD_Markanter_Punkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Markanter_Punkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Markanter_Punkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_NB_ELEMENT_TYPE_CLASS: {
				ID_NB_Element_TypeClass iD_NB_Element_TypeClass = (ID_NB_Element_TypeClass)theEObject;
				T result = caseID_NB_Element_TypeClass(iD_NB_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_NB_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_NB_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_NB_TYPE_CLASS: {
				ID_NB_TypeClass iD_NB_TypeClass = (ID_NB_TypeClass)theEObject;
				T result = caseID_NB_TypeClass(iD_NB_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_NB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_NB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_NB_ZONE_TYPE_CLASS: {
				ID_NB_Zone_TypeClass iD_NB_Zone_TypeClass = (ID_NB_Zone_TypeClass)theEObject;
				T result = caseID_NB_Zone_TypeClass(iD_NB_Zone_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_NB_Zone_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_NB_Zone_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_OERTLICHKEIT_PROXY_TYPE_CLASS: {
				ID_Oertlichkeit_Proxy_TypeClass iD_Oertlichkeit_Proxy_TypeClass = (ID_Oertlichkeit_Proxy_TypeClass)theEObject;
				T result = caseID_Oertlichkeit_Proxy_TypeClass(iD_Oertlichkeit_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Oertlichkeit_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Oertlichkeit_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_OERTLICHKEIT_TYPE_CLASS: {
				ID_Oertlichkeit_TypeClass iD_Oertlichkeit_TypeClass = (ID_Oertlichkeit_TypeClass)theEObject;
				T result = caseID_Oertlichkeit_TypeClass(iD_Oertlichkeit_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Oertlichkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Oertlichkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PLAN_PRO_SCHNITTSTELLE_TYPE_CLASS: {
				ID_PlanPro_Schnittstelle_TypeClass iD_PlanPro_Schnittstelle_TypeClass = (ID_PlanPro_Schnittstelle_TypeClass)theEObject;
				T result = caseID_PlanPro_Schnittstelle_TypeClass(iD_PlanPro_Schnittstelle_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_PlanPro_Schnittstelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_PlanPro_Schnittstelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PLANUNG_EINZEL_TYPE_CLASS: {
				ID_Planung_Einzel_TypeClass iD_Planung_Einzel_TypeClass = (ID_Planung_Einzel_TypeClass)theEObject;
				T result = caseID_Planung_Einzel_TypeClass(iD_Planung_Einzel_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Planung_Einzel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Planung_Einzel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PLANUNGSGRUNDLAGE_TYPE_CLASS: {
				ID_Planungsgrundlage_TypeClass iD_Planungsgrundlage_TypeClass = (ID_Planungsgrundlage_TypeClass)theEObject;
				T result = caseID_Planungsgrundlage_TypeClass(iD_Planungsgrundlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Planungsgrundlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Planungsgrundlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PZB_ELEMENT_BEZUGSPUNKT_TYPE_CLASS: {
				ID_PZB_Element_Bezugspunkt_TypeClass iD_PZB_Element_Bezugspunkt_TypeClass = (ID_PZB_Element_Bezugspunkt_TypeClass)theEObject;
				T result = caseID_PZB_Element_Bezugspunkt_TypeClass(iD_PZB_Element_Bezugspunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_PZB_Element_Bezugspunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_PZB_Element_Bezugspunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PZB_ELEMENT_MITNUTZUNG_TYPE_CLASS: {
				ID_PZB_Element_Mitnutzung_TypeClass iD_PZB_Element_Mitnutzung_TypeClass = (ID_PZB_Element_Mitnutzung_TypeClass)theEObject;
				T result = caseID_PZB_Element_Mitnutzung_TypeClass(iD_PZB_Element_Mitnutzung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_PZB_Element_Mitnutzung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_PZB_Element_Mitnutzung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PZB_ELEMENT_TYPE_CLASS: {
				ID_PZB_Element_TypeClass iD_PZB_Element_TypeClass = (ID_PZB_Element_TypeClass)theEObject;
				T result = caseID_PZB_Element_TypeClass(iD_PZB_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_PZB_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_PZB_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_PZB_ELEMENT_ZUORDNUNG_TYPE_CLASS: {
				ID_PZB_Element_Zuordnung_TypeClass iD_PZB_Element_Zuordnung_TypeClass = (ID_PZB_Element_Zuordnung_TypeClass)theEObject;
				T result = caseID_PZB_Element_Zuordnung_TypeClass(iD_PZB_Element_Zuordnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_PZB_Element_Zuordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_PZB_Element_Zuordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_QUELLELEMENT_TYPE_CLASS: {
				ID_Quellelement_TypeClass iD_Quellelement_TypeClass = (ID_Quellelement_TypeClass)theEObject;
				T result = caseID_Quellelement_TypeClass(iD_Quellelement_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Quellelement_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Quellelement_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_RBC_TYPE_CLASS: {
				ID_RBC_TypeClass iD_RBC_TypeClass = (ID_RBC_TypeClass)theEObject;
				T result = caseID_RBC_TypeClass(iD_RBC_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_RBC_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_RBC_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_REGELZEICHNUNG_TYPE_CLASS: {
				ID_Regelzeichnung_TypeClass iD_Regelzeichnung_TypeClass = (ID_Regelzeichnung_TypeClass)theEObject;
				T result = caseID_Regelzeichnung_TypeClass(iD_Regelzeichnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Regelzeichnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Regelzeichnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SCHALTER_TYPE_CLASS: {
				ID_Schalter_TypeClass iD_Schalter_TypeClass = (ID_Schalter_TypeClass)theEObject;
				T result = caseID_Schalter_TypeClass(iD_Schalter_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Schalter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Schalter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SCHALTMITTEL_ZUORDNUNG_TYPE_CLASS: {
				ID_Schaltmittel_Zuordnung_TypeClass iD_Schaltmittel_Zuordnung_TypeClass = (ID_Schaltmittel_Zuordnung_TypeClass)theEObject;
				T result = caseID_Schaltmittel_Zuordnung_TypeClass(iD_Schaltmittel_Zuordnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Schaltmittel_Zuordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Schaltmittel_Zuordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SCHLOSSKOMBINATION_TYPE_CLASS: {
				ID_Schlosskombination_TypeClass iD_Schlosskombination_TypeClass = (ID_Schlosskombination_TypeClass)theEObject;
				T result = caseID_Schlosskombination_TypeClass(iD_Schlosskombination_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Schlosskombination_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Schlosskombination_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SCHLUESSEL_TYPE_CLASS: {
				ID_Schluessel_TypeClass iD_Schluessel_TypeClass = (ID_Schluessel_TypeClass)theEObject;
				T result = caseID_Schluessel_TypeClass(iD_Schluessel_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Schluessel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Schluessel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SCHLUESSELSPERRE_TYPE_CLASS: {
				ID_Schluesselsperre_TypeClass iD_Schluesselsperre_TypeClass = (ID_Schluesselsperre_TypeClass)theEObject;
				T result = caseID_Schluesselsperre_TypeClass(iD_Schluesselsperre_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Schluesselsperre_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Schluesselsperre_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_BEFESTIGUNG_TYPE_CLASS: {
				ID_Signal_Befestigung_TypeClass iD_Signal_Befestigung_TypeClass = (ID_Signal_Befestigung_TypeClass)theEObject;
				T result = caseID_Signal_Befestigung_TypeClass(iD_Signal_Befestigung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Befestigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Befestigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_FANK_TYPE_CLASS: {
				ID_Signal_Fank_TypeClass iD_Signal_Fank_TypeClass = (ID_Signal_Fank_TypeClass)theEObject;
				T result = caseID_Signal_Fank_TypeClass(iD_Signal_Fank_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Fank_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Fank_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_GLEISBEZECHNUNG_TYPE_CLASS: {
				ID_Signal_Gleisbezechnung_TypeClass iD_Signal_Gleisbezechnung_TypeClass = (ID_Signal_Gleisbezechnung_TypeClass)theEObject;
				T result = caseID_Signal_Gleisbezechnung_TypeClass(iD_Signal_Gleisbezechnung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Gleisbezechnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Gleisbezechnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_OHNE_PROXY_TYPE_CLASS: {
				ID_Signal_ohne_Proxy_TypeClass iD_Signal_ohne_Proxy_TypeClass = (ID_Signal_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Signal_ohne_Proxy_TypeClass(iD_Signal_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_RAHMEN_TYPE_CLASS: {
				ID_Signal_Rahmen_TypeClass iD_Signal_Rahmen_TypeClass = (ID_Signal_Rahmen_TypeClass)theEObject;
				T result = caseID_Signal_Rahmen_TypeClass(iD_Signal_Rahmen_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Rahmen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Rahmen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_SIGNALBEGRIFF_TYPE_CLASS: {
				ID_Signal_Signalbegriff_TypeClass iD_Signal_Signalbegriff_TypeClass = (ID_Signal_Signalbegriff_TypeClass)theEObject;
				T result = caseID_Signal_Signalbegriff_TypeClass(iD_Signal_Signalbegriff_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Signalbegriff_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Signalbegriff_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_START_TYPE_CLASS: {
				ID_Signal_Start_TypeClass iD_Signal_Start_TypeClass = (ID_Signal_Start_TypeClass)theEObject;
				T result = caseID_Signal_Start_TypeClass(iD_Signal_Start_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_Start_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_Start_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SIGNAL_TYPE_CLASS: {
				ID_Signal_TypeClass iD_Signal_TypeClass = (ID_Signal_TypeClass)theEObject;
				T result = caseID_Signal_TypeClass(iD_Signal_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Signal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Signal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_SONDERANLAGE_TYPE_CLASS: {
				ID_Sonderanlage_TypeClass iD_Sonderanlage_TypeClass = (ID_Sonderanlage_TypeClass)theEObject;
				T result = caseID_Sonderanlage_TypeClass(iD_Sonderanlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Sonderanlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Sonderanlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_STELLELEMENT_TYPE_CLASS: {
				ID_Stellelement_TypeClass iD_Stellelement_TypeClass = (ID_Stellelement_TypeClass)theEObject;
				T result = caseID_Stellelement_TypeClass(iD_Stellelement_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Stellelement_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Stellelement_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_STELLWERK_TYPE_CLASS: {
				ID_Stellwerk_TypeClass iD_Stellwerk_TypeClass = (ID_Stellwerk_TypeClass)theEObject;
				T result = caseID_Stellwerk_TypeClass(iD_Stellwerk_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Stellwerk_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Stellwerk_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_STRECKE_PUNKT_TYPE_CLASS: {
				ID_Strecke_Punkt_TypeClass iD_Strecke_Punkt_TypeClass = (ID_Strecke_Punkt_TypeClass)theEObject;
				T result = caseID_Strecke_Punkt_TypeClass(iD_Strecke_Punkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Strecke_Punkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Strecke_Punkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_STRECKE_TYPE_CLASS: {
				ID_Strecke_TypeClass iD_Strecke_TypeClass = (ID_Strecke_TypeClass)theEObject;
				T result = caseID_Strecke_TypeClass(iD_Strecke_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Strecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Strecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TECHNISCHER_PUNKT_TYPE_CLASS: {
				ID_Technischer_Punkt_TypeClass iD_Technischer_Punkt_TypeClass = (ID_Technischer_Punkt_TypeClass)theEObject;
				T result = caseID_Technischer_Punkt_TypeClass(iD_Technischer_Punkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Technischer_Punkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Technischer_Punkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TOP_KANTE_OHNE_PROXY_TYPE_CLASS: {
				ID_TOP_Kante_ohne_Proxy_TypeClass iD_TOP_Kante_ohne_Proxy_TypeClass = (ID_TOP_Kante_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_TOP_Kante_ohne_Proxy_TypeClass(iD_TOP_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_TOP_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_TOP_Kante_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TOP_KANTE_TYPE_CLASS: {
				ID_TOP_Kante_TypeClass iD_TOP_Kante_TypeClass = (ID_TOP_Kante_TypeClass)theEObject;
				T result = caseID_TOP_Kante_TypeClass(iD_TOP_Kante_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_TOP_Kante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_TOP_Kante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TOP_KNOTEN_TYPE_CLASS: {
				ID_TOP_Knoten_TypeClass iD_TOP_Knoten_TypeClass = (ID_TOP_Knoten_TypeClass)theEObject;
				T result = caseID_TOP_Knoten_TypeClass(iD_TOP_Knoten_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_TOP_Knoten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_TOP_Knoten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TRASSE_KANTE_TYPE_CLASS: {
				ID_Trasse_Kante_TypeClass iD_Trasse_Kante_TypeClass = (ID_Trasse_Kante_TypeClass)theEObject;
				T result = caseID_Trasse_Kante_TypeClass(iD_Trasse_Kante_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Trasse_Kante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Trasse_Kante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_TRASSE_KNOTEN_TYPE_CLASS: {
				ID_Trasse_Knoten_TypeClass iD_Trasse_Knoten_TypeClass = (ID_Trasse_Knoten_TypeClass)theEObject;
				T result = caseID_Trasse_Knoten_TypeClass(iD_Trasse_Knoten_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Trasse_Knoten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Trasse_Knoten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UEBERHOEHUNG_TYPE_CLASS: {
				ID_Ueberhoehung_TypeClass iD_Ueberhoehung_TypeClass = (ID_Ueberhoehung_TypeClass)theEObject;
				T result = caseID_Ueberhoehung_TypeClass(iD_Ueberhoehung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Ueberhoehung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Ueberhoehung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UEBERTRAGUNGSWEG_NACH_TYPE_CLASS: {
				ID_Uebertragungsweg_Nach_TypeClass iD_Uebertragungsweg_Nach_TypeClass = (ID_Uebertragungsweg_Nach_TypeClass)theEObject;
				T result = caseID_Uebertragungsweg_Nach_TypeClass(iD_Uebertragungsweg_Nach_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Uebertragungsweg_Nach_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Uebertragungsweg_Nach_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UEBERTRAGUNGSWEG_VON_TYPE_CLASS: {
				ID_Uebertragungsweg_Von_TypeClass iD_Uebertragungsweg_Von_TypeClass = (ID_Uebertragungsweg_Von_TypeClass)theEObject;
				T result = caseID_Uebertragungsweg_Von_TypeClass(iD_Uebertragungsweg_Von_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Uebertragungsweg_Von_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Uebertragungsweg_Von_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UMFAHRPUNKT_TYPE_CLASS: {
				ID_Umfahrpunkt_TypeClass iD_Umfahrpunkt_TypeClass = (ID_Umfahrpunkt_TypeClass)theEObject;
				T result = caseID_Umfahrpunkt_TypeClass(iD_Umfahrpunkt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Umfahrpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Umfahrpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UNTERBRINGUNG_OHNE_PROXY_TYPE_CLASS: {
				ID_Unterbringung_ohne_Proxy_TypeClass iD_Unterbringung_ohne_Proxy_TypeClass = (ID_Unterbringung_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_Unterbringung_ohne_Proxy_TypeClass(iD_Unterbringung_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Unterbringung_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Unterbringung_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UNTERBRINGUNG_TECHNIK_TYPE_CLASS: {
				ID_Unterbringung_Technik_TypeClass iD_Unterbringung_Technik_TypeClass = (ID_Unterbringung_Technik_TypeClass)theEObject;
				T result = caseID_Unterbringung_Technik_TypeClass(iD_Unterbringung_Technik_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Unterbringung_Technik_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Unterbringung_Technik_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UNTERBRINGUNG_TYPE_CLASS: {
				ID_Unterbringung_TypeClass iD_Unterbringung_TypeClass = (ID_Unterbringung_TypeClass)theEObject;
				T result = caseID_Unterbringung_TypeClass(iD_Unterbringung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Unterbringung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Unterbringung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_UR_OBJEKT_TYPE_CLASS: {
				ID_Ur_Objekt_TypeClass iD_Ur_Objekt_TypeClass = (ID_Ur_Objekt_TypeClass)theEObject;
				T result = caseID_Ur_Objekt_TypeClass(iD_Ur_Objekt_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Ur_Objekt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Ur_Objekt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_VERKNUEPFTES_ELEMENT_TYPE_CLASS: {
				ID_Verknuepftes_Element_TypeClass iD_Verknuepftes_Element_TypeClass = (ID_Verknuepftes_Element_TypeClass)theEObject;
				T result = caseID_Verknuepftes_Element_TypeClass(iD_Verknuepftes_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Verknuepftes_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Verknuepftes_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_WKR_ANLAGE_OHNE_PROXY_TYPE_CLASS: {
				ID_W_Kr_Anlage_ohne_Proxy_TypeClass iD_W_Kr_Anlage_ohne_Proxy_TypeClass = (ID_W_Kr_Anlage_ohne_Proxy_TypeClass)theEObject;
				T result = caseID_W_Kr_Anlage_ohne_Proxy_TypeClass(iD_W_Kr_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_W_Kr_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_W_Kr_Anlage_ohne_Proxy_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_WKR_ANLAGE_TYPE_CLASS: {
				ID_W_Kr_Anlage_TypeClass iD_W_Kr_Anlage_TypeClass = (ID_W_Kr_Anlage_TypeClass)theEObject;
				T result = caseID_W_Kr_Anlage_TypeClass(iD_W_Kr_Anlage_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_W_Kr_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_W_Kr_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_WKR_GSP_ELEMENT_TYPE_CLASS: {
				ID_W_Kr_Gsp_Element_TypeClass iD_W_Kr_Gsp_Element_TypeClass = (ID_W_Kr_Gsp_Element_TypeClass)theEObject;
				T result = caseID_W_Kr_Gsp_Element_TypeClass(iD_W_Kr_Gsp_Element_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_W_Kr_Gsp_Element_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_W_Kr_Gsp_Element_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_WKR_GSP_KOMPONENTE_TYPE_CLASS: {
				ID_W_Kr_Gsp_Komponente_TypeClass iD_W_Kr_Gsp_Komponente_TypeClass = (ID_W_Kr_Gsp_Komponente_TypeClass)theEObject;
				T result = caseID_W_Kr_Gsp_Komponente_TypeClass(iD_W_Kr_Gsp_Komponente_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_W_Kr_Gsp_Komponente_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_W_Kr_Gsp_Komponente_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_WEICHENLAUFKETTE_TYPE_CLASS: {
				ID_Weichenlaufkette_TypeClass iD_Weichenlaufkette_TypeClass = (ID_Weichenlaufkette_TypeClass)theEObject;
				T result = caseID_Weichenlaufkette_TypeClass(iD_Weichenlaufkette_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Weichenlaufkette_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Weichenlaufkette_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZIEL_TYPE_CLASS: {
				ID_Ziel_TypeClass iD_Ziel_TypeClass = (ID_Ziel_TypeClass)theEObject;
				T result = caseID_Ziel_TypeClass(iD_Ziel_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Ziel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Ziel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZL_DLP_FSTR_TYPE_CLASS: {
				ID_ZL_DLP_Fstr_TypeClass iD_ZL_DLP_Fstr_TypeClass = (ID_ZL_DLP_Fstr_TypeClass)theEObject;
				T result = caseID_ZL_DLP_Fstr_TypeClass(iD_ZL_DLP_Fstr_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZL_DLP_Fstr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZL_DLP_Fstr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZL_FSTR_TYPE_CLASS: {
				ID_ZL_Fstr_TypeClass iD_ZL_Fstr_TypeClass = (ID_ZL_Fstr_TypeClass)theEObject;
				T result = caseID_ZL_Fstr_TypeClass(iD_ZL_Fstr_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZL_Fstr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZL_Fstr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZL_SIGNALGRUPPE_TYPE_CLASS: {
				ID_ZL_Signalgruppe_TypeClass iD_ZL_Signalgruppe_TypeClass = (ID_ZL_Signalgruppe_TypeClass)theEObject;
				T result = caseID_ZL_Signalgruppe_TypeClass(iD_ZL_Signalgruppe_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZL_Signalgruppe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZL_Signalgruppe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZL_TYPE_CLASS: {
				ID_ZL_TypeClass iD_ZL_TypeClass = (ID_ZL_TypeClass)theEObject;
				T result = caseID_ZL_TypeClass(iD_ZL_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZL_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZL_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZLV_BUS_TYPE_CLASS: {
				ID_ZLV_Bus_TypeClass iD_ZLV_Bus_TypeClass = (ID_ZLV_Bus_TypeClass)theEObject;
				T result = caseID_ZLV_Bus_TypeClass(iD_ZLV_Bus_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZLV_Bus_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZLV_Bus_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_ANZEIGEFELD_ANSTOSS_TYPE_CLASS: {
				ID_ZN_Anzeigefeld_Anstoss_TypeClass iD_ZN_Anzeigefeld_Anstoss_TypeClass = (ID_ZN_Anzeigefeld_Anstoss_TypeClass)theEObject;
				T result = caseID_ZN_Anzeigefeld_Anstoss_TypeClass(iD_ZN_Anzeigefeld_Anstoss_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_Anzeigefeld_Anstoss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_Anzeigefeld_Anstoss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_ANZEIGEFELD_TYPE_CLASS: {
				ID_ZN_Anzeigefeld_TypeClass iD_ZN_Anzeigefeld_TypeClass = (ID_ZN_Anzeigefeld_TypeClass)theEObject;
				T result = caseID_ZN_Anzeigefeld_TypeClass(iD_ZN_Anzeigefeld_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_Anzeigefeld_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_Anzeigefeld_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_FORTSCHALT_KRITERIUM_TYPE_CLASS: {
				ID_ZN_Fortschalt_Kriterium_TypeClass iD_ZN_Fortschalt_Kriterium_TypeClass = (ID_ZN_Fortschalt_Kriterium_TypeClass)theEObject;
				T result = caseID_ZN_Fortschalt_Kriterium_TypeClass(iD_ZN_Fortschalt_Kriterium_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_Fortschalt_Kriterium_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_Fortschalt_Kriterium_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_TYPE_CLASS: {
				ID_ZN_TypeClass iD_ZN_TypeClass = (ID_ZN_TypeClass)theEObject;
				T result = caseID_ZN_TypeClass(iD_ZN_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_UNTERSTATION_TYPE_CLASS: {
				ID_ZN_Unterstation_TypeClass iD_ZN_Unterstation_TypeClass = (ID_ZN_Unterstation_TypeClass)theEObject;
				T result = caseID_ZN_Unterstation_TypeClass(iD_ZN_Unterstation_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_Unterstation_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_Unterstation_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZN_ZBS_TYPE_CLASS: {
				ID_ZN_ZBS_TypeClass iD_ZN_ZBS_TypeClass = (ID_ZN_ZBS_TypeClass)theEObject;
				T result = caseID_ZN_ZBS_TypeClass(iD_ZN_ZBS_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_ZN_ZBS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_ZN_ZBS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZUGEINWIRKUNG_TYPE_CLASS: {
				ID_Zugeinwirkung_TypeClass iD_Zugeinwirkung_TypeClass = (ID_Zugeinwirkung_TypeClass)theEObject;
				T result = caseID_Zugeinwirkung_TypeClass(iD_Zugeinwirkung_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Zugeinwirkung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Zugeinwirkung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerweisePackage.ID_ZWEITES_HALTFALLKRITERIUM_TYPE_CLASS: {
				ID_Zweites_Haltfallkriterium_TypeClass iD_Zweites_Haltfallkriterium_TypeClass = (ID_Zweites_Haltfallkriterium_TypeClass)theEObject;
				T result = caseID_Zweites_Haltfallkriterium_TypeClass(iD_Zweites_Haltfallkriterium_TypeClass);
				if (result == null) result = caseZeiger_TypeClass(iD_Zweites_Haltfallkriterium_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iD_Zweites_Haltfallkriterium_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Anforderer Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Anforderer Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Anforderer_Element_TypeClass(ID_Anforderer_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Anforderung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Anforderung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Anforderung_TypeClass(ID_Anforderung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Anhang ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Anhang ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Anhang_ohne_Proxy_TypeClass(ID_Anhang_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Anhang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Anhang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Anhang_TypeClass(ID_Anhang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Anschluss Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Anschluss Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Anschluss_Element_TypeClass(ID_Anschluss_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Ausgabe Fachdaten ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass(ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Aussenelementansteuerung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Aussenelementansteuerung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Aussenelementansteuerung_TypeClass(ID_Aussenelementansteuerung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bahnsteig Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bahnsteig Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bahnsteig_Anlage_TypeClass(ID_Bahnsteig_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bahnsteig Kante ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bahnsteig_Kante_ohne_Proxy_TypeClass(ID_Bahnsteig_Kante_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bahnsteig Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bahnsteig Kante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bahnsteig_Kante_TypeClass(ID_Bahnsteig_Kante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Balise ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Balise ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Balise_ohne_Proxy_TypeClass(ID_Balise_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Balise Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Balise Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Balise_TypeClass(ID_Balise_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Basis Objekt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Basis Objekt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Basis_Objekt_TypeClass(ID_Basis_Objekt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bearbeitungsvermerk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bearbeitungsvermerk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bearbeitungsvermerk_TypeClass(ID_Bearbeitungsvermerk_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Anzeige Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Anzeige Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Anzeige_Element_TypeClass(ID_Bedien_Anzeige_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Bezirk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Bezirk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Bezirk_TypeClass(ID_Bedien_Bezirk_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Einrichtung Oertlich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Einrichtung Oertlich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Einrichtung_Oertlich_TypeClass(ID_Bedien_Einrichtung_Oertlich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Oberflaeche Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Oberflaeche Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Oberflaeche_TypeClass(ID_Bedien_Oberflaeche_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Standort Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Standort Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Standort_TypeClass(ID_Bedien_Standort_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Bedien Zentrale Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Bedien Zentrale Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Bedien_Zentrale_TypeClass(ID_Bedien_Zentrale_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Beginn Bereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Beginn Bereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Beginn_Bereich_TypeClass(ID_Beginn_Bereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Binaerdatei ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Binaerdatei ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Binaerdatei_ohne_Proxy_TypeClass(ID_Binaerdatei_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Block Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Block Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Block_Anlage_TypeClass(ID_Block_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Block Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Block Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Block_Element_TypeClass(ID_Block_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Block Strecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Block Strecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Block_Strecke_TypeClass(ID_Block_Strecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Anlage ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Anlage ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Anlage_ohne_Proxy_TypeClass(ID_BUE_Anlage_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Anlage_TypeClass(ID_BUE_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Bedien Anzeige Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Bedien Anzeige Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Bedien_Anzeige_Element_TypeClass(ID_BUE_Bedien_Anzeige_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Einschaltung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Einschaltung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Einschaltung_TypeClass(ID_BUE_Einschaltung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Gleisbezogener Gefahrraum Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Gleisbezogener_Gefahrraum_TypeClass(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE Schnittstelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE Schnittstelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_Schnittstelle_TypeClass(ID_BUE_Schnittstelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID BUE WS Fstr Zuordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID BUE WS Fstr Zuordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_BUE_WS_Fstr_Zuordnung_TypeClass(ID_BUE_WS_Fstr_Zuordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Datenpunkt ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Datenpunkt ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Datenpunkt_ohne_Proxy_TypeClass(ID_Datenpunkt_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Datenpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Datenpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Datenpunkt_TypeClass(ID_Datenpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID DP Bezugspunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID DP Bezugspunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_DP_Bezugspunkt_TypeClass(ID_DP_Bezugspunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Einschaltpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Einschaltpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Einschaltpunkt_TypeClass(ID_Einschaltpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Element Grenze Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Element Grenze Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Element_Grenze_TypeClass(ID_Element_Grenze_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Element_TypeClass(ID_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Element Unterbringung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Element Unterbringung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Element_Unterbringung_TypeClass(ID_Element_Unterbringung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Energie Eingang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Energie Eingang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Energie_Eingang_TypeClass(ID_Energie_Eingang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Energie Primaer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Energie Primaer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Energie_Primaer_TypeClass(ID_Energie_Primaer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ESTW Zentraleinheit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ESTW Zentraleinheit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ESTW_Zentraleinheit_TypeClass(ID_ESTW_Zentraleinheit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ETCS Knoten ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ETCS Knoten ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ETCS_Knoten_ohne_Proxy_TypeClass(ID_ETCS_Knoten_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ETCS Knoten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ETCS Knoten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ETCS_Knoten_TypeClass(ID_ETCS_Knoten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID EV Modul Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID EV Modul Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_EV_Modul_TypeClass(ID_EV_Modul_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fachtelegramm Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fachtelegramm Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fachtelegramm_TypeClass(ID_Fachtelegramm_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fla Schutz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fla Schutz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fla_Schutz_TypeClass(ID_Fla_Schutz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FMA Anlage Rangier Frei Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FMA Anlage Rangier Frei Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FMA_Anlage_Rangier_Frei_TypeClass(ID_FMA_Anlage_Rangier_Frei_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FMA Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FMA Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FMA_Anlage_TypeClass(ID_FMA_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FMA Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FMA Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FMA_Element_TypeClass(ID_FMA_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FMA Komponente Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FMA Komponente Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FMA_Komponente_TypeClass(ID_FMA_Komponente_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fortschaltung Start Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fortschaltung Start Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fortschaltung_Start_TypeClass(ID_Fortschaltung_Start_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fstr Aneinander Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fstr Aneinander Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fstr_Aneinander_TypeClass(ID_Fstr_Aneinander_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fstr Ausschluss Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fstr Ausschluss Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fstr_Ausschluss_Besonders_TypeClass(ID_Fstr_Ausschluss_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fstr DWeg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fstr DWeg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fstr_DWeg_TypeClass(ID_Fstr_DWeg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fstr Fahrweg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fstr Fahrweg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fstr_Fahrweg_TypeClass(ID_Fstr_Fahrweg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Fstr Zug Rangier Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Fstr Zug Rangier Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Fstr_Zug_Rangier_TypeClass(ID_Fstr_Zug_Rangier_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FT Anschaltbedingung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FT Anschaltbedingung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FT_Anschaltbedingung_TypeClass(ID_FT_Anschaltbedingung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID FT Fahrweg Teil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID FT Fahrweg Teil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_FT_Fahrweg_Teil_TypeClass(ID_FT_Fahrweg_Teil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID GEO Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID GEO Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_GEO_Art_TypeClass(ID_GEO_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID GEO Knoten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID GEO Knoten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_GEO_Knoten_TypeClass(ID_GEO_Knoten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID GEO Punkt ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID GEO Punkt ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_GEO_Punkt_ohne_Proxy_TypeClass(ID_GEO_Punkt_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID GEO Punkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID GEO Punkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_GEO_Punkt_TypeClass(ID_GEO_Punkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Geraet Programmiert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Geraet Programmiert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Geraet_Programmiert_TypeClass(ID_Geraet_Programmiert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID GFR Anlage ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID GFR Anlage ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_GFR_Anlage_ohne_Proxy_TypeClass(ID_GFR_Anlage_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Gleis Abschnitt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Gleis Abschnitt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Gleis_Abschnitt_TypeClass(ID_Gleis_Abschnitt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Gleis Bezeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Gleis Bezeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Gleis_Bezeichnung_TypeClass(ID_Gleis_Bezeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Grenzzeichen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Grenzzeichen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Grenzzeichen_TypeClass(ID_Grenzzeichen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Handschalt Wirkfunktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Handschalt Wirkfunktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Handschalt_Wirkfunktion_TypeClass(ID_Handschalt_Wirkfunktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Hoehenpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Hoehenpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Hoehenpunkt_TypeClass(ID_Hoehenpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Information Eingang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Information Eingang Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Information_Eingang_TypeClass(ID_Information_Eingang_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Information Primaer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Information Primaer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Information_Primaer_TypeClass(ID_Information_Primaer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID LEU Anlage ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID LEU Anlage ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_LEU_Anlage_ohne_Proxy_TypeClass(ID_LEU_Anlage_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID LEU Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID LEU Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_LEU_Anlage_TypeClass(ID_LEU_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID LEU Bezugspunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID LEU Bezugspunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_LEU_Bezugspunkt_TypeClass(ID_LEU_Bezugspunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID LEU Schaltkasten ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_LEU_Schaltkasten_ohne_Proxy_TypeClass(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID LO Einbau Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID LO Einbau Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_LO_Einbau_TypeClass(ID_LO_Einbau_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Markante Stelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Markante Stelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Markante_Stelle_TypeClass(ID_Markante_Stelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Markanter Punkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Markanter Punkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Markanter_Punkt_TypeClass(ID_Markanter_Punkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID NB Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID NB Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_NB_Element_TypeClass(ID_NB_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID NB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID NB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_NB_TypeClass(ID_NB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID NB Zone Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID NB Zone Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_NB_Zone_TypeClass(ID_NB_Zone_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Oertlichkeit Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Oertlichkeit Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Oertlichkeit_Proxy_TypeClass(ID_Oertlichkeit_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Oertlichkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Oertlichkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Oertlichkeit_TypeClass(ID_Oertlichkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Plan Pro Schnittstelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Plan Pro Schnittstelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_PlanPro_Schnittstelle_TypeClass(ID_PlanPro_Schnittstelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Planung Einzel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Planung Einzel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Planung_Einzel_TypeClass(ID_Planung_Einzel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Planungsgrundlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Planungsgrundlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Planungsgrundlage_TypeClass(ID_Planungsgrundlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID PZB Element Bezugspunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID PZB Element Bezugspunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_PZB_Element_Bezugspunkt_TypeClass(ID_PZB_Element_Bezugspunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID PZB Element Mitnutzung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID PZB Element Mitnutzung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_PZB_Element_Mitnutzung_TypeClass(ID_PZB_Element_Mitnutzung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID PZB Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID PZB Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_PZB_Element_TypeClass(ID_PZB_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID PZB Element Zuordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID PZB Element Zuordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_PZB_Element_Zuordnung_TypeClass(ID_PZB_Element_Zuordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Quellelement Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Quellelement Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Quellelement_TypeClass(ID_Quellelement_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID RBC Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID RBC Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_RBC_TypeClass(ID_RBC_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Regelzeichnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Regelzeichnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Regelzeichnung_TypeClass(ID_Regelzeichnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Schalter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Schalter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Schalter_TypeClass(ID_Schalter_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Schaltmittel Zuordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Schaltmittel Zuordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Schaltmittel_Zuordnung_TypeClass(ID_Schaltmittel_Zuordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Schlosskombination Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Schlosskombination Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Schlosskombination_TypeClass(ID_Schlosskombination_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Schluessel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Schluessel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Schluessel_TypeClass(ID_Schluessel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Schluesselsperre Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Schluesselsperre Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Schluesselsperre_TypeClass(ID_Schluesselsperre_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Befestigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Befestigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Befestigung_TypeClass(ID_Signal_Befestigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Fank Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Fank Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Fank_TypeClass(ID_Signal_Fank_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Gleisbezechnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Gleisbezechnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Gleisbezechnung_TypeClass(ID_Signal_Gleisbezechnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_ohne_Proxy_TypeClass(ID_Signal_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Rahmen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Rahmen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Rahmen_TypeClass(ID_Signal_Rahmen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Signalbegriff Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Signalbegriff Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Signalbegriff_TypeClass(ID_Signal_Signalbegriff_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Start Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Start Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_Start_TypeClass(ID_Signal_Start_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Signal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Signal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Signal_TypeClass(ID_Signal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Sonderanlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Sonderanlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Sonderanlage_TypeClass(ID_Sonderanlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Stellelement Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Stellelement Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Stellelement_TypeClass(ID_Stellelement_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Stellwerk Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Stellwerk Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Stellwerk_TypeClass(ID_Stellwerk_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Strecke Punkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Strecke Punkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Strecke_Punkt_TypeClass(ID_Strecke_Punkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Strecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Strecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Strecke_TypeClass(ID_Strecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Technischer Punkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Technischer Punkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Technischer_Punkt_TypeClass(ID_Technischer_Punkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID TOP Kante ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID TOP Kante ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_TOP_Kante_ohne_Proxy_TypeClass(ID_TOP_Kante_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID TOP Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID TOP Kante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_TOP_Kante_TypeClass(ID_TOP_Kante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID TOP Knoten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID TOP Knoten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_TOP_Knoten_TypeClass(ID_TOP_Knoten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Trasse Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Trasse Kante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Trasse_Kante_TypeClass(ID_Trasse_Kante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Trasse Knoten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Trasse Knoten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Trasse_Knoten_TypeClass(ID_Trasse_Knoten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Ueberhoehung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Ueberhoehung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Ueberhoehung_TypeClass(ID_Ueberhoehung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Uebertragungsweg Nach Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Uebertragungsweg Nach Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Uebertragungsweg_Nach_TypeClass(ID_Uebertragungsweg_Nach_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Uebertragungsweg Von Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Uebertragungsweg Von Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Uebertragungsweg_Von_TypeClass(ID_Uebertragungsweg_Von_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Umfahrpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Umfahrpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Umfahrpunkt_TypeClass(ID_Umfahrpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Unterbringung ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Unterbringung ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Unterbringung_ohne_Proxy_TypeClass(ID_Unterbringung_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Unterbringung Technik Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Unterbringung Technik Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Unterbringung_Technik_TypeClass(ID_Unterbringung_Technik_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Unterbringung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Unterbringung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Unterbringung_TypeClass(ID_Unterbringung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Ur Objekt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Ur Objekt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Ur_Objekt_TypeClass(ID_Ur_Objekt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Verknuepftes Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Verknuepftes Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Verknuepftes_Element_TypeClass(ID_Verknuepftes_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID WKr Anlage ohne Proxy Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID WKr Anlage ohne Proxy Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_W_Kr_Anlage_ohne_Proxy_TypeClass(ID_W_Kr_Anlage_ohne_Proxy_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID WKr Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID WKr Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_W_Kr_Anlage_TypeClass(ID_W_Kr_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID WKr Gsp Element Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID WKr Gsp Element Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_W_Kr_Gsp_Element_TypeClass(ID_W_Kr_Gsp_Element_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID WKr Gsp Komponente Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID WKr Gsp Komponente Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_W_Kr_Gsp_Komponente_TypeClass(ID_W_Kr_Gsp_Komponente_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Weichenlaufkette Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Weichenlaufkette Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Weichenlaufkette_TypeClass(ID_Weichenlaufkette_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Ziel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Ziel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Ziel_TypeClass(ID_Ziel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZL DLP Fstr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZL DLP Fstr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZL_DLP_Fstr_TypeClass(ID_ZL_DLP_Fstr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZL Fstr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZL Fstr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZL_Fstr_TypeClass(ID_ZL_Fstr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZL Signalgruppe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZL Signalgruppe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZL_Signalgruppe_TypeClass(ID_ZL_Signalgruppe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZL Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZL Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZL_TypeClass(ID_ZL_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZLV Bus Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZLV Bus Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZLV_Bus_TypeClass(ID_ZLV_Bus_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN Anzeigefeld Anstoss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN Anzeigefeld Anstoss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_Anzeigefeld_Anstoss_TypeClass(ID_ZN_Anzeigefeld_Anstoss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN Anzeigefeld Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN Anzeigefeld Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_Anzeigefeld_TypeClass(ID_ZN_Anzeigefeld_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN Fortschalt Kriterium Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN Fortschalt Kriterium Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_Fortschalt_Kriterium_TypeClass(ID_ZN_Fortschalt_Kriterium_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_TypeClass(ID_ZN_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN Unterstation Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN Unterstation Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_Unterstation_TypeClass(ID_ZN_Unterstation_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID ZN ZBS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID ZN ZBS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_ZN_ZBS_TypeClass(ID_ZN_ZBS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Zugeinwirkung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Zugeinwirkung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Zugeinwirkung_TypeClass(ID_Zugeinwirkung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Zweites Haltfallkriterium Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Zweites Haltfallkriterium Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID_Zweites_Haltfallkriterium_TypeClass(ID_Zweites_Haltfallkriterium_TypeClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Zeiger Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeiger Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeiger_TypeClass(Zeiger_TypeClass object) {
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

} //VerweiseSwitch
