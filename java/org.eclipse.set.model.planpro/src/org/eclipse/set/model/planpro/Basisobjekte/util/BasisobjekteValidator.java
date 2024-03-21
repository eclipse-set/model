/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.util;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Basisobjekte.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage
 * @generated
 */
public class BasisobjekteValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasisobjekteValidator INSTANCE = new BasisobjekteValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Basisobjekte";

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
	public BasisobjekteValidator() {
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
	  return BasisobjektePackage.eINSTANCE;
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
			case BasisobjektePackage.ABSTAND_TYPE_CLASS:
				return validateAbstand_TypeClass((Abstand_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.ANHANG:
				return validateAnhang((Anhang)value, diagnostics, context);
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP:
				return validateAnhang_Allg_AttributeGroup((Anhang_Allg_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.ANHANG_ART_TYPE_CLASS:
				return validateAnhang_Art_TypeClass((Anhang_Art_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BASIS_OBJEKT:
				return validateBasis_Objekt((Basis_Objekt)value, diagnostics, context);
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP:
				return validateBasis_Objekt_Allg_AttributeGroup((Basis_Objekt_Allg_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.BEARBEITUNGSVERMERK:
				return validateBearbeitungsvermerk((Bearbeitungsvermerk)value, diagnostics, context);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ALLG_ATTRIBUTE_GROUP:
				return validateBearbeitungsvermerk_Allg_AttributeGroup((Bearbeitungsvermerk_Allg_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.BEARBEITUNGSVERMERK_ROLLE_TYPE_CLASS:
				return validateBearbeitungsvermerk_Rolle_TypeClass((Bearbeitungsvermerk_Rolle_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BEGRENZUNG_ATYPE_CLASS:
				return validateBegrenzung_A_TypeClass((Begrenzung_A_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BEGRENZUNG_BTYPE_CLASS:
				return validateBegrenzung_B_TypeClass((Begrenzung_B_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BEREICH_OBJEKT:
				return validateBereich_Objekt((Bereich_Objekt)value, diagnostics, context);
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP:
				return validateBereich_Objekt_Teilbereich_AttributeGroup((Bereich_Objekt_Teilbereich_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.BESCHREIBUNG_TYPE_CLASS:
				return validateBeschreibung_TypeClass((Beschreibung_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BESTANDSRELEVANZ_TYPE_CLASS:
				return validateBestandsrelevanz_TypeClass((Bestandsrelevanz_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BESTANDSSCHUTZ_TYPE_CLASS:
				return validateBestandsschutz_TypeClass((Bestandsschutz_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BV_DARSTELLUNG_IN_PLAN_TYPE_CLASS:
				return validateBV_Darstellung_In_Plan_TypeClass((BV_Darstellung_In_Plan_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.BV_KATEGORIE_TYPE_CLASS:
				return validateBV_Kategorie_TypeClass((BV_Kategorie_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.DATEINAME_TYPE_CLASS:
				return validateDateiname_TypeClass((Dateiname_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.DATEITYP_TYPE_CLASS:
				return validateDateityp_TypeClass((Dateityp_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.DATUM_REGELWERK_TYPE_CLASS:
				return validateDatum_Regelwerk_TypeClass((Datum_Regelwerk_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE_CLASS:
				return validateDB_GDI_Referenz_TypeClass((DB_GDI_Referenz_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.IDENTITAET_TYPE_CLASS:
				return validateIdentitaet_TypeClass((Identitaet_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.KM_MASSGEBEND_TYPE_CLASS:
				return validateKm_Massgebend_TypeClass((Km_Massgebend_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.KOMMENTAR_TYPE_CLASS:
				return validateKommentar_TypeClass((Kommentar_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.KURZTEXT_TYPE_CLASS:
				return validateKurztext_TypeClass((Kurztext_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LIEFEROBJEKT:
				return validateLieferobjekt((Lieferobjekt)value, diagnostics, context);
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE_CLASS:
				return validateLO_Ausgabestand_TypeClass((LO_Ausgabestand_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_DATUM_HERSTELLUNG_TYPE_CLASS:
				return validateLO_Datum_Herstellung_TypeClass((LO_Datum_Herstellung_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE_CLASS:
				return validateLO_DB_Freigabe_TypeClass((LO_DB_Freigabe_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_EMA_NR_TYPE_CLASS:
				return validateLO_EMA_Nr_TypeClass((LO_EMA_Nr_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_ERSATZ_TYPE_CLASS:
				return validateLO_Ersatz_TypeClass((LO_Ersatz_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE_CLASS:
				return validateLO_Firmensachnummer_TypeClass((LO_Firmensachnummer_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LO_MATERIAL_ATTRIBUTE_GROUP:
				return validateLO_Material_AttributeGroup((LO_Material_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE_CLASS:
				return validateLO_Seriennummer_TypeClass((LO_Seriennummer_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.LST_OBJEKT_ART_TYPE_CLASS:
				return validateLST_Objekt_Art_TypeClass((LST_Objekt_Art_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP:
				return validateObjektreferenzen_AttributeGroup((Objektreferenzen_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.OBJEKTZUSTAND_BESONDERS_TYPE_CLASS:
				return validateObjektzustand_Besonders_TypeClass((Objektzustand_Besonders_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.PROXY_OBJEKT:
				return validateProxy_Objekt((Proxy_Objekt)value, diagnostics, context);
			case BasisobjektePackage.PUNKT_OBJEKT:
				return validatePunkt_Objekt((Punkt_Objekt)value, diagnostics, context);
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP:
				return validatePunkt_Objekt_Strecke_AttributeGroup((Punkt_Objekt_Strecke_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP:
				return validatePunkt_Objekt_TOP_Kante_AttributeGroup((Punkt_Objekt_TOP_Kante_AttributeGroup)value, diagnostics, context);
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE_CLASS:
				return validateRichtungsbezug_TypeClass((Richtungsbezug_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE_CLASS:
				return validateSeitliche_Lage_TypeClass((Seitliche_Lage_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE_CLASS:
				return validateSeitlicher_Abstand_TypeClass((Seitlicher_Abstand_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.STRECKE_KM_TYPE_CLASS:
				return validateStrecke_Km_TypeClass((Strecke_Km_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE_CLASS:
				return validateTechnischer_Platz_TypeClass((Technischer_Platz_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.UR_OBJEKT:
				return validateUr_Objekt((Ur_Objekt)value, diagnostics, context);
			case BasisobjektePackage.WIRKRICHTUNG_TYPE_CLASS:
				return validateWirkrichtung_TypeClass((Wirkrichtung_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.ZEIT_BEARBEITUNGSVERMERK_TYPE_CLASS:
				return validateZeit_Bearbeitungsvermerk_TypeClass((Zeit_Bearbeitungsvermerk_TypeClass)value, diagnostics, context);
			case BasisobjektePackage.ENUM_ANHANG_ART:
				return validateENUMAnhangArt((ENUMAnhangArt)value, diagnostics, context);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ:
				return validateENUMBestandsrelevanz((ENUMBestandsrelevanz)value, diagnostics, context);
			case BasisobjektePackage.ENUMBV_DARSTELLUNG_IN_PLAN:
				return validateENUMBVDarstellungInPlan((ENUMBVDarstellungInPlan)value, diagnostics, context);
			case BasisobjektePackage.ENUM_DATEITYP:
				return validateENUMDateityp((ENUMDateityp)value, diagnostics, context);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART:
				return validateENUMLSTObjektArt((ENUMLSTObjektArt)value, diagnostics, context);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS:
				return validateENUMObjektzustandBesonders((ENUMObjektzustandBesonders)value, diagnostics, context);
			case BasisobjektePackage.ENUM_ROLLE:
				return validateENUMRolle((ENUMRolle)value, diagnostics, context);
			case BasisobjektePackage.ABSTAND_TYPE:
				return validateAbstand_Type((BigDecimal)value, diagnostics, context);
			case BasisobjektePackage.BEGRENZUNG_ATYPE:
				return validateBegrenzung_A_Type((BigDecimal)value, diagnostics, context);
			case BasisobjektePackage.BEGRENZUNG_BTYPE:
				return validateBegrenzung_B_Type((BigDecimal)value, diagnostics, context);
			case BasisobjektePackage.BESCHREIBUNG_TYPE:
				return validateBeschreibung_Type((String)value, diagnostics, context);
			case BasisobjektePackage.BV_KATEGORIE_TYPE:
				return validateBV_Kategorie_Type((String)value, diagnostics, context);
			case BasisobjektePackage.DB_GDI_REFERENZ_TYPE:
				return validateDB_GDI_Referenz_Type((String)value, diagnostics, context);
			case BasisobjektePackage.ENUM_ANHANG_ART_OBJECT:
				return validateENUMAnhangArtObject((ENUMAnhangArt)value, diagnostics, context);
			case BasisobjektePackage.ENUM_BESTANDSRELEVANZ_OBJECT:
				return validateENUMBestandsrelevanzObject((ENUMBestandsrelevanz)value, diagnostics, context);
			case BasisobjektePackage.ENUMBV_DARSTELLUNG_IN_PLAN_OBJECT:
				return validateENUMBVDarstellungInPlanObject((ENUMBVDarstellungInPlan)value, diagnostics, context);
			case BasisobjektePackage.ENUM_DATEITYP_OBJECT:
				return validateENUMDateitypObject((ENUMDateityp)value, diagnostics, context);
			case BasisobjektePackage.ENUMLST_OBJEKT_ART_OBJECT:
				return validateENUMLSTObjektArtObject((ENUMLSTObjektArt)value, diagnostics, context);
			case BasisobjektePackage.ENUM_OBJEKTZUSTAND_BESONDERS_OBJECT:
				return validateENUMObjektzustandBesondersObject((ENUMObjektzustandBesonders)value, diagnostics, context);
			case BasisobjektePackage.ENUM_ROLLE_OBJECT:
				return validateENUMRolleObject((ENUMRolle)value, diagnostics, context);
			case BasisobjektePackage.IDENTITAET_TYPE:
				return validateIdentitaet_Type((String)value, diagnostics, context);
			case BasisobjektePackage.KOMMENTAR_TYPE:
				return validateKommentar_Type((String)value, diagnostics, context);
			case BasisobjektePackage.KURZTEXT_TYPE:
				return validateKurztext_Type((String)value, diagnostics, context);
			case BasisobjektePackage.LO_AUSGABESTAND_TYPE:
				return validateLO_Ausgabestand_Type((String)value, diagnostics, context);
			case BasisobjektePackage.LO_DB_FREIGABE_TYPE:
				return validateLO_DB_Freigabe_Type((String)value, diagnostics, context);
			case BasisobjektePackage.LO_EMA_NR_TYPE:
				return validateLO_EMA_Nr_Type((String)value, diagnostics, context);
			case BasisobjektePackage.LO_FIRMENSACHNUMMER_TYPE:
				return validateLO_Firmensachnummer_Type((String)value, diagnostics, context);
			case BasisobjektePackage.LO_SERIENNUMMER_TYPE:
				return validateLO_Seriennummer_Type((String)value, diagnostics, context);
			case BasisobjektePackage.RICHTUNGSBEZUG_TYPE:
				return validateRichtungsbezug_Type((ENUMWirkrichtung)value, diagnostics, context);
			case BasisobjektePackage.SEITLICHE_LAGE_TYPE:
				return validateSeitliche_Lage_Type((ENUMLinksRechts)value, diagnostics, context);
			case BasisobjektePackage.SEITLICHER_ABSTAND_TYPE:
				return validateSeitlicher_Abstand_Type((BigDecimal)value, diagnostics, context);
			case BasisobjektePackage.STRECKE_KM_TYPE:
				return validateStrecke_Km_Type((String)value, diagnostics, context);
			case BasisobjektePackage.TECHNISCHER_PLATZ_TYPE:
				return validateTechnischer_Platz_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_TypeClass(Abstand_TypeClass abstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnhang(Anhang anhang, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anhang, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnhang_Allg_AttributeGroup(Anhang_Allg_AttributeGroup anhang_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anhang_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnhang_Art_TypeClass(Anhang_Art_TypeClass anhang_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anhang_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasis_Objekt(Basis_Objekt basis_Objekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basis_Objekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasis_Objekt_Allg_AttributeGroup(Basis_Objekt_Allg_AttributeGroup basis_Objekt_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basis_Objekt_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBearbeitungsvermerk(Bearbeitungsvermerk bearbeitungsvermerk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bearbeitungsvermerk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBearbeitungsvermerk_Allg_AttributeGroup(Bearbeitungsvermerk_Allg_AttributeGroup bearbeitungsvermerk_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bearbeitungsvermerk_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBearbeitungsvermerk_Rolle_TypeClass(Bearbeitungsvermerk_Rolle_TypeClass bearbeitungsvermerk_Rolle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bearbeitungsvermerk_Rolle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_A_TypeClass(Begrenzung_A_TypeClass begrenzung_A_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(begrenzung_A_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_B_TypeClass(Begrenzung_B_TypeClass begrenzung_B_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(begrenzung_B_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBereich_Objekt(Bereich_Objekt bereich_Objekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bereich_Objekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBereich_Objekt_Teilbereich_AttributeGroup(Bereich_Objekt_Teilbereich_AttributeGroup bereich_Objekt_Teilbereich_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bereich_Objekt_Teilbereich_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeschreibung_TypeClass(Beschreibung_TypeClass beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBestandsrelevanz_TypeClass(Bestandsrelevanz_TypeClass bestandsrelevanz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bestandsrelevanz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBestandsschutz_TypeClass(Bestandsschutz_TypeClass bestandsschutz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bestandsschutz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBV_Darstellung_In_Plan_TypeClass(BV_Darstellung_In_Plan_TypeClass bV_Darstellung_In_Plan_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bV_Darstellung_In_Plan_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBV_Kategorie_TypeClass(BV_Kategorie_TypeClass bV_Kategorie_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bV_Kategorie_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateiname_TypeClass(Dateiname_TypeClass dateiname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateiname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateityp_TypeClass(Dateityp_TypeClass dateityp_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateityp_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Regelwerk_TypeClass(Datum_Regelwerk_TypeClass datum_Regelwerk_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Regelwerk_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDB_GDI_Referenz_TypeClass(DB_GDI_Referenz_TypeClass dB_GDI_Referenz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dB_GDI_Referenz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentitaet_TypeClass(Identitaet_TypeClass identitaet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identitaet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_Massgebend_TypeClass(Km_Massgebend_TypeClass km_Massgebend_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(km_Massgebend_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommentar_TypeClass(Kommentar_TypeClass kommentar_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kommentar_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKurztext_TypeClass(Kurztext_TypeClass kurztext_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kurztext_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLieferobjekt(Lieferobjekt lieferobjekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lieferobjekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Ausgabestand_TypeClass(LO_Ausgabestand_TypeClass lO_Ausgabestand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Ausgabestand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Datum_Herstellung_TypeClass(LO_Datum_Herstellung_TypeClass lO_Datum_Herstellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Datum_Herstellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_DB_Freigabe_TypeClass(LO_DB_Freigabe_TypeClass lO_DB_Freigabe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_DB_Freigabe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_EMA_Nr_TypeClass(LO_EMA_Nr_TypeClass lO_EMA_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_EMA_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Ersatz_TypeClass(LO_Ersatz_TypeClass lO_Ersatz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Ersatz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Firmensachnummer_TypeClass(LO_Firmensachnummer_TypeClass lO_Firmensachnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Firmensachnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Material_AttributeGroup(LO_Material_AttributeGroup lO_Material_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Material_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Seriennummer_TypeClass(LO_Seriennummer_TypeClass lO_Seriennummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lO_Seriennummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLST_Objekt_Art_TypeClass(LST_Objekt_Art_TypeClass lsT_Objekt_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lsT_Objekt_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjektreferenzen_AttributeGroup(Objektreferenzen_AttributeGroup objektreferenzen_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objektreferenzen_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjektzustand_Besonders_TypeClass(Objektzustand_Besonders_TypeClass objektzustand_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objektzustand_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProxy_Objekt(Proxy_Objekt proxy_Objekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proxy_Objekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunkt_Objekt(Punkt_Objekt punkt_Objekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(punkt_Objekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunkt_Objekt_Strecke_AttributeGroup(Punkt_Objekt_Strecke_AttributeGroup punkt_Objekt_Strecke_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(punkt_Objekt_Strecke_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunkt_Objekt_TOP_Kante_AttributeGroup(Punkt_Objekt_TOP_Kante_AttributeGroup punkt_Objekt_TOP_Kante_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(punkt_Objekt_TOP_Kante_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtungsbezug_TypeClass(Richtungsbezug_TypeClass richtungsbezug_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richtungsbezug_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeitliche_Lage_TypeClass(Seitliche_Lage_TypeClass seitliche_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seitliche_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeitlicher_Abstand_TypeClass(Seitlicher_Abstand_TypeClass seitlicher_Abstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seitlicher_Abstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Km_TypeClass(Strecke_Km_TypeClass strecke_Km_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Km_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnischer_Platz_TypeClass(Technischer_Platz_TypeClass technischer_Platz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technischer_Platz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUr_Objekt(Ur_Objekt ur_Objekt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ur_Objekt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirkrichtung_TypeClass(Wirkrichtung_TypeClass wirkrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wirkrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeit_Bearbeitungsvermerk_TypeClass(Zeit_Bearbeitungsvermerk_TypeClass zeit_Bearbeitungsvermerk_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zeit_Bearbeitungsvermerk_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnhangArt(ENUMAnhangArt enumAnhangArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBestandsrelevanz(ENUMBestandsrelevanz enumBestandsrelevanz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBVDarstellungInPlan(ENUMBVDarstellungInPlan enumbvDarstellungInPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDateityp(ENUMDateityp enumDateityp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLSTObjektArt(ENUMLSTObjektArt enumlstObjektArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMObjektzustandBesonders(ENUMObjektzustandBesonders enumObjektzustandBesonders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRolle(ENUMRolle enumRolle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Type(BigDecimal abstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAbstand_Type_Pattern(abstand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAbstand_Type_Pattern
	 */
	public static final  PatternMatcher [][] ABSTAND_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Abstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Type_Pattern(BigDecimal abstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.ABSTAND_TYPE, abstand_Type, ABSTAND_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_A_Type(BigDecimal begrenzung_A_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBegrenzung_A_Type_Pattern(begrenzung_A_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBegrenzung_A_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEGRENZUNG_ATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Begrenzung AType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_A_Type_Pattern(BigDecimal begrenzung_A_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.BEGRENZUNG_ATYPE, begrenzung_A_Type, BEGRENZUNG_ATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_B_Type(BigDecimal begrenzung_B_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBegrenzung_B_Type_Pattern(begrenzung_B_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBegrenzung_B_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEGRENZUNG_BTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Begrenzung BType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegrenzung_B_Type_Pattern(BigDecimal begrenzung_B_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.BEGRENZUNG_BTYPE, begrenzung_B_Type, BEGRENZUNG_BTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeschreibung_Type(String beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(beschreibung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBV_Kategorie_Type(String bV_Kategorie_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bV_Kategorie_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDB_GDI_Referenz_Type(String dB_GDI_Referenz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDB_GDI_Referenz_Type_Pattern(dB_GDI_Referenz_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDB_GDI_Referenz_Type_Pattern
	 */
	public static final  PatternMatcher [][] DB_GDI_REFERENZ_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DB GDI Referenz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDB_GDI_Referenz_Type_Pattern(String dB_GDI_Referenz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.DB_GDI_REFERENZ_TYPE, dB_GDI_Referenz_Type, DB_GDI_REFERENZ_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnhangArtObject(ENUMAnhangArt enumAnhangArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBestandsrelevanzObject(ENUMBestandsrelevanz enumBestandsrelevanzObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBVDarstellungInPlanObject(ENUMBVDarstellungInPlan enumbvDarstellungInPlanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDateitypObject(ENUMDateityp enumDateitypObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLSTObjektArtObject(ENUMLSTObjektArt enumlstObjektArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMObjektzustandBesondersObject(ENUMObjektzustandBesonders enumObjektzustandBesondersObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRolleObject(ENUMRolle enumRolleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentitaet_Type(String identitaet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGUID_Type_Pattern(identitaet_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKommentar_Type(String kommentar_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKurztext_Type(String kurztext_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKurztext_Type_Pattern(kurztext_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateKurztext_Type_Pattern
	 */
	public static final  PatternMatcher [][] KURZTEXT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,100}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Kurztext Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKurztext_Type_Pattern(String kurztext_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.KURZTEXT_TYPE, kurztext_Type, KURZTEXT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Ausgabestand_Type(String lO_Ausgabestand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(lO_Ausgabestand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_DB_Freigabe_Type(String lO_DB_Freigabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(lO_DB_Freigabe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_EMA_Nr_Type(String lO_EMA_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(lO_EMA_Nr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Firmensachnummer_Type(String lO_Firmensachnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(lO_Firmensachnummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLO_Seriennummer_Type(String lO_Seriennummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(lO_Seriennummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtungsbezug_Type(ENUMWirkrichtung richtungsbezug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeitliche_Lage_Type(ENUMLinksRechts seitliche_Lage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeitlicher_Abstand_Type(BigDecimal seitlicher_Abstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSeitlicher_Abstand_Type_Pattern(seitlicher_Abstand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSeitlicher_Abstand_Type_Pattern
	 */
	public static final  PatternMatcher [][] SEITLICHER_ABSTAND_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(-?[1-9][0-9]{0,4}\\.[0-9]{3})|(-?0\\.[89][0-9]{2})|0.000")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Seitlicher Abstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeitlicher_Abstand_Type_Pattern(BigDecimal seitlicher_Abstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.SEITLICHER_ABSTAND_TYPE, seitlicher_Abstand_Type, SEITLICHER_ABSTAND_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Km_Type(String strecke_Km_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateKilometrierung_Type_Pattern(strecke_Km_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnischer_Platz_Type(String technischer_Platz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTechnischer_Platz_Type_Pattern(technischer_Platz_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTechnischer_Platz_Type_Pattern
	 */
	public static final  PatternMatcher [][] TECHNISCHER_PLATZ_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z0-9\\-]{30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Technischer Platz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnischer_Platz_Type_Pattern(String technischer_Platz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisobjektePackage.Literals.TECHNISCHER_PLATZ_TYPE, technischer_Platz_Type, TECHNISCHER_PLATZ_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //BasisobjekteValidator
