/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.model.model1902.Ansteuerung_Element.*;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ansteuerung_ElementFactoryImpl extends EFactoryImpl implements Ansteuerung_ElementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ansteuerung_ElementFactory init() {
		try {
			Ansteuerung_ElementFactory theAnsteuerung_ElementFactory = (Ansteuerung_ElementFactory)EPackage.Registry.INSTANCE.getEFactory(Ansteuerung_ElementPackage.eNS_URI);
			if (theAnsteuerung_ElementFactory != null) {
				return theAnsteuerung_ElementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ansteuerung_ElementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansteuerung_ElementFactoryImpl() {
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
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP: return createAEA_Allg_AttributeGroup();
			case Ansteuerung_ElementPackage.AEA_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP: return createAEA_Energieversorgung_AttributeGroup();
			case Ansteuerung_ElementPackage.AEA_GFK_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: return createAEA_GFK_IP_Adressblock_AttributeGroup();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG: return createAussenelementansteuerung();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_ART_TYPE_CLASS: return createAussenelementansteuerung_Art_TypeClass();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP: return createAussenelementansteuerung_Bezeichnung_AttributeGroup();
			case Ansteuerung_ElementPackage.BANDBREITE_TYPE_CLASS: return createBandbreite_TypeClass();
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS: return createBauart_TypeClass();
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE_CLASS: return createBezeichnung_AEA_TypeClass();
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE_CLASS: return createBezeichnung_ESTW_ZE_TypeClass();
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE_CLASS: return createBezeichnung_TSO_TypeClass();
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_ERSATZ_TYPE_CLASS: return createEnergieversorgung_Art_Ersatz_TypeClass();
			case Ansteuerung_ElementPackage.ENERGIEVERSORGUNG_ART_TYPE_CLASS: return createEnergieversorgung_Art_TypeClass();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT: return createESTW_Zentraleinheit();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP: return createESTW_Zentraleinheit_Allg_AttributeGroup();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createESTW_Zentraleinheit_Bezeichnung_AttributeGroup();
			case Ansteuerung_ElementPackage.GFK_KATEGORIE_TYPE_CLASS: return createGFK_Kategorie_TypeClass();
			case Ansteuerung_ElementPackage.HERSTELLER_TYPE_CLASS: return createHersteller_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE_CLASS: return createIP_Adressblock_Blau_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE_CLASS: return createIP_Adressblock_Blau_V4_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE_CLASS: return createIP_Adressblock_Blau_V6_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE_CLASS: return createIP_Adressblock_Grau_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE_CLASS: return createIP_Adressblock_Grau_V4_TypeClass();
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE_CLASS: return createIP_Adressblock_Grau_V6_TypeClass();
			case Ansteuerung_ElementPackage.MEDIUM_ART_TYPE_CLASS: return createMedium_Art_TypeClass();
			case Ansteuerung_ElementPackage.NETZ_ART_TYPE_CLASS: return createNetz_Art_TypeClass();
			case Ansteuerung_ElementPackage.REGIONALBEREICH_TYPE_CLASS: return createRegionalbereich_TypeClass();
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE_CLASS: return createStandort_Beschreibung_TypeClass();
			case Ansteuerung_ElementPackage.STELL_BEREICH: return createStell_Bereich();
			case Ansteuerung_ElementPackage.STELLELEMENT: return createStellelement();
			case Ansteuerung_ElementPackage.TECHNIK_ART_TYPE_CLASS: return createTechnik_Art_TypeClass();
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE_CLASS: return createTechnik_Beschreibung_TypeClass();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT: return createTechnik_Standort();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP: return createTechnik_Standort_Bezeichnung_AttributeGroup();
			case Ansteuerung_ElementPackage.TSO_IP_AB_TEILSYSTEM_ATTRIBUTE_GROUP: return createTSO_IP_AB_Teilsystem_AttributeGroup();
			case Ansteuerung_ElementPackage.TSO_IP_ADRESSBLOCK_ATTRIBUTE_GROUP: return createTSO_IP_Adressblock_AttributeGroup();
			case Ansteuerung_ElementPackage.TSO_TEILSYSTEM_ART_TYPE_CLASS: return createTSO_Teilsystem_Art_TypeClass();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG: return createUebertragungsweg();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_ART_TYPE_CLASS: return createUebertragungsweg_Art_TypeClass();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG_TECHNIK_ATTRIBUTE_GROUP: return createUebertragungsweg_Technik_AttributeGroup();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG: return createUnterbringung();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ALLG_ATTRIBUTE_GROUP: return createUnterbringung_Allg_AttributeGroup();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_ART_TYPE_CLASS: return createUnterbringung_Art_TypeClass();
			case Ansteuerung_ElementPackage.UNTERBRINGUNG_BEFESTIGUNG_TYPE_CLASS: return createUnterbringung_Befestigung_TypeClass();
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
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART:
				return createENUMAussenelementansteuerungArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE:
				return createENUMBandbreiteFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMEV_ART:
				return createENUMEVArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE:
				return createENUMGFKKategorieFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART:
				return createENUMMediumArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART:
				return createENUMNetzArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART:
				return createENUMTechnikArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART:
				return createENUMTSOTeilsystemArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART:
				return createENUMUebertragungswegArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART:
				return createENUMUnterbringungArtFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG:
				return createENUMUnterbringungBefestigungFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.BAUART_TYPE:
				return createBauart_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE:
				return createBezeichnung_AEA_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE:
				return createBezeichnung_ESTW_ZE_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE:
				return createBezeichnung_TSO_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJECT:
				return createENUMAussenelementansteuerungArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE_OBJECT:
				return createENUMBandbreiteObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMEV_ART_OBJECT:
				return createENUMEVArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE_OBJECT:
				return createENUMGFKKategorieObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART_OBJECT:
				return createENUMMediumArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART_OBJECT:
				return createENUMNetzArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART_OBJECT:
				return createENUMTechnikArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART_OBJECT:
				return createENUMTSOTeilsystemArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART_OBJECT:
				return createENUMUebertragungswegArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART_OBJECT:
				return createENUMUnterbringungArtObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG_OBJECT:
				return createENUMUnterbringungBefestigungObjectFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return createIP_Adressblock_Blau_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return createIP_Adressblock_Blau_V4_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return createIP_Adressblock_Blau_V6_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return createIP_Adressblock_Grau_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return createIP_Adressblock_Grau_V4_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return createIP_Adressblock_Grau_V6_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE:
				return createStandort_Beschreibung_TypeFromString(eDataType, initialValue);
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE:
				return createTechnik_Beschreibung_TypeFromString(eDataType, initialValue);
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
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART:
				return convertENUMAussenelementansteuerungArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE:
				return convertENUMBandbreiteToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMEV_ART:
				return convertENUMEVArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE:
				return convertENUMGFKKategorieToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART:
				return convertENUMMediumArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART:
				return convertENUMNetzArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART:
				return convertENUMTechnikArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART:
				return convertENUMTSOTeilsystemArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART:
				return convertENUMUebertragungswegArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART:
				return convertENUMUnterbringungArtToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG:
				return convertENUMUnterbringungBefestigungToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.BAUART_TYPE:
				return convertBauart_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_AEA_TYPE:
				return convertBezeichnung_AEA_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_ESTW_ZE_TYPE:
				return convertBezeichnung_ESTW_ZE_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.BEZEICHNUNG_TSO_TYPE:
				return convertBezeichnung_TSO_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_AUSSENELEMENTANSTEUERUNG_ART_OBJECT:
				return convertENUMAussenelementansteuerungArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_BANDBREITE_OBJECT:
				return convertENUMBandbreiteObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMEV_ART_OBJECT:
				return convertENUMEVArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMGFK_KATEGORIE_OBJECT:
				return convertENUMGFKKategorieObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_MEDIUM_ART_OBJECT:
				return convertENUMMediumArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_NETZ_ART_OBJECT:
				return convertENUMNetzArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_TECHNIK_ART_OBJECT:
				return convertENUMTechnikArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUMTSO_TEILSYSTEM_ART_OBJECT:
				return convertENUMTSOTeilsystemArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UEBERTRAGUNGSWEG_ART_OBJECT:
				return convertENUMUebertragungswegArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_ART_OBJECT:
				return convertENUMUnterbringungArtObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.ENUM_UNTERBRINGUNG_BEFESTIGUNG_OBJECT:
				return convertENUMUnterbringungBefestigungObjectToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_TYPE:
				return convertIP_Adressblock_Blau_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V4_TYPE:
				return convertIP_Adressblock_Blau_V4_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_BLAU_V6_TYPE:
				return convertIP_Adressblock_Blau_V6_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_TYPE:
				return convertIP_Adressblock_Grau_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V4_TYPE:
				return convertIP_Adressblock_Grau_V4_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.IP_ADRESSBLOCK_GRAU_V6_TYPE:
				return convertIP_Adressblock_Grau_V6_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.STANDORT_BESCHREIBUNG_TYPE:
				return convertStandort_Beschreibung_TypeToString(eDataType, instanceValue);
			case Ansteuerung_ElementPackage.TECHNIK_BESCHREIBUNG_TYPE:
				return convertTechnik_Beschreibung_TypeToString(eDataType, instanceValue);
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
	public AEA_Allg_AttributeGroup createAEA_Allg_AttributeGroup() {
		AEA_Allg_AttributeGroupImpl aeA_Allg_AttributeGroup = new AEA_Allg_AttributeGroupImpl();
		return aeA_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_Energieversorgung_AttributeGroup createAEA_Energieversorgung_AttributeGroup() {
		AEA_Energieversorgung_AttributeGroupImpl aeA_Energieversorgung_AttributeGroup = new AEA_Energieversorgung_AttributeGroupImpl();
		return aeA_Energieversorgung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_GFK_IP_Adressblock_AttributeGroup createAEA_GFK_IP_Adressblock_AttributeGroup() {
		AEA_GFK_IP_Adressblock_AttributeGroupImpl aeA_GFK_IP_Adressblock_AttributeGroup = new AEA_GFK_IP_Adressblock_AttributeGroupImpl();
		return aeA_GFK_IP_Adressblock_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung createAussenelementansteuerung() {
		AussenelementansteuerungImpl aussenelementansteuerung = new AussenelementansteuerungImpl();
		return aussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung_Art_TypeClass createAussenelementansteuerung_Art_TypeClass() {
		Aussenelementansteuerung_Art_TypeClassImpl aussenelementansteuerung_Art_TypeClass = new Aussenelementansteuerung_Art_TypeClassImpl();
		return aussenelementansteuerung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung_Bezeichnung_AttributeGroup createAussenelementansteuerung_Bezeichnung_AttributeGroup() {
		Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl aussenelementansteuerung_Bezeichnung_AttributeGroup = new Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl();
		return aussenelementansteuerung_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandbreite_TypeClass createBandbreite_TypeClass() {
		Bandbreite_TypeClassImpl bandbreite_TypeClass = new Bandbreite_TypeClassImpl();
		return bandbreite_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauart_TypeClass createBauart_TypeClass() {
		Bauart_TypeClassImpl bauart_TypeClass = new Bauart_TypeClassImpl();
		return bauart_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_AEA_TypeClass createBezeichnung_AEA_TypeClass() {
		Bezeichnung_AEA_TypeClassImpl bezeichnung_AEA_TypeClass = new Bezeichnung_AEA_TypeClassImpl();
		return bezeichnung_AEA_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ESTW_ZE_TypeClass createBezeichnung_ESTW_ZE_TypeClass() {
		Bezeichnung_ESTW_ZE_TypeClassImpl bezeichnung_ESTW_ZE_TypeClass = new Bezeichnung_ESTW_ZE_TypeClassImpl();
		return bezeichnung_ESTW_ZE_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_TSO_TypeClass createBezeichnung_TSO_TypeClass() {
		Bezeichnung_TSO_TypeClassImpl bezeichnung_TSO_TypeClass = new Bezeichnung_TSO_TypeClassImpl();
		return bezeichnung_TSO_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass createEnergieversorgung_Art_Ersatz_TypeClass() {
		Energieversorgung_Art_Ersatz_TypeClassImpl energieversorgung_Art_Ersatz_TypeClass = new Energieversorgung_Art_Ersatz_TypeClassImpl();
		return energieversorgung_Art_Ersatz_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_TypeClass createEnergieversorgung_Art_TypeClass() {
		Energieversorgung_Art_TypeClassImpl energieversorgung_Art_TypeClass = new Energieversorgung_Art_TypeClassImpl();
		return energieversorgung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit createESTW_Zentraleinheit() {
		ESTW_ZentraleinheitImpl estW_Zentraleinheit = new ESTW_ZentraleinheitImpl();
		return estW_Zentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Allg_AttributeGroup createESTW_Zentraleinheit_Allg_AttributeGroup() {
		ESTW_Zentraleinheit_Allg_AttributeGroupImpl estW_Zentraleinheit_Allg_AttributeGroup = new ESTW_Zentraleinheit_Allg_AttributeGroupImpl();
		return estW_Zentraleinheit_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Bezeichnung_AttributeGroup createESTW_Zentraleinheit_Bezeichnung_AttributeGroup() {
		ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl estW_Zentraleinheit_Bezeichnung_AttributeGroup = new ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl();
		return estW_Zentraleinheit_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFK_Kategorie_TypeClass createGFK_Kategorie_TypeClass() {
		GFK_Kategorie_TypeClassImpl gfK_Kategorie_TypeClass = new GFK_Kategorie_TypeClassImpl();
		return gfK_Kategorie_TypeClass;
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
	public Medium_Art_TypeClass createMedium_Art_TypeClass() {
		Medium_Art_TypeClassImpl medium_Art_TypeClass = new Medium_Art_TypeClassImpl();
		return medium_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netz_Art_TypeClass createNetz_Art_TypeClass() {
		Netz_Art_TypeClassImpl netz_Art_TypeClass = new Netz_Art_TypeClassImpl();
		return netz_Art_TypeClass;
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
	public Standort_Beschreibung_TypeClass createStandort_Beschreibung_TypeClass() {
		Standort_Beschreibung_TypeClassImpl standort_Beschreibung_TypeClass = new Standort_Beschreibung_TypeClassImpl();
		return standort_Beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stell_Bereich createStell_Bereich() {
		Stell_BereichImpl stell_Bereich = new Stell_BereichImpl();
		return stell_Bereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stellelement createStellelement() {
		StellelementImpl stellelement = new StellelementImpl();
		return stellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Art_TypeClass createTechnik_Art_TypeClass() {
		Technik_Art_TypeClassImpl technik_Art_TypeClass = new Technik_Art_TypeClassImpl();
		return technik_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Beschreibung_TypeClass createTechnik_Beschreibung_TypeClass() {
		Technik_Beschreibung_TypeClassImpl technik_Beschreibung_TypeClass = new Technik_Beschreibung_TypeClassImpl();
		return technik_Beschreibung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Standort createTechnik_Standort() {
		Technik_StandortImpl technik_Standort = new Technik_StandortImpl();
		return technik_Standort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Standort_Bezeichnung_AttributeGroup createTechnik_Standort_Bezeichnung_AttributeGroup() {
		Technik_Standort_Bezeichnung_AttributeGroupImpl technik_Standort_Bezeichnung_AttributeGroup = new Technik_Standort_Bezeichnung_AttributeGroupImpl();
		return technik_Standort_Bezeichnung_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSO_IP_AB_Teilsystem_AttributeGroup createTSO_IP_AB_Teilsystem_AttributeGroup() {
		TSO_IP_AB_Teilsystem_AttributeGroupImpl tsO_IP_AB_Teilsystem_AttributeGroup = new TSO_IP_AB_Teilsystem_AttributeGroupImpl();
		return tsO_IP_AB_Teilsystem_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSO_IP_Adressblock_AttributeGroup createTSO_IP_Adressblock_AttributeGroup() {
		TSO_IP_Adressblock_AttributeGroupImpl tsO_IP_Adressblock_AttributeGroup = new TSO_IP_Adressblock_AttributeGroupImpl();
		return tsO_IP_Adressblock_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSO_Teilsystem_Art_TypeClass createTSO_Teilsystem_Art_TypeClass() {
		TSO_Teilsystem_Art_TypeClassImpl tsO_Teilsystem_Art_TypeClass = new TSO_Teilsystem_Art_TypeClassImpl();
		return tsO_Teilsystem_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg createUebertragungsweg() {
		UebertragungswegImpl uebertragungsweg = new UebertragungswegImpl();
		return uebertragungsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Art_TypeClass createUebertragungsweg_Art_TypeClass() {
		Uebertragungsweg_Art_TypeClassImpl uebertragungsweg_Art_TypeClass = new Uebertragungsweg_Art_TypeClassImpl();
		return uebertragungsweg_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Technik_AttributeGroup createUebertragungsweg_Technik_AttributeGroup() {
		Uebertragungsweg_Technik_AttributeGroupImpl uebertragungsweg_Technik_AttributeGroup = new Uebertragungsweg_Technik_AttributeGroupImpl();
		return uebertragungsweg_Technik_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung createUnterbringung() {
		UnterbringungImpl unterbringung = new UnterbringungImpl();
		return unterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Allg_AttributeGroup createUnterbringung_Allg_AttributeGroup() {
		Unterbringung_Allg_AttributeGroupImpl unterbringung_Allg_AttributeGroup = new Unterbringung_Allg_AttributeGroupImpl();
		return unterbringung_Allg_AttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Art_TypeClass createUnterbringung_Art_TypeClass() {
		Unterbringung_Art_TypeClassImpl unterbringung_Art_TypeClass = new Unterbringung_Art_TypeClassImpl();
		return unterbringung_Art_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung_Befestigung_TypeClass createUnterbringung_Befestigung_TypeClass() {
		Unterbringung_Befestigung_TypeClassImpl unterbringung_Befestigung_TypeClass = new Unterbringung_Befestigung_TypeClassImpl();
		return unterbringung_Befestigung_TypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAussenelementansteuerungArt createENUMAussenelementansteuerungArtFromString(EDataType eDataType, String initialValue) {
		ENUMAussenelementansteuerungArt result = ENUMAussenelementansteuerungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAussenelementansteuerungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBandbreite createENUMBandbreiteFromString(EDataType eDataType, String initialValue) {
		ENUMBandbreite result = ENUMBandbreite.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBandbreiteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEVArt createENUMEVArtFromString(EDataType eDataType, String initialValue) {
		ENUMEVArt result = ENUMEVArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEVArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGFKKategorie createENUMGFKKategorieFromString(EDataType eDataType, String initialValue) {
		ENUMGFKKategorie result = ENUMGFKKategorie.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGFKKategorieToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMediumArt createENUMMediumArtFromString(EDataType eDataType, String initialValue) {
		ENUMMediumArt result = ENUMMediumArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMediumArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNetzArt createENUMNetzArtFromString(EDataType eDataType, String initialValue) {
		ENUMNetzArt result = ENUMNetzArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNetzArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTechnikArt createENUMTechnikArtFromString(EDataType eDataType, String initialValue) {
		ENUMTechnikArt result = ENUMTechnikArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTechnikArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTSOTeilsystemArt createENUMTSOTeilsystemArtFromString(EDataType eDataType, String initialValue) {
		ENUMTSOTeilsystemArt result = ENUMTSOTeilsystemArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTSOTeilsystemArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUebertragungswegArt createENUMUebertragungswegArtFromString(EDataType eDataType, String initialValue) {
		ENUMUebertragungswegArt result = ENUMUebertragungswegArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUebertragungswegArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUnterbringungArt createENUMUnterbringungArtFromString(EDataType eDataType, String initialValue) {
		ENUMUnterbringungArt result = ENUMUnterbringungArt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUnterbringungArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUnterbringungBefestigung createENUMUnterbringungBefestigungFromString(EDataType eDataType, String initialValue) {
		ENUMUnterbringungBefestigung result = ENUMUnterbringungBefestigung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUnterbringungBefestigungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBauart_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBauart_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_AEA_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_AEA_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_ESTW_ZE_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_ESTW_ZE_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBezeichnung_TSO_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBezeichnung_TSO_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMAussenelementansteuerungArt createENUMAussenelementansteuerungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMAussenelementansteuerungArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_AUSSENELEMENTANSTEUERUNG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMAussenelementansteuerungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMAussenelementansteuerungArtToString(Ansteuerung_ElementPackage.Literals.ENUM_AUSSENELEMENTANSTEUERUNG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMBandbreite createENUMBandbreiteObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMBandbreiteFromString(Ansteuerung_ElementPackage.Literals.ENUM_BANDBREITE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMBandbreiteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMBandbreiteToString(Ansteuerung_ElementPackage.Literals.ENUM_BANDBREITE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMEVArt createENUMEVArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMEVArtFromString(Ansteuerung_ElementPackage.Literals.ENUMEV_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMEVArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMEVArtToString(Ansteuerung_ElementPackage.Literals.ENUMEV_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMGFKKategorie createENUMGFKKategorieObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMGFKKategorieFromString(Ansteuerung_ElementPackage.Literals.ENUMGFK_KATEGORIE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMGFKKategorieObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMGFKKategorieToString(Ansteuerung_ElementPackage.Literals.ENUMGFK_KATEGORIE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMMediumArt createENUMMediumArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMMediumArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_MEDIUM_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMMediumArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMMediumArtToString(Ansteuerung_ElementPackage.Literals.ENUM_MEDIUM_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMNetzArt createENUMNetzArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMNetzArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_NETZ_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMNetzArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMNetzArtToString(Ansteuerung_ElementPackage.Literals.ENUM_NETZ_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTechnikArt createENUMTechnikArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTechnikArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_TECHNIK_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTechnikArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTechnikArtToString(Ansteuerung_ElementPackage.Literals.ENUM_TECHNIK_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMTSOTeilsystemArt createENUMTSOTeilsystemArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMTSOTeilsystemArtFromString(Ansteuerung_ElementPackage.Literals.ENUMTSO_TEILSYSTEM_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMTSOTeilsystemArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMTSOTeilsystemArtToString(Ansteuerung_ElementPackage.Literals.ENUMTSO_TEILSYSTEM_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUebertragungswegArt createENUMUebertragungswegArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUebertragungswegArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_UEBERTRAGUNGSWEG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUebertragungswegArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUebertragungswegArtToString(Ansteuerung_ElementPackage.Literals.ENUM_UEBERTRAGUNGSWEG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUnterbringungArt createENUMUnterbringungArtObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUnterbringungArtFromString(Ansteuerung_ElementPackage.Literals.ENUM_UNTERBRINGUNG_ART, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUnterbringungArtObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUnterbringungArtToString(Ansteuerung_ElementPackage.Literals.ENUM_UNTERBRINGUNG_ART, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMUnterbringungBefestigung createENUMUnterbringungBefestigungObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMUnterbringungBefestigungFromString(Ansteuerung_ElementPackage.Literals.ENUM_UNTERBRINGUNG_BEFESTIGUNG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMUnterbringungBefestigungObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMUnterbringungBefestigungToString(Ansteuerung_ElementPackage.Literals.ENUM_UNTERBRINGUNG_BEFESTIGUNG, instanceValue);
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
	public String createStandort_Beschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandort_Beschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTechnik_Beschreibung_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)BasisTypenFactory.eINSTANCE.createFromString(BasisTypenPackage.Literals.TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTechnik_Beschreibung_TypeToString(EDataType eDataType, Object instanceValue) {
		return BasisTypenFactory.eINSTANCE.convertToString(BasisTypenPackage.Literals.TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ansteuerung_ElementPackage getAnsteuerung_ElementPackage() {
		return (Ansteuerung_ElementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ansteuerung_ElementPackage getPackage() {
		return Ansteuerung_ElementPackage.eINSTANCE;
	}

} //Ansteuerung_ElementFactoryImpl
