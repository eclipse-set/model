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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage
 * @generated
 */
public class Balisentechnik_ETCSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Balisentechnik_ETCSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balisentechnik_ETCSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Balisentechnik_ETCSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Balisentechnik_ETCSSwitch<Adapter> modelSwitch =
		new Balisentechnik_ETCSSwitch<Adapter>() {
			@Override
			public Adapter caseAbstand_Bes_Langer_Einfahrweg_TypeClass(Abstand_Bes_Langer_Einfahrweg_TypeClass object) {
				return createAbstand_Bes_Langer_Einfahrweg_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClass(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass object) {
				return createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Datenpunkt_EP_TPI_TypeClass(Abstand_Datenpunkt_EP_TPI_TypeClass object) {
				return createAbstand_Datenpunkt_EP_TPI_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Datenpunkt_TPI_Folgesignal_TypeClass(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass object) {
				return createAbstand_Datenpunkt_TPI_Folgesignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Einmesspunkt_TypeClass(Abstand_Einmesspunkt_TypeClass object) {
				return createAbstand_Einmesspunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Grenze_Bereich_C_TypeClass(Abstand_Grenze_Bereich_C_TypeClass object) {
				return createAbstand_Grenze_Bereich_C_TypeClassAdapter();
			}
			@Override
			public Adapter caseAbstand_Reduziert_TypeClass(Abstand_Reduziert_TypeClass object) {
				return createAbstand_Reduziert_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnlagenteil_Sonstige_TypeClass(Anlagenteil_Sonstige_TypeClass object) {
				return createAnlagenteil_Sonstige_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnordnung_Im_DP_TypeClass(Anordnung_Im_DP_TypeClass object) {
				return createAnordnung_Im_DP_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnwendung_ESG_TypeClass(Anwendung_ESG_TypeClass object) {
				return createAnwendung_ESG_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnwendung_GNT_TypeClass(Anwendung_GNT_TypeClass object) {
				return createAnwendung_GNT_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnwendung_Sonst_TypeClass(Anwendung_Sonst_TypeClass object) {
				return createAnwendung_Sonst_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnwendungssystem_TypeClass(Anwendungssystem_TypeClass object) {
				return createAnwendungssystem_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnzahl_Voll_LEU_Kalkuliert_TypeClass(Anzahl_Voll_LEU_Kalkuliert_TypeClass object) {
				return createAnzahl_Voll_LEU_Kalkuliert_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnzeigetext_TypeClass(Anzeigetext_TypeClass object) {
				return createAnzeigetext_TypeClassAdapter();
			}
			@Override
			public Adapter caseArt_Bedingung_TypeClass(Art_Bedingung_TypeClass object) {
				return createArt_Bedingung_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusgang_Nr_TypeClass(Ausgang_Nr_TypeClass object) {
				return createAusgang_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusrichtung_TypeClass(Ausrichtung_TypeClass object) {
				return createAusrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseAusstieg_ETCS_Sperre_TypeClass(Ausstieg_ETCS_Sperre_TypeClass object) {
				return createAusstieg_ETCS_Sperre_TypeClassAdapter();
			}
			@Override
			public Adapter caseBalise(Balise object) {
				return createBaliseAdapter();
			}
			@Override
			public Adapter caseBalise_Allg_AttributeGroup(Balise_Allg_AttributeGroup object) {
				return createBalise_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBalise_Geraetestand_TypeClass(Balise_Geraetestand_TypeClass object) {
				return createBalise_Geraetestand_TypeClassAdapter();
			}
			@Override
			public Adapter caseBalisenhalter_TypeClass(Balisenhalter_TypeClass object) {
				return createBalisenhalter_TypeClassAdapter();
			}
			@Override
			public Adapter caseBaseline_System_Version_TypeClass(Baseline_System_Version_TypeClass object) {
				return createBaseline_System_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseBedingung_Besondere_AttributeGroup(Bedingung_Besondere_AttributeGroup object) {
				return createBedingung_Besondere_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedingung_PZB_AttributeGroup(Bedingung_PZB_AttributeGroup object) {
				return createBedingung_PZB_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedingung_Signal_AttributeGroup(Bedingung_Signal_AttributeGroup object) {
				return createBedingung_Signal_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedingung_Sonstige_AttributeGroup(Bedingung_Sonstige_AttributeGroup object) {
				return createBedingung_Sonstige_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedingung_Weiche_AttributeGroup(Bedingung_Weiche_AttributeGroup object) {
				return createBedingung_Weiche_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBedingung_Weichenlage_TypeClass(Bedingung_Weichenlage_TypeClass object) {
				return createBedingung_Weichenlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Strecke_BTS_1_TypeClass(Bez_Strecke_BTS_1_TypeClass object) {
				return createBez_Strecke_BTS_1_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Strecke_BTS_2_TypeClass(Bez_Strecke_BTS_2_TypeClass object) {
				return createBez_Strecke_BTS_2_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_Strecke_BTS_3_TypeClass(Bez_Strecke_BTS_3_TypeClass object) {
				return createBez_Strecke_BTS_3_TypeClassAdapter();
			}
			@Override
			public Adapter caseBez_ZUB_Bereichsgrenze_TypeClass(Bez_ZUB_Bereichsgrenze_TypeClass object) {
				return createBez_ZUB_Bereichsgrenze_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_ETCS_Kante_TypeClass(Bezeichnung_ETCS_Kante_TypeClass object) {
				return createBezeichnung_ETCS_Kante_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_LEU_Anlage_TypeClass(Bezeichnung_LEU_Anlage_TypeClass object) {
				return createBezeichnung_LEU_Anlage_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_RBC_TypeClass(Bezeichnung_RBC_TypeClass object) {
				return createBezeichnung_RBC_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_ZUB_SE_TypeClass(Bezeichnung_ZUB_SE_TypeClass object) {
				return createBezeichnung_ZUB_SE_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_ZUB_TypeClass(Bezeichnung_ZUB_TypeClass object) {
				return createBezeichnung_ZUB_TypeClassAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup(Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup object) {
				return createBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup object) {
				return createBgrenze_Nach_L2_Bed_Einstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup object) {
				return createBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup object) {
				return createBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup object) {
				return createBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup object) {
				return createBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup object) {
				return createBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBinaerdaten(Binaerdaten object) {
				return createBinaerdatenAdapter();
			}
			@Override
			public Adapter caseBinaerdaten_Datei_AttributeGroup(Binaerdaten_Datei_AttributeGroup object) {
				return createBinaerdaten_Datei_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseD_LEVELTR_TypeClass(D_LEVELTR_TypeClass object) {
				return createD_LEVELTR_TypeClassAdapter();
			}
			@Override
			public Adapter caseDateiname_TypeClass(Dateiname_TypeClass object) {
				return createDateiname_TypeClassAdapter();
			}
			@Override
			public Adapter caseDateityp_Binaerdatei_TypeClass(Dateityp_Binaerdatei_TypeClass object) {
				return createDateityp_Binaerdatei_TypeClassAdapter();
			}
			@Override
			public Adapter caseDaten_TypeClass(Daten_TypeClass object) {
				return createDaten_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatenpunkt(Datenpunkt object) {
				return createDatenpunktAdapter();
			}
			@Override
			public Adapter caseDatenpunkt_Allg_AttributeGroup(Datenpunkt_Allg_AttributeGroup object) {
				return createDatenpunkt_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDatenpunkt_Beschreibung_TypeClass(Datenpunkt_Beschreibung_TypeClass object) {
				return createDatenpunkt_Beschreibung_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatenpunkt_Einmesspunkt_AttributeGroup(Datenpunkt_Einmesspunkt_AttributeGroup object) {
				return createDatenpunkt_Einmesspunkt_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDatenpunkt_Laenge_TypeClass(Datenpunkt_Laenge_TypeClass object) {
				return createDatenpunkt_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseDatenpunkt_Link(Datenpunkt_Link object) {
				return createDatenpunkt_LinkAdapter();
			}
			@Override
			public Adapter caseDelta_VGES_TypeClass(Delta_VGES_TypeClass object) {
				return createDelta_VGES_TypeClassAdapter();
			}
			@Override
			public Adapter caseDelta_VLES_TypeClass(Delta_VLES_TypeClass object) {
				return createDelta_VLES_TypeClassAdapter();
			}
			@Override
			public Adapter caseDelta_VZES_TypeClass(Delta_VZES_TypeClass object) {
				return createDelta_VZES_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_ATO_TypeClass(DP_ATO_TypeClass object) {
				return createDP_ATO_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Bezug_Funktional_Art_TypeClass(DP_Bezug_Funktional_Art_TypeClass object) {
				return createDP_Bezug_Funktional_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Bezug_Funktional_AttributeGroup(DP_Bezug_Funktional_AttributeGroup object) {
				return createDP_Bezug_Funktional_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_ETCS_Adresse_AttributeGroup(DP_ETCS_Adresse_AttributeGroup object) {
				return createDP_ETCS_Adresse_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Link_Art_TypeClass(DP_Link_Art_TypeClass object) {
				return createDP_Link_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Telegramm_AttributeGroup(DP_Telegramm_AttributeGroup object) {
				return createDP_Telegramm_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Telegramm_ESG_AttributeGroup(DP_Telegramm_ESG_AttributeGroup object) {
				return createDP_Telegramm_ESG_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_Art_TypeClass(DP_Typ_Art_TypeClass object) {
				return createDP_Typ_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_AttributeGroup(DP_Typ_AttributeGroup object) {
				return createDP_Typ_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_ESG_TypeClass(DP_Typ_ESG_TypeClass object) {
				return createDP_Typ_ESG_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_ETCS_TypeClass(DP_Typ_ETCS_TypeClass object) {
				return createDP_Typ_ETCS_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GESG_AttributeGroup(DP_Typ_GESG_AttributeGroup object) {
				return createDP_Typ_GESG_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GETCS_AttributeGroup(DP_Typ_GETCS_AttributeGroup object) {
				return createDP_Typ_GETCS_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GGNT_AttributeGroup(DP_Typ_GGNT_AttributeGroup object) {
				return createDP_Typ_GGNT_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GNT_TypeClass(DP_Typ_GNT_TypeClass object) {
				return createDP_Typ_GNT_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GSonst_AttributeGroup(DP_Typ_GSonst_AttributeGroup object) {
				return createDP_Typ_GSonst_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GTrans_AttributeGroup(DP_Typ_GTrans_AttributeGroup object) {
				return createDP_Typ_GTrans_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_GZBS_AttributeGroup(DP_Typ_GZBS_AttributeGroup object) {
				return createDP_Typ_GZBS_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseDP_Typ_Sonst_TypeClass(DP_Typ_Sonst_TypeClass object) {
				return createDP_Typ_Sonst_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_Trans_TypeClass(DP_Typ_Trans_TypeClass object) {
				return createDP_Typ_Trans_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_V_La_TypeClass(DP_Typ_V_La_TypeClass object) {
				return createDP_Typ_V_La_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Typ_ZBS_TypeClass(DP_Typ_ZBS_TypeClass object) {
				return createDP_Typ_ZBS_TypeClassAdapter();
			}
			@Override
			public Adapter caseDP_Verlinkt_TypeClass(DP_Verlinkt_TypeClass object) {
				return createDP_Verlinkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseDunkelschaltanstoss_TypeClass(Dunkelschaltanstoss_TypeClass object) {
				return createDunkelschaltanstoss_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Intervall_200_TypeClass(DWeg_Intervall_200_TypeClass object) {
				return createDWeg_Intervall_200_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Intervall_50_200_TypeClass(DWeg_Intervall_50_200_TypeClass object) {
				return createDWeg_Intervall_50_200_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Intervall_50_TypeClass(DWeg_Intervall_50_TypeClass object) {
				return createDWeg_Intervall_50_TypeClassAdapter();
			}
			@Override
			public Adapter caseEingang_Gepuffert_TypeClass(Eingang_Gepuffert_TypeClass object) {
				return createEingang_Gepuffert_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinstieg_Erlaubt_TypeClass(Einstieg_Erlaubt_TypeClass object) {
				return createEinstieg_Erlaubt_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinstieg_Ohne_Rueckw_Sig_TypeClass(Einstieg_Ohne_Rueckw_Sig_TypeClass object) {
				return createEinstieg_Ohne_Rueckw_Sig_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinzeldatei_Art_TypeClass(Einzeldatei_Art_TypeClass object) {
				return createEinzeldatei_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseEnergie_Eingang_Art_TypeClass(Energie_Eingang_Art_TypeClass object) {
				return createEnergie_Eingang_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseESG_Ind_Erlaeuterung_TypeClass(ESG_Ind_Erlaeuterung_TypeClass object) {
				return createESG_Ind_Erlaeuterung_TypeClassAdapter();
			}
			@Override
			public Adapter caseESG_Ind_Parameter_TypeClass(ESG_Ind_Parameter_TypeClass object) {
				return createESG_Ind_Parameter_TypeClassAdapter();
			}
			@Override
			public Adapter caseESG_Ind_Parameterwert_TypeClass(ESG_Ind_Parameterwert_TypeClass object) {
				return createESG_Ind_Parameterwert_TypeClassAdapter();
			}
			@Override
			public Adapter caseESG_Individuelle_Merkmale_AttributeGroup(ESG_Individuelle_Merkmale_AttributeGroup object) {
				return createESG_Individuelle_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseESG_Spezifische_Merkmale_AttributeGroup(ESG_Spezifische_Merkmale_AttributeGroup object) {
				return createESG_Spezifische_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_Adresse_AttributeGroup(ETCS_Adresse_AttributeGroup object) {
				return createETCS_Adresse_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_Gefahrpunktabstand_Abweichend_TypeClass(ETCS_Gefahrpunktabstand_Abweichend_TypeClass object) {
				return createETCS_Gefahrpunktabstand_Abweichend_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Kante(ETCS_Kante object) {
				return createETCS_KanteAdapter();
			}
			@Override
			public Adapter caseETCS_Kante_Bezeichnung_AttributeGroup(ETCS_Kante_Bezeichnung_AttributeGroup object) {
				return createETCS_Kante_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_Knoten(ETCS_Knoten object) {
				return createETCS_KnotenAdapter();
			}
			@Override
			public Adapter caseETCS_Knoten_Art_Sonstige_TypeClass(ETCS_Knoten_Art_Sonstige_TypeClass object) {
				return createETCS_Knoten_Art_Sonstige_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Paketnummer_TypeClass(ETCS_Paketnummer_TypeClass object) {
				return createETCS_Paketnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Par_Erlaeuterung_TypeClass(ETCS_Par_Erlaeuterung_TypeClass object) {
				return createETCS_Par_Erlaeuterung_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Parametername_TypeClass(ETCS_Parametername_TypeClass object) {
				return createETCS_Parametername_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Parameterwert_TypeClass(ETCS_Parameterwert_TypeClass object) {
				return createETCS_Parameterwert_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_Richtungsanzeige(ETCS_Richtungsanzeige object) {
				return createETCS_RichtungsanzeigeAdapter();
			}
			@Override
			public Adapter caseETCS_Signal(ETCS_Signal object) {
				return createETCS_SignalAdapter();
			}
			@Override
			public Adapter caseETCS_Signal_Allg_AttributeGroup(ETCS_Signal_Allg_AttributeGroup object) {
				return createETCS_Signal_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_Signal_DWeg_AttributeGroup(ETCS_Signal_DWeg_AttributeGroup object) {
				return createETCS_Signal_DWeg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_Signal_TBV_AttributeGroup(ETCS_Signal_TBV_AttributeGroup object) {
				return createETCS_Signal_TBV_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseETCS_System_Version_TypeClass(ETCS_System_Version_TypeClass object) {
				return createETCS_System_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseETCS_W_Kr(ETCS_W_Kr object) {
				return createETCS_W_KrAdapter();
			}
			@Override
			public Adapter caseETCS_W_Kr_MUKA_AttributeGroup(ETCS_W_Kr_MUKA_AttributeGroup object) {
				return createETCS_W_Kr_MUKA_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseEV_Modul(EV_Modul object) {
				return createEV_ModulAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Art_TypeClass(EV_Modul_Art_TypeClass object) {
				return createEV_Modul_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Ausgang_AttributeGroup(EV_Modul_Ausgang_AttributeGroup object) {
				return createEV_Modul_Ausgang_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Eingang_AttributeGroup(EV_Modul_Eingang_AttributeGroup object) {
				return createEV_Modul_Eingang_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Physisch_AttributeGroup(EV_Modul_Physisch_AttributeGroup object) {
				return createEV_Modul_Physisch_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Typ_TypeClass(EV_Modul_Typ_TypeClass object) {
				return createEV_Modul_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseEV_Modul_Virtuell_AttributeGroup(EV_Modul_Virtuell_AttributeGroup object) {
				return createEV_Modul_Virtuell_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFabrikat_TypeClass(Fabrikat_TypeClass object) {
				return createFabrikat_TypeClassAdapter();
			}
			@Override
			public Adapter caseFachtelegramm(Fachtelegramm object) {
				return createFachtelegrammAdapter();
			}
			@Override
			public Adapter caseFT_Anschaltbedingung(FT_Anschaltbedingung object) {
				return createFT_AnschaltbedingungAdapter();
			}
			@Override
			public Adapter caseFT_ESG_Merkmale_AttributeGroup(FT_ESG_Merkmale_AttributeGroup object) {
				return createFT_ESG_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ESG_Subtyp_TypeClass(FT_ESG_Subtyp_TypeClass object) {
				return createFT_ESG_Subtyp_TypeClassAdapter();
			}
			@Override
			public Adapter caseFT_ESG_Typ_TypeClass(FT_ESG_Typ_TypeClass object) {
				return createFT_ESG_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseFT_ETCS_L2_Merkmale_AttributeGroup(FT_ETCS_L2_Merkmale_AttributeGroup object) {
				return createFT_ETCS_L2_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ETCS_L2_Typ_TypeClass(FT_ETCS_L2_Typ_TypeClass object) {
				return createFT_ETCS_L2_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseFT_ETCS_Trans_Merkmale_AttributeGroup(FT_ETCS_Trans_Merkmale_AttributeGroup object) {
				return createFT_ETCS_Trans_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ETCS_Trans_Paket_41_AttributeGroup(FT_ETCS_Trans_Paket_41_AttributeGroup object) {
				return createFT_ETCS_Trans_Paket_41_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ETCS_Trans_Paket_N_AttributeGroup(FT_ETCS_Trans_Paket_N_AttributeGroup object) {
				return createFT_ETCS_Trans_Paket_N_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_Fahrweg_Teil(FT_Fahrweg_Teil object) {
				return createFT_Fahrweg_TeilAdapter();
			}
			@Override
			public Adapter caseFT_Fahrweg_Teil_Allg_AttributeGroup(FT_Fahrweg_Teil_Allg_AttributeGroup object) {
				return createFT_Fahrweg_Teil_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_Fahrweg_Teile_AttributeGroup(FT_Fahrweg_Teile_AttributeGroup object) {
				return createFT_Fahrweg_Teile_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_GNT_Merkmale_AttributeGroup(FT_GNT_Merkmale_AttributeGroup object) {
				return createFT_GNT_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_GNT_Punktart_TypeClass(FT_GNT_Punktart_TypeClass object) {
				return createFT_GNT_Punktart_TypeClassAdapter();
			}
			@Override
			public Adapter caseFT_Hinweis_Funktion_TypeClass(FT_Hinweis_Funktion_TypeClass object) {
				return createFT_Hinweis_Funktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseFT_ZBS_Merkmale_AttributeGroup(FT_ZBS_Merkmale_AttributeGroup object) {
				return createFT_ZBS_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ZBS_Merkmale_La_AttributeGroup(FT_ZBS_Merkmale_La_AttributeGroup object) {
				return createFT_ZBS_Merkmale_La_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFT_ZBS_Typ_TypeClass(FT_ZBS_Typ_TypeClass object) {
				return createFT_ZBS_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseFW_Teil_Nummer_TypeClass(FW_Teil_Nummer_TypeClass object) {
				return createFW_Teil_Nummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseGruppen_ID_TypeClass(Gruppen_ID_TypeClass object) {
				return createGruppen_ID_TypeClassAdapter();
			}
			@Override
			public Adapter caseHarter_Ausstieg_Aus_L2_TypeClass(Harter_Ausstieg_Aus_L2_TypeClass object) {
				return createHarter_Ausstieg_Aus_L2_TypeClassAdapter();
			}
			@Override
			public Adapter caseHersteller_TypeClass(Hersteller_TypeClass object) {
				return createHersteller_TypeClassAdapter();
			}
			@Override
			public Adapter caseHinweis_Balisenbefestigung_TypeClass(Hinweis_Balisenbefestigung_TypeClass object) {
				return createHinweis_Balisenbefestigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseIndividualisierung_Weitere_TypeClass(Individualisierung_Weitere_TypeClass object) {
				return createIndividualisierung_Weitere_TypeClassAdapter();
			}
			@Override
			public Adapter caseIst_Befahren_TypeClass(Ist_Befahren_TypeClass object) {
				return createIst_Befahren_TypeClassAdapter();
			}
			@Override
			public Adapter caseKm_BTS_1_TypeClass(Km_BTS_1_TypeClass object) {
				return createKm_BTS_1_TypeClassAdapter();
			}
			@Override
			public Adapter caseKm_BTS_2_TypeClass(Km_BTS_2_TypeClass object) {
				return createKm_BTS_2_TypeClassAdapter();
			}
			@Override
			public Adapter caseKm_BTS_3_TypeClass(Km_BTS_3_TypeClass object) {
				return createKm_BTS_3_TypeClassAdapter();
			}
			@Override
			public Adapter caseKnoten_Auf_TOP_Kante_AttributeGroup(Knoten_Auf_TOP_Kante_AttributeGroup object) {
				return createKnoten_Auf_TOP_Kante_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseKonfigurationskennung_TypeClass(Konfigurationskennung_TypeClass object) {
				return createKonfigurationskennung_TypeClassAdapter();
			}
			@Override
			public Adapter caseL_ACKLEVELTR_TypeClass(L_ACKLEVELTR_TypeClass object) {
				return createL_ACKLEVELTR_TypeClassAdapter();
			}
			@Override
			public Adapter caseLaenge_1_TypeClass(Laenge_1_TypeClass object) {
				return createLaenge_1_TypeClassAdapter();
			}
			@Override
			public Adapter caseLaenge_Ausfuehrungsbereich_TypeClass(Laenge_Ausfuehrungsbereich_TypeClass object) {
				return createLaenge_Ausfuehrungsbereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseLaenge_Gestufte_V_Signalisierung_TypeClass(Laenge_Gestufte_V_Signalisierung_TypeClass object) {
				return createLaenge_Gestufte_V_Signalisierung_TypeClassAdapter();
			}
			@Override
			public Adapter caseLaenge_Soll_Mind_150_TypeClass(Laenge_Soll_Mind_150_TypeClass object) {
				return createLaenge_Soll_Mind_150_TypeClassAdapter();
			}
			@Override
			public Adapter caseLeistungsbedarf_TypeClass(Leistungsbedarf_TypeClass object) {
				return createLeistungsbedarf_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Anlage(LEU_Anlage object) {
				return createLEU_AnlageAdapter();
			}
			@Override
			public Adapter caseLEU_Anlage_Allg_AttributeGroup(LEU_Anlage_Allg_AttributeGroup object) {
				return createLEU_Anlage_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Anlage_Art_TypeClass(LEU_Anlage_Art_TypeClass object) {
				return createLEU_Anlage_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Anlage_Bezeichnung_AttributeGroup(LEU_Anlage_Bezeichnung_AttributeGroup object) {
				return createLEU_Anlage_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Ausgang_Nr_TypeClass(LEU_Ausgang_Nr_TypeClass object) {
				return createLEU_Ausgang_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Modul(LEU_Modul object) {
				return createLEU_ModulAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Allg_AttributeGroup(LEU_Modul_Allg_AttributeGroup object) {
				return createLEU_Modul_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Art_TypeClass(LEU_Modul_Art_TypeClass object) {
				return createLEU_Modul_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Ausgang_AttributeGroup(LEU_Modul_Ausgang_AttributeGroup object) {
				return createLEU_Modul_Ausgang_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Bezeichnung_AttributeGroup(LEU_Modul_Bezeichnung_AttributeGroup object) {
				return createLEU_Modul_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Geraetestand_TypeClass(LEU_Modul_Geraetestand_TypeClass object) {
				return createLEU_Modul_Geraetestand_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Modul_Typ_TypeClass(LEU_Modul_Typ_TypeClass object) {
				return createLEU_Modul_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Schaltkasten(LEU_Schaltkasten object) {
				return createLEU_SchaltkastenAdapter();
			}
			@Override
			public Adapter caseLEU_Schaltkasten_Bezeichnung_AttributeGroup(LEU_Schaltkasten_Bezeichnung_AttributeGroup object) {
				return createLEU_Schaltkasten_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Schaltkasten_Energie_AttributeGroup(LEU_Schaltkasten_Energie_AttributeGroup object) {
				return createLEU_Schaltkasten_Energie_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Schaltkasten_Position_AttributeGroup(LEU_Schaltkasten_Position_AttributeGroup object) {
				return createLEU_Schaltkasten_Position_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLEU_Schaltkasten_Typ_TypeClass(LEU_Schaltkasten_Typ_TypeClass object) {
				return createLEU_Schaltkasten_Typ_TypeClassAdapter();
			}
			@Override
			public Adapter caseLEU_Steuernde_AttributeGroup(LEU_Steuernde_AttributeGroup object) {
				return createLEU_Steuernde_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLfd_Nr_Am_Bezugspunkt_TypeClass(Lfd_Nr_Am_Bezugspunkt_TypeClass object) {
				return createLfd_Nr_Am_Bezugspunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseLink_Distanz_TypeClass(Link_Distanz_TypeClass object) {
				return createLink_Distanz_TypeClassAdapter();
			}
			@Override
			public Adapter caseLLA_TypeClass(LLA_TypeClass object) {
				return createLLA_TypeClassAdapter();
			}
			@Override
			public Adapter caseLM_G_TypeClass(LM_G_TypeClass object) {
				return createLM_G_TypeClassAdapter();
			}
			@Override
			public Adapter caseLT_Binaerdatei_Hilfe_AttributeGroup(LT_Binaerdatei_Hilfe_AttributeGroup object) {
				return createLT_Binaerdatei_Hilfe_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLT_Binaerdaten_AttributeGroup(LT_Binaerdaten_AttributeGroup object) {
				return createLT_Binaerdaten_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLuft_Telegramm(Luft_Telegramm object) {
				return createLuft_TelegrammAdapter();
			}
			@Override
			public Adapter caseM_LEVELTR_TypeClass(M_LEVELTR_TypeClass object) {
				return createM_LEVELTR_TypeClassAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neig_1_TypeClass(Massgebende_Neig_1_TypeClass object) {
				return createMassgebende_Neig_1_TypeClassAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neig_Schutzstrecke_TypeClass(Massgebende_Neig_Schutzstrecke_TypeClass object) {
				return createMassgebende_Neig_Schutzstrecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neigung_Mind_150_TypeClass(Massgebende_Neigung_Mind_150_TypeClass object) {
				return createMassgebende_Neigung_Mind_150_TypeClassAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neigung_Mind_Sig_150_TypeClass(Massgebende_Neigung_Mind_Sig_150_TypeClass object) {
				return createMassgebende_Neigung_Mind_Sig_150_TypeClassAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neigung_Mind_Sig_TypeClass(Massgebende_Neigung_Mind_Sig_TypeClass object) {
				return createMassgebende_Neigung_Mind_Sig_TypeClassAdapter();
			}
			@Override
			public Adapter caseMastschild_TypeClass(Mastschild_TypeClass object) {
				return createMastschild_TypeClassAdapter();
			}
			@Override
			public Adapter caseMax_Leistung_TypeClass(Max_Leistung_TypeClass object) {
				return createMax_Leistung_TypeClassAdapter();
			}
			@Override
			public Adapter caseMax_Unterbrechungszeit_TypeClass(Max_Unterbrechungszeit_TypeClass object) {
				return createMax_Unterbrechungszeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseMetallteil_AttributeGroup(Metallteil_AttributeGroup object) {
				return createMetallteil_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseMetallteil_Kategorie_TypeClass(Metallteil_Kategorie_TypeClass object) {
				return createMetallteil_Kategorie_TypeClassAdapter();
			}
			@Override
			public Adapter caseMetallteil_Laenge_TypeClass(Metallteil_Laenge_TypeClass object) {
				return createMetallteil_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseModulnummer_TypeClass(Modulnummer_TypeClass object) {
				return createModulnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseMontageabweichung_TypeClass(Montageabweichung_TypeClass object) {
				return createMontageabweichung_TypeClassAdapter();
			}
			@Override
			public Adapter caseNeigung_TypeClass(Neigung_TypeClass object) {
				return createNeigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseNennleistung_TypeClass(Nennleistung_TypeClass object) {
				return createNennleistung_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_BG_TypeClass(NID_BG_TypeClass object) {
				return createNID_BG_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_C_TypeClass(NID_C_TypeClass object) {
				return createNID_C_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_RBC_TypeClass(NID_RBC_TypeClass object) {
				return createNID_RBC_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_STM_TypeClass(NID_STM_TypeClass object) {
				return createNID_STM_TypeClassAdapter();
			}
			@Override
			public Adapter caseNID_TSR_TypeClass(NID_TSR_TypeClass object) {
				return createNID_TSR_TypeClassAdapter();
			}
			@Override
			public Adapter caseNummer_Schaltkasten_TypeClass(Nummer_Schaltkasten_TypeClass object) {
				return createNummer_Schaltkasten_TypeClassAdapter();
			}
			@Override
			public Adapter caseOberstrombegrenzung_Gueterzug_TypeClass(Oberstrombegrenzung_Gueterzug_TypeClass object) {
				return createOberstrombegrenzung_Gueterzug_TypeClassAdapter();
			}
			@Override
			public Adapter caseOberstrombegrenzung_Reisezug_TypeClass(Oberstrombegrenzung_Reisezug_TypeClass object) {
				return createOberstrombegrenzung_Reisezug_TypeClassAdapter();
			}
			@Override
			public Adapter casePort_Nr_Ausg_Physisch_TypeClass(Port_Nr_Ausg_Physisch_TypeClass object) {
				return createPort_Nr_Ausg_Physisch_TypeClassAdapter();
			}
			@Override
			public Adapter casePosition_Sonstige_TypeClass(Position_Sonstige_TypeClass object) {
				return createPosition_Sonstige_TypeClassAdapter();
			}
			@Override
			public Adapter casePosition_TypeClass(Position_TypeClass object) {
				return createPosition_TypeClassAdapter();
			}
			@Override
			public Adapter casePrimaerquelle_TypeClass(Primaerquelle_TypeClass object) {
				return createPrimaerquelle_TypeClassAdapter();
			}
			@Override
			public Adapter casePrioritaet_TypeClass(Prioritaet_TypeClass object) {
				return createPrioritaet_TypeClassAdapter();
			}
			@Override
			public Adapter caseProg_Datei_Einzel_AttributeGroup(Prog_Datei_Einzel_AttributeGroup object) {
				return createProg_Datei_Einzel_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseProg_Datei_Gruppe(Prog_Datei_Gruppe object) {
				return createProg_Datei_GruppeAdapter();
			}
			@Override
			public Adapter caseProjektierungsfall_TypeClass(Projektierungsfall_TypeClass object) {
				return createProjektierungsfall_TypeClassAdapter();
			}
			@Override
			public Adapter caseRBC(RBC object) {
				return createRBCAdapter();
			}
			@Override
			public Adapter caseRBC_Allg_AttributeGroup(RBC_Allg_AttributeGroup object) {
				return createRBC_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseRBC_Bezeichnung_AttributeGroup(RBC_Bezeichnung_AttributeGroup object) {
				return createRBC_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseRBC_ETCS_System_Version_TypeClass(RBC_ETCS_System_Version_TypeClass object) {
				return createRBC_ETCS_System_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseRBC_SRS_Version_TypeClass(RBC_SRS_Version_TypeClass object) {
				return createRBC_SRS_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseRekursion_2_Nr_TypeClass(Rekursion_2_Nr_TypeClass object) {
				return createRekursion_2_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseRekursion_Nr_TypeClass(Rekursion_Nr_TypeClass object) {
				return createRekursion_Nr_TypeClassAdapter();
			}
			@Override
			public Adapter caseRufnummer_TypeClass(Rufnummer_TypeClass object) {
				return createRufnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseSBE_TypeClass(SBE_TypeClass object) {
				return createSBE_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchutzstrecke_Erforderlich_TypeClass(Schutzstrecke_Erforderlich_TypeClass object) {
				return createSchutzstrecke_Erforderlich_TypeClassAdapter();
			}
			@Override
			public Adapter caseSchutzstrecke_Vorhanden_TypeClass(Schutzstrecke_Vorhanden_TypeClass object) {
				return createSchutzstrecke_Vorhanden_TypeClassAdapter();
			}
			@Override
			public Adapter caseSolllaenge_Mind_Sig_150_TypeClass(Solllaenge_Mind_Sig_150_TypeClass object) {
				return createSolllaenge_Mind_Sig_150_TypeClassAdapter();
			}
			@Override
			public Adapter caseSolllaenge_Mind_Sig_TypeClass(Solllaenge_Mind_Sig_TypeClass object) {
				return createSolllaenge_Mind_Sig_TypeClassAdapter();
			}
			@Override
			public Adapter caseSonstige_Standortangabe_TypeClass(Sonstige_Standortangabe_TypeClass object) {
				return createSonstige_Standortangabe_TypeClassAdapter();
			}
			@Override
			public Adapter caseSpannung_Art_TypeClass(Spannung_Art_TypeClass object) {
				return createSpannung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseSpannung_Toleranz_Obere_TypeClass(Spannung_Toleranz_Obere_TypeClass object) {
				return createSpannung_Toleranz_Obere_TypeClassAdapter();
			}
			@Override
			public Adapter caseSpannung_Toleranz_Untere_TypeClass(Spannung_Toleranz_Untere_TypeClass object) {
				return createSpannung_Toleranz_Untere_TypeClassAdapter();
			}
			@Override
			public Adapter caseSRS_Version_TypeClass(SRS_Version_TypeClass object) {
				return createSRS_Version_TypeClassAdapter();
			}
			@Override
			public Adapter caseStandortangabe_Balisenschild_TypeClass(Standortangabe_Balisenschild_TypeClass object) {
				return createStandortangabe_Balisenschild_TypeClassAdapter();
			}
			@Override
			public Adapter caseStart_W_Element_AttributeGroup(Start_W_Element_AttributeGroup object) {
				return createStart_W_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSTZ_TypeClass(STZ_TypeClass object) {
				return createSTZ_TypeClassAdapter();
			}
			@Override
			public Adapter caseSystem_Vor_Grenze_Besonders_TypeClass(System_Vor_Grenze_Besonders_TypeClass object) {
				return createSystem_Vor_Grenze_Besonders_TypeClassAdapter();
			}
			@Override
			public Adapter caseSystem_Vor_Grenze_TypeClass(System_Vor_Grenze_TypeClass object) {
				return createSystem_Vor_Grenze_TypeClassAdapter();
			}
			@Override
			public Adapter caseTBV_Meldepunkt_TypeClass(TBV_Meldepunkt_TypeClass object) {
				return createTBV_Meldepunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseTBV_Tunnelbereich_Laenge_TypeClass(TBV_Tunnelbereich_Laenge_TypeClass object) {
				return createTBV_Tunnelbereich_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseTBV_Tunnelsignal_TypeClass(TBV_Tunnelsignal_TypeClass object) {
				return createTBV_Tunnelsignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegramm_Index_TypeClass(Telegramm_Index_TypeClass object) {
				return createTelegramm_Index_TypeClassAdapter();
			}
			@Override
			public Adapter caseTelegrammnummer_TypeClass(Telegrammnummer_TypeClass object) {
				return createTelegrammnummer_TypeClassAdapter();
			}
			@Override
			public Adapter caseText_Bedingung_TypeClass(Text_Bedingung_TypeClass object) {
				return createText_Bedingung_TypeClassAdapter();
			}
			@Override
			public Adapter caseTextmeldung_TypeClass(Textmeldung_TypeClass object) {
				return createTextmeldung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberbrueckung_EV_Unterbrechung_TypeClass(Ueberbrueckung_EV_Unterbrechung_TypeClass object) {
				return createUeberbrueckung_EV_Unterbrechung_TypeClassAdapter();
			}
			@Override
			public Adapter caseUeberwachung_Laenge_TypeClass(Ueberwachung_Laenge_TypeClass object) {
				return createUeberwachung_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseUmfahrstrasse_TypeClass(Umfahrstrasse_TypeClass object) {
				return createUmfahrstrasse_TypeClassAdapter();
			}
			@Override
			public Adapter caseUntergruppen_ID_TypeClass(Untergruppen_ID_TypeClass object) {
				return createUntergruppen_ID_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Befehl_R_TypeClass(V_Befehl_R_TypeClass object) {
				return createV_Befehl_R_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Befehl_Z_TypeClass(V_Befehl_Z_TypeClass object) {
				return createV_Befehl_Z_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Frei_TypeClass(V_Frei_TypeClass object) {
				return createV_Frei_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Start_TypeClass(V_Start_TypeClass object) {
				return createV_Start_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Ziel_TypeClass(V_Ziel_TypeClass object) {
				return createV_Ziel_TypeClassAdapter();
			}
			@Override
			public Adapter caseV_Zul_Strecke_TypeClass(V_Zul_Strecke_TypeClass object) {
				return createV_Zul_Strecke_TypeClassAdapter();
			}
			@Override
			public Adapter caseVBC_Kennung_TypeClass(VBC_Kennung_TypeClass object) {
				return createVBC_Kennung_TypeClassAdapter();
			}
			@Override
			public Adapter caseVBC_NID_C_TypeClass(VBC_NID_C_TypeClass object) {
				return createVBC_NID_C_TypeClassAdapter();
			}
			@Override
			public Adapter caseVBC_Setzen_TypeClass(VBC_Setzen_TypeClass object) {
				return createVBC_Setzen_TypeClassAdapter();
			}
			@Override
			public Adapter caseVBC_Timer_TypeClass(VBC_Timer_TypeClass object) {
				return createVBC_Timer_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerbot_Anhalten_TypeClass(Verbot_Anhalten_TypeClass object) {
				return createVerbot_Anhalten_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerbot_Regenerative_Bremse_TypeClass(Verbot_Regenerative_Bremse_TypeClass object) {
				return createVerbot_Regenerative_Bremse_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerbot_WB_Art_TypeClass(Verbot_WB_Art_TypeClass object) {
				return createVerbot_WB_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerkuerzter_Abstand_TypeClass(Verkuerzter_Abstand_TypeClass object) {
				return createVerkuerzter_Abstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerwendung_Als_Rueckfall_TypeClass(Verwendung_Als_Rueckfall_TypeClass object) {
				return createVerwendung_Als_Rueckfall_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerwendung_Hilfe_TypeClass(Verwendung_Hilfe_TypeClass object) {
				return createVerwendung_Hilfe_TypeClassAdapter();
			}
			@Override
			public Adapter caseVerwendung_TypeClass(Verwendung_TypeClass object) {
				return createVerwendung_TypeClassAdapter();
			}
			@Override
			public Adapter caseVGR_1_TypeClass(VGR_1_TypeClass object) {
				return createVGR_1_TypeClassAdapter();
			}
			@Override
			public Adapter caseVGR_2_TypeClass(VGR_2_TypeClass object) {
				return createVGR_2_TypeClassAdapter();
			}
			@Override
			public Adapter caseVGR_TypeClass(VGR_TypeClass object) {
				return createVGR_TypeClassAdapter();
			}
			@Override
			public Adapter caseVLA_TypeClass(VLA_TypeClass object) {
				return createVLA_TypeClassAdapter();
			}
			@Override
			public Adapter caseVorsignalabstand_TypeClass(Vorsignalabstand_TypeClass object) {
				return createVorsignalabstand_TypeClassAdapter();
			}
			@Override
			public Adapter caseVZ_TypeClass(VZ_TypeClass object) {
				return createVZ_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Anschluss_TypeClass(W_Anschluss_TypeClass object) {
				return createW_Anschluss_TypeClassAdapter();
			}
			@Override
			public Adapter caseW_Lage_TypeClass(W_Lage_TypeClass object) {
				return createW_Lage_TypeClassAdapter();
			}
			@Override
			public Adapter caseWirkrichtung_In_Datenpunkt_TypeClass(Wirkrichtung_In_Datenpunkt_TypeClass object) {
				return createWirkrichtung_In_Datenpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseWirksam_TypeClass(Wirksam_TypeClass object) {
				return createWirksam_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_La_Bereich_Distanz_TypeClass(ZBS_La_Bereich_Distanz_TypeClass object) {
				return createZBS_La_Bereich_Distanz_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_La_Bereich_Geschwindigkeit_TypeClass(ZBS_La_Bereich_Geschwindigkeit_TypeClass object) {
				return createZBS_La_Bereich_Geschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_La_Bereich_Laenge_TypeClass(ZBS_La_Bereich_Laenge_TypeClass object) {
				return createZBS_La_Bereich_Laenge_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_La_Bereich_Neigung_TypeClass(ZBS_La_Bereich_Neigung_TypeClass object) {
				return createZBS_La_Bereich_Neigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_Merkmale_AttributeGroup(ZBS_Merkmale_AttributeGroup object) {
				return createZBS_Merkmale_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZBS_Reaktion_TypeClass(ZBS_Reaktion_TypeClass object) {
				return createZBS_Reaktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseZBS_Schutzstrecke(ZBS_Schutzstrecke object) {
				return createZBS_SchutzstreckeAdapter();
			}
			@Override
			public Adapter caseZBS_Schutzstrecke_Allg_AttributeGroup(ZBS_Schutzstrecke_Allg_AttributeGroup object) {
				return createZBS_Schutzstrecke_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZBS_Signal(ZBS_Signal object) {
				return createZBS_SignalAdapter();
			}
			@Override
			public Adapter caseZBS_Signal_Signalabstand_AttributeGroup(ZBS_Signal_Signalabstand_AttributeGroup object) {
				return createZBS_Signal_Signalabstand_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZiel_DP_Ausrichtung_TypeClass(Ziel_DP_Ausrichtung_TypeClass object) {
				return createZiel_DP_Ausrichtung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZiel_Ist_Fahrwegende_TypeClass(Ziel_Ist_Fahrwegende_TypeClass object) {
				return createZiel_Ist_Fahrwegende_TypeClassAdapter();
			}
			@Override
			public Adapter caseZiel_W_Element_AttributeGroup(Ziel_W_Element_AttributeGroup object) {
				return createZiel_W_Element_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZLA_TypeClass(ZLA_TypeClass object) {
				return createZLA_TypeClassAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze(ZUB_Bereichsgrenze object) {
				return createZUB_BereichsgrenzeAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Allg_AttributeGroup(ZUB_Bereichsgrenze_Allg_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Bezeichnung_AttributeGroup(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_ESG_AttributeGroup(ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_ESG_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_GNT_TypeClass(ZUB_Bereichsgrenze_Nach_GNT_TypeClass object) {
				return createZUB_Bereichsgrenze_Nach_GNT_TypeClassAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_L2_AttributeGroup(ZUB_Bereichsgrenze_Nach_L2_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_L2_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup(ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_LZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_LZB_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup(ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_PZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_PZB_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup(ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup(ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup object) {
				return createZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Bgrenze_RBC_Wechsel_AttributeGroup(ZUB_Bgrenze_RBC_Wechsel_AttributeGroup object) {
				return createZUB_Bgrenze_RBC_Wechsel_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_SE_Ausruestung_AttributeGroup(ZUB_SE_Ausruestung_AttributeGroup object) {
				return createZUB_SE_Ausruestung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZUB_Streckeneigenschaft(ZUB_Streckeneigenschaft object) {
				return createZUB_StreckeneigenschaftAdapter();
			}
			@Override
			public Adapter caseZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup object) {
				return createZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt(Basis_Objekt object) {
				return createBasis_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
			}
			@Override
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Bes_Langer_Einfahrweg_TypeClass <em>Abstand Bes Langer Einfahrweg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Bes_Langer_Einfahrweg_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Bes_Langer_Einfahrweg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass <em>Abstand Datenpunkt EH EM Folgesignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Datenpunkt_EH_EM_Folgesignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EP_TPI_TypeClass <em>Abstand Datenpunkt EP TPI Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_EP_TPI_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Datenpunkt_EP_TPI_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_TPI_Folgesignal_TypeClass <em>Abstand Datenpunkt TPI Folgesignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Datenpunkt_TPI_Folgesignal_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Datenpunkt_TPI_Folgesignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Einmesspunkt_TypeClass <em>Abstand Einmesspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Einmesspunkt_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Einmesspunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Grenze_Bereich_C_TypeClass <em>Abstand Grenze Bereich CType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Grenze_Bereich_C_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Grenze_Bereich_C_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Reduziert_TypeClass <em>Abstand Reduziert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Abstand_Reduziert_TypeClass
	 * @generated
	 */
	public Adapter createAbstand_Reduziert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anlagenteil_Sonstige_TypeClass <em>Anlagenteil Sonstige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anlagenteil_Sonstige_TypeClass
	 * @generated
	 */
	public Adapter createAnlagenteil_Sonstige_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anordnung_Im_DP_TypeClass <em>Anordnung Im DP Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anordnung_Im_DP_TypeClass
	 * @generated
	 */
	public Adapter createAnordnung_Im_DP_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_ESG_TypeClass <em>Anwendung ESG Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_ESG_TypeClass
	 * @generated
	 */
	public Adapter createAnwendung_ESG_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_GNT_TypeClass <em>Anwendung GNT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_GNT_TypeClass
	 * @generated
	 */
	public Adapter createAnwendung_GNT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_Sonst_TypeClass <em>Anwendung Sonst Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendung_Sonst_TypeClass
	 * @generated
	 */
	public Adapter createAnwendung_Sonst_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendungssystem_TypeClass <em>Anwendungssystem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendungssystem_TypeClass
	 * @generated
	 */
	public Adapter createAnwendungssystem_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anzahl_Voll_LEU_Kalkuliert_TypeClass <em>Anzahl Voll LEU Kalkuliert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anzahl_Voll_LEU_Kalkuliert_TypeClass
	 * @generated
	 */
	public Adapter createAnzahl_Voll_LEU_Kalkuliert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anzeigetext_TypeClass <em>Anzeigetext Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anzeigetext_TypeClass
	 * @generated
	 */
	public Adapter createAnzeigetext_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Art_Bedingung_TypeClass <em>Art Bedingung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Art_Bedingung_TypeClass
	 * @generated
	 */
	public Adapter createArt_Bedingung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausgang_Nr_TypeClass <em>Ausgang Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausgang_Nr_TypeClass
	 * @generated
	 */
	public Adapter createAusgang_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausrichtung_TypeClass <em>Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausrichtung_TypeClass
	 * @generated
	 */
	public Adapter createAusrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausstieg_ETCS_Sperre_TypeClass <em>Ausstieg ETCS Sperre Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausstieg_ETCS_Sperre_TypeClass
	 * @generated
	 */
	public Adapter createAusstieg_ETCS_Sperre_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise
	 * @generated
	 */
	public Adapter createBaliseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise_Allg_AttributeGroup <em>Balise Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createBalise_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise_Geraetestand_TypeClass <em>Balise Geraetestand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balise_Geraetestand_TypeClass
	 * @generated
	 */
	public Adapter createBalise_Geraetestand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisenhalter_TypeClass <em>Balisenhalter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisenhalter_TypeClass
	 * @generated
	 */
	public Adapter createBalisenhalter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Baseline_System_Version_TypeClass <em>Baseline System Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Baseline_System_Version_TypeClass
	 * @generated
	 */
	public Adapter createBaseline_System_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup <em>Bedingung Besondere Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup
	 * @generated
	 */
	public Adapter createBedingung_Besondere_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup <em>Bedingung PZB Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup
	 * @generated
	 */
	public Adapter createBedingung_PZB_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup <em>Bedingung Signal Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup
	 * @generated
	 */
	public Adapter createBedingung_Signal_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup <em>Bedingung Sonstige Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup
	 * @generated
	 */
	public Adapter createBedingung_Sonstige_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup <em>Bedingung Weiche Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup
	 * @generated
	 */
	public Adapter createBedingung_Weiche_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Weichenlage_TypeClass <em>Bedingung Weichenlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Weichenlage_TypeClass
	 * @generated
	 */
	public Adapter createBedingung_Weichenlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_1_TypeClass <em>Bez Strecke BTS 1Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_1_TypeClass
	 * @generated
	 */
	public Adapter createBez_Strecke_BTS_1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_2_TypeClass <em>Bez Strecke BTS 2Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_2_TypeClass
	 * @generated
	 */
	public Adapter createBez_Strecke_BTS_2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_3_TypeClass <em>Bez Strecke BTS 3Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_3_TypeClass
	 * @generated
	 */
	public Adapter createBez_Strecke_BTS_3_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_ZUB_Bereichsgrenze_TypeClass <em>Bez ZUB Bereichsgrenze Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_ZUB_Bereichsgrenze_TypeClass
	 * @generated
	 */
	public Adapter createBez_ZUB_Bereichsgrenze_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ETCS_Kante_TypeClass <em>Bezeichnung ETCS Kante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ETCS_Kante_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_ETCS_Kante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_LEU_Anlage_TypeClass <em>Bezeichnung LEU Anlage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_LEU_Anlage_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_LEU_Anlage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_RBC_TypeClass <em>Bezeichnung RBC Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_RBC_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_RBC_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ZUB_SE_TypeClass <em>Bezeichnung ZUB SE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ZUB_SE_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_ZUB_SE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ZUB_TypeClass <em>Bezeichnung ZUB Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_ZUB_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_ZUB_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup <em>Bgrenze Nach ESG Bed Ausstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup <em>Bgrenze Nach L2 Bed Einstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_L2_Bed_Einstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup <em>Bgrenze Nach LZB Bed Einstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup <em>Bgrenze Nach Ohne Bed Einstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup <em>Bgrenze Nach PZB Bed Einstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup <em>Bgrenze Nach ZBS Bed Einstieg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_Nach_ZBS_Bed_Einstieg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup <em>Bgrenze RBC Wechsel BTS Kette Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup
	 * @generated
	 */
	public Adapter createBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten <em>Binaerdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten
	 * @generated
	 */
	public Adapter createBinaerdatenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup <em>Binaerdaten Datei Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup
	 * @generated
	 */
	public Adapter createBinaerdaten_Datei_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.D_LEVELTR_TypeClass <em>DLEVELTR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.D_LEVELTR_TypeClass
	 * @generated
	 */
	public Adapter createD_LEVELTR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateiname_TypeClass <em>Dateiname Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateiname_TypeClass
	 * @generated
	 */
	public Adapter createDateiname_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateityp_Binaerdatei_TypeClass <em>Dateityp Binaerdatei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dateityp_Binaerdatei_TypeClass
	 * @generated
	 */
	public Adapter createDateityp_Binaerdatei_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Daten_TypeClass <em>Daten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Daten_TypeClass
	 * @generated
	 */
	public Adapter createDaten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt <em>Datenpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt
	 * @generated
	 */
	public Adapter createDatenpunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup <em>Datenpunkt Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createDatenpunkt_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Beschreibung_TypeClass <em>Datenpunkt Beschreibung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Beschreibung_TypeClass
	 * @generated
	 */
	public Adapter createDatenpunkt_Beschreibung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup <em>Datenpunkt Einmesspunkt Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup
	 * @generated
	 */
	public Adapter createDatenpunkt_Einmesspunkt_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Laenge_TypeClass <em>Datenpunkt Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createDatenpunkt_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Link <em>Datenpunkt Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Link
	 * @generated
	 */
	public Adapter createDatenpunkt_LinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VGES_TypeClass <em>Delta VGES Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VGES_TypeClass
	 * @generated
	 */
	public Adapter createDelta_VGES_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VLES_TypeClass <em>Delta VLES Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VLES_TypeClass
	 * @generated
	 */
	public Adapter createDelta_VLES_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VZES_TypeClass <em>Delta VZES Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VZES_TypeClass
	 * @generated
	 */
	public Adapter createDelta_VZES_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ATO_TypeClass <em>DP ATO Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ATO_TypeClass
	 * @generated
	 */
	public Adapter createDP_ATO_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_Art_TypeClass <em>DP Bezug Funktional Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_Art_TypeClass
	 * @generated
	 */
	public Adapter createDP_Bezug_Funktional_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup <em>DP Bezug Funktional Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Bezug_Funktional_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup <em>DP ETCS Adresse Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_ETCS_Adresse_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Link_Art_TypeClass <em>DP Link Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Link_Art_TypeClass
	 * @generated
	 */
	public Adapter createDP_Link_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup <em>DP Telegramm Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Telegramm_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup <em>DP Telegramm ESG Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Telegramm_ESG_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Art_TypeClass <em>DP Typ Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Art_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup <em>DP Typ Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ESG_TypeClass <em>DP Typ ESG Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ESG_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_ESG_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ETCS_TypeClass <em>DP Typ ETCS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ETCS_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_ETCS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup <em>DP Typ GESG Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GESG_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup <em>DP Typ GETCS Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GETCS_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup <em>DP Typ GGNT Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GGNT_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GNT_TypeClass <em>DP Typ GNT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GNT_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_GNT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup <em>DP Typ GSonst Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GSonst_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup <em>DP Typ GTrans Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GTrans_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GZBS_AttributeGroup <em>DP Typ GZBS Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GZBS_AttributeGroup
	 * @generated
	 */
	public Adapter createDP_Typ_GZBS_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Sonst_TypeClass <em>DP Typ Sonst Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Sonst_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_Sonst_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Trans_TypeClass <em>DP Typ Trans Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_Trans_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_Trans_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_V_La_TypeClass <em>DP Typ VLa Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_V_La_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_V_La_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ZBS_TypeClass <em>DP Typ ZBS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ZBS_TypeClass
	 * @generated
	 */
	public Adapter createDP_Typ_ZBS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Verlinkt_TypeClass <em>DP Verlinkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Verlinkt_TypeClass
	 * @generated
	 */
	public Adapter createDP_Verlinkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dunkelschaltanstoss_TypeClass <em>Dunkelschaltanstoss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Dunkelschaltanstoss_TypeClass
	 * @generated
	 */
	public Adapter createDunkelschaltanstoss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_200_TypeClass <em>DWeg Intervall 200 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_200_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Intervall_200_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_50_200_TypeClass <em>DWeg Intervall 50 200 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_50_200_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Intervall_50_200_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_50_TypeClass <em>DWeg Intervall 50 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.DWeg_Intervall_50_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Intervall_50_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Eingang_Gepuffert_TypeClass <em>Eingang Gepuffert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Eingang_Gepuffert_TypeClass
	 * @generated
	 */
	public Adapter createEingang_Gepuffert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einstieg_Erlaubt_TypeClass <em>Einstieg Erlaubt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einstieg_Erlaubt_TypeClass
	 * @generated
	 */
	public Adapter createEinstieg_Erlaubt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einstieg_Ohne_Rueckw_Sig_TypeClass <em>Einstieg Ohne Rueckw Sig Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einstieg_Ohne_Rueckw_Sig_TypeClass
	 * @generated
	 */
	public Adapter createEinstieg_Ohne_Rueckw_Sig_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einzeldatei_Art_TypeClass <em>Einzeldatei Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Einzeldatei_Art_TypeClass
	 * @generated
	 */
	public Adapter createEinzeldatei_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Energie_Eingang_Art_TypeClass <em>Energie Eingang Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Energie_Eingang_Art_TypeClass
	 * @generated
	 */
	public Adapter createEnergie_Eingang_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Erlaeuterung_TypeClass <em>ESG Ind Erlaeuterung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Erlaeuterung_TypeClass
	 * @generated
	 */
	public Adapter createESG_Ind_Erlaeuterung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Parameter_TypeClass <em>ESG Ind Parameter Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Parameter_TypeClass
	 * @generated
	 */
	public Adapter createESG_Ind_Parameter_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Parameterwert_TypeClass <em>ESG Ind Parameterwert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Ind_Parameterwert_TypeClass
	 * @generated
	 */
	public Adapter createESG_Ind_Parameterwert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup <em>ESG Individuelle Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createESG_Individuelle_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup <em>ESG Spezifische Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createESG_Spezifische_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup <em>ETCS Adresse Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Adresse_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_Adresse_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Gefahrpunktabstand_Abweichend_TypeClass <em>ETCS Gefahrpunktabstand Abweichend Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Gefahrpunktabstand_Abweichend_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Gefahrpunktabstand_Abweichend_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante <em>ETCS Kante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante
	 * @generated
	 */
	public Adapter createETCS_KanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup <em>ETCS Kante Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_Kante_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Knoten <em>ETCS Knoten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Knoten
	 * @generated
	 */
	public Adapter createETCS_KnotenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Knoten_Art_Sonstige_TypeClass <em>ETCS Knoten Art Sonstige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Knoten_Art_Sonstige_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Knoten_Art_Sonstige_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Paketnummer_TypeClass <em>ETCS Paketnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Paketnummer_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Paketnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Par_Erlaeuterung_TypeClass <em>ETCS Par Erlaeuterung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Par_Erlaeuterung_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Par_Erlaeuterung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parametername_TypeClass <em>ETCS Parametername Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parametername_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Parametername_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parameterwert_TypeClass <em>ETCS Parameterwert Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Parameterwert_TypeClass
	 * @generated
	 */
	public Adapter createETCS_Parameterwert_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige <em>ETCS Richtungsanzeige</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige
	 * @generated
	 */
	public Adapter createETCS_RichtungsanzeigeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal <em>ETCS Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal
	 * @generated
	 */
	public Adapter createETCS_SignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup <em>ETCS Signal Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_Signal_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup <em>ETCS Signal DWeg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_Signal_DWeg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup <em>ETCS Signal TBV Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_Signal_TBV_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_System_Version_TypeClass <em>ETCS System Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_System_Version_TypeClass
	 * @generated
	 */
	public Adapter createETCS_System_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_W_Kr <em>ETCS WKr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_W_Kr
	 * @generated
	 */
	public Adapter createETCS_W_KrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup <em>ETCS WKr MUKA Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup
	 * @generated
	 */
	public Adapter createETCS_W_Kr_MUKA_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul <em>EV Modul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul
	 * @generated
	 */
	public Adapter createEV_ModulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Art_TypeClass <em>EV Modul Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Art_TypeClass
	 * @generated
	 */
	public Adapter createEV_Modul_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup <em>EV Modul Ausgang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup
	 * @generated
	 */
	public Adapter createEV_Modul_Ausgang_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup <em>EV Modul Eingang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup
	 * @generated
	 */
	public Adapter createEV_Modul_Eingang_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup <em>EV Modul Physisch Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup
	 * @generated
	 */
	public Adapter createEV_Modul_Physisch_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Typ_TypeClass <em>EV Modul Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Typ_TypeClass
	 * @generated
	 */
	public Adapter createEV_Modul_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup <em>EV Modul Virtuell Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup
	 * @generated
	 */
	public Adapter createEV_Modul_Virtuell_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fabrikat_TypeClass <em>Fabrikat Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fabrikat_TypeClass
	 * @generated
	 */
	public Adapter createFabrikat_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fachtelegramm <em>Fachtelegramm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Fachtelegramm
	 * @generated
	 */
	public Adapter createFachtelegrammAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung <em>FT Anschaltbedingung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung
	 * @generated
	 */
	public Adapter createFT_AnschaltbedingungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup <em>FT ESG Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ESG_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Subtyp_TypeClass <em>FT ESG Subtyp Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Subtyp_TypeClass
	 * @generated
	 */
	public Adapter createFT_ESG_Subtyp_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Typ_TypeClass <em>FT ESG Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ESG_Typ_TypeClass
	 * @generated
	 */
	public Adapter createFT_ESG_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup <em>FT ETCS L2 Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ETCS_L2_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Typ_TypeClass <em>FT ETCS L2 Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Typ_TypeClass
	 * @generated
	 */
	public Adapter createFT_ETCS_L2_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup <em>FT ETCS Trans Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ETCS_Trans_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup <em>FT ETCS Trans Paket 41 Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ETCS_Trans_Paket_41_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_N_AttributeGroup <em>FT ETCS Trans Paket NAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_N_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ETCS_Trans_Paket_N_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil <em>FT Fahrweg Teil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil
	 * @generated
	 */
	public Adapter createFT_Fahrweg_TeilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup <em>FT Fahrweg Teil Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_Fahrweg_Teil_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup <em>FT Fahrweg Teile Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_Fahrweg_Teile_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup <em>FT GNT Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_GNT_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Punktart_TypeClass <em>FT GNT Punktart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Punktart_TypeClass
	 * @generated
	 */
	public Adapter createFT_GNT_Punktart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Hinweis_Funktion_TypeClass <em>FT Hinweis Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Hinweis_Funktion_TypeClass
	 * @generated
	 */
	public Adapter createFT_Hinweis_Funktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup <em>FT ZBS Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ZBS_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup <em>FT ZBS Merkmale La Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup
	 * @generated
	 */
	public Adapter createFT_ZBS_Merkmale_La_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass <em>FT ZBS Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass
	 * @generated
	 */
	public Adapter createFT_ZBS_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FW_Teil_Nummer_TypeClass <em>FW Teil Nummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.FW_Teil_Nummer_TypeClass
	 * @generated
	 */
	public Adapter createFW_Teil_Nummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Gruppen_ID_TypeClass <em>Gruppen ID Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Gruppen_ID_TypeClass
	 * @generated
	 */
	public Adapter createGruppen_ID_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Harter_Ausstieg_Aus_L2_TypeClass <em>Harter Ausstieg Aus L2 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Harter_Ausstieg_Aus_L2_TypeClass
	 * @generated
	 */
	public Adapter createHarter_Ausstieg_Aus_L2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Hersteller_TypeClass <em>Hersteller Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Hersteller_TypeClass
	 * @generated
	 */
	public Adapter createHersteller_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Hinweis_Balisenbefestigung_TypeClass <em>Hinweis Balisenbefestigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Hinweis_Balisenbefestigung_TypeClass
	 * @generated
	 */
	public Adapter createHinweis_Balisenbefestigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Individualisierung_Weitere_TypeClass <em>Individualisierung Weitere Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Individualisierung_Weitere_TypeClass
	 * @generated
	 */
	public Adapter createIndividualisierung_Weitere_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ist_Befahren_TypeClass <em>Ist Befahren Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ist_Befahren_TypeClass
	 * @generated
	 */
	public Adapter createIst_Befahren_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_1_TypeClass <em>Km BTS 1Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_1_TypeClass
	 * @generated
	 */
	public Adapter createKm_BTS_1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_2_TypeClass <em>Km BTS 2Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_2_TypeClass
	 * @generated
	 */
	public Adapter createKm_BTS_2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_3_TypeClass <em>Km BTS 3Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_3_TypeClass
	 * @generated
	 */
	public Adapter createKm_BTS_3_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup <em>Knoten Auf TOP Kante Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup
	 * @generated
	 */
	public Adapter createKnoten_Auf_TOP_Kante_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Konfigurationskennung_TypeClass <em>Konfigurationskennung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Konfigurationskennung_TypeClass
	 * @generated
	 */
	public Adapter createKonfigurationskennung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.L_ACKLEVELTR_TypeClass <em>LACKLEVELTR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.L_ACKLEVELTR_TypeClass
	 * @generated
	 */
	public Adapter createL_ACKLEVELTR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_1_TypeClass <em>Laenge 1Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_1_TypeClass
	 * @generated
	 */
	public Adapter createLaenge_1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Ausfuehrungsbereich_TypeClass <em>Laenge Ausfuehrungsbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Ausfuehrungsbereich_TypeClass
	 * @generated
	 */
	public Adapter createLaenge_Ausfuehrungsbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Gestufte_V_Signalisierung_TypeClass <em>Laenge Gestufte VSignalisierung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Gestufte_V_Signalisierung_TypeClass
	 * @generated
	 */
	public Adapter createLaenge_Gestufte_V_Signalisierung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Soll_Mind_150_TypeClass <em>Laenge Soll Mind 150 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Soll_Mind_150_TypeClass
	 * @generated
	 */
	public Adapter createLaenge_Soll_Mind_150_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Leistungsbedarf_TypeClass <em>Leistungsbedarf Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Leistungsbedarf_TypeClass
	 * @generated
	 */
	public Adapter createLeistungsbedarf_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage <em>LEU Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage
	 * @generated
	 */
	public Adapter createLEU_AnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup <em>LEU Anlage Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Anlage_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Art_TypeClass <em>LEU Anlage Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Art_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Anlage_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup <em>LEU Anlage Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Anlage_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass <em>LEU Ausgang Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Ausgang_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul <em>LEU Modul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul
	 * @generated
	 */
	public Adapter createLEU_ModulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup <em>LEU Modul Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Modul_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Art_TypeClass <em>LEU Modul Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Art_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Modul_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup <em>LEU Modul Ausgang Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Modul_Ausgang_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup <em>LEU Modul Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Modul_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Geraetestand_TypeClass <em>LEU Modul Geraetestand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Geraetestand_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Modul_Geraetestand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Typ_TypeClass <em>LEU Modul Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Modul_Typ_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Modul_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten <em>LEU Schaltkasten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten
	 * @generated
	 */
	public Adapter createLEU_SchaltkastenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup <em>LEU Schaltkasten Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Schaltkasten_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup <em>LEU Schaltkasten Energie Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Schaltkasten_Energie_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup <em>LEU Schaltkasten Position Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Schaltkasten_Position_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Typ_TypeClass <em>LEU Schaltkasten Typ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Typ_TypeClass
	 * @generated
	 */
	public Adapter createLEU_Schaltkasten_Typ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup <em>LEU Steuernde Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup
	 * @generated
	 */
	public Adapter createLEU_Steuernde_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Lfd_Nr_Am_Bezugspunkt_TypeClass <em>Lfd Nr Am Bezugspunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Lfd_Nr_Am_Bezugspunkt_TypeClass
	 * @generated
	 */
	public Adapter createLfd_Nr_Am_Bezugspunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Link_Distanz_TypeClass <em>Link Distanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Link_Distanz_TypeClass
	 * @generated
	 */
	public Adapter createLink_Distanz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LLA_TypeClass <em>LLA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LLA_TypeClass
	 * @generated
	 */
	public Adapter createLLA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LM_G_TypeClass <em>LM GType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LM_G_TypeClass
	 * @generated
	 */
	public Adapter createLM_G_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup <em>LT Binaerdatei Hilfe Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup
	 * @generated
	 */
	public Adapter createLT_Binaerdatei_Hilfe_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup <em>LT Binaerdaten Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup
	 * @generated
	 */
	public Adapter createLT_Binaerdaten_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm <em>Luft Telegramm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Luft_Telegramm
	 * @generated
	 */
	public Adapter createLuft_TelegrammAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.M_LEVELTR_TypeClass <em>MLEVELTR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.M_LEVELTR_TypeClass
	 * @generated
	 */
	public Adapter createM_LEVELTR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neig_1_TypeClass <em>Massgebende Neig 1Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neig_1_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neig_1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neig_Schutzstrecke_TypeClass <em>Massgebende Neig Schutzstrecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neig_Schutzstrecke_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neig_Schutzstrecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_150_TypeClass <em>Massgebende Neigung Mind 150 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_150_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neigung_Mind_150_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_150_TypeClass <em>Massgebende Neigung Mind Sig 150 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_150_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neigung_Mind_Sig_150_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_TypeClass <em>Massgebende Neigung Mind Sig Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_Sig_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neigung_Mind_Sig_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Mastschild_TypeClass <em>Mastschild Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Mastschild_TypeClass
	 * @generated
	 */
	public Adapter createMastschild_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Max_Leistung_TypeClass <em>Max Leistung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Max_Leistung_TypeClass
	 * @generated
	 */
	public Adapter createMax_Leistung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Max_Unterbrechungszeit_TypeClass <em>Max Unterbrechungszeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Max_Unterbrechungszeit_TypeClass
	 * @generated
	 */
	public Adapter createMax_Unterbrechungszeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_AttributeGroup <em>Metallteil Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_AttributeGroup
	 * @generated
	 */
	public Adapter createMetallteil_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Kategorie_TypeClass <em>Metallteil Kategorie Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Kategorie_TypeClass
	 * @generated
	 */
	public Adapter createMetallteil_Kategorie_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Laenge_TypeClass <em>Metallteil Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createMetallteil_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Modulnummer_TypeClass <em>Modulnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Modulnummer_TypeClass
	 * @generated
	 */
	public Adapter createModulnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Montageabweichung_TypeClass <em>Montageabweichung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Montageabweichung_TypeClass
	 * @generated
	 */
	public Adapter createMontageabweichung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Neigung_TypeClass <em>Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Neigung_TypeClass
	 * @generated
	 */
	public Adapter createNeigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nennleistung_TypeClass <em>Nennleistung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nennleistung_TypeClass
	 * @generated
	 */
	public Adapter createNennleistung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_BG_TypeClass <em>NID BG Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_BG_TypeClass
	 * @generated
	 */
	public Adapter createNID_BG_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_C_TypeClass <em>NID CType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_C_TypeClass
	 * @generated
	 */
	public Adapter createNID_C_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_RBC_TypeClass <em>NID RBC Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_RBC_TypeClass
	 * @generated
	 */
	public Adapter createNID_RBC_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_STM_TypeClass <em>NID STM Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_STM_TypeClass
	 * @generated
	 */
	public Adapter createNID_STM_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_TSR_TypeClass <em>NID TSR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_TSR_TypeClass
	 * @generated
	 */
	public Adapter createNID_TSR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nummer_Schaltkasten_TypeClass <em>Nummer Schaltkasten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nummer_Schaltkasten_TypeClass
	 * @generated
	 */
	public Adapter createNummer_Schaltkasten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Oberstrombegrenzung_Gueterzug_TypeClass <em>Oberstrombegrenzung Gueterzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Oberstrombegrenzung_Gueterzug_TypeClass
	 * @generated
	 */
	public Adapter createOberstrombegrenzung_Gueterzug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Oberstrombegrenzung_Reisezug_TypeClass <em>Oberstrombegrenzung Reisezug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Oberstrombegrenzung_Reisezug_TypeClass
	 * @generated
	 */
	public Adapter createOberstrombegrenzung_Reisezug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Port_Nr_Ausg_Physisch_TypeClass <em>Port Nr Ausg Physisch Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Port_Nr_Ausg_Physisch_TypeClass
	 * @generated
	 */
	public Adapter createPort_Nr_Ausg_Physisch_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_Sonstige_TypeClass <em>Position Sonstige Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_Sonstige_TypeClass
	 * @generated
	 */
	public Adapter createPosition_Sonstige_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_TypeClass <em>Position Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Position_TypeClass
	 * @generated
	 */
	public Adapter createPosition_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Primaerquelle_TypeClass <em>Primaerquelle Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Primaerquelle_TypeClass
	 * @generated
	 */
	public Adapter createPrimaerquelle_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prioritaet_TypeClass <em>Prioritaet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prioritaet_TypeClass
	 * @generated
	 */
	public Adapter createPrioritaet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup <em>Prog Datei Einzel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup
	 * @generated
	 */
	public Adapter createProg_Datei_Einzel_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Gruppe <em>Prog Datei Gruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Prog_Datei_Gruppe
	 * @generated
	 */
	public Adapter createProg_Datei_GruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Projektierungsfall_TypeClass <em>Projektierungsfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Projektierungsfall_TypeClass
	 * @generated
	 */
	public Adapter createProjektierungsfall_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC <em>RBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC
	 * @generated
	 */
	public Adapter createRBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Allg_AttributeGroup <em>RBC Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createRBC_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Bezeichnung_AttributeGroup <em>RBC Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createRBC_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_ETCS_System_Version_TypeClass <em>RBC ETCS System Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_ETCS_System_Version_TypeClass
	 * @generated
	 */
	public Adapter createRBC_ETCS_System_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_SRS_Version_TypeClass <em>RBC SRS Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_SRS_Version_TypeClass
	 * @generated
	 */
	public Adapter createRBC_SRS_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_2_Nr_TypeClass <em>Rekursion 2Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_2_Nr_TypeClass
	 * @generated
	 */
	public Adapter createRekursion_2_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_Nr_TypeClass <em>Rekursion Nr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rekursion_Nr_TypeClass
	 * @generated
	 */
	public Adapter createRekursion_Nr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rufnummer_TypeClass <em>Rufnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Rufnummer_TypeClass
	 * @generated
	 */
	public Adapter createRufnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.SBE_TypeClass <em>SBE Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.SBE_TypeClass
	 * @generated
	 */
	public Adapter createSBE_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Schutzstrecke_Erforderlich_TypeClass <em>Schutzstrecke Erforderlich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Schutzstrecke_Erforderlich_TypeClass
	 * @generated
	 */
	public Adapter createSchutzstrecke_Erforderlich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Schutzstrecke_Vorhanden_TypeClass <em>Schutzstrecke Vorhanden Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Schutzstrecke_Vorhanden_TypeClass
	 * @generated
	 */
	public Adapter createSchutzstrecke_Vorhanden_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_150_TypeClass <em>Solllaenge Mind Sig 150 Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_150_TypeClass
	 * @generated
	 */
	public Adapter createSolllaenge_Mind_Sig_150_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_TypeClass <em>Solllaenge Mind Sig Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Solllaenge_Mind_Sig_TypeClass
	 * @generated
	 */
	public Adapter createSolllaenge_Mind_Sig_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Sonstige_Standortangabe_TypeClass <em>Sonstige Standortangabe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Sonstige_Standortangabe_TypeClass
	 * @generated
	 */
	public Adapter createSonstige_Standortangabe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Art_TypeClass <em>Spannung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Art_TypeClass
	 * @generated
	 */
	public Adapter createSpannung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Obere_TypeClass <em>Spannung Toleranz Obere Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Obere_TypeClass
	 * @generated
	 */
	public Adapter createSpannung_Toleranz_Obere_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Untere_TypeClass <em>Spannung Toleranz Untere Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Untere_TypeClass
	 * @generated
	 */
	public Adapter createSpannung_Toleranz_Untere_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.SRS_Version_TypeClass <em>SRS Version Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.SRS_Version_TypeClass
	 * @generated
	 */
	public Adapter createSRS_Version_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Standortangabe_Balisenschild_TypeClass <em>Standortangabe Balisenschild Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Standortangabe_Balisenschild_TypeClass
	 * @generated
	 */
	public Adapter createStandortangabe_Balisenschild_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Start_W_Element_AttributeGroup <em>Start WElement Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Start_W_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createStart_W_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.STZ_TypeClass <em>STZ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.STZ_TypeClass
	 * @generated
	 */
	public Adapter createSTZ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass <em>System Vor Grenze Besonders Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass
	 * @generated
	 */
	public Adapter createSystem_Vor_Grenze_Besonders_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass <em>System Vor Grenze Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass
	 * @generated
	 */
	public Adapter createSystem_Vor_Grenze_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Meldepunkt_TypeClass <em>TBV Meldepunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Meldepunkt_TypeClass
	 * @generated
	 */
	public Adapter createTBV_Meldepunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Tunnelbereich_Laenge_TypeClass <em>TBV Tunnelbereich Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Tunnelbereich_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createTBV_Tunnelbereich_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Tunnelsignal_TypeClass <em>TBV Tunnelsignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.TBV_Tunnelsignal_TypeClass
	 * @generated
	 */
	public Adapter createTBV_Tunnelsignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Telegramm_Index_TypeClass <em>Telegramm Index Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Telegramm_Index_TypeClass
	 * @generated
	 */
	public Adapter createTelegramm_Index_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Telegrammnummer_TypeClass <em>Telegrammnummer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Telegrammnummer_TypeClass
	 * @generated
	 */
	public Adapter createTelegrammnummer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Text_Bedingung_TypeClass <em>Text Bedingung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Text_Bedingung_TypeClass
	 * @generated
	 */
	public Adapter createText_Bedingung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Textmeldung_TypeClass <em>Textmeldung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Textmeldung_TypeClass
	 * @generated
	 */
	public Adapter createTextmeldung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ueberbrueckung_EV_Unterbrechung_TypeClass <em>Ueberbrueckung EV Unterbrechung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ueberbrueckung_EV_Unterbrechung_TypeClass
	 * @generated
	 */
	public Adapter createUeberbrueckung_EV_Unterbrechung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ueberwachung_Laenge_TypeClass <em>Ueberwachung Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ueberwachung_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createUeberwachung_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Umfahrstrasse_TypeClass <em>Umfahrstrasse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Umfahrstrasse_TypeClass
	 * @generated
	 */
	public Adapter createUmfahrstrasse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Untergruppen_ID_TypeClass <em>Untergruppen ID Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Untergruppen_ID_TypeClass
	 * @generated
	 */
	public Adapter createUntergruppen_ID_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Befehl_R_TypeClass <em>VBefehl RType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Befehl_R_TypeClass
	 * @generated
	 */
	public Adapter createV_Befehl_R_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Befehl_Z_TypeClass <em>VBefehl ZType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Befehl_Z_TypeClass
	 * @generated
	 */
	public Adapter createV_Befehl_Z_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Frei_TypeClass <em>VFrei Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Frei_TypeClass
	 * @generated
	 */
	public Adapter createV_Frei_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Start_TypeClass <em>VStart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Start_TypeClass
	 * @generated
	 */
	public Adapter createV_Start_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Ziel_TypeClass <em>VZiel Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Ziel_TypeClass
	 * @generated
	 */
	public Adapter createV_Ziel_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Zul_Strecke_TypeClass <em>VZul Strecke Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Zul_Strecke_TypeClass
	 * @generated
	 */
	public Adapter createV_Zul_Strecke_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Kennung_TypeClass <em>VBC Kennung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Kennung_TypeClass
	 * @generated
	 */
	public Adapter createVBC_Kennung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_NID_C_TypeClass <em>VBC NID CType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_NID_C_TypeClass
	 * @generated
	 */
	public Adapter createVBC_NID_C_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Setzen_TypeClass <em>VBC Setzen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Setzen_TypeClass
	 * @generated
	 */
	public Adapter createVBC_Setzen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Timer_TypeClass <em>VBC Timer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Timer_TypeClass
	 * @generated
	 */
	public Adapter createVBC_Timer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_Anhalten_TypeClass <em>Verbot Anhalten Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_Anhalten_TypeClass
	 * @generated
	 */
	public Adapter createVerbot_Anhalten_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_Regenerative_Bremse_TypeClass <em>Verbot Regenerative Bremse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_Regenerative_Bremse_TypeClass
	 * @generated
	 */
	public Adapter createVerbot_Regenerative_Bremse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_WB_Art_TypeClass <em>Verbot WB Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verbot_WB_Art_TypeClass
	 * @generated
	 */
	public Adapter createVerbot_WB_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verkuerzter_Abstand_TypeClass <em>Verkuerzter Abstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verkuerzter_Abstand_TypeClass
	 * @generated
	 */
	public Adapter createVerkuerzter_Abstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_Als_Rueckfall_TypeClass <em>Verwendung Als Rueckfall Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_Als_Rueckfall_TypeClass
	 * @generated
	 */
	public Adapter createVerwendung_Als_Rueckfall_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_Hilfe_TypeClass <em>Verwendung Hilfe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_Hilfe_TypeClass
	 * @generated
	 */
	public Adapter createVerwendung_Hilfe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_TypeClass <em>Verwendung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verwendung_TypeClass
	 * @generated
	 */
	public Adapter createVerwendung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_1_TypeClass <em>VGR 1Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_1_TypeClass
	 * @generated
	 */
	public Adapter createVGR_1_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_2_TypeClass <em>VGR 2Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_2_TypeClass
	 * @generated
	 */
	public Adapter createVGR_2_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_TypeClass <em>VGR Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_TypeClass
	 * @generated
	 */
	public Adapter createVGR_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VLA_TypeClass <em>VLA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VLA_TypeClass
	 * @generated
	 */
	public Adapter createVLA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Vorsignalabstand_TypeClass <em>Vorsignalabstand Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Vorsignalabstand_TypeClass
	 * @generated
	 */
	public Adapter createVorsignalabstand_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.VZ_TypeClass <em>VZ Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.VZ_TypeClass
	 * @generated
	 */
	public Adapter createVZ_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Anschluss_TypeClass <em>WAnschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Anschluss_TypeClass
	 * @generated
	 */
	public Adapter createW_Anschluss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Lage_TypeClass <em>WLage Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Lage_TypeClass
	 * @generated
	 */
	public Adapter createW_Lage_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirkrichtung_In_Datenpunkt_TypeClass <em>Wirkrichtung In Datenpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirkrichtung_In_Datenpunkt_TypeClass
	 * @generated
	 */
	public Adapter createWirkrichtung_In_Datenpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirksam_TypeClass <em>Wirksam Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirksam_TypeClass
	 * @generated
	 */
	public Adapter createWirksam_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Distanz_TypeClass <em>ZBS La Bereich Distanz Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Distanz_TypeClass
	 * @generated
	 */
	public Adapter createZBS_La_Bereich_Distanz_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Geschwindigkeit_TypeClass <em>ZBS La Bereich Geschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Geschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createZBS_La_Bereich_Geschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Laenge_TypeClass <em>ZBS La Bereich Laenge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Laenge_TypeClass
	 * @generated
	 */
	public Adapter createZBS_La_Bereich_Laenge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Neigung_TypeClass <em>ZBS La Bereich Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Neigung_TypeClass
	 * @generated
	 */
	public Adapter createZBS_La_Bereich_Neigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup <em>ZBS Merkmale Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup
	 * @generated
	 */
	public Adapter createZBS_Merkmale_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Reaktion_TypeClass <em>ZBS Reaktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Reaktion_TypeClass
	 * @generated
	 */
	public Adapter createZBS_Reaktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke <em>ZBS Schutzstrecke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke
	 * @generated
	 */
	public Adapter createZBS_SchutzstreckeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup <em>ZBS Schutzstrecke Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZBS_Schutzstrecke_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal <em>ZBS Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal
	 * @generated
	 */
	public Adapter createZBS_SignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup <em>ZBS Signal Signalabstand Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup
	 * @generated
	 */
	public Adapter createZBS_Signal_Signalabstand_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_DP_Ausrichtung_TypeClass <em>Ziel DP Ausrichtung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_DP_Ausrichtung_TypeClass
	 * @generated
	 */
	public Adapter createZiel_DP_Ausrichtung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_Ist_Fahrwegende_TypeClass <em>Ziel Ist Fahrwegende Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_Ist_Fahrwegende_TypeClass
	 * @generated
	 */
	public Adapter createZiel_Ist_Fahrwegende_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup <em>Ziel WElement Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup
	 * @generated
	 */
	public Adapter createZiel_W_Element_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZLA_TypeClass <em>ZLA Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZLA_TypeClass
	 * @generated
	 */
	public Adapter createZLA_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze <em>ZUB Bereichsgrenze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze
	 * @generated
	 */
	public Adapter createZUB_BereichsgrenzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup <em>ZUB Bereichsgrenze Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup <em>ZUB Bereichsgrenze Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup <em>ZUB Bereichsgrenze Nach ESG Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_ESG_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_GNT_TypeClass <em>ZUB Bereichsgrenze Nach GNT Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_GNT_TypeClass
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_GNT_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup <em>ZUB Bereichsgrenze Nach L2 Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_L2_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup <em>ZUB Bereichsgrenze Nach L2 Von ESG Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup <em>ZUB Bereichsgrenze Nach LZB Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_LZB_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup <em>ZUB Bereichsgrenze Nach Ohne Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup <em>ZUB Bereichsgrenze Nach PZB Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_PZB_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup <em>ZUB Bereichsgrenze Nach Sonstige Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup <em>ZUB Bereichsgrenze Nach ZBS Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ZBS_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bereichsgrenze_Nach_ZBS_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup <em>ZUB Bgrenze RBC Wechsel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Bgrenze_RBC_Wechsel_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup <em>ZUB SE Ausruestung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_SE_Ausruestung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft <em>ZUB Streckeneigenschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft
	 * @generated
	 */
	public Adapter createZUB_StreckeneigenschaftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup <em>ZUB Streckeneigenschaft Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Balisentechnik_ETCSAdapterFactory
