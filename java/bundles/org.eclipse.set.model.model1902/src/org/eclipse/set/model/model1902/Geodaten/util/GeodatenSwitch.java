/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Geodaten.*;

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
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage
 * @generated
 */
public class GeodatenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeodatenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodatenSwitch() {
		if (modelPackage == null) {
			modelPackage = GeodatenPackage.eINSTANCE;
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
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE_CLASS: {
				Bezeichnung_Strecke_TypeClass bezeichnung_Strecke_TypeClass = (Bezeichnung_Strecke_TypeClass)theEObject;
				T result = caseBezeichnung_Strecke_TypeClass(bezeichnung_Strecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_Strecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_FORM_TYPE_CLASS: {
				GEO_Form_TypeClass geO_Form_TypeClass = (GEO_Form_TypeClass)theEObject;
				T result = caseGEO_Form_TypeClass(geO_Form_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_Form_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_KANTE: {
				GEO_Kante geO_Kante = (GEO_Kante)theEObject;
				T result = caseGEO_Kante(geO_Kante);
				if (result == null) result = caseBasis_Objekt(geO_Kante);
				if (result == null) result = caseUr_Objekt(geO_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP: {
				GEO_Kante_Allg_AttributeGroup geO_Kante_Allg_AttributeGroup = (GEO_Kante_Allg_AttributeGroup)theEObject;
				T result = caseGEO_Kante_Allg_AttributeGroup(geO_Kante_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_KNOTEN: {
				GEO_Knoten geO_Knoten = (GEO_Knoten)theEObject;
				T result = caseGEO_Knoten(geO_Knoten);
				if (result == null) result = caseBasis_Objekt(geO_Knoten);
				if (result == null) result = caseUr_Objekt(geO_Knoten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_KOORDINATEN_SYSTEM_LSYS_TYPE_CLASS: {
				GEO_KoordinatenSystem_LSys_TypeClass geO_KoordinatenSystem_LSys_TypeClass = (GEO_KoordinatenSystem_LSys_TypeClass)theEObject;
				T result = caseGEO_KoordinatenSystem_LSys_TypeClass(geO_KoordinatenSystem_LSys_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_KoordinatenSystem_LSys_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_KOORDINATEN_SYSTEM_SONSTIGE_TYPE_CLASS: {
				GEO_KoordinatenSystem_Sonstige_TypeClass geO_KoordinatenSystem_Sonstige_TypeClass = (GEO_KoordinatenSystem_Sonstige_TypeClass)theEObject;
				T result = caseGEO_KoordinatenSystem_Sonstige_TypeClass(geO_KoordinatenSystem_Sonstige_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_KoordinatenSystem_Sonstige_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_LAENGE_TYPE_CLASS: {
				GEO_Laenge_TypeClass geO_Laenge_TypeClass = (GEO_Laenge_TypeClass)theEObject;
				T result = caseGEO_Laenge_TypeClass(geO_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_PAD_TYPE_CLASS: {
				GEO_PAD_TypeClass geO_PAD_TypeClass = (GEO_PAD_TypeClass)theEObject;
				T result = caseGEO_PAD_TypeClass(geO_PAD_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_PAD_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_PUNKT: {
				GEO_Punkt geO_Punkt = (GEO_Punkt)theEObject;
				T result = caseGEO_Punkt(geO_Punkt);
				if (result == null) result = caseBasis_Objekt(geO_Punkt);
				if (result == null) result = caseUr_Objekt(geO_Punkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP: {
				GEO_Punkt_Allg_AttributeGroup geO_Punkt_Allg_AttributeGroup = (GEO_Punkt_Allg_AttributeGroup)theEObject;
				T result = caseGEO_Punkt_Allg_AttributeGroup(geO_Punkt_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_RADIUS_ATYPE_CLASS: {
				GEO_Radius_A_TypeClass geO_Radius_A_TypeClass = (GEO_Radius_A_TypeClass)theEObject;
				T result = caseGEO_Radius_A_TypeClass(geO_Radius_A_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_Radius_A_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_RADIUS_BTYPE_CLASS: {
				GEO_Radius_B_TypeClass geO_Radius_B_TypeClass = (GEO_Radius_B_TypeClass)theEObject;
				T result = caseGEO_Radius_B_TypeClass(geO_Radius_B_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_Radius_B_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE_CLASS: {
				GEO_Richtungswinkel_TypeClass geO_Richtungswinkel_TypeClass = (GEO_Richtungswinkel_TypeClass)theEObject;
				T result = caseGEO_Richtungswinkel_TypeClass(geO_Richtungswinkel_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geO_Richtungswinkel_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE_CLASS: {
				Geschwindigkeit_TypeClass geschwindigkeit_TypeClass = (Geschwindigkeit_TypeClass)theEObject;
				T result = caseGeschwindigkeit_TypeClass(geschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(geschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL: {
				Geschwindigkeitsprofil geschwindigkeitsprofil = (Geschwindigkeitsprofil)theEObject;
				T result = caseGeschwindigkeitsprofil(geschwindigkeitsprofil);
				if (result == null) result = caseBereich_Objekt(geschwindigkeitsprofil);
				if (result == null) result = caseBasis_Objekt(geschwindigkeitsprofil);
				if (result == null) result = caseUr_Objekt(geschwindigkeitsprofil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP: {
				Geschwindigkeitsprofil_Allg_AttributeGroup geschwindigkeitsprofil_Allg_AttributeGroup = (Geschwindigkeitsprofil_Allg_AttributeGroup)theEObject;
				T result = caseGeschwindigkeitsprofil_Allg_AttributeGroup(geschwindigkeitsprofil_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GK_XTYPE_CLASS: {
				GK_X_TypeClass gK_X_TypeClass = (GK_X_TypeClass)theEObject;
				T result = caseGK_X_TypeClass(gK_X_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gK_X_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GK_YTYPE_CLASS: {
				GK_Y_TypeClass gK_Y_TypeClass = (GK_Y_TypeClass)theEObject;
				T result = caseGK_Y_TypeClass(gK_Y_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gK_Y_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.GK_ZTYPE_CLASS: {
				GK_Z_TypeClass gK_Z_TypeClass = (GK_Z_TypeClass)theEObject;
				T result = caseGK_Z_TypeClass(gK_Z_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gK_Z_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENLINIE: {
				Hoehenlinie hoehenlinie = (Hoehenlinie)theEObject;
				T result = caseHoehenlinie(hoehenlinie);
				if (result == null) result = caseBasis_Objekt(hoehenlinie);
				if (result == null) result = caseUr_Objekt(hoehenlinie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP: {
				Hoehenlinie_Allg_AttributeGroup hoehenlinie_Allg_AttributeGroup = (Hoehenlinie_Allg_AttributeGroup)theEObject;
				T result = caseHoehenlinie_Allg_AttributeGroup(hoehenlinie_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENLINIE_FORM_TYPE_CLASS: {
				Hoehenlinie_Form_TypeClass hoehenlinie_Form_TypeClass = (Hoehenlinie_Form_TypeClass)theEObject;
				T result = caseHoehenlinie_Form_TypeClass(hoehenlinie_Form_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoehenlinie_Form_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE_CLASS: {
				Hoehenlinie_Laenge_TypeClass hoehenlinie_Laenge_TypeClass = (Hoehenlinie_Laenge_TypeClass)theEObject;
				T result = caseHoehenlinie_Laenge_TypeClass(hoehenlinie_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoehenlinie_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENPUNKT: {
				Hoehenpunkt hoehenpunkt = (Hoehenpunkt)theEObject;
				T result = caseHoehenpunkt(hoehenpunkt);
				if (result == null) result = casePunkt_Objekt(hoehenpunkt);
				if (result == null) result = caseBasis_Objekt(hoehenpunkt);
				if (result == null) result = caseUr_Objekt(hoehenpunkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP: {
				Hoehenpunkt_Allg_AttributeGroup hoehenpunkt_Allg_AttributeGroup = (Hoehenpunkt_Allg_AttributeGroup)theEObject;
				T result = caseHoehenpunkt_Allg_AttributeGroup(hoehenpunkt_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENPUNKT_DATUM_TYPE_CLASS: {
				Hoehenpunkt_Datum_TypeClass hoehenpunkt_Datum_TypeClass = (Hoehenpunkt_Datum_TypeClass)theEObject;
				T result = caseHoehenpunkt_Datum_TypeClass(hoehenpunkt_Datum_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoehenpunkt_Datum_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE_CLASS: {
				Hoehenpunkt_Hoehe_TypeClass hoehenpunkt_Hoehe_TypeClass = (Hoehenpunkt_Hoehe_TypeClass)theEObject;
				T result = caseHoehenpunkt_Hoehe_TypeClass(hoehenpunkt_Hoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hoehenpunkt_Hoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.HSYSTEM_TYPE_CLASS: {
				HSystem_TypeClass hSystem_TypeClass = (HSystem_TypeClass)theEObject;
				T result = caseHSystem_TypeClass(hSystem_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hSystem_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.KNOTENNAME_TYPE_CLASS: {
				Knotenname_TypeClass knotenname_TypeClass = (Knotenname_TypeClass)theEObject;
				T result = caseKnotenname_TypeClass(knotenname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(knotenname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.NEIGUNG_TYPE_CLASS: {
				Neigung_TypeClass neigung_TypeClass = (Neigung_TypeClass)theEObject;
				T result = caseNeigung_TypeClass(neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT: {
				Oertlichkeit oertlichkeit = (Oertlichkeit)theEObject;
				T result = caseOertlichkeit(oertlichkeit);
				if (result == null) result = caseBasis_Objekt(oertlichkeit);
				if (result == null) result = caseUr_Objekt(oertlichkeit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS: {
				Oertlichkeit_Abkuerzung_TypeClass oertlichkeit_Abkuerzung_TypeClass = (Oertlichkeit_Abkuerzung_TypeClass)theEObject;
				T result = caseOertlichkeit_Abkuerzung_TypeClass(oertlichkeit_Abkuerzung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Abkuerzung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP: {
				Oertlichkeit_Allg_AttributeGroup oertlichkeit_Allg_AttributeGroup = (Oertlichkeit_Allg_AttributeGroup)theEObject;
				T result = caseOertlichkeit_Allg_AttributeGroup(oertlichkeit_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_ART_TYPE_CLASS: {
				Oertlichkeit_Art_TypeClass oertlichkeit_Art_TypeClass = (Oertlichkeit_Art_TypeClass)theEObject;
				T result = caseOertlichkeit_Art_TypeClass(oertlichkeit_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Oertlichkeit_Bezeichnung_AttributeGroup oertlichkeit_Bezeichnung_AttributeGroup = (Oertlichkeit_Bezeichnung_AttributeGroup)theEObject;
				T result = caseOertlichkeit_Bezeichnung_AttributeGroup(oertlichkeit_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS: {
				Oertlichkeit_Gueltig_Ab_TypeClass oertlichkeit_Gueltig_Ab_TypeClass = (Oertlichkeit_Gueltig_Ab_TypeClass)theEObject;
				T result = caseOertlichkeit_Gueltig_Ab_TypeClass(oertlichkeit_Gueltig_Ab_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Gueltig_Ab_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS: {
				Oertlichkeit_Gueltig_Bis_TypeClass oertlichkeit_Gueltig_Bis_TypeClass = (Oertlichkeit_Gueltig_Bis_TypeClass)theEObject;
				T result = caseOertlichkeit_Gueltig_Bis_TypeClass(oertlichkeit_Gueltig_Bis_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Gueltig_Bis_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE_CLASS: {
				Oertlichkeit_Kurzname_TypeClass oertlichkeit_Kurzname_TypeClass = (Oertlichkeit_Kurzname_TypeClass)theEObject;
				T result = caseOertlichkeit_Kurzname_TypeClass(oertlichkeit_Kurzname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Kurzname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE_CLASS: {
				Oertlichkeit_Langname_TypeClass oertlichkeit_Langname_TypeClass = (Oertlichkeit_Langname_TypeClass)theEObject;
				T result = caseOertlichkeit_Langname_TypeClass(oertlichkeit_Langname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oertlichkeit_Langname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.PLAN_QUELLE_TYPE_CLASS: {
				Plan_Quelle_TypeClass plan_Quelle_TypeClass = (Plan_Quelle_TypeClass)theEObject;
				T result = casePlan_Quelle_TypeClass(plan_Quelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(plan_Quelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.STRECKE: {
				Strecke strecke = (Strecke)theEObject;
				T result = caseStrecke(strecke);
				if (result == null) result = caseBereich_Objekt(strecke);
				if (result == null) result = caseBasis_Objekt(strecke);
				if (result == null) result = caseUr_Objekt(strecke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				Strecke_Bezeichnung_AttributeGroup strecke_Bezeichnung_AttributeGroup = (Strecke_Bezeichnung_AttributeGroup)theEObject;
				T result = caseStrecke_Bezeichnung_AttributeGroup(strecke_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.STRECKE_METER_TYPE_CLASS: {
				Strecke_Meter_TypeClass strecke_Meter_TypeClass = (Strecke_Meter_TypeClass)theEObject;
				T result = caseStrecke_Meter_TypeClass(strecke_Meter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(strecke_Meter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.STRECKE_PUNKT: {
				Strecke_Punkt strecke_Punkt = (Strecke_Punkt)theEObject;
				T result = caseStrecke_Punkt(strecke_Punkt);
				if (result == null) result = caseBasis_Objekt(strecke_Punkt);
				if (result == null) result = caseUr_Objekt(strecke_Punkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TB_ART_TYPE_CLASS: {
				TB_Art_TypeClass tB_Art_TypeClass = (TB_Art_TypeClass)theEObject;
				T result = caseTB_Art_TypeClass(tB_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tB_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE_CLASS: {
				TB_Beschreibung_TypeClass tB_Beschreibung_TypeClass = (TB_Beschreibung_TypeClass)theEObject;
				T result = caseTB_Beschreibung_TypeClass(tB_Beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tB_Beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TECHNISCHER_BEREICH: {
				Technischer_Bereich technischer_Bereich = (Technischer_Bereich)theEObject;
				T result = caseTechnischer_Bereich(technischer_Bereich);
				if (result == null) result = caseBereich_Objekt(technischer_Bereich);
				if (result == null) result = caseBasis_Objekt(technischer_Bereich);
				if (result == null) result = caseUr_Objekt(technischer_Bereich);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TECHNISCHER_PUNKT: {
				Technischer_Punkt technischer_Punkt = (Technischer_Punkt)theEObject;
				T result = caseTechnischer_Punkt(technischer_Punkt);
				if (result == null) result = casePunkt_Objekt(technischer_Punkt);
				if (result == null) result = caseBasis_Objekt(technischer_Punkt);
				if (result == null) result = caseUr_Objekt(technischer_Punkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_ANSCHLUSS_ATYPE_CLASS: {
				TOP_Anschluss_A_TypeClass toP_Anschluss_A_TypeClass = (TOP_Anschluss_A_TypeClass)theEObject;
				T result = caseTOP_Anschluss_A_TypeClass(toP_Anschluss_A_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(toP_Anschluss_A_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_ANSCHLUSS_BTYPE_CLASS: {
				TOP_Anschluss_B_TypeClass toP_Anschluss_B_TypeClass = (TOP_Anschluss_B_TypeClass)theEObject;
				T result = caseTOP_Anschluss_B_TypeClass(toP_Anschluss_B_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(toP_Anschluss_B_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_KANTE: {
				TOP_Kante toP_Kante = (TOP_Kante)theEObject;
				T result = caseTOP_Kante(toP_Kante);
				if (result == null) result = caseBasis_Objekt(toP_Kante);
				if (result == null) result = caseUr_Objekt(toP_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP: {
				TOP_Kante_Allg_AttributeGroup toP_Kante_Allg_AttributeGroup = (TOP_Kante_Allg_AttributeGroup)theEObject;
				T result = caseTOP_Kante_Allg_AttributeGroup(toP_Kante_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_KNOTEN: {
				TOP_Knoten toP_Knoten = (TOP_Knoten)theEObject;
				T result = caseTOP_Knoten(toP_Knoten);
				if (result == null) result = caseBasis_Objekt(toP_Knoten);
				if (result == null) result = caseUr_Objekt(toP_Knoten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TOP_LAENGE_TYPE_CLASS: {
				TOP_Laenge_TypeClass toP_Laenge_TypeClass = (TOP_Laenge_TypeClass)theEObject;
				T result = caseTOP_Laenge_TypeClass(toP_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(toP_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TP_ART_TYPE_CLASS: {
				TP_Art_TypeClass tP_Art_TypeClass = (TP_Art_TypeClass)theEObject;
				T result = caseTP_Art_TypeClass(tP_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tP_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE_CLASS: {
				TP_Beschreibung_TypeClass tP_Beschreibung_TypeClass = (TP_Beschreibung_TypeClass)theEObject;
				T result = caseTP_Beschreibung_TypeClass(tP_Beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tP_Beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNG: {
				Ueberhoehung ueberhoehung = (Ueberhoehung)theEObject;
				T result = caseUeberhoehung(ueberhoehung);
				if (result == null) result = casePunkt_Objekt(ueberhoehung);
				if (result == null) result = caseBasis_Objekt(ueberhoehung);
				if (result == null) result = caseUr_Objekt(ueberhoehung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP: {
				Ueberhoehung_Allg_AttributeGroup ueberhoehung_Allg_AttributeGroup = (Ueberhoehung_Allg_AttributeGroup)theEObject;
				T result = caseUeberhoehung_Allg_AttributeGroup(ueberhoehung_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNG_DATUM_TYPE_CLASS: {
				Ueberhoehung_Datum_TypeClass ueberhoehung_Datum_TypeClass = (Ueberhoehung_Datum_TypeClass)theEObject;
				T result = caseUeberhoehung_Datum_TypeClass(ueberhoehung_Datum_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ueberhoehung_Datum_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE_CLASS: {
				Ueberhoehung_Hoehe_TypeClass ueberhoehung_Hoehe_TypeClass = (Ueberhoehung_Hoehe_TypeClass)theEObject;
				T result = caseUeberhoehung_Hoehe_TypeClass(ueberhoehung_Hoehe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ueberhoehung_Hoehe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNGSLINIE: {
				Ueberhoehungslinie ueberhoehungslinie = (Ueberhoehungslinie)theEObject;
				T result = caseUeberhoehungslinie(ueberhoehungslinie);
				if (result == null) result = caseBasis_Objekt(ueberhoehungslinie);
				if (result == null) result = caseUr_Objekt(ueberhoehungslinie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP: {
				Ueberhoehungslinie_Allg_AttributeGroup ueberhoehungslinie_Allg_AttributeGroup = (Ueberhoehungslinie_Allg_AttributeGroup)theEObject;
				T result = caseUeberhoehungslinie_Allg_AttributeGroup(ueberhoehungslinie_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS: {
				Ueberhoehungslinie_Form_TypeClass ueberhoehungslinie_Form_TypeClass = (Ueberhoehungslinie_Form_TypeClass)theEObject;
				T result = caseUeberhoehungslinie_Form_TypeClass(ueberhoehungslinie_Form_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ueberhoehungslinie_Form_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS: {
				Ueberhoehungslinie_Laenge_TypeClass ueberhoehungslinie_Laenge_TypeClass = (Ueberhoehungslinie_Laenge_TypeClass)theEObject;
				T result = caseUeberhoehungslinie_Laenge_TypeClass(ueberhoehungslinie_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ueberhoehungslinie_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.VPROFIL_ART_TYPE_CLASS: {
				V_Profil_Art_TypeClass v_Profil_Art_TypeClass = (V_Profil_Art_TypeClass)theEObject;
				T result = caseV_Profil_Art_TypeClass(v_Profil_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Profil_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeodatenPackage.WIRKRICHTUNG_TYPE_CLASS: {
				Wirkrichtung_TypeClass wirkrichtung_TypeClass = (Wirkrichtung_TypeClass)theEObject;
				T result = caseWirkrichtung_TypeClass(wirkrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirkrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung Strecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung Strecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_Strecke_TypeClass(Bezeichnung_Strecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Form Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Form Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Form_TypeClass(GEO_Form_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Kante(GEO_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Kante Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Kante Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Kante_Allg_AttributeGroup(GEO_Kante_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Knoten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Knoten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Knoten(GEO_Knoten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Koordinaten System LSys Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Koordinaten System LSys Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_KoordinatenSystem_LSys_TypeClass(GEO_KoordinatenSystem_LSys_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Koordinaten System Sonstige Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Koordinaten System Sonstige Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_KoordinatenSystem_Sonstige_TypeClass(GEO_KoordinatenSystem_Sonstige_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Laenge_TypeClass(GEO_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO PAD Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO PAD Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_PAD_TypeClass(GEO_PAD_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Punkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Punkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Punkt(GEO_Punkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Punkt Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Punkt Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Punkt_Allg_AttributeGroup(GEO_Punkt_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Radius AType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Radius AType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Radius_A_TypeClass(GEO_Radius_A_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Radius BType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Radius BType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Radius_B_TypeClass(GEO_Radius_B_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEO Richtungswinkel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEO Richtungswinkel Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEO_Richtungswinkel_TypeClass(GEO_Richtungswinkel_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeit_TypeClass(Geschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeitsprofil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeitsprofil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeitsprofil(Geschwindigkeitsprofil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschwindigkeitsprofil Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschwindigkeitsprofil Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschwindigkeitsprofil_Allg_AttributeGroup(Geschwindigkeitsprofil_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GK XType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GK XType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGK_X_TypeClass(GK_X_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GK YType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GK YType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGK_Y_TypeClass(GK_Y_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GK ZType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GK ZType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGK_Z_TypeClass(GK_Z_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenlinie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenlinie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenlinie(Hoehenlinie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenlinie Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenlinie Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenlinie_Allg_AttributeGroup(Hoehenlinie_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenlinie Form Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenlinie Form Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenlinie_Form_TypeClass(Hoehenlinie_Form_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenlinie Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenlinie Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenlinie_Laenge_TypeClass(Hoehenlinie_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenpunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenpunkt(Hoehenpunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenpunkt Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenpunkt Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenpunkt_Allg_AttributeGroup(Hoehenpunkt_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenpunkt Datum Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenpunkt Datum Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenpunkt_Datum_TypeClass(Hoehenpunkt_Datum_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoehenpunkt Hoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoehenpunkt Hoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoehenpunkt_Hoehe_TypeClass(Hoehenpunkt_Hoehe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSystem Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSystem Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSystem_TypeClass(HSystem_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knotenname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knotenname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnotenname_TypeClass(Knotenname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeigung_TypeClass(Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit(Oertlichkeit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Abkuerzung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Abkuerzung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Abkuerzung_TypeClass(Oertlichkeit_Abkuerzung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Allg_AttributeGroup(Oertlichkeit_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Art_TypeClass(Oertlichkeit_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Bezeichnung_AttributeGroup(Oertlichkeit_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Gueltig Ab Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Gueltig Ab Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Gueltig_Ab_TypeClass(Oertlichkeit_Gueltig_Ab_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Gueltig Bis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Gueltig Bis Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Gueltig_Bis_TypeClass(Oertlichkeit_Gueltig_Bis_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Kurzname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Kurzname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Kurzname_TypeClass(Oertlichkeit_Kurzname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oertlichkeit Langname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oertlichkeit Langname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOertlichkeit_Langname_TypeClass(Oertlichkeit_Langname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Quelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Quelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlan_Quelle_TypeClass(Plan_Quelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke(Strecke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Bezeichnung_AttributeGroup(Strecke_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Meter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Meter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Meter_TypeClass(Strecke_Meter_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strecke Punkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strecke Punkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrecke_Punkt(Strecke_Punkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TB Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TB Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTB_Art_TypeClass(TB_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TB Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TB Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTB_Beschreibung_TypeClass(TB_Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technischer Bereich</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technischer Bereich</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnischer_Bereich(Technischer_Bereich object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technischer Punkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technischer Punkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnischer_Punkt(Technischer_Punkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Anschluss AType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Anschluss AType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Anschluss_A_TypeClass(TOP_Anschluss_A_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Anschluss BType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Anschluss BType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Anschluss_B_TypeClass(TOP_Anschluss_B_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Kante(TOP_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Kante Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Kante Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Kante_Allg_AttributeGroup(TOP_Kante_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Knoten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Knoten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Knoten(TOP_Knoten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP_Laenge_TypeClass(TOP_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TP Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TP Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTP_Art_TypeClass(TP_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TP Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TP Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTP_Beschreibung_TypeClass(TP_Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehung(Ueberhoehung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehung Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehung_Allg_AttributeGroup(Ueberhoehung_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehung Datum Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehung Datum Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehung_Datum_TypeClass(Ueberhoehung_Datum_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehung Hoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehung Hoehe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehung_Hoehe_TypeClass(Ueberhoehung_Hoehe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehungslinie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehungslinie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehungslinie(Ueberhoehungslinie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehungslinie_Allg_AttributeGroup(Ueberhoehungslinie_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Form Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Form Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehungslinie_Form_TypeClass(Ueberhoehungslinie_Form_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberhoehungslinie Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberhoehungslinie_Laenge_TypeClass(Ueberhoehungslinie_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VProfil Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VProfil Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Profil_Art_TypeClass(V_Profil_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wirkrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirkrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirkrichtung_TypeClass(Wirkrichtung_TypeClass object) {
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

} //GeodatenSwitch
