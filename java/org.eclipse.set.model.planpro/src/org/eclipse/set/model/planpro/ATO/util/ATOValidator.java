/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.ATO.*;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.ATO.ATOPackage
 * @generated
 */
public class ATOValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ATOValidator INSTANCE = new ATOValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.ATO";

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
	public ATOValidator() {
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
	  return ATOPackage.eINSTANCE;
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
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS:
				return validateAbstand_ATO_Halt_Vor_EoA_TypeClass((Abstand_ATO_Halt_Vor_EoA_TypeClass)value, diagnostics, context);
			case ATOPackage.ATO_SEGMENT_PROFILE:
				return validateATO_Segment_Profile((ATO_Segment_Profile)value, diagnostics, context);
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateATO_Segment_Profile_Bezeichnung_AttributeGroup((ATO_Segment_Profile_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case ATOPackage.ATO_TIMING_POINT:
				return validateATO_Timing_Point((ATO_Timing_Point)value, diagnostics, context);
			case ATOPackage.ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP:
				return validateATO_Timing_Point_Allg_AttributeGroup((ATO_Timing_Point_Allg_AttributeGroup)value, diagnostics, context);
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateATO_Timing_Point_Bezeichnung_AttributeGroup((ATO_Timing_Point_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case ATOPackage.ATO_TS_INSTANZ:
				return validateATO_TS_Instanz((ATO_TS_Instanz)value, diagnostics, context);
			case ATOPackage.ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP:
				return validateATO_TS_Instanz_Adresse_AttributeGroup((ATO_TS_Instanz_Adresse_AttributeGroup)value, diagnostics, context);
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE_CLASS:
				return validateBezeichnung_ATO_TP_TypeClass((Bezeichnung_ATO_TP_TypeClass)value, diagnostics, context);
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE_CLASS:
				return validateErreichungstoleranz_TypeClass((Erreichungstoleranz_TypeClass)value, diagnostics, context);
			case ATOPackage.HALTETOLERANZ_TYPE_CLASS:
				return validateHaltetoleranz_TypeClass((Haltetoleranz_TypeClass)value, diagnostics, context);
			case ATOPackage.NID_ATOTS_TYPE_CLASS:
				return validateNID_ATOTS_TypeClass((NID_ATOTS_TypeClass)value, diagnostics, context);
			case ATOPackage.NID_CATOTS_TYPE_CLASS:
				return validateNID_C_ATOTS_TypeClass((NID_C_ATOTS_TypeClass)value, diagnostics, context);
			case ATOPackage.NID_SP_TYPE_CLASS:
				return validateNID_SP_TypeClass((NID_SP_TypeClass)value, diagnostics, context);
			case ATOPackage.NID_TP_TYPE_CLASS:
				return validateNID_TP_TypeClass((NID_TP_TypeClass)value, diagnostics, context);
			case ATOPackage.ABSTAND_ATO_HALT_VOR_EO_ATYPE:
				return validateAbstand_ATO_Halt_Vor_EoA_Type((BigDecimal)value, diagnostics, context);
			case ATOPackage.BEZEICHNUNG_ATO_TP_TYPE:
				return validateBezeichnung_ATO_TP_Type((String)value, diagnostics, context);
			case ATOPackage.ERREICHUNGSTOLERANZ_TYPE:
				return validateErreichungstoleranz_Type((BigInteger)value, diagnostics, context);
			case ATOPackage.HALTETOLERANZ_TYPE:
				return validateHaltetoleranz_Type((BigInteger)value, diagnostics, context);
			case ATOPackage.NID_ATOTS_TYPE:
				return validateNID_ATOTS_Type((BigInteger)value, diagnostics, context);
			case ATOPackage.NID_CATOTS_TYPE:
				return validateNID_C_ATOTS_Type((BigInteger)value, diagnostics, context);
			case ATOPackage.NID_SP_TYPE:
				return validateNID_SP_Type((String)value, diagnostics, context);
			case ATOPackage.NID_TP_TYPE:
				return validateNID_TP_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_ATO_Halt_Vor_EoA_TypeClass(Abstand_ATO_Halt_Vor_EoA_TypeClass abstand_ATO_Halt_Vor_EoA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_ATO_Halt_Vor_EoA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_Segment_Profile(ATO_Segment_Profile atO_Segment_Profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_Segment_Profile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_Segment_Profile_Bezeichnung_AttributeGroup(ATO_Segment_Profile_Bezeichnung_AttributeGroup atO_Segment_Profile_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_Segment_Profile_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_Timing_Point(ATO_Timing_Point atO_Timing_Point, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_Timing_Point, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_Timing_Point_Allg_AttributeGroup(ATO_Timing_Point_Allg_AttributeGroup atO_Timing_Point_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_Timing_Point_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_Timing_Point_Bezeichnung_AttributeGroup(ATO_Timing_Point_Bezeichnung_AttributeGroup atO_Timing_Point_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_Timing_Point_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_TS_Instanz(ATO_TS_Instanz atO_TS_Instanz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_TS_Instanz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATO_TS_Instanz_Adresse_AttributeGroup(ATO_TS_Instanz_Adresse_AttributeGroup atO_TS_Instanz_Adresse_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atO_TS_Instanz_Adresse_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ATO_TP_TypeClass(Bezeichnung_ATO_TP_TypeClass bezeichnung_ATO_TP_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_ATO_TP_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErreichungstoleranz_TypeClass(Erreichungstoleranz_TypeClass erreichungstoleranz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erreichungstoleranz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaltetoleranz_TypeClass(Haltetoleranz_TypeClass haltetoleranz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haltetoleranz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_ATOTS_TypeClass(NID_ATOTS_TypeClass niD_ATOTS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_ATOTS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_ATOTS_TypeClass(NID_C_ATOTS_TypeClass niD_C_ATOTS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_C_ATOTS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_SP_TypeClass(NID_SP_TypeClass niD_SP_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_SP_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_TP_TypeClass(NID_TP_TypeClass niD_TP_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_TP_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_ATO_Halt_Vor_EoA_Type(BigDecimal abstand_ATO_Halt_Vor_EoA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ATO_TP_Type(String bezeichnung_ATO_TP_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_ATO_TP_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErreichungstoleranz_Type(BigInteger erreichungstoleranz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateErreichungstoleranz_Type_Pattern(erreichungstoleranz_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateErreichungstoleranz_Type_Pattern
	 */
	public static final  PatternMatcher [][] ERREICHUNGSTOLERANZ_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]|[12][0-9]|30|31")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Erreichungstoleranz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErreichungstoleranz_Type_Pattern(BigInteger erreichungstoleranz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ATOPackage.Literals.ERREICHUNGSTOLERANZ_TYPE, erreichungstoleranz_Type, ERREICHUNGSTOLERANZ_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaltetoleranz_Type(BigInteger haltetoleranz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHaltetoleranz_Type_Pattern(haltetoleranz_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHaltetoleranz_Type_Pattern
	 */
	public static final  PatternMatcher [][] HALTETOLERANZ_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]|[12][0-9]|30|31")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Haltetoleranz Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaltetoleranz_Type_Pattern(BigInteger haltetoleranz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ATOPackage.Literals.HALTETOLERANZ_TYPE, haltetoleranz_Type, HALTETOLERANZ_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_ATOTS_Type(BigInteger niD_ATOTS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_ATOTS_Type(BigInteger niD_C_ATOTS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNID_C_ATOTS_Type_Pattern(niD_C_ATOTS_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNID_C_ATOTS_Type_Pattern
	 */
	public static final  PatternMatcher [][] NID_CATOTS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("102[0-3]|10[0-1][0-9]|[1-9][0-9]{2}|0|[1-9][0-9]{0,1}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>NID CATOTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_ATOTS_Type_Pattern(BigInteger niD_C_ATOTS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ATOPackage.Literals.NID_CATOTS_TYPE, niD_C_ATOTS_Type, NID_CATOTS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_SP_Type(String niD_SP_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(niD_SP_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_TP_Type(BigInteger niD_TP_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //ATOValidator
