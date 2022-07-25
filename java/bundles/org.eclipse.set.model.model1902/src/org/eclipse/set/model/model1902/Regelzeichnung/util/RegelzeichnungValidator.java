/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Regelzeichnung.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model1902.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.model1902.Regelzeichnung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage
 * @generated
 */
public class RegelzeichnungValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RegelzeichnungValidator INSTANCE = new RegelzeichnungValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model1902.Regelzeichnung";

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
	public RegelzeichnungValidator() {
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
	  return RegelzeichnungPackage.eINSTANCE;
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
			case RegelzeichnungPackage.BILD_TYPE_CLASS:
				return validateBild_TypeClass((Bild_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.REGELZEICHNUNG:
				return validateRegelzeichnung((Regelzeichnung)value, diagnostics, context);
			case RegelzeichnungPackage.REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP:
				return validateRegelzeichnung_Allg_AttributeGroup((Regelzeichnung_Allg_AttributeGroup)value, diagnostics, context);
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER:
				return validateRegelzeichnung_Parameter((Regelzeichnung_Parameter)value, diagnostics, context);
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP:
				return validateRegelzeichnung_Parameter_Allg_AttributeGroup((Regelzeichnung_Parameter_Allg_AttributeGroup)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_NUMMER_TYPE_CLASS:
				return validateRZ_Nummer_TypeClass((RZ_Nummer_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE_CLASS:
				return validateRZ_Parameter_Name_TypeClass((RZ_Parameter_Name_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE_CLASS:
				return validateRZ_Parameter_Wert_TypeClass((RZ_Parameter_Wert_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.TITEL_TYPE_CLASS:
				return validateTitel_TypeClass((Titel_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.UNTERTITEL_TYPE_CLASS:
				return validateUntertitel_TypeClass((Untertitel_TypeClass)value, diagnostics, context);
			case RegelzeichnungPackage.BILD_TYPE:
				return validateBild_Type((String)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_NUMMER_TYPE:
				return validateRZ_Nummer_Type((String)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_PARAMETER_NAME_TYPE:
				return validateRZ_Parameter_Name_Type((String)value, diagnostics, context);
			case RegelzeichnungPackage.RZ_PARAMETER_WERT_TYPE:
				return validateRZ_Parameter_Wert_Type((String)value, diagnostics, context);
			case RegelzeichnungPackage.TITEL_TYPE:
				return validateTitel_Type((String)value, diagnostics, context);
			case RegelzeichnungPackage.UNTERTITEL_TYPE:
				return validateUntertitel_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBild_TypeClass(Bild_TypeClass bild_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bild_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegelzeichnung(Regelzeichnung regelzeichnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regelzeichnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegelzeichnung_Allg_AttributeGroup(Regelzeichnung_Allg_AttributeGroup regelzeichnung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regelzeichnung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegelzeichnung_Parameter(Regelzeichnung_Parameter regelzeichnung_Parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regelzeichnung_Parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegelzeichnung_Parameter_Allg_AttributeGroup(Regelzeichnung_Parameter_Allg_AttributeGroup regelzeichnung_Parameter_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regelzeichnung_Parameter_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Nummer_TypeClass(RZ_Nummer_TypeClass rZ_Nummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rZ_Nummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Name_TypeClass(RZ_Parameter_Name_TypeClass rZ_Parameter_Name_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rZ_Parameter_Name_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Wert_TypeClass(RZ_Parameter_Wert_TypeClass rZ_Parameter_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rZ_Parameter_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitel_TypeClass(Titel_TypeClass titel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntertitel_TypeClass(Untertitel_TypeClass untertitel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(untertitel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBild_Type(String bild_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBild_Type_Pattern(bild_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBild_Type_Pattern
	 */
	public static final  PatternMatcher [][] BILD_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bild Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBild_Type_Pattern(String bild_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.BILD_TYPE, bild_Type, BILD_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Nummer_Type(String rZ_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRZ_Nummer_Type_Pattern(rZ_Nummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRZ_Nummer_Type_Pattern
	 */
	public static final  PatternMatcher [][] RZ_NUMMER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>RZ Nummer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Nummer_Type_Pattern(String rZ_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.RZ_NUMMER_TYPE, rZ_Nummer_Type, RZ_NUMMER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Name_Type(String rZ_Parameter_Name_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRZ_Parameter_Name_Type_Pattern(rZ_Parameter_Name_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRZ_Parameter_Name_Type_Pattern
	 */
	public static final  PatternMatcher [][] RZ_PARAMETER_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>RZ Parameter Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Name_Type_Pattern(String rZ_Parameter_Name_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.RZ_PARAMETER_NAME_TYPE, rZ_Parameter_Name_Type, RZ_PARAMETER_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Wert_Type(String rZ_Parameter_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRZ_Parameter_Wert_Type_Pattern(rZ_Parameter_Wert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRZ_Parameter_Wert_Type_Pattern
	 */
	public static final  PatternMatcher [][] RZ_PARAMETER_WERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>RZ Parameter Wert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRZ_Parameter_Wert_Type_Pattern(String rZ_Parameter_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.RZ_PARAMETER_WERT_TYPE, rZ_Parameter_Wert_Type, RZ_PARAMETER_WERT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitel_Type(String titel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTitel_Type_Pattern(titel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTitel_Type_Pattern
	 */
	public static final  PatternMatcher [][] TITEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,200}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Titel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitel_Type_Pattern(String titel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.TITEL_TYPE, titel_Type, TITEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntertitel_Type(String untertitel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUntertitel_Type_Pattern(untertitel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUntertitel_Type_Pattern
	 */
	public static final  PatternMatcher [][] UNTERTITEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,200}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Untertitel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntertitel_Type_Pattern(String untertitel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RegelzeichnungPackage.Literals.UNTERTITEL_TYPE, untertitel_Type, UNTERTITEL_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //RegelzeichnungValidator
