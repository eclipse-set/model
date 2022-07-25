/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model1902.Ansteuerung_Element.*;

import org.eclipse.set.model.model1902.BasisTypen.util.BasisTypenValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage
 * @generated
 */
public class Ansteuerung_ElementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Ansteuerung_ElementValidator INSTANCE = new Ansteuerung_ElementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model1902.Ansteuerung_Element";

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
	public Ansteuerung_ElementValidator() {
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
	  return Ansteuerung_ElementPackage.eINSTANCE;
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
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP:
				return validateAEA_Allg_AttributeGroup((AEA_Allg_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP:
				return validateAEA_Energieversorgung_AttributeGroup((AEA_Energieversorgung_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP:
				return validateAEA_GFK_IP_Adressblock_AttributeGroup((AEA_GFK_IP_Adressblock_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG:
				return validateAussenelementansteuerung((Aussenelementansteuerung)value, diagnostics, context);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_ART_TYPE_CLASS:
				return validateAussenelementansteuerung_Art_TypeClass((Aussenelementansteuerung_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateAussenelementansteuerung_Bezeichnung_AttributeGroup((Aussenelementansteuerung_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BANDBREITE_TYPE_CLASS:
				return validateBandbreite_TypeClass((Bandbreite_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS:
				return validateBauart_TypeClass((Bauart_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE_CLASS:
				return validateBezeichnung_AEA_TypeClass((Bezeichnung_AEA_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE_CLASS:
				return validateBezeichnung_ESTW_ZE_TypeClass((Bezeichnung_ESTW_ZE_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE_CLASS:
				return validateBezeichnung_TSO_TypeClass((Bezeichnung_TSO_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_ERSATZ_TYPE_CLASS:
				return validateEnergieversorgung_Art_Ersatz_TypeClass((Energieversorgung_Art_Ersatz_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_TYPE_CLASS:
				return validateEnergieversorgung_Art_TypeClass((Energieversorgung_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT:
				return validateESTW_Zentraleinheit((ESTW_Zentraleinheit)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP:
				return validateESTW_Zentraleinheit_Allg_AttributeGroup((ESTW_Zentraleinheit_Allg_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateESTW_Zentraleinheit_Bezeichnung_AttributeGroup((ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.GFK_KATEGORIE_TYPE_CLASS:
				return validateGFK_Kategorie_TypeClass((GFK_Kategorie_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.HERSTELLER_TYPE_CLASS:
				return validateHersteller_TypeClass((Hersteller_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS:
				return validateIP_Adressblock_Blau_TypeClass((IP_Adressblock_Blau_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS:
				return validateIP_Adressblock_Blau_V4_TypeClass((IP_Adressblock_Blau_V4_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS:
				return validateIP_Adressblock_Blau_V6_TypeClass((IP_Adressblock_Blau_V6_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS:
				return validateIP_Adressblock_Grau_TypeClass((IP_Adressblock_Grau_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS:
				return validateIP_Adressblock_Grau_V4_TypeClass((IP_Adressblock_Grau_V4_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS:
				return validateIP_Adressblock_Grau_V6_TypeClass((IP_Adressblock_Grau_V6_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.MEDIUM_ART_TYPE_CLASS:
				return validateMedium_Art_TypeClass((Medium_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.NETZ_ART_TYPE_CLASS:
				return validateNetz_Art_TypeClass((Netz_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.REGIONALBEREICH_TYPE_CLASS:
				return validateRegionalbereich_TypeClass((Regionalbereich_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE_CLASS:
				return validateStandort_Beschreibung_TypeClass((Standort_Beschreibung_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.STELL_BEREICH:
				return validateStell_Bereich((Stell_Bereich)value, diagnostics, context);
			case Ansteuerung_ElementPackage.STELLELEMENT:
				return validateStellelement((Stellelement)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TECHNIK_ART_TYPE_CLASS:
				return validateTechnik_Art_TypeClass((Technik_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE_CLASS:
				return validateTechnik_Beschreibung_TypeClass((Technik_Beschreibung_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT:
				return validateTechnik_Standort((Technik_Standort)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateTechnik_Standort_Bezeichnung_AttributeGroup((Technik_Standort_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP:
				return validateTSO_IP_AB_Teilsystem_AttributeGroup((TSO_IP_AB_Teilsystem_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP:
				return validateTSO_IP_Adressblock_AttributeGroup((TSO_IP_Adressblock_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TSO_TEILSYSTEM_ART_TYPE_CLASS:
				return validateTSO_Teilsystem_Art_TypeClass((TSO_Teilsystem_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG:
				return validateUebertragungsweg((Uebertragungsweg)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_ART_TYPE_CLASS:
				return validateUebertragungsweg_Art_TypeClass((Uebertragungsweg_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP:
				return validateUebertragungsweg_Technik_AttributeGroup((Uebertragungsweg_Technik_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG:
				return validateUnterbringung((Unterbringung)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP:
				return validateUnterbringung_Allg_AttributeGroup((Unterbringung_Allg_AttributeGroup)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ART_TYPE_CLASS:
				return validateUnterbringung_Art_TypeClass((Unterbringung_Art_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_BEFESTIGUNG_TYPE_CLASS:
				return validateUnterbringung_Befestigung_TypeClass((Unterbringung_Befestigung_TypeClass)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART:
				return validateENUMAussenelementansteuerungArt((ENUMAussenelementansteuerungArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE:
				return validateENUMBandbreite((ENUMBandbreite)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMEV_ART:
				return validateENUMEVArt((ENUMEVArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE:
				return validateENUMGFKKategorie((ENUMGFKKategorie)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART:
				return validateENUMMediumArt((ENUMMediumArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART:
				return validateENUMNetzArt((ENUMNetzArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART:
				return validateENUMTechnikArt((ENUMTechnikArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART:
				return validateENUMTSOTeilsystemArt((ENUMTSOTeilsystemArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART:
				return validateENUMUebertragungswegArt((ENUMUebertragungswegArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART:
				return validateENUMUnterbringungArt((ENUMUnterbringungArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG:
				return validateENUMUnterbringungBefestigung((ENUMUnterbringungBefestigung)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BAUART_TYPE:
				return validateBauart_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE:
				return validateBezeichnung_AEA_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE:
				return validateBezeichnung_ESTW_ZE_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE:
				return validateBezeichnung_TSO_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJECT:
				return validateENUMAussenelementansteuerungArtObject((ENUMAussenelementansteuerungArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE_OBJECT:
				return validateENUMBandbreiteObject((ENUMBandbreite)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMEV_ART_OBJECT:
				return validateENUMEVArtObject((ENUMEVArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE_OBJECT:
				return validateENUMGFKKategorieObject((ENUMGFKKategorie)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART_OBJECT:
				return validateENUMMediumArtObject((ENUMMediumArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART_OBJECT:
				return validateENUMNetzArtObject((ENUMNetzArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART_OBJECT:
				return validateENUMTechnikArtObject((ENUMTechnikArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART_OBJECT:
				return validateENUMTSOTeilsystemArtObject((ENUMTSOTeilsystemArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART_OBJECT:
				return validateENUMUebertragungswegArtObject((ENUMUebertragungswegArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART_OBJECT:
				return validateENUMUnterbringungArtObject((ENUMUnterbringungArt)value, diagnostics, context);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG_OBJECT:
				return validateENUMUnterbringungBefestigungObject((ENUMUnterbringungBefestigung)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return validateIP_Adressblock_Blau_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return validateIP_Adressblock_Blau_V4_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return validateIP_Adressblock_Blau_V6_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return validateIP_Adressblock_Grau_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return validateIP_Adressblock_Grau_V4_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return validateIP_Adressblock_Grau_V6_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE:
				return validateStandort_Beschreibung_Type((String)value, diagnostics, context);
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE:
				return validateTechnik_Beschreibung_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAEA_Allg_AttributeGroup(AEA_Allg_AttributeGroup aeA_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeA_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAEA_Energieversorgung_AttributeGroup(AEA_Energieversorgung_AttributeGroup aeA_Energieversorgung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeA_Energieversorgung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAEA_GFK_IP_Adressblock_AttributeGroup(AEA_GFK_IP_Adressblock_AttributeGroup aeA_GFK_IP_Adressblock_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeA_GFK_IP_Adressblock_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussenelementansteuerung(Aussenelementansteuerung aussenelementansteuerung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussenelementansteuerung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussenelementansteuerung_Art_TypeClass(Aussenelementansteuerung_Art_TypeClass aussenelementansteuerung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussenelementansteuerung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAussenelementansteuerung_Bezeichnung_AttributeGroup(Aussenelementansteuerung_Bezeichnung_AttributeGroup aussenelementansteuerung_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aussenelementansteuerung_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandbreite_TypeClass(Bandbreite_TypeClass bandbreite_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bandbreite_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauart_TypeClass(Bauart_TypeClass bauart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bauart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_AEA_TypeClass(Bezeichnung_AEA_TypeClass bezeichnung_AEA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_AEA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ESTW_ZE_TypeClass(Bezeichnung_ESTW_ZE_TypeClass bezeichnung_ESTW_ZE_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_ESTW_ZE_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_TSO_TypeClass(Bezeichnung_TSO_TypeClass bezeichnung_TSO_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_TSO_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergieversorgung_Art_Ersatz_TypeClass(Energieversorgung_Art_Ersatz_TypeClass energieversorgung_Art_Ersatz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energieversorgung_Art_Ersatz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergieversorgung_Art_TypeClass(Energieversorgung_Art_TypeClass energieversorgung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energieversorgung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESTW_Zentraleinheit(ESTW_Zentraleinheit estW_Zentraleinheit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(estW_Zentraleinheit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESTW_Zentraleinheit_Allg_AttributeGroup(ESTW_Zentraleinheit_Allg_AttributeGroup estW_Zentraleinheit_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(estW_Zentraleinheit_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESTW_Zentraleinheit_Bezeichnung_AttributeGroup(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup estW_Zentraleinheit_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(estW_Zentraleinheit_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFK_Kategorie_TypeClass(GFK_Kategorie_TypeClass gfK_Kategorie_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfK_Kategorie_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHersteller_TypeClass(Hersteller_TypeClass hersteller_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hersteller_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_TypeClass(IP_Adressblock_Blau_TypeClass iP_Adressblock_Blau_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V4_TypeClass(IP_Adressblock_Blau_V4_TypeClass iP_Adressblock_Blau_V4_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_V4_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V6_TypeClass(IP_Adressblock_Blau_V6_TypeClass iP_Adressblock_Blau_V6_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_V6_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_TypeClass(IP_Adressblock_Grau_TypeClass iP_Adressblock_Grau_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V4_TypeClass(IP_Adressblock_Grau_V4_TypeClass iP_Adressblock_Grau_V4_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_V4_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V6_TypeClass(IP_Adressblock_Grau_V6_TypeClass iP_Adressblock_Grau_V6_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_V6_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedium_Art_TypeClass(Medium_Art_TypeClass medium_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medium_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetz_Art_TypeClass(Netz_Art_TypeClass netz_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(netz_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalbereich_TypeClass(Regionalbereich_TypeClass regionalbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandort_Beschreibung_TypeClass(Standort_Beschreibung_TypeClass standort_Beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standort_Beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStell_Bereich(Stell_Bereich stell_Bereich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stell_Bereich, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStellelement(Stellelement stellelement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stellelement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnik_Art_TypeClass(Technik_Art_TypeClass technik_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technik_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnik_Beschreibung_TypeClass(Technik_Beschreibung_TypeClass technik_Beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technik_Beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnik_Standort(Technik_Standort technik_Standort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technik_Standort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnik_Standort_Bezeichnung_AttributeGroup(Technik_Standort_Bezeichnung_AttributeGroup technik_Standort_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technik_Standort_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSO_IP_AB_Teilsystem_AttributeGroup(TSO_IP_AB_Teilsystem_AttributeGroup tsO_IP_AB_Teilsystem_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsO_IP_AB_Teilsystem_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSO_IP_Adressblock_AttributeGroup(TSO_IP_Adressblock_AttributeGroup tsO_IP_Adressblock_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsO_IP_Adressblock_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSO_Teilsystem_Art_TypeClass(TSO_Teilsystem_Art_TypeClass tsO_Teilsystem_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsO_Teilsystem_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragungsweg(Uebertragungsweg uebertragungsweg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uebertragungsweg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragungsweg_Art_TypeClass(Uebertragungsweg_Art_TypeClass uebertragungsweg_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uebertragungsweg_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragungsweg_Technik_AttributeGroup(Uebertragungsweg_Technik_AttributeGroup uebertragungsweg_Technik_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uebertragungsweg_Technik_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterbringung(Unterbringung unterbringung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterbringung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterbringung_Allg_AttributeGroup(Unterbringung_Allg_AttributeGroup unterbringung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterbringung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterbringung_Art_TypeClass(Unterbringung_Art_TypeClass unterbringung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterbringung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterbringung_Befestigung_TypeClass(Unterbringung_Befestigung_TypeClass unterbringung_Befestigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterbringung_Befestigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAussenelementansteuerungArt(ENUMAussenelementansteuerungArt enumAussenelementansteuerungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBandbreite(ENUMBandbreite enumBandbreite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEVArt(ENUMEVArt enumevArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGFKKategorie(ENUMGFKKategorie enumgfkKategorie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMediumArt(ENUMMediumArt enumMediumArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNetzArt(ENUMNetzArt enumNetzArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTechnikArt(ENUMTechnikArt enumTechnikArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTSOTeilsystemArt(ENUMTSOTeilsystemArt enumtsoTeilsystemArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUebertragungswegArt(ENUMUebertragungswegArt enumUebertragungswegArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUnterbringungArt(ENUMUnterbringungArt enumUnterbringungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUnterbringungBefestigung(ENUMUnterbringungBefestigung enumUnterbringungBefestigung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBauart_Type(String bauart_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bauart_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_AEA_Type(String bezeichnung_AEA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_AEA_Type_Pattern(bezeichnung_AEA_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_AEA_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_AEA_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung AEA Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_AEA_Type_Pattern(String bezeichnung_AEA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Ansteuerung_ElementPackage.Literals.BEZEICHNUNG_AEA_TYPE, bezeichnung_AEA_Type, BEZEICHNUNG_AEA_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ESTW_ZE_Type(String bezeichnung_ESTW_ZE_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_ESTW_ZE_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_TSO_Type(String bezeichnung_TSO_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_TSO_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAussenelementansteuerungArtObject(ENUMAussenelementansteuerungArt enumAussenelementansteuerungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBandbreiteObject(ENUMBandbreite enumBandbreiteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEVArtObject(ENUMEVArt enumevArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGFKKategorieObject(ENUMGFKKategorie enumgfkKategorieObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMediumArtObject(ENUMMediumArt enumMediumArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNetzArtObject(ENUMNetzArt enumNetzArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTechnikArtObject(ENUMTechnikArt enumTechnikArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTSOTeilsystemArtObject(ENUMTSOTeilsystemArt enumtsoTeilsystemArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUebertragungswegArtObject(ENUMUebertragungswegArt enumUebertragungswegArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUnterbringungArtObject(ENUMUnterbringungArt enumUnterbringungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUnterbringungBefestigungObject(ENUMUnterbringungBefestigung enumUnterbringungBefestigungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_Type(String iP_Adressblock_Blau_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V4_Type(String iP_Adressblock_Blau_V4_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_V4_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V6_Type(String iP_Adressblock_Blau_V6_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_V6_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_Type(String iP_Adressblock_Grau_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V4_Type(String iP_Adressblock_Grau_V4_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_V4_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V6_Type(String iP_Adressblock_Grau_V6_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_V6_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandort_Beschreibung_Type(String standort_Beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(standort_Beschreibung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnik_Beschreibung_Type(String technik_Beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(technik_Beschreibung_Type, diagnostics, context);
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

} //Ansteuerung_ElementValidator
