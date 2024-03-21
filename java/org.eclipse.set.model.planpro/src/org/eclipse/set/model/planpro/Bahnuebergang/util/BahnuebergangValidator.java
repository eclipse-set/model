/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.planpro.Bahnuebergang.*;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.BasisTypen.util.BasisTypenValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage
 * @generated
 */
public class BahnuebergangValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BahnuebergangValidator INSTANCE = new BahnuebergangValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.planpro.Bahnuebergang";

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
	public BahnuebergangValidator() {
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
	  return BahnuebergangPackage.eINSTANCE;
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
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE_CLASS:
				return validateAbstand_Gehweg_Fahrbahn_TypeClass((Abstand_Gehweg_Fahrbahn_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_CLASS:
				return validateAkustik_Fussgaenger_TypeClass((Akustik_Fussgaenger_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.AUSRICHTUNG_TYPE_CLASS:
				return validateAusrichtung_TypeClass((Ausrichtung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE_CLASS:
				return validateAusrichtung_Winkel_TypeClass((Ausrichtung_Winkel_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.AUTO_HET_TYPE_CLASS:
				return validateAuto_Het_TypeClass((Auto_Het_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BAULAST_TYPE_CLASS:
				return validateBaulast_TypeClass((Baulast_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BAUMPROFIL_TYPE_CLASS:
				return validateBaumprofil_TypeClass((Baumprofil_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE_CLASS:
				return validateBeeinflussung_Strassenverkehr_TypeClass((Beeinflussung_Strassenverkehr_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE_CLASS:
				return validateBez_Schrankenantrieb_TypeClass((Bez_Schrankenantrieb_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE_CLASS:
				return validateBezeichnung_BUE_GFR_Eckpunkt_TypeClass((Bezeichnung_BUE_GFR_Eckpunkt_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE_CLASS:
				return validateBezeichnung_GFR_Element_TypeClass((Bezeichnung_GFR_Element_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE_CLASS:
				return validateBezeichnung_GFR_Tripelspiegel_TypeClass((Bezeichnung_GFR_Tripelspiegel_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE_CLASS:
				return validateBezeichnung_Verkehrszeichen_TypeClass((Bezeichnung_Verkehrszeichen_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BLITZPFEIL_TYPE_CLASS:
				return validateBlitzpfeil_TypeClass((Blitzpfeil_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ABHAENGIGKEIT_FUE_ATTRIBUTE_GROUP:
				return validateBUE_Abhaengigkeit_Fue_AttributeGroup((BUE_Abhaengigkeit_Fue_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE:
				return validateBUE_Anlage((BUE_Anlage)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateBUE_Anlage_Allg_AttributeGroup((BUE_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP:
				return validateBUE_Anlage_Fuss_Rad_AttributeGroup((BUE_Anlage_Fuss_Rad_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE:
				return validateBUE_Anlage_Strasse((BUE_Anlage_Strasse)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE_ALLG_ATTRIBUTE_GROUP:
				return validateBUE_Anlage_Strasse_Allg_AttributeGroup((BUE_Anlage_Strasse_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_V:
				return validateBUE_Anlage_V((BUE_Anlage_V)value, diagnostics, context);
			case BahnuebergangPackage.BUE_ANLAGE_VALLG_ATTRIBUTE_GROUP:
				return validateBUE_Anlage_V_Allg_AttributeGroup((BUE_Anlage_V_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_AUSSCHALTUNG:
				return validateBUE_Ausschaltung((BUE_Ausschaltung)value, diagnostics, context);
			case BahnuebergangPackage.BUE_BAUART_TYPE_CLASS:
				return validateBUE_Bauart_TypeClass((BUE_Bauart_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateBUE_Bedien_Anz_Element_Allg_AttributeGroup((BUE_Bedien_Anz_Element_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT:
				return validateBUE_Bedien_Anzeige_Element((BUE_Bedien_Anzeige_Element)value, diagnostics, context);
			case BahnuebergangPackage.BUE_BUESTRA_TYPE_CLASS:
				return validateBUE_Buestra_TypeClass((BUE_Buestra_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG:
				return validateBUE_Deckendes_Signal_Zuordnung((BUE_Deckendes_Signal_Zuordnung)value, diagnostics, context);
			case BahnuebergangPackage.BUE_EINSCHALTUNG:
				return validateBUE_Einschaltung((BUE_Einschaltung)value, diagnostics, context);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP:
				return validateBUE_Einschaltung_Hp_AttributeGroup((BUE_Einschaltung_Hp_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG:
				return validateBUE_Einschaltung_Zuordnung((BUE_Einschaltung_Zuordnung)value, diagnostics, context);
			case BahnuebergangPackage.BUE_FUNKTIONSUEBERWACHUNG_TYPE_CLASS:
				return validateBUE_Funktionsueberwachung_TypeClass((BUE_Funktionsueberwachung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT:
				return validateBUE_Gefahrraum_Eckpunkt((BUE_Gefahrraum_Eckpunkt)value, diagnostics, context);
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup((BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM:
				return validateBUE_Gleisbezogener_Gefahrraum((BUE_Gleisbezogener_Gefahrraum)value, diagnostics, context);
			case BahnuebergangPackage.BUE_HANDSCHALTEINRICHTUNG_TYPE_CLASS:
				return validateBUE_Handschalteinrichtung_TypeClass((BUE_Handschalteinrichtung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_KANTE:
				return validateBUE_Kante((BUE_Kante)value, diagnostics, context);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN:
				return validateBUE_Kreuzungsplan((BUE_Kreuzungsplan)value, diagnostics, context);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP:
				return validateBUE_Kreuzungsplan_Koordinaten_AttributeGroup((BUE_Kreuzungsplan_Koordinaten_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_MIT_GFR_TYPE_CLASS:
				return validateBUE_Mit_GFR_TypeClass((BUE_Mit_GFR_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE_CLASS:
				return validateBUE_Nachlaufzeit_TypeClass((BUE_Nachlaufzeit_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE_CLASS:
				return validateBUE_Neigung_TypeClass((BUE_Neigung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE:
				return validateBUE_Schnittstelle((BUE_Schnittstelle)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP:
				return validateBUE_Schnittstelle_Allg_AttributeGroup((BUE_Schnittstelle_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SICHERUNGSART_TYPE_CLASS:
				return validateBUE_Sicherungsart_TypeClass((BUE_Sicherungsart_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE_CLASS:
				return validateBUE_Sicherungszeit_TypeClass((BUE_Sicherungszeit_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL:
				return validateBUE_Spezifisches_Signal((BUE_Spezifisches_Signal)value, diagnostics, context);
			case BahnuebergangPackage.BUE_STRASSE_TYPE_CLASS:
				return validateBUE_Strasse_TypeClass((BUE_Strasse_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_TECHNIK_TYPE_CLASS:
				return validateBUE_Technik_TypeClass((BUE_Technik_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE_CLASS:
				return validateBUE_Vorlaufzeit_TypeClass((BUE_Vorlaufzeit_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG:
				return validateBUE_WS_Fstr_Zuordnung((BUE_WS_Fstr_Zuordnung)value, diagnostics, context);
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE_CLASS:
				return validateEinschaltverz_Errechnet_TypeClass((Einschaltverz_Errechnet_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE_CLASS:
				return validateEinschaltverz_Gewaehlt_TypeClass((Einschaltverz_Gewaehlt_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.ERSATZSTECKER_GLEISBEZOGEN_TYPE_CLASS:
				return validateErsatzstecker_Gleisbezogen_TypeClass((Ersatzstecker_Gleisbezogen_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE_CLASS:
				return validateFahrbahn_Befestigung_Gleis_TypeClass((Fahrbahn_Befestigung_Gleis_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE_CLASS:
				return validateFahrbahn_Befestigung_TypeClass((Fahrbahn_Befestigung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE_CLASS:
				return validateFahrbahn_Breite_TypeClass((Fahrbahn_Breite_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FUE_SCHALTFALL_TYPE_CLASS:
				return validateFue_Schaltfall_TypeClass((Fue_Schaltfall_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FUSS_RADWEG_ART_TYPE_CLASS:
				return validateFuss_Radweg_Art_TypeClass((Fuss_Radweg_Art_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.FUSS_RADWEG_SEITE_TYPE_CLASS:
				return validateFuss_Radweg_Seite_TypeClass((Fuss_Radweg_Seite_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.GFR_ANLAGE:
				return validateGFR_Anlage((GFR_Anlage)value, diagnostics, context);
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateGFR_Anlage_Allg_AttributeGroup((GFR_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.GFR_ART_TYPE_CLASS:
				return validateGFR_Art_TypeClass((GFR_Art_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.GFR_ELEMENT:
				return validateGFR_Element((GFR_Element)value, diagnostics, context);
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateGFR_Element_Bezeichnung_AttributeGroup((GFR_Element_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE_CLASS:
				return validateGFR_Neigung_TypeClass((GFR_Neigung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL:
				return validateGFR_Tripelspiegel((GFR_Tripelspiegel)value, diagnostics, context);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP:
				return validateGFR_Tripelspiegel_Allg_AttributeGroup((GFR_Tripelspiegel_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateGFR_Tripelspiegel_Bezeichnung_AttributeGroup((GFR_Tripelspiegel_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.GFR_TYP_TYPE_CLASS:
				return validateGFR_Typ_TypeClass((GFR_Typ_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.GITTERBEHANG_TYPE_CLASS:
				return validateGitterbehang_TypeClass((Gitterbehang_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE_CLASS:
				return validateGleis_Am_Bue_TypeClass((Gleis_Am_Bue_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.HALTEZEIT_TYPE_CLASS:
				return validateHaltezeit_TypeClass((Haltezeit_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.HERSTELLER_TYPE_CLASS:
				return validateHersteller_TypeClass((Hersteller_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.HP_ERSATZSTECKER_TYPE_CLASS:
				return validateHp_Ersatzstecker_TypeClass((Hp_Ersatzstecker_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.KLASSIFIZIERUNG_TYPE_CLASS:
				return validateKlassifizierung_TypeClass((Klassifizierung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_CLASS:
				return validateKontrastblende_TypeClass((Kontrastblende_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE_CLASS:
				return validateKreuzungswinkel_TypeClass((Kreuzungswinkel_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.KURZZUGSCHALTUNG_TYPE_CLASS:
				return validateKurzzugschaltung_TypeClass((Kurzzugschaltung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.LAGERUNG_ART_TYPE_CLASS:
				return validateLagerung_Art_TypeClass((Lagerung_Art_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.LFUE_IMPULS_TYPE_CLASS:
				return validateLFUE_Impuls_TypeClass((LFUE_Impuls_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.LIEFERLAENGE_TYPE_CLASS:
				return validateLieferlaenge_TypeClass((Lieferlaenge_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.MONTAGE_AUSGLEICHSGEWICHTE_TYPE_CLASS:
				return validateMontage_Ausgleichsgewichte_TypeClass((Montage_Ausgleichsgewichte_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE_CLASS:
				return validateMontage_Besonders_TypeClass((Montage_Besonders_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE_CLASS:
				return validateMontagehoehe_TypeClass((Montagehoehe_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE_CLASS:
				return validateOptik_Durchmesser_TypeClass((Optik_Durchmesser_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.OPTIK_SYMBOLMASKE_TYPE_CLASS:
				return validateOptik_Symbolmaske_TypeClass((Optik_Symbolmaske_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.PEGEL_TYPE_CLASS:
				return validatePegel_TypeClass((Pegel_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE_CLASS:
				return validatePixel_Koordinate_X_TypeClass((Pixel_Koordinate_X_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE_CLASS:
				return validatePixel_Koordinate_Y_TypeClass((Pixel_Koordinate_Y_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE_CLASS:
				return validateRaeumstrecke_DAB_TypeClass((Raeumstrecke_DAB_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE_CLASS:
				return validateRaeumstrecke_DBK_TypeClass((Raeumstrecke_DBK_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE_CLASS:
				return validateRaeumstrecke_DCK_TypeClass((Raeumstrecke_DCK_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE_CLASS:
				return validateRaeumstrecke_DSK_Strich_TypeClass((Raeumstrecke_DSK_Strich_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE_CLASS:
				return validateRaeumstrecke_TypeClass((Raeumstrecke_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.RICHTUNGSPFEIL_TYPE_CLASS:
				return validateRichtungspfeil_TypeClass((Richtungspfeil_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP:
				return validateSA_Schrankenbaum_AttributeGroup((SA_Schrankenbaum_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE_CLASS:
				return validateSchaltgruppe_TypeClass((Schaltgruppe_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG:
				return validateSchaltmittel_Fstr_Zuordnung((Schaltmittel_Fstr_Zuordnung)value, diagnostics, context);
			case BahnuebergangPackage.SCHRANKENANTRIEB:
				return validateSchrankenantrieb((Schrankenantrieb)value, diagnostics, context);
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP:
				return validateSchrankenantrieb_Allg_AttributeGroup((Schrankenantrieb_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateSchrankenantrieb_Bezeichnung_AttributeGroup((Schrankenantrieb_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_CLASS:
				return validateSchutzbuegel_TypeClass((Schutzbuegel_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE_CLASS:
				return validateSicherheitsabstand_TypeClass((Sicherheitsabstand_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE_CLASS:
				return validateSignalverz_Errechnet_TypeClass((Signalverz_Errechnet_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE_CLASS:
				return validateSignalverz_Gewaehlt_TypeClass((Signalverz_Gewaehlt_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SPERRLAENGE_TYPE_CLASS:
				return validateSperrlaenge_TypeClass((Sperrlaenge_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE_CLASS:
				return validateSperrstrecke_Fussgaenger_TypeClass((Sperrstrecke_Fussgaenger_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.SPERRSTRECKE_TYPE_CLASS:
				return validateSperrstrecke_TypeClass((Sperrstrecke_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.STOERHALT_HALTFALL_TYPE_CLASS:
				return validateStoerhalt_Haltfall_TypeClass((Stoerhalt_Haltfall_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.STOERHALT_MERKHINWEIS_TYPE_CLASS:
				return validateStoerhalt_Merkhinweis_TypeClass((Stoerhalt_Merkhinweis_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE_CLASS:
				return validateTeilsperrstrecke_TypeClass((Teilsperrstrecke_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE_CLASS:
				return validateTeilvorgabezeit_TypeClass((Teilvorgabezeit_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_CLASS:
				return validateTragkopf_Verstellbar_TypeClass((Tragkopf_Verstellbar_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE_CLASS:
				return validateV_Max_Schiene_TypeClass((V_Max_Schiene_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VMAX_STRASSE_TYPE_CLASS:
				return validateV_Max_Strasse_TypeClass((V_Max_Strasse_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE_CLASS:
				return validateV_Min_Fussweg_TypeClass((V_Min_Fussweg_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE_CLASS:
				return validateV_Min_Schiene_TypeClass((V_Min_Schiene_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_STRASSE_TYPE_CLASS:
				return validateV_Min_Strasse_TypeClass((V_Min_Strasse_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VERKEHRSZEICHEN:
				return validateVerkehrszeichen((Verkehrszeichen)value, diagnostics, context);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP:
				return validateVerkehrszeichen_Allg_AttributeGroup((Verkehrszeichen_Allg_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ANDREASKREUZ_ATTRIBUTE_GROUP:
				return validateVerkehrszeichen_Andreaskreuz_AttributeGroup((Verkehrszeichen_Andreaskreuz_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateVerkehrszeichen_Bezeichnung_AttributeGroup((Verkehrszeichen_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP:
				return validateVerkehrszeichen_Lz_AttributeGroup((Verkehrszeichen_Lz_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VORGESCHALTET_TYPE_CLASS:
				return validateVorgeschaltet_TypeClass((Vorgeschaltet_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_ATTRIBUTE_GROUP:
				return validateVz_Sperrstrecke_AttributeGroup((Vz_Sperrstrecke_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP:
				return validateVz_Sperrstrecke_Schranke_AttributeGroup((Vz_Sperrstrecke_Schranke_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP:
				return validateVz_Sperrstrecke_Vorgeschaltet_AttributeGroup((Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup)value, diagnostics, context);
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE_CLASS:
				return validateWinkel_Alpha_TypeClass((Winkel_Alpha_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE_CLASS:
				return validateZeitueberschreitungsmeldung_TypeClass((Zeitueberschreitungsmeldung_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE_CLASS:
				return validateZusatzschild_TypeClass((Zusatzschild_TypeClass)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_BAUMPROFIL:
				return validateENUMBaumprofil((ENUMBaumprofil)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_BAUART:
				return validateENUMBUEBauart((ENUMBUEBauart)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG:
				return validateENUMBUEFunktionsueberwachung((ENUMBUEFunktionsueberwachung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG:
				return validateENUMBUEHandschalteinrichtung((ENUMBUEHandschalteinrichtung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART:
				return validateENUMBUESicherungsart((ENUMBUESicherungsart)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_TECHNIK:
				return validateENUMBUETechnik((ENUMBUETechnik)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL:
				return validateENUMFueSchaltfall((ENUMFueSchaltfall)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART:
				return validateENUMFussRadwegArt((ENUMFussRadwegArt)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE:
				return validateENUMFussRadwegSeite((ENUMFussRadwegSeite)value, diagnostics, context);
			case BahnuebergangPackage.ENUMGFR_ART:
				return validateENUMGFRArt((ENUMGFRArt)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER:
				return validateENUMHpErsatzstecker((ENUMHpErsatzstecker)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG:
				return validateENUMKlassifizierung((ENUMKlassifizierung)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_LAGERUNG:
				return validateENUMLagerung((ENUMLagerung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMLFUE_IMPULS:
				return validateENUMLFUEImpuls((ENUMLFUEImpuls)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE:
				return validateENUMMontageAusgleichsgewichte((ENUMMontageAusgleichsgewichte)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL:
				return validateENUMOptikSymbol((ENUMOptikSymbol)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL:
				return validateENUMRichtungspfeil((ENUMRichtungspfeil)value, diagnostics, context);
			case BahnuebergangPackage.ABSTAND_GEHWEG_FAHRBAHN_TYPE:
				return validateAbstand_Gehweg_Fahrbahn_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE:
				return validateAkustik_Fussgaenger_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.AKUSTIK_FUSSGAENGER_TYPE_OBJECT:
				return validateAkustik_Fussgaenger_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.AUSRICHTUNG_WINKEL_TYPE:
				return validateAusrichtung_Winkel_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.BAULAST_TYPE:
				return validateBaulast_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.BEEINFLUSSUNG_STRASSENVERKEHR_TYPE:
				return validateBeeinflussung_Strassenverkehr_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.BEZ_SCHRANKENANTRIEB_TYPE:
				return validateBez_Schrankenantrieb_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_BUE_GFR_ECKPUNKT_TYPE:
				return validateBezeichnung_BUE_GFR_Eckpunkt_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_ELEMENT_TYPE:
				return validateBezeichnung_GFR_Element_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE:
				return validateBezeichnung_GFR_Tripelspiegel_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.BEZEICHNUNG_VERKEHRSZEICHEN_TYPE:
				return validateBezeichnung_Verkehrszeichen_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.BLITZPFEIL_TYPE:
				return validateBlitzpfeil_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.BLITZPFEIL_TYPE_OBJECT:
				return validateBlitzpfeil_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.BUE_NACHLAUFZEIT_TYPE:
				return validateBUE_Nachlaufzeit_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.BUE_NEIGUNG_TYPE:
				return validateBUE_Neigung_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.BUE_SICHERUNGSZEIT_TYPE:
				return validateBUE_Sicherungszeit_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.BUE_STRASSE_TYPE:
				return validateBUE_Strasse_Type((List<?>)value, diagnostics, context);
			case BahnuebergangPackage.BUE_VORLAUFZEIT_TYPE:
				return validateBUE_Vorlaufzeit_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.EINSCHALTVERZ_ERRECHNET_TYPE:
				return validateEinschaltverz_Errechnet_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.EINSCHALTVERZ_GEWAEHLT_TYPE:
				return validateEinschaltverz_Gewaehlt_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_BAUMPROFIL_OBJECT:
				return validateENUMBaumprofilObject((ENUMBaumprofil)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_BAUART_OBJECT:
				return validateENUMBUEBauartObject((ENUMBUEBauart)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_FUNKTIONSUEBERWACHUNG_OBJECT:
				return validateENUMBUEFunktionsueberwachungObject((ENUMBUEFunktionsueberwachung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_HANDSCHALTEINRICHTUNG_OBJECT:
				return validateENUMBUEHandschalteinrichtungObject((ENUMBUEHandschalteinrichtung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_SICHERUNGSART_OBJECT:
				return validateENUMBUESicherungsartObject((ENUMBUESicherungsart)value, diagnostics, context);
			case BahnuebergangPackage.ENUMBUE_TECHNIK_OBJECT:
				return validateENUMBUETechnikObject((ENUMBUETechnik)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUE_SCHALTFALL_OBJECT:
				return validateENUMFueSchaltfallObject((ENUMFueSchaltfall)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_ART_OBJECT:
				return validateENUMFussRadwegArtObject((ENUMFussRadwegArt)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_FUSS_RADWEG_SEITE_OBJECT:
				return validateENUMFussRadwegSeiteObject((ENUMFussRadwegSeite)value, diagnostics, context);
			case BahnuebergangPackage.ENUMGFR_ART_OBJECT:
				return validateENUMGFRArtObject((ENUMGFRArt)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_HP_ERSATZSTECKER_OBJECT:
				return validateENUMHpErsatzsteckerObject((ENUMHpErsatzstecker)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_KLASSIFIZIERUNG_OBJECT:
				return validateENUMKlassifizierungObject((ENUMKlassifizierung)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_LAGERUNG_OBJECT:
				return validateENUMLagerungObject((ENUMLagerung)value, diagnostics, context);
			case BahnuebergangPackage.ENUMLFUE_IMPULS_OBJECT:
				return validateENUMLFUEImpulsObject((ENUMLFUEImpuls)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_MONTAGE_AUSGLEICHSGEWICHTE_OBJECT:
				return validateENUMMontageAusgleichsgewichteObject((ENUMMontageAusgleichsgewichte)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_OPTIK_SYMBOL_OBJECT:
				return validateENUMOptikSymbolObject((ENUMOptikSymbol)value, diagnostics, context);
			case BahnuebergangPackage.ENUM_RICHTUNGSPFEIL_OBJECT:
				return validateENUMRichtungspfeilObject((ENUMRichtungspfeil)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_GLEIS_TYPE:
				return validateFahrbahn_Befestigung_Gleis_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BEFESTIGUNG_TYPE:
				return validateFahrbahn_Befestigung_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.FAHRBAHN_BREITE_TYPE:
				return validateFahrbahn_Breite_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.GFR_NEIGUNG_TYPE:
				return validateGFR_Neigung_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.GFR_TYP_TYPE:
				return validateGFR_Typ_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.GLEIS_AM_BUE_TYPE:
				return validateGleis_Am_Bue_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.HALTEZEIT_TYPE:
				return validateHaltezeit_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE:
				return validateKontrastblende_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.KONTRASTBLENDE_TYPE_OBJECT:
				return validateKontrastblende_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.KREUZUNGSWINKEL_TYPE:
				return validateKreuzungswinkel_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.LIEFERLAENGE_TYPE:
				return validateLieferlaenge_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.MONTAGE_BESONDERS_TYPE:
				return validateMontage_Besonders_Type((String)value, diagnostics, context);
			case BahnuebergangPackage.MONTAGEHOEHE_TYPE:
				return validateMontagehoehe_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.OPTIK_DURCHMESSER_TYPE:
				return validateOptik_Durchmesser_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.PEGEL_TYPE:
				return validatePegel_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.PIXEL_KOORDINATE_XTYPE:
				return validatePixel_Koordinate_X_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.PIXEL_KOORDINATE_YTYPE:
				return validatePixel_Koordinate_Y_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DAB_TYPE:
				return validateRaeumstrecke_DAB_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DBK_TYPE:
				return validateRaeumstrecke_DBK_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DCK_TYPE:
				return validateRaeumstrecke_DCK_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_DSK_STRICH_TYPE:
				return validateRaeumstrecke_DSK_Strich_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.RAEUMSTRECKE_TYPE:
				return validateRaeumstrecke_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SCHALTGRUPPE_TYPE:
				return validateSchaltgruppe_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE:
				return validateSchutzbuegel_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.SCHUTZBUEGEL_TYPE_OBJECT:
				return validateSchutzbuegel_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.SICHERHEITSABSTAND_TYPE:
				return validateSicherheitsabstand_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SIGNALVERZ_ERRECHNET_TYPE:
				return validateSignalverz_Errechnet_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SIGNALVERZ_GEWAEHLT_TYPE:
				return validateSignalverz_Gewaehlt_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SPERRLAENGE_TYPE:
				return validateSperrlaenge_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SPERRSTRECKE_FUSSGAENGER_TYPE:
				return validateSperrstrecke_Fussgaenger_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.SPERRSTRECKE_TYPE:
				return validateSperrstrecke_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.TEILSPERRSTRECKE_TYPE:
				return validateTeilsperrstrecke_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.TEILVORGABEZEIT_TYPE:
				return validateTeilvorgabezeit_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE:
				return validateTragkopf_Verstellbar_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.TRAGKOPF_VERSTELLBAR_TYPE_OBJECT:
				return validateTragkopf_Verstellbar_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.VMAX_SCHIENE_TYPE:
				return validateV_Max_Schiene_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.VMAX_STRASSE_TYPE:
				return validateV_Max_Strasse_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_FUSSWEG_TYPE:
				return validateV_Min_Fussweg_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_SCHIENE_TYPE:
				return validateV_Min_Schiene_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.VMIN_STRASSE_TYPE:
				return validateV_Min_Strasse_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.VORGESCHALTET_TYPE:
				return validateVorgeschaltet_Type((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.VORGESCHALTET_TYPE_OBJECT:
				return validateVorgeschaltet_TypeObject((Boolean)value, diagnostics, context);
			case BahnuebergangPackage.WINKEL_ALPHA_TYPE:
				return validateWinkel_Alpha_Type((BigInteger)value, diagnostics, context);
			case BahnuebergangPackage.ZEITUEBERSCHREITUNGSMELDUNG_TYPE:
				return validateZeitueberschreitungsmeldung_Type((BigDecimal)value, diagnostics, context);
			case BahnuebergangPackage.ZUSATZSCHILD_TYPE:
				return validateZusatzschild_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Gehweg_Fahrbahn_TypeClass(Abstand_Gehweg_Fahrbahn_TypeClass abstand_Gehweg_Fahrbahn_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstand_Gehweg_Fahrbahn_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustik_Fussgaenger_TypeClass(Akustik_Fussgaenger_TypeClass akustik_Fussgaenger_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(akustik_Fussgaenger_TypeClass, diagnostics, context);
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
	public boolean validateAusrichtung_Winkel_TypeClass(Ausrichtung_Winkel_TypeClass ausrichtung_Winkel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ausrichtung_Winkel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuto_Het_TypeClass(Auto_Het_TypeClass auto_Het_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auto_Het_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaulast_TypeClass(Baulast_TypeClass baulast_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baulast_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaumprofil_TypeClass(Baumprofil_TypeClass baumprofil_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baumprofil_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeeinflussung_Strassenverkehr_TypeClass(Beeinflussung_Strassenverkehr_TypeClass beeinflussung_Strassenverkehr_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beeinflussung_Strassenverkehr_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Schrankenantrieb_TypeClass(Bez_Schrankenantrieb_TypeClass bez_Schrankenantrieb_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Schrankenantrieb_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_BUE_GFR_Eckpunkt_TypeClass(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass bezeichnung_BUE_GFR_Eckpunkt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_BUE_GFR_Eckpunkt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_GFR_Element_TypeClass(Bezeichnung_GFR_Element_TypeClass bezeichnung_GFR_Element_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_GFR_Element_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_GFR_Tripelspiegel_TypeClass(Bezeichnung_GFR_Tripelspiegel_TypeClass bezeichnung_GFR_Tripelspiegel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_GFR_Tripelspiegel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Verkehrszeichen_TypeClass(Bezeichnung_Verkehrszeichen_TypeClass bezeichnung_Verkehrszeichen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_Verkehrszeichen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlitzpfeil_TypeClass(Blitzpfeil_TypeClass blitzpfeil_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blitzpfeil_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Abhaengigkeit_Fue_AttributeGroup(BUE_Abhaengigkeit_Fue_AttributeGroup buE_Abhaengigkeit_Fue_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Abhaengigkeit_Fue_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage(BUE_Anlage buE_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_Allg_AttributeGroup(BUE_Anlage_Allg_AttributeGroup buE_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_Fuss_Rad_AttributeGroup(BUE_Anlage_Fuss_Rad_AttributeGroup buE_Anlage_Fuss_Rad_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_Fuss_Rad_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_Strasse(BUE_Anlage_Strasse buE_Anlage_Strasse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_Strasse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_Strasse_Allg_AttributeGroup(BUE_Anlage_Strasse_Allg_AttributeGroup buE_Anlage_Strasse_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_Strasse_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_V(BUE_Anlage_V buE_Anlage_V, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_V, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Anlage_V_Allg_AttributeGroup(BUE_Anlage_V_Allg_AttributeGroup buE_Anlage_V_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Anlage_V_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Ausschaltung(BUE_Ausschaltung buE_Ausschaltung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Ausschaltung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Bauart_TypeClass(BUE_Bauart_TypeClass buE_Bauart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Bauart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Bedien_Anz_Element_Allg_AttributeGroup(BUE_Bedien_Anz_Element_Allg_AttributeGroup buE_Bedien_Anz_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Bedien_Anz_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Bedien_Anzeige_Element(BUE_Bedien_Anzeige_Element buE_Bedien_Anzeige_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Bedien_Anzeige_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Buestra_TypeClass(BUE_Buestra_TypeClass buE_Buestra_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Buestra_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Deckendes_Signal_Zuordnung(BUE_Deckendes_Signal_Zuordnung buE_Deckendes_Signal_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Deckendes_Signal_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Einschaltung(BUE_Einschaltung buE_Einschaltung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Einschaltung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Einschaltung_Hp_AttributeGroup(BUE_Einschaltung_Hp_AttributeGroup buE_Einschaltung_Hp_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Einschaltung_Hp_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Einschaltung_Zuordnung(BUE_Einschaltung_Zuordnung buE_Einschaltung_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Einschaltung_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Funktionsueberwachung_TypeClass(BUE_Funktionsueberwachung_TypeClass buE_Funktionsueberwachung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Funktionsueberwachung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Gefahrraum_Eckpunkt(BUE_Gefahrraum_Eckpunkt buE_Gefahrraum_Eckpunkt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Gefahrraum_Eckpunkt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup(BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Gleisbezogener_Gefahrraum(BUE_Gleisbezogener_Gefahrraum buE_Gleisbezogener_Gefahrraum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Gleisbezogener_Gefahrraum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Handschalteinrichtung_TypeClass(BUE_Handschalteinrichtung_TypeClass buE_Handschalteinrichtung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Handschalteinrichtung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Kante(BUE_Kante buE_Kante, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Kante, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Kreuzungsplan(BUE_Kreuzungsplan buE_Kreuzungsplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Kreuzungsplan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Kreuzungsplan_Koordinaten_AttributeGroup(BUE_Kreuzungsplan_Koordinaten_AttributeGroup buE_Kreuzungsplan_Koordinaten_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Kreuzungsplan_Koordinaten_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Mit_GFR_TypeClass(BUE_Mit_GFR_TypeClass buE_Mit_GFR_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Mit_GFR_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Nachlaufzeit_TypeClass(BUE_Nachlaufzeit_TypeClass buE_Nachlaufzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Nachlaufzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Neigung_TypeClass(BUE_Neigung_TypeClass buE_Neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Schnittstelle(BUE_Schnittstelle buE_Schnittstelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Schnittstelle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Schnittstelle_Allg_AttributeGroup(BUE_Schnittstelle_Allg_AttributeGroup buE_Schnittstelle_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Schnittstelle_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Sicherungsart_TypeClass(BUE_Sicherungsart_TypeClass buE_Sicherungsart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Sicherungsart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Sicherungszeit_TypeClass(BUE_Sicherungszeit_TypeClass buE_Sicherungszeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Sicherungszeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Spezifisches_Signal(BUE_Spezifisches_Signal buE_Spezifisches_Signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Spezifisches_Signal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Strasse_TypeClass(BUE_Strasse_TypeClass buE_Strasse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Strasse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Technik_TypeClass(BUE_Technik_TypeClass buE_Technik_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Technik_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Vorlaufzeit_TypeClass(BUE_Vorlaufzeit_TypeClass buE_Vorlaufzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_Vorlaufzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_WS_Fstr_Zuordnung(BUE_WS_Fstr_Zuordnung buE_WS_Fstr_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buE_WS_Fstr_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Errechnet_TypeClass(Einschaltverz_Errechnet_TypeClass einschaltverz_Errechnet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einschaltverz_Errechnet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Gewaehlt_TypeClass(Einschaltverz_Gewaehlt_TypeClass einschaltverz_Gewaehlt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(einschaltverz_Gewaehlt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErsatzstecker_Gleisbezogen_TypeClass(Ersatzstecker_Gleisbezogen_TypeClass ersatzstecker_Gleisbezogen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ersatzstecker_Gleisbezogen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Befestigung_Gleis_TypeClass(Fahrbahn_Befestigung_Gleis_TypeClass fahrbahn_Befestigung_Gleis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fahrbahn_Befestigung_Gleis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Befestigung_TypeClass(Fahrbahn_Befestigung_TypeClass fahrbahn_Befestigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fahrbahn_Befestigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Breite_TypeClass(Fahrbahn_Breite_TypeClass fahrbahn_Breite_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fahrbahn_Breite_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFue_Schaltfall_TypeClass(Fue_Schaltfall_TypeClass fue_Schaltfall_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fue_Schaltfall_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuss_Radweg_Art_TypeClass(Fuss_Radweg_Art_TypeClass fuss_Radweg_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuss_Radweg_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuss_Radweg_Seite_TypeClass(Fuss_Radweg_Seite_TypeClass fuss_Radweg_Seite_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuss_Radweg_Seite_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Anlage(GFR_Anlage gfR_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Anlage_Allg_AttributeGroup(GFR_Anlage_Allg_AttributeGroup gfR_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Art_TypeClass(GFR_Art_TypeClass gfR_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Element(GFR_Element gfR_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Element_Bezeichnung_AttributeGroup(GFR_Element_Bezeichnung_AttributeGroup gfR_Element_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Element_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Neigung_TypeClass(GFR_Neigung_TypeClass gfR_Neigung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Neigung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Tripelspiegel(GFR_Tripelspiegel gfR_Tripelspiegel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Tripelspiegel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Tripelspiegel_Allg_AttributeGroup(GFR_Tripelspiegel_Allg_AttributeGroup gfR_Tripelspiegel_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Tripelspiegel_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Tripelspiegel_Bezeichnung_AttributeGroup(GFR_Tripelspiegel_Bezeichnung_AttributeGroup gfR_Tripelspiegel_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Tripelspiegel_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Typ_TypeClass(GFR_Typ_TypeClass gfR_Typ_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gfR_Typ_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGitterbehang_TypeClass(Gitterbehang_TypeClass gitterbehang_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gitterbehang_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleis_Am_Bue_TypeClass(Gleis_Am_Bue_TypeClass gleis_Am_Bue_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gleis_Am_Bue_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaltezeit_TypeClass(Haltezeit_TypeClass haltezeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haltezeit_TypeClass, diagnostics, context);
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
	public boolean validateHp_Ersatzstecker_TypeClass(Hp_Ersatzstecker_TypeClass hp_Ersatzstecker_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hp_Ersatzstecker_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKlassifizierung_TypeClass(Klassifizierung_TypeClass klassifizierung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(klassifizierung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontrastblende_TypeClass(Kontrastblende_TypeClass kontrastblende_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kontrastblende_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKreuzungswinkel_TypeClass(Kreuzungswinkel_TypeClass kreuzungswinkel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kreuzungswinkel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKurzzugschaltung_TypeClass(Kurzzugschaltung_TypeClass kurzzugschaltung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kurzzugschaltung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLagerung_Art_TypeClass(Lagerung_Art_TypeClass lagerung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lagerung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLFUE_Impuls_TypeClass(LFUE_Impuls_TypeClass lfuE_Impuls_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lfuE_Impuls_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLieferlaenge_TypeClass(Lieferlaenge_TypeClass lieferlaenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lieferlaenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontage_Ausgleichsgewichte_TypeClass(Montage_Ausgleichsgewichte_TypeClass montage_Ausgleichsgewichte_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(montage_Ausgleichsgewichte_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontage_Besonders_TypeClass(Montage_Besonders_TypeClass montage_Besonders_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(montage_Besonders_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontagehoehe_TypeClass(Montagehoehe_TypeClass montagehoehe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(montagehoehe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptik_Durchmesser_TypeClass(Optik_Durchmesser_TypeClass optik_Durchmesser_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optik_Durchmesser_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptik_Symbolmaske_TypeClass(Optik_Symbolmaske_TypeClass optik_Symbolmaske_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optik_Symbolmaske_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePegel_TypeClass(Pegel_TypeClass pegel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pegel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixel_Koordinate_X_TypeClass(Pixel_Koordinate_X_TypeClass pixel_Koordinate_X_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pixel_Koordinate_X_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixel_Koordinate_Y_TypeClass(Pixel_Koordinate_Y_TypeClass pixel_Koordinate_Y_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pixel_Koordinate_Y_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DAB_TypeClass(Raeumstrecke_DAB_TypeClass raeumstrecke_DAB_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raeumstrecke_DAB_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DBK_TypeClass(Raeumstrecke_DBK_TypeClass raeumstrecke_DBK_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raeumstrecke_DBK_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DCK_TypeClass(Raeumstrecke_DCK_TypeClass raeumstrecke_DCK_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raeumstrecke_DCK_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DSK_Strich_TypeClass(Raeumstrecke_DSK_Strich_TypeClass raeumstrecke_DSK_Strich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raeumstrecke_DSK_Strich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_TypeClass(Raeumstrecke_TypeClass raeumstrecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raeumstrecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRichtungspfeil_TypeClass(Richtungspfeil_TypeClass richtungspfeil_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(richtungspfeil_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSA_Schrankenbaum_AttributeGroup(SA_Schrankenbaum_AttributeGroup sA_Schrankenbaum_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sA_Schrankenbaum_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltgruppe_TypeClass(Schaltgruppe_TypeClass schaltgruppe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schaltgruppe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltmittel_Fstr_Zuordnung(Schaltmittel_Fstr_Zuordnung schaltmittel_Fstr_Zuordnung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schaltmittel_Fstr_Zuordnung, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchrankenantrieb(Schrankenantrieb schrankenantrieb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schrankenantrieb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchrankenantrieb_Allg_AttributeGroup(Schrankenantrieb_Allg_AttributeGroup schrankenantrieb_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schrankenantrieb_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchrankenantrieb_Bezeichnung_AttributeGroup(Schrankenantrieb_Bezeichnung_AttributeGroup schrankenantrieb_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schrankenantrieb_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzbuegel_TypeClass(Schutzbuegel_TypeClass schutzbuegel_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schutzbuegel_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSicherheitsabstand_TypeClass(Sicherheitsabstand_TypeClass sicherheitsabstand_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sicherheitsabstand_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Errechnet_TypeClass(Signalverz_Errechnet_TypeClass signalverz_Errechnet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalverz_Errechnet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Gewaehlt_TypeClass(Signalverz_Gewaehlt_TypeClass signalverz_Gewaehlt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalverz_Gewaehlt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrlaenge_TypeClass(Sperrlaenge_TypeClass sperrlaenge_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sperrlaenge_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrstrecke_Fussgaenger_TypeClass(Sperrstrecke_Fussgaenger_TypeClass sperrstrecke_Fussgaenger_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sperrstrecke_Fussgaenger_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrstrecke_TypeClass(Sperrstrecke_TypeClass sperrstrecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sperrstrecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoerhalt_Haltfall_TypeClass(Stoerhalt_Haltfall_TypeClass stoerhalt_Haltfall_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stoerhalt_Haltfall_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoerhalt_Merkhinweis_TypeClass(Stoerhalt_Merkhinweis_TypeClass stoerhalt_Merkhinweis_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stoerhalt_Merkhinweis_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeilsperrstrecke_TypeClass(Teilsperrstrecke_TypeClass teilsperrstrecke_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teilsperrstrecke_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeilvorgabezeit_TypeClass(Teilvorgabezeit_TypeClass teilvorgabezeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teilvorgabezeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTragkopf_Verstellbar_TypeClass(Tragkopf_Verstellbar_TypeClass tragkopf_Verstellbar_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tragkopf_Verstellbar_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Max_Schiene_TypeClass(V_Max_Schiene_TypeClass v_Max_Schiene_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Max_Schiene_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Max_Strasse_TypeClass(V_Max_Strasse_TypeClass v_Max_Strasse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Max_Strasse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Fussweg_TypeClass(V_Min_Fussweg_TypeClass v_Min_Fussweg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Min_Fussweg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Schiene_TypeClass(V_Min_Schiene_TypeClass v_Min_Schiene_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Min_Schiene_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Strasse_TypeClass(V_Min_Strasse_TypeClass v_Min_Strasse_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_Min_Strasse_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkehrszeichen(Verkehrszeichen verkehrszeichen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkehrszeichen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkehrszeichen_Allg_AttributeGroup(Verkehrszeichen_Allg_AttributeGroup verkehrszeichen_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkehrszeichen_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkehrszeichen_Andreaskreuz_AttributeGroup(Verkehrszeichen_Andreaskreuz_AttributeGroup verkehrszeichen_Andreaskreuz_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkehrszeichen_Andreaskreuz_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkehrszeichen_Bezeichnung_AttributeGroup(Verkehrszeichen_Bezeichnung_AttributeGroup verkehrszeichen_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkehrszeichen_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerkehrszeichen_Lz_AttributeGroup(Verkehrszeichen_Lz_AttributeGroup verkehrszeichen_Lz_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verkehrszeichen_Lz_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorgeschaltet_TypeClass(Vorgeschaltet_TypeClass vorgeschaltet_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorgeschaltet_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVz_Sperrstrecke_AttributeGroup(Vz_Sperrstrecke_AttributeGroup vz_Sperrstrecke_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vz_Sperrstrecke_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVz_Sperrstrecke_Schranke_AttributeGroup(Vz_Sperrstrecke_Schranke_AttributeGroup vz_Sperrstrecke_Schranke_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vz_Sperrstrecke_Schranke_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVz_Sperrstrecke_Vorgeschaltet_AttributeGroup(Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup vz_Sperrstrecke_Vorgeschaltet_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vz_Sperrstrecke_Vorgeschaltet_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinkel_Alpha_TypeClass(Winkel_Alpha_TypeClass winkel_Alpha_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(winkel_Alpha_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeitueberschreitungsmeldung_TypeClass(Zeitueberschreitungsmeldung_TypeClass zeitueberschreitungsmeldung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zeitueberschreitungsmeldung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzschild_TypeClass(Zusatzschild_TypeClass zusatzschild_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zusatzschild_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBaumprofil(ENUMBaumprofil enumBaumprofil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEBauart(ENUMBUEBauart enumbueBauart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEFunktionsueberwachung(ENUMBUEFunktionsueberwachung enumbueFunktionsueberwachung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEHandschalteinrichtung(ENUMBUEHandschalteinrichtung enumbueHandschalteinrichtung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUESicherungsart(ENUMBUESicherungsart enumbueSicherungsart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUETechnik(ENUMBUETechnik enumbueTechnik, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFueSchaltfall(ENUMFueSchaltfall enumFueSchaltfall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFussRadwegArt(ENUMFussRadwegArt enumFussRadwegArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFussRadwegSeite(ENUMFussRadwegSeite enumFussRadwegSeite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGFRArt(ENUMGFRArt enumgfrArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHpErsatzstecker(ENUMHpErsatzstecker enumHpErsatzstecker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKlassifizierung(ENUMKlassifizierung enumKlassifizierung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLagerung(ENUMLagerung enumLagerung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLFUEImpuls(ENUMLFUEImpuls enumlfueImpuls, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMontageAusgleichsgewichte(ENUMMontageAusgleichsgewichte enumMontageAusgleichsgewichte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOptikSymbol(ENUMOptikSymbol enumOptikSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRichtungspfeil(ENUMRichtungspfeil enumRichtungspfeil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstand_Gehweg_Fahrbahn_Type(BigDecimal abstand_Gehweg_Fahrbahn_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustik_Fussgaenger_Type(boolean akustik_Fussgaenger_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAkustik_Fussgaenger_TypeObject(Boolean akustik_Fussgaenger_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusrichtung_Winkel_Type(BigDecimal ausrichtung_Winkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAusrichtung_Winkel_Type_Pattern(ausrichtung_Winkel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAusrichtung_Winkel_Type_Pattern
	 */
	public static final  PatternMatcher [][] AUSRICHTUNG_WINKEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([1-8]?[0-9]|90)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ausrichtung Winkel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAusrichtung_Winkel_Type_Pattern(BigDecimal ausrichtung_Winkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getAusrichtung_Winkel_Type(), ausrichtung_Winkel_Type, AUSRICHTUNG_WINKEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaulast_Type(String baulast_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(baulast_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeeinflussung_Strassenverkehr_Type(BigDecimal beeinflussung_Strassenverkehr_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(beeinflussung_Strassenverkehr_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Schrankenantrieb_Type(String bez_Schrankenantrieb_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBez_Schrankenantrieb_Type_Pattern(bez_Schrankenantrieb_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBez_Schrankenantrieb_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZ_SCHRANKENANTRIEB_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{2,3}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bez Schrankenantrieb Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Schrankenantrieb_Type_Pattern(String bez_Schrankenantrieb_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getBez_Schrankenantrieb_Type(), bez_Schrankenantrieb_Type, BEZ_SCHRANKENANTRIEB_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_BUE_GFR_Eckpunkt_Type(String bezeichnung_BUE_GFR_Eckpunkt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bezeichnung_BUE_GFR_Eckpunkt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_GFR_Element_Type(String bezeichnung_GFR_Element_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bezeichnung_GFR_Element_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_GFR_Tripelspiegel_Type(BigInteger bezeichnung_GFR_Tripelspiegel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBezeichnung_GFR_Tripelspiegel_Type_Pattern(bezeichnung_GFR_Tripelspiegel_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBezeichnung_GFR_Tripelspiegel_Type_Pattern
	 */
	public static final  PatternMatcher [][] BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bezeichnung GFR Tripelspiegel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_GFR_Tripelspiegel_Type_Pattern(BigInteger bezeichnung_GFR_Tripelspiegel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getBezeichnung_GFR_Tripelspiegel_Type(), bezeichnung_GFR_Tripelspiegel_Type, BEZEICHNUNG_GFR_TRIPELSPIEGEL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_Verkehrszeichen_Type(String bezeichnung_Verkehrszeichen_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bezeichnung_Verkehrszeichen_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlitzpfeil_Type(boolean blitzpfeil_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlitzpfeil_TypeObject(Boolean blitzpfeil_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Nachlaufzeit_Type(BigDecimal buE_Nachlaufzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBUE_Nachlaufzeit_Type_Pattern(buE_Nachlaufzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBUE_Nachlaufzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] BUE_NACHLAUFZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>BUE Nachlaufzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Nachlaufzeit_Type_Pattern(BigDecimal buE_Nachlaufzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getBUE_Nachlaufzeit_Type(), buE_Nachlaufzeit_Type, BUE_NACHLAUFZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Neigung_Type(BigDecimal buE_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Sicherungszeit_Type(BigInteger buE_Sicherungszeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Strasse_Type(List<?> buE_Strasse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBUE_Strasse_Type_ItemType(buE_Strasse_Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>BUE Strasse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Strasse_Type_ItemType(List<?> buE_Strasse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = buE_Strasse_Type.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (BasisTypenPackage.Literals.TEXT_TYPE.isInstance(item)) {
				result &= basisTypenValidator.validateText_Type((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(BasisTypenPackage.Literals.TEXT_TYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Vorlaufzeit_Type(BigDecimal buE_Vorlaufzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBUE_Vorlaufzeit_Type_Pattern(buE_Vorlaufzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBUE_Vorlaufzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] BUE_VORLAUFZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>BUE Vorlaufzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBUE_Vorlaufzeit_Type_Pattern(BigDecimal buE_Vorlaufzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getBUE_Vorlaufzeit_Type(), buE_Vorlaufzeit_Type, BUE_VORLAUFZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Errechnet_Type(BigDecimal einschaltverz_Errechnet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEinschaltverz_Errechnet_Type_Pattern(einschaltverz_Errechnet_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEinschaltverz_Errechnet_Type_Pattern
	 */
	public static final  PatternMatcher [][] EINSCHALTVERZ_ERRECHNET_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Einschaltverz Errechnet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Errechnet_Type_Pattern(BigDecimal einschaltverz_Errechnet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getEinschaltverz_Errechnet_Type(), einschaltverz_Errechnet_Type, EINSCHALTVERZ_ERRECHNET_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Gewaehlt_Type(BigDecimal einschaltverz_Gewaehlt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEinschaltverz_Gewaehlt_Type_Pattern(einschaltverz_Gewaehlt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEinschaltverz_Gewaehlt_Type_Pattern
	 */
	public static final  PatternMatcher [][] EINSCHALTVERZ_GEWAEHLT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Einschaltverz Gewaehlt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEinschaltverz_Gewaehlt_Type_Pattern(BigDecimal einschaltverz_Gewaehlt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getEinschaltverz_Gewaehlt_Type(), einschaltverz_Gewaehlt_Type, EINSCHALTVERZ_GEWAEHLT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBaumprofilObject(ENUMBaumprofil enumBaumprofilObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEBauartObject(ENUMBUEBauart enumbueBauartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEFunktionsueberwachungObject(ENUMBUEFunktionsueberwachung enumbueFunktionsueberwachungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUEHandschalteinrichtungObject(ENUMBUEHandschalteinrichtung enumbueHandschalteinrichtungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUESicherungsartObject(ENUMBUESicherungsart enumbueSicherungsartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBUETechnikObject(ENUMBUETechnik enumbueTechnikObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFueSchaltfallObject(ENUMFueSchaltfall enumFueSchaltfallObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFussRadwegArtObject(ENUMFussRadwegArt enumFussRadwegArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMFussRadwegSeiteObject(ENUMFussRadwegSeite enumFussRadwegSeiteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMGFRArtObject(ENUMGFRArt enumgfrArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMHpErsatzsteckerObject(ENUMHpErsatzstecker enumHpErsatzsteckerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMKlassifizierungObject(ENUMKlassifizierung enumKlassifizierungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLagerungObject(ENUMLagerung enumLagerungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMLFUEImpulsObject(ENUMLFUEImpuls enumlfueImpulsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMontageAusgleichsgewichteObject(ENUMMontageAusgleichsgewichte enumMontageAusgleichsgewichteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOptikSymbolObject(ENUMOptikSymbol enumOptikSymbolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMRichtungspfeilObject(ENUMRichtungspfeil enumRichtungspfeilObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Befestigung_Gleis_Type(String fahrbahn_Befestigung_Gleis_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(fahrbahn_Befestigung_Gleis_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Befestigung_Type(String fahrbahn_Befestigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(fahrbahn_Befestigung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFahrbahn_Breite_Type(BigDecimal fahrbahn_Breite_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Neigung_Type(BigDecimal gfR_Neigung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGFR_Typ_Type(String gfR_Typ_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(gfR_Typ_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleis_Am_Bue_Type(String gleis_Am_Bue_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGleis_Am_Bue_Type_Pattern(gleis_Am_Bue_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGleis_Am_Bue_Type_Pattern
	 */
	public static final  PatternMatcher [][] GLEIS_AM_BUE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Gleis Am Bue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGleis_Am_Bue_Type_Pattern(String gleis_Am_Bue_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getGleis_Am_Bue_Type(), gleis_Am_Bue_Type, GLEIS_AM_BUE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaltezeit_Type(BigDecimal haltezeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(haltezeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontrastblende_Type(boolean kontrastblende_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKontrastblende_TypeObject(Boolean kontrastblende_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKreuzungswinkel_Type(BigInteger kreuzungswinkel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLieferlaenge_Type(BigDecimal lieferlaenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLieferlaenge_Type_Pattern(lieferlaenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLieferlaenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] LIEFERLAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1[0-9]|20|[1-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Lieferlaenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLieferlaenge_Type_Pattern(BigDecimal lieferlaenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getLieferlaenge_Type(), lieferlaenge_Type, LIEFERLAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontage_Besonders_Type(String montage_Besonders_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(montage_Besonders_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMontagehoehe_Type(BigDecimal montagehoehe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptik_Durchmesser_Type(BigInteger optik_Durchmesser_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOptik_Durchmesser_Type_Pattern(optik_Durchmesser_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOptik_Durchmesser_Type_Pattern
	 */
	public static final  PatternMatcher [][] OPTIK_DURCHMESSER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("200|300")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Optik Durchmesser Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptik_Durchmesser_Type_Pattern(BigInteger optik_Durchmesser_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getOptik_Durchmesser_Type(), optik_Durchmesser_Type, OPTIK_DURCHMESSER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePegel_Type(BigInteger pegel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixel_Koordinate_X_Type(BigInteger pixel_Koordinate_X_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixel_Koordinate_Y_Type(BigInteger pixel_Koordinate_Y_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DAB_Type(BigDecimal raeumstrecke_DAB_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DBK_Type(BigDecimal raeumstrecke_DBK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DCK_Type(BigDecimal raeumstrecke_DCK_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_DSK_Strich_Type(BigDecimal raeumstrecke_DSK_Strich_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaeumstrecke_Type(BigDecimal raeumstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltgruppe_Type(BigInteger schaltgruppe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSchaltgruppe_Type_Pattern(schaltgruppe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSchaltgruppe_Type_Pattern
	 */
	public static final  PatternMatcher [][] SCHALTGRUPPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|10")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Schaltgruppe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltgruppe_Type_Pattern(BigInteger schaltgruppe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getSchaltgruppe_Type(), schaltgruppe_Type, SCHALTGRUPPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzbuegel_Type(boolean schutzbuegel_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzbuegel_TypeObject(Boolean schutzbuegel_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSicherheitsabstand_Type(BigDecimal sicherheitsabstand_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Errechnet_Type(BigDecimal signalverz_Errechnet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalverz_Errechnet_Type_Pattern(signalverz_Errechnet_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignalverz_Errechnet_Type_Pattern
	 */
	public static final  PatternMatcher [][] SIGNALVERZ_ERRECHNET_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Signalverz Errechnet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Errechnet_Type_Pattern(BigDecimal signalverz_Errechnet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getSignalverz_Errechnet_Type(), signalverz_Errechnet_Type, SIGNALVERZ_ERRECHNET_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Gewaehlt_Type(BigDecimal signalverz_Gewaehlt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignalverz_Gewaehlt_Type_Pattern(signalverz_Gewaehlt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignalverz_Gewaehlt_Type_Pattern
	 */
	public static final  PatternMatcher [][] SIGNALVERZ_GEWAEHLT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]{0,4})\\.[0-9]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Signalverz Gewaehlt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalverz_Gewaehlt_Type_Pattern(BigDecimal signalverz_Gewaehlt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getSignalverz_Gewaehlt_Type(), signalverz_Gewaehlt_Type, SIGNALVERZ_GEWAEHLT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrlaenge_Type(BigDecimal sperrlaenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSperrlaenge_Type_Pattern(sperrlaenge_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSperrlaenge_Type_Pattern
	 */
	public static final  PatternMatcher [][] SPERRLAENGE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1[0-9]|20|[1-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sperrlaenge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrlaenge_Type_Pattern(BigDecimal sperrlaenge_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getSperrlaenge_Type(), sperrlaenge_Type, SPERRLAENGE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrstrecke_Fussgaenger_Type(BigDecimal sperrstrecke_Fussgaenger_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSperrstrecke_Type(BigDecimal sperrstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeilsperrstrecke_Type(BigDecimal teilsperrstrecke_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeilvorgabezeit_Type(BigInteger teilvorgabezeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTragkopf_Verstellbar_Type(boolean tragkopf_Verstellbar_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTragkopf_Verstellbar_TypeObject(Boolean tragkopf_Verstellbar_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Max_Schiene_Type(BigInteger v_Max_Schiene_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Max_Schiene_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Max_Strasse_Type(BigInteger v_Max_Strasse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Max_Strasse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Fussweg_Type(BigDecimal v_Min_Fussweg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateV_Min_Fussweg_Type_Pattern(v_Min_Fussweg_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateV_Min_Fussweg_Type_Pattern
	 */
	public static final  PatternMatcher [][] VMIN_FUSSWEG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0\\.[5-9]|1\\.[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>VMin Fussweg Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Fussweg_Type_Pattern(BigDecimal v_Min_Fussweg_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getV_Min_Fussweg_Type(), v_Min_Fussweg_Type, VMIN_FUSSWEG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Schiene_Type(BigInteger v_Min_Schiene_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(v_Min_Schiene_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Strasse_Type(BigInteger v_Min_Strasse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateV_Min_Strasse_Type_Pattern(v_Min_Strasse_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateV_Min_Strasse_Type_Pattern
	 */
	public static final  PatternMatcher [][] VMIN_STRASSE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("5|10")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>VMin Strasse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_Min_Strasse_Type_Pattern(BigInteger v_Min_Strasse_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getV_Min_Strasse_Type(), v_Min_Strasse_Type, VMIN_STRASSE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorgeschaltet_Type(boolean vorgeschaltet_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorgeschaltet_TypeObject(Boolean vorgeschaltet_TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinkel_Alpha_Type(BigInteger winkel_Alpha_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeitueberschreitungsmeldung_Type(BigDecimal zeitueberschreitungsmeldung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZeitueberschreitungsmeldung_Type_Pattern(zeitueberschreitungsmeldung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZeitueberschreitungsmeldung_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZEITUEBERSCHREITUNGSMELDUNG_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{0,4}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Zeitueberschreitungsmeldung Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeitueberschreitungsmeldung_Type_Pattern(BigDecimal zeitueberschreitungsmeldung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BahnuebergangPackage.eINSTANCE.getZeitueberschreitungsmeldung_Type(), zeitueberschreitungsmeldung_Type, ZEITUEBERSCHREITUNGSMELDUNG_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzschild_Type(String zusatzschild_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(zusatzschild_Type, diagnostics, context);
		return result;
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

} //BahnuebergangValidator
