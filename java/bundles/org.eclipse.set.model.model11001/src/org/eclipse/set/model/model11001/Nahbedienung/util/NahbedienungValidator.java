/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model11001.Nahbedienung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage
 * @generated
 */
public class NahbedienungValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NahbedienungValidator INSTANCE = new NahbedienungValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.Nahbedienung";

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
	public NahbedienungValidator() {
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
	  return NahbedienungPackage.eINSTANCE;
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
			case NahbedienungPackage.AWU_TYPE_CLASS:
				return validateAWU_TypeClass((AWU_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE_CLASS:
				return validateBezeichnung_NB_TypeClass((Bezeichnung_NB_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE_CLASS:
				return validateBezeichnung_NB_Zone_TypeClass((Bezeichnung_NB_Zone_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.FST_ZTYPE_CLASS:
				return validateF_ST_Z_TypeClass((F_ST_Z_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.FA_FAE_TYPE_CLASS:
				return validateFA_FAE_TypeClass((FA_FAE_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.FREIE_STELLBARKEIT_TYPE_CLASS:
				return validateFreie_Stellbarkeit_TypeClass((Freie_Stellbarkeit_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.KENNZAHL_TYPE_CLASS:
				return validateKennzahl_TypeClass((Kennzahl_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB:
				return validateNB((NB)value, diagnostics, context);
			case NahbedienungPackage.NB_ART_TYPE_CLASS:
				return validateNB_Art_TypeClass((NB_Art_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT:
				return validateNB_Bedien_Anzeige_Element((NB_Bedien_Anzeige_Element)value, diagnostics, context);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP:
				return validateNB_Bedien_Anzeige_Funktionen_AttributeGroup((NB_Bedien_Anzeige_Funktionen_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateNB_Bezeichnung_AttributeGroup((NB_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP:
				return validateNB_Funktionalitaet_NB_R_AttributeGroup((NB_Funktionalitaet_NB_R_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_GRENZE_ART_TYPE_CLASS:
				return validateNB_Grenze_Art_TypeClass((NB_Grenze_Art_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS:
				return validateNB_Rueckgabevoraussetzung_TypeClass((NB_Rueckgabevoraussetzung_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB_VERHAELTNIS_BESONDERS_TYPE_CLASS:
				return validateNB_Verhaeltnis_Besonders_TypeClass((NB_Verhaeltnis_Besonders_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE:
				return validateNB_Zone((NB_Zone)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP:
				return validateNB_Zone_Allg_AttributeGroup((NB_Zone_Allg_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE_CLASS:
				return validateNB_Zone_Allg_TypeClass((NB_Zone_Allg_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateNB_Zone_Bezeichnung_AttributeGroup((NB_Zone_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_ELEMENT:
				return validateNB_Zone_Element((NB_Zone_Element)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateNB_Zone_Element_Allg_AttributeGroup((NB_Zone_Element_Allg_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_GRENZE:
				return validateNB_Zone_Grenze((NB_Zone_Grenze)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP:
				return validateNB_Zone_Reihenfolgezwang_AttributeGroup((NB_Zone_Reihenfolgezwang_AttributeGroup)value, diagnostics, context);
			case NahbedienungPackage.RANG_TYPE_CLASS:
				return validateRang_TypeClass((Rang_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.SBUE_TYPE_CLASS:
				return validateSBUE_TypeClass((SBUE_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.SLE_SLS_TYPE_CLASS:
				return validateSLE_SLS_TypeClass((SLE_SLS_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.TASTE_ANF_TYPE_CLASS:
				return validateTaste_ANF_TypeClass((Taste_ANF_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.TASTE_FGT_TYPE_CLASS:
				return validateTaste_FGT_TypeClass((Taste_FGT_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.TASTE_WGT_TYPE_CLASS:
				return validateTaste_WGT_TypeClass((Taste_WGT_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.WGSP_LAGE_TYPE_CLASS:
				return validateW_Gsp_Lage_TypeClass((W_Gsp_Lage_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.WHU_TYPE_CLASS:
				return validateWHU_TypeClass((WHU_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.WUS_TYPE_CLASS:
				return validateWUS_TypeClass((WUS_TypeClass)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_ART:
				return validateENUMNBArt((ENUMNBArt)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_GRENZE_ART:
				return validateENUMNBGrenzeArt((ENUMNBGrenzeArt)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG:
				return validateENUMNBRueckgabevoraussetzung((ENUMNBRueckgabevoraussetzung)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS:
				return validateENUMNBVerhaeltnisBesonders((ENUMNBVerhaeltnisBesonders)value, diagnostics, context);
			case NahbedienungPackage.ENUMW_GSP_LAGE:
				return validateENUMWGspLage((ENUMWGspLage)value, diagnostics, context);
			case NahbedienungPackage.BEZEICHNUNG_NB_TYPE:
				return validateBezeichnung_NB_Type((BigInteger)value, diagnostics, context);
			case NahbedienungPackage.BEZEICHNUNG_NB_ZONE_TYPE:
				return validateBezeichnung_NB_Zone_Type((BigInteger)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_ART_OBJECT:
				return validateENUMNBArtObject((ENUMNBArt)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_GRENZE_ART_OBJECT:
				return validateENUMNBGrenzeArtObject((ENUMNBGrenzeArt)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT:
				return validateENUMNBRueckgabevoraussetzungObject((ENUMNBRueckgabevoraussetzung)value, diagnostics, context);
			case NahbedienungPackage.ENUMNB_VERHAELTNIS_BESONDERS_OBJECT:
				return validateENUMNBVerhaeltnisBesondersObject((ENUMNBVerhaeltnisBesonders)value, diagnostics, context);
			case NahbedienungPackage.ENUMW_GSP_LAGE_OBJECT:
				return validateENUMWGspLageObject((ENUMWGspLage)value, diagnostics, context);
			case NahbedienungPackage.NB_ZONE_ALLG_TYPE:
				return validateNB_Zone_Allg_Type((BigInteger)value, diagnostics, context);
			case NahbedienungPackage.RANG_TYPE:
				return validateRang_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAWU_TypeClass(AWU_TypeClass awU_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(awU_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_TypeClass(Bezeichnung_NB_TypeClass bezeichnung_NB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_NB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_Zone_TypeClass(Bezeichnung_NB_Zone_TypeClass bezeichnung_NB_Zone_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_NB_Zone_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF_ST_Z_TypeClass(F_ST_Z_TypeClass f_ST_Z_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(f_ST_Z_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFA_FAE_TypeClass(FA_FAE_TypeClass fA_FAE_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fA_FAE_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreie_Stellbarkeit_TypeClass(Freie_Stellbarkeit_TypeClass freie_Stellbarkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freie_Stellbarkeit_TypeClass, diagnostics, context);
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
	public boolean validateNB(NB nb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Art_TypeClass(NB_Art_TypeClass nB_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Bedien_Anzeige_Element(NB_Bedien_Anzeige_Element nB_Bedien_Anzeige_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Bedien_Anzeige_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Bedien_Anzeige_Funktionen_AttributeGroup(NB_Bedien_Anzeige_Funktionen_AttributeGroup nB_Bedien_Anzeige_Funktionen_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Bedien_Anzeige_Funktionen_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Bezeichnung_AttributeGroup(NB_Bezeichnung_AttributeGroup nB_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Funktionalitaet_NB_R_AttributeGroup(NB_Funktionalitaet_NB_R_AttributeGroup nB_Funktionalitaet_NB_R_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Funktionalitaet_NB_R_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Grenze_Art_TypeClass(NB_Grenze_Art_TypeClass nB_Grenze_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Grenze_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Rueckgabevoraussetzung_TypeClass(NB_Rueckgabevoraussetzung_TypeClass nB_Rueckgabevoraussetzung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Rueckgabevoraussetzung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Verhaeltnis_Besonders_TypeClass(NB_Verhaeltnis_Besonders_TypeClass nB_Verhaeltnis_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Verhaeltnis_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone(NB_Zone nB_Zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Allg_AttributeGroup(NB_Zone_Allg_AttributeGroup nB_Zone_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Allg_TypeClass(NB_Zone_Allg_TypeClass nB_Zone_Allg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Allg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Bezeichnung_AttributeGroup(NB_Zone_Bezeichnung_AttributeGroup nB_Zone_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Element(NB_Zone_Element nB_Zone_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Element_Allg_AttributeGroup(NB_Zone_Element_Allg_AttributeGroup nB_Zone_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Grenze(NB_Zone_Grenze nB_Zone_Grenze, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Grenze, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Reihenfolgezwang_AttributeGroup(NB_Zone_Reihenfolgezwang_AttributeGroup nB_Zone_Reihenfolgezwang_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nB_Zone_Reihenfolgezwang_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRang_TypeClass(Rang_TypeClass rang_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rang_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSBUE_TypeClass(SBUE_TypeClass sbuE_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbuE_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLE_SLS_TypeClass(SLE_SLS_TypeClass slE_SLS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slE_SLS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaste_ANF_TypeClass(Taste_ANF_TypeClass taste_ANF_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taste_ANF_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaste_FGT_TypeClass(Taste_FGT_TypeClass taste_FGT_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taste_FGT_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaste_WGT_TypeClass(Taste_WGT_TypeClass taste_WGT_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taste_WGT_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Gsp_Lage_TypeClass(W_Gsp_Lage_TypeClass w_Gsp_Lage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Gsp_Lage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWHU_TypeClass(WHU_TypeClass whU_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whU_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWUS_TypeClass(WUS_TypeClass wuS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wuS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBArt(ENUMNBArt enumnbArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBGrenzeArt(ENUMNBGrenzeArt enumnbGrenzeArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBRueckgabevoraussetzung(ENUMNBRueckgabevoraussetzung enumnbRueckgabevoraussetzung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBVerhaeltnisBesonders(ENUMNBVerhaeltnisBesonders enumnbVerhaeltnisBesonders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWGspLage(ENUMWGspLage enumwGspLage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_Type(BigInteger bezeichnung_NB_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_NB_Type_Pattern(bezeichnung_NB_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_NB_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_NB_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung NB Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_Type_Pattern(BigInteger bezeichnung_NB_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(NahbedienungPackage.Literals.BEZEICHNUNG_NB_TYPE, bezeichnung_NB_Type, BEZEICHNUNG_NB_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_Zone_Type(BigInteger bezeichnung_NB_Zone_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_NB_Zone_Type_Pattern(bezeichnung_NB_Zone_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_NB_Zone_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_NB_ZONE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung NB Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_NB_Zone_Type_Pattern(BigInteger bezeichnung_NB_Zone_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(NahbedienungPackage.Literals.BEZEICHNUNG_NB_ZONE_TYPE, bezeichnung_NB_Zone_Type, BEZEICHNUNG_NB_ZONE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBArtObject(ENUMNBArt enumnbArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBGrenzeArtObject(ENUMNBGrenzeArt enumnbGrenzeArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBRueckgabevoraussetzungObject(ENUMNBRueckgabevoraussetzung enumnbRueckgabevoraussetzungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNBVerhaeltnisBesondersObject(ENUMNBVerhaeltnisBesonders enumnbVerhaeltnisBesondersObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWGspLageObject(ENUMWGspLage enumwGspLageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Allg_Type(BigInteger nB_Zone_Allg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNB_Zone_Allg_Type_Pattern(nB_Zone_Allg_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNB_Zone_Allg_Type_Pattern
	 */
	public static final  PatternMatcher [][] NB_ZONE_ALLG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>NB Zone Allg Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNB_Zone_Allg_Type_Pattern(BigInteger nB_Zone_Allg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(NahbedienungPackage.Literals.NB_ZONE_ALLG_TYPE, nB_Zone_Allg_Type, NB_ZONE_ALLG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRang_Type(BigInteger rang_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRang_Type_Pattern(rang_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRang_Type_Pattern
	 */
	public static final  PatternMatcher [][] RANG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Rang Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRang_Type_Pattern(BigInteger rang_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(NahbedienungPackage.Literals.RANG_TYPE, rang_Type, RANG_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //NahbedienungValidator
