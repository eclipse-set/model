/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.util;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Signale.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage
 * @generated
 */
public class SignaleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SignaleValidator INSTANCE = new SignaleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Signale";

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
	public SignaleValidator() {
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
	  return SignalePackage.eINSTANCE;
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
			case SignalePackage.ANSCHALTDAUER_TYPE_CLASS:
				return validateAnschaltdauer_TypeClass((Anschaltdauer_TypeClass)value, diagnostics, context);
			case SignalePackage.AUTO_EINSTELLUNG_TYPE_CLASS:
				return validateAuto_Einstellung_TypeClass((Auto_Einstellung_TypeClass)value, diagnostics, context);
			case SignalePackage.BEFESTIGUNG_ART_TYPE_CLASS:
				return validateBefestigung_Art_TypeClass((Befestigung_Art_TypeClass)value, diagnostics, context);
			case SignalePackage.BELEUCHTET_TYPE_CLASS:
				return validateBeleuchtet_TypeClass((Beleuchtet_TypeClass)value, diagnostics, context);
			case SignalePackage.BESETZTE_AUSFAHRT_TYPE_CLASS:
				return validateBesetzte_Ausfahrt_TypeClass((Besetzte_Ausfahrt_TypeClass)value, diagnostics, context);
			case SignalePackage.DA_MANUELL_TYPE_CLASS:
				return validateDA_Manuell_TypeClass((DA_Manuell_TypeClass)value, diagnostics, context);
			case SignalePackage.DUNKELSCHALTUNG_TYPE_CLASS:
				return validateDunkelschaltung_TypeClass((Dunkelschaltung_TypeClass)value, diagnostics, context);
			case SignalePackage.DURCHFAHRT_TYPE_CLASS:
				return validateDurchfahrt_TypeClass((Durchfahrt_TypeClass)value, diagnostics, context);
			case SignalePackage.FIKTIVES_SIGNAL_FUNKTION_TYPE_CLASS:
				return validateFiktives_Signal_Funktion_TypeClass((Fiktives_Signal_Funktion_TypeClass)value, diagnostics, context);
			case SignalePackage.FUNDAMENT_ART_TYPE_CLASS:
				return validateFundament_Art_TypeClass((Fundament_Art_TypeClass)value, diagnostics, context);
			case SignalePackage.FUNKTION_OHNE_SIGNAL_TYPE_CLASS:
				return validateFunktion_Ohne_Signal_TypeClass((Funktion_Ohne_Signal_TypeClass)value, diagnostics, context);
			case SignalePackage.GEGENGLEIS_TYPE_CLASS:
				return validateGegengleis_TypeClass((Gegengleis_TypeClass)value, diagnostics, context);
			case SignalePackage.GELTUNGSBEREICH_TYPE_CLASS:
				return validateGeltungsbereich_TypeClass((Geltungsbereich_TypeClass)value, diagnostics, context);
			case SignalePackage.GESCHALTET_TYPE_CLASS:
				return validateGeschaltet_TypeClass((Geschaltet_TypeClass)value, diagnostics, context);
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE_CLASS:
				return validateHoehe_Fundamentoberkante_TypeClass((Hoehe_Fundamentoberkante_TypeClass)value, diagnostics, context);
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE_CLASS:
				return validateObere_Lichtpunkthoehe_TypeClass((Obere_Lichtpunkthoehe_TypeClass)value, diagnostics, context);
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE_CLASS:
				return validatePZB_Schutzstrecke_Soll_TypeClass((PZB_Schutzstrecke_Soll_TypeClass)value, diagnostics, context);
			case SignalePackage.RAHMEN_ART_TYPE_CLASS:
				return validateRahmen_Art_TypeClass((Rahmen_Art_TypeClass)value, diagnostics, context);
			case SignalePackage.RAHMEN_HOEHE_TYPE_CLASS:
				return validateRahmen_Hoehe_TypeClass((Rahmen_Hoehe_TypeClass)value, diagnostics, context);
			case SignalePackage.RANGIERSTRASSE_RESTAUFLOESUNG_TYPE_CLASS:
				return validateRangierstrasse_Restaufloesung_TypeClass((Rangierstrasse_Restaufloesung_TypeClass)value, diagnostics, context);
			case SignalePackage.RICHTPUNKT_TYPE_CLASS:
				return validateRichtpunkt_TypeClass((Richtpunkt_TypeClass)value, diagnostics, context);
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE_CLASS:
				return validateRichtpunktentfernung_TypeClass((Richtpunktentfernung_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case SignalePackage.SIGNAL_ART_TYPE_CLASS:
				return validateSignal_Art_TypeClass((Signal_Art_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNAL_BEFESTIGUNG:
				return validateSignal_Befestigung((Signal_Befestigung)value, diagnostics, context);
			case SignalePackage.SIGNAL_BEFESTIGUNG_ALLG_ATTRIBUTE_GROUP:
				return validateSignal_Befestigung_Allg_AttributeGroup((Signal_Befestigung_Allg_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_BEFESTIGUNGSART_TYPE_CLASS:
				return validateSignal_Befestigungsart_TypeClass((Signal_Befestigungsart_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG:
				return validateSignal_Fank_Zuordnung((Signal_Fank_Zuordnung)value, diagnostics, context);
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP:
				return validateSignal_Fiktiv_AttributeGroup((Signal_Fiktiv_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP:
				return validateSignal_Fstr_AttributeGroup((Signal_Fstr_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP:
				return validateSignal_Fstr_Aus_Inselgleis_AttributeGroup((Signal_Fstr_Aus_Inselgleis_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP:
				return validateSignal_Fstr_S_AttributeGroup((Signal_Fstr_S_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_FUNKTION_TYPE_CLASS:
				return validateSignal_Funktion_TypeClass((Signal_Funktion_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNAL_RAHMEN:
				return validateSignal_Rahmen((Signal_Rahmen)value, diagnostics, context);
			case SignalePackage.SIGNAL_REAL_AKTIV_ATTRIBUTE_GROUP:
				return validateSignal_Real_Aktiv_AttributeGroup((Signal_Real_Aktiv_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP:
				return validateSignal_Real_Aktiv_Schirm_AttributeGroup((Signal_Real_Aktiv_Schirm_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP:
				return validateSignal_Real_AttributeGroup((Signal_Real_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF:
				return validateSignal_Signalbegriff((Signal_Signalbegriff)value, diagnostics, context);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF_ALLG_ATTRIBUTE_GROUP:
				return validateSignal_Signalbegriff_Allg_AttributeGroup((Signal_Signalbegriff_Allg_AttributeGroup)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE_CLASS:
				return validateSignalsicht_Erreichbar_TypeClass((Signalsicht_Erreichbar_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE_CLASS:
				return validateSignalsicht_Mindest_TypeClass((Signalsicht_Mindest_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_SOLL_TYPE_CLASS:
				return validateSignalsicht_Soll_TypeClass((Signalsicht_Soll_TypeClass)value, diagnostics, context);
			case SignalePackage.SIGNALSYSTEM_TYPE_CLASS:
				return validateSignalsystem_TypeClass((Signalsystem_TypeClass)value, diagnostics, context);
			case SignalePackage.SONSTIGE_ZULAESSIGE_ANORDNUNG_TYPE_CLASS:
				return validateSonstige_Zulaessige_Anordnung_TypeClass((Sonstige_Zulaessige_Anordnung_TypeClass)value, diagnostics, context);
			case SignalePackage.STREUSCHEIBE_ART_TYPE_CLASS:
				return validateStreuscheibe_Art_TypeClass((Streuscheibe_Art_TypeClass)value, diagnostics, context);
			case SignalePackage.STREUSCHEIBE_BETRIEBSSTELLUNG_TYPE_CLASS:
				return validateStreuscheibe_Betriebsstellung_TypeClass((Streuscheibe_Betriebsstellung_TypeClass)value, diagnostics, context);
			case SignalePackage.TUNNELSIGNAL_TYPE_CLASS:
				return validateTunnelsignal_TypeClass((Tunnelsignal_TypeClass)value, diagnostics, context);
			case SignalePackage.ZS2_UEBERWACHT_TYPE_CLASS:
				return validateZs2_Ueberwacht_TypeClass((Zs2_Ueberwacht_TypeClass)value, diagnostics, context);
			case SignalePackage.ENUM_ANSCHALTDAUER:
				return validateENUMAnschaltdauer((ENUMAnschaltdauer)value, diagnostics, context);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG:
				return validateENUMAutoEinstellung((ENUMAutoEinstellung)value, diagnostics, context);
			case SignalePackage.ENUM_BEFESTIGUNG_ART:
				return validateENUMBefestigungArt((ENUMBefestigungArt)value, diagnostics, context);
			case SignalePackage.ENUM_BELEUCHTET:
				return validateENUMBeleuchtet((ENUMBeleuchtet)value, diagnostics, context);
			case SignalePackage.ENUM_DURCHFAHRT:
				return validateENUMDurchfahrt((ENUMDurchfahrt)value, diagnostics, context);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION:
				return validateENUMFiktivesSignalFunktion((ENUMFiktivesSignalFunktion)value, diagnostics, context);
			case SignalePackage.ENUM_FUNDAMENT_ART:
				return validateENUMFundamentArt((ENUMFundamentArt)value, diagnostics, context);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL:
				return validateENUMFunktionOhneSignal((ENUMFunktionOhneSignal)value, diagnostics, context);
			case SignalePackage.ENUM_GELTUNGSBEREICH:
				return validateENUMGeltungsbereich((ENUMGeltungsbereich)value, diagnostics, context);
			case SignalePackage.ENUM_RAHMEN_ART:
				return validateENUMRahmenArt((ENUMRahmenArt)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_ART:
				return validateENUMSignalArt((ENUMSignalArt)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART:
				return validateENUMSignalBefestigungsart((ENUMSignalBefestigungsart)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_FUNKTION:
				return validateENUMSignalFunktion((ENUMSignalFunktion)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNALSYSTEM:
				return validateENUMSignalsystem((ENUMSignalsystem)value, diagnostics, context);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG:
				return validateENUMSonstigeZulaessigeAnordnung((ENUMSonstigeZulaessigeAnordnung)value, diagnostics, context);
			case SignalePackage.ENUM_STREUSCHEIBE_ART:
				return validateENUMStreuscheibeArt((ENUMStreuscheibeArt)value, diagnostics, context);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG:
				return validateENUMStreuscheibeBetriebsstellung((ENUMStreuscheibeBetriebsstellung)value, diagnostics, context);
			case SignalePackage.ENUM_TUNNELSIGNAL:
				return validateENUMTunnelsignal((ENUMTunnelsignal)value, diagnostics, context);
			case SignalePackage.ENUM_ANSCHALTDAUER_OBJECT:
				return validateENUMAnschaltdauerObject((ENUMAnschaltdauer)value, diagnostics, context);
			case SignalePackage.ENUM_AUTO_EINSTELLUNG_OBJECT:
				return validateENUMAutoEinstellungObject((ENUMAutoEinstellung)value, diagnostics, context);
			case SignalePackage.ENUM_BEFESTIGUNG_ART_OBJECT:
				return validateENUMBefestigungArtObject((ENUMBefestigungArt)value, diagnostics, context);
			case SignalePackage.ENUM_BELEUCHTET_OBJECT:
				return validateENUMBeleuchtetObject((ENUMBeleuchtet)value, diagnostics, context);
			case SignalePackage.ENUM_DURCHFAHRT_OBJECT:
				return validateENUMDurchfahrtObject((ENUMDurchfahrt)value, diagnostics, context);
			case SignalePackage.ENUM_FIKTIVES_SIGNAL_FUNKTION_OBJECT:
				return validateENUMFiktivesSignalFunktionObject((ENUMFiktivesSignalFunktion)value, diagnostics, context);
			case SignalePackage.ENUM_FUNDAMENT_ART_OBJECT:
				return validateENUMFundamentArtObject((ENUMFundamentArt)value, diagnostics, context);
			case SignalePackage.ENUM_FUNKTION_OHNE_SIGNAL_OBJECT:
				return validateENUMFunktionOhneSignalObject((ENUMFunktionOhneSignal)value, diagnostics, context);
			case SignalePackage.ENUM_GELTUNGSBEREICH_OBJECT:
				return validateENUMGeltungsbereichObject((ENUMGeltungsbereich)value, diagnostics, context);
			case SignalePackage.ENUM_RAHMEN_ART_OBJECT:
				return validateENUMRahmenArtObject((ENUMRahmenArt)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_ART_OBJECT:
				return validateENUMSignalArtObject((ENUMSignalArt)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_BEFESTIGUNGSART_OBJECT:
				return validateENUMSignalBefestigungsartObject((ENUMSignalBefestigungsart)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNAL_FUNKTION_OBJECT:
				return validateENUMSignalFunktionObject((ENUMSignalFunktion)value, diagnostics, context);
			case SignalePackage.ENUM_SIGNALSYSTEM_OBJECT:
				return validateENUMSignalsystemObject((ENUMSignalsystem)value, diagnostics, context);
			case SignalePackage.ENUM_SONSTIGE_ZULAESSIGE_ANORDNUNG_OBJECT:
				return validateENUMSonstigeZulaessigeAnordnungObject((ENUMSonstigeZulaessigeAnordnung)value, diagnostics, context);
			case SignalePackage.ENUM_STREUSCHEIBE_ART_OBJECT:
				return validateENUMStreuscheibeArtObject((ENUMStreuscheibeArt)value, diagnostics, context);
			case SignalePackage.ENUM_STREUSCHEIBE_BETRIEBSSTELLUNG_OBJECT:
				return validateENUMStreuscheibeBetriebsstellungObject((ENUMStreuscheibeBetriebsstellung)value, diagnostics, context);
			case SignalePackage.ENUM_TUNNELSIGNAL_OBJECT:
				return validateENUMTunnelsignalObject((ENUMTunnelsignal)value, diagnostics, context);
			case SignalePackage.HOEHE_FUNDAMENTOBERKANTE_TYPE:
				return validateHoehe_Fundamentoberkante_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.OBERE_LICHTPUNKTHOEHE_TYPE:
				return validateObere_Lichtpunkthoehe_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.PZB_SCHUTZSTRECKE_SOLL_TYPE:
				return validatePZB_Schutzstrecke_Soll_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.RAHMEN_HOEHE_TYPE:
				return validateRahmen_Hoehe_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.RICHTPUNKT_TYPE:
				return validateRichtpunkt_Type((String)value, diagnostics, context);
			case SignalePackage.RICHTPUNKTENTFERNUNG_TYPE:
				return validateRichtpunktentfernung_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_ERREICHBAR_TYPE:
				return validateSignalsicht_Erreichbar_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_MINDEST_TYPE:
				return validateSignalsicht_Mindest_Type((BigDecimal)value, diagnostics, context);
			case SignalePackage.SIGNALSICHT_SOLL_TYPE:
				return validateSignalsicht_Soll_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnschaltdauer_TypeClass(Anschaltdauer_TypeClass anschaltdauer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anschaltdauer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuto_Einstellung_TypeClass(Auto_Einstellung_TypeClass auto_Einstellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auto_Einstellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBefestigung_Art_TypeClass(Befestigung_Art_TypeClass befestigung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(befestigung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeleuchtet_TypeClass(Beleuchtet_TypeClass beleuchtet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beleuchtet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBesetzte_Ausfahrt_TypeClass(Besetzte_Ausfahrt_TypeClass besetzte_Ausfahrt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(besetzte_Ausfahrt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDA_Manuell_TypeClass(DA_Manuell_TypeClass dA_Manuell_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dA_Manuell_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDunkelschaltung_TypeClass(Dunkelschaltung_TypeClass dunkelschaltung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dunkelschaltung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurchfahrt_TypeClass(Durchfahrt_TypeClass durchfahrt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durchfahrt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiktives_Signal_Funktion_TypeClass(Fiktives_Signal_Funktion_TypeClass fiktives_Signal_Funktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fiktives_Signal_Funktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFundament_Art_TypeClass(Fundament_Art_TypeClass fundament_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fundament_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunktion_Ohne_Signal_TypeClass(Funktion_Ohne_Signal_TypeClass funktion_Ohne_Signal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(funktion_Ohne_Signal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGegengleis_TypeClass(Gegengleis_TypeClass gegengleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gegengleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeltungsbereich_TypeClass(Geltungsbereich_TypeClass geltungsbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geltungsbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeschaltet_TypeClass(Geschaltet_TypeClass geschaltet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geschaltet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehe_Fundamentoberkante_TypeClass(Hoehe_Fundamentoberkante_TypeClass hoehe_Fundamentoberkante_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoehe_Fundamentoberkante_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObere_Lichtpunkthoehe_TypeClass(Obere_Lichtpunkthoehe_TypeClass obere_Lichtpunkthoehe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obere_Lichtpunkthoehe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Schutzstrecke_Soll_TypeClass(PZB_Schutzstrecke_Soll_TypeClass pzB_Schutzstrecke_Soll_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pzB_Schutzstrecke_Soll_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRahmen_Art_TypeClass(Rahmen_Art_TypeClass rahmen_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rahmen_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRahmen_Hoehe_TypeClass(Rahmen_Hoehe_TypeClass rahmen_Hoehe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rahmen_Hoehe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangierstrasse_Restaufloesung_TypeClass(Rangierstrasse_Restaufloesung_TypeClass rangierstrasse_Restaufloesung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangierstrasse_Restaufloesung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunkt_TypeClass(Richtpunkt_TypeClass richtpunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richtpunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunktentfernung_TypeClass(Richtpunktentfernung_TypeClass richtpunktentfernung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richtpunktentfernung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Art_TypeClass(Signal_Art_TypeClass signal_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Befestigung(Signal_Befestigung signal_Befestigung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Befestigung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Befestigung_Allg_AttributeGroup(Signal_Befestigung_Allg_AttributeGroup signal_Befestigung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Befestigung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Befestigungsart_TypeClass(Signal_Befestigungsart_TypeClass signal_Befestigungsart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Befestigungsart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Fank_Zuordnung(Signal_Fank_Zuordnung signal_Fank_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Fank_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Fiktiv_AttributeGroup(Signal_Fiktiv_AttributeGroup signal_Fiktiv_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Fiktiv_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Fstr_AttributeGroup(Signal_Fstr_AttributeGroup signal_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Fstr_Aus_Inselgleis_AttributeGroup(Signal_Fstr_Aus_Inselgleis_AttributeGroup signal_Fstr_Aus_Inselgleis_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Fstr_Aus_Inselgleis_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Fstr_S_AttributeGroup(Signal_Fstr_S_AttributeGroup signal_Fstr_S_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Fstr_S_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Funktion_TypeClass(Signal_Funktion_TypeClass signal_Funktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Funktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Rahmen(Signal_Rahmen signal_Rahmen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Rahmen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Real_Aktiv_AttributeGroup(Signal_Real_Aktiv_AttributeGroup signal_Real_Aktiv_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Real_Aktiv_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Real_Aktiv_Schirm_AttributeGroup(Signal_Real_Aktiv_Schirm_AttributeGroup signal_Real_Aktiv_Schirm_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Real_Aktiv_Schirm_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Real_AttributeGroup(Signal_Real_AttributeGroup signal_Real_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Real_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Signalbegriff(Signal_Signalbegriff signal_Signalbegriff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Signalbegriff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal_Signalbegriff_Allg_AttributeGroup(Signal_Signalbegriff_Allg_AttributeGroup signal_Signalbegriff_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signal_Signalbegriff_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Erreichbar_TypeClass(Signalsicht_Erreichbar_TypeClass signalsicht_Erreichbar_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalsicht_Erreichbar_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Mindest_TypeClass(Signalsicht_Mindest_TypeClass signalsicht_Mindest_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalsicht_Mindest_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Soll_TypeClass(Signalsicht_Soll_TypeClass signalsicht_Soll_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalsicht_Soll_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsystem_TypeClass(Signalsystem_TypeClass signalsystem_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalsystem_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstige_Zulaessige_Anordnung_TypeClass(Sonstige_Zulaessige_Anordnung_TypeClass sonstige_Zulaessige_Anordnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sonstige_Zulaessige_Anordnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreuscheibe_Art_TypeClass(Streuscheibe_Art_TypeClass streuscheibe_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streuscheibe_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreuscheibe_Betriebsstellung_TypeClass(Streuscheibe_Betriebsstellung_TypeClass streuscheibe_Betriebsstellung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streuscheibe_Betriebsstellung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTunnelsignal_TypeClass(Tunnelsignal_TypeClass tunnelsignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tunnelsignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs2_Ueberwacht_TypeClass(Zs2_Ueberwacht_TypeClass zs2_Ueberwacht_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs2_Ueberwacht_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnschaltdauer(ENUMAnschaltdauer enumAnschaltdauer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAutoEinstellung(ENUMAutoEinstellung enumAutoEinstellung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBefestigungArt(ENUMBefestigungArt enumBefestigungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBeleuchtet(ENUMBeleuchtet enumBeleuchtet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDurchfahrt(ENUMDurchfahrt enumDurchfahrt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFiktivesSignalFunktion(ENUMFiktivesSignalFunktion enumFiktivesSignalFunktion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFundamentArt(ENUMFundamentArt enumFundamentArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFunktionOhneSignal(ENUMFunktionOhneSignal enumFunktionOhneSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGeltungsbereich(ENUMGeltungsbereich enumGeltungsbereich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRahmenArt(ENUMRahmenArt enumRahmenArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalArt(ENUMSignalArt enumSignalArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalBefestigungsart(ENUMSignalBefestigungsart enumSignalBefestigungsart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalFunktion(ENUMSignalFunktion enumSignalFunktion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalsystem(ENUMSignalsystem enumSignalsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSonstigeZulaessigeAnordnung(ENUMSonstigeZulaessigeAnordnung enumSonstigeZulaessigeAnordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreuscheibeArt(ENUMStreuscheibeArt enumStreuscheibeArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreuscheibeBetriebsstellung(ENUMStreuscheibeBetriebsstellung enumStreuscheibeBetriebsstellung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTunnelsignal(ENUMTunnelsignal enumTunnelsignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAnschaltdauerObject(ENUMAnschaltdauer enumAnschaltdauerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAutoEinstellungObject(ENUMAutoEinstellung enumAutoEinstellungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBefestigungArtObject(ENUMBefestigungArt enumBefestigungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBeleuchtetObject(ENUMBeleuchtet enumBeleuchtetObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDurchfahrtObject(ENUMDurchfahrt enumDurchfahrtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFiktivesSignalFunktionObject(ENUMFiktivesSignalFunktion enumFiktivesSignalFunktionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFundamentArtObject(ENUMFundamentArt enumFundamentArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFunktionOhneSignalObject(ENUMFunktionOhneSignal enumFunktionOhneSignalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGeltungsbereichObject(ENUMGeltungsbereich enumGeltungsbereichObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRahmenArtObject(ENUMRahmenArt enumRahmenArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalArtObject(ENUMSignalArt enumSignalArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalBefestigungsartObject(ENUMSignalBefestigungsart enumSignalBefestigungsartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalFunktionObject(ENUMSignalFunktion enumSignalFunktionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSignalsystemObject(ENUMSignalsystem enumSignalsystemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSonstigeZulaessigeAnordnungObject(ENUMSonstigeZulaessigeAnordnung enumSonstigeZulaessigeAnordnungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreuscheibeArtObject(ENUMStreuscheibeArt enumStreuscheibeArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreuscheibeBetriebsstellungObject(ENUMStreuscheibeBetriebsstellung enumStreuscheibeBetriebsstellungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTunnelsignalObject(ENUMTunnelsignal enumTunnelsignalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehe_Fundamentoberkante_Type(BigDecimal hoehe_Fundamentoberkante_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHoehe_Fundamentoberkante_Type_Pattern(hoehe_Fundamentoberkante_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHoehe_Fundamentoberkante_Type_Pattern
	 */
	public static final  PatternMatcher [][] HOEHE_FUNDAMENTOBERKANTE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(-?((1\\.(250|2[0-4][0-9]|[01][0-9]{2}))|(0\\.([1-9][0-9]{2}|0[0-9][1-9]|0[1-9]0))))|0\\.000")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hoehe Fundamentoberkante Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoehe_Fundamentoberkante_Type_Pattern(BigDecimal hoehe_Fundamentoberkante_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.HOEHE_FUNDAMENTOBERKANTE_TYPE, hoehe_Fundamentoberkante_Type, HOEHE_FUNDAMENTOBERKANTE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObere_Lichtpunkthoehe_Type(BigDecimal obere_Lichtpunkthoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateObere_Lichtpunkthoehe_Type_Pattern(obere_Lichtpunkthoehe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateObere_Lichtpunkthoehe_Type_Pattern
	 */
	public static final  PatternMatcher [][] OBERE_LICHTPUNKTHOEHE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0\\.(22[5-9]|2[3-9][0-9]|[3-9][0-9]{2})|([1-9]|1[0-4])\\.[0-9]{3}|15.000")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Obere Lichtpunkthoehe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObere_Lichtpunkthoehe_Type_Pattern(BigDecimal obere_Lichtpunkthoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.OBERE_LICHTPUNKTHOEHE_TYPE, obere_Lichtpunkthoehe_Type, OBERE_LICHTPUNKTHOEHE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Schutzstrecke_Soll_Type(BigDecimal pzB_Schutzstrecke_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePZB_Schutzstrecke_Soll_Type_Pattern(pzB_Schutzstrecke_Soll_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePZB_Schutzstrecke_Soll_Type_Pattern
	 */
	public static final  PatternMatcher [][] PZB_SCHUTZSTRECKE_SOLL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("2[1-9][0-9]|[34][0-9]{2}|5[0-4][0-9]|550")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>PZB Schutzstrecke Soll Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePZB_Schutzstrecke_Soll_Type_Pattern(BigDecimal pzB_Schutzstrecke_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.PZB_SCHUTZSTRECKE_SOLL_TYPE, pzB_Schutzstrecke_Soll_Type, PZB_SCHUTZSTRECKE_SOLL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRahmen_Hoehe_Type(BigDecimal rahmen_Hoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunkt_Type(String richtpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRichtpunkt_Type_Pattern(richtpunkt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRichtpunkt_Type_Pattern
	 */
	public static final  PatternMatcher [][] RICHTPUNKT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,16}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Richtpunkt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunkt_Type_Pattern(String richtpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.RICHTPUNKT_TYPE, richtpunkt_Type, RICHTPUNKT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunktentfernung_Type(BigDecimal richtpunktentfernung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRichtpunktentfernung_Type_Pattern(richtpunktentfernung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRichtpunktentfernung_Type_Pattern
	 */
	public static final  PatternMatcher [][] RICHTPUNKTENTFERNUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Richtpunktentfernung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtpunktentfernung_Type_Pattern(BigDecimal richtpunktentfernung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.RICHTPUNKTENTFERNUNG_TYPE, richtpunktentfernung_Type, RICHTPUNKTENTFERNUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Erreichbar_Type(BigDecimal signalsicht_Erreichbar_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalsicht_Erreichbar_Type_Pattern(signalsicht_Erreichbar_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignalsicht_Erreichbar_Type_Pattern
	 */
	public static final  PatternMatcher [][] SIGNALSICHT_ERREICHBAR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Signalsicht Erreichbar Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Erreichbar_Type_Pattern(BigDecimal signalsicht_Erreichbar_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.SIGNALSICHT_ERREICHBAR_TYPE, signalsicht_Erreichbar_Type, SIGNALSICHT_ERREICHBAR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Mindest_Type(BigDecimal signalsicht_Mindest_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalsicht_Mindest_Type_Pattern(signalsicht_Mindest_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignalsicht_Mindest_Type_Pattern
	 */
	public static final  PatternMatcher [][] SIGNALSICHT_MINDEST_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1-2][0-9]{2}|300")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Signalsicht Mindest Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Mindest_Type_Pattern(BigDecimal signalsicht_Mindest_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.SIGNALSICHT_MINDEST_TYPE, signalsicht_Mindest_Type, SIGNALSICHT_MINDEST_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Soll_Type(BigDecimal signalsicht_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalsicht_Soll_Type_Pattern(signalsicht_Soll_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignalsicht_Soll_Type_Pattern
	 */
	public static final  PatternMatcher [][] SIGNALSICHT_SOLL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Signalsicht Soll Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalsicht_Soll_Type_Pattern(BigDecimal signalsicht_Soll_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SignalePackage.Literals.SIGNALSICHT_SOLL_TYPE, signalsicht_Soll_Type, SIGNALSICHT_SOLL_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //SignaleValidator
