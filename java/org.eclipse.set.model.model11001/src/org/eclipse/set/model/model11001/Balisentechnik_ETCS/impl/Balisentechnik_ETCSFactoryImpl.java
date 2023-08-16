/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.*;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Balisentechnik_ETCSFactoryImpl extends EFactoryImpl implements Balisentechnik_ETCSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Balisentechnik_ETCSFactory init() {
		try {
			Balisentechnik_ETCSFactory theBalisentechnik_ETCSFactory = (Balisentechnik_ETCSFactory)EPackage.Registry.INSTANCE.getEFactory(Balisentechnik_ETCSPackage.eNS_URI);
			if (theBalisentechnik_ETCSFactory != null) {
				return theBalisentechnik_ETCSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Balisentechnik_ETCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balisentechnik_ETCSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Balisentechnik_ETCSPackage.ABSTAND_BES_LANGER_EINFAHRWEG_TYPE_CLASS: return createAbstand_Bes_Langer_Einfahrweg_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EH_EM_FOLGESIGNAL_TYPE_CLASS: return createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EP_TPI_TYPE_CLASS: return createAbstand_Datenpunkt_EP_TPI_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL_TYPE_CLASS: return createAbstand_Datenpunkt_TPI_Folgesignal_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_EINMESSPUNKT_TYPE_CLASS: return createAbstand_Einmesspunkt_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE_CLASS: return createAbstand_Grenze_Bereich_C_TypeClass();
			case Balisentechnik_ETCSPackage.ABSTAND_REDUZIERT_TYPE_CLASS: return createAbstand_Reduziert_TypeClass();
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE_CLASS: return createAnlagenteil_Sonstige_TypeClass();
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE_CLASS: return createAnordnung_Im_DP_TypeClass();
			case Balisentechnik_ETCSPackage.ANWENDUNG_ESG_TYPE_CLASS: return createAnwendung_ESG_TypeClass();
			case Balisentechnik_ETCSPackage.ANWENDUNG_GNT_TYPE_CLASS: return createAnwendung_GNT_TypeClass();
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE_CLASS: return createAnwendung_Sonst_TypeClass();
			case Balisentechnik_ETCSPackage.ANWENDUNGSSYSTEM_TYPE_CLASS: return createAnwendungssystem_TypeClass();
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE_CLASS: return createAnzahl_Voll_LEU_Kalkuliert_TypeClass();
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE_CLASS: return createAnzeigetext_TypeClass();
			case Balisentechnik_ETCSPackage.ART_BEDINGUNG_TYPE_CLASS: return createArt_Bedingung_TypeClass();
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE_CLASS: return createAusgang_Nr_TypeClass();
			case Balisentechnik_ETCSPackage.AUSRICHTUNG_TYPE_CLASS: return createAusrichtung_TypeClass();
			case Balisentechnik_ETCSPackage.AUSSTIEG_ETCS_SPERRE_TYPE_CLASS: return createAusstieg_ETCS_Sperre_TypeClass();
			case Balisentechnik_ETCSPackage.BALISE: return createBalise();
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP: return createBalise_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BALISE_GERAETESTAND_TYPE_CLASS: return createBalise_Geraetestand_TypeClass();
			case Balisentechnik_ETCSPackage.BALISENHALTER_TYPE_CLASS: return createBalisenhalter_TypeClass();
			case Balisentechnik_ETCSPackage.BASELINE_SYSTEM_VERSION_TYPE_CLASS: return createBaseline_System_Version_TypeClass();
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP: return createBedingung_Besondere_AttributeGroup();
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP: return createBedingung_PZB_AttributeGroup();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP: return createBedingung_Signal_AttributeGroup();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP: return createBedingung_Sonstige_AttributeGroup();
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP: return createBedingung_Weiche_AttributeGroup();
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE_CLASS: return createBedingung_Weichenlage_TypeClass();
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE_CLASS: return createBez_Strecke_BTS_1_TypeClass();
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE_CLASS: return createBez_Strecke_BTS_2_TypeClass();
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE_CLASS: return createBez_Strecke_BTS_3_TypeClass();
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE_CLASS: return createBez_ZUB_Bereichsgrenze_TypeClass();
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE_CLASS: return createBezeichnung_ETCS_Kante_TypeClass();
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE_CLASS: return createBezeichnung_LEU_Anlage_TypeClass();
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE_CLASS: return createBezeichnung_ZUB_SE_TypeClass();
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE_CLASS: return createBezeichnung_ZUB_TypeClass();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_ESG_BED_AUSSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_L2_BED_EINSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_LZB_BED_EINSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_ZBS_BED_EINSTIEG_ATTRIBUTE_GROUP: return createBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP: return createBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup();
			case Balisentechnik_ETCSPackage.BINAERDATEN: return createBinaerdaten();
			case Balisentechnik_ETCSPackage.BINAERDATEN_DATEI_ATTRIBUTE_GROUP: return createBinaerdaten_Datei_AttributeGroup();
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE_CLASS: return createD_LEVELTR_TypeClass();
			case Balisentechnik_ETCSPackage.DATEINAME_TYPE_CLASS: return createDateiname_TypeClass();
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE_CLASS: return createDateityp_Binaerdatei_TypeClass();
			case Balisentechnik_ETCSPackage.DATEN_TYPE_CLASS: return createDaten_TypeClass();
			case Balisentechnik_ETCSPackage.DATENPUNKT: return createDatenpunkt();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP: return createDatenpunkt_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE_CLASS: return createDatenpunkt_Beschreibung_TypeClass();
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP: return createDatenpunkt_Einmesspunkt_AttributeGroup();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE_CLASS: return createDatenpunkt_Laenge_TypeClass();
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK: return createDatenpunkt_Link();
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE_CLASS: return createDelta_VGES_TypeClass();
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE_CLASS: return createDelta_VLES_TypeClass();
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE_CLASS: return createDelta_VZES_TypeClass();
			case Balisentechnik_ETCSPackage.DP_ATO_TYPE_CLASS: return createDP_ATO_TypeClass();
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ART_TYPE_CLASS: return createDP_Bezug_Funktional_Art_TypeClass();
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP: return createDP_Bezug_Funktional_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP: return createDP_ETCS_Adresse_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_LINK_ART_TYPE_CLASS: return createDP_Link_Art_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ATTRIBUTE_GROUP: return createDP_Telegramm_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP: return createDP_Telegramm_ESG_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_ART_TYPE_CLASS: return createDP_Typ_Art_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP: return createDP_Typ_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_ESG_TYPE_CLASS: return createDP_Typ_ESG_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE_CLASS: return createDP_Typ_ETCS_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP: return createDP_Typ_GESG_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP: return createDP_Typ_GETCS_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP: return createDP_Typ_GGNT_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_GNT_TYPE_CLASS: return createDP_Typ_GNT_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP: return createDP_Typ_GSonst_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP: return createDP_Typ_GTrans_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP: return createDP_Typ_GZBS_AttributeGroup();
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE_CLASS: return createDP_Typ_Sonst_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_TRANS_TYPE_CLASS: return createDP_Typ_Trans_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE_CLASS: return createDP_Typ_V_La_TypeClass();
			case Balisentechnik_ETCSPackage.DP_TYP_ZBS_TYPE_CLASS: return createDP_Typ_ZBS_TypeClass();
			case Balisentechnik_ETCSPackage.DP_VERLINKT_TYPE_CLASS: return createDP_Verlinkt_TypeClass();
			case Balisentechnik_ETCSPackage.DUNKELSCHALTANSTOSS_TYPE_CLASS: return createDunkelschaltanstoss_TypeClass();
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE_CLASS: return createDWeg_Intervall_200_TypeClass();
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE_CLASS: return createDWeg_Intervall_50_200_TypeClass();
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE_CLASS: return createDWeg_Intervall_50_TypeClass();
			case Balisentechnik_ETCSPackage.EINGANG_GEPUFFERT_TYPE_CLASS: return createEingang_Gepuffert_TypeClass();
			case Balisentechnik_ETCSPackage.EINSTIEG_ERLAUBT_TYPE_CLASS: return createEinstieg_Erlaubt_TypeClass();
			case Balisentechnik_ETCSPackage.EINSTIEG_OHNE_RUECKW_SIG_TYPE_CLASS: return createEinstieg_Ohne_Rueckw_Sig_TypeClass();
			case Balisentechnik_ETCSPackage.EINZELDATEI_ART_TYPE_CLASS: return createEinzeldatei_Art_TypeClass();
			case Balisentechnik_ETCSPackage.ENERGIE_EINGANG_ART_TYPE_CLASS: return createEnergie_Eingang_Art_TypeClass();
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE_CLASS: return createESG_Ind_Erlaeuterung_TypeClass();
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE_CLASS: return createESG_Ind_Parameter_TypeClass();
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE_CLASS: return createESG_Ind_Parameterwert_TypeClass();
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP: return createESG_Individuelle_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP: return createESG_Spezifische_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP: return createETCS_Adresse_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND_TYPE_CLASS: return createETCS_Gefahrpunktabstand_Abweichend_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_KANTE: return createETCS_Kante();
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createETCS_Kante_Bezeichnung_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN: return createETCS_Knoten();
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN_ART_SONSTIGE_TYPE_CLASS: return createETCS_Knoten_Art_Sonstige_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE_CLASS: return createETCS_Paketnummer_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE_CLASS: return createETCS_Par_Erlaeuterung_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE_CLASS: return createETCS_Parametername_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE_CLASS: return createETCS_Parameterwert_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE: return createETCS_Richtungsanzeige();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL: return createETCS_Signal();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP: return createETCS_Signal_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP: return createETCS_Signal_DWeg_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP: return createETCS_Signal_TBV_AttributeGroup();
			case Balisentechnik_ETCSPackage.ETCS_SYSTEM_VERSION_TYPE_CLASS: return createETCS_System_Version_TypeClass();
			case Balisentechnik_ETCSPackage.ETCS_WKR: return createETCS_W_Kr();
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP: return createETCS_W_Kr_MUKA_AttributeGroup();
			case Balisentechnik_ETCSPackage.EV_MODUL: return createEV_Modul();
			case Balisentechnik_ETCSPackage.EV_MODUL_ART_TYPE_CLASS: return createEV_Modul_Art_TypeClass();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP: return createEV_Modul_Ausgang_AttributeGroup();
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP: return createEV_Modul_Eingang_AttributeGroup();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP: return createEV_Modul_Physisch_AttributeGroup();
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE_CLASS: return createEV_Modul_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP: return createEV_Modul_Virtuell_AttributeGroup();
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE_CLASS: return createFabrikat_TypeClass();
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM: return createFachtelegramm();
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG: return createFT_Anschaltbedingung();
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP: return createFT_ESG_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE_CLASS: return createFT_ESG_Subtyp_TypeClass();
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE_CLASS: return createFT_ESG_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP: return createFT_ETCS_L2_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE_CLASS: return createFT_ETCS_L2_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP: return createFT_ETCS_Trans_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP: return createFT_ETCS_Trans_Paket_41_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_NATTRIBUTE_GROUP: return createFT_ETCS_Trans_Paket_N_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL: return createFT_Fahrweg_Teil();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP: return createFT_Fahrweg_Teil_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP: return createFT_Fahrweg_Teile_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP: return createFT_GNT_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_GNT_PUNKTART_TYPE_CLASS: return createFT_GNT_Punktart_TypeClass();
			case Balisentechnik_ETCSPackage.FT_HINWEIS_FUNKTION_TYPE_CLASS: return createFT_Hinweis_Funktion_TypeClass();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP: return createFT_ZBS_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP: return createFT_ZBS_Merkmale_La_AttributeGroup();
			case Balisentechnik_ETCSPackage.FT_ZBS_TYP_TYPE_CLASS: return createFT_ZBS_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.FW_TEIL_NUMMER_TYPE_CLASS: return createFW_Teil_Nummer_TypeClass();
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE_CLASS: return createGruppen_ID_TypeClass();
			case Balisentechnik_ETCSPackage.HARTER_AUSSTIEG_AUS_L2_TYPE_CLASS: return createHarter_Ausstieg_Aus_L2_TypeClass();
			case Balisentechnik_ETCSPackage.HERSTELLER_TYPE_CLASS: return createHersteller_TypeClass();
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE_CLASS: return createHinweis_Balisenbefestigung_TypeClass();
			case Balisentechnik_ETCSPackage.INDIVIDUALISIERUNG_WEITERE_TYPE_CLASS: return createIndividualisierung_Weitere_TypeClass();
			case Balisentechnik_ETCSPackage.IST_BEFAHREN_TYPE_CLASS: return createIst_Befahren_TypeClass();
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE_CLASS: return createKm_BTS_1_TypeClass();
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE_CLASS: return createKm_BTS_2_TypeClass();
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE_CLASS: return createKm_BTS_3_TypeClass();
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP: return createKnoten_Auf_TOP_Kante_AttributeGroup();
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE_CLASS: return createKonfigurationskennung_TypeClass();
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE_CLASS: return createL_ACKLEVELTR_TypeClass();
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE_CLASS: return createLaenge_1_TypeClass();
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE_CLASS: return createLaenge_Ausfuehrungsbereich_TypeClass();
			case Balisentechnik_ETCSPackage.LAENGE_GESTUFTE_VSIGNALISIERUNG_TYPE_CLASS: return createLaenge_Gestufte_V_Signalisierung_TypeClass();
			case Balisentechnik_ETCSPackage.LAENGE_SOLL_MIND_150_TYPE_CLASS: return createLaenge_Soll_Mind_150_TypeClass();
			case Balisentechnik_ETCSPackage.LEISTUNGSBEDARF_TYPE_CLASS: return createLeistungsbedarf_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE: return createLEU_Anlage();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createLEU_Anlage_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ART_TYPE_CLASS: return createLEU_Anlage_Art_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createLEU_Anlage_Bezeichnung_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE_CLASS: return createLEU_Ausgang_Nr_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_MODUL: return createLEU_Modul();
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP: return createLEU_Modul_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_MODUL_ART_TYPE_CLASS: return createLEU_Modul_Art_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP: return createLEU_Modul_Ausgang_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP: return createLEU_Modul_Bezeichnung_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_MODUL_GERAETESTAND_TYPE_CLASS: return createLEU_Modul_Geraetestand_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE_CLASS: return createLEU_Modul_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN: return createLEU_Schaltkasten();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP: return createLEU_Schaltkasten_Bezeichnung_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP: return createLEU_Schaltkasten_Energie_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP: return createLEU_Schaltkasten_Position_AttributeGroup();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE_CLASS: return createLEU_Schaltkasten_Typ_TypeClass();
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP: return createLEU_Steuernde_AttributeGroup();
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE_CLASS: return createLfd_Nr_Am_Bezugspunkt_TypeClass();
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE_CLASS: return createLink_Distanz_TypeClass();
			case Balisentechnik_ETCSPackage.LLA_TYPE_CLASS: return createLLA_TypeClass();
			case Balisentechnik_ETCSPackage.LM_GTYPE_CLASS: return createLM_G_TypeClass();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP: return createLT_Binaerdatei_Hilfe_AttributeGroup();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP: return createLT_Binaerdaten_AttributeGroup();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM: return createLuft_Telegramm();
			case Balisentechnik_ETCSPackage.MLEVELTR_TYPE_CLASS: return createM_LEVELTR_TypeClass();
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE_CLASS: return createMassgebende_Neig_1_TypeClass();
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE_CLASS: return createMassgebende_Neig_Schutzstrecke_TypeClass();
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_150_TYPE_CLASS: return createMassgebende_Neigung_Mind_150_TypeClass();
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_150_TYPE_CLASS: return createMassgebende_Neigung_Mind_Sig_150_TypeClass();
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_TYPE_CLASS: return createMassgebende_Neigung_Mind_Sig_TypeClass();
			case Balisentechnik_ETCSPackage.MASTSCHILD_TYPE_CLASS: return createMastschild_TypeClass();
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE_CLASS: return createMax_Leistung_TypeClass();
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE_CLASS: return createMax_Unterbrechungszeit_TypeClass();
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP: return createMetallteil_AttributeGroup();
			case Balisentechnik_ETCSPackage.METALLTEIL_KATEGORIE_TYPE_CLASS: return createMetallteil_Kategorie_TypeClass();
			case Balisentechnik_ETCSPackage.METALLTEIL_LAENGE_TYPE_CLASS: return createMetallteil_Laenge_TypeClass();
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE_CLASS: return createModulnummer_TypeClass();
			case Balisentechnik_ETCSPackage.MONTAGEABWEICHUNG_TYPE_CLASS: return createMontageabweichung_TypeClass();
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE_CLASS: return createNeigung_TypeClass();
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE_CLASS: return createNennleistung_TypeClass();
			case Balisentechnik_ETCSPackage.NID_BG_TYPE_CLASS: return createNID_BG_TypeClass();
			case Balisentechnik_ETCSPackage.NID_CTYPE_CLASS: return createNID_C_TypeClass();
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE_CLASS: return createNID_RBC_TypeClass();
			case Balisentechnik_ETCSPackage.NID_STM_TYPE_CLASS: return createNID_STM_TypeClass();
			case Balisentechnik_ETCSPackage.NID_TSR_TYPE_CLASS: return createNID_TSR_TypeClass();
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE_CLASS: return createNummer_Schaltkasten_TypeClass();
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE_CLASS: return createOberstrombegrenzung_Gueterzug_TypeClass();
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE_CLASS: return createOberstrombegrenzung_Reisezug_TypeClass();
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE_CLASS: return createPort_Nr_Ausg_Physisch_TypeClass();
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE_CLASS: return createPosition_Sonstige_TypeClass();
			case Balisentechnik_ETCSPackage.POSITION_TYPE_CLASS: return createPosition_TypeClass();
			case Balisentechnik_ETCSPackage.PRIMAERQUELLE_TYPE_CLASS: return createPrimaerquelle_TypeClass();
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE_CLASS: return createPrioritaet_TypeClass();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP: return createProg_Datei_Einzel_AttributeGroup();
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE: return createProg_Datei_Gruppe();
			case Balisentechnik_ETCSPackage.PROJEKTIERUNGSFALL_TYPE_CLASS: return createProjektierungsfall_TypeClass();
			case Balisentechnik_ETCSPackage.RBC: return createRBC();
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP: return createRBC_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.RBC_ETCS_SYSTEM_VERSION_TYPE_CLASS: return createRBC_ETCS_System_Version_TypeClass();
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE_CLASS: return createRBC_SRS_Version_TypeClass();
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE_CLASS: return createRekursion_2_Nr_TypeClass();
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE_CLASS: return createRekursion_Nr_TypeClass();
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE_CLASS: return createRufnummer_TypeClass();
			case Balisentechnik_ETCSPackage.SBE_TYPE_CLASS: return createSBE_TypeClass();
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE_CLASS: return createSchutzstrecke_Erforderlich_TypeClass();
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE_CLASS: return createSchutzstrecke_Vorhanden_TypeClass();
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_150_TYPE_CLASS: return createSolllaenge_Mind_Sig_150_TypeClass();
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_TYPE_CLASS: return createSolllaenge_Mind_Sig_TypeClass();
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE_CLASS: return createSonstige_Standortangabe_TypeClass();
			case Balisentechnik_ETCSPackage.SPANNUNG_ART_TYPE_CLASS: return createSpannung_Art_TypeClass();
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE_CLASS: return createSpannung_Toleranz_Obere_TypeClass();
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE_CLASS: return createSpannung_Toleranz_Untere_TypeClass();
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE_CLASS: return createSRS_Version_TypeClass();
			case Balisentechnik_ETCSPackage.STANDORTANGABE_BALISENSCHILD_TYPE_CLASS: return createStandortangabe_Balisenschild_TypeClass();
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP: return createStart_W_Element_AttributeGroup();
			case Balisentechnik_ETCSPackage.STZ_TYPE_CLASS: return createSTZ_TypeClass();
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE_CLASS: return createSystem_Vor_Grenze_Besonders_TypeClass();
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_TYPE_CLASS: return createSystem_Vor_Grenze_TypeClass();
			case Balisentechnik_ETCSPackage.TBV_MELDEPUNKT_TYPE_CLASS: return createTBV_Meldepunkt_TypeClass();
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE_CLASS: return createTBV_Tunnelbereich_Laenge_TypeClass();
			case Balisentechnik_ETCSPackage.TBV_TUNNELSIGNAL_TYPE_CLASS: return createTBV_Tunnelsignal_TypeClass();
			case Balisentechnik_ETCSPackage.TELEGRAMM_INDEX_TYPE_CLASS: return createTelegramm_Index_TypeClass();
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE_CLASS: return createTelegrammnummer_TypeClass();
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE_CLASS: return createText_Bedingung_TypeClass();
			case Balisentechnik_ETCSPackage.TEXTMELDUNG_TYPE_CLASS: return createTextmeldung_TypeClass();
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE_CLASS: return createUeberbrueckung_EV_Unterbrechung_TypeClass();
			case Balisentechnik_ETCSPackage.UEBERWACHUNG_LAENGE_TYPE_CLASS: return createUeberwachung_Laenge_TypeClass();
			case Balisentechnik_ETCSPackage.UMFAHRSTRASSE_TYPE_CLASS: return createUmfahrstrasse_TypeClass();
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE_CLASS: return createUntergruppen_ID_TypeClass();
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE_CLASS: return createV_Befehl_R_TypeClass();
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE_CLASS: return createV_Befehl_Z_TypeClass();
			case Balisentechnik_ETCSPackage.VFREI_TYPE_CLASS: return createV_Frei_TypeClass();
			case Balisentechnik_ETCSPackage.VSTART_TYPE_CLASS: return createV_Start_TypeClass();
			case Balisentechnik_ETCSPackage.VZIEL_TYPE_CLASS: return createV_Ziel_TypeClass();
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE_CLASS: return createV_Zul_Strecke_TypeClass();
			case Balisentechnik_ETCSPackage.VBC_KENNUNG_TYPE_CLASS: return createVBC_Kennung_TypeClass();
			case Balisentechnik_ETCSPackage.VBC_NID_CTYPE_CLASS: return createVBC_NID_C_TypeClass();
			case Balisentechnik_ETCSPackage.VBC_SETZEN_TYPE_CLASS: return createVBC_Setzen_TypeClass();
			case Balisentechnik_ETCSPackage.VBC_TIMER_TYPE_CLASS: return createVBC_Timer_TypeClass();
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE_CLASS: return createVerbot_Anhalten_TypeClass();
			case Balisentechnik_ETCSPackage.VERBOT_REGENERATIVE_BREMSE_TYPE_CLASS: return createVerbot_Regenerative_Bremse_TypeClass();
			case Balisentechnik_ETCSPackage.VERBOT_WB_ART_TYPE_CLASS: return createVerbot_WB_Art_TypeClass();
			case Balisentechnik_ETCSPackage.VERKUERZTER_ABSTAND_TYPE_CLASS: return createVerkuerzter_Abstand_TypeClass();
			case Balisentechnik_ETCSPackage.VERWENDUNG_ALS_RUECKFALL_TYPE_CLASS: return createVerwendung_Als_Rueckfall_TypeClass();
			case Balisentechnik_ETCSPackage.VERWENDUNG_HILFE_TYPE_CLASS: return createVerwendung_Hilfe_TypeClass();
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE_CLASS: return createVerwendung_TypeClass();
			case Balisentechnik_ETCSPackage.VGR_1TYPE_CLASS: return createVGR_1_TypeClass();
			case Balisentechnik_ETCSPackage.VGR_2TYPE_CLASS: return createVGR_2_TypeClass();
			case Balisentechnik_ETCSPackage.VGR_TYPE_CLASS: return createVGR_TypeClass();
			case Balisentechnik_ETCSPackage.VLA_TYPE_CLASS: return createVLA_TypeClass();
			case Balisentechnik_ETCSPackage.VORSIGNALABSTAND_TYPE_CLASS: return createVorsignalabstand_TypeClass();
			case Balisentechnik_ETCSPackage.VZ_TYPE_CLASS: return createVZ_TypeClass();
			case Balisentechnik_ETCSPackage.WANSCHLUSS_TYPE_CLASS: return createW_Anschluss_TypeClass();
			case Balisentechnik_ETCSPackage.WLAGE_TYPE_CLASS: return createW_Lage_TypeClass();
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE_CLASS: return createWirkrichtung_In_Datenpunkt_TypeClass();
			case Balisentechnik_ETCSPackage.WIRKSAM_TYPE_CLASS: return createWirksam_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE_CLASS: return createZBS_La_Bereich_Distanz_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE_CLASS: return createZBS_La_Bereich_Geschwindigkeit_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE_CLASS: return createZBS_La_Bereich_Laenge_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE_CLASS: return createZBS_La_Bereich_Neigung_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP: return createZBS_Merkmale_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZBS_REAKTION_TYPE_CLASS: return createZBS_Reaktion_TypeClass();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE: return createZBS_Schutzstrecke();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP: return createZBS_Schutzstrecke_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL: return createZBS_Signal();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL_SIGNALABSTAND_ATTRIBUTE_GROUP: return createZBS_Signal_Signalabstand_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZIEL_DP_AUSRICHTUNG_TYPE_CLASS: return createZiel_DP_Ausrichtung_TypeClass();
			case Balisentechnik_ETCSPackage.ZIEL_IST_FAHRWEGENDE_TYPE_CLASS: return createZiel_Ist_Fahrwegende_TypeClass();
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP: return createZiel_W_Element_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZLA_TYPE_CLASS: return createZLA_TypeClass();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE: return createZUB_Bereichsgrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Allg_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Bezeichnung_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ESG_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_ESG_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_GNT_TYPE_CLASS: return createZUB_Bereichsgrenze_Nach_GNT_TypeClass();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_L2_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_LZB_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_LZB_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_PZB_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ZBS_ATTRIBUTE_GROUP: return createZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP: return createZUB_Bgrenze_RBC_Wechsel_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP: return createZUB_SE_Ausruestung_AttributeGroup();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT: return createZUB_Streckeneigenschaft();
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG:
				return createENUMArtBedingungFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE:
				return createENUMAusstiegETCSSperreFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER:
				return createENUMBalisenhalterFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDPATO:
				return createENUMDPATOFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART:
				return createENUMDPBezugFunktionalArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART:
				return createENUMDPLinkArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART:
				return createENUMDPTypArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG:
				return createENUMDPTypESGFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT:
				return createENUMDPTypGNTFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS:
				return createENUMDPTypTransFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS:
				return createENUMDPTypZBSFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART:
				return createENUMEinzeldateiArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART:
				return createENUMEnergieEingangArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE:
				return createENUMETCSKnotenArtSonstigeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART:
				return createENUMEVModulArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART:
				return createENUMFTGNTPunktartFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION:
				return createENUMFTHinweisFunktionFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP:
				return createENUMFTZBSTypFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART:
				return createENUMLEUArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR:
				return createENUMMLEVELTRFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM:
				return createENUMNIDSTMFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_POSITION:
				return createENUMPositionFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMSBE:
				return createENUMSBEFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART:
				return createENUMSpannungArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD:
				return createENUMStandortangabeBalisenschildFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMSTZ:
				return createENUMSTZFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART:
				return createENUMVerbotWBArtFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL:
				return createENUMVerwendungAlsRueckfallFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS:
				return createENUMWAnschlussFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION:
				return createENUMZBSReaktionFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_BES_LANGER_EINFAHRWEG_TYPE:
				return createAbstand_Bes_Langer_Einfahrweg_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EH_EM_FOLGESIGNAL_TYPE:
				return createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EP_TPI_TYPE:
				return createAbstand_Datenpunkt_EP_TPI_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL_TYPE:
				return createAbstand_Datenpunkt_TPI_Folgesignal_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_EINMESSPUNKT_TYPE:
				return createAbstand_Einmesspunkt_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE:
				return createAbstand_Grenze_Bereich_C_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE:
				return createAnlagenteil_Sonstige_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE:
				return createAnordnung_Im_DP_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE:
				return createAnwendung_Sonst_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE:
				return createAnzahl_Voll_LEU_Kalkuliert_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE:
				return createAnzeigetext_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE:
				return createAusgang_Nr_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BALISE_GERAETESTAND_TYPE:
				return createBalise_Geraetestand_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BASELINE_SYSTEM_VERSION_TYPE:
				return createBaseline_System_Version_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE:
				return createBedingung_Weichenlage_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE:
				return createBez_Strecke_BTS_1_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE:
				return createBez_Strecke_BTS_2_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE:
				return createBez_Strecke_BTS_3_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE:
				return createBez_ZUB_Bereichsgrenze_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE:
				return createBezeichnung_ETCS_Kante_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE:
				return createBezeichnung_LEU_Anlage_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE:
				return createBezeichnung_ZUB_SE_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE:
				return createBezeichnung_ZUB_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE:
				return createD_LEVELTR_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE:
				return createDateityp_Binaerdatei_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE:
				return createDatenpunkt_Beschreibung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE:
				return createDatenpunkt_Laenge_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE:
				return createDelta_VGES_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE:
				return createDelta_VLES_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE:
				return createDelta_VZES_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE:
				return createDP_Typ_ETCS_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE:
				return createDP_Typ_Sonst_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE:
				return createDP_Typ_V_La_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE:
				return createDWeg_Intervall_200_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE:
				return createDWeg_Intervall_50_200_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE:
				return createDWeg_Intervall_50_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG_OBJECT:
				return createENUMArtBedingungObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE_OBJECT:
				return createENUMAusstiegETCSSperreObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER_OBJECT:
				return createENUMBalisenhalterObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDPATO_OBJECT:
				return createENUMDPATOObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART_OBJECT:
				return createENUMDPBezugFunktionalArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART_OBJECT:
				return createENUMDPLinkArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART_OBJECT:
				return createENUMDPTypArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG_OBJECT:
				return createENUMDPTypESGObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT_OBJECT:
				return createENUMDPTypGNTObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS_OBJECT:
				return createENUMDPTypTransObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS_OBJECT:
				return createENUMDPTypZBSObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART_OBJECT:
				return createENUMEinzeldateiArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART_OBJECT:
				return createENUMEnergieEingangArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE_OBJECT:
				return createENUMETCSKnotenArtSonstigeObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART_OBJECT:
				return createENUMEVModulArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART_OBJECT:
				return createENUMFTGNTPunktartObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION_OBJECT:
				return createENUMFTHinweisFunktionObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP_OBJECT:
				return createENUMFTZBSTypObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART_OBJECT:
				return createENUMLEUArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR_OBJECT:
				return createENUMMLEVELTRObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM_OBJECT:
				return createENUMNIDSTMObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_POSITION_OBJECT:
				return createENUMPositionObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMSBE_OBJECT:
				return createENUMSBEObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART_OBJECT:
				return createENUMSpannungArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD_OBJECT:
				return createENUMStandortangabeBalisenschildObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMSTZ_OBJECT:
				return createENUMSTZObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART_OBJECT:
				return createENUMVerbotWBArtObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL_OBJECT:
				return createENUMVerwendungAlsRueckfallObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS_OBJECT:
				return createENUMWAnschlussObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION_OBJECT:
				return createENUMZBSReaktionObjectFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE:
				return createESG_Ind_Erlaeuterung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE:
				return createESG_Ind_Parameter_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE:
				return createESG_Ind_Parameterwert_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND_TYPE:
				return createETCS_Gefahrpunktabstand_Abweichend_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE:
				return createETCS_Paketnummer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE:
				return createETCS_Par_Erlaeuterung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE:
				return createETCS_Parametername_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE:
				return createETCS_Parameterwert_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ETCS_SYSTEM_VERSION_TYPE:
				return createETCS_System_Version_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE:
				return createEV_Modul_Typ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE:
				return createFabrikat_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE:
				return createFT_ESG_Subtyp_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE:
				return createFT_ESG_Typ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE:
				return createFT_ETCS_L2_Typ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.FW_TEIL_NUMMER_TYPE:
				return createFW_Teil_Nummer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE:
				return createGruppen_ID_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE:
				return createHinweis_Balisenbefestigung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.INDIVIDUALISIERUNG_WEITERE_TYPE:
				return createIndividualisierung_Weitere_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE:
				return createKm_BTS_1_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE:
				return createKm_BTS_2_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE:
				return createKm_BTS_3_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE:
				return createKonfigurationskennung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE:
				return createL_ACKLEVELTR_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE:
				return createLaenge_1_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE:
				return createLaenge_Ausfuehrungsbereich_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LAENGE_GESTUFTE_VSIGNALISIERUNG_TYPE:
				return createLaenge_Gestufte_V_Signalisierung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LAENGE_SOLL_MIND_150_TYPE:
				return createLaenge_Soll_Mind_150_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LEISTUNGSBEDARF_TYPE:
				return createLeistungsbedarf_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE:
				return createLEU_Ausgang_Nr_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LEU_MODUL_GERAETESTAND_TYPE:
				return createLEU_Modul_Geraetestand_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE:
				return createLEU_Modul_Typ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE:
				return createLEU_Schaltkasten_Typ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE:
				return createLfd_Nr_Am_Bezugspunkt_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE:
				return createLink_Distanz_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.LLA_TYPE:
				return createLLA_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE:
				return createMassgebende_Neig_1_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE:
				return createMassgebende_Neig_Schutzstrecke_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_150_TYPE:
				return createMassgebende_Neigung_Mind_150_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_150_TYPE:
				return createMassgebende_Neigung_Mind_Sig_150_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_TYPE:
				return createMassgebende_Neigung_Mind_Sig_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE:
				return createMax_Leistung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE:
				return createMax_Unterbrechungszeit_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.METALLTEIL_KATEGORIE_TYPE:
				return createMetallteil_Kategorie_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.METALLTEIL_LAENGE_TYPE:
				return createMetallteil_Laenge_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE:
				return createModulnummer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.MONTAGEABWEICHUNG_TYPE:
				return createMontageabweichung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE:
				return createNeigung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE:
				return createNennleistung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NID_BG_TYPE:
				return createNID_BG_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NID_CTYPE:
				return createNID_C_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE:
				return createNID_RBC_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NID_TSR_TYPE:
				return createNID_TSR_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE:
				return createNummer_Schaltkasten_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE:
				return createOberstrombegrenzung_Gueterzug_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE:
				return createOberstrombegrenzung_Reisezug_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE:
				return createPort_Nr_Ausg_Physisch_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE:
				return createPosition_Sonstige_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE:
				return createPrioritaet_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.PROJEKTIERUNGSFALL_TYPE:
				return createProjektierungsfall_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.RBC_ETCS_SYSTEM_VERSION_TYPE:
				return createRBC_ETCS_System_Version_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE:
				return createRBC_SRS_Version_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE:
				return createRekursion_2_Nr_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE:
				return createRekursion_Nr_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE:
				return createRufnummer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE:
				return createSchutzstrecke_Erforderlich_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE:
				return createSchutzstrecke_Vorhanden_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_150_TYPE:
				return createSolllaenge_Mind_Sig_150_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_TYPE:
				return createSolllaenge_Mind_Sig_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE:
				return createSonstige_Standortangabe_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE:
				return createSpannung_Toleranz_Obere_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE:
				return createSpannung_Toleranz_Untere_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE:
				return createSRS_Version_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE:
				return createSystem_Vor_Grenze_Besonders_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE:
				return createTBV_Tunnelbereich_Laenge_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.TELEGRAMM_INDEX_TYPE:
				return createTelegramm_Index_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE:
				return createTelegrammnummer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE:
				return createText_Bedingung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.TEXTMELDUNG_TYPE:
				return createTextmeldung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE:
				return createUeberbrueckung_EV_Unterbrechung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.UEBERWACHUNG_LAENGE_TYPE:
				return createUeberwachung_Laenge_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE:
				return createUntergruppen_ID_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE:
				return createV_Befehl_R_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE:
				return createV_Befehl_Z_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VFREI_TYPE:
				return createV_Frei_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VSTART_TYPE:
				return createV_Start_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VZIEL_TYPE:
				return createV_Ziel_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE:
				return createV_Zul_Strecke_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VBC_KENNUNG_TYPE:
				return createVBC_Kennung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VBC_NID_CTYPE:
				return createVBC_NID_C_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VBC_TIMER_TYPE:
				return createVBC_Timer_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE:
				return createVerbot_Anhalten_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VERKUERZTER_ABSTAND_TYPE:
				return createVerkuerzter_Abstand_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VERWENDUNG_HILFE_TYPE:
				return createVerwendung_Hilfe_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE:
				return createVerwendung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VGR_1TYPE:
				return createVGR_1_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VGR_2TYPE:
				return createVGR_2_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VGR_TYPE:
				return createVGR_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VLA_TYPE:
				return createVLA_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VORSIGNALABSTAND_TYPE:
				return createVorsignalabstand_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.VZ_TYPE:
				return createVZ_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE:
				return createWirkrichtung_In_Datenpunkt_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE:
				return createZBS_La_Bereich_Distanz_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE:
				return createZBS_La_Bereich_Geschwindigkeit_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE:
				return createZBS_La_Bereich_Laenge_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE:
				return createZBS_La_Bereich_Neigung_TypeFromString(eDataType, initialValue);
			case Balisentechnik_ETCSPackage.ZLA_TYPE:
				return createZLA_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG:
				return convertENUMArtBedingungToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE:
				return convertENUMAusstiegETCSSperreToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER:
				return convertENUMBalisenhalterToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDPATO:
				return convertENUMDPATOToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART:
				return convertENUMDPBezugFunktionalArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART:
				return convertENUMDPLinkArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART:
				return convertENUMDPTypArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG:
				return convertENUMDPTypESGToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT:
				return convertENUMDPTypGNTToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS:
				return convertENUMDPTypTransToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS:
				return convertENUMDPTypZBSToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART:
				return convertENUMEinzeldateiArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART:
				return convertENUMEnergieEingangArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE:
				return convertENUMETCSKnotenArtSonstigeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART:
				return convertENUMEVModulArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART:
				return convertENUMFTGNTPunktartToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION:
				return convertENUMFTHinweisFunktionToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP:
				return convertENUMFTZBSTypToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART:
				return convertENUMLEUArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR:
				return convertENUMMLEVELTRToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM:
				return convertENUMNIDSTMToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_POSITION:
				return convertENUMPositionToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMSBE:
				return convertENUMSBEToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART:
				return convertENUMSpannungArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD:
				return convertENUMStandortangabeBalisenschildToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMSTZ:
				return convertENUMSTZToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART:
				return convertENUMVerbotWBArtToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL:
				return convertENUMVerwendungAlsRueckfallToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS:
				return convertENUMWAnschlussToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION:
				return convertENUMZBSReaktionToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_BES_LANGER_EINFAHRWEG_TYPE:
				return convertAbstand_Bes_Langer_Einfahrweg_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EH_EM_FOLGESIGNAL_TYPE:
				return convertAbstand_Datenpunkt_EH_EM_Folgesignal_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_EP_TPI_TYPE:
				return convertAbstand_Datenpunkt_EP_TPI_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL_TYPE:
				return convertAbstand_Datenpunkt_TPI_Folgesignal_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_EINMESSPUNKT_TYPE:
				return convertAbstand_Einmesspunkt_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE:
				return convertAbstand_Grenze_Bereich_C_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE:
				return convertAnlagenteil_Sonstige_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE:
				return convertAnordnung_Im_DP_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE:
				return convertAnwendung_Sonst_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE:
				return convertAnzahl_Voll_LEU_Kalkuliert_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE:
				return convertAnzeigetext_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE:
				return convertAusgang_Nr_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BALISE_GERAETESTAND_TYPE:
				return convertBalise_Geraetestand_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BASELINE_SYSTEM_VERSION_TYPE:
				return convertBaseline_System_Version_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE:
				return convertBedingung_Weichenlage_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE:
				return convertBez_Strecke_BTS_1_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE:
				return convertBez_Strecke_BTS_2_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE:
				return convertBez_Strecke_BTS_3_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE:
				return convertBez_ZUB_Bereichsgrenze_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE:
				return convertBezeichnung_ETCS_Kante_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE:
				return convertBezeichnung_LEU_Anlage_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE:
				return convertBezeichnung_ZUB_SE_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE:
				return convertBezeichnung_ZUB_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE:
				return convertD_LEVELTR_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE:
				return convertDateityp_Binaerdatei_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE:
				return convertDatenpunkt_Beschreibung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE:
				return convertDatenpunkt_Laenge_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE:
				return convertDelta_VGES_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE:
				return convertDelta_VLES_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE:
				return convertDelta_VZES_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE:
				return convertDP_Typ_ETCS_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE:
				return convertDP_Typ_Sonst_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE:
				return convertDP_Typ_V_La_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE:
				return convertDWeg_Intervall_200_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE:
				return convertDWeg_Intervall_50_200_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE:
				return convertDWeg_Intervall_50_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_ART_BEDINGUNG_OBJECT:
				return convertENUMArtBedingungObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_AUSSTIEG_ETCS_SPERRE_OBJECT:
				return convertENUMAusstiegETCSSperreObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_BALISENHALTER_OBJECT:
				return convertENUMBalisenhalterObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDPATO_OBJECT:
				return convertENUMDPATOObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_BEZUG_FUNKTIONAL_ART_OBJECT:
				return convertENUMDPBezugFunktionalArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_LINK_ART_OBJECT:
				return convertENUMDPLinkArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ART_OBJECT:
				return convertENUMDPTypArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ESG_OBJECT:
				return convertENUMDPTypESGObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_GNT_OBJECT:
				return convertENUMDPTypGNTObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_TRANS_OBJECT:
				return convertENUMDPTypTransObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMDP_TYP_ZBS_OBJECT:
				return convertENUMDPTypZBSObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_EINZELDATEI_ART_OBJECT:
				return convertENUMEinzeldateiArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_ENERGIE_EINGANG_ART_OBJECT:
				return convertENUMEnergieEingangArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMETCS_KNOTEN_ART_SONSTIGE_OBJECT:
				return convertENUMETCSKnotenArtSonstigeObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMEV_MODUL_ART_OBJECT:
				return convertENUMEVModulArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFTGNT_PUNKTART_OBJECT:
				return convertENUMFTGNTPunktartObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFT_HINWEIS_FUNKTION_OBJECT:
				return convertENUMFTHinweisFunktionObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMFTZBS_TYP_OBJECT:
				return convertENUMFTZBSTypObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMLEU_ART_OBJECT:
				return convertENUMLEUArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMMLEVELTR_OBJECT:
				return convertENUMMLEVELTRObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMNIDSTM_OBJECT:
				return convertENUMNIDSTMObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_POSITION_OBJECT:
				return convertENUMPositionObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMSBE_OBJECT:
				return convertENUMSBEObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_SPANNUNG_ART_OBJECT:
				return convertENUMSpannungArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_STANDORTANGABE_BALISENSCHILD_OBJECT:
				return convertENUMStandortangabeBalisenschildObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMSTZ_OBJECT:
				return convertENUMSTZObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_VERBOT_WB_ART_OBJECT:
				return convertENUMVerbotWBArtObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUM_VERWENDUNG_ALS_RUECKFALL_OBJECT:
				return convertENUMVerwendungAlsRueckfallObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMW_ANSCHLUSS_OBJECT:
				return convertENUMWAnschlussObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ENUMZBS_REAKTION_OBJECT:
				return convertENUMZBSReaktionObjectToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE:
				return convertESG_Ind_Erlaeuterung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE:
				return convertESG_Ind_Parameter_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE:
				return convertESG_Ind_Parameterwert_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND_TYPE:
				return convertETCS_Gefahrpunktabstand_Abweichend_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE:
				return convertETCS_Paketnummer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE:
				return convertETCS_Par_Erlaeuterung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE:
				return convertETCS_Parametername_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE:
				return convertETCS_Parameterwert_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ETCS_SYSTEM_VERSION_TYPE:
				return convertETCS_System_Version_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE:
				return convertEV_Modul_Typ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE:
				return convertFabrikat_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE:
				return convertFT_ESG_Subtyp_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE:
				return convertFT_ESG_Typ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE:
				return convertFT_ETCS_L2_Typ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.FW_TEIL_NUMMER_TYPE:
				return convertFW_Teil_Nummer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE:
				return convertGruppen_ID_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE:
				return convertHinweis_Balisenbefestigung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.INDIVIDUALISIERUNG_WEITERE_TYPE:
				return convertIndividualisierung_Weitere_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE:
				return convertKm_BTS_1_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE:
				return convertKm_BTS_2_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE:
				return convertKm_BTS_3_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE:
				return convertKonfigurationskennung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE:
				return convertL_ACKLEVELTR_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE:
				return convertLaenge_1_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE:
				return convertLaenge_Ausfuehrungsbereich_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LAENGE_GESTUFTE_VSIGNALISIERUNG_TYPE:
				return convertLaenge_Gestufte_V_Signalisierung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LAENGE_SOLL_MIND_150_TYPE:
				return convertLaenge_Soll_Mind_150_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LEISTUNGSBEDARF_TYPE:
				return convertLeistungsbedarf_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE:
				return convertLEU_Ausgang_Nr_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LEU_MODUL_GERAETESTAND_TYPE:
				return convertLEU_Modul_Geraetestand_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE:
				return convertLEU_Modul_Typ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE:
				return convertLEU_Schaltkasten_Typ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE:
				return convertLfd_Nr_Am_Bezugspunkt_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE:
				return convertLink_Distanz_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.LLA_TYPE:
				return convertLLA_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE:
				return convertMassgebende_Neig_1_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE:
				return convertMassgebende_Neig_Schutzstrecke_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_150_TYPE:
				return convertMassgebende_Neigung_Mind_150_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_150_TYPE:
				return convertMassgebende_Neigung_Mind_Sig_150_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIGUNG_MIND_SIG_TYPE:
				return convertMassgebende_Neigung_Mind_Sig_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE:
				return convertMax_Leistung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE:
				return convertMax_Unterbrechungszeit_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.METALLTEIL_KATEGORIE_TYPE:
				return convertMetallteil_Kategorie_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.METALLTEIL_LAENGE_TYPE:
				return convertMetallteil_Laenge_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE:
				return convertModulnummer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.MONTAGEABWEICHUNG_TYPE:
				return convertMontageabweichung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE:
				return convertNeigung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE:
				return convertNennleistung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NID_BG_TYPE:
				return convertNID_BG_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NID_CTYPE:
				return convertNID_C_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE:
				return convertNID_RBC_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NID_TSR_TYPE:
				return convertNID_TSR_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE:
				return convertNummer_Schaltkasten_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE:
				return convertOberstrombegrenzung_Gueterzug_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE:
				return convertOberstrombegrenzung_Reisezug_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE:
				return convertPort_Nr_Ausg_Physisch_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE:
				return convertPosition_Sonstige_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE:
				return convertPrioritaet_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.PROJEKTIERUNGSFALL_TYPE:
				return convertProjektierungsfall_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.RBC_ETCS_SYSTEM_VERSION_TYPE:
				return convertRBC_ETCS_System_Version_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE:
				return convertRBC_SRS_Version_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE:
				return convertRekursion_2_Nr_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE:
				return convertRekursion_Nr_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE:
				return convertRufnummer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE:
				return convertSchutzstrecke_Erforderlich_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE:
				return convertSchutzstrecke_Vorhanden_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_150_TYPE:
				return convertSolllaenge_Mind_Sig_150_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SOLLLAENGE_MIND_SIG_TYPE:
				return convertSolllaenge_Mind_Sig_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE:
				return convertSonstige_Standortangabe_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE:
				return convertSpannung_Toleranz_Obere_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE:
				return convertSpannung_Toleranz_Untere_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE:
				return convertSRS_Version_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE:
				return convertSystem_Vor_Grenze_Besonders_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE:
				return convertTBV_Tunnelbereich_Laenge_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.TELEGRAMM_INDEX_TYPE:
				return convertTelegramm_Index_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE:
				return convertTelegrammnummer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE:
				return convertText_Bedingung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.TEXTMELDUNG_TYPE:
				return convertTextmeldung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE:
				return convertUeberbrueckung_EV_Unterbrechung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.UEBERWACHUNG_LAENGE_TYPE:
				return convertUeberwachung_Laenge_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE:
				return convertUntergruppen_ID_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE:
				return convertV_Befehl_R_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE:
				return convertV_Befehl_Z_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VFREI_TYPE:
				return convertV_Frei_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VSTART_TYPE:
				return convertV_Start_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VZIEL_TYPE:
				return convertV_Ziel_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE:
				return convertV_Zul_Strecke_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VBC_KENNUNG_TYPE:
				return convertVBC_Kennung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VBC_NID_CTYPE:
				return convertVBC_NID_C_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VBC_TIMER_TYPE:
				return convertVBC_Timer_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE:
				return convertVerbot_Anhalten_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VERKUERZTER_ABSTAND_TYPE:
				return convertVerkuerzter_Abstand_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VERWENDUNG_HILFE_TYPE:
				return convertVerwendung_Hilfe_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE:
				return convertVerwendung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VGR_1TYPE:
				return convertVGR_1_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VGR_2TYPE:
				return convertVGR_2_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VGR_TYPE:
				return convertVGR_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VLA_TYPE:
				return convertVLA_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VORSIGNALABSTAND_TYPE:
				return convertVorsignalabstand_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.VZ_TYPE:
				return convertVZ_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE:
				return convertWirkrichtung_In_Datenpunkt_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE:
				return convertZBS_La_Bereich_Distanz_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE:
				return convertZBS_La_Bereich_Geschwindigkeit_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE:
				return convertZBS_La_Bereich_Laenge_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE:
				return convertZBS_La_Bereich_Neigung_TypeToString(eDataType, instanceValue);
			case Balisentechnik_ETCSPackage.ZLA_TYPE:
				return convertZLA_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Bes_Langer_Einfahrweg_TypeClass createAbstand_Bes_Langer_Einfahrweg_TypeClass() {
		Abstand_Bes_Langer_Einfahrweg_TypeClassImpl abstand_Bes_Langer_Einfahrweg_TypeClass = new Abstand_Bes_Langer_Einfahrweg_TypeClassImpl();
		return abstand_Bes_Langer_Einfahrweg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass() {
		Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClassImpl abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass = new Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClassImpl();
		return abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EP_TPI_TypeClass createAbstand_Datenpunkt_EP_TPI_TypeClass() {
		Abstand_Datenpunkt_EP_TPI_TypeClassImpl abstand_Datenpunkt_EP_TPI_TypeClass = new Abstand_Datenpunkt_EP_TPI_TypeClassImpl();
		return abstand_Datenpunkt_EP_TPI_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_TPI_Folgesignal_TypeClass createAbstand_Datenpunkt_TPI_Folgesignal_TypeClass() {
		Abstand_Datenpunkt_TPI_Folgesignal_TypeClassImpl abstand_Datenpunkt_TPI_Folgesignal_TypeClass = new Abstand_Datenpunkt_TPI_Folgesignal_TypeClassImpl();
		return abstand_Datenpunkt_TPI_Folgesignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Einmesspunkt_TypeClass createAbstand_Einmesspunkt_TypeClass() {
		Abstand_Einmesspunkt_TypeClassImpl abstand_Einmesspunkt_TypeClass = new Abstand_Einmesspunkt_TypeClassImpl();
		return abstand_Einmesspunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Grenze_Bereich_C_TypeClass createAbstand_Grenze_Bereich_C_TypeClass() {
		Abstand_Grenze_Bereich_C_TypeClassImpl abstand_Grenze_Bereich_C_TypeClass = new Abstand_Grenze_Bereich_C_TypeClassImpl();
		return abstand_Grenze_Bereich_C_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Reduziert_TypeClass createAbstand_Reduziert_TypeClass() {
		Abstand_Reduziert_TypeClassImpl abstand_Reduziert_TypeClass = new Abstand_Reduziert_TypeClassImpl();
		return abstand_Reduziert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anlagenteil_Sonstige_TypeClass createAnlagenteil_Sonstige_TypeClass() {
		Anlagenteil_Sonstige_TypeClassImpl anlagenteil_Sonstige_TypeClass = new Anlagenteil_Sonstige_TypeClassImpl();
		return anlagenteil_Sonstige_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anordnung_Im_DP_TypeClass createAnordnung_Im_DP_TypeClass() {
		Anordnung_Im_DP_TypeClassImpl anordnung_Im_DP_TypeClass = new Anordnung_Im_DP_TypeClassImpl();
		return anordnung_Im_DP_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendung_ESG_TypeClass createAnwendung_ESG_TypeClass() {
		Anwendung_ESG_TypeClassImpl anwendung_ESG_TypeClass = new Anwendung_ESG_TypeClassImpl();
		return anwendung_ESG_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendung_GNT_TypeClass createAnwendung_GNT_TypeClass() {
		Anwendung_GNT_TypeClassImpl anwendung_GNT_TypeClass = new Anwendung_GNT_TypeClassImpl();
		return anwendung_GNT_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendung_Sonst_TypeClass createAnwendung_Sonst_TypeClass() {
		Anwendung_Sonst_TypeClassImpl anwendung_Sonst_TypeClass = new Anwendung_Sonst_TypeClassImpl();
		return anwendung_Sonst_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendungssystem_TypeClass createAnwendungssystem_TypeClass() {
		Anwendungssystem_TypeClassImpl anwendungssystem_TypeClass = new Anwendungssystem_TypeClassImpl();
		return anwendungssystem_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Voll_LEU_Kalkuliert_TypeClass createAnzahl_Voll_LEU_Kalkuliert_TypeClass() {
		Anzahl_Voll_LEU_Kalkuliert_TypeClassImpl anzahl_Voll_LEU_Kalkuliert_TypeClass = new Anzahl_Voll_LEU_Kalkuliert_TypeClassImpl();
		return anzahl_Voll_LEU_Kalkuliert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzeigetext_TypeClass createAnzeigetext_TypeClass() {
		Anzeigetext_TypeClassImpl anzeigetext_TypeClass = new Anzeigetext_TypeClassImpl();
		return anzeigetext_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Art_Bedingung_TypeClass createArt_Bedingung_TypeClass() {
		Art_Bedingung_TypeClassImpl art_Bedingung_TypeClass = new Art_Bedingung_TypeClassImpl();
		return art_Bedingung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausgang_Nr_TypeClass createAusgang_Nr_TypeClass() {
		Ausgang_Nr_TypeClassImpl ausgang_Nr_TypeClass = new Ausgang_Nr_TypeClassImpl();
		return ausgang_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausrichtung_TypeClass createAusrichtung_TypeClass() {
		Ausrichtung_TypeClassImpl ausrichtung_TypeClass = new Ausrichtung_TypeClassImpl();
		return ausrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausstieg_ETCS_Sperre_TypeClass createAusstieg_ETCS_Sperre_TypeClass() {
		Ausstieg_ETCS_Sperre_TypeClassImpl ausstieg_ETCS_Sperre_TypeClass = new Ausstieg_ETCS_Sperre_TypeClassImpl();
		return ausstieg_ETCS_Sperre_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise createBalise() {
		BaliseImpl balise = new BaliseImpl();
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise_Allg_AttributeGroup createBalise_Allg_AttributeGroup() {
		Balise_Allg_AttributeGroupImpl balise_Allg_AttributeGroup = new Balise_Allg_AttributeGroupImpl();
		return balise_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise_Geraetestand_TypeClass createBalise_Geraetestand_TypeClass() {
		Balise_Geraetestand_TypeClassImpl balise_Geraetestand_TypeClass = new Balise_Geraetestand_TypeClassImpl();
		return balise_Geraetestand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balisenhalter_TypeClass createBalisenhalter_TypeClass() {
		Balisenhalter_TypeClassImpl balisenhalter_TypeClass = new Balisenhalter_TypeClassImpl();
		return balisenhalter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baseline_System_Version_TypeClass createBaseline_System_Version_TypeClass() {
		Baseline_System_Version_TypeClassImpl baseline_System_Version_TypeClass = new Baseline_System_Version_TypeClassImpl();
		return baseline_System_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Besondere_AttributeGroup createBedingung_Besondere_AttributeGroup() {
		Bedingung_Besondere_AttributeGroupImpl bedingung_Besondere_AttributeGroup = new Bedingung_Besondere_AttributeGroupImpl();
		return bedingung_Besondere_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_PZB_AttributeGroup createBedingung_PZB_AttributeGroup() {
		Bedingung_PZB_AttributeGroupImpl bedingung_PZB_AttributeGroup = new Bedingung_PZB_AttributeGroupImpl();
		return bedingung_PZB_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Signal_AttributeGroup createBedingung_Signal_AttributeGroup() {
		Bedingung_Signal_AttributeGroupImpl bedingung_Signal_AttributeGroup = new Bedingung_Signal_AttributeGroupImpl();
		return bedingung_Signal_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Sonstige_AttributeGroup createBedingung_Sonstige_AttributeGroup() {
		Bedingung_Sonstige_AttributeGroupImpl bedingung_Sonstige_AttributeGroup = new Bedingung_Sonstige_AttributeGroupImpl();
		return bedingung_Sonstige_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Weiche_AttributeGroup createBedingung_Weiche_AttributeGroup() {
		Bedingung_Weiche_AttributeGroupImpl bedingung_Weiche_AttributeGroup = new Bedingung_Weiche_AttributeGroupImpl();
		return bedingung_Weiche_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Weichenlage_TypeClass createBedingung_Weichenlage_TypeClass() {
		Bedingung_Weichenlage_TypeClassImpl bedingung_Weichenlage_TypeClass = new Bedingung_Weichenlage_TypeClassImpl();
		return bedingung_Weichenlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_1_TypeClass createBez_Strecke_BTS_1_TypeClass() {
		Bez_Strecke_BTS_1_TypeClassImpl bez_Strecke_BTS_1_TypeClass = new Bez_Strecke_BTS_1_TypeClassImpl();
		return bez_Strecke_BTS_1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_2_TypeClass createBez_Strecke_BTS_2_TypeClass() {
		Bez_Strecke_BTS_2_TypeClassImpl bez_Strecke_BTS_2_TypeClass = new Bez_Strecke_BTS_2_TypeClassImpl();
		return bez_Strecke_BTS_2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_3_TypeClass createBez_Strecke_BTS_3_TypeClass() {
		Bez_Strecke_BTS_3_TypeClassImpl bez_Strecke_BTS_3_TypeClass = new Bez_Strecke_BTS_3_TypeClassImpl();
		return bez_Strecke_BTS_3_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_ZUB_Bereichsgrenze_TypeClass createBez_ZUB_Bereichsgrenze_TypeClass() {
		Bez_ZUB_Bereichsgrenze_TypeClassImpl bez_ZUB_Bereichsgrenze_TypeClass = new Bez_ZUB_Bereichsgrenze_TypeClassImpl();
		return bez_ZUB_Bereichsgrenze_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ETCS_Kante_TypeClass createBezeichnung_ETCS_Kante_TypeClass() {
		Bezeichnung_ETCS_Kante_TypeClassImpl bezeichnung_ETCS_Kante_TypeClass = new Bezeichnung_ETCS_Kante_TypeClassImpl();
		return bezeichnung_ETCS_Kante_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_LEU_Anlage_TypeClass createBezeichnung_LEU_Anlage_TypeClass() {
		Bezeichnung_LEU_Anlage_TypeClassImpl bezeichnung_LEU_Anlage_TypeClass = new Bezeichnung_LEU_Anlage_TypeClassImpl();
		return bezeichnung_LEU_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ZUB_SE_TypeClass createBezeichnung_ZUB_SE_TypeClass() {
		Bezeichnung_ZUB_SE_TypeClassImpl bezeichnung_ZUB_SE_TypeClass = new Bezeichnung_ZUB_SE_TypeClassImpl();
		return bezeichnung_ZUB_SE_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ZUB_TypeClass createBezeichnung_ZUB_TypeClass() {
		Bezeichnung_ZUB_TypeClassImpl bezeichnung_ZUB_TypeClass = new Bezeichnung_ZUB_TypeClassImpl();
		return bezeichnung_ZUB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup createBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup() {
		Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupImpl bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup = new Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupImpl();
		return bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup createBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup() {
		Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupImpl bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup = new Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupImpl();
		return bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup createBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup() {
		Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupImpl bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup = new Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupImpl();
		return bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup createBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup() {
		Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup = new Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl();
		return bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup createBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup() {
		Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup = new Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl();
		return bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup createBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup() {
		Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroupImpl bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup = new Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroupImpl();
		return bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup createBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup() {
		Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup = new Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl();
		return bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdaten createBinaerdaten() {
		BinaerdatenImpl binaerdaten = new BinaerdatenImpl();
		return binaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdaten_Datei_AttributeGroup createBinaerdaten_Datei_AttributeGroup() {
		Binaerdaten_Datei_AttributeGroupImpl binaerdaten_Datei_AttributeGroup = new Binaerdaten_Datei_AttributeGroupImpl();
		return binaerdaten_Datei_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public D_LEVELTR_TypeClass createD_LEVELTR_TypeClass() {
		D_LEVELTR_TypeClassImpl d_LEVELTR_TypeClass = new D_LEVELTR_TypeClassImpl();
		return d_LEVELTR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateiname_TypeClass createDateiname_TypeClass() {
		Dateiname_TypeClassImpl dateiname_TypeClass = new Dateiname_TypeClassImpl();
		return dateiname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateityp_Binaerdatei_TypeClass createDateityp_Binaerdatei_TypeClass() {
		Dateityp_Binaerdatei_TypeClassImpl dateityp_Binaerdatei_TypeClass = new Dateityp_Binaerdatei_TypeClassImpl();
		return dateityp_Binaerdatei_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Daten_TypeClass createDaten_TypeClass() {
		Daten_TypeClassImpl daten_TypeClass = new Daten_TypeClassImpl();
		return daten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt createDatenpunkt() {
		DatenpunktImpl datenpunkt = new DatenpunktImpl();
		return datenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Allg_AttributeGroup createDatenpunkt_Allg_AttributeGroup() {
		Datenpunkt_Allg_AttributeGroupImpl datenpunkt_Allg_AttributeGroup = new Datenpunkt_Allg_AttributeGroupImpl();
		return datenpunkt_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Beschreibung_TypeClass createDatenpunkt_Beschreibung_TypeClass() {
		Datenpunkt_Beschreibung_TypeClassImpl datenpunkt_Beschreibung_TypeClass = new Datenpunkt_Beschreibung_TypeClassImpl();
		return datenpunkt_Beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Einmesspunkt_AttributeGroup createDatenpunkt_Einmesspunkt_AttributeGroup() {
		Datenpunkt_Einmesspunkt_AttributeGroupImpl datenpunkt_Einmesspunkt_AttributeGroup = new Datenpunkt_Einmesspunkt_AttributeGroupImpl();
		return datenpunkt_Einmesspunkt_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Laenge_TypeClass createDatenpunkt_Laenge_TypeClass() {
		Datenpunkt_Laenge_TypeClassImpl datenpunkt_Laenge_TypeClass = new Datenpunkt_Laenge_TypeClassImpl();
		return datenpunkt_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Link createDatenpunkt_Link() {
		Datenpunkt_LinkImpl datenpunkt_Link = new Datenpunkt_LinkImpl();
		return datenpunkt_Link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VGES_TypeClass createDelta_VGES_TypeClass() {
		Delta_VGES_TypeClassImpl delta_VGES_TypeClass = new Delta_VGES_TypeClassImpl();
		return delta_VGES_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VLES_TypeClass createDelta_VLES_TypeClass() {
		Delta_VLES_TypeClassImpl delta_VLES_TypeClass = new Delta_VLES_TypeClassImpl();
		return delta_VLES_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VZES_TypeClass createDelta_VZES_TypeClass() {
		Delta_VZES_TypeClassImpl delta_VZES_TypeClass = new Delta_VZES_TypeClassImpl();
		return delta_VZES_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_ATO_TypeClass createDP_ATO_TypeClass() {
		DP_ATO_TypeClassImpl dP_ATO_TypeClass = new DP_ATO_TypeClassImpl();
		return dP_ATO_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Funktional_Art_TypeClass createDP_Bezug_Funktional_Art_TypeClass() {
		DP_Bezug_Funktional_Art_TypeClassImpl dP_Bezug_Funktional_Art_TypeClass = new DP_Bezug_Funktional_Art_TypeClassImpl();
		return dP_Bezug_Funktional_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Funktional_AttributeGroup createDP_Bezug_Funktional_AttributeGroup() {
		DP_Bezug_Funktional_AttributeGroupImpl dP_Bezug_Funktional_AttributeGroup = new DP_Bezug_Funktional_AttributeGroupImpl();
		return dP_Bezug_Funktional_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_ETCS_Adresse_AttributeGroup createDP_ETCS_Adresse_AttributeGroup() {
		DP_ETCS_Adresse_AttributeGroupImpl dP_ETCS_Adresse_AttributeGroup = new DP_ETCS_Adresse_AttributeGroupImpl();
		return dP_ETCS_Adresse_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Link_Art_TypeClass createDP_Link_Art_TypeClass() {
		DP_Link_Art_TypeClassImpl dP_Link_Art_TypeClass = new DP_Link_Art_TypeClassImpl();
		return dP_Link_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Telegramm_AttributeGroup createDP_Telegramm_AttributeGroup() {
		DP_Telegramm_AttributeGroupImpl dP_Telegramm_AttributeGroup = new DP_Telegramm_AttributeGroupImpl();
		return dP_Telegramm_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Telegramm_ESG_AttributeGroup createDP_Telegramm_ESG_AttributeGroup() {
		DP_Telegramm_ESG_AttributeGroupImpl dP_Telegramm_ESG_AttributeGroup = new DP_Telegramm_ESG_AttributeGroupImpl();
		return dP_Telegramm_ESG_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Art_TypeClass createDP_Typ_Art_TypeClass() {
		DP_Typ_Art_TypeClassImpl dP_Typ_Art_TypeClass = new DP_Typ_Art_TypeClassImpl();
		return dP_Typ_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_AttributeGroup createDP_Typ_AttributeGroup() {
		DP_Typ_AttributeGroupImpl dP_Typ_AttributeGroup = new DP_Typ_AttributeGroupImpl();
		return dP_Typ_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ESG_TypeClass createDP_Typ_ESG_TypeClass() {
		DP_Typ_ESG_TypeClassImpl dP_Typ_ESG_TypeClass = new DP_Typ_ESG_TypeClassImpl();
		return dP_Typ_ESG_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ETCS_TypeClass createDP_Typ_ETCS_TypeClass() {
		DP_Typ_ETCS_TypeClassImpl dP_Typ_ETCS_TypeClass = new DP_Typ_ETCS_TypeClassImpl();
		return dP_Typ_ETCS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GESG_AttributeGroup createDP_Typ_GESG_AttributeGroup() {
		DP_Typ_GESG_AttributeGroupImpl dP_Typ_GESG_AttributeGroup = new DP_Typ_GESG_AttributeGroupImpl();
		return dP_Typ_GESG_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GETCS_AttributeGroup createDP_Typ_GETCS_AttributeGroup() {
		DP_Typ_GETCS_AttributeGroupImpl dP_Typ_GETCS_AttributeGroup = new DP_Typ_GETCS_AttributeGroupImpl();
		return dP_Typ_GETCS_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GGNT_AttributeGroup createDP_Typ_GGNT_AttributeGroup() {
		DP_Typ_GGNT_AttributeGroupImpl dP_Typ_GGNT_AttributeGroup = new DP_Typ_GGNT_AttributeGroupImpl();
		return dP_Typ_GGNT_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GNT_TypeClass createDP_Typ_GNT_TypeClass() {
		DP_Typ_GNT_TypeClassImpl dP_Typ_GNT_TypeClass = new DP_Typ_GNT_TypeClassImpl();
		return dP_Typ_GNT_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GSonst_AttributeGroup createDP_Typ_GSonst_AttributeGroup() {
		DP_Typ_GSonst_AttributeGroupImpl dP_Typ_GSonst_AttributeGroup = new DP_Typ_GSonst_AttributeGroupImpl();
		return dP_Typ_GSonst_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GTrans_AttributeGroup createDP_Typ_GTrans_AttributeGroup() {
		DP_Typ_GTrans_AttributeGroupImpl dP_Typ_GTrans_AttributeGroup = new DP_Typ_GTrans_AttributeGroupImpl();
		return dP_Typ_GTrans_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GZBS_AttributeGroup createDP_Typ_GZBS_AttributeGroup() {
		DP_Typ_GZBS_AttributeGroupImpl dP_Typ_GZBS_AttributeGroup = new DP_Typ_GZBS_AttributeGroupImpl();
		return dP_Typ_GZBS_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Sonst_TypeClass createDP_Typ_Sonst_TypeClass() {
		DP_Typ_Sonst_TypeClassImpl dP_Typ_Sonst_TypeClass = new DP_Typ_Sonst_TypeClassImpl();
		return dP_Typ_Sonst_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Trans_TypeClass createDP_Typ_Trans_TypeClass() {
		DP_Typ_Trans_TypeClassImpl dP_Typ_Trans_TypeClass = new DP_Typ_Trans_TypeClassImpl();
		return dP_Typ_Trans_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_V_La_TypeClass createDP_Typ_V_La_TypeClass() {
		DP_Typ_V_La_TypeClassImpl dP_Typ_V_La_TypeClass = new DP_Typ_V_La_TypeClassImpl();
		return dP_Typ_V_La_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ZBS_TypeClass createDP_Typ_ZBS_TypeClass() {
		DP_Typ_ZBS_TypeClassImpl dP_Typ_ZBS_TypeClass = new DP_Typ_ZBS_TypeClassImpl();
		return dP_Typ_ZBS_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Verlinkt_TypeClass createDP_Verlinkt_TypeClass() {
		DP_Verlinkt_TypeClassImpl dP_Verlinkt_TypeClass = new DP_Verlinkt_TypeClassImpl();
		return dP_Verlinkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dunkelschaltanstoss_TypeClass createDunkelschaltanstoss_TypeClass() {
		Dunkelschaltanstoss_TypeClassImpl dunkelschaltanstoss_TypeClass = new Dunkelschaltanstoss_TypeClassImpl();
		return dunkelschaltanstoss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_200_TypeClass createDWeg_Intervall_200_TypeClass() {
		DWeg_Intervall_200_TypeClassImpl dWeg_Intervall_200_TypeClass = new DWeg_Intervall_200_TypeClassImpl();
		return dWeg_Intervall_200_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_50_200_TypeClass createDWeg_Intervall_50_200_TypeClass() {
		DWeg_Intervall_50_200_TypeClassImpl dWeg_Intervall_50_200_TypeClass = new DWeg_Intervall_50_200_TypeClassImpl();
		return dWeg_Intervall_50_200_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_50_TypeClass createDWeg_Intervall_50_TypeClass() {
		DWeg_Intervall_50_TypeClassImpl dWeg_Intervall_50_TypeClass = new DWeg_Intervall_50_TypeClassImpl();
		return dWeg_Intervall_50_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eingang_Gepuffert_TypeClass createEingang_Gepuffert_TypeClass() {
		Eingang_Gepuffert_TypeClassImpl eingang_Gepuffert_TypeClass = new Eingang_Gepuffert_TypeClassImpl();
		return eingang_Gepuffert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstieg_Erlaubt_TypeClass createEinstieg_Erlaubt_TypeClass() {
		Einstieg_Erlaubt_TypeClassImpl einstieg_Erlaubt_TypeClass = new Einstieg_Erlaubt_TypeClassImpl();
		return einstieg_Erlaubt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstieg_Ohne_Rueckw_Sig_TypeClass createEinstieg_Ohne_Rueckw_Sig_TypeClass() {
		Einstieg_Ohne_Rueckw_Sig_TypeClassImpl einstieg_Ohne_Rueckw_Sig_TypeClass = new Einstieg_Ohne_Rueckw_Sig_TypeClassImpl();
		return einstieg_Ohne_Rueckw_Sig_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einzeldatei_Art_TypeClass createEinzeldatei_Art_TypeClass() {
		Einzeldatei_Art_TypeClassImpl einzeldatei_Art_TypeClass = new Einzeldatei_Art_TypeClassImpl();
		return einzeldatei_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energie_Eingang_Art_TypeClass createEnergie_Eingang_Art_TypeClass() {
		Energie_Eingang_Art_TypeClassImpl energie_Eingang_Art_TypeClass = new Energie_Eingang_Art_TypeClassImpl();
		return energie_Eingang_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Erlaeuterung_TypeClass createESG_Ind_Erlaeuterung_TypeClass() {
		ESG_Ind_Erlaeuterung_TypeClassImpl esG_Ind_Erlaeuterung_TypeClass = new ESG_Ind_Erlaeuterung_TypeClassImpl();
		return esG_Ind_Erlaeuterung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Parameter_TypeClass createESG_Ind_Parameter_TypeClass() {
		ESG_Ind_Parameter_TypeClassImpl esG_Ind_Parameter_TypeClass = new ESG_Ind_Parameter_TypeClassImpl();
		return esG_Ind_Parameter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Parameterwert_TypeClass createESG_Ind_Parameterwert_TypeClass() {
		ESG_Ind_Parameterwert_TypeClassImpl esG_Ind_Parameterwert_TypeClass = new ESG_Ind_Parameterwert_TypeClassImpl();
		return esG_Ind_Parameterwert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Individuelle_Merkmale_AttributeGroup createESG_Individuelle_Merkmale_AttributeGroup() {
		ESG_Individuelle_Merkmale_AttributeGroupImpl esG_Individuelle_Merkmale_AttributeGroup = new ESG_Individuelle_Merkmale_AttributeGroupImpl();
		return esG_Individuelle_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Spezifische_Merkmale_AttributeGroup createESG_Spezifische_Merkmale_AttributeGroup() {
		ESG_Spezifische_Merkmale_AttributeGroupImpl esG_Spezifische_Merkmale_AttributeGroup = new ESG_Spezifische_Merkmale_AttributeGroupImpl();
		return esG_Spezifische_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Adresse_AttributeGroup createETCS_Adresse_AttributeGroup() {
		ETCS_Adresse_AttributeGroupImpl etcS_Adresse_AttributeGroup = new ETCS_Adresse_AttributeGroupImpl();
		return etcS_Adresse_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Gefahrpunktabstand_Abweichend_TypeClass createETCS_Gefahrpunktabstand_Abweichend_TypeClass() {
		ETCS_Gefahrpunktabstand_Abweichend_TypeClassImpl etcS_Gefahrpunktabstand_Abweichend_TypeClass = new ETCS_Gefahrpunktabstand_Abweichend_TypeClassImpl();
		return etcS_Gefahrpunktabstand_Abweichend_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Kante createETCS_Kante() {
		ETCS_KanteImpl etcS_Kante = new ETCS_KanteImpl();
		return etcS_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Kante_Bezeichnung_AttributeGroup createETCS_Kante_Bezeichnung_AttributeGroup() {
		ETCS_Kante_Bezeichnung_AttributeGroupImpl etcS_Kante_Bezeichnung_AttributeGroup = new ETCS_Kante_Bezeichnung_AttributeGroupImpl();
		return etcS_Kante_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten createETCS_Knoten() {
		ETCS_KnotenImpl etcS_Knoten = new ETCS_KnotenImpl();
		return etcS_Knoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten_Art_Sonstige_TypeClass createETCS_Knoten_Art_Sonstige_TypeClass() {
		ETCS_Knoten_Art_Sonstige_TypeClassImpl etcS_Knoten_Art_Sonstige_TypeClass = new ETCS_Knoten_Art_Sonstige_TypeClassImpl();
		return etcS_Knoten_Art_Sonstige_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Paketnummer_TypeClass createETCS_Paketnummer_TypeClass() {
		ETCS_Paketnummer_TypeClassImpl etcS_Paketnummer_TypeClass = new ETCS_Paketnummer_TypeClassImpl();
		return etcS_Paketnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Par_Erlaeuterung_TypeClass createETCS_Par_Erlaeuterung_TypeClass() {
		ETCS_Par_Erlaeuterung_TypeClassImpl etcS_Par_Erlaeuterung_TypeClass = new ETCS_Par_Erlaeuterung_TypeClassImpl();
		return etcS_Par_Erlaeuterung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Parametername_TypeClass createETCS_Parametername_TypeClass() {
		ETCS_Parametername_TypeClassImpl etcS_Parametername_TypeClass = new ETCS_Parametername_TypeClassImpl();
		return etcS_Parametername_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Parameterwert_TypeClass createETCS_Parameterwert_TypeClass() {
		ETCS_Parameterwert_TypeClassImpl etcS_Parameterwert_TypeClass = new ETCS_Parameterwert_TypeClassImpl();
		return etcS_Parameterwert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Richtungsanzeige createETCS_Richtungsanzeige() {
		ETCS_RichtungsanzeigeImpl etcS_Richtungsanzeige = new ETCS_RichtungsanzeigeImpl();
		return etcS_Richtungsanzeige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal createETCS_Signal() {
		ETCS_SignalImpl etcS_Signal = new ETCS_SignalImpl();
		return etcS_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_Allg_AttributeGroup createETCS_Signal_Allg_AttributeGroup() {
		ETCS_Signal_Allg_AttributeGroupImpl etcS_Signal_Allg_AttributeGroup = new ETCS_Signal_Allg_AttributeGroupImpl();
		return etcS_Signal_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_DWeg_AttributeGroup createETCS_Signal_DWeg_AttributeGroup() {
		ETCS_Signal_DWeg_AttributeGroupImpl etcS_Signal_DWeg_AttributeGroup = new ETCS_Signal_DWeg_AttributeGroupImpl();
		return etcS_Signal_DWeg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_TBV_AttributeGroup createETCS_Signal_TBV_AttributeGroup() {
		ETCS_Signal_TBV_AttributeGroupImpl etcS_Signal_TBV_AttributeGroup = new ETCS_Signal_TBV_AttributeGroupImpl();
		return etcS_Signal_TBV_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_System_Version_TypeClass createETCS_System_Version_TypeClass() {
		ETCS_System_Version_TypeClassImpl etcS_System_Version_TypeClass = new ETCS_System_Version_TypeClassImpl();
		return etcS_System_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_W_Kr createETCS_W_Kr() {
		ETCS_W_KrImpl etcS_W_Kr = new ETCS_W_KrImpl();
		return etcS_W_Kr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_W_Kr_MUKA_AttributeGroup createETCS_W_Kr_MUKA_AttributeGroup() {
		ETCS_W_Kr_MUKA_AttributeGroupImpl etcS_W_Kr_MUKA_AttributeGroup = new ETCS_W_Kr_MUKA_AttributeGroupImpl();
		return etcS_W_Kr_MUKA_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul createEV_Modul() {
		EV_ModulImpl eV_Modul = new EV_ModulImpl();
		return eV_Modul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Art_TypeClass createEV_Modul_Art_TypeClass() {
		EV_Modul_Art_TypeClassImpl eV_Modul_Art_TypeClass = new EV_Modul_Art_TypeClassImpl();
		return eV_Modul_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Ausgang_AttributeGroup createEV_Modul_Ausgang_AttributeGroup() {
		EV_Modul_Ausgang_AttributeGroupImpl eV_Modul_Ausgang_AttributeGroup = new EV_Modul_Ausgang_AttributeGroupImpl();
		return eV_Modul_Ausgang_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Eingang_AttributeGroup createEV_Modul_Eingang_AttributeGroup() {
		EV_Modul_Eingang_AttributeGroupImpl eV_Modul_Eingang_AttributeGroup = new EV_Modul_Eingang_AttributeGroupImpl();
		return eV_Modul_Eingang_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Physisch_AttributeGroup createEV_Modul_Physisch_AttributeGroup() {
		EV_Modul_Physisch_AttributeGroupImpl eV_Modul_Physisch_AttributeGroup = new EV_Modul_Physisch_AttributeGroupImpl();
		return eV_Modul_Physisch_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Typ_TypeClass createEV_Modul_Typ_TypeClass() {
		EV_Modul_Typ_TypeClassImpl eV_Modul_Typ_TypeClass = new EV_Modul_Typ_TypeClassImpl();
		return eV_Modul_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Virtuell_AttributeGroup createEV_Modul_Virtuell_AttributeGroup() {
		EV_Modul_Virtuell_AttributeGroupImpl eV_Modul_Virtuell_AttributeGroup = new EV_Modul_Virtuell_AttributeGroupImpl();
		return eV_Modul_Virtuell_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fabrikat_TypeClass createFabrikat_TypeClass() {
		Fabrikat_TypeClassImpl fabrikat_TypeClass = new Fabrikat_TypeClassImpl();
		return fabrikat_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fachtelegramm createFachtelegramm() {
		FachtelegrammImpl fachtelegramm = new FachtelegrammImpl();
		return fachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Anschaltbedingung createFT_Anschaltbedingung() {
		FT_AnschaltbedingungImpl fT_Anschaltbedingung = new FT_AnschaltbedingungImpl();
		return fT_Anschaltbedingung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Merkmale_AttributeGroup createFT_ESG_Merkmale_AttributeGroup() {
		FT_ESG_Merkmale_AttributeGroupImpl fT_ESG_Merkmale_AttributeGroup = new FT_ESG_Merkmale_AttributeGroupImpl();
		return fT_ESG_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Subtyp_TypeClass createFT_ESG_Subtyp_TypeClass() {
		FT_ESG_Subtyp_TypeClassImpl fT_ESG_Subtyp_TypeClass = new FT_ESG_Subtyp_TypeClassImpl();
		return fT_ESG_Subtyp_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ESG_Typ_TypeClass createFT_ESG_Typ_TypeClass() {
		FT_ESG_Typ_TypeClassImpl fT_ESG_Typ_TypeClass = new FT_ESG_Typ_TypeClassImpl();
		return fT_ESG_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_L2_Merkmale_AttributeGroup createFT_ETCS_L2_Merkmale_AttributeGroup() {
		FT_ETCS_L2_Merkmale_AttributeGroupImpl fT_ETCS_L2_Merkmale_AttributeGroup = new FT_ETCS_L2_Merkmale_AttributeGroupImpl();
		return fT_ETCS_L2_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_L2_Typ_TypeClass createFT_ETCS_L2_Typ_TypeClass() {
		FT_ETCS_L2_Typ_TypeClassImpl fT_ETCS_L2_Typ_TypeClass = new FT_ETCS_L2_Typ_TypeClassImpl();
		return fT_ETCS_L2_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_Trans_Merkmale_AttributeGroup createFT_ETCS_Trans_Merkmale_AttributeGroup() {
		FT_ETCS_Trans_Merkmale_AttributeGroupImpl fT_ETCS_Trans_Merkmale_AttributeGroup = new FT_ETCS_Trans_Merkmale_AttributeGroupImpl();
		return fT_ETCS_Trans_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_Trans_Paket_41_AttributeGroup createFT_ETCS_Trans_Paket_41_AttributeGroup() {
		FT_ETCS_Trans_Paket_41_AttributeGroupImpl fT_ETCS_Trans_Paket_41_AttributeGroup = new FT_ETCS_Trans_Paket_41_AttributeGroupImpl();
		return fT_ETCS_Trans_Paket_41_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_Trans_Paket_N_AttributeGroup createFT_ETCS_Trans_Paket_N_AttributeGroup() {
		FT_ETCS_Trans_Paket_N_AttributeGroupImpl fT_ETCS_Trans_Paket_N_AttributeGroup = new FT_ETCS_Trans_Paket_N_AttributeGroupImpl();
		return fT_ETCS_Trans_Paket_N_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teil createFT_Fahrweg_Teil() {
		FT_Fahrweg_TeilImpl fT_Fahrweg_Teil = new FT_Fahrweg_TeilImpl();
		return fT_Fahrweg_Teil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teil_Allg_AttributeGroup createFT_Fahrweg_Teil_Allg_AttributeGroup() {
		FT_Fahrweg_Teil_Allg_AttributeGroupImpl fT_Fahrweg_Teil_Allg_AttributeGroup = new FT_Fahrweg_Teil_Allg_AttributeGroupImpl();
		return fT_Fahrweg_Teil_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teile_AttributeGroup createFT_Fahrweg_Teile_AttributeGroup() {
		FT_Fahrweg_Teile_AttributeGroupImpl fT_Fahrweg_Teile_AttributeGroup = new FT_Fahrweg_Teile_AttributeGroupImpl();
		return fT_Fahrweg_Teile_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_GNT_Merkmale_AttributeGroup createFT_GNT_Merkmale_AttributeGroup() {
		FT_GNT_Merkmale_AttributeGroupImpl fT_GNT_Merkmale_AttributeGroup = new FT_GNT_Merkmale_AttributeGroupImpl();
		return fT_GNT_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_GNT_Punktart_TypeClass createFT_GNT_Punktart_TypeClass() {
		FT_GNT_Punktart_TypeClassImpl fT_GNT_Punktart_TypeClass = new FT_GNT_Punktart_TypeClassImpl();
		return fT_GNT_Punktart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Hinweis_Funktion_TypeClass createFT_Hinweis_Funktion_TypeClass() {
		FT_Hinweis_Funktion_TypeClassImpl fT_Hinweis_Funktion_TypeClass = new FT_Hinweis_Funktion_TypeClassImpl();
		return fT_Hinweis_Funktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ZBS_Merkmale_AttributeGroup createFT_ZBS_Merkmale_AttributeGroup() {
		FT_ZBS_Merkmale_AttributeGroupImpl fT_ZBS_Merkmale_AttributeGroup = new FT_ZBS_Merkmale_AttributeGroupImpl();
		return fT_ZBS_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ZBS_Merkmale_La_AttributeGroup createFT_ZBS_Merkmale_La_AttributeGroup() {
		FT_ZBS_Merkmale_La_AttributeGroupImpl fT_ZBS_Merkmale_La_AttributeGroup = new FT_ZBS_Merkmale_La_AttributeGroupImpl();
		return fT_ZBS_Merkmale_La_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ZBS_Typ_TypeClass createFT_ZBS_Typ_TypeClass() {
		FT_ZBS_Typ_TypeClassImpl fT_ZBS_Typ_TypeClass = new FT_ZBS_Typ_TypeClassImpl();
		return fT_ZBS_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FW_Teil_Nummer_TypeClass createFW_Teil_Nummer_TypeClass() {
		FW_Teil_Nummer_TypeClassImpl fW_Teil_Nummer_TypeClass = new FW_Teil_Nummer_TypeClassImpl();
		return fW_Teil_Nummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gruppen_ID_TypeClass createGruppen_ID_TypeClass() {
		Gruppen_ID_TypeClassImpl gruppen_ID_TypeClass = new Gruppen_ID_TypeClassImpl();
		return gruppen_ID_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Harter_Ausstieg_Aus_L2_TypeClass createHarter_Ausstieg_Aus_L2_TypeClass() {
		Harter_Ausstieg_Aus_L2_TypeClassImpl harter_Ausstieg_Aus_L2_TypeClass = new Harter_Ausstieg_Aus_L2_TypeClassImpl();
		return harter_Ausstieg_Aus_L2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass createHersteller_TypeClass() {
		Hersteller_TypeClassImpl hersteller_TypeClass = new Hersteller_TypeClassImpl();
		return hersteller_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hinweis_Balisenbefestigung_TypeClass createHinweis_Balisenbefestigung_TypeClass() {
		Hinweis_Balisenbefestigung_TypeClassImpl hinweis_Balisenbefestigung_TypeClass = new Hinweis_Balisenbefestigung_TypeClassImpl();
		return hinweis_Balisenbefestigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Individualisierung_Weitere_TypeClass createIndividualisierung_Weitere_TypeClass() {
		Individualisierung_Weitere_TypeClassImpl individualisierung_Weitere_TypeClass = new Individualisierung_Weitere_TypeClassImpl();
		return individualisierung_Weitere_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ist_Befahren_TypeClass createIst_Befahren_TypeClass() {
		Ist_Befahren_TypeClassImpl ist_Befahren_TypeClass = new Ist_Befahren_TypeClassImpl();
		return ist_Befahren_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_1_TypeClass createKm_BTS_1_TypeClass() {
		Km_BTS_1_TypeClassImpl km_BTS_1_TypeClass = new Km_BTS_1_TypeClassImpl();
		return km_BTS_1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_2_TypeClass createKm_BTS_2_TypeClass() {
		Km_BTS_2_TypeClassImpl km_BTS_2_TypeClass = new Km_BTS_2_TypeClassImpl();
		return km_BTS_2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_3_TypeClass createKm_BTS_3_TypeClass() {
		Km_BTS_3_TypeClassImpl km_BTS_3_TypeClass = new Km_BTS_3_TypeClassImpl();
		return km_BTS_3_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Knoten_Auf_TOP_Kante_AttributeGroup createKnoten_Auf_TOP_Kante_AttributeGroup() {
		Knoten_Auf_TOP_Kante_AttributeGroupImpl knoten_Auf_TOP_Kante_AttributeGroup = new Knoten_Auf_TOP_Kante_AttributeGroupImpl();
		return knoten_Auf_TOP_Kante_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konfigurationskennung_TypeClass createKonfigurationskennung_TypeClass() {
		Konfigurationskennung_TypeClassImpl konfigurationskennung_TypeClass = new Konfigurationskennung_TypeClassImpl();
		return konfigurationskennung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L_ACKLEVELTR_TypeClass createL_ACKLEVELTR_TypeClass() {
		L_ACKLEVELTR_TypeClassImpl l_ACKLEVELTR_TypeClass = new L_ACKLEVELTR_TypeClassImpl();
		return l_ACKLEVELTR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_1_TypeClass createLaenge_1_TypeClass() {
		Laenge_1_TypeClassImpl laenge_1_TypeClass = new Laenge_1_TypeClassImpl();
		return laenge_1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Ausfuehrungsbereich_TypeClass createLaenge_Ausfuehrungsbereich_TypeClass() {
		Laenge_Ausfuehrungsbereich_TypeClassImpl laenge_Ausfuehrungsbereich_TypeClass = new Laenge_Ausfuehrungsbereich_TypeClassImpl();
		return laenge_Ausfuehrungsbereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Gestufte_V_Signalisierung_TypeClass createLaenge_Gestufte_V_Signalisierung_TypeClass() {
		Laenge_Gestufte_V_Signalisierung_TypeClassImpl laenge_Gestufte_V_Signalisierung_TypeClass = new Laenge_Gestufte_V_Signalisierung_TypeClassImpl();
		return laenge_Gestufte_V_Signalisierung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Soll_Mind_150_TypeClass createLaenge_Soll_Mind_150_TypeClass() {
		Laenge_Soll_Mind_150_TypeClassImpl laenge_Soll_Mind_150_TypeClass = new Laenge_Soll_Mind_150_TypeClassImpl();
		return laenge_Soll_Mind_150_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leistungsbedarf_TypeClass createLeistungsbedarf_TypeClass() {
		Leistungsbedarf_TypeClassImpl leistungsbedarf_TypeClass = new Leistungsbedarf_TypeClassImpl();
		return leistungsbedarf_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage createLEU_Anlage() {
		LEU_AnlageImpl leU_Anlage = new LEU_AnlageImpl();
		return leU_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Allg_AttributeGroup createLEU_Anlage_Allg_AttributeGroup() {
		LEU_Anlage_Allg_AttributeGroupImpl leU_Anlage_Allg_AttributeGroup = new LEU_Anlage_Allg_AttributeGroupImpl();
		return leU_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Art_TypeClass createLEU_Anlage_Art_TypeClass() {
		LEU_Anlage_Art_TypeClassImpl leU_Anlage_Art_TypeClass = new LEU_Anlage_Art_TypeClassImpl();
		return leU_Anlage_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Bezeichnung_AttributeGroup createLEU_Anlage_Bezeichnung_AttributeGroup() {
		LEU_Anlage_Bezeichnung_AttributeGroupImpl leU_Anlage_Bezeichnung_AttributeGroup = new LEU_Anlage_Bezeichnung_AttributeGroupImpl();
		return leU_Anlage_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Ausgang_Nr_TypeClass createLEU_Ausgang_Nr_TypeClass() {
		LEU_Ausgang_Nr_TypeClassImpl leU_Ausgang_Nr_TypeClass = new LEU_Ausgang_Nr_TypeClassImpl();
		return leU_Ausgang_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul createLEU_Modul() {
		LEU_ModulImpl leU_Modul = new LEU_ModulImpl();
		return leU_Modul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Allg_AttributeGroup createLEU_Modul_Allg_AttributeGroup() {
		LEU_Modul_Allg_AttributeGroupImpl leU_Modul_Allg_AttributeGroup = new LEU_Modul_Allg_AttributeGroupImpl();
		return leU_Modul_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Art_TypeClass createLEU_Modul_Art_TypeClass() {
		LEU_Modul_Art_TypeClassImpl leU_Modul_Art_TypeClass = new LEU_Modul_Art_TypeClassImpl();
		return leU_Modul_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Ausgang_AttributeGroup createLEU_Modul_Ausgang_AttributeGroup() {
		LEU_Modul_Ausgang_AttributeGroupImpl leU_Modul_Ausgang_AttributeGroup = new LEU_Modul_Ausgang_AttributeGroupImpl();
		return leU_Modul_Ausgang_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Bezeichnung_AttributeGroup createLEU_Modul_Bezeichnung_AttributeGroup() {
		LEU_Modul_Bezeichnung_AttributeGroupImpl leU_Modul_Bezeichnung_AttributeGroup = new LEU_Modul_Bezeichnung_AttributeGroupImpl();
		return leU_Modul_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Geraetestand_TypeClass createLEU_Modul_Geraetestand_TypeClass() {
		LEU_Modul_Geraetestand_TypeClassImpl leU_Modul_Geraetestand_TypeClass = new LEU_Modul_Geraetestand_TypeClassImpl();
		return leU_Modul_Geraetestand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Typ_TypeClass createLEU_Modul_Typ_TypeClass() {
		LEU_Modul_Typ_TypeClassImpl leU_Modul_Typ_TypeClass = new LEU_Modul_Typ_TypeClassImpl();
		return leU_Modul_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten createLEU_Schaltkasten() {
		LEU_SchaltkastenImpl leU_Schaltkasten = new LEU_SchaltkastenImpl();
		return leU_Schaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Bezeichnung_AttributeGroup createLEU_Schaltkasten_Bezeichnung_AttributeGroup() {
		LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl leU_Schaltkasten_Bezeichnung_AttributeGroup = new LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl();
		return leU_Schaltkasten_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Energie_AttributeGroup createLEU_Schaltkasten_Energie_AttributeGroup() {
		LEU_Schaltkasten_Energie_AttributeGroupImpl leU_Schaltkasten_Energie_AttributeGroup = new LEU_Schaltkasten_Energie_AttributeGroupImpl();
		return leU_Schaltkasten_Energie_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Position_AttributeGroup createLEU_Schaltkasten_Position_AttributeGroup() {
		LEU_Schaltkasten_Position_AttributeGroupImpl leU_Schaltkasten_Position_AttributeGroup = new LEU_Schaltkasten_Position_AttributeGroupImpl();
		return leU_Schaltkasten_Position_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Typ_TypeClass createLEU_Schaltkasten_Typ_TypeClass() {
		LEU_Schaltkasten_Typ_TypeClassImpl leU_Schaltkasten_Typ_TypeClass = new LEU_Schaltkasten_Typ_TypeClassImpl();
		return leU_Schaltkasten_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Steuernde_AttributeGroup createLEU_Steuernde_AttributeGroup() {
		LEU_Steuernde_AttributeGroupImpl leU_Steuernde_AttributeGroup = new LEU_Steuernde_AttributeGroupImpl();
		return leU_Steuernde_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lfd_Nr_Am_Bezugspunkt_TypeClass createLfd_Nr_Am_Bezugspunkt_TypeClass() {
		Lfd_Nr_Am_Bezugspunkt_TypeClassImpl lfd_Nr_Am_Bezugspunkt_TypeClass = new Lfd_Nr_Am_Bezugspunkt_TypeClassImpl();
		return lfd_Nr_Am_Bezugspunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link_Distanz_TypeClass createLink_Distanz_TypeClass() {
		Link_Distanz_TypeClassImpl link_Distanz_TypeClass = new Link_Distanz_TypeClassImpl();
		return link_Distanz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLA_TypeClass createLLA_TypeClass() {
		LLA_TypeClassImpl llA_TypeClass = new LLA_TypeClassImpl();
		return llA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LM_G_TypeClass createLM_G_TypeClass() {
		LM_G_TypeClassImpl lM_G_TypeClass = new LM_G_TypeClassImpl();
		return lM_G_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LT_Binaerdatei_Hilfe_AttributeGroup createLT_Binaerdatei_Hilfe_AttributeGroup() {
		LT_Binaerdatei_Hilfe_AttributeGroupImpl lT_Binaerdatei_Hilfe_AttributeGroup = new LT_Binaerdatei_Hilfe_AttributeGroupImpl();
		return lT_Binaerdatei_Hilfe_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LT_Binaerdaten_AttributeGroup createLT_Binaerdaten_AttributeGroup() {
		LT_Binaerdaten_AttributeGroupImpl lT_Binaerdaten_AttributeGroup = new LT_Binaerdaten_AttributeGroupImpl();
		return lT_Binaerdaten_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Luft_Telegramm createLuft_Telegramm() {
		Luft_TelegrammImpl luft_Telegramm = new Luft_TelegrammImpl();
		return luft_Telegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public M_LEVELTR_TypeClass createM_LEVELTR_TypeClass() {
		M_LEVELTR_TypeClassImpl m_LEVELTR_TypeClass = new M_LEVELTR_TypeClassImpl();
		return m_LEVELTR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neig_1_TypeClass createMassgebende_Neig_1_TypeClass() {
		Massgebende_Neig_1_TypeClassImpl massgebende_Neig_1_TypeClass = new Massgebende_Neig_1_TypeClassImpl();
		return massgebende_Neig_1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neig_Schutzstrecke_TypeClass createMassgebende_Neig_Schutzstrecke_TypeClass() {
		Massgebende_Neig_Schutzstrecke_TypeClassImpl massgebende_Neig_Schutzstrecke_TypeClass = new Massgebende_Neig_Schutzstrecke_TypeClassImpl();
		return massgebende_Neig_Schutzstrecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_150_TypeClass createMassgebende_Neigung_Mind_150_TypeClass() {
		Massgebende_Neigung_Mind_150_TypeClassImpl massgebende_Neigung_Mind_150_TypeClass = new Massgebende_Neigung_Mind_150_TypeClassImpl();
		return massgebende_Neigung_Mind_150_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_Sig_150_TypeClass createMassgebende_Neigung_Mind_Sig_150_TypeClass() {
		Massgebende_Neigung_Mind_Sig_150_TypeClassImpl massgebende_Neigung_Mind_Sig_150_TypeClass = new Massgebende_Neigung_Mind_Sig_150_TypeClassImpl();
		return massgebende_Neigung_Mind_Sig_150_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_Sig_TypeClass createMassgebende_Neigung_Mind_Sig_TypeClass() {
		Massgebende_Neigung_Mind_Sig_TypeClassImpl massgebende_Neigung_Mind_Sig_TypeClass = new Massgebende_Neigung_Mind_Sig_TypeClassImpl();
		return massgebende_Neigung_Mind_Sig_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mastschild_TypeClass createMastschild_TypeClass() {
		Mastschild_TypeClassImpl mastschild_TypeClass = new Mastschild_TypeClassImpl();
		return mastschild_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Max_Leistung_TypeClass createMax_Leistung_TypeClass() {
		Max_Leistung_TypeClassImpl max_Leistung_TypeClass = new Max_Leistung_TypeClassImpl();
		return max_Leistung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Max_Unterbrechungszeit_TypeClass createMax_Unterbrechungszeit_TypeClass() {
		Max_Unterbrechungszeit_TypeClassImpl max_Unterbrechungszeit_TypeClass = new Max_Unterbrechungszeit_TypeClassImpl();
		return max_Unterbrechungszeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_AttributeGroup createMetallteil_AttributeGroup() {
		Metallteil_AttributeGroupImpl metallteil_AttributeGroup = new Metallteil_AttributeGroupImpl();
		return metallteil_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_Kategorie_TypeClass createMetallteil_Kategorie_TypeClass() {
		Metallteil_Kategorie_TypeClassImpl metallteil_Kategorie_TypeClass = new Metallteil_Kategorie_TypeClassImpl();
		return metallteil_Kategorie_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_Laenge_TypeClass createMetallteil_Laenge_TypeClass() {
		Metallteil_Laenge_TypeClassImpl metallteil_Laenge_TypeClass = new Metallteil_Laenge_TypeClassImpl();
		return metallteil_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulnummer_TypeClass createModulnummer_TypeClass() {
		Modulnummer_TypeClassImpl modulnummer_TypeClass = new Modulnummer_TypeClassImpl();
		return modulnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montageabweichung_TypeClass createMontageabweichung_TypeClass() {
		Montageabweichung_TypeClassImpl montageabweichung_TypeClass = new Montageabweichung_TypeClassImpl();
		return montageabweichung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neigung_TypeClass createNeigung_TypeClass() {
		Neigung_TypeClassImpl neigung_TypeClass = new Neigung_TypeClassImpl();
		return neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nennleistung_TypeClass createNennleistung_TypeClass() {
		Nennleistung_TypeClassImpl nennleistung_TypeClass = new Nennleistung_TypeClassImpl();
		return nennleistung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_BG_TypeClass createNID_BG_TypeClass() {
		NID_BG_TypeClassImpl niD_BG_TypeClass = new NID_BG_TypeClassImpl();
		return niD_BG_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_C_TypeClass createNID_C_TypeClass() {
		NID_C_TypeClassImpl niD_C_TypeClass = new NID_C_TypeClassImpl();
		return niD_C_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_RBC_TypeClass createNID_RBC_TypeClass() {
		NID_RBC_TypeClassImpl niD_RBC_TypeClass = new NID_RBC_TypeClassImpl();
		return niD_RBC_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_STM_TypeClass createNID_STM_TypeClass() {
		NID_STM_TypeClassImpl niD_STM_TypeClass = new NID_STM_TypeClassImpl();
		return niD_STM_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_TSR_TypeClass createNID_TSR_TypeClass() {
		NID_TSR_TypeClassImpl niD_TSR_TypeClass = new NID_TSR_TypeClassImpl();
		return niD_TSR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nummer_Schaltkasten_TypeClass createNummer_Schaltkasten_TypeClass() {
		Nummer_Schaltkasten_TypeClassImpl nummer_Schaltkasten_TypeClass = new Nummer_Schaltkasten_TypeClassImpl();
		return nummer_Schaltkasten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberstrombegrenzung_Gueterzug_TypeClass createOberstrombegrenzung_Gueterzug_TypeClass() {
		Oberstrombegrenzung_Gueterzug_TypeClassImpl oberstrombegrenzung_Gueterzug_TypeClass = new Oberstrombegrenzung_Gueterzug_TypeClassImpl();
		return oberstrombegrenzung_Gueterzug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberstrombegrenzung_Reisezug_TypeClass createOberstrombegrenzung_Reisezug_TypeClass() {
		Oberstrombegrenzung_Reisezug_TypeClassImpl oberstrombegrenzung_Reisezug_TypeClass = new Oberstrombegrenzung_Reisezug_TypeClassImpl();
		return oberstrombegrenzung_Reisezug_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port_Nr_Ausg_Physisch_TypeClass createPort_Nr_Ausg_Physisch_TypeClass() {
		Port_Nr_Ausg_Physisch_TypeClassImpl port_Nr_Ausg_Physisch_TypeClass = new Port_Nr_Ausg_Physisch_TypeClassImpl();
		return port_Nr_Ausg_Physisch_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_Sonstige_TypeClass createPosition_Sonstige_TypeClass() {
		Position_Sonstige_TypeClassImpl position_Sonstige_TypeClass = new Position_Sonstige_TypeClassImpl();
		return position_Sonstige_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_TypeClass createPosition_TypeClass() {
		Position_TypeClassImpl position_TypeClass = new Position_TypeClassImpl();
		return position_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primaerquelle_TypeClass createPrimaerquelle_TypeClass() {
		Primaerquelle_TypeClassImpl primaerquelle_TypeClass = new Primaerquelle_TypeClassImpl();
		return primaerquelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_TypeClass createPrioritaet_TypeClass() {
		Prioritaet_TypeClassImpl prioritaet_TypeClass = new Prioritaet_TypeClassImpl();
		return prioritaet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prog_Datei_Einzel_AttributeGroup createProg_Datei_Einzel_AttributeGroup() {
		Prog_Datei_Einzel_AttributeGroupImpl prog_Datei_Einzel_AttributeGroup = new Prog_Datei_Einzel_AttributeGroupImpl();
		return prog_Datei_Einzel_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prog_Datei_Gruppe createProg_Datei_Gruppe() {
		Prog_Datei_GruppeImpl prog_Datei_Gruppe = new Prog_Datei_GruppeImpl();
		return prog_Datei_Gruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Projektierungsfall_TypeClass createProjektierungsfall_TypeClass() {
		Projektierungsfall_TypeClassImpl projektierungsfall_TypeClass = new Projektierungsfall_TypeClassImpl();
		return projektierungsfall_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC createRBC() {
		RBCImpl rbc = new RBCImpl();
		return rbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_Allg_AttributeGroup createRBC_Allg_AttributeGroup() {
		RBC_Allg_AttributeGroupImpl rbC_Allg_AttributeGroup = new RBC_Allg_AttributeGroupImpl();
		return rbC_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_ETCS_System_Version_TypeClass createRBC_ETCS_System_Version_TypeClass() {
		RBC_ETCS_System_Version_TypeClassImpl rbC_ETCS_System_Version_TypeClass = new RBC_ETCS_System_Version_TypeClassImpl();
		return rbC_ETCS_System_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC_SRS_Version_TypeClass createRBC_SRS_Version_TypeClass() {
		RBC_SRS_Version_TypeClassImpl rbC_SRS_Version_TypeClass = new RBC_SRS_Version_TypeClassImpl();
		return rbC_SRS_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rekursion_2_Nr_TypeClass createRekursion_2_Nr_TypeClass() {
		Rekursion_2_Nr_TypeClassImpl rekursion_2_Nr_TypeClass = new Rekursion_2_Nr_TypeClassImpl();
		return rekursion_2_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rekursion_Nr_TypeClass createRekursion_Nr_TypeClass() {
		Rekursion_Nr_TypeClassImpl rekursion_Nr_TypeClass = new Rekursion_Nr_TypeClassImpl();
		return rekursion_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rufnummer_TypeClass createRufnummer_TypeClass() {
		Rufnummer_TypeClassImpl rufnummer_TypeClass = new Rufnummer_TypeClassImpl();
		return rufnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBE_TypeClass createSBE_TypeClass() {
		SBE_TypeClassImpl sbE_TypeClass = new SBE_TypeClassImpl();
		return sbE_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzstrecke_Erforderlich_TypeClass createSchutzstrecke_Erforderlich_TypeClass() {
		Schutzstrecke_Erforderlich_TypeClassImpl schutzstrecke_Erforderlich_TypeClass = new Schutzstrecke_Erforderlich_TypeClassImpl();
		return schutzstrecke_Erforderlich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzstrecke_Vorhanden_TypeClass createSchutzstrecke_Vorhanden_TypeClass() {
		Schutzstrecke_Vorhanden_TypeClassImpl schutzstrecke_Vorhanden_TypeClass = new Schutzstrecke_Vorhanden_TypeClassImpl();
		return schutzstrecke_Vorhanden_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solllaenge_Mind_Sig_150_TypeClass createSolllaenge_Mind_Sig_150_TypeClass() {
		Solllaenge_Mind_Sig_150_TypeClassImpl solllaenge_Mind_Sig_150_TypeClass = new Solllaenge_Mind_Sig_150_TypeClassImpl();
		return solllaenge_Mind_Sig_150_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solllaenge_Mind_Sig_TypeClass createSolllaenge_Mind_Sig_TypeClass() {
		Solllaenge_Mind_Sig_TypeClassImpl solllaenge_Mind_Sig_TypeClass = new Solllaenge_Mind_Sig_TypeClassImpl();
		return solllaenge_Mind_Sig_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonstige_Standortangabe_TypeClass createSonstige_Standortangabe_TypeClass() {
		Sonstige_Standortangabe_TypeClassImpl sonstige_Standortangabe_TypeClass = new Sonstige_Standortangabe_TypeClassImpl();
		return sonstige_Standortangabe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Art_TypeClass createSpannung_Art_TypeClass() {
		Spannung_Art_TypeClassImpl spannung_Art_TypeClass = new Spannung_Art_TypeClassImpl();
		return spannung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Toleranz_Obere_TypeClass createSpannung_Toleranz_Obere_TypeClass() {
		Spannung_Toleranz_Obere_TypeClassImpl spannung_Toleranz_Obere_TypeClass = new Spannung_Toleranz_Obere_TypeClassImpl();
		return spannung_Toleranz_Obere_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Toleranz_Untere_TypeClass createSpannung_Toleranz_Untere_TypeClass() {
		Spannung_Toleranz_Untere_TypeClassImpl spannung_Toleranz_Untere_TypeClass = new Spannung_Toleranz_Untere_TypeClassImpl();
		return spannung_Toleranz_Untere_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SRS_Version_TypeClass createSRS_Version_TypeClass() {
		SRS_Version_TypeClassImpl srS_Version_TypeClass = new SRS_Version_TypeClassImpl();
		return srS_Version_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standortangabe_Balisenschild_TypeClass createStandortangabe_Balisenschild_TypeClass() {
		Standortangabe_Balisenschild_TypeClassImpl standortangabe_Balisenschild_TypeClass = new Standortangabe_Balisenschild_TypeClassImpl();
		return standortangabe_Balisenschild_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_W_Element_AttributeGroup createStart_W_Element_AttributeGroup() {
		Start_W_Element_AttributeGroupImpl start_W_Element_AttributeGroup = new Start_W_Element_AttributeGroupImpl();
		return start_W_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STZ_TypeClass createSTZ_TypeClass() {
		STZ_TypeClassImpl stZ_TypeClass = new STZ_TypeClassImpl();
		return stZ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_Vor_Grenze_Besonders_TypeClass createSystem_Vor_Grenze_Besonders_TypeClass() {
		System_Vor_Grenze_Besonders_TypeClassImpl system_Vor_Grenze_Besonders_TypeClass = new System_Vor_Grenze_Besonders_TypeClassImpl();
		return system_Vor_Grenze_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public System_Vor_Grenze_TypeClass createSystem_Vor_Grenze_TypeClass() {
		System_Vor_Grenze_TypeClassImpl system_Vor_Grenze_TypeClass = new System_Vor_Grenze_TypeClassImpl();
		return system_Vor_Grenze_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Meldepunkt_TypeClass createTBV_Meldepunkt_TypeClass() {
		TBV_Meldepunkt_TypeClassImpl tbV_Meldepunkt_TypeClass = new TBV_Meldepunkt_TypeClassImpl();
		return tbV_Meldepunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Tunnelbereich_Laenge_TypeClass createTBV_Tunnelbereich_Laenge_TypeClass() {
		TBV_Tunnelbereich_Laenge_TypeClassImpl tbV_Tunnelbereich_Laenge_TypeClass = new TBV_Tunnelbereich_Laenge_TypeClassImpl();
		return tbV_Tunnelbereich_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBV_Tunnelsignal_TypeClass createTBV_Tunnelsignal_TypeClass() {
		TBV_Tunnelsignal_TypeClassImpl tbV_Tunnelsignal_TypeClass = new TBV_Tunnelsignal_TypeClassImpl();
		return tbV_Tunnelsignal_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_Index_TypeClass createTelegramm_Index_TypeClass() {
		Telegramm_Index_TypeClassImpl telegramm_Index_TypeClass = new Telegramm_Index_TypeClassImpl();
		return telegramm_Index_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegrammnummer_TypeClass createTelegrammnummer_TypeClass() {
		Telegrammnummer_TypeClassImpl telegrammnummer_TypeClass = new Telegrammnummer_TypeClassImpl();
		return telegrammnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text_Bedingung_TypeClass createText_Bedingung_TypeClass() {
		Text_Bedingung_TypeClassImpl text_Bedingung_TypeClass = new Text_Bedingung_TypeClassImpl();
		return text_Bedingung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textmeldung_TypeClass createTextmeldung_TypeClass() {
		Textmeldung_TypeClassImpl textmeldung_TypeClass = new Textmeldung_TypeClassImpl();
		return textmeldung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberbrueckung_EV_Unterbrechung_TypeClass createUeberbrueckung_EV_Unterbrechung_TypeClass() {
		Ueberbrueckung_EV_Unterbrechung_TypeClassImpl ueberbrueckung_EV_Unterbrechung_TypeClass = new Ueberbrueckung_EV_Unterbrechung_TypeClassImpl();
		return ueberbrueckung_EV_Unterbrechung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberwachung_Laenge_TypeClass createUeberwachung_Laenge_TypeClass() {
		Ueberwachung_Laenge_TypeClassImpl ueberwachung_Laenge_TypeClass = new Ueberwachung_Laenge_TypeClassImpl();
		return ueberwachung_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Umfahrstrasse_TypeClass createUmfahrstrasse_TypeClass() {
		Umfahrstrasse_TypeClassImpl umfahrstrasse_TypeClass = new Umfahrstrasse_TypeClassImpl();
		return umfahrstrasse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergruppen_ID_TypeClass createUntergruppen_ID_TypeClass() {
		Untergruppen_ID_TypeClassImpl untergruppen_ID_TypeClass = new Untergruppen_ID_TypeClassImpl();
		return untergruppen_ID_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Befehl_R_TypeClass createV_Befehl_R_TypeClass() {
		V_Befehl_R_TypeClassImpl v_Befehl_R_TypeClass = new V_Befehl_R_TypeClassImpl();
		return v_Befehl_R_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Befehl_Z_TypeClass createV_Befehl_Z_TypeClass() {
		V_Befehl_Z_TypeClassImpl v_Befehl_Z_TypeClass = new V_Befehl_Z_TypeClassImpl();
		return v_Befehl_Z_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Frei_TypeClass createV_Frei_TypeClass() {
		V_Frei_TypeClassImpl v_Frei_TypeClass = new V_Frei_TypeClassImpl();
		return v_Frei_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Start_TypeClass createV_Start_TypeClass() {
		V_Start_TypeClassImpl v_Start_TypeClass = new V_Start_TypeClassImpl();
		return v_Start_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Ziel_TypeClass createV_Ziel_TypeClass() {
		V_Ziel_TypeClassImpl v_Ziel_TypeClass = new V_Ziel_TypeClassImpl();
		return v_Ziel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Zul_Strecke_TypeClass createV_Zul_Strecke_TypeClass() {
		V_Zul_Strecke_TypeClassImpl v_Zul_Strecke_TypeClass = new V_Zul_Strecke_TypeClassImpl();
		return v_Zul_Strecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Kennung_TypeClass createVBC_Kennung_TypeClass() {
		VBC_Kennung_TypeClassImpl vbC_Kennung_TypeClass = new VBC_Kennung_TypeClassImpl();
		return vbC_Kennung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_NID_C_TypeClass createVBC_NID_C_TypeClass() {
		VBC_NID_C_TypeClassImpl vbC_NID_C_TypeClass = new VBC_NID_C_TypeClassImpl();
		return vbC_NID_C_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Setzen_TypeClass createVBC_Setzen_TypeClass() {
		VBC_Setzen_TypeClassImpl vbC_Setzen_TypeClass = new VBC_Setzen_TypeClassImpl();
		return vbC_Setzen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Timer_TypeClass createVBC_Timer_TypeClass() {
		VBC_Timer_TypeClassImpl vbC_Timer_TypeClass = new VBC_Timer_TypeClassImpl();
		return vbC_Timer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_Anhalten_TypeClass createVerbot_Anhalten_TypeClass() {
		Verbot_Anhalten_TypeClassImpl verbot_Anhalten_TypeClass = new Verbot_Anhalten_TypeClassImpl();
		return verbot_Anhalten_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_Regenerative_Bremse_TypeClass createVerbot_Regenerative_Bremse_TypeClass() {
		Verbot_Regenerative_Bremse_TypeClassImpl verbot_Regenerative_Bremse_TypeClass = new Verbot_Regenerative_Bremse_TypeClassImpl();
		return verbot_Regenerative_Bremse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbot_WB_Art_TypeClass createVerbot_WB_Art_TypeClass() {
		Verbot_WB_Art_TypeClassImpl verbot_WB_Art_TypeClass = new Verbot_WB_Art_TypeClassImpl();
		return verbot_WB_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkuerzter_Abstand_TypeClass createVerkuerzter_Abstand_TypeClass() {
		Verkuerzter_Abstand_TypeClassImpl verkuerzter_Abstand_TypeClass = new Verkuerzter_Abstand_TypeClassImpl();
		return verkuerzter_Abstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Als_Rueckfall_TypeClass createVerwendung_Als_Rueckfall_TypeClass() {
		Verwendung_Als_Rueckfall_TypeClassImpl verwendung_Als_Rueckfall_TypeClass = new Verwendung_Als_Rueckfall_TypeClassImpl();
		return verwendung_Als_Rueckfall_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Hilfe_TypeClass createVerwendung_Hilfe_TypeClass() {
		Verwendung_Hilfe_TypeClassImpl verwendung_Hilfe_TypeClass = new Verwendung_Hilfe_TypeClassImpl();
		return verwendung_Hilfe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_TypeClass createVerwendung_TypeClass() {
		Verwendung_TypeClassImpl verwendung_TypeClass = new Verwendung_TypeClassImpl();
		return verwendung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_1_TypeClass createVGR_1_TypeClass() {
		VGR_1_TypeClassImpl vgR_1_TypeClass = new VGR_1_TypeClassImpl();
		return vgR_1_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_2_TypeClass createVGR_2_TypeClass() {
		VGR_2_TypeClassImpl vgR_2_TypeClass = new VGR_2_TypeClassImpl();
		return vgR_2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_TypeClass createVGR_TypeClass() {
		VGR_TypeClassImpl vgR_TypeClass = new VGR_TypeClassImpl();
		return vgR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VLA_TypeClass createVLA_TypeClass() {
		VLA_TypeClassImpl vlA_TypeClass = new VLA_TypeClassImpl();
		return vlA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorsignalabstand_TypeClass createVorsignalabstand_TypeClass() {
		Vorsignalabstand_TypeClassImpl vorsignalabstand_TypeClass = new Vorsignalabstand_TypeClassImpl();
		return vorsignalabstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VZ_TypeClass createVZ_TypeClass() {
		VZ_TypeClassImpl vZ_TypeClass = new VZ_TypeClassImpl();
		return vZ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anschluss_TypeClass createW_Anschluss_TypeClass() {
		W_Anschluss_TypeClassImpl w_Anschluss_TypeClass = new W_Anschluss_TypeClassImpl();
		return w_Anschluss_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Lage_TypeClass createW_Lage_TypeClass() {
		W_Lage_TypeClassImpl w_Lage_TypeClass = new W_Lage_TypeClassImpl();
		return w_Lage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirkrichtung_In_Datenpunkt_TypeClass createWirkrichtung_In_Datenpunkt_TypeClass() {
		Wirkrichtung_In_Datenpunkt_TypeClassImpl wirkrichtung_In_Datenpunkt_TypeClass = new Wirkrichtung_In_Datenpunkt_TypeClassImpl();
		return wirkrichtung_In_Datenpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksam_TypeClass createWirksam_TypeClass() {
		Wirksam_TypeClassImpl wirksam_TypeClass = new Wirksam_TypeClassImpl();
		return wirksam_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Distanz_TypeClass createZBS_La_Bereich_Distanz_TypeClass() {
		ZBS_La_Bereich_Distanz_TypeClassImpl zbS_La_Bereich_Distanz_TypeClass = new ZBS_La_Bereich_Distanz_TypeClassImpl();
		return zbS_La_Bereich_Distanz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Geschwindigkeit_TypeClass createZBS_La_Bereich_Geschwindigkeit_TypeClass() {
		ZBS_La_Bereich_Geschwindigkeit_TypeClassImpl zbS_La_Bereich_Geschwindigkeit_TypeClass = new ZBS_La_Bereich_Geschwindigkeit_TypeClassImpl();
		return zbS_La_Bereich_Geschwindigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Laenge_TypeClass createZBS_La_Bereich_Laenge_TypeClass() {
		ZBS_La_Bereich_Laenge_TypeClassImpl zbS_La_Bereich_Laenge_TypeClass = new ZBS_La_Bereich_Laenge_TypeClassImpl();
		return zbS_La_Bereich_Laenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Neigung_TypeClass createZBS_La_Bereich_Neigung_TypeClass() {
		ZBS_La_Bereich_Neigung_TypeClassImpl zbS_La_Bereich_Neigung_TypeClass = new ZBS_La_Bereich_Neigung_TypeClassImpl();
		return zbS_La_Bereich_Neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Merkmale_AttributeGroup createZBS_Merkmale_AttributeGroup() {
		ZBS_Merkmale_AttributeGroupImpl zbS_Merkmale_AttributeGroup = new ZBS_Merkmale_AttributeGroupImpl();
		return zbS_Merkmale_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Reaktion_TypeClass createZBS_Reaktion_TypeClass() {
		ZBS_Reaktion_TypeClassImpl zbS_Reaktion_TypeClass = new ZBS_Reaktion_TypeClassImpl();
		return zbS_Reaktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schutzstrecke createZBS_Schutzstrecke() {
		ZBS_SchutzstreckeImpl zbS_Schutzstrecke = new ZBS_SchutzstreckeImpl();
		return zbS_Schutzstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schutzstrecke_Allg_AttributeGroup createZBS_Schutzstrecke_Allg_AttributeGroup() {
		ZBS_Schutzstrecke_Allg_AttributeGroupImpl zbS_Schutzstrecke_Allg_AttributeGroup = new ZBS_Schutzstrecke_Allg_AttributeGroupImpl();
		return zbS_Schutzstrecke_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Signal createZBS_Signal() {
		ZBS_SignalImpl zbS_Signal = new ZBS_SignalImpl();
		return zbS_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Signal_Signalabstand_AttributeGroup createZBS_Signal_Signalabstand_AttributeGroup() {
		ZBS_Signal_Signalabstand_AttributeGroupImpl zbS_Signal_Signalabstand_AttributeGroup = new ZBS_Signal_Signalabstand_AttributeGroupImpl();
		return zbS_Signal_Signalabstand_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_DP_Ausrichtung_TypeClass createZiel_DP_Ausrichtung_TypeClass() {
		Ziel_DP_Ausrichtung_TypeClassImpl ziel_DP_Ausrichtung_TypeClass = new Ziel_DP_Ausrichtung_TypeClassImpl();
		return ziel_DP_Ausrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_Ist_Fahrwegende_TypeClass createZiel_Ist_Fahrwegende_TypeClass() {
		Ziel_Ist_Fahrwegende_TypeClassImpl ziel_Ist_Fahrwegende_TypeClass = new Ziel_Ist_Fahrwegende_TypeClassImpl();
		return ziel_Ist_Fahrwegende_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_W_Element_AttributeGroup createZiel_W_Element_AttributeGroup() {
		Ziel_W_Element_AttributeGroupImpl ziel_W_Element_AttributeGroup = new Ziel_W_Element_AttributeGroupImpl();
		return ziel_W_Element_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLA_TypeClass createZLA_TypeClass() {
		ZLA_TypeClassImpl zlA_TypeClass = new ZLA_TypeClassImpl();
		return zlA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze createZUB_Bereichsgrenze() {
		ZUB_BereichsgrenzeImpl zuB_Bereichsgrenze = new ZUB_BereichsgrenzeImpl();
		return zuB_Bereichsgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Allg_AttributeGroup createZUB_Bereichsgrenze_Allg_AttributeGroup() {
		ZUB_Bereichsgrenze_Allg_AttributeGroupImpl zuB_Bereichsgrenze_Allg_AttributeGroup = new ZUB_Bereichsgrenze_Allg_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup createZUB_Bereichsgrenze_Bezeichnung_AttributeGroup() {
		ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl zuB_Bereichsgrenze_Bezeichnung_AttributeGroup = new ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup createZUB_Bereichsgrenze_Nach_ESG_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_ESG_AttributeGroupImpl zuB_Bereichsgrenze_Nach_ESG_AttributeGroup = new ZUB_Bereichsgrenze_Nach_ESG_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_ESG_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_GNT_TypeClass createZUB_Bereichsgrenze_Nach_GNT_TypeClass() {
		ZUB_Bereichsgrenze_Nach_GNT_TypeClassImpl zuB_Bereichsgrenze_Nach_GNT_TypeClass = new ZUB_Bereichsgrenze_Nach_GNT_TypeClassImpl();
		return zuB_Bereichsgrenze_Nach_GNT_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_L2_AttributeGroup createZUB_Bereichsgrenze_Nach_L2_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl zuB_Bereichsgrenze_Nach_L2_AttributeGroup = new ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_L2_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup createZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl zuB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup = new ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup createZUB_Bereichsgrenze_Nach_LZB_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_LZB_AttributeGroupImpl zuB_Bereichsgrenze_Nach_LZB_AttributeGroup = new ZUB_Bereichsgrenze_Nach_LZB_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_LZB_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup createZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup = new ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup createZUB_Bereichsgrenze_Nach_PZB_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl zuB_Bereichsgrenze_Nach_PZB_AttributeGroup = new ZUB_Bereichsgrenze_Nach_PZB_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_PZB_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup createZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup = new ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup createZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup() {
		ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl zuB_Bereichsgrenze_Nach_ZBS_AttributeGroup = new ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupImpl();
		return zuB_Bereichsgrenze_Nach_ZBS_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Bgrenze_RBC_Wechsel_AttributeGroup createZUB_Bgrenze_RBC_Wechsel_AttributeGroup() {
		ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl zuB_Bgrenze_RBC_Wechsel_AttributeGroup = new ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl();
		return zuB_Bgrenze_RBC_Wechsel_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_SE_Ausruestung_AttributeGroup createZUB_SE_Ausruestung_AttributeGroup() {
		ZUB_SE_Ausruestung_AttributeGroupImpl zuB_SE_Ausruestung_AttributeGroup = new ZUB_SE_Ausruestung_AttributeGroupImpl();
		return zuB_SE_Ausruestung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Streckeneigenschaft createZUB_Streckeneigenschaft() {
		ZUB_StreckeneigenschaftImpl zuB_Streckeneigenschaft = new ZUB_StreckeneigenschaftImpl();
		return zuB_Streckeneigenschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup createZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup() {
		ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup = new ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl();
		return zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMArtBedingung createENUMArtBedingungFromString(EDataType eDataType, String initialValue) {
		ENUMArtBedingung result = ENUMArtBedingung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMArtBedingungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAusstiegETCSSperre createENUMAusstiegETCSSperreFromString(EDataType eDataType, String initialValue) {
		ENUMAusstiegETCSSperre result = ENUMAusstiegETCSSperre.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAusstiegETCSSperreToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBalisenhalter createENUMBalisenhalterFromString(EDataType eDataType, String initialValue) {
		ENUMBalisenhalter result = ENUMBalisenhalter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBalisenhalterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPATO createENUMDPATOFromString(EDataType eDataType, String initialValue) {
		ENUMDPATO result = ENUMDPATO.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPATOToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPBezugFunktionalArt createENUMDPBezugFunktionalArtFromString(EDataType eDataType, String initialValue) {
		ENUMDPBezugFunktionalArt result = ENUMDPBezugFunktionalArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPBezugFunktionalArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPLinkArt createENUMDPLinkArtFromString(EDataType eDataType, String initialValue) {
		ENUMDPLinkArt result = ENUMDPLinkArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPLinkArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypArt createENUMDPTypArtFromString(EDataType eDataType, String initialValue) {
		ENUMDPTypArt result = ENUMDPTypArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypESG createENUMDPTypESGFromString(EDataType eDataType, String initialValue) {
		ENUMDPTypESG result = ENUMDPTypESG.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypESGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypGNT createENUMDPTypGNTFromString(EDataType eDataType, String initialValue) {
		ENUMDPTypGNT result = ENUMDPTypGNT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypGNTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypTrans createENUMDPTypTransFromString(EDataType eDataType, String initialValue) {
		ENUMDPTypTrans result = ENUMDPTypTrans.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypTransToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypZBS createENUMDPTypZBSFromString(EDataType eDataType, String initialValue) {
		ENUMDPTypZBS result = ENUMDPTypZBS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypZBSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEinzeldateiArt createENUMEinzeldateiArtFromString(EDataType eDataType, String initialValue) {
		ENUMEinzeldateiArt result = ENUMEinzeldateiArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEinzeldateiArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEnergieEingangArt createENUMEnergieEingangArtFromString(EDataType eDataType, String initialValue) {
		ENUMEnergieEingangArt result = ENUMEnergieEingangArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEnergieEingangArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMETCSKnotenArtSonstige createENUMETCSKnotenArtSonstigeFromString(EDataType eDataType, String initialValue) {
		ENUMETCSKnotenArtSonstige result = ENUMETCSKnotenArtSonstige.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMETCSKnotenArtSonstigeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEVModulArt createENUMEVModulArtFromString(EDataType eDataType, String initialValue) {
		ENUMEVModulArt result = ENUMEVModulArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEVModulArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTGNTPunktart createENUMFTGNTPunktartFromString(EDataType eDataType, String initialValue) {
		ENUMFTGNTPunktart result = ENUMFTGNTPunktart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTGNTPunktartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTHinweisFunktion createENUMFTHinweisFunktionFromString(EDataType eDataType, String initialValue) {
		ENUMFTHinweisFunktion result = ENUMFTHinweisFunktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTHinweisFunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTZBSTyp createENUMFTZBSTypFromString(EDataType eDataType, String initialValue) {
		ENUMFTZBSTyp result = ENUMFTZBSTyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTZBSTypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLEUArt createENUMLEUArtFromString(EDataType eDataType, String initialValue) {
		ENUMLEUArt result = ENUMLEUArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLEUArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMLEVELTR createENUMMLEVELTRFromString(EDataType eDataType, String initialValue) {
		ENUMMLEVELTR result = ENUMMLEVELTR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMLEVELTRToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNIDSTM createENUMNIDSTMFromString(EDataType eDataType, String initialValue) {
		ENUMNIDSTM result = ENUMNIDSTM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNIDSTMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPosition createENUMPositionFromString(EDataType eDataType, String initialValue) {
		ENUMPosition result = ENUMPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSBE createENUMSBEFromString(EDataType eDataType, String initialValue) {
		ENUMSBE result = ENUMSBE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSBEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSpannungArt createENUMSpannungArtFromString(EDataType eDataType, String initialValue) {
		ENUMSpannungArt result = ENUMSpannungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSpannungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStandortangabeBalisenschild createENUMStandortangabeBalisenschildFromString(EDataType eDataType, String initialValue) {
		ENUMStandortangabeBalisenschild result = ENUMStandortangabeBalisenschild.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStandortangabeBalisenschildToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSTZ createENUMSTZFromString(EDataType eDataType, String initialValue) {
		ENUMSTZ result = ENUMSTZ.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSTZToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerbotWBArt createENUMVerbotWBArtFromString(EDataType eDataType, String initialValue) {
		ENUMVerbotWBArt result = ENUMVerbotWBArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerbotWBArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerwendungAlsRueckfall createENUMVerwendungAlsRueckfallFromString(EDataType eDataType, String initialValue) {
		ENUMVerwendungAlsRueckfall result = ENUMVerwendungAlsRueckfall.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerwendungAlsRueckfallToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWAnschluss createENUMWAnschlussFromString(EDataType eDataType, String initialValue) {
		ENUMWAnschluss result = ENUMWAnschluss.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWAnschlussToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZBSReaktion createENUMZBSReaktionFromString(EDataType eDataType, String initialValue) {
		ENUMZBSReaktion result = ENUMZBSReaktion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZBSReaktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Bes_Langer_Einfahrweg_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Bes_Langer_Einfahrweg_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Datenpunkt_EH_EM_Folgesignal_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Datenpunkt_EP_TPI_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Datenpunkt_EP_TPI_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Datenpunkt_TPI_Folgesignal_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Datenpunkt_TPI_Folgesignal_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Einmesspunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Einmesspunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Grenze_Bereich_C_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Grenze_Bereich_C_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnlagenteil_Sonstige_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnlagenteil_Sonstige_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnordnung_Im_DP_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnordnung_Im_DP_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnwendung_Sonst_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnwendung_Sonst_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnzahl_Voll_LEU_Kalkuliert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzahl_Voll_LEU_Kalkuliert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnzeigetext_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzeigetext_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAusgang_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAusgang_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBalise_Geraetestand_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBalise_Geraetestand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBaseline_System_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseline_System_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLinksRechts createBedingung_Weichenlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMLinksRechts)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedingung_Weichenlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.LINKS_RECHTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Strecke_BTS_1_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Strecke_BTS_1_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Strecke_BTS_2_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Strecke_BTS_2_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Strecke_BTS_3_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Strecke_BTS_3_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_ZUB_Bereichsgrenze_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_ZUB_Bereichsgrenze_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_ETCS_Kante_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_ETCS_Kante_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_LEU_Anlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_LEU_Anlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_ZUB_SE_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_ZUB_SE_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_ZUB_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_ZUB_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createD_LEVELTR_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertD_LEVELTR_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDateityp_Binaerdatei_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateityp_Binaerdatei_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDatenpunkt_Beschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatenpunkt_Beschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDatenpunkt_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatenpunkt_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDelta_VGES_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelta_VGES_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDelta_VLES_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelta_VLES_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDelta_VZES_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelta_VZES_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDP_Typ_ETCS_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDP_Typ_ETCS_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDP_Typ_Sonst_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDP_Typ_Sonst_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDP_Typ_V_La_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDP_Typ_V_La_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDWeg_Intervall_200_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_Intervall_200_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDWeg_Intervall_50_200_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_Intervall_50_200_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDWeg_Intervall_50_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWeg_Intervall_50_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMArtBedingung createENUMArtBedingungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMArtBedingungFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMArtBedingung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMArtBedingungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMArtBedingungToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMArtBedingung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAusstiegETCSSperre createENUMAusstiegETCSSperreObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAusstiegETCSSperreFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMAusstiegETCSSperre(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAusstiegETCSSperreObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAusstiegETCSSperreToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMAusstiegETCSSperre(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBalisenhalter createENUMBalisenhalterObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBalisenhalterFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMBalisenhalter(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBalisenhalterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBalisenhalterToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMBalisenhalter(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPATO createENUMDPATOObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPATOFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPATO(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPATOObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPATOToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPATO(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPBezugFunktionalArt createENUMDPBezugFunktionalArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPBezugFunktionalArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPBezugFunktionalArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPBezugFunktionalArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPBezugFunktionalArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPBezugFunktionalArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPLinkArt createENUMDPLinkArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPLinkArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPLinkArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPLinkArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPLinkArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPLinkArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypArt createENUMDPTypArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPTypArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPTypArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypESG createENUMDPTypESGObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPTypESGFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypESG(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypESGObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPTypESGToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypESG(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypGNT createENUMDPTypGNTObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPTypGNTFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypGNT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypGNTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPTypGNTToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypGNT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypTrans createENUMDPTypTransObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPTypTransFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypTrans(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypTransObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPTypTransToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypTrans(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMDPTypZBS createENUMDPTypZBSObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMDPTypZBSFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypZBS(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMDPTypZBSObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMDPTypZBSToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMDPTypZBS(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEinzeldateiArt createENUMEinzeldateiArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMEinzeldateiArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEinzeldateiArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEinzeldateiArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMEinzeldateiArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEinzeldateiArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEnergieEingangArt createENUMEnergieEingangArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMEnergieEingangArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEnergieEingangArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEnergieEingangArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMEnergieEingangArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEnergieEingangArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMETCSKnotenArtSonstige createENUMETCSKnotenArtSonstigeObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMETCSKnotenArtSonstigeFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMETCSKnotenArtSonstige(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMETCSKnotenArtSonstigeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMETCSKnotenArtSonstigeToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMETCSKnotenArtSonstige(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEVModulArt createENUMEVModulArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMEVModulArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEVModulArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEVModulArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMEVModulArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMEVModulArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTGNTPunktart createENUMFTGNTPunktartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFTGNTPunktartFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTGNTPunktart(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTGNTPunktartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFTGNTPunktartToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTGNTPunktart(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTHinweisFunktion createENUMFTHinweisFunktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFTHinweisFunktionFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTHinweisFunktion(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTHinweisFunktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFTHinweisFunktionToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTHinweisFunktion(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFTZBSTyp createENUMFTZBSTypObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFTZBSTypFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTZBSTyp(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFTZBSTypObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFTZBSTypToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMFTZBSTyp(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLEUArt createENUMLEUArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLEUArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMLEUArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLEUArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLEUArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMLEUArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMLEVELTR createENUMMLEVELTRObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMLEVELTRFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMMLEVELTR(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMLEVELTRObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMLEVELTRToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMMLEVELTR(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNIDSTM createENUMNIDSTMObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNIDSTMFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMNIDSTM(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNIDSTMObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNIDSTMToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMNIDSTM(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMPosition createENUMPositionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMPositionFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMPosition(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMPositionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMPositionToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMPosition(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSBE createENUMSBEObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSBEFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSBE(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSBEObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSBEToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSBE(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSpannungArt createENUMSpannungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSpannungArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSpannungArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSpannungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSpannungArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSpannungArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMStandortangabeBalisenschild createENUMStandortangabeBalisenschildObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMStandortangabeBalisenschildFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMStandortangabeBalisenschild(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMStandortangabeBalisenschildObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMStandortangabeBalisenschildToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMStandortangabeBalisenschild(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSTZ createENUMSTZObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSTZFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSTZ(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSTZObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSTZToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMSTZ(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerbotWBArt createENUMVerbotWBArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMVerbotWBArtFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMVerbotWBArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerbotWBArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMVerbotWBArtToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMVerbotWBArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVerwendungAlsRueckfall createENUMVerwendungAlsRueckfallObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMVerwendungAlsRueckfallFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMVerwendungAlsRueckfall(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMVerwendungAlsRueckfallObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMVerwendungAlsRueckfallToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMVerwendungAlsRueckfall(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWAnschluss createENUMWAnschlussObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMWAnschlussFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMWAnschluss(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMWAnschlussObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMWAnschlussToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMWAnschluss(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZBSReaktion createENUMZBSReaktionObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZBSReaktionFromString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMZBSReaktion(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZBSReaktionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZBSReaktionToString(Balisentechnik_ETCSPackage.eINSTANCE.getENUMZBSReaktion(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createESG_Ind_Erlaeuterung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESG_Ind_Erlaeuterung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createESG_Ind_Parameter_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESG_Ind_Parameter_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createESG_Ind_Parameterwert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESG_Ind_Parameterwert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createETCS_Gefahrpunktabstand_Abweichend_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_Gefahrpunktabstand_Abweichend_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createETCS_Paketnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_Paketnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETCS_Par_Erlaeuterung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_Par_Erlaeuterung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETCS_Parametername_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_Parametername_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createETCS_Parameterwert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_Parameterwert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETCS_System_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETCS_System_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEV_Modul_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEV_Modul_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFabrikat_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFabrikat_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFT_ESG_Subtyp_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFT_ESG_Subtyp_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFT_ESG_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFT_ESG_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFT_ETCS_L2_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFT_ETCS_L2_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFW_Teil_Nummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFW_Teil_Nummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGruppen_ID_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGruppen_ID_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHinweis_Balisenbefestigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHinweis_Balisenbefestigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIndividualisierung_Weitere_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndividualisierung_Weitere_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKm_BTS_1_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKm_BTS_1_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKm_BTS_2_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKm_BTS_2_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKm_BTS_3_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKm_BTS_3_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.KILOMETRIERUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKonfigurationskennung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKonfigurationskennung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createL_ACKLEVELTR_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertL_ACKLEVELTR_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLaenge_1_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaenge_1_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLaenge_Ausfuehrungsbereich_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaenge_Ausfuehrungsbereich_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLaenge_Gestufte_V_Signalisierung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaenge_Gestufte_V_Signalisierung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLaenge_Soll_Mind_150_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaenge_Soll_Mind_150_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createLeistungsbedarf_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeistungsbedarf_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createLEU_Ausgang_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEU_Ausgang_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLEU_Modul_Geraetestand_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEU_Modul_Geraetestand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLEU_Modul_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEU_Modul_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLEU_Schaltkasten_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEU_Schaltkasten_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createLfd_Nr_Am_Bezugspunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLfd_Nr_Am_Bezugspunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLink_Distanz_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLink_Distanz_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLLA_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLLA_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neig_1_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neig_1_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neig_Schutzstrecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neig_Schutzstrecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neigung_Mind_150_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neigung_Mind_150_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neigung_Mind_Sig_150_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neigung_Mind_Sig_150_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMassgebende_Neigung_Mind_Sig_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMassgebende_Neigung_Mind_Sig_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMax_Leistung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMax_Leistung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMax_Unterbrechungszeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMax_Unterbrechungszeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMetallteil_Kategorie_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetallteil_Kategorie_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMetallteil_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetallteil_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createModulnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModulnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMontageabweichung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMontageabweichung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNeigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNennleistung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNennleistung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_BG_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_BG_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_C_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_C_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_RBC_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_RBC_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNID_TSR_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNID_TSR_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNummer_Schaltkasten_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNummer_Schaltkasten_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOberstrombegrenzung_Gueterzug_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOberstrombegrenzung_Gueterzug_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOberstrombegrenzung_Reisezug_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOberstrombegrenzung_Reisezug_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPort_Nr_Ausg_Physisch_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPort_Nr_Ausg_Physisch_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPosition_Sonstige_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosition_Sonstige_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPrioritaet_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrioritaet_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createProjektierungsfall_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjektierungsfall_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRBC_ETCS_System_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRBC_ETCS_System_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRBC_SRS_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRBC_SRS_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRekursion_2_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRekursion_2_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRekursion_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRekursion_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRufnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRufnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSchutzstrecke_Erforderlich_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchutzstrecke_Erforderlich_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSchutzstrecke_Vorhanden_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchutzstrecke_Vorhanden_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSolllaenge_Mind_Sig_150_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolllaenge_Mind_Sig_150_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSolllaenge_Mind_Sig_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolllaenge_Mind_Sig_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSonstige_Standortangabe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSonstige_Standortangabe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSpannung_Toleranz_Obere_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpannung_Toleranz_Obere_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSpannung_Toleranz_Untere_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpannung_Toleranz_Untere_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSRS_Version_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSRS_Version_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSystem_Vor_Grenze_Besonders_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystem_Vor_Grenze_Besonders_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTBV_Tunnelbereich_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBV_Tunnelbereich_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTelegramm_Index_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelegramm_Index_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createTelegrammnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelegrammnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createText_Bedingung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertText_Bedingung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextmeldung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextmeldung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUeberbrueckung_EV_Unterbrechung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUeberbrueckung_EV_Unterbrechung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createUeberwachung_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUeberwachung_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUntergruppen_ID_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUntergruppen_ID_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Befehl_R_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Befehl_R_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Befehl_Z_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Befehl_Z_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Frei_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Frei_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Start_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Start_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Ziel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Ziel_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Zul_Strecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Zul_Strecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVBC_Kennung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVBC_Kennung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVBC_NID_C_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVBC_NID_C_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVBC_Timer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVBC_Timer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerbot_Anhalten_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerbot_Anhalten_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVerkuerzter_Abstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerkuerzter_Abstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerwendung_Hilfe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerwendung_Hilfe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerwendung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerwendung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVGR_1_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVGR_1_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVGR_2_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVGR_2_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVGR_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVGR_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVLA_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVLA_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createVorsignalabstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVorsignalabstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVZ_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVZ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMWirkrichtung createWirkrichtung_In_Datenpunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (ENUMWirkrichtung)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.WIRKRICHTUNG_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWirkrichtung_In_Datenpunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.WIRKRICHTUNG_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZBS_La_Bereich_Distanz_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZBS_La_Bereich_Distanz_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZBS_La_Bereich_Geschwindigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZBS_La_Bereich_Geschwindigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZBS_La_Bereich_Laenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZBS_La_Bereich_Laenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZBS_La_Bereich_Neigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZBS_La_Bereich_Neigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZLA_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZLA_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balisentechnik_ETCSPackage getBalisentechnik_ETCSPackage() {
		return (Balisentechnik_ETCSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Balisentechnik_ETCSPackage getPackage() {
		return Balisentechnik_ETCSPackage.eINSTANCE;
	}

} //Balisentechnik_ETCSFactoryImpl
