/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.*;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage
 * @generated
 */
public class Balisentechnik_ETCSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Balisentechnik_ETCSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balisentechnik_ETCSSwitch() {
		if (modelPackage == null) {
			modelPackage = Balisentechnik_ETCSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Balisentechnik_ETCSPackage.ABSTAND_GRENZE_BEREICH_CTYPE_CLASS: {
				Abstand_Grenze_Bereich_C_TypeClass abstand_Grenze_Bereich_C_TypeClass = (Abstand_Grenze_Bereich_C_TypeClass)theEObject;
				T result = caseAbstand_Grenze_Bereich_C_TypeClass(abstand_Grenze_Bereich_C_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(abstand_Grenze_Bereich_C_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANLAGENTEIL_SONSTIGE_TYPE_CLASS: {
				Anlagenteil_Sonstige_TypeClass anlagenteil_Sonstige_TypeClass = (Anlagenteil_Sonstige_TypeClass)theEObject;
				T result = caseAnlagenteil_Sonstige_TypeClass(anlagenteil_Sonstige_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anlagenteil_Sonstige_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANORDNUNG_IM_DP_TYPE_CLASS: {
				Anordnung_Im_DP_TypeClass anordnung_Im_DP_TypeClass = (Anordnung_Im_DP_TypeClass)theEObject;
				T result = caseAnordnung_Im_DP_TypeClass(anordnung_Im_DP_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anordnung_Im_DP_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANWENDUNG_SONST_TYPE_CLASS: {
				Anwendung_Sonst_TypeClass anwendung_Sonst_TypeClass = (Anwendung_Sonst_TypeClass)theEObject;
				T result = caseAnwendung_Sonst_TypeClass(anwendung_Sonst_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anwendung_Sonst_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANWENDUNGSSYSTEM_TYPE_CLASS: {
				Anwendungssystem_TypeClass anwendungssystem_TypeClass = (Anwendungssystem_TypeClass)theEObject;
				T result = caseAnwendungssystem_TypeClass(anwendungssystem_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anwendungssystem_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANZAHL_VOLL_LEU_KALKULIERT_TYPE_CLASS: {
				Anzahl_Voll_LEU_Kalkuliert_TypeClass anzahl_Voll_LEU_Kalkuliert_TypeClass = (Anzahl_Voll_LEU_Kalkuliert_TypeClass)theEObject;
				T result = caseAnzahl_Voll_LEU_Kalkuliert_TypeClass(anzahl_Voll_LEU_Kalkuliert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anzahl_Voll_LEU_Kalkuliert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ANZEIGETEXT_TYPE_CLASS: {
				Anzeigetext_TypeClass anzeigetext_TypeClass = (Anzeigetext_TypeClass)theEObject;
				T result = caseAnzeigetext_TypeClass(anzeigetext_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anzeigetext_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ART_BEDINGUNG_TYPE_CLASS: {
				Art_Bedingung_TypeClass art_Bedingung_TypeClass = (Art_Bedingung_TypeClass)theEObject;
				T result = caseArt_Bedingung_TypeClass(art_Bedingung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(art_Bedingung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.AUSGANG_NR_TYPE_CLASS: {
				Ausgang_Nr_TypeClass ausgang_Nr_TypeClass = (Ausgang_Nr_TypeClass)theEObject;
				T result = caseAusgang_Nr_TypeClass(ausgang_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausgang_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.AUSRICHTUNG_TYPE_CLASS: {
				Ausrichtung_TypeClass ausrichtung_TypeClass = (Ausrichtung_TypeClass)theEObject;
				T result = caseAusrichtung_TypeClass(ausrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.AUSSTIEG_ETCS_SPERRE_TYPE_CLASS: {
				Ausstieg_ETCS_Sperre_TypeClass ausstieg_ETCS_Sperre_TypeClass = (Ausstieg_ETCS_Sperre_TypeClass)theEObject;
				T result = caseAusstieg_ETCS_Sperre_TypeClass(ausstieg_ETCS_Sperre_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ausstieg_ETCS_Sperre_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BALISE: {
				Balise balise = (Balise)theEObject;
				T result = caseBalise(balise);
				if (result == null) result = caseBasis_Objekt(balise);
				if (result == null) result = caseUr_Objekt(balise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BALISE_ALLG_ATTRIBUTE_GROUP: {
				Balise_Allg_AttributeGroup balise_Allg_AttributeGroup = (Balise_Allg_AttributeGroup)theEObject;
				T result = caseBalise_Allg_AttributeGroup(balise_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BASELINE_SRS_TYPE_CLASS: {
				Baseline_SRS_TypeClass baseline_SRS_TypeClass = (Baseline_SRS_TypeClass)theEObject;
				T result = caseBaseline_SRS_TypeClass(baseline_SRS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(baseline_SRS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP: {
				Bedingung_Besondere_AttributeGroup bedingung_Besondere_AttributeGroup = (Bedingung_Besondere_AttributeGroup)theEObject;
				T result = caseBedingung_Besondere_AttributeGroup(bedingung_Besondere_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP: {
				Bedingung_PZB_AttributeGroup bedingung_PZB_AttributeGroup = (Bedingung_PZB_AttributeGroup)theEObject;
				T result = caseBedingung_PZB_AttributeGroup(bedingung_PZB_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP: {
				Bedingung_Signal_AttributeGroup bedingung_Signal_AttributeGroup = (Bedingung_Signal_AttributeGroup)theEObject;
				T result = caseBedingung_Signal_AttributeGroup(bedingung_Signal_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_SONSTIGE_ATTRIBUTE_GROUP: {
				Bedingung_Sonstige_AttributeGroup bedingung_Sonstige_AttributeGroup = (Bedingung_Sonstige_AttributeGroup)theEObject;
				T result = caseBedingung_Sonstige_AttributeGroup(bedingung_Sonstige_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP: {
				Bedingung_Weiche_AttributeGroup bedingung_Weiche_AttributeGroup = (Bedingung_Weiche_AttributeGroup)theEObject;
				T result = caseBedingung_Weiche_AttributeGroup(bedingung_Weiche_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHENLAGE_TYPE_CLASS: {
				Bedingung_Weichenlage_TypeClass bedingung_Weichenlage_TypeClass = (Bedingung_Weichenlage_TypeClass)theEObject;
				T result = caseBedingung_Weichenlage_TypeClass(bedingung_Weichenlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bedingung_Weichenlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_1TYPE_CLASS: {
				Bez_Strecke_BTS_1_TypeClass bez_Strecke_BTS_1_TypeClass = (Bez_Strecke_BTS_1_TypeClass)theEObject;
				T result = caseBez_Strecke_BTS_1_TypeClass(bez_Strecke_BTS_1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Strecke_BTS_1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_2TYPE_CLASS: {
				Bez_Strecke_BTS_2_TypeClass bez_Strecke_BTS_2_TypeClass = (Bez_Strecke_BTS_2_TypeClass)theEObject;
				T result = caseBez_Strecke_BTS_2_TypeClass(bez_Strecke_BTS_2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Strecke_BTS_2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZ_STRECKE_BTS_3TYPE_CLASS: {
				Bez_Strecke_BTS_3_TypeClass bez_Strecke_BTS_3_TypeClass = (Bez_Strecke_BTS_3_TypeClass)theEObject;
				T result = caseBez_Strecke_BTS_3_TypeClass(bez_Strecke_BTS_3_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_Strecke_BTS_3_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZ_ZUB_BEREICHSGRENZE_TYPE_CLASS: {
				Bez_ZUB_Bereichsgrenze_TypeClass bez_ZUB_Bereichsgrenze_TypeClass = (Bez_ZUB_Bereichsgrenze_TypeClass)theEObject;
				T result = caseBez_ZUB_Bereichsgrenze_TypeClass(bez_ZUB_Bereichsgrenze_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bez_ZUB_Bereichsgrenze_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ETCS_KANTE_TYPE_CLASS: {
				Bezeichnung_ETCS_Kante_TypeClass bezeichnung_ETCS_Kante_TypeClass = (Bezeichnung_ETCS_Kante_TypeClass)theEObject;
				T result = caseBezeichnung_ETCS_Kante_TypeClass(bezeichnung_ETCS_Kante_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_ETCS_Kante_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_LEU_ANLAGE_TYPE_CLASS: {
				Bezeichnung_LEU_Anlage_TypeClass bezeichnung_LEU_Anlage_TypeClass = (Bezeichnung_LEU_Anlage_TypeClass)theEObject;
				T result = caseBezeichnung_LEU_Anlage_TypeClass(bezeichnung_LEU_Anlage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_LEU_Anlage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_SE_TYPE_CLASS: {
				Bezeichnung_ZUB_SE_TypeClass bezeichnung_ZUB_SE_TypeClass = (Bezeichnung_ZUB_SE_TypeClass)theEObject;
				T result = caseBezeichnung_ZUB_SE_TypeClass(bezeichnung_ZUB_SE_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_ZUB_SE_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BEZEICHNUNG_ZUB_TYPE_CLASS: {
				Bezeichnung_ZUB_TypeClass bezeichnung_ZUB_TypeClass = (Bezeichnung_ZUB_TypeClass)theEObject;
				T result = caseBezeichnung_ZUB_TypeClass(bezeichnung_ZUB_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bezeichnung_ZUB_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_ESG_BED_AUSSTIEG_ATTRIBUTE_GROUP: {
				Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup = (Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup)theEObject;
				T result = caseBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup(bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_L2_BED_EINSTIEG_ATTRIBUTE_GROUP: {
				Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup = (Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup)theEObject;
				T result = caseBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup(bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_LZB_BED_EINSTIEG_ATTRIBUTE_GROUP: {
				Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup = (Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup)theEObject;
				T result = caseBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup(bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP: {
				Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup = (Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup)theEObject;
				T result = caseBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup(bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP: {
				Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup = (Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup)theEObject;
				T result = caseBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup(bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP: {
				Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup = (Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup)theEObject;
				T result = caseBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup(bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BINAERDATEI: {
				Binaerdatei binaerdatei = (Binaerdatei)theEObject;
				T result = caseBinaerdatei(binaerdatei);
				if (result == null) result = caseBasis_Objekt(binaerdatei);
				if (result == null) result = caseUr_Objekt(binaerdatei);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BINAERDATEI_ALLG_ATTRIBUTE_GROUP: {
				Binaerdatei_Allg_AttributeGroup binaerdatei_Allg_AttributeGroup = (Binaerdatei_Allg_AttributeGroup)theEObject;
				T result = caseBinaerdatei_Allg_AttributeGroup(binaerdatei_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.BREMSWEG_TYPE_CLASS: {
				Bremsweg_TypeClass bremsweg_TypeClass = (Bremsweg_TypeClass)theEObject;
				T result = caseBremsweg_TypeClass(bremsweg_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(bremsweg_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DLEVELTR_TYPE_CLASS: {
				D_LEVELTR_TypeClass d_LEVELTR_TypeClass = (D_LEVELTR_TypeClass)theEObject;
				T result = caseD_LEVELTR_TypeClass(d_LEVELTR_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(d_LEVELTR_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATEINAME_TYPE_CLASS: {
				Dateiname_TypeClass dateiname_TypeClass = (Dateiname_TypeClass)theEObject;
				T result = caseDateiname_TypeClass(dateiname_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dateiname_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATEITYP_BINAERDATEI_TYPE_CLASS: {
				Dateityp_Binaerdatei_TypeClass dateityp_Binaerdatei_TypeClass = (Dateityp_Binaerdatei_TypeClass)theEObject;
				T result = caseDateityp_Binaerdatei_TypeClass(dateityp_Binaerdatei_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dateityp_Binaerdatei_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATEN_TYPE_CLASS: {
				Daten_TypeClass daten_TypeClass = (Daten_TypeClass)theEObject;
				T result = caseDaten_TypeClass(daten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(daten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATENPUNKT: {
				Datenpunkt datenpunkt = (Datenpunkt)theEObject;
				T result = caseDatenpunkt(datenpunkt);
				if (result == null) result = casePunkt_Objekt(datenpunkt);
				if (result == null) result = caseBasis_Objekt(datenpunkt);
				if (result == null) result = caseUr_Objekt(datenpunkt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP: {
				Datenpunkt_Allg_AttributeGroup datenpunkt_Allg_AttributeGroup = (Datenpunkt_Allg_AttributeGroup)theEObject;
				T result = caseDatenpunkt_Allg_AttributeGroup(datenpunkt_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATENPUNKT_BESCHREIBUNG_TYPE_CLASS: {
				Datenpunkt_Beschreibung_TypeClass datenpunkt_Beschreibung_TypeClass = (Datenpunkt_Beschreibung_TypeClass)theEObject;
				T result = caseDatenpunkt_Beschreibung_TypeClass(datenpunkt_Beschreibung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datenpunkt_Beschreibung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATENPUNKT_LAENGE_TYPE_CLASS: {
				Datenpunkt_Laenge_TypeClass datenpunkt_Laenge_TypeClass = (Datenpunkt_Laenge_TypeClass)theEObject;
				T result = caseDatenpunkt_Laenge_TypeClass(datenpunkt_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(datenpunkt_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DATENPUNKT_LINK: {
				Datenpunkt_Link datenpunkt_Link = (Datenpunkt_Link)theEObject;
				T result = caseDatenpunkt_Link(datenpunkt_Link);
				if (result == null) result = caseBasis_Objekt(datenpunkt_Link);
				if (result == null) result = caseUr_Objekt(datenpunkt_Link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DELTA_VGES_TYPE_CLASS: {
				Delta_VGES_TypeClass delta_VGES_TypeClass = (Delta_VGES_TypeClass)theEObject;
				T result = caseDelta_VGES_TypeClass(delta_VGES_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(delta_VGES_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DELTA_VLES_TYPE_CLASS: {
				Delta_VLES_TypeClass delta_VLES_TypeClass = (Delta_VLES_TypeClass)theEObject;
				T result = caseDelta_VLES_TypeClass(delta_VLES_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(delta_VLES_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DELTA_VZES_TYPE_CLASS: {
				Delta_VZES_TypeClass delta_VZES_TypeClass = (Delta_VZES_TypeClass)theEObject;
				T result = caseDelta_VZES_TypeClass(delta_VZES_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(delta_VZES_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ART_TYPE_CLASS: {
				DP_Bezug_Betrieblich_Art_TypeClass dP_Bezug_Betrieblich_Art_TypeClass = (DP_Bezug_Betrieblich_Art_TypeClass)theEObject;
				T result = caseDP_Bezug_Betrieblich_Art_TypeClass(dP_Bezug_Betrieblich_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Bezug_Betrieblich_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP: {
				DP_Bezug_Betrieblich_AttributeGroup dP_Bezug_Betrieblich_AttributeGroup = (DP_Bezug_Betrieblich_AttributeGroup)theEObject;
				T result = caseDP_Bezug_Betrieblich_AttributeGroup(dP_Bezug_Betrieblich_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP: {
				DP_ETCS_Adresse_AttributeGroup dP_ETCS_Adresse_AttributeGroup = (DP_ETCS_Adresse_AttributeGroup)theEObject;
				T result = caseDP_ETCS_Adresse_AttributeGroup(dP_ETCS_Adresse_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_LINK_ART_TYPE_CLASS: {
				DP_Link_Art_TypeClass dP_Link_Art_TypeClass = (DP_Link_Art_TypeClass)theEObject;
				T result = caseDP_Link_Art_TypeClass(dP_Link_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Link_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ATTRIBUTE_GROUP: {
				DP_Telegramm_AttributeGroup dP_Telegramm_AttributeGroup = (DP_Telegramm_AttributeGroup)theEObject;
				T result = caseDP_Telegramm_AttributeGroup(dP_Telegramm_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TELEGRAMM_ESG_ATTRIBUTE_GROUP: {
				DP_Telegramm_ESG_AttributeGroup dP_Telegramm_ESG_AttributeGroup = (DP_Telegramm_ESG_AttributeGroup)theEObject;
				T result = caseDP_Telegramm_ESG_AttributeGroup(dP_Telegramm_ESG_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_ART_TYPE_CLASS: {
				DP_Typ_Art_TypeClass dP_Typ_Art_TypeClass = (DP_Typ_Art_TypeClass)theEObject;
				T result = caseDP_Typ_Art_TypeClass(dP_Typ_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP: {
				DP_Typ_AttributeGroup dP_Typ_AttributeGroup = (DP_Typ_AttributeGroup)theEObject;
				T result = caseDP_Typ_AttributeGroup(dP_Typ_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_ESG_TYPE_CLASS: {
				DP_Typ_ESG_TypeClass dP_Typ_ESG_TypeClass = (DP_Typ_ESG_TypeClass)theEObject;
				T result = caseDP_Typ_ESG_TypeClass(dP_Typ_ESG_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_ESG_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_ETCS_TYPE_CLASS: {
				DP_Typ_ETCS_TypeClass dP_Typ_ETCS_TypeClass = (DP_Typ_ETCS_TypeClass)theEObject;
				T result = caseDP_Typ_ETCS_TypeClass(dP_Typ_ETCS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_ETCS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP: {
				DP_Typ_GESG_AttributeGroup dP_Typ_GESG_AttributeGroup = (DP_Typ_GESG_AttributeGroup)theEObject;
				T result = caseDP_Typ_GESG_AttributeGroup(dP_Typ_GESG_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP: {
				DP_Typ_GETCS_AttributeGroup dP_Typ_GETCS_AttributeGroup = (DP_Typ_GETCS_AttributeGroup)theEObject;
				T result = caseDP_Typ_GETCS_AttributeGroup(dP_Typ_GETCS_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP: {
				DP_Typ_GGNT_AttributeGroup dP_Typ_GGNT_AttributeGroup = (DP_Typ_GGNT_AttributeGroup)theEObject;
				T result = caseDP_Typ_GGNT_AttributeGroup(dP_Typ_GGNT_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GNT_TYPE_CLASS: {
				DP_Typ_GNT_TypeClass dP_Typ_GNT_TypeClass = (DP_Typ_GNT_TypeClass)theEObject;
				T result = caseDP_Typ_GNT_TypeClass(dP_Typ_GNT_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_GNT_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP: {
				DP_Typ_GSonst_AttributeGroup dP_Typ_GSonst_AttributeGroup = (DP_Typ_GSonst_AttributeGroup)theEObject;
				T result = caseDP_Typ_GSonst_AttributeGroup(dP_Typ_GSonst_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP: {
				DP_Typ_GTrans_AttributeGroup dP_Typ_GTrans_AttributeGroup = (DP_Typ_GTrans_AttributeGroup)theEObject;
				T result = caseDP_Typ_GTrans_AttributeGroup(dP_Typ_GTrans_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP: {
				DP_Typ_GZBS_AttributeGroup dP_Typ_GZBS_AttributeGroup = (DP_Typ_GZBS_AttributeGroup)theEObject;
				T result = caseDP_Typ_GZBS_AttributeGroup(dP_Typ_GZBS_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_SONST_TYPE_CLASS: {
				DP_Typ_Sonst_TypeClass dP_Typ_Sonst_TypeClass = (DP_Typ_Sonst_TypeClass)theEObject;
				T result = caseDP_Typ_Sonst_TypeClass(dP_Typ_Sonst_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_Sonst_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_TRANS_TYPE_CLASS: {
				DP_Typ_Trans_TypeClass dP_Typ_Trans_TypeClass = (DP_Typ_Trans_TypeClass)theEObject;
				T result = caseDP_Typ_Trans_TypeClass(dP_Typ_Trans_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_Trans_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_VLA_TYPE_CLASS: {
				DP_Typ_V_La_TypeClass dP_Typ_V_La_TypeClass = (DP_Typ_V_La_TypeClass)theEObject;
				T result = caseDP_Typ_V_La_TypeClass(dP_Typ_V_La_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_V_La_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DP_TYP_ZBS_TYPE_CLASS: {
				DP_Typ_ZBS_TypeClass dP_Typ_ZBS_TypeClass = (DP_Typ_ZBS_TypeClass)theEObject;
				T result = caseDP_Typ_ZBS_TypeClass(dP_Typ_ZBS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dP_Typ_ZBS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DUNKELSCHALTANSTOSS_TYPE_CLASS: {
				Dunkelschaltanstoss_TypeClass dunkelschaltanstoss_TypeClass = (Dunkelschaltanstoss_TypeClass)theEObject;
				T result = caseDunkelschaltanstoss_TypeClass(dunkelschaltanstoss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dunkelschaltanstoss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_200_TYPE_CLASS: {
				DWeg_Intervall_200_TypeClass dWeg_Intervall_200_TypeClass = (DWeg_Intervall_200_TypeClass)theEObject;
				T result = caseDWeg_Intervall_200_TypeClass(dWeg_Intervall_200_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Intervall_200_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_200_TYPE_CLASS: {
				DWeg_Intervall_50_200_TypeClass dWeg_Intervall_50_200_TypeClass = (DWeg_Intervall_50_200_TypeClass)theEObject;
				T result = caseDWeg_Intervall_50_200_TypeClass(dWeg_Intervall_50_200_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Intervall_50_200_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.DWEG_INTERVALL_50_TYPE_CLASS: {
				DWeg_Intervall_50_TypeClass dWeg_Intervall_50_TypeClass = (DWeg_Intervall_50_TypeClass)theEObject;
				T result = caseDWeg_Intervall_50_TypeClass(dWeg_Intervall_50_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Intervall_50_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EINGANG_GEPUFFERT_TYPE_CLASS: {
				Eingang_Gepuffert_TypeClass eingang_Gepuffert_TypeClass = (Eingang_Gepuffert_TypeClass)theEObject;
				T result = caseEingang_Gepuffert_TypeClass(eingang_Gepuffert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(eingang_Gepuffert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EINSTIEG_ERLAUBT_TYPE_CLASS: {
				Einstieg_Erlaubt_TypeClass einstieg_Erlaubt_TypeClass = (Einstieg_Erlaubt_TypeClass)theEObject;
				T result = caseEinstieg_Erlaubt_TypeClass(einstieg_Erlaubt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einstieg_Erlaubt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EINSTIEG_OHNE_RUECKW_SIG_TYPE_CLASS: {
				Einstieg_Ohne_Rueckw_Sig_TypeClass einstieg_Ohne_Rueckw_Sig_TypeClass = (Einstieg_Ohne_Rueckw_Sig_TypeClass)theEObject;
				T result = caseEinstieg_Ohne_Rueckw_Sig_TypeClass(einstieg_Ohne_Rueckw_Sig_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einstieg_Ohne_Rueckw_Sig_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EINZELDATEI_ART_TYPE_CLASS: {
				Einzeldatei_Art_TypeClass einzeldatei_Art_TypeClass = (Einzeldatei_Art_TypeClass)theEObject;
				T result = caseEinzeldatei_Art_TypeClass(einzeldatei_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einzeldatei_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ENERGIE_EINGANG_ART_TYPE_CLASS: {
				Energie_Eingang_Art_TypeClass energie_Eingang_Art_TypeClass = (Energie_Eingang_Art_TypeClass)theEObject;
				T result = caseEnergie_Eingang_Art_TypeClass(energie_Eingang_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(energie_Eingang_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ESG_IND_ERLAEUTERUNG_TYPE_CLASS: {
				ESG_Ind_Erlaeuterung_TypeClass esG_Ind_Erlaeuterung_TypeClass = (ESG_Ind_Erlaeuterung_TypeClass)theEObject;
				T result = caseESG_Ind_Erlaeuterung_TypeClass(esG_Ind_Erlaeuterung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(esG_Ind_Erlaeuterung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETER_TYPE_CLASS: {
				ESG_Ind_Parameter_TypeClass esG_Ind_Parameter_TypeClass = (ESG_Ind_Parameter_TypeClass)theEObject;
				T result = caseESG_Ind_Parameter_TypeClass(esG_Ind_Parameter_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(esG_Ind_Parameter_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ESG_IND_PARAMETERWERT_TYPE_CLASS: {
				ESG_Ind_Parameterwert_TypeClass esG_Ind_Parameterwert_TypeClass = (ESG_Ind_Parameterwert_TypeClass)theEObject;
				T result = caseESG_Ind_Parameterwert_TypeClass(esG_Ind_Parameterwert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(esG_Ind_Parameterwert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP: {
				ESG_Individuelle_Merkmale_AttributeGroup esG_Individuelle_Merkmale_AttributeGroup = (ESG_Individuelle_Merkmale_AttributeGroup)theEObject;
				T result = caseESG_Individuelle_Merkmale_AttributeGroup(esG_Individuelle_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP: {
				ESG_Spezifische_Merkmale_AttributeGroup esG_Spezifische_Merkmale_AttributeGroup = (ESG_Spezifische_Merkmale_AttributeGroup)theEObject;
				T result = caseESG_Spezifische_Merkmale_AttributeGroup(esG_Spezifische_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_ATTRIBUTE_GROUP: {
				ETCS_Adresse_AttributeGroup etcS_Adresse_AttributeGroup = (ETCS_Adresse_AttributeGroup)theEObject;
				T result = caseETCS_Adresse_AttributeGroup(etcS_Adresse_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_KENNUNG_TYPE_CLASS: {
				ETCS_Adresse_Kennung_TypeClass etcS_Adresse_Kennung_TypeClass = (ETCS_Adresse_Kennung_TypeClass)theEObject;
				T result = caseETCS_Adresse_Kennung_TypeClass(etcS_Adresse_Kennung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Adresse_Kennung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_NID_BG_TYPE_CLASS: {
				ETCS_Adresse_NID_BG_TypeClass etcS_Adresse_NID_BG_TypeClass = (ETCS_Adresse_NID_BG_TypeClass)theEObject;
				T result = caseETCS_Adresse_NID_BG_TypeClass(etcS_Adresse_NID_BG_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Adresse_NID_BG_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_ADRESSE_NID_CTYPE_CLASS: {
				ETCS_Adresse_NID_C_TypeClass etcS_Adresse_NID_C_TypeClass = (ETCS_Adresse_NID_C_TypeClass)theEObject;
				T result = caseETCS_Adresse_NID_C_TypeClass(etcS_Adresse_NID_C_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Adresse_NID_C_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_KANTE: {
				ETCS_Kante etcS_Kante = (ETCS_Kante)theEObject;
				T result = caseETCS_Kante(etcS_Kante);
				if (result == null) result = caseBasis_Objekt(etcS_Kante);
				if (result == null) result = caseUr_Objekt(etcS_Kante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ETCS_Kante_Bezeichnung_AttributeGroup etcS_Kante_Bezeichnung_AttributeGroup = (ETCS_Kante_Bezeichnung_AttributeGroup)theEObject;
				T result = caseETCS_Kante_Bezeichnung_AttributeGroup(etcS_Kante_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_KENNUNG_TYPE_CLASS: {
				ETCS_Kennung_TypeClass etcS_Kennung_TypeClass = (ETCS_Kennung_TypeClass)theEObject;
				T result = caseETCS_Kennung_TypeClass(etcS_Kennung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Kennung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN: {
				ETCS_Knoten etcS_Knoten = (ETCS_Knoten)theEObject;
				T result = caseETCS_Knoten(etcS_Knoten);
				if (result == null) result = caseBasis_Objekt(etcS_Knoten);
				if (result == null) result = caseUr_Objekt(etcS_Knoten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN_ART_SONSTIGE_TYPE_CLASS: {
				ETCS_Knoten_Art_Sonstige_TypeClass etcS_Knoten_Art_Sonstige_TypeClass = (ETCS_Knoten_Art_Sonstige_TypeClass)theEObject;
				T result = caseETCS_Knoten_Art_Sonstige_TypeClass(etcS_Knoten_Art_Sonstige_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Knoten_Art_Sonstige_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_PAKETNUMMER_TYPE_CLASS: {
				ETCS_Paketnummer_TypeClass etcS_Paketnummer_TypeClass = (ETCS_Paketnummer_TypeClass)theEObject;
				T result = caseETCS_Paketnummer_TypeClass(etcS_Paketnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Paketnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_PAR_ERLAEUTERUNG_TYPE_CLASS: {
				ETCS_Par_Erlaeuterung_TypeClass etcS_Par_Erlaeuterung_TypeClass = (ETCS_Par_Erlaeuterung_TypeClass)theEObject;
				T result = caseETCS_Par_Erlaeuterung_TypeClass(etcS_Par_Erlaeuterung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Par_Erlaeuterung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERNAME_TYPE_CLASS: {
				ETCS_Parametername_TypeClass etcS_Parametername_TypeClass = (ETCS_Parametername_TypeClass)theEObject;
				T result = caseETCS_Parametername_TypeClass(etcS_Parametername_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Parametername_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_PARAMETERWERT_TYPE_CLASS: {
				ETCS_Parameterwert_TypeClass etcS_Parameterwert_TypeClass = (ETCS_Parameterwert_TypeClass)theEObject;
				T result = caseETCS_Parameterwert_TypeClass(etcS_Parameterwert_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_Parameterwert_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL: {
				ETCS_Signal etcS_Signal = (ETCS_Signal)theEObject;
				T result = caseETCS_Signal(etcS_Signal);
				if (result == null) result = caseBasis_Objekt(etcS_Signal);
				if (result == null) result = caseUr_Objekt(etcS_Signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_ALLG_ATTRIBUTE_GROUP: {
				ETCS_Signal_Allg_AttributeGroup etcS_Signal_Allg_AttributeGroup = (ETCS_Signal_Allg_AttributeGroup)theEObject;
				T result = caseETCS_Signal_Allg_AttributeGroup(etcS_Signal_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP: {
				ETCS_Signal_DWeg_AttributeGroup etcS_Signal_DWeg_AttributeGroup = (ETCS_Signal_DWeg_AttributeGroup)theEObject;
				T result = caseETCS_Signal_DWeg_AttributeGroup(etcS_Signal_DWeg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_TBV_ATTRIBUTE_GROUP: {
				ETCS_Signal_TBV_AttributeGroup etcS_Signal_TBV_AttributeGroup = (ETCS_Signal_TBV_AttributeGroup)theEObject;
				T result = caseETCS_Signal_TBV_AttributeGroup(etcS_Signal_TBV_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_WKR: {
				ETCS_W_Kr etcS_W_Kr = (ETCS_W_Kr)theEObject;
				T result = caseETCS_W_Kr(etcS_W_Kr);
				if (result == null) result = caseBasis_Objekt(etcS_W_Kr);
				if (result == null) result = caseUr_Objekt(etcS_W_Kr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP: {
				ETCS_W_Kr_MUKA_AttributeGroup etcS_W_Kr_MUKA_AttributeGroup = (ETCS_W_Kr_MUKA_AttributeGroup)theEObject;
				T result = caseETCS_W_Kr_MUKA_AttributeGroup(etcS_W_Kr_MUKA_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ETCS_WORTSGESTELLT_TYPE_CLASS: {
				ETCS_W_Ortsgestellt_TypeClass etcS_W_Ortsgestellt_TypeClass = (ETCS_W_Ortsgestellt_TypeClass)theEObject;
				T result = caseETCS_W_Ortsgestellt_TypeClass(etcS_W_Ortsgestellt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(etcS_W_Ortsgestellt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL: {
				EV_Modul eV_Modul = (EV_Modul)theEObject;
				T result = caseEV_Modul(eV_Modul);
				if (result == null) result = caseBasis_Objekt(eV_Modul);
				if (result == null) result = caseUr_Objekt(eV_Modul);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_ART_TYPE_CLASS: {
				EV_Modul_Art_TypeClass eV_Modul_Art_TypeClass = (EV_Modul_Art_TypeClass)theEObject;
				T result = caseEV_Modul_Art_TypeClass(eV_Modul_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(eV_Modul_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP: {
				EV_Modul_Ausgang_AttributeGroup eV_Modul_Ausgang_AttributeGroup = (EV_Modul_Ausgang_AttributeGroup)theEObject;
				T result = caseEV_Modul_Ausgang_AttributeGroup(eV_Modul_Ausgang_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_EINGANG_ATTRIBUTE_GROUP: {
				EV_Modul_Eingang_AttributeGroup eV_Modul_Eingang_AttributeGroup = (EV_Modul_Eingang_AttributeGroup)theEObject;
				T result = caseEV_Modul_Eingang_AttributeGroup(eV_Modul_Eingang_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP: {
				EV_Modul_Physisch_AttributeGroup eV_Modul_Physisch_AttributeGroup = (EV_Modul_Physisch_AttributeGroup)theEObject;
				T result = caseEV_Modul_Physisch_AttributeGroup(eV_Modul_Physisch_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_TYP_TYPE_CLASS: {
				EV_Modul_Typ_TypeClass eV_Modul_Typ_TypeClass = (EV_Modul_Typ_TypeClass)theEObject;
				T result = caseEV_Modul_Typ_TypeClass(eV_Modul_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(eV_Modul_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP: {
				EV_Modul_Virtuell_AttributeGroup eV_Modul_Virtuell_AttributeGroup = (EV_Modul_Virtuell_AttributeGroup)theEObject;
				T result = caseEV_Modul_Virtuell_AttributeGroup(eV_Modul_Virtuell_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FABRIKAT_TYPE_CLASS: {
				Fabrikat_TypeClass fabrikat_TypeClass = (Fabrikat_TypeClass)theEObject;
				T result = caseFabrikat_TypeClass(fabrikat_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fabrikat_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM: {
				Fachtelegramm fachtelegramm = (Fachtelegramm)theEObject;
				T result = caseFachtelegramm(fachtelegramm);
				if (result == null) result = caseBasis_Objekt(fachtelegramm);
				if (result == null) result = caseUr_Objekt(fachtelegramm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG: {
				FT_Anschaltbedingung fT_Anschaltbedingung = (FT_Anschaltbedingung)theEObject;
				T result = caseFT_Anschaltbedingung(fT_Anschaltbedingung);
				if (result == null) result = caseBasis_Objekt(fT_Anschaltbedingung);
				if (result == null) result = caseUr_Objekt(fT_Anschaltbedingung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP: {
				FT_ESG_Merkmale_AttributeGroup fT_ESG_Merkmale_AttributeGroup = (FT_ESG_Merkmale_AttributeGroup)theEObject;
				T result = caseFT_ESG_Merkmale_AttributeGroup(fT_ESG_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ESG_SUBTYP_TYPE_CLASS: {
				FT_ESG_Subtyp_TypeClass fT_ESG_Subtyp_TypeClass = (FT_ESG_Subtyp_TypeClass)theEObject;
				T result = caseFT_ESG_Subtyp_TypeClass(fT_ESG_Subtyp_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_ESG_Subtyp_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ESG_TYP_TYPE_CLASS: {
				FT_ESG_Typ_TypeClass fT_ESG_Typ_TypeClass = (FT_ESG_Typ_TypeClass)theEObject;
				T result = caseFT_ESG_Typ_TypeClass(fT_ESG_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_ESG_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP: {
				FT_ETCS_L2_Merkmale_AttributeGroup fT_ETCS_L2_Merkmale_AttributeGroup = (FT_ETCS_L2_Merkmale_AttributeGroup)theEObject;
				T result = caseFT_ETCS_L2_Merkmale_AttributeGroup(fT_ETCS_L2_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_TYP_TYPE_CLASS: {
				FT_ETCS_L2_Typ_TypeClass fT_ETCS_L2_Typ_TypeClass = (FT_ETCS_L2_Typ_TypeClass)theEObject;
				T result = caseFT_ETCS_L2_Typ_TypeClass(fT_ETCS_L2_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_ETCS_L2_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP: {
				FT_ETCS_Trans_Merkmale_AttributeGroup fT_ETCS_Trans_Merkmale_AttributeGroup = (FT_ETCS_Trans_Merkmale_AttributeGroup)theEObject;
				T result = caseFT_ETCS_Trans_Merkmale_AttributeGroup(fT_ETCS_Trans_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP: {
				FT_ETCS_Trans_Paket_41_AttributeGroup fT_ETCS_Trans_Paket_41_AttributeGroup = (FT_ETCS_Trans_Paket_41_AttributeGroup)theEObject;
				T result = caseFT_ETCS_Trans_Paket_41_AttributeGroup(fT_ETCS_Trans_Paket_41_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_NATTRIBUTE_GROUP: {
				FT_ETCS_Trans_Paket_N_AttributeGroup fT_ETCS_Trans_Paket_N_AttributeGroup = (FT_ETCS_Trans_Paket_N_AttributeGroup)theEObject;
				T result = caseFT_ETCS_Trans_Paket_N_AttributeGroup(fT_ETCS_Trans_Paket_N_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL: {
				FT_Fahrweg_Teil fT_Fahrweg_Teil = (FT_Fahrweg_Teil)theEObject;
				T result = caseFT_Fahrweg_Teil(fT_Fahrweg_Teil);
				if (result == null) result = caseBasis_Objekt(fT_Fahrweg_Teil);
				if (result == null) result = caseUr_Objekt(fT_Fahrweg_Teil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP: {
				FT_Fahrweg_Teil_Allg_AttributeGroup fT_Fahrweg_Teil_Allg_AttributeGroup = (FT_Fahrweg_Teil_Allg_AttributeGroup)theEObject;
				T result = caseFT_Fahrweg_Teil_Allg_AttributeGroup(fT_Fahrweg_Teil_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP: {
				FT_Fahrweg_Teile_AttributeGroup fT_Fahrweg_Teile_AttributeGroup = (FT_Fahrweg_Teile_AttributeGroup)theEObject;
				T result = caseFT_Fahrweg_Teile_AttributeGroup(fT_Fahrweg_Teile_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP: {
				FT_GNT_Merkmale_AttributeGroup fT_GNT_Merkmale_AttributeGroup = (FT_GNT_Merkmale_AttributeGroup)theEObject;
				T result = caseFT_GNT_Merkmale_AttributeGroup(fT_GNT_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_GNT_PUNKTART_TYPE_CLASS: {
				FT_GNT_Punktart_TypeClass fT_GNT_Punktart_TypeClass = (FT_GNT_Punktart_TypeClass)theEObject;
				T result = caseFT_GNT_Punktart_TypeClass(fT_GNT_Punktart_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_GNT_Punktart_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_HINWEIS_FUNKTION_TYPE_CLASS: {
				FT_Hinweis_Funktion_TypeClass fT_Hinweis_Funktion_TypeClass = (FT_Hinweis_Funktion_TypeClass)theEObject;
				T result = caseFT_Hinweis_Funktion_TypeClass(fT_Hinweis_Funktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_Hinweis_Funktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_ATTRIBUTE_GROUP: {
				FT_ZBS_Merkmale_AttributeGroup fT_ZBS_Merkmale_AttributeGroup = (FT_ZBS_Merkmale_AttributeGroup)theEObject;
				T result = caseFT_ZBS_Merkmale_AttributeGroup(fT_ZBS_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP: {
				FT_ZBS_Merkmale_La_AttributeGroup fT_ZBS_Merkmale_La_AttributeGroup = (FT_ZBS_Merkmale_La_AttributeGroup)theEObject;
				T result = caseFT_ZBS_Merkmale_La_AttributeGroup(fT_ZBS_Merkmale_La_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.FT_ZBS_TYP_TYPE_CLASS: {
				FT_ZBS_Typ_TypeClass fT_ZBS_Typ_TypeClass = (FT_ZBS_Typ_TypeClass)theEObject;
				T result = caseFT_ZBS_Typ_TypeClass(fT_ZBS_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fT_ZBS_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.GNT_MERKMALE_ATTRIBUTE_GROUP: {
				GNT_Merkmale_AttributeGroup gnT_Merkmale_AttributeGroup = (GNT_Merkmale_AttributeGroup)theEObject;
				T result = caseGNT_Merkmale_AttributeGroup(gnT_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.GRUPPEN_ID_TYPE_CLASS: {
				Gruppen_ID_TypeClass gruppen_ID_TypeClass = (Gruppen_ID_TypeClass)theEObject;
				T result = caseGruppen_ID_TypeClass(gruppen_ID_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gruppen_ID_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.HARTER_AUSSTIEG_AUS_L2_TYPE_CLASS: {
				Harter_Ausstieg_Aus_L2_TypeClass harter_Ausstieg_Aus_L2_TypeClass = (Harter_Ausstieg_Aus_L2_TypeClass)theEObject;
				T result = caseHarter_Ausstieg_Aus_L2_TypeClass(harter_Ausstieg_Aus_L2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(harter_Ausstieg_Aus_L2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.HERSTELLER_TYPE_CLASS: {
				Hersteller_TypeClass hersteller_TypeClass = (Hersteller_TypeClass)theEObject;
				T result = caseHersteller_TypeClass(hersteller_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hersteller_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.HINWEIS_BALISENBEFESTIGUNG_TYPE_CLASS: {
				Hinweis_Balisenbefestigung_TypeClass hinweis_Balisenbefestigung_TypeClass = (Hinweis_Balisenbefestigung_TypeClass)theEObject;
				T result = caseHinweis_Balisenbefestigung_TypeClass(hinweis_Balisenbefestigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(hinweis_Balisenbefestigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.INDIVIDUELL_TYPE_CLASS: {
				Individuell_TypeClass individuell_TypeClass = (Individuell_TypeClass)theEObject;
				T result = caseIndividuell_TypeClass(individuell_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(individuell_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.IST_BEFAHREN_TYPE_CLASS: {
				Ist_Befahren_TypeClass ist_Befahren_TypeClass = (Ist_Befahren_TypeClass)theEObject;
				T result = caseIst_Befahren_TypeClass(ist_Befahren_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ist_Befahren_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.KM_BTS_1TYPE_CLASS: {
				Km_BTS_1_TypeClass km_BTS_1_TypeClass = (Km_BTS_1_TypeClass)theEObject;
				T result = caseKm_BTS_1_TypeClass(km_BTS_1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(km_BTS_1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.KM_BTS_2TYPE_CLASS: {
				Km_BTS_2_TypeClass km_BTS_2_TypeClass = (Km_BTS_2_TypeClass)theEObject;
				T result = caseKm_BTS_2_TypeClass(km_BTS_2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(km_BTS_2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.KM_BTS_3TYPE_CLASS: {
				Km_BTS_3_TypeClass km_BTS_3_TypeClass = (Km_BTS_3_TypeClass)theEObject;
				T result = caseKm_BTS_3_TypeClass(km_BTS_3_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(km_BTS_3_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP: {
				Knoten_Auf_TOP_Kante_AttributeGroup knoten_Auf_TOP_Kante_AttributeGroup = (Knoten_Auf_TOP_Kante_AttributeGroup)theEObject;
				T result = caseKnoten_Auf_TOP_Kante_AttributeGroup(knoten_Auf_TOP_Kante_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.KONFIGURATIONSKENNUNG_TYPE_CLASS: {
				Konfigurationskennung_TypeClass konfigurationskennung_TypeClass = (Konfigurationskennung_TypeClass)theEObject;
				T result = caseKonfigurationskennung_TypeClass(konfigurationskennung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(konfigurationskennung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LACKLEVELTR_TYPE_CLASS: {
				L_ACKLEVELTR_TypeClass l_ACKLEVELTR_TypeClass = (L_ACKLEVELTR_TypeClass)theEObject;
				T result = caseL_ACKLEVELTR_TypeClass(l_ACKLEVELTR_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(l_ACKLEVELTR_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LAENGE_1TYPE_CLASS: {
				Laenge_1_TypeClass laenge_1_TypeClass = (Laenge_1_TypeClass)theEObject;
				T result = caseLaenge_1_TypeClass(laenge_1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(laenge_1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LAENGE_AUSFUEHRUNGSBEREICH_TYPE_CLASS: {
				Laenge_Ausfuehrungsbereich_TypeClass laenge_Ausfuehrungsbereich_TypeClass = (Laenge_Ausfuehrungsbereich_TypeClass)theEObject;
				T result = caseLaenge_Ausfuehrungsbereich_TypeClass(laenge_Ausfuehrungsbereich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(laenge_Ausfuehrungsbereich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_ANLAGE: {
				LEU_Anlage leU_Anlage = (LEU_Anlage)theEObject;
				T result = caseLEU_Anlage(leU_Anlage);
				if (result == null) result = caseBasis_Objekt(leU_Anlage);
				if (result == null) result = caseUr_Objekt(leU_Anlage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				LEU_Anlage_Bezeichnung_AttributeGroup leU_Anlage_Bezeichnung_AttributeGroup = (LEU_Anlage_Bezeichnung_AttributeGroup)theEObject;
				T result = caseLEU_Anlage_Bezeichnung_AttributeGroup(leU_Anlage_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP: {
				LEU_Anlage_Moduleigenschaften_AttributeGroup leU_Anlage_Moduleigenschaften_AttributeGroup = (LEU_Anlage_Moduleigenschaften_AttributeGroup)theEObject;
				T result = caseLEU_Anlage_Moduleigenschaften_AttributeGroup(leU_Anlage_Moduleigenschaften_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_AUSGANG_NR_TYPE_CLASS: {
				LEU_Ausgang_Nr_TypeClass leU_Ausgang_Nr_TypeClass = (LEU_Ausgang_Nr_TypeClass)theEObject;
				T result = caseLEU_Ausgang_Nr_TypeClass(leU_Ausgang_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(leU_Ausgang_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL: {
				LEU_Modul leU_Modul = (LEU_Modul)theEObject;
				T result = caseLEU_Modul(leU_Modul);
				if (result == null) result = caseBasis_Objekt(leU_Modul);
				if (result == null) result = caseUr_Objekt(leU_Modul);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL_ALLG_ATTRIBUTE_GROUP: {
				LEU_Modul_Allg_AttributeGroup leU_Modul_Allg_AttributeGroup = (LEU_Modul_Allg_AttributeGroup)theEObject;
				T result = caseLEU_Modul_Allg_AttributeGroup(leU_Modul_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL_ART_TYPE_CLASS: {
				LEU_Modul_Art_TypeClass leU_Modul_Art_TypeClass = (LEU_Modul_Art_TypeClass)theEObject;
				T result = caseLEU_Modul_Art_TypeClass(leU_Modul_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(leU_Modul_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP: {
				LEU_Modul_Ausgang_AttributeGroup leU_Modul_Ausgang_AttributeGroup = (LEU_Modul_Ausgang_AttributeGroup)theEObject;
				T result = caseLEU_Modul_Ausgang_AttributeGroup(leU_Modul_Ausgang_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				LEU_Modul_Bezeichnung_AttributeGroup leU_Modul_Bezeichnung_AttributeGroup = (LEU_Modul_Bezeichnung_AttributeGroup)theEObject;
				T result = caseLEU_Modul_Bezeichnung_AttributeGroup(leU_Modul_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_MODUL_TYP_TYPE_CLASS: {
				LEU_Modul_Typ_TypeClass leU_Modul_Typ_TypeClass = (LEU_Modul_Typ_TypeClass)theEObject;
				T result = caseLEU_Modul_Typ_TypeClass(leU_Modul_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(leU_Modul_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN: {
				LEU_Schaltkasten leU_Schaltkasten = (LEU_Schaltkasten)theEObject;
				T result = caseLEU_Schaltkasten(leU_Schaltkasten);
				if (result == null) result = caseBasis_Objekt(leU_Schaltkasten);
				if (result == null) result = caseUr_Objekt(leU_Schaltkasten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				LEU_Schaltkasten_Bezeichnung_AttributeGroup leU_Schaltkasten_Bezeichnung_AttributeGroup = (LEU_Schaltkasten_Bezeichnung_AttributeGroup)theEObject;
				T result = caseLEU_Schaltkasten_Bezeichnung_AttributeGroup(leU_Schaltkasten_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP: {
				LEU_Schaltkasten_Energie_AttributeGroup leU_Schaltkasten_Energie_AttributeGroup = (LEU_Schaltkasten_Energie_AttributeGroup)theEObject;
				T result = caseLEU_Schaltkasten_Energie_AttributeGroup(leU_Schaltkasten_Energie_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP: {
				LEU_Schaltkasten_Position_AttributeGroup leU_Schaltkasten_Position_AttributeGroup = (LEU_Schaltkasten_Position_AttributeGroup)theEObject;
				T result = caseLEU_Schaltkasten_Position_AttributeGroup(leU_Schaltkasten_Position_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_TYP_TYPE_CLASS: {
				LEU_Schaltkasten_Typ_TypeClass leU_Schaltkasten_Typ_TypeClass = (LEU_Schaltkasten_Typ_TypeClass)theEObject;
				T result = caseLEU_Schaltkasten_Typ_TypeClass(leU_Schaltkasten_Typ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(leU_Schaltkasten_Typ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP: {
				LEU_Steuernde_AttributeGroup leU_Steuernde_AttributeGroup = (LEU_Steuernde_AttributeGroup)theEObject;
				T result = caseLEU_Steuernde_AttributeGroup(leU_Steuernde_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LFD_NR_AM_BEZUGSPUNKT_TYPE_CLASS: {
				Lfd_Nr_Am_Bezugspunkt_TypeClass lfd_Nr_Am_Bezugspunkt_TypeClass = (Lfd_Nr_Am_Bezugspunkt_TypeClass)theEObject;
				T result = caseLfd_Nr_Am_Bezugspunkt_TypeClass(lfd_Nr_Am_Bezugspunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lfd_Nr_Am_Bezugspunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LFD_NR_IN_TELEGR_SPEC_TYPE_CLASS: {
				LfdNr_in_Telegr_Spec_TypeClass lfdNr_in_Telegr_Spec_TypeClass = (LfdNr_in_Telegr_Spec_TypeClass)theEObject;
				T result = caseLfdNr_in_Telegr_Spec_TypeClass(lfdNr_in_Telegr_Spec_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lfdNr_in_Telegr_Spec_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LINK_DISTANZ_TYPE_CLASS: {
				Link_Distanz_TypeClass link_Distanz_TypeClass = (Link_Distanz_TypeClass)theEObject;
				T result = caseLink_Distanz_TypeClass(link_Distanz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(link_Distanz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LLA_TYPE_CLASS: {
				LLA_TypeClass llA_TypeClass = (LLA_TypeClass)theEObject;
				T result = caseLLA_TypeClass(llA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(llA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LM_GTYPE_CLASS: {
				LM_G_TypeClass lM_G_TypeClass = (LM_G_TypeClass)theEObject;
				T result = caseLM_G_TypeClass(lM_G_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lM_G_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM: {
				Luft_Telegramm luft_Telegramm = (Luft_Telegramm)theEObject;
				T result = caseLuft_Telegramm(luft_Telegramm);
				if (result == null) result = caseBasis_Objekt(luft_Telegramm);
				if (result == null) result = caseUr_Objekt(luft_Telegramm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MLEVELTR_TYPE_CLASS: {
				M_LEVELTR_TypeClass m_LEVELTR_TypeClass = (M_LEVELTR_TypeClass)theEObject;
				T result = caseM_LEVELTR_TypeClass(m_LEVELTR_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(m_LEVELTR_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_1TYPE_CLASS: {
				Massgebende_Neig_1_TypeClass massgebende_Neig_1_TypeClass = (Massgebende_Neig_1_TypeClass)theEObject;
				T result = caseMassgebende_Neig_1_TypeClass(massgebende_Neig_1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(massgebende_Neig_1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MASSGEBENDE_NEIG_SCHUTZSTRECKE_TYPE_CLASS: {
				Massgebende_Neig_Schutzstrecke_TypeClass massgebende_Neig_Schutzstrecke_TypeClass = (Massgebende_Neig_Schutzstrecke_TypeClass)theEObject;
				T result = caseMassgebende_Neig_Schutzstrecke_TypeClass(massgebende_Neig_Schutzstrecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(massgebende_Neig_Schutzstrecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MASTSCHILD_TYPE_CLASS: {
				Mastschild_TypeClass mastschild_TypeClass = (Mastschild_TypeClass)theEObject;
				T result = caseMastschild_TypeClass(mastschild_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(mastschild_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MAX_LEISTUNG_TYPE_CLASS: {
				Max_Leistung_TypeClass max_Leistung_TypeClass = (Max_Leistung_TypeClass)theEObject;
				T result = caseMax_Leistung_TypeClass(max_Leistung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(max_Leistung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MAX_UNTERBRECHUNGSZEIT_TYPE_CLASS: {
				Max_Unterbrechungszeit_TypeClass max_Unterbrechungszeit_TypeClass = (Max_Unterbrechungszeit_TypeClass)theEObject;
				T result = caseMax_Unterbrechungszeit_TypeClass(max_Unterbrechungszeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(max_Unterbrechungszeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.METALLTEIL_TYPE_CLASS: {
				Metallteil_TypeClass metallteil_TypeClass = (Metallteil_TypeClass)theEObject;
				T result = caseMetallteil_TypeClass(metallteil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(metallteil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.MODULNUMMER_TYPE_CLASS: {
				Modulnummer_TypeClass modulnummer_TypeClass = (Modulnummer_TypeClass)theEObject;
				T result = caseModulnummer_TypeClass(modulnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(modulnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NEIGUNG_TYPE_CLASS: {
				Neigung_TypeClass neigung_TypeClass = (Neigung_TypeClass)theEObject;
				T result = caseNeigung_TypeClass(neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NENNLEISTUNG_TYPE_CLASS: {
				Nennleistung_TypeClass nennleistung_TypeClass = (Nennleistung_TypeClass)theEObject;
				T result = caseNennleistung_TypeClass(nennleistung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nennleistung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NID_CTYPE_CLASS: {
				NID_C_TypeClass niD_C_TypeClass = (NID_C_TypeClass)theEObject;
				T result = caseNID_C_TypeClass(niD_C_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_C_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NID_RBC_TYPE_CLASS: {
				NID_RBC_TypeClass niD_RBC_TypeClass = (NID_RBC_TypeClass)theEObject;
				T result = caseNID_RBC_TypeClass(niD_RBC_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_RBC_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NID_STM_TYPE_CLASS: {
				NID_STM_TypeClass niD_STM_TypeClass = (NID_STM_TypeClass)theEObject;
				T result = caseNID_STM_TypeClass(niD_STM_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(niD_STM_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.NUMMER_SCHALTKASTEN_TYPE_CLASS: {
				Nummer_Schaltkasten_TypeClass nummer_Schaltkasten_TypeClass = (Nummer_Schaltkasten_TypeClass)theEObject;
				T result = caseNummer_Schaltkasten_TypeClass(nummer_Schaltkasten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nummer_Schaltkasten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_GUETERZUG_TYPE_CLASS: {
				Oberstrombegrenzung_Gueterzug_TypeClass oberstrombegrenzung_Gueterzug_TypeClass = (Oberstrombegrenzung_Gueterzug_TypeClass)theEObject;
				T result = caseOberstrombegrenzung_Gueterzug_TypeClass(oberstrombegrenzung_Gueterzug_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oberstrombegrenzung_Gueterzug_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.OBERSTROMBEGRENZUNG_REISEZUG_TYPE_CLASS: {
				Oberstrombegrenzung_Reisezug_TypeClass oberstrombegrenzung_Reisezug_TypeClass = (Oberstrombegrenzung_Reisezug_TypeClass)theEObject;
				T result = caseOberstrombegrenzung_Reisezug_TypeClass(oberstrombegrenzung_Reisezug_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(oberstrombegrenzung_Reisezug_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.PORT_NR_AUSG_PHYSISCH_TYPE_CLASS: {
				Port_Nr_Ausg_Physisch_TypeClass port_Nr_Ausg_Physisch_TypeClass = (Port_Nr_Ausg_Physisch_TypeClass)theEObject;
				T result = casePort_Nr_Ausg_Physisch_TypeClass(port_Nr_Ausg_Physisch_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(port_Nr_Ausg_Physisch_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.POSITION_SONSTIGE_TYPE_CLASS: {
				Position_Sonstige_TypeClass position_Sonstige_TypeClass = (Position_Sonstige_TypeClass)theEObject;
				T result = casePosition_Sonstige_TypeClass(position_Sonstige_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(position_Sonstige_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.POSITION_TYPE_CLASS: {
				Position_TypeClass position_TypeClass = (Position_TypeClass)theEObject;
				T result = casePosition_TypeClass(position_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(position_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.PRIMAERQUELLE_TYPE_CLASS: {
				Primaerquelle_TypeClass primaerquelle_TypeClass = (Primaerquelle_TypeClass)theEObject;
				T result = casePrimaerquelle_TypeClass(primaerquelle_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(primaerquelle_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.PRIORITAET_TYPE_CLASS: {
				Prioritaet_TypeClass prioritaet_TypeClass = (Prioritaet_TypeClass)theEObject;
				T result = casePrioritaet_TypeClass(prioritaet_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(prioritaet_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP: {
				Prog_Datei_Einzel_AttributeGroup prog_Datei_Einzel_AttributeGroup = (Prog_Datei_Einzel_AttributeGroup)theEObject;
				T result = caseProg_Datei_Einzel_AttributeGroup(prog_Datei_Einzel_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE: {
				Prog_Datei_Gruppe prog_Datei_Gruppe = (Prog_Datei_Gruppe)theEObject;
				T result = caseProg_Datei_Gruppe(prog_Datei_Gruppe);
				if (result == null) result = caseBasis_Objekt(prog_Datei_Gruppe);
				if (result == null) result = caseUr_Objekt(prog_Datei_Gruppe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.RBC: {
				RBC rbc = (RBC)theEObject;
				T result = caseRBC(rbc);
				if (result == null) result = caseBasis_Objekt(rbc);
				if (result == null) result = caseUr_Objekt(rbc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.RBC_ALLG_ATTRIBUTE_GROUP: {
				RBC_Allg_AttributeGroup rbC_Allg_AttributeGroup = (RBC_Allg_AttributeGroup)theEObject;
				T result = caseRBC_Allg_AttributeGroup(rbC_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.RBC_SRS_UNTERVERSION_TYPE_CLASS: {
				RBC_SRS_Unterversion_TypeClass rbC_SRS_Unterversion_TypeClass = (RBC_SRS_Unterversion_TypeClass)theEObject;
				T result = caseRBC_SRS_Unterversion_TypeClass(rbC_SRS_Unterversion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rbC_SRS_Unterversion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.RBC_SRS_VERSION_TYPE_CLASS: {
				RBC_SRS_Version_TypeClass rbC_SRS_Version_TypeClass = (RBC_SRS_Version_TypeClass)theEObject;
				T result = caseRBC_SRS_Version_TypeClass(rbC_SRS_Version_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rbC_SRS_Version_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.REKURSION_2NR_TYPE_CLASS: {
				Rekursion_2_Nr_TypeClass rekursion_2_Nr_TypeClass = (Rekursion_2_Nr_TypeClass)theEObject;
				T result = caseRekursion_2_Nr_TypeClass(rekursion_2_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rekursion_2_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.REKURSION_NR_TYPE_CLASS: {
				Rekursion_Nr_TypeClass rekursion_Nr_TypeClass = (Rekursion_Nr_TypeClass)theEObject;
				T result = caseRekursion_Nr_TypeClass(rekursion_Nr_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rekursion_Nr_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.RUFNUMMER_TYPE_CLASS: {
				Rufnummer_TypeClass rufnummer_TypeClass = (Rufnummer_TypeClass)theEObject;
				T result = caseRufnummer_TypeClass(rufnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(rufnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SBE_TYPE_CLASS: {
				SBE_TypeClass sbE_TypeClass = (SBE_TypeClass)theEObject;
				T result = caseSBE_TypeClass(sbE_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sbE_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_ERFORDERLICH_TYPE_CLASS: {
				Schutzstrecke_Erforderlich_TypeClass schutzstrecke_Erforderlich_TypeClass = (Schutzstrecke_Erforderlich_TypeClass)theEObject;
				T result = caseSchutzstrecke_Erforderlich_TypeClass(schutzstrecke_Erforderlich_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schutzstrecke_Erforderlich_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SCHUTZSTRECKE_VORHANDEN_TYPE_CLASS: {
				Schutzstrecke_Vorhanden_TypeClass schutzstrecke_Vorhanden_TypeClass = (Schutzstrecke_Vorhanden_TypeClass)theEObject;
				T result = caseSchutzstrecke_Vorhanden_TypeClass(schutzstrecke_Vorhanden_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(schutzstrecke_Vorhanden_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SONSTIGE_STANDORTANGABE_TYPE_CLASS: {
				Sonstige_Standortangabe_TypeClass sonstige_Standortangabe_TypeClass = (Sonstige_Standortangabe_TypeClass)theEObject;
				T result = caseSonstige_Standortangabe_TypeClass(sonstige_Standortangabe_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sonstige_Standortangabe_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SPANNUNG_ART_TYPE_CLASS: {
				Spannung_Art_TypeClass spannung_Art_TypeClass = (Spannung_Art_TypeClass)theEObject;
				T result = caseSpannung_Art_TypeClass(spannung_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(spannung_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_OBERE_TYPE_CLASS: {
				Spannung_Toleranz_Obere_TypeClass spannung_Toleranz_Obere_TypeClass = (Spannung_Toleranz_Obere_TypeClass)theEObject;
				T result = caseSpannung_Toleranz_Obere_TypeClass(spannung_Toleranz_Obere_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(spannung_Toleranz_Obere_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SPANNUNG_TOLERANZ_UNTERE_TYPE_CLASS: {
				Spannung_Toleranz_Untere_TypeClass spannung_Toleranz_Untere_TypeClass = (Spannung_Toleranz_Untere_TypeClass)theEObject;
				T result = caseSpannung_Toleranz_Untere_TypeClass(spannung_Toleranz_Untere_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(spannung_Toleranz_Untere_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SRS_UNTERVERSION_TYPE_CLASS: {
				SRS_Unterversion_TypeClass srS_Unterversion_TypeClass = (SRS_Unterversion_TypeClass)theEObject;
				T result = caseSRS_Unterversion_TypeClass(srS_Unterversion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(srS_Unterversion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SRS_VERSION_TYPE_CLASS: {
				SRS_Version_TypeClass srS_Version_TypeClass = (SRS_Version_TypeClass)theEObject;
				T result = caseSRS_Version_TypeClass(srS_Version_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(srS_Version_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.STANDORTANGABE_BALISENSCHILD_TYPE_CLASS: {
				Standortangabe_Balisenschild_TypeClass standortangabe_Balisenschild_TypeClass = (Standortangabe_Balisenschild_TypeClass)theEObject;
				T result = caseStandortangabe_Balisenschild_TypeClass(standortangabe_Balisenschild_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(standortangabe_Balisenschild_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP: {
				Start_W_Element_AttributeGroup start_W_Element_AttributeGroup = (Start_W_Element_AttributeGroup)theEObject;
				T result = caseStart_W_Element_AttributeGroup(start_W_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.STZ_TYPE_CLASS: {
				STZ_TypeClass stZ_TypeClass = (STZ_TypeClass)theEObject;
				T result = caseSTZ_TypeClass(stZ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(stZ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_BESONDERS_TYPE_CLASS: {
				System_Vor_Grenze_Besonders_TypeClass system_Vor_Grenze_Besonders_TypeClass = (System_Vor_Grenze_Besonders_TypeClass)theEObject;
				T result = caseSystem_Vor_Grenze_Besonders_TypeClass(system_Vor_Grenze_Besonders_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(system_Vor_Grenze_Besonders_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.SYSTEM_VOR_GRENZE_TYPE_CLASS: {
				System_Vor_Grenze_TypeClass system_Vor_Grenze_TypeClass = (System_Vor_Grenze_TypeClass)theEObject;
				T result = caseSystem_Vor_Grenze_TypeClass(system_Vor_Grenze_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(system_Vor_Grenze_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.TBV_MELDEPUNKT_TYPE_CLASS: {
				TBV_Meldepunkt_TypeClass tbV_Meldepunkt_TypeClass = (TBV_Meldepunkt_TypeClass)theEObject;
				T result = caseTBV_Meldepunkt_TypeClass(tbV_Meldepunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tbV_Meldepunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.TBV_TUNNELBEREICH_LAENGE_TYPE_CLASS: {
				TBV_Tunnelbereich_Laenge_TypeClass tbV_Tunnelbereich_Laenge_TypeClass = (TBV_Tunnelbereich_Laenge_TypeClass)theEObject;
				T result = caseTBV_Tunnelbereich_Laenge_TypeClass(tbV_Tunnelbereich_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tbV_Tunnelbereich_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.TBV_TUNNELSIGNAL_TYPE_CLASS: {
				TBV_Tunnelsignal_TypeClass tbV_Tunnelsignal_TypeClass = (TBV_Tunnelsignal_TypeClass)theEObject;
				T result = caseTBV_Tunnelsignal_TypeClass(tbV_Tunnelsignal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tbV_Tunnelsignal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.TELEGRAMMNUMMER_TYPE_CLASS: {
				Telegrammnummer_TypeClass telegrammnummer_TypeClass = (Telegrammnummer_TypeClass)theEObject;
				T result = caseTelegrammnummer_TypeClass(telegrammnummer_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(telegrammnummer_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.TEXT_BEDINGUNG_TYPE_CLASS: {
				Text_Bedingung_TypeClass text_Bedingung_TypeClass = (Text_Bedingung_TypeClass)theEObject;
				T result = caseText_Bedingung_TypeClass(text_Bedingung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(text_Bedingung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.UEBERBRUECKUNG_EV_UNTERBRECHUNG_TYPE_CLASS: {
				Ueberbrueckung_EV_Unterbrechung_TypeClass ueberbrueckung_EV_Unterbrechung_TypeClass = (Ueberbrueckung_EV_Unterbrechung_TypeClass)theEObject;
				T result = caseUeberbrueckung_EV_Unterbrechung_TypeClass(ueberbrueckung_EV_Unterbrechung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ueberbrueckung_EV_Unterbrechung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.UMFAHRSTRASSE_TYPE_CLASS: {
				Umfahrstrasse_TypeClass umfahrstrasse_TypeClass = (Umfahrstrasse_TypeClass)theEObject;
				T result = caseUmfahrstrasse_TypeClass(umfahrstrasse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(umfahrstrasse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.UNTERGRUPPEN_ID_TYPE_CLASS: {
				Untergruppen_ID_TypeClass untergruppen_ID_TypeClass = (Untergruppen_ID_TypeClass)theEObject;
				T result = caseUntergruppen_ID_TypeClass(untergruppen_ID_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(untergruppen_ID_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VBEFEHL_RTYPE_CLASS: {
				V_Befehl_R_TypeClass v_Befehl_R_TypeClass = (V_Befehl_R_TypeClass)theEObject;
				T result = caseV_Befehl_R_TypeClass(v_Befehl_R_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Befehl_R_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VBEFEHL_ZTYPE_CLASS: {
				V_Befehl_Z_TypeClass v_Befehl_Z_TypeClass = (V_Befehl_Z_TypeClass)theEObject;
				T result = caseV_Befehl_Z_TypeClass(v_Befehl_Z_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Befehl_Z_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VFREI_TYPE_CLASS: {
				V_Frei_TypeClass v_Frei_TypeClass = (V_Frei_TypeClass)theEObject;
				T result = caseV_Frei_TypeClass(v_Frei_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Frei_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VZUL_STRECKE_TYPE_CLASS: {
				V_Zul_Strecke_TypeClass v_Zul_Strecke_TypeClass = (V_Zul_Strecke_TypeClass)theEObject;
				T result = caseV_Zul_Strecke_TypeClass(v_Zul_Strecke_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(v_Zul_Strecke_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VERBOT_ANHALTEN_TYPE_CLASS: {
				Verbot_Anhalten_TypeClass verbot_Anhalten_TypeClass = (Verbot_Anhalten_TypeClass)theEObject;
				T result = caseVerbot_Anhalten_TypeClass(verbot_Anhalten_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verbot_Anhalten_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VERBOT_REGENERATIVE_BREMSE_TYPE_CLASS: {
				Verbot_Regenerative_Bremse_TypeClass verbot_Regenerative_Bremse_TypeClass = (Verbot_Regenerative_Bremse_TypeClass)theEObject;
				T result = caseVerbot_Regenerative_Bremse_TypeClass(verbot_Regenerative_Bremse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verbot_Regenerative_Bremse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VERBOT_WB_ART_TYPE_CLASS: {
				Verbot_WB_Art_TypeClass verbot_WB_Art_TypeClass = (Verbot_WB_Art_TypeClass)theEObject;
				T result = caseVerbot_WB_Art_TypeClass(verbot_WB_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verbot_WB_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VERWENDUNG_ALS_RUECKFALL_TYPE_CLASS: {
				Verwendung_Als_Rueckfall_TypeClass verwendung_Als_Rueckfall_TypeClass = (Verwendung_Als_Rueckfall_TypeClass)theEObject;
				T result = caseVerwendung_Als_Rueckfall_TypeClass(verwendung_Als_Rueckfall_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verwendung_Als_Rueckfall_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VERWENDUNG_TYPE_CLASS: {
				Verwendung_TypeClass verwendung_TypeClass = (Verwendung_TypeClass)theEObject;
				T result = caseVerwendung_TypeClass(verwendung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(verwendung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VGR_1TYPE_CLASS: {
				VGR_1_TypeClass vgR_1_TypeClass = (VGR_1_TypeClass)theEObject;
				T result = caseVGR_1_TypeClass(vgR_1_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vgR_1_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VGR_2TYPE_CLASS: {
				VGR_2_TypeClass vgR_2_TypeClass = (VGR_2_TypeClass)theEObject;
				T result = caseVGR_2_TypeClass(vgR_2_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vgR_2_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VGR_TYPE_CLASS: {
				VGR_TypeClass vgR_TypeClass = (VGR_TypeClass)theEObject;
				T result = caseVGR_TypeClass(vgR_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vgR_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VLA_TYPE_CLASS: {
				VLA_TypeClass vlA_TypeClass = (VLA_TypeClass)theEObject;
				T result = caseVLA_TypeClass(vlA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vlA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.VZ_TYPE_CLASS: {
				VZ_TypeClass vZ_TypeClass = (VZ_TypeClass)theEObject;
				T result = caseVZ_TypeClass(vZ_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vZ_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.WANSCHLUSS_TYPE_CLASS: {
				W_Anschluss_TypeClass w_Anschluss_TypeClass = (W_Anschluss_TypeClass)theEObject;
				T result = caseW_Anschluss_TypeClass(w_Anschluss_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Anschluss_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.WLAGE_TYPE_CLASS: {
				W_Lage_TypeClass w_Lage_TypeClass = (W_Lage_TypeClass)theEObject;
				T result = caseW_Lage_TypeClass(w_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(w_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.WIRKRICHTUNG_IN_DATENPUNKT_TYPE_CLASS: {
				Wirkrichtung_In_Datenpunkt_TypeClass wirkrichtung_In_Datenpunkt_TypeClass = (Wirkrichtung_In_Datenpunkt_TypeClass)theEObject;
				T result = caseWirkrichtung_In_Datenpunkt_TypeClass(wirkrichtung_In_Datenpunkt_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirkrichtung_In_Datenpunkt_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.WIRKSAM_TYPE_CLASS: {
				Wirksam_TypeClass wirksam_TypeClass = (Wirksam_TypeClass)theEObject;
				T result = caseWirksam_TypeClass(wirksam_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(wirksam_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_DISTANZ_TYPE_CLASS: {
				ZBS_La_Bereich_Distanz_TypeClass zbS_La_Bereich_Distanz_TypeClass = (ZBS_La_Bereich_Distanz_TypeClass)theEObject;
				T result = caseZBS_La_Bereich_Distanz_TypeClass(zbS_La_Bereich_Distanz_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_La_Bereich_Distanz_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_GESCHWINDIGKEIT_TYPE_CLASS: {
				ZBS_La_Bereich_Geschwindigkeit_TypeClass zbS_La_Bereich_Geschwindigkeit_TypeClass = (ZBS_La_Bereich_Geschwindigkeit_TypeClass)theEObject;
				T result = caseZBS_La_Bereich_Geschwindigkeit_TypeClass(zbS_La_Bereich_Geschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_La_Bereich_Geschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_LAENGE_TYPE_CLASS: {
				ZBS_La_Bereich_Laenge_TypeClass zbS_La_Bereich_Laenge_TypeClass = (ZBS_La_Bereich_Laenge_TypeClass)theEObject;
				T result = caseZBS_La_Bereich_Laenge_TypeClass(zbS_La_Bereich_Laenge_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_La_Bereich_Laenge_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_LA_BEREICH_NEIGUNG_TYPE_CLASS: {
				ZBS_La_Bereich_Neigung_TypeClass zbS_La_Bereich_Neigung_TypeClass = (ZBS_La_Bereich_Neigung_TypeClass)theEObject;
				T result = caseZBS_La_Bereich_Neigung_TypeClass(zbS_La_Bereich_Neigung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_La_Bereich_Neigung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP: {
				ZBS_Merkmale_AttributeGroup zbS_Merkmale_AttributeGroup = (ZBS_Merkmale_AttributeGroup)theEObject;
				T result = caseZBS_Merkmale_AttributeGroup(zbS_Merkmale_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZBS_REAKTION_TYPE_CLASS: {
				ZBS_Reaktion_TypeClass zbS_Reaktion_TypeClass = (ZBS_Reaktion_TypeClass)theEObject;
				T result = caseZBS_Reaktion_TypeClass(zbS_Reaktion_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zbS_Reaktion_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZIEL_DP_AUSRICHTUNG_TYPE_CLASS: {
				Ziel_DP_Ausrichtung_TypeClass ziel_DP_Ausrichtung_TypeClass = (Ziel_DP_Ausrichtung_TypeClass)theEObject;
				T result = caseZiel_DP_Ausrichtung_TypeClass(ziel_DP_Ausrichtung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ziel_DP_Ausrichtung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZIEL_IST_FAHRWEGENDE_TYPE_CLASS: {
				Ziel_Ist_Fahrwegende_TypeClass ziel_Ist_Fahrwegende_TypeClass = (Ziel_Ist_Fahrwegende_TypeClass)theEObject;
				T result = caseZiel_Ist_Fahrwegende_TypeClass(ziel_Ist_Fahrwegende_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ziel_Ist_Fahrwegende_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP: {
				Ziel_W_Element_AttributeGroup ziel_W_Element_AttributeGroup = (Ziel_W_Element_AttributeGroup)theEObject;
				T result = caseZiel_W_Element_AttributeGroup(ziel_W_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZLA_TYPE_CLASS: {
				ZLA_TypeClass zlA_TypeClass = (ZLA_TypeClass)theEObject;
				T result = caseZLA_TypeClass(zlA_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zlA_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE: {
				ZUB_Bereichsgrenze zuB_Bereichsgrenze = (ZUB_Bereichsgrenze)theEObject;
				T result = caseZUB_Bereichsgrenze(zuB_Bereichsgrenze);
				if (result == null) result = casePunkt_Objekt(zuB_Bereichsgrenze);
				if (result == null) result = caseBasis_Objekt(zuB_Bereichsgrenze);
				if (result == null) result = caseUr_Objekt(zuB_Bereichsgrenze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Allg_AttributeGroup zuB_Bereichsgrenze_Allg_AttributeGroup = (ZUB_Bereichsgrenze_Allg_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Allg_AttributeGroup(zuB_Bereichsgrenze_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup zuB_Bereichsgrenze_Bezeichnung_AttributeGroup = (ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Bezeichnung_AttributeGroup(zuB_Bereichsgrenze_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_ESG_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup zuB_Bereichsgrenze_Nach_ESG_AttributeGroup = (ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_ESG_AttributeGroup(zuB_Bereichsgrenze_Nach_ESG_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_GNT_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup zuB_Bereichsgrenze_Nach_GNT_AttributeGroup = (ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_GNT_AttributeGroup(zuB_Bereichsgrenze_Nach_GNT_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_L2_AttributeGroup zuB_Bereichsgrenze_Nach_L2_AttributeGroup = (ZUB_Bereichsgrenze_Nach_L2_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_L2_AttributeGroup(zuB_Bereichsgrenze_Nach_L2_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_LZB_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup zuB_Bereichsgrenze_Nach_LZB_AttributeGroup = (ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_LZB_AttributeGroup(zuB_Bereichsgrenze_Nach_LZB_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup = (ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup(zuB_Bereichsgrenze_Nach_Ohne_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_PZB_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup zuB_Bereichsgrenze_Nach_PZB_AttributeGroup = (ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_PZB_AttributeGroup(zuB_Bereichsgrenze_Nach_PZB_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_SONSTIGE_ATTRIBUTE_GROUP: {
				ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup = (ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup)theEObject;
				T result = caseZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup(zuB_Bereichsgrenze_Nach_Sonstige_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP: {
				ZUB_Bgrenze_RBC_Wechsel_AttributeGroup zuB_Bgrenze_RBC_Wechsel_AttributeGroup = (ZUB_Bgrenze_RBC_Wechsel_AttributeGroup)theEObject;
				T result = caseZUB_Bgrenze_RBC_Wechsel_AttributeGroup(zuB_Bgrenze_RBC_Wechsel_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP: {
				ZUB_SE_Ausruestung_AttributeGroup zuB_SE_Ausruestung_AttributeGroup = (ZUB_SE_Ausruestung_AttributeGroup)theEObject;
				T result = caseZUB_SE_Ausruestung_AttributeGroup(zuB_SE_Ausruestung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT: {
				ZUB_Streckeneigenschaft zuB_Streckeneigenschaft = (ZUB_Streckeneigenschaft)theEObject;
				T result = caseZUB_Streckeneigenschaft(zuB_Streckeneigenschaft);
				if (result == null) result = caseBereich_Objekt(zuB_Streckeneigenschaft);
				if (result == null) result = caseBasis_Objekt(zuB_Streckeneigenschaft);
				if (result == null) result = caseUr_Objekt(zuB_Streckeneigenschaft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP: {
				ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup = (ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup)theEObject;
				T result = caseZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup(zuB_Streckeneigenschaft_Bezeichnung_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstand Grenze Bereich CType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstand Grenze Bereich CType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstand_Grenze_Bereich_C_TypeClass(Abstand_Grenze_Bereich_C_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlagenteil Sonstige Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlagenteil Sonstige Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlagenteil_Sonstige_TypeClass(Anlagenteil_Sonstige_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anordnung Im DP Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anordnung Im DP Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnordnung_Im_DP_TypeClass(Anordnung_Im_DP_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anwendung Sonst Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anwendung Sonst Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnwendung_Sonst_TypeClass(Anwendung_Sonst_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anwendungssystem Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anwendungssystem Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnwendungssystem_TypeClass(Anwendungssystem_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anzahl Voll LEU Kalkuliert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anzahl Voll LEU Kalkuliert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnzahl_Voll_LEU_Kalkuliert_TypeClass(Anzahl_Voll_LEU_Kalkuliert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anzeigetext Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anzeigetext Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnzeigetext_TypeClass(Anzeigetext_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Art Bedingung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Art Bedingung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArt_Bedingung_TypeClass(Art_Bedingung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausgang Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausgang Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusgang_Nr_TypeClass(Ausgang_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusrichtung_TypeClass(Ausrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausstieg ETCS Sperre Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausstieg ETCS Sperre Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusstieg_ETCS_Sperre_TypeClass(Ausstieg_ETCS_Sperre_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalise(Balise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balise Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balise Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalise_Allg_AttributeGroup(Balise_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline SRS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline SRS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseline_SRS_TypeClass(Baseline_SRS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung Besondere Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung Besondere Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_Besondere_AttributeGroup(Bedingung_Besondere_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung PZB Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung PZB Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_PZB_AttributeGroup(Bedingung_PZB_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung Signal Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung Signal Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_Signal_AttributeGroup(Bedingung_Signal_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung Sonstige Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung Sonstige Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_Sonstige_AttributeGroup(Bedingung_Sonstige_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung Weiche Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung Weiche Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_Weiche_AttributeGroup(Bedingung_Weiche_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bedingung Weichenlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bedingung Weichenlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedingung_Weichenlage_TypeClass(Bedingung_Weichenlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Strecke BTS 1Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Strecke BTS 1Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Strecke_BTS_1_TypeClass(Bez_Strecke_BTS_1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Strecke BTS 2Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Strecke BTS 2Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Strecke_BTS_2_TypeClass(Bez_Strecke_BTS_2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez Strecke BTS 3Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez Strecke BTS 3Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_Strecke_BTS_3_TypeClass(Bez_Strecke_BTS_3_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bez ZUB Bereichsgrenze Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bez ZUB Bereichsgrenze Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBez_ZUB_Bereichsgrenze_TypeClass(Bez_ZUB_Bereichsgrenze_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung ETCS Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung ETCS Kante Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_ETCS_Kante_TypeClass(Bezeichnung_ETCS_Kante_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung LEU Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung LEU Anlage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_LEU_Anlage_TypeClass(Bezeichnung_LEU_Anlage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung ZUB SE Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung ZUB SE Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_ZUB_SE_TypeClass(Bezeichnung_ZUB_SE_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezeichnung ZUB Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezeichnung ZUB Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezeichnung_ZUB_TypeClass(Bezeichnung_ZUB_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze Nach ESG Bed Ausstieg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze Nach ESG Bed Ausstieg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup(Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze Nach L2 Bed Einstieg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze Nach L2 Bed Einstieg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_Nach_L2_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze Nach LZB Bed Einstieg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze Nach LZB Bed Einstieg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze Nach Ohne Bed Einstieg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze Nach Ohne Bed Einstieg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze Nach PZB Bed Einstieg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze Nach PZB Bed Einstieg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup(Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bgrenze RBC Wechsel BTS Kette Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bgrenze RBC Wechsel BTS Kette Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binaerdatei</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binaerdatei</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaerdatei(Binaerdatei object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binaerdatei Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binaerdatei Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaerdatei_Allg_AttributeGroup(Binaerdatei_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bremsweg Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bremsweg Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBremsweg_TypeClass(Bremsweg_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLEVELTR Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLEVELTR Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD_LEVELTR_TypeClass(D_LEVELTR_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateiname Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateiname Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateiname_TypeClass(Dateiname_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dateityp Binaerdatei Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dateityp Binaerdatei Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateityp_Binaerdatei_TypeClass(Dateityp_Binaerdatei_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaten_TypeClass(Daten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenpunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenpunkt(Datenpunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenpunkt Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenpunkt Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenpunkt_Allg_AttributeGroup(Datenpunkt_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenpunkt Beschreibung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenpunkt Beschreibung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenpunkt_Beschreibung_TypeClass(Datenpunkt_Beschreibung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenpunkt Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenpunkt Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenpunkt_Laenge_TypeClass(Datenpunkt_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datenpunkt Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datenpunkt Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatenpunkt_Link(Datenpunkt_Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta VGES Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta VGES Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelta_VGES_TypeClass(Delta_VGES_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta VLES Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta VLES Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelta_VLES_TypeClass(Delta_VLES_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta VZES Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta VZES Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelta_VZES_TypeClass(Delta_VZES_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Bezug Betrieblich Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Bezug Betrieblich Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Bezug_Betrieblich_Art_TypeClass(DP_Bezug_Betrieblich_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Bezug Betrieblich Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Bezug Betrieblich Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Bezug_Betrieblich_AttributeGroup(DP_Bezug_Betrieblich_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP ETCS Adresse Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP ETCS Adresse Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_ETCS_Adresse_AttributeGroup(DP_ETCS_Adresse_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Link Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Link Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Link_Art_TypeClass(DP_Link_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Telegramm Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Telegramm Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Telegramm_AttributeGroup(DP_Telegramm_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Telegramm ESG Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Telegramm ESG Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Telegramm_ESG_AttributeGroup(DP_Telegramm_ESG_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_Art_TypeClass(DP_Typ_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_AttributeGroup(DP_Typ_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ ESG Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ ESG Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_ESG_TypeClass(DP_Typ_ESG_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ ETCS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ ETCS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_ETCS_TypeClass(DP_Typ_ETCS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GESG Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GESG Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GESG_AttributeGroup(DP_Typ_GESG_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GETCS Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GETCS Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GETCS_AttributeGroup(DP_Typ_GETCS_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GGNT Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GGNT Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GGNT_AttributeGroup(DP_Typ_GGNT_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GNT Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GNT Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GNT_TypeClass(DP_Typ_GNT_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GSonst Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GSonst Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GSonst_AttributeGroup(DP_Typ_GSonst_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GTrans Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GTrans Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GTrans_AttributeGroup(DP_Typ_GTrans_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ GZBS Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ GZBS Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_GZBS_AttributeGroup(DP_Typ_GZBS_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ Sonst Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ Sonst Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_Sonst_TypeClass(DP_Typ_Sonst_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ Trans Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ Trans Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_Trans_TypeClass(DP_Typ_Trans_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ VLa Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ VLa Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_V_La_TypeClass(DP_Typ_V_La_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DP Typ ZBS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DP Typ ZBS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDP_Typ_ZBS_TypeClass(DP_Typ_ZBS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dunkelschaltanstoss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dunkelschaltanstoss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDunkelschaltanstoss_TypeClass(Dunkelschaltanstoss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Intervall 200 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Intervall 200 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Intervall_200_TypeClass(DWeg_Intervall_200_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Intervall 50 200 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Intervall 50 200 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Intervall_50_200_TypeClass(DWeg_Intervall_50_200_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Intervall 50 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Intervall 50 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Intervall_50_TypeClass(DWeg_Intervall_50_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eingang Gepuffert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eingang Gepuffert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEingang_Gepuffert_TypeClass(Eingang_Gepuffert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einstieg Erlaubt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einstieg Erlaubt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinstieg_Erlaubt_TypeClass(Einstieg_Erlaubt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einstieg Ohne Rueckw Sig Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einstieg Ohne Rueckw Sig Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinstieg_Ohne_Rueckw_Sig_TypeClass(Einstieg_Ohne_Rueckw_Sig_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einzeldatei Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einzeldatei Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinzeldatei_Art_TypeClass(Einzeldatei_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energie Eingang Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energie Eingang Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergie_Eingang_Art_TypeClass(Energie_Eingang_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG Ind Erlaeuterung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG Ind Erlaeuterung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG_Ind_Erlaeuterung_TypeClass(ESG_Ind_Erlaeuterung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG Ind Parameter Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG Ind Parameter Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG_Ind_Parameter_TypeClass(ESG_Ind_Parameter_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG Ind Parameterwert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG Ind Parameterwert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG_Ind_Parameterwert_TypeClass(ESG_Ind_Parameterwert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG Individuelle Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG Individuelle Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG_Individuelle_Merkmale_AttributeGroup(ESG_Individuelle_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESG Spezifische Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESG Spezifische Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESG_Spezifische_Merkmale_AttributeGroup(ESG_Spezifische_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Adresse Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Adresse Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Adresse_AttributeGroup(ETCS_Adresse_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Adresse Kennung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Adresse Kennung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Adresse_Kennung_TypeClass(ETCS_Adresse_Kennung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Adresse NID BG Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Adresse NID BG Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Adresse_NID_BG_TypeClass(ETCS_Adresse_NID_BG_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Adresse NID CType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Adresse NID CType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Adresse_NID_C_TypeClass(ETCS_Adresse_NID_C_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Kante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Kante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Kante(ETCS_Kante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Kante Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Kante Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Kante_Bezeichnung_AttributeGroup(ETCS_Kante_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Kennung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Kennung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Kennung_TypeClass(ETCS_Kennung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Knoten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Knoten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Knoten(ETCS_Knoten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Knoten Art Sonstige Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Knoten Art Sonstige Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Knoten_Art_Sonstige_TypeClass(ETCS_Knoten_Art_Sonstige_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Paketnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Paketnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Paketnummer_TypeClass(ETCS_Paketnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Par Erlaeuterung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Par Erlaeuterung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Par_Erlaeuterung_TypeClass(ETCS_Par_Erlaeuterung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Parametername Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Parametername Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Parametername_TypeClass(ETCS_Parametername_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Parameterwert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Parameterwert Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Parameterwert_TypeClass(ETCS_Parameterwert_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Signal(ETCS_Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Signal Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Signal Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Signal_Allg_AttributeGroup(ETCS_Signal_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Signal DWeg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Signal DWeg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Signal_DWeg_AttributeGroup(ETCS_Signal_DWeg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS Signal TBV Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS Signal TBV Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_Signal_TBV_AttributeGroup(ETCS_Signal_TBV_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS WKr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS WKr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_W_Kr(ETCS_W_Kr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS WKr MUKA Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS WKr MUKA Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_W_Kr_MUKA_AttributeGroup(ETCS_W_Kr_MUKA_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETCS WOrtsgestellt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETCS WOrtsgestellt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETCS_W_Ortsgestellt_TypeClass(ETCS_W_Ortsgestellt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul(EV_Modul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Art_TypeClass(EV_Modul_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Ausgang Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Ausgang Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Ausgang_AttributeGroup(EV_Modul_Ausgang_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Eingang Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Eingang Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Eingang_AttributeGroup(EV_Modul_Eingang_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Physisch Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Physisch Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Physisch_AttributeGroup(EV_Modul_Physisch_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Typ_TypeClass(EV_Modul_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Modul Virtuell Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Modul Virtuell Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV_Modul_Virtuell_AttributeGroup(EV_Modul_Virtuell_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fabrikat Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fabrikat Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFabrikat_TypeClass(Fabrikat_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fachtelegramm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fachtelegramm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFachtelegramm(Fachtelegramm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Anschaltbedingung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Anschaltbedingung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_Anschaltbedingung(FT_Anschaltbedingung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ESG Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ESG Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ESG_Merkmale_AttributeGroup(FT_ESG_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ESG Subtyp Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ESG Subtyp Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ESG_Subtyp_TypeClass(FT_ESG_Subtyp_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ESG Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ESG Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ESG_Typ_TypeClass(FT_ESG_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ETCS L2 Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ETCS L2 Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ETCS_L2_Merkmale_AttributeGroup(FT_ETCS_L2_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ETCS L2 Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ETCS L2 Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ETCS_L2_Typ_TypeClass(FT_ETCS_L2_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ETCS Trans Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ETCS Trans Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ETCS_Trans_Merkmale_AttributeGroup(FT_ETCS_Trans_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ETCS Trans Paket 41 Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ETCS Trans Paket 41 Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ETCS_Trans_Paket_41_AttributeGroup(FT_ETCS_Trans_Paket_41_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ETCS Trans Paket NAttribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ETCS Trans Paket NAttribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ETCS_Trans_Paket_N_AttributeGroup(FT_ETCS_Trans_Paket_N_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Fahrweg Teil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Fahrweg Teil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_Fahrweg_Teil(FT_Fahrweg_Teil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Fahrweg Teil Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Fahrweg Teil Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_Fahrweg_Teil_Allg_AttributeGroup(FT_Fahrweg_Teil_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Fahrweg Teile Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Fahrweg Teile Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_Fahrweg_Teile_AttributeGroup(FT_Fahrweg_Teile_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT GNT Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT GNT Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_GNT_Merkmale_AttributeGroup(FT_GNT_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT GNT Punktart Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT GNT Punktart Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_GNT_Punktart_TypeClass(FT_GNT_Punktart_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Hinweis Funktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Hinweis Funktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_Hinweis_Funktion_TypeClass(FT_Hinweis_Funktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ZBS Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ZBS Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ZBS_Merkmale_AttributeGroup(FT_ZBS_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ZBS Merkmale La Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ZBS Merkmale La Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ZBS_Merkmale_La_AttributeGroup(FT_ZBS_Merkmale_La_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT ZBS Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT ZBS Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFT_ZBS_Typ_TypeClass(FT_ZBS_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNT Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNT Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNT_Merkmale_AttributeGroup(GNT_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gruppen ID Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gruppen ID Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGruppen_ID_TypeClass(Gruppen_ID_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harter Ausstieg Aus L2 Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harter Ausstieg Aus L2 Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarter_Ausstieg_Aus_L2_TypeClass(Harter_Ausstieg_Aus_L2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hersteller Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hersteller Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHersteller_TypeClass(Hersteller_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hinweis Balisenbefestigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hinweis Balisenbefestigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHinweis_Balisenbefestigung_TypeClass(Hinweis_Balisenbefestigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individuell Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individuell Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividuell_TypeClass(Individuell_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ist Befahren Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ist Befahren Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIst_Befahren_TypeClass(Ist_Befahren_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Km BTS 1Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Km BTS 1Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKm_BTS_1_TypeClass(Km_BTS_1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Km BTS 2Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Km BTS 2Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKm_BTS_2_TypeClass(Km_BTS_2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Km BTS 3Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Km BTS 3Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKm_BTS_3_TypeClass(Km_BTS_3_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knoten Auf TOP Kante Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knoten Auf TOP Kante Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnoten_Auf_TOP_Kante_AttributeGroup(Knoten_Auf_TOP_Kante_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Konfigurationskennung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Konfigurationskennung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKonfigurationskennung_TypeClass(Konfigurationskennung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LACKLEVELTR Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LACKLEVELTR Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL_ACKLEVELTR_TypeClass(L_ACKLEVELTR_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laenge 1Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laenge 1Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaenge_1_TypeClass(Laenge_1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laenge Ausfuehrungsbereich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laenge Ausfuehrungsbereich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaenge_Ausfuehrungsbereich_TypeClass(Laenge_Ausfuehrungsbereich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Anlage(LEU_Anlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Anlage Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Anlage Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Anlage_Bezeichnung_AttributeGroup(LEU_Anlage_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Anlage Moduleigenschaften Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Anlage Moduleigenschaften Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Anlage_Moduleigenschaften_AttributeGroup(LEU_Anlage_Moduleigenschaften_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Ausgang Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Ausgang Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Ausgang_Nr_TypeClass(LEU_Ausgang_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul(LEU_Modul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul_Allg_AttributeGroup(LEU_Modul_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul_Art_TypeClass(LEU_Modul_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul Ausgang Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul Ausgang Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul_Ausgang_AttributeGroup(LEU_Modul_Ausgang_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul_Bezeichnung_AttributeGroup(LEU_Modul_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Modul Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Modul Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Modul_Typ_TypeClass(LEU_Modul_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Schaltkasten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Schaltkasten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Schaltkasten(LEU_Schaltkasten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Schaltkasten Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Schaltkasten Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Schaltkasten_Bezeichnung_AttributeGroup(LEU_Schaltkasten_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Schaltkasten Energie Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Schaltkasten Energie Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Schaltkasten_Energie_AttributeGroup(LEU_Schaltkasten_Energie_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Schaltkasten Position Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Schaltkasten Position Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Schaltkasten_Position_AttributeGroup(LEU_Schaltkasten_Position_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Schaltkasten Typ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Schaltkasten Typ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Schaltkasten_Typ_TypeClass(LEU_Schaltkasten_Typ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEU Steuernde Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEU Steuernde Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEU_Steuernde_AttributeGroup(LEU_Steuernde_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lfd Nr Am Bezugspunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lfd Nr Am Bezugspunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLfd_Nr_Am_Bezugspunkt_TypeClass(Lfd_Nr_Am_Bezugspunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lfd Nr in Telegr Spec Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lfd Nr in Telegr Spec Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLfdNr_in_Telegr_Spec_TypeClass(LfdNr_in_Telegr_Spec_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Distanz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Distanz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink_Distanz_TypeClass(Link_Distanz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLA_TypeClass(LLA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LM GType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LM GType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLM_G_TypeClass(LM_G_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luft Telegramm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luft Telegramm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuft_Telegramm(Luft_Telegramm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLEVELTR Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLEVELTR Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_LEVELTR_TypeClass(M_LEVELTR_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Massgebende Neig 1Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Massgebende Neig 1Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassgebende_Neig_1_TypeClass(Massgebende_Neig_1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Massgebende Neig Schutzstrecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Massgebende Neig Schutzstrecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassgebende_Neig_Schutzstrecke_TypeClass(Massgebende_Neig_Schutzstrecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mastschild Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mastschild Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMastschild_TypeClass(Mastschild_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Leistung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Leistung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_Leistung_TypeClass(Max_Leistung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Unterbrechungszeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Unterbrechungszeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_Unterbrechungszeit_TypeClass(Max_Unterbrechungszeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metallteil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metallteil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetallteil_TypeClass(Metallteil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulnummer_TypeClass(Modulnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeigung_TypeClass(Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nennleistung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nennleistung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNennleistung_TypeClass(Nennleistung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID CType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID CType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_C_TypeClass(NID_C_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID RBC Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID RBC Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_RBC_TypeClass(NID_RBC_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NID STM Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NID STM Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNID_STM_TypeClass(NID_STM_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nummer Schaltkasten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nummer Schaltkasten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNummer_Schaltkasten_TypeClass(Nummer_Schaltkasten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oberstrombegrenzung Gueterzug Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oberstrombegrenzung Gueterzug Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOberstrombegrenzung_Gueterzug_TypeClass(Oberstrombegrenzung_Gueterzug_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oberstrombegrenzung Reisezug Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oberstrombegrenzung Reisezug Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOberstrombegrenzung_Reisezug_TypeClass(Oberstrombegrenzung_Reisezug_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Nr Ausg Physisch Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Nr Ausg Physisch Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Nr_Ausg_Physisch_TypeClass(Port_Nr_Ausg_Physisch_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sonstige Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sonstige Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_Sonstige_TypeClass(Position_Sonstige_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition_TypeClass(Position_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primaerquelle Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primaerquelle Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaerquelle_TypeClass(Primaerquelle_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prioritaet Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prioritaet Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritaet_TypeClass(Prioritaet_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Datei Einzel Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Datei Einzel Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProg_Datei_Einzel_AttributeGroup(Prog_Datei_Einzel_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Datei Gruppe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Datei Gruppe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProg_Datei_Gruppe(Prog_Datei_Gruppe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBC(RBC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBC Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBC Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBC_Allg_AttributeGroup(RBC_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBC SRS Unterversion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBC SRS Unterversion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBC_SRS_Unterversion_TypeClass(RBC_SRS_Unterversion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBC SRS Version Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBC SRS Version Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBC_SRS_Version_TypeClass(RBC_SRS_Version_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rekursion 2Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rekursion 2Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRekursion_2_Nr_TypeClass(Rekursion_2_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rekursion Nr Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rekursion Nr Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRekursion_Nr_TypeClass(Rekursion_Nr_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rufnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rufnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRufnummer_TypeClass(Rufnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SBE Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SBE Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSBE_TypeClass(SBE_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schutzstrecke Erforderlich Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schutzstrecke Erforderlich Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchutzstrecke_Erforderlich_TypeClass(Schutzstrecke_Erforderlich_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schutzstrecke Vorhanden Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schutzstrecke Vorhanden Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchutzstrecke_Vorhanden_TypeClass(Schutzstrecke_Vorhanden_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Standortangabe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Standortangabe Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstige_Standortangabe_TypeClass(Sonstige_Standortangabe_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spannung Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spannung Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpannung_Art_TypeClass(Spannung_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spannung Toleranz Obere Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spannung Toleranz Obere Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpannung_Toleranz_Obere_TypeClass(Spannung_Toleranz_Obere_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spannung Toleranz Untere Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spannung Toleranz Untere Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpannung_Toleranz_Untere_TypeClass(Spannung_Toleranz_Untere_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRS Unterversion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRS Unterversion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRS_Unterversion_TypeClass(SRS_Unterversion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRS Version Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRS Version Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRS_Version_TypeClass(SRS_Version_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standortangabe Balisenschild Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standortangabe Balisenschild Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandortangabe_Balisenschild_TypeClass(Standortangabe_Balisenschild_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start WElement Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start WElement Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart_W_Element_AttributeGroup(Start_W_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STZ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STZ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTZ_TypeClass(STZ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Vor Grenze Besonders Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Vor Grenze Besonders Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_Vor_Grenze_Besonders_TypeClass(System_Vor_Grenze_Besonders_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Vor Grenze Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Vor Grenze Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_Vor_Grenze_TypeClass(System_Vor_Grenze_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBV Meldepunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBV Meldepunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBV_Meldepunkt_TypeClass(TBV_Meldepunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBV Tunnelbereich Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBV Tunnelbereich Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBV_Tunnelbereich_Laenge_TypeClass(TBV_Tunnelbereich_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBV Tunnelsignal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBV Tunnelsignal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBV_Tunnelsignal_TypeClass(TBV_Tunnelsignal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telegrammnummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telegrammnummer Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelegrammnummer_TypeClass(Telegrammnummer_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Bedingung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Bedingung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText_Bedingung_TypeClass(Text_Bedingung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ueberbrueckung EV Unterbrechung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ueberbrueckung EV Unterbrechung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUeberbrueckung_EV_Unterbrechung_TypeClass(Ueberbrueckung_EV_Unterbrechung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Umfahrstrasse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Umfahrstrasse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmfahrstrasse_TypeClass(Umfahrstrasse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Untergruppen ID Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Untergruppen ID Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntergruppen_ID_TypeClass(Untergruppen_ID_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBefehl RType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBefehl RType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Befehl_R_TypeClass(V_Befehl_R_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBefehl ZType Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBefehl ZType Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Befehl_Z_TypeClass(V_Befehl_Z_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VFrei Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VFrei Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Frei_TypeClass(V_Frei_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VZul Strecke Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VZul Strecke Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Zul_Strecke_TypeClass(V_Zul_Strecke_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbot Anhalten Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbot Anhalten Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbot_Anhalten_TypeClass(Verbot_Anhalten_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbot Regenerative Bremse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbot Regenerative Bremse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbot_Regenerative_Bremse_TypeClass(Verbot_Regenerative_Bremse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbot WB Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbot WB Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbot_WB_Art_TypeClass(Verbot_WB_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwendung Als Rueckfall Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwendung Als Rueckfall Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwendung_Als_Rueckfall_TypeClass(Verwendung_Als_Rueckfall_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwendung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwendung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwendung_TypeClass(Verwendung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VGR 1Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VGR 1Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVGR_1_TypeClass(VGR_1_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VGR 2Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VGR 2Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVGR_2_TypeClass(VGR_2_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VGR Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VGR Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVGR_TypeClass(VGR_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLA_TypeClass(VLA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VZ Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VZ Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVZ_TypeClass(VZ_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WAnschluss Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WAnschluss Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Anschluss_TypeClass(W_Anschluss_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WLage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WLage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseW_Lage_TypeClass(W_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wirkrichtung In Datenpunkt Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirkrichtung In Datenpunkt Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirkrichtung_In_Datenpunkt_TypeClass(Wirkrichtung_In_Datenpunkt_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wirksam Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wirksam Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirksam_TypeClass(Wirksam_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS La Bereich Distanz Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS La Bereich Distanz Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_La_Bereich_Distanz_TypeClass(ZBS_La_Bereich_Distanz_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS La Bereich Geschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS La Bereich Geschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_La_Bereich_Geschwindigkeit_TypeClass(ZBS_La_Bereich_Geschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS La Bereich Laenge Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS La Bereich Laenge Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_La_Bereich_Laenge_TypeClass(ZBS_La_Bereich_Laenge_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS La Bereich Neigung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS La Bereich Neigung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_La_Bereich_Neigung_TypeClass(ZBS_La_Bereich_Neigung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS Merkmale Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS Merkmale Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_Merkmale_AttributeGroup(ZBS_Merkmale_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZBS Reaktion Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZBS Reaktion Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZBS_Reaktion_TypeClass(ZBS_Reaktion_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ziel DP Ausrichtung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ziel DP Ausrichtung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZiel_DP_Ausrichtung_TypeClass(Ziel_DP_Ausrichtung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ziel Ist Fahrwegende Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ziel Ist Fahrwegende Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZiel_Ist_Fahrwegende_TypeClass(Ziel_Ist_Fahrwegende_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ziel WElement Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ziel WElement Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZiel_W_Element_AttributeGroup(Ziel_W_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLA Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLA Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLA_TypeClass(ZLA_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze(ZUB_Bereichsgrenze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Allg_AttributeGroup(ZUB_Bereichsgrenze_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Bezeichnung_AttributeGroup(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach ESG Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach ESG Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_ESG_AttributeGroup(ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach GNT Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach GNT Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_GNT_AttributeGroup(ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach L2 Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach L2 Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_L2_AttributeGroup(ZUB_Bereichsgrenze_Nach_L2_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach LZB Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach LZB Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_LZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach Ohne Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach Ohne Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup(ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach PZB Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach PZB Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_PZB_AttributeGroup(ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach Sonstige Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bereichsgrenze Nach Sonstige Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup(ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Bgrenze RBC Wechsel Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Bgrenze RBC Wechsel Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Bgrenze_RBC_Wechsel_AttributeGroup(ZUB_Bgrenze_RBC_Wechsel_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB SE Ausruestung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB SE Ausruestung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_SE_Ausruestung_AttributeGroup(ZUB_SE_Ausruestung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Streckeneigenschaft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Streckeneigenschaft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Streckeneigenschaft(ZUB_Streckeneigenschaft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZUB Streckeneigenschaft Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZUB Streckeneigenschaft Bezeichnung Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUr_Objekt(Ur_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis_Objekt(Basis_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punkt Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunkt_Objekt(Punkt_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bereich Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBereich_Objekt(Bereich_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Balisentechnik_ETCSSwitch
