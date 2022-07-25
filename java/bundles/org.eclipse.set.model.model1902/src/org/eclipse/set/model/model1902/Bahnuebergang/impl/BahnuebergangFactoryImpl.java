/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model1902.Bahnuebergang.*;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BahnuebergangFactoryImpl extends EFactoryImpl implements BahnuebergangFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BahnuebergangFactory init() {
		try {
			BahnuebergangFactory theBahnuebergangFactory = (BahnuebergangFactory)EPackage.Registry.INSTANCE.getEFactory(BahnuebergangPackage.eNS_URI);
			if (theBahnuebergangFactory != null) {
				return theBahnuebergangFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BahnuebergangFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnuebergangFactoryImpl() {
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
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS: return createAbstand_Gehweg_Fahrbahn_TypeClass();
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_CLASS: return createAkustik_Fussgaenger_TypeClass();
			case BahnuebergangPackage.AUSRICHTUNG_TYPE_CLASS: return createAusrichtung_TypeClass();
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE_CLASS: return createAusrichtung_Winkel_TypeClass();
			case BahnuebergangPackage.AUTO_HET_TYPE_CLASS: return createAuto_Het_TypeClass();
			case BahnuebergangPackage.BAULAST_TYPE_CLASS: return createBaulast_TypeClass();
			case BahnuebergangPackage.BAUMPROFIL_TYPE_CLASS: return createBaumprofil_TypeClass();
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS: return createBeeinflussung_Strassenverkehr_TypeClass();
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE_CLASS: return createBez_Schrankenantrieb_TypeClass();
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS: return createBezeichnung_BUE_GFR_Eckpunkt_TypeClass();
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS: return createBezeichnung_GFR_Element_TypeClass();
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS: return createBezeichnung_GFR_Tripelspiegel_TypeClass();
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS: return createBezeichnung_Verkehrszeichen_TypeClass();
			case BahnuebergangPackage.BLITZPFEIL_TYPE_CLASS: return createBlitzpfeil_TypeClass();
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP: return createBUE_Abhaengigkeit_Fue_AttributeGroup();
			case BahnuebergangPackage.BUE_ANLAGE: return createBUE_Anlage();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createBUE_Anlage_Allg_AttributeGroup();
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP: return createBUE_Anlage_Fuss_Rad_AttributeGroup();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE: return createBUE_Anlage_Strasse();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP: return createBUE_Anlage_Strasse_Allg_AttributeGroup();
			case BahnuebergangPackage.BUE_ANLAGE_V: return createBUE_Anlage_V();
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP: return createBUE_Anlage_V_Allg_AttributeGroup();
			case BahnuebergangPackage.BUE_AUSSCHALTUNG: return createBUE_Ausschaltung();
			case BahnuebergangPackage.BUE_BAUART_TYPE_CLASS: return createBUE_Bauart_TypeClass();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createBUE_Bedien_Anz_Element_Allg_AttributeGroup();
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT: return createBUE_Bedien_Anzeige_Element();
			case BahnuebergangPackage.BUE_BUESTRA_TYPE_CLASS: return createBUE_Buestra_TypeClass();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG: return createBUE_Deckendes_Signal_Zuordnung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG: return createBUE_Einschaltung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP: return createBUE_Einschaltung_Hp_AttributeGroup();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG: return createBUE_Einschaltung_Zuordnung();
			case BahnuebergangPackage.BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS: return createBUE_Funktionsueberwachung_TypeClass();
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT: return createBUE_Gefahrraum_Eckpunkt();
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup();
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM: return createBUE_Gleisbezogener_Gefahrraum();
			case BahnuebergangPackage.BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS: return createBUE_Handschalteinrichtung_TypeClass();
			case BahnuebergangPackage.BUE_KANTE: return createBUE_Kante();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN: return createBUE_Kreuzungsplan();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP: return createBUE_Kreuzungsplan_Koordinaten_AttributeGroup();
			case BahnuebergangPackage.BUE_MIT_GFR_TYPE_CLASS: return createBUE_Mit_GFR_TypeClass();
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE_CLASS: return createBUE_Nachlaufzeit_TypeClass();
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE_CLASS: return createBUE_Neigung_TypeClass();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE: return createBUE_Schnittstelle();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP: return createBUE_Schnittstelle_Allg_AttributeGroup();
			case BahnuebergangPackage.BUE_SICHERUNGSART_TYPE_CLASS: return createBUE_Sicherungsart_TypeClass();
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE_CLASS: return createBUE_Sicherungszeit_TypeClass();
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL: return createBUE_Spezifisches_Signal();
			case BahnuebergangPackage.BUE_STRASSE_TYPE_CLASS: return createBUE_Strasse_TypeClass();
			case BahnuebergangPackage.BUE_TECHNIK_TYPE_CLASS: return createBUE_Technik_TypeClass();
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE_CLASS: return createBUE_Vorlaufzeit_TypeClass();
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG: return createBUE_WS_Fstr_Zuordnung();
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE_CLASS: return createEinschaltverz_Errechnet_TypeClass();
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS: return createEinschaltverz_Gewaehlt_TypeClass();
			case BahnuebergangPackage.ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS: return createErsatzstecker_Gleisbezogen_TypeClass();
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS: return createFahrbahn_Befestigung_Gleis_TypeClass();
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE_CLASS: return createFahrbahn_Befestigung_TypeClass();
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE_CLASS: return createFahrbahn_Breite_TypeClass();
			case BahnuebergangPackage.FUE_SCHALTFALL_TYPE_CLASS: return createFue_Schaltfall_TypeClass();
			case BahnuebergangPackage.FUSS_RADWEG_ART_TYPE_CLASS: return createFuss_Radweg_Art_TypeClass();
			case BahnuebergangPackage.FUSS_RADWEG_SEITE_TYPE_CLASS: return createFuss_Radweg_Seite_TypeClass();
			case BahnuebergangPackage.GFR_ANLAGE: return createGFR_Anlage();
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP: return createGFR_Anlage_Allg_AttributeGroup();
			case BahnuebergangPackage.GFR_ART_TYPE_CLASS: return createGFR_Art_TypeClass();
			case BahnuebergangPackage.GFR_ELEMENT: return createGFR_Element();
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createGFR_Element_Bezeichnung_AttributeGroup();
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE_CLASS: return createGFR_Neigung_TypeClass();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL: return createGFR_Tripelspiegel();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP: return createGFR_Tripelspiegel_Allg_AttributeGroup();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP: return createGFR_Tripelspiegel_Bezeichnung_AttributeGroup();
			case BahnuebergangPackage.GFR_TYP_TYPE_CLASS: return createGFR_Typ_TypeClass();
			case BahnuebergangPackage.GITTERBEHANG_TYPE_CLASS: return createGitterbehang_TypeClass();
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE_CLASS: return createGleis_Am_Bue_TypeClass();
			case BahnuebergangPackage.HERSTELLER_TYPE_CLASS: return createHersteller_TypeClass();
			case BahnuebergangPackage.HP_ERSATZSTECKER_TYPE_CLASS: return createHp_Ersatzstecker_TypeClass();
			case BahnuebergangPackage.KLASSIFIZIERUNG_TYPE_CLASS: return createKlassifizierung_TypeClass();
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_CLASS: return createKontrastblende_TypeClass();
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE_CLASS: return createKreuzungswinkel_TypeClass();
			case BahnuebergangPackage.KURZZUGSCHALTUNG_TYPE_CLASS: return createKurzzugschaltung_TypeClass();
			case BahnuebergangPackage.LAGERUNG_ART_TYPE_CLASS: return createLagerung_Art_TypeClass();
			case BahnuebergangPackage.LFUE_IMPULS_TYPE_CLASS: return createLFUE_Impuls_TypeClass();
			case BahnuebergangPackage.LIEFERLAENGE_TYPE_CLASS: return createLieferlaenge_TypeClass();
			case BahnuebergangPackage.MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS: return createMontage_Ausgleichsgewichte_TypeClass();
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE_CLASS: return createMontage_Besonders_TypeClass();
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE_CLASS: return createMontagehoehe_TypeClass();
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE_CLASS: return createOptik_Durchmesser_TypeClass();
			case BahnuebergangPackage.OPTIK_SYMBOLMASKE_TYPE_CLASS: return createOptik_Symbolmaske_TypeClass();
			case BahnuebergangPackage.PEGEL_TYPE_CLASS: return createPegel_TypeClass();
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE_CLASS: return createPixel_Koordinate_X_TypeClass();
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE_CLASS: return createPixel_Koordinate_Y_TypeClass();
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE_CLASS: return createRaeumstrecke_DAB_TypeClass();
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE_CLASS: return createRaeumstrecke_DBK_TypeClass();
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE_CLASS: return createRaeumstrecke_DCK_TypeClass();
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS: return createRaeumstrecke_DSK_Strich_TypeClass();
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE_CLASS: return createRaeumstrecke_TypeClass();
			case BahnuebergangPackage.RICHTUNGSPFEIL_TYPE_CLASS: return createRichtungspfeil_TypeClass();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP: return createSA_Schrankenbaum_AttributeGroup();
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE_CLASS: return createSchaltgruppe_TypeClass();
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG: return createSchaltmittel_Fstr_Zuordnung();
			case BahnuebergangPackage.SCHRANKENANTRIEB: return createSchrankenantrieb();
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP: return createSchrankenantrieb_Allg_AttributeGroup();
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP: return createSchrankenantrieb_Bezeichnung_AttributeGroup();
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_CLASS: return createSchutzbuegel_TypeClass();
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE_CLASS: return createSicherheitsabstand_TypeClass();
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE_CLASS: return createSignalverz_Errechnet_TypeClass();
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE_CLASS: return createSignalverz_Gewaehlt_TypeClass();
			case BahnuebergangPackage.SPERRLAENGE_TYPE_CLASS: return createSperrlaenge_TypeClass();
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS: return createSperrstrecke_Fussgaenger_TypeClass();
			case BahnuebergangPackage.SPERRSTRECKE_TYPE_CLASS: return createSperrstrecke_TypeClass();
			case BahnuebergangPackage.STOERHALT_HALTFALL_TYPE_CLASS: return createStoerhalt_Haltfall_TypeClass();
			case BahnuebergangPackage.STOERHALT_MERKHINWEIS_TYPE_CLASS: return createStoerhalt_Merkhinweis_TypeClass();
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE_CLASS: return createTeilsperrstrecke_TypeClass();
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE_CLASS: return createTeilvorgabezeit_TypeClass();
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_CLASS: return createTragkopf_Verstellbar_TypeClass();
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE_CLASS: return createV_Max_Schiene_TypeClass();
			case BahnuebergangPackage.VMAX_STRASSE_TYPE_CLASS: return createV_Max_Strasse_TypeClass();
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE_CLASS: return createV_Min_Fussweg_TypeClass();
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE_CLASS: return createV_Min_Schiene_TypeClass();
			case BahnuebergangPackage.VMIN_STRASSE_TYPE_CLASS: return createV_Min_Strasse_TypeClass();
			case BahnuebergangPackage.VERKEHRSZEICHEN: return createVerkehrszeichen();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP: return createVerkehrszeichen_Allg_AttributeGroup();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP: return createVerkehrszeichen_Andreaskreuz_AttributeGroup();
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP: return createVerkehrszeichen_Bezeichnung_AttributeGroup();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP: return createVerkehrszeichen_Lz_AttributeGroup();
			case BahnuebergangPackage.VORGESCHALTET_TYPE_CLASS: return createVorgeschaltet_TypeClass();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP: return createVz_Sperrstrecke_AttributeGroup();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP: return createVz_Sperrstrecke_Schranke_AttributeGroup();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP: return createVz_Sperrstrecke_Vorgeschaltet_AttributeGroup();
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE_CLASS: return createWinkel_Alpha_TypeClass();
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS: return createZeitueberschreitungsmeldung_TypeClass();
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE_CLASS: return createZusatzschild_TypeClass();
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
			case BahnuebergangPackage.ENUM_BAUMPROFIL:
				return createENUMBaumprofilFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_BAUART:
				return createENUMBUEBauartFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG:
				return createENUMBUEFunktionsueberwachungFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG:
				return createENUMBUEHandschalteinrichtungFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART:
				return createENUMBUESicherungsartFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_TECHNIK:
				return createENUMBUETechnikFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL:
				return createENUMFueSchaltfallFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART:
				return createENUMFussRadwegArtFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE:
				return createENUMFussRadwegSeiteFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMGFR_ART:
				return createENUMGFRArtFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER:
				return createENUMHpErsatzsteckerFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG:
				return createENUMKlassifizierungFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_LAGERUNG:
				return createENUMLagerungFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMLFUE_IMPULS:
				return createENUMLFUEImpulsFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE:
				return createENUMMontageAusgleichsgewichteFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL:
				return createENUMOptikSymbolFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL:
				return createENUMRichtungspfeilFromString(eDataType, initialValue);
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE:
				return createAbstand_Gehweg_Fahrbahn_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE:
				return createAkustik_Fussgaenger_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_OBJECT:
				return createAkustik_Fussgaenger_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE:
				return createAusrichtung_Winkel_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BAULAST_TYPE:
				return createBaulast_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE:
				return createBeeinflussung_Strassenverkehr_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE:
				return createBez_Schrankenantrieb_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE:
				return createBezeichnung_BUE_GFR_Eckpunkt_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE:
				return createBezeichnung_GFR_Element_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE:
				return createBezeichnung_GFR_Tripelspiegel_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE:
				return createBezeichnung_Verkehrszeichen_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BLITZPFEIL_TYPE:
				return createBlitzpfeil_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BLITZPFEIL_TYPE_OBJECT:
				return createBlitzpfeil_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE:
				return createBUE_Nachlaufzeit_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE:
				return createBUE_Neigung_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE:
				return createBUE_Sicherungszeit_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BUE_STRASSE_TYPE:
				return createBUE_Strasse_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE:
				return createBUE_Vorlaufzeit_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE:
				return createEinschaltverz_Errechnet_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE:
				return createEinschaltverz_Gewaehlt_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_BAUMPROFIL_OBJECT:
				return createENUMBaumprofilObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_BAUART_OBJECT:
				return createENUMBUEBauartObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG_OBJECT:
				return createENUMBUEFunktionsueberwachungObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG_OBJECT:
				return createENUMBUEHandschalteinrichtungObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART_OBJECT:
				return createENUMBUESicherungsartObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMBUE_TECHNIK_OBJECT:
				return createENUMBUETechnikObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL_OBJECT:
				return createENUMFueSchaltfallObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART_OBJECT:
				return createENUMFussRadwegArtObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE_OBJECT:
				return createENUMFussRadwegSeiteObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMGFR_ART_OBJECT:
				return createENUMGFRArtObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER_OBJECT:
				return createENUMHpErsatzsteckerObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG_OBJECT:
				return createENUMKlassifizierungObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_LAGERUNG_OBJECT:
				return createENUMLagerungObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUMLFUE_IMPULS_OBJECT:
				return createENUMLFUEImpulsObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE_OBJECT:
				return createENUMMontageAusgleichsgewichteObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL_OBJECT:
				return createENUMOptikSymbolObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL_OBJECT:
				return createENUMRichtungspfeilObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE:
				return createFahrbahn_Befestigung_Gleis_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE:
				return createFahrbahn_Befestigung_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE:
				return createFahrbahn_Breite_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE:
				return createGFR_Neigung_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.GFR_TYP_TYPE:
				return createGFR_Typ_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE:
				return createGleis_Am_Bue_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE:
				return createKontrastblende_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_OBJECT:
				return createKontrastblende_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE:
				return createKreuzungswinkel_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.LIEFERLAENGE_TYPE:
				return createLieferlaenge_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE:
				return createMontage_Besonders_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE:
				return createMontagehoehe_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE:
				return createOptik_Durchmesser_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.PEGEL_TYPE:
				return createPegel_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE:
				return createPixel_Koordinate_X_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE:
				return createPixel_Koordinate_Y_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE:
				return createRaeumstrecke_DAB_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE:
				return createRaeumstrecke_DBK_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE:
				return createRaeumstrecke_DCK_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE:
				return createRaeumstrecke_DSK_Strich_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE:
				return createRaeumstrecke_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE:
				return createSchaltgruppe_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE:
				return createSchutzbuegel_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_OBJECT:
				return createSchutzbuegel_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE:
				return createSicherheitsabstand_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE:
				return createSignalverz_Errechnet_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE:
				return createSignalverz_Gewaehlt_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SPERRLAENGE_TYPE:
				return createSperrlaenge_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE:
				return createSperrstrecke_Fussgaenger_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.SPERRSTRECKE_TYPE:
				return createSperrstrecke_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE:
				return createTeilsperrstrecke_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE:
				return createTeilvorgabezeit_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE:
				return createTragkopf_Verstellbar_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_OBJECT:
				return createTragkopf_Verstellbar_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE:
				return createV_Max_Schiene_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VMAX_STRASSE_TYPE:
				return createV_Max_Strasse_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE:
				return createV_Min_Fussweg_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE:
				return createV_Min_Schiene_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VMIN_STRASSE_TYPE:
				return createV_Min_Strasse_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VORGESCHALTET_TYPE:
				return createVorgeschaltet_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.VORGESCHALTET_TYPE_OBJECT:
				return createVorgeschaltet_TypeObjectFromString(eDataType, initialValue);
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE:
				return createWinkel_Alpha_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE:
				return createZeitueberschreitungsmeldung_TypeFromString(eDataType, initialValue);
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE:
				return createZusatzschild_TypeFromString(eDataType, initialValue);
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
			case BahnuebergangPackage.ENUM_BAUMPROFIL:
				return convertENUMBaumprofilToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_BAUART:
				return convertENUMBUEBauartToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG:
				return convertENUMBUEFunktionsueberwachungToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG:
				return convertENUMBUEHandschalteinrichtungToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART:
				return convertENUMBUESicherungsartToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_TECHNIK:
				return convertENUMBUETechnikToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL:
				return convertENUMFueSchaltfallToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART:
				return convertENUMFussRadwegArtToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE:
				return convertENUMFussRadwegSeiteToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMGFR_ART:
				return convertENUMGFRArtToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER:
				return convertENUMHpErsatzsteckerToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG:
				return convertENUMKlassifizierungToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_LAGERUNG:
				return convertENUMLagerungToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMLFUE_IMPULS:
				return convertENUMLFUEImpulsToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE:
				return convertENUMMontageAusgleichsgewichteToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL:
				return convertENUMOptikSymbolToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL:
				return convertENUMRichtungspfeilToString(eDataType, instanceValue);
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE:
				return convertAbstand_Gehweg_Fahrbahn_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE:
				return convertAkustik_Fussgaenger_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_OBJECT:
				return convertAkustik_Fussgaenger_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE:
				return convertAusrichtung_Winkel_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BAULAST_TYPE:
				return convertBaulast_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE:
				return convertBeeinflussung_Strassenverkehr_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE:
				return convertBez_Schrankenantrieb_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE:
				return convertBezeichnung_BUE_GFR_Eckpunkt_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE:
				return convertBezeichnung_GFR_Element_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE:
				return convertBezeichnung_GFR_Tripelspiegel_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE:
				return convertBezeichnung_Verkehrszeichen_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BLITZPFEIL_TYPE:
				return convertBlitzpfeil_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BLITZPFEIL_TYPE_OBJECT:
				return convertBlitzpfeil_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE:
				return convertBUE_Nachlaufzeit_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE:
				return convertBUE_Neigung_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE:
				return convertBUE_Sicherungszeit_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BUE_STRASSE_TYPE:
				return convertBUE_Strasse_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE:
				return convertBUE_Vorlaufzeit_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE:
				return convertEinschaltverz_Errechnet_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE:
				return convertEinschaltverz_Gewaehlt_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_BAUMPROFIL_OBJECT:
				return convertENUMBaumprofilObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_BAUART_OBJECT:
				return convertENUMBUEBauartObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG_OBJECT:
				return convertENUMBUEFunktionsueberwachungObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG_OBJECT:
				return convertENUMBUEHandschalteinrichtungObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART_OBJECT:
				return convertENUMBUESicherungsartObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMBUE_TECHNIK_OBJECT:
				return convertENUMBUETechnikObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL_OBJECT:
				return convertENUMFueSchaltfallObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART_OBJECT:
				return convertENUMFussRadwegArtObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE_OBJECT:
				return convertENUMFussRadwegSeiteObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMGFR_ART_OBJECT:
				return convertENUMGFRArtObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER_OBJECT:
				return convertENUMHpErsatzsteckerObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG_OBJECT:
				return convertENUMKlassifizierungObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_LAGERUNG_OBJECT:
				return convertENUMLagerungObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUMLFUE_IMPULS_OBJECT:
				return convertENUMLFUEImpulsObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE_OBJECT:
				return convertENUMMontageAusgleichsgewichteObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL_OBJECT:
				return convertENUMOptikSymbolObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL_OBJECT:
				return convertENUMRichtungspfeilObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE:
				return convertFahrbahn_Befestigung_Gleis_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE:
				return convertFahrbahn_Befestigung_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE:
				return convertFahrbahn_Breite_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE:
				return convertGFR_Neigung_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.GFR_TYP_TYPE:
				return convertGFR_Typ_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE:
				return convertGleis_Am_Bue_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE:
				return convertKontrastblende_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_OBJECT:
				return convertKontrastblende_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE:
				return convertKreuzungswinkel_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.LIEFERLAENGE_TYPE:
				return convertLieferlaenge_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE:
				return convertMontage_Besonders_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE:
				return convertMontagehoehe_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE:
				return convertOptik_Durchmesser_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.PEGEL_TYPE:
				return convertPegel_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE:
				return convertPixel_Koordinate_X_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE:
				return convertPixel_Koordinate_Y_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE:
				return convertRaeumstrecke_DAB_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE:
				return convertRaeumstrecke_DBK_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE:
				return convertRaeumstrecke_DCK_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE:
				return convertRaeumstrecke_DSK_Strich_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE:
				return convertRaeumstrecke_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE:
				return convertSchaltgruppe_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE:
				return convertSchutzbuegel_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_OBJECT:
				return convertSchutzbuegel_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE:
				return convertSicherheitsabstand_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE:
				return convertSignalverz_Errechnet_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE:
				return convertSignalverz_Gewaehlt_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SPERRLAENGE_TYPE:
				return convertSperrlaenge_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE:
				return convertSperrstrecke_Fussgaenger_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.SPERRSTRECKE_TYPE:
				return convertSperrstrecke_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE:
				return convertTeilsperrstrecke_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE:
				return convertTeilvorgabezeit_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE:
				return convertTragkopf_Verstellbar_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_OBJECT:
				return convertTragkopf_Verstellbar_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE:
				return convertV_Max_Schiene_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VMAX_STRASSE_TYPE:
				return convertV_Max_Strasse_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE:
				return convertV_Min_Fussweg_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE:
				return convertV_Min_Schiene_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VMIN_STRASSE_TYPE:
				return convertV_Min_Strasse_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VORGESCHALTET_TYPE:
				return convertVorgeschaltet_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.VORGESCHALTET_TYPE_OBJECT:
				return convertVorgeschaltet_TypeObjectToString(eDataType, instanceValue);
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE:
				return convertWinkel_Alpha_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE:
				return convertZeitueberschreitungsmeldung_TypeToString(eDataType, instanceValue);
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE:
				return convertZusatzschild_TypeToString(eDataType, instanceValue);
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
	public Abstand_Gehweg_Fahrbahn_TypeClass createAbstand_Gehweg_Fahrbahn_TypeClass() {
		Abstand_Gehweg_Fahrbahn_TypeClassImpl abstand_Gehweg_Fahrbahn_TypeClass = new Abstand_Gehweg_Fahrbahn_TypeClassImpl();
		return abstand_Gehweg_Fahrbahn_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustik_Fussgaenger_TypeClass createAkustik_Fussgaenger_TypeClass() {
		Akustik_Fussgaenger_TypeClassImpl akustik_Fussgaenger_TypeClass = new Akustik_Fussgaenger_TypeClassImpl();
		return akustik_Fussgaenger_TypeClass;
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
	public Ausrichtung_Winkel_TypeClass createAusrichtung_Winkel_TypeClass() {
		Ausrichtung_Winkel_TypeClassImpl ausrichtung_Winkel_TypeClass = new Ausrichtung_Winkel_TypeClassImpl();
		return ausrichtung_Winkel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Het_TypeClass createAuto_Het_TypeClass() {
		Auto_Het_TypeClassImpl auto_Het_TypeClass = new Auto_Het_TypeClassImpl();
		return auto_Het_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baulast_TypeClass createBaulast_TypeClass() {
		Baulast_TypeClassImpl baulast_TypeClass = new Baulast_TypeClassImpl();
		return baulast_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baumprofil_TypeClass createBaumprofil_TypeClass() {
		Baumprofil_TypeClassImpl baumprofil_TypeClass = new Baumprofil_TypeClassImpl();
		return baumprofil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beeinflussung_Strassenverkehr_TypeClass createBeeinflussung_Strassenverkehr_TypeClass() {
		Beeinflussung_Strassenverkehr_TypeClassImpl beeinflussung_Strassenverkehr_TypeClass = new Beeinflussung_Strassenverkehr_TypeClassImpl();
		return beeinflussung_Strassenverkehr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Schrankenantrieb_TypeClass createBez_Schrankenantrieb_TypeClass() {
		Bez_Schrankenantrieb_TypeClassImpl bez_Schrankenantrieb_TypeClass = new Bez_Schrankenantrieb_TypeClassImpl();
		return bez_Schrankenantrieb_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_BUE_GFR_Eckpunkt_TypeClass createBezeichnung_BUE_GFR_Eckpunkt_TypeClass() {
		Bezeichnung_BUE_GFR_Eckpunkt_TypeClassImpl bezeichnung_BUE_GFR_Eckpunkt_TypeClass = new Bezeichnung_BUE_GFR_Eckpunkt_TypeClassImpl();
		return bezeichnung_BUE_GFR_Eckpunkt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_GFR_Element_TypeClass createBezeichnung_GFR_Element_TypeClass() {
		Bezeichnung_GFR_Element_TypeClassImpl bezeichnung_GFR_Element_TypeClass = new Bezeichnung_GFR_Element_TypeClassImpl();
		return bezeichnung_GFR_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_GFR_Tripelspiegel_TypeClass createBezeichnung_GFR_Tripelspiegel_TypeClass() {
		Bezeichnung_GFR_Tripelspiegel_TypeClassImpl bezeichnung_GFR_Tripelspiegel_TypeClass = new Bezeichnung_GFR_Tripelspiegel_TypeClassImpl();
		return bezeichnung_GFR_Tripelspiegel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Verkehrszeichen_TypeClass createBezeichnung_Verkehrszeichen_TypeClass() {
		Bezeichnung_Verkehrszeichen_TypeClassImpl bezeichnung_Verkehrszeichen_TypeClass = new Bezeichnung_Verkehrszeichen_TypeClassImpl();
		return bezeichnung_Verkehrszeichen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blitzpfeil_TypeClass createBlitzpfeil_TypeClass() {
		Blitzpfeil_TypeClassImpl blitzpfeil_TypeClass = new Blitzpfeil_TypeClassImpl();
		return blitzpfeil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Abhaengigkeit_Fue_AttributeGroup createBUE_Abhaengigkeit_Fue_AttributeGroup() {
		BUE_Abhaengigkeit_Fue_AttributeGroupImpl buE_Abhaengigkeit_Fue_AttributeGroup = new BUE_Abhaengigkeit_Fue_AttributeGroupImpl();
		return buE_Abhaengigkeit_Fue_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage createBUE_Anlage() {
		BUE_AnlageImpl buE_Anlage = new BUE_AnlageImpl();
		return buE_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Allg_AttributeGroup createBUE_Anlage_Allg_AttributeGroup() {
		BUE_Anlage_Allg_AttributeGroupImpl buE_Anlage_Allg_AttributeGroup = new BUE_Anlage_Allg_AttributeGroupImpl();
		return buE_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Fuss_Rad_AttributeGroup createBUE_Anlage_Fuss_Rad_AttributeGroup() {
		BUE_Anlage_Fuss_Rad_AttributeGroupImpl buE_Anlage_Fuss_Rad_AttributeGroup = new BUE_Anlage_Fuss_Rad_AttributeGroupImpl();
		return buE_Anlage_Fuss_Rad_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Strasse createBUE_Anlage_Strasse() {
		BUE_Anlage_StrasseImpl buE_Anlage_Strasse = new BUE_Anlage_StrasseImpl();
		return buE_Anlage_Strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Strasse_Allg_AttributeGroup createBUE_Anlage_Strasse_Allg_AttributeGroup() {
		BUE_Anlage_Strasse_Allg_AttributeGroupImpl buE_Anlage_Strasse_Allg_AttributeGroup = new BUE_Anlage_Strasse_Allg_AttributeGroupImpl();
		return buE_Anlage_Strasse_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_V createBUE_Anlage_V() {
		BUE_Anlage_VImpl buE_Anlage_V = new BUE_Anlage_VImpl();
		return buE_Anlage_V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_V_Allg_AttributeGroup createBUE_Anlage_V_Allg_AttributeGroup() {
		BUE_Anlage_V_Allg_AttributeGroupImpl buE_Anlage_V_Allg_AttributeGroup = new BUE_Anlage_V_Allg_AttributeGroupImpl();
		return buE_Anlage_V_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Ausschaltung createBUE_Ausschaltung() {
		BUE_AusschaltungImpl buE_Ausschaltung = new BUE_AusschaltungImpl();
		return buE_Ausschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Bauart_TypeClass createBUE_Bauart_TypeClass() {
		BUE_Bauart_TypeClassImpl buE_Bauart_TypeClass = new BUE_Bauart_TypeClassImpl();
		return buE_Bauart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Bedien_Anz_Element_Allg_AttributeGroup createBUE_Bedien_Anz_Element_Allg_AttributeGroup() {
		BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl buE_Bedien_Anz_Element_Allg_AttributeGroup = new BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl();
		return buE_Bedien_Anz_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Bedien_Anzeige_Element createBUE_Bedien_Anzeige_Element() {
		BUE_Bedien_Anzeige_ElementImpl buE_Bedien_Anzeige_Element = new BUE_Bedien_Anzeige_ElementImpl();
		return buE_Bedien_Anzeige_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Buestra_TypeClass createBUE_Buestra_TypeClass() {
		BUE_Buestra_TypeClassImpl buE_Buestra_TypeClass = new BUE_Buestra_TypeClassImpl();
		return buE_Buestra_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Deckendes_Signal_Zuordnung createBUE_Deckendes_Signal_Zuordnung() {
		BUE_Deckendes_Signal_ZuordnungImpl buE_Deckendes_Signal_Zuordnung = new BUE_Deckendes_Signal_ZuordnungImpl();
		return buE_Deckendes_Signal_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung createBUE_Einschaltung() {
		BUE_EinschaltungImpl buE_Einschaltung = new BUE_EinschaltungImpl();
		return buE_Einschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung_Hp_AttributeGroup createBUE_Einschaltung_Hp_AttributeGroup() {
		BUE_Einschaltung_Hp_AttributeGroupImpl buE_Einschaltung_Hp_AttributeGroup = new BUE_Einschaltung_Hp_AttributeGroupImpl();
		return buE_Einschaltung_Hp_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung_Zuordnung createBUE_Einschaltung_Zuordnung() {
		BUE_Einschaltung_ZuordnungImpl buE_Einschaltung_Zuordnung = new BUE_Einschaltung_ZuordnungImpl();
		return buE_Einschaltung_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Funktionsueberwachung_TypeClass createBUE_Funktionsueberwachung_TypeClass() {
		BUE_Funktionsueberwachung_TypeClassImpl buE_Funktionsueberwachung_TypeClass = new BUE_Funktionsueberwachung_TypeClassImpl();
		return buE_Funktionsueberwachung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gefahrraum_Eckpunkt createBUE_Gefahrraum_Eckpunkt() {
		BUE_Gefahrraum_EckpunktImpl buE_Gefahrraum_Eckpunkt = new BUE_Gefahrraum_EckpunktImpl();
		return buE_Gefahrraum_Eckpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup createBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup() {
		BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup = new BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl();
		return buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gleisbezogener_Gefahrraum createBUE_Gleisbezogener_Gefahrraum() {
		BUE_Gleisbezogener_GefahrraumImpl buE_Gleisbezogener_Gefahrraum = new BUE_Gleisbezogener_GefahrraumImpl();
		return buE_Gleisbezogener_Gefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Handschalteinrichtung_TypeClass createBUE_Handschalteinrichtung_TypeClass() {
		BUE_Handschalteinrichtung_TypeClassImpl buE_Handschalteinrichtung_TypeClass = new BUE_Handschalteinrichtung_TypeClassImpl();
		return buE_Handschalteinrichtung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Kante createBUE_Kante() {
		BUE_KanteImpl buE_Kante = new BUE_KanteImpl();
		return buE_Kante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Kreuzungsplan createBUE_Kreuzungsplan() {
		BUE_KreuzungsplanImpl buE_Kreuzungsplan = new BUE_KreuzungsplanImpl();
		return buE_Kreuzungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Kreuzungsplan_Koordinaten_AttributeGroup createBUE_Kreuzungsplan_Koordinaten_AttributeGroup() {
		BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl buE_Kreuzungsplan_Koordinaten_AttributeGroup = new BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl();
		return buE_Kreuzungsplan_Koordinaten_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Mit_GFR_TypeClass createBUE_Mit_GFR_TypeClass() {
		BUE_Mit_GFR_TypeClassImpl buE_Mit_GFR_TypeClass = new BUE_Mit_GFR_TypeClassImpl();
		return buE_Mit_GFR_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Nachlaufzeit_TypeClass createBUE_Nachlaufzeit_TypeClass() {
		BUE_Nachlaufzeit_TypeClassImpl buE_Nachlaufzeit_TypeClass = new BUE_Nachlaufzeit_TypeClassImpl();
		return buE_Nachlaufzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Neigung_TypeClass createBUE_Neigung_TypeClass() {
		BUE_Neigung_TypeClassImpl buE_Neigung_TypeClass = new BUE_Neigung_TypeClassImpl();
		return buE_Neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Schnittstelle createBUE_Schnittstelle() {
		BUE_SchnittstelleImpl buE_Schnittstelle = new BUE_SchnittstelleImpl();
		return buE_Schnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Schnittstelle_Allg_AttributeGroup createBUE_Schnittstelle_Allg_AttributeGroup() {
		BUE_Schnittstelle_Allg_AttributeGroupImpl buE_Schnittstelle_Allg_AttributeGroup = new BUE_Schnittstelle_Allg_AttributeGroupImpl();
		return buE_Schnittstelle_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Sicherungsart_TypeClass createBUE_Sicherungsart_TypeClass() {
		BUE_Sicherungsart_TypeClassImpl buE_Sicherungsart_TypeClass = new BUE_Sicherungsart_TypeClassImpl();
		return buE_Sicherungsart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Sicherungszeit_TypeClass createBUE_Sicherungszeit_TypeClass() {
		BUE_Sicherungszeit_TypeClassImpl buE_Sicherungszeit_TypeClass = new BUE_Sicherungszeit_TypeClassImpl();
		return buE_Sicherungszeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Spezifisches_Signal createBUE_Spezifisches_Signal() {
		BUE_Spezifisches_SignalImpl buE_Spezifisches_Signal = new BUE_Spezifisches_SignalImpl();
		return buE_Spezifisches_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Strasse_TypeClass createBUE_Strasse_TypeClass() {
		BUE_Strasse_TypeClassImpl buE_Strasse_TypeClass = new BUE_Strasse_TypeClassImpl();
		return buE_Strasse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Technik_TypeClass createBUE_Technik_TypeClass() {
		BUE_Technik_TypeClassImpl buE_Technik_TypeClass = new BUE_Technik_TypeClassImpl();
		return buE_Technik_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Vorlaufzeit_TypeClass createBUE_Vorlaufzeit_TypeClass() {
		BUE_Vorlaufzeit_TypeClassImpl buE_Vorlaufzeit_TypeClass = new BUE_Vorlaufzeit_TypeClassImpl();
		return buE_Vorlaufzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_WS_Fstr_Zuordnung createBUE_WS_Fstr_Zuordnung() {
		BUE_WS_Fstr_ZuordnungImpl buE_WS_Fstr_Zuordnung = new BUE_WS_Fstr_ZuordnungImpl();
		return buE_WS_Fstr_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einschaltverz_Errechnet_TypeClass createEinschaltverz_Errechnet_TypeClass() {
		Einschaltverz_Errechnet_TypeClassImpl einschaltverz_Errechnet_TypeClass = new Einschaltverz_Errechnet_TypeClassImpl();
		return einschaltverz_Errechnet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einschaltverz_Gewaehlt_TypeClass createEinschaltverz_Gewaehlt_TypeClass() {
		Einschaltverz_Gewaehlt_TypeClassImpl einschaltverz_Gewaehlt_TypeClass = new Einschaltverz_Gewaehlt_TypeClassImpl();
		return einschaltverz_Gewaehlt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ersatzstecker_Gleisbezogen_TypeClass createErsatzstecker_Gleisbezogen_TypeClass() {
		Ersatzstecker_Gleisbezogen_TypeClassImpl ersatzstecker_Gleisbezogen_TypeClass = new Ersatzstecker_Gleisbezogen_TypeClassImpl();
		return ersatzstecker_Gleisbezogen_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Befestigung_Gleis_TypeClass createFahrbahn_Befestigung_Gleis_TypeClass() {
		Fahrbahn_Befestigung_Gleis_TypeClassImpl fahrbahn_Befestigung_Gleis_TypeClass = new Fahrbahn_Befestigung_Gleis_TypeClassImpl();
		return fahrbahn_Befestigung_Gleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Befestigung_TypeClass createFahrbahn_Befestigung_TypeClass() {
		Fahrbahn_Befestigung_TypeClassImpl fahrbahn_Befestigung_TypeClass = new Fahrbahn_Befestigung_TypeClassImpl();
		return fahrbahn_Befestigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrbahn_Breite_TypeClass createFahrbahn_Breite_TypeClass() {
		Fahrbahn_Breite_TypeClassImpl fahrbahn_Breite_TypeClass = new Fahrbahn_Breite_TypeClassImpl();
		return fahrbahn_Breite_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fue_Schaltfall_TypeClass createFue_Schaltfall_TypeClass() {
		Fue_Schaltfall_TypeClassImpl fue_Schaltfall_TypeClass = new Fue_Schaltfall_TypeClassImpl();
		return fue_Schaltfall_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuss_Radweg_Art_TypeClass createFuss_Radweg_Art_TypeClass() {
		Fuss_Radweg_Art_TypeClassImpl fuss_Radweg_Art_TypeClass = new Fuss_Radweg_Art_TypeClassImpl();
		return fuss_Radweg_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuss_Radweg_Seite_TypeClass createFuss_Radweg_Seite_TypeClass() {
		Fuss_Radweg_Seite_TypeClassImpl fuss_Radweg_Seite_TypeClass = new Fuss_Radweg_Seite_TypeClassImpl();
		return fuss_Radweg_Seite_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Anlage createGFR_Anlage() {
		GFR_AnlageImpl gfR_Anlage = new GFR_AnlageImpl();
		return gfR_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Anlage_Allg_AttributeGroup createGFR_Anlage_Allg_AttributeGroup() {
		GFR_Anlage_Allg_AttributeGroupImpl gfR_Anlage_Allg_AttributeGroup = new GFR_Anlage_Allg_AttributeGroupImpl();
		return gfR_Anlage_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Art_TypeClass createGFR_Art_TypeClass() {
		GFR_Art_TypeClassImpl gfR_Art_TypeClass = new GFR_Art_TypeClassImpl();
		return gfR_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Element createGFR_Element() {
		GFR_ElementImpl gfR_Element = new GFR_ElementImpl();
		return gfR_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Element_Bezeichnung_AttributeGroup createGFR_Element_Bezeichnung_AttributeGroup() {
		GFR_Element_Bezeichnung_AttributeGroupImpl gfR_Element_Bezeichnung_AttributeGroup = new GFR_Element_Bezeichnung_AttributeGroupImpl();
		return gfR_Element_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Neigung_TypeClass createGFR_Neigung_TypeClass() {
		GFR_Neigung_TypeClassImpl gfR_Neigung_TypeClass = new GFR_Neigung_TypeClassImpl();
		return gfR_Neigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel createGFR_Tripelspiegel() {
		GFR_TripelspiegelImpl gfR_Tripelspiegel = new GFR_TripelspiegelImpl();
		return gfR_Tripelspiegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Allg_AttributeGroup createGFR_Tripelspiegel_Allg_AttributeGroup() {
		GFR_Tripelspiegel_Allg_AttributeGroupImpl gfR_Tripelspiegel_Allg_AttributeGroup = new GFR_Tripelspiegel_Allg_AttributeGroupImpl();
		return gfR_Tripelspiegel_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Bezeichnung_AttributeGroup createGFR_Tripelspiegel_Bezeichnung_AttributeGroup() {
		GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl gfR_Tripelspiegel_Bezeichnung_AttributeGroup = new GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl();
		return gfR_Tripelspiegel_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Typ_TypeClass createGFR_Typ_TypeClass() {
		GFR_Typ_TypeClassImpl gfR_Typ_TypeClass = new GFR_Typ_TypeClassImpl();
		return gfR_Typ_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gitterbehang_TypeClass createGitterbehang_TypeClass() {
		Gitterbehang_TypeClassImpl gitterbehang_TypeClass = new Gitterbehang_TypeClassImpl();
		return gitterbehang_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Am_Bue_TypeClass createGleis_Am_Bue_TypeClass() {
		Gleis_Am_Bue_TypeClassImpl gleis_Am_Bue_TypeClass = new Gleis_Am_Bue_TypeClassImpl();
		return gleis_Am_Bue_TypeClass;
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
	public Hp_Ersatzstecker_TypeClass createHp_Ersatzstecker_TypeClass() {
		Hp_Ersatzstecker_TypeClassImpl hp_Ersatzstecker_TypeClass = new Hp_Ersatzstecker_TypeClassImpl();
		return hp_Ersatzstecker_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Klassifizierung_TypeClass createKlassifizierung_TypeClass() {
		Klassifizierung_TypeClassImpl klassifizierung_TypeClass = new Klassifizierung_TypeClassImpl();
		return klassifizierung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontrastblende_TypeClass createKontrastblende_TypeClass() {
		Kontrastblende_TypeClassImpl kontrastblende_TypeClass = new Kontrastblende_TypeClassImpl();
		return kontrastblende_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzungswinkel_TypeClass createKreuzungswinkel_TypeClass() {
		Kreuzungswinkel_TypeClassImpl kreuzungswinkel_TypeClass = new Kreuzungswinkel_TypeClassImpl();
		return kreuzungswinkel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kurzzugschaltung_TypeClass createKurzzugschaltung_TypeClass() {
		Kurzzugschaltung_TypeClassImpl kurzzugschaltung_TypeClass = new Kurzzugschaltung_TypeClassImpl();
		return kurzzugschaltung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lagerung_Art_TypeClass createLagerung_Art_TypeClass() {
		Lagerung_Art_TypeClassImpl lagerung_Art_TypeClass = new Lagerung_Art_TypeClassImpl();
		return lagerung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LFUE_Impuls_TypeClass createLFUE_Impuls_TypeClass() {
		LFUE_Impuls_TypeClassImpl lfuE_Impuls_TypeClass = new LFUE_Impuls_TypeClassImpl();
		return lfuE_Impuls_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lieferlaenge_TypeClass createLieferlaenge_TypeClass() {
		Lieferlaenge_TypeClassImpl lieferlaenge_TypeClass = new Lieferlaenge_TypeClassImpl();
		return lieferlaenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montage_Ausgleichsgewichte_TypeClass createMontage_Ausgleichsgewichte_TypeClass() {
		Montage_Ausgleichsgewichte_TypeClassImpl montage_Ausgleichsgewichte_TypeClass = new Montage_Ausgleichsgewichte_TypeClassImpl();
		return montage_Ausgleichsgewichte_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montage_Besonders_TypeClass createMontage_Besonders_TypeClass() {
		Montage_Besonders_TypeClassImpl montage_Besonders_TypeClass = new Montage_Besonders_TypeClassImpl();
		return montage_Besonders_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montagehoehe_TypeClass createMontagehoehe_TypeClass() {
		Montagehoehe_TypeClassImpl montagehoehe_TypeClass = new Montagehoehe_TypeClassImpl();
		return montagehoehe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Optik_Durchmesser_TypeClass createOptik_Durchmesser_TypeClass() {
		Optik_Durchmesser_TypeClassImpl optik_Durchmesser_TypeClass = new Optik_Durchmesser_TypeClassImpl();
		return optik_Durchmesser_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Optik_Symbolmaske_TypeClass createOptik_Symbolmaske_TypeClass() {
		Optik_Symbolmaske_TypeClassImpl optik_Symbolmaske_TypeClass = new Optik_Symbolmaske_TypeClassImpl();
		return optik_Symbolmaske_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pegel_TypeClass createPegel_TypeClass() {
		Pegel_TypeClassImpl pegel_TypeClass = new Pegel_TypeClassImpl();
		return pegel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_X_TypeClass createPixel_Koordinate_X_TypeClass() {
		Pixel_Koordinate_X_TypeClassImpl pixel_Koordinate_X_TypeClass = new Pixel_Koordinate_X_TypeClassImpl();
		return pixel_Koordinate_X_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_Y_TypeClass createPixel_Koordinate_Y_TypeClass() {
		Pixel_Koordinate_Y_TypeClassImpl pixel_Koordinate_Y_TypeClass = new Pixel_Koordinate_Y_TypeClassImpl();
		return pixel_Koordinate_Y_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DAB_TypeClass createRaeumstrecke_DAB_TypeClass() {
		Raeumstrecke_DAB_TypeClassImpl raeumstrecke_DAB_TypeClass = new Raeumstrecke_DAB_TypeClassImpl();
		return raeumstrecke_DAB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DBK_TypeClass createRaeumstrecke_DBK_TypeClass() {
		Raeumstrecke_DBK_TypeClassImpl raeumstrecke_DBK_TypeClass = new Raeumstrecke_DBK_TypeClassImpl();
		return raeumstrecke_DBK_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DCK_TypeClass createRaeumstrecke_DCK_TypeClass() {
		Raeumstrecke_DCK_TypeClassImpl raeumstrecke_DCK_TypeClass = new Raeumstrecke_DCK_TypeClassImpl();
		return raeumstrecke_DCK_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DSK_Strich_TypeClass createRaeumstrecke_DSK_Strich_TypeClass() {
		Raeumstrecke_DSK_Strich_TypeClassImpl raeumstrecke_DSK_Strich_TypeClass = new Raeumstrecke_DSK_Strich_TypeClassImpl();
		return raeumstrecke_DSK_Strich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_TypeClass createRaeumstrecke_TypeClass() {
		Raeumstrecke_TypeClassImpl raeumstrecke_TypeClass = new Raeumstrecke_TypeClassImpl();
		return raeumstrecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtungspfeil_TypeClass createRichtungspfeil_TypeClass() {
		Richtungspfeil_TypeClassImpl richtungspfeil_TypeClass = new Richtungspfeil_TypeClassImpl();
		return richtungspfeil_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SA_Schrankenbaum_AttributeGroup createSA_Schrankenbaum_AttributeGroup() {
		SA_Schrankenbaum_AttributeGroupImpl sA_Schrankenbaum_AttributeGroup = new SA_Schrankenbaum_AttributeGroupImpl();
		return sA_Schrankenbaum_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltgruppe_TypeClass createSchaltgruppe_TypeClass() {
		Schaltgruppe_TypeClassImpl schaltgruppe_TypeClass = new Schaltgruppe_TypeClassImpl();
		return schaltgruppe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Fstr_Zuordnung createSchaltmittel_Fstr_Zuordnung() {
		Schaltmittel_Fstr_ZuordnungImpl schaltmittel_Fstr_Zuordnung = new Schaltmittel_Fstr_ZuordnungImpl();
		return schaltmittel_Fstr_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankenantrieb createSchrankenantrieb() {
		SchrankenantriebImpl schrankenantrieb = new SchrankenantriebImpl();
		return schrankenantrieb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankenantrieb_Allg_AttributeGroup createSchrankenantrieb_Allg_AttributeGroup() {
		Schrankenantrieb_Allg_AttributeGroupImpl schrankenantrieb_Allg_AttributeGroup = new Schrankenantrieb_Allg_AttributeGroupImpl();
		return schrankenantrieb_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankenantrieb_Bezeichnung_AttributeGroup createSchrankenantrieb_Bezeichnung_AttributeGroup() {
		Schrankenantrieb_Bezeichnung_AttributeGroupImpl schrankenantrieb_Bezeichnung_AttributeGroup = new Schrankenantrieb_Bezeichnung_AttributeGroupImpl();
		return schrankenantrieb_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schutzbuegel_TypeClass createSchutzbuegel_TypeClass() {
		Schutzbuegel_TypeClassImpl schutzbuegel_TypeClass = new Schutzbuegel_TypeClassImpl();
		return schutzbuegel_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sicherheitsabstand_TypeClass createSicherheitsabstand_TypeClass() {
		Sicherheitsabstand_TypeClassImpl sicherheitsabstand_TypeClass = new Sicherheitsabstand_TypeClassImpl();
		return sicherheitsabstand_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalverz_Errechnet_TypeClass createSignalverz_Errechnet_TypeClass() {
		Signalverz_Errechnet_TypeClassImpl signalverz_Errechnet_TypeClass = new Signalverz_Errechnet_TypeClassImpl();
		return signalverz_Errechnet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalverz_Gewaehlt_TypeClass createSignalverz_Gewaehlt_TypeClass() {
		Signalverz_Gewaehlt_TypeClassImpl signalverz_Gewaehlt_TypeClass = new Signalverz_Gewaehlt_TypeClassImpl();
		return signalverz_Gewaehlt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrlaenge_TypeClass createSperrlaenge_TypeClass() {
		Sperrlaenge_TypeClassImpl sperrlaenge_TypeClass = new Sperrlaenge_TypeClassImpl();
		return sperrlaenge_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrstrecke_Fussgaenger_TypeClass createSperrstrecke_Fussgaenger_TypeClass() {
		Sperrstrecke_Fussgaenger_TypeClassImpl sperrstrecke_Fussgaenger_TypeClass = new Sperrstrecke_Fussgaenger_TypeClassImpl();
		return sperrstrecke_Fussgaenger_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrstrecke_TypeClass createSperrstrecke_TypeClass() {
		Sperrstrecke_TypeClassImpl sperrstrecke_TypeClass = new Sperrstrecke_TypeClassImpl();
		return sperrstrecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stoerhalt_Haltfall_TypeClass createStoerhalt_Haltfall_TypeClass() {
		Stoerhalt_Haltfall_TypeClassImpl stoerhalt_Haltfall_TypeClass = new Stoerhalt_Haltfall_TypeClassImpl();
		return stoerhalt_Haltfall_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stoerhalt_Merkhinweis_TypeClass createStoerhalt_Merkhinweis_TypeClass() {
		Stoerhalt_Merkhinweis_TypeClassImpl stoerhalt_Merkhinweis_TypeClass = new Stoerhalt_Merkhinweis_TypeClassImpl();
		return stoerhalt_Merkhinweis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teilsperrstrecke_TypeClass createTeilsperrstrecke_TypeClass() {
		Teilsperrstrecke_TypeClassImpl teilsperrstrecke_TypeClass = new Teilsperrstrecke_TypeClassImpl();
		return teilsperrstrecke_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teilvorgabezeit_TypeClass createTeilvorgabezeit_TypeClass() {
		Teilvorgabezeit_TypeClassImpl teilvorgabezeit_TypeClass = new Teilvorgabezeit_TypeClassImpl();
		return teilvorgabezeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tragkopf_Verstellbar_TypeClass createTragkopf_Verstellbar_TypeClass() {
		Tragkopf_Verstellbar_TypeClassImpl tragkopf_Verstellbar_TypeClass = new Tragkopf_Verstellbar_TypeClassImpl();
		return tragkopf_Verstellbar_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Max_Schiene_TypeClass createV_Max_Schiene_TypeClass() {
		V_Max_Schiene_TypeClassImpl v_Max_Schiene_TypeClass = new V_Max_Schiene_TypeClassImpl();
		return v_Max_Schiene_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Max_Strasse_TypeClass createV_Max_Strasse_TypeClass() {
		V_Max_Strasse_TypeClassImpl v_Max_Strasse_TypeClass = new V_Max_Strasse_TypeClassImpl();
		return v_Max_Strasse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Fussweg_TypeClass createV_Min_Fussweg_TypeClass() {
		V_Min_Fussweg_TypeClassImpl v_Min_Fussweg_TypeClass = new V_Min_Fussweg_TypeClassImpl();
		return v_Min_Fussweg_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Schiene_TypeClass createV_Min_Schiene_TypeClass() {
		V_Min_Schiene_TypeClassImpl v_Min_Schiene_TypeClass = new V_Min_Schiene_TypeClassImpl();
		return v_Min_Schiene_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Min_Strasse_TypeClass createV_Min_Strasse_TypeClass() {
		V_Min_Strasse_TypeClassImpl v_Min_Strasse_TypeClass = new V_Min_Strasse_TypeClassImpl();
		return v_Min_Strasse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen createVerkehrszeichen() {
		VerkehrszeichenImpl verkehrszeichen = new VerkehrszeichenImpl();
		return verkehrszeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Allg_AttributeGroup createVerkehrszeichen_Allg_AttributeGroup() {
		Verkehrszeichen_Allg_AttributeGroupImpl verkehrszeichen_Allg_AttributeGroup = new Verkehrszeichen_Allg_AttributeGroupImpl();
		return verkehrszeichen_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Andreaskreuz_AttributeGroup createVerkehrszeichen_Andreaskreuz_AttributeGroup() {
		Verkehrszeichen_Andreaskreuz_AttributeGroupImpl verkehrszeichen_Andreaskreuz_AttributeGroup = new Verkehrszeichen_Andreaskreuz_AttributeGroupImpl();
		return verkehrszeichen_Andreaskreuz_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Bezeichnung_AttributeGroup createVerkehrszeichen_Bezeichnung_AttributeGroup() {
		Verkehrszeichen_Bezeichnung_AttributeGroupImpl verkehrszeichen_Bezeichnung_AttributeGroup = new Verkehrszeichen_Bezeichnung_AttributeGroupImpl();
		return verkehrszeichen_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Lz_AttributeGroup createVerkehrszeichen_Lz_AttributeGroup() {
		Verkehrszeichen_Lz_AttributeGroupImpl verkehrszeichen_Lz_AttributeGroup = new Verkehrszeichen_Lz_AttributeGroupImpl();
		return verkehrszeichen_Lz_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorgeschaltet_TypeClass createVorgeschaltet_TypeClass() {
		Vorgeschaltet_TypeClassImpl vorgeschaltet_TypeClass = new Vorgeschaltet_TypeClassImpl();
		return vorgeschaltet_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_AttributeGroup createVz_Sperrstrecke_AttributeGroup() {
		Vz_Sperrstrecke_AttributeGroupImpl vz_Sperrstrecke_AttributeGroup = new Vz_Sperrstrecke_AttributeGroupImpl();
		return vz_Sperrstrecke_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_Schranke_AttributeGroup createVz_Sperrstrecke_Schranke_AttributeGroup() {
		Vz_Sperrstrecke_Schranke_AttributeGroupImpl vz_Sperrstrecke_Schranke_AttributeGroup = new Vz_Sperrstrecke_Schranke_AttributeGroupImpl();
		return vz_Sperrstrecke_Schranke_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup createVz_Sperrstrecke_Vorgeschaltet_AttributeGroup() {
		Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl vz_Sperrstrecke_Vorgeschaltet_AttributeGroup = new Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl();
		return vz_Sperrstrecke_Vorgeschaltet_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Winkel_Alpha_TypeClass createWinkel_Alpha_TypeClass() {
		Winkel_Alpha_TypeClassImpl winkel_Alpha_TypeClass = new Winkel_Alpha_TypeClassImpl();
		return winkel_Alpha_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeitueberschreitungsmeldung_TypeClass createZeitueberschreitungsmeldung_TypeClass() {
		Zeitueberschreitungsmeldung_TypeClassImpl zeitueberschreitungsmeldung_TypeClass = new Zeitueberschreitungsmeldung_TypeClassImpl();
		return zeitueberschreitungsmeldung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzschild_TypeClass createZusatzschild_TypeClass() {
		Zusatzschild_TypeClassImpl zusatzschild_TypeClass = new Zusatzschild_TypeClassImpl();
		return zusatzschild_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBaumprofil createENUMBaumprofilFromString(EDataType eDataType, String initialValue) {
		ENUMBaumprofil result = ENUMBaumprofil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBaumprofilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEBauart createENUMBUEBauartFromString(EDataType eDataType, String initialValue) {
		ENUMBUEBauart result = ENUMBUEBauart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEBauartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEFunktionsueberwachung createENUMBUEFunktionsueberwachungFromString(EDataType eDataType, String initialValue) {
		ENUMBUEFunktionsueberwachung result = ENUMBUEFunktionsueberwachung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEFunktionsueberwachungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEHandschalteinrichtung createENUMBUEHandschalteinrichtungFromString(EDataType eDataType, String initialValue) {
		ENUMBUEHandschalteinrichtung result = ENUMBUEHandschalteinrichtung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEHandschalteinrichtungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUESicherungsart createENUMBUESicherungsartFromString(EDataType eDataType, String initialValue) {
		ENUMBUESicherungsart result = ENUMBUESicherungsart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUESicherungsartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUETechnik createENUMBUETechnikFromString(EDataType eDataType, String initialValue) {
		ENUMBUETechnik result = ENUMBUETechnik.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUETechnikToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFueSchaltfall createENUMFueSchaltfallFromString(EDataType eDataType, String initialValue) {
		ENUMFueSchaltfall result = ENUMFueSchaltfall.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFueSchaltfallToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFussRadwegArt createENUMFussRadwegArtFromString(EDataType eDataType, String initialValue) {
		ENUMFussRadwegArt result = ENUMFussRadwegArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFussRadwegArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFussRadwegSeite createENUMFussRadwegSeiteFromString(EDataType eDataType, String initialValue) {
		ENUMFussRadwegSeite result = ENUMFussRadwegSeite.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFussRadwegSeiteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGFRArt createENUMGFRArtFromString(EDataType eDataType, String initialValue) {
		ENUMGFRArt result = ENUMGFRArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGFRArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHpErsatzstecker createENUMHpErsatzsteckerFromString(EDataType eDataType, String initialValue) {
		ENUMHpErsatzstecker result = ENUMHpErsatzstecker.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHpErsatzsteckerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKlassifizierung createENUMKlassifizierungFromString(EDataType eDataType, String initialValue) {
		ENUMKlassifizierung result = ENUMKlassifizierung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKlassifizierungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLagerung createENUMLagerungFromString(EDataType eDataType, String initialValue) {
		ENUMLagerung result = ENUMLagerung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLagerungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLFUEImpuls createENUMLFUEImpulsFromString(EDataType eDataType, String initialValue) {
		ENUMLFUEImpuls result = ENUMLFUEImpuls.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLFUEImpulsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMontageAusgleichsgewichte createENUMMontageAusgleichsgewichteFromString(EDataType eDataType, String initialValue) {
		ENUMMontageAusgleichsgewichte result = ENUMMontageAusgleichsgewichte.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMontageAusgleichsgewichteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOptikSymbol createENUMOptikSymbolFromString(EDataType eDataType, String initialValue) {
		ENUMOptikSymbol result = ENUMOptikSymbol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOptikSymbolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRichtungspfeil createENUMRichtungspfeilFromString(EDataType eDataType, String initialValue) {
		ENUMRichtungspfeil result = ENUMRichtungspfeil.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRichtungspfeilToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAbstand_Gehweg_Fahrbahn_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstand_Gehweg_Fahrbahn_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createAkustik_Fussgaenger_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAkustik_Fussgaenger_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createAkustik_Fussgaenger_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAkustik_Fussgaenger_TypeFromString(BahnuebergangPackage.eINSTANCE.getAkustik_Fussgaenger_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAkustik_Fussgaenger_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAkustik_Fussgaenger_TypeToString(BahnuebergangPackage.eINSTANCE.getAkustik_Fussgaenger_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createAusrichtung_Winkel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAusrichtung_Winkel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBaulast_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaulast_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBeeinflussung_Strassenverkehr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeeinflussung_Strassenverkehr_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Schrankenantrieb_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Schrankenantrieb_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_BUE_GFR_Eckpunkt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_BUE_GFR_Eckpunkt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_GFR_Element_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_GFR_Element_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBezeichnung_GFR_Tripelspiegel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_GFR_Tripelspiegel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Verkehrszeichen_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Verkehrszeichen_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBlitzpfeil_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlitzpfeil_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBlitzpfeil_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBlitzpfeil_TypeFromString(BahnuebergangPackage.eINSTANCE.getBlitzpfeil_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlitzpfeil_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBlitzpfeil_TypeToString(BahnuebergangPackage.eINSTANCE.getBlitzpfeil_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBUE_Nachlaufzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUE_Nachlaufzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBUE_Neigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUE_Neigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBUE_Sicherungszeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUE_Sicherungszeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createBUE_Strasse_TypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUE_Strasse_TypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createBUE_Vorlaufzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUE_Vorlaufzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEinschaltverz_Errechnet_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinschaltverz_Errechnet_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEinschaltverz_Gewaehlt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEinschaltverz_Gewaehlt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBaumprofil createENUMBaumprofilObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBaumprofilFromString(BahnuebergangPackage.eINSTANCE.getENUMBaumprofil(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBaumprofilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBaumprofilToString(BahnuebergangPackage.eINSTANCE.getENUMBaumprofil(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEBauart createENUMBUEBauartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUEBauartFromString(BahnuebergangPackage.eINSTANCE.getENUMBUEBauart(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEBauartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUEBauartToString(BahnuebergangPackage.eINSTANCE.getENUMBUEBauart(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEFunktionsueberwachung createENUMBUEFunktionsueberwachungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUEFunktionsueberwachungFromString(BahnuebergangPackage.eINSTANCE.getENUMBUEFunktionsueberwachung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEFunktionsueberwachungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUEFunktionsueberwachungToString(BahnuebergangPackage.eINSTANCE.getENUMBUEFunktionsueberwachung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUEHandschalteinrichtung createENUMBUEHandschalteinrichtungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUEHandschalteinrichtungFromString(BahnuebergangPackage.eINSTANCE.getENUMBUEHandschalteinrichtung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUEHandschalteinrichtungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUEHandschalteinrichtungToString(BahnuebergangPackage.eINSTANCE.getENUMBUEHandschalteinrichtung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUESicherungsart createENUMBUESicherungsartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUESicherungsartFromString(BahnuebergangPackage.eINSTANCE.getENUMBUESicherungsart(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUESicherungsartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUESicherungsartToString(BahnuebergangPackage.eINSTANCE.getENUMBUESicherungsart(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBUETechnik createENUMBUETechnikObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBUETechnikFromString(BahnuebergangPackage.eINSTANCE.getENUMBUETechnik(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBUETechnikObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBUETechnikToString(BahnuebergangPackage.eINSTANCE.getENUMBUETechnik(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFueSchaltfall createENUMFueSchaltfallObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFueSchaltfallFromString(BahnuebergangPackage.eINSTANCE.getENUMFueSchaltfall(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFueSchaltfallObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFueSchaltfallToString(BahnuebergangPackage.eINSTANCE.getENUMFueSchaltfall(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFussRadwegArt createENUMFussRadwegArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFussRadwegArtFromString(BahnuebergangPackage.eINSTANCE.getENUMFussRadwegArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFussRadwegArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFussRadwegArtToString(BahnuebergangPackage.eINSTANCE.getENUMFussRadwegArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFussRadwegSeite createENUMFussRadwegSeiteObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFussRadwegSeiteFromString(BahnuebergangPackage.eINSTANCE.getENUMFussRadwegSeite(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFussRadwegSeiteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFussRadwegSeiteToString(BahnuebergangPackage.eINSTANCE.getENUMFussRadwegSeite(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGFRArt createENUMGFRArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGFRArtFromString(BahnuebergangPackage.eINSTANCE.getENUMGFRArt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGFRArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGFRArtToString(BahnuebergangPackage.eINSTANCE.getENUMGFRArt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMHpErsatzstecker createENUMHpErsatzsteckerObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMHpErsatzsteckerFromString(BahnuebergangPackage.eINSTANCE.getENUMHpErsatzstecker(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMHpErsatzsteckerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMHpErsatzsteckerToString(BahnuebergangPackage.eINSTANCE.getENUMHpErsatzstecker(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMKlassifizierung createENUMKlassifizierungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMKlassifizierungFromString(BahnuebergangPackage.eINSTANCE.getENUMKlassifizierung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMKlassifizierungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMKlassifizierungToString(BahnuebergangPackage.eINSTANCE.getENUMKlassifizierung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLagerung createENUMLagerungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLagerungFromString(BahnuebergangPackage.eINSTANCE.getENUMLagerung(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLagerungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLagerungToString(BahnuebergangPackage.eINSTANCE.getENUMLagerung(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMLFUEImpuls createENUMLFUEImpulsObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMLFUEImpulsFromString(BahnuebergangPackage.eINSTANCE.getENUMLFUEImpuls(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMLFUEImpulsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMLFUEImpulsToString(BahnuebergangPackage.eINSTANCE.getENUMLFUEImpuls(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMontageAusgleichsgewichte createENUMMontageAusgleichsgewichteObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMontageAusgleichsgewichteFromString(BahnuebergangPackage.eINSTANCE.getENUMMontageAusgleichsgewichte(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMontageAusgleichsgewichteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMontageAusgleichsgewichteToString(BahnuebergangPackage.eINSTANCE.getENUMMontageAusgleichsgewichte(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOptikSymbol createENUMOptikSymbolObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMOptikSymbolFromString(BahnuebergangPackage.eINSTANCE.getENUMOptikSymbol(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOptikSymbolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMOptikSymbolToString(BahnuebergangPackage.eINSTANCE.getENUMOptikSymbol(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMRichtungspfeil createENUMRichtungspfeilObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMRichtungspfeilFromString(BahnuebergangPackage.eINSTANCE.getENUMRichtungspfeil(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMRichtungspfeilObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMRichtungspfeilToString(BahnuebergangPackage.eINSTANCE.getENUMRichtungspfeil(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFahrbahn_Befestigung_Gleis_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFahrbahn_Befestigung_Gleis_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFahrbahn_Befestigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFahrbahn_Befestigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createFahrbahn_Breite_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFahrbahn_Breite_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGFR_Neigung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGFR_Neigung_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGFR_Typ_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGFR_Typ_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGleis_Am_Bue_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGleis_Am_Bue_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createKontrastblende_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKontrastblende_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createKontrastblende_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKontrastblende_TypeFromString(BahnuebergangPackage.eINSTANCE.getKontrastblende_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKontrastblende_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKontrastblende_TypeToString(BahnuebergangPackage.eINSTANCE.getKontrastblende_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createKreuzungswinkel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKreuzungswinkel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLieferlaenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLieferlaenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMontage_Besonders_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMontage_Besonders_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createMontagehoehe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMontagehoehe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOptik_Durchmesser_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptik_Durchmesser_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPegel_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPegel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPixel_Koordinate_X_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixel_Koordinate_X_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPixel_Koordinate_Y_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixel_Koordinate_Y_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRaeumstrecke_DAB_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRaeumstrecke_DAB_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRaeumstrecke_DBK_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRaeumstrecke_DBK_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRaeumstrecke_DCK_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRaeumstrecke_DCK_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRaeumstrecke_DSK_Strich_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRaeumstrecke_DSK_Strich_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRaeumstrecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRaeumstrecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSchaltgruppe_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchaltgruppe_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSchutzbuegel_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchutzbuegel_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSchutzbuegel_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSchutzbuegel_TypeFromString(BahnuebergangPackage.eINSTANCE.getSchutzbuegel_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchutzbuegel_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchutzbuegel_TypeToString(BahnuebergangPackage.eINSTANCE.getSchutzbuegel_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSicherheitsabstand_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSicherheitsabstand_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalverz_Errechnet_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalverz_Errechnet_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSignalverz_Gewaehlt_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalverz_Gewaehlt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSperrlaenge_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSperrlaenge_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSperrstrecke_Fussgaenger_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSperrstrecke_Fussgaenger_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSperrstrecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSperrstrecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTeilsperrstrecke_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.METER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTeilsperrstrecke_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.METER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createTeilvorgabezeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTeilvorgabezeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTragkopf_Verstellbar_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTragkopf_Verstellbar_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTragkopf_Verstellbar_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTragkopf_Verstellbar_TypeFromString(BahnuebergangPackage.eINSTANCE.getTragkopf_Verstellbar_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTragkopf_Verstellbar_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTragkopf_Verstellbar_TypeToString(BahnuebergangPackage.eINSTANCE.getTragkopf_Verstellbar_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Max_Schiene_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Max_Schiene_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Max_Strasse_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Max_Strasse_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createV_Min_Fussweg_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Min_Fussweg_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Min_Schiene_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Min_Schiene_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createV_Min_Strasse_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV_Min_Strasse_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.GESCHWINDIGKEIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createVorgeschaltet_TypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVorgeschaltet_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createVorgeschaltet_TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVorgeschaltet_TypeFromString(BahnuebergangPackage.eINSTANCE.getVorgeschaltet_Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVorgeschaltet_TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVorgeschaltet_TypeToString(BahnuebergangPackage.eINSTANCE.getVorgeschaltet_Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createWinkel_Alpha_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWinkel_Alpha_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createZeitueberschreitungsmeldung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZeitueberschreitungsmeldung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZusatzschild_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZusatzschild_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BahnuebergangPackage getBahnuebergangPackage() {
		return (BahnuebergangPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BahnuebergangPackage getPackage() {
		return BahnuebergangPackage.eINSTANCE;
	}

} //BahnuebergangFactoryImpl
