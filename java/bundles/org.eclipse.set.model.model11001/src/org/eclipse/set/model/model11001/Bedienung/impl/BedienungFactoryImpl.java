/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

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

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.Bedienung.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BedienungFactoryImpl extends EFactoryImpl implements BedienungFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BedienungFactory init() {
		try {
			BedienungFactory theBedienungFactory = (BedienungFactory)EPackage.Registry.INSTANCE.getEFactory(BedienungPackage.eNS_URI);
			if (theBedienungFactory != null) {
				return theBedienungFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BedienungFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedienungFactoryImpl() {
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
			case BedienungPackage.AWERT_TYPE_CLASS: return createA_Wert_TypeClass();
			case BedienungPackage.ANBINDUNG_IB2_TYPE_CLASS: return createAnbindung_IB2_TypeClass();
			case BedienungPackage.ANBINDUNG_IB3_TYPE_CLASS: return createAnbindung_IB3_TypeClass();
			case BedienungPackage.BWERT_TYPE_CLASS: return createB_Wert_TypeClass();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT: return createBedien_Anrueckabschnitt();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT: return createBedien_Anzeige_Element();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP: return createBedien_Anzeige_Element_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBedien_Anzeige_Element_Bezeichnung_AttributeGroup();
			case BedienungPackage.BEDIEN_BEZIRK: return createBedien_Bezirk();
			case BedienungPackage.BEDIEN_BEZIRK_ADRESSFORMEL_ATTRIBUTE_GROUP: return createBedien_Bezirk_Adressformel_AttributeGroup();
			case BedienungPackage.BEDIEN_BEZIRK_ALLG_ATTRIBUTE_GROUP: return createBedien_Bezirk_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP: return createBedien_Bezirk_Anhaenge_AttributeGroup();
			case BedienungPackage.BEDIEN_EINRICHT_BAUART_TYPE_CLASS: return createBedien_Einricht_Bauart_TypeClass();
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE_CLASS: return createBedien_Einricht_Oertl_Bez_TypeClass();
			case BedienungPackage.BEDIEN_EINRICHT_OERTLICH_ALLG_ATTRIBUTE_GROUP: return createBedien_Einricht_Oertlich_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH: return createBedien_Einrichtung_Oertlich();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup();
			case BedienungPackage.BEDIEN_GBT: return createBedien_GBT();
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP: return createBedien_GBT_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_OBERFLAECHE: return createBedien_Oberflaeche();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP: return createBedien_Oberflaeche_Anhaenge_AttributeGroup();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD: return createBedien_Oberflaeche_Bild();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD_ALLG_ATTRIBUTE_GROUP: return createBedien_Oberflaeche_Bild_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_OERTLICHKEIT: return createBedien_Oertlichkeit();
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP: return createBedien_Oertlichkeit_Kennzahlen_AttributeGroup();
			case BedienungPackage.BEDIEN_PLATZ: return createBedien_Platz();
			case BedienungPackage.BEDIEN_PLATZ_ALLG_ATTRIBUTE_GROUP: return createBedien_Platz_Allg_AttributeGroup();
			case BedienungPackage.BEDIEN_PLATZ_ART_TYPE_CLASS: return createBedien_Platz_Art_TypeClass();
			case BedienungPackage.BEDIEN_STANDORT: return createBedien_Standort();
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBedien_Standort_Bezeichnung_AttributeGroup();
			case BedienungPackage.BEDIEN_ZENTRALE: return createBedien_Zentrale();
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createBedien_Zentrale_Bezeichnung_AttributeGroup();
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE_CLASS: return createBedienplatzbezeichnung_TypeClass();
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE_CLASS: return createBedienplatznummer_TypeClass();
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE_CLASS: return createBedienraumnummer_TypeClass();
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE_CLASS: return createBetriebsstellenbezeichner_TypeClass();
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE_CLASS: return createBez_Bed_Anrueckabschnitt_TypeClass();
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE_CLASS: return createBez_Bed_Anzeige_Element_TypeClass();
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE_CLASS: return createBez_Bed_Zentrale_TypeClass();
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE_CLASS: return createBezeichnung_BSO_TypeClass();
			case BedienungPackage.BSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP: return createBSO_IP_AB_Teilsystem_AttributeGroup();
			case BedienungPackage.BSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: return createBSO_IP_Adressblock_AttributeGroup();
			case BedienungPackage.BSO_TEILSYSTEM_ART_TYPE_CLASS: return createBSO_Teilsystem_Art_TypeClass();
			case BedienungPackage.CWERT_TYPE_CLASS: return createC_Wert_TypeClass();
			case BedienungPackage.DD_WERT_TYPE_CLASS: return createDD_Wert_TypeClass();
			case BedienungPackage.HERSTELLER_TYPE_CLASS: return createHersteller_TypeClass();
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE_CLASS: return createHupe_Anschaltzeit_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS: return createIP_Adressblock_Blau_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS: return createIP_Adressblock_Blau_V4_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS: return createIP_Adressblock_Blau_V6_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS: return createIP_Adressblock_Grau_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS: return createIP_Adressblock_Grau_V4_TypeClass();
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS: return createIP_Adressblock_Grau_V6_TypeClass();
			case BedienungPackage.KENNZAHL_TYPE_CLASS: return createKennzahl_TypeClass();
			case BedienungPackage.MELDER_TYPE_CLASS: return createMelder_TypeClass();
			case BedienungPackage.OBERFLAECHE_BILDART_TYPE_CLASS: return createOberflaeche_Bildart_TypeClass();
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE_CLASS: return createOberflaeche_Zustaendigkeit_TypeClass();
			case BedienungPackage.REGIONALBEREICH_TYPE_CLASS: return createRegionalbereich_TypeClass();
			case BedienungPackage.RUECKSCHAUZEIT_TYPE_CLASS: return createRueckschauzeit_TypeClass();
			case BedienungPackage.SCHALTER_TYPE_CLASS: return createSchalter_TypeClass();
			case BedienungPackage.SCHRANKREIHE_TYPE_CLASS: return createSchrankreihe_TypeClass();
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE_CLASS: return createSteuerbezirksname_TypeClass();
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE_CLASS: return createSteuerbezirksnummer_TypeClass();
			case BedienungPackage.TASTE_TYPE_CLASS: return createTaste_TypeClass();
			case BedienungPackage.VORSCHAUZEIT_TYPE_CLASS: return createVorschauzeit_TypeClass();
			case BedienungPackage.XWERT_TYPE_CLASS: return createX_Wert_TypeClass();
			case BedienungPackage.YWERT_TYPE_CLASS: return createY_Wert_TypeClass();
			case BedienungPackage.YY_WERT_TYPE_CLASS: return createYY_Wert_TypeClass();
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
			case BedienungPackage.ENUMA_WERT:
				return createENUMAWertFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART:
				return createENUMBedienEinrichtBauartFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART:
				return createENUMBedienPlatzArtFromString(eDataType, initialValue);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART:
				return createENUMBSOTeilsystemArtFromString(eDataType, initialValue);
			case BedienungPackage.ENUMC_WERT:
				return createENUMCWertFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_MELDER:
				return createENUMMelderFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART:
				return createENUMOberflaecheBildartFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_SCHALTER:
				return createENUMSchalterFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_TASTE:
				return createENUMTasteFromString(eDataType, initialValue);
			case BedienungPackage.ENUMX_WERT:
				return createENUMXWertFromString(eDataType, initialValue);
			case BedienungPackage.BWERT_TYPE:
				return createB_Wert_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE:
				return createBedien_Einricht_Oertl_Bez_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE:
				return createBedienplatzbezeichnung_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE:
				return createBedienplatznummer_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE:
				return createBedienraumnummer_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE:
				return createBetriebsstellenbezeichner_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE:
				return createBez_Bed_Anrueckabschnitt_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE:
				return createBez_Bed_Anzeige_Element_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE:
				return createBez_Bed_Zentrale_TypeFromString(eDataType, initialValue);
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE:
				return createBezeichnung_BSO_TypeFromString(eDataType, initialValue);
			case BedienungPackage.DD_WERT_TYPE:
				return createDD_Wert_TypeFromString(eDataType, initialValue);
			case BedienungPackage.ENUMA_WERT_OBJECT:
				return createENUMAWertObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART_OBJECT:
				return createENUMBedienEinrichtBauartObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART_OBJECT:
				return createENUMBedienPlatzArtObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART_OBJECT:
				return createENUMBSOTeilsystemArtObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUMC_WERT_OBJECT:
				return createENUMCWertObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_MELDER_OBJECT:
				return createENUMMelderObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART_OBJECT:
				return createENUMOberflaecheBildartObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_SCHALTER_OBJECT:
				return createENUMSchalterObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUM_TASTE_OBJECT:
				return createENUMTasteObjectFromString(eDataType, initialValue);
			case BedienungPackage.ENUMX_WERT_OBJECT:
				return createENUMXWertObjectFromString(eDataType, initialValue);
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE:
				return createHupe_Anschaltzeit_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return createIP_Adressblock_Blau_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return createIP_Adressblock_Blau_V4_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return createIP_Adressblock_Blau_V6_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return createIP_Adressblock_Grau_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return createIP_Adressblock_Grau_V4_TypeFromString(eDataType, initialValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return createIP_Adressblock_Grau_V6_TypeFromString(eDataType, initialValue);
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE:
				return createOberflaeche_Zustaendigkeit_TypeFromString(eDataType, initialValue);
			case BedienungPackage.RUECKSCHAUZEIT_TYPE:
				return createRueckschauzeit_TypeFromString(eDataType, initialValue);
			case BedienungPackage.SCHRANKREIHE_TYPE:
				return createSchrankreihe_TypeFromString(eDataType, initialValue);
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE:
				return createSteuerbezirksname_TypeFromString(eDataType, initialValue);
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE:
				return createSteuerbezirksnummer_TypeFromString(eDataType, initialValue);
			case BedienungPackage.VORSCHAUZEIT_TYPE:
				return createVorschauzeit_TypeFromString(eDataType, initialValue);
			case BedienungPackage.YWERT_TYPE:
				return createY_Wert_TypeFromString(eDataType, initialValue);
			case BedienungPackage.YY_WERT_TYPE:
				return createYY_Wert_TypeFromString(eDataType, initialValue);
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
			case BedienungPackage.ENUMA_WERT:
				return convertENUMAWertToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART:
				return convertENUMBedienEinrichtBauartToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART:
				return convertENUMBedienPlatzArtToString(eDataType, instanceValue);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART:
				return convertENUMBSOTeilsystemArtToString(eDataType, instanceValue);
			case BedienungPackage.ENUMC_WERT:
				return convertENUMCWertToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_MELDER:
				return convertENUMMelderToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART:
				return convertENUMOberflaecheBildartToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_SCHALTER:
				return convertENUMSchalterToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_TASTE:
				return convertENUMTasteToString(eDataType, instanceValue);
			case BedienungPackage.ENUMX_WERT:
				return convertENUMXWertToString(eDataType, instanceValue);
			case BedienungPackage.BWERT_TYPE:
				return convertB_Wert_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEDIEN_EINRICHT_OERTL_BEZ_TYPE:
				return convertBedien_Einricht_Oertl_Bez_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEDIENPLATZBEZEICHNUNG_TYPE:
				return convertBedienplatzbezeichnung_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEDIENPLATZNUMMER_TYPE:
				return convertBedienplatznummer_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEDIENRAUMNUMMER_TYPE:
				return convertBedienraumnummer_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BETRIEBSSTELLENBEZEICHNER_TYPE:
				return convertBetriebsstellenbezeichner_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEZ_BED_ANRUECKABSCHNITT_TYPE:
				return convertBez_Bed_Anrueckabschnitt_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEZ_BED_ANZEIGE_ELEMENT_TYPE:
				return convertBez_Bed_Anzeige_Element_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEZ_BED_ZENTRALE_TYPE:
				return convertBez_Bed_Zentrale_TypeToString(eDataType, instanceValue);
			case BedienungPackage.BEZEICHNUNG_BSO_TYPE:
				return convertBezeichnung_BSO_TypeToString(eDataType, instanceValue);
			case BedienungPackage.DD_WERT_TYPE:
				return convertDD_Wert_TypeToString(eDataType, instanceValue);
			case BedienungPackage.ENUMA_WERT_OBJECT:
				return convertENUMAWertObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_BEDIEN_EINRICHT_BAUART_OBJECT:
				return convertENUMBedienEinrichtBauartObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_BEDIEN_PLATZ_ART_OBJECT:
				return convertENUMBedienPlatzArtObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUMBSO_TEILSYSTEM_ART_OBJECT:
				return convertENUMBSOTeilsystemArtObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUMC_WERT_OBJECT:
				return convertENUMCWertObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_MELDER_OBJECT:
				return convertENUMMelderObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_OBERFLAECHE_BILDART_OBJECT:
				return convertENUMOberflaecheBildartObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_SCHALTER_OBJECT:
				return convertENUMSchalterObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUM_TASTE_OBJECT:
				return convertENUMTasteObjectToString(eDataType, instanceValue);
			case BedienungPackage.ENUMX_WERT_OBJECT:
				return convertENUMXWertObjectToString(eDataType, instanceValue);
			case BedienungPackage.HUPE_ANSCHALTZEIT_TYPE:
				return convertHupe_Anschaltzeit_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return convertIP_Adressblock_Blau_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return convertIP_Adressblock_Blau_V4_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return convertIP_Adressblock_Blau_V6_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return convertIP_Adressblock_Grau_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return convertIP_Adressblock_Grau_V4_TypeToString(eDataType, instanceValue);
			case BedienungPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return convertIP_Adressblock_Grau_V6_TypeToString(eDataType, instanceValue);
			case BedienungPackage.OBERFLAECHE_ZUSTAENDIGKEIT_TYPE:
				return convertOberflaeche_Zustaendigkeit_TypeToString(eDataType, instanceValue);
			case BedienungPackage.RUECKSCHAUZEIT_TYPE:
				return convertRueckschauzeit_TypeToString(eDataType, instanceValue);
			case BedienungPackage.SCHRANKREIHE_TYPE:
				return convertSchrankreihe_TypeToString(eDataType, instanceValue);
			case BedienungPackage.STEUERBEZIRKSNAME_TYPE:
				return convertSteuerbezirksname_TypeToString(eDataType, instanceValue);
			case BedienungPackage.STEUERBEZIRKSNUMMER_TYPE:
				return convertSteuerbezirksnummer_TypeToString(eDataType, instanceValue);
			case BedienungPackage.VORSCHAUZEIT_TYPE:
				return convertVorschauzeit_TypeToString(eDataType, instanceValue);
			case BedienungPackage.YWERT_TYPE:
				return convertY_Wert_TypeToString(eDataType, instanceValue);
			case BedienungPackage.YY_WERT_TYPE:
				return convertYY_Wert_TypeToString(eDataType, instanceValue);
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
	public A_Wert_TypeClass createA_Wert_TypeClass() {
		A_Wert_TypeClassImpl a_Wert_TypeClass = new A_Wert_TypeClassImpl();
		return a_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anbindung_IB2_TypeClass createAnbindung_IB2_TypeClass() {
		Anbindung_IB2_TypeClassImpl anbindung_IB2_TypeClass = new Anbindung_IB2_TypeClassImpl();
		return anbindung_IB2_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anbindung_IB3_TypeClass createAnbindung_IB3_TypeClass() {
		Anbindung_IB3_TypeClassImpl anbindung_IB3_TypeClass = new Anbindung_IB3_TypeClassImpl();
		return anbindung_IB3_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public B_Wert_TypeClass createB_Wert_TypeClass() {
		B_Wert_TypeClassImpl b_Wert_TypeClass = new B_Wert_TypeClassImpl();
		return b_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anrueckabschnitt createBedien_Anrueckabschnitt() {
		Bedien_AnrueckabschnittImpl bedien_Anrueckabschnitt = new Bedien_AnrueckabschnittImpl();
		return bedien_Anrueckabschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup createBedien_Anrueckabschnitt_Bezeichnung_AttributeGroup() {
		Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup = new Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl();
		return bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element createBedien_Anzeige_Element() {
		Bedien_Anzeige_ElementImpl bedien_Anzeige_Element = new Bedien_Anzeige_ElementImpl();
		return bedien_Anzeige_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Allg_AttributeGroup createBedien_Anzeige_Element_Allg_AttributeGroup() {
		Bedien_Anzeige_Element_Allg_AttributeGroupImpl bedien_Anzeige_Element_Allg_AttributeGroup = new Bedien_Anzeige_Element_Allg_AttributeGroupImpl();
		return bedien_Anzeige_Element_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Bezeichnung_AttributeGroup createBedien_Anzeige_Element_Bezeichnung_AttributeGroup() {
		Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl bedien_Anzeige_Element_Bezeichnung_AttributeGroup = new Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl();
		return bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk createBedien_Bezirk() {
		Bedien_BezirkImpl bedien_Bezirk = new Bedien_BezirkImpl();
		return bedien_Bezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Adressformel_AttributeGroup createBedien_Bezirk_Adressformel_AttributeGroup() {
		Bedien_Bezirk_Adressformel_AttributeGroupImpl bedien_Bezirk_Adressformel_AttributeGroup = new Bedien_Bezirk_Adressformel_AttributeGroupImpl();
		return bedien_Bezirk_Adressformel_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Allg_AttributeGroup createBedien_Bezirk_Allg_AttributeGroup() {
		Bedien_Bezirk_Allg_AttributeGroupImpl bedien_Bezirk_Allg_AttributeGroup = new Bedien_Bezirk_Allg_AttributeGroupImpl();
		return bedien_Bezirk_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Anhaenge_AttributeGroup createBedien_Bezirk_Anhaenge_AttributeGroup() {
		Bedien_Bezirk_Anhaenge_AttributeGroupImpl bedien_Bezirk_Anhaenge_AttributeGroup = new Bedien_Bezirk_Anhaenge_AttributeGroupImpl();
		return bedien_Bezirk_Anhaenge_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Bauart_TypeClass createBedien_Einricht_Bauart_TypeClass() {
		Bedien_Einricht_Bauart_TypeClassImpl bedien_Einricht_Bauart_TypeClass = new Bedien_Einricht_Bauart_TypeClassImpl();
		return bedien_Einricht_Bauart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Oertl_Bez_TypeClass createBedien_Einricht_Oertl_Bez_TypeClass() {
		Bedien_Einricht_Oertl_Bez_TypeClassImpl bedien_Einricht_Oertl_Bez_TypeClass = new Bedien_Einricht_Oertl_Bez_TypeClassImpl();
		return bedien_Einricht_Oertl_Bez_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Oertlich_Allg_AttributeGroup createBedien_Einricht_Oertlich_Allg_AttributeGroup() {
		Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl bedien_Einricht_Oertlich_Allg_AttributeGroup = new Bedien_Einricht_Oertlich_Allg_AttributeGroupImpl();
		return bedien_Einricht_Oertlich_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einrichtung_Oertlich createBedien_Einrichtung_Oertlich() {
		Bedien_Einrichtung_OertlichImpl bedien_Einrichtung_Oertlich = new Bedien_Einrichtung_OertlichImpl();
		return bedien_Einrichtung_Oertlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup createBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup() {
		Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup = new Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl();
		return bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_GBT createBedien_GBT() {
		Bedien_GBTImpl bedien_GBT = new Bedien_GBTImpl();
		return bedien_GBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_GBT_Allg_AttributeGroup createBedien_GBT_Allg_AttributeGroup() {
		Bedien_GBT_Allg_AttributeGroupImpl bedien_GBT_Allg_AttributeGroup = new Bedien_GBT_Allg_AttributeGroupImpl();
		return bedien_GBT_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche createBedien_Oberflaeche() {
		Bedien_OberflaecheImpl bedien_Oberflaeche = new Bedien_OberflaecheImpl();
		return bedien_Oberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Anhaenge_AttributeGroup createBedien_Oberflaeche_Anhaenge_AttributeGroup() {
		Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl bedien_Oberflaeche_Anhaenge_AttributeGroup = new Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl();
		return bedien_Oberflaeche_Anhaenge_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Bild createBedien_Oberflaeche_Bild() {
		Bedien_Oberflaeche_BildImpl bedien_Oberflaeche_Bild = new Bedien_Oberflaeche_BildImpl();
		return bedien_Oberflaeche_Bild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Bild_Allg_AttributeGroup createBedien_Oberflaeche_Bild_Allg_AttributeGroup() {
		Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl bedien_Oberflaeche_Bild_Allg_AttributeGroup = new Bedien_Oberflaeche_Bild_Allg_AttributeGroupImpl();
		return bedien_Oberflaeche_Bild_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oertlichkeit createBedien_Oertlichkeit() {
		Bedien_OertlichkeitImpl bedien_Oertlichkeit = new Bedien_OertlichkeitImpl();
		return bedien_Oertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oertlichkeit_Kennzahlen_AttributeGroup createBedien_Oertlichkeit_Kennzahlen_AttributeGroup() {
		Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl bedien_Oertlichkeit_Kennzahlen_AttributeGroup = new Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl();
		return bedien_Oertlichkeit_Kennzahlen_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz createBedien_Platz() {
		Bedien_PlatzImpl bedien_Platz = new Bedien_PlatzImpl();
		return bedien_Platz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz_Allg_AttributeGroup createBedien_Platz_Allg_AttributeGroup() {
		Bedien_Platz_Allg_AttributeGroupImpl bedien_Platz_Allg_AttributeGroup = new Bedien_Platz_Allg_AttributeGroupImpl();
		return bedien_Platz_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz_Art_TypeClass createBedien_Platz_Art_TypeClass() {
		Bedien_Platz_Art_TypeClassImpl bedien_Platz_Art_TypeClass = new Bedien_Platz_Art_TypeClassImpl();
		return bedien_Platz_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Standort createBedien_Standort() {
		Bedien_StandortImpl bedien_Standort = new Bedien_StandortImpl();
		return bedien_Standort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Standort_Bezeichnung_AttributeGroup createBedien_Standort_Bezeichnung_AttributeGroup() {
		Bedien_Standort_Bezeichnung_AttributeGroupImpl bedien_Standort_Bezeichnung_AttributeGroup = new Bedien_Standort_Bezeichnung_AttributeGroupImpl();
		return bedien_Standort_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Zentrale createBedien_Zentrale() {
		Bedien_ZentraleImpl bedien_Zentrale = new Bedien_ZentraleImpl();
		return bedien_Zentrale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Zentrale_Bezeichnung_AttributeGroup createBedien_Zentrale_Bezeichnung_AttributeGroup() {
		Bedien_Zentrale_Bezeichnung_AttributeGroupImpl bedien_Zentrale_Bezeichnung_AttributeGroup = new Bedien_Zentrale_Bezeichnung_AttributeGroupImpl();
		return bedien_Zentrale_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienplatzbezeichnung_TypeClass createBedienplatzbezeichnung_TypeClass() {
		Bedienplatzbezeichnung_TypeClassImpl bedienplatzbezeichnung_TypeClass = new Bedienplatzbezeichnung_TypeClassImpl();
		return bedienplatzbezeichnung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienplatznummer_TypeClass createBedienplatznummer_TypeClass() {
		Bedienplatznummer_TypeClassImpl bedienplatznummer_TypeClass = new Bedienplatznummer_TypeClassImpl();
		return bedienplatznummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienraumnummer_TypeClass createBedienraumnummer_TypeClass() {
		Bedienraumnummer_TypeClassImpl bedienraumnummer_TypeClass = new Bedienraumnummer_TypeClassImpl();
		return bedienraumnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betriebsstellenbezeichner_TypeClass createBetriebsstellenbezeichner_TypeClass() {
		Betriebsstellenbezeichner_TypeClassImpl betriebsstellenbezeichner_TypeClass = new Betriebsstellenbezeichner_TypeClassImpl();
		return betriebsstellenbezeichner_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Anrueckabschnitt_TypeClass createBez_Bed_Anrueckabschnitt_TypeClass() {
		Bez_Bed_Anrueckabschnitt_TypeClassImpl bez_Bed_Anrueckabschnitt_TypeClass = new Bez_Bed_Anrueckabschnitt_TypeClassImpl();
		return bez_Bed_Anrueckabschnitt_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Anzeige_Element_TypeClass createBez_Bed_Anzeige_Element_TypeClass() {
		Bez_Bed_Anzeige_Element_TypeClassImpl bez_Bed_Anzeige_Element_TypeClass = new Bez_Bed_Anzeige_Element_TypeClassImpl();
		return bez_Bed_Anzeige_Element_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Zentrale_TypeClass createBez_Bed_Zentrale_TypeClass() {
		Bez_Bed_Zentrale_TypeClassImpl bez_Bed_Zentrale_TypeClass = new Bez_Bed_Zentrale_TypeClassImpl();
		return bez_Bed_Zentrale_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_BSO_TypeClass createBezeichnung_BSO_TypeClass() {
		Bezeichnung_BSO_TypeClassImpl bezeichnung_BSO_TypeClass = new Bezeichnung_BSO_TypeClassImpl();
		return bezeichnung_BSO_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSO_IP_AB_Teilsystem_AttributeGroup createBSO_IP_AB_Teilsystem_AttributeGroup() {
		BSO_IP_AB_Teilsystem_AttributeGroupImpl bsO_IP_AB_Teilsystem_AttributeGroup = new BSO_IP_AB_Teilsystem_AttributeGroupImpl();
		return bsO_IP_AB_Teilsystem_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSO_IP_Adressblock_AttributeGroup createBSO_IP_Adressblock_AttributeGroup() {
		BSO_IP_Adressblock_AttributeGroupImpl bsO_IP_Adressblock_AttributeGroup = new BSO_IP_Adressblock_AttributeGroupImpl();
		return bsO_IP_Adressblock_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSO_Teilsystem_Art_TypeClass createBSO_Teilsystem_Art_TypeClass() {
		BSO_Teilsystem_Art_TypeClassImpl bsO_Teilsystem_Art_TypeClass = new BSO_Teilsystem_Art_TypeClassImpl();
		return bsO_Teilsystem_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C_Wert_TypeClass createC_Wert_TypeClass() {
		C_Wert_TypeClassImpl c_Wert_TypeClass = new C_Wert_TypeClassImpl();
		return c_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DD_Wert_TypeClass createDD_Wert_TypeClass() {
		DD_Wert_TypeClassImpl dD_Wert_TypeClass = new DD_Wert_TypeClassImpl();
		return dD_Wert_TypeClass;
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
	public Hupe_Anschaltzeit_TypeClass createHupe_Anschaltzeit_TypeClass() {
		Hupe_Anschaltzeit_TypeClassImpl hupe_Anschaltzeit_TypeClass = new Hupe_Anschaltzeit_TypeClassImpl();
		return hupe_Anschaltzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_TypeClass createIP_Adressblock_Blau_TypeClass() {
		IP_Adressblock_Blau_TypeClassImpl iP_Adressblock_Blau_TypeClass = new IP_Adressblock_Blau_TypeClassImpl();
		return iP_Adressblock_Blau_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_V4_TypeClass createIP_Adressblock_Blau_V4_TypeClass() {
		IP_Adressblock_Blau_V4_TypeClassImpl iP_Adressblock_Blau_V4_TypeClass = new IP_Adressblock_Blau_V4_TypeClassImpl();
		return iP_Adressblock_Blau_V4_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Blau_V6_TypeClass createIP_Adressblock_Blau_V6_TypeClass() {
		IP_Adressblock_Blau_V6_TypeClassImpl iP_Adressblock_Blau_V6_TypeClass = new IP_Adressblock_Blau_V6_TypeClassImpl();
		return iP_Adressblock_Blau_V6_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_TypeClass createIP_Adressblock_Grau_TypeClass() {
		IP_Adressblock_Grau_TypeClassImpl iP_Adressblock_Grau_TypeClass = new IP_Adressblock_Grau_TypeClassImpl();
		return iP_Adressblock_Grau_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_V4_TypeClass createIP_Adressblock_Grau_V4_TypeClass() {
		IP_Adressblock_Grau_V4_TypeClassImpl iP_Adressblock_Grau_V4_TypeClass = new IP_Adressblock_Grau_V4_TypeClassImpl();
		return iP_Adressblock_Grau_V4_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adressblock_Grau_V6_TypeClass createIP_Adressblock_Grau_V6_TypeClass() {
		IP_Adressblock_Grau_V6_TypeClassImpl iP_Adressblock_Grau_V6_TypeClass = new IP_Adressblock_Grau_V6_TypeClassImpl();
		return iP_Adressblock_Grau_V6_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kennzahl_TypeClass createKennzahl_TypeClass() {
		Kennzahl_TypeClassImpl kennzahl_TypeClass = new Kennzahl_TypeClassImpl();
		return kennzahl_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Melder_TypeClass createMelder_TypeClass() {
		Melder_TypeClassImpl melder_TypeClass = new Melder_TypeClassImpl();
		return melder_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberflaeche_Bildart_TypeClass createOberflaeche_Bildart_TypeClass() {
		Oberflaeche_Bildart_TypeClassImpl oberflaeche_Bildart_TypeClass = new Oberflaeche_Bildart_TypeClassImpl();
		return oberflaeche_Bildart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oberflaeche_Zustaendigkeit_TypeClass createOberflaeche_Zustaendigkeit_TypeClass() {
		Oberflaeche_Zustaendigkeit_TypeClassImpl oberflaeche_Zustaendigkeit_TypeClass = new Oberflaeche_Zustaendigkeit_TypeClassImpl();
		return oberflaeche_Zustaendigkeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regionalbereich_TypeClass createRegionalbereich_TypeClass() {
		Regionalbereich_TypeClassImpl regionalbereich_TypeClass = new Regionalbereich_TypeClassImpl();
		return regionalbereich_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rueckschauzeit_TypeClass createRueckschauzeit_TypeClass() {
		Rueckschauzeit_TypeClassImpl rueckschauzeit_TypeClass = new Rueckschauzeit_TypeClassImpl();
		return rueckschauzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schalter_TypeClass createSchalter_TypeClass() {
		Schalter_TypeClassImpl schalter_TypeClass = new Schalter_TypeClassImpl();
		return schalter_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankreihe_TypeClass createSchrankreihe_TypeClass() {
		Schrankreihe_TypeClassImpl schrankreihe_TypeClass = new Schrankreihe_TypeClassImpl();
		return schrankreihe_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Steuerbezirksname_TypeClass createSteuerbezirksname_TypeClass() {
		Steuerbezirksname_TypeClassImpl steuerbezirksname_TypeClass = new Steuerbezirksname_TypeClassImpl();
		return steuerbezirksname_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Steuerbezirksnummer_TypeClass createSteuerbezirksnummer_TypeClass() {
		Steuerbezirksnummer_TypeClassImpl steuerbezirksnummer_TypeClass = new Steuerbezirksnummer_TypeClassImpl();
		return steuerbezirksnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_TypeClass createTaste_TypeClass() {
		Taste_TypeClassImpl taste_TypeClass = new Taste_TypeClassImpl();
		return taste_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorschauzeit_TypeClass createVorschauzeit_TypeClass() {
		Vorschauzeit_TypeClassImpl vorschauzeit_TypeClass = new Vorschauzeit_TypeClassImpl();
		return vorschauzeit_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X_Wert_TypeClass createX_Wert_TypeClass() {
		X_Wert_TypeClassImpl x_Wert_TypeClass = new X_Wert_TypeClassImpl();
		return x_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Y_Wert_TypeClass createY_Wert_TypeClass() {
		Y_Wert_TypeClassImpl y_Wert_TypeClass = new Y_Wert_TypeClassImpl();
		return y_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YY_Wert_TypeClass createYY_Wert_TypeClass() {
		YY_Wert_TypeClassImpl yY_Wert_TypeClass = new YY_Wert_TypeClassImpl();
		return yY_Wert_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAWert createENUMAWertFromString(EDataType eDataType, String initialValue) {
		ENUMAWert result = ENUMAWert.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAWertToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienEinrichtBauart createENUMBedienEinrichtBauartFromString(EDataType eDataType, String initialValue) {
		ENUMBedienEinrichtBauart result = ENUMBedienEinrichtBauart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienEinrichtBauartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienPlatzArt createENUMBedienPlatzArtFromString(EDataType eDataType, String initialValue) {
		ENUMBedienPlatzArt result = ENUMBedienPlatzArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienPlatzArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBSOTeilsystemArt createENUMBSOTeilsystemArtFromString(EDataType eDataType, String initialValue) {
		ENUMBSOTeilsystemArt result = ENUMBSOTeilsystemArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBSOTeilsystemArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMCWert createENUMCWertFromString(EDataType eDataType, String initialValue) {
		ENUMCWert result = ENUMCWert.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMCWertToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMelder createENUMMelderFromString(EDataType eDataType, String initialValue) {
		ENUMMelder result = ENUMMelder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMelderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOberflaecheBildart createENUMOberflaecheBildartFromString(EDataType eDataType, String initialValue) {
		ENUMOberflaecheBildart result = ENUMOberflaecheBildart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOberflaecheBildartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchalter createENUMSchalterFromString(EDataType eDataType, String initialValue) {
		ENUMSchalter result = ENUMSchalter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchalterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTaste createENUMTasteFromString(EDataType eDataType, String initialValue) {
		ENUMTaste result = ENUMTaste.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTasteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMXWert createENUMXWertFromString(EDataType eDataType, String initialValue) {
		ENUMXWert result = ENUMXWert.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMXWertToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createB_Wert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertB_Wert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBedien_Einricht_Oertl_Bez_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedien_Einricht_Oertl_Bez_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBedienplatzbezeichnung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedienplatzbezeichnung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBedienplatznummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedienplatznummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBedienraumnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedienraumnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBetriebsstellenbezeichner_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBetriebsstellenbezeichner_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Bed_Anrueckabschnitt_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Bed_Anrueckabschnitt_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Bed_Anzeige_Element_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Bed_Anzeige_Element_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBez_Bed_Zentrale_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBez_Bed_Zentrale_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_BSO_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_BSO_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDD_Wert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDD_Wert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAWert createENUMAWertObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAWertFromString(BedienungPackage.Literals.ENUMA_WERT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAWertObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAWertToString(BedienungPackage.Literals.ENUMA_WERT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienEinrichtBauart createENUMBedienEinrichtBauartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBedienEinrichtBauartFromString(BedienungPackage.Literals.ENUM_BEDIEN_EINRICHT_BAUART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienEinrichtBauartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBedienEinrichtBauartToString(BedienungPackage.Literals.ENUM_BEDIEN_EINRICHT_BAUART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBedienPlatzArt createENUMBedienPlatzArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBedienPlatzArtFromString(BedienungPackage.Literals.ENUM_BEDIEN_PLATZ_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBedienPlatzArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBedienPlatzArtToString(BedienungPackage.Literals.ENUM_BEDIEN_PLATZ_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBSOTeilsystemArt createENUMBSOTeilsystemArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBSOTeilsystemArtFromString(BedienungPackage.Literals.ENUMBSO_TEILSYSTEM_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBSOTeilsystemArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBSOTeilsystemArtToString(BedienungPackage.Literals.ENUMBSO_TEILSYSTEM_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMCWert createENUMCWertObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMCWertFromString(BedienungPackage.Literals.ENUMC_WERT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMCWertObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMCWertToString(BedienungPackage.Literals.ENUMC_WERT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMelder createENUMMelderObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMelderFromString(BedienungPackage.Literals.ENUM_MELDER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMelderObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMelderToString(BedienungPackage.Literals.ENUM_MELDER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMOberflaecheBildart createENUMOberflaecheBildartObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMOberflaecheBildartFromString(BedienungPackage.Literals.ENUM_OBERFLAECHE_BILDART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMOberflaecheBildartObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMOberflaecheBildartToString(BedienungPackage.Literals.ENUM_OBERFLAECHE_BILDART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSchalter createENUMSchalterObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSchalterFromString(BedienungPackage.Literals.ENUM_SCHALTER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSchalterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSchalterToString(BedienungPackage.Literals.ENUM_SCHALTER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTaste createENUMTasteObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTasteFromString(BedienungPackage.Literals.ENUM_TASTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTasteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTasteToString(BedienungPackage.Literals.ENUM_TASTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMXWert createENUMXWertObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMXWertFromString(BedienungPackage.Literals.ENUMX_WERT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMXWertObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMXWertToString(BedienungPackage.Literals.ENUMX_WERT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createHupe_Anschaltzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHupe_Anschaltzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Blau_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Blau_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Blau_V4_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Blau_V4_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Blau_V6_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Blau_V6_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Grau_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Grau_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Grau_V4_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Grau_V4_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adressblock_Grau_V6_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adressblock_Grau_V6_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOberflaeche_Zustaendigkeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOberflaeche_Zustaendigkeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRueckschauzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRueckschauzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSchrankreihe_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchrankreihe_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSteuerbezirksname_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteuerbezirksname_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSteuerbezirksnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteuerbezirksnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createVorschauzeit_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVorschauzeit_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createY_Wert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertY_Wert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createYY_Wert_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYY_Wert_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BedienungPackage getBedienungPackage() {
		return (BedienungPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BedienungPackage getPackage() {
		return BedienungPackage.eINSTANCE;
	}

} //BedienungFactoryImpl
