/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage
 * @generated
 */
public class ZugnummernmeldeanlageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ZugnummernmeldeanlageValidator INSTANCE = new ZugnummernmeldeanlageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Zugnummernmeldeanlage";

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
	public ZugnummernmeldeanlageValidator() {
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
	  return ZugnummernmeldeanlagePackage.eINSTANCE;
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
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_ANB_ANN_TYPE_CLASS:
				return validateAkustikdauer_Anb_Ann_TypeClass((Akustikdauer_Anb_Ann_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_SONST_TYPE_CLASS:
				return validateAkustikdauer_Sonst_TypeClass((Akustikdauer_Sonst_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_VORANZ_TYPE_CLASS:
				return validateAkustikdauer_Voranz_TypeClass((Akustikdauer_Voranz_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE_CLASS:
				return validateAnschlussnummer_TypeClass((Anschlussnummer_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_GEGENGLEIS_TYPE_CLASS:
				return validateAusfahrdruck_Gegengleis_TypeClass((Ausfahrdruck_Gegengleis_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_TYPE_CLASS:
				return validateAusfahrdruck_TypeClass((Ausfahrdruck_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BEDIENBARKEIT_ANZEIGEFELD_TYPE_CLASS:
				return validateBedienbarkeit_Anzeigefeld_TypeClass((Bedienbarkeit_Anzeigefeld_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE_CLASS:
				return validateBesonderes_Schaltkriterium_TypeClass((Besonderes_Schaltkriterium_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE_CLASS:
				return validateBezeichnung_Besondere_Anlage_TypeClass((Bezeichnung_Besondere_Anlage_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BF_KENNUNG_TYPE_CLASS:
				return validateBf_Kennung_TypeClass((Bf_Kennung_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BF_NR_ANB_TYPE_CLASS:
				return validateBf_Nr_ANB_TypeClass((Bf_Nr_ANB_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE_CLASS:
				return validateBf_Nr_TypeClass((Bf_Nr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BF_NR_ZN_ATYPE_CLASS:
				return validateBf_Nr_ZN_A_TypeClass((Bf_Nr_ZN_A_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.DURCHFAHRDRUCK_TYPE_CLASS:
				return validateDurchfahrdruck_TypeClass((Durchfahrdruck_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_GEGENGLEIS_TYPE_CLASS:
				return validateEinfahrdruck_Gegengleis_TypeClass((Einfahrdruck_Gegengleis_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_TYPE_CLASS:
				return validateEinfahrdruck_TypeClass((Einfahrdruck_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.EINWAHLSTELLE_TYPE_CLASS:
				return validateEinwahlstelle_TypeClass((Einwahlstelle_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.FUNKTIONALITAET_ANZEIGEFELD_TYPE_CLASS:
				return validateFunktionalitaet_Anzeigefeld_TypeClass((Funktionalitaet_Anzeigefeld_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.HOA_TYPE_CLASS:
				return validateHOA_TypeClass((HOA_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE_CLASS:
				return validateIP_Adresse_TypeClass((IP_Adresse_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.KOPPELUNTERSTATION_TYPE_CLASS:
				return validateKoppelunterstation_TypeClass((Koppelunterstation_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.KUS_ZEITTELEGRAMM_TYPE_CLASS:
				return validateKUs_Zeittelegramm_TypeClass((KUs_Zeittelegramm_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.MELDEDRUCK_TYPE_CLASS:
				return validateMeldedruck_TypeClass((Meldedruck_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE_CLASS:
				return validatePrioritaet_TypeClass((Prioritaet_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.REAKTIVIERUNGSFUNKTION_TYPE_CLASS:
				return validateReaktivierungsfunktion_TypeClass((Reaktivierungsfunktion_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.SICHTBARKEIT_ANZEIGEFELD_TYPE_CLASS:
				return validateSichtbarkeit_Anzeigefeld_TypeClass((Sichtbarkeit_Anzeigefeld_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_02_TYPE_CLASS:
				return validateTelegramm_02_TypeClass((Telegramm_02_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_03_TYPE_CLASS:
				return validateTelegramm_03_TypeClass((Telegramm_03_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_04_TYPE_CLASS:
				return validateTelegramm_04_TypeClass((Telegramm_04_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_10_TYPE_CLASS:
				return validateTelegramm_10_TypeClass((Telegramm_10_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_21_TYPE_CLASS:
				return validateTelegramm_21_TypeClass((Telegramm_21_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_30_TYPE_CLASS:
				return validateTelegramm_30_TypeClass((Telegramm_30_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP:
				return validateTelegramm_84_Alle_Fstr_AttributeGroup((Telegramm_84_Alle_Fstr_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP:
				return validateTelegramm_84_Einzelne_Fstr_AttributeGroup((Telegramm_84_Einzelne_Fstr_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_FUER_ALLE_FSTR_TYPE_CLASS:
				return validateTelegramm_84_Fuer_Alle_Fstr_TypeClass((Telegramm_84_Fuer_Alle_Fstr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_VERZICHT_TYPE_CLASS:
				return validateTelegramm_84_Verzicht_TypeClass((Telegramm_84_Verzicht_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP:
				return validateTelegramm_85_Alle_Fstr_AttributeGroup((Telegramm_85_Alle_Fstr_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP:
				return validateTelegramm_85_Einzelne_Fstr_AttributeGroup((Telegramm_85_Einzelne_Fstr_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_FUER_ALLE_FSTR_TYPE_CLASS:
				return validateTelegramm_85_Fuer_Alle_Fstr_TypeClass((Telegramm_85_Fuer_Alle_Fstr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.TELEGRAMMWIEDERHOLUNG_TYPE_CLASS:
				return validateTelegrammwiederholung_TypeClass((Telegrammwiederholung_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE_CLASS:
				return validateUnterstation_Max_TypeClass((Unterstation_Max_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE_CLASS:
				return validateUnterstation_Nr_TypeClass((Unterstation_Nr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE_CLASS:
				return validateVerzoegerung_Manuell_Loeschung_TypeClass((Verzoegerung_Manuell_Loeschung_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.VORMELDESTART_TYPE_CLASS:
				return validateVormeldestart_TypeClass((Vormeldestart_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE_CLASS:
				return validateZBS_Adresse_TypeClass((ZBS_Adresse_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZBS_ANBINDUNG_TYPE_CLASS:
				return validateZBS_Anbindung_TypeClass((ZBS_Anbindung_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZBS_SCHNITTSTELLE_TYPE_CLASS:
				return validateZBS_Schnittstelle_TypeClass((ZBS_Schnittstelle_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZEITSYNCHRONISATION_FUNKUHR_TYPE_CLASS:
				return validateZeitsynchronisation_Funkuhr_TypeClass((Zeitsynchronisation_Funkuhr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS:
				return validateZLV_Bus((ZLV_Bus)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP:
				return validateZLV_Bus_Allg_AttributeGroup((ZLV_Bus_Allg_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE:
				return validateZLV_Bus_Besondere_Anlage((ZLV_Bus_Besondere_Anlage)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup((ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateZLV_Bus_Bezeichnung_AttributeGroup((ZLV_Bus_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE_CLASS:
				return validateZLV_Bus_Nr_TypeClass((ZLV_Bus_Nr_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG:
				return validateZLV_Bus_US_Zuordnung((ZLV_Bus_US_Zuordnung)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP:
				return validateZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup((ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP:
				return validateZLV_Bus_Zuordnung_Allg_AttributeGroup((ZLV_Bus_Zuordnung_Allg_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN:
				return validateZN((ZN)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE_CLASS:
				return validateZN_A_Bedienbezeichner_Frei_TypeClass((ZN_A_Bedienbezeichner_Frei_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE_CLASS:
				return validateZN_A_Bezeichner_TypeClass((ZN_A_Bezeichner_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK:
				return validateZN_Akustik((ZN_Akustik)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP:
				return validateZN_Akustik_Anzeigefeld_AttributeGroup((ZN_Akustik_Anzeigefeld_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP:
				return validateZN_Allg_AttributeGroup((ZN_Allg_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ANLAGENTYP_TYPE_CLASS:
				return validateZN_Anlagentyp_TypeClass((ZN_Anlagentyp_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD:
				return validateZN_Anzeigefeld((ZN_Anzeigefeld)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP:
				return validateZN_Anzeigefeld_Allg_AttributeGroup((ZN_Anzeigefeld_Allg_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateZN_Anzeigefeld_Bezeichnung_AttributeGroup((ZN_Anzeigefeld_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_LOESCHKRITERIUM_TYPE_CLASS:
				return validateZN_Anzeigefeld_Loeschkriterium_TypeClass((ZN_Anzeigefeld_Loeschkriterium_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_FELD_OHNE_ANZEIGE_TYPE_CLASS:
				return validateZN_Feld_Ohne_Anzeige_TypeClass((ZN_Feld_Ohne_Anzeige_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP:
				return validateZN_Fortschalt_Krit_Druck_AttributeGroup((ZN_Fortschalt_Krit_Druck_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP:
				return validateZN_Fortschalt_Krit_Schalt_AttributeGroup((ZN_Fortschalt_Krit_Schalt_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM:
				return validateZN_Fortschalt_Kriterium((ZN_Fortschalt_Kriterium)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_MODEM_TYPE_CLASS:
				return validateZN_Modem_TypeClass((ZN_Modem_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_SCHALTKRITERIUM_TYPE_CLASS:
				return validateZN_Schaltkriterium_TypeClass((ZN_Schaltkriterium_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG:
				return validateZN_Telegramm_84_Zuordnung((ZN_Telegramm_84_Zuordnung)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG:
				return validateZN_Telegramm_85_Zuordnung((ZN_Telegramm_85_Zuordnung)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION:
				return validateZN_Unterstation((ZN_Unterstation)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP:
				return validateZN_Unterstation_Allg_AttributeGroup((ZN_Unterstation_Allg_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP:
				return validateZN_Unterstation_Bf_Nr_AttributeGroup((ZN_Unterstation_Bf_Nr_AttributeGroup)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ZBS:
				return validateZN_ZBS((ZN_ZBS)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZUGVORBEREITUNGSMELDUNG_TYPE_CLASS:
				return validateZugvorbereitungsmeldung_TypeClass((Zugvorbereitungsmeldung_TypeClass)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN:
				return validateENUMAkustikAnbAnn((ENUMAkustikAnbAnn)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST:
				return validateENUMAkustikSonst((ENUMAkustikSonst)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG:
				return validateENUMBfKennung((ENUMBfKennung)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD:
				return validateENUMFunktionalitaetAnzeigefeld((ENUMFunktionalitaetAnzeigefeld)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE:
				return validateENUMZBSSchnittstelle((ENUMZBSSchnittstelle)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP:
				return validateENUMZNAnlagentyp((ENUMZNAnlagentyp)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return validateENUMZNAnzeigefeldLoeschkriterium((ENUMZNAnzeigefeldLoeschkriterium)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM:
				return validateENUMZNModem((ENUMZNModem)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM:
				return validateENUMZNSchaltkriterium((ENUMZNSchaltkriterium)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE:
				return validateAnschlussnummer_Type((BigInteger)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE:
				return validateBesonderes_Schaltkriterium_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE:
				return validateBezeichnung_Besondere_Anlage_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE:
				return validateBf_Nr_Type((BigInteger)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN_OBJECT:
				return validateENUMAkustikAnbAnnObject((ENUMAkustikAnbAnn)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST_OBJECT:
				return validateENUMAkustikSonstObject((ENUMAkustikSonst)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG_OBJECT:
				return validateENUMBfKennungObject((ENUMBfKennung)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD_OBJECT:
				return validateENUMFunktionalitaetAnzeigefeldObject((ENUMFunktionalitaetAnzeigefeld)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE_OBJECT:
				return validateENUMZBSSchnittstelleObject((ENUMZBSSchnittstelle)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP_OBJECT:
				return validateENUMZNAnlagentypObject((ENUMZNAnlagentyp)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_OBJECT:
				return validateENUMZNAnzeigefeldLoeschkriteriumObject((ENUMZNAnzeigefeldLoeschkriterium)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM_OBJECT:
				return validateENUMZNModemObject((ENUMZNModem)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM_OBJECT:
				return validateENUMZNSchaltkriteriumObject((ENUMZNSchaltkriterium)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE:
				return validateIP_Adresse_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE:
				return validatePrioritaet_Type((BigInteger)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE:
				return validateUnterstation_Max_Type((BigInteger)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE:
				return validateUnterstation_Nr_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE:
				return validateVerzoegerung_Manuell_Loeschung_Type((BigDecimal)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE:
				return validateZBS_Adresse_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE:
				return validateZLV_Bus_Nr_Type((BigInteger)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE:
				return validateZN_A_Bedienbezeichner_Frei_Type((String)value, diagnostics, context);
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE:
				return validateZN_A_Bezeichner_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustikdauer_Anb_Ann_TypeClass(Akustikdauer_Anb_Ann_TypeClass akustikdauer_Anb_Ann_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akustikdauer_Anb_Ann_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustikdauer_Sonst_TypeClass(Akustikdauer_Sonst_TypeClass akustikdauer_Sonst_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akustikdauer_Sonst_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustikdauer_Voranz_TypeClass(Akustikdauer_Voranz_TypeClass akustikdauer_Voranz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akustikdauer_Voranz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnschlussnummer_TypeClass(Anschlussnummer_TypeClass anschlussnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anschlussnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusfahrdruck_Gegengleis_TypeClass(Ausfahrdruck_Gegengleis_TypeClass ausfahrdruck_Gegengleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausfahrdruck_Gegengleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusfahrdruck_TypeClass(Ausfahrdruck_TypeClass ausfahrdruck_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausfahrdruck_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienbarkeit_Anzeigefeld_TypeClass(Bedienbarkeit_Anzeigefeld_TypeClass bedienbarkeit_Anzeigefeld_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedienbarkeit_Anzeigefeld_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBesonderes_Schaltkriterium_TypeClass(Besonderes_Schaltkriterium_TypeClass besonderes_Schaltkriterium_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(besonderes_Schaltkriterium_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Besondere_Anlage_TypeClass(Bezeichnung_Besondere_Anlage_TypeClass bezeichnung_Besondere_Anlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Besondere_Anlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Kennung_TypeClass(Bf_Kennung_TypeClass bf_Kennung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bf_Kennung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Nr_ANB_TypeClass(Bf_Nr_ANB_TypeClass bf_Nr_ANB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bf_Nr_ANB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Nr_TypeClass(Bf_Nr_TypeClass bf_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bf_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Nr_ZN_A_TypeClass(Bf_Nr_ZN_A_TypeClass bf_Nr_ZN_A_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bf_Nr_ZN_A_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurchfahrdruck_TypeClass(Durchfahrdruck_TypeClass durchfahrdruck_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durchfahrdruck_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinfahrdruck_Gegengleis_TypeClass(Einfahrdruck_Gegengleis_TypeClass einfahrdruck_Gegengleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einfahrdruck_Gegengleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinfahrdruck_TypeClass(Einfahrdruck_TypeClass einfahrdruck_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einfahrdruck_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinwahlstelle_TypeClass(Einwahlstelle_TypeClass einwahlstelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einwahlstelle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunktionalitaet_Anzeigefeld_TypeClass(Funktionalitaet_Anzeigefeld_TypeClass funktionalitaet_Anzeigefeld_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(funktionalitaet_Anzeigefeld_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHOA_TypeClass(HOA_TypeClass hoA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hoA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adresse_TypeClass(IP_Adresse_TypeClass iP_Adresse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adresse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKoppelunterstation_TypeClass(Koppelunterstation_TypeClass koppelunterstation_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(koppelunterstation_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKUs_Zeittelegramm_TypeClass(KUs_Zeittelegramm_TypeClass kUs_Zeittelegramm_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kUs_Zeittelegramm_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeldedruck_TypeClass(Meldedruck_TypeClass meldedruck_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meldedruck_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_TypeClass(Prioritaet_TypeClass prioritaet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prioritaet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReaktivierungsfunktion_TypeClass(Reaktivierungsfunktion_TypeClass reaktivierungsfunktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reaktivierungsfunktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSichtbarkeit_Anzeigefeld_TypeClass(Sichtbarkeit_Anzeigefeld_TypeClass sichtbarkeit_Anzeigefeld_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sichtbarkeit_Anzeigefeld_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_02_TypeClass(Telegramm_02_TypeClass telegramm_02_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_02_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_03_TypeClass(Telegramm_03_TypeClass telegramm_03_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_03_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_04_TypeClass(Telegramm_04_TypeClass telegramm_04_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_04_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_10_TypeClass(Telegramm_10_TypeClass telegramm_10_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_10_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_21_TypeClass(Telegramm_21_TypeClass telegramm_21_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_21_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_30_TypeClass(Telegramm_30_TypeClass telegramm_30_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_30_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_84_Alle_Fstr_AttributeGroup(Telegramm_84_Alle_Fstr_AttributeGroup telegramm_84_Alle_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_84_Alle_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_84_Einzelne_Fstr_AttributeGroup(Telegramm_84_Einzelne_Fstr_AttributeGroup telegramm_84_Einzelne_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_84_Einzelne_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_84_Fuer_Alle_Fstr_TypeClass(Telegramm_84_Fuer_Alle_Fstr_TypeClass telegramm_84_Fuer_Alle_Fstr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_84_Fuer_Alle_Fstr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_84_Verzicht_TypeClass(Telegramm_84_Verzicht_TypeClass telegramm_84_Verzicht_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_84_Verzicht_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_85_Alle_Fstr_AttributeGroup(Telegramm_85_Alle_Fstr_AttributeGroup telegramm_85_Alle_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_85_Alle_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_85_Einzelne_Fstr_AttributeGroup(Telegramm_85_Einzelne_Fstr_AttributeGroup telegramm_85_Einzelne_Fstr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_85_Einzelne_Fstr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_85_Fuer_Alle_Fstr_TypeClass(Telegramm_85_Fuer_Alle_Fstr_TypeClass telegramm_85_Fuer_Alle_Fstr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_85_Fuer_Alle_Fstr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegrammwiederholung_TypeClass(Telegrammwiederholung_TypeClass telegrammwiederholung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegrammwiederholung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Max_TypeClass(Unterstation_Max_TypeClass unterstation_Max_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterstation_Max_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Nr_TypeClass(Unterstation_Nr_TypeClass unterstation_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unterstation_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerzoegerung_Manuell_Loeschung_TypeClass(Verzoegerung_Manuell_Loeschung_TypeClass verzoegerung_Manuell_Loeschung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verzoegerung_Manuell_Loeschung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVormeldestart_TypeClass(Vormeldestart_TypeClass vormeldestart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vormeldestart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Adresse_TypeClass(ZBS_Adresse_TypeClass zbS_Adresse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Adresse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Anbindung_TypeClass(ZBS_Anbindung_TypeClass zbS_Anbindung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Anbindung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Schnittstelle_TypeClass(ZBS_Schnittstelle_TypeClass zbS_Schnittstelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Schnittstelle_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeitsynchronisation_Funkuhr_TypeClass(Zeitsynchronisation_Funkuhr_TypeClass zeitsynchronisation_Funkuhr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zeitsynchronisation_Funkuhr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus(ZLV_Bus zlV_Bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Allg_AttributeGroup(ZLV_Bus_Allg_AttributeGroup zlV_Bus_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Besondere_Anlage(ZLV_Bus_Besondere_Anlage zlV_Bus_Besondere_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Besondere_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Bezeichnung_AttributeGroup(ZLV_Bus_Bezeichnung_AttributeGroup zlV_Bus_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Nr_TypeClass(ZLV_Bus_Nr_TypeClass zlV_Bus_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_US_Zuordnung(ZLV_Bus_US_Zuordnung zlV_Bus_US_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_US_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Zuordnung_Allg_AttributeGroup(ZLV_Bus_Zuordnung_Allg_AttributeGroup zlV_Bus_Zuordnung_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlV_Bus_Zuordnung_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN(ZN zn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_A_Bedienbezeichner_Frei_TypeClass(ZN_A_Bedienbezeichner_Frei_TypeClass zN_A_Bedienbezeichner_Frei_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_A_Bedienbezeichner_Frei_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_A_Bezeichner_TypeClass(ZN_A_Bezeichner_TypeClass zN_A_Bezeichner_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_A_Bezeichner_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Akustik(ZN_Akustik zN_Akustik, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Akustik, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Akustik_Anzeigefeld_AttributeGroup(ZN_Akustik_Anzeigefeld_AttributeGroup zN_Akustik_Anzeigefeld_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Akustik_Anzeigefeld_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Allg_AttributeGroup(ZN_Allg_AttributeGroup zN_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Anlagentyp_TypeClass(ZN_Anlagentyp_TypeClass zN_Anlagentyp_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Anlagentyp_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Anzeigefeld(ZN_Anzeigefeld zN_Anzeigefeld, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Anzeigefeld, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Anzeigefeld_Allg_AttributeGroup(ZN_Anzeigefeld_Allg_AttributeGroup zN_Anzeigefeld_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Anzeigefeld_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Anzeigefeld_Bezeichnung_AttributeGroup(ZN_Anzeigefeld_Bezeichnung_AttributeGroup zN_Anzeigefeld_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Anzeigefeld_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Anzeigefeld_Loeschkriterium_TypeClass(ZN_Anzeigefeld_Loeschkriterium_TypeClass zN_Anzeigefeld_Loeschkriterium_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Anzeigefeld_Loeschkriterium_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Feld_Ohne_Anzeige_TypeClass(ZN_Feld_Ohne_Anzeige_TypeClass zN_Feld_Ohne_Anzeige_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Feld_Ohne_Anzeige_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Fortschalt_Krit_Druck_AttributeGroup(ZN_Fortschalt_Krit_Druck_AttributeGroup zN_Fortschalt_Krit_Druck_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Fortschalt_Krit_Druck_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Fortschalt_Krit_Schalt_AttributeGroup(ZN_Fortschalt_Krit_Schalt_AttributeGroup zN_Fortschalt_Krit_Schalt_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Fortschalt_Krit_Schalt_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Fortschalt_Kriterium(ZN_Fortschalt_Kriterium zN_Fortschalt_Kriterium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Fortschalt_Kriterium, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Modem_TypeClass(ZN_Modem_TypeClass zN_Modem_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Modem_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Schaltkriterium_TypeClass(ZN_Schaltkriterium_TypeClass zN_Schaltkriterium_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Schaltkriterium_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Telegramm_84_Zuordnung(ZN_Telegramm_84_Zuordnung zN_Telegramm_84_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Telegramm_84_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Telegramm_85_Zuordnung(ZN_Telegramm_85_Zuordnung zN_Telegramm_85_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Telegramm_85_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Unterstation(ZN_Unterstation zN_Unterstation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Unterstation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Unterstation_Allg_AttributeGroup(ZN_Unterstation_Allg_AttributeGroup zN_Unterstation_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Unterstation_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_Unterstation_Bf_Nr_AttributeGroup(ZN_Unterstation_Bf_Nr_AttributeGroup zN_Unterstation_Bf_Nr_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_Unterstation_Bf_Nr_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_ZBS(ZN_ZBS zN_ZBS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zN_ZBS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugvorbereitungsmeldung_TypeClass(Zugvorbereitungsmeldung_TypeClass zugvorbereitungsmeldung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugvorbereitungsmeldung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAkustikAnbAnn(ENUMAkustikAnbAnn enumAkustikAnbAnn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAkustikSonst(ENUMAkustikSonst enumAkustikSonst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBfKennung(ENUMBfKennung enumBfKennung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFunktionalitaetAnzeigefeld(ENUMFunktionalitaetAnzeigefeld enumFunktionalitaetAnzeigefeld, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZBSSchnittstelle(ENUMZBSSchnittstelle enumzbsSchnittstelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNAnlagentyp(ENUMZNAnlagentyp enumznAnlagentyp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNAnzeigefeldLoeschkriterium(ENUMZNAnzeigefeldLoeschkriterium enumznAnzeigefeldLoeschkriterium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNModem(ENUMZNModem enumznModem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNSchaltkriterium(ENUMZNSchaltkriterium enumznSchaltkriterium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnschlussnummer_Type(BigInteger anschlussnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBesonderes_Schaltkriterium_Type(String besonderes_Schaltkriterium_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(besonderes_Schaltkriterium_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Besondere_Anlage_Type(String bezeichnung_Besondere_Anlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_Besondere_Anlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Nr_Type(BigInteger bf_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBf_Nr_Type_Pattern(bf_Nr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBf_Nr_Type_Pattern
	 */
	public static final  PatternMatcher [][] BF_NR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0[1-9]|[1-9][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bf Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBf_Nr_Type_Pattern(BigInteger bf_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.BF_NR_TYPE, bf_Nr_Type, BF_NR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAkustikAnbAnnObject(ENUMAkustikAnbAnn enumAkustikAnbAnnObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAkustikSonstObject(ENUMAkustikSonst enumAkustikSonstObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBfKennungObject(ENUMBfKennung enumBfKennungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFunktionalitaetAnzeigefeldObject(ENUMFunktionalitaetAnzeigefeld enumFunktionalitaetAnzeigefeldObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZBSSchnittstelleObject(ENUMZBSSchnittstelle enumzbsSchnittstelleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNAnlagentypObject(ENUMZNAnlagentyp enumznAnlagentypObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNAnzeigefeldLoeschkriteriumObject(ENUMZNAnzeigefeldLoeschkriterium enumznAnzeigefeldLoeschkriteriumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNModemObject(ENUMZNModem enumznModemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZNSchaltkriteriumObject(ENUMZNSchaltkriterium enumznSchaltkriteriumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adresse_Type(String iP_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIP_Adresse_Type_Pattern(iP_Adresse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIP_Adresse_Type_Pattern
	 */
	public static final  PatternMatcher [][] IP_ADRESSE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{1,3}\\.){3}[0-9]{1,3}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>IP Adresse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adresse_Type_Pattern(String iP_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.IP_ADRESSE_TYPE, iP_Adresse_Type, IP_ADRESSE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_Type(BigInteger prioritaet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Max_Type(BigInteger unterstation_Max_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUnterstation_Max_Type_Pattern(unterstation_Max_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnterstation_Max_Type_Pattern
	 */
	public static final  PatternMatcher [][] UNTERSTATION_MAX_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|[1-3][0-9]|40")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unterstation Max Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Max_Type_Pattern(BigInteger unterstation_Max_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.UNTERSTATION_MAX_TYPE, unterstation_Max_Type, UNTERSTATION_MAX_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Nr_Type(String unterstation_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUnterstation_Nr_Type_Pattern(unterstation_Nr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnterstation_Nr_Type_Pattern
	 */
	public static final  PatternMatcher [][] UNTERSTATION_NR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0[1-9]|[1-3][0-9]|40")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unterstation Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnterstation_Nr_Type_Pattern(String unterstation_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.UNTERSTATION_NR_TYPE, unterstation_Nr_Type, UNTERSTATION_NR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerzoegerung_Manuell_Loeschung_Type(BigDecimal verzoegerung_Manuell_Loeschung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(verzoegerung_Manuell_Loeschung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Adresse_Type(String zbS_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZBS_Adresse_Type_Pattern(zbS_Adresse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZBS_Adresse_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZBS_ADRESSE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-F][0-9]|[C-F][A-F]|[AB][C-F]|AB|BA")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ZBS Adresse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Adresse_Type_Pattern(String zbS_Adresse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.ZBS_ADRESSE_TYPE, zbS_Adresse_Type, ZBS_ADRESSE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Nr_Type(BigInteger zlV_Bus_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZLV_Bus_Nr_Type_Pattern(zlV_Bus_Nr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZLV_Bus_Nr_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZLV_BUS_NR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ZLV Bus Nr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLV_Bus_Nr_Type_Pattern(BigInteger zlV_Bus_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_NR_TYPE, zlV_Bus_Nr_Type, ZLV_BUS_NR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_A_Bedienbezeichner_Frei_Type(String zN_A_Bedienbezeichner_Frei_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZN_A_Bedienbezeichner_Frei_Type_Pattern(zN_A_Bedienbezeichner_Frei_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZN_A_Bedienbezeichner_Frei_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZN_ABEDIENBEZEICHNER_FREI_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{4,7}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ZN ABedienbezeichner Frei Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_A_Bedienbezeichner_Frei_Type_Pattern(String zN_A_Bedienbezeichner_Frei_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ZugnummernmeldeanlagePackage.Literals.ZN_ABEDIENBEZEICHNER_FREI_TYPE, zN_A_Bedienbezeichner_Frei_Type, ZN_ABEDIENBEZEICHNER_FREI_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZN_A_Bezeichner_Type(BigInteger zN_A_Bezeichner_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ZugnummernmeldeanlageValidator
