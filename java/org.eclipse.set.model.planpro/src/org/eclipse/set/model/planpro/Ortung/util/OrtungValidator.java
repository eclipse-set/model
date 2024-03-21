/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.util;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Ortung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Ortung.OrtungPackage
 * @generated
 */
public class OrtungValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrtungValidator INSTANCE = new OrtungValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Ortung";

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
	public OrtungValidator() {
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
	  return OrtungPackage.eINSTANCE;
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
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE_CLASS:
				return validateBettungswiderstand_TypeClass((Bettungswiderstand_TypeClass)value, diagnostics, context);
			case OrtungPackage.BEZEICHNUNG_KENNBUCHSTABE_TYPE_CLASS:
				return validateBezeichnung_Kennbuchstabe_TypeClass((Bezeichnung_Kennbuchstabe_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE:
				return validateFMA_Anlage((FMA_Anlage)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateFMA_Anlage_Allg_AttributeGroup((FMA_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateFMA_Anlage_Bezeichnung_AttributeGroup((FMA_Anlage_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE_ELEKTR_MERKMALE_ATTRIBUTE_GROUP:
				return validateFMA_Anlage_Elektr_Merkmale_AttributeGroup((FMA_Anlage_Elektr_Merkmale_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP:
				return validateFMA_Anlage_Kaskade_AttributeGroup((FMA_Anlage_Kaskade_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP:
				return validateFMA_Anlage_Uebertragung_FMinfo_AttributeGroup((FMA_Anlage_Uebertragung_FMinfo_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE_CLASS:
				return validateFMA_Anschluss_Bezeichnung_TypeClass((FMA_Anschluss_Bezeichnung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ANSCHLUSS_SPEISERICHTUNG_TYPE_CLASS:
				return validateFMA_Anschluss_Speiserichtung_TypeClass((FMA_Anschluss_Speiserichtung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ART_TYPE_CLASS:
				return validateFMA_Art_TypeClass((FMA_Art_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT:
				return validateFMA_Element((FMA_Element)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateFMA_Element_Allg_AttributeGroup((FMA_Element_Allg_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP:
				return validateFMA_Element_Anschluss_AttributeGroup((FMA_Element_Anschluss_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_ART_TYPE_CLASS:
				return validateFMA_Element_Art_TypeClass((FMA_Element_Art_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_SEILANZAHL_TYPE_CLASS:
				return validateFMA_Element_Seilanzahl_TypeClass((FMA_Element_Seilanzahl_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE_CLASS:
				return validateFMA_Element_Seiltyp_TypeClass((FMA_Element_Seiltyp_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_HILFFREIMELDUNG_TYPE_CLASS:
				return validateFMA_Hilffreimeldung_TypeClass((FMA_Hilffreimeldung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_ISOLIERUNG_TYPE_CLASS:
				return validateFMA_Isolierung_TypeClass((FMA_Isolierung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE_CLASS:
				return validateFMA_Kaskade_Bezeichnung_TypeClass((FMA_Kaskade_Bezeichnung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KASKADE_EINZELAUSWERTUNG_TYPE_CLASS:
				return validateFMA_Kaskade_Einzelauswertung_TypeClass((FMA_Kaskade_Einzelauswertung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE:
				return validateFMA_Komponente((FMA_Komponente)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP:
				return validateFMA_Komponente_Achszaehlpunkt_AttributeGroup((FMA_Komponente_Achszaehlpunkt_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_ART_TYPE_CLASS:
				return validateFMA_Komponente_Art_TypeClass((FMA_Komponente_Art_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_SCHIENENPROFIL_TYPE_CLASS:
				return validateFMA_Komponente_Schienenprofil_TypeClass((FMA_Komponente_Schienenprofil_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_STROMVERSORGUNG_TYPE_CLASS:
				return validateFMA_Komponente_Stromversorgung_TypeClass((FMA_Komponente_Stromversorgung_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE_CLASS:
				return validateFMA_Komponente_Typ_TypeClass((FMA_Komponente_Typ_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE_CLASS:
				return validateFMA_Laenge_Beeinflusst_TypeClass((FMA_Laenge_Beeinflusst_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E1_TYPE_CLASS:
				return validateFMA_Laenge_E1_TypeClass((FMA_Laenge_E1_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E2_TYPE_CLASS:
				return validateFMA_Laenge_E2_TypeClass((FMA_Laenge_E2_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E3_TYPE_CLASS:
				return validateFMA_Laenge_E3_TypeClass((FMA_Laenge_E3_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_STYPE_CLASS:
				return validateFMA_Laenge_S_TypeClass((FMA_Laenge_S_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_TYPE_CLASS:
				return validateFMA_Laenge_TypeClass((FMA_Laenge_TypeClass)value, diagnostics, context);
			case OrtungPackage.FMA_TYP_TYPE_CLASS:
				return validateFMA_Typ_TypeClass((FMA_Typ_TypeClass)value, diagnostics, context);
			case OrtungPackage.SCHALTMITTEL_FUNKTION_TYPE_CLASS:
				return validateSchaltmittel_Funktion_TypeClass((Schaltmittel_Funktion_TypeClass)value, diagnostics, context);
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG:
				return validateSchaltmittel_Zuordnung((Schaltmittel_Zuordnung)value, diagnostics, context);
			case OrtungPackage.UEBERTRAGUNG_FMINFO_RICHTUNG_TYPE_CLASS:
				return validateUebertragung_FMinfo_Richtung_TypeClass((Uebertragung_FMinfo_Richtung_TypeClass)value, diagnostics, context);
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE_CLASS:
				return validateUebertragung_FMinfo_Typ_TypeClass((Uebertragung_FMinfo_Typ_TypeClass)value, diagnostics, context);
			case OrtungPackage.ZUGEINWIRKUNG:
				return validateZugeinwirkung((Zugeinwirkung)value, diagnostics, context);
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP:
				return validateZugeinwirkung_Allg_AttributeGroup((Zugeinwirkung_Allg_AttributeGroup)value, diagnostics, context);
			case OrtungPackage.ZUGEINWIRKUNG_ART_TYPE_CLASS:
				return validateZugeinwirkung_Art_TypeClass((Zugeinwirkung_Art_TypeClass)value, diagnostics, context);
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE_CLASS:
				return validateZugeinwirkung_Typ_TypeClass((Zugeinwirkung_Typ_TypeClass)value, diagnostics, context);
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE:
				return validateENUMBezeichnungKennbuchstabe((ENUMBezeichnungKennbuchstabe)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG:
				return validateENUMFMAAnschlussSpeiserichtung((ENUMFMAAnschlussSpeiserichtung)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ART:
				return validateENUMFMAArt((ENUMFMAArt)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ELEMENT_ART:
				return validateENUMFMAElementArt((ENUMFMAElementArt)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL:
				return validateENUMFMAElementSeilanzahl((ENUMFMAElementSeilanzahl)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART:
				return validateENUMFMAKomponenteArt((ENUMFMAKomponenteArt)value, diagnostics, context);
			case OrtungPackage.ENUM_ISOLIERUNG:
				return validateENUMIsolierung((ENUMIsolierung)value, diagnostics, context);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION:
				return validateENUMSchaltmittelFunktion((ENUMSchaltmittelFunktion)value, diagnostics, context);
			case OrtungPackage.ENUM_SCHIENENPROFIL:
				return validateENUMSchienenprofil((ENUMSchienenprofil)value, diagnostics, context);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG:
				return validateENUMUebertragungFMinfoRichtung((ENUMUebertragungFMinfoRichtung)value, diagnostics, context);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART:
				return validateENUMZugeinwirkungArt((ENUMZugeinwirkungArt)value, diagnostics, context);
			case OrtungPackage.BETTUNGSWIDERSTAND_TYPE:
				return validateBettungswiderstand_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.ENUM_BEZEICHNUNG_KENNBUCHSTABE_OBJECT:
				return validateENUMBezeichnungKennbuchstabeObject((ENUMBezeichnungKennbuchstabe)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ANSCHLUSS_SPEISERICHTUNG_OBJECT:
				return validateENUMFMAAnschlussSpeiserichtungObject((ENUMFMAAnschlussSpeiserichtung)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ART_OBJECT:
				return validateENUMFMAArtObject((ENUMFMAArt)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ELEMENT_ART_OBJECT:
				return validateENUMFMAElementArtObject((ENUMFMAElementArt)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_ELEMENT_SEILANZAHL_OBJECT:
				return validateENUMFMAElementSeilanzahlObject((ENUMFMAElementSeilanzahl)value, diagnostics, context);
			case OrtungPackage.ENUMFMA_KOMPONENTE_ART_OBJECT:
				return validateENUMFMAKomponenteArtObject((ENUMFMAKomponenteArt)value, diagnostics, context);
			case OrtungPackage.ENUM_ISOLIERUNG_OBJECT:
				return validateENUMIsolierungObject((ENUMIsolierung)value, diagnostics, context);
			case OrtungPackage.ENUM_SCHALTMITTEL_FUNKTION_OBJECT:
				return validateENUMSchaltmittelFunktionObject((ENUMSchaltmittelFunktion)value, diagnostics, context);
			case OrtungPackage.ENUM_SCHIENENPROFIL_OBJECT:
				return validateENUMSchienenprofilObject((ENUMSchienenprofil)value, diagnostics, context);
			case OrtungPackage.ENUM_UEBERTRAGUNG_FMINFO_RICHTUNG_OBJECT:
				return validateENUMUebertragungFMinfoRichtungObject((ENUMUebertragungFMinfoRichtung)value, diagnostics, context);
			case OrtungPackage.ENUM_ZUGEINWIRKUNG_ART_OBJECT:
				return validateENUMZugeinwirkungArtObject((ENUMZugeinwirkungArt)value, diagnostics, context);
			case OrtungPackage.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE:
				return validateFMA_Anschluss_Bezeichnung_Type((String)value, diagnostics, context);
			case OrtungPackage.FMA_ELEMENT_SEILTYP_TYPE:
				return validateFMA_Element_Seiltyp_Type((String)value, diagnostics, context);
			case OrtungPackage.FMA_KASKADE_BEZEICHNUNG_TYPE:
				return validateFMA_Kaskade_Bezeichnung_Type((String)value, diagnostics, context);
			case OrtungPackage.FMA_KOMPONENTE_TYP_TYPE:
				return validateFMA_Komponente_Typ_Type((String)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_BEEINFLUSST_TYPE:
				return validateFMA_Laenge_Beeinflusst_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E1_TYPE:
				return validateFMA_Laenge_E1_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E2_TYPE:
				return validateFMA_Laenge_E2_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_E3_TYPE:
				return validateFMA_Laenge_E3_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_STYPE:
				return validateFMA_Laenge_S_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_LAENGE_TYPE:
				return validateFMA_Laenge_Type((BigDecimal)value, diagnostics, context);
			case OrtungPackage.FMA_TYP_TYPE:
				return validateFMA_Typ_Type((String)value, diagnostics, context);
			case OrtungPackage.UEBERTRAGUNG_FMINFO_TYP_TYPE:
				return validateUebertragung_FMinfo_Typ_Type((String)value, diagnostics, context);
			case OrtungPackage.ZUGEINWIRKUNG_TYP_TYPE:
				return validateZugeinwirkung_Typ_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBettungswiderstand_TypeClass(Bettungswiderstand_TypeClass bettungswiderstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bettungswiderstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Kennbuchstabe_TypeClass(Bezeichnung_Kennbuchstabe_TypeClass bezeichnung_Kennbuchstabe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Kennbuchstabe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage(FMA_Anlage fmA_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage_Allg_AttributeGroup(FMA_Anlage_Allg_AttributeGroup fmA_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage_Bezeichnung_AttributeGroup(FMA_Anlage_Bezeichnung_AttributeGroup fmA_Anlage_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage_Elektr_Merkmale_AttributeGroup(FMA_Anlage_Elektr_Merkmale_AttributeGroup fmA_Anlage_Elektr_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage_Elektr_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage_Kaskade_AttributeGroup(FMA_Anlage_Kaskade_AttributeGroup fmA_Anlage_Kaskade_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage_Kaskade_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anlage_Uebertragung_FMinfo_AttributeGroup(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup fmA_Anlage_Uebertragung_FMinfo_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anlage_Uebertragung_FMinfo_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anschluss_Bezeichnung_TypeClass(FMA_Anschluss_Bezeichnung_TypeClass fmA_Anschluss_Bezeichnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anschluss_Bezeichnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anschluss_Speiserichtung_TypeClass(FMA_Anschluss_Speiserichtung_TypeClass fmA_Anschluss_Speiserichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Anschluss_Speiserichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Art_TypeClass(FMA_Art_TypeClass fmA_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element(FMA_Element fmA_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Allg_AttributeGroup(FMA_Element_Allg_AttributeGroup fmA_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Anschluss_AttributeGroup(FMA_Element_Anschluss_AttributeGroup fmA_Element_Anschluss_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element_Anschluss_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Art_TypeClass(FMA_Element_Art_TypeClass fmA_Element_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Seilanzahl_TypeClass(FMA_Element_Seilanzahl_TypeClass fmA_Element_Seilanzahl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element_Seilanzahl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Seiltyp_TypeClass(FMA_Element_Seiltyp_TypeClass fmA_Element_Seiltyp_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Element_Seiltyp_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Hilffreimeldung_TypeClass(FMA_Hilffreimeldung_TypeClass fmA_Hilffreimeldung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Hilffreimeldung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Isolierung_TypeClass(FMA_Isolierung_TypeClass fmA_Isolierung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Isolierung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Kaskade_Bezeichnung_TypeClass(FMA_Kaskade_Bezeichnung_TypeClass fmA_Kaskade_Bezeichnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Kaskade_Bezeichnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Kaskade_Einzelauswertung_TypeClass(FMA_Kaskade_Einzelauswertung_TypeClass fmA_Kaskade_Einzelauswertung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Kaskade_Einzelauswertung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente(FMA_Komponente fmA_Komponente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Achszaehlpunkt_AttributeGroup(FMA_Komponente_Achszaehlpunkt_AttributeGroup fmA_Komponente_Achszaehlpunkt_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente_Achszaehlpunkt_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Art_TypeClass(FMA_Komponente_Art_TypeClass fmA_Komponente_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Schienenprofil_TypeClass(FMA_Komponente_Schienenprofil_TypeClass fmA_Komponente_Schienenprofil_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente_Schienenprofil_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Stromversorgung_TypeClass(FMA_Komponente_Stromversorgung_TypeClass fmA_Komponente_Stromversorgung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente_Stromversorgung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Typ_TypeClass(FMA_Komponente_Typ_TypeClass fmA_Komponente_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Komponente_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_Beeinflusst_TypeClass(FMA_Laenge_Beeinflusst_TypeClass fmA_Laenge_Beeinflusst_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_Beeinflusst_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E1_TypeClass(FMA_Laenge_E1_TypeClass fmA_Laenge_E1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_E1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E2_TypeClass(FMA_Laenge_E2_TypeClass fmA_Laenge_E2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_E2_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E3_TypeClass(FMA_Laenge_E3_TypeClass fmA_Laenge_E3_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_E3_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_S_TypeClass(FMA_Laenge_S_TypeClass fmA_Laenge_S_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_S_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_TypeClass(FMA_Laenge_TypeClass fmA_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Typ_TypeClass(FMA_Typ_TypeClass fmA_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmA_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltmittel_Funktion_TypeClass(Schaltmittel_Funktion_TypeClass schaltmittel_Funktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schaltmittel_Funktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltmittel_Zuordnung(Schaltmittel_Zuordnung schaltmittel_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schaltmittel_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragung_FMinfo_Richtung_TypeClass(Uebertragung_FMinfo_Richtung_TypeClass uebertragung_FMinfo_Richtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uebertragung_FMinfo_Richtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragung_FMinfo_Typ_TypeClass(Uebertragung_FMinfo_Typ_TypeClass uebertragung_FMinfo_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uebertragung_FMinfo_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung(Zugeinwirkung zugeinwirkung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugeinwirkung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung_Allg_AttributeGroup(Zugeinwirkung_Allg_AttributeGroup zugeinwirkung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugeinwirkung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung_Art_TypeClass(Zugeinwirkung_Art_TypeClass zugeinwirkung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugeinwirkung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung_Typ_TypeClass(Zugeinwirkung_Typ_TypeClass zugeinwirkung_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugeinwirkung_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBezeichnungKennbuchstabe(ENUMBezeichnungKennbuchstabe enumBezeichnungKennbuchstabe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAAnschlussSpeiserichtung(ENUMFMAAnschlussSpeiserichtung enumfmaAnschlussSpeiserichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAArt(ENUMFMAArt enumfmaArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAElementArt(ENUMFMAElementArt enumfmaElementArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAElementSeilanzahl(ENUMFMAElementSeilanzahl enumfmaElementSeilanzahl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAKomponenteArt(ENUMFMAKomponenteArt enumfmaKomponenteArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMIsolierung(ENUMIsolierung enumIsolierung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchaltmittelFunktion(ENUMSchaltmittelFunktion enumSchaltmittelFunktion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchienenprofil(ENUMSchienenprofil enumSchienenprofil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUebertragungFMinfoRichtung(ENUMUebertragungFMinfoRichtung enumUebertragungFMinfoRichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZugeinwirkungArt(ENUMZugeinwirkungArt enumZugeinwirkungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBettungswiderstand_Type(BigDecimal bettungswiderstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBettungswiderstand_Type_Pattern(bettungswiderstand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBettungswiderstand_Type_Pattern
	 */
	public static final  PatternMatcher [][] BETTUNGSWIDERSTAND_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-4]\\.[0-9]{2})|(5\\.00)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bettungswiderstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBettungswiderstand_Type_Pattern(BigDecimal bettungswiderstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.BETTUNGSWIDERSTAND_TYPE, bettungswiderstand_Type, BETTUNGSWIDERSTAND_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBezeichnungKennbuchstabeObject(ENUMBezeichnungKennbuchstabe enumBezeichnungKennbuchstabeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAAnschlussSpeiserichtungObject(ENUMFMAAnschlussSpeiserichtung enumfmaAnschlussSpeiserichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAArtObject(ENUMFMAArt enumfmaArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAElementArtObject(ENUMFMAElementArt enumfmaElementArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAElementSeilanzahlObject(ENUMFMAElementSeilanzahl enumfmaElementSeilanzahlObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFMAKomponenteArtObject(ENUMFMAKomponenteArt enumfmaKomponenteArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMIsolierungObject(ENUMIsolierung enumIsolierungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchaltmittelFunktionObject(ENUMSchaltmittelFunktion enumSchaltmittelFunktionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchienenprofilObject(ENUMSchienenprofil enumSchienenprofilObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMUebertragungFMinfoRichtungObject(ENUMUebertragungFMinfoRichtung enumUebertragungFMinfoRichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZugeinwirkungArtObject(ENUMZugeinwirkungArt enumZugeinwirkungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anschluss_Bezeichnung_Type(String fmA_Anschluss_Bezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Anschluss_Bezeichnung_Type_Pattern(fmA_Anschluss_Bezeichnung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Anschluss_Bezeichnung_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_ANSCHLUSS_BEZEICHNUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{2,8}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Anschluss Bezeichnung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Anschluss_Bezeichnung_Type_Pattern(String fmA_Anschluss_Bezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_ANSCHLUSS_BEZEICHNUNG_TYPE, fmA_Anschluss_Bezeichnung_Type, FMA_ANSCHLUSS_BEZEICHNUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Seiltyp_Type(String fmA_Element_Seiltyp_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Element_Seiltyp_Type_Pattern(fmA_Element_Seiltyp_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Element_Seiltyp_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_ELEMENT_SEILTYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{2,6}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Element Seiltyp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Element_Seiltyp_Type_Pattern(String fmA_Element_Seiltyp_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_ELEMENT_SEILTYP_TYPE, fmA_Element_Seiltyp_Type, FMA_ELEMENT_SEILTYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Kaskade_Bezeichnung_Type(String fmA_Kaskade_Bezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Kaskade_Bezeichnung_Type_Pattern(fmA_Kaskade_Bezeichnung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Kaskade_Bezeichnung_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_KASKADE_BEZEICHNUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]|[A-Z]|(I)|(II)|(III)|(IV)|(V)|(VI)|(VII)|(VIII)|(IX)|(X)|(XI)|(XII)|(\\.[1-9])")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Kaskade Bezeichnung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Kaskade_Bezeichnung_Type_Pattern(String fmA_Kaskade_Bezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_KASKADE_BEZEICHNUNG_TYPE, fmA_Kaskade_Bezeichnung_Type, FMA_KASKADE_BEZEICHNUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Typ_Type(String fmA_Komponente_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Komponente_Typ_Type_Pattern(fmA_Komponente_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Komponente_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_KOMPONENTE_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Komponente Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Komponente_Typ_Type_Pattern(String fmA_Komponente_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_KOMPONENTE_TYP_TYPE, fmA_Komponente_Typ_Type, FMA_KOMPONENTE_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_Beeinflusst_Type(BigDecimal fmA_Laenge_Beeinflusst_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_Beeinflusst_Type_Pattern(fmA_Laenge_Beeinflusst_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_Beeinflusst_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_BEEINFLUSST_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge Beeinflusst Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_Beeinflusst_Type_Pattern(BigDecimal fmA_Laenge_Beeinflusst_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_BEEINFLUSST_TYPE, fmA_Laenge_Beeinflusst_Type, FMA_LAENGE_BEEINFLUSST_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E1_Type(BigDecimal fmA_Laenge_E1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_E1_Type_Pattern(fmA_Laenge_E1_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_E1_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_E1_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge E1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E1_Type_Pattern(BigDecimal fmA_Laenge_E1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_E1_TYPE, fmA_Laenge_E1_Type, FMA_LAENGE_E1_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E2_Type(BigDecimal fmA_Laenge_E2_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_E2_Type_Pattern(fmA_Laenge_E2_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_E2_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_E2_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge E2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E2_Type_Pattern(BigDecimal fmA_Laenge_E2_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_E2_TYPE, fmA_Laenge_E2_Type, FMA_LAENGE_E2_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E3_Type(BigDecimal fmA_Laenge_E3_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_E3_Type_Pattern(fmA_Laenge_E3_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_E3_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_E3_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge E3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_E3_Type_Pattern(BigDecimal fmA_Laenge_E3_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_E3_TYPE, fmA_Laenge_E3_Type, FMA_LAENGE_E3_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_S_Type(BigDecimal fmA_Laenge_S_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_S_Type_Pattern(fmA_Laenge_S_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_S_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_STYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge SType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_S_Type_Pattern(BigDecimal fmA_Laenge_S_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_STYPE, fmA_Laenge_S_Type, FMA_LAENGE_STYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_Type(BigDecimal fmA_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Laenge_Type_Pattern(fmA_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}|1[0-4][0-9]{2}|1500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Laenge_Type_Pattern(BigDecimal fmA_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_LAENGE_TYPE, fmA_Laenge_Type, FMA_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Typ_Type(String fmA_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFMA_Typ_Type_Pattern(fmA_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFMA_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] FMA_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FMA Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMA_Typ_Type_Pattern(String fmA_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.FMA_TYP_TYPE, fmA_Typ_Type, FMA_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragung_FMinfo_Typ_Type(String uebertragung_FMinfo_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUebertragung_FMinfo_Typ_Type_Pattern(uebertragung_FMinfo_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUebertragung_FMinfo_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] UEBERTRAGUNG_FMINFO_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uebertragung FMinfo Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUebertragung_FMinfo_Typ_Type_Pattern(String uebertragung_FMinfo_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.UEBERTRAGUNG_FMINFO_TYP_TYPE, uebertragung_FMinfo_Typ_Type, UEBERTRAGUNG_FMINFO_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung_Typ_Type(String zugeinwirkung_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZugeinwirkung_Typ_Type_Pattern(zugeinwirkung_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZugeinwirkung_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZUGEINWIRKUNG_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Zugeinwirkung Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugeinwirkung_Typ_Type_Pattern(String zugeinwirkung_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OrtungPackage.Literals.ZUGEINWIRKUNG_TYP_TYPE, zugeinwirkung_Typ_Type, ZUGEINWIRKUNG_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //OrtungValidator
