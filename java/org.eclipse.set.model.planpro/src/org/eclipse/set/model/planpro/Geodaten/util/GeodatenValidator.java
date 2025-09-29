/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Geodaten.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage
 * @generated
 */
public class GeodatenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GeodatenValidator INSTANCE = new GeodatenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Geodaten";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisTypenValidator basisTypenValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodatenValidator() {
		super();
		basisTypenValidator = BasisTypenValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GeodatenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GeodatenPackage.ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE_CLASS:
				return validateAnzeigegefuehrt_ES_Kategorie_TypeClass((Anzeigegefuehrt_ES_Kategorie_TypeClass)value, diagnostics, context);
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE_CLASS:
				return validateBezeichnung_Strecke_TypeClass((Bezeichnung_Strecke_TypeClass)value, diagnostics, context);
			case GeodatenPackage.BREMSWEG_TYPE_CLASS:
				return validateBremsweg_TypeClass((Bremsweg_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_FORM_TYPE_CLASS:
				return validateGEO_Form_TypeClass((GEO_Form_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_KAD_TYPE_CLASS:
				return validateGEO_KAD_TypeClass((GEO_KAD_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_KANTE:
				return validateGEO_Kante((GEO_Kante)value, diagnostics, context);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP:
				return validateGEO_Kante_Allg_AttributeGroup((GEO_Kante_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.GEO_KNOTEN:
				return validateGEO_Knoten((GEO_Knoten)value, diagnostics, context);
			case GeodatenPackage.GEO_KOORDINATENSYSTEM_TYPE_CLASS:
				return validateGEO_Koordinatensystem_TypeClass((GEO_Koordinatensystem_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_LAENGE_TYPE_CLASS:
				return validateGEO_Laenge_TypeClass((GEO_Laenge_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_PAD_TYPE_CLASS:
				return validateGEO_PAD_TypeClass((GEO_PAD_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_PUNKT:
				return validateGEO_Punkt((GEO_Punkt)value, diagnostics, context);
			case GeodatenPackage.GEO_PUNKT_ALLG_ATTRIBUTE_GROUP:
				return validateGEO_Punkt_Allg_AttributeGroup((GEO_Punkt_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.GEO_RADIUS_ATYPE_CLASS:
				return validateGEO_Radius_A_TypeClass((GEO_Radius_A_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_RADIUS_BTYPE_CLASS:
				return validateGEO_Radius_B_TypeClass((GEO_Radius_B_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE_CLASS:
				return validateGEO_Richtungswinkel_TypeClass((GEO_Richtungswinkel_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE_CLASS:
				return validateGeschwindigkeit_TypeClass((Geschwindigkeit_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL:
				return validateGeschwindigkeitsprofil((Geschwindigkeitsprofil)value, diagnostics, context);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP:
				return validateGeschwindigkeitsprofil_Allg_AttributeGroup((Geschwindigkeitsprofil_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.GK_XTYPE_CLASS:
				return validateGK_X_TypeClass((GK_X_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GK_YTYPE_CLASS:
				return validateGK_Y_TypeClass((GK_Y_TypeClass)value, diagnostics, context);
			case GeodatenPackage.GK_ZTYPE_CLASS:
				return validateGK_Z_TypeClass((GK_Z_TypeClass)value, diagnostics, context);
			case GeodatenPackage.HOEHENLINIE:
				return validateHoehenlinie((Hoehenlinie)value, diagnostics, context);
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP:
				return validateHoehenlinie_Allg_AttributeGroup((Hoehenlinie_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.HOEHENLINIE_FORM_TYPE_CLASS:
				return validateHoehenlinie_Form_TypeClass((Hoehenlinie_Form_TypeClass)value, diagnostics, context);
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE_CLASS:
				return validateHoehenlinie_Laenge_TypeClass((Hoehenlinie_Laenge_TypeClass)value, diagnostics, context);
			case GeodatenPackage.HOEHENPUNKT:
				return validateHoehenpunkt((Hoehenpunkt)value, diagnostics, context);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP:
				return validateHoehenpunkt_Allg_AttributeGroup((Hoehenpunkt_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.HOEHENPUNKT_DATUM_TYPE_CLASS:
				return validateHoehenpunkt_Datum_TypeClass((Hoehenpunkt_Datum_TypeClass)value, diagnostics, context);
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE_CLASS:
				return validateHoehenpunkt_Hoehe_TypeClass((Hoehenpunkt_Hoehe_TypeClass)value, diagnostics, context);
			case GeodatenPackage.HSYSTEM_TYPE_CLASS:
				return validateHSystem_TypeClass((HSystem_TypeClass)value, diagnostics, context);
			case GeodatenPackage.KANTENNAME_TYPE_CLASS:
				return validateKantenname_TypeClass((Kantenname_TypeClass)value, diagnostics, context);
			case GeodatenPackage.KNOTENNAME_TYPE_CLASS:
				return validateKnotenname_TypeClass((Knotenname_TypeClass)value, diagnostics, context);
			case GeodatenPackage.NEIGUNG_TYPE_CLASS:
				return validateNeigung_TypeClass((Neigung_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT:
				return validateOertlichkeit((Oertlichkeit)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE_CLASS:
				return validateOertlichkeit_Abkuerzung_TypeClass((Oertlichkeit_Abkuerzung_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_ALLG_ATTRIBUTE_GROUP:
				return validateOertlichkeit_Allg_AttributeGroup((Oertlichkeit_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_ART_TYPE_CLASS:
				return validateOertlichkeit_Art_TypeClass((Oertlichkeit_Art_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateOertlichkeit_Bezeichnung_AttributeGroup((Oertlichkeit_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_AB_TYPE_CLASS:
				return validateOertlichkeit_Gueltig_Ab_TypeClass((Oertlichkeit_Gueltig_Ab_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_GUELTIG_BIS_TYPE_CLASS:
				return validateOertlichkeit_Gueltig_Bis_TypeClass((Oertlichkeit_Gueltig_Bis_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE_CLASS:
				return validateOertlichkeit_Kurzname_TypeClass((Oertlichkeit_Kurzname_TypeClass)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE_CLASS:
				return validateOertlichkeit_Langname_TypeClass((Oertlichkeit_Langname_TypeClass)value, diagnostics, context);
			case GeodatenPackage.PLAN_QUELLE_TYPE_CLASS:
				return validatePlan_Quelle_TypeClass((Plan_Quelle_TypeClass)value, diagnostics, context);
			case GeodatenPackage.STRECKE:
				return validateStrecke((Strecke)value, diagnostics, context);
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateStrecke_Bezeichnung_AttributeGroup((Strecke_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.STRECKE_BREMSWEG:
				return validateStrecke_Bremsweg((Strecke_Bremsweg)value, diagnostics, context);
			case GeodatenPackage.STRECKE_METER_TYPE_CLASS:
				return validateStrecke_Meter_TypeClass((Strecke_Meter_TypeClass)value, diagnostics, context);
			case GeodatenPackage.STRECKE_PUNKT:
				return validateStrecke_Punkt((Strecke_Punkt)value, diagnostics, context);
			case GeodatenPackage.STRECKE_RICHTUNG_TYPE_CLASS:
				return validateStrecke_Richtung_TypeClass((Strecke_Richtung_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TB_ART_TYPE_CLASS:
				return validateTB_Art_TypeClass((TB_Art_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE_CLASS:
				return validateTB_Beschreibung_TypeClass((TB_Beschreibung_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TECHNISCHER_BEREICH:
				return validateTechnischer_Bereich((Technischer_Bereich)value, diagnostics, context);
			case GeodatenPackage.TECHNISCHER_PUNKT:
				return validateTechnischer_Punkt((Technischer_Punkt)value, diagnostics, context);
			case GeodatenPackage.TOP_ANSCHLUSS_ATYPE_CLASS:
				return validateTOP_Anschluss_A_TypeClass((TOP_Anschluss_A_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TOP_ANSCHLUSS_BTYPE_CLASS:
				return validateTOP_Anschluss_B_TypeClass((TOP_Anschluss_B_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TOP_KANTE:
				return validateTOP_Kante((TOP_Kante)value, diagnostics, context);
			case GeodatenPackage.TOP_KANTE_ALLG_ATTRIBUTE_GROUP:
				return validateTOP_Kante_Allg_AttributeGroup((TOP_Kante_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.TOP_KNOTEN:
				return validateTOP_Knoten((TOP_Knoten)value, diagnostics, context);
			case GeodatenPackage.TOP_LAENGE_TYPE_CLASS:
				return validateTOP_Laenge_TypeClass((TOP_Laenge_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TP_ART_TYPE_CLASS:
				return validateTP_Art_TypeClass((TP_Art_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE_CLASS:
				return validateTP_Beschreibung_TypeClass((TP_Beschreibung_TypeClass)value, diagnostics, context);
			case GeodatenPackage.TRASSE_KANTE_CHILD_ATTRIBUTE_GROUP:
				return validateTrasse_Kante_child_AttributeGroup((Trasse_Kante_child_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNG:
				return validateUeberhoehung((Ueberhoehung)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP:
				return validateUeberhoehung_Allg_AttributeGroup((Ueberhoehung_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNG_DATUM_TYPE_CLASS:
				return validateUeberhoehung_Datum_TypeClass((Ueberhoehung_Datum_TypeClass)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE_CLASS:
				return validateUeberhoehung_Hoehe_TypeClass((Ueberhoehung_Hoehe_TypeClass)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNGSLINIE:
				return validateUeberhoehungslinie((Ueberhoehungslinie)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP:
				return validateUeberhoehungslinie_Allg_AttributeGroup((Ueberhoehungslinie_Allg_AttributeGroup)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_FORM_TYPE_CLASS:
				return validateUeberhoehungslinie_Form_TypeClass((Ueberhoehungslinie_Form_TypeClass)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE_CLASS:
				return validateUeberhoehungslinie_Laenge_TypeClass((Ueberhoehungslinie_Laenge_TypeClass)value, diagnostics, context);
			case GeodatenPackage.VPROFIL_ART_TYPE_CLASS:
				return validateV_Profil_Art_TypeClass((V_Profil_Art_TypeClass)value, diagnostics, context);
			case GeodatenPackage.ENUMGEO_FORM:
				return validateENUMGEOForm((ENUMGEOForm)value, diagnostics, context);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM:
				return validateENUMGEOKoordinatensystem((ENUMGEOKoordinatensystem)value, diagnostics, context);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM:
				return validateENUMHoehenlinieForm((ENUMHoehenlinieForm)value, diagnostics, context);
			case GeodatenPackage.ENUMH_SYSTEM:
				return validateENUMHSystem((ENUMHSystem)value, diagnostics, context);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART:
				return validateENUMOertlichkeitArt((ENUMOertlichkeitArt)value, diagnostics, context);
			case GeodatenPackage.ENUM_PLAN_QUELLE:
				return validateENUMPlanQuelle((ENUMPlanQuelle)value, diagnostics, context);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG:
				return validateENUMStreckeRichtung((ENUMStreckeRichtung)value, diagnostics, context);
			case GeodatenPackage.ENUMTB_ART:
				return validateENUMTBArt((ENUMTBArt)value, diagnostics, context);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS:
				return validateENUMTOPAnschluss((ENUMTOPAnschluss)value, diagnostics, context);
			case GeodatenPackage.ENUMTP_ART:
				return validateENUMTPArt((ENUMTPArt)value, diagnostics, context);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM:
				return validateENUMUeberhoehungslinieForm((ENUMUeberhoehungslinieForm)value, diagnostics, context);
			case GeodatenPackage.ENUMV_PROFIL_ART:
				return validateENUMVProfilArt((ENUMVProfilArt)value, diagnostics, context);
			case GeodatenPackage.ANZEIGEGEFUEHRT_ES_KATEGORIE_TYPE:
				return validateAnzeigegefuehrt_ES_Kategorie_Type((String)value, diagnostics, context);
			case GeodatenPackage.BEZEICHNUNG_STRECKE_TYPE:
				return validateBezeichnung_Strecke_Type((String)value, diagnostics, context);
			case GeodatenPackage.ENUMERATION1:
				return validateEnumeration1((String)value, diagnostics, context);
			case GeodatenPackage.ENUMGEO_FORM_OBJECT:
				return validateENUMGEOFormObject((ENUMGEOForm)value, diagnostics, context);
			case GeodatenPackage.ENUMGEO_KOORDINATENSYSTEM_OBJECT:
				return validateENUMGEOKoordinatensystemObject((ENUMGEOKoordinatensystem)value, diagnostics, context);
			case GeodatenPackage.ENUM_HOEHENLINIE_FORM_OBJECT:
				return validateENUMHoehenlinieFormObject((ENUMHoehenlinieForm)value, diagnostics, context);
			case GeodatenPackage.ENUMH_SYSTEM_OBJECT:
				return validateENUMHSystemObject((ENUMHSystem)value, diagnostics, context);
			case GeodatenPackage.ENUM_OERTLICHKEIT_ART_OBJECT:
				return validateENUMOertlichkeitArtObject((ENUMOertlichkeitArt)value, diagnostics, context);
			case GeodatenPackage.ENUM_PLAN_QUELLE_OBJECT:
				return validateENUMPlanQuelleObject((ENUMPlanQuelle)value, diagnostics, context);
			case GeodatenPackage.ENUM_STRECKE_RICHTUNG_OBJECT:
				return validateENUMStreckeRichtungObject((ENUMStreckeRichtung)value, diagnostics, context);
			case GeodatenPackage.ENUMTB_ART_OBJECT:
				return validateENUMTBArtObject((ENUMTBArt)value, diagnostics, context);
			case GeodatenPackage.ENUMTOP_ANSCHLUSS_OBJECT:
				return validateENUMTOPAnschlussObject((ENUMTOPAnschluss)value, diagnostics, context);
			case GeodatenPackage.ENUMTP_ART_OBJECT:
				return validateENUMTPArtObject((ENUMTPArt)value, diagnostics, context);
			case GeodatenPackage.ENUM_UEBERHOEHUNGSLINIE_FORM_OBJECT:
				return validateENUMUeberhoehungslinieFormObject((ENUMUeberhoehungslinieForm)value, diagnostics, context);
			case GeodatenPackage.ENUMV_PROFIL_ART_OBJECT:
				return validateENUMVProfilArtObject((ENUMVProfilArt)value, diagnostics, context);
			case GeodatenPackage.GEO_KAD_TYPE:
				return validateGEO_KAD_Type((String)value, diagnostics, context);
			case GeodatenPackage.GEO_LAENGE_TYPE:
				return validateGEO_Laenge_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GEO_PAD_TYPE:
				return validateGEO_PAD_Type((String)value, diagnostics, context);
			case GeodatenPackage.GEO_RADIUS_ATYPE:
				return validateGEO_Radius_A_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GEO_RADIUS_BTYPE:
				return validateGEO_Radius_B_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GEO_RICHTUNGSWINKEL_TYPE:
				return validateGEO_Richtungswinkel_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GESCHWINDIGKEIT_TYPE:
				return validateGeschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case GeodatenPackage.GK_XTYPE:
				return validateGK_X_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GK_YTYPE:
				return validateGK_Y_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.GK_ZTYPE:
				return validateGK_Z_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.HOEHENLINIE_LAENGE_TYPE:
				return validateHoehenlinie_Laenge_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.HOEHENPUNKT_HOEHE_TYPE:
				return validateHoehenpunkt_Hoehe_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.KANTENNAME_TYPE:
				return validateKantenname_Type((String)value, diagnostics, context);
			case GeodatenPackage.KNOTENNAME_TYPE:
				return validateKnotenname_Type((String)value, diagnostics, context);
			case GeodatenPackage.NEIGUNG_TYPE:
				return validateNeigung_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_ABKUERZUNG_TYPE:
				return validateOertlichkeit_Abkuerzung_Type((String)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_KURZNAME_TYPE:
				return validateOertlichkeit_Kurzname_Type((String)value, diagnostics, context);
			case GeodatenPackage.OERTLICHKEIT_LANGNAME_TYPE:
				return validateOertlichkeit_Langname_Type((String)value, diagnostics, context);
			case GeodatenPackage.STRECKE_METER_TYPE:
				return validateStrecke_Meter_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.TB_BESCHREIBUNG_TYPE:
				return validateTB_Beschreibung_Type((String)value, diagnostics, context);
			case GeodatenPackage.TOP_LAENGE_TYPE:
				return validateTOP_Laenge_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.TP_BESCHREIBUNG_TYPE:
				return validateTP_Beschreibung_Type((String)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNG_HOEHE_TYPE:
				return validateUeberhoehung_Hoehe_Type((BigDecimal)value, diagnostics, context);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_LAENGE_TYPE:
				return validateUeberhoehungslinie_Laenge_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzeigegefuehrt_ES_Kategorie_TypeClass(Anzeigegefuehrt_ES_Kategorie_TypeClass anzeigegefuehrt_ES_Kategorie_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anzeigegefuehrt_ES_Kategorie_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Strecke_TypeClass(Bezeichnung_Strecke_TypeClass bezeichnung_Strecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Strecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBremsweg_TypeClass(Bremsweg_TypeClass bremsweg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bremsweg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Form_TypeClass(GEO_Form_TypeClass geO_Form_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Form_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_KAD_TypeClass(GEO_KAD_TypeClass geO_KAD_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_KAD_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Kante(GEO_Kante geO_Kante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Kante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Kante_Allg_AttributeGroup(GEO_Kante_Allg_AttributeGroup geO_Kante_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Kante_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Knoten(GEO_Knoten geO_Knoten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Knoten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Koordinatensystem_TypeClass(GEO_Koordinatensystem_TypeClass geO_Koordinatensystem_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Koordinatensystem_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Laenge_TypeClass(GEO_Laenge_TypeClass geO_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_PAD_TypeClass(GEO_PAD_TypeClass geO_PAD_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_PAD_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Punkt(GEO_Punkt geO_Punkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Punkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Punkt_Allg_AttributeGroup(GEO_Punkt_Allg_AttributeGroup geO_Punkt_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Punkt_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_A_TypeClass(GEO_Radius_A_TypeClass geO_Radius_A_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Radius_A_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_B_TypeClass(GEO_Radius_B_TypeClass geO_Radius_B_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Radius_B_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Richtungswinkel_TypeClass(GEO_Richtungswinkel_TypeClass geO_Richtungswinkel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geO_Richtungswinkel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_TypeClass(Geschwindigkeit_TypeClass geschwindigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschwindigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeitsprofil(Geschwindigkeitsprofil geschwindigkeitsprofil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschwindigkeitsprofil, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeitsprofil_Allg_AttributeGroup(Geschwindigkeitsprofil_Allg_AttributeGroup geschwindigkeitsprofil_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschwindigkeitsprofil_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_X_TypeClass(GK_X_TypeClass gK_X_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gK_X_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Y_TypeClass(GK_Y_TypeClass gK_Y_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gK_Y_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Z_TypeClass(GK_Z_TypeClass gK_Z_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gK_Z_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie(Hoehenlinie hoehenlinie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenlinie, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie_Allg_AttributeGroup(Hoehenlinie_Allg_AttributeGroup hoehenlinie_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenlinie_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie_Form_TypeClass(Hoehenlinie_Form_TypeClass hoehenlinie_Form_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenlinie_Form_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie_Laenge_TypeClass(Hoehenlinie_Laenge_TypeClass hoehenlinie_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenlinie_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt(Hoehenpunkt hoehenpunkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenpunkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt_Allg_AttributeGroup(Hoehenpunkt_Allg_AttributeGroup hoehenpunkt_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenpunkt_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt_Datum_TypeClass(Hoehenpunkt_Datum_TypeClass hoehenpunkt_Datum_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenpunkt_Datum_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt_Hoehe_TypeClass(Hoehenpunkt_Hoehe_TypeClass hoehenpunkt_Hoehe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehenpunkt_Hoehe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHSystem_TypeClass(HSystem_TypeClass hSystem_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hSystem_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKantenname_TypeClass(Kantenname_TypeClass kantenname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kantenname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotenname_TypeClass(Knotenname_TypeClass knotenname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knotenname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_TypeClass(Neigung_TypeClass neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit(Oertlichkeit oertlichkeit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Abkuerzung_TypeClass(Oertlichkeit_Abkuerzung_TypeClass oertlichkeit_Abkuerzung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Abkuerzung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Allg_AttributeGroup(Oertlichkeit_Allg_AttributeGroup oertlichkeit_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Art_TypeClass(Oertlichkeit_Art_TypeClass oertlichkeit_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Bezeichnung_AttributeGroup(Oertlichkeit_Bezeichnung_AttributeGroup oertlichkeit_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Gueltig_Ab_TypeClass(Oertlichkeit_Gueltig_Ab_TypeClass oertlichkeit_Gueltig_Ab_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Gueltig_Ab_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Gueltig_Bis_TypeClass(Oertlichkeit_Gueltig_Bis_TypeClass oertlichkeit_Gueltig_Bis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Gueltig_Bis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Kurzname_TypeClass(Oertlichkeit_Kurzname_TypeClass oertlichkeit_Kurzname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Kurzname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Langname_TypeClass(Oertlichkeit_Langname_TypeClass oertlichkeit_Langname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlichkeit_Langname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlan_Quelle_TypeClass(Plan_Quelle_TypeClass plan_Quelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plan_Quelle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke(Strecke strecke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Bezeichnung_AttributeGroup(Strecke_Bezeichnung_AttributeGroup strecke_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Bremsweg(Strecke_Bremsweg strecke_Bremsweg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Bremsweg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Meter_TypeClass(Strecke_Meter_TypeClass strecke_Meter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Meter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Punkt(Strecke_Punkt strecke_Punkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Punkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Richtung_TypeClass(Strecke_Richtung_TypeClass strecke_Richtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Richtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTB_Art_TypeClass(TB_Art_TypeClass tB_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tB_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTB_Beschreibung_TypeClass(TB_Beschreibung_TypeClass tB_Beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tB_Beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnischer_Bereich(Technischer_Bereich technischer_Bereich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technischer_Bereich, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnischer_Punkt(Technischer_Punkt technischer_Punkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technischer_Punkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Anschluss_A_TypeClass(TOP_Anschluss_A_TypeClass toP_Anschluss_A_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Anschluss_A_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Anschluss_B_TypeClass(TOP_Anschluss_B_TypeClass toP_Anschluss_B_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Anschluss_B_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Kante(TOP_Kante toP_Kante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Kante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Kante_Allg_AttributeGroup(TOP_Kante_Allg_AttributeGroup toP_Kante_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Kante_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Knoten(TOP_Knoten toP_Knoten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Knoten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Laenge_TypeClass(TOP_Laenge_TypeClass toP_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toP_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTP_Art_TypeClass(TP_Art_TypeClass tP_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tP_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTP_Beschreibung_TypeClass(TP_Beschreibung_TypeClass tP_Beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tP_Beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Kante_child_AttributeGroup(Trasse_Kante_child_AttributeGroup trasse_Kante_child_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Kante_child_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung(Ueberhoehung ueberhoehung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung_Allg_AttributeGroup(Ueberhoehung_Allg_AttributeGroup ueberhoehung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung_Datum_TypeClass(Ueberhoehung_Datum_TypeClass ueberhoehung_Datum_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehung_Datum_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung_Hoehe_TypeClass(Ueberhoehung_Hoehe_TypeClass ueberhoehung_Hoehe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehung_Hoehe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie(Ueberhoehungslinie ueberhoehungslinie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehungslinie, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie_Allg_AttributeGroup(Ueberhoehungslinie_Allg_AttributeGroup ueberhoehungslinie_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehungslinie_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie_Form_TypeClass(Ueberhoehungslinie_Form_TypeClass ueberhoehungslinie_Form_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehungslinie_Form_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie_Laenge_TypeClass(Ueberhoehungslinie_Laenge_TypeClass ueberhoehungslinie_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberhoehungslinie_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Profil_Art_TypeClass(V_Profil_Art_TypeClass v_Profil_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Profil_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGEOForm(ENUMGEOForm enumgeoForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGEOKoordinatensystem(ENUMGEOKoordinatensystem enumgeoKoordinatensystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHoehenlinieForm(ENUMHoehenlinieForm enumHoehenlinieForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHSystem(ENUMHSystem enumhSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOertlichkeitArt(ENUMOertlichkeitArt enumOertlichkeitArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanQuelle(ENUMPlanQuelle enumPlanQuelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreckeRichtung(ENUMStreckeRichtung enumStreckeRichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTBArt(ENUMTBArt enumtbArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTOPAnschluss(ENUMTOPAnschluss enumtopAnschluss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTPArt(ENUMTPArt enumtpArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUeberhoehungslinieForm(ENUMUeberhoehungslinieForm enumUeberhoehungslinieForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVProfilArt(ENUMVProfilArt enumvProfilArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzeigegefuehrt_ES_Kategorie_Type(String anzeigegefuehrt_ES_Kategorie_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(anzeigegefuehrt_ES_Kategorie_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Strecke_Type(String bezeichnung_Strecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Strecke_Type_Pattern(bezeichnung_Strecke_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Strecke_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_STRECKE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}(\\-[a-zA-Z0-9])?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Strecke Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Strecke_Type_Pattern(String bezeichnung_Strecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.BEZEICHNUNG_STRECKE_TYPE, bezeichnung_Strecke_Type, BEZEICHNUNG_STRECKE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration1(String enumeration1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGEOFormObject(ENUMGEOForm enumgeoFormObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGEOKoordinatensystemObject(ENUMGEOKoordinatensystem enumgeoKoordinatensystemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHoehenlinieFormObject(ENUMHoehenlinieForm enumHoehenlinieFormObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHSystemObject(ENUMHSystem enumhSystemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOertlichkeitArtObject(ENUMOertlichkeitArt enumOertlichkeitArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPlanQuelleObject(ENUMPlanQuelle enumPlanQuelleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreckeRichtungObject(ENUMStreckeRichtung enumStreckeRichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTBArtObject(ENUMTBArt enumtbArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTOPAnschlussObject(ENUMTOPAnschluss enumtopAnschlussObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTPArtObject(ENUMTPArt enumtpArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUeberhoehungslinieFormObject(ENUMUeberhoehungslinieForm enumUeberhoehungslinieFormObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVProfilArtObject(ENUMVProfilArt enumvProfilArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_KAD_Type(String geO_KAD_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(geO_KAD_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Laenge_Type(BigDecimal geO_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGEO_Laenge_Type_Pattern(geO_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGEO_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] GEO_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?(0|[1-9][0-9]{0,3})\\.[0-9]{5}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GEO Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Laenge_Type_Pattern(BigDecimal geO_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GEO_LAENGE_TYPE, geO_Laenge_Type, GEO_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_PAD_Type(String geO_PAD_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGEO_PAD_Type_Pattern(geO_PAD_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGEO_PAD_Type_Pattern
	 */
	public static final  PatternMatcher [][] GEO_PAD_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GEO PAD Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_PAD_Type_Pattern(String geO_PAD_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GEO_PAD_TYPE, geO_PAD_Type, GEO_PAD_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_A_Type(BigDecimal geO_Radius_A_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGEO_Radius_A_Type_Pattern(geO_Radius_A_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGEO_Radius_A_Type_Pattern
	 */
	public static final  PatternMatcher [][] GEO_RADIUS_ATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GEO Radius AType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_A_Type_Pattern(BigDecimal geO_Radius_A_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GEO_RADIUS_ATYPE, geO_Radius_A_Type, GEO_RADIUS_ATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_B_Type(BigDecimal geO_Radius_B_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGEO_Radius_B_Type_Pattern(geO_Radius_B_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGEO_Radius_B_Type_Pattern
	 */
	public static final  PatternMatcher [][] GEO_RADIUS_BTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0\\.00000|(-?[1-9][0-9]{1,4}\\.[0-9]{5})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GEO Radius BType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Radius_B_Type_Pattern(BigDecimal geO_Radius_B_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GEO_RADIUS_BTYPE, geO_Radius_B_Type, GEO_RADIUS_BTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Richtungswinkel_Type(BigDecimal geO_Richtungswinkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGEO_Richtungswinkel_Type_Pattern(geO_Richtungswinkel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGEO_Richtungswinkel_Type_Pattern
	 */
	public static final  PatternMatcher [][] GEO_RICHTUNGSWINKEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,1}|[1-3][0-9]{2})\\.[0-9]{5}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GEO Richtungswinkel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEO_Richtungswinkel_Type_Pattern(BigDecimal geO_Richtungswinkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GEO_RICHTUNGSWINKEL_TYPE, geO_Richtungswinkel_Type, GEO_RICHTUNGSWINKEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_Type(BigInteger geschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(geschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_X_Type(BigDecimal gK_X_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGK_X_Type_Pattern(gK_X_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGK_X_Type_Pattern
	 */
	public static final  PatternMatcher [][] GK_XTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GK XType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_X_Type_Pattern(BigDecimal gK_X_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GK_XTYPE, gK_X_Type, GK_XTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Y_Type(BigDecimal gK_Y_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGK_Y_Type_Pattern(gK_Y_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGK_Y_Type_Pattern
	 */
	public static final  PatternMatcher [][] GK_YTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GK YType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Y_Type_Pattern(BigDecimal gK_Y_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GK_YTYPE, gK_Y_Type, GK_YTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Z_Type(BigDecimal gK_Z_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGK_Z_Type_Pattern(gK_Z_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGK_Z_Type_Pattern
	 */
	public static final  PatternMatcher [][] GK_ZTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((0|(-?[1-9][0-9]{0,}))\\.[0-9]{5})|(-0\\.([1-9][0-9]{4}|[0-9][1-9][0-9]{3}|[0-9]{2}[1-9][0-9]{2}|[0-9]{3}[1-9][0-9]|[0-9]{4}[1-9]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GK ZType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Z_Type_Pattern(BigDecimal gK_Z_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.GK_ZTYPE, gK_Z_Type, GK_ZTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie_Laenge_Type(BigDecimal hoehenlinie_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHoehenlinie_Laenge_Type_Pattern(hoehenlinie_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHoehenlinie_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] HOEHENLINIE_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}|(0|[1-9][0-9]{0,4})\\.[0-9]{5}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hoehenlinie Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenlinie_Laenge_Type_Pattern(BigDecimal hoehenlinie_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.HOEHENLINIE_LAENGE_TYPE, hoehenlinie_Laenge_Type, HOEHENLINIE_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt_Hoehe_Type(BigDecimal hoehenpunkt_Hoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHoehenpunkt_Hoehe_Type_Pattern(hoehenpunkt_Hoehe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHoehenpunkt_Hoehe_Type_Pattern
	 */
	public static final  PatternMatcher [][] HOEHENPUNKT_HOEHE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(-100\\.000|-([1-9][0-9]{0,1}\\.[0-9]{3})|(-0\\.[1-9][0-9]{2}|-0\\.0[1-9][0-9]|-0\\.0[0-9][1-9])|((0|[1-9][0-9]{0,2}|[1-2][0-9]{3})\\.[0-9]{3})|3000\\.000)|(-100\\.00000|-([1-9][0-9]{0,1}\\.[0-9]{5})|(-0\\.[1-9][0-9]{4}|-0\\.0[1-9][0-9]{3}|-0\\.0[0-9][1-9][0-9]{2}|-0\\.0[0-9]{2}[1-9][0-9]|-0\\.0[0-9]{3}[1-9])|((0|[1-9][0-9]{0,2}|[1-2][0-9]{3})\\.[0-9]{5})|3000\\.00000)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hoehenpunkt Hoehe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehenpunkt_Hoehe_Type_Pattern(BigDecimal hoehenpunkt_Hoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.HOEHENPUNKT_HOEHE_TYPE, hoehenpunkt_Hoehe_Type, HOEHENPUNKT_HOEHE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKantenname_Type(String kantenname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(kantenname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotenname_Type(String knotenname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKnotenname_Type_Pattern(knotenname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateKnotenname_Type_Pattern
	 */
	public static final  PatternMatcher [][] KNOTENNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Knotenname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotenname_Type_Pattern(String knotenname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.KNOTENNAME_TYPE, knotenname_Type, KNOTENNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_Type(BigDecimal neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNeigung_Type_Pattern(neigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNeigung_Type_Pattern
	 */
	public static final  PatternMatcher [][] NEIGUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((0\\.[0-9]{3})|((0|[1-9][0-9]{0,1})\\.[0-9]{3})|100\\.000)|((0\\.[0-9]{5})|((0|[1-9][0-9]{0,1})\\.[0-9]{5})|100\\.00000)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Neigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_Type_Pattern(BigDecimal neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.NEIGUNG_TYPE, neigung_Type, NEIGUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Abkuerzung_Type(String oertlichkeit_Abkuerzung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOertlichkeit_Abkuerzung_Type_Pattern(oertlichkeit_Abkuerzung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOertlichkeit_Abkuerzung_Type_Pattern
	 */
	public static final  PatternMatcher [][] OERTLICHKEIT_ABKUERZUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z][A-Z0-9 ]{1,4}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oertlichkeit Abkuerzung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Abkuerzung_Type_Pattern(String oertlichkeit_Abkuerzung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.OERTLICHKEIT_ABKUERZUNG_TYPE, oertlichkeit_Abkuerzung_Type, OERTLICHKEIT_ABKUERZUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Kurzname_Type(String oertlichkeit_Kurzname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOertlichkeit_Kurzname_Type_Pattern(oertlichkeit_Kurzname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOertlichkeit_Kurzname_Type_Pattern
	 */
	public static final  PatternMatcher [][] OERTLICHKEIT_KURZNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oertlichkeit Kurzname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Kurzname_Type_Pattern(String oertlichkeit_Kurzname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.OERTLICHKEIT_KURZNAME_TYPE, oertlichkeit_Kurzname_Type, OERTLICHKEIT_KURZNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Langname_Type(String oertlichkeit_Langname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOertlichkeit_Langname_Type_Pattern(oertlichkeit_Langname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOertlichkeit_Langname_Type_Pattern
	 */
	public static final  PatternMatcher [][] OERTLICHKEIT_LANGNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,40}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oertlichkeit Langname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlichkeit_Langname_Type_Pattern(String oertlichkeit_Langname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.OERTLICHKEIT_LANGNAME_TYPE, oertlichkeit_Langname_Type, OERTLICHKEIT_LANGNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Meter_Type(BigDecimal strecke_Meter_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrecke_Meter_Type_Pattern(strecke_Meter_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStrecke_Meter_Type_Pattern
	 */
	public static final  PatternMatcher [][] STRECKE_METER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?(0|[1-9][0-9]{0,5})\\.[0-9]{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Strecke Meter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Meter_Type_Pattern(BigDecimal strecke_Meter_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.STRECKE_METER_TYPE, strecke_Meter_Type, STRECKE_METER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTB_Beschreibung_Type(String tB_Beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(tB_Beschreibung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Laenge_Type(BigDecimal toP_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTOP_Laenge_Type_Pattern(toP_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTOP_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] TOP_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}|(0|[1-9][0-9]{0,4})\\.[0-9]{5}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TOP Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOP_Laenge_Type_Pattern(BigDecimal toP_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.TOP_LAENGE_TYPE, toP_Laenge_Type, TOP_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTP_Beschreibung_Type(String tP_Beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(tP_Beschreibung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung_Hoehe_Type(BigDecimal ueberhoehung_Hoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUeberhoehung_Hoehe_Type_Pattern(ueberhoehung_Hoehe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUeberhoehung_Hoehe_Type_Pattern
	 */
	public static final  PatternMatcher [][] UEBERHOEHUNG_HOEHE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?(0\\.[01][0-9][0-9]|0\\.200)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ueberhoehung Hoehe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehung_Hoehe_Type_Pattern(BigDecimal ueberhoehung_Hoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.UEBERHOEHUNG_HOEHE_TYPE, ueberhoehung_Hoehe_Type, UEBERHOEHUNG_HOEHE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie_Laenge_Type(BigDecimal ueberhoehungslinie_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUeberhoehungslinie_Laenge_Type_Pattern(ueberhoehungslinie_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUeberhoehungslinie_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] UEBERHOEHUNGSLINIE_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}|(0|[1-9][0-9]{0,4})\\.[0-9]{5}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ueberhoehungslinie Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberhoehungslinie_Laenge_Type_Pattern(BigDecimal ueberhoehungslinie_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GeodatenPackage.Literals.UEBERHOEHUNGSLINIE_LAENGE_TYPE, ueberhoehungslinie_Laenge_Type, UEBERHOEHUNGSLINIE_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GeodatenValidator
