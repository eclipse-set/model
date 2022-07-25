/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.util.Balisentechnik_ETCSValidator;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.model1902.Block.BlockPackage;

import org.eclipse.set.model.model1902.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model1902.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model1902.Gleis.GleisPackage;

import org.eclipse.set.model.model1902.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

import org.eclipse.set.model.model1902.Nahbedienbereich.impl.NahbedienbereichPackageImpl;

import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

import org.eclipse.set.model.model1902.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;

import org.eclipse.set.model.model1902.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

import org.eclipse.set.model.model1902.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model1902.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model1902.Verweise.VerweisePackage;

import org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model1902.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Balisentechnik_ETCSPackageImpl extends EPackageImpl implements Balisentechnik_ETCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "Balisentechnik_ETCS.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstand_Grenze_Bereich_C_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlagenteil_Sonstige_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anordnung_Im_DP_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anwendung_Sonst_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anwendungssystem_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anzahl_Voll_LEU_Kalkuliert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anzeigetext_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass art_Bedingung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausgang_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausstieg_ETCS_Sperre_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baliseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balise_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseline_SRS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_Besondere_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_PZB_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_Signal_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_Sonstige_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_Weiche_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedingung_Weichenlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Strecke_BTS_1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Strecke_BTS_2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Strecke_BTS_3_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_ZUB_Bereichsgrenze_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_ETCS_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_LEU_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_ZUB_SE_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_ZUB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaerdateiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaerdatei_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bremsweg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d_LEVELTR_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateiname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateityp_Binaerdatei_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenpunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenpunkt_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenpunkt_Beschreibung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenpunkt_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenpunkt_LinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delta_VGES_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delta_VLES_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delta_VZES_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Bezug_Betrieblich_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Bezug_Betrieblich_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_ETCS_Adresse_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Link_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Telegramm_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Telegramm_ESG_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_ESG_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_ETCS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GESG_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GETCS_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GGNT_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GNT_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GSonst_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GTrans_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_GZBS_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_Sonst_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_Trans_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_V_La_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dP_Typ_ZBS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dunkelschaltanstoss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Intervall_200_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Intervall_50_200_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Intervall_50_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eingang_Gepuffert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einstieg_Erlaubt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einstieg_Ohne_Rueckw_Sig_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einzeldatei_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energie_Eingang_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esG_Ind_Erlaeuterung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esG_Ind_Parameter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esG_Ind_Parameterwert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esG_Individuelle_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esG_Spezifische_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Adresse_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Adresse_Kennung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Adresse_NID_BG_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Adresse_NID_C_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Kante_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Kennung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_KnotenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Knoten_Art_Sonstige_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Paketnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Par_Erlaeuterung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Parametername_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Parameterwert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_SignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Signal_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Signal_DWeg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_Signal_TBV_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_W_KrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_W_Kr_MUKA_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etcS_W_Ortsgestellt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_ModulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Ausgang_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Eingang_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Physisch_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eV_Modul_Virtuell_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fabrikat_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fachtelegrammEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_AnschaltbedingungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ESG_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ESG_Subtyp_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ESG_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ETCS_L2_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ETCS_L2_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ETCS_Trans_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ETCS_Trans_Paket_41_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ETCS_Trans_Paket_N_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_Fahrweg_TeilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_Fahrweg_Teil_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_Fahrweg_Teile_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_GNT_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_GNT_Punktart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_Hinweis_Funktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ZBS_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ZBS_Merkmale_La_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fT_ZBS_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnT_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gruppen_ID_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harter_Ausstieg_Aus_L2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hersteller_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hinweis_Balisenbefestigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individuell_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ist_Befahren_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass km_BTS_1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass km_BTS_2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass km_BTS_3_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knoten_Auf_TOP_Kante_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konfigurationskennung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l_ACKLEVELTR_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laenge_1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laenge_Ausfuehrungsbereich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Anlage_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Anlage_Moduleigenschaften_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Ausgang_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_ModulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Modul_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Modul_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Modul_Ausgang_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Modul_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Modul_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_SchaltkastenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Schaltkasten_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Schaltkasten_Energie_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Schaltkasten_Position_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Schaltkasten_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leU_Steuernde_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lfd_Nr_Am_Bezugspunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lfdNr_in_Telegr_Spec_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass link_Distanz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lM_G_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luft_TelegrammEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_LEVELTR_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massgebende_Neig_1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massgebende_Neig_Schutzstrecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mastschild_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_Leistung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_Unterbrechungszeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metallteil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nennleistung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_C_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_RBC_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_STM_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nummer_Schaltkasten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oberstrombegrenzung_Gueterzug_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oberstrombegrenzung_Reisezug_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Nr_Ausg_Physisch_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_Sonstige_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass position_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaerquelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritaet_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prog_Datei_Einzel_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prog_Datei_GruppeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbC_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbC_SRS_Unterversion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbC_SRS_Version_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rekursion_2_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rekursion_Nr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rufnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbE_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schutzstrecke_Erforderlich_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schutzstrecke_Vorhanden_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstige_Standortangabe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spannung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spannung_Toleranz_Obere_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spannung_Toleranz_Untere_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srS_Unterversion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srS_Version_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standortangabe_Balisenschild_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass start_W_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stZ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_Vor_Grenze_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_Vor_Grenze_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbV_Meldepunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbV_Tunnelbereich_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbV_Tunnelsignal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telegrammnummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass text_Bedingung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueberbrueckung_EV_Unterbrechung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umfahrstrasse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untergruppen_ID_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Befehl_R_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Befehl_Z_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Frei_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Zul_Strecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbot_Anhalten_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbot_Regenerative_Bremse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbot_WB_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwendung_Als_Rueckfall_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwendung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vgR_1_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vgR_2_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vgR_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vZ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Anschluss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirkrichtung_In_Datenpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirksam_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_La_Bereich_Distanz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_La_Bereich_Geschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_La_Bereich_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_La_Bereich_Neigung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_Merkmale_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbS_Reaktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ziel_DP_Ausrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ziel_Ist_Fahrwegende_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ziel_W_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_BereichsgrenzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_ESG_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_GNT_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_L2_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_LZB_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_Ohne_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_PZB_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Bgrenze_RBC_Wechsel_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_SE_Ausruestung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_StreckeneigenschaftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zuB_Streckeneigenschaft_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumArtBedingungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAusstiegETCSSperreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpBezugBetrieblichArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpLinkArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpTypArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpTypESGEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpTypGNTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpTypTransEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumdpTypZBSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEinzeldateiArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEnergieEingangArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumetcsKnotenArtSonstigeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumevModulArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumftgntPunktartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumftHinweisFunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumftzbsTypEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumleuModulArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enummleveltrEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumnidstmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumsbeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSpannungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStandortangabeBalisenschildEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumstzEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumVerbotWBArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumVerwendungAlsRueckfallEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumwAnschlussEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumzbsReaktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstand_Grenze_Bereich_C_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anlagenteil_Sonstige_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anordnung_Im_DP_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anwendung_Sonst_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anzahl_Voll_LEU_Kalkuliert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anzeigetext_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ausgang_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseline_SRS_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bedingung_Weichenlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Strecke_BTS_1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Strecke_BTS_2_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Strecke_BTS_3_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_ZUB_Bereichsgrenze_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_ETCS_Kante_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_LEU_Anlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_ZUB_SE_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_ZUB_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType d_LEVELTR_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateityp_Binaerdatei_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datenpunkt_Beschreibung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datenpunkt_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType delta_VGES_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType delta_VLES_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType delta_VZES_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dP_Typ_ETCS_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dP_Typ_Sonst_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dP_Typ_V_La_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_Intervall_200_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_Intervall_50_200_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_Intervall_50_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumArtBedingungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAusstiegETCSSperreObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpBezugBetrieblichArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpLinkArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpTypArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpTypESGObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpTypGNTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpTypTransObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumdpTypZBSObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumEinzeldateiArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumEnergieEingangArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumetcsKnotenArtSonstigeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumevModulArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumftgntPunktartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumftHinweisFunktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumftzbsTypObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumleuModulArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enummleveltrObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumnidstmObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPositionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumsbeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSpannungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStandortangabeBalisenschildObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumstzObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumVerbotWBArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumVerwendungAlsRueckfallObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumwAnschlussObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumzbsReaktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType esG_Ind_Erlaeuterung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType esG_Ind_Parameter_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType esG_Ind_Parameterwert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Adresse_Kennung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Adresse_NID_BG_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Adresse_NID_C_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Kennung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Paketnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Par_Erlaeuterung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Parametername_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType etcS_Parameterwert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eV_Modul_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fabrikat_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fT_ESG_Subtyp_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fT_ESG_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fT_ETCS_L2_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gruppen_ID_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hinweis_Balisenbefestigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType km_BTS_1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType km_BTS_2_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType km_BTS_3_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType konfigurationskennung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType l_ACKLEVELTR_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType laenge_1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType laenge_Ausfuehrungsbereich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leU_Ausgang_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leU_Modul_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leU_Schaltkasten_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lfd_Nr_Am_Bezugspunkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lfdNr_in_Telegr_Spec_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType link_Distanz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType llA_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType massgebende_Neig_1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType massgebende_Neig_Schutzstrecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType max_Leistung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType max_Unterbrechungszeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType metallteil_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modulnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType neigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nennleistung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_C_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_RBC_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nummer_Schaltkasten_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oberstrombegrenzung_Gueterzug_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oberstrombegrenzung_Reisezug_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType port_Nr_Ausg_Physisch_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType position_Sonstige_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prioritaet_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rbC_SRS_Unterversion_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rbC_SRS_Version_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rekursion_2_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rekursion_Nr_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rufnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schutzstrecke_Erforderlich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schutzstrecke_Vorhanden_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sonstige_Standortangabe_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spannung_Toleranz_Obere_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spannung_Toleranz_Untere_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType srS_Unterversion_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType srS_Version_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType system_Vor_Grenze_Besonders_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tbV_Tunnelbereich_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telegrammnummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType text_Bedingung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ueberbrueckung_EV_Unterbrechung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType untergruppen_ID_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Befehl_R_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Befehl_Z_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Frei_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType v_Zul_Strecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verbot_Anhalten_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verwendung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vgR_1_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vgR_2_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vgR_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vlA_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vZ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wirkrichtung_In_Datenpunkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zbS_La_Bereich_Distanz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zbS_La_Bereich_Geschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zbS_La_Bereich_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zbS_La_Bereich_Neigung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zlA_TypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Balisentechnik_ETCSPackageImpl() {
		super(eNS_URI, Balisentechnik_ETCSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Balisentechnik_ETCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Balisentechnik_ETCSPackage init() {
		if (isInited) return (Balisentechnik_ETCSPackage)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBalisentechnik_ETCSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Balisentechnik_ETCSPackageImpl theBalisentechnik_ETCSPackage = registeredBalisentechnik_ETCSPackage instanceof Balisentechnik_ETCSPackageImpl ? (Balisentechnik_ETCSPackageImpl)registeredBalisentechnik_ETCSPackage : new Balisentechnik_ETCSPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackageImpl)(registeredPackage instanceof Ansteuerung_ElementPackageImpl ? registeredPackage : Ansteuerung_ElementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = (BahnsteigPackageImpl)(registeredPackage instanceof BahnsteigPackageImpl ? registeredPackage : BahnsteigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);
		BedienungPackageImpl theBedienungPackage = (BedienungPackageImpl)(registeredPackage instanceof BedienungPackageImpl ? registeredPackage : BedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BlockPackageImpl theBlockPackage = (BlockPackageImpl)(registeredPackage instanceof BlockPackageImpl ? registeredPackage : BlockPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);
		BahnuebergangPackageImpl theBahnuebergangPackage = (BahnuebergangPackageImpl)(registeredPackage instanceof BahnuebergangPackageImpl ? registeredPackage : BahnuebergangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);
		FlankenschutzPackageImpl theFlankenschutzPackage = (FlankenschutzPackageImpl)(registeredPackage instanceof FlankenschutzPackageImpl ? registeredPackage : FlankenschutzPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);
		OrtungPackageImpl theOrtungPackage = (OrtungPackageImpl)(registeredPackage instanceof OrtungPackageImpl ? registeredPackage : OrtungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);
		FahrstrassePackageImpl theFahrstrassePackage = (FahrstrassePackageImpl)(registeredPackage instanceof FahrstrassePackageImpl ? registeredPackage : FahrstrassePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);
		GeodatenPackageImpl theGeodatenPackage = (GeodatenPackageImpl)(registeredPackage instanceof GeodatenPackageImpl ? registeredPackage : GeodatenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);
		Weichen_und_GleissperrenPackageImpl theWeichen_und_GleissperrenPackage = (Weichen_und_GleissperrenPackageImpl)(registeredPackage instanceof Weichen_und_GleissperrenPackageImpl ? registeredPackage : Weichen_und_GleissperrenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);
		GleisPackageImpl theGleisPackage = (GleisPackageImpl)(registeredPackage instanceof GleisPackageImpl ? registeredPackage : GleisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);
		Medien_und_TrassenPackageImpl theMedien_und_TrassenPackage = (Medien_und_TrassenPackageImpl)(registeredPackage instanceof Medien_und_TrassenPackageImpl ? registeredPackage : Medien_und_TrassenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienbereichPackage.eNS_URI);
		NahbedienbereichPackageImpl theNahbedienbereichPackage = (NahbedienbereichPackageImpl)(registeredPackage instanceof NahbedienbereichPackageImpl ? registeredPackage : NahbedienbereichPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		PZBPackageImpl thePZBPackage = (PZBPackageImpl)(registeredPackage instanceof PZBPackageImpl ? registeredPackage : PZBPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);
		RegelzeichnungPackageImpl theRegelzeichnungPackage = (RegelzeichnungPackageImpl)(registeredPackage instanceof RegelzeichnungPackageImpl ? registeredPackage : RegelzeichnungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);
		SchluesselabhaengigkeitenPackageImpl theSchluesselabhaengigkeitenPackage = (SchluesselabhaengigkeitenPackageImpl)(registeredPackage instanceof SchluesselabhaengigkeitenPackageImpl ? registeredPackage : SchluesselabhaengigkeitenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);
		SignalePackageImpl theSignalePackage = (SignalePackageImpl)(registeredPackage instanceof SignalePackageImpl ? registeredPackage : SignalePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);
		Signalbegriffe_StrukturPackageImpl theSignalbegriffe_StrukturPackage = (Signalbegriffe_StrukturPackageImpl)(registeredPackage instanceof Signalbegriffe_StrukturPackageImpl ? registeredPackage : Signalbegriffe_StrukturPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);
		ZuglenkungPackageImpl theZuglenkungPackage = (ZuglenkungPackageImpl)(registeredPackage instanceof ZuglenkungPackageImpl ? registeredPackage : ZuglenkungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);

		// Load packages
		theBalisentechnik_ETCSPackage.loadPackage();
		thePlanProPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();

		// Create package meta-data objects
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		theNahbedienbereichPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		theNahbedienbereichPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();

		// Fix loaded packages
		theBalisentechnik_ETCSPackage.fixPackageContents();
		thePlanProPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBalisentechnik_ETCSPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Balisentechnik_ETCSValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBalisentechnik_ETCSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Balisentechnik_ETCSPackage.eNS_URI, theBalisentechnik_ETCSPackage);
		return theBalisentechnik_ETCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstand_Grenze_Bereich_C_TypeClass() {
		if (abstand_Grenze_Bereich_C_TypeClassEClass == null) {
			abstand_Grenze_Bereich_C_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstand_Grenze_Bereich_C_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstand_Grenze_Bereich_C_TypeClass_Wert() {
        return (EAttribute)getAbstand_Grenze_Bereich_C_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlagenteil_Sonstige_TypeClass() {
		if (anlagenteil_Sonstige_TypeClassEClass == null) {
			anlagenteil_Sonstige_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(3);
		}
		return anlagenteil_Sonstige_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlagenteil_Sonstige_TypeClass_Wert() {
        return (EAttribute)getAnlagenteil_Sonstige_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnordnung_Im_DP_TypeClass() {
		if (anordnung_Im_DP_TypeClassEClass == null) {
			anordnung_Im_DP_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(5);
		}
		return anordnung_Im_DP_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnordnung_Im_DP_TypeClass_Wert() {
        return (EAttribute)getAnordnung_Im_DP_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnwendung_Sonst_TypeClass() {
		if (anwendung_Sonst_TypeClassEClass == null) {
			anwendung_Sonst_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(7);
		}
		return anwendung_Sonst_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendung_Sonst_TypeClass_Wert() {
        return (EAttribute)getAnwendung_Sonst_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnwendungssystem_TypeClass() {
		if (anwendungssystem_TypeClassEClass == null) {
			anwendungssystem_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(8);
		}
		return anwendungssystem_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungssystem_TypeClass_Wert() {
        return (EAttribute)getAnwendungssystem_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnzahl_Voll_LEU_Kalkuliert_TypeClass() {
		if (anzahl_Voll_LEU_Kalkuliert_TypeClassEClass == null) {
			anzahl_Voll_LEU_Kalkuliert_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(10);
		}
		return anzahl_Voll_LEU_Kalkuliert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnzahl_Voll_LEU_Kalkuliert_TypeClass_Wert() {
        return (EAttribute)getAnzahl_Voll_LEU_Kalkuliert_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnzeigetext_TypeClass() {
		if (anzeigetext_TypeClassEClass == null) {
			anzeigetext_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(12);
		}
		return anzeigetext_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnzeigetext_TypeClass_Wert() {
        return (EAttribute)getAnzeigetext_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArt_Bedingung_TypeClass() {
		if (art_Bedingung_TypeClassEClass == null) {
			art_Bedingung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(13);
		}
		return art_Bedingung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArt_Bedingung_TypeClass_Wert() {
        return (EAttribute)getArt_Bedingung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusgang_Nr_TypeClass() {
		if (ausgang_Nr_TypeClassEClass == null) {
			ausgang_Nr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(15);
		}
		return ausgang_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusgang_Nr_TypeClass_Wert() {
        return (EAttribute)getAusgang_Nr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusrichtung_TypeClass() {
		if (ausrichtung_TypeClassEClass == null) {
			ausrichtung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ausrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusrichtung_TypeClass_Wert() {
        return (EAttribute)getAusrichtung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusstieg_ETCS_Sperre_TypeClass() {
		if (ausstieg_ETCS_Sperre_TypeClassEClass == null) {
			ausstieg_ETCS_Sperre_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(17);
		}
		return ausstieg_ETCS_Sperre_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusstieg_ETCS_Sperre_TypeClass_Wert() {
        return (EAttribute)getAusstieg_ETCS_Sperre_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBalise() {
		if (baliseEClass == null) {
			baliseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(18);
		}
		return baliseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_BaliseAllg() {
        return (EReference)getBalise().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_IDDatenpunkt() {
        return (EReference)getBalise().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBalise_Allg_AttributeGroup() {
		if (balise_Allg_AttributeGroupEClass == null) {
			balise_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(19);
		}
		return balise_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Allg_AttributeGroup_AnordnungImDP() {
        return (EReference)getBalise_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Allg_AttributeGroup_Fabrikat() {
        return (EReference)getBalise_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Allg_AttributeGroup_Hersteller() {
        return (EReference)getBalise_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Allg_AttributeGroup_HinweisBalisenbefestigung() {
        return (EReference)getBalise_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseline_SRS_TypeClass() {
		if (baseline_SRS_TypeClassEClass == null) {
			baseline_SRS_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(21);
		}
		return baseline_SRS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseline_SRS_TypeClass_Wert() {
        return (EAttribute)getBaseline_SRS_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_Besondere_AttributeGroup() {
		if (bedingung_Besondere_AttributeGroupEClass == null) {
			bedingung_Besondere_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(22);
		}
		return bedingung_Besondere_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Besondere_AttributeGroup_ArtBedingung() {
        return (EReference)getBedingung_Besondere_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_PZB_AttributeGroup() {
		if (bedingung_PZB_AttributeGroupEClass == null) {
			bedingung_PZB_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(23);
		}
		return bedingung_PZB_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_PZB_AttributeGroup_IDPZBElement() {
        return (EReference)getBedingung_PZB_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_PZB_AttributeGroup_Wirksam() {
        return (EReference)getBedingung_PZB_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_Signal_AttributeGroup() {
		if (bedingung_Signal_AttributeGroupEClass == null) {
			bedingung_Signal_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(24);
		}
		return bedingung_Signal_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Signal_AttributeGroup_IDSignalSignalbegriff() {
        return (EReference)getBedingung_Signal_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Signal_AttributeGroup_VerwendungAlsRueckfall() {
        return (EReference)getBedingung_Signal_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_Sonstige_AttributeGroup() {
		if (bedingung_Sonstige_AttributeGroupEClass == null) {
			bedingung_Sonstige_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(25);
		}
		return bedingung_Sonstige_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Sonstige_AttributeGroup_AnlagenteilSonstige() {
        return (EReference)getBedingung_Sonstige_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Sonstige_AttributeGroup_TextBedingung() {
        return (EReference)getBedingung_Sonstige_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_Weiche_AttributeGroup() {
		if (bedingung_Weiche_AttributeGroupEClass == null) {
			bedingung_Weiche_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(26);
		}
		return bedingung_Weiche_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Weiche_AttributeGroup_BedingungWeichenlage() {
        return (EReference)getBedingung_Weiche_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBedingung_Weiche_AttributeGroup_IDWElement() {
        return (EReference)getBedingung_Weiche_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedingung_Weichenlage_TypeClass() {
		if (bedingung_Weichenlage_TypeClassEClass == null) {
			bedingung_Weichenlage_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(28);
		}
		return bedingung_Weichenlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedingung_Weichenlage_TypeClass_Wert() {
        return (EAttribute)getBedingung_Weichenlage_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Strecke_BTS_1_TypeClass() {
		if (bez_Strecke_BTS_1_TypeClassEClass == null) {
			bez_Strecke_BTS_1_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(30);
		}
		return bez_Strecke_BTS_1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Strecke_BTS_1_TypeClass_Wert() {
        return (EAttribute)getBez_Strecke_BTS_1_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Strecke_BTS_2_TypeClass() {
		if (bez_Strecke_BTS_2_TypeClassEClass == null) {
			bez_Strecke_BTS_2_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(32);
		}
		return bez_Strecke_BTS_2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Strecke_BTS_2_TypeClass_Wert() {
        return (EAttribute)getBez_Strecke_BTS_2_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Strecke_BTS_3_TypeClass() {
		if (bez_Strecke_BTS_3_TypeClassEClass == null) {
			bez_Strecke_BTS_3_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(34);
		}
		return bez_Strecke_BTS_3_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Strecke_BTS_3_TypeClass_Wert() {
        return (EAttribute)getBez_Strecke_BTS_3_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_ZUB_Bereichsgrenze_TypeClass() {
		if (bez_ZUB_Bereichsgrenze_TypeClassEClass == null) {
			bez_ZUB_Bereichsgrenze_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(36);
		}
		return bez_ZUB_Bereichsgrenze_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_ZUB_Bereichsgrenze_TypeClass_Wert() {
        return (EAttribute)getBez_ZUB_Bereichsgrenze_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_ETCS_Kante_TypeClass() {
		if (bezeichnung_ETCS_Kante_TypeClassEClass == null) {
			bezeichnung_ETCS_Kante_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(38);
		}
		return bezeichnung_ETCS_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_ETCS_Kante_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_ETCS_Kante_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_LEU_Anlage_TypeClass() {
		if (bezeichnung_LEU_Anlage_TypeClassEClass == null) {
			bezeichnung_LEU_Anlage_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(40);
		}
		return bezeichnung_LEU_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_LEU_Anlage_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_LEU_Anlage_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_ZUB_SE_TypeClass() {
		if (bezeichnung_ZUB_SE_TypeClassEClass == null) {
			bezeichnung_ZUB_SE_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(42);
		}
		return bezeichnung_ZUB_SE_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_ZUB_SE_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_ZUB_SE_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_ZUB_TypeClass() {
		if (bezeichnung_ZUB_TypeClassEClass == null) {
			bezeichnung_ZUB_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(44);
		}
		return bezeichnung_ZUB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_ZUB_TypeClass_Wert() {
        return (EAttribute)getBezeichnung_ZUB_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup() {
		if (bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupEClass == null) {
			bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(45);
		}
		return bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup_IDWElement() {
        return (EReference)getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup_WLage() {
        return (EReference)getBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup() {
		if (bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupEClass == null) {
			bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(46);
		}
		return bgrenze_Nach_L2_Bed_Einstieg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup_IDWElement() {
        return (EReference)getBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup_WLage() {
        return (EReference)getBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup() {
		if (bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupEClass == null) {
			bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(47);
		}
		return bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup_IDWElement() {
        return (EReference)getBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup_WLage() {
        return (EReference)getBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup() {
		if (bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupEClass == null) {
			bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(48);
		}
		return bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup_IDWElement() {
        return (EReference)getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup_WLage() {
        return (EReference)getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup() {
		if (bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupEClass == null) {
			bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(49);
		}
		return bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup_IDWElement() {
        return (EReference)getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup_WLage() {
        return (EReference)getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup() {
		if (bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupEClass == null) {
			bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(50);
		}
		return bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS1() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS2() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS3() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS1() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS2() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS3() {
        return (EReference)getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaerdatei() {
		if (binaerdateiEClass == null) {
			binaerdateiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(51);
		}
		return binaerdateiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaerdatei_BinaerdateiAllg() {
        return (EReference)getBinaerdatei().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaerdatei_Allg_AttributeGroup() {
		if (binaerdatei_Allg_AttributeGroupEClass == null) {
			binaerdatei_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(52);
		}
		return binaerdatei_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaerdatei_Allg_AttributeGroup_Dateiname() {
        return (EReference)getBinaerdatei_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaerdatei_Allg_AttributeGroup_DateitypBinaerdatei() {
        return (EReference)getBinaerdatei_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaerdatei_Allg_AttributeGroup_Daten() {
        return (EReference)getBinaerdatei_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBremsweg_TypeClass() {
		if (bremsweg_TypeClassEClass == null) {
			bremsweg_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(53);
		}
		return bremsweg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBremsweg_TypeClass_Wert() {
        return (EAttribute)getBremsweg_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getD_LEVELTR_TypeClass() {
		if (d_LEVELTR_TypeClassEClass == null) {
			d_LEVELTR_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(55);
		}
		return d_LEVELTR_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getD_LEVELTR_TypeClass_Wert() {
        return (EAttribute)getD_LEVELTR_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateiname_TypeClass() {
		if (dateiname_TypeClassEClass == null) {
			dateiname_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(56);
		}
		return dateiname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateiname_TypeClass_Wert() {
        return (EAttribute)getDateiname_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateityp_Binaerdatei_TypeClass() {
		if (dateityp_Binaerdatei_TypeClassEClass == null) {
			dateityp_Binaerdatei_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(58);
		}
		return dateityp_Binaerdatei_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateityp_Binaerdatei_TypeClass_Wert() {
        return (EAttribute)getDateityp_Binaerdatei_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDaten_TypeClass() {
		if (daten_TypeClassEClass == null) {
			daten_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(59);
		}
		return daten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDaten_TypeClass_Wert() {
        return (EAttribute)getDaten_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenpunkt() {
		if (datenpunktEClass == null) {
			datenpunktEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(60);
		}
		return datenpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DatenpunktAllg() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DPBezugBetrieblich() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DPETCSAdresse() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DPTyp() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_IDEinmesspunkt() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_IDRBC() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_LEUSteuernde() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DPTelegramm() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_DPTelegrammESG() {
        return (EReference)getDatenpunkt().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenpunkt_Allg_AttributeGroup() {
		if (datenpunkt_Allg_AttributeGroupEClass == null) {
			datenpunkt_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(61);
		}
		return datenpunkt_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_Anwendungssystem() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_Ausrichtung() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_DatenpunktBeschreibung() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_DatenpunktLaenge() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_SonstigeStandortangabe() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Allg_AttributeGroup_StandortangabeBalisenschild() {
        return (EReference)getDatenpunkt_Allg_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenpunkt_Beschreibung_TypeClass() {
		if (datenpunkt_Beschreibung_TypeClassEClass == null) {
			datenpunkt_Beschreibung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(63);
		}
		return datenpunkt_Beschreibung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenpunkt_Beschreibung_TypeClass_Wert() {
        return (EAttribute)getDatenpunkt_Beschreibung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenpunkt_Laenge_TypeClass() {
		if (datenpunkt_Laenge_TypeClassEClass == null) {
			datenpunkt_Laenge_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(65);
		}
		return datenpunkt_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatenpunkt_Laenge_TypeClass_Wert() {
        return (EAttribute)getDatenpunkt_Laenge_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenpunkt_Link() {
		if (datenpunkt_LinkEClass == null) {
			datenpunkt_LinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(66);
		}
		return datenpunkt_LinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_IDDPLinkStart() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_IDDPLinkZiel() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_IDFachtelegramm() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_LinkDistanz() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_ZielDPAusrichtung() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_GNTMerkmale() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatenpunkt_Link_ZBSMerkmale() {
        return (EReference)getDatenpunkt_Link().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelta_VGES_TypeClass() {
		if (delta_VGES_TypeClassEClass == null) {
			delta_VGES_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(68);
		}
		return delta_VGES_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelta_VGES_TypeClass_Wert() {
        return (EAttribute)getDelta_VGES_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelta_VLES_TypeClass() {
		if (delta_VLES_TypeClassEClass == null) {
			delta_VLES_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(70);
		}
		return delta_VLES_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelta_VLES_TypeClass_Wert() {
        return (EAttribute)getDelta_VLES_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelta_VZES_TypeClass() {
		if (delta_VZES_TypeClassEClass == null) {
			delta_VZES_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(72);
		}
		return delta_VZES_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelta_VZES_TypeClass_Wert() {
        return (EAttribute)getDelta_VZES_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Bezug_Betrieblich_Art_TypeClass() {
		if (dP_Bezug_Betrieblich_Art_TypeClassEClass == null) {
			dP_Bezug_Betrieblich_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(73);
		}
		return dP_Bezug_Betrieblich_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Bezug_Betrieblich_Art_TypeClass_Wert() {
        return (EAttribute)getDP_Bezug_Betrieblich_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Bezug_Betrieblich_AttributeGroup() {
		if (dP_Bezug_Betrieblich_AttributeGroupEClass == null) {
			dP_Bezug_Betrieblich_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(74);
		}
		return dP_Bezug_Betrieblich_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Bezug_Betrieblich_AttributeGroup_DPBezugBetrieblichArt() {
        return (EReference)getDP_Bezug_Betrieblich_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Bezug_Betrieblich_AttributeGroup_IDDPBezugspunkt() {
        return (EReference)getDP_Bezug_Betrieblich_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_ETCS_Adresse_AttributeGroup() {
		if (dP_ETCS_Adresse_AttributeGroupEClass == null) {
			dP_ETCS_Adresse_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(75);
		}
		return dP_ETCS_Adresse_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseKennung() {
        return (EReference)getDP_ETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseNIDBG() {
        return (EReference)getDP_ETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_ETCS_Adresse_AttributeGroup_ETCSAdresseNIDC() {
        return (EReference)getDP_ETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Link_Art_TypeClass() {
		if (dP_Link_Art_TypeClassEClass == null) {
			dP_Link_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(76);
		}
		return dP_Link_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Link_Art_TypeClass_Wert() {
        return (EAttribute)getDP_Link_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Telegramm_AttributeGroup() {
		if (dP_Telegramm_AttributeGroupEClass == null) {
			dP_Telegramm_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(77);
		}
		return dP_Telegramm_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_AttributeGroup_IDFachtelegramm() {
        return (EReference)getDP_Telegramm_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_AttributeGroup_IDFTAnschaltbedingung() {
        return (EReference)getDP_Telegramm_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_AttributeGroup_SRSUnterversion() {
        return (EReference)getDP_Telegramm_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_AttributeGroup_SRSVersion() {
        return (EReference)getDP_Telegramm_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Telegramm_ESG_AttributeGroup() {
		if (dP_Telegramm_ESG_AttributeGroupEClass == null) {
			dP_Telegramm_ESG_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(78);
		}
		return dP_Telegramm_ESG_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_ESG_AttributeGroup_IDFachtelegramm() {
        return (EReference)getDP_Telegramm_ESG_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungGeplant() {
        return (EReference)getDP_Telegramm_ESG_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungRealisiert() {
        return (EReference)getDP_Telegramm_ESG_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_ESG_AttributeGroup_SRSUnterversion() {
        return (EReference)getDP_Telegramm_ESG_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Telegramm_ESG_AttributeGroup_SRSVersion() {
        return (EReference)getDP_Telegramm_ESG_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_Art_TypeClass() {
		if (dP_Typ_Art_TypeClassEClass == null) {
			dP_Typ_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(79);
		}
		return dP_Typ_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_Art_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_AttributeGroup() {
		if (dP_Typ_AttributeGroupEClass == null) {
			dP_Typ_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(80);
		}
		return dP_Typ_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypArt() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGESG() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGETCS() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGGNT() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGSonst() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGTrans() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_AttributeGroup_DPTypGZBS() {
        return (EReference)getDP_Typ_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_ESG_TypeClass() {
		if (dP_Typ_ESG_TypeClassEClass == null) {
			dP_Typ_ESG_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(81);
		}
		return dP_Typ_ESG_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_ESG_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_ESG_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_ETCS_TypeClass() {
		if (dP_Typ_ETCS_TypeClassEClass == null) {
			dP_Typ_ETCS_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(83);
		}
		return dP_Typ_ETCS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_ETCS_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_ETCS_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GESG_AttributeGroup() {
		if (dP_Typ_GESG_AttributeGroupEClass == null) {
			dP_Typ_GESG_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(84);
		}
		return dP_Typ_GESG_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GESG_AttributeGroup_Bremsweg() {
        return (EReference)getDP_Typ_GESG_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GESG_AttributeGroup_DPTypESG() {
        return (EReference)getDP_Typ_GESG_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GESG_AttributeGroup_Individuell() {
        return (EReference)getDP_Typ_GESG_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GESG_AttributeGroup_LfdNrAmBezugspunkt() {
        return (EReference)getDP_Typ_GESG_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GETCS_AttributeGroup() {
		if (dP_Typ_GETCS_AttributeGroupEClass == null) {
			dP_Typ_GETCS_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(85);
		}
		return dP_Typ_GETCS_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GETCS_AttributeGroup_DPTypETCS() {
        return (EReference)getDP_Typ_GETCS_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GGNT_AttributeGroup() {
		if (dP_Typ_GGNT_AttributeGroupEClass == null) {
			dP_Typ_GGNT_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(86);
		}
		return dP_Typ_GGNT_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GGNT_AttributeGroup_TCDPTypGNT() {
        return (EReference)getDP_Typ_GGNT_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GNT_TypeClass() {
		if (dP_Typ_GNT_TypeClassEClass == null) {
			dP_Typ_GNT_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(87);
		}
		return dP_Typ_GNT_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_GNT_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_GNT_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GSonst_AttributeGroup() {
		if (dP_Typ_GSonst_AttributeGroupEClass == null) {
			dP_Typ_GSonst_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(88);
		}
		return dP_Typ_GSonst_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GSonst_AttributeGroup_AnwendungSonst() {
        return (EReference)getDP_Typ_GSonst_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GSonst_AttributeGroup_DPTypSonst() {
        return (EReference)getDP_Typ_GSonst_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GTrans_AttributeGroup() {
		if (dP_Typ_GTrans_AttributeGroupEClass == null) {
			dP_Typ_GTrans_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(89);
		}
		return dP_Typ_GTrans_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GTrans_AttributeGroup_DPTypTrans() {
        return (EReference)getDP_Typ_GTrans_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_GZBS_AttributeGroup() {
		if (dP_Typ_GZBS_AttributeGroupEClass == null) {
			dP_Typ_GZBS_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(90);
		}
		return dP_Typ_GZBS_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDP_Typ_GZBS_AttributeGroup_DPTypZBS() {
        return (EReference)getDP_Typ_GZBS_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_Sonst_TypeClass() {
		if (dP_Typ_Sonst_TypeClassEClass == null) {
			dP_Typ_Sonst_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(92);
		}
		return dP_Typ_Sonst_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_Sonst_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_Sonst_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_Trans_TypeClass() {
		if (dP_Typ_Trans_TypeClassEClass == null) {
			dP_Typ_Trans_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(93);
		}
		return dP_Typ_Trans_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_Trans_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_Trans_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_V_La_TypeClass() {
		if (dP_Typ_V_La_TypeClassEClass == null) {
			dP_Typ_V_La_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(95);
		}
		return dP_Typ_V_La_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_V_La_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_V_La_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDP_Typ_ZBS_TypeClass() {
		if (dP_Typ_ZBS_TypeClassEClass == null) {
			dP_Typ_ZBS_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(96);
		}
		return dP_Typ_ZBS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDP_Typ_ZBS_TypeClass_Wert() {
        return (EAttribute)getDP_Typ_ZBS_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDunkelschaltanstoss_TypeClass() {
		if (dunkelschaltanstoss_TypeClassEClass == null) {
			dunkelschaltanstoss_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(97);
		}
		return dunkelschaltanstoss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDunkelschaltanstoss_TypeClass_Wert() {
        return (EAttribute)getDunkelschaltanstoss_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Intervall_200_TypeClass() {
		if (dWeg_Intervall_200_TypeClassEClass == null) {
			dWeg_Intervall_200_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(99);
		}
		return dWeg_Intervall_200_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Intervall_200_TypeClass_Wert() {
        return (EAttribute)getDWeg_Intervall_200_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Intervall_50_200_TypeClass() {
		if (dWeg_Intervall_50_200_TypeClassEClass == null) {
			dWeg_Intervall_50_200_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(101);
		}
		return dWeg_Intervall_50_200_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Intervall_50_200_TypeClass_Wert() {
        return (EAttribute)getDWeg_Intervall_50_200_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Intervall_50_TypeClass() {
		if (dWeg_Intervall_50_TypeClassEClass == null) {
			dWeg_Intervall_50_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(103);
		}
		return dWeg_Intervall_50_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Intervall_50_TypeClass_Wert() {
        return (EAttribute)getDWeg_Intervall_50_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEingang_Gepuffert_TypeClass() {
		if (eingang_Gepuffert_TypeClassEClass == null) {
			eingang_Gepuffert_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(104);
		}
		return eingang_Gepuffert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEingang_Gepuffert_TypeClass_Wert() {
        return (EAttribute)getEingang_Gepuffert_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinstieg_Erlaubt_TypeClass() {
		if (einstieg_Erlaubt_TypeClassEClass == null) {
			einstieg_Erlaubt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(105);
		}
		return einstieg_Erlaubt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinstieg_Erlaubt_TypeClass_Wert() {
        return (EAttribute)getEinstieg_Erlaubt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinstieg_Ohne_Rueckw_Sig_TypeClass() {
		if (einstieg_Ohne_Rueckw_Sig_TypeClassEClass == null) {
			einstieg_Ohne_Rueckw_Sig_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(106);
		}
		return einstieg_Ohne_Rueckw_Sig_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinstieg_Ohne_Rueckw_Sig_TypeClass_Wert() {
        return (EAttribute)getEinstieg_Ohne_Rueckw_Sig_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinzeldatei_Art_TypeClass() {
		if (einzeldatei_Art_TypeClassEClass == null) {
			einzeldatei_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(107);
		}
		return einzeldatei_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinzeldatei_Art_TypeClass_Wert() {
        return (EAttribute)getEinzeldatei_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergie_Eingang_Art_TypeClass() {
		if (energie_Eingang_Art_TypeClassEClass == null) {
			energie_Eingang_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(108);
		}
		return energie_Eingang_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergie_Eingang_Art_TypeClass_Wert() {
        return (EAttribute)getEnergie_Eingang_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESG_Ind_Erlaeuterung_TypeClass() {
		if (esG_Ind_Erlaeuterung_TypeClassEClass == null) {
			esG_Ind_Erlaeuterung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(166);
		}
		return esG_Ind_Erlaeuterung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getESG_Ind_Erlaeuterung_TypeClass_Wert() {
        return (EAttribute)getESG_Ind_Erlaeuterung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESG_Ind_Parameter_TypeClass() {
		if (esG_Ind_Parameter_TypeClassEClass == null) {
			esG_Ind_Parameter_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(168);
		}
		return esG_Ind_Parameter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getESG_Ind_Parameter_TypeClass_Wert() {
        return (EAttribute)getESG_Ind_Parameter_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESG_Ind_Parameterwert_TypeClass() {
		if (esG_Ind_Parameterwert_TypeClassEClass == null) {
			esG_Ind_Parameterwert_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(170);
		}
		return esG_Ind_Parameterwert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getESG_Ind_Parameterwert_TypeClass_Wert() {
        return (EAttribute)getESG_Ind_Parameterwert_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESG_Individuelle_Merkmale_AttributeGroup() {
		if (esG_Individuelle_Merkmale_AttributeGroupEClass == null) {
			esG_Individuelle_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(171);
		}
		return esG_Individuelle_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Individuelle_Merkmale_AttributeGroup_ESGIndErlaeuterung() {
        return (EReference)getESG_Individuelle_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameter() {
        return (EReference)getESG_Individuelle_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameterwert() {
        return (EReference)getESG_Individuelle_Merkmale_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESG_Spezifische_Merkmale_AttributeGroup() {
		if (esG_Spezifische_Merkmale_AttributeGroupEClass == null) {
			esG_Spezifische_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(172);
		}
		return esG_Spezifische_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_ETCSPaketnummer() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_ETCSParErlaeuterung() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_ETCSParametername() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_ETCSParameterwert() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_Rekursion2Nr() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESG_Spezifische_Merkmale_AttributeGroup_RekursionNr() {
        return (EReference)getESG_Spezifische_Merkmale_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Adresse_AttributeGroup() {
		if (etcS_Adresse_AttributeGroupEClass == null) {
			etcS_Adresse_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(173);
		}
		return etcS_Adresse_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Adresse_AttributeGroup_ETCSKennung() {
        return (EReference)getETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Adresse_AttributeGroup_NIDC() {
        return (EReference)getETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Adresse_AttributeGroup_NIDRBC() {
        return (EReference)getETCS_Adresse_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Adresse_Kennung_TypeClass() {
		if (etcS_Adresse_Kennung_TypeClassEClass == null) {
			etcS_Adresse_Kennung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(175);
		}
		return etcS_Adresse_Kennung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Adresse_Kennung_TypeClass_Wert() {
        return (EAttribute)getETCS_Adresse_Kennung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Adresse_NID_BG_TypeClass() {
		if (etcS_Adresse_NID_BG_TypeClassEClass == null) {
			etcS_Adresse_NID_BG_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(177);
		}
		return etcS_Adresse_NID_BG_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Adresse_NID_BG_TypeClass_Wert() {
        return (EAttribute)getETCS_Adresse_NID_BG_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Adresse_NID_C_TypeClass() {
		if (etcS_Adresse_NID_C_TypeClassEClass == null) {
			etcS_Adresse_NID_C_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(179);
		}
		return etcS_Adresse_NID_C_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Adresse_NID_C_TypeClass_Wert() {
        return (EAttribute)getETCS_Adresse_NID_C_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Kante() {
		if (etcS_KanteEClass == null) {
			etcS_KanteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(180);
		}
		return etcS_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_Bezeichnung() {
        return (EReference)getETCS_Kante().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_IDETCSKnotenA() {
        return (EReference)getETCS_Kante().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_IDETCSKnotenB() {
        return (EReference)getETCS_Kante().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_IDRBC() {
        return (EReference)getETCS_Kante().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_IDTOPKante() {
        return (EReference)getETCS_Kante().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Kante_Bezeichnung_AttributeGroup() {
		if (etcS_Kante_Bezeichnung_AttributeGroupEClass == null) {
			etcS_Kante_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(181);
		}
		return etcS_Kante_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Kante_Bezeichnung_AttributeGroup_BezeichnungETCSKante() {
        return (EReference)getETCS_Kante_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Kennung_TypeClass() {
		if (etcS_Kennung_TypeClassEClass == null) {
			etcS_Kennung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(183);
		}
		return etcS_Kennung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Kennung_TypeClass_Wert() {
        return (EAttribute)getETCS_Kennung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Knoten() {
		if (etcS_KnotenEClass == null) {
			etcS_KnotenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(184);
		}
		return etcS_KnotenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Knoten_IDTOPKnoten() {
        return (EReference)getETCS_Knoten().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Knoten_KnotenAufTOPKante() {
        return (EReference)getETCS_Knoten().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Knoten_Art_Sonstige_TypeClass() {
		if (etcS_Knoten_Art_Sonstige_TypeClassEClass == null) {
			etcS_Knoten_Art_Sonstige_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(185);
		}
		return etcS_Knoten_Art_Sonstige_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Knoten_Art_Sonstige_TypeClass_Wert() {
        return (EAttribute)getETCS_Knoten_Art_Sonstige_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Paketnummer_TypeClass() {
		if (etcS_Paketnummer_TypeClassEClass == null) {
			etcS_Paketnummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(187);
		}
		return etcS_Paketnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Paketnummer_TypeClass_Wert() {
        return (EAttribute)getETCS_Paketnummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Par_Erlaeuterung_TypeClass() {
		if (etcS_Par_Erlaeuterung_TypeClassEClass == null) {
			etcS_Par_Erlaeuterung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(189);
		}
		return etcS_Par_Erlaeuterung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Par_Erlaeuterung_TypeClass_Wert() {
        return (EAttribute)getETCS_Par_Erlaeuterung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Parametername_TypeClass() {
		if (etcS_Parametername_TypeClassEClass == null) {
			etcS_Parametername_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(191);
		}
		return etcS_Parametername_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Parametername_TypeClass_Wert() {
        return (EAttribute)getETCS_Parametername_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Parameterwert_TypeClass() {
		if (etcS_Parameterwert_TypeClassEClass == null) {
			etcS_Parameterwert_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(193);
		}
		return etcS_Parameterwert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_Parameterwert_TypeClass_Wert() {
        return (EAttribute)getETCS_Parameterwert_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Signal() {
		if (etcS_SignalEClass == null) {
			etcS_SignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(194);
		}
		return etcS_SignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_ETCSSignalAllg() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_ETCSSignalDWeg() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_ETCSSignalTBV() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_IDETCSGefahrpunkt() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_IDHOAFBOA() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_IDRBC() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_IDSignal() {
        return (EReference)getETCS_Signal().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Signal_Allg_AttributeGroup() {
		if (etcS_Signal_Allg_AttributeGroupEClass == null) {
			etcS_Signal_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(195);
		}
		return etcS_Signal_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_Allg_AttributeGroup_AusstiegETCSSperre() {
        return (EReference)getETCS_Signal_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_Allg_AttributeGroup_Dunkelschaltanstoss() {
        return (EReference)getETCS_Signal_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_Allg_AttributeGroup_EinstiegErlaubt() {
        return (EReference)getETCS_Signal_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_Allg_AttributeGroup_GruppenID() {
        return (EReference)getETCS_Signal_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_Allg_AttributeGroup_UntergruppenID() {
        return (EReference)getETCS_Signal_Allg_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Signal_DWeg_AttributeGroup() {
		if (etcS_Signal_DWeg_AttributeGroupEClass == null) {
			etcS_Signal_DWeg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(196);
		}
		return etcS_Signal_DWeg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_DWeg_AttributeGroup_DWegIntervall200() {
        return (EReference)getETCS_Signal_DWeg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_DWeg_AttributeGroup_DWegIntervall50() {
        return (EReference)getETCS_Signal_DWeg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_DWeg_AttributeGroup_DWegIntervall50200() {
        return (EReference)getETCS_Signal_DWeg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_Signal_TBV_AttributeGroup() {
		if (etcS_Signal_TBV_AttributeGroupEClass == null) {
			etcS_Signal_TBV_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(197);
		}
		return etcS_Signal_TBV_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_TBV_AttributeGroup_TBVMeldepunkt() {
        return (EReference)getETCS_Signal_TBV_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_TBV_AttributeGroup_TBVTunnelbereichLaenge() {
        return (EReference)getETCS_Signal_TBV_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_Signal_TBV_AttributeGroup_TBVTunnelsignal() {
        return (EReference)getETCS_Signal_TBV_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_W_Kr() {
		if (etcS_W_KrEClass == null) {
			etcS_W_KrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(198);
		}
		return etcS_W_KrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_IDETCSKnoten() {
        return (EReference)getETCS_W_Kr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_IDRBC() {
        return (EReference)getETCS_W_Kr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_IDWKrAnlage() {
        return (EReference)getETCS_W_Kr().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_ETCSWKrMUKA() {
        return (EReference)getETCS_W_Kr().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_ETCSWOrtsgestellt() {
        return (EReference)getETCS_W_Kr().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_W_Kr_MUKA_AttributeGroup() {
		if (etcS_W_Kr_MUKA_AttributeGroupEClass == null) {
			etcS_W_Kr_MUKA_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(199);
		}
		return etcS_W_Kr_MUKA_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_MUKA_AttributeGroup_GruppenID() {
        return (EReference)getETCS_W_Kr_MUKA_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETCS_W_Kr_MUKA_AttributeGroup_UntergruppenID() {
        return (EReference)getETCS_W_Kr_MUKA_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETCS_W_Ortsgestellt_TypeClass() {
		if (etcS_W_Ortsgestellt_TypeClassEClass == null) {
			etcS_W_Ortsgestellt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(200);
		}
		return etcS_W_Ortsgestellt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETCS_W_Ortsgestellt_TypeClass_Wert() {
        return (EAttribute)getETCS_W_Ortsgestellt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul() {
		if (eV_ModulEClass == null) {
			eV_ModulEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(201);
		}
		return eV_ModulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_EVModulAusgang() {
        return (EReference)getEV_Modul().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_EVModulPhysisch() {
        return (EReference)getEV_Modul().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_EVModulVirtuell() {
        return (EReference)getEV_Modul().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Art_TypeClass() {
		if (eV_Modul_Art_TypeClassEClass == null) {
			eV_Modul_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(202);
		}
		return eV_Modul_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEV_Modul_Art_TypeClass_Wert() {
        return (EAttribute)getEV_Modul_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Ausgang_AttributeGroup() {
		if (eV_Modul_Ausgang_AttributeGroupEClass == null) {
			eV_Modul_Ausgang_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(203);
		}
		return eV_Modul_Ausgang_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_AusgangNr() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_MaxUnterbrechungszeit() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_Nennleistung() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_SpannungArt() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzObere() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzUntere() {
        return (EReference)getEV_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Eingang_AttributeGroup() {
		if (eV_Modul_Eingang_AttributeGroupEClass == null) {
			eV_Modul_Eingang_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(204);
		}
		return eV_Modul_Eingang_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Eingang_AttributeGroup_EingangGepuffert() {
        return (EReference)getEV_Modul_Eingang_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Eingang_AttributeGroup_Primaerquelle() {
        return (EReference)getEV_Modul_Eingang_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Eingang_AttributeGroup_EnergieEingangArt() {
        return (EReference)getEV_Modul_Eingang_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Eingang_AttributeGroup_IDEnergieEingang() {
        return (EReference)getEV_Modul_Eingang_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Physisch_AttributeGroup() {
		if (eV_Modul_Physisch_AttributeGroupEClass == null) {
			eV_Modul_Physisch_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(205);
		}
		return eV_Modul_Physisch_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Physisch_AttributeGroup_EVModulArt() {
        return (EReference)getEV_Modul_Physisch_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Physisch_AttributeGroup_EVModulEingang() {
        return (EReference)getEV_Modul_Physisch_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Physisch_AttributeGroup_EVModulTyp() {
        return (EReference)getEV_Modul_Physisch_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Physisch_AttributeGroup_Hersteller() {
        return (EReference)getEV_Modul_Physisch_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Physisch_AttributeGroup_IDElementUnterbringung() {
        return (EReference)getEV_Modul_Physisch_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Typ_TypeClass() {
		if (eV_Modul_Typ_TypeClassEClass == null) {
			eV_Modul_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(207);
		}
		return eV_Modul_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEV_Modul_Typ_TypeClass_Wert() {
        return (EAttribute)getEV_Modul_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEV_Modul_Virtuell_AttributeGroup() {
		if (eV_Modul_Virtuell_AttributeGroupEClass == null) {
			eV_Modul_Virtuell_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(208);
		}
		return eV_Modul_Virtuell_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEV_Modul_Virtuell_AttributeGroup_IDQuellelement() {
        return (EReference)getEV_Modul_Virtuell_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFabrikat_TypeClass() {
		if (fabrikat_TypeClassEClass == null) {
			fabrikat_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(210);
		}
		return fabrikat_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFabrikat_TypeClass_Wert() {
        return (EAttribute)getFabrikat_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFachtelegramm() {
		if (fachtelegrammEClass == null) {
			fachtelegrammEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(211);
		}
		return fachtelegrammEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTFahrwegTeile() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_IDDokuTelegrammkodierung() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_WirkrichtungInDatenpunkt() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTESGMerkmale() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTETCSL2Merkmale() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTETCSTransMerkmale() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTGNTMerkmale() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFachtelegramm_FTZBSMerkmale() {
        return (EReference)getFachtelegramm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_Anschaltbedingung() {
		if (fT_AnschaltbedingungEClass == null) {
			fT_AnschaltbedingungEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(212);
		}
		return fT_AnschaltbedingungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Anschaltbedingung_BedingungBesondere() {
        return (EReference)getFT_Anschaltbedingung().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Anschaltbedingung_BedingungPZB() {
        return (EReference)getFT_Anschaltbedingung().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Anschaltbedingung_BedingungSignal() {
        return (EReference)getFT_Anschaltbedingung().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Anschaltbedingung_BedingungSonstige() {
        return (EReference)getFT_Anschaltbedingung().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Anschaltbedingung_BedingungWeiche() {
        return (EReference)getFT_Anschaltbedingung().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ESG_Merkmale_AttributeGroup() {
		if (fT_ESG_Merkmale_AttributeGroupEClass == null) {
			fT_ESG_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(213);
		}
		return fT_ESG_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_Bremsweg() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_DPTypVLa() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_ESGIndividuelleMerkmale() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_ESGSpezifischeMerkmale() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_FTESGSubtyp() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_FTESGTyp() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ESG_Merkmale_AttributeGroup_LfdNrInTelegrSpec() {
        return (EReference)getFT_ESG_Merkmale_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ESG_Subtyp_TypeClass() {
		if (fT_ESG_Subtyp_TypeClassEClass == null) {
			fT_ESG_Subtyp_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(215);
		}
		return fT_ESG_Subtyp_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_ESG_Subtyp_TypeClass_Wert() {
        return (EAttribute)getFT_ESG_Subtyp_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ESG_Typ_TypeClass() {
		if (fT_ESG_Typ_TypeClassEClass == null) {
			fT_ESG_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(217);
		}
		return fT_ESG_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_ESG_Typ_TypeClass_Wert() {
        return (EAttribute)getFT_ESG_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ETCS_L2_Merkmale_AttributeGroup() {
		if (fT_ETCS_L2_Merkmale_AttributeGroupEClass == null) {
			fT_ETCS_L2_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(218);
		}
		return fT_ETCS_L2_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_L2_Merkmale_AttributeGroup_FTETCSL2Typ() {
        return (EReference)getFT_ETCS_L2_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ETCS_L2_Typ_TypeClass() {
		if (fT_ETCS_L2_Typ_TypeClassEClass == null) {
			fT_ETCS_L2_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(220);
		}
		return fT_ETCS_L2_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_ETCS_L2_Typ_TypeClass_Wert() {
        return (EAttribute)getFT_ETCS_L2_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ETCS_Trans_Merkmale_AttributeGroup() {
		if (fT_ETCS_Trans_Merkmale_AttributeGroupEClass == null) {
			fT_ETCS_Trans_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(221);
		}
		return fT_ETCS_Trans_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Merkmale_AttributeGroup_FTETCSTransPaket41() {
        return (EReference)getFT_ETCS_Trans_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Merkmale_AttributeGroup_FTETCSTransPaketN() {
        return (EReference)getFT_ETCS_Trans_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ETCS_Trans_Paket_41_AttributeGroup() {
		if (fT_ETCS_Trans_Paket_41_AttributeGroupEClass == null) {
			fT_ETCS_Trans_Paket_41_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(222);
		}
		return fT_ETCS_Trans_Paket_41_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_41_AttributeGroup_DLEVELTR() {
        return (EReference)getFT_ETCS_Trans_Paket_41_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_41_AttributeGroup_LACKLEVELTR() {
        return (EReference)getFT_ETCS_Trans_Paket_41_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_41_AttributeGroup_MLEVELTR() {
        return (EReference)getFT_ETCS_Trans_Paket_41_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_41_AttributeGroup_NIDSTM() {
        return (EReference)getFT_ETCS_Trans_Paket_41_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ETCS_Trans_Paket_N_AttributeGroup() {
		if (fT_ETCS_Trans_Paket_N_AttributeGroupEClass == null) {
			fT_ETCS_Trans_Paket_N_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(223);
		}
		return fT_ETCS_Trans_Paket_N_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_ETCSPaketnummer() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_ETCSParErlaeuterung() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_ETCSParametername() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_ETCSParameterwert() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_Rekursion2Nr() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ETCS_Trans_Paket_N_AttributeGroup_RekursionNr() {
        return (EReference)getFT_ETCS_Trans_Paket_N_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_Fahrweg_Teil() {
		if (fT_Fahrweg_TeilEClass == null) {
			fT_Fahrweg_TeilEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(224);
		}
		return fT_Fahrweg_TeilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_FTFahrwegTeilAllg() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_IDZielDatenpunkt() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_IDZielSignal() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_ZielWElement() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_IDStartDatenpunkt() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_IDStartSignal() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_StartWElement() {
        return (EReference)getFT_Fahrweg_Teil().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_Fahrweg_Teil_Allg_AttributeGroup() {
		if (fT_Fahrweg_Teil_Allg_AttributeGroupEClass == null) {
			fT_Fahrweg_Teil_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(225);
		}
		return fT_Fahrweg_Teil_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_Allg_AttributeGroup_Umfahrstrasse() {
        return (EReference)getFT_Fahrweg_Teil_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teil_Allg_AttributeGroup_ZielIstFahrwegende() {
        return (EReference)getFT_Fahrweg_Teil_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_Fahrweg_Teile_AttributeGroup() {
		if (fT_Fahrweg_Teile_AttributeGroupEClass == null) {
			fT_Fahrweg_Teile_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(226);
		}
		return fT_Fahrweg_Teile_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teile_AttributeGroup_IDFTFahrwegTeil() {
        return (EReference)getFT_Fahrweg_Teile_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_Fahrweg_Teile_AttributeGroup_IstBefahren() {
        return (EReference)getFT_Fahrweg_Teile_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_GNT_Merkmale_AttributeGroup() {
		if (fT_GNT_Merkmale_AttributeGroupEClass == null) {
			fT_GNT_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(227);
		}
		return fT_GNT_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_DeltaVGES() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_DeltaVLES() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_DeltaVZES() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_FTGNTPunktart() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_LLA() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_Neigung() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_SBE() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_STZ() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_VGR() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_VLA() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_VZ() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_GNT_Merkmale_AttributeGroup_ZLA() {
        return (EReference)getFT_GNT_Merkmale_AttributeGroup().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_GNT_Punktart_TypeClass() {
		if (fT_GNT_Punktart_TypeClassEClass == null) {
			fT_GNT_Punktart_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(228);
		}
		return fT_GNT_Punktart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_GNT_Punktart_TypeClass_Wert() {
        return (EAttribute)getFT_GNT_Punktart_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_Hinweis_Funktion_TypeClass() {
		if (fT_Hinweis_Funktion_TypeClassEClass == null) {
			fT_Hinweis_Funktion_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(229);
		}
		return fT_Hinweis_Funktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_Hinweis_Funktion_TypeClass_Wert() {
        return (EAttribute)getFT_Hinweis_Funktion_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ZBS_Merkmale_AttributeGroup() {
		if (fT_ZBS_Merkmale_AttributeGroupEClass == null) {
			fT_ZBS_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(230);
		}
		return fT_ZBS_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_FTHinweisFunktion() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_FTZBSMerkmaleLa() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_FTZBSTyp() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_Laenge1() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_LMG() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeig1() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeigSchutzstrecke() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_Mastschild() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeErforderlich() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeVorhanden() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_Telegrammnummer() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VBefehlR() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VBefehlZ() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VFrei() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VZulStrecke() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VGR1() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_AttributeGroup_VGR2() {
        return (EReference)getFT_ZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ZBS_Merkmale_La_AttributeGroup() {
		if (fT_ZBS_Merkmale_La_AttributeGroupEClass == null) {
			fT_ZBS_Merkmale_La_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(231);
		}
		return fT_ZBS_Merkmale_La_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichDistanz() {
        return (EReference)getFT_ZBS_Merkmale_La_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichGeschwindigkeit() {
        return (EReference)getFT_ZBS_Merkmale_La_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichLaenge() {
        return (EReference)getFT_ZBS_Merkmale_La_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichNeigung() {
        return (EReference)getFT_ZBS_Merkmale_La_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFT_ZBS_Typ_TypeClass() {
		if (fT_ZBS_Typ_TypeClassEClass == null) {
			fT_ZBS_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(232);
		}
		return fT_ZBS_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFT_ZBS_Typ_TypeClass_Wert() {
        return (EAttribute)getFT_ZBS_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGNT_Merkmale_AttributeGroup() {
		if (gnT_Merkmale_AttributeGroupEClass == null) {
			gnT_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(233);
		}
		return gnT_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGruppen_ID_TypeClass() {
		if (gruppen_ID_TypeClassEClass == null) {
			gruppen_ID_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(235);
		}
		return gruppen_ID_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGruppen_ID_TypeClass_Wert() {
        return (EAttribute)getGruppen_ID_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHarter_Ausstieg_Aus_L2_TypeClass() {
		if (harter_Ausstieg_Aus_L2_TypeClassEClass == null) {
			harter_Ausstieg_Aus_L2_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(236);
		}
		return harter_Ausstieg_Aus_L2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHarter_Ausstieg_Aus_L2_TypeClass_Wert() {
        return (EAttribute)getHarter_Ausstieg_Aus_L2_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHersteller_TypeClass() {
		if (hersteller_TypeClassEClass == null) {
			hersteller_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(237);
		}
		return hersteller_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHersteller_TypeClass_Wert() {
        return (EAttribute)getHersteller_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHinweis_Balisenbefestigung_TypeClass() {
		if (hinweis_Balisenbefestigung_TypeClassEClass == null) {
			hinweis_Balisenbefestigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(239);
		}
		return hinweis_Balisenbefestigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHinweis_Balisenbefestigung_TypeClass_Wert() {
        return (EAttribute)getHinweis_Balisenbefestigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividuell_TypeClass() {
		if (individuell_TypeClassEClass == null) {
			individuell_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(240);
		}
		return individuell_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndividuell_TypeClass_Wert() {
        return (EAttribute)getIndividuell_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIst_Befahren_TypeClass() {
		if (ist_Befahren_TypeClassEClass == null) {
			ist_Befahren_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(241);
		}
		return ist_Befahren_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIst_Befahren_TypeClass_Wert() {
        return (EAttribute)getIst_Befahren_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKm_BTS_1_TypeClass() {
		if (km_BTS_1_TypeClassEClass == null) {
			km_BTS_1_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(243);
		}
		return km_BTS_1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKm_BTS_1_TypeClass_Wert() {
        return (EAttribute)getKm_BTS_1_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKm_BTS_2_TypeClass() {
		if (km_BTS_2_TypeClassEClass == null) {
			km_BTS_2_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(245);
		}
		return km_BTS_2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKm_BTS_2_TypeClass_Wert() {
        return (EAttribute)getKm_BTS_2_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKm_BTS_3_TypeClass() {
		if (km_BTS_3_TypeClassEClass == null) {
			km_BTS_3_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(247);
		}
		return km_BTS_3_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKm_BTS_3_TypeClass_Wert() {
        return (EAttribute)getKm_BTS_3_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnoten_Auf_TOP_Kante_AttributeGroup() {
		if (knoten_Auf_TOP_Kante_AttributeGroupEClass == null) {
			knoten_Auf_TOP_Kante_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(248);
		}
		return knoten_Auf_TOP_Kante_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnoten_Auf_TOP_Kante_AttributeGroup_ETCSKnotenArtSonstige() {
        return (EReference)getKnoten_Auf_TOP_Kante_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnoten_Auf_TOP_Kante_AttributeGroup_PunktObjektTOPKante() {
        return (EReference)getKnoten_Auf_TOP_Kante_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonfigurationskennung_TypeClass() {
		if (konfigurationskennung_TypeClassEClass == null) {
			konfigurationskennung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(250);
		}
		return konfigurationskennung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonfigurationskennung_TypeClass_Wert() {
        return (EAttribute)getKonfigurationskennung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL_ACKLEVELTR_TypeClass() {
		if (l_ACKLEVELTR_TypeClassEClass == null) {
			l_ACKLEVELTR_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(252);
		}
		return l_ACKLEVELTR_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getL_ACKLEVELTR_TypeClass_Wert() {
        return (EAttribute)getL_ACKLEVELTR_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaenge_1_TypeClass() {
		if (laenge_1_TypeClassEClass == null) {
			laenge_1_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(254);
		}
		return laenge_1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaenge_1_TypeClass_Wert() {
        return (EAttribute)getLaenge_1_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaenge_Ausfuehrungsbereich_TypeClass() {
		if (laenge_Ausfuehrungsbereich_TypeClassEClass == null) {
			laenge_Ausfuehrungsbereich_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(256);
		}
		return laenge_Ausfuehrungsbereich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaenge_Ausfuehrungsbereich_TypeClass_Wert() {
        return (EAttribute)getLaenge_Ausfuehrungsbereich_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Anlage() {
		if (leU_AnlageEClass == null) {
			leU_AnlageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(257);
		}
		return leU_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Anlage_Bezeichnung() {
        return (EReference)getLEU_Anlage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Anlage_IDLEUBezugspunkt() {
        return (EReference)getLEU_Anlage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Anlage_LEUAnlageModuleigenschaften() {
        return (EReference)getLEU_Anlage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Anlage_Bezeichnung_AttributeGroup() {
		if (leU_Anlage_Bezeichnung_AttributeGroupEClass == null) {
			leU_Anlage_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(258);
		}
		return leU_Anlage_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Anlage_Bezeichnung_AttributeGroup_BezeichnungLEUAnlage() {
        return (EReference)getLEU_Anlage_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Anlage_Moduleigenschaften_AttributeGroup() {
		if (leU_Anlage_Moduleigenschaften_AttributeGroupEClass == null) {
			leU_Anlage_Moduleigenschaften_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(259);
		}
		return leU_Anlage_Moduleigenschaften_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Anlage_Moduleigenschaften_AttributeGroup_LEUAusgangNr() {
        return (EReference)getLEU_Anlage_Moduleigenschaften_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Ausgang_Nr_TypeClass() {
		if (leU_Ausgang_Nr_TypeClassEClass == null) {
			leU_Ausgang_Nr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(261);
		}
		return leU_Ausgang_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLEU_Ausgang_Nr_TypeClass_Wert() {
        return (EAttribute)getLEU_Ausgang_Nr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul() {
		if (leU_ModulEClass == null) {
			leU_ModulEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(262);
		}
		return leU_ModulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Bezeichnung() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_IDInformationEingang() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_IDLEUAnlage() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_IDLEUSchaltkasten() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_LEUModulAllg() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_LEUModulAusgang() {
        return (EReference)getLEU_Modul().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul_Allg_AttributeGroup() {
		if (leU_Modul_Allg_AttributeGroupEClass == null) {
			leU_Modul_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(263);
		}
		return leU_Modul_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Allg_AttributeGroup_Hersteller() {
        return (EReference)getLEU_Modul_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Allg_AttributeGroup_LEUModulArt() {
        return (EReference)getLEU_Modul_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Allg_AttributeGroup_LEUModulTyp() {
        return (EReference)getLEU_Modul_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul_Art_TypeClass() {
		if (leU_Modul_Art_TypeClassEClass == null) {
			leU_Modul_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(264);
		}
		return leU_Modul_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLEU_Modul_Art_TypeClass_Wert() {
        return (EAttribute)getLEU_Modul_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul_Ausgang_AttributeGroup() {
		if (leU_Modul_Ausgang_AttributeGroupEClass == null) {
			leU_Modul_Ausgang_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(265);
		}
		return leU_Modul_Ausgang_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Ausgang_AttributeGroup_IDBalise() {
        return (EReference)getLEU_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Ausgang_AttributeGroup_LEUAusgangNr() {
        return (EReference)getLEU_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Ausgang_AttributeGroup_PortNrAusgPhysisch() {
        return (EReference)getLEU_Modul_Ausgang_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul_Bezeichnung_AttributeGroup() {
		if (leU_Modul_Bezeichnung_AttributeGroupEClass == null) {
			leU_Modul_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(266);
		}
		return leU_Modul_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Modul_Bezeichnung_AttributeGroup_Modulnummer() {
        return (EReference)getLEU_Modul_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Modul_Typ_TypeClass() {
		if (leU_Modul_Typ_TypeClassEClass == null) {
			leU_Modul_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(268);
		}
		return leU_Modul_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLEU_Modul_Typ_TypeClass_Wert() {
        return (EAttribute)getLEU_Modul_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Schaltkasten() {
		if (leU_SchaltkastenEClass == null) {
			leU_SchaltkastenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(269);
		}
		return leU_SchaltkastenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Bezeichnung() {
        return (EReference)getLEU_Schaltkasten().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_IDUnterbringung() {
        return (EReference)getLEU_Schaltkasten().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_LEUSchaltkastenEnergie() {
        return (EReference)getLEU_Schaltkasten().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_LEUSchaltkastenPosition() {
        return (EReference)getLEU_Schaltkasten().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_LEUSchaltkastenTyp() {
        return (EReference)getLEU_Schaltkasten().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Schaltkasten_Bezeichnung_AttributeGroup() {
		if (leU_Schaltkasten_Bezeichnung_AttributeGroupEClass == null) {
			leU_Schaltkasten_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(270);
		}
		return leU_Schaltkasten_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Bezeichnung_AttributeGroup_NummerSchaltkasten() {
        return (EReference)getLEU_Schaltkasten_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Schaltkasten_Energie_AttributeGroup() {
		if (leU_Schaltkasten_Energie_AttributeGroupEClass == null) {
			leU_Schaltkasten_Energie_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(271);
		}
		return leU_Schaltkasten_Energie_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Energie_AttributeGroup_AnzahlVollLEUKalkuliert() {
        return (EReference)getLEU_Schaltkasten_Energie_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Energie_AttributeGroup_IDEnergieLEUSchaltkasten() {
        return (EReference)getLEU_Schaltkasten_Energie_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Energie_AttributeGroup_MaxLeistung() {
        return (EReference)getLEU_Schaltkasten_Energie_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Energie_AttributeGroup_SpannungArt() {
        return (EReference)getLEU_Schaltkasten_Energie_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Energie_AttributeGroup_UeberbrueckungEVUnterbrechung() {
        return (EReference)getLEU_Schaltkasten_Energie_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Schaltkasten_Position_AttributeGroup() {
		if (leU_Schaltkasten_Position_AttributeGroupEClass == null) {
			leU_Schaltkasten_Position_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(272);
		}
		return leU_Schaltkasten_Position_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Position_AttributeGroup_Position() {
        return (EReference)getLEU_Schaltkasten_Position_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Schaltkasten_Position_AttributeGroup_PositionSonstige() {
        return (EReference)getLEU_Schaltkasten_Position_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Schaltkasten_Typ_TypeClass() {
		if (leU_Schaltkasten_Typ_TypeClassEClass == null) {
			leU_Schaltkasten_Typ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(274);
		}
		return leU_Schaltkasten_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLEU_Schaltkasten_Typ_TypeClass_Wert() {
        return (EAttribute)getLEU_Schaltkasten_Typ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLEU_Steuernde_AttributeGroup() {
		if (leU_Steuernde_AttributeGroupEClass == null) {
			leU_Steuernde_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(275);
		}
		return leU_Steuernde_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Steuernde_AttributeGroup_IDLEUAnlage() {
        return (EReference)getLEU_Steuernde_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLEU_Steuernde_AttributeGroup_LEUAusgangNr() {
        return (EReference)getLEU_Steuernde_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLfd_Nr_Am_Bezugspunkt_TypeClass() {
		if (lfd_Nr_Am_Bezugspunkt_TypeClassEClass == null) {
			lfd_Nr_Am_Bezugspunkt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(277);
		}
		return lfd_Nr_Am_Bezugspunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLfd_Nr_Am_Bezugspunkt_TypeClass_Wert() {
        return (EAttribute)getLfd_Nr_Am_Bezugspunkt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLfdNr_in_Telegr_Spec_TypeClass() {
		if (lfdNr_in_Telegr_Spec_TypeClassEClass == null) {
			lfdNr_in_Telegr_Spec_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(279);
		}
		return lfdNr_in_Telegr_Spec_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLfdNr_in_Telegr_Spec_TypeClass_Wert() {
        return (EAttribute)getLfdNr_in_Telegr_Spec_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink_Distanz_TypeClass() {
		if (link_Distanz_TypeClassEClass == null) {
			link_Distanz_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(281);
		}
		return link_Distanz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Distanz_TypeClass_Wert() {
        return (EAttribute)getLink_Distanz_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLLA_TypeClass() {
		if (llA_TypeClassEClass == null) {
			llA_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(283);
		}
		return llA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLLA_TypeClass_Wert() {
        return (EAttribute)getLLA_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLM_G_TypeClass() {
		if (lM_G_TypeClassEClass == null) {
			lM_G_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(284);
		}
		return lM_G_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLM_G_TypeClass_Wert() {
        return (EAttribute)getLM_G_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLuft_Telegramm() {
		if (luft_TelegrammEClass == null) {
			luft_TelegrammEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(285);
		}
		return luft_TelegrammEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_EigenschaftenBinaerdatei() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_EigenschaftenBinaerdateiHilfe() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_IDAnhangEADoku() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_IDBaliseUebertragung() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_IDBinaerdatei() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_IDBinaerdateiHilfe() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLuft_Telegramm_IDFachtelegramm() {
        return (EReference)getLuft_Telegramm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getM_LEVELTR_TypeClass() {
		if (m_LEVELTR_TypeClassEClass == null) {
			m_LEVELTR_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(286);
		}
		return m_LEVELTR_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getM_LEVELTR_TypeClass_Wert() {
        return (EAttribute)getM_LEVELTR_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMassgebende_Neig_1_TypeClass() {
		if (massgebende_Neig_1_TypeClassEClass == null) {
			massgebende_Neig_1_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(288);
		}
		return massgebende_Neig_1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMassgebende_Neig_1_TypeClass_Wert() {
        return (EAttribute)getMassgebende_Neig_1_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMassgebende_Neig_Schutzstrecke_TypeClass() {
		if (massgebende_Neig_Schutzstrecke_TypeClassEClass == null) {
			massgebende_Neig_Schutzstrecke_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(290);
		}
		return massgebende_Neig_Schutzstrecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMassgebende_Neig_Schutzstrecke_TypeClass_Wert() {
        return (EAttribute)getMassgebende_Neig_Schutzstrecke_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMastschild_TypeClass() {
		if (mastschild_TypeClassEClass == null) {
			mastschild_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(291);
		}
		return mastschild_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMastschild_TypeClass_Wert() {
        return (EAttribute)getMastschild_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMax_Leistung_TypeClass() {
		if (max_Leistung_TypeClassEClass == null) {
			max_Leistung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(293);
		}
		return max_Leistung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMax_Leistung_TypeClass_Wert() {
        return (EAttribute)getMax_Leistung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMax_Unterbrechungszeit_TypeClass() {
		if (max_Unterbrechungszeit_TypeClassEClass == null) {
			max_Unterbrechungszeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(295);
		}
		return max_Unterbrechungszeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMax_Unterbrechungszeit_TypeClass_Wert() {
        return (EAttribute)getMax_Unterbrechungszeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetallteil_TypeClass() {
		if (metallteil_TypeClassEClass == null) {
			metallteil_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(297);
		}
		return metallteil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetallteil_TypeClass_Wert() {
        return (EAttribute)getMetallteil_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModulnummer_TypeClass() {
		if (modulnummer_TypeClassEClass == null) {
			modulnummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(299);
		}
		return modulnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModulnummer_TypeClass_Wert() {
        return (EAttribute)getModulnummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeigung_TypeClass() {
		if (neigung_TypeClassEClass == null) {
			neigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(301);
		}
		return neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeigung_TypeClass_Wert() {
        return (EAttribute)getNeigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNennleistung_TypeClass() {
		if (nennleistung_TypeClassEClass == null) {
			nennleistung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(303);
		}
		return nennleistung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNennleistung_TypeClass_Wert() {
        return (EAttribute)getNennleistung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_C_TypeClass() {
		if (niD_C_TypeClassEClass == null) {
			niD_C_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(305);
		}
		return niD_C_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_C_TypeClass_Wert() {
        return (EAttribute)getNID_C_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_RBC_TypeClass() {
		if (niD_RBC_TypeClassEClass == null) {
			niD_RBC_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(307);
		}
		return niD_RBC_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_RBC_TypeClass_Wert() {
        return (EAttribute)getNID_RBC_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_STM_TypeClass() {
		if (niD_STM_TypeClassEClass == null) {
			niD_STM_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(308);
		}
		return niD_STM_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_STM_TypeClass_Wert() {
        return (EAttribute)getNID_STM_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNummer_Schaltkasten_TypeClass() {
		if (nummer_Schaltkasten_TypeClassEClass == null) {
			nummer_Schaltkasten_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(310);
		}
		return nummer_Schaltkasten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNummer_Schaltkasten_TypeClass_Wert() {
        return (EAttribute)getNummer_Schaltkasten_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOberstrombegrenzung_Gueterzug_TypeClass() {
		if (oberstrombegrenzung_Gueterzug_TypeClassEClass == null) {
			oberstrombegrenzung_Gueterzug_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(312);
		}
		return oberstrombegrenzung_Gueterzug_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOberstrombegrenzung_Gueterzug_TypeClass_Wert() {
        return (EAttribute)getOberstrombegrenzung_Gueterzug_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOberstrombegrenzung_Reisezug_TypeClass() {
		if (oberstrombegrenzung_Reisezug_TypeClassEClass == null) {
			oberstrombegrenzung_Reisezug_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(314);
		}
		return oberstrombegrenzung_Reisezug_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOberstrombegrenzung_Reisezug_TypeClass_Wert() {
        return (EAttribute)getOberstrombegrenzung_Reisezug_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort_Nr_Ausg_Physisch_TypeClass() {
		if (port_Nr_Ausg_Physisch_TypeClassEClass == null) {
			port_Nr_Ausg_Physisch_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(316);
		}
		return port_Nr_Ausg_Physisch_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Nr_Ausg_Physisch_TypeClass_Wert() {
        return (EAttribute)getPort_Nr_Ausg_Physisch_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_Sonstige_TypeClass() {
		if (position_Sonstige_TypeClassEClass == null) {
			position_Sonstige_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(318);
		}
		return position_Sonstige_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Sonstige_TypeClass_Wert() {
        return (EAttribute)getPosition_Sonstige_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition_TypeClass() {
		if (position_TypeClassEClass == null) {
			position_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(319);
		}
		return position_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_TypeClass_Wert() {
        return (EAttribute)getPosition_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaerquelle_TypeClass() {
		if (primaerquelle_TypeClassEClass == null) {
			primaerquelle_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(320);
		}
		return primaerquelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerquelle_TypeClass_Wert() {
        return (EAttribute)getPrimaerquelle_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrioritaet_TypeClass() {
		if (prioritaet_TypeClassEClass == null) {
			prioritaet_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(322);
		}
		return prioritaet_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrioritaet_TypeClass_Wert() {
        return (EAttribute)getPrioritaet_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProg_Datei_Einzel_AttributeGroup() {
		if (prog_Datei_Einzel_AttributeGroupEClass == null) {
			prog_Datei_Einzel_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(323);
		}
		return prog_Datei_Einzel_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_Anzeigetext() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_EigenschaftenBinaerdatei() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_EinzeldateiArt() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_IDBinaerdatei() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_Konfigurationskennung() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Einzel_AttributeGroup_Verwendung() {
        return (EReference)getProg_Datei_Einzel_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProg_Datei_Gruppe() {
		if (prog_Datei_GruppeEClass == null) {
			prog_Datei_GruppeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(324);
		}
		return prog_Datei_GruppeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Gruppe_IDGeraetProgrammiert() {
        return (EReference)getProg_Datei_Gruppe().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProg_Datei_Gruppe_ProgDateiEinzel() {
        return (EReference)getProg_Datei_Gruppe().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRBC() {
		if (rbcEClass == null) {
			rbcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(325);
		}
		return rbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_ETCSAdresse() {
        return (EReference)getRBC().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_IDESTWZentraleinheit() {
        return (EReference)getRBC().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_IDUnterbringung() {
        return (EReference)getRBC().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_RBCAllg() {
        return (EReference)getRBC().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRBC_Allg_AttributeGroup() {
		if (rbC_Allg_AttributeGroupEClass == null) {
			rbC_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(326);
		}
		return rbC_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_Allg_AttributeGroup_RBCSRSUnterversion() {
        return (EReference)getRBC_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_Allg_AttributeGroup_RBCSRSVersion() {
        return (EReference)getRBC_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRBC_Allg_AttributeGroup_Rufnummer() {
        return (EReference)getRBC_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRBC_SRS_Unterversion_TypeClass() {
		if (rbC_SRS_Unterversion_TypeClassEClass == null) {
			rbC_SRS_Unterversion_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(328);
		}
		return rbC_SRS_Unterversion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRBC_SRS_Unterversion_TypeClass_Wert() {
        return (EAttribute)getRBC_SRS_Unterversion_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRBC_SRS_Version_TypeClass() {
		if (rbC_SRS_Version_TypeClassEClass == null) {
			rbC_SRS_Version_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(330);
		}
		return rbC_SRS_Version_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRBC_SRS_Version_TypeClass_Wert() {
        return (EAttribute)getRBC_SRS_Version_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRekursion_2_Nr_TypeClass() {
		if (rekursion_2_Nr_TypeClassEClass == null) {
			rekursion_2_Nr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(332);
		}
		return rekursion_2_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRekursion_2_Nr_TypeClass_Wert() {
        return (EAttribute)getRekursion_2_Nr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRekursion_Nr_TypeClass() {
		if (rekursion_Nr_TypeClassEClass == null) {
			rekursion_Nr_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(334);
		}
		return rekursion_Nr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRekursion_Nr_TypeClass_Wert() {
        return (EAttribute)getRekursion_Nr_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRufnummer_TypeClass() {
		if (rufnummer_TypeClassEClass == null) {
			rufnummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(336);
		}
		return rufnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRufnummer_TypeClass_Wert() {
        return (EAttribute)getRufnummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSBE_TypeClass() {
		if (sbE_TypeClassEClass == null) {
			sbE_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(337);
		}
		return sbE_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSBE_TypeClass_Wert() {
        return (EAttribute)getSBE_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchutzstrecke_Erforderlich_TypeClass() {
		if (schutzstrecke_Erforderlich_TypeClassEClass == null) {
			schutzstrecke_Erforderlich_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(339);
		}
		return schutzstrecke_Erforderlich_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchutzstrecke_Erforderlich_TypeClass_Wert() {
        return (EAttribute)getSchutzstrecke_Erforderlich_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchutzstrecke_Vorhanden_TypeClass() {
		if (schutzstrecke_Vorhanden_TypeClassEClass == null) {
			schutzstrecke_Vorhanden_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(341);
		}
		return schutzstrecke_Vorhanden_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchutzstrecke_Vorhanden_TypeClass_Wert() {
        return (EAttribute)getSchutzstrecke_Vorhanden_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstige_Standortangabe_TypeClass() {
		if (sonstige_Standortangabe_TypeClassEClass == null) {
			sonstige_Standortangabe_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(343);
		}
		return sonstige_Standortangabe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstige_Standortangabe_TypeClass_Wert() {
        return (EAttribute)getSonstige_Standortangabe_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpannung_Art_TypeClass() {
		if (spannung_Art_TypeClassEClass == null) {
			spannung_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(344);
		}
		return spannung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpannung_Art_TypeClass_Wert() {
        return (EAttribute)getSpannung_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpannung_Toleranz_Obere_TypeClass() {
		if (spannung_Toleranz_Obere_TypeClassEClass == null) {
			spannung_Toleranz_Obere_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(346);
		}
		return spannung_Toleranz_Obere_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpannung_Toleranz_Obere_TypeClass_Wert() {
        return (EAttribute)getSpannung_Toleranz_Obere_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpannung_Toleranz_Untere_TypeClass() {
		if (spannung_Toleranz_Untere_TypeClassEClass == null) {
			spannung_Toleranz_Untere_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(348);
		}
		return spannung_Toleranz_Untere_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpannung_Toleranz_Untere_TypeClass_Wert() {
        return (EAttribute)getSpannung_Toleranz_Untere_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSRS_Unterversion_TypeClass() {
		if (srS_Unterversion_TypeClassEClass == null) {
			srS_Unterversion_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(350);
		}
		return srS_Unterversion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSRS_Unterversion_TypeClass_Wert() {
        return (EAttribute)getSRS_Unterversion_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSRS_Version_TypeClass() {
		if (srS_Version_TypeClassEClass == null) {
			srS_Version_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(352);
		}
		return srS_Version_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSRS_Version_TypeClass_Wert() {
        return (EAttribute)getSRS_Version_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandortangabe_Balisenschild_TypeClass() {
		if (standortangabe_Balisenschild_TypeClassEClass == null) {
			standortangabe_Balisenschild_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(353);
		}
		return standortangabe_Balisenschild_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandortangabe_Balisenschild_TypeClass_Wert() {
        return (EAttribute)getStandortangabe_Balisenschild_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart_W_Element_AttributeGroup() {
		if (start_W_Element_AttributeGroupEClass == null) {
			start_W_Element_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(354);
		}
		return start_W_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStart_W_Element_AttributeGroup_IDStartWElement() {
        return (EReference)getStart_W_Element_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStart_W_Element_AttributeGroup_WAnschluss() {
        return (EReference)getStart_W_Element_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSTZ_TypeClass() {
		if (stZ_TypeClassEClass == null) {
			stZ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(355);
		}
		return stZ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSTZ_TypeClass_Wert() {
        return (EAttribute)getSTZ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_Vor_Grenze_Besonders_TypeClass() {
		if (system_Vor_Grenze_Besonders_TypeClassEClass == null) {
			system_Vor_Grenze_Besonders_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(357);
		}
		return system_Vor_Grenze_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Vor_Grenze_Besonders_TypeClass_Wert() {
        return (EAttribute)getSystem_Vor_Grenze_Besonders_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem_Vor_Grenze_TypeClass() {
		if (system_Vor_Grenze_TypeClassEClass == null) {
			system_Vor_Grenze_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(358);
		}
		return system_Vor_Grenze_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_Vor_Grenze_TypeClass_Wert() {
        return (EAttribute)getSystem_Vor_Grenze_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBV_Meldepunkt_TypeClass() {
		if (tbV_Meldepunkt_TypeClassEClass == null) {
			tbV_Meldepunkt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(359);
		}
		return tbV_Meldepunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBV_Meldepunkt_TypeClass_Wert() {
        return (EAttribute)getTBV_Meldepunkt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBV_Tunnelbereich_Laenge_TypeClass() {
		if (tbV_Tunnelbereich_Laenge_TypeClassEClass == null) {
			tbV_Tunnelbereich_Laenge_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(361);
		}
		return tbV_Tunnelbereich_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBV_Tunnelbereich_Laenge_TypeClass_Wert() {
        return (EAttribute)getTBV_Tunnelbereich_Laenge_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBV_Tunnelsignal_TypeClass() {
		if (tbV_Tunnelsignal_TypeClassEClass == null) {
			tbV_Tunnelsignal_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(362);
		}
		return tbV_Tunnelsignal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBV_Tunnelsignal_TypeClass_Wert() {
        return (EAttribute)getTBV_Tunnelsignal_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelegrammnummer_TypeClass() {
		if (telegrammnummer_TypeClassEClass == null) {
			telegrammnummer_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(364);
		}
		return telegrammnummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelegrammnummer_TypeClass_Wert() {
        return (EAttribute)getTelegrammnummer_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText_Bedingung_TypeClass() {
		if (text_Bedingung_TypeClassEClass == null) {
			text_Bedingung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(366);
		}
		return text_Bedingung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Bedingung_TypeClass_Wert() {
        return (EAttribute)getText_Bedingung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUeberbrueckung_EV_Unterbrechung_TypeClass() {
		if (ueberbrueckung_EV_Unterbrechung_TypeClassEClass == null) {
			ueberbrueckung_EV_Unterbrechung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(368);
		}
		return ueberbrueckung_EV_Unterbrechung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUeberbrueckung_EV_Unterbrechung_TypeClass_Wert() {
        return (EAttribute)getUeberbrueckung_EV_Unterbrechung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmfahrstrasse_TypeClass() {
		if (umfahrstrasse_TypeClassEClass == null) {
			umfahrstrasse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(369);
		}
		return umfahrstrasse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmfahrstrasse_TypeClass_Wert() {
        return (EAttribute)getUmfahrstrasse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUntergruppen_ID_TypeClass() {
		if (untergruppen_ID_TypeClassEClass == null) {
			untergruppen_ID_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(371);
		}
		return untergruppen_ID_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUntergruppen_ID_TypeClass_Wert() {
        return (EAttribute)getUntergruppen_ID_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Befehl_R_TypeClass() {
		if (v_Befehl_R_TypeClassEClass == null) {
			v_Befehl_R_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(373);
		}
		return v_Befehl_R_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Befehl_R_TypeClass_Wert() {
        return (EAttribute)getV_Befehl_R_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Befehl_Z_TypeClass() {
		if (v_Befehl_Z_TypeClassEClass == null) {
			v_Befehl_Z_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(375);
		}
		return v_Befehl_Z_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Befehl_Z_TypeClass_Wert() {
        return (EAttribute)getV_Befehl_Z_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Frei_TypeClass() {
		if (v_Frei_TypeClassEClass == null) {
			v_Frei_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(377);
		}
		return v_Frei_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Frei_TypeClass_Wert() {
        return (EAttribute)getV_Frei_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Zul_Strecke_TypeClass() {
		if (v_Zul_Strecke_TypeClassEClass == null) {
			v_Zul_Strecke_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(379);
		}
		return v_Zul_Strecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getV_Zul_Strecke_TypeClass_Wert() {
        return (EAttribute)getV_Zul_Strecke_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbot_Anhalten_TypeClass() {
		if (verbot_Anhalten_TypeClassEClass == null) {
			verbot_Anhalten_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(381);
		}
		return verbot_Anhalten_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbot_Anhalten_TypeClass_Wert() {
        return (EAttribute)getVerbot_Anhalten_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbot_Regenerative_Bremse_TypeClass() {
		if (verbot_Regenerative_Bremse_TypeClassEClass == null) {
			verbot_Regenerative_Bremse_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(382);
		}
		return verbot_Regenerative_Bremse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbot_Regenerative_Bremse_TypeClass_Wert() {
        return (EAttribute)getVerbot_Regenerative_Bremse_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbot_WB_Art_TypeClass() {
		if (verbot_WB_Art_TypeClassEClass == null) {
			verbot_WB_Art_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(383);
		}
		return verbot_WB_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbot_WB_Art_TypeClass_Wert() {
        return (EAttribute)getVerbot_WB_Art_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwendung_Als_Rueckfall_TypeClass() {
		if (verwendung_Als_Rueckfall_TypeClassEClass == null) {
			verwendung_Als_Rueckfall_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(384);
		}
		return verwendung_Als_Rueckfall_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwendung_Als_Rueckfall_TypeClass_Wert() {
        return (EAttribute)getVerwendung_Als_Rueckfall_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwendung_TypeClass() {
		if (verwendung_TypeClassEClass == null) {
			verwendung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(386);
		}
		return verwendung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwendung_TypeClass_Wert() {
        return (EAttribute)getVerwendung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVGR_1_TypeClass() {
		if (vgR_1_TypeClassEClass == null) {
			vgR_1_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(388);
		}
		return vgR_1_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVGR_1_TypeClass_Wert() {
        return (EAttribute)getVGR_1_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVGR_2_TypeClass() {
		if (vgR_2_TypeClassEClass == null) {
			vgR_2_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(390);
		}
		return vgR_2_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVGR_2_TypeClass_Wert() {
        return (EAttribute)getVGR_2_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVGR_TypeClass() {
		if (vgR_TypeClassEClass == null) {
			vgR_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(392);
		}
		return vgR_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVGR_TypeClass_Wert() {
        return (EAttribute)getVGR_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVLA_TypeClass() {
		if (vlA_TypeClassEClass == null) {
			vlA_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(394);
		}
		return vlA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLA_TypeClass_Wert() {
        return (EAttribute)getVLA_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVZ_TypeClass() {
		if (vZ_TypeClassEClass == null) {
			vZ_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(396);
		}
		return vZ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVZ_TypeClass_Wert() {
        return (EAttribute)getVZ_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Anschluss_TypeClass() {
		if (w_Anschluss_TypeClassEClass == null) {
			w_Anschluss_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(397);
		}
		return w_Anschluss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Anschluss_TypeClass_Wert() {
        return (EAttribute)getW_Anschluss_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Lage_TypeClass() {
		if (w_Lage_TypeClassEClass == null) {
			w_Lage_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(398);
		}
		return w_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Lage_TypeClass_Wert() {
        return (EAttribute)getW_Lage_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWirkrichtung_In_Datenpunkt_TypeClass() {
		if (wirkrichtung_In_Datenpunkt_TypeClassEClass == null) {
			wirkrichtung_In_Datenpunkt_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(400);
		}
		return wirkrichtung_In_Datenpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWirkrichtung_In_Datenpunkt_TypeClass_Wert() {
        return (EAttribute)getWirkrichtung_In_Datenpunkt_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWirksam_TypeClass() {
		if (wirksam_TypeClassEClass == null) {
			wirksam_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(401);
		}
		return wirksam_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWirksam_TypeClass_Wert() {
        return (EAttribute)getWirksam_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_La_Bereich_Distanz_TypeClass() {
		if (zbS_La_Bereich_Distanz_TypeClassEClass == null) {
			zbS_La_Bereich_Distanz_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(403);
		}
		return zbS_La_Bereich_Distanz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_La_Bereich_Distanz_TypeClass_Wert() {
        return (EAttribute)getZBS_La_Bereich_Distanz_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_La_Bereich_Geschwindigkeit_TypeClass() {
		if (zbS_La_Bereich_Geschwindigkeit_TypeClassEClass == null) {
			zbS_La_Bereich_Geschwindigkeit_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(405);
		}
		return zbS_La_Bereich_Geschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_La_Bereich_Geschwindigkeit_TypeClass_Wert() {
        return (EAttribute)getZBS_La_Bereich_Geschwindigkeit_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_La_Bereich_Laenge_TypeClass() {
		if (zbS_La_Bereich_Laenge_TypeClassEClass == null) {
			zbS_La_Bereich_Laenge_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(407);
		}
		return zbS_La_Bereich_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_La_Bereich_Laenge_TypeClass_Wert() {
        return (EAttribute)getZBS_La_Bereich_Laenge_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_La_Bereich_Neigung_TypeClass() {
		if (zbS_La_Bereich_Neigung_TypeClassEClass == null) {
			zbS_La_Bereich_Neigung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(409);
		}
		return zbS_La_Bereich_Neigung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_La_Bereich_Neigung_TypeClass_Wert() {
        return (EAttribute)getZBS_La_Bereich_Neigung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_Merkmale_AttributeGroup() {
		if (zbS_Merkmale_AttributeGroupEClass == null) {
			zbS_Merkmale_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(410);
		}
		return zbS_Merkmale_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZBS_Merkmale_AttributeGroup_DPLinkArt() {
        return (EReference)getZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZBS_Merkmale_AttributeGroup_ZBSReaktion() {
        return (EReference)getZBS_Merkmale_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZBS_Reaktion_TypeClass() {
		if (zbS_Reaktion_TypeClassEClass == null) {
			zbS_Reaktion_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(411);
		}
		return zbS_Reaktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZBS_Reaktion_TypeClass_Wert() {
        return (EAttribute)getZBS_Reaktion_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZiel_DP_Ausrichtung_TypeClass() {
		if (ziel_DP_Ausrichtung_TypeClassEClass == null) {
			ziel_DP_Ausrichtung_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(412);
		}
		return ziel_DP_Ausrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZiel_DP_Ausrichtung_TypeClass_Wert() {
        return (EAttribute)getZiel_DP_Ausrichtung_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZiel_Ist_Fahrwegende_TypeClass() {
		if (ziel_Ist_Fahrwegende_TypeClassEClass == null) {
			ziel_Ist_Fahrwegende_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(413);
		}
		return ziel_Ist_Fahrwegende_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZiel_Ist_Fahrwegende_TypeClass_Wert() {
        return (EAttribute)getZiel_Ist_Fahrwegende_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZiel_W_Element_AttributeGroup() {
		if (ziel_W_Element_AttributeGroupEClass == null) {
			ziel_W_Element_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(414);
		}
		return ziel_W_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZiel_W_Element_AttributeGroup_IDZielWElement() {
        return (EReference)getZiel_W_Element_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZiel_W_Element_AttributeGroup_WAnschluss() {
        return (EReference)getZiel_W_Element_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZLA_TypeClass() {
		if (zlA_TypeClassEClass == null) {
			zlA_TypeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(416);
		}
		return zlA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZLA_TypeClass_Wert() {
        return (EAttribute)getZLA_TypeClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze() {
		if (zuB_BereichsgrenzeEClass == null) {
			zuB_BereichsgrenzeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(417);
		}
		return zuB_BereichsgrenzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Bezeichnung() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_IDOertlichkeit() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeAllg() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachESG() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachGNT() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachL2() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachLZB() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachOhne() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachPZB() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachSonstige() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_ZUBBgrenzeRBCWechsel() {
        return (EReference)getZUB_Bereichsgrenze().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Allg_AttributeGroup() {
		if (zuB_Bereichsgrenze_Allg_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Allg_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(418);
		}
		return zuB_Bereichsgrenze_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Allg_AttributeGroup_IDElementGrenze() {
        return (EReference)getZUB_Bereichsgrenze_Allg_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Allg_AttributeGroup_IDRBCVorGrenze() {
        return (EReference)getZUB_Bereichsgrenze_Allg_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenze() {
        return (EReference)getZUB_Bereichsgrenze_Allg_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenzeBesonders() {
        return (EReference)getZUB_Bereichsgrenze_Allg_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup() {
		if (zuB_Bereichsgrenze_Bezeichnung_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(419);
		}
		return zuB_Bereichsgrenze_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup_BezZUBBereichsgrenze() {
        return (EReference)getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_ESG_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_ESG_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(420);
		}
		return zuB_Bereichsgrenze_Nach_ESG_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_BgrenzeNachESGBedAusstieg() {
        return (EReference)getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_HarterAusstiegAusL2() {
        return (EReference)getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_Prioritaet() {
        return (EReference)getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_GNT_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_GNT_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_GNT_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(421);
		}
		return zuB_Bereichsgrenze_Nach_GNT_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_L2_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_L2_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_L2_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(422);
		}
		return zuB_Bereichsgrenze_Nach_L2_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_AbstandGrenzeBereichC() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BaselineSRS() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BgrenzeNachL2BedEinstieg() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_EinstiegOhneRueckwSig() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDRBCNachGrenze() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDSignalZufahrtsicherungL2oS() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_Prioritaet() {
        return (EReference)getZUB_Bereichsgrenze_Nach_L2_AttributeGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_LZB_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_LZB_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(423);
		}
		return zuB_Bereichsgrenze_Nach_LZB_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_BgrenzeNachLZBBedEinstieg() {
        return (EReference)getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_HarterAusstiegAusL2() {
        return (EReference)getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_Prioritaet() {
        return (EReference)getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_Ohne_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_Ohne_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(424);
		}
		return zuB_Bereichsgrenze_Nach_Ohne_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup_BgrenzeNachOhneBedEinstieg() {
        return (EReference)getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_PZB_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_PZB_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(425);
		}
		return zuB_Bereichsgrenze_Nach_PZB_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup_BgrenzeNachPZBBedEinstieg() {
        return (EReference)getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup_HarterAusstiegAusL2() {
        return (EReference)getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup_Prioritaet() {
        return (EReference)getZUB_Bereichsgrenze_Nach_PZB_AttributeGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup() {
		if (zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroupEClass == null) {
			zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(426);
		}
		return zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_BezeichnungZUB() {
        return (EReference)getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_LaengeAusfuehrungsbereich() {
        return (EReference)getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Bgrenze_RBC_Wechsel_AttributeGroup() {
		if (zuB_Bgrenze_RBC_Wechsel_AttributeGroupEClass == null) {
			zuB_Bgrenze_RBC_Wechsel_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(427);
		}
		return zuB_Bgrenze_RBC_Wechsel_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_BgrenzeRBCWechselBTSKette() {
        return (EReference)getZUB_Bgrenze_RBC_Wechsel_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_IDRBCNachGrenze() {
        return (EReference)getZUB_Bgrenze_RBC_Wechsel_AttributeGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_SE_Ausruestung_AttributeGroup() {
		if (zuB_SE_Ausruestung_AttributeGroupEClass == null) {
			zuB_SE_Ausruestung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(428);
		}
		return zuB_SE_Ausruestung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_SE_Ausruestung_AttributeGroup_Anwendungssystem() {
        return (EReference)getZUB_SE_Ausruestung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Streckeneigenschaft() {
		if (zuB_StreckeneigenschaftEClass == null) {
			zuB_StreckeneigenschaftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(429);
		}
		return zuB_StreckeneigenschaftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_Bezeichnung() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_Metallteil() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_OberstrombegrenzungGueterzug() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_OberstrombegrenzungReisezug() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_VerbotAnhalten() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_VerbotRegenerativeBremse() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_VerbotWBArt() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_ZUBSEAusruestung() {
        return (EReference)getZUB_Streckeneigenschaft().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup() {
		if (zuB_Streckeneigenschaft_Bezeichnung_AttributeGroupEClass == null) {
			zuB_Streckeneigenschaft_Bezeichnung_AttributeGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(430);
		}
		return zuB_Streckeneigenschaft_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup_BezeichnungZUBSE() {
        return (EReference)getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMArtBedingung() {
		if (enumArtBedingungEEnum == null) {
			enumArtBedingungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(109);
		}
		return enumArtBedingungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAusstiegETCSSperre() {
		if (enumAusstiegETCSSperreEEnum == null) {
			enumAusstiegETCSSperreEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(111);
		}
		return enumAusstiegETCSSperreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPBezugBetrieblichArt() {
		if (enumdpBezugBetrieblichArtEEnum == null) {
			enumdpBezugBetrieblichArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(113);
		}
		return enumdpBezugBetrieblichArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPLinkArt() {
		if (enumdpLinkArtEEnum == null) {
			enumdpLinkArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(115);
		}
		return enumdpLinkArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPTypArt() {
		if (enumdpTypArtEEnum == null) {
			enumdpTypArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(117);
		}
		return enumdpTypArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPTypESG() {
		if (enumdpTypESGEEnum == null) {
			enumdpTypESGEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(119);
		}
		return enumdpTypESGEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPTypGNT() {
		if (enumdpTypGNTEEnum == null) {
			enumdpTypGNTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(121);
		}
		return enumdpTypGNTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPTypTrans() {
		if (enumdpTypTransEEnum == null) {
			enumdpTypTransEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(123);
		}
		return enumdpTypTransEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMDPTypZBS() {
		if (enumdpTypZBSEEnum == null) {
			enumdpTypZBSEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(125);
		}
		return enumdpTypZBSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMEinzeldateiArt() {
		if (enumEinzeldateiArtEEnum == null) {
			enumEinzeldateiArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(127);
		}
		return enumEinzeldateiArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMEnergieEingangArt() {
		if (enumEnergieEingangArtEEnum == null) {
			enumEnergieEingangArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(129);
		}
		return enumEnergieEingangArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMETCSKnotenArtSonstige() {
		if (enumetcsKnotenArtSonstigeEEnum == null) {
			enumetcsKnotenArtSonstigeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(131);
		}
		return enumetcsKnotenArtSonstigeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMEVModulArt() {
		if (enumevModulArtEEnum == null) {
			enumevModulArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(133);
		}
		return enumevModulArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFTGNTPunktart() {
		if (enumftgntPunktartEEnum == null) {
			enumftgntPunktartEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(135);
		}
		return enumftgntPunktartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFTHinweisFunktion() {
		if (enumftHinweisFunktionEEnum == null) {
			enumftHinweisFunktionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(137);
		}
		return enumftHinweisFunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFTZBSTyp() {
		if (enumftzbsTypEEnum == null) {
			enumftzbsTypEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(139);
		}
		return enumftzbsTypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLEUModulArt() {
		if (enumleuModulArtEEnum == null) {
			enumleuModulArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(141);
		}
		return enumleuModulArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMLEVELTR() {
		if (enummleveltrEEnum == null) {
			enummleveltrEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(143);
		}
		return enummleveltrEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNIDSTM() {
		if (enumnidstmEEnum == null) {
			enumnidstmEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(145);
		}
		return enumnidstmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPosition() {
		if (enumPositionEEnum == null) {
			enumPositionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(147);
		}
		return enumPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSBE() {
		if (enumsbeEEnum == null) {
			enumsbeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(149);
		}
		return enumsbeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSpannungArt() {
		if (enumSpannungArtEEnum == null) {
			enumSpannungArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(151);
		}
		return enumSpannungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStandortangabeBalisenschild() {
		if (enumStandortangabeBalisenschildEEnum == null) {
			enumStandortangabeBalisenschildEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(153);
		}
		return enumStandortangabeBalisenschildEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSTZ() {
		if (enumstzEEnum == null) {
			enumstzEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(155);
		}
		return enumstzEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMVerbotWBArt() {
		if (enumVerbotWBArtEEnum == null) {
			enumVerbotWBArtEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(157);
		}
		return enumVerbotWBArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMVerwendungAlsRueckfall() {
		if (enumVerwendungAlsRueckfallEEnum == null) {
			enumVerwendungAlsRueckfallEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(159);
		}
		return enumVerwendungAlsRueckfallEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWAnschluss() {
		if (enumwAnschlussEEnum == null) {
			enumwAnschlussEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(161);
		}
		return enumwAnschlussEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZBSReaktion() {
		if (enumzbsReaktionEEnum == null) {
			enumzbsReaktionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(163);
		}
		return enumzbsReaktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbstand_Grenze_Bereich_C_Type() {
		if (abstand_Grenze_Bereich_C_TypeEDataType == null) {
			abstand_Grenze_Bereich_C_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstand_Grenze_Bereich_C_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnlagenteil_Sonstige_Type() {
		if (anlagenteil_Sonstige_TypeEDataType == null) {
			anlagenteil_Sonstige_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(2);
		}
		return anlagenteil_Sonstige_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnordnung_Im_DP_Type() {
		if (anordnung_Im_DP_TypeEDataType == null) {
			anordnung_Im_DP_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(4);
		}
		return anordnung_Im_DP_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnwendung_Sonst_Type() {
		if (anwendung_Sonst_TypeEDataType == null) {
			anwendung_Sonst_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(6);
		}
		return anwendung_Sonst_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnzahl_Voll_LEU_Kalkuliert_Type() {
		if (anzahl_Voll_LEU_Kalkuliert_TypeEDataType == null) {
			anzahl_Voll_LEU_Kalkuliert_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(9);
		}
		return anzahl_Voll_LEU_Kalkuliert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnzeigetext_Type() {
		if (anzeigetext_TypeEDataType == null) {
			anzeigetext_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(11);
		}
		return anzeigetext_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAusgang_Nr_Type() {
		if (ausgang_Nr_TypeEDataType == null) {
			ausgang_Nr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(14);
		}
		return ausgang_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaseline_SRS_Type() {
		if (baseline_SRS_TypeEDataType == null) {
			baseline_SRS_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(20);
		}
		return baseline_SRS_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBedingung_Weichenlage_Type() {
		if (bedingung_Weichenlage_TypeEDataType == null) {
			bedingung_Weichenlage_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(27);
		}
		return bedingung_Weichenlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Strecke_BTS_1_Type() {
		if (bez_Strecke_BTS_1_TypeEDataType == null) {
			bez_Strecke_BTS_1_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(29);
		}
		return bez_Strecke_BTS_1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Strecke_BTS_2_Type() {
		if (bez_Strecke_BTS_2_TypeEDataType == null) {
			bez_Strecke_BTS_2_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(31);
		}
		return bez_Strecke_BTS_2_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Strecke_BTS_3_Type() {
		if (bez_Strecke_BTS_3_TypeEDataType == null) {
			bez_Strecke_BTS_3_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(33);
		}
		return bez_Strecke_BTS_3_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_ZUB_Bereichsgrenze_Type() {
		if (bez_ZUB_Bereichsgrenze_TypeEDataType == null) {
			bez_ZUB_Bereichsgrenze_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(35);
		}
		return bez_ZUB_Bereichsgrenze_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_ETCS_Kante_Type() {
		if (bezeichnung_ETCS_Kante_TypeEDataType == null) {
			bezeichnung_ETCS_Kante_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(37);
		}
		return bezeichnung_ETCS_Kante_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_LEU_Anlage_Type() {
		if (bezeichnung_LEU_Anlage_TypeEDataType == null) {
			bezeichnung_LEU_Anlage_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(39);
		}
		return bezeichnung_LEU_Anlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_ZUB_SE_Type() {
		if (bezeichnung_ZUB_SE_TypeEDataType == null) {
			bezeichnung_ZUB_SE_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(41);
		}
		return bezeichnung_ZUB_SE_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_ZUB_Type() {
		if (bezeichnung_ZUB_TypeEDataType == null) {
			bezeichnung_ZUB_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(43);
		}
		return bezeichnung_ZUB_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getD_LEVELTR_Type() {
		if (d_LEVELTR_TypeEDataType == null) {
			d_LEVELTR_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(54);
		}
		return d_LEVELTR_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateityp_Binaerdatei_Type() {
		if (dateityp_Binaerdatei_TypeEDataType == null) {
			dateityp_Binaerdatei_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(57);
		}
		return dateityp_Binaerdatei_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatenpunkt_Beschreibung_Type() {
		if (datenpunkt_Beschreibung_TypeEDataType == null) {
			datenpunkt_Beschreibung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(62);
		}
		return datenpunkt_Beschreibung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatenpunkt_Laenge_Type() {
		if (datenpunkt_Laenge_TypeEDataType == null) {
			datenpunkt_Laenge_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(64);
		}
		return datenpunkt_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDelta_VGES_Type() {
		if (delta_VGES_TypeEDataType == null) {
			delta_VGES_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(67);
		}
		return delta_VGES_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDelta_VLES_Type() {
		if (delta_VLES_TypeEDataType == null) {
			delta_VLES_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(69);
		}
		return delta_VLES_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDelta_VZES_Type() {
		if (delta_VZES_TypeEDataType == null) {
			delta_VZES_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(71);
		}
		return delta_VZES_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDP_Typ_ETCS_Type() {
		if (dP_Typ_ETCS_TypeEDataType == null) {
			dP_Typ_ETCS_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(82);
		}
		return dP_Typ_ETCS_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDP_Typ_Sonst_Type() {
		if (dP_Typ_Sonst_TypeEDataType == null) {
			dP_Typ_Sonst_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(91);
		}
		return dP_Typ_Sonst_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDP_Typ_V_La_Type() {
		if (dP_Typ_V_La_TypeEDataType == null) {
			dP_Typ_V_La_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(94);
		}
		return dP_Typ_V_La_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_Intervall_200_Type() {
		if (dWeg_Intervall_200_TypeEDataType == null) {
			dWeg_Intervall_200_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(98);
		}
		return dWeg_Intervall_200_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_Intervall_50_200_Type() {
		if (dWeg_Intervall_50_200_TypeEDataType == null) {
			dWeg_Intervall_50_200_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(100);
		}
		return dWeg_Intervall_50_200_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_Intervall_50_Type() {
		if (dWeg_Intervall_50_TypeEDataType == null) {
			dWeg_Intervall_50_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(102);
		}
		return dWeg_Intervall_50_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMArtBedingungObject() {
		if (enumArtBedingungObjectEDataType == null) {
			enumArtBedingungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(110);
		}
		return enumArtBedingungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAusstiegETCSSperreObject() {
		if (enumAusstiegETCSSperreObjectEDataType == null) {
			enumAusstiegETCSSperreObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(112);
		}
		return enumAusstiegETCSSperreObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPBezugBetrieblichArtObject() {
		if (enumdpBezugBetrieblichArtObjectEDataType == null) {
			enumdpBezugBetrieblichArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(114);
		}
		return enumdpBezugBetrieblichArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPLinkArtObject() {
		if (enumdpLinkArtObjectEDataType == null) {
			enumdpLinkArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(116);
		}
		return enumdpLinkArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPTypArtObject() {
		if (enumdpTypArtObjectEDataType == null) {
			enumdpTypArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(118);
		}
		return enumdpTypArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPTypESGObject() {
		if (enumdpTypESGObjectEDataType == null) {
			enumdpTypESGObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(120);
		}
		return enumdpTypESGObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPTypGNTObject() {
		if (enumdpTypGNTObjectEDataType == null) {
			enumdpTypGNTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(122);
		}
		return enumdpTypGNTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPTypTransObject() {
		if (enumdpTypTransObjectEDataType == null) {
			enumdpTypTransObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(124);
		}
		return enumdpTypTransObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMDPTypZBSObject() {
		if (enumdpTypZBSObjectEDataType == null) {
			enumdpTypZBSObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(126);
		}
		return enumdpTypZBSObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMEinzeldateiArtObject() {
		if (enumEinzeldateiArtObjectEDataType == null) {
			enumEinzeldateiArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(128);
		}
		return enumEinzeldateiArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMEnergieEingangArtObject() {
		if (enumEnergieEingangArtObjectEDataType == null) {
			enumEnergieEingangArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(130);
		}
		return enumEnergieEingangArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMETCSKnotenArtSonstigeObject() {
		if (enumetcsKnotenArtSonstigeObjectEDataType == null) {
			enumetcsKnotenArtSonstigeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(132);
		}
		return enumetcsKnotenArtSonstigeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMEVModulArtObject() {
		if (enumevModulArtObjectEDataType == null) {
			enumevModulArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(134);
		}
		return enumevModulArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFTGNTPunktartObject() {
		if (enumftgntPunktartObjectEDataType == null) {
			enumftgntPunktartObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(136);
		}
		return enumftgntPunktartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFTHinweisFunktionObject() {
		if (enumftHinweisFunktionObjectEDataType == null) {
			enumftHinweisFunktionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(138);
		}
		return enumftHinweisFunktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFTZBSTypObject() {
		if (enumftzbsTypObjectEDataType == null) {
			enumftzbsTypObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(140);
		}
		return enumftzbsTypObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLEUModulArtObject() {
		if (enumleuModulArtObjectEDataType == null) {
			enumleuModulArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(142);
		}
		return enumleuModulArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMLEVELTRObject() {
		if (enummleveltrObjectEDataType == null) {
			enummleveltrObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(144);
		}
		return enummleveltrObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNIDSTMObject() {
		if (enumnidstmObjectEDataType == null) {
			enumnidstmObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(146);
		}
		return enumnidstmObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPositionObject() {
		if (enumPositionObjectEDataType == null) {
			enumPositionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(148);
		}
		return enumPositionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSBEObject() {
		if (enumsbeObjectEDataType == null) {
			enumsbeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(150);
		}
		return enumsbeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSpannungArtObject() {
		if (enumSpannungArtObjectEDataType == null) {
			enumSpannungArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(152);
		}
		return enumSpannungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStandortangabeBalisenschildObject() {
		if (enumStandortangabeBalisenschildObjectEDataType == null) {
			enumStandortangabeBalisenschildObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(154);
		}
		return enumStandortangabeBalisenschildObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSTZObject() {
		if (enumstzObjectEDataType == null) {
			enumstzObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(156);
		}
		return enumstzObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMVerbotWBArtObject() {
		if (enumVerbotWBArtObjectEDataType == null) {
			enumVerbotWBArtObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(158);
		}
		return enumVerbotWBArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMVerwendungAlsRueckfallObject() {
		if (enumVerwendungAlsRueckfallObjectEDataType == null) {
			enumVerwendungAlsRueckfallObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(160);
		}
		return enumVerwendungAlsRueckfallObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWAnschlussObject() {
		if (enumwAnschlussObjectEDataType == null) {
			enumwAnschlussObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(162);
		}
		return enumwAnschlussObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZBSReaktionObject() {
		if (enumzbsReaktionObjectEDataType == null) {
			enumzbsReaktionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(164);
		}
		return enumzbsReaktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getESG_Ind_Erlaeuterung_Type() {
		if (esG_Ind_Erlaeuterung_TypeEDataType == null) {
			esG_Ind_Erlaeuterung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(165);
		}
		return esG_Ind_Erlaeuterung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getESG_Ind_Parameter_Type() {
		if (esG_Ind_Parameter_TypeEDataType == null) {
			esG_Ind_Parameter_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(167);
		}
		return esG_Ind_Parameter_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getESG_Ind_Parameterwert_Type() {
		if (esG_Ind_Parameterwert_TypeEDataType == null) {
			esG_Ind_Parameterwert_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(169);
		}
		return esG_Ind_Parameterwert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Adresse_Kennung_Type() {
		if (etcS_Adresse_Kennung_TypeEDataType == null) {
			etcS_Adresse_Kennung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(174);
		}
		return etcS_Adresse_Kennung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Adresse_NID_BG_Type() {
		if (etcS_Adresse_NID_BG_TypeEDataType == null) {
			etcS_Adresse_NID_BG_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(176);
		}
		return etcS_Adresse_NID_BG_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Adresse_NID_C_Type() {
		if (etcS_Adresse_NID_C_TypeEDataType == null) {
			etcS_Adresse_NID_C_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(178);
		}
		return etcS_Adresse_NID_C_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Kennung_Type() {
		if (etcS_Kennung_TypeEDataType == null) {
			etcS_Kennung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(182);
		}
		return etcS_Kennung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Paketnummer_Type() {
		if (etcS_Paketnummer_TypeEDataType == null) {
			etcS_Paketnummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(186);
		}
		return etcS_Paketnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Par_Erlaeuterung_Type() {
		if (etcS_Par_Erlaeuterung_TypeEDataType == null) {
			etcS_Par_Erlaeuterung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(188);
		}
		return etcS_Par_Erlaeuterung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Parametername_Type() {
		if (etcS_Parametername_TypeEDataType == null) {
			etcS_Parametername_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(190);
		}
		return etcS_Parametername_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getETCS_Parameterwert_Type() {
		if (etcS_Parameterwert_TypeEDataType == null) {
			etcS_Parameterwert_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(192);
		}
		return etcS_Parameterwert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEV_Modul_Typ_Type() {
		if (eV_Modul_Typ_TypeEDataType == null) {
			eV_Modul_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(206);
		}
		return eV_Modul_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFabrikat_Type() {
		if (fabrikat_TypeEDataType == null) {
			fabrikat_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(209);
		}
		return fabrikat_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFT_ESG_Subtyp_Type() {
		if (fT_ESG_Subtyp_TypeEDataType == null) {
			fT_ESG_Subtyp_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(214);
		}
		return fT_ESG_Subtyp_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFT_ESG_Typ_Type() {
		if (fT_ESG_Typ_TypeEDataType == null) {
			fT_ESG_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(216);
		}
		return fT_ESG_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFT_ETCS_L2_Typ_Type() {
		if (fT_ETCS_L2_Typ_TypeEDataType == null) {
			fT_ETCS_L2_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(219);
		}
		return fT_ETCS_L2_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGruppen_ID_Type() {
		if (gruppen_ID_TypeEDataType == null) {
			gruppen_ID_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(234);
		}
		return gruppen_ID_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHinweis_Balisenbefestigung_Type() {
		if (hinweis_Balisenbefestigung_TypeEDataType == null) {
			hinweis_Balisenbefestigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(238);
		}
		return hinweis_Balisenbefestigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKm_BTS_1_Type() {
		if (km_BTS_1_TypeEDataType == null) {
			km_BTS_1_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(242);
		}
		return km_BTS_1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKm_BTS_2_Type() {
		if (km_BTS_2_TypeEDataType == null) {
			km_BTS_2_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(244);
		}
		return km_BTS_2_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKm_BTS_3_Type() {
		if (km_BTS_3_TypeEDataType == null) {
			km_BTS_3_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(246);
		}
		return km_BTS_3_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKonfigurationskennung_Type() {
		if (konfigurationskennung_TypeEDataType == null) {
			konfigurationskennung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(249);
		}
		return konfigurationskennung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getL_ACKLEVELTR_Type() {
		if (l_ACKLEVELTR_TypeEDataType == null) {
			l_ACKLEVELTR_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(251);
		}
		return l_ACKLEVELTR_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaenge_1_Type() {
		if (laenge_1_TypeEDataType == null) {
			laenge_1_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(253);
		}
		return laenge_1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaenge_Ausfuehrungsbereich_Type() {
		if (laenge_Ausfuehrungsbereich_TypeEDataType == null) {
			laenge_Ausfuehrungsbereich_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(255);
		}
		return laenge_Ausfuehrungsbereich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLEU_Ausgang_Nr_Type() {
		if (leU_Ausgang_Nr_TypeEDataType == null) {
			leU_Ausgang_Nr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(260);
		}
		return leU_Ausgang_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLEU_Modul_Typ_Type() {
		if (leU_Modul_Typ_TypeEDataType == null) {
			leU_Modul_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(267);
		}
		return leU_Modul_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLEU_Schaltkasten_Typ_Type() {
		if (leU_Schaltkasten_Typ_TypeEDataType == null) {
			leU_Schaltkasten_Typ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(273);
		}
		return leU_Schaltkasten_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLfd_Nr_Am_Bezugspunkt_Type() {
		if (lfd_Nr_Am_Bezugspunkt_TypeEDataType == null) {
			lfd_Nr_Am_Bezugspunkt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(276);
		}
		return lfd_Nr_Am_Bezugspunkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLfdNr_in_Telegr_Spec_Type() {
		if (lfdNr_in_Telegr_Spec_TypeEDataType == null) {
			lfdNr_in_Telegr_Spec_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(278);
		}
		return lfdNr_in_Telegr_Spec_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLink_Distanz_Type() {
		if (link_Distanz_TypeEDataType == null) {
			link_Distanz_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(280);
		}
		return link_Distanz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLLA_Type() {
		if (llA_TypeEDataType == null) {
			llA_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(282);
		}
		return llA_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMassgebende_Neig_1_Type() {
		if (massgebende_Neig_1_TypeEDataType == null) {
			massgebende_Neig_1_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(287);
		}
		return massgebende_Neig_1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMassgebende_Neig_Schutzstrecke_Type() {
		if (massgebende_Neig_Schutzstrecke_TypeEDataType == null) {
			massgebende_Neig_Schutzstrecke_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(289);
		}
		return massgebende_Neig_Schutzstrecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMax_Leistung_Type() {
		if (max_Leistung_TypeEDataType == null) {
			max_Leistung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(292);
		}
		return max_Leistung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMax_Unterbrechungszeit_Type() {
		if (max_Unterbrechungszeit_TypeEDataType == null) {
			max_Unterbrechungszeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(294);
		}
		return max_Unterbrechungszeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMetallteil_Type() {
		if (metallteil_TypeEDataType == null) {
			metallteil_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(296);
		}
		return metallteil_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModulnummer_Type() {
		if (modulnummer_TypeEDataType == null) {
			modulnummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(298);
		}
		return modulnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNeigung_Type() {
		if (neigung_TypeEDataType == null) {
			neigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(300);
		}
		return neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNennleistung_Type() {
		if (nennleistung_TypeEDataType == null) {
			nennleistung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(302);
		}
		return nennleistung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_C_Type() {
		if (niD_C_TypeEDataType == null) {
			niD_C_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(304);
		}
		return niD_C_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_RBC_Type() {
		if (niD_RBC_TypeEDataType == null) {
			niD_RBC_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(306);
		}
		return niD_RBC_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNummer_Schaltkasten_Type() {
		if (nummer_Schaltkasten_TypeEDataType == null) {
			nummer_Schaltkasten_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(309);
		}
		return nummer_Schaltkasten_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOberstrombegrenzung_Gueterzug_Type() {
		if (oberstrombegrenzung_Gueterzug_TypeEDataType == null) {
			oberstrombegrenzung_Gueterzug_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(311);
		}
		return oberstrombegrenzung_Gueterzug_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOberstrombegrenzung_Reisezug_Type() {
		if (oberstrombegrenzung_Reisezug_TypeEDataType == null) {
			oberstrombegrenzung_Reisezug_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(313);
		}
		return oberstrombegrenzung_Reisezug_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPort_Nr_Ausg_Physisch_Type() {
		if (port_Nr_Ausg_Physisch_TypeEDataType == null) {
			port_Nr_Ausg_Physisch_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(315);
		}
		return port_Nr_Ausg_Physisch_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPosition_Sonstige_Type() {
		if (position_Sonstige_TypeEDataType == null) {
			position_Sonstige_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(317);
		}
		return position_Sonstige_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrioritaet_Type() {
		if (prioritaet_TypeEDataType == null) {
			prioritaet_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(321);
		}
		return prioritaet_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRBC_SRS_Unterversion_Type() {
		if (rbC_SRS_Unterversion_TypeEDataType == null) {
			rbC_SRS_Unterversion_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(327);
		}
		return rbC_SRS_Unterversion_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRBC_SRS_Version_Type() {
		if (rbC_SRS_Version_TypeEDataType == null) {
			rbC_SRS_Version_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(329);
		}
		return rbC_SRS_Version_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRekursion_2_Nr_Type() {
		if (rekursion_2_Nr_TypeEDataType == null) {
			rekursion_2_Nr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(331);
		}
		return rekursion_2_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRekursion_Nr_Type() {
		if (rekursion_Nr_TypeEDataType == null) {
			rekursion_Nr_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(333);
		}
		return rekursion_Nr_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRufnummer_Type() {
		if (rufnummer_TypeEDataType == null) {
			rufnummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(335);
		}
		return rufnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchutzstrecke_Erforderlich_Type() {
		if (schutzstrecke_Erforderlich_TypeEDataType == null) {
			schutzstrecke_Erforderlich_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(338);
		}
		return schutzstrecke_Erforderlich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSchutzstrecke_Vorhanden_Type() {
		if (schutzstrecke_Vorhanden_TypeEDataType == null) {
			schutzstrecke_Vorhanden_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(340);
		}
		return schutzstrecke_Vorhanden_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSonstige_Standortangabe_Type() {
		if (sonstige_Standortangabe_TypeEDataType == null) {
			sonstige_Standortangabe_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(342);
		}
		return sonstige_Standortangabe_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpannung_Toleranz_Obere_Type() {
		if (spannung_Toleranz_Obere_TypeEDataType == null) {
			spannung_Toleranz_Obere_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(345);
		}
		return spannung_Toleranz_Obere_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSpannung_Toleranz_Untere_Type() {
		if (spannung_Toleranz_Untere_TypeEDataType == null) {
			spannung_Toleranz_Untere_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(347);
		}
		return spannung_Toleranz_Untere_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSRS_Unterversion_Type() {
		if (srS_Unterversion_TypeEDataType == null) {
			srS_Unterversion_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(349);
		}
		return srS_Unterversion_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSRS_Version_Type() {
		if (srS_Version_TypeEDataType == null) {
			srS_Version_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(351);
		}
		return srS_Version_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSystem_Vor_Grenze_Besonders_Type() {
		if (system_Vor_Grenze_Besonders_TypeEDataType == null) {
			system_Vor_Grenze_Besonders_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(356);
		}
		return system_Vor_Grenze_Besonders_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTBV_Tunnelbereich_Laenge_Type() {
		if (tbV_Tunnelbereich_Laenge_TypeEDataType == null) {
			tbV_Tunnelbereich_Laenge_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(360);
		}
		return tbV_Tunnelbereich_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTelegrammnummer_Type() {
		if (telegrammnummer_TypeEDataType == null) {
			telegrammnummer_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(363);
		}
		return telegrammnummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getText_Bedingung_Type() {
		if (text_Bedingung_TypeEDataType == null) {
			text_Bedingung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(365);
		}
		return text_Bedingung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUeberbrueckung_EV_Unterbrechung_Type() {
		if (ueberbrueckung_EV_Unterbrechung_TypeEDataType == null) {
			ueberbrueckung_EV_Unterbrechung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(367);
		}
		return ueberbrueckung_EV_Unterbrechung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUntergruppen_ID_Type() {
		if (untergruppen_ID_TypeEDataType == null) {
			untergruppen_ID_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(370);
		}
		return untergruppen_ID_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Befehl_R_Type() {
		if (v_Befehl_R_TypeEDataType == null) {
			v_Befehl_R_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(372);
		}
		return v_Befehl_R_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Befehl_Z_Type() {
		if (v_Befehl_Z_TypeEDataType == null) {
			v_Befehl_Z_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(374);
		}
		return v_Befehl_Z_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Frei_Type() {
		if (v_Frei_TypeEDataType == null) {
			v_Frei_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(376);
		}
		return v_Frei_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getV_Zul_Strecke_Type() {
		if (v_Zul_Strecke_TypeEDataType == null) {
			v_Zul_Strecke_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(378);
		}
		return v_Zul_Strecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerbot_Anhalten_Type() {
		if (verbot_Anhalten_TypeEDataType == null) {
			verbot_Anhalten_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(380);
		}
		return verbot_Anhalten_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerwendung_Type() {
		if (verwendung_TypeEDataType == null) {
			verwendung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(385);
		}
		return verwendung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVGR_1_Type() {
		if (vgR_1_TypeEDataType == null) {
			vgR_1_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(387);
		}
		return vgR_1_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVGR_2_Type() {
		if (vgR_2_TypeEDataType == null) {
			vgR_2_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(389);
		}
		return vgR_2_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVGR_Type() {
		if (vgR_TypeEDataType == null) {
			vgR_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(391);
		}
		return vgR_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVLA_Type() {
		if (vlA_TypeEDataType == null) {
			vlA_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(393);
		}
		return vlA_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVZ_Type() {
		if (vZ_TypeEDataType == null) {
			vZ_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(395);
		}
		return vZ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWirkrichtung_In_Datenpunkt_Type() {
		if (wirkrichtung_In_Datenpunkt_TypeEDataType == null) {
			wirkrichtung_In_Datenpunkt_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(399);
		}
		return wirkrichtung_In_Datenpunkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZBS_La_Bereich_Distanz_Type() {
		if (zbS_La_Bereich_Distanz_TypeEDataType == null) {
			zbS_La_Bereich_Distanz_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(402);
		}
		return zbS_La_Bereich_Distanz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZBS_La_Bereich_Geschwindigkeit_Type() {
		if (zbS_La_Bereich_Geschwindigkeit_TypeEDataType == null) {
			zbS_La_Bereich_Geschwindigkeit_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(404);
		}
		return zbS_La_Bereich_Geschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZBS_La_Bereich_Laenge_Type() {
		if (zbS_La_Bereich_Laenge_TypeEDataType == null) {
			zbS_La_Bereich_Laenge_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(406);
		}
		return zbS_La_Bereich_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZBS_La_Bereich_Neigung_Type() {
		if (zbS_La_Bereich_Neigung_TypeEDataType == null) {
			zbS_La_Bereich_Neigung_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(408);
		}
		return zbS_La_Bereich_Neigung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZLA_Type() {
		if (zlA_TypeEDataType == null) {
			zlA_TypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI).getEClassifiers().get(415);
		}
		return zlA_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balisentechnik_ETCSFactory getBalisentechnik_ETCSFactory() {
		return (Balisentechnik_ETCSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.set.model.model1902.Balisentechnik_ETCS." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Balisentechnik_ETCSPackageImpl
