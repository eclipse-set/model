/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Signale.*;

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
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage
 * @generated
 */
public class SignaleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SignalePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaleSwitch() {
		if (modelPackage == null) {
			modelPackage = SignalePackage.eINSTANCE;
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
			case SignalePackage.ANSCHALTDAUER_TYPE_CLASS: {
				Anschaltdauer_TypeClass anschaltdauer_TypeClass = (Anschaltdauer_TypeClass)theEObject;
				T result = caseAnschaltdauer_TypeClass(anschaltdauer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anschaltdauer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.AUTO_EINSTELLUNG_TYPE_CLASS: {
				Auto_Einstellung_TypeClass auto_Einstellung_TypeClass = (Auto_Einstellung_TypeClass)theEObject;
				T result = caseAuto_Einstellung_TypeClass(auto_Einstellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(auto_Einstellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.BEFESTIGUNG_ART_TYPE_CLASS: {
				Befestigung_Art_TypeClass befestigung_Art_TypeClass = (Befestigung_Art_TypeClass)theEObject;
				T result = caseBefestigung_Art_TypeClass(befestigung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(befestigung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.BELEUCHTET_TYPE_CLASS: {
				Beleuchtet_TypeClass beleuchtet_TypeClass = (Beleuchtet_TypeClass)theEObject;
				T result = caseBeleuchtet_TypeClass(beleuchtet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(beleuchtet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.BESETZTE_AUSFAHRT_TYPE_CLASS: {
				Besetzte_Ausfahrt_TypeClass besetzte_Ausfahrt_TypeClass = (Besetzte_Ausfahrt_TypeClass)theEObject;
				T result = caseBesetzte_Ausfahrt_TypeClass(besetzte_Ausfahrt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(besetzte_Ausfahrt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.DA_MANUELL_TYPE_CLASS: {
				DA_Manuell_TypeClass dA_Manuell_TypeClass = (DA_Manuell_TypeClass)theEObject;
				T result = caseDA_Manuell_TypeClass(dA_Manuell_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dA_Manuell_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.DUNKELSCHALTUNG_TYPE_CLASS: {
				Dunkelschaltung_TypeClass dunkelschaltung_TypeClass = (Dunkelschaltung_TypeClass)theEObject;
				T result = caseDunkelschaltung_TypeClass(dunkelschaltung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dunkelschaltung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.DURCHFAHRT_TYPE_CLASS: {
				Durchfahrt_TypeClass durchfahrt_TypeClass = (Durchfahrt_TypeClass)theEObject;
				T result = caseDurchfahrt_TypeClass(durchfahrt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(durchfahrt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS: {
				Fiktives_Signal_Funktion_TypeClass fiktives_Signal_Funktion_TypeClass = (Fiktives_Signal_Funktion_TypeClass)theEObject;
				T result = caseFiktives_Signal_Funktion_TypeClass(fiktives_Signal_Funktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fiktives_Signal_Funktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.FUNDAMENT_ART_TYPE_CLASS: {
				Fundament_Art_TypeClass fundament_Art_TypeClass = (Fundament_Art_TypeClass)theEObject;
				T result = caseFundament_Art_TypeClass(fundament_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fundament_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.FUNKTION_OHNE_SIGNAL_TYPE_CLASS: {
				Funktion_Ohne_Signal_TypeClass funktion_Ohne_Signal_TypeClass = (Funktion_Ohne_Signal_TypeClass)theEObject;
				T result = caseFunktion_Ohne_Signal_TypeClass(funktion_Ohne_Signal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(funktion_Ohne_Signal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.GEGENGLEIS_TYPE_CLASS: {
				Gegengleis_TypeClass gegengleis_TypeClass = (Gegengleis_TypeClass)theEObject;
				T result = caseGegengleis_TypeClass(gegengleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gegengleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.GELTUNGSBEREICH_TYPE_CLASS: {
				Geltungsbereich_TypeClass geltungsbereich_TypeClass = (Geltungsbereich_TypeClass)theEObject;
				T result = caseGeltungsbereich_TypeClass(geltungsbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geltungsbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.GESCHALTET_TYPE_CLASS: {
				Geschaltet_TypeClass geschaltet_TypeClass = (Geschaltet_TypeClass)theEObject;
				T result = caseGeschaltet_TypeClass(geschaltet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geschaltet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS: {
				Hoehe_Fundamentoberkante_TypeClass hoehe_Fundamentoberkante_TypeClass = (Hoehe_Fundamentoberkante_TypeClass)theEObject;
				T result = caseHoehe_Fundamentoberkante_TypeClass(hoehe_Fundamentoberkante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoehe_Fundamentoberkante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE_CLASS: {
				Obere_Lichtpunkthoehe_TypeClass obere_Lichtpunkthoehe_TypeClass = (Obere_Lichtpunkthoehe_TypeClass)theEObject;
				T result = caseObere_Lichtpunkthoehe_TypeClass(obere_Lichtpunkthoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(obere_Lichtpunkthoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS: {
				PZB_Schutzstrecke_Soll_TypeClass pzB_Schutzstrecke_Soll_TypeClass = (PZB_Schutzstrecke_Soll_TypeClass)theEObject;
				T result = casePZB_Schutzstrecke_Soll_TypeClass(pzB_Schutzstrecke_Soll_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(pzB_Schutzstrecke_Soll_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.RAHMEN_ART_TYPE_CLASS: {
				Rahmen_Art_TypeClass rahmen_Art_TypeClass = (Rahmen_Art_TypeClass)theEObject;
				T result = caseRahmen_Art_TypeClass(rahmen_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rahmen_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.RAHMEN_HOEHE_TYPE_CLASS: {
				Rahmen_Hoehe_TypeClass rahmen_Hoehe_TypeClass = (Rahmen_Hoehe_TypeClass)theEObject;
				T result = caseRahmen_Hoehe_TypeClass(rahmen_Hoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rahmen_Hoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS: {
				Rangierstrasse_Restaufloesung_TypeClass rangierstrasse_Restaufloesung_TypeClass = (Rangierstrasse_Restaufloesung_TypeClass)theEObject;
				T result = caseRangierstrasse_Restaufloesung_TypeClass(rangierstrasse_Restaufloesung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rangierstrasse_Restaufloesung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.RICHTPUNKT_TYPE_CLASS: {
				Richtpunkt_TypeClass richtpunkt_TypeClass = (Richtpunkt_TypeClass)theEObject;
				T result = caseRichtpunkt_TypeClass(richtpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(richtpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE_CLASS: {
				Richtpunktentfernung_TypeClass richtpunktentfernung_TypeClass = (Richtpunktentfernung_TypeClass)theEObject;
				T result = caseRichtpunktentfernung_TypeClass(richtpunktentfernung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(richtpunktentfernung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = casePunkt_Objekt(signal);
				if (result == null) result = caseBasis_Objekt(signal);
				if (result == null) result = caseUr_Objekt(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_ART_TYPE_CLASS: {
				Signal_Art_TypeClass signal_Art_TypeClass = (Signal_Art_TypeClass)theEObject;
				T result = caseSignal_Art_TypeClass(signal_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signal_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_BEFESTIGUNG: {
				Signal_Befestigung signal_Befestigung = (Signal_Befestigung)theEObject;
				T result = caseSignal_Befestigung(signal_Befestigung);
				if (result == null) result = casePunkt_Objekt(signal_Befestigung);
				if (result == null) result = caseBasis_Objekt(signal_Befestigung);
				if (result == null) result = caseUr_Objekt(signal_Befestigung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP: {
				Signal_Befestigung_Allg_AttributeGroup signal_Befestigung_Allg_AttributeGroup = (Signal_Befestigung_Allg_AttributeGroup)theEObject;
				T result = caseSignal_Befestigung_Allg_AttributeGroup(signal_Befestigung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_BEFESTIGUNGSART_TYPE_CLASS: {
				Signal_Befestigungsart_TypeClass signal_Befestigungsart_TypeClass = (Signal_Befestigungsart_TypeClass)theEObject;
				T result = caseSignal_Befestigungsart_TypeClass(signal_Befestigungsart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signal_Befestigungsart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG: {
				Signal_Fank_Zuordnung signal_Fank_Zuordnung = (Signal_Fank_Zuordnung)theEObject;
				T result = caseSignal_Fank_Zuordnung(signal_Fank_Zuordnung);
				if (result == null) result = caseBasis_Objekt(signal_Fank_Zuordnung);
				if (result == null) result = caseUr_Objekt(signal_Fank_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP: {
				Signal_Fiktiv_AttributeGroup signal_Fiktiv_AttributeGroup = (Signal_Fiktiv_AttributeGroup)theEObject;
				T result = caseSignal_Fiktiv_AttributeGroup(signal_Fiktiv_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP: {
				Signal_Fstr_AttributeGroup signal_Fstr_AttributeGroup = (Signal_Fstr_AttributeGroup)theEObject;
				T result = caseSignal_Fstr_AttributeGroup(signal_Fstr_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP: {
				Signal_Fstr_Aus_Inselgleis_AttributeGroup signal_Fstr_Aus_Inselgleis_AttributeGroup = (Signal_Fstr_Aus_Inselgleis_AttributeGroup)theEObject;
				T result = caseSignal_Fstr_Aus_Inselgleis_AttributeGroup(signal_Fstr_Aus_Inselgleis_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP: {
				Signal_Fstr_S_AttributeGroup signal_Fstr_S_AttributeGroup = (Signal_Fstr_S_AttributeGroup)theEObject;
				T result = caseSignal_Fstr_S_AttributeGroup(signal_Fstr_S_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_FUNKTION_TYPE_CLASS: {
				Signal_Funktion_TypeClass signal_Funktion_TypeClass = (Signal_Funktion_TypeClass)theEObject;
				T result = caseSignal_Funktion_TypeClass(signal_Funktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signal_Funktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_RAHMEN: {
				Signal_Rahmen signal_Rahmen = (Signal_Rahmen)theEObject;
				T result = caseSignal_Rahmen(signal_Rahmen);
				if (result == null) result = caseBasis_Objekt(signal_Rahmen);
				if (result == null) result = caseUr_Objekt(signal_Rahmen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP: {
				Signal_Real_Aktiv_AttributeGroup signal_Real_Aktiv_AttributeGroup = (Signal_Real_Aktiv_AttributeGroup)theEObject;
				T result = caseSignal_Real_Aktiv_AttributeGroup(signal_Real_Aktiv_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP: {
				Signal_Real_Aktiv_Schirm_AttributeGroup signal_Real_Aktiv_Schirm_AttributeGroup = (Signal_Real_Aktiv_Schirm_AttributeGroup)theEObject;
				T result = caseSignal_Real_Aktiv_Schirm_AttributeGroup(signal_Real_Aktiv_Schirm_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP: {
				Signal_Real_AttributeGroup signal_Real_AttributeGroup = (Signal_Real_AttributeGroup)theEObject;
				T result = caseSignal_Real_AttributeGroup(signal_Real_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_SIGNALBEGRIFF: {
				Signal_Signalbegriff signal_Signalbegriff = (Signal_Signalbegriff)theEObject;
				T result = caseSignal_Signalbegriff(signal_Signalbegriff);
				if (result == null) result = caseBasis_Objekt(signal_Signalbegriff);
				if (result == null) result = caseUr_Objekt(signal_Signalbegriff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP: {
				Signal_Signalbegriff_Allg_AttributeGroup signal_Signalbegriff_Allg_AttributeGroup = (Signal_Signalbegriff_Allg_AttributeGroup)theEObject;
				T result = caseSignal_Signalbegriff_Allg_AttributeGroup(signal_Signalbegriff_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE_CLASS: {
				Signalsicht_Erreichbar_TypeClass signalsicht_Erreichbar_TypeClass = (Signalsicht_Erreichbar_TypeClass)theEObject;
				T result = caseSignalsicht_Erreichbar_TypeClass(signalsicht_Erreichbar_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalsicht_Erreichbar_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE_CLASS: {
				Signalsicht_Mindest_TypeClass signalsicht_Mindest_TypeClass = (Signalsicht_Mindest_TypeClass)theEObject;
				T result = caseSignalsicht_Mindest_TypeClass(signalsicht_Mindest_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalsicht_Mindest_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNALSICHT_SOLL_TYPE_CLASS: {
				Signalsicht_Soll_TypeClass signalsicht_Soll_TypeClass = (Signalsicht_Soll_TypeClass)theEObject;
				T result = caseSignalsicht_Soll_TypeClass(signalsicht_Soll_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalsicht_Soll_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SIGNALSYSTEM_TYPE_CLASS: {
				Signalsystem_TypeClass signalsystem_TypeClass = (Signalsystem_TypeClass)theEObject;
				T result = caseSignalsystem_TypeClass(signalsystem_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalsystem_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS: {
				Sonstige_Zulaessige_Anordnung_TypeClass sonstige_Zulaessige_Anordnung_TypeClass = (Sonstige_Zulaessige_Anordnung_TypeClass)theEObject;
				T result = caseSonstige_Zulaessige_Anordnung_TypeClass(sonstige_Zulaessige_Anordnung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sonstige_Zulaessige_Anordnung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.STREUSCHEIBE_ART_TYPE_CLASS: {
				Streuscheibe_Art_TypeClass streuscheibe_Art_TypeClass = (Streuscheibe_Art_TypeClass)theEObject;
				T result = caseStreuscheibe_Art_TypeClass(streuscheibe_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(streuscheibe_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS: {
				Streuscheibe_Betriebsstellung_TypeClass streuscheibe_Betriebsstellung_TypeClass = (Streuscheibe_Betriebsstellung_TypeClass)theEObject;
				T result = caseStreuscheibe_Betriebsstellung_TypeClass(streuscheibe_Betriebsstellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(streuscheibe_Betriebsstellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.TUNNELSIGNAL_TYPE_CLASS: {
				Tunnelsignal_TypeClass tunnelsignal_TypeClass = (Tunnelsignal_TypeClass)theEObject;
				T result = caseTunnelsignal_TypeClass(tunnelsignal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tunnelsignal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SignalePackage.ZS2_UEBERWACHT_TYPE_CLASS: {
				Zs2_Ueberwacht_TypeClass zs2_Ueberwacht_TypeClass = (Zs2_Ueberwacht_TypeClass)theEObject;
				T result = caseZs2_Ueberwacht_TypeClass(zs2_Ueberwacht_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zs2_Ueberwacht_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschaltdauer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschaltdauer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschaltdauer_TypeClass(Anschaltdauer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Einstellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Einstellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_Einstellung_TypeClass(Auto_Einstellung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Befestigung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Befestigung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBefestigung_Art_TypeClass(Befestigung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beleuchtet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beleuchtet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeleuchtet_TypeClass(Beleuchtet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besetzte Ausfahrt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besetzte Ausfahrt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesetzte_Ausfahrt_TypeClass(Besetzte_Ausfahrt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DA Manuell Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DA Manuell Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDA_Manuell_TypeClass(DA_Manuell_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dunkelschaltung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dunkelschaltung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDunkelschaltung_TypeClass(Dunkelschaltung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Durchfahrt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Durchfahrt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurchfahrt_TypeClass(Durchfahrt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fiktives Signal Funktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fiktives Signal Funktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiktives_Signal_Funktion_TypeClass(Fiktives_Signal_Funktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fundament Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fundament Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundament_Art_TypeClass(Fundament_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funktion Ohne Signal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funktion Ohne Signal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunktion_Ohne_Signal_TypeClass(Funktion_Ohne_Signal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gegengleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gegengleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGegengleis_TypeClass(Gegengleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geltungsbereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geltungsbereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeltungsbereich_TypeClass(Geltungsbereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschaltet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschaltet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschaltet_TypeClass(Geschaltet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehe Fundamentoberkante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehe Fundamentoberkante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehe_Fundamentoberkante_TypeClass(Hoehe_Fundamentoberkante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obere Lichtpunkthoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obere Lichtpunkthoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObere_Lichtpunkthoehe_TypeClass(Obere_Lichtpunkthoehe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PZB Schutzstrecke Soll Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PZB Schutzstrecke Soll Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePZB_Schutzstrecke_Soll_TypeClass(PZB_Schutzstrecke_Soll_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rahmen Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rahmen Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRahmen_Art_TypeClass(Rahmen_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rahmen Hoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rahmen Hoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRahmen_Hoehe_TypeClass(Rahmen_Hoehe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangierstrasse Restaufloesung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangierstrasse Restaufloesung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangierstrasse_Restaufloesung_TypeClass(Rangierstrasse_Restaufloesung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Richtpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Richtpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichtpunkt_TypeClass(Richtpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Richtpunktentfernung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Richtpunktentfernung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichtpunktentfernung_TypeClass(Richtpunktentfernung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Art_TypeClass(Signal_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Befestigung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Befestigung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Befestigung(Signal_Befestigung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Befestigung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Befestigung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Befestigung_Allg_AttributeGroup(Signal_Befestigung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Befestigungsart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Befestigungsart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Befestigungsart_TypeClass(Signal_Befestigungsart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Fank Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Fank Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Fank_Zuordnung(Signal_Fank_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Fiktiv Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Fiktiv Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Fiktiv_AttributeGroup(Signal_Fiktiv_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Fstr Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Fstr Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Fstr_AttributeGroup(Signal_Fstr_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Fstr Aus Inselgleis Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Fstr Aus Inselgleis Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Fstr_Aus_Inselgleis_AttributeGroup(Signal_Fstr_Aus_Inselgleis_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Fstr SAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Fstr SAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Fstr_S_AttributeGroup(Signal_Fstr_S_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Funktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Funktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Funktion_TypeClass(Signal_Funktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Rahmen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Rahmen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Rahmen(Signal_Rahmen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Real Aktiv Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Real Aktiv Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Real_Aktiv_AttributeGroup(Signal_Real_Aktiv_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Real Aktiv Schirm Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Real Aktiv Schirm Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Real_Aktiv_Schirm_AttributeGroup(Signal_Real_Aktiv_Schirm_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Real Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Real Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Real_AttributeGroup(Signal_Real_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Signalbegriff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Signalbegriff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Signalbegriff(Signal_Signalbegriff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Signalbegriff Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Signalbegriff Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal_Signalbegriff_Allg_AttributeGroup(Signal_Signalbegriff_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalsicht Erreichbar Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalsicht Erreichbar Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalsicht_Erreichbar_TypeClass(Signalsicht_Erreichbar_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalsicht Mindest Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalsicht Mindest Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalsicht_Mindest_TypeClass(Signalsicht_Mindest_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalsicht Soll Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalsicht Soll Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalsicht_Soll_TypeClass(Signalsicht_Soll_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalsystem Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalsystem Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalsystem_TypeClass(Signalsystem_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Zulaessige Anordnung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Zulaessige Anordnung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstige_Zulaessige_Anordnung_TypeClass(Sonstige_Zulaessige_Anordnung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streuscheibe Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streuscheibe Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreuscheibe_Art_TypeClass(Streuscheibe_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streuscheibe Betriebsstellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streuscheibe Betriebsstellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreuscheibe_Betriebsstellung_TypeClass(Streuscheibe_Betriebsstellung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tunnelsignal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tunnelsignal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTunnelsignal_TypeClass(Tunnelsignal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs2 Ueberwacht Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs2 Ueberwacht Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs2_Ueberwacht_TypeClass(Zs2_Ueberwacht_TypeClass object) {
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

} //SignaleSwitch
