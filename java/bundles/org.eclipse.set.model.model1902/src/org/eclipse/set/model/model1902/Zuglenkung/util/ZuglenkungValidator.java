/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model1902.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.model1902.Zuglenkung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage
 * @generated
 */
public class ZuglenkungValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ZuglenkungValidator INSTANCE = new ZuglenkungValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model1902.Zuglenkung";

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
	public ZuglenkungValidator() {
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
	  return ZuglenkungPackage.eINSTANCE;
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
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS:
				return validateAnnaeherungsgeschwindigkeit_TypeClass((Annaeherungsgeschwindigkeit_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS:
				return validateAnzahl_Wiederhol_ZL_Anstoesse_TypeClass((Anzahl_Wiederhol_ZL_Anstoesse_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.DEADLOCKPRUEFUNG_TYPE_CLASS:
				return validateDeadlockpruefung_TypeClass((Deadlockpruefung_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.DWEG_PRIO_TYPE_CLASS:
				return validateDWeg_Prio_TypeClass((DWeg_Prio_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE_CLASS:
				return validateEinstellkontrollzeit_TypeClass((Einstellkontrollzeit_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.FUEM_AUSWERTUNG_TYPE_CLASS:
				return validateFUEM_Auswertung_TypeClass((FUEM_Auswertung_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.GK_TYPE_CLASS:
				return validateGK_TypeClass((GK_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.GKZSS_TYPE_CLASS:
				return validateGKZSS_TypeClass((GKZSS_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE_CLASS:
				return validateLenkabbruchzeit_TypeClass((Lenkabbruchzeit_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.LENKZIFFERNSTELLEN_TYPE_CLASS:
				return validateLenkziffernstellen_TypeClass((Lenkziffernstellen_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE_CLASS:
				return validatePersonal_Reaktionszeit_TypeClass((Personal_Reaktionszeit_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE_CLASS:
				return validateSichtzeit_Vorsignal_TypeClass((Sichtzeit_Vorsignal_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS:
				return validateSignalgruppe_Bezeichner_TypeClass((Signalgruppe_Bezeichner_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.TV_GK_TYPE_CLASS:
				return validateTv_GK_TypeClass((Tv_GK_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE_CLASS:
				return validateVmax_Annaeherung_TypeClass((Vmax_Annaeherung_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.ZL:
				return validateZL((ZL)value, diagnostics, context);
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP:
				return validateZL_Allg_AttributeGroup((ZL_Allg_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT:
				return validateZL_DLP_Abschnitt((ZL_DLP_Abschnitt)value, diagnostics, context);
			case ZuglenkungPackage.ZL_DLP_FSTR:
				return validateZL_DLP_Fstr((ZL_DLP_Fstr)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR:
				return validateZL_Fstr((ZL_Fstr)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP:
				return validateZL_Fstr_Allg_AttributeGroup((ZL_Fstr_Allg_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS:
				return validateZL_Fstr_Anstoss((ZL_Fstr_Anstoss)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP:
				return validateZL_Fstr_Anstoss_Allg_AttributeGroup((ZL_Fstr_Anstoss_Allg_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP:
				return validateZL_Fstr_Anstoss_GK_AttributeGroup((ZL_Fstr_Anstoss_GK_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE_CLASS:
				return validateZL_Fstr_Zuschlag_TypeClass((ZL_Fstr_Zuschlag_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.ZL_SIGNALGRUPPE:
				return validateZL_Signalgruppe((ZL_Signalgruppe)value, diagnostics, context);
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP:
				return validateZL_Signalgruppe_Allg_AttributeGroup((ZL_Signalgruppe_Allg_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG:
				return validateZL_Signalgruppe_Zuordnung((ZL_Signalgruppe_Zuordnung)value, diagnostics, context);
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP:
				return validateZL_ZN_AttributeGroup((ZL_ZN_AttributeGroup)value, diagnostics, context);
			case ZuglenkungPackage.ZN_STELLEN_TYPE_CLASS:
				return validateZN_Stellen_TypeClass((ZN_Stellen_TypeClass)value, diagnostics, context);
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN:
				return validateENUMLenkziffernstellen((ENUMLenkziffernstellen)value, diagnostics, context);
			case ZuglenkungPackage.ENUMZN_STELLEN:
				return validateENUMZNStellen((ENUMZNStellen)value, diagnostics, context);
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE:
				return validateAnnaeherungsgeschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE:
				return validateAnzahl_Wiederhol_ZL_Anstoesse_Type((BigInteger)value, diagnostics, context);
			case ZuglenkungPackage.DWEG_PRIO_TYPE:
				return validateDWeg_Prio_Type((BigInteger)value, diagnostics, context);
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE:
				return validateEinstellkontrollzeit_Type((BigDecimal)value, diagnostics, context);
			case ZuglenkungPackage.ENUM_LENKZIFFERNSTELLEN_OBJECT:
				return validateENUMLenkziffernstellenObject((ENUMLenkziffernstellen)value, diagnostics, context);
			case ZuglenkungPackage.ENUMZN_STELLEN_OBJECT:
				return validateENUMZNStellenObject((ENUMZNStellen)value, diagnostics, context);
			case ZuglenkungPackage.GK_TYPE:
				return validateGK_Type((BigInteger)value, diagnostics, context);
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE:
				return validateLenkabbruchzeit_Type((BigDecimal)value, diagnostics, context);
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE:
				return validatePersonal_Reaktionszeit_Type((BigDecimal)value, diagnostics, context);
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE:
				return validateSichtzeit_Vorsignal_Type((BigDecimal)value, diagnostics, context);
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE:
				return validateSignalgruppe_Bezeichner_Type((String)value, diagnostics, context);
			case ZuglenkungPackage.TV_GK_TYPE:
				return validateTv_GK_Type((BigDecimal)value, diagnostics, context);
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE:
				return validateVmax_Annaeherung_Type((BigInteger)value, diagnostics, context);
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE:
				return validateZL_Fstr_Zuschlag_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnaeherungsgeschwindigkeit_TypeClass(Annaeherungsgeschwindigkeit_TypeClass annaeherungsgeschwindigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annaeherungsgeschwindigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Wiederhol_ZL_Anstoesse_TypeClass(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass anzahl_Wiederhol_ZL_Anstoesse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anzahl_Wiederhol_ZL_Anstoesse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadlockpruefung_TypeClass(Deadlockpruefung_TypeClass deadlockpruefung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deadlockpruefung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Prio_TypeClass(DWeg_Prio_TypeClass dWeg_Prio_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Prio_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinstellkontrollzeit_TypeClass(Einstellkontrollzeit_TypeClass einstellkontrollzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einstellkontrollzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFUEM_Auswertung_TypeClass(FUEM_Auswertung_TypeClass fueM_Auswertung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fueM_Auswertung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_TypeClass(GK_TypeClass gK_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gK_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGKZSS_TypeClass(GKZSS_TypeClass gkzsS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gkzsS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLenkabbruchzeit_TypeClass(Lenkabbruchzeit_TypeClass lenkabbruchzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lenkabbruchzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLenkziffernstellen_TypeClass(Lenkziffernstellen_TypeClass lenkziffernstellen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lenkziffernstellen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonal_Reaktionszeit_TypeClass(Personal_Reaktionszeit_TypeClass personal_Reaktionszeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personal_Reaktionszeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSichtzeit_Vorsignal_TypeClass(Sichtzeit_Vorsignal_TypeClass sichtzeit_Vorsignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sichtzeit_Vorsignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalgruppe_Bezeichner_TypeClass(Signalgruppe_Bezeichner_TypeClass signalgruppe_Bezeichner_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalgruppe_Bezeichner_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTv_GK_TypeClass(Tv_GK_TypeClass tv_GK_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tv_GK_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmax_Annaeherung_TypeClass(Vmax_Annaeherung_TypeClass vmax_Annaeherung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vmax_Annaeherung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL(ZL zl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Allg_AttributeGroup(ZL_Allg_AttributeGroup zL_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_DLP_Abschnitt(ZL_DLP_Abschnitt zL_DLP_Abschnitt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_DLP_Abschnitt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_DLP_Fstr(ZL_DLP_Fstr zL_DLP_Fstr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_DLP_Fstr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr(ZL_Fstr zL_Fstr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Allg_AttributeGroup(ZL_Fstr_Allg_AttributeGroup zL_Fstr_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Anstoss(ZL_Fstr_Anstoss zL_Fstr_Anstoss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr_Anstoss, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Anstoss_Allg_AttributeGroup(ZL_Fstr_Anstoss_Allg_AttributeGroup zL_Fstr_Anstoss_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr_Anstoss_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Anstoss_GK_AttributeGroup(ZL_Fstr_Anstoss_GK_AttributeGroup zL_Fstr_Anstoss_GK_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr_Anstoss_GK_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Zuschlag_TypeClass(ZL_Fstr_Zuschlag_TypeClass zL_Fstr_Zuschlag_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Fstr_Zuschlag_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Signalgruppe(ZL_Signalgruppe zL_Signalgruppe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Signalgruppe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Signalgruppe_Allg_AttributeGroup(ZL_Signalgruppe_Allg_AttributeGroup zL_Signalgruppe_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Signalgruppe_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Signalgruppe_Zuordnung(ZL_Signalgruppe_Zuordnung zL_Signalgruppe_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_Signalgruppe_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_ZN_AttributeGroup(ZL_ZN_AttributeGroup zL_ZN_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zL_ZN_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Stellen_TypeClass(ZN_Stellen_TypeClass zN_Stellen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Stellen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLenkziffernstellen(ENUMLenkziffernstellen enumLenkziffernstellen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNStellen(ENUMZNStellen enumznStellen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnaeherungsgeschwindigkeit_Type(BigInteger annaeherungsgeschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnnaeherungsgeschwindigkeit_Type_Pattern(annaeherungsgeschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnnaeherungsgeschwindigkeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] ANNAEHERUNGSGESCHWINDIGKEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[4-9][0-9]|1[0-5][0-9]|160")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Annaeherungsgeschwindigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnaeherungsgeschwindigkeit_Type_Pattern(BigInteger annaeherungsgeschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE, annaeherungsgeschwindigkeit_Type, ANNAEHERUNGSGESCHWINDIGKEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Wiederhol_ZL_Anstoesse_Type(BigInteger anzahl_Wiederhol_ZL_Anstoesse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnzahl_Wiederhol_ZL_Anstoesse_Type_Pattern(anzahl_Wiederhol_ZL_Anstoesse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnzahl_Wiederhol_ZL_Anstoesse_Type_Pattern
	 */
	public static final  PatternMatcher [][] ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|10")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Anzahl Wiederhol ZL Anstoesse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Wiederhol_ZL_Anstoesse_Type_Pattern(BigInteger anzahl_Wiederhol_ZL_Anstoesse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE, anzahl_Wiederhol_ZL_Anstoesse_Type, ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Prio_Type(BigInteger dWeg_Prio_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDWeg_Prio_Type_Pattern(dWeg_Prio_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDWeg_Prio_Type_Pattern
	 */
	public static final  PatternMatcher [][] DWEG_PRIO_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-4]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DWeg Prio Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Prio_Type_Pattern(BigInteger dWeg_Prio_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.DWEG_PRIO_TYPE, dWeg_Prio_Type, DWEG_PRIO_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinstellkontrollzeit_Type(BigDecimal einstellkontrollzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEinstellkontrollzeit_Type_Pattern(einstellkontrollzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEinstellkontrollzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] EINSTELLKONTROLLZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|1[0-9]{2}|200")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Einstellkontrollzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinstellkontrollzeit_Type_Pattern(BigDecimal einstellkontrollzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.EINSTELLKONTROLLZEIT_TYPE, einstellkontrollzeit_Type, EINSTELLKONTROLLZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLenkziffernstellenObject(ENUMLenkziffernstellen enumLenkziffernstellenObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNStellenObject(ENUMZNStellen enumznStellenObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Type(BigInteger gK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGK_Type_Pattern(gK_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGK_Type_Pattern
	 */
	public static final  PatternMatcher [][] GK_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[4-9][0-9]|1[0-5][0-9]|160")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>GK Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGK_Type_Pattern(BigInteger gK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.GK_TYPE, gK_Type, GK_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLenkabbruchzeit_Type(BigDecimal lenkabbruchzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLenkabbruchzeit_Type_Pattern(lenkabbruchzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLenkabbruchzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] LENKABBRUCHZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,2}|1[01][0-9]{2}|1200")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Lenkabbruchzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLenkabbruchzeit_Type_Pattern(BigDecimal lenkabbruchzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.LENKABBRUCHZEIT_TYPE, lenkabbruchzeit_Type, LENKABBRUCHZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonal_Reaktionszeit_Type(BigDecimal personal_Reaktionszeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePersonal_Reaktionszeit_Type_Pattern(personal_Reaktionszeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePersonal_Reaktionszeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] PERSONAL_REAKTIONSZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1[5-9]|[23][0-9]|4[0-5]")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Personal Reaktionszeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonal_Reaktionszeit_Type_Pattern(BigDecimal personal_Reaktionszeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.PERSONAL_REAKTIONSZEIT_TYPE, personal_Reaktionszeit_Type, PERSONAL_REAKTIONSZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSichtzeit_Vorsignal_Type(BigDecimal sichtzeit_Vorsignal_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSichtzeit_Vorsignal_Type_Pattern(sichtzeit_Vorsignal_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSichtzeit_Vorsignal_Type_Pattern
	 */
	public static final  PatternMatcher [][] SICHTZEIT_VORSIGNAL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|1[0-9]|20")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sichtzeit Vorsignal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSichtzeit_Vorsignal_Type_Pattern(BigDecimal sichtzeit_Vorsignal_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.SICHTZEIT_VORSIGNAL_TYPE, sichtzeit_Vorsignal_Type, SICHTZEIT_VORSIGNAL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalgruppe_Bezeichner_Type(String signalgruppe_Bezeichner_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(signalgruppe_Bezeichner_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTv_GK_Type(BigDecimal tv_GK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTv_GK_Type_Pattern(tv_GK_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTv_GK_Type_Pattern
	 */
	public static final  PatternMatcher [][] TV_GK_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tv GK Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTv_GK_Type_Pattern(BigDecimal tv_GK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZuglenkungPackage.Literals.TV_GK_TYPE, tv_GK_Type, TV_GK_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmax_Annaeherung_Type(BigInteger vmax_Annaeherung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vmax_Annaeherung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZL_Fstr_Zuschlag_Type(BigDecimal zL_Fstr_Zuschlag_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(zL_Fstr_Zuschlag_Type, diagnostics, context);
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

} //ZuglenkungValidator
