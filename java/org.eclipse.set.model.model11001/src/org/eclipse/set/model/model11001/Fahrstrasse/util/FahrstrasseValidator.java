/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse.util;

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

import org.eclipse.set.model.model11001.Fahrstrasse.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage
 * @generated
 */
public class FahrstrasseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FahrstrasseValidator INSTANCE = new FahrstrasseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.Fahrstrasse";

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
	public FahrstrasseValidator() {
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
	  return FahrstrassePackage.eINSTANCE;
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
			case FahrstrassePackage.AUFLOESUNG_SSP_ZIELGLEIS_TYPE_CLASS:
				return validateAufloesung_Ssp_Zielgleis_TypeClass((Aufloesung_Ssp_Zielgleis_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE_CLASS:
				return validateAufloesung_Verzoegerung_TypeClass((Aufloesung_Verzoegerung_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.AUTOMATISCHE_EINSTELLUNG_TYPE_CLASS:
				return validateAutomatische_Einstellung_TypeClass((Automatische_Einstellung_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE_CLASS:
				return validateBezeichnung_Fstr_DWeg_TypeClass((Bezeichnung_Fstr_DWeg_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE_CLASS:
				return validateBezeichnung_Markanter_Punkt_TypeClass((Bezeichnung_Markanter_Punkt_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE_CLASS:
				return validateDWeg_Reihenfolge_TypeClass((DWeg_Reihenfolge_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.DWEG_VAUFWERTUNG_VERZICHT_TYPE_CLASS:
				return validateDWeg_V_Aufwertung_Verzicht_TypeClass((DWeg_V_Aufwertung_Verzicht_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.DWEG_VTYPE_CLASS:
				return validateDWeg_V_TypeClass((DWeg_V_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.DWEG_VORZUG_TYPE_CLASS:
				return validateDWeg_Vorzug_TypeClass((DWeg_Vorzug_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.ELEMENT_VERSCHLUSS_TYPE_CLASS:
				return validateElement_Verschluss_TypeClass((Element_Verschluss_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FBEDIENUNG_TYPE_CLASS:
				return validateF_Bedienung_TypeClass((F_Bedienung_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT:
				return validateFstr_Abhaengigkeit((Fstr_Abhaengigkeit)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP:
				return validateFstr_Abhaengigkeit_Ssp_AttributeGroup((Fstr_Abhaengigkeit_Ssp_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ANEINANDER:
				return validateFstr_Aneinander((Fstr_Aneinander)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE_CLASS:
				return validateFstr_Aneinander_Bedienstring_TypeClass((Fstr_Aneinander_Bedienstring_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG:
				return validateFstr_Aneinander_Zuordnung((Fstr_Aneinander_Zuordnung)value, diagnostics, context);
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE_CLASS:
				return validateFstr_Bedienstring_TypeClass((Fstr_Bedienstring_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_DWEG:
				return validateFstr_DWeg((Fstr_DWeg)value, diagnostics, context);
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP:
				return validateFstr_DWeg_Allg_AttributeGroup((Fstr_DWeg_Allg_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateFstr_DWeg_Bezeichnung_AttributeGroup((Fstr_DWeg_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP:
				return validateFstr_DWeg_Spezifisch_AttributeGroup((Fstr_DWeg_Spezifisch_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_DWEG_WKR:
				return validateFstr_DWeg_W_Kr((Fstr_DWeg_W_Kr)value, diagnostics, context);
			case FahrstrassePackage.FSTR_FAHRWEG:
				return validateFstr_Fahrweg((Fstr_Fahrweg)value, diagnostics, context);
			case FahrstrassePackage.FSTR_MITTEL_ART_TYPE_CLASS:
				return validateFstr_Mittel_Art_TypeClass((Fstr_Mittel_Art_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP:
				return validateFstr_Mittel_AttributeGroup((Fstr_Mittel_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_MITTEL_VAUFWERTUNG_TYPE_CLASS:
				return validateFstr_Mittel_V_Aufwertung_TypeClass((Fstr_Mittel_V_Aufwertung_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_NICHTHALTFALL:
				return validateFstr_Nichthaltfall((Fstr_Nichthaltfall)value, diagnostics, context);
			case FahrstrassePackage.FSTR_RANGIER_ART_TYPE_CLASS:
				return validateFstr_Rangier_Art_TypeClass((Fstr_Rangier_Art_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_RANGIER_ATTRIBUTE_GROUP:
				return validateFstr_Rangier_AttributeGroup((Fstr_Rangier_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG:
				return validateFstr_Rangier_Fla_Zuordnung((Fstr_Rangier_Fla_Zuordnung)value, diagnostics, context);
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE_CLASS:
				return validateFstr_Reihenfolge_TypeClass((Fstr_Reihenfolge_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_SIGNALISIERUNG:
				return validateFstr_Signalisierung((Fstr_Signalisierung)value, diagnostics, context);
			case FahrstrassePackage.FSTR_UMFAHRPUNKT:
				return validateFstr_Umfahrpunkt((Fstr_Umfahrpunkt)value, diagnostics, context);
			case FahrstrassePackage.FSTR_VHG_TYPE_CLASS:
				return validateFstr_V_Hg_TypeClass((Fstr_V_Hg_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_VTYPE_CLASS:
				return validateFstr_V_TypeClass((Fstr_V_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_VSIGABSTAND_VERKUERZT_TYPE_CLASS:
				return validateFstr_Vsigabstand_Verkuerzt_TypeClass((Fstr_Vsigabstand_Verkuerzt_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ZUG_ART_TYPE_CLASS:
				return validateFstr_Zug_Art_TypeClass((Fstr_Zug_Art_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP:
				return validateFstr_Zug_AttributeGroup((Fstr_Zug_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP:
				return validateFstr_Zug_DWeg_AttributeGroup((Fstr_Zug_DWeg_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ZUG_RANGIER:
				return validateFstr_Zug_Rangier((Fstr_Zug_Rangier)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ZUG_RANGIER_ALLG_ATTRIBUTE_GROUP:
				return validateFstr_Zug_Rangier_Allg_AttributeGroup((Fstr_Zug_Rangier_Allg_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.LAENGE_SOLL_TYPE_CLASS:
				return validateLaenge_Soll_TypeClass((Laenge_Soll_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.MARKANTER_PUNKT:
				return validateMarkanter_Punkt((Markanter_Punkt)value, diagnostics, context);
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateMarkanter_Punkt_Bezeichnung_AttributeGroup((Markanter_Punkt_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE_CLASS:
				return validateMassgebende_Neigung_TypeClass((Massgebende_Neigung_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS:
				return validateRangier_Gegenfahrtausschluss_TypeClass((Rangier_Gegenfahrtausschluss_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.SONSTIGER_PUNKT:
				return validateSonstiger_Punkt((Sonstiger_Punkt)value, diagnostics, context);
			case FahrstrassePackage.START_SIGNAL_CHARAKTER_TYPE_CLASS:
				return validateStart_Signal_Charakter_TypeClass((Start_Signal_Charakter_TypeClass)value, diagnostics, context);
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS:
				return validateENUMAufloesungSspZielgleis((ENUMAufloesungSspZielgleis)value, diagnostics, context);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG:
				return validateENUMAutomatischeEinstellung((ENUMAutomatischeEinstellung)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART:
				return validateENUMFstrMittelArt((ENUMFstrMittelArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART:
				return validateENUMFstrRangierArt((ENUMFstrRangierArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART:
				return validateENUMFstrZugArt((ENUMFstrZugArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS:
				return validateENUMRangierGegenfahrtausschluss((ENUMRangierGegenfahrtausschluss)value, diagnostics, context);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER:
				return validateENUMStartSignalCharakter((ENUMStartSignalCharakter)value, diagnostics, context);
			case FahrstrassePackage.AUFLOESUNG_VERZOEGERUNG_TYPE:
				return validateAufloesung_Verzoegerung_Type((BigDecimal)value, diagnostics, context);
			case FahrstrassePackage.BEZEICHNUNG_FSTR_DWEG_TYPE:
				return validateBezeichnung_Fstr_DWeg_Type((String)value, diagnostics, context);
			case FahrstrassePackage.BEZEICHNUNG_MARKANTER_PUNKT_TYPE:
				return validateBezeichnung_Markanter_Punkt_Type((String)value, diagnostics, context);
			case FahrstrassePackage.DWEG_REIHENFOLGE_TYPE:
				return validateDWeg_Reihenfolge_Type((BigInteger)value, diagnostics, context);
			case FahrstrassePackage.DWEG_VTYPE:
				return validateDWeg_V_Type((BigInteger)value, diagnostics, context);
			case FahrstrassePackage.ENUM_AUFLOESUNG_SSP_ZIELGLEIS_OBJECT:
				return validateENUMAufloesungSspZielgleisObject((ENUMAufloesungSspZielgleis)value, diagnostics, context);
			case FahrstrassePackage.ENUM_AUTOMATISCHE_EINSTELLUNG_OBJECT:
				return validateENUMAutomatischeEinstellungObject((ENUMAutomatischeEinstellung)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_MITTEL_ART_OBJECT:
				return validateENUMFstrMittelArtObject((ENUMFstrMittelArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_RANGIER_ART_OBJECT:
				return validateENUMFstrRangierArtObject((ENUMFstrRangierArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_FSTR_ZUG_ART_OBJECT:
				return validateENUMFstrZugArtObject((ENUMFstrZugArt)value, diagnostics, context);
			case FahrstrassePackage.ENUM_RANGIER_GEGENFAHRTAUSSCHLUSS_OBJECT:
				return validateENUMRangierGegenfahrtausschlussObject((ENUMRangierGegenfahrtausschluss)value, diagnostics, context);
			case FahrstrassePackage.ENUM_START_SIGNAL_CHARAKTER_OBJECT:
				return validateENUMStartSignalCharakterObject((ENUMStartSignalCharakter)value, diagnostics, context);
			case FahrstrassePackage.FSTR_ANEINANDER_BEDIENSTRING_TYPE:
				return validateFstr_Aneinander_Bedienstring_Type((String)value, diagnostics, context);
			case FahrstrassePackage.FSTR_BEDIENSTRING_TYPE:
				return validateFstr_Bedienstring_Type((String)value, diagnostics, context);
			case FahrstrassePackage.FSTR_REIHENFOLGE_TYPE:
				return validateFstr_Reihenfolge_Type((BigInteger)value, diagnostics, context);
			case FahrstrassePackage.FSTR_VHG_TYPE:
				return validateFstr_V_Hg_Type((BigInteger)value, diagnostics, context);
			case FahrstrassePackage.FSTR_VTYPE:
				return validateFstr_V_Type((BigInteger)value, diagnostics, context);
			case FahrstrassePackage.LAENGE_SOLL_TYPE:
				return validateLaenge_Soll_Type((BigDecimal)value, diagnostics, context);
			case FahrstrassePackage.MASSGEBENDE_NEIGUNG_TYPE:
				return validateMassgebende_Neigung_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufloesung_Ssp_Zielgleis_TypeClass(Aufloesung_Ssp_Zielgleis_TypeClass aufloesung_Ssp_Zielgleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aufloesung_Ssp_Zielgleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufloesung_Verzoegerung_TypeClass(Aufloesung_Verzoegerung_TypeClass aufloesung_Verzoegerung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aufloesung_Verzoegerung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomatische_Einstellung_TypeClass(Automatische_Einstellung_TypeClass automatische_Einstellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(automatische_Einstellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Fstr_DWeg_TypeClass(Bezeichnung_Fstr_DWeg_TypeClass bezeichnung_Fstr_DWeg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Fstr_DWeg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Markanter_Punkt_TypeClass(Bezeichnung_Markanter_Punkt_TypeClass bezeichnung_Markanter_Punkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Markanter_Punkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Reihenfolge_TypeClass(DWeg_Reihenfolge_TypeClass dWeg_Reihenfolge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Reihenfolge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_V_Aufwertung_Verzicht_TypeClass(DWeg_V_Aufwertung_Verzicht_TypeClass dWeg_V_Aufwertung_Verzicht_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_V_Aufwertung_Verzicht_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_V_TypeClass(DWeg_V_TypeClass dWeg_V_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_V_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Vorzug_TypeClass(DWeg_Vorzug_TypeClass dWeg_Vorzug_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Vorzug_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_Verschluss_TypeClass(Element_Verschluss_TypeClass element_Verschluss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element_Verschluss_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF_Bedienung_TypeClass(F_Bedienung_TypeClass f_Bedienung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(f_Bedienung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Abhaengigkeit(Fstr_Abhaengigkeit fstr_Abhaengigkeit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Abhaengigkeit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Abhaengigkeit_Ssp_AttributeGroup(Fstr_Abhaengigkeit_Ssp_AttributeGroup fstr_Abhaengigkeit_Ssp_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Abhaengigkeit_Ssp_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Aneinander(Fstr_Aneinander fstr_Aneinander, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Aneinander, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Aneinander_Bedienstring_TypeClass(Fstr_Aneinander_Bedienstring_TypeClass fstr_Aneinander_Bedienstring_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Aneinander_Bedienstring_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Aneinander_Zuordnung(Fstr_Aneinander_Zuordnung fstr_Aneinander_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Aneinander_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Bedienstring_TypeClass(Fstr_Bedienstring_TypeClass fstr_Bedienstring_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Bedienstring_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_DWeg(Fstr_DWeg fstr_DWeg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_DWeg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_DWeg_Allg_AttributeGroup(Fstr_DWeg_Allg_AttributeGroup fstr_DWeg_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_DWeg_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_DWeg_Bezeichnung_AttributeGroup(Fstr_DWeg_Bezeichnung_AttributeGroup fstr_DWeg_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_DWeg_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_DWeg_Spezifisch_AttributeGroup(Fstr_DWeg_Spezifisch_AttributeGroup fstr_DWeg_Spezifisch_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_DWeg_Spezifisch_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_DWeg_W_Kr(Fstr_DWeg_W_Kr fstr_DWeg_W_Kr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_DWeg_W_Kr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Fahrweg(Fstr_Fahrweg fstr_Fahrweg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Fahrweg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Mittel_Art_TypeClass(Fstr_Mittel_Art_TypeClass fstr_Mittel_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Mittel_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Mittel_AttributeGroup(Fstr_Mittel_AttributeGroup fstr_Mittel_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Mittel_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Mittel_V_Aufwertung_TypeClass(Fstr_Mittel_V_Aufwertung_TypeClass fstr_Mittel_V_Aufwertung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Mittel_V_Aufwertung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Nichthaltfall(Fstr_Nichthaltfall fstr_Nichthaltfall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Nichthaltfall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Rangier_Art_TypeClass(Fstr_Rangier_Art_TypeClass fstr_Rangier_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Rangier_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Rangier_AttributeGroup(Fstr_Rangier_AttributeGroup fstr_Rangier_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Rangier_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Rangier_Fla_Zuordnung(Fstr_Rangier_Fla_Zuordnung fstr_Rangier_Fla_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Rangier_Fla_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Reihenfolge_TypeClass(Fstr_Reihenfolge_TypeClass fstr_Reihenfolge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Reihenfolge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Signalisierung(Fstr_Signalisierung fstr_Signalisierung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Signalisierung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Umfahrpunkt(Fstr_Umfahrpunkt fstr_Umfahrpunkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Umfahrpunkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_V_Hg_TypeClass(Fstr_V_Hg_TypeClass fstr_V_Hg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_V_Hg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_V_TypeClass(Fstr_V_TypeClass fstr_V_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_V_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Vsigabstand_Verkuerzt_TypeClass(Fstr_Vsigabstand_Verkuerzt_TypeClass fstr_Vsigabstand_Verkuerzt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Vsigabstand_Verkuerzt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Zug_Art_TypeClass(Fstr_Zug_Art_TypeClass fstr_Zug_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Zug_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Zug_AttributeGroup(Fstr_Zug_AttributeGroup fstr_Zug_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Zug_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Zug_DWeg_AttributeGroup(Fstr_Zug_DWeg_AttributeGroup fstr_Zug_DWeg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Zug_DWeg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Zug_Rangier(Fstr_Zug_Rangier fstr_Zug_Rangier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Zug_Rangier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Zug_Rangier_Allg_AttributeGroup(Fstr_Zug_Rangier_Allg_AttributeGroup fstr_Zug_Rangier_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fstr_Zug_Rangier_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Soll_TypeClass(Laenge_Soll_TypeClass laenge_Soll_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laenge_Soll_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkanter_Punkt(Markanter_Punkt markanter_Punkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markanter_Punkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkanter_Punkt_Bezeichnung_AttributeGroup(Markanter_Punkt_Bezeichnung_AttributeGroup markanter_Punkt_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markanter_Punkt_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_TypeClass(Massgebende_Neigung_TypeClass massgebende_Neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangier_Gegenfahrtausschluss_TypeClass(Rangier_Gegenfahrtausschluss_TypeClass rangier_Gegenfahrtausschluss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangier_Gegenfahrtausschluss_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstiger_Punkt(Sonstiger_Punkt sonstiger_Punkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sonstiger_Punkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart_Signal_Charakter_TypeClass(Start_Signal_Charakter_TypeClass start_Signal_Charakter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(start_Signal_Charakter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAufloesungSspZielgleis(ENUMAufloesungSspZielgleis enumAufloesungSspZielgleis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAutomatischeEinstellung(ENUMAutomatischeEinstellung enumAutomatischeEinstellung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrMittelArt(ENUMFstrMittelArt enumFstrMittelArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrRangierArt(ENUMFstrRangierArt enumFstrRangierArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrZugArt(ENUMFstrZugArt enumFstrZugArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRangierGegenfahrtausschluss(ENUMRangierGegenfahrtausschluss enumRangierGegenfahrtausschluss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStartSignalCharakter(ENUMStartSignalCharakter enumStartSignalCharakter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufloesung_Verzoegerung_Type(BigDecimal aufloesung_Verzoegerung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAufloesung_Verzoegerung_Type_Pattern(aufloesung_Verzoegerung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAufloesung_Verzoegerung_Type_Pattern
	 */
	public static final  PatternMatcher [][] AUFLOESUNG_VERZOEGERUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|1[0-1][0-9]|120")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Aufloesung Verzoegerung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAufloesung_Verzoegerung_Type_Pattern(BigDecimal aufloesung_Verzoegerung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.AUFLOESUNG_VERZOEGERUNG_TYPE, aufloesung_Verzoegerung_Type, AUFLOESUNG_VERZOEGERUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Fstr_DWeg_Type(String bezeichnung_Fstr_DWeg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Fstr_DWeg_Type_Pattern(bezeichnung_Fstr_DWeg_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Fstr_DWeg_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_FSTR_DWEG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9_]{1,3}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Fstr DWeg Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Fstr_DWeg_Type_Pattern(String bezeichnung_Fstr_DWeg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.BEZEICHNUNG_FSTR_DWEG_TYPE, bezeichnung_Fstr_DWeg_Type, BEZEICHNUNG_FSTR_DWEG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Markanter_Punkt_Type(String bezeichnung_Markanter_Punkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_Markanter_Punkt_Type_Pattern(bezeichnung_Markanter_Punkt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_Markanter_Punkt_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_MARKANTER_PUNKT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung Markanter Punkt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Markanter_Punkt_Type_Pattern(String bezeichnung_Markanter_Punkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.BEZEICHNUNG_MARKANTER_PUNKT_TYPE, bezeichnung_Markanter_Punkt_Type, BEZEICHNUNG_MARKANTER_PUNKT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Reihenfolge_Type(BigInteger dWeg_Reihenfolge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDWeg_Reihenfolge_Type_Pattern(dWeg_Reihenfolge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDWeg_Reihenfolge_Type_Pattern
	 */
	public static final  PatternMatcher [][] DWEG_REIHENFOLGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DWeg Reihenfolge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Reihenfolge_Type_Pattern(BigInteger dWeg_Reihenfolge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.DWEG_REIHENFOLGE_TYPE, dWeg_Reihenfolge_Type, DWEG_REIHENFOLGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_V_Type(BigInteger dWeg_V_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDWeg_V_Type_Pattern(dWeg_V_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDWeg_V_Type_Pattern
	 */
	public static final  PatternMatcher [][] DWEG_VTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("20|30|40|60|100|160")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DWeg VType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_V_Type_Pattern(BigInteger dWeg_V_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.DWEG_VTYPE, dWeg_V_Type, DWEG_VTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAufloesungSspZielgleisObject(ENUMAufloesungSspZielgleis enumAufloesungSspZielgleisObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAutomatischeEinstellungObject(ENUMAutomatischeEinstellung enumAutomatischeEinstellungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrMittelArtObject(ENUMFstrMittelArt enumFstrMittelArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrRangierArtObject(ENUMFstrRangierArt enumFstrRangierArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFstrZugArtObject(ENUMFstrZugArt enumFstrZugArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRangierGegenfahrtausschlussObject(ENUMRangierGegenfahrtausschluss enumRangierGegenfahrtausschlussObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStartSignalCharakterObject(ENUMStartSignalCharakter enumStartSignalCharakterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Aneinander_Bedienstring_Type(String fstr_Aneinander_Bedienstring_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFstr_Aneinander_Bedienstring_Type_Pattern(fstr_Aneinander_Bedienstring_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFstr_Aneinander_Bedienstring_Type_Pattern
	 */
	public static final  PatternMatcher [][] FSTR_ANEINANDER_BEDIENSTRING_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{3,20}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fstr Aneinander Bedienstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Aneinander_Bedienstring_Type_Pattern(String fstr_Aneinander_Bedienstring_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.FSTR_ANEINANDER_BEDIENSTRING_TYPE, fstr_Aneinander_Bedienstring_Type, FSTR_ANEINANDER_BEDIENSTRING_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Bedienstring_Type(String fstr_Bedienstring_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFstr_Bedienstring_Type_Pattern(fstr_Bedienstring_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFstr_Bedienstring_Type_Pattern
	 */
	public static final  PatternMatcher [][] FSTR_BEDIENSTRING_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{3,26}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fstr Bedienstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Bedienstring_Type_Pattern(String fstr_Bedienstring_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.FSTR_BEDIENSTRING_TYPE, fstr_Bedienstring_Type, FSTR_BEDIENSTRING_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Reihenfolge_Type(BigInteger fstr_Reihenfolge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFstr_Reihenfolge_Type_Pattern(fstr_Reihenfolge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFstr_Reihenfolge_Type_Pattern
	 */
	public static final  PatternMatcher [][] FSTR_REIHENFOLGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]|[12][0-9]|30")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fstr Reihenfolge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_Reihenfolge_Type_Pattern(BigInteger fstr_Reihenfolge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.FSTR_REIHENFOLGE_TYPE, fstr_Reihenfolge_Type, FSTR_REIHENFOLGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_V_Hg_Type(BigInteger fstr_V_Hg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(fstr_V_Hg_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_V_Type(BigInteger fstr_V_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFstr_V_Type_Pattern(fstr_V_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFstr_V_Type_Pattern
	 */
	public static final  PatternMatcher [][] FSTR_VTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("20|30|40|50|60|70|80|90|100|110|120|130|140|150")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fstr VType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFstr_V_Type_Pattern(BigInteger fstr_V_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.FSTR_VTYPE, fstr_V_Type, FSTR_VTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Soll_Type(BigDecimal laenge_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLaenge_Soll_Type_Pattern(laenge_Soll_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLaenge_Soll_Type_Pattern
	 */
	public static final  PatternMatcher [][] LAENGE_SOLL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Laenge Soll Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Soll_Type_Pattern(BigDecimal laenge_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.LAENGE_SOLL_TYPE, laenge_Soll_Type, LAENGE_SOLL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Type(BigDecimal massgebende_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMassgebende_Neigung_Type_Pattern(massgebende_Neigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMassgebende_Neigung_Type_Pattern
	 */
	public static final  PatternMatcher [][] MASSGEBENDE_NEIGUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Massgebende Neigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Type_Pattern(BigDecimal massgebende_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FahrstrassePackage.Literals.MASSGEBENDE_NEIGUNG_TYPE, massgebende_Neigung_Type, MASSGEBENDE_NEIGUNG_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //FahrstrasseValidator
