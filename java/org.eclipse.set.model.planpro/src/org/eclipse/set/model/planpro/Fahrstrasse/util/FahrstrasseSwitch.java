/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Fahrstrasse.*;

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
 * @see org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage
 * @generated
 */
public class FahrstrasseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FahrstrassePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FahrstrasseSwitch() {
		if (modelPackage == null) {
			modelPackage = FahrstrassePackage.eINSTANCE;
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
			case FahrstrassePackage.AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS: {
				Aufloesung_Ssp_Zielgleis_TypeClass aufloesung_Ssp_Zielgleis_TypeClass = (Aufloesung_Ssp_Zielgleis_TypeClass)theEObject;
				T result = caseAufloesung_Ssp_Zielgleis_TypeClass(aufloesung_Ssp_Zielgleis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(aufloesung_Ssp_Zielgleis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS: {
				Aufloesung_Verzoegerung_TypeClass aufloesung_Verzoegerung_TypeClass = (Aufloesung_Verzoegerung_TypeClass)theEObject;
				T result = caseAufloesung_Verzoegerung_TypeClass(aufloesung_Verzoegerung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(aufloesung_Verzoegerung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS: {
				Automatische_Einstellung_TypeClass automatische_Einstellung_TypeClass = (Automatische_Einstellung_TypeClass)theEObject;
				T result = caseAutomatische_Einstellung_TypeClass(automatische_Einstellung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(automatische_Einstellung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS: {
				Bezeichnung_Fstr_DWeg_TypeClass bezeichnung_Fstr_DWeg_TypeClass = (Bezeichnung_Fstr_DWeg_TypeClass)theEObject;
				T result = caseBezeichnung_Fstr_DWeg_TypeClass(bezeichnung_Fstr_DWeg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Fstr_DWeg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS: {
				Bezeichnung_Markanter_Punkt_TypeClass bezeichnung_Markanter_Punkt_TypeClass = (Bezeichnung_Markanter_Punkt_TypeClass)theEObject;
				T result = caseBezeichnung_Markanter_Punkt_TypeClass(bezeichnung_Markanter_Punkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Markanter_Punkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE_CLASS: {
				DWeg_Reihenfolge_TypeClass dWeg_Reihenfolge_TypeClass = (DWeg_Reihenfolge_TypeClass)theEObject;
				T result = caseDWeg_Reihenfolge_TypeClass(dWeg_Reihenfolge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Reihenfolge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS: {
				DWeg_V_Aufwertung_Verzicht_TypeClass dWeg_V_Aufwertung_Verzicht_TypeClass = (DWeg_V_Aufwertung_Verzicht_TypeClass)theEObject;
				T result = caseDWeg_V_Aufwertung_Verzicht_TypeClass(dWeg_V_Aufwertung_Verzicht_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_V_Aufwertung_Verzicht_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.DWEG_VTYPE_CLASS: {
				DWeg_V_TypeClass dWeg_V_TypeClass = (DWeg_V_TypeClass)theEObject;
				T result = caseDWeg_V_TypeClass(dWeg_V_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_V_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.DWEG_VORZUG_TYPE_CLASS: {
				DWeg_Vorzug_TypeClass dWeg_Vorzug_TypeClass = (DWeg_Vorzug_TypeClass)theEObject;
				T result = caseDWeg_Vorzug_TypeClass(dWeg_Vorzug_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Vorzug_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.ELEMENT_VERSCHLUSS_TYPE_CLASS: {
				Element_Verschluss_TypeClass element_Verschluss_TypeClass = (Element_Verschluss_TypeClass)theEObject;
				T result = caseElement_Verschluss_TypeClass(element_Verschluss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(element_Verschluss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FBEDIENUNG_TYPE_CLASS: {
				F_Bedienung_TypeClass f_Bedienung_TypeClass = (F_Bedienung_TypeClass)theEObject;
				T result = caseF_Bedienung_TypeClass(f_Bedienung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(f_Bedienung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT: {
				Fstr_Abhaengigkeit fstr_Abhaengigkeit = (Fstr_Abhaengigkeit)theEObject;
				T result = caseFstr_Abhaengigkeit(fstr_Abhaengigkeit);
				if (result == null) result = caseBasis_Objekt(fstr_Abhaengigkeit);
				if (result == null) result = caseUr_Objekt(fstr_Abhaengigkeit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP: {
				Fstr_Abhaengigkeit_Ssp_AttributeGroup fstr_Abhaengigkeit_Ssp_AttributeGroup = (Fstr_Abhaengigkeit_Ssp_AttributeGroup)theEObject;
				T result = caseFstr_Abhaengigkeit_Ssp_AttributeGroup(fstr_Abhaengigkeit_Ssp_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ANEINANDER: {
				Fstr_Aneinander fstr_Aneinander = (Fstr_Aneinander)theEObject;
				T result = caseFstr_Aneinander(fstr_Aneinander);
				if (result == null) result = caseBasis_Objekt(fstr_Aneinander);
				if (result == null) result = caseUr_Objekt(fstr_Aneinander);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS: {
				Fstr_Aneinander_Bedienstring_TypeClass fstr_Aneinander_Bedienstring_TypeClass = (Fstr_Aneinander_Bedienstring_TypeClass)theEObject;
				T result = caseFstr_Aneinander_Bedienstring_TypeClass(fstr_Aneinander_Bedienstring_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Aneinander_Bedienstring_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG: {
				Fstr_Aneinander_Zuordnung fstr_Aneinander_Zuordnung = (Fstr_Aneinander_Zuordnung)theEObject;
				T result = caseFstr_Aneinander_Zuordnung(fstr_Aneinander_Zuordnung);
				if (result == null) result = caseBasis_Objekt(fstr_Aneinander_Zuordnung);
				if (result == null) result = caseUr_Objekt(fstr_Aneinander_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE_CLASS: {
				Fstr_Bedienstring_TypeClass fstr_Bedienstring_TypeClass = (Fstr_Bedienstring_TypeClass)theEObject;
				T result = caseFstr_Bedienstring_TypeClass(fstr_Bedienstring_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Bedienstring_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_DWEG: {
				Fstr_DWeg fstr_DWeg = (Fstr_DWeg)theEObject;
				T result = caseFstr_DWeg(fstr_DWeg);
				if (result == null) result = caseBasis_Objekt(fstr_DWeg);
				if (result == null) result = caseUr_Objekt(fstr_DWeg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP: {
				Fstr_DWeg_Allg_AttributeGroup fstr_DWeg_Allg_AttributeGroup = (Fstr_DWeg_Allg_AttributeGroup)theEObject;
				T result = caseFstr_DWeg_Allg_AttributeGroup(fstr_DWeg_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Fstr_DWeg_Bezeichnung_AttributeGroup fstr_DWeg_Bezeichnung_AttributeGroup = (Fstr_DWeg_Bezeichnung_AttributeGroup)theEObject;
				T result = caseFstr_DWeg_Bezeichnung_AttributeGroup(fstr_DWeg_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP: {
				Fstr_DWeg_Spezifisch_AttributeGroup fstr_DWeg_Spezifisch_AttributeGroup = (Fstr_DWeg_Spezifisch_AttributeGroup)theEObject;
				T result = caseFstr_DWeg_Spezifisch_AttributeGroup(fstr_DWeg_Spezifisch_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_DWEG_WKR: {
				Fstr_DWeg_W_Kr fstr_DWeg_W_Kr = (Fstr_DWeg_W_Kr)theEObject;
				T result = caseFstr_DWeg_W_Kr(fstr_DWeg_W_Kr);
				if (result == null) result = caseBasis_Objekt(fstr_DWeg_W_Kr);
				if (result == null) result = caseUr_Objekt(fstr_DWeg_W_Kr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_FAHRWEG: {
				Fstr_Fahrweg fstr_Fahrweg = (Fstr_Fahrweg)theEObject;
				T result = caseFstr_Fahrweg(fstr_Fahrweg);
				if (result == null) result = caseBereich_Objekt(fstr_Fahrweg);
				if (result == null) result = caseBasis_Objekt(fstr_Fahrweg);
				if (result == null) result = caseUr_Objekt(fstr_Fahrweg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_MITTEL_ART_TYPE_CLASS: {
				Fstr_Mittel_Art_TypeClass fstr_Mittel_Art_TypeClass = (Fstr_Mittel_Art_TypeClass)theEObject;
				T result = caseFstr_Mittel_Art_TypeClass(fstr_Mittel_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Mittel_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP: {
				Fstr_Mittel_AttributeGroup fstr_Mittel_AttributeGroup = (Fstr_Mittel_AttributeGroup)theEObject;
				T result = caseFstr_Mittel_AttributeGroup(fstr_Mittel_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS: {
				Fstr_Mittel_V_Aufwertung_TypeClass fstr_Mittel_V_Aufwertung_TypeClass = (Fstr_Mittel_V_Aufwertung_TypeClass)theEObject;
				T result = caseFstr_Mittel_V_Aufwertung_TypeClass(fstr_Mittel_V_Aufwertung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Mittel_V_Aufwertung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_NICHTHALTFALL: {
				Fstr_Nichthaltfall fstr_Nichthaltfall = (Fstr_Nichthaltfall)theEObject;
				T result = caseFstr_Nichthaltfall(fstr_Nichthaltfall);
				if (result == null) result = caseBasis_Objekt(fstr_Nichthaltfall);
				if (result == null) result = caseUr_Objekt(fstr_Nichthaltfall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_RANGIER_ART_TYPE_CLASS: {
				Fstr_Rangier_Art_TypeClass fstr_Rangier_Art_TypeClass = (Fstr_Rangier_Art_TypeClass)theEObject;
				T result = caseFstr_Rangier_Art_TypeClass(fstr_Rangier_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Rangier_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP: {
				Fstr_Rangier_AttributeGroup fstr_Rangier_AttributeGroup = (Fstr_Rangier_AttributeGroup)theEObject;
				T result = caseFstr_Rangier_AttributeGroup(fstr_Rangier_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG: {
				Fstr_Rangier_Fla_Zuordnung fstr_Rangier_Fla_Zuordnung = (Fstr_Rangier_Fla_Zuordnung)theEObject;
				T result = caseFstr_Rangier_Fla_Zuordnung(fstr_Rangier_Fla_Zuordnung);
				if (result == null) result = caseBasis_Objekt(fstr_Rangier_Fla_Zuordnung);
				if (result == null) result = caseUr_Objekt(fstr_Rangier_Fla_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE_CLASS: {
				Fstr_Reihenfolge_TypeClass fstr_Reihenfolge_TypeClass = (Fstr_Reihenfolge_TypeClass)theEObject;
				T result = caseFstr_Reihenfolge_TypeClass(fstr_Reihenfolge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Reihenfolge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_SIGNALISIERUNG: {
				Fstr_Signalisierung fstr_Signalisierung = (Fstr_Signalisierung)theEObject;
				T result = caseFstr_Signalisierung(fstr_Signalisierung);
				if (result == null) result = caseBasis_Objekt(fstr_Signalisierung);
				if (result == null) result = caseUr_Objekt(fstr_Signalisierung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_UMFAHRPUNKT: {
				Fstr_Umfahrpunkt fstr_Umfahrpunkt = (Fstr_Umfahrpunkt)theEObject;
				T result = caseFstr_Umfahrpunkt(fstr_Umfahrpunkt);
				if (result == null) result = caseBasis_Objekt(fstr_Umfahrpunkt);
				if (result == null) result = caseUr_Objekt(fstr_Umfahrpunkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_VHG_TYPE_CLASS: {
				Fstr_V_Hg_TypeClass fstr_V_Hg_TypeClass = (Fstr_V_Hg_TypeClass)theEObject;
				T result = caseFstr_V_Hg_TypeClass(fstr_V_Hg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_V_Hg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_VTYPE_CLASS: {
				Fstr_V_TypeClass fstr_V_TypeClass = (Fstr_V_TypeClass)theEObject;
				T result = caseFstr_V_TypeClass(fstr_V_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_V_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS: {
				Fstr_Vsigabstand_Verkuerzt_TypeClass fstr_Vsigabstand_Verkuerzt_TypeClass = (Fstr_Vsigabstand_Verkuerzt_TypeClass)theEObject;
				T result = caseFstr_Vsigabstand_Verkuerzt_TypeClass(fstr_Vsigabstand_Verkuerzt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Vsigabstand_Verkuerzt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ZUG_ART_TYPE_CLASS: {
				Fstr_Zug_Art_TypeClass fstr_Zug_Art_TypeClass = (Fstr_Zug_Art_TypeClass)theEObject;
				T result = caseFstr_Zug_Art_TypeClass(fstr_Zug_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Zug_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP: {
				Fstr_Zug_AttributeGroup fstr_Zug_AttributeGroup = (Fstr_Zug_AttributeGroup)theEObject;
				T result = caseFstr_Zug_AttributeGroup(fstr_Zug_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP: {
				Fstr_Zug_DWeg_AttributeGroup fstr_Zug_DWeg_AttributeGroup = (Fstr_Zug_DWeg_AttributeGroup)theEObject;
				T result = caseFstr_Zug_DWeg_AttributeGroup(fstr_Zug_DWeg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ZUG_RANGIER: {
				Fstr_Zug_Rangier fstr_Zug_Rangier = (Fstr_Zug_Rangier)theEObject;
				T result = caseFstr_Zug_Rangier(fstr_Zug_Rangier);
				if (result == null) result = caseBasis_Objekt(fstr_Zug_Rangier);
				if (result == null) result = caseUr_Objekt(fstr_Zug_Rangier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP: {
				Fstr_Zug_Rangier_Allg_AttributeGroup fstr_Zug_Rangier_Allg_AttributeGroup = (Fstr_Zug_Rangier_Allg_AttributeGroup)theEObject;
				T result = caseFstr_Zug_Rangier_Allg_AttributeGroup(fstr_Zug_Rangier_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.LAENGE_SOLL_TYPE_CLASS: {
				Laenge_Soll_TypeClass laenge_Soll_TypeClass = (Laenge_Soll_TypeClass)theEObject;
				T result = caseLaenge_Soll_TypeClass(laenge_Soll_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(laenge_Soll_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.MARKANTER_PUNKT: {
				Markanter_Punkt markanter_Punkt = (Markanter_Punkt)theEObject;
				T result = caseMarkanter_Punkt(markanter_Punkt);
				if (result == null) result = caseBasis_Objekt(markanter_Punkt);
				if (result == null) result = caseUr_Objekt(markanter_Punkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Markanter_Punkt_Bezeichnung_AttributeGroup markanter_Punkt_Bezeichnung_AttributeGroup = (Markanter_Punkt_Bezeichnung_AttributeGroup)theEObject;
				T result = caseMarkanter_Punkt_Bezeichnung_AttributeGroup(markanter_Punkt_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE_CLASS: {
				Massgebende_Neigung_TypeClass massgebende_Neigung_TypeClass = (Massgebende_Neigung_TypeClass)theEObject;
				T result = caseMassgebende_Neigung_TypeClass(massgebende_Neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(massgebende_Neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS: {
				Rangier_Gegenfahrtausschluss_TypeClass rangier_Gegenfahrtausschluss_TypeClass = (Rangier_Gegenfahrtausschluss_TypeClass)theEObject;
				T result = caseRangier_Gegenfahrtausschluss_TypeClass(rangier_Gegenfahrtausschluss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rangier_Gegenfahrtausschluss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.SONSTIGER_PUNKT: {
				Sonstiger_Punkt sonstiger_Punkt = (Sonstiger_Punkt)theEObject;
				T result = caseSonstiger_Punkt(sonstiger_Punkt);
				if (result == null) result = casePunkt_Objekt(sonstiger_Punkt);
				if (result == null) result = caseBasis_Objekt(sonstiger_Punkt);
				if (result == null) result = caseUr_Objekt(sonstiger_Punkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FahrstrassePackage.START_SIGNAL_CHARAKTER_TYPE_CLASS: {
				Start_Signal_Charakter_TypeClass start_Signal_Charakter_TypeClass = (Start_Signal_Charakter_TypeClass)theEObject;
				T result = caseStart_Signal_Charakter_TypeClass(start_Signal_Charakter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(start_Signal_Charakter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufloesung Ssp Zielgleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufloesung Ssp Zielgleis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufloesung_Ssp_Zielgleis_TypeClass(Aufloesung_Ssp_Zielgleis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufloesung Verzoegerung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufloesung Verzoegerung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufloesung_Verzoegerung_TypeClass(Aufloesung_Verzoegerung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automatische Einstellung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automatische Einstellung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatische_Einstellung_TypeClass(Automatische_Einstellung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Fstr DWeg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Fstr DWeg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Fstr_DWeg_TypeClass(Bezeichnung_Fstr_DWeg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Markanter Punkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Markanter Punkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Markanter_Punkt_TypeClass(Bezeichnung_Markanter_Punkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Reihenfolge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Reihenfolge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Reihenfolge_TypeClass(DWeg_Reihenfolge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg VAufwertung Verzicht Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg VAufwertung Verzicht Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_V_Aufwertung_Verzicht_TypeClass(DWeg_V_Aufwertung_Verzicht_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg VType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg VType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_V_TypeClass(DWeg_V_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Vorzug Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Vorzug Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Vorzug_TypeClass(DWeg_Vorzug_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Verschluss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Verschluss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Verschluss_TypeClass(Element_Verschluss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBedienung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBedienung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseF_Bedienung_TypeClass(F_Bedienung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Abhaengigkeit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Abhaengigkeit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Abhaengigkeit(Fstr_Abhaengigkeit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Abhaengigkeit Ssp Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Abhaengigkeit Ssp Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Abhaengigkeit_Ssp_AttributeGroup(Fstr_Abhaengigkeit_Ssp_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Aneinander</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Aneinander</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Aneinander(Fstr_Aneinander object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Aneinander Bedienstring Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Aneinander Bedienstring Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Aneinander_Bedienstring_TypeClass(Fstr_Aneinander_Bedienstring_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Aneinander Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Aneinander Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Aneinander_Zuordnung(Fstr_Aneinander_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Bedienstring Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Bedienstring Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Bedienstring_TypeClass(Fstr_Bedienstring_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr DWeg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr DWeg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_DWeg(Fstr_DWeg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr DWeg Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr DWeg Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_DWeg_Allg_AttributeGroup(Fstr_DWeg_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr DWeg Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr DWeg Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_DWeg_Bezeichnung_AttributeGroup(Fstr_DWeg_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr DWeg Spezifisch Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr DWeg Spezifisch Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_DWeg_Spezifisch_AttributeGroup(Fstr_DWeg_Spezifisch_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr DWeg WKr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr DWeg WKr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_DWeg_W_Kr(Fstr_DWeg_W_Kr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Fahrweg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Fahrweg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Fahrweg(Fstr_Fahrweg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Mittel Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Mittel Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Mittel_Art_TypeClass(Fstr_Mittel_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Mittel Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Mittel Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Mittel_AttributeGroup(Fstr_Mittel_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Mittel VAufwertung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Mittel VAufwertung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Mittel_V_Aufwertung_TypeClass(Fstr_Mittel_V_Aufwertung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Nichthaltfall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Nichthaltfall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Nichthaltfall(Fstr_Nichthaltfall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Rangier Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Rangier Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Rangier_Art_TypeClass(Fstr_Rangier_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Rangier Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Rangier Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Rangier_AttributeGroup(Fstr_Rangier_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Rangier Fla Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Rangier Fla Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Rangier_Fla_Zuordnung(Fstr_Rangier_Fla_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Reihenfolge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Reihenfolge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Reihenfolge_TypeClass(Fstr_Reihenfolge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Signalisierung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Signalisierung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Signalisierung(Fstr_Signalisierung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Umfahrpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Umfahrpunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Umfahrpunkt(Fstr_Umfahrpunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr VHg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr VHg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_V_Hg_TypeClass(Fstr_V_Hg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr VType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr VType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_V_TypeClass(Fstr_V_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Vsigabstand Verkuerzt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Vsigabstand Verkuerzt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Vsigabstand_Verkuerzt_TypeClass(Fstr_Vsigabstand_Verkuerzt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Zug Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Zug Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Zug_Art_TypeClass(Fstr_Zug_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Zug Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Zug Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Zug_AttributeGroup(Fstr_Zug_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Zug DWeg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Zug DWeg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Zug_DWeg_AttributeGroup(Fstr_Zug_DWeg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Zug Rangier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Zug Rangier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Zug_Rangier(Fstr_Zug_Rangier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Zug Rangier Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Zug Rangier Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Zug_Rangier_Allg_AttributeGroup(Fstr_Zug_Rangier_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laenge Soll Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laenge Soll Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaenge_Soll_TypeClass(Laenge_Soll_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markanter Punkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markanter Punkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkanter_Punkt(Markanter_Punkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markanter Punkt Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markanter Punkt Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkanter_Punkt_Bezeichnung_AttributeGroup(Markanter_Punkt_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Massgebende Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Massgebende Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassgebende_Neigung_TypeClass(Massgebende_Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangier Gegenfahrtausschluss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangier Gegenfahrtausschluss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangier_Gegenfahrtausschluss_TypeClass(Rangier_Gegenfahrtausschluss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstiger Punkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstiger Punkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstiger_Punkt(Sonstiger_Punkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Signal Charakter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Signal Charakter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart_Signal_Charakter_TypeClass(Start_Signal_Charakter_TypeClass object) {
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

} //FahrstrasseSwitch
