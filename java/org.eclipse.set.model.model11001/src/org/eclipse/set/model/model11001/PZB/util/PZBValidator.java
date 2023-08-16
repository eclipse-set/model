/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.util;

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

import org.eclipse.set.model.model11001.PZB.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage
 * @generated
 */
public class PZBValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PZBValidator INSTANCE = new PZBValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.PZB";

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
	public PZBValidator() {
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
	  return PZBPackage.eINSTANCE;
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
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE_CLASS:
				return validateGUE_Abstand_Abweichend_TypeClass((GUE_Abstand_Abweichend_TypeClass)value, diagnostics, context);
			case PZBPackage.GUE_ANORDNUNG_TYPE_CLASS:
				return validateGUE_Anordnung_TypeClass((GUE_Anordnung_TypeClass)value, diagnostics, context);
			case PZBPackage.GUE_BAUART_TYPE_CLASS:
				return validateGUE_Bauart_TypeClass((GUE_Bauart_TypeClass)value, diagnostics, context);
			case PZBPackage.GUE_ENERGIEVERSORGUNG_TYPE_CLASS:
				return validateGUE_Energieversorgung_TypeClass((GUE_Energieversorgung_TypeClass)value, diagnostics, context);
			case PZBPackage.GUE_MESSSTRECKE_TYPE_CLASS:
				return validateGUE_Messstrecke_TypeClass((GUE_Messstrecke_TypeClass)value, diagnostics, context);
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP:
				return validateINA_Gefahrstelle_AttributeGroup((INA_Gefahrstelle_AttributeGroup)value, diagnostics, context);
			case PZBPackage.MESSFEHLER_TYPE_CLASS:
				return validateMessfehler_TypeClass((Messfehler_TypeClass)value, diagnostics, context);
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE_CLASS:
				return validatePrioritaet_Gefahrstelle_TypeClass((Prioritaet_Gefahrstelle_TypeClass)value, diagnostics, context);
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE_CLASS:
				return validatePruefgeschwindigkeit_TypeClass((Pruefgeschwindigkeit_TypeClass)value, diagnostics, context);
			case PZBPackage.PRUEFZEIT_TYPE_CLASS:
				return validatePruefzeit_TypeClass((Pruefzeit_TypeClass)value, diagnostics, context);
			case PZBPackage.PZB_ABSTAND_GM_TYPE_CLASS:
				return validatePZB_Abstand_GM_TypeClass((PZB_Abstand_GM_TypeClass)value, diagnostics, context);
			case PZBPackage.PZB_ART_TYPE_CLASS:
				return validatePZB_Art_TypeClass((PZB_Art_TypeClass)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT:
				return validatePZB_Element((PZB_Element)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP:
				return validatePZB_Element_GM_AttributeGroup((PZB_Element_GM_AttributeGroup)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_GUE_ATTRIBUTE_GROUP:
				return validatePZB_Element_GUE_AttributeGroup((PZB_Element_GUE_AttributeGroup)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG:
				return validatePZB_Element_Zuordnung((PZB_Element_Zuordnung)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP:
				return validatePZB_Element_Zuordnung_BP_AttributeGroup((PZB_Element_Zuordnung_BP_AttributeGroup)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP:
				return validatePZB_Element_Zuordnung_Fstr_AttributeGroup((PZB_Element_Zuordnung_Fstr_AttributeGroup)value, diagnostics, context);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP:
				return validatePZB_Element_Zuordnung_INA_AttributeGroup((PZB_Element_Zuordnung_INA_AttributeGroup)value, diagnostics, context);
			case PZBPackage.PZB_INA_TYPE_CLASS:
				return validatePZB_INA_TypeClass((PZB_INA_TypeClass)value, diagnostics, context);
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL:
				return validatePZB_Zuordnung_Signal((PZB_Zuordnung_Signal)value, diagnostics, context);
			case PZBPackage.WIRKSAMKEIT_FSTR_TYPE_CLASS:
				return validateWirksamkeit_Fstr_TypeClass((Wirksamkeit_Fstr_TypeClass)value, diagnostics, context);
			case PZBPackage.WIRKSAMKEIT_TYPE_CLASS:
				return validateWirksamkeit_TypeClass((Wirksamkeit_TypeClass)value, diagnostics, context);
			case PZBPackage.ENUMGUE_ANORDNUNG:
				return validateENUMGUEAnordnung((ENUMGUEAnordnung)value, diagnostics, context);
			case PZBPackage.ENUMGUE_BAUART:
				return validateENUMGUEBauart((ENUMGUEBauart)value, diagnostics, context);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG:
				return validateENUMGUEEnergieversorgung((ENUMGUEEnergieversorgung)value, diagnostics, context);
			case PZBPackage.ENUM_MESSFEHLER:
				return validateENUMMessfehler((ENUMMessfehler)value, diagnostics, context);
			case PZBPackage.ENUMPZB_ART:
				return validateENUMPZBArt((ENUMPZBArt)value, diagnostics, context);
			case PZBPackage.ENUM_WIRKSAMKEIT:
				return validateENUMWirksamkeit((ENUMWirksamkeit)value, diagnostics, context);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR:
				return validateENUMWirksamkeitFstr((ENUMWirksamkeitFstr)value, diagnostics, context);
			case PZBPackage.ENUMGUE_ANORDNUNG_OBJECT:
				return validateENUMGUEAnordnungObject((ENUMGUEAnordnung)value, diagnostics, context);
			case PZBPackage.ENUMGUE_BAUART_OBJECT:
				return validateENUMGUEBauartObject((ENUMGUEBauart)value, diagnostics, context);
			case PZBPackage.ENUMGUE_ENERGIEVERSORGUNG_OBJECT:
				return validateENUMGUEEnergieversorgungObject((ENUMGUEEnergieversorgung)value, diagnostics, context);
			case PZBPackage.ENUM_MESSFEHLER_OBJECT:
				return validateENUMMessfehlerObject((ENUMMessfehler)value, diagnostics, context);
			case PZBPackage.ENUMPZB_ART_OBJECT:
				return validateENUMPZBArtObject((ENUMPZBArt)value, diagnostics, context);
			case PZBPackage.ENUM_WIRKSAMKEIT_FSTR_OBJECT:
				return validateENUMWirksamkeitFstrObject((ENUMWirksamkeitFstr)value, diagnostics, context);
			case PZBPackage.ENUM_WIRKSAMKEIT_OBJECT:
				return validateENUMWirksamkeitObject((ENUMWirksamkeit)value, diagnostics, context);
			case PZBPackage.GUE_ABSTAND_ABWEICHEND_TYPE:
				return validateGUE_Abstand_Abweichend_Type((BigDecimal)value, diagnostics, context);
			case PZBPackage.GUE_MESSSTRECKE_TYPE:
				return validateGUE_Messstrecke_Type((BigDecimal)value, diagnostics, context);
			case PZBPackage.PRIORITAET_GEFAHRSTELLE_TYPE:
				return validatePrioritaet_Gefahrstelle_Type((BigInteger)value, diagnostics, context);
			case PZBPackage.PRUEFGESCHWINDIGKEIT_TYPE:
				return validatePruefgeschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case PZBPackage.PRUEFZEIT_TYPE:
				return validatePruefzeit_Type((BigDecimal)value, diagnostics, context);
			case PZBPackage.PZB_ABSTAND_GM_TYPE:
				return validatePZB_Abstand_GM_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Abstand_Abweichend_TypeClass(GUE_Abstand_Abweichend_TypeClass guE_Abstand_Abweichend_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guE_Abstand_Abweichend_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Anordnung_TypeClass(GUE_Anordnung_TypeClass guE_Anordnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guE_Anordnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Bauart_TypeClass(GUE_Bauart_TypeClass guE_Bauart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guE_Bauart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Energieversorgung_TypeClass(GUE_Energieversorgung_TypeClass guE_Energieversorgung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guE_Energieversorgung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Messstrecke_TypeClass(GUE_Messstrecke_TypeClass guE_Messstrecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guE_Messstrecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINA_Gefahrstelle_AttributeGroup(INA_Gefahrstelle_AttributeGroup inA_Gefahrstelle_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inA_Gefahrstelle_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessfehler_TypeClass(Messfehler_TypeClass messfehler_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messfehler_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_Gefahrstelle_TypeClass(Prioritaet_Gefahrstelle_TypeClass prioritaet_Gefahrstelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prioritaet_Gefahrstelle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefgeschwindigkeit_TypeClass(Pruefgeschwindigkeit_TypeClass pruefgeschwindigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pruefgeschwindigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefzeit_TypeClass(Pruefzeit_TypeClass pruefzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pruefzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Abstand_GM_TypeClass(PZB_Abstand_GM_TypeClass pzB_Abstand_GM_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Abstand_GM_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Art_TypeClass(PZB_Art_TypeClass pzB_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element(PZB_Element pzB_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_GM_AttributeGroup(PZB_Element_GM_AttributeGroup pzB_Element_GM_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_GM_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_GUE_AttributeGroup(PZB_Element_GUE_AttributeGroup pzB_Element_GUE_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_GUE_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_Zuordnung(PZB_Element_Zuordnung pzB_Element_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_Zuordnung_BP_AttributeGroup(PZB_Element_Zuordnung_BP_AttributeGroup pzB_Element_Zuordnung_BP_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_Zuordnung_BP_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_Zuordnung_Fstr_AttributeGroup(PZB_Element_Zuordnung_Fstr_AttributeGroup pzB_Element_Zuordnung_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_Zuordnung_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Element_Zuordnung_INA_AttributeGroup(PZB_Element_Zuordnung_INA_AttributeGroup pzB_Element_Zuordnung_INA_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Element_Zuordnung_INA_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_INA_TypeClass(PZB_INA_TypeClass pzB_INA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_INA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Zuordnung_Signal(PZB_Zuordnung_Signal pzB_Zuordnung_Signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Zuordnung_Signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirksamkeit_Fstr_TypeClass(Wirksamkeit_Fstr_TypeClass wirksamkeit_Fstr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wirksamkeit_Fstr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirksamkeit_TypeClass(Wirksamkeit_TypeClass wirksamkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wirksamkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEAnordnung(ENUMGUEAnordnung enumgueAnordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEBauart(ENUMGUEBauart enumgueBauart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEEnergieversorgung(ENUMGUEEnergieversorgung enumgueEnergieversorgung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMessfehler(ENUMMessfehler enumMessfehler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPZBArt(ENUMPZBArt enumpzbArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirksamkeit(ENUMWirksamkeit enumWirksamkeit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirksamkeitFstr(ENUMWirksamkeitFstr enumWirksamkeitFstr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEAnordnungObject(ENUMGUEAnordnung enumgueAnordnungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEBauartObject(ENUMGUEBauart enumgueBauartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGUEEnergieversorgungObject(ENUMGUEEnergieversorgung enumgueEnergieversorgungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMessfehlerObject(ENUMMessfehler enumMessfehlerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPZBArtObject(ENUMPZBArt enumpzbArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirksamkeitFstrObject(ENUMWirksamkeitFstr enumWirksamkeitFstrObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWirksamkeitObject(ENUMWirksamkeit enumWirksamkeitObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Abstand_Abweichend_Type(BigDecimal guE_Abstand_Abweichend_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Messstrecke_Type(BigDecimal guE_Messstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGUE_Messstrecke_Type_Pattern(guE_Messstrecke_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGUE_Messstrecke_Type_Pattern
	 */
	public static final  PatternMatcher [][] GUE_MESSSTRECKE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("5\\.[89][0-9]|([6-9]|[1-6][0-9]|7[0-4])\\.[0-9]{2}|75\\.00")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GUE Messstrecke Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGUE_Messstrecke_Type_Pattern(BigDecimal guE_Messstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PZBPackage.Literals.GUE_MESSSTRECKE_TYPE, guE_Messstrecke_Type, GUE_MESSSTRECKE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_Gefahrstelle_Type(BigInteger prioritaet_Gefahrstelle_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefgeschwindigkeit_Type(BigInteger pruefgeschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePruefgeschwindigkeit_Type_Pattern(pruefgeschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePruefgeschwindigkeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] PRUEFGESCHWINDIGKEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]|1[0-4][0-9]|150")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Pruefgeschwindigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefgeschwindigkeit_Type_Pattern(BigInteger pruefgeschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PZBPackage.Literals.PRUEFGESCHWINDIGKEIT_TYPE, pruefgeschwindigkeit_Type, PRUEFGESCHWINDIGKEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefzeit_Type(BigDecimal pruefzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePruefzeit_Type_Pattern(pruefzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePruefzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] PRUEFZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,1})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Pruefzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePruefzeit_Type_Pattern(BigDecimal pruefzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PZBPackage.Literals.PRUEFZEIT_TYPE, pruefzeit_Type, PRUEFZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Abstand_GM_Type(BigDecimal pzB_Abstand_GM_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePZB_Abstand_GM_Type_Pattern(pzB_Abstand_GM_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePZB_Abstand_GM_Type_Pattern
	 */
	public static final  PatternMatcher [][] PZB_ABSTAND_GM_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\-[1-6]|[0-9]|[1-9][0-9]|[12][0-9]{2}|300")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>PZB Abstand GM Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Abstand_GM_Type_Pattern(BigDecimal pzB_Abstand_GM_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PZBPackage.Literals.PZB_ABSTAND_GM_TYPE, pzB_Abstand_GM_Type, PZB_ABSTAND_GM_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //PZBValidator
