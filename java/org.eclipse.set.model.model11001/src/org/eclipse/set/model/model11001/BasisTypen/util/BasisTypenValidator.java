/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model11001.BasisTypen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage
 * @generated
 */
public class BasisTypenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasisTypenValidator INSTANCE = new BasisTypenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.BasisTypen";

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
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisTypenValidator() {
		super();
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
	  return BasisTypenPackage.eINSTANCE;
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP:
				return validateBasisAttribut_AttributeGroup((BasisAttribut_AttributeGroup)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS:
				return validateBezeichnung_Aussenanlage_TypeClass((Bezeichnung_Aussenanlage_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP:
				return validateBezeichnung_Element_AttributeGroup((Bezeichnung_Element_AttributeGroup)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS:
				return validateBezeichnung_Lageplan_Kurz_TypeClass((Bezeichnung_Lageplan_Kurz_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS:
				return validateBezeichnung_Lageplan_Lang_TypeClass((Bezeichnung_Lageplan_Lang_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE_CLASS:
				return validateBezeichnung_Tabelle_TypeClass((Bezeichnung_Tabelle_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE_CLASS:
				return validateDatum_Auslieferung_TypeClass((Datum_Auslieferung_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.ID_BEARBEITUNGSVERMERK_TYPE_CLASS:
				return validateID_Bearbeitungsvermerk_TypeClass((ID_Bearbeitungsvermerk_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.KENNZAHL_TYPE_CLASS:
				return validateKennzahl_TypeClass((Kennzahl_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE_CLASS:
				return validateOertlicher_Elementname_TypeClass((Oertlicher_Elementname_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP:
				return validatePruefmerkmale_Daten_AttributeGroup((Pruefmerkmale_Daten_AttributeGroup)value, diagnostics, context);
			case BasisTypenPackage.PRUEFSUMME_ART_TYPE_CLASS:
				return validatePruefsumme_Art_TypeClass((Pruefsumme_Art_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.PRUEFSUMME_TYPE_CLASS:
				return validatePruefsumme_TypeClass((Pruefsumme_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE_CLASS:
				return validateVersion_Auslieferung_TypeClass((Version_Auslieferung_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.ZEIGER_TYPE_CLASS:
				return validateZeiger_TypeClass((Zeiger_TypeClass)value, diagnostics, context);
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM:
				return validateENUMAnwendungssystem((ENUMAnwendungssystem)value, diagnostics, context);
			case BasisTypenPackage.ENUM_AUSRICHTUNG:
				return validateENUMAusrichtung((ENUMAusrichtung)value, diagnostics, context);
			case BasisTypenPackage.ENUM_BREMSWEG:
				return validateENUMBremsweg((ENUMBremsweg)value, diagnostics, context);
			case BasisTypenPackage.ENUM_FAHRSTROM:
				return validateENUMFahrstrom((ENUMFahrstrom)value, diagnostics, context);
			case BasisTypenPackage.ENUM_LINKS_RECHTS:
				return validateENUMLinksRechts((ENUMLinksRechts)value, diagnostics, context);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART:
				return validateENUMPruefsummeArt((ENUMPruefsummeArt)value, diagnostics, context);
			case BasisTypenPackage.ENUM_REGIONALBEREICH:
				return validateENUMRegionalbereich((ENUMRegionalbereich)value, diagnostics, context);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG:
				return validateENUMWirkrichtung((ENUMWirkrichtung)value, diagnostics, context);
			case BasisTypenPackage.ANWENDUNGSSYSTEM_TYPE:
				return validateAnwendungssystem_Type((ENUMAnwendungssystem)value, diagnostics, context);
			case BasisTypenPackage.AUSRICHTUNG_TYPE:
				return validateAusrichtung_Type((ENUMAusrichtung)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_AUSSENANLAGE_TYPE:
				return validateBezeichnung_Aussenanlage_Type((String)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE:
				return validateBezeichnung_Lageplan_Kurz_Type((String)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_LAGEPLAN_LANG_TYPE:
				return validateBezeichnung_Lageplan_Lang_Type((String)value, diagnostics, context);
			case BasisTypenPackage.BEZEICHNUNG_TABELLE_TYPE:
				return validateBezeichnung_Tabelle_Type((String)value, diagnostics, context);
			case BasisTypenPackage.BREMSWEG_TYPE:
				return validateBremsweg_Type((ENUMBremsweg)value, diagnostics, context);
			case BasisTypenPackage.DATEINAME_TYPE:
				return validateDateiname_Type((String)value, diagnostics, context);
			case BasisTypenPackage.DATUM_AUSLIEFERUNG_TYPE:
				return validateDatum_Auslieferung_Type((XMLGregorianCalendar)value, diagnostics, context);
			case BasisTypenPackage.ENUM_ANWENDUNGSSYSTEM_OBJECT:
				return validateENUMAnwendungssystemObject((ENUMAnwendungssystem)value, diagnostics, context);
			case BasisTypenPackage.ENUM_AUSRICHTUNG_OBJECT:
				return validateENUMAusrichtungObject((ENUMAusrichtung)value, diagnostics, context);
			case BasisTypenPackage.ENUM_BREMSWEG_OBJECT:
				return validateENUMBremswegObject((ENUMBremsweg)value, diagnostics, context);
			case BasisTypenPackage.ENUM_FAHRSTROM_OBJECT:
				return validateENUMFahrstromObject((ENUMFahrstrom)value, diagnostics, context);
			case BasisTypenPackage.ENUM_LINKS_RECHTS_OBJECT:
				return validateENUMLinksRechtsObject((ENUMLinksRechts)value, diagnostics, context);
			case BasisTypenPackage.ENUM_PRUEFSUMME_ART_OBJECT:
				return validateENUMPruefsummeArtObject((ENUMPruefsummeArt)value, diagnostics, context);
			case BasisTypenPackage.ENUM_REGIONALBEREICH_OBJECT:
				return validateENUMRegionalbereichObject((ENUMRegionalbereich)value, diagnostics, context);
			case BasisTypenPackage.ENUM_WIRKRICHTUNG_OBJECT:
				return validateENUMWirkrichtungObject((ENUMWirkrichtung)value, diagnostics, context);
			case BasisTypenPackage.FAHRSTROM_TYPE:
				return validateFahrstrom_Type((ENUMFahrstrom)value, diagnostics, context);
			case BasisTypenPackage.FREI_TEXT_TYPE:
				return validateFreiText_Type((String)value, diagnostics, context);
			case BasisTypenPackage.GESCHWINDIGKEIT_TYPE:
				return validateGeschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case BasisTypenPackage.GUID_TYPE:
				return validateGUID_Type((String)value, diagnostics, context);
			case BasisTypenPackage.HERSTELLER_TYPE:
				return validateHersteller_Type((String)value, diagnostics, context);
			case BasisTypenPackage.KENNZAHL_TYPE:
				return validateKennzahl_Type((String)value, diagnostics, context);
			case BasisTypenPackage.KILOMETRIERUNG_TYPE:
				return validateKilometrierung_Type((String)value, diagnostics, context);
			case BasisTypenPackage.LINKS_RECHTS_TYPE:
				return validateLinksRechts_Type((ENUMLinksRechts)value, diagnostics, context);
			case BasisTypenPackage.METER_TYPE:
				return validateMeter_Type((BigDecimal)value, diagnostics, context);
			case BasisTypenPackage.OBJEKTNAME_TYPE:
				return validateObjektname_Type((String)value, diagnostics, context);
			case BasisTypenPackage.OERTLICHER_ELEMENTNAME_TYPE:
				return validateOertlicher_Elementname_Type((String)value, diagnostics, context);
			case BasisTypenPackage.REGIONALBEREICH_TYPE:
				return validateRegionalbereich_Type((ENUMRegionalbereich)value, diagnostics, context);
			case BasisTypenPackage.SEKUNDE_TYPE:
				return validateSekunde_Type((BigDecimal)value, diagnostics, context);
			case BasisTypenPackage.TEXT_TYPE:
				return validateText_Type((String)value, diagnostics, context);
			case BasisTypenPackage.VERSION_AUSLIEFERUNG_TYPE:
				return validateVersion_Auslieferung_Type((String)value, diagnostics, context);
			case BasisTypenPackage.WIRKRICHTUNG_TYPE:
				return validateWirkrichtung_Type((ENUMWirkrichtung)value, diagnostics, context);
			case BasisTypenPackage.ZEICHENKETTE_TYPE:
				return validateZeichenkette_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup basisAttribut_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisAttribut_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Aussenanlage_TypeClass(Bezeichnung_Aussenanlage_TypeClass bezeichnung_Aussenanlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Aussenanlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Element_AttributeGroup(Bezeichnung_Element_AttributeGroup bezeichnung_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Kurz_TypeClass(Bezeichnung_Lageplan_Kurz_TypeClass bezeichnung_Lageplan_Kurz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Lageplan_Kurz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Lang_TypeClass(Bezeichnung_Lageplan_Lang_TypeClass bezeichnung_Lageplan_Lang_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Lageplan_Lang_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Tabelle_TypeClass(Bezeichnung_Tabelle_TypeClass bezeichnung_Tabelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Tabelle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Auslieferung_TypeClass(Datum_Auslieferung_TypeClass datum_Auslieferung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datum_Auslieferung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateID_Bearbeitungsvermerk_TypeClass(ID_Bearbeitungsvermerk_TypeClass iD_Bearbeitungsvermerk_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iD_Bearbeitungsvermerk_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKennzahl_TypeClass(Kennzahl_TypeClass kennzahl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kennzahl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlicher_Elementname_TypeClass(Oertlicher_Elementname_TypeClass oertlicher_Elementname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oertlicher_Elementname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefmerkmale_Daten_AttributeGroup(Pruefmerkmale_Daten_AttributeGroup pruefmerkmale_Daten_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pruefmerkmale_Daten_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefsumme_Art_TypeClass(Pruefsumme_Art_TypeClass pruefsumme_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pruefsumme_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefsumme_TypeClass(Pruefsumme_TypeClass pruefsumme_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pruefsumme_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Auslieferung_TypeClass(Version_Auslieferung_TypeClass version_Auslieferung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(version_Auslieferung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeiger_TypeClass(Zeiger_TypeClass zeiger_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zeiger_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnwendungssystem(ENUMAnwendungssystem enumAnwendungssystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAusrichtung(ENUMAusrichtung enumAusrichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBremsweg(ENUMBremsweg enumBremsweg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFahrstrom(ENUMFahrstrom enumFahrstrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinksRechts(ENUMLinksRechts enumLinksRechts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPruefsummeArt(ENUMPruefsummeArt enumPruefsummeArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRegionalbereich(ENUMRegionalbereich enumRegionalbereich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirkrichtung(ENUMWirkrichtung enumWirkrichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendungssystem_Type(ENUMAnwendungssystem anwendungssystem_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusrichtung_Type(ENUMAusrichtung ausrichtung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Aussenanlage_Type(String bezeichnung_Aussenanlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Aussenanlage_Type_Pattern(bezeichnung_Aussenanlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Aussenanlage_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_AUSSENANLAGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,36}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Aussenanlage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Aussenanlage_Type_Pattern(String bezeichnung_Aussenanlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.BEZEICHNUNG_AUSSENANLAGE_TYPE, bezeichnung_Aussenanlage_Type, BEZEICHNUNG_AUSSENANLAGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Kurz_Type(String bezeichnung_Lageplan_Kurz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Lageplan_Kurz_Type_Pattern(bezeichnung_Lageplan_Kurz_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Lageplan_Kurz_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_LAGEPLAN_KURZ_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,36}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Lageplan Kurz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Kurz_Type_Pattern(String bezeichnung_Lageplan_Kurz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.BEZEICHNUNG_LAGEPLAN_KURZ_TYPE, bezeichnung_Lageplan_Kurz_Type, BEZEICHNUNG_LAGEPLAN_KURZ_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Lang_Type(String bezeichnung_Lageplan_Lang_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Lageplan_Lang_Type_Pattern(bezeichnung_Lageplan_Lang_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Lageplan_Lang_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_LAGEPLAN_LANG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,36}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Lageplan Lang Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Lang_Type_Pattern(String bezeichnung_Lageplan_Lang_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.BEZEICHNUNG_LAGEPLAN_LANG_TYPE, bezeichnung_Lageplan_Lang_Type, BEZEICHNUNG_LAGEPLAN_LANG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Tabelle_Type(String bezeichnung_Tabelle_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Tabelle_Type_Pattern(bezeichnung_Tabelle_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Tabelle_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_TABELLE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,36}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Tabelle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Tabelle_Type_Pattern(String bezeichnung_Tabelle_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.BEZEICHNUNG_TABELLE_TYPE, bezeichnung_Tabelle_Type, BEZEICHNUNG_TABELLE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBremsweg_Type(ENUMBremsweg bremsweg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateiname_Type(String dateiname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateiname_Type_Pattern(dateiname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateiname_Type_Pattern
	 */
	public static final  PatternMatcher [][] DATEINAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\\\/?:\\*\\|\"<>]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dateiname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateiname_Type_Pattern(String dateiname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.DATEINAME_TYPE, dateiname_Type, DATEINAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatum_Auslieferung_Type(XMLGregorianCalendar datum_Auslieferung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnwendungssystemObject(ENUMAnwendungssystem enumAnwendungssystemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAusrichtungObject(ENUMAusrichtung enumAusrichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBremswegObject(ENUMBremsweg enumBremswegObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFahrstromObject(ENUMFahrstrom enumFahrstromObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinksRechtsObject(ENUMLinksRechts enumLinksRechtsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPruefsummeArtObject(ENUMPruefsummeArt enumPruefsummeArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRegionalbereichObject(ENUMRegionalbereich enumRegionalbereichObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirkrichtungObject(ENUMWirkrichtung enumWirkrichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrstrom_Type(ENUMFahrstrom fahrstrom_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreiText_Type(String freiText_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_Type(BigInteger geschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGeschwindigkeit_Type_Pattern(geschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGeschwindigkeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] GESCHWINDIGKEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Geschwindigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschwindigkeit_Type_Pattern(BigInteger geschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, geschwindigkeit_Type, GESCHWINDIGKEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUID_Type(String guiD_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGUID_Type_Pattern(guiD_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGUID_Type_Pattern
	 */
	public static final  PatternMatcher [][] GUID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUID_Type_Pattern(String guiD_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.GUID_TYPE, guiD_Type, GUID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHersteller_Type(String hersteller_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateText_Type_Pattern(hersteller_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKennzahl_Type(String kennzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKennzahl_Type_Pattern(kennzahl_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateKennzahl_Type_Pattern
	 */
	public static final  PatternMatcher [][] KENNZAHL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0[1-9]|[1-9][0-9]")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Kennzahl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKennzahl_Type_Pattern(String kennzahl_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.KENNZAHL_TYPE, kennzahl_Type, KENNZAHL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKilometrierung_Type(String kilometrierung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKilometrierung_Type_Pattern(kilometrierung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateKilometrierung_Type_Pattern
	 */
	public static final  PatternMatcher [][] KILOMETRIERUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?(([1-9][0-9]{0,2})|0),([0-9]{3}|([0-9][\\+\\-][1-9][0-9]{0,4}))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Kilometrierung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKilometrierung_Type_Pattern(String kilometrierung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, kilometrierung_Type, KILOMETRIERUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinksRechts_Type(ENUMLinksRechts linksRechts_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeter_Type(BigDecimal meter_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjektname_Type(String objektname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateText_Type_Pattern(objektname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlicher_Elementname_Type(String oertlicher_Elementname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOertlicher_Elementname_Type_Pattern(oertlicher_Elementname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOertlicher_Elementname_Type_Pattern
	 */
	public static final  PatternMatcher [][] OERTLICHER_ELEMENTNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,6}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oertlicher Elementname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOertlicher_Elementname_Type_Pattern(String oertlicher_Elementname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.OERTLICHER_ELEMENTNAME_TYPE, oertlicher_Elementname_Type, OERTLICHER_ELEMENTNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalbereich_Type(ENUMRegionalbereich regionalbereich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSekunde_Type(BigDecimal sekunde_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSekunde_Type_Pattern(sekunde_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSekunde_Type_Pattern
	 */
	public static final  PatternMatcher [][] SEKUNDE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sekunde Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSekunde_Type_Pattern(BigDecimal sekunde_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.SEKUNDE_TYPE, sekunde_Type, SEKUNDE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_Type(String text_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateText_Type_Pattern(text_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateText_Type_Pattern
	 */
	public static final  PatternMatcher [][] TEXT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_Type_Pattern(String text_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.TEXT_TYPE, text_Type, TEXT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Auslieferung_Type(String version_Auslieferung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateText_Type_Pattern(version_Auslieferung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirkrichtung_Type(ENUMWirkrichtung wirkrichtung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeichenkette_Type(String zeichenkette_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZeichenkette_Type_Pattern(zeichenkette_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZeichenkette_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZEICHENKETTE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Zeichenkette Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeichenkette_Type_Pattern(String zeichenkette_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, zeichenkette_Type, ZEICHENKETTE_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //BasisTypenValidator
