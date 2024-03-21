/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.*;

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
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage
 * @generated
 */
public class ZugnummernmeldeanlageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ZugnummernmeldeanlagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZugnummernmeldeanlageSwitch() {
		if (modelPackage == null) {
			modelPackage = ZugnummernmeldeanlagePackage.eINSTANCE;
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
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_ANB_ANN_TYPE_CLASS: {
				Akustikdauer_Anb_Ann_TypeClass akustikdauer_Anb_Ann_TypeClass = (Akustikdauer_Anb_Ann_TypeClass)theEObject;
				T result = caseAkustikdauer_Anb_Ann_TypeClass(akustikdauer_Anb_Ann_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(akustikdauer_Anb_Ann_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_SONST_TYPE_CLASS: {
				Akustikdauer_Sonst_TypeClass akustikdauer_Sonst_TypeClass = (Akustikdauer_Sonst_TypeClass)theEObject;
				T result = caseAkustikdauer_Sonst_TypeClass(akustikdauer_Sonst_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(akustikdauer_Sonst_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_VORANZ_TYPE_CLASS: {
				Akustikdauer_Voranz_TypeClass akustikdauer_Voranz_TypeClass = (Akustikdauer_Voranz_TypeClass)theEObject;
				T result = caseAkustikdauer_Voranz_TypeClass(akustikdauer_Voranz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(akustikdauer_Voranz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE_CLASS: {
				Anschlussnummer_TypeClass anschlussnummer_TypeClass = (Anschlussnummer_TypeClass)theEObject;
				T result = caseAnschlussnummer_TypeClass(anschlussnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anschlussnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_GEGENGLEIS_TYPE_CLASS: {
				Ausfahrdruck_Gegengleis_TypeClass ausfahrdruck_Gegengleis_TypeClass = (Ausfahrdruck_Gegengleis_TypeClass)theEObject;
				T result = caseAusfahrdruck_Gegengleis_TypeClass(ausfahrdruck_Gegengleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausfahrdruck_Gegengleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_TYPE_CLASS: {
				Ausfahrdruck_TypeClass ausfahrdruck_TypeClass = (Ausfahrdruck_TypeClass)theEObject;
				T result = caseAusfahrdruck_TypeClass(ausfahrdruck_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausfahrdruck_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BEDIENBARKEIT_ANZEIGEFELD_TYPE_CLASS: {
				Bedienbarkeit_Anzeigefeld_TypeClass bedienbarkeit_Anzeigefeld_TypeClass = (Bedienbarkeit_Anzeigefeld_TypeClass)theEObject;
				T result = caseBedienbarkeit_Anzeigefeld_TypeClass(bedienbarkeit_Anzeigefeld_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedienbarkeit_Anzeigefeld_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE_CLASS: {
				Besonderes_Schaltkriterium_TypeClass besonderes_Schaltkriterium_TypeClass = (Besonderes_Schaltkriterium_TypeClass)theEObject;
				T result = caseBesonderes_Schaltkriterium_TypeClass(besonderes_Schaltkriterium_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(besonderes_Schaltkriterium_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE_CLASS: {
				Bezeichnung_Besondere_Anlage_TypeClass bezeichnung_Besondere_Anlage_TypeClass = (Bezeichnung_Besondere_Anlage_TypeClass)theEObject;
				T result = caseBezeichnung_Besondere_Anlage_TypeClass(bezeichnung_Besondere_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Besondere_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BF_KENNUNG_TYPE_CLASS: {
				Bf_Kennung_TypeClass bf_Kennung_TypeClass = (Bf_Kennung_TypeClass)theEObject;
				T result = caseBf_Kennung_TypeClass(bf_Kennung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bf_Kennung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BF_NR_ANB_TYPE_CLASS: {
				Bf_Nr_ANB_TypeClass bf_Nr_ANB_TypeClass = (Bf_Nr_ANB_TypeClass)theEObject;
				T result = caseBf_Nr_ANB_TypeClass(bf_Nr_ANB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bf_Nr_ANB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE_CLASS: {
				Bf_Nr_TypeClass bf_Nr_TypeClass = (Bf_Nr_TypeClass)theEObject;
				T result = caseBf_Nr_TypeClass(bf_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bf_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.BF_NR_ZN_ATYPE_CLASS: {
				Bf_Nr_ZN_A_TypeClass bf_Nr_ZN_A_TypeClass = (Bf_Nr_ZN_A_TypeClass)theEObject;
				T result = caseBf_Nr_ZN_A_TypeClass(bf_Nr_ZN_A_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bf_Nr_ZN_A_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.DURCHFAHRDRUCK_TYPE_CLASS: {
				Durchfahrdruck_TypeClass durchfahrdruck_TypeClass = (Durchfahrdruck_TypeClass)theEObject;
				T result = caseDurchfahrdruck_TypeClass(durchfahrdruck_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(durchfahrdruck_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_GEGENGLEIS_TYPE_CLASS: {
				Einfahrdruck_Gegengleis_TypeClass einfahrdruck_Gegengleis_TypeClass = (Einfahrdruck_Gegengleis_TypeClass)theEObject;
				T result = caseEinfahrdruck_Gegengleis_TypeClass(einfahrdruck_Gegengleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einfahrdruck_Gegengleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_TYPE_CLASS: {
				Einfahrdruck_TypeClass einfahrdruck_TypeClass = (Einfahrdruck_TypeClass)theEObject;
				T result = caseEinfahrdruck_TypeClass(einfahrdruck_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einfahrdruck_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.EINWAHLSTELLE_TYPE_CLASS: {
				Einwahlstelle_TypeClass einwahlstelle_TypeClass = (Einwahlstelle_TypeClass)theEObject;
				T result = caseEinwahlstelle_TypeClass(einwahlstelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einwahlstelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.FUNKTIONALITAET_ANZEIGEFELD_TYPE_CLASS: {
				Funktionalitaet_Anzeigefeld_TypeClass funktionalitaet_Anzeigefeld_TypeClass = (Funktionalitaet_Anzeigefeld_TypeClass)theEObject;
				T result = caseFunktionalitaet_Anzeigefeld_TypeClass(funktionalitaet_Anzeigefeld_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(funktionalitaet_Anzeigefeld_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.HOA_TYPE_CLASS: {
				HOA_TypeClass hoA_TypeClass = (HOA_TypeClass)theEObject;
				T result = caseHOA_TypeClass(hoA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE_CLASS: {
				IP_Adresse_TypeClass iP_Adresse_TypeClass = (IP_Adresse_TypeClass)theEObject;
				T result = caseIP_Adresse_TypeClass(iP_Adresse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(iP_Adresse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.KOPPELUNTERSTATION_TYPE_CLASS: {
				Koppelunterstation_TypeClass koppelunterstation_TypeClass = (Koppelunterstation_TypeClass)theEObject;
				T result = caseKoppelunterstation_TypeClass(koppelunterstation_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(koppelunterstation_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.KUS_ZEITTELEGRAMM_TYPE_CLASS: {
				KUs_Zeittelegramm_TypeClass kUs_Zeittelegramm_TypeClass = (KUs_Zeittelegramm_TypeClass)theEObject;
				T result = caseKUs_Zeittelegramm_TypeClass(kUs_Zeittelegramm_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(kUs_Zeittelegramm_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.MELDEDRUCK_TYPE_CLASS: {
				Meldedruck_TypeClass meldedruck_TypeClass = (Meldedruck_TypeClass)theEObject;
				T result = caseMeldedruck_TypeClass(meldedruck_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(meldedruck_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE_CLASS: {
				Prioritaet_TypeClass prioritaet_TypeClass = (Prioritaet_TypeClass)theEObject;
				T result = casePrioritaet_TypeClass(prioritaet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(prioritaet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.REAKTIVIERUNGSFUNKTION_TYPE_CLASS: {
				Reaktivierungsfunktion_TypeClass reaktivierungsfunktion_TypeClass = (Reaktivierungsfunktion_TypeClass)theEObject;
				T result = caseReaktivierungsfunktion_TypeClass(reaktivierungsfunktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(reaktivierungsfunktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.SICHTBARKEIT_ANZEIGEFELD_TYPE_CLASS: {
				Sichtbarkeit_Anzeigefeld_TypeClass sichtbarkeit_Anzeigefeld_TypeClass = (Sichtbarkeit_Anzeigefeld_TypeClass)theEObject;
				T result = caseSichtbarkeit_Anzeigefeld_TypeClass(sichtbarkeit_Anzeigefeld_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sichtbarkeit_Anzeigefeld_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_02_TYPE_CLASS: {
				Telegramm_02_TypeClass telegramm_02_TypeClass = (Telegramm_02_TypeClass)theEObject;
				T result = caseTelegramm_02_TypeClass(telegramm_02_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_02_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_03_TYPE_CLASS: {
				Telegramm_03_TypeClass telegramm_03_TypeClass = (Telegramm_03_TypeClass)theEObject;
				T result = caseTelegramm_03_TypeClass(telegramm_03_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_03_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_04_TYPE_CLASS: {
				Telegramm_04_TypeClass telegramm_04_TypeClass = (Telegramm_04_TypeClass)theEObject;
				T result = caseTelegramm_04_TypeClass(telegramm_04_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_04_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_10_TYPE_CLASS: {
				Telegramm_10_TypeClass telegramm_10_TypeClass = (Telegramm_10_TypeClass)theEObject;
				T result = caseTelegramm_10_TypeClass(telegramm_10_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_10_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_21_TYPE_CLASS: {
				Telegramm_21_TypeClass telegramm_21_TypeClass = (Telegramm_21_TypeClass)theEObject;
				T result = caseTelegramm_21_TypeClass(telegramm_21_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_21_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_30_TYPE_CLASS: {
				Telegramm_30_TypeClass telegramm_30_TypeClass = (Telegramm_30_TypeClass)theEObject;
				T result = caseTelegramm_30_TypeClass(telegramm_30_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_30_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP: {
				Telegramm_84_Alle_Fstr_AttributeGroup telegramm_84_Alle_Fstr_AttributeGroup = (Telegramm_84_Alle_Fstr_AttributeGroup)theEObject;
				T result = caseTelegramm_84_Alle_Fstr_AttributeGroup(telegramm_84_Alle_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP: {
				Telegramm_84_Einzelne_Fstr_AttributeGroup telegramm_84_Einzelne_Fstr_AttributeGroup = (Telegramm_84_Einzelne_Fstr_AttributeGroup)theEObject;
				T result = caseTelegramm_84_Einzelne_Fstr_AttributeGroup(telegramm_84_Einzelne_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_FUER_ALLE_FSTR_TYPE_CLASS: {
				Telegramm_84_Fuer_Alle_Fstr_TypeClass telegramm_84_Fuer_Alle_Fstr_TypeClass = (Telegramm_84_Fuer_Alle_Fstr_TypeClass)theEObject;
				T result = caseTelegramm_84_Fuer_Alle_Fstr_TypeClass(telegramm_84_Fuer_Alle_Fstr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_84_Fuer_Alle_Fstr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_VERZICHT_TYPE_CLASS: {
				Telegramm_84_Verzicht_TypeClass telegramm_84_Verzicht_TypeClass = (Telegramm_84_Verzicht_TypeClass)theEObject;
				T result = caseTelegramm_84_Verzicht_TypeClass(telegramm_84_Verzicht_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_84_Verzicht_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP: {
				Telegramm_85_Alle_Fstr_AttributeGroup telegramm_85_Alle_Fstr_AttributeGroup = (Telegramm_85_Alle_Fstr_AttributeGroup)theEObject;
				T result = caseTelegramm_85_Alle_Fstr_AttributeGroup(telegramm_85_Alle_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP: {
				Telegramm_85_Einzelne_Fstr_AttributeGroup telegramm_85_Einzelne_Fstr_AttributeGroup = (Telegramm_85_Einzelne_Fstr_AttributeGroup)theEObject;
				T result = caseTelegramm_85_Einzelne_Fstr_AttributeGroup(telegramm_85_Einzelne_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_FUER_ALLE_FSTR_TYPE_CLASS: {
				Telegramm_85_Fuer_Alle_Fstr_TypeClass telegramm_85_Fuer_Alle_Fstr_TypeClass = (Telegramm_85_Fuer_Alle_Fstr_TypeClass)theEObject;
				T result = caseTelegramm_85_Fuer_Alle_Fstr_TypeClass(telegramm_85_Fuer_Alle_Fstr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegramm_85_Fuer_Alle_Fstr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.TELEGRAMMWIEDERHOLUNG_TYPE_CLASS: {
				Telegrammwiederholung_TypeClass telegrammwiederholung_TypeClass = (Telegrammwiederholung_TypeClass)theEObject;
				T result = caseTelegrammwiederholung_TypeClass(telegrammwiederholung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegrammwiederholung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE_CLASS: {
				Unterstation_Max_TypeClass unterstation_Max_TypeClass = (Unterstation_Max_TypeClass)theEObject;
				T result = caseUnterstation_Max_TypeClass(unterstation_Max_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(unterstation_Max_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE_CLASS: {
				Unterstation_Nr_TypeClass unterstation_Nr_TypeClass = (Unterstation_Nr_TypeClass)theEObject;
				T result = caseUnterstation_Nr_TypeClass(unterstation_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(unterstation_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE_CLASS: {
				Verzoegerung_Manuell_Loeschung_TypeClass verzoegerung_Manuell_Loeschung_TypeClass = (Verzoegerung_Manuell_Loeschung_TypeClass)theEObject;
				T result = caseVerzoegerung_Manuell_Loeschung_TypeClass(verzoegerung_Manuell_Loeschung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verzoegerung_Manuell_Loeschung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.VORMELDESTART_TYPE_CLASS: {
				Vormeldestart_TypeClass vormeldestart_TypeClass = (Vormeldestart_TypeClass)theEObject;
				T result = caseVormeldestart_TypeClass(vormeldestart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vormeldestart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE_CLASS: {
				ZBS_Adresse_TypeClass zbS_Adresse_TypeClass = (ZBS_Adresse_TypeClass)theEObject;
				T result = caseZBS_Adresse_TypeClass(zbS_Adresse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_Adresse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZBS_ANBINDUNG_TYPE_CLASS: {
				ZBS_Anbindung_TypeClass zbS_Anbindung_TypeClass = (ZBS_Anbindung_TypeClass)theEObject;
				T result = caseZBS_Anbindung_TypeClass(zbS_Anbindung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_Anbindung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZBS_SCHNITTSTELLE_TYPE_CLASS: {
				ZBS_Schnittstelle_TypeClass zbS_Schnittstelle_TypeClass = (ZBS_Schnittstelle_TypeClass)theEObject;
				T result = caseZBS_Schnittstelle_TypeClass(zbS_Schnittstelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_Schnittstelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZEITSYNCHRONISATION_FUNKUHR_TYPE_CLASS: {
				Zeitsynchronisation_Funkuhr_TypeClass zeitsynchronisation_Funkuhr_TypeClass = (Zeitsynchronisation_Funkuhr_TypeClass)theEObject;
				T result = caseZeitsynchronisation_Funkuhr_TypeClass(zeitsynchronisation_Funkuhr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zeitsynchronisation_Funkuhr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS: {
				ZLV_Bus zlV_Bus = (ZLV_Bus)theEObject;
				T result = caseZLV_Bus(zlV_Bus);
				if (result == null) result = caseBasis_Objekt(zlV_Bus);
				if (result == null) result = caseUr_Objekt(zlV_Bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP: {
				ZLV_Bus_Allg_AttributeGroup zlV_Bus_Allg_AttributeGroup = (ZLV_Bus_Allg_AttributeGroup)theEObject;
				T result = caseZLV_Bus_Allg_AttributeGroup(zlV_Bus_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE: {
				ZLV_Bus_Besondere_Anlage zlV_Bus_Besondere_Anlage = (ZLV_Bus_Besondere_Anlage)theEObject;
				T result = caseZLV_Bus_Besondere_Anlage(zlV_Bus_Besondere_Anlage);
				if (result == null) result = caseBasis_Objekt(zlV_Bus_Besondere_Anlage);
				if (result == null) result = caseUr_Objekt(zlV_Bus_Besondere_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup = (ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)theEObject;
				T result = caseZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup(zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ZLV_Bus_Bezeichnung_AttributeGroup zlV_Bus_Bezeichnung_AttributeGroup = (ZLV_Bus_Bezeichnung_AttributeGroup)theEObject;
				T result = caseZLV_Bus_Bezeichnung_AttributeGroup(zlV_Bus_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE_CLASS: {
				ZLV_Bus_Nr_TypeClass zlV_Bus_Nr_TypeClass = (ZLV_Bus_Nr_TypeClass)theEObject;
				T result = caseZLV_Bus_Nr_TypeClass(zlV_Bus_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zlV_Bus_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG: {
				ZLV_Bus_US_Zuordnung zlV_Bus_US_Zuordnung = (ZLV_Bus_US_Zuordnung)theEObject;
				T result = caseZLV_Bus_US_Zuordnung(zlV_Bus_US_Zuordnung);
				if (result == null) result = caseBasis_Objekt(zlV_Bus_US_Zuordnung);
				if (result == null) result = caseUr_Objekt(zlV_Bus_US_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP: {
				ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup = (ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)theEObject;
				T result = caseZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP: {
				ZLV_Bus_Zuordnung_Allg_AttributeGroup zlV_Bus_Zuordnung_Allg_AttributeGroup = (ZLV_Bus_Zuordnung_Allg_AttributeGroup)theEObject;
				T result = caseZLV_Bus_Zuordnung_Allg_AttributeGroup(zlV_Bus_Zuordnung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN: {
				ZN zn = (ZN)theEObject;
				T result = caseZN(zn);
				if (result == null) result = caseBasis_Objekt(zn);
				if (result == null) result = caseUr_Objekt(zn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE_CLASS: {
				ZN_A_Bedienbezeichner_Frei_TypeClass zN_A_Bedienbezeichner_Frei_TypeClass = (ZN_A_Bedienbezeichner_Frei_TypeClass)theEObject;
				T result = caseZN_A_Bedienbezeichner_Frei_TypeClass(zN_A_Bedienbezeichner_Frei_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_A_Bedienbezeichner_Frei_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE_CLASS: {
				ZN_A_Bezeichner_TypeClass zN_A_Bezeichner_TypeClass = (ZN_A_Bezeichner_TypeClass)theEObject;
				T result = caseZN_A_Bezeichner_TypeClass(zN_A_Bezeichner_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_A_Bezeichner_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK: {
				ZN_Akustik zN_Akustik = (ZN_Akustik)theEObject;
				T result = caseZN_Akustik(zN_Akustik);
				if (result == null) result = caseBasis_Objekt(zN_Akustik);
				if (result == null) result = caseUr_Objekt(zN_Akustik);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP: {
				ZN_Akustik_Anzeigefeld_AttributeGroup zN_Akustik_Anzeigefeld_AttributeGroup = (ZN_Akustik_Anzeigefeld_AttributeGroup)theEObject;
				T result = caseZN_Akustik_Anzeigefeld_AttributeGroup(zN_Akustik_Anzeigefeld_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP: {
				ZN_Allg_AttributeGroup zN_Allg_AttributeGroup = (ZN_Allg_AttributeGroup)theEObject;
				T result = caseZN_Allg_AttributeGroup(zN_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ANLAGENTYP_TYPE_CLASS: {
				ZN_Anlagentyp_TypeClass zN_Anlagentyp_TypeClass = (ZN_Anlagentyp_TypeClass)theEObject;
				T result = caseZN_Anlagentyp_TypeClass(zN_Anlagentyp_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Anlagentyp_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD: {
				ZN_Anzeigefeld zN_Anzeigefeld = (ZN_Anzeigefeld)theEObject;
				T result = caseZN_Anzeigefeld(zN_Anzeigefeld);
				if (result == null) result = caseBasis_Objekt(zN_Anzeigefeld);
				if (result == null) result = caseUr_Objekt(zN_Anzeigefeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP: {
				ZN_Anzeigefeld_Allg_AttributeGroup zN_Anzeigefeld_Allg_AttributeGroup = (ZN_Anzeigefeld_Allg_AttributeGroup)theEObject;
				T result = caseZN_Anzeigefeld_Allg_AttributeGroup(zN_Anzeigefeld_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ZN_Anzeigefeld_Bezeichnung_AttributeGroup zN_Anzeigefeld_Bezeichnung_AttributeGroup = (ZN_Anzeigefeld_Bezeichnung_AttributeGroup)theEObject;
				T result = caseZN_Anzeigefeld_Bezeichnung_AttributeGroup(zN_Anzeigefeld_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_LOESCHKRITERIUM_TYPE_CLASS: {
				ZN_Anzeigefeld_Loeschkriterium_TypeClass zN_Anzeigefeld_Loeschkriterium_TypeClass = (ZN_Anzeigefeld_Loeschkriterium_TypeClass)theEObject;
				T result = caseZN_Anzeigefeld_Loeschkriterium_TypeClass(zN_Anzeigefeld_Loeschkriterium_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Anzeigefeld_Loeschkriterium_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_FELD_OHNE_ANZEIGE_TYPE_CLASS: {
				ZN_Feld_Ohne_Anzeige_TypeClass zN_Feld_Ohne_Anzeige_TypeClass = (ZN_Feld_Ohne_Anzeige_TypeClass)theEObject;
				T result = caseZN_Feld_Ohne_Anzeige_TypeClass(zN_Feld_Ohne_Anzeige_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Feld_Ohne_Anzeige_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP: {
				ZN_Fortschalt_Krit_Druck_AttributeGroup zN_Fortschalt_Krit_Druck_AttributeGroup = (ZN_Fortschalt_Krit_Druck_AttributeGroup)theEObject;
				T result = caseZN_Fortschalt_Krit_Druck_AttributeGroup(zN_Fortschalt_Krit_Druck_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP: {
				ZN_Fortschalt_Krit_Schalt_AttributeGroup zN_Fortschalt_Krit_Schalt_AttributeGroup = (ZN_Fortschalt_Krit_Schalt_AttributeGroup)theEObject;
				T result = caseZN_Fortschalt_Krit_Schalt_AttributeGroup(zN_Fortschalt_Krit_Schalt_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM: {
				ZN_Fortschalt_Kriterium zN_Fortschalt_Kriterium = (ZN_Fortschalt_Kriterium)theEObject;
				T result = caseZN_Fortschalt_Kriterium(zN_Fortschalt_Kriterium);
				if (result == null) result = caseBasis_Objekt(zN_Fortschalt_Kriterium);
				if (result == null) result = caseUr_Objekt(zN_Fortschalt_Kriterium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_MODEM_TYPE_CLASS: {
				ZN_Modem_TypeClass zN_Modem_TypeClass = (ZN_Modem_TypeClass)theEObject;
				T result = caseZN_Modem_TypeClass(zN_Modem_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Modem_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_SCHALTKRITERIUM_TYPE_CLASS: {
				ZN_Schaltkriterium_TypeClass zN_Schaltkriterium_TypeClass = (ZN_Schaltkriterium_TypeClass)theEObject;
				T result = caseZN_Schaltkriterium_TypeClass(zN_Schaltkriterium_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Schaltkriterium_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG: {
				ZN_Telegramm_84_Zuordnung zN_Telegramm_84_Zuordnung = (ZN_Telegramm_84_Zuordnung)theEObject;
				T result = caseZN_Telegramm_84_Zuordnung(zN_Telegramm_84_Zuordnung);
				if (result == null) result = caseBasis_Objekt(zN_Telegramm_84_Zuordnung);
				if (result == null) result = caseUr_Objekt(zN_Telegramm_84_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG: {
				ZN_Telegramm_85_Zuordnung zN_Telegramm_85_Zuordnung = (ZN_Telegramm_85_Zuordnung)theEObject;
				T result = caseZN_Telegramm_85_Zuordnung(zN_Telegramm_85_Zuordnung);
				if (result == null) result = caseBasis_Objekt(zN_Telegramm_85_Zuordnung);
				if (result == null) result = caseUr_Objekt(zN_Telegramm_85_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION: {
				ZN_Unterstation zN_Unterstation = (ZN_Unterstation)theEObject;
				T result = caseZN_Unterstation(zN_Unterstation);
				if (result == null) result = caseBasis_Objekt(zN_Unterstation);
				if (result == null) result = caseUr_Objekt(zN_Unterstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP: {
				ZN_Unterstation_Allg_AttributeGroup zN_Unterstation_Allg_AttributeGroup = (ZN_Unterstation_Allg_AttributeGroup)theEObject;
				T result = caseZN_Unterstation_Allg_AttributeGroup(zN_Unterstation_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP: {
				ZN_Unterstation_Bf_Nr_AttributeGroup zN_Unterstation_Bf_Nr_AttributeGroup = (ZN_Unterstation_Bf_Nr_AttributeGroup)theEObject;
				T result = caseZN_Unterstation_Bf_Nr_AttributeGroup(zN_Unterstation_Bf_Nr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZN_ZBS: {
				ZN_ZBS zN_ZBS = (ZN_ZBS)theEObject;
				T result = caseZN_ZBS(zN_ZBS);
				if (result == null) result = caseBasis_Objekt(zN_ZBS);
				if (result == null) result = caseUr_Objekt(zN_ZBS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZugnummernmeldeanlagePackage.ZUGVORBEREITUNGSMELDUNG_TYPE_CLASS: {
				Zugvorbereitungsmeldung_TypeClass zugvorbereitungsmeldung_TypeClass = (Zugvorbereitungsmeldung_TypeClass)theEObject;
				T result = caseZugvorbereitungsmeldung_TypeClass(zugvorbereitungsmeldung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zugvorbereitungsmeldung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akustikdauer Anb Ann Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akustikdauer Anb Ann Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkustikdauer_Anb_Ann_TypeClass(Akustikdauer_Anb_Ann_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akustikdauer Sonst Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akustikdauer Sonst Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkustikdauer_Sonst_TypeClass(Akustikdauer_Sonst_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Akustikdauer Voranz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Akustikdauer Voranz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAkustikdauer_Voranz_TypeClass(Akustikdauer_Voranz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschlussnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschlussnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschlussnummer_TypeClass(Anschlussnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausfahrdruck Gegengleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausfahrdruck Gegengleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusfahrdruck_Gegengleis_TypeClass(Ausfahrdruck_Gegengleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausfahrdruck Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausfahrdruck Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusfahrdruck_TypeClass(Ausfahrdruck_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedienbarkeit Anzeigefeld Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedienbarkeit Anzeigefeld Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedienbarkeit_Anzeigefeld_TypeClass(Bedienbarkeit_Anzeigefeld_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besonderes Schaltkriterium Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besonderes Schaltkriterium Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesonderes_Schaltkriterium_TypeClass(Besonderes_Schaltkriterium_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Besondere Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Besondere Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Besondere_Anlage_TypeClass(Bezeichnung_Besondere_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bf Kennung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bf Kennung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBf_Kennung_TypeClass(Bf_Kennung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bf Nr ANB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bf Nr ANB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBf_Nr_ANB_TypeClass(Bf_Nr_ANB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bf Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bf Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBf_Nr_TypeClass(Bf_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bf Nr ZN AType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bf Nr ZN AType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBf_Nr_ZN_A_TypeClass(Bf_Nr_ZN_A_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Durchfahrdruck Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Durchfahrdruck Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurchfahrdruck_TypeClass(Durchfahrdruck_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einfahrdruck Gegengleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einfahrdruck Gegengleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinfahrdruck_Gegengleis_TypeClass(Einfahrdruck_Gegengleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einfahrdruck Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einfahrdruck Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinfahrdruck_TypeClass(Einfahrdruck_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einwahlstelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einwahlstelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinwahlstelle_TypeClass(Einwahlstelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funktionalitaet Anzeigefeld Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funktionalitaet Anzeigefeld Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunktionalitaet_Anzeigefeld_TypeClass(Funktionalitaet_Anzeigefeld_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HOA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HOA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOA_TypeClass(HOA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Adresse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Adresse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP_Adresse_TypeClass(IP_Adresse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Koppelunterstation Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Koppelunterstation Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKoppelunterstation_TypeClass(Koppelunterstation_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KUs Zeittelegramm Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KUs Zeittelegramm Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKUs_Zeittelegramm_TypeClass(KUs_Zeittelegramm_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meldedruck Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meldedruck Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeldedruck_TypeClass(Meldedruck_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prioritaet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prioritaet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritaet_TypeClass(Prioritaet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaktivierungsfunktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaktivierungsfunktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaktivierungsfunktion_TypeClass(Reaktivierungsfunktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sichtbarkeit Anzeigefeld Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sichtbarkeit Anzeigefeld Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSichtbarkeit_Anzeigefeld_TypeClass(Sichtbarkeit_Anzeigefeld_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 02 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 02 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_02_TypeClass(Telegramm_02_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 03 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 03 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_03_TypeClass(Telegramm_03_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 04 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 04 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_04_TypeClass(Telegramm_04_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 10 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 10 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_10_TypeClass(Telegramm_10_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 21 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 21 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_21_TypeClass(Telegramm_21_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 30 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 30 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_30_TypeClass(Telegramm_30_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 84 Alle Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 84 Alle Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_84_Alle_Fstr_AttributeGroup(Telegramm_84_Alle_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 84 Einzelne Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 84 Einzelne Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_84_Einzelne_Fstr_AttributeGroup(Telegramm_84_Einzelne_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 84 Fuer Alle Fstr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 84 Fuer Alle Fstr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_84_Fuer_Alle_Fstr_TypeClass(Telegramm_84_Fuer_Alle_Fstr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 84 Verzicht Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 84 Verzicht Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_84_Verzicht_TypeClass(Telegramm_84_Verzicht_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 85 Alle Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 85 Alle Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_85_Alle_Fstr_AttributeGroup(Telegramm_85_Alle_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 85 Einzelne Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 85 Einzelne Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_85_Einzelne_Fstr_AttributeGroup(Telegramm_85_Einzelne_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegramm 85 Fuer Alle Fstr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegramm 85 Fuer Alle Fstr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegramm_85_Fuer_Alle_Fstr_TypeClass(Telegramm_85_Fuer_Alle_Fstr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegrammwiederholung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegrammwiederholung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegrammwiederholung_TypeClass(Telegrammwiederholung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterstation Max Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterstation Max Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterstation_Max_TypeClass(Unterstation_Max_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterstation Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterstation Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterstation_Nr_TypeClass(Unterstation_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verzoegerung Manuell Loeschung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verzoegerung Manuell Loeschung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerzoegerung_Manuell_Loeschung_TypeClass(Verzoegerung_Manuell_Loeschung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vormeldestart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vormeldestart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVormeldestart_TypeClass(Vormeldestart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS Adresse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS Adresse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_Adresse_TypeClass(ZBS_Adresse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS Anbindung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS Anbindung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_Anbindung_TypeClass(ZBS_Anbindung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS Schnittstelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS Schnittstelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_Schnittstelle_TypeClass(ZBS_Schnittstelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zeitsynchronisation Funkuhr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zeitsynchronisation Funkuhr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeitsynchronisation_Funkuhr_TypeClass(Zeitsynchronisation_Funkuhr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus(ZLV_Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Allg_AttributeGroup(ZLV_Bus_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Besondere Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Besondere Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Besondere_Anlage(ZLV_Bus_Besondere_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Besondere Anlage Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Besondere Anlage Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Bezeichnung_AttributeGroup(ZLV_Bus_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Nr_TypeClass(ZLV_Bus_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus US Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus US Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_US_Zuordnung(ZLV_Bus_US_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus US Zuordnung Telegramm Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus US Zuordnung Telegramm Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLV Bus Zuordnung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLV Bus Zuordnung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLV_Bus_Zuordnung_Allg_AttributeGroup(ZLV_Bus_Zuordnung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN(ZN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN ABedienbezeichner Frei Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN ABedienbezeichner Frei Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_A_Bedienbezeichner_Frei_TypeClass(ZN_A_Bedienbezeichner_Frei_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN ABezeichner Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN ABezeichner Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_A_Bezeichner_TypeClass(ZN_A_Bezeichner_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Akustik</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Akustik</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Akustik(ZN_Akustik object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Akustik Anzeigefeld Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Akustik Anzeigefeld Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Akustik_Anzeigefeld_AttributeGroup(ZN_Akustik_Anzeigefeld_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Allg_AttributeGroup(ZN_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Anlagentyp Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Anlagentyp Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Anlagentyp_TypeClass(ZN_Anlagentyp_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Anzeigefeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Anzeigefeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Anzeigefeld(ZN_Anzeigefeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Anzeigefeld_Allg_AttributeGroup(ZN_Anzeigefeld_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Anzeigefeld_Bezeichnung_AttributeGroup(ZN_Anzeigefeld_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Loeschkriterium Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Anzeigefeld Loeschkriterium Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Anzeigefeld_Loeschkriterium_TypeClass(ZN_Anzeigefeld_Loeschkriterium_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Feld Ohne Anzeige Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Feld Ohne Anzeige Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Feld_Ohne_Anzeige_TypeClass(ZN_Feld_Ohne_Anzeige_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Fortschalt Krit Druck Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Fortschalt Krit Druck Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Fortschalt_Krit_Druck_AttributeGroup(ZN_Fortschalt_Krit_Druck_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Fortschalt Krit Schalt Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Fortschalt Krit Schalt Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Fortschalt_Krit_Schalt_AttributeGroup(ZN_Fortschalt_Krit_Schalt_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Fortschalt Kriterium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Fortschalt Kriterium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Fortschalt_Kriterium(ZN_Fortschalt_Kriterium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Modem Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Modem Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Modem_TypeClass(ZN_Modem_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Schaltkriterium Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Schaltkriterium Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Schaltkriterium_TypeClass(ZN_Schaltkriterium_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Telegramm 84 Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Telegramm 84 Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Telegramm_84_Zuordnung(ZN_Telegramm_84_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Telegramm 85 Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Telegramm 85 Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Telegramm_85_Zuordnung(ZN_Telegramm_85_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Unterstation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Unterstation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Unterstation(ZN_Unterstation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Unterstation Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Unterstation Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Unterstation_Allg_AttributeGroup(ZN_Unterstation_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Unterstation Bf Nr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Unterstation Bf Nr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Unterstation_Bf_Nr_AttributeGroup(ZN_Unterstation_Bf_Nr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN ZBS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN ZBS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_ZBS(ZN_ZBS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zugvorbereitungsmeldung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zugvorbereitungsmeldung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZugvorbereitungsmeldung_TypeClass(Zugvorbereitungsmeldung_TypeClass object) {
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

} //ZugnummernmeldeanlageSwitch
