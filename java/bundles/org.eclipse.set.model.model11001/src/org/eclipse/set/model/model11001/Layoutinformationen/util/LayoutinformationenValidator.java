/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model11001.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.model11001.Layoutinformationen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage
 * @generated
 */
public class LayoutinformationenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LayoutinformationenValidator INSTANCE = new LayoutinformationenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.Layoutinformationen";

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
	public LayoutinformationenValidator() {
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
	  return LayoutinformationenPackage.eINSTANCE;
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
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS:
				return validateBez_Lageplan_Blattschnitt_TypeClass((Bez_Lageplan_Blattschnitt_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE_CLASS:
				return validateBezeichnung_Lageplan_TypeClass((Bezeichnung_Lageplan_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_GEO_PUNKT_TYPE_CLASS:
				return validateDarstellung_GEO_Punkt_TypeClass((Darstellung_GEO_Punkt_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE_CLASS:
				return validateDarstellung_Polygonzug_TypeClass((Darstellung_Polygonzug_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS:
				return validateDarstellung_Richtungswinkel_TypeClass((Darstellung_Richtungswinkel_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case LayoutinformationenPackage.ELEMENT_POSITION:
				return validateElement_Position((Element_Position)value, diagnostics, context);
			case LayoutinformationenPackage.ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP:
				return validateElement_Position_Allg_AttributeGroup((Element_Position_Allg_AttributeGroup)value, diagnostics, context);
			case LayoutinformationenPackage.ELEMENT_STIL:
				return validateElement_Stil((Element_Stil)value, diagnostics, context);
			case LayoutinformationenPackage.ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP:
				return validateElement_Stil_Allg_AttributeGroup((Element_Stil_Allg_AttributeGroup)value, diagnostics, context);
			case LayoutinformationenPackage.FUELLUNG_TYPE_CLASS:
				return validateFuellung_TypeClass((Fuellung_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN:
				return validateLageplan((Lageplan)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN_ART_TYPE_CLASS:
				return validateLageplan_Art_TypeClass((Lageplan_Art_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateLageplan_Bezeichnung_AttributeGroup((Lageplan_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT:
				return validateLageplan_Blattschnitt((Lageplan_Blattschnitt)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateLageplan_Blattschnitt_Bezeichnung_AttributeGroup((Lageplan_Blattschnitt_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND:
				return validateLageplan_Zustand((Lageplan_Zustand)value, diagnostics, context);
			case LayoutinformationenPackage.LINIE_ART_TYPE_CLASS:
				return validateLinie_Art_TypeClass((Linie_Art_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE_CLASS:
				return validateLinie_Farbwert_TypeClass((Linie_Farbwert_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.LINIE_SUBART_TYPE_CLASS:
				return validateLinie_Subart_TypeClass((Linie_Subart_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.PLAN_PRO_LAYOUTINFO:
				return validatePlanPro_Layoutinfo((PlanPro_Layoutinfo)value, diagnostics, context);
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE_CLASS:
				return validatePolygonzug_Ausrichtung_TypeClass((Polygonzug_Ausrichtung_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE_CLASS:
				return validatePolygonzug_Blattschnitt_TypeClass((Polygonzug_Blattschnitt_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE_CLASS:
				return validateReferenz_LST_Zustand_TypeClass((Referenz_LST_Zustand_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS:
				return validateReferenz_Objekt_Darstellung_TypeClass((Referenz_Objekt_Darstellung_TypeClass)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_FUELLUNG:
				return validateENUMFuellung((ENUMFuellung)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART:
				return validateENUMLageplanArt((ENUMLageplanArt)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LINIE_ART:
				return validateENUMLinieArt((ENUMLinieArt)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART:
				return validateENUMLinieSubart((ENUMLinieSubart)value, diagnostics, context);
			case LayoutinformationenPackage.BEZ_LAGEPLAN_BLATTSCHNITT_TYPE:
				return validateBez_Lageplan_Blattschnitt_Type((BigInteger)value, diagnostics, context);
			case LayoutinformationenPackage.BEZEICHNUNG_LAGEPLAN_TYPE:
				return validateBezeichnung_Lageplan_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_GEO_PUNKT_TYPE:
				return validateDarstellung_GEO_Punkt_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_POLYGONZUG_TYPE:
				return validateDarstellung_Polygonzug_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.DARSTELLUNG_RICHTUNGSWINKEL_TYPE:
				return validateDarstellung_Richtungswinkel_Type((BigDecimal)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_FUELLUNG_OBJECT:
				return validateENUMFuellungObject((ENUMFuellung)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LAGEPLAN_ART_OBJECT:
				return validateENUMLageplanArtObject((ENUMLageplanArt)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LINIE_ART_OBJECT:
				return validateENUMLinieArtObject((ENUMLinieArt)value, diagnostics, context);
			case LayoutinformationenPackage.ENUM_LINIE_SUBART_OBJECT:
				return validateENUMLinieSubartObject((ENUMLinieSubart)value, diagnostics, context);
			case LayoutinformationenPackage.LINIE_FARBWERT_TYPE:
				return validateLinie_Farbwert_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.POLYGONZUG_AUSRICHTUNG_TYPE:
				return validatePolygonzug_Ausrichtung_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.POLYGONZUG_BLATTSCHNITT_TYPE:
				return validatePolygonzug_Blattschnitt_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.REFERENZ_LST_ZUSTAND_TYPE:
				return validateReferenz_LST_Zustand_Type((String)value, diagnostics, context);
			case LayoutinformationenPackage.REFERENZ_OBJEKT_DARSTELLUNG_TYPE:
				return validateReferenz_Objekt_Darstellung_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Lageplan_Blattschnitt_TypeClass(Bez_Lageplan_Blattschnitt_TypeClass bez_Lageplan_Blattschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Lageplan_Blattschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_TypeClass(Bezeichnung_Lageplan_TypeClass bezeichnung_Lageplan_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Lageplan_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_GEO_Punkt_TypeClass(Darstellung_GEO_Punkt_TypeClass darstellung_GEO_Punkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(darstellung_GEO_Punkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_Polygonzug_TypeClass(Darstellung_Polygonzug_TypeClass darstellung_Polygonzug_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(darstellung_Polygonzug_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_Richtungswinkel_TypeClass(Darstellung_Richtungswinkel_TypeClass darstellung_Richtungswinkel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(darstellung_Richtungswinkel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Position(Element_Position element_Position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Position_Allg_AttributeGroup(Element_Position_Allg_AttributeGroup element_Position_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Position_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Stil(Element_Stil element_Stil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Stil, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Stil_Allg_AttributeGroup(Element_Stil_Allg_AttributeGroup element_Stil_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Stil_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuellung_TypeClass(Fuellung_TypeClass fuellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan(Lageplan lageplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan_Art_TypeClass(Lageplan_Art_TypeClass lageplan_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan_Bezeichnung_AttributeGroup(Lageplan_Bezeichnung_AttributeGroup lageplan_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan_Blattschnitt(Lageplan_Blattschnitt lageplan_Blattschnitt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan_Blattschnitt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan_Blattschnitt_Bezeichnung_AttributeGroup(Lageplan_Blattschnitt_Bezeichnung_AttributeGroup lageplan_Blattschnitt_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan_Blattschnitt_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLageplan_Zustand(Lageplan_Zustand lageplan_Zustand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lageplan_Zustand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinie_Art_TypeClass(Linie_Art_TypeClass linie_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linie_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinie_Farbwert_TypeClass(Linie_Farbwert_TypeClass linie_Farbwert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linie_Farbwert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinie_Subart_TypeClass(Linie_Subart_TypeClass linie_Subart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linie_Subart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanPro_Layoutinfo(PlanPro_Layoutinfo planPro_Layoutinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planPro_Layoutinfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Ausrichtung_TypeClass(Polygonzug_Ausrichtung_TypeClass polygonzug_Ausrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonzug_Ausrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Blattschnitt_TypeClass(Polygonzug_Blattschnitt_TypeClass polygonzug_Blattschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonzug_Blattschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_LST_Zustand_TypeClass(Referenz_LST_Zustand_TypeClass referenz_LST_Zustand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenz_LST_Zustand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Objekt_Darstellung_TypeClass(Referenz_Objekt_Darstellung_TypeClass referenz_Objekt_Darstellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenz_Objekt_Darstellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFuellung(ENUMFuellung enumFuellung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLageplanArt(ENUMLageplanArt enumLageplanArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinieArt(ENUMLinieArt enumLinieArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinieSubart(ENUMLinieSubart enumLinieSubart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Lageplan_Blattschnitt_Type(BigInteger bez_Lageplan_Blattschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Lageplan_Type(String bezeichnung_Lageplan_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_Lageplan_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_GEO_Punkt_Type(String darstellung_GEO_Punkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_Polygonzug_Type(String darstellung_Polygonzug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDarstellung_Richtungswinkel_Type(BigDecimal darstellung_Richtungswinkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFuellungObject(ENUMFuellung enumFuellungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLageplanArtObject(ENUMLageplanArt enumLageplanArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinieArtObject(ENUMLinieArt enumLinieArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLinieSubartObject(ENUMLinieSubart enumLinieSubartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinie_Farbwert_Type(String linie_Farbwert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLinie_Farbwert_Type_Pattern(linie_Farbwert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLinie_Farbwert_Type_Pattern
	 */
	public static final  PatternMatcher [][] LINIE_FARBWERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-fA-F0-9]{6}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Linie Farbwert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinie_Farbwert_Type_Pattern(String linie_Farbwert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(LayoutinformationenPackage.Literals.LINIE_FARBWERT_TYPE, linie_Farbwert_Type, LINIE_FARBWERT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Ausrichtung_Type(String polygonzug_Ausrichtung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonzug_Blattschnitt_Type(String polygonzug_Blattschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_LST_Zustand_Type(String referenz_LST_Zustand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGUID_Type_Pattern(referenz_LST_Zustand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenz_Objekt_Darstellung_Type(String referenz_Objekt_Darstellung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGUID_Type_Pattern(referenz_Objekt_Darstellung_Type, diagnostics, context);
		return result;
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

} //LayoutinformationenValidator
