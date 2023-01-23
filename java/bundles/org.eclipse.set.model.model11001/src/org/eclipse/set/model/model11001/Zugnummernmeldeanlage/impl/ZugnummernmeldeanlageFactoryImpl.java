/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl;

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

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZugnummernmeldeanlageFactoryImpl extends EFactoryImpl implements ZugnummernmeldeanlageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZugnummernmeldeanlageFactory init() {
		try {
			ZugnummernmeldeanlageFactory theZugnummernmeldeanlageFactory = (ZugnummernmeldeanlageFactory)EPackage.Registry.INSTANCE.getEFactory(ZugnummernmeldeanlagePackage.eNS_URI);
			if (theZugnummernmeldeanlageFactory != null) {
				return theZugnummernmeldeanlageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZugnummernmeldeanlageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZugnummernmeldeanlageFactoryImpl() {
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
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_ANB_ANN_TYPE_CLASS: return createAkustikdauer_Anb_Ann_TypeClass();
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_SONST_TYPE_CLASS: return createAkustikdauer_Sonst_TypeClass();
			case ZugnummernmeldeanlagePackage.AKUSTIKDAUER_VORANZ_TYPE_CLASS: return createAkustikdauer_Voranz_TypeClass();
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE_CLASS: return createAnschlussnummer_TypeClass();
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_GEGENGLEIS_TYPE_CLASS: return createAusfahrdruck_Gegengleis_TypeClass();
			case ZugnummernmeldeanlagePackage.AUSFAHRDRUCK_TYPE_CLASS: return createAusfahrdruck_TypeClass();
			case ZugnummernmeldeanlagePackage.BEDIENBARKEIT_ANZEIGEFELD_TYPE_CLASS: return createBedienbarkeit_Anzeigefeld_TypeClass();
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE_CLASS: return createBesonderes_Schaltkriterium_TypeClass();
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE_CLASS: return createBezeichnung_Besondere_Anlage_TypeClass();
			case ZugnummernmeldeanlagePackage.BF_KENNUNG_TYPE_CLASS: return createBf_Kennung_TypeClass();
			case ZugnummernmeldeanlagePackage.BF_NR_ANB_TYPE_CLASS: return createBf_Nr_ANB_TypeClass();
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE_CLASS: return createBf_Nr_TypeClass();
			case ZugnummernmeldeanlagePackage.BF_NR_ZN_ATYPE_CLASS: return createBf_Nr_ZN_A_TypeClass();
			case ZugnummernmeldeanlagePackage.DURCHFAHRDRUCK_TYPE_CLASS: return createDurchfahrdruck_TypeClass();
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_GEGENGLEIS_TYPE_CLASS: return createEinfahrdruck_Gegengleis_TypeClass();
			case ZugnummernmeldeanlagePackage.EINFAHRDRUCK_TYPE_CLASS: return createEinfahrdruck_TypeClass();
			case ZugnummernmeldeanlagePackage.EINWAHLSTELLE_TYPE_CLASS: return createEinwahlstelle_TypeClass();
			case ZugnummernmeldeanlagePackage.FUNKTIONALITAET_ANZEIGEFELD_TYPE_CLASS: return createFunktionalitaet_Anzeigefeld_TypeClass();
			case ZugnummernmeldeanlagePackage.HOA_TYPE_CLASS: return createHOA_TypeClass();
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE_CLASS: return createIP_Adresse_TypeClass();
			case ZugnummernmeldeanlagePackage.KOPPELUNTERSTATION_TYPE_CLASS: return createKoppelunterstation_TypeClass();
			case ZugnummernmeldeanlagePackage.KUS_ZEITTELEGRAMM_TYPE_CLASS: return createKUs_Zeittelegramm_TypeClass();
			case ZugnummernmeldeanlagePackage.MELDEDRUCK_TYPE_CLASS: return createMeldedruck_TypeClass();
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE_CLASS: return createPrioritaet_TypeClass();
			case ZugnummernmeldeanlagePackage.REAKTIVIERUNGSFUNKTION_TYPE_CLASS: return createReaktivierungsfunktion_TypeClass();
			case ZugnummernmeldeanlagePackage.SICHTBARKEIT_ANZEIGEFELD_TYPE_CLASS: return createSichtbarkeit_Anzeigefeld_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_02_TYPE_CLASS: return createTelegramm_02_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_03_TYPE_CLASS: return createTelegramm_03_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_04_TYPE_CLASS: return createTelegramm_04_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_10_TYPE_CLASS: return createTelegramm_10_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_21_TYPE_CLASS: return createTelegramm_21_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_30_TYPE_CLASS: return createTelegramm_30_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP: return createTelegramm_84_Alle_Fstr_AttributeGroup();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP: return createTelegramm_84_Einzelne_Fstr_AttributeGroup();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_FUER_ALLE_FSTR_TYPE_CLASS: return createTelegramm_84_Fuer_Alle_Fstr_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_VERZICHT_TYPE_CLASS: return createTelegramm_84_Verzicht_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP: return createTelegramm_85_Alle_Fstr_AttributeGroup();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP: return createTelegramm_85_Einzelne_Fstr_AttributeGroup();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_FUER_ALLE_FSTR_TYPE_CLASS: return createTelegramm_85_Fuer_Alle_Fstr_TypeClass();
			case ZugnummernmeldeanlagePackage.TELEGRAMMWIEDERHOLUNG_TYPE_CLASS: return createTelegrammwiederholung_TypeClass();
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE_CLASS: return createUnterstation_Max_TypeClass();
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE_CLASS: return createUnterstation_Nr_TypeClass();
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE_CLASS: return createVerzoegerung_Manuell_Loeschung_TypeClass();
			case ZugnummernmeldeanlagePackage.VORMELDESTART_TYPE_CLASS: return createVormeldestart_TypeClass();
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE_CLASS: return createZBS_Adresse_TypeClass();
			case ZugnummernmeldeanlagePackage.ZBS_ANBINDUNG_TYPE_CLASS: return createZBS_Anbindung_TypeClass();
			case ZugnummernmeldeanlagePackage.ZBS_SCHNITTSTELLE_TYPE_CLASS: return createZBS_Schnittstelle_TypeClass();
			case ZugnummernmeldeanlagePackage.ZEITSYNCHRONISATION_FUNKUHR_TYPE_CLASS: return createZeitsynchronisation_Funkuhr_TypeClass();
			case ZugnummernmeldeanlagePackage.ZLV_BUS: return createZLV_Bus();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP: return createZLV_Bus_Allg_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE: return createZLV_Bus_Besondere_Anlage();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP: return createZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP: return createZLV_Bus_Bezeichnung_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE_CLASS: return createZLV_Bus_Nr_TypeClass();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG: return createZLV_Bus_US_Zuordnung();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP: return createZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP: return createZLV_Bus_Zuordnung_Allg_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN: return createZN();
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE_CLASS: return createZN_A_Bedienbezeichner_Frei_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE_CLASS: return createZN_A_Bezeichner_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK: return createZN_Akustik();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP: return createZN_Akustik_Anzeigefeld_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_ALLG_ATTRIBUTE_GROUP: return createZN_Allg_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_ANLAGENTYP_TYPE_CLASS: return createZN_Anlagentyp_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD: return createZN_Anzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP: return createZN_Anzeigefeld_Allg_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP: return createZN_Anzeigefeld_Bezeichnung_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_LOESCHKRITERIUM_TYPE_CLASS: return createZN_Anzeigefeld_Loeschkriterium_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_FELD_OHNE_ANZEIGE_TYPE_CLASS: return createZN_Feld_Ohne_Anzeige_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP: return createZN_Fortschalt_Krit_Druck_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP: return createZN_Fortschalt_Krit_Schalt_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM: return createZN_Fortschalt_Kriterium();
			case ZugnummernmeldeanlagePackage.ZN_MODEM_TYPE_CLASS: return createZN_Modem_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_SCHALTKRITERIUM_TYPE_CLASS: return createZN_Schaltkriterium_TypeClass();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG: return createZN_Telegramm_84_Zuordnung();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG: return createZN_Telegramm_85_Zuordnung();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION: return createZN_Unterstation();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_ALLG_ATTRIBUTE_GROUP: return createZN_Unterstation_Allg_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP: return createZN_Unterstation_Bf_Nr_AttributeGroup();
			case ZugnummernmeldeanlagePackage.ZN_ZBS: return createZN_ZBS();
			case ZugnummernmeldeanlagePackage.ZUGVORBEREITUNGSMELDUNG_TYPE_CLASS: return createZugvorbereitungsmeldung_TypeClass();
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
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN:
				return createENUMAkustikAnbAnnFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST:
				return createENUMAkustikSonstFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG:
				return createENUMBfKennungFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD:
				return createENUMFunktionalitaetAnzeigefeldFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE:
				return createENUMZBSSchnittstelleFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP:
				return createENUMZNAnlagentypFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return createENUMZNAnzeigefeldLoeschkriteriumFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM:
				return createENUMZNModemFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM:
				return createENUMZNSchaltkriteriumFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE:
				return createAnschlussnummer_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE:
				return createBesonderes_Schaltkriterium_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE:
				return createBezeichnung_Besondere_Anlage_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE:
				return createBf_Nr_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN_OBJECT:
				return createENUMAkustikAnbAnnObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST_OBJECT:
				return createENUMAkustikSonstObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG_OBJECT:
				return createENUMBfKennungObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD_OBJECT:
				return createENUMFunktionalitaetAnzeigefeldObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE_OBJECT:
				return createENUMZBSSchnittstelleObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP_OBJECT:
				return createENUMZNAnlagentypObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_OBJECT:
				return createENUMZNAnzeigefeldLoeschkriteriumObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM_OBJECT:
				return createENUMZNModemObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM_OBJECT:
				return createENUMZNSchaltkriteriumObjectFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE:
				return createIP_Adresse_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE:
				return createPrioritaet_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE:
				return createUnterstation_Max_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE:
				return createUnterstation_Nr_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE:
				return createVerzoegerung_Manuell_Loeschung_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE:
				return createZBS_Adresse_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE:
				return createZLV_Bus_Nr_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE:
				return createZN_A_Bedienbezeichner_Frei_TypeFromString(eDataType, initialValue);
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE:
				return createZN_A_Bezeichner_TypeFromString(eDataType, initialValue);
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
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN:
				return convertENUMAkustikAnbAnnToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST:
				return convertENUMAkustikSonstToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG:
				return convertENUMBfKennungToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD:
				return convertENUMFunktionalitaetAnzeigefeldToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE:
				return convertENUMZBSSchnittstelleToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP:
				return convertENUMZNAnlagentypToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM:
				return convertENUMZNAnzeigefeldLoeschkriteriumToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM:
				return convertENUMZNModemToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM:
				return convertENUMZNSchaltkriteriumToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ANSCHLUSSNUMMER_TYPE:
				return convertAnschlussnummer_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.BESONDERES_SCHALTKRITERIUM_TYPE:
				return convertBesonderes_Schaltkriterium_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.BEZEICHNUNG_BESONDERE_ANLAGE_TYPE:
				return convertBezeichnung_Besondere_Anlage_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.BF_NR_TYPE:
				return convertBf_Nr_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_ANB_ANN_OBJECT:
				return convertENUMAkustikAnbAnnObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_AKUSTIK_SONST_OBJECT:
				return convertENUMAkustikSonstObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_BF_KENNUNG_OBJECT:
				return convertENUMBfKennungObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUM_FUNKTIONALITAET_ANZEIGEFELD_OBJECT:
				return convertENUMFunktionalitaetAnzeigefeldObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZBS_SCHNITTSTELLE_OBJECT:
				return convertENUMZBSSchnittstelleObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANLAGENTYP_OBJECT:
				return convertENUMZNAnlagentypObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM_OBJECT:
				return convertENUMZNAnzeigefeldLoeschkriteriumObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_MODEM_OBJECT:
				return convertENUMZNModemObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ENUMZN_SCHALTKRITERIUM_OBJECT:
				return convertENUMZNSchaltkriteriumObjectToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.IP_ADRESSE_TYPE:
				return convertIP_Adresse_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.PRIORITAET_TYPE:
				return convertPrioritaet_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_MAX_TYPE:
				return convertUnterstation_Max_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.UNTERSTATION_NR_TYPE:
				return convertUnterstation_Nr_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.VERZOEGERUNG_MANUELL_LOESCHUNG_TYPE:
				return convertVerzoegerung_Manuell_Loeschung_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ZBS_ADRESSE_TYPE:
				return convertZBS_Adresse_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_NR_TYPE:
				return convertZLV_Bus_Nr_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ZN_ABEDIENBEZEICHNER_FREI_TYPE:
				return convertZN_A_Bedienbezeichner_Frei_TypeToString(eDataType, instanceValue);
			case ZugnummernmeldeanlagePackage.ZN_ABEZEICHNER_TYPE:
				return convertZN_A_Bezeichner_TypeToString(eDataType, instanceValue);
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
	public Akustikdauer_Anb_Ann_TypeClass createAkustikdauer_Anb_Ann_TypeClass() {
		Akustikdauer_Anb_Ann_TypeClassImpl akustikdauer_Anb_Ann_TypeClass = new Akustikdauer_Anb_Ann_TypeClassImpl();
		return akustikdauer_Anb_Ann_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustikdauer_Sonst_TypeClass createAkustikdauer_Sonst_TypeClass() {
		Akustikdauer_Sonst_TypeClassImpl akustikdauer_Sonst_TypeClass = new Akustikdauer_Sonst_TypeClassImpl();
		return akustikdauer_Sonst_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustikdauer_Voranz_TypeClass createAkustikdauer_Voranz_TypeClass() {
		Akustikdauer_Voranz_TypeClassImpl akustikdauer_Voranz_TypeClass = new Akustikdauer_Voranz_TypeClassImpl();
		return akustikdauer_Voranz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anschlussnummer_TypeClass createAnschlussnummer_TypeClass() {
		Anschlussnummer_TypeClassImpl anschlussnummer_TypeClass = new Anschlussnummer_TypeClassImpl();
		return anschlussnummer_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausfahrdruck_Gegengleis_TypeClass createAusfahrdruck_Gegengleis_TypeClass() {
		Ausfahrdruck_Gegengleis_TypeClassImpl ausfahrdruck_Gegengleis_TypeClass = new Ausfahrdruck_Gegengleis_TypeClassImpl();
		return ausfahrdruck_Gegengleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausfahrdruck_TypeClass createAusfahrdruck_TypeClass() {
		Ausfahrdruck_TypeClassImpl ausfahrdruck_TypeClass = new Ausfahrdruck_TypeClassImpl();
		return ausfahrdruck_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienbarkeit_Anzeigefeld_TypeClass createBedienbarkeit_Anzeigefeld_TypeClass() {
		Bedienbarkeit_Anzeigefeld_TypeClassImpl bedienbarkeit_Anzeigefeld_TypeClass = new Bedienbarkeit_Anzeigefeld_TypeClassImpl();
		return bedienbarkeit_Anzeigefeld_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besonderes_Schaltkriterium_TypeClass createBesonderes_Schaltkriterium_TypeClass() {
		Besonderes_Schaltkriterium_TypeClassImpl besonderes_Schaltkriterium_TypeClass = new Besonderes_Schaltkriterium_TypeClassImpl();
		return besonderes_Schaltkriterium_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Besondere_Anlage_TypeClass createBezeichnung_Besondere_Anlage_TypeClass() {
		Bezeichnung_Besondere_Anlage_TypeClassImpl bezeichnung_Besondere_Anlage_TypeClass = new Bezeichnung_Besondere_Anlage_TypeClassImpl();
		return bezeichnung_Besondere_Anlage_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Kennung_TypeClass createBf_Kennung_TypeClass() {
		Bf_Kennung_TypeClassImpl bf_Kennung_TypeClass = new Bf_Kennung_TypeClassImpl();
		return bf_Kennung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_ANB_TypeClass createBf_Nr_ANB_TypeClass() {
		Bf_Nr_ANB_TypeClassImpl bf_Nr_ANB_TypeClass = new Bf_Nr_ANB_TypeClassImpl();
		return bf_Nr_ANB_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_TypeClass createBf_Nr_TypeClass() {
		Bf_Nr_TypeClassImpl bf_Nr_TypeClass = new Bf_Nr_TypeClassImpl();
		return bf_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_ZN_A_TypeClass createBf_Nr_ZN_A_TypeClass() {
		Bf_Nr_ZN_A_TypeClassImpl bf_Nr_ZN_A_TypeClass = new Bf_Nr_ZN_A_TypeClassImpl();
		return bf_Nr_ZN_A_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durchfahrdruck_TypeClass createDurchfahrdruck_TypeClass() {
		Durchfahrdruck_TypeClassImpl durchfahrdruck_TypeClass = new Durchfahrdruck_TypeClassImpl();
		return durchfahrdruck_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einfahrdruck_Gegengleis_TypeClass createEinfahrdruck_Gegengleis_TypeClass() {
		Einfahrdruck_Gegengleis_TypeClassImpl einfahrdruck_Gegengleis_TypeClass = new Einfahrdruck_Gegengleis_TypeClassImpl();
		return einfahrdruck_Gegengleis_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einfahrdruck_TypeClass createEinfahrdruck_TypeClass() {
		Einfahrdruck_TypeClassImpl einfahrdruck_TypeClass = new Einfahrdruck_TypeClassImpl();
		return einfahrdruck_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einwahlstelle_TypeClass createEinwahlstelle_TypeClass() {
		Einwahlstelle_TypeClassImpl einwahlstelle_TypeClass = new Einwahlstelle_TypeClassImpl();
		return einwahlstelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Funktionalitaet_Anzeigefeld_TypeClass createFunktionalitaet_Anzeigefeld_TypeClass() {
		Funktionalitaet_Anzeigefeld_TypeClassImpl funktionalitaet_Anzeigefeld_TypeClass = new Funktionalitaet_Anzeigefeld_TypeClassImpl();
		return funktionalitaet_Anzeigefeld_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HOA_TypeClass createHOA_TypeClass() {
		HOA_TypeClassImpl hoA_TypeClass = new HOA_TypeClassImpl();
		return hoA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IP_Adresse_TypeClass createIP_Adresse_TypeClass() {
		IP_Adresse_TypeClassImpl iP_Adresse_TypeClass = new IP_Adresse_TypeClassImpl();
		return iP_Adresse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koppelunterstation_TypeClass createKoppelunterstation_TypeClass() {
		Koppelunterstation_TypeClassImpl koppelunterstation_TypeClass = new Koppelunterstation_TypeClassImpl();
		return koppelunterstation_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KUs_Zeittelegramm_TypeClass createKUs_Zeittelegramm_TypeClass() {
		KUs_Zeittelegramm_TypeClassImpl kUs_Zeittelegramm_TypeClass = new KUs_Zeittelegramm_TypeClassImpl();
		return kUs_Zeittelegramm_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meldedruck_TypeClass createMeldedruck_TypeClass() {
		Meldedruck_TypeClassImpl meldedruck_TypeClass = new Meldedruck_TypeClassImpl();
		return meldedruck_TypeClass;
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
	public Reaktivierungsfunktion_TypeClass createReaktivierungsfunktion_TypeClass() {
		Reaktivierungsfunktion_TypeClassImpl reaktivierungsfunktion_TypeClass = new Reaktivierungsfunktion_TypeClassImpl();
		return reaktivierungsfunktion_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sichtbarkeit_Anzeigefeld_TypeClass createSichtbarkeit_Anzeigefeld_TypeClass() {
		Sichtbarkeit_Anzeigefeld_TypeClassImpl sichtbarkeit_Anzeigefeld_TypeClass = new Sichtbarkeit_Anzeigefeld_TypeClassImpl();
		return sichtbarkeit_Anzeigefeld_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_02_TypeClass createTelegramm_02_TypeClass() {
		Telegramm_02_TypeClassImpl telegramm_02_TypeClass = new Telegramm_02_TypeClassImpl();
		return telegramm_02_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_03_TypeClass createTelegramm_03_TypeClass() {
		Telegramm_03_TypeClassImpl telegramm_03_TypeClass = new Telegramm_03_TypeClassImpl();
		return telegramm_03_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_04_TypeClass createTelegramm_04_TypeClass() {
		Telegramm_04_TypeClassImpl telegramm_04_TypeClass = new Telegramm_04_TypeClassImpl();
		return telegramm_04_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_10_TypeClass createTelegramm_10_TypeClass() {
		Telegramm_10_TypeClassImpl telegramm_10_TypeClass = new Telegramm_10_TypeClassImpl();
		return telegramm_10_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_21_TypeClass createTelegramm_21_TypeClass() {
		Telegramm_21_TypeClassImpl telegramm_21_TypeClass = new Telegramm_21_TypeClassImpl();
		return telegramm_21_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_30_TypeClass createTelegramm_30_TypeClass() {
		Telegramm_30_TypeClassImpl telegramm_30_TypeClass = new Telegramm_30_TypeClassImpl();
		return telegramm_30_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Alle_Fstr_AttributeGroup createTelegramm_84_Alle_Fstr_AttributeGroup() {
		Telegramm_84_Alle_Fstr_AttributeGroupImpl telegramm_84_Alle_Fstr_AttributeGroup = new Telegramm_84_Alle_Fstr_AttributeGroupImpl();
		return telegramm_84_Alle_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Einzelne_Fstr_AttributeGroup createTelegramm_84_Einzelne_Fstr_AttributeGroup() {
		Telegramm_84_Einzelne_Fstr_AttributeGroupImpl telegramm_84_Einzelne_Fstr_AttributeGroup = new Telegramm_84_Einzelne_Fstr_AttributeGroupImpl();
		return telegramm_84_Einzelne_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Fuer_Alle_Fstr_TypeClass createTelegramm_84_Fuer_Alle_Fstr_TypeClass() {
		Telegramm_84_Fuer_Alle_Fstr_TypeClassImpl telegramm_84_Fuer_Alle_Fstr_TypeClass = new Telegramm_84_Fuer_Alle_Fstr_TypeClassImpl();
		return telegramm_84_Fuer_Alle_Fstr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Verzicht_TypeClass createTelegramm_84_Verzicht_TypeClass() {
		Telegramm_84_Verzicht_TypeClassImpl telegramm_84_Verzicht_TypeClass = new Telegramm_84_Verzicht_TypeClassImpl();
		return telegramm_84_Verzicht_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Alle_Fstr_AttributeGroup createTelegramm_85_Alle_Fstr_AttributeGroup() {
		Telegramm_85_Alle_Fstr_AttributeGroupImpl telegramm_85_Alle_Fstr_AttributeGroup = new Telegramm_85_Alle_Fstr_AttributeGroupImpl();
		return telegramm_85_Alle_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Einzelne_Fstr_AttributeGroup createTelegramm_85_Einzelne_Fstr_AttributeGroup() {
		Telegramm_85_Einzelne_Fstr_AttributeGroupImpl telegramm_85_Einzelne_Fstr_AttributeGroup = new Telegramm_85_Einzelne_Fstr_AttributeGroupImpl();
		return telegramm_85_Einzelne_Fstr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Fuer_Alle_Fstr_TypeClass createTelegramm_85_Fuer_Alle_Fstr_TypeClass() {
		Telegramm_85_Fuer_Alle_Fstr_TypeClassImpl telegramm_85_Fuer_Alle_Fstr_TypeClass = new Telegramm_85_Fuer_Alle_Fstr_TypeClassImpl();
		return telegramm_85_Fuer_Alle_Fstr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegrammwiederholung_TypeClass createTelegrammwiederholung_TypeClass() {
		Telegrammwiederholung_TypeClassImpl telegrammwiederholung_TypeClass = new Telegrammwiederholung_TypeClassImpl();
		return telegrammwiederholung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterstation_Max_TypeClass createUnterstation_Max_TypeClass() {
		Unterstation_Max_TypeClassImpl unterstation_Max_TypeClass = new Unterstation_Max_TypeClassImpl();
		return unterstation_Max_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterstation_Nr_TypeClass createUnterstation_Nr_TypeClass() {
		Unterstation_Nr_TypeClassImpl unterstation_Nr_TypeClass = new Unterstation_Nr_TypeClassImpl();
		return unterstation_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verzoegerung_Manuell_Loeschung_TypeClass createVerzoegerung_Manuell_Loeschung_TypeClass() {
		Verzoegerung_Manuell_Loeschung_TypeClassImpl verzoegerung_Manuell_Loeschung_TypeClass = new Verzoegerung_Manuell_Loeschung_TypeClassImpl();
		return verzoegerung_Manuell_Loeschung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vormeldestart_TypeClass createVormeldestart_TypeClass() {
		Vormeldestart_TypeClassImpl vormeldestart_TypeClass = new Vormeldestart_TypeClassImpl();
		return vormeldestart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Adresse_TypeClass createZBS_Adresse_TypeClass() {
		ZBS_Adresse_TypeClassImpl zbS_Adresse_TypeClass = new ZBS_Adresse_TypeClassImpl();
		return zbS_Adresse_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Anbindung_TypeClass createZBS_Anbindung_TypeClass() {
		ZBS_Anbindung_TypeClassImpl zbS_Anbindung_TypeClass = new ZBS_Anbindung_TypeClassImpl();
		return zbS_Anbindung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schnittstelle_TypeClass createZBS_Schnittstelle_TypeClass() {
		ZBS_Schnittstelle_TypeClassImpl zbS_Schnittstelle_TypeClass = new ZBS_Schnittstelle_TypeClassImpl();
		return zbS_Schnittstelle_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zeitsynchronisation_Funkuhr_TypeClass createZeitsynchronisation_Funkuhr_TypeClass() {
		Zeitsynchronisation_Funkuhr_TypeClassImpl zeitsynchronisation_Funkuhr_TypeClass = new Zeitsynchronisation_Funkuhr_TypeClassImpl();
		return zeitsynchronisation_Funkuhr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus createZLV_Bus() {
		ZLV_BusImpl zlV_Bus = new ZLV_BusImpl();
		return zlV_Bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Allg_AttributeGroup createZLV_Bus_Allg_AttributeGroup() {
		ZLV_Bus_Allg_AttributeGroupImpl zlV_Bus_Allg_AttributeGroup = new ZLV_Bus_Allg_AttributeGroupImpl();
		return zlV_Bus_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Besondere_Anlage createZLV_Bus_Besondere_Anlage() {
		ZLV_Bus_Besondere_AnlageImpl zlV_Bus_Besondere_Anlage = new ZLV_Bus_Besondere_AnlageImpl();
		return zlV_Bus_Besondere_Anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup createZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup() {
		ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupImpl zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup = new ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroupImpl();
		return zlV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Bezeichnung_AttributeGroup createZLV_Bus_Bezeichnung_AttributeGroup() {
		ZLV_Bus_Bezeichnung_AttributeGroupImpl zlV_Bus_Bezeichnung_AttributeGroup = new ZLV_Bus_Bezeichnung_AttributeGroupImpl();
		return zlV_Bus_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Nr_TypeClass createZLV_Bus_Nr_TypeClass() {
		ZLV_Bus_Nr_TypeClassImpl zlV_Bus_Nr_TypeClass = new ZLV_Bus_Nr_TypeClassImpl();
		return zlV_Bus_Nr_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_US_Zuordnung createZLV_Bus_US_Zuordnung() {
		ZLV_Bus_US_ZuordnungImpl zlV_Bus_US_Zuordnung = new ZLV_Bus_US_ZuordnungImpl();
		return zlV_Bus_US_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup createZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup() {
		ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup = new ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl();
		return zlV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Zuordnung_Allg_AttributeGroup createZLV_Bus_Zuordnung_Allg_AttributeGroup() {
		ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl zlV_Bus_Zuordnung_Allg_AttributeGroup = new ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl();
		return zlV_Bus_Zuordnung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN createZN() {
		ZNImpl zn = new ZNImpl();
		return zn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_A_Bedienbezeichner_Frei_TypeClass createZN_A_Bedienbezeichner_Frei_TypeClass() {
		ZN_A_Bedienbezeichner_Frei_TypeClassImpl zN_A_Bedienbezeichner_Frei_TypeClass = new ZN_A_Bedienbezeichner_Frei_TypeClassImpl();
		return zN_A_Bedienbezeichner_Frei_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_A_Bezeichner_TypeClass createZN_A_Bezeichner_TypeClass() {
		ZN_A_Bezeichner_TypeClassImpl zN_A_Bezeichner_TypeClass = new ZN_A_Bezeichner_TypeClassImpl();
		return zN_A_Bezeichner_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Akustik createZN_Akustik() {
		ZN_AkustikImpl zN_Akustik = new ZN_AkustikImpl();
		return zN_Akustik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Akustik_Anzeigefeld_AttributeGroup createZN_Akustik_Anzeigefeld_AttributeGroup() {
		ZN_Akustik_Anzeigefeld_AttributeGroupImpl zN_Akustik_Anzeigefeld_AttributeGroup = new ZN_Akustik_Anzeigefeld_AttributeGroupImpl();
		return zN_Akustik_Anzeigefeld_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Allg_AttributeGroup createZN_Allg_AttributeGroup() {
		ZN_Allg_AttributeGroupImpl zN_Allg_AttributeGroup = new ZN_Allg_AttributeGroupImpl();
		return zN_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anlagentyp_TypeClass createZN_Anlagentyp_TypeClass() {
		ZN_Anlagentyp_TypeClassImpl zN_Anlagentyp_TypeClass = new ZN_Anlagentyp_TypeClassImpl();
		return zN_Anlagentyp_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld createZN_Anzeigefeld() {
		ZN_AnzeigefeldImpl zN_Anzeigefeld = new ZN_AnzeigefeldImpl();
		return zN_Anzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Allg_AttributeGroup createZN_Anzeigefeld_Allg_AttributeGroup() {
		ZN_Anzeigefeld_Allg_AttributeGroupImpl zN_Anzeigefeld_Allg_AttributeGroup = new ZN_Anzeigefeld_Allg_AttributeGroupImpl();
		return zN_Anzeigefeld_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Bezeichnung_AttributeGroup createZN_Anzeigefeld_Bezeichnung_AttributeGroup() {
		ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl zN_Anzeigefeld_Bezeichnung_AttributeGroup = new ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl();
		return zN_Anzeigefeld_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Loeschkriterium_TypeClass createZN_Anzeigefeld_Loeschkriterium_TypeClass() {
		ZN_Anzeigefeld_Loeschkriterium_TypeClassImpl zN_Anzeigefeld_Loeschkriterium_TypeClass = new ZN_Anzeigefeld_Loeschkriterium_TypeClassImpl();
		return zN_Anzeigefeld_Loeschkriterium_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Feld_Ohne_Anzeige_TypeClass createZN_Feld_Ohne_Anzeige_TypeClass() {
		ZN_Feld_Ohne_Anzeige_TypeClassImpl zN_Feld_Ohne_Anzeige_TypeClass = new ZN_Feld_Ohne_Anzeige_TypeClassImpl();
		return zN_Feld_Ohne_Anzeige_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Fortschalt_Krit_Druck_AttributeGroup createZN_Fortschalt_Krit_Druck_AttributeGroup() {
		ZN_Fortschalt_Krit_Druck_AttributeGroupImpl zN_Fortschalt_Krit_Druck_AttributeGroup = new ZN_Fortschalt_Krit_Druck_AttributeGroupImpl();
		return zN_Fortschalt_Krit_Druck_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Fortschalt_Krit_Schalt_AttributeGroup createZN_Fortschalt_Krit_Schalt_AttributeGroup() {
		ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl zN_Fortschalt_Krit_Schalt_AttributeGroup = new ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl();
		return zN_Fortschalt_Krit_Schalt_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Fortschalt_Kriterium createZN_Fortschalt_Kriterium() {
		ZN_Fortschalt_KriteriumImpl zN_Fortschalt_Kriterium = new ZN_Fortschalt_KriteriumImpl();
		return zN_Fortschalt_Kriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Modem_TypeClass createZN_Modem_TypeClass() {
		ZN_Modem_TypeClassImpl zN_Modem_TypeClass = new ZN_Modem_TypeClassImpl();
		return zN_Modem_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Schaltkriterium_TypeClass createZN_Schaltkriterium_TypeClass() {
		ZN_Schaltkriterium_TypeClassImpl zN_Schaltkriterium_TypeClass = new ZN_Schaltkriterium_TypeClassImpl();
		return zN_Schaltkriterium_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Telegramm_84_Zuordnung createZN_Telegramm_84_Zuordnung() {
		ZN_Telegramm_84_ZuordnungImpl zN_Telegramm_84_Zuordnung = new ZN_Telegramm_84_ZuordnungImpl();
		return zN_Telegramm_84_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Telegramm_85_Zuordnung createZN_Telegramm_85_Zuordnung() {
		ZN_Telegramm_85_ZuordnungImpl zN_Telegramm_85_Zuordnung = new ZN_Telegramm_85_ZuordnungImpl();
		return zN_Telegramm_85_Zuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation createZN_Unterstation() {
		ZN_UnterstationImpl zN_Unterstation = new ZN_UnterstationImpl();
		return zN_Unterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation_Allg_AttributeGroup createZN_Unterstation_Allg_AttributeGroup() {
		ZN_Unterstation_Allg_AttributeGroupImpl zN_Unterstation_Allg_AttributeGroup = new ZN_Unterstation_Allg_AttributeGroupImpl();
		return zN_Unterstation_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation_Bf_Nr_AttributeGroup createZN_Unterstation_Bf_Nr_AttributeGroup() {
		ZN_Unterstation_Bf_Nr_AttributeGroupImpl zN_Unterstation_Bf_Nr_AttributeGroup = new ZN_Unterstation_Bf_Nr_AttributeGroupImpl();
		return zN_Unterstation_Bf_Nr_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_ZBS createZN_ZBS() {
		ZN_ZBSImpl zN_ZBS = new ZN_ZBSImpl();
		return zN_ZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugvorbereitungsmeldung_TypeClass createZugvorbereitungsmeldung_TypeClass() {
		Zugvorbereitungsmeldung_TypeClassImpl zugvorbereitungsmeldung_TypeClass = new Zugvorbereitungsmeldung_TypeClassImpl();
		return zugvorbereitungsmeldung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAkustikAnbAnn createENUMAkustikAnbAnnFromString(EDataType eDataType, String initialValue) {
		ENUMAkustikAnbAnn result = ENUMAkustikAnbAnn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAkustikAnbAnnToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAkustikSonst createENUMAkustikSonstFromString(EDataType eDataType, String initialValue) {
		ENUMAkustikSonst result = ENUMAkustikSonst.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAkustikSonstToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBfKennung createENUMBfKennungFromString(EDataType eDataType, String initialValue) {
		ENUMBfKennung result = ENUMBfKennung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBfKennungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFunktionalitaetAnzeigefeld createENUMFunktionalitaetAnzeigefeldFromString(EDataType eDataType, String initialValue) {
		ENUMFunktionalitaetAnzeigefeld result = ENUMFunktionalitaetAnzeigefeld.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFunktionalitaetAnzeigefeldToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZBSSchnittstelle createENUMZBSSchnittstelleFromString(EDataType eDataType, String initialValue) {
		ENUMZBSSchnittstelle result = ENUMZBSSchnittstelle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZBSSchnittstelleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNAnlagentyp createENUMZNAnlagentypFromString(EDataType eDataType, String initialValue) {
		ENUMZNAnlagentyp result = ENUMZNAnlagentyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNAnlagentypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNAnzeigefeldLoeschkriterium createENUMZNAnzeigefeldLoeschkriteriumFromString(EDataType eDataType, String initialValue) {
		ENUMZNAnzeigefeldLoeschkriterium result = ENUMZNAnzeigefeldLoeschkriterium.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNAnzeigefeldLoeschkriteriumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNModem createENUMZNModemFromString(EDataType eDataType, String initialValue) {
		ENUMZNModem result = ENUMZNModem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNModemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNSchaltkriterium createENUMZNSchaltkriteriumFromString(EDataType eDataType, String initialValue) {
		ENUMZNSchaltkriterium result = ENUMZNSchaltkriterium.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNSchaltkriteriumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnschlussnummer_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnschlussnummer_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBesonderes_Schaltkriterium_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBesonderes_Schaltkriterium_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_Besondere_Anlage_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_Besondere_Anlage_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createBf_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBf_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAkustikAnbAnn createENUMAkustikAnbAnnObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAkustikAnbAnnFromString(ZugnummernmeldeanlagePackage.Literals.ENUM_AKUSTIK_ANB_ANN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAkustikAnbAnnObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAkustikAnbAnnToString(ZugnummernmeldeanlagePackage.Literals.ENUM_AKUSTIK_ANB_ANN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAkustikSonst createENUMAkustikSonstObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAkustikSonstFromString(ZugnummernmeldeanlagePackage.Literals.ENUM_AKUSTIK_SONST, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAkustikSonstObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAkustikSonstToString(ZugnummernmeldeanlagePackage.Literals.ENUM_AKUSTIK_SONST, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBfKennung createENUMBfKennungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBfKennungFromString(ZugnummernmeldeanlagePackage.Literals.ENUM_BF_KENNUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBfKennungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBfKennungToString(ZugnummernmeldeanlagePackage.Literals.ENUM_BF_KENNUNG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMFunktionalitaetAnzeigefeld createENUMFunktionalitaetAnzeigefeldObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMFunktionalitaetAnzeigefeldFromString(ZugnummernmeldeanlagePackage.Literals.ENUM_FUNKTIONALITAET_ANZEIGEFELD, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMFunktionalitaetAnzeigefeldObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMFunktionalitaetAnzeigefeldToString(ZugnummernmeldeanlagePackage.Literals.ENUM_FUNKTIONALITAET_ANZEIGEFELD, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZBSSchnittstelle createENUMZBSSchnittstelleObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZBSSchnittstelleFromString(ZugnummernmeldeanlagePackage.Literals.ENUMZBS_SCHNITTSTELLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZBSSchnittstelleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZBSSchnittstelleToString(ZugnummernmeldeanlagePackage.Literals.ENUMZBS_SCHNITTSTELLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNAnlagentyp createENUMZNAnlagentypObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZNAnlagentypFromString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_ANLAGENTYP, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNAnlagentypObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZNAnlagentypToString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_ANLAGENTYP, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNAnzeigefeldLoeschkriterium createENUMZNAnzeigefeldLoeschkriteriumObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZNAnzeigefeldLoeschkriteriumFromString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNAnzeigefeldLoeschkriteriumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZNAnzeigefeldLoeschkriteriumToString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_ANZEIGEFELD_LOESCHKRITERIUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNModem createENUMZNModemObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZNModemFromString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_MODEM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNModemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZNModemToString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_MODEM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMZNSchaltkriterium createENUMZNSchaltkriteriumObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMZNSchaltkriteriumFromString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_SCHALTKRITERIUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMZNSchaltkriteriumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMZNSchaltkriteriumToString(ZugnummernmeldeanlagePackage.Literals.ENUMZN_SCHALTKRITERIUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIP_Adresse_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIP_Adresse_TypeToString(EDataType eDataType, Object instanceValue) {
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
	public BigInteger createUnterstation_Max_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterstation_Max_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUnterstation_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnterstation_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.ZEICHENKETTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createVerzoegerung_Manuell_Loeschung_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.SEKUNDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerzoegerung_Manuell_Loeschung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.SEKUNDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZBS_Adresse_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZBS_Adresse_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZLV_Bus_Nr_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZLV_Bus_Nr_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZN_A_Bedienbezeichner_Frei_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZN_A_Bedienbezeichner_Frei_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createZN_A_Bezeichner_TypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZN_A_Bezeichner_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZugnummernmeldeanlagePackage getZugnummernmeldeanlagePackage() {
		return (ZugnummernmeldeanlagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZugnummernmeldeanlagePackage getPackage() {
		return ZugnummernmeldeanlagePackage.eINSTANCE;
	}

} //ZugnummernmeldeanlageFactoryImpl
