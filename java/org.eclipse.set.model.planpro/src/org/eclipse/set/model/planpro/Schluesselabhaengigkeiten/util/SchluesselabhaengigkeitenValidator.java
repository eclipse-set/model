/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage
 * @generated
 */
public class SchluesselabhaengigkeitenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchluesselabhaengigkeitenValidator INSTANCE = new SchluesselabhaengigkeitenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Schluesselabhaengigkeiten";

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
	public SchluesselabhaengigkeitenValidator() {
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
	  return SchluesselabhaengigkeitenPackage.eINSTANCE;
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
			case SchluesselabhaengigkeitenPackage.BEDIENUNG_ART_TYPE_CLASS:
				return validateBedienung_Art_TypeClass((Bedienung_Art_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS:
				return validateBeschreibung_Sonderanlage_TypeClass((Beschreibung_Sonderanlage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE_CLASS:
				return validateBezeichnung_Schloss_TypeClass((Bezeichnung_Schloss_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS:
				return validateBezeichnung_Schluessel_TypeClass((Bezeichnung_Schluessel_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE_CLASS:
				return validateBezeichnung_Sk_TypeClass((Bezeichnung_Sk_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BUE_LAGE_TYPE_CLASS:
				return validateBUE_Lage_TypeClass((BUE_Lage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.GSP_LAGE_TYPE_CLASS:
				return validateGsp_Lage_TypeClass((Gsp_Lage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.HAUPTSCHLOSS_TYPE_CLASS:
				return validateHauptschloss_TypeClass((Hauptschloss_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS:
				return validateSchloss((Schloss)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_ART_TYPE_CLASS:
				return validateSchloss_Art_TypeClass((Schloss_Art_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateSchloss_Bezeichnung_AttributeGroup((Schloss_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BUE_ATTRIBUTE_GROUP:
				return validateSchloss_BUE_AttributeGroup((Schloss_BUE_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP:
				return validateSchloss_Gsp_AttributeGroup((Schloss_Gsp_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP:
				return validateSchloss_Sk_AttributeGroup((Schloss_Sk_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP:
				return validateSchloss_Sonderanlage_AttributeGroup((Schloss_Sonderanlage_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP:
				return validateSchloss_Ssp_AttributeGroup((Schloss_Ssp_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP:
				return validateSchloss_W_AttributeGroup((Schloss_W_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION:
				return validateSchlosskombination((Schlosskombination)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateSchlosskombination_Bezeichnung_AttributeGroup((Schlosskombination_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL:
				return validateSchluessel((Schluessel)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_ALLG_ATTRIBUTE_GROUP:
				return validateSchluessel_Allg_AttributeGroup((Schluessel_Allg_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BARTFORM_TYPE_CLASS:
				return validateSchluessel_Bartform_TypeClass((Schluessel_Bartform_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateSchluessel_Bezeichnung_AttributeGroup((Schluessel_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_GRUPPE_TYPE_CLASS:
				return validateSchluessel_Gruppe_TypeClass((Schluessel_Gruppe_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS:
				return validateSchluessel_In_Grdst_Eingeschl_TypeClass((Schluessel_In_Grdst_Eingeschl_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE:
				return validateSchluesselsperre((Schluesselsperre)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.SONDERANLAGE_LAGE_TYPE_CLASS:
				return validateSonderanlage_Lage_TypeClass((Sonderanlage_Lage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.TECHNISCH_BERECHTIGTER_TYPE_CLASS:
				return validateTechnisch_Berechtigter_TypeClass((Technisch_Berechtigter_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.VERSCHLUSS_ORT_TYPE_CLASS:
				return validateVerschluss_Ort_TypeClass((Verschluss_Ort_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE_CLASS:
				return validateW_Anbaulage_TypeClass((W_Anbaulage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE_CLASS:
				return validateW_Lage_TypeClass((W_Lage_TypeClass)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART:
				return validateENUMBedienungArt((ENUMBedienungArt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE:
				return validateENUMBUELage((ENUMBUELage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE:
				return validateENUMGspLage((ENUMGspLage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART:
				return validateENUMSchlossArt((ENUMSchlossArt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM:
				return validateENUMSchluesselBartform((ENUMSchluesselBartform)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE:
				return validateENUMSchluesselGruppe((ENUMSchluesselGruppe)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE:
				return validateENUMSonderanlageLage((ENUMSonderanlageLage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT:
				return validateENUMVerschlussOrt((ENUMVerschlussOrt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BESCHREIBUNG_SONDERANLAGE_TYPE:
				return validateBeschreibung_Sonderanlage_Type((String)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLOSS_TYPE:
				return validateBezeichnung_Schloss_Type((String)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SCHLUESSEL_TYPE:
				return validateBezeichnung_Schluessel_Type((String)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.BEZEICHNUNG_SK_TYPE:
				return validateBezeichnung_Sk_Type((String)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_BEDIENUNG_ART_OBJECT:
				return validateENUMBedienungArtObject((ENUMBedienungArt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUMBUE_LAGE_OBJECT:
				return validateENUMBUELageObject((ENUMBUELage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_GSP_LAGE_OBJECT:
				return validateENUMGspLageObject((ENUMGspLage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLOSS_ART_OBJECT:
				return validateENUMSchlossArtObject((ENUMSchlossArt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_BARTFORM_OBJECT:
				return validateENUMSchluesselBartformObject((ENUMSchluesselBartform)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SCHLUESSEL_GRUPPE_OBJECT:
				return validateENUMSchluesselGruppeObject((ENUMSchluesselGruppe)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_SONDERANLAGE_LAGE_OBJECT:
				return validateENUMSonderanlageLageObject((ENUMSonderanlageLage)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.ENUM_VERSCHLUSS_ORT_OBJECT:
				return validateENUMVerschlussOrtObject((ENUMVerschlussOrt)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.WANBAULAGE_TYPE:
				return validateW_Anbaulage_Type((ENUMLinksRechts)value, diagnostics, context);
			case SchluesselabhaengigkeitenPackage.WLAGE_TYPE:
				return validateW_Lage_Type((ENUMLinksRechts)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienung_Art_TypeClass(Bedienung_Art_TypeClass bedienung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedienung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeschreibung_Sonderanlage_TypeClass(Beschreibung_Sonderanlage_TypeClass beschreibung_Sonderanlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beschreibung_Sonderanlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schloss_TypeClass(Bezeichnung_Schloss_TypeClass bezeichnung_Schloss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Schloss_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schluessel_TypeClass(Bezeichnung_Schluessel_TypeClass bezeichnung_Schluessel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Schluessel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Sk_TypeClass(Bezeichnung_Sk_TypeClass bezeichnung_Sk_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Sk_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Lage_TypeClass(BUE_Lage_TypeClass buE_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGsp_Lage_TypeClass(Gsp_Lage_TypeClass gsp_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gsp_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHauptschloss_TypeClass(Hauptschloss_TypeClass hauptschloss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hauptschloss_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss(Schloss schloss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Art_TypeClass(Schloss_Art_TypeClass schloss_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Bezeichnung_AttributeGroup(Schloss_Bezeichnung_AttributeGroup schloss_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_BUE_AttributeGroup(Schloss_BUE_AttributeGroup schloss_BUE_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_BUE_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Gsp_AttributeGroup(Schloss_Gsp_AttributeGroup schloss_Gsp_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Gsp_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Sk_AttributeGroup(Schloss_Sk_AttributeGroup schloss_Sk_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Sk_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Sonderanlage_AttributeGroup(Schloss_Sonderanlage_AttributeGroup schloss_Sonderanlage_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Sonderanlage_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_Ssp_AttributeGroup(Schloss_Ssp_AttributeGroup schloss_Ssp_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_Ssp_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchloss_W_AttributeGroup(Schloss_W_AttributeGroup schloss_W_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schloss_W_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchlosskombination(Schlosskombination schlosskombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schlosskombination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchlosskombination_Bezeichnung_AttributeGroup(Schlosskombination_Bezeichnung_AttributeGroup schlosskombination_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schlosskombination_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel(Schluessel schluessel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel_Allg_AttributeGroup(Schluessel_Allg_AttributeGroup schluessel_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel_Bartform_TypeClass(Schluessel_Bartform_TypeClass schluessel_Bartform_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel_Bartform_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel_Bezeichnung_AttributeGroup(Schluessel_Bezeichnung_AttributeGroup schluessel_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel_Gruppe_TypeClass(Schluessel_Gruppe_TypeClass schluessel_Gruppe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel_Gruppe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluessel_In_Grdst_Eingeschl_TypeClass(Schluessel_In_Grdst_Eingeschl_TypeClass schluessel_In_Grdst_Eingeschl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluessel_In_Grdst_Eingeschl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchluesselsperre(Schluesselsperre schluesselsperre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schluesselsperre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonderanlage_Lage_TypeClass(Sonderanlage_Lage_TypeClass sonderanlage_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sonderanlage_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnisch_Berechtigter_TypeClass(Technisch_Berechtigter_TypeClass technisch_Berechtigter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technisch_Berechtigter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerschluss_Ort_TypeClass(Verschluss_Ort_TypeClass verschluss_Ort_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verschluss_Ort_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Anbaulage_TypeClass(W_Anbaulage_TypeClass w_Anbaulage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Anbaulage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Lage_TypeClass(W_Lage_TypeClass w_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienungArt(ENUMBedienungArt enumBedienungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUELage(ENUMBUELage enumbueLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGspLage(ENUMGspLage enumGspLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchlossArt(ENUMSchlossArt enumSchlossArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchluesselBartform(ENUMSchluesselBartform enumSchluesselBartform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchluesselGruppe(ENUMSchluesselGruppe enumSchluesselGruppe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSonderanlageLage(ENUMSonderanlageLage enumSonderanlageLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerschlussOrt(ENUMVerschlussOrt enumVerschlussOrt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeschreibung_Sonderanlage_Type(String beschreibung_Sonderanlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBeschreibung_Sonderanlage_Type_Pattern(beschreibung_Sonderanlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBeschreibung_Sonderanlage_Type_Pattern
	 */
	public static final  PatternMatcher [][] BESCHREIBUNG_SONDERANLAGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Beschreibung Sonderanlage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeschreibung_Sonderanlage_Type_Pattern(String beschreibung_Sonderanlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SchluesselabhaengigkeitenPackage.Literals.BESCHREIBUNG_SONDERANLAGE_TYPE, beschreibung_Sonderanlage_Type, BESCHREIBUNG_SONDERANLAGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schloss_Type(String bezeichnung_Schloss_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Schloss_Type_Pattern(bezeichnung_Schloss_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Schloss_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_SCHLOSS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Schloss Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schloss_Type_Pattern(String bezeichnung_Schloss_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SchluesselabhaengigkeitenPackage.Literals.BEZEICHNUNG_SCHLOSS_TYPE, bezeichnung_Schloss_Type, BEZEICHNUNG_SCHLOSS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schluessel_Type(String bezeichnung_Schluessel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Schluessel_Type_Pattern(bezeichnung_Schluessel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Schluessel_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_SCHLUESSEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Schluessel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Schluessel_Type_Pattern(String bezeichnung_Schluessel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SchluesselabhaengigkeitenPackage.Literals.BEZEICHNUNG_SCHLUESSEL_TYPE, bezeichnung_Schluessel_Type, BEZEICHNUNG_SCHLUESSEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Sk_Type(String bezeichnung_Sk_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bezeichnung_Sk_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienungArtObject(ENUMBedienungArt enumBedienungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUELageObject(ENUMBUELage enumbueLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGspLageObject(ENUMGspLage enumGspLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchlossArtObject(ENUMSchlossArt enumSchlossArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchluesselBartformObject(ENUMSchluesselBartform enumSchluesselBartformObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchluesselGruppeObject(ENUMSchluesselGruppe enumSchluesselGruppeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSonderanlageLageObject(ENUMSonderanlageLage enumSonderanlageLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerschlussOrtObject(ENUMVerschlussOrt enumVerschlussOrtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Anbaulage_Type(ENUMLinksRechts w_Anbaulage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Lage_Type(ENUMLinksRechts w_Lage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //SchluesselabhaengigkeitenValidator
