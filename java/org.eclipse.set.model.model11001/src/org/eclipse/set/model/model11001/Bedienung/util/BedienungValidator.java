/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.util;

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

import org.eclipse.set.model.model11001.Bedienung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage
 * @generated
 */
public class BedienungValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BedienungValidator INSTANCE = new BedienungValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.Bedienung";

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
	public BedienungValidator() {
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
	  return BedienungPackage.eINSTANCE;
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
			case BedienungPackage.AWERT_TYPE_CLASS:
				return validateA_Wert_TypeClass((A_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.ANBINDUNG_IB2_TYPE_CLASS:
				return validateAnbindung_IB2_TypeClass((Anbindung_IB2_TypeClass)value, diagnostics, context);
			case BedienungPackage.ANBINDUNG_IB3_TYPE_CLASS:
				return validateAnbindung_IB3_TypeClass((Anbindung_IB3_TypeClass)value, diagnostics, context);
			case BedienungPackage.BWERT_TYPE_CLASS:
				return validateB_Wert_TypeClass((B_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT:
				return validateBedien_Anrueckabschnitt((Bedien_Anrueckabschnitt)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup((Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT:
				return validateBedien_Anzeige_Element((Bedien_Anzeige_Element)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_Anzeige_Element_Allg_AttributeGroup((Bedien_Anzeige_Element_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBedien_Anzeige_Element_Bezeichnung_AttributeGroup((Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_BEZIRK:
				return validateBedien_Bezirk((Bedien_Bezirk)value, diagnostics, context);
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP:
				return validateBedien_Bezirk_Adressformel_AttributeGroup((Bedien_Bezirk_Adressformel_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_Bezirk_Allg_AttributeGroup((Bedien_Bezirk_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP:
				return validateBedien_Bezirk_Anhaenge_AttributeGroup((Bedien_Bezirk_Anhaenge_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHT_BAUART_TYPE_CLASS:
				return validateBedien_Einricht_Bauart_TypeClass((Bedien_Einricht_Bauart_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS:
				return validateBedien_Einricht_Oertl_Bez_TypeClass((Bedien_Einricht_Oertl_Bez_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_Einricht_Oertlich_Allg_AttributeGroup((Bedien_Einricht_Oertlich_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH:
				return validateBedien_Einrichtung_Oertlich((Bedien_Einrichtung_Oertlich)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup((Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_GBT:
				return validateBedien_GBT((Bedien_GBT)value, diagnostics, context);
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_GBT_Allg_AttributeGroup((Bedien_GBT_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OBERFLAECHE:
				return validateBedien_Oberflaeche((Bedien_Oberflaeche)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP:
				return validateBedien_Oberflaeche_Anhaenge_AttributeGroup((Bedien_Oberflaeche_Anhaenge_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD:
				return validateBedien_Oberflaeche_Bild((Bedien_Oberflaeche_Bild)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_Oberflaeche_Bild_Allg_AttributeGroup((Bedien_Oberflaeche_Bild_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OERTLICHKEIT:
				return validateBedien_Oertlichkeit((Bedien_Oertlichkeit)value, diagnostics, context);
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP:
				return validateBedien_Oertlichkeit_Kennzahlen_AttributeGroup((Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_PLATZ:
				return validateBedien_Platz((Bedien_Platz)value, diagnostics, context);
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP:
				return validateBedien_Platz_Allg_AttributeGroup((Bedien_Platz_Allg_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_PLATZ_ART_TYPE_CLASS:
				return validateBedien_Platz_Art_TypeClass((Bedien_Platz_Art_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIEN_STANDORT:
				return validateBedien_Standort((Bedien_Standort)value, diagnostics, context);
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBedien_Standort_Bezeichnung_AttributeGroup((Bedien_Standort_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ZENTRALE:
				return validateBedien_Zentrale((Bedien_Zentrale)value, diagnostics, context);
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP:
				return validateBedien_Zentrale_Bezeichnung_AttributeGroup((Bedien_Zentrale_Bezeichnung_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE_CLASS:
				return validateBedienplatzbezeichnung_TypeClass((Bedienplatzbezeichnung_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE_CLASS:
				return validateBedienplatznummer_TypeClass((Bedienplatznummer_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE_CLASS:
				return validateBedienraumnummer_TypeClass((Bedienraumnummer_TypeClass)value, diagnostics, context);
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS:
				return validateBetriebsstellenbezeichner_TypeClass((Betriebsstellenbezeichner_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS:
				return validateBez_Bed_Anrueckabschnitt_TypeClass((Bez_Bed_Anrueckabschnitt_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS:
				return validateBez_Bed_Anzeige_Element_TypeClass((Bez_Bed_Anzeige_Element_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE_CLASS:
				return validateBez_Bed_Zentrale_TypeClass((Bez_Bed_Zentrale_TypeClass)value, diagnostics, context);
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE_CLASS:
				return validateBezeichnung_BSO_TypeClass((Bezeichnung_BSO_TypeClass)value, diagnostics, context);
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP:
				return validateBSO_IP_AB_Teilsystem_AttributeGroup((BSO_IP_AB_Teilsystem_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP:
				return validateBSO_IP_Adressblock_AttributeGroup((BSO_IP_Adressblock_AttributeGroup)value, diagnostics, context);
			case BedienungPackage.BSO_TEILSYSTEM_ART_TYPE_CLASS:
				return validateBSO_Teilsystem_Art_TypeClass((BSO_Teilsystem_Art_TypeClass)value, diagnostics, context);
			case BedienungPackage.CWERT_TYPE_CLASS:
				return validateC_Wert_TypeClass((C_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.DD_WERT_TYPE_CLASS:
				return validateDD_Wert_TypeClass((DD_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.HERSTELLER_TYPE_CLASS:
				return validateHersteller_TypeClass((Hersteller_TypeClass)value, diagnostics, context);
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE_CLASS:
				return validateHupe_Anschaltzeit_TypeClass((Hupe_Anschaltzeit_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS:
				return validateIP_Adressblock_Blau_TypeClass((IP_Adressblock_Blau_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS:
				return validateIP_Adressblock_Blau_V4_TypeClass((IP_Adressblock_Blau_V4_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS:
				return validateIP_Adressblock_Blau_V6_TypeClass((IP_Adressblock_Blau_V6_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS:
				return validateIP_Adressblock_Grau_TypeClass((IP_Adressblock_Grau_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS:
				return validateIP_Adressblock_Grau_V4_TypeClass((IP_Adressblock_Grau_V4_TypeClass)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS:
				return validateIP_Adressblock_Grau_V6_TypeClass((IP_Adressblock_Grau_V6_TypeClass)value, diagnostics, context);
			case BedienungPackage.KENNZAHL_TYPE_CLASS:
				return validateKennzahl_TypeClass((Kennzahl_TypeClass)value, diagnostics, context);
			case BedienungPackage.MELDER_TYPE_CLASS:
				return validateMelder_TypeClass((Melder_TypeClass)value, diagnostics, context);
			case BedienungPackage.OBERFLAECHE_BILDART_TYPE_CLASS:
				return validateOberflaeche_Bildart_TypeClass((Oberflaeche_Bildart_TypeClass)value, diagnostics, context);
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS:
				return validateOberflaeche_Zustaendigkeit_TypeClass((Oberflaeche_Zustaendigkeit_TypeClass)value, diagnostics, context);
			case BedienungPackage.REGIONALBEREICH_TYPE_CLASS:
				return validateRegionalbereich_TypeClass((Regionalbereich_TypeClass)value, diagnostics, context);
			case BedienungPackage.RUECKSCHAUZEIT_TYPE_CLASS:
				return validateRueckschauzeit_TypeClass((Rueckschauzeit_TypeClass)value, diagnostics, context);
			case BedienungPackage.SCHALTER_TYPE_CLASS:
				return validateSchalter_TypeClass((Schalter_TypeClass)value, diagnostics, context);
			case BedienungPackage.SCHRANKREIHE_TYPE_CLASS:
				return validateSchrankreihe_TypeClass((Schrankreihe_TypeClass)value, diagnostics, context);
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE_CLASS:
				return validateSteuerbezirksname_TypeClass((Steuerbezirksname_TypeClass)value, diagnostics, context);
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE_CLASS:
				return validateSteuerbezirksnummer_TypeClass((Steuerbezirksnummer_TypeClass)value, diagnostics, context);
			case BedienungPackage.TASTE_TYPE_CLASS:
				return validateTaste_TypeClass((Taste_TypeClass)value, diagnostics, context);
			case BedienungPackage.VORSCHAUZEIT_TYPE_CLASS:
				return validateVorschauzeit_TypeClass((Vorschauzeit_TypeClass)value, diagnostics, context);
			case BedienungPackage.XWERT_TYPE_CLASS:
				return validateX_Wert_TypeClass((X_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.YWERT_TYPE_CLASS:
				return validateY_Wert_TypeClass((Y_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.YY_WERT_TYPE_CLASS:
				return validateYY_Wert_TypeClass((YY_Wert_TypeClass)value, diagnostics, context);
			case BedienungPackage.ENUMA_WERT:
				return validateENUMAWert((ENUMAWert)value, diagnostics, context);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART:
				return validateENUMBedienEinrichtBauart((ENUMBedienEinrichtBauart)value, diagnostics, context);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART:
				return validateENUMBedienPlatzArt((ENUMBedienPlatzArt)value, diagnostics, context);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART:
				return validateENUMBSOTeilsystemArt((ENUMBSOTeilsystemArt)value, diagnostics, context);
			case BedienungPackage.ENUMC_WERT:
				return validateENUMCWert((ENUMCWert)value, diagnostics, context);
			case BedienungPackage.ENUM_MELDER:
				return validateENUMMelder((ENUMMelder)value, diagnostics, context);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART:
				return validateENUMOberflaecheBildart((ENUMOberflaecheBildart)value, diagnostics, context);
			case BedienungPackage.ENUM_SCHALTER:
				return validateENUMSchalter((ENUMSchalter)value, diagnostics, context);
			case BedienungPackage.ENUM_TASTE:
				return validateENUMTaste((ENUMTaste)value, diagnostics, context);
			case BedienungPackage.ENUMX_WERT:
				return validateENUMXWert((ENUMXWert)value, diagnostics, context);
			case BedienungPackage.BWERT_TYPE:
				return validateB_Wert_Type((BigInteger)value, diagnostics, context);
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE:
				return validateBedien_Einricht_Oertl_Bez_Type((String)value, diagnostics, context);
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE:
				return validateBedienplatzbezeichnung_Type((String)value, diagnostics, context);
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE:
				return validateBedienplatznummer_Type((String)value, diagnostics, context);
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE:
				return validateBedienraumnummer_Type((String)value, diagnostics, context);
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE:
				return validateBetriebsstellenbezeichner_Type((String)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE:
				return validateBez_Bed_Anrueckabschnitt_Type((String)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE:
				return validateBez_Bed_Anzeige_Element_Type((String)value, diagnostics, context);
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE:
				return validateBez_Bed_Zentrale_Type((String)value, diagnostics, context);
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE:
				return validateBezeichnung_BSO_Type((String)value, diagnostics, context);
			case BedienungPackage.DD_WERT_TYPE:
				return validateDD_Wert_Type((BigInteger)value, diagnostics, context);
			case BedienungPackage.ENUMA_WERT_OBJECT:
				return validateENUMAWertObject((ENUMAWert)value, diagnostics, context);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART_OBJECT:
				return validateENUMBedienEinrichtBauartObject((ENUMBedienEinrichtBauart)value, diagnostics, context);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART_OBJECT:
				return validateENUMBedienPlatzArtObject((ENUMBedienPlatzArt)value, diagnostics, context);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART_OBJECT:
				return validateENUMBSOTeilsystemArtObject((ENUMBSOTeilsystemArt)value, diagnostics, context);
			case BedienungPackage.ENUMC_WERT_OBJECT:
				return validateENUMCWertObject((ENUMCWert)value, diagnostics, context);
			case BedienungPackage.ENUM_MELDER_OBJECT:
				return validateENUMMelderObject((ENUMMelder)value, diagnostics, context);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART_OBJECT:
				return validateENUMOberflaecheBildartObject((ENUMOberflaecheBildart)value, diagnostics, context);
			case BedienungPackage.ENUM_SCHALTER_OBJECT:
				return validateENUMSchalterObject((ENUMSchalter)value, diagnostics, context);
			case BedienungPackage.ENUM_TASTE_OBJECT:
				return validateENUMTasteObject((ENUMTaste)value, diagnostics, context);
			case BedienungPackage.ENUMX_WERT_OBJECT:
				return validateENUMXWertObject((ENUMXWert)value, diagnostics, context);
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE:
				return validateHupe_Anschaltzeit_Type((BigDecimal)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return validateIP_Adressblock_Blau_Type((String)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return validateIP_Adressblock_Blau_V4_Type((String)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return validateIP_Adressblock_Blau_V6_Type((String)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return validateIP_Adressblock_Grau_Type((String)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return validateIP_Adressblock_Grau_V4_Type((String)value, diagnostics, context);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return validateIP_Adressblock_Grau_V6_Type((String)value, diagnostics, context);
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE:
				return validateOberflaeche_Zustaendigkeit_Type((String)value, diagnostics, context);
			case BedienungPackage.RUECKSCHAUZEIT_TYPE:
				return validateRueckschauzeit_Type((BigDecimal)value, diagnostics, context);
			case BedienungPackage.SCHRANKREIHE_TYPE:
				return validateSchrankreihe_Type((String)value, diagnostics, context);
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE:
				return validateSteuerbezirksname_Type((String)value, diagnostics, context);
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE:
				return validateSteuerbezirksnummer_Type((String)value, diagnostics, context);
			case BedienungPackage.VORSCHAUZEIT_TYPE:
				return validateVorschauzeit_Type((BigDecimal)value, diagnostics, context);
			case BedienungPackage.YWERT_TYPE:
				return validateY_Wert_Type((BigInteger)value, diagnostics, context);
			case BedienungPackage.YY_WERT_TYPE:
				return validateYY_Wert_Type((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateA_Wert_TypeClass(A_Wert_TypeClass a_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(a_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnbindung_IB2_TypeClass(Anbindung_IB2_TypeClass anbindung_IB2_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anbindung_IB2_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnbindung_IB3_TypeClass(Anbindung_IB3_TypeClass anbindung_IB3_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anbindung_IB3_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateB_Wert_TypeClass(B_Wert_TypeClass b_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Anrueckabschnitt(Bedien_Anrueckabschnitt bedien_Anrueckabschnitt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Anrueckabschnitt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Anzeige_Element(Bedien_Anzeige_Element bedien_Anzeige_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Anzeige_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Anzeige_Element_Allg_AttributeGroup(Bedien_Anzeige_Element_Allg_AttributeGroup bedien_Anzeige_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Anzeige_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Anzeige_Element_Bezeichnung_AttributeGroup(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup bedien_Anzeige_Element_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Anzeige_Element_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Bezirk(Bedien_Bezirk bedien_Bezirk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Bezirk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Bezirk_Adressformel_AttributeGroup(Bedien_Bezirk_Adressformel_AttributeGroup bedien_Bezirk_Adressformel_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Bezirk_Adressformel_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Bezirk_Allg_AttributeGroup(Bedien_Bezirk_Allg_AttributeGroup bedien_Bezirk_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Bezirk_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Bezirk_Anhaenge_AttributeGroup(Bedien_Bezirk_Anhaenge_AttributeGroup bedien_Bezirk_Anhaenge_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Bezirk_Anhaenge_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einricht_Bauart_TypeClass(Bedien_Einricht_Bauart_TypeClass bedien_Einricht_Bauart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Einricht_Bauart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einricht_Oertl_Bez_TypeClass(Bedien_Einricht_Oertl_Bez_TypeClass bedien_Einricht_Oertl_Bez_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Einricht_Oertl_Bez_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einricht_Oertlich_Allg_AttributeGroup(Bedien_Einricht_Oertlich_Allg_AttributeGroup bedien_Einricht_Oertlich_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Einricht_Oertlich_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einrichtung_Oertlich(Bedien_Einrichtung_Oertlich bedien_Einrichtung_Oertlich, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Einrichtung_Oertlich, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_GBT(Bedien_GBT bedien_GBT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_GBT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_GBT_Allg_AttributeGroup(Bedien_GBT_Allg_AttributeGroup bedien_GBT_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_GBT_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oberflaeche(Bedien_Oberflaeche bedien_Oberflaeche, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oberflaeche, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oberflaeche_Anhaenge_AttributeGroup(Bedien_Oberflaeche_Anhaenge_AttributeGroup bedien_Oberflaeche_Anhaenge_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oberflaeche_Anhaenge_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oberflaeche_Bild(Bedien_Oberflaeche_Bild bedien_Oberflaeche_Bild, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oberflaeche_Bild, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oberflaeche_Bild_Allg_AttributeGroup(Bedien_Oberflaeche_Bild_Allg_AttributeGroup bedien_Oberflaeche_Bild_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oberflaeche_Bild_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oertlichkeit(Bedien_Oertlichkeit bedien_Oertlichkeit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oertlichkeit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Oertlichkeit_Kennzahlen_AttributeGroup(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup bedien_Oertlichkeit_Kennzahlen_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Oertlichkeit_Kennzahlen_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Platz(Bedien_Platz bedien_Platz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Platz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Platz_Allg_AttributeGroup(Bedien_Platz_Allg_AttributeGroup bedien_Platz_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Platz_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Platz_Art_TypeClass(Bedien_Platz_Art_TypeClass bedien_Platz_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Platz_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Standort(Bedien_Standort bedien_Standort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Standort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Standort_Bezeichnung_AttributeGroup(Bedien_Standort_Bezeichnung_AttributeGroup bedien_Standort_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Standort_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Zentrale(Bedien_Zentrale bedien_Zentrale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Zentrale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Zentrale_Bezeichnung_AttributeGroup(Bedien_Zentrale_Bezeichnung_AttributeGroup bedien_Zentrale_Bezeichnung_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedien_Zentrale_Bezeichnung_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienplatzbezeichnung_TypeClass(Bedienplatzbezeichnung_TypeClass bedienplatzbezeichnung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedienplatzbezeichnung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienplatznummer_TypeClass(Bedienplatznummer_TypeClass bedienplatznummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedienplatznummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienraumnummer_TypeClass(Bedienraumnummer_TypeClass bedienraumnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bedienraumnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetriebsstellenbezeichner_TypeClass(Betriebsstellenbezeichner_TypeClass betriebsstellenbezeichner_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(betriebsstellenbezeichner_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Anrueckabschnitt_TypeClass(Bez_Bed_Anrueckabschnitt_TypeClass bez_Bed_Anrueckabschnitt_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Bed_Anrueckabschnitt_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Anzeige_Element_TypeClass(Bez_Bed_Anzeige_Element_TypeClass bez_Bed_Anzeige_Element_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Bed_Anzeige_Element_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Zentrale_TypeClass(Bez_Bed_Zentrale_TypeClass bez_Bed_Zentrale_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bez_Bed_Zentrale_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_BSO_TypeClass(Bezeichnung_BSO_TypeClass bezeichnung_BSO_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezeichnung_BSO_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSO_IP_AB_Teilsystem_AttributeGroup(BSO_IP_AB_Teilsystem_AttributeGroup bsO_IP_AB_Teilsystem_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsO_IP_AB_Teilsystem_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSO_IP_Adressblock_AttributeGroup(BSO_IP_Adressblock_AttributeGroup bsO_IP_Adressblock_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsO_IP_Adressblock_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSO_Teilsystem_Art_TypeClass(BSO_Teilsystem_Art_TypeClass bsO_Teilsystem_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsO_Teilsystem_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC_Wert_TypeClass(C_Wert_TypeClass c_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(c_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDD_Wert_TypeClass(DD_Wert_TypeClass dD_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dD_Wert_TypeClass, diagnostics, context);
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
	public boolean validateHupe_Anschaltzeit_TypeClass(Hupe_Anschaltzeit_TypeClass hupe_Anschaltzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hupe_Anschaltzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_TypeClass(IP_Adressblock_Blau_TypeClass iP_Adressblock_Blau_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V4_TypeClass(IP_Adressblock_Blau_V4_TypeClass iP_Adressblock_Blau_V4_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_V4_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V6_TypeClass(IP_Adressblock_Blau_V6_TypeClass iP_Adressblock_Blau_V6_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Blau_V6_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_TypeClass(IP_Adressblock_Grau_TypeClass iP_Adressblock_Grau_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V4_TypeClass(IP_Adressblock_Grau_V4_TypeClass iP_Adressblock_Grau_V4_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_V4_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V6_TypeClass(IP_Adressblock_Grau_V6_TypeClass iP_Adressblock_Grau_V6_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iP_Adressblock_Grau_V6_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKennzahl_TypeClass(Kennzahl_TypeClass kennzahl_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kennzahl_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMelder_TypeClass(Melder_TypeClass melder_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(melder_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberflaeche_Bildart_TypeClass(Oberflaeche_Bildart_TypeClass oberflaeche_Bildart_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oberflaeche_Bildart_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberflaeche_Zustaendigkeit_TypeClass(Oberflaeche_Zustaendigkeit_TypeClass oberflaeche_Zustaendigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oberflaeche_Zustaendigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalbereich_TypeClass(Regionalbereich_TypeClass regionalbereich_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalbereich_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRueckschauzeit_TypeClass(Rueckschauzeit_TypeClass rueckschauzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rueckschauzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchalter_TypeClass(Schalter_TypeClass schalter_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schalter_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchrankreihe_TypeClass(Schrankreihe_TypeClass schrankreihe_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schrankreihe_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteuerbezirksname_TypeClass(Steuerbezirksname_TypeClass steuerbezirksname_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(steuerbezirksname_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteuerbezirksnummer_TypeClass(Steuerbezirksnummer_TypeClass steuerbezirksnummer_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(steuerbezirksnummer_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaste_TypeClass(Taste_TypeClass taste_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taste_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorschauzeit_TypeClass(Vorschauzeit_TypeClass vorschauzeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorschauzeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX_Wert_TypeClass(X_Wert_TypeClass x_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(x_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateY_Wert_TypeClass(Y_Wert_TypeClass y_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(y_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYY_Wert_TypeClass(YY_Wert_TypeClass yY_Wert_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yY_Wert_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAWert(ENUMAWert enumaWert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienEinrichtBauart(ENUMBedienEinrichtBauart enumBedienEinrichtBauart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienPlatzArt(ENUMBedienPlatzArt enumBedienPlatzArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBSOTeilsystemArt(ENUMBSOTeilsystemArt enumbsoTeilsystemArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMCWert(ENUMCWert enumcWert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMelder(ENUMMelder enumMelder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOberflaecheBildart(ENUMOberflaecheBildart enumOberflaecheBildart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchalter(ENUMSchalter enumSchalter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTaste(ENUMTaste enumTaste, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMXWert(ENUMXWert enumxWert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateB_Wert_Type(BigInteger b_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateB_Wert_Type_Pattern(b_Wert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateB_Wert_Type_Pattern
	 */
	public static final  PatternMatcher [][] BWERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|1[0-6]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>BWert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateB_Wert_Type_Pattern(BigInteger b_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.BWERT_TYPE, b_Wert_Type, BWERT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedien_Einricht_Oertl_Bez_Type(String bedien_Einricht_Oertl_Bez_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bedien_Einricht_Oertl_Bez_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienplatzbezeichnung_Type(String bedienplatzbezeichnung_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bedienplatzbezeichnung_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienplatznummer_Type(String bedienplatznummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bedienplatznummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBedienraumnummer_Type(String bedienraumnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bedienraumnummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetriebsstellenbezeichner_Type(String betriebsstellenbezeichner_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBetriebsstellenbezeichner_Type_Pattern(betriebsstellenbezeichner_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBetriebsstellenbezeichner_Type_Pattern
	 */
	public static final  PatternMatcher [][] BETRIEBSSTELLENBEZEICHNER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z]{2}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z_0-9]{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Betriebsstellenbezeichner Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetriebsstellenbezeichner_Type_Pattern(String betriebsstellenbezeichner_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.BETRIEBSSTELLENBEZEICHNER_TYPE, betriebsstellenbezeichner_Type, BETRIEBSSTELLENBEZEICHNER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Anrueckabschnitt_Type(String bez_Bed_Anrueckabschnitt_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateZeichenkette_Type_Pattern(bez_Bed_Anrueckabschnitt_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Anzeige_Element_Type(String bez_Bed_Anzeige_Element_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bez_Bed_Anzeige_Element_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBez_Bed_Zentrale_Type(String bez_Bed_Zentrale_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bez_Bed_Zentrale_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezeichnung_BSO_Type(String bezeichnung_BSO_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(bezeichnung_BSO_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDD_Wert_Type(BigInteger dD_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDD_Wert_Type_Pattern(dD_Wert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDD_Wert_Type_Pattern
	 */
	public static final  PatternMatcher [][] DD_WERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|10")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>DD Wert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDD_Wert_Type_Pattern(BigInteger dD_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.DD_WERT_TYPE, dD_Wert_Type, DD_WERT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMAWertObject(ENUMAWert enumaWertObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienEinrichtBauartObject(ENUMBedienEinrichtBauart enumBedienEinrichtBauartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBedienPlatzArtObject(ENUMBedienPlatzArt enumBedienPlatzArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBSOTeilsystemArtObject(ENUMBSOTeilsystemArt enumbsoTeilsystemArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMCWertObject(ENUMCWert enumcWertObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMMelderObject(ENUMMelder enumMelderObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMOberflaecheBildartObject(ENUMOberflaecheBildart enumOberflaecheBildartObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchalterObject(ENUMSchalter enumSchalterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMTasteObject(ENUMTaste enumTasteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMXWertObject(ENUMXWert enumxWertObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHupe_Anschaltzeit_Type(BigDecimal hupe_Anschaltzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHupe_Anschaltzeit_Type_Pattern(hupe_Anschaltzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHupe_Anschaltzeit_Type_Pattern
	 */
	public static final  PatternMatcher [][] HUPE_ANSCHALTZEIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5]")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,5}(\\.[0-9]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hupe Anschaltzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHupe_Anschaltzeit_Type_Pattern(BigDecimal hupe_Anschaltzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.HUPE_ANSCHALTZEIT_TYPE, hupe_Anschaltzeit_Type, HUPE_ANSCHALTZEIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_Type(String iP_Adressblock_Blau_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V4_Type(String iP_Adressblock_Blau_V4_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_V4_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Blau_V6_Type(String iP_Adressblock_Blau_V6_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Blau_V6_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_Type(String iP_Adressblock_Grau_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V4_Type(String iP_Adressblock_Grau_V4_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_V4_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIP_Adressblock_Grau_V6_Type(String iP_Adressblock_Grau_V6_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(iP_Adressblock_Grau_V6_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOberflaeche_Zustaendigkeit_Type(String oberflaeche_Zustaendigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(oberflaeche_Zustaendigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRueckschauzeit_Type(BigDecimal rueckschauzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(rueckschauzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchrankreihe_Type(String schrankreihe_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(schrankreihe_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteuerbezirksname_Type(String steuerbezirksname_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(steuerbezirksname_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteuerbezirksnummer_Type(String steuerbezirksnummer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateText_Type_Pattern(steuerbezirksnummer_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorschauzeit_Type(BigDecimal vorschauzeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateSekunde_Type_Pattern(vorschauzeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateY_Wert_Type(BigInteger y_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateY_Wert_Type_Pattern(y_Wert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateY_Wert_Type_Pattern
	 */
	public static final  PatternMatcher [][] YWERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>YWert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateY_Wert_Type_Pattern(BigInteger y_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.YWERT_TYPE, y_Wert_Type, YWERT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYY_Wert_Type(BigInteger yY_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYY_Wert_Type_Pattern(yY_Wert_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateYY_Wert_Type_Pattern
	 */
	public static final  PatternMatcher [][] YY_WERT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9]|1[0-5]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>YY Wert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYY_Wert_Type_Pattern(BigInteger yY_Wert_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BedienungPackage.Literals.YY_WERT_TYPE, yY_Wert_Type, YY_WERT_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //BedienungValidator
