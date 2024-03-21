/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.*;

import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.planpro.BasisTypen.ENUMWirkrichtung;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage
 * @generated
 */
public class Balisentechnik_ETCSValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Balisentechnik_ETCSValidator INSTANCE = new Balisentechnik_ETCSValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Balisentechnik_ETCS";

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
	public Balisentechnik_ETCSValidator() {
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
	  return Balisentechnik_ETCSPackage.eINSTANCE;
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
			case Balisentechnik_ETCSPackage.ABSTAND_BES_LANGER_EINFAHRWEG_TYPE_CLASS:
				return validateAbstand_Bes_Langer_Einfahrweg_TypeClass((Abstand_Bes_Langer_Einfahrweg_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EH_EM_FOLGESIGNAL_TYPE_CLASS:
				return validateAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass((Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EP_TPI_TYPE_CLASS:
				return validateAbstand_Datenpunkt_EP_TPI_TypeClass((Abstand_Datenpunkt_EP_TPI_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL_TYPE_CLASS:
				return validateAbstand_Datenpunkt_TPI_Folgesignal_TypeClass((Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_EINMESSPUNKT_TYPE_CLASS:
				return validateAbstand_Einmesspunkt_TypeClass((Abstand_Einmesspunkt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE_CLASS:
				return validateAbstand_Grenze_Bereich_C_TypeClass((Abstand_Grenze_Bereich_C_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_REDUZIERT_TYPE_CLASS:
				return validateAbstand_Reduziert_TypeClass((Abstand_Reduziert_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE_CLASS:
				return validateAnlagenteil_Sonstige_TypeClass((Anlagenteil_Sonstige_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE_CLASS:
				return validateAnordnung_Im_DP_TypeClass((Anordnung_Im_DP_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANWENDUNG_ESG_TYPE_CLASS:
				return validateAnwendung_ESG_TypeClass((Anwendung_ESG_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANWENDUNG_GNT_TYPE_CLASS:
				return validateAnwendung_GNT_TypeClass((Anwendung_GNT_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE_CLASS:
				return validateAnwendung_Sonst_TypeClass((Anwendung_Sonst_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANWENDUNGSSYSTEM_TYPE_CLASS:
				return validateAnwendungssystem_TypeClass((Anwendungssystem_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE_CLASS:
				return validateAnzahl_Voll_LEU_Kalkuliert_TypeClass((Anzahl_Voll_LEU_Kalkuliert_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE_CLASS:
				return validateAnzeigetext_TypeClass((Anzeigetext_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ART_BEDINGUNG_TYPE_CLASS:
				return validateArt_Bedingung_TypeClass((Art_Bedingung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE_CLASS:
				return validateAusgang_Nr_TypeClass((Ausgang_Nr_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.AUSRICHTUNG_TYPE_CLASS:
				return validateAusrichtung_TypeClass((Ausrichtung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.AUSSTIEG_ETCS_SPERRE_TYPE_CLASS:
				return validateAusstieg_ETCS_Sperre_TypeClass((Ausstieg_ETCS_Sperre_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BALISE:
				return validateBalise((Balise)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP:
				return validateBalise_Allg_AttributeGroup((Balise_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BALISE_GERAETESTAND_TYPE_CLASS:
				return validateBalise_Geraetestand_TypeClass((Balise_Geraetestand_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BALISENHALTER_TYPE_CLASS:
				return validateBalisenhalter_TypeClass((Balisenhalter_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BASELINE_SYSTEM_VERSION_TYPE_CLASS:
				return validateBaseline_System_Version_TypeClass((Baseline_System_Version_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP:
				return validateBedingung_Besondere_AttributeGroup((Bedingung_Besondere_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP:
				return validateBedingung_PZB_AttributeGroup((Bedingung_PZB_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP:
				return validateBedingung_Signal_AttributeGroup((Bedingung_Signal_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP:
				return validateBedingung_Sonstige_AttributeGroup((Bedingung_Sonstige_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP:
				return validateBedingung_Weiche_AttributeGroup((Bedingung_Weiche_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE_CLASS:
				return validateBedingung_Weichenlage_TypeClass((Bedingung_Weichenlage_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE_CLASS:
				return validateBez_Strecke_BTS_1_TypeClass((Bez_Strecke_BTS_1_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE_CLASS:
				return validateBez_Strecke_BTS_2_TypeClass((Bez_Strecke_BTS_2_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE_CLASS:
				return validateBez_Strecke_BTS_3_TypeClass((Bez_Strecke_BTS_3_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE_CLASS:
				return validateBez_ZUB_Bereichsgrenze_TypeClass((Bez_ZUB_Bereichsgrenze_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE_CLASS:
				return validateBezeichnung_ETCS_Kante_TypeClass((Bezeichnung_ETCS_Kante_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE_CLASS:
				return validateBezeichnung_LEU_Anlage_TypeClass((Bezeichnung_LEU_Anlage_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE_CLASS:
				return validateBezeichnung_ZUB_SE_TypeClass((Bezeichnung_ZUB_SE_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE_CLASS:
				return validateBezeichnung_ZUB_TypeClass((Bezeichnung_ZUB_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_ESG_BED_AUSSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup((Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_L2_BED_EINSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup((Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_LZB_BED_EINSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup((Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup((Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup((Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_ZBS_BED_EINSTIEG_ATTRIBUTE_GROUP:
				return validateBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup((Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP:
				return validateBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup((Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BINAERDATEN:
				return validateBinaerdaten((Binaerdaten)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP:
				return validateBinaerdaten_Datei_AttributeGroup((Binaerdaten_Datei_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE_CLASS:
				return validateD_LEVELTR_TypeClass((D_LEVELTR_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATEINAME_TYPE_CLASS:
				return validateDateiname_TypeClass((Dateiname_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE_CLASS:
				return validateDateityp_Binaerdatei_TypeClass((Dateityp_Binaerdatei_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATEN_TYPE_CLASS:
				return validateDaten_TypeClass((Daten_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT:
				return validateDatenpunkt((Datenpunkt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP:
				return validateDatenpunkt_Allg_AttributeGroup((Datenpunkt_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE_CLASS:
				return validateDatenpunkt_Beschreibung_TypeClass((Datenpunkt_Beschreibung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP:
				return validateDatenpunkt_Einmesspunkt_AttributeGroup((Datenpunkt_Einmesspunkt_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE_CLASS:
				return validateDatenpunkt_Laenge_TypeClass((Datenpunkt_Laenge_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK:
				return validateDatenpunkt_Link((Datenpunkt_Link)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE_CLASS:
				return validateDelta_VGES_TypeClass((Delta_VGES_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE_CLASS:
				return validateDelta_VLES_TypeClass((Delta_VLES_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE_CLASS:
				return validateDelta_VZES_TypeClass((Delta_VZES_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_ATO_TYPE_CLASS:
				return validateDP_ATO_TypeClass((DP_ATO_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ART_TYPE_CLASS:
				return validateDP_Bezug_Funktional_Art_TypeClass((DP_Bezug_Funktional_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP:
				return validateDP_Bezug_Funktional_AttributeGroup((DP_Bezug_Funktional_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP:
				return validateDP_ETCS_Adresse_AttributeGroup((DP_ETCS_Adresse_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_LINK_ART_TYPE_CLASS:
				return validateDP_Link_Art_TypeClass((DP_Link_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ATTRIBUTE_GROUP:
				return validateDP_Telegramm_AttributeGroup((DP_Telegramm_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP:
				return validateDP_Telegramm_ESG_AttributeGroup((DP_Telegramm_ESG_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ART_TYPE_CLASS:
				return validateDP_Typ_Art_TypeClass((DP_Typ_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP:
				return validateDP_Typ_AttributeGroup((DP_Typ_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ESG_TYPE_CLASS:
				return validateDP_Typ_ESG_TypeClass((DP_Typ_ESG_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE_CLASS:
				return validateDP_Typ_ETCS_TypeClass((DP_Typ_ETCS_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP:
				return validateDP_Typ_GESG_AttributeGroup((DP_Typ_GESG_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP:
				return validateDP_Typ_GETCS_AttributeGroup((DP_Typ_GETCS_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP:
				return validateDP_Typ_GGNT_AttributeGroup((DP_Typ_GGNT_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GNT_TYPE_CLASS:
				return validateDP_Typ_GNT_TypeClass((DP_Typ_GNT_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP:
				return validateDP_Typ_GSonst_AttributeGroup((DP_Typ_GSonst_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP:
				return validateDP_Typ_GTrans_AttributeGroup((DP_Typ_GTrans_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP:
				return validateDP_Typ_GZBS_AttributeGroup((DP_Typ_GZBS_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE_CLASS:
				return validateDP_Typ_Sonst_TypeClass((DP_Typ_Sonst_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_TRANS_TYPE_CLASS:
				return validateDP_Typ_Trans_TypeClass((DP_Typ_Trans_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE_CLASS:
				return validateDP_Typ_V_La_TypeClass((DP_Typ_V_La_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ZBS_TYPE_CLASS:
				return validateDP_Typ_ZBS_TypeClass((DP_Typ_ZBS_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_VERLINKT_TYPE_CLASS:
				return validateDP_Verlinkt_TypeClass((DP_Verlinkt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DUNKELSCHALTANSTOSS_TYPE_CLASS:
				return validateDunkelschaltanstoss_TypeClass((Dunkelschaltanstoss_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE_CLASS:
				return validateDWeg_Intervall_200_TypeClass((DWeg_Intervall_200_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE_CLASS:
				return validateDWeg_Intervall_50_200_TypeClass((DWeg_Intervall_50_200_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE_CLASS:
				return validateDWeg_Intervall_50_TypeClass((DWeg_Intervall_50_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EINGANG_GEPUFFERT_TYPE_CLASS:
				return validateEingang_Gepuffert_TypeClass((Eingang_Gepuffert_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EINSTIEG_ERLAUBT_TYPE_CLASS:
				return validateEinstieg_Erlaubt_TypeClass((Einstieg_Erlaubt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EINSTIEG_OHNE_RUECKW_SIG_TYPE_CLASS:
				return validateEinstieg_Ohne_Rueckw_Sig_TypeClass((Einstieg_Ohne_Rueckw_Sig_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EINZELDATEI_ART_TYPE_CLASS:
				return validateEinzeldatei_Art_TypeClass((Einzeldatei_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENERGIE_EINGANG_ART_TYPE_CLASS:
				return validateEnergie_Eingang_Art_TypeClass((Energie_Eingang_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE_CLASS:
				return validateESG_Ind_Erlaeuterung_TypeClass((ESG_Ind_Erlaeuterung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE_CLASS:
				return validateESG_Ind_Parameter_TypeClass((ESG_Ind_Parameter_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE_CLASS:
				return validateESG_Ind_Parameterwert_TypeClass((ESG_Ind_Parameterwert_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP:
				return validateESG_Individuelle_Merkmale_AttributeGroup((ESG_Individuelle_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP:
				return validateESG_Spezifische_Merkmale_AttributeGroup((ESG_Spezifische_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP:
				return validateETCS_Adresse_AttributeGroup((ETCS_Adresse_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND_TYPE_CLASS:
				return validateETCS_Gefahrpunktabstand_Abweichend_TypeClass((ETCS_Gefahrpunktabstand_Abweichend_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_KANTE:
				return validateETCS_Kante((ETCS_Kante)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateETCS_Kante_Bezeichnung_AttributeGroup((ETCS_Kante_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN:
				return validateETCS_Knoten((ETCS_Knoten)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN_ART_SONSTIGE_TYPE_CLASS:
				return validateETCS_Knoten_Art_Sonstige_TypeClass((ETCS_Knoten_Art_Sonstige_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE_CLASS:
				return validateETCS_Paketnummer_TypeClass((ETCS_Paketnummer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE_CLASS:
				return validateETCS_Par_Erlaeuterung_TypeClass((ETCS_Par_Erlaeuterung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE_CLASS:
				return validateETCS_Parametername_TypeClass((ETCS_Parametername_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE_CLASS:
				return validateETCS_Parameterwert_TypeClass((ETCS_Parameterwert_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE:
				return validateETCS_Richtungsanzeige((ETCS_Richtungsanzeige)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL:
				return validateETCS_Signal((ETCS_Signal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP:
				return validateETCS_Signal_Allg_AttributeGroup((ETCS_Signal_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP:
				return validateETCS_Signal_DWeg_AttributeGroup((ETCS_Signal_DWeg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP:
				return validateETCS_Signal_TBV_AttributeGroup((ETCS_Signal_TBV_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SYSTEM_VERSION_TYPE_CLASS:
				return validateETCS_System_Version_TypeClass((ETCS_System_Version_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_WKR:
				return validateETCS_W_Kr((ETCS_W_Kr)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP:
				return validateETCS_W_Kr_MUKA_AttributeGroup((ETCS_W_Kr_MUKA_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL:
				return validateEV_Modul((EV_Modul)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_ART_TYPE_CLASS:
				return validateEV_Modul_Art_TypeClass((EV_Modul_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP:
				return validateEV_Modul_Ausgang_AttributeGroup((EV_Modul_Ausgang_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP:
				return validateEV_Modul_Eingang_AttributeGroup((EV_Modul_Eingang_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP:
				return validateEV_Modul_Physisch_AttributeGroup((EV_Modul_Physisch_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE_CLASS:
				return validateEV_Modul_Typ_TypeClass((EV_Modul_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP:
				return validateEV_Modul_Virtuell_AttributeGroup((EV_Modul_Virtuell_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE_CLASS:
				return validateFabrikat_TypeClass((Fabrikat_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM:
				return validateFachtelegramm((Fachtelegramm)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG:
				return validateFT_Anschaltbedingung((FT_Anschaltbedingung)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP:
				return validateFT_ESG_Merkmale_AttributeGroup((FT_ESG_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE_CLASS:
				return validateFT_ESG_Subtyp_TypeClass((FT_ESG_Subtyp_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE_CLASS:
				return validateFT_ESG_Typ_TypeClass((FT_ESG_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP:
				return validateFT_ETCS_L2_Merkmale_AttributeGroup((FT_ETCS_L2_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE_CLASS:
				return validateFT_ETCS_L2_Typ_TypeClass((FT_ETCS_L2_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP:
				return validateFT_ETCS_Trans_Merkmale_AttributeGroup((FT_ETCS_Trans_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP:
				return validateFT_ETCS_Trans_Paket_41_AttributeGroup((FT_ETCS_Trans_Paket_41_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_NATTRIBUTE_GROUP:
				return validateFT_ETCS_Trans_Paket_N_AttributeGroup((FT_ETCS_Trans_Paket_N_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL:
				return validateFT_Fahrweg_Teil((FT_Fahrweg_Teil)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP:
				return validateFT_Fahrweg_Teil_Allg_AttributeGroup((FT_Fahrweg_Teil_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP:
				return validateFT_Fahrweg_Teile_AttributeGroup((FT_Fahrweg_Teile_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP:
				return validateFT_GNT_Merkmale_AttributeGroup((FT_GNT_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_GNT_PUNKTART_TYPE_CLASS:
				return validateFT_GNT_Punktart_TypeClass((FT_GNT_Punktart_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_HINWEIS_FUNKTION_TYPE_CLASS:
				return validateFT_Hinweis_Funktion_TypeClass((FT_Hinweis_Funktion_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP:
				return validateFT_ZBS_Merkmale_AttributeGroup((FT_ZBS_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP:
				return validateFT_ZBS_Merkmale_La_AttributeGroup((FT_ZBS_Merkmale_La_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ZBS_TYP_TYPE_CLASS:
				return validateFT_ZBS_Typ_TypeClass((FT_ZBS_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FW_TEIL_NUMMER_TYPE_CLASS:
				return validateFW_Teil_Nummer_TypeClass((FW_Teil_Nummer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE_CLASS:
				return validateGruppen_ID_TypeClass((Gruppen_ID_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.HARTER_AUSSTIEG_AUS_L2_TYPE_CLASS:
				return validateHarter_Ausstieg_Aus_L2_TypeClass((Harter_Ausstieg_Aus_L2_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.HERSTELLER_TYPE_CLASS:
				return validateHersteller_TypeClass((Hersteller_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE_CLASS:
				return validateHinweis_Balisenbefestigung_TypeClass((Hinweis_Balisenbefestigung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.INDIVIDUALISIERUNG_WEITERE_TYPE_CLASS:
				return validateIndividualisierung_Weitere_TypeClass((Individualisierung_Weitere_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.IST_BEFAHREN_TYPE_CLASS:
				return validateIst_Befahren_TypeClass((Ist_Befahren_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE_CLASS:
				return validateKm_BTS_1_TypeClass((Km_BTS_1_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE_CLASS:
				return validateKm_BTS_2_TypeClass((Km_BTS_2_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE_CLASS:
				return validateKm_BTS_3_TypeClass((Km_BTS_3_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP:
				return validateKnoten_Auf_TOP_Kante_AttributeGroup((Knoten_Auf_TOP_Kante_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE_CLASS:
				return validateKonfigurationskennung_TypeClass((Konfigurationskennung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE_CLASS:
				return validateL_ACKLEVELTR_TypeClass((L_ACKLEVELTR_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE_CLASS:
				return validateLaenge_1_TypeClass((Laenge_1_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE_CLASS:
				return validateLaenge_Ausfuehrungsbereich_TypeClass((Laenge_Ausfuehrungsbereich_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_GESTUFTE_VSIGNALISIERUNG_TYPE_CLASS:
				return validateLaenge_Gestufte_V_Signalisierung_TypeClass((Laenge_Gestufte_V_Signalisierung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_SOLL_MIND_150_TYPE_CLASS:
				return validateLaenge_Soll_Mind_150_TypeClass((Laenge_Soll_Mind_150_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEISTUNGSBEDARF_TYPE_CLASS:
				return validateLeistungsbedarf_TypeClass((Leistungsbedarf_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE:
				return validateLEU_Anlage((LEU_Anlage)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateLEU_Anlage_Allg_AttributeGroup((LEU_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ART_TYPE_CLASS:
				return validateLEU_Anlage_Art_TypeClass((LEU_Anlage_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateLEU_Anlage_Bezeichnung_AttributeGroup((LEU_Anlage_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE_CLASS:
				return validateLEU_Ausgang_Nr_TypeClass((LEU_Ausgang_Nr_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL:
				return validateLEU_Modul((LEU_Modul)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP:
				return validateLEU_Modul_Allg_AttributeGroup((LEU_Modul_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_ART_TYPE_CLASS:
				return validateLEU_Modul_Art_TypeClass((LEU_Modul_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP:
				return validateLEU_Modul_Ausgang_AttributeGroup((LEU_Modul_Ausgang_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateLEU_Modul_Bezeichnung_AttributeGroup((LEU_Modul_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_GERAETESTAND_TYPE_CLASS:
				return validateLEU_Modul_Geraetestand_TypeClass((LEU_Modul_Geraetestand_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE_CLASS:
				return validateLEU_Modul_Typ_TypeClass((LEU_Modul_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN:
				return validateLEU_Schaltkasten((LEU_Schaltkasten)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateLEU_Schaltkasten_Bezeichnung_AttributeGroup((LEU_Schaltkasten_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP:
				return validateLEU_Schaltkasten_Energie_AttributeGroup((LEU_Schaltkasten_Energie_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP:
				return validateLEU_Schaltkasten_Position_AttributeGroup((LEU_Schaltkasten_Position_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE_CLASS:
				return validateLEU_Schaltkasten_Typ_TypeClass((LEU_Schaltkasten_Typ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP:
				return validateLEU_Steuernde_AttributeGroup((LEU_Steuernde_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE_CLASS:
				return validateLfd_Nr_Am_Bezugspunkt_TypeClass((Lfd_Nr_Am_Bezugspunkt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE_CLASS:
				return validateLink_Distanz_TypeClass((Link_Distanz_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LLA_TYPE_CLASS:
				return validateLLA_TypeClass((LLA_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LM_GTYPE_CLASS:
				return validateLM_G_TypeClass((LM_G_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP:
				return validateLT_Binaerdatei_Hilfe_AttributeGroup((LT_Binaerdatei_Hilfe_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP:
				return validateLT_Binaerdaten_AttributeGroup((LT_Binaerdaten_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM:
				return validateLuft_Telegramm((Luft_Telegramm)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MLEVELTR_TYPE_CLASS:
				return validateM_LEVELTR_TypeClass((M_LEVELTR_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE_CLASS:
				return validateMassgebende_Neig_1_TypeClass((Massgebende_Neig_1_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE_CLASS:
				return validateMassgebende_Neig_Schutzstrecke_TypeClass((Massgebende_Neig_Schutzstrecke_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_150_TYPE_CLASS:
				return validateMassgebende_Neigung_Mind_150_TypeClass((Massgebende_Neigung_Mind_150_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_150_TYPE_CLASS:
				return validateMassgebende_Neigung_Mind_Sig_150_TypeClass((Massgebende_Neigung_Mind_Sig_150_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_TYPE_CLASS:
				return validateMassgebende_Neigung_Mind_Sig_TypeClass((Massgebende_Neigung_Mind_Sig_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASTSCHILD_TYPE_CLASS:
				return validateMastschild_TypeClass((Mastschild_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE_CLASS:
				return validateMax_Leistung_TypeClass((Max_Leistung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE_CLASS:
				return validateMax_Unterbrechungszeit_TypeClass((Max_Unterbrechungszeit_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP:
				return validateMetallteil_AttributeGroup((Metallteil_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.METALLTEIL_KATEGORIE_TYPE_CLASS:
				return validateMetallteil_Kategorie_TypeClass((Metallteil_Kategorie_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.METALLTEIL_LAENGE_TYPE_CLASS:
				return validateMetallteil_Laenge_TypeClass((Metallteil_Laenge_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE_CLASS:
				return validateModulnummer_TypeClass((Modulnummer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MONTAGEABWEICHUNG_TYPE_CLASS:
				return validateMontageabweichung_TypeClass((Montageabweichung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE_CLASS:
				return validateNeigung_TypeClass((Neigung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE_CLASS:
				return validateNennleistung_TypeClass((Nennleistung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_BG_TYPE_CLASS:
				return validateNID_BG_TypeClass((NID_BG_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_CTYPE_CLASS:
				return validateNID_C_TypeClass((NID_C_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE_CLASS:
				return validateNID_RBC_TypeClass((NID_RBC_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_STM_TYPE_CLASS:
				return validateNID_STM_TypeClass((NID_STM_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_TSR_TYPE_CLASS:
				return validateNID_TSR_TypeClass((NID_TSR_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE_CLASS:
				return validateNummer_Schaltkasten_TypeClass((Nummer_Schaltkasten_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE_CLASS:
				return validateOberstrombegrenzung_Gueterzug_TypeClass((Oberstrombegrenzung_Gueterzug_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE_CLASS:
				return validateOberstrombegrenzung_Reisezug_TypeClass((Oberstrombegrenzung_Reisezug_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE_CLASS:
				return validatePort_Nr_Ausg_Physisch_TypeClass((Port_Nr_Ausg_Physisch_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE_CLASS:
				return validatePosition_Sonstige_TypeClass((Position_Sonstige_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.POSITION_TYPE_CLASS:
				return validatePosition_TypeClass((Position_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PRIMAERQUELLE_TYPE_CLASS:
				return validatePrimaerquelle_TypeClass((Primaerquelle_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE_CLASS:
				return validatePrioritaet_TypeClass((Prioritaet_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP:
				return validateProg_Datei_Einzel_AttributeGroup((Prog_Datei_Einzel_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE:
				return validateProg_Datei_Gruppe((Prog_Datei_Gruppe)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PROJEKTIERUNGSFALL_TYPE_CLASS:
				return validateProjektierungsfall_TypeClass((Projektierungsfall_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC:
				return validateRBC((RBC)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP:
				return validateRBC_Allg_AttributeGroup((RBC_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC_ETCS_SYSTEM_VERSION_TYPE_CLASS:
				return validateRBC_ETCS_System_Version_TypeClass((RBC_ETCS_System_Version_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE_CLASS:
				return validateRBC_SRS_Version_TypeClass((RBC_SRS_Version_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE_CLASS:
				return validateRekursion_2_Nr_TypeClass((Rekursion_2_Nr_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE_CLASS:
				return validateRekursion_Nr_TypeClass((Rekursion_Nr_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE_CLASS:
				return validateRufnummer_TypeClass((Rufnummer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SBE_TYPE_CLASS:
				return validateSBE_TypeClass((SBE_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE_CLASS:
				return validateSchutzstrecke_Erforderlich_TypeClass((Schutzstrecke_Erforderlich_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE_CLASS:
				return validateSchutzstrecke_Vorhanden_TypeClass((Schutzstrecke_Vorhanden_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_150_TYPE_CLASS:
				return validateSolllaenge_Mind_Sig_150_TypeClass((Solllaenge_Mind_Sig_150_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_TYPE_CLASS:
				return validateSolllaenge_Mind_Sig_TypeClass((Solllaenge_Mind_Sig_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE_CLASS:
				return validateSonstige_Standortangabe_TypeClass((Sonstige_Standortangabe_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SPANNUNG_ART_TYPE_CLASS:
				return validateSpannung_Art_TypeClass((Spannung_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE_CLASS:
				return validateSpannung_Toleranz_Obere_TypeClass((Spannung_Toleranz_Obere_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE_CLASS:
				return validateSpannung_Toleranz_Untere_TypeClass((Spannung_Toleranz_Untere_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE_CLASS:
				return validateSRS_Version_TypeClass((SRS_Version_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.STANDORTANGABE_BALISENSCHILD_TYPE_CLASS:
				return validateStandortangabe_Balisenschild_TypeClass((Standortangabe_Balisenschild_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP:
				return validateStart_W_Element_AttributeGroup((Start_W_Element_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.STZ_TYPE_CLASS:
				return validateSTZ_TypeClass((STZ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE_CLASS:
				return validateSystem_Vor_Grenze_Besonders_TypeClass((System_Vor_Grenze_Besonders_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_TYPE_CLASS:
				return validateSystem_Vor_Grenze_TypeClass((System_Vor_Grenze_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TBV_MELDEPUNKT_TYPE_CLASS:
				return validateTBV_Meldepunkt_TypeClass((TBV_Meldepunkt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE_CLASS:
				return validateTBV_Tunnelbereich_Laenge_TypeClass((TBV_Tunnelbereich_Laenge_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TBV_TUNNELSIGNAL_TYPE_CLASS:
				return validateTBV_Tunnelsignal_TypeClass((TBV_Tunnelsignal_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TELEGRAMM_INDEX_TYPE_CLASS:
				return validateTelegramm_Index_TypeClass((Telegramm_Index_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE_CLASS:
				return validateTelegrammnummer_TypeClass((Telegrammnummer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE_CLASS:
				return validateText_Bedingung_TypeClass((Text_Bedingung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TEXTMELDUNG_TYPE_CLASS:
				return validateTextmeldung_TypeClass((Textmeldung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE_CLASS:
				return validateUeberbrueckung_EV_Unterbrechung_TypeClass((Ueberbrueckung_EV_Unterbrechung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UEBERWACHUNG_LAENGE_TYPE_CLASS:
				return validateUeberwachung_Laenge_TypeClass((Ueberwachung_Laenge_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UMFAHRSTRASSE_TYPE_CLASS:
				return validateUmfahrstrasse_TypeClass((Umfahrstrasse_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE_CLASS:
				return validateUntergruppen_ID_TypeClass((Untergruppen_ID_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE_CLASS:
				return validateV_Befehl_R_TypeClass((V_Befehl_R_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE_CLASS:
				return validateV_Befehl_Z_TypeClass((V_Befehl_Z_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VFREI_TYPE_CLASS:
				return validateV_Frei_TypeClass((V_Frei_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VSTART_TYPE_CLASS:
				return validateV_Start_TypeClass((V_Start_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZIEL_TYPE_CLASS:
				return validateV_Ziel_TypeClass((V_Ziel_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE_CLASS:
				return validateV_Zul_Strecke_TypeClass((V_Zul_Strecke_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_KENNUNG_TYPE_CLASS:
				return validateVBC_Kennung_TypeClass((VBC_Kennung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_NID_CTYPE_CLASS:
				return validateVBC_NID_C_TypeClass((VBC_NID_C_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_SETZEN_TYPE_CLASS:
				return validateVBC_Setzen_TypeClass((VBC_Setzen_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_TIMER_TYPE_CLASS:
				return validateVBC_Timer_TypeClass((VBC_Timer_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE_CLASS:
				return validateVerbot_Anhalten_TypeClass((Verbot_Anhalten_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERBOT_REGENERATIVE_BREMSE_TYPE_CLASS:
				return validateVerbot_Regenerative_Bremse_TypeClass((Verbot_Regenerative_Bremse_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERBOT_WB_ART_TYPE_CLASS:
				return validateVerbot_WB_Art_TypeClass((Verbot_WB_Art_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERKUERZTER_ABSTAND_TYPE_CLASS:
				return validateVerkuerzter_Abstand_TypeClass((Verkuerzter_Abstand_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERWENDUNG_ALS_RUECKFALL_TYPE_CLASS:
				return validateVerwendung_Als_Rueckfall_TypeClass((Verwendung_Als_Rueckfall_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERWENDUNG_HILFE_TYPE_CLASS:
				return validateVerwendung_Hilfe_TypeClass((Verwendung_Hilfe_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE_CLASS:
				return validateVerwendung_TypeClass((Verwendung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_1TYPE_CLASS:
				return validateVGR_1_TypeClass((VGR_1_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_2TYPE_CLASS:
				return validateVGR_2_TypeClass((VGR_2_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_TYPE_CLASS:
				return validateVGR_TypeClass((VGR_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VLA_TYPE_CLASS:
				return validateVLA_TypeClass((VLA_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VORSIGNALABSTAND_TYPE_CLASS:
				return validateVorsignalabstand_TypeClass((Vorsignalabstand_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZ_TYPE_CLASS:
				return validateVZ_TypeClass((VZ_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.WANSCHLUSS_TYPE_CLASS:
				return validateW_Anschluss_TypeClass((W_Anschluss_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.WLAGE_TYPE_CLASS:
				return validateW_Lage_TypeClass((W_Lage_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE_CLASS:
				return validateWirkrichtung_In_Datenpunkt_TypeClass((Wirkrichtung_In_Datenpunkt_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.WIRKSAM_TYPE_CLASS:
				return validateWirksam_TypeClass((Wirksam_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE_CLASS:
				return validateZBS_La_Bereich_Distanz_TypeClass((ZBS_La_Bereich_Distanz_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE_CLASS:
				return validateZBS_La_Bereich_Geschwindigkeit_TypeClass((ZBS_La_Bereich_Geschwindigkeit_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE_CLASS:
				return validateZBS_La_Bereich_Laenge_TypeClass((ZBS_La_Bereich_Laenge_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE_CLASS:
				return validateZBS_La_Bereich_Neigung_TypeClass((ZBS_La_Bereich_Neigung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP:
				return validateZBS_Merkmale_AttributeGroup((ZBS_Merkmale_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_REAKTION_TYPE_CLASS:
				return validateZBS_Reaktion_TypeClass((ZBS_Reaktion_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE:
				return validateZBS_Schutzstrecke((ZBS_Schutzstrecke)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP:
				return validateZBS_Schutzstrecke_Allg_AttributeGroup((ZBS_Schutzstrecke_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL:
				return validateZBS_Signal((ZBS_Signal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP:
				return validateZBS_Signal_Signalabstand_AttributeGroup((ZBS_Signal_Signalabstand_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZIEL_DP_AUSRICHTUNG_TYPE_CLASS:
				return validateZiel_DP_Ausrichtung_TypeClass((Ziel_DP_Ausrichtung_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZIEL_IST_FAHRWEGENDE_TYPE_CLASS:
				return validateZiel_Ist_Fahrwegende_TypeClass((Ziel_Ist_Fahrwegende_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP:
				return validateZiel_W_Element_AttributeGroup((Ziel_W_Element_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZLA_TYPE_CLASS:
				return validateZLA_TypeClass((ZLA_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE:
				return validateZUB_Bereichsgrenze((ZUB_Bereichsgrenze)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Allg_AttributeGroup((ZUB_Bereichsgrenze_Allg_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Bezeichnung_AttributeGroup((ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ESG_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_ESG_AttributeGroup((ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_GNT_TYPE_CLASS:
				return validateZUB_Bereichsgrenze_Nach_GNT_TypeClass((ZUB_Bereichsgrenze_Nach_GNT_TypeClass)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_L2_AttributeGroup((ZUB_Bereichsgrenze_Nach_L2_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup((ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_LZB_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_LZB_AttributeGroup((ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup((ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_PZB_AttributeGroup((ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup((ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP:
				return validateZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup((ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP:
				return validateZUB_Bgrenze_RBC_Wechsel_AttributeGroup((ZUB_Bgrenze_RBC_Wechsel_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP:
				return validateZUB_SE_Ausruestung_AttributeGroup((ZUB_SE_Ausruestung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT:
				return validateZUB_Streckeneigenschaft((ZUB_Streckeneigenschaft)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup((ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG:
				return validateENUMArtBedingung((ENUMArtBedingung)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE:
				return validateENUMAusstiegETCSSperre((ENUMAusstiegETCSSperre)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER:
				return validateENUMBalisenhalter((ENUMBalisenhalter)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDPATO:
				return validateENUMDPATO((ENUMDPATO)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART:
				return validateENUMDPBezugFunktionalArt((ENUMDPBezugFunktionalArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART:
				return validateENUMDPLinkArt((ENUMDPLinkArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART:
				return validateENUMDPTypArt((ENUMDPTypArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG:
				return validateENUMDPTypESG((ENUMDPTypESG)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT:
				return validateENUMDPTypGNT((ENUMDPTypGNT)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS:
				return validateENUMDPTypTrans((ENUMDPTypTrans)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS:
				return validateENUMDPTypZBS((ENUMDPTypZBS)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART:
				return validateENUMEinzeldateiArt((ENUMEinzeldateiArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART:
				return validateENUMEnergieEingangArt((ENUMEnergieEingangArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE:
				return validateENUMETCSKnotenArtSonstige((ENUMETCSKnotenArtSonstige)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART:
				return validateENUMEVModulArt((ENUMEVModulArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART:
				return validateENUMFTGNTPunktart((ENUMFTGNTPunktart)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION:
				return validateENUMFTHinweisFunktion((ENUMFTHinweisFunktion)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP:
				return validateENUMFTZBSTyp((ENUMFTZBSTyp)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART:
				return validateENUMLEUArt((ENUMLEUArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR:
				return validateENUMMLEVELTR((ENUMMLEVELTR)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM:
				return validateENUMNIDSTM((ENUMNIDSTM)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_POSITION:
				return validateENUMPosition((ENUMPosition)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMSBE:
				return validateENUMSBE((ENUMSBE)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART:
				return validateENUMSpannungArt((ENUMSpannungArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD:
				return validateENUMStandortangabeBalisenschild((ENUMStandortangabeBalisenschild)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMSTZ:
				return validateENUMSTZ((ENUMSTZ)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART:
				return validateENUMVerbotWBArt((ENUMVerbotWBArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL:
				return validateENUMVerwendungAlsRueckfall((ENUMVerwendungAlsRueckfall)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS:
				return validateENUMWAnschluss((ENUMWAnschluss)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION:
				return validateENUMZBSReaktion((ENUMZBSReaktion)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_BES_LANGER_EINFAHRWEG_TYPE:
				return validateAbstand_Bes_Langer_Einfahrweg_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EH_EM_FOLGESIGNAL_TYPE:
				return validateAbstand_Datenpunkt_EH_EM_Folgesignal_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EP_TPI_TYPE:
				return validateAbstand_Datenpunkt_EP_TPI_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL_TYPE:
				return validateAbstand_Datenpunkt_TPI_Folgesignal_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_EINMESSPUNKT_TYPE:
				return validateAbstand_Einmesspunkt_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE:
				return validateAbstand_Grenze_Bereich_C_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE:
				return validateAnlagenteil_Sonstige_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE:
				return validateAnordnung_Im_DP_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE:
				return validateAnwendung_Sonst_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE:
				return validateAnzahl_Voll_LEU_Kalkuliert_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE:
				return validateAnzeigetext_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE:
				return validateAusgang_Nr_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BALISE_GERAETESTAND_TYPE:
				return validateBalise_Geraetestand_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BASELINE_SYSTEM_VERSION_TYPE:
				return validateBaseline_System_Version_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE:
				return validateBedingung_Weichenlage_Type((ENUMLinksRechts)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE:
				return validateBez_Strecke_BTS_1_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE:
				return validateBez_Strecke_BTS_2_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE:
				return validateBez_Strecke_BTS_3_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE:
				return validateBez_ZUB_Bereichsgrenze_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE:
				return validateBezeichnung_ETCS_Kante_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE:
				return validateBezeichnung_LEU_Anlage_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE:
				return validateBezeichnung_ZUB_SE_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE:
				return validateBezeichnung_ZUB_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE:
				return validateD_LEVELTR_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE:
				return validateDateityp_Binaerdatei_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE:
				return validateDatenpunkt_Beschreibung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE:
				return validateDatenpunkt_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE:
				return validateDelta_VGES_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE:
				return validateDelta_VLES_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE:
				return validateDelta_VZES_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE:
				return validateDP_Typ_ETCS_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE:
				return validateDP_Typ_Sonst_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE:
				return validateDP_Typ_V_La_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE:
				return validateDWeg_Intervall_200_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE:
				return validateDWeg_Intervall_50_200_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE:
				return validateDWeg_Intervall_50_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG_OBJECT:
				return validateENUMArtBedingungObject((ENUMArtBedingung)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE_OBJECT:
				return validateENUMAusstiegETCSSperreObject((ENUMAusstiegETCSSperre)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER_OBJECT:
				return validateENUMBalisenhalterObject((ENUMBalisenhalter)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDPATO_OBJECT:
				return validateENUMDPATOObject((ENUMDPATO)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART_OBJECT:
				return validateENUMDPBezugFunktionalArtObject((ENUMDPBezugFunktionalArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART_OBJECT:
				return validateENUMDPLinkArtObject((ENUMDPLinkArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART_OBJECT:
				return validateENUMDPTypArtObject((ENUMDPTypArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG_OBJECT:
				return validateENUMDPTypESGObject((ENUMDPTypESG)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT_OBJECT:
				return validateENUMDPTypGNTObject((ENUMDPTypGNT)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS_OBJECT:
				return validateENUMDPTypTransObject((ENUMDPTypTrans)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS_OBJECT:
				return validateENUMDPTypZBSObject((ENUMDPTypZBS)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART_OBJECT:
				return validateENUMEinzeldateiArtObject((ENUMEinzeldateiArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART_OBJECT:
				return validateENUMEnergieEingangArtObject((ENUMEnergieEingangArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE_OBJECT:
				return validateENUMETCSKnotenArtSonstigeObject((ENUMETCSKnotenArtSonstige)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART_OBJECT:
				return validateENUMEVModulArtObject((ENUMEVModulArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART_OBJECT:
				return validateENUMFTGNTPunktartObject((ENUMFTGNTPunktart)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION_OBJECT:
				return validateENUMFTHinweisFunktionObject((ENUMFTHinweisFunktion)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP_OBJECT:
				return validateENUMFTZBSTypObject((ENUMFTZBSTyp)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART_OBJECT:
				return validateENUMLEUArtObject((ENUMLEUArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR_OBJECT:
				return validateENUMMLEVELTRObject((ENUMMLEVELTR)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM_OBJECT:
				return validateENUMNIDSTMObject((ENUMNIDSTM)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_POSITION_OBJECT:
				return validateENUMPositionObject((ENUMPosition)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMSBE_OBJECT:
				return validateENUMSBEObject((ENUMSBE)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART_OBJECT:
				return validateENUMSpannungArtObject((ENUMSpannungArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD_OBJECT:
				return validateENUMStandortangabeBalisenschildObject((ENUMStandortangabeBalisenschild)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMSTZ_OBJECT:
				return validateENUMSTZObject((ENUMSTZ)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART_OBJECT:
				return validateENUMVerbotWBArtObject((ENUMVerbotWBArt)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL_OBJECT:
				return validateENUMVerwendungAlsRueckfallObject((ENUMVerwendungAlsRueckfall)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS_OBJECT:
				return validateENUMWAnschlussObject((ENUMWAnschluss)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION_OBJECT:
				return validateENUMZBSReaktionObject((ENUMZBSReaktion)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE:
				return validateESG_Ind_Erlaeuterung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE:
				return validateESG_Ind_Parameter_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE:
				return validateESG_Ind_Parameterwert_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND_TYPE:
				return validateETCS_Gefahrpunktabstand_Abweichend_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE:
				return validateETCS_Paketnummer_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE:
				return validateETCS_Par_Erlaeuterung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE:
				return validateETCS_Parametername_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE:
				return validateETCS_Parameterwert_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ETCS_SYSTEM_VERSION_TYPE:
				return validateETCS_System_Version_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE:
				return validateEV_Modul_Typ_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE:
				return validateFabrikat_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE:
				return validateFT_ESG_Subtyp_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE:
				return validateFT_ESG_Typ_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE:
				return validateFT_ETCS_L2_Typ_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.FW_TEIL_NUMMER_TYPE:
				return validateFW_Teil_Nummer_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE:
				return validateGruppen_ID_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE:
				return validateHinweis_Balisenbefestigung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.INDIVIDUALISIERUNG_WEITERE_TYPE:
				return validateIndividualisierung_Weitere_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE:
				return validateKm_BTS_1_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE:
				return validateKm_BTS_2_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE:
				return validateKm_BTS_3_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE:
				return validateKonfigurationskennung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE:
				return validateL_ACKLEVELTR_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE:
				return validateLaenge_1_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE:
				return validateLaenge_Ausfuehrungsbereich_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_GESTUFTE_VSIGNALISIERUNG_TYPE:
				return validateLaenge_Gestufte_V_Signalisierung_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LAENGE_SOLL_MIND_150_TYPE:
				return validateLaenge_Soll_Mind_150_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEISTUNGSBEDARF_TYPE:
				return validateLeistungsbedarf_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE:
				return validateLEU_Ausgang_Nr_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_GERAETESTAND_TYPE:
				return validateLEU_Modul_Geraetestand_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE:
				return validateLEU_Modul_Typ_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE:
				return validateLEU_Schaltkasten_Typ_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE:
				return validateLfd_Nr_Am_Bezugspunkt_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE:
				return validateLink_Distanz_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.LLA_TYPE:
				return validateLLA_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE:
				return validateMassgebende_Neig_1_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE:
				return validateMassgebende_Neig_Schutzstrecke_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_150_TYPE:
				return validateMassgebende_Neigung_Mind_150_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_150_TYPE:
				return validateMassgebende_Neigung_Mind_Sig_150_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_TYPE:
				return validateMassgebende_Neigung_Mind_Sig_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE:
				return validateMax_Leistung_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE:
				return validateMax_Unterbrechungszeit_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.METALLTEIL_KATEGORIE_TYPE:
				return validateMetallteil_Kategorie_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.METALLTEIL_LAENGE_TYPE:
				return validateMetallteil_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE:
				return validateModulnummer_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.MONTAGEABWEICHUNG_TYPE:
				return validateMontageabweichung_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE:
				return validateNeigung_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE:
				return validateNennleistung_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_BG_TYPE:
				return validateNID_BG_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_CTYPE:
				return validateNID_C_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE:
				return validateNID_RBC_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NID_TSR_TYPE:
				return validateNID_TSR_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE:
				return validateNummer_Schaltkasten_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE:
				return validateOberstrombegrenzung_Gueterzug_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE:
				return validateOberstrombegrenzung_Reisezug_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE:
				return validatePort_Nr_Ausg_Physisch_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE:
				return validatePosition_Sonstige_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE:
				return validatePrioritaet_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.PROJEKTIERUNGSFALL_TYPE:
				return validateProjektierungsfall_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC_ETCS_SYSTEM_VERSION_TYPE:
				return validateRBC_ETCS_System_Version_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE:
				return validateRBC_SRS_Version_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE:
				return validateRekursion_2_Nr_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE:
				return validateRekursion_Nr_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE:
				return validateRufnummer_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE:
				return validateSchutzstrecke_Erforderlich_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE:
				return validateSchutzstrecke_Vorhanden_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_150_TYPE:
				return validateSolllaenge_Mind_Sig_150_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_TYPE:
				return validateSolllaenge_Mind_Sig_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE:
				return validateSonstige_Standortangabe_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE:
				return validateSpannung_Toleranz_Obere_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE:
				return validateSpannung_Toleranz_Untere_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE:
				return validateSRS_Version_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE:
				return validateSystem_Vor_Grenze_Besonders_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE:
				return validateTBV_Tunnelbereich_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TELEGRAMM_INDEX_TYPE:
				return validateTelegramm_Index_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE:
				return validateTelegrammnummer_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE:
				return validateText_Bedingung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.TEXTMELDUNG_TYPE:
				return validateTextmeldung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE:
				return validateUeberbrueckung_EV_Unterbrechung_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UEBERWACHUNG_LAENGE_TYPE:
				return validateUeberwachung_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE:
				return validateUntergruppen_ID_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE:
				return validateV_Befehl_R_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE:
				return validateV_Befehl_Z_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VFREI_TYPE:
				return validateV_Frei_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VSTART_TYPE:
				return validateV_Start_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZIEL_TYPE:
				return validateV_Ziel_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE:
				return validateV_Zul_Strecke_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_KENNUNG_TYPE:
				return validateVBC_Kennung_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_NID_CTYPE:
				return validateVBC_NID_C_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VBC_TIMER_TYPE:
				return validateVBC_Timer_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE:
				return validateVerbot_Anhalten_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERKUERZTER_ABSTAND_TYPE:
				return validateVerkuerzter_Abstand_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERWENDUNG_HILFE_TYPE:
				return validateVerwendung_Hilfe_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE:
				return validateVerwendung_Type((String)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_1TYPE:
				return validateVGR_1_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_2TYPE:
				return validateVGR_2_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VGR_TYPE:
				return validateVGR_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VLA_TYPE:
				return validateVLA_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VORSIGNALABSTAND_TYPE:
				return validateVorsignalabstand_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.VZ_TYPE:
				return validateVZ_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE:
				return validateWirkrichtung_In_Datenpunkt_Type((ENUMWirkrichtung)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE:
				return validateZBS_La_Bereich_Distanz_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE:
				return validateZBS_La_Bereich_Geschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE:
				return validateZBS_La_Bereich_Laenge_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE:
				return validateZBS_La_Bereich_Neigung_Type((BigDecimal)value, diagnostics, context);
			case Balisentechnik_ETCSPackage.ZLA_TYPE:
				return validateZLA_Type((BigDecimal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Bes_Langer_Einfahrweg_TypeClass(Abstand_Bes_Langer_Einfahrweg_TypeClass abstand_Bes_Langer_Einfahrweg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Bes_Langer_Einfahrweg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_EP_TPI_TypeClass(Abstand_Datenpunkt_EP_TPI_TypeClass abstand_Datenpunkt_EP_TPI_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Datenpunkt_EP_TPI_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_TPI_Folgesignal_TypeClass(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass abstand_Datenpunkt_TPI_Folgesignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Datenpunkt_TPI_Folgesignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Einmesspunkt_TypeClass(Abstand_Einmesspunkt_TypeClass abstand_Einmesspunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Einmesspunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Grenze_Bereich_C_TypeClass(Abstand_Grenze_Bereich_C_TypeClass abstand_Grenze_Bereich_C_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Grenze_Bereich_C_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Reduziert_TypeClass(Abstand_Reduziert_TypeClass abstand_Reduziert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Reduziert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnlagenteil_Sonstige_TypeClass(Anlagenteil_Sonstige_TypeClass anlagenteil_Sonstige_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anlagenteil_Sonstige_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnordnung_Im_DP_TypeClass(Anordnung_Im_DP_TypeClass anordnung_Im_DP_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anordnung_Im_DP_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendung_ESG_TypeClass(Anwendung_ESG_TypeClass anwendung_ESG_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendung_ESG_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendung_GNT_TypeClass(Anwendung_GNT_TypeClass anwendung_GNT_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendung_GNT_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendung_Sonst_TypeClass(Anwendung_Sonst_TypeClass anwendung_Sonst_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendung_Sonst_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendungssystem_TypeClass(Anwendungssystem_TypeClass anwendungssystem_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anwendungssystem_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Voll_LEU_Kalkuliert_TypeClass(Anzahl_Voll_LEU_Kalkuliert_TypeClass anzahl_Voll_LEU_Kalkuliert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anzahl_Voll_LEU_Kalkuliert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzeigetext_TypeClass(Anzeigetext_TypeClass anzeigetext_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anzeigetext_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArt_Bedingung_TypeClass(Art_Bedingung_TypeClass art_Bedingung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(art_Bedingung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusgang_Nr_TypeClass(Ausgang_Nr_TypeClass ausgang_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausgang_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusrichtung_TypeClass(Ausrichtung_TypeClass ausrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusstieg_ETCS_Sperre_TypeClass(Ausstieg_ETCS_Sperre_TypeClass ausstieg_ETCS_Sperre_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausstieg_ETCS_Sperre_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalise(Balise balise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balise, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalise_Allg_AttributeGroup(Balise_Allg_AttributeGroup balise_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balise_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalise_Geraetestand_TypeClass(Balise_Geraetestand_TypeClass balise_Geraetestand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balise_Geraetestand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalisenhalter_TypeClass(Balisenhalter_TypeClass balisenhalter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balisenhalter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseline_System_Version_TypeClass(Baseline_System_Version_TypeClass baseline_System_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseline_System_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Besondere_AttributeGroup(Bedingung_Besondere_AttributeGroup bedingung_Besondere_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_Besondere_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_PZB_AttributeGroup(Bedingung_PZB_AttributeGroup bedingung_PZB_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_PZB_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Signal_AttributeGroup(Bedingung_Signal_AttributeGroup bedingung_Signal_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_Signal_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Sonstige_AttributeGroup(Bedingung_Sonstige_AttributeGroup bedingung_Sonstige_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_Sonstige_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Weiche_AttributeGroup(Bedingung_Weiche_AttributeGroup bedingung_Weiche_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_Weiche_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Weichenlage_TypeClass(Bedingung_Weichenlage_TypeClass bedingung_Weichenlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedingung_Weichenlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_1_TypeClass(Bez_Strecke_BTS_1_TypeClass bez_Strecke_BTS_1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Strecke_BTS_1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_2_TypeClass(Bez_Strecke_BTS_2_TypeClass bez_Strecke_BTS_2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Strecke_BTS_2_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_3_TypeClass(Bez_Strecke_BTS_3_TypeClass bez_Strecke_BTS_3_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Strecke_BTS_3_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_ZUB_Bereichsgrenze_TypeClass(Bez_ZUB_Bereichsgrenze_TypeClass bez_ZUB_Bereichsgrenze_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_ZUB_Bereichsgrenze_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ETCS_Kante_TypeClass(Bezeichnung_ETCS_Kante_TypeClass bezeichnung_ETCS_Kante_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_ETCS_Kante_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_LEU_Anlage_TypeClass(Bezeichnung_LEU_Anlage_TypeClass bezeichnung_LEU_Anlage_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_LEU_Anlage_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ZUB_SE_TypeClass(Bezeichnung_ZUB_SE_TypeClass bezeichnung_ZUB_SE_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_ZUB_SE_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ZUB_TypeClass(Bezeichnung_ZUB_TypeClass bezeichnung_ZUB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_ZUB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup(Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaerdaten(Binaerdaten binaerdaten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaerdaten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaerdaten_Datei_AttributeGroup(Binaerdaten_Datei_AttributeGroup binaerdaten_Datei_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaerdaten_Datei_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD_LEVELTR_TypeClass(D_LEVELTR_TypeClass d_LEVELTR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(d_LEVELTR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateiname_TypeClass(Dateiname_TypeClass dateiname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateiname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateityp_Binaerdatei_TypeClass(Dateityp_Binaerdatei_TypeClass dateityp_Binaerdatei_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateityp_Binaerdatei_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaten_TypeClass(Daten_TypeClass daten_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daten_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt(Datenpunkt datenpunkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Allg_AttributeGroup(Datenpunkt_Allg_AttributeGroup datenpunkt_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Beschreibung_TypeClass(Datenpunkt_Beschreibung_TypeClass datenpunkt_Beschreibung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt_Beschreibung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Einmesspunkt_AttributeGroup(Datenpunkt_Einmesspunkt_AttributeGroup datenpunkt_Einmesspunkt_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt_Einmesspunkt_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Laenge_TypeClass(Datenpunkt_Laenge_TypeClass datenpunkt_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Link(Datenpunkt_Link datenpunkt_Link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datenpunkt_Link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VGES_TypeClass(Delta_VGES_TypeClass delta_VGES_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delta_VGES_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VLES_TypeClass(Delta_VLES_TypeClass delta_VLES_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delta_VLES_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VZES_TypeClass(Delta_VZES_TypeClass delta_VZES_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delta_VZES_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_ATO_TypeClass(DP_ATO_TypeClass dP_ATO_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_ATO_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Bezug_Funktional_Art_TypeClass(DP_Bezug_Funktional_Art_TypeClass dP_Bezug_Funktional_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Bezug_Funktional_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Bezug_Funktional_AttributeGroup(DP_Bezug_Funktional_AttributeGroup dP_Bezug_Funktional_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Bezug_Funktional_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_ETCS_Adresse_AttributeGroup(DP_ETCS_Adresse_AttributeGroup dP_ETCS_Adresse_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_ETCS_Adresse_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Link_Art_TypeClass(DP_Link_Art_TypeClass dP_Link_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Link_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Telegramm_AttributeGroup(DP_Telegramm_AttributeGroup dP_Telegramm_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Telegramm_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Telegramm_ESG_AttributeGroup(DP_Telegramm_ESG_AttributeGroup dP_Telegramm_ESG_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Telegramm_ESG_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_Art_TypeClass(DP_Typ_Art_TypeClass dP_Typ_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_AttributeGroup(DP_Typ_AttributeGroup dP_Typ_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_ESG_TypeClass(DP_Typ_ESG_TypeClass dP_Typ_ESG_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_ESG_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_ETCS_TypeClass(DP_Typ_ETCS_TypeClass dP_Typ_ETCS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_ETCS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GESG_AttributeGroup(DP_Typ_GESG_AttributeGroup dP_Typ_GESG_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GESG_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GETCS_AttributeGroup(DP_Typ_GETCS_AttributeGroup dP_Typ_GETCS_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GETCS_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GGNT_AttributeGroup(DP_Typ_GGNT_AttributeGroup dP_Typ_GGNT_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GGNT_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GNT_TypeClass(DP_Typ_GNT_TypeClass dP_Typ_GNT_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GNT_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GSonst_AttributeGroup(DP_Typ_GSonst_AttributeGroup dP_Typ_GSonst_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GSonst_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GTrans_AttributeGroup(DP_Typ_GTrans_AttributeGroup dP_Typ_GTrans_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GTrans_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_GZBS_AttributeGroup(DP_Typ_GZBS_AttributeGroup dP_Typ_GZBS_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_GZBS_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_Sonst_TypeClass(DP_Typ_Sonst_TypeClass dP_Typ_Sonst_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_Sonst_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_Trans_TypeClass(DP_Typ_Trans_TypeClass dP_Typ_Trans_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_Trans_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_V_La_TypeClass(DP_Typ_V_La_TypeClass dP_Typ_V_La_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_V_La_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_ZBS_TypeClass(DP_Typ_ZBS_TypeClass dP_Typ_ZBS_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Typ_ZBS_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Verlinkt_TypeClass(DP_Verlinkt_TypeClass dP_Verlinkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dP_Verlinkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDunkelschaltanstoss_TypeClass(Dunkelschaltanstoss_TypeClass dunkelschaltanstoss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dunkelschaltanstoss_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_200_TypeClass(DWeg_Intervall_200_TypeClass dWeg_Intervall_200_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Intervall_200_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_50_200_TypeClass(DWeg_Intervall_50_200_TypeClass dWeg_Intervall_50_200_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Intervall_50_200_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_50_TypeClass(DWeg_Intervall_50_TypeClass dWeg_Intervall_50_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWeg_Intervall_50_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEingang_Gepuffert_TypeClass(Eingang_Gepuffert_TypeClass eingang_Gepuffert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eingang_Gepuffert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinstieg_Erlaubt_TypeClass(Einstieg_Erlaubt_TypeClass einstieg_Erlaubt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einstieg_Erlaubt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinstieg_Ohne_Rueckw_Sig_TypeClass(Einstieg_Ohne_Rueckw_Sig_TypeClass einstieg_Ohne_Rueckw_Sig_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einstieg_Ohne_Rueckw_Sig_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinzeldatei_Art_TypeClass(Einzeldatei_Art_TypeClass einzeldatei_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einzeldatei_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergie_Eingang_Art_TypeClass(Energie_Eingang_Art_TypeClass energie_Eingang_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energie_Eingang_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Erlaeuterung_TypeClass(ESG_Ind_Erlaeuterung_TypeClass esG_Ind_Erlaeuterung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esG_Ind_Erlaeuterung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Parameter_TypeClass(ESG_Ind_Parameter_TypeClass esG_Ind_Parameter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esG_Ind_Parameter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Parameterwert_TypeClass(ESG_Ind_Parameterwert_TypeClass esG_Ind_Parameterwert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esG_Ind_Parameterwert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Individuelle_Merkmale_AttributeGroup(ESG_Individuelle_Merkmale_AttributeGroup esG_Individuelle_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esG_Individuelle_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Spezifische_Merkmale_AttributeGroup(ESG_Spezifische_Merkmale_AttributeGroup esG_Spezifische_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esG_Spezifische_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Adresse_AttributeGroup(ETCS_Adresse_AttributeGroup etcS_Adresse_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Adresse_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Gefahrpunktabstand_Abweichend_TypeClass(ETCS_Gefahrpunktabstand_Abweichend_TypeClass etcS_Gefahrpunktabstand_Abweichend_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Gefahrpunktabstand_Abweichend_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Kante(ETCS_Kante etcS_Kante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Kante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Kante_Bezeichnung_AttributeGroup(ETCS_Kante_Bezeichnung_AttributeGroup etcS_Kante_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Kante_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Knoten(ETCS_Knoten etcS_Knoten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Knoten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Knoten_Art_Sonstige_TypeClass(ETCS_Knoten_Art_Sonstige_TypeClass etcS_Knoten_Art_Sonstige_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Knoten_Art_Sonstige_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Paketnummer_TypeClass(ETCS_Paketnummer_TypeClass etcS_Paketnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Paketnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Par_Erlaeuterung_TypeClass(ETCS_Par_Erlaeuterung_TypeClass etcS_Par_Erlaeuterung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Par_Erlaeuterung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Parametername_TypeClass(ETCS_Parametername_TypeClass etcS_Parametername_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Parametername_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Parameterwert_TypeClass(ETCS_Parameterwert_TypeClass etcS_Parameterwert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Parameterwert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Richtungsanzeige(ETCS_Richtungsanzeige etcS_Richtungsanzeige, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Richtungsanzeige, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Signal(ETCS_Signal etcS_Signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Signal_Allg_AttributeGroup(ETCS_Signal_Allg_AttributeGroup etcS_Signal_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Signal_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Signal_DWeg_AttributeGroup(ETCS_Signal_DWeg_AttributeGroup etcS_Signal_DWeg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Signal_DWeg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Signal_TBV_AttributeGroup(ETCS_Signal_TBV_AttributeGroup etcS_Signal_TBV_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_Signal_TBV_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_System_Version_TypeClass(ETCS_System_Version_TypeClass etcS_System_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_System_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_W_Kr(ETCS_W_Kr etcS_W_Kr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_W_Kr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_W_Kr_MUKA_AttributeGroup(ETCS_W_Kr_MUKA_AttributeGroup etcS_W_Kr_MUKA_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etcS_W_Kr_MUKA_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul(EV_Modul eV_Modul, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Art_TypeClass(EV_Modul_Art_TypeClass eV_Modul_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Ausgang_AttributeGroup(EV_Modul_Ausgang_AttributeGroup eV_Modul_Ausgang_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Ausgang_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Eingang_AttributeGroup(EV_Modul_Eingang_AttributeGroup eV_Modul_Eingang_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Eingang_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Physisch_AttributeGroup(EV_Modul_Physisch_AttributeGroup eV_Modul_Physisch_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Physisch_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Typ_TypeClass(EV_Modul_Typ_TypeClass eV_Modul_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Virtuell_AttributeGroup(EV_Modul_Virtuell_AttributeGroup eV_Modul_Virtuell_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eV_Modul_Virtuell_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFabrikat_TypeClass(Fabrikat_TypeClass fabrikat_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fabrikat_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFachtelegramm(Fachtelegramm fachtelegramm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fachtelegramm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_Anschaltbedingung(FT_Anschaltbedingung fT_Anschaltbedingung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_Anschaltbedingung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Merkmale_AttributeGroup(FT_ESG_Merkmale_AttributeGroup fT_ESG_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ESG_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Subtyp_TypeClass(FT_ESG_Subtyp_TypeClass fT_ESG_Subtyp_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ESG_Subtyp_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Typ_TypeClass(FT_ESG_Typ_TypeClass fT_ESG_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ESG_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_L2_Merkmale_AttributeGroup(FT_ETCS_L2_Merkmale_AttributeGroup fT_ETCS_L2_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ETCS_L2_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_L2_Typ_TypeClass(FT_ETCS_L2_Typ_TypeClass fT_ETCS_L2_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ETCS_L2_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_Trans_Merkmale_AttributeGroup(FT_ETCS_Trans_Merkmale_AttributeGroup fT_ETCS_Trans_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ETCS_Trans_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_Trans_Paket_41_AttributeGroup(FT_ETCS_Trans_Paket_41_AttributeGroup fT_ETCS_Trans_Paket_41_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ETCS_Trans_Paket_41_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_Trans_Paket_N_AttributeGroup(FT_ETCS_Trans_Paket_N_AttributeGroup fT_ETCS_Trans_Paket_N_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ETCS_Trans_Paket_N_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_Fahrweg_Teil(FT_Fahrweg_Teil fT_Fahrweg_Teil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_Fahrweg_Teil, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_Fahrweg_Teil_Allg_AttributeGroup(FT_Fahrweg_Teil_Allg_AttributeGroup fT_Fahrweg_Teil_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_Fahrweg_Teil_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_Fahrweg_Teile_AttributeGroup(FT_Fahrweg_Teile_AttributeGroup fT_Fahrweg_Teile_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_Fahrweg_Teile_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_GNT_Merkmale_AttributeGroup(FT_GNT_Merkmale_AttributeGroup fT_GNT_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_GNT_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_GNT_Punktart_TypeClass(FT_GNT_Punktart_TypeClass fT_GNT_Punktart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_GNT_Punktart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_Hinweis_Funktion_TypeClass(FT_Hinweis_Funktion_TypeClass fT_Hinweis_Funktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_Hinweis_Funktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ZBS_Merkmale_AttributeGroup(FT_ZBS_Merkmale_AttributeGroup fT_ZBS_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ZBS_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ZBS_Merkmale_La_AttributeGroup(FT_ZBS_Merkmale_La_AttributeGroup fT_ZBS_Merkmale_La_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ZBS_Merkmale_La_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ZBS_Typ_TypeClass(FT_ZBS_Typ_TypeClass fT_ZBS_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fT_ZBS_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFW_Teil_Nummer_TypeClass(FW_Teil_Nummer_TypeClass fW_Teil_Nummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fW_Teil_Nummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGruppen_ID_TypeClass(Gruppen_ID_TypeClass gruppen_ID_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gruppen_ID_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarter_Ausstieg_Aus_L2_TypeClass(Harter_Ausstieg_Aus_L2_TypeClass harter_Ausstieg_Aus_L2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(harter_Ausstieg_Aus_L2_TypeClass, diagnostics, context);
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
	public boolean validateHinweis_Balisenbefestigung_TypeClass(Hinweis_Balisenbefestigung_TypeClass hinweis_Balisenbefestigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hinweis_Balisenbefestigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualisierung_Weitere_TypeClass(Individualisierung_Weitere_TypeClass individualisierung_Weitere_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individualisierung_Weitere_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIst_Befahren_TypeClass(Ist_Befahren_TypeClass ist_Befahren_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ist_Befahren_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_1_TypeClass(Km_BTS_1_TypeClass km_BTS_1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(km_BTS_1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_2_TypeClass(Km_BTS_2_TypeClass km_BTS_2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(km_BTS_2_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_3_TypeClass(Km_BTS_3_TypeClass km_BTS_3_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(km_BTS_3_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnoten_Auf_TOP_Kante_AttributeGroup(Knoten_Auf_TOP_Kante_AttributeGroup knoten_Auf_TOP_Kante_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knoten_Auf_TOP_Kante_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKonfigurationskennung_TypeClass(Konfigurationskennung_TypeClass konfigurationskennung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(konfigurationskennung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateL_ACKLEVELTR_TypeClass(L_ACKLEVELTR_TypeClass l_ACKLEVELTR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(l_ACKLEVELTR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_1_TypeClass(Laenge_1_TypeClass laenge_1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laenge_1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Ausfuehrungsbereich_TypeClass(Laenge_Ausfuehrungsbereich_TypeClass laenge_Ausfuehrungsbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laenge_Ausfuehrungsbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Gestufte_V_Signalisierung_TypeClass(Laenge_Gestufte_V_Signalisierung_TypeClass laenge_Gestufte_V_Signalisierung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laenge_Gestufte_V_Signalisierung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Soll_Mind_150_TypeClass(Laenge_Soll_Mind_150_TypeClass laenge_Soll_Mind_150_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laenge_Soll_Mind_150_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungsbedarf_TypeClass(Leistungsbedarf_TypeClass leistungsbedarf_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leistungsbedarf_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Anlage(LEU_Anlage leU_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Anlage_Allg_AttributeGroup(LEU_Anlage_Allg_AttributeGroup leU_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Anlage_Art_TypeClass(LEU_Anlage_Art_TypeClass leU_Anlage_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Anlage_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Anlage_Bezeichnung_AttributeGroup(LEU_Anlage_Bezeichnung_AttributeGroup leU_Anlage_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Anlage_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Ausgang_Nr_TypeClass(LEU_Ausgang_Nr_TypeClass leU_Ausgang_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Ausgang_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul(LEU_Modul leU_Modul, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Allg_AttributeGroup(LEU_Modul_Allg_AttributeGroup leU_Modul_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Art_TypeClass(LEU_Modul_Art_TypeClass leU_Modul_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Ausgang_AttributeGroup(LEU_Modul_Ausgang_AttributeGroup leU_Modul_Ausgang_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Ausgang_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Bezeichnung_AttributeGroup(LEU_Modul_Bezeichnung_AttributeGroup leU_Modul_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Geraetestand_TypeClass(LEU_Modul_Geraetestand_TypeClass leU_Modul_Geraetestand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Geraetestand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Typ_TypeClass(LEU_Modul_Typ_TypeClass leU_Modul_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Modul_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten(LEU_Schaltkasten leU_Schaltkasten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Schaltkasten, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten_Bezeichnung_AttributeGroup(LEU_Schaltkasten_Bezeichnung_AttributeGroup leU_Schaltkasten_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Schaltkasten_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten_Energie_AttributeGroup(LEU_Schaltkasten_Energie_AttributeGroup leU_Schaltkasten_Energie_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Schaltkasten_Energie_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten_Position_AttributeGroup(LEU_Schaltkasten_Position_AttributeGroup leU_Schaltkasten_Position_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Schaltkasten_Position_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten_Typ_TypeClass(LEU_Schaltkasten_Typ_TypeClass leU_Schaltkasten_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Schaltkasten_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Steuernde_AttributeGroup(LEU_Steuernde_AttributeGroup leU_Steuernde_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leU_Steuernde_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLfd_Nr_Am_Bezugspunkt_TypeClass(Lfd_Nr_Am_Bezugspunkt_TypeClass lfd_Nr_Am_Bezugspunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lfd_Nr_Am_Bezugspunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_Distanz_TypeClass(Link_Distanz_TypeClass link_Distanz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link_Distanz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLLA_TypeClass(LLA_TypeClass llA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(llA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLM_G_TypeClass(LM_G_TypeClass lM_G_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lM_G_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLT_Binaerdatei_Hilfe_AttributeGroup(LT_Binaerdatei_Hilfe_AttributeGroup lT_Binaerdatei_Hilfe_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lT_Binaerdatei_Hilfe_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLT_Binaerdaten_AttributeGroup(LT_Binaerdaten_AttributeGroup lT_Binaerdaten_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lT_Binaerdaten_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuft_Telegramm(Luft_Telegramm luft_Telegramm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luft_Telegramm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM_LEVELTR_TypeClass(M_LEVELTR_TypeClass m_LEVELTR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(m_LEVELTR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_1_TypeClass(Massgebende_Neig_1_TypeClass massgebende_Neig_1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neig_1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_Schutzstrecke_TypeClass(Massgebende_Neig_Schutzstrecke_TypeClass massgebende_Neig_Schutzstrecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neig_Schutzstrecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_150_TypeClass(Massgebende_Neigung_Mind_150_TypeClass massgebende_Neigung_Mind_150_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neigung_Mind_150_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_Sig_150_TypeClass(Massgebende_Neigung_Mind_Sig_150_TypeClass massgebende_Neigung_Mind_Sig_150_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neigung_Mind_Sig_150_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_Sig_TypeClass(Massgebende_Neigung_Mind_Sig_TypeClass massgebende_Neigung_Mind_Sig_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massgebende_Neigung_Mind_Sig_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMastschild_TypeClass(Mastschild_TypeClass mastschild_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mastschild_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_Leistung_TypeClass(Max_Leistung_TypeClass max_Leistung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_Leistung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_Unterbrechungszeit_TypeClass(Max_Unterbrechungszeit_TypeClass max_Unterbrechungszeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_Unterbrechungszeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_AttributeGroup(Metallteil_AttributeGroup metallteil_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metallteil_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_Kategorie_TypeClass(Metallteil_Kategorie_TypeClass metallteil_Kategorie_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metallteil_Kategorie_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_Laenge_TypeClass(Metallteil_Laenge_TypeClass metallteil_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metallteil_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulnummer_TypeClass(Modulnummer_TypeClass modulnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modulnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontageabweichung_TypeClass(Montageabweichung_TypeClass montageabweichung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(montageabweichung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_TypeClass(Neigung_TypeClass neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNennleistung_TypeClass(Nennleistung_TypeClass nennleistung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nennleistung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_BG_TypeClass(NID_BG_TypeClass niD_BG_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_BG_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_TypeClass(NID_C_TypeClass niD_C_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_C_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_RBC_TypeClass(NID_RBC_TypeClass niD_RBC_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_RBC_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_STM_TypeClass(NID_STM_TypeClass niD_STM_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_STM_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_TSR_TypeClass(NID_TSR_TypeClass niD_TSR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niD_TSR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNummer_Schaltkasten_TypeClass(Nummer_Schaltkasten_TypeClass nummer_Schaltkasten_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nummer_Schaltkasten_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Gueterzug_TypeClass(Oberstrombegrenzung_Gueterzug_TypeClass oberstrombegrenzung_Gueterzug_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oberstrombegrenzung_Gueterzug_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Reisezug_TypeClass(Oberstrombegrenzung_Reisezug_TypeClass oberstrombegrenzung_Reisezug_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oberstrombegrenzung_Reisezug_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Nr_Ausg_Physisch_TypeClass(Port_Nr_Ausg_Physisch_TypeClass port_Nr_Ausg_Physisch_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port_Nr_Ausg_Physisch_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_Sonstige_TypeClass(Position_Sonstige_TypeClass position_Sonstige_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position_Sonstige_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_TypeClass(Position_TypeClass position_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaerquelle_TypeClass(Primaerquelle_TypeClass primaerquelle_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaerquelle_TypeClass, diagnostics, context);
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
	public boolean validateProg_Datei_Einzel_AttributeGroup(Prog_Datei_Einzel_AttributeGroup prog_Datei_Einzel_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prog_Datei_Einzel_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProg_Datei_Gruppe(Prog_Datei_Gruppe prog_Datei_Gruppe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prog_Datei_Gruppe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjektierungsfall_TypeClass(Projektierungsfall_TypeClass projektierungsfall_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projektierungsfall_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC(RBC rbc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rbc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_Allg_AttributeGroup(RBC_Allg_AttributeGroup rbC_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rbC_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_ETCS_System_Version_TypeClass(RBC_ETCS_System_Version_TypeClass rbC_ETCS_System_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rbC_ETCS_System_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_SRS_Version_TypeClass(RBC_SRS_Version_TypeClass rbC_SRS_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rbC_SRS_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRekursion_2_Nr_TypeClass(Rekursion_2_Nr_TypeClass rekursion_2_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rekursion_2_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRekursion_Nr_TypeClass(Rekursion_Nr_TypeClass rekursion_Nr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rekursion_Nr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRufnummer_TypeClass(Rufnummer_TypeClass rufnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rufnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSBE_TypeClass(SBE_TypeClass sbE_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbE_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzstrecke_Erforderlich_TypeClass(Schutzstrecke_Erforderlich_TypeClass schutzstrecke_Erforderlich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schutzstrecke_Erforderlich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzstrecke_Vorhanden_TypeClass(Schutzstrecke_Vorhanden_TypeClass schutzstrecke_Vorhanden_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schutzstrecke_Vorhanden_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolllaenge_Mind_Sig_150_TypeClass(Solllaenge_Mind_Sig_150_TypeClass solllaenge_Mind_Sig_150_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solllaenge_Mind_Sig_150_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolllaenge_Mind_Sig_TypeClass(Solllaenge_Mind_Sig_TypeClass solllaenge_Mind_Sig_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solllaenge_Mind_Sig_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstige_Standortangabe_TypeClass(Sonstige_Standortangabe_TypeClass sonstige_Standortangabe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sonstige_Standortangabe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpannung_Art_TypeClass(Spannung_Art_TypeClass spannung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spannung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpannung_Toleranz_Obere_TypeClass(Spannung_Toleranz_Obere_TypeClass spannung_Toleranz_Obere_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spannung_Toleranz_Obere_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpannung_Toleranz_Untere_TypeClass(Spannung_Toleranz_Untere_TypeClass spannung_Toleranz_Untere_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spannung_Toleranz_Untere_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSRS_Version_TypeClass(SRS_Version_TypeClass srS_Version_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srS_Version_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandortangabe_Balisenschild_TypeClass(Standortangabe_Balisenschild_TypeClass standortangabe_Balisenschild_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standortangabe_Balisenschild_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart_W_Element_AttributeGroup(Start_W_Element_AttributeGroup start_W_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(start_W_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTZ_TypeClass(STZ_TypeClass stZ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stZ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_Vor_Grenze_Besonders_TypeClass(System_Vor_Grenze_Besonders_TypeClass system_Vor_Grenze_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system_Vor_Grenze_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_Vor_Grenze_TypeClass(System_Vor_Grenze_TypeClass system_Vor_Grenze_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system_Vor_Grenze_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBV_Meldepunkt_TypeClass(TBV_Meldepunkt_TypeClass tbV_Meldepunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbV_Meldepunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBV_Tunnelbereich_Laenge_TypeClass(TBV_Tunnelbereich_Laenge_TypeClass tbV_Tunnelbereich_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbV_Tunnelbereich_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBV_Tunnelsignal_TypeClass(TBV_Tunnelsignal_TypeClass tbV_Tunnelsignal_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbV_Tunnelsignal_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_Index_TypeClass(Telegramm_Index_TypeClass telegramm_Index_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegramm_Index_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegrammnummer_TypeClass(Telegrammnummer_TypeClass telegrammnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telegrammnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_Bedingung_TypeClass(Text_Bedingung_TypeClass text_Bedingung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text_Bedingung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextmeldung_TypeClass(Textmeldung_TypeClass textmeldung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textmeldung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberbrueckung_EV_Unterbrechung_TypeClass(Ueberbrueckung_EV_Unterbrechung_TypeClass ueberbrueckung_EV_Unterbrechung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberbrueckung_EV_Unterbrechung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberwachung_Laenge_TypeClass(Ueberwachung_Laenge_TypeClass ueberwachung_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ueberwachung_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmfahrstrasse_TypeClass(Umfahrstrasse_TypeClass umfahrstrasse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umfahrstrasse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntergruppen_ID_TypeClass(Untergruppen_ID_TypeClass untergruppen_ID_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(untergruppen_ID_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Befehl_R_TypeClass(V_Befehl_R_TypeClass v_Befehl_R_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Befehl_R_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Befehl_Z_TypeClass(V_Befehl_Z_TypeClass v_Befehl_Z_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Befehl_Z_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Frei_TypeClass(V_Frei_TypeClass v_Frei_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Frei_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Start_TypeClass(V_Start_TypeClass v_Start_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Start_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Ziel_TypeClass(V_Ziel_TypeClass v_Ziel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Ziel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Zul_Strecke_TypeClass(V_Zul_Strecke_TypeClass v_Zul_Strecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Zul_Strecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_Kennung_TypeClass(VBC_Kennung_TypeClass vbC_Kennung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vbC_Kennung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_NID_C_TypeClass(VBC_NID_C_TypeClass vbC_NID_C_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vbC_NID_C_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_Setzen_TypeClass(VBC_Setzen_TypeClass vbC_Setzen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vbC_Setzen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_Timer_TypeClass(VBC_Timer_TypeClass vbC_Timer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vbC_Timer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerbot_Anhalten_TypeClass(Verbot_Anhalten_TypeClass verbot_Anhalten_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verbot_Anhalten_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerbot_Regenerative_Bremse_TypeClass(Verbot_Regenerative_Bremse_TypeClass verbot_Regenerative_Bremse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verbot_Regenerative_Bremse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerbot_WB_Art_TypeClass(Verbot_WB_Art_TypeClass verbot_WB_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verbot_WB_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkuerzter_Abstand_TypeClass(Verkuerzter_Abstand_TypeClass verkuerzter_Abstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkuerzter_Abstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerwendung_Als_Rueckfall_TypeClass(Verwendung_Als_Rueckfall_TypeClass verwendung_Als_Rueckfall_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verwendung_Als_Rueckfall_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerwendung_Hilfe_TypeClass(Verwendung_Hilfe_TypeClass verwendung_Hilfe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verwendung_Hilfe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerwendung_TypeClass(Verwendung_TypeClass verwendung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verwendung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_1_TypeClass(VGR_1_TypeClass vgR_1_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vgR_1_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_2_TypeClass(VGR_2_TypeClass vgR_2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vgR_2_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_TypeClass(VGR_TypeClass vgR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vgR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLA_TypeClass(VLA_TypeClass vlA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vlA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorsignalabstand_TypeClass(Vorsignalabstand_TypeClass vorsignalabstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorsignalabstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVZ_TypeClass(VZ_TypeClass vZ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vZ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateW_Anschluss_TypeClass(W_Anschluss_TypeClass w_Anschluss_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(w_Anschluss_TypeClass, diagnostics, context);
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
	public boolean validateWirkrichtung_In_Datenpunkt_TypeClass(Wirkrichtung_In_Datenpunkt_TypeClass wirkrichtung_In_Datenpunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wirkrichtung_In_Datenpunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirksam_TypeClass(Wirksam_TypeClass wirksam_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wirksam_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Distanz_TypeClass(ZBS_La_Bereich_Distanz_TypeClass zbS_La_Bereich_Distanz_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_La_Bereich_Distanz_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Geschwindigkeit_TypeClass(ZBS_La_Bereich_Geschwindigkeit_TypeClass zbS_La_Bereich_Geschwindigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_La_Bereich_Geschwindigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Laenge_TypeClass(ZBS_La_Bereich_Laenge_TypeClass zbS_La_Bereich_Laenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_La_Bereich_Laenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Neigung_TypeClass(ZBS_La_Bereich_Neigung_TypeClass zbS_La_Bereich_Neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_La_Bereich_Neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Merkmale_AttributeGroup(ZBS_Merkmale_AttributeGroup zbS_Merkmale_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Merkmale_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Reaktion_TypeClass(ZBS_Reaktion_TypeClass zbS_Reaktion_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Reaktion_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Schutzstrecke(ZBS_Schutzstrecke zbS_Schutzstrecke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Schutzstrecke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Schutzstrecke_Allg_AttributeGroup(ZBS_Schutzstrecke_Allg_AttributeGroup zbS_Schutzstrecke_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Schutzstrecke_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Signal(ZBS_Signal zbS_Signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_Signal_Signalabstand_AttributeGroup(ZBS_Signal_Signalabstand_AttributeGroup zbS_Signal_Signalabstand_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zbS_Signal_Signalabstand_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZiel_DP_Ausrichtung_TypeClass(Ziel_DP_Ausrichtung_TypeClass ziel_DP_Ausrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ziel_DP_Ausrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZiel_Ist_Fahrwegende_TypeClass(Ziel_Ist_Fahrwegende_TypeClass ziel_Ist_Fahrwegende_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ziel_Ist_Fahrwegende_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZiel_W_Element_AttributeGroup(Ziel_W_Element_AttributeGroup ziel_W_Element_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ziel_W_Element_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLA_TypeClass(ZLA_TypeClass zlA_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlA_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze(ZUB_Bereichsgrenze zuB_Bereichsgrenze, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Allg_AttributeGroup(ZUB_Bereichsgrenze_Allg_AttributeGroup zuB_Bereichsgrenze_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Bezeichnung_AttributeGroup(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup zuB_Bereichsgrenze_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_ESG_AttributeGroup(ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup zuB_Bereichsgrenze_Nach_ESG_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_ESG_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_GNT_TypeClass(ZUB_Bereichsgrenze_Nach_GNT_TypeClass zuB_Bereichsgrenze_Nach_GNT_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_GNT_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_L2_AttributeGroup(ZUB_Bereichsgrenze_Nach_L2_AttributeGroup zuB_Bereichsgrenze_Nach_L2_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_L2_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup(ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup zuB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_LZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup zuB_Bereichsgrenze_Nach_LZB_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_LZB_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup(ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_PZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup zuB_Bereichsgrenze_Nach_PZB_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_PZB_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup(ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup(ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup zuB_Bereichsgrenze_Nach_ZBS_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bereichsgrenze_Nach_ZBS_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Bgrenze_RBC_Wechsel_AttributeGroup(ZUB_Bgrenze_RBC_Wechsel_AttributeGroup zuB_Bgrenze_RBC_Wechsel_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Bgrenze_RBC_Wechsel_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_SE_Ausruestung_AttributeGroup(ZUB_SE_Ausruestung_AttributeGroup zuB_SE_Ausruestung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_SE_Ausruestung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Streckeneigenschaft(ZUB_Streckeneigenschaft zuB_Streckeneigenschaft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Streckeneigenschaft, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMArtBedingung(ENUMArtBedingung enumArtBedingung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAusstiegETCSSperre(ENUMAusstiegETCSSperre enumAusstiegETCSSperre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBalisenhalter(ENUMBalisenhalter enumBalisenhalter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPATO(ENUMDPATO enumdpato, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPBezugFunktionalArt(ENUMDPBezugFunktionalArt enumdpBezugFunktionalArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPLinkArt(ENUMDPLinkArt enumdpLinkArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypArt(ENUMDPTypArt enumdpTypArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypESG(ENUMDPTypESG enumdpTypESG, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypGNT(ENUMDPTypGNT enumdpTypGNT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypTrans(ENUMDPTypTrans enumdpTypTrans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypZBS(ENUMDPTypZBS enumdpTypZBS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEinzeldateiArt(ENUMEinzeldateiArt enumEinzeldateiArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEnergieEingangArt(ENUMEnergieEingangArt enumEnergieEingangArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMETCSKnotenArtSonstige(ENUMETCSKnotenArtSonstige enumetcsKnotenArtSonstige, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEVModulArt(ENUMEVModulArt enumevModulArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTGNTPunktart(ENUMFTGNTPunktart enumftgntPunktart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTHinweisFunktion(ENUMFTHinweisFunktion enumftHinweisFunktion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTZBSTyp(ENUMFTZBSTyp enumftzbsTyp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLEUArt(ENUMLEUArt enumleuArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMLEVELTR(ENUMMLEVELTR enummleveltr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNIDSTM(ENUMNIDSTM enumnidstm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPosition(ENUMPosition enumPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSBE(ENUMSBE enumsbe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSpannungArt(ENUMSpannungArt enumSpannungArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStandortangabeBalisenschild(ENUMStandortangabeBalisenschild enumStandortangabeBalisenschild, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSTZ(ENUMSTZ enumstz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerbotWBArt(ENUMVerbotWBArt enumVerbotWBArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerwendungAlsRueckfall(ENUMVerwendungAlsRueckfall enumVerwendungAlsRueckfall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWAnschluss(ENUMWAnschluss enumwAnschluss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZBSReaktion(ENUMZBSReaktion enumzbsReaktion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Bes_Langer_Einfahrweg_Type(BigDecimal abstand_Bes_Langer_Einfahrweg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_EH_EM_Folgesignal_Type(BigDecimal abstand_Datenpunkt_EH_EM_Folgesignal_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_EP_TPI_Type(BigDecimal abstand_Datenpunkt_EP_TPI_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Datenpunkt_TPI_Folgesignal_Type(BigDecimal abstand_Datenpunkt_TPI_Folgesignal_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Einmesspunkt_Type(BigDecimal abstand_Einmesspunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Grenze_Bereich_C_Type(BigDecimal abstand_Grenze_Bereich_C_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAbstand_Grenze_Bereich_C_Type_Pattern(abstand_Grenze_Bereich_C_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAbstand_Grenze_Bereich_C_Type_Pattern
	 */
	public static final  PatternMatcher [][] ABSTAND_GRENZE_BEREICH_CTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|[1-9][0-9]|[1-9][0-9][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Abstand Grenze Bereich CType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Grenze_Bereich_C_Type_Pattern(BigDecimal abstand_Grenze_Bereich_C_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getAbstand_Grenze_Bereich_C_Type(), abstand_Grenze_Bereich_C_Type, ABSTAND_GRENZE_BEREICH_CTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnlagenteil_Sonstige_Type(String anlagenteil_Sonstige_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(anlagenteil_Sonstige_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnordnung_Im_DP_Type(BigInteger anordnung_Im_DP_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnordnung_Im_DP_Type_Pattern(anordnung_Im_DP_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnordnung_Im_DP_Type_Pattern
	 */
	public static final  PatternMatcher [][] ANORDNUNG_IM_DP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1[0-6]|[1-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Anordnung Im DP Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnordnung_Im_DP_Type_Pattern(BigInteger anordnung_Im_DP_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getAnordnung_Im_DP_Type(), anordnung_Im_DP_Type, ANORDNUNG_IM_DP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnwendung_Sonst_Type(String anwendung_Sonst_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(anwendung_Sonst_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzahl_Voll_LEU_Kalkuliert_Type(BigInteger anzahl_Voll_LEU_Kalkuliert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnzeigetext_Type(String anzeigetext_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(anzeigetext_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusgang_Nr_Type(BigInteger ausgang_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalise_Geraetestand_Type(String balise_Geraetestand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(balise_Geraetestand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseline_System_Version_Type(String baseline_System_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBaseline_System_Version_Type_Pattern(baseline_System_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBaseline_System_Version_Type_Pattern
	 */
	public static final  PatternMatcher [][] BASELINE_SYSTEM_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Baseline System Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseline_System_Version_Type_Pattern(String baseline_System_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getBaseline_System_Version_Type(), baseline_System_Version_Type, BASELINE_SYSTEM_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedingung_Weichenlage_Type(ENUMLinksRechts bedingung_Weichenlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_1_Type(String bez_Strecke_BTS_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bez_Strecke_BTS_1_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_2_Type(String bez_Strecke_BTS_2_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bez_Strecke_BTS_2_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Strecke_BTS_3_Type(String bez_Strecke_BTS_3_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bez_Strecke_BTS_3_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_ZUB_Bereichsgrenze_Type(String bez_ZUB_Bereichsgrenze_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBez_ZUB_Bereichsgrenze_Type_Pattern(bez_ZUB_Bereichsgrenze_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBez_ZUB_Bereichsgrenze_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZ_ZUB_BEREICHSGRENZE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bez ZUB Bereichsgrenze Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_ZUB_Bereichsgrenze_Type_Pattern(String bez_ZUB_Bereichsgrenze_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getBez_ZUB_Bereichsgrenze_Type(), bez_ZUB_Bereichsgrenze_Type, BEZ_ZUB_BEREICHSGRENZE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ETCS_Kante_Type(String bezeichnung_ETCS_Kante_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_ETCS_Kante_Type_Pattern(bezeichnung_ETCS_Kante_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_ETCS_Kante_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_ETCS_KANTE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,10}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung ETCS Kante Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ETCS_Kante_Type_Pattern(String bezeichnung_ETCS_Kante_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getBezeichnung_ETCS_Kante_Type(), bezeichnung_ETCS_Kante_Type, BEZEICHNUNG_ETCS_KANTE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_LEU_Anlage_Type(String bezeichnung_LEU_Anlage_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_LEU_Anlage_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ZUB_SE_Type(String bezeichnung_ZUB_SE_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_ZUB_SE_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_ZUB_Type(String bezeichnung_ZUB_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_ZUB_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD_LEVELTR_Type(BigDecimal d_LEVELTR_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateityp_Binaerdatei_Type(String dateityp_Binaerdatei_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateityp_Binaerdatei_Type_Pattern(dateityp_Binaerdatei_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateityp_Binaerdatei_Type_Pattern
	 */
	public static final  PatternMatcher [][] DATEITYP_BINAERDATEI_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{3,5}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dateityp Binaerdatei Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateityp_Binaerdatei_Type_Pattern(String dateityp_Binaerdatei_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getDateityp_Binaerdatei_Type(), dateityp_Binaerdatei_Type, DATEITYP_BINAERDATEI_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Beschreibung_Type(String datenpunkt_Beschreibung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(datenpunkt_Beschreibung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Laenge_Type(BigDecimal datenpunkt_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatenpunkt_Laenge_Type_Pattern(datenpunkt_Laenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatenpunkt_Laenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] DATENPUNKT_LAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9]|[1-7][0-9]|8[0-3])\\.[0-9])|84\\.0")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datenpunkt Laenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatenpunkt_Laenge_Type_Pattern(BigDecimal datenpunkt_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Laenge_Type(), datenpunkt_Laenge_Type, DATENPUNKT_LAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VGES_Type(BigInteger delta_VGES_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(delta_VGES_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VLES_Type(BigInteger delta_VLES_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(delta_VLES_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelta_VZES_Type(BigInteger delta_VZES_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(delta_VZES_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_ETCS_Type(BigInteger dP_Typ_ETCS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDP_Typ_ETCS_Type_Pattern(dP_Typ_ETCS_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDP_Typ_ETCS_Type_Pattern
	 */
	public static final  PatternMatcher [][] DP_TYP_ETCS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|[1-6][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DP Typ ETCS Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_ETCS_Type_Pattern(BigInteger dP_Typ_ETCS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_ETCS_Type(), dP_Typ_ETCS_Type, DP_TYP_ETCS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_Sonst_Type(String dP_Typ_Sonst_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(dP_Typ_Sonst_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_V_La_Type(BigInteger dP_Typ_V_La_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDP_Typ_V_La_Type_Pattern(dP_Typ_V_La_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDP_Typ_V_La_Type_Pattern
	 */
	public static final  PatternMatcher [][] DP_TYP_VLA_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]|1[0-3][0-9]|140")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DP Typ VLa Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDP_Typ_V_La_Type_Pattern(BigInteger dP_Typ_V_La_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_V_La_Type(), dP_Typ_V_La_Type, DP_TYP_VLA_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_200_Type(BigDecimal dWeg_Intervall_200_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_50_200_Type(BigDecimal dWeg_Intervall_50_200_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWeg_Intervall_50_Type(BigDecimal dWeg_Intervall_50_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMArtBedingungObject(ENUMArtBedingung enumArtBedingungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAusstiegETCSSperreObject(ENUMAusstiegETCSSperre enumAusstiegETCSSperreObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBalisenhalterObject(ENUMBalisenhalter enumBalisenhalterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPATOObject(ENUMDPATO enumdpatoObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPBezugFunktionalArtObject(ENUMDPBezugFunktionalArt enumdpBezugFunktionalArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPLinkArtObject(ENUMDPLinkArt enumdpLinkArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypArtObject(ENUMDPTypArt enumdpTypArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypESGObject(ENUMDPTypESG enumdpTypESGObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypGNTObject(ENUMDPTypGNT enumdpTypGNTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypTransObject(ENUMDPTypTrans enumdpTypTransObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMDPTypZBSObject(ENUMDPTypZBS enumdpTypZBSObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEinzeldateiArtObject(ENUMEinzeldateiArt enumEinzeldateiArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEnergieEingangArtObject(ENUMEnergieEingangArt enumEnergieEingangArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMETCSKnotenArtSonstigeObject(ENUMETCSKnotenArtSonstige enumetcsKnotenArtSonstigeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMEVModulArtObject(ENUMEVModulArt enumevModulArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTGNTPunktartObject(ENUMFTGNTPunktart enumftgntPunktartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTHinweisFunktionObject(ENUMFTHinweisFunktion enumftHinweisFunktionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFTZBSTypObject(ENUMFTZBSTyp enumftzbsTypObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLEUArtObject(ENUMLEUArt enumleuArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMLEVELTRObject(ENUMMLEVELTR enummleveltrObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMNIDSTMObject(ENUMNIDSTM enumnidstmObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMPositionObject(ENUMPosition enumPositionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSBEObject(ENUMSBE enumsbeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSpannungArtObject(ENUMSpannungArt enumSpannungArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStandortangabeBalisenschildObject(ENUMStandortangabeBalisenschild enumStandortangabeBalisenschildObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSTZObject(ENUMSTZ enumstzObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerbotWBArtObject(ENUMVerbotWBArt enumVerbotWBArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMVerwendungAlsRueckfallObject(ENUMVerwendungAlsRueckfall enumVerwendungAlsRueckfallObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMWAnschlussObject(ENUMWAnschluss enumwAnschlussObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMZBSReaktionObject(ENUMZBSReaktion enumzbsReaktionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Erlaeuterung_Type(String esG_Ind_Erlaeuterung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(esG_Ind_Erlaeuterung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Parameter_Type(String esG_Ind_Parameter_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateESG_Ind_Parameter_Type_Pattern(esG_Ind_Parameter_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateESG_Ind_Parameter_Type_Pattern
	 */
	public static final  PatternMatcher [][] ESG_IND_PARAMETER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,15}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ESG Ind Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Parameter_Type_Pattern(String esG_Ind_Parameter_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Ind_Parameter_Type(), esG_Ind_Parameter_Type, ESG_IND_PARAMETER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESG_Ind_Parameterwert_Type(BigInteger esG_Ind_Parameterwert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Gefahrpunktabstand_Abweichend_Type(BigDecimal etcS_Gefahrpunktabstand_Abweichend_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Paketnummer_Type(BigInteger etcS_Paketnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Par_Erlaeuterung_Type(String etcS_Par_Erlaeuterung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(etcS_Par_Erlaeuterung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Parametername_Type(String etcS_Parametername_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(etcS_Parametername_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_Parameterwert_Type(BigInteger etcS_Parameterwert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateETCS_System_Version_Type(String etcS_System_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(etcS_System_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_Modul_Typ_Type(String eV_Modul_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(eV_Modul_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFabrikat_Type(String fabrikat_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(fabrikat_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Subtyp_Type(String fT_ESG_Subtyp_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFT_ESG_Subtyp_Type_Pattern(fT_ESG_Subtyp_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFT_ESG_Subtyp_Type_Pattern
	 */
	public static final  PatternMatcher [][] FT_ESG_SUBTYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{5}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FT ESG Subtyp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Subtyp_Type_Pattern(String fT_ESG_Subtyp_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Subtyp_Type(), fT_ESG_Subtyp_Type, FT_ESG_SUBTYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Typ_Type(String fT_ESG_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFT_ESG_Typ_Type_Pattern(fT_ESG_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFT_ESG_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] FT_ESG_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FT ESG Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ESG_Typ_Type_Pattern(String fT_ESG_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Typ_Type(), fT_ESG_Typ_Type, FT_ESG_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_L2_Typ_Type(BigInteger fT_ETCS_L2_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFT_ETCS_L2_Typ_Type_Pattern(fT_ETCS_L2_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFT_ETCS_L2_Typ_Type_Pattern
	 */
	public static final  PatternMatcher [][] FT_ETCS_L2_TYP_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|[1-9][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>FT ETCS L2 Typ Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFT_ETCS_L2_Typ_Type_Pattern(BigInteger fT_ETCS_L2_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ETCS_L2_Typ_Type(), fT_ETCS_L2_Typ_Type, FT_ETCS_L2_TYP_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFW_Teil_Nummer_Type(BigInteger fW_Teil_Nummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGruppen_ID_Type(String gruppen_ID_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(gruppen_ID_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHinweis_Balisenbefestigung_Type(String hinweis_Balisenbefestigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(hinweis_Balisenbefestigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualisierung_Weitere_Type(String individualisierung_Weitere_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(individualisierung_Weitere_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_1_Type(String km_BTS_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateKilometrierung_Type_Pattern(km_BTS_1_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_2_Type(String km_BTS_2_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateKilometrierung_Type_Pattern(km_BTS_2_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKm_BTS_3_Type(String km_BTS_3_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateKilometrierung_Type_Pattern(km_BTS_3_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKonfigurationskennung_Type(String konfigurationskennung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(konfigurationskennung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateL_ACKLEVELTR_Type(BigDecimal l_ACKLEVELTR_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_1_Type(BigDecimal laenge_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Ausfuehrungsbereich_Type(BigDecimal laenge_Ausfuehrungsbereich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLaenge_Ausfuehrungsbereich_Type_Pattern(laenge_Ausfuehrungsbereich_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLaenge_Ausfuehrungsbereich_Type_Pattern
	 */
	public static final  PatternMatcher [][] LAENGE_AUSFUEHRUNGSBEREICH_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Laenge Ausfuehrungsbereich Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Ausfuehrungsbereich_Type_Pattern(BigDecimal laenge_Ausfuehrungsbereich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getLaenge_Ausfuehrungsbereich_Type(), laenge_Ausfuehrungsbereich_Type, LAENGE_AUSFUEHRUNGSBEREICH_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Gestufte_V_Signalisierung_Type(BigDecimal laenge_Gestufte_V_Signalisierung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaenge_Soll_Mind_150_Type(BigDecimal laenge_Soll_Mind_150_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeistungsbedarf_Type(BigInteger leistungsbedarf_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Ausgang_Nr_Type(BigInteger leU_Ausgang_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Geraetestand_Type(String leU_Modul_Geraetestand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(leU_Modul_Geraetestand_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Modul_Typ_Type(String leU_Modul_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(leU_Modul_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEU_Schaltkasten_Typ_Type(String leU_Schaltkasten_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(leU_Schaltkasten_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLfd_Nr_Am_Bezugspunkt_Type(BigInteger lfd_Nr_Am_Bezugspunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_Distanz_Type(BigDecimal link_Distanz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLLA_Type(BigDecimal llA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_1_Type(BigDecimal massgebende_Neig_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMassgebende_Neig_1_Type_Pattern(massgebende_Neig_1_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMassgebende_Neig_1_Type_Pattern
	 */
	public static final  PatternMatcher [][] MASSGEBENDE_NEIG_1TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Massgebende Neig 1Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_1_Type_Pattern(BigDecimal massgebende_Neig_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getMassgebende_Neig_1_Type(), massgebende_Neig_1_Type, MASSGEBENDE_NEIG_1TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_Schutzstrecke_Type(BigDecimal massgebende_Neig_Schutzstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMassgebende_Neig_Schutzstrecke_Type_Pattern(massgebende_Neig_Schutzstrecke_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMassgebende_Neig_Schutzstrecke_Type_Pattern
	 */
	public static final  PatternMatcher [][] MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Massgebende Neig Schutzstrecke Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neig_Schutzstrecke_Type_Pattern(BigDecimal massgebende_Neig_Schutzstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getMassgebende_Neig_Schutzstrecke_Type(), massgebende_Neig_Schutzstrecke_Type, MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_150_Type(BigDecimal massgebende_Neigung_Mind_150_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_Sig_150_Type(BigDecimal massgebende_Neigung_Mind_Sig_150_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassgebende_Neigung_Mind_Sig_Type(BigDecimal massgebende_Neigung_Mind_Sig_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_Leistung_Type(BigInteger max_Leistung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_Unterbrechungszeit_Type(BigDecimal max_Unterbrechungszeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMax_Unterbrechungszeit_Type_Pattern(max_Unterbrechungszeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMax_Unterbrechungszeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] MAX_UNTERBRECHUNGSZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9]|[1-2][0-9])\\.[0-9]{2})|(30\\.00)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Max Unterbrechungszeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_Unterbrechungszeit_Type_Pattern(BigDecimal max_Unterbrechungszeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getMax_Unterbrechungszeit_Type(), max_Unterbrechungszeit_Type, MAX_UNTERBRECHUNGSZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_Kategorie_Type(BigInteger metallteil_Kategorie_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMetallteil_Kategorie_Type_Pattern(metallteil_Kategorie_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMetallteil_Kategorie_Type_Pattern
	 */
	public static final  PatternMatcher [][] METALLTEIL_KATEGORIE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Metallteil Kategorie Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_Kategorie_Type_Pattern(BigInteger metallteil_Kategorie_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getMetallteil_Kategorie_Type(), metallteil_Kategorie_Type, METALLTEIL_KATEGORIE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetallteil_Laenge_Type(BigDecimal metallteil_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModulnummer_Type(BigInteger modulnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontageabweichung_Type(BigDecimal montageabweichung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_Type(BigInteger neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNeigung_Type_Pattern(neigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNeigung_Type_Pattern
	 */
	public static final  PatternMatcher [][] NEIGUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[5-9]|1[0-9]|2[0-4]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Neigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeigung_Type_Pattern(BigInteger neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getNeigung_Type(), neigung_Type, NEIGUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNennleistung_Type(BigInteger nennleistung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_BG_Type(BigInteger niD_BG_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNID_BG_Type_Pattern(niD_BG_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNID_BG_Type_Pattern
	 */
	public static final  PatternMatcher [][] NID_BG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|1[0-5][0-9]{3}|16[0-2][0-9]{2}|163[0-7][0-9]|1638[0-3]|[1-9][0-9]{0,3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>NID BG Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_BG_Type_Pattern(BigInteger niD_BG_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getNID_BG_Type(), niD_BG_Type, NID_BG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_Type(BigInteger niD_C_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNID_C_Type_Pattern(niD_C_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNID_C_Type_Pattern
	 */
	public static final  PatternMatcher [][] NID_CTYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("102[0-3]|10[0-1][0-9]|[1-9][0-9]{2}|0|[1-9][0-9]{0,1}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>NID CType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_C_Type_Pattern(BigInteger niD_C_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getNID_C_Type(), niD_C_Type, NID_CTYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_RBC_Type(BigInteger niD_RBC_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNID_RBC_Type_Pattern(niD_RBC_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNID_RBC_Type_Pattern
	 */
	public static final  PatternMatcher [][] NID_RBC_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|1[0-5][0-9]{3}|16[0-2][0-9]{2}|163[0-7][0-9]|1638[0-3]|[1-9][0-9]{0,3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>NID RBC Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_RBC_Type_Pattern(BigInteger niD_RBC_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getNID_RBC_Type(), niD_RBC_Type, NID_RBC_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNID_TSR_Type(BigInteger niD_TSR_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNummer_Schaltkasten_Type(BigInteger nummer_Schaltkasten_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Gueterzug_Type(BigInteger oberstrombegrenzung_Gueterzug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOberstrombegrenzung_Gueterzug_Type_Pattern(oberstrombegrenzung_Gueterzug_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOberstrombegrenzung_Gueterzug_Type_Pattern
	 */
	public static final  PatternMatcher [][] OBERSTROMBEGRENZUNG_GUETERZUG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,2}|1[0-9]{3}|2000")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oberstrombegrenzung Gueterzug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Gueterzug_Type_Pattern(BigInteger oberstrombegrenzung_Gueterzug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getOberstrombegrenzung_Gueterzug_Type(), oberstrombegrenzung_Gueterzug_Type, OBERSTROMBEGRENZUNG_GUETERZUG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Reisezug_Type(BigInteger oberstrombegrenzung_Reisezug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOberstrombegrenzung_Reisezug_Type_Pattern(oberstrombegrenzung_Reisezug_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOberstrombegrenzung_Reisezug_Type_Pattern
	 */
	public static final  PatternMatcher [][] OBERSTROMBEGRENZUNG_REISEZUG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,2}|1[0-9]{3}|2000")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oberstrombegrenzung Reisezug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberstrombegrenzung_Reisezug_Type_Pattern(BigInteger oberstrombegrenzung_Reisezug_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getOberstrombegrenzung_Reisezug_Type(), oberstrombegrenzung_Reisezug_Type, OBERSTROMBEGRENZUNG_REISEZUG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Nr_Ausg_Physisch_Type(BigInteger port_Nr_Ausg_Physisch_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_Sonstige_Type(String position_Sonstige_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(position_Sonstige_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_Type(BigInteger prioritaet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrioritaet_Type_Pattern(prioritaet_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePrioritaet_Type_Pattern
	 */
	public static final  PatternMatcher [][] PRIORITAET_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1[0-5]|[1-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Prioritaet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritaet_Type_Pattern(BigInteger prioritaet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getPrioritaet_Type(), prioritaet_Type, PRIORITAET_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjektierungsfall_Type(BigInteger projektierungsfall_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_ETCS_System_Version_Type(BigInteger rbC_ETCS_System_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_SRS_Version_Type(String rbC_SRS_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRBC_SRS_Version_Type_Pattern(rbC_SRS_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRBC_SRS_Version_Type_Pattern
	 */
	public static final  PatternMatcher [][] RBC_SRS_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>RBC SRS Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRBC_SRS_Version_Type_Pattern(String rbC_SRS_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getRBC_SRS_Version_Type(), rbC_SRS_Version_Type, RBC_SRS_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRekursion_2_Nr_Type(BigInteger rekursion_2_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRekursion_Nr_Type(BigInteger rekursion_Nr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRufnummer_Type(String rufnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(rufnummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzstrecke_Erforderlich_Type(BigDecimal schutzstrecke_Erforderlich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzstrecke_Vorhanden_Type(BigDecimal schutzstrecke_Vorhanden_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolllaenge_Mind_Sig_150_Type(BigDecimal solllaenge_Mind_Sig_150_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolllaenge_Mind_Sig_Type(BigDecimal solllaenge_Mind_Sig_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSonstige_Standortangabe_Type(String sonstige_Standortangabe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(sonstige_Standortangabe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpannung_Toleranz_Obere_Type(BigInteger spannung_Toleranz_Obere_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpannung_Toleranz_Untere_Type(BigInteger spannung_Toleranz_Untere_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSRS_Version_Type(String srS_Version_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(srS_Version_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_Vor_Grenze_Besonders_Type(String system_Vor_Grenze_Besonders_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSystem_Vor_Grenze_Besonders_Type_Pattern(system_Vor_Grenze_Besonders_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSystem_Vor_Grenze_Besonders_Type_Pattern
	 */
	public static final  PatternMatcher [][] SYSTEM_VOR_GRENZE_BESONDERS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>System Vor Grenze Besonders Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_Vor_Grenze_Besonders_Type_Pattern(String system_Vor_Grenze_Besonders_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getSystem_Vor_Grenze_Besonders_Type(), system_Vor_Grenze_Besonders_Type, SYSTEM_VOR_GRENZE_BESONDERS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBV_Tunnelbereich_Laenge_Type(BigDecimal tbV_Tunnelbereich_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegramm_Index_Type(String telegramm_Index_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(telegramm_Index_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelegrammnummer_Type(BigInteger telegrammnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_Bedingung_Type(String text_Bedingung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(text_Bedingung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextmeldung_Type(String textmeldung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(textmeldung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberbrueckung_EV_Unterbrechung_Type(BigDecimal ueberbrueckung_EV_Unterbrechung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUeberbrueckung_EV_Unterbrechung_Type_Pattern(ueberbrueckung_EV_Unterbrechung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUeberbrueckung_EV_Unterbrechung_Type_Pattern
	 */
	public static final  PatternMatcher [][] UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-1]\\.[0-9]{2})|(2\\.[0-4][0-9])|(2\\.50)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ueberbrueckung EV Unterbrechung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberbrueckung_EV_Unterbrechung_Type_Pattern(BigDecimal ueberbrueckung_EV_Unterbrechung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getUeberbrueckung_EV_Unterbrechung_Type(), ueberbrueckung_EV_Unterbrechung_Type, UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUeberwachung_Laenge_Type(BigDecimal ueberwachung_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntergruppen_ID_Type(String untergruppen_ID_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(untergruppen_ID_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Befehl_R_Type(BigInteger v_Befehl_R_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Befehl_R_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Befehl_Z_Type(BigInteger v_Befehl_Z_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Befehl_Z_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Frei_Type(BigInteger v_Frei_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Frei_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Start_Type(BigInteger v_Start_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Start_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Ziel_Type(BigInteger v_Ziel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Ziel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Zul_Strecke_Type(BigInteger v_Zul_Strecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Zul_Strecke_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_Kennung_Type(BigInteger vbC_Kennung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_NID_C_Type(BigInteger vbC_NID_C_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBC_Timer_Type(BigInteger vbC_Timer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerbot_Anhalten_Type(String verbot_Anhalten_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(verbot_Anhalten_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkuerzter_Abstand_Type(BigInteger verkuerzter_Abstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerwendung_Hilfe_Type(String verwendung_Hilfe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(verwendung_Hilfe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerwendung_Type(String verwendung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(verwendung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_1_Type(BigInteger vgR_1_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vgR_1_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_2_Type(BigInteger vgR_2_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vgR_2_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGR_Type(BigInteger vgR_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vgR_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLA_Type(BigInteger vlA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vlA_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorsignalabstand_Type(BigDecimal vorsignalabstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVZ_Type(BigInteger vZ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(vZ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirkrichtung_In_Datenpunkt_Type(ENUMWirkrichtung wirkrichtung_In_Datenpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Distanz_Type(BigDecimal zbS_La_Bereich_Distanz_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Geschwindigkeit_Type(BigInteger zbS_La_Bereich_Geschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(zbS_La_Bereich_Geschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Laenge_Type(BigDecimal zbS_La_Bereich_Laenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Neigung_Type(BigDecimal zbS_La_Bereich_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZBS_La_Bereich_Neigung_Type_Pattern(zbS_La_Bereich_Neigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZBS_La_Bereich_Neigung_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZBS_LA_BEREICH_NEIGUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-([1-9]|[1-7][0-9]|80)\\.[0-9]{2}|-0\\.[1-9][0-9]|-0\\.0[1-9]|[0-9]\\.[0-9]{2}|[1-7][0-9]\\.[0-9]{2}|80\\.00")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ZBS La Bereich Neigung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZBS_La_Bereich_Neigung_Type_Pattern(BigDecimal zbS_La_Bereich_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Balisentechnik_ETCSPackage.eINSTANCE.getZBS_La_Bereich_Neigung_Type(), zbS_La_Bereich_Neigung_Type, ZBS_LA_BEREICH_NEIGUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZLA_Type(BigDecimal zlA_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //Balisentechnik_ETCSValidator
