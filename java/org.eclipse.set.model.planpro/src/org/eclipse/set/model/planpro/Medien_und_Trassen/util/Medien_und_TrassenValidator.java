/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.util;

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

import org.eclipse.set.model.planpro.Medien_und_Trassen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage
 * @generated
 */
public class Medien_und_TrassenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Medien_und_TrassenValidator INSTANCE = new Medien_und_TrassenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Medien_und_Trassen";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisTypenValidator basisTypenValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medien_und_TrassenValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		basisTypenValidator = BasisTypenValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Medien_und_TrassenPackage.eINSTANCE;
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
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE_CLASS:
				return validateAder_Durchmesser_TypeClass((Ader_Durchmesser_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE_CLASS:
				return validateAder_Querschnitt_TypeClass((Ader_Querschnitt_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE_CLASS:
				return validateAder_Reserve_TypeClass((Ader_Reserve_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE_CLASS:
				return validateAnzahl_Verseilelemente_TypeClass((Anzahl_Verseilelemente_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE_CLASS:
				return validateBezeichnung_Kabel_TypeClass((Bezeichnung_Kabel_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS:
				return validateBezeichnung_Kabel_Verteilpunkt_TypeClass((Bezeichnung_Kabel_Verteilpunkt_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.INDUKTIONSSCHUTZ_TYPE_CLASS:
				return validateInduktionsschutz_TypeClass((Induktionsschutz_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL:
				return validateKabel((Kabel)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP:
				return validateKabel_Allg_AttributeGroup((Kabel_Allg_AttributeGroup)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_ART_TYPE_CLASS:
				return validateKabel_Art_TypeClass((Kabel_Art_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateKabel_Bezeichnung_AttributeGroup((Kabel_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP:
				return validateKabel_Element_AttributeGroup((Kabel_Element_AttributeGroup)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE_CLASS:
				return validateKabel_Laenge_TypeClass((Kabel_Laenge_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE_CLASS:
				return validateKabel_Typ_TypeClass((Kabel_Typ_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT:
				return validateKabel_Verteilpunkt((Kabel_Verteilpunkt)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_ART_TYPE_CLASS:
				return validateKabel_Verteilpunkt_Art_TypeClass((Kabel_Verteilpunkt_Art_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateKabel_Verteilpunkt_Bezeichnung_AttributeGroup((Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Medien_und_TrassenPackage.NAGETIERSCHUTZ_TYPE_CLASS:
				return validateNagetierschutz_TypeClass((Nagetierschutz_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.TRASSE_KANTE:
				return validateTrasse_Kante((Trasse_Kante)value, diagnostics, context);
			case Medien_und_TrassenPackage.TRASSE_KANTE_ART_TYPE_CLASS:
				return validateTrasse_Kante_Art_TypeClass((Trasse_Kante_Art_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.TRASSE_KNOTEN:
				return validateTrasse_Knoten((Trasse_Knoten)value, diagnostics, context);
			case Medien_und_TrassenPackage.TRASSE_KNOTEN_ART_TYPE_CLASS:
				return validateTrasse_Knoten_Art_TypeClass((Trasse_Knoten_Art_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.TRASSE_NUTZER_TYPE_CLASS:
				return validateTrasse_Nutzer_TypeClass((Trasse_Nutzer_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.VERSEILART_TYPE_CLASS:
				return validateVerseilart_TypeClass((Verseilart_TypeClass)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_KABEL_ART:
				return validateENUMKabelArt((ENUMKabelArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART:
				return validateENUMKabelVerteilpunktArt((ENUMKabelVerteilpunktArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART:
				return validateENUMTrasseKanteArt((ENUMTrasseKanteArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART:
				return validateENUMTrasseKnotenArt((ENUMTrasseKnotenArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER:
				return validateENUMTrasseNutzer((ENUMTrasseNutzer)value, diagnostics, context);
			case Medien_und_TrassenPackage.ADER_DURCHMESSER_TYPE:
				return validateAder_Durchmesser_Type((BigDecimal)value, diagnostics, context);
			case Medien_und_TrassenPackage.ADER_QUERSCHNITT_TYPE:
				return validateAder_Querschnitt_Type((BigDecimal)value, diagnostics, context);
			case Medien_und_TrassenPackage.ADER_RESERVE_TYPE:
				return validateAder_Reserve_Type((BigInteger)value, diagnostics, context);
			case Medien_und_TrassenPackage.ANZAHL_VERSEILELEMENTE_TYPE:
				return validateAnzahl_Verseilelemente_Type((BigInteger)value, diagnostics, context);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_TYPE:
				return validateBezeichnung_Kabel_Type((String)value, diagnostics, context);
			case Medien_und_TrassenPackage.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE:
				return validateBezeichnung_Kabel_Verteilpunkt_Type((String)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_KABEL_ART_OBJECT:
				return validateENUMKabelArtObject((ENUMKabelArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_KABEL_VERTEILPUNKT_ART_OBJECT:
				return validateENUMKabelVerteilpunktArtObject((ENUMKabelVerteilpunktArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KANTE_ART_OBJECT:
				return validateENUMTrasseKanteArtObject((ENUMTrasseKanteArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_KNOTEN_ART_OBJECT:
				return validateENUMTrasseKnotenArtObject((ENUMTrasseKnotenArt)value, diagnostics, context);
			case Medien_und_TrassenPackage.ENUM_TRASSE_NUTZER_OBJECT:
				return validateENUMTrasseNutzerObject((ENUMTrasseNutzer)value, diagnostics, context);
			case Medien_und_TrassenPackage.INDUKTIONSSCHUTZ_TYPE:
				return validateInduktionsschutz_Type((BigInteger)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_LAENGE_TYPE:
				return validateKabel_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Medien_und_TrassenPackage.KABEL_TYP_TYPE:
				return validateKabel_Typ_Type((String)value, diagnostics, context);
			case Medien_und_TrassenPackage.VERSEILART_TYPE:
				return validateVerseilart_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Durchmesser_TypeClass(Ader_Durchmesser_TypeClass ader_Durchmesser_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ader_Durchmesser_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Querschnitt_TypeClass(Ader_Querschnitt_TypeClass ader_Querschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ader_Querschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Reserve_TypeClass(Ader_Reserve_TypeClass ader_Reserve_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ader_Reserve_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Verseilelemente_TypeClass(Anzahl_Verseilelemente_TypeClass anzahl_Verseilelemente_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anzahl_Verseilelemente_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_TypeClass(Bezeichnung_Kabel_TypeClass bezeichnung_Kabel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Kabel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_Verteilpunkt_TypeClass(Bezeichnung_Kabel_Verteilpunkt_TypeClass bezeichnung_Kabel_Verteilpunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Kabel_Verteilpunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInduktionsschutz_TypeClass(Induktionsschutz_TypeClass induktionsschutz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(induktionsschutz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel(Kabel kabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Allg_AttributeGroup(Kabel_Allg_AttributeGroup kabel_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Art_TypeClass(Kabel_Art_TypeClass kabel_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Bezeichnung_AttributeGroup(Kabel_Bezeichnung_AttributeGroup kabel_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Element_AttributeGroup(Kabel_Element_AttributeGroup kabel_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Laenge_TypeClass(Kabel_Laenge_TypeClass kabel_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Typ_TypeClass(Kabel_Typ_TypeClass kabel_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Verteilpunkt(Kabel_Verteilpunkt kabel_Verteilpunkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Verteilpunkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Verteilpunkt_Art_TypeClass(Kabel_Verteilpunkt_Art_TypeClass kabel_Verteilpunkt_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Verteilpunkt_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Verteilpunkt_Bezeichnung_AttributeGroup(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup kabel_Verteilpunkt_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kabel_Verteilpunkt_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNagetierschutz_TypeClass(Nagetierschutz_TypeClass nagetierschutz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nagetierschutz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Kante(Trasse_Kante trasse_Kante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Kante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Kante_Art_TypeClass(Trasse_Kante_Art_TypeClass trasse_Kante_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Kante_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Knoten(Trasse_Knoten trasse_Knoten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Knoten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Knoten_Art_TypeClass(Trasse_Knoten_Art_TypeClass trasse_Knoten_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Knoten_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrasse_Nutzer_TypeClass(Trasse_Nutzer_TypeClass trasse_Nutzer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trasse_Nutzer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerseilart_TypeClass(Verseilart_TypeClass verseilart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verseilart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKabelArt(ENUMKabelArt enumKabelArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKabelVerteilpunktArt(ENUMKabelVerteilpunktArt enumKabelVerteilpunktArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseKanteArt(ENUMTrasseKanteArt enumTrasseKanteArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseKnotenArt(ENUMTrasseKnotenArt enumTrasseKnotenArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseNutzer(ENUMTrasseNutzer enumTrasseNutzer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Durchmesser_Type(BigDecimal ader_Durchmesser_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAder_Durchmesser_Type_Pattern(ader_Durchmesser_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAder_Durchmesser_Type_Pattern
	 */
	public static final  PatternMatcher [][] ADER_DURCHMESSER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[01][.][1-8]|[0][.][9]|[1][.][0]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ader Durchmesser Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Durchmesser_Type_Pattern(BigDecimal ader_Durchmesser_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.ADER_DURCHMESSER_TYPE, ader_Durchmesser_Type, ADER_DURCHMESSER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Querschnitt_Type(BigDecimal ader_Querschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAder_Querschnitt_Type_Pattern(ader_Querschnitt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAder_Querschnitt_Type_Pattern
	 */
	public static final  PatternMatcher [][] ADER_QUERSCHNITT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]?([.][1-9])?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ader Querschnitt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Querschnitt_Type_Pattern(BigDecimal ader_Querschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.ADER_QUERSCHNITT_TYPE, ader_Querschnitt_Type, ADER_QUERSCHNITT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Reserve_Type(BigInteger ader_Reserve_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAder_Reserve_Type_Pattern(ader_Reserve_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAder_Reserve_Type_Pattern
	 */
	public static final  PatternMatcher [][] ADER_RESERVE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1][0-9]{2}|200")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ader Reserve Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAder_Reserve_Type_Pattern(BigInteger ader_Reserve_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.ADER_RESERVE_TYPE, ader_Reserve_Type, ADER_RESERVE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Verseilelemente_Type(BigInteger anzahl_Verseilelemente_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnzahl_Verseilelemente_Type_Pattern(anzahl_Verseilelemente_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnzahl_Verseilelemente_Type_Pattern
	 */
	public static final  PatternMatcher [][] ANZAHL_VERSEILELEMENTE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1][0-9]{2}|200")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Anzahl Verseilelemente Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Verseilelemente_Type_Pattern(BigInteger anzahl_Verseilelemente_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.ANZAHL_VERSEILELEMENTE_TYPE, anzahl_Verseilelemente_Type, ANZAHL_VERSEILELEMENTE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_Type(String bezeichnung_Kabel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Kabel_Type_Pattern(bezeichnung_Kabel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Kabel_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_KABEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Kabel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_Type_Pattern(String bezeichnung_Kabel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.BEZEICHNUNG_KABEL_TYPE, bezeichnung_Kabel_Type, BEZEICHNUNG_KABEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_Verteilpunkt_Type(String bezeichnung_Kabel_Verteilpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Kabel_Verteilpunkt_Type_Pattern(bezeichnung_Kabel_Verteilpunkt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Kabel_Verteilpunkt_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Kabel Verteilpunkt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kabel_Verteilpunkt_Type_Pattern(String bezeichnung_Kabel_Verteilpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE, bezeichnung_Kabel_Verteilpunkt_Type, BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKabelArtObject(ENUMKabelArt enumKabelArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKabelVerteilpunktArtObject(ENUMKabelVerteilpunktArt enumKabelVerteilpunktArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseKanteArtObject(ENUMTrasseKanteArt enumTrasseKanteArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseKnotenArtObject(ENUMTrasseKnotenArt enumTrasseKnotenArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTrasseNutzerObject(ENUMTrasseNutzer enumTrasseNutzerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInduktionsschutz_Type(BigInteger induktionsschutz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Laenge_Type(BigDecimal kabel_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKabel_Laenge_Type_Pattern(kabel_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateKabel_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] KABEL_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,4}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Kabel Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Laenge_Type_Pattern(BigDecimal kabel_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.KABEL_LAENGE_TYPE, kabel_Laenge_Type, KABEL_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKabel_Typ_Type(String kabel_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(kabel_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerseilart_Type(BigInteger verseilart_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVerseilart_Type_Pattern(verseilart_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVerseilart_Type_Pattern
	 */
	public static final  PatternMatcher [][] VERSEILART_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1|4]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Verseilart Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerseilart_Type_Pattern(BigInteger verseilart_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Medien_und_TrassenPackage.Literals.VERSEILART_TYPE, verseilart_Type, VERSEILART_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //Medien_und_TrassenValidator
